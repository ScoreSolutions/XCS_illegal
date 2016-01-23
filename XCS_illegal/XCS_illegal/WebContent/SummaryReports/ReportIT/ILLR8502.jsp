<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>

	<SCRIPT LANGUAGE="JavaScript">
	function Disab (val) {
		if(val=="1"){
			document.getElementById("sector_code").disabled=false;
			document.getElementById("area_code").value ="";
			document.getElementById("area_code").disabled=true;
			}
		if(val=="2"){
			document.getElementById("sector_code").disabled=true;
			document.getElementById("sector_code").value ="";
			document.getElementById("area_code").disabled=false;
		}
		if(val=="3"){
			document.getElementById("sector_code").disabled=true;
			document.getElementById("area_code").disabled=true;
			document.getElementById("sector_code").value ="";
			document.getElementById("area_code").value ="";
		}
	}
	
	function checkrtType(){
		
		var radioLength=document.getElementsByName("rttype").length;
		
		for (var i = 0; i < radioLength; i++) { 	
			if (document.getElementsByName("rttype")[i].checked) { 				
	    		document.getElementsByName("rttype").value = document.getElementsByName("rttype")[i].value;
	      	}
	  	}
		report();
	}
		
	</SCRIPT>
	
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
            	<td width="99%"><span class="websitename">5.2 ตารางแสดงผลการปราบปรามผู้กระทำผิด แยกรายเดือน</span></td>
            </tr>
            <tr><td colspan="2">&nbsp;</td></tr>								
			<tr>
				<td>&nbsp;</td>	
       		 	<td>
       		 		<table width="700"  border="0" cellspacing="0" cellpadding="0">
       		 			<tr>
       		 				<td width="20%" align="right">ปีงบประมาณ :&nbsp;</td>
       		 				<td width="80%" align="left">
       		 					<input type="text" name="year1" id="year1" size="8" onkeypress="CheckNum (0)" maxlength="4">
       		 					<font style="color: red">*</font> 
       		 				</td>
       		 			</tr>
       		 		</table>
       		 	</td>
       		</tr>
       		<tr><td colspan="2">&nbsp;</td></tr>
       		<tr>
       			<td  >&nbsp;</td>
            	<td ><span class="sectionname">ประเภทรายงาน</span></td>
       		</tr>
       		<tr>
				<td>&nbsp;</td>	
       		 	<td>
       		 		<table width="700"  border="0" cellspacing="0" cellpadding="0">
       		 			<tr>
       		 				<td width="20%" height="30px">&nbsp;</td>
			        		<td width="20%">
			        			<input type="radio" name="rttype" value="2" onClick="Disab (1)" checked/>&nbsp;สรรพสามิตภาค
			        		</td>
			        		<td width="60%">
				        		<select id="sector_code" name="sector_code" style="width: 325px" >
				        			<option value="">เลือก</option>
				        			<c:forEach var="sc" items="${sclist}">
				        				<option value="${sc.offcode }">${sc.offname }</option>
				        			</c:forEach>
				        		</select>
			        		</td>
			        	</tr>
			        	<tr>
			        		<td height="30px" >&nbsp;</td>
			        		<td>
			        			<input type="radio" name="rttype" value="1" onClick="Disab (2)"/>&nbsp;สรรพสามิตพื้นที่
			        		</td>
			        		<td>
				        		<select disabled=disabled id="area_code" name="area_code" style="width: 325px" >
				        			<option value="">เลือก</option>
				        			<c:forEach var="ar" items="${arList}">
				        				<option value="${ar.offcode }">${ar.offname }</option>
				        			</c:forEach>
				        		</select>
			        		</td>
			        	</tr>
			        	<tr>
			        		<td height="30px">&nbsp;</td>
			        		<td><input type="radio" name="rttype" value="3" onClick="Disab (3)"/>&nbsp;ทั่วประเทศ</td>
			        		<td >&nbsp;</td>
			        	</tr>
			        	<tr>
			        		<td height="30px">&nbsp;</td>
			        		<td><input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="checkrtType();"/></td>
			        		<td >&nbsp;</td>
			        	</tr>
       		 		</table>
       		 	</td>
       		</tr>
       		
        </table>
				
        		<script type='text/javascript'>
            	
					function report(){
					 var year=document.getElementById("year1").value;
					 				
					 var sector_code=document.getElementById("sector_code").value;
					 var area_code=document.getElementById("area_code").value;
					 var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
					 
					 var rttype=document.getElementsByName("rttype").value;
					 			  							
						if(year=="")
							alert('กรุณาป้อนปีงบประมาณ');
						else{
							if(rttype=="2" && sector_code=="")
								alert('กรุณาเลือกสรรพสามิตภาค');
							else if(rttype=="1" && area_code=="")
								alert('กรุณาเลือกสรรพสามิตพื้นที่');
							else{
								if(rttype == "3"){
									var param ='&getYear='+year+'&getUserID='+user_id + '&time=' + Math.random();
									
									Reports.ReportUrl(function(data){
										if(data != ""){
											window.open(data + 'ReportName=ILLR8502_1&vReportType=PDF' + param, '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
										}else{
											window.open ('process?action=Report&__report=ILLR8502_1&__formatt=pdf' + param, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
										}
									});
								}else{
									var param = '&getYear='+year+'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getrttype='+rttype+'&getUserID='+user_id + '&time=' + Math.random();
									Reports.ReportUrl(function(data){
										if(data != ""){
											window.open(data + 'ReportName=ILLR8502&vReportType=PDF' + param, '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
										}else{
											window.open ('process?action=Report&__report=ILLR8502&__formatt=pdf' + param, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
										}
									});
								}
							}
						}
					}
					
				</script>

		</td>
	</tr>
</table>
