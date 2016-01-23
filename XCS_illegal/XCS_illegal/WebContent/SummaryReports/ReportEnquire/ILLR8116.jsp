<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>

<table width="100%" height="100%" border="1" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 		<tr>
		 			<td width="1%" >&nbsp;</td>
         			<td width="99%"><span class="websitename">1.16 รายละเอียดจำนวนคดี ค่าปรับ และของกลางผู้กระทำผิด พ.ร.บ.สุรา</span></td>
         		</tr> 
         		<tr><td colspan="2">&nbsp;</td></tr>
        		<tr>
        			<td  >&nbsp;</td>
             		<td ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
        		</tr>
        		<tr>
	            	<td>&nbsp;</td>
	   	            <td align="left" >
	   	            	<jsp:include page='../UserControl/ctlMonthFromTo.jsp' />
					</td> 
				</tr>
				<tr >
					<td >&nbsp;</td>
					<td>
						<table width="700" border="0" cellpadding="0" cellspacing="0" >
							<tr>
								<td align="right">ปีงบประมาณ :&nbsp;</td>
								<td height="35px">
									<input type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
									<font style="color: red">*</font>
								</td>
							</tr>
							<tr>
								<td width="20%" align="right">สรุปจังหวัดในภาค :&nbsp;</td>
								<td width="80%" align="left" height="35px">
									<select  id="sector_code" name="sector_code" style="width: 365px" >
						   				<option value="">เลือก</option>
						   				<c:forEach var="ed" items="${sclist}">
						   					<option value="${ed.offcode }">${ed.offname }</option>
						   				</c:forEach> 
						   			</select> 
						   			<font style="color:red">*</font>
								</td>
							</tr>
							<tr>
					 			<td height="40px">&nbsp;</td>
					 			<td><input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();"/></td>
					 		</tr>
						</table>
					</td>
				</tr>						
			</table>
		</td>
	</tr>
</table>

		
			
              	<script type='text/javascript'>
              
					function report(){
						var monthto=document.getElementById("monthto").value.substring(3,1);
 						var monthfrom=document.getElementById("monthfrom").value.substring(3,1);
  						var year1=document.getElementById("year1").value;
    					var sector_code=document.getElementById("sector_code").value;
    					var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
 
						if(monthto==""||monthfrom==""){
							alert('กรุณาป้อนเดือนที่ทำรายงาน');
						}else if(year1==""){
							alert('กรุณาป้อนปีงบประมาณ');
						}else if(sector_code==""){
							alert("กรุณาเลือกหน่วยงาน");
						}else{
							year1 = year1 - 543;
							var param = 'process?action=Report&__report=ILLR8116&__formatt=pdf&vMonthFrom='+monthfrom+
								'&vMonthTo='+monthto+'&vYear='+year1+'&vOffcode='+sector_code+'&getUserID='+user_id;
							//alert(param);
							window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
   											
						}
					}
				</script>
