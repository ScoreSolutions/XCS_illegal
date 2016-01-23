Imports System.Web.Services
Imports System.Web.Services.Protocols
Imports System.ComponentModel
Imports Newtonsoft.Json

' To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line.
<System.Web.Script.Services.ScriptService()> _
<System.Web.Services.WebService(Namespace:="http://tempuri.org/")> _
<System.Web.Services.WebServiceBinding(ConformsTo:=WsiProfiles.BasicProfile1_1)> _
<ToolboxItem(False)> _
Public Class wsAdminService
    Inherits System.Web.Services.WebService

    '<WebMethod()> _
    'Public Function HelloWorld() As String
    '    Return "Hello World"
    'End Function

    <WebMethod()> _
    Public Function GetDataTable(ByVal sql As String) As String
        Config.ErrorMessage = ""
        Dim dt As DataTable = Config.ExcuteTable(sql)
        Dim ret As String = JsonConvert.SerializeObject(dt, Formatting.Indented)

        Dim _err As String = Config.ErrorMessage
        If _err <> "" Then
            ret = "Error : " & _err
        End If
        dt.Dispose()

        Return ret
    End Function


    <WebMethod()> _
    Public Function ExecuteNoneQuery(ByVal sql As String) As String
        Config.ErrorMessage = ""

        Dim trans As New LinqDB.Common.Utilities.TransactionDB
        Dim ret As String = "false"
        If Config.ExcuteNonQuery(sql, trans) = True Then
            trans.CommitTransaction()
            ret = "true"
        Else
            trans.RollbackTransaction()
        End If

        Dim _err As String = Config.ErrorMessage
        If _err <> "" Then
            ret = "false|" & _err
        End If

        Return ret
    End Function

End Class