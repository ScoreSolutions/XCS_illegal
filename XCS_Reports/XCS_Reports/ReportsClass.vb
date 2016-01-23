Imports CrystalDecisions.CrystalReports.Engine
Imports CrystalDecisions.Shared
Imports System.Data
Imports LinqDB.Common.Utilities

Public Class ReportsClass
    Public Shared Function ThaiBaht(ByVal pAmount As Double) As String
        If pAmount = 0 Then
            Return "ศูนย์บาทถ้วน"
        End If
        Dim _integerValue As String ' จำนวนเต็ม     
        Dim _decimalValue As String ' ทศนิยม     
        Dim _integerTranslatedText As String ' จำนวนเต็ม ภาษาไทย     
        Dim _decimalTranslatedText As String ' ทศนิยมภาษาไทย     
        _integerValue = Format(pAmount, "####.00") ' จัด Format ค่าเงินเป็นตัวเลข 2 หลัก     
        _decimalValue = Mid(_integerValue, Len(_integerValue) - 1, 2) ' ทศนิยม     
        _integerValue = Mid(_integerValue, 1, Len(_integerValue) - 3) ' จำนวนเต็ม     ' แปลง จำนวนเต็ม เป็น ภาษาไทย     
        _integerTranslatedText = NumberToText(CDbl(_integerValue))     ' แปลง ทศนิยม เป็น ภาษาไทย     
        If CDbl(_decimalValue) <> 0 Then
            _decimalTranslatedText = NumberToText(CDbl(_decimalValue))
        Else : _decimalTranslatedText = ""
        End If     ' ถ้าไม่มีทศนิม     
        If _decimalTranslatedText.Trim = "" Then
            _integerTranslatedText += "บาทถ้วน"
        Else
            _integerTranslatedText += "บาท" & _decimalTranslatedText & "สตางค์"
        End If
        Return _integerTranslatedText
    End Function

    Private Shared Function NumberToText(ByVal pAmount As Double) As String
        ' ตัวอักษร   
        Dim _numberText() As String = {"", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า", "สิบ"}
        ' หลัก หน่วย สิบ ร้อย พัน ...   
        Dim _digit() As String = {"", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน"}
        Dim _value As String, _aWord As String, _text As String
        Dim _numberTranslatedText As String = ""
        Dim _length, _digitPosition As Integer
        _value = pAmount.ToString
        _length = Len(_value) ' ขนาดของ ข้อมูลที่ต้องการแปลง เช่น 122200 มีขนาด เท่ากับ 6   
        For i As Integer = 0 To _length - 1
            ' วนลูป เริ่มจาก 0 จนถึง (ขนาด - 1)       
            ' ตำแหน่งของ หลัก (digit) ของตัวเลข       ' เช่น       ' ตำแหน่งหลักที่0 (หลักหน่วย)       
            ' ตำแหน่งหลักที่1 (หลักสิบ)       ' ตำแหน่งหลักที่2 (หลักร้อย)       
            ' ถ้าเป็นข้อมูล i = 7 ตำแหน่งหลักจะเท่ากับ 1 (หลักสิบ)       
            ' ถ้าเป็นข้อมูล i = 9 ตำแหน่งหลักจะเท่ากับ 3 (หลักพัน)       
            ' ถ้าเป็นข้อมูล i = 13 ตำแหน่งหลักจะเท่ากับ 1 (หลักสิบ)       
            _digitPosition = i - (6 * ((i - 1) \ 6))
            _aWord = Mid(_value, Len(_value) - i, 1)
            _text = ""
            Select Case _digitPosition

                Case 0 ' หลักหน่วย              
                    If _aWord = "1" And _length > 1 Then                   ' ถ้าเป็นเลข 1 และมีขนาดมากกว่า 1 ให้มีค่าเท่ากับ "เอ็ด"                   
                        _text = "เอ็ด"
                    ElseIf _aWord <> "0" Then                   ' ถ้าไม่ใช่เลข 0 ให้หา ตัวอักษร ใน _numberText()                   
                        _text = _numberText(CInt(_aWord))
                    End If
                Case 1 ' หลักสิบ               
                    If _aWord = "1" Then                   ' ถ้าเป็นเลข 1 ไม่ต้องมี ตัวอักษร อื่นอีก นอกจากคำว่า "สิบ"                   '
                        _numberTranslatedText = "สิบ" & _numberTranslatedText
                        _text = _digit(_digitPosition)
                    ElseIf _aWord = "2" Then                   ' ถ้าเป็นเลข 2 ให้ตัวอักษรคือ "ยี่สิบ"                   
                        _text = "ยี่" & _digit(_digitPosition)
                    ElseIf _aWord <> "0" Then                   ' ถ้าไม่ใช่เลข 0 ให้หา ตัวอักษร ใน _numberText() และหาหลัก(digit) ใน _digit()                   
                        _text = _numberText(CInt(_aWord)) & _digit(_digitPosition)
                    End If
                Case 2, 3, 4, 5 ' หลักร้อย ถึง แสน               
                    If _aWord <> "0" Then
                        _text = _numberText(CInt(_aWord)) & _digit(_digitPosition)
                    End If
                Case 6 ' หลักล้าน               
                    If _aWord = "0" Then
                        _text = "ล้าน"
                    ElseIf _aWord = "1" And _length - 1 > i Then
                        _text = "เอ็ดล้าน"
                    Else
                        _text = _numberText(CInt(_aWord)) & _digit(_digitPosition)
                    End If
            End Select
            _numberTranslatedText = _text & _numberTranslatedText
        Next
        Return _numberTranslatedText
    End Function

    'Public Shared Sub SetReportParameter(ByVal vReportName As String, ByVal rpt As ReportDocument)
    '    If vReportName = "ILL_P035" Then




    '        rpt.SetParameterValue("TotalBathText", ThaiBaht(5000))
    '    End If
    'End Sub

    Public Shared Sub SetReportILL_P035(ByVal rpt As ReportDocument, ByVal getDivideNo As String)
        Dim sql As String = ""
        sql += "select sum(rda.duty_status01_money + rda.duty_status02_money + rda.duty_status03_money + rda.duty_status04_money + duty_status05_money) duty_sum"
        sql += " from reward_divide_alcohol rda"
        sql += " inner join reward_divide rd on rd.id=rda.reward_divide_id"
        sql += " inner join compare_case cc on cc.id=rd.compare_case_id"
        sql += " left join title ti on ti.title_code=rda.title_code"
        '        sql += "where rd.divide_no='LR0401015500010'"
        sql += " where rd.divide_no='" & getDivideNo & "'"

        Dim dt As New DataTable
        dt = OracleDB.ExecuteTable(sql)
        If dt.Rows.Count > 0 Then
            rpt.SetParameterValue("TotalBathText", ThaiBaht(Convert.ToDouble(dt.Rows(0)("DUTY_SUM"))))
            dt = Nothing
        End If
    End Sub

#Region "ILLR8210_1"
    Public Shared Sub SetReportILLR8210_1(ByVal rpt As ReportDocument, ByVal vDateFrom As String, ByVal vDateTo As String)
        Dim sumFineAlcohol As Double = GetSumILLR8210(1, vDateFrom, vDateTo, "", "", "")
        Dim sumFineTobaco As Double = GetSumILLR8210(2, vDateFrom, vDateTo, "", "", "")
        Dim sumFineCard As Double = GetSumILLR8210(3, vDateFrom, vDateTo, "", "", "")
        Dim sumFineTax As Double = GetSumILLR8210(4, vDateFrom, vDateTo, "", "", "")
        rpt.SetParameterValue("SumFineAlcohol", sumFineAlcohol)
        rpt.SetParameterValue("SumFineTobaco", sumFineTobaco)
        rpt.SetParameterValue("SumFineCard", sumFineCard)
        rpt.SetParameterValue("SumFineTax", sumFineTax)
    End Sub
    Private Shared Function GetSumILLR8210(ByVal LegislationID As String, ByVal DateFrom As String, ByVal DateTo As String, ByVal vOffcode1 As String, ByVal vOffcode2 As String, ByVal vOffcode3 As String) As Double
        Dim ret As Double = 0
        Dim sql As String = ""
        sql += " select sum(nvl(cc.case_total_fine,0)) case_total_fine " & vbNewLine
        sql += " from application_arrest aa " & vbNewLine
        sql += " inner join compare_case cc on cc.track_no=aa.track_no " & vbNewLine
        sql += " where substr(aa.offcode,1,2)||'0000'=nvl('" + vOffcode1 + "',substr(aa.offcode,1,2)||'0000') " & vbNewLine
        sql += " and substr(aa.offcode,1,4)||'00'=nvl('" + vOffcode2 + "',substr(aa.offcode,1,4)||'00') " & vbNewLine
        sql += " and aa.offcode=nvl('" + vOffcode3 + "',aa.offcode) " & vbNewLine
        sql += " and to_char(cc.pay_date,'yyyy-mm-dd') between '" + DateFrom + "' and '" + DateTo + "' " & vbNewLine
        sql += " and aa.legislation_id='" + LegislationID + "' " & vbNewLine

        Dim dt As New DataTable
        dt = OracleDB.ExecuteTable(sql)
        If dt.Rows.Count > 0 Then
            If Convert.IsDBNull(dt.Rows(0)("case_total_fine")) = False Then
                ret = Convert.ToDouble(dt.Rows(0)("case_total_fine"))
            End If
            dt = Nothing
        End If
        Return ret
    End Function
    '   private static double getSumILLR8210D(String vLigislationID, String dateFrom,String dateTo, String vOffcode1, String vOffcode2, String vOffcode3) throws Exception{
    '	double ret = 0d;
    '	DB db = new DB();
    '	try{
    '		ApplicationArrest aa = new ApplicationArrest(db);
    '		String sql = "";
    '		sql += " select sum(nvl(cc.case_total_fine,0)) case_total_fine \n";
    '		sql += " from application_arrest aa \n";
    '		sql += " inner join compare_case cc on cc.track_no=aa.track_no \n";
    '		sql += " where substr(aa.offcode,1,2)||'0000'=nvl('" + vOffcode1 + "',substr(aa.offcode,1,2)||'0000') \n";
    '		sql += " and substr(aa.offcode,1,4)||'00'=nvl('" + vOffcode2 + "',substr(aa.offcode,1,4)||'00') \n";
    '		sql += " and aa.offcode=nvl('" + vOffcode3 + "',aa.offcode) \n";
    '		sql += " and to_char(cc.pay_date,'yyyy-mm-dd') between '" + dateFrom + "' and '" + dateTo + "' \n";
    '		sql += " and aa.legislation_id='" + vLigislationID + "' \n";

    '		//System.out.println(sql);
    '		List<Map<String,Object>> list = aa.findBySql(sql);
    '		if(list != null){
    '			ret = new Double(list.get(0).get("case_total_fine").toString());
    '		}
    '	}catch(Exception e){
    '		//e.printStackTrace();
    '	}finally{
    '		db.closedb();
    '	}
    '	return ret;
    '}

    'public static String getSumILLR8210(String vLigislationID, String dateFrom,String dateTo, String vOffcode1, String vOffcode2, String vOffcode3) throws Exception{
    '	String ret = NumberUtil.getNumberFormat(getSumILLR8210D(vLigislationID, dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3),2,"");
    '	if (ret.equals(""))
    '		ret = "-";

    '	return ret; 
    '}
    'public static String getSumILLR8210All(String dateFrom,String dateTo, String vOffcode1, String vOffcode2, String vOffcode3) throws Exception{
    '	double ret = 0d;
    '	ret = getSumILLR8210D(ConfigUtil.getConfig("legislation_alcohol"), dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3) +
    '	      getSumILLR8210D(ConfigUtil.getConfig("legislation_tobacco"), dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3) +
    '	      getSumILLR8210D(ConfigUtil.getConfig("legislation_card"), dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3) +
    '	      getSumILLR8210D(ConfigUtil.getConfig("legislation_tax"), dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3);
    '	return NumberUtil.getNumberFormat(ret,2,"");
    '}
#End Region
    
End Class
