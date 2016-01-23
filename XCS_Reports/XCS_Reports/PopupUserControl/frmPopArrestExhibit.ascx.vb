Public Partial Class frmPopArrestExhibit
    Inherits System.Web.UI.UserControl

    Public Event SaveExhibit(ByVal sender As Object, ByVal e As System.EventArgs, ByVal GroupID As String, ByVal GroupName As String, ByVal DutyCode As String, ByVal DutyName As String, ByVal IsDomestic As String, ByVal BrandCode As String, ByVal BrandName As String, ByVal SizeDesc As String, ByVal SizeUintCode As String, ByVal SizeUnitName As String, ByVal Qty As String, ByVal QtyUnitCode As String, ByVal QtyUnitName As String, ByVal NetWeight As String, ByVal NetWeightUnitCode As String, ByVal NetWeightUnitName As String, ByVal ExhibitStatus As String, ByVal ExhibitList As String, ByVal ExhibitDesc As String, ByVal CarNo As String, ByVal Remarks As String, ByVal RowID As String)

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Public Sub ShowPop(ByVal vProductGroupID As String)
        SetDDLGroupID()
        ddlGroupID.SelectedValue = vProductGroupID

        SetDDLDutyCode(vProductGroupID)
        SetDDLQtyUnitCode(vProductGroupID)
        SetDDLSizeUnitCode(vProductGroupID)
        SetDDLWeightUnitCode(vProductGroupID)

        txtSizeDesc.Attributes.Add("onKeyPress", "return ChkMinusDbl(this,event)")
        txtQty.Attributes.Add("onKeyPress", "return ChkMinusInt(this,event)")
        txtWeight.Attributes.Add("onKeyPress", "return ChkMinusDbl(this,event)")

        ClearForm()

        zPopArrestExhibit.Show()
    End Sub
    Public Sub ShowPopEdit(ByVal RowID As String, ByVal GroupID As String, ByVal DutyCode As String, ByVal IsDomestic As String, ByVal BrandCode As String, ByVal BrandName As String, ByVal SizeDesc As String, ByVal SizeUintCode As String, ByVal Qty As String, ByVal QtyUnitCode As String, ByVal NetWeight As String, ByVal NetWeightUnitCode As String, ByVal ExhibitStatus As String, ByVal ExhibitList As String, ByVal ExhibitDesc As String, ByVal CarNo As String, ByVal Remarks As String)
        SetDDLGroupID()
        ddlGroupID.SelectedValue = GroupID

        SetDDLDutyCode(GroupID)
        SetDDLQtyUnitCode(GroupID)
        SetDDLSizeUnitCode(GroupID)
        SetDDLWeightUnitCode(GroupID)

        txtSizeDesc.Attributes.Add("onKeyPress", "return ChkMinusDbl(this,event)")
        txtQty.Attributes.Add("onKeyPress", "return ChkMinusInt(this,event)")
        txtWeight.Attributes.Add("onKeyPress", "return ChkMinusDbl(this,event)")

        ClearForm()

        lblRowID.Text = RowID
        ddlDutyCode.SelectedValue = DutyCode
        rdIsDomestic.SelectedValue = IsDomestic
        txtBrandCode.Text = BrandCode
        txtBrandName.Text = BrandName
        txtSizeDesc.Text = SizeDesc
        ddlSizeUnitCode.SelectedValue = SizeUintCode
        txtQty.Text = Qty
        ddlQtyUnitCode.SelectedValue = QtyUnitCode
        txtWeight.Text = NetWeight
        ddlWeightUnitCode.SelectedValue = NetWeightUnitCode
        rdiExhibitStatus.SelectedValue = ExhibitStatus
        txtExhibitList.Text = ExhibitList
        txtExhibitDesc.Text = ExhibitDesc
        txtCarNo.Text = CarNo
        txtRemark.Text = Remarks

        zPopArrestExhibit.Show()
    End Sub


    Private Sub SetDDLGroupID()
        Try
            Dim sql As String = "select group_id,group_id || '-' || group_name group_name from duty_group where group_status='N' order by group_id"
            Dim dt As New DataTable
            dt = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                ddlGroupID.DataTextField = "group_name"
                ddlGroupID.DataValueField = "group_id"
                ddlGroupID.DataSource = dt
                ddlGroupID.DataBind()
            End If
            dt.Dispose()
        Catch ex As Exception

        End Try
    End Sub
    Private Sub SetDDLDutyCode(ByVal vGroupID As String)
        Try
            Dim sql As String = "select dt.duty_code, dt.duty_code || '-' || dt.duty_name duty_name"
            sql += " from duty_table dt"
            sql += " where dt.group_id='" + vGroupID + "' "
            sql += " and to_char(sysdate,'yyyymmdd') between to_char(nvl(dt.begin_date,sysdate),'yyyymmdd') and to_char(nvl(dt.end_date,sysdate),'yyyymmdd') "
            sql += " order by dt.duty_code"

            Dim dt As New DataTable
            dt = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                ddlDutyCode.DataTextField = "duty_name"
                ddlDutyCode.DataValueField = "duty_code"
                ddlDutyCode.DataSource = dt
                ddlDutyCode.DataBind()

                ddlDutyCode.Items.Insert(0, New ListItem("โปรดเลือก", "0"))
            End If
            dt.Dispose()
        Catch ex As Exception

        End Try

    End Sub

    Private Function GetQueryDutyUnit(ByVal vGroupID As String, ByVal UseFor As String)
        Dim sql As String = "select distinct u.unit_code, nvl(u.thname,u.enname) unit_name "
        sql += " from duty_unit du"
        sql += " inner join unit u on u.unit_code=du.unit_code "
        sql += " where du.group_id = '" + vGroupID + "' "
        If UseFor = "QTY" Then
            sql += " and du.used_for in ('A','P') "
        ElseIf UseFor = "SIZES" Then
            sql += " and du.used_for in ('A','S') "
        ElseIf UseFor = "NETWEIGHT" Then
            sql += " and du.used_for in ('A','S') "
        End If
        sql += " and to_date(sysdate) between to_date(du.begin_date) and to_date(nvl(du.end_date,sysdate)) "
        sql += " order by nvl(u.thname,u.enname)"
        Return sql
    End Function

    Private Sub SetDDLSizeUnitCode(ByVal vGroupID As String)
        Try
            Dim sql As String = GetQueryDutyUnit(vGroupID, "SIZES")
            Dim dt As New DataTable
            dt = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                ddlSizeUnitCode.DataTextField = "unit_name"
                ddlSizeUnitCode.DataValueField = "unit_code"
                ddlSizeUnitCode.DataSource = dt
                ddlSizeUnitCode.DataBind()

                ddlSizeUnitCode.Items.Insert(0, New ListItem("โปรดเลือก", "0"))
            End If
            dt.Dispose()
        Catch ex As Exception

        End Try
    End Sub

    Private Sub SetDDLQtyUnitCode(ByVal vGroupID As String)
        Try
            Dim sql As String = GetQueryDutyUnit(vGroupID, "QTY")
            Dim dt As New DataTable
            dt = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                ddlQtyUnitCode.DataTextField = "unit_name"
                ddlQtyUnitCode.DataValueField = "unit_code"
                ddlQtyUnitCode.DataSource = dt
                ddlQtyUnitCode.DataBind()

                ddlQtyUnitCode.Items.Insert(0, New ListItem("โปรดเลือก", "0"))
            End If
            dt.Dispose()
        Catch ex As Exception

        End Try
    End Sub

    Private Sub SetDDLWeightUnitCode(ByVal vGroupID As String)
        Try
            Dim sql As String = GetQueryDutyUnit(vGroupID, "NETWEIGHT")
            Dim dt As New DataTable
            dt = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                ddlWeightUnitCode.DataTextField = "unit_name"
                ddlWeightUnitCode.DataValueField = "unit_code"
                ddlWeightUnitCode.DataSource = dt
                ddlWeightUnitCode.DataBind()

                ddlWeightUnitCode.Items.Insert(0, New ListItem("โปรดเลือก", "0"))
            End If
            dt.Dispose()
        Catch ex As Exception

        End Try
    End Sub


    Private Sub ClearForm()
        SetDDLGroupID()

        lblRowID.Text = "0"
        ddlDutyCode.SelectedValue = "0"
        rdIsDomestic.SelectedValue = "Z"
        txtBrandCode.Text = ""
        txtBrandName.Text = ""
        txtSizeDesc.Text = ""
        ddlSizeUnitCode.SelectedValue = "0"
        txtQty.Text = ""
        ddlQtyUnitCode.SelectedValue = "0"
        txtWeight.Text = ""
        ddlWeightUnitCode.SelectedValue = "0"
        rdiExhibitStatus.SelectedValue = "1"
        txtExhibitList.Text = ""
        txtExhibitDesc.Text = ""
        txtCarNo.Text = ""
        txtRemark.Text = ""
    End Sub

    Private Sub ddlGroupID_SelectedIndexChanged(ByVal sender As Object, ByVal e As System.EventArgs) Handles ddlGroupID.SelectedIndexChanged
        SetDDLDutyCode(ddlGroupID.SelectedValue)
        SetDDLQtyUnitCode(ddlGroupID.SelectedValue)
        SetDDLSizeUnitCode(ddlGroupID.SelectedValue)
        SetDDLWeightUnitCode(ddlGroupID.SelectedValue)

        zPopArrestExhibit.Show()
    End Sub

    Private Sub SearchPopBrandName(ByVal vGroupID As String)
        Try
            Dim sql As String = "select bm.BRAND_MAIN_CODE, bm.BRAND_MAIN_THAI name_thai, bm.BRAND_MAIN_ENG name_eng, " & vbNewLine
            sql += " nvl(bm.brand_main_thai,bm.brand_main_eng) brand_name " & vbNewLine
            sql += " from BRAND_MAIN bm  " & vbNewLine
            sql += " where bm.group_id = '" & vGroupID & "' " & vbNewLine
            If txtSearchBrandCode.Text.Trim <> "" Then
                sql += " and upper(bm.brand_main_code) like '%" + txtSearchBrandCode.Text.Trim.ToUpper + "%'" & vbNewLine
            End If
            If txtSearchBrandName.Text.Trim <> "" Then
                sql += "and upper(nvl(bm.BRAND_MAIN_THAI,bm.BRAND_MAIN_ENG)) like '%" + txtSearchBrandName.Text.Trim.ToUpper + "%'" & vbNewLine
            End If
            sql += " and to_date(sysdate) between to_date(nvl(bm.begin_date,sysdate)) and to_date(nvl(bm.end_date,sysdate))  " & vbNewLine
            sql += " order by bm.BRAND_MAIN_THAI, bm.BRAND_MAIN_ENG" & vbNewLine

            Dim dt As New DataTable
            dt = Config.ExcuteTable(sql)

            PageControl1.SetMainGridView(gvBrandList)
            If dt.Rows.Count > 0 Then
                dt.Columns.Add("seq")
                For i As Integer = 0 To dt.Rows.Count - 1
                    dt.Rows(i)("seq") = (i + 1)
                Next

                gvBrandList.DataSource = dt
                gvBrandList.DataBind()
                PageControl1.Update(dt.Rows.Count)
                Session("SearchBrandList") = dt
            Else
                gvBrandList.DataSource = Nothing
                gvBrandList.DataBind()
                PageControl1.Update(0)
            End If
            dt.Dispose()

        Catch ex As Exception

        End Try
    End Sub

    Private Sub btnPopBrand_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnPopBrand.Click
        SearchPopBrandName(ddlGroupID.SelectedValue)
        zPopSearchBrandName.Show()
    End Sub

    Private Sub imgSearchBrandClosePop_Click(ByVal sender As Object, ByVal e As System.Web.UI.ImageClickEventArgs) Handles imgSearchBrandClosePop.Click
        Session.Remove("SearchBrandList")
        zPopArrestExhibit.Show()
    End Sub

    Private Sub btnSearchBrand_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchBrand.Click
        SearchPopBrandName(ddlGroupID.SelectedValue)
        zPopSearchBrandName.Show()
    End Sub

    Private Sub PageControl1_PageChange(ByVal sender As Object, ByVal e As System.EventArgs) Handles PageControl1.PageChange
        Dim dt As New DataTable
        dt = Session("SearchBrandList")
        If dt.Rows.Count > 0 Then
            gvBrandList.PageIndex = PageControl1.SelectPageIndex
            PageControl1.SetMainGridView(gvBrandList)
            gvBrandList.DataSource = dt
            gvBrandList.DataBind()
            PageControl1.Update(dt.Rows.Count)
        End If
        dt.Dispose()
        zPopSearchBrandName.Show()
    End Sub

    Private Sub gvBrandList_RowCommand(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewCommandEventArgs) Handles gvBrandList.RowCommand
        If e.CommandName = "Select" Then
            Dim ret() As String = Split(e.CommandArgument, "|")
            If ret.Length = 2 Then
                txtBrandCode.Text = ret(0)
                txtBrandName.Text = ret(1)
                Session.Remove("SearchBrandList")
                zPopArrestExhibit.Show()
            End If
        End If
    End Sub

    Private Sub btnAdd_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnAdd.Click
        Dim DutyName As String = IIf(ddlDutyCode.SelectedValue = "0", "", ddlDutyCode.SelectedItem.Text)
        Dim SizeUnitName As String = IIf(ddlSizeUnitCode.SelectedValue = "0", "", ddlSizeUnitCode.SelectedItem.Text)
        Dim QtyUnitName As String = IIf(ddlQtyUnitCode.SelectedValue = "0", "", ddlQtyUnitCode.SelectedItem.Text)
        Dim NetWeightUnitName As String = IIf(ddlWeightUnitCode.SelectedValue = "0", "", ddlWeightUnitCode.SelectedItem.Text)
        RaiseEvent SaveExhibit(sender, e, ddlGroupID.SelectedValue, ddlGroupID.SelectedItem.Text, ddlDutyCode.SelectedValue, DutyName, rdIsDomestic.SelectedValue, txtBrandCode.Text, txtBrandName.Text, txtSizeDesc.Text, ddlSizeUnitCode.SelectedValue, SizeUnitName, txtQty.Text, ddlQtyUnitCode.SelectedValue, QtyUnitName, txtWeight.Text, ddlWeightUnitCode.SelectedValue, NetWeightUnitName, rdiExhibitStatus.SelectedValue, txtExhibitList.Text, txtExhibitDesc.Text, txtCarNo.Text, txtRemark.Text, lblRowID.Text)
    End Sub
End Class