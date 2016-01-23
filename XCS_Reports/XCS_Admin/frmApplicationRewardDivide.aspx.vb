Public Partial Class frmApplicationRewardDivide
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            ucRewardDivideAlcohol1.Visible = False
            ucRewardDivideTax1.Visible = False

            If Request("UserName") IsNot Nothing Then
                Config.SaveLogTrans(Request("UserName"), Request, Session.SessionID, "คลิกเมนู แก้ไขข้อมูลแบ่งเงินสินบนและรางวัล")
            End If
        End If
    End Sub

    Private Sub ClearForm()
        txtDivideNo.Text = ""
        lblLoginHisID.Text = "0"
        lblLegislationID.Text = "0"
        lblRewardDivideID.Text = "0"
        txtDivideDate.ClearDate()
        txtReceiveDate.ClearDate()
        lblCompareCaseNo.Text = ""
        lblCompareCaseDate.Text = ""

        lblLegislationName.Text = ""
        lblOffname.Text = ""
        lblCaseTotalFine.Text = ""
        lblBribeMoney.Text = ""
        lblRewardMoney.Text = ""
        lblTreasuryMoney.Text = ""

        lblAccuserName.Text = ""
        lblLawbreakerName.Text = ""

        ucRewardDivideAlcohol1.ClearForm()
        ucRewardDivideTax1.ClearForm()

        ucRewardDivideAlcohol1.Visible = False
        ucRewardDivideTax1.Visible = False
    End Sub

    Private Sub FillInData()
        Dim dt As DataTable = GetRewardDivideData()
        If dt.Rows.Count > 0 Then
            Dim dr As DataRow = dt.Rows(0)
            lblRewardDivideID.Text = dr("id")
            txtDivideDate.DateValue = Convert.ToDateTime(dr("divide_date"))
            txtReceiveDate.DateValue = Convert.ToDateTime(dr("receive_date"))
            lblCompareCaseNo.Text = dr("compare_case_no")
            lblCompareCaseDate.Text = Convert.ToDateTime(dr("compare_case_date")).ToString("dd/MM/yyyy", New Globalization.CultureInfo("th-TH"))
            lblLegislationID.Text = dr("legislation_id")
            lblLegislationName.Text = dr("legislation_name")
            lblOffname.Text = dr("offname")
            lblCaseTotalFine.Text = dr("fine_money")
            lblBribeMoney.Text = dr("birbe_money")
            lblRewardMoney.Text = dr("reward_money")
            lblTreasuryMoney.Text = dr("treasury_money")
            lblAccuserName.Text = dr("accuser_name")
            lblLawbreakerName.Text = dr("lawbreaker_name")
            If IsDBNull(dr("remarks")) = False Then txtRemark.Text = dr("remarks")

            If lblLegislationID.Text = "1" Then
                ucRewardDivideAlcohol1.Visible = True
                ucRewardDivideAlcohol1.FillInData(lblRewardDivideID.Text, Convert.ToDouble(dr("reward_money")))
            ElseIf lblLegislationID.Text = "4" Then
                ucRewardDivideTax1.Visible = True
                ucRewardDivideTax1.FillInData(lblRewardDivideID.Text, Convert.ToDouble(dr("reward_money")))
            End If
        End If
        dt.Dispose()
    End Sub
    Private Function GetRewardDivideData() As DataTable
        Dim sql As String = " select  rd.id  id, rd.divide_no, ed.offname, " & vbNewLine
        sql += " aa.legislation_id, lg.legislation_name, cc.compare_case_no,cc.compare_case_date, " & vbNewLine
        sql += " rd.divide_date, rd.receive_date, pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name, " & vbNewLine
        sql += " tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, " & vbNewLine
        sql += " nvl(cc.birbe_money,0) birbe_money, nvl(cc.reward_money,0) reward_money, nvl(cc.treasury_money,0) treasury_money, " & vbNewLine
        sql += " nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0) fine_money,rd.remarks " & vbNewLine
        sql += " from compare_case cc  " & vbNewLine
        sql += " left join reward_divide rd on cc.id=rd.compare_case_id " & vbNewLine
        sql += " inner join application_arrest aa on aa.track_no=cc.track_no " & vbNewLine
        sql += " left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno " & vbNewLine
        sql += " left join title tia on tia.title_code=sta.title_code " & vbNewLine
        sql += " inner join ed_office ed on ed.offcode=cc.compare_office " & vbNewLine
        sql += " inner join legislation lg on lg.id=aa.legislation_id " & vbNewLine
        sql += " where rd.divide_no='" & txtDivideNo.Text.Trim & "'"
        Dim dt As DataTable = Config.ExcuteTable(sql)
        Return dt
    End Function

    Private Sub btnSearchData_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSearchData.Click
        If txtDivideNo.Text.Trim <> "" Then
            Dim vRequestNo As String = txtDivideNo.Text.Trim
            ClearForm()

            txtDivideNo.Text = vRequestNo
            FillInData()
        End If
    End Sub

    Private Sub btnSave_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnSave.Click
        If Request("UserName") IsNot Nothing And Request("UserIDCard") IsNot Nothing Then
            Save(Request("UserIDCard"))
        Else
            Save("1111111111111")
        End If
    End Sub
    Private Sub Save(ByVal UserIDCard As String)
        If SaveValidate() = True Then
            Dim sql As String = "select id from reward_divide where divide_no='" & txtDivideNo.Text.Trim & "'"
            Dim dt As DataTable = Config.ExcuteTable(sql)
            If dt.Rows.Count > 0 Then

                Dim vDivideDate As String = txtDivideDate.DateValue.ToString("yyyy-MM-dd", New Globalization.CultureInfo("en-US")) & " 00:00:00"
                Dim vReceiveDate As String = txtReceiveDate.DateValue.ToString("yyyy-MM-dd", New Globalization.CultureInfo("en-US")) & " 00:00:00"

                Dim trans As New LinqDB.Common.Utilities.TransactionDB
                sql = "update reward_divide " & vbNewLine
                sql += " set divide_date = to_date('" & vDivideDate & "','yyyy-mm-dd hh24:mi:ss')" & vbNewLine
                sql += ", receive_date = to_date('" & vReceiveDate & "','yyyy-mm-dd hh24:mi:ss')" & vbNewLine
                sql += ", remarks = " & IIf(txtRemark.Text.Trim = "", "null", "'" & txtRemark.Text & "'") & vbNewLine
                sql += " where id='" & lblRewardDivideID.Text & "'"
                Dim ret As Boolean = Config.ExcuteNonQuery(sql, trans)
                If ret = True Then
                    If lblLegislationID.Text = "1" Then
                        ret = ucRewardDivideAlcohol1.SaveAppRewardDivideAlcohl(UserIDCard, trans)
                    ElseIf lblLegislationID.Text = "4" Then
                        ret = ucRewardDivideTax1.SaveAppRewardDivideTax(UserIDCard, trans)
                    End If

                    If ret = True Then
                        trans.CommitTransaction()
                        Config.SetAlert("บันทึกข้อมูลเรียบร้อย", Me, txtDivideNo.ClientID)
                        FillInData()
                    Else
                        trans.RollbackTransaction()
                    End If
                Else
                    trans.RollbackTransaction()
                End If
            End If
            dt.Dispose()
        End If
    End Sub

    Private Function SaveValidate() As Boolean
        If txtDivideDate.TxtBox.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุวันที่แบ่งเงินรางวัล", Me.Page, txtDivideDate.ClientID)
            Return False
        End If
        If txtReceiveDate.TxtBox.Text.Trim = "" Then
            Config.SetAlert("กรุณาระบุวันที่รับเงินรางวัล", Me.Page, txtReceiveDate.ClientID)
            Return False
        End If

        If lblLegislationID.Text = "1" Then
            If ucRewardDivideAlcohol1.SaveValidate = False Then
                Return False
            End If
        ElseIf lblLegislationID.Text = "4" Then
            If ucRewardDivideTax1.SaveValidate = False Then
                Return False
            End If
        End If
        
        Return True
    End Function
End Class