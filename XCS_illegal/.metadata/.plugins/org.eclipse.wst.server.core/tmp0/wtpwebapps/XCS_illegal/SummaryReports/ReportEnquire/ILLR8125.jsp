<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
             	<td width="99%"><span class="websitename">1.25 ผลการปราบปรามผู้กระทำผิด พ.ร.บ.สรรพสามิต (น้ำมันและผลิตภัณฑ์น้ำมัน)</span></td>
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
							<td width="80%" align="left">
								<input value="${year1}" type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
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
  	var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
  	
	if(year1 != ""){
		year1 = year1-543;
		var param = 'process?action=Report&__report=ILLR8125&__formatt=pdf&getYear1='+year1+'&getUserID='+user_id;
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
		