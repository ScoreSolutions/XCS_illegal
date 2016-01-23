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
	function Disab() {
		if(option3.checked){
			document.getElementById("sector_code").disabled=false;
		}
		else if(!option3.checked){
			document.getElementById("sector_code").disabled=true;
			document.getElementById("sector_code").value ="";
		}
	}
	</SCRIPT>

<table width="100%" height="100%" border="1" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 		<tr>
         			<td width="99%"><span class="headername">ตารางแสดงผลการปราบปรามผู้กระทำผิด แยกตามพื้นที่ (รายปี)</span>
         		</tr> 
         
        		<tr>
             		<td width="99%"></br><span class="headername2">กรุณาระบุเงื่อนไข</span>
        		</tr>
         
        		<tr>
         			<td height="35" align="left" valign="middle">เดือนที่ทำรายงาน &nbsp;&nbsp;
         				<select name="montfrom" id="monthfrom" class="select" style="width: 146px">
							<option value="">เลือก</option>
							<c:forEach var="mm" items="${mmlist}">
								<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>=""> ${mm.month_name_thai}</option>
							</c:forEach>
						</select>
						  
						<font style="color: red">*&nbsp;&nbsp;</font>ถึงเดือน &nbsp;&nbsp;
						<select name="monthto" id="monthto" class="select" style="width: 146px">
							<option value="">เลือก</option>
							<c:forEach var="mm" items="${mmlist}">
								<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>="">
								${mm.month_name_thai}</option>
							</c:forEach>
						</select>  
			
						<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')"></a> 
						<font style="color: red">*</font> 
					</td>  
				</tr>									
			</table>
		
			<table>
				<tr>	
       		 		<td>ปีงบประมาณ &nbsp;&nbsp;&nbsp;&nbsp;<input value="${compare_office}" type="text" name="compare_office" id="compare_office" size="8" onkeypress="CheckNum (0)" maxlength="4"></td>
       			</tr>
       		</table>
        
			<table border="0" style="width: 855px">
		 		<tr>
		   			<td height="60" align="lefft" valign="middle" style="width: 115px"><input type="checkbox" name="option3" value="Cheese" onClick="Disab ()">สรุปจังหวัดในภาค</td>
		   			<td valign="middle"><select disabled=disabled id="sector_code" name="sector_code" style="width: 325px" onchange="getArea('area_code',this.value)"></select> <font style="color:red">*</font></td>
		   		</tr>
		   	</table>
		   	
		   	<table border="0" style="width: 324px; height: 110px">
		        <tr> 
		        	<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();"/>
              		 <script type='text/javascript'>
              
					function report(){
						var monthto=document.getElementById("monthto").value;
 						var monthfrom=document.getElementById("monthfrom").value;
  						var year1=document.getElementById("compare_office").value;
    					var sector_code=document.getElementById("sector_code").value;
    					
    					var yearfrom;
						var monthfrom2;
     					var dayfrom;
      					var datefrom;	 
      					 
						var yearto;
						var monthto2;
						var dayto;
					    var dateto;
		    			var nam;
		    
				   		dayfrom= "01" ;
						yearfrom=(year1-543)-monthfrom.substring(0,1);	
						monthfrom2=monthfrom.substring(3,1);
					    datefrom=yearfrom+"-"+monthfrom2+"-"+dayfrom;
						 
						nam= (year1-543)%4;
						 
		  				if(monthto == 001||monthto == 003||monthto == 005||monthto == 007||monthto == 008||monthto == 110||monthto == 112 ){
						 	dayto="31";
							yearto=(year1-543)-monthto.substring(0,1);	
				   			monthto2=monthto.substring(3,1);
							dateto=yearto+"-"+monthto2+"-"+dayto; 
						 }
						else if(monthto == 004||monthto == 006||monthto == 009||monthto == 111){
      						dayto="30";
							yearto=(year1-543)-monthto.substring(0,1);	
				   			monthto2=monthto.substring(3,1);
							dateto=yearto+"-"+monthto2+"-"+dayto;  
						}
						else if(monthto == 002 ){
      						if( nam== 0 ){
      							dayto="29";
								yearto=(year1-543)-monthto.substring(0,1);	
				    			monthto2=monthto.substring(3,1);
								dateto=yearto+"-"+monthto2+"-"+dayto;
							}		
			     			else{
      							dayto="28";
								yearto=(year1-543)-monthto.substring(0,1);	
				    			monthto2=monthto.substring(3,1);
								dateto=yearto+"-"+monthto2+"-"+dayto;
							} 
						}
		  				
						if(year1==""||monthto==""||monthfrom==""){
							alert('กรุณป้อนปีงบประมาณและเดือนที่ทำรายการ');
						}
						else{
							year1=year1-543;
							
							if(sector_code==""){
		//	check result		alert ('process?action=Report&__report=ILLR8501&__formatt=pdf&getDatefrom='+datefrom+
  		//						'&getDateto='+dateto+'&getYear='+year1,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								window.open('process?action=Report&__report=ILLR8501&__formatt=pdf&getDatefrom='+datefrom+
  								'&getDateto='+dateto+'&getYear='+year1,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
							}
							else{
		//	check result		alert ('process?action=Report&__report=ILLR8501_1&__formatt=pdf&getDatefrom='+datefrom+
  		//						'&getDeteto='+dateto+'&getYear='+year1+'&getOffcode='+sector_code,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
				    			window.open('process?action=Report&__report=ILLR8501_1&__formatt=pdf&getDatefrom='+datefrom+
  								'&getDateto='+dateto+'&getYear='+year1+'&getOffcode='+sector_code,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
   							} 					
						}
					}
				</script>
				</tr>
		   	</table>
		</td>
	</tr>
</table>
