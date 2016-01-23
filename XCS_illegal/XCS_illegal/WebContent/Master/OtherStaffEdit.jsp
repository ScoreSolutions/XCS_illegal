<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler"%>
<%
	FormHandler formHandler = new FormHandler(request);
%>
<script type='text/javascript' src='dwr/interface/OtherStaffList.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>

<script type="text/javascript">
function checkIDinter(idinter){
	var id = idinter.value;
	
    var charIdin = (event.which) ? event.which : event.keyCode
    if ((charIdin > 47 && charIdin < 58) || (charIdin > 64 && charIdin < 91)) {
    	//alert(charIdin);
    	
    }else{
    	event.keyCode = 0;
    }
    
}
function checkIDcard(idCard){
	var id = idCard.value;
    var charId = (event.which) ? event.which : event.keyCode
    if (charId > 31 && (charId < 48 || charId > 57)) {
    	event.keyCode = 0;
    }
    
}
function fncAlert(){
	var value=document.getElementById("staff_idcardno").value;
	if(value.length < 13){
		alert("กรุณาป้อนรหัสประจำตัวให้ครบ 13 หลัก");
		document.getElementById("staff_idcardno").focus();
	}else{
		OtherStaffList.CheckIDcardNO(value,function(data) {
			if(data){
				alert("รหัสประจำตัวนี้มีอยู่ในระบบแล้ว");
				document.getElementById("staff_idcardno").focus();
			}else{
				
			}
		});
	}
}
</script>
<form method="post" name="dataform" action="<c:url value="/process?action=OtherStaffList_Master&cmd=update"/>" >
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">

              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%">
					<span class="websitename">กำหนดชื่อเจ้าหน้าที่อื่นๆ</span>
				 </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="15">&nbsp;</td>
              </tr>
			  <tr>
				<td >&nbsp;</td>
				<td>
					<input name="btnSave"  type="submit" class="barbutton" value="บันทึก" >
					<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="javascript:location.href='<c:url value="/process?action=OtherStaffList_Master&cmd=edit&id=${stafflist.id}"/>'" >
					<input name="btnBack"  type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="javascript:location.href='<c:url value="/process?action=OtherStaffList_Master"/>'">
				</td>
			  </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="25">&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
						<table border="0" cellpadding="0" cellspacing="0" width="1000">
							<tr>
                				<td width="20%" align="right">รหัสเจ้าหน้าที่ :&nbsp;</td>
                				<td width="30%">
									<input name="staff_idcardno" type="text" class="textview" readonly value="${stafflist.staff_no }" size="25" />
								</td>
								<td width="20%" align="right" >&nbsp;</td>
								<td width="30%" height="25">
									&nbsp;
								</td>
							</tr>
							<tr>
                				<td align="right">ชื่อ-สกุล :&nbsp;</td>
                				<td colspan="3">
										<select name="staff_offcode" style="width:100" >
											  <option value="" selected>เลือก</option>
											  <c:forEach items="${listSelect}"  var="titlelist" >
											  	<option value="${titlelist.title_code }" <c:if test="${stafflist.title_code == titlelist.title_code }">selected</c:if> >${titlelist.title_name }</option>
											  </c:forEach>
										</select>&nbsp;&nbsp;
										<input type="hidden" name="id" class="textbox" size="15" value="${stafflist.id }">
										<input type="hidden" name="idconfig" class="textbox" size="15" value="${param.idconfig }">
										<input type="text" name="staff_first_name" class="textbox" size="15" value="${stafflist.first_name }">
										&nbsp;&nbsp;&nbsp;
										<input type="text" name="staff_last_name" class="textbox" size="15" value="${stafflist.last_name }">
										<font style="color:red">*</font>
								</td>
							</tr>
							<tr>
								<td align="right">ตำแหน่ง :&nbsp;</td>
								<td height="25" colspan="3" >
								   <input type="text" name="staff_poscode" size="50"  class="textbox"  value="${stafflist.pos_name }" >
								   <font style="color:red">*</font>
								</td>
                			</tr>
							<tr>
								<td align="right">สังกัด :&nbsp;</td>
								<td height="25" colspan="3" >
								   <input type="text" name="dept_name" size="50"  class="textbox"  value="${stafflist.dept_name }" >
								   <font style="color:red">*</font>
								</td>
                			</tr>
                			<tr>
								<td align="right">วันที่เริ่มงาน :&nbsp;</td>
								<td height="25" >
								    <input type="Text" id="start_date" name="start_date" size="15" class="textdate" value="<fmt:formatDate value='${stafflist.start_date}' pattern='dd/MM/yyyy' />" readonly /> 
									<a href="javascript:NewCssCal('start_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a> 
									<font style="color: red">*</font>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									วันที่ออก :&nbsp;
									<input type="Text" id="end_date" name="end_date" size="15" class="textdate" value="<fmt:formatDate value='${stafflist.end_date}' pattern='dd/MM/yyyy' />" readonly /> 
									<a href="javascript:NewCssCal('end_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
								</td>
							</tr>
							<tr>
								<td align="right">&nbsp;</td>
								<td height="25" >
								   	 <input type="checkbox" name="active" value="1" <c:if test="${stafflist.active == '1'}">checked</c:if> />ใช้งาน
								</td>
                			</tr>
							<tr><td colspan="4" align="center">&nbsp;</td></tr>
                		</table>
					</td>
              </tr>
            </table></td>
		  </tr>
		</table>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
  	//frmvalidator.addValidation("staff_level","maxlen=20","จำนวนตัวอักษรยาวเกิน 20 ตัวอักษร ");
	frmvalidator.addValidation("dept_name","req","กรุณาป้อน สังกัด");
	frmvalidator.addValidation("staff_poscode","req","กรุณาป้อน ตำแหน่ง");
	frmvalidator.addValidation("staff_offcode","req","กรุณาเลือก คำนำหน้าชื่อ");
	frmvalidator.addValidation("staff_first_name","req","กรุณาป้อน ชื่อ");
	frmvalidator.addValidation("staff_last_name","req","กรุณาป้อน นามสกุล");

	//frmvalidator.addValidation("staff_idcardno","maxlen=13","จำนวนตัวอักษรยาวเกิน 13 หลัก  ");

	//frmvalidator.addValidation("staff_idcardno","req","กรุณาป้อน รหัสเจ้าหน้าที่");
</script>
