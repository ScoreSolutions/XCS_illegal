Imports LinqDB.Common.Utilities
Imports System.IO
Imports iTextSharp.text
Imports iTextSharp.text.pdf
Imports iTextSharp.text.html
Imports iTextSharp.text.html.simpleparser


Partial Public Class frmReportPreview
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If IsPostBack = False Then
            If Request("ReportName") = "ILLR8313" Then
                RenderReportILLR8313()
            ElseIf Request("ILLR8314") Then
                RenderReportILLR8314()
            End If
        End If
    End Sub

    Private Sub RenderReportILLR8314()

    End Sub

    Private Sub RenderReportILLR8313()
        Dim getOffcode As String = Request("getOffcode")
        
        If getOffcode Is Nothing Then
            getOffcode = ""
        End If

        Dim bbl As New BBL.Report_ILLR8313_BBL
        Dim dt As DataTable = bbl.GetReportILLR8313(Request("DateFrom"), Request("DateTo"), Request("LegislationID"), getOffcode)
        If dt.Rows.Count > 0 Then
            Dim oSql As String = "select offname from ed_office"
            If getOffcode.Trim <> "" Then
                oSql += " where offcode='" & getOffcode & "'"
            End If

            Dim OffDT As DataTable = OracleDB.ExecuteTable(oSql)


            Dim ret As New StringBuilder
            ret.Append("<table border='0' cellpadding='0' cellspacing='0' width='100%'  >")
            ret.Append("    <tr>")
            ret.Append("        <td  align='left'>")
            ret.Append("            " & DateTime.Now.ToString("dd MMMM yyyy HH:mm:ss", New Globalization.CultureInfo("th-TH")))
            ret.Append("        </td>")
            ret.Append("        <td  align='right'>")
            ret.Append("            Report ID: 3.13 (ILLR8313)")
            ret.Append("        </td>")
            ret.Append("    </tr>")
            ret.Append("    <tr>")
            ret.Append("        <td class='report_header' colspan='2'>")
            ret.Append("            รายงานสรุปเงินส่งคลัง " & OffDT.Rows(0)("offname") & "<br />")
            ret.Append("            วันที่นำส่งเงินระหว่าง " & Config.cStrToDate(Request("DateFrom")).ToString("d MMMM yyyy", New Globalization.CultureInfo("th-TH")) & " ถึง " & Config.cStrToDate(Request("DateTo")).ToString("d MMMM yyyy", New Globalization.CultureInfo("th-TH")))
            ret.Append("        </td>")
            ret.Append("    </tr>")
            ret.Append("    <tr>")
            ret.Append("        <td colspan='2'>")
            ret.Append("            <table border='1' cellpadding='0' cellspacing='0' class='mGrid' >")
            'Header Row
            ret.Append("                <tr style='background:#D3D3D3 repeat-x top;font-weight: bold;color: #ffffff;' >")
            ret.Append("                    <td  align='center' >พื้นที่</td>")
            ret.Append("                    <td  align='center' style='width:60px' >ลำดับที่</td>")
            ret.Append("                    <td  align='center' style='width:80px' >วันที่</td>")
            ret.Append("                    <td  align='center' style='width:120px' >เลขที่ กค.</td>")
            ret.Append("                    <td  align='center' >พรบ.</td>")
            ret.Append("                    <td  align='center' >เลขที่ใบเสร็จ</td>")
            ret.Append("                    <td  align='center' >ค่าปรับ</td>")
            ret.Append("                    <td  align='center' >สินบน</td>")
            ret.Append("                    <td  align='center' >รางวัล</td>")
            ret.Append("                    <td  align='center' >ส่งคลัง</td>")
            ret.Append("                </tr>")

            Dim sumFine As Double = 0
            Dim sumBirbe As Double = 0
            Dim sumReward As Double = 0
            Dim sumTreasury As Double = 0

            Dim oDt As New DataTable
            oDt = dt.DefaultView.ToTable(True, "offcode_write", "offname").Copy
            If oDt.Rows.Count > 0 Then
                For Each oDr As DataRow In oDt.Rows
                    Dim toFine As Double = 0
                    Dim toBirbe As Double = 0
                    Dim toReward As Double = 0
                    Dim toTreasury As Double = 0

                    dt.DefaultView.RowFilter = "offcode_write='" & oDr("offcode_write") & "'"

                    Dim lDt As New DataTable
                    lDt = dt.DefaultView.ToTable(True, "legislation_id", "legislation_name").Copy
                    If lDt.Rows.Count > 0 Then
                        For Each lDr As DataRow In lDt.Rows
                            dt.DefaultView.RowFilter = "offcode_write='" & oDr("offcode_write") & "' and legislation_id='" & lDr("legislation_id") & "'"

                            Dim sDt As New DataTable
                            sDt = dt.DefaultView.ToTable(True, "offcode_write", "offname", "legislation_name", "send_no", "send_doc_no", "send_date").Copy
                            Dim i As Integer = 1
                            Dim tlFine As Double = 0
                            Dim tlBirbe As Double = 0
                            Dim tlReward As Double = 0
                            Dim tlTreasury As Double = 0

                            For Each sDr As DataRow In sDt.Rows
                                dt.DefaultView.RowFilter = "offcode_write='" & oDr("offcode_write") & "' and legislation_id='" & lDr("legislation_id") & "' and send_no='" & sDr("send_no") & "'"
                                Dim InvNo As String = ""
                                Dim CaseFine As Double = 0
                                Dim BirbeMoney As Double = 0
                                Dim RewardMoney As Double = 0
                                Dim TreasuryMoney As Double = 0

                                Dim InvDt As New DataTable
                                InvDt = dt.DefaultView.ToTable.Copy
                                For Each InvDr As DataRow In InvDt.Rows
                                    If InvNo.Trim = "" Then
                                        InvNo = InvDr("inv_no")
                                        CaseFine = Convert.ToDouble(InvDr("case_total_fine"))
                                        BirbeMoney = Convert.ToDouble(InvDr("birbe_money"))
                                        RewardMoney = Convert.ToDouble(InvDr("reward_money"))
                                        TreasuryMoney = Convert.ToDouble(InvDr("treasury_money"))
                                    Else
                                        InvNo += "<br />" & InvDr("inv_no")
                                        CaseFine += Convert.ToDouble(InvDr("case_total_fine"))
                                        BirbeMoney += Convert.ToDouble(InvDr("birbe_money"))
                                        RewardMoney += Convert.ToDouble(InvDr("reward_money"))
                                        TreasuryMoney += Convert.ToDouble(InvDr("treasury_money"))
                                    End If
                                Next
                                InvDt.Dispose()



                                ret.Append("            <tr>")
                                ret.Append("                <td align='left' valign='top'>&nbsp;" & oDr("offname") & "</td>")
                                ret.Append("                <td align='left' valign='top'>&nbsp;" & i & "</td>")
                                ret.Append("                <td align='left' valign='top'>&nbsp;" & Convert.ToDateTime(sDr("send_date")).ToString("dd/MM/yyyy", New System.Globalization.CultureInfo("th-TH")) & "</td>")
                                ret.Append("                <td align='left' valign='top'>&nbsp;" & sDr("send_doc_no") & "</td>")
                                ret.Append("                <td align='right' valign='top' >" & lDr("legislation_name") & "</td>")
                                ret.Append("                <td align='right' valign='top' >" & InvNo & "</td>")
                                ret.Append("                <td align='right' valign='top' >" & Format(CaseFine, "#,##0.00") & "</td>")
                                ret.Append("                <td align='right' valign='top' >" & Format(BirbeMoney, "#,##0.00") & "</td>")
                                ret.Append("                <td align='right' valign='top' >" & Format(RewardMoney, "#,##0.00") & "</td>")
                                ret.Append("                <td align='right' valign='top' >" & Format(TreasuryMoney, "#,##0.00") & "</td>")
                                ret.Append("            </tr>")
                                i += 1

                                tlFine += CaseFine
                                tlBirbe += BirbeMoney
                                tlReward += RewardMoney
                                tlTreasury += TreasuryMoney

                                dt.DefaultView.RowFilter = ""
                            Next
                            sDt.Dispose()
                            dt.DefaultView.RowFilter = ""


                            ret.Append("            <tr style='font-weight: bold;'>")
                            ret.Append("                <td align='right' colspan='6'  >&nbsp;รวม " & lDr("legislation_name") & "</td>")
                            ret.Append("                <td align='right' >" & Format(tlFine, "#,##0.00") & "</td>")
                            ret.Append("                <td align='right' >" & Format(tlBirbe, "#,##0.00") & "</td>")
                            ret.Append("                <td align='right' >" & Format(tlReward, "#,##0.00") & "</td>")
                            ret.Append("                <td align='right' >" & Format(tlTreasury, "#,##0.00") & "</td>")
                            ret.Append("            </tr>")

                            toFine += tlFine
                            toBirbe += tlBirbe
                            toReward += tlReward
                            toTreasury += tlTreasury
                        Next
                    End If
                    lDt.Dispose()
                    dt.DefaultView.RowFilter = ""

                    ret.Append("            <tr style='font-weight: bold;'>")
                    ret.Append("                <td align='right' colspan='6'  >&nbsp;รวมพื้นที่ " & oDr("offname") & "</td>")
                    ret.Append("                <td align='right' >" & Format(toFine, "#,##0.00") & "</td>")
                    ret.Append("                <td align='right' >" & Format(toBirbe, "#,##0.00") & "</td>")
                    ret.Append("                <td align='right' >" & Format(toReward, "#,##0.00") & "</td>")
                    ret.Append("                <td align='right' >" & Format(toTreasury, "#,##0.00") & "</td>")
                    ret.Append("            </tr>")

                    sumFine += toFine
                    sumBirbe += toBirbe
                    sumReward += toReward
                    sumTreasury += toTreasury
                Next
            End If
            oDt.Dispose()

            ret.Append("                <tr style='font-weight: bold;'>")
            ret.Append("                    <td align='right' colspan='6'  >&nbsp;รวมทั้งหมด</td>")
            ret.Append("                    <td align='right' >" & Format(sumFine, "#,##0.00") & "</td>")
            ret.Append("                    <td align='right' >" & Format(sumBirbe, "#,##0.00") & "</td>")
            ret.Append("                    <td align='right' >" & Format(sumReward, "#,##0.00") & "</td>")
            ret.Append("                    <td align='right' >" & Format(sumTreasury, "#,##0.00") & "</td>")
            ret.Append("                </tr>")
            ret.Append("            </table>")
            ret.Append("        </td>")
            ret.Append("    </tr>")
            ret.Append("    <tr><td colspan='2'>&nbsp;</td></tr>")
            ret.Append("    <tr><td colspan='2'>&nbsp;</td></tr>")

            Dim uDt As New DataTable
            uDt = OracleDB.ExecuteTable("select title_name || first_name || ' ' || last_name full_name from staff where idcard_no='" & Request("IDCardNO") & "'")
            If uDt.Rows.Count > 0 Then
                ret.Append("    <tr>")
                ret.Append("        <td  align='left'>")
                ret.Append("            ผู้ใช้ : " & uDt.Rows(0)("full_name"))
                ret.Append("        </td>")
                ret.Append("    </tr>")
            End If
            uDt.Dispose()
            ret.Append("</table>")
            
            lblReportDesc.Text = ret.ToString
        End If
        dt.Dispose()

        If lblReportDesc.Text.Trim <> "" Then
            lblerror.Visible = False
        End If
    End Sub

    Private Sub btnExport_Click(ByVal sender As Object, ByVal e As System.EventArgs) Handles btnExport.Click
        Select Case DDexport.SelectedValue
            Case 0
                Exit Sub
            Case 1
                ExportData("application/vnd.xls", "ILLR8313.xls")
                Exit Select
            Case 2
                'ExportData("application/PDF", "FileName.PDF")
                ExportToPDF("ILLR8313.PDF")
                Exit Select
        End Select
    End Sub

    Private Sub ExportData(ByVal _contentType As String, ByVal fileName As String)
        Response.ClearContent()
        Response.Charset = "utf-8"
        Response.AddHeader("content-disposition", "attachment;filename=" + fileName)
        Response.Cache.SetCacheability(HttpCacheability.NoCache)
        Response.ContentType = _contentType
        Dim sw As New StringWriter()
        Dim htw As New HtmlTextWriter(sw)
        Dim frm As New HtmlForm()
        frm.Attributes("runat") = "server"
        frm.Controls.Add(lblReportDesc)
        lblReportDesc.RenderControl(htw)

        Response.Write(sw.ToString())
        Response.[End]()
    End Sub
    Private Sub ExportToPDF(ByVal FileName As String)
        Response.ClearContent()
        Response.ContentType = "application/pdf"
        Response.AddHeader("content-disposition", "attachment;filename=" & FileName)
        Response.Cache.SetCacheability(HttpCacheability.NoCache)
        Dim sw As New StringWriter()
        Dim htw As New HtmlTextWriter(sw)
        Dim frm As New HtmlForm()
        frm.Attributes("runat") = "server"
        frm.Controls.Add(lblReportDesc)
        lblReportDesc.RenderControl(htw)

        Dim sr As New StringReader(sw.ToString())
        Dim pdfDoc As New Document(PageSize.A4, 0, 0, 0, 0)
        Dim htmlparser As New HTMLWorker(pdfDoc)
        PdfWriter.GetInstance(pdfDoc, Response.OutputStream)
        pdfDoc.Open()
        htmlparser.Parse(sr)
        pdfDoc.Close()
        Response.Write(pdfDoc)
        Response.End()
    End Sub
End Class