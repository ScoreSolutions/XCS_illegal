<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='/XCS_illegal/dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='/XCS_illegal/dwr/engine.js'></script>
<script type='text/javascript' src='/XCS_illegal/dwr/util.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>

<table width="100%" height="100%" border="1" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="1%">&nbsp;</td>
              		<td width="99%"><span class="websitename">5.9 รายงานตรวจเช็คข้อมูลคดี</span></td>
                </tr> 
                
            	<tr>
            		<td >&nbsp;</td>
            		<td ><span class="sectionname">กรุณาระบุเงื่อนไข</span>
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
            	<tr>
					<td >&nbsp;</td>
                	<td >
                		<table width="700" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="20%" align="right" height="40px">ประเภทรายงาน :&nbsp;</td>
			            	 	<td width="80%" align="left" >
			            	 		<input type="radio" name="group1" id="tcase_date"  checked />&nbsp;วันที่รับเรื่อง&nbsp;&nbsp;&nbsp;
			            	 		<input type="radio" name="group1" id="toccurrence_date"  />&nbsp;วันที่เกิดเหตุ&nbsp;&nbsp;&nbsp;
			            	 		<input type="radio" name="group1" id="tcreate_on" />&nbsp;วันที่บันทึก
			            	 	</td>
							</tr>
							<tr>
								<td align="right">หน่วยงาน :&nbsp;</td>
			            	 	<td align="left" >
			            	 		<input type="Text" id="offcode" name="offcode" class="textbox" size="5" />
			            	 		<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand" onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');">
									<input type="Text" id="offname" name="offname" class="textview" readonly size="22" /> 
									<font style="color: red">*</font>
			            	 	</td>
			            	</tr>
			            	<tr>
								<td align="right" height="30px">ชื่อผู้ทำรายการ :&nbsp;</td>
			            	 	<td align="left" >
			            	 		<input type="Text" id="staff_name" name="staff_name"  class="textview" size="30"  readonly /> 
			            	 		<input type="hidden" id="staff_idcardno" name="staff_idcardno"  /> 
			        				<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick="window.open('process?action=Divide_staff_pop&formname=staff_name&id=staff_idcardno&posname=posname' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
									<font style="color:red">*</font> 
			            	 	</td>
			            	</tr>
			            	<tr>
			            		<td align="right" height="30px">ตำแหน่ง :&nbsp;</td>
			            	 	<td align="left" ><input type="Text" id="posname" name="posname" class="textview" size="30" readonly /></td>
			            	</tr>
			            	<tr>
			            		<td align="right" height="30px">เรียงข้อมูล :&nbsp;</td>
			            	 	<td align="left" >
			            	 		<input type="radio" name="group2" id="otrack_no" checked/>&nbsp;เลขที่งาน
			            	 		<input type="radio" name="group2" id="ooccurrence_date" />&nbsp;วันที่เกิดเหตุ
			            	 		<input type="radio" name="group2" id="ocase_id" />&nbsp;เลขที่บันทึกรับคำกล่าวโทษ
			            	 	</td>
			            	</tr>
			            	
			            	<tr>
								<td>&nbsp;</td>
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
		 var compare_case_date=document.getElementById("compare_case_date").value; 
		 var compare_case_date1=document.getElementById("compare_case_date1").value;

		 if(compare_case_date == "" || compare_case_date1 == ""){
			 alert("กรุณาเลือกวันที่ทำรายงาน");
			 return;
		 }
		 
		 var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
 
		 var yearfrom=compare_case_date.substring(6,10)-543;
		 var monthfrom=compare_case_date.substring(3,5);
		 var dayfrom=compare_case_date.substring(0,2);
		 
		 var yearto=compare_case_date1.substring(6,10)-543;
		 var monthto=compare_case_date1.substring(3,5);
		 var dayto=compare_case_date1.substring(0,2);

		 var datefrom=yearfrom+'-'+monthfrom+'-'+dayfrom;
		 var dateto=yearto+'-'+monthto+'-'+dayto;

		 var offcode = document.getElementById("offcode").value;
		 var staffId = document.getElementById("staff_idcardno").value;

		 var vDateType;
		 var vOrderBy;

		if(document.getElementById("tcase_date").checked)
			vDateType="1";
		else if(document.getElementById("toccurrence_date").checked)
			vDateType="2";
		else
			vDateType="3";

		if(document.getElementById("otrack_no").checked)
			vOrderBy = "1";
		else if (document.getElementById("ooccurrence_date").checked)
			vOrderBy = "2";
		else
			vOrderBy = "3";


		Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + 'ReportName=ILLR8509&vReportType=PDF&getDatefrom='+datefrom+
		 		 	'&getDateto='+dateto+'&getDateType='+vDateType+'&getOrderBy='+vOrderBy+'&getUserID='+user_id+'&vKeyBy='+staffId + '&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}else{
				window.open('process?action=Report&__report=ILLR8509&__formatt=pdf&getDatefrom='+datefrom+
			 		 	'&getDateto='+dateto+'&getDateType='+vDateType+'&getOrderBy='+vOrderBy+'&getUserID='+user_id+'&vKeyBy='+staffId + '&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700'); 
			}
		});
	 	
	}
</script>
