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

<table width="100%" height="100%" border="1" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
              		<td width="99%"><span class="websitename">รายงานตรวจเช็คข้อมูลคดี</span>
                </tr> 
                
            	<tr>
            		<td width="99%"></br><span class="websitename">กรุณาระบุเงื่อนไข</span>
             	</tr>
              
              	<tr>
                	<td height="35" align="left" valign="middle">วันที่ทำรายงาน :
						&nbsp; <input name="compare_case_date"
						id="compare_case_date" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" value=""${cc.compare_case_date}" timeZone="th-TH" >
				 		<a href="javascript:NewCssCal('compare_case_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a> 
				 		
				 		<font style="color: red">*</font> ถึงวันที่ :&nbsp; 
						
						<input name="compare_case_date1" id="compare_case_date1" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" />
									
						<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a> 
						<font style="color: red">*</font> 
					</td>
				</tr>									
			</table>
		
			<table>
				<tr>
					<td>ประเภทรายงาน</td>
				</tr>
		
				<tr style="width: 565px">
					<td style="width: 155px" align="left"><input type="radio" name="group1" value="Milk" checked/>&nbsp;&nbsp;&nbsp;&nbsp;วันที่รับเรื่อง</td>
					<td style="width: 189px" align="left"><input type="radio" name="group1" value="Milk"/>&nbsp;&nbsp;&nbsp;&nbsp;วันที่เกิดเหตุ</td>
					<td style="width: 169px" align="left"><input type="radio" name="group1" value="Milk"/>&nbsp;&nbsp;&nbsp;&nbsp;วันที่บันทึก</td>
				</tr>
			</table>
        
      	 	<table>
        		<tr>
        			<td>หน่วยงาน</td>
        			<td><input type="Text" id="offcode"name="offcode" value="${ana.offcode}" class="textbox" size="5" style="width: 76px"/>
						<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand" onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');">
						<input type="Text" id="offname" name="offname"value="${ana.offname}" class="textbox" size="18" style="width: 263px"/> <font style="color: red">*</font>
					</td>
        		</tr>
        	
        		<tr>
        			<td>ชื่อผู้ทำรายการ</td>
        			<td>
        				<input type="Text" id="staff_name_detect" name="staff_name_detect" value="${st_detect.title_name}${st_detect.first_name} ${st_detect.last_name}" class="textview" size="30" /> <input type="hidden" id="staff_idcardno_detect" name="staff_idcardno_detect" value="${asf.staff_idcardno_detect}" /> 
        				<input type="hidden" name="offcode_detect" value="${asf.offcode_detect }"> 
        				<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_detect&id=staff_idcardno_detect&posname=posname_detect&poscode=poscode_detect&offcode=offcode_detect' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
						<input type="Text" id="posname_detect" name="posname_detect" class="textview" size="30" value="${st_detect.posname}" />
						<font style="color:red">*</font> 
						<input type="hidden" id="poscode_detect" name="poscode_detect" value="${asf.poscode_detect  }" />
					</td>
        		</tr>
       		 </table>
		
			<table>
				<tr>
					<td>เรียงข้อมูล</td>
				</tr>
		
				<tr style="width: 565px">
					<td style="width: 155px" align="left"><input type="radio" name="group2" value="Milk" checked/>&nbsp;&nbsp;&nbsp;&nbsp;เลขที่งาน</td>
					<td style="width: 189px" align="left"><input type="radio" name="group2" value="Milk"/>&nbsp;&nbsp;&nbsp;&nbsp;วันที่เกิดเหตุ</td>
					<td style="width: 189px" align="left"><input type="radio" name="group2" value="Milk"/>&nbsp;&nbsp;&nbsp;เลขที่บันทึกรับคำกล่าวโทษ</td>
				</tr>
			</table>
		 
			<table border="0" style="width: 324px; height: 110px">
				<tr><input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report(compare_case_date,compare_case_date1,year1,year2,year3,year1);"/>
              		<script type='text/javascript'>
						function report(A,B,C,D,E,F){
   						alert ('process?action=Report&__report=ILLR8113&__formatt=pdf&getMountFrom='+compare_case_date+'&getMountTo='+compare_case_date1+
						'&getYear1='+year1+'&getYear2='+year2+'&getYear3='+year3+'&getOfficecode='+year1 , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
						/* window.open('process?action=Report&__report=ILLR8113&__formatt=pdf&getMountFrom='+compare_case_date'&getMountTo='+compare_case_date1
						'&getYear1='year1'&getYear2='year2'&getYear3='year3'&getOfficecode='year1 , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700'); */
						}
					</script>
				</tr>
		 	</table> 		
		 	
		</td>
	</tr>
</table>
