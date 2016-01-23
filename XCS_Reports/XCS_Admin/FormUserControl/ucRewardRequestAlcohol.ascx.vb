Imports LinqDB.Common.Utilities
Partial Public Class ucRewardRequestAlcohol
    Inherits System.Web.UI.UserControl

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Public Function SaveValidate() As Boolean
        If txtAcceptDate.DateValue.Year = 1 Then
            Config.SetAlert("กรุณาระบุวันที่รับรองผลคดี", Me.Page, txtAcceptDate.TxtBox.ClientID)
            Return False
        End If
        If txtReportTo.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุเสนอ", Me.Page, txtReportTo.ClientID)
            Return False
        End If
        If txtAcceptLean.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุเรียน", Me.Page, txtAcceptLean.ClientID)
            Return False
        End If
        If lblAccuserStaffID.Text = "" Then
            Config.SetAlert("กรุณาระบุชื่อผู้จับกุม", Me.Page, txtAcceptLean.ClientID)
            Return False
        End If
        If txtAcceptDesc.Text = "" Then
            Config.SetAlert("กรุณาระบุขอรับรองว่า", Me.Page, txtAcceptDesc.ClientID)
            Return False
        End If
        If txtLeaderLean.Text = "" Then
            Config.SetAlert("กรุณาระบุเรียนหัวหน้าฝ่าย", Me.Page, txtLeaderLean.ClientID)
            Return False
        End If
        If rdiLeaderAccept.SelectedValue = "N" Then
            If txtLeaderDenyReason.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุเหตุผลที่หัวหน้าฝ่ายไม่รับรอง", Me.Page, txtLeaderDenyReason.ClientID)
                Return False
            End If
        End If
        If txtSectionDirectorLean.Text = "" Then
            Config.SetAlert("กรุณาระบุเรียนผู้อำนวยการส่วน", Me.Page, txtSectionDirectorLean.ClientID)
            Return False
        End If
        If rdiSectionDirectorAccept.SelectedValue = "N" Then
            If txtSectionDirectorDenyReason.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุเหตุผลที่ผู้อำนวยการส่วนไม่รับรอง", Me.Page, txtSectionDirectorDenyReason.ClientID)
                Return False
            End If
        End If
        If rdiResDirectorAccept.SelectedValue = "N" Then
            If txtResDirectorDenyReason.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุเหตุผลที่ผู้อำนวยการสำนักไม่รับรอง", Me.Page, txtResDirectorDenyReason.ClientID)
                Return False
            End If
        End If

        Return True
    End Function

    Private Function GetDataFromAppRewardReqAlcohol() As DataTable
        Dim sql As String = " select ara.id, ara.application_reward_request_id, ara.report_to, " & vbNewLine
        sql += " ara.accept_date, tip.title_name || stp.first_name || ' ' || stp.last_name prove_staff_name, " & vbNewLine
        sql += "  psp.posname || ' ' || stp.staff_level prove_posname, " & vbNewLine
        sql += " tis.title_name || sts.first_name || ' ' || sts.last_name sue_staff_name, " & vbNewLine
        sql += " pss.posname || ' ' || sts.staff_level sue_posname, cc.case_total_fine, cc.birbe_money,cc.reward_money, " & vbNewLine
        sql += " cc.bribe_money_p, cc.reward_money_p, cc.treasury_money_p, " & vbNewLine
        sql += " ara.accept_lean, ara.staff_id_arrest , tia.title_name || sta.first_name || ' ' || sta.last_name arrest_staff_name, " & vbNewLine
        sql += " ara.poscode_arrest, nvl(sta.posname,psa.posname || ' ' || sta.staff_level) posname_arrest, ara.offcode_arrest, nvl(sta.offname,eda.offname) offname_arrest, " & vbNewLine
        sql += " ara.accept_desc, ara.leader_lean, ara.leader_accept,ara.leader_accept_reason,ara.leader_deny_reason, " & vbNewLine
        sql += " ara.staff_id_leader, til.title_name || stl.first_name || ' ' || stl.last_name leader_staff_name, " & vbNewLine
        sql += " ara.poscode_leader, psl.posname || ' ' || stl.staff_level leader_posname, " & vbNewLine
        sql += " ara.section_director_lean, ara.section_director_accept, ara.section_director_accept_reason,ara.section_director_deny_reason, " & vbNewLine
        sql += " ara.staff_id_section_director, tid.title_name || std.first_name || ' ' || std.last_name section_director_staff_name, " & vbNewLine
        sql += " ara.poscode_section_director, psd.posname || ' ' || std.staff_level section_director_posname, " & vbNewLine
        sql += " ara.res_director_accept, ara.res_director_accept_reason, ara.res_director_deny_reason, " & vbNewLine
        sql += " ara.staff_id_res_director,tird.title_name || strd.first_name || ' ' || strd.last_name res_director_staff_name, " & vbNewLine
        sql += " ara.poscode_res_director, psrd.posname || ' ' || strd.staff_level res_director_posname " & vbNewLine
        sql += " from application_reward_req_alcohol ara " & vbNewLine
        sql += " inner join application_reward_request ar on ar.id=ara.application_reward_request_id " & vbNewLine
        sql += " inner join compare_case cc on cc.id=ar.compare_case_id " & vbNewLine
        sql += " inner join application_arrest aa on aa.track_no=cc.track_no " & vbNewLine
        sql += " left join application_arrest_prove aap on aap.track_no=aa.track_no " & vbNewLine
        sql += " left join staff stp on stp.idcard_no=aap.staff_idcardno_prove " & vbNewLine
        sql += " left join title tip on tip.title_code=stp.title_code " & vbNewLine
        sql += " left join position psp on psp.poscode=aap.staff_prove_poscode " & vbNewLine
        sql += " left join staff sts on sts.idcard_no=cc.sue_staff_idcardno " & vbNewLine
        sql += " left join title tis on tis.title_code=sts.title_code " & vbNewLine
        sql += " left join position pss on pss.poscode=trim(cc.sue_poscode) " & vbNewLine
        sql += " left join v_accuser_list_popup sta on sta.idcard_no=ara.staff_id_arrest " & vbNewLine
        sql += " left join title tia on tia.title_code=sta.title_code " & vbNewLine
        sql += " left join position psa on psa.poscode=ara.poscode_arrest " & vbNewLine
        sql += " left join ed_office eda on eda.offcode=ara.offcode_arrest " & vbNewLine
        sql += " left join staff stl on stl.idcard_no=ara.staff_id_leader " & vbNewLine
        sql += " left join title til on til.title_code=stl.title_code " & vbNewLine
        sql += " left join position psl on psl.poscode=ara.poscode_leader " & vbNewLine
        sql += " left join staff std on std.idcard_no=ara.staff_id_section_director " & vbNewLine
        sql += " left join title tid on tid.title_code=std.title_code " & vbNewLine
        sql += " left join position psd on psd.poscode=ara.poscode_section_director " & vbNewLine
        sql += " left join staff strd on strd.idcard_no=ara.staff_id_res_director " & vbNewLine
        sql += " left join title tird on tird.title_code=strd.title_code " & vbNewLine
        sql += " left join position psrd on psrd.poscode=ara.poscode_res_director " & vbNewLine
        sql += " where ara.application_reward_request_id='" & lblApplicationRewardRequestID.Text & "' " & vbNewLine

        Dim dt As DataTable = Config.ExcuteTable(sql)
        Return dt
    End Function

    Public Sub FillInData(ByVal ApplicationRewardRequestID As String)
        lblApplicationRewardRequestID.Text = ApplicationRewardRequestID
        Try
            Dim dt As DataTable = GetDataFromAppRewardReqAlcohol()
            If dt.Rows.Count > 0 Then
                Dim dr As DataRow = dt.Rows(0)
                txtAcceptDate.DateValue = Convert.ToDateTime(dr("accept_date"))
                If IsDBNull(dr("report_to")) = False Then txtReportTo.Text = dr("report_to")
                If IsDBNull(dr("prove_staff_name")) = False Then lblProveStaffName.Text = dr("prove_staff_name")
                If IsDBNull(dr("prove_posname")) = False Then lblProveStaffPosname.Text = dr("prove_posname")
                If IsDBNull(dr("sue_staff_name")) = False Then lblSueStaffName.Text = dr("sue_staff_name")
                If IsDBNull(dr("sue_posname")) = False Then lblSueStaffPosname.Text = dr("sue_posname")
                If IsDBNull(dr("case_total_fine")) = False Then
                    lblCaseTotalFine.Text = dr("case_total_fine")
                    alCaseTotalFine.Text = Config.BahtText(dr("case_total_fine"))
                End If

                If IsDBNull(dr("bribe_money_p")) = False Then lblBribeP.Text = dr("bribe_money_p")
                If IsDBNull(dr("reward_money_p")) = False Then lblRewardP.Text = dr("reward_money_p")
                If IsDBNull(dr("birbe_money")) = False Then
                    lblBribeMoney.Text = dr("birbe_money")
                    alBirbeText.Text = Config.BahtText(dr("birbe_money"))
                End If

                If IsDBNull(dr("reward_money")) = False Then
                    lblRewardMoney.Text = dr("reward_money")
                    alRewardText.Text = Config.BahtText(dr("reward_money"))
                End If

                If IsDBNull(dr("accept_lean")) = False Then txtAcceptLean.Text = dr("accept_lean")
                If IsDBNull(dr("staff_id_arrest")) = False Then lblAccuserStaffID.Text = dr("staff_id_arrest")
                If IsDBNull(dr("arrest_staff_name")) = False Then lblAccuserName.Text = dr("arrest_staff_name")
                If IsDBNull(dr("poscode_arrest")) = False Then lblAccuserPoscode.Text = dr("poscode_arrest")
                If IsDBNull(dr("posname_arrest")) = False Then lblAccuserPosname.Text = dr("posname_arrest")
                If IsDBNull(dr("offcode_arrest")) = False Then lblAccuserOffcode.Text = dr("offcode_arrest")
                If IsDBNull(dr("offname_arrest")) = False Then lblAccuserOffname.Text = dr("offname_arrest")
                If IsDBNull(dr("accept_desc")) = False Then txtAcceptDesc.Text = dr("accept_desc")

                If IsDBNull(dr("leader_lean")) = False Then txtLeaderLean.Text = dr("leader_lean")
                If IsDBNull(dr("leader_accept")) = False Then rdiLeaderAccept.SelectedValue = dr("leader_accept")
                If IsDBNull(dr("leader_deny_reason")) = False Then txtLeaderDenyReason.Text = dr("leader_deny_reason")
                If IsDBNull(dr("staff_id_leader")) = False Then lblLeaderStaffID.Text = dr("staff_id_leader")
                If IsDBNull(dr("leader_staff_name")) = False Then lblLeaderName.Text = dr("leader_staff_name")
                If IsDBNull(dr("poscode_leader")) = False Then lblLeaderPoscode.Text = dr("poscode_leader")
                If IsDBNull(dr("leader_posname")) = False Then lblLeaderPosname.Text = dr("leader_posname")

                If IsDBNull(dr("section_director_lean")) = False Then txtSectionDirectorLean.Text = dr("section_director_lean")
                If IsDBNull(dr("section_director_accept")) = False Then rdiSectionDirectorAccept.SelectedValue = dr("section_director_accept")
                If IsDBNull(dr("section_director_accept_reason")) = False Then txtSectionDirectorDenyReason.Text = dr("section_director_accept_reason")
                If IsDBNull(dr("staff_id_section_director")) = False Then lblSectionDirectorStaffID.Text = dr("staff_id_section_director")
                If IsDBNull(dr("section_director_staff_name")) = False Then lblSectionDirectorName.Text = dr("section_director_staff_name")
                If IsDBNull(dr("poscode_section_director")) = False Then lblSectionDirectorPoscode.Text = dr("poscode_section_director")
                If IsDBNull(dr("section_director_posname")) = False Then lblSectionDirectorPosname.Text = dr("section_director_posname")
                If IsDBNull(dr("res_director_accept")) = False Then rdiResDirectorAccept.SelectedValue = dr("res_director_accept")
                If IsDBNull(dr("res_director_deny_reason")) = False Then txtResDirectorDenyReason.Text = dr("res_director_deny_reason")
                If IsDBNull(dr("staff_id_res_director")) = False Then lblResDirectorStaffID.Text = dr("staff_id_res_director")
                If IsDBNull(dr("res_director_staff_name")) = False Then lblResDirectorName.Text = dr("res_director_staff_name")
                If IsDBNull(dr("poscode_res_director")) = False Then lblResDirectorPoscode.Text = dr("poscode_res_director")
                If IsDBNull(dr("res_director_posname")) = False Then lblResDirectorPosname.Text = dr("res_director_posname")
            End If
            dt.Dispose()
        Catch ex As Exception

        End Try
    End Sub

    Public Function SaveAppRewardReqAlcohol(ByVal UserIDCard As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            Dim sql As String = "select id from application_reward_req_alcohol where application_reward_request_id ='" & lblApplicationRewardRequestID.Text.Trim & "' and rownum=1"
            Dim dt As DataTable = Config.ExcuteTable(sql, trans)
            If dt.Rows.Count > 0 Then
                Dim vAcceptDate As String = txtAcceptDate.DateValue.ToString("yyyy-MM-dd HH:mm:ss", New Globalization.CultureInfo("en-US"))

                sql = "update application_reward_req_alcohol " & vbNewLine
                sql += " set accept_date = to_date('" & vAcceptDate & "','yyyy-mm-dd hh24:mi:ss')" & vbNewLine
                sql += ", staff_id_arrest = '" & lblAccuserStaffID.Text & "'" & vbNewLine
                sql += ", poscode_arrest = '" & lblAccuserPoscode.Text & "'" & vbNewLine
                sql += ", offcode_arrest = '" & lblAccuserOffcode.Text & "'" & vbNewLine
                sql += ", report_to = '" & txtReportTo.Text & "'" & vbNewLine
                sql += ", accept_lean='" & txtAcceptLean.Text & "'" & vbNewLine
                sql += ", accept_desc = '" & txtAcceptDesc.Text & "'" & vbNewLine
                sql += ", leader_lean = '" & txtLeaderLean.Text & "'" & vbNewLine
                sql += ", leader_accept = '" & rdiLeaderAccept.SelectedValue & "'" & vbNewLine
                sql += ", leader_deny_reason = '" & txtLeaderDenyReason.Text & "'" & vbNewLine
                sql += ", staff_id_leader = '" & lblLeaderStaffID.Text & "'" & vbNewLine
                sql += ", poscode_leader = '" & lblLeaderPoscode.Text & "'" & vbNewLine
                sql += ", section_director_lean ='" & txtSectionDirectorLean.Text & "'" & vbNewLine
                sql += ", section_director_accept = '" & rdiSectionDirectorAccept.SelectedValue & "'" & vbNewLine
                sql += ", section_director_deny_reason = '" & txtSectionDirectorDenyReason.Text & "'" & vbNewLine
                sql += ", staff_id_section_director = '" & lblSectionDirectorStaffID.Text & "'" & vbNewLine
                sql += ", poscode_section_director = '" & lblSectionDirectorPoscode.Text & "'" & vbNewLine
                sql += ", res_director_accept = '" & rdiResDirectorAccept.SelectedValue & "'" & vbNewLine
                sql += ", res_director_deny_reason = '" & txtResDirectorDenyReason.Text & "'" & vbNewLine
                sql += ", staff_id_res_director = '" & lblResDirectorStaffID.Text & "'" & vbNewLine
                sql += ", poscode_res_director = '" & lblResDirectorPoscode.Text & "'" & vbNewLine
                sql += ", update_by='" & UserIDCard & "',update_on=sysdate " & vbNewLine
                sql += " where application_reward_request_id = '" & lblApplicationRewardRequestID.Text & "'" & vbNewLine

                ret = Config.ExcuteNonQuery(sql, trans)
            End If
            dt.Dispose()
        Catch ex As Exception
            ret = False
        End Try

        Return ret
    End Function
    Public Sub ClearForm()
        lblApplicationRewardRequestID.Text = "0"
        txtAcceptDate.DateValue = DateTime.Now
        txtReportTo.Text = ""
        lblProveStaffName.Text = ""
        lblProveStaffPosname.Text = ""
        lblSueStaffName.Text = ""
        lblSueStaffPosname.Text = ""
        lblCaseTotalFine.Text = ""
        lblBribeP.Text = ""
        lblBribeMoney.Text = ""
        lblRewardP.Text = ""
        lblRewardMoney.Text = ""
        txtAcceptLean.Text = ""
        lblAccuserName.Text = ""
        lblAccuserStaffID.Text = ""
        lblAccuserPoscode.Text = ""
        lblAccuserOffcode.Text = ""
        lblAccuserPosname.Text = ""
        lblAccuserOffname.Text = ""
        txtAcceptDesc.Text = ""

        txtLeaderLean.Text = ""
        rdiLeaderAccept.SelectedValue = "Y"
        txtLeaderDenyReason.Text = ""
        lblLeaderName.Text = ""
        lblLeaderStaffID.Text = ""
        lblLeaderPoscode.Text = ""
        btnSearchLeaderStaff.Text = ""
        lblLeaderPosname.Text = ""

        txtSectionDirectorLean.Text = ""
        rdiSectionDirectorAccept.SelectedValue = "Y"
        txtSectionDirectorDenyReason.Text = ""
        lblSectionDirectorName.Text = ""
        lblSectionDirectorStaffID.Text = ""
        lblSectionDirectorPoscode.Text = ""
        btnSearchSectionDirectorStaff.Text = ""
        lblSectionDirectorPosname.Text = ""

        rdiResDirectorAccept.SelectedValue = "Y"
        txtResDirectorDenyReason.Text = ""
        lblResDirectorName.Text = ""
        lblResDirectorStaffID.Text = ""
        lblResDirectorPoscode.Text = ""
        btnSearchResDirectorStaff.Text = ""
        lblResDirectorPosname.Text = ""
    End Sub

    Protected Sub btnSearchAccuserStaff_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnSearchAccuserStaff.Click
        frmSearchAccuserStaff.ShowPop()
    End Sub

    Private Sub frmSearchArrestStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchAccuserStaff.SelectStaff
        lblAccuserName.Text = FullName
        lblAccuserOffcode.Text = Offcode
        lblAccuserOffname.Text = Offname
        lblAccuserPoscode.Text = Poscode
        lblAccuserPosname.Text = PosName
        lblAccuserStaffID.Text = IdCardNo
    End Sub

    Private Sub btnSearchLeaderStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchLeaderStaff.Click
        frmSearchLeaderStaff.ShowPop()
    End Sub

    Private Sub frmSearchLeaderStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchLeaderStaff.SelectStaff
        lblLeaderName.Text = FullName
        lblLeaderPoscode.Text = Poscode
        lblLeaderPosname.Text = PosName
        lblLeaderStaffID.Text = IdCardNo
    End Sub

    Private Sub btnSearchSectionDirectorStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchSectionDirectorStaff.Click
        frmSearchSectionDirectorStaff.ShowPop()
    End Sub

    Private Sub frmSearchSectionDirectorStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchSectionDirectorStaff.SelectStaff
        lblSectionDirectorName.Text = FullName
        lblSectionDirectorPoscode.Text = Poscode
        lblSectionDirectorPosname.Text = PosName
        lblSectionDirectorStaffID.Text = IdCardNo
    End Sub

    Private Sub btnSearchResDirectorStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchResDirectorStaff.Click
        frmSearchResDirectorStaff.ShowPop()
    End Sub

    Private Sub frmSearchResDirectorStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchResDirectorStaff.SelectStaff
        lblResDirectorName.Text = FullName
        lblResDirectorPoscode.Text = Poscode
        lblResDirectorPosname.Text = PosName
        lblResDirectorStaffID.Text = IdCardNo
    End Sub
End Class