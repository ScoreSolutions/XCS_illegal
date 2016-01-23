package org.apache.jsp.Protect;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.RequestUtil;

public final class arrest_005fsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Protect/arrest_search_conditions.jsp");
    _jspx_dependants.add("/Protect/../Templates/clearIcon.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("\r\n");

PageUtil pageUtil = new PageUtil(request);

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function btDelete(id)\r\n");
      out.write("\t{\r\n");
      out.write("\tvar answer = confirm (\"ยืนยันการลบข้อมูล\");\r\n");
      out.write("\t\tif (answer){\r\n");
      out.write("\t\twindow.location.href=\"process?action=Arrest&id=\"+id+\"&cmd=del\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function btcop(max,id,offcode)\r\n");
      out.write("\t{\r\n");
      out.write("\tvar answer = confirm (\"ยืนยันการคัดลอกข้อมูล\");\r\n");
      out.write("\r\n");
      out.write("\t\tif (answer){\r\n");
      out.write("\t\twindow.location.href=\"process?action=Arrest&id=\"+id+\"&maxid=\"+max+\"&offcode=\"+offcode+\"&cmd=cop\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t}\r\n");
      out.write("}\r\n");
      out.write("function clear2()\r\n");
      out.write("{\r\n");
      out.write("\twindow.location.href=\"process?action=Arrest\" ;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/sigslot_core.js\"></script>\r\n");
      out.write("<script src=\"js/base.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/utility.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/MXWidgets.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/JSRecordset.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/DependentDropdown.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\" ></script>\r\n");
      out.write("\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td width=\"100%\" align=\"left\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"99%\"><span class=\"websitename\">บันทึกการจับกุม</span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("                <td><a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" class=\"linkmenu3level\">เพิ่มข้อมูล</a></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                <form method=\"post\" name=\"dataform\" action=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("                  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Reports.js'></script>\r\n");
      out.write("\r\n");
      out.write("<table width=\"1000\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#c2c2c2\"  >\r\n");
      out.write(" <tr>\r\n");
      out.write("    <td width=\"1%\" align=\"left\" valign=\"top\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_left_up.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("    <td width=\"98%\"></td>\r\n");
      out.write("    <td width=\"1%\" align=\"right\" valign=\"top\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_right_up.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"40\">&nbsp;</td>\r\n");
      out.write("    <td align=\"center\" valign=\"top\" >\r\n");
      out.write("\r\n");
      out.write("        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"33%\" height=\"25\" align=\"left\" valign=\"top\"><span class=\"sectionname\" style=\"cursor:pointer\" title=\"แสดง/ซ่อน\" onClick=\"setSearchCon();\" >ค้นหา</span></td>\r\n");
      out.write("            <td width=\"33%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"34%\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tbody id=\"searchCon\">\r\n");
      out.write("          \r\n");
      out.write("\t          <tr >\r\n");
      out.write("\t            <td colspan=\"2\" valign=\"top\">\r\n");
      out.write("\t                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td width=\"20%\" align=\"right\" >ข้อกล่าวหา :&nbsp;</td>\r\n");
      out.write("\t                    <td width=\"33%\" height=\"25\"><input name=\"guilt_base\" type=\"text\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.guilt_base }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                    <td width=\"17%\" align=\"right\" >ความผิด พ.ร.บ. :&nbsp;</td>\r\n");
      out.write("\t                    <td width=\"30%\" height=\"25\">\r\n");
      out.write("\t\r\n");
      out.write("\t                        <select  name=\"legislation\" id=\"legislation\" style=\"width:180px\" onchange=\"setDDlGroupID('product',this.value,'');\" >\r\n");
      out.write("\t            \t\t\t\t<option value=\"\" selected>ทั้งหมด</option>\r\n");
      out.write("\t            \t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t            \t\t\t</select>\r\n");
      out.write("\t                    </td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td  align=\"right\" >ชื่อผู้กระทำผิด :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\"><input name=\"lawbreaker_name\" type=\"text\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.lawbreaker_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" ></td>\r\n");
      out.write("\t                    <td align=\"right\" >สินค้า :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t<select  name=\"product\" id=\"product\" style=\"width:180px\">\r\n");
      out.write("\t            \t\t\t\t<option value=\"\" selected>ทั้งหมด</option>\r\n");
      out.write("\t            \t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t            \t\t\t</select>\r\n");
      out.write("\t\r\n");
      out.write("\t                    </td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td align=\"right\" >วันที่เกิดเหตุ :&nbsp; </td>\r\n");
      out.write("\t                    <td height=\"25\">\r\n");
      out.write("\t\t                      <input type=\"Text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.occurrence_date }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"occurrence_date\" id=\"theDate1\" class=\"textdate\" OnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" size=\"6\" maxlength=\"10\" style=\"width:75;\"> <img src=\"images/btn_calendar.png\" onClick=\"NewCssCal('theDate1','ddmmyyyy');\"  alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none;cursor:pointer;\">ถึง\r\n");
      out.write("\t\t                      <input type=\"Text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.occurrence_date2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"occurrence_date2\" id=\"theDate2\" class=\"textdate\" OnKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" size=\"6\" maxlength=\"10\" style=\"width:75;\"><img src=\"images/btn_calendar.png\" onClick=\"NewCssCal('theDate2','ddmmyyyy');\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none;cursor:pointer\">\r\n");
      out.write("\t                    </td>\r\n");
      out.write("\t                    <td height=\"25\" align=\"right\">จังหวัด :&nbsp;</td>\r\n");
      out.write("\t                    <td>\r\n");
      out.write("\t                    \t<select id='province' name='province' style=\"width:180px\" onchange=\"getDistrict('district','tambol',this.value,'','')\"></select>\r\n");
      out.write("\t\r\n");
      out.write("\t                    </td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td align=\"right\" >วันที่รับเรื่องส่วนคดี :&nbsp; </td>\r\n");
      out.write("\t                    <td height=\"25\">\r\n");
      out.write("\t\t                    <input type=\"Text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_date }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"case_date\" id=\"theDate3\" class=\"textdate\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" maxlength=\"10\" style=\"width:70px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:NewCssCal('theDate3','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\"></a>ถึง\r\n");
      out.write("\t\t                    <input type=\"Text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_date2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"case_date2\" id=\"theDate4\" class=\"textdate\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" maxlength=\"10\" style=\"width:70px;\"> <a href=\"javascript:NewCssCal('theDate4','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\"  style=\"border-style: none\"></a>\r\n");
      out.write("\t                    </td>\r\n");
      out.write("\t\r\n");
      out.write("\t                    <td height=\"25\" align=\"right\">อำเภอ :&nbsp;</td>\r\n");
      out.write("\t                    <td>\r\n");
      out.write("\t                    \t<select id='district' name='district' style=\"width:180px\" onchange=\"getTambol('tambol',this.value,'')\"></select>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td align=\"right\" >วันที่เขียนบันทึกจับกุม :&nbsp; </td>\r\n");
      out.write("\t                    <td height=\"25\">\r\n");
      out.write("\t\t                    <input type=\"Text\" name=\"application_date\" id=\"theDate5\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.application_date }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textdate\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" size=\"5\" maxlength=\"10\" style=\"width:75;\"> <a href=\"javascript:NewCssCal('theDate5','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\"></a>ถึง\r\n");
      out.write("\t\t                    <input type=\"Text\" name=\"application_date2\" id=\"theDate6\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.application_date2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textdate\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" size=\"5\" maxlength=\"10\" style=\"width:75;\"> <a href=\"javascript:NewCssCal('theDate6','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\"></a>\r\n");
      out.write("\t                    </td>\r\n");
      out.write("\t                    <td height=\"25\" align=\"right\">ตำบล :&nbsp;</td>\r\n");
      out.write("\t                    <td>\r\n");
      out.write("\t\t\t\t\t\t\t<select id='tambol' name='tambol' style=\"width:180px\"></select>\r\n");
      out.write("\t\r\n");
      out.write("\t                     </td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td align=\"right\">เลขที่งาน :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\"><input name=\"aa_track_no\" type=\"text\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.aa_track_no }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                    <td align=\"right\">คดีเปรียบเทียบที่ :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\"><input name=\"compare_case_no\" type=\"text\" size=\"27\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.compare_case_no }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td align=\"right\">เลขที่คดี :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\"><input name=\"case_id\" type=\"text\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                    <td align=\"right\">รายงานพิสูจน์ที่ :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\"><input name=\"exhibit_report_no\" type=\"text\" size=\"27\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.exhibit_report_no }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td align=\"right\">ชื่อผู้กล่าวหา :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\"><input name=\"partial_name\" type=\"text\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.partial_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                    <td align=\"right\">เลขที่บัตร ปชช. :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\"><input name=\"lawbreaker_id_card\" type=\"text\" size=\"27\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.lawbreaker_id_card }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onkeypress=\"return checkIDcard(this);\" ></td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td align=\"right\">ชื่อสินค้าของกลาง :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\"><input name=\"product_name\" type=\"text\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.product_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                    <td align=\"right\">จำนวนเงินค่าปรับ :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\" align=\"left\">\r\n");
      out.write("\t                      <input name=\"case_fine\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_fine }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"textNum\" onblur=\"return checkcase_fine(this);\" onkeypress=\"ChkMinusDbl(this);\" size=\"8\">&nbsp;&nbsp;&nbsp;<!-- ChkMinusDbl(this); -->\r\n");
      out.write("\t                      ถึง :&nbsp;\r\n");
      out.write("\t                      <input name=\"case_fine2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_fine2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"textNum\"  onblur=\"return checkcase_fine(this);\" onkeypress=\"ChkMinusDbl(this);\" size=\"8\"> บาท\r\n");
      out.write("\t                    </td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                  <tr>\r\n");
      out.write("\t                    <td align=\"right\">มาตรา :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\"><input name=\"case_law_id\" type=\"text\" size=\"30\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_law_id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                    <td align=\"right\">สรรพสามิต :&nbsp;</td>\r\n");
      out.write("\t                    <td height=\"25\" align=\"left\">\r\n");
      out.write("\t                    \t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t                    ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                    </td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                   <tr>\r\n");
      out.write("\t                    <td align=\"right\"><input name=\"nojob\" type=\"checkbox\" value=\"0\"  style=\" display:none\"   ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write(">  </td>\r\n");
      out.write("\t                    <td align=\"left\" height=\"25\"><input name=\"jobname\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\"  size=\"30\" type=\"text\" style=\"border:0px; background-color:#c2c2c2;display:none\" /></td>\r\n");
      out.write("\t                    <td align=\"right\"></td>\r\n");
      out.write("\t                    <td height=\"25\"></td>\r\n");
      out.write("\t                  </tr>\r\n");
      out.write("\t                </table>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t            <td valign=\"top\" >\r\n");
      out.write("\t              <table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                  <td valign=\"top\" width=\"60%\" rowspan=\"2\" >\r\n");
      out.write("\t                    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"left\">\r\n");
      out.write("\t                      <tr><td >ผู้กล่าวหา :</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"accuserType\" type=\"radio\" value=\"2\"   ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write(">เจ้าหน้าที่กรมสรรพสามิต</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"accuserType\" type=\"radio\" value=\"3\"  ");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write(">เจ้าหน้าที่สรรพสามิตภาค</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"accuserType\" type=\"radio\" value=\"1\"  ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write(">เจ้าหน้าที่สรรพสามิตพื้นที่</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"accuserType\" type=\"radio\" value=\"4\"  ");
      if (_jspx_meth_c_005fif_005f8(_jspx_page_context))
        return;
      out.write(">เจ้าหน้าที่สรรพสามิตพื้นที่สาขา</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"accuserType\" type=\"radio\" value=\"\"  ");
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
        return;
      out.write(">ไม่ระบุ</td></tr>\r\n");
      out.write("\t                    </table>\r\n");
      out.write("\t                  </td>\r\n");
      out.write("\t                  <td valign=\"top\" width=\"40%\" >\r\n");
      out.write("\t                    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t                      <tr><td align=\"left\">ลักษณะคดี :</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"case_quality1\" type=\"checkbox\" value=\"2\"  ");
      if (_jspx_meth_c_005fif_005f10(_jspx_page_context))
        return;
      out.write(">ฟ้องศาล</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"case_quality2\" type=\"checkbox\" value=\"1\"  ");
      if (_jspx_meth_c_005fif_005f11(_jspx_page_context))
        return;
      out.write(">เปรียบเทียบปรับ</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"have_culprit\" type=\"checkbox\" value=\"N\"  ");
      if (_jspx_meth_c_005fif_005f12(_jspx_page_context))
        return;
      out.write(">ไม่มีตัว</td></tr>\r\n");
      out.write("\t                    </table>\r\n");
      out.write("\t                  </td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td valign=\"top\" >\r\n");
      out.write("\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td align=\"left\">คดีสิ้นสุดชั้น :</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td align=\"left\"><input name=\"caseLast1\" type=\"checkbox\" value=\"1\"   ");
      if (_jspx_meth_c_005fif_005f13(_jspx_page_context))
        return;
      out.write(">กรมสรรพสามิต</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td align=\"left\"><input name=\"caseLast2\" type=\"checkbox\" value=\"2\"   ");
      if (_jspx_meth_c_005fif_005f14(_jspx_page_context))
        return;
      out.write(">ศาล</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr><td align=\"left\"><input name=\"caseLast3\" type=\"checkbox\" value=\"3\"   ");
      if (_jspx_meth_c_005fif_005f15(_jspx_page_context))
        return;
      out.write(">พนักงานสอบสวน/พนักงานอัยการ</td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                  <td valign=\"top\">\r\n");
      out.write("\t                    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t                      <tr><td align=\"left\">ของกลางมิชอบด้วยกฎหมาย :</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"exhibit_wild\" type=\"radio\" value=\"Y\"  ");
      if (_jspx_meth_c_005fif_005f16(_jspx_page_context))
        return;
      out.write(">ของกลางมิชอบด้วยกฎหมาย</td></tr>\r\n");
      out.write("\t                      <tr><td align=\"left\"><input name=\"exhibit_wild\" type=\"radio\" value=\"\" ");
      if (_jspx_meth_c_005fif_005f17(_jspx_page_context))
        return;
      out.write(">ไม่ระบุ</td></tr>\r\n");
      out.write("\t                    </table>\r\n");
      out.write("\t                  </td>\r\n");
      out.write("\t                  <td valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t  <tr><td align=\"left\">เพิกถอน :</td></tr>\r\n");
      out.write("\t\t\t\t\t\t  <tr><td align=\"left\"><input name=\"iswithdraw\" type=\"radio\" value=\"1\" ");
      if (_jspx_meth_c_005fif_005f18(_jspx_page_context))
        return;
      out.write(">เพิกถอน</td></tr>\r\n");
      out.write("\t\t\t\t\t\t  <tr><td align=\"left\"><input name=\"iswithdraw\" type=\"radio\" value=\"2\" ");
      if (_jspx_meth_c_005fif_005f19(_jspx_page_context))
        return;
      out.write(">อยู่ระหว่างเพิกถอน</td></tr>\r\n");
      out.write("\t\t\t\t\t\t  <tr><td align=\"left\"><input name=\"iswithdraw\" type=\"radio\" value=\"\" ");
      if (_jspx_meth_c_005fif_005f20(_jspx_page_context))
        return;
      out.write(">ไม่ระบุ</td></tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t                  </td>\r\n");
      out.write("\t                </tr>\r\n");
      out.write("\t                <tr>\r\n");
      out.write("\t                  <td valign=\"top\" colspan=\"2\">\r\n");
      out.write("\t                    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t                      <tr><td colspan=\"2\" align=\"left\" >ค้นหาข้อมูลสืบสวน :</td></tr>\r\n");
      out.write("\t                      <tr>\r\n");
      out.write("\t                        <td width=\"40%\" align=\"right\">เลขที่แจ้งความ :&nbsp;</td>\r\n");
      out.write("\t                        <td width=\"60%\"><input name=\"notice_no\" type=\"text\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.notice_no }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                      </tr>\r\n");
      out.write("\t                      <tr>\r\n");
      out.write("\t                        <td  align=\"right\">เลขที่หมายค้น :&nbsp;</td>\r\n");
      out.write("\t                        <td width=\"30%\"><input name=\"warrant_no\" type=\"text\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.warrant_no }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                      </tr>\r\n");
      out.write("\t                      <tr>\r\n");
      out.write("\t                        <td align=\"right\">เลขที่ ส.ส.2/27 :&nbsp;</td>\r\n");
      out.write("\t                        <td colspan=\"3\"><input name=\"asi_track_no\" type=\"text\" size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.asi_track_no }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t                      </tr>\r\n");
      out.write("\t                    </table>\r\n");
      out.write("\t                    </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t          </tr>\r\n");
      out.write("\t          <tr>\r\n");
      out.write("\t          <td width=\"33%\"></td>\r\n");
      out.write("\t           <td width=\"33%\" align=\"center\">\r\n");
      out.write("\t           \t\t");
      if (_jspx_meth_c_005fif_005f21(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t           \t\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f22.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f22.setParent(null);
      _jspx_th_c_005fif_005f22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ShowPrintButton == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f22 = _jspx_th_c_005fif_005f22.doStartTag();
      if (_jspx_eval_c_005fif_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t           \t\t\t&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t           \t\t\t<input name=\"btnReports\" type=\"button\" class=\"barbutton\" value=\"รายงาน\" onclick=\"return ShowReport();\" />\r\n");
          out.write("\t           \t\t\t<script>\r\n");
          out.write("\t           \t\t\t\tfunction ShowReport(){\r\n");
          out.write("\t\t\t\t\t\t\t\tif(dwr.util.getValue(\"case_date\") == \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\talert(\"กรุณาเลือกวันที่รับเรื่องส่วนคดี\");\r\n");
          out.write("\t\t\t\t\t\t\t\t\treturn false;\r\n");
          out.write("\t\t\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t\t\tif(dwr.util.getValue(\"case_date2\") == \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\talert(\"กรุณาเลือกวันที่รับเรื่องส่วนคดี\");\r\n");
          out.write("\t\t\t\t\t\t\t\t\treturn false;\r\n");
          out.write("\t\t\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t           \t\t\t\t\r\n");
          out.write("\t\t           \t\t\t\tvar caseDate = \"\";\r\n");
          out.write("\t\t           \t\t\t\tvar wh = \"\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif(dwr.util.getValue(\"guilt_base\")!=\"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and ind.guilt_base like '%\" + dwr.util.getValue(\"guilt_base\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"legislation\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aa.legislation_id='\" + dwr.util.getValue(\"legislation\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"lawbreaker_name\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and pke_arrest.getArrestLawbreaker(aa.track_no)='\" + dwr.util.getValue(\"lawbreaker_name\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"product\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aa.product_group_id='\" + dwr.util.getValue(\"product\") + \"'\";\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"occurrence_date\") != \"\" && dwr.util.getValue(\"occurrence_date2\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and to_char(aa.occurrence_date,'yyyy-mm-dd') between '\" + setFormatDate(dwr.util.getValue(\"occurrence_date\")) + \"' and '\" + setFormatDate(dwr.util.getValue(\"occurrence_date2\")) + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t}else if(dwr.util.getValue(\"occurrence_date\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and to_char(aa.occurrence_date,'yyyy-mm-dd') >= '\" + setFormatDate(dwr.util.getValue(\"occurrence_date\")) + \"' \";\r\n");
          out.write("\t\t\t\t\t\t\t\t}else if(dwr.util.getValue(\"occurrence_date2\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and to_char(aa.occurrence_date,'yyyy-mm-dd') <= '\" + setFormatDate(dwr.util.getValue(\"occurrence_date2\")) + \"' \";\r\n");
          out.write("\t\t\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"case_date\") != \"\" && dwr.util.getValue(\"case_date2\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and to_char(bi.case_date,'yyyy-mm-dd') between '\" + setFormatDate(dwr.util.getValue(\"case_date\")) + \"' and '\" + setFormatDate(dwr.util.getValue(\"case_date2\")) + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tcaseDate += \"&getDatefrom=\" + setFormatDate(dwr.util.getValue(\"case_date\")) + \"&getDateto=\" + setFormatDate(dwr.util.getValue(\"case_date2\"));\r\n");
          out.write("\t\t\t\t\t\t\t\t}else if(dwr.util.getValue(\"case_date\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and to_char(bi.case_date,'yyyy-mm-dd') >= '\" + setFormatDate(dwr.util.getValue(\"case_date\")) + \"' \";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tcaseDate += \"&getDatefrom=\" + setFormatDate(dwr.util.getValue(\"case_date\"));\r\n");
          out.write("\t\t\t\t\t\t\t\t}else if(dwr.util.getValue(\"case_date2\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and to_char(bi.case_date,'yyyy-mm-dd') <= '\" + setFormatDate(dwr.util.getValue(\"case_date2\")) + \"' \";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tcaseDate += \"&getDateto=\" + setFormatDate(dwr.util.getValue(\"case_date2\"));\r\n");
          out.write("\t\t\t\t\t\t\t\t}\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"application_date\") != \"\" && dwr.util.getValue(\"application_date2\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and to_char(aa.application_date,'yyyy-mm-dd') between '\" + setFormatDate(dwr.util.getValue(\"application_date\")) + \"' and '\" + setFormatDate(dwr.util.getValue(\"application_date2\")) + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t}else if(dwr.util.getValue(\"application_date\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and to_char(aa.application_date,'yyyy-mm-dd') >= '\" + setFormatDate(dwr.util.getValue(\"application_date\")) + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t}else if(dwr.util.getValue(\"application_date2\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and to_char(aa.application_date,'yyyy-mm-dd') <= '\" + setFormatDate(dwr.util.getValue(\"application_date2\")) + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t}\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"aa_track_no\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aa.track_no like '%\" + dwr.util.getValue(\"aa_track_no\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"case_id\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and bi.case_id like '%\" + dwr.util.getValue(\"case_id\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"partial_name\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and nvl(aa.accuser_name,ti.title_name || st.first_name || ' ' || st.last_name) like '%\" + dwr.util.getValue(\"partial_name\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"product_name\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and pke_arrest.getArrestExhibit(aa.track_no) like '%\" + dwr.util.getValue(\"product_name\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"case_law_id\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and ind.case_law_id like '%\" + dwr.util.getValue(\"case_law_id\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"province\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aa.scene_province='\" + dwr.util.getValue(\"province\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"district\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aa.scene_district='\" + dwr.util.getValue(\"district\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"tambol\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aa.scene_subdistrict='\" + dwr.util.getValue(\"tambol\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"compare_case_no\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and cc.compare_case_no like '%\" + dwr.util.getValue(\"compare_case_no\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"exhibit_report_no\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aap.exhibit_report_no like '%\" + dwr.util.getValue(\"exhibit_report_no\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"lawbreaker_id_card\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aal.lawbreaker_id_card like '%\" + dwr.util.getValue(\"lawbreaker_id_card\") + \"%'\";\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"case_fine\") != \"\" && dwr.util.getValue(\"case_fine2\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and cc.case_total_fine between '\" + dwr.util.getValue(\"case_fine\") + \"' and '\" + dwr.util.getValue(\"case_fine2\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t}else if(dwr.util.getValue(\"case_fine\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and cc.case_total_fine >= '\" + dwr.util.getValue(\"case_fine\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t}else if(dwr.util.getValue(\"case_fine2\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and cc.case_total_fine <= '\" + dwr.util.getValue(\"case_fine2\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t}\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t            if (dwr.util.getValue(\"offcode\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t            wh += \" and aa.offcode = '\" + dwr.util.getValue(\"offcode\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"accuserType\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aa.accuser_type = '\" + dwr.util.getValue(\"accuserType\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"exhibit_wild\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and ind.exhibit_wild='\" + dwr.util.getValue(\"exhibit_wild\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"case_quality1\") != \"\" || dwr.util.getValue(\"case_quality2\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\tvar tmpCaseQuality = \"\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"case_quality1\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\ttmpCaseQuality += \",'\" + dwr.util.getValue(\"case_quality1\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"case_quality2\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\ttmpCaseQuality += \",'\" + dwr.util.getValue(\"case_quality2\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and bi.case_quality in (\" + tmpCaseQuality.substring(1) + \")\";\r\n");
          out.write("\t\t\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"have_culprit\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and aa.have_culprit='\" + dwr.util.getValue(\"have_culprit\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"caseLast1\") != \"\" || dwr.util.getValue(\"caseLast2\") != \"\" || dwr.util.getValue(\"caseLast3\") != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\tvar tmbCaseLast = \"\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"caseLast1\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\ttmbCaseLast += \",'\" + dwr.util.getValue(\"caseLast1\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"caseLast2\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\ttmbCaseLast += \",'\" + dwr.util.getValue(\"caseLast2\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"caseLast3\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\ttmbCaseLast += \",'\" + dwr.util.getValue(\"caseLast3\") + \"'\";\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and bi.case_last in (\" + tmbCaseLast.substring(1) + \")\";\r\n");
          out.write("\t\t\t\t\t\t\t\t}\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"iswithdraw\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and ale.iswithdraw='\" + dwr.util.getValue(\"iswithdraw\") + \"'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"notice_no\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and ana.notice_no like '%\" + dwr.util.getValue(\"notice_no\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"warrant_no\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and asw.request_no like '%\" + dwr.util.getValue(\"warrant_no\") + \"%'\";\r\n");
          out.write("\t\t\t\t\t\t\t\tif (dwr.util.getValue(\"asi_track_no\") != \"\")\r\n");
          out.write("\t\t\t\t\t\t\t\t\twh += \" and asi.track_no like '%\" + dwr.util.getValue(\"asi_track_no\") + \"%'\";\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t//alert(wh + \"###\" );\r\n");
          out.write("\t\t\t\t\t\t\t\tReports.ReportUrl(function(data){\r\n");
          out.write("\t\t\t\t\t\t\t\t\tif(data != \"\"){\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t//alert(wh);\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvar user_id = \"");
          out.print(RequestUtil.getUserSession(request).getIdCard());
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tvar url = data + \"ReportName=ILLR8314&vReportType=PDF&getOffcode=\"+dwr.util.getValue(\"offcode\")+\"&UserID=\"+user_id+ caseDate + \"&whText=\"+ encodeURIComponent(wh) +\"&time=\" + Math.random();\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t//alert(url);\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\twindow.open(url,'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=yes,scrollbars=yes,width=900,height=700');\r\n");
          out.write("\t\t\t\t\t\t\t\t\t}\r\n");
          out.write("\t\t\t\t\t\t\t\t});\r\n");
          out.write("\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\treturn false;\r\n");
          out.write("\t\t           \t\t\t}\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t           \t\t\tfunction setFormatDate(DateIn){\r\n");
          out.write("\t\t           \t\t\t\tvar dd=DateIn.substring(0,2);\r\n");
          out.write("\t\t\t\t\t\t\t\tvar mm=DateIn.substring(3,5);\r\n");
          out.write("\t\t\t\t\t\t\t\tvar yy=DateIn.substring(6,10)-543;\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\treturn yy + \"-\" + mm + \"-\" + dd;\r\n");
          out.write("\t\t\t\t           \t}\r\n");
          out.write("\t           \t\t\t</script>\r\n");
          out.write("\t           \t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f22.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f22);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f22);
      out.write("\r\n");
      out.write("\t           </td>\r\n");
      out.write("\t          <td width=\"34%\">&nbsp;</td>\r\n");
      out.write("\t          </tr>\r\n");
      out.write("          </tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("    <td width=\"1%\" align=\"left\" valign=\"top\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_left_bottom.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("    <td width=\"98%\"></td>\r\n");
      out.write("    <td width=\"1%\" align=\"right\" valign=\"top\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_right_bottom.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function setDDlGroupID(group_id, vLegislationID, vGroupID){\r\n");
      out.write("\t//alert(vLegislationID);\r\n");
      out.write("\tLegislationProduct.getDutyGroup(vLegislationID,function(data){\r\n");
      out.write("\t\tdwr.util.removeAllOptions(group_id);\r\n");
      out.write("\t\tdwr.util.addOptions(group_id,[{group_id:\"\",group_name:\"โปรดเลือก\"}],\"group_id\",\"group_name\");\r\n");
      out.write("\t\tdwr.util.addOptions(group_id,data,\"group_id\",\"group_name\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(vGroupID!=null && vGroupID!=\"\" ){\r\n");
      out.write("\t\t\tdwr.util.setValue(group_id,vGroupID);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("}\r\n");
      out.write("function clearOffname(){\r\n");
      out.write("\tvar fForm = document.dataform;\r\n");
      out.write("\tif(fForm.offcode.value == \"\")\r\n");
      out.write("\t\tfForm.offname.value = \"\";\r\n");
      out.write("}\r\n");
      out.write("function setSearchCon(){\r\n");
      out.write("\tvar searchCon = document.getElementById(\"searchCon\");\r\n");
      out.write("\tif(searchCon.style.display == 'none')\r\n");
      out.write("\t\tsearchCon.style.display = '';\r\n");
      out.write("\telse\r\n");
      out.write("\t\tsearchCon.style.display = 'none';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\tgetProvince('province','district','tambol','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.tambol}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\tsetDDlGroupID('product','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.legislation}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.product}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                  <table class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
      out.write("\t\t\t\t\t <tr  align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"7\">");
      out.print(pageUtil.getPagination());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"4\" align=\"right\">");
      out.print(pageUtil.getPageStatus());
      out.write("\t</td>\r\n");
      out.write("\t\t\t\t\t</tr >\r\n");
      out.write("\t\t\t\t\t<tr class=\"TblHeaderColumn AlignCenter\" >\r\n");
      out.write("\t                    <td width=\"40\">ลำดับ</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60\" >เลขที่งาน</td>\r\n");
      out.write("\t                    <td width=\"120\" >หน่วยงาน</td>\r\n");
      out.write("\t                    <td width=\"90\" >ผู้กล่าวหา</td>\r\n");
      out.write("\t                    <td width=\"90\" >ผู้ต้องหา</td>\r\n");
      out.write("\t                    <td width=\"65\" >วันที่รับเรื่อง</td>\r\n");
      out.write("\t                    <td width=\"65\" >วันที่เกิดเหตุ</td>\r\n");
      out.write("\t                    <td width=\"100\">พ.ร.บ.</td>\r\n");
      out.write("\t                    <td width=\"100\">สถานที่เกิดเหตุ</td>\r\n");
      out.write("\t                    <td >ข้อกล่าวหา</td>\r\n");
      out.write("\t                    <td width=\"57\" >&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f2.setParent(null);
      _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dblist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_c_005fforEach_005f2.setVar("db");
      _jspx_th_c_005fforEach_005f2.setVarStatus("i");
      int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
        if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t             ");
            if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
              return;
            out.write("\r\n");
            out.write("\t\t\t             ");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_005fif_005f23.setPageContext(_jspx_page_context);
            _jspx_th_c_005fif_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
            _jspx_th_c_005fif_005f23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(Rows % 2) == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
            int _jspx_eval_c_005fif_005f23 = _jspx_th_c_005fif_005f23.doStartTag();
            if (_jspx_eval_c_005fif_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\r\n");
                out.write("\t\t\t\t\t\t\t<tr >\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignCenter\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Rows+_rowIndex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t\t\t\t\t\t<td class=\"TblRow AlignLeft\"><a href=\"process?action=Arrest&id=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("&cmd=showupdate&time=");
                out.print(new java.util.Date().getTime() );
                out.write("\" class=\"linkdatarow\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</a></td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.guilt_base}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft\">\r\n");
                out.write("\t\t\t                      <img src=\"images/icn_copy.png\" width=\"25\" height=\"25\" border=\"0\" title=\"คัดลอกรายการ\" style=\"cursor:hand;\" onclick = 'btcop(\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aamax.max}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write('"');
                out.write(',');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write('"');
                out.write(',');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("\");'>\r\n");
                out.write("\t\t\t                      ");
                if (_jspx_meth_c_005fif_005f24(_jspx_th_c_005fif_005f23, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
                  return;
                out.write("\r\n");
                out.write("\t\t\t\t\t\t\t\t</td>\r\n");
                out.write("\t\t\t\t\t\t\t</tr>\r\n");
                out.write("\t\t\t\t\t\t");
                int evalDoAfterBody = _jspx_th_c_005fif_005f23.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_005fif_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f23);
              return;
            }
            _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f23);
            out.write("\r\n");
            out.write("\t\t\t\t\t\t");
            //  c:if
            org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
            _jspx_th_c_005fif_005f25.setPageContext(_jspx_page_context);
            _jspx_th_c_005fif_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
            _jspx_th_c_005fif_005f25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(Rows % 2) == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
            int _jspx_eval_c_005fif_005f25 = _jspx_th_c_005fif_005f25.doStartTag();
            if (_jspx_eval_c_005fif_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\r\n");
                out.write("\t\t\t\t\t\t\t<tr>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignCenter bgRowGray\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Rows+_rowIndex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t\t\t\t\t\t<td class=\"TblRow AlignLeft bgRowGray\"><a href=\"process?action=Arrest&id=");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("&cmd=showupdate&time=");
                out.print(new java.util.Date().getTime() );
                out.write("\" class=\"linkdatarow\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</a></td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft bgRowGray\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft bgRowGray\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft bgRowGray\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft bgRowGray\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft bgRowGray\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft bgRowGray\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft bgRowGray\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft bgRowGray\">");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.guilt_base}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("</td>\r\n");
                out.write("\t\t\t                    <td class=\"TblRow AlignLeft bgRowGray\">\r\n");
                out.write("\t\t\t                      <img src=\"images/icn_copy.png\" width=\"25\" height=\"25\" border=\"0\" alt=\"คัดลอก\" style=\"cursor:hand;\" onclick = 'btcop(\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aamax.max}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write('"');
                out.write(',');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write('"');
                out.write(',');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                out.write("\");'>\r\n");
                out.write("\t\t\t                      ");
                if (_jspx_meth_c_005fif_005f26(_jspx_th_c_005fif_005f25, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
                  return;
                out.write("\r\n");
                out.write("\t\t\t\t\t\t\t\t</td>\r\n");
                out.write("\t\t\t\t\t\t\t</tr>\r\n");
                out.write("\t\t\t\t\t\t");
                int evalDoAfterBody = _jspx_th_c_005fif_005f25.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_c_005fif_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f25);
              return;
            }
            _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f25);
            out.write("\r\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f2.doFinally();
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td colspan=\"11\">&nbsp;</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    _jspx_th_c_005furl_005f0.setValue("process?action=Arrest&cmd=add");
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
    _jspx_th_c_005furl_005f1.setValue("process?action=Arrest&cmd=list");
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
          out.write("\r\n");
          out.write("\t            \t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.legislation_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t            \t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.legislation == ltion.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dglist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("dg");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t            \t\t\t\t<option value='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dg.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dg.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t            \t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.product == dg.group_id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
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
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsAdmin == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                       <input type=\"text\" name=\"offcode\" id=\"offcode\" size=\"3\"  class=\"textbox\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offcode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" \r\n");
        out.write("\t\t                       \tonBlur=\"getOffname(this.value,'Y',offname);\" >\r\n");
        out.write("\t\t                       <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:pointer\"\r\n");
        out.write("\t\t                            onClick=\"window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\" >\r\n");
        out.write("\t\t                       <input type=\"text\" name=\"offname\" id=\"offname\" size=\"15\"  class=\"textview\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t                    ");
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
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsAdmin != '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                       <input type=\"text\" name=\"offcode\" id=\"offcode\" size=\"8\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" class=\"textview\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offcode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  >\r\n");
        out.write("\t\t                       <input type=\"text\" name=\"offname\" id=\"offname\" size=\"20\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" class=\"textview\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t                    ");
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
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${abc == '1' ||  param.nojob == '0'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.accuserType == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.accuserType == '3'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.accuserType == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.accuserType == '4'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.accuserType == ''||param.accuserType == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
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

  private boolean _jspx_meth_c_005fif_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent(null);
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_quality1 == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent(null);
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.case_quality2 == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent(null);
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.have_culprit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent(null);
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.caseLast1 == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
    if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f14.setParent(null);
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.caseLast2 == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f15.setParent(null);
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.caseLast3 == '3'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f15 = _jspx_th_c_005fif_005f15.doStartTag();
    if (_jspx_eval_c_005fif_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f16.setParent(null);
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.exhibit_wild == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f16);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f17.setParent(null);
    _jspx_th_c_005fif_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.exhibit_wild == ''||param.exhibit_wild == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
    if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f17);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f18.setParent(null);
    _jspx_th_c_005fif_005f18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.iswithdraw == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f18 = _jspx_th_c_005fif_005f18.doStartTag();
    if (_jspx_eval_c_005fif_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f18);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f19.setParent(null);
    _jspx_th_c_005fif_005f19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.iswithdraw == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f19 = _jspx_th_c_005fif_005f19.doStartTag();
    if (_jspx_eval_c_005fif_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f19);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f20.setParent(null);
    _jspx_th_c_005fif_005f20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.iswithdraw == '' ||param.iswithdraw == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f20 = _jspx_th_c_005fif_005f20.doStartTag();
    if (_jspx_eval_c_005fif_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f20);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f21.setParent(null);
    _jspx_th_c_005fif_005f21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ShowPrintButton != 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f21 = _jspx_th_c_005fif_005f21.doStartTag();
    if (_jspx_eval_c_005fif_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t           \t\t<input type=\"image\" name=\"btSubmit\" src=\"images/btn_search_big.png\" value=\"Submit\" alt=\"Submit\" onclick=\"this.disabled\" >\r\n");
        out.write("\t\t           \t\t");
        out.write('\r');
        out.write('\n');
        out.write(' ');
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("&nbsp;&nbsp;&nbsp;&nbsp;<img name=\"222\" width=\"67\" src=\"images/icn_clearsearch.jpg\"  style=\"cursor:hand\" alt=\"ล้างเงือนไข\" onclick=\"clear2();\" >");
        out.write("\r\n");
        out.write("\t           \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f21);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
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

  private boolean _jspx_meth_c_005fif_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f23, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f23);
    _jspx_th_c_005fif_005f24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_status_code=='00'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f24 = _jspx_th_c_005fif_005f24.doStartTag();
    if (_jspx_eval_c_005fif_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t                      \t<img src=\"images/icon_delete.gif\" width=\"25\" height=\"25\" border=\"0\" title=\"ลบรายการ\" style=\"cursor:hand;\" onclick = 'btDelete(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\");'>\r\n");
        out.write("\t\t\t                      ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f24);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f25, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f25);
    _jspx_th_c_005fif_005f26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_status_code=='00'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f26 = _jspx_th_c_005fif_005f26.doStartTag();
    if (_jspx_eval_c_005fif_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t                      \t  <img src=\"images/icon_delete.gif\" width=\"25\" height=\"25\" border=\"0\" alt=\"ลบ\" style=\"cursor:hand;\" onclick = 'btDelete(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\");'>\r\n");
        out.write("\t\t\t                      ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f26);
    return false;
  }
}
