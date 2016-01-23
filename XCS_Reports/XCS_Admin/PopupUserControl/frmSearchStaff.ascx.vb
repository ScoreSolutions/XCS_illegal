Partial Public Class frmSearchStaff
    Inherits System.Web.UI.UserControl

    Public Event SelectStaff(ByVal sender As Object, ByVal e As System.EventArgs, ByVal IdCardNo As String, ByVal FullName As String, ByVal PosName As String, ByVal Offname As String, ByVal Poscode As String, ByVal Offcode As String)


    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            txtFirstName.Attributes.Add("onKeyPress", "return clickButton(event,'" & btnSearch.ClientID & "')")
            txtLastName.Attributes.Add("onKeyPress", "return clickButton(event,'" & btnSearch.ClientID & "')")
            txtPosName.Attributes.Add("onKeyPress", "return clickButton(event,'" & btnSearch.ClientID & "')")
            txtOffName.Attributes.Add("onKeyPress", "return clickButton(event,'" & btnSearch.ClientID & "')")
        End If
    End Sub

    Public Sub ShowPop()
        SetDDLInspectorTeam()
        PageControl1.SetMainGridView(gvData)
        gvData.DataSource = Nothing
        gvData.DataBind()
        PageControl1.Update(0)
        zPopSearchStaff.Show()
    End Sub

    Sub SetDDLInspectorTeam()
        Dim sql As String = "select id,inspector_code from inspector_team order by inspector_code"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        ddlInspectorTeam.DataSource = dt
        ddlInspectorTeam.DataBind()
        ddlInspectorTeam.Items.Insert(0, New ListItem("--- เลือก ---", "0"))
        dt.Dispose()
    End Sub

    Sub SearchStaffList()
        Dim sql As String = "select idcard_no,poscode,offcode,empid,title_name || ' ' || first_name || ' ' || last_name as fullname,"
        sql += " posname,offname,per_type_name "
        sql += " from V_STAFF_LIST_POPUP t "
        sql += " Where 1 =1 "
        If ddlInspectorTeam.SelectedIndex <> 0 Then
            sql += " and team_id ='" & ddlInspectorTeam.SelectedValue & "'"
        End If

        If txtFirstName.Text.Trim <> "" Then
            sql += " and first_name Like '%" & txtFirstName.Text.Trim & "%'"
        End If

        If txtLastName.Text.Trim <> "" Then
            sql += " and last_name Like '%" & txtLastName.Text.Trim & "%'"
        End If

        If txtPosName.Text.Trim <> "" Then
            sql += " and posname like '%" & txtPosName.Text.Trim & "%'"
        End If

        If txtOffName.Text.Trim <> "" Then
            sql += " and offname like '%" & txtOffName.Text.Trim & "%'"
        End If

        sql += "   Order By per_type_name,title_name,first_name,last_name"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        If Not dt Is Nothing Then
            dt.Columns.Add("seq", GetType(String))
            For i As Integer = 0 To dt.Rows.Count - 1
                dt.Rows(i)("seq") = i + 1
            Next
            gvData.DataSource = dt
            gvData.DataBind()
        Else
            gvData.DataSource = Nothing
            gvData.DataBind()
        End If

        PageControl1.SetMainGridView(gvData)
        gvData.PageSize = 10
        gvData.DataSource = dt
        gvData.DataBind()
        PageControl1.Update(dt.Rows.Count)
        Session("SearchEmp") = dt
        dt.Dispose()
    End Sub

    Private Sub PageControl1_PageChange(ByVal sender As Object, ByVal e As System.EventArgs) Handles PageControl1.PageChange
        Dim dt As New DataTable
        dt = Session("SearchEmp")
        If dt.Rows.Count > 0 Then
            gvData.PageIndex = PageControl1.SelectPageIndex
            PageControl1.SetMainGridView(gvData)
            gvData.DataSource = dt
            gvData.DataBind()
            PageControl1.Update(dt.Rows.Count)
        End If
        dt.Dispose()
        zPopSearchStaff.Show()
    End Sub

    Private Sub gvData_RowCommand(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewCommandEventArgs) Handles gvData.RowCommand
        Try
            If e.CommandName = "select" Then
                Dim strValue() As String = Split(e.CommandArgument.ToString(), ",")
                RaiseEvent SelectStaff(sender, e, strValue(0), strValue(1), strValue(2), strValue(3), strValue(4), strValue(5))
                'Session("ArrestData") = strValue
                'Session("selectedArrestData") = True
                'ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "window.close();", True)
            End If
        Catch ex As Exception
            ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "alert('" & ex.ToString() & "')", True)
        End Try
    End Sub

    Private Sub imgClose_Click(ByVal sender As Object, ByVal e As System.Web.UI.ImageClickEventArgs) Handles imgClose.Click
        Session.Remove("SearchEmp")
    End Sub

    Private Sub btnSearch_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearch.Click
        SearchStaffList()
        zPopSearchStaff.Show()
    End Sub
End Class