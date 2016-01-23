Imports System
Imports System.Data.OracleClient

Namespace Utilities
    Public Class OracleTransactionDB
        Private _error As String = ""
        Private _conn As OracleConnection
        Private _trans As OracleTransaction


        Public ReadOnly Property ErrorMessage() As String
            Get
                Return _error
            End Get
        End Property

        Public ReadOnly Property conn() As OracleConnection
            Get
                Return _conn
            End Get
        End Property

        Public ReadOnly Property Trans() As OracleTransaction
            Get
                Return _trans
            End Get
        End Property

        ' <summary>
        ' Commit the SQL database transaction and close the connection to the database.
        ' </summary>
        ' <returns>Return true when process operation successfully, otherwise false.</returns>
        Public Function CommitTransaction() As Boolean
            Dim ret As Boolean = True
            Try
                If _trans IsNot Nothing Then _trans.Commit()
                If _conn IsNot Nothing Then _conn.Close()

            Catch ex As OracleException
                ret = False
                _error = ex.Message
            Catch
                ret = False
                _error = "errorCommitTransaction"
            End Try

            Return ret
        End Function


        ' <summary>
        ' Rolls back a transaction from a pending state and close the connection to the database.
        ' </summary>
        ' <returns>Return true when process operation successfully, otherwise false.</returns>
        Public Function RollbackTransaction() As Boolean
            Dim ret As Boolean = True
            Try
                If _trans IsNot Nothing Then _trans.Rollback()
                If _conn IsNot Nothing Then _conn.Close()
            Catch ex As OracleException
                ret = False
                _error = ex.Message
            Catch
                ret = False
                _error = "errorRollbackTransaction"
            End Try

            Return ret
        End Function

        Public Function CreateTransaction(ByVal _conn As OracleConnection) As Boolean
            Dim ret As Boolean = True
            Try
                _trans = _conn.BeginTransaction(System.Data.IsolationLevel.ReadCommitted)
            Catch ex As OracleException
                ret = False
                _error = ex.Message
            Catch
                ret = False
                _error = "errorCreateTransaction"
            End Try
            Return ret
        End Function
    End Class
End Namespace
