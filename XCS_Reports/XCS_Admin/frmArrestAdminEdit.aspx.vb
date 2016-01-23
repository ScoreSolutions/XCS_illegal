Imports System.Data
Imports LinqDB.Common.Utilities

Partial Public Class frmArrestAdminEdit
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If Not IsPostBack Then
            SetDDlLegislation()
            SetDDlProvince()
            If Request("UserName") IsNot Nothing Then
                Config.SaveLogTrans(Request("UserName"), Request, Session.SessionID, "คลิกเมนู แก้ไขข้อมูลคดี")
            End If

            'Validate Textbox
            txtEstimatFine.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtEstimatFine.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtSceneMoo.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtSceneMoo.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")
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

    Sub SetDDlLegislation()
        Dim sql As String = "Select id,legislation_code || ' ' || legislation_name legislation_name from legislation order by legislation_name"
        SetDDl(sql, ddlLegislation)
    End Sub

    Sub SetDDlProduct(ByVal legislation_id As String)
        Dim sql As String = "select group_id,group_name from duty_group where group_id in "
        sql += "(select distinct group_id from product_legislation where legislation_id='" & legislation_id & "') order by group_name"
        SetDDl(sql, ddlProductGroupID, False)
    End Sub

    Sub SetDDlProvince()
        Dim sql As String = "Select id,Province_Code,Province_Name From Province order by Province_Name"
        SetDDl(sql, ddlSceneProvince)
    End Sub

    Sub SetDDlDistrict(ByVal Province_Code As String)
        Dim sql As String = "Select id,District_Code,District_Name From District Where Province_Code ='" & Province_Code & "' order by District_Name"
        SetDDl(sql, ddlSceneDistrict)
    End Sub

    Sub SetDllSubDistrict(ByVal District_Code As String)
        Dim sql As String = "Select id,SubDistrict_Code,SubDistrict_Name from SubDistrict Where District_Code='" & District_Code & "' order by SubDistrict_Name"
        SetDDl(sql, ddlScebeSubDistrict)
    End Sub

    Private Sub ddlLegislation_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlLegislation.SelectedIndexChanged
        SetDDlProduct(ddlLegislation.SelectedValue)
    End Sub

    Private Sub ddlSceneProvince_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlSceneProvince.SelectedIndexChanged
        SetDDlDistrict(ddlSceneProvince.SelectedValue)
        SetDllSubDistrict(ddlSceneDistrict.SelectedValue)
    End Sub

    Private Sub ddlSceneDistrict_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlSceneDistrict.SelectedIndexChanged
        SetDllSubDistrict(ddlSceneDistrict.SelectedValue)
    End Sub

#End Region 'SetDDL

#Region "Sub&&Function"
    Protected Sub chkH_OnCheckedChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim chkH As CheckBox = sender
        Dim grv As GridViewRow = chkH.Parent.Parent
        Dim gv As GridView = grv.Parent.Parent
        For i As Integer = 0 To gv.Rows.Count - 1
            Dim chk As CheckBox = gv.Rows(i).Cells(0).FindControl("chk")
            chk.Checked = chkH.Checked
        Next
    End Sub

    Function Save(ByVal UserName As String) As Boolean
        Dim trans As New TransactionDB
55:
        Try
            Dim track_no As String = txtTrack_no.Text
            Dim application_date As String = TxtApplicationDate.DateValue.ToString("yyyy-MM-dd", New System.Globalization.CultureInfo("en-US")) & " 00:00:00"
            Dim department_id As String = frmSearchDepartment1.DepartmentID
            Dim offcode As String = lblOffName.Text
            Dim legislation_id As String = ddlLegislation.SelectedValue
            Dim have_culprit As String = rdHaveCluprit.SelectedValue
            Dim scene_name As String = txtScene_Name.Text
            Dim scene_no As String = txtSceneNo.Text
            Dim scene_moo As String = txtSceneMoo.Text
            Dim scene_soi As String = txtSceneSoi.Text
            Dim scene_road As String = txtSceneRoad.Text
            Dim scene_subdistrict As String = ddlScebeSubDistrict.SelectedValue
            Dim scene_district As String = ddlSceneDistrict.SelectedValue
            Dim scene_province As String = ddlSceneProvince.SelectedValue
            Dim alleged_co As String = IIf(chkAllegedCo.Checked, "Y", "N")
            Dim occurrence_date As String = txtOccuranceDate.DateValue.ToString("yyyy-MM-dd", New System.Globalization.CultureInfo("en-US")) & " " & TxtOccuranceTime.TxtBox.Text & ":00"
            Dim guilty As String = "Y"
            Dim owner_name As String = ""
            Dim business_name As String = ""
            Dim surety_name As String = ""
            Dim duty As String = ""
            Dim report_to As String = ""
            Dim order_by As String = ""
            Dim leader_position As String = ""
            Dim director_position As String = ""
            Dim behaviour As String = ""
            Dim testimony As String = ""
            Dim finished_time As String = ""
            Dim department_name As String = ""
            Dim lawbreak_type As String = rdLawbreakType.SelectedIndex
            Dim administration As String = ""
            'Dim del_flag As String = ""
            Dim estimate_fine As String = txtEstimatFine.Text
            Dim estimate_fine_date As String = ""
            Dim coordinate_x As String = txtCoordinateX.Text
            Dim coordinate_y As String = txtCoordinateY.Text
            Dim product_group_id As String = ddlProductGroupID.SelectedValue
            Dim accuser_type As String = rdAccuserType.SelectedValue
            Dim police_station As String = txtPoliceStation.Text
            Dim application_notice_arrest_id As String = ""
            Dim application_search_warrant_id As String = ""
            Dim application_sincere_confirm_id As String = ""
            Dim accuser_idcardno As String = ""
            Dim accuser_offcode As String = ""
            Dim accuser_poscode As String = ""
            Dim issentcourt As String = IIf(chkIsSendToCourt.Checked, "Y", "N")
            Dim arrest_report_date As String = ""
            Dim report_to_staff As String = ""
            Dim order_by_staff As String = ""
            Dim accuser_posname As String = lblAccuserPosName.Text
            Dim accuser_offname As String = lblAccuserOffName.Text
            Dim accuser_name As String = lblAccuserName.Text
            Dim accuser_age As String = ""

            Dim ret As Boolean = True
            Dim sql As String = "insert into application_arrest"
            sql += "(ID,track_no,application_date,department_id,offcode,legislation_id,"
            sql += " have_culprit,scene_name,scene_no,scene_moo,scene_soi,scene_road,"
            sql += " scene_subdistrict,scene_district,scene_province,alleged_co,occurrence_date,"
            sql += " guilty,owner_name,business_name,surety_name,duty,report_to,order_by,"
            sql += " leader_position,director_position,behaviour,testimony,finished_time,"
            sql += " department_name,lawbreak_type,administration,estimate_fine,"
            sql += " estimate_fine_date,coordinate_x,coordinate_y,product_group_id,accuser_type,"
            sql += " police_station,application_notice_arrest_id,application_search_warrant_id,"
            sql += " application_sincere_confirm_id,accuser_idcardno,accuser_offcode,accuser_poscode,"
            sql += " issentcourt,arrest_report_date,update_by,update_on,"
            sql += " report_to_staff,order_by_staff,accuser_posname,accuser_offname,accuser_name,accuser_age)"

            sql += " values(application_arrest_seq.nextval," & IIf(track_no = "", "NULL", "'" & track_no & "'") & _
            "," & IIf(application_date = "", "NULL", "to_date('" & application_date & "','yyyy-mm-dd hh24:mi:ss')") & _
            "," & IIf(department_id = "", "NULL", " '" & department_id & "'") & _
            "," & IIf(offcode = "", "NULL", "'" & offcode & "'") & _
            "," & IIf(legislation_id = "", "NULL", "'" & legislation_id & "'") & _
            "," & IIf(have_culprit = "", "NULL", "'" & have_culprit & "'") & _
            "," & IIf(scene_name = "", "NULL", "'" & scene_name & "'") & _
            "," & IIf(scene_no = "", "NULL", "'" & scene_no & "'") & _
            "," & IIf(scene_moo = "", "NULL", "'" & scene_moo & "'") & _
            "," & IIf(scene_soi = "", "NULL", "'" & scene_soi & "'") & _
            "," & IIf(scene_road = "", "NULL", "'" & scene_road & "'") & _
            "," & IIf(scene_subdistrict = "", "NULL", "'" & scene_subdistrict & "'") & _
            "," & IIf(scene_district = "", "NULL", "'" & scene_district & "'") & _
            "," & IIf(scene_province = "", "NULL", "'" & scene_province & "'") & _
            "," & IIf(alleged_co = "", "NULL", "'" & alleged_co & "'") & _
            "," & IIf(occurrence_date = "", "NULL", "to_date('" & occurrence_date & "','yyyy-mm-dd hh24:mi:ss')") & _
            "," & IIf(guilty = "", "NULL", "'" & guilty & "'") & _
            "," & IIf(owner_name = "", "NULL", " '" & owner_name & "'") & _
            "," & IIf(business_name = "", "NULL", "'" & business_name & "'") & _
            "," & IIf(surety_name = "", "NULL", "'" & surety_name & "'") & _
            "," & IIf(duty = "", "NULL", "'" & duty & "'") & _
            "," & IIf(report_to = "", "NULL", "'" & report_to & "'") & _
            "," & IIf(order_by = "", "NULL", "'" & order_by & "'") & _
            "," & IIf(leader_position = "", "NULL", "'" & leader_position & "'") & _
            "," & IIf(director_position = "", "NULL", "'" & director_position & "'") & _
            "," & IIf(behaviour = "", "NULL", "'" & behaviour & "'") & _
            "," & IIf(testimony = "", "NULL", "'" & testimony & "'") & _
            "," & IIf(finished_time = "", "NULL", "'" & finished_time & "'") & _
            "," & IIf(department_name = "", "NULL", "'" & department_name & "'") & _
            "," & IIf(lawbreak_type = "", "NULL", "'" & lawbreak_type & "'") & _
            "," & IIf(administration = "", "NULL", "'" & administration & "'") & _
            "," & IIf(estimate_fine = "", "NULL", "'" & estimate_fine & "'") & _
            "," & IIf(estimate_fine_date = "", "NULL", "'" & estimate_fine_date & "'") & _
            "," & IIf(coordinate_x = "", "NULL", "'" & coordinate_x & "'") & _
            "," & IIf(coordinate_y = "", "NULL", "'" & coordinate_y & "'") & _
            "," & IIf(product_group_id = "", "NULL", "'" & product_group_id & "'") & _
            "," & IIf(accuser_type = "", "NULL", "'" & accuser_type & "'") & _
            "," & IIf(police_station = "", "NULL", "'" & police_station & "'") & _
            "," & IIf(application_notice_arrest_id = "", "NULL", "'" & application_notice_arrest_id & "'") & _
            "," & IIf(application_search_warrant_id = "", "NULL", "'" & application_search_warrant_id & "'") & _
            "," & IIf(application_sincere_confirm_id = "", "NULL", "'" & application_sincere_confirm_id & "'") & _
            "," & IIf(accuser_idcardno = "", "NULL", "'" & accuser_idcardno & "'") & _
            "," & IIf(accuser_offcode = "", "NULL", "'" & accuser_offcode & "'") & _
            "," & IIf(accuser_poscode = "", "NULL", "'" & accuser_poscode & "'") & _
            "," & IIf(issentcourt = "", "NULL", "'" & issentcourt & "'") & _
            "," & IIf(arrest_report_date = "", "NULL", "'" & arrest_report_date & "'") & _
            "," & IIf(UserName = "", "NULL", "'" & UserName & "'") & _
            ",sysdate" & _
            "," & IIf(report_to_staff = "", "NULL", "'" & report_to_staff & "'") & _
            "," & IIf(order_by_staff = "", "NULL", "'" & order_by_staff & "'") & _
            "," & IIf(accuser_posname = "", "NULL", "'" & accuser_posname & "'") & _
            "," & IIf(accuser_offname = "", "NULL", "'" & accuser_offname & "'") & _
            "," & IIf(accuser_name = "", "NULL", "'" & accuser_name & "'") & _
            "," & IIf(accuser_age = "", "NULL", "'" & accuser_age & "'") & ")"


            ret = Config.ExcuteNonQuery(sql, trans)
            If ret Then
                trans.CommitTransaction()
            End If


        Catch ex As Exception
            trans.RollbackTransaction()
        End Try
    End Function

    Function Update(ByVal UserName As String, ByVal UserIDCard As String) As Boolean
        Dim trans As New TransactionDB

        Try
            Dim track_no As String = txtTrack_no.Text
            Dim application_date As String = TxtApplicationDate.DateValue.ToString("yyyy-MM-dd", New System.Globalization.CultureInfo("en-US")) & " 00:00:00"
            Dim department_id As String = frmSearchDepartment1.DepartmentID
            Dim offcode As String = txtOffCode.Text
            Dim legislation_id As String = ddlLegislation.SelectedValue
            Dim have_culprit As String = rdHaveCluprit.SelectedValue
            Dim scene_name As String = txtScene_Name.Text
            Dim scene_no As String = txtSceneNo.Text
            Dim scene_moo As String = txtSceneMoo.Text
            Dim scene_soi As String = txtSceneSoi.Text
            Dim scene_road As String = txtSceneRoad.Text
            Dim scene_subdistrict As String = ddlScebeSubDistrict.SelectedValue
            Dim scene_district As String = ddlSceneDistrict.SelectedValue
            Dim scene_province As String = ddlSceneProvince.SelectedValue
            Dim alleged_co As String = IIf(chkAllegedCo.Checked, "Y", "N")
            Dim occurrence_date As String = txtOccuranceDate.DateValue.ToString("yyyy-MM-dd", New System.Globalization.CultureInfo("en-US")) & " " & TxtOccuranceTime.TxtBox.Text & ":00"
            Dim guilty As String = "Y"
            'Dim owner_name As String = ""
            ' Dim business_name As String = ""
            'Dim surety_name As String = ""
            'Dim duty As String = ""
            'Dim report_to As String = ""
            'Dim order_by As String = ""
            'Dim leader_position As String = ""
            'Dim director_position As String = ""
            'Dim behaviour As String = ""
            'Dim testimony As String = ""
            'Dim finished_time As String = ""
            Dim department_name As String = frmSearchDepartment1.DepartmentName
            Dim lawbreak_type As String = rdLawbreakType.SelectedIndex
            'Dim administration As String = ""
            'Dim del_flag As String = ""
            Dim estimate_fine As String = txtEstimatFine.Text
            'Dim estimate_fine_date As String = ""
            Dim coordinate_x As String = txtCoordinateX.Text
            Dim coordinate_y As String = txtCoordinateY.Text
            Dim product_group_id As String = ddlProductGroupID.SelectedValue
            Dim accuser_type As String = rdAccuserType.SelectedValue
            Dim police_station As String = txtPoliceStation.Text
            'Dim application_notice_arrest_id As String = ""
            'Dim application_search_warrant_id As String = ""
            'Dim application_sincere_confirm_id As String = ""
            Dim accuser_idcardno As String = txtAccuserIDcardNo.Text
            Dim accuser_offcode As String = txtAccuserOffCode.Text
            Dim accuser_poscode As String = txtAccuserPOSCode.Text
            Dim issentcourt As String = IIf(chkIsSendToCourt.Checked, "Y", "N")
            'Dim arrest_report_date As String = ""
            'Dim report_to_staff As String = ""
            'Dim order_by_staff As String = ""
            Dim accuser_posname As String = lblAccuserPosName.Text
            Dim accuser_offname As String = lblAccuserOffName.Text
            Dim accuser_name As String = lblAccuserName.Text
            'Dim accuser_age As String = ""
            Dim behaviour As String = txtBEHAVIOUR.Text
            Dim testimony As String = txtTESTIMONY.Text
            Dim vAdministration As String = txtAdministration.Text

            Dim ret As Boolean = True
            Dim sql As String = "update application_arrest"
            sql += " Set track_no ='" & txtTrack_no.Text.Trim() & "'"
            sql += " ,application_date =" & IIf(application_date = "", "NULL", "to_date('" & application_date & "','yyyy-mm-dd hh24:mi:ss')") & ""
            sql += " ,department_id =" & IIf(department_id = "", "NULL", " '" & department_id & "'") & ""
            sql += " ,offcode =" & IIf(offcode = "", "NULL", "'" & offcode & "'") & ""
            sql += " ,legislation_id =" & IIf(legislation_id = "", "NULL", "'" & legislation_id & "'") & ""
            sql += " ,have_culprit =" & IIf(have_culprit = "", "NULL", "'" & have_culprit & "'") & ""
            sql += " ,scene_name =" & IIf(scene_name = "", "NULL", "'" & scene_name & "'") & ""
            sql += " ,scene_no =" & IIf(scene_no = "", "NULL", "'" & scene_no & "'") & ""
            sql += " ,scene_moo =" & IIf(scene_moo = "", "NULL", "'" & scene_moo & "'") & ""
            sql += " ,scene_soi =" & IIf(scene_soi = "", "NULL", "'" & scene_soi & "'") & ""
            sql += " ,scene_road =" & IIf(scene_road = "", "NULL", "'" & scene_road & "'") & ""
            sql += " ,scene_subdistrict =" & IIf(scene_subdistrict = "", "NULL", "'" & scene_subdistrict & "'") & ""
            sql += " ,scene_district=" & IIf(scene_district = "", "NULL", "'" & scene_district & "'") & ""
            sql += " ,scene_province=" & IIf(scene_province = "", "NULL", "'" & scene_province & "'") & ""
            sql += " ,alleged_co =" & IIf(alleged_co = "", "NULL", "'" & alleged_co & "'") & ""
            sql += " ,occurrence_date =" & IIf(occurrence_date = "", "NULL", "to_date('" & occurrence_date & "','yyyy-mm-dd hh24:mi:ss')") & ""
            sql += " ,guilty =" & IIf(guilty = "", "NULL", "'" & guilty & "'") & ""
            'sql += " ,owner_name =" & IIf(owner_name = "", "NULL", " '" & owner_name & "'") & ""
            'sql += " ,business_name =" & IIf(business_name = "", "NULL", "'" & business_name & "'") & ""
            'sql += " ,surety_name =" & IIf(surety_name = "", "NULL", "'" & surety_name & "'") & ""
            'sql += " ,duty =" & IIf(duty = "", "NULL", "'" & duty & "'") & ""
            'sql += " ,report_to =" & IIf(report_to = "", "NULL", "'" & report_to & "'") & ""
            'sql += " ,order_by=" & IIf(order_by = "", "NULL", "'" & order_by & "'") & ""
            'sql += " ,leader_position=" & IIf(leader_position = "", "NULL", "'" & leader_position & "'") & ""
            'sql += " ,director_position=" & IIf(director_position = "", "NULL", "'" & director_position & "'") & ""
            'sql += " ,behaviour=" & IIf(behaviour = "", "NULL", "'" & behaviour & "'") & ""
            'sql += " ,testimony=" & IIf(testimony = "", "NULL", "'" & testimony & "'") & ""
            'sql += " ,finished_time=" & IIf(finished_time = "", "NULL", "'" & finished_time & "'") & ""
            sql += " ,department_name =" & IIf(department_name = "", "NULL", "'" & department_name & "'") & ""
            sql += " ,lawbreak_type=" & IIf(lawbreak_type = "", "NULL", "'" & lawbreak_type & "'") & ""
            'sql += " ,administration=" & IIf(administration = "", "NULL", "'" & administration & "'") & ""
            sql += " ,estimate_fine =" & IIf(estimate_fine = "", "NULL", "'" & estimate_fine & "'") & ""
            'sql += " ,estimate_fine_date=" & IIf(estimate_fine_date = "", "NULL", "'" & estimate_fine_date & "'") & ""
            sql += " ,coordinate_x=" & IIf(coordinate_x = "", "NULL", "'" & coordinate_x & "'") & ""
            sql += " ,coordinate_y=" & IIf(coordinate_y = "", "NULL", "'" & coordinate_y & "'") & ""
            sql += " ,product_group_id=" & IIf(product_group_id = "", "NULL", "'" & product_group_id & "'") & ""
            sql += " ,accuser_type=" & IIf(accuser_type = "", "NULL", "'" & accuser_type & "'") & ""
            sql += " ,police_station =" & IIf(police_station = "", "NULL", "'" & police_station & "'") & ""
            'sql += " ,application_notice_arrest_id =" & IIf(application_notice_arrest_id = "", "NULL", "'" & application_notice_arrest_id & "'") & ""
            'sql += " ,application_search_warrant_id =" & IIf(application_search_warrant_id = "", "NULL", "'" & application_search_warrant_id & "'") & ""
            'sql += " ,application_sincere_confirm_id =" & IIf(application_sincere_confirm_id = "", "NULL", "'" & application_sincere_confirm_id & "'") & ""
            sql += " ,accuser_idcardno =" & IIf(accuser_idcardno = "", "NULL", "'" & accuser_idcardno & "'") & ""
            sql += " ,accuser_offcode =" & IIf(accuser_offcode = "", "NULL", "'" & accuser_offcode & "'") & ""
            sql += " ,accuser_poscode =" & IIf(accuser_poscode = "", "NULL", "'" & accuser_poscode & "'") & ""
            sql += " ,issentcourt =" & IIf(issentcourt = "", "NULL", "'" & issentcourt & "'") & ""
            'sql += " ,arrest_report_date =" & IIf(arrest_report_date = "", "NULL", "'" & arrest_report_date & "'") & ""
            sql += " ,update_by =" & IIf(UserName = "", "NULL", "'" & UserName & "'") & ""
            sql += " ,update_on = sysdate"
            'sql += " ,report_to_staff =" & IIf(report_to_staff = "", "NULL", "'" & report_to_staff & "'") & ""
            ' sql += " ,order_by_staff =" & IIf(order_by_staff = "", "NULL", "'" & order_by_staff & "'") & ""
            sql += " ,accuser_posname =" & IIf(accuser_posname = "", "NULL", "'" & accuser_posname & "'") & ""
            sql += " ,accuser_offname =" & IIf(accuser_offname = "", "NULL", "'" & accuser_offname & "'") & ""
            sql += " ,accuser_name =" & IIf(accuser_name = "", "NULL", "'" & accuser_name & "'") & ""
            sql += " ,behaviour = " & IIf(behaviour = "", "NULL", "'" & behaviour & "'") & ""
            sql += " ,testimony = " & IIf(testimony = "", "NULL", "'" & testimony & "'") & ""
            sql += " ,administration = " & IIf(vAdministration = "", "NULL", "'" & vAdministration & "'") & ""
            sql += " where track_no='" & track_no & "'"
            'sql += " ,accuser_age =" & IIf(accuser_age = "", "NULL", "'" & accuser_age & "'") & " "
            ret = Config.ExcuteNonQuery(sql, trans)
            If ret Then
                ret = SaveIndictment(UserName, trans)
                If ret = True Then
                    ret = SaveArrestLawbreaker(UserName, trans)
                    If ret = True Then
                        ret = SaveArrestTeam(UserName, trans)
                        If ret = True Then
                            ret = SaveArrestExhibit(UserName, trans)
                            If ret = True Then
                                If tabBookImpeachment.Enabled = True Then
                                    ret = ucBookImpeachment1.SaveBookImpeachment(UserIDCard, trans)
                                End If

                                If ret = True Then
                                    If tabCompareCase.Enabled = True Then
                                        ret = ucCompareCase1.SaveCompareCase(UserIDCard, trans)
                                    End If
                                    If ret = True Then
                                        If tabProveExhisit.Enabled = True Then
                                            ret = ucProveExhibit1.SaveProveExhibit(UserIDCard, trans)
                                        End If
                                        If ret = True Then
                                            If tabPayFine.Enabled = True Then
                                                ret = ucPayFine1.SavePayFine(UserIDCard, trans)
                                            End If

                                            If ret = True Then
                                                trans.CommitTransaction()
                                                Config.ExcuteTable("call SP_LOAD_CUBE_REPORT_2_55('" + txtTrack_no.Text.Trim() + "','" & UserName & "')")

                                                SetDataForEdit()
                                                ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "alert('บันทึกข้อมูลเรียบร้อย');", True)
                                                If lblLoginHisID.Text <> "0" Then
                                                    Config.SaveLogTrans(UserName, Request, Session.SessionID, "แก้ไขข้อมูลคดี เลขที่งาน " & txtTrack_no.Text)
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
                Else
                    trans.RollbackTransaction()
                End If
            Else
                trans.RollbackTransaction()
            End If
        Catch ex As Exception
            trans.RollbackTransaction()
        End Try
    End Function

    

    Sub ClearForm()
        txtTrack_no.Text = ""
        frmSearchDepartment1.DepartmentID = ""
        frmSearchDepartment1.DepartmentName = ""
        txtOffCode.Text = ""
        lblOffName.Text = ""
        ddlLegislation.SelectedIndex = 0
        ddlProductGroupID.SelectedIndex = 0
        rdAccuserType.SelectedIndex = 0
        txtScene_Name.Text = ""
        txtSceneNo.Text = ""
        txtSceneMoo.Text = ""
        txtSceneSoi.Text = ""
        txtSceneRoad.Text = ""
        lblNoOfLawbreak.Text = ""
        chkAllegedCo.Checked = False
        TxtApplicationDate.TxtBox.Text = ""
        txtOccuranceDate.TxtBox.Text = ""
        TxtOccuranceTime.TxtBox.Text = ""
        rdLawbreakType.SelectedIndex = 0
        rdHaveCluprit.SelectedIndex = 0
        chkIsSendToCourt.Checked = False
        txtEstimatFine.Text = ""
        lblAccuserName.Text = ""
        lblAccuserPosName.Text = ""
        lblAccuserOffName.Text = ""
        ddlSceneProvince.SelectedIndex = 0
        ddlSceneProvince_SelectedIndexChanged(Nothing, Nothing)
        'ddlSceneDistrict.SelectedIndex = 0
        'ddlScebeSubDistrict.SelectedIndex = 0
        txtPoliceStation.Text = ""
        txtCoordinateX.Text = ""
        txtCoordinateY.Text = ""
        txtAccuserIDcardNo.Text = ""
        txtAccuserOffCode.Text = ""
        txtAccuserPOSCode.Text = ""

        ucBookImpeachment1.ClearForm()
        ucProveExhibit1.ClearForm()
        ucCompareCase1.ClearForm()
    End Sub

    Sub SetDataForEdit()

        Dim dtArrest As New DataTable
        dtArrest = GetDataFromArrest(txtTrack_no.Text.Trim)
        If dtArrest.Rows.Count > 0 Then
            With dtArrest.Rows(0)
                txtTrack_no.Text = .Item("track_no").ToString
                frmSearchDepartment1.DepartmentID = .Item("department_id").ToString
                frmSearchDepartment1.DepartmentName = .Item("department_name").ToString
                txtOffCode.Text = .Item("offcode").ToString
                lblOffName.Text = .Item("offname").ToString

                Try
                    ddlLegislation.SelectedValue = .Item("legislation_id")
                    SetDDlProduct(ddlLegislation.SelectedValue)
                Catch ex As Exception
                    ddlLegislation.SelectedIndex = 0
                End Try

                Try
                    ddlProductGroupID.SelectedValue = .Item("product_group_id")
                Catch ex As Exception
                    ddlProductGroupID.SelectedIndex = 0
                End Try

                Try
                    rdAccuserType.SelectedValue = .Item("Accuser_Type")
                Catch ex As Exception
                End Try

                txtScene_Name.Text = .Item("Scene_Name").ToString
                txtSceneNo.Text = .Item("SCENE_NO").ToString
                txtSceneMoo.Text = .Item("SCENE_MOO").ToString
                txtSceneSoi.Text = .Item("SCENE_SOI").ToString
                txtSceneRoad.Text = .Item("SCENE_ROAD").ToString
                lblNoOfLawbreak.Text = 0 ' count รายชื่อผู้กระทำผิด and visible=false
                chkAllegedCo.Checked = 0 ' เชค count รายชื่อผู้กระทำผิด > 2 ให้ checked=true and visible=false
                TxtApplicationDate.DateValue = Convert.ToDateTime(.Item("APPLICATION_DATE")) 'Convert.ToDateTime(.Item("APPLICATION_DATE")).ToString("dd/MM/yyyy", New System.Globalization.CultureInfo("en-US"))
                txtOccuranceDate.DateValue = Convert.ToDateTime(.Item("OCCURRENCE_DATE")) 'Convert.ToDateTime(.Item("OCCURRENCE_DATE")).ToString("dd/MM/yyyy", New System.Globalization.CultureInfo("en-US"))
                TxtOccuranceTime.TxtBox.Text = Convert.ToDateTime(.Item("OCCURRENCE_DATE")).ToString("HH:mm")
                rdLawbreakType.SelectedValue = IIf(.Item("LAWBREAK_TYPE").ToString = "2", "2", "1")
                rdHaveCluprit.SelectedValue = .Item("HAVE_CULPRIT").ToString
                chkIsSendToCourt.Checked = IIf(.Item("ISSENTCOURT").ToString = "Y", True, False)
                txtEstimatFine.Text = .Item("ESTIMATE_FINE").ToString
                lblAccuserName.Text = .Item("ACCUSER_NAME").ToString
                lblAccuserPosName.Text = .Item("POSNAME").ToString
                lblAccuserOffName.Text = .Item("offname").ToString '**งง

                Try
                    ddlSceneProvince.SelectedValue = .Item("SCENE_PROVINCE").ToString
                    SetDDlDistrict(ddlSceneProvince.SelectedValue)
                Catch ex As Exception
                    ddlSceneProvince.SelectedIndex = 0
                End Try

                Try
                    ddlSceneDistrict.SelectedValue = .Item("SCENE_DISTRICT").ToString
                    SetDllSubDistrict(ddlSceneDistrict.SelectedValue)
                Catch ex As Exception
                    ddlSceneDistrict.SelectedIndex = 0
                End Try

                Try
                    ddlScebeSubDistrict.SelectedValue = .Item("SCENE_SUBDISTRICT").ToString
                Catch ex As Exception
                    ddlScebeSubDistrict.SelectedIndex = 0
                End Try

                txtPoliceStation.Text = .Item("POLICE_STATION").ToString
                txtCoordinateX.Text = .Item("COORDINATE_X").ToString
                txtCoordinateY.Text = .Item("COORDINATE_Y").ToString
                txtAccuserIDcardNo.Text = .Item("accuser_idcardno").ToString
                txtAccuserPOSCode.Text = .Item("accuser_poscode").ToString
                txtAccuserOffCode.Text = .Item("accuser_offcode").ToString

                txtBEHAVIOUR.Text = .Item("behaviour").ToString
                txtTESTIMONY.Text = .Item("testimony").ToString
                txtAdministration.Text = .Item("administration").ToString
            End With


            'ข้อกล่าวหา
            Dim dtIndictment As New DataTable
            dtIndictment = GetDataFromIndictment(txtTrack_no.Text)
            If dtIndictment.Rows.Count > 0 Then
                dtIndictment.Columns.Add("seq", GetType(String))
                For i As Integer = 0 To dtIndictment.Rows.Count - 1
                    dtIndictment.Rows(i)("seq") = i + 1
                Next
                gvIndictment.DataSource = dtIndictment
                gvIndictment.DataBind()
            End If

            'คณะผู้จับกุม
            Dim dtTeam As New DataTable
            dtTeam = GetDataFromTeam(txtTrack_no.Text.Trim)
            If dtTeam.Rows.Count > 0 Then
                dtTeam.Columns.Add("seq", GetType(String))
                For i As Integer = 0 To dtTeam.Rows.Count - 1
                    dtTeam.Rows(i)("seq") = i + 1
                Next
                gvArrestList.DataSource = dtTeam
                gvArrestList.DataBind()
            End If

            'รายชื่อผู้กระทำผิด
            Dim dtLawBreaker As New DataTable
            dtLawBreaker = GetDataFromLawbreaker(txtTrack_no.Text.Trim)
            If dtLawBreaker.Rows.Count > 0 Then
                dtLawBreaker.Columns.Add("seq", GetType(String))
                For i As Integer = 0 To dtLawBreaker.Rows.Count - 1
                    dtLawBreaker.Rows(i)("seq") = i + 1
                Next
                gvArrestLawbreaker.DataSource = dtLawBreaker
                gvArrestLawbreaker.DataBind()

                Session("LawbreakerData") = dtLawBreaker
                lblNoOfLawbreak.Text = dtLawBreaker.Rows.Count ' count รายชื่อผู้กระทำผิด and visible=false
                If dtLawBreaker.Rows.Count > 1 Then
                    chkAllegedCo.Checked = True ' เชค count รายชื่อผู้กระทำผิด > 2 ให้ checked=true and visible=false
                End If
            End If


            'บัญชีสิ่งของ
            Dim dtExhibit As New DataTable
            dtExhibit = GetDataFromExhibit(txtTrack_no.Text.Trim)
            If dtExhibit.Rows.Count > 0 Then
                dtExhibit.Columns.Add("seq")
                dtExhibit.Columns.Add("size_name")
                dtExhibit.Columns.Add("qty_name")
                dtExhibit.Columns.Add("weight_name")
                For i As Integer = 0 To dtExhibit.Rows.Count - 1
                    dtExhibit.Rows(i)("seq") = (i + 1)
                    dtExhibit.Rows(i)("size_name") = dtExhibit.Rows(i)("size_desc") & " " & dtExhibit.Rows(i)("size_unit_name")
                    dtExhibit.Rows(i)("qty_name") = dtExhibit.Rows(i)("qty") & " " & dtExhibit.Rows(i)("qty_unit_name")
                    dtExhibit.Rows(i)("weight_name") = dtExhibit.Rows(i)("weight") & " " & dtExhibit.Rows(i)("weight_unit_name")
                Next

                gvExhibitList.DataSource = dtExhibit
                gvExhibitList.DataBind()
            End If
            dtExhibit.Dispose()


            With dtArrest.Rows(0)
                If IsDBNull(.Item("book_impeachment_id")) = False Then
                    'บันทึกรับคำกล่าวโทษ
                    ucBookImpeachment1.FillInData(txtTrack_no.Text)

                    'พิสูจน์ของกลาง
                    ucProveExhibit1.FillInData(txtTrack_no.Text)

                    'เปรียบเทียบปรับ
                    If IsDBNull(.Item("compare_case_id")) = False Then
                        If ucBookImpeachment1.CaseQuality = "1" Then
                            ucCompareCase1.FillInData(txtTrack_no.Text)
                        Else
                            tabCompareCase.Enabled = False
                        End If
                    Else
                        tabCompareCase.Enabled = False
                    End If

                    'ชำระเงินค่าปรับและออกใบเสร็จ
                    If IsDBNull(.Item("pay_date")) = False Then
                        If ucBookImpeachment1.CaseQuality = "1" Then
                            ucPayFine1.FillInData(txtTrack_no.Text)
                        Else
                            tabPayFine.Enabled = False
                        End If
                    Else
                        tabPayFine.Enabled = False
                    End If
                Else
                    tabBookImpeachment.Enabled = False
                    tabCompareCase.Enabled = False
                    tabProveExhisit.Enabled = False
                    tabPayFine.Enabled = False
                End If
            End With
        End If
        dtArrest.Dispose()
    End Sub

    Function GetDataFromArrest(ByVal track_no As String) As DataTable
        Dim sql As String = "select aa.lawbreak_type, aa.scene_name, aa.scene_no, aa.scene_moo, aa.scene_soi, aa.scene_road, aa.police_station, " & vbNewLine
        sql += " aa.accuser_poscode, aa.accuser_offcode, aa.issentcourt, aa.estimate_fine, aa.department_id, aa.department_name, " & vbNewLine
        sql += " aa.id, aa.track_no, pke_arrest.getArrestIndictment(aa.track_no) guilt_base, aa.coordinate_x, aa.coordinate_y, " & vbNewLine
        sql += " aa.accuser_idcardno, aa.report_to ,aa.order_by, aa.SCENE_PROVINCE, aa.SCENE_SUBDISTRICT, aa.SCENE_DISTRICT," & vbNewLine
        sql += " aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2,  " & vbNewLine
        sql += " to_char(aa.occurrence_date,'HH24:mi') occurrence_time, " & vbNewLine
        sql += " aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  application_date2, " & vbNewLine
        sql += " nvl(aa.accuser_name,tia.title_name || sta.first_name || ' ' || sta.last_name) accuser_name, aa.legislation_id, lg.legislation_name, " & vbNewLine
        sql += " aa.product_group_id, dg.group_name product_group_name, aa.accuser_type,  aa.have_culprit, aa.offcode, ed.short_name area_offname, " & vbNewLine
        sql += " nvl(aa.accuser_offname, nvl(sta.offname,eda.offname)) offname,nvl(aa.accuser_posname, nvl(sta.posname,ps.posname)) posname,  " & vbNewLine
        sql += " ana.notice_no , ana.inform_name ,asw.warrant_no, asi.track_no confirm_no,aa.application_notice_arrest_id,aa.application_search_warrant_id, " & vbNewLine
        sql += " aa.application_sincere_confirm_id, nvl(aa.report_to_staff,tir.title_name || str.first_name || ' ' || str.last_name) report_to_staff,   " & vbNewLine
        sql += " tio.title_name || sto.first_name || ' ' || sto.last_name order_by_staff, pke_compare.chkCaseLast(aa.track_no) chkCaseLast,  " & vbNewLine
        sql += " aa.behaviour, aa.testimony,  aa.owner_name,aa.business_name,aa.surety_name, aa.leader_position, aa.guilty, aa.duty, aa.director_position,  " & vbNewLine
        sql += " to_char(aa.arrest_report_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') arrest_report_date,  " & vbNewLine
        sql += " aa.administration, to_char(aa.finished_time,'HH24:mi') finished_time, ed.indc_off, bi.id book_impeachment_id, cc.id compare_case_id, cc.pay_date " & vbNewLine
        sql += " from application_arrest aa  " & vbNewLine
        sql += " left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno  " & vbNewLine
        sql += " left join title tia on tia.title_code=sta.title_code " & vbNewLine
        sql += " left join staff str on str.idcard_no=to_char(aa.report_to) " & vbNewLine
        sql += " left join title tir on tir.title_code=str.title_code " & vbNewLine
        sql += " left join staff sto on sto.idcard_no=to_char(aa.order_by) " & vbNewLine
        sql += " left join title tio on tio.title_code=sto.title_code " & vbNewLine
        sql += " inner join legislation lg on lg.id=aa.legislation_id " & vbNewLine
        sql += " inner join duty_group dg on dg.group_id=aa.product_group_id " & vbNewLine
        sql += " inner join province pv on pv.province_code=aa.scene_province " & vbNewLine
        sql += " left join district d on d.district_code=aa.scene_district " & vbNewLine
        sql += " left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict " & vbNewLine
        sql += " inner join ed_office ed on ed.offcode=aa.offcode " & vbNewLine
        sql += " left join ed_office eda on eda.offcode=aa.accuser_offcode " & vbNewLine
        sql += " left join position ps on ps.poscode=aa.accuser_poscode " & vbNewLine
        sql += " left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id " & vbNewLine
        sql += " left join application_search_warrant asw on asw.id=aa.application_search_warrant_id " & vbNewLine
        sql += " left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id " & vbNewLine
        sql += " left join book_impeachment bi on bi.track_no=aa.track_no " & vbNewLine
        sql += " left join compare_case cc on cc.track_no=aa.track_no " & vbNewLine
        sql += " where  aa.track_no = '" & track_no & "'"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        Return dt
    End Function

    Function GetDataFromExhibit(ByVal track_no As String) As DataTable
        'รายการบัญชีสิ่งของ
        Dim sql As String = "select aae.id, aae.TRACK_NO , aae.BRAND_CODE, aae.ISDOMESTIC,decode(aae.isdomestic,'I','ในประเทศ','O','ต่างประเทศ','Z','') is_domestic_name,"
        sql += " nvl(aae.sizes_desc,sp.size_desc) size_desc, aae.SIZE_UNIT_CODE, nvl(aae.sizes_unit_name,nvl(su.thname,su.enname)) size_unit_name, "
        sql += " aae.QTY, aae.qty_unit_code, nvl(aae.qty_unit_name,nvl(qu.thname,qu.enname)) qty_unit_name, "
        sql += " aae.NETWEIGHT weight, aae.NETWEIGHT_UNIT_CODE weight_unit_code, nvl(aae.netweight_unit_name,nvl(wu.thname, wu.enname)) weight_unit_name, "
        sql += " aae.STATUS exhibit_status, decode(aae.status,'1','ยึด','2','คืน') exhibit_status_name,aae.EXHIBIT_LIST, aae.EXHIBIT_DESC, "
        sql += " aae.CAR_NO,  aae.DUTY_CODE, nvl(aae.duty_name,dt.duty_name) duty_name, aae.REMARKS,"
        sql += " nvl(aae.brand_name,  nvl(b.brand_main_thai, b.brand_main_eng)) brand_name,"
        sql += " aae.group_id, nvl(aae.group_name,dg.group_name) group_name"
        sql += " from APPLICATION_ARREST_EXHIBIT aae "
        sql += " left join unit su on su.unit_code = aae.size_unit_code "
        sql += " left join unit qu on qu.unit_code = aae.qty_unit_code "
        sql += " left join unit wu on wu.unit_code = aae.netweight_unit_code "
        sql += " left join brand_main b on b.group_id = aae.group_id and b.brand_main_code =aae.brand_code"
        sql += " left join size_package sp on sp.group_id = aae.group_id and sp.size_code = aae.sizes_code"
        sql += " left join application_arrest_exhibit aeco on aeco.id=aae.application_arrest_exhibit_id "
        sql += " left join book_impeachment bi on bi.track_no = aeco.track_no"
        sql += " left join DUTY_TABLE dt on dt.duty_code=aae.duty_code"
        sql += " left join duty_group dg on dg.group_id=aae.group_id "
        sql += " where aae.track_no = '" & track_no & "' "
        sql += " order by aae.id"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)

        Return dt
    End Function

    Function GetDataFromLawbreaker(ByVal track_no As String) As DataTable
        'รายชื่อผู้กระทำผิด
        Dim sql As String = "SELECT aal.ID, aal.TRACK_NO, aal.LAWBREAKER_NO,  aal.CULPRIT_TYPE, aal.LAWBREAKER_ID_CARD, aal.LAWBREAKER_PASSPORT,   "
        sql += " aal.FIRST_NAME, aal.MIDDLE_NAME, aal.LAST_NAME,   aal.ADDRESS_NO, aal.SOI, aal.ROAD,   aal.MOO, aal.SUBDISTRICT, aal.DISTRICT,   aal.PROVINCE,  "
        sql += " aal.NATIONALITY_ID, aal.RACE_ID,   aal.CAREER, aal.AGE, aal.FATHER_NAME,   aal.MOTHER_NAME, aal.PAID_TIME_OFF, "
        sql += " aal.INVCODE,   aal.FINE, aal.BOOK_NO, aal.INV_NO,   aal.ISCANCEL, aal.CANCEL_DATE, aal.CANCEL_BY,   aal.CREATE_BY, aal.CREATE_ON, "
        sql += " aal.UPDATE_BY,   aal.UPDATE_ON, aal.TITLE_CODE, aal.SEX,    aal.OTHER_NAME, aal.EXCISE_REG_NO,   "
        sql += " to_char(aal.birth_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  birth_date,  "
        sql += " aal.CORPORATION_CODE, aal.COMPANY_TITLE_CODE, aal.COMPANY_NAME,   aal.PAPER_NO, aal.ISMISTAKE, aal.ISMISTAKE_DESC,  "
        sql += " p.province_name ,d.district_name, st.subdistrict_name,  tl.title_name, r.race_name race_id_name,n.nation_name nationality_id_name  "
        sql += " ,aal.FIRST_NAME || '  ' || aal.LAST_NAME as fullname"
        sql += " ,case CULPRIT_TYPE when 1 then 'คนไทย' when 2 then 'ชาวต่างชาติ'  when 3 then 'ผู้ประกอบการ' else '' end as CULPRIT"
        sql += " ,address_no || ' ' || soi  || ' ' || road || ' ' || moo || ' '||subdistrict_name || ' ' || district_name || ' ' || province_name as address"
        sql += " FROM APPLICATION_ARREST_LAWBREAKER aal  "
        sql += " left join province p on p.province_code = aal.province  "
        sql += " left join district d on d.district_code = aal.district  "
        sql += " left join subdistrict st on st.subdistrict_code = aal.subdistrict  "
        sql += " left join title tl on tl.title_code = aal.title_code "
        sql += " left join race r on r.id = aal.race_id "
        sql += " left join nationality n on n.id = aal.NATIONALITY_ID "
        sql += " where aal.track_no = '" & track_no & "'"
        sql += " order by aal.id"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)

        Return dt
    End Function

    Function GetDataFromIndictment(ByVal track_no As String) As DataTable
        'ข้อกล่าวหา
        Dim sql As String = "SELECT aai.ID, aai.CREATE_BY, aai.CREATE_ON, aai.UPDATE_BY, aai.TRACK_NO,  aai.INDICTMENT_ID, aai.EXHIBIT_WILD, "
        sql += " inc.case_law_id, inc.penalty_case_law_id, replace(inc.guilt_base," & "''" & "," & "'" & "\" & "'" & ") guilt_base "
        sql += " FROM APPLICATION_ARREST_INDICTMENT aai "
        sql += " left join indictment inc on inc.indictment_id = aai.indictment_id  "
        sql += " where aai.track_no = '" & track_no & "'  "
        sql += " order by aai.id"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        Return dt
    End Function

    Function GetDataFromTeam(ByVal track_no As String) As DataTable
        'คณะผู้จับกุม
        Dim sql As String = "SELECT aat.ID, aat.CREATE_BY, aat.CREATE_ON,  aat.UPDATE_BY, aat.UPDATE_ON, aat.TRACK_NO,    "
        sql += " aat.STAFF_NO, aat.INSPECTOR_CODE, aat.STAFF_POSITION,  aat.DUTY_STATUS_ID, aat.STAFF_IDCARDNO, "
        sql += " aat.STAFF_POSCODE,    aat.STAFF_OFFCODE, st.title_code,st.first_name,st.last_name,t.title_name,     "
        sql += " aat.staff_offcode offcode, nvl(ed.offname,st.dept_name) offname , nvl(aat.staff_position,nvl(st.pos_name,  ps.posname)) posname,  "
        sql += " t.title_name || ' ' || st.first_name || ' ' || st.last_name as fullname"
        sql += " FROM APPLICATION_ARREST_TEAM aat   "
        sql += " left join v_accuser_list_popup st on st.idcard_no = aat.STAFF_IDCARDNO   "
        sql += " left join title t on t.title_code = st.title_code   "
        sql += " left join ed_office ed on ed.offcode = aat.staff_offcode  "
        sql += " left join position ps on ps.poscode = aat.STAFF_POSCODE  "
        sql += " where aat.track_no = '" & track_no & "' "
        sql += " order by aat.id"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        Return dt
    End Function
    

#End Region 'Sub&&Function

#Region "Indictment"
    Sub AddIndictment(ByVal dt As DataTable)
        Dim newdt As New DataTable
        With newdt
            .Columns.Add("CASE_LAW_ID")
            .Columns.Add("PENALTY_CASE_LAW_ID")
            .Columns.Add("GUILT_BASE")
            .Columns.Add("Exhibit_Wild")
            .Columns.Add("INDICTMENT_ID")
        End With

        For Each grv As GridViewRow In gvIndictment.Rows
            Dim dr As DataRow = newdt.NewRow
            dr("CASE_LAW_ID") = grv.Cells(2).Text '"CASE_LAW_ID"
            dr("PENALTY_CASE_LAW_ID") = grv.Cells(3).Text '"PENALTY_CASE_LAW_ID"
            dr("GUILT_BASE") = grv.Cells(4).Text '"GUILT_BASE"

            Dim lblExb As Label = DirectCast(grv.FindControl("lblExhibitWild"), Label)
            dr("Exhibit_Wild") = lblExb.Text

            Dim lblIndictmentID As Label = grv.FindControl("lblIndictmentID")
            dr("INDICTMENT_ID") = lblIndictmentID.Text
            newdt.Rows.Add(dr)
        Next

        For i As Integer = 0 To dt.Rows.Count - 1
            newdt.DefaultView.RowFilter = "INDICTMENT_ID='" & dt.Rows(i)("INDICTMENT_ID").ToString & "'"
            If newdt.DefaultView.Count = 0 Then
                Dim dr As DataRow = newdt.NewRow
                dr("CASE_LAW_ID") = dt.Rows(i)("CASE_LAW_ID").ToString
                dr("PENALTY_CASE_LAW_ID") = dt.Rows(i)("PENALTY_CASE_LAW_ID").ToString
                dr("GUILT_BASE") = dt.Rows(i)("GUILT_BASE").ToString
                dr("Exhibit_Wild") = dt.Rows(i)("Exhibit_Wild").ToString
                dr("INDICTMENT_ID") = dt.Rows(i)("INDICTMENT_ID").ToString
                newdt.Rows.Add(dr)
            End If
            newdt.DefaultView.RowFilter = ""
        Next

        newdt.Columns.Add("seq", GetType(String))
        For i As Integer = 0 To newdt.Rows.Count - 1
            newdt.Rows(i)("seq") = i + 1
        Next
        gvIndictment.DataSource = newdt
        gvIndictment.DataBind()

    End Sub

    Private Function SaveIndictment(ByVal UserName As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        If gvIndictment.Rows.Count > 0 Then
            Try
                Config.ExcuteNonQuery("delete from application_arrest_indictment where track_no='" & txtTrack_no.Text.Trim() & "'", trans)

                For i As Integer = 0 To gvIndictment.Rows.Count - 1
                    Dim chkExhibitWild As CheckBox = gvIndictment.Rows(i).FindControl("chkExhibitWild")
                    Dim txtIndictmentID As Label = gvIndictment.Rows(i).FindControl("lblIndictmentID")

                    Dim sql As String = "insert into application_arrest_indictment (id,create_by,create_on,track_no,indictment_id,exhibit_wild) " & vbNewLine
                    sql += "values(applicationarrestindictmentseq.nextval,'" & UserName & "',sysdate,'" & txtTrack_no.Text.Trim() & "','" & txtIndictmentID.Text & "','" & IIf(chkExhibitWild.Checked = True, "Y", "N") & "')"
                    ret = Config.ExcuteNonQuery(sql, trans)

                    If ret = False Then
                        Exit For
                    End If
                Next
            Catch ex As Exception
                ret = False
            End Try
        Else
            ret = True
        End If

        Return ret
    End Function

    Sub DeleteIndictment()
        Dim newdt As New DataTable
        With newdt
            .Columns.Add("CASE_LAW_ID")
            .Columns.Add("PENALTY_CASE_LAW_ID")
            .Columns.Add("GUILT_BASE")
            .Columns.Add("Exhibit_Wild")
            .Columns.Add("INDICTMENT_ID")
        End With

        For Each grv As GridViewRow In gvIndictment.Rows
            Dim chk As CheckBox = DirectCast(grv.FindControl("Chk"), CheckBox)
            If chk.Checked = False Then
                Dim dr As DataRow = newdt.NewRow
                dr("CASE_LAW_ID") = grv.Cells(2).Text '"CASE_LAW_ID"
                dr("PENALTY_CASE_LAW_ID") = grv.Cells(3).Text '"PENALTY_CASE_LAW_ID"
                dr("GUILT_BASE") = grv.Cells(4).Text '"GUILT_BASE"

                Dim lblExb As Label = DirectCast(grv.FindControl("lblExhibitWild"), Label)
                dr("Exhibit_Wild") = lblExb.Text

                Dim lblIndictmentID As Label = grv.FindControl("lblIndictmentID")
                dr("INDICTMENT_ID") = lblIndictmentID.Text

                newdt.Rows.Add(dr)
            End If
        Next

        newdt.Columns.Add("seq", GetType(String))
        For i As Integer = 0 To newdt.Rows.Count - 1
            newdt.Rows(i)("seq") = i + 1
        Next
        gvIndictment.DataSource = newdt
        gvIndictment.DataBind()
    End Sub

    Private Sub gvIndictment_RowDataBound(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewRowEventArgs) Handles gvIndictment.RowDataBound
        Try
            If e.Row.RowType = DataControlRowType.DataRow Then
                Dim chk As CheckBox = DirectCast(e.Row.FindControl("chkExhibitWild"), CheckBox)
                Dim lbl As Label = DirectCast(e.Row.FindControl("lblExhibitWild"), Label)
                chk.Enabled = False

                If lbl.Text = "Y" Then
                    chk.Checked = True
                Else
                    chk.Checked = False
                End If
            End If
        Catch ex As Exception

        End Try
    End Sub

    Protected Sub btnDeleteIndictment_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnDeleteIndictment.Click
        DeleteIndictment()
    End Sub

    Private Sub btnAddIndictment_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAddIndictment.Click
        If ddlLegislation.SelectedValue = "0" Then
            Config.SetAlert("กรุณาเลือก พ.ร.บ.", Me, ddlLegislation.ClientID)
        Else
            frmSearchIndictment1.ShowPop(ddlLegislation.SelectedValue)
        End If
    End Sub

    Private Sub frmSearchIndictment1_SelectIndictment(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As System.Data.DataTable) Handles frmSearchIndictment1.SelectIndictment
        AddIndictment(dt)
    End Sub
#End Region 'IndictmentEvent

#Region "AddArrestTeamList"
    Sub AddArrestTeamList(ByVal dt As DataTable)
        Dim newdt As New DataTable
        With newdt
            .Columns.Add("STAFF_IDCARDNO")
            .Columns.Add("STAFF_POSCODE")
            .Columns.Add("STAFF_OFFCODE")
            .Columns.Add("fullname")
            .Columns.Add("posname")
            .Columns.Add("offname")
        End With

        For Each grv As GridViewRow In gvArrestList.Rows
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
        gvArrestList.DataSource = newdt
        gvArrestList.DataBind()

    End Sub

    Sub DeleteArrestList()
        Dim newdt As New DataTable
        With newdt
            .Columns.Add("STAFF_IDCARDNO")
            .Columns.Add("STAFF_POSCODE")
            .Columns.Add("STAFF_OFFCODE")
            .Columns.Add("fullname")
            .Columns.Add("posname")
            .Columns.Add("offname")
        End With

        For Each grv As GridViewRow In gvArrestList.Rows
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
        gvArrestList.DataSource = newdt
        gvArrestList.DataBind()
    End Sub

    Protected Sub btnDeleteDivide_staff_poplist_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnDeleteDivide_staff_poplist.Click
        DeleteArrestList()
    End Sub

    Function GetDutyStatus() As DataTable
        Dim sql As String = "Select id,status_code,status_name from duty_status where id not in(1,2)"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)

        Return dt
    End Function

    Private Sub gvArrestList_RowDataBound(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewRowEventArgs) Handles gvArrestList.RowDataBound
        Try
            If e.Row.RowType = DataControlRowType.DataRow Then
                Dim ddl As DropDownList = DirectCast(e.Row.FindControl("ddlDuty"), DropDownList)
                ddl.DataTextField = "status_name"
                ddl.DataValueField = "id"
                Dim dt As New DataTable
                dt = GetDutyStatus()
                ddl.DataSource = dt
                ddl.DataBind()
            End If
        Catch ex As Exception
            ScriptManager.RegisterStartupScript(Me, Me.GetType(), Guid.NewGuid().ToString(), "alert('" & ex.ToString() & "');", True)
        End Try

    End Sub

    Private Sub frmPopArrestTeam1_SelectArrestTeamList(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As System.Data.DataTable) Handles frmPopArrestTeam1.SelectArrestTeamList
        AddArrestTeamList(dt)
    End Sub

    Private Sub btnAddDivide_staff_poplist_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAddDivide_staff_poplist.Click
        frmPopArrestTeam1.ShowPop()
    End Sub

    Private Function SaveArrestTeam(ByVal UserName As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        If gvArrestList.Rows.Count > 0 Then
            Try
                Config.ExcuteNonQuery("delete from application_arrest_team where track_no='" & txtTrack_no.Text.Trim() & "'", trans)

                For i As Integer = 0 To gvArrestList.Rows.Count - 1
                    Dim grv As GridViewRow = gvArrestList.Rows(i)
                    Dim StaffPositionName As String = DirectCast(grv.FindControl("lblposname"), Label).Text
                    Dim DutyStatusID As String = DirectCast(grv.FindControl("ddlDuty"), DropDownList).SelectedValue
                    Dim StaffIDCardNo As String = DirectCast(grv.FindControl("lblidcard_no"), Label).Text
                    Dim StaffPositionCode As String = DirectCast(grv.FindControl("lblposcode"), Label).Text
                    Dim StaffOffcode As String = DirectCast(grv.FindControl("lbloffcode"), Label).Text

                    Dim sql As String = "insert into application_arrest_team (id,create_by,create_on,track_no," & vbNewLine
                    sql += "staff_position,duty_status_id,staff_idcardno,staff_poscode,staff_offcode) " & vbNewLine
                    sql += " values(application_arrest_team_seq.nextval,'" & UserName & "',sysdate,'" & txtTrack_no.Text.Trim() & "'," & vbNewLine
                    If StaffPositionName = "" Then sql += "null," Else sql += "'" & StaffPositionName & "',"
                    sql += "'" & DutyStatusID & "',"
                    If StaffIDCardNo = "" Then sql += "null," Else sql += "'" & StaffIDCardNo & "',"
                    If StaffPositionCode = "" Then sql += "null," Else sql += "'" & StaffPositionCode & "',"
                    If StaffOffcode = "" Then sql += "null" Else sql += "'" & StaffOffcode & "'" & vbNewLine
                    sql += ")"
                    ret = Config.ExcuteNonQuery(sql, trans)

                    If ret = False Then
                        Exit For
                    End If
                Next
            Catch ex As Exception
                ret = False
            End Try
        Else
            ret = True
        End If
        Return ret
    End Function
#End Region 'ArrestList
   
#Region "Lawbreaker"
    Sub AddLawbreaker(ByVal dt As DataTable)
        Dim newdt As New DataTable
        With newdt
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
            .Columns.Add("Address")
            .Columns.Add("CULPRIT")
            .Columns.Add("MIDDLE_NAME")
            .Columns.Add("EXCISE_REG_NO")
            .Columns.Add("CORPORATION_CODE")
            .Columns.Add("COMPANY_NAME")
            .Columns.Add("COMPANY_TITLE_CODE")
            .Columns.Add("seq")
        End With


        For Each grv As GridViewRow In gvArrestLawbreaker.Rows
            Dim lblLAWBREAKER_ID_CARD As Label = DirectCast(grv.FindControl("lblLAWBREAKER_ID_CARD"), Label)
            If dt.Rows(0)("seq") = "0" Then
                If dt.Rows(0)("LAWBREAKER_ID_CARD").ToString = lblLAWBREAKER_ID_CARD.Text Then
                    ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "alert('ผู้กระทำผิดซ้ำ');", True)
                    Exit Sub
                End If
            End If

            Dim vID As String = grv.Cells(1).Text
            Dim lblNationality_ID As Label = DirectCast(grv.FindControl("lblNationality_ID"), Label)
            Dim lblRace_ID As Label = DirectCast(grv.FindControl("lblRace_ID"), Label)
            Dim lblSubDistrict_Code As Label = DirectCast(grv.FindControl("lblSubDistrict_Code"), Label)
            Dim lblDistrict_Code As Label = DirectCast(grv.FindControl("lblDistrict_Code"), Label)
            Dim lblProvince_Code As Label = DirectCast(grv.FindControl("lblProvince_Code"), Label)
            Dim lblTitle_Code As Label = DirectCast(grv.FindControl("lblTitle_Code"), Label)
            Dim lblCULPRIT As Label = DirectCast(grv.FindControl("lblCULPRIT"), Label)
            Dim lblCAREER As Label = DirectCast(grv.FindControl("lblCAREER"), Label)
            Dim lblBIRTH_DATE As Label = DirectCast(grv.FindControl("lblBIRTH_DATE"), Label)
            Dim lblLAWBREAKER_PASSPORT As Label = DirectCast(grv.FindControl("lblLAWBREAKER_PASSPORT"), Label)
            Dim lblrace_id_name As Label = DirectCast(grv.FindControl("lblrace_id_name"), Label)
            Dim lblnationality_id_name As Label = DirectCast(grv.FindControl("lblnationality_id_name"), Label)
            Dim lblAddress As Label = DirectCast(grv.FindControl("lblAddress"), Label)
            Dim lblFATHER_NAME As Label = DirectCast(grv.FindControl("lblFATHER_NAME"), Label)
            Dim lblMOTHER_NAME As Label = DirectCast(grv.FindControl("lblMOTHER_NAME"), Label)
            Dim lblCULPRIT_TYPE As Label = DirectCast(grv.FindControl("lblCULPRIT_TYPE"), Label)
            Dim lblSex As Label = DirectCast(grv.FindControl("lblSex"), Label)
            Dim lblFirstName As Label = DirectCast(grv.FindControl("lblFirstName"), Label)
            Dim lblLastName As Label = DirectCast(grv.FindControl("lblLastName"), Label)
            Dim lblOtherName As Label = DirectCast(grv.FindControl("lblOtherName"), Label)
            Dim lblAddress_no As Label = DirectCast(grv.FindControl("lblAddress_no"), Label)
            Dim lblMoo As Label = DirectCast(grv.FindControl("lblMoo"), Label)
            Dim lblSoi As Label = DirectCast(grv.FindControl("lblSoi"), Label)
            Dim lblRoad As Label = DirectCast(grv.FindControl("lblRoad"), Label)
            Dim lblTitle_Name As Label = DirectCast(grv.FindControl("lblTitle_Name"), Label)
            Dim lblProvince_Name As Label = DirectCast(grv.FindControl("lblProvince_Name"), Label)
            Dim lblDistrict_Name As Label = DirectCast(grv.FindControl("lblDistrict_Name"), Label)
            Dim lblSubDistrict_Name As Label = DirectCast(grv.FindControl("lblSubDistrict_Name"), Label)
            Dim lblAge As Label = DirectCast(grv.FindControl("lblAge"), Label)
            Dim lblMIDDLE_NAME As Label = DirectCast(grv.FindControl("lblMIDDLE_NAME"), Label)
            Dim lblEXCISE_REG_NO As Label = DirectCast(grv.FindControl("lblEXCISE_REG_NO"), Label)
            Dim lblCORPORATION_CODE As Label = DirectCast(grv.FindControl("lblCORPORATION_CODE"), Label)
            Dim lblCOMPANY_NAME As Label = DirectCast(grv.FindControl("lblCOMPANY_NAME"), Label)
            Dim lblCOMPANY_TITLE_CODE As Label = DirectCast(grv.FindControl("lblCOMPANY_TITLE_CODE"), Label)

            Dim dr As DataRow = newdt.NewRow
            dr("ID") = vID
            dr("CULPRIT_TYPE") = lblCULPRIT_TYPE.Text
            dr("LAWBREAKER_ID_CARD") = lblLAWBREAKER_ID_CARD.Text
            dr("LAWBREAKER_PASSPORT") = lblLAWBREAKER_PASSPORT.Text
            dr("Sex") = lblSex.Text
            dr("Title_Code") = lblProvince_Code.Text
            dr("Title_Name") = lblTitle_Name.Text
            dr("First_Name") = lblFirstName.Text
            dr("Last_Name") = lblLastName.Text
            dr("Other_Name") = lblOtherName.Text
            dr("Address_no") = lblAddress_no.Text
            dr("Moo") = lblMoo.Text
            dr("Soi") = lblSoi.Text
            dr("Road") = lblRoad.Text
            dr("Province") = lblProvince_Code.Text
            dr("Province_Name") = lblProvince_Name.Text
            dr("District") = lblDistrict_Code.Text
            dr("District_Name") = lblDistrict_Name.Text
            dr("SubDistrict") = lblSubDistrict_Code.Text
            dr("SubDistrict_Name") = lblSubDistrict_Name.Text
            dr("Race_ID") = lblRace_ID.Text
            dr("Race_ID_Name") = lblrace_id_name.Text
            dr("Nationality_ID") = lblNationality_ID.Text
            dr("Nationality_ID_Name") = lblnationality_id_name.Text
            dr("CAREER") = lblCAREER.Text
            dr("Birth_DATE") = lblBIRTH_DATE.Text
            dr("Age") = lblAge.Text
            dr("Father_Name") = lblFATHER_NAME.Text
            dr("Mother_Name") = lblMOTHER_NAME.Text
            dr("Address") = lblAddress.Text
            dr("CULPRIT") = lblCULPRIT.Text
            dr("MIDDLE_NAME") = lblMIDDLE_NAME.Text
            dr("EXCISE_REG_NO") = lblEXCISE_REG_NO.Text
            dr("CORPORATION_CODE") = lblCORPORATION_CODE.Text
            dr("COMPANY_NAME") = lblCOMPANY_NAME.Text
            dr("COMPANY_TITLE_CODE") = lblCOMPANY_TITLE_CODE.Text
            dr("seq") = grv.Cells(0).Text

            newdt.Rows.Add(dr)
        Next

        If dt.Rows(0)("seq") > "0" Then
            For i As Integer = newdt.Rows.Count - 1 To 0 Step -1
                If Convert.ToInt16(dt.Rows(0)("seq")) = Convert.ToInt16(newdt.Rows(i)("seq")) Then
                    newdt.Rows.RemoveAt(i)
                End If
            Next
        End If

        For i As Integer = 0 To dt.Rows.Count - 1
            Dim dr As DataRow = newdt.NewRow
            dr("ID") = dt.Rows(i)("ID").ToString
            dr("CULPRIT_TYPE") = dt.Rows(i)("CULPRIT_TYPE").ToString
            dr("LAWBREAKER_ID_CARD") = dt.Rows(i)("LAWBREAKER_ID_CARD").ToString
            dr("LAWBREAKER_PASSPORT") = dt.Rows(i)("LAWBREAKER_PASSPORT").ToString
            dr("Sex") = dt.Rows(i)("Sex").ToString
            dr("Title_Code") = dt.Rows(i)("Title_Code").ToString
            dr("Title_Name") = dt.Rows(i)("Title_Name").ToString
            dr("First_Name") = dt.Rows(i)("First_Name").ToString
            dr("Last_Name") = dt.Rows(i)("Last_Name").ToString
            dr("Other_Name") = dt.Rows(i)("Other_Name").ToString
            dr("Address_no") = dt.Rows(i)("Address_no").ToString
            dr("Moo") = dt.Rows(i)("Moo").ToString
            dr("Soi") = dt.Rows(i)("Soi").ToString
            dr("Road") = dt.Rows(i)("Road").ToString
            dr("Province") = dt.Rows(i)("Province").ToString
            dr("Province_Name") = dt.Rows(i)("Province_Name").ToString
            dr("District") = dt.Rows(i)("District").ToString
            dr("District_Name") = dt.Rows(i)("District_Name").ToString
            dr("SubDistrict") = dt.Rows(i)("SubDistrict").ToString
            dr("SubDistrict_Name") = dt.Rows(i)("SubDistrict_Name").ToString
            dr("Race_ID") = dt.Rows(i)("Race_ID").ToString
            dr("Race_ID_Name") = dt.Rows(i)("race_id_name").ToString
            dr("Nationality_ID") = dt.Rows(i)("Nationality_ID").ToString
            dr("Nationality_ID_Name") = dt.Rows(i)("nationality_id_name").ToString
            dr("CAREER") = dt.Rows(i)("CAREER").ToString
            dr("Birth_DATE") = dt.Rows(i)("BIRTH_DATE").ToString
            dr("Age") = dt.Rows(i)("Age").ToString
            dr("Father_Name") = dt.Rows(i)("FATHER_NAME").ToString
            dr("Mother_Name") = dt.Rows(i)("MOTHER_NAME").ToString
            dr("Address") = dt.Rows(i)("Address").ToString
            dr("CULPRIT") = dt.Rows(i)("CULPRIT").ToString
            dr("MIDDLE_NAME") = dt.Rows(i)("MIDDLE_NAME").ToString
            dr("EXCISE_REG_NO") = dt.Rows(i)("EXCISE_REG_NO").ToString
            dr("CORPORATION_CODE") = dt.Rows(i)("CORPORATION_CODE").ToString
            dr("COMPANY_NAME") = dt.Rows(i)("COMPANY_NAME").ToString
            dr("COMPANY_TITLE_CODE") = dt.Rows(i)("COMPANY_TITLE_CODE").ToString
            newdt.Rows.Add(dr)
        Next

        For i As Integer = 0 To newdt.Rows.Count - 1
            newdt.Rows(i)("seq") = i + 1
        Next
        gvArrestLawbreaker.DataSource = newdt
        gvArrestLawbreaker.DataBind()

        lblNoOfLawbreak.Text = newdt.Rows.Count
        ucCompareCase1.UpdateLawbreakerQty(newdt.Rows.Count)

        'Session("LawbreakerData") = newdt
    End Sub

    Sub DeleteLawbreaker()
        Dim newdt As New DataTable
        With newdt
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
        End With

        For Each grv As GridViewRow In gvArrestLawbreaker.Rows
            Dim vID As String = grv.Cells(1).Text

            Dim chk As CheckBox = DirectCast(grv.FindControl("Chk"), CheckBox)
            If chk.Checked = False Then

                Dim lblNationality_ID As Label = DirectCast(grv.FindControl("lblNationality_ID"), Label)
                Dim lblRace_ID As Label = DirectCast(grv.FindControl("lblRace_ID"), Label)
                Dim lblSubDistrict_Code As Label = DirectCast(grv.FindControl("lblSubDistrict_Code"), Label)
                Dim lblDistrict_Code As Label = DirectCast(grv.FindControl("lblDistrict_Code"), Label)
                Dim lblProvince_Code As Label = DirectCast(grv.FindControl("lblProvince_Code"), Label)
                Dim lblTitle_Code As Label = DirectCast(grv.FindControl("lblTitle_Code"), Label)
                'Dim lblfullname As Label = DirectCast(grv.FindControl("lblfullname"), Label)
                Dim lblCULPRIT As Label = DirectCast(grv.FindControl("lblCULPRIT"), Label)
                Dim lblCAREER As Label = DirectCast(grv.FindControl("lblCAREER"), Label)
                Dim lblBIRTH_DATE As Label = DirectCast(grv.FindControl("lblBIRTH_DATE"), Label)
                Dim lblLAWBREAKER_ID_CARD As Label = DirectCast(grv.FindControl("lblLAWBREAKER_ID_CARD"), Label)
                Dim lblLAWBREAKER_PASSPORT As Label = DirectCast(grv.FindControl("lblLAWBREAKER_PASSPORT"), Label)
                Dim lblrace_id_name As Label = DirectCast(grv.FindControl("lblrace_id_name"), Label)
                Dim lblnationality_id_name As Label = DirectCast(grv.FindControl("lblnationality_id_name"), Label)
                Dim lblAddress As Label = DirectCast(grv.FindControl("lblAddress"), Label)
                Dim lblFATHER_NAME As Label = DirectCast(grv.FindControl("lblFATHER_NAME"), Label)
                Dim lblMOTHER_NAME As Label = DirectCast(grv.FindControl("lblMOTHER_NAME"), Label)
                Dim lblCULPRIT_TYPE As Label = DirectCast(grv.FindControl("lblCULPRIT_TYPE"), Label)
                Dim lblSex As Label = DirectCast(grv.FindControl("lblSex"), Label)
                Dim lblFirstName As Label = DirectCast(grv.FindControl("lblFirstName"), Label)
                Dim lblLastName As Label = DirectCast(grv.FindControl("lblLastName"), Label)
                Dim lblOtherName As Label = DirectCast(grv.FindControl("lblOtherName"), Label)
                Dim lblAddress_no As Label = DirectCast(grv.FindControl("lblAddress_no"), Label)
                Dim lblMoo As Label = DirectCast(grv.FindControl("lblMoo"), Label)
                Dim lblSoi As Label = DirectCast(grv.FindControl("lblSoi"), Label)
                Dim lblRoad As Label = DirectCast(grv.FindControl("lblRoad"), Label)
                Dim lblTitle_Name As Label = DirectCast(grv.FindControl("lblTitle_Name"), Label)
                Dim lblProvince_Name As Label = DirectCast(grv.FindControl("lblProvince_Name"), Label)
                Dim lblDistrict_Name As Label = DirectCast(grv.FindControl("lblDistrict_Name"), Label)
                Dim lblSubDistrict_Name As Label = DirectCast(grv.FindControl("lblSubDistrict_Name"), Label)
                Dim lblAge As Label = DirectCast(grv.FindControl("lblAge"), Label)
                Dim lblMIDDLE_NAME As Label = DirectCast(grv.FindControl("lblMIDDLE_NAME"), Label)
                Dim lblEXCISE_REG_NO As Label = DirectCast(grv.FindControl("lblEXCISE_REG_NO"), Label)
                Dim lblCORPORATION_CODE As Label = DirectCast(grv.FindControl("lblCORPORATION_CODE"), Label)
                Dim lblCOMPANY_NAME As Label = DirectCast(grv.FindControl("lblCOMPANY_NAME"), Label)
                Dim lblCOMPANY_TITLE_CODE As Label = DirectCast(grv.FindControl("lblCOMPANY_TITLE_CODE"), Label)

                Dim dr As DataRow = newdt.NewRow
                dr("ID") = vID
                dr("CULPRIT_TYPE") = lblCULPRIT_TYPE.Text
                dr("LAWBREAKER_ID_CARD") = lblLAWBREAKER_ID_CARD.Text
                dr("LAWBREAKER_PASSPORT") = lblLAWBREAKER_PASSPORT.Text
                dr("Sex") = lblSex.Text
                dr("Title_Code") = lblProvince_Code.Text
                dr("Title_Name") = lblTitle_Name.Text
                dr("First_Name") = lblFirstName.Text
                dr("Last_Name") = lblLastName.Text
                dr("Other_Name") = lblOtherName.Text
                dr("Address_no") = lblAddress_no.Text
                dr("Moo") = lblMoo.Text
                dr("Soi") = lblSoi.Text
                dr("Road") = lblRoad.Text
                dr("Province") = lblProvince_Code.Text
                dr("Province_Name") = lblProvince_Name.Text
                dr("District") = lblDistrict_Code.Text
                dr("District_Name") = lblDistrict_Name.Text
                dr("SubDistrict") = lblSubDistrict_Code.Text
                dr("SubDistrict_Name") = lblSubDistrict_Name.Text
                dr("Race_ID") = lblRace_ID.Text
                dr("Race_ID_Name") = lblrace_id_name.Text
                dr("Nationality_ID") = lblNationality_ID.Text
                dr("Nationality_ID_Name") = lblnationality_id_name.Text
                dr("CAREER") = lblCAREER.Text
                dr("Birth_DATE") = lblBIRTH_DATE.Text
                dr("Age") = lblAge.Text
                dr("Father_Name") = lblFATHER_NAME.Text
                dr("Mother_Name") = lblMOTHER_NAME.Text
                'dr("fullname") = lblfullname.Text
                dr("Address") = lblAddress.Text
                dr("CULPRIT") = lblCULPRIT.Text
                dr("MIDDLE_NAME") = lblMIDDLE_NAME.Text
                dr("EXCISE_REG_NO") = lblEXCISE_REG_NO.Text
                dr("CORPORATION_CODE") = lblCORPORATION_CODE.Text
                dr("COMPANY_NAME") = lblCOMPANY_NAME.Text
                dr("COMPANY_TITLE_CODE") = lblCOMPANY_TITLE_CODE.Text

                newdt.Rows.Add(dr)
            Else
                If vID > "0" Then
                    Dim trans As New TransactionDB
                    Dim sql As String = "delete from application_arrest_lawbreaker where id='" & vID & "'"
                    If Config.ExcuteNonQuery(sql, trans) = True Then
                        trans.CommitTransaction()
                    Else
                        trans.RollbackTransaction()
                    End If
                End If
            End If
        Next

        newdt.Columns.Add("seq", GetType(String))
        For i As Integer = 0 To newdt.Rows.Count - 1
            newdt.Rows(i)("seq") = i + 1
        Next
        gvArrestLawbreaker.DataSource = newdt
        gvArrestLawbreaker.DataBind()

        lblNoOfLawbreak.Text = newdt.Rows.Count
        ucCompareCase1.UpdateLawbreakerQty(newdt.Rows.Count)

    End Sub

    Protected Sub btnDeleteArrestLawbreaker_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnDeleteArrestLawbreaker.Click
        DeleteLawbreaker()
    End Sub

    Private Function SaveArrestLawbreaker(ByVal UserName As String, ByVal trans As TransactionDB)
        Dim ret As Boolean = False
        If gvArrestLawbreaker.Rows.Count > 0 Then
            Try
                'Config.ExcuteNonQuery("delete from application_arrest_lawbreaker where track_no='" & txtTrack_no.Text.Trim() & "'", trans)

                For i As Integer = 0 To gvArrestLawbreaker.Rows.Count - 1
                    Dim grv As GridViewRow = gvArrestLawbreaker.Rows(i)

                    Dim vID As String = grv.Cells(1).Text
                    Dim lblCULPRIT_TYPE As Label = DirectCast(grv.FindControl("lblCULPRIT_TYPE"), Label)
                    Dim lblLAWBREAKER_ID_CARD As Label = DirectCast(grv.FindControl("lblLAWBREAKER_ID_CARD"), Label)
                    Dim lblLAWBREAKER_PASSPORT As Label = DirectCast(grv.FindControl("lblLAWBREAKER_PASSPORT"), Label)
                    Dim lblFirstName As Label = DirectCast(grv.FindControl("lblFirstName"), Label)
                    Dim lblMIDDLE_NAME As Label = DirectCast(grv.FindControl("lblMIDDLE_NAME"), Label)
                    Dim lblLastName As Label = DirectCast(grv.FindControl("lblLastName"), Label)
                    Dim lblAddress_no As Label = DirectCast(grv.FindControl("lblAddress_no"), Label)
                    Dim lblSoi As Label = DirectCast(grv.FindControl("lblSoi"), Label)
                    Dim lblRoad As Label = DirectCast(grv.FindControl("lblRoad"), Label)
                    Dim lblMoo As Label = DirectCast(grv.FindControl("lblMoo"), Label)
                    Dim lblSubDistrict_Code As Label = DirectCast(grv.FindControl("lblSubDistrict_Code"), Label)
                    Dim lblDistrict_Code As Label = DirectCast(grv.FindControl("lblDistrict_Code"), Label)
                    Dim lblProvince_Code As Label = DirectCast(grv.FindControl("lblProvince_Code"), Label)
                    Dim lblNationality_ID As Label = DirectCast(grv.FindControl("lblNationality_ID"), Label)
                    Dim lblRace_ID As Label = DirectCast(grv.FindControl("lblRace_ID"), Label)
                    Dim lblCAREER As Label = DirectCast(grv.FindControl("lblCAREER"), Label)
                    Dim lblAge As Label = DirectCast(grv.FindControl("lblAge"), Label)
                    Dim lblFATHER_NAME As Label = DirectCast(grv.FindControl("lblFATHER_NAME"), Label)
                    Dim lblMOTHER_NAME As Label = DirectCast(grv.FindControl("lblMOTHER_NAME"), Label)
                    Dim lblTitle_Code As Label = DirectCast(grv.FindControl("lblTitle_Code"), Label)
                    Dim lblSex As Label = DirectCast(grv.FindControl("lblSex"), Label)
                    Dim lblBIRTH_DATE As Label = DirectCast(grv.FindControl("lblBIRTH_DATE"), Label)
                    Dim lblOtherName As Label = DirectCast(grv.FindControl("lblOtherName"), Label)
                    Dim lblEXCISE_REG_NO As Label = DirectCast(grv.FindControl("lblEXCISE_REG_NO"), Label)
                    Dim lblCORPORATION_CODE As Label = DirectCast(grv.FindControl("lblCORPORATION_CODE"), Label)
                    Dim lblCOMPANY_NAME As Label = DirectCast(grv.FindControl("lblCOMPANY_NAME"), Label)
                    Dim lblCOMPANY_TITLE_CODE As Label = DirectCast(grv.FindControl("lblCOMPANY_TITLE_CODE"), Label)

                    Dim sql As String = ""
                    If vID = "0" Then
                        sql = "insert into application_arrest_lawbreaker(id,update_by,update_on, track_no,culprit_type,lawbreaker_id_card, " & vbNewLine
                        sql += " lawbreaker_passport, first_name, middle_name, last_name, " & vbNewLine
                        sql += " address_no, soi, road, moo, subdistrict,district,province, " & vbNewLine
                        sql += " nationality_id,race_id,career,age,father_name,mother_name, " & vbNewLine
                        sql += " title_code, sex, birth_date, other_name, excise_reg_no,corporation_code," & vbNewLine
                        sql += " company_title_code, company_name) " & vbNewLine
                        sql += " values(applicationarrestlawbreakerseq.nextval,'" & UserName & "',sysdate,'" & txtTrack_no.Text & "'," & vbNewLine
                        If lblCULPRIT_TYPE.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblCULPRIT_TYPE) & ", " & vbNewLine
                        If lblLAWBREAKER_ID_CARD.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblLAWBREAKER_ID_CARD) & ", " & vbNewLine
                        If lblLAWBREAKER_PASSPORT.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblLAWBREAKER_PASSPORT) & ", " & vbNewLine
                        If lblFirstName.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblFirstName) & ", " & vbNewLine
                        If lblMIDDLE_NAME.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblMIDDLE_NAME) & ", " & vbNewLine
                        If lblLastName.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblLastName) & ", " & vbNewLine
                        If lblAddress_no.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblAddress_no) & ", " & vbNewLine
                        If lblSoi.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblSoi) & ", " & vbNewLine
                        If lblRoad.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblRoad) & ", " & vbNewLine
                        If lblMoo.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblMoo) & ", " & vbNewLine
                        If lblSubDistrict_Code.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblSubDistrict_Code) & ", " & vbNewLine
                        If lblDistrict_Code.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblDistrict_Code) & ", " & vbNewLine
                        If lblProvince_Code.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblProvince_Code) & ", " & vbNewLine
                        If lblNationality_ID.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblNationality_ID) & ", " & vbNewLine
                        If lblRace_ID.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblRace_ID) & ", " & vbNewLine
                        If lblCAREER.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblCAREER) & ", " & vbNewLine
                        If lblAge.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblAge) & ", " & vbNewLine
                        If lblFATHER_NAME.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblFATHER_NAME) & ", " & vbNewLine
                        If lblMOTHER_NAME.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblMOTHER_NAME) & ", " & vbNewLine
                        If lblTitle_Code.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblTitle_Code) & ", " & vbNewLine
                        If lblSex.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblSex) & ", " & vbNewLine
                        If lblBIRTH_DATE.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblDate(lblBIRTH_DATE) & ", " & vbNewLine
                        If lblOtherName.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblOtherName) & ", " & vbNewLine
                        If lblEXCISE_REG_NO.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblEXCISE_REG_NO) & ", " & vbNewLine
                        If lblCORPORATION_CODE.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblCORPORATION_CODE) & ", " & vbNewLine
                        If lblCOMPANY_NAME.Text.Trim = "" Then sql += "null," Else sql += Config.SetlblStr(lblCOMPANY_NAME) & ", " & vbNewLine
                        If lblCOMPANY_TITLE_CODE.Text.Trim = "" Then sql += "null" Else sql += Config.SetlblStr(lblCOMPANY_TITLE_CODE) & ""
                        sql += " )"
                    Else
                        sql = "update application_arrest_lawbreaker " & vbNewLine
                        sql += " set culprit_type = " & IIf(lblCULPRIT_TYPE.Text.Trim = "", "NULL", Config.SetlblStr(lblCULPRIT_TYPE)) & vbNewLine
                        sql += ", lawbreaker_id_card = " & IIf(lblLAWBREAKER_ID_CARD.Text.Trim = "", "NULL", Config.SetlblStr(lblLAWBREAKER_ID_CARD)) & vbNewLine
                        sql += ", lawbreaker_passport = " & IIf(lblLAWBREAKER_PASSPORT.Text.Trim = "", "NULL", Config.SetlblStr(lblLAWBREAKER_PASSPORT)) & vbNewLine
                        sql += ", first_name = " & IIf(lblFirstName.Text.Trim = "", "NULL", Config.SetlblStr(lblFirstName)) & vbNewLine
                        sql += ", middle_name = " & IIf(lblMIDDLE_NAME.Text.Trim = "", "NULL", Config.SetlblStr(lblMIDDLE_NAME)) & vbNewLine
                        sql += ", last_name = " & IIf(lblLastName.Text.Trim = "", "NULL", Config.SetlblStr(lblLastName)) & vbNewLine
                        sql += ", address_no = " & IIf(lblAddress_no.Text.Trim = "", "NULL", Config.SetlblStr(lblAddress_no)) & vbNewLine
                        sql += ", soi = " & IIf(lblSoi.Text.Trim = "", "NULL", Config.SetlblStr(lblSoi)) & vbNewLine
                        sql += ", road = " & IIf(lblRoad.Text.Trim = "", "NULL", Config.SetlblStr(lblRoad)) & vbNewLine
                        sql += ", moo = " & IIf(lblMoo.Text.Trim = "", "NULL", Config.SetlblStr(lblMoo)) & vbNewLine
                        sql += ", subdistrict = " & IIf(lblSubDistrict_Code.Text.Trim = "", "NULL", Config.SetlblStr(lblSubDistrict_Code)) & vbNewLine
                        sql += ", district = " & IIf(lblDistrict_Code.Text.Trim = "", "NULL", Config.SetlblStr(lblDistrict_Code)) & vbNewLine
                        sql += ", province = " & IIf(lblProvince_Code.Text.Trim = "", "NULL", Config.SetlblStr(lblProvince_Code)) & vbNewLine
                        sql += ", nationality_id = " & IIf(lblNationality_ID.Text.Trim = "", "NULL", Config.SetlblStr(lblNationality_ID)) & vbNewLine
                        sql += ", race_id = " & IIf(lblRace_ID.Text.Trim = "", "NULL", Config.SetlblStr(lblRace_ID)) & vbNewLine
                        sql += ", career = " & IIf(lblCAREER.Text.Trim = "", "NULL", Config.SetlblStr(lblCAREER)) & vbNewLine
                        sql += ", age = " & IIf(lblAge.Text.Trim = "", "NULL", Config.SetlblStr(lblAge)) & vbNewLine
                        sql += ", father_name = " & IIf(lblFATHER_NAME.Text.Trim = "", "NULL", Config.SetlblStr(lblFATHER_NAME)) & vbNewLine
                        sql += ", mother_name = " & IIf(lblMOTHER_NAME.Text.Trim = "", "NULL", Config.SetlblStr(lblMOTHER_NAME)) & vbNewLine
                        sql += ", title_code = " & IIf(lblTitle_Code.Text.Trim = "", "NULL", Config.SetlblStr(lblTitle_Code)) & vbNewLine
                        sql += ", sex = " & IIf(lblSex.Text.Trim = "", "NULL", Config.SetlblStr(lblSex)) & vbNewLine
                        sql += ", birth_date = " & IIf(lblBIRTH_DATE.Text.Trim = "", "NULL", Config.SetlblDate(lblBIRTH_DATE)) & vbNewLine
                        sql += ", other_name = " & IIf(lblOtherName.Text.Trim = "", "NULL", Config.SetlblStr(lblOtherName)) & vbNewLine
                        sql += ", excise_reg_no = " & IIf(lblEXCISE_REG_NO.Text.Trim = "", "NULL", Config.SetlblStr(lblEXCISE_REG_NO)) & vbNewLine
                        sql += ", corporation_code = " & IIf(lblCORPORATION_CODE.Text.Trim = "", "NULL", Config.SetlblStr(lblCORPORATION_CODE)) & vbNewLine
                        sql += ", company_title_code = " & IIf(lblCOMPANY_TITLE_CODE.Text.Trim = "", "NULL", Config.SetlblStr(lblCOMPANY_TITLE_CODE)) & vbNewLine
                        sql += ", company_name = " & IIf(lblCOMPANY_NAME.Text.Trim = "", "NULL", Config.SetlblStr(lblCOMPANY_NAME)) & vbNewLine
                        sql += ", update_by = '" & UserName & "', update_on = sysdate " & vbNewLine
                        sql += " where id = '" & vID & "'"
                    End If
                    ret = Config.ExcuteNonQuery(sql, trans)
                    If ret = False Then
                        Exit For
                    End If
                Next
            Catch ex As Exception
                ret = False
            End Try
        Else
            ret = True
        End If
        Return ret
    End Function

    Private Sub btnAddArrestLawbreaker_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAddArrestLawbreaker.Click
        frmPopArrestLawbreaker1.ShowPop()
    End Sub

    Private Sub frmPopArrestLawbreaker1_SaveLawbreaker(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As System.Data.DataTable) Handles frmPopArrestLawbreaker1.SaveLawbreaker
        AddLawbreaker(dt)
    End Sub

    Private Sub gvArrestLawbreaker_RowCommand(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewCommandEventArgs) Handles gvArrestLawbreaker.RowCommand
        If e.CommandName = "Edit" Then
            Dim grv As GridViewRow = gvArrestLawbreaker.Rows(Convert.ToInt16(e.CommandArgument) - 1)

            Dim newdt As New DataTable
            With newdt
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
                .Columns.Add("Address")
                .Columns.Add("CULPRIT")
                .Columns.Add("MIDDLE_NAME")
                .Columns.Add("EXCISE_REG_NO")
                .Columns.Add("CORPORATION_CODE")
                .Columns.Add("COMPANY_NAME")
                .Columns.Add("COMPANY_TITLE_CODE")

                Dim vID As String = grv.Cells(1).Text
                Dim lblLAWBREAKER_ID_CARD As Label = DirectCast(grv.FindControl("lblLAWBREAKER_ID_CARD"), Label)
                Dim lblNationality_ID As Label = DirectCast(grv.FindControl("lblNationality_ID"), Label)
                Dim lblRace_ID As Label = DirectCast(grv.FindControl("lblRace_ID"), Label)
                Dim lblSubDistrict_Code As Label = DirectCast(grv.FindControl("lblSubDistrict_Code"), Label)
                Dim lblDistrict_Code As Label = DirectCast(grv.FindControl("lblDistrict_Code"), Label)
                Dim lblProvince_Code As Label = DirectCast(grv.FindControl("lblProvince_Code"), Label)
                Dim lblTitle_Code As Label = DirectCast(grv.FindControl("lblTitle_Code"), Label)
                Dim lblCULPRIT As Label = DirectCast(grv.FindControl("lblCULPRIT"), Label)
                Dim lblCAREER As Label = DirectCast(grv.FindControl("lblCAREER"), Label)
                Dim lblBIRTH_DATE As Label = DirectCast(grv.FindControl("lblBIRTH_DATE"), Label)
                Dim lblLAWBREAKER_PASSPORT As Label = DirectCast(grv.FindControl("lblLAWBREAKER_PASSPORT"), Label)
                Dim lblrace_id_name As Label = DirectCast(grv.FindControl("lblrace_id_name"), Label)
                Dim lblnationality_id_name As Label = DirectCast(grv.FindControl("lblnationality_id_name"), Label)
                Dim lblAddress As Label = DirectCast(grv.FindControl("lblAddress"), Label)
                Dim lblFATHER_NAME As Label = DirectCast(grv.FindControl("lblFATHER_NAME"), Label)
                Dim lblMOTHER_NAME As Label = DirectCast(grv.FindControl("lblMOTHER_NAME"), Label)
                Dim lblCULPRIT_TYPE As Label = DirectCast(grv.FindControl("lblCULPRIT_TYPE"), Label)
                Dim lblSex As Label = DirectCast(grv.FindControl("lblSex"), Label)
                Dim lblFirstName As Label = DirectCast(grv.FindControl("lblFirstName"), Label)
                Dim lblLastName As Label = DirectCast(grv.FindControl("lblLastName"), Label)
                Dim lblOtherName As Label = DirectCast(grv.FindControl("lblOtherName"), Label)
                Dim lblAddress_no As Label = DirectCast(grv.FindControl("lblAddress_no"), Label)
                Dim lblMoo As Label = DirectCast(grv.FindControl("lblMoo"), Label)
                Dim lblSoi As Label = DirectCast(grv.FindControl("lblSoi"), Label)
                Dim lblRoad As Label = DirectCast(grv.FindControl("lblRoad"), Label)
                Dim lblTitle_Name As Label = DirectCast(grv.FindControl("lblTitle_Name"), Label)
                Dim lblProvince_Name As Label = DirectCast(grv.FindControl("lblProvince_Name"), Label)
                Dim lblDistrict_Name As Label = DirectCast(grv.FindControl("lblDistrict_Name"), Label)
                Dim lblSubDistrict_Name As Label = DirectCast(grv.FindControl("lblSubDistrict_Name"), Label)
                Dim lblAge As Label = DirectCast(grv.FindControl("lblAge"), Label)
                Dim lblMIDDLE_NAME As Label = DirectCast(grv.FindControl("lblMIDDLE_NAME"), Label)
                Dim lblEXCISE_REG_NO As Label = DirectCast(grv.FindControl("lblEXCISE_REG_NO"), Label)
                Dim lblCORPORATION_CODE As Label = DirectCast(grv.FindControl("lblCORPORATION_CODE"), Label)
                Dim lblCOMPANY_NAME As Label = DirectCast(grv.FindControl("lblCOMPANY_NAME"), Label)
                Dim lblCOMPANY_TITLE_CODE As Label = DirectCast(grv.FindControl("lblCOMPANY_TITLE_CODE"), Label)

                Dim dr As DataRow = newdt.NewRow
                dr("ID") = vID
                dr("CULPRIT_TYPE") = lblCULPRIT_TYPE.Text
                dr("LAWBREAKER_ID_CARD") = lblLAWBREAKER_ID_CARD.Text
                dr("LAWBREAKER_PASSPORT") = lblLAWBREAKER_PASSPORT.Text
                dr("Sex") = lblSex.Text
                dr("Title_Code") = lblProvince_Code.Text
                dr("Title_Name") = lblTitle_Name.Text
                dr("First_Name") = lblFirstName.Text
                dr("Last_Name") = lblLastName.Text
                dr("Other_Name") = lblOtherName.Text
                dr("Address_no") = lblAddress_no.Text
                dr("Moo") = lblMoo.Text
                dr("Soi") = lblSoi.Text
                dr("Road") = lblRoad.Text
                dr("Province") = lblProvince_Code.Text
                dr("Province_Name") = lblProvince_Name.Text
                dr("District") = lblDistrict_Code.Text
                dr("District_Name") = lblDistrict_Name.Text
                dr("SubDistrict") = lblSubDistrict_Code.Text
                dr("SubDistrict_Name") = lblSubDistrict_Name.Text
                dr("Race_ID") = lblRace_ID.Text
                dr("Race_ID_Name") = lblrace_id_name.Text
                dr("Nationality_ID") = lblNationality_ID.Text
                dr("Nationality_ID_Name") = lblnationality_id_name.Text
                dr("CAREER") = lblCAREER.Text
                dr("Birth_DATE") = lblBIRTH_DATE.Text
                dr("Age") = lblAge.Text
                dr("Father_Name") = lblFATHER_NAME.Text
                dr("Mother_Name") = lblMOTHER_NAME.Text
                dr("Address") = lblAddress.Text
                dr("CULPRIT") = lblCULPRIT.Text
                dr("MIDDLE_NAME") = lblMIDDLE_NAME.Text
                dr("EXCISE_REG_NO") = lblEXCISE_REG_NO.Text
                dr("CORPORATION_CODE") = lblCORPORATION_CODE.Text
                dr("COMPANY_NAME") = lblCOMPANY_NAME.Text
                dr("COMPANY_TITLE_CODE") = lblCOMPANY_TITLE_CODE.Text

                newdt.Rows.Add(dr)
            End With

            frmPopArrestLawbreaker1.ShowPopEdit(newdt.DefaultView(0), grv.Cells(0).Text)
        End If
    End Sub

    Private Sub gvArrestLawbreaker_RowEditing(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewEditEventArgs) Handles gvArrestLawbreaker.RowEditing
        'ถ้าใช้ Event RowCommand ต้องใส่ Event RowEditing มาด้วย ไม่รู้ทำไม
    End Sub
#End Region 'Lawbreaker

    Protected Sub btnSave_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnSave.Click
        If txtTrack_no.Text = "" Then
            ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "alert('กรุณาระบุข้อมูลที่ต้องการแก้ไข');", True)
            Exit Sub
        End If

        If SaveValidate() = True Then
            If Request("UserName") IsNot Nothing And Request("UserIDCard") IsNot Nothing Then
                Update(Request("UserName"), Request("UserIDCard"))
            Else
                Update("Debug", "1111111111111")
            End If
        End If
    End Sub

    Private Function SaveValidate() As Boolean

        If TxtApplicationDate.TxtBox.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุวันที่เขียนบันทึกการจับกุม", Me, TxtApplicationDate.TxtBox.ClientID)
            Return False
        End If
        If frmSearchDepartment1.DepartmentID = "" Then
            Config.SetAlert("กรุณาระบุรหัสหน่วยงานเขียนที่", Me, frmSearchDepartment1.TextDepartmentID.ClientID)
            Return False
        End If
        If frmSearchDepartment1.DepartmentName = "" Then
            Config.SetAlert("กรุณาระบุชื่อหน่วยงานเขียนที่", Me, frmSearchDepartment1.TextDepartmentName.ClientID)
            Return False
        End If
        If txtOccuranceDate.TxtBox.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุวันที่เกิดเหตุ", Me, txtOccuranceDate.TxtBox.ClientID)
            Return False
        End If
        If TxtOccuranceTime.TimeText = "" Then
            Config.SetAlert("กรุณาระบุเวลาที่เกิดเหตุ", Me, txtOccuranceTime.TxtBox.ClientID)
            Return False
        End If
        If ddlLegislation.SelectedValue = "0" Then
            Config.SetAlert("กรุณาเลือก พ.ร.บ.", Me, ddlLegislation.ClientID)
            Return False
        End If
        If txtAccuserIDcardNo.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุชื่อผู้กล่าวหา", Me, lblAccuserName.ClientID)
            Return False
        End If
        If txtScene_Name.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุชื่อสถานที่เกิดเหตุ", Me, txtScene_Name.ClientID)
            Return False
        End If
        If ddlSceneProvince.SelectedValue = "0" Then
            Config.SetAlert("กรุณาเลือกจังหวัด", Me, ddlSceneProvince.ClientID)
            Return False
        End If
        If ddlSceneDistrict.SelectedValue = "0" Then
            Config.SetAlert("กรุณาเลือกอำเภอ", Me, ddlSceneDistrict.ClientID)
            Return False
        End If
        If ddlScebeSubDistrict.SelectedValue = "0" Then
            Config.SetAlert("กรุณาเลือกตำบล", Me, ddlScebeSubDistrict.ClientID)
            Return False
        End If
        If gvIndictment.Rows.Count = 0 Then
            Config.SetAlert("กรุณาระบุข้อกล่าวหา", Me, txtTrack_no.ClientID)
            Return False
        End If
        If rdHaveCluprit.SelectedValue = "Y" Then
            'คดีมีตัว
            If gvArrestLawbreaker.Rows.Count = 0 Then
                Config.SetAlert("กรุณาระบุรายชื่อผู้ต้องหา", Me, txtTrack_no.ClientID)
                Return False
            End If
        Else
            'คดีไม่มีตัว ไม่ต้องระบุชื่อผู้ต้องหา
            If gvArrestLawbreaker.Rows.Count > 0 Then
                Config.SetAlert("คดีไม่มีตัว ไม่ต้องระบุชื่อผู้ต้องหา", Me, txtTrack_no.ClientID)
                Return False
            End If
        End If

        If TabContainer1.ActiveTabIndex = 5 Then
            If ucBookImpeachment1.SaveValidate = False Then
                Return False
            End If
        End If

        If TabContainer1.ActiveTabIndex = 6 Then
            If ucProveExhibit1.SaveValidate = False Then
                Return False
            End If
        End If

        If TabContainer1.ActiveTabIndex = 7 Then
            If ucCompareCase1.SaveValidate = False Then
                Return False
            End If
        End If

        If TabContainer1.ActiveTabIndex = 8 Then
            If ucPayFine1.SaveValidate = False Then
                Return False
            End If
        End If

        Return True
    End Function


    Protected Sub btnSearchData_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnSearchData.Click
        Dim vTrackNo As String = txtTrack_no.Text.Trim
        ClearForm()

        txtTrack_no.Text = vTrackNo
        SetDataForEdit()
    End Sub
   
    Private Sub rdHaveCluprit_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles rdHaveCluprit.SelectedIndexChanged
        If rdHaveCluprit.SelectedValue = "Y" Then
            txtEstimatFine.Text = ""
            txtEstimatFine.Enabled = False
            chkIsSendToCourt.Enabled = False
            chkIsSendToCourt.Checked = False
        Else
            txtEstimatFine.Enabled = True
            chkIsSendToCourt.Enabled = True
        End If
    End Sub

    Private Sub frmSearchAccuser1_SelectAccuser(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchAccuser1.SelectAccuser
        txtAccuserIDcardNo.Text = IdCardNo
        txtAccuserPOSCode.Text = Poscode
        txtAccuserOffCode.Text = Offcode
        lblAccuserName.Text = FullName
        lblAccuserPosName.Text = PosName
        lblAccuserOffName.Text = Offname
    End Sub

    Private Sub btnSearchDivide_staff_popForArrest_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchDivide_staff_popForArrest.Click
        frmSearchAccuser1.ShowPop()
    End Sub

#Region "Arrest Exhibit"
    Private Sub btnAddArrestExhibit_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAddArrestExhibit.Click
        If ddlLegislation.SelectedValue = "0" Then
            Config.SetAlert("กรุณาเลือกพระราชบัญญัติ", Me, ddlLegislation.ClientID)
        Else
            frmPopArrestExhibit1.ShowPop(ddlProductGroupID.SelectedValue)
        End If

    End Sub

    Private Function GetExhitbitList() As DataTable
        Dim dt As New DataTable
        dt.Columns.Add("seq")
        dt.Columns.Add("duty_name")
        dt.Columns.Add("duty_code")
        dt.Columns.Add("group_name")
        dt.Columns.Add("group_id")
        dt.Columns.Add("is_domestic_name")
        dt.Columns.Add("ISDOMESTIC")
        dt.Columns.Add("exhibit_status_name")
        dt.Columns.Add("exhibit_status")
        dt.Columns.Add("brand_code")
        dt.Columns.Add("brand_name")
        dt.Columns.Add("size_name")
        dt.Columns.Add("size_desc")
        dt.Columns.Add("size_unit_code")
        dt.Columns.Add("size_unit_name")
        dt.Columns.Add("qty_name")
        dt.Columns.Add("qty")
        dt.Columns.Add("qty_unit_code")
        dt.Columns.Add("qty_unit_name")
        dt.Columns.Add("weight_name")
        dt.Columns.Add("weight")
        dt.Columns.Add("weight_unit_code")
        dt.Columns.Add("weight_unit_name")
        dt.Columns.Add("exhibit_list")
        dt.Columns.Add("EXHIBIT_DESC")
        dt.Columns.Add("CAR_NO")
        dt.Columns.Add("REMARKS")
        For Each grv As GridViewRow In gvExhibitList.Rows
            Dim dr As DataRow = dt.NewRow
            dr("seq") = grv.Cells(0).Text
            dr("duty_name") = DirectCast(grv.FindControl("lblDutyName"), Label).Text
            dr("duty_code") = DirectCast(grv.FindControl("lblDutyCode"), Label).Text
            dr("group_name") = DirectCast(grv.FindControl("lblGroupName"), LinkButton).Text
            dr("group_id") = DirectCast(grv.FindControl("lblGroupID"), Label).Text
            dr("is_domestic_name") = DirectCast(grv.FindControl("lblIsDomesticName"), Label).Text
            dr("ISDOMESTIC") = DirectCast(grv.FindControl("lblIsDomesticCode"), Label).Text
            dr("exhibit_status_name") = DirectCast(grv.FindControl("lblStatusName"), Label).Text
            dr("exhibit_status") = DirectCast(grv.FindControl("lblExhibitStatus"), Label).Text
            dr("brand_code") = DirectCast(grv.FindControl("lblBrandCode"), Label).Text
            dr("brand_name") = DirectCast(grv.FindControl("lblBrandName"), Label).Text
            dr("size_name") = DirectCast(grv.FindControl("lblSizeName"), Label).Text
            dr("size_desc") = DirectCast(grv.FindControl("lblSizeDesc"), Label).Text
            dr("size_unit_code") = DirectCast(grv.FindControl("lblSizeUnitCode"), Label).Text
            dr("size_unit_name") = DirectCast(grv.FindControl("lblSizeUnitName"), Label).Text
            dr("qty_name") = DirectCast(grv.FindControl("lblQtyName"), Label).Text
            dr("qty") = DirectCast(grv.FindControl("lblQty"), Label).Text
            dr("qty_unit_code") = DirectCast(grv.FindControl("lblQtyUnitCode"), Label).Text
            dr("qty_unit_name") = DirectCast(grv.FindControl("lblQtyUnitName"), Label).Text
            dr("weight_name") = DirectCast(grv.FindControl("lblWeightName"), Label).Text
            dr("weight") = DirectCast(grv.FindControl("lblWeight"), Label).Text
            dr("weight_unit_code") = DirectCast(grv.FindControl("lblWeightUnitCode"), Label).Text
            dr("weight_unit_name") = DirectCast(grv.FindControl("lblWeightUnitName"), Label).Text
            dr("exhibit_list") = DirectCast(grv.FindControl("lblExhibitList"), Label).Text
            dr("EXHIBIT_DESC") = IIf(grv.Cells(9).Text = "&nbsp;", "", grv.Cells(9).Text)
            dr("CAR_NO") = IIf(grv.Cells(10).Text = "&nbsp;", "", grv.Cells(10).Text)
            dr("REMARKS") = IIf(grv.Cells(11).Text = "&nbsp;", "", grv.Cells(11).Text)

            dt.Rows.Add(dr)
        Next
        Return dt
    End Function

    Private Sub frmPopArrestExhibit1_SaveExhibit(ByVal sender As Object, ByVal e As System.EventArgs, ByVal GroupID As String, ByVal GroupName As String, ByVal DutyCode As String, ByVal DutyName As String, ByVal IsDomestic As String, ByVal BrandCode As String, ByVal BrandName As String, ByVal SizeDesc As String, ByVal SizeUintCode As String, ByVal SizeUnitName As String, ByVal Qty As String, ByVal QtyUnitCode As String, ByVal QtyUnitName As String, ByVal NetWeight As String, ByVal NetWeightUnitCode As String, ByVal NetWeightUnitName As String, ByVal ExhibitStatus As String, ByVal ExhibitList As String, ByVal ExhibitDesc As String, ByVal CarNo As String, ByVal Remarks As String, ByVal RowID As String, ByVal ExhibitID As Long) Handles frmPopArrestExhibit1.SaveExhibit
        Dim dt As New DataTable
        dt = GetExhitbitList()

        If RowID = "0" Then
            'Add Data
            Dim dr As DataRow = dt.NewRow
            dr("seq") = dt.Rows.Count + 1
            dr("duty_name") = DutyName
            dr("duty_code") = DutyCode
            dr("group_name") = GroupName
            dr("group_id") = GroupID
            dr("is_domestic_name") = IIf(IsDomestic = "I", "ในประเทศ", IIf(IsDomestic = "O", "ต่างประเทศ", ""))
            dr("ISDOMESTIC") = IsDomestic
            dr("exhibit_status_name") = IIf(ExhibitStatus = "1", "ยึด", "คืน")
            dr("exhibit_status") = ExhibitStatus
            dr("brand_code") = BrandCode
            dr("brand_name") = BrandName
            dr("size_name") = SizeDesc & " " & SizeUnitName
            dr("size_desc") = SizeDesc
            dr("size_unit_code") = SizeUintCode
            dr("size_unit_name") = SizeUnitName
            dr("qty_name") = Qty & " " & QtyUnitName
            dr("qty") = Qty
            dr("qty_unit_code") = QtyUnitCode
            dr("qty_unit_name") = QtyUnitName
            dr("weight_name") = NetWeight & " " & NetWeightUnitName
            dr("weight") = NetWeight
            dr("weight_unit_code") = NetWeightUnitCode
            dr("weight_unit_name") = NetWeightUnitName
            dr("exhibit_list") = ExhibitList
            dr("EXHIBIT_DESC") = ExhibitDesc
            dr("CAR_NO") = CarNo
            dr("REMARKS") = Remarks

            dt.Rows.Add(dr)
        Else
            For i As Integer = 0 To dt.Rows.Count - 1
                If RowID = (i + 1) Then
                    dt.Rows(i)("duty_name") = DutyName
                    dt.Rows(i)("duty_code") = DutyCode
                    dt.Rows(i)("group_name") = GroupName
                    dt.Rows(i)("group_id") = GroupID
                    dt.Rows(i)("is_domestic_name") = IIf(IsDomestic = "I", "ในประเทศ", IIf(IsDomestic = "O", "ต่างประเทศ", ""))
                    dt.Rows(i)("ISDOMESTIC") = IsDomestic
                    dt.Rows(i)("exhibit_status_name") = IIf(ExhibitStatus = "1", "ยึด", "คืน")
                    dt.Rows(i)("exhibit_status") = ExhibitStatus
                    dt.Rows(i)("brand_code") = BrandCode
                    dt.Rows(i)("brand_name") = BrandName
                    dt.Rows(i)("size_name") = SizeDesc & " " & SizeUnitName
                    dt.Rows(i)("size_desc") = SizeDesc
                    dt.Rows(i)("size_unit_code") = SizeUintCode
                    dt.Rows(i)("size_unit_name") = SizeUnitName
                    dt.Rows(i)("qty_name") = Qty & " " & QtyUnitName
                    dt.Rows(i)("qty") = Qty
                    dt.Rows(i)("qty_unit_code") = QtyUnitCode
                    dt.Rows(i)("qty_unit_name") = QtyUnitName
                    dt.Rows(i)("weight_name") = NetWeight & " " & NetWeightUnitName
                    dt.Rows(i)("weight") = NetWeight
                    dt.Rows(i)("weight_unit_code") = NetWeightUnitCode
                    dt.Rows(i)("weight_unit_name") = NetWeightUnitName
                    dt.Rows(i)("exhibit_list") = ExhibitList
                    dt.Rows(i)("EXHIBIT_DESC") = ExhibitDesc
                    dt.Rows(i)("CAR_NO") = CarNo
                    dt.Rows(i)("REMARKS") = Remarks
                End If
            Next
        End If
        gvExhibitList.DataSource = dt
        gvExhibitList.DataBind()
    End Sub

    Private Sub btnDelArrestExhibit_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnDelArrestExhibit.Click
        Dim dt As New DataTable
        dt = GetExhitbitList()
        For i As Integer = gvExhibitList.Rows.Count - 1 To 0 Step -1
            Dim grv As GridViewRow = gvExhibitList.Rows(i)
            Dim chk As CheckBox = DirectCast(grv.FindControl("chk"), CheckBox)
            If chk.Checked = True Then
                dt.Rows.RemoveAt(i)
            End If
        Next
        If dt.Rows.Count > 0 Then
            For i As Integer = 0 To dt.Rows.Count - 1
                dt.Rows(i)("seq") = (i + 1)
            Next
        End If

        gvExhibitList.DataSource = dt
        gvExhibitList.DataBind()
    End Sub

    Private Sub gvExhibitList_RowCommand(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewCommandEventArgs) Handles gvExhibitList.RowCommand
        If e.CommandName = "Edit" Then
            Dim grv As GridViewRow = gvExhibitList.Rows(Convert.ToInt16(e.CommandArgument) - 1)
            Dim RowID As String = grv.Cells(0).Text
            Dim DutyCode As String = DirectCast(grv.FindControl("lblDutyCode"), Label).Text
            Dim GroupID As String = DirectCast(grv.FindControl("lblGroupID"), Label).Text
            Dim IsDomestic As String = DirectCast(grv.FindControl("lblIsDomesticCode"), Label).Text
            Dim ExhibitStatus As String = DirectCast(grv.FindControl("lblExhibitStatus"), Label).Text
            Dim BrandCode As String = DirectCast(grv.FindControl("lblBrandCode"), Label).Text
            Dim BrandName As String = DirectCast(grv.FindControl("lblBrandName"), Label).Text
            Dim SizeDesc As String = DirectCast(grv.FindControl("lblSizeDesc"), Label).Text
            Dim SizeUnitCode As String = DirectCast(grv.FindControl("lblSizeUnitCode"), Label).Text
            Dim Qty As String = DirectCast(grv.FindControl("lblQty"), Label).Text
            Dim QtyUnitCode As String = DirectCast(grv.FindControl("lblQtyUnitCode"), Label).Text
            Dim NetWeight As String = DirectCast(grv.FindControl("lblWeight"), Label).Text
            Dim NetWeightUnitCode As String = DirectCast(grv.FindControl("lblWeightUnitCode"), Label).Text
            Dim ExhibitList As String = DirectCast(grv.FindControl("lblExhibitList"), Label).Text
            Dim ExhibitDesc As String = IIf(grv.Cells(9).Text = "&nbsp;", "", grv.Cells(9).Text)
            Dim CarNo As String = IIf(grv.Cells(10).Text = "&nbsp;", "", grv.Cells(10).Text)
            Dim Remarks As String = IIf(grv.Cells(11).Text = "&nbsp;", "", grv.Cells(11).Text)

            frmPopArrestExhibit1.ShowPopEdit(RowID, GroupID, DutyCode, IsDomestic, BrandCode, BrandName, SizeDesc, SizeUnitCode, Qty, QtyUnitCode, NetWeight, NetWeightUnitCode, ExhibitStatus, ExhibitList, ExhibitDesc, CarNo, Remarks, 0)
        End If
    End Sub

    Private Sub gvExhibitList_RowEditing(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewEditEventArgs) Handles gvExhibitList.RowEditing

    End Sub

    Private Function SaveArrestExhibit(ByVal UserName As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            Config.ExcuteNonQuery("delete from application_arrest_exhibit where track_no='" & txtTrack_no.Text.Trim() & "'", trans)
            If gvExhibitList.Rows.Count > 0 Then
                For i As Integer = 0 To gvExhibitList.Rows.Count - 1
                    Dim grv As GridViewRow = gvExhibitList.Rows(i)
                    Dim lblDutyCode As String = DirectCast(grv.FindControl("lblDutyCode"), Label).Text
                    Dim lblDutyName As String = DirectCast(grv.FindControl("lblDutyName"), Label).Text
                    Dim lblGroupID As String = DirectCast(grv.FindControl("lblGroupID"), Label).Text
                    Dim lblGroupName As String = DirectCast(grv.FindControl("lblGroupName"), LinkButton).Text
                    Dim lblBrandCode As String = DirectCast(grv.FindControl("lblBrandCode"), Label).Text
                    Dim lblBrandName As String = DirectCast(grv.FindControl("lblBrandName"), Label).Text
                    Dim lblIsDomesticCode As String = DirectCast(grv.FindControl("lblIsDomesticCode"), Label).Text
                    Dim lblExhibitStatus As String = DirectCast(grv.FindControl("lblExhibitStatus"), Label).Text
                    Dim lblSizeDesc As String = DirectCast(grv.FindControl("lblSizeDesc"), Label).Text
                    Dim lblSizeUnitCode As String = DirectCast(grv.FindControl("lblSizeUnitCode"), Label).Text
                    Dim lblSizeUnitName As String = DirectCast(grv.FindControl("lblSizeUnitName"), Label).Text
                    Dim lblQty As String = DirectCast(grv.FindControl("lblQty"), Label).Text
                    Dim lblQtyUnitCode As String = DirectCast(grv.FindControl("lblQtyUnitCode"), Label).Text
                    Dim lblQtyUnitName As String = DirectCast(grv.FindControl("lblQtyUnitName"), Label).Text
                    Dim lblWeight As String = DirectCast(grv.FindControl("lblWeight"), Label).Text
                    Dim lblWeightUnitCode As String = DirectCast(grv.FindControl("lblWeightUnitCode"), Label).Text
                    Dim lblWeightUnitName As String = DirectCast(grv.FindControl("lblWeightUnitName"), Label).Text
                    Dim lblExhibitList As String = DirectCast(grv.FindControl("lblExhibitList"), Label).Text
                    Dim ExhibitDesc As String = IIf(grv.Cells(9).Text = "&nbsp;", "", grv.Cells(9).Text)
                    Dim CarNo As String = IIf(grv.Cells(10).Text = "&nbsp;", "", grv.Cells(10).Text)
                    Dim Remarks As String = IIf(grv.Cells(11).Text = "&nbsp;", "", grv.Cells(11).Text)

                    Dim sql As String = "insert into application_arrest_exhibit(id,create_by,create_on,track_no,isexhibitco," & vbNewLine
                    sql += " brand_code,brand_name,isdomestic,sizes_desc, size_unit_code,sizes_unit_name," & vbNewLine
                    sql += "qty, qty_unit_code,qty_unit_name,netweight,netweight_unit_code,netweight_unit_name, " & vbNewLine
                    sql += "status, exhibit_list, exhibit_desc, car_no,remarks,duty_code, duty_name,group_id,group_name)" & vbNewLine
                    sql += " values(application_arrest_exhibit_seq.nextval,'" & UserName & "',sysdate,'" & txtTrack_no.Text & "','N', " & vbNewLine
                    If lblBrandCode = "" Then sql += "null," Else sql += "'" & lblBrandCode & "'," & vbNewLine
                    If lblBrandName = "" Then sql += "null," Else sql += "'" & lblBrandName & "'," & vbNewLine
                    If lblIsDomesticCode = "" Then sql += "null," Else sql += "'" & lblIsDomesticCode & "'," & vbNewLine
                    If lblSizeDesc = "" Then sql += "null," Else sql += "'" & lblSizeDesc & "'," & vbNewLine
                    If lblSizeUnitCode = "" Then sql += "null," Else sql += "'" & lblSizeUnitCode & "'," & vbNewLine
                    If lblSizeUnitName = "" Then sql += "null," Else sql += "'" & lblSizeUnitName & "'," & vbNewLine
                    If lblQty = "" Then sql += "null," Else sql += "'" & lblQty & "'," & vbNewLine
                    If lblQtyUnitCode = "" Then sql += "null," Else sql += "'" & lblQtyUnitCode & "'," & vbNewLine
                    If lblQtyUnitName = "" Then sql += "null," Else sql += "'" & lblQtyUnitName & "'," & vbNewLine
                    If lblWeight = "" Then sql += "null," Else sql += "'" & lblWeight & "'," & vbNewLine
                    If lblWeightUnitCode = "" Then sql += "null," Else sql += "'" & lblWeightUnitCode & "'," & vbNewLine
                    If lblWeightUnitName = "" Then sql += "null," Else sql += "'" & lblWeightUnitName & "'," & vbNewLine
                    If lblExhibitStatus = "" Then sql += "null," Else sql += "'" & lblExhibitStatus & "'," & vbNewLine
                    If lblExhibitList = "" Then sql += "null," Else sql += "'" & lblExhibitList & "'," & vbNewLine
                    If ExhibitDesc = "" Then sql += "null," Else sql += "'" & ExhibitDesc & "'," & vbNewLine
                    If CarNo = "" Then sql += "null," Else sql += "'" & CarNo & "'," & vbNewLine
                    If Remarks = "" Then sql += "null," Else sql += "'" & Remarks & "'," & vbNewLine
                    If lblDutyCode = "" Then sql += "null," Else sql += "'" & lblDutyCode & "'," & vbNewLine
                    If lblDutyName = "" Then sql += "null," Else sql += "'" & lblDutyName & "'," & vbNewLine
                    If lblGroupID = "" Then sql += "null," Else sql += "'" & lblGroupID & "'," & vbNewLine
                    If lblGroupName = "" Then sql += "null," Else sql += "'" & lblGroupName & "')"

                    ret = Config.ExcuteNonQuery(sql, trans)
                    If ret = False Then
                        Exit For
                    End If
                Next
            Else
                ret = True
            End If
        Catch ex As Exception
            ret = False
        End Try

        Return ret
    End Function
#End Region 'Arrest Exhibit






End Class