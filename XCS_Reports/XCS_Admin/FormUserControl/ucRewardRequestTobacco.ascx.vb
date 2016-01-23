Imports LinqDB.Common.Utilities
Partial Public Class ucRewardRequestTobacco
    Inherits System.Web.UI.UserControl

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Public Sub FillInData(ByVal ApplicationRewardRequestID As String)
        lblApplicationRewardRequestID.Text = ApplicationRewardRequestID
        Dim dt As DataTable = GetDataFromAppRewardTobacco()
        If dt.Rows.Count > 0 Then
            Dim dr As DataRow = dt.Rows(0)
            If IsDBNull(dr("sue_staff_name")) = False Then lblSueStaffName.Text = dr("sue_staff_name")
            If IsDBNull(dr("sue_posname")) = False Then lblSueStaffPosname.Text = dr("sue_posname")
            If IsDBNull(dr("case_fine")) = False Then
                lblCaseTotalFine.Text = dr("case_fine")
                If Convert.ToDouble(dr("case_fine")) > 0 Then
                    alCaseTotalFine.Text = Config.BahtText(dr("case_fine"))
                End If
            End If

            If IsDBNull(dr("reward_money_p")) = False Then lblRewardP.Text = dr("reward_money_p")
            If IsDBNull(dr("reward_money")) = False Then
                lblRewardMoney.Text = dr("reward_money")
                If Convert.ToDouble(dr("reward_money")) > 0 Then
                    alRewardText.Text = Config.BahtText(dr("reward_money"))
                End If
            End If

            If IsDBNull(dr("accuser_name")) = False Then lblAccuserName.Text = dr("accuser_name")
            If IsDBNull(dr("accuser_posname")) = False Then lblAccuserPosname.Text = dr("accuser_posname")
            If IsDBNull(dr("staff_id_arrest")) = False Then lblAccuserStaffID.Text = dr("staff_id_arrest")
            If IsDBNull(dr("poscode_arrest")) = False Then lblAccuserPoscode.Text = dr("poscode_arrest")
            If IsDBNull(dr("offcode_arrest")) = False Then lblAccuserOffcode.Text = dr("offcode_arrest")

            If IsDBNull(dr("lawyer_opinion")) = False Then txtLawerOpinion.Text = dr("lawyer_opinion")
            If IsDBNull(dr("law_director_position")) = False Then txtDirectorPosition.Text = dr("law_director_position")
            If IsDBNull(dr("law_director_opinion")) = False Then txtDirectorOpinion.Text = dr("law_director_opinion")
            If IsDBNull(dr("command")) = False Then txtCommand.Text = dr("command")
            If IsDBNull(dr("arrest_opinion")) = False Then txtArrestOpinion.Text = dr("arrest_opinion")
        End If
        dt.Dispose()
    End Sub

    Private Function GetDataFromAppRewardTobacco()
        Dim sql As String = "select art.id ,art.application_reward_request_id, tis.title_name || sts.first_name || ' ' || sts.last_name sue_staff_name,pss.posname || ' ' || sts.staff_level sue_posname, " & vbNewLine
        sql += " nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0) case_fine,nvl(cc.reward_money,0) reward_money, cc.reward_money_p, " & vbNewLine
        sql += " tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, nvl(sta.posname,psa.posname || ' ' || sta.staff_level) accuser_posname, " & vbNewLine
        sql += " art.staff_id_arrest, art.poscode_arrest, art.offcode_arrest,  " & vbNewLine
        sql += " art.lawyer_opinion, art.law_director_position, art.law_director_opinion, art.command, art.arrest_opinion" & vbNewLine
        sql += " from application_reward_req_tobacco art  " & vbNewLine
        sql += " inner join  application_reward_request ar on ar.id=art.application_reward_request_id " & vbNewLine
        sql += " inner join ed_office ed on ed.offcode=ar.offcode " & vbNewLine
        sql += " inner join compare_case cc on cc.id=ar.compare_case_id " & vbNewLine
        sql += " inner join application_arrest aa on aa.track_no=cc.track_no " & vbNewLine
        sql += " left join v_accuser_list_popup sta on sta.idcard_no=art.staff_id_arrest " & vbNewLine
        sql += " left join title tia on tia.title_code=sta.title_code " & vbNewLine
        sql += " left join position psa on psa.poscode=art.poscode_arrest " & vbNewLine
        sql += " left join staff sts on sts.idcard_no=cc.sue_staff_idcardno " & vbNewLine
        sql += " left join title tis on tis.title_code=sts.title_code " & vbNewLine
        sql += " left join position pss on pss.poscode=trim(cc.sue_poscode) " & vbNewLine
        sql += " where ar.id = '" & lblApplicationRewardRequestID.Text & "' " & vbNewLine

        Dim dt As DataTable = Config.ExcuteTable(sql)
        Return dt
    End Function
    Public Function SaveValidate() As Boolean
        If txtDirectorPosition.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุตำแหน่งของผู้อำนวยการสำนักกฎหมาย", Me.Page, txtDirectorPosition.ClientID)
            Return False
        End If

        Return True
    End Function
    Public Function SaveAppRewardReqTobacco(ByVal UserIDCard As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            Dim sql As String = "select id from application_reward_req_tobacco where application_reward_request_id ='" & lblApplicationRewardRequestID.Text.Trim & "' and rownum=1"
            Dim dt As DataTable = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                sql = "update application_reward_req_tobacco " & vbNewLine
                sql += " set staff_id_arrest = " & IIf(lblAccuserStaffID.Text.Trim = "", "null", "'" & lblAccuserStaffID.Text & "'") & vbNewLine
                sql += ", poscode_arrest = " & IIf(lblAccuserPoscode.Text.Trim = "", "null", "'" & lblAccuserPoscode.Text & "'") & vbNewLine
                sql += ", offcode_arrest = " & IIf(lblAccuserOffcode.Text.Trim = "", "null", "'" & lblAccuserOffcode.Text & "'") & vbNewLine
                sql += ", lawyer_opinion = " & IIf(txtLawerOpinion.Text.Trim = "", "null", "'" & txtLawerOpinion.Text & "'") & vbNewLine
                sql += ", law_director_position = " & IIf(txtDirectorPosition.Text.Trim = "", "null", "'" & txtDirectorPosition.Text & "'") & vbNewLine
                sql += ", law_director_opinion = " & IIf(txtDirectorOpinion.Text.Trim = "", "null", "'" & txtDirectorOpinion.Text & "'") & vbNewLine
                sql += ", command = " & IIf(txtCommand.Text.Trim = "", "null", "'" & txtCommand.Text & "'") & vbNewLine
                sql += ", arrest_opinion = " & IIf(txtArrestOpinion.Text.Trim = "", "null", "'" & txtArrestOpinion.Text & "'") & vbNewLine
                sql += " where application_reward_request_id = '" & lblApplicationRewardRequestID.Text & "'"
                ret = Config.ExcuteNonQuery(sql, trans)
            End If
            dt.Dispose()
        Catch ex As Exception
            ret = False
        End Try
        Return ret
    End Function

    Public Sub Clearform()
        lblApplicationRewardRequestID.Text = "0"
        lblSueStaffName.Text = ""
        lblSueStaffPosname.Text = ""
        lblCaseTotalFine.Text = ""
        alCaseTotalFine.Text = ""
        lblRewardP.Text = ""
        lblRewardMoney.Text = ""
        alRewardText.Text = ""
        lblAccuserName.Text = ""
        lblAccuserStaffID.Text = ""
        lblAccuserPoscode.Text = ""
        lblAccuserOffcode.Text = ""
        lblAccuserPosname.Text = ""
        txtLawerOpinion.Text = ""
        txtDirectorPosition.Text = ""
        txtDirectorOpinion.Text = ""
        txtCommand.Text = ""
        txtArrestOpinion.Text = ""
    End Sub

    Private Sub btnSearchAccuserStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchAccuserStaff.Click
        frmSearchAccuserStaff.ShowPop()
    End Sub

    Private Sub frmSearchAccuserStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchAccuserStaff.SelectStaff
        lblAccuserName.Text = FullName
        lblAccuserOffcode.Text = Offcode
        lblAccuserPoscode.Text = Poscode
        lblAccuserPosname.Text = PosName
        lblAccuserStaffID.Text = IdCardNo
    End Sub
End Class