package org.apache.jsp.CompareCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;

public final class reward_005frequest_005ftax_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Templates/meta.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- HTTP 1.1 -->\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\"/>\r\n");
      out.write("<!-- HTTP 1.0 -->\r\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n");
      out.write("<!-- Prevents caching at the Proxy Server -->\r\n");
      out.write("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\"/>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function writeTranLog(tran_desc){\r\n");
      out.write("\tvar browser = \"");
      out.print(RequestUtil.getBrowser(request));
      out.write("\";\r\n");
      out.write("\tvar ip_address = \"");
      out.print(RequestUtil.getIpAddress(request));
      out.write("\";\r\n");
      out.write("\tvar user_id = \"");
      out.print(RequestUtil.getUserSession(request).getUserId());
      out.write("\";\r\n");
      out.write("\tvar session_id = \"");
      out.print(request.getSession().getId());
      out.write("\";\r\n");
      out.write("\tTranlog.writeTranLog(user_id,ip_address,tran_desc,browser,session_id);\r\n");
      out.write("}\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("<input type=\"hidden\" name=\"al_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("<input type=\"hidden\" name=\"arr_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.arr_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("<tr class=\"bgRowGray\">\r\n");
      out.write("    <td colspan=\"4\"><strong>รายงานการจับกุม</strong></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"center\">\r\n");
      out.write("        <span class=\"spanLink\"\r\n");
      out.write("              onClick=\"printReports('ILL_P023_3&getTrackNo='+document.dataform.request_no.value);\">พิมพ์รายงาน</span>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td colspan=\"3\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"right\">เรื่อง :&nbsp;</td>\r\n");
      out.write("    <td colspan=\"3\">\r\n");
      out.write("    \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td width=\"20%\" align=\"right\">สินค้า :&nbsp;</td>\r\n");
      out.write("    <td width=\"30%\">\r\n");
      out.write("        <input name=\"txtProductGroupName\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.product_group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("    </td>\r\n");
      out.write("    <td width=\"50%\" height=\"25\" align=\"left\" valign=\"middle\" colspan=\"2\">\r\n");
      out.write("        <input type=\"checkbox\" name=\"chkInform\" id=\"chkInform\" ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("        onclick=\"chkInform1('chkInform','chkCountInform');\" value=\"Y\" />มีการแจ้งความ&nbsp;&nbsp;\r\n");
      out.write("        <input type=\"checkbox\" name=\"chkCountInform\" id=\"chkCountInform\" \r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("  value=\"Y\" />ตรวจนับได้ตรงกับที่แจ้ง\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr height=\"1\">\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"right\" valign=\"top\">ชนิดและปริมาณของที่จับได้ :&nbsp;</td>\r\n");
      out.write("    <td colspan=\"3\">\r\n");
      out.write("        <table class=\"tableList\" width=\"560\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"30\" height=\"15\" class=\"TblHeaderColumn AlignCenter\">ลำดับ</td>\r\n");
      out.write("                <td width=\"200\" class=\"TblHeaderColumn \"bgcolor=\"#F5F5F5\">ชื่อสินค้า</td>\r\n");
      out.write("                <td width=\"150\" class=\"TblHeaderColumn \"bgcolor=\"#F5F5F5\">ยี่ห้อ</td>\r\n");
      out.write("                <td width=\"80\" class=\"TblHeaderColumn \"bgcolor=\"#F5F5F5\">จำนวน</td>\r\n");
      out.write("                <td width=\"100\" class=\"TblHeaderColumn \"bgcolor=\"#F5F5F5\">หน่วย</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          \t<tbody id=\"exhibit_item\">\r\n");
      out.write("          \t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          \t</tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr height=\"1\">\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"right\" valign=\"top\">ลักษณะที่ตรวจพบ :&nbsp;</td>\r\n");
      out.write("    <td colspan=\"3\">\r\n");
      out.write("        <TEXTAREA NAME=\"abnormaly\" ROWS=\"2\" COLS=\"73\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.abnormality}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\r\n");
      out.write("        <font style=\"color:red\">*</font>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr height=\"1\">\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td height=\"25\" align=\"right\" valign=\"top\">ผู้ช่วยเหลือ (ในคดี) :&nbsp;</td>\r\n");
      out.write("    <td colspan=\"3\">\r\n");
      out.write("        <table class=\"tableList\" width=\"95%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr class=\"TblHeaderColumn AlignCenter\">\r\n");
      out.write("                <td width=\"50\"bgcolor=\"#F5F5F5\">ลำดับที่</td>\r\n");
      out.write("                <td width=\"30\"bgcolor=\"#F5F5F5\">\r\n");
      out.write("                \t<input type=\"checkbox\" id=\"chkhelperBody\" name=\"chkhelperBody\" value=\"checkbox\" onclick=\"chkUncheckAll('chkhelperBody');\" >\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"150\"bgcolor=\"#F5F5F5\">ชื่อ-สกุล</td>\r\n");
      out.write("                <td width=\"150\"bgcolor=\"#F5F5F5\">ตำแหน่ง</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tbody id=\"helperBody\">\r\n");
      out.write("            \t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("           \r\n");
      out.write("        </table>\r\n");
      out.write("        <span class=\"spanLink\" onClick=\"aatopenmodal('helperBody');\">เพิ่มรายการ</span>\r\n");
      out.write("        |\r\n");
      out.write("        <span class=\"spanLink\" onclick=\"aatget_check_value('helperBody')\" >ลบรายการ</span>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr height=\"1\">\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td height=\"25\" align=\"right\" valign=\"middle\">ผู้ควบคุมการจับกุม&nbsp;:&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <input type=\"text\" id=\"ta_staff_name_control\" name=\"ta_staff_name_control\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_name_control}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("        <input type=\"hidden\" id=\"ta_staff_id_control\" name=\"ta_staff_id_control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_control}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("        <input type=\"hidden\" id=\"ta_poscode_control\" name=\"ta_poscode_control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_control}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("        <input type=\"hidden\" id=\"ta_offcode_control\" name=\"ta_offcode_control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.offcode_control}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("        <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("             onClick=\"window.open('process?action=Divide_staff_pop&poscode=ta_poscode_control&formname=ta_staff_name_control&id=ta_staff_id_control&posname=ta_posname_control&offcode=ta_offcode_control' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <input id=\"ta_posname_control\" name=\"ta_posname_control\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.posname_control}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"right\" valign=\"top\">รายละเอียดการจับกุม<br/>และความเห็น :&nbsp;</td>\r\n");
      out.write("    <td colspan=\"3\">\r\n");
      out.write("        <TEXTAREA NAME=\"comment_control\" ROWS=\"2\" COLS=\"73\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.comment_control}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr height=\"1\">\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"right\" valign=\"top\">ความเห็นของผู้บังคับบัญชา :&nbsp;</td>\r\n");
      out.write("    <td colspan=\"3\">\r\n");
      out.write("        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"left\" colspan=\"4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    1. ความเห็นของผู้บังคับบัญชาชั้นต้น :&nbsp;\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\">ความเห็น :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\"><TEXTAREA NAME=\"comment_initial\" ROWS=\"2\" COLS=\"60\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.comment_initial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ลงชื่อ&nbsp;:&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">\r\n");
      out.write("                    <input type=\"text\" id=\"ta_staff_name_initial\" name=\"ta_staff_name_initial\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_name_initial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("\t\t\t        <input type=\"hidden\" id=\"ta_staff_id_initial\" name=\"ta_staff_id_initial\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_initial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t        <input type=\"hidden\" id=\"ta_poscode_initial\" name=\"ta_poscode_initial\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_initial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t        <input type=\"hidden\" id=\"ta_offcode_initial\" name=\"ta_offcode_initial\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.offcode_initial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("             \t\t\tonClick=\"window.open('process?action=Divide_staff_pop&poscode=ta_poscode_initial&formname=ta_staff_name_initial&id=ta_staff_id_initial&posname=ta_posname_initial&offcode=ta_offcode_initial' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">\r\n");
      out.write("                    <input id=\"ta_posname_initial\" name=\"ta_posname_initial\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.posname_initial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr height=\"1\">\r\n");
      out.write("                <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"left\" colspan=\"4\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    2. ความเห็นของผู้บังคับบัญชา :&nbsp;\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\">ความเห็น :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\"><TEXTAREA NAME=\"comment_commander\" ROWS=\"2\" COLS=\"60\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.comment_commander}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA></td>\r\n");
      out.write("            </tr> \r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"25\" align=\"right\" valign=\"middle\">ลงชื่อ&nbsp;:&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" id=\"ta_staff_name_commander\" name=\"ta_staff_name_commander\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_name_commander}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("\t\t\t        <input type=\"hidden\" id=\"ta_staff_id_commander\" name=\"ta_staff_id_commander\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_commander}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t        <input type=\"hidden\" id=\"ta_poscode_commander\" name=\"ta_poscode_commander\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_commander}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t        <input type=\"hidden\" id=\"ta_offcode_commander\" name=\"ta_offcode_commander\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.offcode_commander}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("             \t\t\tonClick=\"window.open('process?action=Divide_staff_pop&poscode=ta_poscode_commander&formname=ta_staff_name_commander&id=ta_staff_id_commander&posname=ta_posname_commander&offcode=ta_offcode_commander' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input id=\"ta_posname_commander\" name=\"ta_posname_commander\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.posname_commander}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr height=\"1\">\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td align=\"right\" valign=\"top\">คำสั่ง :&nbsp;</td>\r\n");
      out.write("    <td colspan=\"3\">\r\n");
      out.write("        <TEXTAREA NAME=\"command\" ROWS=\"2\" COLS=\"73\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.command }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr height=\"1\">\r\n");
      out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr class=\"bgRowGray\">\r\n");
      out.write("        <td colspan=\"4\"><strong>การรับรองการจับกุมและผลคดี</strong></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"20%\" align=\"right\">ชื่อผู้รับรอง :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input type=\"text\" id=\"ta_staff_name_confirm\" name=\"ta_staff_name_confirm\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_name_confirm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("            <input type=\"hidden\" id=\"ta_staff_id_confirm\" name=\"ta_staff_id_confirm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_confirm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"ta_poscode_confirm\" name=\"ta_poscode_confirm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_confirm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"ta_offcode_confirm\" name=\"ta_offcode_confirm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.offcode_confirm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("                 onClick=\"window.open('process?action=Divide_staff_pop&poscode=ta_poscode_confirm&formname=ta_staff_name_confirm&id=ta_staff_id_confirm&posname=ta_posname_confirm&offcode=ta_offcode_confirm' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input id=\"ta_posname_confirm\" name=\"ta_posname_confirm\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.posname_confirm}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td height=\"25\" align=\"right\" valign=\"middle\">ชื่อผู้จับกุม&nbsp;:&nbsp;</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <input type=\"text\" name=\"txtAccuserName\" class=\"textview\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("        </td>\r\n");
      out.write("        <td height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <input name=\"txtAccuserPosname\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.accuser_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td height=\"25\" align=\"right\" valign=\"middle\">วันที่จับกุม :&nbsp;</td>\r\n");
      out.write("        <td valign=\"top\" colspan=\"3\">\r\n");
      out.write("            <input name=\"txtOccurrenceDate\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.occurrence_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เปรียบเทียบปรับเป็นเงิน :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <input type=\"text\" id=\"ta_fine\" name=\"ta_fine\" class=\"textViewNum\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.case_total_fine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" > บาท&nbsp;\r\n");
      out.write("            (<span id=\"taFineText\"></span>)\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เงินสินบน ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.bribe_money_p}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" % :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <input type=\"text\" id=\"ta_birbe_money\" name=\"ta_birbe_money\" class=\"textViewNum\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.birbe_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" > บาท&nbsp;\r\n");
      out.write("            (<span id=\"taBirbeText\"></span>)\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เงินรางวัล ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.reward_money_p}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" % :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <input type=\"text\" id=\"ta_reward_money\" name=\"ta_reward_money\" class=\"textViewNum\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.reward_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" > บาท&nbsp;\r\n");
      out.write("            (<span id=\"taRewardText\"></span>)\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr class=\"bgRowGray\">\r\n");
      out.write("        <td colspan=\"4\"><strong>ดำเนินการขออนุมัติ</strong></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เรียน :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เห็นควรส่ง :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ชื่อผู้ขออนุมัติ&nbsp;:&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input type=\"text\" id=\"ta_staff_name_ark\" name=\"ta_staff_name_ark\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_name_ask}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("            <input type=\"hidden\" id=\"ta_staff_id_ark\" name=\"ta_staff_id_ark\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_ask}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"ta_poscode_ark\" name=\"ta_poscode_ark\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_ask}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"ta_offcode_ark\" name=\"ta_offcode_ark\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.offcode_ask}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("                 onClick=\"window.open('process?action=Divide_staff_pop&poscode=ta_poscode_ark&formname=ta_staff_name_ark&id=ta_staff_id_ark&posname=ta_posname_ark&offcode=ta_offcode_ark' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("            <font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input id=\"ta_posname_ark\" name=\"ta_posname_ark\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.posname_ask}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\r\n");
      out.write("    <tr class=\"bgRowGray\">\r\n");
      out.write("        <td colspan=\"4\"><strong>พิจารณาอนุมัติ</strong></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เรียน :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ชื่อผู้อนุมัติ&nbsp;:&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input type=\"text\" id=\"ta_staff_name_approve\" name=\"ta_staff_name_approve\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_name_approve}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("            <input type=\"hidden\" id=\"ta_staff_id_approve\" name=\"ta_staff_id_approve\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_approve}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"ta_poscode_approve\" name=\"ta_poscode_approve\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_approve}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"ta_offcode_approve\" name=\"ta_offcode_approve\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.offcode_approve}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("                 onClick=\"window.open('process?action=Divide_staff_pop&poscode=ta_poscode_approve&formname=ta_staff_name_approve&id=ta_staff_id_approve&posname=ta_posname_approve&offcode=ta_offcode_approve' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input id=\"ta_posname_approve\" name=\"ta_posname_approve\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.posname_approve}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al == null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t        <input type=\"text\" name=\"arr_subject\" class=\"textview\" size=\"115\" \r\n");
        out.write("\t        value=\"รายงานการจับกุมคดี พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527\" \r\n");
        out.write("\t        onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
        out.write("        ");
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
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t        <input type=\"text\" name=\"arr_subject\" class=\"textview\" size=\"115\" \r\n");
        out.write("\t        value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.subject}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" \r\n");
        out.write("\t        onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
        out.write("        ");
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
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.isinform == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked");
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
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.ischkcount == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${exhibit}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("ex");
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                     <tr>\r\n");
          out.write("                           <td class=\"TblRow AlignCenter\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                           <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ex.duty_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                           <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ex.brand_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                           <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ex.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                           <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ex.qty_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                      </tr>\r\n");
          out.write("                 ");
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
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${helper}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("cm");
    _jspx_th_c_005fforEach_005f1.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                     <tr>\r\n");
          out.write("                           <td class=\"TblRow AlignCenter\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                           <td class=\"TblRow AlignCenter\"><input name=\"chkhelperBody");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"checkbox\"/>\r\n");
          out.write("                               <input type=\"hidden\" name=\"helperBody_id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                               <input type=\"hidden\" name=\"helperBody_idcard_no\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                               <input type=\"hidden\" name=\"helperBody_level\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                               <input type=\"hidden\" name=\"helperBody_poscode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                               <input type=\"hidden\" name=\"helperBody_offcode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                           </td>\r\n");
          out.write("                           <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                           <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                     </tr>\r\n");
          out.write("                 ");
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

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t<input type=\"text\" name=\"ta_ask_lean\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al_ask_lean}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("            ");
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
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t<input type=\"text\" name=\"ta_ask_lean\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.ask_lean}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("            ");
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
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t<input type=\"text\" name=\"ta_department_name_send\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al_department_name_send}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("            ");
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
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t<input type=\"text\" name=\"ta_department_name_send\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.department_name_send}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" \" />\r\n");
        out.write("            ");
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
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<input type=\"text\" name=\"ta_approve_lean\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al_approve_lean }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("        \t");
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
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<input type=\"text\" name=\"ta_approve_lean\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.approve_lean }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("        \t");
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
}
