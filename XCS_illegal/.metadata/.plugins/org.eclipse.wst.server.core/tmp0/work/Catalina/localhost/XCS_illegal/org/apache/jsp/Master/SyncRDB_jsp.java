package org.apache.jsp.Master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SyncRDB_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/Templates/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function allCheck(chkcont,chk)\r\n");
      out.write("{\r\n");
      out.write("\tif(!chk.length){\r\n");
      out.write("\t\tif(chkcont.checked==true){\r\n");
      out.write("\t\t\tchk.checked = true ;\r\n");
      out.write("\t\t}else{\t\t\r\n");
      out.write("\t\t\tchk.checked = false ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tif(chkcont.checked==true){\r\n");
      out.write("\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\t\tchk[i].checked = true ;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\t\tchk[i].checked = false ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" name=\"dataform\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" >\r\n");
      out.write("\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td width=\"100%\" align=\"left\" valign=\"top\">\r\n");
      out.write("            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("               <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("                 <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                 <td width=\"99%\"><span class=\"websitename\">ซิงค์ข้อมูลจากฐานข้อมูลอ้างอิงกลาง (RDB)</span></td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input name=\"btnSync\" type=\"submit\" class=\"barbutton\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"ทำข้อมูลให้ตรงกัน\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"writeTranLog('ซิงค์ข้อมูลกับ RDB')\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("               <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("               <tr>\r\n");
      out.write("\t               <td >&nbsp;</td>\r\n");
      out.write("\t               <td>\r\n");
      out.write("\t               \t\t*เลือกตารางที่ต้องการทำข้อมูลให้ตรงกัน<br/>\r\n");
      out.write("\t               \t\t<font color=\"red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ErrMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font>\r\n");
      out.write("\t               \t\t<font color=\"Blue\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CompleteMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</b></font>\r\n");
      out.write("\t               </td>\r\n");
      out.write("               </tr>\r\n");
      out.write("               <tr height=\"450\">\r\n");
      out.write("               \t   <td >&nbsp;</td>\r\n");
      out.write("\t               <td align=\"left\" valign=\"top\">\r\n");
      out.write("\t               \t\t<table class=\"tableList\" bordercolor=\"#CCCCCC\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" width=\"80%\">\r\n");
      out.write("\t               \t\t\t<tr class=\"TblHeaderColumn AlignCenter\">\r\n");
      out.write("\t               \t\t\t\t<td width=\"10%\">ลำดับที่</td>\r\n");
      out.write("\t               \t\t\t\t<td width=\"10%\"><input name=\"aalchkAll\" type=\"checkbox\" onClick=\"allCheck(this,document.dataform.chkList);\"/></td>\r\n");
      out.write("\t               \t\t\t\t<td width=\"80%\">ชื่อตาราง</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >1.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"ED_OFFICE\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลหน่วยงาน(ED_OFFICE)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >2.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"DUTY_GROUP\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลกลุ่มสินค้า(DUTY_GROUP)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >3.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"DUTY_TABLE\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลสินค้าตามพิกัดอัตราภาษี(DUTY_TABLE)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >4.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"PRODUCT_TYPE\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลประเภทสินค้า(PRODUCT_TYPE)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >5.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"UNIT\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลหน่วยนับ(PRODUCT_UNIT)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >6.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"DUTY_UNIT\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลหน่วยนับสินค้า(DUTY_UNIT)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >7.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"COUNTRY\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลประเทศ(COUNTRY)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >8.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"PROVINCE\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลจังหวัด(PROVINCE)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >9.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"DISTRICT\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลอำเภอ(DISTRICT)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >10.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"SUBDISTRICT\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลตำบล(SUBDISTRICT)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >11.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"TITLE\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลคำนำหน้าชื่อ(TITLE)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignCenter\" >12.</td>\r\n");
      out.write("\t               \t\t\t\t<td Align=\"Center\"><input name=\"chkList\" type=\"checkbox\" value=\"BRAND_MAIN\" /></td>\r\n");
      out.write("\t               \t\t\t\t<td class=\"TblRow AlignLeft\">ข้อมูลยี่ห้อหลัก(BRAND_MAIN)</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t</table>\r\n");
      out.write("\t               \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"80%\">\r\n");
      out.write("\t               \t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t               \t\t\t<tr>\r\n");
      out.write("\t               \t\t\t\t<td>\r\n");
      out.write("\t               \t\t\t\t<b>หมายเหตุ !</b> การตรวจสอบข้อมูลและทำข้อมูลให้ตรงกัน เป็นกระบวนการที่อาจใช้เวลานาน และอาจทำให้ระบบงานเกิดความล่าช้า</br>\r\n");
      out.write("\t               \t\t\t\tในกรณีที่มีผู้ใช้งานร่วมกันหลายคน อาจทำให้เครื่อง Server ทำงานหนัก จนไม่สามารถทำการประมวลผลต่อได้<br />\r\n");
      out.write("\t               \t\t\t\tและมีการแจ้งระบบทำงานผิดพลาดออกทางหน้าจอ แต่จะไม่มีผลกระทบต่อระบบงานแต่อย่างใด\r\n");
      out.write("\t               \t\t\t\t</td>\r\n");
      out.write("\t               \t\t\t</tr>\r\n");
      out.write("\t               \t\t</table>\r\n");
      out.write("\t               </td>\r\n");
      out.write("               </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("    </table>\r\n");
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
    _jspx_th_c_005furl_005f0.setValue("/process?action=SyncRDB&cmd=SyncData");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
