package org.apache.jsp.Master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.FormHandler;

public final class ConfigDivideStaffList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/Templates/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("function ChechList(chk){\r\n");
      out.write("\tif(document.chkAll.checked == true){\r\n");
      out.write("\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\tchk[i].checked = true ;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tfor (i = 0; i < chk.length; i++)\r\n");
      out.write("\t\t\tchk[i].checked = false ;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function updateCourt(url){\r\n");
      out.write("\tif(document.dataform.offcode.value != \"\"){\r\n");
      out.write("\t\tif(document.dataform.onsubmit()){\r\n");
      out.write("\t\t\tdocument.dataform.action=url;\r\n");
      out.write("\t\t    document.dataform.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\talert(\"กรุณาเลือกหน่วยงาน\");\r\n");
      out.write("\t\tdocument.dataform.offcode.select();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function deleteData(url){\r\n");
      out.write("\tif(document.dataform.offcode.value != \"\"){\r\n");
      out.write("\t\tvar ans = confirm(\"ยืนยันการลบข้อมูล\");\r\n");
      out.write("\t\tif(ans){\r\n");
      out.write("\t\t\tif(document.dataform.onsubmit()){\r\n");
      out.write("\t\t\t\tdocument.dataform.action=url;\r\n");
      out.write("\t\t\t    document.dataform.submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\talert(\"กรุณาเลือกหน่วยงาน\");\r\n");
      out.write("\t\tdocument.dataform.offcode.select();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function addlistStaff(){\r\n");
      out.write("\tvar data = window.showModalDialog('process?action=Divide_staff_poplist', self, 'dialogWidth=700px,Height=400px');\r\n");
      out.write("\tif (data) {\r\n");
      out.write("\t\tvar base = jQuery(\".person_row\").size();\r\n");
      out.write("\t\talert(\"base=\"+base);\r\n");
      out.write("\t\tfor (var i = 0; i < data.length; i++) {\r\n");
      out.write("\t\t\tvar index = base + i + 1;\r\n");
      out.write("\t\t\talert(\"index=\"+index);\r\n");
      out.write("\t\t\tvar newRow = jQuery(\"<tr/>\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignCenter\").html(index));\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignCenter\").append(jQuery(\"<input />\").attr(\"name\", \"chkList\").attr(\"type\", \"checkbox\")));\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<td/>\").addClass('TblRow AlignLeft').html(data[i][9]));\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<td/>\").addClass('TblRow AlignLeft').html(data[i][3]));\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<td/>\").addClass('TblRow AlignLeft').html(data[i][13]));\r\n");
      out.write("\t\t\t//newRow.append(jQuery(\"<td/>\").addClass('TblRow AlignLeft').html('test'));\r\n");
      out.write("\t\t\t//newRow.append(jQuery(\"<td/>\").addClass('TblRow AlignLeft').html('test'));\r\n");
      out.write("\t\t\t//newRow.append(jQuery(\"<td/>\").addClass('TblRow AlignLeft').html('test'));\r\n");
      out.write("\t\t\t//newRow.append(jQuery(\"<td/>\").addClass('TblRow AlignCenter').html('test'));\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<td/>\").addClass('TblRow AlignRight').append(jQuery('<input/>').addClass('textNum').attr({type:'text',n_ame:'share2',value:'',size:'5'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'staff_idcardno',value:data[i][5]}));\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'staff_poscode',value:data[i][6]}));\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'staff_offcode',value:data[i][7]}));\r\n");
      out.write("\t\t\tnewRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'staff_level',value:data[i][13]}));\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tjQuery(\"#divide_tab\").append(jQuery('<tr/>').addClass('person_row').attr('id', 'person_row_'+index).html(newRow.html().replace(/n_ame/g, 'name')));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deleterow() {\r\n");
      out.write("    jQuery(\".person_row:has(:checked)\").remove();\r\n");
      out.write("    jQuery(\".person_row\").each(function(index) {\r\n");
      out.write("        var i = index + 1;\r\n");
      out.write("        var row = jQuery(this);\r\n");
      out.write("        row.attr('id', 'person_row_' + i);\r\n");
      out.write("        row.find('td').first().html(i);\r\n");
      out.write("        //row.find('td > [name=order_seq]').attr('value', i);\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function chkUncheckAll(prefix) {\r\n");
      out.write("    if (jQuery(\"#\" + prefix).first().attr('checked')) {\r\n");
      out.write("        jQuery(\"input[name^='\" + prefix + \"']\").attr('checked', true);\r\n");
      out.write("    } else {\r\n");
      out.write("        jQuery(\"input[name^='\" + prefix + \"']\").attr('checked', false);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validateShare2(ctl){\r\n");
      out.write("\tif(ctl.value < 0 || ctl.value > 100){\r\n");
      out.write("\t\talert(\"จำนวนสัดส่วนจะต้องอยู่ระหว่าง 0 ถึง 100\");\r\n");
      out.write("\t\tctl.select();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function chkSubmit(){\r\n");
      out.write("\tif(document.dataform.offcode.value != \"\"){\r\n");
      out.write("\t\tvar rowCount = document.getElementById(\"divide_tab\").rows.length;\r\n");
      out.write("\t\tif(rowCount<=1){\r\n");
      out.write("\t\t\talert(\"กรุณาเพิ่มรายการเจ้าหน้าที่\");\r\n");
      out.write("\t\t\tdocument.dataform.offcode.select();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\talert(\"กรุณาเลือกหน่วยงาน\");\r\n");
      out.write("\t\tdocument.dataform.offcode.focus();\r\n");
      out.write("\t\treturn false\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");

	FormHandler formHandler = new FormHandler(request);

      out.write("\r\n");
      out.write("<form method=\"post\" name=\"dataform\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" >\r\n");
      out.write("      <table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("        <tr>\r\n");
      out.write("           <td width=\"100%\" align=\"left\" valign=\"top\"> \r\n");
      out.write("            \r\n");
      out.write("             <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("                  <td width=\"99%\"><span class=\"websitename\">ข้อมูลสัดส่วนการแบ่งเงินคดี พ.ร.บ.ภาษี 2527</span></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr height=\"40\">\r\n");
      out.write("                  <td colspan=\"2\"><input name=\"btnSave\"  type=\"submit\" class=\"barbutton\" value=\"บันทึก\" onClick=\"return chkSubmit();\" />\r\n");
      out.write("\t\t\t\t\t              <input name=\"btnCancel\"  type=\"button\" class=\"barbutton\" value=\"ยกเลิกการแก้ไข\" onclick=\"updateCourt('");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("');\" >\r\n");
      out.write("\t\t\t      </td>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"700\">\r\n");
      out.write("                \t\t\t<tr height=\"40\">\r\n");
      out.write("                \t\t\t\t<td width=\"20%\" align=\"right\">แสดงตาม หน่วยงาน :&nbsp;</td>\r\n");
      out.write("                \t\t\t\t<td width=\"50%\">\r\n");
      out.write("\t\t\t                        <input type=\"text\" name=\"offcode\" id=\"offcode\" size=\"4\"  class=\"textbox\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.offcode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onBlur=\"getOffname(this.value,'Y',offname);\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t   <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tonClick=\"window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t   <input type=\"text\" name=\"offname\" id=\"offname\" size=\"48\"  class=\"textview\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.offname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\t\t\t                        \r\n");
      out.write("                \t\t\t\t</td>\r\n");
      out.write("                \t\t\t\t<td width=\"20%\"><input name=\"btnCancel\"  type=\"button\" class=\"barbutton\" value=\"แสดงรายการ\" onClick=\"updateCourt('");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("');\"/></td>\r\n");
      out.write("                \t\t\t\t<td width=\"20%\">&nbsp;</td>\r\n");
      out.write("                \t\t\t</tr>\r\n");
      out.write("                \t\t</table>\r\n");
      out.write("                \t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t   <td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <span class=\"spanLink\" onClick=\"addlistStaff();\">เพิ่มข้อมูล</span> | -->\r\n");
      out.write("\t\t\t\t\t\t<span  class=\"spanLink\" onclick=\"deleteData('");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("');\">ล้างจำนวนสัดส่วนรายการที่เลือก</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t </tr>\r\n");
      out.write("\t\t\t\t <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("                  <td>&nbsp;</td>\r\n");
      out.write("                  <td >\r\n");
      out.write("                  \r\n");
      out.write("                    <table border=\"0\" width=\"600\" cellpadding=\"=0\" cellspacing=\"0\">\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                        \r\n");
      out.write("                          <table width=\"100%\" border=\"1\" id=\"divide_tab\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#CCCCCC\" >\r\n");
      out.write("                          \r\n");
      out.write("                             <tr height=\"25\">\r\n");
      out.write("\t\t\t\t\t\t\t  <td width=\"50\" class=\"TblHeaderColumn\" >ลำดับ</td>\r\n");
      out.write("\t\t\t\t\t\t\t  <td width=\"30\" class=\"TblHeaderColumn\"  >\r\n");
      out.write("\t\t\t\t\t\t\t  \t\t<input name=\"chkList\" type=\"checkbox\" id=\"chkList\" onclick=\"chkUncheckAll('chkList');\" value=\"0\" />\r\n");
      out.write("\t\t\t\t\t\t\t  </td>\r\n");
      out.write("\t\t\t\t\t\t\t  <td width=\"130\" class=\"TblHeaderColumn\" >ชื่อ-สกุล</td>\r\n");
      out.write("                              <td width=\"200\" class=\"TblHeaderColumn\" >ตำแหน่ง</td>\r\n");
      out.write("                              <td width=\"80\" class=\"TblHeaderColumn\" >ระดับ</td>\r\n");
      out.write("                              <td width=\"80\" class=\"TblHeaderColumn\" >จำนวนส่วน</td>  \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                        \r\n");
      out.write("                         </table>\r\n");
      out.write("                        \r\n");
      out.write("                        </td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                    \r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("             </table>\r\n");
      out.write("              \r\n");
      out.write("           </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("      </table>\r\n");
      out.write("</form>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("//You should create the validator only after the definition of the HTML form\r\n");
      out.write("  var frmvalidator  = new Validator(\"dataform\");\r\n");
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
    _jspx_th_c_005furl_005f0.setValue("process?action=ConfigDivideStaffList_Master&cmd=create");
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
    _jspx_th_c_005furl_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/process?action=ConfigDivideStaffList_Master&cmd=list&offcode=${param.offcode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
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
    _jspx_th_c_005furl_005f2.setValue("/process?action=ConfigDivideStaffList_Master&cmd=list");
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
    _jspx_th_c_005furl_005f3.setValue("/process?action=ConfigDivideStaffList_Master&cmd=delete");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ListconfigDS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("configDS");
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr class=\"person_row\" id=\"person_row_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                              <input name=\"staff_idcardno\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.idcard_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                              <input name=\"staff_poscode\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                              <input name=\"staff_offcode\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                              <input name=\"configID\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                              <td class=\"TblRow AlignCenter\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t  <td class=\"TblRow AlignCenter\"><input name=\"chkList\" type=\"checkbox\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" /></td>\r\n");
          out.write("                              <td class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.title_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.first_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.last_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                              <td class=\"TblRow AlignLeft\">\r\n");
          out.write("                              \t<input name=\"staff_posname\" type=\"text\" size=\"25\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("                              </td>\r\n");
          out.write("\t\t\t\t\t\t\t  <td class=\"TblRow AlignLeft\"\">\r\n");
          out.write("\t\t\t\t\t\t\t  \t<input name=\"staff_level\" type=\"text\" size=\"15\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t\t\t\t\t  </td>\r\n");
          out.write("\t\t\t\t\t\t\t  <td class=\"TblRow AlignRight\"><input name=\"share2\" id=\"share2\" type=\"text\" class=\"textNum\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${configDS.share2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" size=\"5\" OnKeyPress=\"ChkMinusDbl(this);\" onBlur=\"validateShare2(this);\" /></td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("                            ");
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
}
