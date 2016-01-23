Imports System.Data.OracleClient

Public Class frmAutoKellSessionAgent

    Private Shared ReadOnly Property INIFileName() As IniReader
        Get
            'Application.StartupPath = C:\Program Files\Common Files\Microsoft Shared\DevServer\9.0
            Dim INIFlie As String = "C:\Windows\XCS.ini"
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


    Private Sub txtAutoRefresh_TextChanged(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles txtAutoRefresh.TextChanged
        Timer1.Interval = Val(txtAutoRefresh.Text) * 1000
    End Sub

    Private Sub Timer1_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Timer1.Tick
        Dim conn As New OracleConnection(GetConnectionString)
        Try
            conn.Open()
            Dim sql As String = "select a.sid, a.serial#, a.username, a.status, a.osuser,"
            sql += " a.machine, a.program, a.type, a.service_name, a.logon_time"
            sql += " from v$session a "
            sql += " where a.type='USER' and a.machine='lawweb1' "

            Dim da As New OracleDataAdapter(sql, conn)
            Dim dt As New DataTable
            da.Fill(dt)
            da.Dispose()
            If dt.Rows.Count > 0 Then
                DataGridView1.DataSource = dt
                For Each dr As DataRow In dt.Rows
                    If dr("status") = "INACTIVE" Then
                        If DateAdd(DateInterval.Second, Val(txtAutoRefresh.Text), Convert.ToDateTime(dr("logon_time"))) <= DateTime.Now Then
                            Dim cmd As New OracleCommand
                            cmd.Connection = conn
                            cmd.CommandType = CommandType.Text
                            cmd.CommandTimeout = 5
                            cmd.CommandText = "ALTER system DISCONNECT SESSION '" & dr("sid") & ", " & dr("serial#") & "' IMMEDIATE"
                            cmd.ExecuteNonQuery()
                        End If
                    End If
                Next
                dt.Dispose()
                dt = Nothing
            End If

        Catch ex As OracleException
            'MessageBox.Show("OracleException :" & ex.Message)
        Catch ex As Exception
            'MessageBox.Show("Exception :" & ex.Message)
        Finally
            conn.Close()
            conn = Nothing
        End Try
    End Sub


    Private Sub NotifyIcon1_MouseDoubleClick(ByVal sender As Object, ByVal e As System.Windows.Forms.MouseEventArgs) Handles NotifyIcon1.MouseDoubleClick
        Me.Show()
        Me.WindowState = FormWindowState.Normal
        NotifyIcon1.Visible = False
    End Sub

    Private Sub frmAutoKellSessionAgent_Resize(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Resize
        If Me.WindowState = FormWindowState.Minimized Then
            Me.Hide()
            NotifyIcon1.Visible = True
        Else
            NotifyIcon1.Visible = False
        End If
    End Sub

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        Dim conn As New OracleConnection
        Try
            conn.ConnectionString = GetConnectionString
            conn.Open()
            MessageBox.Show("Success!!")
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub
End Class
