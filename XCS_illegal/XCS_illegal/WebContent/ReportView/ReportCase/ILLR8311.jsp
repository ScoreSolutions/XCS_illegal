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
            	<td width="99%" height="40"><span class="websitename">สรุปผลรายงานผลคดี (เงินส่งคลัง)</span></td>
            </tr> 
            	     	
            <tr>
            	<td width="99%" height="40"><span class="websitename">กรุณาระบุเงื่อนไข</span></td>
            </tr> 
        </table> 
        
        <table>  	
			<tr>	
       		 	<td>เปรียบเทียบระหว่างปีงบประมาณ&nbsp;&nbsp;&nbsp;&nbsp;<input value="${compare_office}" type="text" name="compare_office" id="compare_office" size="8" onkeypress="CheckNum (0)" maxlength="4">&nbsp;&nbsp;<font style="color: red">*</font></td>
       			<td>กับปี &nbsp;&nbsp;&nbsp;&nbsp;<input value="${compare_office}" type="text" name="compare_office" id="compare_office" size="8" onkeypress="CheckNum (0)" maxlength="4">&nbsp;&nbsp;<font style="color: red">*</font></td>
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
				<td style="width: 189px" align="left"><input type="radio" name="group2" value="Milk" checked/>&nbsp;&nbsp;&nbsp;&nbsp;สรุปผลรายงานผลเงินส่งคลัง</td>
				<td style="width: 189px" align="left"><input type="radio" name="group2" value="Milk"/>&nbsp;&nbsp;&nbsp;&nbsp;สรุปผลรายงานผลคดี</td>
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
	