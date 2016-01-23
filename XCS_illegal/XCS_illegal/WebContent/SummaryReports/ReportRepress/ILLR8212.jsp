<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%" align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="1%">&nbsp;</td>
            	 	<td width="99%" height="40"><span class="websitename">2.12 รายงานการจัดอัตรากำลังสายตรวจป้องกันและปราบปราม</span></td>
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
								<td width="20%" align="right">หน่วยงาน :&nbsp;</td>
			            	 	<td width="80%" align="left" >
			            	 		<select id="offcode" name="offcode" style="width: 325px" >
			            	 			<option value="">เลือก</option>
			            				<c:forEach items="${sclist}" var="sc">
			            					<option value="${sc.offcode}" >${sc.short_name}</option>
			            				</c:forEach>
			            	 		</select>
								  	<font style="color: red">*</font> 
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
					 var offcode=document.getElementById("offcode").value;
					 var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
					 			
						if(offcode==""){
							alert('กรุณาเลือกหน่วยงาน');
							document.getElementById("offcode").focus();
						}else{
							var param = 'process?action=Report&__report=ILLR8212&__formatt=pdf&vOffcode='+offcode+'&getUserID='+user_id;
			    			window.open(param, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
   							
   						}
					}
				</script>
		</td>
	</tr>
</table>
	