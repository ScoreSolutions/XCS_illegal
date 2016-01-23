<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%@ include file="/Templates/meta.jsp" %>
<%@ page import="com.ko.util.ConfigUtil;" %>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type="text/javascript" language="JavaScript">
    var all_section;
    var mainthreefive;
    var subthreefive;
    var maintwofive;
    var subtwofive;

    function selectLegislation(LID) {

        mnu = document.getElementById(LID);
        if (mnu.value == "1") {
            document.getElementById('Alcohol').style.display = '';
            document.getElementById('Tobacco').style.display = 'none';
            document.getElementById('Tax').style.display = 'none';
        } else if (mnu.value == "4") {
            document.getElementById('Alcohol').style.display = 'none';
            document.getElementById('Tobacco').style.display = 'none';
            document.getElementById('Tax').style.display = '';
        }
    }
    function calReward() {
        var person_no = jQuery(".person_row").size() - 1;
        var data = window.showModalDialog('Popup/cal_divide_form.jsp?person=' + person_no, '_blank', 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=350,height=200,top=220,left=400,modal=yes');
        if (data) {
            var mapId = {};
            var arrest_co = data['arrest_co'];
            var command = data['command'];
            var helper = data['helper'];
            jQuery("[name=rda_duty_status_id][value!=1]").each(function(index) {
                if (index > 0) {
                    if (arrest_co > 0) {
                        jQuery(this).attr('value', '3');
                        arrest_co--;
                    } else if (command > 0) {
                        jQuery(this).attr('value', '4');
                        command--;
                    } else if (helper > 0) {
                        jQuery(this).attr('value', '5');
                        helper--;
                    } else {
                        alert("error out of index at " + index);
                    }
                }
            });
            mapId = calDescription();
            // manage arrest
            var arrest_row = jQuery(".person_row").has("[name=rda_duty_status_id][value=2]");
            var row_id = arrest_row.attr('id');
            var arrest_idcard_no = arrest_row.find("[name=rda_idcard_no]").attr('value');
            var multiple = mapId[arrest_idcard_no];
            var arrest_reward = round2remain((parseFloat(mainthreefive) + parseFloat(subthreefive)) + (multiple * parseFloat(maintwofive)) + parseFloat(subtwofive));
            arrest_row.find("[name=arrest]").attr('value', arrest_reward);
            arrest_row.find(".total").html(arrest_reward);

            var arrest_co_row = jQuery(".person_row").has("[name=rda_duty_status_id][value=3]");
            arrest_co_row.each(function() {
                var arrest_co_row = jQuery(this);
                var arrest_co_idcard_no = arrest_co_row.find("[name=rda_idcard_no]").attr('value');
                var multiple = mapId[arrest_co_idcard_no];
                var arrest_co_reward = round2decimal(parseFloat(mainthreefive) + (multiple * parseFloat(maintwofive)));
                arrest_co_row.find("[name=arrest_co]").attr('value', arrest_co_reward);
                arrest_co_row.find("[name=arrest]").attr('value', 0);
                arrest_co_row.find("[name=command]").attr('value', 0);
                arrest_co_row.find("[name=helper]").attr('value', 0);
                arrest_co_row.find(".total").html(arrest_co_reward);
            });

            var command_row = jQuery(".person_row").has("[name=rda_duty_status_id][value=4]");
            command_row.each(function() {
                var command_row = jQuery(this);
                var command_idcard_no = command_row.find("[name=rda_idcard_no]").attr('value');
                var multiple = mapId[command_idcard_no];
                var command_reward = round2decimal(multiple * maintwofive);
                command_row.find("[name=command]").attr('value', command_reward);
                command_row.find("[name=arrest]").attr('value', 0);
                command_row.find("[name=arrest_co]").attr('value', 0);
                command_row.find("[name=helper]").attr('value', 0);
                command_row.find(".total").html(command_reward);
            });

            var helper_row = jQuery(".person_row").has("[name=rda_duty_status_id][value=5]");
            helper_row.each(function() {
                var helper_row = jQuery(this);
                var command_idcard_no = helper_row.find("[name=rda_idcard_no]").attr('value');
                var multiple = mapId[command_idcard_no];
                var helper_reward = round2decimal(multiple * maintwofive);
                helper_row.find("[name=helper]").attr('value', helper_reward);
                helper_row.find("[name=arrest]").attr('value', 0);
                helper_row.find("[name=arrest_co]").attr('value', 0);
                helper_row.find("[name=command]").attr('value', 0);
                helper_row.find(".total").html(helper_reward);
            });
        }
    }

    
    function round2decimal(money){
        //alert(money);
        if(String(money).indexOf('.')>0){
            var tmp = String(money).split('.',2);
            if(tmp[1].length>2){
                tmp[1] = tmp[1].substring(0,2);
            }
            if(tmp[1].length<2){
                tmp[1] += '0';
            }
            return String(tmp[0]+'.'+tmp[1]);
        }else{
            return String(money)+'.00';
        }
    }
    function round2remain(money){
        if(String(money).indexOf('.')>0){
            var tmp = String(money).split('.',2);
            if(tmp[1].length>3){
                tmp[1] = tmp[1].substring(0,3);
                tmp[1] = tmp[1].substring(0,2)+'.'+tmp[1].charAt(2);
                tmp[1] = Math.round(tmp[1]);
                if(String(tmp[1]).length<2){
                    tmp[1] = '0'+tmp[1];
                }
            }
            if(String(tmp[1]).length<2){
                tmp[1] += '0';
            }
            return String(tmp[0]+'.'+tmp[1]);
        }else{
            return String(money)+'.00';
        }
    }

    function calDescription(init) {
        var reward = ${db.reward_money};
        var threefive = (reward * 3) / 5;
        var twofive = reward - threefive;
        var arrest = 1;
        var arrest_co = jQuery("[name=rda_duty_status_id][value=3]").size();
        var command = jQuery("[name=rda_duty_status_id][value=4]").size();
        var help_by = jQuery("[name=rda_duty_status_id][value=5]").size();
        
        mainthreefive = round2decimal(threefive / (arrest + arrest_co));
        subthreefive = round2remain(threefive - (mainthreefive * (arrest + arrest_co)));
        jQuery("#threefivemain").html(mainthreefive);
        jQuery("#threefivesub").html(subthreefive);
        
        document.getElementById("remarks_al").value = "3/5 ของเงินรางวัลคิดเป็นส่วนละ " + mainthreefive + " บาท เหลือเศษ " + subthreefive + " บาท แบ่งให้ผู้จับทั้งหมด\n";
        all_section = 0;
        var mapId = {};
        jQuery("[name=rda_duty_status_id][value!=1] ~ [name=rda_idcard_no]").each(function(index) {
            //Reward_divide.getShare_qty(jQuery(this).attr('value'), {callback:setQty, async:false});
            jQuery.ajax({
                url:'process?action=Reward_divide&cmd=getShareQty&idcard_no=' + jQuery(this).attr('value'),
                async:false,
                success: function(data) {
                    var val = data.split(',', 2);
                    all_section = all_section + parseInt(val[1]);
                    mapId[val[0]] = parseInt(val[1]);
                    //alert(mapId[jQuery(this).attr('value')]);
                }
            });
        });
        maintwofive = round2decimal(twofive / all_section);
        subtwofive = round2remain(twofive - (maintwofive * all_section));
        jQuery("#twofivemain").html(maintwofive);
        jQuery("#twofivesub").html(subtwofive);
        document.getElementById("remarks_al").value += "2/5 ของเงินรางวัลคิดเป็นส่วนละ " + maintwofive + " บาท เหลือเศษ " + subtwofive + " บาท แบ่งให้ผู้จับทั้งหมด";
        
        return mapId;
    }
    
    
    function deleterow() {
        jQuery(".person_row:has(:checked)").remove();
        jQuery(".person_row").each(function(index) {
            var i = index + 1;
            var row = jQuery(this);
            row.attr('id', 'person_row_' + i);
            row.find('td').first().html(i);
            row.find('td > [name=order_seq]').attr('value', i);
        });
    }

    function printReport(){
        var reward_money = document.dataform.reward_money.value;
        var sum_reward = 0;
        jQuery(".sum").each(function(index) {
            var i = jQuery(this).attr('value').toString();
            if (i != '') {
                sum_reward = (parseFloat(sum_reward) + parseFloat(i)).toFixed(2);
                //alert(sum_reward);
            }
        });
        
        //alert(parseFloat(sum_reward) + "  " + parseFloat(reward_money));
        if(parseFloat(sum_reward) == parseFloat(reward_money)){
            if(document.dataform.legislation_id.value=='<%=ConfigUtil.getConfig("legislation_alcohol")%>')
                printReports('ILL_P035&getDivideNo='+document.dataform.divide_no.value+'&time=<%=new java.util.Date().getTime()%>');
            else 
                printReports('ILL_P035_1&getDivideNo='+document.dataform.divide_no.value+'&time=<%=new java.util.Date().getTime()%>');
        }
        else{
            alert("กรุณาใส่จำนวนเงินรางวัลให้ตรงกับจำนวนรวมที่แบ่ง");
        }
    }
    function chkUncheckAll(prefix) {
        if (jQuery("#" + prefix).first().attr('checked')) {
            jQuery("input[name=chk1]").attr('checked', true);
        } else {
            jQuery("input[name=chk1]").attr('checked', false);
        }
    }

	function clickBack(){
		var ans = confirm("ยืนยันการกลับหน้าค้นหา");
		if(ans){
			writeTranLog('กลับหน้าค้นหา');
			window.location.href="<c:url value='process?action=Reward_divide&cmd=listAmm' />";
		}
	}
	function clickCancel(){
		var ans = confirm("ยืนยันการยกเลิกการแก้ไข");
		if(ans){
			writeTranLog('ยกเลิกการแก้ไขข้อมูลใบนำส่งของกลางเพื่อจัดเก็บ');
			window.location.href="<c:url value='${action}' />"; 
		}
	}
</script>


<form method="post" name="dataform" action="process?action=Reward_divide&cmd=create">
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
<tr>

<td width="100%" align="left" valign="top">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <td width="99%"><span class="websitename">แบ่งเงินสินบนรางวัล</span></td>
</tr>
<tr>
    <td height="25">&nbsp;</td>
    <td>
        <input name="btnSave" type="submit" class="barbutton" value="บันทึก">
        <input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข"
               onclick="clickCancel();">
        <input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา"
               onClick="clickBack();">
        <input name="btnPrint" type="button" class="barbutton" value="พิมพ์"
               onClick="printReport();">
    </td>
</tr>

<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>
        <table width="700" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="20%" align="right">วันที่แบ่งเงินรางวัล :&nbsp;</td>
                <td width="30%">
                    <input name="update" type="hidden" value="${update}"/>
                    <input name="rd_id" type="hidden" value="${db.id}"/>
                    <input name="com_id" type="hidden" value="${db.cc_id}"/>

                    <input name="divide_date" class="textdate" readonly id="divide_date"
                           value="<fmt:formatDate value="${rd.divide_date}" pattern="dd/MM/yyyy"/>" type="text"
                           size="10" maxlength="10">
                    <a href="javascript:NewCssCal('divide_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt=""
                                                                                   width="19" height="19" align="middle"
                                                                                   style="border-style: none"/></a>
                </td>
                <td width="20%" align="right">เลขที่งาน :&nbsp;</td>
                <td width="30%"><input name="divide_no"
                                       value="${(rd.divide_no!=null&&rd.divide_no!='')?(rd.divide_no):(divide_no)}"
                                       type="text" size="30" maxlength="30" class="textview"></td>
            </tr>
            <tr>
                <td align="right">วันที่รับเงินรางวัล :&nbsp;</td>
                <td colspan="3">
                    <input name="receive_date" id="receive_date" class="textdate" type="text" size="10" maxlength="10" readonly
                           value="<fmt:formatDate value="${rd.receive_date}" pattern="dd/MM/yyyy"/>">
                    <a href="javascript:NewCssCal('receive_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt=""
                                                                                   width="19" height="19" align="middle"
                                                                                   style="border-style: none"/></a>
                    <font style="color:red">*</font>
                </td>
            </tr>
            <tr>
                <td align="right">คดีเปรียบเทียบที่ :&nbsp;</td>
                <td>
                    <input name="compare_case_no" align="right" type="text" size="5"
                           value="${fn:substringBefore(db.compare_case_no,'/')}" readonly class="textreadonly">&nbsp;&nbsp;
                    /&nbsp;&nbsp;<input name="compare_case_no" align="right" type="text" size="5"
                                        value="${fn:substringAfter(db.compare_case_no,'/')}" readonly
                                        class="textreadonly">
                </td>
                <td align="right">วันที่เปรียบเทียบ :&nbsp;</td>
                <td>
                    <input name="compare_case_date" class="textdate" readonly type="text" value="${db.compare_case_date2}">
                </td>
            </tr>
            <tr>
                <td height="25" align="right">พ.ร.บ. :&nbsp;</td>
                <td>
                    <input type="hidden" name="legislation_id" id="legislation_id" value="${db.legislation_id}"/>
                    <input type="hidden" name="legislation_code" id="legislation_code" value="${db.legislation_code}"/>
                    <span class="textreadonly">${db.legislation_code} ${db.legislation_name}</span>
                </td>
                <td align="right">หน่วยงาน :&nbsp;</td>
                <td><input name="offname" value="${db.offname }" type="text" size="30" maxlength="30" class="textview">
                </td>
            </tr>
            <tr>
                <td align="right">เงินค่าปรับ :&nbsp;</td>
                <td>
                    <input name="fine_money" type="text" size="30" maxlength="30" class="textViewNum"
                           value="${db.fine_money }" style="background-color:#CCCCFF;">
                </td>
                <td align="right">ผู้กล่าวโทษ :&nbsp;</td>
                <td>
                    <input name="accuser_name" type="text" size="30" maxlength="30" class="textview"
                           value="${db.accuser_name }">
                </td>
            </tr>
            <tr>
                <td align="right">เงินสินบน :&nbsp;</td>
                <td>
                    <input name="birbe_money" type="text" size="30" maxlength="30" class="textViewNum"
                           value="${db.birbe_money }">
                </td>
                <td align="right">ผู้ต้องหา :&nbsp;</td>
                <td>
                    <!-- span class="textreadonly" width="30">${db.lawbreaker_name}</span -->
                    <input name="lawbreaker_name" type="text" size="30"  class="textview" value="${db.lawbreaker_name }" readonly>
                </td>
            </tr>
            <tr>
                <td align="right">เงินรางวัล :&nbsp;</td>
                <td colspan="3">
                    <input name="reward_money" type="text" size="30" maxlength="30" class="textViewNum" value="${db.reward_money }">
                </td>
            </tr>
            <tr>
                <td align="right">เงินส่งคลัง :&nbsp;</td>
                <td colspan="3">
                    <input name="treasury_money" type="text" size="30" maxlength="30" class="textViewNum"
                           value="${db.treasury_money }">
                </td>
            </tr>
        </table>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>

<c:if test="${db.legislation_code=='90'}">
    <jsp:include page='reward_divide_alcohol.jsp' />
</c:if>

<c:if test="${db.legislation_code=='00'}">
	<jsp:include page='reward_divide_tax.jsp' />
</c:if>
</table>
</td>
</tr>

</table>
</form>
<script type="text/javascript" language="JavaScript">
    var frmvalidator = new Validator("dataform");
    frmvalidator.addValidation("receive_date", "req", "กรุณากรอกวันที่รับเงินรางวัล");
    frmvalidator.setAddnlValidationFunction("DoCustomValidation");
    function DoCustomValidation()
    {
        var frm = document.forms["dataform"];
        var reward_money = frm.reward_money.value;
        var sum_reward = 0;
        jQuery(".sum").each(function(index) {
            var i = jQuery(this).attr('value');
            if (i != '') {
                sum_reward += parseFloat(i);
            }
        });
        var order_seq_dup = false;
        var order_empty = false;
        jQuery("[name=order_seq]").each(function(index) {
            var val = jQuery(this).attr('value');
            if (jQuery("[name=order_seq][value=" + val + "]").size() > 1) {
                order_seq_dup = true;
            }
            if (String(val).indexOf(".") >= 0)
                order_empty = true;
            if (val == '') {
                order_empty = true;
            }
        })
        if (order_seq_dup) {
            sfm_show_error_msg('มีลำดับที่ซ้ำกัน');
        }
        if (order_empty) {
            sfm_show_error_msg('ค่าลำดับไม่ถูกต้อง');
        }
        if (order_empty || order_seq_dup) {
            return false;
        }
        return true;
    }

    function calMoneyByStaff(){
    	if(document.dataform.legislation_id.value=='<%=ConfigUtil.getConfig("legislation_alcohol")%>'){
			for(var i=0; i < document.dataform.order_seq.length;i++){
				if(i>=1){
					var arrest = (document.dataform.arrest[i].value != "" ? parseFloat(document.dataform.arrest[i].value) : "0");
					var arrest_co = (document.dataform.arrest_co[i].value != "" ? parseFloat(document.dataform.arrest_co[i].value) : "0");
					var command = (document.dataform.command[i].value != "" ? parseFloat(document.dataform.command[i].value) : "0");
					var helper = (document.dataform.helper[i].value != "" ? parseFloat(document.dataform.helper[i].value) : "0");
		            var total = document.dataform.total_al[i-1];
		        	total.value = parseFloat(arrest) + parseFloat(arrest_co) + parseFloat(command) + parseFloat(helper);
				}
			}
    	}else{
        }
    }
</script>

	