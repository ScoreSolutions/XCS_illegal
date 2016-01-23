Imports LinqDB.Common.Utilities

Partial Public Class ucPayFine
    Inherits System.Web.UI.UserControl

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Public Sub FillInData(ByVal TrackNo As String)
        lblTrackNo.Text = TrackNo

        Dim dt As DataTable = GetDataFromPayFine(TrackNo)
        If dt.Rows.Count > 0 Then
            Dim dr As DataRow = dt.Rows(0)
            lblLegislationID.Text = dr("legislation_id")
            txtPayDate.DateValue = Convert.ToDateTime(dr("pay_date"))
            lblCompareCaseNo.Text = dr("compare_case_no")
            lblCaseTotalFine.Text = dr("case_total_fine")

            Dim lDt As DataTable = GetArrestLawbreakerList(TrackNo)
            If lDt.Rows.Count > 0 Then
                lDt.Columns.Add("seq")
                For i As Integer = 0 To lDt.Rows.Count - 1
                    lDt.Rows(i)("seq") = (i + 1).ToString
                Next

                gvArrestLawbreaker.DataSource = lDt
                gvArrestLawbreaker.DataBind()
            End If
        End If
        dt.Dispose()
    End Sub
    Private Function GetDataFromPayFine(ByVal TrackNo As String) As DataTable
        Dim sql As String = "select cc.pay_date, cc.compare_case_no, cc.case_total_fine, " & vbNewLine
        sql += " aa.legislation_id" & vbNewLine
        sql += " from compare_case cc " & vbNewLine
        sql += " inner join application_arrest aa on aa.track_no=cc.track_no " & vbNewLine
        sql += " where cc.track_no='" & TrackNo & "'"

        Dim dt As DataTable = Config.ExcuteTable(sql)

        Return dt
    End Function

    Private Function GetArrestLawbreakerList(ByVal TrackNo As String) As DataTable
        Dim sql As String = " select aal.id, pke_arrest.getLawbreakerName(aal.id) lawbreaker_name, "
        sql += " aal.fine, aal.book_no, aal.inv_no "
        Sql += " from application_arrest_lawbreaker aal"
        sql += " where aal.track_no = '" & TrackNo & "'"

        Dim dt As DataTable = Config.ExcuteTable(sql)
        Return dt
    End Function

    Public Function SaveValidate() As Boolean
        If txtPayDate.DateValue.Year = 1 Then
            Config.SetAlert("กรุณาระบุวันที่รับชำระ", Me.Page, txtPayDate.ClientID)
            Return False
        End If

        For Each grv As GridViewRow In gvArrestLawbreaker.Rows
            Dim txtBookNo As TextBox = DirectCast(grv.FindControl("txtInvBookNo"), TextBox)
            Dim txtInvNo As TextBox = DirectCast(grv.FindControl("txtInvNo"), TextBox)

            If txtBookNo.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุใบเสร็จเล่มที่", Me.Page, txtBookNo.ClientID)
                Return False
            End If
            If txtInvNo.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุใบเสร็จเลขที่", Me.Page, txtInvNo.ClientID)
                Return False
            End If
        Next

        Return True
    End Function

    Public Function SavePayFine(ByVal UserIDCard As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            Dim sql As String = "select id from compare_case where track_no ='" & lblTrackNo.Text.Trim & "' and pay_date is not null and rownum=1"
            Dim dt As DataTable = Config.ExcuteTable(sql, trans)

            If dt.Rows.Count > 0 Then
                Dim vPayDate As String = txtPayDate.DateValue.ToString("yyyy-MM-dd", New Globalization.CultureInfo("en-US")) & " 00:00:00"
                sql = " update compare_case "
                sql += " set pay_date = to_date('" & vPayDate & "','yyyy-mm-dd hh24:mi:ss')"
                sql += " where track_no='" & lblTrackNo.Text & "'"

                ret = Config.ExcuteNonQuery(sql, trans)
                If ret = True Then
                    For Each grv As GridViewRow In gvArrestLawbreaker.Rows
                        Dim txtBookNo As TextBox = DirectCast(grv.FindControl("txtInvBookNo"), TextBox)
                        Dim txtInvNo As TextBox = DirectCast(grv.FindControl("txtInvNo"), TextBox)
                        Dim vId As String = grv.Cells(1).Text

                        If vId.Trim <> "" And vId.Trim <> "&nbsp;" Then
                            sql = " update application_arrest_lawbreaker " & vbNewLine
                            sql += " set book_no='" & txtBookNo.Text & "'" & vbNewLine
                            sql += ", inv_no = '" & txtInvNo.Text & "'" & vbNewLine
                            sql += " where id = '" & vId & "'"

                            ret = Config.ExcuteNonQuery(sql, trans)
                        Else
                            ret = False
                        End If
                        If ret = False Then
                            Exit For
                        End If
                    Next
                End If
            Else
                ret = True
            End If
            dt.Dispose()
        Catch ex As Exception
            ret = False
        End Try

        Return ret
    End Function

    Public Sub ClearForm()
        txtPayDate.ClearDate()
        lblCompareCaseNo.Text = ""
        lblCaseTotalFine.Text = ""
        gvArrestLawbreaker.DataSource = Nothing
        gvArrestLawbreaker.DataBind()
    End Sub
End Class