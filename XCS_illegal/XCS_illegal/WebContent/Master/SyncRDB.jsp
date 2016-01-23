<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>

<script>

function allCheck(chkcont,chk)
{
	if(!chk.length){
		if(chkcont.checked==true){
			chk.checked = true ;
		}else{		
			chk.checked = false ;
		}
	}else{
		if(chkcont.checked==true){
			for (i = 0; i < chk.length; i++)
				chk[i].checked = true ;
		}else{
			for (i = 0; i < chk.length; i++)
				chk[i].checked = false ;
		}
	}
}
</script>

<form method="post" name="dataform" action="<c:url value="/process?action=SyncRDB&cmd=SyncData" />" >
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
       <tr>
          <td width="100%" align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
               <tr><td colspan="2">&nbsp;</td></tr>
               <tr>
                 <td width="1%">&nbsp;</td>
                 <td width="99%"><span class="websitename">ซิงค์ข้อมูลจากฐานข้อมูลอ้างอิงกลาง (RDB)</span></td>
               </tr>
               <tr><td colspan="2">&nbsp;</td></tr>
               <tr>
					<td>&nbsp;</td>
					<td>
						<input name="btnSync" type="submit" class="barbutton"
						value="ทำข้อมูลให้ตรงกัน"
						onclick="writeTranLog('ซิงค์ข้อมูลกับ RDB')">
					</td>
				</tr>
               <tr><td colspan="2">&nbsp;</td></tr>
               <tr>
	               <td >&nbsp;</td>
	               <td>
	               		*เลือกตารางที่ต้องการทำข้อมูลให้ตรงกัน<br/>
	               		<font color="red"> ${ErrMsg}</font>
	               		<font color="Blue"><b>${CompleteMsg}</b></font>
	               </td>
               </tr>
               <tr height="450">
               	   <td >&nbsp;</td>
	               <td align="left" valign="top">
	               		<table class="tableList" bordercolor="#CCCCCC" border="1" cellpadding="0" cellspacing="0" width="80%">
	               			<tr class="TblHeaderColumn AlignCenter">
	               				<td width="10%">ลำดับที่</td>
	               				<td width="10%"><input name="aalchkAll" type="checkbox" onClick="allCheck(this,document.dataform.chkList);"/></td>
	               				<td width="80%">ชื่อตาราง</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >1.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="ED_OFFICE" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลหน่วยงาน(ED_OFFICE)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >2.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="DUTY_GROUP" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลกลุ่มสินค้า(DUTY_GROUP)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >3.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="DUTY_TABLE" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลสินค้าตามพิกัดอัตราภาษี(DUTY_TABLE)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >4.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="PRODUCT_TYPE" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลประเภทสินค้า(PRODUCT_TYPE)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >5.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="UNIT" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลหน่วยนับ(PRODUCT_UNIT)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >6.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="DUTY_UNIT" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลหน่วยนับสินค้า(DUTY_UNIT)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >7.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="COUNTRY" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลประเทศ(COUNTRY)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >8.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="PROVINCE" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลจังหวัด(PROVINCE)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >9.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="DISTRICT" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลอำเภอ(DISTRICT)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >10.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="SUBDISTRICT" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลตำบล(SUBDISTRICT)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >11.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="TITLE" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลคำนำหน้าชื่อ(TITLE)</td>
	               			</tr>
	               			<tr>
	               				<td class="TblRow AlignCenter" >12.</td>
	               				<td Align="Center"><input name="chkList" type="checkbox" value="BRAND_MAIN" /></td>
	               				<td class="TblRow AlignLeft">ข้อมูลยี่ห้อหลัก(BRAND_MAIN)</td>
	               			</tr>
	               		</table>
	               		<table border="0" cellpadding="0" cellspacing="0" width="80%">
	               			<tr><td>&nbsp;</td></tr>
	               			<tr>
	               				<td>
	               				<b>หมายเหตุ !</b> การตรวจสอบข้อมูลและทำข้อมูลให้ตรงกัน เป็นกระบวนการที่อาจใช้เวลานาน และอาจทำให้ระบบงานเกิดความล่าช้า</br>
	               				ในกรณีที่มีผู้ใช้งานร่วมกันหลายคน อาจทำให้เครื่อง Server ทำงานหนัก จนไม่สามารถทำการประมวลผลต่อได้<br />
	               				และมีการแจ้งระบบทำงานผิดพลาดออกทางหน้าจอ แต่จะไม่มีผลกระทบต่อระบบงานแต่อย่างใด
	               				</td>
	               			</tr>
	               		</table>
	               </td>
               </tr>
            </table>
          </td>
       </tr>
    </table>
</form>