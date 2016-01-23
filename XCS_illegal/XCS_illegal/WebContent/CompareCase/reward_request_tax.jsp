<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%@ include file="/Templates/meta.jsp" %>

<table width="800" border="0" cellspacing="0" cellpadding="0">
<input type="hidden" name="al_id" value="${al.id}"/>
<input type="hidden" name="arr_id" value="${al.arr_id}"/>
<tr class="bgRowGray">
    <td colspan="4"><strong>รายงานการจับกุม</strong></td>
</tr>
<tr>
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="center">
        <span class="spanLink"
              onClick="printReports('ILL_P023_3&getTrackNo='+document.dataform.request_no.value);">พิมพ์รายงาน</span>
    </td>
    <td colspan="3">&nbsp;</td>
</tr>
<tr>
    <td align="right">เรื่อง :&nbsp;</td>
    <td colspan="3">
    	<c:if test="${al == null }">
	        <input type="text" name="arr_subject" class="textview" size="115" 
	        value="รายงานการจับกุมคดี พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527" 
	        onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
        </c:if>
        <c:if test="${al != null }">
	        <input type="text" name="arr_subject" class="textview" size="115" 
	        value="${al.subject}" 
	        onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
        </c:if>
    </td>
</tr>
<tr>
    <td width="20%" align="right">สินค้า :&nbsp;</td>
    <td width="30%">
        <input name="txtProductGroupName" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.product_group_name}" />
    </td>
    <td width="50%" height="25" align="left" valign="middle" colspan="2">
        <input type="checkbox" name="chkInform" id="chkInform" <c:if test="${al.isinform == 'Y'}" >checked</c:if> 
        onclick="chkInform1('chkInform','chkCountInform');" value="Y" />มีการแจ้งความ&nbsp;&nbsp;
        <input type="checkbox" name="chkCountInform" id="chkCountInform" 
        <c:if test="${al.ischkcount == 'Y'}" >checked</c:if>  value="Y" />ตรวจนับได้ตรงกับที่แจ้ง
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
                <td width="200" class="TblHeaderColumn "bgcolor="#F5F5F5">ชื่อสินค้า</td>
                <td width="150" class="TblHeaderColumn "bgcolor="#F5F5F5">ยี่ห้อ</td>
                <td width="80" class="TblHeaderColumn "bgcolor="#F5F5F5">จำนวน</td>
                <td width="100" class="TblHeaderColumn "bgcolor="#F5F5F5">หน่วย</td>
            </tr>
          	<tbody id="exhibit_item">
          		<c:forEach items="${exhibit}" var="ex" varStatus="i">
                     <tr>
                           <td class="TblRow AlignCenter">${i.count}</td>
                           <td align="left" valign="top" class="TblRow AlignLeft">${ex.duty_name}</td>
                           <td align="left" valign="top" class="TblRow AlignLeft">${ex.brand_name}</td>
                           <td align="left" valign="top" class="TblRow AlignLeft">${ex.qty}</td>
                           <td align="left" valign="top" class="TblRow AlignLeft">${ex.qty_unit_name}</td>
                      </tr>
                 </c:forEach>
          	</tbody>
        </table>
    </td>
</tr>
<tr height="1">
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td align="right" valign="top">ลักษณะที่ตรวจพบ :&nbsp;</td>
    <td colspan="3">
        <TEXTAREA NAME="abnormaly" ROWS="2" COLS="73">${al.abnormality}</TEXTAREA>
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
                <td width="50"bgcolor="#F5F5F5">ลำดับที่</td>
                <td width="30"bgcolor="#F5F5F5">
                	<input type="checkbox" id="chkhelperBody" name="chkhelperBody" value="checkbox" onclick="chkUncheckAll('chkhelperBody');" >
                </td>
                <td width="150"bgcolor="#F5F5F5">ชื่อ-สกุล</td>
                <td width="150"bgcolor="#F5F5F5">ตำแหน่ง</td>
            </tr>
            <tbody id="helperBody">
            	<c:forEach items="${helper}" var="cm" varStatus="i">
                     <tr>
                           <td class="TblRow AlignCenter">${i.count}</td>
                           <td class="TblRow AlignCenter"><input name="chkhelperBody${i.count}" type="checkbox"/>
                               <input type="hidden" name="helperBody_id" value="${cm.id}"/>
                               <input type="hidden" name="helperBody_idcard_no" value="${cm.staff_idcardno}"/>
                               <input type="hidden" name="helperBody_level" value="${cm.staff_level}"/>
                               <input type="hidden" name="helperBody_poscode" value="${cm.poscode}"/>
                               <input type="hidden" name="helperBody_offcode" value="${cm.offcode}"/>
                           </td>
                           <td align="left" valign="top" class="TblRow AlignLeft">${cm.staff_name}</td>
                           <td align="left" valign="top" class="TblRow AlignLeft">${cm.staff_posname} ${cm.staff_level}</td>
                     </tr>
                 </c:forEach>
            </tbody>
           
        </table>
        <span class="spanLink" onClick="aatopenmodal('helperBody');">เพิ่มรายการ</span>
        |
        <span class="spanLink" onclick="aatget_check_value('helperBody')" >ลบรายการ</span>
    </td>
</tr>
<tr height="1">
    <td colspan="4">&nbsp;</td>
</tr>
<tr>
    <td height="25" align="right" valign="middle">ผู้ควบคุมการจับกุม&nbsp;:&nbsp;</td>
    <td>
        <input type="text" id="ta_staff_name_control" name="ta_staff_name_control" class="textview" size="37" value="${al.staff_name_control}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
        <input type="hidden" id="ta_staff_id_control" name="ta_staff_id_control" value="${al.staff_id_control}" />
        <input type="hidden" id="ta_poscode_control" name="ta_poscode_control" value="${al.poscode_control}" />
        <input type="hidden" id="ta_offcode_control" name="ta_offcode_control" value="${al.offcode_control}" />
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
             onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_control&formname=ta_staff_name_control&id=ta_staff_id_control&posname=ta_posname_control&offcode=ta_offcode_control' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
    </td>
    <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
    <td>
        <input id="ta_posname_control" name="ta_posname_control" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.posname_control}"/>
    </td>
</tr>
<tr>
    <td align="right" valign="top">รายละเอียดการจับกุม<br/>และความเห็น :&nbsp;</td>
    <td colspan="3">
        <TEXTAREA NAME="comment_control" ROWS="2" COLS="73">${al.comment_control}</TEXTAREA>
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
                <td colspan="3"><TEXTAREA NAME="comment_initial" ROWS="2" COLS="60">${al.comment_initial}</TEXTAREA></td>
            </tr>
            <tr>
                <td width="20%" height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
                <td width="30%">
                    <input type="text" id="ta_staff_name_initial" name="ta_staff_name_initial" class="textview" size="37" value="${al.staff_name_initial}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
			        <input type="hidden" id="ta_staff_id_initial" name="ta_staff_id_initial" value="${al.staff_id_initial}"/>
			        <input type="hidden" id="ta_poscode_initial" name="ta_poscode_initial" value="${al.poscode_initial}"/>
			        <input type="hidden" id="ta_offcode_initial" name="ta_offcode_initial" value="${al.offcode_initial}"/>
                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
             			onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_initial&formname=ta_staff_name_initial&id=ta_staff_id_initial&posname=ta_posname_initial&offcode=ta_offcode_initial' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
                </td>
                <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td width="30%">
                    <input id="ta_posname_initial" name="ta_posname_initial" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="30" value="${al.posname_initial}"/>
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
                <td colspan="3"><TEXTAREA NAME="comment_commander" ROWS="2" COLS="60">${al.comment_commander}</TEXTAREA></td>
            </tr> 
            <tr>
                <td height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
                <td>
                    <input type="text" id="ta_staff_name_commander" name="ta_staff_name_commander" class="textview" size="37" value="${al.staff_name_commander}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
			        <input type="hidden" id="ta_staff_id_commander" name="ta_staff_id_commander" value="${al.staff_id_commander}"/>
			        <input type="hidden" id="ta_poscode_commander" name="ta_poscode_commander" value="${al.poscode_commander}"/>
			        <input type="hidden" id="ta_offcode_commander" name="ta_offcode_commander" value="${al.offcode_commander}"/>
                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
             			onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_commander&formname=ta_staff_name_commander&id=ta_staff_id_commander&posname=ta_posname_commander&offcode=ta_offcode_commander' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
                </td>
                <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td>
                    <input id="ta_posname_commander" name="ta_posname_commander" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="30" value="${al.posname_commander}"/>
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
        <TEXTAREA NAME="command" ROWS="2" COLS="73">${al.command }</TEXTAREA>
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
            <input type="text" id="ta_staff_name_confirm" name="ta_staff_name_confirm" class="textview" size="37" value="${al.staff_name_confirm}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
            <input type="hidden" id="ta_staff_id_confirm" name="ta_staff_id_confirm" value="${al.staff_id_confirm}"/>
            <input type="hidden" id="ta_poscode_confirm" name="ta_poscode_confirm" value="${al.poscode_confirm}"/>
            <input type="hidden" id="ta_offcode_confirm" name="ta_offcode_confirm" value="${al.offcode_confirm}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_confirm&formname=ta_staff_name_confirm&id=ta_staff_id_confirm&posname=ta_posname_confirm&offcode=ta_offcode_confirm' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input id="ta_posname_confirm" name="ta_posname_confirm" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.posname_confirm}"/>
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ชื่อผู้จับกุม&nbsp;:&nbsp;</td>
        <td>
            <input type="text" name="txtAccuserName" class="textview" size="35" value="${al.accuser_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
        </td>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td>
            <input name="txtAccuserPosname" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.accuser_posname}" />
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">วันที่จับกุม :&nbsp;</td>
        <td valign="top" colspan="3">
            <input name="txtOccurrenceDate" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${al.occurrence_date}" />
        </td>
    </tr>
    <tr>
        <td align="right">เปรียบเทียบปรับเป็นเงิน :&nbsp;</td>
        <td colspan="3">
            <input type="text" id="ta_fine" name="ta_fine" class="textViewNum" size="20" value="${al.case_total_fine}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" > บาท&nbsp;
            (<span id="taFineText"></span>)
        </td>
    </tr>
    <tr>
        <td align="right">เงินสินบน ${db.bribe_money_p} % :&nbsp;</td>
        <td colspan="3">
            <input type="text" id="ta_birbe_money" name="ta_birbe_money" class="textViewNum" size="20" value="${al.birbe_money}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" > บาท&nbsp;
            (<span id="taBirbeText"></span>)
        </td>
    </tr>
    <tr>
        <td align="right">เงินรางวัล ${db.reward_money_p} % :&nbsp;</td>
        <td colspan="3">
            <input type="text" id="ta_reward_money" name="ta_reward_money" class="textViewNum" size="20" value="${al.reward_money}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" > บาท&nbsp;
            (<span id="taRewardText"></span>)
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
        	<c:if test="${al == null}" >
            	<input type="text" name="ta_ask_lean" class="textbox" size="35" value="${al_ask_lean}">
            </c:if>
            <c:if test="${al != null}" >
            	<input type="text" name="ta_ask_lean" class="textbox" size="35" value="${al.ask_lean}">
            </c:if>
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td align="right">เห็นควรส่ง :&nbsp;</td>
        <td colspan="3">
        	<c:if test="${al == null}" >
            	<input type="text" name="ta_department_name_send" class="textbox" size="35" value="${al_department_name_send}">
            </c:if>
            <c:if test="${al != null}" >
            	<input type="text" name="ta_department_name_send" class="textbox" size="35" value="${al.department_name_send} " />
            </c:if>
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ชื่อผู้ขออนุมัติ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" id="ta_staff_name_ark" name="ta_staff_name_ark" class="textview" size="37" value="${al.staff_name_ask}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
            <input type="hidden" id="ta_staff_id_ark" name="ta_staff_id_ark" value="${al.staff_id_ask}"/>
            <input type="hidden" id="ta_poscode_ark" name="ta_poscode_ark" value="${al.poscode_ask}"/>
            <input type="hidden" id="ta_offcode_ark" name="ta_offcode_ark" value="${al.offcode_ask}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_ark&formname=ta_staff_name_ark&id=ta_staff_id_ark&posname=ta_posname_ark&offcode=ta_offcode_ark' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
            <font style="color:red">*</font>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input id="ta_posname_ark" name="ta_posname_ark" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.posname_ask}"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
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
        	<c:if test="${al == null}" >
        		<input type="text" name="ta_approve_lean" class="textbox" size="35" value="${al_approve_lean }" >
        	</c:if>
            <c:if test="${al != null}" >
        		<input type="text" name="ta_approve_lean" class="textbox" size="35" value="${al.approve_lean }" >
        	</c:if>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ชื่อผู้อนุมัติ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" id="ta_staff_name_approve" name="ta_staff_name_approve" class="textview" size="37" value="${al.staff_name_approve}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
            <input type="hidden" id="ta_staff_id_approve" name="ta_staff_id_approve" value="${al.staff_id_approve}"/>
            <input type="hidden" id="ta_poscode_approve" name="ta_poscode_approve" value="${al.poscode_approve}"/>
            <input type="hidden" id="ta_offcode_approve" name="ta_offcode_approve" value="${al.offcode_approve}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=ta_poscode_approve&formname=ta_staff_name_approve&id=ta_staff_id_approve&posname=ta_posname_approve&offcode=ta_offcode_approve' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input id="ta_posname_approve" name="ta_posname_approve" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.posname_approve}"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
</table>

