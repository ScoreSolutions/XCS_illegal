<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%@ include file="/Templates/meta.jsp" %>

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
            <input type="Text" id="al_accept_date" name="al_accept_date" value="${al.accept_date}" size="12" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
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
        	<c:if test="${db == null}">
            	<input type="text" id="al_report_to" name="al_report_to" class="textbox" size="30" value="${al_report_to}">
            </c:if>
        	<c:if test="${db != null}">
            	<input type="text" id="al_report_to" name="al_report_to" class="textbox" size="30" value="${al.report_to}">
            </c:if>
            <font style="color:red">*</font>
            <i>เช่น ผู้อำนวยการส่วนคดี</i>
            
        </td>
    </tr>
    <tr>
        <td width="20%" align="right">ชื่อผู้พิสูจน์ :&nbsp;</td>
        <td width="30%">
            <input type="text" id="prove_name" name="prove_name" class="textview" size="37" value="${al.prove_staff_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input id="pospname" name="pospname" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35"
                   value="${al.prove_posname}"/>
        </td>
    </tr>
    <tr>
        <td align="right">เจ้าหน้าที่ดำเนินคดี :&nbsp;</td>
        <td>
            <input type="text" name="sue_name" class="textview" size="37" value="${al.sue_staff_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
        </td>
        <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td>
            <input name="possname" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.sue_posname}"/>
        </td>
    </tr>
    <tr>
        <td align="right">เปรียบเทียบปรับเป็นเงิน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="al_fine" id="al_fine" class="textViewNum" size="20" value="${al.case_total_fine}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >บาท&nbsp;
            (<span id="alFineText"></span>)
        </td>
    </tr>
    <tr>
        <td align="right">เงินสินบน ${db.bribe_money_p} % เป็นเงิน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="al_bribe_money" id="al_bribe_money" class="textViewNum" size="20" value="${al.birbe_money}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >บาท&nbsp;
            (<span id="alBirbeText"></span>)
        </td>
    </tr>
    <tr>
        <td align="right">เงินรางวัล ${db.reward_money_p} % เป็นเงิน :&nbsp;</td>
        <td colspan="3">
            <input type="text" name="al_reward_money" id="al_reward_money" class="textViewNum" size="20" value="${al.reward_money}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >บาท&nbsp;
            (<span id="alRewardText"></span>)
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
        	<c:if test="${db == null}">
        		<input type="text" name="al_accept_lean" id="al_accept_lean" class="textbox" size="35" value="${al_accept_lean}">
        	</c:if>
            <c:if test="${db != null}">
        		<input type="text" name="al_accept_lean" id="al_accept_lean" class="textbox" size="35" value="${al.accept_lean}">
        	</c:if>
            <font style="color:red">*</font>
        </td>
    </tr>
    <tr>
        <td width="20%" align="right">ชื่อผู้จับกุม :&nbsp;</td>
        <td width="30%">
            <input type="text" id="al_staff_name_arrest" name="al_staff_name_arrest" class="textview" size="37" value="${al.arrest_staff_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" style="float:left">
            <input type="hidden" id="al_staff_id_arrest" name="al_staff_id_arrest" value="${al.staff_id_arrest}"/>
            <input type="hidden" id="al_poscode_arrest" name="al_poscode_arrest" value="${al.poscode_arrest}"/>
            <input type="hidden" id="al_offcode_arrest" name="al_offcode_arrest" value="${al.offcode_arrest}"/>
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
            <input id="al_posname_arrest" name="al_posname_arrest" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="37" value="${al.posname_arrest}"/>
        </td>
        <td align="right">สังกัด :&nbsp;</td>
        <td>
            <input type="text" id="al_offname_arrest" name="al_offname_arrest" class="textview" size="37" value="${al.offname_arrest}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
        </td>
    </tr>
    <tr>
        <td height="25" align="right" valign="middle">ขอรับรองว่า :&nbsp;</td>
        <td colspan="3">
            <TEXTAREA NAME="al_accept_desc" id="al_accept_desc" ROWS="2" COLS="73" >${al.accept_desc}</TEXTAREA>
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
        	<c:if test="${db == null}">
        		<input id="text1" name="al_leader_lean" id="al_leader_lean" type="text" class="textbox" size="35" value="${al_leader_lean}"/>
        	</c:if>
        	<c:if test="${db != null}">
        		<input id="text1" name="al_leader_lean" id="al_leader_lean" type="text" class="textbox" size="35" value="${al.leader_lean}"/>
        	</c:if>
            
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="al_rb_leader_accept" value="Y" ${(al.leader_accept != 'N')?'checked':''}
                   OnClick="
													document.getElementById('al_txtLeaderAccept').disabled=false;
													document.getElementById('al_txtLeaderUnAccept').disabled=true;
													document.getElementById('al_txtLeaderUnAccept').value='';
													"
                    > รับรอง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="al_txtLeaderAccept" name="al_txtLeaderAccept" type="text" class="textbox" size="50" ${(al.leader_accept != 'N')?'':'disabled'}
                   value="${al.leader_accept_reason}" style="display:none" />
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
            <input id="al_txtLeaderUnAccept" name="al_txtLeaderUnAccept" type="text" class="textbox" size="50" ${(al.leader_accept == 'N')?'':'disabled'}
                   value="${al.leader_deny_reason}"/>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" id="al_staff_name_leader" name="al_staff_name_leader" class="textview" size="35" value="${al.leader_staff_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
            <input type="hidden" id="al_staff_id_leader" name="al_staff_id_leader" value="${al.staff_id_leader}"/>
            <input type="hidden" id="al_poscode_leader" name="al_poscode_leader" value="${al.poscode_leader}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=al_poscode_leader&formname=al_staff_name_leader&id=al_staff_id_leader&posname=al_posname_leader' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input id="al_posname_leader" name="al_posname_leader" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.leader_posname}"/>
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
        	<c:if test="${db == null}">
        		<input id="al_section_director_lean" name="al_section_director_lean" type="text" class="textbox" size="35" value="${al_section_director_lean}"/>
        	</c:if>
        	<c:if test="${db != null}">
        		<input id="al_section_director_lean" name="al_section_director_lean" type="text" class="textbox" size="35" value="${al.section_director_lean}"/>
        	</c:if>
            
        </td>
    </tr>
    <tr>
        <td align="right">&nbsp;</td>
        <td colspan="3" align="left">
            <INPUT TYPE="radio" NAME="al_rb_section_director_accept" value="Y" ${(al.section_director_accept != 'N')?'checked':''}
                   OnClick="
													document.getElementById('al_txtSectionDirectorAccept').disabled=false;
													document.getElementById('al_txtSectionDirectorUnAccept').disabled=true;
													document.getElementById('al_txtSectionDirectorUnAccept').value='';
													"
                    > รับรอง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="al_txtSectionDirectorAccept" name="al_txtSectionDirectorAccept" type="text" class="textbox" ${(al.section_director_accept != 'N')?'':'disabled'}
                   size="50" value="${al.section_director_accept_reason}" style="display:none" />
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
            <input id="al_txtSectionDirectorUnAccept" name="al_txtSectionDirectorUnAccept" type="text" class="textbox" ${(al.section_director_accept == 'N')?'':'disabled'}
                   size="50" value="${al.section_director_deny_reason}"/>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" id="al_staff_name_section_director" name="al_staff_name_section_director" class="textview" size="35" value="${al.section_director_staff_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
            <input type="hidden" id="al_staff_id_section_director" name="al_staff_id_section_director" value="${al.staff_id_section_director}"/>
            <input type="hidden" id="al_poscode_section_director" name="al_poscode_section_director" value="${al.poscode_section_director}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=al_poscode_section_director&formname=al_staff_name_section_director&id=al_staff_id_section_director&posname=al_posname_section_director' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,,modal=yes');"/>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input id="al_posname_section_director" name="al_posname_section_director" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.section_director_posname}"/>
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
            <INPUT TYPE="radio" NAME="al_rb_res_director_accept" value="Y" ${(al.res_director_accept != 'N')?'checked':''}
                   OnClick="
													document.getElementById('al_txtResDirectorAccept').disabled=false;
													document.getElementById('al_txtResDirectorUnAccept').disabled=true;
													document.getElementById('al_txtResDirectorUnAccept').value='';
													"
                    > รับรอง&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input id="al_txtResDirectorAccept" name="al_txtResDirectorAccept" type="text" class="textbox" size="50" ${(al.res_director_accept != 'N')?'':'disabled'}
                   value="${al.res_director_accept_reason}" style="display:none" />
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
                   ${(al.res_director_accept == 'N')?'':'disabled'} 
                   value="${al.res_director_deny_reason}"/>
        </td>
    </tr>
    <tr>
        <td width="20%" height="25" align="right" valign="middle">ลงชื่อ&nbsp;:&nbsp;</td>
        <td width="30%">
            <input type="text" id="al_staff_name_res_director" name="al_staff_name_res_director" class="textview" size="35" value="${al.res_director_staff_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
            <input type="hidden" id="al_staff_id_res_director" name="al_staff_id_res_director" value="${al.staff_id_res_director}"/>
            <input type="hidden" id="al_poscode_res_director" name="al_poscode_res_director" value="${al.poscode_res_director}"/>
            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                 onClick="window.open('process?action=Divide_staff_pop&poscode=al_poscode_res_director&formname=al_staff_name_res_director&id=al_staff_id_res_director&posname=al_posname_res_director' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        </td>
        <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
        <td width="30%">
            <input id="al_posname_res_director" name="al_posname_res_director" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.res_director_posname}"/>
        </td>
    </tr>
    <tr>
        <td colspan="4">&nbsp;</td>
    </tr>
</table>


