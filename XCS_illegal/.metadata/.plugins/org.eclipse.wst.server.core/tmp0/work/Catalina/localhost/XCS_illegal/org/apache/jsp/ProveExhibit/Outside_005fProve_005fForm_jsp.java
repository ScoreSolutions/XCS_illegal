package org.apache.jsp.ProveExhibit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class Outside_005fProve_005fForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/ProveExhibit/Outside_Prove_detail.jsp");
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
      out.write("\t\t\t<form method=\"post\" name=\"dataform\"  action=\"process?action=Outsideprove&cmd=create\" >\r\n");
      out.write(" \r\n");
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
      out.write("\t\twriteTranLog('พิมพ์บันทึกการตรวจพิสูจน์ของกลางจากหน่วยงานภายนอก');\n");
      out.write("\t\tReports.ReportUrl(function(data){\n");
      out.write("\t\t\tif(data != \"\"){\n");
      out.write("\t\t\t\twindow.open(data + \"ReportName=ILL_P039&getTrackNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.job_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&vReportType=PDF&time=\" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\twindow.open('process?action=Report&__report=ILL_P039&__formatt=pdf&getTrackNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.job_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&time=");
      out.print(new java.util.Date().getTime());
      out.write("' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("</script>\r\n");
      out.write("\t\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td width=\"100%\" align=\"left\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"99%\"><span class=\"websitename\">บันทึกการตรวจรับของกลางจากหน่วยงานภายนอก</span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("                <td><hr /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t<td >&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input name=\"btnSave\"  type=\"submit\" class=\"barButton\" value=\"บันทึก\" >\r\n");
      out.write("\t\t\t\t\t<input name=\"btnCancel\"  type=\"button\" class=\"barButton\" value=\"ยกเลิกการแก้ไข\" onclick=\"writeTranLog('ยกเลิกการแก้ไขบันทึกการจับกุม');window.location.href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'; \" >\r\n");
      out.write("\t\t\t\t\t<input name=\"btnBack\"  type=\"button\" class=\"barButton\" value=\"กลับหน้าค้นหา\"  onclick=\"writeTranLog('กลับหน้าค้นหา');window.location.href='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("' \">\r\n");
      out.write("\t\t\t\t\t<input name=\"btnPrint\"  type=\"button\" class=\"barButton\" value=\"พิมพ์\"\r\n");
      out.write("\t\t\t\t\t\t\tonClick=\"Print();\" >\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("                <td><hr /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td ><table width=\"787\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td width=\"375\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td  height=\"25\" align=\"right\">เลขที่งาน :&nbsp;</td>\r\n");
      out.write("                        <td >\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"job_no\" size=\"28\"  class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.job_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"aop_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td width=\"42%\" height=\"25\" align=\"right\" >เลขที่หนังสือจากหน่วยงานภายนอก :&nbsp;</td>\r\n");
      out.write("                        <td width=\"58%\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"ref_doc_no\" size=\"28\"  class=\"text\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.ref_doc_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td  height=\"25\" align=\"right\">หน่วยงานที่ส่งพิสูจน์ :&nbsp;</td>\r\n");
      out.write("                        <td >\r\n");
      out.write("                             <input type=\"radio\" name=\"dept_type\" id=\"rdiDivType\" ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                             value=\"P\" onClick=\"document.dataform.doc_dept_name.value='สถานีตำรวจ';\" />สถานีตำรวจ&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                             <input type=\"radio\" name=\"dept_type\" id=\"rdiDivType\" ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(" value=\"O\">หน่วยงานอื่นๆ\r\n");
      out.write("                             <font style=\"color:red\">*</font>\r\n");
      out.write("                        </td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td  height=\"25\" align=\"right\">ชื่อหน่วยงาน :&nbsp;</td>\r\n");
      out.write("                        <td >\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"doc_dept_name\" id=\"doc_dept_name\" size=\"28\"  class=\"text\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(aop.doc_dept_name != null) ? (aop.doc_dept_name) : 'สถานีตำรวจ'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td  height=\"25\" align=\"right\">เลขที่หนังสือส่งผลการพิสูจน์ :&nbsp;</td>\r\n");
      out.write("                        <td >\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"prove_no\" size=\"28\"  class=\"text\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.prove_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" ><font style=\"color:red\">*</font>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<td  align=\"right\">ชื่อผู้พิสูจน์ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"staff_id_prove_name\" id=\"staff_id_prove_name\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.staff_id_prove_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"staff_id_prove\" id=\"staff_id_prove\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${oaop.staff_id_prove}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\"  name=\"offcode_prove\" id=\"offcode_prove\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${oaop.offcode_prove}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\"  name=\"poscode_prove\" id=\"poscode_prove\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${oaop.poscode_prove}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\" onClick=\r\n");
      out.write("\t\t\t\t\t\t\t\t\"window.open('process?action=Divide_staff_pop&formname=staff_id_prove_name&id=staff_id_prove&posname=posname_prove&poscode=poscode_prove&offcode=offcode_prove' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\" />&nbsp;<font style=\"color:red\">*</font>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("                      </table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("                    <td width=\"408\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                      <tr valign=\"top\">\r\n");
      out.write("                        <td width=\"40%\" height=\"25\" align=\"right\" >วันที่รับเรื่อง :&nbsp;</td>\r\n");
      out.write("                        <td width=\"60%\">\n");
      out.write("                        \t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.job_date2 == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<input name=\"job_date\" id=\"job_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
          //  fmt:formatDate
          org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
          _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
          _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
          _jspx_th_fmt_005fformatDate_005f1.setValue(new Date() );
          _jspx_th_fmt_005fformatDate_005f1.setPattern("dd/MM/yyyy");
          int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
          if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
            return;
          }
          _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
          out.write("\"  />\n");
          out.write("\t\t\t\t\t\t\t  \t<a href=\"javascript:NewCssCal('job_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>&nbsp;&nbsp;เวลา :&nbsp;\n");
          out.write("\t\t\t\t\t\t\t  \t<input name=\"job_time\" type=\"text\" class=\"textbox\" size=\"5\" maxlength=\"5\" value=\"");
          //  fmt:formatDate
          org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
          _jspx_th_fmt_005fformatDate_005f2.setPageContext(_jspx_page_context);
          _jspx_th_fmt_005fformatDate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
          _jspx_th_fmt_005fformatDate_005f2.setValue(new Date() );
          _jspx_th_fmt_005fformatDate_005f2.setPattern("HH:mm");
          int _jspx_eval_fmt_005fformatDate_005f2 = _jspx_th_fmt_005fformatDate_005f2.doStartTag();
          if (_jspx_th_fmt_005fformatDate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
            return;
          }
          _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
          out.write("\" onkeypress=\"txtTime_OnKeyPress(this);\"/>\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td height=\"25\" align=\"right\">หนังสือลงวันที่ :&nbsp;</td>\r\n");
      out.write("                        <td height=\"25\"><input name=\"ref_doc_date\" id=\"ref_doc_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.ref_doc_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  />\r\n");
      out.write("                          <a href=\"javascript:NewCssCal('ref_doc_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>\r\n");
      out.write("\t\t\t\t\t\t  <font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      \r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td  height=\"25\" align=\"right\">พ.ร.บ. :&nbsp;</td>\r\n");
      out.write("                        <td >\r\n");
      out.write("\t\t\t\t\t\t\t <select name=\"legislation_id\" id=\"legislation_id\" style=\"width:200px;\" >\n");
      out.write("     \t\t\t\t\t\t<option value=\"\" selected>เลือก</option>\n");
      out.write("            \t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("   \t\t\t\t\t\t\t </select>\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td  height=\"25\" align=\"right\">พื้นที่ :&nbsp;</td>\r\n");
      out.write("                        <td >\r\n");
      out.write("                             <select name=\"offcode\" id=\"offcode\" style=\"width:200px;\">\r\n");
      out.write("                              <option value=\"\" >เลือก</option>\r\n");
      out.write("        \t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                             </select>\r\n");
      out.write("                             <font style=\"color:red\">*</font>\r\n");
      out.write("                        </td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td height=\"25\" align=\"right\">วันที่พิสูจน์ :&nbsp;</td>\r\n");
      out.write("                        <td height=\"25\"><input name=\"prove_date\" id=\"prove_date\" type=\"text\" class=\"textdate\" OnKeyPress=\"window.event.keyCode = 0\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.prove_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  />\r\n");
      out.write("                          <a href=\"javascript:NewCssCal('prove_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>&nbsp;<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td  height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"posname_prove\" id=\"posname_prove\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.posname_prove}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  />\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\">ตำแหน่ง(กรณีปฏิบัติราชการแทน) :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"replace_position\" type=\"text\" size=\"25\"  class=\"textbox\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.replace_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("                      </table></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("\r\n");
      out.write("                </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  >\r\n");
      out.write("\t\t\t\t\t\t<tr >\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"10\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"bgRowGray\"><strong>สิ่งที่ส่งตรวจพิสูจน์</strong></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"1\"><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td >&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("                              <span class=\"spanLink\" onClick=\"duopenmodal('duTable')\">เพิ่มใหม่</span> |\r\n");
      out.write("                              <span class=\"spanLink\" onClick=\"duget_check_value('duTable')\">ลบรายการที่เลือก</span>\r\n");
      out.write("\r\n");
      out.write("                         </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td >&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("<!-- =========================================================สิ่งของ======================================================================================  -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var dumaxrow=1; // jsp  Count  config\r\n");
      out.write("var dustartrow=2;\r\n");
      out.write("var dueditrow = -1;\r\n");
      out.write("var dueditna = 0;\r\n");
      out.write("\r\n");
      out.write("function duinsRow(myTable,dumaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26)\r\n");
      out.write("{\r\n");
      out.write("var row;\r\n");
      out.write("var x=document.getElementById(myTable).insertRow(dumaxrow);\r\n");
      out.write("dumaxrow++;\r\n");
      out.write("row = dumaxrow - 1;\r\n");
      out.write("var y1=x.insertCell(0);\r\n");
      out.write("var y2=x.insertCell(1);\r\n");
      out.write("var y3=x.insertCell(2);\r\n");
      out.write("var y4=x.insertCell(3);\r\n");
      out.write("var y5=x.insertCell(4);\r\n");
      out.write("var y6=x.insertCell(5);\r\n");
      out.write("var y7=x.insertCell(6);\r\n");
      out.write("var y8=x.insertCell(7);\r\n");
      out.write("var y9=x.insertCell(8);\r\n");
      out.write("var y10=x.insertCell(9);\r\n");
      out.write("var y11=x.insertCell(10);\r\n");
      out.write("var y12=x.insertCell(11);\r\n");
      out.write("\r\n");
      out.write("var exp = new Date();\r\n");
      out.write("var s = exp.getTime();\r\n");
      out.write("\r\n");
      out.write("y1.innerHTML=\"<input  OnKeyPress='window.event.keyCode = 0' class='textboxlist' size='1' name='dutc_id' value='\" + row + \"' />\";\r\n");
      out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"ducheck_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"duref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
      out.write("\n");
      out.write("var productDesc = \"<a class='spanLink' onClick=\\\"duforedit('\"+ s +\"');dueditmodal('duTable');durerun_id();\\\">\";\n");
      out.write("\n");
      out.write("if(data12 != \"\")\n");
      out.write("\tproductDesc += data12;\n");
      out.write("else\n");
      out.write("\tproductDesc += data24;\n");
      out.write("\t\n");
      out.write("if(data13 != \"\")\n");
      out.write("\tproductDesc += \" ยี่ห้อ \"+data13;\n");
      out.write("\n");
      out.write("productDesc +=\"</a>\";\n");
      out.write("\n");
      out.write("y3.innerHTML=productDesc;\r\n");
      out.write("y4.innerHTML=data6+\" \"+data16;\r\n");
      out.write("y5.innerHTML=data14+\" \"+data17;\r\n");
      out.write("y6.innerHTML=data8+\" \"+data15;\r\n");
      out.write("y7.innerHTML=data10;\r\n");
      out.write("y8.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"api_id\\\" value=\\\"\"+data1+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_product_code\\\" value=\\\"\"+data2+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_brand_code\\\" value=\\\"\"+data3+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_sizes_code\\\" value=\\\"\"+data4+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_unit_size\\\" value=\\\"\"+data5+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_qty\\\" value=\\\"\"+data6+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_unit_qty\\\" value=\\\"\"+data7+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_netweight\\\" value=\\\"\"+data8+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_unit_netweight\\\" value=\\\"\"+data9+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_description\\\" value=\\\"\"+data10+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_remarks\\\" value=\\\"\"+data11+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_product_name\\\" value=\\\"\"+data12+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_brand_name\\\" value=\\\"\"+data13+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_size_desc\\\" value=\\\"\"+data14+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_unit_wnet_name\\\" value=\\\"\"+data15+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_unit_qty_name\\\" value=\\\"\"+data16+\"\\\">\"+\r\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_unit_size_name\\\" value=\\\"\"+data17+\"\\\">\"+\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_duty_code\\\" value=\\\"\"+data18+\"\\\">\"+\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_brand_second_code\\\" value=\\\"\"+data19+\"\\\">\"+\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_brand_second_name\\\" value=\\\"\"+data20+\"\\\">\"+\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_model_code\\\" value=\\\"\"+data21+\"\\\">\"+\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_model_name\\\" value=\\\"\"+data22+\"\\\">\"+\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_group_id\\\" value=\\\"\"+data23+\"\\\">\"+\n");
      out.write("\"<input type=\\\"hidden\\\" name=\\\"api_group_name\\\" value=\\\"\"+data24+\"\\\">\"+\r\n");
      out.write("data11;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
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
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("function dudelRow(myTable)\r\n");
      out.write("{\r\n");
      out.write("if (dumaxrow>1)\r\n");
      out.write("{\r\n");
      out.write("var x=document.getElementById(myTable).deleteRow(myTable,dumaxrow-1);\r\n");
      out.write("dumaxrow--\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("function duopenmodal(myTable)\r\n");
      out.write("{\r\n");
      out.write("var data = window.showModalDialog('process?action=Ope' , self , 'Width=500px,Height=400px');\r\n");
      out.write("if(data != null){\r\n");
      out.write("\t\r\n");
      out.write("\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26]);\r\n");
      out.write("\twriteTranLog('เพิ่มรายการสินค้า');\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function dueditmodal(myTable)\r\n");
      out.write("{\r\n");
      out.write("\tdueditna= 1;\r\n");
      out.write("var data = window.showModalDialog('process?action=Ope', self , 'Width=500px,Height=400px');\r\n");
      out.write("if(data != null){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tdudelRown(myTable,dueditrow);\r\n");
      out.write("\r\n");
      out.write("\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26]);\r\n");
      out.write("\r\n");
      out.write("\t}\n");
      out.write("\t\r\n");
      out.write("\tdueditna = 0;\r\n");
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
      out.write("if (dumaxrow == 2 && document.dataform.ducheck_list.checked)\r\n");
      out.write("{\r\n");
      out.write("\tdocument.getElementById(myTable).deleteRow(1);\r\n");
      out.write("\tdumaxrow--;\n");
      out.write("\twriteTranLog('ลบรายการสินค้า');\r\n");
      out.write("}else{\r\n");
      out.write("for (var i=0; i < document.dataform.ducheck_list.length; i++)\r\n");
      out.write("   {\r\n");
      out.write("   if (document.dataform.ducheck_list[i].checked)\r\n");
      out.write("      {\r\n");
      out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
      out.write("\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
      out.write("\t\ti--;\r\n");
      out.write("\t\tdumaxrow--;\r\n");
      out.write("      }\r\n");
      out.write("   }\n");
      out.write("if(x!=dumaxrow){\n");
      out.write("    writeTranLog('ลบรายการสินค้า');\n");
      out.write("    durerun_id();\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("   //alert(dumaxrow-1);\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("   function durender(myTable)\r\n");
      out.write("{\r\n");
      out.write(" for (i=1;i<=dudata1.length-1;i++)\r\n");
      out.write("    {\r\n");
      out.write("        duinsRow(myTable,i,dudata1[i],dudata2[i],dudata3[i],dudata4[i],dudata5[i],dudata6[i],dudata7[i],dudata8[i],dudata9[i],dudata10[i],dudata11[i],dudata12[i],dudata13[i],dudata14[i],dudata15[i],dudata16[i],dudata17[i],dudata18[i],dudata19[i],dudata20[i],dudata21[i],dudata22[i],dudata23[i],dudata24[i] ,dudata25[i],dudata26[i]);\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("function allCheck(chkcont,chk)\n");
      out.write("{\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\tif(!chk.length){\n");
      out.write("\n");
      out.write("\t\t\tif(chkcont.checked==true){\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tchk.checked = true ;\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tchk.checked = false ;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t}else{\n");
      out.write("\t\t\n");
      out.write("\t\tif(chkcont.checked==true){\n");
      out.write("\t\t\tfor (i = 0; i < chk.length; i++)\n");
      out.write("\t\t\tchk[i].checked = true ;\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\tfor (i = 0; i < chk.length; i++)\n");
      out.write("\t\t\tchk[i].checked = false ;\n");
      out.write("\t\t\t}\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("</script>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                      <table id=\"duTable\" class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("                                         <tr>\r\n");
      out.write("                                            <td width=\"30\"  height=\"15\" class=\"TblHeaderColumn AlignCenter\">ลำดับ</td>\r\n");
      out.write("                                            <td width=\"20\" class=\"TblHeaderColumn AlignCenter\"><input name=\"chkAll\" type=\"checkbox\" onClick=\"allCheck(this,document.dataform.ducheck_list);\" /></td>\r\n");
      out.write("                                            <td width=\"310\"  class=\"TblHeaderColumn \">ชื่อสินค้า</td>\r\n");
      out.write("                                            <td width=\"80\"  class=\"TblHeaderColumn \">จำนวน</td>\r\n");
      out.write("                                            <td width=\"80\"  class=\"TblHeaderColumn \">ขนาดบรรจุ</td>\r\n");
      out.write("                                            <td width=\"80\"  class=\"TblHeaderColumn \">ปริมาณสุทธิ</td>\r\n");
      out.write("                                            <td width=\"200\"  class=\"TblHeaderColumn \">รายละเอียด</td>\r\n");
      out.write("                                            <td width=\"200\"  class=\"TblHeaderColumn \">หมายเหตุ</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                          ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("                                      </table>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"800\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"25%\" align=\"right\" valign=\"top\">วัตถุประสงค์ในการตรวจพิสูจน์ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"75%\"  >\r\n");
      out.write("\t\t\t\t\t\t\t\t<TEXTAREA NAME=\"prove_objective\" ROWS=\"3\" COLS=\"70\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.prove_objective}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"1%\" valign=\"top\"><font style=\"color:red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" NAME=\"isreturn\" value=\"Y\" ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write(">รับของกลางคืนพร้อมผลการตรวจพิสูจน์\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"  valign=\"top\">ผลการตรวจพิสูจน์ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t\t<TEXTAREA NAME=\"prove_result\" ROWS=\"10\" COLS=\"70\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${oaop.prove_result}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td  valign=\"top\"><font style=\"color:red\">*</font></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t  <script type=\"text/javascript\" >\r\n");
      out.write("\t\t  durender('duTable');\r\n");
      out.write("\t\t  document.dataform.offcode.value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offcodenow}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t  document.dataform.legislation_id.value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${oaop.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  </script>\r\n");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\tvar frmvalidator  = new Validator(\"dataform\");\r\n");
      out.write("\r\n");
      out.write(" \tfrmvalidator.addValidation(\"ref_doc_no\",\"req\",\"กรุณากรอกเลขที่หนังสือจากหน่วยงานภายนอก\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"doc_dept_name\",\"req\",\"กรุณากรอกชื่อหน่วยงาน\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"job_time\",\"req\",\"กรุณากรอกเวลารับเรื่อง\");\r\n");
      out.write(" \r\n");
      out.write(" \tfrmvalidator.addValidation(\"job_date\",\"req\",\"กรุณากรอกวันที่รับเรื่อง\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"ref_doc_date\",\"req\",\"กรุณากรอกวันที่ลงหนังสือ \");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"offcode\",\"req\",\"กรุณากรอกพื้นที่\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"prove_no\",\"req\",\"กรุณากรอกเลขที่หนังสือส่งผลการพิสูจน์\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"staff_id_prove_name\",\"req\",\"กรุณากรอกผู้พิสูจน์\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"prove_date\",\"req\",\"กรุณากรอกวันที่พิสูจน์\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"prove_objective\",\"req\",\"กรุณากรอกวัตถุประสงค์ในการตรวจพิสูจน์ \");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"prove_result\",\"req\",\"กรุณากรอกผลการตรวจพิสูจน์ \");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"legislation_id\",\"req\",\"กรุณากรอก พรบ \");\r\n");
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
    _jspx_th_c_005furl_005f1.setValue("process?action=Outsideprove");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.dept_type == 'P'|| aop.dept_type == ''|| aop.dept_type == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.dept_type == 'O' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.job_date2 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t  <input name=\"job_date\" id=\"job_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.job_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("\t\t\t\t\t\t\t  <a href=\"javascript:NewCssCal('job_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>&nbsp;&nbsp;เวลา :&nbsp;\r\n");
        out.write("\t\t\t\t\t\t\t  <input name=\"job_time\" type=\"text\" class=\"textbox\" size=\"5\" maxlength=\"5\" value=\"");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\" onkeypress=\"txtTime_OnKeyPress(this);\"/>\n");
        out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${oaop.job_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_fmt_005fformatDate_005f0.setPattern("HH:mm");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
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
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("ltion");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            \t\t\t\t<option value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.legislation_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("            \t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${edlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("off");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          \t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.short_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("        \t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offcodenow==off.offcode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aaelist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f2.setVar("aae");
    _jspx_th_c_005fforEach_005f2.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.sizes_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.unit_size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.unit_qty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.unit_netweight}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.remarks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata13[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata14[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata15[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.unit_wnet_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata16[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.unit_qty_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata17[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.unit_size_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata18[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata19[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_second}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata20[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_second_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata21[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.model_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata22[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.model_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata23[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata24[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aop.isreturn == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SaveMsg=='1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<script>\n");
        out.write("\t\talert(\"บันทึกเรียบร้อย\");\n");
        out.write("\t</script>\n");
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
}
