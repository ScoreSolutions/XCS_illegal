package org.apache.jsp.Popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;
import java.util.HashMap;
import java.util.List;
import java.math.BigDecimal;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.RequestUtil;

public final class divide_005fstaff_005fpoplist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Templates/meta.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write('\r');
      out.write('\n');

PageUtil pageUtil = new PageUtil(request);

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<HEAD>\r\n");
      out.write("<base target=\"_self\" />\r\n");
      out.write("<title>รายชื่อเจ้าหน้าที่ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"../js/rollimage.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"../js/menu.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var opener = window.dialogArguments;\r\n");
      out.write("function saveto()\r\n");
      out.write("{\r\n");
      out.write("var data = \tnew Array();\r\n");
      out.write("var count = 0;\r\n");
      out.write("var dcount = 0;\r\n");
      out.write("\r\n");
      out.write("\tfor (var i=1; i < document.dataform3.thecheckbox.length; i++)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif (document.dataform3.thecheckbox[i].checked)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tcount=dcount;\r\n");
      out.write("\t\t\tdcount+=1;\r\n");
      out.write("\t\t\tdata[count]=new Array();\r\n");
      out.write("\t\t\tdata[count][1]=\"\"; //document.dataform3.staff_no[i].value;\r\n");
      out.write("\t\t\tdata[count][2]=document.dataform3.inspector_code[i].value;\r\n");
      out.write("\t\t\tdata[count][3]=document.dataform3.posname[i].value;\r\n");
      out.write("\t\t\tdata[count][4]=\"3\";\r\n");
      out.write("\t\t\tdata[count][5]=document.dataform3.idcard_no[i].value;\r\n");
      out.write("\t\t\tdata[count][6]=document.dataform3.poscode[i].value;\r\n");
      out.write("\t\t\tdata[count][7]=document.dataform3.offcode[i].value;\r\n");
      out.write("\t\t\tdata[count][8]=document.dataform3.offname[i].value;\r\n");
      out.write("\t\t\tdata[count][9]=document.dataform3.fullname[i].value;\r\n");
      out.write("\t\t\tdata[count][10]=document.dataform3.first_name[i].value;\r\n");
      out.write("\t\t\tdata[count][11]=document.dataform3.last_name[i].value;\r\n");
      out.write("            data[count][12]=document.dataform3.title_code[i].value;\r\n");
      out.write("\t\t\tdata[count][13]=document.dataform3.staff_level[i].value;\r\n");
      out.write("\t\t\tdata[count][14]=document.dataform3.title_name[i].value;\r\n");
      out.write("\t\t\t//alert (data[count][1]+ \" - \" + data[count][2]+ \" - \" + data[count][3]+ \" - \" + data[count][4] );\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t//alert (dcount);\r\n");
      out.write("\t//alert (data.length);\r\n");
      out.write("\twindow.returnValue = data;\r\n");
      out.write("\twindow.close();\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("<form method=\"post\" name=\"dataform\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"95%\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><span class=\"websitename\" > รายชื่อเจ้าหน้าที่</span></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><hr /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<input name=\"btnSelect\"  type=\"button\" class=\"barButton\" value=\"เลือกรายการ\" onClick=\"saveto()\" >\r\n");
      out.write("\t\t\t<input name=\"btnBack\"  type=\"button\" class=\"barButton\" value=\"กลับ\" onClick=\"self.close()\" >\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"showOther\" id=\"showOther\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${showOther}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><hr /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"30%\"  align=\"right\">ทีมสายตรวจ : </td>\r\n");
      out.write("\t\t<td width=\"70%\">\r\n");
      out.write("            <select  name=\"teamname\" id=\"teamname\" style=\"width:200\">\r\n");
      out.write("            <option value=\"\" selected>ทั้งหมด</option>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"30%\"  align=\"right\">ชื่อเจ้าหน้าที่ : </td>\r\n");
      out.write("\t\t<td width=\"70%\">\r\n");
      out.write("\t\t\t<input name=\"txtfname\" type=\"text\" class=\"text\"  size=\"20\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.txtfname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\tนามสกุล :&nbsp;&nbsp;&nbsp;<input name=\"txtlname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.txtlname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"text\"  size=\"25\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td  align=\"right\">ตำแหน่ง : </td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("\t\t\t<input name=\"txtposname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.txtposname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"text\"  size=\"50\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td  align=\"right\">สังกัด : </td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("\t\t\t<input name=\"txtoffname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.txtoffname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"text\"  size=\"50\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">&nbsp;</td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("\t\t\t<input type=\"image\" src=\"images/btn_search_big.png\" value=\"Submit\" alt=\"Submit\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tfunction Check(chkcont,chk)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif(chkcont.checked==true){\r\n");
      out.write("\t\t\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\t\t\tchk[i].checked = true ;\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\t\t\tchk[i].checked = false ;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<table class=\"tableList\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
      out.write("       <tr  align=\"left\" valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"5\">");
      out.print(pageUtil.getPagination());
      out.write("</td><td align=\"right\">");
      out.print(pageUtil.getPageStatus());
      out.write("\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("       <form method=\"post\" name=\"dataform3\" >\r\n");
      out.write("       <tr>\r\n");
      out.write("\t\t\t<td width=\"5%\" class=\"TblHeaderColumn aligncenter\">ลำดับที่</td>\r\n");
      out.write("\t\t\t<td class=\"TblHeaderColumn aligncenter\" width=\"5%\"> <input type=\"checkbox\" name=\"allCheckbox\" value=\"\" onClick=\"Check(this,document.dataform3.thecheckbox);\" />\r\n");
      out.write("\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"thecheckbox\"></td>\r\n");
      out.write("\t\t\t<td width=\"15%\" class=\"TblHeaderColumn\">รหัสพนักงาน\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"idcard_no\" name=\"idcard_no\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"staff_no\" name=\"staff_no\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"inspector_code\" name=\"inspector_code\" value=\"\" /></td>\r\n");
      out.write("\t\t\t<td width=\"20%\" class=\"TblHeaderColumn\">ชื่อ-สกุล\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"fullname\" name=\"fullname\" value=\"\" /></td>\r\n");
      out.write("\t\t\t<td width=\"25%\" class=\"TblHeaderColumn\">ตำแหน่ง\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"posname\" name=\"posname\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"poscode\" name=\"poscode\" value=\"\" /></td>\r\n");
      out.write("\t\t\t<td width=\"25%\" class=\"TblHeaderColumn\">สังกัด\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"offname\" name=\"offname\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"offcode\" name=\"offcode\" value=\"\" /></td>\r\n");
      out.write("\t\t\t<td width=\"10%\" class=\"TblHeaderColumn\">ประเภทเจ้าหน้าที่</td>\r\n");
      out.write("                <input type=\"hidden\" id=\"first_name\" name=\"first_name\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"last_name\" name=\"last_name\" value=\"\" />\r\n");
      out.write("                <input type=\"hidden\" id=\"title_code\" name=\"title_code\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"staff_level\" name=\"staff_level\" value=\"\" />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"title_name\" name=\"title_name\" value=\"\" />\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t  ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
    _jspx_th_c_005furl_005f0.setValue("process?action=Divide_staff_poplist&cmd=list");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${teamlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("team");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${team.inspector_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${team.inspector_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${team.inspector_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("            ");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${team.inspector_code == param.teamname}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${divide_staffList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("staff");
    _jspx_th_c_005fforEach_005f1.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("             ");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t ");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t");
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

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(i.count % 2) == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t<td class=\"TblRow aligncenter\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count+_rowIndex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t<td class=\"TblRow aligncenter\" ><INPUT TYPE=\"checkbox\" NAME=\"thecheckbox\"></td>\r\n");
        out.write("\t\t\t<td height=\"25\" align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.idcard_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"idcard_no\" name=\"idcard_no\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.idcard_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"staff_no\" name=\"staff_no\" value=\"\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"inspector_code\" name=\"inspector_code\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.team_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /></td>\r\n");
        out.write("\t\t\t<td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\"><span class=\"TblRow AlignLeft\">\r\n");
        out.write("\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"fullname\" name=\"fullname\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /></td>\r\n");
        out.write("\t\t\t<td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\"><span class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"posname\" name=\"posname\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"poscode\" name=\"poscode\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /></td>\r\n");
        out.write("\t\t\t<td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\"><span class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"offname\" name=\"offname\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"offcode\" name=\"offcode\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("                <input type=\"hidden\" id=\"first_name\" name=\"first_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"last_name\" name=\"last_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("                <input type=\"hidden\" id=\"title_code\" name=\"title_code\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"staff_level\" name=\"staff_level\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"title_name\" name=\"title_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /></span></td>\r\n");
        out.write("\t\t\t<td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.per_type_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(i.count % 2) == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t<td class=\"TblRow aligncenter bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count+_rowIndex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t<td class=\"TblRow aligncenter bgRowGray\" ><INPUT TYPE=\"checkbox\" NAME=\"thecheckbox\"></td>\r\n");
        out.write("\t\t\t<td height=\"25\" align=\"left\" valign=\"top\" class=\"TblRow AlignLeft  bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.idcard_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"idcard_no\" name=\"idcard_no\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.idcard_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t    <input type=\"hidden\" id=\"staff_no\" name=\"staff_no\" value=\"\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"inspector_code\" name=\"inspector_code\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.team_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /></td>\r\n");
        out.write("\t\t\t<td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft bgRowGray\"><span class=\"TblRow AlignLeft\">\r\n");
        out.write("\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"fullname\" name=\"fullname\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("&nbsp;&nbsp;");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /></td>\r\n");
        out.write("\t\t\t<td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft bgRowGray\"><span class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"posname\" name=\"posname\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"poscode\" name=\"poscode\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /></td>\r\n");
        out.write("\t\t\t<td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft bgRowGray\"><span class=\"TblRow AlignLeft\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"offname\" name=\"offname\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"offcode\" name=\"offcode\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("                <input type=\"hidden\" id=\"first_name\" name=\"first_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"last_name\" name=\"last_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("                <input type=\"hidden\" id=\"title_code\" name=\"title_code\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"staff_level\" name=\"staff_level\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" id=\"title_name\" name=\"title_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("            </td>\r\n");
        out.write("            <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft bgRowGray\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staff.per_type_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t\t");
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
