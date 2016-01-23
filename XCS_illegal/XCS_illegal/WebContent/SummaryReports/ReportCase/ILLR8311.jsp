<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>

<SCRIPT LANGUAGE="JavaScript">	
	
	function checkRepType(){
		
		var radioLength=document.getElementsByName("reptype").length;
		
		for (var i = 0; i < radioLength; i++) { 	
			if (document.getElementsByName("reptype")[i].checked) { 				
	    		document.getElementsByName("reptype").value = document.getElementsByName("reptype")[i].value;
	      	}
	  	}
		report();
	}
		
</SCRIPT>
<!-- Body -->

	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	
	<tr>
	<td width="100%" align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="1%" >&nbsp;</td>
            	<td width="99%" height="40"><span class="websitename">3.11 สรุปผลรายงานผลคดี (เงินส่งคลัง)</span></td>
            </tr> 
            <tr><td colspan="2">&nbsp;</td></tr>
           	<tr>
           		<td >&nbsp;</td>
         		<td ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
         	</tr>
         	<tr>
         		<td>&nbsp;</td>
         		<td>
         			<table width="700" border="0" cellpadding="0" cellspacing="0">
         				<tr>
         					<td width="30%" align="right">เปรียบเทียบระหว่างปีงบประมาณ :&nbsp;</td>
         					<td width="70%">
         						<input type="text" name="compare_office" id="compare_office_from" size="8" onkeypress="CheckNum (0)" maxlength="4">&nbsp;&nbsp;
         						<font style="color: red">*</font>&nbsp;&nbsp;
         						กับปี :&nbsp;
         						<input value="${compare_office}" type="text" name="compare_office" id="compare_office_to" size="8" onkeypress="CheckNum (0)" maxlength="4">&nbsp;&nbsp;
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
	             	</table>
	          	</td>
	         </tr>
	         <tr>
	         	<td>&nbsp;</td>
	         	<td>
	         		<table width="700" border="0" cellpadding="0" cellspacing="0" >
	         			 <tr >
	         			 	<td width="20%" >&nbsp;</td>
							<td width="30%" align="left"><input type="radio" name="reptype" value="2" checked/>&nbsp;สรุปผลรายงานผลเงินส่งคลัง</td>
							<td width="50%" align="left"><input type="radio" name="reptype" value="1"/>&nbsp;สรุปผลรายงานผลคดี</td>
						 </tr>
						 <tr>
							<td height="40px">&nbsp;</td>
							<td><input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="checkRepType();" /></td>
							<td >&nbsp;</td>
						</tr>
	         		</table>
	         		
	         	</td>
	         </tr>
        </table>  
            	<script type='text/javascript'>
            	
					function report(){
						 var year1=document.getElementById("compare_office_from").value;
						 var year2=document.getElementById("compare_office_to").value;
						 var sector_code=document.getElementById("sector_code").value;
						 var area_code=document.getElementById("area_code").value;
						 var branch_code=document.getElementById("branch_code").value;
						 var reptype=document.getElementsByName("reptype").value;
						 var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
						 var rttype;			  						
						
						if(year1==""||year2==""){
							alert('กรุณาป้อนเปรียบเทียบระหว่างปีงบประมาณ    ');
						}else if(branch_code!="" || area_code!="" || sector_code!=""){
							if(branch_code!=""){
								rttype=0;
							}else if(area_code!=""){
								rttype=1;
							}else if(sector_code!=""){
								rttype=2;
							}
				//			alert ('process?action=Report&__report=ILLR8311&__formatt=pdf&getYear1='+year1+'&getYear2='+year2+
				//			'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getrttype='+rttype+'&getreptype='+reptype+'&getUserID='+user_id, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
				
							Reports.ReportUrl(function(data){
								if(data != ""){
									window.open(data + 'ReportName=ILLR8311&vReportType=PDF&getYear1='+year1+'&getYear2='+year2+
											'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getrttype='+rttype+'&getreptype='+reptype+'&getUserID='+user_id + '&time=' + Math.random(),
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								}else{
									window.open ('process?action=Report&__report=ILLR8311&__formatt=pdf&getYear1='+year1+'&getYear2='+year2+
											'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getrttype='+rttype+'&getreptype='+reptype+'&getUserID='+user_id, 
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=yes,scrollbars=no,width=900,height=700');
								}
							});
							
						}else{
							rttype="";
   				//			alert ('process?action=Report&__report=ILLR8311_1&__formatt=pdf&getYear1='+year1+'&getYear2='+year2+
				//			'&getrttype='+rttype+'&getreptype='+reptype+'&getUserID='+user_id, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
   							Reports.ReportUrl(function(data){
								if(data != ""){
									window.open(data + 'ReportName=ILLR8311_1&vReportType=PDF&getYear1='+year1+'&getYear2='+year2+
											'&getrttype='+rttype+'&getreptype='+reptype+'&getUserID='+user_id + '&time=' + Math.random(),
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								}else{
									window.open ('process?action=Report&__report=ILLR8311_1&__formatt=pdf&getYear1='+year1+'&getYear2='+year2+
											'&getrttype='+rttype+'&getreptype='+reptype+'&getUserID='+user_id + '&time=' + Math.random(), 
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=yes,scrollbars=no,width=900,height=700');
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
	