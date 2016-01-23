package org.apache.jsp.Master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.FormHandler;

public final class DutyTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/Templates/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
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
      out.write("<script type='text/javascript' src='dwr/interface/Master.js'></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction updateDutyTable(url){\r\n");
      out.write("\t\tif (ValidUpdate()==true){\r\n");
      out.write("\t\t\tdocument.dataform.action=url;\r\n");
      out.write("\t\t    document.dataform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction confirmBox(str_text,var_id,var_del){\r\n");
      out.write("\t\tvar r\r\n");
      out.write("\t\tMaster.chkRelCourt(var_id,function(data){\r\n");
      out.write("\t\t\tif(data != \"\"){\r\n");
      out.write("\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\tr = false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse {\r\n");
      out.write("\t\t\t\tr = confirm(str_text);\r\n");
      out.write("\t\t  \t\tif(r){\r\n");
      out.write("\t\t  \t  \twindow.location.href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t  \t\t\t}\t\r\n");
      out.write("\t  \t\t}\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("  \t\treturn r;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction hideSaveButton(){\r\n");
      out.write("\t\tdocument.getElementById(\"saveButton\").style.display='none';;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction ValidInsert(){\r\n");
      out.write("\t\tif (document.getElementById(\"duty_code\").value==\"\"){\r\n");
      out.write("\t\t\talert(\"กรุณาระบุรหัสชนิดสินค้า\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"duty_code\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(document.getElementById(\"duty_name\").value==\"\"){\r\n");
      out.write("\t\t\talert(\"กรุณาระบุชื่อชนิดสินค้า\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"duty_name\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(document.getElementById(\"cmbDutyGroup\").value==\"\"){\r\n");
      out.write("\t\t\talert(\"กรุณาเลือกประเภทสินค้า\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(document.getElementById(\"request_date_start\").value==\"\"){\r\n");
      out.write("\t\t\talert(\"กรุณาเลือกวันที่เริ่มใช้งาน\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction ValidUpdate(){\r\n");
      out.write("\t\tif (document.getElementById(\"Duty_codeUpdate\").value==\"\"){\r\n");
      out.write("\t\t\talert(\"กรุณาระบุรหัสชนิดสินค้า\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"Duty_codeUpdate\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(document.getElementById(\"Duty_nameUpdate\").value==\"\"){\r\n");
      out.write("\t\t\talert(\"กรุณาระบุชื่อชนิดสินค้า\");\r\n");
      out.write("\t\t\tdocument.getElementById(\"Duty_nameUpdate\").focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(document.getElementById(\"cmbDutyGroupUpdate\").value==\"\"){\r\n");
      out.write("\t\t\talert(\"กรุณาเลือกประเภทสินค้า\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(document.getElementById(\"request_date_startUpdate\").value==\"\"){\r\n");
      out.write("\t\t\talert(\"กรุณาเลือกวันที่เริ่มใช้งาน\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction chkDupCode(cCode, cID, txtID, btn){\r\n");
      out.write("\t\tdocument.getElementById(btn).disabled = true;\r\n");
      out.write("\t\tMaster.chkDupDutyTable(cCode, cID, function(data){\r\n");
      out.write("\t\t\tif(data != \"\"){\r\n");
      out.write("\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\ttxtID.select();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tdocument.getElementById(btn).disabled = false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction ValidRightClick(e) {\r\n");
      out.write("\t    if (navigator.appName == 'Netscape' && e.which == 3) {\r\n");
      out.write("\t    \t//document.getElementById(\"Duty_nameUpdate\").select();\r\n");
      out.write("\t    \t\r\n");
      out.write("\t        alert(\"no right click please\");\r\n");
      out.write("\t        return false;\r\n");
      out.write("\t    }\r\n");
      out.write("\t    else {\r\n");
      out.write("\t        if (navigator.appName == 'Microsoft Internet Explorer' && event.button == 2){\r\n");
      out.write("\t        \talert(\"no right click please\");\r\n");
      out.write("\t        \treturn false;\r\n");
      out.write("\t        }\r\n");
      out.write("\t    }\r\n");
      out.write("\t    return true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<form method=\"post\" name=\"dataform\" action=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"  >\r\n");
      out.write("\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td width=\"100%\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t \t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t \t\t<tr>\r\n");
      out.write("                  <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                  <td width=\"99%\"><span class=\"websitename\">ชนิดสินค้า</span></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                 \t<td>&nbsp;</td>\r\n");
      out.write("                  \t<td >\t\r\n");
      out.write("                  \t\t<table border=\"0\" width=\"800\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("                  \t\t\t<tr>\r\n");
      out.write("                  \t\t\t  <td>\r\n");
      out.write("                  \t\t\t\t<table class=\"tableList\" width=\"850\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
      out.write("                  \t\t\t\t  <tr>\r\n");
      out.write("                              \t\t<td width=\"100\" class=\"TblHeaderColumn AlignCenter\">&nbsp;</td>\r\n");
      out.write("                              \t\t<td width=\"100\" class=\"TblHeaderColumn\">รหัสชนิดสินค้า</td>\r\n");
      out.write("                              \t\t<td width=\"250\" class=\"TblHeaderColumn\">ชื่อชนิดสินค้า</td>\r\n");
      out.write("                              \t\t<td width=\"150\" class=\"TblHeaderColumn\">ประเภทชนิดสินค้า</td>\r\n");
      out.write("                              \t\t<td width=\"150\" class=\"TblHeaderColumn\">วันที่เริ่มใช้</td>\r\n");
      out.write("                              \t\t<td width=\"150\" class=\"TblHeaderColumn\">วันที่สิ้นสุด</td>\r\n");
      out.write("                            \t  </tr>\r\n");
      out.write("                  \t\t\t\t  <tr><td colspan=\"6\">&nbsp;</td></tr>\r\n");
      out.write("                  \t\t\t\t  <tr ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" >\r\n");
      out.write("                              \t\t  <td align=\"center\"><span class=\"spanLink\"><input type=\"submit\" class=\"barButton\" name=\"save\" id =\"save\" value=\"บันทึก\" onClick=\"return ValidInsert();\" /></span></td>\r\n");
      out.write("                              \t\t  <td align=\"center\">\r\n");
      out.write("\t                              \t   \t\t<input type=\"text\" name=\"duty_code\" id=\"duty_code\" onmousedown =\"return ValidRightClick(event);\"  onBlur=\"chkDupCode(this.value,'0',this,'save');\" size=\"3\" value=\"NEW\" \r\n");
      out.write("\t                              \t\t\t\t\tclass=\"textview\" OnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" />\r\n");
      out.write("                              \t\t  </td>\r\n");
      out.write("                              \t\t  <td><input type=\"text\" name=\"duty_name\" id=\"duty_name\" size=\"30\" class=\"textbox\" /><font color=\"red\">*</font></td>\r\n");
      out.write("                              \t\t <td>\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t\t<select name=\"cmbDutyGroup\" id=\"cmbDutyGroup\" style=\"width:200px;\">\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"\">เลือก</option>");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t                    \t\t</select>                              \r\n");
      out.write("                              \t\t </td>\r\n");
      out.write("                              \t\t  <td>\r\n");
      out.write("                              \t\t    <input id=\"request_date_start\" name=\"request_date_start\" type=\"text\" class=\"textdate\" OnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.request_date_start}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img onclick=\"javascript:NewCssCal('request_date_start','ddmmyyyy')\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"cursor:hand\" />\r\n");
      out.write("                              \t\t  </td>\r\n");
      out.write("                              \t\t  <td>\r\n");
      out.write("                              \t\t  <input id=\"request_date_stop\" name=\"request_date_stop\" type=\"text\" class=\"textdate\" OnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.request_date_stop}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img onclick=\"javascript:NewCssCal('request_date_stop','ddmmyyyy')\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"cursor:hand\" />\r\n");
      out.write("                              \t\t  </td>                          \t\t                              \r\n");
      out.write("                            \t </tr>\r\n");
      out.write("                  \t\t\t ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("                  \t\t\t\r\n");
      out.write("                  \t\t\t\t</table>\r\n");
      out.write("                  \t\t\t  </td>\r\n");
      out.write("                  \t\t\t</tr>             \t\r\n");
      out.write("                  \t\t</table>\r\n");
      out.write("                  \t</td>        \r\n");
      out.write("                </tr>\t\t \r\n");
      out.write("\t\t \t</table>\r\n");
      out.write("\t\t</td>\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>");
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
    _jspx_th_c_005furl_005f0.setValue("/process?action=DutyTable_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'");
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
    _jspx_th_c_005furl_005f1.setValue("/process?action=DutyTable_Master&cmd=create");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id != param.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dutygrplist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("grp");
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grp.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grp.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dutylist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("duty");
    _jspx_th_c_005fforEach_005f1.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t\t  \t\t\t\t\t\t\r\n");
          out.write("\t\t  \t\t\t\t\t\t");
          if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t  \t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t                            ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t  \t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id == param.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t                            <tr>\r\n");
        out.write("\t\t\t                              <input type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" name=\"id\"/>\r\n");
        out.write("\t\t\t                              <td align=\"center\"><span class=\"spanLink\"><input type=\"button\" name=\"save\" id=\"save2\" class=\"barButton\" value=\"แก้ไข\" onclick=\"updateDutyTable('");
        if (_jspx_meth_c_005furl_005f2(_jspx_th_c_005fwhen_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("');\"/></span></td>\r\n");
        out.write("\t\t\t                              <td align=\"center\">\r\n");
        out.write("\t\t\t                              \t\t<input type=\"text\" name=\"Duty_codeUpdate\" id=\"Duty_codeUpdate\" onmousedown =\"return ValidRightClick(event);\" \r\n");
        out.write("\t\t\t                              \t\tonBlur=\"chkDupCode(this.value,'");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("',this,'save2');\" size=\"10\" \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"textview\" style=\"text-align:center;\" OnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\"\r\n");
        out.write("\t\t\t                              \t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /><a name=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/></a>\r\n");
        out.write("\t\t\t                              </td>\r\n");
        out.write("\t\t\t                              <td>\r\n");
        out.write("\t\t\t                                <input type=\"text\" name=\"Duty_nameUpdate\" id = \"Duty_nameUpdate\" size=\"30\" class=\"textbox\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.duty_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t                                <font color=\"red\">*</font>\r\n");
        out.write("\t\t\t                              </td>\r\n");
        out.write("\t\t\t                              <td>\r\n");
        out.write("\t\t\t                               <select name=\"cmbDutyGroupUpdate\" id=\"cmbDutyGroupUpdate\" style=\"width:200px;\">\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">เลือก</option>\t                          \r\n");
        out.write("\t\t\t                       \t\t\t");
        if (_jspx_meth_c_005fforEach_005f2(_jspx_th_c_005fwhen_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t                    \t\t\t</select> \t\t                              \r\n");
        out.write("\t\t\t                              \r\n");
        out.write("\t\t\t                              </td>   \r\n");
        out.write("\t\t\t                              <td>\r\n");
        out.write("\t\t\t                               <input id=\"request_date_startUpdate\" name=\"request_date_startUpdate\" type=\"text\" class=\"textdate\" OnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.begin_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /> \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img onclick=\"javascript:NewCssCal('request_date_startUpdate','ddmmyyyy')\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"cursor:hand\" />                      \r\n");
        out.write("\t\t\t                              </td>\r\n");
        out.write("\t\t\t                              <td>\r\n");
        out.write("\t\t\t                               <input id=\"request_date_stopUpdate\" name=\"request_date_stopUpdate\" type=\"text\" class=\"textdate\" OnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.end_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img onclick=\"javascript:NewCssCal('request_date_stopUpdate','ddmmyyyy')\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"cursor:hand\" />\r\n");
        out.write("\t\t\t                              </td>\t\t\t                \r\n");
        out.write("\t\t\t                            </tr>\r\n");
        out.write("\t\t                            ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    _jspx_th_c_005furl_005f2.setValue("/process?action=DutyTable_Master&cmd=update");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dutygrplist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f2.setVar("grp");
    _jspx_th_c_005fforEach_005f2.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grp.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grp.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grp.group_id == duty.group_id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                            \t");
        if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fotherwise_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t                            \t\t");
        if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fotherwise_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t                            ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(i.count % 2) == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t                            \t<tr>\t\t\t                            \t\t\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter\"><span class=\"spanLink\" onclick=\"javascript:location.href='");
        if (_jspx_meth_c_005furl_005f3(_jspx_th_c_005fif_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('#');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'\">แก้ไข</span> | <span class=\"spanLink\"  onclick=\"confirmBox('ต้องการลบข้อมูล','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\">ลบ</span></td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.duty_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.begin_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t  <td class=\"TblRow AlignCenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.end_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                            </tr>\r\n");
        out.write("\t                            \t\t");
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

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005furl_005f3.setValue("/process?action=DutyTable_Master&id=");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(i.count % 2) == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                            \t\t\t<tr>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter bgRowGray\"><span class=\"spanLink\" onclick=\"javascript:location.href='");
        if (_jspx_meth_c_005furl_005f4(_jspx_th_c_005fif_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('#');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("';\">แก้ไข</span> | <span class=\"spanLink\" onclick=\"confirmBox('ต้องการบลข้อมูล','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\">ลบ</span></td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignLeft bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.duty_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignLeft bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.begin_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\t\t\t                              \t\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty.end_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\t\r\n");
        out.write("\t\t\t\t                            </tr>\r\n");
        out.write("\t                            \t\t");
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

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    _jspx_th_c_005furl_005f4.setValue("/process?action=DutyTable_Master&id=");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }
}
