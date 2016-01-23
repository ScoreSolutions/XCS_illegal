package org.apache.jsp.CompareCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;

public final class reward_005fdivide_005falcohol_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function aatopenmodal(myTable)\r\n");
      out.write("{\r\n");
      out.write("    var data = window.showModalDialog('process?action=Divide_staff_poplist&showOther=1', self, 'dialogWidth=700px,Height=400px');\r\n");
      out.write("    if (data) {\r\n");
      out.write("        var base = jQuery(\".person_row\").size();\r\n");
      out.write("        for (var i = 0; i < data.length; i++) {\r\n");
      out.write("            var index = base + i + 1;\r\n");
      out.write("            //if (jQuery(\"input[name='rda_idcard_no'][value='\" + data[i][5] + \"']\").size() > 0) {\r\n");
      out.write("                //alert(\"dupplicated offcode \");\r\n");
      out.write("            //} else {\r\n");
      out.write("                var newRow = jQuery(\"<tr/>\");\r\n");
      out.write("                //                    newRow.attr('id','person_row_'+index);\r\n");
      out.write("                //                    newRow.addClass('person_row');\r\n");
      out.write("                newRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignCenter\").html(index));\r\n");
      out.write("                newRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignCenter\").append(jQuery(\"<input />\").attr(\"n_ame\", \"chk1\").attr(\"type\", \"checkbox\")));\r\n");
      out.write("                newRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignCenter\").append(jQuery(\"<input />\").attr({type:'text',n_ame:'order_seq',size:'1',value:index,maxlength:3}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));\r\n");
      out.write("                newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'new_order_seq',value:index}));\r\n");
      out.write("                newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rda_id',value:''}));\r\n");
      out.write("                newRow.append(jQuery(\"<td/>\").addClass('TblRow AlignLeft').html(''));\r\n");
      out.write("                newRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignLeft\").html(data[i][9]));\r\n");
      out.write("                newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rda_title_code',id:'rda_title_code',value:data[i][12]}));\r\n");
      out.write("                newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rda_first_name',id:'rda_first_name',value:data[i][10]}));\r\n");
      out.write("                newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rda_last_name',id:'rda_last_name',value:data[i][11]}));\r\n");
      out.write("                newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rda_position_name',id:'rda_position_name',value:data[i][3]}));\r\n");
      out.write("                newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rda_staff_level',id:'rda_staff_level',value:data[i][13]}));\r\n");
      out.write("                newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rda_duty_status_id',id:'rda_duty_status_id',value:5}));\r\n");
      out.write("                newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rda_idcard_no',id:'rda_idcard_no',value:data[i][5]}));\r\n");
      out.write("                newRow.append(jQuery(\"<td/>\").addClass('TblRow AlignLeft').html(data[i][3]));\r\n");
      out.write("                newRow.append(jQuery('<td/>').addClass('TblRow AlignRight').append(jQuery('<input/>').attr({type:'hidden',n_ame:'reward',value:''})));\r\n");
      out.write("                newRow.append(jQuery('<td/>').addClass('TblRow AlignLeft').append(jQuery('<input/>').addClass('textNum sum').attr({type:'text',n_ame:'arrest',value:'',size:'7'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));\r\n");
      out.write("                newRow.append(jQuery('<td/>').addClass('TblRow AlignLeft').append(jQuery('<input/>').addClass('textNum sum').attr({type:'text',n_ame:'arrest_co',value:'',size:'7'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));\r\n");
      out.write("                newRow.append(jQuery('<td/>').addClass('TblRow AlignLeft').append(jQuery('<input/>').addClass('textNum sum').attr({type:'text',n_ame:'command',value:'',size:'7'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));\r\n");
      out.write("                newRow.append(jQuery('<td/>').addClass('TblRow AlignLeft').append(jQuery('<input/>').addClass('textNum sum').attr({type:'text',n_ame:'helper',value:'',size:'7'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));\r\n");
      out.write("\r\n");
      out.write("                newRow.append(jQuery('<td/>').addClass('TblRow AlignRight').append(jQuery('<input/>').addClass('textViewNum').attr({type:'text',n_ame:'total_al',value:'0',size:'10',readonly:'readonly'})));\r\n");
      out.write("                jQuery(\"#divide_tab\").append(jQuery('<tr/>').addClass('person_row').attr('id', 'person_row_' + index).html(newRow.html().replace(/n_ame/g, 'name')));\r\n");
      out.write("            //}\r\n");
      out.write("        }\r\n");
      out.write("    } else {\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<tbody id=\"Alcohol\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td>\r\n");
      out.write("\t<table width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"divide_tab\">\r\n");
      out.write("\t    <tr>\r\n");
      out.write("\t        <td colspan=\"12\">\r\n");
      out.write("\t            <span class=\"spanLink\" onclick=\"aatopenmodal();\"> เพิ่มรายการ</span> |\r\n");
      out.write("\t            <span class=\"spanLink\" onclick=\"deleterow();\">ลบรายการที่เลือก</span> |\r\n");
      out.write("\t            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t            <span class=\"spanLink\" onClick=\"calReward();calMoneyByStaff();\">คำนวณเงินรางวัล</span>\r\n");
      out.write("\t        </td>\r\n");
      out.write("\t    </tr>\r\n");
      out.write("\t    <tr class=\"TblHeaderColumn\">\r\n");
      out.write("\t        <td width=\"50\">ลำดับที่</td>\r\n");
      out.write("\t        <td width=\"30\"><input name=\"chkAll\" type=\"checkbox\" id=\"alcohol_chk\" onclick=\"chkUncheckAll('alcohol_chk')\"/></td>\r\n");
      out.write("\t        <td width=\"80\">ลำดับที่รายการ</td>\r\n");
      out.write("\t        <td width=\"100\" class=\"TblHeaderColumn\">ชื้อผู้แจ้งความ</td>\r\n");
      out.write("\t        <td width=\"100\" class=\"TblHeaderColumn\">ชื่อ-สกุล</td>\r\n");
      out.write("\t        <td width=\"130\" class=\"TblHeaderColumn\">ตำแหน่ง</td>\r\n");
      out.write("\t        <!-- <td width=\"70\" class=\"TblHeaderColumn\">ระดับ</td> -->\r\n");
      out.write("\t        <td width=\"70\" class=\"TblHeaderColumn\">เงินสินบน</td>\r\n");
      out.write("\t        <td width=\"70\" class=\"TblHeaderColumn\">ผู้จับกุม</td>\r\n");
      out.write("\t        <td width=\"70\" class=\"TblHeaderColumn\">ผู้ร่วมจับกุม</td>\r\n");
      out.write("\t        <td width=\"70\" class=\"TblHeaderColumn\">ผู้สั่งการ</td>\r\n");
      out.write("\t        <td width=\"70\" class=\"TblHeaderColumn\">ผู้ช่วยเหลือ</td>\r\n");
      out.write("\t        <td width=\"70\" class=\"TblHeaderColumn\">รวม</td>\r\n");
      out.write("\t    </tr>\r\n");
      out.write("\t    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td>\r\n");
      out.write("            <table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td width=\"20%\" align=\"right\" valign=\"top\" height=\"50\">หมายเหตุ :&nbsp;</td>\r\n");
      out.write("                    <td width=\"80%\" valign=\"top\">\r\n");
      out.write("                        <div style=\"border-width: 1px; border-style: groove; border-color: #dcdcdc; display:none;\" >\r\n");
      out.write("                            &nbsp;&nbsp;3/5 ของเงินรางวัลคิดเป็นส่วนละ <span id=\"threefivemain\">0.00</span> บาท เหลือเศษ\r\n");
      out.write("                            <span id=\"threefivesub\">0.00</span> บาท แบ่งให้ผู้จับทั้งหมด<br>\r\n");
      out.write("                            &nbsp;&nbsp;2/5 ของเงินรางวัลคิดเป็นส่วนละ <span id=\"twofivemain\">0.00</span> บาท เหลือเศษ\r\n");
      out.write("                            <span id=\"twofivesub\">0.00</span> บาท แบ่งให้ผู้จับทั้งหมด\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <textarea rows=\"2\" cols=\"80\" name=\"remarks_al\" id=\"remarks_al\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rd.remarks }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</tbody>");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdas[0] == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t            <span class=\"spanLink\" onclick=\"loadStaffFromView()\">ดึงรายการผู้ดำเนินการ</span> |\r\n");
        out.write("\t            ");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdas}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("rda");
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t        <tr class=\"person_row\" id=\"person_row_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t            <td class=\"TblRow AlignCenter\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.order_seq}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t            <td class=\"TblRow AlignCenter\">\r\n");
          out.write("\t                ");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t            </td>\r\n");
          out.write("\t            <td class=\"TblRow AlignCenter\">\r\n");
          out.write("\t            \t");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t            \t");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t            </td>\r\n");
          out.write("\t            <input type=\"hidden\" name=\"new_order_seq\" id=\"new_order_seq\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.order_seq}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t            <input type=\"hidden\" name=\"rda_id\" id=\"rda_id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t            <td class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.order_seq=='1'?(rda.full_name):''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t            <input type=\"hidden\" name=\"rda_title_code\" id=\"rda_title_code\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t            <input type=\"hidden\" name=\"rda_first_name\" id=\"rda_first_name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t            <input type=\"hidden\" name=\"rda_last_name\" id=\"rda_last_name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t            <input type=\"hidden\" name=\"rda_position_name\" id=\"rda_position_name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.position_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t            <input type=\"hidden\" name=\"rda_staff_level\" id=\"rda_staff_level\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t            <input type=\"hidden\" name=\"rda_duty_status_id\" id=\"rda_duty_status_id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t            <input type=\"hidden\" name=\"rda_idcard_no\" id=\"rda_idcard_no\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.idcard_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t            <td class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.order_seq!='1'?(rda.full_name):''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t            <td class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.position_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </td>\r\n");
          out.write("\t            ");
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t            ");
          if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t        </tr>\r\n");
          out.write("\t    ");
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

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count > 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                    <input name=\"chk1\" id=\"chk1\" type=\"checkbox\"/>\r\n");
        out.write("\t                ");
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

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.order_seq=='1' || rda.order_seq=='2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t            \t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.order_seq}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t            \t\t<input type=\"hidden\" name=\"order_seq\" id=\"order_seq\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.order_seq}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"></input>\r\n");
        out.write("\t            \t");
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

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.order_seq>2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t            \t\t<input type=\"text\" name=\"order_seq\" id=\"order_seq\" size=\"1\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.order_seq}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" maxlength=\"3\"  OnKeyPress='ChkMinusDbl(this);' />\r\n");
        out.write("\t            \t");
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

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status_id==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                <td class=\"TblRow AlignCenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(rda.duty_status_id==1)?((db.birbe_money ==0?(''):(db.birbe_money))):''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t                <td class=\"TblRow AlignLeft\">&nbsp;</td>\r\n");
        out.write("\t                <td class=\"TblRow AlignLeft\">&nbsp;</td>\r\n");
        out.write("\t                <td class=\"TblRow AlignLeft\">&nbsp;</td>\r\n");
        out.write("\t                <td class=\"TblRow AlignLeft\">&nbsp;</td>\r\n");
        out.write("\t                <td class=\"TblRow AlignRight\">\r\n");
        out.write("\t                    <input type=\"hidden\" name=\"arrest\" id=\"arrest\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status02_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t                    <input type=\"hidden\" name=\"arrest_co\" id=\"arrest_co\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status03_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t                    <input type=\"hidden\" name=\"command\" id=\"command\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status04_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t                    <input type=\"hidden\" name=\"helper\" id=\"helper\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status05_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t                    <div class='total'>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(rda.duty_status_id==1)?(db.birbe_money):''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</div>\r\n");
        out.write("\t                </td>\r\n");
        out.write("\t                <input type=\"hidden\" name=\"birbe\" id=\"birbe\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(db.birbe_money==0)?(''):(db.birbe_money)}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t            ");
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

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status_id!=1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                <td class=\"TblRow AlignRight\">&nbsp;</td>\r\n");
        out.write("\t                <input type=\"hidden\" name=\"reward\" id=\"reward\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status01_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t                <td class=\"TblRow AlignLeft\">\r\n");
        out.write("\t                \t<input type=\"text\" size=\"7\" id=\"arrest\" name=\"arrest\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status02_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textNum sum\" onblur=\"calMoneyByStaff()\" OnKeyPress=\"ChkMinusDbl(this);\">\r\n");
        out.write("\t                </td>\r\n");
        out.write("\t                <td class=\"TblRow AlignLeft\">\r\n");
        out.write("\t                \t<input type=\"text\" size=\"7\" id=\"arrest_co\" name=\"arrest_co\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status03_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textNum sum\" onblur=\"calMoneyByStaff()\" OnKeyPress=\"ChkMinusDbl(this);\">\r\n");
        out.write("\t                </td>\r\n");
        out.write("\t                <td class=\"TblRow AlignLeft\">\r\n");
        out.write("\t                \t<input type=\"text\" size=\"7\" id=\"command\" name=\"command\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status04_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textNum sum\" onblur=\"calMoneyByStaff()\" OnKeyPress=\"ChkMinusDbl(this);\">\r\n");
        out.write("\t                </td>\r\n");
        out.write("\t                <td class=\"TblRow AlignLeft\">\r\n");
        out.write("\t                \t<input type=\"text\" size=\"7\" id=\"helper\" name=\"helper\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status05_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textNum sum\" onblur=\"calMoneyByStaff()\" OnKeyPress=\"ChkMinusDbl(this);\">\r\n");
        out.write("\t                </td>\r\n");
        out.write("\t                <td class=\"TblRow AlignRight\">\r\n");
        out.write("\t                    <input type=\"text\" size=\"10\" id=\"total_al\" name=\"total_al\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rda.duty_status02_money+rda.duty_status03_money+rda.duty_status04_money+rda.duty_status05_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textViewNum\" readonly ></input>\r\n");
        out.write("\t                </td>\r\n");
        out.write("\t            ");
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
}
