Imports LinqDB.Common.Utilities

Partial Public Class ucRewardDivideTax
    Inherits System.Web.UI.UserControl

    Dim dtDt As New DataTable

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
            vReward += Convert.ToDouble(gvStaffList.Rows(i).Cells(10).Text.Replace(",", ""))

            Dim txtSeq As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("txtSeq"), TextBox)
            Dim txtShare1 As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("txtShare1"), TextBox)
            Dim txtShare2 As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("txtShare2"), TextBox)
            Dim txtMoney1 As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("txtMoney1"), TextBox)
            Dim txtMoney2 As TextBox = DirectCast(gvStaffList.Rows(i).FindControl("txtMoney2"), TextBox)
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
            If txtShare1.Text.Trim = "" Or txtShare2.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุจำนวนส่วน", Me.Page, gvStaffList.ClientID)
                Return False
            End If
            If txtMoney1.Text.Trim = "" Or txtMoney2.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุจำนวนเงิน", Me.Page, gvStaffList.ClientID)
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

        Dim sql As String = "select rdt.order_seq, rdt.idcard_no,rdt.title_code, rdt.first_name,rdt.last_name,rdt.poscode,rdt.position_name, rdt.staff_level," & vbNewLine
        sql += " rdt.duty_status_id, ds.status_name duty_status_name, rdt.share1, rdt.share2, rdt.money1, rdt.money2, rdt.money1+rdt.money2 money_total" & vbNewLine
        sql += " from reward_divide_tax rdt" & vbNewLine
        sql += " inner join reward_divide rd on rd.id=rdt.reward_divide_id" & vbNewLine
        sql += " inner join duty_status ds on ds.id=rdt.duty_status_id"
        sql += " where rd.id='" & vRewardDivideID & "'"
        sql += " order by rdt.order_seq"

        Dim dt As DataTable = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            dt.Columns.Add("seq")
            For i As Integer = 0 To dt.Rows.Count - 1
                dt.Rows(i)("seq") = (i + 1)
            Next

            sql = "select id, status_name from duty_status where id not in (1,2) order by id"
            dtDt = Config.ExcuteTable(sql)

            gvStaffList.DataSource = dt
            gvStaffList.DataBind()
        End If
        dt.Dispose()
    End Sub

    Public Function SaveAppRewardDivideTax(ByVal UserIDCard As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            Dim sql As String = "select id from reward_divide where id='" & lblRewardDivideID.Text & "'"
            Dim dt As DataTable = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                sql = "delete from reward_divide_tax where reward_divide_id='" & dt.Rows(0)("id") & "'"

                If Config.ExcuteNonQuery(sql, trans) = True Then
                    For Each grv As GridViewRow In gvStaffList.Rows
                        Dim lblidcard_no As Label = DirectCast(grv.FindControl("lblidcard_no"), Label)
                        Dim txtSeq As TextBox = DirectCast(grv.FindControl("txtSeq"), TextBox)
                        Dim lbltitlecode As Label = DirectCast(grv.FindControl("lbltitlecode"), Label)
                        Dim lblfirstname As Label = DirectCast(grv.FindControl("lblfirstname"), Label)
                        Dim lbllastname As Label = DirectCast(grv.FindControl("lbllastname"), Label)
                        Dim lblposcode As Label = DirectCast(grv.FindControl("lblposcode"), Label)
                        Dim lblposname As TextBox = DirectCast(grv.FindControl("lblposname"), TextBox)
                        Dim lblstafflevel As Label = DirectCast(grv.FindControl("lblstafflevel"), Label)
                        Dim lblDutyStatusID As Label = DirectCast(grv.FindControl("lblDutyStatusID"), Label)
                        Dim txtShare1 As TextBox = DirectCast(grv.FindControl("txtShare1"), TextBox)
                        Dim txtShare2 As TextBox = DirectCast(grv.FindControl("txtShare2"), TextBox)
                        Dim txtMoney1 As TextBox = DirectCast(grv.FindControl("txtMoney1"), TextBox)
                        Dim txtMoney2 As TextBox = DirectCast(grv.FindControl("txtMoney2"), TextBox)

                        sql = " insert into reward_divide_tax (id, reward_divide_id, order_seq, idcard_no, " & vbNewLine
                        sql += " title_code, first_name, last_name, poscode, position_name, staff_level, " & vbNewLine
                        sql += " duty_status_id, share1, share2, money1, money2, create_by, create_on)" & vbNewLine
                        sql += " values(reward_divide_tax_seq.nextval, '" & lblRewardDivideID.Text & "'" & vbNewLine
                        sql += ", '" & txtSeq.Text & "'" & vbNewLine
                        sql += ", " & IIf(lblidcard_no.Text.Trim = "", "null", "'" & lbltitlecode.Text.Trim & "'") & vbNewLine
                        sql += ", " & IIf(lbltitlecode.Text.Trim = "", "null", "'" & lbltitlecode.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblfirstname.Text.Trim = "", "null", "'" & lblfirstname.Text & "'") & vbNewLine
                        sql += ", " & IIf(lbllastname.Text.Trim = "", "null", "'" & lbllastname.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblposcode.Text.Trim = "", "null", "'" & lblposcode.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblposname.Text.Trim = "", "null", "'" & lblposname.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblstafflevel.Text.Trim = "", "null", "'" & lblstafflevel.Text & "'") & vbNewLine
                        sql += ", '" & lblDutyStatusID.Text & "'" & vbNewLine
                        sql += ", '" & txtShare1.Text & "'" & vbNewLine
                        sql += ", '" & txtShare2.Text & "'" & vbNewLine
                        sql += ", '" & txtMoney1.Text & "'" & vbNewLine
                        sql += ", '" & txtMoney2.Text & "'" & vbNewLine
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
            Dim ddlDutyStatus As DropDownList = DirectCast(e.Row.FindControl("ddlDutyStatus"), DropDownList)
            Dim lblDutyStatusID As Label = DirectCast(e.Row.FindControl("lblDutyStatusID"), Label)
            Dim txtSeq As TextBox = DirectCast(e.Row.FindControl("txtSeq"), TextBox)
            Dim txtShare1 As TextBox = DirectCast(e.Row.FindControl("txtShare1"), TextBox)
            Dim txtShare2 As TextBox = DirectCast(e.Row.FindControl("txtShare2"), TextBox)
            Dim txtMoney1 As TextBox = DirectCast(e.Row.FindControl("txtMoney1"), TextBox)
            Dim txtMoney2 As TextBox = DirectCast(e.Row.FindControl("txtMoney2"), TextBox)

            txtSeq.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtSeq.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtShare1.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtShare1.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtShare2.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtShare2.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtMoney1.Attributes.Add("OnKeyPress", "return ChkMinusDbl(this,event);")
            txtMoney1.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtMoney2.Attributes.Add("OnKeyPress", "return ChkMinusDbl(this,event);")
            txtMoney2.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            ddlDutyStatus.DataTextField = "status_name"
            ddlDutyStatus.DataValueField = "id"
            ddlDutyStatus.DataSource = dtDt
            ddlDutyStatus.DataBind()
            ddlDutyStatus.SelectedValue = lblDutyStatusID.Text

            If lblDutyStatusID.Text = "1" Or lblDutyStatusID.Text = "2" Then
                Dim lblDutyStatusName As Label = DirectCast(e.Row.FindControl("lblDutyStatusName"), Label)
                Dim chk As CheckBox = DirectCast(e.Row.FindControl("chk"), CheckBox)
                Dim lblSeq As Label = DirectCast(e.Row.FindControl("lblSeq"), Label)
                

                lblDutyStatusName.Visible = True
                ddlDutyStatus.Visible = False
                chk.Visible = False
                txtSeq.Visible = False
                lblSeq.Visible = True

                If lblDutyStatusID.Text = "1" Then
                    'ผู้แจ้งความ
                    Dim lblposname As TextBox = DirectCast(e.Row.FindControl("lblposname"), TextBox)
                    
                    lblposname.Visible = False
                    txtShare1.Visible = False
                    txtShare2.Visible = False
                    txtMoney1.Visible = False
                    txtMoney2.Visible = False
                End If
            End If

            If txtShare1.Text = "" Then
                txtShare1.Text = "0"
            End If
            If txtShare2.Text = "" Then
                txtShare2.Text = "0"
            End If
            If txtMoney1.Text = "" Then
                txtMoney1.Text = "0"
            End If
            If txtMoney2.Text = "" Then
                txtMoney2.Text = "0"
            End If
        End If
    End Sub

    Protected Sub txtMoney1_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim txtMoney1 As TextBox = sender
        Dim grv As GridViewRow = txtMoney1.Parent.Parent
        Dim txtMoney2 As String = DirectCast(grv.FindControl("txtMoney2"), TextBox).Text
        If txtMoney2 = "" Then
            txtMoney2 = "0"
        End If
        grv.Cells(10).Text = (Convert.ToDouble(txtMoney1.Text) + Convert.ToDouble(txtMoney2)).ToString("#,##0.00")
    End Sub

    Protected Sub txtMoney2_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim txtMoney2 As TextBox = sender
        Dim grv As GridViewRow = txtMoney2.Parent.Parent
        Dim txtMoney1 As String = DirectCast(grv.FindControl("txtMoney1"), TextBox).Text
        If txtMoney1 = "" Then
            txtMoney1 = "0"
        End If
        grv.Cells(10).Text = (Convert.ToDouble(txtMoney2.Text) + Convert.ToDouble(txtMoney1)).ToString("#,##0.00")
    End Sub

    Protected Sub ddlDutyStatus_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim ddlDutyStatus As DropDownList = sender
        Dim grv As GridViewRow = ddlDutyStatus.Parent.Parent
        Dim lblDutyStatusID As Label = DirectCast(grv.FindControl("lblDutyStatusID"), Label)
        Dim lblDutyStatusName As Label = DirectCast(grv.FindControl("lblDutyStatusName"), Label)
        lblDutyStatusID.Text = ddlDutyStatus.SelectedValue
        lblDutyStatusName.Text = ddlDutyStatus.SelectedItem.Text
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
        newDt.Columns.Add("poscode")
        newDt.Columns.Add("position_name")
        newDt.Columns.Add("staff_level")
        newDt.Columns.Add("duty_status_id")
        newDt.Columns.Add("duty_status_name")
        newDt.Columns.Add("share1")
        newDt.Columns.Add("share2")
        newDt.Columns.Add("money1")
        newDt.Columns.Add("money2")
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
            Dim lblDutyStatusName As Label = DirectCast(grv.FindControl("lblDutyStatusName"), Label)
            Dim txtShare1 As TextBox = DirectCast(grv.FindControl("txtShare1"), TextBox)
            Dim txtShare2 As TextBox = DirectCast(grv.FindControl("txtShare2"), TextBox)
            Dim txtMoney1 As TextBox = DirectCast(grv.FindControl("txtMoney1"), TextBox)
            Dim txtMoney2 As TextBox = DirectCast(grv.FindControl("txtMoney2"), TextBox)

            Dim dr As DataRow = newDt.NewRow
            dr("seq") = txtSeq.Text
            dr("order_seq") = txtSeq.Text
            dr("idcard_no") = lblidcard_no.Text
            dr("title_code") = lbltitlecode.Text
            dr("first_name") = lblfirstname.Text
            dr("last_name") = lbllastname.Text
            dr("poscode") = lblposcode.Text
            dr("position_name") = lblposname.Text
            dr("staff_level") = lblstafflevel.Text
            dr("duty_status_id") = lblDutyStatusID.Text
            dr("duty_status_name") = lblDutyStatusName.Text
            dr("share1") = txtShare1.Text
            dr("share2") = txtShare2.Text
            dr("money1") = txtMoney1.Text
            dr("money2") = txtMoney2.Text
            dr("money_total") = Convert.ToDouble(txtMoney1.Text) + Convert.ToDouble(txtMoney2.Text)
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
                dr("poscode") = dt.Rows(i)("poscode").ToString
                dr("position_name") = dt.Rows(i)("posname").ToString
                dr("staff_level") = dt.Rows(i)("staff_level").ToString
                dr("duty_status_id") = "3"
                dr("duty_status_name") = "ผู้ร่วมจับกุม"
                dr("money_total") = "0"
                'dr("share1") = txtShare1.Text
                'dr("share2") = txtShare2.Text
                'dr("money1") = txtMoney1.Text
                'dr("money2") = txtMoney2.Text
                'dr("money_total") = Convert.ToDouble(txtShare1.Text) + Convert.ToDouble(txtShare2.Text)
                newDt.Rows.Add(dr)
            Next
        End If

        Dim Sql As String = "select id, status_name from duty_status  where id not in (1,2)order by id"
        dtDt = Config.ExcuteTable(Sql)

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
        newDt.Columns.Add("poscode")
        newDt.Columns.Add("position_name")
        newDt.Columns.Add("staff_level")
        newDt.Columns.Add("duty_status_id")
        newDt.Columns.Add("duty_status_name")
        newDt.Columns.Add("share1")
        newDt.Columns.Add("share2")
        newDt.Columns.Add("money1")
        newDt.Columns.Add("money2")
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
            Dim lblDutyStatusName As Label = DirectCast(grv.FindControl("lblDutyStatusName"), Label)
            Dim txtShare1 As TextBox = DirectCast(grv.FindControl("txtShare1"), TextBox)
            Dim txtShare2 As TextBox = DirectCast(grv.FindControl("txtShare2"), TextBox)
            Dim txtMoney1 As TextBox = DirectCast(grv.FindControl("txtMoney1"), TextBox)
            Dim txtMoney2 As TextBox = DirectCast(grv.FindControl("txtMoney2"), TextBox)

            Dim dr As DataRow = newDt.NewRow
            dr("seq") = txtSeq.Text
            dr("order_seq") = txtSeq.Text
            dr("idcard_no") = lblidcard_no.Text
            dr("title_code") = lbltitlecode.Text
            dr("first_name") = lblfirstname.Text
            dr("last_name") = lbllastname.Text
            dr("poscode") = lblposcode.Text
            dr("position_name") = lblposname.Text
            dr("staff_level") = lblstafflevel.Text
            dr("duty_status_id") = lblDutyStatusID.Text
            dr("duty_status_name") = lblDutyStatusName.Text
            dr("share1") = txtShare1.Text
            dr("share2") = txtShare2.Text
            dr("money1") = txtMoney1.Text
            dr("money2") = txtMoney2.Text
            dr("money_total") = Convert.ToDouble(txtMoney1.Text) + Convert.ToDouble(txtMoney2.Text)
            newDt.Rows.Add(dr)
        Next

        If newDt.Rows.Count > 0 Then
            Dim Sql As String = "select id, status_name from duty_status  where id not in (1,2)order by id"
            dtDt = Config.ExcuteTable(Sql)

            gvStaffList.DataSource = newDt
            gvStaffList.DataBind()
        Else
            gvStaffList.DataSource = Nothing
            gvStaffList.DataBind()
        End If

        newDt.Dispose()
    End Sub
End Class