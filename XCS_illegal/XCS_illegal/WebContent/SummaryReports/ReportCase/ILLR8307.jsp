<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>


<table width="100%" border="0" cellspacing="0" cellpadding="0">
	
	<tr>
	<td width="100%" align="left" valign="top">
	
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			
				<tr>
					<td width="1%">&nbsp;</td>
            		<td width="99%" ><span class="websitename">3.7 รายงานสรุปผลคดีการปราบปรามผู้กระทำผิดกฏหมาย</span></td>
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
								<td width="20%" align="right">วันที่ทำรายงาน :&nbsp;</td>
			            	 	<td width="80%" align="left" >
			            	 		<input name="compare_case_date" id="compare_case_date" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" value=""${cc.compare_case_date}" timeZone="th-TH" >
							 	  	<a href="javascript:NewCssCal('compare_case_date','ddmmyyyy')">
							 	  	<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
							 	  	<font style="color: red">*</font> &nbsp;&nbsp;
							 	  	ถึงวันที่ :&nbsp; 
							 	  	<input name="compare_case_date1" id="compare_case_date1" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" />
								  	<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')">
								  	<img src="images/btn_calendar.png" alt="" width="19" height="19"align="middle" style="border-style: none" /></a> 
								  	<font style="color: red">*</font> 
			            	 	</td>
			            	</tr> 
			            </table>
					</td>
				</tr>
				<tr><td colspan="2">&nbsp;</td></tr>
				<tr>
	             	<td >&nbsp;</td>
	           	 	<td ><span class="sectionname">ประเภทรายงาน</span></td>
	           	</tr>
				<tr>
		          	<td>&nbsp;</td>
		          	<td>
		          		<table width="700" border="0" cellspacing="0" cellpadding="0">
		           			<tr>
		           				<td align="right" width="20%" height="30px">ภาค :&nbsp;</td>
		           				<td align="left" width="80%">
		           					<select id="sector_code" name="sector_code" style="width: 325px" onchange="getArea('area_code',this.value),getBranch('branch_code',this.value)"></select>
		           				</td>
		           			</tr>
		           			<tr>
								<td align="right" height="25px">พื้นที่ :&nbsp;</td>
								<td>  
									<select id="area_code" name="area_code" style="width: 325px" onchange="getBranch('branch_code',this.value)"></select>
				                </td>
							</tr>
							<tr>
								<td align="right" height="25px"> พื้นที่/สาขา :&nbsp;</td>
								<td>
									<select id="branch_code" name="branch_code" style="width: 325px"/></select>
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
					 var compare_case_date=document.getElementById("compare_case_date").value;
					 var compare_case_date1=document.getElementById("compare_case_date1").value;
					 var sector_code=document.getElementById("sector_code").value;
					 var area_code=document.getElementById("area_code").value;
					 var branch_code=document.getElementById("branch_code").value;
					 var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
					 
					 var yearfrom;
					 var monthfrom;
					 var dayfrom;
					 var datefrom;
					 
					 var yearto;
					 var monthto;
					 var dayto;
					 var dateto;
					 
						dayfrom=compare_case_date.substring(0,2);
						monthfrom=compare_case_date.substring(3,5);
						yearfrom=compare_case_date.substring(6,10)-543;
					
						dayto=compare_case_date1.substring(0,2);
						monthto=compare_case_date1.substring(3,5);
						yearto=compare_case_date1.substring(6,10)-543;
					
						datefrom=yearfrom+'-'+monthfrom+'-'+dayfrom;
						dateto=yearto+'-'+monthto+'-'+dayto;

						if(compare_case_date==""||compare_case_date1==""){
							alert('กรุณาป้อนวันที่ทำรายงาน');
						}
						else{
							Reports.ReportUrl(function(data){
								if(data != ""){
									window.open(data + 'ReportName=ILLR8307&vReportType=PDF&getDatefrom='+datefrom+'&getDateto='+dateto+
											'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getUserID='+user_id + '&time=' + Math.random(),
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								}else{
									window.open('process?action=Report&__report=ILLR8307&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto+
											'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getUserID='+user_id, 
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								}
							});				    		
						}
					}

					getSector('sector_code');
					getArea('area_code','');
					getBranch('branch_code','');
				</script>
		</td>
	</tr>
</table>
	