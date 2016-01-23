'Imports Microsoft.VisualBasic
Imports System.Web
'Imports System.Web.Security
'Imports System.Web.UI
Imports System.Configuration
Imports System.Xml.Serialization
Imports System.IO
Imports System
Imports System.Data

Public Class Config

    Public Shared Function SetlblStr(ByVal lbl As Label) As String
        Dim ret As String = ""
        If lbl.Text <> "" Then
            ret = LinqDB.Common.Utilities.OracleDB.SetString(lbl.Text)
        End If
        Return ret
    End Function
    Public Shared Function SetlblDate(ByVal lbl As Label) As String
        Dim ret As New Date(1, 1, 1)
        If lbl.Text.Trim() <> "" Then
            Dim TmpDate As Date = Date.ParseExact(lbl.Text, "dd/MM/yyyy", New Globalization.CultureInfo("en-US"))
            If TmpDate.Year > 2500 Then
                ret = New Date(TmpDate.Year - 543, TmpDate.Month, TmpDate.Day)
            End If
            Return "to_date('" & ret.ToString("yyyy-MM-dd", New System.Globalization.CultureInfo("en-US")) & "','yyyy-mm-dd')"
        Else
            Return New Date()
        End If
    End Function

    Public Shared Sub SetAlert(ByVal msg As String, ByVal frm As Page)
        Dim popupScript As String = "<script language='javascript'>  alert('" & msg & "'); self.close();  </script>"
        ScriptManager.RegisterStartupScript(frm, GetType(String), "SetAlert1", popupScript, False)
    End Sub

    Public Shared Sub SetAlert(ByVal msg As String, ByVal frm As Page, ByVal ClientID As String)
        Dim popupScript As String = "<script language='javascript'> " & _
        " alert('" & msg & "'); " & _
        " document.getElementById('" & ClientID & "').focus();" & _
        " </script>"
        ScriptManager.RegisterStartupScript(frm, GetType(String), "SetAlert1", popupScript, False)
    End Sub
    
    Public Shared Function UploadFile(ByVal FileUpload1 As FileUpload, ByVal fileName As String, ByVal fldName As String) As Boolean
        'Upload and save file at directory
        Dim ret As Boolean = True

        If FileUpload1.HasFile = True Then
            Dim extension As String = System.IO.Path.GetExtension(FileUpload1.PostedFile.FileName).ToLower()
            Dim MIMEType As String = ""

            Try
                MIMEType = getMIMEType(FileUpload1.PostedFile.FileName)
                If MIMEType = "" Then
                    Return False
                    Exit Function
                End If

                Dim X As String = Path.GetFileName(fileName)
                X = fldName & X & MIMEType
                'Ex.  D:\ElawUpload\   Document\Contract\   fileName.ext

                If Directory.Exists(fldName) = False Then
                    Directory.CreateDirectory(fldName)
                End If
                FileUpload1.PostedFile.SaveAs(X)
                ret = True
            Catch ex As Exception
                ret = False

            End Try
        End If

        Return ret
    End Function
    Public Shared Function getMIMEType(ByVal vFileName As String) As String
        Dim extension As String = System.IO.Path.GetExtension(vFileName).ToLower()
        Dim MIMEType As String = ""

        Select Case extension
            Case ".jpg", ".jpeg", ".jpe"
                MIMEType = ".jpg"
            Case ".csv", ".xls", ".xlsx", ".pdf", ".doc", ".docx", ".txt", ".png", ".gif"
                MIMEType = extension
            Case ".htm", ".html"
                MIMEType = ".html"
            Case Else
                MIMEType = ""
        End Select

        Return MIMEType

    End Function

    Public Shared Function cStrToDate(ByVal StringDate As String) As Date 'Convert วันที่จาก yyyyMMdd เป็น Date
        Dim ret As New Date(1, 1, 1)
        If StringDate.Trim <> "" Then
            Dim yy As String = Left(StringDate, 4)
            Dim mm As String = StringDate.Substring(4, 2)
            Dim dd As String = Right(StringDate, 2)
            ret = New Date(yy, mm, dd)
        End If
        Return ret
    End Function

    Public Shared Function cStrToDate2(ByVal StringDate As String) As Date 'Convert วันที่จาก yyyy-MM-dd เป็น Date
        Dim ret As New Date(1, 1, 1)
        If StringDate.Trim <> "" Then
            Dim vDate() As String = Split(StringDate, "-")
            ret = New Date(vDate(0), vDate(1), vDate(2))
        End If
        Return ret
    End Function

    Public Shared Function ExcuteTable(ByVal sql As String) As DataTable
        Dim dt As New DataTable
        Try
            dt = LinqDB.Common.Utilities.OracleDB.ExecuteTable(sql)
        Catch ex As Exception
            dt = New DataTable
        End Try
        Return dt
    End Function

    Public Shared Function ExcuteTable(ByVal sql As String, ByVal trans As LinqDB.Common.Utilities.TransactionDB) As DataTable
        Dim dt As New DataTable
        Try
            dt = LinqDB.Common.Utilities.OracleDB.ExecuteTable(sql, trans.Trans)
        Catch ex As Exception
            dt = New DataTable
        End Try
        Return dt
    End Function

    Public Shared Function ExcuteNonQuery(ByVal sql As String, ByVal trans As LinqDB.Common.Utilities.TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            ret = (LinqDB.Common.Utilities.OracleDB.ExecuteNonQuery(sql, trans.Trans) > -1)
        Catch ex As Exception
            ret = False
        End Try
        Return ret
    End Function
End Class
