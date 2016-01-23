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
            	<td width="99%" height="40"><span class="websitename">สรุปใบเสร็จรับเงิน</span></td>
            </tr> 
            	     	
            <tr>
            	<td width="99%" height="40"><span class="websitename">กรุณาระบุเงื่อนไข</span></td>
            </tr> 
              	
			<tr>
               	<td height="35" align="left" valign="middle">วันที่ทำรายงาน&nbsp; 
               		<input name="compare_case_date" id="compare_case_date" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" value=""${cc.compare_case_date}" timeZone="th-TH" >
					<a href="javascript:NewCssCal('compare_case_date','ddmmyyyy')">
					<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a> 
					<font style="color: red">*</font> 
						
					ถึงวันที่ &nbsp; 
					<input name="compare_case_date1" id="compare_case_date1" type="text" class="textdate" onkeypress="window.event.keyCode = 0;"/>
									
					<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')">
					<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a> 
					<font style="color: red">*</font> 
				</td>
			</tr>								
		</table>
		
		<table border="0" style="width: 578px">
			<tr>
				<td>ประเภทรายงาน</td>
			</tr>
		
			<tr>
				<td align="center">ภาค</td>
				<td>
                     <select id="sector_code" name="sector_code" style="width: 325px" onchange="getArea('area_code',this.value),getBranch('branch_code',this.value)"></select>  
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
		
		<table>
			<tr>
				<td>ประเภทรายงาน</td>
			</tr>
			
			<tr style="width: 565px">
				<td style="width: 155px" align="left"><input type="radio" name="group2" value="Milk" checked=""/>สรุปใบเสร็จรับเงิน</td>
				<td style="width: 189px" align="left"><input type="radio" name="group2" value="Milk"/>สรุปใบเสร็จเสีย</td>
			</tr>
		</table>

		<table border="0" style="width: 900px; height: 110px">
			<tr> 
				<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="window.open('Reports/ApplicationSincere.xps' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');"/>
            </tr>
		</table>
		   			
	</td>
	</tr>
	</table>
	