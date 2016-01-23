package org.apache.jsp.Protect;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class notice_005farrest_005fcreate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Protect/notice_arrest_insert.jsp");
    _jspx_dependants.add("/Protect/../Protect/indictment.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("<form method=\"post\" name=\"dataform\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\"></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Reports.js'></script>\r\n");
      out.write("<script type='text/javascript'>\r\n");
      out.write("\r\n");
      out.write("function init(){\r\n");
      out.write("\tgetProvince('province','district','tambol','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_province_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_district_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_subdistrict_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\tsetTimeout(\"getProvince('province','district','tambol','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_province_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_district_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_subdistrict_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\",1000);\r\n");
      out.write("\tgetProvince('province2','district2','tambol2','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_province_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_district_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_subdistrict_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction inform_namefocus()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (document.dataform.inform_type[0].checked == true)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tdocument.dataform.inform_address.focus();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction chkInformType()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (document.dataform.inform_type[0].checked == true){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//document.dataform.inform_name.disabled=true;\r\n");
      out.write("\t\t\tdocument.dataform.inform_name.value=\"สายลับ(ขอปิดนาม)\";\r\n");
      out.write("\t\t\tdocument.dataform.inform_name.className=\"textView\";\t\t\r\n");
      out.write("\t\t\t//alert(document.dataform.inform_name.value);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tdocument.dataform.inform_name.disabled=false;\r\n");
      out.write("\t\t\tdocument.dataform.inform_name.className=\"\";\r\n");
      out.write("\t\t\tdocument.dataform.inform_name.value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("    function printReports()\r\n");
      out.write("    {\r\n");
      out.write("        var doc = document.dataform;\r\n");
      out.write("        var lg = doc.legislation_id.value;\r\n");
      out.write("        var notice = doc.notice_no.value;\r\n");
      out.write("        var repName='';\r\n");
      out.write("        if(lg == '1')\r\n");
      out.write("            repName='ILL_P016';\r\n");
      out.write("        if(lg == '2')\r\n");
      out.write("            repName='ILL_P016_1';\r\n");
      out.write("        if(lg == '4')\r\n");
      out.write("            repName='ILL_P016_2';\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        Reports.ReportUrl(function(data){\r\n");
      out.write("\t\t\tif(data != \"\"){\r\n");
      out.write("\t\t\t\twindow.open(data + 'ReportName=' + repName + '&getNoticeNo='+notice + '&vReportType=PDF&time=' + Math.random(), '_blank', 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700')\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\twindow.open('process?action=Report&__report=' + repName + '&__formatt=pdf&getNoticeNo='+notice , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\tfunction removeElement(divNum) {\r\n");
      out.write("\t  var d = document.getElementById('myDiv');\r\n");
      out.write("\t  var olddiv = document.getElementById(divNum);\r\n");
      out.write("\t  d.removeChild(olddiv);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction chkdorpdown(ID){\r\n");
      out.write("\t\tif (ID=='4'){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"App\").style.display='';\r\n");
      out.write("\t\t\tdocument.getElementById(\"App2\").style.display='none';\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tdocument.getElementById(\"App2\").style.display='';\r\n");
      out.write("\t\t\tdocument.getElementById(\"App\").style.display='none';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction setDDlGroupID(group_id, vLegislationID, vGroupID){\r\n");
      out.write("\t\t//alert(vLegislationID);\r\n");
      out.write("\t\tLegislationProduct.getDutyGroup(vLegislationID,function(data){\r\n");
      out.write("\t\t\tdwr.util.removeAllOptions(group_id);\r\n");
      out.write("\t\t\tdwr.util.addOptions(group_id,[{group_id:\"\",group_name:\"เลือก\"}],\"group_id\",\"group_name\");\r\n");
      out.write("\t\t\tdwr.util.addOptions(group_id,data,\"group_id\",\"group_name\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(vGroupID!=null && vGroupID!=\"\" ){\r\n");
      out.write("\t\t\t\tdwr.util.setValue(group_id,vGroupID);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("<!-- Body -->\r\n");
      out.write("\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\"\r\n");
      out.write("\t\tcellpadding=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"100%\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"1%\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"99%\"><span class=\"websitename\">ใบแจ้งความนำจับ</span></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td height=\"25\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input name=\"btnSave\" type=\"submit\" class=\"barbutton\" value=\"บันทึก\" onclick=\"writeTranLog('บันทึกข้อมูลใบแจ้งความนำจับ')\"> \r\n");
      out.write("\t\t\t\t\t\t<input name=\"btnCancel\" type=\"button\" class=\"barbutton\" value=\"ยกเลิกการแก้ไข\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"writeTranLog('ยกเลิกการแก้ไขข้อมูลใบแจ้งความนำจับ');window.location.href='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("'; \">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"btnBack\" type=\"button\" class=\"barbutton\" value=\"กลับหน้าค้นหา\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"window.location.href='");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("';writeTranLog('กลับหน้าค้นหา')\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"brnPrint\" type=\"button\" class=\"barbutton\" value=\"พิมพ์บันทึกแจ้งความ\" onClick=\"printReports();writeTranLog('พิมพ์ใบแจ้งความนำจับ พ.ร.บ.')\" ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" >\r\n");
      out.write("\t\t\t\t\t<font size=\"2\" color=\"red\"><i></i></font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td height=\"25\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td><!--   Start  My Form-->\r\n");
      out.write("\t\t\t\t\t<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\" valign=\"middle\">เลขที่บันทึกแจ้งความ\r\n");
      out.write("\t\t\t\t\t\t\t:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"30\" align=\"left\" bgcolor=\"#F7F7F7\" style=\"width: 100px\"><strong>ผู้รับแจ้งความ</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\" style=\"width: 409px\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">เขียนที่หน่วยงาน\r\n");
      out.write("\t\t\t\t\t\t\t:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"30%\"><input type=\"Text\" id=\"offcode\" readonly\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"offcode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" size=\"5\" />\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/btn_browse.png\" width=\"18\" height=\"19\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=\"0\" style=\"cursor: hand\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonClick=\"window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"Text\" id=\"offname\" name=\"offname\" readonly\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" size=\"25\" /> <font\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\" valign=\"middle\">วันที่รับแจ้งความ\r\n");
      out.write("\t\t\t\t\t\t\t:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"Text\" id=\"notice_date\" name=\"notice_date\" value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\" size=\"12\" class=\"textdate\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <a href=\"javascript:NewCssCal('notice_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" width=\"19\" height=\"19\" border=\"0\" ></a>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tเวลา :<input type=\"Text\" id=\"notice_time\" name=\"notice_time\"  value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_page_context))
        return;
      out.write("\"  size=\"5\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"textbox\" onkeypress=\"txtTime_OnKeyPress(this);\" onblur=\"lengthVali(this,5);\"/><font style=\"color: red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">ผู้รับแจ้งความนำจับ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"Text\" id=\"staff_name_receive\" name=\"staff_name_receive\"  class=\"textview\" size=\"40\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff_name_receive}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"staff_id_receive\" name=\"staff_id_receive\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.staff_id_receive}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"poscode_receive\" name=\"poscode_receive\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.poscode_receive}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"offcode_receive\" name=\"offcode_receive\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.offcode_receive}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"cursor:hand\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonClick=\"window.open('process?action=Divide_staff_pop&formname=staff_name_receive&id=staff_id_receive&posname=posname_receive&poscode=poscode_receive&offname=offname_receive&offcode=offcode_receive' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" />\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25px\" align=\"right\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"posname_receive\" name=\"posname_receive\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${posname_receive}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"45\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25px\" align=\"right\">สังกัด :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"offname_receive\" name=\"offname_receive\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offname_receive}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"45\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" colspan=\"4\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"30\" align=\"left\" bgcolor=\"#F7F7F7\"><strong>รายละเอียดผู้แจ้งความ</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\">&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\" valign=\"middle\">ผู้แจ้งความ\r\n");
      out.write("\t\t\t\t\t\t\t:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"radio\" id=\"inform_type1\" name=\"inform_type\" OnClick=\"chkInformType();\" value=\"1\" ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write(" />สายลับ(ขอปิดนาม)&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"inform_type2\" name=\"inform_type\" OnClick=\"chkInformType();\" value=\"2\" ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write(" />ระบุชื่อ<font style=\"color: red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\" valign=\"middle\">ชื่อ(นามแฝง)ผู้แจ้ง\r\n");
      out.write("\t\t\t\t\t\t\t:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"Text\" id=\"inform_name\" name=\"inform_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onfocus=\"inform_namefocus()\" class=\"textView\" size=\"30\"/>\r\n");
      out.write("\t\t\t\t\t\t\t <font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">อายุผู้แจ้ง :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"inform_age\" name=\"inform_age\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_age}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textNum\" onkeypress=\"ChkMinusInt(this);\" size=\"5\"/>&nbsp;ปี\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ที่อยู่ของผู้แจ้ง :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"inform_address\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"class=\"textbox\" id=\"ifAddr\" size=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t  &nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"inform_moo\" type=\"text\" class=\"textbox\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"ifMoo\" size=\"5\" OnKeyPress=\"ChkMinusInt(this);\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">อาคาร/สถานที่:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"inform_address_name\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_address_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" id=\"inform_address_name\" size=\"25\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ตรอก/ซอย&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"inform_soi\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" id=\"inform_soi\" size=\"25\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ถนน :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"inform_road\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" id=\"inform_road\" size=\"25\">\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">จังหวัด :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id='province' style=\"width:200px\" name=\"inform_province_code\" onchange=\"getDistrict('district','tambol',this.value)\"></select>\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">อำเภอ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select id='district' style=\"width:200px\"  name=\"inform_district_code\" onchange=\"getTambol('tambol',this.value,'')\"></select>\t\t\t\t\t\t  </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ตำบล :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select id='tambol' name=\"inform_subdistrict_code\"  style=\"width:200px\"></select>\t\t\t\t\t\t  </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" colspan=\"4\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">เรียนผู้มีอำนาจสั่งจ่าย :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"inform_lean\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_lean}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" id=\"inform_lean\" size=\"38\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"red\" >*</font>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" colspan=\"4\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"30\" align=\"left\" bgcolor=\"#F7F7F7\"><strong>รายละเอียดผู้กระทำผิด</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\" valign=\"middle\">ชื่อผู้กระทำผิด :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"lawbreaker_name\" name=\"lawbreaker_name\"  class=\"textbox\" size=\"25\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("                                <input type=\"hidden\" id=\"lawbreaker_no\" name=\"lawbreaker_no\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\t\t\t\t\t\t\t\t\r\n");
      out.write("                                <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=\"0\" style=\"cursor: hand\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonClick=\"window.open('process?action=LawFind_pop&formname=lawbreaker_name&id=lawbreaker_no' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\">\r\n");
      out.write("\t\t\t\t\t\t\t\t <font style=\"color: red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">สถานที่เกิดเหตุ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"lawbreaker_address\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" id=\"lawbreaker_address\" size=\"5\">\r\n");
      out.write("\t\t\t\t\t\t\t  &nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"lawbreaker_moo\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" id=\"lawbreaker_moo\" size=\"5\" OnKeyPress=\"ChkMinusInt(this);\"/>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">อาคาร/สถานที่:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"lawbreaker_address_name\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_address_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" id=\"lawbreaker_address_name\" size=\"25\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ตรอก/ซอย&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"lawbreaker_soi\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" id=\"lawbreaker_soi\" size=\"25\">\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ถนน :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"lawbreaker_road\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.lawbreaker_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textbox\" id=\"lawbreaker_road\" size=\"25\">\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">จังหวัด :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select id='province2' style=\"width:200px\" name=\"lawbreaker_province_code\" onchange=\"getDistrict('district2','tambol2',this.value)\"></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">อำเภอ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select id='district2' style=\"width:200px\"  name=\"lawbreaker_district_code\" onchange=\"getTambol('tambol2',this.value,'')\"></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ตำบล :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select id='tambol2' style=\"width:200px\" name=\"lawbreaker_subdistrict_code\" ></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" colspan=\"4\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"30\" align=\"left\" bgcolor=\"#F7F7F7\"><strong>รายละเอียดการกระทำผิด</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"17%\" align=\"right\">ความผิด พ.ร.บ. :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"33%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"legislation_id\" id=\"legislation_id\" class=\"select\" style=\"width:200px\" onchange=\"setDDlGroupID('duty_code',this.value,'');\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\">เลือก</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t\t\t\t<font style=\"color: red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">สินค้า :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<select name=\"duty_code\" id=\"duty_code\" class=\"select\" style=\"width:200px\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option value=\"\" >เลือก</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select> \r\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"txtProductStar\" style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<font style=\"color: red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"css/jquery-ui.css\"  rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/Popup.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\tvar row;\r\n");
      out.write("\tvar x=document.getElementById(myTable).insertRow(incmaxrow);\r\n");
      out.write("\tincmaxrow++;\r\n");
      out.write("\r\n");
      out.write("\trow = incmaxrow - 1;\r\n");
      out.write("\tvar y1=x.insertCell(0);\r\n");
      out.write("\tvar y2=x.insertCell(1);\r\n");
      out.write("\tvar y3=x.insertCell(2);\r\n");
      out.write("\tvar y4=x.insertCell(3);\r\n");
      out.write("\tvar y5=x.insertCell(4);\r\n");
      out.write("\r\n");
      out.write("\tvar exp = new Date();\r\n");
      out.write("\tvar s = exp.getTime();\r\n");
      out.write("\ty1.innerHTML=\"<input readonly class='textboxlist' size='1' name='inctc_id' value='\" + row + \"' />\"+\"<input type=\\\"hidden\\\" name=\\\"aai_id\\\" value=\\\"\"+id+\"\\\">\";\r\n");
      out.write("\ty2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"inccheckbox\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"incref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
      out.write("\ty3.innerHTML= data1+ \"<input type=\\\"hidden\\\" name=\\\"aai_case_law_id\\\" value=\\\"\" +data1+ \"\\\">\"\r\n");
      out.write("\t+ \"<input type=\\\"hidden\\\" name=\\\"aai_indictment_id\\\" value=\\\"\" +data6+ \"\\\">\" ;\r\n");
      out.write("\ty4.innerHTML=data2+\"<input type=\\\"hidden\\\" id=\\\"aai_penalty_case_law_id\\\" name=\\\"aai_penalty_case_law_id\\\" value=\\\"\"+data2+\"\\\">\";\r\n");
      out.write("\ty5.innerHTML=data3+\"<input type=\\\"hidden\\\" name=\\\"aai_guilt_base\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
      out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aai_exhibit_wild\\\" value=\\\"\"+data4+\"\\\">\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function incdelRow(myTable)\r\n");
      out.write("{\r\n");
      out.write("\tif (incmaxrow>1)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar x=document.getElementById(myTable).deleteRow(myTable,incmaxrow-1);\r\n");
      out.write("\t\tincmaxrow--\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function incalternate(id){\r\n");
      out.write("\t if(document.getElementsByTagName){\r\n");
      out.write("\t\t   var table = document.getElementById(id);\r\n");
      out.write("\t\t   var rows = table.getElementsByTagName(\"tr\");\r\n");
      out.write("\t\t   for(i = 0; i < rows.length; i++){\r\n");
      out.write("\t\t     if(i % 2 == 0){\r\n");
      out.write("\t\t       \trows[i].className = \"even\";\r\n");
      out.write("\t\t     }else{\r\n");
      out.write("\t\t       \trows[i].className = \"odd\";\r\n");
      out.write("\t\t     }\r\n");
      out.write("\t\t   }\r\n");
      out.write("\t }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function increrun_id()\r\n");
      out.write("{\r\n");
      out.write("\tif (incmaxrow == 2)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.dataform.inctc_id.value=1;\r\n");
      out.write("\t}else if(incmaxrow > 2){\r\n");
      out.write("\t\tfor (var i=0; i < document.dataform.inctc_id.length; i++)\r\n");
      out.write("\t    {\r\n");
      out.write("\t\t\tdocument.dataform.inctc_id[i].value=i+1;\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function incdelRown(myTable,Rown)\r\n");
      out.write("{\r\n");
      out.write("\tvar x=document.getElementById(myTable).deleteRow(Rown);\r\n");
      out.write("\tincmaxrow--\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function incopenmodal(myTable)\r\n");
      out.write("{\r\n");
      out.write("\twriteTranLog('เพิ่มข้อกล่าวหาในบันทึกการจับกุม');\t\r\n");
      out.write("\t\r\n");
      out.write("\tvar  dup=0;\r\n");
      out.write("\tvar data =  window.showModalDialog('process?action=Indictment_pop&cmd=add' , self , 'dialogWidth=700px,Height=400px');\r\n");
      out.write("\tif(data != null){\r\n");
      out.write("\t\tfor (var i=0; i < data.length; i++)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdup=0;\r\n");
      out.write("\t\t\tif (incmaxrow>1)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif (incmaxrow == 2){\r\n");
      out.write("\t\t\t\t\tif (document.dataform.aai_indictment_id.value==data[i][5])\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tdup=1;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aai_indictment_id.length; j++)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tif (document.dataform.aai_indictment_id[j].value==data[i][5])\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tdup=1;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (dup==0)\r\n");
      out.write("\t    \t{\r\n");
      out.write("\t\t    \tincinsRow(myTable,incmaxrow,data[i][1],data[i][2],data[i][3],data[i][4],'',data[i][5]);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function incget_check_value(myTable)\r\n");
      out.write("{\r\n");
      out.write("\tvar c_value = \"\";\r\n");
      out.write("\tvar x = incmaxrow;\r\n");
      out.write("\tif (incmaxrow == 2 && document.dataform.inccheckbox.checked)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(myTable).deleteRow(1);\r\n");
      out.write("\t\tincmaxrow--;\r\n");
      out.write("\t\twriteTranLog('ลบข้อกล่าวหาในบันทึกการจับกุม');\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tfor (var i=0; i < document.dataform.inccheckbox.length -1 ; i++){\r\n");
      out.write("\t\t\t if (document.dataform.inccheckbox[i+1].checked){\r\n");
      out.write("\t\t\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
      out.write("\t\t\t\ti--;\r\n");
      out.write("\t\t\t\tincmaxrow--;\r\n");
      out.write("\t\t     }\r\n");
      out.write("\t   \t}\r\n");
      out.write("\t   //alert(incmaxrow-1);\r\n");
      out.write("\t   if(x!=incmaxrow){\r\n");
      out.write("\t\t    writeTranLog('ลบข้อกล่าวหาในบันทึกการจับกุม');\r\n");
      out.write("\t\t\tincrerun_id();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function incrender(myTable)\r\n");
      out.write("{\r\n");
      out.write(" \tfor (i=0;i<incdata1.length;i++)\r\n");
      out.write("    {\r\n");
      out.write("        incinsRow(myTable,i,incdata1[i],incdata2[i],incdata3[i],incdata4[i],incdata5[i],incdata6[i]);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var incdata1 =new Array();\r\n");
      out.write("var incdata2 =new Array();\r\n");
      out.write("var incdata3 =new Array();\r\n");
      out.write("var incdata4 =new Array();\r\n");
      out.write("var incdata5 =new Array();\r\n");
      out.write("var incdata6 =new Array();\r\n");
      out.write("\r\n");
      out.write("function incCheck(chkcont,chk)\r\n");
      out.write("{\r\n");
      out.write("\tif(chkcont.checked==true){\r\n");
      out.write("\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\tchk[i].checked = true ;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\t\tchk[i].checked = false ;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\t\t\t<span class=\"spanLink\" onClick=\"incopenmodal('incTable');\">\r\n");
      out.write("\t\t\t เพิ่มรายการ\r\n");
      out.write("\t\t\t</span> |\r\n");
      out.write("\t\t\t<span class=\"spanLink\" onClick=\"incget_check_value('incTable');\">ลบรายการ</span>\r\n");
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
      out.write("\t\t\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t\t\t\t<tbody id=\"App2\" style=\" \">\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td align=\"right\">มอบฉันทะให้ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"Text\" id=\"staff_name_accept\" name=\"staff_name_accept\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff_name_accept}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"40\" readonly/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"staff_id_accept\" name=\"staff_id_accept\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.staff_id_accept}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t\t\t <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonClick=\"window.open('process?action=Divide_staff_pop&formname=staff_name_accept&id=staff_id_accept' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" colspan=\"4\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"30\" align=\"left\" bgcolor=\"#F7F7F7\"><strong>รายละเอียดการนำจับ</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">รายละเอียดการนำจับ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<TEXTAREA NAME=\"arrest_desc\" COLS=\"25\" ROWS=\"2\" id=\"arrest_desc\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.arrest_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">ชั้นความลับ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><INPUT TYPE=\"radio\" NAME=\"secret_level\" value=\"1\" checked >1. ปกติ&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"radio\" NAME=\"secret_level\" value=\"2\">2. พิเศษ\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td align=\"right\" valign=\"top\" rowspan=\"2\">หมายเหตุ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td valign=\"top\" rowspan=\"2\"><TEXTAREA NAME=\"remarks\" COLS=\"29\" ROWS=\"3\" id=\"remarks\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.remarks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td align=\"right\">ผู้ทำรายการ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"Text\" id=\"create_byx\" name=\"create_byx\"  class=\"textview\" size=\"40\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${create_by_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly/>\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td align=\"right\">วันที่ทำรายการ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> <input type=\"Text\" id=\"create_on\" name=\"create_on\"  size=\"40\" class=\"textview\" value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f2(_jspx_page_context))
        return;
      out.write("\" readonly/>\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"25\" colspan=\"4\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td height=\"30\" align=\"left\" bgcolor=\"#F7F7F7\"><strong>ผลการดำเนินการแจ้งความ</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td><td bgcolor=\"#F7F7F7\"> </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td colspan=\"2\">ผลของการแจ้งความครั้งนี้ &nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr><td><INPUT TYPE=\"radio\" id=\"notice_result\" NAME=\"notice_result\" value=\"1\" ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write(">1. ยังไม่ดำเนินการ</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><INPUT NAME=\"ismanage\" TYPE=\"checkbox\" id=\"ismanage\" ");
      if (_jspx_meth_c_005fif_005f8(_jspx_page_context))
        return;
      out.write("  value=\"Y\">\r\n");
      out.write("\t\t\t\t\t\t\tนำไปดำเนินการต่อ</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><INPUT TYPE=\"radio\" id=\"notice_result\" NAME=\"notice_result\" value=\"2\" ");
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
        return;
      out.write(">2. จับกุมสำเร็จ</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><INPUT NAME=\"isreward_pay\" TYPE=\"checkbox\" id=\"isreward_pay\" ");
      if (_jspx_meth_c_005fif_005f10(_jspx_page_context))
        return;
      out.write("  value=\"Y\">\r\n");
      out.write("\t\t\t\t\t\t\t\tจ่ายเงินรางวัลแล้ว\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td height=\"25\"><INPUT TYPE=\"radio\" id=\"notice_result\" NAME=\"notice_result\" value=\"3\" ");
      if (_jspx_meth_c_005fif_005f11(_jspx_page_context))
        return;
      out.write(">3. จับกุมไม่สำเร็จ</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td height=\"25\" align=\"left\" valign=\"middle\">วันที่ขอรับเงินรางวัล&nbsp;:&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"receive_date\" name=\"receive_date\"  class=\"textdate\" value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f3(_jspx_page_context))
        return;
      out.write("\" readonly />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:NewCssCal('receive_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" border=\"0\" ></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\">ผู้รับรองนำจับสำเร็จ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"Text\" id=\"staff_name_surety\" name=\"staff_name_surety\"\"  class=\"textview\" size=\"40\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff_name_surety}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"staff_id_surety\" name=\"staff_id_surety\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.staff_id_surety}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"poscode_surety\" name=\"poscode_surety\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.poscode_surety}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"offcode_surety\" name=\"offcode_surety\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.offcode_surety}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"cursor:hand\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonClick=\"window.open('process?action=Divide_staff_pop&formname=staff_name_surety&id=staff_id_surety&posname=posname_surety&poscode=poscode_surety&offname=offname_surety&offcode=offcode_surety' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr height=\"25px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\">ตำแหน่ง&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"posname_surety\" name=\"posname_surety\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${posname_surety}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"40\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\">สังกัด&nbsp;:&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"offname_surety\" name=\"offname_surety\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offname_surety}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"40\"/ >\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!--   Start  My Form--></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("<script>\r\n");
      out.write("init();\r\n");
      out.write("chkInformType();\r\n");
      out.write("setDDlGroupID('duty_code','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("//You should create the validator only after the definition of the HTML form\r\n");
      out.write("  var frmvalidator  = new Validator(\"dataform\");\r\n");
      out.write("  frmvalidator.addValidation(\"offcode\",\"req\",\"กรุณาเลือกหน่วยงาน\");\r\n");
      out.write("  frmvalidator.addValidation(\"legislation_id\",\"dontselect=0\",\"กรุณาระบุความผิดตาม พ.ร.บ.\");\r\n");
      out.write("  frmvalidator.addValidation(\"duty_code\",\"dontselect=0\",\"กรุณาระบุเลือกชนิดสินค้า.\");\r\n");
      out.write("  frmvalidator.addValidation(\"notice_date\",\"req\",\"กรุณากรอกวันที่ร้องขอ\");\r\n");
      out.write("  frmvalidator.addValidation(\"notice_time\",\"req\",\"กรุณากรอกเวลาที่ร้องขอ\");\r\n");
      out.write("  frmvalidator.addValidation(\"lawbreaker_name\",\"req\",\"กรุณากรอกชื่อผู้กระทำผิด\");\r\n");
      out.write("  //frmvalidator.addValidation(\"staff_name_accept\",\"req\",\"กรุณาระบุชื่อผู้รับมอบฉันทะ\");\r\n");
      out.write("  //frmvalidator.addValidation(\"staff_name_commander\",\"req\",\"กรุณาระบุผู้บังคับบัญชา\");\r\n");
      out.write("  //frmvalidator.addValidation(\"next_step\",\"req\",\"กรุณาระบุแนวทางการดำเนินการ\");\r\n");
      out.write("  frmvalidator.addValidation(\"inform_type\",\"req\",\"กรุณาเลือกประเภทผู้แจ้งความ\");\r\n");
      out.write("  frmvalidator.addValidation(\"inform_name\",\"req\",\"กรุณากรอกชื่อผู้แจ้งหรือนามแฝง\");\r\n");
      out.write("  frmvalidator.addValidation(\"staff_name_receive\",\"req\",\"กรุณาระบุชื่อผู้รับแจ้งความนำจับ\");\r\n");
      out.write("  frmvalidator.addValidation(\"inform_lean\",\"req\",\"กรุณาระบุตำแหน่งของผู้มีอำนาจสั่งจ่าย\");\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
    _jspx_th_c_005furl_005f0.setValue("/process?action=NoticeArrest&cmd=create");
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
    _jspx_th_c_005furl_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
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
    _jspx_th_c_005furl_005f2.setValue("process?action=NoticeArrest");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.notice_no == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style='display:none'");
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

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.notice_no == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"notice_no\" name=\"notice_no\"\tvalue=\"NEW\" class=\"textview\" size=\"20\" readonly/>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
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
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.notice_no != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<input type=\"Text\" id=\"notice_no\" name=\"notice_no\"\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.notice_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textview\" size=\"20\" readonly/>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.notice_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent(null);
    _jspx_th_fmt_005fformatDate_005f1.setPattern("HH:mm");
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.notice_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
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
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_type == '1' || ana.inform_type == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.inform_type == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lglist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("lg");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lg.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lg.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.legislation_id == lg.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setVar("dt");
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dtlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dt.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dt.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dt.group_id == ana.duty_code}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
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
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t    <script>\r\n");
          out.write("\t\t\t\t\tincdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.penalty_case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.guilt_base}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.exhibit_wild}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t//alert(incdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] + \" TTTTT \" + '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\r\n");
          out.write("\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f2.setParent(null);
    _jspx_th_fmt_005fformatDate_005f2.setPattern("dd/MM/yyyy HH:mm");
    _jspx_th_fmt_005fformatDate_005f2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.create_on}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f2 = _jspx_th_fmt_005fformatDate_005f2.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
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
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(ana.notice_result != 2) and (ana.notice_result != 3)  }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.ismanage=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.notice_result==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.isreward_pay=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.notice_result==3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f3.setParent(null);
    _jspx_th_fmt_005fformatDate_005f3.setPattern("dd/MM/yyyy");
    _jspx_th_fmt_005fformatDate_005f3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ana.receive_date }", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatDate_005f3 = _jspx_th_fmt_005fformatDate_005f3.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
    return false;
  }
}
