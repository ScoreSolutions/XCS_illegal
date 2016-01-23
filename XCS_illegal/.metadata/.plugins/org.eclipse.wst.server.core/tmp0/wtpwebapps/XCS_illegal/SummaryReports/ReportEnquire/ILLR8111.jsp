<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>  

<!-- Body -->
<table width="100%" border="1" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
			 	<tr>
			 		<td width="1%">&nbsp;</td>
	              	<td width="99%">
	              		<span class="websitename">1.11 สรุปผลการปราบปรามการกระทำผิดกฎหมายสรรพสามิตในส่วนภูมิภาค</span>
	              	</td>
	            </tr> 
	            <tr><td colspan="2">&nbsp;</td></tr>
	            <tr>
	            	<td >&nbsp;</td>
	             	<td ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
	            </tr> 
	            <tr>
	            	<td>&nbsp;</td>
	            	<td>
	            		<jsp:include page='../UserControl/ctlMonthFromTo.jsp' />
	            	</td>
	            </tr>
	            <tr>
	            	<td >&nbsp;</td>
	               	<td >
	               		<table width="700" border="0" cellspacing="0" cellpadding="0">
	               			<tr>
	               				<td width="20%" align="right" height="30px">ปีงบประมาณ :&nbsp;</td>
	               				<td width="80%" ><input  type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8"></td>
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
	            		<jsp:include page='../UserControl/ctlEdOffice.jsp' />
	            	</td>
	            </tr>
	            <tr>
					<td height="30px">&nbsp;</td>
					<td>
						<table width="700" border="0" cellspacing="0" cellpadding="0">
	               			<tr>
	               				<td align="right" width="20%">&nbsp;</td>
	               				<td align="left" width="80%">
	               					<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();"/>
	               				</td>
	               			</tr>
               			</table>
					</td>
				</tr>
			</table>

              	 	 
<script type='text/javascript'>
function report(){

 	var monthto=document.getElementById("monthto").value;
  	var monthfrom=document.getElementById("monthfrom").value;
   	var year1=document.getElementById("year1").value - 543;
    var branch=document.getElementById("branch").value;
    var area=document.getElementById("area").value;
    var sector=document.getElementById("sector_code").value;
    var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
    var yearfrom;
  	var datefrom;
	var yearto;
	var dateto;	 
	yearfrom=monthfrom.substring(0,1);
	datefrom=(year1-yearfrom) + "" + monthfrom.substring(3,1);
	yearto=monthto.substring(0,1);	
	dateto=(year1-yearto) + "" + monthto.substring(3,1);

	if(monthfrom != "" && monthto != "" && year1 != ""){
 	  	var param = 'process?action=Report&__report=ILLR8111&__formatt=pdf&getMonthFrom='+datefrom+
		'&getMonthTo='+dateto+'&getOffcode1='+sector+'&getOffcode2='+area+
		'&getOffcode3='+branch+'&getUserID='+user_id;
		alert(param);
		window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
	}else{
		alert("กรุณาระบุเงื่อนไขให้ถูกต้อง");
	}
}

</script>
		   			
		</td>
	</tr>
</table>