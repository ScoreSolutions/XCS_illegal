Imports LinqDB.Common.Utilities
Partial Public Class frmUpdateStaffInfo
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            If Request("UserName") IsNot Nothing Then
                Config.SaveLogTrans(Request("UserName"), Request, Session.SessionID, "คลิกเมนู อัพเดทรายชื่อเจ้าหน้าที่")
            End If
        End If
    End Sub

    
    Private Sub btnUpdate_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnUpdate.Click
        Try
            Dim sql As String = ""
            sql += " select per_id_ref, empid,idcard_no, per_type, title_code,title_name, first_name,last_name,"
            sql += " sex, birthdate,level_no,level_name,staff_level, per_id_ref,offcode,org_id1, org_code1,org_name1,org_short1,"
            sql += " org_id,org_code,org_name,org_short,poscode,poscode_admin, pos_name, posname_admin, dept_name "
            sql += " from p_staff "
            sql += " where idcard_no is not null"
            'sql += " where idcard_no='3860400036298'"

            Dim dt As DataTable = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then
                Dim sDt As DataTable = Config.ExcuteTable("select id,idcard_no from staff where idcard_no is not null")
                If sDt.Rows.Count = 0 Then
                    Config.SetAlert("เกิดความผิดพลาด ไม่พบข้อมูลเจ้าหน้าที่", Me, lblLoginHisID.ClientID)
                    Exit Sub
                End If

                Dim i As Integer = 0
                For Each dr As DataRow In dt.Rows
                    Dim iSql As String = ""
                    Try
                        sDt.DefaultView.RowFilter = "idcard_no='" & dr("idcard_no") & "'"
                        If sDt.DefaultView.Count > 0 Then
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
                        Else
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
                        End If
                        sDt.DefaultView.RowFilter = ""

                        Dim trans As New TransactionDB
                        If Config.ExcuteNonQuery(iSql, trans) = True Then
                            trans.CommitTransaction()
                        Else
                            trans.RollbackTransaction()
                        End If

                    Catch ex As Exception
                        DbConn.CreateErrorLog("Exception 1 : frmUpdateStaffInfo.aspx_btnUpdate_Click " & vbNewLine & ex.Message & vbNewLine & ex.StackTrace & vbNewLine & iSql, "D:\ErrorLog\WebAdminLog")
                    End Try
                    i += 1
                Next
            End If
            dt.Dispose()

            Config.SetAlert("Update Complete", Me, lblLoginHisID.ClientID)
        Catch ex As Exception
            DbConn.CreateErrorLog("Exception 2 : frmUpdateStaffInfo.aspx_btnUpdate_Click " & vbNewLine & ex.Message & vbNewLine & ex.StackTrace, "D:\ErrorLog\WebAdminLog")
        End Try
    End Sub
End Class