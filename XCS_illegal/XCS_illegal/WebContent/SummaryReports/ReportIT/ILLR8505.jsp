<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>  

<!-- Body -->
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
			 	<tr>
			 		<td width="1%">&nbsp;</td>
	              	<td width="99%">
	              		<span class="websitename">5.5 หน้างบผลการปราบปรามผู้กระทำผิดประจำเดือน (พ.ร.บ.สุรา,ยาสูบ,ไพ่)</span>
	              	</td>
	            </tr> 
	            <tr><td colspan="2">&nbsp;</td></tr>
	            <tr>
	            	<td >&nbsp;</td>
	             	<td ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
	            </tr> 
	            <tr>
	            	<td >&nbsp;</td>
	               	<td >
	               		<table width="700" border="0" cellspacing="0" cellpadding="0">
	               			<tr>
	               				<td align="right" width="20%">เดือนที่ทำรายงาน :&nbsp;</td>
	               				<td align="left" width="80%">
	               					<select name="montfrom" id="monthfrom" class="select" style="width: 146px">
										<option value="">เลือก</option>
										<c:forEach var="mm" items="${mmlist}">
											<option value="${mm.isyear}${mm.month_no}" 
												<c:if test="${mm.month_no == param.month_no}"> selected </c:if> >
												${mm.month_name_thai}
											</option>
										</c:forEach>
									</select>
									<font style="color: red">*</font> 
									&nbsp;&nbsp;
									ถึงเดือนที่ :&nbsp;
									<select name="monthto" id="monthto" class="select" style="width: 146px">
										<option value="">เลือก</option>
										<c:forEach var="mm" items="${mmlist}">
											<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>="">
											${mm.month_name_thai}</option>
										</c:forEach>
									</select>
									<font style="color: red">*</font> 
	               				</td>
	               			</tr>
	               			<tr>
	               				<td align="right" height="30px">ปีงบประมาณ :&nbsp;</td>
	               				<td>
	               					<input  type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
	               					<font style="color: red">*</font>
	               				</td>
	               			</tr>
	               		</table>
					</td>  
				</tr>				
				<tr>
	            	<td >&nbsp;</td>
	             	<td >&nbsp;</td>
	            </tr>
	            <tr>
	            	<td >&nbsp;</td>
	             	<td ><span class="sectionname">ประเภทรายงาน</span></td>
	            </tr>
	            <tr>
	            	<td>&nbsp;</td>
	            	<td>
	            		<table width="700" border="0" cellspacing="0" cellpadding="0">
	               			<tr>
	               				<td align="right" width="20%" height="30px">ภาค :&nbsp;</td>
	               				<td align="left" width="80%">
	               					<select id="sector_code" name="sector_code" style="width: 325px" onchange="getArea('area',this.value),getBranch('branch',this.value)">
	               				</td>
	               			</tr>
	               			<tr>
								<td align="right" height="25px">พื้นที่:&nbsp;</td>
								<td>  
									<select id="area" name="area" style="width: 325px" onchange="getBranch('branch',this.value)"></select>
				                </td>
							</tr>
							<tr>
								<td align="right" height="25px"> พื้นที่/สาขา:&nbsp;</td>
								<td>
									<select id="branch" name="branch" style="width: 325px"/></select>
				        		</td>
							</tr>
							<tr>
								<td height="30px">&nbsp;</td>
								<td><input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();"/></td>
							</tr>
	               		</table>
	            	</td>
	            </tr>			
			</table>

              	 	 
<script type='text/javascript'>
function report(){

 	var monthto=document.getElementById("monthto").value;
  	var monthfrom=document.getElementById("monthfrom").value;
   	var year1=document.getElementById("year1").value;
    var branch=document.getElementById("branch").value;
    var area=document.getElementById("area").value;
    var sector=document.getElementById("sector_code").value;
    var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
    var yearfrom;
  	var datefrom;
	var yearto;
	var dateto;	 
	yearfrom=monthfrom.substring(0,1);	
	datefrom=monthfrom.substring(3,1);
	yearto=monthto.substring(0,1);	
	dateto=monthto.substring(3,1);

	if(monthfrom != "" && monthto != "" && year1 != ""){
  		var param = 'process?action=Report&__report=ILLR8505&__formatt=pdf&getMonthfrom='+datefrom+
		'&getMonthto='+dateto+'&getYear1='+year1+'&getOffcode1='+sector+'&getOffcode2='+area+
		'&getOffcode3='+branch+'&getUserID='+user_id; 
		window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=yes,scrollbars=no,width=900,height=700');
	}else{
		alert("กรุณาระบุเงื่อนไขให้ถูกต้อง");
	}
}

getSector('sector_code');
getArea('area','');
getBranch('branch','');
</script>
		   			
		</td>
	</tr>
</table>