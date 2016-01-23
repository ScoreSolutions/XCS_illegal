<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>

<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 		<tr>
		 			<td width="1%" >&nbsp;</td>
         			<td width="99%"><span class="websitename">2.15 รายงานผลการปฏิบัติงานตามโครงการทั่วไทยปลอดบุหรี่เถื่อน</span></td>
         		</tr> 
         		<tr><td colspan="2">&nbsp;</td></tr>
        		<tr>
        			<td  >&nbsp;</td>
             		<td ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
        		</tr>
        		<tr>
	            	<td>&nbsp;</td>
	   	            <td align="left" >
	   	            	<jsp:include page='../UserControl/ctlDateFromTo.jsp' />
					</td> 
				</tr>
				<tr >
					<td >&nbsp;</td>
					<td>
						<table width="700" border="0" cellpadding="0" cellspacing="0" >
							<tr>
								<td width="20%" align="right">สรุปจังหวัดในภาค :&nbsp;</td>
								<td width="80%" align="left" height="35px">
									<select  id="sector_code" name="sector_code" style="width: 365px" >
						   				<option value="">ทั่วประเทศ</option>
						   				<c:forEach var="ed" items="${sclist}">
						   					<option value="${ed.offcode }">${ed.offname }</option>
						   				</c:forEach> 
						   			</select> 
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
						 var date_from=document.getElementById("date_from").value;
						 var date_to=document.getElementById("date_to").value;
						 var sector_code=document.getElementById("sector_code").value;

						 var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
						 
						 var yearfrom;
						 var monthfrom;
						 var dayfrom;
						 var datefrom;
						 var yearto;
						 var monthto;
						 var dayto;
						 var dateto;
						 
							dayfrom=date_from.substring(0,2);
							monthfrom=date_from.substring(3,5);
							yearfrom=date_from.substring(6,10)-543;
						
							dayto=date_to.substring(0,2);
							monthto=date_to.substring(3,5);
							yearto=date_to.substring(6,10)-543;
						
							datefrom=yearfrom+'-'+monthfrom+'-'+dayfrom;
							dateto=yearto+'-'+monthto+'-'+dayto;
						
							if(date_from==""){
								alert('กรุณาเลือกวันที่ทำรายงาน');
								document.getElementById("date_from").focus();
							}else if(date_to==""){
								alert('กรุณาเลือกวันที่ทำรายงาน');
								document.getElementById("date_to").focus();
							}else{
								var param = 'process?action=Report&__report=ILLR8215&__formatt=pdf&vDateFrom='+datefrom+'&vDateTo='+dateto+
								'&vOffcode='+sector_code+'&getUserID='+user_id;
								//alert(param);
				    			window.open(param, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
	   							
	   						}
					}
				</script>
