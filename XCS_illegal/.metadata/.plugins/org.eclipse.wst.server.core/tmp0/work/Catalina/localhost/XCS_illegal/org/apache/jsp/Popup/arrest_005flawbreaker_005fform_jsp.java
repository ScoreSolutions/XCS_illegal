package org.apache.jsp.Popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;

public final class arrest_005flawbreaker_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD>\r\n");
      out.write("<base target=\"_self\" />\r\n");
      out.write("<title>รายชื่อผู้กระทำผิด : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\" src=\"js/gen_validatorv31.js\"></script>\r\n");
      out.write("<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'></script>\r\n");
      out.write("<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("'></script>\r\n");
      out.write("<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("'></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"../js/rollimage.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"../js/menu.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\"></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/util.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Lawbreaker.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/engine.js'></script>\r\n");
      out.write("<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("'></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("var cdata = new Array();\r\n");
      out.write("\r\n");
      out.write("var opener = window.dialogArguments;\r\n");
      out.write("var row = opener.lawseditrow;\r\n");
      out.write("row = row - 1;\r\n");
      out.write("\r\n");
      out.write("for(i=0;i<=34;i++){\r\n");
      out.write("\tcdata[i]=\"\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function toggleLawbreakerType()\r\n");
      out.write("  {\r\n");
      out.write("    var cmbValue=document.getElementById(\"cmbLawBreakerType\").value;\r\n");
      out.write("    if(cmbValue ==\"1\"){\r\n");
      out.write("      document.getElementById(\"1\").style.display = '';\r\n");
      out.write("      document.getElementById(\"2\").style.display='none';\r\n");
      out.write("      document.getElementById(\"3\").style.display='none';\r\n");
      out.write("    }else if(cmbValue==\"2\"){\r\n");
      out.write("      document.getElementById(\"1\").style.display = 'none';\r\n");
      out.write("      document.getElementById(\"2\").style.display='';\r\n");
      out.write("      document.getElementById(\"3\").style.display='none';\r\n");
      out.write("    }else if(cmbValue==\"3\"){\r\n");
      out.write("      document.getElementById(\"1\").style.display = 'none';\r\n");
      out.write("      document.getElementById(\"2\").style.display='none';\r\n");
      out.write("      document.getElementById(\"3\").style.display='';\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var districtDB=\"\";\r\n");
      out.write("var subdistrictDB=\"\";\r\n");
      out.write("var provinceDB=\"\";\r\n");
      out.write("var forcese=\"\";\r\n");
      out.write("function appendOption(num,text,field)\r\n");
      out.write("{\r\n");
      out.write("\t  var elOptNew = document.createElement('option');\r\n");
      out.write("\t  elOptNew.text = text;\r\n");
      out.write("\t  elOptNew.value = num;\r\n");
      out.write("\t  var elSel = document.getElementById(field);\r\n");
      out.write("\r\n");
      out.write("\t  try {\r\n");
      out.write("\t    elSel.add(elOptNew, null); // standards compliant; doesn't work in IE\r\n");
      out.write("\t  }\r\n");
      out.write("\t  catch(ex) {\r\n");
      out.write("\t    elSel.add(elOptNew); // IE only\r\n");
      out.write("\t  }\r\n");
      out.write("\t  \r\n");
      out.write("      document.getElementById(field).selectedIndex =document.getElementById(field).length-1;\r\n");
      out.write("\t\t\t//alert (document.getElementById(field).options[document.getElementById(field).length-1].text\t);\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("var chValue;\r\n");
      out.write("function cancleedit(){\r\n");
      out.write("\t//if(opener.lawseditna == 1){\r\n");
      out.write("\t//\tupdate();\r\n");
      out.write("\t//}else{\r\n");
      out.write("\t//\tdocument.dataform.reset();\r\n");
      out.write("\t//}\r\n");
      out.write("\twindow.close();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function fncAlert(){\r\n");
      out.write("\tvar type;\r\n");
      out.write("\tvar selValue = document.getElementById(\"cmbLawBreakerType\").value;\r\n");
      out.write("\r\n");
      out.write("\tif (selValue == \"1\"){\r\n");
      out.write("\t\tchValue = document.getElementById(\"txtIDCardNo\").value;\r\n");
      out.write("\t\ttype=\"1\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif (selValue == \"2\"){\r\n");
      out.write("\t\tchValue = document.getElementById(\"txtPassPortNo\").value;\r\n");
      out.write("\t\ttype=\"2\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif (selValue == \"3\"){\r\n");
      out.write("\t\tchValue = document.getElementById(\"excise_reg_no\").value;\r\n");
      out.write("\t\ttype=\"3\";\r\n");
      out.write("  \t}\r\n");
      out.write("\r\n");
      out.write("\tif (chValue != \"\" && chValue.length < 13 && selValue == \"1\"){\r\n");
      out.write("   \t\talert('กรุณากรอกเลขบัตรประชาชนให้ครบ 13 หลัก');\r\n");
      out.write("   \t\tdocument.getElementById(\"txtIDCardNo\").select();\r\n");
      out.write("   \t\treturn false;\r\n");
      out.write("   \t}\r\n");
      out.write("\r\n");
      out.write("    if (chValue.length != 0){\r\n");
      out.write("\t\tLawbreaker.getByIdCard(type,chValue, function(data) {\r\n");
      out.write("\t\t\tif(data != null){\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"sex\",data.sex);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"nick_name\",data.title_code);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"nick_name2\",data.title_code);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"nick_name3\",data.title_code);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"txtIDCardNo\",data.lawbreaker_id_card);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"first_name\",data.first_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"last_name\",data.last_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"first_name2\",data.first_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"last_name2\",data.last_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"first_name3\",data.first_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"last_name3\",data.last_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"other_name\",data.other_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"home_number\",data.address_no);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"moo\",data.moo);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"soi\",data.soi);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"road\",data.road);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"cmbRace\",data.race_id);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"cmbNationality\",data.nation_id);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"career\",data.career);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"birthdate\",data.birth_date2);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"father_name\",data.father_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"mother_name\",data.father_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"excise_reg_no\",data.excise_reg_no);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"company_name\",data.company_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"company_title_code\",data.title_code_company);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"middle_name\",data.middle_name);\r\n");
      out.write("\t\t\t\tdwr.util.setValue(\"txtPassPortNo\",data.lawbreaker_passport);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif(data.ls_type == \"LAWBREAKER\"){\r\n");
      out.write("\t\t\t\t\tdwr.util.setValue(\"lawbreaker_no\", data.lawbreaker_no);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tcdata[3]  =  data.sex;\r\n");
      out.write("\t\t\t\tcdata[22]  = data.title_name ;\r\n");
      out.write("\t\t\t\tcdata[23]  = data.province_name ;\r\n");
      out.write("\t\t\t\tcdata[24]  = data.district_name;\r\n");
      out.write("\t\t\t\tcdata[25]  = data.subdistrict_name ;\r\n");
      out.write("\t\t\t\tcdata[26]  = data.race_id_name ;\r\n");
      out.write("\t\t\t\tcdata[27]  = data.nationality_id_name ;\r\n");
      out.write("\t\t\t\tif(data.birth_date2 != null){\r\n");
      out.write("\t   \t\t\t\tvar str=data.birth_date2.toString();\r\n");
      out.write("\t   \t\t\t\tstr = str.substring(6,10);\r\n");
      out.write("\t\t\t\t\tvar nu = new Date();\r\n");
      out.write("\t\t\t\t\tvar y1 =  parseInt(nu.getFullYear()+543);\r\n");
      out.write("\t\t\t\t\tvar y2 = parseInt(str);\r\n");
      out.write("\t   \t\t\t\tdwr.util.setValue(\"agecal\",y1-y2);\r\n");
      out.write("\t   \t\t\t}else{\r\n");
      out.write("\t       \t\t\tdwr.util.setValue(\"agecal\",\"\");\r\n");
      out.write("\t       \t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\tgetProvince('province','district','tambol',data.province_code,data.district_name,data.subdistrict_name);\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\tif(data.sex == 'M'){\r\n");
      out.write("\t\t\t\t\tdocument.dataform.sex[0].checked=true;\r\n");
      out.write("\t\t\t\t\tdocument.dataform.sex2[0].checked=true;\r\n");
      out.write("\t\t\t\t}else if(data.sex == 'F'){\r\n");
      out.write("\t\t\t\t\tdocument.dataform.sex[1].checked=true;\r\n");
      out.write("\t\t\t\t\tdocument.dataform.sex2[1].checked=true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\talert(\"ไม่พบเลขบัตรประจำตัวประชาชนนี้ในระบบ\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write(" \t\t});\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function calage(){\r\n");
      out.write("\t\tvar doc = document.dataform;\r\n");
      out.write("\t\tif(doc.birthdate.value!=\"\"){\r\n");
      out.write("\t\t\tvar str=doc.birthdate.value;\r\n");
      out.write("\t\t\tstr = str.substring(6,10);\r\n");
      out.write("\t\t\tvar nu = new Date();\r\n");
      out.write("\t\t\tvar y1 =  parseInt(nu.getFullYear()+543);\r\n");
      out.write("\t\t\tvar y2 = parseInt(str);\r\n");
      out.write("\t\r\n");
      out.write("\t\t\tdoc.agecal.value=y1-y2;\r\n");
      out.write("\t\t}else{doc.agecal.value=\"\";}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkIDcard(idCard){\r\n");
      out.write("\tvar id = idCard.value;\r\n");
      out.write("    var charId = (event.which) ? event.which : event.keyCode\r\n");
      out.write("    if (charId > 31 && (charId < 48 || charId > 57)) {\r\n");
      out.write("    \tevent.keyCode = 0;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkName(name){\r\n");
      out.write("\tvar id = name.value;\r\n");
      out.write("    var charName = (event.which) ? event.which : event.keyCode\r\n");
      out.write("    if (charName > 47 && charName < 58) {\r\n");
      out.write("    \tevent.keyCode = 0;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("function checkIDinter(idinter){\r\n");
      out.write("\tvar id = idinter.value;\r\n");
      out.write("\t\r\n");
      out.write("    var charIdin = (event.which) ? event.which : event.keyCode\r\n");
      out.write("    if ((charIdin > 47 && charIdin < 58) || (charIdin > 64 && charIdin < 91)) {\r\n");
      out.write("    \t//alert(charIdin);\r\n");
      out.write("    \t\r\n");
      out.write("    }else{\r\n");
      out.write("    \tevent.keyCode = 0;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function saveto()\r\n");
      out.write("{\r\n");
      out.write("\tif(document.getElementById(\"cmbLawBreakerType\").value == \"1\"){\r\n");
      out.write("\t\tif(document.dataform.sex[0].checked==true){\r\n");
      out.write("\t\t\tcdata[3]=document.dataform.sex[0].value;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tcdata[3]=document.dataform.sex[1].value;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(document.getElementById(\"cmbLawBreakerType\").value == \"2\"){\r\n");
      out.write("\t\tif(document.dataform.sex2[0].checked==true){\r\n");
      out.write("\t\t\tcdata[3]=document.dataform.sex2[0].value;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tcdata[3]=document.dataform.sex2[1].value;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tcdata[3]=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tcdata[1] = document.dataform.cmbLawBreakerType.value ;\r\n");
      out.write("\tcdata[2] = document.dataform.txtIDCardNo.value ;\r\n");
      out.write("\tcdata[7] = document.dataform.other_name.value ;\r\n");
      out.write("\tcdata[8] = document.dataform.home_number.value ;\r\n");
      out.write("\tcdata[9] = document.dataform.moo.value ;\r\n");
      out.write("\tcdata[10] = document.dataform.soi.value ;\r\n");
      out.write("\tcdata[11] = document.dataform.road.value ;\r\n");
      out.write("\tcdata[12] = document.dataform.province.value ;\r\n");
      out.write("\tcdata[13] = document.dataform.district.value ;\r\n");
      out.write("\tcdata[14] = document.dataform.tambol.value ;\r\n");
      out.write("\tcdata[15] = document.dataform.cmbRace.value ;\r\n");
      out.write("\tcdata[16] = document.dataform.cmbNationality.value ;\r\n");
      out.write("\tcdata[17] = document.dataform.career.value ;\r\n");
      out.write("\tcdata[18] = document.dataform.birthdate.value ;\t\r\n");
      out.write("\tcdata[19] = document.dataform.father_name.value ;\r\n");
      out.write("\tcdata[20] = document.dataform.mother_name.value ;\r\n");
      out.write("\r\n");
      out.write("\tvar inxProv = document.dataform.province.selectedIndex;\r\n");
      out.write("\tvar inxDist = document.dataform.district.selectedIndex;\r\n");
      out.write("\tvar inxSubd = document.dataform.tambol.selectedIndex;\r\n");
      out.write("\tcdata[23] = document.dataform.province.options[inxProv].text;\r\n");
      out.write("\tcdata[24] = document.dataform.district.options[inxDist].text;\r\n");
      out.write("\tcdata[25] = document.dataform.tambol.options[inxSubd].text;\r\n");
      out.write("\r\n");
      out.write("\tif(document.getElementById(\"cmbLawBreakerType\").value == \"3\"){\r\n");
      out.write("\t\tvar insexlext3 = document.dataform.company_title_code.selectedIndex;\r\n");
      out.write("\t\tcdata[0]  = document.dataform.company_title_code.options[insexlext3].text;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar insexlect1 = document.dataform.cmbNationality.selectedIndex;\r\n");
      out.write("\tvar insexlect2 = document.dataform.cmbRace.selectedIndex;\r\n");
      out.write("\tcdata[26]  = document.dataform.cmbRace.options[insexlect2].text ;\r\n");
      out.write("\tcdata[27]  = document.dataform.cmbNationality.options[insexlect1].text ;\r\n");
      out.write("\t//cdata[28]  = opener.document.dataform.aal_testimony.value ;\r\n");
      out.write("\tcdata[29]  = document.dataform.txtPassPortNo.value;\r\n");
      out.write("\tcdata[30]  = document.dataform.middle_name.value;\r\n");
      out.write("\tcdata[32]  = document.dataform.company_name.value;\r\n");
      out.write("\tcdata[33]  = document.dataform.excise_reg_no.value;\r\n");
      out.write("\tcdata[34]  = document.dataform.corporation_code.value;\r\n");
      out.write("\tcdata[35]  = document.dataform.agecal.value;\r\n");
      out.write("\tcdata[36]  = document.dataform.lawbreaker_no.value;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tvar brow = window.navigator.userAgent;\r\n");
      out.write("\tif (brow.indexOf(\"Chrome\")>0){//Google Chrome\r\n");
      out.write("\t\t//alert(\"Chrome 123 \");\r\n");
      out.write("\t\t//window.opener.lawsinsRow('lawsTable',1,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],\"\",data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[0],data[35],data[36]);\r\n");
      out.write("\t\t//window.opener.CallFromPop('lawsTable');\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\twindow.returnValue = cdata;\r\n");
      out.write("\t\twindow.close();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function update(){\r\n");
      out.write("\t//alert(\"opener.lawseditna=\" + opener.lawseditna + \"   opener.lawsmaxrow=\"+opener.lawsmaxrow);\r\n");
      out.write("\tif(opener.lawseditna == 1){\r\n");
      out.write("\t\tif(opener.lawsmaxrow == 2){\r\n");
      out.write("\t\t\tcdata[1] = document.dataform.cmbLawBreakerType.value = opener.document.dataform.aal_culprit_type.value ;\r\n");
      out.write("\t\t\tcdata[2] = document.dataform.txtIDCardNo.value = opener.document.dataform.aal_lawbreaker_id_card.value ;\r\n");
      out.write("\t\t\tcdata[3] = opener.document.dataform.aal_sex.value;\r\n");
      out.write("\t\t\tcdata[4] = document.dataform.nick_name.value= document.dataform.nick_name2.value= document.dataform.nick_name3.value = opener.document.dataform.aal_title_code.value ;\r\n");
      out.write("\t\t\tcdata[5] = document.dataform.first_name.value =  document.dataform.first_name2.value = document.dataform.first_name3.value = opener.document.dataform.aal_first_name.value ;\r\n");
      out.write("\t\t\tcdata[6] = document.dataform.last_name.value = document.dataform.last_name2.value = document.dataform.last_name3.value =opener.document.dataform.aal_last_name.value ;\r\n");
      out.write("\t\t\tcdata[7] = document.dataform.other_name.value = opener.document.dataform.aal_other_name.value ;\r\n");
      out.write("\t\t\tcdata[8] = document.dataform.home_number.value = opener.document.dataform.aal_address_no.value ;\r\n");
      out.write("\t\t\tcdata[9] = document.dataform.moo.value = opener.document.dataform.aal_moo.value ;\r\n");
      out.write("\t\t\tcdata[10] = document.dataform.soi.value = opener.document.dataform.aal_soi.value ;\r\n");
      out.write("\t\t\tcdata[11] = document.dataform.road.value = opener.document.dataform.aal_road.value ;\r\n");
      out.write("\t\t\tcdata[16] = document.dataform.cmbNationality.value = opener.document.dataform.aal_nationality_id.value ;\r\n");
      out.write("\t\t\tcdata[15] = document.dataform.cmbRace.value = opener.document.dataform.aal_race_id.value ;\r\n");
      out.write("\t\t\tcdata[12] = document.dataform.province.value = opener.document.dataform.aal_province.value ;\r\n");
      out.write("\t\t\tcdata[13] = document.dataform.district.value = opener.document.dataform.aal_district.value ;\r\n");
      out.write("\t\t\tcdata[14] = document.dataform.tambol.value = opener.document.dataform.aal_subdistrict.value ;\r\n");
      out.write("\t\t\tcdata[15] = document.dataform.cmbRace.value = opener.document.dataform.aal_race_id.value ; // edit by mu\r\n");
      out.write("\t\t\tcdata[16] = document.dataform.cmbNationality.value = opener.document.dataform.aal_nationality_id.value ; //edit by mu\r\n");
      out.write("\t\t\tcdata[17] = document.dataform.career.value = opener.document.dataform.aal_career.value ;\r\n");
      out.write("\t\t\tcdata[18] = document.dataform.birthdate.value = opener.document.dataform.aal_birth_date.value ;\r\n");
      out.write("\t\t\tcdata[19] = document.dataform.father_name.value = opener.document.dataform.aal_father_name.value ;\r\n");
      out.write("\t\t\tcdata[20] = document.dataform.mother_name.value = opener.document.dataform.aal_mother_name.value ;\r\n");
      out.write("\t\t\tcdata[21]  = opener.document.dataform.aal_id.value ;\r\n");
      out.write("\t\t\tcdata[22]  = opener.document.dataform.aal_title_name.value ;\r\n");
      out.write("\t\t\tcdata[23]  = opener.document.dataform.aal_province_name.value ;\r\n");
      out.write("\t\t\tcdata[24]  = opener.document.dataform.aal_district_name.value ;\r\n");
      out.write("\t\t\tcdata[25]  = opener.document.dataform.aal_subdistrict_name.value ;\r\n");
      out.write("\t\t\tcdata[26]  = opener.document.dataform.aal_race_id_name.value ;\r\n");
      out.write("\t\t\tcdata[27]  = opener.document.dataform.aal_nationality_id_name.value ;\r\n");
      out.write("\t\t\tcdata[28]  = opener.document.dataform.aal_testimony.value ;\r\n");
      out.write("\t\t\tcdata[29]  = document.dataform.txtPassPortNo.value = opener.document.dataform.aal_lawbreaker_passport.value ;\r\n");
      out.write("\t\t\tcdata[30]  = document.dataform.middle_name.value=opener.document.dataform.aal_middle_name.value;\r\n");
      out.write("\t\t\tcdata[31]  = document.dataform.company_title_code.value=opener.document.dataform.aal_company_title_code.value;\r\n");
      out.write("\t\t\tcdata[32]  = document.dataform.company_name.value=opener.document.dataform.aal_company_name.value;\r\n");
      out.write("\t\t\tcdata[33]  = document.dataform.excise_reg_no.value=opener.document.dataform.aal_excise_reg_no.value;\r\n");
      out.write("\t\t\tcdata[34]  = document.dataform.corporation_code.value=opener.document.dataform.aal_corporation_code.value;\r\n");
      out.write("\t\t\tcdata[35]  = document.dataform.agecal.value=opener.document.dataform.aal_age.value;\r\n");
      out.write("\t\t\tcdata[36]  = document.dataform.lawbreaker_no.value=opener.document.dataform.aal_lawbreaker_no.value;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(opener.document.dataform.aal_sex.value == 'M'){\r\n");
      out.write("\t\t\t\tdocument.dataform.sex[0].checked=true;\r\n");
      out.write("\t\t\t}else if(opener.document.dataform.aal_sex.value == 'F'){\r\n");
      out.write("\t\t\t\tdocument.dataform.sex[1].checked=true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tsetTimeout(\"getProvince('province','district','tambol',cdata[12],cdata[13] ,cdata[14])\",500);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\r\n");
      out.write("\t\t\tcdata[1] = document.dataform.cmbLawBreakerType.value = opener.document.dataform.aal_culprit_type[row].value;\r\n");
      out.write("\t\t\tcdata[2] = document.dataform.txtIDCardNo.value = opener.document.dataform.aal_lawbreaker_id_card[row].value;\r\n");
      out.write("\t\t\tcdata[3] = opener.document.dataform.aal_sex[row].value;\t\t\t\t\r\n");
      out.write("\t\t\tcdata[4] = document.dataform.nick_name.value= document.dataform.nick_name2.value= document.dataform.nick_name3.value = opener.document.dataform.aal_title_code[row].value ;\r\n");
      out.write("\t\t\tcdata[5] = document.dataform.first_name.value =  document.dataform.first_name2.value = document.dataform.first_name3.value = opener.document.dataform.aal_first_name[row].value ;\r\n");
      out.write("\t\t\tcdata[6] = document.dataform.last_name.value = document.dataform.last_name2.value = document.dataform.last_name3.value =opener.document.dataform.aal_last_name[row].value ;\r\n");
      out.write("\t\t\tcdata[7] = document.dataform.other_name.value = opener.document.dataform.aal_other_name[row].value;\r\n");
      out.write("\t\t\tcdata[8] = document.dataform.home_number.value = opener.document.dataform.aal_address_no[row].value;\r\n");
      out.write("\t\t\tcdata[9] = document.dataform.moo.value = opener.document.dataform.aal_moo[row].value;\r\n");
      out.write("\t\t\tcdata[10] = document.dataform.soi.value = opener.document.dataform.aal_soi[row].value;\r\n");
      out.write("\t\t\tcdata[11] = document.dataform.road.value = opener.document.dataform.aal_road[row].value;\r\n");
      out.write("\t\t\tcdata[15] = document.dataform.cmbRace.value = opener.document.dataform.aal_race_id[row].value;\r\n");
      out.write("\t\t\tcdata[16] = document.dataform.cmbNationality.value = opener.document.dataform.aal_nationality_id[row].value;\r\n");
      out.write("\t\t\tcdata[12] = document.dataform.province.value = opener.document.dataform.aal_province[row].value;\r\n");
      out.write("\t\t\tcdata[13] = opener.document.dataform.aal_district[row].value;\r\n");
      out.write("\t\t\tcdata[14] = opener.document.dataform.aal_subdistrict[row].value;\r\n");
      out.write("\t\t\tcdata[17] = document.dataform.career.value = opener.document.dataform.aal_career[row].value;\r\n");
      out.write("\t\t\tcdata[18] = document.dataform.birthdate.value = opener.document.dataform.aal_birth_date[row].value;\r\n");
      out.write("\t\t\tcdata[19] = document.dataform.father_name.value = opener.document.dataform.aal_father_name[row].value;\r\n");
      out.write("\t\t\tcdata[20] = document.dataform.mother_name.value = opener.document.dataform.aal_mother_name[row].value;\r\n");
      out.write("\t\t\tcdata[21]  = opener.document.dataform.aal_id[row].value;\r\n");
      out.write("\t\t\tcdata[22]  = opener.document.dataform.aal_title_name[row].value;\r\n");
      out.write("\t\t\tcdata[23]  = opener.document.dataform.aal_province_name[row].value;\r\n");
      out.write("\t\t\tcdata[24]  = opener.document.dataform.aal_district_name[row].value;\r\n");
      out.write("\t\t\tcdata[25]  = opener.document.dataform.aal_subdistrict_name[row].value;\r\n");
      out.write("\t\t\tcdata[26]  = opener.document.dataform.aal_race_id_name[row].value;\r\n");
      out.write("\t\t\tcdata[27]  = opener.document.dataform.aal_nationality_id_name[row].value;\r\n");
      out.write("\t\t\tcdata[28]  = opener.document.dataform.aal_testimony[row].value;\r\n");
      out.write("\t\t\tcdata[29]  = document.dataform.txtPassPortNo.value = opener.document.dataform.aal_lawbreaker_passport[row].value;\r\n");
      out.write("\t\t\tcdata[30]  = document.dataform.middle_name.value=opener.document.dataform.aal_middle_name[row].value;\r\n");
      out.write("\t\t\tcdata[31]  = document.dataform.company_title_code.value=opener.document.dataform.aal_company_title_code[row].value;\r\n");
      out.write("\t\t\tcdata[32]  = document.dataform.company_name.value=opener.document.dataform.aal_company_name[row].value;\r\n");
      out.write("\t\t\tcdata[33]  = document.dataform.excise_reg_no.value=opener.document.dataform.aal_excise_reg_no[row].value;\r\n");
      out.write("\t\t\tcdata[34]  = document.dataform.corporation_code.value=opener.document.dataform.aal_corporation_code[row].value;\r\n");
      out.write("\t\t\tcdata[35]  = document.dataform.agecal.value=opener.document.dataform.aal_age[row].value;\r\n");
      out.write("\t\t\tcdata[36]  = document.dataform.lawbreaker_no.value=opener.document.dataform.aal_lawbreaker_no[row].value;\r\n");
      out.write("\t\t\tif(opener.document.dataform.aal_sex[row].value == 'M'){\r\n");
      out.write("\t\t\t\tdocument.dataform.sex[0].checked=true;\r\n");
      out.write("\t\t\t}else if(opener.document.dataform.aal_sex[row].value == 'F'){\r\n");
      out.write("\t\t\t\tdocument.dataform.sex[1].checked=true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tsetTimeout(\"getProvince('province','district','tambol',cdata[12],cdata[13] ,cdata[14])\",500);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar str=cdata[18];\r\n");
      out.write("\tif(str.length>0){\r\n");
      out.write("\t\tstr = str.substring(6,10);\r\n");
      out.write("\t\tvar nu = new Date();\r\n");
      out.write("\t\tvar y1 = parseInt(nu.getFullYear()+543);\r\n");
      out.write("\t\tvar y2 = parseInt(str);\r\n");
      out.write("\t\tdwr.util.setValue(\"agecal\",y1-y2);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function vali(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("if(document.getElementById(\"cmbLawBreakerType\").value == \"1\"){\r\n");
      out.write("\r\n");
      out.write("\tvar fn = document.dataform.first_name.value ;\r\n");
      out.write("\tvar ln = document.dataform.last_name.value ;\r\n");
      out.write("\tif(fn.length < 1){\r\n");
      out.write("\t\talert(\"กรุณากรอกชื่อ\");\r\n");
      out.write("\t}else if(ln.length < 1){\r\n");
      out.write("\t\talert(\"กรุณากรอกสกุล\");\r\n");
      out.write("\t}else if(document.dataform.onsubmit()!=false){\r\n");
      out.write("\r\n");
      out.write("\t\tcdata[31]=\"\";\r\n");
      out.write(" \t\tcdata[4] = document.dataform.nick_name.value ;\r\n");
      out.write("\t\tcdata[5] = document.dataform.first_name.value ;\r\n");
      out.write("\t\tcdata[6] = document.dataform.last_name.value ;\r\n");
      out.write("\r\n");
      out.write("     \t\t\tsaveto();\r\n");
      out.write("  \t\t}\r\n");
      out.write("\t}else if(document.getElementById(\"cmbLawBreakerType\").value == \"2\"){\r\n");
      out.write("\t\tvar id = \tdocument.dataform.txtPassPortNo.value;\r\n");
      out.write("\t\tvar fn2 = document.dataform.first_name2.value ;\r\n");
      out.write("\t\tvar ln2 = document.dataform.last_name2.value ;\r\n");
      out.write("\r\n");
      out.write("\t\tif(fn2.length < 1){\r\n");
      out.write("\t\t\talert(\"กรุณากรอกชื่อ\");\r\n");
      out.write("\t\t}else if(ln2.length < 1){\r\n");
      out.write("\t\t\talert(\"กรุณากรอกสกุล\");\r\n");
      out.write("\t\t}else if(document.dataform.onsubmit()!=false){\r\n");
      out.write("\t \t\tcdata[31]=\"\";\r\n");
      out.write("\t \t\tcdata[4] = document.dataform.nick_name2.value ;\r\n");
      out.write("\t\t\tcdata[5] = document.dataform.first_name2.value ;\r\n");
      out.write("\t\t\tcdata[6] = document.dataform.last_name2.value ;\r\n");
      out.write("\t  \t\tsaveto();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tvar id = \tdocument.dataform.company_name.value;\r\n");
      out.write("\t\tif(id.length < 1){\r\n");
      out.write("\t\t\talert(\"กรุณากรอกชื่อผู้ประกอบการ\");\r\n");
      out.write("\t\t}else if(document.dataform.onsubmit()!=false){\r\n");
      out.write("\t\t\tcdata[4] = document.dataform.nick_name3.value\r\n");
      out.write("\t\t\tcdata[5] = document.dataform.first_name3.value ;\r\n");
      out.write("\t\t\tcdata[6] = document.dataform.last_name3.value ;\r\n");
      out.write("\t\t\tcdata[3]=\"Z\";\r\n");
      out.write("\t\t\tcdata[31]  = document.dataform.company_title_code.value;\r\n");
      out.write("\t\t\tsaveto();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("getProvince('province','district','tambol','','' ,'');\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("<form name=\"dataform\" id=\"dataform\" method=\"post\"  >\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction showLawbreakerFindPop(){\r\n");
      out.write("\t\tvar idCard = document.getElementById('txtIDCardNo').value;\r\n");
      out.write("\t\tvar txtfname = document.getElementById(\"first_name\").value + \" \" + document.getElementById(\"last_name\").value;\r\n");
      out.write("\t\twindow.showModalDialog('process?action=ArrestLawbreakerFind_pop&cmd=showPop&idCard='+idCard + '&txtfname=' + txtfname, self , 'dialogWidth=700px,Height=500px');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"95%\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><span class=\"websitename\" >รายชื่อผู้กระทำผิด</span></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><hr /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<input name=\"btnSave\"  type=\"button\" class=\"barButton\" value=\"เพิ่ม\"  onClick = \"vali();\"/>\r\n");
      out.write("\t\t\t<input name=\"btnCancel\"  type=\"button\" class=\"barButton\" value=\"ยกเลิกการแก้ไข\" onClick = \"cancleedit()\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" id=\"lawbreaker_no\" name=\"lawbreaker_no\" ></input>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><hr /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("        <td width=\"30%\" align=\"right\">ประเภทผู้กระทำผิด : </td>\r\n");
      out.write("        <td width=\"70%\">\r\n");
      out.write("          <select name=\"cmbLawBreakerType\" id=\"cmbLawBreakerType\" class=\"select\" onChange=\"toggleLawbreakerType();\">\r\n");
      out.write("                 <option selected value=\"1\">คนไทย</option>\r\n");
      out.write("                 <option value=\"2\">ชาวต่างชาติ</option>\r\n");
      out.write("                 <option value=\"3\">ผู้กระกอบการ</option>\r\n");
      out.write("          </select>\r\n");
      out.write("          <font style=\"color:red\">*</font>\r\n");
      out.write("        </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("     <tbody id=\"1\">\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td align=\"right\">เลขประจำตัวประชาชน : </td>\r\n");
      out.write("          <td >\r\n");
      out.write("            <input id=\"txtIDCardNo\" name=\"txtIDCardNo\" type=\"text\" class=\"text\"  size=\"13\" maxlength=\"13\" onkeypress=\"javascript:checkIDcard(this);\" onblur=\"JavaScript:fncAlert()\"/>\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;\r\n");
      out.write("              เพศ :\r\n");
      out.write("              <input name=\"sex\" id=\"tSexM\" type=\"radio\" value=\"M\" checked/>ชาย&nbsp;&nbsp;\r\n");
      out.write("              <input name=\"sex\" id=\"tSexF\" type=\"radio\" value=\"F\" />หญิง&nbsp;&nbsp;\r\n");
      out.write("              <font style=\"color:red\">*</font>\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">ชื่อผู้กระทำผิด : </td>\r\n");
      out.write("          <td >\r\n");
      out.write("               <select name=\"nick_name\" id=\"nick_name\" style=\"width:70px;\" onChange=\"cdata[22]=document.dataform.nick_name.options[selectedIndex].text\" >\r\n");
      out.write("                    <option value=\"\" selected>เลือก</option>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               </select>\r\n");
      out.write("               <input name=\"first_name\" id=\"first_name\" type=\"text\" class=\"text\"  size=\"15\" onkeypress=\"javascript:checkName(this);\" />-\r\n");
      out.write("               <input name=\"last_name\" id=\"last_name\" type=\"text\" class=\"text\"  size=\"15\" onkeypress=\"javascript:checkName(this);\" />\r\n");
      out.write("               <font style=\"color:red\">*</font>\r\n");
      out.write("               <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand;\" title=\"ค้นหา\" onClick=\"showLawbreakerFindPop()\" />\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("     </tbody>\r\n");
      out.write("     <tbody id=\"2\" style=\"display:none\" >\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">เลขที่หนังสือเดินทาง : </td>\r\n");
      out.write("            <td >\r\n");
      out.write("              <input id=\"txtPassPortNo\" name=\"txtPassPortNo\" type=\"text\" class=\"text\"  size=\"20\"  maxlength=\"20\" onblur=\"JavaScript:fncAlert()\"/>\r\n");
      out.write("              &nbsp;&nbsp;&nbsp;\r\n");
      out.write("              เพศ :\r\n");
      out.write("              <input name=\"sex2\" id=\"fSexM\" type=\"radio\" value=\"M\" checked/>ชาย&nbsp;&nbsp;\r\n");
      out.write("              <input name=\"sex2\" id=\"fSexY\" type=\"radio\" value=\"Y\" />หญิง&nbsp;&nbsp;\r\n");
      out.write("              <font style=\"color:red\">*</font>\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">คำนำหน้าชื่อ : </td>\r\n");
      out.write("          <td >\r\n");
      out.write("               <select name=\"nick_name2\" id=\"nick_name2\" style=\"width:150px;\" onChange=\"cdata[22]=document.dataform.nick_name2.options[selectedIndex].text\">\r\n");
      out.write("                    <option value=\"\" selected>เลือก</option>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               </select>\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("       \t\t<td  align=\"right\">ชื่อผู้กระทำผิด : </td>\r\n");
      out.write("       \t\t<td >\r\n");
      out.write("               <input name=\"first_name2\" id=\"first_name2\" type=\"text\" class=\"text\"  size=\"45\"  />\r\n");
      out.write("               <font style=\"color:red\">*</font>\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("       \t\t<td  align=\"right\">ชื่อกลาง : </td>\r\n");
      out.write("       \t\t<td >\r\n");
      out.write("               <input name=\"middle_name\" id=\"middle_name\" type=\"text\" class=\"text\"  size=\"45\"  />\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("       \t\t<td  align=\"right\">นามสกุล : </td>\r\n");
      out.write("       \t\t<td >\r\n");
      out.write("               <input name=\"last_name2\" id=\"last_name2\" type=\"text\" class=\"text\"  size=\"45\"  />\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("     </tbody>\r\n");
      out.write("     <tbody id=\"3\" style=\"display:none\" >\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">เลขทะเบียนสรรพสามิต : </td>\r\n");
      out.write("            <td >\r\n");
      out.write("              <input id=\"excise_reg_no\" name=\"excise_reg_no\" type=\"text\" class=\"text\"  size=\"20\"  maxlength=\"20\" onkeypress=\"javascript:checkIDinter(this);\" onblur=\"JavaScript:fncAlert()\" />\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("            <td  align=\"right\">เลขทะเบียนนิติบุคคล : </td>\r\n");
      out.write("            <td >\r\n");
      out.write("              <input id=\"corporation_code\" name=\"corporation_code\" type=\"text\" class=\"text\"  size=\"20\"  maxlength=\"20\" onkeypress=\"javascript:checkIDinter(this);\" />\r\n");
      out.write("            </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">ชื่อผู้ประกอบการ : </td>\r\n");
      out.write("          <td >\r\n");
      out.write("               <select name=\"company_title_code\" id=\"company_title_code\" style=\"width:70px;\" onChange=\"cdata[0]=document.dataform.company_title_code.options[selectedIndex].text\">\r\n");
      out.write("                    <option value=\"\" selected>เลือก</option>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               </select>\r\n");
      out.write("               <input name=\"company_name\" id=\"company_name\" type=\"text\" class=\"text\"  size=\"35\" />\r\n");
      out.write("               <font style=\"color:red\">*</font>\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("          <td  align=\"right\">ชื่อผู้แทน : </td>\r\n");
      out.write("          <td >\r\n");
      out.write("               <select name=\"nick_name3\" id=\"nick_name3\" style=\"width:70px;\" onChange=\"cdata[22]=document.dataform.nick_name3.options[selectedIndex].text\">\r\n");
      out.write("                    <option value=\"\" selected>เลือก</option>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               </select>\r\n");
      out.write("               <input name=\"first_name3\" id=\"first_name3\" type=\"text\" class=\"text\"  size=\"15\" onkeypress=\"javascript:checkName(this);\" />-\r\n");
      out.write("               <input name=\"last_name3\" id=\"last_name3\" type=\"text\" class=\"text\"  size=\"15\" onkeypress=\"javascript:checkName(this);\" />\r\n");
      out.write("\r\n");
      out.write("          </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("     </tbody>\r\n");
      out.write("     <tr>\r\n");
      out.write("          <td  align=\"right\">ชื่ออื่นๆ : </td>\r\n");
      out.write("          <td >\r\n");
      out.write("               <input name=\"other_name\" id=\"other_name\" type=\"text\" class=\"text\"  size=\"45\" />\r\n");
      out.write("          </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">บ้านเลขที่ : </td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("\t\t\t<input name=\"home_number\" id=\"home_number\" type=\"text\" class=\"text\"  size=\"15\">\r\n");
      out.write("               <font style=\"color:red\">*</font>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\tหมู่ที่ : <input name=\"moo\" id=\"moo\" type=\"text\" class=\"text\" onkeypress=\"ChkMinusInt(this);\"  size=\"15\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td  align=\"right\">ซอย : </td>\r\n");
      out.write("\t\t<td ><input name=\"soi\" id=\"soi\" type=\"text\" class=\"text\"  size=\"45\"  ></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td  align=\"right\">ถนน : </td>\r\n");
      out.write("\t\t<td ><input name=\"road\" id=\"road\" type=\"text\" class=\"text\"  size=\"45\"  ></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td height=\"25\" align=\"right\">จังหวัด :&nbsp;</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("\r\n");
      out.write("          <select name=\"province\" id=\"province\" onChange=\"getDistrict('district','tambol',this.value,'','');cdata[23]=document.dataform.province.options[selectedIndex].text\" style=\"width:150px\">\r\n");
      out.write("            \r\n");
      out.write("                      </select>\r\n");
      out.write("\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td height=\"25\" align=\"right\">อำเภอ :&nbsp;</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("          <select name=\"district\" id=\"district\"  onChange=\"getTambol('tambol',this.value,'');cdata[24]=document.dataform.district.options[selectedIndex].text\" style=\"width:150px\">\r\n");
      out.write("           \r\n");
      out.write("          </select>\r\n");
      out.write("\t\t<font style=\"color:red\">*</font>\r\n");
      out.write("\t </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t<td height=\"25\" align=\"right\">ตำบล :&nbsp;</td>\r\n");
      out.write("\t<td>\r\n");
      out.write("          <select name=\"tambol\" id=\"tambol\" onChange=\"cdata[25]=document.dataform.tambol.options[selectedIndex].text\" style=\"width:150px\">\r\n");
      out.write("         \r\n");
      out.write("          </select>\r\n");
      out.write("\t </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">เชื้อชาติ : </td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("\t\t\t<select name=\"cmbRace\" id=\"cmbRace\" style=\"width:120px;\" onChange=\"cdata[26]=document.dataform.cmbRace.options[selectedIndex].text\" >\r\n");
      out.write("\t\t\t\t\t<option value=\"\" selected>เลือก</option>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</select> &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\tสัญชาติ :\r\n");
      out.write("\t\t\t<select name=\"cmbNationality\" id=\"cmbNationality\" style=\"width:120px;\"  onChange=\"cdata[27]=document.dataform.cmbNationality.options[selectedIndex].text\">\r\n");
      out.write("\t\t\t\t<option value=\"\" selected>เลือก</option>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">อาชีพ : </td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("\t\t\t<input name=\"career\" id=\"career\" type=\"text\" class=\"text\"  size=\"45\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">วันเกิด : </td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("            <input name=\"birthdate\" id=\"birthdate\" type=\"text\" class=\"textdate\"  value=\"\" onBlur=\"calage();\"/>\r\n");
      out.write("           <a href=\"javascript:NewCssCal('birthdate','ddmmyyyy')\"><img src=\"images/btn_calendar.png\"  align=\"middle\" style=\"border-style: none\"  width=\"19\" height=\"19\" ></a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("            อายุ :&nbsp;\r\n");
      out.write("            <input type=\"text\" name=\"agecal\" id=\"agecal\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\"  size=\"5\" /> ปี\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">ชื่อบิดา : </td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("\t\t\t<input name=\"father_name\" id=\"father_name\" type=\"text\" class=\"text\"  size=\"45\" onkeypress=\"javascript:checkName(this);\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\">ชื่อมารดา : </td>\r\n");
      out.write("\t\t<td >\r\n");
      out.write("\t\t\t<input name=\"mother_name\" id=\"mother_name\" type=\"text\" class=\"text\"  size=\"45\" onkeypress=\"javascript:checkName(this);\">\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//toggleLawbreakerType();\r\n");
      out.write("\r\n");
      out.write("update();\r\n");
      out.write("if(opener.lawseditna == 1){\r\n");
      out.write("\ttoggleLawbreakerType();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(" </script>\r\n");
      out.write(" <script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//You should create the validator only after the definition of the HTML form\r\n");
      out.write("  \tvar frmvalidator  = new Validator(\"dataform\");\r\n");
      out.write(" \tfrmvalidator.addValidation(\"province\",\"req\",\"กรุณาเลือกจังหวัด\");\r\n");
      out.write("  \tfrmvalidator.addValidation(\"district\",\"req\",\"กรุณาเลือกอำเภอ\");\r\n");
      out.write("   \t//frmvalidator.addValidation(\"home_number\",\"req\",\"กรุณากรอกบ้านเลขที่\");\r\n");
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
    _jspx_th_c_005furl_005f0.setValue("/dwr/interface/SelectRegion.js");
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
    _jspx_th_c_005furl_005f1.setValue("/dwr/engine.js");
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
    _jspx_th_c_005furl_005f2.setValue("/dwr/util.js");
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
    _jspx_th_c_005furl_005f3.setValue("/js/JScript.js");
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
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title_popList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("titleP");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleP.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleP.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
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
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title_popList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("titleP");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleP.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleP.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t");
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
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title_popList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f2.setVar("titleP");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleP.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleP.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title_popList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f3.setVar("titleP");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleP.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleP.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent(null);
    _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rach_popList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f4.setVar("rachP");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rachP.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write(' ');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rachP.race_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rachP.id == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fforEach_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent(null);
    _jspx_th_c_005fforEach_005f5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nation_popList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f5.setVar("nationP");
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nationP.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nationP.nation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nationP.id == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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
