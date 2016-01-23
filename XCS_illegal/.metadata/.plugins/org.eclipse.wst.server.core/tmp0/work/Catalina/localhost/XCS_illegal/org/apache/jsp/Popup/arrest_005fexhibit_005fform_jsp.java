package org.apache.jsp.Popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;

public final class arrest_005fexhibit_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Templates/meta.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>บัญชีสิ่งของ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\" src=\"js/gen_validatorv31.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\" src=\"js/JScript.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\" src=\"script/jquery.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\" src=\"script/jquery.maskedinput-1.2.2.js\"></script>\r\n");
      out.write("<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'></script>\r\n");
      out.write("<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Demo.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Pke_Compare.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/SelectRegion.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/FileUploader.js'></script>\r\n");
      out.write("<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("'></script>\r\n");
      out.write("<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("'></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var opener = window.dialogArguments;\r\n");
      out.write("var dummy1=\"\";\r\n");
      out.write("var dummy2=\"\";\r\n");
      out.write("var dummy3=\"\";\r\n");
      out.write("var dummy4=\"\";\r\n");
      out.write("\r\n");
      out.write("var row = opener.dueditrow ;\r\n");
      out.write("row = row - 1;\r\n");
      out.write("var data = new Array();\r\n");
      out.write("var prb=opener.document.dataform.legislation_id.value;\r\n");
      out.write("\r\n");
      out.write("for(i=0;i<=34;i++){\r\n");
      out.write("\tdata[i]=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("function cancleedit(){\r\n");
      out.write("\tif(opener.dueditna == 1){\r\n");
      out.write("\t\tupdate();}else{\r\n");
      out.write("\r\n");
      out.write("document.formdata1.reset()\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t \r\n");
      out.write("}\r\n");
      out.write("function productopenmodal(){\r\n");
      out.write("\tif(document.formdata1.duty_code.value != \"\")\r\n");
      out.write("\t\twindow.showModalDialog('process?action=Product_pop&cmd=list&p=Y&duty=' + document.getElementById(\"dutyTable\").options.value + '&group_id=' + document.getElementById('group_id').value + '&textCode=product_code&textName=product_name' , self , 'dialogWidth=700px,Height=400px');\r\n");
      out.write("\telse{\r\n");
      out.write("\t\talert(\"กรุณาเลือกชนิดสินค้า\");\r\n");
      out.write("\t\tdocument.formdata1.duty_code.focus();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function brandopenmodal()\r\n");
      out.write("{\r\n");
      out.write("\tif(document.formdata1.group_id.value != \"\")\r\n");
      out.write("\t\twindow.showModalDialog('process?action=Brand_pop&cmd=list&p=Y&duty='+document.getElementById('dutyTable').options.value+ '&group_id=' + document.getElementById('group_id').value +'&textCode=brand_code&textName=brand_name' , self , 'dialogWidth=700px,Height=400px');\r\n");
      out.write("\telse{\r\n");
      out.write("\t\talert(\"กรุณาเลือกหมวดสินค้า\");\r\n");
      out.write("\t\tdocument.formdata1.group_id.focus();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function test(){\r\n");
      out.write("\tif(document.formdata1.isexhibitco.checked==true){\r\n");
      out.write("\t\tdata[1]=\"Y\";\r\n");
      out.write("\t\tsaveto();\r\n");
      out.write("\t}else if(document.formdata1.onsubmit()!=false){\r\n");
      out.write("\t    saveto();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tfunction update(){\r\n");
      out.write("\t\tdata[8]=\"Z\"\r\n");
      out.write("\t\tdata[15]=\"1\";\r\n");
      out.write("\t\tdata[24]=\"\";\r\n");
      out.write("\t\tdata[23]=\"\";\r\n");
      out.write("\t\tdata[22]=\"\";\r\n");
      out.write("\t\tdata[21]=\"\";\r\n");
      out.write("\r\n");
      out.write("\t\tif(opener.dueditna == 1){\r\n");
      out.write("\t\t\tdocument.formdata1.isexhibitco.disabled=true;\r\n");
      out.write("\t\t\tif(opener.dumaxrow != 2){\r\n");
      out.write("\t\t\t\t//alert(\"aaaaaa\");\r\n");
      out.write("\t\t\t\tif(opener.document.dataform.aae_isexhibitco[row].value == \"Y\"){\r\n");
      out.write("\t\t\t\t\tdocument.formdata1.isexhibitco.checked=true;\r\n");
      out.write("\t\t\t\t\tdata[1]= \"Y\";\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tdata[1]= \"N\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tdata[2]=document.formdata1.duty_code.value = opener.document.dataform.aae_duty_code[row].value;\r\n");
      out.write("\t\t\t\tdata[3]= opener.document.dataform.aae_duty_name[row].value;\r\n");
      out.write("\t\t\t\tdata[4]=document.formdata1.product_code.value = opener.document.dataform.aae_product_code[row].value;\r\n");
      out.write("\t\t\t\tdata[5]=document.formdata1.product_name.value = opener.document.dataform.aae_product_name[row].value;\r\n");
      out.write("\t\t\t\tdata[6]=document.formdata1.brand_code.value = opener.document.dataform.aae_brand_code[row].value;\r\n");
      out.write("\t\t\t\tdata[7]=document.formdata1.brand_name.value = opener.document.dataform.aae_brand_name[row].value;\r\n");
      out.write("\t\t\t\tdata[8] = opener.document.dataform.aae_isdomestic[row].value;\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\tfor (var i=0; i < document.formdata1.isdomestic.length; i++) {\r\n");
      out.write("\t\t\t\t\tif (document.formdata1.isdomestic[i].value == opener.document.dataform.aae_isdomestic[row].value) {\r\n");
      out.write("\t\t\t\t\t\tdocument.formdata1.isdomestic[i].checked = true;}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t//data[9]=document.formdata1.sizes_code.value = opener.document.dataform.aae_sizes_code[row].value;\r\n");
      out.write("\t\t\t\tdata[10]=document.formdata1.sizes_unit_code.value = opener.document.dataform.aae_sizes_unit_code[row].value;\r\n");
      out.write("\t\t\t\tdata[11]=document.formdata1.qty.value = opener.document.dataform.aae_qty[row].value;\r\n");
      out.write("\t\t\t\tdata[12]=document.formdata1.qty_unit_code.value = opener.document.dataform.aae_qty_unit_code[row].value;\r\n");
      out.write("\t\t\t\tdata[13]=document.formdata1.netweight.value = opener.document.dataform.aae_netweight[row].value;\r\n");
      out.write("\t\t\t\tdata[14]=document.formdata1.netweight_unit_code.value = opener.document.dataform.aae_netweight_unit_code[row].value;\r\n");
      out.write("\t\t\t\tfor (var i=0; i < document.formdata1.status.length; i++) {\r\n");
      out.write("\t\t\t\t\tif (document.formdata1.status[i].value == opener.document.dataform.aae_status[row].value) {\r\n");
      out.write("\t\t\t\t\t\tdocument.formdata1.status[i].checked = true;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tdata[15]=document.formdata1.status.value = opener.document.dataform.aae_status[row].value;\r\n");
      out.write("\t\t\t\tdata[16]=document.formdata1.exhibit_list.value = opener.document.dataform.aae_exhibit_list[row].value;\r\n");
      out.write("\t\t\t\tdata[17]=document.formdata1.exhibit_desc.value = opener.document.dataform.aae_exhibit_desc[row].value;\r\n");
      out.write("\t\t\t\tdata[18]=document.formdata1.car_no.value = opener.document.dataform.aae_car_no[row].value;\r\n");
      out.write("\t\t\t\tdata[19]=document.formdata1.remarks.value = opener.document.dataform.aae_remarks[row].value;\r\n");
      out.write("\t\t\t\tdata[20]=document.formdata1.id.value = opener.document.dataform.aae_id[row].value;\r\n");
      out.write("\t\t\t\tdata[21]= document.formdata1.sizes_desc.value = opener.document.dataform.aae_sizes_code_text[row].value;\r\n");
      out.write("\t\t\t\tdata[22]= opener.document.dataform.aae_sizes_unit_code_text[row].value;\r\n");
      out.write("\t\t\t\tdata[23]= opener.document.dataform.aae_qty_unit_code_text[row].value;\r\n");
      out.write("\t\t\t\tdata[24]= opener.document.dataform.aae_netweight_unit_code_text[row].value;\r\n");
      out.write("\t\t\t\tdata[25]= opener.document.dataform.aae_case_id[row].value;\r\n");
      out.write("\t\t\t\tdata[26]=document.formdata1.co_id.value= opener.document.dataform.aae_co_id[row].value;\r\n");
      out.write("\t\t\t\tdata[27]=document.formdata1.group_id.value = opener.document.dataform.aae_group_id[row].value;\r\n");
      out.write("\t\t\t\tdata[28] = opener.document.dataform.aae_group_name[row].value;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (opener.document.dataform.aae_isexhibitco.value == \"Y\") {\r\n");
      out.write("\t\t\t\t\tdocument.formdata1.sizes_code[i].selected = true;\r\n");
      out.write("\t\t\t\t\tdata[1]= \"Y\";\r\n");
      out.write("\t\t\t\t}else{data[1]= \"N\";}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//alert(\"update\");\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\tdata[2]=document.formdata1.duty_code.value = opener.document.dataform.aae_duty_code.value;\r\n");
      out.write("\t\t\t\tdata[3]=dummy1 = opener.document.dataform.aae_duty_name.value;\r\n");
      out.write("\t\t\t\tdata[4]=document.formdata1.product_code.value = opener.document.dataform.aae_product_code.value;\r\n");
      out.write("\t\t\t\tdata[5]=document.formdata1.product_name.value = opener.document.dataform.aae_product_name.value;\r\n");
      out.write("\t\t\t\tdata[6]=document.formdata1.brand_code.value = opener.document.dataform.aae_brand_code.value;\r\n");
      out.write("\t\t\t\tdata[7]=document.formdata1.brand_name.value = opener.document.dataform.aae_brand_name.value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\tfor (var i=0; i < document.formdata1.isdomestic.length; i++) {\r\n");
      out.write("\t\t\t\t\tif (document.formdata1.isdomestic[i].value == opener.document.dataform.aae_isdomestic.value) {\r\n");
      out.write("\t\t\t\t\t\tdocument.formdata1.isdomestic[i].checked = true;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdata[8] = opener.document.dataform.aae_isdomestic.value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t//data[9]=document.formdata1.sizes_code.value = opener.document.dataform.aae_sizes_code.value;\r\n");
      out.write("\t\t\t\tdata[10]=document.formdata1.sizes_unit_code.value = opener.document.dataform.aae_sizes_unit_code.value;\r\n");
      out.write("\t\t\t\tdata[11]=document.formdata1.qty.value = opener.document.dataform.aae_qty.value;\r\n");
      out.write("\t\t\t\tdata[12]=document.formdata1.qty_unit_code.value = opener.document.dataform.aae_qty_unit_code.value;\r\n");
      out.write("\t\t\t\tdata[13]=document.formdata1.netweight.value = opener.document.dataform.aae_netweight.value;\r\n");
      out.write("\t\t\t\tdata[14]=document.formdata1.netweight_unit_code.value = opener.document.dataform.aae_netweight_unit_code.value;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\tfor (var i=0; i < document.formdata1.status.length; i++) {\r\n");
      out.write("\t\t\t\t\tif (document.formdata1.status[i].value == opener.document.dataform.aae_status.value) {\r\n");
      out.write("\t\t\t\t\t\tdocument.formdata1.status[i].checked = true;}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tdata[15] = opener.document.dataform.aae_status.value;\r\n");
      out.write("\t\t\t\tdata[16]=document.formdata1.exhibit_list.value = opener.document.dataform.aae_exhibit_list.value;\r\n");
      out.write("\t\t\t\tdata[17]=document.formdata1.exhibit_desc.value = opener.document.dataform.aae_exhibit_desc.value;\r\n");
      out.write("\t\t\t\tdata[18]=document.formdata1.car_no.value = opener.document.dataform.aae_car_no.value;\r\n");
      out.write("\t\t\t\tdata[19]=document.formdata1.remarks.value = opener.document.dataform.aae_remarks.value;\r\n");
      out.write("\t\t\t\tdata[20]=document.formdata1.id.value = opener.document.dataform.aae_id.value;\r\n");
      out.write("\t\t\t\tdata[21] = document.formdata1.sizes_desc.value = opener.document.dataform.aae_sizes_code_text.value;\r\n");
      out.write("\t\t\t\tdata[22] = opener.document.dataform.aae_sizes_unit_code_text.value;\r\n");
      out.write("\t\t\t\tdata[23] = opener.document.dataform.aae_qty_unit_code_text.value;\r\n");
      out.write("\t\t\t\tdata[24] = opener.document.dataform.aae_netweight_unit_code_text.value;\r\n");
      out.write("\t\t\t\tdata[25] = opener.document.dataform.aae_case_id.value;\r\n");
      out.write("\t\t\t\tdata[26]=document.formdata1.co_id.value= opener.document.dataform.aae_co_id.value;\r\n");
      out.write("\t\t\t\tdata[27]=document.formdata1.group_id.value = opener.document.dataform.aae_group_id.value;\r\n");
      out.write("\t\t\t\tdata[28] = opener.document.dataform.aae_group_name.value;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdata[27] = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tgetGroupID('group_id',data[27],'sizePackage',data[9]);\t\t\r\n");
      out.write("\t\tgetDutyTable('dutyTable',data[27],data[2]);\r\n");
      out.write("\t\tgetDutyUnit(data[27],\"QTY\",\"qty_unit_code\",data[12]);\r\n");
      out.write("  \t\tgetDutyUnit(data[27],\"SIZES\",\"sizes_unit_code\",data[10]);\r\n");
      out.write("  \t\tgetDutyUnit(data[27],\"NETWEIGHT\",\"netweight_unit_code\",data[14]);\r\n");
      out.write("\r\n");
      out.write("  \t\t//validateDecimal3(document.formdata1.sizes_desc);\r\n");
      out.write("  \t\t//validateDecimal3(document.formdata1.netweight);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("function saveto(){\r\n");
      out.write("\r\n");
      out.write(" if(document.formdata1.isexhibitco.checked==false){\r\n");
      out.write("\t\tdata[1]=\"N\";\r\n");
      out.write("\t\tdata[2]=document.formdata1.duty_code.value;\r\n");
      out.write("\t\t//data[3]=document.formdata1.duty_name.value;\r\n");
      out.write("\t\tdata[4]=document.formdata1.product_code.value;\r\n");
      out.write("\t\tdata[5]=document.formdata1.product_name.value;\r\n");
      out.write("\t\tdata[6]=document.formdata1.brand_code.value;\r\n");
      out.write("\t\tdata[7]=document.formdata1.brand_name.value;\r\n");
      out.write("\t\t//data[8]=document.formdata1.isdomestic.value;\r\n");
      out.write("\t\t//data[9]=document.formdata1.sizes_code.value;\r\n");
      out.write("\t\tdata[10]=document.formdata1.sizes_unit_code.value;\r\n");
      out.write("\t\tdata[11]=document.formdata1.qty.value;\r\n");
      out.write("\t\tdata[12]=document.formdata1.qty_unit_code.value;\r\n");
      out.write("\t\tdata[13]=document.formdata1.netweight.value;\r\n");
      out.write("\t\tdata[14]=document.formdata1.netweight_unit_code .value;\r\n");
      out.write("\t\t//data[15]=document.formdata1.status.value;\r\n");
      out.write("\t\tdata[16]=document.formdata1.exhibit_list.value;\r\n");
      out.write("\t\tdata[17]=document.formdata1.exhibit_desc.value;\r\n");
      out.write("\t\t//alert(data[17]);\r\n");
      out.write("\t\tdata[18]=document.formdata1.car_no.value;\r\n");
      out.write("\t\tdata[19]=document.formdata1.remarks.value;\r\n");
      out.write("\t\t//data[20]=opener.document.dataform.aae_id.value;\r\n");
      out.write("\t\tdata[21] = document.formdata1.sizes_desc.value;\r\n");
      out.write("\t\t//data[22] = opener.document.dataform.aae_sizes_unit_code_text.value;\r\n");
      out.write("\t\t//data[23]= opener.document.dataform.aae_qty_unit_code_text.value;\r\n");
      out.write("\t\t//data[24] = opener.document.dataform.aae_netweight_unit_code_text.value;\r\n");
      out.write("\t\tdata[26]=document.formdata1.co_id.value;\r\n");
      out.write("\t\tdata[27]=document.formdata1.group_id.value;\r\n");
      out.write("\t}\r\n");
      out.write("\twindow.returnValue = data;\r\n");
      out.write("\twindow.close();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function upchg(){\r\n");
      out.write("\r\n");
      out.write("       if (data[4]!=null){\r\n");
      out.write("\t\t\tdata[1] =\"Y\";\r\n");
      out.write("\t\r\n");
      out.write("\t\t\tdocument.formdata1.duty_code1.value = data[2];\r\n");
      out.write("\t\t\tdocument.formdata1.product_code1.value = data[4];\r\n");
      out.write("\t\t\tdocument.formdata1.product_name1.value = data[5];\r\n");
      out.write("\t\t\tdocument.formdata1.brand_code1.value = data[6];\r\n");
      out.write("\t\t\tdocument.formdata1.brand_name1.value = data[7];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfor (var i=0; i < document.formdata1.isdomestic1.length; i++) {\r\n");
      out.write("\t\t\t\tif (document.formdata1.isdomestic1[i].value == trim(data[8])) {\r\n");
      out.write("\t\t\t\t\tdocument.formdata1.isdomestic1[i].checked = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.formdata1.sizes_code1.value = data[9];\r\n");
      out.write("\t\t\tdocument.formdata1.sizes_unit_code1.value = data[10];\r\n");
      out.write("\t\t\tdocument.formdata1.qty1.value = data[11];\r\n");
      out.write("\t\t\tdocument.formdata1.qty_unit_code1.value = data[12];\r\n");
      out.write("\t\t\tdocument.formdata1.netweightshow1.value = data[13]+\" \"+data[24];\r\n");
      out.write("\t\t\tdocument.formdata1.netweight_unit_code1.value = data[14];\r\n");
      out.write("\t\t\tfor (var i=0; i < document.formdata1.status1.length; i++) {\r\n");
      out.write("\t\t\t\tif (document.formdata1.status1[i].value == data[15]) \r\n");
      out.write("\t\t\t\t\tdocument.formdata1.status1[i].checked = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tdocument.formdata1.status1.value = data[15];\r\n");
      out.write("\t\t\tdocument.formdata1.exhibit_list1.value = data[16];\r\n");
      out.write("\t\t\tdocument.formdata1.exhibit_desc1.value = data[17];\r\n");
      out.write("\t\t\tdocument.formdata1.car_no1.value = data[18];\r\n");
      out.write("\t\t\tdocument.formdata1.remarks1.value = data[19];\r\n");
      out.write("\t\t\tdocument.formdata1.co_id.value= data[26];\r\n");
      out.write("\t\t\tdocument.formdata1.sizes_desc.value=data[21];\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function ClearProduct(){\r\n");
      out.write("\t//dwr.util.setValue(document.formdata1.group_id,\"\");\r\n");
      out.write("\tdwr.util.setValue(document.formdata1.product_code,\"\");\r\n");
      out.write("\tdwr.util.setValue(document.formdata1.product_name,\"\");\r\n");
      out.write("\tdwr.util.setValue(document.formdata1.brand_code,\"\");\r\n");
      out.write("\tdwr.util.setValue(document.formdata1.brand_name,\"\");\r\n");
      out.write("}\r\n");
      out.write("</script >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"../js/rollimage.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"../js/menu.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("  function toggle() {\r\n");
      out.write("   if( document.getElementById(\"chkIsExhibitCo\").checked ==false ){\r\n");
      out.write("    document.getElementById(\"isNoneExhibitCo\").style.display = '';\r\n");
      out.write("    document.getElementById(\"isExhibitCoy\").style.display = 'none';\r\n");
      out.write("   }else{\r\n");
      out.write("    document.getElementById(\"isNoneExhibitCo\").style.display = 'none';\r\n");
      out.write("    document.getElementById(\"isExhibitCoy\").style.display = '';\r\n");
      out.write("   }\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  function getDutyTable(id,group_idVal,dutyTable_sel){\r\n");
      out.write("  \tDutyTable.getDutyTable(group_idVal,function(data){\r\n");
      out.write("  \t\tdwr.util.removeAllOptions(id);\r\n");
      out.write("  \t\tdwr.util.addOptions(id,{\"\":\"โปรดเลือก\"});\r\n");
      out.write("  \t\tdwr.util.addOptions(id,data,\"duty_code\",\"duty_name\");\r\n");
      out.write("  \t\tdwr.util.setValue(id,dutyTable_sel);\r\n");
      out.write("  \t});\r\n");
      out.write("  }\r\n");
      out.write("  function getSizePackage(group_idVal,id,sizePackage_sel){\r\n");
      out.write("  \tDutyGroup.getSizePackage(group_idVal,function(data){\r\n");
      out.write("  \t\tdwr.util.removeAllOptions(id);\r\n");
      out.write("  \t\tdwr.util.addOptions(id,{\"\":\"โปรดเลือก\"});\r\n");
      out.write("  \t\tdwr.util.addOptions(id,data,\"size_code\",\"size_desc\");\r\n");
      out.write("  \t\tdwr.util.setValue(id,sizePackage_sel);\r\n");
      out.write("  \t});\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \tfunction getGroupID(id,groupID_sel,packageSize_id,sizePackage_sel){\r\n");
      out.write("\t\tDutyGroup.getDutyGroup(function(data){\r\n");
      out.write("\t\t\tdwr.util.addOptions(id,{\"\":\"โปรดเลือก\"});\r\n");
      out.write("\t\t\tdwr.util.addOptions(id,data,\"group_id\",\"group_name\");\r\n");
      out.write("\t\t\tdwr.util.setValue(id,groupID_sel);\r\n");
      out.write("\t\t\tgetSizePackage(groupID_sel,packageSize_id,sizePackage_sel);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("  function getDutyUnit(vGroupID,vUsedFor, cmbUnit, vUnitCode){\r\n");
      out.write("\tDutyGroup.getDutyUnit(vGroupID,vUsedFor,function(data){\r\n");
      out.write("\t\tdwr.util.removeAllOptions(cmbUnit);\r\n");
      out.write("\t\tdwr.util.addOptions(cmbUnit,{\"\":\"โปรดเลือก\"});\r\n");
      out.write("\t\tdwr.util.addOptions(cmbUnit,data,\"unit_code\",\"unit_name\");\r\n");
      out.write("\t\tdwr.util.setValue(cmbUnit,vUnitCode);\r\n");
      out.write("\t});\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function validateDecimal2(txtNum){\r\n");
      out.write("\t\tif(txtNum.value != \"\"){\r\n");
      out.write("\t\t\tvar data = parseFloat(txtNum.value);\r\n");
      out.write("\t\t\t$(txtNum).val(data.toFixed(2));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t  }\r\n");
      out.write("\r\n");
      out.write("  function validateDecimal3(txtNum){\r\n");
      out.write("\tif(txtNum.value != \"\"){\r\n");
      out.write("\t\tvar data = parseFloat(txtNum.value);\r\n");
      out.write("\t\t$(txtNum).val(data.toFixed(3));\r\n");
      out.write("\t}\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("<!--  $(document).ready(function () {-->\r\n");
      out.write("<!--      $('#sizes_desc').blur(function () {-->\r\n");
      out.write("<!--          var data = parseFloat(this.value);-->\r\n");
      out.write("<!--          $(this).val(data.toFixed(3));-->\r\n");
      out.write("<!--      });-->\r\n");
      out.write("<!--  });-->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form name=\"formdata1\" id=\"formdata1\">\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"95%\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><span class=\"websitename\" >บัญชีสิ่งของ</span></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><hr /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<input name=\"btnSave\"  type=\"button\" class=\"barbutton\" value=\"บันทึก\" onClick=\"test();\">\r\n");
      out.write("\t\t\t<input name=\"btnCancel\"  type=\"button\" class=\"barbutton\" value=\"ยกเลิกการแก้ไข\" onClick = \"cancleedit()\" >\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><hr /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td>&nbsp;\r\n");
      out.write("       \t\t<input type=\"hidden\" name=\"co_id\"/>\r\n");
      out.write("       \t\t<input type=\"hidden\" name=\"legislation_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("       </td>\r\n");
      out.write("       <td><input type=\"checkbox\" id=\"chkIsExhibitCo\" name =\"isexhibitco\" onclick=\"toggle();\" value=\"1\" />ของกลางร่วม</td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tbody id=\"isExhibitCoy\" style=\"display: none\">\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td align=\"right\">เลขที่คดี :&nbsp;</td>\r\n");
      out.write("         <td>\r\n");
      out.write("\r\n");
      out.write("           <input type=\"text\" name=\"track_no_co1\"class=\"textView\" size=\"15\" onKeyPress=\"window.event.keyCode = 0\" onKeyDown=\"disableKeyDown();\"/>\r\n");
      out.write("           <img src=\"images/btn_browse.png\" alt=\"\" width=\"23\" height=\"22\" style=\"cursor:hand;\"\r\n");
      out.write("           onClick=\"window.showModalDialog('process?action=Case_pop&legislation_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("' , self  , 'dialogWidth=700px,dialogHeight=600px');upchg();\">\r\n");
      out.write("           <font style=\"color:red\">*</font>\r\n");
      out.write("         </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">ประเภทของกลาง :&nbsp;</td>\r\n");
      out.write("            <td >\r\n");
      out.write("                 <input id=\"group_id1\" name=\"group_id1\" type=\"text\" class=\"textView\" value=\"\" size=\"\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("                 <input id=\"group_name1\" name=\"group_name1\" type=\"text\" class=\"textView\" value=\"\" size=\"\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">ชนิดของกลาง :&nbsp;</td>\r\n");
      out.write("            <td >\r\n");
      out.write("                 <input id=\"duty_code1\" name=\"duty_code1\" type=\"text\" class=\"textView\" value=\"\" size=\"\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("                 <input id=\"duty_name1\" name=\"duty_name1\" type=\"text\" class=\"textView\" value=\"\" size=\"\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr style=\"display:none\">\r\n");
      out.write("            <td  align=\"right\">ชื่อสินค้า :&nbsp;</td>\r\n");
      out.write("            <td >\r\n");
      out.write("                 <input id=\"product_code1\" name=\"product_code1\" type=\"text\" class=\"textView\" value=\"\" size=\"\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("                 <input id=\"product_name1\" name=\"product_name1\" type=\"text\" class=\"textView\" value=\"\" size=\"\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">ยี่ห้อ :&nbsp;</td>\r\n");
      out.write("            <td >\r\n");
      out.write("                 <input id=\"brand_code1\" name=\"brand_code1\" type=\"text\" class=\"textView\" value=\"\" size=\"\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("                 <input id=\"brand_name1\" name=\"brand_name1\" type=\"text\" class=\"textView\" value=\"\" size=\"\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\">\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">&nbsp;</td>\r\n");
      out.write("            <td >\r\n");
      out.write("              <input type=\"radio\" name=\"isdomestic1\" value=\"I\" checked disabled />ในประเทศ&nbsp;&nbsp;&nbsp;\r\n");
      out.write("              <input type=\"radio\" name=\"isdomestic1\" value=\"O\" disabled />ต่างประเทศ&nbsp;&nbsp;&nbsp;\r\n");
      out.write("              <input type=\"radio\" name=\"isdomestic1\" value=\"Z\" disabled />ไม่ระบุ\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td align=\"right\">ขนาดบรรจุ :&nbsp;</td>\r\n");
      out.write("            <td >\r\n");
      out.write("              <input id=\"sizesshow1\" name=\"sizesshow1\" type=\"text\" class=\"textView\"  size=\"15\" value=\"\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"/>\r\n");
      out.write("              <input id=\"sizes_code1\" name=\"sizes_code1\" type=\"hidden\"  />\r\n");
      out.write("              <input id=\"sizes_unit_code1\" name=\"sizes_unit_code1\" type=\"hidden\"  />\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td align=\"right\">จำนวน :&nbsp;</td>\r\n");
      out.write("            <td >\r\n");
      out.write("              <input id=\"qtyshow1\" name=\"qtyshow1\" type=\"text\" class=\"textView\"  size=\"15\" value=\"\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"/>\r\n");
      out.write("              <input id=\"qty1\" name=\"qty1\" type=\"hidden\"  />\r\n");
      out.write("              <input id=\"qty_unit_code1\" name=\"qty_unit_code1\" type=\"hidden\"  />\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td align=\"right\">ปริมาณสุทธิ :&nbsp;</td>\r\n");
      out.write("            <td >\r\n");
      out.write("              <input id=\"netweightshow1\" name=\"netweightshow1\" type=\"text\" class=\"textView\"  size=\"15\" value=\"\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"/>\r\n");
      out.write("              <input id=\"netweight1\" name=\"netweight1\" type=\"hidden\"  />\r\n");
      out.write("              <input id=\"netweight_unit_code1\" name=\"netweight_unit_code1\" type=\"hidden\"  />\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td align=\"right\">สถานะของกลาง :&nbsp;</td>\r\n");
      out.write("            <td >ยึด<input id=\"status1\" name=\"status1\" type=\"hidden\" ></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">รายการของกลาง :&nbsp;</td>\r\n");
      out.write("            <td ><input id=\"exhibit_list1\" name=\"exhibit_list1\" type=\"text\" class=\"textView\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"45\"  maxlength=\"20\"></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">รายละเอียด :&nbsp;</td>\r\n");
      out.write("            <td ><input id=\"exhibit_desc1\" name=\"exhibit_desc1\" type=\"text\" class=\"textView\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"45\"  maxlength=\"20\"></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">ทะเบียนรถ :&nbsp;</td>\r\n");
      out.write("            <td ><input id=\"car_no1\" name=\"car_no1\" type=\"text\" class=\"textView\"  size=\"45\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" maxlength=\"20\"></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">หมายเหตุ :&nbsp;</td>\r\n");
      out.write("            <td ><input id=\"remarks1\" name=\"remarks1\" type=\"text\" class=\"textView\"  size=\"45\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" maxlength=\"20\"></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("     </tbody>\r\n");
      out.write("     <tbody id=\"isNoneExhibitCo\">\r\n");
      out.write("     \t<tr>\r\n");
      out.write("     \t\t<td height=\"25\" align=\"right\">ประเภทของกลาง :&nbsp;</td>\r\n");
      out.write("     \t\t<td>\r\n");
      out.write("     \t\t\t<select id=\"group_id\" name=\"group_id\" style=\"width:300px\"\r\n");
      out.write("     \t\t\t onChange=\"data[3]='';data[28]=document.formdata1.group_id.options[selectedIndex].text.replace(this.value+'-','');\r\n");
      out.write("     \t\t\t getDutyTable('dutyTable',this.value);ClearProduct();\r\n");
      out.write("     \t\t\t getDutyUnit(this.value,'SIZES','sizes_unit_code','');\r\n");
      out.write("     \t\t\t getDutyUnit(this.value,'QTY','qty_unit_code','');\r\n");
      out.write("     \t\t\t getDutyUnit(this.value,'NETWEIGHT','netweight_unit_code','');\" >\r\n");
      out.write("     \t\t\t</select>\r\n");
      out.write("     \t\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("     \t\t</td>\r\n");
      out.write("     \t</tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("\t\t<td  height=\"25\" align=\"right\">ชนิดของกลาง :&nbsp;</td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("\t\t\t<select name=\"duty_code\" id=\"dutyTable\"  style=\"width:300px;\" \r\n");
      out.write("\t\t\t  onChange=\"data[3]=document.formdata1.duty_code.options[selectedIndex].text.replace(this.value+'-','');ClearProduct();\">\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">&nbsp;</td>\r\n");
      out.write("          <td >\r\n");
      out.write("            <input type=\"radio\" name=\"isdomestic\" value=\"I\" onClick='data[8]=\"I\"'/>ในประเทศ&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input type=\"radio\" name=\"isdomestic\" value=\"O\" onClick='data[8]=\"O\"'/>ต่างประเทศ&nbsp;&nbsp;&nbsp;\r\n");
      out.write("            <input type=\"radio\" name=\"isdomestic\" value=\"Z\" onClick='data[8]=\"Z\"' checked />ไม่ระบุ\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr style=\"display:none\">\r\n");
      out.write("          <td  align=\"right\">ชื่อสินค้า :&nbsp;</td>\r\n");
      out.write("          <td >\r\n");
      out.write("               <input name=\"product_code\" id=\"product_code\" type=\"text\" size=\"10\" />\r\n");
      out.write("               <img src=\"images/btn_browse.png\" alt=\"\" width=\"22\" height=\"22\" border=\"0\" style=\"cursor:hand\" onClick=\"productopenmodal()\" />\r\n");
      out.write("               <input name=\"product_name\" id=\"product_name\" type=\"text\" size=\"25\" />\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">ยี่ห้อ :&nbsp;</td>\r\n");
      out.write("          <td >\r\n");
      out.write("               <input id=\"brand_code\" name=\"brand_code\" type=\"text\" size=\"10\" />\r\n");
      out.write("               <img src=\"images/btn_browse.png\" alt=\"\" width=\"22\" height=\"22\" border=\"0\" style=\"cursor:hand\" onClick=\"brandopenmodal();\" />\r\n");
      out.write("               <input id=\"brand_name\" name=\"brand_name\" type=\"text\" size=\"25\" />\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td align=\"right\">ขนาดบรรจุ :&nbsp;</td>\r\n");
      out.write("          <td >\r\n");
      out.write("          \t\t<input type=\"text\" class=\"textNum\"  name=\"sizes_desc\" id=\"sizes_desc\" size=\"11\" onkeypress=\"ChkMinusDbl(this);\"  />&nbsp;\r\n");
      out.write("<!--\t          <select name=\"sizes_code\" id=\"sizePackage\"  onChange=\"data[21]=document.formdata1.sizes_code.options[selectedIndex].text\">&nbsp;-->\r\n");
      out.write("<!--\t          </select>-->\r\n");
      out.write("              \tหน่วย :\r\n");
      out.write("               <select name=\"sizes_unit_code\" id=\"sizes_unit_code\" class=\"select\" onChange='data[22]=document.formdata1.sizes_unit_code.options[selectedIndex].text'>\r\n");
      out.write("                    <option  value=\"\" selected>เลือก</option>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               </select>\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td align=\"right\">จำนวน :&nbsp;</td>\r\n");
      out.write("          <td >\r\n");
      out.write("\t\t\t\t<input name=\"qty\" id=\"qty\" type=\"text\" class=\"textNum\"   size=\"11\" onkeypress=\"ChkMinusInt(this);\"/>&nbsp;\r\n");
      out.write("               หน่วย :\r\n");
      out.write("               <select name=\"qty_unit_code\" id=\"qty_unit_code\" class=\"select\" onChange='data[23]=document.formdata1.qty_unit_code.options[selectedIndex].text'>\r\n");
      out.write("                    <option  value=\"\" selected>เลือก</option>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               </select>\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td align=\"right\">ปริมาณสุทธิ :&nbsp;</td>\r\n");
      out.write("          <td >\r\n");
      out.write("\t\t\t\t<input name=\"netweight\" id=\"netweight\" type=\"text\" class=\"textNum\"   onkeypress=\"ChkMinusDbl(this);\" size=\"11\" />&nbsp;\r\n");
      out.write("               หน่วย :\r\n");
      out.write("               <select name=\"netweight_unit_code\" id=\"netweight_unit_code\" class=\"select\" onChange='data[24]=document.formdata1.netweight_unit_code.options[selectedIndex].text;'>\r\n");
      out.write("                    <option  value=\"\" selected>เลือก</option>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               </select>\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td align=\"right\">สถานะของกลาง :&nbsp;</td>\r\n");
      out.write("          <td >\r\n");
      out.write("                    <input name=\"status\" type=\"radio\" value=\"1\" onClick='data[15]=\"1\"'checked>ยึด&nbsp;&nbsp;\r\n");
      out.write("                    <input name=\"status\" type=\"radio\" value=\"2\" onClick='data[15]=\"2\"' >คืน&nbsp;&nbsp;\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">รายการของกลาง :&nbsp;</td><!-- เดิมใช้คำว่า \"รายการของกลาง\" -->\r\n");
      out.write("          <td >\r\n");
      out.write("\t\t\t<input name=\"exhibit_list\" type=\"text\"  size=\"45\"  >\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">ขนาดดีกรี :&nbsp;</td> <!--  เดิมใช้คำว่า \"รายละเอียด\" -->\r\n");
      out.write("          <td ><input name=\"exhibit_desc\" type=\"text\" OnKeyPress=\"ChkMinusDbl(this);\" OnBlur=\"validateDecimal2(this);\" size=\"10\"   ></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">ทะเบียนรถ :&nbsp;</td>\r\n");
      out.write("          <td ><input name=\"car_no\" type=\"text\"  size=\"45\"  ></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">หมายเหตุ :&nbsp;</td>\r\n");
      out.write("          <td ><input name=\"remarks\" type=\"text\" size=\"45\"  ></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("     </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<script>\r\n");
      out.write("update();\r\n");
      out.write("\r\n");
      out.write("</script >\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//You should create the validator only after the definition of the HTML form\r\n");
      out.write("  var frmvalidator  = new Validator(\"formdata1\");\r\n");
      out.write("\r\n");
      out.write("  //frmvalidator.addValidation(\"product_code\",\"req\",\"กรุณาเลือกสินค้า\");\r\n");
      out.write("  frmvalidator.addValidation(\"group_id\",\"req\",\"กรุณาเลือกหมวดสินค้า\");\r\n");
      out.write("  //frmvalidator.addValidation(\"sizes_code\",\"req\",\"กรุณาเลือกขนาด\");\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
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
    _jspx_th_c_005furl_005f0.setValue("/dwr/interface/DutyTable.js");
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
    _jspx_th_c_005furl_005f1.setValue("/dwr/interface/DutyGroup.js");
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
    _jspx_th_c_005furl_005f2.setValue("/dwr/engine.js");
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
    _jspx_th_c_005furl_005f3.setValue("/dwr/util.js");
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
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unit_list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("unit1");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unit1.unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unit1.unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t \t");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unit_list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("unit1");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unit1.unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unit1.unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t \t");
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

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unit_list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f2.setVar("unit1");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unit1.unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unit1.unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t \t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }
}
