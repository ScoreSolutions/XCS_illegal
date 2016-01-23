package org.apache.jsp.CompareCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;

public final class reward_005frequest_005ftobacco_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        \t<input type=\"hidden\" name=\"al_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("            <tr class=\"bgRowGray\">\r\n");
      out.write("                <td colspan=\"4\"><strong>บันทึกการรับรองผล</strong></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"20%\" align=\"right\">เจ้าหน้าที่ดำเนินคดี/&nbsp;<br>ผู้มีอำนาจเปรียบเทียบ :&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">\r\n");
      out.write("                    <input type=\"text\" name=\"al_staff_name_arrest\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.sue_staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">\r\n");
      out.write("                    <input name=\"al_posname_arrest\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.sue_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\">เปรียบเทียบปรับเป็นเงิน :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" id=\"to_fine\" name=\"al_fine\" class=\"textViewNum\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.case_fine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >บาท&nbsp;\r\n");
      out.write("                </td>\r\n");
      out.write("                <td align=\"right\">เงินรางวัล ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.reward_money_p}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" % เป็นเงิน :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" id=\"to_reward_money\" name=\"al_reward_money\" class=\"textViewNum\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.reward_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >บาท&nbsp;\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td valign=\"top\">(<span id=\"toFineText\"></span>)</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td valign=\"top\">(<span id=\"toRewardText\"></span>)</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"25\" align=\"right\" valign=\"middle\">ชื่อผู้จับกุม&nbsp;:&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" id=\"to_staff_name_arrest\" name=\"to_staff_name_arrest\" class=\"textview\" size=\"37\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("                    <input type=\"hidden\" id=\"to_staff_id_arrest\" name=\"to_staff_id_arrest\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.staff_id_arrest}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    <input type=\"hidden\" id=\"to_poscode_arrest\" name=\"to_poscode_arrest\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.poscode_arrest}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    <input type=\"hidden\" id=\"to_offcode_arrest\" name=\"to_offcode_arrest\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.offcode_arrest}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("                         onClick=\"window.open('process?action=Divide_staff_pop&poscode=to_poscode_arrest&formname=to_staff_name_arrest&id=to_staff_id_arrest&posname=to_posname_arrest&offcode=to_offcode_arrest' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("                    <font style=\"color:red\">*</font>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input id=\"to_posname_arrest\" name=\"to_posname_arrest\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.accuser_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"25\" align=\"right\" valign=\"middle\">ความเห็นอื่น :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\"><TEXTAREA NAME=\"to_lawyer_opinion\" ROWS=\"2\" COLS=\"73\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.lawyer_opinion }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr class=\"bgRowGray\">\r\n");
      out.write("                <td colspan=\"4\"><strong>ความเห็นของผู้อำนวยการสำนักกฎหมาย</strong></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"20%\" align=\"right\">&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\">\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"25\" align=\"right\" valign=\"middle\">ความเห็นอื่น :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\"><TEXTAREA NAME=\"to_law_director_opinion\" ROWS=\"2\" COLS=\"73\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.law_director_opinion}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr class=\"bgRowGray\">\r\n");
      out.write("                <td colspan=\"4\"><strong>คำสั่ง</strong></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"20%\" align=\"right\">&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"25\" align=\"right\" valign=\"middle\">คำสั่ง :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\"><TEXTAREA NAME=\"to_command\" ROWS=\"2\" COLS=\"73\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.command}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr class=\"bgRowGray\">\r\n");
      out.write("                <td colspan=\"4\"><strong>ลายมือชื่อของผู้รับรางวัล</strong></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"20%\" align=\"right\">&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"25\" align=\"right\" valign=\"middle\">ความเห็นอื่น :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\"><TEXTAREA NAME=\"to_arrest_opinion\" ROWS=\"2\" COLS=\"73\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.arrest_opinion}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TEXTAREA></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"4\">&nbsp;</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t\t<input name=\"to_law_director_position\" id=\"to_law_director_position\" type=\"text\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al_law_director_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("                \t");
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
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t\t<input name=\"to_law_director_position\" id=\"to_law_director_position\" type=\"text\" class=\"textbox\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${al.law_director_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("                \t");
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
}
