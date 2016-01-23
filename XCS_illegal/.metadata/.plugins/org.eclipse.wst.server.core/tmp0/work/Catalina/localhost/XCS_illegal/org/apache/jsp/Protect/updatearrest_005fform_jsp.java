package org.apache.jsp.Protect;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.util.DateUtil;
import java.util.Date;
import java.util.Date;

public final class updatearrest_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(7);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Protect/arrest_detailshow.jsp");
    _jspx_dependants.add("/Protect/indictment.jsp");
    _jspx_dependants.add("/Protect/showindictment.jsp");
    _jspx_dependants.add("/Protect/arrest_detail.jsp");
    _jspx_dependants.add("/Protect/showarrest_tab.jsp");
    _jspx_dependants.add("/Protect/arrest_tab.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\" ></script>\r\n");
      out.write("<script language=\"JavaScript\" src=\"js/gen_validatorv31.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/sigslot_core.js\"></script>\r\n");
      out.write("<script src=\"js/base.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/utility.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/MXWidgets.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/JSRecordset.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/DependentDropdown.js\"></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Reports.js'></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("\r\n");
      out.write("function printReports()\r\n");
      out.write("{\r\n");
      out.write("\tvar repName = document.getElementById(\"cmbPrintReports\").value;\r\n");
      out.write("\tvar tn = document.dataform.track_no.value;\r\n");
      out.write("  \tReports.ReportUrl(function(data){\r\n");
      out.write("\t\tif(data != \"\"){\r\n");
      out.write("\t\t\twindow.open(data + 'ReportName=' + repName + '&getTrackNo='+tn+'&vReportType=PDF&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tif (repName != \"\"){\r\n");
      out.write("\t\t\t\twindow.open('process?action=Report&__report=' + repName + '&__formatt=pdf&getTrackNo='+ tn + '&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validateData(){\r\n");
      out.write("\tvar doc = document.dataform;   \r\n");
      out.write("   if(doc.have_culpri.checked==true && doc.laws_qty.value == 0){\r\n");
      out.write("\t\talert(\"คดีมีตัว กรุณาเพิ่มรายชื่อผู้กระทำผิด\");\r\n");
      out.write("\t  }\r\n");
      out.write("   else if(doc.onsubmit()!=false)\r\n");
      out.write("\t   document.dataform.submit()\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.frmBorder{position:absolute;width:200px; height:150px; border:#CCCCCC solid 1px;background:#CCCCCC;}\r\n");
      out.write("\t.innerPosition{position:relative; top:10px;left:10px;right:5px;height:500px;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" name=\"dataform\"  action=\"process?action=Arrest&cmd=update\" >\r\n");
      out.write("\t\t<!-- Body -->\r\n");
      out.write("\t\t<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t\t<td width=\"100%\" align=\"left\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                <td width=\"99%\"><span class=\"websitename\">บันทึกการจับกุม</span></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td colspan=\"2\"><hr/></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\">&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("\t\t\t\t\t<input name=\"btnSave\"  type=\"button\"  class=\"barButton\" value=\"บันทึก\" onclick=\"validateData();\" >\r\n");
      out.write("\t\t\t\t\t<input name=\"btnCancel\"  type=\"reset\" class=\"barButton\" value=\"ยกเลิกการแก้ไข\" onclick=\"writeTranLog('ยกเลิกการแก้ไขบันทึกการจับกุม');window.location.href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'; \">\r\n");
      out.write("\t\t\t\t\t<input name=\"btnBack\"  type=\"button\" class=\"barButton\" value=\"กลับหน้าค้นหา\" onclick=\"writeTranLog('กลับหน้าค้นหา');window.location.href='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("'; \" >\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    พิมพ์รายงาน :&nbsp;\r\n");
      out.write("                   <select name=\"cmbPrintReports\" id=\"cmbPrintReports\"  style=\"width:200px;\">\r\n");
      out.write("                        <option value=\"\" selected>เลือก</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<option value=\"ILL2009\">รายงานการจับกุม ส.ส.2/6ก</option>\r\n");
      out.write("                   </select>\r\n");
      out.write("                   <input type=\"button\" id=\"btnPrint\" name=\"btnPrint\" value=\"พิมพ์\" onClick=\"printReports();\" >\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td colspan=\"2\"><hr/></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("                <td>&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td> &nbsp;\r\n");
      out.write("                \t<input name=\"chkcaselast\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.chkcaselast}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></input>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td >\r\n");
      out.write("                  ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f43 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f43.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f43.setParent(null);
      _jspx_th_c_005fif_005f43.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.chkcaselast == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f43 = _jspx_th_c_005fif_005f43.doStartTag();
      if (_jspx_eval_c_005fif_005f43 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  \t");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f44 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f44.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
          _jspx_th_c_005fif_005f44.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEdit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fif_005f44 = _jspx_th_c_005fif_005f44.doStartTag();
          if (_jspx_eval_c_005fif_005f44 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t                  \t");
              out.write('\r');
              out.write('\n');
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>\r\n");
              out.write("<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>\r\n");
              out.write("<script type='text/javascript' src='dwr/engine.js'></script>\r\n");
              out.write("<script type='text/javascript' src='dwr/util.js'></script>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<script>\r\n");
              out.write("function ch_accuserType(){\r\n");
              out.write("\tfor (i=0;i<document.dataform.accuserType.length;i++) { \r\n");
              out.write("\t      if (document.dataform.accuserType[i].checked){ \r\n");
              out.write("\t    \t  document.dataform.mu_accuserType.value = document.dataform.accuserType[i].value; \r\n");
              out.write("\t      }\r\n");
              out.write("\t} \r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function clearDeptname(){\r\n");
              out.write("\tvar fForm = document.dataform;\r\n");
              out.write("\tif(fForm.department_code.value == \"\")\r\n");
              out.write("\t\tfForm.department_name.value = \"\";\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function toggle() {\r\n");
              out.write("   if( document.getElementById(\"no_culpri\").checked==true ){\r\n");
              out.write("\t\tdocument.getElementById(\"estimate_fine\").disabled=false;\r\n");
              out.write("\t\tdocument.getElementById(\"issentcourt\").disabled=true;\r\n");
              out.write("\t\tdocument.getElementById(\"issentcourt\").checked=false;\r\n");
              out.write("   }else{\r\n");
              out.write("\t\tdocument.getElementById(\"issentcourt\").disabled=false;\r\n");
              out.write("\t\tif(document.getElementById(\"issentcourt\").checked==true){\r\n");
              out.write("\t\t\tdocument.getElementById(\"estimate_fine\").disabled=false;\r\n");
              out.write("\r\n");
              out.write("\t\t}else{\r\n");
              out.write("\t\t\tdocument.getElementById(\"estimate_fine\").disabled=true;\r\n");
              out.write("\t\t\tdocument.getElementById(\"estimate_fine\").value=\"\";\r\n");
              out.write("\t\t}\r\n");
              out.write("   }\r\n");
              out.write("\r\n");
              out.write("   if (document.dataform.legislation_id.value!=\"\")\r\n");
              out.write("\t\tsetGroupID('product_group_id',document.dataform.legislation_id.value,document.dataform.product_group_id.value);\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("  function enableProductType(){\r\n");
              out.write("\t  if(document.getElementById(\"legislation_id\").value =='4'){\r\n");
              out.write("\t\t  document.getElementById(\"s\").disabled=false;\r\n");
              out.write("\t  }else{\r\n");
              out.write("\t\t  document.getElementById(\"s\").disabled=true;\r\n");
              out.write("\t  }\r\n");
              out.write("  }\r\n");
              out.write("\r\n");
              out.write("  function setGroupID(group_id, vLegislationID, vGroupID){\r\n");
              out.write("\t\tLegislationProduct.getDutyGroup(vLegislationID,function(data){\r\n");
              out.write("\t\t\tdwr.util.removeAllOptions(group_id);\r\n");
              out.write("\t\t\tdwr.util.addOptions(group_id,data,\"group_id\",\"group_name\");\r\n");
              out.write("\t\t\t\r\n");
              out.write("\t\t\tif(vGroupID!=null && vGroupID!=\"\" ){\r\n");
              out.write("\t\t\t\tdwr.util.setValue(group_id,vGroupID);\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\r\n");
              out.write("\t\t\tif(dwr.util.getValue(\"have_culprit\")==\"N\" || dwr.util.getValue(\"issentcourt\")==true)\r\n");
              out.write("\t\t\t\tdwr.util.addOptions(\"product_group_id\",[{group_id:\"0000\",group_name:\"อื่นๆ\"}],\"group_id\",\"group_name\");\r\n");
              out.write("\t\t});\r\n");
              out.write("\t}\r\n");
              out.write("\r\n");
              out.write("  getProvince('province','district','tambol','");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write('\'');
              out.write(',');
              out.write('\'');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write('\'');
              out.write(',');
              out.write('\'');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("');\r\n");
              out.write("  function SetOffName(DistictCode)\r\n");
              out.write("  {\r\n");
              out.write("\t  var vOffcode = document.getElementById(\"offcode\");\r\n");
              out.write("\t  var vOffName = document.getElementById(\"tmp_offname\");\r\n");
              out.write("\t  var UserOffcode = \"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\";\r\n");
              out.write("\t  \r\n");
              out.write("\t  //if ((UserOffcode.substr(0,2)==\"10\") && (DistictCode.substr(0,2)==\"10\")){\r\n");
              out.write("\t\t//  if (DistictCode != \"\"){\r\n");
              out.write("\t\t//\t  EdOfficeTest.getOffnameFromDistictCode(DistictCode,'N',function(data){\r\n");
              out.write("\t\t//\t\t  dwr.util.setValue(vOffcode,data[0]);\r\n");
              out.write("\t\t//\t\t  dwr.util.setValue(vOffName,data[1]);\r\n");
              out.write("\t\t//\t  });\r\n");
              out.write("\t\t//   }\r\n");
              out.write("\t  //}\r\n");
              out.write("\t  //else{\r\n");
              out.write("\t//\t  dwr.util.setValue(vOffcode,\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\");\r\n");
              out.write("\t // \t  dwr.util.setValue(vOffName,\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\");\r\n");
              out.write("\t  //}\r\n");
              out.write("  }\r\n");
              out.write("\t\r\n");
              out.write("</script>\r\n");
              out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
              out.write("  <tr >\r\n");
              out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr class=\"bgRowGray\">\r\n");
              out.write("    <td colspan=\"4\"><strong>รายละเอียดบันทึกการจับกุม</strong> </td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr >\r\n");
              out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td width=\"20%\" height=\"25\" align=\"right\" >เลขที่งาน :&nbsp;</td>\r\n");
              out.write("\r\n");
              out.write("    <td width=\"30%\"><input name=\"track_no\" type=\"text\" class=\"textview\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${track_gen}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" size=\"25\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" />\r\n");
              out.write("      <input type=\"hidden\" name=\"id\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" />\r\n");
              out.write("    </td>\r\n");
              out.write("    <td width=\"20%\" height=\"25\" align=\"right\">วันที่เขียนบันทึกจับกุม :&nbsp;</td>\r\n");
              out.write("    <td width=\"30%\"><!--<input name=\"theDate2\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" value=\"01/10/2552\"  />\r\n");
              out.write("\t\t\t -->\r\n");
              out.write("\t\t");
              if (_jspx_meth_c_005fif_005f45(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f46 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f46.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
              _jspx_th_c_005fif_005f46.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_date2 == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f46 = _jspx_th_c_005fif_005f46.doStartTag();
              if (_jspx_eval_c_005fif_005f46 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("        <input type=\"Text\" name=\"application_date\" id=\"application_date\" class=\"textdate\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" size=\"7\" maxlength=\"10\" style=\"width:75;\"\r\n");
                  out.write("         value=\"");
                  //  fmt:formatDate
                  org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
                  _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
                  _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f46);
                  _jspx_th_fmt_005fformatDate_005f0.setValue(new Date());
                  _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
                  int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
                  if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
                    return;
                  }
                  _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
                  out.write("\" />\r\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f46.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f46);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f46);
              out.write("\r\n");
              out.write("         <!-- ");
              if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write(" -->\r\n");
              out.write("        <a href=\"javascript:NewCssCal('application_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>\r\n");
              out.write("       <font style=\"color:red\">*</font>\r\n");
              out.write("    </td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td  height=\"25\" align=\"right\">เขียนที่ :&nbsp;</td>\r\n");
              out.write("    <td ><input name=\"department_code\" type=\"text\"  class=\"textbox\" id=\"department_code\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" size=\"4\" onkeypress=\"ChkMinusInt(this);\" onblur=\"clearDeptname();\" />\r\n");
              out.write("        <img id=\"imgDepartment\" src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
              out.write("                    onClick=\"window.open('process?action=Ed_office_pop&formname=department_name&formcode=department_code' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" />\r\n");
              out.write("        <input name=\"department_name\" type=\"text\"  class=\"textbox\" id=\"department_name\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${department_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" size=\"14\" />\r\n");
              out.write("        <font style=\"color:red\">*</font> </td>\r\n");
              out.write("    <td height=\"25\" align=\"right\">วันที่เกิดเหตุ :&nbsp;</td>\r\n");
              out.write("    <td height=\"25\">\r\n");
              out.write("\t\t");
              if (_jspx_meth_c_005fif_005f47(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f48 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f48.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
              _jspx_th_c_005fif_005f48.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_date2 == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f48 = _jspx_th_c_005fif_005f48.doStartTag();
              if (_jspx_eval_c_005fif_005f48 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("        \t\t<input name=\"occurrence_date\" type=\"Text\" class=\"textdate\" id=\"occurrence_date\" style=\"width:75;\" value=\"");
                  //  fmt:formatDate
                  org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
                  _jspx_th_fmt_005fformatDate_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_fmt_005fformatDate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f48);
                  _jspx_th_fmt_005fformatDate_005f2.setValue(new Date());
                  _jspx_th_fmt_005fformatDate_005f2.setPattern("dd/MM/yyyy");
                  int _jspx_eval_fmt_005fformatDate_005f2 = _jspx_th_fmt_005fformatDate_005f2.doStartTag();
                  if (_jspx_th_fmt_005fformatDate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
                    return;
                  }
                  _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f2);
                  out.write("\" size=\"7\" maxlength=\"10\" onKeyPress=\"txtKeyPress(event);\" />\r\n");
                  out.write("        \t\t<a href=\"javascript:NewCssCal('occurrence_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a> เวลา\r\n");
                  out.write("\t\t        <input name=\"occurrence_time\" id=\"occurrence_time\" type=\"text\" class=\"textbox\" size=\"5\" maxlength=\"5\" value=\"");
                  //  fmt:formatDate
                  org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
                  _jspx_th_fmt_005fformatDate_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_fmt_005fformatDate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f48);
                  _jspx_th_fmt_005fformatDate_005f3.setValue(new Date());
                  _jspx_th_fmt_005fformatDate_005f3.setPattern("HH:mm");
                  int _jspx_eval_fmt_005fformatDate_005f3 = _jspx_th_fmt_005fformatDate_005f3.doStartTag();
                  if (_jspx_th_fmt_005fformatDate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
                    return;
                  }
                  _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f3);
                  out.write("\" onkeypress=\"txtTime_OnKeyPress(this);\" onblur=\"lengthVali(this,5);\"/>\r\n");
                  out.write("\t\t        <font style=\"color:red\">*</font> \r\n");
                  out.write("        ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f48.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f48);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f48);
              out.write("\r\n");
              out.write("      \r\n");
              out.write("    </td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td  height=\"25\" align=\"right\">พื้นที่ :&nbsp;</td>\r\n");
              out.write("    <td >\r\n");
              out.write("    \t<select name=\"offcode\" id=\"offcode\" style='width:200px;");
              if (_jspx_meth_c_005fif_005f49(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("'  onchange=\"setOfficeProvince('province','district','tambol',this.value)\" >\r\n");
              out.write("\t         <option value=\"\" ");
              if (_jspx_meth_c_005fif_005f50(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write(">เลือก</option>\r\n");
              out.write("\t        ");
              if (_jspx_meth_c_005fforEach_005f4(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        </select>\r\n");
              out.write("        ");
              if (_jspx_meth_c_005fif_005f52(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        <font style=\"color:red\">*</font> </td>\r\n");
              out.write("    <td  height=\"25\" align=\"right\">ผู้กระทำผิด :&nbsp;</td>\r\n");
              out.write("    <td ><input  name=\"lawbreakertype\" type=\"radio\" checked value=\"1\"\r\n");
              out.write("\r\n");
              out.write("      /> บุคคลทั่วไป &nbsp;&nbsp;\r\n");
              out.write("      <input name=\"lawbreakertype\" type=\"radio\" value=\"2\"\r\n");
              out.write("\r\n");
              out.write("      />ผู้ประกอบการ&nbsp;&nbsp; <font style=\"color:red\">*</font> </td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td  height=\"25\" align=\"right\">พ.ร.บ. :&nbsp;</td>\r\n");
              out.write("    <td >\r\n");
              out.write("\r\n");
              out.write("    <select name=\"legislation_id\" id=\"legislation_id\" style=\"width:200px;\" onchange=\"setGroupID('product_group_id',this.value,'');\" >\r\n");
              out.write("     <option value=\"\" selected>เลือก</option>\r\n");
              out.write("            \t\t\t\t");
              if (_jspx_meth_c_005fforEach_005f5(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    </select>\r\n");
              out.write("        <font style=\"color:red\">*</font> </td>\r\n");
              out.write("    <td  height=\"25\" align=\"right\">มีตัวผู้กระทำผิด :&nbsp;</td>\r\n");
              out.write("    <td ><input name=\"have_culprit\" id=\"have_culpri\" type=\"radio\" value=\"Y\" checked onclick=\"toggle();\"\r\n");
              out.write("\r\n");
              out.write("      /> มีตัว &nbsp;&nbsp;\r\n");
              out.write("      <input name=\"have_culprit\" id=\"no_culpri\" type=\"radio\" value=\"N\" onclick=\"toggle();document.dataform.aalchkAll.checked=true;allCheck(document.dataform.aalchkAll,document.dataform.lawscheck_list);lawsget_check_value('lawsTable');\"\r\n");
              out.write("\r\n");
              out.write("      /> ไม่มีตัว&nbsp;&nbsp;\r\n");
              out.write("      <input name=\"issentcourt\" id=\"issentcourt\" type=\"checkbox\" onclick=\"toggle();\"\r\n");
              out.write("      ");
              if (_jspx_meth_c_005fif_005f53(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write(" value = 'Y' /> \r\n");
              out.write("      \tส่งฟ้องศาล&nbsp;&nbsp; <font style=\"color:red\">*</font>\r\n");
              out.write("     </td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td height=\"25\" align=\"right\">สินค้า :&nbsp;</td>\r\n");
              out.write("    <td >\r\n");
              out.write("    <select name=\"product_group_id\" id=\"product_group_id\" style=\"width:200px;\">\r\n");
              out.write("    \t<option value=\"\" selected >เลือก</option>\r\n");
              out.write("    </select>\r\n");
              out.write("        <font style=\"color:red\">*</font> </td>\r\n");
              out.write("    <td align=\"right\" valign=\"top\">ประมาณการค่าปรับ :&nbsp;</td>\r\n");
              out.write("    <td valign=\"top\" colspan=\"3\"><input type=\"text\" name=\"estimate_fine\" id=\"estimate_fine\" class=\"textNum\" onkeypress=\"ChkMinusDbl(this);\" size=\"10\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.estimate_fine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"  />\r\n");
              out.write("      บาท</td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr height=\"25\">\r\n");
              out.write("    <td align=\"right\" valign=\"top\">ผู้กล่าวหา :&nbsp;</td>\r\n");
              out.write("    <td colspan=\"3\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
              out.write("      <tr>\r\n");
              out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"2\"  ");
              if (_jspx_meth_c_005fif_005f54(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("  > เจ้าหน้าที่กรมสรรพสามิต </td>\r\n");
              out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"3\"  ");
              if (_jspx_meth_c_005fif_005f55(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("  > เจ้าหน้าที่สรรพสามิตภาค </td>\r\n");
              out.write("        <td  align=\"right\">ชื่อผู้กล่าวหา :&nbsp;</td>\r\n");
              out.write("        <td><input type=\"text\" id=\"accuser\" name=\"accuser\" class=\"textview\" size=\"31\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" />\r\n");
              out.write("              <input type=\"hidden\" id=\"accuser_idcardno\" name=\"accuser_idcardno\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" />\r\n");
              out.write("              <input type=\"hidden\" id=\"mu_accuserType\" name=\"mu_accuserType\" value=\"\" />\r\n");
              out.write("              <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:pointer\" onClick=\"ch_accuserType();window.open('process?action=Divide_staff_popForArrest&formname=accuser&id=accuser_idcardno&posname=posname&poscode=accuser_poscode&offname=offname&offcode=accuser_offcode&actype='+document.dataform.mu_accuserType.value , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" /> <font style=\"color:red\">*</font> </td>\r\n");
              out.write("      </tr>\r\n");
              out.write("      <tr>\r\n");
              out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"1\"\r\n");
              out.write("              ");
              if (_jspx_meth_c_005fif_005f56(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("          >เจ้าหน้าที่สรรพสามิตพื้นที่ </td>\r\n");
              out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"4\"\r\n");
              out.write("              ");
              if (_jspx_meth_c_005fif_005f57(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("          >เจ้าหน้าที่สรรพสามิตพื้นที่สาขา</td>\r\n");
              out.write("        <td align=\"right\">ตำแหน่ง :&nbsp;</td>\r\n");
              out.write("        <td ><input type=\"text\" id=\"posname\" name=\"posname\" class=\"textview\" size=\"35\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" />\r\n");
              out.write("              <input type=\"hidden\" id=\"accuser_poscode\" name=\"accuser_poscode\" class=\"textview\" size=\"35\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" />\r\n");
              out.write("        </td>\r\n");
              out.write("      </tr>\r\n");
              out.write("      <tr>\r\n");
              out.write("        <td colspan=\"2\"><input name=\"accuserType\" type=\"radio\" value=\"5\"\r\n");
              out.write("              ");
              if (_jspx_meth_c_005fif_005f58(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("  >เจ้าหน้าที่อื่นๆ</td>\r\n");
              out.write("        <td align=\"right\">สังกัด :&nbsp;</td>\r\n");
              out.write("        <td ><input type=\"text\" id=\"offname\" name=\"offname\" class=\"textview\" size=\"35\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" />\r\n");
              out.write("              <input type=\"hidden\" id=\"accuser_offcode\" name=\"accuser_offcode\" class=\"textview\" size=\"35\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" />\r\n");
              out.write("        </td>\r\n");
              out.write("      </tr>\r\n");
              out.write("    </table></td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td height=\"25\">&nbsp;</td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr height=\"25\">\r\n");
              out.write("    <td  height=\"25\" align=\"right\">ชื่อสถานที่เกิดเหตุ :&nbsp;</td>\r\n");
              out.write("    <td ><input name=\"scene_name\" type=\"text\" class=\"text\" size=\"25\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" />\r\n");
              out.write("        <font style=\"color:red\">*</font> </td>\r\n");
              out.write("    <td height=\"25\" align=\"right\">จังหวัด :&nbsp;</td>\r\n");
              out.write("    <td>\r\n");
              out.write("       <select name=\"scene_province\" id=\"province\" style=\"width:200px\" onchange=\"getDistrict('district','tambol',this.value,''); SetOffName('')\">\r\n");
              out.write("       \t  <option value=\"\">โปรดเลือก</option>\r\n");
              out.write("\r\n");
              out.write("       </select>\r\n");
              out.write("       <font style=\"color:red\">*</font> </td>\r\n");
              out.write("\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr height=\"25\">\r\n");
              out.write("    <td  height=\"25\" align=\"right\">บ้านเลขที่ :&nbsp;</td>\r\n");
              out.write("    <td ><input name=\"scene_no\" type=\"text\" class=\"text\" size=\"8\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" />\r\n");
              out.write("      &nbsp;&nbsp;\r\n");
              out.write("      หมู่ :\r\n");
              out.write("      <input name=\"scene_moo\" type=\"text\" class=\"text\" size=\"5\" onkeypress=\"ChkMinusInt(this);\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" />\r\n");
              out.write("    </td>\r\n");
              out.write("    <td height=\"25\" align=\"right\">อำเภอ:&nbsp;</td>\r\n");
              out.write("    <td>\r\n");
              out.write("     <select name=\"district\" id=\"district\"  style=\"width:200px\" onchange=\"getTambol('tambol',this.value,''); SetOffName(this.value)\">\r\n");
              out.write("     </select>\r\n");
              out.write("        <font style=\"color:red\">*</font> </td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr height=\"25\">\r\n");
              out.write("    <td  height=\"25\" align=\"right\">ซอย :&nbsp;</td>\r\n");
              out.write("    <td ><input name=\"scene_soi\" type=\"text\" class=\"text\" id=\"scene_soi\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" size=\"25\"  /></td>\r\n");
              out.write("    <td height=\"25\" align=\"right\">ตำบล :&nbsp;</td>\r\n");
              out.write("    <td>\r\n");
              out.write("       <select name=\"tambol\" id=\"tambol\"  style=\"width:200px\">\r\n");
              out.write("       </select>\r\n");
              out.write("       <font style=\"color:red\">*</font> </td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr height=\"25\">\r\n");
              out.write("    <td  height=\"25\" align=\"right\">ถนน :&nbsp;</td>\r\n");
              out.write("    <td ><input name=\"scene_road\" type=\"text\" class=\"text\" id=\"scene_road\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" size=\"25\" /></td>\r\n");
              out.write("    <td align=\"right\">สถานีตำรวจท้องที่เกิดเหตุ :&nbsp;</td>\r\n");
              out.write("    <td><input name=\"police_station\" type=\"text\" class=\"text\" size=\"20\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.police_station}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" />\r\n");
              out.write("      (ส.ส.2/54)</td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td height=\"25\" align=\"right\" >จำนวนผู้กระทำผิด :&nbsp;</td>\r\n");
              out.write("    <td height=\"25\" ><input type=\"text\" name=\"laws_qty\" id=\"laws_qty\" size=\"2\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" value = \"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aalsize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"/>  คน &nbsp;&nbsp;&nbsp;\r\n");
              out.write("        <input name=\"alleged_co\" type=\"checkbox\"  disabled=\"disabled\" ");
              if (_jspx_meth_c_005fif_005f59(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write(" value=\"Y\" />\r\n");
              out.write("      ข้อกล่าวหาร่วมกัน </td>\r\n");
              out.write("    <td height=\"25\" align=\"right\">ละติจูด :&nbsp;</td>\r\n");
              out.write("    <td><input name=\"coordinate_x\" type=\"text\" class=\"text\" size=\"5\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_x}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onkeypress=\"ChkMinusDbl(this);\"  />\r\n");
              out.write("      &nbsp;&nbsp;&nbsp;\r\n");
              out.write("      ลองติจูด :&nbsp;&nbsp;\r\n");
              out.write("      <input name=\"coordinate_y\" type=\"text\" class=\"text\" size=\"5\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_y}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onkeypress=\"ChkMinusDbl(this);\"/>\r\n");
              out.write("    </td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td colspan=\"4\" height=\"25\" align=\"right\">&nbsp;</td>\r\n");
              out.write("  </tr>\r\n");
              out.write("</table>\r\n");
              out.write("<script>\r\n");
              out.write("\r\n");
              out.write("\tdocument.dataform.legislation_id.value = \"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" \r\n");
              out.write("\t\r\n");
              out.write("\tfor(var i = 0 ; i< document.dataform.lawbreakertype.length; i++){\r\n");
              out.write("\t\r\n");
              out.write("\t \t\tif(document.dataform.lawbreakertype[i].value == \"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreak_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" ){\r\n");
              out.write("\t    \tdocument.dataform.lawbreakertype[i].checked=true;\r\n");
              out.write("\t\t\t }\r\n");
              out.write("\t}\r\n");
              out.write("\tfor(var i = 0 ; i< document.dataform.have_culprit.length; i++){\r\n");
              out.write("\t\r\n");
              out.write("\t \t\tif(document.dataform.have_culprit[i].value == \"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.have_culprit}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" ){\r\n");
              out.write("\t    \tdocument.dataform.have_culprit[i].checked=true;\r\n");
              out.write("\t\t\t }\r\n");
              out.write("\t}\r\n");
              out.write("\ttoggle();\r\n");
              out.write("\r\n");
              out.write("\tsetGroupID('product_group_id','");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write('\'');
              out.write(',');
              out.write('\'');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.product_group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("');\r\n");
              out.write("\r\n");
              out.write("</script>  \r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("  <!-- รายละเอียดบันทึกการจับกุม-->\r\n");
              out.write("\t                  \t");
              out.write('\r');
              out.write('\n');
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
              out.write("<link href=\"css/jquery-ui.css\"  rel=\"stylesheet\" />\r\n");
              out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/Popup.js\" ></script>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<script type=\"text/javascript\">\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("var incmaxrow=1; // jsp  Count  config\r\n");
              out.write("var incstartrow=2;\r\n");
              out.write("var inceditrow = -1;\r\n");
              out.write("var inceditna = 0;\r\n");
              out.write("\r\n");
              out.write("function incinsRow(myTable,maxrox,data1,data2,data3,data4,id,data6)\r\n");
              out.write("{\r\n");
              out.write("\tvar row;\r\n");
              out.write("\tvar x=document.getElementById(myTable).insertRow(incmaxrow);\r\n");
              out.write("\tincmaxrow++;\r\n");
              out.write("\r\n");
              out.write("\trow = incmaxrow - 1;\r\n");
              out.write("\tvar y1=x.insertCell(0);\r\n");
              out.write("\tvar y2=x.insertCell(1);\r\n");
              out.write("\tvar y3=x.insertCell(2);\r\n");
              out.write("\tvar y4=x.insertCell(3);\r\n");
              out.write("\tvar y5=x.insertCell(4);\r\n");
              out.write("\r\n");
              out.write("\tvar exp = new Date();\r\n");
              out.write("\tvar s = exp.getTime();\r\n");
              out.write("\ty1.innerHTML=\"<input readonly class='textboxlist' size='1' name='inctc_id' value='\" + row + \"' />\"+\"<input type=\\\"hidden\\\" name=\\\"aai_id\\\" value=\\\"\"+id+\"\\\">\";\r\n");
              out.write("\ty2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"inccheckbox\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"incref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
              out.write("\ty3.innerHTML= data1+ \"<input type=\\\"hidden\\\" name=\\\"aai_case_law_id\\\" value=\\\"\" +data1+ \"\\\">\"\r\n");
              out.write("\t+ \"<input type=\\\"hidden\\\" name=\\\"aai_indictment_id\\\" value=\\\"\" +data6+ \"\\\">\" ;\r\n");
              out.write("\ty4.innerHTML=data2+\"<input type=\\\"hidden\\\" id=\\\"aai_penalty_case_law_id\\\" name=\\\"aai_penalty_case_law_id\\\" value=\\\"\"+data2+\"\\\">\";\r\n");
              out.write("\ty5.innerHTML=data3+\"<input type=\\\"hidden\\\" name=\\\"aai_guilt_base\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aai_exhibit_wild\\\" value=\\\"\"+data4+\"\\\">\";\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function incdelRow(myTable)\r\n");
              out.write("{\r\n");
              out.write("\tif (incmaxrow>1)\r\n");
              out.write("\t{\r\n");
              out.write("\t\tvar x=document.getElementById(myTable).deleteRow(myTable,incmaxrow-1);\r\n");
              out.write("\t\tincmaxrow--\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function incalternate(id){\r\n");
              out.write("\t if(document.getElementsByTagName){\r\n");
              out.write("\t\t   var table = document.getElementById(id);\r\n");
              out.write("\t\t   var rows = table.getElementsByTagName(\"tr\");\r\n");
              out.write("\t\t   for(i = 0; i < rows.length; i++){\r\n");
              out.write("\t\t     if(i % 2 == 0){\r\n");
              out.write("\t\t       \trows[i].className = \"even\";\r\n");
              out.write("\t\t     }else{\r\n");
              out.write("\t\t       \trows[i].className = \"odd\";\r\n");
              out.write("\t\t     }\r\n");
              out.write("\t\t   }\r\n");
              out.write("\t }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function increrun_id()\r\n");
              out.write("{\r\n");
              out.write("\tif (incmaxrow == 2)\r\n");
              out.write("\t{\r\n");
              out.write("\t\tdocument.dataform.inctc_id.value=1;\r\n");
              out.write("\t}else if(incmaxrow > 2){\r\n");
              out.write("\t\tfor (var i=0; i < document.dataform.inctc_id.length; i++)\r\n");
              out.write("\t    {\r\n");
              out.write("\t\t\tdocument.dataform.inctc_id[i].value=i+1;\r\n");
              out.write("\t    }\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("function incdelRown(myTable,Rown)\r\n");
              out.write("{\r\n");
              out.write("\tvar x=document.getElementById(myTable).deleteRow(Rown);\r\n");
              out.write("\tincmaxrow--\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function incopenmodal(myTable)\r\n");
              out.write("{\r\n");
              out.write("\twriteTranLog('เพิ่มข้อกล่าวหาในบันทึกการจับกุม');\t\r\n");
              out.write("\t\r\n");
              out.write("\tvar  dup=0;\r\n");
              out.write("\tvar data =  window.showModalDialog('process?action=Indictment_pop&cmd=add' , self , 'dialogWidth=700px,Height=400px');\r\n");
              out.write("\tif(data != null){\r\n");
              out.write("\t\tfor (var i=0; i < data.length; i++)\r\n");
              out.write("\t\t{\r\n");
              out.write("\t\t\tdup=0;\r\n");
              out.write("\t\t\tif (incmaxrow>1)\r\n");
              out.write("\t\t\t{\r\n");
              out.write("\t\t\t\tif (incmaxrow == 2){\r\n");
              out.write("\t\t\t\t\tif (document.dataform.aai_indictment_id.value==data[i][5])\r\n");
              out.write("\t\t\t\t\t{\r\n");
              out.write("\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t}else{\r\n");
              out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aai_indictment_id.length; j++)\r\n");
              out.write("\t\t\t\t\t{\r\n");
              out.write("\t\t\t\t\t\tif (document.dataform.aai_indictment_id[j].value==data[i][5])\r\n");
              out.write("\t\t\t\t\t\t\t{\r\n");
              out.write("\t\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\t\t\tif (dup==0)\r\n");
              out.write("\t    \t{\r\n");
              out.write("\t\t    \tincinsRow(myTable,incmaxrow,data[i][1],data[i][2],data[i][3],data[i][4],'',data[i][5]);\r\n");
              out.write("\t\t    }\r\n");
              out.write("\t    }\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("function incget_check_value(myTable)\r\n");
              out.write("{\r\n");
              out.write("\tvar c_value = \"\";\r\n");
              out.write("\tvar x = incmaxrow;\r\n");
              out.write("\tif (incmaxrow == 2 && document.dataform.inccheckbox.checked)\r\n");
              out.write("\t{\r\n");
              out.write("\t\tdocument.getElementById(myTable).deleteRow(1);\r\n");
              out.write("\t\tincmaxrow--;\r\n");
              out.write("\t\twriteTranLog('ลบข้อกล่าวหาในบันทึกการจับกุม');\t\r\n");
              out.write("\t}else{\r\n");
              out.write("\t\tfor (var i=0; i < document.dataform.inccheckbox.length -1 ; i++){\r\n");
              out.write("\t\t\t if (document.dataform.inccheckbox[i+1].checked){\r\n");
              out.write("\t\t\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
              out.write("\t\t\t\ti--;\r\n");
              out.write("\t\t\t\tincmaxrow--;\r\n");
              out.write("\t\t     }\r\n");
              out.write("\t   \t}\r\n");
              out.write("\t   //alert(incmaxrow-1);\r\n");
              out.write("\t   if(x!=incmaxrow){\r\n");
              out.write("\t\t    writeTranLog('ลบข้อกล่าวหาในบันทึกการจับกุม');\r\n");
              out.write("\t\t\tincrerun_id();\r\n");
              out.write("\t\t}\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("function incrender(myTable)\r\n");
              out.write("{\r\n");
              out.write(" \tfor (i=0;i<incdata1.length;i++)\r\n");
              out.write("    {\r\n");
              out.write("        incinsRow(myTable,i,incdata1[i],incdata2[i],incdata3[i],incdata4[i],incdata5[i],incdata6[i]);\r\n");
              out.write("    }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("var incdata1 =new Array();\r\n");
              out.write("var incdata2 =new Array();\r\n");
              out.write("var incdata3 =new Array();\r\n");
              out.write("var incdata4 =new Array();\r\n");
              out.write("var incdata5 =new Array();\r\n");
              out.write("var incdata6 =new Array();\r\n");
              out.write("\r\n");
              out.write("function incCheck(chkcont,chk)\r\n");
              out.write("{\r\n");
              out.write("\tif(chkcont.checked==true){\r\n");
              out.write("\t\tfor (i = 0; i < chk.length; i++)\r\n");
              out.write("\t\t\tchk[i].checked = true ;\r\n");
              out.write("\t}else{\r\n");
              out.write("\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
              out.write("\t\t\t\tchk[i].checked = false ;\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("</script>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td width=\"20%\" height=\"25\" align=\"right\" valign=\"top\">ข้อกล่าวหา :&nbsp;</td>\r\n");
              out.write("    <td width=\"80%\" colspan=\"3\">\r\n");
              out.write("        <table class=\"tableList\" id=incTable width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
              out.write("             <tr class=\"TblHeaderColumn AlignCenter\">\r\n");
              out.write("                  <td width=\"10%\">ลำดับที่</td>\r\n");
              out.write("                  <td width=\"5%\" ><input type=\"checkbox\" name=\"incallCheckbox\" value=\"\" onClick=\"incCheck(this,document.dataform.inccheckbox);\" />\r\n");
              out.write("\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"inccheckbox\"></td>\r\n");
              out.write("                  <td width=\"20%\">มาตรา</td>\r\n");
              out.write("                  <td width=\"15%\">บทกำหนดโทษ</td>\r\n");
              out.write("                  <td width=\"50%\">ข้อกล่าวหา</td>\r\n");
              out.write("             </tr>\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_c_005fforEach_005f6(_jspx_th_c_005fif_005f44, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("        </table>\r\n");
              out.write("\t\t\t<span class=\"spanLink\" onClick=\"incopenmodal('incTable');\">\r\n");
              out.write("\t\t\t เพิ่มรายการ\r\n");
              out.write("\t\t\t</span> |\r\n");
              out.write("\t\t\t<span class=\"spanLink\" onClick=\"incget_check_value('incTable');\">ลบรายการ</span>\r\n");
              out.write("    </td>\r\n");
              out.write("   </tr>\r\n");
              out.write("   <tr>\r\n");
              out.write("      <td colspan=\"4\" height=\"25\" align=\"right\">&nbsp;</td>\r\n");
              out.write("   </tr>\r\n");
              out.write("</table>\r\n");
              out.write("<script>\r\n");
              out.write("incrender('incTable');\r\n");
              out.write("</script>");
              out.write("  <!-- ข้อกล่าวหา-->\r\n");
              out.write("                  \t");
              int evalDoAfterBody = _jspx_th_c_005fif_005f44.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fif_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f44);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f44);
          out.write("\r\n");
          out.write("                  \t");
          if (_jspx_meth_c_005fif_005f60(_jspx_th_c_005fif_005f43, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f43.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f43);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f43);
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                 <td>&nbsp;</td>\r\n");
      out.write("                 <td colspan=\"2\"> <hr /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("                  <!-- รายละเอียดแท็บต่างๆ-->\r\n");
      out.write("                  ");
      if (_jspx_meth_c_005fif_005f99(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f106 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f106.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f106.setParent(null);
      _jspx_th_c_005fif_005f106.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.chkcaselast == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f106 = _jspx_th_c_005fif_005f106.doStartTag();
      if (_jspx_eval_c_005fif_005f106 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  \t");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f107 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_005fif_005f107.setPageContext(_jspx_page_context);
          _jspx_th_c_005fif_005f107.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f106);
          _jspx_th_c_005fif_005f107.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEdit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fif_005f107 = _jspx_th_c_005fif_005f107.doStartTag();
          if (_jspx_eval_c_005fif_005f107 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                  \t\t");
              out.write('\r');
              out.write('\n');
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<link href=\"/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
              out.write("<script type='text/javascript' src='dwr/interface/Lawbreaker.js'></script>\r\n");
              out.write("\r\n");
              out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
              out.write(" \tfunction toggleHidden(mID, btnID){\r\n");
              out.write("\r\n");
              out.write("\tdocument.getElementById('app2_39').style.display='none';\r\n");
              out.write("\tdocument.getElementById('lawbreaker_list').style.display='none';\r\n");
              out.write("\tdocument.getElementById('arrestTeam').style.display='none';\r\n");
              out.write("\tdocument.getElementById('exhibitList').style.display='none';\r\n");
              out.write("\tdocument.getElementById('licenseList').style.display='none';\r\n");
              out.write("\tdocument.getElementById('2_6Tab').style.display='none';\r\n");
              out.write("\r\n");
              out.write("\tdocument.getElementById('btn2_39').style.background='#D4D0C8';\r\n");
              out.write("\tdocument.getElementById('btnLawbreakerList').style.background='#D4D0C8';\r\n");
              out.write("\tdocument.getElementById('btnArrestTeam').style.background='#D4D0C8';\r\n");
              out.write("\tdocument.getElementById('btnExhibitList').style.background='#D4D0C8';\r\n");
              out.write("\tdocument.getElementById('btnLicenseList').style.background='#D4D0C8';\r\n");
              out.write("\tdocument.getElementById('btn2_6').style.background='#D4D0C8';\r\n");
              out.write("\r\n");
              out.write("\tmnu = document.getElementById(mID);\r\n");
              out.write("\tbtn = document.getElementById(btnID);\r\n");
              out.write("\tif (mnu.style.display == 'none'){\r\n");
              out.write("\t\tmnu.style.display ='';\r\n");
              out.write("\t\tbtn.style.background='#FFCC33';\r\n");
              out.write("\t}else{\r\n");
              out.write("\t\tmnu.style.display ='none';\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function allCheck(chkcont,chk)\r\n");
              out.write("{\r\n");
              out.write("\tif(chk != null){\r\n");
              out.write("\t\tif(!chk.length){\r\n");
              out.write("\t\t\tif(chkcont.checked==true){\r\n");
              out.write("\t\t\t\tchk.checked = true ;\r\n");
              out.write("\t\t\t}else{\r\n");
              out.write("\t\t\t\tchk.checked = false ;\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\t\t}else{\r\n");
              out.write("\t\t\tif(chkcont.checked==true){\r\n");
              out.write("\t\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
              out.write("\t\t\t\t\tchk[i].checked = true ;\r\n");
              out.write("\t\t\t}else{\r\n");
              out.write("\t\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
              out.write("\t\t\t\t\tchk[i].checked = false ;\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\t\t}\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("</script>\r\n");
              out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
              out.write("  <tr>\r\n");
              out.write("    <td width=\"1%\">&nbsp;</td>\r\n");
              out.write("     <td style=\"cursor:hand;\" width=\"98%\" >\r\n");
              out.write("        <input name=\"btnLawbreakerList\" id=\"btnLawbreakerList\" type=\"button\" class=\"button\" value=\"รายชื่อผู้กระทำผิดกฎหมาย\" onClick='toggleHidden(\"lawbreaker_list\",\"btnLawbreakerList\");' style=\"background:#FFCC33\">&nbsp;&nbsp;\r\n");
              out.write("        <input name=\"btn2_39\" id=\"btn2_39\" type=\"button\" class=\"button\" value=\"บันทึกการจับ\" onClick='toggleHidden(\"app2_39\", \"btn2_39\");' >&nbsp;&nbsp;\r\n");
              out.write("        <input name=\"btnArrestTeam\" id=\"btnArrestTeam\" type=\"button\" class=\"button\" value=\"คณะผู้จับกุม\" onClick='toggleHidden(\"arrestTeam\",\"btnArrestTeam\");'>&nbsp;&nbsp;\r\n");
              out.write("        <input name=\"btnExhibitList\" id=\"btnExhibitList\" type=\"button\" class=\"button\" value=\"บัญชีสิ่งของ\" onClick='toggleHidden(\"exhibitList\",\"btnExhibitList\");'>&nbsp;&nbsp;\r\n");
              out.write("        <input name=\"btnLicenseList\" id=\"btnLicenseList\" type=\"button\" class=\"button\" value=\"ข้อมูลใบอนุญาต/ข้อมูลสืบสวน\" onClick='toggleHidden(\"licenseList\",\"btnLicenseList\");'>&nbsp;&nbsp;\r\n");
              out.write("\t\t<input name=\"btn2_6\" id=\"btn2_6\" type=\"button\" class=\"button\" value=\"รายงานบันทึกการจับ 2/6ก\" onClick='toggleHidden(\"2_6Tab\",\"btn2_6\");'>\r\n");
              out.write("     </td>\r\n");
              out.write("     <td width=\"1%\" >&nbsp;\r\n");
              out.write("\r\n");
              out.write("     </td>\r\n");
              out.write("  </tr>\r\n");
              out.write("  <tr >\r\n");
              out.write("     <td>&nbsp;</td>\r\n");
              out.write("     <td>\r\n");
              out.write("      <!-- ==============================================ผู้กระทำผิด======================================================== -->\r\n");
              out.write("<script>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("var lawsmaxrow=1; // jsp  Count  config\r\n");
              out.write("var lawsstartrow=2;\r\n");
              out.write("var lawseditrow = -1;\r\n");
              out.write("var lawseditna = 0;\r\n");
              out.write("var row;\r\n");
              out.write("function lawsinsRow(myTable,lawsmaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data0, data35, data36)\r\n");
              out.write("{\r\n");
              out.write("//var row;\r\n");
              out.write("\r\n");
              out.write("var x=document.getElementById(myTable).insertRow(lawsmaxrow);\r\n");
              out.write("lawsmaxrow++;\r\n");
              out.write("row = lawsmaxrow-1;\r\n");
              out.write("var y1=x.insertCell(0);\r\n");
              out.write("var y2=x.insertCell(1);\r\n");
              out.write("var y3=x.insertCell(2);\r\n");
              out.write("var y4=x.insertCell(3);\r\n");
              out.write("var y5=x.insertCell(4);\r\n");
              out.write("var y6=x.insertCell(5);\r\n");
              out.write("var y7=x.insertCell(6);\r\n");
              out.write("var y8=x.insertCell(7);\r\n");
              out.write("var y9=x.insertCell(8);\r\n");
              out.write("var y10=x.insertCell(9);\r\n");
              out.write("var y11=x.insertCell(10);\r\n");
              out.write("var y12=x.insertCell(11);\r\n");
              out.write("var y13=x.insertCell(12);\r\n");
              out.write("var y14=x.insertCell(13);\r\n");
              out.write("\r\n");
              out.write("var exp = new Date();\r\n");
              out.write("var s = exp.getTime();\r\n");
              out.write("//alert(data0);\r\n");
              out.write("y1.innerHTML=\"<input readonly class='textboxlist' size='1' name='lawstc_id' value='\" + row + \"' />\";\r\n");
              out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"lawscheck_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"lawsref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
              out.write("if(data1==\"3\"){\r\n");
              out.write("    y3.innerHTML= \"<a class='spanLink' onClick=\\\"lawsforedit('\"+ s +\"');lawseditmodal('lawsTable','\"+data13+\"','\"+data14+ \"');lawsrerun_id();\\\">\" + data0+\" \"+data32+ \"</a>\";\r\n");
              out.write("}else{\r\n");
              out.write("\tif(data4!=\"\" && data4 != null)\r\n");
              out.write("\t\ty3.innerHTML= \"<a class='spanLink' onClick=\\\"lawsforedit('\"+ s +\"');lawseditmodal('lawsTable','\"+data13+\"','\"+data14+ \"');lawsrerun_id();\\\">\" + data22+data5+ \" \" + data30 +\" \"+data6 +  \"</a>\";\r\n");
              out.write("\telse\r\n");
              out.write("\t\ty3.innerHTML= \"<a class='spanLink' onClick=\\\"lawsforedit('\"+ s +\"');lawseditmodal('lawsTable','\"+data13+\"','\"+data14+ \"');lawsrerun_id();\\\">\" + data5+ \" \" + data30 +\" \"+data6 +  \"</a>\";\r\n");
              out.write("}\r\n");
              out.write("if (data1==\"1\")\r\n");
              out.write("{y4.innerHTML=\"คนไทย\";}\r\n");
              out.write("else if(data1==\"2\")\r\n");
              out.write("{y4.innerHTML=\"ชาวต่างชาติ\";}\r\n");
              out.write("else{y4.innerHTML=\"ผู้ประกอบการ\";}\r\n");
              out.write("\r\n");
              out.write("\ty5.innerHTML=data17;\r\n");
              out.write("\ty6.innerHTML=data18;\r\n");
              out.write("\ty7.innerHTML=data2;\r\n");
              out.write("\ty8.innerHTML=data29;\r\n");
              out.write("\ty9.innerHTML=data26;\r\n");
              out.write("\ty10.innerHTML=data27;\r\n");
              out.write("\ty11.innerHTML=data8+\" หมู่ \"+data9+\" ซอย \"+data10+\" ถ. \"+data11+\" ต. \"+data25+\" อ. \"+data24+\" จ. \"+data23;\r\n");
              out.write("\ty12.innerHTML=data19;\r\n");
              out.write("\ty13.innerHTML=data20;\r\n");
              out.write("\ty14.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"aal_culprit_type\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_lawbreaker_id_card\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_sex\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_title_code\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_first_name\\\" value=\\\"\"+data5+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_last_name\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_other_name\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_address_no\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_moo\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_soi\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_road\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_province\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_district\\\" value=\\\"\"+data13+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_subdistrict\\\" value=\\\"\"+data14+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_race_id\\\" value=\\\"\"+data15+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_nationality_id\\\" value=\\\"\"+data16+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_career\\\" value=\\\"\"+data17+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_birth_date\\\" value= \\\"\"+data18+ \"\\\" >\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_father_name\\\" value=\\\"\"+data19+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_mother_name\\\" value=\\\"\"+data20+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_id\\\" value=\\\"\"+data21+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_title_name\\\" value=\\\"\"+data22+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_province_name\\\" value=\\\"\"+data23+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_district_name\\\" value=\\\"\"+data24+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_subdistrict_name\\\" value=\\\"\"+data25+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_race_id_name\\\" value=\\\"\"+data26+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_nationality_id_name\\\" value=\\\"\"+data27+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_testimony\\\" value=\\\"\"+data28+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_lawbreaker_passport\\\" value=\\\"\"+data29+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_middle_name\\\" value=\\\"\"+data30+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_company_title_code\\\" value=\\\"\"+data31+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_company_name\\\" value=\\\"\"+data32+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_excise_reg_no\\\" value=\\\"\"+data33+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_corporation_code\\\" value=\\\"\"+data34+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_age\\\" value=\\\"\"+data35+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_lawbreaker_no\\\" value=\\\"\"+data36+\"\\\">\"\r\n");
              out.write("\t+\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.testimony}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\";\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\tdocument.dataform.laws_qty.value = row;\r\n");
              out.write("\tif(row>1){\r\n");
              out.write("\t\tdocument.dataform.alleged_co.checked = true;\r\n");
              out.write("\t}else{\r\n");
              out.write("\t\tdocument.dataform.alleged_co.checked = false;\r\n");
              out.write("\t}\r\n");
              out.write("\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function lawsforedit(row)\r\n");
              out.write("{\r\n");
              out.write("\t//alert(lawsmaxrow);\r\n");
              out.write("\tif (lawsmaxrow>2)\r\n");
              out.write("\t{\r\n");
              out.write("\t  for (var i=0; i < document.dataform.lawsref_id.length; i++)\r\n");
              out.write("\t   {\r\n");
              out.write("\t\t\tif (document.dataform.lawsref_id[i].value== row)\r\n");
              out.write("\t\t\t{//alert(i+1);\r\n");
              out.write("\t\t\t\tlawseditrow = i+1;\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\t   }\r\n");
              out.write("\t }\r\n");
              out.write("\t else\r\n");
              out.write("\t {//alert(\"1\");\r\n");
              out.write("\t \tlawseditrow = 1;\r\n");
              out.write("\t }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function lawsdelRow(myTable)\r\n");
              out.write("{\r\n");
              out.write("\tif (lawsmaxrow>1)\r\n");
              out.write("\t{\r\n");
              out.write("\t\tvar x=document.getElementById(myTable).deleteRow(myTable,lawsmaxrow-1);\r\n");
              out.write("\t\tlawsmaxrow--;\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function lawsalternate(id){\r\n");
              out.write(" if(document.getElementsByTagName){\r\n");
              out.write("   var table = document.getElementById(id);\r\n");
              out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
              out.write("   for(i = 0; i < rows.length; i++){\r\n");
              out.write(" //manipulate rows\r\n");
              out.write("     if(i % 2 == 0){\r\n");
              out.write("       rows[i].className = \"even\";\r\n");
              out.write("     }else{\r\n");
              out.write("       rows[i].className = \"odd\";\r\n");
              out.write("     }\r\n");
              out.write("   }\r\n");
              out.write(" }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function lawsrerun_id(){\r\n");
              out.write("\tif (lawsmaxrow==2){\r\n");
              out.write("\t\tdocument.dataform.lawstc_id.value=1;\r\n");
              out.write("\t}else if(lawsmaxrow>2){\r\n");
              out.write("\t\tfor (var i=0; i < document.dataform.lawstc_id.length; i++){\r\n");
              out.write("\t\t\tdocument.dataform.lawstc_id[i].value=i+1;\r\n");
              out.write("\t    }\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function lawsdelRown(myTable,Rown)\r\n");
              out.write("{\r\n");
              out.write("\tvar x=document.getElementById(myTable).deleteRow(Rown);\r\n");
              out.write("\tlawsmaxrow--;\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("function lawsopenmodal(myTable)\r\n");
              out.write("{\r\n");
              out.write("\tif(document.dataform.have_culprit[0].checked == false){\r\n");
              out.write("\t\talert(\"ไม่สามารถเพิ่มผู้กระทำผิดได้เนื่องจากเป็นคดีไม่มีตัวผู้กระทำผิด\");\r\n");
              out.write("\t\treturn;\r\n");
              out.write("\t}\r\n");
              out.write("\t\r\n");
              out.write("\tvar data = window.showModalDialog('process?action=arrest_lawbreaker&cmd=add' , self , 'dialogWidth=600px,Height=530px');\r\n");
              out.write("\tif(data != null){\r\n");
              out.write("\t\tdup=0;\r\n");
              out.write("\t\tif (lawsmaxrow>1){\r\n");
              out.write("\t\t\tif(data[1]==\"1\"){\r\n");
              out.write("\t\t\t\t//ชื่อผู้กระทำผิดคนไทย \r\n");
              out.write("\t\t\t\t//alert(document.dataform.aal_title_name.value + document.dataform.aal_first_name.value + \" \" + document.dataform.aal_last_name.value  + \" $$$$$$$ \" + data[22]+data[5] + \" \" + data[6]);\r\n");
              out.write("\t\t\t\tif (lawsmaxrow == 2){\r\n");
              out.write("\t\t\t\t\tif (document.dataform.aal_lawbreaker_id_card.value==data[2] && data[2] != \"\") //เลขบัตรประชาชน\r\n");
              out.write("\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\telse if(document.dataform.aal_title_name.value + document.dataform.aal_first_name.value + \" \" + document.dataform.aal_last_name.value == data[22]+data[5] + \" \" + data[6])\r\n");
              out.write("\t\t\t\t\t\tdup=1;\t\r\n");
              out.write("\t\t\t\t}else{\r\n");
              out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aal_lawbreaker_id_card.length; j++){\r\n");
              out.write("\t\t\t\t\t\t//alert (document.dataform.aat_staff_idcardno[j].value+ \"-\" +data[i][5]);\r\n");
              out.write("\t\t\t\t\t\t//alert(document.dataform.aal_title_name[j].value + document.dataform.aal_first_name[j].value + \" \" + document.dataform.aal_last_name[j].value  + \" $$$$$$$ \" + data[22]+data[5] + \" \" + data[6]);\r\n");
              out.write("\t\t\t\t\t\tif (document.dataform.aal_lawbreaker_id_card[j].value==data[2] && data[2] != \"\" )\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t\telse if(document.dataform.aal_title_name[j].value + document.dataform.aal_first_name[j].value + \" \" + document.dataform.aal_last_name[j].value  == data[22]+data[5] + \" \" + data[6])\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t\t\r\n");
              out.write("\t\t\t}else if(data[1]==\"2\"){\r\n");
              out.write("\t\t\t\t//ชื่อผู้กระทำผิดชาวต่างชาติ\r\n");
              out.write("\t\t\t\tif (lawsmaxrow == 2){\r\n");
              out.write("\t\t\t\t\tif (document.dataform.aal_lawbreaker_passport.value==data[29] && data[29] != \"\")\r\n");
              out.write("\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\telse if(document.dataform.aal_title_name.value + document.dataform.aal_first_name.value + \" \" + document.dataform.aal_middle_name.value + \" \" + document.dataform.aal_last_name.value == data[22]+data[5] + \" \" + data[30] + \" \" + data[6])\r\n");
              out.write("\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t}else{\r\n");
              out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aal_lawbreaker_passport.length; j++){\r\n");
              out.write("\t\t\t\t\t\t//alert (document.dataform.aat_staff_idcardno[j].value+ \"-\" +data[i][5]);\r\n");
              out.write("\t\t\t\t\t\tif (document.dataform.aal_lawbreaker_passport[j].value==data[29] && data[29] != \"\" )\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t\telse if(document.dataform.aal_title_name[j].value + document.dataform.aal_first_name[j].value + \" \" + document.dataform.aal_middle_name[j].value + \" \" + document.dataform.aal_last_name[j].value == data[22]+data[5] + \" \" + data[30] + \" \" + data[6])\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t}else if(data[1]==\"3\"){\r\n");
              out.write("\t\t\t\t//ชื่อผู้กระทำผิดผู้กระกอบการ\r\n");
              out.write("\t\t\t\tif (lawsmaxrow == 2){\r\n");
              out.write("\t\t\t\t\tif (document.dataform.aal_excise_reg_no.value==data[33] && data[33] != \"\")\r\n");
              out.write("\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\telse if(document.dataform.aal_company_title_code.value + document.dataform.aal_company_name.value == data[31]+data[32])\r\n");
              out.write("\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t}else{\r\n");
              out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aal_excise_reg_no.length; j++){\r\n");
              out.write("\t\t\t\t\t\t//alert (document.dataform.aat_staff_idcardno[j].value+ \"-\" +data[i][5]);\r\n");
              out.write("\t\t\t\t\t\tif (document.dataform.aal_excise_reg_no[j].value==data[33] && data[33] != \"\" )\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t\telse if(document.dataform.aal_company_title_code[j].value + document.dataform.aal_company_name[j].value == data[31]+data[32])\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\r\n");
              out.write("\t\t\t//ตรวจสอบจาก LAWBREAKER_NO\r\n");
              out.write("\t\t\tif (lawsmaxrow == 2){\r\n");
              out.write("\t\t\t\tif (document.dataform.aal_lawbreaker_no.value==data[36] && data[36] != \"\")\r\n");
              out.write("\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t}else{\r\n");
              out.write("\t\t\t\tfor (var j=0; j < document.dataform.aal_lawbreaker_no.length; j++){\r\n");
              out.write("\t\t\t\t\tif (document.dataform.aal_lawbreaker_no[j].value==data[36] && data[36] != \"\" )\r\n");
              out.write("\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\t\t}\r\n");
              out.write("\t\t\r\n");
              out.write("\t\tif (dup==0){\r\n");
              out.write("\t\t\tlawsinsRow(myTable,lawsmaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],\"\",data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[0],data[35],data[36]);\r\n");
              out.write("\t\t}else{\r\n");
              out.write("\t\t\talert(\"เพิ่มชื่อผู้กระทำผิดซ้ำ\");\r\n");
              out.write("\t\t}\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function lawseditmodal(myTable,p1,p2)\r\n");
              out.write("{\r\n");
              out.write("\twriteTranLog('แสดงรายละเอียดผู้กระทำผิด');\r\n");
              out.write("\tlawseditna= 1;\r\n");
              out.write("\tvar data = window.showModalDialog('process?action=arrest_lawbreaker&cmd=add&p1='+p1+'&p2='+p2 , self , 'dialogWidth=600px,Height=500px');\r\n");
              out.write("\tif(data != null){\r\n");
              out.write("\t\tdup=0;\r\n");
              out.write("\t\tif (lawsmaxrow>1){\r\n");
              out.write("\t\t\tif(data[1]==\"1\"){\r\n");
              out.write("\t\t\t\t//ชื่อผู้กระทำผิดคนไทย \r\n");
              out.write("\t\t\t\tif (lawsmaxrow >= 2){\r\n");
              out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aal_lawbreaker_id_card.length; j++){\r\n");
              out.write("\t\t\t\t\t\tif (document.dataform.aal_lawbreaker_id_card[j].value==data[2] && data[2] != \"\" && lawseditrow != (j+1))\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t\telse if(document.dataform.aal_title_name[j].value + document.dataform.aal_first_name[j].value + \" \" + document.dataform.aal_last_name[j].value  == data[22]+data[5] + \" \" + data[6]  && lawseditrow != (j+1))\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t\t\r\n");
              out.write("\t\t\t}else if(data[1]==\"2\"){\r\n");
              out.write("\t\t\t\t//ชื่อผู้กระทำผิดชาวต่างชาติ\r\n");
              out.write("\t\t\t\tif (lawsmaxrow >= 2){\r\n");
              out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aal_lawbreaker_passport.length; j++){\r\n");
              out.write("\t\t\t\t\t\tif (document.dataform.aal_lawbreaker_passport[j].value==data[29] && data[29] != \"\" && lawseditrow != (j+1))\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t\telse if(document.dataform.aal_title_name[j].value + document.dataform.aal_first_name[j].value + \" \" + document.dataform.aal_middle_name[j].value + \" \" + document.dataform.aal_last_name[j].value == data[22]+data[5] + \" \" + data[30] + \" \" + data[6]  && lawseditrow != (j+1))\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t}else if(data[1]==\"3\"){\r\n");
              out.write("\t\t\t\t//ชื่อผู้กระทำผิดผู้กระกอบการ\r\n");
              out.write("\t\t\t\tif (lawsmaxrow >= 2){\r\n");
              out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aal_excise_reg_no.length; j++){\r\n");
              out.write("\t\t\t\t\t\tif (document.dataform.aal_excise_reg_no[j].value==data[33] && data[33] != \"\" && lawseditrow != (j+1))\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t\telse if(document.dataform.aal_company_title_code[j].value + document.dataform.aal_company_name[j].value == data[31]+data[32]  && lawseditrow != (j+1))\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\r\n");
              out.write("\t\t\t//ตรวจสอบจาก LAWBREAKER_NO\r\n");
              out.write("\t\t\tif (lawsmaxrow >= 2){\r\n");
              out.write("\t\t\t\tfor (var j=0; j < document.dataform.aal_lawbreaker_no.length; j++){\r\n");
              out.write("\t\t\t\t\tif (document.dataform.aal_lawbreaker_no[j].value==data[36] && data[36] != \"\" && lawseditrow != (j+1))\r\n");
              out.write("\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\t\t}\r\n");
              out.write("\r\n");
              out.write("\t\tif (dup==0){\r\n");
              out.write("\t\t\tlawsdelRown(myTable,lawseditrow);\r\n");
              out.write("\t\t\tlawsinsRow(myTable,lawsmaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[0],data[35],data[36]);\r\n");
              out.write("\t\t}else{\r\n");
              out.write("\t\t\talert(\"เพิ่มชื่อผู้กระทำผิดซ้ำ\");\r\n");
              out.write("\t\t}\r\n");
              out.write("\t}\r\n");
              out.write("\tlawseditna = 0;\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("function lawsCheck(chk)\r\n");
              out.write("{\r\n");
              out.write("if(document.dataform.lawsCheck_ctr.checked==true){\r\n");
              out.write("\tfor (i = 0; i < lawschk.length; i++)\r\n");
              out.write("\tlawschk[i].checked = true ;\r\n");
              out.write("}else{\r\n");
              out.write("\tfor (i = 0; i < lawschk.length; i++)\r\n");
              out.write("\t\tlawschk[i].checked = false ;\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function lawsget_check_value(myTable){\r\n");
              out.write("\tvar c_value = \"\";\r\n");
              out.write("\tvar x=lawsmaxrow;\r\n");
              out.write("\r\n");
              out.write("\tdocument.dataform.aalchkAll.checked = false;\r\n");
              out.write("\tif (lawsmaxrow == 2 && document.dataform.lawscheck_list.checked){\r\n");
              out.write("\t\tdocument.getElementById(myTable).deleteRow(1);\r\n");
              out.write("\t\tlawsmaxrow--;\r\n");
              out.write("\t\twriteTranLog('ลบรายชื่อผู้กระทำผิด');\t\r\n");
              out.write("\t}else{\r\n");
              out.write("\t\t\r\n");
              out.write("\t\tif(document.dataform.lawscheck_list != null){\r\n");
              out.write("\t\t\tvar listCount = document.dataform.lawscheck_list.length;\r\n");
              out.write("\t\t\tvar chk = document.dataform.lawscheck_list;\r\n");
              out.write("\t\t\tfor (var i=0; i < listCount; i++){\r\n");
              out.write("\t\t\t\tif(lawsmaxrow > 1){\r\n");
              out.write("\t\t\t\t   if (chk[i] != null && chk[i].checked){\r\n");
              out.write("\t\t\t\t\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
              out.write("\t\t\t\t\t\ti--;\r\n");
              out.write("\t\t\t\t\t\tlawsmaxrow--;\r\n");
              out.write("\t\t\t\t   }\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t    }\r\n");
              out.write("\r\n");
              out.write("\t\t\tif(x!=lawsmaxrow){\r\n");
              out.write("\t\t\t    writeTranLog('ลบรายชื่อผู้กระทำผิด');\r\n");
              out.write("\t\t    }\r\n");
              out.write("\t\t}\r\n");
              out.write("\t\tlawsrerun_id();\r\n");
              out.write("\t}\r\n");
              out.write("\r\n");
              out.write("\tdocument.dataform.laws_qty.value = lawsmaxrow-1;\r\n");
              out.write("\tif(parseInt(document.dataform.laws_qty.value)>1) \r\n");
              out.write("\t\tdocument.dataform.alleged_co.checked = true;\r\n");
              out.write("\telse\r\n");
              out.write("\t\tdocument.dataform.alleged_co.checked = false;\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function lawsrender(myTable)\r\n");
              out.write("{\r\n");
              out.write(" for (i=1;i<=lawsdata1.length-1;i++)\r\n");
              out.write("    {\r\n");
              out.write("        lawsinsRow(myTable,i,lawsdata1[i],lawsdata2[i],lawsdata3[i],lawsdata4[i],lawsdata5[i],lawsdata6[i],lawsdata7[i],lawsdata8[i],lawsdata9[i],lawsdata10[i],lawsdata11[i],lawsdata12[i],lawsdata13[i],lawsdata14[i],lawsdata15[i],lawsdata16[i],lawsdata17[i],lawsdata18[i],lawsdata19[i],lawsdata20[i],lawsdata21[i],lawsdata22[i],lawsdata23[i],lawsdata24[i] ,lawsdata25[i],lawsdata26[i],lawsdata27[i],lawsdata28[i],lawsdata29[i],lawsdata30[i],lawsdata31[i],lawsdata32[i],lawsdata33[i],lawsdata34[i],lawsdata31[i],lawsdata35[i], lawsdata36[i]);\r\n");
              out.write("    }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("</script>\r\n");
              out.write("<script>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("var lawsdata1 =new Array();\r\n");
              out.write("var lawsdata2 =new Array();\r\n");
              out.write("var lawsdata3 =new Array();\r\n");
              out.write("var lawsdata4 =new Array();\r\n");
              out.write("var lawsdata5 =new Array();\r\n");
              out.write("var lawsdata6 =new Array();\r\n");
              out.write("var lawsdata7 =new Array();\r\n");
              out.write("var lawsdata8 =new Array();\r\n");
              out.write("var lawsdata9 =new Array();\r\n");
              out.write("var lawsdata10 =new Array();\r\n");
              out.write("var lawsdata11 =new Array();\r\n");
              out.write("var lawsdata12 =new Array();\r\n");
              out.write("var lawsdata13 =new Array();\r\n");
              out.write("var lawsdata14 =new Array();\r\n");
              out.write("var lawsdata15 =new Array();\r\n");
              out.write("var lawsdata16 =new Array();\r\n");
              out.write("var lawsdata17 =new Array();\r\n");
              out.write("var lawsdata18 =new Array();\r\n");
              out.write("var lawsdata19 =new Array();\r\n");
              out.write("var lawsdata20 =new Array();\r\n");
              out.write("var lawsdata21 =new Array();\r\n");
              out.write("var lawsdata22 =new Array();\r\n");
              out.write("var lawsdata23 =new Array();\r\n");
              out.write("var lawsdata24 =new Array();\r\n");
              out.write("var lawsdata25 =new Array();\r\n");
              out.write("var lawsdata26 =new Array();\r\n");
              out.write("var lawsdata27 =new Array();\r\n");
              out.write("var lawsdata28 =new Array();\r\n");
              out.write("var lawsdata29 =new Array();\r\n");
              out.write("var lawsdata30 =new Array();//middle name\r\n");
              out.write("var lawsdata31 =new Array();//title company code\r\n");
              out.write("var lawsdata32 =new Array();//company name\r\n");
              out.write("var lawsdata33 =new Array();//aal.excise_reg_no\r\n");
              out.write("var lawsdata34 =new Array();//aal.corporation_code\r\n");
              out.write("var lawsdata35 = new Array();//text age\r\n");
              out.write("var lawsdata36 = new Array(); //lawbreaker_no\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("</script>\r\n");
              out.write("<!-- ==============================================ปิดผู้กระทำผิด======================================================== -->\r\n");
              out.write("\r\n");
              out.write(" <!-- รายชื่อผู้กระทำความผิด-->\r\n");
              out.write(" \t\r\n");
              out.write("          <div class=\"innerPosition\" id=\"lawbreaker_list\" >\r\n");
              out.write("               <table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
              out.write("\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t  <span class=\"spanLink\" onClick=\"lawsopenmodal('lawsTable');\"> เพิ่มใหม่</span> | \r\n");
              out.write("\t\t\t\t\t\t\t  <span  class=\"spanLink\" onClick = \"lawsget_check_value('lawsTable')\">ลบรายการที่เลือก</span>\r\n");
              out.write("\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t</tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                         <td>\r\n");
              out.write("                                <table name=\"lawsTable\" id=\"lawsTable\" class=\"tableList\" width=\"1500\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
              out.write("                                   <tr>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn aligncenter\">ลำดับที่</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn aligncenter\"><input id=\"aalchkAll\" name=\"aalchkAll\" type=\"checkbox\" onClick=\"allCheck(this,document.dataform.lawscheck_list);\"/></td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">ชื่อผู้กระทำผิด</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">ประเภทผู้กระทำความผิด</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">อาชีพ</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">วันเกิด</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">เลขที่บัตรปชช</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">เลขที่หนังสือเดินทาง</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">เชื้อชาติ</td>\r\n");
              out.write("                                      <td class=\"TblHeaderColumn\">สัญชาติ</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">ที่อยู่</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">ชื่อบิดา</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">ชื่อมารดา</td>\r\n");
              out.write("                                     <td class=\"TblHeaderColumn\">คำให้การของผู้ต้องหา</td>\r\n");
              out.write("                                   </tr>\r\n");
              out.write("                                   ");
              if (_jspx_meth_c_005fforEach_005f15(_jspx_th_c_005fif_005f107, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                </table>\r\n");
              out.write("\r\n");
              out.write("                         </td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("               </table>\r\n");
              out.write("          </div>\r\n");
              out.write("          <!-- END รายชื่อผู้กระทำความผิด-->\r\n");
              out.write("\r\n");
              out.write("          <!-- mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmบันทึกจับกุมmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("         <div class=\"innerPosition\"  id=\"app2_39\" style=\"width:750px;display:none\">\r\n");
              out.write("                 <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
              out.write("\r\n");
              out.write("                    <tr>\r\n");
              out.write("                         <td colspan=\"2\" align=\"center\">\r\n");
              out.write("                              <table width=\"100%\">\r\n");
              out.write("                                 <tr valign=\"top\">\r\n");
              out.write("                                     <td width=\"120\"  align=\"right\">พฤติการณ์ในการจับ :</td>\r\n");
              out.write("                                     <td align=\"left\"><textarea name=\"behaviour\" id=\"behaviour\" cols=\"45\" rows=\"9\" class=\"textareabig\"  >");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(db.behaviour != null)?(db.behaviour):('รับสารภาพตลอดข้อกล่าวหา')}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</textarea></td>\r\n");
              out.write("                                     <td align=\"left\">(ส.ส 2/39)</td>\r\n");
              out.write("                                </tr>\r\n");
              out.write("                                <tr valign=\"top\">\r\n");
              out.write("                                     <td  align=\"right\">คำให้การของผู้ต้องหา :</td>\r\n");
              out.write("                                     <td align=\"left\"><textarea name=\"testimony\" id=\"testimony\" cols=\"45\" rows=\"3\" class=\"textareabig\" >");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(db.testimony != null)?(db.testimony):('รับสารภาพตลอดข้อกล่าวหา')}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write(" </textarea></td>\r\n");
              out.write("                                     <td align=\"left\">&nbsp;</td>\r\n");
              out.write("                                </tr>\r\n");
              out.write("                                <tr valign=\"top\">\r\n");
              out.write("                                     <td   align=\"right\">การแจ้งสิทธิ :</td>\r\n");
              out.write("                                     <td align=\"left\"><textarea name=\"administration\" id=\"administration\" cols=\"45\" rows=\"3\" class=\"textareabig\"  >");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(db.administration != null)?(db.administration):('แจ้งให้ญาติทราบ')}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("</textarea></td>\r\n");
              out.write("                                     <td align=\"left\">&nbsp;</td>\r\n");
              out.write("                                </tr>\r\n");
              out.write("                                <tr valign=\"top\" style=\"display:none\">\r\n");
              out.write("                                     <td   align=\"right\">เวลาที่ตรวจค้นเสร็จ:</td>\r\n");
              out.write("                                     <td align=\"left\"><input name=\"finished_time\" type=\"text\" class=\"textbox\"  size=\"5\" maxlength=\"5\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.finished_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"  onkeypress=\"txtTime_OnKeyPress(this);\"></td>\r\n");
              out.write("                                     <td align=\"left\">&nbsp;</td>\r\n");
              out.write("                                </tr>\r\n");
              out.write("                              </table>\r\n");
              out.write("                         </td>\r\n");
              out.write("                     </tr>\r\n");
              out.write("               </table>\r\n");
              out.write("          </div>\r\n");
              out.write("          <!--mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm END บันทึกจับกุมmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->\r\n");
              out.write("\r\n");
              out.write("           <!--kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk คณะที่เข้าตรวจค้นkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk -->\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("          <script type=\"text/javascript\">\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("var aatmaxrow=1; // jsp  Count  config\r\n");
              out.write("var aatstartrow=2;\r\n");
              out.write("var aateditrow = -1;\r\n");
              out.write("var aateditna = 0;\r\n");
              out.write("\r\n");
              out.write("function aatinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12)\r\n");
              out.write("{\r\n");
              out.write("\tvar xdata = \"<select style='width:100' name=\\\"aat_duty_status_id\\\">\"\r\n");
              out.write("\t");
              if (_jspx_meth_c_005fforEach_005f16(_jspx_th_c_005fif_005f107, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t+\"</select >\"\r\n");
              out.write("\r\n");
              out.write(";\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("var row;\r\n");
              out.write("var x=document.getElementById(myTable).insertRow(aatmaxrow);\r\n");
              out.write("aatmaxrow++;\r\n");
              out.write("row = aatmaxrow - 1;\r\n");
              out.write("var y1=x.insertCell(0);\r\n");
              out.write("var y2=x.insertCell(1);\r\n");
              out.write("var y3=x.insertCell(2);\r\n");
              out.write("var y4=x.insertCell(3);\r\n");
              out.write("var y5=x.insertCell(4);\r\n");
              out.write("var y6=x.insertCell(5);\r\n");
              out.write("//var y7=x.insertCell(6);\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("var exp = new Date();\r\n");
              out.write("var s = exp.getTime();\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("y1.innerHTML=\"<input readonly class='textboxlist' size='1' name='aattc_id' value='\" + row + \"' />\";\r\n");
              out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"aatcheckbox\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"aatref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
              out.write("y3.innerHTML= data12+data10+\" \"+data11;\r\n");
              out.write("y4.innerHTML= data4;\r\n");
              out.write("y5.innerHTML= data9;\r\n");
              out.write("y6.innerHTML= xdata+\"<input type=\\\"hidden\\\" name=\\\"aat_id\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_no\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_inspector_code\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_position\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_idcardno\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_poscode\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_offcode\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_offname\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_first_name\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_last_name\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
              out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_title_name\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
              out.write(";\r\n");
              out.write("\tif(row == 1){ \r\n");
              out.write("\t\tdocument.dataform.aat_duty_status_id.value = data5;\r\n");
              out.write("\t}else if(row > 1 ){ \r\n");
              out.write("\t\tdocument.dataform.aat_duty_status_id[row-1].value = data5; \r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function aatdelRow(myTable)\r\n");
              out.write("{\r\n");
              out.write("if (aatmaxrow>1)\r\n");
              out.write("{\r\n");
              out.write("var x=document.getElementById(myTable).deleteRow(myTable,aatmaxrow-1);\r\n");
              out.write("aatmaxrow--\r\n");
              out.write("}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function aatalternate(id){\r\n");
              out.write(" if(document.getElementsByTagName){\r\n");
              out.write("   var table = document.getElementById(id);\r\n");
              out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
              out.write("   for(i = 0; i < rows.length; i++){\r\n");
              out.write(" //manipulate rows\r\n");
              out.write("     if(i % 2 == 0){\r\n");
              out.write("       rows[i].className = \"even\";\r\n");
              out.write("     }else{\r\n");
              out.write("       rows[i].className = \"odd\";\r\n");
              out.write("     }\r\n");
              out.write("   }\r\n");
              out.write(" }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function aatrerun_id()\r\n");
              out.write("{\r\n");
              out.write("if (aatmaxrow == 2)\r\n");
              out.write("{\r\n");
              out.write("\tdocument.dataform.aattc_id.value=1;\r\n");
              out.write("}else if(aatmaxrow > 2){\r\n");
              out.write("\tfor (var i=0; i < document.dataform.aattc_id.length; i++)\r\n");
              out.write("\t   {\r\n");
              out.write("\t\t\tdocument.dataform.aattc_id[i].value=i+1;\r\n");
              out.write("\t   }\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function aatdelRown(myTable,Rown)\r\n");
              out.write("{\r\n");
              out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
              out.write("aatmaxrow--\r\n");
              out.write("}\r\n");
              out.write("</script>\r\n");
              out.write("<script>\r\n");
              out.write("function aatopenmodal(myTable)\r\n");
              out.write("{\r\n");
              out.write("\twriteTranLog('เพิ่มคณะผู้จับกุม');\r\n");
              out.write("var  dup=0;\r\n");
              out.write("var data = window.showModalDialog('process?action=Divide_staff_poplist&showOther=1', self , 'dialogWidth=700px,Height=400px');\r\n");
              out.write("if(data != null){\r\n");
              out.write("\t\tfor (var i=0; i < data.length; i++){\r\n");
              out.write("\t\t\tdup=0;\r\n");
              out.write("\t\t\tif (aatmaxrow>1){\r\n");
              out.write("\t\t\t\tif (aatmaxrow == 2){\r\n");
              out.write("\t\t\t\t\tif (document.dataform.aat_staff_idcardno.value==data[i][5])\r\n");
              out.write("\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t}else{\r\n");
              out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aat_staff_idcardno.length; j++){\r\n");
              out.write("\t\t\t\t\t\t//alert (document.dataform.aat_staff_idcardno[j].value+ \"-\" +data[i][5]);\r\n");
              out.write("\t\t\t\t\t\tif (document.dataform.aat_staff_idcardno[j].value==data[i][5])\r\n");
              out.write("\t\t\t\t\t\t\tdup=1;\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\t\t\tif (dup==0)\r\n");
              out.write("\t    \t{\r\n");
              out.write("\t    \t\taatinsRow(myTable,aatmaxrow,\"\",data[i][1],data[i][2],data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8],data[i][10],data[i][11],data[i][14]);\r\n");
              out.write("\t    \t}\r\n");
              out.write("\t    }\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("</script>\r\n");
              out.write("<script>\r\n");
              out.write("\r\n");
              out.write("function aatget_check_value(myTable)\r\n");
              out.write("{\r\n");
              out.write("var c_value = \"\";\r\n");
              out.write("var x=aatmaxrow;\r\n");
              out.write("\r\n");
              out.write("\tif(aatmaxrow != 1)\r\n");
              out.write("\t{\r\n");
              out.write("\t\tdocument.dataform.aatallCheckbox.checked = false;\r\n");
              out.write("\t\tif(document.dataform.aatcheckbox != null){\r\n");
              out.write("\t\t\tif ( aatmaxrow == 2){\r\n");
              out.write("\t\t\t\tif(document.dataform.aatcheckbox.checked){\r\n");
              out.write("\t\t\t\t\tdocument.getElementById(myTable).deleteRow(1);\r\n");
              out.write("\t\t\t\t\taatmaxrow--;\r\n");
              out.write("\t\t\t\t\t writeTranLog('ลบรายการคณะผู้จับกุม');\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t\t}else if (aatmaxrow > 2){\r\n");
              out.write("\t\t\t\tvar aatChkCount = document.dataform.aatcheckbox.length;\r\n");
              out.write("\t\t\t\tfor (var i=0; i < aatChkCount; i++){\r\n");
              out.write("\t\t\t\t\tif(document.dataform.aatcheckbox != null){\r\n");
              out.write("\t\t\t\t\t\tif (document.dataform.aatcheckbox[i].checked){\r\n");
              out.write("\t\t\t\t\t\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
              out.write("\t\t\t\t\t\t\ti--;\r\n");
              out.write("\t\t\t\t\t\t\taatmaxrow--;\r\n");
              out.write("\t\t\t\t    \t}\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("\t\t\t  \t}\r\n");
              out.write("\t\t\t \t\t\t\r\n");
              out.write("\t\t\t\t if(x!=aatmaxrow){\r\n");
              out.write("\t\t\t\t\t    writeTranLog('ลบรายการคณะผู้จับกุม');\r\n");
              out.write("\t\t\t\t\t    aatrerun_id();\r\n");
              out.write("\t\t\t\t}\r\n");
              out.write("\t\t \t\t\t\r\n");
              out.write("\t\t\t}\r\n");
              out.write("\t\t}\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("function aatrender(myTable)\r\n");
              out.write("{\r\n");
              out.write(" for (i=1;i<=aatdata1.length-1;i++)\r\n");
              out.write("    {\r\n");
              out.write("        aatinsRow(myTable,i,aatdata1[i],aatdata2[i],aatdata3[i],aatdata4[i],aatdata5[i],aatdata6[i],aatdata7[i],aatdata8[i],aatdata9[i],aatdata10[i],aatdata11[i],aatdata12[i]);\r\n");
              out.write("    }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("</script>\r\n");
              out.write("<script>\r\n");
              out.write("var aatdata1 =new Array();\r\n");
              out.write("var aatdata2 =new Array();\r\n");
              out.write("var aatdata3 =new Array();\r\n");
              out.write("var aatdata4 =new Array();\r\n");
              out.write("var aatdata5 =new Array();\r\n");
              out.write("var aatdata6 =new Array();\r\n");
              out.write("var aatdata7 =new Array();\r\n");
              out.write("var aatdata8 =new Array();\r\n");
              out.write("var aatdata9 =new Array();\r\n");
              out.write("var aatdata10 =new Array();\r\n");
              out.write("var aatdata11 =new Array();\r\n");
              out.write("var aatdata12 =new Array();\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("function aatCheck(chkcont,chk)\r\n");
              out.write("\t\t\t\t\t{\r\n");
              out.write("\t\t\t\t\tif(chkcont.checked==true){\r\n");
              out.write("\t\t\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
              out.write("\t\t\t\t\tchk[i].checked = true ;\r\n");
              out.write("\t\t\t\t\t}else{\r\n");
              out.write("\t\t\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
              out.write("\t\t\t\t\tchk[i].checked = false ;\r\n");
              out.write("\t\t\t\t\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("</script>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("          <div class=\"innerPosition\" id=\"arrestTeam\" style=\"display:none\">\r\n");
              out.write("               <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
              out.write("                    <tr>\r\n");
              out.write("                         <td>\r\n");
              out.write("\r\n");
              out.write("                              <span class=\"spanLink\"\r\n");
              out.write("                                   onClick=\"aatopenmodal('aatTable');\"\r\n");
              out.write("                                   > เพิ่มใหม่</span> | <span class=\"spanLink\" onclick=\"aatget_check_value('aatTable')\">ลบรายการที่เลือก</span>\r\n");
              out.write("\r\n");
              out.write("\t\t\t\t\t\t</td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                         <td>\r\n");
              out.write("\r\n");
              out.write("                                   <table  id=\"aatTable\" class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
              out.write("                                             <tr>\r\n");
              out.write("                                             <td  height=\"15\" class=\"TblHeaderColumn AlignCenter\">ลำดับ</td>\r\n");
              out.write("                                             <td class=\"TblHeaderColumn aligncenter\"><input type=\"checkbox\" name=\"aatallCheckbox\" value=\"\" onClick=\"allCheck(this,document.dataform.aatcheckbox);\" />\r\n");
              out.write("                                             <input type=\"hidden\" name=\"\" value=\"\"></td>\r\n");
              out.write("                                             <td  class=\"TblHeaderColumn \">ชื่อ</td>\r\n");
              out.write("                                             <td  class=\"TblHeaderColumn \">ตำแหน่ง</td>\r\n");
              out.write("                                             <td  class=\"TblHeaderColumn \">ชื่อสังกัด</td>\r\n");
              out.write("                                             <td  class=\"TblHeaderColumn \">ในฐานะ</td>\r\n");
              out.write("                                          </tr>\r\n");
              out.write("\r\n");
              out.write("                                           ");
              if (_jspx_meth_c_005fforEach_005f17(_jspx_th_c_005fif_005f107, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                                        </table>\r\n");
              out.write("\r\n");
              out.write("                              </td>\r\n");
              out.write("                         </tr>\r\n");
              out.write("               </table>\r\n");
              out.write("          </div>\r\n");
              out.write("          <!--kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk END คณะที่เข้าตรวจค้นkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk-->\r\n");
              out.write("\r\n");
              out.write("<!-- =========================================================สิ่งของ======================================================================================  -->\r\n");
              out.write("\r\n");
              out.write("<script>\r\n");
              out.write("var dumaxrow=1; // jsp  Count  config\r\n");
              out.write("var dustartrow=2;\r\n");
              out.write("var dueditrow = -1;\r\n");
              out.write("var dueditna = 0;\r\n");
              out.write("\r\n");
              out.write("function duinsRow(myTable,dumaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,id,text1,text2,text3,text4,text5,data26,data27,data28, isEdit, rows)\r\n");
              out.write("{\r\n");
              out.write("\r\n");
              out.write("\tvar row;\r\n");
              out.write("\tvar x;\r\n");
              out.write("\tif(isEdit==\"N\"){ //กรณีเพิ่มรายการ\r\n");
              out.write("\t\tx=document.getElementById(myTable).insertRow(dumaxrow);\r\n");
              out.write("\t\tdumaxrow++;\r\n");
              out.write("\t\trow = dumaxrow - 1;\r\n");
              out.write("\r\n");
              out.write("\t\tvar y1=x.insertCell(0);\r\n");
              out.write("\t\tvar y2=x.insertCell(1);\r\n");
              out.write("\t\tvar y3=x.insertCell(2);\r\n");
              out.write("\t\tvar y4=x.insertCell(3);\r\n");
              out.write("\t\tvar y5=x.insertCell(4);\r\n");
              out.write("\t\tvar y6=x.insertCell(5);\r\n");
              out.write("\t\tvar y7=x.insertCell(6);\r\n");
              out.write("\t\tvar y8=x.insertCell(7);\r\n");
              out.write("\t\tvar y9=x.insertCell(8);\r\n");
              out.write("\t\tvar y10=x.insertCell(9);\r\n");
              out.write("\t\tvar y11=x.insertCell(10);\r\n");
              out.write("\t\tvar y12=x.insertCell(11);\r\n");
              out.write("\t\tvar y13=x.insertCell(12);\r\n");
              out.write("\t\t\r\n");
              out.write("\t}else{  //กรณีแก้ไข\r\n");
              out.write("\t\tx=document.getElementById(myTable).rows[rows];\r\n");
              out.write("\t\trow = rows;\r\n");
              out.write("\r\n");
              out.write("\t\tvar y1=x.cells(0);\r\n");
              out.write("\t\tvar y2=x.cells(1);\r\n");
              out.write("\t\tvar y3=x.cells(2);\r\n");
              out.write("\t\tvar y4=x.cells(3);\r\n");
              out.write("\t\tvar y5=x.cells(4);\r\n");
              out.write("\t\tvar y6=x.cells(5);\r\n");
              out.write("\t\tvar y7=x.cells(6);\r\n");
              out.write("\t\tvar y8=x.cells(7);\r\n");
              out.write("\t\tvar y9=x.cells(8);\r\n");
              out.write("\t\tvar y10=x.cells(9);\r\n");
              out.write("\t\tvar y11=x.cells(10);\r\n");
              out.write("\t\tvar y12=x.cells(11);\r\n");
              out.write("\t\tvar y13=x.cells(12);\r\n");
              out.write("\t}\r\n");
              out.write("\r\n");
              out.write("\t\r\n");
              out.write("\tvar exp = new Date();\r\n");
              out.write("\tvar s = exp.getTime();\r\n");
              out.write("\t\r\n");
              out.write("\ty1.innerHTML=\"<input readonly class='textboxlist' size='1' name='dutc_id' value='\" + row + \"' />\";\r\n");
              out.write("\ty2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"ducheck_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"duref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
              out.write("\ty3.innerHTML=data3;\r\n");
              out.write("\t\r\n");
              out.write("\tvar productDesc = data28;\r\n");
              out.write("\tif(data3 != \"\")\r\n");
              out.write("\t\tproductDesc += \"ชนิด \" + data3;\r\n");
              out.write("\tif(data7 != \"\" && data2 != \"\")\r\n");
              out.write("\t\tproductDesc += \"<br />ยี่ห้อ\" +data7\r\n");
              out.write("\t\r\n");
              out.write("\tif (data1==\"N\"){\r\n");
              out.write("\t\ty4.innerHTML=\"<a class='spanLink' onClick=\\\"duforedit('\"+ s +\"');dueditmodal('duTable','\"+row+\"');durerun_id();\\\">\" +productDesc+  \"</a>\";\r\n");
              out.write("\t}else{\r\n");
              out.write("\t\ty4.innerHTML= productDesc;\r\n");
              out.write("\t}\r\n");
              out.write("\t\r\n");
              out.write("\tif (data8.substr(0,1)==\"O\"){\r\n");
              out.write("\t\ty5.innerHTML=\"ต่างประเทศ\";\r\n");
              out.write("\t}else if(data8.substr(0,1)==\"I\"){\r\n");
              out.write("\t\ty5.innerHTML=\"ในประเทศ\";\r\n");
              out.write("\t}else\r\n");
              out.write("\t\ty5.innerHTML=\"ไม่ระบุ\";\r\n");
              out.write("\t\r\n");
              out.write("\tif (data15.substr(0,1)==\"1\"){\r\n");
              out.write("\t\ty6.innerHTML=\"ยึด\";\r\n");
              out.write("\t}else{\r\n");
              out.write("\t\ty6.innerHTML=\"คืน\";\r\n");
              out.write("\t}\r\n");
              out.write("\r\n");
              out.write("\tif(text2 == \"โปรดเลือก\")\r\n");
              out.write("\t\ttext2 = \"\";\r\n");
              out.write("\tif(text3 == \"โปรดเลือก\")\r\n");
              out.write("\t\ttext3 = \"\";\r\n");
              out.write("\tif(text4 == \"โปรดเลือก\")\r\n");
              out.write("\t\ttext4 = \"\";\r\n");
              out.write("\t\r\n");
              out.write("\ty7.innerHTML=text1+\" \"+text2;\r\n");
              out.write("\ty8.innerHTML=data11+\" \"+text3;\r\n");
              out.write("\ty9.innerHTML=data13+\" \"+text4;\r\n");
              out.write("\tif (data1==\"N\")\r\n");
              out.write("\t{y10.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"isdomestichk\\\" disabled=\\\"true\\\" value=\\\"\\\">\";}\r\n");
              out.write("\telse\r\n");
              out.write("\t{y10.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"isdomestichk\\\" disabled=\\\"true\\\" CHECKED value=\\\"\\\"><BR/>\"+text5;}\r\n");
              out.write("\t\r\n");
              out.write("\ty11.innerHTML=data17;\r\n");
              out.write("\ty12.innerHTML=data18;\r\n");
              out.write("\ty13.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"aae_isexhibitco\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_duty_code\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_duty_name\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_product_code\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_product_name\\\" value=\\\"\"+data5+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_brand_code\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_brand_name\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_isdomestic\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_code\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_unit_code\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty_unit_code\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight\\\" value=\\\"\"+data13+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight_unit_code\\\" value=\\\"\"+data14+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_status\\\" value=\\\"\"+data15+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_exhibit_list\\\" value=\\\"\"+data16+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_exhibit_desc\\\" value=\\\"\"+data17+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_car_no\\\" value=\\\"\"+data18+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_remarks\\\" value=\\\"\"+data19+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_id\\\" value=\\\"\"+id+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_code_text\\\" value=\\\"\"+text1+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_unit_code_text\\\" value=\\\"\"+text2+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty_unit_code_text\\\" value=\\\"\"+text3+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight_unit_code_text\\\" value=\\\"\"+text4+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_case_id\\\" value=\\\"\"+text5+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_co_id\\\" value=\\\"\"+data26+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_group_id\\\" value=\\\"\"+data27+\"\\\">\"\r\n");
              out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_group_name\\\" value=\\\"\"+data28+\"\\\">\"\r\n");
              out.write("\t+data19;  \r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("}\r\n");
              out.write("</script>\r\n");
              out.write("<script>\r\n");
              out.write("function duforedit(row)\r\n");
              out.write("{\r\n");
              out.write("if (document.dataform.duref_id.length)\r\n");
              out.write("{\r\n");
              out.write("  for (var i=0; i < document.dataform.duref_id.length; i++)\r\n");
              out.write("   {\r\n");
              out.write("\t\tif (document.dataform.duref_id[i].value== row)\r\n");
              out.write("\t\t\t{//alert(i+1);\r\n");
              out.write("\t\t\tdueditrow = i+1;}\r\n");
              out.write("   }\r\n");
              out.write(" }\r\n");
              out.write(" else\r\n");
              out.write(" {//alert(\"1\");\r\n");
              out.write(" dueditrow = 1;}\r\n");
              out.write("   }\r\n");
              out.write("</script>\r\n");
              out.write("<script>\r\n");
              out.write("function dudelRow(myTable)\r\n");
              out.write("{\r\n");
              out.write("if (dumaxrow>1)\r\n");
              out.write("{\r\n");
              out.write("var x=document.getElementById(myTable).deleteRow(myTable,dumaxrow-1);\r\n");
              out.write("dumaxrow--\r\n");
              out.write("}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function dualternate(id){\r\n");
              out.write(" if(document.getElementsByTagName){\r\n");
              out.write("   var table = document.getElementById(id);\r\n");
              out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
              out.write("   for(i = 0; i < rows.length; i++){\r\n");
              out.write(" //manipulate rows\r\n");
              out.write("     if(i % 2 == 0){\r\n");
              out.write("       rows[i].className = \"even\";\r\n");
              out.write("     }else{\r\n");
              out.write("       rows[i].className = \"odd\";\r\n");
              out.write("     }\r\n");
              out.write("   }\r\n");
              out.write(" }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function durerun_id()\r\n");
              out.write("{\r\n");
              out.write("if (dumaxrow == 2){\r\n");
              out.write("\tdocument.dataform.dutc_id.value=1;\r\n");
              out.write("}else if(dumaxrow > 2){\r\n");
              out.write("\tfor (var i=0; i < document.dataform.dutc_id.length; i++)\r\n");
              out.write("\t   {\r\n");
              out.write("\t\t\tdocument.dataform.dutc_id[i].value=i+1;\r\n");
              out.write("\t   }\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("function dudelRown(myTable,Rown)\r\n");
              out.write("{\r\n");
              out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
              out.write("dumaxrow--\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("</script>\r\n");
              out.write("<script>\r\n");
              out.write("function duopenmodal(myTable){\r\n");
              out.write("\r\n");
              out.write("\tif(document.dataform.legislation_id.value != \"\"){\r\n");
              out.write("\t\twriteTranLog('เพิ่มบัญชีสิ่งของ');\r\n");
              out.write("\t\tvar group_id = document.dataform.product_group_id.value;\r\n");
              out.write("\t\tvar legislation_id = dwr.util.getValue();\r\n");
              out.write("\t\tvar data = window.showModalDialog('process?action=Duty_table_list&cmd=list&group_id='+group_id+'&legislation_id='+document.dataform.legislation_id.value , self , 'Width=500px,Height=400px');\r\n");
              out.write("\t\tif(data != null){\r\n");
              out.write("\t\t\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],\"\",data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],\"N\", null);\r\n");
              out.write("\t\t}\r\n");
              out.write("\t}else{\r\n");
              out.write("\t\talert(\"กรุณาเลือกพระราชบัญญัติ\");\r\n");
              out.write("\t\tdocument.dataform.legislation_id.focus();\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("function dueditmodal(myTable, row){\r\n");
              out.write("\tif(document.dataform.legislation_id.value != \"\"){\r\n");
              out.write("\t\twriteTranLog('แก้ไขรายการบัญชีสิ่งของ');\r\n");
              out.write("\t\tdueditna= 1;\r\n");
              out.write("\t\tvar group_id = document.dataform.product_group_id.value;\r\n");
              out.write("\t\tvar data = window.showModalDialog('process?action=Duty_table_list&cmd=list&group_id='+group_id +'&legislation_id='+document.dataform.legislation_id.value , self , 'Width=500px,Height=400px');\r\n");
              out.write("\t\tif(data != null){\r\n");
              out.write("\t\t\t//dudelRown(myTable,dueditrow);  ไม่มีการลบแถว\r\n");
              out.write("\t\t\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],\"Y\", row);\r\n");
              out.write("\t\t}\r\n");
              out.write("\t\tdueditna = 0;\r\n");
              out.write("\t}else{\r\n");
              out.write("\t\talert(\"กรุณาเลือกพระราชบัญญัติ\");\r\n");
              out.write("\t\tdocument.dataform.legislation_id.focus();\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("function duCheck(chk)\r\n");
              out.write("{\r\n");
              out.write("if(document.dataform.duCheck_ctr.checked==true){\r\n");
              out.write("for (i = 0; i < duchk.length; i++)\r\n");
              out.write("duchk[i].checked = true ;\r\n");
              out.write("}else{\r\n");
              out.write("\r\n");
              out.write("for (i = 0; i < duchk.length; i++)\r\n");
              out.write("duchk[i].checked = false ;\r\n");
              out.write("}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function duget_check_value(myTable)\r\n");
              out.write("{\r\n");
              out.write("\tvar c_value = \"\";\r\n");
              out.write("\tvar x=dumaxrow;\r\n");
              out.write("\t\r\n");
              out.write("\tif (document.dataform.ducheck_list != null){\r\n");
              out.write("\t\tif (dumaxrow == 2 && document.dataform.ducheck_list.checked)\r\n");
              out.write("\t\t{\r\n");
              out.write("\t\t\tdocument.getElementById(myTable).deleteRow(1);\r\n");
              out.write("\t\t\tdumaxrow--;\r\n");
              out.write("\t\t\twriteTranLog('ลบรายการบัญชีสิ่งของ');\r\n");
              out.write("\t\t}else{\r\n");
              out.write("\t\t\tfor (var i=0; i < document.dataform.ducheck_list.length; i++){\r\n");
              out.write("\t\t\t\tif (document.dataform.ducheck_list[i].checked){\r\n");
              out.write("\t\t\t\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
              out.write("\t\t\t\t\ti--;\r\n");
              out.write("\t\t\t\t\tdumaxrow--;\r\n");
              out.write("\t\t\t      }\r\n");
              out.write("\t\t\t   }\r\n");
              out.write("\t\t\r\n");
              out.write("\t\t\t\tif(x!=dumaxrow){\r\n");
              out.write("\t\t\t\t    writeTranLog('ลบรายการบัญชีสิ่งของ');\r\n");
              out.write("\t\t\t\t    durender();\r\n");
              out.write("\t\t\t    }\r\n");
              out.write("\t\t  \r\n");
              out.write("\t\t}\r\n");
              out.write("\t}\r\n");
              out.write("\tdocument.getElementById(\"aaeChkAll\").checked = false;\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function durender(myTable)\r\n");
              out.write("{\r\n");
              out.write(" for (i=1;i<=dudata1.length-1;i++)\r\n");
              out.write("    {\r\n");
              out.write("        duinsRow(myTable,i,dudata1[i],dudata2[i],dudata3[i],dudata4[i],dudata5[i],dudata6[i],dudata7[i],dudata8[i],dudata9[i],dudata10[i],dudata11[i],dudata12[i],dudata13[i],dudata14[i],dudata15[i],dudata16[i],dudata17[i],dudata18[i],dudata19[i],dudata20[i],dudata21[i],dudata22[i],dudata23[i],dudata24[i] ,dudata25[i],dudata26[i],dudata27[i],dudata28[i],\"N\",null);\r\n");
              out.write("    }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("</script>\r\n");
              out.write("<script>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("var dudata1 =new Array();\r\n");
              out.write("var dudata2 =new Array();\r\n");
              out.write("var dudata3 =new Array();\r\n");
              out.write("var dudata4 =new Array();\r\n");
              out.write("var dudata5 =new Array();\r\n");
              out.write("var dudata6 =new Array();\r\n");
              out.write("var dudata7 =new Array();\r\n");
              out.write("var dudata8 =new Array();\r\n");
              out.write("var dudata9 =new Array();\r\n");
              out.write("var dudata10 =new Array();\r\n");
              out.write("var dudata11 =new Array();\r\n");
              out.write("var dudata12 =new Array();\r\n");
              out.write("var dudata13 =new Array();\r\n");
              out.write("var dudata14 =new Array();\r\n");
              out.write("var dudata15 =new Array();\r\n");
              out.write("var dudata16 =new Array();\r\n");
              out.write("var dudata17 =new Array();\r\n");
              out.write("var dudata18 =new Array();\r\n");
              out.write("var dudata19 =new Array();\r\n");
              out.write("var dudata20 =new Array();\r\n");
              out.write("var dudata21 =new Array();\r\n");
              out.write("var dudata22 =new Array();\r\n");
              out.write("var dudata23 =new Array();\r\n");
              out.write("var dudata24 =new Array();\r\n");
              out.write("var dudata25 =new Array();\r\n");
              out.write("var dudata26 =new Array();\r\n");
              out.write("var dudata27 =new Array();\r\n");
              out.write("var dudata28 =new Array();\r\n");
              out.write("\r\n");
              out.write("</script>\r\n");
              out.write("\r\n");
              out.write("<!-- ====================================================================สิ่งของ===========================================================================  -->\r\n");
              out.write("<!-- บัญชีสิ่งของ-->\r\n");
              out.write("\r\n");
              out.write("          <div class=\"innerPosition\" id=\"exhibitList\" style=\"display:none;\">\r\n");
              out.write("               <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
              out.write("                    <tr>\r\n");
              out.write("                         <td>\r\n");
              out.write("                              <span class=\"spanLink\" onClick=\"duopenmodal('duTable')\">เพิ่มใหม่</span> |\r\n");
              out.write("                              <span class=\"spanLink\" onClick=\"duget_check_value('duTable')\">ลบรายการที่เลือก</span>\r\n");
              out.write("                         </td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                         <td>\r\n");
              out.write("                                   <table name='duTable' id=\"duTable\" class=\"tableList\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
              out.write("                                        <tr>\r\n");
              out.write("                                             <td width=\"28\"  height=\"15\" class=\"TblHeaderColumn AlignCenter\">ลำดับ</td>\r\n");
              out.write("                                             <td width=\"20\" class=\"TblHeaderColumn AlignCenter\"><input id=\"aaeChkAll\" name=\"chkAll\" type=\"checkbox\" onClick=\"allCheck(this,document.dataform.ducheck_list);\"/></td>\r\n");
              out.write("                                             <td width=\"68\"  class=\"TblHeaderColumn \">ชนิดสินค้า</td>\r\n");
              out.write("                                             <td width=\"130\"  class=\"TblHeaderColumn \">ชื่อสินค้า</td>\r\n");
              out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">ใน / นอก</td>\r\n");
              out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">สถานะของกลาง</td>\r\n");
              out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">ขนาด</td>\r\n");
              out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">จำนวน</td>\r\n");
              out.write("                                             <td width=\"80\"  class=\"TblHeaderColumn \">ปริมาณสุทธิ</td>\r\n");
              out.write("                                             <td width=\"97\"  class=\"TblHeaderColumn \">ของกลางร่วม(เลขที่คดี)</td>\r\n");
              out.write("                                             <td width=\"97\"  class=\"TblHeaderColumn \">ดีกรีสุรา</td>\r\n");
              out.write("                                             <td width=\"97\"  class=\"TblHeaderColumn \">ทะเบียนรถ</td>\r\n");
              out.write("                                             <td width=\"97\"  class=\"TblHeaderColumn \">หมายเหตุ(ส่วนพิสูจน์)</td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("\r\n");
              out.write("                                 ");
              if (_jspx_meth_c_005fforEach_005f18(_jspx_th_c_005fif_005f107, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("                                   </table>\r\n");
              out.write("\r\n");
              out.write("                         </td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("               </table>\r\n");
              out.write("          </div>\r\n");
              out.write("<!-- END บัญชีสิ่งของ-->\r\n");
              out.write("\r\n");
              out.write("      <!-- ใบอนุญาต/ข้อมูลสืบสวน-->\r\n");
              out.write("          <div class=\"innerPosition\" id=\"licenseList\" style=\"display:none;\">\r\n");
              out.write("               <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
              out.write("                   <tr class=\"bgRowGray\">\r\n");
              out.write("                      <td ><strong>รายละเอียดใบอนุญาต</strong> </td>\r\n");
              out.write("                   </tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                         <td>\r\n");
              out.write("                              <span class=\"spanLink\" onClick=\"openmodal('aliTable')\">เพิ่มใหม่</span> |\r\n");
              out.write("                              <span class=\"spanLink\" onClick=\"get_check_value('aliTable')\">ลบรายการที่เลือก</span>\r\n");
              out.write("\r\n");
              out.write("                         </td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                     <td>\r\n");
              out.write("                        <table name=\"aliTable\" id=\"aliTable\" class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
              out.write("                             <tr  class=\"TblHeaderColumn\">\r\n");
              out.write("                                  <td width=\"5%\" >ลำดับ</td>\r\n");
              out.write("                                  <td width=\"5%\" ><input id=\"aalChkAll\" name=\"chkAll\" type=\"checkbox\" onClick=\"allCheck(this,document.dataform.check_list);\"  /></td>\r\n");
              out.write("                                  <td width=\"15%\" >สำนักงาน</td>\r\n");
              out.write("                                  <td width=\"20%\" >ชื่อผู้ประกอบการ</td>\r\n");
              out.write("                                  <td width=\"20%\" >ชื่อสถานประกอบการ</td>\r\n");
              out.write("                                  <td width=\"15%\" >ประเภทใบอนุญาต</td>\r\n");
              out.write("                                  <td width=\"10%\" >เล่มที่ใบอนุญาต</td>\r\n");
              out.write("                                  <td width=\"10%\" >เลขที่ใบอนุญาต</td>\r\n");
              out.write("                             </tr>\r\n");
              out.write("<!-- =============================================================ใบอนุญาต==================================================================================  -->\r\n");
              out.write("<script type=\"text/javascript\">\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("var maxrow=1; // jsp  Count  config\r\n");
              out.write("var startrow=2;\r\n");
              out.write("var editrow = -1;\r\n");
              out.write("var editna = 0;\r\n");
              out.write("\r\n");
              out.write("function insRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,id)\r\n");
              out.write("{\r\n");
              out.write("\r\n");
              out.write("var row;\r\n");
              out.write("var x=document.getElementById(myTable).insertRow(maxrow);\r\n");
              out.write("maxrow++;\r\n");
              out.write("row = maxrow - 1;\r\n");
              out.write("var y1=x.insertCell(0);\r\n");
              out.write("var y2=x.insertCell(1);\r\n");
              out.write("var y3=x.insertCell(2);\r\n");
              out.write("var y4=x.insertCell(3);\r\n");
              out.write("var y5=x.insertCell(4);\r\n");
              out.write("var y6=x.insertCell(5);\r\n");
              out.write("var y7=x.insertCell(6);\r\n");
              out.write("var y8=x.insertCell(7);\r\n");
              out.write("\r\n");
              out.write("var exp = new Date();\r\n");
              out.write("var s = exp.getTime();\r\n");
              out.write("\r\n");
              out.write("y1.innerHTML=\"<input readonly class='textboxlist' size='1' name='tc_id' value='\" + row + \"' />\"+\"<input type=\\\"hidden\\\" name=\\\"ali_id\\\" value=\\\"\"+id+\"\\\">\";\r\n");
              out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"check_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"ref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
              out.write("y3.innerHTML=\"<a class='spanLink' onClick=\\\"foredit('\"+ s +\"');editmodal('aliTable');rerun_id();\\\">\" +data2+ \"<input type=\\\"hidden\\\" name=\\\"ali_offcode\\\" value=\\\"\" +data1+ \"\\\">\" + \"<input type=\\\"hidden\\\" name=\\\"ali_offname\\\" value=\\\"\" +data2+ \"\\\">\" + \"</a>\" ;\r\n");
              out.write("y4.innerHTML=data3+\"<input type=\\\"hidden\\\" id=\\\"ali_entrepreneur\\\" name=\\\"ali_entrepreneur\\\" value=\\\"\"+data3+\"\\\">\";\r\n");
              out.write("y5.innerHTML=data4+\"<input type=\\\"hidden\\\" name=\\\"ali_establishment_name\\\" value=\\\"\"+data4+\"\\\">\";\r\n");
              out.write("y6.innerHTML=data6+\"<input type=\\\"hidden\\\" name=\\\"ali_licensetype_name\\\" value=\\\"\"+data6+\"\\\">\"+\"<input type=\\\"hidden\\\" name=\\\"ali_license_type\\\" value=\\\"\"+data5+\"\\\">\";\r\n");
              out.write("y7.innerHTML=data7+\"<input type=\\\"hidden\\\" name=\\\"ali_book_no\\\" value=\\\"\"+data7+\"\\\">\";\r\n");
              out.write("y8.innerHTML=data8+\"<input type=\\\"hidden\\\" name=\\\"ali_license_no\\\" value=\\\"\"+data8+\"\\\">\"+\"<input type=\\\"hidden\\\" name=\\\"ali_iswithdraw\\\" value=\\\"\"+data9+\"\\\">\";\r\n");
              out.write("\r\n");
              out.write("}\r\n");
              out.write("function foredit(row)\r\n");
              out.write("{\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("if (document.dataform.ref_id.length)\r\n");
              out.write("{\r\n");
              out.write("  for (var i=0; i < document.dataform.ref_id.length; i++)\r\n");
              out.write("   {\r\n");
              out.write("\t\tif (document.dataform.ref_id[i].value== row)\r\n");
              out.write("\t\t\t{//alert(i+1);\r\n");
              out.write("\t\t\teditrow = i+1;}\r\n");
              out.write("   }\r\n");
              out.write(" }\r\n");
              out.write(" else\r\n");
              out.write(" {//alert(\"1\");\r\n");
              out.write("\r\n");
              out.write(" editrow = 1;}\r\n");
              out.write("   }\r\n");
              out.write("function delRow(myTable)\r\n");
              out.write("{\r\n");
              out.write("if (maxrow>1)\r\n");
              out.write("{\r\n");
              out.write("var x=document.getElementById(myTable).deleteRow(myTable,maxrow-1);\r\n");
              out.write("maxrow--\r\n");
              out.write("}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function alternate(id){\r\n");
              out.write(" if(document.getElementsByTagName){\r\n");
              out.write("   var table = document.getElementById(id);\r\n");
              out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
              out.write("   for(i = 0; i < rows.length; i++){\r\n");
              out.write(" //manipulate rows\r\n");
              out.write("     if(i % 2 == 0){\r\n");
              out.write("       rows[i].className = \"even\";\r\n");
              out.write("     }else{\r\n");
              out.write("       rows[i].className = \"odd\";\r\n");
              out.write("     }\r\n");
              out.write("   }\r\n");
              out.write(" }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function rerun_id()\r\n");
              out.write("{\r\n");
              out.write("if (maxrow==2)\r\n");
              out.write("{\r\n");
              out.write("document.dataform.tc_id.value=1;\r\n");
              out.write("}\r\n");
              out.write("for (var i=0; i < document.dataform.tc_id.length; i++)\r\n");
              out.write("   {\r\n");
              out.write("\t\tdocument.dataform.tc_id[i].value=i+1;\r\n");
              out.write("   }\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function delRown(myTable,Rown)\r\n");
              out.write("{\r\n");
              out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
              out.write("maxrow--\r\n");
              out.write("}\r\n");
              out.write("function openmodal(myTable){\r\n");
              out.write("\twriteTranLog('เพิ่มข้อมูลใบอนุญาต');\r\n");
              out.write("\tvar data = window.showModalDialog('process?action=Arrest_license' , self , 'Width=500px,Height=400px');\r\n");
              out.write("\tif(data != null){\r\n");
              out.write("\t\tinsRow(myTable,maxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]);\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function editmodal(myTable){\r\n");
              out.write("\twriteTranLog('แก้ไขรายละเอียดใบอนุญาต');\r\n");
              out.write("\teditna = 1;\r\n");
              out.write("\tvar data = window.showModalDialog('process?action=Arrest_license', self , 'Width=500px,Height=400px');\r\n");
              out.write("\tif(data != null){\r\n");
              out.write("\t\tdelRown(myTable,editrow)\t\r\n");
              out.write("\t\tinsRow(myTable,maxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]);\r\n");
              out.write("\t}\r\n");
              out.write("\teditna = 0;\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("function Check(chk)\r\n");
              out.write("{\r\n");
              out.write("if(document.dataform.Check_ctr.checked==true){\r\n");
              out.write("for (i = 0; i < chk.length; i++)\r\n");
              out.write("chk[i].checked = true ;\r\n");
              out.write("}else{\r\n");
              out.write("\r\n");
              out.write("for (i = 0; i < chk.length; i++)\r\n");
              out.write("chk[i].checked = false ;\r\n");
              out.write("}\r\n");
              out.write("}\r\n");
              out.write("\r\n");
              out.write("function get_check_value(myTable){\r\n");
              out.write("\tvar c_value = \"\";\r\n");
              out.write("\tvar x=maxrow;\r\n");
              out.write("\tdocument.getElementById(\"aalChkAll\").checked = false;\r\n");
              out.write("\tif ( maxrow == 2 && document.dataform.check_list.checked){\r\n");
              out.write("\t\tdocument.getElementById(myTable).deleteRow(1);\r\n");
              out.write("\t\tmaxrow--;\r\n");
              out.write("\t\twriteTranLog('ลบข้อมูลใบอนุญาตในบันทึกการจับกุม');\r\n");
              out.write("\t}else if(maxrow > 2){\r\n");
              out.write("\t\tfor (var i=0; i < document.dataform.check_list.length; i++){\r\n");
              out.write("\t\t\tif (document.dataform.check_list[i].checked){\r\n");
              out.write("\t\t\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
              out.write("\t\t\t\ti--;\r\n");
              out.write("\t\t\t\tmaxrow--;\r\n");
              out.write("\t\t      }\r\n");
              out.write("\t\t}\r\n");
              out.write("\t\tif(x!=maxrow){\r\n");
              out.write("\t\t    writeTranLog('ลบข้อมูลใบอนุญาตในบันทึกการจับกุม');\r\n");
              out.write("\t\t\trerun_id();\r\n");
              out.write("\t\t}\r\n");
              out.write("\t}\r\n");
              out.write("}\r\n");
              out.write("function render(myTable)\r\n");
              out.write("{\r\n");
              out.write(" for (i=1;i<=cdata1.length-1;i++)\r\n");
              out.write("    {\r\n");
              out.write("        insRow(myTable,i,cdata1[i],cdata2[i],cdata3[i],cdata4[i],cdata5[i],cdata6[i],cdata7[i],cdata8[i],cdata9[i],cdata10[i]);\r\n");
              out.write("    }\r\n");
              out.write("}\r\n");
              out.write("var cdata1 =new Array();\r\n");
              out.write("var cdata2 =new Array();\r\n");
              out.write("var cdata3 =new Array();\r\n");
              out.write("var cdata4 =new Array();\r\n");
              out.write("var cdata5 =new Array();\r\n");
              out.write("var cdata6 =new Array();\r\n");
              out.write("var cdata7 =new Array();\r\n");
              out.write("var cdata8 =new Array();\r\n");
              out.write("var cdata9 =new Array();\r\n");
              out.write("var cdata10 =new Array();\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("// End -->\r\n");
              out.write("</script>\r\n");
              out.write("<!-- =======================================================================ปิดใบอนุญาติ========================================================================  -->\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("             ");
              if (_jspx_meth_c_005fforEach_005f19(_jspx_th_c_005fif_005f107, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("                        </table>\r\n");
              out.write("                     </td>\r\n");
              out.write("                   </tr>\r\n");
              out.write("                   <tr >\r\n");
              out.write("                      <td >&nbsp; </td>\r\n");
              out.write("                   </tr>\r\n");
              out.write("                   <tr class=\"bgRowGray\">\r\n");
              out.write("                      <td ><strong>รายละเอียดในการสืบสวน</strong> </td>\r\n");
              out.write("                   </tr>\r\n");
              out.write("                   <tr >\r\n");
              out.write("                      <td >&nbsp; </td>\r\n");
              out.write("                   </tr>\r\n");
              out.write("                   <tr>\r\n");
              out.write("                     <td>\r\n");
              out.write("                       <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"500\">\r\n");
              out.write("                         <tr>\r\n");
              out.write("                           <td width=\"30%\" align=\"right\">\r\n");
              out.write("                             เลขที่การแจ้งความ :&nbsp;\r\n");
              out.write("                           </td>\r\n");
              out.write("                           <td width=\"70%\">\r\n");
              out.write("                             <input type=\"text\" id=\"notice_no\" name=\"notice_no\" class=\"textview\" size=\"25\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.notice_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
              out.write("                             <input type=\"hidden\" id=\"application_notice_arrest_id\" name=\"application_notice_arrest_id\" class=\"textview\" size=\"25\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_notice_arrest_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" >\r\n");
              out.write("                             <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
              out.write("                                  onClick=\"window.open('process?action=Notice_arrest_pop&noticeno=notice_no&id=application_notice_arrest_id&informname=inform_name' , '_blank' , 'status=yes,menubar=no,toorlbar=no,location=no,scrollbars=no, width=700,height=600,modal=yes');\" >\r\n");
              out.write("                             <img src=\"images/btn_search_big.png\" width=\"64\" height=\"22\"  style=\"cursor:hand\"\r\n");
              out.write("                             onClick=\"tonotice();\"\r\n");
              out.write("                             >\r\n");
              out.write("                           </td>\r\n");
              out.write("                         </tr>\r\n");
              out.write("                         <script>\r\n");
              out.write("                         function tonotice(){\r\n");
              out.write("                             if(document.dataform.application_notice_arrest_id.value != \"\")\r\n");
              out.write("                        \t window.open('process?action=NoticeArrest&cmd=view&id='+document.dataform.application_notice_arrest_id.value , '_blank' , '');\r\n");
              out.write("                             else(alert(\"ยังไม่เลือกรายการ\"))\r\n");
              out.write("                             }\r\n");
              out.write("                         function towarrant(){\r\n");
              out.write("                             if(document.dataform.application_search_warrant_id.value != \"\")\r\n");
              out.write("                        \t window.open('process?action=Warrant&cmd=view&id='+document.dataform.application_search_warrant_id.value , '_blank' , '');\r\n");
              out.write("                             else(alert(\"ยังไม่เลือกรายการ\"))\r\n");
              out.write("                             }\r\n");
              out.write("                         function toconfirm(){\r\n");
              out.write("                             if(document.dataform.application_sincere_confirm_id.value != \"\")\r\n");
              out.write("                        \t window.open('process?action=Guarantee&cmd=view&id='+document.dataform.application_sincere_confirm_id.value , '_blank' , '');\r\n");
              out.write("                             else(alert(\"ยังไม่เลือกรายการ\"))\r\n");
              out.write("                             }\r\n");
              out.write("                         \r\n");
              out.write("                         </script>\r\n");
              out.write("                         <tr>\r\n");
              out.write("                           <td align=\"right\">\r\n");
              out.write("                              ชื่อผู้แจ้งเบาะแส :&nbsp;\r\n");
              out.write("                           </td>\r\n");
              out.write("                           <td>\r\n");
              out.write("                              <input type=\"text\" id=\"inform_name\" name=\"inform_name\" class=\"textview\" size=\"40\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.inform_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" >\r\n");
              out.write("                           </td>\r\n");
              out.write("                         </tr>\r\n");
              out.write("                         <tr>\r\n");
              out.write("                           <td  align=\"right\">\r\n");
              out.write("                             เลขที่หมายค้น :&nbsp;\r\n");
              out.write("                           </td>\r\n");
              out.write("                           <td >\r\n");
              out.write("                             <input type=\"text\" class=\"textview\" size=\"25\" id=\"warrant_no\" name=\"warrant_no\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.warrant_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
              out.write("                             <input type=\"hidden\" class=\"textview\" size=\"25\" id=\"application_search_warrant_id\" name=\"application_search_warrant_id\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_search_warrant_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\">\r\n");
              out.write("                             <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
              out.write("                                  onClick=\"window.open('process?action=Searchwarrant_pop&warrantno=warrant_no&id=application_search_warrant_id' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=700,height=500,top=220,left=400,modal=yes');\" >\r\n");
              out.write("                             <img src=\"images/btn_search_big.png\" width=\"64\" height=\"22\"  style=\"cursor:hand\"\r\n");
              out.write("                             onClick=\"towarrant();\"\r\n");
              out.write("                             >\r\n");
              out.write("                           </td>\r\n");
              out.write("                         </tr>\r\n");
              out.write("                         <tr>\r\n");
              out.write("                           <td  align=\"right\">\r\n");
              out.write("                             เลขที่ สส.2/27 :&nbsp;\r\n");
              out.write("                           </td>\r\n");
              out.write("                           <td >\r\n");
              out.write("                             <input type=\"text\" id=\"confirm_no\" name=\"confirm_no\" class=\"textview\" size=\"25\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.confirm_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
              out.write("                             <input type=\"hidden\" id=\"application_sincere_confirm_id\" name=\"application_sincere_confirm_id\" class=\"textview\" size=\"25\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_sincere_confirm_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\">\r\n");
              out.write("                             <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
              out.write("                                  onClick=\"window.open('process?action=sincere_confirm&formname=confirm_no&id=application_sincere_confirm_id' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=700,height=500,top=220,left=400,modal=yes');\"   />\r\n");
              out.write("                             <img src=\"images/btn_search_big.png\" width=\"64\" height=\"22\"  style=\"cursor:hand\"\r\n");
              out.write("                             onClick=\"toconfirm();\" >\r\n");
              out.write("                           </td>\r\n");
              out.write("                         </tr>\r\n");
              out.write("                       </table>\r\n");
              out.write("\r\n");
              out.write("                     </td>\r\n");
              out.write("                   </tr>\r\n");
              out.write("               </table>\r\n");
              out.write("          </div>\r\n");
              out.write("\r\n");
              out.write("          <!--END ใบอนุญาต-->\r\n");
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
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("          <!-- รายงานบันทึกการจับกุม 2/6ก-->\r\n");
              out.write("         <div class=\"innerPosition\"  id=\"2_6Tab\" style=\"width:750px;display:none\">\r\n");
              out.write("                 <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
              out.write("                      <tr>\r\n");
              out.write("                           <td width=\"50%\" valign=\"top\">\r\n");
              out.write("                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
              out.write("                                     <tr  >\r\n");
              out.write("                                          <td height=\"25\" align=\"right\">วันที่บันทึกรายงาน :&nbsp;</td>\r\n");
              out.write("                                          <td height=\"25\">\r\n");
              out.write("                                              ");
              if (_jspx_meth_c_005fif_005f109(_jspx_th_c_005fif_005f107, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                                              ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f110 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f110.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f110.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f107);
              _jspx_th_c_005fif_005f110.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.arrest_report_date == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f110 = _jspx_th_c_005fif_005f110.doStartTag();
              if (_jspx_eval_c_005fif_005f110 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("                                              \t<input name=\"arrest_report_date\" id=\"arrest_report_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
                  //  fmt:formatDate
                  org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
                  _jspx_th_fmt_005fformatDate_005f4.setPageContext(_jspx_page_context);
                  _jspx_th_fmt_005fformatDate_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f110);
                  _jspx_th_fmt_005fformatDate_005f4.setPattern("dd/MM/yyyy");
                  _jspx_th_fmt_005fformatDate_005f4.setValue(new Date());
                  int _jspx_eval_fmt_005fformatDate_005f4 = _jspx_th_fmt_005fformatDate_005f4.doStartTag();
                  if (_jspx_th_fmt_005fformatDate_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f4);
                    return;
                  }
                  _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f4);
                  out.write("\" />\r\n");
                  out.write("                                              ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f110.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f110);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f110);
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t  <a href=\"javascript:NewCssCal('arrest_report_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>\r\n");
              out.write("                                           </td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                     <tr>\r\n");
              out.write("                                     \t<td>&nbsp;</td>\r\n");
              out.write("                                     \t<td align=\"left\">ข้อมูลบันทึกการจับ (ส.ส.2/39 ก,ข)</td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                     <tr  >\r\n");
              out.write("                                          <td  align=\"right\">ผู้ครอบครองสถานที่ :&nbsp;</td>\r\n");
              out.write("                                          <td >\r\n");
              out.write("                                               <input name=\"owner_name\" type=\"text\" class=\"textbox\" size=\"25\"   value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.owner_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"  >\r\n");
              out.write("\r\n");
              out.write("                                          </td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                     <tr  >\r\n");
              out.write("                                          <td  align=\"right\">ชื่อสถานประกอบการ :&nbsp;</td>\r\n");
              out.write("                                          <td >\r\n");
              out.write("                                               <input name=\"business_name\" type=\"text\" class=\"textbox\" size=\"25\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.business_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"  >\r\n");
              out.write("                                          </td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                     <tr  >\r\n");
              out.write("                                          <td  align=\"right\">ชื่อผู้รับรอง :&nbsp;</td>\r\n");
              out.write("                                          <td >\r\n");
              out.write("                                               <input name=\"surety_name\" type=\"text\" class=\"textbox\" size=\"25\"   value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.surety_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\">\r\n");
              out.write("                                          </td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                     <tr  >\r\n");
              out.write("                                          <td  align=\"right\">ซึ่งเป็น :&nbsp;</td>\r\n");
              out.write("                                          <td >\r\n");
              out.write("                                               <input name=\"duty\" id=\"duty\" type=\"text\" class=\"textbox\" size=\"25\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.duty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" >\r\n");
              out.write("                                          </td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                </table>\r\n");
              out.write("                           </td>\r\n");
              out.write("                           <td  width=\"50%\" valign=\"top\">\r\n");
              out.write("                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
              out.write("                                     <tr >\r\n");
              out.write("                                          <td height=\"25\" ><input name=\"guilty\" type=\"checkbox\"  ");
              if (_jspx_meth_c_005fif_005f111(_jspx_th_c_005fif_005f107, _jspx_page_context))
                return;
              out.write(" value = 'Y' /> &nbsp;มีความผิด</td>\r\n");
              out.write("                                          <td height=\"25\">&nbsp;</td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                     <tr>\r\n");
              out.write("                                     \t<td>&nbsp;</td>\r\n");
              out.write("                                     \t<td align=\"left\">รายงานผลการจับกุมผู้กระทำผิด (ส.ส.2/6 ก)</td>\r\n");
              out.write("                                     </tr>\t\t                                     \r\n");
              out.write("                                     <tr  >\r\n");
              out.write("                                          <td  align=\"right\">รายงานหัวหน้าฝ่ายปราบปราม :&nbsp;</td>\r\n");
              out.write("                                          <td >\r\n");
              out.write("                                            <input type=\"text\" name=\"report_to_name\" id=\"report_to_name\" class=\"textview\" size=\"31\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.report_to_staff}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
              out.write("                                            <input type=\"hidden\" name=\"report_to\" id=\"report_to\" class=\"textview\" size=\"31\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.report_to}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\"  />\r\n");
              out.write("                                            <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\" onClick=\"window.open('process?action=Divide_staff_pop&formname=report_to_name&id=report_to' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" />\r\n");
              out.write("                                          </td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                     <tr  >\r\n");
              out.write("                                          <td  align=\"right\">รายงานหัวหน้าส่วนปราบปราม :&nbsp;</td>\r\n");
              out.write("                                          <td >\r\n");
              out.write("                                            <input type=\"text\" name=\"order_by_name\" id=\"order_by_name\" class=\"textview\" size=\"31\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.order_by_staff}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
              out.write("                                            <input type=\"hidden\" name=\"order_by\" id=\"order_by\" class=\"textview\" size=\"31\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.order_by}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\">\r\n");
              out.write("                                            <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\" onClick=\"window.open('process?action=Divide_staff_pop&formname=order_by_name&id=order_by' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" />\r\n");
              out.write("\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                     <tr  >\r\n");
              out.write("                                          <td  align=\"right\">รายงานผู้บังคับบัญชา :&nbsp;</td>\r\n");
              out.write("                                          <td >\r\n");
              out.write("                                               <input name=\"leader_position\" type=\"text\" class=\"textbox\" size=\"25\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.leader_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("                                          </td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                     <tr  >\r\n");
              out.write("                                          <td  align=\"right\">รายงานผู้อำนวยการสำนักฯ/<br />สส.ภาค/สส.พื้นที่ :&nbsp;</td>\r\n");
              out.write("                                          <td >\r\n");
              out.write("                                               <input name=\"director_position\" type=\"text\" class=\"textbox\" size=\"25\"  value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.director_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\">\r\n");
              out.write("\r\n");
              out.write("                                          </td>\r\n");
              out.write("                                     </tr>\r\n");
              out.write("                                </table>\r\n");
              out.write("                         </td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("\r\n");
              out.write("               </table>\r\n");
              out.write("          </div>\r\n");
              out.write("          <!-- END รายงานบันทึกการจับกุม-->\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("     </td>\r\n");
              out.write("     <td>&nbsp;</td>\r\n");
              out.write("   </tr>\r\n");
              out.write("</table>\r\n");
              out.write("<script>\r\n");
              out.write("\r\n");
              out.write("var Rows = 0 ;\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("render('aliTable');\r\n");
              out.write("durender('duTable');\r\n");
              out.write("lawsrender('lawsTable');\r\n");
              out.write("aatrender('aatTable');\r\n");
              out.write("</script>");
              out.write("\r\n");
              out.write("                  \t");
              int evalDoAfterBody = _jspx_th_c_005fif_005f107.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fif_005f107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f107);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f107);
          out.write("\r\n");
          out.write("                  \t");
          if (_jspx_meth_c_005fif_005f112(_jspx_th_c_005fif_005f106, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f106.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f106);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f106);
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("         </tr>\r\n");
      out.write("     </table>\r\n");
      out.write("</form>\r\n");
      if (_jspx_meth_c_005fif_005f119(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("//You should create the validator only after the definition of the HTML form\r\n");
      out.write("  var frmvalidator  = new Validator(\"dataform\");\r\n");
      out.write("\r\n");
      out.write("  frmvalidator.addValidation(\"department_name\",\"req\",\"กรุณากรอกชื่อหน่วยงาน\");\r\n");
      out.write("  frmvalidator.addValidation(\"occurrence_date\",\"req\",\"กรุณากรอกวันที่เกิดเหตุ\");\r\n");
      out.write("  frmvalidator.addValidation(\"occurrence_time\",\"req\",\"กรุณากรอกเวลาที่เกิดเหตุ\");\r\n");
      out.write("  frmvalidator.addValidation(\"lawbreakertype\",\"req\",\"กรุณากรอกประเภทผู้ทำผิด\");\r\n");
      out.write("   frmvalidator.addValidation(\"application_date\",\"req\",\"กรุณากรอกวันที่เขียนบันทึก\");\r\n");
      out.write("  frmvalidator.addValidation(\"have_culpri\",\"req\",\"มีตัวผู้กระทำผิดหรือไม่\");\r\n");
      out.write("  frmvalidator.addValidation(\"accuser\",\"req\",\"กรุณากรอกผู้กล่าวหา\");\r\n");
      out.write("  frmvalidator.addValidation(\"scene_name\",\"req\",\"กรุณากรอกสถานที่เกิดเหตุ\");\r\n");
      out.write("  frmvalidator.addValidation(\"scene_province\",\"req\",\"กรุณากรอกจังหวัดที่เกิดเหตุ\");\r\n");
      out.write("  frmvalidator.addValidation(\"coordinate_y\",\"dec\",\"กรอกเป็นตัวเลข\");\r\n");
      out.write("   frmvalidator.addValidation(\"coordinate_x\",\"dec\",\"กรอกเป็นตัวเลข\");\r\n");
      out.write("   frmvalidator.addValidation(\"district\",\"req\",\"กรุณากรอกอำเภอที่เกิดเหตุ\");\r\n");
      out.write("   frmvalidator.addValidation(\"tambol\",\"req\",\"กรุณากรอกตำบลที่เกิดเหตุ\");\r\n");
      out.write("   frmvalidator.addValidation(\"accuserType\",\"req\",\"กรุณากรอกชนิดผู้กล่าวหา\");\r\n");
      out.write("   frmvalidator.addValidation(\"offcode\",\"dontselect=0\",\"กรุณากรอกพี้นที่\");\r\n");
      out.write("   frmvalidator.addValidation(\"legislation_id\",\"dontselect=0\",\"กรุณากรอก พ.ร.บ.\");\r\n");
      out.write("\t//frmvalidator.addValidation(\"product_group_id\",\"dontselect=0\",\"กรุณากรอกสินค้า.\");\r\n");
      out.write("</script>\r\n");
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
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
    _jspx_th_c_005furl_005f1.setValue("process?action=Arrest");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.warrant_no == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <option value=\"ILL2010\">บันทึกการจับ ส.ส.2/39</option>\r\n");
        out.write("                        ");
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
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.warrant_no != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <option value=\"ILL2011\">บันทึกการค้นสิ่งของ ส.ส. 2/39ก</option>\r\n");
        out.write("                        <option value=\"ILL2012\">บันทึกการตรวจค้นและจับ ส.ส. 2/39ข</option>\r\n");
        out.write("                        ");
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
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.chkcaselast == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                  \t");
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>\r\n");
        out.write("<script type='text/javascript' src='dwr/engine.js'></script>\r\n");
        out.write("<script type='text/javascript' src='dwr/util.js'></script>\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\" ></script>\r\n");
        out.write("<script>\r\n");
        out.write("  function toggle() {\r\n");
        out.write("   if( document.getElementById(\"isLawbreakerN\").checked==true ){\r\n");
        out.write("\t\tdocument.getElementById(\"txtEstimateFine\").disabled=false;\r\n");
        out.write("\t\tdocument.getElementById(\"chkIsCourt\").disabled=true;\r\n");
        out.write("\t\tdocument.getElementById(\"chkIsCourt\").checked=false;\r\n");
        out.write("   }else{\r\n");
        out.write("\t\tdocument.getElementById(\"chkIsCourt\").disabled=false;\r\n");
        out.write("\t\tif(document.getElementById(\"chkIsCourt\").checked==true){\r\n");
        out.write("\t\t\tdocument.getElementById(\"txtEstimateFine\").disabled=false;\r\n");
        out.write("\t\t\tdocument.getElementById(\"txtEstimateFineDate\").disabled=false;\r\n");
        out.write("\t\t\tdocument.getElementById(\"imgEstimateFineDate\").style.display='';\r\n");
        out.write("\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\tdocument.getElementById(\"txtEstimateFine\").disabled=true;\r\n");
        out.write("\t\t\tdocument.getElementById(\"txtEstimateFineDate\").disabled=true;\r\n");
        out.write("\t\t\tdocument.getElementById(\"imgEstimateFineDate\").style.display='none';\r\n");
        out.write("\r\n");
        out.write("\t\t}\r\n");
        out.write("   }\r\n");
        out.write("  }\r\n");
        out.write("\r\n");
        out.write("function ch_accuserType(){\r\n");
        out.write("\tfor (i=0;i<document.dataform.accuserType.length;i++) { \r\n");
        out.write("      if (document.dataform.accuserType[i].checked){ \r\n");
        out.write("    \t  document.dataform.mu_accuserType.value = document.dataform.accuserType[i].value; \r\n");
        out.write("      }\r\n");
        out.write("\t} \r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("  <tr >\r\n");
        out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr class=\"bgRowGray\">\r\n");
        out.write("    <td colspan=\"4\"><strong>รายละเอียดบันทึกการจับกุม</strong> </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr >\r\n");
        out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td width=\"20%\" height=\"25\" align=\"right\" >เลขที่งาน :&nbsp;</td>\r\n");
        out.write("\r\n");
        out.write("    <td width=\"30%\"><input id=\"track_no\" name=\"track_no\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\"  />\r\n");
        out.write("      <input type=\"hidden\" name=\"id\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("       <input type=\"hidden\" name=\"update\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${update}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    </td>\r\n");
        out.write("    <td width=\"20%\" height=\"25\" align=\"right\">วันที่เขียนบันทึกจับกุม :&nbsp;</td>\r\n");
        out.write("    <td width=\"30%\">\r\n");
        out.write("        <input type=\"text\" name=\"application_date\" id=\"application_date\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"7\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td  height=\"25\" align=\"right\">เขียนที่ :&nbsp;</td>\r\n");
        out.write("    <td ><input name=\"department_code\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  class=\"textView\" id=\"department_code\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.department_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"4\" />\r\n");
        out.write("        <input name=\"department_name\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  class=\"textView\" id=\"department_name\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.department_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" />\r\n");
        out.write("    </td>\r\n");
        out.write("    <td height=\"25\" align=\"right\">วันที่เกิดเหตุ :&nbsp;</td>\r\n");
        out.write("    <td height=\"25\">\r\n");
        out.write("        <input name=\"occurrence_date\" type=\"text\"  class=\"textdate\" id=\"occurrence_date\" style=\"width:75;\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"7\" maxlength=\"10\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("        <input name=\"occurrence_time\" id=\"occurrence_time\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"5\" maxlength=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td  height=\"25\" align=\"right\">พื้นที่ :&nbsp;</td>\r\n");
        out.write("    <td ><select name=\"offcode\" id=\"s\" style=\"width:200px;display:none;\" >\r\n");
        out.write("\t        ");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </select>\r\n");
        out.write("        <input name=\"tmp_offname\" type=\"text\"  id=\"tmp_offname\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    <td  height=\"25\" align=\"right\">ผู้กระทำผิด :&nbsp;</td>\r\n");
        out.write("    <td ><input name=\"lawbreakertype\" type=\"radio\" checked value=\"P\" disabled=\"disabled\"\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      /> บุคคลทั่วไป &nbsp;&nbsp;\r\n");
        out.write("      <input name=\"lawbreakertype\" type=\"radio\" value=\"C\" disabled=\"disabled\"\r\n");
        out.write("      ");
        if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      />ผู้ประกอบการ</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td  height=\"25\" align=\"right\">พ.ร.บ. :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("\t    <select name=\"legislation_id\" id=\"legislation_id\" style=\"width:200px;display:none;\" >\r\n");
        out.write("\t    \t<option value=\"\" selected>เลือก</option>\r\n");
        out.write("\t      \t<option value=\"1\" ");
        if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" >90 พ.ร.บ. สุรา พ.ศ.2493</option>\r\n");
        out.write("\t      \t<option value=\"2\" ");
        if (_jspx_meth_c_005fif_005f7(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" >91 พ.ร.บ.ยาสูบ พ.ศ.2509</option>\r\n");
        out.write("\t      \t<option value=\"3\" ");
        if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" >92 พ.ร.บ.ไพ่</option>\r\n");
        out.write("\t      \t<option value=\"4\" ");
        if (_jspx_meth_c_005fif_005f9(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" >00 พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>\r\n");
        out.write("\t    </select>\r\n");
        out.write("\t    <input name=\"tmp_legislation_name\" type=\"text\"  id=\"tmp_legislation_name\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    </td>\r\n");
        out.write("    <td  height=\"25\" align=\"right\">มีตัวผู้กระทำผิด :&nbsp;</td>\r\n");
        out.write("    <td ><input name=\"have_culprit\" id=\"have_culpri\" type=\"radio\" value=\"Y\" checked onclick=\"toggle();\" disabled=\"disabled\"\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f10(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      /> มีตัว &nbsp;&nbsp;\r\n");
        out.write("      <input name=\"have_culprit\" id=\"have_culpri\" type=\"radio\" value=\"N\" onclick=\"toggle();\" disabled=\"disabled\"\r\n");
        out.write("      ");
        if (_jspx_meth_c_005fif_005f11(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      /> ไม่มีตัว&nbsp;&nbsp;\r\n");
        out.write("      <input name=\"issentcourt\" id=\"issentcour\" type=\"checkbox\" disabled=\"disabled\" onclick=\"toggle();\"\r\n");
        out.write("      ");
        if (_jspx_meth_c_005fif_005f12(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      value = 'Y'/> ส่งฟ้องศาล\r\n");
        out.write("\t</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td height=\"25\" align=\"right\">สินค้า :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t<select id=\"product_group_id\" name=\"product_group_id\" style=\"width:200px;display:none;\" >\r\n");
        out.write("    \t</select>\r\n");
        out.write("    \t<input name=\"tmp_group_name\" type=\"text\"  id=\"tmp_group_name\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.product_group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    </td>\r\n");
        out.write("    <td align=\"right\" valign=\"top\">ประมาณการค่าปรับ :&nbsp;</td>\r\n");
        out.write("    <td valign=\"top\" colspan=\"3\"><input type=\"text\" onKeyPress=\"txtKeyPress();\" disabled=\"disabled\" onKeyDown=\"disableKeyDown();\" name=\"estimate_fine\" id=\"estimate_fine\" class=\"textNum\"  size=\"10\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.estimate_fine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("      บาท</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td align=\"right\" valign=\"top\">ผู้กล่าวหา :&nbsp;</td>\r\n");
        out.write("    <td colspan=\"3\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("      <tr height=\"25\">\r\n");
        out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"2\"  ");
        if (_jspx_meth_c_005fif_005f13(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f14(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" > เจ้าหน้าที่กรมสรรพสามิต </td>\r\n");
        out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"3\"  ");
        if (_jspx_meth_c_005fif_005f15(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f16(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" > เจ้าหน้าที่สรรพสามิตภาค </td>\r\n");
        out.write("        <td  align=\"right\">ชื่อผู้กล่าวหา :&nbsp;</td>\r\n");
        out.write("        <td>\r\n");
        out.write("        \t\t<input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" id=\"accuser\"  name=\"accuser\" class=\"textview\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("        \t\t<input type=\"hidden\" id=\"accuser_idcardno\" name=\"accuser_idcardno\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("              \t<input type=\"hidden\" id=\"mu_accuserType\" name=\"mu_accuserType\" value=\"\" />\r\n");
        out.write("              \t<img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" \r\n");
        out.write("              \tstyle=\"cursor:pointer;");
        if (_jspx_meth_c_005fif_005f17(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\" \r\n");
        out.write("              \tonClick=\"ch_accuserType();window.open('process?action=Divide_staff_popForArrest&formname=accuser&id=accuser_idcardno&posname=posname&poscode=accuser_poscode&offname=offname&offcode=accuser_offcode&actype='+document.dataform.mu_accuserType.value , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" /> \r\n");
        out.write("              \t<font style=\"color:red\">*</font>\r\n");
        out.write("        </td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr height=\"25\">\r\n");
        out.write("        <td>\r\n");
        out.write("        \t<input name=\"accuserType\" type=\"radio\" value=\"1\" ");
        if (_jspx_meth_c_005fif_005f18(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f19(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" >เจ้าหน้าที่สรรพสามิตพื้นที่ \r\n");
        out.write("        </td>\r\n");
        out.write("        <td>\r\n");
        out.write("        \t<input name=\"accuserType\" type=\"radio\" value=\"4\" ");
        if (_jspx_meth_c_005fif_005f20(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f21(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" >เจ้าหน้าที่สรรพสามิตพื้นที่สาขา\r\n");
        out.write("        </td>\r\n");
        out.write("        <td align=\"right\">ตำแหน่ง :&nbsp;</td>\r\n");
        out.write("        <td >\r\n");
        out.write("        \t\t<input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" id=\"posname\" name=\"posname\" class=\"textview\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("             \t<input type=\"hidden\" name=\"accuser_poscode\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("        </td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <td colspan=\"2\"><input name=\"accuserType\" type=\"radio\" value=\"5\" \r\n");
        out.write("              ");
        if (_jspx_meth_c_005fif_005f22(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f23(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" >เจ้าหน้าที่อื่นๆ</td>\r\n");
        out.write("        <td align=\"right\">สังกัด :&nbsp;</td>\r\n");
        out.write("        <td >\r\n");
        out.write("        \t<input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" id=\"offname\" name=\"offname\" class=\"textview\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("        \t<input type=\"hidden\" id=\"accuser_offcode\" name=\"accuser_offcode\" class=\"textview\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("        </td>\r\n");
        out.write("      </tr>\r\n");
        out.write("    </table></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td height=\"25\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td   align=\"right\">ชื่อสถานที่เกิดเหตุ :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f24(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f25(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("    <td  align=\"right\">จังหวัด :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("        <select name=\"scene_province\" id=\"province\" ");
        if (_jspx_meth_c_005fif_005f26(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        style=\"width:200px\" onchange=\"getDistrict('district','tambol',this.value,'')\">\r\n");
        out.write("        \t  <option value=\"\">โปรดเลือก</option>\r\n");
        out.write("\t       \t  ");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </select>\r\n");
        out.write("        <font style=\"color:red\">*</font>\r\n");
        out.write("   </td>\r\n");
        out.write("\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td  align=\"right\">บ้านเลขที่ :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f28(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f29(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("    <td align=\"right\">อำเภอ :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("        <select name=\"district\" id=\"district\"  style=\"width:200px\" ");
        if (_jspx_meth_c_005fif_005f30(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        onchange=\"getTambol('tambol',this.value,'')\">\r\n");
        out.write("     \t</select>\r\n");
        out.write("     \t<font style=\"color:red\">*</font>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td  align=\"right\">ซอย :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f31(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f32(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("    <td align=\"right\">ตำบล :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("       \t<select name=\"tambol\" id=\"tambol\"  style=\"width:200px\" ");
        if (_jspx_meth_c_005fif_005f33(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" >  \r\n");
        out.write("       \t</select>\r\n");
        out.write("\t\t<font style=\"color:red\">*</font>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td align=\"right\">ถนน :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f34(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f35(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("    <td align=\"right\">สถานีตำรวจท้องที่เกิดเหตุ :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f36(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f37(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t(ส.ส.2/54)\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td align=\"right\">จำนวนผู้กระทำผิด :&nbsp;</td>\r\n");
        out.write("    <td > ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aalsize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" คน &nbsp;&nbsp;&nbsp;       \r\n");
        out.write("        <input name=\"alleged_co\" type=\"checkbox\"  ");
        if (_jspx_meth_c_005fif_005f38(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write(" disabled=\"disabled\"/>\r\n");
        out.write("      ข้อกล่าวหาร่วมกัน </td>\r\n");
        out.write("    <td  align=\"right\">ละติจูด :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f39(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f40(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td colspan=\"4\" height=\"25\" align=\"right\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("</table>\r\n");
        out.write("<script>\r\n");
        out.write("getProvince('province','district','tambol','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("');\r\n");
        out.write("setGroupID('product_group_id','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.product_group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("');\r\n");
        out.write("//getDistrict('district','tambol','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("');\r\n");
        out.write("</script>\r\n");
        out.write(" <!-- รายละเอียดบันทึกการจับกุม-->\r\n");
        out.write("                  \t\r\n");
        out.write("                  \t");
        if (_jspx_meth_c_005fif_005f41(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                  \t");
        if (_jspx_meth_c_005fif_005f42(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                  ");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${edlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("off");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t          <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.short_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t        ");
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

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode == db.offcode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
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

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreak_type == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreak_type == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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

  private boolean _jspx_meth_c_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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

  private boolean _jspx_meth_c_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.have_culprit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.have_culprit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.issentcourt == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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

  private boolean _jspx_meth_c_005fif_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f16 = _jspx_th_c_005fif_005f16.doStartTag();
    if (_jspx_eval_c_005fif_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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

  private boolean _jspx_meth_c_005fif_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f17 = _jspx_th_c_005fif_005f17.doStartTag();
    if (_jspx_eval_c_005fif_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:none;");
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

  private boolean _jspx_meth_c_005fif_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f19 = _jspx_th_c_005fif_005f19.doStartTag();
    if (_jspx_eval_c_005fif_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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

  private boolean _jspx_meth_c_005fif_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
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

  private boolean _jspx_meth_c_005fif_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f21 = _jspx_th_c_005fif_005f21.doStartTag();
    if (_jspx_eval_c_005fif_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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

  private boolean _jspx_meth_c_005fif_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f22 = _jspx_th_c_005fif_005f22.doStartTag();
    if (_jspx_eval_c_005fif_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f22);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f23 = _jspx_th_c_005fif_005f23.doStartTag();
    if (_jspx_eval_c_005fif_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f23);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f24 = _jspx_th_c_005fif_005f24.doStartTag();
    if (_jspx_eval_c_005fif_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_name\" type=\"text\" class=\"textview\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
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

  private boolean _jspx_meth_c_005fif_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f25.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f25 = _jspx_th_c_005fif_005f25.doStartTag();
    if (_jspx_eval_c_005fif_005f25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t    \t<input name=\"scene_name\" type=\"text\" class=\"text\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("\t    \t<font style=\"color:red\">*</font>\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f25);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f26.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f26 = _jspx_th_c_005fif_005f26.doStartTag();
    if (_jspx_eval_c_005fif_005f26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pvlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("pv");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t       \t  \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f27(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t       \t  ");
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

  private boolean _jspx_meth_c_005fif_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f27 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f27.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_code == db.scene_province}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f27 = _jspx_th_c_005fif_005f27.doStartTag();
    if (_jspx_eval_c_005fif_005f27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f27);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f28 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f28.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f28.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f28 = _jspx_th_c_005fif_005f28.doStartTag();
    if (_jspx_eval_c_005fif_005f28 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_no\" type=\"text\" class=\"textview\" size=\"8\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t      &nbsp;&nbsp; หมู่ :\r\n");
        out.write("\t\t    <input name=\"scene_moo\" type=\"text\" class=\"textview\" size=\"5\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f28.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f28);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f29 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f29.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f29.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f29 = _jspx_th_c_005fif_005f29.doStartTag();
    if (_jspx_eval_c_005fif_005f29 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    <input name=\"scene_no\" type=\"text\" class=\"text\" size=\"8\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t      &nbsp;&nbsp; หมู่ :\r\n");
        out.write("\t\t    <input name=\"scene_moo\" type=\"text\" class=\"text\" size=\"5\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("      \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f29.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f29);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f30 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f30.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f30.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f30 = _jspx_th_c_005fif_005f30.doStartTag();
    if (_jspx_eval_c_005fif_005f30 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f30.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f30);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f31 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f31.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f31.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f31 = _jspx_th_c_005fif_005f31.doStartTag();
    if (_jspx_eval_c_005fif_005f31 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_soi\" type=\"text\" class=\"textview\" id=\"scene_soi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f31.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f31);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f32 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f32.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f32.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f32 = _jspx_th_c_005fif_005f32.doStartTag();
    if (_jspx_eval_c_005fif_005f32 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_soi\" type=\"text\" class=\"text\" id=\"scene_soi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\"  />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f32.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f32);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f33 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f33.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f33.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f33 = _jspx_th_c_005fif_005f33.doStartTag();
    if (_jspx_eval_c_005fif_005f33 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f33.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f33);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f34 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f34.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f34.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f34 = _jspx_th_c_005fif_005f34.doStartTag();
    if (_jspx_eval_c_005fif_005f34 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_road\" type=\"text\" class=\"textview\" id=\"scene_road\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f34.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f34);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f35 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f35.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f35.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f35 = _jspx_th_c_005fif_005f35.doStartTag();
    if (_jspx_eval_c_005fif_005f35 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_road\" type=\"text\" class=\"text\" id=\"scene_road\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f35.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f35);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f36 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f36.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f36.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f36 = _jspx_th_c_005fif_005f36.doStartTag();
    if (_jspx_eval_c_005fif_005f36 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"police_station\" type=\"text\" class=\"textview\" size=\"22\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.police_station}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f36.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f36);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f37 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f37.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f37.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f37 = _jspx_th_c_005fif_005f37.doStartTag();
    if (_jspx_eval_c_005fif_005f37 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"police_station\" type=\"text\" class=\"text\" size=\"22\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.police_station}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f37.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f37);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f38 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f38.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f38.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aalsize >= 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f38 = _jspx_th_c_005fif_005f38.doStartTag();
    if (_jspx_eval_c_005fif_005f38 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f38.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f38);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f39 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f39.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f39.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f39 = _jspx_th_c_005fif_005f39.doStartTag();
    if (_jspx_eval_c_005fif_005f39 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"coordinate_x\" type=\"text\" class=\"textview\" size=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_x}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("\t      \t&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t     \t ลองจิจูด :&nbsp;&nbsp;\r\n");
        out.write("\t      \t<input name=\"coordinate_y\" type=\"text\" class=\"textview\" size=\"5\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_y}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f39.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f39);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f40 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f40.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f40.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f40 = _jspx_th_c_005fif_005f40.doStartTag();
    if (_jspx_eval_c_005fif_005f40 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"coordinate_x\" type=\"text\" class=\"text\" size=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_x}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t      \t&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t     \t ลองจิจูด :&nbsp;&nbsp;\r\n");
        out.write("\t      \t<input name=\"coordinate_y\" type=\"text\" class=\"text\" size=\"5\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_y}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f40.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f40);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f41 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f41.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f41.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f41 = _jspx_th_c_005fif_005f41.doStartTag();
    if (_jspx_eval_c_005fif_005f41 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                  \t\t");
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
        out.write("<link href=\"css/jquery-ui.css\"  rel=\"stylesheet\" />\r\n");
        out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/Popup.js\" ></script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var incmaxrow=1; // jsp  Count  config\r\n");
        out.write("var incstartrow=2;\r\n");
        out.write("var inceditrow = -1;\r\n");
        out.write("var inceditna = 0;\r\n");
        out.write("\r\n");
        out.write("function incinsRow(myTable,maxrox,data1,data2,data3,data4,id,data6)\r\n");
        out.write("{\r\n");
        out.write("\tvar row;\r\n");
        out.write("\tvar x=document.getElementById(myTable).insertRow(incmaxrow);\r\n");
        out.write("\tincmaxrow++;\r\n");
        out.write("\r\n");
        out.write("\trow = incmaxrow - 1;\r\n");
        out.write("\tvar y1=x.insertCell(0);\r\n");
        out.write("\tvar y2=x.insertCell(1);\r\n");
        out.write("\tvar y3=x.insertCell(2);\r\n");
        out.write("\tvar y4=x.insertCell(3);\r\n");
        out.write("\tvar y5=x.insertCell(4);\r\n");
        out.write("\r\n");
        out.write("\tvar exp = new Date();\r\n");
        out.write("\tvar s = exp.getTime();\r\n");
        out.write("\ty1.innerHTML=\"<input readonly class='textboxlist' size='1' name='inctc_id' value='\" + row + \"' />\"+\"<input type=\\\"hidden\\\" name=\\\"aai_id\\\" value=\\\"\"+id+\"\\\">\";\r\n");
        out.write("\ty2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"inccheckbox\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"incref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("\ty3.innerHTML= data1+ \"<input type=\\\"hidden\\\" name=\\\"aai_case_law_id\\\" value=\\\"\" +data1+ \"\\\">\"\r\n");
        out.write("\t+ \"<input type=\\\"hidden\\\" name=\\\"aai_indictment_id\\\" value=\\\"\" +data6+ \"\\\">\" ;\r\n");
        out.write("\ty4.innerHTML=data2+\"<input type=\\\"hidden\\\" id=\\\"aai_penalty_case_law_id\\\" name=\\\"aai_penalty_case_law_id\\\" value=\\\"\"+data2+\"\\\">\";\r\n");
        out.write("\ty5.innerHTML=data3+\"<input type=\\\"hidden\\\" name=\\\"aai_guilt_base\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aai_exhibit_wild\\\" value=\\\"\"+data4+\"\\\">\";\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function incdelRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("\tif (incmaxrow>1)\r\n");
        out.write("\t{\r\n");
        out.write("\t\tvar x=document.getElementById(myTable).deleteRow(myTable,incmaxrow-1);\r\n");
        out.write("\t\tincmaxrow--\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function incalternate(id){\r\n");
        out.write("\t if(document.getElementsByTagName){\r\n");
        out.write("\t\t   var table = document.getElementById(id);\r\n");
        out.write("\t\t   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("\t\t   for(i = 0; i < rows.length; i++){\r\n");
        out.write("\t\t     if(i % 2 == 0){\r\n");
        out.write("\t\t       \trows[i].className = \"even\";\r\n");
        out.write("\t\t     }else{\r\n");
        out.write("\t\t       \trows[i].className = \"odd\";\r\n");
        out.write("\t\t     }\r\n");
        out.write("\t\t   }\r\n");
        out.write("\t }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function increrun_id()\r\n");
        out.write("{\r\n");
        out.write("\tif (incmaxrow == 2)\r\n");
        out.write("\t{\r\n");
        out.write("\t\tdocument.dataform.inctc_id.value=1;\r\n");
        out.write("\t}else if(incmaxrow > 2){\r\n");
        out.write("\t\tfor (var i=0; i < document.dataform.inctc_id.length; i++)\r\n");
        out.write("\t    {\r\n");
        out.write("\t\t\tdocument.dataform.inctc_id[i].value=i+1;\r\n");
        out.write("\t    }\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function incdelRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("\tvar x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("\tincmaxrow--\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function incopenmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("\twriteTranLog('เพิ่มข้อกล่าวหาในบันทึกการจับกุม');\t\r\n");
        out.write("\t\r\n");
        out.write("\tvar  dup=0;\r\n");
        out.write("\tvar data =  window.showModalDialog('process?action=Indictment_pop&cmd=add' , self , 'dialogWidth=700px,Height=400px');\r\n");
        out.write("\tif(data != null){\r\n");
        out.write("\t\tfor (var i=0; i < data.length; i++)\r\n");
        out.write("\t\t{\r\n");
        out.write("\t\t\tdup=0;\r\n");
        out.write("\t\t\tif (incmaxrow>1)\r\n");
        out.write("\t\t\t{\r\n");
        out.write("\t\t\t\tif (incmaxrow == 2){\r\n");
        out.write("\t\t\t\t\tif (document.dataform.aai_indictment_id.value==data[i][5])\r\n");
        out.write("\t\t\t\t\t{\r\n");
        out.write("\t\t\t\t\t\tdup=1;\r\n");
        out.write("\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t}else{\r\n");
        out.write("\t\t\t\t\tfor (var j=0; j < document.dataform.aai_indictment_id.length; j++)\r\n");
        out.write("\t\t\t\t\t{\r\n");
        out.write("\t\t\t\t\t\tif (document.dataform.aai_indictment_id[j].value==data[i][5])\r\n");
        out.write("\t\t\t\t\t\t\t{\r\n");
        out.write("\t\t\t\t\t\t\t\tdup=1;\r\n");
        out.write("\t\t\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t\t}\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t\tif (dup==0)\r\n");
        out.write("\t    \t{\r\n");
        out.write("\t\t    \tincinsRow(myTable,incmaxrow,data[i][1],data[i][2],data[i][3],data[i][4],'',data[i][5]);\r\n");
        out.write("\t\t    }\r\n");
        out.write("\t    }\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function incget_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("\tvar c_value = \"\";\r\n");
        out.write("\tvar x = incmaxrow;\r\n");
        out.write("\tif (incmaxrow == 2 && document.dataform.inccheckbox.checked)\r\n");
        out.write("\t{\r\n");
        out.write("\t\tdocument.getElementById(myTable).deleteRow(1);\r\n");
        out.write("\t\tincmaxrow--;\r\n");
        out.write("\t\twriteTranLog('ลบข้อกล่าวหาในบันทึกการจับกุม');\t\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\tfor (var i=0; i < document.dataform.inccheckbox.length -1 ; i++){\r\n");
        out.write("\t\t\t if (document.dataform.inccheckbox[i+1].checked){\r\n");
        out.write("\t\t\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
        out.write("\t\t\t\ti--;\r\n");
        out.write("\t\t\t\tincmaxrow--;\r\n");
        out.write("\t\t     }\r\n");
        out.write("\t   \t}\r\n");
        out.write("\t   //alert(incmaxrow-1);\r\n");
        out.write("\t   if(x!=incmaxrow){\r\n");
        out.write("\t\t    writeTranLog('ลบข้อกล่าวหาในบันทึกการจับกุม');\r\n");
        out.write("\t\t\tincrerun_id();\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("function incrender(myTable)\r\n");
        out.write("{\r\n");
        out.write(" \tfor (i=0;i<incdata1.length;i++)\r\n");
        out.write("    {\r\n");
        out.write("        incinsRow(myTable,i,incdata1[i],incdata2[i],incdata3[i],incdata4[i],incdata5[i],incdata6[i]);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("var incdata1 =new Array();\r\n");
        out.write("var incdata2 =new Array();\r\n");
        out.write("var incdata3 =new Array();\r\n");
        out.write("var incdata4 =new Array();\r\n");
        out.write("var incdata5 =new Array();\r\n");
        out.write("var incdata6 =new Array();\r\n");
        out.write("\r\n");
        out.write("function incCheck(chkcont,chk)\r\n");
        out.write("{\r\n");
        out.write("\tif(chkcont.checked==true){\r\n");
        out.write("\t\tfor (i = 0; i < chk.length; i++)\r\n");
        out.write("\t\t\tchk[i].checked = true ;\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\t\tfor (i = 0; i < chk.length; i++)\r\n");
        out.write("\t\t\t\tchk[i].checked = false ;\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td width=\"20%\" height=\"25\" align=\"right\" valign=\"top\">ข้อกล่าวหา :&nbsp;</td>\r\n");
        out.write("    <td width=\"80%\" colspan=\"3\">\r\n");
        out.write("        <table class=\"tableList\" id=incTable width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("             <tr class=\"TblHeaderColumn AlignCenter\">\r\n");
        out.write("                  <td width=\"10%\">ลำดับที่</td>\r\n");
        out.write("                  <td width=\"5%\" ><input type=\"checkbox\" name=\"incallCheckbox\" value=\"\" onClick=\"incCheck(this,document.dataform.inccheckbox);\" />\r\n");
        out.write("\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"inccheckbox\"></td>\r\n");
        out.write("                  <td width=\"20%\">มาตรา</td>\r\n");
        out.write("                  <td width=\"15%\">บทกำหนดโทษ</td>\r\n");
        out.write("                  <td width=\"50%\">ข้อกล่าวหา</td>\r\n");
        out.write("             </tr>\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fforEach_005f2(_jspx_th_c_005fif_005f41, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </table>\r\n");
        out.write("\t\t\t<span class=\"spanLink\" onClick=\"incopenmodal('incTable');\">\r\n");
        out.write("\t\t\t เพิ่มรายการ\r\n");
        out.write("\t\t\t</span> |\r\n");
        out.write("\t\t\t<span class=\"spanLink\" onClick=\"incget_check_value('incTable');\">ลบรายการ</span>\r\n");
        out.write("    </td>\r\n");
        out.write("   </tr>\r\n");
        out.write("   <tr>\r\n");
        out.write("      <td colspan=\"4\" height=\"25\" align=\"right\">&nbsp;</td>\r\n");
        out.write("   </tr>\r\n");
        out.write("</table>\r\n");
        out.write("<script>\r\n");
        out.write("incrender('incTable');\r\n");
        out.write("</script>");
        out.write("  <!-- ข้อกล่าวหา-->\r\n");
        out.write("                  \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f41.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f41);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f41, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f41);
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aailist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f2.setVar("inc");
    _jspx_th_c_005fforEach_005f2.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t    <script>\r\n");
          out.write("\t\t\t\t\tincdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.penalty_case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.guilt_base}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.exhibit_wild}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t//alert(incdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] + \" TTTTT \" + '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\r\n");
          out.write("\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f42 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f42.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    _jspx_th_c_005fif_005f42.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment != 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f42 = _jspx_th_c_005fif_005f42.doStartTag();
    if (_jspx_eval_c_005fif_005f42 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                  \t\t");
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/Popup.js\" ></script>\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var incmaxrow=1; // jsp  Count  config\r\n");
        out.write("var incstartrow=2;\r\n");
        out.write("var inceditrow = -1;\r\n");
        out.write("var inceditna = 0;\r\n");
        out.write("\r\n");
        out.write("function incinsRow(myTable,maxrox,data1,data2,data3,data4,id,data6)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("var row;\r\n");
        out.write("var x=document.getElementById(myTable).insertRow(incmaxrow);\r\n");
        out.write("incmaxrow++;\r\n");
        out.write("row = incmaxrow - 1;\r\n");
        out.write("var y1=x.insertCell(0);\r\n");
        out.write("var y2=x.insertCell(1);\r\n");
        out.write("var y3=x.insertCell(2);\r\n");
        out.write("var y4=x.insertCell(3);\r\n");
        out.write("var y5=x.insertCell(4);\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var exp = new Date();\r\n");
        out.write("var s = exp.getTime();\r\n");
        out.write("\r\n");
        out.write("y1.innerHTML=\"<input  readonly class='textboxlist' size='1' name='tc_id' value='\" + row + \"' />\"+\"<input type=\\\"hidden\\\" name=\\\"aai_id\\\" value=\\\"\"+id+\"\\\">\";\r\n");
        out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"inccheckbox\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"incref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("y3.innerHTML= data1+ \"<input type=\\\"hidden\\\" name=\\\"aai_case_law_id\\\" value=\\\"\" +data1+ \"\\\">\"\r\n");
        out.write("+ \"<input type=\\\"hidden\\\" name=\\\"aai_indictment_id\\\" value=\\\"\" +data6+ \"\\\">\" ;\r\n");
        out.write("y4.innerHTML=data2+\"<input type=\\\"hidden\\\" id=\\\"aai_penalty_case_law_id\\\" name=\\\"aai_penalty_case_law_id\\\" value=\\\"\"+data2+\"\\\">\";\r\n");
        out.write("y5.innerHTML=data3+\"<input type=\\\"hidden\\\" name=\\\"aai_guilt_base\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aai_exhibit_wild\\\" value=\\\"\"+data4+\"\\\">\";\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("}\r\n");
        out.write("function incdelRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (incmaxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,incmaxrow-1);\r\n");
        out.write("incmaxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function incalternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function increrun_id()\r\n");
        out.write("{\r\n");
        out.write("if (!document.dataform.tc_id.length)\r\n");
        out.write("{\r\n");
        out.write("document.dataform.tc_id.value=1;\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.tc_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tdocument.dataform.tc_id[i].value=i+1;\r\n");
        out.write("   }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function incdelRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("incmaxrow--\r\n");
        out.write("}\r\n");
        out.write("function incopenmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("var  dup=0;\r\n");
        out.write("var data = window.showModalDialog('process?action=Indictment_pop&cmd=add' , self , 'dialogWidth=700px,Height=400px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\t{\r\n");
        out.write("\t\tfor (var i=0; i < data.length; i++)\r\n");
        out.write("\t\t{\r\n");
        out.write("\t\t\tdup=0;\r\n");
        out.write("\t\t\t\tif (incmaxrow>1)\r\n");
        out.write("\t\t\t{\r\n");
        out.write("\t\t\t\tfor (var j=0; j < document.dataform.aai_indictment_id.length; j++)\r\n");
        out.write("\t\t\t\t{\r\n");
        out.write("\t\t\t\t\t//alert (document.dataform.aai_indictment_id[j].value+ \"-\" +data[i][5]);\r\n");
        out.write("\t\t\t\t\tif (document.dataform.aai_indictment_id[j].value==data[i][5])\r\n");
        out.write("\t\t\t\t\t\t{dup=1;}\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t\tif (dup==0)\r\n");
        out.write("\t    \t{incinsRow(myTable,incmaxrow,data[i][1],data[i][2],data[i][3],data[i][4],'',data[i][5]);}\r\n");
        out.write("\t    }\r\n");
        out.write("\t}\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function incget_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("var c_value = \"\";\r\n");
        out.write("var x=\"\";\r\n");
        out.write("if (!document.dataform.inccheckbox.length)\r\n");
        out.write("{\r\n");
        out.write("\tdocument.getElementById(myTable).deleteRow(1);\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.inccheckbox.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\r\n");
        out.write("   if (document.dataform.inccheckbox[i].checked)\r\n");
        out.write("      {\r\n");
        out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
        out.write("\t\tdocument.getElementById(myTable).deleteRow(i);\r\n");
        out.write("\t\ti--;\r\n");
        out.write("\t\tincmaxrow--;\r\n");
        out.write("      }\r\n");
        out.write("   }\r\n");
        out.write("   //alert(incmaxrow-1);\r\n");
        out.write("   increrun_id();\r\n");
        out.write("}\r\n");
        out.write("function incrender(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=incdata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        incinsRow(myTable,i,incdata1[i],incdata2[i],incdata3[i],incdata4[i],incdata5[i],incdata6[i]);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("var incdata1 =new Array();\r\n");
        out.write("var incdata2 =new Array();\r\n");
        out.write("var incdata3 =new Array();\r\n");
        out.write("var incdata4 =new Array();\r\n");
        out.write("var incdata5 =new Array();\r\n");
        out.write("var incdata6 =new Array();\r\n");
        out.write("\r\n");
        out.write("function incCheck(chkcont,chk)\r\n");
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
        out.write("</script>\r\n");
        out.write("\r\n");
        out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td width=\"20%\" height=\"25\" align=\"right\" valign=\"top\">ข้อกล่าวหา :&nbsp;</td>\r\n");
        out.write("    <td width=\"80%\" colspan=\"3\">\r\n");
        out.write("        <table class=\"tableList\" id=incTable width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("             <tr class=\"TblHeaderColumn AlignCenter\">\r\n");
        out.write("                  <td width=\"10%\">ลำดับที่</td>\r\n");
        out.write("                  <td width=\"5%\" ><input type=\"checkbox\" name=\"incallCheckbox\" value=\"\" onClick=\"incCheck(this,document.dataform.inccheckbox);\" />\r\n");
        out.write("\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"inccheckbox\"></td>\r\n");
        out.write("                  <td width=\"20%\">มาตรา</td>\r\n");
        out.write("                  <td width=\"15%\">บทกำหนดโทษ</td>\r\n");
        out.write("                  <td width=\"50%\">ข้อกล่าวหา</td>\r\n");
        out.write("             </tr>\r\n");
        out.write("\t\t\t ");
        if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fif_005f42, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </table>\r\n");
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("   </tr>\r\n");
        out.write("   <tr>\r\n");
        out.write("      <td colspan=\"4\" height=\"25\" align=\"right\">&nbsp;</td>\r\n");
        out.write("   </tr>\r\n");
        out.write("</table>\r\n");
        out.write("<script>\r\n");
        out.write("incrender('incTable');\r\n");
        out.write("</script>");
        out.write("  <!-- ข้อกล่าวหา-->\r\n");
        out.write("                  \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f42.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f42);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f42, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f42);
    _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aailist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f3.setVar("inc");
    _jspx_th_c_005fforEach_005f3.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t    <script>\r\n");
          out.write("\t\t\tincdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.penalty_case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.guilt_base}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.exhibit_wild}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\tincdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t</script>\r\n");
          out.write("\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f45 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f45.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f45.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_date2 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f45 = _jspx_th_c_005fif_005f45.doStartTag();
    if (_jspx_eval_c_005fif_005f45 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <input type=\"Text\" name=\"application_date\" id=\"application_date\" class=\"textdate\" onKeyPress=\"txtKeyPress(event);\" onKeyDown=\"disableKeyDown();\" size=\"7\" maxlength=\"10\" style=\"width:75;\"\r\n");
        out.write("         value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f45.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f45);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.createDate}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_fmt_005fformatDate_005f1.setPattern("dd/MM/yyyy HH:mm:ss");
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f47 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f47.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f47.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_date2 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f47 = _jspx_th_c_005fif_005f47.doStartTag();
    if (_jspx_eval_c_005fif_005f47 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<input name=\"occurrence_date\" type=\"Text\" class=\"textdate\" id=\"occurrence_date\" style=\"width:75;\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"7\" maxlength=\"10\" onKeyPress=\"txtKeyPress(event);\" />\r\n");
        out.write("        \t\t<a href=\"javascript:NewCssCal('occurrence_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a> เวลา\r\n");
        out.write("\t\t\t    <input name=\"occurrence_time\" id=\"occurrence_time\" type=\"text\" class=\"textbox\" size=\"5\" maxlength=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  onkeypress=\"txtTime_OnKeyPress(this);\" onblur=\"lengthVali(this,5);\"/>\r\n");
        out.write("\t\t\t    <font style=\"color:red\">*</font> \r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f47.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f47);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f49(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f49 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f49.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f49.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuserType!='2'||db.id!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f49 = _jspx_th_c_005fif_005f49.doStartTag();
    if (_jspx_eval_c_005fif_005f49 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:none;");
        int evalDoAfterBody = _jspx_th_c_005fif_005f49.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f49);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f50(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f50 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f50.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f50.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offcode == ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f50 = _jspx_th_c_005fif_005f50.doStartTag();
    if (_jspx_eval_c_005fif_005f50 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f50.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f50);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${edlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f4.setVar("off");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t          <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f51(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.short_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t        ");
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

  private boolean _jspx_meth_c_005fif_005f51(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f51 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f51.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    _jspx_th_c_005fif_005f51.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode == offcode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f51 = _jspx_th_c_005fif_005f51.doStartTag();
    if (_jspx_eval_c_005fif_005f51 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f51.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f51);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f52(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f52 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f52.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f52.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuserType!='2'||db.id!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f52 = _jspx_th_c_005fif_005f52.doStartTag();
    if (_jspx_eval_c_005fif_005f52 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t<input name=\"tmp_offname\" type=\"text\"  id=\"tmp_offname\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f52.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f52);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fforEach_005f5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f5.setVar("ltion");
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            \t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.legislation_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ltion.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("            \t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f53(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f53 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f53.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f53.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.issentcourt == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f53 = _jspx_th_c_005fif_005f53.doStartTag();
    if (_jspx_eval_c_005fif_005f53 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f53.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f53);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f54(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f54 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f54.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f54.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuserType == '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f54 = _jspx_th_c_005fif_005f54.doStartTag();
    if (_jspx_eval_c_005fif_005f54 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f54.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f54);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f55(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f55 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f55.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f55.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuserType == '3'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f55 = _jspx_th_c_005fif_005f55.doStartTag();
    if (_jspx_eval_c_005fif_005f55 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f55.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f55);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f56(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f56 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f56.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f56.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuserType == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f56 = _jspx_th_c_005fif_005f56.doStartTag();
    if (_jspx_eval_c_005fif_005f56 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f56.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f56);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f57(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f57 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f57.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f57.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuserType == '4'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f57 = _jspx_th_c_005fif_005f57.doStartTag();
    if (_jspx_eval_c_005fif_005f57 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f57.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f57);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f58(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f58 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f58.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f58.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuserType == '5'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f58 = _jspx_th_c_005fif_005f58.doStartTag();
    if (_jspx_eval_c_005fif_005f58 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f58.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f58);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f59(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f59 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f59.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fif_005f59.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aalsize >= 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f59 = _jspx_th_c_005fif_005f59.doStartTag();
    if (_jspx_eval_c_005fif_005f59 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f59.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f59);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f59);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f44, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f44);
    _jspx_th_c_005fforEach_005f6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aailist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f6.setVar("inc");
    _jspx_th_c_005fforEach_005f6.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f6 = _jspx_th_c_005fforEach_005f6.doStartTag();
      if (_jspx_eval_c_005fforEach_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t    <script>\r\n");
          out.write("\t\t\t\t\tincdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.penalty_case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.guilt_base}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.exhibit_wild}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\t\t\t\t\tincdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("';\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t//alert(incdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] + \" TTTTT \" + '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("');\r\n");
          out.write("\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f6.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f60(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f43, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f60 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f60.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f43);
    _jspx_th_c_005fif_005f60.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEdit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f60 = _jspx_th_c_005fif_005f60.doStartTag();
    if (_jspx_eval_c_005fif_005f60 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                  \t\t");
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>\r\n");
        out.write("<script type='text/javascript' src='dwr/engine.js'></script>\r\n");
        out.write("<script type='text/javascript' src='dwr/util.js'></script>\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\" ></script>\r\n");
        out.write("<script>\r\n");
        out.write("  function toggle() {\r\n");
        out.write("   if( document.getElementById(\"isLawbreakerN\").checked==true ){\r\n");
        out.write("\t\tdocument.getElementById(\"txtEstimateFine\").disabled=false;\r\n");
        out.write("\t\tdocument.getElementById(\"chkIsCourt\").disabled=true;\r\n");
        out.write("\t\tdocument.getElementById(\"chkIsCourt\").checked=false;\r\n");
        out.write("   }else{\r\n");
        out.write("\t\tdocument.getElementById(\"chkIsCourt\").disabled=false;\r\n");
        out.write("\t\tif(document.getElementById(\"chkIsCourt\").checked==true){\r\n");
        out.write("\t\t\tdocument.getElementById(\"txtEstimateFine\").disabled=false;\r\n");
        out.write("\t\t\tdocument.getElementById(\"txtEstimateFineDate\").disabled=false;\r\n");
        out.write("\t\t\tdocument.getElementById(\"imgEstimateFineDate\").style.display='';\r\n");
        out.write("\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\tdocument.getElementById(\"txtEstimateFine\").disabled=true;\r\n");
        out.write("\t\t\tdocument.getElementById(\"txtEstimateFineDate\").disabled=true;\r\n");
        out.write("\t\t\tdocument.getElementById(\"imgEstimateFineDate\").style.display='none';\r\n");
        out.write("\r\n");
        out.write("\t\t}\r\n");
        out.write("   }\r\n");
        out.write("  }\r\n");
        out.write("\r\n");
        out.write("function ch_accuserType(){\r\n");
        out.write("\tfor (i=0;i<document.dataform.accuserType.length;i++) { \r\n");
        out.write("      if (document.dataform.accuserType[i].checked){ \r\n");
        out.write("    \t  document.dataform.mu_accuserType.value = document.dataform.accuserType[i].value; \r\n");
        out.write("      }\r\n");
        out.write("\t} \r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("  <tr >\r\n");
        out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr class=\"bgRowGray\">\r\n");
        out.write("    <td colspan=\"4\"><strong>รายละเอียดบันทึกการจับกุม</strong> </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr >\r\n");
        out.write("    <td colspan=\"4\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td width=\"20%\" height=\"25\" align=\"right\" >เลขที่งาน :&nbsp;</td>\r\n");
        out.write("\r\n");
        out.write("    <td width=\"30%\"><input id=\"track_no\" name=\"track_no\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.track_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\"  />\r\n");
        out.write("      <input type=\"hidden\" name=\"id\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("       <input type=\"hidden\" name=\"update\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${update}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    </td>\r\n");
        out.write("    <td width=\"20%\" height=\"25\" align=\"right\">วันที่เขียนบันทึกจับกุม :&nbsp;</td>\r\n");
        out.write("    <td width=\"30%\">\r\n");
        out.write("        <input type=\"text\" name=\"application_date\" id=\"application_date\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"7\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td  height=\"25\" align=\"right\">เขียนที่ :&nbsp;</td>\r\n");
        out.write("    <td ><input name=\"department_code\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  class=\"textView\" id=\"department_code\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.department_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"4\" />\r\n");
        out.write("        <input name=\"department_name\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  class=\"textView\" id=\"department_name\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.department_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" />\r\n");
        out.write("    </td>\r\n");
        out.write("    <td height=\"25\" align=\"right\">วันที่เกิดเหตุ :&nbsp;</td>\r\n");
        out.write("    <td height=\"25\">\r\n");
        out.write("        <input name=\"occurrence_date\" type=\"text\"  class=\"textdate\" id=\"occurrence_date\" style=\"width:75;\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"7\" maxlength=\"10\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("        <input name=\"occurrence_time\" id=\"occurrence_time\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"5\" maxlength=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.occurrence_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td  height=\"25\" align=\"right\">พื้นที่ :&nbsp;</td>\r\n");
        out.write("    <td ><select name=\"offcode\" id=\"s\" style=\"width:200px;display:none;\" >\r\n");
        out.write("\t        ");
        if (_jspx_meth_c_005fforEach_005f7(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </select>\r\n");
        out.write("        <input name=\"tmp_offname\" type=\"text\"  id=\"tmp_offname\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    <td  height=\"25\" align=\"right\">ผู้กระทำผิด :&nbsp;</td>\r\n");
        out.write("    <td ><input name=\"lawbreakertype\" type=\"radio\" checked value=\"P\" disabled=\"disabled\"\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f62(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      /> บุคคลทั่วไป &nbsp;&nbsp;\r\n");
        out.write("      <input name=\"lawbreakertype\" type=\"radio\" value=\"C\" disabled=\"disabled\"\r\n");
        out.write("      ");
        if (_jspx_meth_c_005fif_005f63(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      />ผู้ประกอบการ</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td  height=\"25\" align=\"right\">พ.ร.บ. :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("\t    <select name=\"legislation_id\" id=\"legislation_id\" style=\"width:200px;display:none;\" >\r\n");
        out.write("\t    \t<option value=\"\" selected>เลือก</option>\r\n");
        out.write("\t      \t<option value=\"1\" ");
        if (_jspx_meth_c_005fif_005f64(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" >90 พ.ร.บ. สุรา พ.ศ.2493</option>\r\n");
        out.write("\t      \t<option value=\"2\" ");
        if (_jspx_meth_c_005fif_005f65(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" >91 พ.ร.บ.ยาสูบ พ.ศ.2509</option>\r\n");
        out.write("\t      \t<option value=\"3\" ");
        if (_jspx_meth_c_005fif_005f66(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" >92 พ.ร.บ.ไพ่</option>\r\n");
        out.write("\t      \t<option value=\"4\" ");
        if (_jspx_meth_c_005fif_005f67(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" >00 พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>\r\n");
        out.write("\t    </select>\r\n");
        out.write("\t    <input name=\"tmp_legislation_name\" type=\"text\"  id=\"tmp_legislation_name\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    </td>\r\n");
        out.write("    <td  height=\"25\" align=\"right\">มีตัวผู้กระทำผิด :&nbsp;</td>\r\n");
        out.write("    <td ><input name=\"have_culprit\" id=\"have_culpri\" type=\"radio\" value=\"Y\" checked onclick=\"toggle();\" disabled=\"disabled\"\r\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f68(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      /> มีตัว &nbsp;&nbsp;\r\n");
        out.write("      <input name=\"have_culprit\" id=\"have_culpri\" type=\"radio\" value=\"N\" onclick=\"toggle();\" disabled=\"disabled\"\r\n");
        out.write("      ");
        if (_jspx_meth_c_005fif_005f69(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      /> ไม่มีตัว&nbsp;&nbsp;\r\n");
        out.write("      <input name=\"issentcourt\" id=\"issentcour\" type=\"checkbox\" disabled=\"disabled\" onclick=\"toggle();\"\r\n");
        out.write("      ");
        if (_jspx_meth_c_005fif_005f70(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      value = 'Y'/> ส่งฟ้องศาล\r\n");
        out.write("\t</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td height=\"25\" align=\"right\">สินค้า :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t<select id=\"product_group_id\" name=\"product_group_id\" style=\"width:200px;display:none;\" >\r\n");
        out.write("    \t</select>\r\n");
        out.write("    \t<input name=\"tmp_group_name\" type=\"text\"  id=\"tmp_group_name\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.product_group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    </td>\r\n");
        out.write("    <td align=\"right\" valign=\"top\">ประมาณการค่าปรับ :&nbsp;</td>\r\n");
        out.write("    <td valign=\"top\" colspan=\"3\"><input type=\"text\" onKeyPress=\"txtKeyPress();\" disabled=\"disabled\" onKeyDown=\"disableKeyDown();\" name=\"estimate_fine\" id=\"estimate_fine\" class=\"textNum\"  size=\"10\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.estimate_fine}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("      บาท</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td align=\"right\" valign=\"top\">ผู้กล่าวหา :&nbsp;</td>\r\n");
        out.write("    <td colspan=\"3\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("      <tr height=\"25\">\r\n");
        out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"2\"  ");
        if (_jspx_meth_c_005fif_005f71(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f72(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" > เจ้าหน้าที่กรมสรรพสามิต </td>\r\n");
        out.write("        <td><input name=\"accuserType\" type=\"radio\" value=\"3\"  ");
        if (_jspx_meth_c_005fif_005f73(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f74(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" > เจ้าหน้าที่สรรพสามิตภาค </td>\r\n");
        out.write("        <td  align=\"right\">ชื่อผู้กล่าวหา :&nbsp;</td>\r\n");
        out.write("        <td>\r\n");
        out.write("        \t\t<input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" id=\"accuser\"  name=\"accuser\" class=\"textview\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("        \t\t<input type=\"hidden\" id=\"accuser_idcardno\" name=\"accuser_idcardno\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("              \t<input type=\"hidden\" id=\"mu_accuserType\" name=\"mu_accuserType\" value=\"\" />\r\n");
        out.write("              \t<img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" \r\n");
        out.write("              \tstyle=\"cursor:pointer;");
        if (_jspx_meth_c_005fif_005f75(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\" \r\n");
        out.write("              \tonClick=\"ch_accuserType();window.open('process?action=Divide_staff_popForArrest&formname=accuser&id=accuser_idcardno&posname=posname&poscode=accuser_poscode&offname=offname&offcode=accuser_offcode&actype='+document.dataform.mu_accuserType.value , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" /> \r\n");
        out.write("              \t<font style=\"color:red\">*</font>\r\n");
        out.write("        </td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr height=\"25\">\r\n");
        out.write("        <td>\r\n");
        out.write("        \t<input name=\"accuserType\" type=\"radio\" value=\"1\" ");
        if (_jspx_meth_c_005fif_005f76(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f77(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" >เจ้าหน้าที่สรรพสามิตพื้นที่ \r\n");
        out.write("        </td>\r\n");
        out.write("        <td>\r\n");
        out.write("        \t<input name=\"accuserType\" type=\"radio\" value=\"4\" ");
        if (_jspx_meth_c_005fif_005f78(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f79(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" >เจ้าหน้าที่สรรพสามิตพื้นที่สาขา\r\n");
        out.write("        </td>\r\n");
        out.write("        <td align=\"right\">ตำแหน่ง :&nbsp;</td>\r\n");
        out.write("        <td >\r\n");
        out.write("        \t\t<input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" id=\"posname\" name=\"posname\" class=\"textview\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("             \t<input type=\"hidden\" name=\"accuser_poscode\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("        </td>\r\n");
        out.write("      </tr>\r\n");
        out.write("      <tr>\r\n");
        out.write("        <td colspan=\"2\"><input name=\"accuserType\" type=\"radio\" value=\"5\" \r\n");
        out.write("              ");
        if (_jspx_meth_c_005fif_005f80(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_c_005fif_005f81(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" >เจ้าหน้าที่อื่นๆ</td>\r\n");
        out.write("        <td align=\"right\">สังกัด :&nbsp;</td>\r\n");
        out.write("        <td >\r\n");
        out.write("        \t<input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" id=\"offname\" name=\"offname\" class=\"textview\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("        \t<input type=\"hidden\" id=\"accuser_offcode\" name=\"accuser_offcode\" class=\"textview\" size=\"35\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accuser_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("        </td>\r\n");
        out.write("      </tr>\r\n");
        out.write("    </table></td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td height=\"25\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td   align=\"right\">ชื่อสถานที่เกิดเหตุ :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f82(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f83(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("    <td  align=\"right\">จังหวัด :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("        <select name=\"scene_province\" id=\"province\" ");
        if (_jspx_meth_c_005fif_005f84(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        style=\"width:200px\" onchange=\"getDistrict('district','tambol',this.value,'')\">\r\n");
        out.write("        \t  <option value=\"\">โปรดเลือก</option>\r\n");
        out.write("\t       \t  ");
        if (_jspx_meth_c_005fforEach_005f8(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </select>\r\n");
        out.write("        <font style=\"color:red\">*</font>\r\n");
        out.write("   </td>\r\n");
        out.write("\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td  align=\"right\">บ้านเลขที่ :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f86(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f87(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("    <td align=\"right\">อำเภอ :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("        <select name=\"district\" id=\"district\"  style=\"width:200px\" ");
        if (_jspx_meth_c_005fif_005f88(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        onchange=\"getTambol('tambol',this.value,'')\">\r\n");
        out.write("     \t</select>\r\n");
        out.write("     \t<font style=\"color:red\">*</font>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td  align=\"right\">ซอย :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f89(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f90(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("    <td align=\"right\">ตำบล :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("       \t<select name=\"tambol\" id=\"tambol\"  style=\"width:200px\" ");
        if (_jspx_meth_c_005fif_005f91(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" >  \r\n");
        out.write("       \t</select>\r\n");
        out.write("\t\t<font style=\"color:red\">*</font>\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td align=\"right\">ถนน :&nbsp;</td>\r\n");
        out.write("    <td >\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f92(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f93(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("    <td align=\"right\">สถานีตำรวจท้องที่เกิดเหตุ :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f94(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f95(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t(ส.ส.2/54)\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr height=\"25\">\r\n");
        out.write("    <td align=\"right\">จำนวนผู้กระทำผิด :&nbsp;</td>\r\n");
        out.write("    <td > ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aalsize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" คน &nbsp;&nbsp;&nbsp;       \r\n");
        out.write("        <input name=\"alleged_co\" type=\"checkbox\"  ");
        if (_jspx_meth_c_005fif_005f96(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write(" disabled=\"disabled\"/>\r\n");
        out.write("      ข้อกล่าวหาร่วมกัน </td>\r\n");
        out.write("    <td  align=\"right\">ละติจูด :&nbsp;</td>\r\n");
        out.write("    <td>\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f97(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t");
        if (_jspx_meth_c_005fif_005f98(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td colspan=\"4\" height=\"25\" align=\"right\">&nbsp;</td>\r\n");
        out.write("  </tr>\r\n");
        out.write("</table>\r\n");
        out.write("<script>\r\n");
        out.write("getProvince('province','district','tambol','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("');\r\n");
        out.write("setGroupID('product_group_id','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.product_group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("');\r\n");
        out.write("//getDistrict('district','tambol','");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('\'');
        out.write(',');
        out.write('\'');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("');\r\n");
        out.write("</script>\r\n");
        out.write(" <!-- รายละเอียดบันทึกการจับกุม-->\r\n");
        out.write("                  \t\t");
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/Popup.js\" ></script>\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var incmaxrow=1; // jsp  Count  config\r\n");
        out.write("var incstartrow=2;\r\n");
        out.write("var inceditrow = -1;\r\n");
        out.write("var inceditna = 0;\r\n");
        out.write("\r\n");
        out.write("function incinsRow(myTable,maxrox,data1,data2,data3,data4,id,data6)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("var row;\r\n");
        out.write("var x=document.getElementById(myTable).insertRow(incmaxrow);\r\n");
        out.write("incmaxrow++;\r\n");
        out.write("row = incmaxrow - 1;\r\n");
        out.write("var y1=x.insertCell(0);\r\n");
        out.write("var y2=x.insertCell(1);\r\n");
        out.write("var y3=x.insertCell(2);\r\n");
        out.write("var y4=x.insertCell(3);\r\n");
        out.write("var y5=x.insertCell(4);\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var exp = new Date();\r\n");
        out.write("var s = exp.getTime();\r\n");
        out.write("\r\n");
        out.write("y1.innerHTML=\"<input  readonly class='textboxlist' size='1' name='tc_id' value='\" + row + \"' />\"+\"<input type=\\\"hidden\\\" name=\\\"aai_id\\\" value=\\\"\"+id+\"\\\">\";\r\n");
        out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"inccheckbox\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"incref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("y3.innerHTML= data1+ \"<input type=\\\"hidden\\\" name=\\\"aai_case_law_id\\\" value=\\\"\" +data1+ \"\\\">\"\r\n");
        out.write("+ \"<input type=\\\"hidden\\\" name=\\\"aai_indictment_id\\\" value=\\\"\" +data6+ \"\\\">\" ;\r\n");
        out.write("y4.innerHTML=data2+\"<input type=\\\"hidden\\\" id=\\\"aai_penalty_case_law_id\\\" name=\\\"aai_penalty_case_law_id\\\" value=\\\"\"+data2+\"\\\">\";\r\n");
        out.write("y5.innerHTML=data3+\"<input type=\\\"hidden\\\" name=\\\"aai_guilt_base\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aai_exhibit_wild\\\" value=\\\"\"+data4+\"\\\">\";\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("}\r\n");
        out.write("function incdelRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (incmaxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,incmaxrow-1);\r\n");
        out.write("incmaxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function incalternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function increrun_id()\r\n");
        out.write("{\r\n");
        out.write("if (!document.dataform.tc_id.length)\r\n");
        out.write("{\r\n");
        out.write("document.dataform.tc_id.value=1;\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.tc_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tdocument.dataform.tc_id[i].value=i+1;\r\n");
        out.write("   }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function incdelRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("incmaxrow--\r\n");
        out.write("}\r\n");
        out.write("function incopenmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("var  dup=0;\r\n");
        out.write("var data = window.showModalDialog('process?action=Indictment_pop&cmd=add' , self , 'dialogWidth=700px,Height=400px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\t{\r\n");
        out.write("\t\tfor (var i=0; i < data.length; i++)\r\n");
        out.write("\t\t{\r\n");
        out.write("\t\t\tdup=0;\r\n");
        out.write("\t\t\t\tif (incmaxrow>1)\r\n");
        out.write("\t\t\t{\r\n");
        out.write("\t\t\t\tfor (var j=0; j < document.dataform.aai_indictment_id.length; j++)\r\n");
        out.write("\t\t\t\t{\r\n");
        out.write("\t\t\t\t\t//alert (document.dataform.aai_indictment_id[j].value+ \"-\" +data[i][5]);\r\n");
        out.write("\t\t\t\t\tif (document.dataform.aai_indictment_id[j].value==data[i][5])\r\n");
        out.write("\t\t\t\t\t\t{dup=1;}\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t\tif (dup==0)\r\n");
        out.write("\t    \t{incinsRow(myTable,incmaxrow,data[i][1],data[i][2],data[i][3],data[i][4],'',data[i][5]);}\r\n");
        out.write("\t    }\r\n");
        out.write("\t}\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function incget_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("var c_value = \"\";\r\n");
        out.write("var x=\"\";\r\n");
        out.write("if (!document.dataform.inccheckbox.length)\r\n");
        out.write("{\r\n");
        out.write("\tdocument.getElementById(myTable).deleteRow(1);\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.inccheckbox.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\r\n");
        out.write("   if (document.dataform.inccheckbox[i].checked)\r\n");
        out.write("      {\r\n");
        out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
        out.write("\t\tdocument.getElementById(myTable).deleteRow(i);\r\n");
        out.write("\t\ti--;\r\n");
        out.write("\t\tincmaxrow--;\r\n");
        out.write("      }\r\n");
        out.write("   }\r\n");
        out.write("   //alert(incmaxrow-1);\r\n");
        out.write("   increrun_id();\r\n");
        out.write("}\r\n");
        out.write("function incrender(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=incdata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        incinsRow(myTable,i,incdata1[i],incdata2[i],incdata3[i],incdata4[i],incdata5[i],incdata6[i]);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("var incdata1 =new Array();\r\n");
        out.write("var incdata2 =new Array();\r\n");
        out.write("var incdata3 =new Array();\r\n");
        out.write("var incdata4 =new Array();\r\n");
        out.write("var incdata5 =new Array();\r\n");
        out.write("var incdata6 =new Array();\r\n");
        out.write("\r\n");
        out.write("function incCheck(chkcont,chk)\r\n");
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
        out.write("</script>\r\n");
        out.write("\r\n");
        out.write("<table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td width=\"20%\" height=\"25\" align=\"right\" valign=\"top\">ข้อกล่าวหา :&nbsp;</td>\r\n");
        out.write("    <td width=\"80%\" colspan=\"3\">\r\n");
        out.write("        <table class=\"tableList\" id=incTable width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("             <tr class=\"TblHeaderColumn AlignCenter\">\r\n");
        out.write("                  <td width=\"10%\">ลำดับที่</td>\r\n");
        out.write("                  <td width=\"5%\" ><input type=\"checkbox\" name=\"incallCheckbox\" value=\"\" onClick=\"incCheck(this,document.dataform.inccheckbox);\" />\r\n");
        out.write("\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"inccheckbox\"></td>\r\n");
        out.write("                  <td width=\"20%\">มาตรา</td>\r\n");
        out.write("                  <td width=\"15%\">บทกำหนดโทษ</td>\r\n");
        out.write("                  <td width=\"50%\">ข้อกล่าวหา</td>\r\n");
        out.write("             </tr>\r\n");
        out.write("\t\t\t ");
        if (_jspx_meth_c_005fforEach_005f9(_jspx_th_c_005fif_005f60, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        </table>\r\n");
        out.write("\r\n");
        out.write("    </td>\r\n");
        out.write("   </tr>\r\n");
        out.write("   <tr>\r\n");
        out.write("      <td colspan=\"4\" height=\"25\" align=\"right\">&nbsp;</td>\r\n");
        out.write("   </tr>\r\n");
        out.write("</table>\r\n");
        out.write("<script>\r\n");
        out.write("incrender('incTable');\r\n");
        out.write("</script>");
        out.write("  <!-- ข้อกล่าวหา-->\r\n");
        out.write("                  \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f60.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f60);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f60);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fforEach_005f7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${edlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f7.setVar("off");
    int[] _jspx_push_body_count_c_005fforEach_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f7 = _jspx_th_c_005fforEach_005f7.doStartTag();
      if (_jspx_eval_c_005fforEach_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t          <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f61(_jspx_th_c_005fforEach_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f7))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.short_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f7.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f61(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f61 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f61.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f7);
    _jspx_th_c_005fif_005f61.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${off.offcode == db.offcode}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f61 = _jspx_th_c_005fif_005f61.doStartTag();
    if (_jspx_eval_c_005fif_005f61 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f61.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f61);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f61);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f62(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f62 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f62.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f62.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreak_type == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f62 = _jspx_th_c_005fif_005f62.doStartTag();
    if (_jspx_eval_c_005fif_005f62 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f62.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f62);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f62);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f63(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f63 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f63.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f63.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreak_type == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f63 = _jspx_th_c_005fif_005f63.doStartTag();
    if (_jspx_eval_c_005fif_005f63 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f63.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f63);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f64(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f64 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f64.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f64.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f64 = _jspx_th_c_005fif_005f64.doStartTag();
    if (_jspx_eval_c_005fif_005f64 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f64.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f64);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f65(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f65 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f65.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f65.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f65 = _jspx_th_c_005fif_005f65.doStartTag();
    if (_jspx_eval_c_005fif_005f65 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f65.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f65);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f66(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f66 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f66.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f66.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f66 = _jspx_th_c_005fif_005f66.doStartTag();
    if (_jspx_eval_c_005fif_005f66 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f66.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f66);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f67(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f67 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f67.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f67.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f67 = _jspx_th_c_005fif_005f67.doStartTag();
    if (_jspx_eval_c_005fif_005f67 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f67.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f67);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f67);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f68(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f68 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f68.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f68.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.have_culprit == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f68 = _jspx_th_c_005fif_005f68.doStartTag();
    if (_jspx_eval_c_005fif_005f68 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f68.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f68);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f68);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f69(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f69 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f69.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f69.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.have_culprit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f69 = _jspx_th_c_005fif_005f69.doStartTag();
    if (_jspx_eval_c_005fif_005f69 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f69.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f69);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f69);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f70(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f70 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f70.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f70.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f70.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.issentcourt == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f70 = _jspx_th_c_005fif_005f70.doStartTag();
    if (_jspx_eval_c_005fif_005f70 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f70.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f70);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f70);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f71(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f71 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f71.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f71.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f71.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f71 = _jspx_th_c_005fif_005f71.doStartTag();
    if (_jspx_eval_c_005fif_005f71 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f71.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f71);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f71);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f72(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f72 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f72.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f72.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f72.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f72 = _jspx_th_c_005fif_005f72.doStartTag();
    if (_jspx_eval_c_005fif_005f72 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f72.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f72);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f72);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f73(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f73 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f73.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f73.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f73.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f73 = _jspx_th_c_005fif_005f73.doStartTag();
    if (_jspx_eval_c_005fif_005f73 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f73.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f73);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f73);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f74(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f74 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f74.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f74.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f74 = _jspx_th_c_005fif_005f74.doStartTag();
    if (_jspx_eval_c_005fif_005f74 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f74.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f74);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f74);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f75(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f75 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f75.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f75.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f75.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f75 = _jspx_th_c_005fif_005f75.doStartTag();
    if (_jspx_eval_c_005fif_005f75 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("display:none;");
        int evalDoAfterBody = _jspx_th_c_005fif_005f75.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f75);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f75);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f76(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f76 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f76.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f76.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f76.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f76 = _jspx_th_c_005fif_005f76.doStartTag();
    if (_jspx_eval_c_005fif_005f76 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f76.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f76);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f76);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f77(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f77 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f77.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f77.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f77.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f77 = _jspx_th_c_005fif_005f77.doStartTag();
    if (_jspx_eval_c_005fif_005f77 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f77.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f77);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f77);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f78(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f78 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f78.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f78.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f78.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f78 = _jspx_th_c_005fif_005f78.doStartTag();
    if (_jspx_eval_c_005fif_005f78 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f78.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f78);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f78);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f79(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f79 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f79.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f79.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f79.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f79 = _jspx_th_c_005fif_005f79.doStartTag();
    if (_jspx_eval_c_005fif_005f79 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f79.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f79);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f79);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f80(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f80 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f80.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f80.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f80.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_type == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f80 = _jspx_th_c_005fif_005f80.doStartTag();
    if (_jspx_eval_c_005fif_005f80 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f80.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f80);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f80);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f81(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f81 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f81.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f81.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f81.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f81 = _jspx_th_c_005fif_005f81.doStartTag();
    if (_jspx_eval_c_005fif_005f81 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f81.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f81);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f81);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f82(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f82 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f82.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f82.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f82.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f82 = _jspx_th_c_005fif_005f82.doStartTag();
    if (_jspx_eval_c_005fif_005f82 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_name\" type=\"text\" class=\"textview\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f82.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f82);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f82);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f83(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f83 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f83.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f83.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f83.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f83 = _jspx_th_c_005fif_005f83.doStartTag();
    if (_jspx_eval_c_005fif_005f83 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t    \t<input name=\"scene_name\" type=\"text\" class=\"text\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("\t    \t<font style=\"color:red\">*</font>\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f83.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f83);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f83);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f84(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f84 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f84.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f84.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f84.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f84 = _jspx_th_c_005fif_005f84.doStartTag();
    if (_jspx_eval_c_005fif_005f84 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f84.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f84);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f84);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fforEach_005f8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pvlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f8.setVar("pv");
    int[] _jspx_push_body_count_c_005fforEach_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f8 = _jspx_th_c_005fforEach_005f8.doStartTag();
      if (_jspx_eval_c_005fforEach_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t       \t  \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f85(_jspx_th_c_005fforEach_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f8))
            return true;
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t       \t  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f8.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f85(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f85 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f85.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f85.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f8);
    _jspx_th_c_005fif_005f85.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pv.province_code == db.scene_province}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f85 = _jspx_th_c_005fif_005f85.doStartTag();
    if (_jspx_eval_c_005fif_005f85 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
        int evalDoAfterBody = _jspx_th_c_005fif_005f85.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f85);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f85);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f86(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f86 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f86.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f86.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f86.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f86 = _jspx_th_c_005fif_005f86.doStartTag();
    if (_jspx_eval_c_005fif_005f86 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_no\" type=\"text\" class=\"textview\" size=\"8\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t      &nbsp;&nbsp; หมู่ :\r\n");
        out.write("\t\t    <input name=\"scene_moo\" type=\"text\" class=\"textview\" size=\"5\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f86.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f86);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f86);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f87(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f87 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f87.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f87.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f87.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f87 = _jspx_th_c_005fif_005f87.doStartTag();
    if (_jspx_eval_c_005fif_005f87 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t    <input name=\"scene_no\" type=\"text\" class=\"text\" size=\"8\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t      &nbsp;&nbsp; หมู่ :\r\n");
        out.write("\t\t    <input name=\"scene_moo\" type=\"text\" class=\"text\" size=\"5\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("      \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f87.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f87);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f87);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f88(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f88 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f88.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f88.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f88.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f88 = _jspx_th_c_005fif_005f88.doStartTag();
    if (_jspx_eval_c_005fif_005f88 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f88.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f88);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f88);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f89(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f89 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f89.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f89.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f89.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f89 = _jspx_th_c_005fif_005f89.doStartTag();
    if (_jspx_eval_c_005fif_005f89 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_soi\" type=\"text\" class=\"textview\" id=\"scene_soi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f89.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f89);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f89);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f90(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f90 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f90.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f90.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f90.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f90 = _jspx_th_c_005fif_005f90.doStartTag();
    if (_jspx_eval_c_005fif_005f90 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_soi\" type=\"text\" class=\"text\" id=\"scene_soi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\"  />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f90.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f90);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f90);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f91(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f91 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f91.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f91.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f91 = _jspx_th_c_005fif_005f91.doStartTag();
    if (_jspx_eval_c_005fif_005f91 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("disabled");
        int evalDoAfterBody = _jspx_th_c_005fif_005f91.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f91);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f91);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f92(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f92 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f92.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f92.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f92.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f92 = _jspx_th_c_005fif_005f92.doStartTag();
    if (_jspx_eval_c_005fif_005f92 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_road\" type=\"text\" class=\"textview\" id=\"scene_road\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f92.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f92);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f92);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f93(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f93 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f93.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f93.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f93.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f93 = _jspx_th_c_005fif_005f93.doStartTag();
    if (_jspx_eval_c_005fif_005f93 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"scene_road\" type=\"text\" class=\"text\" id=\"scene_road\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"25\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f93.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f93);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f93);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f94(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f94 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f94.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f94.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f94.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f94 = _jspx_th_c_005fif_005f94.doStartTag();
    if (_jspx_eval_c_005fif_005f94 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"police_station\" type=\"text\" class=\"textview\" size=\"22\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.police_station}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f94.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f94);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f94);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f95(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f95 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f95.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f95.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f95.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f95 = _jspx_th_c_005fif_005f95.doStartTag();
    if (_jspx_eval_c_005fif_005f95 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"police_station\" type=\"text\" class=\"text\" size=\"22\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.police_station}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f95.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f95);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f95);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f96(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f96 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f96.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f96.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f96.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aalsize >= 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f96 = _jspx_th_c_005fif_005f96.doStartTag();
    if (_jspx_eval_c_005fif_005f96 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f96.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f96);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f96);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f97(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f97 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f97.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f97.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f97.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest!='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f97 = _jspx_th_c_005fif_005f97.doStartTag();
    if (_jspx_eval_c_005fif_005f97 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"coordinate_x\" type=\"text\" class=\"textview\" size=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_x}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("\t      \t&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t     \t ลองจิจูด :&nbsp;&nbsp;\r\n");
        out.write("\t      \t<input name=\"coordinate_y\" type=\"text\" class=\"textview\" size=\"5\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_y}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f97.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f97);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f97);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f98(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f98 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f98.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f98.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fif_005f98.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditArrest=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f98 = _jspx_th_c_005fif_005f98.doStartTag();
    if (_jspx_eval_c_005fif_005f98 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    \t\t<input name=\"coordinate_x\" type=\"text\" class=\"text\" size=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_x}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t      \t&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t     \t ลองจิจูด :&nbsp;&nbsp;\r\n");
        out.write("\t      \t<input name=\"coordinate_y\" type=\"text\" class=\"text\" size=\"5\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.coordinate_y}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("    \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f98.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f98);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f98);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f60, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f60);
    _jspx_th_c_005fforEach_005f9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aailist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f9.setVar("inc");
    _jspx_th_c_005fforEach_005f9.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f9 = _jspx_th_c_005fforEach_005f9.doStartTag();
      if (_jspx_eval_c_005fforEach_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t    <script>\r\n");
          out.write("\t\t\tincdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.penalty_case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.guilt_base}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.exhibit_wild}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tincdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\tincdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inc.indictment_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t</script>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f9.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f99(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f99 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f99.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f99.setParent(null);
    _jspx_th_c_005fif_005f99.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.chkcaselast == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f99 = _jspx_th_c_005fif_005f99.doStartTag();
    if (_jspx_eval_c_005fif_005f99 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                  \t");
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\" ></script>\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
        out.write("  \tfunction toggleHidden(mID, btnID){\r\n");
        out.write("\r\n");
        out.write("\t\tdocument.getElementById('app2_39').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('lawbreaker_list').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('arrestTeam').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('exhibitList').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('licenseList').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('2_6Tab').style.display='none';\r\n");
        out.write("\r\n");
        out.write("\t\tdocument.getElementById('btn2_39').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btnLawbreakerList').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btnArrestTeam').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btnExhibitList').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btnLicenseList').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btn2_6').style.background='#D4D0C8';\r\n");
        out.write("\r\n");
        out.write("\t\tmnu = document.getElementById(mID);\r\n");
        out.write("\t\tbtn = document.getElementById(btnID);\r\n");
        out.write("\t\tif (mnu.style.display == 'none'){\r\n");
        out.write("\t\t\tmnu.style.display ='';\r\n");
        out.write("\t\t\tbtn.style.background='#FFCC33';\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\tmnu.style.display ='none';\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}\r\n");
        out.write("</script>\r\n");
        out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td width=\"1%\">&nbsp;</td>\r\n");
        out.write("     <td style=\"cursor:hand;\" width=\"98%\" >\r\n");
        out.write("        <input name=\"btnLawbreakerList\" id=\"btnLawbreakerList\" type=\"button\" class=\"button\" value=\"รายชื่อผู้กระทำผิดกฎหมาย\" onClick='toggleHidden(\"lawbreaker_list\",\"btnLawbreakerList\");' style=\"background:#FFCC33\">&nbsp;&nbsp;\r\n");
        out.write("        <input name=\"btn2_39\" id=\"btn2_39\" type=\"button\" class=\"button\" value=\"บันทึกการจับ\" onClick='toggleHidden(\"app2_39\", \"btn2_39\");' >&nbsp;&nbsp;\r\n");
        out.write("        <input name=\"btnArrestTeam\" id=\"btnArrestTeam\" type=\"button\" class=\"button\" value=\"คณะผู้จับกุม\" onClick='toggleHidden(\"arrestTeam\",\"btnArrestTeam\");'>&nbsp;&nbsp;\r\n");
        out.write("        <input name=\"btnExhibitList\" id=\"btnExhibitList\" type=\"button\" class=\"button\" value=\"บัญชีสิ่งของ\" onClick='toggleHidden(\"exhibitList\",\"btnExhibitList\");'>&nbsp;&nbsp;\r\n");
        out.write("        <input name=\"btnLicenseList\" id=\"btnLicenseList\" type=\"button\" class=\"button\" value=\"ข้อมูลใบอนุญาต/ข้อมูลสืบสวน\" onClick='toggleHidden(\"licenseList\",\"btnLicenseList\");'>&nbsp;&nbsp;\r\n");
        out.write("\t\t<input name=\"btn2_6\" id=\"btn2_6\" type=\"button\" class=\"button\" value=\"รายงานบันทึกการจับ 2/6ก\" onClick='toggleHidden(\"2_6Tab\",\"btn2_6\");'>\r\n");
        out.write("     </td>\r\n");
        out.write("     <td width=\"1%\" >&nbsp;\r\n");
        out.write("\r\n");
        out.write("     </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr >\r\n");
        out.write("     <td>&nbsp;</td>\r\n");
        out.write("     <td>\r\n");
        out.write("      <!-- ==============================================ผู้กระทำผิด======================================================== -->\r\n");
        out.write("<script>\r\n");
        out.write("var lawsmaxrow=1; // jsp  Count  config\r\n");
        out.write("var lawsstartrow=2;\r\n");
        out.write("var lawseditrow = -1;\r\n");
        out.write("var lawseditna = 0;\r\n");
        out.write("\r\n");
        out.write("function lawsinsRow(myTable,lawsmaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36)\r\n");
        out.write("{\r\n");
        out.write("\tvar row;\r\n");
        out.write("\tvar x=document.getElementById(myTable).insertRow(lawsmaxrow);\r\n");
        out.write("\tlawsmaxrow++;\r\n");
        out.write("\trow = lawsmaxrow - 1;\r\n");
        out.write("\tvar y1=x.insertCell(0);\r\n");
        out.write("\tvar y2=x.insertCell(1);\r\n");
        out.write("\tvar y3=x.insertCell(2);\r\n");
        out.write("\tvar y4=x.insertCell(3);\r\n");
        out.write("\tvar y5=x.insertCell(4);\r\n");
        out.write("\tvar y6=x.insertCell(5);\r\n");
        out.write("\tvar y7=x.insertCell(6);\r\n");
        out.write("\tvar y8=x.insertCell(7);\r\n");
        out.write("\tvar y9=x.insertCell(8);\r\n");
        out.write("\tvar y10=x.insertCell(9);\r\n");
        out.write("\tvar y11=x.insertCell(10);\r\n");
        out.write("\tvar y12=x.insertCell(11);\r\n");
        out.write("\tvar y13=x.insertCell(12);\r\n");
        out.write("\tvar y14=x.insertCell(13);\r\n");
        out.write("\t\r\n");
        out.write("\tvar exp = new Date();\r\n");
        out.write("\tvar s = exp.getTime();\r\n");
        out.write("\t\r\n");
        out.write("\ty1.innerHTML=\"<input readonly class='textboxlist' size='1' name='lawstc_id' value='\" + row + \"' />\";\r\n");
        out.write("\ty2.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"lawsref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("\ty3.innerHTML=data22+data5+\" \"+data6;\r\n");
        out.write("\tif (data1=\"1\"){\r\n");
        out.write("\t\ty4.innerHTML=\"คนไทย\";\r\n");
        out.write("\t}else if(data1=\"2\"){\r\n");
        out.write("\t\ty4.innerHTML=\"ชาวต่างชาติ\";\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\ty4.innerHTML=\"ผู้ประกอบการ\";\r\n");
        out.write("\t}\r\n");
        out.write("\t\r\n");
        out.write("\ty5.innerHTML=data17;\r\n");
        out.write("\ty6.innerHTML=data18;\r\n");
        out.write("\ty7.innerHTML=data2;\r\n");
        out.write("\ty8.innerHTML=data29;\r\n");
        out.write("\ty9.innerHTML=data26;\r\n");
        out.write("\ty10.innerHTML=data27;\r\n");
        out.write("\ty11.innerHTML=data8+\" หมู่ \"+data9+\" ซอย \"+data10+\" ถ. \"+data11+\" ต. \"+data25+\" อ. \"+data24+\" จ. \"+data23;\r\n");
        out.write("\ty12.innerHTML=data19;\r\n");
        out.write("\ty13.innerHTML=data20;\r\n");
        out.write("\ty14.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"aal_culprit_type\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_lawbreaker_id_card\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_sex\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_title_code\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_first_name\\\" value=\\\"\"+data5+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_last_name\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_other_name\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_address_no\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_moo\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_soi\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_road\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_province\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_district\\\" value=\\\"\"+data13+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_subdistrict\\\" value=\\\"\"+data14+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_race_id\\\" value=\\\"\"+data15+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_nationality_id\\\" value=\\\"\"+data16+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_career\\\" value=\\\"\"+data17+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_birth_date\\\" value= \\\"\"+data18+ \"\\\" >\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_father_name\\\" value=\\\"\"+data19+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_mother_name\\\" value=\\\"\"+data20+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_id\\\" value=\\\"\"+data21+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_title_name\\\" value=\\\"\"+data22+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_province_name\\\" value=\\\"\"+data23+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_district_name\\\" value=\\\"\"+data24+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_subdistrict_name\\\" value=\\\"\"+data25+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_race_id_name\\\" value=\\\"\"+data26+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_nationality_id_name\\\" value=\\\"\"+data27+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_testimony\\\" value=\\\"\"+data28+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_lawbreaker_passport\\\" value=\\\"\"+data29+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_middle_name\\\" value=\\\"\"+data30+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_company_title_code\\\" value=\\\"\"+data31+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_company_name\\\" value=\\\"\"+data32+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_excise_reg_no\\\" value=\\\"\"+data33+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_corporation_code\\\" value=\\\"\"+data34+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_age\\\" value=\\\"\"+data35+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_lawbreaker_no\\\" value=\\\"\"+data36+\"\\\">\"\r\n");
        out.write("\t+\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.testimony}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\";\r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function lawsforedit(row)\r\n");
        out.write("{\r\n");
        out.write("if (document.dataform.lawsref_id.length)\r\n");
        out.write("{\r\n");
        out.write("  for (var i=0; i < document.dataform.lawsref_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tif (document.dataform.lawsref_id[i].value== row)\r\n");
        out.write("\t\t\t{//alert(i+1);\r\n");
        out.write("\t\t\tlawseditrow = i+1;}\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write(" else\r\n");
        out.write(" {//alert(\"1\");\r\n");
        out.write(" lawseditrow = 0;}\r\n");
        out.write("   }\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function lawsdelRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (lawsmaxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,lawsmaxrow-1);\r\n");
        out.write("lawsmaxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function lawsalternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function lawsrerun_id()\r\n");
        out.write("{\r\n");
        out.write("\tif (!document.dataform.lawstc_id.length)\r\n");
        out.write("\t{\r\n");
        out.write("\t\tdocument.dataform.lawstc_id.value=1;\r\n");
        out.write("\t}\r\n");
        out.write("\t\r\n");
        out.write("\tfor (var i=0; i < document.dataform.lawstc_id.length; i++)\r\n");
        out.write("    {\r\n");
        out.write("\t\tdocument.dataform.lawstc_id[i].value=i+1;\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function lawsdelRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("lawsmaxrow--\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function lawsopenmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("var data = window.showModalDialog('process?action=arrest_lawbreaker&cmd=add' , self , 'Width=500px,Height=500px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\t\tlawsinsRow(myTable,lawsmaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[35],data[36]);\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("function lawseditmodal(myTable,p1,p2)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("\tlawseditna= 1;\r\n");
        out.write("var data = window.showModalDialog('process?action=arrest_lawbreaker&cmd=add&p1='+p1+'&p2='+p2 , self , 'Width=500px,Height=500px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\tlawsdelRown(myTable,lawseditrow)\r\n");
        out.write("\r\n");
        out.write("\tlawsinsRow(myTable,lawsmaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[35],data[36]);\r\n");
        out.write("\r\n");
        out.write("\t}\r\n");
        out.write("\tlawseditna = 0;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function lawsCheck(chk)\r\n");
        out.write("{\r\n");
        out.write("if(document.dataform.lawsCheck_ctr.checked==true){\r\n");
        out.write("for (i = 0; i < lawschk.length; i++)\r\n");
        out.write("lawschk[i].checked = true ;\r\n");
        out.write("}else{\r\n");
        out.write("\r\n");
        out.write("for (i = 0; i < lawschk.length; i++)\r\n");
        out.write("lawschk[i].checked = false ;\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function lawsget_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("var c_value = \"\";\r\n");
        out.write("var x=\"\";\r\n");
        out.write("if (!document.dataform.lawscheck_list.length)\r\n");
        out.write("{\r\n");
        out.write("\tdocument.getElementById(myTable).deleteRow(1);\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.lawscheck_list.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\r\n");
        out.write("   if (document.dataform.lawscheck_list[i].checked)\r\n");
        out.write("      {\r\n");
        out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
        out.write("\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
        out.write("\t\ti--;\r\n");
        out.write("\t\tlawsmaxrow--;\r\n");
        out.write("      }\r\n");
        out.write("   }\r\n");
        out.write("   //alert(lawsmaxrow-1);\r\n");
        out.write("   rerun_id();\r\n");
        out.write("}\r\n");
        out.write("   function lawsrender(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=lawsdata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        lawsinsRow(myTable,i,lawsdata1[i],lawsdata2[i],lawsdata3[i],lawsdata4[i],lawsdata5[i],lawsdata6[i],lawsdata7[i],lawsdata8[i],lawsdata9[i],lawsdata10[i],lawsdata11[i],lawsdata12[i],lawsdata13[i],lawsdata14[i],lawsdata15[i],lawsdata16[i],lawsdata17[i],lawsdata18[i],lawsdata19[i],lawsdata20[i],lawsdata21[i],lawsdata22[i],lawsdata23[i],lawsdata24[i] ,lawsdata25[i],lawsdata26[i],lawsdata27[i],lawsdata28[i],lawsdata29[i],lawsdata30[i],lawsdata31[i],lawsdata32[i],lawsdata33[i],lawsdata34[i],lawsdata35[i],lawsdata36[i]);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var lawsdata1 =new Array();\r\n");
        out.write("var lawsdata2 =new Array();\r\n");
        out.write("var lawsdata3 =new Array();\r\n");
        out.write("var lawsdata4 =new Array();\r\n");
        out.write("var lawsdata5 =new Array();\r\n");
        out.write("var lawsdata6 =new Array();\r\n");
        out.write("var lawsdata7 =new Array();\r\n");
        out.write("var lawsdata8 =new Array();\r\n");
        out.write("var lawsdata9 =new Array();\r\n");
        out.write("var lawsdata10 =new Array();\r\n");
        out.write("var lawsdata11 =new Array();\r\n");
        out.write("var lawsdata12 =new Array();\r\n");
        out.write("var lawsdata13 =new Array();\r\n");
        out.write("var lawsdata14 =new Array();\r\n");
        out.write("var lawsdata15 =new Array();\r\n");
        out.write("var lawsdata16 =new Array();\r\n");
        out.write("var lawsdata17 =new Array();\r\n");
        out.write("var lawsdata18 =new Array();\r\n");
        out.write("var lawsdata19 =new Array();\r\n");
        out.write("var lawsdata20 =new Array();\r\n");
        out.write("var lawsdata21 =new Array();\r\n");
        out.write("var lawsdata22 =new Array();\r\n");
        out.write("var lawsdata23 =new Array();\r\n");
        out.write("var lawsdata24 =new Array();\r\n");
        out.write("var lawsdata25 =new Array();\r\n");
        out.write("var lawsdata26 =new Array();\r\n");
        out.write("var lawsdata27 =new Array();\r\n");
        out.write("var lawsdata28 =new Array();\r\n");
        out.write("var lawsdata29 =new Array();\r\n");
        out.write("var lawsdata30 =new Array();//middle name\r\n");
        out.write("var lawsdata31 =new Array();//title company code\r\n");
        out.write("var lawsdata32 =new Array();//company name\r\n");
        out.write("var lawsdata33 =new Array();//aal.excise_reg_no\r\n");
        out.write("var lawsdata34 =new Array();//aal.corporation_code\r\n");
        out.write("var lawsdata35 = new Array();//text age\r\n");
        out.write("var lawsdata36 = new Array(); //lawbreaker_no\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<!-- ==============================================ปิดผู้กระทำผิด======================================================== -->\r\n");
        out.write("\r\n");
        out.write(" <!-- รายชื่อผู้กระทำความผิด-->\r\n");
        out.write("\r\n");
        out.write("          <div class=\"innerPosition\" id=\"lawbreaker_list\" >\r\n");
        out.write("               <table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t <td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t</tr>\r\n");
        out.write("\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("                                <table id=\"lawsTable\" class=\"tableList\" width=\"1500\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
        out.write("                                   <tr>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn aligncenter\">ลำดับที่</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn aligncenter\"></td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ชื่อผู้กระทำผิด</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ประเภทผู้กระทำความผิด</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">อาชีพ</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">อายุ</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">เลขที่บัตรปชช</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">เลขที่หนังสือเดินทาง</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">เชื้อชาติ</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">สัญชาติ</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ที่อยู่</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ชื่อบิดา</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ชื่อมารดา</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">คำให้การของผู้ต้องหา</td>\r\n");
        out.write("                                   </tr>\r\n");
        out.write("                                   ");
        if (_jspx_meth_c_005fforEach_005f10(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </table>\r\n");
        out.write("\r\n");
        out.write("                         </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("          <!-- END รายชื่อผู้กระทำความผิด-->\r\n");
        out.write("\r\n");
        out.write("          <!-- mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmบันทึกจับกุมmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("         <div class=\"innerPosition\"  id=\"app2_39\" style=\"width:750px;display:none\">\r\n");
        out.write("                 <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
        out.write("\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td colspan=\"2\" align=\"center\">\r\n");
        out.write("                              <table width=\"100%\">\r\n");
        out.write("                                 <tr valign=\"top\">\r\n");
        out.write("                                     <td width=\"155\"  align=\"right\">พฤติการณ์ในการจับ :</td>\r\n");
        out.write("                                     <td align=\"left\"><textarea onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" name=\"behaviour\" id=\"behaviour\" cols=\"45\" rows=\"3\" class=\"textareabig\"  >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.behaviour}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea></td>\r\n");
        out.write("                                     <td align=\"left\">(ส.ส.2/39)</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <tr valign=\"top\">\r\n");
        out.write("                                     <td  align=\"right\">คำให้การของผู้ต้องหา :</td>\r\n");
        out.write("                                     <td align=\"left\"><textarea onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" name=\"testimony\" id=\"testimony\" cols=\"45\" rows=\"3\" class=\"textareabig\"  >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.testimony}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea></td>\r\n");
        out.write("                                     <td align=\"left\">&nbsp;</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <tr valign=\"top\">\r\n");
        out.write("                                     <td   align=\"right\">การแจ้งสิทธิ :</td>\r\n");
        out.write("                                     <td align=\"left\"><textarea onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" name=\"administration\" id=\"administration\" cols=\"45\" rows=\"3\" class=\"textareabig\"  >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.administration}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea></td>\r\n");
        out.write("                                     <td align=\"left\">&nbsp;</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <tr valign=\"top\" style=\"display:none\">\r\n");
        out.write("                                     <td   align=\"right\">เวลาที่ตรวจค้นเสร็จ:</td>\r\n");
        out.write("                                     <td align=\"left\" ><input name=\"finished_time\" type=\"text\" class=\"textView\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"5\" maxlength=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.finished_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"   ></td>\r\n");
        out.write("                                     <td align=\"left\">&nbsp;</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                              </table>\r\n");
        out.write("                         </td>\r\n");
        out.write("                     </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("          <!--mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm END บันทึกจับกุมmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->\r\n");
        out.write("\r\n");
        out.write("          <!--kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk คณะที่เข้าตรวจค้นkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk -->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("          <script type=\"text/javascript\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var aatmaxrow=1; // jsp  Count  config\r\n");
        out.write("var aatstartrow=2;\r\n");
        out.write("var aateditrow = -1;\r\n");
        out.write("var aateditna = 0;\r\n");
        out.write("\r\n");
        out.write("function aatinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12)\r\n");
        out.write("{\r\n");
        out.write("\tvar xdata = \"<select style='width:100' name=\\\"aat_duty_status_id\\\" disabled >\"\r\n");
        out.write("\t");
        if (_jspx_meth_c_005fforEach_005f11(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t+\"</select >\"\r\n");
        out.write("\r\n");
        out.write(";\r\n");
        out.write("\r\n");
        out.write("var row;\r\n");
        out.write("var x=document.getElementById(myTable).insertRow(aatmaxrow);\r\n");
        out.write("aatmaxrow++;\r\n");
        out.write("row = aatmaxrow - 1;\r\n");
        out.write("var y1=x.insertCell(0);\r\n");
        out.write("var y2=x.insertCell(1);\r\n");
        out.write("var y3=x.insertCell(2);\r\n");
        out.write("var y4=x.insertCell(3);\r\n");
        out.write("var y5=x.insertCell(4);\r\n");
        out.write("var y6=x.insertCell(5);\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var exp = new Date();\r\n");
        out.write("var s = exp.getTime();\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("y1.innerHTML=\"<input readonly class='textboxlist' size='1' name='aattc_id' value='\" + row + \"' />\";\r\n");
        out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"aatcheckbox\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"aatref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("//y3.innerHTML= data3;\r\n");
        out.write("y3.innerHTML= data12+data10+\" \"+data11;\r\n");
        out.write("y4.innerHTML= data4;\r\n");
        out.write("y5.innerHTML= data9;\r\n");
        out.write("y6.innerHTML= xdata+\"<input type=\\\"hidden\\\" name=\\\"aat_id\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_no\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_inspector_code\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_position\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
        out.write("//+\"<input type=\\\"hidden\\\" name=\\\"aat_duty_status_id\\\" value=\\\"\"+data5+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_idcardno\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_poscode\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_offcode\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_offname\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_first_name\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_last_name\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_title_name\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
        out.write(";\r\n");
        out.write("if(row == 1){ \r\n");
        out.write("document.dataform.aat_duty_status_id.value = data5;\r\n");
        out.write("}else if(row > 1 ){ \r\n");
        out.write("\tdocument.dataform.aat_duty_status_id[row-1].value = data5; }\r\n");
        out.write("\r\n");
        out.write("}\r\n");
        out.write("function aatdelRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (aatmaxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,aatmaxrow-1);\r\n");
        out.write("aatmaxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function aatalternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function aatrerun_id()\r\n");
        out.write("{\r\n");
        out.write("if (!document.dataform.aattc_id.length)\r\n");
        out.write("{\r\n");
        out.write("document.dataform.aattc_id.value=1;\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.aattc_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tdocument.dataform.aattc_id[i].value=i+1;\r\n");
        out.write("   }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function aatdelRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("aatmaxrow--\r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function aatopenmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("var  dup=0;\r\n");
        out.write("var data = window.showModalDialog('process?action=Divide_staff_poplist', self , 'dialogWidth=700px,Height=400px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\t{\r\n");
        out.write("\t\tfor (var i=0; i < data.length; i++)\r\n");
        out.write("\t\t{\r\n");
        out.write("\t\t\tdup=0;\r\n");
        out.write("\t\t\tif (aatmaxrow>1)\r\n");
        out.write("\t\t\t{\r\n");
        out.write("\t\t\t\tfor (var j=0; j < document.dataform.aat_staff_idcardno.length; j++)\r\n");
        out.write("\t\t\t\t{\r\n");
        out.write("\t\t\t\t\t//alert (document.dataform.aat_staff_idcardno[j].value+ \"-\" +data[i][5]);\r\n");
        out.write("\t\t\t\t\tif (document.dataform.aat_staff_idcardno[j].value==data[i][5])\r\n");
        out.write("\t\t\t\t\t\t{dup=1;}\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t\tif (dup==0)\r\n");
        out.write("\t    \t{\r\n");
        out.write("\t    \taatinsRow(myTable,aatmaxrow,\"\",data[i][1],data[i][2],data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8],data[i][9],data[i][10],data[i][11]);\r\n");
        out.write("\r\n");
        out.write("\t    \t}\r\n");
        out.write("\t    }\r\n");
        out.write("\t}\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("\r\n");
        out.write("function aatget_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("var c_value = \"\";\r\n");
        out.write("var x=\"\";\r\n");
        out.write("\r\n");
        out.write("for (var i=1; i < document.dataform.aatcheckbox.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\r\n");
        out.write("   if (document.dataform.aatcheckbox[i].checked)\r\n");
        out.write("      {\r\n");
        out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
        out.write("\t\tdocument.getElementById(myTable).deleteRow(i);\r\n");
        out.write("\t\ti--;\r\n");
        out.write("\t\taatmaxrow--;\r\n");
        out.write("      }\r\n");
        out.write("   }\r\n");
        out.write("   //alert(aatmaxrow-1);\r\n");
        out.write("   aatrerun_id();\r\n");
        out.write("}\r\n");
        out.write("function aatrender(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=aatdata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        aatinsRow(myTable,i,aatdata1[i],aatdata2[i],aatdata3[i],aatdata4[i],aatdata5[i],aatdata6[i],aatdata7[i],aatdata8[i],aatdata9[i],aatdata10[i],aatdata11[i],aatdata12[i]);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("var aatdata1 =new Array();\r\n");
        out.write("var aatdata2 =new Array();\r\n");
        out.write("var aatdata3 =new Array();\r\n");
        out.write("var aatdata4 =new Array();\r\n");
        out.write("var aatdata5 =new Array();\r\n");
        out.write("var aatdata6 =new Array();\r\n");
        out.write("var aatdata7 =new Array();\r\n");
        out.write("var aatdata8 =new Array();\r\n");
        out.write("var aatdata9 =new Array();\r\n");
        out.write("var aatdata10 =new Array();\r\n");
        out.write("var aatdata11 =new Array();\r\n");
        out.write("var aatdata12 =new Array();\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function aatCheck(chkcont,chk)\r\n");
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
        out.write("</script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("          <div class=\"innerPosition\" id=\"arrestTeam\" style=\"display:none\">\r\n");
        out.write("               <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("\r\n");
        out.write("                                   <table  id=\"aatTable\" class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
        out.write("                                             <tr>\r\n");
        out.write("                                             <td  height=\"15\" class=\"TblHeaderColumn AlignCenter\">ลำดับ</td>\r\n");
        out.write("                                             <td class=\"TblHeaderColumn aligncenter\">\r\n");
        out.write("                                           </td>\r\n");
        out.write("                                             <td  class=\"TblHeaderColumn \">ชื่อ-สกุล</td>\r\n");
        out.write("                                             <td  class=\"TblHeaderColumn \">ตำแหน่ง</td>\r\n");
        out.write("                                             <td  class=\"TblHeaderColumn \">ชื่อสังกัด</td>\r\n");
        out.write("                                             <td  class=\"TblHeaderColumn \">ในฐานะ</td>\r\n");
        out.write("                                          </tr>\r\n");
        out.write("\r\n");
        out.write("                                           ");
        if (_jspx_meth_c_005fforEach_005f12(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                        </table>\r\n");
        out.write("\r\n");
        out.write("                              </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("          <!--kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk END คณะที่เข้าตรวจค้นkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk-->\r\n");
        out.write("\r\n");
        out.write("<!-- =========================================================สิ่งของ======================================================================================  -->\r\n");
        out.write("\r\n");
        out.write("<script>\r\n");
        out.write("var dumaxrow=1; // jsp  Count  config\r\n");
        out.write("var dustartrow=2;\r\n");
        out.write("var dueditrow = -1;\r\n");
        out.write("var dueditna = 0;\r\n");
        out.write("\r\n");
        out.write("function duinsRow(myTable,dumaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,id,text1,text2,text3,text4,text5,data26,data27,data28, isEdit, rows)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("\tvar row;\r\n");
        out.write("\tvar x;\r\n");
        out.write("\tif(isEdit==\"N\"){ //กรณีเพิ่มรายการ\r\n");
        out.write("\t\tx=document.getElementById(myTable).insertRow(dumaxrow);\r\n");
        out.write("\t\tdumaxrow++;\r\n");
        out.write("\t\trow = dumaxrow - 1;\r\n");
        out.write("\r\n");
        out.write("\t\tvar y1=x.insertCell(0);\r\n");
        out.write("\t\tvar y2=x.insertCell(1);\r\n");
        out.write("\t\tvar y3=x.insertCell(2);\r\n");
        out.write("\t\tvar y4=x.insertCell(3);\r\n");
        out.write("\t\tvar y5=x.insertCell(4);\r\n");
        out.write("\t\tvar y6=x.insertCell(5);\r\n");
        out.write("\t\tvar y7=x.insertCell(6);\r\n");
        out.write("\t\tvar y8=x.insertCell(7);\r\n");
        out.write("\t\tvar y9=x.insertCell(8);\r\n");
        out.write("\t\tvar y10=x.insertCell(9);\r\n");
        out.write("\t\tvar y11=x.insertCell(10);\r\n");
        out.write("\t\tvar y12=x.insertCell(11);\r\n");
        out.write("\t\tvar y13=x.insertCell(12);\r\n");
        out.write("\t\t\r\n");
        out.write("\t}else{  //กรณีแก้ไข\r\n");
        out.write("\t\tx=document.getElementById(myTable).rows[rows];\r\n");
        out.write("\t\trow = rows;\r\n");
        out.write("\r\n");
        out.write("\t\tvar y1=x.cells(0);\r\n");
        out.write("\t\tvar y2=x.cells(1);\r\n");
        out.write("\t\tvar y3=x.cells(2);\r\n");
        out.write("\t\tvar y4=x.cells(3);\r\n");
        out.write("\t\tvar y5=x.cells(4);\r\n");
        out.write("\t\tvar y6=x.cells(5);\r\n");
        out.write("\t\tvar y7=x.cells(6);\r\n");
        out.write("\t\tvar y8=x.cells(7);\r\n");
        out.write("\t\tvar y9=x.cells(8);\r\n");
        out.write("\t\tvar y10=x.cells(9);\r\n");
        out.write("\t\tvar y11=x.cells(10);\r\n");
        out.write("\t\tvar y12=x.cells(11);\r\n");
        out.write("\t\tvar y13=x.cells(12);\r\n");
        out.write("\t}\r\n");
        out.write("\r\n");
        out.write("\t\r\n");
        out.write("\tvar exp = new Date();\r\n");
        out.write("\tvar s = exp.getTime();\r\n");
        out.write("\t\r\n");
        out.write("\ty1.innerHTML=\"<input readonly class='textboxlist' size='1' name='dutc_id' value='\" + row + \"' />\";\r\n");
        out.write("\ty2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"ducheck_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"duref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("\ty3.innerHTML=data3;\r\n");
        out.write("\t\r\n");
        out.write("\tvar productDesc = data28;\r\n");
        out.write("\tif(data3 != \"\")\r\n");
        out.write("\t\tproductDesc += \"ชนิด \" + data3;\r\n");
        out.write("\tif(data7 != \"\" && data2 != \"\")\r\n");
        out.write("\t\tproductDesc += \"<br />ยี่ห้อ\" +data7\r\n");
        out.write("\t\r\n");
        out.write("\tif (data1==\"N\"){\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fif_005f101(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fif_005f102(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\ty4.innerHTML= productDesc;\r\n");
        out.write("\t}\r\n");
        out.write("\t\r\n");
        out.write("\tif (data8.substr(0,1)==\"O\"){\r\n");
        out.write("\t\ty5.innerHTML=\"ต่างประเทศ\";\r\n");
        out.write("\t}else if(data8.substr(0,1)==\"I\"){\r\n");
        out.write("\t\ty5.innerHTML=\"ในประเทศ\";\r\n");
        out.write("\t}else\r\n");
        out.write("\t\ty5.innerHTML=\"ไม่ระบุ\";\r\n");
        out.write("\t\r\n");
        out.write("\tif (data15.substr(0,1)==\"1\"){\r\n");
        out.write("\t\ty6.innerHTML=\"ยึด\";\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\ty6.innerHTML=\"คืน\";\r\n");
        out.write("\t}\r\n");
        out.write("\r\n");
        out.write("\tif(text2 == \"โปรดเลือก\")\r\n");
        out.write("\t\ttext2 = \"\";\r\n");
        out.write("\tif(text3 == \"โปรดเลือก\")\r\n");
        out.write("\t\ttext3 = \"\";\r\n");
        out.write("\tif(text4 == \"โปรดเลือก\")\r\n");
        out.write("\t\ttext4 = \"\";\r\n");
        out.write("\t\r\n");
        out.write("\ty7.innerHTML=text1+\" \"+text2;\r\n");
        out.write("\ty8.innerHTML=data11+\" \"+text3;\r\n");
        out.write("\ty9.innerHTML=data13+\" \"+text4;\r\n");
        out.write("\tif (data1==\"N\")\r\n");
        out.write("\t{y10.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"isdomestichk\\\" disabled=\\\"true\\\" value=\\\"\\\">\";}\r\n");
        out.write("\telse\r\n");
        out.write("\t{y10.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"isdomestichk\\\" disabled=\\\"true\\\" CHECKED value=\\\"\\\"><BR/>\"+text5;}\r\n");
        out.write("\t\r\n");
        out.write("\ty11.innerHTML=data17;\r\n");
        out.write("\ty12.innerHTML=data18;\r\n");
        out.write("\ty13.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"aae_isexhibitco\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_duty_code\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_duty_name\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_product_code\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_product_name\\\" value=\\\"\"+data5+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_brand_code\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_brand_name\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_isdomestic\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_code\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_unit_code\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty_unit_code\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight\\\" value=\\\"\"+data13+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight_unit_code\\\" value=\\\"\"+data14+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_status\\\" value=\\\"\"+data15+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_exhibit_list\\\" value=\\\"\"+data16+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_exhibit_desc\\\" value=\\\"\"+data17+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_car_no\\\" value=\\\"\"+data18+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_remarks\\\" value=\\\"\"+data19+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_id\\\" value=\\\"\"+id+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_code_text\\\" value=\\\"\"+text1+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_unit_code_text\\\" value=\\\"\"+text2+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty_unit_code_text\\\" value=\\\"\"+text3+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight_unit_code_text\\\" value=\\\"\"+text4+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_case_id\\\" value=\\\"\"+text5+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_co_id\\\" value=\\\"\"+data26+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_group_id\\\" value=\\\"\"+data27+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_group_name\\\" value=\\\"\"+data28+\"\\\">\"\r\n");
        out.write("\t+data19;\r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function duforedit(row)\r\n");
        out.write("{\r\n");
        out.write("if (document.dataform.duref_id.length)\r\n");
        out.write("{\r\n");
        out.write("  for (var i=0; i < document.dataform.duref_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tif (document.dataform.duref_id[i].value== row)\r\n");
        out.write("\t\t\t{\r\n");
        out.write("\t\t\tdueditrow = i+1;}\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write(" else\r\n");
        out.write(" {\r\n");
        out.write(" dueditrow = 1;}\r\n");
        out.write("   }\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function dudelRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (dumaxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,dumaxrow-1);\r\n");
        out.write("dumaxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function dualternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function durerun_id()\r\n");
        out.write("{\r\n");
        out.write("if (dumaxrow == 2){\r\n");
        out.write("\tdocument.dataform.dutc_id.value=1;\r\n");
        out.write("}else if(dumaxrow > 2){\r\n");
        out.write("\tfor (var i=0; i < document.dataform.dutc_id.length; i++)\r\n");
        out.write("\t   {\r\n");
        out.write("\t\t\tdocument.dataform.dutc_id[i].value=i+1;\r\n");
        out.write("\t   }\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function dudelRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("dumaxrow--\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function duopenmodal(myTable){\r\n");
        out.write("\r\n");
        out.write("\tif(document.dataform.legislation_id.value != \"\"){\r\n");
        out.write("\t\twriteTranLog('เพิ่มบัญชีสิ่งของ');\r\n");
        out.write("\t\tvar group_id = document.dataform.product_group_id.value;\r\n");
        out.write("\t\tvar legislation_id = dwr.util.getValue();\r\n");
        out.write("\t\tvar data = window.showModalDialog('process?action=Duty_table_list&cmd=list&group_id='+group_id+'&legislation_id='+document.dataform.legislation_id.value , self , 'Width=500px,Height=400px');\r\n");
        out.write("\t\tif(data != null){\r\n");
        out.write("\t\t\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],\"\",data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],\"N\", null);\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\talert(\"กรุณาเลือกพระราชบัญญัติ\");\r\n");
        out.write("\t\tdocument.dataform.legislation_id.focus();\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("function dueditmodal(myTable, row){\r\n");
        out.write("\tif(document.dataform.legislation_id.value != \"\"){\r\n");
        out.write("\t\twriteTranLog('แก้ไขรายการบัญชีสิ่งของ');\r\n");
        out.write("\t\tdueditna= 1;\r\n");
        out.write("\t\tvar group_id = document.dataform.product_group_id.value;\r\n");
        out.write("\t\tvar data = window.showModalDialog('process?action=Duty_table_list&cmd=list&group_id='+group_id +'&legislation_id='+document.dataform.legislation_id.value , self , 'Width=500px,Height=400px');\r\n");
        out.write("\t\tif(data != null){\r\n");
        out.write("\t\t\t//dudelRown(myTable,dueditrow);  ไม่มีการลบแถว\r\n");
        out.write("\t\t\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],\"Y\", row);\r\n");
        out.write("\t\t}\r\n");
        out.write("\t\tdueditna = 0;\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\talert(\"กรุณาเลือกพระราชบัญญัติ\");\r\n");
        out.write("\t\tdocument.dataform.legislation_id.focus();\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function duCheck(chk)\r\n");
        out.write("{\r\n");
        out.write("if(document.dataform.duCheck_ctr.checked==true){\r\n");
        out.write("for (i = 0; i < duchk.length; i++)\r\n");
        out.write("duchk[i].checked = true ;\r\n");
        out.write("}else{\r\n");
        out.write("\r\n");
        out.write("for (i = 0; i < duchk.length; i++)\r\n");
        out.write("duchk[i].checked = false ;\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function duget_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("\tvar c_value = \"\";\r\n");
        out.write("\tvar x=dumaxrow;\r\n");
        out.write("\t\r\n");
        out.write("\tif (document.dataform.ducheck_list != null){\r\n");
        out.write("\t\tif (dumaxrow == 2 && document.dataform.ducheck_list.checked)\r\n");
        out.write("\t\t{\r\n");
        out.write("\t\t\tdocument.getElementById(myTable).deleteRow(1);\r\n");
        out.write("\t\t\tdumaxrow--;\r\n");
        out.write("\t\t\twriteTranLog('ลบรายการบัญชีสิ่งของ');\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\tfor (var i=0; i < document.dataform.ducheck_list.length; i++){\r\n");
        out.write("\t\t\t\tif (document.dataform.ducheck_list[i].checked){\r\n");
        out.write("\t\t\t\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
        out.write("\t\t\t\t\ti--;\r\n");
        out.write("\t\t\t\t\tdumaxrow--;\r\n");
        out.write("\t\t\t      }\r\n");
        out.write("\t\t\t   }\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t\t\tif(x!=dumaxrow){\r\n");
        out.write("\t\t\t\t    writeTranLog('ลบรายการบัญชีสิ่งของ');\r\n");
        out.write("\t\t\t\t    durender();\r\n");
        out.write("\t\t\t    }\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}\r\n");
        out.write("\tdocument.getElementById(\"aaeChkAll\").checked = false;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function durender(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=dudata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        duinsRow(myTable,i,dudata1[i],dudata2[i],dudata3[i],dudata4[i],dudata5[i],dudata6[i],dudata7[i],dudata8[i],dudata9[i],dudata10[i],dudata11[i],dudata12[i],dudata13[i],dudata14[i],dudata15[i],dudata16[i],dudata17[i],dudata18[i],dudata19[i],dudata20[i],dudata21[i],dudata22[i],dudata23[i],dudata24[i] ,dudata25[i],dudata26[i],dudata27[i],dudata28[i],\"N\",null);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var dudata1 =new Array();\r\n");
        out.write("var dudata2 =new Array();\r\n");
        out.write("var dudata3 =new Array();\r\n");
        out.write("var dudata4 =new Array();\r\n");
        out.write("var dudata5 =new Array();\r\n");
        out.write("var dudata6 =new Array();\r\n");
        out.write("var dudata7 =new Array();\r\n");
        out.write("var dudata8 =new Array();\r\n");
        out.write("var dudata9 =new Array();\r\n");
        out.write("var dudata10 =new Array();\r\n");
        out.write("var dudata11 =new Array();\r\n");
        out.write("var dudata12 =new Array();\r\n");
        out.write("var dudata13 =new Array();\r\n");
        out.write("var dudata14 =new Array();\r\n");
        out.write("var dudata15 =new Array();\r\n");
        out.write("var dudata16 =new Array();\r\n");
        out.write("var dudata17 =new Array();\r\n");
        out.write("var dudata18 =new Array();\r\n");
        out.write("var dudata19 =new Array();\r\n");
        out.write("var dudata20 =new Array();\r\n");
        out.write("var dudata21 =new Array();\r\n");
        out.write("var dudata22 =new Array();\r\n");
        out.write("var dudata23 =new Array();\r\n");
        out.write("var dudata24 =new Array();\r\n");
        out.write("var dudata25 =new Array();\r\n");
        out.write("var dudata26 =new Array();\r\n");
        out.write("var dudata27 =new Array();\r\n");
        out.write("var dudata28 =new Array();\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("\r\n");
        out.write("<!-- ====================================================================สิ่งของ===========================================================================  -->\r\n");
        out.write("<!-- บัญชีสิ่งของ-->\r\n");
        out.write("\r\n");
        out.write("          <div class=\"innerPosition\" id=\"exhibitList\" style=\"display:none;\">\r\n");
        out.write("               <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("               \t\t");
        if (_jspx_meth_c_005fif_005f103(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("                             <table id=\"duTable\" class=\"tableList\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("                                  <tr>\r\n");
        out.write("                                       <td width=\"28\"  height=\"15\" class=\"TblHeaderColumn AlignCenter\">ลำดับ</td>\r\n");
        out.write("                                       <td width=\"20\" class=\"TblHeaderColumn AlignCenter\">\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_005fif_005f104(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                       </td>\r\n");
        out.write("                                       <td width=\"68\"  class=\"TblHeaderColumn \">ชนิดสินค้า</td>\r\n");
        out.write("                                       <td width=\"130\"  class=\"TblHeaderColumn \">ชื่อสินค้า</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">ใน / นอก</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">สถานะของกลาง</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">ขนาด</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">จำนวน</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">ปริมาณสุทธิ</td>\r\n");
        out.write("                                       <td width=\"97\"  class=\"TblHeaderColumn \">ของกลางร่วม(เลขที่คดี)</td>\r\n");
        out.write("                                       <td width=\"97\"  class=\"TblHeaderColumn \">ดีกรีสุรา</td>\r\n");
        out.write("                                       <td width=\"97\"  class=\"TblHeaderColumn \">ทะเบียนรถ</td>\r\n");
        out.write("                                       <td width=\"97\"  class=\"TblHeaderColumn \">หมายเหตุ(ส่วนพิสูจน์)</td>\r\n");
        out.write("                              \t  </tr>\r\n");
        out.write("\r\n");
        out.write("\t                               ");
        if (_jspx_meth_c_005fforEach_005f13(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </table>\r\n");
        out.write("\r\n");
        out.write("                         </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("<!-- END บัญชีสิ่งของ-->\r\n");
        out.write("\r\n");
        out.write("      <!-- ใบอนุญาต/ข้อมูลสืบสวน-->\r\n");
        out.write("          <div class=\"innerPosition\" id=\"licenseList\" style=\"display:none;\">\r\n");
        out.write("               <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("                   <tr class=\"bgRowGray\">\r\n");
        out.write("                      <td ><strong>รายละเอียดใบอนุญาต</strong> </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("\r\n");
        out.write("                         </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("                    <tr>\r\n");
        out.write("                     <td>\r\n");
        out.write("                        <table name=\"aliTable\" id=\"aliTable\" class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("                             <tr  class=\"TblHeaderColumn\">\r\n");
        out.write("                                  <td width=\"5%\" >ลำดับ</td>\r\n");
        out.write("                                  <td width=\"5%\" ></td>\r\n");
        out.write("                                  <td width=\"15%\" >สำนักงาน</td>\r\n");
        out.write("                                  <td width=\"20%\" >ชื่อผู้ประกอบการ</td>\r\n");
        out.write("                                  <td width=\"20%\" >ชื่อสถานประกอบการ</td>\r\n");
        out.write("                                  <td width=\"15%\" >ประเภทใบอนุญาต</td>\r\n");
        out.write("                                  <td width=\"10%\" >เล่มที่ใบอนุญาต</td>\r\n");
        out.write("                                  <td width=\"10%\" >เลขที่ใบอนุญาต</td>\r\n");
        out.write("                             </tr>\r\n");
        out.write("<!-- =============================================================ใบอนุญาต==================================================================================  -->\r\n");
        out.write("<script type=\"text/javascript\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var maxrow=1; // jsp  Count  config\r\n");
        out.write("var startrow=2;\r\n");
        out.write("var editrow = -1;\r\n");
        out.write("var editna = 0;\r\n");
        out.write("\r\n");
        out.write("function insRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,id)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("var row;\r\n");
        out.write("var x=document.getElementById(myTable).insertRow(maxrow);\r\n");
        out.write("maxrow++;\r\n");
        out.write("row = maxrow - 1;\r\n");
        out.write("var y1=x.insertCell(0);\r\n");
        out.write("var y2=x.insertCell(1);\r\n");
        out.write("var y3=x.insertCell(2);\r\n");
        out.write("var y4=x.insertCell(3);\r\n");
        out.write("var y5=x.insertCell(4);\r\n");
        out.write("var y6=x.insertCell(5);\r\n");
        out.write("var y7=x.insertCell(6);\r\n");
        out.write("var y8=x.insertCell(7);\r\n");
        out.write("\r\n");
        out.write("var exp = new Date();\r\n");
        out.write("var s = exp.getTime();\r\n");
        out.write("\r\n");
        out.write("y1.innerHTML=\"<input readonly class='textboxlist'' size='1' name='tc_id' value='\" + row + \"' />\"+\"<input type=\\\"hidden\\\" name=\\\"ali_id\\\" value=\\\"\"+id+\"\\\">\";\r\n");
        out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"check_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"ref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("y3.innerHTML=data2 ;\r\n");
        out.write("y4.innerHTML=data3+\"<input type=\\\"hidden\\\" id=\\\"ali_entrepreneur\\\" name=\\\"ali_entrepreneur\\\" value=\\\"\"+data3+\"\\\">\";\r\n");
        out.write("y5.innerHTML=data4+\"<input type=\\\"hidden\\\" name=\\\"ali_establishment_name\\\" value=\\\"\"+data4+\"\\\">\";\r\n");
        out.write("y6.innerHTML=data6+\"<input type=\\\"hidden\\\" name=\\\"ali_licensetype_name\\\" value=\\\"\"+data6+\"\\\">\"+\"<input type=\\\"hidden\\\" name=\\\"ali_license_type\\\" value=\\\"\"+data5+\"\\\">\";\r\n");
        out.write("y7.innerHTML=data7+\"<input type=\\\"hidden\\\" name=\\\"ali_book_no\\\" value=\\\"\"+data7+\"\\\">\";\r\n");
        out.write("y8.innerHTML=data8+\"<input type=\\\"hidden\\\" name=\\\"ali_license_no\\\" value=\\\"\"+data8+\"\\\">\"+\"<input type=\\\"hidden\\\" name=\\\"ali_iswithdraw\\\" value=\\\"\"+data9+\"\\\">\";\r\n");
        out.write("\r\n");
        out.write("}\r\n");
        out.write("function foredit(row)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("if (document.dataform.ref_id.length)\r\n");
        out.write("{\r\n");
        out.write("  for (var i=0; i < document.dataform.ref_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tif (document.dataform.ref_id[i].value== row)\r\n");
        out.write("\t\t\t{//alert(i+1);\r\n");
        out.write("\t\t\teditrow = i+1;}\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write(" else\r\n");
        out.write(" {//alert(\"1\");\r\n");
        out.write("\r\n");
        out.write(" editrow = 0;}\r\n");
        out.write("   }\r\n");
        out.write("function delRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (maxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,maxrow-1);\r\n");
        out.write("maxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function alternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function rerun_id()\r\n");
        out.write("{\r\n");
        out.write("if (!document.dataform.tc_id.length)\r\n");
        out.write("{\r\n");
        out.write("document.dataform.tc_id.value=1;\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.tc_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tdocument.dataform.tc_id[i].value=i+1;\r\n");
        out.write("   }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function delRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("maxrow--\r\n");
        out.write("}\r\n");
        out.write("function openmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("var data = window.showModalDialog('process?action=Arrest_license' , self , 'Width=500px,Height=400px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\r\n");
        out.write("\tinsRow(myTable,maxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]);\r\n");
        out.write("\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("function editmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("editna = 1;\r\n");
        out.write("var data = window.showModalDialog('process?action=Arrest_license', self , 'Width=500px,Height=400px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\tdelRown(myTable,editrow)\r\n");
        out.write("\r\n");
        out.write("\tinsRow(myTable,maxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]);\r\n");
        out.write("\r\n");
        out.write("\t}\r\n");
        out.write("\teditna = 0;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function Check(chk)\r\n");
        out.write("{\r\n");
        out.write("if(document.dataform.Check_ctr.checked==true){\r\n");
        out.write("for (i = 0; i < chk.length; i++)\r\n");
        out.write("chk[i].checked = true ;\r\n");
        out.write("}else{\r\n");
        out.write("\r\n");
        out.write("for (i = 0; i < chk.length; i++)\r\n");
        out.write("chk[i].checked = false ;\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function get_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("var c_value = \"\";\r\n");
        out.write("var x=\"\";\r\n");
        out.write("if (!document.dataform.check_list.length)\r\n");
        out.write("{\r\n");
        out.write("\tdocument.getElementById(myTable).deleteRow(1);\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.check_list.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\r\n");
        out.write("   if (document.dataform.check_list[i].checked)\r\n");
        out.write("      {\r\n");
        out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
        out.write("\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
        out.write("\t\ti--;\r\n");
        out.write("\t\tmaxrow--;\r\n");
        out.write("      }\r\n");
        out.write("   }\r\n");
        out.write("   //alert(maxrow-1);\r\n");
        out.write("   rerun_id();\r\n");
        out.write("}\r\n");
        out.write("function render(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=cdata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        insRow(myTable,i,cdata1[i],cdata2[i],cdata3[i],cdata4[i],cdata5[i],cdata6[i],cdata7[i],cdata8[i],cdata9[i],cdata10[i]);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("var cdata1 =new Array();\r\n");
        out.write("var cdata2 =new Array();\r\n");
        out.write("var cdata3 =new Array();\r\n");
        out.write("var cdata4 =new Array();\r\n");
        out.write("var cdata5 =new Array();\r\n");
        out.write("var cdata6 =new Array();\r\n");
        out.write("var cdata7 =new Array();\r\n");
        out.write("var cdata8 =new Array();\r\n");
        out.write("var cdata9 =new Array();\r\n");
        out.write("var cdata10 =new Array();\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("// End -->\r\n");
        out.write("</script>\r\n");
        out.write("<!-- =======================================================================ปิดใบอนุญาติ========================================================================  -->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_c_005fforEach_005f14(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                        </table>\r\n");
        out.write("                     </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                   <tr >\r\n");
        out.write("                      <td >&nbsp; </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                   <tr class=\"bgRowGray\">\r\n");
        out.write("                      <td ><strong>รายละเอียดในการสืบสวน</strong> </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                   <tr >\r\n");
        out.write("                      <td >&nbsp; </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                   <tr>\r\n");
        out.write("                     <td>\r\n");
        out.write("                       <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"500\">\r\n");
        out.write("                         <tr>\r\n");
        out.write("                           <td width=\"30%\" align=\"right\">\r\n");
        out.write("                             เลขที่การแจ้งความ :&nbsp;\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td width=\"70%\">\r\n");
        out.write("                              <input type=\"text\" name=\"notice_no\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.notice_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("                              <input type=\"hidden\" name=\"application_notice_arrest_id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_notice_arrest_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("                           </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("                         <tr>\r\n");
        out.write("                           <td align=\"right\">\r\n");
        out.write("                              ชื่อผู้แจ้งเบาะแส :&nbsp;\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td>\r\n");
        out.write("                              <input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" name=\"imform_name\" class=\"textview\" size=\"40\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.inform_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("                           </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("                         <tr>\r\n");
        out.write("                           <td  align=\"right\">\r\n");
        out.write("                             เลขที่หมายค้น :&nbsp;\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td >\r\n");
        out.write("                             <input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"25\" name=\"warrant_no\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.warrant_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                             <input type=\"hidden\" class=\"textview\" size=\"25\" id=\"application_search_warrant_id\" name=\"application_search_warrant_id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_search_warrant_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                           </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("                         <tr>\r\n");
        out.write("                           <td  align=\"right\">\r\n");
        out.write("                             เลขที่ สส.2/27 :&nbsp;\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td >\r\n");
        out.write("                             <input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  name=\"confirm_no\" class=\"textview\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.confirm_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                             <input type=\"hidden\" id=\"application_sincere_confirm_id\" name=\"application_sincere_confirm_id\" class=\"textview\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_sincere_confirm_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                           </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("                       </table>\r\n");
        out.write("                     </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("\r\n");
        out.write("          <!--END ใบอนุญาต-->\r\n");
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
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("          <!-- รายงานบันทึกการจับกุม 2/6ก-->\r\n");
        out.write("         <div class=\"innerPosition\"  id=\"2_6Tab\" style=\"width:750px;display:none\">\r\n");
        out.write("                 <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
        out.write("                      <tr>\r\n");
        out.write("                           <td width=\"50%\" valign=\"top\">\r\n");
        out.write("                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td height=\"25\" align=\"right\">วันที่บันทึกรายงาน :&nbsp;</td>\r\n");
        out.write("                                          <td height=\"25\">\r\n");
        out.write("                                                    <input name=\"arrest_report_date\" id=\"arrest_report_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.arrest_report_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr>\r\n");
        out.write("                                     \t<td>&nbsp;</td>\r\n");
        out.write("                                     \t<td align=\"left\">ข้อมูลบันทึกการจับ (ส.ส.2/39 ก,ข)</td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">ผู้ครอบครองสถานที่ :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"owner_name\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textView\" size=\"31\"   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.owner_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  >\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">ชื่อสถานประกอบการ :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"business_name\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textView\" size=\"31\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.business_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  >\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">ชื่อผู้รับรอง :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"surety_name\" type=\"text\" class=\"textView\" size=\"31\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.surety_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">ซึ่งเป็น :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"duty\" type=\"text\" class=\"textView\" size=\"31\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.duty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     \r\n");
        out.write("                                </table>\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td  width=\"50%\" valign=\"top\">\r\n");
        out.write("                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td height=\"25\" ><input name=\"guilty\" type=\"checkbox\" disabled  ");
        if (_jspx_meth_c_005fif_005f105(_jspx_th_c_005fif_005f99, _jspx_page_context))
          return true;
        out.write(" value = 'Y' /> &nbsp;มีความผิด</td>\r\n");
        out.write("                                          <td height=\"25\">&nbsp;</td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr>\r\n");
        out.write("                                     \t<td>&nbsp;</td>\r\n");
        out.write("                                     \t<td align=\"left\">รายงานผลการจับกุมผู้กระทำผิด (ส.ส.2/6 ก)</td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr >\r\n");
        out.write("                                          <td align=\"right\">รายงานหัวหน้าฝ่ายปราบปราม :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                            <input type=\"text\" name=\"report_to_name\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.report_to_staff}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("                                            <input type=\"hidden\" name=\"report_to\" id=\"report_to\" class=\"textview\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.report_to}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">รายงานหัวหน้าส่วนปราบปราม :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                            <input type=\"text\" name=\"order_by_name\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.order_by_staff}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                            <input type=\"hidden\" name=\"order_by\" id=\"order_by\" class=\"textview\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.order_by}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">รายงานผู้บังคับบัญชา :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"leader_position\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textView\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.leader_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr >\r\n");
        out.write("                                          <td  align=\"right\">รายงานผู้อำนวยการสำนักฯ/<br />สส.ภาค/สส.พื้นที่ :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"director_position\" type=\"text\" class=\"textView\" size=\"31\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.director_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                         </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("          <!-- END รายงานบันทึกการจับกุม-->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("     </td>\r\n");
        out.write("     <td>&nbsp;</td>\r\n");
        out.write("   </tr>\r\n");
        out.write("</table>\r\n");
        out.write("<script>\r\n");
        out.write("\r\n");
        out.write("var Rows = 0 ;\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("render('aliTable');\r\n");
        out.write("durender('duTable');\r\n");
        out.write("lawsrender('lawsTable');\r\n");
        out.write("aatrender('aatTable');\r\n");
        out.write("</script>");
        out.write("\r\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f99.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f99);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f99);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fforEach_005f10.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aallist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f10.setVar("aal");
    _jspx_th_c_005fforEach_005f10.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f10 = _jspx_th_c_005fforEach_005f10.doStartTag();
      if (_jspx_eval_c_005fforEach_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.culprit_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_id_card}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.other_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.address_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata13[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata14[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata15[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.race_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata16[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.nationality_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata17[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.career}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata18[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.birth_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata19[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.father_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata20[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.mother_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata21[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata22[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata23[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.province_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata24[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.district_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata25[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.subdistrict_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata26[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.race_id_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata27[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.nationality_id_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata28[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.testimony}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata29[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_passport}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata30[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.middle_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata31[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.company_title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata32[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.company_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata33[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.excise_reg_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata34[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.corporation_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata35[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.age}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata36[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";  \r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f10.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f11 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fforEach_005f11.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dslist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f11.setVar("ds");
    _jspx_th_c_005fforEach_005f11.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f11 = _jspx_th_c_005fforEach_005f11.doStartTag();
      if (_jspx_eval_c_005fforEach_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t+\"<option value=\\\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\\');
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f100(_jspx_th_c_005fforEach_005f11, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f11))
            return true;
          out.write(' ');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds.status_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\"\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f11.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f100(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f100 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f100.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f100.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f11);
    _jspx_th_c_005fif_005f100.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds.id == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f100 = _jspx_th_c_005fif_005f100.doStartTag();
    if (_jspx_eval_c_005fif_005f100 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f100.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f100);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f100);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f12 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fforEach_005f12.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aatlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f12.setVar("aat");
    _jspx_th_c_005fforEach_005f12.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f12 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f12 = _jspx_th_c_005fforEach_005f12.doStartTag();
      if (_jspx_eval_c_005fforEach_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.inspector_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.duty_status_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f12.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f12.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f12);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f101(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f101 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f101.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f101.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fif_005f101.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f101 = _jspx_th_c_005fif_005f101.doStartTag();
    if (_jspx_eval_c_005fif_005f101 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\ty4.innerHTML=\"<a class='spanLink' onClick=\\\"duforedit('\"+ s +\"');dueditmodal('duTable','\"+row+\"');durerun_id();\\\">\" +productDesc+  \"</a>\";\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f101.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f101);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f101);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f102(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f102 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f102.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f102.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fif_005f102.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment != 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f102 = _jspx_th_c_005fif_005f102.doStartTag();
    if (_jspx_eval_c_005fif_005f102 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\ty4.innerHTML= productDesc;\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f102.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f102);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f102);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f103(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f103 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f103.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f103.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fif_005f103.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f103 = _jspx_th_c_005fif_005f103.doStartTag();
    if (_jspx_eval_c_005fif_005f103 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t               \t\t<tr>\r\n");
        out.write("\t                         <td>\r\n");
        out.write("\t                              <span class=\"spanLink\" onClick=\"duopenmodal('duTable')\">เพิ่มใหม่</span> |\r\n");
        out.write("\t                              <span class=\"spanLink\" onClick=\"duget_check_value('duTable')\">ลบรายการที่เลือก</span>\r\n");
        out.write("\t                         </td>\r\n");
        out.write("\t                    </tr>\r\n");
        out.write("               \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f103.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f103);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f103);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f104(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f104 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f104.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f104.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fif_005f104.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f104 = _jspx_th_c_005fif_005f104.doStartTag();
    if (_jspx_eval_c_005fif_005f104 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        \t<input id=\"aaeChkAll\" name=\"chkAll\" type=\"checkbox\" onClick=\"allCheck(this,document.dataform.ducheck_list);\"/>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f104.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f104);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f104);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f13 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fforEach_005f13.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aaelist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f13.setVar("aae");
    _jspx_th_c_005fforEach_005f13.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f13 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f13 = _jspx_th_c_005fforEach_005f13.doStartTag();
      if (_jspx_eval_c_005fforEach_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.isexhibitco}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.duty_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.isdomestic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.sizes_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata13[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata14[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata15[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata16[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.exhibit_list}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata17[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.exhibit_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata18[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.car_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata19[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.remarks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata20[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata21[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata22[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata23[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata24[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata25[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.case_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata26[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.co_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata27[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata28[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t\t ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f13.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f13[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f13.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f13.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f13);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f14 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fforEach_005f14.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alilist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f14.setVar("ali");
    _jspx_th_c_005fforEach_005f14.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f14 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f14 = _jspx_th_c_005fforEach_005f14.doStartTag();
      if (_jspx_eval_c_005fforEach_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("           <script>\r\n");
          out.write("\t\t\tcdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.entrepreneur}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.establishment_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.license_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\tcdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.licensetype_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.book_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.license_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.iswithdraw}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t</script>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f14.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f14[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f14.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f14.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f14);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f105(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f99, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f105 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f105.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f105.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f99);
    _jspx_th_c_005fif_005f105.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.guilty == 'Y' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f105 = _jspx_th_c_005fif_005f105.doStartTag();
    if (_jspx_eval_c_005fif_005f105 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f105.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f105);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f105);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f107, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f15 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f107);
    _jspx_th_c_005fforEach_005f15.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aallist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f15.setVar("aal");
    _jspx_th_c_005fforEach_005f15.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f15 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f15 = _jspx_th_c_005fforEach_005f15.doStartTag();
      if (_jspx_eval_c_005fforEach_005f15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.culprit_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_id_card}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.other_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.address_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata13[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata14[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata15[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.race_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata16[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.nationality_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata17[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.career}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata18[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.birth_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata19[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.father_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata20[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.mother_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata21[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata22[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata23[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.province_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata24[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.district_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata25[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.subdistrict_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata26[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.race_id_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata27[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.nationality_id_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tlawsdata28[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.testimony}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tlawsdata29[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_passport}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tlawsdata30[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.middle_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tlawsdata31[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.company_title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tlawsdata32[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.company_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tlawsdata33[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.excise_reg_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tlawsdata34[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.corporation_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tlawsdata35[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.age}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\tlawsdata36[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";   \r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f15.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f15[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f15.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f15.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f15);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f107, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f16 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f107);
    _jspx_th_c_005fforEach_005f16.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dslist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f16.setVar("ds");
    _jspx_th_c_005fforEach_005f16.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f16 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f16 = _jspx_th_c_005fforEach_005f16.doStartTag();
      if (_jspx_eval_c_005fforEach_005f16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t+\"<option value=\\\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\\');
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f108(_jspx_th_c_005fforEach_005f16, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f16))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds.status_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\"\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f16.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f16[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f16.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f16.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f16);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f108(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f16, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f108 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f108.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f108.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f16);
    _jspx_th_c_005fif_005f108.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds.id == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f108 = _jspx_th_c_005fif_005f108.doStartTag();
    if (_jspx_eval_c_005fif_005f108 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f108.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f108);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f108);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f107, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f17 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f17.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f107);
    _jspx_th_c_005fforEach_005f17.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aatlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f17.setVar("aat");
    _jspx_th_c_005fforEach_005f17.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f17 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f17 = _jspx_th_c_005fforEach_005f17.doStartTag();
      if (_jspx_eval_c_005fforEach_005f17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t //aatdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.cc_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.inspector_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.duty_status_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f17.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f17[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f17.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f17.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f17);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f107, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f18 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f18.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f107);
    _jspx_th_c_005fforEach_005f18.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aaelist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f18.setVar("aae");
    _jspx_th_c_005fforEach_005f18.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f18 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f18 = _jspx_th_c_005fforEach_005f18.doStartTag();
      if (_jspx_eval_c_005fforEach_005f18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.isexhibitco}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.duty_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.isdomestic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.sizes_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata13[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata14[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata15[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata16[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.exhibit_list}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata17[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.exhibit_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata18[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.car_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata19[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.remarks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata20[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata21[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata22[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata23[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata24[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata25[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.case_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata26[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.co_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata27[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t dudata28[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f18.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f18[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f18.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f18.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f18);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f107, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f19 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f19.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f107);
    _jspx_th_c_005fforEach_005f19.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alilist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f19.setVar("ali");
    _jspx_th_c_005fforEach_005f19.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f19 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f19 = _jspx_th_c_005fforEach_005f19.doStartTag();
      if (_jspx_eval_c_005fforEach_005f19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("           <script>\r\n");
          out.write("\t\t\tcdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.entrepreneur}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.establishment_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.license_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\tcdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.licensetype_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.book_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.license_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.iswithdraw}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t</script>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f19.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f19[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f19.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f19.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f19);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f109(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f107, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f109 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f109.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f109.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f107);
    _jspx_th_c_005fif_005f109.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.arrest_report_date != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f109 = _jspx_th_c_005fif_005f109.doStartTag();
    if (_jspx_eval_c_005fif_005f109 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                              \t<input name=\"arrest_report_date\" id=\"arrest_report_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.arrest_report_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("                                              ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f109.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f109);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f109);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f111(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f107, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f111 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f111.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f111.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f107);
    _jspx_th_c_005fif_005f111.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.guilty != 'N' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f111 = _jspx_th_c_005fif_005f111.doStartTag();
    if (_jspx_eval_c_005fif_005f111 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f111.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f111);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f111);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f112(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f106, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f112 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f112.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f112.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f106);
    _jspx_th_c_005fif_005f112.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEdit == 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f112 = _jspx_th_c_005fif_005f112.doStartTag();
    if (_jspx_eval_c_005fif_005f112 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                  \t\t");
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\" src=\"js/datetimepicker_css.js\" ></script>\r\n");
        out.write("\r\n");
        out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
        out.write("  \tfunction toggleHidden(mID, btnID){\r\n");
        out.write("\r\n");
        out.write("\t\tdocument.getElementById('app2_39').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('lawbreaker_list').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('arrestTeam').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('exhibitList').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('licenseList').style.display='none';\r\n");
        out.write("\t\tdocument.getElementById('2_6Tab').style.display='none';\r\n");
        out.write("\r\n");
        out.write("\t\tdocument.getElementById('btn2_39').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btnLawbreakerList').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btnArrestTeam').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btnExhibitList').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btnLicenseList').style.background='#D4D0C8';\r\n");
        out.write("\t\tdocument.getElementById('btn2_6').style.background='#D4D0C8';\r\n");
        out.write("\r\n");
        out.write("\t\tmnu = document.getElementById(mID);\r\n");
        out.write("\t\tbtn = document.getElementById(btnID);\r\n");
        out.write("\t\tif (mnu.style.display == 'none'){\r\n");
        out.write("\t\t\tmnu.style.display ='';\r\n");
        out.write("\t\t\tbtn.style.background='#FFCC33';\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\tmnu.style.display ='none';\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}\r\n");
        out.write("</script>\r\n");
        out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
        out.write("  <tr>\r\n");
        out.write("    <td width=\"1%\">&nbsp;</td>\r\n");
        out.write("     <td style=\"cursor:hand;\" width=\"98%\" >\r\n");
        out.write("        <input name=\"btnLawbreakerList\" id=\"btnLawbreakerList\" type=\"button\" class=\"button\" value=\"รายชื่อผู้กระทำผิดกฎหมาย\" onClick='toggleHidden(\"lawbreaker_list\",\"btnLawbreakerList\");' style=\"background:#FFCC33\">&nbsp;&nbsp;\r\n");
        out.write("        <input name=\"btn2_39\" id=\"btn2_39\" type=\"button\" class=\"button\" value=\"บันทึกการจับ\" onClick='toggleHidden(\"app2_39\", \"btn2_39\");' >&nbsp;&nbsp;\r\n");
        out.write("        <input name=\"btnArrestTeam\" id=\"btnArrestTeam\" type=\"button\" class=\"button\" value=\"คณะผู้จับกุม\" onClick='toggleHidden(\"arrestTeam\",\"btnArrestTeam\");'>&nbsp;&nbsp;\r\n");
        out.write("        <input name=\"btnExhibitList\" id=\"btnExhibitList\" type=\"button\" class=\"button\" value=\"บัญชีสิ่งของ\" onClick='toggleHidden(\"exhibitList\",\"btnExhibitList\");'>&nbsp;&nbsp;\r\n");
        out.write("        <input name=\"btnLicenseList\" id=\"btnLicenseList\" type=\"button\" class=\"button\" value=\"ข้อมูลใบอนุญาต/ข้อมูลสืบสวน\" onClick='toggleHidden(\"licenseList\",\"btnLicenseList\");'>&nbsp;&nbsp;\r\n");
        out.write("\t\t<input name=\"btn2_6\" id=\"btn2_6\" type=\"button\" class=\"button\" value=\"รายงานบันทึกการจับ 2/6ก\" onClick='toggleHidden(\"2_6Tab\",\"btn2_6\");'>\r\n");
        out.write("     </td>\r\n");
        out.write("     <td width=\"1%\" >&nbsp;\r\n");
        out.write("\r\n");
        out.write("     </td>\r\n");
        out.write("  </tr>\r\n");
        out.write("  <tr >\r\n");
        out.write("     <td>&nbsp;</td>\r\n");
        out.write("     <td>\r\n");
        out.write("      <!-- ==============================================ผู้กระทำผิด======================================================== -->\r\n");
        out.write("<script>\r\n");
        out.write("var lawsmaxrow=1; // jsp  Count  config\r\n");
        out.write("var lawsstartrow=2;\r\n");
        out.write("var lawseditrow = -1;\r\n");
        out.write("var lawseditna = 0;\r\n");
        out.write("\r\n");
        out.write("function lawsinsRow(myTable,lawsmaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36)\r\n");
        out.write("{\r\n");
        out.write("\tvar row;\r\n");
        out.write("\tvar x=document.getElementById(myTable).insertRow(lawsmaxrow);\r\n");
        out.write("\tlawsmaxrow++;\r\n");
        out.write("\trow = lawsmaxrow - 1;\r\n");
        out.write("\tvar y1=x.insertCell(0);\r\n");
        out.write("\tvar y2=x.insertCell(1);\r\n");
        out.write("\tvar y3=x.insertCell(2);\r\n");
        out.write("\tvar y4=x.insertCell(3);\r\n");
        out.write("\tvar y5=x.insertCell(4);\r\n");
        out.write("\tvar y6=x.insertCell(5);\r\n");
        out.write("\tvar y7=x.insertCell(6);\r\n");
        out.write("\tvar y8=x.insertCell(7);\r\n");
        out.write("\tvar y9=x.insertCell(8);\r\n");
        out.write("\tvar y10=x.insertCell(9);\r\n");
        out.write("\tvar y11=x.insertCell(10);\r\n");
        out.write("\tvar y12=x.insertCell(11);\r\n");
        out.write("\tvar y13=x.insertCell(12);\r\n");
        out.write("\tvar y14=x.insertCell(13);\r\n");
        out.write("\t\r\n");
        out.write("\tvar exp = new Date();\r\n");
        out.write("\tvar s = exp.getTime();\r\n");
        out.write("\t\r\n");
        out.write("\ty1.innerHTML=\"<input readonly class='textboxlist' size='1' name='lawstc_id' value='\" + row + \"' />\";\r\n");
        out.write("\ty2.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"lawsref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("\ty3.innerHTML=data22+data5+\" \"+data6;\r\n");
        out.write("\tif (data1=\"1\"){\r\n");
        out.write("\t\ty4.innerHTML=\"คนไทย\";\r\n");
        out.write("\t}else if(data1=\"2\"){\r\n");
        out.write("\t\ty4.innerHTML=\"ชาวต่างชาติ\";\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\ty4.innerHTML=\"ผู้ประกอบการ\";\r\n");
        out.write("\t}\r\n");
        out.write("\t\r\n");
        out.write("\ty5.innerHTML=data17;\r\n");
        out.write("\ty6.innerHTML=data18;\r\n");
        out.write("\ty7.innerHTML=data2;\r\n");
        out.write("\ty8.innerHTML=data29;\r\n");
        out.write("\ty9.innerHTML=data26;\r\n");
        out.write("\ty10.innerHTML=data27;\r\n");
        out.write("\ty11.innerHTML=data8+\" หมู่ \"+data9+\" ซอย \"+data10+\" ถ. \"+data11+\" ต. \"+data25+\" อ. \"+data24+\" จ. \"+data23;\r\n");
        out.write("\ty12.innerHTML=data19;\r\n");
        out.write("\ty13.innerHTML=data20;\r\n");
        out.write("\ty14.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"aal_culprit_type\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_lawbreaker_id_card\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_sex\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_title_code\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_first_name\\\" value=\\\"\"+data5+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_last_name\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_other_name\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_address_no\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_moo\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_soi\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_road\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_province\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_district\\\" value=\\\"\"+data13+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_subdistrict\\\" value=\\\"\"+data14+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_race_id\\\" value=\\\"\"+data15+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_nationality_id\\\" value=\\\"\"+data16+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_career\\\" value=\\\"\"+data17+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_birth_date\\\" value= \\\"\"+data18+ \"\\\" >\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_father_name\\\" value=\\\"\"+data19+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_mother_name\\\" value=\\\"\"+data20+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_id\\\" value=\\\"\"+data21+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_title_name\\\" value=\\\"\"+data22+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_province_name\\\" value=\\\"\"+data23+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_district_name\\\" value=\\\"\"+data24+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_subdistrict_name\\\" value=\\\"\"+data25+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_race_id_name\\\" value=\\\"\"+data26+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_nationality_id_name\\\" value=\\\"\"+data27+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_testimony\\\" value=\\\"\"+data28+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_lawbreaker_passport\\\" value=\\\"\"+data29+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_middle_name\\\" value=\\\"\"+data30+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_company_title_code\\\" value=\\\"\"+data31+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_company_name\\\" value=\\\"\"+data32+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_excise_reg_no\\\" value=\\\"\"+data33+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_corporation_code\\\" value=\\\"\"+data34+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_age\\\" value=\\\"\"+data35+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aal_lawbreaker_no\\\" value=\\\"\"+data36+\"\\\">\"\r\n");
        out.write("\t+\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.testimony}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\";\r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function lawsforedit(row)\r\n");
        out.write("{\r\n");
        out.write("if (document.dataform.lawsref_id.length)\r\n");
        out.write("{\r\n");
        out.write("  for (var i=0; i < document.dataform.lawsref_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tif (document.dataform.lawsref_id[i].value== row)\r\n");
        out.write("\t\t\t{//alert(i+1);\r\n");
        out.write("\t\t\tlawseditrow = i+1;}\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write(" else\r\n");
        out.write(" {//alert(\"1\");\r\n");
        out.write(" lawseditrow = 0;}\r\n");
        out.write("   }\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function lawsdelRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (lawsmaxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,lawsmaxrow-1);\r\n");
        out.write("lawsmaxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function lawsalternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function lawsrerun_id()\r\n");
        out.write("{\r\n");
        out.write("\tif (!document.dataform.lawstc_id.length)\r\n");
        out.write("\t{\r\n");
        out.write("\t\tdocument.dataform.lawstc_id.value=1;\r\n");
        out.write("\t}\r\n");
        out.write("\t\r\n");
        out.write("\tfor (var i=0; i < document.dataform.lawstc_id.length; i++)\r\n");
        out.write("    {\r\n");
        out.write("\t\tdocument.dataform.lawstc_id[i].value=i+1;\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function lawsdelRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("lawsmaxrow--\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function lawsopenmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("var data = window.showModalDialog('process?action=arrest_lawbreaker&cmd=add' , self , 'Width=500px,Height=500px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\t\tlawsinsRow(myTable,lawsmaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[35],data[36]);\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("function lawseditmodal(myTable,p1,p2)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("\tlawseditna= 1;\r\n");
        out.write("var data = window.showModalDialog('process?action=arrest_lawbreaker&cmd=add&p1='+p1+'&p2='+p2 , self , 'Width=500px,Height=500px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\tlawsdelRown(myTable,lawseditrow)\r\n");
        out.write("\r\n");
        out.write("\tlawsinsRow(myTable,lawsmaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[35],data[36]);\r\n");
        out.write("\r\n");
        out.write("\t}\r\n");
        out.write("\tlawseditna = 0;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function lawsCheck(chk)\r\n");
        out.write("{\r\n");
        out.write("if(document.dataform.lawsCheck_ctr.checked==true){\r\n");
        out.write("for (i = 0; i < lawschk.length; i++)\r\n");
        out.write("lawschk[i].checked = true ;\r\n");
        out.write("}else{\r\n");
        out.write("\r\n");
        out.write("for (i = 0; i < lawschk.length; i++)\r\n");
        out.write("lawschk[i].checked = false ;\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function lawsget_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("var c_value = \"\";\r\n");
        out.write("var x=\"\";\r\n");
        out.write("if (!document.dataform.lawscheck_list.length)\r\n");
        out.write("{\r\n");
        out.write("\tdocument.getElementById(myTable).deleteRow(1);\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.lawscheck_list.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\r\n");
        out.write("   if (document.dataform.lawscheck_list[i].checked)\r\n");
        out.write("      {\r\n");
        out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
        out.write("\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
        out.write("\t\ti--;\r\n");
        out.write("\t\tlawsmaxrow--;\r\n");
        out.write("      }\r\n");
        out.write("   }\r\n");
        out.write("   //alert(lawsmaxrow-1);\r\n");
        out.write("   rerun_id();\r\n");
        out.write("}\r\n");
        out.write("   function lawsrender(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=lawsdata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        lawsinsRow(myTable,i,lawsdata1[i],lawsdata2[i],lawsdata3[i],lawsdata4[i],lawsdata5[i],lawsdata6[i],lawsdata7[i],lawsdata8[i],lawsdata9[i],lawsdata10[i],lawsdata11[i],lawsdata12[i],lawsdata13[i],lawsdata14[i],lawsdata15[i],lawsdata16[i],lawsdata17[i],lawsdata18[i],lawsdata19[i],lawsdata20[i],lawsdata21[i],lawsdata22[i],lawsdata23[i],lawsdata24[i] ,lawsdata25[i],lawsdata26[i],lawsdata27[i],lawsdata28[i],lawsdata29[i],lawsdata30[i],lawsdata31[i],lawsdata32[i],lawsdata33[i],lawsdata34[i],lawsdata35[i],lawsdata36[i]);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var lawsdata1 =new Array();\r\n");
        out.write("var lawsdata2 =new Array();\r\n");
        out.write("var lawsdata3 =new Array();\r\n");
        out.write("var lawsdata4 =new Array();\r\n");
        out.write("var lawsdata5 =new Array();\r\n");
        out.write("var lawsdata6 =new Array();\r\n");
        out.write("var lawsdata7 =new Array();\r\n");
        out.write("var lawsdata8 =new Array();\r\n");
        out.write("var lawsdata9 =new Array();\r\n");
        out.write("var lawsdata10 =new Array();\r\n");
        out.write("var lawsdata11 =new Array();\r\n");
        out.write("var lawsdata12 =new Array();\r\n");
        out.write("var lawsdata13 =new Array();\r\n");
        out.write("var lawsdata14 =new Array();\r\n");
        out.write("var lawsdata15 =new Array();\r\n");
        out.write("var lawsdata16 =new Array();\r\n");
        out.write("var lawsdata17 =new Array();\r\n");
        out.write("var lawsdata18 =new Array();\r\n");
        out.write("var lawsdata19 =new Array();\r\n");
        out.write("var lawsdata20 =new Array();\r\n");
        out.write("var lawsdata21 =new Array();\r\n");
        out.write("var lawsdata22 =new Array();\r\n");
        out.write("var lawsdata23 =new Array();\r\n");
        out.write("var lawsdata24 =new Array();\r\n");
        out.write("var lawsdata25 =new Array();\r\n");
        out.write("var lawsdata26 =new Array();\r\n");
        out.write("var lawsdata27 =new Array();\r\n");
        out.write("var lawsdata28 =new Array();\r\n");
        out.write("var lawsdata29 =new Array();\r\n");
        out.write("var lawsdata30 =new Array();//middle name\r\n");
        out.write("var lawsdata31 =new Array();//title company code\r\n");
        out.write("var lawsdata32 =new Array();//company name\r\n");
        out.write("var lawsdata33 =new Array();//aal.excise_reg_no\r\n");
        out.write("var lawsdata34 =new Array();//aal.corporation_code\r\n");
        out.write("var lawsdata35 = new Array();//text age\r\n");
        out.write("var lawsdata36 = new Array(); //lawbreaker_no\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<!-- ==============================================ปิดผู้กระทำผิด======================================================== -->\r\n");
        out.write("\r\n");
        out.write(" <!-- รายชื่อผู้กระทำความผิด-->\r\n");
        out.write("\r\n");
        out.write("          <div class=\"innerPosition\" id=\"lawbreaker_list\" >\r\n");
        out.write("               <table  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t <td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t\t</tr>\r\n");
        out.write("\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("                                <table id=\"lawsTable\" class=\"tableList\" width=\"1500\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
        out.write("                                   <tr>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn aligncenter\">ลำดับที่</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn aligncenter\"></td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ชื่อผู้กระทำผิด</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ประเภทผู้กระทำความผิด</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">อาชีพ</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">อายุ</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">เลขที่บัตรปชช</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">เลขที่หนังสือเดินทาง</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">เชื้อชาติ</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">สัญชาติ</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ที่อยู่</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ชื่อบิดา</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">ชื่อมารดา</td>\r\n");
        out.write("                                     <td class=\"TblHeaderColumn\">คำให้การของผู้ต้องหา</td>\r\n");
        out.write("                                   </tr>\r\n");
        out.write("                                   ");
        if (_jspx_meth_c_005fforEach_005f20(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </table>\r\n");
        out.write("\r\n");
        out.write("                         </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("          <!-- END รายชื่อผู้กระทำความผิด-->\r\n");
        out.write("\r\n");
        out.write("          <!-- mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmบันทึกจับกุมmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("         <div class=\"innerPosition\"  id=\"app2_39\" style=\"width:750px;display:none\">\r\n");
        out.write("                 <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
        out.write("\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td colspan=\"2\" align=\"center\">\r\n");
        out.write("                              <table width=\"100%\">\r\n");
        out.write("                                 <tr valign=\"top\">\r\n");
        out.write("                                     <td width=\"155\"  align=\"right\">พฤติการณ์ในการจับ :</td>\r\n");
        out.write("                                     <td align=\"left\"><textarea onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" name=\"behaviour\" id=\"behaviour\" cols=\"45\" rows=\"3\" class=\"textareabig\"  >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.behaviour}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea></td>\r\n");
        out.write("                                     <td align=\"left\">(ส.ส.2/39)</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <tr valign=\"top\">\r\n");
        out.write("                                     <td  align=\"right\">คำให้การของผู้ต้องหา :</td>\r\n");
        out.write("                                     <td align=\"left\"><textarea onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" name=\"testimony\" id=\"testimony\" cols=\"45\" rows=\"3\" class=\"textareabig\"  >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.testimony}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea></td>\r\n");
        out.write("                                     <td align=\"left\">&nbsp;</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <tr valign=\"top\">\r\n");
        out.write("                                     <td   align=\"right\">การแจ้งสิทธิ :</td>\r\n");
        out.write("                                     <td align=\"left\"><textarea onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" name=\"administration\" id=\"administration\" cols=\"45\" rows=\"3\" class=\"textareabig\"  >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.administration}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea></td>\r\n");
        out.write("                                     <td align=\"left\">&nbsp;</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <tr valign=\"top\" style=\"display:none\">\r\n");
        out.write("                                     <td   align=\"right\">เวลาที่ตรวจค้นเสร็จ:</td>\r\n");
        out.write("                                     <td align=\"left\" ><input name=\"finished_time\" type=\"text\" class=\"textView\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"5\" maxlength=\"5\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.finished_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"   ></td>\r\n");
        out.write("                                     <td align=\"left\">&nbsp;</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                              </table>\r\n");
        out.write("                         </td>\r\n");
        out.write("                     </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("          <!--mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm END บันทึกจับกุมmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->\r\n");
        out.write("\r\n");
        out.write("          <!--kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk คณะที่เข้าตรวจค้นkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk -->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("          <script type=\"text/javascript\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var aatmaxrow=1; // jsp  Count  config\r\n");
        out.write("var aatstartrow=2;\r\n");
        out.write("var aateditrow = -1;\r\n");
        out.write("var aateditna = 0;\r\n");
        out.write("\r\n");
        out.write("function aatinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12)\r\n");
        out.write("{\r\n");
        out.write("\tvar xdata = \"<select style='width:100' name=\\\"aat_duty_status_id\\\" disabled >\"\r\n");
        out.write("\t");
        if (_jspx_meth_c_005fforEach_005f21(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t+\"</select >\"\r\n");
        out.write("\r\n");
        out.write(";\r\n");
        out.write("\r\n");
        out.write("var row;\r\n");
        out.write("var x=document.getElementById(myTable).insertRow(aatmaxrow);\r\n");
        out.write("aatmaxrow++;\r\n");
        out.write("row = aatmaxrow - 1;\r\n");
        out.write("var y1=x.insertCell(0);\r\n");
        out.write("var y2=x.insertCell(1);\r\n");
        out.write("var y3=x.insertCell(2);\r\n");
        out.write("var y4=x.insertCell(3);\r\n");
        out.write("var y5=x.insertCell(4);\r\n");
        out.write("var y6=x.insertCell(5);\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var exp = new Date();\r\n");
        out.write("var s = exp.getTime();\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("y1.innerHTML=\"<input readonly class='textboxlist' size='1' name='aattc_id' value='\" + row + \"' />\";\r\n");
        out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"aatcheckbox\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"aatref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("//y3.innerHTML= data3;\r\n");
        out.write("y3.innerHTML= data12+data10+\" \"+data11;\r\n");
        out.write("y4.innerHTML= data4;\r\n");
        out.write("y5.innerHTML= data9;\r\n");
        out.write("y6.innerHTML= xdata+\"<input type=\\\"hidden\\\" name=\\\"aat_id\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_no\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_inspector_code\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_position\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
        out.write("//+\"<input type=\\\"hidden\\\" name=\\\"aat_duty_status_id\\\" value=\\\"\"+data5+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_idcardno\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_poscode\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_staff_offcode\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_offname\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_first_name\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_last_name\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
        out.write("+\"<input type=\\\"hidden\\\" name=\\\"aat_title_name\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
        out.write(";\r\n");
        out.write("if(row == 1){ \r\n");
        out.write("document.dataform.aat_duty_status_id.value = data5;\r\n");
        out.write("}else if(row > 1 ){ \r\n");
        out.write("\tdocument.dataform.aat_duty_status_id[row-1].value = data5; }\r\n");
        out.write("\r\n");
        out.write("}\r\n");
        out.write("function aatdelRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (aatmaxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,aatmaxrow-1);\r\n");
        out.write("aatmaxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function aatalternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function aatrerun_id()\r\n");
        out.write("{\r\n");
        out.write("if (!document.dataform.aattc_id.length)\r\n");
        out.write("{\r\n");
        out.write("document.dataform.aattc_id.value=1;\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.aattc_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tdocument.dataform.aattc_id[i].value=i+1;\r\n");
        out.write("   }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function aatdelRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("aatmaxrow--\r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function aatopenmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("var  dup=0;\r\n");
        out.write("var data = window.showModalDialog('process?action=Divide_staff_poplist', self , 'dialogWidth=700px,Height=400px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\t{\r\n");
        out.write("\t\tfor (var i=0; i < data.length; i++)\r\n");
        out.write("\t\t{\r\n");
        out.write("\t\t\tdup=0;\r\n");
        out.write("\t\t\tif (aatmaxrow>1)\r\n");
        out.write("\t\t\t{\r\n");
        out.write("\t\t\t\tfor (var j=0; j < document.dataform.aat_staff_idcardno.length; j++)\r\n");
        out.write("\t\t\t\t{\r\n");
        out.write("\t\t\t\t\t//alert (document.dataform.aat_staff_idcardno[j].value+ \"-\" +data[i][5]);\r\n");
        out.write("\t\t\t\t\tif (document.dataform.aat_staff_idcardno[j].value==data[i][5])\r\n");
        out.write("\t\t\t\t\t\t{dup=1;}\r\n");
        out.write("\t\t\t\t}\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t\tif (dup==0)\r\n");
        out.write("\t    \t{\r\n");
        out.write("\t    \taatinsRow(myTable,aatmaxrow,\"\",data[i][1],data[i][2],data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8],data[i][9],data[i][10],data[i][11]);\r\n");
        out.write("\r\n");
        out.write("\t    \t}\r\n");
        out.write("\t    }\r\n");
        out.write("\t}\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("\r\n");
        out.write("function aatget_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("var c_value = \"\";\r\n");
        out.write("var x=\"\";\r\n");
        out.write("\r\n");
        out.write("for (var i=1; i < document.dataform.aatcheckbox.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\r\n");
        out.write("   if (document.dataform.aatcheckbox[i].checked)\r\n");
        out.write("      {\r\n");
        out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
        out.write("\t\tdocument.getElementById(myTable).deleteRow(i);\r\n");
        out.write("\t\ti--;\r\n");
        out.write("\t\taatmaxrow--;\r\n");
        out.write("      }\r\n");
        out.write("   }\r\n");
        out.write("   //alert(aatmaxrow-1);\r\n");
        out.write("   aatrerun_id();\r\n");
        out.write("}\r\n");
        out.write("function aatrender(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=aatdata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        aatinsRow(myTable,i,aatdata1[i],aatdata2[i],aatdata3[i],aatdata4[i],aatdata5[i],aatdata6[i],aatdata7[i],aatdata8[i],aatdata9[i],aatdata10[i],aatdata11[i],aatdata12[i]);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("var aatdata1 =new Array();\r\n");
        out.write("var aatdata2 =new Array();\r\n");
        out.write("var aatdata3 =new Array();\r\n");
        out.write("var aatdata4 =new Array();\r\n");
        out.write("var aatdata5 =new Array();\r\n");
        out.write("var aatdata6 =new Array();\r\n");
        out.write("var aatdata7 =new Array();\r\n");
        out.write("var aatdata8 =new Array();\r\n");
        out.write("var aatdata9 =new Array();\r\n");
        out.write("var aatdata10 =new Array();\r\n");
        out.write("var aatdata11 =new Array();\r\n");
        out.write("var aatdata12 =new Array();\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function aatCheck(chkcont,chk)\r\n");
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
        out.write("</script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("          <div class=\"innerPosition\" id=\"arrestTeam\" style=\"display:none\">\r\n");
        out.write("               <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("\r\n");
        out.write("                                   <table  id=\"aatTable\" class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\">\r\n");
        out.write("                                             <tr>\r\n");
        out.write("                                             <td  height=\"15\" class=\"TblHeaderColumn AlignCenter\">ลำดับ</td>\r\n");
        out.write("                                             <td class=\"TblHeaderColumn aligncenter\">\r\n");
        out.write("                                           </td>\r\n");
        out.write("                                             <td  class=\"TblHeaderColumn \">ชื่อ-สกุล</td>\r\n");
        out.write("                                             <td  class=\"TblHeaderColumn \">ตำแหน่ง</td>\r\n");
        out.write("                                             <td  class=\"TblHeaderColumn \">ชื่อสังกัด</td>\r\n");
        out.write("                                             <td  class=\"TblHeaderColumn \">ในฐานะ</td>\r\n");
        out.write("                                          </tr>\r\n");
        out.write("\r\n");
        out.write("                                           ");
        if (_jspx_meth_c_005fforEach_005f22(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("                                        </table>\r\n");
        out.write("\r\n");
        out.write("                              </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("          <!--kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk END คณะที่เข้าตรวจค้นkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk-->\r\n");
        out.write("\r\n");
        out.write("<!-- =========================================================สิ่งของ======================================================================================  -->\r\n");
        out.write("\r\n");
        out.write("<script>\r\n");
        out.write("var dumaxrow=1; // jsp  Count  config\r\n");
        out.write("var dustartrow=2;\r\n");
        out.write("var dueditrow = -1;\r\n");
        out.write("var dueditna = 0;\r\n");
        out.write("\r\n");
        out.write("function duinsRow(myTable,dumaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,id,text1,text2,text3,text4,text5,data26,data27,data28, isEdit, rows)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("\tvar row;\r\n");
        out.write("\tvar x;\r\n");
        out.write("\tif(isEdit==\"N\"){ //กรณีเพิ่มรายการ\r\n");
        out.write("\t\tx=document.getElementById(myTable).insertRow(dumaxrow);\r\n");
        out.write("\t\tdumaxrow++;\r\n");
        out.write("\t\trow = dumaxrow - 1;\r\n");
        out.write("\r\n");
        out.write("\t\tvar y1=x.insertCell(0);\r\n");
        out.write("\t\tvar y2=x.insertCell(1);\r\n");
        out.write("\t\tvar y3=x.insertCell(2);\r\n");
        out.write("\t\tvar y4=x.insertCell(3);\r\n");
        out.write("\t\tvar y5=x.insertCell(4);\r\n");
        out.write("\t\tvar y6=x.insertCell(5);\r\n");
        out.write("\t\tvar y7=x.insertCell(6);\r\n");
        out.write("\t\tvar y8=x.insertCell(7);\r\n");
        out.write("\t\tvar y9=x.insertCell(8);\r\n");
        out.write("\t\tvar y10=x.insertCell(9);\r\n");
        out.write("\t\tvar y11=x.insertCell(10);\r\n");
        out.write("\t\tvar y12=x.insertCell(11);\r\n");
        out.write("\t\tvar y13=x.insertCell(12);\r\n");
        out.write("\t\t\r\n");
        out.write("\t}else{  //กรณีแก้ไข\r\n");
        out.write("\t\tx=document.getElementById(myTable).rows[rows];\r\n");
        out.write("\t\trow = rows;\r\n");
        out.write("\r\n");
        out.write("\t\tvar y1=x.cells(0);\r\n");
        out.write("\t\tvar y2=x.cells(1);\r\n");
        out.write("\t\tvar y3=x.cells(2);\r\n");
        out.write("\t\tvar y4=x.cells(3);\r\n");
        out.write("\t\tvar y5=x.cells(4);\r\n");
        out.write("\t\tvar y6=x.cells(5);\r\n");
        out.write("\t\tvar y7=x.cells(6);\r\n");
        out.write("\t\tvar y8=x.cells(7);\r\n");
        out.write("\t\tvar y9=x.cells(8);\r\n");
        out.write("\t\tvar y10=x.cells(9);\r\n");
        out.write("\t\tvar y11=x.cells(10);\r\n");
        out.write("\t\tvar y12=x.cells(11);\r\n");
        out.write("\t\tvar y13=x.cells(12);\r\n");
        out.write("\t}\r\n");
        out.write("\r\n");
        out.write("\t\r\n");
        out.write("\tvar exp = new Date();\r\n");
        out.write("\tvar s = exp.getTime();\r\n");
        out.write("\t\r\n");
        out.write("\ty1.innerHTML=\"<input readonly class='textboxlist' size='1' name='dutc_id' value='\" + row + \"' />\";\r\n");
        out.write("\ty2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"ducheck_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"duref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("\ty3.innerHTML=data3;\r\n");
        out.write("\t\r\n");
        out.write("\tvar productDesc = data28;\r\n");
        out.write("\tif(data3 != \"\")\r\n");
        out.write("\t\tproductDesc += \"ชนิด \" + data3;\r\n");
        out.write("\tif(data7 != \"\" && data2 != \"\")\r\n");
        out.write("\t\tproductDesc += \"<br />ยี่ห้อ\" +data7\r\n");
        out.write("\t\r\n");
        out.write("\tif (data1==\"N\"){\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fif_005f114(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fif_005f115(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\ty4.innerHTML= productDesc;\r\n");
        out.write("\t}\r\n");
        out.write("\t\r\n");
        out.write("\tif (data8.substr(0,1)==\"O\"){\r\n");
        out.write("\t\ty5.innerHTML=\"ต่างประเทศ\";\r\n");
        out.write("\t}else if(data8.substr(0,1)==\"I\"){\r\n");
        out.write("\t\ty5.innerHTML=\"ในประเทศ\";\r\n");
        out.write("\t}else\r\n");
        out.write("\t\ty5.innerHTML=\"ไม่ระบุ\";\r\n");
        out.write("\t\r\n");
        out.write("\tif (data15.substr(0,1)==\"1\"){\r\n");
        out.write("\t\ty6.innerHTML=\"ยึด\";\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\ty6.innerHTML=\"คืน\";\r\n");
        out.write("\t}\r\n");
        out.write("\r\n");
        out.write("\tif(text2 == \"โปรดเลือก\")\r\n");
        out.write("\t\ttext2 = \"\";\r\n");
        out.write("\tif(text3 == \"โปรดเลือก\")\r\n");
        out.write("\t\ttext3 = \"\";\r\n");
        out.write("\tif(text4 == \"โปรดเลือก\")\r\n");
        out.write("\t\ttext4 = \"\";\r\n");
        out.write("\t\r\n");
        out.write("\ty7.innerHTML=text1+\" \"+text2;\r\n");
        out.write("\ty8.innerHTML=data11+\" \"+text3;\r\n");
        out.write("\ty9.innerHTML=data13+\" \"+text4;\r\n");
        out.write("\tif (data1==\"N\")\r\n");
        out.write("\t{y10.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"isdomestichk\\\" disabled=\\\"true\\\" value=\\\"\\\">\";}\r\n");
        out.write("\telse\r\n");
        out.write("\t{y10.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"isdomestichk\\\" disabled=\\\"true\\\" CHECKED value=\\\"\\\"><BR/>\"+text5;}\r\n");
        out.write("\t\r\n");
        out.write("\ty11.innerHTML=data17;\r\n");
        out.write("\ty12.innerHTML=data18;\r\n");
        out.write("\ty13.innerHTML=\"<input type=\\\"hidden\\\" name=\\\"aae_isexhibitco\\\" value=\\\"\"+data1+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_duty_code\\\" value=\\\"\"+data2+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_duty_name\\\" value=\\\"\"+data3+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_product_code\\\" value=\\\"\"+data4+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_product_name\\\" value=\\\"\"+data5+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_brand_code\\\" value=\\\"\"+data6+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_brand_name\\\" value=\\\"\"+data7+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_isdomestic\\\" value=\\\"\"+data8+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_code\\\" value=\\\"\"+data9+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_unit_code\\\" value=\\\"\"+data10+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty\\\" value=\\\"\"+data11+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty_unit_code\\\" value=\\\"\"+data12+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight\\\" value=\\\"\"+data13+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight_unit_code\\\" value=\\\"\"+data14+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_status\\\" value=\\\"\"+data15+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_exhibit_list\\\" value=\\\"\"+data16+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_exhibit_desc\\\" value=\\\"\"+data17+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_car_no\\\" value=\\\"\"+data18+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_remarks\\\" value=\\\"\"+data19+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_id\\\" value=\\\"\"+id+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_code_text\\\" value=\\\"\"+text1+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_sizes_unit_code_text\\\" value=\\\"\"+text2+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_qty_unit_code_text\\\" value=\\\"\"+text3+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_netweight_unit_code_text\\\" value=\\\"\"+text4+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_case_id\\\" value=\\\"\"+text5+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_co_id\\\" value=\\\"\"+data26+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_group_id\\\" value=\\\"\"+data27+\"\\\">\"\r\n");
        out.write("\t+\"<input type=\\\"hidden\\\" name=\\\"aae_group_name\\\" value=\\\"\"+data28+\"\\\">\"\r\n");
        out.write("\t+data19;\r\n");
        out.write("}\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function duforedit(row)\r\n");
        out.write("{\r\n");
        out.write("if (document.dataform.duref_id.length)\r\n");
        out.write("{\r\n");
        out.write("  for (var i=0; i < document.dataform.duref_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tif (document.dataform.duref_id[i].value== row)\r\n");
        out.write("\t\t\t{\r\n");
        out.write("\t\t\tdueditrow = i+1;}\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write(" else\r\n");
        out.write(" {\r\n");
        out.write(" dueditrow = 1;}\r\n");
        out.write("   }\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function dudelRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (dumaxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,dumaxrow-1);\r\n");
        out.write("dumaxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function dualternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function durerun_id()\r\n");
        out.write("{\r\n");
        out.write("if (dumaxrow == 2){\r\n");
        out.write("\tdocument.dataform.dutc_id.value=1;\r\n");
        out.write("}else if(dumaxrow > 2){\r\n");
        out.write("\tfor (var i=0; i < document.dataform.dutc_id.length; i++)\r\n");
        out.write("\t   {\r\n");
        out.write("\t\t\tdocument.dataform.dutc_id[i].value=i+1;\r\n");
        out.write("\t   }\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function dudelRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("dumaxrow--\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("function duopenmodal(myTable){\r\n");
        out.write("\r\n");
        out.write("\tif(document.dataform.legislation_id.value != \"\"){\r\n");
        out.write("\t\twriteTranLog('เพิ่มบัญชีสิ่งของ');\r\n");
        out.write("\t\tvar group_id = document.dataform.product_group_id.value;\r\n");
        out.write("\t\tvar legislation_id = dwr.util.getValue();\r\n");
        out.write("\t\tvar data = window.showModalDialog('process?action=Duty_table_list&cmd=list&group_id='+group_id+'&legislation_id='+document.dataform.legislation_id.value , self , 'Width=500px,Height=400px');\r\n");
        out.write("\t\tif(data != null){\r\n");
        out.write("\t\t\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],\"\",data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],\"N\", null);\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\talert(\"กรุณาเลือกพระราชบัญญัติ\");\r\n");
        out.write("\t\tdocument.dataform.legislation_id.focus();\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("function dueditmodal(myTable, row){\r\n");
        out.write("\tif(document.dataform.legislation_id.value != \"\"){\r\n");
        out.write("\t\twriteTranLog('แก้ไขรายการบัญชีสิ่งของ');\r\n");
        out.write("\t\tdueditna= 1;\r\n");
        out.write("\t\tvar group_id = document.dataform.product_group_id.value;\r\n");
        out.write("\t\tvar data = window.showModalDialog('process?action=Duty_table_list&cmd=list&group_id='+group_id +'&legislation_id='+document.dataform.legislation_id.value , self , 'Width=500px,Height=400px');\r\n");
        out.write("\t\tif(data != null){\r\n");
        out.write("\t\t\t//dudelRown(myTable,dueditrow);  ไม่มีการลบแถว\r\n");
        out.write("\t\t\tduinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],\"Y\", row);\r\n");
        out.write("\t\t}\r\n");
        out.write("\t\tdueditna = 0;\r\n");
        out.write("\t}else{\r\n");
        out.write("\t\talert(\"กรุณาเลือกพระราชบัญญัติ\");\r\n");
        out.write("\t\tdocument.dataform.legislation_id.focus();\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function duCheck(chk)\r\n");
        out.write("{\r\n");
        out.write("if(document.dataform.duCheck_ctr.checked==true){\r\n");
        out.write("for (i = 0; i < duchk.length; i++)\r\n");
        out.write("duchk[i].checked = true ;\r\n");
        out.write("}else{\r\n");
        out.write("\r\n");
        out.write("for (i = 0; i < duchk.length; i++)\r\n");
        out.write("duchk[i].checked = false ;\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function duget_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("\tvar c_value = \"\";\r\n");
        out.write("\tvar x=dumaxrow;\r\n");
        out.write("\t\r\n");
        out.write("\tif (document.dataform.ducheck_list != null){\r\n");
        out.write("\t\tif (dumaxrow == 2 && document.dataform.ducheck_list.checked)\r\n");
        out.write("\t\t{\r\n");
        out.write("\t\t\tdocument.getElementById(myTable).deleteRow(1);\r\n");
        out.write("\t\t\tdumaxrow--;\r\n");
        out.write("\t\t\twriteTranLog('ลบรายการบัญชีสิ่งของ');\r\n");
        out.write("\t\t}else{\r\n");
        out.write("\t\t\tfor (var i=0; i < document.dataform.ducheck_list.length; i++){\r\n");
        out.write("\t\t\t\tif (document.dataform.ducheck_list[i].checked){\r\n");
        out.write("\t\t\t\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
        out.write("\t\t\t\t\ti--;\r\n");
        out.write("\t\t\t\t\tdumaxrow--;\r\n");
        out.write("\t\t\t      }\r\n");
        out.write("\t\t\t   }\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t\t\tif(x!=dumaxrow){\r\n");
        out.write("\t\t\t\t    writeTranLog('ลบรายการบัญชีสิ่งของ');\r\n");
        out.write("\t\t\t\t    durender();\r\n");
        out.write("\t\t\t    }\r\n");
        out.write("\t\t}\r\n");
        out.write("\t}\r\n");
        out.write("\tdocument.getElementById(\"aaeChkAll\").checked = false;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function durender(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=dudata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        duinsRow(myTable,i,dudata1[i],dudata2[i],dudata3[i],dudata4[i],dudata5[i],dudata6[i],dudata7[i],dudata8[i],dudata9[i],dudata10[i],dudata11[i],dudata12[i],dudata13[i],dudata14[i],dudata15[i],dudata16[i],dudata17[i],dudata18[i],dudata19[i],dudata20[i],dudata21[i],dudata22[i],dudata23[i],dudata24[i] ,dudata25[i],dudata26[i],dudata27[i],dudata28[i],\"N\",null);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("<script>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var dudata1 =new Array();\r\n");
        out.write("var dudata2 =new Array();\r\n");
        out.write("var dudata3 =new Array();\r\n");
        out.write("var dudata4 =new Array();\r\n");
        out.write("var dudata5 =new Array();\r\n");
        out.write("var dudata6 =new Array();\r\n");
        out.write("var dudata7 =new Array();\r\n");
        out.write("var dudata8 =new Array();\r\n");
        out.write("var dudata9 =new Array();\r\n");
        out.write("var dudata10 =new Array();\r\n");
        out.write("var dudata11 =new Array();\r\n");
        out.write("var dudata12 =new Array();\r\n");
        out.write("var dudata13 =new Array();\r\n");
        out.write("var dudata14 =new Array();\r\n");
        out.write("var dudata15 =new Array();\r\n");
        out.write("var dudata16 =new Array();\r\n");
        out.write("var dudata17 =new Array();\r\n");
        out.write("var dudata18 =new Array();\r\n");
        out.write("var dudata19 =new Array();\r\n");
        out.write("var dudata20 =new Array();\r\n");
        out.write("var dudata21 =new Array();\r\n");
        out.write("var dudata22 =new Array();\r\n");
        out.write("var dudata23 =new Array();\r\n");
        out.write("var dudata24 =new Array();\r\n");
        out.write("var dudata25 =new Array();\r\n");
        out.write("var dudata26 =new Array();\r\n");
        out.write("var dudata27 =new Array();\r\n");
        out.write("var dudata28 =new Array();\r\n");
        out.write("\r\n");
        out.write("</script>\r\n");
        out.write("\r\n");
        out.write("<!-- ====================================================================สิ่งของ===========================================================================  -->\r\n");
        out.write("<!-- บัญชีสิ่งของ-->\r\n");
        out.write("\r\n");
        out.write("          <div class=\"innerPosition\" id=\"exhibitList\" style=\"display:none;\">\r\n");
        out.write("               <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("               \t\t");
        if (_jspx_meth_c_005fif_005f116(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("                             <table id=\"duTable\" class=\"tableList\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("                                  <tr>\r\n");
        out.write("                                       <td width=\"28\"  height=\"15\" class=\"TblHeaderColumn AlignCenter\">ลำดับ</td>\r\n");
        out.write("                                       <td width=\"20\" class=\"TblHeaderColumn AlignCenter\">\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_005fif_005f117(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                       </td>\r\n");
        out.write("                                       <td width=\"68\"  class=\"TblHeaderColumn \">ชนิดสินค้า</td>\r\n");
        out.write("                                       <td width=\"130\"  class=\"TblHeaderColumn \">ชื่อสินค้า</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">ใน / นอก</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">สถานะของกลาง</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">ขนาด</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">จำนวน</td>\r\n");
        out.write("                                       <td width=\"80\"  class=\"TblHeaderColumn \">ปริมาณสุทธิ</td>\r\n");
        out.write("                                       <td width=\"97\"  class=\"TblHeaderColumn \">ของกลางร่วม(เลขที่คดี)</td>\r\n");
        out.write("                                       <td width=\"97\"  class=\"TblHeaderColumn \">ดีกรีสุรา</td>\r\n");
        out.write("                                       <td width=\"97\"  class=\"TblHeaderColumn \">ทะเบียนรถ</td>\r\n");
        out.write("                                       <td width=\"97\"  class=\"TblHeaderColumn \">หมายเหตุ(ส่วนพิสูจน์)</td>\r\n");
        out.write("                              \t  </tr>\r\n");
        out.write("\r\n");
        out.write("\t                               ");
        if (_jspx_meth_c_005fforEach_005f23(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            </table>\r\n");
        out.write("\r\n");
        out.write("                         </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("<!-- END บัญชีสิ่งของ-->\r\n");
        out.write("\r\n");
        out.write("      <!-- ใบอนุญาต/ข้อมูลสืบสวน-->\r\n");
        out.write("          <div class=\"innerPosition\" id=\"licenseList\" style=\"display:none;\">\r\n");
        out.write("               <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("                   <tr class=\"bgRowGray\">\r\n");
        out.write("                      <td ><strong>รายละเอียดใบอนุญาต</strong> </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                    <tr>\r\n");
        out.write("                         <td>\r\n");
        out.write("\r\n");
        out.write("                         </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("                    <tr>\r\n");
        out.write("                     <td>\r\n");
        out.write("                        <table name=\"aliTable\" id=\"aliTable\" class=\"tableList\" width=\"1000\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n");
        out.write("                             <tr  class=\"TblHeaderColumn\">\r\n");
        out.write("                                  <td width=\"5%\" >ลำดับ</td>\r\n");
        out.write("                                  <td width=\"5%\" ></td>\r\n");
        out.write("                                  <td width=\"15%\" >สำนักงาน</td>\r\n");
        out.write("                                  <td width=\"20%\" >ชื่อผู้ประกอบการ</td>\r\n");
        out.write("                                  <td width=\"20%\" >ชื่อสถานประกอบการ</td>\r\n");
        out.write("                                  <td width=\"15%\" >ประเภทใบอนุญาต</td>\r\n");
        out.write("                                  <td width=\"10%\" >เล่มที่ใบอนุญาต</td>\r\n");
        out.write("                                  <td width=\"10%\" >เลขที่ใบอนุญาต</td>\r\n");
        out.write("                             </tr>\r\n");
        out.write("<!-- =============================================================ใบอนุญาต==================================================================================  -->\r\n");
        out.write("<script type=\"text/javascript\">\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("var maxrow=1; // jsp  Count  config\r\n");
        out.write("var startrow=2;\r\n");
        out.write("var editrow = -1;\r\n");
        out.write("var editna = 0;\r\n");
        out.write("\r\n");
        out.write("function insRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,id)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("var row;\r\n");
        out.write("var x=document.getElementById(myTable).insertRow(maxrow);\r\n");
        out.write("maxrow++;\r\n");
        out.write("row = maxrow - 1;\r\n");
        out.write("var y1=x.insertCell(0);\r\n");
        out.write("var y2=x.insertCell(1);\r\n");
        out.write("var y3=x.insertCell(2);\r\n");
        out.write("var y4=x.insertCell(3);\r\n");
        out.write("var y5=x.insertCell(4);\r\n");
        out.write("var y6=x.insertCell(5);\r\n");
        out.write("var y7=x.insertCell(6);\r\n");
        out.write("var y8=x.insertCell(7);\r\n");
        out.write("\r\n");
        out.write("var exp = new Date();\r\n");
        out.write("var s = exp.getTime();\r\n");
        out.write("\r\n");
        out.write("y1.innerHTML=\"<input readonly class='textboxlist'' size='1' name='tc_id' value='\" + row + \"' />\"+\"<input type=\\\"hidden\\\" name=\\\"ali_id\\\" value=\\\"\"+id+\"\\\">\";\r\n");
        out.write("y2.innerHTML=\"<input type=\\\"checkbox\\\" name=\\\"check_list\\\" value=\\\"\\\"><input type=\\\"hidden\\\" name=\\\"ref_id\\\" value=\\\"\"+s+\"\\\" />\";\r\n");
        out.write("y3.innerHTML=data2 ;\r\n");
        out.write("y4.innerHTML=data3+\"<input type=\\\"hidden\\\" id=\\\"ali_entrepreneur\\\" name=\\\"ali_entrepreneur\\\" value=\\\"\"+data3+\"\\\">\";\r\n");
        out.write("y5.innerHTML=data4+\"<input type=\\\"hidden\\\" name=\\\"ali_establishment_name\\\" value=\\\"\"+data4+\"\\\">\";\r\n");
        out.write("y6.innerHTML=data6+\"<input type=\\\"hidden\\\" name=\\\"ali_licensetype_name\\\" value=\\\"\"+data6+\"\\\">\"+\"<input type=\\\"hidden\\\" name=\\\"ali_license_type\\\" value=\\\"\"+data5+\"\\\">\";\r\n");
        out.write("y7.innerHTML=data7+\"<input type=\\\"hidden\\\" name=\\\"ali_book_no\\\" value=\\\"\"+data7+\"\\\">\";\r\n");
        out.write("y8.innerHTML=data8+\"<input type=\\\"hidden\\\" name=\\\"ali_license_no\\\" value=\\\"\"+data8+\"\\\">\"+\"<input type=\\\"hidden\\\" name=\\\"ali_iswithdraw\\\" value=\\\"\"+data9+\"\\\">\";\r\n");
        out.write("\r\n");
        out.write("}\r\n");
        out.write("function foredit(row)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("if (document.dataform.ref_id.length)\r\n");
        out.write("{\r\n");
        out.write("  for (var i=0; i < document.dataform.ref_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tif (document.dataform.ref_id[i].value== row)\r\n");
        out.write("\t\t\t{//alert(i+1);\r\n");
        out.write("\t\t\teditrow = i+1;}\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write(" else\r\n");
        out.write(" {//alert(\"1\");\r\n");
        out.write("\r\n");
        out.write(" editrow = 0;}\r\n");
        out.write("   }\r\n");
        out.write("function delRow(myTable)\r\n");
        out.write("{\r\n");
        out.write("if (maxrow>1)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(myTable,maxrow-1);\r\n");
        out.write("maxrow--\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function alternate(id){\r\n");
        out.write(" if(document.getElementsByTagName){\r\n");
        out.write("   var table = document.getElementById(id);\r\n");
        out.write("   var rows = table.getElementsByTagName(\"tr\");\r\n");
        out.write("   for(i = 0; i < rows.length; i++){\r\n");
        out.write(" //manipulate rows\r\n");
        out.write("     if(i % 2 == 0){\r\n");
        out.write("       rows[i].className = \"even\";\r\n");
        out.write("     }else{\r\n");
        out.write("       rows[i].className = \"odd\";\r\n");
        out.write("     }\r\n");
        out.write("   }\r\n");
        out.write(" }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function rerun_id()\r\n");
        out.write("{\r\n");
        out.write("if (!document.dataform.tc_id.length)\r\n");
        out.write("{\r\n");
        out.write("document.dataform.tc_id.value=1;\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.tc_id.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\t\tdocument.dataform.tc_id[i].value=i+1;\r\n");
        out.write("   }\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function delRown(myTable,Rown)\r\n");
        out.write("{\r\n");
        out.write("var x=document.getElementById(myTable).deleteRow(Rown);\r\n");
        out.write("maxrow--\r\n");
        out.write("}\r\n");
        out.write("function openmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("var data = window.showModalDialog('process?action=Arrest_license' , self , 'Width=500px,Height=400px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\r\n");
        out.write("\tinsRow(myTable,maxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]);\r\n");
        out.write("\r\n");
        out.write("\t}\r\n");
        out.write("}\r\n");
        out.write("function editmodal(myTable)\r\n");
        out.write("{\r\n");
        out.write("\r\n");
        out.write("editna = 1;\r\n");
        out.write("var data = window.showModalDialog('process?action=Arrest_license', self , 'Width=500px,Height=400px');\r\n");
        out.write("if(data != null){\r\n");
        out.write("\tdelRown(myTable,editrow)\r\n");
        out.write("\r\n");
        out.write("\tinsRow(myTable,maxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]);\r\n");
        out.write("\r\n");
        out.write("\t}\r\n");
        out.write("\teditna = 0;\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("function Check(chk)\r\n");
        out.write("{\r\n");
        out.write("if(document.dataform.Check_ctr.checked==true){\r\n");
        out.write("for (i = 0; i < chk.length; i++)\r\n");
        out.write("chk[i].checked = true ;\r\n");
        out.write("}else{\r\n");
        out.write("\r\n");
        out.write("for (i = 0; i < chk.length; i++)\r\n");
        out.write("chk[i].checked = false ;\r\n");
        out.write("}\r\n");
        out.write("}\r\n");
        out.write("\r\n");
        out.write("function get_check_value(myTable)\r\n");
        out.write("{\r\n");
        out.write("var c_value = \"\";\r\n");
        out.write("var x=\"\";\r\n");
        out.write("if (!document.dataform.check_list.length)\r\n");
        out.write("{\r\n");
        out.write("\tdocument.getElementById(myTable).deleteRow(1);\r\n");
        out.write("}\r\n");
        out.write("for (var i=0; i < document.dataform.check_list.length; i++)\r\n");
        out.write("   {\r\n");
        out.write("\r\n");
        out.write("   if (document.dataform.check_list[i].checked)\r\n");
        out.write("      {\r\n");
        out.write("     // c_value = c_value + document.dataform.check_list[i].value + \"\\n\";\r\n");
        out.write("\t\tdocument.getElementById(myTable).deleteRow(i+1);\r\n");
        out.write("\t\ti--;\r\n");
        out.write("\t\tmaxrow--;\r\n");
        out.write("      }\r\n");
        out.write("   }\r\n");
        out.write("   //alert(maxrow-1);\r\n");
        out.write("   rerun_id();\r\n");
        out.write("}\r\n");
        out.write("function render(myTable)\r\n");
        out.write("{\r\n");
        out.write(" for (i=1;i<=cdata1.length-1;i++)\r\n");
        out.write("    {\r\n");
        out.write("        insRow(myTable,i,cdata1[i],cdata2[i],cdata3[i],cdata4[i],cdata5[i],cdata6[i],cdata7[i],cdata8[i],cdata9[i],cdata10[i]);\r\n");
        out.write("    }\r\n");
        out.write("}\r\n");
        out.write("var cdata1 =new Array();\r\n");
        out.write("var cdata2 =new Array();\r\n");
        out.write("var cdata3 =new Array();\r\n");
        out.write("var cdata4 =new Array();\r\n");
        out.write("var cdata5 =new Array();\r\n");
        out.write("var cdata6 =new Array();\r\n");
        out.write("var cdata7 =new Array();\r\n");
        out.write("var cdata8 =new Array();\r\n");
        out.write("var cdata9 =new Array();\r\n");
        out.write("var cdata10 =new Array();\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("// End -->\r\n");
        out.write("</script>\r\n");
        out.write("<!-- =======================================================================ปิดใบอนุญาติ========================================================================  -->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("             ");
        if (_jspx_meth_c_005fforEach_005f24(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                        </table>\r\n");
        out.write("                     </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                   <tr >\r\n");
        out.write("                      <td >&nbsp; </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                   <tr class=\"bgRowGray\">\r\n");
        out.write("                      <td ><strong>รายละเอียดในการสืบสวน</strong> </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                   <tr >\r\n");
        out.write("                      <td >&nbsp; </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("                   <tr>\r\n");
        out.write("                     <td>\r\n");
        out.write("                       <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"500\">\r\n");
        out.write("                         <tr>\r\n");
        out.write("                           <td width=\"30%\" align=\"right\">\r\n");
        out.write("                             เลขที่การแจ้งความ :&nbsp;\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td width=\"70%\">\r\n");
        out.write("                              <input type=\"text\" name=\"notice_no\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.notice_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("                              <input type=\"hidden\" name=\"application_notice_arrest_id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_notice_arrest_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("                           </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("                         <tr>\r\n");
        out.write("                           <td align=\"right\">\r\n");
        out.write("                              ชื่อผู้แจ้งเบาะแส :&nbsp;\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td>\r\n");
        out.write("                              <input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" name=\"imform_name\" class=\"textview\" size=\"40\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.inform_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("                           </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("                         <tr>\r\n");
        out.write("                           <td  align=\"right\">\r\n");
        out.write("                             เลขที่หมายค้น :&nbsp;\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td >\r\n");
        out.write("                             <input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"25\" name=\"warrant_no\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.warrant_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                             <input type=\"hidden\" class=\"textview\" size=\"25\" id=\"application_search_warrant_id\" name=\"application_search_warrant_id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_search_warrant_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                           </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("                         <tr>\r\n");
        out.write("                           <td  align=\"right\">\r\n");
        out.write("                             เลขที่ สส.2/27 :&nbsp;\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td >\r\n");
        out.write("                             <input type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\"  name=\"confirm_no\" class=\"textview\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.confirm_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                             <input type=\"hidden\" id=\"application_sincere_confirm_id\" name=\"application_sincere_confirm_id\" class=\"textview\" size=\"25\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.application_sincere_confirm_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                           </td>\r\n");
        out.write("                         </tr>\r\n");
        out.write("                       </table>\r\n");
        out.write("                     </td>\r\n");
        out.write("                   </tr>\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("\r\n");
        out.write("          <!--END ใบอนุญาต-->\r\n");
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
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("          <!-- รายงานบันทึกการจับกุม 2/6ก-->\r\n");
        out.write("         <div class=\"innerPosition\"  id=\"2_6Tab\" style=\"width:750px;display:none\">\r\n");
        out.write("                 <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
        out.write("                      <tr>\r\n");
        out.write("                           <td width=\"50%\" valign=\"top\">\r\n");
        out.write("                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td height=\"25\" align=\"right\">วันที่บันทึกรายงาน :&nbsp;</td>\r\n");
        out.write("                                          <td height=\"25\">\r\n");
        out.write("                                                    <input name=\"arrest_report_date\" id=\"arrest_report_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.arrest_report_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr>\r\n");
        out.write("                                     \t<td>&nbsp;</td>\r\n");
        out.write("                                     \t<td align=\"left\">ข้อมูลบันทึกการจับ (ส.ส.2/39 ก,ข)</td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">ผู้ครอบครองสถานที่ :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"owner_name\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textView\" size=\"31\"   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.owner_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  >\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">ชื่อสถานประกอบการ :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"business_name\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textView\" size=\"31\"  value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.business_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  >\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">ชื่อผู้รับรอง :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"surety_name\" type=\"text\" class=\"textView\" size=\"31\"  onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.surety_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">ซึ่งเป็น :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"duty\" type=\"text\" class=\"textView\" size=\"31\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.duty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" >\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     \r\n");
        out.write("                                </table>\r\n");
        out.write("                           </td>\r\n");
        out.write("                           <td  width=\"50%\" valign=\"top\">\r\n");
        out.write("                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"  width=\"100%\">\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td height=\"25\" ><input name=\"guilty\" type=\"checkbox\" disabled  ");
        if (_jspx_meth_c_005fif_005f118(_jspx_th_c_005fif_005f112, _jspx_page_context))
          return true;
        out.write(" value = 'Y' /> &nbsp;มีความผิด</td>\r\n");
        out.write("                                          <td height=\"25\">&nbsp;</td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr>\r\n");
        out.write("                                     \t<td>&nbsp;</td>\r\n");
        out.write("                                     \t<td align=\"left\">รายงานผลการจับกุมผู้กระทำผิด (ส.ส.2/6 ก)</td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr >\r\n");
        out.write("                                          <td align=\"right\">รายงานหัวหน้าฝ่ายปราบปราม :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                            <input type=\"text\" name=\"report_to_name\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.report_to_staff}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("                                            <input type=\"hidden\" name=\"report_to\" id=\"report_to\" class=\"textview\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.report_to}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"  />\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">รายงานหัวหน้าส่วนปราบปราม :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                            <input type=\"text\" name=\"order_by_name\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textview\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.order_by_staff}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                            <input type=\"hidden\" name=\"order_by\" id=\"order_by\" class=\"textview\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.order_by}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr  >\r\n");
        out.write("                                          <td  align=\"right\">รายงานผู้บังคับบัญชา :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"leader_position\" type=\"text\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textView\" size=\"31\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.leader_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                     <tr >\r\n");
        out.write("                                          <td  align=\"right\">รายงานผู้อำนวยการสำนักฯ/<br />สส.ภาค/สส.พื้นที่ :&nbsp;</td>\r\n");
        out.write("                                          <td >\r\n");
        out.write("                                               <input name=\"director_position\" type=\"text\" class=\"textView\" size=\"31\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.director_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                                          </td>\r\n");
        out.write("                                     </tr>\r\n");
        out.write("                                </table>\r\n");
        out.write("                         </td>\r\n");
        out.write("                    </tr>\r\n");
        out.write("\r\n");
        out.write("               </table>\r\n");
        out.write("          </div>\r\n");
        out.write("          <!-- END รายงานบันทึกการจับกุม-->\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("     </td>\r\n");
        out.write("     <td>&nbsp;</td>\r\n");
        out.write("   </tr>\r\n");
        out.write("</table>\r\n");
        out.write("<script>\r\n");
        out.write("\r\n");
        out.write("var Rows = 0 ;\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("render('aliTable');\r\n");
        out.write("durender('duTable');\r\n");
        out.write("lawsrender('lawsTable');\r\n");
        out.write("aatrender('aatTable');\r\n");
        out.write("</script>");
        out.write("\r\n");
        out.write("                  \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f112.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f112);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f112);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f20 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f20.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fforEach_005f20.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aallist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f20.setVar("aal");
    _jspx_th_c_005fforEach_005f20.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f20 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f20 = _jspx_th_c_005fforEach_005f20.doStartTag();
      if (_jspx_eval_c_005fforEach_005f20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.culprit_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_id_card}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.other_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.address_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.moo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.soi}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.road}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.province}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata13[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.district}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata14[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.subdistrict}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata15[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.race_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata16[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.nationality_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata17[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.career}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata18[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.birth_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata19[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.father_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata20[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.mother_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata21[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata22[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata23[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.province_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata24[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.district_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata25[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.subdistrict_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata26[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.race_id_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata27[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.nationality_id_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata28[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.testimony}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata29[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_passport}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata30[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.middle_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata31[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.company_title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata32[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.company_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata33[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.excise_reg_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata34[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.corporation_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata35[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.age}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t lawsdata36[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aal.lawbreaker_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";  \r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f20.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f20[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f20.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f20.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f20);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f21 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f21.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fforEach_005f21.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dslist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f21.setVar("ds");
    _jspx_th_c_005fforEach_005f21.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f21 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f21 = _jspx_th_c_005fforEach_005f21.doStartTag();
      if (_jspx_eval_c_005fforEach_005f21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t+\"<option value=\\\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\\');
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f113(_jspx_th_c_005fforEach_005f21, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f21))
            return true;
          out.write(' ');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds.status_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\"\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f21.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f21[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f21.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f21.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f21);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f113(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f21, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f21)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f113 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f113.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f113.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f21);
    _jspx_th_c_005fif_005f113.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ds.id == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f113 = _jspx_th_c_005fif_005f113.doStartTag();
    if (_jspx_eval_c_005fif_005f113 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f113.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f113);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f113);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f22 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f22.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fforEach_005f22.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aatlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f22.setVar("aat");
    _jspx_th_c_005fforEach_005f22.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f22 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f22 = _jspx_th_c_005fforEach_005f22.doStartTag();
      if (_jspx_eval_c_005fforEach_005f22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.inspector_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_position}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.duty_status_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.staff_offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t aatdata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aat.title_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f22.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f22[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f22.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f22.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f22);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f114(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f114 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f114.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f114.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fif_005f114.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f114 = _jspx_th_c_005fif_005f114.doStartTag();
    if (_jspx_eval_c_005fif_005f114 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\ty4.innerHTML=\"<a class='spanLink' onClick=\\\"duforedit('\"+ s +\"');dueditmodal('duTable','\"+row+\"');durerun_id();\\\">\" +productDesc+  \"</a>\";\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f114.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f114);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f114);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f115(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f115 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f115.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f115.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fif_005f115.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment != 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f115 = _jspx_th_c_005fif_005f115.doStartTag();
    if (_jspx_eval_c_005fif_005f115 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\ty4.innerHTML= productDesc;\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f115.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f115);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f115);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f116(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f116 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f116.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f116.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fif_005f116.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f116 = _jspx_th_c_005fif_005f116.doStartTag();
    if (_jspx_eval_c_005fif_005f116 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t               \t\t<tr>\r\n");
        out.write("\t                         <td>\r\n");
        out.write("\t                              <span class=\"spanLink\" onClick=\"duopenmodal('duTable')\">เพิ่มใหม่</span> |\r\n");
        out.write("\t                              <span class=\"spanLink\" onClick=\"duget_check_value('duTable')\">ลบรายการที่เลือก</span>\r\n");
        out.write("\t                         </td>\r\n");
        out.write("\t                    </tr>\r\n");
        out.write("               \t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f116.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f116.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f116);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f116);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f117(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f117 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f117.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f117.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fif_005f117.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${IsEditIndictment == 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f117 = _jspx_th_c_005fif_005f117.doStartTag();
    if (_jspx_eval_c_005fif_005f117 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        \t<input id=\"aaeChkAll\" name=\"chkAll\" type=\"checkbox\" onClick=\"allCheck(this,document.dataform.ducheck_list);\"/>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f117.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f117);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f117);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f23 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f23.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fforEach_005f23.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aaelist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f23.setVar("aae");
    _jspx_th_c_005fforEach_005f23.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f23 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f23 = _jspx_th_c_005fforEach_005f23.doStartTag();
      if (_jspx_eval_c_005fforEach_005f23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t         \t\t\t\t\t\t  <script>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.isexhibitco}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.duty_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.duty_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.product_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.brand_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.isdomestic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("]  =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.sizes_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata11[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata12[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata13[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata14[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight_unit_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata15[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata16[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.exhibit_list}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata17[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.exhibit_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata18[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.car_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata19[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.remarks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata20[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata21[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_desc}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata22[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.size_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata23[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.qty_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata24[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.netweight_unit_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata25[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.case_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata26[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.co_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata27[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t dudata28[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] =\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${aae.group_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</script>\r\n");
          out.write("\t\t\t\t\t\t\t\t ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f23.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f23[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f23.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f23.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f23);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f24 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f24.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fforEach_005f24.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${alilist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f24.setVar("ali");
    _jspx_th_c_005fforEach_005f24.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f24 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f24 = _jspx_th_c_005fforEach_005f24.doStartTag();
      if (_jspx_eval_c_005fforEach_005f24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("           <script>\r\n");
          out.write("\t\t\tcdata1[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata2[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.offname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata3[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.entrepreneur}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata4[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.establishment_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata5[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.license_type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\tcdata6[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.licensetype_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata7[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.book_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata8[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.license_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata9[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.iswithdraw}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t\t\tcdata10[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("] = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ali.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ;\r\n");
          out.write("\t</script>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f24.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f24[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f24.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f24.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f24);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f118(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f112, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f118 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f118.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f118.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f112);
    _jspx_th_c_005fif_005f118.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.guilty == 'Y' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f118 = _jspx_th_c_005fif_005f118.doStartTag();
    if (_jspx_eval_c_005fif_005f118 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" checked ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f118.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f118.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f118);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f118);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f119(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f119 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f119.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f119.setParent(null);
    _jspx_th_c_005fif_005f119.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${SaveMSG == '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f119 = _jspx_th_c_005fif_005f119.doStartTag();
    if (_jspx_eval_c_005fif_005f119 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<script>\r\n");
        out.write("\t\talert(\"บันทึกข้อมูลเรียบร้อย\");\r\n");
        out.write("\t</script>\r\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f119.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f119);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f119);
    return false;
  }
}
