Imports System.IO
Namespace BBL
    Public Class Report_ILLR8314_BBL
        Public Function GetReportILLR8314(ByVal getOffcode As String, ByVal UserID As String, ByVal WhText As String, ByVal CaseDateFrom As DateTime, ByVal CaseDateTo As DateTime) As DataTable
            Dim ret As New DataTable

            Dim sql As String = File.ReadAllText(System.Web.HttpContext.Current.Server.MapPath("BBL/QueryILLR8314.txt"))
            sql += " order by bb.occurrence_date,bb.grpid,bb.offcode " & vbNewLine
            sql = sql.Replace("{?getOffcode}", getOffcode)
            sql = sql.Replace("{?getUserID}", UserID)
            sql = sql.Replace("{?DateFrom}", CaseDateFrom.Day)
            sql = sql.Replace("{?MonthFrom}", CaseDateFrom.ToString("MMMM", New Globalization.CultureInfo("th-TH")))
            sql = sql.Replace("{?YearFrom}", CaseDateFrom.ToString("yyyy", New Globalization.CultureInfo("th-TH")))
            sql = sql.Replace("{?DateTo}", CaseDateTo.Day)
            sql = sql.Replace("{?MonthTo}", CaseDateTo.ToString("MMMM", New Globalization.CultureInfo("th-TH")))
            sql = sql.Replace("{?YearTo}", CaseDateTo.ToString("yyyy", New Globalization.CultureInfo("th-TH")))



            sql = sql.Replace("###", WhText)
            ret = LinqDB.Common.Utilities.OracleDB.ExecuteTable(sql)
            Return ret
        End Function
    End Class
End Namespace
