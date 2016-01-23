package org.apache.jsp.CompareCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class compare_005fcase_005fadjust_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/CompareCase/../Protect/arrest_detailshow.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('﻿');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Pke_Compare.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Reports.js'></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("\tfunction tosubmit(){\r\n");
      out.write("\t\tvar doc = document.dataform;\r\n");
      out.write("\r\n");
      out.write("\t\t//ตรวจสอบว่าวันที่เปรียบเทียบปรับต้อง >= วันที่เกิดเหตุ\r\n");
      out.write("\t\tvar CompareCaseDate = jQuery(\"#compare_case_date\").val();\r\n");
      out.write("\t\tvar ccdd = CompareCaseDate.substring(0,2);\r\n");
      out.write("\t\tvar ccmm = CompareCaseDate.substring(3,5);\r\n");
      out.write("\t\tvar ccyy = CompareCaseDate.substring(6,10);\r\n");
      out.write("\r\n");
      out.write("\t\tvar OccurrenceDate = jQuery(\"#occurrence_date\").val();\r\n");
      out.write("\t\tvar Odd = OccurrenceDate.substring(0,2);\r\n");
      out.write("\t\tvar Omm = OccurrenceDate.substring(3,5);\r\n");
      out.write("\t\tvar Oyy = OccurrenceDate.substring(6,10);\r\n");
      out.write("\r\n");
      out.write("\t\tif(ccyy + \"-\" + ccmm + \"-\" + ccdd < Oyy + \"-\" + Omm + \"-\" + Odd){\r\n");
      out.write("\t\t\talert(\"วันที่เปรียบเทียบปรับจะต้องไม่น้อยกว่าวันที่เกิดเหตุ\");\r\n");
      out.write("\t\t\tjQuery(\"#compare_case_date\").select();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar vLegislation = dwr.util.getValue(\"legislation_id\");\r\n");
      out.write("\t\tvar compareCaseNo = document.getElementById(\"compare_case_no_1\").value;\r\n");
      out.write("\t\tvar compareCaseYear = document.getElementById(\"compare_case_no_2\").value;\r\n");
      out.write("\t\tvar vOffcode = dwr.util.getValue(\"offcode\");\r\n");
      out.write("\t\tvar vTrackNo = dwr.util.getValue(\"track_no\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tPke_Compare.ChkValidateCompareCaseNo(compareCaseNo, compareCaseYear, vOffcode,vTrackNo, function(data){\r\n");
      out.write("\t\t\tif(data != \"\"){\r\n");
      out.write("\t\t\t\t//alert(\"เลขที่คดีเปรียบเทียบที่ ต้องน้อยกว่า เลขบันทึกรับคำกล่าวโทษ\");\r\n");
      out.write("\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"compare_case_no_1\").select();\r\n");
      out.write("\t\t\t}else if(document.getElementById(\"managetype1\").checked==true && document.getElementById(\"compare_authority_id\").value==\"\"){\r\n");
      out.write("\t\t\t\talert(\"กรุณาเลือกอำนาจในการเปรียบเทียบ\");\r\n");
      out.write("\t\t    }else if(vLegislation == 1 && parseFloat(document.dataform.bribe_money.value) > 150000){\r\n");
      out.write("\t\t\t\talert(\"จำนวนเงินสินบนต้องไม่เกิน 150,000.00 บาท\");\r\n");
      out.write("\t\t\t\tdocument.dataform.bribe_money.select();\r\n");
      out.write("\t\t    }else if(vLegislation == 1 && parseFloat(document.dataform.reward_money.value) > 150000){\r\n");
      out.write("\t\t    \talert(\"จำนวนเงินรางวัลต้องไม่เกิน 150,000.00 บาท\");\r\n");
      out.write("\t\t\t\tdocument.dataform.reward_money.select();\r\n");
      out.write("\t\t\t}else if(parseFloat(document.dataform.all_p.value) != 100){\r\n");
      out.write("\t\t\t \talert(\"เปอร์เซ็นการแบ่งเงินต้องไม่เกิน 100%\");\r\n");
      out.write("\t\t\t \tdocument.dataform.all_p.select();\r\n");
      out.write("\t\t\t}else if(parseFloat(ClearComma(document.dataform.all_money.value)) != parseFloat(ClearComma(document.dataform.allcase_fine.value))){\r\n");
      out.write("\t\t\t\talert(\"จำนวนเงินค่าปรับรวมไม่ถูกต้อง\");\r\n");
      out.write("\t\t\t\tdocument.dataform.all_money.select();\r\n");
      out.write("\t\t\t}else if(chkDecimal(document.dataform.treasury_money)==false){\r\n");
      out.write("\t\t\t\talert(\"จำนวนเงินส่งคลังต้องมีทศยม 2 ตำแหน่ง\");\r\n");
      out.write("\t\t\t\tdocument.dataform.treasury_money.select();\r\n");
      out.write("\t\t\t}else if(chkDecimal(document.dataform.bribe_money)==false){\r\n");
      out.write("\t\t\t\talert(\"จำนวนเงินสินบนต้องมีทศยม 2 ตำแหน่ง\");\r\n");
      out.write("\t\t\t\tdocument.dataform.bribe_money.select();\r\n");
      out.write("\t\t\t}else if(chkDecimal(document.dataform.reward_money)==false){\r\n");
      out.write("\t\t\t\talert(\"จำนวนเงินรางวัลต้องมีทศยม 2 ตำแหน่ง\");\r\n");
      out.write("\t\t\t\tdocument.dataform.reward_money.select();\r\n");
      out.write("\t\t\t}else if(document.dataform.onsubmit()!=false){\r\n");
      out.write("\t\t\t\tvar vTrackNo = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t\tvar caseID = document.dataform.compare_case_no_1.value + \"/\" + document.dataform.compare_case_no_2.value;\r\n");
      out.write("\t\t\t\tvar vOffcode = dwr.util.getValue(\"compare_office\");\r\n");
      out.write("\t\t\t\tvar vCaseNoneOffice = dwr.util.getValue(\"txtNoneOffice\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tPke_Compare.ChkDupCompareCaseNO(vTrackNo, caseID, vOffcode, vCaseNoneOffice, function(data){\r\n");
      out.write("\t\t\t\t\tif(data != \"\"){\r\n");
      out.write("\t\t\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"compare_case_no_1\").select();\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tdocument.dataform.submit();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction chkDecimal(txtVal){\r\n");
      out.write("\t\tvar ret = true;\r\n");
      out.write("\t\tvar numVal = txtVal.value;\r\n");
      out.write("\t\tif (numVal.indexOf(\".\")>0){\r\n");
      out.write("\t\t\tvar numDec = numVal.split(\".\")[1];\r\n");
      out.write("\t\t\tif(numDec.length != 2)\r\n");
      out.write("\t\t\t\tret = false;\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\tret = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn ret;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction enabledAuthority()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (document.getElementById(\"managetype1\").checked==true){\r\n");
      out.write("\t\t\tdocument.getElementById(\"compare_authority_id\").disabled=false;\r\n");
      out.write("\t\t\tdocument.getElementById(\"authority\").style.display='';\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.getElementById(\"compare_authority_id\").disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById(\"authority\").style.display='none';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("    function calFine(){\r\n");
      out.write("        var doc = document.dataform;\r\n");
      out.write("        var count =doc.iCount.value;\r\n");
      out.write("        var input = doc.case_fine.value;\r\n");
      out.write("        if(count <= 1){\r\n");
      out.write("        \tdoc.aalFine.value=AddComma(input);\r\n");
      out.write("        }else{\r\n");
      out.write("        \tfor(var i=0; i<doc.aalFine.length; i++){\r\n");
      out.write("            \tdoc.aalFine[i].value=AddComma(input);\r\n");
      out.write("        \t}\r\n");
      out.write("        }\r\n");
      out.write("        doc.allcase_fine.value=AddComma(input*count);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function calRow(){\r\n");
      out.write("        var doc = document.dataform;\r\n");
      out.write("        var output = 0.00;\r\n");
      out.write("        if(doc.treasury_money_p.value!=\"\")\r\n");
      out.write("        \toutput = (parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.treasury_money_p.value))/100;\r\n");
      out.write("        \r\n");
      out.write("        doc.treasury_money.value=formatMoney(output,2);\r\n");
      out.write("        \r\n");
      out.write("        doc.treasury.value=AddComma(output);\r\n");
      out.write("        if(doc.treasury.value == \"NaN\") doc.treasury.value=\"0.00\";\r\n");
      out.write("    }\r\n");
      out.write("    function calRow1(){\r\n");
      out.write("        var doc = document.dataform;\r\n");
      out.write("        var output = 0.00;\r\n");
      out.write("        if(doc.bribe_money_p.value!=\"\")\r\n");
      out.write("         \toutput = (parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.bribe_money_p.value))/100;\r\n");
      out.write("\r\n");
      out.write("        doc.bribe_money.value=formatMoney(output,2);\r\n");
      out.write("        doc.bribe.value=AddComma(output);\r\n");
      out.write("        if(doc.bribe.value == \"NaN\") doc.bribe.value=\"0.00\";\r\n");
      out.write("    }\r\n");
      out.write("    function calRow2(){\r\n");
      out.write("        var doc = document.dataform;\r\n");
      out.write("        var output = 0.00;\r\n");
      out.write("        if(doc.reward_money_p.value != \"\")\r\n");
      out.write("        \toutput = (parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.reward_money_p.value))/100;\r\n");
      out.write("\r\n");
      out.write("        doc.reward_money.value=formatMoney(output,2);\r\n");
      out.write("        doc.reward.value=AddComma(output);\r\n");
      out.write("        if(doc.reward.value == \"NaN\") doc.reward.value=\"0.00\";\r\n");
      out.write("    }\r\n");
      out.write("    function calsum(){\r\n");
      out.write("    \tvar doc = document.dataform;\r\n");
      out.write("\r\n");
      out.write("\t\tif(doc.treasury_money_p.value==\"\") doc.treasury_money_p.value = \"0\";\r\n");
      out.write("\t\tif(doc.bribe_money_p.value==\"\") doc.bribe_money_p.value = \"0\";\r\n");
      out.write("\t\tif(doc.reward_money_p.value==\"\") doc.reward_money_p.value = \"0\";\r\n");
      out.write("    \t\r\n");
      out.write("    \tvar sum1 = parseFloat(ClearComma(doc.treasury_money_p.value))+parseFloat(ClearComma(doc.bribe_money_p.value))+parseFloat(ClearComma(doc.reward_money_p.value));\r\n");
      out.write("    \tvar sum2 = parseFloat(ClearComma(doc.treasury_money.value))+parseFloat(ClearComma(doc.bribe_money.value))+parseFloat(ClearComma(doc.reward_money.value));\r\n");
      out.write("    \tvar sum3 = parseFloat(ClearComma(doc.treasury.value))+parseFloat(ClearComma(doc.bribe.value))+parseFloat(ClearComma(doc.reward.value));\r\n");
      out.write("\t\tdoc.all_p.value=sum1;\r\n");
      out.write("\t\tif(doc.all_p.value == \"NaN\") doc.all_p.value = \"0\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdoc.all.value=AddComma(sum3);\r\n");
      out.write("\t\tif(doc.all.value == \"NaN\") doc.all.value=\"0.00\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdoc.all_money.value=AddComma(sum2);\r\n");
      out.write("\t\tif(doc.all_money.value == \"NaN\") doc.all_money.value=\"0.00\";\r\n");
      out.write("    }\r\n");
      out.write("    function calMoney(){\r\n");
      out.write("\t\t//User For page_load\r\n");
      out.write("    \tvar doc = document.dataform;\r\n");
      out.write("        doc.treasury.value = AddComma((parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.treasury_money_p.value))/100);\r\n");
      out.write("        doc.bribe.value = AddComma((parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.bribe_money_p.value))/100);\r\n");
      out.write("        doc.reward.value = AddComma((parseFloat(ClearComma(doc.allcase_fine.value))* parseFloat(doc.reward_money_p.value))/100);\r\n");
      out.write("        calsum();\r\n");
      out.write("\r\n");
      out.write("        if(doc.treasury.value == \"NaN\") doc.treasury.value=\"0.00\";\r\n");
      out.write("        if(doc.bribe.value == \"NaN\") doc.bribe.value=\"0.00\";\r\n");
      out.write("        if(doc.reward.value == \"NaN\") doc.reward.value=\"0.00\";\r\n");
      out.write("    }\r\n");
      out.write("\tfunction sharemoney(){\r\n");
      out.write("\t\t//alert(\"sharemoney\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar dataform = document.dataform;\r\n");
      out.write("\t\tcalFine();\r\n");
      out.write("\t\tdataform.allcase_fine.value = AddComma(dataform.numLawbreaker.value*dataform.case_fine.value);\r\n");
      out.write("\t\tvar vTrackNo = dataform.track_no.value;\r\n");
      out.write("\t\tvar vLegislation = dwr.util.getValue(\"legislation_id\");\r\n");
      out.write("\t\tvar vIndictment = dwr.util.getValue(\"indictment_id\");\r\n");
      out.write("\t\tvar vIsNotice = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_notice_arrest_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tif(vIsNotice == null){\r\n");
      out.write("\t\t\tvIsNotice='N';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar vFineSum = ClearComma(dataform.allcase_fine.value);\r\n");
      out.write("\t\tif (!vIsNotice){\r\n");
      out.write("\t\t\tvIsNotice = \"N\";\r\n");
      out.write("\t\t\t//alert(vIsNotice);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tvIsNotice = \"Y\";\r\n");
      out.write("\t\t\t//alert(vIsNotice);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tPke_Compare.getShareMoney(vTrackNo,vLegislation,vIndictment,vIsNotice,vFineSum,function(data) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//%share\r\n");
      out.write("\t    \tdwr.util.setValue(\"bribe_money_p\", data[0]);\r\n");
      out.write("\t    \tdwr.util.setValue(\"reward_money_p\", data[1]);\r\n");
      out.write("\t    \tdwr.util.setValue(\"treasury_money_p\", data[2]);\r\n");
      out.write("\t    \t///dwr.util.setValue(\"all_p\", data[0]+data[1]+data[2]);\r\n");
      out.write("\t    \t//money share\r\n");
      out.write("\t    \tdwr.util.setValue(\"treasury\", AddComma(data[5]));\r\n");
      out.write("\t    \tdwr.util.setValue(\"bribe\", AddComma(data[3]));\r\n");
      out.write("\t    \tdwr.util.setValue(\"reward\", AddComma(data[4]));\r\n");
      out.write("\r\n");
      out.write("\t    \tdisplayMoney(data[3],data[5],data[4]);\r\n");
      out.write("\t    \tcalsum();\r\n");
      out.write("\t\t  \t});\r\n");
      out.write("\t  \t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction displayMoney(bribe, treasury, reward){\r\n");
      out.write("\t\tdocument.dataform.bribe_money.value = formatMoney(bribe,2);\r\n");
      out.write("\t\tdocument.dataform.treasury_money.value = formatMoney(treasury,2);\r\n");
      out.write("\t\tdocument.dataform.reward_money.value = formatMoney(reward,2);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction ChkDupCaseNo(txtNo){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar vTrackNo = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\tvar caseID = document.dataform.compare_case_no_1.value + \"/\" + document.dataform.compare_case_no_2.value;\r\n");
      out.write("\t\tvar vOffcode = dwr.util.getValue(\"compare_office\");\r\n");
      out.write("\t\tPke_Compare.ChkDupCompareCaseNO(vTrackNo, caseID, vOffcode, function(data){\r\n");
      out.write("\t\t\tif(data != \"\"){\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"compare_case_no_1\").value = \"\";\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"compare_case_no_2\").value = \"\";\r\n");
      out.write("\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"compare_case_no_1\").select();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction ChkNoneOffice(){\r\n");
      out.write("\t\t//chkNoneOffice\r\n");
      out.write("\t\tif (document.getElementById(\"chkNoneOffice\").checked==true)\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtCaseNoneOffice\").innerHTML=\"น\";\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtCaseNoneOffice\").innerHTML=\"&nbsp;\";\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<form method=\"post\" name=\"dataform\" action=\"process?action=Caseadjust&cmd=create\">\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\"  border=\"0\" cellspacing=\"0\"\r\n");
      out.write("\tcellpadding=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<td width=\"100%\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"1%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td width=\"99%\"><span class=\"websitename\">เปรียบเทียบปรับ</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input name=\"btnSave\" id=\"btnSave\" type=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"barButton\" value=\"บันทึก\" onClick=\"tosubmit();\"> \r\n");
      out.write("\t\t\t\t\t<input name=\"btnCancel\" id=\"btnCancel\" type=\"button\" class=\"barButton\"\r\n");
      out.write("\t\t\t\t\tvalue=\"ยกเลิกการแก้ไข\" onclick=\"writeTranLog('ยกเลิกการแก้ไขบันทึกการจับกุม');window.location.href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'; \"> <input name=\"btnBack\" type=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"barButton\" value=\"กลับหน้าค้นหา\"\r\n");
      out.write("\t\t\t\t\tonclick=\"writeTranLog('กลับหน้าค้นหา');window.location.href='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("' \"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("  >\r\n");
      out.write("\t\t\t\t<td height=\"25\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td>พิมพ์รายงาน :&nbsp; <select name=\"cmbPrintReports\"\r\n");
      out.write("\t\t\t\t\tid=\"cmbPrintReports\" style=\"width: 250px;\">\r\n");
      out.write("\t\t\t\t\t<option value=\"\" selected>เลือก</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"ILL_P027\">พิมพ์คำร้องขอเปรียบเทียบคดี</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"ILL_P028\">พิมพ์เปรียบเทียบคดี(ส.ส.2/52)</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"ILL_P029\">พิมพ์บันทึกคำให้การของผู้ต้องหา(ส.ส.2/53)</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"ILL_P030\">พิมพ์บันทึกคำให้การของผู้กล่าวโทษ(ส.ส.2/54)</option>\r\n");
      out.write("\t\t\t\t</select> <input type=\"button\" id=\"btnPrint\" name=\"btnPrint\" value=\"พิมพ์\" class=\"barButton\" \r\n");
      out.write("\t\t\t\t\tonClick=\"if(document.dataform.cmbPrintReports.value!='')printReports(document.dataform.cmbPrintReports.value+'&getTrackNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&time=");
      out.print(new Date().getTime() );
      out.write("');\">\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<table width=\"900\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"1%\" align=\"left\" valign=\"top\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"98%\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"1%\" align=\"right\" valign=\"top\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"40\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"left\" valign=\"top\"><!-- รายละเอียดบันทึกการจับกุม-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"track_no\" type=\"hidden\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  />\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/engine.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/util.js'></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\" ></script>\r\n");
      out.write("<script>\r\n");
      out.write("  function toggle() {\r\n");
      out.write("   if( document.getElementById(\"isLawbreakerN\").checked==true ){\r\n");
      out.write("\t\tdocument.getElementById(\"txtEstimateFine\").disabled=false;\r\n");
      out.write("\t\tdocument.getElementById(\"chkIsCourt\").disabled=true;\r\n");
      out.write("\t\tdocument.getElementById(\"chkIsCourt\").checked=false;\r\n");
      out.write("   }else{\r\n");
      out.write("\t\tdocument.getElementById(\"chkIsCourt\").disabled=false;\r\n");
      out.write("\t\tif(document.getElementById(\"chkIsCourt\").checked==true){\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtEstimateFine\").disabled=false;\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtEstimateFineDate\").disabled=false;\r\n");
      out.write("\t\t\tdocument.getElementById(\"imgEstimateFineDate\").style.display='';\r\n");
      out.write("\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtEstimateFine\").disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtEstimateFineDate\").disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById(\"imgEstimateFineDate\").style.display='none';\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("   }\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("function ch_accuserType(){\r\n");
      out.write("\tfor (i=0;i<document.dataform.accuserType.length;i++) { \r\n");
      out.write("      if (document.dataform.accuserType[i].checked){ \r\n");
      out.write("    \t  document.dataform.mu_accuserType.value = document.dataform.accuserType[i].value; \r\n");
      out.write("      }\r\n");
      out.write("\t} \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("  <tr >\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr class=\"bgRowGray\">\r\n");
      out.write("    <td colspan=\"4\"><strong>รายละเอียดบันทึกการจับกุม</strong> </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr >\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"20%\" height=\"25\" align=\"right\" >เลขที่งาน :&nbsp;</td>\r\n");
      out.write("\r\n");
      out.write("    <td width=\"30%\"><input id=\"track_no\" name=\"track_no\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"25\"  />\r\n");
      out.write("      <input type=\"hidden\" name=\"id\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("       <input type=\"hidden\" name=\"update\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${update}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"20%\" height=\"25\" align=\"right\">วันที่เขียนบันทึกจับกุม :&nbsp;</td>\r\n");
      out.write("    <td width=\"30%\">\r\n");
      out.write("        <input type=\"text\" name=\"application_date\" id=\"application_date\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"7\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  height=\"25\" align=\"right\">เขียนที่ :&nbsp;</td>\r\n");
      out.write("    <td ><input name=\"department_code\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  class=\"textView\" id=\"department_code\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.department_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"4\" />\r\n");
      out.write("        <input name=\"department_name\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  class=\"textView\" id=\"department_name\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.department_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"25\" />\r\n");
      out.write("    </td>\r\n");
      out.write("    <td height=\"25\" align=\"right\">วันที่เกิดเหตุ :&nbsp;</td>\r\n");
      out.write("    <td height=\"25\">\r\n");
      out.write("        <input name=\"occurrence_date\" type=\"text\"  class=\"textdate\" id=\"occurrence_date\" style=\"width:75;\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"7\" maxlength=\"10\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
      out.write("        <input name=\"occurrence_time\" id=\"occurrence_time\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"5\" maxlength=\"5\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  />\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  height=\"25\" align=\"right\">พื้นที่ :&nbsp;</td>\r\n");
      out.write("    <td ><select name=\"offcode\" id=\"s\" style=\"width:200px;display:none;\" >\r\n");
      out.write("\t        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </select>\r\n");
      out.write("        <input name=\"tmp_offname\" type=\"text\"  id=\"tmp_offname\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
      out.write("    <td  height=\"25\" align=\"right\">ผู้กระทำผิด :&nbsp;</td>\r\n");
      out.write("    <td ><input name=\"lawbreakertype\" type=\"radio\" checked value=\"P\" disabled=\"disabled\"\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      /> บุคคลทั่วไป &nbsp;&nbsp;\r\n");
      out.write("      <input name=\"lawbreakertype\" type=\"radio\" value=\"C\" disabled=\"disabled\"\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      />ผู้ประกอบการ</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td  height=\"25\" align=\"right\">พ.ร.บ. :&nbsp;</td>\r\n");
      out.write("    <td >\r\n");
      out.write("\t    <select name=\"legislation_id\" id=\"legislation_id\" style=\"width:200px;display:none;\" >\r\n");
      out.write("\t    \t<option value=\"\" selected>เลือก</option>\r\n");
      out.write("\t      \t<option value=\"1\" ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write(" >90 พ.ร.บ. สุรา พ.ศ.2493</option>\r\n");
      out.write("\t      \t<option value=\"2\" ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write(" >91 พ.ร.บ.ยาสูบ พ.ศ.2509</option>\r\n");
      out.write("\t      \t<option value=\"3\" ");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write(" >92 พ.ร.บ.ไพ่</option>\r\n");
      out.write("\t      \t<option value=\"4\" ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write(" >00 พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>\r\n");
      out.write("\t    </select>\r\n");
      out.write("\t    <input name=\"tmp_legislation_name\" type=\"text\"  id=\"tmp_legislation_name\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
      out.write("    </td>\r\n");
      out.write("    <td  height=\"25\" align=\"right\">มีตัวผู้กระทำผิด :&nbsp;</td>\r\n");
      out.write("    <td ><input name=\"have_culprit\" id=\"have_culpri\" type=\"radio\" value=\"Y\" checked onclick=\"toggle();\" disabled=\"disabled\"\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      /> มีตัว &nbsp;&nbsp;\r\n");
      out.write("      <input name=\"have_culprit\" id=\"have_culpri\" type=\"radio\" value=\"N\" onclick=\"toggle();\" disabled=\"disabled\"\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      /> ไม่มีตัว&nbsp;&nbsp;\r\n");
      out.write("      <input name=\"issentcourt\" id=\"issentcour\" type=\"checkbox\" disabled=\"disabled\" onclick=\"toggle();\"\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fif_005f10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      value = 'Y'/> ส่งฟ้องศาล\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\" align=\"right\">สินค้า :&nbsp;</td>\r\n");
      out.write("    <td >\r\n");
      out.write("    \t<select id=\"product_group_id\" name=\"product_group_id\" style=\"width:200px;display:none;\" >\r\n");
      out.write("    \t</select>\r\n");
      out.write("    \t<input name=\"tmp_group_name\" type=\"text\"  id=\"tmp_group_name\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.product_group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
      out.write("    </td>\r\n");
      out.write("    <td align=\"right\" valign=\"top\">ประมาณการค่าปรับ :&nbsp;</td>\r\n");
      out.write("    <td valign=\"top\" colspan=\"3\"><input type=\"text\" onKeyPress=\"txtKeyPress();\" disabled=\"disabled\" onKeyDown=\"disableKeyDown();\" name=\"estimate_fine\" id=\"estimate_fine\" class=\"textNum\"  size=\"10\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.estimate_fine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  />\r\n");
      out.write("      บาท</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr height=\"25\">\r\n");
      out.write("    <td align=\"right\" valign=\"top\">ผู้กล่าวหา :&nbsp;</td>\r\n");
      out.write("    <td colspan=\"3\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr height=\"25\">\r\n");
      out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"2\"  ");
      if (_jspx_meth_c_005fif_005f11(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f12(_jspx_page_context))
        return;
      out.write(" > เจ้าหน้าที่กรมสรรพสามิต </td>\r\n");
      out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"3\"  ");
      if (_jspx_meth_c_005fif_005f13(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f14(_jspx_page_context))
        return;
      out.write(" > เจ้าหน้าที่สรรพสามิตภาค </td>\r\n");
      out.write("        <td  align=\"right\">ชื่อผู้กล่าวหา :&nbsp;</td>\r\n");
      out.write("        <td>\r\n");
      out.write("        \t\t<input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" id=\"accuser\"  name=\"accuser\" class=\"textview\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("        \t\t<input type=\"hidden\" id=\"accuser_idcardno\" name=\"accuser_idcardno\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("              \t<input type=\"hidden\" id=\"mu_accuserType\" name=\"mu_accuserType\" value=\"\" />\r\n");
      out.write("              \t<img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" \r\n");
      out.write("              \tstyle=\"cursor:pointer;");
      if (_jspx_meth_c_005fif_005f15(_jspx_page_context))
        return;
      out.write("\" \r\n");
      out.write("              \tonClick=\"ch_accuserType();window.open('process?action=Divide_staff_popForArrest&formname=accuser&id=accuser_idcardno&posname=posname&poscode=accuser_poscode&offname=offname&offcode=accuser_offcode&actype='+document.dataform.mu_accuserType.value , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" /> \r\n");
      out.write("              \t<font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr height=\"25\">\r\n");
      out.write("        <td>\r\n");
      out.write("        \t<input name=\"accuserType\" type=\"radio\" value=\"1\" ");
      if (_jspx_meth_c_005fif_005f16(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f17(_jspx_page_context))
        return;
      out.write(" >เจ้าหน้าที่สรรพสามิตพื้นที่ \r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("        \t<input name=\"accuserType\" type=\"radio\" value=\"4\" ");
      if (_jspx_meth_c_005fif_005f18(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f19(_jspx_page_context))
        return;
      out.write(" >เจ้าหน้าที่สรรพสามิตพื้นที่สาขา\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td >\r\n");
      out.write("        \t\t<input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" id=\"posname\" name=\"posname\" class=\"textview\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("             \t<input type=\"hidden\" name=\"accuser_poscode\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td colspan=\"2\"><input name=\"accuserType\" type=\"radio\" value=\"5\" \r\n");
      out.write("              ");
      if (_jspx_meth_c_005fif_005f20(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f21(_jspx_page_context))
        return;
      out.write(" >เจ้าหน้าที่อื่นๆ</td>\r\n");
      out.write("        <td align=\"right\">สังกัด :&nbsp;</td>\r\n");
      out.write("        <td >\r\n");
      out.write("        \t<input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" id=\"offname\" name=\"offname\" class=\"textview\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("        \t<input type=\"hidden\" id=\"accuser_offcode\" name=\"accuser_offcode\" class=\"textview\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"25\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr height=\"25\">\r\n");
      out.write("    <td   align=\"right\">ชื่อสถานที่เกิดเหตุ :&nbsp;</td>\r\n");
      out.write("    <td >\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f22(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f23(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td  align=\"right\">จังหวัด :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <select name=\"scene_province\" id=\"province\" ");
      if (_jspx_meth_c_005fif_005f24(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        style=\"width:200px\" onchange=\"getDistrict('district','tambol',this.value,'')\">\r\n");
      out.write("        \t  <option value=\"\">โปรดเลือก</option>\r\n");
      out.write("\t       \t  ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </select>\r\n");
      out.write("        <font style=\"color:red\">*</font>\r\n");
      out.write("   </td>\r\n");
      out.write("\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr height=\"25\">\r\n");
      out.write("    <td  align=\"right\">บ้านเลขที่ :&nbsp;</td>\r\n");
      out.write("    <td >\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f26(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f27(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td align=\"right\">อำเภอ :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <select name=\"district\" id=\"district\"  style=\"width:200px\" ");
      if (_jspx_meth_c_005fif_005f28(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        onchange=\"getTambol('tambol',this.value,'')\">\r\n");
      out.write("     \t</select>\r\n");
      out.write("     \t<font style=\"color:red\">*</font>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr height=\"25\">\r\n");
      out.write("    <td  align=\"right\">ซอย :&nbsp;</td>\r\n");
      out.write("    <td >\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f29(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f30(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td align=\"right\">ตำบล :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("       \t<select name=\"tambol\" id=\"tambol\"  style=\"width:200px\" ");
      if (_jspx_meth_c_005fif_005f31(_jspx_page_context))
        return;
      out.write(" >  \r\n");
      out.write("       \t</select>\r\n");
      out.write("\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr height=\"25\">\r\n");
      out.write("    <td align=\"right\">ถนน :&nbsp;</td>\r\n");
      out.write("    <td >\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f32(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f33(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td align=\"right\">สถานีตำรวจท้องที่เกิดเหตุ :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f34(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f35(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t(ส.ส.2/54)\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr height=\"25\">\r\n");
      out.write("    <td align=\"right\">จำนวนผู้กระทำผิด :&nbsp;</td>\r\n");
      out.write("    <td > ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aalsize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" คน &nbsp;&nbsp;&nbsp;       \r\n");
      out.write("        <input name=\"alleged_co\" type=\"checkbox\"  ");
      if (_jspx_meth_c_005fif_005f36(_jspx_page_context))
        return;
      out.write(" disabled=\"disabled\"/>\r\n");
      out.write("      ข้อกล่าวหาร่วมกัน </td>\r\n");
      out.write("    <td  align=\"right\">ละติจูด :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f37(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f38(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td colspan=\"4\" height=\"25\" align=\"right\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script>\r\n");
      out.write("getProvince('province','district','tambol','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("setGroupID('product_group_id','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.product_group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("//getDistrict('district','tambol','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"bgRowGray\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\"><strong>ที่ทำการเปรียบเทียบปรับ</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"10\" colspan=\"4\" align=\"right\" valign=\"middle\">&nbsp;<input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"hidden\" name=\"update\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${update}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"right\" valign=\"middle\">คดีเปรียบเทียบที่&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"152\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<b><span id=\"txtCaseNoneOffice\"  >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${caseNoneOffice }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span></b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"compare_case_no_1\" name=\"compare_case_no_1\" class=\"textNum\" onkeypress=\"ChkMinusInt(this);\" size=\"5\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${case_no_1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t/&nbsp; \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"compare_case_no_2\" name=\"compare_case_no_2\" class=\"textNum\" onkeypress=\"ChkMinusInt(this);\" size=\"4\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${case_no_2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"right\" valign=\"middle\">วันที่ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f39(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f40 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f40.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f40.setParent(null);
      _jspx_th_c_005fif_005f40.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.compare_case_date == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f40 = _jspx_th_c_005fif_005f40.doStartTag();
      if (_jspx_eval_c_005fif_005f40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"compare_case_date\" id=\"compare_case_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
          //  fmt:formatDate
          org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
          _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
          _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f40);
          _jspx_th_fmt_005fformatDate_005f1.setPattern("dd/MM/yyyy");
          _jspx_th_fmt_005fformatDate_005f1.setValue(new Date() );
          int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
          if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
            return;
          }
          _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f40.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f40);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f40);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:NewCssCal('compare_case_date','ddmmyyyy')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img id=\"imgCompareCaseDate\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<font style=\"color: red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t<td colspan='3'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t\t<input type=\"checkbox\" id=\"chkNoneOffice\" name=\"chkNoneOffice\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t\t");
      if (_jspx_meth_c_005fif_005f41(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t\tvalue='Y' onclick=\"ChkNoneOffice()\" disabled />คดีจับกุมนอกสถานที่\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t\t<input type=\"hidden\" id=\"txtNoneOffice\"  name=\"txtNoneOffice\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_none_office }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\" valign=\"middle\">ที่ทำการเปรียบเทียบ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"243\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select name=\"compare_office\" id=\"compare_office\" onchange=\"setOfficeProvince('province2','district2','tambol2',this.value)\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 200px;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f42(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected>เลือก</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f44(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\" valign=\"middle\">ชื่อผู้กล่าวหา :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"243\"><input type=\"text\" id=\"accuser\" name=\"accuser\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"textview\" size=\"31\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t /> <input type=\"hidden\" name=\"accuser_idcardno\" id=\"accuser_idcardno\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aa.accuser_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> <font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">จังหวัด :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><select name=\"compare_province\" id=\"province2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 200px;\" onchange=\"getDistrict('district2','tambol2',this.value,'')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">โปรดเลือกจังหวัด</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select> <font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">จังหวัด :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><select name=\"accuser_province\" id=\"province3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 200px;\" onchange=\"getDistrict('district3','tambol3',this.value,'')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">โปรดเลือกจังหวัด</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">อำเภอ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><select name=\"compare_district\" id=\"district2\" onchange=\"getTambol('tambol2',this.value,'')\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">โปรดเลือกอำเภอ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select> <font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">อำเภอ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><select name=\"accuser_district\" id=\"district3\" onchange=\"getTambol('tambol3',this.value,'')\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">โปรดเลือกอำเภอ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ตำบล :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><select name=\"compare_subdistrict\" id=\"tambol2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">โปรดเลือกตำบล</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ตำบล :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><select name=\"accuser_subdistrict\" id=\"tambol3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t style=\"width: 200px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">โปรดเลือกตำบล</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">ผู้ดำเนินการเปรียบเทียบ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" onClick=\"enabledAuthority();\"><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"managetype1\" name=\"manage_type\" type=\"radio\" value=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f45(_jspx_page_context))
        return;
      out.write(">ผู้มีอำนาจโดยตรง\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t&nbsp;&nbsp; <input id=\"managetype2\" name=\"manage_type\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype=\"radio\" value=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f46(_jspx_page_context))
        return;
      out.write(">เจ้าหน้าที่ดำเนินคดี&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">เจ้าหน้าที่ดำเนินคดี/&nbsp;<br>ผู้มีอำนาจเปรียบเทียบ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"sue_staff_name\" name=\"sue_staff_name\" class=\"textview\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sue_staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"sue_staff_idcardno\" name=\"sue_staff_idcardno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sue_staff_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img id=\"imgSueStaffName\" src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor: hand\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tonClick=\"window.open('process?action=Divide_staff_pop&formname=sue_staff_name&id=sue_staff_idcardno&poscode=sue_poscode&offcode=sue_offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"sue_poscode\" name=\"sue_poscode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sue_poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" \"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"sue_offcode\" name=\"sue_offcode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sue_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<font style=\"color: red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">อำนาจในการเปรียบเทียบ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><select name=\"compare_authority_id\" id=\"compare_authority_id\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 180px;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\" selected>เลือก</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select> <span id=\"authority\" style=\"display: none;\"><font\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"color: red\">*</font></span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" colspan=\"4\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"bgRowGray\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\"><strong>เปรียบเทียบคดี</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"10\" colspan=\"4\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar caselaw = new Array();\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor(i=0;i<=10;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcaselaw[i]=\"\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar penaltylaw = new Array();\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor(i=0;i<=10;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpenaltylaw[i]=\"\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar incid = new Array();\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfor(i=0;i<=10;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tincid[i]=\"\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction selectcaselaw(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor(i=0;i<=incid.length;i++){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(incid[i]==document.dataform.indictment_id.value){\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdocument.dataform.case_law_id.value = caselaw[i];\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tdocument.dataform.penalty_desc.value = penaltylaw[i];\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">ข้อกล่าวหา :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\"><select name=\"indictment_id\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"indictment_id\" style=\"width: 580px;\" onchange=\"selectcaselaw();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">เลือก</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select> <font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">มาตรา :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\"><input type=\"text\" name=\"case_law_id\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"textview\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.indictment_id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tบทกำหนดโทษ : <input type=\"text\" name=\"penalty_desc\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"textview\" size=\"32\" value=\"\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">การดำเนินการ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\"><TEXTAREA id=\"administration\" NAME=\"administration\" ROWS=\"5\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tCOLS=\"55\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.administration}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA> <font\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">คำให้การของผู้กล่าวโทษ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<TEXTAREA id=\"accuser_testimony\" NAME=\"accuser_testimony\" ROWS=\"5\" COLS=\"55\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_testimony }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">เลขที่คดี(สมุดรับคำกล่าวโทษ) :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"case_id\" id=\"case_id\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"bi_id\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.book_impeachment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">วันที่รับคำกล่าวโทษ:</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"case_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" colspan=\"4\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"bgRowGray\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\"><strong>รายชื่อผู้กระทำผิด</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table width=\"95%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"27%\" class=\"TblHeaderColumn AlignCenter\">ลำดับที่</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"62%\" class=\"TblHeaderColumn\">ชื่อผู้กระทำผิด</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"20%\" class=\"TblHeaderColumn\">ค่าปรับ</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"iCount\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i_count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"numLawbreaker\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${numLawbreaker}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\" width=\"40%\">ค่าปรับของคดีต่อคน :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"Text\" id=\"case_fine\" name=\"case_fine\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_fine }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textNum\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonkeypress=\"ChkMinusDbl(this);\" onblur=\"calFine();calRow();calRow1();calRow2();calsum();\"  style=\"width: 80px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsize=\"15\" /> &nbsp;บาท</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\">มูลค่าภาษีพิสูจน์ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"Text\" id=\"tax_val\" name=\"tax_value\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.tax_value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textViewNum\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonKeyPress=\"window.event.keyCode = 0\" onKeyDown=\"disableKeyDown();\" style=\"width: 80px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tsize=\"15\" readonly=\"readonly\"/> &nbsp;บาท</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"30\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr class=\"bgRowGray\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\"><strong>รายละเอียดเงินค่าปรับ /เงินสินบนและเงินรางวัล</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"10\" colspan=\"4\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">ค่าปรับเปรียบเทียบคดีรวม :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"allcase_fine\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"textViewNum\" size=\"15\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.allcase_fine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" > บาท</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td align=\"right\">วันที่ชำระ :</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><input name=\"paydate\" id=\"paydate\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f2(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody id=\"divideMoney\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\" valign=\"top\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr id=\"calShareMoney\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" class=\"barButton\" value=\"คำนวณ % การแบ่งเงิน\" onClick=\"sharemoney();\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>เงินส่งคลัง&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"treasury_money_p\" name=\"treasury_money_p\" size=\"3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.treasury_money_p}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textNum\" onkeypress=\"ChkMinusInt(this);\" onblur=\"calRow();calsum();\">%&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"treasury\" size=\"12\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"\" class=\"textViewNum\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"treasury_money\" name=\"treasury_money\" size=\"12\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonChange=\"calsum();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.treasury_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textNum\" onkeypress=\"ChkMinusDbl(this);\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>เงินสินบน&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"bribe_money_p\" name=\"bribe_money_p\" class=\"textNum\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonkeypress=\"ChkMinusInt(this);\" onblur=\"calRow1();calsum();\" size=\"3\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.bribe_money_p}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">%&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"bribe\" class=\"textViewNum\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsize=\"12\" value=\"\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"bribe_money\" name=\"bribe_money\" class=\"textNum\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonChange=\"calsum();\" onkeypress=\"ChkMinusDbl(this);\" size=\"12\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.birbe_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>เงินรางวัล&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"reward_money_p\" name=\"reward_money_p\" class=\"textNum\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonkeypress=\"ChkMinusInt(this);\" onblur=\"calRow2();calsum();\" size=\"3\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.reward_money_p }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">%&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"reward\" class=\"textViewNum\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsize=\"12\" value=\"\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" id=\"reward_money\" name=\"reward_money\" class=\"textNum\" onBlur=\"chkDecimal(this);\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonChange=\"calsum();\" onkeypress=\"ChkMinusDbl(this);\" size=\"12\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.reward_money }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><b>รวม</b>&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"all_p\" class=\"textViewNum\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsize=\"3\" value=\"\">%&nbsp;&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"all\" class=\"textViewNum\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsize=\"12\" value=\"\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"all_money\" class=\"textViewNum\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tsize=\"12\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"case_status\" id=\"case_status\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.case_status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"> </input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td height=\"25\" colspan=\"4\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td height=\"25\" colspan=\"3\">&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tfunction formatMoney(valIn, dec){\r\n");
      out.write("\t\t//กำหนดให้แสดงตัวเลขมีทศนิยมอย่างน้อย 2 ตำแหน่งเสมอ\r\n");
      out.write("\t\t//ถ้า valIn มีทศนิยมมากกว่า 2 ตำแหน่งอยู่แล้ว ให้แสดงข้อมูลตามที่มี โดยไม่มีการปัดเศษ\r\n");
      out.write("\t\tvar temp = \"\" + valIn;\r\n");
      out.write("\t\tif ( isNaN( parseFloat(temp) ) ) {\r\n");
      out.write("\t\t\ttemp = 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (parseInt(temp) == 0)\r\n");
      out.write("\t\t\treturn '0.' + repeatChar(\"0\",dec);\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\tif(temp.indexOf(\".\")>0){\r\n");
      out.write("\t\t\t\tvar num = temp.split(\".\");\r\n");
      out.write("\t\t\t\tif(num[1].length < dec)\r\n");
      out.write("\t\t\t\t\ttemp = num[0] + \".\" + num[1] + repeatChar(\"0\",(dec-1));\r\n");
      out.write("\t\t\t\telse \r\n");
      out.write("\t\t\t\t\ttemp = num[0] + \".\" + num[1];\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\ttemp = temp + \".\" + repeatChar(\"0\",dec);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn temp;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction repeatChar(chr,num){\r\n");
      out.write("\t\t//ทำซ้ำตัวอักษรที่ต้องการ (chr) ตามจำนวนครั้งที่ต้องการ (num)  : JavaScript ไม่มีฟังก์ชั่น repeat ก็เลยต้องมาเขียนเอง (--\")\r\n");
      out.write("\t\tvar ret = \"\";\r\n");
      out.write("\t\tvar count = num + 0;\r\n");
      out.write("\t\tfor(i=0;i<count;i++){\r\n");
      out.write("\t\t\tret += chr;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn ret;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f49(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\tgetProvince('province2','district2','tambol2','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.compare_province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.compare_district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.compare_subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\tgetProvince('province3','district3','tambol3','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.accuser_province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.accuser_district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.accuser_subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\tselectcaselaw();\r\n");
      out.write("\tcalFine();\r\n");
      out.write("\tcalMoney();\r\n");
      out.write("\tenabledAuthority();\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f50(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f51(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</script> \r\n");
      out.write("\t<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("\t//You should create the validator only after the definition of the HTML form\r\n");
      out.write("\t  var frmvalidator  = new Validator(\"dataform\");\r\n");
      out.write("\t\r\n");
      out.write("\t  frmvalidator.addValidation(\"compare_case_no_1\",\"req\",\"กรุณากรอกเลขที่คดี\");\r\n");
      out.write("\t  frmvalidator.addValidation(\"compare_case_no_2\",\"req\",\"กรุณากรอกเลขที่คดี\");\r\n");
      out.write("\t  frmvalidator.addValidation(\"compare_case_date\",\"req\",\"กรุณากรอกวันที่\");\r\n");
      out.write("\t  ");
      if (_jspx_meth_c_005fif_005f52(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t  ");
      if (_jspx_meth_c_005fif_005f53(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t  frmvalidator.addValidation(\"accuser\",\"req\",\"กรุณากรอกชื่อผู้กล่าวหา\");\r\n");
      out.write("\t  frmvalidator.addValidation(\"compare_province\",\"req\",\"กรุณากรอกจังหวัด\");\r\n");
      out.write("\t  frmvalidator.addValidation(\"compare_district\",\"req\",\"กรุณากรอกอำเภอ\");\r\n");
      out.write("\t  frmvalidator.addValidation(\"compare_subdistrict\",\"req\",\"กรุณากรอกตำบล\");\r\n");
      out.write("\t  frmvalidator.addValidation(\"indictment_id\",\"req\",\"เลือกข้อหา\");\r\n");
      out.write("\t  frmvalidator.addValidation(\"sue_staff_name\",\"req\",\"กรุณากรอกผู้มีอำนาจในการเปรียบเทียบ\");\r\n");
      out.write("\r\n");
      out.write("\t\tfunction PayFined(){//ชำระเงินแล้ว แต่ยังไม่นำส่งเงิน\r\n");
      out.write("\t\t\t//02 = ผู้ต้องหาชำระเงินแล้ว แต่ยังไม่นำส่งเงิน\r\n");
      out.write("\t\t\t//03 = นำส่งเงินรายได้แล้ว\r\n");
      out.write("\t\t\t//05 = ยกเลิกการนำส่งเงิน\r\n");
      out.write("\t\t\tdocument.getElementById('compare_case_no_1').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('compare_case_no_2').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('imgCompareCaseDate').style.display='none';\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f54(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f55(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\tdocument.getElementById('province2').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('district2').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('tambol2').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('province3').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('district3').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('tambol3').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('managetype1').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('managetype2').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('imgSueStaffName').style.display='none';\r\n");
      out.write("\t\t\tdocument.getElementById('compare_authority_id').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('indictment_id').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('administration').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('accuser_testimony').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('case_fine').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('calShareMoney').style.display='none';\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction SendIncome(){\r\n");
      out.write("\t\t\t//03 = นำส่งเงินรายได้แล้ว\r\n");
      out.write("\t\t\tdocument.getElementById('btnSave').style.display='none';\r\n");
      out.write("\t\t\tdocument.getElementById('btnCancel').style.display='none';\r\n");
      out.write("\t\t\tdocument.getElementById('treasury_money_p').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('bribe_money_p').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('reward_money_p').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('treasury_money').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('bribe_money').disabled=true;\r\n");
      out.write("\t\t\tdocument.getElementById('reward_money').disabled=true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t   \r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f56(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f57(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f58(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    _jspx_th_c_005furl_005f1.setValue("process?action=Caseadjust&cmd=list&default=Y");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.id == null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${edlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("off");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t          <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.short_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode == db.offcode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreak_type == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreak_type == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent(null);
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent(null);
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.have_culprit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent(null);
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.have_culprit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent(null);
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.issentcourt == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent(null);
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent(null);
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent(null);
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
    if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f14.setParent(null);
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f15.setParent(null);
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
    if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:none;");
        int evalDoAfterBody = _jspx_th_c_005fif_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f16.setParent(null);
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f17.setParent(null);
    _jspx_th_c_005fif_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
    if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f17);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f18.setParent(null);
    _jspx_th_c_005fif_005f18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f18 = _jspx_th_c_005fif_005f18.doStartTag();
    if (_jspx_eval_c_005fif_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f19.setParent(null);
    _jspx_th_c_005fif_005f19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f19 = _jspx_th_c_005fif_005f19.doStartTag();
    if (_jspx_eval_c_005fif_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f20.setParent(null);
    _jspx_th_c_005fif_005f20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f20 = _jspx_th_c_005fif_005f20.doStartTag();
    if (_jspx_eval_c_005fif_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f21.setParent(null);
    _jspx_th_c_005fif_005f21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f21 = _jspx_th_c_005fif_005f21.doStartTag();
    if (_jspx_eval_c_005fif_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f21);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f22.setParent(null);
    _jspx_th_c_005fif_005f22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f22 = _jspx_th_c_005fif_005f22.doStartTag();
    if (_jspx_eval_c_005fif_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_name\" type=\"text\" class=\"textview\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f22);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f23.setParent(null);
    _jspx_th_c_005fif_005f23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f23 = _jspx_th_c_005fif_005f23.doStartTag();
    if (_jspx_eval_c_005fif_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t    \t<input name=\"scene_name\" type=\"text\" class=\"text\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("\t    \t<font style=\"color:red\">*</font>\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f23);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f24.setParent(null);
    _jspx_th_c_005fif_005f24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f24 = _jspx_th_c_005fif_005f24.doStartTag();
    if (_jspx_eval_c_005fif_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f24);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pvlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("pv");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t       \t  \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f25(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t       \t  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_code == db.scene_province}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f25 = _jspx_th_c_005fif_005f25.doStartTag();
    if (_jspx_eval_c_005fif_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f25);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f26.setParent(null);
    _jspx_th_c_005fif_005f26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f26 = _jspx_th_c_005fif_005f26.doStartTag();
    if (_jspx_eval_c_005fif_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_no\" type=\"text\" class=\"textview\" size=\"8\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t      &nbsp;&nbsp; หมู่ :\r\n");
        out.write("\t\t    <input name=\"scene_moo\" type=\"text\" class=\"textview\" size=\"5\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f26);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f27 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f27.setParent(null);
    _jspx_th_c_005fif_005f27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f27 = _jspx_th_c_005fif_005f27.doStartTag();
    if (_jspx_eval_c_005fif_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    <input name=\"scene_no\" type=\"text\" class=\"text\" size=\"8\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t      &nbsp;&nbsp; หมู่ :\r\n");
        out.write("\t\t    <input name=\"scene_moo\" type=\"text\" class=\"text\" size=\"5\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("      \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f27);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f28 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f28.setParent(null);
    _jspx_th_c_005fif_005f28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f28 = _jspx_th_c_005fif_005f28.doStartTag();
    if (_jspx_eval_c_005fif_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f28);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f29 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f29.setParent(null);
    _jspx_th_c_005fif_005f29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f29 = _jspx_th_c_005fif_005f29.doStartTag();
    if (_jspx_eval_c_005fif_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_soi\" type=\"text\" class=\"textview\" id=\"scene_soi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f29);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f30(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f30 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f30.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f30.setParent(null);
    _jspx_th_c_005fif_005f30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f30 = _jspx_th_c_005fif_005f30.doStartTag();
    if (_jspx_eval_c_005fif_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_soi\" type=\"text\" class=\"text\" id=\"scene_soi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\"  />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f30);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f31(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f31 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f31.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f31.setParent(null);
    _jspx_th_c_005fif_005f31.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f31 = _jspx_th_c_005fif_005f31.doStartTag();
    if (_jspx_eval_c_005fif_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f31);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f32(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f32 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f32.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f32.setParent(null);
    _jspx_th_c_005fif_005f32.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f32 = _jspx_th_c_005fif_005f32.doStartTag();
    if (_jspx_eval_c_005fif_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_road\" type=\"text\" class=\"textview\" id=\"scene_road\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f32);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f33(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f33 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f33.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f33.setParent(null);
    _jspx_th_c_005fif_005f33.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f33 = _jspx_th_c_005fif_005f33.doStartTag();
    if (_jspx_eval_c_005fif_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_road\" type=\"text\" class=\"text\" id=\"scene_road\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f33);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f34(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f34 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f34.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f34.setParent(null);
    _jspx_th_c_005fif_005f34.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f34 = _jspx_th_c_005fif_005f34.doStartTag();
    if (_jspx_eval_c_005fif_005f34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"police_station\" type=\"text\" class=\"textview\" size=\"22\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.police_station}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f34);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f35 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f35.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f35.setParent(null);
    _jspx_th_c_005fif_005f35.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f35 = _jspx_th_c_005fif_005f35.doStartTag();
    if (_jspx_eval_c_005fif_005f35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"police_station\" type=\"text\" class=\"text\" size=\"22\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.police_station}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f35);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f36(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f36 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f36.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f36.setParent(null);
    _jspx_th_c_005fif_005f36.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aalsize >= 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f36 = _jspx_th_c_005fif_005f36.doStartTag();
    if (_jspx_eval_c_005fif_005f36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f36);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f37(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f37 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f37.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f37.setParent(null);
    _jspx_th_c_005fif_005f37.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f37 = _jspx_th_c_005fif_005f37.doStartTag();
    if (_jspx_eval_c_005fif_005f37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"coordinate_x\" type=\"text\" class=\"textview\" size=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_x}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("\t      \t&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t     \t ลองจิจูด :&nbsp;&nbsp;\r\n");
        out.write("\t      \t<input name=\"coordinate_y\" type=\"text\" class=\"textview\" size=\"5\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_y}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f37);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f38(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f38 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f38.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f38.setParent(null);
    _jspx_th_c_005fif_005f38.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f38 = _jspx_th_c_005fif_005f38.doStartTag();
    if (_jspx_eval_c_005fif_005f38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"coordinate_x\" type=\"text\" class=\"text\" size=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_x}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t      \t&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t     \t ลองจิจูด :&nbsp;&nbsp;\r\n");
        out.write("\t      \t<input name=\"coordinate_y\" type=\"text\" class=\"text\" size=\"5\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_y}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f38);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f39(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f39 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f39.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f39.setParent(null);
    _jspx_th_c_005fif_005f39.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.compare_case_date != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f39 = _jspx_th_c_005fif_005f39.doStartTag();
    if (_jspx_eval_c_005fif_005f39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"compare_case_date\" id=\"compare_case_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f39, _jspx_page_context))
          return true;
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f39);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f39, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f39);
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.compare_case_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f41(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f41 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f41.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f41.setParent(null);
    _jspx_th_c_005fif_005f41.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_none_office == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f41 = _jspx_th_c_005fif_005f41.doStartTag();
    if (_jspx_eval_c_005fif_005f41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f41);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f42 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f42.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f42.setParent(null);
    _jspx_th_c_005fif_005f42.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_none_office == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f42 = _jspx_th_c_005fif_005f42.doStartTag();
    if (_jspx_eval_c_005fif_005f42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdisplay:none;\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f42);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    _jspx_th_c_005fforEach_005f2.setVar("ed");
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${edlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ed.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f43(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write(">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ed.short_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f43 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f43.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    _jspx_th_c_005fif_005f43.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ed.offcode == compare_office}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f43 = _jspx_th_c_005fif_005f43.doStartTag();
    if (_jspx_eval_c_005fif_005f43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f43.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f43);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f44(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f44 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f44.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f44.setParent(null);
    _jspx_th_c_005fif_005f44.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_none_office == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f44 = _jspx_th_c_005fif_005f44.doStartTag();
    if (_jspx_eval_c_005fif_005f44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"case_non_office_name\" id=\"case_non_office_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_non_office_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" style=\"width: 195px;\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f44.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f44);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f45(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f45 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f45.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f45.setParent(null);
    _jspx_th_c_005fif_005f45.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.manage_type=='1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f45 = _jspx_th_c_005fif_005f45.doStartTag();
    if (_jspx_eval_c_005fif_005f45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f45.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f45);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f46(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f46 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f46.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f46.setParent(null);
    _jspx_th_c_005fif_005f46.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.manage_type=='2' ||cc.manage_type== null ||cc.manage_type== ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f46 = _jspx_th_c_005fif_005f46.doStartTag();
    if (_jspx_eval_c_005fif_005f46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
        int evalDoAfterBody = _jspx_th_c_005fif_005f46.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f46);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    _jspx_th_c_005fforEach_005f3.setVar("ca");
    _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${calist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ca.authority_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f47(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write(">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ca.authority_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f47 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f47.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    _jspx_th_c_005fif_005f47.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ca.authority_code == cc.compare_authority_id }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f47 = _jspx_th_c_005fif_005f47.doStartTag();
    if (_jspx_eval_c_005fif_005f47 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f47.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f47);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent(null);
    _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inclist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f4.setVar("inc");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f48(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write(" >\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f48 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f48.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    _jspx_th_c_005fif_005f48.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_id == cc.indictment_id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f48 = _jspx_th_c_005fif_005f48.doStartTag();
    if (_jspx_eval_c_005fif_005f48 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f48.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f48);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent(null);
    _jspx_th_c_005fforEach_005f5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inclist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f5.setVar("inc");
    _jspx_th_c_005fforEach_005f5.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tincid[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(']');
          out.write('=');
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tcaselaw[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(']');
          out.write('=');
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tpenaltylaw[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(']');
          out.write('=');
          out.write('"');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.penalty_case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f6.setParent(null);
    _jspx_th_c_005fforEach_005f6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aallist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f6.setVar("aal");
    _jspx_th_c_005fforEach_005f6.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f6 = _jspx_th_c_005fforEach_005f6.doStartTag();
      if (_jspx_eval_c_005fforEach_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"TblRow AlignLeft AlignCenter\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"TblRow AlignRight\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"aalFine\" name=\"aal_fine\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.fine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textViewNum\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"case_fine_div\"></div>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_c_005fset_005f1(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f6.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    _jspx_th_c_005fset_005f0.setVar("i_count");
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    _jspx_th_c_005fset_005f1.setVar("numLawbreaker");
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f2.setParent(null);
    _jspx_th_fmt_005fformatDate_005f2.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_005fformatDate_005f2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.pay_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f2 = _jspx_th_fmt_005fformatDate_005f2.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f49 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f49.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f49.setParent(null);
    _jspx_th_c_005fif_005f49.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_none_office == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f49 = _jspx_th_c_005fif_005f49.doStartTag();
    if (_jspx_eval_c_005fif_005f49 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\tsetOfficeProvince('province2','district2','tambol2',\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${compare_office}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\");   //ที่ทำการเปรียบเทียบ\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f49.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f49);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f50(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f50 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f50.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f50.setParent(null);
    _jspx_th_c_005fif_005f50.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.id == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f50 = _jspx_th_c_005fif_005f50.doStartTag();
    if (_jspx_eval_c_005fif_005f50 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\tsetOfficeProvince('province3','district3','tambol3',\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\");  //ที่อยู่ของผู้กล่าวโทษ\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f50.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f50);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f51(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f51 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f51.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f51.setParent(null);
    _jspx_th_c_005fif_005f51.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f51 = _jspx_th_c_005fif_005f51.doStartTag();
    if (_jspx_eval_c_005fif_005f51 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\tdisplayMoney(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.birbe_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(',');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.treasury_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(',');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.reward_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(");\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f51.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f51);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f52(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f52 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f52.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f52.setParent(null);
    _jspx_th_c_005fif_005f52.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_none_office == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f52 = _jspx_th_c_005fif_005f52.doStartTag();
    if (_jspx_eval_c_005fif_005f52 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t  \tfrmvalidator.addValidation(\"compare_office\",\"req\",\"กรุณากรอกที่ทำการ\");\r\n");
        out.write("\t  ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f52.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f52);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f53(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f53 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f53.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f53.setParent(null);
    _jspx_th_c_005fif_005f53.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_none_office == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f53 = _jspx_th_c_005fif_005f53.doStartTag();
    if (_jspx_eval_c_005fif_005f53 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t  \tfrmvalidator.addValidation(\"case_non_office_name\",\"req\",\"กรุณากรอกที่ทำการเปรียบเทียบ\");\r\n");
        out.write("\t  ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f53.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f53);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f54(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f54 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f54.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f54.setParent(null);
    _jspx_th_c_005fif_005f54.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_none_office == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f54 = _jspx_th_c_005fif_005f54.doStartTag();
    if (_jspx_eval_c_005fif_005f54 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t//document.getElementById('compare_office').style.display='none';\r\n");
        out.write("\t\t\t\tdocument.getElementById('compare_office').disabled=true;\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f54.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f54);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f55(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f55 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f55.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f55.setParent(null);
    _jspx_th_c_005fif_005f55.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_none_office == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f55 = _jspx_th_c_005fif_005f55.doStartTag();
    if (_jspx_eval_c_005fif_005f55 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t  \t\tdocument.getElementById('case_non_office_name').disabled=true;\r\n");
        out.write("\t\t  \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f55.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f55);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f56(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f56 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f56.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f56.setParent(null);
    _jspx_th_c_005fif_005f56.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(db.compare_status == '02' || db.compare_status == '03' || db.compare_status == '05') && (cc.case_status == '2' || cc.case_status == '3')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f56 = _jspx_th_c_005fif_005f56.doStartTag();
    if (_jspx_eval_c_005fif_005f56 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<script>\r\n");
        out.write("\t\t\tPayFined();\r\n");
        out.write("\t\t</script>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f56.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f56);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f57(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f57 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f57.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f57.setParent(null);
    _jspx_th_c_005fif_005f57.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(db.compare_status == '03' && cc.case_status == '3')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f57 = _jspx_th_c_005fif_005f57.doStartTag();
    if (_jspx_eval_c_005fif_005f57 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<script>\r\n");
        out.write("\t\t\tSendIncome();\r\n");
        out.write("\t\t</script>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f57.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f57);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f58(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f58 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f58.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f58.setParent(null);
    _jspx_th_c_005fif_005f58.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEdit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f58 = _jspx_th_c_005fif_005f58.doStartTag();
    if (_jspx_eval_c_005fif_005f58 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<script>\r\n");
        out.write("\t\t\tPayFined();\r\n");
        out.write("\t\t\tSendIncome();\r\n");
        out.write("\t\t</script>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f58.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f58);
    return false;
  }
}
