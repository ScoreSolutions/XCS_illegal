Imports CrystalDecisions.CrystalReports.Engine
Imports CrystalDecisions.Shared
Imports LinqDB.Common.Utilities
Imports System.IO

Partial Public Class _Default
    Inherits System.Web.UI.Page

    Private Sub PrintReport(ByVal reportName As String)
        'Dim debug As String = ""
        'DbConn.Errorlog("PrintReport :" & reportName)


        'debug += "1"
        Try
            Dim rpt As New ReportDocument
            Dim tbLogOn As New TableLogOnInfo
            tbLogOn.ConnectionInfo.ServerName = DbConn.DataSource
            tbLogOn.ConnectionInfo.UserID = DbConn.DbUserID
            tbLogOn.ConnectionInfo.Password = DbConn.DbPwd
            'debug += "2"
            'DbConn.Errorlog("Debug :" & debug)
            If DbConn.ChkConnection = True Then
                'DbConn.Errorlog("ChkConnection OK :" & reportName)
                If File.Exists(Server.MapPath(Constant.HomeFolder & "/FormReports/" & reportName & ".rpt")) = True Then
                    rpt.Load(Server.MapPath(Constant.HomeFolder & "/FormReports/" & reportName & ".rpt"))
                    rpt.Database.Tables(0).ApplyLogOnInfo(tbLogOn)

                    'DbConn.Errorlog("Load File OK :" & reportName)

                    If reportName <> "ILLR8314" Then
                        Dim Param() As String = Request.QueryString.AllKeys
                        Dim curValue As New ParameterValues
                        Dim paraValue As New ParameterDiscreteValue
                        For i As Integer = 1 To Param.Length - 1   'Parameter ตัวแรกคือ ReportName ไม่ต้องนับอยู่แล้ว  และ Parameter ตัวสุดท้ายคือ vReportType
                            If Param(i) <> "cmd" And Param(i) <> "page" And Param(i) <> "vReportType" And Param(i) <> "time" Then
                                Try
                                    Dim pName As String = Param(i)
                                    Dim pValue As String = Request(pName)
                                    paraValue.Value = pValue
                                    curValue = rpt.ParameterFields(pName).CurrentValues
                                    curValue.Add(paraValue)
                                    rpt.ParameterFields(pName).CurrentValues = curValue
                                Catch ex As Exception
                                    Config.SetAlert(ex.Message, Me)
                                End Try
                            End If
                        Next
                    End If

                    'CrystalReportViewer1.ReportSource = rpt
                    If Request("vReportType") IsNot Nothing Then
                        If reportName = "TrainingReport" Then
                            rpt.SetParameterValue("TmbFor", "ABC1234กขค4567")
                        ElseIf reportName = "ILL_P035" Then
                            ReportsClass.SetReportILL_P035(rpt, Request("getDivideNo"))
                        ElseIf reportName = "ILLR8210_1" Then
                            Dim vDateFrom As Date = GetDateFromString(Request("vDatefrom"))
                            Dim vDateTo As Date = GetDateFromString(Request("vDateto"))
                            rpt.SetParameterValue("DisplayDateFrom", vDateFrom.ToString("d MMMM yyyy", New Globalization.CultureInfo("th-TH")))
                            rpt.SetParameterValue("DisplayDateTo", vDateTo.ToString("d MMMM yyyy", New Globalization.CultureInfo("th-TH")))
                            ReportsClass.SetReportILLR8210_1(rpt, Request("vDatefrom"), Request("vDateto"))
                        ElseIf reportName = "ILLR8314" Then
                            Dim dt As New DataTable
                            Dim eng As New BBL.Report_ILLR8314_BBL
                            Dim CaseDateFrom As DateTime = Config.cStrToDate2(Request("getDatefrom"))
                            Dim CaseDateTo As DateTime = Config.cStrToDate2(Request("getDateto"))

                            dt = eng.GetReportILLR8314(Request("getOffcode"), Request("UserID"), Request("whText"), CaseDateFrom, CaseDateTo)
                            rpt.SetDataSource(dt)
                            dt.Dispose()
                        End If

                        CreateReport(Request("vReportType"), rpt, reportName)
                    Else

                        CrystalReportViewer1.ReportSource = rpt
                    End If
                Else
                    Config.SetAlert("Report not found", Me)
                End If
            Else
                'TextBox1.Text = "Connection Fail!!!" & "  $$$$ " & DbConn.ChkConnection
                Config.SetAlert("Connection Fail!!!", Me)
            End If

            rpt.Close()
            rpt.Dispose()
            rpt = Nothing
        Catch ex As Exception
            DbConn.CreateErrorLog("Print Report exception : " & ex.Message & vbNewLine & ex.StackTrace, "D:\ErrorLog\WebReportLog")
        End Try
    End Sub

    Private Function GetDateFromString(ByVal vDate As String) As Date
        'vDate Format yyyy-MM-dd
        Dim ret As New Date
        Dim strDate() As String = Split(vDate, "-")
        Dim dd As Integer = strDate(2)
        Dim mm As Integer = strDate(1)
        Dim yy As Integer = strDate(0)

        ret = New Date(yy, mm, dd)
        Return ret
    End Function



    'Private Sub CreateReport(ByVal vReportType As String, ByVal rpt As ReportDocument, ByVal reportName As String)
    '    Try
    '        If vReportType <> "CRYSTAL" Then
    '            With System.Web.HttpContext.Current.Response
    '                .Buffer = False
    '                .ClearContent()
    '                .ClearHeaders()

    '                If vReportType = "PDF" Then
    '                    rpt.ExportToHttpResponse(ExportFormatType.PortableDocFormat, Response, True, reportName)
    '                ElseIf vReportType = "EXCEL" Then
    '                    rpt.ExportToHttpResponse(ExportFormatType.Excel, Response, True, reportName)
    '                End If
    '            End With
    '        End If

    '    Catch ex As Exception
    '        DbConn.CreateErrorLog("CreateReport Exception : " & ex.Message & vbNewLine & ex.StackTrace, "D:\ErrorLog\WebReportLog")
    '    End Try

    'End Sub

    Private Sub CreateReport(ByVal vReportType As String, ByVal rpt As ReportDocument, ByVal reportName As String)
        If vReportType <> "CRYSTAL" Then
            Dim s As System.IO.MemoryStream
            With System.Web.HttpContext.Current.Response
                .ClearContent()
                .ClearHeaders()
                If vReportType = "PDF" Then
                    s = rpt.ExportToStream(ExportFormatType.PortableDocFormat)
                    .ContentType = "application/pdf"
                    .AddHeader("Content-Disposition", "inline; filename=" & reportName & ".pdf")
                ElseIf vReportType = "EXCEL" Then
                    s = rpt.ExportToStream(ExportFormatType.Excel)
                    '                    .ContentType = "application/vnd.ms-excel"
                    .ContentType = "application/msexcel"
                    .AddHeader("Content-Disposition", "inline; filename=" & reportName & ".xls")
                ElseIf vReportType = "WORD" Then
                    s = rpt.ExportToStream(ExportFormatType.WordForWindows)
                    .ContentType = "application/msword"
                    .AddHeader("Content-Disposition", "inline; filename=" & reportName & ".doc")
                End If
                .BinaryWrite(s.ToArray)
                .End()
            End With
        End If
    End Sub


    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If Request IsNot Nothing Then
            If Request("ReportName") IsNot Nothing Then
                If Request("ReportName") = "ILLR8313" Then
                    Response.Redirect("frmReportPreview.aspx?ReportName=ILLR8313&DateFrom=" & Request("getDatefrom") & "&DateTo=" & Request("getDateto") & "&getOffcode=" & Request("getOffcode") & "&IDCardNO=" & Request("getUserID"))
                Else
                    PrintReport(Request("ReportName"))
                End If
            End If
        End If
    End Sub

    Private Sub CrystalReportViewer1_Unload(ByVal sender As Object, ByVal e As System.EventArgs) Handles CrystalReportViewer1.Unload
        CrystalReportViewer1.ReportSource = Nothing
        CrystalReportViewer1.Dispose()
        GC.Collect()
        GC.WaitForPendingFinalizers()
    End Sub

End Class