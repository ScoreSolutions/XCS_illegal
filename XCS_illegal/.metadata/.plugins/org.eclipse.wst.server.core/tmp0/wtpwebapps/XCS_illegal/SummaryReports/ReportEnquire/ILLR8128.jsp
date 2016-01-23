<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<table width="100%" height="100%" border="1" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 		<tr>
		 			<td width="1%" >&nbsp;</td>
         			<td width="99%"><span class="websitename">1.28 เป้าปราบปรามประจำเดือน</span></td>
         		</tr> 
         		<tr><td colspan="2">&nbsp;</td></tr>
        		<tr>
        			<td  >&nbsp;</td>
             		<td ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
        		</tr>
        		<tr>
	            	<td>&nbsp;</td>
	   	            <td align="left" >
	   	            	<table width="700" border="0" cellspacing="0" cellpadding="0" >
	   	            		<tr>
	   	            			<td width="20%" align="right">เดือนที่ทำรายงาน :</td>
	   	            			<td width="80%" align="left">
	   	            				<select name="montfrom" id="monthfrom" class="select" style="width: 146px">
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
								<td align="right">ปีงบประมาณ :&nbsp;</td>	
								<td align="left">
									<input value="${year1}" type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
									<font style="color: red">*</font>
								</td>
							</tr>
							
							<tr>
								<td align="right">ภาค :&nbsp;</td>
								<td align="left">
									<select  id="sector_code" name="sector_code" style="width: 325px" >
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

 						var monthfrom=document.getElementById("monthfrom").value;
  						var year1=document.getElementById("year1").value;
    					var sector_code = document.getElementById("sector_code").value;
    					var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
						var monthfrom2 = monthfrom.substring(3,1);

						if(monthfrom==""){
							alert('กรุณาป้อนเดือนที่ทำรายงาน');
							document.getElementById("monthfrom").focus();
						}else if(year1==""){
							alert('กรุณาป้อนปีงบประมาณ');
							document.getElementById("year1").focus();
						}else if(sector_code==""){
							alert("กรุณาเลือกภาค");
							document.getElementById("sector_code").focus();
						}else{
							year1=year1-monthfrom.substring(0,1)-543;
							var param = 'process?action=Report&__report=ILLR8128&__formatt=pdf&vMonth='+monthfrom2+'&vYear='+year1+'&vOffcode='+sector_code+'&getUserID='+user_id;
							//alert(param);
							window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');			
						}
					}
				</script>
