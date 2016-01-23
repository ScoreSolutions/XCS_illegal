Imports System
Imports System.Collections.Generic
Imports System.Configuration
Imports System.Data
Imports System.Data.OracleClient
Imports System.Text

Namespace Common.Utilities
    Public Class OracleDB
        Protected Shared ErrorConnectionString As String = MessageResources.MSGEC001
        Protected Shared ErrorConnection As String = MessageResources.MSGEC002
        Protected Shared ErrorSetCommandConnection As String = MessageResources.MSGEC003
        Protected Shared ErrorInvalidCommandType As String = MessageResources.MSGEC004
        Protected Shared ErrorDuplicateParameter As String = MessageResources.MSGEC006
        Protected Shared ErrorNullParameter As String = MessageResources.MSGEC005
        Protected Shared ErrorExecuteNonQuery As String = MessageResources.MSGEC010
        Protected Shared ErrorExecuteReader As String = MessageResources.MSGEC011
        Protected Shared ErrorExecuteTable As String = MessageResources.MSGEC012
        Protected Shared ErrorExecuteScalar As String = MessageResources.MSGEC013
        Protected Shared ErrorDatabaseOther As String = MessageResources.MSGEC901
        Protected Shared ErrorUndefined As String = MessageResources.MSGEC902

        Public Shared Function SetDouble(ByVal number As Double) As String
            Dim ret As String
            If Convert.IsDBNull(number) Then
                ret = "NULL"
            Else
                ret = number.ToString()
            End If
            Return ret
        End Function
        Public Shared Function SetDecimal(ByVal number As Decimal) As String
            Dim ret As String
            If Convert.IsDBNull(number) Then
                ret = "NULL"
            Else
                ret = number.ToString()
            End If
            Return ret
        End Function
        Public Shared Function SetString(ByVal str As String) As String
            Dim ret As String = ""
            If str Is Nothing Or str.Trim() = "" Then
                ret = "NULL"
            Else
                ret = Chr(39) & str.Trim().Replace("'", "''") & Chr(39)
            End If
            Return ret
        End Function
        Public Shared Function SetDate() As String
            Return SetDateTime(DateTime.Today)
        End Function
        Public Function SetDate(ByVal DateIn As DateTime) As String
            Return SetDateTime(DateIn)
        End Function
        Public Shared Function SetDateTime() As String
            Return SetDateTime(DateTime.Today)
        End Function
        Public Shared Function SetDateTime(ByVal DateIn As DateTime) As String
            Dim ret As String = ""
            If DateIn.Year = 1 Or Convert.IsDBNull(DateIn) Then
                ret = "NULL"
            ElseIf DateIn.Year > 2500 Then
                Dim vYear As String = DateIn.Year - 543
                ret = "'" & vYear & "-" & DateIn.ToString("MM-dd HH:mm:ss") & "'"
            Else
                ret = "'" & DateIn.Year & "-" & DateIn.ToString("MM-dd HH:mm:ss") & "'"
            End If
            Return ret
        End Function

        Public Shared Function GetExceptionMessage(ByVal ex As OracleException) As String
            Return String.Format(ErrorDatabaseOther, ex.ErrorCode.ToString(), ex.Message)
        End Function

        Public Shared ReadOnly Property DataSource() As String
            Get
                Return ConfigurationSettings.AppSettings("DataSource").ToString ' "Akkarawat"
            End Get
        End Property
        'Public Shared ReadOnly Property DbName()
        '    Get
        '        Return ConfigurationSettings.AppSettings("DbName").ToString
        '    End Get
        'End Property
        Public Shared ReadOnly Property DbUserID() As String
            Get
                Return ConfigurationSettings.AppSettings("DbUserID").ToString
            End Get
        End Property
        Public Shared ReadOnly Property DbPwd() As String
            Get
                Return ConfigurationSettings.AppSettings("DbPwd").ToString
            End Get
        End Property



        Protected Shared ReadOnly Property ConnectionString() As String
            Get
                Try
                    'Return "Data Source=" & DataSource() & ";Initial Catalog=" & DbName() & ";User ID=" & DbUserID() & ";Password=" & DbPwd()       'For SQL Server
                    Return "Data Source=" & DataSource & ";Persist Security Info=True;User ID=" & DbUserID & ";Password=" & DbPwd & ";Unicode=True"  'For Oracle
                Catch ex As Exception
                    Throw New ApplicationException(ErrorConnectionString, ex)
                End Try
            End Get
        End Property

        Public Shared Function GetConnection() As OracleConnection
            Dim conn As OracleConnection
            Try
                conn = New OracleConnection(ConnectionString)
                conn.Open()
                Return conn
            Catch ex As Exception
                Throw New ApplicationException(GetExceptionMessage(ex), ex)
            Catch ex As ApplicationException
                Throw ex
            Catch ex As OracleException
                Throw New ApplicationException(ErrorConnection, ex)
            End Try
        End Function

        Public Shared Function GetConnection(ByVal connString As String) As OracleConnection
            Dim conn As OracleConnection
            Try
                conn = New OracleConnection(connString)
                conn.Open()
                Return conn
            Catch ex As Exception
                Throw New ApplicationException(GetExceptionMessage(ex), ex)
            Catch ex As ApplicationException
                Throw ex
            Catch ex As OracleException
                Throw New ApplicationException(ErrorConnection, ex)
            End Try
        End Function

        Public Shared Function ChkConnection() As Boolean
            Dim ret As Boolean = False
            Dim conn As OracleConnection
            Try
                conn = New OracleConnection(ConnectionString)
                conn.Open()
                ret = True
            Catch ex As OracleException
                CreateErrorLog("OracleException : " & ex.Message & vbNewLine & ex.StackTrace, "D:\ErrorLog\DBLog")

                Throw New ApplicationException(ErrorConnection, ex)
                ret = False
                'Catch ex As ApplicationException
                '    Throw ex
                '    ret = False
                'Catch ex As Exception
                '    Throw New ApplicationException(GetExceptionMessage(ex), ex)
                '    ret = False
            Catch ex As Exception
                CreateErrorLog("Exception : " & ex.Message & vbNewLine & ex.StackTrace, "D:\ErrorLog\DBLog")
                Throw New Exception(ex.Message)
                ret = False
            Finally
                conn.Close()
                conn = Nothing
            End Try

            Return ret
        End Function

        Public Shared Sub CreateErrorLog(ByVal ErrMsg As String, ByVal PathFile As String)
            If PathFile.EndsWith("\") = False Then
                PathFile = PathFile & "\"
            End If
            Dim ErrLogDir As String = PathFile & Now.ToString("yyyyMM")
            If System.IO.Directory.Exists(ErrLogDir) = False Then
                System.IO.Directory.CreateDirectory(ErrLogDir)
            End If
            'If Directory.Exists(ErrLogDir) = False Then
            '    Directory.CreateDirectory(ErrLogDir)
            'End If

            Dim FILE_NAME As String = ErrLogDir & "\ErrorLog_" & DateTime.Now.ToString("yyyyMMdd") & ".log"
            Dim objWriter As New System.IO.StreamWriter(FILE_NAME, True)
            objWriter.WriteLine(DateTime.Now.ToString("yyyy-MM-dd hh:mm:ss.fff") & " " & ErrMsg & Chr(13))
            objWriter.Close()
        End Sub
        Public Shared Function GetNextID(ByVal fldName As String, ByVal tbName As String, ByVal trans As OracleTransaction) As Long
            Dim ret As Long
            Dim Sql As String = "select max(" & fldName & ") maxID from " & tbName
            Dim dt As DataTable = ExecuteTable(Sql, trans)
            If Convert.IsDBNull(dt.Rows(0)("maxID")) = False Then
                ret = Convert.ToInt64(dt.Rows(0)("maxID").ToString()) + 1
            Else
                ret = 1
            End If

            Return ret
        End Function

        Public Shared Function GetDateNow(ByVal rtType As String, ByVal trans As OracleTransaction) As String
            'rtType = D  ให้คืนค่าเป็นวันที่ในรูปแบบ yyyy-MM-dd
            'rtType = T  ให้คืนค่าเป็นเวลาปัจจุบัน hh:mm
            Dim ret As String
            Dim dt As DataTable = ExecuteTable("select convert(varchar(10),getdate(),120) date_now, CONVERT(varchar(5),getdate(),108) time_now", trans)
            If rtType = "D" Then
                ret = dt.Rows(0)("date_now")
            Else
                ret = dt.Rows(0)("time_now")
            End If

            Return ret

        End Function

        Public Shared Function ExecuteTable(ByVal sql As String) As DataTable
            Return ExecuteTable(sql, Nothing, Nothing)
        End Function
        Public Shared Function ExecuteTable(ByVal sql As String, ByVal conn As OracleConnection) As DataTable
            Return ExecuteTable(sql, conn, Nothing)
        End Function
        Public Shared Function ExecuteTable(ByVal sql As String, ByVal trans As OracleTransaction) As DataTable
            Return ExecuteTable(sql, Nothing, trans)
        End Function
        Public Shared Function ExecuteTable(ByVal sql As String, ByVal conn As OracleConnection, ByVal trans As OracleTransaction) As DataTable
            Dim cmd As New OracleCommand
            Dim adapter As New OracleDataAdapter
            adapter.SelectCommand = cmd

            Dim dt As New DataTable

            Try
                If conn Is Nothing And trans Is Nothing Then
                    conn = New OracleConnection(ConnectionString)
                ElseIf trans IsNot Nothing And conn Is Nothing Then
                    conn = trans.Connection
                End If

                BuildCommand(cmd, conn, trans, CommandType.Text, sql, Nothing)
                adapter.Fill(dt)
                adapter.Dispose()
            Catch ex As ApplicationException
                adapter.Dispose()
                'Throw ex
                CreateErrorLog("ApplicationException : " & ex.Message & ex.StackTrace & " SQL=" & sql & " ConStr=" & ConnectionString, "D:\ErrorLog\DBLog")
            Catch ex As OracleException
                adapter.Dispose()
                'Throw New ApplicationException(GetExceptionMessage(ex), ex)
                CreateErrorLog("OracleException : " & ex.Message & ex.StackTrace & " SQL=" & sql & " ConStr=" & ConnectionString, "D:\ErrorLog\DBLog")
            Catch ex As Exception
                adapter.Dispose()
                'Throw New ApplicationException(ErrorExecuteTable, ex)
                CreateErrorLog("Exception : " & ex.Message & ex.StackTrace & " SQL=" & sql & " ConStr=" & ConnectionString, "D:\ErrorLog\DBLog")
            End Try

            Return dt
        End Function

        Public Shared Function ExecuteReader(ByVal Sql As String) As OracleDataReader
            Return ExecuteReader(Sql, Nothing, Nothing)
        End Function
        Public Shared Function ExecuteReader(ByVal Sql As String, ByVal trans As OracleTransaction) As OracleDataReader
            Return ExecuteReader(Sql, Nothing, trans)
        End Function

        Public Shared Function ExecuteReader(ByVal Sql As String, ByVal conn As OracleConnection) As OracleDataReader
            Return ExecuteReader(Sql, conn, Nothing)
        End Function

        Public Shared Function ExecuteReader(ByVal Sql As String, ByVal conn As OracleConnection, ByVal trans As OracleTransaction) As OracleDataReader
            Dim command As New OracleCommand()
            Dim reader As OracleDataReader
            Dim LetClose As Boolean = False

            Try
                If trans IsNot Nothing And conn Is Nothing Then
                    conn = trans.Connection
                ElseIf conn Is Nothing Then
                    conn = GetConnection()
                    LetClose = True
                End If

                BuildCommand(command, conn, trans, CommandType.Text, Sql, Nothing)
                'reader = IIf(LetClose = True, command.ExecuteReader(CommandBehavior.CloseConnection), command.ExecuteReader())
                reader = command.ExecuteReader()
            Catch ex As ApplicationException
                'Throw ex
            Catch ex As OracleException
                'Throw New ApplicationException(GetExceptionMessage(ex), ex)
            Catch ex As Exception
                'Throw New ApplicationException(ErrorExecuteReader, ex)
            End Try

            Return reader
        End Function


        Public Shared Function ExecuteNonQuery(ByVal Sql As String) As Integer
            Return ExecuteNonQuery(Sql, Nothing, Nothing)
        End Function
        Public Shared Function ExecuteNonQuery(ByVal Sql As String, ByVal conn As OracleConnection) As Integer
            Return ExecuteNonQuery(Sql, conn, Nothing)
        End Function
        Public Shared Function ExecuteNonQuery(ByVal Sql As String, ByVal trans As OracleTransaction) As Integer
            Return ExecuteNonQuery(Sql, Nothing, trans)
        End Function
        Public Shared Function ExecuteNonQuery(ByVal Sql As String, ByVal conn As OracleConnection, ByVal trans As OracleTransaction) As Integer
            Dim retval As Integer = -1
            Dim command As New OracleCommand

            Try
                If trans Is Nothing Then
                    conn = New OracleConnection(ConnectionString)
                    BuildCommand(command, conn, trans, CommandType.Text, Sql, Nothing)
                    retval = command.ExecuteNonQuery
                Else
                    If trans IsNot Nothing And conn Is Nothing Then
                        conn = trans.Connection
                    End If

                    BuildCommand(command, trans.Connection, trans, CommandType.Text, Sql, Nothing)
                    retval = command.ExecuteNonQuery
                End If
            Catch ex As ApplicationException
                CreateErrorLog("ApplicationException " & ex.Message & vbNewLine & ex.StackTrace & vbNewLine & "SQL=" & Sql, "D:\ErrorLog\DBLog")
            Catch ex As OracleException
                CreateErrorLog("OracleException " & ex.Message & vbNewLine & ex.StackTrace & vbNewLine & "SQL=" & Sql, "D:\ErrorLog\DBLog")
            Catch ex As Exception
                CreateErrorLog("Exception " & ex.Message & vbNewLine & ex.StackTrace & vbNewLine & "SQL=" & Sql, "D:\ErrorLog\DBLog")
            End Try

            Return retval
        End Function

        Private Shared Sub BuildCommand(ByVal cmd As OracleCommand, ByVal conn As OracleConnection, ByVal trans As OracleTransaction, ByVal cmdType As CommandType, ByVal cmdText As String, ByVal cmdParms() As OracleParameter)
            If conn.State <> ConnectionState.Open Then
                Try
                    conn.Open()
                Catch ex As OracleException
                    Throw New ApplicationException(GetExceptionMessage(ex), ex)
                Catch ex As ApplicationException
                    Throw (ex)
                Catch ex As Exception
                    Throw New ApplicationException(ErrorConnection, ex)
                End Try
            End If

            Try
                cmd.Connection = conn
            Catch ex As Exception
                Throw New ApplicationException(ErrorSetCommandConnection, ex)
            End Try
            cmd.CommandText = cmdText

            If trans IsNot Nothing Then
                cmd.Transaction = trans
            End If

            Try
                cmd.CommandType = cmdType
                cmd.CommandTimeout = 120
            Catch ex As ArgumentException
                Throw New ApplicationException(ErrorInvalidCommandType, ex)
            End Try

            If cmdParms IsNot Nothing Then
                For Each parm As OracleParameter In cmdParms
                    Try
                        cmd.Parameters.Add(parm)
                    Catch ex As ArgumentNullException
                        Throw New ApplicationException(ErrorNullParameter, ex)
                    Catch ex As ArgumentException
                        Throw New ApplicationException(ErrorDuplicateParameter, ex)
                    End Try
                Next
            End If
        End Sub
    End Class
End Namespace

