package org.apache.jsp.CompareCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.PageUtil;
import java.util.ArrayList;

public final class send_005fincome_005fsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/js/listprovince.jsp");
    _jspx_dependants.add("/CompareCase/../Templates/clearIcon.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

PageUtil pageUtil = new PageUtil(request);

      out.write("\r\n");
      out.write("<script type=\"text/JavaScript\">\r\n");
      out.write("\r\n");
      out.write("function MM_goToURL() { //v3.0\r\n");
      out.write("  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;\r\n");
      out.write("  for (i=0; i<(args.length-1); i+=2) eval(args[i]+\".location='\"+args[i+1]+\"'\");\r\n");
      out.write("}\r\n");
      out.write("function clear2(){\r\n");
      out.write("\twindow.location.href=\"process?action=Sendincome\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write(" <form method=\"post\" name=\"dataform\"  action=\"process?action=Sendincome&cmd=list\" >\r\n");
      out.write(" \r\n");
      out.write("\t\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td width=\"100%\" align=\"left\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"99%\"><span class=\"websitename\">การนำส่งเงินรายได้</span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("                <td><a href=\"process?action=Sendincome&cmd=add\"><strong>เพิ่มข้อมูล</strong></a></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("\t\t\t\t\t\t<table width=\"750\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"  bgcolor=\"#c2c2c2\">\r\n");
      out.write("\t\t\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"1%\" align=\"left\" valign=\"top\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_left_up.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"98%\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td width=\"1%\" align=\"right\" valign=\"top\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_right_up.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t  <td><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <td width=\"52%\" height=\"35\" align=\"left\" valign=\"top\"><span class=\"sectionname\">&nbsp;&nbsp;&nbsp;ค้นหา</span></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <td height=\"30\" align=\"left\" valign=\"top\"><table width=\"98%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td width=\"36%\" align=\"right\" >เลขที่ใบนำส่งเงิน :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td width=\"64%\" height=\"25\"><input name=\"send_no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.send_no }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"textbox\" size=\"15\" ></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td align=\"right\"  >วันที่นำส่งเงิน :&nbsp; </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td height=\"25\"><input name=\"send_date1\" id=\"send_date1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.send_date1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"textdate\" onKeyPress=\"window.event.keyCode = 0\" onKeyDown=\"disableKeyDown();\" style=\"width:75;\" size=\"7\" maxlength=\"10\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <a href=\"javascript:NewCssCal('send_date1','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a> -\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input name=\"send_date2\" id=\"send_date2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.send_date2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"textdate\" onKeyPress=\"window.event.keyCode = 0\" onKeyDown=\"disableKeyDown();\" style=\"width:75;\" size=\"7\" maxlength=\"10\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <a href=\"javascript:NewCssCal('send_date2','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td height=\"25\" align=\"right\">พ.ร.บ. :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td><select name=\"legislation_id\" id=\"legislation_id\" style=\"width:200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t <option value =\"\" selected >ทั้งหมด</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("            \t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td align=\"right\" >&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td height=\"25\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </table></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <td width=\"48%\" align=\"left\" valign=\"middle\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\">คดีเปรียบเทียบที่ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"compare_case_no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.compare_case_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"textbox\" size=\"15\" ></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td width=\"28%\" height=\"25\" align=\"right\">หน่วยงานที่นำส่ง :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td width=\"72%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"offcode_write\" id=\"offcode_write\" style=\"width:200px;\"  ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(">\r\n");
      out.write("                              \t\t\t\t\t\t<option value=\"\"  >เลือก</option>\r\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                             \t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"right\">จังหวัด :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"province\" id=\"province\" style=\"width:200px\" >\r\n");
      out.write("            \t\t\t\t\t\t\t\t\t<option value=\"\">โปรดเลือกจังหวัด</option>\r\n");
      out.write("                          \t\t\t\t\t\t\t");
      out.write("﻿\r\n");
      out.write("<option value=\"81\">กระบี่</option>\r\n");
      out.write("                        <option value=\"10\">กรุงเทพมหานคร</option>\r\n");
      out.write("                        <option value=\"71\">กาญจนบุรี</option>\r\n");
      out.write("                        <option value=\"46\">กาฬสินธุ์</option>\r\n");
      out.write("                        <option value=\"62\">กำแพงเพชร</option>\r\n");
      out.write("                        <option value=\"40\">ขอนแก่น</option>\r\n");
      out.write("                        <option value=\"22\">จันทบุรี</option>\r\n");
      out.write("                        <option value=\"24\">ฉะเชิงเทรา</option>\r\n");
      out.write("                        <option value=\"20\">ชลบุรี</option>\r\n");
      out.write("                        <option value=\"18\">ชัยนาท</option>\r\n");
      out.write("                        <option value=\"36\">ชัยภูมิ</option>\r\n");
      out.write("                        <option value=\"86\">ชุมพร</option>\r\n");
      out.write("                        <option value=\"57\">เชียงราย</option>\r\n");
      out.write("                        <option value=\"50\">เชียงใหม่</option>\r\n");
      out.write("                        <option value=\"92\">ตรัง</option>\r\n");
      out.write("                        <option value=\"23\">ตราด</option>\r\n");
      out.write("                        <option value=\"63\">ตาก</option>\r\n");
      out.write("                        <option value=\"26\">นครนายก</option>\r\n");
      out.write("                        <option value=\"73\">นครปฐม</option>\r\n");
      out.write("                        <option value=\"48\">นครพนม</option>\r\n");
      out.write("                        <option value=\"30\">นครราชสีมา</option>\r\n");
      out.write("                        <option value=\"80\">นครศรีธรรมราช</option>\r\n");
      out.write("                        <option value=\"60\">นครสวรรค์</option>\r\n");
      out.write("                        <option value=\"12\">นนทบุรี</option>\r\n");
      out.write("                        <option value=\"96\">นราธิวาส</option>\r\n");
      out.write("                        <option value=\"55\">น่าน</option>\r\n");
      out.write("                        <option value=\"31\">บุรีรัมย์</option>\r\n");
      out.write("                        <option value=\"13\">ปทุมธานี</option>\r\n");
      out.write("                        <option value=\"77\">ประจวบคีรีขันธ์</option>\r\n");
      out.write("                        <option value=\"25\">ปราจีนบุรี</option>\r\n");
      out.write("                        <option value=\"94\">ปัตตานี</option>\r\n");
      out.write("                        <option value=\"14\">พระนครศรีอยุธยา</option>\r\n");
      out.write("                        <option value=\"56\">พะเยา</option>\r\n");
      out.write("                        <option value=\"82\">พังงา</option>\r\n");
      out.write("                        <option value=\"93\">พัทลุง</option>\r\n");
      out.write("                        <option value=\"66\">พิจิตร</option>\r\n");
      out.write("                        <option value=\"65\">พิษณุโลก</option>\r\n");
      out.write("                        <option value=\"76\">เพชรบุรี</option>\r\n");
      out.write("                        <option value=\"67\">เพชรบูรณ์</option>\r\n");
      out.write("                        <option value=\"54\">แพร่</option>\r\n");
      out.write("                        <option value=\"83\">ภูเก็ต</option>\r\n");
      out.write("                        <option value=\"44\">มหาสารคาม</option>\r\n");
      out.write("                        <option value=\"49\">มุกดาหาร</option>\r\n");
      out.write("                        <option value=\"58\">แม่ฮ่องสอน</option>\r\n");
      out.write("                        <option value=\"35\">ยโสธร</option>\r\n");
      out.write("                        <option value=\"95\">ยะลา</option>\r\n");
      out.write("                        <option value=\"45\">ร้อยเอ็ด</option>\r\n");
      out.write("                        <option value=\"85\">ระนอง</option>\r\n");
      out.write("                        <option value=\"21\">ระยอง</option>\r\n");
      out.write("                        <option value=\"70\">ราชบุรี</option>\r\n");
      out.write("                        <option value=\"16\">ลพบุรี</option>\r\n");
      out.write("                        <option value=\"52\">ลำปาง</option>\r\n");
      out.write("                        <option value=\"51\">ลำพูน</option>\r\n");
      out.write("                        <option value=\"42\">เลย</option>\r\n");
      out.write("                        <option value=\"33\">ศรีสะเกษ</option>\r\n");
      out.write("                        <option value=\"47\">สกลนคร</option>\r\n");
      out.write("                        <option value=\"90\">สงขลา</option>\r\n");
      out.write("                        <option value=\"91\">สตูล</option>\r\n");
      out.write("                        <option value=\"11\">สมุทรปราการ</option>\r\n");
      out.write("                        <option value=\"75\">สมุทรสงคราม</option>\r\n");
      out.write("                        <option value=\"74\">สมุทรสาคร</option>\r\n");
      out.write("                        <option value=\"27\">สระแก้ว</option>\r\n");
      out.write("                        <option value=\"19\">สระบุรี</option>\r\n");
      out.write("                        <option value=\"17\">สิงห์บุรี</option>\r\n");
      out.write("                        <option value=\"64\">สุโขทัย</option>\r\n");
      out.write("                        <option value=\"72\">สุพรรณบุรี</option>\r\n");
      out.write("                        <option value=\"84\">สุราษฎร์ธานี</option>\r\n");
      out.write("                        <option value=\"32\">สุรินทร์</option>\r\n");
      out.write("                        <option value=\"43\">หนองคาย</option>\r\n");
      out.write("                        <option value=\"39\">หนองบัวลำภู</option>\r\n");
      out.write("                        <option value=\"15\">อ่างทอง</option>\r\n");
      out.write("                        <option value=\"37\">อำนาจเจริญ</option>\r\n");
      out.write("                        <option value=\"41\">อุดรธานี</option>\r\n");
      out.write("                        <option value=\"53\">อุตรดิตถ์</option>\r\n");
      out.write("                        <option value=\"61\">อุทัยธานี</option>\r\n");
      out.write("                        <option value=\"34\">อุบลราชธานี</option>");
      out.write("\r\n");
      out.write("                      \t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td height=\"25\" align=\"right\">สถานะ :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  <select name=\"status\" class=\"select\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <option value =\"\" >ทั้งหมด</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <option value =\"1\">นำส่งเงินแล้ว</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <option value =\"0\">รอนำส่งเงิน</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t  <option value =\"2\">ยกเลิกนำส่ง</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t  </select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </table></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"image\" src=\"images/btn_search_big.png\" value=\"Submit\" alt=\"Submit\" /> \r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write('\r');
      out.write('\n');
      out.write(' ');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;<img name=\"222\" width=\"67\" src=\"images/icn_clearsearch.jpg\"  style=\"cursor:hand\" alt=\"ล้างเงือนไข\" onclick=\"clear2();\" >");
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t  </table></td>\r\n");
      out.write("\t\t\t\t\t   </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\" valign=\"bottom\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_left_bottom.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\" valign=\"bottom\" bgcolor=\"#FFFFFF\"><img src=\"images/pic_angleSearch_right_bottom.png\" width=\"10\" height=\"8\"></td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("                  </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                </form>\r\n");
      out.write("                <td><table class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
      out.write("                  <tr  align=\"left\" valign=\"top\">\r\n");
      out.write("<td colspan=\"5\">");
      out.print(pageUtil.getPagination());
      out.write("</td>\r\n");
      out.write("<td colspan=\"2\" align=\"right\">");
      out.print(pageUtil.getPageStatus());
      out.write("\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("                  \r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td width=\"50\" class=\"TblHeaderColumn AlignCenter\">ลำดับที่</td>\r\n");
      out.write("                    <td width=\"89\" class=\"TblHeaderColumn\">เลขที่ใบนำส่ง</td>\r\n");
      out.write("                    <td width=\"81\" class=\"TblHeaderColumn\">วันที่นำส่ง</td>\r\n");
      out.write("                    <td class=\"TblHeaderColumn\">หน่วยงานที่นำส่ง</td>\r\n");
      out.write("                    <td width=\"130\" class=\"TblHeaderColumn\">พ.ร.บ</td>\r\n");
      out.write("                    <td width=\"80\" class=\"TblHeaderColumn\">จำนวนคดี</td>\r\n");
      out.write("                    <td width=\"86\" class=\"TblHeaderColumn\">สถานะ</td>\r\n");
      out.write("                    <td width=\"80\" class=\"TblHeaderColumn\">ค่าปรับรวม</td>\r\n");
      out.write("                    <td width=\"80\" class=\"TblHeaderColumn\">เงินสินบน</td>\r\n");
      out.write("                    <td width=\"80\" class=\"TblHeaderColumn\">เงินรางวัล</td>\r\n");
      out.write("                    <td width=\"80\" class=\"TblHeaderColumn\">เงินส่งคลัง</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  \r\n");
      out.write("                    \r\n");
      out.write("                   ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                </table></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
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
          out.write("            \t\t\t\t\t\t\t\t\t\t<option value=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.legislation_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("            \t\t\t\t\t\t\t\t\t\t");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.legislation_id == ltion.id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsAdmin != '1' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${edlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("off");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          \t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.short_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("        \t\t\t\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode==userOffcode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
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

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
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
          out.write("\t\t             ");
          if (_jspx_meth_c_005fset_005f0(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("\r\n");
          out.write("\t\t             ");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(Rows % 2) == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t\t\t\t\t<tr class=\"TblRow AlignLeft\" ");
        if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fif_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        out.write(" >\r\n");
        out.write("\t\t                    <td class=\"TblRow AlignCenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Rows}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t<td ><a href=\"process?action=Sendincome&id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&cmd=preup\" class=\"linkdatarow\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.send_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></td>\r\n");
        out.write("\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.send_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offname_write}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"center\" >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_qty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.status_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"right\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.sumfine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"right\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.birbe_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"right\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.reward_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"right\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.treasury_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.income_status == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"color:red;\"");
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

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(Rows % 2) == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<tr class=\"TblRow bgRowGray\" ");
        if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fif_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        out.write(" >\r\n");
        out.write("\t\t                \t<td class=\"TblRow AlignCenter bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Rows}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t<td ><a href=\"process?action=Sendincome&id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&cmd=preup\" class=\"linkdatarow\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.send_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></td>\r\n");
        out.write("\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.send_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offname_write}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"center\" >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_qty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.status_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"right\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.sumfine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"right\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.birbe_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"right\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.reward_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t                    <td align=\"right\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.treasury_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.income_status == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"color:red;\"");
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
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsSearch=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<script type=\"text/JavaScript\">\r\n");
        out.write("\t\t\t\tdocument.dataform.offcode_write.value = \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userOffcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" ;\r\n");
        out.write("\t\t\t\tdocument.dataform.province.value = \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" ;\r\n");
        out.write("\t\t\t\tdocument.dataform.legislation_id.value = \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" ;\r\n");
        out.write("\t\t\t\tdocument.dataform.status.value = \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" ;\r\n");
        out.write("\t\t\t</script>\r\n");
        out.write("\t\t");
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
