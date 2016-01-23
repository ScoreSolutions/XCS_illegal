Imports LinqDB.Common.Utilities
Partial Public Class frmDeleteCase
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            If Request("UserName") IsNot Nothing Then
                Config.SaveLogTrans(Request("UserName"), Request, Session.SessionID, "คลิกเมนู ลบข้อมูลคดี")
            End If
        End If
    End Sub

    Private Function CheckSendIncome(ByVal vTrackNo) As Boolean
        Dim ret As Boolean = False
        Dim sql As String = "select s.id"
        sql += " from send_income s"
        sql += " inner join send_income_case sc on sc.send_income_id=s.id"
        sql += " inner join compare_case c on c.id=sc.compare_case_id"
        sql += " where c.track_no='" & vTrackNo & "' and s.status<>'2'"

        Dim dt As New DataTable
        dt = Config.ExcuteTable(sql)
        If dt.Rows.Count > 0 Then
            ret = True
        End If
        dt.Dispose()

        Return ret
    End Function

    Private Sub btnDelete_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnDelete.Click
        If txtTrackNo.Text.Trim <> "" Then
            If CheckSendIncome(txtTrackNo.Text.Trim) = False Then
                If DeleteCaseByTrackNo(txtTrackNo.Text.Trim) = True Then
                    If Request("UserName") IsNot Nothing Then
                        Config.SaveLogTrans(Request("UserName"), Request, Session.SessionID, "ลบข้อมูลคดี เลขที่งาน " & txtTrackNo.Text.Trim)
                    End If
                    Config.SetAlert("ลบข้อมูลเรียบร้อย", Me, txtTrackNo.ClientID)
                Else
                    Config.SetAlert("เกิดข้อผิดพลาดระหว่างการลบข้อมูล", Me, txtTrackNo.ClientID)
                End If
            Else
                Config.SetAlert("คดีนี้ได้นำส่งเงินรายได้ไปแล้ว ไม่สามารถลบข้อมูลได้", Me, txtTrackNo.ClientID)
            End If
        End If
    End Sub


    Private Function DeleteCaseByTrackNo(ByVal vTrackNo As String) As Boolean
        Dim ret As Boolean = False
        Dim trans As New TransactionDB
        Try
            ret = Config.ExcuteNonQuery("delete from application_arrest_team where track_no='" & vTrackNo & "'", trans)
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from application_arrest_prove where track_no='" & vTrackNo & "'", trans)
            End If
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from application_arrest_lawbreaker where track_no='" & vTrackNo & "'", trans)
            End If
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from application_arrest_indictment where track_no='" & vTrackNo & "'", trans)
            End If
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from application_arrest_exhibit where track_no='" & vTrackNo & "'", trans)
            End If
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from APP_ARREST_PROVE_EXHIBIT where track_no='" & vTrackNo & "'", trans)
            End If
            If ret = True Then
                ret = DeleteCompareCase(vTrackNo, trans)
            End If
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from book_impeachment where track_no='" & vTrackNo & "'", trans)
            End If
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from tb_cube_report_2_55 where track_no='" & vTrackNo & "'", trans)
            End If
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from application_arrest where track_no='" & vTrackNo & "'", trans)
            End If
            If ret = True Then
                trans.CommitTransaction()
            Else
                trans.RollbackTransaction()
            End If
        Catch ex As Exception
            trans.RollbackTransaction()
            ret = False
            Config.SetAlert("Exception : " & ex.Message & ex.StackTrace, Me, txtTrackNo.ClientID)
        End Try
        Return ret
    End Function


    Private Function DeleteCompareCase(ByVal vTrackNo As String, ByVal trans As TransactionDB) As Boolean
        Dim ret As Boolean = False
        Dim cDt As New DataTable
        cDt = Config.ExcuteTable("select id from compare_case where track_no='" & vTrackNo & "'", trans)
        If cDt.Rows.Count > 0 Then
            Dim CompareCaseID As String = cDt.Rows(0)("id")
            Dim reReqDt As New DataTable
            reReqDt = Config.ExcuteTable("select id from APPLICATION_REWARD_REQUEST where COMPARE_CASE_ID='" & CompareCaseID & "'", trans)
            If reReqDt.Rows.Count > 0 Then
                Dim ReReqID As String = reReqDt.Rows(0)("id")
                ret = Config.ExcuteNonQuery("delete from application_reqard_req_alcohol where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'", trans)
                If ret = True Then
                    ret = Config.ExcuteNonQuery("delete from application_reqard_req_report where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'", trans)
                End If
                If ret = True Then
                    ret = Config.ExcuteNonQuery("delete from application_reqard_req_tax where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'", trans)
                End If
                If ret = True Then
                    ret = Config.ExcuteNonQuery("delete from application_reqard_req_team where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'", trans)
                End If
                If ret = True Then
                    Config.ExcuteNonQuery("delete from application_reqard_req_tobacco where APPLICATION_REWARD_REQUEST_ID = '" & ReReqID & "'", trans)
                End If

                If ret = True Then
                    ret = Config.ExcuteNonQuery("delete from APPLICATION_REWARD_REQUEST where id='" & ReReqID & "' ", trans)
                End If
            Else
                ret = True
            End If
            reReqDt.Dispose()

            If ret = True Then
                Dim AppReqApproveCompareDT As New DataTable
                AppReqApproveCompareDT = Config.ExcuteTable("select id from app_req_approve_compare where COMPARE_CASE_ID='" & CompareCaseID & "'", trans)
                If AppReqApproveCompareDT.Rows.Count > 0 Then
                    Dim AppReqApproveCompareID As String = AppReqApproveCompareDT.Rows(0)("id")
                    ret = Config.ExcuteNonQuery("delete from app_req_approve_compare_form1 where APP_REQ_APPROVE_COMPARE_ID='" & AppReqApproveCompareID & "'", trans)
                    If ret = True Then
                        ret = Config.ExcuteNonQuery("delete from app_req_approve_compare_form2 where APP_REQ_APPROVE_COMPARE_ID='" & AppReqApproveCompareID & "'", trans)
                    End If
                    If ret = True Then
                        Config.ExcuteNonQuery("delete from app_req_approve_compare_form3 where APP_REQ_APPROVE_COMPARE_ID='" & AppReqApproveCompareID & "'", trans)
                    End If
                    If ret = True Then
                        ret = Config.ExcuteNonQuery("delete from APP_REQ_APPROVE_COMPARE where id='" & AppReqApproveCompareID & "'", trans)
                    End If
                Else
                    ret = True
                End If
                AppReqApproveCompareDT.Dispose()
            End If
            
            If ret = True Then
                Dim CompareCaseChangeDT As New DataTable
                CompareCaseChangeDT = Config.ExcuteTable("select id from compare_case_change where compare_case_id='" & CompareCaseID & "'", trans)
                If CompareCaseChangeDT.Rows.Count > 0 Then
                    Dim ComCaseChangeID As String = CompareCaseChangeDT.Rows(0)("id")
                    ret = Config.ExcuteNonQuery("delete from compare_case_change_item where COMPARE_CASE_CHANGE_ID='" & ComCaseChangeID & "'", trans)
                    If ret = True Then
                        ret = Config.ExcuteNonQuery("delete from compare_case_change where id='" & ComCaseChangeID & "'", trans)
                    End If
                Else
                    ret = True
                End If
                CompareCaseChangeDT = Nothing
            End If
            
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from invoice2 where compare_case_id='" & CompareCaseID & "'", trans)
            End If

            If ret = True Then
                Dim RewDivDT As New DataTable
                RewDivDT = Config.ExcuteTable("select id from reward_divide where compare_case_id='" & CompareCaseID & "'", trans)
                If RewDivDT.Rows.Count > 0 Then
                    Dim RewardDivideID As String = RewDivDT.Rows(0)("id")
                    ret = Config.ExcuteNonQuery("delete from reward_divide_alcohol where reward_divide_id='" & RewardDivideID & "'", trans)
                    If ret = True Then
                        ret = Config.ExcuteNonQuery("delete from reward_divide_tax where reward_divide_id='" & RewardDivideID & "'", trans)
                    End If
                    If ret = True Then
                        ret = Config.ExcuteNonQuery("delete from reward_divide where id='" & RewardDivideID & "'", trans)
                    End If
                Else
                    ret = True
                End If
                RewDivDT = Nothing
            End If

            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from send_income_case where compare_case_id='" & CompareCaseID & "'", trans)
            End If
            If ret = True Then
                ret = Config.ExcuteNonQuery("delete from compare_case where id='" & CompareCaseID & "'", trans)
            End If
        Else
            ret = True
        End If
        cDt = Nothing

        Return ret
    End Function
End Class