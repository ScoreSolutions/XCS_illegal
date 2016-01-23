<%@ page import="java.util.Date" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%@include file="/Templates/meta.jsp" %>
<%@ page import="com.ko.util.NumberUtil" %>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>

<script type="text/javascript" language="JavaScript">
	function convertNumber(){
		var lID = document.getElementById("legislation_id").value;

		if(lID == "1"){
			document.getElementById('alFineText').innerHTML = getThaiBaht(document.getElementById('al_fine').value);
			document.getElementById('alBirbeText').innerHTML = getThaiBaht(document.getElementById('al_bribe_money').value);
			document.getElementById('alRewardText').innerHTML = getThaiBaht(document.getElementById('al_reward_money').value);
		}else if(lID == "2"){
			document.getElementById('toFineText').innerHTML = getThaiBaht(document.getElementById('to_fine').value);
			document.getElementById('toRewardText').innerHTML = getThaiBaht(document.getElementById('to_reward_money').value);
		}else if(lID == "4"){
			document.getElementById('taFineText').innerHTML = getThaiBaht(document.getElementById('ta_fine').value);
			document.getElementById('taBirbeText').innerHTML = getThaiBaht(document.getElementById('ta_birbe_money').value);
			document.getElementById('taRewardText').innerHTML = getThaiBaht(document.getElementById('ta_reward_money').value);
		}
	}
    function selectLegislation(LID) {

        mnu = document.getElementById(LID);
        if (mnu.value == 1) {
            document.getElementById('Alcohol').style.display = '';
            document.getElementById('Tobacco').style.display = 'none';
            document.getElementById('Tax').style.display = 'none';
        } else if (mnu.value == 2) {
            document.getElementById('Alcohol').style.display = 'none';
            document.getElementById('Tobacco').style.display = '';
            document.getElementById('Tax').style.display = 'none';
        } else if (mnu.value == "92") {
            document.getElementById('Alcohol').style.display = 'none';
            document.getElementById('Tobacco').style.display = 'none';
            document.getElementById('Tax').style.display = 'none';
        } else if (mnu.value == 4) {
            document.getElementById('Alcohol').style.display = 'none';
            document.getElementById('Tobacco').style.display = 'none';
            document.getElementById('Tax').style.display = '';
        }
    }

    function changeForm(ccid) {
        addCompareCaseInformation(ccid);
        addTeam(ccid, 3, 'coArrestBody');
        addTeam(ccid, 4, 'commanderBody');
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
				//สุรา
                jQuery("[name=al_fine]").val(ccdata[0]['fine_case']);
                jQuery("[name=al_bribe_money]").val(ccdata[0]['bribe_money']);
                jQuery("[name=al_reward_money]").val(ccdata[0]['reward_money']);
                jQuery('[name=al_staff_name_arrest]').val(ccdata[0]['accuser_name']);
                jQuery('[name=al_staff_id_arrest]').val(ccdata[0]['aa_idcard_no']);
                jQuery('[name=al_poscode_arrest]').val(ccdata[0]['aa_poscode']);
                jQuery('[name=al_offcode_arrest]').val(ccdata[0]['aa_offcode']);
                jQuery('[name=al_posname_arrest]').val(ccdata[0]['posaname']);
                jQuery('[name=al_offname_arrest]').val(ccdata[0]['aa_offname']);

				//ยาสูบ
				jQuery('[name=to_staff_name_arrest]').val(ccdata[0]['accuser_name']);
				jQuery('[name=to_staff_id_arrest]').val(ccdata[0]['aa_idcard_no']);
				jQuery('[name=to_poscode_arrest]').val(ccdata[0]['aa_poscode']);
				jQuery('[name=to_offcode_arrest]').val(ccdata[0]['aa_offcode']);
				jQuery('[name=to_posname_arrest]').val(ccdata[0]['posaname']);

                jQuery('[name=staff_id_request]').val(ccdata[0]['aa_idcard_no']);
                jQuery('[name=staff_name_request]').val(ccdata[0]['accuser_name']);
                jQuery('[name=poscode_request]').val(ccdata[0]['aa_poscode']);
                jQuery('[name=staff_posname_request]').val(ccdata[0]['posaname']);
                jQuery('[name=notice_no]').val(ccdata[0]['notice_no']);
                jQuery('[name=staff_posname_receive]').val(ccdata[0]['staff_posname_receive']);
                jQuery('[name=poscode_receive]').val(ccdata[0]['poscode_receive']);
                jQuery('[name=staff_id_receive]').val(ccdata[0]['staff_id_receive']);
                jQuery('[name=staff_name_receive]').val(ccdata[0]['staff_name_receive']);
                jQuery('[name=inform_name]').val(ccdata[0]['inform_name']);
                jQuery('[name=receive_time]').val(ccdata[0]['receive_time']);
                jQuery('[name=receive_date]').val(ccdata[0]['receive_date']);

                var legislation_id = jQuery('[name=legislation_id]').val();
                if(legislation_id == 4){
					jQuery('[name=txtProductGroupName]').val(ccdata[0]['group_name']);
                    jQuery('[name=txtAccuserName]').val(ccdata[0]['accuser_name']);
                    jQuery('[name=txtAccuserPosname]').val(ccdata[0]['posaname']);
                    jQuery('[name=txtOccurrenceDate]').val(ccdata[0]['occurrence_date']);
                    jQuery('[name=ta_fine]').val(ccdata[0]['fine_case']);
                    jQuery('[name=ta_birbe_money]').val(ccdata[0]['bribe_money']);
                    jQuery('[name=ta_reward_money]').val(ccdata[0]['reward_money']);
                    
                    
                    addTaxItems(ccdata[0]['track_no'],'exhibit_item');
                    addTeam(ccdata[0]['id'], 5, 'helperBody');
                }
            }
        });
        
    }
    function addTaxItems(track_no, table_name){
        jQuery.ajax({
            url:'process?action=Ajax&cmd=getApplicationArrestExhibitItems&track_no=' + track_no ,
            async:false,
            success: function(data) {
                data = data.replace(/null/ig,'\"\"');
                var ccdata = eval('(' + data + ')');
                var tab = jQuery('#' + table_name);
                var base = jQuery("#" + table_name + " > tr ").size() + 1;
				for(i = 0; i < ccdata.length; i++){
					if (jQuery("[name=" + table_name + "_duty_code][value=" + ccdata[i]['duty_code'] + "]").size() > 0) {

                    } else {
                    	var row = jQuery("<tr />").attr({id:table_name + '_row_' + (base + i)});
    					row.append(jQuery("<td /").html(ccdata[i]["duty_name"]));
    					row.append(jQuery("<input />").attr({type:'text',n_ame:table_name + '_duty_code',value:ccdata[i]['duty_code']}));

    					tab.append(row);
                    }
				}
                
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
                        row.append(jQuery("<td />").html(teamList[i]['posname'] + ' ' + teamList[i]['staff_level']));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_id',value:''}));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_idcard_no',value:teamList[i]['idcard_no']}));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_poscode',value:teamList[i]['poscode']}));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_offcode',value:teamList[i]['offcode']}));
                        row.append(jQuery("<input />").attr({type:'hidden',n_ame:table_name + '_level',value:teamList[i]['staff_level']}));
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
        var legislation_id = document.dataform.legislation_id.value;
        if(legislation_id == 1)
        	printReports('ILL_P023_1&getTrackNo='+document.dataform.request_no.value);
        else if(legislation_id == 2)
        	printReports('ILL_P023_2&getTrackNo='+document.dataform.request_no.value);
        else if(legislation_id == 4)
    		printReports('ILL_P023_4&getTrackNo='+document.dataform.request_no.value);
    }

	function chkInform1(iID, cID){
	    var chkI = document.getElementById(iID);
	    var chkC = document.getElementById(cID);
	    if (chkI.checked == true) {
	        chkC.disabled = false;
	    } else {
	        chkC.disabled = true;
	        chkC.checked = false;
	    }
	}
</script>
<form action="process?action=ApplicationRewardRequest&cmd=save" method="post" name="dataform" id="dataform">
<input type="hidden" name="ar_id" value="${db.id}" />
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
	        <input name="btnSave" type="submit" class="barbutton" value="บันทึก" onClick="return validate();" >
	        <input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="location.href='process?action=ApplicationRewardRequest&cmd=add'">
	        <input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="location.href='process?action=ApplicationRewardRequest&cmd=list'">
	        <c:if test="${db != null}">
	        	<input name="btnPrint" type="button" class="barbutton" value="พิมพคำร้อง" onClick="PrintReport();">
	        </c:if>
	        
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
	        <tr>
	                <td width="20%" height="25" align="right" valign="middle">เลขที่เอกสาร&nbsp;:&nbsp;</td>
	                <td width="30%">
	                    <input type="Text" id="request_no" name="request_no" value="${db.request_no}" class="textview" size="20" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
	                </td>
	                <td width="20%" height="25" align="right" valign="middle">วันที่ :&nbsp;</td>
	                <td width="30%">
	                	<c:if test="${db.request_date == null}">
	                    	
	                        <input name="request_date" type="text" id="request_date" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="<fmt:formatDate pattern='dd/MM/yyyy' value='<%=new Date()%>'/>">
                            <a href="javascript:NewCssCal('request_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
	                    </c:if>
	                    <c:if test="${db.request_date != null}">
	                    	<!--<input name="request_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.request_date}" /> -->
	                    	 <input name="request_date" type="text" id="request_date" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${db.request_date}">
                            <a href="javascript:NewCssCal('request_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
	                    	
	                    	</c:if>
	                </td>
	            </tr>
	            <tr class="bgRowGray">
	                <td colspan="4"><strong>คำร้องขอรับเงินรางวัล</strong></td>
	            </tr>
	            <tr>
	                <td height="25" align="right">พ.ร.บ. :&nbsp;</td>
	                <td colspan="3">
	                	<c:if test="${db.id == null}">
		                    <select name="legislation_id" id="legislation_id" style="width:200px;"
		                            OnChange="selectLegislation('legislation_id');" >
		                        <option value="1" selected>90 พ.ร.บ. สุรา พ.ศ.2493</option>
		                        <option value="2">91 พ.ร.บ. ยาสูบ พ.ศ.2509</option>
		                        <option value="4">00 พ.ร.บ. ภาษีสรรพสามิต พ.ศ.2527</option>
		                    </select>
		                    <font style="color:red">*</font>
	                    </c:if>
	                    <c:if test="${db.id != null}" >
	                    	<input type="hidden" id="legislation_id" name="legislation_id" value="${db.legislation_id}"></input>
	                    	<input type="text" name="legislation_name" value="${db.legislation_name}" size="37" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" ></input>
	                    </c:if>
	                </td>
	            </tr>
	            <tr height="25">
	                <td  align="right" valign="middle">คดีเปรียบเทียบที่&nbsp;:&nbsp;</td>
	                <td>
	                    <input type="hidden" name="compare_case_id" value="${db.compare_case_id}"/>
	                    <input class="textview" type="text" name="compare_case_no" value="${db.compare_case_no}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
	                    <c:if test="${db.id == null}" >
		                    <img src="images/btn_browse.png" width="18" height="19" border="0" alt="ค้นหาหน่วยงาน"
		                         style="cursor: hand" name="search_from_corporation_code" id="search_from_corporation_code"
		                         onclick="window.showModalDialog('process?action=ApplicationRewardRequest&cmd=openCompareCasePopup&R=1&legislation_id='+jQuery('[name=legislation_id] > option:selected').val() , self , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');convertNumber();">
		                    <font style="color:red">*</font>
	                    </c:if>
	                </td>
	                <td  align="right" valign="middle">วันที่เปรียบเทียบ :&nbsp;</td>
	                <td>
	                    <input name="compare_case_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" 
	                    value="${db.compare_case_date }"/>
	                </td>
	            </tr>
	            <tr height="25">
	                <td align="right" valign="middle">ชื่อผู้ต้องหา :&nbsp;</td>
	                <td>
	                    <input type="text" name="lawbreaker_name" class="textview" size="37" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.lawbreaker_name}">
	                </td>
	                <td align="right" valign="middle">ชื่อผู้กล่าวหา :&nbsp;</td>
	                <td>
	                    <input type="Text" id="accuser_name" name="accuser_name" 
	                           value="${db.accuser_name }" class="textview" size="35" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
	                </td>
	            </tr>
	            <tr height="25">
	                <td align="right">ความผิดฐาน :&nbsp;</td>
	                <td colspan="3">
	                    <input type="text" name="guilt_base" class="textview" size="115" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.guilt_base}">
	                </td>
	            </tr>
	            <tr height="25">
	                <td align="right">มาตรา :&nbsp;</td>
	                <td>
	                    <input type="text" name="case_law_id" class="textview" size="37" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.case_law_id}">&nbsp;
	                </td>
	                <td align="right">บทกำหนดโทษ :&nbsp;</td>
	                <td><input type="text" name="penalty_case_law_id" class="textview" size="36" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.penalty_case_law_id}">
	                </td>
	            </tr>
	            <tr height="25">
	                <td align="right">สถานที่เกิดเหตุ :&nbsp;</td>
	                <td colspan="3">
	                    <input type="text" name="scene_addr" class="textview" size="115"
	                           onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.scene_addr}">&nbsp;
	                </td>
	            </tr>
	             <tr height="25">
	                <td align="right" valign="middle">ชื่อผู้ร้องขอ/ผู้จับกุม&nbsp;:&nbsp;</td>
	                <td>
	                    <input type="text" id="staff_name_request" name="staff_name_request" class="textview" size="33" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.request_staff_name} ">
	                    <input type="hidden" id="staff_id_request" name="staff_id_request" value="${db.staff_id_request }"/>
	                    <input type="hidden" id="poscode_request" name="poscode_request" value="${db.posrcode}"/>
	                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
	                         onClick="window.open('process?action=Divide_staff_popForArrest&formname=staff_name_request&id=staff_id_request&posname=staff_posname_request&poscode=poscode_request' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
	                    
<!--	                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"-->
<!--	                         onClick="window.open('process?action=Divide_staff_pop&poscode=poscode_request&formname=staff_name_request&id=staff_id_request&posname=staff_posname_request' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>-->
	                         								
	                    <font style="color:red">*</font>
	                </td>
	                <td align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
	                <td>
	                    <input id="staff_posname_request" name="staff_posname_request" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${db.posrname }"/>
	                </td>
	            </tr>
	            <tr>
	                <td height="25" align="right" valign="middle" colspan="4">&nbsp;&nbsp;</td>
	            </tr>
	            <tr>
	                <td height="25" align="right" valign="top">ผู้ร่วมจับกุม :&nbsp;</td>
	                <td colspan="3">
	                    <table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0">
	                        <thead>
	                        <tr class="TblHeaderColumn AlignCenter">
	                            <td width="50"bgcolor="#F5F5F5">ลำดับที่</td>
	                            <td width="30"bgcolor="#F5F5F5"><input type="checkbox" id="chkcoArrestBody" name="chkcoArrestBody"
	                                                  value="checkbox" onclick="chkUncheckAll('chkcoArrestBody');"></td>
	                            <td width="150"bgcolor="#F5F5F5">ชื่อ-สกุล</td>
	                            <td width="150"bgcolor="#F5F5F5">ตำแหน่ง</td>
	                        </tr>
	                        </thead>
	                        <tbody id="coArrestBody">
		                        <c:forEach items="${co_arrests}" var="co_arrest" varStatus="i">
		                            <tr>
			                            <td class="TblRow AlignCenter">${i.count}</td>
			                            <td class="TblRow AlignCenter">
			                            	<input name="chkcoArrestBody${i.count}" type="checkbox"/>
			                                <input type="hidden" name="coArrestBody_id" value="${co_arrest.id}"/>
			                                <input type="hidden" name="coArrestBody_idcard_no" value="${co_arrest.staff_idcardno}"/>
			                                <input type="hidden" name="coArrestBody_level" value="${co_arrest.staff_level}"/>
			                                <input type="hidden" name="coArrestBody_poscode" value="${co_arrest.poscode}"/>
			                                <input type="hidden" name="coArrestBody_offcode" value="${co_arrest.offcode}"/>
			                            </td>
			                            <td align="left" valign="top" class="TblRow AlignLeft">${co_arrest.staff_name}</td>
			                            <td align="left" valign="top" class="TblRow AlignLeft">${co_arrest.staff_posname} ${co_arrest.staff_level}</td>
		                            </tr>
		                        </c:forEach>
	                        </tbody>
	                    </table>
	                    <span class="spanLink" onClick="aatopenmodal('coArrestBody');">เพิ่มรายการ</span> |
	                    <span class="spanLink" onclick="aatget_check_value('coArrestBody')">ลบรายการ</span>
	                    
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
	                            <td width="50"bgcolor="#F5F5F5">ลำดับที่</td>
	                            <td width="30"bgcolor="#F5F5F5"><input type="checkbox" id="chkcommanderBody" name="chkcommanderBody"
	                                                  value="checkbox" onclick="chkUncheckAll('chkcommanderBody');"></td>
	                            <td width="150"bgcolor="#F5F5F5">ชื่อ-สกุล</td>
	                            <td width="150"bgcolor="#F5F5F5">ตำแหน่ง</td>
	                        </tr>
	                        </thead>
	                        <tbody id="commanderBody">
			                     <c:forEach items="${commanders}" var="cm" varStatus="i">
				                     <tr>
			                            <td class="TblRow AlignCenter">${i.count}</td>
			                            <td class="TblRow AlignCenter"><input name="chkcommanderBody${i.count}" type="checkbox"/>
			                                <input type="hidden" name="commanderBody_id" value="${cm.id}"/>
			                                <input type="hidden" name="commanderBody_idcard_no" value="${cm.staff_idcardno}"/>
			                                <input type="hidden" name="commanderBody_level" value="${cm.staff_level}"/>
			                                <input type="hidden" name="commanderBody_poscode" value="${cm.poscode}"/>
			                                <input type="hidden" name="commanderBody_offcode" value="${cm.offcode}"/>
			                            </td>
			                            <td align="left" valign="top" class="TblRow AlignLeft">${cm.staff_name}</td>
			                            <td align="left" valign="top" class="TblRow AlignLeft">${cm.staff_posname} ${cm.staff_level}</td>
			                        </tr>
		                        </c:forEach>
	                        </tbody>
	                    </table>
	                    <span class="spanLink" onClick="aatopenmodal('commanderBody');">เพิ่มรายการ</span> |
	                    <span class="spanLink" onclick="aatget_check_value('commanderBody')">ลบรายการ</span>
	                    
	                </td>
	            </tr>
	            <tr>
	                <td height="25" align="right" valign="middle" colspan="4">&nbsp;&nbsp;</td>
	            </tr>
	            <tr>
	                <td height="25" align="right" valign="middle">ชื่อผู้แจ้งความ&nbsp;:&nbsp;</td>
	                <td>
	                    <input type="text" name="inform_name" class="textbox" size="28" value="${db.inform_name}">
	                </td>
	                <td height="25" align="right" valign="middle" style="width: 189px">เลขที่งานใบแจ้งความนำจับ :&nbsp;</td>
	                <td>
	                    <input name="notice_no" id="notice_no" type="text" class="textview" size="28" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.inform_position }"/>
	                </td>
	            </tr>
	            <tr>
	                <td height="25" align="right" valign="middle">ชื่อผู้รับแจ้งความ&nbsp;:&nbsp;</td>
	                <td>
	                    <input type="text" id="staff_name_receive" name="staff_name_receive" class="textview" size="33" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.receive_staff_name }">
	                    <input type="hidden" id="staff_id_receive" name="staff_id_receive" value="${db.staff_id_receive }"/>
	                    <input type="hidden" id="poscode_receive" name="poscode_receive" value="${db.poscode_receive }"/>
	                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
	                         onClick="window.open('process?action=Divide_staff_pop&poscode=poscode_receive&formname=staff_name_receive&id=staff_id_receive&posname=staff_posname_receive' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
	                </td>
	                <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
	                <td>
	                    <input id="staff_posname_receive" name="staff_posname_receive" type="text" class="textview" readonly size="35" value="${db.receive_posname }"/>
	                </td>
	                
	            </tr>
	            <tr>
	                <td height="25" align="right" valign="middle">วันที่รับแจ้งความ :&nbsp;</td>
	                <td colspan="3">
	                    <input type="Text" id="receive_date" name="receive_date" value="${db.receive_date}" size="12" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textdate"/>
	                    <a href="javascript:NewCssCal('receive_date','ddMMyyyy','dropdown',false)">
	                    <img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" id="receive_date_img" width="19" height="19"/>
	                    </a>
	                    	เวลา :<input type="Text" id="receive_time" name="receive_time" value="${db.receive_time}" onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);" size="5" class="textbox"/>
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
				<c:if test="${db.legislation_id == null}">
					<!-- Start สุรา-->
					<tr id="Alcohol"  >
						<td>
							<jsp:include page='reward_request_alcohol.jsp' />
						</td>
					</tr>
					<!-- End สุรา-->
					<!-- Start ยาสูบ-->
					<tr id="Tobacco" style="display:none" >
					    <td>
							<jsp:include page='reward_request_tobacco.jsp' />
					    </td>
					</tr>
					<!-- End ยาสูบ-->
					<!-- Start ภาษี-->
					<tr id="Tax" style="display:none" >
						<td>
							<jsp:include page='reward_request_tax.jsp' />
						</td>
					<!-- End ภาษี-->
				</c:if>
				<c:if test="${db.legislation_id != null}">
					<!-- Start สุรา-->
					<tr  <c:if test="${db.legislation_id != '1' }">style="display:none"</c:if> >
						<td>
							<jsp:include page='reward_request_alcohol.jsp' />
						</td>
					</tr>
					<!-- End สุรา-->
					
					
					<!-- Start ยาสูบ-->
					<tr  <c:if test="${db.legislation_id != '2' }">style="display:none"</c:if> >
					    <td>
							<jsp:include page='reward_request_tobacco.jsp' />
					    </td>
					</tr>
					<!-- End ยาสูบ-->
					
					
					<!-- Start ภาษี-->
					<tr <c:if test="${db.legislation_id != '4' }">style="display:none"</c:if> >
						<td>
							<jsp:include page='reward_request_tax.jsp' />
						</td>
					<!-- End ภาษี-->
				</c:if>
				</tr>
			</table>
		</td>
	</tr>
</table>

</table>
</form>
<SCRIPT language="JavaScript">
    //var frmvalidator = new Validator("dataform");
    //var formType = jQuery('[name=legislation_id]').val();
    
    //frmvalidator.addValidation("legislation_id","req","กรุณาเลือก พ.ร.บ.");
    //frmvalidator.addValidation("compare_case_no","req","กรุณาเลือก คดีเปรียบเทียบ");
    //frmvalidator.addValidation("staff_name_request","req","กรุณากรอกชื่อผู้ร้องขอจับกุม");

    //if(formType == 1){
     //   frmvalidator.addValidation("al_accept_date","req","กรุณาวันที่รับรองผลคดี");
     //   frmvalidator.addValidation("al_report_to","req","กรุณากรอกช่องเสนอ");
     //   frmvalidator.addValidation("al_accept_lean","req","กรุณากรอกช่องเรียน");
     //   frmvalidator.addValidation("al_staff_name_arrest","req","กรุณากรอกชื่อผู้จับกุม");

    //}else if(formType == 2){
    //	frmvalidator.addValidation("to_staff_name_arrest","req","กรุณากรอกชื่อผู้จับกุม");
    //}else if(formType == 4){
    //	frmvalidator.addValidation("abnormaly","req","กรุณากรอกลักษณะที่ตรวจพบ");
    //	frmvalidator.addValidation("ta_ask_lean","req","กรุณากรอกเรียน");
    //	frmvalidator.addValidation("ta_department_name_send","req","กรุณากรอกเห็นควรส่ง");
    //	frmvalidator.addValidation("ta_staff_name_ark","req","กรุณากรอกชื่อผู้ขออนุมัติ");
    //}

    function validate(){
        //alert("valiedate");
        var ret = true;
    	var formType = jQuery('[name=legislation_id]').val();
    	var doc = document.dataform;
    	if(doc.legislation_id.value == ""){
			alert("กรุณาเลือก พ.ร.บ.");
			doc.legislation_id.select();
			ret = false;
        }else if(doc.compare_case_no.value == ""){
        	alert("กรุณาเลือก คดีเปรียบเทียบ");
			doc.compare_case_no.focus();
			ret = false;
        }else if(doc.staff_name_request.value == ""){
        	alert("กรุณากรอกชื่อผู้ร้องขอจับกุม");
			doc.staff_name_request.focus();
			ret = false;
        }else{
			if(formType == 1){
				if(doc.al_accept_date.value==""){
					alert("กรุณาเลือกวันที่รับรองผลคดี");
					doc.al_accept_date.focus();
					ret = false;
				}else if(doc.al_report_to.value == ""){
					alert("กรุณากรอกช่องเสนอ");
					doc.al_report_to.focus();
					ret = false;
				}else if(doc.al_accept_lean.value == ""){
					alert("กรุณากรอกช่องเรียน");
					doc.al_accept_lean.focus();
					ret = false;
				}else if(doc.al_staff_name_arrest.value == ""){
					alert("กรุณากรอกชื่อผู้จับกุม");
					doc.al_staff_name_arrest.focus();
					ret = false;
				}else if(doc.al_accept_desc.value == ""){
					alert("กรุณากรอกขอรับรองว่า");
					doc.al_accept_desc.focus();
					ret = false;
				}
			}else if(formType == 2){
				if(doc.to_staff_name_arrest.value==""){
					alert("กรุณากรอกชื่อผู้จับกุม");
					doc.to_staff_name_arrest.focus();
					ret = false;
				}
			}else if(formType == 4){
				if(doc.abnormaly.value == ""){
					alert("กรุณากรอกลักษณะที่ตรวจพบ");
					doc.abnormaly.focus();
					ret = false;
				}else if(doc.ta_ask_lean.value == ""){
					alert("กรุณากรอกเรียน");
					doc.ta_ask_lean.focus();
					ret = false;
				}else if(doc.ta_department_name_send.value == ""){
					alert("กรุณากรอกเห็นควรส่ง");
					doc.ta_department_name_send.focus();
					ret = false;
				}else if(doc.ta_staff_name_ark.value == ""){
					alert("กรุณากรอกชื่อผู้ขออนุมัติ");
					doc.ta_staff_name_ark.focus();
					ret = false;
				}
			}
        }

        return ret;
    }

    convertNumber();
</SCRIPT>
