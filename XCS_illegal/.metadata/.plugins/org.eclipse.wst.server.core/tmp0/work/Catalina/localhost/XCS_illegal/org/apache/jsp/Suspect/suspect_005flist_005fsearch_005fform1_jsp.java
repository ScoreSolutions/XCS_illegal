package org.apache.jsp.Suspect;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class suspect_005flist_005fsearch_005fform1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Suspect/../Templates/clearIcon.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("<form action=\"process?action=Suspect&cmd=list\" method=\"post\" name=\"form1\">\n");
      out.write("    <input type=\"hidden\" name=\"suspect_type\" value=\"1\"/>\n");
      out.write("    <input type=\"hidden\" name=\"suspect_type_text\" value=\"\"/>\n");
      out.write("    <input type=\"hidden\" name=\"doSearch\" value=\"search\" />\n");
      out.write("    <table width=\"800\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\"\n");
      out.write("           bordercolor=\"#CCCCCC\">\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                <table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\n");
      out.write("                       bgcolor=\"#F5F5F5\">\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                        <td align=\"left\" valign=\"top\"><span class=\"sectionname\">ค้นหาข้อมูลต้องสงสัย\n");
      out.write("\t\t\t\t\t\t\t\t\t:: คนไทย</span></td>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr id=\"sp_row\">\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                        <td align=\"center\" valign=\"top\">\n");
      out.write("                            <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\n");
      out.write("                                   id=\"sp_thai\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"20%\" height=\"25\" align=\"right\">เลขที่บัตร ปปช\n");
      out.write("                                        :&nbsp;</td>\n");
      out.write("                                    <td width=\"30%\"><input type=\"text\" OnKeyPress=\"ChkMinusInt(this);\" \n");
      out.write("                                                           name=\"suspect_id_card\"\n");
      out.write("                                                           class=\"textbox\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${suspect_id_card}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\n");
      out.write("                                    <td width=\"20%\" align=\"right\">&nbsp;</td>\n");
      out.write("                                    <td width=\"30%\">&nbsp;</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td height=\"25\" align=\"right\">ชื่อ-สกุล :&nbsp;</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"partial_name\"\n");
      out.write("                                               class=\"textbox\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${partial_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/></td>\n");
      out.write("                                    <td align=\"right\">ชื่ออื่นๆ :&nbsp;</td>\n");
      out.write("                                    <td><input type=\"text\" name=\"other_name\" class=\"textbox\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${other_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td height=\"10\" colspan=\"4\" align=\"right\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td height=\"25\" align=\"left\">ที่อยู่ผู้ต้องสงสัย</td>\n");
      out.write("                                    <td>&nbsp;</td>\n");
      out.write("                                    <td align=\"right\">&nbsp;</td>\n");
      out.write("                                    <td>&nbsp;</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td height=\"25\" align=\"right\">จังหวัด :&nbsp;</td>\n");
      out.write("                                    <td><select name=\"province_code\" id=\"sProvince\"\n");
      out.write("                                                style=\"width: 180px;\"\n");
      out.write("                                                onchange=\"getDistrict('sDistrict','subDistrict',this.value,'');\">\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td align=\"right\">สำนักงาน :&nbsp;</td>\n");
      out.write("                                    <td><select name=\"offcode\" id=\"sOffCode\"\n");
      out.write("                                                style=\"width: 200px;\">\n");
      out.write("                                        <option value=\"0\">ทั้งหมด</option>\n");
      out.write("                                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </select></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td height=\"25\" align=\"right\">อำเภอ :&nbsp;</td>\n");
      out.write("                                    <td><select name=\"district_code\" id=\"sDistrict\"\n");
      out.write("                                                style=\"width: 180px;\"\n");
      out.write("                                                onchange=\"getTambol('subDistrict',this.value,'')\">\n");
      out.write("                                    </select>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td align=\"right\">ประเภทคดี :&nbsp;</td>\n");
      out.write("                                    <td><select name=\"case_type\" id=\"s\"\n");
      out.write("                                                style=\"width: 200px;\">\n");
      out.write("                                        <option value=\"0\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(case_type!=null&&case_type==0)?'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">ทั้งหมด</option>\n");
      out.write("                                        <option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(case_type!=null&&case_type==1)?'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">คดีรายใหญ่</option>\n");
      out.write("                                        <option value=\"2\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(case_type!=null&&case_type==2)?'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">เอเย่นต์</option>\n");
      out.write("                                        <option value=\"3\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(case_type!=null&&case_type==3)?'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">รายย่อย</option>\n");
      out.write("                                    </select></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td height=\"25\" align=\"right\">ตำบล :&nbsp;</td>\n");
      out.write("                                    <td><select name=\"subdistrict_code\" id=\"subDistrict\"\n");
      out.write("                                                style=\"width: 180px;\">\n");
      out.write("                                    </select></td>\n");
      out.write("                                    <td align=\"right\">&nbsp;</td>\n");
      out.write("                                    <td>&nbsp;</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                        <td height=\"40\" align=\"center\" valign=\"bottom\">\n");
      out.write("                            <!--  <img src=\"/images/btn_search_big.png\" width=\"65\" height=\"23\">  -->\n");
      out.write("                            <input alt=\"Submit Form\" type=\"image\"\n");
      out.write("                                   src=\"images/btn_search_big.png\" width=\"65\" height=\"23\"\n");
      out.write("                                   name=\"search\" onclick=\"writeTranLog('ค้นหาประวัติผู้ต้องสงสัยคนไทย');\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write('\r');
      out.write('\n');
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;<img name=\"222\" width=\"67\" src=\"images/icn_clearsearch.jpg\"  style=\"cursor:hand\" alt=\"ล้างเงือนไข\" onclick=\"clear2();\" >");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>&nbsp;</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"left\" valign=\"bottom\" height=\"10\"></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td align=\"right\" valign=\"bottom\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    _jspx_th_c_005fforEach_005f0.setVar("ed_office");
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ed_offices}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ed_office.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(offcode!=null&&ed_office.offcode==offcode)?'selected':''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ed_office.short_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("                                        ");
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
}
