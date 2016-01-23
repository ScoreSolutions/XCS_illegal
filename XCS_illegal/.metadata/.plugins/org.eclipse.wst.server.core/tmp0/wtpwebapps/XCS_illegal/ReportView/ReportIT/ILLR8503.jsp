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

	<SCRIPT LANGUAGE="JavaScript">
	function Disab (val) {
		if(val=="1"){
			document.getElementById("sector_code").disabled=false;
			document.getElementById("area_code").value ="";
			document.getElementById("area_code").disabled=true;
			}
		if(val=="2"){
			document.getElementById("sector_code").disabled=false;
			document.getElementById("area_code").disabled=false;
			}
		if(val=="3"){
			document.getElementById("sector_code").disabled=true;
			document.getElementById("area_code").disabled=true;
			document.getElementById("sector_code").value ="";
			document.getElementById("area_code").value ="";
			}
		}
	</SCRIPT>

<table width="100%" height="100%" border="1" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
         	 	<td width="99%"><span class="websitename">ตารางเปรียบเทียบผลการปราบปรามการกระทำผิดกฎหมายสรรพสามิต (รายปี)</span></td>
         	</tr>   												
		</table>
		
		<table>
			<tr>	
       		 	<td>ปีงบประมาณนี้&nbsp;&nbsp;&nbsp;&nbsp;<input value="${compare_office}" type="text" name="compare_office" id="compare_office" size="8" onkeypress="CheckNum (0)" maxlength="4"></td>
       			<td>ปีงบประมาณก่อน &nbsp;&nbsp;&nbsp;&nbsp;<input value="${compare_office}" type="text" name="compare_office" id="compare_office" size="8" onkeypress="CheckNum (0)" maxlength="4"></td>
       			<td>ปีงบประมาณก่อนหน้า &nbsp;&nbsp;&nbsp;&nbsp;<input value="${compare_office}" type="text" name="compare_office" id="compare_office" size="8" onkeypress="CheckNum (0)" maxlength="4"></td>
       		</tr>
        </table>
        
        <table>
        	<tr>
        		<td>ประเภทรายงาน</td>
        	</tr>
        	
        	<tr>
        		<td><input type="radio" name="group" value="Milk1" onClick="Disab (1)"/>&nbsp;&nbsp;&nbsp;&nbsp;สรรพสามิตภาค</td>
        		<td><select disabled=disabled id="sector_code" name="sector_code" style="width: 325px" onchange="getArea('area_code',this.value) "></select></td>
        	</tr>
        	
        	<tr>
        		<td><input type="radio" name="group" value="Milk2" onClick="Disab (2)"/>&nbsp;&nbsp;&nbsp;&nbsp;สรรพสามิตพื้นที่</td>
        		<td><select disabled=disabled id="area_code" name="area_code" style="width: 325px" onchange="getBranch('branch_code',this.value)"></select></td>
        	</tr>
        	
        	<tr>
        		<td><input type="radio" name="group" value="Milk3" onClick="Disab (3)"/>&nbsp;&nbsp;&nbsp;&nbsp;ทั้งประเทศ</td>
        	</tr>
        </table>
		   	
		<table border="0" style="width: 324px; height: 110px">
			<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="window.open('Reports/ApplicationSincere.xps' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');"/>
        </table>
		</td>
	</tr>
</table>
