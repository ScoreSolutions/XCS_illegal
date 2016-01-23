<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%@ include file="/Templates/meta.jsp" %>
<script >
function loadStaffFromView() {
    location.href = "process?action=Reward_divide&cmd=loadStaffFromView&id=${db.cc_id}";
}

function taxopenmodal (myTable){
    var data = window.showModalDialog('process?action=Divide_staff_poplist&showOther=1', self, 'dialogWidth=700px,Height=400px');
	if (data) {
	    var base = jQuery(".person_row").size();
	    for (var i = 0; i < data.length; i++) {
	        	var index = base + i + 1;
	            var newRow = jQuery("<tr/>");

	            newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").html(index));
	            newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").append(jQuery("<input />").attr("n_ame", "chk1").attr("type", "checkbox")));
	            newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").append(jQuery("<input />")
	    	            .attr({type:'text',n_ame:'order_seq',size:'1',value:index,maxlength:3, OnKeyPress:'ChkMinusInt(this)'})));
	            newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'new_order_seq',value:index}));
	            newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rdt_id',value:''}));
	            newRow.append(jQuery("<td/>").addClass("TblRow AlignLeft").html(data[i][9]));
	            newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rdt_title_code',value:data[i][12]}));
	            newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rdt_first_name',value:data[i][10]}));
	            newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rdt_last_name',value:data[i][11]}));
	            newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rdt_position_name',value:data[i][3]}));
	            newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rdt_staff_level',value:data[i][13]}));
	            newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rdt_idcard_no',value:data[i][5]}));
	            newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html(data[i][3]));

	            var selectDuty = jQuery('<select/>').attr({n_ame:'rdt_duty_status_id'});
	            selectDuty.append(jQuery('<option />').attr({value:3}).html('ผู้ร่วมจับกุม'));
	            selectDuty.append(jQuery('<option />').attr({value:4}).html('ผู้สั่งการ'));
	            selectDuty.append(jQuery('<option />').attr({value:5}).html('ผู้ช่วยเหลือ'));
	            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(selectDuty));
	            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(jQuery('<input/>').addClass('textNum')
	    	            .attr({type:'text',n_ame:'rdt_share1',value:'0',size:'7', OnKeyPress:'ChkMinusInt(this)'})));
	            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(jQuery('<input/>').addClass('textNum')
	    	            .attr({type:'text',n_ame:'rdt_share2',value:'0',size:'7', OnKeyPress:'ChkMinusInt(this)'})));
	            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(jQuery('<input/>').addClass('textNum sum')
	    	            .attr({type:'text',n_ame:'rdt_money1',value:'0',size:'7', OnKeyPress:'ChkMinusDbl(this)'})));
	            newRow.append(jQuery('<td/>').addClass('TblRow AlignCenter').append(jQuery('<input/>').addClass('textNum sum')
	    	            .attr({type:'text',n_ame:'rdt_money2',value:'0',size:'7', OnKeyPress:'ChkMinusDbl(this)'})));
	            newRow.append(jQuery('<td/>').addClass('TblRow').append(jQuery('<div/>').addClass('total').html(0)));
	            jQuery("#divideTab").append(jQuery('<tr/>').addClass('person_row').attr('id', 'person_row_' + index).html(newRow.html().replace(/n_ame/g, 'name')));
	    }
	} else {
	}
}

function calRewardTax() {
    var data = {};
    data['arrest'] = jQuery("[name=rdt_duty_status_id] > [value=2]:selected ").size();
    data['arrest_co'] = jQuery("[name=rdt_duty_status_id] > [value=3]:selected ").size();
    data['command'] = jQuery("[name=rdt_duty_status_id] > [value=4]:selected ").size();
    data['helper'] = jQuery("[name=rdt_duty_status_id] > [value=5]:selected ").size();

    if(data['arrest'] != 1){
        alert('กรุณาใส่จำนวนผู้จับกุมให้ถูกต้อง');
        return;
    }

    if (data) {

        var onethree = ${db.reward_money}/3 * 1;
        var onethree_section = 0;
        var arrest_row = jQuery(".person_row").has("[name=rdt_duty_status_id] > [value=2]:selected");
        arrest_row.each(function(){
            if(jQuery(this).find("[name=rdt_share1]").val() != "")
            	onethree_section += parseInt(jQuery(this).find("[name=rdt_share1]").val());
        });
        var arrest_co_row = jQuery(".person_row").has("[name=rdt_duty_status_id] > [value=3]:selected");
        arrest_co_row.each(function(){
        	if(jQuery(this).find("[name=rdt_share1]").val() != "")
            	onethree_section += parseInt(jQuery(this).find("[name=rdt_share1]").val());
        });
        var command_row = jQuery(".person_row").has("[name=rdt_duty_status_id] > [value=4]:selected");
        command_row.each(function(){
        	if(jQuery(this).find("[name=rdt_share1]").val() != "")
            	onethree_section += parseInt(jQuery(this).find("[name=rdt_share1]").val());
        });
        var helper_row = jQuery(".person_row").has("[name=rdt_duty_status_id] > [value=5]:selected");
        helper_row.each(function(){
        	if(jQuery(this).find("[name=rdt_share1]").val() != "")
				onethree_section += parseInt(jQuery(this).find("[name=rdt_share1]").val());
        });
        
        var one_onethree = round2decimal(onethree/onethree_section);
        jQuery("#onethree").html(round2decimal(onethree));
        jQuery("#one_onethree").html(round2decimal(one_onethree));
        var remain_onethree = round2remain(onethree - (one_onethree * onethree_section));
        jQuery("#remain_onethree").html(round2decimal(remain_onethree));
		document.getElementById("remarks_tax").value = "1/3 ส่วน " + round2decimal(onethree) + " บาท ส่วนละ " + one_onethree + " บาท เหลือเศษ " + round2decimal(remain_onethree) + " บาท แบ่งให้ผู้จับทั้งหมด\n";
        
        arrest_row.each(function(){
            var money1;
			if(jQuery(this).find("[name=rdt_share1]").val() != "")
             	money1 = parseFloat(jQuery(this).find("[name=rdt_share1]").val())*parseFloat(one_onethree);
			else
				money1 = 0;
			
            money1 = round2remain(parseFloat(remain_onethree) + parseFloat(money1));
            jQuery(this).find("[name=rdt_money1]").val(round2decimal(money1));
        });
        arrest_co_row.each(function(){
            var money1;
			if(jQuery(this).find("[name=rdt_share1]").val() != "")
             	money1 = parseFloat(jQuery(this).find("[name=rdt_share1]").val())*parseFloat(one_onethree);
			else
				money1 = 0;
			
            jQuery(this).find("[name=rdt_money1]").val(round2decimal(money1));
        });
        command_row.each(function(){
            var money1;
			if(jQuery(this).find("[name=rdt_share1]").val() != "")
             	money1 = parseFloat(jQuery(this).find("[name=rdt_share1]").val())*parseFloat(one_onethree);
			else
				money1 = 0;
			
            jQuery(this).find("[name=rdt_money1]").val(round2decimal(money1));
        });
        helper_row.each(function(){
			var money1;
			if(jQuery(this).find("[name=rdt_share1]").val() != "")
			 	money1 = parseFloat(jQuery(this).find("[name=rdt_share1]").val())*parseFloat(one_onethree);
			else
				money1 = 0;
			
            jQuery(this).find("[name=rdt_money1]").val(round2decimal(money1));
        });

        
        var twothree = ${db.reward_money} - onethree;
        var twothree_section = 0;
        arrest_row.each(function(){
            if(jQuery(this).find("[name=rdt_share2]").val() != "")
            	twothree_section += parseInt(jQuery(this).find("[name=rdt_share2]").val());
        });
        arrest_co_row.each(function(){
        	if(jQuery(this).find("[name=rdt_share2]").val() != "")
            	twothree_section += parseInt(jQuery(this).find("[name=rdt_share2]").val());
        });
        command_row.each(function(){
        	if(jQuery(this).find("[name=rdt_share2]").val() != "")
            	twothree_section += parseInt(jQuery(this).find("[name=rdt_share2]").val());
        });
        helper_row.each(function(){
        	if(jQuery(this).find("[name=rdt_share2]").val() != "")
            	twothree_section += parseInt(jQuery(this).find("[name=rdt_share2]").val());
        });
        var one_twothree = round2decimal(twothree / twothree_section);
        jQuery("#twothree").html(round2decimal(twothree));
        jQuery("#one_twothree").html(round2decimal(one_twothree));
        var remain_twothree = round2remain(twothree - round2decimal(round2decimal(one_twothree) * twothree_section));
        jQuery("#remain_twothree").html(round2decimal(remain_twothree));
        document.getElementById("remarks_tax").value += "2/3 ส่วน " + round2decimal(twothree) + " บาท ส่วนละ " + one_twothree + " บาท เหลือเศษ " + round2decimal(remain_twothree) + " บาท แบ่งให้ผู้จับทั้งหมด";

        arrest_row.each(function(){
            var money2;
			if(jQuery(this).find("[name=rdt_share2]").val() != "" && parseFloat(jQuery(this).find("[name=rdt_share2]").val()) != 0.0){
             	money2 = parseFloat(jQuery(this).find("[name=rdt_share2]").val())*one_twothree;
             	jQuery(this).find("[name=rdt_money2]").val(round2remain(parseFloat(round2decimal(money2))+parseFloat(round2decimal(remain_twothree))));
			}else{
				money2 = 0;
				jQuery(this).find("[name=rdt_money2]").val("0.00");
			}
        });
        arrest_co_row.each(function(){
            var money2;
			if(jQuery(this).find("[name=rdt_share2]").val() != "" && parseFloat(jQuery(this).find("[name=rdt_share2]").val()) != 0.0){
             	money2 = parseFloat(jQuery(this).find("[name=rdt_share2]").val())*one_twothree;
             	jQuery(this).find("[name=rdt_money2]").val(round2decimal(money2));         	
			}else{
				money2 = 0;
				jQuery(this).find("[name=rdt_money2]").val("0.00");
			}
			
            
        });
        command_row.each(function(){
            var money2;
            if(jQuery(this).find("[name=rdt_share2]").val() != "" && parseFloat(jQuery(this).find("[name=rdt_share2]").val()) != 0.0){
             	money2 = parseFloat(jQuery(this).find("[name=rdt_share2]").val())*one_twothree;
             	jQuery(this).find("[name=rdt_money2]").val(round2decimal(money2));
            }else{
                money2 = 0;
                jQuery(this).find("[name=rdt_money2]").val("0.00");
            }
            
            
        });
        helper_row.each(function(){
            var money2;
			if(jQuery(this).find("[name=rdt_share2]").val() != "" && parseFloat(jQuery(this).find("[name=rdt_share2]").val()) != 0.0){
             	money2 = parseFloat(jQuery(this).find("[name=rdt_share2]").val())*one_twothree;
				jQuery(this).find("[name=rdt_money2]").val(round2decimal(money2));
			}else{
				money2 = 0;
				jQuery(this).find("[name=rdt_money2]").val("0.00");
			}
			
            //alert(jQuery(this).find("[name=rdt_money2]").val() + "   $$$$$$");
        });

        jQuery(".person_row").each(function(index){
            if(index>=1){
                var money1 = parseFloat(jQuery(this).find("[name=rdt_money1]").val());
                var money2 = parseFloat(jQuery(this).find("[name=rdt_money2]").val());
                var money = round2decimal(parseFloat(money1) + parseFloat(money2));
                jQuery(this).find(".total").html(money);
            }
        });
    }
}
</script>
<tbody id="Tax"> 
	<tr>
		<td>&nbsp;</td>
		<td>
			<table width="960" border="0" cellspacing="0" cellpadding="0">
			    <tr>
			        <td colspan="12">
			            <span class="spanLink" onclick="taxopenmodal();"> เพิ่มรายการ</span> |
			            <span class="spanLink" onclick="deleterow();">ลบรายการที่เลือก</span> |
			            <c:if test="${rdts[0]==null}">
			            <span class="spanLink" onclick="loadStaffFromView()">ดึงรายการผู้ดำเนินการ</span> |
			            </c:if>
			            <span class="spanLink" onClick="calRewardTax();">คำนวณเงินรางวัล</span>
			        </td>
			    </tr>
			</table>
			
			<table id="divideTab" width="960" border="1" cellspacing="0" cellpadding="0">
			<tr class="TblHeaderColumn">
			    <td width="50">ลำดับที่</td>
			    <td width="40"><input name="chkAll" id="divideTab_chk" type="checkbox" onclick="chkUncheckAll('divideTab_chk')"/></td>
			    <td width="70">ลำดับที่รายการ</td>
			    <td width="150" class="TblHeaderColumn">ชื่อ-สกุล</td>
			    <td width="150" class="TblHeaderColumn">ตำแหน่ง</td>
			    <td width="70" class="TblHeaderColumn">ได้ในฐานะ</td>
			    <td width="140" class="TblHeaderColumn" colspan="2" align="Center">จำนวนส่วน</td>
			    <td width="140" class="TblHeaderColumn" colspan="2" align="Center">รายการ</td>
			    <td width="100" class="TblHeaderColumn">รวมทั้งสิ้น</td>
			</tr>
			<c:forEach items="${rdts}" var="rdt" varStatus="i">
			    <tr class="person_row" <c:if test="${i.count%2==0}">style="background-color:#F3F3F3"</c:if> >
			        <td class="TblRow AlignCenter">${i.count}</td>
			        <td class="TblRow AlignCenter">
			            <c:if test="${i.count>1}">
			                <input name="chk1" type="checkbox"/>
			            </c:if>
			        </td>
			        <td class="TblRow AlignCenter">
			        	<c:if test="${rdt.order_seq=='1'}" >
			        		<input type="hidden" name="order_seq" value="${rdt.order_seq}" />
			        		${rdt.order_seq}
			        	</c:if>
			        	<c:if test="${rdt.order_seq > '1'}">
			        		<input type="text" name="order_seq" size="1" value="${rdt.order_seq}" maxlength="3" OnKeyPress="ChkMinusInt(this);" />
			        	</c:if>
			        </td>
			        <input type="hidden" name="rdt_id" value="${rdt.id}"/>
			        <input type="hidden" name="rdt_title_code" value="${rdt.title_code}"/>
			        <input type="hidden" name="rdt_first_name" value="${rdt.first_name}"/>
			        <input type="hidden" name="rdt_last_name" value="${rdt.last_name}"/>
			        <input type="hidden" name="rdt_idcard_no" value="${rdt.idcard_no}"/>
			        <td class="TblRow AlignLeft">${(rdt.order_seq!='1')?(rdt.full_name):(rdt.first_name)}</td>
			        <c:if test="${i.count == 1}">
				        <td class="TblRow AlignLeft">
				        	${rdt.position_name}
				        	<input type="hidden" name="rdt_position_name" value="${rdt.position_name}"/>
				        </td>
				        <td class="TblRow AlignLeft" style="display:none">
				        	${rdt.staff_level}
				        	<input type="hidden" name="rdt_staff_level" value="${rdt.staff_level}"/>
				        </td>
			             <td><c:if test="${rdt.is_notice!='N'}">ผู้แจ้งความ</c:if></td>
			             <td>&nbsp;</td>
			             <td>&nbsp;</td>
			             <td>&nbsp;</td>
			             <td>&nbsp;</td>
				            <input type="hidden" name="rdt_duty_status_id" value="1" />
				            <input type="hidden" name="rdt_share1" value="" />
				            <input type="hidden" name="rdt_share2" value="" />
				            <input type="hidden" name="rdt_money1" value="" />
				            <input type="hidden" name="rdt_money2" value="" />
			            <td class="total" style="text-align:right">
			            	<fmt:formatNumber minFractionDigits='2' maxFractionDigits='2' value='${db.birbe_money}' />
			            </td>
			        </c:if>
			        <c:if test="${i.count > 1}">
				        <td class="TblRow AlignLeft">
				        	<input type="text" name="rdt_position_name" value="${rdt.position_name}"/>
				        </td>
				        <td class="TblRow AlignLeft" style="display:none">
				        	${rdt.staff_level}
				        	<input type="hidden" name="rdt_staff_level" value="${rdt.staff_level}"/>
				        </td>
				        <td class="TblRow">
				        	<c:if test="${rdt.duty_status_id!='2'}" >
						        <select name="rdt_duty_status_id" id="rdt_duty_status_id">
						            <c:forEach items="${duty_status_list}" var="duty_status" varStatus="i">
						            	<c:if test="${duty_status.id != '2'}">
						                	<option value="${duty_status.id}"  <c:if test="${duty_status.id==rdt.duty_status_id}" >selected</c:if> >${duty_status.status_name}</option>
						                </c:if>
						            </c:forEach>
						        </select>
						    </c:if>
						    <c:if test="${rdt.duty_status_id=='2'}" >
						    	<select name="rdt_duty_status_id" id="rdt_duty_status_id" style="width:80px:" >
						           	<option value="2"  >ผู้จับกุม</option>
						        </select>
						    </c:if>
				        </td>
				        <td class="TblRow AlignCenter">
				        	<input type="text" size="7" name="rdt_share1" value="${rdt.share1}" class="textNum" OnKeyPress="ChkMinusInt(this);">
				        </td>
				        <td class="TblRow AlignCenter">
				        	<input type="text" size="7" name="rdt_share2" value="${rdt.share2}" class="textNum" OnKeyPress="ChkMinusInt(this);">
				        </td>
				        <td class="TblRow AlignCenter">
				        	<input type="text" size="7" name="rdt_money1" value="${rdt.money1}" class="textNum sum" OnKeyPress="ChkMinusDbl(this);">
				        </td>
				        <td class="TblRow AlignCenter">
				        	<input type="text" size="7" name="rdt_money2" value="${rdt.money2}" class="textNum sum" OnKeyPress="ChkMinusDbl(this);">
				        </td>
				        <td class="TblRow" style="text-align:right">
				            <div class='total'>
				            	<fmt:formatNumber minFractionDigits='2' maxFractionDigits='2' value='${rdt.sum_money}' />
				            </div>
				        </td>
			        </c:if>
			    </tr>
			</c:forEach>
			</table>
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
	                <td width="20%" align="right" valign="top" height="50">หมายเหตุ :&nbsp;</td>
	                <td width="80%" valign="top">
	                    <div style="border-width: 1px; border-style: groove; border-color: #dcdcdc; display:none;" >
	                        1/3 ส่วน <span id="onethree"></span>&nbsp; บาท ส่วนละ <span id="one_onethree"></span>&nbsp; บาท เหลือเศษ <span id="remain_onethree"></span>&nbsp; บาท แบ่งให้ผู้จับทั้งหมด<br/>
	                        2/3 ส่วน <span id="twothree"></span>&nbsp; บาท ส่วนละ <span id="one_twothree"></span>&nbsp; บาท เหลือเศษ <span id="remain_twothree"></span>&nbsp; บาท แบ่งให้ผู้จับทั้งหมด
	                    </div>
	                    <textarea rows="2" cols="80" name="remarks_tax" id="remarks_tax">${rd.remarks }</textarea>
	                </td>
	            </tr>
	        </table>
	    </td>
	</tr>
	<tr>
	    <td>&nbsp;</td>
	    <td>&nbsp;</td>
	</tr>
</tbody>