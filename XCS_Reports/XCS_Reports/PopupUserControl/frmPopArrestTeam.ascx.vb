Public Partial Class frmPopArrestTeam
    Inherits System.Web.UI.UserControl

    Public Event SelectArrestTeamList(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As DataTable)

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Public Sub ShowPop()
        SetDDLInspectorTeam()

        PageControl1.SetMainGridView(gvData)
        gvData.DataSource = Nothing
        gvData.DataBind()
        PageControl1.Update(0)

        zPopArrestTeam.Show()
    End Sub

    Protected Sub chkH_OnCheckedChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim chkAll As CheckBox = sender
        For Each grv As GridViewRow In gvData.Rows
            Dim chk As CheckBox = grv.FindControl("chk")
            chk.Checked = chkAll.Checked
        Next
        zPopArrestTeam.Show()
    End Sub

    Sub SetDDLInspectorTeam()
        Dim sql As String = "select id,inspector_code from inspector_team order by inspector_code"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        ddlInspectorTeam.DataSource = dt
        ddlInspectorTeam.DataBind()
        ddlInspectorTeam.Items.Insert(0, New ListItem("--- เลือก ---", "0"))
        'dt.Dispose()
    End Sub

    Sub SearchAccuserList()
        Dim sql As String = "select idcard_no,poscode,offcode,empid,title_name || ' ' || first_name || ' ' || last_name as fullname,posname,offname,per_type_name from v_accuser_list_popup t Where 1 =1 "
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
        End If

        PageControl1.SetMainGridView(gvData)
        gvData.PageSize = 10
        gvData.DataSource = dt
        gvData.DataBind()
        PageControl1.Update(dt.Rows.Count)
        Session("SearchAccuserList") = dt
        dt.Dispose()
    End Sub


    Protected Sub btnSearch_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnSearch.Click
        SearchAccuserList()
        zPopArrestTeam.Show()
    End Sub

    Protected Sub PageControl1_PageChange(ByVal sender As Object, ByVal e As System.EventArgs) Handles PageControl1.PageChange
        Dim dt As New DataTable
        dt = Session("SearchAccuserList")
        If dt.Rows.Count > 0 Then
            gvData.PageIndex = PageControl1.SelectPageIndex
            PageControl1.SetMainGridView(gvData)
            gvData.DataSource = dt
            gvData.DataBind()
            PageControl1.Update(dt.Rows.Count)
        End If
        dt.Dispose()
        zPopArrestTeam.Show()
    End Sub

    Private Sub imgClose_Click(ByVal sender As Object, ByVal e As System.Web.UI.ImageClickEventArgs) Handles imgClose.Click
        Session.Remove("SearchAccuserList")
    End Sub

    Protected Sub btnSelect_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnSelect.Click
        Dim dt As New DataTable
        dt.Columns.Add("idcard_no")
        dt.Columns.Add("poscode")
        dt.Columns.Add("offcode")
        dt.Columns.Add("empid")
        dt.Columns.Add("fullname")
        dt.Columns.Add("posname")
        dt.Columns.Add("offname")
        dt.Columns.Add("per_type_name")

        For Each grv As GridViewRow In gvData.Rows
            Dim chk As CheckBox = DirectCast(grv.FindControl("Chk"), CheckBox)
            If chk.Checked = True Then
                Dim lblidcard_no As Label = DirectCast(grv.FindControl("lblidcard_no"), Label)
                Dim lblposcode As Label = DirectCast(grv.FindControl("lblposcode"), Label)
                Dim lbloffcode As Label = DirectCast(grv.FindControl("lbloffcode"), Label)
                Dim lblEmpID As Label = DirectCast(grv.FindControl("lblEmpID"), Label)
                Dim lblfullname As Label = DirectCast(grv.FindControl("lblfullname"), Label)
                Dim lblposname As Label = DirectCast(grv.FindControl("lblposname"), Label)
                Dim lbloffname As Label = DirectCast(grv.FindControl("lbloffname"), Label)
                Dim lblper_type_name As Label = DirectCast(grv.FindControl("lblper_type_name"), Label)

                Dim dr As DataRow = dt.NewRow
                dr("idcard_no") = lblidcard_no.Text
                dr("poscode") = lblposcode.Text
                dr("offcode") = lbloffcode.Text
                dr("empid") = lblEmpID.Text
                dr("fullname") = lblfullname.Text
                dr("posname") = lblposname.Text
                dr("offname") = lbloffname.Text
                dr("per_type_name") = lblper_type_name.Text
                dt.Rows.Add(dr)
            End If
        Next

        If dt.Rows.Count > 0 Then
            RaiseEvent SelectArrestTeamList(sender, e, dt)
            'Session("SelectAccuserList") = True
            'Session("AccuserList") = dt
            'ScriptManager.RegisterStartupScript(Me, Me.GetType(), Guid.NewGuid().ToString(), "window.close();", True)
            Session.Remove("SearchAccuserList")
            zPopArrestTeam.Hide()
        Else
            ScriptManager.RegisterStartupScript(Me, Me.GetType(), Guid.NewGuid().ToString(), "alert('กรุณาเลือกรายการ');", True)
        End If
    End Sub
End Class