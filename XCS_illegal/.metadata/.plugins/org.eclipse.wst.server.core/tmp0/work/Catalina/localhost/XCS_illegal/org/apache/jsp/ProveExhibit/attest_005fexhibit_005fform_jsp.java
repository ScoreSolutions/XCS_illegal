package org.apache.jsp.ProveExhibit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class attest_005fexhibit_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/ProveExhibit/../Protect/arrest_detailshow.jsp");
    _jspx_dependants.add("/ProveExhibit/../Protect/showindictment.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\" ></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Pke_Compare.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Reports.js'></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("function toggle() {\r\n");
      out.write(" if( document.getElementById(\"a\").checked ==false ){\r\n");
      out.write("  document.getElementById(\"hidethis\").style.display = '';\r\n");
      out.write("  document.getElementById(\"hidethis2\").style.display = '';\r\n");
      out.write(" }else{\r\n");
      out.write("  document.getElementById(\"hidethis\").style.display = 'none';\r\n");
      out.write("  document.getElementById(\"hidethis2\").style.display = 'none';\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function ChkDupExhibitNo(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar vTrackNo = document.dataform.track_no.value;\r\n");
      out.write("\tvar ExhibitNo = document.dataform.exhibit_report_no1.value + \"/\" + document.dataform.exhibit_report_no2.value;\r\n");
      out.write("\t//var vOffcode = document.dataform.staff_prove_offcode.value;\r\n");
      out.write("\tvar vOffcode = document.dataform.offcode.value;\r\n");
      out.write("\t\r\n");
      out.write("\tPke_Compare.ChkDupExhibitReportNo(vTrackNo, ExhibitNo, vOffcode, function(data){\r\n");
      out.write("\t\tif(data != \"\"){\r\n");
      out.write("\t\t\tdocument.getElementById(\"exhibit_report_no1\").value = \"\";\r\n");
      out.write("\t\t\tdocument.getElementById(\"exhibit_report_no2\").value = \"\";\r\n");
      out.write("\t\t\talert(data)\r\n");
      out.write("\t\t\tdocument.getElementById(\"exhibit_report_no1\").select();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function PrintILL_P038(){\r\n");
      out.write("\twriteTranLog('พิมพ์ ส.ส.2/4');\r\n");
      out.write("\tReports.ReportUrl(function(data){\r\n");
      out.write("\t\tif(data != \"\"){\r\n");
      out.write("\t\t\twindow.open(data + \"ReportName=ILL_P038&getTrackNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&vReportType=PDF&time=\" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\twindow.open('process?action=Report&__report=ILL_P038&__formatt=pdf&getTrackNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&time=");
      out.print(new java.util.Date().getTime());
      out.write("' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function PrintILL2013(){\r\n");
      out.write("\twriteTranLog('พิมพ์บันทึกการตรวจรับของกลาง');\r\n");
      out.write("\tReports.ReportUrl(function(data){\r\n");
      out.write("\t\tif(data != \"\"){\r\n");
      out.write("\t\t\twindow.open(data + \"ReportName=ILL2013&getTrackNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&vReportType=PDF&time=\" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\twindow.open('process?action=Report&__report=ILL2013&__formatt=pdf&getTrackNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&time=");
      out.print(new java.util.Date().getTime());
      out.write("' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("    <form method=\"post\" name=\"dataform\" action='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("' >\r\n");
      out.write("    \r\n");
      out.write("\t\t<!-- Body -->\r\n");
      out.write("\t\t<table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td width=\"100%\" align=\"left\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"99%\"><span class=\"websitename\">การพิสูจน์ของกลาง</span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t<input name=\"track_no_p\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                \t<input name=\"chkcaselast\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.chkcaselast}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("                \t\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<input\tname=\"btnBack\" type=\"button\" class=\"barButton\"\t\tvalue=\"กลับหน้าค้นหา\" onclick=\"writeTranLog('“กลับหน้าค้นหา');window.location.href='");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("' \">\r\n");
      out.write("\t\t\t\t\t<input name=\"btnPrint\"  type=\"button\" class=\"barButton\" value=\"พิมพ์ ส.ส.2/4\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"PrintILL_P038();\" >\r\n");
      out.write("\t\t\t\t\t<input name=\"btnPrintILL2013\" type=\"button\" class=\"barButton\" value=\"พิมพ์บันทึกการตรวจรับของกลาง\"\r\n");
      out.write("\t\t\t\t\t\tonClick=\"PrintILL2013();\" ></input>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("               \r\n");
      out.write("\t\t\t\t\t\t<!-- รายละเอียดบันทึกการจับกุม-->\r\n");
      out.write("\t\t\t\t\t\t");
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
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      /> บุคคลทั่วไป &nbsp;&nbsp;\r\n");
      out.write("      <input name=\"lawbreakertype\" type=\"radio\" value=\"C\" disabled=\"disabled\"\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write(" >90 พ.ร.บ. สุรา พ.ศ.2493</option>\r\n");
      out.write("\t      \t<option value=\"2\" ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write(" >91 พ.ร.บ.ยาสูบ พ.ศ.2509</option>\r\n");
      out.write("\t      \t<option value=\"3\" ");
      if (_jspx_meth_c_005fif_005f8(_jspx_page_context))
        return;
      out.write(" >92 พ.ร.บ.ไพ่</option>\r\n");
      out.write("\t      \t<option value=\"4\" ");
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      /> มีตัว &nbsp;&nbsp;\r\n");
      out.write("      <input name=\"have_culprit\" id=\"have_culpri\" type=\"radio\" value=\"N\" onclick=\"toggle();\" disabled=\"disabled\"\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fif_005f11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      /> ไม่มีตัว&nbsp;&nbsp;\r\n");
      out.write("      <input name=\"issentcourt\" id=\"issentcour\" type=\"checkbox\" disabled=\"disabled\" onclick=\"toggle();\"\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fif_005f12(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f13(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f14(_jspx_page_context))
        return;
      out.write(" > เจ้าหน้าที่กรมสรรพสามิต </td>\r\n");
      out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"3\"  ");
      if (_jspx_meth_c_005fif_005f15(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f16(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f17(_jspx_page_context))
        return;
      out.write("\" \r\n");
      out.write("              \tonClick=\"ch_accuserType();window.open('process?action=Divide_staff_popForArrest&formname=accuser&id=accuser_idcardno&posname=posname&poscode=accuser_poscode&offname=offname&offcode=accuser_offcode&actype='+document.dataform.mu_accuserType.value , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" /> \r\n");
      out.write("              \t<font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr height=\"25\">\r\n");
      out.write("        <td>\r\n");
      out.write("        \t<input name=\"accuserType\" type=\"radio\" value=\"1\" ");
      if (_jspx_meth_c_005fif_005f18(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f19(_jspx_page_context))
        return;
      out.write(" >เจ้าหน้าที่สรรพสามิตพื้นที่ \r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("        \t<input name=\"accuserType\" type=\"radio\" value=\"4\" ");
      if (_jspx_meth_c_005fif_005f20(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f21(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f22(_jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_c_005fif_005f23(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f24(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f25(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td  align=\"right\">จังหวัด :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <select name=\"scene_province\" id=\"province\" ");
      if (_jspx_meth_c_005fif_005f26(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f28(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f29(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td align=\"right\">อำเภอ :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <select name=\"district\" id=\"district\"  style=\"width:200px\" ");
      if (_jspx_meth_c_005fif_005f30(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f31(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f32(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td align=\"right\">ตำบล :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("       \t<select name=\"tambol\" id=\"tambol\"  style=\"width:200px\" ");
      if (_jspx_meth_c_005fif_005f33(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f34(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f35(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("    <td align=\"right\">สถานีตำรวจท้องที่เกิดเหตุ :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f36(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f37(_jspx_page_context))
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
      if (_jspx_meth_c_005fif_005f38(_jspx_page_context))
        return;
      out.write(" disabled=\"disabled\"/>\r\n");
      out.write("      ข้อกล่าวหาร่วมกัน </td>\r\n");
      out.write("    <td  align=\"right\">ละติจูด :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f39(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f40(_jspx_page_context))
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
      out.write("                              <!-- ข้อกล่าวหา-->\r\n");
      out.write("                              ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/Popup.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var incmaxrow=1; // jsp  Count  config\r\n");
      out.write("var incstartrow=2;\r\n");
      out.write("var inceditrow = -1;\r\n");
      out.write("var inceditna = 0;\r\n");
      out.write("\r\n");
      out.write("function incinsRow(myTable,maxrox,data1,data2,data3,data4,id,data6)\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("var row;\r\n");
      out.write("var x=document.getElementById(myTable).insertRow(incmaxrow);\r\n");
      out.write("incmaxrow++;\r\n");
      out.write("row = incmaxrow - 1;\r\n");
      out.write("var y1=x.insertCell(0);\r\n");
      out.write("var y2=x.insertCell(1);\r\n");
      out.write("var y3=x.insertCell(2);\r\n");
      out.write("var y4=x.insertCell(3);\r\n");
      out.write("var y5=x.insertCell(4);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var exp = new Date();\r\n");
      out.write("var s = exp.getTime();\r\n");
      out.write("\r\n");
      out.write("y1.innerHTML=\"<input  readonly class='textboxlist' size='1' name='tc_id' value='\" + row + \"' />\"+\"<input type=\\\"hidden\\\" name=\\\"aai_id\\\" value=\\\"\"+id+\"\\\">\";\r\n");
      out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"inccheckbox\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"incref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
      out.write("y3.innerHTML= data1+ \"<input type=\\\"hidden\\\" name=\\\"aai_case_law_id\\\" value=\\\"\" +data1+ \"\\\">\"\r\n");
      out.write("+ \"<input type=\\\"hidden\\\" name=\\\"aai_indictment_id\\\" value=\\\"\" +data6+ \"\\\">\" ;\r\n");
      out.write("y4.innerHTML=data2+\"<input type=\\\"hidden\\\" id=\\\"aai_penalty_case_law_id\\\" name=\\\"aai_penalty_case_law_id\\\" value=\\\"\"+data2+\"\\\">\";\r\n");
      out.write("y5.innerHTML=data3+\"<input type=\\\"hidden\\\" name=\\\"aai_guilt_base\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
      out.write("+\"<input type=\\\"hidden\\\" name=\\\"aai_exhibit_wild\\\" value=\\\"\"+data4+\"\\\">\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("function incdelRow(myTable)\r\n");
      out.write("{\r\n");
      out.write("if (incmaxrow>1)\r\n");
      out.write("{\r\n");
      out.write("var x=document.getElementById(myTable).deleteRow(myTable,incmaxrow-1);\r\n");
      out.write("incmaxrow--\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function incalternate(id){\r\n");
      out.write(" if(document.getElementsByTagName){\r\n");
      out.write("   var table = document.getElementById(id);\r\n");
      out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
      out.write("   for(i = 0; i < rows.length; i++){\r\n");
      out.write(" //manipulate rows\r\n");
      out.write("     if(i % 2 == 0){\r\n");
      out.write("       rows[i].className = \"even\";\r\n");
      out.write("     }else{\r\n");
      out.write("       rows[i].className = \"odd\";\r\n");
      out.write("     }\r\n");
      out.write("   }\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function increrun_id()\r\n");
      out.write("{\r\n");
      out.write("if (!document.dataform.tc_id.length)\r\n");
      out.write("{\r\n");
      out.write("document.dataform.tc_id.value=1;\r\n");
      out.write("}\r\n");
      out.write("for (var i=0; i < document.dataform.tc_id.length; i++)\r\n");
      out.write("   {\r\n");
      out.write("\t\tdocument.dataform.tc_id[i].value=i+1;\r\n");
      out.write("   }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function incdelRown(myTable,Rown)\r\n");
      out.write("{\r\n");
      out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
      out.write("incmaxrow--\r\n");
      out.write("}\r\n");
      out.write("function incopenmodal(myTable)\r\n");
      out.write("{\r\n");
      out.write("var  dup=0;\r\n");
      out.write("var data = window.showModalDialog('process?action=Indictment_pop&cmd=add' , self , 'dialogWidth=700px,Height=400px');\r\n");
      out.write("if(data != null){\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfor (var i=0; i < data.length; i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdup=0;\r\n");
      out.write("\t\t\t\tif (incmaxrow>1)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tfor (var j=0; j < document.dataform.aai_indictment_id.length; j++)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t//alert (document.dataform.aai_indictment_id[j].value+ \"-\" +data[i][5]);\r\n");
      out.write("\t\t\t\t\tif (document.dataform.aai_indictment_id[j].value==data[i][5])\r\n");
      out.write("\t\t\t\t\t\t{dup=1;}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (dup==0)\r\n");
      out.write("\t    \t{incinsRow(myTable,incmaxrow,data[i][1],data[i][2],data[i][3],data[i][4],'',data[i][5]);}\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function incget_check_value(myTable)\r\n");
      out.write("{\r\n");
      out.write("var c_value = \"\";\r\n");
      out.write("var x=\"\";\r\n");
      out.write("if (!document.dataform.inccheckbox.length)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(myTable).deleteRow(1);\r\n");
      out.write("}\r\n");
      out.write("for (var i=0; i < document.dataform.inccheckbox.length; i++)\r\n");
      out.write("   {\r\n");
      out.write("\r\n");
      out.write("   if (document.dataform.inccheckbox[i].checked)\r\n");
      out.write("      {\r\n");
      out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
      out.write("\t\tdocument.getElementById(myTable).deleteRow(i);\r\n");
      out.write("\t\ti--;\r\n");
      out.write("\t\tincmaxrow--;\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("   //alert(incmaxrow-1);\r\n");
      out.write("   increrun_id();\r\n");
      out.write("}\r\n");
      out.write("function incrender(myTable)\r\n");
      out.write("{\r\n");
      out.write(" for (i=1;i<=incdata1.length-1;i++)\r\n");
      out.write("    {\r\n");
      out.write("        incinsRow(myTable,i,incdata1[i],incdata2[i],incdata3[i],incdata4[i],incdata5[i],incdata6[i]);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("var incdata1 =new Array();\r\n");
      out.write("var incdata2 =new Array();\r\n");
      out.write("var incdata3 =new Array();\r\n");
      out.write("var incdata4 =new Array();\r\n");
      out.write("var incdata5 =new Array();\r\n");
      out.write("var incdata6 =new Array();\r\n");
      out.write("\r\n");
      out.write("function incCheck(chkcont,chk)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif(chkcont.checked==true){\r\n");
      out.write("\t\t\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\t\t\tchk[i].checked = true ;\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\t\t\tchk[i].checked = false ;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td width=\"20%\" height=\"25\" align=\"right\" valign=\"top\">ข้อกล่าวหา :&nbsp;</td>\r\n");
      out.write("    <td width=\"80%\" colspan=\"3\">\r\n");
      out.write("        <table class=\"tableList\" id=incTable width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("             <tr class=\"TblHeaderColumn AlignCenter\">\r\n");
      out.write("                  <td width=\"10%\">ลำดับที่</td>\r\n");
      out.write("                  <td width=\"5%\" ><input type=\"checkbox\" name=\"incallCheckbox\" value=\"\" onClick=\"incCheck(this,document.dataform.inccheckbox);\" />\r\n");
      out.write("\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"inccheckbox\"></td>\r\n");
      out.write("                  <td width=\"20%\">มาตรา</td>\r\n");
      out.write("                  <td width=\"15%\">บทกำหนดโทษ</td>\r\n");
      out.write("                  <td width=\"50%\">ข้อกล่าวหา</td>\r\n");
      out.write("             </tr>\r\n");
      out.write("\t\t\t ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("      <td colspan=\"4\" height=\"25\" align=\"right\">&nbsp;</td>\r\n");
      out.write("   </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script>\r\n");
      out.write("incrender('incTable');\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("\t\t\t\t\t\t\t  <tr class=\"bgRowGray\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan=\"4\"><strong>พิสูจน์ของกลาง</strong> <input type=\"hidden\" name=\"update\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${update}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td height=\"10\" colspan=\"4\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("                                        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">รายงานการพิสูจน์เลขที่ :&nbsp;</td>\r\n");
      out.write("                                        <td width=\"30%\">\r\n");
      out.write("                                             <input type=\"Text\" id=\"exhibit_report_no1\" name=\"exhibit_report_no1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap_id_1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textNum\" onkeypress=\"ChkMinusInt(this);\" onBlur=\"ChkDupExhibitNo();\" size=\"5\"/> /&nbsp;\r\n");
      out.write("                                             <input type=\"Text\" id=\"exhibit_report_no2\" name=\"exhibit_report_no2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap_id_2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textNum\" onkeypress=\"ChkMinusInt(this);\" onBlur=\"ChkDupExhibitNo();\" size=\"4\"/>\r\n");
      out.write("                                             <font style=\"color:red\">*</font>\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        \r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"20%\"  height=\"25\" align=\"right\">เลขที่คดี(สมุดรับคำกล่าวโทษ) :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"30%\" ><input type=\"text\" name=\"case_id\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"10\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\" >วันที่รับเรื่องพิสูจน์ : </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f41(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f42 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f42.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f42.setParent(null);
      _jspx_th_c_005fif_005f42.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap.taken_date == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f42 = _jspx_th_c_005fif_005f42.doStartTag();
      if (_jspx_eval_c_005fif_005f42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"taken_date\" id=\"taken_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
          //  fmt:formatDate
          org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
          _jspx_th_fmt_005fformatDate_005f2.setPageContext(_jspx_page_context);
          _jspx_th_fmt_005fformatDate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f42);
          _jspx_th_fmt_005fformatDate_005f2.setValue(new Date() );
          _jspx_th_fmt_005fformatDate_005f2.setPattern("dd/MM/yyyy");
          int _jspx_eval_fmt_005fformatDate_005f2 = _jspx_th_fmt_005fformatDate_005f2.doStartTag();
          if (_jspx_th_fmt_005fformatDate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
            return;
          }
          _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
          out.write("\"  />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:NewCssCal('taken_date','ddmmyyyy')\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<img id=\"imgTaken_date\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>เวลา\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"taken_time\" name=\"taken_time\" type=\"text\" class=\"textbox\" size=\"5\" maxlength=\"5\" value=\"");
          //  fmt:formatDate
          org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
          _jspx_th_fmt_005fformatDate_005f3.setPageContext(_jspx_page_context);
          _jspx_th_fmt_005fformatDate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f42);
          _jspx_th_fmt_005fformatDate_005f3.setValue(new Date() );
          _jspx_th_fmt_005fformatDate_005f3.setPattern("HH:mm");
          int _jspx_eval_fmt_005fformatDate_005f3 = _jspx_th_fmt_005fformatDate_005f3.doStartTag();
          if (_jspx_th_fmt_005fformatDate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
            return;
          }
          _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
          out.write("\" onkeypress=\"txtTime_OnKeyPress(this);\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f42.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f42);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f42);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\">วันที่รับคดี :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input name=\"\" type=\"text\" size=\"10\"  class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  /> เวลา\r\n");
      out.write("\t\t\t\t\t\t\t\t  <input name=\"\" type=\"text\" size=\"7\"  class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\" >ชื่อผู้พิสูจน์ : </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"staff_name_prove\" name=\"staff_name_prove\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff_name_prove}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"29\" />\r\n");
      out.write("                                    <input type=\"hidden\" id=\"staff_idcardno_prove\" name=\"staff_idcardno_prove\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff_idcardno_prove}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("            \t\t\t\t\t\t<img id=\"imgStaff_name_prove\" src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\" onClick=\"window.open('process?action=Divide_staff_pop&formname=staff_name_prove&id=staff_idcardno_prove&posname=staff_prove_posname&poscode=staff_prove_poscode&offcode=staff_prove_offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" /> \r\n");
      out.write("            \t\t\t\t\t\t<font style=\"color:red\">*</font> \r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\">ตำแหน่ง(กรณีปฏิบัติราชการแทน) :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"replace_position\" name=\"replace_position\" type=\"text\" size=\"25\"  class=\"textbox\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap.replace_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\" >ตำแหน่ง : </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td >\r\n");
      out.write("                                    <input type=\"text\" id=\"staff_prove_posname\" name=\"staff_prove_posname\" size=\"33\"  class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff_prove_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"staff_prove_poscode\" name=\"staff_prove_poscode\" size=\"33\"  class=\"textview\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff_prove_poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"staff_prove_offcode\" name=\"staff_prove_offcode\" size=\"33\"  class=\"textview\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff_prove_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\">มูลค่าภาษี :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"tax_value\" name=\"tax_value\" type=\"text\" size=\"10\"  class=\"textNum\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap.tax_value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onkeypress=\"ChkMinusDbl(this);\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t/> บาท\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t  <tr >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td   colspan=\"4\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td  class=\"bgRowGray\" colspan=\"4\"><strong>1. รายการบัญชีสิ่งของ</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td  colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- =========================================================สิ่งของ======================================================================================  -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var dumaxrow=1; // jsp  Count  config\r\n");
      out.write("var dustartrow=2;\r\n");
      out.write("var dueditrow = -1;\r\n");
      out.write("var dueditna = 0;\r\n");
      out.write("\r\n");
      out.write("function duinsRow(myTable,dumaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,id,text1,text2,text3,text4,text5,data26,data27,data28,isEdit, rows)\r\n");
      out.write("{\t\r\n");
      out.write("\tvar row;\r\n");
      out.write("\tvar x;\r\n");
      out.write("\r\n");
      out.write("\tif(isEdit==\"N\"){ //กรณีเพิ่มรายการ\r\n");
      out.write("\t\tx=document.getElementById(myTable).insertRow(dumaxrow);\r\n");
      out.write("\t\tdumaxrow++;\r\n");
      out.write("\t\trow = dumaxrow - 1;\r\n");
      out.write("\r\n");
      out.write("\t\tvar y1=x.insertCell(0);\r\n");
      out.write("\t\tvar y2=x.insertCell(1);\r\n");
      out.write("\t\tvar y3=x.insertCell(2);\r\n");
      out.write("\t\tvar y4=x.insertCell(3);\r\n");
      out.write("\t\tvar y5=x.insertCell(4);\r\n");
      out.write("\t\tvar y6=x.insertCell(5);\r\n");
      out.write("\t\tvar y7=x.insertCell(6);\r\n");
      out.write("\t\tvar y8=x.insertCell(7);\r\n");
      out.write("\t\tvar y9=x.insertCell(8);\r\n");
      out.write("\t\tvar y10=x.insertCell(9);\r\n");
      out.write("\t\tvar y11=x.insertCell(10);\r\n");
      out.write("\t\tvar y12=x.insertCell(11);\r\n");
      out.write("\t}else{  //กรณีแก้ไข\r\n");
      out.write("\t\tx=document.getElementById(myTable).rows[rows];\r\n");
      out.write("\t\trow = rows;\r\n");
      out.write("\r\n");
      out.write("\t\tvar y1=x.cells(0);\r\n");
      out.write("\t\tvar y2=x.cells(1);\r\n");
      out.write("\t\tvar y3=x.cells(2);\r\n");
      out.write("\t\tvar y4=x.cells(3);\r\n");
      out.write("\t\tvar y5=x.cells(4);\r\n");
      out.write("\t\tvar y6=x.cells(5);\r\n");
      out.write("\t\tvar y7=x.cells(6);\r\n");
      out.write("\t\tvar y8=x.cells(7);\r\n");
      out.write("\t\tvar y9=x.cells(8);\r\n");
      out.write("\t\tvar y10=x.cells(9);\r\n");
      out.write("\t\tvar y11=x.cells(10);\r\n");
      out.write("\t\tvar y12=x.cells(11);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar exp = new Date();\r\n");
      out.write("\tvar s = exp.getTime();\r\n");
      out.write("\t\r\n");
      out.write("\ty1.innerHTML=\"<input  readonly class='textboxlist' size='1' name='dutc_id' value='\" + row + \"' />\";\r\n");
      out.write("\tvar productDesc = data28;\r\n");
      out.write("\tif(data5!=\"\")\r\n");
      out.write("\t\tproductDesc += \" ชนิด\" + data5;\r\n");
      out.write("\tif(data7!=\"\")\r\n");
      out.write("\t\tproductDesc += \" ยี่ห้อ \" + data7;\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f43(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f46(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\tif (data8.substr(0,1)==\"O\")\r\n");
      out.write("\t\t{y5.innerHTML=\"นอกประเทศ\";}\r\n");
      out.write("\telse if(data8.substr(0,1)==\"I\")\r\n");
      out.write("\t\t{y5.innerHTML=\"ในประเทศ\";}\r\n");
      out.write("\telse\r\n");
      out.write("\t\t{y5.innerHTML=\"ไม่ระบุ\";}\r\n");
      out.write("\t\r\n");
      out.write("\tif (data15.substr(0,1)==\"1\")\r\n");
      out.write("\t\t{y6.innerHTML=\"ยึด\";}\r\n");
      out.write("\telse\r\n");
      out.write("\t\t{y6.innerHTML=\"คืน\";}\r\n");
      out.write("\r\n");
      out.write("\tif(text2 == \"โปรดเลือก\")\r\n");
      out.write("\t\ttext2 = \"\";\r\n");
      out.write("\tif(text3 == \"โปรดเลือก\")\r\n");
      out.write("\t\ttext3 = \"\";\r\n");
      out.write("\tif(text4 == \"โปรดเลือก\")\r\n");
      out.write("\t\ttext4 = \"\";\r\n");
      out.write("\t\r\n");
      out.write("\ty7.innerHTML=text1+\" \"+text2;\r\n");
      out.write("\ty8.innerHTML=data11+\" \"+text3;\r\n");
      out.write("\ty9.innerHTML=data13+\" \"+text4;\r\n");
      out.write("\tif (data1==\"\" || data1=='N')\r\n");
      out.write("\t\t{y10.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"isdomestichk\\\" disabled=\\\"true\\\"   value=\\\"\\\">\";}\r\n");
      out.write("\telse\r\n");
      out.write("\t\t{y10.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"isdomestichk\\\" disabled=\\\"true\\\" CHECKED value=\\\"\\\"><BR/>\"+text5;}\r\n");
      out.write("\t\r\n");
      out.write("\ty11.innerHTML=data17;\r\n");
      out.write("\ty12.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"aae_isexhibitco\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_duty_code\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_duty_name\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_product_code\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_product_name\\\" value=\\\"\"+data5+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_brand_code\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_brand_name\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_isdomestic\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_code\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_unit_code\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty_unit_code\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight\\\" value=\\\"\"+data13+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight_unit_code\\\" value=\\\"\"+data14+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_status\\\" value=\\\"\"+data15+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_exhibit_list\\\" value=\\\"\"+data16+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_exhibit_desc\\\" value=\\\"\"+data17+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_car_no\\\" value=\\\"\"+data18+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_remarks\\\" value=\\\"\"+data19+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_id\\\" value=\\\"\"+id+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_code_text\\\" value=\\\"\"+text1+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_unit_code_text\\\" value=\\\"\"+text2+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty_unit_code_text\\\" value=\\\"\"+text3+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight_unit_code_text\\\" value=\\\"\"+text4+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_case_id\\\" value=\\\"\"+text5+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_co_id\\\" value=\\\"\"+data26+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_group_id\\\" value=\\\"\"+data27+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_group_name\\\" value=\\\"\"+data28+\"\\\">\"\r\n");
      out.write("\t+data19;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function duforedit(row)\r\n");
      out.write("{\r\n");
      out.write("if (document.dataform.duref_id.length)\r\n");
      out.write("{\r\n");
      out.write("  for (var i=0; i < document.dataform.duref_id.length; i++)\r\n");
      out.write("   {\r\n");
      out.write("\t\tif (document.dataform.duref_id[i].value== row)\r\n");
      out.write("\t\t\t{//alert(i+1);\r\n");
      out.write("\t\t\tdueditrow = i+1;}\r\n");
      out.write("   }\r\n");
      out.write(" }\r\n");
      out.write(" else\r\n");
      out.write(" {//alert(\"1\");\r\n");
      out.write(" dueditrow = 1;}\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("function dudelRow(myTable)\r\n");
      out.write("{\r\n");
      out.write("if (dumaxrow>1)\r\n");
      out.write("{\r\n");
      out.write("var x=document.getElementById(myTable).deleteRow(myTable,dumaxrow-1);\r\n");
      out.write("dumaxrow--\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function dualternate(id){\r\n");
      out.write(" if(document.getElementsByTagName){\r\n");
      out.write("   var table = document.getElementById(id);\r\n");
      out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
      out.write("   for(i = 0; i < rows.length; i++){\r\n");
      out.write(" //manipulate rows\r\n");
      out.write("     if(i % 2 == 0){\r\n");
      out.write("       rows[i].className = \"even\";\r\n");
      out.write("     }else{\r\n");
      out.write("       rows[i].className = \"odd\";\r\n");
      out.write("     }\r\n");
      out.write("   }\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function durerun_id()\r\n");
      out.write("{\r\n");
      out.write("if (!document.dataform.dutc_id.length)\r\n");
      out.write("{\r\n");
      out.write("document.dataform.dutc_id.value=1;\r\n");
      out.write("}\r\n");
      out.write("for (var i=0; i < document.dataform.dutc_id.length; i++)\r\n");
      out.write("   {\r\n");
      out.write("\t\tdocument.dataform.dutc_id[i].value=i+1;\r\n");
      out.write("   }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function dudelRown(myTable,Rown)\r\n");
      out.write("{\r\n");
      out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
      out.write("dumaxrow--\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function duopenmodal(myTable)\r\n");
      out.write("{\r\n");
      out.write("var data = window.showModalDialog('process?action=Duty_table_list&cmd=list' , self , 'Width=500px,Height=400px');\r\n");
      out.write("\tif(data != null){\r\n");
      out.write("\t\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],\"\",data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],\"N\",null);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function dueditmodal(myTable, row)\r\n");
      out.write("{\r\n");
      out.write("\tdueditna= 1;\r\n");
      out.write("\tvar data = window.showModalDialog('process?action=Duty_table_list&cmd=list', self , 'Width=500px,Height=400px');\r\n");
      out.write("\tif(data != null){\r\n");
      out.write("\t\t//dudelRown(myTable,dueditrow);\r\n");
      out.write("\t\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],\"Y\", row);\r\n");
      out.write("\t}\r\n");
      out.write("\tdueditna = 0;\r\n");
      out.write("\tdurerun_id();\r\n");
      out.write("\twriteTranLog('เพิ่มบัญชีสิ่งของ');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function duCheck(chk)\r\n");
      out.write("{\r\n");
      out.write("if(document.dataform.duCheck_ctr.checked==true){\r\n");
      out.write("for (i = 0; i < duchk.length; i++)\r\n");
      out.write("duchk[i].checked = true ;\r\n");
      out.write("}else{\r\n");
      out.write("\r\n");
      out.write("for (i = 0; i < duchk.length; i++)\r\n");
      out.write("duchk[i].checked = false ;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function duget_check_value(myTable)\r\n");
      out.write("{\r\n");
      out.write("var c_value = \"\";\r\n");
      out.write("var x=dumaxrow;\r\n");
      out.write("if (!document.dataform.ducheck_list.length)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(myTable).deleteRow(1);\r\n");
      out.write("\tdumaxrow--;\r\n");
      out.write("\t writeTranLog('ลบรายการบัญชีสิ่งของ');\r\n");
      out.write("}\r\n");
      out.write("for (var i=0; i < document.dataform.ducheck_list.length; i++)\r\n");
      out.write("   {\r\n");
      out.write("   if (document.dataform.ducheck_list[i].checked)\r\n");
      out.write("      {\r\n");
      out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
      out.write("\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
      out.write("\t\ti--;\r\n");
      out.write("\t\tdumaxrow--;\r\n");
      out.write("      }\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   if(x!=dumaxrow){\r\n");
      out.write("\t    writeTranLog('ลบรายการบัญชีสิ่งของ');\r\n");
      out.write("\t    durerun_id();\r\n");
      out.write("\t    }\r\n");
      out.write("}\r\n");
      out.write("   function durender(myTable)\r\n");
      out.write("{\r\n");
      out.write(" for (i=1;i<=dudata1.length-1;i++)\r\n");
      out.write("    {\r\n");
      out.write("        duinsRow(myTable,i,dudata1[i],dudata2[i],dudata3[i],dudata4[i],dudata5[i],dudata6[i],dudata7[i],dudata8[i],dudata9[i],dudata10[i],dudata11[i],dudata12[i],dudata13[i],dudata14[i],dudata15[i],dudata16[i],dudata17[i],dudata18[i],dudata19[i],dudata20[i],dudata21[i],dudata22[i],dudata23[i],dudata24[i] ,dudata25[i],dudata26[i],dudata27[i],dudata28[i],\"N\",null);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var dudata1 =new Array();\r\n");
      out.write("var dudata2 =new Array();\r\n");
      out.write("var dudata3 =new Array();\r\n");
      out.write("var dudata4 =new Array();\r\n");
      out.write("var dudata5 =new Array();\r\n");
      out.write("var dudata6 =new Array();\r\n");
      out.write("var dudata7 =new Array();\r\n");
      out.write("var dudata8 =new Array();\r\n");
      out.write("var dudata9 =new Array();\r\n");
      out.write("var dudata10 =new Array();\r\n");
      out.write("var dudata11 =new Array();\r\n");
      out.write("var dudata12 =new Array();\r\n");
      out.write("var dudata13 =new Array();\r\n");
      out.write("var dudata14 =new Array();\r\n");
      out.write("var dudata15 =new Array();\r\n");
      out.write("var dudata16 =new Array();\r\n");
      out.write("var dudata17 =new Array();\r\n");
      out.write("var dudata18 =new Array();\r\n");
      out.write("var dudata19 =new Array();\r\n");
      out.write("var dudata20 =new Array();\r\n");
      out.write("var dudata21 =new Array();\r\n");
      out.write("var dudata22 =new Array();\r\n");
      out.write("var dudata23 =new Array();\r\n");
      out.write("var dudata24 =new Array();\r\n");
      out.write("var dudata25 =new Array();\r\n");
      out.write("var dudata26 =new Array();\r\n");
      out.write("var dudata27 =new Array();\r\n");
      out.write("var dudata28 =new Array();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function allCheck(chkcont,chk)\r\n");
      out.write("{\r\n");
      out.write("\t\tif(!chk.length){\r\n");
      out.write("\t\t\tif(chkcont.checked==true){\r\n");
      out.write("\t\t\t\tchk.checked = true ;\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tchk.checked = false ;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(chkcont.checked==true){\r\n");
      out.write("\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\tchk[i].checked = true ;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\tchk[i].checked = false ;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<!-- ====================================================================สิ่งของ===========================================================================  -->\r\n");
      out.write("<!-- บัญชีสิ่งของ-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("               <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("                    <tr id=\"likAddExhibit\">\r\n");
      out.write("                         <td>\r\n");
      out.write("                              <span class=\"spanLink\" onClick=\"duopenmodal('duTable')\">เพิ่มใหม่</span> |\r\n");
      out.write("                              <span class=\"spanLink\" onClick=\"duget_check_value('duTable')\">ลบรายการที่เลือก</span>\r\n");
      out.write("                         </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                         <td>\r\n");
      out.write("                                   <table id=\"duTable\" class=\"tableList\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                             <td width=\"28\"  height=\"15\" class=\"TblHeaderColumn AlignCenter\">ลำดับ</td>\r\n");
      out.write("                                             <td class=\"TblHeaderColumn aligncenter\"><input name=\"chkAll\" type=\"checkbox\" onClick=\"allCheck(this,document.dataform.ducheck_list);\"/></td>\r\n");
      out.write("                                             <td width=\"68\"  class=\"TblHeaderColumn \">ชนิดสินค้า</td>\r\n");
      out.write("                                             <td width=\"130\"  class=\"TblHeaderColumn \">ชื่อสินค้า</td>\r\n");
      out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">ใน / นอก</td>\r\n");
      out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">สถานะของกลาง</td>\r\n");
      out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">ขนาด</td>\r\n");
      out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">จำนวน</td>\r\n");
      out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">ปริมาณสุทธิ</td>\r\n");
      out.write("                                             <td width=\"97\"  class=\"TblHeaderColumn \">ของกลางร่วม(เลขที่คดี)</td>\r\n");
      out.write("                                             <td width=\"97\"  class=\"TblHeaderColumn \">รายละเอียด</td>\r\n");
      out.write("                                             <td width=\"97\"  class=\"TblHeaderColumn \">หมายเหตุ</td>\r\n");
      out.write("                                     </tr>\r\n");
      out.write("                                 ");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                             </table>\r\n");
      out.write("                         </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("               </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <!-- END บัญชีสิ่งของ-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"4\"><strong>2. รายงานตรวจพิสูจน์ของกลาง :</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea id=\"report_desc\" name=\"report_desc\" cols=\"70\" rows=\"5\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap.report_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"4\"><strong>3. คำสั่ง :</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea id=\"order_desc\" name=\"order_desc\" cols=\"70\" rows=\"5\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap.order_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t  </table>\r\n");
      out.write("\t\t\t\t\t  </td>\r\n");
      out.write("                    <td width=\"363\" valign=\"top\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("\r\n");
      out.write("                </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            </form>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tdurender('duTable');\t\r\n");
      out.write(" \tvar frmvalidator  = new Validator(\"dataform\");\r\n");
      out.write("  \tfrmvalidator.addValidation(\"exhibit_report_no1\",\"req\",\"กรุณากรอกเลขที่การพิสูจน์\");\r\n");
      out.write("  \tfrmvalidator.addValidation(\"exhibit_report_no2\",\"req\",\"กรุณากรอกเลขที่การพิสูจน์\");\r\n");
      out.write("  \tfrmvalidator.addValidation(\"taken_date\",\"req\",\"กรุณากรอกวันที่รับเรื่อง\");\r\n");
      out.write("  \tfrmvalidator.addValidation(\"taken_time\",\"req\",\"กรุณากรอกเวลารับเรื่อง\");\r\n");
      out.write("   \tfrmvalidator.addValidation(\"staff_name_prove\",\"req\",\"กรุณากรอกชื่อผู้พิสูจน์\");\r\n");
      out.write("\r\n");
      out.write("   \t\r\n");
      out.write("   </script>\r\n");
      out.write("   \r\n");
      out.write("   ");
      if (_jspx_meth_c_005fif_005f47(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   ");
      if (_jspx_meth_c_005fif_005f49(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
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
    _jspx_th_c_005furl_005f0.setValue("/process?action=Insideprove&cmd=create");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.send_income_case_id == '0' && IsEdit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<input name=\"btnSave\"  type=\"submit\" class=\"barButton\" value=\"บันทึก\" >\r\n");
        out.write("\t\t\t\t\t\t<input name=\"btnCancel\"  type=\"button\" class=\"barButton\" value=\"ยกเลิกการแก้ไข\" onclick=\"writeTranLog('ยกเลิกการแก้ไขข้อมูลการพิสูจน์ของกลางหน่วยงานภายใน');window.location.href='");
        if (_jspx_meth_c_005furl_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("'; \">\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    _jspx_th_c_005furl_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.send_income_case_id != '0' && IsEdit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsAddExhibit=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<input name=\"btnSave\"  type=\"submit\" class=\"barButton\" value=\"บันทึก\" >\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    _jspx_th_c_005furl_005f2.setValue("process?action=Insideprove&cmd=list&default=Y");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
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
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
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

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode == db.offcode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
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
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreak_type == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreak_type == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.have_culprit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.have_culprit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.issentcourt == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
    if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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
        out.write("display:none;");
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
    _jspx_th_c_005fif_005f18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f22 = _jspx_th_c_005fif_005f22.doStartTag();
    if (_jspx_eval_c_005fif_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f23 = _jspx_th_c_005fif_005f23.doStartTag();
    if (_jspx_eval_c_005fif_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_name\" type=\"text\" class=\"textview\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
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

  private boolean _jspx_meth_c_005fif_005f25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f25.setParent(null);
    _jspx_th_c_005fif_005f25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f25 = _jspx_th_c_005fif_005f25.doStartTag();
    if (_jspx_eval_c_005fif_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t    \t<input name=\"scene_name\" type=\"text\" class=\"text\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("\t    \t<font style=\"color:red\">*</font>\r\n");
        out.write("    \t");
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
        out.write("disabled");
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
          if (_jspx_meth_c_005fif_005f27(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
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

  private boolean _jspx_meth_c_005fif_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f27 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_code == db.scene_province}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f27 = _jspx_th_c_005fif_005f27.doStartTag();
    if (_jspx_eval_c_005fif_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_no\" type=\"text\" class=\"textview\" size=\"8\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t      &nbsp;&nbsp; หมู่ :\r\n");
        out.write("\t\t    <input name=\"scene_moo\" type=\"text\" class=\"textview\" size=\"5\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
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
    _jspx_th_c_005fif_005f29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f29 = _jspx_th_c_005fif_005f29.doStartTag();
    if (_jspx_eval_c_005fif_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
    _jspx_th_c_005fif_005f30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f30 = _jspx_th_c_005fif_005f30.doStartTag();
    if (_jspx_eval_c_005fif_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_soi\" type=\"text\" class=\"textview\" id=\"scene_soi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
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
    _jspx_th_c_005fif_005f32.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f32 = _jspx_th_c_005fif_005f32.doStartTag();
    if (_jspx_eval_c_005fif_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_soi\" type=\"text\" class=\"text\" id=\"scene_soi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\"  />\r\n");
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
    _jspx_th_c_005fif_005f33.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f33 = _jspx_th_c_005fif_005f33.doStartTag();
    if (_jspx_eval_c_005fif_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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
        out.write("    \t\t<input name=\"scene_road\" type=\"text\" class=\"textview\" id=\"scene_road\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
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
        out.write("    \t\t<input name=\"scene_road\" type=\"text\" class=\"text\" id=\"scene_road\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" />\r\n");
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
    _jspx_th_c_005fif_005f36.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f36 = _jspx_th_c_005fif_005f36.doStartTag();
    if (_jspx_eval_c_005fif_005f36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"police_station\" type=\"text\" class=\"textview\" size=\"22\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.police_station}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
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
    _jspx_th_c_005fif_005f37.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f37 = _jspx_th_c_005fif_005f37.doStartTag();
    if (_jspx_eval_c_005fif_005f37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"police_station\" type=\"text\" class=\"text\" size=\"22\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.police_station}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
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
    _jspx_th_c_005fif_005f38.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aalsize >= 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f38 = _jspx_th_c_005fif_005f38.doStartTag();
    if (_jspx_eval_c_005fif_005f38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f39.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f39 = _jspx_th_c_005fif_005f39.doStartTag();
    if (_jspx_eval_c_005fif_005f39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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

  private boolean _jspx_meth_c_005fif_005f40(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f40 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f40.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f40.setParent(null);
    _jspx_th_c_005fif_005f40.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f40 = _jspx_th_c_005fif_005f40.doStartTag();
    if (_jspx_eval_c_005fif_005f40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
        int evalDoAfterBody = _jspx_th_c_005fif_005f40.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f40);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aailist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f2.setVar("inc");
    _jspx_th_c_005fforEach_005f2.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t    <script>\r\n");
          out.write("\t\t\tincdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.penalty_case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.guilt_base}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.exhibit_wild}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\tincdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t</script>\r\n");
          out.write("\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
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
    _jspx_th_c_005fif_005f41.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap.taken_date != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f41 = _jspx_th_c_005fif_005f41.doStartTag();
    if (_jspx_eval_c_005fif_005f41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<input name=\"taken_date\" id=\"taken_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f41, _jspx_page_context))
          return true;
        out.write("\"  />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:NewCssCal('taken_date','ddmmyyyy')\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<img id=\"imgTaken_date\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>เวลา\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"taken_time\" name=\"taken_time\" type=\"text\" class=\"textbox\" size=\"5\" maxlength=\"5\" value=\"");
        if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_th_c_005fif_005f41, _jspx_page_context))
          return true;
        out.write("\" onkeypress=\"txtTime_OnKeyPress(this);\"/>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f41, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f41);
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap.taken_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f41, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f41);
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aap.taken_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_fmt_005fformatDate_005f1.setPattern("HH:mm");
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f43(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f43 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f43.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f43.setParent(null);
    _jspx_th_c_005fif_005f43.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.chkcaselast == 'Y' || IsEdit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f43 = _jspx_th_c_005fif_005f43.doStartTag();
    if (_jspx_eval_c_005fif_005f43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t//กรณีคดีที่ออกใบเสร็จและนำส่งเงินไปแล้ว ตรวจสอบสิทธิ์ว่าจะสามารถแก้ไขข้อมูลได้หรือไม่\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fif_005f44(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fif_005f45(_jspx_th_c_005fif_005f43, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
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

  private boolean _jspx_meth_c_005fif_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f44 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f44.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    _jspx_th_c_005fif_005f44.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsAddExhibit != 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f44 = _jspx_th_c_005fif_005f44.doStartTag();
    if (_jspx_eval_c_005fif_005f44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\ty2.innerHTML=\"<input type=\\\"checkbox\\\" id=\\\"ducheck_list\\\" name=\\\"ducheck_list\\\" value=\\\"\\\" disabled ><input type=\\\"hidden\\\" name=\\\"duref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("\t\t\ty3.innerHTML=data3;\r\n");
        out.write("\t\t\ty4.innerHTML=productDesc;\r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_c_005fif_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f45 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f45.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    _jspx_th_c_005fif_005f45.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsAddExhibit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f45 = _jspx_th_c_005fif_005f45.doStartTag();
    if (_jspx_eval_c_005fif_005f45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\ty2.innerHTML=\"<input type=\\\"checkbox\\\" id=\\\"ducheck_list\\\" name=\\\"ducheck_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"duref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("\t\t\ty3.innerHTML=data3;\r\n");
        out.write("\t\t\tif (data1==\"N\"){\r\n");
        out.write("\t\t\t\ty4.innerHTML=\"<a class='spanLink' onClick=\\\"duforedit('\"+ s +\"');dueditmodal('duTable','\"+row+\"');durerun_id();\\\">\" +productDesc+  \"</a>\";\r\n");
        out.write("\t\t\t}else{\r\n");
        out.write("\t\t\t\ty4.innerHTML= productDesc;\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t");
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
    _jspx_th_c_005fif_005f46.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.chkcaselast != 'Y' && IsEdit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f46 = _jspx_th_c_005fif_005f46.doStartTag();
    if (_jspx_eval_c_005fif_005f46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\ty2.innerHTML=\"<input type=\\\"checkbox\\\" id=\\\"ducheck_list\\\" name=\\\"ducheck_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"duref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("\t\ty3.innerHTML=data3;\r\n");
        out.write("\t\tif (data1==\"N\"){\r\n");
        out.write("\t\t\ty4.innerHTML=\"<a class='spanLink' onClick=\\\"duforedit('\"+ s +\"');dueditmodal('duTable','\"+row+\"');durerun_id();\\\">\" +productDesc+  \"</a>\";\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\ty4.innerHTML= productDesc;\r\n");
        out.write("\t\t}\r\n");
        out.write("\t");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aaelist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f3.setVar("aae");
    _jspx_th_c_005fforEach_005f3.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.isexhibitco}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.duty_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t var vBrandName = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  = vBrandName.replace('\"','\\\"');\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.isdomestic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.sizes_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata13[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata14[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata15[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata16[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.exhibit_list}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata17[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.exhibit_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata18[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.car_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata19[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.remarks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata20[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata21[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata22[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata23[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata24[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata25[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.case_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata26[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.co_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata27[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata28[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t </script>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f47(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f47 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f47.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f47.setParent(null);
    _jspx_th_c_005fif_005f47.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.send_income_case_id != '0' || IsEdit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f47 = _jspx_th_c_005fif_005f47.doStartTag();
    if (_jspx_eval_c_005fif_005f47 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   \t<script>\r\n");
        out.write("   \t\tdocument.getElementById('exhibit_report_no1').className=\"textview\";\r\n");
        out.write("   \t\tdocument.getElementById('exhibit_report_no1').setAttribute(\"onKeyPress\", \"txtKeyPress()\");\r\n");
        out.write("   \t\tdocument.getElementById('exhibit_report_no1').setAttribute(\"onKeyDown\", \"disableKeyDown()\");\r\n");
        out.write("//onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"\r\n");
        out.write("   \t\tdocument.getElementById('exhibit_report_no2').className=\"textview\";\r\n");
        out.write("   \t\tdocument.getElementById('exhibit_report_no2').setAttribute(\"onKeyPress\", \"txtKeyPress()\");\r\n");
        out.write("   \t\tdocument.getElementById('exhibit_report_no2').setAttribute(\"onKeyDown\", \"disableKeyDown()\");\r\n");
        out.write("   \t\t\r\n");
        out.write("   \t\tdocument.getElementById('imgTaken_date').className=\"textview\";\r\n");
        out.write("   \t\tdocument.getElementById('imgTaken_date').setAttribute(\"onKeyPress\", \"txtKeyPress()\");\r\n");
        out.write("   \t\tdocument.getElementById('imgTaken_date').setAttribute(\"onKeyDown\", \"disableKeyDown()\");\r\n");
        out.write("   \t\t\r\n");
        out.write("   \t\tdocument.getElementById('taken_time').className=\"textview\";\r\n");
        out.write("   \t\tdocument.getElementById('taken_time').setAttribute(\"onKeyPress\", \"txtKeyPress()\");\r\n");
        out.write("   \t\tdocument.getElementById('taken_time').setAttribute(\"onKeyDown\", \"disableKeyDown()\");\r\n");
        out.write("   \t\t\r\n");
        out.write("   \t\tdocument.getElementById('imgStaff_name_prove').style.display='none';\r\n");
        out.write("   \t\tdocument.getElementById('replace_position').className=\"textview\";\r\n");
        out.write("   \t\tdocument.getElementById('replace_position').setAttribute(\"onKeyPress\", \"txtKeyPress()\");\r\n");
        out.write("   \t\tdocument.getElementById('replace_position').setAttribute(\"onKeyDown\", \"disableKeyDown()\");\r\n");
        out.write("\r\n");
        out.write("   \t\tdocument.getElementById('tax_value').className=\"textview\";\r\n");
        out.write("   \t\tdocument.getElementById('tax_value').setAttribute(\"onKeyPress\", \"txtKeyPress()\");\r\n");
        out.write("   \t\tdocument.getElementById('tax_value').setAttribute(\"onKeyDown\", \"disableKeyDown()\");\r\n");
        out.write("   \t\t\r\n");
        out.write("   \t\t");
        if (_jspx_meth_c_005fif_005f48(_jspx_th_c_005fif_005f47, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   \t\tdocument.getElementById('report_desc').className=\"textview\";\r\n");
        out.write("   \t\tdocument.getElementById('report_desc').setAttribute(\"onKeyPress\", \"txtKeyPress()\");\r\n");
        out.write("   \t\tdocument.getElementById('report_desc').setAttribute(\"onKeyDown\", \"disableKeyDown()\");\r\n");
        out.write("   \t\t\r\n");
        out.write("   \t\tdocument.getElementById('order_desc').className=\"textview\";\r\n");
        out.write("   \t\tdocument.getElementById('order_desc').setAttribute(\"onKeyPress\", \"txtKeyPress()\");\r\n");
        out.write("   \t\tdocument.getElementById('order_desc').setAttribute(\"onKeyDown\", \"disableKeyDown()\");\r\n");
        out.write("   \t</script>\r\n");
        out.write("   ");
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

  private boolean _jspx_meth_c_005fif_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f47, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f48 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f48.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f47);
    _jspx_th_c_005fif_005f48.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsAddExhibit != 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f48 = _jspx_th_c_005fif_005f48.doStartTag();
    if (_jspx_eval_c_005fif_005f48 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   \t\t\tdocument.getElementById('likAddExhibit').style.display='none';\r\n");
        out.write("   \t\t");
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

  private boolean _jspx_meth_c_005fif_005f49(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f49 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f49.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f49.setParent(null);
    _jspx_th_c_005fif_005f49.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SaveMsg == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f49 = _jspx_th_c_005fif_005f49.doStartTag();
    if (_jspx_eval_c_005fif_005f49 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("   \t\t<script>\r\n");
        out.write("   \t\t\talert(\"บันทึกเรียบร้อย\");\r\n");
        out.write("   \t\t</script>\r\n");
        out.write("   ");
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
}
