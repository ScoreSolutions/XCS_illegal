Namespace BBL
    Public Class Report_ILLR8313_BBL
        Public Function GetReportILLR8313(ByVal DateFrom As String, ByVal DateTo As String, ByVal LegislationID As Long, ByVal getOffcode As String) As DataTable

            Dim ret As New DataTable
            Dim sql As String = "select si.offcode_write, ed.offname, si.send_no, " & vbNewLine
            sql += " RANK () OVER (PARTITION BY si.send_no ORDER BY sic.id) seq_no," & vbNewLine
            sql += " si.send_date,si.send_doc_no, lg.legislation_name, lg.id legislation_id," & vbNewLine
            sql += " aal.book_no || '/' || aal.inv_no inv_no, " & vbNewLine
            sql += " cc.case_total_fine, cc.birbe_money, cc.reward_money, cc.treasury_money" & vbNewLine
            sql += " from send_income si" & vbNewLine
            sql += " inner join send_income_case sic on sic.send_income_id=si.id" & vbNewLine
            sql += " inner join legislation lg on lg.id=si.legislation_id" & vbNewLine
            sql += " inner join compare_case cc on cc.id=sic.compare_case_id" & vbNewLine
            sql += " inner join application_arrest_lawbreaker aal on aal.track_no=cc.track_no" & vbNewLine
            sql += " inner join ed_office ed on ed.offcode=si.offcode_write " & vbNewLine
            sql += " where  si.status='1'" & vbNewLine
            sql += " and to_char(si.send_date,'yyyymmdd') between '" & DateFrom & "' and '" & DateTo & "'   " & vbNewLine
            'sql += " and substr(si.offcode_write,1,2) || '0000' = nvl('" & Offcode1 & "',substr(si.offcode_write,1,2) || '0000')"
            'sql += " and substr(si.offcode_write,1,4) || '00' = nvl('" & Offcode2 & "',substr(si.offcode_write,1,4)||'00')"
            sql += " and si.offcode_write=nvl('" & getOffcode & "',si.offcode_write)"

            If LegislationID <> 0 Then
                sql += " and lg.id='" & LegislationID & "'" & vbNewLine
            End If
            sql += " order by si.offcode_write,lg.id, si.send_date, si.send_no,to_number(aal.book_no), to_number(aal.inv_no)" & vbNewLine

            ret = LinqDB.Common.Utilities.OracleDB.ExecuteTable(sql)

            Return ret
        End Function
    End Class
End Namespace

