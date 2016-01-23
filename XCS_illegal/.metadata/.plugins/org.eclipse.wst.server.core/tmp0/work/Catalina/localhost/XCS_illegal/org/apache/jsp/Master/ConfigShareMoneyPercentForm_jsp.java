package org.apache.jsp.Master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.FormHandler;

public final class ConfigShareMoneyPercentForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/Templates/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/ConfigShareMoney.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>\r\n");
      out.write("<script type=\"text/JavaScript\">\r\n");
      out.write("  function chkIsFine()\r\n");
      out.write("  {\r\n");
      out.write("\tif(document.getElementById(\"rdiIsFineY\").checked==true)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"txtFineRate\").disabled=false;\r\n");
      out.write("\t\tdocument.getElementById(\"txtFineRate\").className=\"textbox\";\r\n");
      out.write("\r\n");
      out.write("\t}else\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById(\"txtFineRate\").disabled=true;\r\n");
      out.write("\t\tdocument.getElementById(\"txtFineRate\").className=\"textView\";\r\n");
      out.write("\t\tdocument.getElementById(\"txtFineRate\").value=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("  }\r\n");
      out.write("  function mu1(){\r\n");
      out.write("\t  alert(document.getElementById(\"duty_code\").value);\r\n");
      out.write("  }\r\n");
      out.write("  function mu2(){\r\n");
      out.write("\t  alert(document.getElementById(\"type_code\").value);\r\n");
      out.write("  }\r\n");
      out.write("  function checkPercent(){\r\n");
      out.write("\t  var treasury =document.dataform.treasury.value;\r\n");
      out.write("\t  var bribe = document.dataform.bribe.value;\r\n");
      out.write("\t  var reward = document.dataform.reward.value;\r\n");
      out.write("\r\n");
      out.write("\t  if((parseInt(treasury)+parseInt(bribe)+parseInt(reward)) != 100){\r\n");
      out.write("\t\t  alert(\"เงินส่งคลัง เงินสินบน เงินรางวัล ไม่เท่ากับ 100%\");\r\n");
      out.write("\t\t  document.getElementById(\"treasury\").select();\r\n");
      out.write("\t  }else{\r\n");
      out.write("\t\t  //updateCourt('");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("');\r\n");
      out.write("\t\t  updateCourt('");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("');\r\n");
      out.write("\t  }\r\n");
      out.write("  }\r\n");
      out.write("  function updateCourt(url){\r\n");
      out.write("\t\tif(document.dataform.onsubmit()){\r\n");
      out.write("\t\t\tdocument.dataform.action=url;\r\n");
      out.write("\t\t    document.dataform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/JavaScript\">\r\n");
      out.write("\tfunction backpage(){\r\n");
      out.write("\t\twindow.location.href='");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("';\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction legislation()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar selValue = document.getElementById(\"legislation_id_temp\").value;\r\n");
      out.write("\t\tConfigShareMoney.getIndictmentID(selValue,  function(data){\r\n");
      out.write("\t\t\tdwr.util.removeAllOptions(\"indictment_id\");\r\n");
      out.write("\t\t\tdwr.util.addOptions( \"indictment_id\",[{id:\"\",name:\"เลือก\"}] , \"id\" , \"name\" );\r\n");
      out.write("\t\t\tdwr.util.addOptions( \"indictment_id\", data , \"id\" , \"name\" );\r\n");
      out.write("\t\t\tdwr.util.setValue(\"indictment_id\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.indictment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("function getDutyTable(vDutyCode){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tLegislationProduct.getDutyTable(document.getElementById(\"legislation_id_temp\").value, function(data){\r\n");
      out.write("\t\t\tdwr.util.removeAllOptions(\"duty_code\");\r\n");
      out.write("\t\t\tdwr.util.addOptions(\"duty_code\",[{duty_code:\"\",duty_name:\"เลือก\"}], \"duty_code\", \"duty_name\");\r\n");
      out.write("\t\t\tdwr.util.addOptions(\"duty_code\",data,\"duty_code\", \"duty_name\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(vDutyCode != \"\" && vDutyCode != null)\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"duty_code\", vDutyCode);\r\n");
      out.write("\r\n");
      out.write("\t\t\tdwr.util.removeAllOptions(\"type_code\");\r\n");
      out.write("\t\t\tdwr.util.addOptions(\"type_code\",[{type_code:\"\",type_name:\"เลือก\"}], \"type_code\", \"type_name\");\r\n");
      out.write("\t\t})\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction producttype(selProduct,vTypeCode)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tConfigShareMoney.getProductTtpe(selProduct, function(data){\r\n");
      out.write("\t\t\tdwr.util.removeAllOptions(\"type_code\");\r\n");
      out.write("\t\t\t//dwr.util.setValue(\"type_code\",\"เลือก\");\r\n");
      out.write("\t\t\t//dwr.util.removeAllOptions(\"type_code\");\r\n");
      out.write("\t\t\tdwr.util.addOptions(\"type_code\", [{code:\"\",name:\"เลือก\"}], \"code\" , \"name\");\r\n");
      out.write("\t\t\tdwr.util.addOptions(\"type_code\", data , \"code\" , \"name\");\r\n");
      out.write("\r\n");
      out.write("\t\t\tif(vTypeCode != \"\" && vTypeCode != null)\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"type_code\", vTypeCode)\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");

	FormHandler formHandler = new FormHandler(request);

      out.write("\r\n");
      out.write("<form name=\"dataform\" action=\"\" method=\"post\">\r\n");
      out.write("\t\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td width=\"100%\" align=\"left\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"99%\">\r\n");
      out.write("\t\t\t\t\t<span class=\"websitename\">ข้อมูลเปอร์เซ็นการแบ่งเงิน</span>\r\n");
      out.write("\t\t\t\t </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"15\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t<td >&nbsp;</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input name=\"btnSave\"  type=\"button\" class=\"barbutton\" value=\"บันทึก\"  onclick=\"checkPercent();\" >\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input name=\"btnCancel\"  type=\"button\" class=\"barbutton\" value=\"ยกเลิกการแก้ไข\" onclick=\"javascript:location.href='");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("'\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input name=\"btnBack\"  type=\"button\" class=\"barbutton\" value=\"กลับหน้าค้นหา\" onClick=\"backpage();\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t  </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("\t\t\t\t\t<table width=\"950\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"25\" align=\"right\">พ.ร.บ. :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\" >\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"legislation_id_temp\" id=\"legislation_id_temp\" style=\"width:200\" onChange=\"legislation();getDutyTable('');\" >\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"isnotice\" id=\"isnotice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.isnotice}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write(' ');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("/>มีผู้แจ้งความ\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"25\" align=\"right\">% เงินส่งคลัง :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td  colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"treasury\" name=\"treasury\" class=\"textNum\" OnKeyPress=\"ChkMinusDbl(this);\" size=\"5\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.treasury }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t% เงินสินบน :&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"bribe\" class=\"textNum\" OnKeyPress=\"ChkMinusDbl(this);\" size=\"5\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.bribe}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t% เงินรางวัล :&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"reward\" class=\"textNum\" OnKeyPress=\"ChkMinusDbl(this);\" size=\"5\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.reward}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"25\" align=\"right\">เงินสินบนสูงสุด :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"bribe_limit\"  class=\"textNum\" OnKeyPress=\"ChkMinusDbl(this);\" size=\"10\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.bribe_limit}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>&nbsp;บาท&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<i>กรณีไม่จำกัดจำนวนเงินสินบนสูงสุด ให้กำหนดค่าเป็น 0</i>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"25\" align=\"right\">เงินรางวัลสูงสุด :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"reward_limit\"  class=\"textNum\" OnKeyPress=\"ChkMinusDbl(this);\" size=\"10\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.reward_limit}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<font style=\"color:red\">*</font>&nbsp;บาท&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<i>กรณีไม่จำกัดจำนวนเงินรางวัลสูงสุด ให้กำหนดค่าเป็น 0</i>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t  <tr><td colspan=\"4\">&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"25\" align=\"right\">กระทำผิดมาตรา :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\" >\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"indictment_id\" id=\"indictment_id\" style=\"width:860px;\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected >เลือก</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"25\" align=\"right\">สินค้า :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"3\" >\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"duty_code\" id=\"duty_code\" style=\"width:860px;\" onchange=\"producttype(this.value,'');\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected>เลือก</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t  <td height=\"25\" align=\"right\">ชนิดสินค้า :&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t  <td colspan=\"3\" >\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"type_code\" id=\"type_code\" style=\"width:860px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\" selected>เลือก</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </table></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//You should create the validator only after the definition of the HTML form\r\n");
      out.write("  var frmvalidator  = new Validator(\"dataform\");\r\n");
      out.write("\r\n");
      out.write("  //frmvalidator.addValidation(\"legislation_id_temp\",\"dontselect=0\",\"กรุณาเลือก พ.ร.บ\");\r\n");
      out.write("  frmvalidator.addValidation(\"bribe\",\"req\",\"กรุณาป้อน เงินสินบน\");\r\n");
      out.write("  frmvalidator.addValidation(\"bribe\",\"numeric\");\r\n");
      out.write("  frmvalidator.addValidation(\"reward\",\"req\",\"กรุณาป้อน เงินรางวัล\");\r\n");
      out.write("  frmvalidator.addValidation(\"reward\",\"numeric\");\r\n");
      out.write("  frmvalidator.addValidation(\"treasury\",\"req\",\"กรุณาป้อน เงินส่งคลัง\");\r\n");
      out.write("  frmvalidator.addValidation(\"treasury\",\"numeric\");\r\n");
      out.write("  frmvalidator.addValidation(\"bribe_limit\",\"req\",\"กรุณาป้อน เงินสินบนสูงสุด\");\r\n");
      out.write("  //frmvalidator.addValidation(\"bribe_limit\",\"numeric\");\r\n");
      out.write("  frmvalidator.addValidation(\"reward_limit\",\"req\",\"กรุณาป้อน เงินรางวัลสูงสุด\");\r\n");
      out.write("  //frmvalidator.addValidation(\"reward_limit\",\"numeric\");\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tlegislation();\r\n");
      out.write("\tgetDutyTable('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\tproducttype('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.type_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("</script>\r\n");
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
    _jspx_th_c_005furl_005f0.setValue("/process?action=ConfigShareMoneyPercent&cmd=create");
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
    _jspx_th_c_005furl_005f1.setValue("/process?action=ConfigShareMoneyPercent&cmd=save");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    _jspx_th_c_005furl_005f2.setValue("/process?action=ConfigShareMoneyPercent");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    _jspx_th_c_005furl_005f3.setValue("/process?action=ConfigShareMoneyPercent&cmd=add");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
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
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listLegis}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("legis");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t  \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${legis.legislation_code }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${legis.legislation_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${legis.legislation_code == lgCode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configMoneyEdit.isnotice == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("checked=\"checked\"");
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
