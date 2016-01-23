Imports LinqDB.Common.Utilities

Partial Public Class ucRewardRequestTax
    Inherits System.Web.UI.UserControl

    Public ReadOnly Property GetStaffTeamHelper() As DataTable
        Get
            Return GetStaffTeamFromGridview(gvArrestHelper)
        End Get
    End Property

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            gvExhibit.DataSource = Nothing
            gvExhibit.DataBind()

            gvArrestHelper.DataSource = Nothing
            gvArrestHelper.DataBind()
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

    Public Function SaveValidate() As Boolean
        If txtAbnormaly.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุลักษณะที่ตรวจพบ", Me.Page, txtAbnormaly.ClientID)
            Return False
        End If
        If txtCommentControl.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุรายละเอียดการจับกุมและความเห็น", Me.Page, txtCommentControl.ClientID)
            Return False
        End If
        If txtAskLean.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุเรียน", Me.Page, txtAskLean.ClientID)
            Return False
        End If
        If txtDepartmentSend.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุเห็นควรส่ง", Me.Page, txtDepartmentSend.ClientID)
            Return False
        End If

        Return True
    End Function

    Private Function GetExhibitList() As DataTable
        Dim sql As String = "select aae.duty_code, nvl(aae.duty_name,dt.duty_name) duty_name, "
        sql += "  aae.brand_code, nvl(aae.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) brand_name,  "
        sql += " aae.qty , nvl(aae.qty_unit_name, u.thname) qty_unit_name  "
        sql += " from application_arrest_exhibit aae "
        sql += " left join duty_table dt on dt.duty_code=aae.duty_code "
        sql += " left join brand_main bm on bm.brand_main_code=aae.brand_code and aae.group_id=bm.group_id "
        sql += " left join unit u on u.unit_code=aae.qty_unit_code "
        sql += " where aae.track_no='" & lblTrackNo.Text & "'"

        Dim dt As DataTable = Config.ExcuteTable(sql)
        Return dt
    End Function

    Private Function GetDataFromAppRewardReqTax() As DataTable
        Dim sql As String = "select art.id, arr.id arr_id ,art.application_reward_request_id, arr.subject, dg.group_name product_group_name,arr.isinform,arr.ischkcount,arr.abnormality, " & vbNewLine
        sql += " arr.staff_id_control, tic.title_name || stc.first_name || ' ' || stc.last_name staff_name_control, arr.poscode_control,  " & vbNewLine
        sql += " psc.posname || ' ' || stc.staff_level posname_control, arr.offcode_control,arr.comment_control, " & vbNewLine
        sql += " arr.comment_initial, arr.staff_id_initial,tii.title_name || sti.first_name || ' ' || sti.last_name staff_name_initial, " & vbNewLine
        sql += " arr.poscode_initial, psi.posname || ' ' || sti.staff_level posname_initial, arr.offcode_initial, " & vbNewLine
        sql += " arr.comment_commander, arr.staff_id_commander, tico.title_name || stco.first_name || ' ' || stco.last_name staff_name_commander, " & vbNewLine
        sql += " arr.poscode_commander, psco.posname || ' ' || stco.staff_level posname_commander, arr.offcode_commander,arr.command, " & vbNewLine
        sql += " art.staff_id_confirm, ticf.title_name ||  stcf.first_name || ' ' || stcf.last_name staff_name_confirm, " & vbNewLine
        sql += " art.poscode_confirm, pscf.posname || ' ' || stcf.staff_level posname_confirm, art.offcode_confirm, " & vbNewLine
        sql += " nvl(aa.accuser_name,tia.title_name || sta.first_name || ' ' || sta.last_name) accuser_name, nvl(sta.posname,nvl(aa.accuser_posname,psa.posname || ' ' || sta.staff_level)) accuser_posname, " & vbNewLine
        sql += " to_char(aa.occurrence_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date, " & vbNewLine
        sql += " cc.bribe_money_p, cc.reward_money_p, " & vbNewLine
        sql += " cc.case_total_fine, cc.birbe_money, cc.reward_money, art.ask_lean, art.department_name_send, " & vbNewLine
        sql += " art.staff_id_ask, tik.title_name || stk.first_name || ' ' || stk.last_name staff_name_ask, " & vbNewLine
        sql += " art.poscode_ask, psk.posname || ' ' || stk.staff_level posname_ask, art.offcode_ask, " & vbNewLine
        sql += " art.approve_lean, art.staff_id_approve, tia.title_name || sta.first_name || ' ' || sta.last_name staff_name_approve, " & vbNewLine
        sql += " art.poscode_approve, psp.posname || ' ' || stp.staff_level posname_approve, art.offcode_approve,cc.track_no " & vbNewLine
        sql += " from application_reward_req_tax art " & vbNewLine
        sql += " inner join application_reward_request ar on ar.id=art.application_reward_request_id " & vbNewLine
        sql += " left join application_reward_req_report arr on ar.id=arr.application_reward_request_id " & vbNewLine
        sql += " inner join ed_office ed on ed.offcode=ar.offcode " & vbNewLine
        sql += " inner join compare_case cc on cc.id=ar.compare_case_id " & vbNewLine
        sql += " inner join application_arrest aa on aa.track_no=cc.track_no " & vbNewLine
        sql += " inner join duty_group dg on dg.group_id=aa.product_group_id " & vbNewLine
        sql += " left join staff stc on stc.idcard_no=arr.staff_id_control " & vbNewLine
        sql += " left join title tic on tic.title_code=stc.title_code " & vbNewLine
        sql += " left join position psc on psc.poscode=arr.poscode_control " & vbNewLine
        sql += " left join staff sti on sti.idcard_no=arr.staff_id_initial " & vbNewLine
        sql += " left join title tii on tii.title_code=sti.title_code " & vbNewLine
        sql += " left join position psi on psi.poscode=arr.poscode_initial " & vbNewLine
        sql += " left join staff stco on stco.idcard_no=arr.staff_id_commander " & vbNewLine
        sql += " left join title tico on tico.title_code=stco.title_code " & vbNewLine
        sql += " left join position psco on psco.poscode=arr.poscode_commander " & vbNewLine
        sql += " left join staff stcf on stcf.idcard_no=art.staff_id_confirm " & vbNewLine
        sql += " left join title ticf on ticf.title_code=stcf.title_code " & vbNewLine
        sql += " left join position pscf on pscf.poscode=art.poscode_confirm " & vbNewLine
        sql += " inner join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno " & vbNewLine
        sql += " left join title tia on tia.title_name=sta.title_code " & vbNewLine
        sql += " left join position psa on psa.poscode=trim(aa.accuser_poscode) " & vbNewLine
        sql += " left join staff stk on stk.idcard_no=art.staff_id_ask " & vbNewLine
        sql += " left join title tik on tik.title_code=stk.title_code " & vbNewLine
        sql += " left join position psk on psk.poscode=art.poscode_ask " & vbNewLine
        sql += " left join staff stp on stp.idcard_no=art.staff_id_approve " & vbNewLine
        sql += " left join title tip on tip.title_code=stp.title_code " & vbNewLine
        sql += " left join position psp on psp.poscode=art.poscode_approve " & vbNewLine
        sql += " where ar.id = '" & lblApplicationRewardRequestID.Text & "'" & vbNewLine

        Dim dt As DataTable = Config.ExcuteTable(sql)
        Return dt
    End Function

    Public Sub FillInData(ByVal ApplicationRewardRequestID As String, ByVal hpDt As DataTable)
        Try
            lblApplicationRewardRequestID.Text = ApplicationRewardRequestID
            Dim dt As DataTable = GetDataFromAppRewardReqTax()
            If dt.Rows.Count > 0 Then
                Dim dr As DataRow = dt.Rows(0)

                If IsDBNull(dr("track_no")) = False Then lblTrackNo.Text = dr("track_no")
                If IsDBNull(dr("subject")) = False Then lblReportName.Text = dr("subject")
                If IsDBNull(dr("product_group_name")) = False Then lblProductGroupName.Text = dr("product_group_name")
                If IsDBNull(dr("isinform")) = False Then chkInform.Checked = (dr("isinform") = "Y")
                If IsDBNull(dr("ischkcount")) = False Then chkCountInform.Checked = (dr("ischkcount") = "Y")
                If IsDBNull(dr("abnormality")) = False Then txtAbnormaly.Text = dr("abnormality")

                Dim exDt As DataTable = GetExhibitList()
                If exDt.Rows.Count > 0 Then
                    exDt.Columns.Add("seq")
                    For i As Integer = 0 To exDt.Rows.Count - 1
                        exDt.Rows(i)("seq") = (i + 1)
                    Next
                    gvExhibit.DataSource = exDt
                    gvExhibit.DataBind()
                End If
                exDt.Dispose()

                'ผู้ช่วยเหลือในคดี
                If hpDt.Rows.Count > 0 Then
                    hpDt.Columns.Add("seq")
                    For i As Integer = 0 To hpDt.Rows.Count - 1
                        hpDt.Rows(i)("seq") = (i + 1).ToString
                    Next

                    gvArrestHelper.DataSource = hpDt
                    gvArrestHelper.DataBind()
                End If
                hpDt.Dispose()

                'ผู้ควบคุมการจับกุม
                If IsDBNull(dr("staff_id_control")) = False Then lblControlStaffID.Text = dr("staff_id_control")
                If IsDBNull(dr("staff_name_control")) = False Then lblControlStaffName.Text = dr("staff_name_control")
                If IsDBNull(dr("poscode_control")) = False Then lblControlPoscode.Text = dr("poscode_control")
                If IsDBNull(dr("posname_control")) = False Then lblControlPosname.Text = dr("posname_control")
                If IsDBNull(dr("offcode_control")) = False Then lblControlOffcode.Text = dr("offcode_control")
                If IsDBNull(dr("comment_control")) = False Then txtCommentControl.Text = dr("comment_control")
                If IsDBNull(dr("comment_initial")) = False Then txtCommentInitial.Text = dr("comment_initial")

                'ความเห็นของผู้บังคับบัญชาชั้นต้น
                If IsDBNull(dr("comment_initial")) = False Then txtCommentInitial.Text = dr("comment_initial")
                If IsDBNull(dr("staff_id_initial")) = False Then lblInitialStaffID.Text = dr("staff_id_initial")
                If IsDBNull(dr("staff_name_initial")) = False Then lblInitialStaffName.Text = dr("staff_name_initial")
                If IsDBNull(dr("poscode_initial")) = False Then lblInitialStaffPoscode.Text = dr("poscode_initial")
                If IsDBNull(dr("posname_initial")) = False Then lblInitialStaffPosname.Text = dr("posname_initial")
                If IsDBNull(dr("offcode_initial")) = False Then lblInitialStaffOffcode.Text = dr("offcode_initial")

                'ความเห็นของผู้บังคับบัญชา
                If IsDBNull(dr("comment_commander")) = False Then txtCommentCommander.Text = dr("comment_commander")
                If IsDBNull(dr("staff_id_commander")) = False Then lblCommanderStaffID.Text = dr("staff_id_commander")
                If IsDBNull(dr("staff_name_commander")) = False Then lblCommanderStaffName.Text = dr("staff_name_commander")
                If IsDBNull(dr("poscode_commander")) = False Then lblCommanderPoscode.Text = dr("poscode_commander")
                If IsDBNull(dr("posname_commander")) = False Then lblCommanderPosname.Text = dr("posname_commander")
                If IsDBNull(dr("offcode_commander")) = False Then lblCommanderOffcode.Text = dr("offcode_commander")
                If IsDBNull(dr("command")) = False Then txtCommand.Text = dr("command")

                'ชื่อผู้รับรอง
                If IsDBNull(dr("staff_id_confirm")) = False Then lblConfirmStaffID.Text = dr("staff_id_confirm")
                If IsDBNull(dr("staff_name_confirm")) = False Then lblConfirmStaffName.Text = dr("staff_name_confirm")
                If IsDBNull(dr("poscode_confirm")) = False Then lblConfirmStaffPoscode.Text = dr("poscode_confirm")
                If IsDBNull(dr("posname_confirm")) = False Then lblConfirmStaffPosname.Text = dr("posname_confirm")
                If IsDBNull(dr("offcode_confirm")) = False Then lblConfirmStaffOffcode.Text = dr("offcode_confirm")

                'ชื่อผู้จับกุม
                If IsDBNull(dr("accuser_name")) = False Then lblAccuserName.Text = dr("accuser_name")
                If IsDBNull(dr("accuser_posname")) = False Then lblAccuserPosname.Text = dr("accuser_posname")
                If IsDBNull(dr("occurrence_date")) = False Then lblOccurrenceDate.Text = dr("occurrence_date")

                'จำนวนเงิน
                If IsDBNull(dr("case_total_fine")) = False Then
                    lblCaseTotalFine.Text = dr("case_total_fine")
                    alCaseTotalFine.Text = Config.BahtText(dr("case_total_fine"))
                End If

                If IsDBNull(dr("bribe_money_p")) = False Then lblBribeP.Text = dr("bribe_money_p")
                If IsDBNull(dr("reward_money_p")) = False Then lblRewardP.Text = dr("reward_money_p")
                If IsDBNull(dr("birbe_money")) = False Then
                    lblBribeMoney.Text = dr("birbe_money")
                    If Convert.ToDouble(dr("birbe_money")) > 0 Then
                        alBirbeText.Text = Config.BahtText(dr("birbe_money"))
                    End If
                End If

                If IsDBNull(dr("reward_money")) = False Then
                    lblRewardMoney.Text = dr("reward_money")
                    If Convert.ToDouble(dr("reward_money")) > 0 Then
                        alRewardText.Text = Config.BahtText(dr("reward_money"))
                    End If
                End If

                'ดำเนินการขออนุมัติ
                If IsDBNull(dr("ask_lean")) = False Then txtAskLean.Text = dr("ask_lean")
                If IsDBNull(dr("department_name_send")) = False Then txtDepartmentSend.Text = dr("department_name_send")
                If IsDBNull(dr("staff_id_ask")) = False Then lblAskStaffID.Text = dr("staff_id_ask")
                If IsDBNull(dr("staff_name_ask")) = False Then lblAskStaffName.Text = dr("staff_name_ask")
                If IsDBNull(dr("poscode_ask")) = False Then lblAskPoscode.Text = dr("poscode_ask")
                If IsDBNull(dr("posname_ask")) = False Then lblAskPosname.Text = dr("posname_ask")
                If IsDBNull(dr("offcode_ask")) = False Then lblAskOffcode.Text = dr("offcode_ask")

                'พิจารณาอนุมัติ
                If IsDBNull(dr("approve_lean")) = False Then txtApproveLean.Text = dr("approve_lean")
                If IsDBNull(dr("staff_id_approve")) = False Then lblApproveStaffID.Text = dr("staff_id_approve")
                If IsDBNull(dr("staff_name_approve")) = False Then lblApproveStaffName.Text = dr("staff_name_approve")
                If IsDBNull(dr("poscode_approve")) = False Then lblApproveStaffPoscode.Text = dr("poscode_approve")
                If IsDBNull(dr("posname_approve")) = False Then lblApproveStaffPosname.Text = dr("posname_approve")
                If IsDBNull(dr("offcode_approve")) = False Then lblApproveStaffOffcode.Text = dr("offcode_approve")
            End If
            dt.Dispose()
        Catch ex As Exception

        End Try
    End Sub

    Public Function SaveAppRewardReqTax(ByVal UserIDCard As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            Dim sql As String = "select id from application_reward_req_tax where application_reward_request_id ='" & lblApplicationRewardRequestID.Text.Trim & "' and rownum=1"
            Dim dt As DataTable = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                sql = "update application_reward_req_tax " & vbNewLine
                sql += " set staff_id_confirm=" & IIf(lblConfirmStaffID.Text.Trim = "", "null", "'" & lblConfirmStaffID.Text & "'") & vbNewLine
                sql += ", poscode_confirm = " & IIf(lblConfirmStaffPoscode.Text.Trim = "", "null", "'" & lblConfirmStaffPoscode.Text & "'") & vbNewLine
                sql += ", offcode_confirm = " & IIf(lblConfirmStaffOffcode.Text.Trim = "", "null", "'" & lblConfirmStaffOffcode.Text & "'") & vbNewLine
                sql += ", ask_lean = " & IIf(txtAskLean.Text.Trim = "", "null", "'" & txtAskLean.Text & "'") & vbNewLine
                sql += ", department_name_send = " & IIf(txtDepartmentSend.Text.Trim = "", "null", "'" & txtDepartmentSend.Text & "'") & vbNewLine
                sql += ", staff_id_ask = " & IIf(lblAskStaffID.Text.Trim = "", "null", "'" & lblAskStaffID.Text & "'") & vbNewLine
                sql += ", poscode_ask = " & IIf(lblAskPoscode.Text.Trim = "", "null", "'" & lblAskPoscode.Text & "'") & vbNewLine
                sql += ", offcode_ask = " & IIf(lblAskOffcode.Text.Trim = "", "null", "'" & lblAskOffcode.Text & "'") & vbNewLine
                sql += ", approve_lean = " & IIf(txtApproveLean.Text.Trim = "", "null", "'" & txtApproveLean.Text & "'") & vbNewLine
                sql += ", staff_id_approve = " & IIf(lblApproveStaffID.Text.Trim = "", "null", "'" & lblApproveStaffID.Text & "'") & vbNewLine
                sql += ", poscode_approve = " & IIf(lblApproveStaffPoscode.Text.Trim = "", "null", "'" & lblApproveStaffPoscode.Text & "'") & vbNewLine
                sql += ", offcode_approve = " & IIf(lblApproveStaffOffcode.Text.Trim = "", "null", "'" & lblApproveStaffOffcode.Text & "'") & vbNewLine
                sql += ", update_by ='" & UserIDCard & "', update_on=sysdate" & vbNewLine
                sql += " where application_reward_request_id = '" & lblApplicationRewardRequestID.Text & "'" & vbNewLine

                ret = Config.ExcuteNonQuery(sql, trans)
                If ret = True Then
                    dt = Config.ExcuteTable("select id from application_reward_req_report where application_reward_request_id='" & lblApplicationRewardRequestID.Text & "'", trans)
                    If dt.Rows.Count > 0 Then
                        sql = "update application_reward_req_report " & vbNewLine
                        sql += " set subject=" & IIf(lblReportName.Text.Trim = "", "null", "'" & lblReportName.Text & "'") & vbNewLine
                        sql += ", isinform = '" & IIf(chkInform.Checked, "Y", "N") & "'" & vbNewLine
                        sql += ", ischkcount = '" & IIf(chkCountInform.Checked, "Y", "N") & "'" & vbNewLine
                        sql += ", abnormality = " & IIf(txtAbnormaly.Text.Trim = "", "null", "'" & txtAbnormaly.Text & "'") & vbNewLine
                        sql += ", staff_id_control = " & IIf(lblControlStaffID.Text = "", "null", "'" & lblControlStaffID.Text & "'") & vbNewLine
                        sql += ", poscode_control = " & IIf(lblControlPoscode.Text = "", "null", "'" & lblControlPoscode.Text & "'") & vbNewLine
                        sql += ", offcode_control = " & IIf(lblControlOffcode.Text = "", "null", "'" & lblControlOffcode.Text & "'") & vbNewLine
                        sql += ", comment_control = " & IIf(txtCommentControl.Text = "", "null", "'" & txtCommentControl.Text & "'") & vbNewLine
                        sql += ", staff_id_initial = " & IIf(lblInitialStaffID.Text = "", "null", "'" & lblInitialStaffID.Text & "'") & vbNewLine
                        sql += ", poscode_initial = " & IIf(lblInitialStaffPoscode.Text = "", "null", "'" & lblInitialStaffPoscode.Text & "'") & vbNewLine
                        sql += ", offcode_initial = " & IIf(lblInitialStaffOffcode.Text = "", "null", "'" & lblInitialStaffOffcode.Text & "'") & vbNewLine
                        sql += ", comment_initial = " & IIf(txtCommentInitial.Text = "", "null", "'" & txtCommentInitial.Text & "'") & vbNewLine
                        sql += ", staff_id_commander = " & IIf(lblCommanderStaffID.Text = "", "null", "'" & lblCommanderStaffID.Text & "'") & vbNewLine
                        sql += ", poscode_commander = " & IIf(lblCommanderPoscode.Text = "", "null", "'" & lblCommanderPoscode.Text & "'") & vbNewLine
                        sql += ", offcode_commander = " & IIf(lblCommanderOffcode.Text = "", "null", "'" & lblCommanderOffcode.Text & "'") & vbNewLine
                        sql += ", comment_commander = " & IIf(txtCommentCommander.Text = "", "null", "'" & txtCommentCommander.Text & "'") & vbNewLine
                        sql += ", command = " & IIf(txtCommand.Text = "", "null", "'" & txtCommand.Text & "'") & vbNewLine
                        sql += ", update_by='" & UserIDCard & "',update_on=sysdate" & vbNewLine
                        sql += " where application_reward_request_id='" & lblApplicationRewardRequestID.Text & "'" & vbNewLine
                    Else
                        sql = "insert into application_reward_req_report(id,application_reward_request_id" & vbNewLine
                        sql += ",subject,isinform,ischkcount, abnormality, staff_id_control, poscode_control, offcode_control, comment_control" & vbNewLine
                        sql += ", staff_id_initial, poscode_initial, offcode_initial, comment_initial" & vbNewLine
                        sql += ", staff_id_commander, poscode_commander, offcode_commander, comment_commander, command, create_by, create_on)" & vbNewLine
                        sql += " values(APPLICATION_REWARD_REPORT_SEQ.nextval,'" & lblApplicationRewardRequestID.Text & "'" & vbNewLine
                        sql += ", " & IIf(lblReportName.Text.Trim = "", "null", "'" & lblReportName.Text & "'") & vbNewLine
                        sql += ", " & IIf(chkCountInform.Checked, "Y", "N") & "'" & vbNewLine
                        sql += ", " & IIf(txtAbnormaly.Text.Trim = "", "null", "'" & txtAbnormaly.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblControlStaffID.Text = "", "null", "'" & lblControlStaffID.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblControlPoscode.Text = "", "null", "'" & lblControlPoscode.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblControlOffcode.Text = "", "null", "'" & lblControlOffcode.Text & "'") & vbNewLine
                        sql += ", " & IIf(txtCommentControl.Text = "", "null", "'" & txtCommentControl.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblInitialStaffID.Text = "", "null", "'" & lblInitialStaffID.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblInitialStaffPoscode.Text = "", "null", "'" & lblInitialStaffPoscode.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblInitialStaffOffcode.Text = "", "null", "'" & lblInitialStaffOffcode.Text & "'") & vbNewLine
                        sql += ", " & IIf(txtCommentInitial.Text = "", "null", "'" & txtCommentInitial.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblCommanderStaffID.Text = "", "null", "'" & lblCommanderStaffID.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblCommanderPoscode.Text = "", "null", "'" & lblCommanderPoscode.Text & "'") & vbNewLine
                        sql += ", " & IIf(lblCommanderOffcode.Text = "", "null", "'" & lblCommanderOffcode.Text & "'") & vbNewLine
                        sql += ", " & IIf(txtCommentCommander.Text = "", "null", "'" & txtCommentCommander.Text & "'") & vbNewLine
                        sql += ", " & IIf(txtCommand.Text = "", "null", "'" & txtCommand.Text & "'") & vbNewLine
                        sql += ", '" & UserIDCard & "',sysdate)"
                    End If
                    ret = Config.ExcuteNonQuery(sql, trans)
                End If
            End If
            dt.Dispose()
        Catch ex As Exception
            ret = False
        End Try

        Return ret
    End Function



    Public Sub ClearForm()
        lblApplicationRewardRequestID.Text = "0"
        lblTrackNo.Text = ""
        lblReportName.Text = "รายงานการจับกุมคดี พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527"
        lblProductGroupName.Text = ""
        chkInform.Checked = False
        chkCountInform.Checked = False
        gvExhibit.DataSource = Nothing
        gvExhibit.DataBind()
        txtAbnormaly.Text = ""
        gvArrestHelper.DataSource = Nothing
        gvArrestHelper.DataBind()
        lblControlStaffName.Text = ""
        lblControlOffcode.Text = ""
        lblControlPoscode.Text = ""
        lblControlPosname.Text = ""
        lblControlStaffID.Text = ""
        txtCommentControl.Text = ""

        txtCommentInitial.Text = ""
        lblInitialStaffName.Text = ""
        lblInitialStaffID.Text = ""
        lblInitialStaffOffcode.Text = ""
        lblInitialStaffPoscode.Text = ""
        lblInitialStaffPosname.Text = ""

        txtCommentCommander.Text = ""
        lblCommanderOffcode.Text = ""
        lblCommanderPoscode.Text = ""
        lblCommanderPosname.Text = ""
        lblCommanderStaffID.Text = ""
        lblCommanderStaffName.Text = ""

        txtCommand.Text = ""
        lblConfirmStaffName.Text = ""
        lblConfirmStaffID.Text = ""
        lblConfirmStaffOffcode.Text = ""
        lblConfirmStaffPoscode.Text = ""
        lblConfirmStaffPosname.Text = ""

        lblAccuserName.Text = ""
        lblAccuserPosname.Text = ""
        lblOccurrenceDate.Text = ""

        lblCaseTotalFine.Text = ""
        alCaseTotalFine.Text = ""
        lblBribeP.Text = ""
        lblBribeMoney.Text = ""
        alBirbeText.Text = ""
        lblRewardP.Text = ""
        lblRewardMoney.Text = ""
        alRewardText.Text = ""

        txtAskLean.Text = ""
        txtDepartmentSend.Text = ""
        lblAskStaffName.Text = ""
        lblAskOffcode.Text = ""
        lblAskPoscode.Text = ""
        lblAskPosname.Text = ""
        lblAskStaffID.Text = ""

        txtApproveLean.Text = ""
        lblApproveStaffName.Text = ""
        lblApproveStaffID.Text = ""
        lblApproveStaffOffcode.Text = ""
        lblApproveStaffPoscode.Text = ""
        lblApproveStaffPosname.Text = ""
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

    Private Sub btnSearchControlStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchControlStaff.Click
        frmSearchControlStaff.ShowPop()
    End Sub

    Private Sub frmSearchControlStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchControlStaff.SelectStaff
        lblControlOffcode.Text = Offcode
        lblControlPoscode.Text = Poscode
        lblControlPosname.Text = PosName
        lblControlStaffID.Text = IdCardNo
        lblControlStaffName.Text = FullName
    End Sub

    Private Sub btnSearchInitialStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchInitialStaff.Click
        frmSearchInitialStaff.ShowPop()
    End Sub

    Private Sub frmSearchInitialStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchInitialStaff.SelectStaff
        lblInitialStaffID.Text = IdCardNo
        lblInitialStaffName.Text = FullName
        lblInitialStaffOffcode.Text = Offcode
        lblInitialStaffPoscode.Text = Poscode
        lblInitialStaffPosname.Text = PosName
    End Sub

    Private Sub btnSearchCommanderStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchCommanderStaff.Click
        frmSearchCommanderStaff.ShowPop()
    End Sub

    Private Sub frmSearchCommanderStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchCommanderStaff.SelectStaff
        lblCommanderOffcode.Text = Offcode
        lblCommanderPoscode.Text = Poscode
        lblCommanderPosname.Text = PosName
        lblCommanderStaffID.Text = IdCardNo
        lblCommanderStaffName.Text = FullName
    End Sub

    Private Sub btnSearchConfirmStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchConfirmStaff.Click
        frmSearchConfirmStaff.ShowPop()
    End Sub

    Private Sub frmSearchConfirmStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchConfirmStaff.SelectStaff
        lblConfirmStaffID.Text = IdCardNo
        lblConfirmStaffName.Text = FullName
        lblConfirmStaffOffcode.Text = Offcode
        lblConfirmStaffPoscode.Text = Poscode
        lblConfirmStaffPosname.Text = PosName
    End Sub

    Private Sub btnSearchAskStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchAskStaff.Click
        frmSearchAskStaff.ShowPop()
    End Sub

    Private Sub frmSearchAskStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchAskStaff.SelectStaff
        lblAskOffcode.Text = Offcode
        lblAskPoscode.Text = Poscode
        lblAskPosname.Text = PosName
        lblAskStaffID.Text = IdCardNo
        lblAskStaffName.Text = FullName
    End Sub

    Private Sub btnSearchStaffApprove_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchApproveStaff.Click
        frmSearchApproveStafff.ShowPop()
    End Sub

    Private Sub frmSearchApproveStafff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchApproveStafff.SelectStaff
        lblApproveStaffID.Text = IdCardNo
        lblApproveStaffName.Text = FullName
        lblApproveStaffOffcode.Text = Offcode
        lblApproveStaffPoscode.Text = Poscode
        lblApproveStaffPosname.Text = PosName
    End Sub

    Private Sub btnAddHelperSaffList_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAddHelperSaffList.Click
        frmPopHelperList.ShowPop()
    End Sub

    Private Sub frmPopHelperList_SelectArrestTeamList(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As System.Data.DataTable) Handles frmPopHelperList.SelectArrestTeamList
        AddStaffTeamList(gvArrestHelper, dt)
    End Sub

    Sub AddStaffTeamList(ByVal gv As GridView, ByVal dt As DataTable)
        Dim newdt As New DataTable
        With newdt
            .Columns.Add("STAFF_IDCARDNO")
            .Columns.Add("STAFF_POSCODE")
            .Columns.Add("STAFF_OFFCODE")
            .Columns.Add("fullname")
            .Columns.Add("posname")
            .Columns.Add("offname")
        End With

        For Each grv As GridViewRow In gv.Rows
            Dim lblidcard_no As Label = DirectCast(grv.FindControl("lblidcard_no"), Label)
            Dim lblposcode As Label = DirectCast(grv.FindControl("lblposcode"), Label)
            Dim lbloffcode As Label = DirectCast(grv.FindControl("lbloffcode"), Label)
            Dim lblfullname As Label = DirectCast(grv.FindControl("lblfullname"), Label)
            Dim lblposname As Label = DirectCast(grv.FindControl("lblposname"), Label)
            Dim lbloffname As Label = DirectCast(grv.FindControl("lbloffname"), Label)

            Dim dr As DataRow = newdt.NewRow
            dr("STAFF_IDCARDNO") = lblidcard_no.Text
            dr("STAFF_POSCODE") = lblposcode.Text
            dr("STAFF_OFFCODE") = lbloffcode.Text
            dr("fullname") = lblfullname.Text
            dr("posname") = lblposname.Text
            dr("offname") = lbloffname.Text
            newdt.Rows.Add(dr)
        Next

        For i As Integer = 0 To dt.Rows.Count - 1
            Dim dr As DataRow = newdt.NewRow
            dr("STAFF_IDCARDNO") = dt.Rows(i)("idcard_no").ToString
            dr("STAFF_POSCODE") = dt.Rows(i)("poscode").ToString
            dr("STAFF_OFFCODE") = dt.Rows(i)("offcode").ToString
            dr("fullname") = dt.Rows(i)("fullname").ToString
            dr("posname") = dt.Rows(i)("posname").ToString
            dr("offname") = dt.Rows(i)("offname").ToString
            newdt.Rows.Add(dr)
        Next

        newdt.Columns.Add("seq", GetType(String))
        For i As Integer = 0 To newdt.Rows.Count - 1
            newdt.Rows(i)("seq") = i + 1
        Next
        gv.DataSource = newdt
        gv.DataBind()

    End Sub

    Private Sub btnDeleteHelperStaffList_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnDeleteHelperStaffList.Click
        DeleteStaffTeamtList(gvArrestHelper)
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

                Dim dr As DataRow = newdt.NewRow
                dr("STAFF_IDCARDNO") = lblidcard_no.Text
                dr("STAFF_POSCODE") = lblposcode.Text
                dr("STAFF_OFFCODE") = lbloffcode.Text
                dr("fullname") = lblfullname.Text
                dr("posname") = lblposname.Text
                dr("offname") = lbloffname.Text
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