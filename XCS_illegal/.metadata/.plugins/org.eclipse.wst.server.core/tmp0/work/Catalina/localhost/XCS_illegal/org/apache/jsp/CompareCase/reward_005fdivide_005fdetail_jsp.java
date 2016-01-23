package org.apache.jsp.CompareCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.util.RequestUtil;
import com.ko.util.ConfigUtil;;

public final class reward_005fdivide_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substringBefore", org.apache.taglibs.standard.functions.Functions.class, "substringBefore", new Class[] {java.lang.String.class, java.lang.String.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:substringAfter", org.apache.taglibs.standard.functions.Functions.class, "substringAfter", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Templates/meta.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
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
      out.write("<script type='text/javascript' src='dwr/interface/Reports.js'></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("    var all_section;\r\n");
      out.write("    var mainthreefive;\r\n");
      out.write("    var subthreefive;\r\n");
      out.write("    var maintwofive;\r\n");
      out.write("    var subtwofive;\r\n");
      out.write("\r\n");
      out.write("    function selectLegislation(LID) {\r\n");
      out.write("\r\n");
      out.write("        mnu = document.getElementById(LID);\r\n");
      out.write("        if (mnu.value == \"1\") {\r\n");
      out.write("            document.getElementById('Alcohol').style.display = '';\r\n");
      out.write("            document.getElementById('Tobacco').style.display = 'none';\r\n");
      out.write("            document.getElementById('Tax').style.display = 'none';\r\n");
      out.write("        } else if (mnu.value == \"4\") {\r\n");
      out.write("            document.getElementById('Alcohol').style.display = 'none';\r\n");
      out.write("            document.getElementById('Tobacco').style.display = 'none';\r\n");
      out.write("            document.getElementById('Tax').style.display = '';\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function calReward() {\r\n");
      out.write("        var person_no = jQuery(\".person_row\").size() - 1;\r\n");
      out.write("        var data = window.showModalDialog('Popup/cal_divide_form.jsp?person=' + person_no, '_blank', 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=350,height=200,top=220,left=400,modal=yes');\r\n");
      out.write("        if (data) {\r\n");
      out.write("            var mapId = {};\r\n");
      out.write("            var arrest_co = data['arrest_co'];\r\n");
      out.write("            var command = data['command'];\r\n");
      out.write("            var helper = data['helper'];\r\n");
      out.write("            jQuery(\"[name=rda_duty_status_id][value!=1]\").each(function(index) {\r\n");
      out.write("                if (index > 0) {\r\n");
      out.write("                    if (arrest_co > 0) {\r\n");
      out.write("                        jQuery(this).attr('value', '3');\r\n");
      out.write("                        arrest_co--;\r\n");
      out.write("                    } else if (command > 0) {\r\n");
      out.write("                        jQuery(this).attr('value', '4');\r\n");
      out.write("                        command--;\r\n");
      out.write("                    } else if (helper > 0) {\r\n");
      out.write("                        jQuery(this).attr('value', '5');\r\n");
      out.write("                        helper--;\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(\"error out of index at \" + index);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            mapId = calDescription();\r\n");
      out.write("            // manage arrest\r\n");
      out.write("            var arrest_row = jQuery(\".person_row\").has(\"[name=rda_duty_status_id][value=2]\");\r\n");
      out.write("            var row_id = arrest_row.attr('id');\r\n");
      out.write("            var arrest_idcard_no = arrest_row.find(\"[name=rda_idcard_no]\").attr('value');\r\n");
      out.write("            var multiple = mapId[arrest_idcard_no];\r\n");
      out.write("            var arrest_reward = round2remain((parseFloat(mainthreefive) + parseFloat(subthreefive)) + (multiple * parseFloat(maintwofive)) + parseFloat(subtwofive));\r\n");
      out.write("            arrest_row.find(\"[name=arrest]\").attr('value', arrest_reward);\r\n");
      out.write("            arrest_row.find(\".total\").html(arrest_reward);\r\n");
      out.write("\r\n");
      out.write("            var arrest_co_row = jQuery(\".person_row\").has(\"[name=rda_duty_status_id][value=3]\");\r\n");
      out.write("            arrest_co_row.each(function() {\r\n");
      out.write("                var arrest_co_row = jQuery(this);\r\n");
      out.write("                var arrest_co_idcard_no = arrest_co_row.find(\"[name=rda_idcard_no]\").attr('value');\r\n");
      out.write("                var multiple = mapId[arrest_co_idcard_no];\r\n");
      out.write("                var arrest_co_reward = round2decimal(parseFloat(mainthreefive) + (multiple * parseFloat(maintwofive)));\r\n");
      out.write("                arrest_co_row.find(\"[name=arrest_co]\").attr('value', arrest_co_reward);\r\n");
      out.write("                arrest_co_row.find(\"[name=arrest]\").attr('value', 0);\r\n");
      out.write("                arrest_co_row.find(\"[name=command]\").attr('value', 0);\r\n");
      out.write("                arrest_co_row.find(\"[name=helper]\").attr('value', 0);\r\n");
      out.write("                arrest_co_row.find(\".total\").html(arrest_co_reward);\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            var command_row = jQuery(\".person_row\").has(\"[name=rda_duty_status_id][value=4]\");\r\n");
      out.write("            command_row.each(function() {\r\n");
      out.write("                var command_row = jQuery(this);\r\n");
      out.write("                var command_idcard_no = command_row.find(\"[name=rda_idcard_no]\").attr('value');\r\n");
      out.write("                var multiple = mapId[command_idcard_no];\r\n");
      out.write("                var command_reward = round2decimal(multiple * maintwofive);\r\n");
      out.write("                command_row.find(\"[name=command]\").attr('value', command_reward);\r\n");
      out.write("                command_row.find(\"[name=arrest]\").attr('value', 0);\r\n");
      out.write("                command_row.find(\"[name=arrest_co]\").attr('value', 0);\r\n");
      out.write("                command_row.find(\"[name=helper]\").attr('value', 0);\r\n");
      out.write("                command_row.find(\".total\").html(command_reward);\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            var helper_row = jQuery(\".person_row\").has(\"[name=rda_duty_status_id][value=5]\");\r\n");
      out.write("            helper_row.each(function() {\r\n");
      out.write("                var helper_row = jQuery(this);\r\n");
      out.write("                var command_idcard_no = helper_row.find(\"[name=rda_idcard_no]\").attr('value');\r\n");
      out.write("                var multiple = mapId[command_idcard_no];\r\n");
      out.write("                var helper_reward = round2decimal(multiple * maintwofive);\r\n");
      out.write("                helper_row.find(\"[name=helper]\").attr('value', helper_reward);\r\n");
      out.write("                helper_row.find(\"[name=arrest]\").attr('value', 0);\r\n");
      out.write("                helper_row.find(\"[name=arrest_co]\").attr('value', 0);\r\n");
      out.write("                helper_row.find(\"[name=command]\").attr('value', 0);\r\n");
      out.write("                helper_row.find(\".total\").html(helper_reward);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    function round2decimal(money){\r\n");
      out.write("        //alert(money);\r\n");
      out.write("        if(String(money).indexOf('.')>0){\r\n");
      out.write("            var tmp = String(money).split('.',2);\r\n");
      out.write("            if(tmp[1].length>2){\r\n");
      out.write("                tmp[1] = tmp[1].substring(0,2);\r\n");
      out.write("            }\r\n");
      out.write("            if(tmp[1].length<2){\r\n");
      out.write("                tmp[1] += '0';\r\n");
      out.write("            }\r\n");
      out.write("            return String(tmp[0]+'.'+tmp[1]);\r\n");
      out.write("        }else{\r\n");
      out.write("            return String(money)+'.00';\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function round2remain(money){\r\n");
      out.write("        if(String(money).indexOf('.')>0){\r\n");
      out.write("            var tmp = String(money).split('.',2);\r\n");
      out.write("            if(tmp[1].length>3){\r\n");
      out.write("                tmp[1] = tmp[1].substring(0,3);\r\n");
      out.write("                tmp[1] = tmp[1].substring(0,2)+'.'+tmp[1].charAt(2);\r\n");
      out.write("                tmp[1] = Math.round(tmp[1]);\r\n");
      out.write("                if(String(tmp[1]).length<2){\r\n");
      out.write("                    tmp[1] = '0'+tmp[1];\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            if(String(tmp[1]).length<2){\r\n");
      out.write("                tmp[1] += '0';\r\n");
      out.write("            }\r\n");
      out.write("            return String(tmp[0]+'.'+tmp[1]);\r\n");
      out.write("        }else{\r\n");
      out.write("            return String(money)+'.00';\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function calDescription(init) {\r\n");
      out.write("        var reward = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.reward_money}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("        var threefive = (reward * 3) / 5;\r\n");
      out.write("        var twofive = reward - threefive;\r\n");
      out.write("        var arrest = 1;\r\n");
      out.write("        var arrest_co = jQuery(\"[name=rda_duty_status_id][value=3]\").size();\r\n");
      out.write("        var command = jQuery(\"[name=rda_duty_status_id][value=4]\").size();\r\n");
      out.write("        var help_by = jQuery(\"[name=rda_duty_status_id][value=5]\").size();\r\n");
      out.write("        \r\n");
      out.write("        mainthreefive = round2decimal(threefive / (arrest + arrest_co));\r\n");
      out.write("        subthreefive = round2remain(threefive - (mainthreefive * (arrest + arrest_co)));\r\n");
      out.write("        jQuery(\"#threefivemain\").html(mainthreefive);\r\n");
      out.write("        jQuery(\"#threefivesub\").html(subthreefive);\r\n");
      out.write("        \r\n");
      out.write("        document.getElementById(\"remarks_al\").value = \"3/5 ของเงินรางวัลคิดเป็นส่วนละ \" + mainthreefive + \" บาท เหลือเศษ \" + subthreefive + \" บาท แบ่งให้ผู้จับทั้งหมด\\n\";\r\n");
      out.write("        all_section = 0;\r\n");
      out.write("        var mapId = {};\r\n");
      out.write("        jQuery(\"[name=rda_duty_status_id][value!=1] ~ [name=rda_idcard_no]\").each(function(index) {\r\n");
      out.write("            //Reward_divide.getShare_qty(jQuery(this).attr('value'), {callback:setQty, async:false});\r\n");
      out.write("            jQuery.ajax({\r\n");
      out.write("                url:'process?action=Reward_divide&cmd=getShareQty&idcard_no=' + jQuery(this).attr('value'),\r\n");
      out.write("                async:false,\r\n");
      out.write("                success: function(data) {\r\n");
      out.write("                    var val = data.split(',', 2);\r\n");
      out.write("                    all_section = all_section + parseInt(val[1]);\r\n");
      out.write("                    mapId[val[0]] = parseInt(val[1]);\r\n");
      out.write("                    //alert(mapId[jQuery(this).attr('value')]);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        maintwofive = round2decimal(twofive / all_section);\r\n");
      out.write("        subtwofive = round2remain(twofive - (maintwofive * all_section));\r\n");
      out.write("        jQuery(\"#twofivemain\").html(maintwofive);\r\n");
      out.write("        jQuery(\"#twofivesub\").html(subtwofive);\r\n");
      out.write("        document.getElementById(\"remarks_al\").value += \"2/5 ของเงินรางวัลคิดเป็นส่วนละ \" + maintwofive + \" บาท เหลือเศษ \" + subtwofive + \" บาท แบ่งให้ผู้จับทั้งหมด\";\r\n");
      out.write("        \r\n");
      out.write("        return mapId;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    function deleterow() {\r\n");
      out.write("        jQuery(\".person_row:has(:checked)\").remove();\r\n");
      out.write("        jQuery(\".person_row\").each(function(index) {\r\n");
      out.write("            var i = index + 1;\r\n");
      out.write("            var row = jQuery(this);\r\n");
      out.write("            row.attr('id', 'person_row_' + i);\r\n");
      out.write("            row.find('td').first().html(i);\r\n");
      out.write("            row.find('td > [name=order_seq]').attr('value', i);\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function printReport(){\r\n");
      out.write("        var reward_money = document.dataform.reward_money.value;\r\n");
      out.write("        var sum_reward = 0;\r\n");
      out.write("        jQuery(\".sum\").each(function(index) {\r\n");
      out.write("            var i = jQuery(this).attr('value').toString();\r\n");
      out.write("            if (i != '') {\r\n");
      out.write("                sum_reward = (parseFloat(sum_reward) + parseFloat(i)).toFixed(2);\r\n");
      out.write("                //alert(sum_reward);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        //alert(parseFloat(sum_reward) + \"  \" + parseFloat(reward_money));\r\n");
      out.write("        if(parseFloat(sum_reward) == parseFloat(reward_money)){\r\n");
      out.write("            if(document.dataform.legislation_id.value=='");
      out.print(ConfigUtil.getConfig("legislation_alcohol"));
      out.write("')\r\n");
      out.write("                printReports('ILL_P035&getDivideNo='+document.dataform.divide_no.value+'&time=");
      out.print(new java.util.Date().getTime());
      out.write("');\r\n");
      out.write("            else \r\n");
      out.write("                printReports('ILL_P035_1&getDivideNo='+document.dataform.divide_no.value+'&time=");
      out.print(new java.util.Date().getTime());
      out.write("');\r\n");
      out.write("        }\r\n");
      out.write("        else{\r\n");
      out.write("            alert(\"กรุณาใส่จำนวนเงินรางวัลให้ตรงกับจำนวนรวมที่แบ่ง\");\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function chkUncheckAll(prefix) {\r\n");
      out.write("        if (jQuery(\"#\" + prefix).first().attr('checked')) {\r\n");
      out.write("            jQuery(\"input[name=chk1]\").attr('checked', true);\r\n");
      out.write("        } else {\r\n");
      out.write("            jQuery(\"input[name=chk1]\").attr('checked', false);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\tfunction clickBack(){\r\n");
      out.write("\t\tvar ans = confirm(\"ยืนยันการกลับหน้าค้นหา\");\r\n");
      out.write("\t\tif(ans){\r\n");
      out.write("\t\t\twriteTranLog('กลับหน้าค้นหา');\r\n");
      out.write("\t\t\twindow.location.href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction clickCancel(){\r\n");
      out.write("\t\tvar ans = confirm(\"ยืนยันการยกเลิกการแก้ไข\");\r\n");
      out.write("\t\tif(ans){\r\n");
      out.write("\t\t\twriteTranLog('ยกเลิกการแก้ไขข้อมูลใบนำส่งของกลางเพื่อจัดเก็บ');\r\n");
      out.write("\t\t\twindow.location.href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" name=\"dataform\" action=\"process?action=Reward_divide&cmd=create\">\r\n");
      out.write("<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td width=\"100%\" align=\"left\" valign=\"top\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("    <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("    <td width=\"99%\"><span class=\"websitename\">แบ่งเงินสินบนรางวัล</span></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td height=\"25\">&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <input name=\"btnSave\" type=\"submit\" class=\"barbutton\" value=\"บันทึก\">\r\n");
      out.write("        <input name=\"btnCancel\" type=\"button\" class=\"barbutton\" value=\"ยกเลิกการแก้ไข\"\r\n");
      out.write("               onclick=\"clickCancel();\">\r\n");
      out.write("        <input name=\"btnBack\" type=\"button\" class=\"barbutton\" value=\"กลับหน้าค้นหา\"\r\n");
      out.write("               onClick=\"clickBack();\">\r\n");
      out.write("        <input name=\"btnPrint\" type=\"button\" class=\"barbutton\" value=\"พิมพ์\"\r\n");
      out.write("               onClick=\"printReport();\">\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>\r\n");
      out.write("        <table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"20%\" align=\"right\">วันที่แบ่งเงินรางวัล :&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\">\r\n");
      out.write("                    <input name=\"update\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${update}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    <input name=\"rd_id\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    <input name=\"com_id\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.cc_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\r\n");
      out.write("                    <input name=\"divide_date\" class=\"textdate\" readonly id=\"divide_date\"\r\n");
      out.write("                           value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("\" type=\"text\"\r\n");
      out.write("                           size=\"10\" maxlength=\"10\">\r\n");
      out.write("                    <a href=\"javascript:NewCssCal('divide_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\"\r\n");
      out.write("                                                                                   width=\"19\" height=\"19\" align=\"middle\"\r\n");
      out.write("                                                                                   style=\"border-style: none\"/></a>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td width=\"20%\" align=\"right\">เลขที่งาน :&nbsp;</td>\r\n");
      out.write("                <td width=\"30%\"><input name=\"divide_no\"\r\n");
      out.write("                                       value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(rd.divide_no!=null&&rd.divide_no!='')?(rd.divide_no):(divide_no)}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("                                       type=\"text\" size=\"30\" maxlength=\"30\" class=\"textview\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\">วันที่รับเงินรางวัล :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\">\r\n");
      out.write("                    <input name=\"receive_date\" id=\"receive_date\" class=\"textdate\" type=\"text\" size=\"10\" maxlength=\"10\" readonly\r\n");
      out.write("                           value=\"");
      if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("                    <a href=\"javascript:NewCssCal('receive_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\"\r\n");
      out.write("                                                                                   width=\"19\" height=\"19\" align=\"middle\"\r\n");
      out.write("                                                                                   style=\"border-style: none\"/></a>\r\n");
      out.write("                    <font style=\"color:red\">*</font>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\">คดีเปรียบเทียบที่ :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input name=\"compare_case_no\" align=\"right\" type=\"text\" size=\"5\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:substringBefore(db.compare_case_no,'/')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\" readonly class=\"textreadonly\">&nbsp;&nbsp;\r\n");
      out.write("                    /&nbsp;&nbsp;<input name=\"compare_case_no\" align=\"right\" type=\"text\" size=\"5\"\r\n");
      out.write("                                        value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:substringAfter(db.compare_case_no,'/')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
      out.write("\" readonly\r\n");
      out.write("                                        class=\"textreadonly\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td align=\"right\">วันที่เปรียบเทียบ :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input name=\"compare_case_date\" class=\"textdate\" readonly type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.compare_case_date2}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td height=\"25\" align=\"right\">พ.ร.บ. :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"hidden\" name=\"legislation_id\" id=\"legislation_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    <input type=\"hidden\" name=\"legislation_code\" id=\"legislation_code\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                    <span class=\"textreadonly\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td align=\"right\">หน่วยงาน :&nbsp;</td>\r\n");
      out.write("                <td><input name=\"offname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.offname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" size=\"30\" maxlength=\"30\" class=\"textview\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\">เงินค่าปรับ :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input name=\"fine_money\" type=\"text\" size=\"30\" maxlength=\"30\" class=\"textViewNum\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.fine_money }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"background-color:#CCCCFF;\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td align=\"right\">ผู้กล่าวโทษ :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input name=\"accuser_name\" type=\"text\" size=\"30\" maxlength=\"30\" class=\"textview\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\">เงินสินบน :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input name=\"birbe_money\" type=\"text\" size=\"30\" maxlength=\"30\" class=\"textViewNum\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.birbe_money }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </td>\r\n");
      out.write("                <td align=\"right\">ผู้ต้องหา :&nbsp;</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <!-- span class=\"textreadonly\" width=\"30\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span -->\r\n");
      out.write("                    <input name=\"lawbreaker_name\" type=\"text\" size=\"30\"  class=\"textview\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreaker_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\">เงินรางวัล :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\">\r\n");
      out.write("                    <input name=\"reward_money\" type=\"text\" size=\"30\" maxlength=\"30\" class=\"textViewNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.reward_money }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td align=\"right\">เงินส่งคลัง :&nbsp;</td>\r\n");
      out.write("                <td colspan=\"3\">\r\n");
      out.write("                    <input name=\"treasury_money\" type=\"text\" size=\"30\" maxlength=\"30\" class=\"textViewNum\"\r\n");
      out.write("                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.treasury_money }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("    <td>&nbsp;</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("    var frmvalidator = new Validator(\"dataform\");\r\n");
      out.write("    frmvalidator.addValidation(\"receive_date\", \"req\", \"กรุณากรอกวันที่รับเงินรางวัล\");\r\n");
      out.write("    frmvalidator.setAddnlValidationFunction(\"DoCustomValidation\");\r\n");
      out.write("    function DoCustomValidation()\r\n");
      out.write("    {\r\n");
      out.write("        var frm = document.forms[\"dataform\"];\r\n");
      out.write("        var reward_money = frm.reward_money.value;\r\n");
      out.write("        var sum_reward = 0;\r\n");
      out.write("        jQuery(\".sum\").each(function(index) {\r\n");
      out.write("            var i = jQuery(this).attr('value');\r\n");
      out.write("            if (i != '') {\r\n");
      out.write("                sum_reward += parseFloat(i);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        var order_seq_dup = false;\r\n");
      out.write("        var order_empty = false;\r\n");
      out.write("        jQuery(\"[name=order_seq]\").each(function(index) {\r\n");
      out.write("            var val = jQuery(this).attr('value');\r\n");
      out.write("            if (jQuery(\"[name=order_seq][value=\" + val + \"]\").size() > 1) {\r\n");
      out.write("                order_seq_dup = true;\r\n");
      out.write("            }\r\n");
      out.write("            if (String(val).indexOf(\".\") >= 0)\r\n");
      out.write("                order_empty = true;\r\n");
      out.write("            if (val == '') {\r\n");
      out.write("                order_empty = true;\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("        if (order_seq_dup) {\r\n");
      out.write("            sfm_show_error_msg('มีลำดับที่ซ้ำกัน');\r\n");
      out.write("        }\r\n");
      out.write("        if (order_empty) {\r\n");
      out.write("            sfm_show_error_msg('ค่าลำดับไม่ถูกต้อง');\r\n");
      out.write("        }\r\n");
      out.write("        if (order_empty || order_seq_dup) {\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function calMoneyByStaff(){\r\n");
      out.write("    \tif(document.dataform.legislation_id.value=='");
      out.print(ConfigUtil.getConfig("legislation_alcohol"));
      out.write("'){\r\n");
      out.write("\t\t\tfor(var i=0; i < document.dataform.order_seq.length;i++){\r\n");
      out.write("\t\t\t\tif(i>=1){\r\n");
      out.write("\t\t\t\t\tvar arrest = (document.dataform.arrest[i].value != \"\" ? parseFloat(document.dataform.arrest[i].value) : \"0\");\r\n");
      out.write("\t\t\t\t\tvar arrest_co = (document.dataform.arrest_co[i].value != \"\" ? parseFloat(document.dataform.arrest_co[i].value) : \"0\");\r\n");
      out.write("\t\t\t\t\tvar command = (document.dataform.command[i].value != \"\" ? parseFloat(document.dataform.command[i].value) : \"0\");\r\n");
      out.write("\t\t\t\t\tvar helper = (document.dataform.helper[i].value != \"\" ? parseFloat(document.dataform.helper[i].value) : \"0\");\r\n");
      out.write("\t\t            var total = document.dataform.total_al[i-1];\r\n");
      out.write("\t\t        \ttotal.value = parseFloat(arrest) + parseFloat(arrest_co) + parseFloat(command) + parseFloat(helper);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("    \t}else{\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t");
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
    _jspx_th_c_005furl_005f0.setValue("process?action=Reward_divide&cmd=listAmm");
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
    _jspx_th_c_005furl_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rd.divide_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f1.setParent(null);
    _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rd.receive_date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_fmt_005fformatDate_005f1.setPattern("dd/MM/yyyy");
    int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_code=='90'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "reward_divide_alcohol.jsp", out, false);
        out.write('\r');
        out.write('\n');
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
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_code=='00'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "reward_divide_tax.jsp", out, false);
        out.write('\r');
        out.write('\n');
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
