package org.apache.jsp.Protect;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class ArrestReportForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Protect/ArrestReportDetail.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("function winPopup(theURL,winName,features, myWidth, myHeight, isCenter) {\r\n");
      out.write("\r\n");
      out.write("\t\tif(window.screen)if(isCenter)if(isCenter==\"true\"){\r\n");
      out.write("\t\t\tvar myLeft = (screen.width-myWidth)/2;\r\n");
      out.write("\t\t\tvar myTop = (screen.height-myHeight)/2;\r\n");
      out.write("\t\t\tfeatures+=(features!='')?',':'';\r\n");
      out.write("\t\t\tfeatures+=',left='+myLeft+',top='+myTop;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\twindow.open(theURL,winName,features+((features!='')?',':'')+'width='+myWidth+',height='+myHeight);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style7 {\r\n");
      out.write("\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<form method=\"post\" name=\"dataform\"  action=\"process?action=ArrestReport&cmd=save\" >\r\n");
      out.write("\t\t");
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<script type='text/javascript' src='dwr/interface/Reports.js'></script>\r\n");
      out.write("\r\n");
      out.write("<script>\n");
      out.write("\tfunction Print(){\n");
      out.write("\t\twriteTranLog('พิมพ์รายงานการจับกุมเลขที่งาน ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.job_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\n");
      out.write("\t\tReports.ReportUrl(function(data){\n");
      out.write("\t\t\tif(data != \"\"){\n");
      out.write("\t\t\t\twindow.open(data + \"ReportName=ILL_P045&getID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&vReportType=PDF&time=\" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\twindow.open('process?action=Report&__report=ILL_P045&__formatt=pdf&getID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&time=");
      out.print(new java.util.Date().getTime());
      out.write("' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("</script>\r\n");
      out.write("\t\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td width=\"100%\" align=\"left\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"99%\"><span class=\"websitename\">รายงานการจับกุม</span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("                <td><hr /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t<td >&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input name=\"btnSave\"  type=\"submit\" class=\"barButton\" value=\"บันทึก\" >\r\n");
      out.write("\t\t\t\t\t<input name=\"btnCancel\"  type=\"button\" class=\"barButton\" value=\"ยกเลิกการแก้ไข\" onclick=\"writeTranLog('ยกเลิกการแก้ไขรายงานการจับกุม');window.location.href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'; \" >\r\n");
      out.write("\t\t\t\t\t<input name=\"btnBack\"  type=\"button\" class=\"barButton\" value=\"กลับหน้าค้นหา\"  onclick=\"writeTranLog('กลับหน้าค้นหา');window.location.href='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("' \">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("                <td><hr /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td >\n");
      out.write("                <table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td width=\"100%\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("\t                      <tr>\r\n");
      out.write("\t                        <td  height=\"25\" align=\"right\">เลขที่งาน :&nbsp;</td>\r\n");
      out.write("\t                        <td >\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"job_no\" id=\"job_no\" size=\"28\"  class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.job_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"ar_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t                      </tr>\r\n");
      out.write("\t                      <tr>\r\n");
      out.write("\t                        <td width=\"30%\" height=\"25\" align=\"right\" >เรื่อง :&nbsp;</td>\r\n");
      out.write("\t                        <td width=\"70%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"report_title\" id=\"report_title\" style=\"width:550px\"  class=\"text\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.report_title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t                      </tr>\r\n");
      out.write("\t                      <tr>\r\n");
      out.write("\t                        <td  height=\"25\" align=\"right\">วันที่จับ :&nbsp;</td>\r\n");
      out.write("\t                        <td >\r\n");
      out.write("\t                             ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.case_date == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<input name=\"case_date\" id=\"case_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyPress=\"txtKeyPress(event);\" value=\"");
          //  fmt:formatDate
          org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
          _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
          _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
          _jspx_th_fmt_005fformatDate_005f1.setValue(new Date() );
          _jspx_th_fmt_005fformatDate_005f1.setPattern("dd/MM/yyyy");
          int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
          if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
            return;
          }
          _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
          out.write("\"  />\n");
          out.write("\t\t\t\t\t\t\t\t  \t<a href=\"javascript:NewCssCal('case_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>\n");
          out.write("\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t                        </td>\r\n");
      out.write("\t                      </tr>\r\n");
      out.write("\t                      <tr>\r\n");
      out.write("\t                        <td  height=\"25\" align=\"right\">ชนิดและปริมาณของที่จับได้ :&nbsp;</td>\r\n");
      out.write("\t                        <td >\r\n");
      out.write("\t\t\t\t\t\t\t\t<TEXTAREA NAME=\"exhibit_desc\" ROWS=\"3\" COLS=\"70\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.exhibit_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t                      </tr>\r\n");
      out.write("\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td  align=\"right\">ลักษณะที่ตรวจพบ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t\t<TEXTAREA NAME=\"nature_invest\" ROWS=\"3\" COLS=\"70\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.nature_invest}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t\t  <tr>\n");
      out.write("\t                        <td  height=\"25\" align=\"right\">ชื่อผู้ถูกจับกุม :&nbsp;</td>\n");
      out.write("\t                        <td >\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"lawbreaker_name\" id=\"lawbreaker_name\" size=\"28\"  class=\"text\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t                      </tr>\n");
      out.write("\t                      <tr>\n");
      out.write("\t                        <td  height=\"25\" align=\"right\">&nbsp;</td>\n");
      out.write("\t                        <td >\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" NAME=\"isNotice\" value=\"Y\" ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write(">มีการแจ้งความ\n");
      out.write("\t\t\t\t\t\t\t\t&nbsp;\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" NAME=\"isCompare\" value=\"Y\" ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write(">ตรวจจับได้ตรงกับที่แจ้ง\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t                      </tr>\n");
      out.write("\t                      <tr>\n");
      out.write("\t                        <td  height=\"25\" align=\"right\">ชื่อและตำแหน่งผู้จับกุม :&nbsp;</td>\n");
      out.write("\t                        <td >\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"accuser_name\" id=\"accuser_name\" style=\"width:550px\"  class=\"text\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\n");
      out.write("\t\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t                      </tr>\n");
      out.write("\t                      <tr>\n");
      out.write("\t                        <td  height=\"25\" align=\"right\">ผู้ช่วยเหลือ :&nbsp;</td>\n");
      out.write("\t                        <td >\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"helper_name\" id=\"helper_name\" style=\"width:550px\"  class=\"text\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.helper_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t                      </tr>\n");
      out.write("\t                      <tr>\n");
      out.write("\t                        <td  height=\"25\" align=\"right\">ชื่อและตำแหน่งผู้ควบคุมการจับกุม :&nbsp;</td>\n");
      out.write("\t                        <td >\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"commander_name\" id=\"commander_name\" style=\"width:550px\" class=\"text\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.commander_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t                      </tr>\n");
      out.write("\t                      <tr>\n");
      out.write("\t\t\t\t\t\t\t<td  align=\"right\">รายละเอียดการจับกุมและความเห็น :&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t\t\t<TEXTAREA NAME=\"arrest_desc\" ROWS=\"3\" COLS=\"70\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.arrest_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t\t  <tr>\n");
      out.write("\t\t\t\t\t\t\t<td  align=\"right\">ความคิดเห็นของผู้บังคับบัญชา :&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t\t\t<TEXTAREA NAME=\"commander_comment\" ROWS=\"3\" COLS=\"70\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.commander_comment}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t  </tr>\n");
      out.write("\t\t\t\t\t\t  <tr height=\"35px\">\n");
      out.write("\t\t\t\t\t\t  \t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t  \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("\t\t\t\t\t\t  \t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t<td width=\"30%\" align=\"right\" valign=\"middle\">ลงชื่อ :&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t<td width=\"30%\">\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t\t<input type=\"text\" id=\"staff_name_sue\" name=\"staff_name_sue\" class=\"textview\" size=\"28\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.staff_name_sue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" \">\n");
      out.write("\t\t\t\t\t\t                    <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\n");
      out.write("\t\t\t\t\t\t                         onClick=\"window.open('process?action=Divide_staff_popForArrest&formname=staff_name_sue&posname=staff_posname_sue' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\n");
      out.write("\t\t\t\t\t\t                    <font style=\"color:red\">*</font>\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t<td width=\"20%\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t<td width=\"20%\">\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t\t<input id=\"staff_posname_sue\" name=\"staff_posname_sue\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.staff_posname_sue }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t\t  \t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t  \t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t  \t\t</table>\n");
      out.write("\t\t\t\t\t\t  \t</td>\n");
      out.write("\t\t\t             </tr>\n");
      out.write("\t\t\t            <tr>\n");
      out.write("\t\t\t\t\t\t\t<td  align=\"right\">คำสั่ง :&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t<td >\n");
      out.write("\t\t\t\t\t\t\t\t<TEXTAREA NAME=\"report_command\" ROWS=\"3\" COLS=\"70\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.report_command}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("                      </table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("\r\n");
      out.write("                </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              \r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\tvar frmvalidator  = new Validator(\"dataform\");\r\n");
      out.write("\r\n");
      out.write(" \tfrmvalidator.addValidation(\"report_title\",\"req\",\"กรุณากรอกเรื่อง\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"case_date\",\"req\",\"กรุณากรอกวันที่จับ\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"accuser_name\",\"req\",\"กรุณากรอกชื่อและตำแหน่งผู้จับกุม\");\r\n");
      out.write(" \r\n");
      out.write(" \tfrmvalidator.addValidation(\"staff_name_sue\",\"req\",\"กรุณากรอกลงชื่อ\");\r\n");
      out.write(" \t//frmvalidator.addValidation(\"ref_doc_date\",\"req\",\"กรุณากรอกวันที่ลงหนังสือ \");\r\n");
      out.write(" \t//frmvalidator.addValidation(\"offcode\",\"req\",\"กรุณากรอกพื้นที่\");\r\n");
      out.write(" \t//frmvalidator.addValidation(\"prove_no\",\"req\",\"กรุณากรอกเลขที่หนังสือส่งผลการพิสูจน์\");\r\n");
      out.write(" \t//frmvalidator.addValidation(\"staff_id_prove_name\",\"req\",\"กรุณากรอกผู้พิสูจน์\");\r\n");
      out.write(" \t//frmvalidator.addValidation(\"prove_date\",\"req\",\"กรุณากรอกวันที่พิสูจน์\");\r\n");
      out.write(" \t//frmvalidator.addValidation(\"prove_objective\",\"req\",\"กรุณากรอกวัตถุประสงค์ในการตรวจพิสูจน์ \");\r\n");
      out.write(" \t//frmvalidator.addValidation(\"prove_result\",\"req\",\"กรุณากรอกผลการตรวจพิสูจน์ \");\r\n");
      out.write(" \t//frmvalidator.addValidation(\"legislation_id\",\"req\",\"กรุณากรอก พรบ \");\r\n");
      out.write(" \t\r\n");
      out.write(" \t</script>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
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
    _jspx_th_c_005furl_005f1.setValue("process?action=ArrestReport");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.id != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<input name=\"btnPrint\"  type=\"button\" class=\"barButton\" value=\"พิมพ์\"\r\n");
        out.write("\t\t\t\t\t\t\t\tonClick=\"Print();\" >\n");
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

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.case_date != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t  <input name=\"case_date\" id=\"case_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyPress=\"txtKeyPress(event);\" value=\"");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\"  />\n");
        out.write("\t\t\t\t\t\t\t\t  <a href=\"javascript:NewCssCal('case_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.case_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
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
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.isnotice == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ar.iscompare == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SaveMSG=='1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t<script>\n");
        out.write("\t\t\t\talert(\"บันทึกเรียบร้อย\");\n");
        out.write("\t\t\t</script>\n");
        out.write("\t\t");
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
}
