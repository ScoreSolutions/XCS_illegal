<%@ page import="java.util.Date" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%@include file="/Templates/meta.jsp" %>

<script type="text/javascript" language="JavaScript">

    function chkInform(iID, cID)
    {
        chkI = document.getElementById(iID);
        chkC = document.getElementById(cID);
        if (chkI.checked == true) {
            chkC.disabled = false;
        } else {
            chkC.disabled = true;
            chkC.checked = false;
        }
    }

    function addCompareCaseInformation(ccid){
        jQuery.ajax({
            url:'process?action=Ajax&cmd=getCompareCaseApplicationRewardReq&ccid=' + ccid ,
            async:false,
            success: function(data) {
                data = data.replace(/null/ig,'\"\"');
                var ccdata = eval('(' + data + ')');
                jQuery("[name=compare_case_id]").val(ccdata[0]['id']);
                jQuery("[name=compare_case_no]").val(ccdata[0]['compare_case_no']);
                jQuery("[name=compare_case_date]").val(ccdata[0]['compare_case_date']);
                jQuery("[name=lawbreaker_name]").val(ccdata[0]['lawbreaker_name']);
                jQuery("[name=accuser_name]").val(ccdata[0]['accuser_name']);
                jQuery("[name=guilt_base]").val(ccdata[0]['guilt_base']);
                jQuery("[name=case_law_id]").val(ccdata[0]['case_law_id']);
                jQuery("[name=penalty_case_law_id]").val(ccdata[0]['penalty_case_law_id']);
                jQuery("[name=scene_addr]").val(ccdata[0]['scene_addr']);
                jQuery("[name=prove_name]").val(ccdata[0]['prove_name']);
                jQuery("[name=pospname]").val(ccdata[0]['pospname']);
                jQuery("[name=sue_name]").val(ccdata[0]['sue_name']);
                jQuery("[name=possname]").val(ccdata[0]['possname']);
                jQuery("[name=al_fine]").val(ccdata[0]['fine_case']);
                jQuery("[name=al_bribe_money]").val(ccdata[0]['bribe_money']);
                jQuery("[name=al_reward_money]").val(ccdata[0]['reward_money']);
                jQuery('[name=al_staff_name_arrest]').val(ccdata[0]['accuser_name']);
                jQuery('[name=al_staff_id_arrest]').val(ccdata[0]['aa_idcard_no']);
                jQuery('[name=al_poscode_arrest]').val(ccdata[0]['aa_poscode']);
                jQuery('[name=al_offcode_arrest]').val(ccdata[0]['aa_offcode']);
                jQuery('[name=al_posname_arrest]').val(ccdata[0]['posaname']);
                jQuery('[name=al_offname_arrest]').val(ccdata[0]['aa_offname']);
                var legislation_id = jQuery('[name=legislation_id]').val();
                if(legislation_id == 4){
                    addTaxItems(ccdata[0]['track_no']);
                    addTeam(ccdata[0]['id'], 5, 'helperBody');
                }
            }
        });
    }
    function addTaxItems(track_no){
        jQuery.ajax({
            url:'process?action=Ajax&cmd=getApplicationArrestExhibitItems&track_no=' + track_no ,
            async:false,
            success: function(data) {
                data = data.replace(/null/ig,'\"\"');
                var ccdata = eval('(' + data + ')');
                // gen sequence items.
            }
        });
    }
    function addTeam(ccid, duty_status_id, table_name) {
        jQuery.ajax({
            url:'process?action=Ajax&cmd=getStaffTeamByCompareCase&ccid=' + ccid + '&duty_status_id=' + duty_status_id,
            async:false,
            success: function(data) {
                var teamList = eval('(' + data + ')');
                var tab = jQuery('#' + table_name);
                var base = jQuery("#" + table_name + " > tr ").size() + 1;
                for (i = 0; i < teamList.length; i++) {
                    if (jQuery("[name=" + table_name + "_idcard_no][value=" + teamList[i]['idcard_no'] + "]").size() > 0) {

                    } else {
                        var row = jQuery("<tr />").attr({id:table_name + '_row_' + (base + i)});
                        row.append(jQuery("<td />").addClass('TblRow AlignCenter').html(base + i));
                        row.append(jQuery("<td />").addClass('TblRow AlignCenter').append(jQuery("<input />").attr({type:'checkbox'})));
                        row.append(jQuery("<td />").html(teamList[i]['full_name']));
                        row.append(jQuery("<td />").html(teamList[i]['posname']));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_id',value:''}));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_idcard_no',value:teamList[i]['idcard_no']}));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_poscode',value:teamList[i]['poscode']}));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_offcode',value:teamList[i]['offcode']}));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_staff_level',value:teamList[i]['staff_level']}));
                        tab.append(row);
                        tab.html(tab.html().replace(/n_ame/g, 'name'));
                    }
                }
            }
        });
    }
</script>
<script>

    function chkUncheckAll(prefix) {
        if (jQuery("#" + prefix).first().attr('checked')) {
            jQuery("input[name^='" + prefix + "']").attr('checked', true);
        } else {
            jQuery("input[name^='" + prefix + "']").attr('checked', false);
        }
    }

    function aatopenmodal(myTable)
    {
        var data = window.showModalDialog('process?action=Divide_staff_poplist', self, 'dialogWidth=700px,Height=400px');
        var rowIndex = jQuery("tbody#" + myTable + " > tr").size();

        if (data) {
            for (var i = 0; i < data.length; i++) {
                if (jQuery("input[name='" + myTable + "_idcard_no'][value='" + data[i][5] + "']").size() > 0) {
                    //alert("dupplicated offcode ");
                } else {
                    var paramMap = {
                        '_idcard_no':data[i][5],
                        '_poscode':data[i][6],
                        '_offcode':data[i][7],
                        '_level':data[i][13],
                        '_id':''
                    };
                    var inputRow = "";
                    jQuery.each(paramMap, function(key, value) {
                        //alert(myTable + key);
                        inputRow = inputRow + '<input type="hidden" name="' + myTable + key + '" value="' + value + '" />';
                    });
                    rowIndex = rowIndex + 1;
                    var index = '<td class="TblRow AlignCenter">' + rowIndex + '</td>';
                    var box = '<td class="TblRow AlignCenter"><input name="chk' + myTable + rowIndex + '" type="checkbox"/>' +
                            inputRow + '</td>';
                    var name = '<td align="left" valign="top" class="TblRow AlignLeft">' + data[i]["9"] + '</td>';
                    var pos = '<td align="left" valign="top" class="TblRow AlignLeft">' + data[i]["3"] + '</td>';
                    var row = index + box + name + pos;
                    //window.opener.jQuery("#"+tableName).last().append("<tr>"+ row +"</tr>");
                    jQuery("#" + myTable).first().append("<tr id=\"" + myTable + rowIndex + "\">" + row + "</tr>");
                }
            }
        } else {
        }
    }

    function aatget_check_value(tableName)
    {
        jQuery("#" + tableName + " tr").has("td > input:checked").remove();
        // rerun index of row
        jQuery("#" + tableName + " tr").each(function(index) {
            jQuery(this).children().first().text(index + 1);
        });
    }
    function PrintReport(){
    	printReports('ILL_P023&getTrackNo='+document.dataform.request_no.value);
    }
</script>

<form action="process?action=ApplicationRewardRequest&cmd=update" method="post" name="dataform" id="dataform">
<input type="hidden" name="ar_id" value="${ar.id}" />
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
<tr>

<td width="100%" align="left" valign="top">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <td width="99%"><span class="websitename">คำร้องขอรับเงินสินบนและรางวัล</span></td>
</tr>
<tr>
    <td height="25">&nbsp;</td>
    <td>
        <input name="btnSave" type="submit" class="barbutton" value="บันทึก">
        <input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="location.href='process?action=ApplicationRewardRequest&cmd=edit&id=${ar.id}'">
        <input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="location.href='process?action=ApplicationRewardRequest&cmd=list'">
        <input name="btnPrint" type="button" class="barbutton" value="พิมพคำร้อง" onClick="PrintReport();">
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>
        <table width="800" border="0" cellspacing="0" cellpadding="0">
            <tr class="bgRowGray">
                <td colspan="4"><strong>คำร้องขอรับเงินรางวัล</strong></td>
            </tr>
            <tr>
                <td width="20%" height="25" align="right" valign="middle">เลขที่เอกสาร&nbsp;:&nbsp;</td>
                <td width="30%">
                    <input type="Text" id="request_no" name="request_no" value="${ar.request_no}" class="textview" size="15" readonly/>
                </td>
                <td width="20%" height="25" align="right" valign="middle">วันที่ :&nbsp;</td>
                <td width="30%">
                    <input name="request_date" type="text" class="textdate" readonly value="<fmt:formatDate pattern='dd/MM/yyyy' value='${ar.request_date}'/>"/>
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ชื่อผู้ร้องขอ/ผู้จับกุม&nbsp;:&nbsp;</td>
                <td>
                    <input type="text" id="staff_name_request" name="staff_name_request" class="textview" size="35" value="${ar.staff_name_request}" readonly >
                    <input type="hidden" id="staff_id_request" name="staff_id_request" value="${ar.staff_id_request}"/>
                    <input type="hidden" id="poscode_request" name="poscode_request" value="${ar.poscode_request}"/>
                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                         onClick="window.open('process?action=Divide_staff_pop&poscode=poscode_request&formname=staff_name_request&id=staff_id_request&posname=staff_posname_request' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
                    <font style="color:red">*</font>

                </td>
                <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td>
                    <input id="staff_posname_request" name="staff_posname_request" type="text" class="textview" readonly size="35" value="${ar.posname_request}" readonly/>
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="top">ผู้ร่วมจับกุม :&nbsp;</td>
                <td colspan="3">
                    <table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0">
                        <thead>
                        <tr class="TblHeaderColumn AlignCenter">
                            <td width="50">ลำดับที่</td>
                            <td width="30"><input type="checkbox" id="chkcoArrestBody" name="chkcoArrestBody"
                                                  value="checkbox" onclick="chkUncheckAll('chkcoArrestBody');"></td>
                            <td width="150">ชื่อ-สกุล</td>
                            <td width="150">ตำแหน่ง</td>
                        </tr>
                        </thead>
                        <tbody id="coArrestBody">
                        <c:forEach items="${co_arrests}" var="co_arrest" varStatus="i">
                            <tr>
                            <td class="TblRow AlignCenter">${i.count}</td>
                            <td class="TblRow AlignCenter"><input name="chkcoArrestBody${i.count}" type="checkbox"/>
                                <input type="hidden" name="coArrestBody_id" value="${co_arrest.id}"/>
                                <input type="hidden" name="coArrestBody_idcard_no" value="${co_arrest.staff_idcardno}"/>
                                <input type="hidden" name="coArrestBody_level" value="${co_arrest.staff_level}"/>
                                <input type="hidden" name="coArrestBody_poscode" value="${co_arrest.poscode}"/>
                                <input type="hidden" name="coArrestBody_offcode" value="${co_arrest.offcode}"/>
                            </td>
                            <td align="left" valign="top" class="TblRow AlignLeft">${co_arrest.staff_name}</td>
                            <td align="left" valign="top" class="TblRow AlignLeft">${co_arrest.staff_posname}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <span class="spanLink" onClick="aatopenmodal('coArrestBody');">เพิ่มรายการ</span> |
                    <span class="spanLink" onclick="aatget_check_value('coArrestBody')">ลบรายการ</span>
                    <font color="red" size="1"><i>* ดึงข้อมูลจาก APPLICATION_ARREST_TEAM
                        มาแสดงเป็นค่าเริ่มต้น</i></font>
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle" colspan="4">&nbsp;&nbsp;</td>
            </tr>
            <tr>
                <td height="25" align="right" valign="top">ผู้สั่งการ :&nbsp;</td>
                <td colspan="3">
                    <table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0">
                        <thead>
                        <tr class="TblHeaderColumn AlignCenter">
                            <td width="50">ลำดับที่</td>
                            <td width="30"><input type="checkbox" id="chkcommanderBody" name="chkcommanderBody"
                                                  value="checkbox" onclick="chkUncheckAll('chkcommanderBody');"></td>
                            <td width="150">ชื่อ-สกุล</td>
                            <td width="150">ตำแหน่ง</td>
                        </tr>
                        </thead>
                        <tbody id="commanderBody">
                        <c:forEach items="${commanders}" var="cm" varStatus="i">
                            <td class="TblRow AlignCenter">${i.count}</td>
                            <td class="TblRow AlignCenter"><input name="chkcoArrestBody${i.count}" type="checkbox"/>
                                <input type="hidden" name="coArrestBody_id" value="${cm.id}"/>
                                <input type="hidden" name="coArrestBody_idcard_no" value="${cm.staff_idcardno}"/>
                                <input type="hidden" name="coArrestBody_level" value="${cm.staff_level}"/>
                                <input type="hidden" name="coArrestBody_poscode" value="${cm.poscode}"/>
                                <input type="hidden" name="coArrestBody_offcode" value="${cm.offcode}"/>
                            </td>
                            <td align="left" valign="top" class="TblRow AlignLeft">${cm.staff_name}</td>
                            <td align="left" valign="top" class="TblRow AlignLeft">${cm.staff_posname}</td>
                        </c:forEach>
                        </tbody>
                    </table>
                    <span class="spanLink" onClick="aatopenmodal('commanderBody');">เพิ่มรายการ</span> |
                    <span class="spanLink" onclick="aatget_check_value('commanderBody')">ลบรายการ</span>
                    <font color="red" size="1"><i>* ดึงข้อมูลจาก APPLICATION_ARREST_TEAM
                        มาแสดงเป็นค่าเริ่มต้น</i></font>
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle" colspan="4">&nbsp;&nbsp;</td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ชื่อผู้แจ้งความ&nbsp;:&nbsp;</td>
                <td>
                    <input type="text" name="inform_name" class="textbox" size="28" value="${ar.inform_name}">
                </td>
                <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td>
                    <input name="inform_position" type="text" class="textbox" size="28" value="${ar.inform_position}"/>
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ชื่อผู้รับแจ้งความ&nbsp;:&nbsp;</td>
                <td>
                    <input type="text" id="staff_name_receive" name="staff_name_receive" class="textview" size="35" value="${ar.staff_name_receive}">
                    <input type="hidden" id="staff_id_receive" name="staff_id_receive" value="${ar.staff_id_receive}"/>
                    <input type="hidden" id="poscode_receive" name="poscode_receive" value="${ar.poscode_receive}"/>
                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                         onClick="window.open('process?action=Divide_staff_pop&poscode=poscode_receive&formname=staff_name_receive&id=staff_id_receive&posname=staff_posname_receive' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
                </td>
                <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td>
                    <input id="staff_posname_receive" name="staff_posname_receive" type="text" class="textview" readonly size="35" value="${ar.posname_receive}"/>
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">วันที่รับแจ้งความ :&nbsp;</td>
                <td colspan="3">
                    <input type="Text" id="receive_date" name="receive_date" value="<fmt:formatDate pattern="dd/MM/yyyy" value='${ar.receive_date}'/>" size="12" class="textdate"/>
                    <a href="javascript:NewCssCal('receive_date','ddMMyyyy','dropdown',false)"><img
                            src="images/btn_calendar.png"
                            alt="" width="19" height="19"
                            align="middle"
                            style="border-style: none"
                            id="receive_date_img" width="19"
                            height="19"/></a>
                    เวลา :<input type="Text" id="receive_time" name="receive_time" value="<fmt:formatDate pattern="HH:mm" value='${ar.receive_date}'/>" size="5" class="textbox"/>
                </td>
            </tr>
            <tr>
                <td height="25" align="right">พ.ร.บ. :&nbsp;</td>
                <td colspan="4" width="100%">
                    <input type="hidden" name="legislation_id" value="${db.legislation_id}" />
                    <c:choose>
                        <c:when test="${db.legislation_id==1}">
                            <span class="textreadonly">90 พ.ร.บ. สุรา พ.ศ.2493<span/>
                        </c:when>
                        <c:when test="${db.legislation_id==2}">
                            <span class="textreadonly">91 พ.ร.บ. ยาสูบ พ.ศ.2509<span/>
                        </c:when>
                        <c:when test="${db.legislation_id==4}">
                            <span class="textreadonly">00 พ.ร.บ. ภาษีสรรพสามิต พ.ศ.2527<span/>
                        </c:when>
                    </c:choose>
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">คดีเปรียบเทียบที่&nbsp;:&nbsp;</td>
                <td>
                    <input type="hidden" name="compare_case_id" value="${db.compare_case_id}"/>
                    <input class="textreadonly" type="text" name="compare_case_no" value="${db.compare_case_no}" readonly>
                </td>
                <td height="25" align="right" valign="middle">วันที่เปรียบเทียบ :&nbsp;</td>
                <td>
                    <input name="compare_case_date" type="text" class="textdate" readonly value="${db.compare_case_date}"/>
                </td>
            </tr>
            <tr>
                <td align="right" valign="middle">ชื่อผู้ต้องหา :&nbsp;</td>
                <td>
                    <input type="text" name="lawbreaker_name" class="textview" size="37" readonly value="${db.lawbreaker_name}">
                </td>
                <td align="right" valign="middle">ชื่อผู้กล่าวหา :&nbsp;</td>
                <td>
                    <input type="Text" id="accuser_name" name="accuser_name" readonly
                           value="${db.accuser_name}" class="textview" size="35" readonly>
                </td>
            </tr>
            <tr>
                <td align="right">ความผิดฐาน :&nbsp;</td>
                <td colspan="3">
                    <input type="text" name="guilt_base" class="textview" size="115" readonly
                           value="${db.guilt_base}">
                </td>
            </tr>
            <tr>
                <td align="right">มาตรา :&nbsp;</td>
                <td>
                    <input type="text" name="case_law_id" class="textview" size="37" readonly value="${db.case_law_id}">&nbsp;
                </td>
                <td align="right">บทกำหนดโทษ :&nbsp;</td>
                <td><input type="text" name="penalty_case_law_id" class="textview" size="36" readonly value="${db.penalty_case_law_id}">
                </td>
            </tr>
            <tr>
                <td align="right">สถานที่เกิดเหตุ :&nbsp;</td>
                <td colspan="3">
                    <input type="text" name="scene_addr" class="textview" size="115"
                           readonly
                           value="${db.scene_addr}">&nbsp;
                </td>
            </tr>
            <tr>
                <td colspan="4">&nbsp; </td>
            </tr>
        </table>
    </td>
</tr>
<tr>
<td>&nbsp;</td>
<td>
<table width="800" border="0" cellpadding="0" cellspacing="0">

<c:if test="${al != null}">
<!-- Start สุรา-->
<tr id="Alcohol">
<td>
<table width="800" border="0" cellspacing="0" cellpadding="0">
    <input type="hidden" name="al_id" value="${al.id}"/>
    <tr class="bgRowGray">
        <td colspan="4"><strong>บันทึกการรับรองผลคดี</strong></td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">วันที่ :&nbsp;</td>
        <td colspan="3">
            <input type="Text" id="al_accept_date" name="al_accept_date" value="<fmt:formatDate pattern='dd/MM/yyyy' value='${al.accept_date}'/> " size="12" class="textdate"/>
            <a href="javascript:NewCssCal('al_accept_date','ddMMyyyy','dropdown',false)"><img
                    src="images/btn_calendar.png"
                    alt="" width="19" height="19"
                    align="middle"
                    style="border-style: none"
                    id="al_accept_date_img" width="19"
                    height="19"/></a>&nbsp;
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td align="right">เสนอ :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="al_report_to" class="textbox" size="30" value="${al.report_to}">
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td width="20%" align="right">ชื่อผู้พิสูจน์ :&nbsp;</td>
        <td width="30%">
            <input type="text" name="prove_name" class="textview" size="37" value="${db.prove_name}" readonly>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input name="pospname" type="text" class="textview" readonly size="35"
                   value="${db.pospname}"/>
        </td>
    </tr>
    <tr>
        <td align="right">เจ้าหน้าที่ดำเนินคดี :&nbsp;</td>
        <td>
            <input type="text" name="sue_name" class="textview" size="37" value="${db.sue_name}" readonly>
        </td>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td>
            <input name="possname" type="text" class="textview" readonly size="35" value="${db.possname}"/>
        </td>
    </tr>
    <tr>
        <td align="right">เปรียบเทียบปรับเป็นเงิน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="al_fine" class="textViewNum" size="20" value="${db.fine_case}" readonly>บาท&nbsp;
            (สามพันบาทถ้วน)
        </td>
    </tr>
    <tr>
        <td align="right">เงินสินบนเป็นเงิน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="al_bribe_money" class="textViewNum" size="20" value="${db.bribe_money}" readonly="">บาท&nbsp;
            (เก้าร้อยบาทถ้วน)
        </td>
    </tr>
    <tr>
        <td align="right">เงินรางวัลเป็นเงิน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="al_reward_money" class="textViewNum" size="20" value="${db.reward_money}" readonly>บาท&nbsp;
            (เจ็ดร้อยห้าสิบบาทถ้วน)
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
</table>
<table width="800" border="0" cellspacing="0" cellpadding="0">
    <tr class="bgRowGray">
        <td colspan="4"><strong>การรับรองผลการจับกุมผู้กระทำผิดพระราชบัญญัติสุรา</strong></td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td align="right">เรียน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="al_accept_lean" class="textbox" size="35"
                   value="${al.accept_lean}">
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td width="20%" align="right">ชื่อผู้จับกุม :&nbsp;</td>
        <td width="30%">
            <input type="text" name="al_staff_name_arrest" class="textview" size="37" value="${al.staff_name_arrest}" readonly style="float:left">
            <input type="hidden" name="al_staff_id_arrest" value="${al.staff_id_arrest}"/>
            <input type="hidden" name="al_poscode_arrest" value="${al.poscode_arrest}"/>
            <input type="hidden" name="al_offcode_arrest" value="${al.offcode_arrest}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=al_poscode_arrest&formname=al_staff_name_arrest'+
                 '&id=al_staff_id_arrest&posname=al_posname_arrest&offname=al_offname_arrest&offcode=al_offcode_arrest' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
            <font style="color:red">*</font>
        </td>
        <td width="20%" height="25" align="right" valign="middle">&nbsp;</td>
        <td width="30%">&nbsp;</td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td>
            <input name="al_posname_arrest" type="text" class="textview" readonly size="37" value="${al.posname_arrest}"/>
        </td>
        <td align="right">สังกัด :&nbsp;</td>
        <td>
            <input type="text" name="al_offname_arrest" class="textview" size="37" value="${al.offname_arrest}" readonly>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ขอรับรองว่า :&nbsp;</td>
        <td colspan="3">
            <TEXTAREA NAME="al_accept_desc" ROWS="2" COLS="73" >${al.accept_desc}
            </TEXTAREA>
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
</table>
<table width="800" border="0" cellspacing="0" cellpadding="0">
    <tr class="bgRowGray">
        <td colspan="4"><strong>หัวหน้าฝ่าย หรือตำแหน่งเทียบเท่า</strong></td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">เรียน :&nbsp;</td>
        <td colspan="3">
            <input id="text1" name="al_leader_lean" type="text" class="textbox" size="35"
                   value="${al.leader_lean}"/><font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="al_rb_leader_accept" value="Y" ${(al.leader_accept == 'Y')?'checked':''}
                   OnClick="
													document.getElementById('al_txtLeaderAccept').disabled=false;
													document.getElementById('al_txtLeaderUnAccept').disabled=true;
													document.getElementById('al_txtLeaderUnAccept').value='';
													"
                    > รับรอง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="al_txtLeaderAccept" name="al_txtLeaderAccept" type="text" class="textbox" size="50" ${(al.leader_accept == 'N')?'disabled':''}
                   value="${(al.leader_accept == 'Y')?(al.leader_accept_reason):''}"/>
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3">
            <INPUT TYPE="radio" NAME="al_rb_leader_accept" value="N" ${(al.leader_accept == 'N')?'checked':''}
                   OnClick="
													document.getElementById('al_txtLeaderAccept').disabled=true;
													document.getElementById('al_txtLeaderUnAccept').disabled=false;
													document.getElementById('al_txtLeaderAccept').value='';
													"> ไม่รับรอง
            <input id="al_txtLeaderUnAccept" name="al_txtLeaderUnAccept" type="text" class="textbox" size="50" ${(al.leader_accept == 'Y')?'disabled':''}
                   value="${(al.leader_accept == 'N')?(al.leader_deny_reason):''}"/>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" name="al_staff_name_leader" class="textview" size="37" value="${al.staff_name_leader}">
            <input type="hidden" name="al_staff_id_leader" value="${al.staff_id_leader}"/>
            <input type="hidden" name="al_poscode_leader" value="${al.poscode_leader}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=al_poscode_leader&formname=al_staff_name_leader&id=al_staff_id_leader&posname=al_posname_leader' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input name="al_posname_leader" type="text" class="textview" readonly size="35" value="${al.posname_leader}"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
</table>
<table width="800" border="0" cellspacing="0" cellpadding="0">
    <tr class="bgRowGray">
        <td colspan="4"><strong>ผู้อำนวยการส่วน หรือตำแหน่งเทียบเท่า</strong></td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">เรียน :&nbsp;</td>
        <td colspan="3">
            <input id="al_section_director_lean" name="al_section_director_lean" type="text" class="textbox" size="35"
                   value="${al.section_director_lean}"/><font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="al_rb_section_director_accept" value="Y" ${(al.section_director_accept == 'Y')?'checked':''}
                   OnClick="
													document.getElementById('al_txtSectionDirectorAccept').disabled=false;
													document.getElementById('al_txtSectionDirectorUnAccept').disabled=true;
													document.getElementById('al_txtSectionDirectorUnAccept').value='';
													"
                    > รับรอง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="al_txtSectionDirectorAccept" name="al_txtSectionDirectorAccept" type="text" class="textbox" ${(al.section_director_accept == 'Y')?'':'disabled'}
                   size="50" value="${(al.section_director_accept == 'Y')?(al.section_director_accept_reason):''}"/>
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3">
            <INPUT TYPE="radio" NAME="al_rb_section_director_accept" value="N" ${(al.section_director_accept == 'N')?'checked':''}
                   OnClick="
													document.getElementById('al_txtSectionDirectorAccept').disabled=true;
													document.getElementById('al_txtSectionDirectorUnAccept').disabled=false;
													document.getElementById('al_txtSectionDirectorAccept').value='';
													"> ไม่รับรอง
            <input id="al_txtSectionDirectorUnAccept" name="al_txtSectionDirectorUnAccept" type="text" class="textbox" ${(al.section_director_accept == 'Y')?'disabled':''}
                   size="50" value="${(al.section_director_accept == 'N')?(al.section_director_deny_reason):''}"/>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" name="al_staff_name_section_director" class="textview" size="37" value="${al.staff_name_section_director}">
            <input type="hidden" name="al_staff_id_section_director" value="${al.staff_id_section_director}"/>
            <input type="hidden" name="al_poscode_section_director" value="${al.poscode_section_director}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=al_poscode_section_director&formname=al_staff_name_section_director&id=al_staff_id_section_director&posname=al_posname_section_director' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input name="al_posname_section_director" type="text" class="textview" readonly size="35" value="${al.posname_section_director}"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
</table>
<table width="800" border="0" cellspacing="0" cellpadding="0">
    <tr class="bgRowGray">
        <td colspan="4"><strong>ผู้อำนวยสำนัก หรือตำแหน่งเทียบเท่า</strong></td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="al_rb_res_director_accept" value="Y" ${(al.res_director_accept == 'Y')?'checked':''}
                   OnClick="
													document.getElementById('al_txtResDirectorAccept').disabled=false;
													document.getElementById('al_txtResDirectorUnAccept').disabled=true;
													document.getElementById('al_txtResDirectorUnAccept').value='';
													"
                    > รับรอง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="al_txtResDirectorAccept" name="al_txtResDirectorAccept" type="text" class="textbox" size="50" ${(al.res_director_accept == 'Y')?'':'disabled'}
                   value="${(al.res_director_accept == 'Y')?(al.res_director_accept_reason):''}"/>
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3">
            <INPUT TYPE="radio" NAME="al_rb_res_director_accept" value="N" ${(al.res_director_accept == 'N')?'checked':''}
                   OnClick="
													document.getElementById('al_txtResDirectorAccept').disabled=true;
													document.getElementById('al_txtResDirectorUnAccept').disabled=false;
													document.getElementById('al_txtResDirectorAccept').value='';
													"> ไม่รับรอง
            <input id="al_txtResDirectorUnAccept" name="al_txtResDirectorUnAccept" type="text" class="textbox" size="50"
                   ${(al.res_director_accept == 'Y')?'disabled':''} value="${(al.res_director_accept == 'N')?(al.res_director_deny_reason):''}"/>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" name="al_staff_name_res_director" class="textview" size="37" value="${al.staff_name_res_director}">
            <input type="hidden" name="al_staff_id_res_director" value="${al.staff_id_res_director}"/>
            <input type="hidden" name="al_poscode_res_director" value="${al.poscode_res_director}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=al_poscode_res_director&formname=al_staff_name_res_director&id=al_staff_id_res_director&posname=al_posname_res_director' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input name="al_posname_res_director" type="text" class="textview" readonly size="35" value="${al.posname_res_director}"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
</table>
</td>
</tr>
<!-- End สุรา-->
</c:if>

<c:if test="${at != null}">
<!-- Start ยาสูบ-->
<tr id="Tobacco" style="display:none;">
    <td>
        <table width="800" border="0" cellspacing="0" cellpadding="0">
            <tr class="bgRowGray">
                <td colspan="4"><strong>บันทึกการรับรองผล</strong></td>
            </tr>
            <tr>
                <td colspan="4">&nbsp;</td>
            </tr>
            <tr>
                <td width="20%" align="right">เจ้าหน้าที่ดำเนินคดี/&nbsp;<br>ผู้มีอำนาจเปรียบเทียบ :&nbsp;</td>
                <td width="30%">
                    <input type="text" name="al_staff_name_arrest" class="textview" size="37" value="" readonly>
                </td>
                <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td width="30%">
                    <input name="al_posname_arrest" type="text" class="textview" readonly size="35" value=""/>
                </td>
            </tr>
            <tr>
                <td align="right">เปรียบเทียบปรับเป็นเงิน :&nbsp;</td>
                <td>
                    <input type="text" name="al_fine" class="textViewNum" size="20" value="">บาท&nbsp;
                </td>
                <td align="right">เงินรางวัล 60% เป็นเงิน :&nbsp;</td>
                <td>
                    <input type="text" name="al_reward_money" class="textViewNum" size="20" value="">บาท&nbsp;
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="top">(ห้าหมื่นหนึ่งพันสามร้อยเจ็ดสิบสองบาทห้าสิบสตางค์)</td>
                <td>&nbsp;</td>
                <td valign="top">(สามหมื่นแปดร้อยยี่สิบสามบาทห้าสิบสตางค์)</td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ชื่อผู้จับกุม&nbsp;:&nbsp;</td>
                <td>
                    <input type="text" name="to_staff_name_arrest" class="textview" size="37" value="" style="float:left">
                    <input type="hidden" name="to_staff_id_arrest" value=""/>
                    <input type="hidden" name="to_poscode_arrest" value=""/>
                    <input type="hidden" name="to_offcode_arrest" value=""/>
                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                         onClick="window.open('process?action=Divide_staff_pop&poscode=to_poscode_arrest&formname=to_staff_name_arrest&id=to_staff_id_arrest&posname=to_posname_arrest&offcode=to_offcode_arrest' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
                    <font style="color:red">*</font>
                </td>
                <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td>
                    <input name="to_posname_arrest" type="text" class="textview" readonly size="35" value=""/>
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ความเห็นอื่น :&nbsp;</td>
                <td colspan="3"><TEXTAREA NAME="to_lawyer_opinion" ROWS="2" COLS="73"></TEXTAREA></td>
            </tr>
            <tr>
                <td colspan="4">&nbsp;</td>
            </tr>
        </table>
        <table width="800" border="0" cellspacing="0" cellpadding="0">
            <tr class="bgRowGray">
                <td colspan="4"><strong>ความเห็นของผู้อำนวยการสำนักกฎหมาย</strong></td>
            </tr>
            <tr>
                <td width="20%" align="right">&nbsp;</td>
                <td width="30%">&nbsp;</td>
                <td width="20%" height="25" align="right" valign="middle">&nbsp;</td>
                <td width="30%">&nbsp;</td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td colspan="3"><input name="to_law_director_position" type="text" class="textbox" size="35"
                                       value="ผู้อำนวยการสำนักกฎมาย"/></td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ความเห็นอื่น :&nbsp;</td>
                <td colspan="3"><TEXTAREA NAME="to_law_director_opinion" ROWS="2" COLS="73"></TEXTAREA></td>
            </tr>
            <tr>
                <td colspan="4">&nbsp;</td>
            </tr>
        </table>
        <table width="800" border="0" cellspacing="0" cellpadding="0">
            <tr class="bgRowGray">
                <td colspan="4"><strong>คำสั่ง</strong></td>
            </tr>
            <tr>
                <td width="20%" align="right">&nbsp;</td>
                <td width="30%">&nbsp;</td>
                <td width="20%" height="25" align="right" valign="middle">&nbsp;</td>
                <td width="30%">&nbsp;</td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">คำสั่ง :&nbsp;</td>
                <td colspan="3"><TEXTAREA NAME="to_command" ROWS="2" COLS="73"></TEXTAREA></td>
            </tr>
            <tr>
                <td colspan="4">&nbsp;</td>
            </tr>
        </table>
        <table width="800" border="0" cellspacing="0" cellpadding="0">
            <tr class="bgRowGray">
                <td colspan="4"><strong>ลายมือชื่อของผู้รับรางวัล</strong></td>
            </tr>
            <tr>
                <td width="20%" align="right">&nbsp;</td>
                <td width="30%">&nbsp;</td>
                <td width="20%" height="25" align="right" valign="middle">&nbsp;</td>
                <td width="30%">&nbsp;</td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ความเห็นอื่น :&nbsp;</td>
                <td colspan="3"><TEXTAREA NAME="to_arrest_opinion" ROWS="2" COLS="73"></TEXTAREA></td>
            </tr>
            <tr>
                <td colspan="4">&nbsp;</td>
            </tr>
        </table>
    </td>
</tr>
<!-- End ยาสูบ-->
</c:if>

<c:if test="${atax != null}">
<!-- Start ภาษี-->
<tr id="Tax" style="display:none;">
<td>
<table width="800" border="0" cellspacing="0" cellpadding="0">
<tr class="bgRowGray">
    <td colspan="4"><strong>รายงานการจับกุม</strong></td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="center">
        <span class="spanLink"
              onClick="window.open('Reports/ApplicationCatchReportsTax.xps' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');">พิมพ์รายงาน</span>
    </td>
    <td colspan="3">&nbsp;</td>
</tr>
<tr>
    <td align="right">เรื่อง :&nbsp;</td>
    <td colspan="3">
        <input type="text" name="textfield12" class="textview" size="115"
               value="รายงานการจับกุมคดี พ.ร.บ.ภาษีสรรพสามิต พ.ศ. 2527">
    </td>
</tr>
<tr>
    <td width="20%" align="right">สินค้า :&nbsp;</td>
    <td width="30%">
        <input name="textfield" type="text" class="textview" readonly size="35" value="น้ำหอม"/>
    </td>
    <td width="50%" height="25" align="left" valign="middle" colspan="2">
        <INPUT TYPE="checkbox" NAME="chkInform" id="chkInform" Onclick="chkInform('chkInform','chkCountInform');">มีการแจ้งความ&nbsp;&nbsp;
        <INPUT TYPE="checkbox" NAME="chkCountInform" id="chkCountInform" disabled>ตรวจนับได้ตรงกับที่แจ้ง
    </td>
</tr>
<tr height="1">
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right" valign="top">ชนิดและปริมาณของที่จับได้ :&nbsp;</td>
    <td colspan="3">
        <table class="tableList" width="560" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="30" height="15" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                <td width="200" class="TblHeaderColumn ">ชื่อสินค้า</td>
                <td width="150" class="TblHeaderColumn ">ยี่ห้อ</td>
                <td width="80" class="TblHeaderColumn ">จำนวน</td>
                <td width="100" class="TblHeaderColumn ">หน่วย</td>
            </tr>
            <tr>
                <td class="TblRow AlignCenter">1</td>
                <td class="TblRow AlignLeft">น้ำหอม</td>
                <td class="TblRow AlignLeft">Fresh</td>
                <td class="TblRow" align="Right">12</td>
                <td class="TblRow AlignLeft">ขวด</td>
            </tr>
            <tr>
                <td class="bgRowGray AlignCenter">2</td>
                <td class="bgRowGray AlignLeft">น้ำหอมต่างประเทศ</td>
                <td class="bgRowGray AlignLeft">Very Fresh</td>
                <td class="bgRowGray" align="Right">1,500</td>
                <td class="bgRowGray AlignLeft">ขวด</td>
            </tr>
        </table>
    </td>
</tr>
<tr height="1">
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right" valign="top">ลักษณะที่ตรวจพบ :&nbsp;</td>
    <td colspan="3">
        <TEXTAREA NAME="" ROWS="2" COLS="73"></TEXTAREA>
        <font style="color:red">*</font>
    </td>
</tr>
<tr height="1">
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td height="25" align="right" valign="top">ผู้ช่วยเหลือ (ในคดี) :&nbsp;</td>
    <td colspan="3">
        <table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0">
            <tr class="TblHeaderColumn AlignCenter">
                <td width="50">ลำดับที่</td>
                <td width="30"><input type="checkbox" name="checkbox" value="checkbox"></td>
                <td width="150">ชื่อ-สกุล</td>
                <td width="150">ตำแหน่ง</td>
            </tr>
            <tbody id="helperBody">
            </tbody>
            <tr class="TblRow">
                <td class="TblRow AlignCenter">1</td>
                <td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                <td>นายฉลอง นิ่มเนียม</td>
                <td>นิติกรชำนาญการพิเศษ</td>
            </tr>
            <tr class="TblRow bgRowGray">
                <td class="TblRow AlignCenter">2</td>
                <td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                <td>นายเดชา บุญอินทร์</td>
                <td>นิติกรชำนาญการ</td>
            </tr>
            <tr class="TblRow">
                <td class="TblRow AlignCenter">3</td>
                <td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                <td>นางสาวพิมพ์พร ปิ่นเกตุ</td>
                <td>พนักงานประจำสำนักงาน</td>
            </tr>
            <tr class="TblRow bgRowGray">
                <td class="TblRow AlignCenter">4</td>
                <td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                <td>นายรวม อนุเครือ</td>
                <td>นักวิชาการสรรพสามิตชำนาญการ</td>
            </tr>
            <tr class="TblRow">
                <td class="TblRow AlignCenter">5</td>
                <td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                <td>นายณัฐศิริ เลิศชัยพนาวงศ์</td>
                <td>เจ้าพนักงานสรรพสามิตชำนาญงาน</td>
            </tr>
            <tr class="TblRow bgRowGray">
                <td class="TblRow AlignCenter">6</td>
                <td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                <td>นางสาวอุไรกร กุลศรี</td>
                <td>พนักงานประจำสำนักงาน</td>
            </tr>
        </table>
        <span class="spanLink"
              onClick="window.open('Popup/divide_staff_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=400,top=200,left=400,modal=yes');">เพิ่มรายการ</span>
        |
        <span class="spanLink">ลบรายการ</span>
        <font color="red" size="1"><i>* ดึงข้อมูลจาก APPLICATION_ARREST_TEAM มาแสดงเป็นค่าเริ่มต้น</i></font>
    </td>
</tr>
<tr height="1">
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ผู้ควบคุมการจับกุม&nbsp;:&nbsp;</td>
    <td>
        <input type="text" name="ta_staff_name_arrest" class="textview" size="37" value="">
        <input type="hidden" name="ta_staff_id_arrest" value=""/>
        <input type="hidden" name="ta_poscode_arrest" value=""/>
        <input type="hidden" name="ta_offcode_arrest" value=""/>
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
             onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_arrest&formname=ta_staff_name_arrest&id=ta_staff_id_arrest&posname=ta_posname_arrest&offcode=ta_offcode_arrest' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
    </td>
    <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
    <td>
        <input name="ta_posname_arrest" type="text" class="textview" readonly size="35" value=""/>
    </td>
</tr>
<tr>
    <td align="right" valign="top">รายละเอียดการจับกุม<br/>และความเห็น :&nbsp;</td>
    <td colspan="3">
        <TEXTAREA NAME="" ROWS="2" COLS="73"></TEXTAREA>
    </td>
</tr>
<tr height="1">
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right" valign="top">ความเห็นของผู้บังคับบัญชา :&nbsp;</td>
    <td colspan="3">
        <table border="0" cellpadding="0" cellspacing="0" width="100%">
            <tr>
                <td align="left" colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    1. ความเห็นของผู้บังคับบัญชาชั้นต้น :&nbsp;
                </td>
            </tr>
            <tr>
                <td align="right">ความเห็น :&nbsp;</td>
                <td colspan="3"><TEXTAREA NAME="" ROWS="2" COLS="60"></TEXTAREA></td>
            </tr>
            <tr>
                <td width="20%" height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
                <td width="30%">
                    <input type="text" name="textfield12" class="textview" size="25" value="">
                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                         onClick="window.open('Popup/arrest_accuser_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');">
                    <font style="color:red">*</font>
                </td>
                <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td width="30%">
                    <input name="textfield" type="text" class="textview" readonly size="30" value=""/>
                </td>
            </tr>
            <tr height="1">
                <td colspan="4">&nbsp;</td>
            </tr>
            <tr>
                <td align="left" colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    2. ความเห็นของผู้บังคับบัญชา :&nbsp;
                </td>
            </tr>
            <tr>
                <td align="right">ความเห็น :&nbsp;</td>
                <td colspan="3"><TEXTAREA NAME="" ROWS="2" COLS="60"></TEXTAREA></td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
                <td>
                    <input type="text" name="textfield12" class="textview" size="25" value="">
                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                         onClick="window.open('Popup/arrest_accuser_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');">
                    <font style="color:red">*</font>
                </td>
                <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td>
                    <input name="textfield" type="text" class="textview" readonly size="30" value=""/>
                </td>
            </tr>
        </table>
    </td>
</tr>
<tr height="1">
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right" valign="top">คำสั่ง :&nbsp;</td>
    <td colspan="3">
        <TEXTAREA NAME="" ROWS="2" COLS="73"></TEXTAREA>
    </td>
</tr>
<tr height="1">
    <td colspan="4">&nbsp;</td>
</tr>
</table>
<table width="800" border="0" cellspacing="0" cellpadding="0">
    <tr class="bgRowGray">
        <td colspan="4"><strong>การรับรองการจับกุมและผลคดี</strong></td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td width="20%" align="right">ชื่อผู้รับรอง :&nbsp;</td>
        <td width="30%">
            <input type="text" name="ta_staff_name_confirm" class="textview" size="37" value="">
            <input type="hidden" name="ta_staff_id_confirm" value=""/>
            <input type="hidden" name="ta_poscode_confirm" value=""/>
            <input type="hidden" name="ta_offcode_confirm" value=""/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_confirm&formname=ta_staff_name_confirm&id=ta_staff_id_confirm&posname=ta_posname_confirm&offcode=ta_offcode_confirm' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input name="ta_posname_confirm" type="text" class="textview" readonly size="35" value=""/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ชื่อผู้จับกุม&nbsp;:&nbsp;</td>
        <td>
            <input type="text" name="textfield12" class="textview" size="35" value="นายพงษ์สุระ จุลมานพ">
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('Popup/arrest_accuser_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');">
            <font style="color:red">*</font>
        </td>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td>
            <input name="textfield" type="text" class="textview" readonly size="35"
                   value="เจ้าพนักงานสรรพสามิตชำนาญงาน"/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">วันที่จับกุม :&nbsp;</td>
        <td valign="top" colspan="3">
            <input name="theDate2" type="text" class="textdate" readonly value="01/10/2552"/>
        </td>
    </tr>
    <tr>
        <td align="right">เปรียบเทียบปรับเป็นเงิน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="textfield12" class="textViewNum" size="20" value="51,000.00">บาท&nbsp;
            (ห้าหมื่นหนึ่งพันบาทถ้วน)
        </td>
    </tr>
    <tr>
        <td align="right">เงินสินบน 30% :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="textfield12" class="textViewNum" size="20" value="15,300.00">บาท&nbsp;
            (หนึ่งหมื่นห้าพันสามร้อยบาทถ้วน)
        </td>
    </tr>
    <tr>
        <td align="right">เงินรางวัล 25% :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="textfield12" class="textViewNum" size="20" value="12,750.00">บาท&nbsp;
            (หนึ่งหมื่นสองพันเจ็ดร้อยห้าสิบบาทถ้วน)
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
</table>
<table width="800" border="0" cellspacing="0" cellpadding="0">
    <tr class="bgRowGray">
        <td colspan="4"><strong>ดำเนินการขออนุมัติ</strong></td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td align="right">เรียน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="ta_ask_lean" class="textbox" size="35"
                   value="ผู้อำนวยการสำนักตรวจสอบ ป้องกันและปราบปราม">
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td align="right">เห็นควรส่ง :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="ta_department_name_send" class="textbox" size="35" value="ส่วนคดี สำนักกฎหมาย">
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ชื่อผู้ขออนุมัติ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" name="ta_staff_name_ark" class="textview" size="37" value="">
            <input type="hidden" name="ta_staff_id_ark" value=""/>
            <input type="hidden" name="ta_poscode_ark" value=""/>
            <input type="hidden" name="ta_offcode_ark" value=""/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_ark&formname=ta_staff_name_ark&id=ta_staff_id_ark&posname=ta_posname_ark&offcode=ta_offcode_ark' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
            <font style="color:red">*</font>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input name="ta_posname_ark" type="text" class="textview" readonly size="35" value=""/>
        </td>
    </tr>
</table>
<table width="800" border="0" cellspacing="0" cellpadding="0">
    <tr class="bgRowGray">
        <td colspan="4"><strong>พิจารณาอนุมัติ</strong></td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
    <tr>
        <td align="right">เรียน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="ta_approve_lean" class="textbox" size="35" value="ผู้อำนวยการสำนักกฎหมาย">
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ชื่อผู้อนุมัติ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" name="ta_staff_name_approve" class="textview" size="37" value="">
            <input type="hidden" name="ta_staff_id_approve" value=""/>
            <input type="hidden" name="ta_poscode_approve" value=""/>
            <input type="hidden" name="ta_offcode_approve" value=""/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_approve&formname=ta_staff_name_approve&id=ta_staff_id_approve&posname=ta_posname_approve&offcode=ta_offcode_approve' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
            <font style="color:red">*</font>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input name="ta_posname_approve" type="text" class="textview" readonly size="35" value=""/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
</table>
<!-- End ภาษี-->
</c:if>
</td>
</tr>
</table>
</td>
</tr>
</table>

</table>
</form>
<SCRIPT language="JavaScript">
    var frmvalidator = new Validator("dataform");
    var formType = jQuery('[name=legislation_id]').val();
    if(formType == 1){
        frmvalidator.addValidation("staff_name_request","req","กรุณาใส่ชื่อผู้ร้องขอจับกุม");
        frmvalidator.addValidation("legislation_id","req","กรุณาเลือก พ.ร.บ.");
        frmvalidator.addValidation("compare_case_no","req","กรุณาเลือก คดีเปรียบเทียบ");
        //frmvalidator.addValidation("al_accept_date","req","กรุณาใส่วันที่ยื่นคำร้อง");
        //frmvalidator.addValidation("al_report_to","req","กรุณาใส่ช่องเสนอ");
        //frmvalidator.addValidation("al_accept_lean","req","กรุณาใส่ช่องเรียน");
        //frmvalidator.addValidation("al_accept_desc","req","กรุณาใส่ช่องรับรอง");
        //frmvalidator.addValidation("al_leader_lean","req","กรุณาใส่ช่องเรียนหัวหน้าฝ่าย");
        //frmvalidator.addValidation("al_section_director_lean","req","กรุณาใส่ช่องเรียนผู้อำนวยการส่วน");
    }else if(formType == 2){

    }else if(formType == 4){

    }

</SCRIPT>
