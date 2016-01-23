Partial Public Class frmSearchIndictment
    Inherits System.Web.UI.UserControl

    Public Event SelectIndictment(ByVal sender As Object, ByVal e As System.EventArgs, ByVal dt As DataTable)

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            txtGUILT_BASE.Attributes.Add("onKeyPress", "return clickbutton(event,'" & btnSearch.ClientID & "')")
            txtPENALTY_DESC.Attributes.Add("onKeyPress", "return clickbutton(event,'" & btnSearch.ClientID & "')")
        End If
    End Sub

    Protected Sub chkH_OnCheckedChanged(ByVal sender As Object, ByVal e As System.EventArgs)
        Dim chkAll As CheckBox = sender
        For Each grv As GridViewRow In gvData.Rows
            Dim chk As CheckBox = grv.FindControl("chk")
            chk.Checked = chkAll.Checked
        Next
    End Sub

    Public Sub ShowPop(ByVal vLigislationID As Int16)
        SetDDlLegislation(vLigislationID)
        SearchIndictment()
        zPopSearchIndictment.Show()
    End Sub

    Sub SetDDlLegislation(ByVal LegislationId As String)
        Dim sql As String = "Select id,legislation_code || ' ' || legislation_name legislation_name from legislation order by legislation_name"
        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        ddlLegislation.DataSource = dt
        ddlLegislation.DataBind()
        ddlLegislation.SelectedValue = LegislationId
        'ddlLegislation.Items.Insert(0, New ListItem("--- เลือก ---", "0"))
    End Sub

    Sub SearchIndictment()
        Dim sql As String = "select idc.* from indictment idc  "
        sql += " inner join legislation lg on lg.legislation_code=idc.law_id "
        sql += " Where 1 =1 "
        If ddlLegislation.SelectedIndex <> 0 Then
            sql += " and lg.id ='" & ddlLegislation.SelectedValue & "'"
        End If

        If txtGUILT_BASE.Text.Trim <> "" Then
            sql += " and GUILT_BASE Like '%" & txtGUILT_BASE.Text.Trim & "%'"
        End If

        If txtPENALTY_DESC.Text.Trim <> "" Then
            sql += " and PENALTY_DESC Like '%" & txtPENALTY_DESC.Text.Trim & "%'"
        End If

        sql += "   Order By PENALTY_CASE_LAW_ID"
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
        Session("SearchIndictment") = dt
        dt.Dispose()
    End Sub

    Private Sub imgClose_Click(ByVal sender As Object, ByVal e As System.Web.UI.ImageClickEventArgs) Handles imgClose.Click
        Session.Remove("SearchIndictment")
    End Sub

    Private Sub btnSearch_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearch.Click
        SearchIndictment()
    End Sub

    Private Sub PageControl1_PageChange(ByVal sender As Object, ByVal e As System.EventArgs) Handles PageControl1.PageChange
        Dim dt As New DataTable
        dt = Session("SearchIndictment")
        If dt.Rows.Count > 0 Then
            gvData.PageIndex = PageControl1.SelectPageIndex
            PageControl1.SetMainGridView(gvData)
            gvData.DataSource = dt
            gvData.DataBind()
            PageControl1.Update(dt.Rows.Count)
        End If
        dt.Dispose()
    End Sub

    Private Sub btnSelect_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSelect.Click
        Dim dt As New DataTable
        dt.Columns.Add("CASE_LAW_ID")
        dt.Columns.Add("PENALTY_CASE_LAW_ID")
        dt.Columns.Add("GUILT_BASE")
        dt.Columns.Add("Exhibit_Wild")
        dt.Columns.Add("INDICTMENT_ID")

        For Each grv As GridViewRow In gvData.Rows
            Dim chk As CheckBox = DirectCast(grv.FindControl("Chk"), CheckBox)
            If chk.Checked = True Then
                Dim lblIndictmentID As Label = grv.FindControl("lblIndictmentID")

                Dim dr As DataRow = dt.NewRow
                dr("CASE_LAW_ID") = grv.Cells(2).Text '"CASE_LAW_ID"
                dr("PENALTY_CASE_LAW_ID") = grv.Cells(3).Text '"PENALTY_CASE_LAW_ID"
                dr("GUILT_BASE") = grv.Cells(4).Text '"GUILT_BASE"

                Dim lblExb As Label = DirectCast(grv.FindControl("lblExhibitWild"), Label)
                dr("Exhibit_Wild") = lblExb.Text
                dr("INDICTMENT_ID") = lblIndictmentID.Text
                dt.Rows.Add(dr)
            End If
        Next

        If dt.Rows.Count > 0 Then
            'Session("SelectIndictment") = True
            'Session("IndictmentList") = dt
            'ScriptManager.RegisterStartupScript(Me, Me.GetType(), Guid.NewGuid().ToString(), "window.close();", True)
            RaiseEvent SelectIndictment(sender, e, dt)
        Else
            ScriptManager.RegisterStartupScript(Me, Me.GetType(), Guid.NewGuid().ToString(), "alert('กรุณาเลือกรายการ');", True)
        End If
    End Sub

    Private Sub gvData_RowDataBound(ByVal sender As Object, ByVal e As System.Web.UI.WebControls.GridViewRowEventArgs) Handles gvData.RowDataBound
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
End Class