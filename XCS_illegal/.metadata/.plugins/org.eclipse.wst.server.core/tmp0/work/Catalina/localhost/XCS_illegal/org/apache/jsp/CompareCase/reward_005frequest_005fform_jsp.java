package org.apache.jsp.CompareCase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import com.ko.webapp.util.RequestUtil;
import com.ko.util.NumberUtil;

public final class reward_005frequest_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Templates/meta.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">\r\n");
      out.write("\tfunction convertNumber(){\r\n");
      out.write("\t\tvar lID = document.getElementById(\"legislation_id\").value;\r\n");
      out.write("\r\n");
      out.write("\t\tif(lID == \"1\"){\r\n");
      out.write("\t\t\tdocument.getElementById('alFineText').innerHTML = getThaiBaht(document.getElementById('al_fine').value);\r\n");
      out.write("\t\t\tdocument.getElementById('alBirbeText').innerHTML = getThaiBaht(document.getElementById('al_bribe_money').value);\r\n");
      out.write("\t\t\tdocument.getElementById('alRewardText').innerHTML = getThaiBaht(document.getElementById('al_reward_money').value);\r\n");
      out.write("\t\t}else if(lID == \"2\"){\r\n");
      out.write("\t\t\tdocument.getElementById('toFineText').innerHTML = getThaiBaht(document.getElementById('to_fine').value);\r\n");
      out.write("\t\t\tdocument.getElementById('toRewardText').innerHTML = getThaiBaht(document.getElementById('to_reward_money').value);\r\n");
      out.write("\t\t}else if(lID == \"4\"){\r\n");
      out.write("\t\t\tdocument.getElementById('taFineText').innerHTML = getThaiBaht(document.getElementById('ta_fine').value);\r\n");
      out.write("\t\t\tdocument.getElementById('taBirbeText').innerHTML = getThaiBaht(document.getElementById('ta_birbe_money').value);\r\n");
      out.write("\t\t\tdocument.getElementById('taRewardText').innerHTML = getThaiBaht(document.getElementById('ta_reward_money').value);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("    function selectLegislation(LID) {\r\n");
      out.write("\r\n");
      out.write("        mnu = document.getElementById(LID);\r\n");
      out.write("        if (mnu.value == 1) {\r\n");
      out.write("            document.getElementById('Alcohol').style.display = '';\r\n");
      out.write("            document.getElementById('Tobacco').style.display = 'none';\r\n");
      out.write("            document.getElementById('Tax').style.display = 'none';\r\n");
      out.write("        } else if (mnu.value == 2) {\r\n");
      out.write("            document.getElementById('Alcohol').style.display = 'none';\r\n");
      out.write("            document.getElementById('Tobacco').style.display = '';\r\n");
      out.write("            document.getElementById('Tax').style.display = 'none';\r\n");
      out.write("        } else if (mnu.value == \"92\") {\r\n");
      out.write("            document.getElementById('Alcohol').style.display = 'none';\r\n");
      out.write("            document.getElementById('Tobacco').style.display = 'none';\r\n");
      out.write("            document.getElementById('Tax').style.display = 'none';\r\n");
      out.write("        } else if (mnu.value == 4) {\r\n");
      out.write("            document.getElementById('Alcohol').style.display = 'none';\r\n");
      out.write("            document.getElementById('Tobacco').style.display = 'none';\r\n");
      out.write("            document.getElementById('Tax').style.display = '';\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function changeForm(ccid) {\r\n");
      out.write("        addCompareCaseInformation(ccid);\r\n");
      out.write("        addTeam(ccid, 3, 'coArrestBody');\r\n");
      out.write("        addTeam(ccid, 4, 'commanderBody');\r\n");
      out.write("    }\r\n");
      out.write("    function addCompareCaseInformation(ccid){\r\n");
      out.write("        jQuery.ajax({\r\n");
      out.write("            url:'process?action=Ajax&cmd=getCompareCaseApplicationRewardReq&ccid=' + ccid ,\r\n");
      out.write("            async:false,\r\n");
      out.write("            success: function(data) {\r\n");
      out.write("                data = data.replace(/null/ig,'\\\"\\\"');\r\n");
      out.write("                var ccdata = eval('(' + data + ')');\r\n");
      out.write("                jQuery(\"[name=compare_case_id]\").val(ccdata[0]['id']);\r\n");
      out.write("                jQuery(\"[name=compare_case_no]\").val(ccdata[0]['compare_case_no']);\r\n");
      out.write("                jQuery(\"[name=compare_case_date]\").val(ccdata[0]['compare_case_date']);\r\n");
      out.write("                jQuery(\"[name=lawbreaker_name]\").val(ccdata[0]['lawbreaker_name']);\r\n");
      out.write("                jQuery(\"[name=accuser_name]\").val(ccdata[0]['accuser_name']);\r\n");
      out.write("                jQuery(\"[name=guilt_base]\").val(ccdata[0]['guilt_base']);\r\n");
      out.write("                jQuery(\"[name=case_law_id]\").val(ccdata[0]['case_law_id']);\r\n");
      out.write("                jQuery(\"[name=penalty_case_law_id]\").val(ccdata[0]['penalty_case_law_id']);\r\n");
      out.write("                jQuery(\"[name=scene_addr]\").val(ccdata[0]['scene_addr']);\r\n");
      out.write("                jQuery(\"[name=prove_name]\").val(ccdata[0]['prove_name']);\r\n");
      out.write("                jQuery(\"[name=pospname]\").val(ccdata[0]['pospname']);\r\n");
      out.write("                jQuery(\"[name=sue_name]\").val(ccdata[0]['sue_name']);\r\n");
      out.write("                jQuery(\"[name=possname]\").val(ccdata[0]['possname']);\r\n");
      out.write("\t\t\t\t//สุรา\r\n");
      out.write("                jQuery(\"[name=al_fine]\").val(ccdata[0]['fine_case']);\r\n");
      out.write("                jQuery(\"[name=al_bribe_money]\").val(ccdata[0]['bribe_money']);\r\n");
      out.write("                jQuery(\"[name=al_reward_money]\").val(ccdata[0]['reward_money']);\r\n");
      out.write("                jQuery('[name=al_staff_name_arrest]').val(ccdata[0]['accuser_name']);\r\n");
      out.write("                jQuery('[name=al_staff_id_arrest]').val(ccdata[0]['aa_idcard_no']);\r\n");
      out.write("                jQuery('[name=al_poscode_arrest]').val(ccdata[0]['aa_poscode']);\r\n");
      out.write("                jQuery('[name=al_offcode_arrest]').val(ccdata[0]['aa_offcode']);\r\n");
      out.write("                jQuery('[name=al_posname_arrest]').val(ccdata[0]['posaname']);\r\n");
      out.write("                jQuery('[name=al_offname_arrest]').val(ccdata[0]['aa_offname']);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//ยาสูบ\r\n");
      out.write("\t\t\t\tjQuery('[name=to_staff_name_arrest]').val(ccdata[0]['accuser_name']);\r\n");
      out.write("\t\t\t\tjQuery('[name=to_staff_id_arrest]').val(ccdata[0]['aa_idcard_no']);\r\n");
      out.write("\t\t\t\tjQuery('[name=to_poscode_arrest]').val(ccdata[0]['aa_poscode']);\r\n");
      out.write("\t\t\t\tjQuery('[name=to_offcode_arrest]').val(ccdata[0]['aa_offcode']);\r\n");
      out.write("\t\t\t\tjQuery('[name=to_posname_arrest]').val(ccdata[0]['posaname']);\r\n");
      out.write("\r\n");
      out.write("                jQuery('[name=staff_id_request]').val(ccdata[0]['aa_idcard_no']);\r\n");
      out.write("                jQuery('[name=staff_name_request]').val(ccdata[0]['accuser_name']);\r\n");
      out.write("                jQuery('[name=poscode_request]').val(ccdata[0]['aa_poscode']);\r\n");
      out.write("                jQuery('[name=staff_posname_request]').val(ccdata[0]['posaname']);\r\n");
      out.write("                jQuery('[name=notice_no]').val(ccdata[0]['notice_no']);\r\n");
      out.write("                jQuery('[name=staff_posname_receive]').val(ccdata[0]['staff_posname_receive']);\r\n");
      out.write("                jQuery('[name=poscode_receive]').val(ccdata[0]['poscode_receive']);\r\n");
      out.write("                jQuery('[name=staff_id_receive]').val(ccdata[0]['staff_id_receive']);\r\n");
      out.write("                jQuery('[name=staff_name_receive]').val(ccdata[0]['staff_name_receive']);\r\n");
      out.write("                jQuery('[name=inform_name]').val(ccdata[0]['inform_name']);\r\n");
      out.write("                jQuery('[name=receive_time]').val(ccdata[0]['receive_time']);\r\n");
      out.write("                jQuery('[name=receive_date]').val(ccdata[0]['receive_date']);\r\n");
      out.write("\r\n");
      out.write("                var legislation_id = jQuery('[name=legislation_id]').val();\r\n");
      out.write("                if(legislation_id == 4){\r\n");
      out.write("\t\t\t\t\tjQuery('[name=txtProductGroupName]').val(ccdata[0]['group_name']);\r\n");
      out.write("                    jQuery('[name=txtAccuserName]').val(ccdata[0]['accuser_name']);\r\n");
      out.write("                    jQuery('[name=txtAccuserPosname]').val(ccdata[0]['posaname']);\r\n");
      out.write("                    jQuery('[name=txtOccurrenceDate]').val(ccdata[0]['occurrence_date']);\r\n");
      out.write("                    jQuery('[name=ta_fine]').val(ccdata[0]['fine_case']);\r\n");
      out.write("                    jQuery('[name=ta_birbe_money]').val(ccdata[0]['bribe_money']);\r\n");
      out.write("                    jQuery('[name=ta_reward_money]').val(ccdata[0]['reward_money']);\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    addTaxItems(ccdata[0]['track_no'],'exhibit_item');\r\n");
      out.write("                    addTeam(ccdata[0]['id'], 5, 'helperBody');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    function addTaxItems(track_no, table_name){\r\n");
      out.write("        jQuery.ajax({\r\n");
      out.write("            url:'process?action=Ajax&cmd=getApplicationArrestExhibitItems&track_no=' + track_no ,\r\n");
      out.write("            async:false,\r\n");
      out.write("            success: function(data) {\r\n");
      out.write("                data = data.replace(/null/ig,'\\\"\\\"');\r\n");
      out.write("                var ccdata = eval('(' + data + ')');\r\n");
      out.write("                var tab = jQuery('#' + table_name);\r\n");
      out.write("                var base = jQuery(\"#\" + table_name + \" > tr \").size() + 1;\r\n");
      out.write("\t\t\t\tfor(i = 0; i < ccdata.length; i++){\r\n");
      out.write("\t\t\t\t\tif (jQuery(\"[name=\" + table_name + \"_duty_code][value=\" + ccdata[i]['duty_code'] + \"]\").size() > 0) {\r\n");
      out.write("\r\n");
      out.write("                    } else {\r\n");
      out.write("                    \tvar row = jQuery(\"<tr />\").attr({id:table_name + '_row_' + (base + i)});\r\n");
      out.write("    \t\t\t\t\trow.append(jQuery(\"<td /\").html(ccdata[i][\"duty_name\"]));\r\n");
      out.write("    \t\t\t\t\trow.append(jQuery(\"<input />\").attr({type:'text',n_ame:table_name + '_duty_code',value:ccdata[i]['duty_code']}));\r\n");
      out.write("\r\n");
      out.write("    \t\t\t\t\ttab.append(row);\r\n");
      out.write("                    }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function addTeam(ccid, duty_status_id, table_name) {\r\n");
      out.write("        jQuery.ajax({\r\n");
      out.write("            url:'process?action=Ajax&cmd=getStaffTeamByCompareCase&ccid=' + ccid + '&duty_status_id=' + duty_status_id,\r\n");
      out.write("            async:false,\r\n");
      out.write("            success: function(data) {\r\n");
      out.write("                var teamList = eval('(' + data + ')');\r\n");
      out.write("                var tab = jQuery('#' + table_name);\r\n");
      out.write("                var base = jQuery(\"#\" + table_name + \" > tr \").size() + 1;\r\n");
      out.write("                for (i = 0; i < teamList.length; i++) {\r\n");
      out.write("                    if (jQuery(\"[name=\" + table_name + \"_idcard_no][value=\" + teamList[i]['idcard_no'] + \"]\").size() > 0) {\r\n");
      out.write("\r\n");
      out.write("                    } else {\r\n");
      out.write("                        var row = jQuery(\"<tr />\").attr({id:table_name + '_row_' + (base + i)});\r\n");
      out.write("                        row.append(jQuery(\"<td />\").addClass('TblRow AlignCenter').html(base + i));\r\n");
      out.write("                        row.append(jQuery(\"<td />\").addClass('TblRow AlignCenter').append(jQuery(\"<input />\").attr({type:'checkbox'})));\r\n");
      out.write("                        row.append(jQuery(\"<td />\").html(teamList[i]['full_name']));\r\n");
      out.write("                        row.append(jQuery(\"<td />\").html(teamList[i]['posname'] + ' ' + teamList[i]['staff_level']));\r\n");
      out.write("                        row.append(jQuery(\"<input />\").attr({type:'hidden',n_ame:table_name + '_id',value:''}));\r\n");
      out.write("                        row.append(jQuery(\"<input />\").attr({type:'hidden',n_ame:table_name + '_idcard_no',value:teamList[i]['idcard_no']}));\r\n");
      out.write("                        row.append(jQuery(\"<input />\").attr({type:'hidden',n_ame:table_name + '_poscode',value:teamList[i]['poscode']}));\r\n");
      out.write("                        row.append(jQuery(\"<input />\").attr({type:'hidden',n_ame:table_name + '_offcode',value:teamList[i]['offcode']}));\r\n");
      out.write("                        row.append(jQuery(\"<input />\").attr({type:'hidden',n_ame:table_name + '_level',value:teamList[i]['staff_level']}));\r\n");
      out.write("                        tab.append(row);\r\n");
      out.write("                        tab.html(tab.html().replace(/n_ame/g, 'name'));\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    function chkUncheckAll(prefix) {\r\n");
      out.write("        if (jQuery(\"#\" + prefix).first().attr('checked')) {\r\n");
      out.write("            jQuery(\"input[name^='\" + prefix + \"']\").attr('checked', true);\r\n");
      out.write("        } else {\r\n");
      out.write("            jQuery(\"input[name^='\" + prefix + \"']\").attr('checked', false);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function aatopenmodal(myTable)\r\n");
      out.write("    {\r\n");
      out.write("        var data = window.showModalDialog('process?action=Divide_staff_poplist', self, 'dialogWidth=700px,Height=400px');\r\n");
      out.write("        var rowIndex = jQuery(\"tbody#\" + myTable + \" > tr\").size();\r\n");
      out.write("\r\n");
      out.write("        if (data) {\r\n");
      out.write("            for (var i = 0; i < data.length; i++) {\r\n");
      out.write("                if (jQuery(\"input[name='\" + myTable + \"_idcard_no'][value='\" + data[i][5] + \"']\").size() > 0) {\r\n");
      out.write("                    //alert(\"dupplicated offcode \");\r\n");
      out.write("                } else {\r\n");
      out.write("                    var paramMap = {\r\n");
      out.write("                        '_idcard_no':data[i][5],\r\n");
      out.write("                        '_poscode':data[i][6],\r\n");
      out.write("                        '_offcode':data[i][7],\r\n");
      out.write("                        '_level':data[i][13],\r\n");
      out.write("                        '_id':''\r\n");
      out.write("                    };\r\n");
      out.write("                    var inputRow = \"\";\r\n");
      out.write("                    jQuery.each(paramMap, function(key, value) {\r\n");
      out.write("                        //alert(myTable + key);\r\n");
      out.write("                        inputRow = inputRow + '<input type=\"hidden\" name=\"' + myTable + key + '\" value=\"' + value + '\" />';\r\n");
      out.write("                    });\r\n");
      out.write("                    rowIndex = rowIndex + 1;\r\n");
      out.write("                    var index = '<td class=\"TblRow AlignCenter\">' + rowIndex + '</td>';\r\n");
      out.write("                    var box = '<td class=\"TblRow AlignCenter\"><input name=\"chk' + myTable + rowIndex + '\" type=\"checkbox\"/>' +\r\n");
      out.write("                            inputRow + '</td>';\r\n");
      out.write("                    var name = '<td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">' + data[i][\"9\"] + '</td>';\r\n");
      out.write("                    var pos = '<td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">' + data[i][\"3\"] + '</td>';\r\n");
      out.write("                    var row = index + box + name + pos;\r\n");
      out.write("                    //window.opener.jQuery(\"#\"+tableName).last().append(\"<tr>\"+ row +\"</tr>\");\r\n");
      out.write("                    jQuery(\"#\" + myTable).first().append(\"<tr id=\\\"\" + myTable + rowIndex + \"\\\">\" + row + \"</tr>\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        } else {\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function aatget_check_value(tableName)\r\n");
      out.write("    {\r\n");
      out.write("        jQuery(\"#\" + tableName + \" tr\").has(\"td > input:checked\").remove();\r\n");
      out.write("        // rerun index of row\r\n");
      out.write("        jQuery(\"#\" + tableName + \" tr\").each(function(index) {\r\n");
      out.write("            jQuery(this).children().first().text(index + 1);\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function PrintReport(){\r\n");
      out.write("        var legislation_id = document.dataform.legislation_id.value;\r\n");
      out.write("        if(legislation_id == 1)\r\n");
      out.write("        \tprintReports('ILL_P023_1&getTrackNo='+document.dataform.request_no.value);\r\n");
      out.write("        else if(legislation_id == 2)\r\n");
      out.write("        \tprintReports('ILL_P023_2&getTrackNo='+document.dataform.request_no.value);\r\n");
      out.write("        else if(legislation_id == 4)\r\n");
      out.write("    \t\tprintReports('ILL_P023_4&getTrackNo='+document.dataform.request_no.value);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\tfunction chkInform1(iID, cID){\r\n");
      out.write("\t    var chkI = document.getElementById(iID);\r\n");
      out.write("\t    var chkC = document.getElementById(cID);\r\n");
      out.write("\t    if (chkI.checked == true) {\r\n");
      out.write("\t        chkC.disabled = false;\r\n");
      out.write("\t    } else {\r\n");
      out.write("\t        chkC.disabled = true;\r\n");
      out.write("\t        chkC.checked = false;\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<form action=\"process?action=ApplicationRewardRequest&cmd=save\" method=\"post\" name=\"dataform\" id=\"dataform\">\r\n");
      out.write("<input type=\"hidden\" name=\"ar_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<table width=\"100%\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("\r\n");
      out.write("<td width=\"100%\" align=\"left\" valign=\"top\">\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t    <td width=\"1%\">&nbsp;</td>\r\n");
      out.write("\t    <td width=\"99%\"><span class=\"websitename\">คำร้องขอรับเงินสินบนและรางวัล</span></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t    <td height=\"25\">&nbsp;</td>\r\n");
      out.write("\t    <td>\r\n");
      out.write("\t        <input name=\"btnSave\" type=\"submit\" class=\"barbutton\" value=\"บันทึก\" onClick=\"return validate();\" >\r\n");
      out.write("\t        <input name=\"btnCancel\" type=\"button\" class=\"barbutton\" value=\"ยกเลิกการแก้ไข\" onclick=\"location.href='process?action=ApplicationRewardRequest&cmd=add'\">\r\n");
      out.write("\t        <input name=\"btnBack\" type=\"button\" class=\"barbutton\" value=\"กลับหน้าค้นหา\" onclick=\"location.href='process?action=ApplicationRewardRequest&cmd=list'\">\r\n");
      out.write("\t        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t        \r\n");
      out.write("\t    </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t    <td>&nbsp;</td>\r\n");
      out.write("\t    <td>&nbsp;</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t    <td>&nbsp;</td>\r\n");
      out.write("\t    <td>\r\n");
      out.write("\t        <table width=\"800\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t                <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">เลขที่เอกสาร&nbsp;:&nbsp;</td>\r\n");
      out.write("\t                <td width=\"30%\">\r\n");
      out.write("\t                    <input type=\"Text\" id=\"request_no\" name=\"request_no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.request_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"20\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" />\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t                <td width=\"20%\" height=\"25\" align=\"right\" valign=\"middle\">วันที่ :&nbsp;</td>\r\n");
      out.write("\t                <td width=\"30%\">\r\n");
      out.write("\t                \t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.request_date == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                    \t\r\n");
          out.write("\t                        <input name=\"request_date\" type=\"text\" id=\"request_date\" class=\"textdate\" onKeyPress=\"window.event.keyCode = 0\" onKeyDown=\"disableKeyDown();\" value=\"");
          //  fmt:formatDate
          org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
          _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
          _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
          _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
          _jspx_th_fmt_005fformatDate_005f0.setValue(new Date());
          int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
          if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
            return;
          }
          _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
          out.write("\">\r\n");
          out.write("                            <a href=\"javascript:NewCssCal('request_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>\r\n");
          out.write("\t                    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      out.write("\r\n");
      out.write("\t                    ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr class=\"bgRowGray\">\r\n");
      out.write("\t                <td colspan=\"4\"><strong>คำร้องขอรับเงินรางวัล</strong></td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\">พ.ร.บ. :&nbsp;</td>\r\n");
      out.write("\t                <td colspan=\"3\">\r\n");
      out.write("\t                \t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                    ");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr height=\"25\">\r\n");
      out.write("\t                <td  align=\"right\" valign=\"middle\">คดีเปรียบเทียบที่&nbsp;:&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"hidden\" name=\"compare_case_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.compare_case_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t                    <input class=\"textview\" type=\"text\" name=\"compare_case_no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.compare_case_no}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("\t                    ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t                <td  align=\"right\" valign=\"middle\">วันที่เปรียบเทียบ :&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input name=\"compare_case_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" \r\n");
      out.write("\t                    value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.compare_case_date }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr height=\"25\">\r\n");
      out.write("\t                <td align=\"right\" valign=\"middle\">ชื่อผู้ต้องหา :&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"text\" name=\"lawbreaker_name\" class=\"textview\" size=\"37\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.lawbreaker_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t                <td align=\"right\" valign=\"middle\">ชื่อผู้กล่าวหา :&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"Text\" id=\"accuser_name\" name=\"accuser_name\" \r\n");
      out.write("\t                           value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.accuser_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"textview\" size=\"35\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" >\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr height=\"25\">\r\n");
      out.write("\t                <td align=\"right\">ความผิดฐาน :&nbsp;</td>\r\n");
      out.write("\t                <td colspan=\"3\">\r\n");
      out.write("\t                    <input type=\"text\" name=\"guilt_base\" class=\"textview\" size=\"115\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.guilt_base}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr height=\"25\">\r\n");
      out.write("\t                <td align=\"right\">มาตรา :&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"text\" name=\"case_law_id\" class=\"textview\" size=\"37\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">&nbsp;\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t                <td align=\"right\">บทกำหนดโทษ :&nbsp;</td>\r\n");
      out.write("\t                <td><input type=\"text\" name=\"penalty_case_law_id\" class=\"textview\" size=\"36\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.penalty_case_law_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr height=\"25\">\r\n");
      out.write("\t                <td align=\"right\">สถานที่เกิดเหตุ :&nbsp;</td>\r\n");
      out.write("\t                <td colspan=\"3\">\r\n");
      out.write("\t                    <input type=\"text\" name=\"scene_addr\" class=\"textview\" size=\"115\"\r\n");
      out.write("\t                           onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.scene_addr}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">&nbsp;\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t             <tr height=\"25\">\r\n");
      out.write("\t                <td align=\"right\" valign=\"middle\">ชื่อผู้ร้องขอ/ผู้จับกุม&nbsp;:&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"text\" id=\"staff_name_request\" name=\"staff_name_request\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.request_staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" \">\r\n");
      out.write("\t                    <input type=\"hidden\" id=\"staff_id_request\" name=\"staff_id_request\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.staff_id_request }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t                    <input type=\"hidden\" id=\"poscode_request\" name=\"poscode_request\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.posrcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t                    <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("\t                         onClick=\"window.open('process?action=Divide_staff_popForArrest&formname=staff_name_request&id=staff_id_request&posname=staff_posname_request&poscode=poscode_request' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("\t                    \r\n");
      out.write("<!--\t                    <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"-->\r\n");
      out.write("<!--\t                         onClick=\"window.open('process?action=Divide_staff_pop&poscode=poscode_request&formname=staff_name_request&id=staff_id_request&posname=staff_posname_request' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>-->\r\n");
      out.write("\t                         \t\t\t\t\t\t\t\t\r\n");
      out.write("\t                    <font style=\"color:red\">*</font>\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t                <td align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input id=\"staff_posname_request\" name=\"staff_posname_request\" type=\"text\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.posrname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"middle\" colspan=\"4\">&nbsp;&nbsp;</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"top\">ผู้ร่วมจับกุม :&nbsp;</td>\r\n");
      out.write("\t                <td colspan=\"3\">\r\n");
      out.write("\t                    <table class=\"tableList\" width=\"95%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t                        <thead>\r\n");
      out.write("\t                        <tr class=\"TblHeaderColumn AlignCenter\">\r\n");
      out.write("\t                            <td width=\"50\"bgcolor=\"#F5F5F5\">ลำดับที่</td>\r\n");
      out.write("\t                            <td width=\"30\"bgcolor=\"#F5F5F5\"><input type=\"checkbox\" id=\"chkcoArrestBody\" name=\"chkcoArrestBody\"\r\n");
      out.write("\t                                                  value=\"checkbox\" onclick=\"chkUncheckAll('chkcoArrestBody');\"></td>\r\n");
      out.write("\t                            <td width=\"150\"bgcolor=\"#F5F5F5\">ชื่อ-สกุล</td>\r\n");
      out.write("\t                            <td width=\"150\"bgcolor=\"#F5F5F5\">ตำแหน่ง</td>\r\n");
      out.write("\t                        </tr>\r\n");
      out.write("\t                        </thead>\r\n");
      out.write("\t                        <tbody id=\"coArrestBody\">\r\n");
      out.write("\t\t                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                        </tbody>\r\n");
      out.write("\t                    </table>\r\n");
      out.write("\t                    <span class=\"spanLink\" onClick=\"aatopenmodal('coArrestBody');\">เพิ่มรายการ</span> |\r\n");
      out.write("\t                    <span class=\"spanLink\" onclick=\"aatget_check_value('coArrestBody')\">ลบรายการ</span>\r\n");
      out.write("\t                    \r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"middle\" colspan=\"4\">&nbsp;&nbsp;</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"top\">ผู้สั่งการ :&nbsp;</td>\r\n");
      out.write("\t                <td colspan=\"3\">\r\n");
      out.write("\t                    <table class=\"tableList\" width=\"95%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t                        <thead>\r\n");
      out.write("\t                        <tr class=\"TblHeaderColumn AlignCenter\">\r\n");
      out.write("\t                            <td width=\"50\"bgcolor=\"#F5F5F5\">ลำดับที่</td>\r\n");
      out.write("\t                            <td width=\"30\"bgcolor=\"#F5F5F5\"><input type=\"checkbox\" id=\"chkcommanderBody\" name=\"chkcommanderBody\"\r\n");
      out.write("\t                                                  value=\"checkbox\" onclick=\"chkUncheckAll('chkcommanderBody');\"></td>\r\n");
      out.write("\t                            <td width=\"150\"bgcolor=\"#F5F5F5\">ชื่อ-สกุล</td>\r\n");
      out.write("\t                            <td width=\"150\"bgcolor=\"#F5F5F5\">ตำแหน่ง</td>\r\n");
      out.write("\t                        </tr>\r\n");
      out.write("\t                        </thead>\r\n");
      out.write("\t                        <tbody id=\"commanderBody\">\r\n");
      out.write("\t\t\t                     ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t                        </tbody>\r\n");
      out.write("\t                    </table>\r\n");
      out.write("\t                    <span class=\"spanLink\" onClick=\"aatopenmodal('commanderBody');\">เพิ่มรายการ</span> |\r\n");
      out.write("\t                    <span class=\"spanLink\" onclick=\"aatget_check_value('commanderBody')\">ลบรายการ</span>\r\n");
      out.write("\t                    \r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"middle\" colspan=\"4\">&nbsp;&nbsp;</td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"middle\">ชื่อผู้แจ้งความ&nbsp;:&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"text\" name=\"inform_name\" class=\"textbox\" size=\"28\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.inform_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"middle\" style=\"width: 189px\">เลขที่งานใบแจ้งความนำจับ :&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input name=\"notice_no\" id=\"notice_no\" type=\"text\" class=\"textview\" size=\"28\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.inform_position }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"middle\">ชื่อผู้รับแจ้งความ&nbsp;:&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"text\" id=\"staff_name_receive\" name=\"staff_name_receive\" class=\"textview\" size=\"33\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.receive_staff_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t                    <input type=\"hidden\" id=\"staff_id_receive\" name=\"staff_id_receive\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.staff_id_receive }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t                    <input type=\"hidden\" id=\"poscode_receive\" name=\"poscode_receive\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.poscode_receive }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t                    <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\"\r\n");
      out.write("\t                         onClick=\"window.open('process?action=Divide_staff_pop&poscode=poscode_receive&formname=staff_name_receive&id=staff_id_receive&posname=staff_posname_receive' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');\"/>\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"middle\">ตำแหน่ง :&nbsp;</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input id=\"staff_posname_receive\" name=\"staff_posname_receive\" type=\"text\" class=\"textview\" readonly size=\"35\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.receive_posname }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t                \r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td height=\"25\" align=\"right\" valign=\"middle\">วันที่รับแจ้งความ :&nbsp;</td>\r\n");
      out.write("\t                <td colspan=\"3\">\r\n");
      out.write("\t                    <input type=\"Text\" id=\"receive_date\" name=\"receive_date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.receive_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"12\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" class=\"textdate\"/>\r\n");
      out.write("\t                    <a href=\"javascript:NewCssCal('receive_date','ddMMyyyy','dropdown',false)\">\r\n");
      out.write("\t                    <img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" id=\"receive_date_img\" width=\"19\" height=\"19\"/>\r\n");
      out.write("\t                    </a>\r\n");
      out.write("\t                    \tเวลา :<input type=\"Text\" id=\"receive_time\" name=\"receive_time\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.receive_time}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" onkeypress=\"txtTime_OnKeyPress(this);\" onblur=\"lengthVali(this,5);\" size=\"5\" class=\"textbox\"/>\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t                \r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t           \r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td colspan=\"4\">&nbsp; </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t        </table>\r\n");
      out.write("\t    </td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<SCRIPT language=\"JavaScript\">\r\n");
      out.write("    //var frmvalidator = new Validator(\"dataform\");\r\n");
      out.write("    //var formType = jQuery('[name=legislation_id]').val();\r\n");
      out.write("    \r\n");
      out.write("    //frmvalidator.addValidation(\"legislation_id\",\"req\",\"กรุณาเลือก พ.ร.บ.\");\r\n");
      out.write("    //frmvalidator.addValidation(\"compare_case_no\",\"req\",\"กรุณาเลือก คดีเปรียบเทียบ\");\r\n");
      out.write("    //frmvalidator.addValidation(\"staff_name_request\",\"req\",\"กรุณากรอกชื่อผู้ร้องขอจับกุม\");\r\n");
      out.write("\r\n");
      out.write("    //if(formType == 1){\r\n");
      out.write("     //   frmvalidator.addValidation(\"al_accept_date\",\"req\",\"กรุณาวันที่รับรองผลคดี\");\r\n");
      out.write("     //   frmvalidator.addValidation(\"al_report_to\",\"req\",\"กรุณากรอกช่องเสนอ\");\r\n");
      out.write("     //   frmvalidator.addValidation(\"al_accept_lean\",\"req\",\"กรุณากรอกช่องเรียน\");\r\n");
      out.write("     //   frmvalidator.addValidation(\"al_staff_name_arrest\",\"req\",\"กรุณากรอกชื่อผู้จับกุม\");\r\n");
      out.write("\r\n");
      out.write("    //}else if(formType == 2){\r\n");
      out.write("    //\tfrmvalidator.addValidation(\"to_staff_name_arrest\",\"req\",\"กรุณากรอกชื่อผู้จับกุม\");\r\n");
      out.write("    //}else if(formType == 4){\r\n");
      out.write("    //\tfrmvalidator.addValidation(\"abnormaly\",\"req\",\"กรุณากรอกลักษณะที่ตรวจพบ\");\r\n");
      out.write("    //\tfrmvalidator.addValidation(\"ta_ask_lean\",\"req\",\"กรุณากรอกเรียน\");\r\n");
      out.write("    //\tfrmvalidator.addValidation(\"ta_department_name_send\",\"req\",\"กรุณากรอกเห็นควรส่ง\");\r\n");
      out.write("    //\tfrmvalidator.addValidation(\"ta_staff_name_ark\",\"req\",\"กรุณากรอกชื่อผู้ขออนุมัติ\");\r\n");
      out.write("    //}\r\n");
      out.write("\r\n");
      out.write("    function validate(){\r\n");
      out.write("        //alert(\"valiedate\");\r\n");
      out.write("        var ret = true;\r\n");
      out.write("    \tvar formType = jQuery('[name=legislation_id]').val();\r\n");
      out.write("    \tvar doc = document.dataform;\r\n");
      out.write("    \tif(doc.legislation_id.value == \"\"){\r\n");
      out.write("\t\t\talert(\"กรุณาเลือก พ.ร.บ.\");\r\n");
      out.write("\t\t\tdoc.legislation_id.select();\r\n");
      out.write("\t\t\tret = false;\r\n");
      out.write("        }else if(doc.compare_case_no.value == \"\"){\r\n");
      out.write("        \talert(\"กรุณาเลือก คดีเปรียบเทียบ\");\r\n");
      out.write("\t\t\tdoc.compare_case_no.focus();\r\n");
      out.write("\t\t\tret = false;\r\n");
      out.write("        }else if(doc.staff_name_request.value == \"\"){\r\n");
      out.write("        \talert(\"กรุณากรอกชื่อผู้ร้องขอจับกุม\");\r\n");
      out.write("\t\t\tdoc.staff_name_request.focus();\r\n");
      out.write("\t\t\tret = false;\r\n");
      out.write("        }else{\r\n");
      out.write("\t\t\tif(formType == 1){\r\n");
      out.write("\t\t\t\tif(doc.al_accept_date.value==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณาเลือกวันที่รับรองผลคดี\");\r\n");
      out.write("\t\t\t\t\tdoc.al_accept_date.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}else if(doc.al_report_to.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณากรอกช่องเสนอ\");\r\n");
      out.write("\t\t\t\t\tdoc.al_report_to.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}else if(doc.al_accept_lean.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณากรอกช่องเรียน\");\r\n");
      out.write("\t\t\t\t\tdoc.al_accept_lean.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}else if(doc.al_staff_name_arrest.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณากรอกชื่อผู้จับกุม\");\r\n");
      out.write("\t\t\t\t\tdoc.al_staff_name_arrest.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}else if(doc.al_accept_desc.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณากรอกขอรับรองว่า\");\r\n");
      out.write("\t\t\t\t\tdoc.al_accept_desc.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else if(formType == 2){\r\n");
      out.write("\t\t\t\tif(doc.to_staff_name_arrest.value==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณากรอกชื่อผู้จับกุม\");\r\n");
      out.write("\t\t\t\t\tdoc.to_staff_name_arrest.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else if(formType == 4){\r\n");
      out.write("\t\t\t\tif(doc.abnormaly.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณากรอกลักษณะที่ตรวจพบ\");\r\n");
      out.write("\t\t\t\t\tdoc.abnormaly.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}else if(doc.ta_ask_lean.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณากรอกเรียน\");\r\n");
      out.write("\t\t\t\t\tdoc.ta_ask_lean.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}else if(doc.ta_department_name_send.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณากรอกเห็นควรส่ง\");\r\n");
      out.write("\t\t\t\t\tdoc.ta_department_name_send.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}else if(doc.ta_staff_name_ark.value == \"\"){\r\n");
      out.write("\t\t\t\t\talert(\"กรุณากรอกชื่อผู้ขออนุมัติ\");\r\n");
      out.write("\t\t\t\t\tdoc.ta_staff_name_ark.focus();\r\n");
      out.write("\t\t\t\t\tret = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return ret;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    convertNumber();\r\n");
      out.write("</SCRIPT>\r\n");
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
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t        \t<input name=\"btnPrint\" type=\"button\" class=\"barbutton\" value=\"พิมพคำร้อง\" onClick=\"PrintReport();\">\r\n");
        out.write("\t        ");
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

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.request_date != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                    \t<!--<input name=\"request_date\" type=\"text\" class=\"textdate\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.request_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" /> -->\r\n");
        out.write("\t                    \t <input name=\"request_date\" type=\"text\" id=\"request_date\" class=\"textdate\" onKeyPress=\"window.event.keyCode = 0\" onKeyDown=\"disableKeyDown();\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.request_date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("                            <a href=\"javascript:NewCssCal('request_date','ddmmyyyy')\"><img src=\"images/btn_calendar.png\" alt=\"\" width=\"19\" height=\"19\" align=\"middle\" style=\"border-style: none\" /></a>\r\n");
        out.write("\t                    \t\r\n");
        out.write("\t                    \t");
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

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                    <select name=\"legislation_id\" id=\"legislation_id\" style=\"width:200px;\"\r\n");
        out.write("\t\t                            OnChange=\"selectLegislation('legislation_id');\" >\r\n");
        out.write("\t\t                        <option value=\"1\" selected>90 พ.ร.บ. สุรา พ.ศ.2493</option>\r\n");
        out.write("\t\t                        <option value=\"2\">91 พ.ร.บ. ยาสูบ พ.ศ.2509</option>\r\n");
        out.write("\t\t                        <option value=\"4\">00 พ.ร.บ. ภาษีสรรพสามิต พ.ศ.2527</option>\r\n");
        out.write("\t\t                    </select>\r\n");
        out.write("\t\t                    <font style=\"color:red\">*</font>\r\n");
        out.write("\t                    ");
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

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                    \t<input type=\"hidden\" id=\"legislation_id\" name=\"legislation_id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"></input>\r\n");
        out.write("\t                    \t<input type=\"text\" name=\"legislation_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" size=\"37\" class=\"textview\" onKeyPress=\"txtKeyPress();\" onKeyDown=\"disableKeyDown();\" ></input>\r\n");
        out.write("\t                    ");
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

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.id == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t                    <img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" alt=\"ค้นหาหน่วยงาน\"\r\n");
        out.write("\t\t                         style=\"cursor: hand\" name=\"search_from_corporation_code\" id=\"search_from_corporation_code\"\r\n");
        out.write("\t\t                         onclick=\"window.showModalDialog('process?action=ApplicationRewardRequest&cmd=openCompareCasePopup&R=1&legislation_id='+jQuery('[name=legislation_id] > option:selected').val() , self , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');convertNumber();\">\r\n");
        out.write("\t\t                    <font style=\"color:red\">*</font>\r\n");
        out.write("\t                    ");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${co_arrests}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f0.setVar("co_arrest");
    _jspx_th_c_005fforEach_005f0.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t                            <tr>\r\n");
          out.write("\t\t\t                            <td class=\"TblRow AlignCenter\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t                            <td class=\"TblRow AlignCenter\">\r\n");
          out.write("\t\t\t                            \t<input name=\"chkcoArrestBody");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"checkbox\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"coArrestBody_id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${co_arrest.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"coArrestBody_idcard_no\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${co_arrest.staff_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"coArrestBody_level\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${co_arrest.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"coArrestBody_poscode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${co_arrest.poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"coArrestBody_offcode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${co_arrest.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                            </td>\r\n");
          out.write("\t\t\t                            <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${co_arrest.staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t                            <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${co_arrest.staff_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${co_arrest.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t                            </tr>\r\n");
          out.write("\t\t                        ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${commanders}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_005fforEach_005f1.setVar("cm");
    _jspx_th_c_005fforEach_005f1.setVarStatus("i");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t                     <tr>\r\n");
          out.write("\t\t\t                            <td class=\"TblRow AlignCenter\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t                            <td class=\"TblRow AlignCenter\"><input name=\"chkcommanderBody");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"checkbox\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"commanderBody_id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"commanderBody_idcard_no\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_idcardno}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"commanderBody_level\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"commanderBody_poscode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.poscode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                                <input type=\"hidden\" name=\"commanderBody_offcode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.offcode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t                            </td>\r\n");
          out.write("\t\t\t                            <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t                            <td align=\"left\" valign=\"top\" class=\"TblRow AlignLeft\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_posname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cm.staff_level}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t                        </tr>\r\n");
          out.write("\t\t                        ");
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

  private boolean _jspx_meth_c_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent(null);
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<!-- Start สุรา-->\r\n");
        out.write("\t\t\t\t\t<tr id=\"Alcohol\"  >\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "reward_request_alcohol.jsp", out, false);
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t<!-- End สุรา-->\r\n");
        out.write("\t\t\t\t\t<!-- Start ยาสูบ-->\r\n");
        out.write("\t\t\t\t\t<tr id=\"Tobacco\" style=\"display:none\" >\r\n");
        out.write("\t\t\t\t\t    <td>\r\n");
        out.write("\t\t\t\t\t\t\t");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "reward_request_tobacco.jsp", out, false);
        out.write("\r\n");
        out.write("\t\t\t\t\t    </td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t<!-- End ยาสูบ-->\r\n");
        out.write("\t\t\t\t\t<!-- Start ภาษี-->\r\n");
        out.write("\t\t\t\t\t<tr id=\"Tax\" style=\"display:none\" >\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "reward_request_tax.jsp", out, false);
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<!-- End ภาษี-->\r\n");
        out.write("\t\t\t\t");
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
    HttpServletRequest request = (HttpServletRequest)_jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse)_jspx_page_context.getResponse();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<!-- Start สุรา-->\r\n");
        out.write("\t\t\t\t\t<tr  ");
        if (_jspx_meth_c_005fif_005f8(_jspx_th_c_005fif_005f7, _jspx_page_context))
          return true;
        out.write(" >\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "reward_request_alcohol.jsp", out, false);
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t<!-- End สุรา-->\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<!-- Start ยาสูบ-->\r\n");
        out.write("\t\t\t\t\t<tr  ");
        if (_jspx_meth_c_005fif_005f9(_jspx_th_c_005fif_005f7, _jspx_page_context))
          return true;
        out.write(" >\r\n");
        out.write("\t\t\t\t\t    <td>\r\n");
        out.write("\t\t\t\t\t\t\t");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "reward_request_tobacco.jsp", out, false);
        out.write("\r\n");
        out.write("\t\t\t\t\t    </td>\r\n");
        out.write("\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t<!-- End ยาสูบ-->\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t<!-- Start ภาษี-->\r\n");
        out.write("\t\t\t\t\t<tr ");
        if (_jspx_meth_c_005fif_005f10(_jspx_th_c_005fif_005f7, _jspx_page_context))
          return true;
        out.write(" >\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "reward_request_tax.jsp", out, false);
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t<!-- End ภาษี-->\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id != '1' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none\"");
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

  private boolean _jspx_meth_c_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id != '2' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none\"");
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

  private boolean _jspx_meth_c_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${db.legislation_id != '4' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("style=\"display:none\"");
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
}
