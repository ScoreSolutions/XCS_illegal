Imports LinqDB.Common.Utilities

Partial Public Class ucBookImpeachment
    Inherits System.Web.UI.UserControl

    Public ReadOnly Property CaseQuality() As String
        Get
            Return rdiCaseQuality.SelectedValue
        End Get
    End Property


    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            txtCaseNo1.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtCaseNo1.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtCaseNo2.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtCaseNo2.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")
        End If
    End Sub

    Public Function SaveValidate() As Boolean
        If txtCaseNo1.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุเลขที่คดี", Me.Page, txtCaseNo1.ClientID)
            Return False
        End If
        If txtCaseNo2.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุปีที่คดี", Me.Page, txtCaseNo2.ClientID)
            Return False
        End If
        If txtCaseDate.TxtBox.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุวันที่รับคดี", Me.Page, txtCaseDate.ClientID)
            Return False
        End If
        If txtCaseTime.TimeText.Trim = "" Then
            Config.SetAlert("กรุณาระบุเวลาที่รับคดี", Me.Page, txtCaseTime.ClientID)
            Return False
        End If
        If lblSueStaffID.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุชื่อเจ้าหน้าที่ดำเนินคดี", Me.Page, txtCaseNo1.ClientID)
            Return False
        End If
        If ChkDupCaseID() = True Then
            Config.SetAlert("เลขที่คดีซ้ำ", Me.Page, txtCaseNo1.ClientID)
            Return False
        End If
        
        Return True
    End Function

    Private Function ChkDupCaseID() As Boolean
        Dim ret As Boolean = False

        Dim vCaseID As String = ""
        Dim vCaseNoneOffice As String = "N"

        If chkNoneOffice.Checked = True Then
            vCaseID = "น" & txtCaseNo1.Text & "/" & txtCaseNo2.Text
        Else
            vCaseID = txtCaseNo1.Text & "/" & txtCaseNo2.Text
        End If

        If chkNoneOffice.Checked = True Then
            vCaseNoneOffice = "Y"
        End If

        Dim sql As String = "select bi.id "
        sql += " from book_impeachment bi"
        sql += " inner join application_arrest aa on aa.track_no=bi.track_no"
        sql += " where bi.case_id='" & vCaseID & "'"
        sql += " and aa.offcode='" & lblSueStaffOffcode.Text & "'"
        sql += " and bi.case_none_office='" & vCaseNoneOffice & "'"
        sql += " and bi.track_no<>'" & lblTrackNo.Text & "'"

        Dim dt As DataTable = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            ret = True
        End If
        dt.Dispose()

        Return ret

    End Function


    Public Sub FillInData(ByVal TrackNo As String)
        lblTrackNo.Text = TrackNo
        'บันทึกรับคำกล่าวโทษ
        Dim dtBook As DataTable = GetDataFromBookImpeachment(lblTrackNo.Text)
        If dtBook.Rows.Count > 0 Then
            Dim dr As DataRow = dtBook.Rows(0)

            Dim vCaseNo() As String = Split(dr("case_id").ToString, "/")
            If vCaseNo.Length = 2 Then
                txtCaseNo1.Text = Replace(vCaseNo(0), "น", "")
                txtCaseNo2.Text = vCaseNo(1)
            Else
                txtCaseNo1.Text = Replace(dr("case_id"), "น", "")
            End If

            txtCaseDate.DateValue = Convert.ToDateTime(dr("case_date"))
            txtCaseTime.TimeText = Convert.ToDateTime(dr("case_date")).ToString("HH:mm")

            lblCaseNonOffice.Visible = (dr("case_none_office") = "Y")
            chkNoneOffice.Checked = (dr("case_none_office") = "Y")

            Dim vSueStaffID As String = ""
            Dim vSueStaffTitleName As String = ""
            Dim vSueStaffFirstName As String = ""
            Dim vSueStaffLastName As String = ""
            If IsDBNull(dr("title_name")) = False Then vSueStaffTitleName = dr("title_name")
            If IsDBNull(dr("first_name")) = False Then vSueStaffFirstName = dr("first_name")
            If IsDBNull(dr("last_name")) = False Then vSueStaffLastName = dr("last_name")

            If IsDBNull(dr("staff_id_sue")) = False Then lblSueStaffID.Text = dr("staff_id_sue")
            lblSueStaffName.Text = vSueStaffTitleName & vSueStaffFirstName & " " & vSueStaffLastName
            If IsDBNull(dr("offcode")) = False Then lblSueStaffOffcode.Text = dr("offcode")

            rdiCaseQuality.SelectedValue = dr("case_quality")
            rdiCaseLast.SelectedValue = dr("case_last")
            If IsDBNull(dr("case_result")) = False Then txtCaseResult.Text = dr("case_result")
            If IsDBNull(dr("case_last_date")) = False Then txtCaseLastDate.DateValue = Convert.ToDateTime(dr("case_last_date"))
            If IsDBNull(dr("case_fine")) = False Then txtCaseFine.Text = dr("case_fine")

            rdiCaseQuality_SelectedIndexChanged(Nothing, Nothing)
        End If
        dtBook.Dispose()
    End Sub


    Private Function GetDataFromBookImpeachment(ByVal TrackNo As String) As DataTable
        'บันทึกรับคำกล่าวโทษ
        Dim sql As String = "select bi.case_id, bi.case_date, bi.case_quality,bi.case_last,"
        sql += " bi.case_result, bi.case_last_date, bi.case_fine, bi.staff_id_sue, bi.case_none_office, "
        sql += " s.title_name, s.first_name, s.last_name, s.offcode"
        sql += " from book_impeachment bi"
        sql += " left join V_STAFF_LIST_POPUP s on bi.staff_id_sue=s.idcard_no"
        sql += " where bi.track_no='" & TrackNo & "'"

        Dim dt As DataTable = Config.ExcuteTable(sql)
        Return dt
    End Function


#Region "Book Impeachment"
    Private Sub btnSearchSueStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchSueStaff.Click
        frmSearchSueStaff.ShowPop()
    End Sub
    Private Sub frmSearchSueStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchSueStaff.SelectStaff
        lblSueStaffName.Text = FullName
        lblSueStaffID.Text = IdCardNo
        lblSueStaffOffcode.Text = Offcode
    End Sub

    Private Sub chkNoneOffice_CheckedChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles chkNoneOffice.CheckedChanged
        If chkNoneOffice.Checked = True Then
            lblCaseNonOffice.Visible = True
        Else
            lblCaseNonOffice.Visible = False
        End If
    End Sub

    Private Sub rdiCaseQuality_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles rdiCaseQuality.SelectedIndexChanged
        If rdiCaseQuality.SelectedValue = "1" Then
            rdiCaseLast.SelectedValue = "1"

            rdiCaseLast.Items(0).Enabled = True
            rdiCaseLast.Items(1).Enabled = False
            rdiCaseLast.Items(2).Enabled = False

            pnlCaseLast.Visible = False

            txtCaseResult.Text = ""
            txtCaseFine.Text = ""
            txtCaseLastDate.ClearDate()
        Else
            rdiCaseLast.SelectedValue = "2"

            rdiCaseLast.Items(0).Enabled = False
            rdiCaseLast.Items(1).Enabled = True
            rdiCaseLast.Items(2).Enabled = True

            pnlCaseLast.Visible = True
        End If
    End Sub

    Public Function SaveBookImpeachment(ByVal UserIDCard As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try

            Dim vCaseDate As String = txtCaseDate.DateValue.ToString("yyyy-MM-dd", New System.Globalization.CultureInfo("en-US")) & " " & txtCaseTime.TimeText & ":00"
            Dim vCaseID As String = ""
            Dim vCaseNoneOffice As String = "N"
            If chkNoneOffice.Checked = True Then
                vCaseID = "น" & txtCaseNo1.Text.Trim & "/" & txtCaseNo2.Text.Trim
                vCaseNoneOffice = "Y"
            Else
                vCaseID = txtCaseNo1.Text.Trim & "/" & txtCaseNo2.Text.Trim
            End If

            Dim vCaseLastDate As String = ""
            If rdiCaseLast.SelectedValue = "3" Or rdiCaseQuality.SelectedValue = "2" Then
                'กรณีคดีสิ้นสุดที่ ศาล
                If txtCaseLastDate.DateValue.Year <> 1 Then
                    vCaseLastDate = txtCaseLastDate.DateValue.ToString("yyyy-MM-dd", New System.Globalization.CultureInfo("en-US")) & " 00:00:00"
                End If
            End If

            Dim sql As String = "select id from book_impeachment where track_no ='" & lblTrackNo.Text.Trim & "' and rownum=1"
            Dim dt As DataTable = Config.ExcuteTable(sql, trans)

            If dt.Rows.Count > 0 Then
                sql = "update book_impeachment " & vbNewLine
                sql += " set case_date = to_date('" & vCaseDate & "','yyyy-mm-dd hh24:mi:ss')" & vbNewLine
                sql += ", case_last = '" & rdiCaseLast.SelectedValue & "'" & vbNewLine
                sql += ", case_quality = '" & rdiCaseQuality.SelectedValue & "'" & vbNewLine
                sql += ", staff_id_sue = '" & lblSueStaffID.Text & "'" & vbNewLine
                sql += ", case_id = '" & vCaseID & "'" & vbNewLine
                sql += ", case_none_office ='" & vCaseNoneOffice & "'" & vbNewLine
                sql += ", case_last_date = " & IIf(vCaseLastDate.Trim = "", "NULL", "to_date('" & vCaseLastDate & "','yyyy-mm-dd hh24:mi:ss')") & vbNewLine
                sql += ", case_fine = " & IIf(txtCaseFine.Text.Trim = "", "NULL", "'" & txtCaseFine.Text & "'") & vbNewLine
                sql += ", case_result = " & IIf(txtCaseResult.Text.Trim = "", "NULL", "'" & txtCaseResult.Text.Trim & "'") & vbNewLine
                sql += ", update_on=sysdate, update_by='" & UserIDCard & "'"   'Admin = 1111111111111
                sql += " where track_no='" & lblTrackNo.Text & "'"
            Else
                sql = " insert into book_impeachment (id, track_no, case_date, case_last,case_quality,staff_id_sue," & vbNewLine
                sql += " case_id, case_none_office," & vbNewLine
                sql += " case_last_date,case_fine,case_result, " & vbNewLine
                sql += " create_by,create_on)" & vbNewLine
                sql += " values(book_impeachment_seq.nextval, '" & lblTrackNo.Text.Trim & "',to_date('" & vCaseDate & "','yyyy-mm-dd hh24:mi:ss'),'" & rdiCaseLast.SelectedValue & "','" & rdiCaseQuality.SelectedValue & "','" & lblSueStaffID.Text & "',"
                sql += " '" & vCaseID & "','" & vCaseNoneOffice & "',"
                sql += " " & IIf(vCaseLastDate = "", "NULL", "to_date('" & vCaseLastDate & "','yyyy-mm-dd hh24:mi:ss')") & "," & IIf(txtCaseFine.Text.Trim = "", "NULL", "'" & txtCaseFine.Text & "'") & "," & IIf(txtCaseResult.Text.Trim = "", "NULL", "'" & txtCaseResult.Text.Trim & "'") & ","
                sql += " '" & UserIDCard & "',sysdate)"   'Admin = 1111111111111
            End If
            dt.Dispose()

            ret = Config.ExcuteNonQuery(sql, trans)
        Catch ex As Exception
            ret = False
        End Try
        Return ret
    End Function
    Public Sub ClearForm()
        lblTrackNo.Text = ""
        lblCaseNonOffice.Visible = False
        txtCaseNo1.Text = ""
        txtCaseNo2.Text = ""
        txtCaseDate.ClearDate()
        txtCaseTime.TimeText = ""
        chkNoneOffice.Checked = False
        lblSueStaffName.Text = ""
        lblSueStaffID.Text = ""
        lblSueStaffOffcode.Text = ""

        rdiCaseQuality.SelectedValue = "1"
        rdiCaseLast.SelectedValue = "1"
        rdiCaseQuality_SelectedIndexChanged(Nothing, Nothing)


    End Sub
#End Region

End Class