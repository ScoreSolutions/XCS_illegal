package org.apache.jsp.CompareCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;

public final class reward_005frequest_005falcohol_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Templates/meta.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("    <input type=\"hidden\" name=\"al_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("    <tr class=\"bgRowGray\">\r\n");
      out.write("        <td colspan=\"4\"><strong>บันทึกการรับรองผลคดี</strong></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td height=\"25\" align=\"right\" valign=\"middle\">วันที่ :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <input type=\"Text\" id=\"al_accept_date\" name=\"al_accept_date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.accept_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"12\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
      out.write("            <a href=\"javascript:NewCssCal('al_accept_date','ddMMyyyy','dropdown',false)\"><img\r\n");
      out.write("                    src=\"images/btn_calendar.png\"\r\n");
      out.write("                    alt=\"\" width=\"19\" height=\"19\"\r\n");
      out.write("                    align=\"middle\"\r\n");
      out.write("                    style=\"border-style: none\"\r\n");
      out.write("                    id=\"al_accept_date_img\" width=\"19\"\r\n");
      out.write("                    height=\"19\"/></a>&nbsp;\r\n");
      out.write("            <font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เสนอ :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <font style=\"color:red\">*</font>\r\n");
      out.write("            <i>เช่น ผู้อำนวยการส่วนคดี</i>\r\n");
      out.write("            \r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"20%\" align=\"right\">ชื่อผู้พิสูจน์ :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input type=\"text\" id=\"prove_name\" name=\"prove_name\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.prove_staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input id=\"pospname\" name=\"pospname\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\"\r\n");
      out.write("                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.prove_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เจ้าหน้าที่ดำเนินคดี :&nbsp;</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <input type=\"text\" name=\"sue_name\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.sue_staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("        </td>\r\n");
      out.write("        <td height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <input name=\"possname\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.sue_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เปรียบเทียบปรับเป็นเงิน :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <input type=\"text\" name=\"al_fine\" id=\"al_fine\" class=\"textViewNum\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.case_total_fine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >บาท&nbsp;\r\n");
      out.write("            (<span id=\"alFineText\"></span>)\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เงินสินบน ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.bribe_money_p}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" % เป็นเงิน :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <input type=\"text\" name=\"al_bribe_money\" id=\"al_bribe_money\" class=\"textViewNum\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.birbe_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >บาท&nbsp;\r\n");
      out.write("            (<span id=\"alBirbeText\"></span>)\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เงินรางวัล ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.reward_money_p}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" % เป็นเงิน :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <input type=\"text\" name=\"al_reward_money\" id=\"al_reward_money\" class=\"textViewNum\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.reward_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >บาท&nbsp;\r\n");
      out.write("            (<span id=\"alRewardText\"></span>)\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr class=\"bgRowGray\">\r\n");
      out.write("        <td colspan=\"4\"><strong>การรับรองผลการจับกุมผู้กระทำผิดพระราชบัญญัติสุรา</strong></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">เรียน :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"20%\" align=\"right\">ชื่อผู้จับกุม :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input type=\"text\" id=\"al_staff_name_arrest\" name=\"al_staff_name_arrest\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.arrest_staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" style=\"float:left\">\r\n");
      out.write("            <input type=\"hidden\" id=\"al_staff_id_arrest\" name=\"al_staff_id_arrest\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_arrest}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"al_poscode_arrest\" name=\"al_poscode_arrest\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_arrest}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"al_offcode_arrest\" name=\"al_offcode_arrest\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.offcode_arrest}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("                 onClick=\"window.open('process?action=Divide_staff_pop&poscode=al_poscode_arrest&formname=al_staff_name_arrest'+\r\n");
      out.write("                 '&id=al_staff_id_arrest&posname=al_posname_arrest&offname=al_offname_arrest&offcode=al_offcode_arrest' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\"/>\r\n");
      out.write("            <font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <input id=\"al_posname_arrest\" name=\"al_posname_arrest\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.posname_arrest}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td align=\"right\">สังกัด :&nbsp;</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <input type=\"text\" id=\"al_offname_arrest\" name=\"al_offname_arrest\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.offname_arrest}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td height=\"25\" align=\"right\" valign=\"middle\">ขอรับรองว่า :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <TEXTAREA NAME=\"al_accept_desc\" id=\"al_accept_desc\" ROWS=\"2\" COLS=\"73\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.accept_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA>\r\n");
      out.write("            <font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr class=\"bgRowGray\">\r\n");
      out.write("        <td colspan=\"4\"><strong>หัวหน้าฝ่าย หรือตำแหน่งเทียบเท่า</strong></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td height=\"25\" align=\"right\" valign=\"middle\">เรียน :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\" align=\"left\">\r\n");
      out.write("            <INPUT TYPE=\"radio\" NAME=\"al_rb_leader_accept\" value=\"Y\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.leader_accept != 'N')?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   OnClick=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtLeaderAccept').disabled=false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtLeaderUnAccept').disabled=true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtLeaderUnAccept').value='';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"\r\n");
      out.write("                    > รับรอง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input id=\"al_txtLeaderAccept\" name=\"al_txtLeaderAccept\" type=\"text\" class=\"textbox\" size=\"50\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.leader_accept != 'N')?'':'disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.leader_accept_reason}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"display:none\" />\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <INPUT TYPE=\"radio\" NAME=\"al_rb_leader_accept\" value=\"N\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.leader_accept == 'N')?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   OnClick=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtLeaderAccept').disabled=true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtLeaderUnAccept').disabled=false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtLeaderAccept').value='';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"> ไม่รับรอง\r\n");
      out.write("            <input id=\"al_txtLeaderUnAccept\" name=\"al_txtLeaderUnAccept\" type=\"text\" class=\"textbox\" size=\"50\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.leader_accept == 'N')?'':'disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.leader_deny_reason}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ลงชื่อ&nbsp;:&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input type=\"text\" id=\"al_staff_name_leader\" name=\"al_staff_name_leader\" class=\"textview\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.leader_staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
      out.write("            <input type=\"hidden\" id=\"al_staff_id_leader\" name=\"al_staff_id_leader\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_leader}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"al_poscode_leader\" name=\"al_poscode_leader\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_leader}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("                 onClick=\"window.open('process?action=Divide_staff_pop&poscode=al_poscode_leader&formname=al_staff_name_leader&id=al_staff_id_leader&posname=al_posname_leader' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input id=\"al_posname_leader\" name=\"al_posname_leader\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.leader_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr class=\"bgRowGray\">\r\n");
      out.write("        <td colspan=\"4\"><strong>ผู้อำนวยการส่วน หรือตำแหน่งเทียบเท่า</strong></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td height=\"25\" align=\"right\" valign=\"middle\">เรียน :&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\" align=\"left\">\r\n");
      out.write("            <INPUT TYPE=\"radio\" NAME=\"al_rb_section_director_accept\" value=\"Y\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.section_director_accept != 'N')?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   OnClick=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtSectionDirectorAccept').disabled=false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtSectionDirectorUnAccept').disabled=true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtSectionDirectorUnAccept').value='';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"\r\n");
      out.write("                    > รับรอง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input id=\"al_txtSectionDirectorAccept\" name=\"al_txtSectionDirectorAccept\" type=\"text\" class=\"textbox\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.section_director_accept != 'N')?'':'disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   size=\"50\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.section_director_accept_reason}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"display:none\" />\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <INPUT TYPE=\"radio\" NAME=\"al_rb_section_director_accept\" value=\"N\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.section_director_accept == 'N')?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   OnClick=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtSectionDirectorAccept').disabled=true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtSectionDirectorUnAccept').disabled=false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtSectionDirectorAccept').value='';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"> ไม่รับรอง\r\n");
      out.write("            <input id=\"al_txtSectionDirectorUnAccept\" name=\"al_txtSectionDirectorUnAccept\" type=\"text\" class=\"textbox\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.section_director_accept == 'N')?'':'disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   size=\"50\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.section_director_deny_reason}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ลงชื่อ&nbsp;:&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input type=\"text\" id=\"al_staff_name_section_director\" name=\"al_staff_name_section_director\" class=\"textview\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.section_director_staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("            <input type=\"hidden\" id=\"al_staff_id_section_director\" name=\"al_staff_id_section_director\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_section_director}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"al_poscode_section_director\" name=\"al_poscode_section_director\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_section_director}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("                 onClick=\"window.open('process?action=Divide_staff_pop&poscode=al_poscode_section_director&formname=al_staff_name_section_director&id=al_staff_id_section_director&posname=al_posname_section_director' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,,modal=yes');\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input id=\"al_posname_section_director\" name=\"al_posname_section_director\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.section_director_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    <tr class=\"bgRowGray\">\r\n");
      out.write("        <td colspan=\"4\"><strong>ผู้อำนวยสำนัก หรือตำแหน่งเทียบเท่า</strong></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\" align=\"left\">\r\n");
      out.write("            <INPUT TYPE=\"radio\" NAME=\"al_rb_res_director_accept\" value=\"Y\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.res_director_accept != 'N')?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   OnClick=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtResDirectorAccept').disabled=false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtResDirectorUnAccept').disabled=true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtResDirectorUnAccept').value='';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"\r\n");
      out.write("                    > รับรอง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input id=\"al_txtResDirectorAccept\" name=\"al_txtResDirectorAccept\" type=\"text\" class=\"textbox\" size=\"50\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.res_director_accept != 'N')?'':'disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.res_director_accept_reason}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"display:none\" />\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">&nbsp;</td>\r\n");
      out.write("        <td colspan=\"3\">\r\n");
      out.write("            <INPUT TYPE=\"radio\" NAME=\"al_rb_res_director_accept\" value=\"N\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.res_director_accept == 'N')?'checked':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                   OnClick=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtResDirectorAccept').disabled=true;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtResDirectorUnAccept').disabled=false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById('al_txtResDirectorAccept').value='';\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\"> ไม่รับรอง\r\n");
      out.write("            <input id=\"al_txtResDirectorUnAccept\" name=\"al_txtResDirectorUnAccept\" type=\"text\" class=\"textbox\" size=\"50\"\r\n");
      out.write("                   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(al.res_director_accept == 'N')?'':'disabled'}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" \r\n");
      out.write("                   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.res_director_deny_reason}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ลงชื่อ&nbsp;:&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input type=\"text\" id=\"al_staff_name_res_director\" name=\"al_staff_name_res_director\" class=\"textview\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.res_director_staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("            <input type=\"hidden\" id=\"al_staff_id_res_director\" name=\"al_staff_id_res_director\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_res_director}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <input type=\"hidden\" id=\"al_poscode_res_director\" name=\"al_poscode_res_director\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_res_director}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("                 onClick=\"window.open('process?action=Divide_staff_pop&poscode=al_poscode_res_director&formname=al_staff_name_res_director&id=al_staff_id_res_director&posname=al_posname_res_director' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("        <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("        <td width=\"30%\">\r\n");
      out.write("            <input id=\"al_posname_res_director\" name=\"al_posname_res_director\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.res_director_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t<input type=\"text\" id=\"al_report_to\" name=\"al_report_to\" class=\"textbox\" size=\"30\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al_report_to}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("            ");
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
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t<input type=\"text\" id=\"al_report_to\" name=\"al_report_to\" class=\"textbox\" size=\"30\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.report_to}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("            ");
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
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<input type=\"text\" name=\"al_accept_lean\" id=\"al_accept_lean\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al_accept_lean}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("        \t");
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
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<input type=\"text\" name=\"al_accept_lean\" id=\"al_accept_lean\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.accept_lean}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("        \t");
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
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<input id=\"text1\" name=\"al_leader_lean\" id=\"al_leader_lean\" type=\"text\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al_leader_lean}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("        \t");
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
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<input id=\"text1\" name=\"al_leader_lean\" id=\"al_leader_lean\" type=\"text\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.leader_lean}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("        \t");
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
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<input id=\"al_section_director_lean\" name=\"al_section_director_lean\" type=\"text\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al_section_director_lean}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("        \t");
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
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<input id=\"al_section_director_lean\" name=\"al_section_director_lean\" type=\"text\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.section_director_lean}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("        \t");
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
}
