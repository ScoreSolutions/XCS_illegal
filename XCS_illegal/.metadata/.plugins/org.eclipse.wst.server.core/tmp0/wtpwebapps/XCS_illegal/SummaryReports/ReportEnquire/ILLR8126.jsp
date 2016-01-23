<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
             	<td width="99%"><span class="websitename">1.26 ผลการปราบปรามจับกุมผู้กระทำผิด พ.ร.บ.สุรา</span></td>
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
							<td width="20%" align="right">ปีงบประมาณ :&nbsp;</td>	
							<td width="30%" align="left">
								<input  type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
								<font style="color: red">*</font>
							</td>
							<td width="20%" align="right">ถึง :&nbsp;</td>	
							<td width="30%" align="left">
								<input  type="text" name="year2" onkeypress="ChkMinusInt('this');" maxlength="4" id="year2" size="8">
								<font style="color: red">*</font>
							</td>
						</tr>
						<tr> 
				       	 	<td >&nbsp;</td>
				       	 	<td>
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
  	var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
  	
	if(year1 != "" && year2 != ""){
		year1 = year1-543;
		year2 = year2-543;
		var param = 'process?action=Report&__report=ILLR8126&__formatt=pdf&getYearFrom='+year1+'&getYearTo='+year2+'&getUserID='+user_id;
		//alert(param);
		window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
	}else{
		 alert('โปรดใส่ข้อมูลให้ถูกต้อง');
	}
}
</script>
		   			
		</td>
		</tr>
		</table>
		