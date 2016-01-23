Public Partial Class frmPopArrestLawbreaker
    Inherits System.Web.UI.UserControl

    Public Event SaveLawbreaker(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As DataTable)

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Public Sub ShowPop()
        SetTitleName()
        SetNationality()
        SetRace()
        SetDDlProvince()
        ddlProvince_SelectedIndexChanged(Nothing, Nothing)
        ddlDistrict_SelectedIndexChanged(Nothing, Nothing)
        ddlCULPRIT_SelectedIndexChanged(Nothing, Nothing)
        ClearForm()


        zPopArrestLawbreaker.Show()
    End Sub

    Public Sub ShowPopEdit(ByVal drv As DataRowView, ByVal seq As String)
        SetTitleName()
        SetNationality()
        SetRace()
        SetDDlProvince()
        ddlProvince_SelectedIndexChanged(Nothing, Nothing)
        ddlDistrict_SelectedIndexChanged(Nothing, Nothing)
        ddlCULPRIT_SelectedIndexChanged(Nothing, Nothing)
        ClearForm()

        FilDataInForm(drv)
        txtSeq.Text = seq

        zPopArrestLawbreaker.Show()
    End Sub

    Private Sub SetDDl(ByVal sql As String, ByVal ddl As DropDownList)
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        ddl.DataSource = dt
        ddl.DataBind()
        ddl.Items.Insert(0, New ListItem("--- เลือก ---", "0"))
    End Sub

    Private Sub SetTitleName()
        Dim sql As String = "select id,title_code,title_name from title t order by title_name"
        SetDDl(sql, ddlTitle)
        SetDDl(sql, ddlTitle2)
        SetDDl(sql, ddlEXCTitle)
        SetDDl(sql, ddlTitle3)
    End Sub

    Sub SetNationality()
        Dim sql As String = "select id,nation_code,nation_name from nationality order by nation_name"
        SetDDl(sql, ddlNationality)
    End Sub

    Sub SetRace()
        Dim sql As String = "select id,race_code,race_name from race order by race_name"
        SetDDl(sql, ddlrace)
    End Sub

    Sub SetDDlProvince()
        Dim sql As String = "Select id,Province_Code,Province_Name From Province order by Province_Name"
        SetDDl(sql, ddlProvince)
    End Sub

    Sub SetDDlDistrict(ByVal Province_Code As String)
        Dim sql As String = "Select id,District_Code,District_Name From District Where Province_Code ='" & Province_Code & "' order by District_Name"
        SetDDl(sql, ddlDistrict)
    End Sub

    Sub SetDllSubDistrict(ByVal District_Code As String)
        Dim sql As String = "Select id,SubDistrict_Code,SubDistrict_Name from SubDistrict Where District_Code='" & District_Code & "' order by SubDistrict_Name"
        SetDDl(sql, ddlSubDistrict)
    End Sub

    Private Sub ddlProvince_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlProvince.SelectedIndexChanged
        SetDDlDistrict(ddlProvince.SelectedValue)
        SetDllSubDistrict(ddlDistrict.SelectedValue)
        zPopArrestLawbreaker.Show()
    End Sub

    Private Sub ddlDistrict_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlDistrict.SelectedIndexChanged
        SetDllSubDistrict(ddlDistrict.SelectedValue)
        zPopArrestLawbreaker.Show()
    End Sub

    Function GetArrestBreakerByIDCard(ByVal pLAWBREAKER_ID_CARD As String, ByVal pLAWBREAKER_PASSPORT As String, ByVal pEXCISE_REG_NO As String, ByVal LawbreakerNo As String) As Integer
        Dim sql As String = "SELECT '0' ID,  l.LAWBREAKER_NO,  l.lawbreaker_type CULPRIT_TYPE, l.LAWBREAKER_ID_CARD, l.LAWBREAKER_PASSPORT, " & vbNewLine
        sql += " l.FIRST_NAME, l.MIDDLE_NAME, l.LAST_NAME,   l.ADDRESS_NO, l.SOI, l.ROAD,   l.MOO, l.SUBDISTRICT_CODE subdistrict, l.DISTRICT_CODE district,   l.PROVINCE_CODE province,  " & vbNewLine
        sql += " l.NATION_ID NATIONALITY_ID, l.RACE_ID,  l.CAREER, " & vbNewLine
        sql += " case when l.birth_date is not null then to_char(sysdate,'yyyy') - to_char(l.birth_date,'yyyy') else 0 end AGE, " & vbNewLine
        sql += " aal.FATHER_NAME, aal.MOTHER_NAME,  l.TITLE_CODE, l.SEX,    l.OTHER_NAME, l.EXCISE_REG_NO,   " & vbNewLine
        sql += " to_char(l.birth_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  birth_date,  " & vbNewLine
        sql += " l.CORPORATION_CODE, l.title_code_company COMPANY_TITLE_CODE, l.COMPANY_NAME,  " & vbNewLine
        sql += " p.province_name ,d.district_name, st.subdistrict_name,  tl.title_name, r.race_name race_id_name,n.nation_name nationality_id_name  " & vbNewLine
        sql += " ,aal.FIRST_NAME || '  ' || aal.LAST_NAME as fullname" & vbNewLine
        sql += " ,case l.lawbreaker_type when '1' then 'คนไทย' when '2' then 'ชาวต่างชาติ'  when '3' then 'ผู้ประกอบการ' else '' end as CULPRIT" & vbNewLine
        sql += " ,l.address_no || ' ' || l.soi  || ' ' || l.road || ' ' || l.moo || ' '||st.subdistrict_name || ' ' || d.district_name || ' ' || p.province_name as address" & vbNewLine
        sql += " FROM LAWBREAKER l " & vbNewLine
        sql += " left join application_arrest_lawbreaker aal on aal.lawbreaker_no=l.lawbreaker_no" & vbNewLine
        sql += " left join province p on p.province_code = l.province_code  " & vbNewLine
        sql += " left join district d on d.district_code = l.district_code  " & vbNewLine
        sql += " left join subdistrict st on st.subdistrict_code = l.subdistrict_code  " & vbNewLine
        sql += " left join title tl on tl.title_code = l.title_code " & vbNewLine
        sql += " left join race r on r.id = l.race_id " & vbNewLine
        sql += " left join nationality n on n.id = l.NATION_ID " & vbNewLine
        If pLAWBREAKER_ID_CARD <> "" Then
            sql += " where l.LAWBREAKER_ID_CARD ='" & pLAWBREAKER_ID_CARD & "'" & vbNewLine
        End If
        If pLAWBREAKER_PASSPORT <> "" Then
            sql += " where l.LAWBREAKER_PASSPORT ='" & pLAWBREAKER_PASSPORT & "'" & vbNewLine
        End If
        If pEXCISE_REG_NO <> "" Then
            sql += " where l.EXCISE_REG_NO ='" & pEXCISE_REG_NO & "'" & vbNewLine
        End If
        If LawbreakerNo <> "" Then
            sql += " where l.lawbreaker_no = '" & LawbreakerNo & "'" & vbNewLine
        End If

        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            ClearForm()
            FilDataInForm(dt.DefaultView(0))
            dt.Dispose()
        End If
        Return dt.Rows.Count
    End Function

    Private Sub FilDataInForm(ByVal drv As DataRowView)
        txtAppLawbreakerID.Text = drv("ID")
        Try
            ddlCULPRIT.SelectedValue = drv("CULPRIT_TYPE").ToString
        Catch ex As Exception
            ddlCULPRIT.SelectedIndex = 0
        End Try


        Select Case ddlCULPRIT.SelectedValue
            Case "1"
                txtIDCardNo.Text = drv("LAWBREAKER_ID_CARD").ToString
                rdSex.SelectedValue = drv("sex").ToString
                Try
                    ddlTitle.SelectedValue = drv("Title_Code").ToString
                Catch ex As Exception
                    ddlTitle.SelectedIndex = 0
                End Try

                txtName.Text = drv("FIRST_NAME").ToString
                txtLastName.Text = drv("Last_Name").ToString
                txtOtherName.Text = drv("Other_Name").ToString
            Case "2"
                txtLAWBREAKER_PASSPORT.Text = drv("LAWBREAKER_PASSPORT").ToString
                Try
                    rdSex2.SelectedValue = drv("Sex").ToString
                Catch ex As Exception
                    rdSex2.SelectedIndex = 0
                End Try

                Try
                    ddlTitle2.SelectedValue = drv("Title_code").ToString
                Catch ex As Exception
                    ddlTitle2.SelectedIndex = 0
                End Try

                txtName2.Text = drv("FIRST_NAME").ToString
                txtMidName.Text = drv("MIDDLE_NAME").ToString
                txtLastName2.Text = drv("LAST_NAME").ToString
                txtOtherName2.Text = drv("OTHER_NAME").ToString

            Case "3"
                txtExcNo.Text = drv("EXCISE_REG_NO").ToString
                txtCorpNo.Text = drv("CORPORATION_CODE").ToString
                Try
                    ddlEXCTitle.SelectedValue = drv("COMPANY_TITLE_CODE").ToString
                Catch ex As Exception
                    ddlEXCTitle.SelectedIndex = 0
                End Try

                Try
                    ddlTitle3.SelectedValue = drv("Title_code").ToString
                Catch ex As Exception
                    ddlTitle3.SelectedIndex = 0
                End Try

                txtEXCName.Text = drv("COMPANY_NAME").ToString
                txtName3.Text = drv("FIRST_NAME").ToString
                txtLastName3.Text = drv("LAST_NAME").ToString
                txtOtherName3.Text = drv("OTHER_NAME").ToString
        End Select

        txtAddress.Text = drv("Address_no").ToString
        txtMoo.Text = drv("Moo").ToString
        txtSoi.Text = drv("Soi").ToString
        txtRoad.Text = drv("Road").ToString
        Try
            ddlProvince.SelectedValue = drv("Province").ToString
            SetDDlDistrict(ddlProvince.SelectedValue)
            SetDllSubDistrict(ddlDistrict.SelectedValue)
        Catch ex As Exception
            ddlProvince.SelectedIndex = 0
        End Try

        Try
            ddlDistrict.SelectedValue = drv("District").ToString
            SetDllSubDistrict(ddlDistrict.SelectedValue)
        Catch ex As Exception
            ddlDistrict.SelectedIndex = 0
        End Try

        Try
            ddlSubDistrict.SelectedValue = drv("SubDistrict").ToString
        Catch ex As Exception
            ddlSubDistrict.SelectedIndex = 0
        End Try

        Try
            ddlrace.SelectedValue = drv("race_ID").ToString
        Catch ex As Exception
            ddlrace.SelectedIndex = 0
        End Try

        Try
            ddlNationality.SelectedValue = drv("Nationality_ID").ToString
        Catch ex As Exception
            ddlNationality.SelectedIndex = 0
        End Try

        txtCAREER.Text = drv("CAREER").ToString
        txtBirthday.TxtBox.Text = drv("BIRTH_DATE").ToString
        txtBirthday.AgeValue = drv("Age").ToString
        txtFatherName.Text = drv("Father_Name").ToString
        txtMotherName.Text = drv("Mother_Name").ToString

    End Sub

    Sub ClearForm()
        txtAppLawbreakerID.Text = "0"
        ddlCULPRIT.SelectedIndex = 0

        txtIDCardNo.Text = ""
        rdSex.SelectedIndex = 0
        ddlTitle.SelectedIndex = 0
        txtName.Text = ""
        txtLastName.Text = ""
        txtOtherName.Text = ""

        txtLAWBREAKER_PASSPORT.Text = ""
        rdSex2.SelectedIndex = 0
        ddlTitle2.SelectedIndex = 0
        txtName2.Text = ""
        txtMidName.Text = ""
        txtLastName2.Text = ""
        txtOtherName2.Text = ""

        txtExcNo.Text = ""
        txtCorpNo.Text = ""
        ddlEXCTitle.SelectedIndex = 0
        txtEXCName.Text = ""
        ddlTitle3.SelectedIndex = 0
        txtName3.Text = ""
        txtLastName3.Text = ""
        txtOtherName3.Text = ""

        txtAddress.Text = ""
        txtMoo.Text = ""
        txtSoi.Text = ""
        txtRoad.Text = ""
        ddlProvince.SelectedIndex = 0
        ddlDistrict.SelectedIndex = 0
        ddlSubDistrict.SelectedIndex = 0
        ddlrace.SelectedIndex = 0
        ddlNationality.SelectedIndex = 0
        txtCAREER.Text = ""
        txtBirthday.TxtBox.Text = ""
        txtBirthday.AgeValue = ""
        txtFatherName.Text = ""
        txtMotherName.Text = ""
        txtSeq.Text = "0"
    End Sub

    Private Sub ddlCULPRIT_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlCULPRIT.SelectedIndexChanged
        Select Case ddlCULPRIT.SelectedValue
            Case "1"
                pnl1.Visible = True
                pnl2.Visible = False
                pnl3.Visible = False
            Case "2"
                pnl1.Visible = False
                pnl2.Visible = True
                pnl3.Visible = False
            Case "3"
                pnl1.Visible = False
                pnl2.Visible = False
                pnl3.Visible = True
        End Select
        zPopArrestLawbreaker.Show()
    End Sub

    Protected Sub btnAdd_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnAdd.Click
        Dim dt As New DataTable
        With dt
            .Columns.Add("ID")
            .Columns.Add("CULPRIT_TYPE")
            .Columns.Add("LAWBREAKER_ID_CARD")
            .Columns.Add("LAWBREAKER_PASSPORT")
            .Columns.Add("Sex")
            .Columns.Add("Title_Code")
            .Columns.Add("Title_Name")
            .Columns.Add("First_Name")
            .Columns.Add("Last_Name")
            .Columns.Add("Other_Name")
            .Columns.Add("Address_no")
            .Columns.Add("Moo")
            .Columns.Add("Soi")
            .Columns.Add("Road")
            .Columns.Add("Province")
            .Columns.Add("Province_Name")
            .Columns.Add("District")
            .Columns.Add("District_Name")
            .Columns.Add("SubDistrict")
            .Columns.Add("SubDistrict_Name")
            .Columns.Add("Race_ID")
            .Columns.Add("Race_ID_Name")
            .Columns.Add("Nationality_ID")
            .Columns.Add("Nationality_ID_Name")
            .Columns.Add("CAREER")
            .Columns.Add("Birth_DATE")
            .Columns.Add("Age")
            .Columns.Add("Father_Name")
            .Columns.Add("Mother_Name")
            '.Columns.Add("fullname")
            .Columns.Add("Address")
            .Columns.Add("CULPRIT")
            .Columns.Add("MIDDLE_NAME")
            .Columns.Add("EXCISE_REG_NO")
            .Columns.Add("CORPORATION_CODE")
            .Columns.Add("COMPANY_NAME")
            .Columns.Add("COMPANY_TITLE_CODE")
            .Columns.Add("seq")
        End With

        Dim CULPRIT_TYPE As String = ddlCULPRIT.SelectedValue
        Dim LAWBREAKER_ID_CARD As String = ""
        Dim LAWBREAKER_PASSPORT As String = ""
        Dim Sex As String = ""
        Dim Title_Code As String = ""
        Dim Title_Name As String = ""
        Dim First_Name As String = ""
        Dim Last_Name As String = ""
        Dim Other_Name As String = ""
        Dim Address_no As String = txtAddress.Text.Trim
        Dim Moo As String = txtMoo.Text.Trim
        Dim Soi As String = txtSoi.Text.Trim
        Dim Road As String = txtRoad.Text.Trim
        Dim Province_Code As String = ""
        If ddlProvince.SelectedIndex > 0 Then Province_Code = ddlProvince.SelectedValue

        Dim Province_Name As String = ""
        If ddlProvince.SelectedIndex > 0 Then Province_Name = ddlProvince.SelectedItem.Text

        Dim District_Code As String = ""
        If ddlDistrict.SelectedIndex > 0 Then District_Code = ddlDistrict.SelectedValue

        Dim District_Name As String = ""
        If ddlDistrict.SelectedIndex > 0 Then District_Name = ddlDistrict.SelectedItem.Text

        Dim SubDistrict_Code As String = IIf(ddlSubDistrict.SelectedIndex > 0, ddlSubDistrict.SelectedValue, "")

        Dim SubDistrict_Name As String = ""
        If ddlSubDistrict.SelectedIndex > 0 Then SubDistrict_name = ddlSubDistrict.SelectedItem.Text

        Dim Race_ID As String = ""
        If ddlrace.SelectedIndex > 0 Then Race_ID = ddlrace.SelectedValue

        Dim Race_ID_Name As String = ""
        If ddlrace.SelectedIndex > 0 Then Race_ID_Name = ddlrace.SelectedItem.Text

        Dim Nationality_ID As String = ""
        If ddlNationality.SelectedIndex > 0 Then Nationality_ID = ddlNationality.SelectedValue

        Dim Nationality_ID_Name As String = ""
        If ddlNationality.SelectedIndex > 0 Then Nationality_ID_Name = ddlNationality.SelectedItem.Text

        Dim CAREER As String = txtCAREER.Text.Trim
        Dim Birth_DATE As String = TxtBirthday.TxtBox.Text.Trim
        Dim Age As String = txtBirthday.AgeValue
        Dim Father_Name As String = txtFatherName.Text.Trim
        Dim Mother_Name As String = txtMotherName.Text.Trim
        'Dim fullname As String = ""
        Dim Address As String = txtAddress.Text.Trim & " " & txtSoi.Text.Trim & " " & txtRoad.Text.Trim & _
        " " & txtMoo.Text.Trim & " " & SubDistrict_Name & " " & District_Name & " " & Province_Name
        Dim CULPRIT As String = ddlCULPRIT.SelectedItem.Text
        Dim MIDDLE_NAME As String = ""
        Dim EXCISE_REG_NO As String = ""
        Dim CORPORATION_CODE As String = ""
        Dim COMPANY_NAME As String = ""
        Dim COMPANY_TITLE_CODE As String = ""

        Select Case CULPRIT_TYPE
            Case "1"
                Sex = rdSex.SelectedValue
                If ddlTitle.SelectedIndex > 0 Then
                    Title_Code = ddlTitle.SelectedValue
                    Title_Name = ddlTitle.SelectedItem.Text
                End If
                First_Name = txtName.Text.Trim
                Last_Name = txtLastName.Text.Trim
                Other_Name = txtOtherName.Text.Trim
                LAWBREAKER_ID_CARD = txtIDCardNo.Text
            Case "2"
                Sex = rdSex2.SelectedValue
                If ddlTitle2.SelectedIndex > 0 Then
                    Title_Code = ddlTitle2.SelectedValue
                    Title_Name = ddlTitle2.SelectedItem.Text
                End If
                First_Name = txtName2.Text.Trim
                Last_Name = txtLastName2.Text.Trim
                Other_Name = txtOtherName2.Text.Trim
                MIDDLE_NAME = txtMidName.Text
                LAWBREAKER_PASSPORT = txtLAWBREAKER_PASSPORT.Text
            Case "3"
                Sex = ""
                If ddlEXCTitle.SelectedIndex > 0 Then
                    Title_Code = ddlEXCTitle.SelectedValue
                End If

                If ddlEXCTitle.SelectedIndex > 0 Then
                    COMPANY_TITLE_CODE = ddlEXCTitle.SelectedItem.Text
                End If

                COMPANY_NAME = txtEXCName.Text.Trim
                Other_Name = txtOtherName3.Text.Trim
                EXCISE_REG_NO = txtExcNo.Text
                CORPORATION_CODE = txtCorpNo.Text
                Title_Name = ddlTitle3.SelectedValue
                First_Name = txtName3.Text.Trim
                Last_Name = txtLastName3.Text.Trim
                'fullname = IIf(ddlEXCTitle.SelectedIndex > 0, ddlEXCTitle.SelectedItem.Text, "") & " " & txtEXCName.Text.Trim
        End Select

        Dim dr As DataRow
        dr = dt.NewRow
        dr("ID") = txtAppLawbreakerID.Text
        dr("CULPRIT_TYPE") = CULPRIT_TYPE
        dr("LAWBREAKER_ID_CARD") = LAWBREAKER_ID_CARD
        dr("LAWBREAKER_PASSPORT") = LAWBREAKER_PASSPORT
        dr("Sex") = Sex
        dr("Title_Code") = Title_Code
        dr("Title_Name") = Title_Name
        dr("First_Name") = First_Name
        dr("Last_Name") = Last_Name
        dr("Other_Name") = Other_Name
        dr("Address_no") = Address_no
        dr("Moo") = Moo
        dr("Soi") = Soi
        dr("Road") = Road
        dr("Province") = Province_Code
        dr("Province_Name") = Province_Name
        dr("District") = District_Code
        dr("District_Name") = District_Name
        dr("SubDistrict") = SubDistrict_Code
        dr("SubDistrict_Name") = SubDistrict_Name
        dr("Race_ID") = Race_ID
        dr("Race_ID_Name") = Race_ID_Name
        dr("Nationality_ID") = Nationality_ID
        dr("Nationality_ID_Name") = Nationality_ID_Name
        dr("CAREER") = CAREER
        dr("Birth_DATE") = Birth_DATE
        dr("Age") = Age
        dr("Father_NAME") = Father_Name
        dr("Mother_NAME") = Mother_Name
        'dr("fullname") = fullname
        dr("Address") = Address
        dr("CULPRIT") = CULPRIT
        dr("MIDDLE_NAME") = MIDDLE_NAME
        dr("EXCISE_REG_NO") = EXCISE_REG_NO
        dr("CORPORATION_CODE") = CORPORATION_CODE
        dr("COMPANY_NAME") = COMPANY_NAME
        dr("COMPANY_TITLE_CODE") = COMPANY_TITLE_CODE
        dr("seq") = txtSeq.Text
        dt.Rows.Add(dr)

        RaiseEvent SaveLawbreaker(sender, e, dt)
        zPopArrestLawbreaker.Hide()
        
    End Sub

    Private Sub txtIDCardNo_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtIDCardNo.TextChanged
        Try
            If txtIDCardNo.Text.Length = 13 Then
                If GetArrestBreakerByIDCard(txtIDCardNo.Text, "", "", "") = 0 Then
                    ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid().ToString(), "alert('ไม่พบหมายเลขบัตรประชาชนนี้ในระบบ');", True)
                End If
            Else
                ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid().ToString(), "alert('กรุณาระบุเลขบัตรประชาชนให้ครบ 13 หลัก');", True)
            End If
        Catch ex As Exception
            ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid().ToString(), "alert('" & ex.ToString & "');", True)
        End Try
        zPopArrestLawbreaker.Show()
    End Sub

    Private Sub txtLAWBREAKER_PASSPORT_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtLAWBREAKER_PASSPORT.TextChanged
        Try
            If GetArrestBreakerByIDCard("", txtLAWBREAKER_PASSPORT.Text, "", "") = 0 Then
                ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid().ToString(), "alert('ไม่พบเลขที่หนังสือเดินทางนี้ในระบบ');", True)
            End If
        Catch ex As Exception
            ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid().ToString(), "alert('" & ex.ToString & "');", True)
        End Try
        zPopArrestLawbreaker.Show()
    End Sub

    Private Sub txtExcNo_TextChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles txtExcNo.TextChanged
        Try
            If GetArrestBreakerByIDCard("", "", txtExcNo.Text, "") = 0 Then
                ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid().ToString(), "alert('ไม่พบเลขทะเบียนสรรพสามิตนี้ในระบบ');", True)
            End If
        Catch ex As Exception
            ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid().ToString(), "alert('" & ex.ToString & "');", True)
        End Try
        zPopArrestLawbreaker.Show()
    End Sub

    Private Sub btnSearchArrestLawbreaker_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchArrestLawbreaker.Click
        ShowPopSearch(txtName.Text & " " & txtLastName.Text, txtIDCardNo.Text)
        zPopArrestLawbreaker.Show()
    End Sub

    Public Sub ShowPopSearch(ByVal LawbreakerName As String, ByVal LawbreakerIdCardNo As String)
        txtSearchName.Text = LawbreakerName
        txtSearchIDCard.Text = LawbreakerIdCardNo

        If LawbreakerName.Trim <> "" Or LawbreakerIdCardNo.Trim <> "" Then
            SearchLawbreaker()
        End If

        zPopSearchLawbreaker.Show()
    End Sub

    Protected Sub chkH_OnCheckedChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim chkAll As CheckBox = sender
        For Each grv As GridViewRow In gvDataList.Rows
            Dim chk As CheckBox = grv.FindControl("chk")
            chk.Checked = chkAll.Checked
        Next
        zPopSearchLawbreaker.Show()
    End Sub
    Sub SearchLawbreaker()
        Dim sql As String = "select lb.id, lb.lawbreaker_id_card,  trim(case lb.lawbreaker_type "
        sql += " when '1' then t.title_name || lb.first_name || ' ' || lb.last_name"
        sql += "  when '2' then t.title_name || lb.first_name || ' ' || lb.middle_name || ' ' || lb.last_name"
        sql += "  when '3' then tc.title_name || lb.company_name end) lawbreaker_name, 'L' lstype, "
        sql += "  pke_lawbreaker.getLawbreakerAddress(lb.id) lawbreaker_address, lb.lawbreaker_no,"
        sql += " t.title_code as title_code , lb.first_name , lb.last_name "
        sql += " from lawbreaker lb"
        sql += " left join title t on t.title_code=lb.title_code"
        sql += " left join title tc on tc.title_code=lb.title_code_company"
        sql += " where lb.lawbreaker_type ='1'"

        If txtName.Text <> "" Then
            sql += " and first_name like '%" & txtSearchName.Text.Trim() & "%' or last_name like '%" & txtSearchName.Text.Trim() & "%'"
        End If

        If txtSearchIDCard.Text <> "" Then
            sql += " and lawbreaker_id_card like '%" & txtSearchIDCard.Text.Trim() & "%'"
        End If

        sql += "   Order By first_name,last_name"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        If Not dt Is Nothing Then
            dt.Columns.Add("seq", GetType(Long))
            For i As Integer = 0 To dt.Rows.Count - 1
                dt.Rows(i)("seq") = i + 1
            Next
            gvDataList.DataSource = dt
            gvDataList.DataBind()
        End If

        PageControl1.SetMainGridView(gvDataList)
        gvDataList.PageSize = 10
        gvDataList.DataSource = dt
        gvDataList.DataBind()
        PageControl1.Update(dt.Rows.Count)
        Session("SearchLawbreaker") = dt
        dt.Dispose()
    End Sub

    Protected Sub btnSearch_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnSearch.Click
        SearchLawbreaker()
        zPopSearchLawbreaker.Show()
    End Sub
    Protected Sub PageControl1_PageChange(ByVal sender As Object, ByVal e As System.EventArgs) Handles PageControl1.PageChange
        Dim dt As New DataTable
        dt = Session("SearchLawbreaker")
        If dt.Rows.Count > 0 Then
            gvDataList.PageIndex = PageControl1.SelectPageIndex
            PageControl1.SetMainGridView(gvDataList)
            gvDataList.DataSource = dt
            gvDataList.DataBind()
            PageControl1.Update(dt.Rows.Count)
        End If
        dt.Dispose()
        zPopSearchLawbreaker.Show()
    End Sub

    Private Sub gvData_RowCommand(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewCommandEventArgs) Handles gvDataList.RowCommand
        Try
            If e.CommandName = "select" Then
                GetArrestBreakerByIDCard("", "", "", e.CommandArgument.ToString())
                zPopArrestLawbreaker.Show()
                'RaiseEvent SelectLawbreaker(sender, e, e.CommandArgument.ToString())
                'zPopSearchLawbreaker.Hide()
                'Session("lawbreaker_name") = strValue
                'Session("selectedLaebreaker") = True
                'ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "window.close();", True)
            End If
        Catch ex As Exception
            ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "alert('" & ex.ToString() & "')", True)
        End Try
    End Sub

    Private Sub imgClosePopSearch_Click(ByVal sender As Object, ByVal e As System.Web.UI.ImageClickEventArgs) Handles imgClosePopSearch.Click
        zPopArrestLawbreaker.Show()
    End Sub
End Class