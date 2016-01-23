'Imports Microsoft.VisualBasic
Imports System.Web
'Imports System.Web.Security
'Imports System.Web.UI
Imports System.Configuration
Imports System.Xml.Serialization
Imports System.IO
Imports System
Imports System.Data
Imports System.Array

Public Class Config

    Private Shared _Err As String = ""
    Public Shared Property ErrorMessage() As String
        Get
            Return _Err
        End Get
        Set(ByVal value As String)
            _Err = value
        End Set
    End Property

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
            _Err = "Exception : " & ex.Message & vbNewLine & ex.StackTrace & vbNewLine & " SQL=" & sql

            dt = New DataTable

            If IO.Directory.Exists("D:\XCSLog") = False Then
                IO.Directory.CreateDirectory("D:\XCSLog")
            End If
            IO.File.WriteAllText("D:\XCSLog\ExceptionLog.log", ex.Message & vbNewLine & ex.StackTrace)
        End Try
        Return dt
    End Function

    Public Shared Function ExcuteNonQuery(ByVal sql As String, ByVal trans As LinqDB.Common.Utilities.TransactionDB) As Boolean
        Dim ret As Boolean = False
        Try
            ret = (LinqDB.Common.Utilities.OracleDB.ExecuteNonQuery(sql, trans.Trans) > -1)
        Catch ex As Exception
            ret = False

            If IO.Directory.Exists("D:\XCSLog") = False Then
                IO.Directory.CreateDirectory("D:\XCSLog")
            End If
            IO.File.WriteAllText("D:\XCSLog\ExceptionLog.log", ex.Message & vbNewLine & ex.StackTrace)
        End Try
        Return ret
    End Function


    Public Shared Function BahtText(ByVal sNum As String) As String
        Dim ret As String = ""
        Dim sNumber As String() = {"", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า"}
        Dim sDigit As String() = {"", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน"}
        Dim sDigit10 As String() = {"", "สิบ", "ยี่สิบ", "สามสิบ", "สี่สิบ", "ห้าสิบ", "หกสิบ", "เจ็ดสิบ", "แปดสิบ", "เก้าสิบ"}
        Dim nLen As Integer = 0
        Dim sWord As String = ""
        Dim sWord2 As String = ""
        Dim sByte1 As Integer = 0
        Dim i As Integer = 0
        Dim j As Integer = 0

        sNum = Replace(FormatNumber(sNum, 2), ",", "")
        nLen = Len(sNum)

        If sNum = ".00" Then ret = "ศูนย์"
        For i = 1 To nLen - 3
            j = (15 + nLen - i) Mod 6
            sByte1 = Mid(sNum, i, 1)
            If sByte1 <> "0" Then
                If j = 1 Then sWord = sDigit10(sByte1) Else sWord = sNumber(sByte1) & sDigit(j)
                ret = ret & sWord
            End If
            If j = 0 And i <> nLen - 3 Then ret = ret & "ล้าน" : ret = Replace(ret, "หนึ่งล้าน", "เอ็ดล้าน")
        Next
        If Microsoft.VisualBasic.Left(sNum, 1) = "1" Then ret = Replace(ret, "เอ็ดล้าน", "หนึ่งล้าน")
        If Microsoft.VisualBasic.Left(sNum, 2) = "11" Then ret = Replace(ret, "สิบหนึ่งล้าน", "สิบเอ็ดล้าน")
        If Len(ret) > 0 Then ret = ret & "บาท"
        If nLen > 4 Then ret = Replace(ret, "หนึ่งบาท", "เอ็ดบาท")
        sNum = Microsoft.VisualBasic.Right(sNum, 2)
        If sNum = "00" Then
            ret = ret & "ถ้วน"
        Else
            If Microsoft.VisualBasic.Left(sNum, 1) <> "0" Then ret = ret & sDigit10(Microsoft.VisualBasic.Left(sNum, 1))
            If Microsoft.VisualBasic.Right(sNum, 1) <> "0" Then ret = ret & sNumber(Microsoft.VisualBasic.Right(sNum, 1))
            ret = ret & "สตางค์"
            If Microsoft.VisualBasic.Left(sNum, 1) <> "0" Then ret = Replace(ret, "หนึ่งสตางค์", "เอ็ดสตางค์")
        End If

        Return ret
    End Function



    Private Shared Function GetLoginHisID(ByVal UserName As String, ByVal req As HttpRequest) As Long
        Dim ret As Long = 0
        Dim sql As String = "select id "
        sql += " from login_his "
        sql += " where username='" & UserName & "'"
        sql += " and to_char(login_time,'ddmmyyyy')=to_char(sysdate,'ddmmyyyy')"
        sql += " and logout_time is null"
        sql += " and ip_address='" & req.UserHostAddress & "'"
        sql += " order by id desc"

        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            ret = dt.Rows(0)("id")
        End If
        dt.Dispose()

        Return ret
    End Function

    Public Shared Sub SaveLogTrans(ByVal UserName As String, ByVal req As HttpRequest, ByVal SessionID As String, ByVal LogMsg As String)
        Try
            Dim LoginID As Long = GetLoginHisID(UserName, req)

            LogMsg = LinqDB.Common.Utilities.OracleDB.SetString(LogMsg)
            SessionID = LinqDB.Common.Utilities.OracleDB.SetString(SessionID)
            Dim Browser As String = " Type:" + req.Browser.Type + " Version:" + req.Browser.Version + " Browser:" + req.Browser.Browser

            Dim sql As String = "insert into tran_log(id,userid,tran_date,tran_desc,ip_address,sessionid,browser,login_his_id)"
            sql += " values(tran_log_seq.nextval,'" & UserName & "',sysdate," & LogMsg & ",'" & req.UserHostAddress & "'," & SessionID & ",'" & Browser & "','" & LoginID & "')"

            Dim trans As New LinqDB.Common.Utilities.TransactionDB
            If Config.ExcuteNonQuery(sql, trans) = True Then
                trans.CommitTransaction()
            Else
                trans.RollbackTransaction()
            End If
        Catch ex As Exception

        End Try
    End Sub
End Class
