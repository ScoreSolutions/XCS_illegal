Partial Public Class frmSearchDepartment
    Inherits System.Web.UI.UserControl

    Public Property DepartmentID() As String
        Get
            Return txtDepartmentID.Text.Trim
        End Get
        Set(ByVal value As String)
            txtDepartmentID.Text = value
        End Set
    End Property

    Public Property DepartmentName() As String
        Get
            Return txtDepartmentName.Text.Trim
        End Get
        Set(ByVal value As String)
            txtDepartmentName.Text = value
        End Set
    End Property

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Private Sub btnSearchDepartment_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchDepartment.Click
        zPopSearchDepartment.Show()
    End Sub

    Private Sub btnSearch_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearch.Click
        SearchEDOffice()
        zPopSearchDepartment.Show()
    End Sub

    Sub SearchEDOffice()
        Dim sql As String = "Select ID,OffCode,OffName From ED_Office Where 1 =1 "
        If txtOffCode.Text.Trim() <> "" Then
            sql += " and OffCode Like '%" & txtOffCode.Text.Trim() & "%'"
        End If

        If txtOffName.Text.Trim() <> "" Then
            sql += " and OffName Like '%" & txtOffName.Text.Trim() & "%'"
        End If
        sql += "   Order By OffCode,OffName"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        If Not dt Is Nothing Then
            dt.Columns.Add("seq", GetType(String))
            For i As Integer = 0 To dt.Rows.Count - 1
                dt.Rows(i)("seq") = i + 1
            Next
            gvEDOffice.DataSource = dt
            gvEDOffice.DataBind()
        End If

        PageControl1.SetMainGridView(gvEDOffice)
        gvEDOffice.PageSize = 10
        gvEDOffice.DataSource = dt
        Session("SearchEDOffice") = dt
        gvEDOffice.DataBind()
        PageControl1.Update(dt.Rows.Count)
        dt.Dispose()
    End Sub

    Private Sub gvEDOffice_RowCommand(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewCommandEventArgs) Handles gvEDOffice.RowCommand
        Try
            If e.CommandName = "select" Then
                Dim strValue() As String = Split(e.CommandArgument.ToString(), ",")
                txtDepartmentID.Text = strValue(0)
                txtDepartmentName.Text = strValue(1)

                Session.Remove("SearchEDOffice")
            End If
        Catch ex As Exception
            ScriptManager.RegisterStartupScript(Me, Me.GetType, Guid.NewGuid.ToString(), "alert('" & ex.ToString() & "')", True)
        End Try
    End Sub

    Private Sub PageControl1_PageChange(ByVal sender As Object, ByVal e As System.EventArgs) Handles PageControl1.PageChange
        Dim dt As New DataTable
        dt = Session("SearchEDOffice")
        If dt.Rows.Count > 0 Then
            gvEDOffice.PageIndex = PageControl1.SelectPageIndex
            PageControl1.SetMainGridView(gvEDOffice)
            gvEDOffice.DataSource = dt
            gvEDOffice.DataBind()
            PageControl1.Update(dt.Rows.Count)
        End If
        zPopSearchDepartment.Show()
    End Sub

    Private Sub imgClose_Click(ByVal sender As Object, ByVal e As System.Web.UI.ImageClickEventArgs) Handles imgClose.Click
        Session.Remove("SearchEDOffice")
    End Sub
End Class