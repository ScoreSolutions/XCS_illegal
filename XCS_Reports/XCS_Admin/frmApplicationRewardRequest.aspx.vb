Public Partial Class frmApplicationRewardRequest
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

        If IsPostBack = False Then
            gvArrestCo.DataSource = Nothing
            gvArrestCo.DataBind()

            gvArrestCommand.DataSource = Nothing
            gvArrestCommand.DataBind()

            ucRewardRequestAlcohol1.Visible = True
            ucRewardRequestTax1.Visible = False
            ucRewardRequestTobacco1.Visible = False

            If Request("UserName") IsNot Nothing Then
                Config.SaveLogTrans(Request("UserName"), Request, Session.SessionID, "คลิกเมนู แก้ไขข้อมูลคำร้องขอรับเงินสินบนและรางวัล")
            End If
        End If
    End Sub
    Protected Sub chkH_OnCheckedChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim chkH As CheckBox = sender
        Dim grv As GridViewRow = chkH.Parent.Parent
        Dim gv As GridView = grv.Parent.Parent
        For i As Integer = 0 To gv.Rows.Count - 1
            Dim chk As CheckBox = gv.Rows(i).Cells(0).FindControl("chk")
            chk.Checked = chkH.Checked
        Next
    End Sub

    Private Sub ClearForm()
        txtRequestNo.Text = ""
        lblLoginHisID.Text = "0"
        lblApplicationRewardRequestID.Text = "0"
        txtRequestDate.ClearDate()
        lblLegislationID.Text = "0"
        lblLegislationName.Text = ""
        lblCompareCaseNo.Text = ""
        lblCompareCaseDate.Text = ""
        lblLawbreakerName.Text = ""
        lblAccuserName.Text = ""
        lblGuiltBase.Text = ""
        lblCaseLawID.Text = ""
        lblPenaltyCaseLawID.Text = ""
        lblSceneAddress.Text = ""
        lblRequestName.Text = ""
        lblRequestStaffID.Text = ""
        lblRequestPoscode.Text = ""
        lblRequestPosname.Text = ""

        gvArrestCo.DataSource = Nothing
        gvArrestCo.DataBind()

        gvArrestCommand.DataSource = Nothing
        gvArrestCommand.DataBind()

        txtInformName.Text = ""
        lblNotictNo.Text = ""
        lblReceiveName.Text = ""
        lblReceiveStaffID.Text = ""
        lblReceivePoscode.Text = ""
        lblReceivePosname.Text = ""
        txtInformDate.ClearDate()
        txtInformTime.TimeText = ""

        ucRewardRequestAlcohol1.Visible = True
        ucRewardRequestTax1.Visible = False
        ucRewardRequestTobacco1.Visible = False

        ucRewardRequestAlcohol1.ClearForm()
        ucRewardRequestTax1.ClearForm()
        ucRewardRequestTobacco1.Clearform()
    End Sub

    Private Sub FillInData()
        Try
            Dim dt As DataTable = GetRewardRequestData()
            If dt.Rows.Count > 0 Then
                Dim dr As DataRow = dt.Rows(0)
                lblApplicationRewardRequestID.Text = dr("id")
                txtRequestDate.DateValue = Convert.ToDateTime(dr("request_date"))
                If IsDBNull(dr("legislation_id")) = False Then lblLegislationID.Text = dr("legislation_id")
                If IsDBNull(dr("legislation_name")) = False Then lblLegislationName.Text = dr("legislation_name")
                If IsDBNull(dr("compare_case_no")) = False Then lblCompareCaseNo.Text = dr("compare_case_no")
                If IsDBNull(dr("compare_case_date")) = False Then lblCompareCaseDate.Text = Convert.ToDateTime(dr("compare_case_date"))
                If IsDBNull(dr("lawbreaker_name")) = False Then lblLawbreakerName.Text = dr("lawbreaker_name")
                If IsDBNull(dr("accuser_name")) = False Then lblAccuserName.Text = dr("accuser_name")
                If IsDBNull(dr("guilt_base")) = False Then lblGuiltBase.Text = dr("guilt_base")
                If IsDBNull(dr("case_law_id")) = False Then lblCaseLawID.Text = dr("case_law_id")
                If IsDBNull(dr("penalty_case_law_id")) = False Then lblPenaltyCaseLawID.Text = dr("penalty_case_law_id")
                If IsDBNull(dr("scene_addr")) = False Then lblSceneAddress.Text = dr("scene_addr")

                'ผู้ร้องขอ
                If IsDBNull(dr("staff_id_request")) = False Then lblRequestStaffID.Text = dr("staff_id_request")
                If IsDBNull(dr("request_staff_name")) = False Then lblRequestName.Text = dr("request_staff_name")
                If IsDBNull(dr("request_poscode")) = False Then lblRequestPoscode.Text = dr("request_poscode")
                If IsDBNull(dr("request_posname")) = False Then lblRequestPosname.Text = dr("request_posname")

                'ผู้ร่วมจับกุม
                Dim coDt As DataTable = GetStaffTeamByDutyStatus(3)
                If coDt.Rows.Count > 0 Then
                    coDt.Columns.Add("seq")
                    For i As Integer = 0 To coDt.Rows.Count - 1
                        coDt.Rows(i)("seq") = (i + 1).ToString
                    Next
                    gvArrestCo.DataSource = coDt
                    gvArrestCo.DataBind()
                End If
                coDt.Dispose()

                'ผู้สั่งการ
                Dim cmDt As DataTable = GetStaffTeamByDutyStatus(4)
                If cmDt.Rows.Count > 0 Then
                    cmDt.Columns.Add("seq")
                    For i As Integer = 0 To cmDt.Rows.Count - 1
                        cmDt.Rows(i)("seq") = (i + 1).ToString
                    Next

                    gvArrestCommand.DataSource = cmDt
                    gvArrestCommand.DataBind()
                End If
                cmDt.Dispose()

                'ผู้แจ้งความ
                If IsDBNull(dr("inform_name")) = False Then txtInformName.Text = dr("inform_name")
                If IsDBNull(dr("notice_no")) = False Then lblNotictNo.Text = dr("notice_no")
                If IsDBNull(dr("staff_id_receive")) = False Then lblReceiveStaffID.Text = dr("staff_id_receive")
                If IsDBNull(dr("receive_staff_name")) = False Then lblReceiveName.Text = dr("receive_staff_name")
                If IsDBNull(dr("poscode_receive")) = False Then lblReceivePoscode.Text = dr("poscode_receive")
                If IsDBNull(dr("receive_posname")) = False Then lblReceivePosname.Text = dr("receive_posname")
                If IsDBNull(dr("receive_date")) = False Then
                    txtInformDate.DateValue = Convert.ToDateTime(dr("receive_date"))
                    txtInformTime.TimeText = Convert.ToDateTime(dr("receive_date")).ToString("HH:mm")
                End If
            End If
            dt.Dispose()

            ucRewardRequestAlcohol1.Visible = False
            ucRewardRequestTax1.Visible = False
            If lblLegislationID.Text = "1" Then
                ucRewardRequestAlcohol1.Visible = True
                ucRewardRequestAlcohol1.FillInData(lblApplicationRewardRequestID.Text)
            ElseIf lblLegislationID.Text = "2" Then
                ucRewardRequestTobacco1.Visible = True
                ucRewardRequestTobacco1.FillInData(lblApplicationRewardRequestID.Text)
            ElseIf lblLegislationID.Text = "4" Then
                ucRewardRequestTax1.Visible = True
                ucRewardRequestTax1.FillInData(lblApplicationRewardRequestID.Text, GetStaffTeamByDutyStatus(5))
            End If

        Catch ex As Exception

        End Try
    End Sub

    Private Function GetRewardRequestData() As DataTable
        Dim dt As DataTable
        Try
            Dim sql As String = "select ar.id, ar.request_no, cc.compare_case_no, aa.legislation_id, lg.legislation_name, ar.request_date, cc.compare_case_date , " & vbNewLine
            sql += "    pke_arrest.getArrestLawbreaker(aa.track_no) as lawbreaker_name, " & vbNewLine
            sql += "    tia.title_name || sta.first_name || ' ' || sta.last_name as accuser_name, nvl(sta.posname,nvl(aa.accuser_posname, posa.posname || ' ' || sta.staff_level)) as accuser_posname, " & vbNewLine
            sql += "    ar.staff_id_request, tir.title_name || str.first_name || ' ' || str.last_name request_staff_name, " & vbNewLine
            sql += "    nvl(str.posname,posr.posname || ' ' || str.staff_level) request_posname, str.poscode request_poscode, " & vbNewLine
            sql += "    ar.staff_id_receive, tirc.title_name || strc.first_name || ' ' || strc.last_name receive_staff_name, " & vbNewLine
            sql += "    nvl(strc.posname,posrc.posname || ' ' || strc.staff_level) receive_posname, ar.poscode_receive, " & vbNewLine
            sql += " 	case when pke_arrest.getLawBreakerQty(aa.track_no)>1 then 'ร่วมกัน' else '' end || idc.guilt_base guilt_base, " & vbNewLine
            sql += "    idc.case_law_id , idc.penalty_case_law_id , pke_arrest.getSceneAddress(cc.track_no) as scene_addr," & vbNewLine
            sql += " ar.inform_name, ana.notice_no, ar.receive_date, aa.track_no " & vbNewLine
            sql += " from application_reward_request ar " & vbNewLine
            sql += " inner join compare_case cc on ar.compare_case_id=cc.id " & vbNewLine
            sql += " inner join application_arrest aa on cc.track_no = aa.track_no" & vbNewLine
            sql += " inner join legislation lg on lg.id=aa.legislation_id" & vbNewLine
            sql += " left join v_accuser_list_popup sta on sta.idcard_no = aa.accuser_idcardno" & vbNewLine
            sql += " left join title tia on sta.title_code = tia.title_code  " & vbNewLine
            sql += " left join indictment idc on cc.indictment_id = idc.indictment_id" & vbNewLine
            sql += " left join v_accuser_list_popup str on str.idcard_no=ar.staff_id_request " & vbNewLine
            sql += " left join title tir on tir.title_code=str.title_code " & vbNewLine
            sql += " left join v_accuser_list_popup strc on strc.idcard_no=ar.staff_id_receive " & vbNewLine
            sql += " left join title tirc on tirc.title_code=strc.title_code " & vbNewLine
            sql += " left join position posrc on posrc.poscode=trim(ar.poscode_receive) " & vbNewLine
            sql += " left join position posr on posr.poscode = trim(ar.poscode_request) " & vbNewLine
            sql += " left join position posa on posa.poscode = trim(aa.accuser_poscode) " & vbNewLine
            sql += " left join ed_office ed on ed.offcode = sta.offcode " & vbNewLine
            sql += " left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id " & vbNewLine
            sql += " where ar.request_no = '" & txtRequestNo.Text.Trim & "'"

            dt = Config.ExcuteTable(sql)
        Catch ex As Exception
            dt = New DataTable
        End Try
        Return dt
    End Function

    Private Function GetStaffTeamByDutyStatus(ByVal vDutyStatusID As Long) As DataTable
        Dim dt As New DataTable
        Try
            Dim sql As String = " select aat.staff_idcardno, aat.poscode staff_poscode, aat.offcode staff_offcode,"
            sql += " nvl(st.staff_level,' ') staff_level,"
            sql += " tt.title_name || st.first_name || ' ' || st.last_name fullname , nvl(st.posname,pos.posname) posname, st.offname"
            sql += " from application_reward_req_team aat"
            sql += " left join V_ACCUSER_LIST_POPUP st on aat.staff_idcardno = st.idcard_no"
            sql += " left join title tt on st.title_code = tt.title_code"
            sql += " left join position pos on aat.poscode = pos.poscode"
            sql += " where aat.application_reward_request_id='" & lblApplicationRewardRequestID.Text & "' "
            sql += " and aat.duty_status_id = '" & vDutyStatusID & "'"

            dt = Config.ExcuteTable(sql)
        Catch ex As Exception
            dt = New DataTable
        End Try
        Return dt
    End Function

    Private Sub btnSearchData_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchData.Click
        If txtRequestNo.Text.Trim <> "" Then
            Dim vRequestNo As String = txtRequestNo.Text.Trim
            ClearForm()

            txtRequestNo.Text = vRequestNo
            FillInData()
        End If
    End Sub


    Private Sub btnSearchRequestStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchRequestStaff.Click
        frmSearchRequestStaff.ShowPop()
    End Sub

    Private Sub frmSearchRequestStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchRequestStaff.SelectStaff
        lblRequestStaffID.Text = IdCardNo
        lblRequestName.Text = FullName
        lblRequestPoscode.Text = Poscode
        lblRequestPosname.Text = PosName
    End Sub

    Private Sub btnSearchReceiveStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchReceiveStaff.Click
        frmSearchReceiveStaff.ShowPop()
    End Sub

    Private Sub frmSearchReceiveStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchReceiveStaff.SelectStaff
        lblReceiveName.Text = FullName
        lblReceivePoscode.Text = Poscode
        lblReceivePosname.Text = PosName
        lblReceiveStaffID.Text = IdCardNo
    End Sub

    Private Sub btnSave_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSave.Click
        If Request("UserName") IsNot Nothing And Request("UserIDCard") IsNot Nothing Then
            Save(Request("UserIDCard"))
        Else
            Save("1111111111111")
        End If
    End Sub

    Private Function GetStaffTeamFromGridview(ByVal gv As GridView) As DataTable
        Dim dt As New DataTable
        With dt
            .Columns.Add("STAFF_IDCARDNO")
            .Columns.Add("STAFF_POSCODE")
            .Columns.Add("STAFF_OFFCODE")
            .Columns.Add("fullname")
            .Columns.Add("posname")
            .Columns.Add("offname")
            .Columns.Add("staff_level")
        End With

        For Each grv As GridViewRow In gv.Rows
            Dim lblidcard_no As Label = DirectCast(grv.FindControl("lblidcard_no"), Label)
            Dim lblposcode As Label = DirectCast(grv.FindControl("lblposcode"), Label)
            Dim lbloffcode As Label = DirectCast(grv.FindControl("lbloffcode"), Label)
            Dim lblfullname As Label = DirectCast(grv.FindControl("lblfullname"), Label)
            Dim lblposname As Label = DirectCast(grv.FindControl("lblposname"), Label)
            Dim lbloffname As Label = DirectCast(grv.FindControl("lbloffname"), Label)
            Dim lblstafflevel As Label = DirectCast(grv.FindControl("lblstafflevel"), Label)

            Dim dr As DataRow = dt.NewRow
            dr("STAFF_IDCARDNO") = lblidcard_no.Text
            dr("STAFF_POSCODE") = lblposcode.Text
            dr("STAFF_OFFCODE") = lbloffcode.Text
            dr("fullname") = lblfullname.Text
            dr("posname") = lblposname.Text
            dr("offname") = lbloffname.Text
            dr("staff_level") = lblstafflevel.Text
            dt.Rows.Add(dr)
        Next

        Return dt
    End Function

    Private Function SaveApplicationRewardReqTeam(ByVal dt As DataTable, ByVal DutyStatusID As String, ByVal trans As LinqDB.Common.Utilities.TransactionDB, ByVal UserIDCardNo As String) As Boolean
        Dim ret As Boolean = False
        Try
            If dt.Rows.Count > 0 Then
                For Each dr As DataRow In dt.Rows
                    Dim sql As String = " insert into application_reward_req_team (id,application_reward_request_id, " & vbNewLine
                    sql += " staff_idcardno, poscode,offcode,staff_level, duty_status_id,create_by,create_on )" & vbNewLine
                    sql += " values(APPLICATION_REWARD_TEAM_SEQ.nextval,'" & lblApplicationRewardRequestID.Text & "'" & vbNewLine
                    sql += ", " & IIf(IsDBNull(dr("STAFF_IDCARDNO")) = False, "'" & dr("STAFF_IDCARDNO") & "'", "null") & vbNewLine
                    sql += ", " & IIf(IsDBNull(dr("STAFF_POSCODE")) = False, "'" & dr("STAFF_POSCODE") & "'", "null") & vbNewLine
                    sql += ", " & IIf(IsDBNull(dr("STAFF_OFFCODE")) = False, "'" & dr("STAFF_OFFCODE") & "'", "null") & vbNewLine
                    sql += ", " & IIf(IsDBNull(dr("staff_level")) = False, "'" & dr("staff_level") & "'", "null") & vbNewLine
                    sql += ", '" & DutyStatusID & "', '" & UserIDCardNo & "',sysdate"
                    sql += ")"

                    ret = Config.ExcuteNonQuery(sql, trans)
                    If ret = False Then
                        Exit For
                    End If
                Next
            End If
        Catch ex As Exception
            ret = False
        End Try
        Return ret
    End Function

    Private Sub Save(ByVal UserIDCardNo As String)
        If SaveValidate() = True Then
            Dim sql As String = "select id from application_reward_request where id='" & lblApplicationRewardRequestID.Text & "'"
            Dim dt As DataTable = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                Dim vRequestDate As String = txtRequestDate.DateValue.ToString("yyyy-MM-dd HH:mm:ss", New Globalization.CultureInfo("en-US"))
                Dim vReceiveDate As String = txtInformDate.DateValue.ToString("yyyy-MM-dd HH:mm:ss", New Globalization.CultureInfo("en-US"))

                sql = " update application_reward_request " & vbNewLine
                sql += " set request_date = to_date('" & vRequestDate & "','yyyy-mm-dd hh24:mi:ss')" & vbNewLine
                sql += ", staff_id_request = '" & lblRequestStaffID.Text & "'" & vbNewLine
                sql += ", poscode_request = '" & lblRequestPoscode.Text & "'" & vbNewLine
                sql += ", staff_id_receive = '" & lblReceiveStaffID.Text & "'" & vbNewLine
                sql += ", poscode_receive = '" & lblReceivePoscode.Text & "'" & vbNewLine
                sql += ", inform_name = '" & txtInformName.Text & "'" & vbNewLine
                sql += ", receive_date = to_date('" & vReceiveDate & "','yyyy-mm-dd hh24:mi:ss')" & vbNewLine
                sql += ", update_by='" & UserIDCardNo & "',update_on=sysdate" & vbNewLine
                sql += " where id='" & lblApplicationRewardRequestID.Text & "'"

                Dim trans As New LinqDB.Common.Utilities.TransactionDB
                If Config.ExcuteNonQuery(sql, trans) = True Then
                    Dim ret As Boolean = False

                    sql = " delete from application_reward_req_team "
                    sql += " where application_reward_request_id='" & lblApplicationRewardRequestID.Text & "'"
                    If Config.ExcuteNonQuery(sql, trans) = True Then
                        If lblLegislationID.Text = "1" Then
                            ret = ucRewardRequestAlcohol1.SaveAppRewardReqAlcohol(UserIDCardNo, trans)
                        ElseIf lblLegislationID.Text = "2" Then
                            ret = ucRewardRequestTobacco1.SaveAppRewardReqTobacco(UserIDCardNo, trans)
                        ElseIf lblLegislationID.Text = "4" Then
                            ret = ucRewardRequestTax1.SaveAppRewardReqTax(UserIDCardNo, trans)
                            If ret = True Then
                                Dim hDt As DataTable = ucRewardRequestTax1.GetStaffTeamHelper()
                                If hDt.Rows.Count > 0 Then
                                    ret = SaveApplicationRewardReqTeam(hDt, 5, trans, UserIDCardNo)
                                End If
                                hDt.Dispose()
                            End If
                        End If

                        If ret = True Then
                            Dim coDt As DataTable = GetStaffTeamFromGridview(gvArrestCo)
                            If coDt.Rows.Count > 0 Then
                                ret = SaveApplicationRewardReqTeam(coDt, 3, trans, UserIDCardNo)
                            End If
                            coDt.Dispose()

                            If ret = True Then
                                Dim cmDt As DataTable = GetStaffTeamFromGridview(gvArrestCommand)
                                If cmDt.Rows.Count > 0 Then
                                    ret = SaveApplicationRewardReqTeam(cmDt, 4, trans, UserIDCardNo)
                                End If
                                cmDt.Dispose()
                            End If

                            If ret = True Then
                                trans.CommitTransaction()
                                Config.SetAlert("บันทึกข้อมูลเรียบร้อย", Me, txtRequestNo.ClientID)
                                FillInData()
                            Else
                                trans.RollbackTransaction()
                            End If
                        Else
                            trans.RollbackTransaction()
                        End If
                    Else
                        trans.RollbackTransaction()
                    End If
                Else
                    trans.RollbackTransaction()
                End If
            End If
            dt.Dispose()
        End If
    End Sub

    Private Function SaveValidate() As Boolean
        If txtRequestDate.DateValue.Year = 1 Then
            Config.SetAlert("กรุณาเลือกวันที่", Me, txtRequestDate.TxtBox.ClientID)
            Return False
        End If
        If lblRequestStaffID.Text = "" Then
            Config.SetAlert("กรุณาระบุชื่อผู้ร้องขอ/ผู้จับกุม", Me, lblRequestName.ClientID)
            Return False
        End If

        If lblLegislationID.Text = "1" Then
            If ucRewardRequestAlcohol1.SaveValidate = False Then
                Return False
            End If
        ElseIf lblLegislationID.Text = "2" Then
            If ucRewardRequestTobacco1.SaveValidate = False Then
                Return False
            End If
        ElseIf lblLegislationID.Text = "4" Then
            If ucRewardRequestTax1.SaveValidate = False Then
                Return False
            End If
        End If

        Return True
    End Function

    Private Sub btnAddCommandStaffList_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAddCommandStaffList.Click
        frmPopArrestCommand.ShowPop()
    End Sub

    Private Sub frmPopArrestCommand_SelectArrestTeamList(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As System.Data.DataTable) Handles frmPopArrestCommand.SelectArrestTeamList
        AddStaffTeamList(gvArrestCommand, dt)
    End Sub

    Private Sub btnCoStaffList_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnCoStaffList.Click
        frmPopArrestCo.ShowPop()
    End Sub

    Private Sub frmPopArrestCo_SelectArrestTeamList(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As System.Data.DataTable) Handles frmPopArrestCo.SelectArrestTeamList
        AddStaffTeamList(gvArrestCo, dt)
    End Sub

    Sub AddStaffTeamList(ByVal gv As GridView, ByVal dt As DataTable)
        Dim newdt As DataTable = GetStaffTeamFromGridview(gv)

        For i As Integer = 0 To dt.Rows.Count - 1
            Dim dr As DataRow = newdt.NewRow
            dr("STAFF_IDCARDNO") = dt.Rows(i)("idcard_no").ToString
            dr("STAFF_POSCODE") = dt.Rows(i)("poscode").ToString
            dr("STAFF_OFFCODE") = dt.Rows(i)("offcode").ToString
            dr("fullname") = dt.Rows(i)("fullname").ToString
            dr("posname") = dt.Rows(i)("posname").ToString
            dr("offname") = dt.Rows(i)("offname").ToString
            dr("staff_level") = dt.Rows(i)("staff_level").ToString
            newdt.Rows.Add(dr)
        Next

        newdt.Columns.Add("seq", GetType(String))
        For i As Integer = 0 To newdt.Rows.Count - 1
            newdt.Rows(i)("seq") = i + 1
        Next
        gv.DataSource = newdt
        gv.DataBind()

    End Sub

    Private Sub btnDeleteCommandStaffList_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnDeleteCommandStaffList.Click
        DeleteStaffTeamtList(gvArrestCommand)
    End Sub

    Private Sub btnDeleteCoStaffList_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnDeleteCoStaffList.Click
        DeleteStaffTeamtList(gvArrestCo)
    End Sub

    Sub DeleteStaffTeamtList(ByVal gv As GridView)
        Dim newdt As New DataTable
        With newdt
            .Columns.Add("STAFF_IDCARDNO")
            .Columns.Add("STAFF_POSCODE")
            .Columns.Add("STAFF_OFFCODE")
            .Columns.Add("fullname")
            .Columns.Add("posname")
            .Columns.Add("offname")
            .Columns.Add("staff_level")
        End With

        For Each grv As GridViewRow In gv.Rows
            Dim chk As CheckBox = DirectCast(grv.FindControl("Chk"), CheckBox)
            If chk.Checked = False Then
                Dim lblidcard_no As Label = DirectCast(grv.FindControl("lblidcard_no"), Label)
                Dim lblposcode As Label = DirectCast(grv.FindControl("lblposcode"), Label)
                Dim lbloffcode As Label = DirectCast(grv.FindControl("lbloffcode"), Label)
                Dim lblfullname As Label = DirectCast(grv.FindControl("lblfullname"), Label)
                Dim lblposname As Label = DirectCast(grv.FindControl("lblposname"), Label)
                Dim lbloffname As Label = DirectCast(grv.FindControl("lbloffname"), Label)
                Dim lblstafflevel As Label = DirectCast(grv.FindControl("lblstafflevel"), Label)

                Dim dr As DataRow = newdt.NewRow
                dr("STAFF_IDCARDNO") = lblidcard_no.Text
                dr("STAFF_POSCODE") = lblposcode.Text
                dr("STAFF_OFFCODE") = lbloffcode.Text
                dr("fullname") = lblfullname.Text
                dr("posname") = lblposname.Text
                dr("offname") = lbloffname.Text
                dr("staff_level") = lblstafflevel.Text
                newdt.Rows.Add(dr)
            End If
        Next

        newdt.Columns.Add("seq", GetType(String))
        For i As Integer = 0 To newdt.Rows.Count - 1
            newdt.Rows(i)("seq") = i + 1
        Next
        gv.DataSource = newdt
        gv.DataBind()
    End Sub
End Class