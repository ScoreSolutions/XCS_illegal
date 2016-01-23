Imports System.Data.OracleClient

Public Class frmImproveLost
    Private Shared ReadOnly Property INIFileName() As IniReader
        Get
            'Application.StartupPath = C:\Program Files\Common Files\Microsoft Shared\DevServer\9.0
            Dim INIFlie As String = GetStartupPath() & "\XCS.ini"
            Dim ini As New IniReader(INIFlie)
            ini.Section = "SETTING"
            Return ini
        End Get
    End Property

    Public Shared Function GetStartupPath() As String
        Return Application.StartupPath
    End Function

    Public Shared ReadOnly Property TnsName() As String
        Get

            Dim ini As IniReader = INIFileName
            Return ini.ReadString("TNSNAME")
        End Get
    End Property
    Public Shared ReadOnly Property ServiceName() As String
        Get
            Dim ini As IniReader = INIFileName
            Return ini.ReadString("ServiceName")
        End Get
    End Property

    Public Shared ReadOnly Property DbUserID() As String
        Get
            Dim ini As IniReader = INIFileName
            Return ini.ReadString("Username")
        End Get
    End Property

    Public Shared ReadOnly Property DbPwd() As String
        Get
            Dim ini As IniReader = INIFileName
            Return ini.ReadString("Password")
        End Get
    End Property

    Protected Shared ReadOnly Property GetConnectionString() As String
        Get
            Try
                Return "Data Source=" & TnsName & ";Persist Security Info=True;User ID=" & DbUserID & ";Password=" & DbPwd & ";Unicode=True"
            Catch ex As Exception
                'Throw New ApplicationException(ErrorConnectionString, ex)
            End Try
        End Get
    End Property

    Private Sub btnTest_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles btnTest.Click
        Dim FirstDay As New Date(2013, 1, 1)
        Dim LastDay As New Date(2013, 4, 2)
        Dim CurrDay As Date = FirstDay

        ProgressBar1.Value = 0
        ProgressBar1.Maximum = DateDiff(DateInterval.Day, FirstDay, LastDay) + 1
        Do
            Dim conn As New OracleConnection(GetConnectionString)
            Try
                conn.Open()
                Application.DoEvents()
                Dim sql As String = ""
                sql += " select case_id, track_no "
                sql += " from book_impeachment "
                sql += " where to_char(case_date,'yyyymmdd')='" & CurrDay.ToString("yyyyMMdd", New Globalization.CultureInfo("en-US")) & "'"
                Dim da As New OracleDataAdapter(sql, conn)
                Dim dt As New DataTable
                da.Fill(dt)

                If dt.Rows.Count > 0 Then
                    Dim sqlU As String = "--Current Date " & CurrDay.ToString("yyyy-MM-dd") & vbNewLine
                    For i As Integer = 0 To dt.Rows.Count - 1
                        Dim dr As DataRow = dt.Rows(i)
                        sqlU += "update book_impeachment set case_id='" & dr("case_id") & "' where track_no='" & dr("track_no") & "';" & vbNewLine & vbNewLine
                    Next
                    sqlU += "commit;" & vbNewLine
                    CreateUpdateLog(sqlU, CurrDay.Year.ToString)
                End If
                dt.Dispose()

            Catch ex As OracleException
                CreateErrorLog(ex.Message)
            Catch ex As Exception
                CreateErrorLog(ex.Message)
            Finally
                conn.Close()
                conn = Nothing
            End Try
            ProgressBar1.Value += 1
            CurrDay = DateAdd(DateInterval.Day, 1, CurrDay)
            Application.DoEvents()
        Loop While CurrDay <= LastDay

        MessageBox.Show("Complete !!")
    End Sub


    Private Sub CreateUpdateLog(ByVal logText As String, ByVal logYear As String)
        Dim FILE_NAME As String = Application.StartupPath & "\UpdateLog_" & logYear & ".sql"
        Dim objWriter As New System.IO.StreamWriter(FILE_NAME, True)
        objWriter.WriteLine(logText & vbNewLine)
        objWriter.Close()
    End Sub

    Private Sub CreateErrorLog(ByVal logText As String)
        Dim FILE_NAME As String = Application.StartupPath & "\ErrorLog" & DateTime.Now.ToString("yyyyMMdd") & ".log"
        Dim objWriter As New System.IO.StreamWriter(FILE_NAME, True)
        objWriter.WriteLine(DateTime.Now.ToString("yyyy-MM-dd hh:mm:ss.fff") & " " & logText)
        objWriter.Close()
    End Sub
End Class