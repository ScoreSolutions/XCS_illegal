package org.apache.jsp.CompareCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;

public final class reward_005fdivide_005ftax_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Templates/meta.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fnobody.release();
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
      out.write("<script >\r\n");
      out.write("function loadStaffFromView() {\r\n");
      out.write("    location.href = \"process?action=Reward_divide&cmd=loadStaffFromView&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.cc_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function taxopenmodal (myTable){\r\n");
      out.write("    var data = window.showModalDialog('process?action=Divide_staff_poplist&showOther=1', self, 'dialogWidth=700px,Height=400px');\r\n");
      out.write("\tif (data) {\r\n");
      out.write("\t    var base = jQuery(\".person_row\").size();\r\n");
      out.write("\t    for (var i = 0; i < data.length; i++) {\r\n");
      out.write("\t        \tvar index = base + i + 1;\r\n");
      out.write("\t            var newRow = jQuery(\"<tr/>\");\r\n");
      out.write("\r\n");
      out.write("\t            newRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignCenter\").html(index));\r\n");
      out.write("\t            newRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignCenter\").append(jQuery(\"<input />\").attr(\"n_ame\", \"chk1\").attr(\"type\", \"checkbox\")));\r\n");
      out.write("\t            newRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignCenter\").append(jQuery(\"<input />\")\r\n");
      out.write("\t    \t            .attr({type:'text',n_ame:'order_seq',size:'1',value:index,maxlength:3, OnKeyPress:'ChkMinusInt(this)'})));\r\n");
      out.write("\t            newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'new_order_seq',value:index}));\r\n");
      out.write("\t            newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rdt_id',value:''}));\r\n");
      out.write("\t            newRow.append(jQuery(\"<td/>\").addClass(\"TblRow AlignLeft\").html(data[i][9]));\r\n");
      out.write("\t            newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rdt_title_code',value:data[i][12]}));\r\n");
      out.write("\t            newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rdt_first_name',value:data[i][10]}));\r\n");
      out.write("\t            newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rdt_last_name',value:data[i][11]}));\r\n");
      out.write("\t            newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rdt_position_name',value:data[i][3]}));\r\n");
      out.write("\t            newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rdt_staff_level',value:data[i][13]}));\r\n");
      out.write("\t            newRow.append(jQuery(\"<input/>\").attr({type:'hidden',n_ame:'rdt_idcard_no',value:data[i][5]}));\r\n");
      out.write("\t            newRow.append(jQuery(\"<td/>\").addClass('TblRow AlignLeft').html(data[i][3]));\r\n");
      out.write("\r\n");
      out.write("\t            var selectDuty = jQuery('<select/>').attr({n_ame:'rdt_duty_status_id'});\r\n");
      out.write("\t            selectDuty.append(jQuery('<option />').attr({value:3}).html('ผู้ร่วมจับกุม'));\r\n");
      out.write("\t            selectDuty.append(jQuery('<option />').attr({value:4}).html('ผู้สั่งการ'));\r\n");
      out.write("\t            selectDuty.append(jQuery('<option />').attr({value:5}).html('ผู้ช่วยเหลือ'));\r\n");
      out.write("\t            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(selectDuty));\r\n");
      out.write("\t            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(jQuery('<input/>').addClass('textNum')\r\n");
      out.write("\t    \t            .attr({type:'text',n_ame:'rdt_share1',value:'0',size:'7', OnKeyPress:'ChkMinusInt(this)'})));\r\n");
      out.write("\t            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(jQuery('<input/>').addClass('textNum')\r\n");
      out.write("\t    \t            .attr({type:'text',n_ame:'rdt_share2',value:'0',size:'7', OnKeyPress:'ChkMinusInt(this)'})));\r\n");
      out.write("\t            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(jQuery('<input/>').addClass('textNum sum')\r\n");
      out.write("\t    \t            .attr({type:'text',n_ame:'rdt_money1',value:'0',size:'7', OnKeyPress:'ChkMinusDbl(this)'})));\r\n");
      out.write("\t            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(jQuery('<input/>').addClass('textNum sum')\r\n");
      out.write("\t    \t            .attr({type:'text',n_ame:'rdt_money2',value:'0',size:'7', OnKeyPress:'ChkMinusDbl(this)'})));\r\n");
      out.write("\t            newRow.append(jQuery('<td/>').addClass('TblRow').append(jQuery('<div/>').addClass('total').html(0)));\r\n");
      out.write("\t            jQuery(\"#divideTab\").append(jQuery('<tr/>').addClass('person_row').attr('id', 'person_row_' + index).html(newRow.html().replace(/n_ame/g, 'name')));\r\n");
      out.write("\t    }\r\n");
      out.write("\t} else {\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function calRewardTax() {\r\n");
      out.write("    var data = {};\r\n");
      out.write("    data['arrest'] = jQuery(\"[name=rdt_duty_status_id] > [value=2]:selected \").size();\r\n");
      out.write("    data['arrest_co'] = jQuery(\"[name=rdt_duty_status_id] > [value=3]:selected \").size();\r\n");
      out.write("    data['command'] = jQuery(\"[name=rdt_duty_status_id] > [value=4]:selected \").size();\r\n");
      out.write("    data['helper'] = jQuery(\"[name=rdt_duty_status_id] > [value=5]:selected \").size();\r\n");
      out.write("\r\n");
      out.write("    if(data['arrest'] != 1){\r\n");
      out.write("        alert('กรุณาใส่จำนวนผู้จับกุมให้ถูกต้อง');\r\n");
      out.write("        return;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    if (data) {\r\n");
      out.write("\r\n");
      out.write("        var onethree = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.reward_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/3 * 1;\r\n");
      out.write("        var onethree_section = 0;\r\n");
      out.write("        var arrest_row = jQuery(\".person_row\").has(\"[name=rdt_duty_status_id] > [value=2]:selected\");\r\n");
      out.write("        arrest_row.each(function(){\r\n");
      out.write("            if(jQuery(this).find(\"[name=rdt_share1]\").val() != \"\")\r\n");
      out.write("            \tonethree_section += parseInt(jQuery(this).find(\"[name=rdt_share1]\").val());\r\n");
      out.write("        });\r\n");
      out.write("        var arrest_co_row = jQuery(\".person_row\").has(\"[name=rdt_duty_status_id] > [value=3]:selected\");\r\n");
      out.write("        arrest_co_row.each(function(){\r\n");
      out.write("        \tif(jQuery(this).find(\"[name=rdt_share1]\").val() != \"\")\r\n");
      out.write("            \tonethree_section += parseInt(jQuery(this).find(\"[name=rdt_share1]\").val());\r\n");
      out.write("        });\r\n");
      out.write("        var command_row = jQuery(\".person_row\").has(\"[name=rdt_duty_status_id] > [value=4]:selected\");\r\n");
      out.write("        command_row.each(function(){\r\n");
      out.write("        \tif(jQuery(this).find(\"[name=rdt_share1]\").val() != \"\")\r\n");
      out.write("            \tonethree_section += parseInt(jQuery(this).find(\"[name=rdt_share1]\").val());\r\n");
      out.write("        });\r\n");
      out.write("        var helper_row = jQuery(\".person_row\").has(\"[name=rdt_duty_status_id] > [value=5]:selected\");\r\n");
      out.write("        helper_row.each(function(){\r\n");
      out.write("        \tif(jQuery(this).find(\"[name=rdt_share1]\").val() != \"\")\r\n");
      out.write("\t\t\t\tonethree_section += parseInt(jQuery(this).find(\"[name=rdt_share1]\").val());\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        var one_onethree = round2decimal(onethree/onethree_section);\r\n");
      out.write("        jQuery(\"#onethree\").html(round2decimal(onethree));\r\n");
      out.write("        jQuery(\"#one_onethree\").html(round2decimal(one_onethree));\r\n");
      out.write("        var remain_onethree = round2remain(onethree - (one_onethree * onethree_section));\r\n");
      out.write("        jQuery(\"#remain_onethree\").html(round2decimal(remain_onethree));\r\n");
      out.write("\t\tdocument.getElementById(\"remarks_tax\").value = \"1/3 ส่วน \" + round2decimal(onethree) + \" บาท ส่วนละ \" + one_onethree + \" บาท เหลือเศษ \" + round2decimal(remain_onethree) + \" บาท แบ่งให้ผู้จับทั้งหมด\\n\";\r\n");
      out.write("        \r\n");
      out.write("        arrest_row.each(function(){\r\n");
      out.write("            var money1;\r\n");
      out.write("\t\t\tif(jQuery(this).find(\"[name=rdt_share1]\").val() != \"\")\r\n");
      out.write("             \tmoney1 = parseFloat(jQuery(this).find(\"[name=rdt_share1]\").val())*parseFloat(one_onethree);\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\tmoney1 = 0;\r\n");
      out.write("\t\t\t\r\n");
      out.write("            money1 = round2remain(parseFloat(remain_onethree) + parseFloat(money1));\r\n");
      out.write("            jQuery(this).find(\"[name=rdt_money1]\").val(round2decimal(money1));\r\n");
      out.write("        });\r\n");
      out.write("        arrest_co_row.each(function(){\r\n");
      out.write("            var money1;\r\n");
      out.write("\t\t\tif(jQuery(this).find(\"[name=rdt_share1]\").val() != \"\")\r\n");
      out.write("             \tmoney1 = parseFloat(jQuery(this).find(\"[name=rdt_share1]\").val())*parseFloat(one_onethree);\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\tmoney1 = 0;\r\n");
      out.write("\t\t\t\r\n");
      out.write("            jQuery(this).find(\"[name=rdt_money1]\").val(round2decimal(money1));\r\n");
      out.write("        });\r\n");
      out.write("        command_row.each(function(){\r\n");
      out.write("            var money1;\r\n");
      out.write("\t\t\tif(jQuery(this).find(\"[name=rdt_share1]\").val() != \"\")\r\n");
      out.write("             \tmoney1 = parseFloat(jQuery(this).find(\"[name=rdt_share1]\").val())*parseFloat(one_onethree);\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\tmoney1 = 0;\r\n");
      out.write("\t\t\t\r\n");
      out.write("            jQuery(this).find(\"[name=rdt_money1]\").val(round2decimal(money1));\r\n");
      out.write("        });\r\n");
      out.write("        helper_row.each(function(){\r\n");
      out.write("\t\t\tvar money1;\r\n");
      out.write("\t\t\tif(jQuery(this).find(\"[name=rdt_share1]\").val() != \"\")\r\n");
      out.write("\t\t\t \tmoney1 = parseFloat(jQuery(this).find(\"[name=rdt_share1]\").val())*parseFloat(one_onethree);\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\tmoney1 = 0;\r\n");
      out.write("\t\t\t\r\n");
      out.write("            jQuery(this).find(\"[name=rdt_money1]\").val(round2decimal(money1));\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        var twothree = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.reward_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" - onethree;\r\n");
      out.write("        var twothree_section = 0;\r\n");
      out.write("        arrest_row.each(function(){\r\n");
      out.write("            if(jQuery(this).find(\"[name=rdt_share2]\").val() != \"\")\r\n");
      out.write("            \ttwothree_section += parseInt(jQuery(this).find(\"[name=rdt_share2]\").val());\r\n");
      out.write("        });\r\n");
      out.write("        arrest_co_row.each(function(){\r\n");
      out.write("        \tif(jQuery(this).find(\"[name=rdt_share2]\").val() != \"\")\r\n");
      out.write("            \ttwothree_section += parseInt(jQuery(this).find(\"[name=rdt_share2]\").val());\r\n");
      out.write("        });\r\n");
      out.write("        command_row.each(function(){\r\n");
      out.write("        \tif(jQuery(this).find(\"[name=rdt_share2]\").val() != \"\")\r\n");
      out.write("            \ttwothree_section += parseInt(jQuery(this).find(\"[name=rdt_share2]\").val());\r\n");
      out.write("        });\r\n");
      out.write("        helper_row.each(function(){\r\n");
      out.write("        \tif(jQuery(this).find(\"[name=rdt_share2]\").val() != \"\")\r\n");
      out.write("            \ttwothree_section += parseInt(jQuery(this).find(\"[name=rdt_share2]\").val());\r\n");
      out.write("        });\r\n");
      out.write("        var one_twothree = round2decimal(twothree / twothree_section);\r\n");
      out.write("        jQuery(\"#twothree\").html(round2decimal(twothree));\r\n");
      out.write("        jQuery(\"#one_twothree\").html(round2decimal(one_twothree));\r\n");
      out.write("        var remain_twothree = round2remain(twothree - round2decimal(round2decimal(one_twothree) * twothree_section));\r\n");
      out.write("        jQuery(\"#remain_twothree\").html(round2decimal(remain_twothree));\r\n");
      out.write("        document.getElementById(\"remarks_tax\").value += \"2/3 ส่วน \" + round2decimal(twothree) + \" บาท ส่วนละ \" + one_twothree + \" บาท เหลือเศษ \" + round2decimal(remain_twothree) + \" บาท แบ่งให้ผู้จับทั้งหมด\";\r\n");
      out.write("\r\n");
      out.write("        arrest_row.each(function(){\r\n");
      out.write("            var money2;\r\n");
      out.write("\t\t\tif(jQuery(this).find(\"[name=rdt_share2]\").val() != \"\" && parseFloat(jQuery(this).find(\"[name=rdt_share2]\").val()) != 0.0){\r\n");
      out.write("             \tmoney2 = parseFloat(jQuery(this).find(\"[name=rdt_share2]\").val())*one_twothree;\r\n");
      out.write("             \tjQuery(this).find(\"[name=rdt_money2]\").val(round2remain(parseFloat(round2decimal(money2))+parseFloat(round2decimal(remain_twothree))));\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tmoney2 = 0;\r\n");
      out.write("\t\t\t\tjQuery(this).find(\"[name=rdt_money2]\").val(\"0.00\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("        });\r\n");
      out.write("        arrest_co_row.each(function(){\r\n");
      out.write("            var money2;\r\n");
      out.write("\t\t\tif(jQuery(this).find(\"[name=rdt_share2]\").val() != \"\" && parseFloat(jQuery(this).find(\"[name=rdt_share2]\").val()) != 0.0){\r\n");
      out.write("             \tmoney2 = parseFloat(jQuery(this).find(\"[name=rdt_share2]\").val())*one_twothree;\r\n");
      out.write("             \tjQuery(this).find(\"[name=rdt_money2]\").val(round2decimal(money2));         \t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tmoney2 = 0;\r\n");
      out.write("\t\t\t\tjQuery(this).find(\"[name=rdt_money2]\").val(\"0.00\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("            \r\n");
      out.write("        });\r\n");
      out.write("        command_row.each(function(){\r\n");
      out.write("            var money2;\r\n");
      out.write("            if(jQuery(this).find(\"[name=rdt_share2]\").val() != \"\" && parseFloat(jQuery(this).find(\"[name=rdt_share2]\").val()) != 0.0){\r\n");
      out.write("             \tmoney2 = parseFloat(jQuery(this).find(\"[name=rdt_share2]\").val())*one_twothree;\r\n");
      out.write("             \tjQuery(this).find(\"[name=rdt_money2]\").val(round2decimal(money2));\r\n");
      out.write("            }else{\r\n");
      out.write("                money2 = 0;\r\n");
      out.write("                jQuery(this).find(\"[name=rdt_money2]\").val(\"0.00\");\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        });\r\n");
      out.write("        helper_row.each(function(){\r\n");
      out.write("            var money2;\r\n");
      out.write("\t\t\tif(jQuery(this).find(\"[name=rdt_share2]\").val() != \"\" && parseFloat(jQuery(this).find(\"[name=rdt_share2]\").val()) != 0.0){\r\n");
      out.write("             \tmoney2 = parseFloat(jQuery(this).find(\"[name=rdt_share2]\").val())*one_twothree;\r\n");
      out.write("\t\t\t\tjQuery(this).find(\"[name=rdt_money2]\").val(round2decimal(money2));\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tmoney2 = 0;\r\n");
      out.write("\t\t\t\tjQuery(this).find(\"[name=rdt_money2]\").val(\"0.00\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("            //alert(jQuery(this).find(\"[name=rdt_money2]\").val() + \"   $$$$$$\");\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        jQuery(\".person_row\").each(function(index){\r\n");
      out.write("            if(index>=1){\r\n");
      out.write("                var money1 = parseFloat(jQuery(this).find(\"[name=rdt_money1]\").val());\r\n");
      out.write("                var money2 = parseFloat(jQuery(this).find(\"[name=rdt_money2]\").val());\r\n");
      out.write("                var money = round2decimal(parseFloat(money1) + parseFloat(money2));\r\n");
      out.write("                jQuery(this).find(\".total\").html(money);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<tbody id=\"Tax\"> \r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<table width=\"960\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t        <td colspan=\"12\">\r\n");
      out.write("\t\t\t            <span class=\"spanLink\" onclick=\"taxopenmodal();\"> เพิ่มรายการ</span> |\r\n");
      out.write("\t\t\t            <span class=\"spanLink\" onclick=\"deleterow();\">ลบรายการที่เลือก</span> |\r\n");
      out.write("\t\t\t            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t            <span class=\"spanLink\" onClick=\"calRewardTax();\">คำนวณเงินรางวัล</span>\r\n");
      out.write("\t\t\t        </td>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<table id=\"divideTab\" width=\"960\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t<tr class=\"TblHeaderColumn\">\r\n");
      out.write("\t\t\t    <td width=\"50\">ลำดับที่</td>\r\n");
      out.write("\t\t\t    <td width=\"40\"><input name=\"chkAll\" id=\"divideTab_chk\" type=\"checkbox\" onclick=\"chkUncheckAll('divideTab_chk')\"/></td>\r\n");
      out.write("\t\t\t    <td width=\"70\">ลำดับที่รายการ</td>\r\n");
      out.write("\t\t\t    <td width=\"150\" class=\"TblHeaderColumn\">ชื่อ-สกุล</td>\r\n");
      out.write("\t\t\t    <td width=\"150\" class=\"TblHeaderColumn\">ตำแหน่ง</td>\r\n");
      out.write("\t\t\t    <td width=\"70\" class=\"TblHeaderColumn\">ได้ในฐานะ</td>\r\n");
      out.write("\t\t\t    <td width=\"140\" class=\"TblHeaderColumn\" colspan=\"2\" align=\"Center\">จำนวนส่วน</td>\r\n");
      out.write("\t\t\t    <td width=\"140\" class=\"TblHeaderColumn\" colspan=\"2\" align=\"Center\">รายการ</td>\r\n");
      out.write("\t\t\t    <td width=\"100\" class=\"TblHeaderColumn\">รวมทั้งสิ้น</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t    <td>&nbsp;</td>\r\n");
      out.write("\t    <td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t    <td>&nbsp;</td>\r\n");
      out.write("\t    <td>\r\n");
      out.write("\t        <table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td width=\"20%\" align=\"right\" valign=\"top\" height=\"50\">หมายเหตุ :&nbsp;</td>\r\n");
      out.write("\t                <td width=\"80%\" valign=\"top\">\r\n");
      out.write("\t                    <div style=\"border-width: 1px; border-style: groove; border-color: #dcdcdc; display:none;\" >\r\n");
      out.write("\t                        1/3 ส่วน <span id=\"onethree\"></span>&nbsp; บาท ส่วนละ <span id=\"one_onethree\"></span>&nbsp; บาท เหลือเศษ <span id=\"remain_onethree\"></span>&nbsp; บาท แบ่งให้ผู้จับทั้งหมด<br/>\r\n");
      out.write("\t                        2/3 ส่วน <span id=\"twothree\"></span>&nbsp; บาท ส่วนละ <span id=\"one_twothree\"></span>&nbsp; บาท เหลือเศษ <span id=\"remain_twothree\"></span>&nbsp; บาท แบ่งให้ผู้จับทั้งหมด\r\n");
      out.write("\t                    </div>\r\n");
      out.write("\t                    <textarea rows=\"2\" cols=\"80\" name=\"remarks_tax\" id=\"remarks_tax\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rd.remarks }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t        </table>\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t    <td>&nbsp;</td>\r\n");
      out.write("\t    <td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdts[0]==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t            <span class=\"spanLink\" onclick=\"loadStaffFromView()\">ดึงรายการผู้ดำเนินการ</span> |\r\n");
        out.write("\t\t\t            ");
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
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdts}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("rdt");
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t    <tr class=\"person_row\" ");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(" >\r\n");
          out.write("\t\t\t        <td class=\"TblRow AlignCenter\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t        <td class=\"TblRow AlignCenter\">\r\n");
          out.write("\t\t\t            ");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t        </td>\r\n");
          out.write("\t\t\t        <td class=\"TblRow AlignCenter\">\r\n");
          out.write("\t\t\t        \t");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t        \t");
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t        </td>\r\n");
          out.write("\t\t\t        <input type=\"hidden\" name=\"rdt_id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t        <input type=\"hidden\" name=\"rdt_title_code\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.title_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t        <input type=\"hidden\" name=\"rdt_first_name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t        <input type=\"hidden\" name=\"rdt_last_name\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t        <input type=\"hidden\" name=\"rdt_idcard_no\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.idcard_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t        <td class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(rdt.order_seq!='1')?(rdt.full_name):(rdt.first_name)}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t        ");
          if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t        ");
          if (_jspx_meth_c_005fif_005f7(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t    </tr>\r\n");
          out.write("\t\t\t");
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
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count%2==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"background-color:#F3F3F3\"");
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
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count>1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t                <input name=\"chk1\" type=\"checkbox\"/>\r\n");
        out.write("\t\t\t            ");
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
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.order_seq=='1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t        \t\t<input type=\"hidden\" name=\"order_seq\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.order_seq}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t        \t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.order_seq}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t        \t");
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
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.order_seq > '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t        \t\t<input type=\"text\" name=\"order_seq\" size=\"1\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.order_seq}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" maxlength=\"3\" OnKeyPress=\"ChkMinusInt(this);\" />\r\n");
        out.write("\t\t\t        \t");
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
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow AlignLeft\">\r\n");
        out.write("\t\t\t\t        \t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.position_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t        \t<input type=\"hidden\" name=\"rdt_position_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.position_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow AlignLeft\" style=\"display:none\">\r\n");
        out.write("\t\t\t\t        \t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t        \t<input type=\"hidden\" name=\"rdt_staff_level\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t             <td>");
        if (_jspx_meth_c_005fif_005f6(_jspx_th_c_005fif_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t             <td>&nbsp;</td>\r\n");
        out.write("\t\t\t             <td>&nbsp;</td>\r\n");
        out.write("\t\t\t             <td>&nbsp;</td>\r\n");
        out.write("\t\t\t             <td>&nbsp;</td>\r\n");
        out.write("\t\t\t\t            <input type=\"hidden\" name=\"rdt_duty_status_id\" value=\"1\" />\r\n");
        out.write("\t\t\t\t            <input type=\"hidden\" name=\"rdt_share1\" value=\"\" />\r\n");
        out.write("\t\t\t\t            <input type=\"hidden\" name=\"rdt_share2\" value=\"\" />\r\n");
        out.write("\t\t\t\t            <input type=\"hidden\" name=\"rdt_money1\" value=\"\" />\r\n");
        out.write("\t\t\t\t            <input type=\"hidden\" name=\"rdt_money2\" value=\"\" />\r\n");
        out.write("\t\t\t            <td class=\"total\" style=\"text-align:right\">\r\n");
        out.write("\t\t\t            \t");
        if (_jspx_meth_fmt_005fformatNumber_005f0(_jspx_th_c_005fif_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t            </td>\r\n");
        out.write("\t\t\t        ");
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

  private boolean _jspx_meth_c_005fif_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.is_notice!='N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("ผู้แจ้งความ");
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

  private boolean _jspx_meth_fmt_005fformatNumber_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_005fformatNumber_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatNumber_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
    _jspx_th_fmt_005fformatNumber_005f0.setMinFractionDigits(2);
    _jspx_th_fmt_005fformatNumber_005f0.setMaxFractionDigits(2);
    _jspx_th_fmt_005fformatNumber_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.birbe_money}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatNumber_005f0 = _jspx_th_fmt_005fformatNumber_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count > 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow AlignLeft\">\r\n");
        out.write("\t\t\t\t        \t<input type=\"text\" name=\"rdt_position_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.position_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow AlignLeft\" style=\"display:none\">\r\n");
        out.write("\t\t\t\t        \t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t        \t<input type=\"hidden\" name=\"rdt_staff_level\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow\">\r\n");
        out.write("\t\t\t\t        \t");
        if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fif_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t    ");
        if (_jspx_meth_c_005fif_005f11(_jspx_th_c_005fif_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow AlignCenter\">\r\n");
        out.write("\t\t\t\t        \t<input type=\"text\" size=\"7\" name=\"rdt_share1\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.share1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textNum\" OnKeyPress=\"ChkMinusInt(this);\">\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow AlignCenter\">\r\n");
        out.write("\t\t\t\t        \t<input type=\"text\" size=\"7\" name=\"rdt_share2\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.share2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textNum\" OnKeyPress=\"ChkMinusInt(this);\">\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow AlignCenter\">\r\n");
        out.write("\t\t\t\t        \t<input type=\"text\" size=\"7\" name=\"rdt_money1\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.money1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textNum sum\" OnKeyPress=\"ChkMinusDbl(this);\">\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow AlignCenter\">\r\n");
        out.write("\t\t\t\t        \t<input type=\"text\" size=\"7\" name=\"rdt_money2\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.money2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" class=\"textNum sum\" OnKeyPress=\"ChkMinusDbl(this);\">\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t\t        <td class=\"TblRow\" style=\"text-align:right\">\r\n");
        out.write("\t\t\t\t            <div class='total'>\r\n");
        out.write("\t\t\t\t            \t");
        if (_jspx_meth_fmt_005fformatNumber_005f1(_jspx_th_c_005fif_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t            </div>\r\n");
        out.write("\t\t\t\t        </td>\r\n");
        out.write("\t\t\t        ");
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

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.duty_status_id!='2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t        <select name=\"rdt_duty_status_id\" id=\"rdt_duty_status_id\">\r\n");
        out.write("\t\t\t\t\t\t            ");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fif_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t        </select>\r\n");
        out.write("\t\t\t\t\t\t    ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty_status_list}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("duty_status");
    _jspx_th_c_005fforEach_005f1.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t            \t");
          if (_jspx_meth_c_005fif_005f9(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t            ");
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

  private boolean _jspx_meth_c_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty_status.id != '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t                \t<option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty_status.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write(' ');
        out.write(' ');
        if (_jspx_meth_c_005fif_005f10(_jspx_th_c_005fif_005f9, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write(' ');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty_status.status_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</option>\r\n");
        out.write("\t\t\t\t\t\t                ");
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

  private boolean _jspx_meth_c_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${duty_status.id==rdt.duty_status_id}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected");
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

  private boolean _jspx_meth_c_005fif_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.duty_status_id=='2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t    \t<select name=\"rdt_duty_status_id\" id=\"rdt_duty_status_id\" style=\"width:80px:\" >\r\n");
        out.write("\t\t\t\t\t\t           \t<option value=\"2\"  >ผู้จับกุม</option>\r\n");
        out.write("\t\t\t\t\t\t        </select>\r\n");
        out.write("\t\t\t\t\t\t    ");
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

  private boolean _jspx_meth_fmt_005fformatNumber_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_005fformatNumber_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatNumber_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    _jspx_th_fmt_005fformatNumber_005f1.setMinFractionDigits(2);
    _jspx_th_fmt_005fformatNumber_005f1.setMaxFractionDigits(2);
    _jspx_th_fmt_005fformatNumber_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rdt.sum_money}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatNumber_005f1 = _jspx_th_fmt_005fformatNumber_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatNumber_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f1);
    return false;
  }
}
