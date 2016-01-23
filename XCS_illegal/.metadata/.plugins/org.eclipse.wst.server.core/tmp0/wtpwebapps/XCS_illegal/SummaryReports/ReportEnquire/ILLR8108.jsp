<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
             	<td width="99%"><span class="websitename">1.8 ผลการปราบปรามคดี</span></td>
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
							<td width="20%"  align="right">ปีงบประมาณ :&nbsp;</td>	
							<td width="80%" align="left">
								<input type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="6">
								<font style="color:red">*</font>
							</td>
						</tr>
						<tr >
							<td align="right"  >ประเภทสินค้า :&nbsp;</td>
							<td align="left" >
								<select name="group_id" id="group_id" style="width:325px;">
									<option selected>เลือก</option>
		            				<c:forEach items="${dglist}" var="dg">
		            					<option value="${dg.group_id}">${dg.group_name}</option>
		            				</c:forEach>
		            			</select>
		            			<font style="color:red">*</font>
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
  	var vOffcode1 = document.getElementById("sector_code").value;
  	var vOffcode2 = document.getElementById("area").value;
  	var vOffcode3 = document.getElementById("branch").value;
  	var vGroupID = document.getElementById("group_id").value;
  	var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
  	var vYear=(year1-543);	

	if(year1 == ""){
		alert('กรุณาระบุปีงบประมาณ');
		document.getElementById("year1").focus();
	}else if(vGroupID == ""){
		alert('กรุณาเลือกประเภทสินค้า');
		document.getElementById("group_id").focus();
	}else{
		var param = 'process?action=Report&__report=ILLR8107&__formatt=pdf&vYear='+vYear+'&vOffcode1='+vOffcode1+'&vOffcode2='+vOffcode2+'&vOffcode3='+vOffcode3+'&vGroupID='+vGroupID+'&getUserID='+user_id;
		alert (param);
		window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');		 
	}
}
</script>
		   			
		</td>
		</tr>
		</table>
		