package org.apache.jsp.Protect;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.RequestUtil;

public final class ArrestReportList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/Templates/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Exhibit.js'></script>\r\n");

PageUtil pageUtil = new PageUtil(request);

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
      out.write("function clear2(){\r\n");
      out.write("\twindow.location.href=\"process?action=Outsideprove\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function btDelete(id)\r\n");
      out.write("{\r\n");
      out.write("\tExhibit.chkRefOutsideProve(id, function(data){\r\n");
      out.write("\t\tif(data != \"\")\r\n");
      out.write("\t\t\talert(data);\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\tvar answer = confirm (\"ยืนยันการลบข้อมูล\");\r\n");
      out.write("\t\t\tif (answer){\r\n");
      out.write("\t\t\t\twindow.location.href=\"process?action=Outsideprove&id=\"+id+\"&cmd=delete\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("    <form method=\"post\" name=\"dataform\"  action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" >\r\n");
      out.write(" \r\n");
      out.write("\t\t<!-- Body -->\r\n");
      out.write("\t\t<table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td width=\"100%\" align=\"left\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"99%\"><span class=\"websitename\">รายงานการจับกุม</span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("                <td><a href=\"process?action=ArrestReport&cmd=add\" class=\"linkmenu3level\">เพิ่มข้อมูล</a></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td><table width=\"1000\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#c2c2c2\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td width=\"1%\" align=\"left\" valign=\"top\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_left_up.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("                    <td width=\"98%\"></td>\r\n");
      out.write("                    <td width=\"1%\" align=\"right\" valign=\"top\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_right_up.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td height=\"40\">&nbsp;</td>\r\n");
      out.write("                    <td align=\"center\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td width=\"54%\" height=\"25\" align=\"left\" valign=\"top\"><span class=\"sectionname\">ค้นหา</span></td>\r\n");
      out.write("                        <td width=\"46%\">&nbsp;</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td align=\"left\" valign=\"top\" colspan=\"2\">\r\n");
      out.write("                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"20%\" align=\"right\">วันที่จับกุม :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"30%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"case_date_from\" id=\"case_date_from\" type=\"text\" class=\"textdate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_date_from }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress(event);\" size=\"7\" maxlength=\"10\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:NewCssCal('case_date_from','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" border=\"0\" ></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tถึง\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"case_date_to\" id=\"case_date_to\" type=\"text\" class=\"textdate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_date_to }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress(event);\" size=\"7\" maxlength=\"10\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:NewCssCal('case_date_to','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" border=\"0\" ></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"right\">เรื่อง :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"report_title\" name=\"report_title\" size=\"30\"  class=\"text\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.report_title }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <tr>\r\n");
      out.write("                                        <td align=\"right\">ชื่อผู้ต้องหา :&nbsp;</td>\r\n");
      out.write("                                        <td >\r\n");
      out.write("                                             <input type=\"text\" name=\"lawbreaker_name\" id=\"lawbreaker_name\" size=\"30\"  class=\"text\"   value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td  align=\"right\">ชื่อผู้จับกุม :&nbsp;</td>\r\n");
      out.write("                                        <td >\r\n");
      out.write("                                       \t\t<input type=\"text\" name=\"accuser_name\" id=\"accuser_name\" size=\"30\"  class=\"text\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        \r\n");
      out.write("\t\t\t\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t  </td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                       <tr>\r\n");
      out.write("                              <td>&nbsp;</td>                       \r\n");
      out.write("                            <td height=\"25\" align=\"left\"><input type=\"image\" src=\"images/btn_search_big.png\" value=\"Submit\" alt=\"Submit\"></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                    </table></td>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td align=\"left\" valign=\"bottom\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_left_bottom.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                    <td align=\"right\" valign=\"bottom\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_right_bottom.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                \t</form>\r\n");
      out.write("                <table class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
      out.write("                   <tr  align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"4\">");
      out.print(pageUtil.getPagination());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\" colspan=\"3\">");
      out.print(pageUtil.getPageStatus());
      out.write("\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("                    <tr  class=\"TblRow bgRowGray\">\r\n");
      out.write("                      <td width=\"30\" class=\"TblHeaderColumn\">ลำดับ</td>\r\n");
      out.write("                      <td width=\"80\" class=\"TblHeaderColumn\">เลขที่งาน</td>\r\n");
      out.write("                      <td width=\"80\" class=\"TblHeaderColumn\">วันที่จับกุม</td>\r\n");
      out.write("                      <td width=\"200\" height=\"25\" class=\"TblHeaderColumn\">เรื่อง</td>\r\n");
      out.write("                      <td width=\"150\" class=\"TblHeaderColumn\">ชื่อผู้ต้องหา</td>\r\n");
      out.write("                      <td width=\"150\" class=\"TblHeaderColumn\">ชื่อผู้จับกุม</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("\t\t             ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
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
    _jspx_th_c_005furl_005f0.setValue("process?action=ArrestReport&cmd=list");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
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
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dblist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("db");
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t             ");
          if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t             ");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fset_005f0.setVar("Rows");
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Rows + 1}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(Rows % 2) == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<tr class=\"TblRow AlignLeft\">\r\n");
        out.write("\t\t\t                    <td class=\"TblRow AlignCenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Rows}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t<td ><a href=\"");
        if (_jspx_meth_c_005furl_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\" class=\"linkdatarow\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.job_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></td>\r\n");
        out.write("\t\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.report_title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    _jspx_th_c_005furl_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/process?action=ArrestReport&id=${db.id}&cmd=showupdate", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(Rows % 2) == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<tr class=\"TblRow bgRowGray\">\r\n");
        out.write("\t\t\t                \t<td class=\"TblRow AlignCenter bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Rows}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t<td ><a href=\"");
        if (_jspx_meth_c_005furl_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\" class=\"linkdatarow\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.job_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></td>\r\n");
        out.write("\t\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.report_title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\t\r\n");
        out.write("\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    _jspx_th_c_005furl_005f2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/process?action=ArrestReport&id=${db.id}&cmd=showupdate", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }
}
