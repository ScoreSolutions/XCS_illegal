<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%@ include file="/Templates/meta.jsp" %>
<script>

function aatopenmodal(myTable)
{
    var data = window.showModalDialog('process?action=Divide_staff_poplist&showOther=1', self, 'dialogWidth=700px,Height=400px');
    if (data) {
        var base = jQuery(".person_row").size();
        for (var i = 0; i < data.length; i++) {
            var index = base + i + 1;
            //if (jQuery("input[name='rda_idcard_no'][value='" + data[i][5] + "']").size() > 0) {
                //alert("dupplicated offcode ");
            //} else {
                var newRow = jQuery("<tr/>");
                //                    newRow.attr('id','person_row_'+index);
                //                    newRow.addClass('person_row');
                newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").html(index));
                newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").append(jQuery("<input />").attr("n_ame", "chk1").attr("type", "checkbox")));
                newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").append(jQuery("<input />").attr({type:'text',n_ame:'order_seq',size:'1',value:index,maxlength:3}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));
                newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'new_order_seq',value:index}));
                newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rda_id',value:''}));
                newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html(''));
                newRow.append(jQuery("<td/>").addClass("TblRow AlignLeft").html(data[i][9]));
                newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rda_title_code',id:'rda_title_code',value:data[i][12]}));
                newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rda_first_name',id:'rda_first_name',value:data[i][10]}));
                newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rda_last_name',id:'rda_last_name',value:data[i][11]}));
                newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rda_position_name',id:'rda_position_name',value:data[i][3]}));
                newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rda_staff_level',id:'rda_staff_level',value:data[i][13]}));
                newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rda_duty_status_id',id:'rda_duty_status_id',value:5}));
                newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'rda_idcard_no',id:'rda_idcard_no',value:data[i][5]}));
                newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html(data[i][3]));
                newRow.append(jQuery('<td/>').addClass('TblRow AlignRight').append(jQuery('<input/>').attr({type:'hidden',n_ame:'reward',value:''})));
                newRow.append(jQuery('<td/>').addClass('TblRow AlignLeft').append(jQuery('<input/>').addClass('textNum sum').attr({type:'text',n_ame:'arrest',value:'',size:'7'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));
                newRow.append(jQuery('<td/>').addClass('TblRow AlignLeft').append(jQuery('<input/>').addClass('textNum sum').attr({type:'text',n_ame:'arrest_co',value:'',size:'7'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));
                newRow.append(jQuery('<td/>').addClass('TblRow AlignLeft').append(jQuery('<input/>').addClass('textNum sum').attr({type:'text',n_ame:'command',value:'',size:'7'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));
                newRow.append(jQuery('<td/>').addClass('TblRow AlignLeft').append(jQuery('<input/>').addClass('textNum sum').attr({type:'text',n_ame:'helper',value:'',size:'7'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));

                newRow.append(jQuery('<td/>').addClass('TblRow AlignRight').append(jQuery('<input/>').addClass('textViewNum').attr({type:'text',n_ame:'total_al',value:'0',size:'10',readonly:'readonly'})));
                jQuery("#divide_tab").append(jQuery('<tr/>').addClass('person_row').attr('id', 'person_row_' + index).html(newRow.html().replace(/n_ame/g, 'name')));
            //}
        }
    } else {
    }
}

</script>
<tbody id="Alcohol">
    <tr>
        <td>&nbsp;</td>
        <td>
	<table width="1000" border="0" cellspacing="0" cellpadding="0" id="divide_tab">
	    <tr>
	        <td colspan="12">
	            <span class="spanLink" onclick="aatopenmodal();"> เพิ่มรายการ</span> |
	            <span class="spanLink" onclick="deleterow();">ลบรายการที่เลือก</span> |
	            <c:if test="${rdas[0] == null}">
	            <span class="spanLink" onclick="loadStaffFromView()">ดึงรายการผู้ดำเนินการ</span> |
	            </c:if>
	            <span class="spanLink" onClick="calReward();calMoneyByStaff();">คำนวณเงินรางวัล</span>
	        </td>
	    </tr>
	    <tr class="TblHeaderColumn">
	        <td width="50">ลำดับที่</td>
	        <td width="30"><input name="chkAll" type="checkbox" id="alcohol_chk" onclick="chkUncheckAll('alcohol_chk')"/></td>
	        <td width="80">ลำดับที่รายการ</td>
	        <td width="100" class="TblHeaderColumn">ชื้อผู้แจ้งความ</td>
	        <td width="100" class="TblHeaderColumn">ชื่อ-สกุล</td>
	        <td width="130" class="TblHeaderColumn">ตำแหน่ง</td>
	        <!-- <td width="70" class="TblHeaderColumn">ระดับ</td> -->
	        <td width="70" class="TblHeaderColumn">เงินสินบน</td>
	        <td width="70" class="TblHeaderColumn">ผู้จับกุม</td>
	        <td width="70" class="TblHeaderColumn">ผู้ร่วมจับกุม</td>
	        <td width="70" class="TblHeaderColumn">ผู้สั่งการ</td>
	        <td width="70" class="TblHeaderColumn">ผู้ช่วยเหลือ</td>
	        <td width="70" class="TblHeaderColumn">รวม</td>
	    </tr>
	    <c:forEach items="${rdas}" var="rda" varStatus="i">
	        <tr class="person_row" id="person_row_${i.count}">
	            <td class="TblRow AlignCenter">${rda.order_seq}</td>
	            <td class="TblRow AlignCenter">
	                <c:if test="${i.count > 2}">
	                    <input name="chk1" id="chk1" type="checkbox"/>
	                </c:if>
	            </td>
	            <td class="TblRow AlignCenter">
	            	<c:if test="${rda.order_seq=='1' || rda.order_seq=='2'}" >
	            		${rda.order_seq}
	            		<input type="hidden" name="order_seq" id="order_seq" value="${rda.order_seq}"></input>
	            	</c:if>
	            	<c:if test="${rda.order_seq>2}" >
	            		<input type="text" name="order_seq" id="order_seq" size="1" value="${rda.order_seq}" maxlength="3"  OnKeyPress='ChkMinusDbl(this);' />
	            	</c:if>
	            </td>
	            <input type="hidden" name="new_order_seq" id="new_order_seq" value="${rda.order_seq}"/>
	            <input type="hidden" name="rda_id" id="rda_id" value="${rda.id}"/>
	            <td class="TblRow AlignLeft">${rda.order_seq=='1'?(rda.full_name):''}</td>
	            <input type="hidden" name="rda_title_code" id="rda_title_code" value="${rda.title_code}"/>
	            <input type="hidden" name="rda_first_name" id="rda_first_name" value="${rda.first_name}"/>
	            <input type="hidden" name="rda_last_name" id="rda_last_name" value="${rda.last_name}"/>
	            <input type="hidden" name="rda_position_name" id="rda_position_name" value="${rda.position_name}"/>
	            <input type="hidden" name="rda_staff_level" id="rda_staff_level" value="${rda.staff_level}"/>
	            <input type="hidden" name="rda_duty_status_id" id="rda_duty_status_id" value="${rda.duty_status_id}"/>
	            <input type="hidden" name="rda_idcard_no" id="rda_idcard_no" value="${rda.idcard_no}"/>
	            <td class="TblRow AlignLeft">${rda.order_seq!='1'?(rda.full_name):''}</td>
	            <td class="TblRow AlignLeft">${rda.position_name} </td>
	            <c:if test="${rda.duty_status_id==1}" >
	                <td class="TblRow AlignCenter">${(rda.duty_status_id==1)?((db.birbe_money ==0?(''):(db.birbe_money))):''}</td>
	                <td class="TblRow AlignLeft">&nbsp;</td>
	                <td class="TblRow AlignLeft">&nbsp;</td>
	                <td class="TblRow AlignLeft">&nbsp;</td>
	                <td class="TblRow AlignLeft">&nbsp;</td>
	                <td class="TblRow AlignRight">
	                    <input type="hidden" name="arrest" id="arrest" value="${rda.duty_status02_money}"/>
	                    <input type="hidden" name="arrest_co" id="arrest_co" value="${rda.duty_status03_money}"/>
	                    <input type="hidden" name="command" id="command" value="${rda.duty_status04_money}"/>
	                    <input type="hidden" name="helper" id="helper" value="${rda.duty_status05_money}"/>
	                    <div class='total'>${(rda.duty_status_id==1)?(db.birbe_money):''}</div>
	                </td>
	                <input type="hidden" name="birbe" id="birbe" value="${(db.birbe_money==0)?(''):(db.birbe_money)}"/>
	            </c:if>
	            <c:if test="${rda.duty_status_id!=1}">
	                <td class="TblRow AlignRight">&nbsp;</td>
	                <input type="hidden" name="reward" id="reward" value="${rda.duty_status01_money}"/>
	                <td class="TblRow AlignLeft">
	                	<input type="text" size="7" id="arrest" name="arrest" value="${rda.duty_status02_money}" class="textNum sum" onblur="calMoneyByStaff()" OnKeyPress="ChkMinusDbl(this);">
	                </td>
	                <td class="TblRow AlignLeft">
	                	<input type="text" size="7" id="arrest_co" name="arrest_co" value="${rda.duty_status03_money}" class="textNum sum" onblur="calMoneyByStaff()" OnKeyPress="ChkMinusDbl(this);">
	                </td>
	                <td class="TblRow AlignLeft">
	                	<input type="text" size="7" id="command" name="command" value="${rda.duty_status04_money}" class="textNum sum" onblur="calMoneyByStaff()" OnKeyPress="ChkMinusDbl(this);">
	                </td>
	                <td class="TblRow AlignLeft">
	                	<input type="text" size="7" id="helper" name="helper" value="${rda.duty_status05_money}" class="textNum sum" onblur="calMoneyByStaff()" OnKeyPress="ChkMinusDbl(this);">
	                </td>
	                <td class="TblRow AlignRight">
	                    <input type="text" size="10" id="total_al" name="total_al" value="${rda.duty_status02_money+rda.duty_status03_money+rda.duty_status04_money+rda.duty_status05_money}" class="textViewNum" readonly ></input>
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
                            &nbsp;&nbsp;3/5 ของเงินรางวัลคิดเป็นส่วนละ <span id="threefivemain">0.00</span> บาท เหลือเศษ
                            <span id="threefivesub">0.00</span> บาท แบ่งให้ผู้จับทั้งหมด<br>
                            &nbsp;&nbsp;2/5 ของเงินรางวัลคิดเป็นส่วนละ <span id="twofivemain">0.00</span> บาท เหลือเศษ
                            <span id="twofivesub">0.00</span> บาท แบ่งให้ผู้จับทั้งหมด
                        </div>
                        <textarea rows="2" cols="80" name="remarks_al" id="remarks_al">${rd.remarks }</textarea>
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