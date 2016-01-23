Imports LinqDB.Common.Utilities

Partial Public Class ucProveExhibit
    Inherits System.Web.UI.UserControl

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            txtReportNo1.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtReportNo1.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtReportNo2.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtReportNo2.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")

            txtTaxValue.Attributes.Add("OnKeyPress", "ChkMinusInt(this,event);")
            txtTaxValue.Attributes.Add("onKeyDown", "CheckKeyNumber(event);")
        End If
    End Sub

    Public Function SaveValidate() As Boolean
        If txtReportNo1.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุรายงานการพิสูจน์เลขที่", Me.Page, txtReportNo1.ClientID)
            Return False
        End If
        If txtReportNo2.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุรายงานการพิสูจน์ปีที่", Me.Page, txtReportNo2.ClientID)
            Return False
        End If
        If txtTakenDate.TxtBox.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุวันที่รับเรื่องพิสูจน์", Me.Page, txtTakenDate.ClientID)
            Return False
        End If
        If lblProveStaffID.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุชื่อผู้พิสูจน์", Me.Page, txtReportNo1.ClientID)
            Return False
        End If
        If gvExhibitList.Rows.Count = 0 Then
            Config.SetAlert("กรุณาระบุรายการของกลาง", Me.Page, txtReportNo1.ClientID)
            Return False
        End If
        If txtReportDesc.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุรายงานการตรวจพิสูจน์ของกลาง", Me.Page, txtReportDesc.ClientID)
            Return False
        End If
        If ChkDupReportNo() = True Then
            Config.SetAlert("เลขที่รายงานการพิสูจน์ซ้ำ", Me.Page, txtReportNo1.ClientID)
            Return False
        End If

        Return True
    End Function

    Private Function ChkDupReportNo() As Boolean
        Dim ret As Boolean = False
        Dim vReportNo As String = txtReportNo1.Text & "/" & txtReportNo2.Text

        Dim sql As String = "select aap.id from application_arrest_prove aap "
        sql += " inner join application_arrest aa on aa.track_no=aap.track_no "
        sql += " where aap.exhibit_report_no = '" & vReportNo & "' and aa.track_no <> '" & lblTrackNo.Text & "'"
        sql += " and aap.staff_prove_offcode = '" & lblArrestOffcode.Text & "'"

        Dim dt As DataTable = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            ret = True
        End If
        dt.Dispose()
        Return ret
    End Function

    Public Sub FillInData(ByVal TrackNo As String)
        lblTrackNo.Text = TrackNo

        Dim dtProve As DataTable = GetDataFromProveExhibit(lblTrackNo.Text)
        If dtProve.Rows.Count > 0 Then
            Dim dr As DataRow = dtProve.Rows(0)

            lblLegislationID.Text = dr("legislation_id")
            lblProductGroupID.Text = dr("product_group_id")
            lblArrestOffcode.Text = dr("offcode")

            If IsDBNull(dr("exhibit_report_no")) = False Then
                Dim vReportNo() As String = Split(dr("exhibit_report_no"), "/")
                If vReportNo.Length = 2 Then
                    txtReportNo1.Text = vReportNo(0)
                    txtReportNo2.Text = vReportNo(1)
                Else
                    txtReportNo1.Text = dr("exhibit_report_no")
                End If
            End If

            If IsDBNull(dr("taken_date")) = False Then
                txtTakenDate.DateValue = Convert.ToDateTime(dr("taken_date"))
                txtTakenTime.TimeText = Convert.ToDateTime(dr("taken_date")).ToString("HH:mm")
            End If

            If IsDBNull(dr("staff_idcardno_prove")) = False Then lblProveStaffID.Text = dr("staff_idcardno_prove")
            If IsDBNull(dr("staff_name_prove")) = False Then lblProveStaffName.Text = dr("staff_name_prove")
            If IsDBNull(dr("staff_prove_posname")) = False Then lblProvePositionName.Text = dr("staff_prove_posname")
            If IsDBNull(dr("staff_prove_poscode")) = False Then lblProveStaffPoscode.Text = dr("staff_prove_poscode")
            If IsDBNull(dr("staff_prove_offcode")) = False Then lblProveStaffOffcode.Text = dr("staff_prove_offcode")

            lblCaseID.Text = dr("case_id")
            lblCaseDate.Text = Convert.ToDateTime(dr("case_date")).ToString("dd/MM/yyyy", New Globalization.CultureInfo("th-TH"))
            lblCaseTime.Text = Convert.ToDateTime(dr("case_date")).ToString("HH:mm")

            If IsDBNull(dr("replace_position")) = False Then txtReplacePosition.Text = dr("replace_position")
            If IsDBNull(dr("tax_value")) = False Then txtTaxValue.Text = dr("tax_value")

            If IsDBNull(dr("report_desc")) = False Then txtReportDesc.Text = dr("report_desc")
            If IsDBNull(dr("order_desc")) = False Then txtReportOrder.Text = dr("order_desc")

            Dim dt As DataTable = GetExhibitList(TrackNo)
            If dt.Rows.Count > 0 Then
                dt.Columns.Add("seq")
                dt.Columns.Add("size_name")
                dt.Columns.Add("qty_name")
                dt.Columns.Add("weight_name")
                For i As Integer = 0 To dt.Rows.Count - 1
                    dt.Rows(i)("seq") = (i + 1)
                    dt.Rows(i)("size_name") = dt.Rows(i)("size_desc") & " " & dt.Rows(i)("size_unit_name")
                    dt.Rows(i)("qty_name") = dt.Rows(i)("qty") & " " & dt.Rows(i)("qty_unit_name")
                    dt.Rows(i)("weight_name") = dt.Rows(i)("weight") & " " & dt.Rows(i)("weight_unit_name")
                Next

                gvExhibitList.DataSource = dt
                gvExhibitList.DataBind()
            End If

        End If
        dtProve.Dispose()
    End Sub

    Private Function GetDataFromProveExhibit(ByVal TrackNo As String) As DataTable
        Dim sql As String = "select aap.exhibit_report_no, aap.staff_idcardno_prove,aap.taken_date," & vbNewLine
        sql += " aap.staff_prove_poscode, aap.staff_prove_offcode, "
        sql += " aap.replace_position, aap.report_desc, aap.order_desc, aap.tax_value, " & vbNewLine
        sql += " aa.legislation_id, aa.product_group_id, " & vbNewLine
        sql += " ps.posname || ' ' || st.staff_level staff_prove_posname, ed.offname staff_prove_offname, " & vbNewLine
        sql += " ti.title_name || st.first_name || ' ' || st.last_name staff_name_prove, " & vbNewLine
        sql += " bi.case_id, bi.case_date, aa.offcode "
        sql += " from application_arrest_prove aap " & vbNewLine
        sql += " inner join application_arrest aa on aa.track_no=aap.track_no " & vbNewLine
        sql += " inner join book_impeachment bi on bi.track_no=aap.track_no " & vbNewLine
        sql += " left join position ps on ps.poscode=aap.staff_prove_poscode " & vbNewLine
        sql += " left join ed_office ed on ed.offcode=aap.staff_prove_offcode " & vbNewLine
        sql += " left join staff st on st.idcard_no=aap.staff_idcardno_prove " & vbNewLine
        sql += " left join title ti on ti.title_code=st.title_code " & vbNewLine
        sql += " where aap.track_no='" & TrackNo & "'"
        Dim dt As DataTable = Config.ExcuteTable(sql)

        Return dt
    End Function

    Private Function GetExhibitList(ByVal TrackNo As String) As DataTable
        Dim sql As String = " select aae.id, aae.TRACK_NO ,  aae.BRAND_CODE, aae.ISDOMESTIC,decode(aae.isdomestic,'I','ในประเทศ','O','ต่างประเทศ','Z','') is_domestic_name, " & vbNewLine
        sql += " aae.sizes_code,nvl(aae.sizes_desc,sp.size_desc) size_desc, aae.SIZE_UNIT_CODE, nvl(aae.sizes_unit_name, nvl(su.thname,su.enname)) size_unit_name, " & vbNewLine
        sql += " aae.QTY, aae.qty_unit_code, nvl(aae.qty_unit_name, nvl(qu.thname,qu.enname)) qty_unit_name, " & vbNewLine
        sql += " aae.NETWEIGHT weight, aae.NETWEIGHT_UNIT_CODE weight_unit_code, nvl(aae.netweight_unit_name, nvl(wu.thname, wu.enname)) weight_unit_name, " & vbNewLine
        sql += " aae.STATUS exhibit_status,decode(aae.status,'1','ยึด','2','คืน') exhibit_status_name, aae.EXHIBIT_LIST, aae.EXHIBIT_DESC, " & vbNewLine
        sql += " aae.CAR_NO, aae.DUTY_CODE, nvl(aae.duty_name,dt.duty_name) duty_name, aae.REMARKS," & vbNewLine
        sql += " replace(nvl(aae.brand_name,  nvl(b.brand_main_thai, b.brand_main_eng)),'" & Chr(34) & "','" & Chr(92) & Chr(34) & "') brand_name, " & vbNewLine
        'sql += " dt.duty_name, nvl(aae.sizes_desc,sp.size_desc) size_desc, bi.case_id, " & vbNewLine
        'sql += " nvl(aae.product_name, nvl(p.product_name,dt.duty_name)) product_name," & vbNewLine
        sql += " aae.group_id, nvl(aae.group_name,dg.group_name) group_name " & vbNewLine
        sql += " from APP_ARREST_PROVE_EXHIBIT aae " & vbNewLine
        sql += " left join unit su on su.unit_code = aae.size_unit_code " & vbNewLine
        sql += " left join unit qu on qu.unit_code = aae.qty_unit_code " & vbNewLine
        sql += " left join application_arrest_exhibit ae on ae.id=aae.APP_ARREST_PROVE_EXHIBIT_ID " & vbNewLine
        sql += " left join unit wu on wu.unit_code = aae.netweight_unit_code " & vbNewLine
        sql += " left join brand_main b on b.group_id = aae.group_id and b.brand_main_code =aae.brand_code" & vbNewLine
        sql += " left join product p on p.product_code = aae.product_code" & vbNewLine
        sql += " left join size_package sp on sp.group_id = aae.group_id and sp.size_code = aae.sizes_code" & vbNewLine
        sql += " left join book_impeachment bi on bi.track_no = ae.track_no" & vbNewLine
        sql += " left join DUTY_TABLE dt on dt.duty_code=aae.duty_code" & vbNewLine
        sql += " left join duty_group dg on dg.group_id=aae.group_id " & vbNewLine
        sql += " where aae.track_no = '" & TrackNo & "' " & vbNewLine
        sql += " order by aae.id "

        Dim dt As DataTable = Config.ExcuteTable(sql)
        Return dt
    End Function

#Region "Prove Exhibit"
    Public Function SaveProveExhibit(ByVal UserIDCard As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            Dim sql As String = "select id from application_arrest_prove where track_no ='" & lblTrackNo.Text.Trim & "' and taken_date is not null and rownum=1"
            Dim dt As DataTable = Config.ExcuteTable(sql, trans)

            If dt.Rows.Count > 0 Then
                Dim vTakenDate As String = txtTakenDate.DateValue.ToString("yyyy-MM-dd", New System.Globalization.CultureInfo("en-US")) & " " & txtTakenTime.TimeText & ":00"
                Dim vReportNo As String = txtReportNo1.Text.Trim & "/" & txtReportNo2.Text.Trim

                sql = "update application_arrest_prove " & vbNewLine
                sql += " set exhibit_report_no = '" & vReportNo & "'" & vbNewLine
                sql += ", taken_date = to_date('" & vTakenDate & "','yyyy-mm-dd hh24:mi:ss')" & vbNewLine
                sql += ", staff_idcardno_prove = '" & lblProveStaffID.Text & "'" & vbNewLine
                sql += ", staff_prove_poscode = '" & lblProveStaffPoscode.Text & "'" & vbNewLine
                sql += ", staff_prove_offcode = '" & lblProveStaffOffcode.Text & "'" & vbNewLine
                sql += ", replace_position = " & IIf(txtReplacePosition.Text.Trim = "", "NULL", "'" & txtReplacePosition.Text & "'") & vbNewLine
                sql += ", report_desc = '" & txtReportDesc.Text & "'" & vbNewLine
                sql += ", order_desc = '" & txtReportOrder.Text & "'" & vbNewLine
                sql += ", tax_value = " & IIf(txtTaxValue.Text.Trim = "", "NULL", "'" & txtTaxValue.Text & "'") & vbNewLine
                sql += ", update_by = '" & UserIDCard & "', update_on=sysdate" & vbNewLine
                sql += " where track_no ='" & lblTrackNo.Text & "'"

                ret = Config.ExcuteNonQuery(sql, trans)

                If ret = True Then
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
                            Dim ExhibitID As String = IIf(grv.Cells(12).Text = "&nbsp;", "", grv.Cells(12).Text)

                            If ExhibitID = "0" Then
                                sql = "insert into app_arrest_prove_exhibit(id,create_by,create_on,track_no," & vbNewLine
                                sql += " duty_code,brand_code,brand_name,isdomestic, sizes_desc, size_unit_code,sizes_unit_name," & vbNewLine
                                sql += "qty, qty_unit_code,qty_unit_name,netweight,netweight_unit_code,netweight_unit_name, " & vbNewLine
                                sql += "status, exhibit_list, exhibit_desc, car_no,remarks, duty_name,group_id,group_name)" & vbNewLine
                                sql += " values(application_arrest_exhibit_seq.nextval,'" & UserIDCard & "',sysdate,'" & lblTrackNo.Text & "'," & vbNewLine
                                If lblDutyCode = "" Then sql += "null," Else sql += "'" & lblDutyCode & "'," & vbNewLine
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
                                If lblDutyName = "" Then sql += "null," Else sql += "'" & lblDutyName & "'," & vbNewLine
                                If lblGroupID = "" Then sql += "null," Else sql += "'" & lblGroupID & "'," & vbNewLine
                                If lblGroupName = "" Then sql += "null," Else sql += "'" & lblGroupName & "')"
                            Else
                                sql = " update app_arrest_prove_exhibit" & vbNewLine
                                sql += " set duty_code =" & IIf(lblDutyCode.Trim = "", "NULL", "'" & lblDutyCode & "'") & vbNewLine
                                sql += ", brand_code =" & IIf(lblBrandCode.Trim = "", "NULL", "'" & lblBrandCode & "'") & vbNewLine
                                sql += ", isdomestic = " & IIf(lblIsDomesticCode.Trim = "", "NULL", "'" & lblIsDomesticCode & "'") & vbNewLine
                                sql += ", size_unit_code = " & IIf(lblSizeUnitCode.Trim = "", "NULL", "'" & lblSizeUnitCode & "'") & vbNewLine
                                sql += ", qty = " & IIf(lblQty.Trim = "", "NULL", "'" & lblQty & "'") & vbNewLine
                                sql += ", qty_unit_code = " & IIf(lblQtyUnitCode.Trim = "", "NULL", "'" & lblQtyUnitCode & "'") & vbNewLine
                                sql += ", netweight = " & IIf(lblWeight.Trim = "", "NULL", "'" & lblWeight & "'") & vbNewLine
                                sql += ", netweight_unit_code = " & IIf(lblWeightUnitCode.Trim = "", "NULL", "'" & lblWeightUnitCode & "'") & vbNewLine
                                sql += ", status = " & IIf(lblExhibitStatus.Trim = "", "NULL", "'" & lblExhibitStatus & "'") & vbNewLine
                                sql += ", exhibit_list = " & IIf(lblExhibitList.Trim = "", "NULL", "'" & lblExhibitList & "'") & vbNewLine
                                sql += ", exhibit_desc = " & IIf(ExhibitDesc.Trim = "", "NULL", "'" & ExhibitDesc & "'") & vbNewLine
                                sql += ", car_no = " & IIf(CarNo.Trim = "", "NULL", "'" & CarNo & "'") & vbNewLine
                                sql += ", remarks = " & IIf(Remarks.Trim = "", "NULL", "'" & Remarks & "'") & vbNewLine
                                sql += ", brand_name = " & IIf(lblBrandName.Trim = "", "NULL", "'" & lblBrandName & "'") & vbNewLine
                                sql += ", sizes_desc = " & IIf(lblSizeDesc.Trim = "", "NULL", "'" & lblSizeDesc & "'") & vbNewLine
                                sql += ", sizes_unit_name = " & IIf(lblSizeUnitName.Trim = "", "NULL", "'" & lblSizeUnitName & "'") & vbNewLine
                                sql += ", qty_unit_name = " & IIf(lblQtyUnitName.Trim = "", "NULL", "'" & lblQtyUnitName & "'") & vbNewLine
                                sql += ", netweight_unit_name = " & IIf(lblWeightUnitName.Trim = "", "NULL", "'" & lblWeightUnitName & "'") & vbNewLine
                                sql += ", group_id = " & IIf(lblGroupID.Trim = "", "NULL", "'" & lblGroupID & "'") & vbNewLine
                                sql += ", duty_name = " & IIf(lblDutyName.Trim = "", "NULL", "'" & lblDutyName & "'") & vbNewLine
                                sql += ", group_name = " & IIf(lblGroupName.Trim = "", "NULL", "'" & lblGroupName & "'") & vbNewLine
                                sql += ", update_by ='" & UserIDCard & "', update_on=sysdate" & vbNewLine
                                sql += " where id='" & ExhibitID & "'"
                            End If

                            ret = Config.ExcuteNonQuery(sql, trans)
                            If ret = False Then
                                Exit For
                            End If
                        Next
                    Else
                        ret = True
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
        lblProductGroupID.Text = "0"
        lblLegislationID.Text = "0"
        txtReportNo1.Text = ""
        txtReportNo2.Text = ""
        txtTakenDate.ClearDate()
        txtTakenTime.TimeText = ""

        lblCaseID.Text = ""
        lblCaseDate.Text = ""
        lblCaseTime.Text = ""

        lblProveStaffName.Text = ""
        lblProveStaffID.Text = ""
        lblProvePositionName.Text = ""
        lblProveStaffPoscode.Text = ""
        lblProveStaffOffcode.Text = ""
        txtReplacePosition.Text = ""

        txtTaxValue.Text = ""

        txtReportDesc.Text = ""
        txtReportOrder.Text = ""

        gvExhibitList.DataSource = Nothing
        gvExhibitList.DataBind()
    End Sub
#End Region

    Protected Sub chkH_OnCheckedChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim chkH As CheckBox = sender
        Dim grv As GridViewRow = chkH.Parent.Parent
        Dim gv As GridView = grv.Parent.Parent
        For i As Integer = 0 To gv.Rows.Count - 1
            Dim chk As CheckBox = gv.Rows(i).Cells(0).FindControl("chk")
            chk.Checked = chkH.Checked
        Next
    End Sub

    Private Sub btnSearchProveStaff_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchProveStaff.Click
        frmSearchProveStaff.ShowPop()
    End Sub

    Private Sub frmSearchProveStaff_SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String) Handles frmSearchProveStaff.SelectStaff
        lblProveStaffName.Text = FullName
        lblProveStaffID.Text = IdCardNo
        lblProveStaffPoscode.Text = Poscode
        lblProvePositionName.Text = PosName
        lblProveStaffOffcode.Text = Offcode
    End Sub

    Private Sub btnAddExhibit_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAddExhibit.Click
        If lblLegislationID.Text = "0" Then
            Config.SetAlert("กรุณาเลือกพระราชบัญญัติ", Me.Page, txtReportNo1.ClientID)
        Else
            frmPopExhibit1.ShowPop(lblProductGroupID.Text)
        End If
    End Sub

    Private Sub frmPopExhibit1_SaveExhibit(ByVal sender As Object, ByVal e As System.EventArgs, ByVal GroupID As String, ByVal GroupName As String, ByVal DutyCode As String, ByVal DutyName As String, ByVal IsDomestic As String, ByVal BrandCode As String, ByVal BrandName As String, ByVal SizeDesc As String, ByVal SizeUintCode As String, ByVal SizeUnitName As String, ByVal Qty As String, ByVal QtyUnitCode As String, ByVal QtyUnitName As String, ByVal NetWeight As String, ByVal NetWeightUnitCode As String, ByVal NetWeightUnitName As String, ByVal ExhibitStatus As String, ByVal ExhibitList As String, ByVal ExhibitDesc As String, ByVal CarNo As String, ByVal Remarks As String, ByVal RowID As String, ByVal ExhibitID As Long) Handles frmPopExhibit1.SaveExhibit
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
            dr("ID") = ExhibitID

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
                    dt.Rows(i)("ID") = ExhibitID
                End If
            Next
        End If
        gvExhibitList.DataSource = dt
        gvExhibitList.DataBind()
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
        dt.Columns.Add("id")
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
            dr("ID") = IIf(grv.Cells(12).Text = "&nbsp;", "", grv.Cells(12).Text)

            dt.Rows.Add(dr)
        Next
        Return dt
    End Function

    Private Sub btnDelExhibit_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnDelExhibit.Click
        Dim dt As New DataTable
        dt = GetExhitbitList()
        For i As Integer = gvExhibitList.Rows.Count - 1 To 0 Step -1
            Dim grv As GridViewRow = gvExhibitList.Rows(i)
            Dim chk As CheckBox = DirectCast(grv.FindControl("chk"), CheckBox)
            If chk.Checked = True Then
                dt.Rows.RemoveAt(i)

                Dim ExhibitID As String = IIf(grv.Cells(12).Text = "&nbsp;", "0", grv.Cells(12).Text)
                If ExhibitID > "0" Then
                    Dim sql As String = "delete from app_arrest_prove_exhibit where id='" & ExhibitID & "'"
                    Dim trans As New TransactionDB
                    If Config.ExcuteNonQuery(sql, trans) = True Then
                        trans.CommitTransaction()
                    Else
                        trans.RollbackTransaction()
                    End If
                End If
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
            Dim ExhibitID As String = IIf(grv.Cells(12).Text = "&nbsp;", "", grv.Cells(12).Text)

            frmPopExhibit1.ShowPopEdit(RowID, GroupID, DutyCode, IsDomestic, BrandCode, BrandName, SizeDesc, SizeUnitCode, Qty, QtyUnitCode, NetWeight, NetWeightUnitCode, ExhibitStatus, ExhibitList, ExhibitDesc, CarNo, Remarks, ExhibitID)
        End If
    End Sub

    Private Sub gvExhibitList_RowEditing(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewEditEventArgs) Handles gvExhibitList.RowEditing

    End Sub
End Class