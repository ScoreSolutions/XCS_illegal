<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%@ include file="/Templates/meta.jsp" %>

        <table width="800" border="0" cellspacing="0" cellpadding="0">
        	<input type="hidden" name="al_id" value="${al.id}"/>
            <tr class="bgRowGray">
                <td colspan="4"><strong>บันทึกการรับรองผล</strong></td>
            </tr>
            <tr>
                <td colspan="4">&nbsp;</td>
            </tr>
            <tr>
                <td width="20%" align="right">เจ้าหน้าที่ดำเนินคดี/&nbsp;<br>ผู้มีอำนาจเปรียบเทียบ :&nbsp;</td>
                <td width="30%">
                    <input type="text" name="al_staff_name_arrest" class="textview" size="37" value="${al.sue_staff_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
                </td>
                <td width="20%" height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td width="30%">
                    <input name="al_posname_arrest" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.sue_posname}"/>
                </td>
            </tr>
            <tr>
                <td align="right">เปรียบเทียบปรับเป็นเงิน :&nbsp;</td>
                <td>
                    <input type="text" id="to_fine" name="al_fine" class="textViewNum" size="20" value="${al.case_fine}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >บาท&nbsp;
                </td>
                <td align="right">เงินรางวัล ${db.reward_money_p} % เป็นเงิน :&nbsp;</td>
                <td>
                    <input type="text" id="to_reward_money" name="al_reward_money" class="textViewNum" size="20" value="${al.reward_money}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >บาท&nbsp;
                </td>
            </tr>
            <tr>
                <td>&nbsp;</td>
                <td valign="top">(<span id="toFineText"></span>)</td>
                <td>&nbsp;</td>
                <td valign="top">(<span id="toRewardText"></span>)</td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ชื่อผู้จับกุม&nbsp;:&nbsp;</td>
                <td>
                    <input type="text" id="to_staff_name_arrest" name="to_staff_name_arrest" class="textview" size="37" value="${al.accuser_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
                    <input type="hidden" id="to_staff_id_arrest" name="to_staff_id_arrest" value="${al.staff_id_arrest}"/>
                    <input type="hidden" id="to_poscode_arrest" name="to_poscode_arrest" value="${al.poscode_arrest}"/>
                    <input type="hidden" id="to_offcode_arrest" name="to_offcode_arrest" value="${al.offcode_arrest}"/>
                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                         onClick="window.open('process?action=Divide_staff_pop&poscode=to_poscode_arrest&formname=to_staff_name_arrest&id=to_staff_id_arrest&posname=to_posname_arrest&offcode=to_offcode_arrest' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
                    <font style="color:red">*</font>
                </td>
                <td height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
                <td>
                    <input id="to_posname_arrest" name="to_posname_arrest" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${al.accuser_posname}" />
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ความเห็นอื่น :&nbsp;</td>
                <td colspan="3"><TEXTAREA NAME="to_lawyer_opinion" ROWS="2" COLS="73">${al.lawyer_opinion }</TEXTAREA></td>
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
                <td colspan="3">
                	<c:if test="${al == null}" >
                		<input name="to_law_director_position" id="to_law_director_position" type="text" class="textbox" size="35" value="${al_law_director_position}"/>
                	</c:if>
                	<c:if test="${al != null}" >
                		<input name="to_law_director_position" id="to_law_director_position" type="text" class="textbox" size="35" value="${al.law_director_position}"/>
                	</c:if>
                </td>
            </tr>
            <tr>
                <td height="25" align="right" valign="middle">ความเห็นอื่น :&nbsp;</td>
                <td colspan="3"><TEXTAREA NAME="to_law_director_opinion" ROWS="2" COLS="73">${al.law_director_opinion}</TEXTAREA></td>
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
                <td colspan="3"><TEXTAREA NAME="to_command" ROWS="2" COLS="73">${al.command}</TEXTAREA></td>
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
                <td colspan="3"><TEXTAREA NAME="to_arrest_opinion" ROWS="2" COLS="73">${al.arrest_opinion}</TEXTAREA></td>
            </tr>
            <tr>
                <td colspan="4">&nbsp;</td>
            </tr>
        </table>