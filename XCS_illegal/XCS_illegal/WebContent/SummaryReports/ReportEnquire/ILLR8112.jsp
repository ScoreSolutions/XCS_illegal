<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
             	<td width="99%"><span class="websitename">1.12 สถิติผลการปราบปรามผู้กระทำผิดกฎหมายสรรพสามิต</span></td>
            </tr>
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
            </tr>
            <tr>
            	<td>&nbsp;</td>
            	<td>
            		<table width="700" border="0" cellpadding="0" cellspacing="0" >
						<tr>
							<td width="20%"  align="right">ปีงบประมาณนี้ :&nbsp;</td>	
							<td width="80%" align="left">
								<input type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="6">
								<font style="color: red">*</font> 
							</td>
						</tr>
						<tr>
							<td align="right">ปีงบประมาณก่อน :&nbsp;</td>
							<td>
								<input type="text" name="year2" onkeypress="ChkMinusInt('this');" maxlength="4" id="year2" size="6">
								<font style="color: red">*</font> 
							</td>
						</tr>
						<tr>
							<td align="right">ปีงบประมาณก่อนหน้า :&nbsp;</td>
							<td>
								<input type="text" name="year3" onkeypress="ChkMinusInt('this');" maxlength="4" id="year3" size="6">
								<font style="color: red">*</font> 
							</td>
						</tr>
						<tr>
							<td align="right">ปีงบประมาณก่อนหน้านี้ :&nbsp;</td>
							<td>
								<input type="text" name="year4" onkeypress="ChkMinusInt('this');" maxlength="4" id="year4" size="6">
								<font style="color: red">*</font> 
							</td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>
								
							</td>
						</tr>					
					</table>
            	</td>
            </tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  ><span class="sectionname">ประเภทรายงาน</span></td>
            </tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  ><jsp:include page='../UserControl/ctlEdOffice.jsp' /></td>
            </tr>
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr >
              	<td >&nbsp;</td>
             	<td  >
             		<table width="700" border="0" cellpadding="0" cellspacing="0" >
						<tr>
							<td width="20%"  align="right">&nbsp;</td>	
							<td width="80%" align="left">
								<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();" />
							</td>
						</tr>
					</table>
             	</td>
            </tr>
         </table>
         
<script type='text/javascript'>
function report(){

	var year1=document.getElementById("year1").value;
	var year2=document.getElementById("year2").value;
	var year3=document.getElementById("year3").value;
	var year4=document.getElementById("year4").value;
	var vYear1=(year1-543);
	var vYear2=(year2-543);	
	var vYear3=(year3-543);
	var vYear4=(year4-543);	
  	var vOffcode1 = document.getElementById("sector_code").value;
  	var vOffcode2 = document.getElementById("area").value;
  	var vOffcode3 = document.getElementById("branch").value;
  	var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";

	if(year1 == ""){
		alert('กรุณาระบุปีงบประมาณนี้');
		document.getElementById("year1").focus();
	}else if(year2 == ""){
		alert('กรุณาระบุปีงบประมาณก่อน');
		document.getElementById("year2").focus();
	}else if(year3 == ""){
		alert('กรุณาระบุปีงบประมาณก่อนหน้า');
		document.getElementById("year3").focus();
	}else if(year4 == ""){
		alert('กรุณาระบุปีงบประมาณก่อนหน้านี้');
		document.getElementById("year4").focus();
	}else{
		var param = 'process?action=Report&__report=ILLR8112&__formatt=pdf&vYear1='+vYear1+'&vYear2='+vYear2+'&vYear3='+vYear3+'&vYear3='+vYear4+'&vOffcode1='+vOffcode1+'&vOffcode2='+vOffcode2+'&vOffcode3='+vOffcode3+'&getUserID='+user_id;
		alert (param);
		window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
	}
}
</script>
		   			
		</td>
		</tr>
		</table>
		