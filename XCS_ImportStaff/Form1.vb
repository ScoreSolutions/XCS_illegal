Imports System.Data.OracleClient

Public Class Form1
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

    Private Sub Form1_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        
    End Sub

    Private Sub CreateErrorLog(ByVal logText As String)
        Dim FILE_NAME As String = Application.StartupPath & "\ErrorLog" & DateTime.Now.ToString("yyyyMMdd") & ".log"
        Dim objWriter As New System.IO.StreamWriter(FILE_NAME, True)
        objWriter.WriteLine(DateTime.Now.ToString("yyyy-MM-dd hh:mm:ss.fff") & " " & logText)
        objWriter.Close()
    End Sub

    Private Sub Timer1_Tick(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Timer1.Tick
        Timer1.Enabled = False
        Dim conn As New OracleConnection(GetConnectionString)
        Try
            conn.Open()
            Application.DoEvents()
            Dim sql As String = ""
            sql += " select per_id_ref, empid,idcard_no, per_type, title_code,title_name, first_name,last_name,"
            sql += " sex, birthdate,level_no,level_name,staff_level, per_id_ref,offcode,org_id1, org_code1,org_name1,org_short1,"
            sql += " org_id,org_code,org_name,org_short,poscode,poscode_admin, pos_name, posname_admin, dept_name "
            sql += " from p_staff "
            'sql += " where idcard_no='3860400036298'"
            Dim da As New OracleDataAdapter(sql, conn)
            Dim dt As New DataTable
            da.Fill(dt)

            Dim cmd As OracleCommand
            If dt.Rows.Count > 0 Then
                ProgressBar1.Maximum = dt.Rows.Count
                ProgressBar1.Value = 0
                Dim i As Integer = 0
                For Each dr As DataRow In dt.Rows
                    Dim iSql As String = ""
                    Try
                        iSql += " UPDATE STAFF" & vbNewLine
                        iSql += " SET EMPID     = '" & dr("empid").ToString.Trim & "'," & vbNewLine
                        iSql += " PER_TYPE      = '" & dr("PER_TYPE") & "'," & vbNewLine
                        iSql += " TITLE_CODE    = '" & dr("title_code") & "'," & vbNewLine
                        iSql += " TITLE_NAME    = '" & dr("title_name") & "'," & vbNewLine
                        iSql += " FIRST_NAME    = '" & dr("first_name") & "'," & vbNewLine
                        iSql += " LAST_NAME     = '" & dr("last_name") & "'," & vbNewLine
                        iSql += " SEX           = '" & dr("sex") & "'," & vbNewLine
                        iSql += " BIRTHDATE     = " & IIf(Convert.IsDBNull(dr("birthdate")) = False, "to_date(substr('" & dr("birthdate").ToString.Trim() & "',1,10),'yyyy-mm-dd')", "null") & "," & vbNewLine
                        iSql += " LEVEL_NO      = '" & dr("level_no") & "'," & vbNewLine
                        iSql += " LEVEL_NAME    = '" & dr("level_name") & "'," & vbNewLine
                        iSql += " STAFF_LEVEL   = '" & dr("staff_level") & "'," & vbNewLine
                        iSql += " PER_ID_REF    = '" & dr("per_id_ref") & "'," & vbNewLine
                        iSql += " OFFCODE       = '" & dr("offcode").ToString.Trim & "'," & vbNewLine
                        iSql += " ORG_ID1       = '" & dr("org_id1") & "'," & vbNewLine
                        iSql += " ORG_CODE1     = '" & dr("org_code1") & "'," & vbNewLine
                        iSql += " ORG_NAME1     = '" & dr("org_name1") & "'," & vbNewLine
                        iSql += " ORG_SHORT1    = '" & dr("org_short1") & "'," & vbNewLine
                        iSql += " ORG_ID        = '" & dr("org_id") & "'," & vbNewLine
                        iSql += " ORG_CODE      = '" & dr("org_code") & "'," & vbNewLine
                        iSql += " ORG_NAME      = '" & dr("org_name") & "'," & vbNewLine
                        iSql += " ORG_SHORT     = '" & dr("org_short") & "'," & vbNewLine
                        iSql += " POSCODE       = '" & dr("poscode").ToString.Trim & "'," & vbNewLine
                        iSql += " POSCODE_ADMIN = '" & dr("poscode_admin").ToString.Trim & "'," & vbNewLine
                        iSql += " POS_NAME      = '" & dr("pos_name") & "'," & vbNewLine
                        iSql += " POSNAME_ADMIN = '" & dr("posname_admin") & "'," & vbNewLine
                        iSql += " DEPT_NAME     = '" & dr("dept_name") & "'," & vbNewLine
                        iSql += " UPDATE_BY     = '0'," & vbNewLine
                        iSql += " UPDATE_ON     = sysdate " & vbNewLine
                        iSql += " WHERE  IDCARD_NO = '" & dr("idcard_no") & "'" & vbNewLine

                        cmd = New OracleCommand(iSql, conn)
                        If cmd.ExecuteNonQuery() = 0 Then
                            iSql = ""
                            iSql += " INSERT INTO STAFF (ID, EMPID, IDCARD_NO, PER_TYPE, " & vbNewLine
                            iSql += " TITLE_CODE, TITLE_NAME, FIRST_NAME, LAST_NAME, SEX, " & vbNewLine
                            iSql += " BIRTHDATE, LEVEL_NO, LEVEL_NAME, STAFF_LEVEL, PER_ID_REF, " & vbNewLine
                            iSql += " OFFCODE, ORG_ID1, ORG_CODE1, ORG_NAME1, ORG_SHORT1, ORG_ID, ORG_CODE, " & vbNewLine
                            iSql += " ORG_NAME, ORG_SHORT, POSCODE, POSCODE_ADMIN, POS_NAME, POSNAME_ADMIN, " & vbNewLine
                            iSql += " DEPT_NAME, CREATE_BY, CREATE_ON) " & vbNewLine
                            iSql += " VALUES ('" & dr("per_id_ref") & "','" & dr("empid").ToString.Trim() & "','" & dr("idcard_no") & "', '" & dr("per_type") & "'," & vbNewLine
                            iSql += " '" & dr("title_code") & "','" & dr("title_name") & "','" & dr("first_name") & "','" & dr("last_name") & "','" & dr("sex") & "', " & vbNewLine
                            iSql += " " & IIf(Convert.IsDBNull(dr("birthdate")) = False, "to_date(substr('" & dr("birthdate").ToString.Trim() & "',1,10),'yyyy-mm-dd')", "null") & ",'" & dr("level_no") & "','" & dr("level_name") & "','" & dr("staff_level") & "', '" & dr("per_id_ref") & "'," & vbNewLine
                            iSql += " '" & dr("offcode") & "','" & dr("org_id1") & "','" & dr("org_code1") & "','" & dr("org_name1") & "','" & dr("org_short1") & "' ,'" & dr("org_id") & "','" & dr("org_code") & "'," & vbNewLine
                            iSql += " '" & dr("org_name") & "','" & dr("org_short") & "','" & dr("poscode").ToString.Trim & "','" & dr("poscode_admin").ToString.Trim & "','" & dr("pos_name") & "','" & dr("posname_admin") & "'," & vbNewLine
                            iSql += " '" & dr("dept_name") & "','0', SYSDATE" & vbNewLine
                            iSql += ")" & vbNewLine

                            cmd = New OracleCommand(iSql, conn)
                            cmd.ExecuteNonQuery()
                        End If
                    Catch ex As OracleException
                        CreateErrorLog(ex.Message & " ### " & iSql)
                    Catch ex As Exception
                        CreateErrorLog(ex.Message)
                    End Try

                    i += 1
                    lblCounter.Text = "Current Row : " & i & " Total:" & dt.Rows.Count
                    ProgressBar1.Value = i
                    Application.DoEvents()
                Next
                cmd.Dispose()
            End If
            dt.Dispose()
            dt = Nothing

            da.Dispose()
            da = Nothing
        Catch ex As OracleException
            CreateErrorLog(ex.Message)
        Catch ex As Exception
            CreateErrorLog(ex.Message)
        Finally
            conn.Close()
            conn = Nothing
        End Try

        End
    End Sub
End Class
