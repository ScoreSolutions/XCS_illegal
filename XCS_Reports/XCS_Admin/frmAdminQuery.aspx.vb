Imports System.Data
'Imports LinqDB.Common.Utilities
Partial Public Class frmAdminQuery
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Private Sub btnExecute_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnExecute.Click
        Config.ErrorMessage = ""
        Dim dt As DataTable = Config.ExcuteTable(txtTextCommand.Text)
        GridView1.DataSource = dt
        GridView1.DataBind()

        Dim _Err As String = Config.ErrorMessage
        If _Err.Trim <> "" Then
            lblMsg.Text = _Err
        End If

    End Sub
End Class