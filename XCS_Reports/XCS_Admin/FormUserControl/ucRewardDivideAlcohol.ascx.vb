Imports LinqDB.Common.Utilities

Partial Public Class ucRewardDivideAlcohol
    Inherits System.Web.UI.UserControl

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub chkH_OnCheckedChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim chkH As CheckBox = sender
        Dim grv As GridViewRow = chkH.Parent.Parent
        Dim gv As GridView = grv.Parent.Parent
        For i As Integer = 0 To gv.Rows.Count - 1
            Dim DutyStatusID As Label = DirectCast(gv.Rows(i).FindControl("lblDutyStatusID"), Label)

            If DutyStatusID.Text = "1" Or DutyStatusID.Text = "2" Then
                Dim chk As CheckBox = gv.Rows(i).Cells(0).FindControl("chk")
                chk.Checked = chkH.Checked
            End If
        Next
    End Sub

    Public Function SaveValidate() As Boolean
        Dim vReward As Double = 0
        Dim dtSeq As New DataTable
        dtSeq.Columns.Add("seq")
        For i As Integer = 0 To gvStaffList.Rows.Count - 1
            Dim lblDutyStatusID As Label = DirectCast(gvStaffList.Rows(i).FindControl("lblDutyStatusID"), Label)
            If lblDutyStatusID.Text <> "1" Then
                vReward += Convert.ToDouble(gvStaffList.Rows(i).Cells(11).Text.Replace(",", ""))
            End If


            Dim txtSeq As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("txtSeq"), TextBox)
            Dim lblDutyStatus02Money As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("lblDutyStatus02Money"), TextBox)
            Dim lblDutyStatus03Money As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("lblDutyStatus03Money"), TextBox)
            Dim lblDutyStatus04Money As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("lblDutyStatus04Money"), TextBox)
            Dim lblDutyStatus05Money As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("lblDutyStatus05Money"), TextBox)
            Dim seq As Integer = 0
            If txtSeq.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุลำดับที่รายการ", Me.Page, gvStaffList.ClientID)
                Return False
            Else
                seq = Convert.ToInt16(txtSeq.Text)
            End If

            dtSeq.DefaultView.RowFilter = "seq='" & seq & "'"
            If dtSeq.DefaultView.Count > 0 Then
                Config.SetAlert("มีลำดับที่ซ้ำกัน", Me.Page, gvStaffList.ClientID)
                Return False
            End If

            If lblDutyStatus02Money.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุจำนวนจำนวนเงินที่แบ่งให้ผู้จับกุม", Me.Page, gvStaffList.ClientID)
                Return False
            End If
            If lblDutyStatus03Money.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุจำนวนเงินที่แบ่งให้กับผู้ร่วมจับกุม", Me.Page, gvStaffList.ClientID)
                Return False
            End If
            If lblDutyStatus04Money.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุจำนวนเงินที่แบ่งให้กับผู้สั่งการ", Me.Page, gvStaffList.ClientID)
                Return False
            End If
            If lblDutyStatus05Money.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุจำนวนเงินที่แบ่งให้กับผู้ช่วยเหลือ", Me.Page, gvStaffList.ClientID)
                Return False
            End If

            dtSeq.DefaultView.RowFilter = ""
            Dim drSeq As DataRow = dtSeq.NewRow
            drSeq("seq") = seq
            dtSeq.Rows.Add(drSeq)
        Next

        If vReward <> Convert.ToDouble(lblRewardMoney.Text) Then
            Config.SetAlert("จำนวนเงินที่แบ่งไม่เท่ากับเงินรางวัล", Me.Page, gvStaffList.ClientID)
            Return False
        End If
        Return True
    End Function

    Public Sub FillInData(ByVal vRewardDivideID As String, ByVal CaseReward As Double)
        lblRewardDivideID.Text = vRewardDivideID
        lblRewardMoney.Text = CaseReward

        Dim sql As String = "select rdt.order_seq, rdt.idcard_no,rdt.title_code, rdt.first_name,rdt.last_name,rdt.position_name, rdt.staff_level,"
        sql += " rdt.duty_status_id, rdt.duty_status01_money, rdt.duty_status02_money, rdt.duty_status03_money, "
        sql += " rdt.duty_status04_money, rdt.duty_status05_money,"
        sql += " rdt.duty_status01_money+rdt.duty_status02_money+rdt.duty_status03_money+rdt.duty_status04_money+rdt.duty_status05_money money_total"
        sql += " from reward_divide_alcohol rdt"
        sql += " inner join reward_divide rd on rd.id=rdt.reward_divide_id"
        sql += " where rd.id='" & lblRewardDivideID.Text & "'"
        sql += " order by rdt.order_seq"

        Dim dt As DataTable = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            dt.Columns.Add("seq")
            For i As Integer = 0 To dt.Rows.Count - 1
                dt.Rows(i)("seq") = (i + 1)
            Next
            gvStaffList.DataSource = dt
            gvStaffList.DataBind()
        End If
        dt.Dispose()
    End Sub

    Public Function SaveAppRewardDivideAlcohl(ByVal UserIDCard As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            Dim sql As String = "select id from reward_divide where id='" & lblRewardDivideID.Text & "'"
            Dim dt As DataTable = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                sql = "delete from reward_divide_alcohol where reward_divide_id='" & dt.Rows(0)("id") & "'"

                If Config.ExcuteNonQuery(sql, trans) = True Then
                    For Each grv As GridViewRow In gvStaffList.Rows
                        Dim lblidcard_no As Label = DirectCast(grv.FindControl("lblidcard_no"), Label)
                        Dim txtSeq As TextBox = DirectCast(grv.FindControl("txtSeq"), TextBox)
                        Dim lbltitlecode As Label = DirectCast(grv.FindControl("lbltitlecode"), Label)
                        Dim lblfirstname As Label = DirectCast(grv.FindControl("lblfirstname"), Label)
                        Dim lbllastname As Label = DirectCast(grv.FindControl("lbllastname"), Label)
                        Dim lblposname As TextBox = DirectCast(grv.FindControl("lblposname"), TextBox)
                        Dim lblstafflevel As Label = DirectCast(grv.FindControl("lblstafflevel"), Label)
                        Dim lblDutyStatusID As Label = DirectCast(grv.FindControl("lblDutyStatusID"), Label)
                        Dim lblDutyStatus01Money As String = DirectCast(grv.FindControl("lblDutyStatus01Money"), Label).Text
                        Dim lblDutyStatus02Money As String = DirectCast(grv.FindControl("lblDutyStatus02Money"), TextBox).Text
                        Dim lblDutyStatus03Money As String = DirectCast(grv.FindControl("lblDutyStatus03Money"), TextBox).Text
                        Dim lblDutyStatus04Money As String = DirectCast(grv.FindControl("lblDutyStatus04Money"), TextBox).Text
                        Dim lblDutyStatus05Money As String = DirectCast(grv.FindControl("lblDutyStatus05Money"), TextBox).Text

                        sql = " insert into reward_divide_alcohol (id, reward_divide_id, order_seq, idcard_no, " & vbNewLine
                        sql += " title_code, first_name, last_name, position_name, staff_level, " & vbNewLine
                        sql += " duty_status_id, duty_status01_money, duty_status02_money, duty_status03_money, duty_status04_money, duty_status05_money, "
                        sql += " create_by, create_on)" & vbNewLine
                        sql += " values(reward_divide_alcohol_seq.nextval, '" & lblRewardDivideID.Text & "'" & vbNewLine
                        sql += ", '" & txtSeq.Text & "'" & vbNewLine
                        sql += ", " & IIf(lblidcard_no.Text.Trim = "", "null", "'" & lbltitlecode.Text.Trim & "'") & vbNewLine
                        sql += ", " & IIf(lbltitlecode.Text.Trim = "", "null", "'" & lbltitlecode.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblfirstname.Text.Trim = "", "null", "'" & lblfirstname.Text & "'") & vbNewLine
                        sql += ", " & IIf(lbllastname.Text.Trim = "", "null", "'" & lbllastname.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblposname.Text.Trim = "", "null", "'" & lblposname.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblstafflevel.Text.Trim = "", "null", "'" & lblstafflevel.Text & "'") & vbNewLine
                        sql += ", '" & lblDutyStatusID.Text & "'" & vbNewLine
                        sql += ", '" & lblDutyStatus01Money & "'" & vbNewLine
                        sql += ", '" & lblDutyStatus02Money & "'" & vbNewLine
                        sql += ", '" & lblDutyStatus03Money & "'" & vbNewLine
                        sql += ", '" & lblDutyStatus04Money & "'" & vbNewLine
                        sql += ", '" & lblDutyStatus05Money & "'" & vbNewLine
                        sql += ", '" & UserIDCard & "', sysdate)" & vbNewLine

                        ret = Config.ExcuteNonQuery(sql, trans)
                        If ret = False Then
                            Exit For
                        End If
                    Next
                Else
                    ret = False
                End If
            End If
                dt.Dispose()
        Catch ex As Exception
            ret = False
        End Try
        Return ret
    End Function
    Public Sub ClearForm()
        gvStaffList.DataSource = Nothing
        gvStaffList.DataBind()
    End Sub

    Private Sub gvStaffList_RowDataBound(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewRowEventArgs) Handles gvStaffList.RowDataBound
        If e.Row.RowType = DataControlRowType.DataRow Then

            Dim lblDutyStatusID As Label = DirectCast(e.Row.FindControl("lblDutyStatusID"), Label)
            Dim txtSeq As TextBox = DirectCast(e.Row.FindControl("txtSeq"), TextBox)

            Dim lblDutyStatus02Money As TextBox = DirectCast(e.Row.FindControl("lblDutyStatus02Money"), TextBox)
            Dim lblDutyStatus03Money As TextBox = DirectCast(e.Row.FindControl("lblDutyStatus03Money"), TextBox)
            Dim lblDutyStatus04Money As TextBox = DirectCast(e.Row.FindControl("lblDutyStatus04Money"), TextBox)
            Dim lblDutyStatus05Money As TextBox = DirectCast(e.Row.FindControl("lblDutyStatus05Money"), TextBox)

            txtSeq.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtSeq.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            lblDutyStatus02Money.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            lblDutyStatus02Money.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            lblDutyStatus03Money.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            lblDutyStatus03Money.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            lblDutyStatus04Money.Attributes.Add("OnKeyPress", "return ChkMinusDbl(this,event);")
            lblDutyStatus04Money.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            lblDutyStatus05Money.Attributes.Add("OnKeyPress", "return ChkMinusDbl(this,event);")
            lblDutyStatus05Money.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            If lblDutyStatusID.Text = "1" Or lblDutyStatusID.Text = "2" Then
                Dim lblDutyStatusName As Label = DirectCast(e.Row.FindControl("lblDutyStatusName"), Label)
                Dim chk As CheckBox = DirectCast(e.Row.FindControl("chk"), CheckBox)
                Dim lblSeq As Label = DirectCast(e.Row.FindControl("lblSeq"), Label)

                chk.Visible = False
                txtSeq.Visible = False
                lblSeq.Visible = True

                If lblDutyStatusID.Text = "1" Then
                    'ผู้แจ้งความ
                    Dim lblDutyStatus01Money As Label = DirectCast(e.Row.FindControl("lblDutyStatus01Money"), Label)
                    Dim lblfullname As Label = DirectCast(e.Row.FindControl("lblfullname"), Label)
                    Dim lblposname As TextBox = DirectCast(e.Row.FindControl("lblposname"), TextBox)
                    Dim lblinformname As Label = DirectCast(e.Row.FindControl("lblinformname"), Label)

                    lblDutyStatus01Money.Visible = True
                    lblfullname.Visible = False
                    lblposname.Visible = False
                    lblinformname.Visible = True
                    lblDutyStatus02Money.Visible = False
                    lblDutyStatus03Money.Visible = False
                    lblDutyStatus04Money.Visible = False
                    lblDutyStatus05Money.Visible = False
                End If
            End If

            If lblDutyStatus02Money.Text = "" Then
                lblDutyStatus02Money.Text = "0"
            End If
            If lblDutyStatus03Money.Text = "" Then
                lblDutyStatus03Money.Text = "0"
            End If
            If lblDutyStatus04Money.Text = "" Then
                lblDutyStatus04Money.Text = "0"
            End If
            If lblDutyStatus05Money.Text = "" Then
                lblDutyStatus05Money.Text = "0"
            End If
        End If
    End Sub

    Protected Sub txtMoney_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim txtMoney As TextBox = sender
        Dim grv As GridViewRow = txtMoney.Parent.Parent
        Dim lblDutyStatus02Money As String = DirectCast(grv.FindControl("lblDutyStatus02Money"), TextBox).Text
        Dim lblDutyStatus03Money As String = DirectCast(grv.FindControl("lblDutyStatus03Money"), TextBox).Text
        Dim lblDutyStatus04Money As String = DirectCast(grv.FindControl("lblDutyStatus04Money"), TextBox).Text
        Dim lblDutyStatus05Money As String = DirectCast(grv.FindControl("lblDutyStatus05Money"), TextBox).Text

        If lblDutyStatus02Money = "" Then
            lblDutyStatus02Money = "0"
        End If
        If lblDutyStatus03Money = "" Then
            lblDutyStatus03Money = "0"
        End If
        If lblDutyStatus04Money = "" Then
            lblDutyStatus04Money = "0"
        End If
        If lblDutyStatus05Money = "" Then
            lblDutyStatus05Money = "0"
        End If

        grv.Cells(11).Text = (Convert.ToDouble(lblDutyStatus02Money) + Convert.ToDouble(lblDutyStatus03Money) + Convert.ToDouble(lblDutyStatus04Money) + Convert.ToDouble(lblDutyStatus05Money)).ToString("#,##0.00")
    End Sub


    Private Sub btnAdd_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAdd.Click
        frmAddStaffList.ShowPop()
    End Sub

    Private Sub frmAddStaffList_SelectArrestTeamList(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As System.Data.DataTable) Handles frmAddStaffList.SelectArrestTeamList
        Dim newDt As New DataTable
        newDt.Columns.Add("seq")
        newDt.Columns.Add("order_seq")
        newDt.Columns.Add("idcard_no")
        newDt.Columns.Add("title_code")
        newDt.Columns.Add("first_name")
        newDt.Columns.Add("last_name")
        newDt.Columns.Add("position_name")
        newDt.Columns.Add("staff_level")
        newDt.Columns.Add("duty_status_id")
        newDt.Columns.Add("duty_status01_money")
        newDt.Columns.Add("duty_status02_money")
        newDt.Columns.Add("duty_status03_money")
        newDt.Columns.Add("duty_status04_money")
        newDt.Columns.Add("duty_status05_money")
        newDt.Columns.Add("money_total")

        For Each grv As GridViewRow In gvStaffList.Rows
            Dim txtSeq As TextBox = DirectCast(grv.FindControl("txtSeq"), TextBox)
            Dim lblidcard_no As Label = DirectCast(grv.FindControl("lblidcard_no"), Label)
            Dim lbltitlecode As Label = DirectCast(grv.FindControl("lbltitlecode"), Label)
            Dim lblfirstname As Label = DirectCast(grv.FindControl("lblfirstname"), Label)
            Dim lbllastname As Label = DirectCast(grv.FindControl("lbllastname"), Label)
            Dim lblposcode As Label = DirectCast(grv.FindControl("lblposcode"), Label)
            Dim lblposname As TextBox = DirectCast(grv.FindControl("lblposname"), TextBox)
            Dim lblstafflevel As Label = DirectCast(grv.FindControl("lblstafflevel"), Label)
            Dim lblDutyStatusID As Label = DirectCast(grv.FindControl("lblDutyStatusID"), Label)
            'Dim lblDutyStatusName As Label = DirectCast(grv.FindControl("lblDutyStatusName"), Label)
            Dim lblDutyStatus01Money As String = DirectCast(grv.FindControl("lblDutyStatus01Money"), Label).Text
            Dim lblDutyStatus02Money As String = DirectCast(grv.FindControl("lblDutyStatus02Money"), TextBox).Text
            Dim lblDutyStatus03Money As String = DirectCast(grv.FindControl("lblDutyStatus03Money"), TextBox).Text
            Dim lblDutyStatus04Money As String = DirectCast(grv.FindControl("lblDutyStatus04Money"), TextBox).Text
            Dim lblDutyStatus05Money As String = DirectCast(grv.FindControl("lblDutyStatus05Money"), TextBox).Text

            Dim dr As DataRow = newDt.NewRow
            dr("seq") = txtSeq.Text
            dr("order_seq") = txtSeq.Text
            dr("idcard_no") = lblidcard_no.Text
            dr("title_code") = lbltitlecode.Text
            dr("first_name") = lblfirstname.Text
            dr("last_name") = lbllastname.Text
            'dr("poscode") = lblposcode.Text
            dr("position_name") = lblposname.Text
            dr("staff_level") = lblstafflevel.Text
            dr("duty_status_id") = lblDutyStatusID.Text
            dr("duty_status01_money") = lblDutyStatus01Money
            dr("duty_status02_money") = lblDutyStatus02Money
            dr("duty_status03_money") = lblDutyStatus03Money
            dr("duty_status04_money") = lblDutyStatus04Money
            dr("duty_status05_money") = lblDutyStatus05Money
            dr("money_total") = Convert.ToDouble(lblDutyStatus01Money) + Convert.ToDouble(lblDutyStatus02Money) + Convert.ToDouble(lblDutyStatus03Money) + Convert.ToDouble(lblDutyStatus04Money) + Convert.ToDouble(lblDutyStatus05Money)
            newDt.Rows.Add(dr)
        Next

        If dt.Rows.Count > 0 Then
            For i As Integer = 0 To dt.Rows.Count - 1
                Dim dr As DataRow = newDt.NewRow
                dr("seq") = newDt.Rows.Count + 1
                dr("order_seq") = newDt.Rows.Count + 1
                dr("idcard_no") = dt.Rows(i)("idcard_no").ToString
                dr("title_code") = dt.Rows(i)("title_code").ToString
                dr("first_name") = dt.Rows(i)("first_name").ToString
                dr("last_name") = dt.Rows(i)("last_name").ToString
                dr("position_name") = dt.Rows(i)("posname").ToString
                dr("staff_level") = dt.Rows(i)("staff_level").ToString
                dr("duty_status_id") = "3"
                dr("duty_status01_money") = "0"
                dr("duty_status02_money") = "0"
                dr("duty_status03_money") = "0"
                dr("duty_status04_money") = "0"
                dr("duty_status05_money") = "0"
                dr("money_total") = "0"
                
                newDt.Rows.Add(dr)
            Next
        End If

        gvStaffList.DataSource = newDt
        gvStaffList.DataBind()

        newDt.Dispose()
    End Sub

    Private Sub btnDelete_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnDelete.Click
        Dim newDt As New DataTable
        newDt.Columns.Add("seq")
        newDt.Columns.Add("order_seq")
        newDt.Columns.Add("idcard_no")
        newDt.Columns.Add("title_code")
        newDt.Columns.Add("first_name")
        newDt.Columns.Add("last_name")
        newDt.Columns.Add("position_name")
        newDt.Columns.Add("staff_level")
        newDt.Columns.Add("duty_status_id")
        newDt.Columns.Add("duty_status01_money")
        newDt.Columns.Add("duty_status02_money")
        newDt.Columns.Add("duty_status03_money")
        newDt.Columns.Add("duty_status04_money")
        newDt.Columns.Add("duty_status05_money")
        newDt.Columns.Add("money_total")

        For Each grv As GridViewRow In gvStaffList.Rows
            Dim chk As CheckBox = DirectCast(grv.FindControl("chk"), CheckBox)
            If chk.Checked = True Then
                Continue For
            End If

            Dim txtSeq As TextBox = DirectCast(grv.FindControl("txtSeq"), TextBox)
            Dim lblidcard_no As Label = DirectCast(grv.FindControl("lblidcard_no"), Label)
            Dim lbltitlecode As Label = DirectCast(grv.FindControl("lbltitlecode"), Label)
            Dim lblfirstname As Label = DirectCast(grv.FindControl("lblfirstname"), Label)
            Dim lbllastname As Label = DirectCast(grv.FindControl("lbllastname"), Label)
            Dim lblposcode As Label = DirectCast(grv.FindControl("lblposcode"), Label)
            Dim lblposname As TextBox = DirectCast(grv.FindControl("lblposname"), TextBox)
            Dim lblstafflevel As Label = DirectCast(grv.FindControl("lblstafflevel"), Label)
            Dim lblDutyStatusID As Label = DirectCast(grv.FindControl("lblDutyStatusID"), Label)
            Dim lblDutyStatus01Money As String = DirectCast(grv.FindControl("lblDutyStatus01Money"), Label).Text
            Dim lblDutyStatus02Money As String = DirectCast(grv.FindControl("lblDutyStatus02Money"), TextBox).Text
            Dim lblDutyStatus03Money As String = DirectCast(grv.FindControl("lblDutyStatus03Money"), TextBox).Text
            Dim lblDutyStatus04Money As String = DirectCast(grv.FindControl("lblDutyStatus04Money"), TextBox).Text
            Dim lblDutyStatus05Money As String = DirectCast(grv.FindControl("lblDutyStatus05Money"), TextBox).Text

            Dim dr As DataRow = newDt.NewRow
            dr("seq") = txtSeq.Text
            dr("order_seq") = txtSeq.Text
            dr("idcard_no") = lblidcard_no.Text
            dr("title_code") = lbltitlecode.Text
            dr("first_name") = lblfirstname.Text
            dr("last_name") = lbllastname.Text
            dr("position_name") = lblposname.Text
            dr("staff_level") = lblstafflevel.Text
            dr("duty_status_id") = lblDutyStatusID.Text
            dr("duty_status01_money") = lblDutyStatus01Money
            dr("duty_status02_money") = lblDutyStatus02Money
            dr("duty_status03_money") = lblDutyStatus03Money
            dr("duty_status04_money") = lblDutyStatus04Money
            dr("duty_status05_money") = lblDutyStatus05Money
            dr("money_total") = Convert.ToDouble(lblDutyStatus01Money) + Convert.ToDouble(lblDutyStatus02Money) + Convert.ToDouble(lblDutyStatus03Money) + Convert.ToDouble(lblDutyStatus04Money) + Convert.ToDouble(lblDutyStatus05Money)
            newDt.Rows.Add(dr)
        Next

        If newDt.Rows.Count > 0 Then
            gvStaffList.DataSource = newDt
            gvStaffList.DataBind()
        Else
            gvStaffList.DataSource = Nothing
            gvStaffList.DataBind()
        End If

        newDt.Dispose()
    End Sub
End Class