Imports LinqDB.Common.Utilities

Partial Public Class ucCompareCase
    Inherits System.Web.UI.UserControl

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            SetDDLCompareOffice()
            SetDDlProvince()
            SetDDLCompareAuthority()


            txtCompareCaseNo1.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtCompareCaseNo1.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtCompareCaseNo2.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtCompareCaseNo2.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtCaseFine.Attributes.Add("OnKeyPress", "ChkMinusDbl(this,event);")
            txtCaseFine.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtTreasuryP.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtTreasuryP.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtTreasuryMoney.Attributes.Add("OnKeyPress", "ChkMinusDbl(this,event);")
            txtTreasuryMoney.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtBribeP.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtBribeP.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtBribeMoney.Attributes.Add("OnKeyPress", "ChkMinusDbl(this,event);")
            txtBribeMoney.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtRewardP.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtRewardP.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtRewardMoney.Attributes.Add("OnKeyPress", "ChkMinusDbl(this,event);")
            txtRewardMoney.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")
        End If
    End Sub

#Region "SetDDL"
    Sub SetDDl(ByVal sql As String, ByVal ddl As DropDownList, Optional ByVal IsDefault As Boolean = True)
        Try
            Dim dt As New DataTable
            dt = Config.ExcuteTable(sql)
            ddl.DataSource = dt
            ddl.DataBind()
            If IsDefault = True Then
                ddl.Items.Insert(0, New ListItem("--- เลือก ---", "0"))
            End If
        Catch ex As Exception

        End Try
    End Sub

    Sub SetDDlProvince()
        Dim sql As String = "Select id,Province_Code,Province_Name From Province order by Province_Name"
        SetDDl(sql, ddlCompareProvince)

        SetDDl(sql, ddlAccuserProvince)
    End Sub

    Sub SetDDlDistrict(ByVal Province_Code As String, ByVal ddl As DropDownList)
        Dim sql As String = "Select id,District_Code,District_Name From District Where Province_Code ='" & Province_Code & "' order by District_Name"
        SetDDl(sql, ddl)
    End Sub

    Sub SetDDlSubDistrict(ByVal District_Code As String, ByVal ddl As DropDownList)
        Dim sql As String = "Select id,SubDistrict_Code,SubDistrict_Name from SubDistrict Where District_Code='" & District_Code & "' order by SubDistrict_Name"
        SetDDl(sql, ddl)
    End Sub

    Private Sub ddlCompareProvince_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlCompareProvince.SelectedIndexChanged
        SetDDlDistrict(ddlCompareProvince.SelectedValue, ddlCompareDistrict)
        SetDDlSubDistrict(ddlCompareDistrict.SelectedValue, ddlCompareSubDistrict)
    End Sub

    Private Sub ddlCompareDistrict_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlCompareDistrict.SelectedIndexChanged
        SetDDlSubDistrict(ddlCompareDistrict.SelectedValue, ddlCompareSubDistrict)
    End Sub


    Private Sub ddlAccuserProvince_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlAccuserProvince.SelectedIndexChanged
        SetDDlDistrict(ddlAccuserProvince.SelectedValue, ddlAccuserDistrict)
        SetDDlSubDistrict(ddlAccuserDistrict.SelectedValue, ddlAccuserSubdistrict)
    End Sub

    Private Sub ddlAccuserDistrict_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlAccuserDistrict.SelectedIndexChanged
        SetDDlSubDistrict(ddlAccuserDistrict.SelectedValue, ddlAccuserSubdistrict)
    End Sub

    Private Sub SetDDLCompareAuthority()
        Dim sql As String = "select id, authority_name from compare_authority order by authority_name"
        SetDDl(sql, ddlCompareAuthority)
    End Sub

    Private Sub SetDDLCompareOffice()
        Dim sql As String = "select offcode, short_name from ed_office order by short_name "
        SetDDl(sql, ddlCompareOffice)
    End Sub

#End Region 'SetDDL

    Public Function SaveValidate() As Boolean
        If txtCompareCaseNo1.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุเลขที่คดีเปรียบเทียบ", Me.Page, txtCompareCaseNo1.ClientID)
            Return False
        End If
        If txtCompareCaseNo2.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุปีที่คดีเปรียบเทียบ", Me.Page, txtCompareCaseNo2.ClientID)
            Return False
        End If
        If txtCompareCaseDate.TxtBox.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุวันที่เปรียบเทียบปรับ", Me.Page, txtCompareCaseDate.ClientID)
            Return False
        End If

        If chkNoneOffice.Checked = False Then
            If ddlCompareOffice.SelectedValue = "0" Then
                Config.SetAlert("กรุณาเลือกที่ทำการเปรียบเทียบ", Me.Page, ddlCompareOffice.ClientID)
                Return False
            End If
        Else
            If txtCompareOffice.Text.Trim = "" Then
                Config.SetAlert("กรุณาระบุชื่อที่ทำการเปรียบเทียบ", Me.Page, txtCompareOffice.Text)
                Return False
            End If
        End If

        If ddlCompareProvince.SelectedValue = "0" Then
            Config.SetAlert("กรุณาเลือกจังหวัด", Me.Page, ddlCompareProvince.ClientID)
            Return False
        End If
        If ddlCompareDistrict.SelectedValue = "0" Then
            Config.SetAlert("กรุณาเลือกอำเภอ", Me.Page, ddlCompareDistrict.ClientID)
            Return False
        End If
        If ddlCompareSubDistrict.SelectedValue = "0" Then
            Config.SetAlert("กรุณาเลือกตำบล", Me.Page, ddlCompareSubDistrict.ClientID)
            Return False
        End If
        If rdiManageType.SelectedValue = "1" Then
            If ddlCompareAuthority.SelectedValue = "0" Then
                Config.SetAlert("กรุณาเลือกอำนาจในการเปรียบเทียบ", Me.Page, ddlCompareAuthority.ClientID)
                Return False
            End If
        End If
        If lblSueStaffID.Text.Trim = "" Then
            Config.SetAlert("กรุณาเลือกเจ้าหน้าที่ดำเนินคดี", Me.Page, txtCompareCaseNo1.ClientID)
            Return False
        End If

        If ddlIndictment.SelectedValue = "" Then
            Config.SetAlert("กรุณาระบุข้อกล่าวหา", Me.Page, ddlIndictment.ClientID)
            Return False
        End If

        If txtAdministration.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุการดำเนินการ", Me.Page, txtAdministration.ClientID)
            Return False
        End If

        If txtAccuserTestimony.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุคำให้การของผู้กล่าวโทษ", Me.Page, txtAccuserTestimony.ClientID)
            Return False
        End If

        If lblLegislationID.Text = "1" And Convert.ToDouble(txtBribeMoney.Text.Replace(",", "")) > 150000 Then
            Config.SetAlert("จำนวนเงินสินบนต้องไม่เกิน 150,000.00 บาท", Me.Page, txtBribeMoney.ClientID)
            Return False
        End If
        If lblLegislationID.Text = "1" And Convert.ToDouble(txtRewardMoney.Text.Replace(",", "")) > 150000 Then
            Config.SetAlert("จำนวนเงินรางวัลต้องไม่เกิน 150,000.00 บาท", Me.Page, txtRewardMoney.ClientID)
            Return False
        End If
        If lblAllP.Text <> "100" Then
            Config.SetAlert("เปอร์เซ็นการแบ่งเงินต้องไม่เกิน 100%", Me.Page, lblAllP.ClientID)
            Return False
        End If
        If lblAllMoney.Text <> lblCaseTotalFine.Text Then
            Config.SetAlert("จำนวนเงินค่าปรับรวมไม่ถูกต้อง", Me.Page, txtCaseFine.ClientID)
            Return False
        End If
        If ChkDupCompareCaseNo() = True Then
            Config.SetAlert("เลขที่คดีเปรียบเทียบปรับซ้ำ", Me.Page, txtCompareCaseNo1.ClientID)
            Return False
        End If

        Return True
    End Function

    Private Function ChkDupCompareCaseNo() As Boolean
        Dim ret As Boolean = False

        Dim vCaseNo As String = txtCompareCaseNo1.Text & "/" & txtCompareCaseNo2.Text
        Dim vCaseNoneOffice As String = "N"

        If chkNoneOffice.Checked = True Then
            vCaseNoneOffice = "Y"
        End If

        Dim sql As String = "select cc.id "
        sql += " from compare_case cc "
        sql += " inner join book_impeachment bi on bi.track_no=cc.track_no"
        sql += " where cc.compare_case_no='" & vCaseNo & "'"
        sql += " and cc.compare_office='" & ddlCompareOffice.SelectedValue & "'"
        sql += " and bi.case_none_office='" & vCaseNoneOffice & "'"
        sql += " and cc.track_no<>'" & lblTrackNo.Text & "'"

        Dim dt As DataTable = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            ret = True
        End If
        dt.Dispose()

        Return ret
    End Function

    Public Sub FillInData(ByVal TrackNo As String)
        lblTrackNo.Text = TrackNo
        'เปรียบเทียบปรับ
        Dim dtCompare As DataTable = GetDataFromCompareCase(lblTrackNo.Text)
        If dtCompare.Rows.Count > 0 Then
            Dim dr As DataRow = dtCompare.Rows(0)

            lblBookImpeachmentID.Text = dr("book_impeachment_id")
            lblLegislationID.Text = dr("legislation_id")
            If IsDBNull(dr("application_notice_arrest_id")) = False Then lblIsNotice.Text = "Y"
            lblLawbreakerQty.Text = dr("lawbreaker_qty")

            If IsDBNull(dr("compare_case_no")) = False Then
                Dim vCaseNo() As String = Split(dr("compare_case_no").ToString, "/")
                If vCaseNo.Length = 2 Then
                    txtCompareCaseNo1.Text = Replace(vCaseNo(0), "น", "")
                    txtCompareCaseNo2.Text = vCaseNo(1)
                Else
                    txtCompareCaseNo1.Text = Replace(dr("case_id"), "น", "")
                End If
            End If

            If IsDBNull(dr("compare_case_date")) = False Then txtCompareCaseDate.DateValue = Convert.ToDateTime(dr("compare_case_date"))

            If dr("case_none_office") = "Y" Then
                lblCompareCaseNonOffice.Visible = True
                chkNoneOffice.Checked = True

                txtCompareOffice.Visible = True
                ddlCompareOffice.Visible = False

                If IsDBNull(dr("case_non_office_name")) = False Then txtCompareOffice.Text = dr("case_non_office_name")
            Else
                lblCompareCaseNonOffice.Visible = False
                chkNoneOffice.Checked = False

                txtCompareOffice.Visible = False
                ddlCompareOffice.Visible = True
            End If

            'ที่ทำการเปรียบเทียบ
            If IsDBNull(dr("compare_office")) = False Then
                ddlCompareOffice.SelectedValue = dr("compare_office")
            Else
                'ถ้าคดียังไม่เปรียบเทียบปรับ ให้แสดงค่าเริ่มต้นหน่วยงานเปรียบเทียบปรับตาม หน่วยงานของคดีนั้น
                ddlCompareOffice.SelectedValue = dr("offcode")
            End If
            ddlCompareOffice_SelectedIndexChanged(Nothing, Nothing)

            If IsDBNull(dr("compare_province")) = False Then
                ddlCompareProvince.SelectedValue = dr("compare_province")
                ddlCompareProvince_SelectedIndexChanged(Nothing, Nothing)

                If IsDBNull(dr("compare_district")) = False Then
                    ddlCompareDistrict.SelectedValue = dr("compare_district")
                    ddlCompareDistrict_SelectedIndexChanged(Nothing, Nothing)

                    If IsDBNull(dr("compare_subdistrict")) = False Then
                        ddlCompareSubDistrict.SelectedValue = dr("compare_subdistrict")
                    End If
                End If
            End If


            'ชื่อผู้กล่าวหา
            If IsDBNull(dr("accuser_name")) = False Then lblAccuserName.Text = dr("accuser_name")
            If IsDBNull(dr("accuser_province")) = False Then
                ddlAccuserProvince.SelectedValue = dr("accuser_province")
                ddlAccuserProvince_SelectedIndexChanged(Nothing, Nothing)

                If IsDBNull(dr("accuser_district")) = False Then
                    ddlAccuserDistrict.SelectedValue = dr("accuser_district")
                    ddlAccuserDistrict_SelectedIndexChanged(Nothing, Nothing)

                    If IsDBNull(dr("accuser_subdistrict")) = False Then
                        ddlAccuserSubdistrict.SelectedValue = dr("accuser_subdistrict")
                    End If
                End If
            Else
                Dim TambolCode As String = GetOfficeTambol(ddlCompareOffice.SelectedValue)
                If TambolCode <> "" Then
                    ddlAccuserProvince.SelectedValue = TambolCode.Substring(0, 2)
                    ddlAccuserProvince_SelectedIndexChanged(Nothing, Nothing)

                    ddlAccuserDistrict.SelectedValue = TambolCode.Substring(0, 4)
                    ddlAccuserDistrict_SelectedIndexChanged(Nothing, Nothing)

                    ddlAccuserSubdistrict.SelectedValue = TambolCode
                End If
            End If

            If IsDBNull(dr("manage_type")) = False Then
                rdiManageType.SelectedValue = dr("manage_type")
                rdiManageType_SelectedIndexChanged(Nothing, Nothing)
            End If

            If IsDBNull(dr("compare_authority_id")) = False Then ddlCompareAuthority.SelectedValue = dr("compare_authority_id")

            'เจ้าหน้าที่ดำเนินคดี
            If IsDBNull(dr("sue_staff_name")) = False Then lblSueStaffName.Text = dr("sue_staff_name")
            If IsDBNull(dr("staff_id_sue")) = False Then lblSueStaffID.Text = dr("staff_id_sue")
            If IsDBNull(dr("sue_poscode")) = False Then lblSueStaffPoscode.Text = dr("sue_poscode")
            If IsDBNull(dr("sue_offcode")) = False Then lblSueStaffOffcode.Text = dr("sue_offcode")

            'ข้อกล่าวหา
            Dim idmSql As String = "select aai.indictment_id, 'มาตรา' || inc.case_law_id || ' ' || case when pke_arrest.getLawBreakerQty(aai.track_no)>1 then 'ร่วมกัน' else '' end || replace(inc.guilt_base,'" & Chr(34) & "','" & Chr(92) & Chr(34) & "') indictment_name, " & vbNewLine
            idmSql += " inc.CASE_LAW_ID, inc.PENALTY_CASE_LAW_ID, case when pke_arrest.getLawBreakerQty(aai.track_no)>1 then 'ร่วมกัน' else '' end || inc.guilt_base guilt_base " & vbNewLine
            idmSql += " from application_arrest_indictment aai" & vbNewLine
            idmSql += " inner join indictment inc on inc.indictment_id=aai.indictment_id" & vbNewLine
            idmSql += " where aai.track_no = '" & lblTrackNo.Text & "'" & vbNewLine
            idmSql += " order by inc.case_law_id" & vbNewLine
            SetDDl(idmSql, ddlIndictment, False)

            If IsDBNull(dr("indictment_id")) = False Then ddlIndictment.SelectedValue = dr("indictment_id")
            ddlIndictment_SelectedIndexChanged(Nothing, Nothing)

            If IsDBNull(dr("administration")) = False Then txtAdministration.Text = dr("administration")
            If IsDBNull(dr("compare_case_no")) = False Then
                txtAccuserTestimony.Text = dr("accuser_testimony")
            Else
                If dr("case_none_office") = "N" Then
                    Dim OccrTime As String = Convert.ToDateTime(dr("occurrence_date")).ToString("HH:mm")
                    Dim PoliceStation As String = IIf(IsDBNull(dr("police_station")) = False, dr("police_station"), "")
                    Dim Offname As String = ddlCompareOffice.SelectedItem.Text

                    txtAccuserTestimony.Text = "           วันนี้ เวลา " + OccrTime + " น."
                    txtAccuserTestimony.Text += " ข้าฯ พร้อมด้วยพวกได้ดำเนินการจับกุม " & dr("lawbreaker_name")
                    txtAccuserTestimony.Text += "  พร้อมของกลาง ตามบัญชีของกลาง ส.ส.2/4 โดยแจ้งข้อกล่าวหา" & dr("guilt_base") & " ให้ทราบ และ นำตัวผู้ต้องหาพร้อมของกลางส่งพนักงานสอบสวน "
                    txtAccuserTestimony.Text += PoliceStation & " เพื่อดำเนินคดี แต่ผู้ต้องหายินยอมชำระค่าปรับ ในความผิดที่ถูกกล่าวหา จึงได้นำตัวส่ง " & Offname & " เพื่อดำเนินการต่อไป"
                End If
            End If

            'เลขที่สมุดรับคำกล่าวโทษ
            lblCaseID.Text = dr("case_id")
            lblCaseDate.Text = Convert.ToDateTime(dr("case_date")).ToString("dd/MM/yyyy", New Globalization.CultureInfo("th-TH"))

            'ค่าปรับของคดี
            If IsDBNull(dr("case_fine")) = False Then txtCaseFine.Text = dr("case_fine")
            If IsDBNull(dr("tax_value")) = False Then lblTaxVal.Text = dr("tax_value")

            'รายละเอียดเงินค่าปรับ/เงินสินบนและเงินรางวัล
            Dim pTreasury As Integer = 0
            Dim pBribe As Integer = 0
            Dim pReward As Integer = 0

            Dim mTreasury As Double = 0
            Dim mBribe As Double = 0
            Dim mReward As Double = 0

            Dim CaseTotalFine As Double = 0


            If IsDBNull(dr("case_total_fine")) = False Then CaseTotalFine = Convert.ToDouble(dr("case_total_fine"))
            If IsDBNull(dr("treasury_money_p")) = False Then pTreasury = dr("treasury_money_p")
            If IsDBNull(dr("bribe_money_p")) = False Then pBribe = dr("bribe_money_p")
            If IsDBNull(dr("reward_money_p")) = False Then pReward = dr("reward_money_p")

            If IsDBNull(dr("treasury_money")) = False Then mTreasury = Convert.ToDouble(dr("treasury_money"))
            If IsDBNull(dr("birbe_money")) = False Then mBribe = Convert.ToDouble(dr("birbe_money"))
            If IsDBNull(dr("reward_money")) = False Then mReward = Convert.ToDouble(dr("reward_money"))


            lblCaseTotalFine.Text = CaseTotalFine.ToString("#,##0.00")
            If IsDBNull(dr("pay_date")) = False Then lblPayDate.Text = Convert.ToDateTime(dr("pay_date")).ToString("dd/MM/yyyy", New Globalization.CultureInfo("th-TH"))

            txtTreasuryP.Text = pTreasury
            txtBribeP.Text = pBribe
            txtRewardP.Text = pReward
            lblAllP.Text = pTreasury + pBribe + pReward

            lblTreasury.Text = ((CaseTotalFine * pTreasury) / 100).ToString("#,##0.00")
            lblBribe.Text = ((CaseTotalFine * pBribe) / 100).ToString("#,##0.00")
            lblReward.Text = ((CaseTotalFine * pReward) / 100).ToString("#,##0.00")
            lblAll.Text = (Convert.ToDouble(lblTreasury.Text.Replace(",", "")) + Convert.ToDouble(lblBribe.Text.Replace(",", "")) + Convert.ToDouble(lblReward.Text.Replace(",", ""))).ToString("#,##0.00")

            txtTreasuryMoney.Text = mTreasury.ToString("#,##0.00")
            txtBribeMoney.Text = mBribe.ToString("#,##0.00")
            txtRewardMoney.Text = mReward.ToString("#,##0.00")
            lblAllMoney.Text = (mTreasury + mBribe + mReward).ToString("#,##0.00")
        End If
        dtCompare.Dispose()
    End Sub

    Private Function GetDataFromCompareCase(ByVal TrackNo As String) As DataTable
        'บันทึกเปรียบเทียบปรับ
        Dim sql As String = "select cc.compare_case_no, cc.compare_case_date, cc.compare_office, bi.case_none_office, cc.case_non_office_name, " & vbNewLine
        sql += " cc.compare_province, cc.compare_district, cc.compare_subdistrict, " & vbNewLine
        sql += " aa.offcode,aa.occurrence_date,pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name, pke_arrest.getArrestIndictment(aa.track_no) guilt_base, " & vbNewLine
        sql += " aa.police_station, aap.tax_value,aa.legislation_id,aa.application_notice_arrest_id, pke_arrest.getLawbreakerQty(aa.track_no) lawbreaker_qty,"
        sql += " cc.accuser_province,cc.accuser_district,cc.accuser_subdistrict, cc.indictment_id,cc.accuser_testimony, " & vbNewLine
        sql += " nvl(aa.accuser_name,tia.title_name || sta.first_name || ' ' || sta.last_name) accuser_name," & vbNewLine
        sql += " nvl(cc.sue_staff_idcardno,bi.staff_id_sue) staff_id_sue, nvl(cc.sue_poscode,sts.poscode) sue_poscode , nvl(cc.sue_offcode,sts.offcode) sue_offcode," & vbNewLine
        sql += " nvl(tic.title_name,tis.title_name) || nvl(stc.first_name,sts.first_name) || ' ' || nvl(stc.last_name,sts.last_name) sue_staff_name," & vbNewLine
        sql += " cc.manage_type, cc.compare_authority_id, bi.case_id, bi.case_date, aa.administration, cc.pay_date, " & vbNewLine
        sql += " cc.treasury_money_p, cc.bribe_money_p, cc.reward_money_p, cc.treasury_money, cc.birbe_money, cc.reward_money," & vbNewLine
        sql += " cc.case_fine, cc.case_total_fine, bi.id book_impeachment_id" & vbNewLine
        sql += " from book_impeachment bi" & vbNewLine
        sql += " inner join application_arrest aa on aa.track_no=bi.track_no" & vbNewLine
        sql += " inner join compare_case cc on bi.track_no=cc.track_no" & vbNewLine
        sql += " left join application_arrest_prove aap on aap.track_no=aa.track_no " & vbNewLine
        sql += " left join staff sts on sts.idcard_no=bi.staff_id_sue" & vbNewLine
        sql += " left join title tis on tis.title_code=sts.title_code" & vbNewLine
        sql += " left join staff stc on stc.idcard_no=cc.sue_staff_idcardno" & vbNewLine
        sql += " left join title tic on tic.title_code=stc.title_code" & vbNewLine
        sql += " left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno" & vbNewLine
        sql += " left join title tia on tia.title_code=sta.title_code" & vbNewLine
        sql += " where aa.track_no='" & TrackNo & "'"

        Dim dt As DataTable = Config.ExcuteTable(sql)
        Return dt
    End Function


#Region "Compare Case"
    Private Sub btnSearchSueStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchSueStaff.Click
        frmSearchSueStaff.ShowPop()
    End Sub
    Private Sub frmSearchSueStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchSueStaff.SelectStaff
        lblSueStaffName.Text = FullName
        lblSueStaffID.Text = IdCardNo
        lblSueStaffPoscode.Text = Poscode
        lblSueStaffOffcode.Text = Offcode
    End Sub



    Public Function SaveCompareCase(ByVal UserIDCard As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            Dim vCaseDate As String = txtCompareCaseDate.DateValue.ToString("yyyy-MM-dd", New System.Globalization.CultureInfo("en-US")) & " 00:00:00"
            Dim vCaseNo As String = txtCompareCaseNo1.Text.Trim & "/" & txtCompareCaseNo2.Text.Trim
            If chkNoneOffice.Checked = True Then
                vCaseNo = "น" & vCaseNo
            End If

            Dim sql As String = "select id from compare_case where track_no ='" & lblTrackNo.Text.Trim & "' and rownum=1"
            Dim dt As DataTable = Config.ExcuteTable(sql, trans)

            If dt.Rows.Count > 0 Then
                sql = " update compare_case " & vbNewLine
                sql += " set compare_case_no = '" & vCaseNo & "'" & vbNewLine
                sql += ", compare_case_date = to_date('" & vCaseDate & "','yyyy-mm-dd hh24:mi:ss')" & vbNewLine
                sql += ", compare_office = '" & ddlCompareOffice.SelectedValue & "'" & vbNewLine
                sql += ", compare_subdistrict = '" & ddlCompareSubDistrict.SelectedValue & "'" & vbNewLine
                sql += ", compare_district = '" & ddlCompareDistrict.SelectedValue & "'" & vbNewLine
                sql += ", compare_province = '" & ddlCompareProvince.SelectedValue & "'" & vbNewLine
                sql += ", accuser_subdistrict = '" & ddlAccuserSubdistrict.SelectedValue & "'" & vbNewLine
                sql += ", accuser_district = '" & ddlAccuserDistrict.SelectedValue & "'" & vbNewLine
                sql += ", accuser_province = '" & ddlAccuserProvince.SelectedValue & "'" & vbNewLine
                sql += ", indictment_id = '" & ddlIndictment.SelectedValue & "'" & vbNewLine
                sql += ", accuser_testimony = '" & txtAccuserTestimony.Text & "'" & vbNewLine
                sql += ", case_id='" & lblBookImpeachmentID.Text & "'" & vbNewLine
                sql += ", treasury_money_p = '" & txtTreasuryP.Text & "'" & vbNewLine
                sql += ", bribe_money_p = '" & txtBribeP.Text & "'" & vbNewLine
                sql += ", reward_money_p = '" & txtRewardP.Text & "'" & vbNewLine
                sql += ", treasury_money = '" & txtTreasuryMoney.Text.Replace(",", "") & "'" & vbNewLine
                sql += ", birbe_money = '" & txtBribeMoney.Text.Replace(",", "") & "'" & vbNewLine
                sql += ", reward_money = '" & txtRewardMoney.Text.Replace(",", "") & "'" & vbNewLine
                sql += ", compare_authority_id = " & IIf(rdiManageType.SelectedValue = "1", "'" & ddlCompareAuthority.SelectedValue & "'", "NULL") & vbNewLine
                sql += ", manage_type = '" & rdiManageType.SelectedValue & "'" & vbNewLine
                sql += ", case_fine ='" & txtCaseFine.Text.Replace(",", "") & "'" & vbNewLine
                sql += ", sue_staff_idcardno = '" & lblSueStaffID.Text & "'" & vbNewLine
                sql += ", sue_poscode = '" & lblSueStaffPoscode.Text & "'" & vbNewLine
                sql += ", sue_offcode = '" & lblSueStaffOffcode.Text & "'" & vbNewLine
                sql += ", inv_type = 'M'" & vbNewLine
                sql += ", case_total_fine = '" & lblCaseTotalFine.Text.Replace(",", "") & "'" & vbNewLine
                sql += ", case_non_office_name = " & IIf(chkNoneOffice.Checked = True, "'" & txtCompareOffice.Text & "'", "NULL") & vbNewLine
                sql += ", update_on=sysdate, update_by='" & UserIDCard & "'" & vbNewLine   'Admin = 1111111111111
                sql += " where track_no='" & lblTrackNo.Text & "'"

                ret = Config.ExcuteNonQuery(sql, trans)
                If ret = True Then
                    sql = "update application_arrest_lawbreaker "
                    sql += " set fine='" & txtCaseFine.Text & "'"
                    sql += " where track_no='" & lblTrackNo.Text & "'"

                    ret = Config.ExcuteNonQuery(sql, trans)
                    If ret = True Then
                        sql = "update application_arrest " & vbNewLine
                        sql += " set administration = '" & txtAdministration.Text & "'"
                        sql += " where track_no='" & lblTrackNo.Text & "'"

                        ret = Config.ExcuteNonQuery(sql, trans)
                    End If
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
        lblTrackNo.Text = ""
        lblBookImpeachmentID.Text = "0"
        lblIsNotice.Text = "N"
        lblLegislationID.Text = "0"
        lblLawbreakerQty.Text = "0"
        lblCompareCaseNonOffice.Visible = False
        txtCompareCaseNo1.Text = ""
        txtCompareCaseNo2.Text = ""
        txtCompareCaseDate.ClearDate()
        chkNoneOffice.Checked = False

        ddlCompareOffice.SelectedValue = "0"
        ddlCompareOffice.Visible = True

        txtCompareOffice.Text = ""
        txtCompareOffice.Visible = False

        ddlCompareProvince.SelectedValue = "0"
        ddlCompareProvince_SelectedIndexChanged(Nothing, Nothing)

        lblAccuserName.Text = ""
        ddlAccuserProvince.SelectedValue = "0"
        ddlAccuserProvince_SelectedIndexChanged(Nothing, Nothing)

        rdiManageType.SelectedValue = "2"
        rdiManageType_SelectedIndexChanged(Nothing, Nothing)

        lblSueStaffName.Text = ""
        lblSueStaffID.Text = ""
        lblSueStaffPoscode.Text = ""
        lblSueStaffOffcode.Text = ""

        ddlIndictment.DataSource = Nothing
        lblCaseLawID.Text = ""
        lblPenaltyDesc.Text = ""

        txtAdministration.Text = ""
        txtAccuserTestimony.Text = ""
        lblCaseID.Text = ""
        lblCaseDate.Text = ""

        txtCaseFine.Text = ""
        lblTaxVal.Text = ""

        lblCaseTotalFine.Text = ""
        txtTreasuryP.Text = ""
        lblTreasury.Text = ""
        txtTreasuryMoney.Text = ""
        txtBribeP.Text = ""
        lblBribe.Text = ""
        txtBribeMoney.Text = ""
        txtRewardP.Text = ""
        lblReward.Text = ""
        txtRewardMoney.Text = ""
        lblAllP.Text = ""
        lblAll.Text = ""
        lblAllMoney.Text = ""
    End Sub
#End Region

    Private Sub rdiManageType_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles rdiManageType.SelectedIndexChanged
        If rdiManageType.SelectedValue = "1" Then   'ผู้มีอำนาจโดยตรง
            ddlCompareAuthority.Enabled = True
        Else
            ddlCompareAuthority.SelectedValue = "0"
            ddlCompareAuthority.Enabled = False
        End If
    End Sub

    Private Sub ddlCompareOffice_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlCompareOffice.SelectedIndexChanged
        If ddlCompareOffice.SelectedValue > "0" Then
            Dim TambolCode As String = GetOfficeTambol(ddlCompareOffice.SelectedValue)
            If TambolCode <> "" Then
                ddlCompareProvince.SelectedValue = TambolCode.Substring(0, 2)
                ddlCompareProvince_SelectedIndexChanged(Nothing, Nothing)

                ddlCompareDistrict.SelectedValue = TambolCode.Substring(0, 4)
                ddlCompareDistrict_SelectedIndexChanged(Nothing, Nothing)

                ddlCompareSubDistrict.SelectedValue = TambolCode
            End If
        Else
            ddlCompareProvince.SelectedValue = "0"
            ddlCompareProvince_SelectedIndexChanged(Nothing, Nothing)
        End If
        
    End Sub

    Private Function GetOfficeTambol(ByVal Offcode As String) As String
        Dim ret As String = ""
        Dim sql As String = "select tambol_code from ed_office where offcode='" & Offcode & "'"
        Dim dt As DataTable = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            If IsDBNull(dt.Rows(0)("tambol_code")) = False Then
                ret = dt.Rows(0)("tambol_code")
            End If
        End If
        dt.Dispose()
        Return ret
    End Function

    Private Sub ddlIndictment_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlIndictment.SelectedIndexChanged
        If ddlIndictment.SelectedValue > "0" Then
            Dim idmSql As String = "select inc.CASE_LAW_ID, inc.PENALTY_CASE_LAW_ID " & vbNewLine
            idmSql += " from indictment inc " & vbNewLine
            idmSql += " where inc.indictment_id = '" & ddlIndictment.SelectedValue & "'" & vbNewLine

            Dim iDt As DataTable = Config.ExcuteTable(idmSql)
            If iDt.Rows.Count > 0 Then
                lblCaseLawID.Text = iDt.Rows(0)("CASE_LAW_ID")
                lblPenaltyDesc.Text = iDt.Rows(0)("PENALTY_CASE_LAW_ID")
            End If
            iDt.Dispose()
        Else
            lblCaseLawID.Text = ""
            lblPenaltyDesc.Text = ""
        End If
    End Sub


    Private Function GegSharedMoney() As String
        Dim ret As String = ""

        Dim sql As String = "select PKE_COMPARE.getShareMoney('" & lblTrackNo.Text & "','" & lblLegislationID.Text & "'," & ddlIndictment.SelectedValue & ",'" & lblIsNotice.Text & "'," & lblCaseTotalFine.Text & ") share_money from dual"
        Dim dt As DataTable = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            If IsDBNull(dt.Rows(0)("share_money")) = False Then
                Dim tmp() As String = Split(dt.Rows(0)("share_money"), "#")
                If tmp.Length = 6 Then
                    txtBribeP.Text = tmp(0)
                    txtRewardP.Text = tmp(1)
                    txtTreasuryP.Text = tmp(2)

                    txtBribeMoney.Text = Convert.ToDouble(tmp(3)).ToString("#,##0.00")
                    txtRewardMoney.Text = Convert.ToDouble(tmp(4)).ToString("#,##0.00")
                    txtTreasuryMoney.Text = Convert.ToDouble(tmp(5)).ToString("#,##0.00")
                End If
            End If
        End If
        dt.Dispose()

        Return ret
    End Function


    Private Sub btnCalFine_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnCalFine.Click

        If txtCaseFine.Text = "0" Or txtCaseFine.Text = "" Then
            txtBribeP.Text = 0
            txtRewardP.Text = 0
            txtTreasuryP.Text = 0
        Else
            lblCaseTotalFine.Text = (Convert.ToDouble(txtCaseFine.Text) * Convert.ToDouble(lblLawbreakerQty.Text)).ToString("#,##0.00")
            GegSharedMoney()
        End If

        txtBribeP_TextChanged(Nothing, Nothing)
        txtRewardP_TextChanged(Nothing, Nothing)
        txtTreasuryP_TextChanged(Nothing, Nothing)
    End Sub


    Public Sub UpdateLawbreakerQty(ByVal LawbreakerQty As Integer)
        lblLawbreakerQty.Text = LawbreakerQty
        txtCaseFine_TextChanged(Nothing, Nothing)
    End Sub

    Private Sub txtCaseFine_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtCaseFine.TextChanged
        If txtCaseFine.Text = "0" Or txtCaseFine.Text = "" Then
            txtBribeP.Text = 0
            txtRewardP.Text = 0
            txtTreasuryP.Text = 0
            lblCaseTotalFine.Text = "0.00"
        Else
            lblCaseTotalFine.Text = (Convert.ToDouble(txtCaseFine.Text) * Convert.ToInt16(lblLawbreakerQty.Text)).ToString("#,##0.00")
        End If

        txtBribeP_TextChanged(Nothing, Nothing)
        txtRewardP_TextChanged(Nothing, Nothing)
        txtTreasuryP_TextChanged(Nothing, Nothing)
    End Sub


    Private Sub txtBribeP_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtBribeP.TextChanged
        If txtBribeP.Text <= "0" Or txtBribeP.Text = "" Or txtCaseFine.Text <= "0" Or txtCaseFine.Text = "0" Then
            lblBribe.Text = "0.00"
            txtBribeMoney.Text = "0.00"
        Else
            Dim BribeMoney As Double = (Convert.ToDouble(lblCaseTotalFine.Text.Replace(",", "")) * Convert.ToDouble(txtBribeP.Text)) / 100
            lblBribe.Text = BribeMoney.ToString("#,##0.00")
            txtBribeMoney.Text = BribeMoney.ToString("#,##0.00")
        End If
        CalRowSum()
    End Sub

    Private Sub txtRewardP_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtRewardP.TextChanged
        If txtRewardP.Text <= "0" Or txtRewardP.Text = "" Or txtCaseFine.Text <= "0" Or txtCaseFine.Text = "0" Then
            lblReward.Text = "0.00"
            txtRewardMoney.Text = "0.00"
        Else
            Dim RewardMoney As Double = (Convert.ToDouble(lblCaseTotalFine.Text.Replace(",", "")) * Convert.ToDouble(txtRewardP.Text)) / 100
            lblReward.Text = RewardMoney.ToString("#,##0.00")
            txtRewardMoney.Text = RewardMoney.ToString("#,##0.00")
        End If
        CalRowSum()
    End Sub

    Private Sub txtTreasuryP_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtTreasuryP.TextChanged
        If txtTreasuryP.Text <= "0" Or txtTreasuryP.Text = "" Or txtCaseFine.Text <= "0" Or txtCaseFine.Text = "0" Then
            lblTreasury.Text = "0.00"
            txtTreasuryMoney.Text = "0.00"
        Else
            Dim TreasuryMoney As Double = (Convert.ToDouble(lblCaseTotalFine.Text.Replace(",", "")) * Convert.ToDouble(txtTreasuryP.Text)) / 100
            lblTreasury.Text = TreasuryMoney.ToString("#,##0.00")
            txtTreasuryMoney.Text = TreasuryMoney.ToString("#,##0.00")
        End If
        CalRowSum()
    End Sub


    Private Sub txtBribeMoney_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtBribeMoney.TextChanged
        CalRowSum()
    End Sub

    Private Sub txtRewardMoney_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtRewardMoney.TextChanged
        CalRowSum()
    End Sub

    Private Sub txtTreasuryMoney_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtTreasuryMoney.TextChanged
        CalRowSum()
    End Sub

    Private Sub CalRowSum()
        lblAllP.Text = (Convert.ToDouble(IIf(txtTreasuryP.Text = "", 0, txtTreasuryP.Text)) + Convert.ToDouble(IIf(txtBribeP.Text = "", 0, txtBribeP.Text)) + Convert.ToDouble(IIf(txtRewardP.Text = "", 0, txtRewardP.Text)))
        lblAll.Text = (Convert.ToDouble(IIf(lblTreasury.Text = "", 0, lblTreasury.Text)) + Convert.ToDouble(IIf(lblBribe.Text = "", 0, lblBribe.Text)) + Convert.ToDouble(IIf(lblReward.Text = "", 0, lblReward.Text))).ToString("#,##0.00")
        lblAllMoney.Text = (Convert.ToDouble(IIf(txtTreasuryMoney.Text = "", 0, txtTreasuryMoney.Text)) + Convert.ToDouble(IIf(txtBribeMoney.Text = "", 0, txtBribeMoney.Text)) + Convert.ToDouble(IIf(txtRewardMoney.Text = "", 0, txtRewardMoney.Text))).ToString("#,##0.00")
    End Sub

End Class