package org.apache.jsp.Master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.FormHandler;

public final class BrandList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/Templates/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<script type='text/javascript' src='dwr/interface/Master.js'></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");

PageUtil pageUtil = new PageUtil(request);

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function updatedata(url){\r\n");
      out.write("\t//alert(url);\r\n");
      out.write("\t//if(document.dataform.onsubmit()){\r\n");
      out.write("\tif(document.dataform.cmbDutyGroup.value==\"000\"){\r\n");
      out.write("\t\talert(\"กรุณาเลือกประเภทสินค้า\");\r\n");
      out.write("\t\tdocument.dataform.cmbDutyGroup.select();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(document.dataform1.brand_codeUpdate.value==\"\"){\r\n");
      out.write("\t\talert(\"กรุณากรอกรหัสยี่ห้อ\");\r\n");
      out.write("\t\tdocument.dataform1.brand_codeUpdate.focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}else if(document.dataform1.request_date_startUpdate.value==\"\"){\r\n");
      out.write("\t\talert(\"กรุณาเลือกวันที่เริ่มใช้\");\r\n");
      out.write("\t\tdocument.dataform1.request_date_startUpdate.focus();\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tdocument.dataform1.action=url;\r\n");
      out.write("\t    document.dataform1.submit();\r\n");
      out.write("\t}\r\n");
      out.write("\t//}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function CheckSelectGroupID(){\r\n");
      out.write("\tvar groupID = document.getElementById(\"cmbDutyGroup\");\r\n");
      out.write("\tif (groupID.value == \"000\"){\r\n");
      out.write("\t\talert(\"กรุณาเลือกประเภทสินค้า\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\tfunction confirmBox(str_text,var_id,var_del,var_grp){\r\n");
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
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction chkDupBrand(cName,cGrpID, cID, txtID, btn, fldName){\r\n");
      out.write("\t\tdocument.getElementById(btn).disabled = true;\r\n");
      out.write("\t\t//alert(cName);\r\n");
      out.write("\t\tif(fldName==\"TH\"){\r\n");
      out.write("\t\t\tMaster.chkDupBrandTH(cName,cGrpID, cID, function(data){\r\n");
      out.write("\t\t\t\tif(data != \"\"){\r\n");
      out.write("\t\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\t\ttxtID.select();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(btn).disabled = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}else if(fldName==\"EN\"){\r\n");
      out.write("\t\t\tMaster.chkDupBrandEN(cName,cGrpID, cID, function(data){\r\n");
      out.write("\t\t\t\tif(data != \"\"){\r\n");
      out.write("\t\t\t\t\talert(data);\r\n");
      out.write("\t\t\t\t\ttxtID.select();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(btn).disabled = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t <td width=\"100%\" align=\"left\" valign=\"top\"> \r\n");
      out.write("\t\t \t <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t \t \t<tr>\r\n");
      out.write("                  <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                  <td width=\"99%\"><span class=\"websitename\">ยี่ห้อ</span></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\t \t \t<tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("\t\t \t \t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<form method=\"post\" name=\"dataform\" action=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" >\r\n");
      out.write("                \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"800\">\r\n");
      out.write("                \t\t\t<tr>\r\n");
      out.write("                \t\t\t\t<td width=\"20%\" align=\"right\">ประเภทสินค้า :&nbsp;&nbsp;</td>\r\n");
      out.write("                \t\t\t\t<td width=\"100%\" valign=\"bottom\">\r\n");
      out.write("\t\t\t                        <select name=\"cmbDutyGroup\" id=\"cmbDutyGroup\" style=\"width:200px;height:20px\" >\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"000\" selected >เลือก</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t                    \t</select>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t                        <input type=\"image\" src=\"images/btn_search_big.png\" value=\"submit\" alt=\"Submit\" >\r\n");
      out.write("                \t\t\t\t</td>                \t\t\t\t  \r\n");
      out.write("                \t\t\t</tr>                \t\t\t\r\n");
      out.write("                \t\t</table>\r\n");
      out.write("                \t\t</form> \r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t  <td>&nbsp;</td>\r\n");
      out.write("                  <td >\r\n");
      out.write("                  <table width=\"800\" >\r\n");
      out.write("                  \t<tr></tr>\r\n");
      out.write("                  \t<tr></tr>\r\n");
      out.write("                  \t<tr  align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"4\">");
      out.print(pageUtil.getPagination());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"right\">");
      out.print(pageUtil.getPageStatus());
      out.write("\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("                  </table>\r\n");
      out.write("                  <form method=\"post\" name=\"dataform1\" action=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" >  \r\n");
      out.write("              \t\t<input type=\"hidden\" name=\"cmbDutyGroupCreate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.cmbDutyGroup}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />                 \t\t               \t\r\n");
      out.write("                  \t\t<table class=\"tableList\"  border=\"1\" width=\"800\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">                  \t\t \r\n");
      out.write("                  \t\t <tr>\r\n");
      out.write("                              \t\t<td width=\"100\" class=\"TblHeaderColumn AlignCenter\">&nbsp;</td>\r\n");
      out.write("                              \t\t<td width=\"100\" class=\"TblHeaderColumn\">รหัสยี่ห้อ</td>\r\n");
      out.write("                              \t\t<td width=\"200\" class=\"TblHeaderColumn\">ชื่อยี่ห้อไทย</td>\r\n");
      out.write("                              \t\t<td width=\"200\" class=\"TblHeaderColumn\">ชื่อยี่ห้ออังกฤษ</td>\r\n");
      out.write("                              \t\t<td width=\"150\" class=\"TblHeaderColumn\">วันที่เริ่มใช้</td>\r\n");
      out.write("                              \t\t<td width=\"150\" class=\"TblHeaderColumn\">วันที่สิ้นสุด</td>\r\n");
      out.write("                         </tr>\r\n");
      out.write("                  \t\t<tr><td colspan=\"6\">&nbsp;</td></tr>                  \t\r\n");
      out.write("                  \t\t<tr ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("  >                  \t\t                           \r\n");
      out.write("                              \t\t  <td align=\"center\"><span class=\"spanLink\"> <input type=\"submit\" class=\"barButton\" name=\"save\" id =\"save\" value=\"บันทึก\" onClick=\"return CheckSelectGroupID();\"  /></span></td>\r\n");
      out.write("                              \t\t  <td align=\"center\">\r\n");
      out.write("\t                              \t   \t\t<input type=\"text\" name=\"brand_code\" id=\"brand_code\"  size=\"3\" value=\"NEW\" \r\n");
      out.write("\t                              \t   \t\t\tOnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\"\r\n");
      out.write("\t                              \t\t\t\t\tclass=\"textview\" maxlength=\"3\"  />\r\n");
      out.write("                              \t\t  </td>\r\n");
      out.write("                              \t\t  <td>\r\n");
      out.write("                              \t\t  \t\t<input type=\"text\" name=\"brand_thai\" id=\"brand_thai\" size=\"25\" class=\"textbox\"\r\n");
      out.write("                              \t\t  \t\tonBlur=\"chkDupBrand(this.value,'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.cmbDutyGroup}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("','0',this,'save','TH');\" />\r\n");
      out.write("                              \t\t  \t\t<font color=\"red\">*</font>\r\n");
      out.write("                              \t\t  </td>\r\n");
      out.write("                              \t\t  <td>\r\n");
      out.write("                              \t\t  \t<input type=\"text\" name=\"brand_eng\" id=\"brand_eng\" size=\"25\" class=\"textbox\"\r\n");
      out.write("                              \t\t  \tonBlur=\"chkDupBrand(this.value,'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.cmbDutyGroup}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("','0',this,'save','EN');\" />\r\n");
      out.write("                              \t\t  \t<font color=\"red\">*</font></td>\r\n");
      out.write("                              \t\t  <td>\r\n");
      out.write("                              \t\t    <input id=\"request_date_start\" name=\"request_date_start\" type=\"text\" class=\"textdate\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.request_date_start}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img onclick=\"javascript:NewCssCal('request_date_start','ddmmyyyy')\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"cursor:hand\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<font color=\"red\">*</font>\r\n");
      out.write("                              \t\t  </td>\r\n");
      out.write("                              \t\t  <td>\r\n");
      out.write("                              \t\t  <input id=\"request_date_stop\" name=\"request_date_stop\" type=\"text\" class=\"textdate\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.request_date_stop}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img onclick=\"javascript:NewCssCal('request_date_stop','ddmmyyyy')\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"cursor:hand\" />\r\n");
      out.write("                              \t\t  </td>                                                \t\t                              \r\n");
      out.write("                           </tr>                         \r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("             \t \r\n");
      out.write("                  \t\t </table>  \r\n");
      out.write("                   </form>           \t\t \r\n");
      out.write("                    </td>\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\t \t\t \t \r\n");
      out.write("\t\t \t </table>\t\t \r\n");
      out.write("\t\t </td>\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("//You should create the validator only after the definition of the HTML form\r\n");
      out.write("  var frmvalidator  = new Validator(\"dataform1\");\r\n");
      out.write("  if(document.dataform1.id.value != null){\r\n");
      out.write("\t\tfrmvalidator.addValidation(\"brand_codeUpdate\",\"req\",\"กรุณาป้อนข้อมูล รหัสยี่ห้อ\");\r\n");
      out.write("\t\t//frmvalidator.addValidation(\"brand_nameThaiUpdate\",\"req\",\"กรุณาป้อนข้อมูล ชื่อยี่ห้อไทย\");\r\n");
      out.write("\t\t//frmvalidator.addValidation(\"brand_nameEngUpdate\",\"req\",\"กรุณาป้อนข้อมูล ชื่อยี่ห้ออังกฤษ\");\r\n");
      out.write("\t\tfrmvalidator.addValidation(\"request_date_startUpdate\",\"req\",\"กรุณาป้อนข้อมูล วันที่เริ่มใช้\");\r\n");
      out.write("  }else{\r\n");
      out.write("\t  \tfrmvalidator.addValidation(\"brand_code\",\"req\",\"กรุณาป้อนข้อมูล รหัสยี่ห้อ\");\r\n");
      out.write("\t\t//frmvalidator.addValidation(\"brand_thai\",\"req\",\"กรุณาป้อนข้อมูล ชื่อยี่ห้อไทย\");\r\n");
      out.write("\t\t//frmvalidator.addValidation(\"brand_eng\",\"req\",\"กรุณาป้อนข้อมูล ชื่อยี่ห้ออังกฤษ\");\r\n");
      out.write("\t\tfrmvalidator.addValidation(\"request_date_start\",\"req\",\"กรุณาป้อนข้อมูล วันที่เริ่มใช้\");\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  var frmdataform  = new Validator(\"dataform\");\r\n");
      out.write("  frmdataform.addValidation(\"cmbDutyGroup\",\"dontselect=000\",\"กรุณาเลือกประเภทสินค้า\");\r\n");
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
    _jspx_th_c_005furl_005f0.setValue("/process?action=BrandList_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'&idgrp='+var_grp+'");
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
    _jspx_th_c_005furl_005f1.setValue("/process?action=BrandList_Master&cmd=list");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
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
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dutylist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("grp");
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t   <option value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grp.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${grp.group_id == cmbDutyGroup}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    _jspx_th_c_005furl_005f2.setValue("/process?action=BrandList_Master&cmd=create");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
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
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.id != param.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none\"");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${BrandListData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("brand");
    _jspx_th_c_005fforEach_005f1.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t  \t\t\t\t\t\t<!-- odd row -->\r\n");
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
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.id == param.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t                            <tr>\r\n");
        out.write("\t\t\t                              <input type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" name=\"id\"/>\r\n");
        out.write("\t\t\t                              <input type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" name=\"group_id\"/>\r\n");
        out.write("\t\t\t                              <td align=\"center\">\r\n");
        out.write("\t\t\t                              <span class=\"spanLink\"><input type=\"button\" name=\"save\" id=\"save2\" class=\"barButton\" value=\"แก้ไข\" \r\n");
        out.write("\t\t\t                              \t\tonclick=\"updatedata('");
        if (_jspx_meth_c_005furl_005f3(_jspx_th_c_005fwhen_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("');\"/>\r\n");
        out.write("\t\t\t                              \t</span></td>\r\n");
        out.write("\t\t\t                              <td align=\"center\">\r\n");
        out.write("\t\t\t                              \t\t<input type=\"text\" name=\"brand_codeUpdate\" id=\"brand_codeUpdate\" style=\"text-align:center;\" \r\n");
        out.write("\t\t\t                              \t\tsize=\"3\" class=\"textview\"\r\n");
        out.write("\t\t\t                              \t\tOnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" \t\t\t                              \t\t\r\n");
        out.write("\t\t\t                              \t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.brand_main_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" maxlength=\"3\" /><a name=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/></a>\r\n");
        out.write("\t\t\t                              </td>\r\n");
        out.write("\t\t\t                              <td>\r\n");
        out.write("\t\t\t                                <input type=\"text\" name=\"brand_nameThaiUpdate\" id = \"brand_nameThaiUpdate\" size=\"25\" class=\"textbox\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.brand_main_thai}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t                                onBlur=\"chkDupBrand(this.value,'");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("',this,'save2','TH');\"\r\n");
        out.write("\t\t\t                                 />\r\n");
        out.write("\t\t\t                                <font color=\"red\">*</font>\r\n");
        out.write("\t\t\t                              </td>\r\n");
        out.write("\t\t\t                             <td>\r\n");
        out.write("\t\t\t                                <input type=\"text\" name=\"brand_nameEngUpdate\" id = \"brand_nameEngUpdate\" size=\"25\" class=\"textbox\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.brand_main_eng}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t                                onBlur=\"chkDupBrand(this.value,'");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("',this,'save2','EN');\" />\r\n");
        out.write("\t\t\t                                <font color=\"red\">*</font>\r\n");
        out.write("\t\t\t                              </td>\r\n");
        out.write("\t\t\t                              <td>\r\n");
        out.write("\t\t\t                               \t<input id=\"request_date_startUpdate\" name=\"request_date_startUpdate\" type=\"text\" class=\"textdate\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.begin_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t                               \tOnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" \t /> \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<img onclick=\"javascript:NewCssCal('request_date_startUpdate','ddmmyyyy')\" src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"cursor:hand\" /> \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<font color=\"red\">*</font>                     \r\n");
        out.write("\t\t\t                              </td>\r\n");
        out.write("\t\t\t                              <td>\r\n");
        out.write("\t\t\t                               \t<input id=\"request_date_stopUpdate\" name=\"request_date_stopUpdate\" type=\"text\" class=\"textdate\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.end_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t                               \tOnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" \t />\r\n");
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

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f0);
    _jspx_th_c_005furl_005f3.setValue("/process?action=BrandList_Master&cmd=update");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
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
        if (_jspx_meth_c_005furl_005f4(_jspx_th_c_005fif_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("'\">แก้ไข</span> | <span class=\"spanLink\"  onclick=\"confirmBox('ต้องการลบข้อมูล','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\">ลบ</span></td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.brand_main_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.brand_main_thai}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.brand_main_eng}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.begin_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t  <td class=\"TblRow AlignCenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.end_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005furl_005f4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/process?action=BrandList_Master&cmd=list&id=${brand.id}&group_id=${brand.group_id}&_page=${_page}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
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
        if (_jspx_meth_c_005furl_005f5(_jspx_th_c_005fif_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("'\">แก้ไข</span> | <span class=\"spanLink\" onclick=\"confirmBox('ต้องการบลข้อมูล','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("')\">ลบ</span></td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.brand_main_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignLeft bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.brand_main_thai}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignLeft bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.brand_main_eng}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.begin_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\t\t\t                              \t\r\n");
        out.write("\t\t\t\t                              <td class=\"TblRow AlignCenter bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand.end_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    _jspx_th_c_005furl_005f5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/process?action=BrandList_Master&cmd=list&id=${brand.id}&group_id=${brand.group_id}&_page=${_page}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }
}
