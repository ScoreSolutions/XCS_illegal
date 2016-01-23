Public Partial Class frmSearchArrestLawbreaker
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
       
    End Sub

    Protected Sub chkH_OnCheckedChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim chkAll As CheckBox = sender
        For Each grv As GridViewRow In gvData.Rows
            Dim chk As CheckBox = grv.FindControl("chk")
            chk.Checked = chkAll.Checked
        Next
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
            sql += " and first_name like '%" & txtName.Text.Trim() & "%' or last_name like '%" & txtName.Text.Trim() & "%'"
        End If

        If txtIDCard.Text <> "" Then
            sql += " and lawbreaker_id_card like '%" & txtIDCard.Text.Trim() & "%'"
        End If

        sql += "   Order By lawbreaker_id_card,t.title_name,first_name,last_name"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        If Not dt Is Nothing Then
            dt.Columns.Add("seq", GetType(Long))
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
        Session("SearchLawbreaker") = dt
        dt = Nothing
    End Sub

    Protected Sub btnSearch_Click(ByVal sender As Object, ByVal e As EventArgs) Handles btnSearch.Click
        SearchLawbreaker()
    End Sub

    Protected Sub PageControl1_PageChange(ByVal sender As Object, ByVal e As System.EventArgs) Handles PageControl1.PageChange
        Dim dt As New DataTable
        dt = Session("SearchLawbreaker")
        If dt.Rows.Count > 0 Then
            gvData.PageIndex = PageControl1.SelectPageIndex
            PageControl1.SetMainGridView(gvData)
            gvData.DataSource = dt
            gvData.DataBind()
            PageControl1.Update(dt.Rows.Count)
        End If
    End Sub

    Private Sub gvData_RowCommand(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewCommandEventArgs) Handles gvData.RowCommand
        Try
            If e.CommandName = "select" Then
                Dim strValue As String = e.CommandArgument.ToString()
                Session("lawbreaker_name") = strValue
                Session("selectedLaebreaker") = True
                ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "window.close();", True)
            End If
        Catch ex As Exception
            ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "alert('" & ex.ToString() & "')", True)
        End Try
    End Sub
End Class