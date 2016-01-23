package org.apache.jsp.SummaryReports.ReportCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;

public final class ILLR8301_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/Templates/taglibs.jsp");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Reports.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/engine.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/util.js'></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td width=\"100%\" align=\"left\" valign=\"top\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"1%\">&nbsp;</td>\r\n");
      out.write("            \t\t<td width=\"99%\" ><span class=\"websitename\">3.1 รายงานผลคดี ส.ส.2/55</span></td>\r\n");
      out.write("            \t</tr> \r\n");
      out.write("            \t<tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("              \t<tr>\r\n");
      out.write("              \t\t<td >&nbsp;</td>\r\n");
      out.write("            \t\t<td ><span class=\"sectionname\">กรุณาระบุเงื่อนไข</span></td>\r\n");
      out.write("            \t</tr> \r\n");
      out.write("              \t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td >&nbsp;</td>\r\n");
      out.write("\t               \t<td >\r\n");
      out.write("\t               \t\t<table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td width=\"20%\" align=\"right\">วันที่ทำรายงาน :&nbsp;</td>\r\n");
      out.write("\t\t\t            \t \t<td width=\"80%\" align=\"left\" >\r\n");
      out.write("\t\t\t            \t \t\t<input name=\"compare_case_date\" id=\"compare_case_date\" type=\"text\" class=\"textdate\" onkeypress=\"window.event.keyCode = 0;\" value=\"\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cc.compare_case_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" timeZone=\"th-TH\" >\r\n");
      out.write("\t\t\t\t\t\t\t \t  \t<a href=\"javascript:NewCssCal('compare_case_date','ddmmyyyy')\">\r\n");
      out.write("\t\t\t\t\t\t\t \t  \t<img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t \t  \t<font style=\"color: red\">*</font> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t \t  \tถึงวันที่ :&nbsp; \r\n");
      out.write("\t\t\t\t\t\t\t \t  \t<input name=\"compare_case_date1\" id=\"compare_case_date1\" type=\"text\" class=\"textdate\" onkeypress=\"window.event.keyCode = 0;\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t<a href=\"javascript:NewCssCal('compare_case_date1','ddmmyyyy')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  \t<img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\"align=\"middle\" style=\"border-style: none\" /></a> \r\n");
      out.write("\t\t\t\t\t\t\t\t  \t<font style=\"color: red\">*</font> \r\n");
      out.write("\t\t\t            \t \t</td>\r\n");
      out.write("\t\t\t            \t</tr> \r\n");
      out.write("\t\t\t            </table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t             \t<td >&nbsp;</td>\r\n");
      out.write("\t           \t \t<td ><span class=\"sectionname\">ประเภทรายงาน</span></td>\r\n");
      out.write("\t           \t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t          \t<td>&nbsp;</td>\r\n");
      out.write("\t\t          \t<td>\r\n");
      out.write("\t\t          \t\t<table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t           \t\t\t<tr>\r\n");
      out.write("\t\t           \t\t\t\t<td align=\"right\" width=\"20%\" height=\"30px\">ภาค :&nbsp;</td>\r\n");
      out.write("\t\t           \t\t\t\t<td align=\"left\" width=\"80%\">\r\n");
      out.write("\t\t           \t\t\t\t\t<select id=\"sector_code\" name=\"sector_code\" style=\"width: 325px\" onchange=\"getArea('area_code',this.value),getBranch('branch_code',this.value)\" ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" ></select>\r\n");
      out.write("\t\t           \t\t\t\t</td>\r\n");
      out.write("\t\t           \t\t\t</tr>\r\n");
      out.write("\t\t           \t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\" height=\"25px\">พื้นที่ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select id=\"area_code\" name=\"area_code\" style=\"width: 325px\" onchange=\"getBranch('branch_code',this.value)\" ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(" ></select>\r\n");
      out.write("\t\t\t\t                </td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"right\" height=\"25px\"> พื้นที่/สาขา :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select id=\"branch_code\" name=\"branch_code\" style=\"width: 325px\" ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write(" /></select>\r\n");
      out.write("\t\t\t\t        \t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td height=\"30px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"btnBack\" type=\"button\" class=\"barbutton\" value=\"รายงาน\" onClick=\"report('PDF');\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input name=\"btnReportExcel\" type=\"button\" class=\"barbutton\" value=\"รายงาน Excel\" onClick=\"report('EXCEL');\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t             \t</table>\r\n");
      out.write("\t\t          \t</td>\r\n");
      out.write("\t\t         </tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("              \t <script type='text/javascript'>\r\n");
      out.write("              \r\n");
      out.write("\t\t\t\t\tfunction report(vReportType){\r\n");
      out.write("\t\t\t\t\t var compare_case_date=document.getElementById(\"compare_case_date\").value;\r\n");
      out.write("\t\t\t\t\t var compare_case_date1=document.getElementById(\"compare_case_date1\").value;\r\n");
      out.write("\t\t\t\t\t var sector_code=document.getElementById(\"sector_code\").value;\r\n");
      out.write("\t\t\t\t\t var area_code=document.getElementById(\"area_code\").value;\r\n");
      out.write("\t\t\t\t\t var branch_code=document.getElementById(\"branch_code\").value;\r\n");
      out.write("\t\t\t\t\t var user_id = \"");
      out.print(RequestUtil.getUserSession(request).getIdCard());
      out.write("\";\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t var yearfrom;\r\n");
      out.write("\t\t\t\t\t var monthfrom;\r\n");
      out.write("\t\t\t\t\t var dayfrom;\r\n");
      out.write("\t\t\t\t\t var datefrom;\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t var yearto;\r\n");
      out.write("\t\t\t\t\t var monthto;\r\n");
      out.write("\t\t\t\t\t var dayto;\r\n");
      out.write("\t\t\t\t\t var dateto;\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\tdayfrom=compare_case_date.substring(0,2);\r\n");
      out.write("\t\t\t\t\t\tmonthfrom=compare_case_date.substring(3,5);\r\n");
      out.write("\t\t\t\t\t\tyearfrom=compare_case_date.substring(6,10)-543;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tdayto=compare_case_date1.substring(0,2);\r\n");
      out.write("\t\t\t\t\t\tmonthto=compare_case_date1.substring(3,5);\r\n");
      out.write("\t\t\t\t\t\tyearto=compare_case_date1.substring(6,10)-543;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tdatefrom=yearfrom+'-'+monthfrom+'-'+dayfrom;\r\n");
      out.write("\t\t\t\t\t\tdateto=yearto+'-'+monthto+'-'+dayto;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tif(compare_case_date==\"\"||compare_case_date1==\"\"){\r\n");
      out.write("\t\t\t\t\t\t\talert('กรุณาป้อนวันที่ทำรายงาน');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\telse{\r\n");
      out.write("   \t\t\t\t\t\t\t//alert ('process?action=Report&__report=ILLR8301&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto+\r\n");
      out.write("\t\t\t\t\t\t\t//'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getUserID='+user_id, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tReports.ReportUrl(function(data){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar ReportName = \"ILLR8301\";\r\n");
      out.write("\t\t\t\t\t\t\t\tif (vReportType==\"EXCEL\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\tReportName=\"ILLR8301_EXCEL\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tif(data != \"\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\twindow.open(data + 'ReportName='+ ReportName +'&vReportType='+ vReportType +'&getDatefrom='+datefrom+'&getDateto='+dateto+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getUserID='+user_id + '&time=' + Math.random(),\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\twindow.open('process?action=Report&__report=ILLR8301&__formatt='+ vReportType +'&getDatefrom='+datefrom+'&getDateto='+dateto+\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getUserID='+user_id + '&time=' + Math.random(), \r\n");
      out.write("\t\t\t\t\t\t\t\t\t'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar IsCenter = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsCenter}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t\t\tvar vOffcode = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vOffcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";  //100100\r\n");
      out.write("\t\t\t\t\tif (vOffcode != \"\"){\r\n");
      out.write("\t\t\t\t\t\tif (IsCenter != \"Y\"){\r\n");
      out.write("\t\t\t\t\t\t\tvar OffcodeSection = vOffcode.substring(0,2) + \"0000\";\r\n");
      out.write("\t\t\t\t\t\t\tvar OffcodeArea = vOffcode.substring(0,4) + \"00\";\r\n");
      out.write("\t\t\t\t\t\t\tvar OffcodeBranch = vOffcode;\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\tgetSector('sector_code',OffcodeSection);\r\n");
      out.write("\t\t\t\t\t\t\tgetArea('area_code',OffcodeArea);\r\n");
      out.write("\t\t\t\t\t\t\tgetBranch('branch_code',OffcodeBranch);\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tgetSector('sector_code','');\r\n");
      out.write("\t\t\t\t\t\t\tgetArea('area_code','');\r\n");
      out.write("\t\t\t\t\t\t\tgetBranch('branch_code','');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\t");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsCenter != 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsSection != 'Y' && IsCenter != 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsArea != 'Y' && IsSection != 'Y' && IsCenter != 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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
}
