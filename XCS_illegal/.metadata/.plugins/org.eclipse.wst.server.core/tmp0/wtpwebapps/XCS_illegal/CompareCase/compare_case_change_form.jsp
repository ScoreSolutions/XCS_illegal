<%@ page import="java.util.Date" %>
<%@ page import="com.ko.webapp.util.InvoiceUtil" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>

<script type="text/javascript">
    function initValue() {
        var ans = confirm("ยืนยันการยกเลิกการแก้ไข");
        if(ans){
	        writeTranLog('ยกเลิกการแก้ไขข้อมูลการเพิ่มลดค่าปรับเปรียบเทียบ');
	        window.location.href='<c:url value="${action}" />';
        }
    }
    function back2search() {
        var ans = confirm("ยืนยันการกลับหน้าค้นหา");
        if(ans){
	        writeTranLog('กลับหน้าค้นหา');
	        location.href = "process?action=CompareCaseChange&cmd=list";
        }
    }
    function changeForm(ccvalue) {
        location.href = "process?action=CompareCaseChange&cmd=add&ccid=" + ccvalue;
    }
    function calValue(money) {
    <c:if test="${cc != null}" >
        var dif = ${cc.case_fine}-money;
        var lbs = ${cc.lawbreakersQty};
        if (dif >= 0) {
            jQuery("[name=case_fine_diff]").val(AddComma(dif));
            jQuery("#compare_fine_type_text").html('ปรับลด');
            jQuery("[name=change_type]").val(2);
            document.getElementById("decrease_inv").style.display = '';
            document.getElementById("auto_inv").style.display = 'none';
            document.getElementById("manual_inv").style.display = 'none';
            document.getElementById("inv_select").style.display = 'none';

            //
        } else {
            jQuery('[name=inv_type]').val('M');
            jQuery("[name=case_fine_diff]").val(AddComma(Math.abs(dif)));
            jQuery("#compare_fine_type_text").html('ปรับเพิ่ม');
            jQuery("[name=change_type]").val(1);
            
            document.getElementById("decrease_inv").style.display = 'none';
            document.getElementById("auto_inv").style.display = 'none';
            document.getElementById("manual_inv").style.display = '';
            document.getElementById("inv_select").style.display = '';
            jQuery("#receipt2").attr('checked', true);

            var cci_id = jQuery('[name=cci_id]');
            if (cci_id != null)
            {
				for(var i=0;i<cci_id.length;i++){
					jQuery("#lManualFine"+(i+1)).html(AddComma(Math.abs(dif)));
				}
            }
        }
        var total = lbs * money;
        jQuery("[name=case_fine_total_new]").val(AddComma(total));
        jQuery("[name=case_fine_total_diff]").val(AddComma(Math.abs(total - (${cc.case_fine} * lbs))));
        jQuery("[name=birbe_money_new]").val(AddComma(total * ${cc.bribe_money_p} / 100));
        jQuery("[name=birbe_money_diff]").val(AddComma(Math.abs(${cc.birbe_money} - total * ${cc.bribe_money_p}/100)));
        jQuery("[name=reward_money_new]").val(AddComma(total * ${cc.reward_money_p}/100));
        jQuery("[name=reward_money_diff]").val(AddComma(Math.abs(${cc.reward_money} -total * ${cc.reward_money_p}/100)));
        jQuery("[name=treasury_money_new]").val(AddComma(total * ${cc.treasury_money_p}/100));
        jQuery("[name=treasury_money_diff]").val(AddComma(Math.abs(${cc.treasury_money} -total * ${cc.treasury_money_p}/100)));
    </c:if>
    }
    function chkManual(flag) {
        if (flag) {
            // display auto
            jQuery('[name=inv_type]').val('A');
            document.getElementById('auto_inv').style.display = '';
            document.getElementById('manual_inv').style.display = 'none';
        } else {
            // display manual
            jQuery('[name=inv_type]').val('M');
            document.getElementById('auto_inv').style.display = 'none';
            document.getElementById('manual_inv').style.display = '';
        }
    }
    function saveInvAuto(index) {
        var case_fine_new = jQuery("[name=case_fine_new]").val();
        //alert(case_fine_new);
        var data = [];
        if (case_fine_new != '') {
            var saveRow = jQuery("#auto_inv_row_" + index);
            var lb_id = saveRow.find("[name=auto_lb_id]").val();
            var paper_no = saveRow.find("[name=auto_paper_no]").val();
            var method = saveRow.find("[name=btnAuto]").first().html();
            //alert(lb_id);
            //alert(paper_no);
            if(method == 'ยกเลิก'){
                jQuery.ajax({
                    url:'process?action=CompareCaseChange&cmd=cancelAutoInvoiceAjax&lb_id=' + lb_id + '&paper_no=' + paper_no + "&",
                    data:jQuery("#data_form").serialize(),
                    async:false,
                    success: function(result) {
                        //alert(result);
                        saveRow.find("[name=auto_paper_no]").first().attr('readonly',false);
                        saveRow.find("[name=btnAuto]").first().html('บันทึกและพิมพ์');
                    }
                });
            }else{
                jQuery.ajax({
                    url:'process?action=CompareCaseChange&cmd=saveAutoInvoiceAjax&lb_id=' + lb_id + '&paper_no=' + paper_no + "&",
                    data:jQuery("#data_form").serialize(),
                    async:false,
                    success: function(result) {
                        //alert(result);
                        saveRow.find("[name=auto_paper_no]").first().attr('readonly',true);
                        saveRow.find("[name=btnAuto]").first().html('ยกเลิก');
                        printReportCompare('${cc.track_no}');
                    }
                });
            }
        } else {
            alert('กรุณากรอกค่าปรับเพิ่ม-ลด');
            return false;
        }
    }
    function yesReadOnly(){
    	var charCode = (event.which) ? event.which : event.keyCode
    	if(charCode){
    		 event.keyCode = 0;
    	}
    }
    function printReport(){
    	//window.open('process?action=Report&__report=ILL_P031&getTrackNo=' + valuePrint + '&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
    	writeTranLog('พิมพ์ใบเสร็จรับเงินกรณีปรับเพิ่ม');
    	Reports.ReportUrl(function(data){
    		if(data != ""){
    			window.open(data + "ReportName=ILL_P031_1&getTrackNo=${cc.track_no}&vReportType=PDF&time=" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
    		}else{
    			window.open('process?action=Report&__report=ILL_P031_1&getTrackNo=${cc.track_no}&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
    		}
    	});
    }
    
    <c:if test="${ccc != null}">
    jQuery(document).ready(function() {
        var money = ${ccc.change_money};
        jQuery('#case_fine_new').val(money);
        calValue(money);
    });
    </c:if>

	function cancelInv(){
		var answer = confirm("ยืนยันการยกเลิกใบเสร็จรับเงินค่าปรับ");
		if(answer){
			writeTranLog('ยกเลิกใบเสร็จรับเงินค่าปรับ');
			location.href='<c:url value="/process?action=CompareCaseChange&cmd=cancelInv&ccID=${cc.id}" />';
		}
			
	}
</script>
<form method="post" name="data_form" id="data_form" action="process?action=CompareCaseChange&cmd=createChange">

<!-- Body -->
<table width="100%" height="100%" border="0" cellspacing="0"
       cellpadding="0">
<tr>
<td width="100%" align="left" valign="top">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <td width="99%">
        <span class="websitename">การเพิ่ม-ลดค่าปรับเปรียบเทียบ</span>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>
        <input name="btnSave" type="submit" class="barbutton" value="บันทึก"/>
        <input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข" onClick="initValue('cancle');">
        <input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onClick="back2search()"/>
	    <c:if test="${ccc != null && ccc.inv_type == 'A' && ccc.change_type == '1' && ccc.iscancel=='N'}">
			<input name="btnPrint"  type="button" class="barButton" value="พิมพ์ใบเสร็จฯ" onclick="printReport();" />
			<input name="btnCancelInv"  type="button" class="barButton" value="ยกเลิกใบเสร็จฯ" onclick="writeTranLog('ยกเลิกใบเสร็จรับเงิน');cancelInv();"></input>
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
        <table id="input_form_table">
            <tr>
                <c:if test="${cc != null}">
                    <input type="hidden" name="ccid" value="${cc.id}"/>
                </c:if>
                <c:if test="${ccc != null}">
                    <input type="hidden" name="cccid" value="${ccc.id}">
                </c:if>
                
                <td align="right">
                    วันที่ :&nbsp;<input type="hidden" name="change_type" value="" />
                </td>
                <td colspan="5">
                    <input type="text" class="textdate" name="change_date" id="change_date" size="15"
                         value="<fmt:formatDate value='<%=new Date()%>' pattern='dd/MM/yyyy' />"  >
                </td>
            </tr>
            <tr>
                <td align="right">
                    พ.ร.บ. :&nbsp;
                </td>
                <td colspan="5">
                    <select name="legislation_id">
                        <c:forEach items="${les}" var="les" varStatus="i">
                            <option value="${les.id}" <c:if test="${les.id==legislation_id}">selected</c:if> >${les.legislation_name}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td align="right">เลขคดีเปรียบเทียบที่ :&nbsp;</td>
                <td>
                    <input type="text"  class="textview" name="compare_case_id" id="compare_case_id" value="${cc.compare_case_no}" size="15" />
                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand" 
                         onclick="window.showModalDialog('process?action=CompareCaseChange&cmd=openCompareCasePopup&legislation_id='+jQuery('[name=legislation_id] > option:selected').val() , self , 'menubar=no,toorlbar=no,location=no,scrollbars=yes,width=800px,height=500px');" />
                </td>
                <td align="right" width="20%">
                    วันที่เปรียบเทียบเดิม :&nbsp;
                </td>
                <td>
                    <input type="text" class="textdate" id="compare_case_date" name="compare_case_date"  size="15" value="<fmt:formatDate value='${cc.compare_case_date}' pattern='dd/MM/yyyy' />"  >
                </td>
                <td align="right">
                    จำนวนผู้ต้องหา :&nbsp;
                </td>
                <td>
                    <input type="text" class="textViewNum" id="lawbreakerQty" name="lawbreakerQty" value="${cc.lawbreakersQty}"  size="15" > ราย
                </td>
            </tr>
            <tr>
                <td align="right">
                    ค่าปรับเปรียบเทียบคดี :&nbsp;
                </td>
                <td>
                    <input class="textViewNum" type="text" name="case_fine_old" id="case_fine_old" value="${cc.case_fine}" onkeypress="yesReadOnly(this);" size="15" > บาท/คน
                </td>
                
                <td align="right">
                    ค่าปรับเปรียบเทียบคดีใหม่ :&nbsp;
                </td>
                <td>
                    <input name="case_fine_new" type="text" size="15" value="${ccc.change_money}" OnKeyPress="ChkMinusDbl(this);" class="textNum"
                           onchange="calValue(this.value);"> บาท/คน
                </td>
                
                <td align="right">
                    <span id="compare_fine_type_text" style="color:blue;font-size:200%;"></span>&nbsp;&nbsp;&nbsp;&nbsp;ผลต่าง
                    :&nbsp;
                </td>
                <td>
                    <input  class="textViewNum" name="case_fine_diff" type="text" onkeypress="yesReadOnly(this);" size="15" > บาท/คน
                </td>
            </tr>
            <tr>
                <td align="right">
                    ค่าปรับเปรียบเทียบคดีรวม :&nbsp;
                </td>
                <td>
                    <input type="text" class="textViewNum" name="case_fine_total_old" id="case_fine_total_old" size="15" 
                           value="${cc.case_fine * cc.lawbreakersQty}" onkeypress="yesReadOnly(this);"> บาท
                </td>
                
                <td align="right">
                    ค่าปรับเปรียบเทียบคดีรวม :&nbsp;
                </td>
                <td>
                    <input name="case_fine_total_new" type="text" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
                <td align="right">
                    ค่าปรับเปรียบเทียบคดีรวม :&nbsp;
                </td>
                <td>
                    <input name="case_fine_total_diff" type="text" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
            </tr>
            <tr>
                <td align="right">
                    เงินสินบน :&nbsp;
                </td>
                <td>
                    <input type="text" name="birbe_money_old" id="birbe_money_old" value="${cc.birbe_money}" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
                
                <td align="right">
                    เงินสินบน :&nbsp;
                </td>
                <td>
                    <input name="birbe_money_new" type="text" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
                <td align="right">
                    เงินสินบน :&nbsp;
                </td>
                <td>
                    <input name="birbe_money_diff" type="text" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
            </tr>
            <tr>
                <td align="right">
                    เงินรางวัล :&nbsp;
                </td>
                <td>
                    <input type="text" name="reward_money_old" id="reward_money_old" value="${cc.reward_money}" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
                
                <td align="right">
                    เงินรางวัล :&nbsp;
                </td>
                <td>
                    <input name="reward_money_new" type="text" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
                <td align="right">
                    เงินรางวัล :&nbsp;
                </td>
                <td>
                    <input name="reward_money_diff" type="text" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
            </tr>
            <tr>
                <td align="right">
                    เงินส่งคลัง :&nbsp;
                </td>
                <td>
                    <input type="text" name="treasury_money_old" id="treasury_money_old" value="${cc.treasury_money}" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
                
                <td align="right">
                    เงินส่งคลัง :&nbsp;
                </td>
                <td>
                    <input name="treasury_money_new" type="text" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
                <td align="right">
                    เงินส่งคลัง :&nbsp;
                </td>
                <td>
                    <input name="treasury_money_diff" type="text" class="textViewNum" onkeypress="yesReadOnly(this);" size="15" > บาท
                </td>
            </tr>
        </table>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr id="inv_select" style="display:none;" >
    <td>&nbsp;</td>
    <td>ออกใบเสร็จแบบ :&nbsp;
        <input type="radio" id="receipt1" name="inv_type_radio"  onClick="chkManual(true);" value="A"/> Auto
        &nbsp;<input type="radio" id="receipt2" name="inv_type_radio" checked onClick="chkManual();" value="M"/> Manual
        <input type="hidden" name="inv_type" value="M" />
    </td>
</tr>
<tr id="auto_inv" style="display:none">
    <td>&nbsp;</td>
    <td>
        <table cellspacing="0" width="55%">
            <thead>
            <tr style="text-align:center;background-color:#cccccc;">
                <td style="width:10%">ลำดับ</td>
                <td style="width:15%">ชื่อผู้กระทำผิด</td>
                <td style="width:15%">เลขที่ใบเสร็จ</td>
                <td style="width:15%">เลขที่กระดาษ</td>
                <td style="width:16%">เลขที่ใบเสร็จเดิม</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cci}" var="cci" varStatus="i">
                <tr id="auto_inv_row_${i.count}">
                    <td align="center">${i.count}</td>
                    <td>${cci.lawbreaker_name}</td>
                    <input type="hidden" name="cci_id" value="${cci.id}"/>
                    <input type="hidden" name="application_arrest_lawbreaker" value="${cci.application_arrest_lawbreaker }"> </input>
                    <td >
                    	<c:if test="${cci.invcode == null}">
                        	<input type="text" name="invcode" class="textreadonly" value="" readonly ></input>
                        </c:if>
                        <c:if test="${cci.invcode != null}" >
                        	<input type="text" name="invcode" class="textreadonly" value="${cci.invcode}" readonly ></input>
                        </c:if>
                    </td>
                    <td><input type="text" name="auto_paper_no" size="15" value="${cci.paper_no }" /></td>
                    <td>
                    	<c:if test="${cc.inv_type=='A'}">${cci.old_invcode}</c:if>
                    	<c:if test="${cc.inv_type!='A'}">${cci.old_book_no}/${cci.old_inv_no}</c:if>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </td>
</tr>
<tr id="manual_inv" >
    <td>&nbsp;</td>
    <td>
        <table cellspacing="0" width="55%">
            <thead>
            <tr style="text-align:center;background-color:#cccccc;">
                <th style="width:10%">ลำดับ</th>
                <th style="width:30%">ชื่อผู้กระทำผิด</th>
                <th style="width:15%">ค่าปรับ</th>
                <th style="width:20%">ใบเสร็จเล่มที่</th>
                <th style="width:20%">ใบเสร็จเลขที่</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cci}" var="cci" varStatus="i">
                <tr>
                    <td>${i.count}</td>
                    <td>${cci.lawbreaker_name}
                    	<input type="hidden" name="man_lb_id" value="${cci.application_arrest_lawbreaker}"/>
                    	<input type="hidden" name="cci_id" value="${cci.id}" ></input>
                    </td>
                    <td><span id='lManualFine${i.count}'>${cci.fine}</span></td>
                    <td><input type="text" name="man_book_no" value="${cci.book_no}"  /></td>
                    <td><input type="text" name="man_inv_no" value="${cci.inv_no}" /></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </td>
</tr>
<tr id="decrease_inv" style="display:none">
    <td>&nbsp;</td>
    <td>
        <table cellspacing="0" width="55%">
            <thead>
            <tr style="text-align:center;background-color:#cccccc;">
                <th style="width:10%">ลำดับ</th>
                <th style="width:30%">ชื่อผู้กระทำผิด</th>
                <th style="width:20%">เลขที่ใบเสร็จ</th>
                <th style="width:20%">เลขที่กระดาษ</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cci}" var="lb" varStatus="i">
                <tr>
                    <td>${i.count}</td>
                    <td>${lb.lawbreaker_name}</td>
                    <td>
                    	<c:if test="${cc.inv_type=='A'}">${lb.old_invcode}</c:if>
                    	<c:if test="${cc.inv_type!='A'}">${lb.old_book_no}/${lb.old_inv_no}</c:if>
                    </td>
                    <td></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td style="padding-left:200px">
        เหตุผลในการปรับเพิ่ม ปรับลด :<br/>
        <textarea rows="5" cols="50" id="change_reason" name="change_reason">${(ccc!=null)?(ccc.change_reason):('')}</textarea>
        <br />* กรณีปรับลด ให้กรอกเลขที่หนังสือขออนุมัติการปรับลด      
    </td>
</tr>
</table>
</td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
<script  language="JavaScript" type="text/javascript">
	var frmvalidator  = new Validator("data_form");
	
	frmvalidator.addValidation("case_fine_new","req","กรุณากรอกจำนวนเงินค่าปรับใหม่");
	frmvalidator.addValidation("change_reason","req","กรุณากรอกเหตุผลในการเพิ่ม/ลดค่าปรับ");

	calValue("${ccc.change_money}");

	document.getElementById("case_fine_old").value = AddComma(document.getElementById("case_fine_old").value);
	document.getElementById("case_fine_total_old").value = AddComma(document.getElementById("case_fine_total_old").value);
	document.getElementById("birbe_money_old").value = AddComma(document.getElementById("birbe_money_old").value);
	document.getElementById("reward_money_old").value = AddComma(document.getElementById("reward_money_old").value);
	document.getElementById("treasury_money_old").value = AddComma(document.getElementById("treasury_money_old").value);

	<c:if test="${SaveMSG=='Y'}">
		alert("บันทึกข้อมูลเรียบร้อย");
	</c:if>
</script>
</table>

</form>

