<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='/XCS_illegal/dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='/XCS_illegal/dwr/engine.js'></script>
<script type='text/javascript' src='/XCS_illegal/dwr/util.js'></script>
<script type='text/javascript'>
init();
function init(){
	getSector();
}
</script>


<!-- Body -->

	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	
	<tr>
	<td width="100%" align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		
				<tr>
            		<td width="99%" height="40"><span class="้header">ผลสถิติ (ผลการปราบปรามหรือผู้กระทำผิด) ส่วนคดีสำนักกฎหมาย</span></td>
            	</tr> 
            	     	
              	<tr>
            		<td width="99%" height="40"><span class="header2">กรุณาระบุเงื่อนไข</span></td>
            	</tr> 
              	
				<tr>
                	<td height="35" align="left" valign="middle">วันที่ทำรายงาน :
						&nbsp; <input name="compare_case_date"
						id="compare_case_date" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" value=""${cc.compare_case_date}" timeZone="th-TH" >
				 	  	<a href="javascript:NewCssCal('compare_case_date','ddmmyyyy')">
				 	  	<img src="images/btn_calendar.png" alt="" width="19" height="19" 
				 	  	align="middle" style="border-style: none" /></a> <font 
				 	  	style="color: red">*</font> 
						ถึงวันที่ :&nbsp; 
					  	<input name="compare_case_date1" id="compare_case_date1" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" />
									
					  	<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')">
					  	<img src="images/btn_calendar.png" alt="" width="19" height="19"
						align="middle" style="border-style: none" /></a> <font
						style="color: red">*</font> 
					</td>
				</tr>								
		</table>
		
		
		   			
		<table border="0" style="width: 578px">
			<tr>
				<td><span class="header2">ประเภทรายงาน</span></td>
			</tr>
		
			<tr>
				<td align="center">ภาค</td>
				<td>
                	<select id="sector_code" name="sector_code" style="width: 325px" onchange="getArea('area_code',this.value),getBranch('branch_code',this.value)">    
					</select>       
        		</td>
			</tr>
		
			<tr>
				<td align="center">พื้นที่</td>
				<td>
                	<select id="area_code" name="area_code" style="width: 325px" onchange="getBranch('branch_code',this.value)">
					<option selected="">เลือก</option>
					</select>  	  	
        		</td>
			</tr>
		
			<tr>
				<td align="center"> พื้นที่สาขา</td>
				<td>
                	<select id="branch_code" name="branch_code" style="width: 325px">
					<option selected="">เลือก</option>
					</select>	
        		</td>
			</tr>
		</table>
		
		<table border="0" style="width: 900px; height: 110px">
			<tr>
				<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();"/>
            	<script type='text/javascript'>
              
					function report(){
					 var compare_case_date=document.getElementById("compare_case_date").value;
					 var compare_case_date1=document.getElementById("compare_case_date1").value;
					 var sector_code=document.getElementById("sector_code").value;
					 var area_code=document.getElementById("area_code").value;
					 var branch_code=document.getElementById("branch_code").value;
					 
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
						if(sector_code==""){
							alert ('process?action=Report&__report=ILLR8303_1&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
							window.open('process?action=Report&__report=ILLR8303_1&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
						}
						else{
							alert ('process?action=Report&__report=ILLR8303&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto+
							'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
				    		window.open('process?action=Report&__report=ILLR8303&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto+
							'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
   						}
   					}
				}
				</script>
            </tr>
		</table>	   			
	</td>
	</tr>
	</table>
	