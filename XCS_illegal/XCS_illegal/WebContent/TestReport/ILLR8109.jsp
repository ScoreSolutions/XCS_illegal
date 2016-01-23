<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>

<table width="100%" height="100%" border="1" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">   
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 		<tr>
              	 	<td width="99%"><span class="websitename">ผลการปราบปรามผู้กระทำผิดกฎหมายสรรพสามิตในส่วนกลางและส่วนภูมิภาค (ข้อมูลโดยรวม)</span>
                </tr> 
              	<tr>
             		<td width="99%"></br><span class="websitename">กรุณาระบุเงื่อนไข</span>
              	</tr> 
              	<tr>
                	<td height="35" align="left" valign="middle">เดือนที่ทำรายงาน :
                		<select name="montfrom" id="monthfrom" class="select" style="width: 146px">
							<option value="">เลือก</option>
								<c:forEach var="mm" items="${mmlist}">
									<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>="">
										${mm.month_name_thai}</option>
								</c:forEach>
						</select>
						  
				 	  	<font style="color: red">*</font> ถึงเดือนที่ :
				 	  	 <select name="monthto" id="monthto" class="select" style="width: 146px">
							<option value="">เลือก</option>
								<c:forEach var="mm" items="${mmlist}">
									<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>="">
										${mm.month_name_thai}</option>
								</c:forEach>
							</select>  
					  	
						<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')">
					  	</a> <font style="color: red">*</font> 
					</td> 
				</tr>									
			</table>
			<table border="0" style="width: 855px">
				<tr>
					<td style="width: 144px">ปีงบประมาณ</td>	<td><input value="${year1}" type="text" name="year1" onkeypress="keyintdot()"maxlength="4" id="year1" size="8"><font style="color: red">*</font>
					</td>
				</tr>
			</table>
		   	<table border="0" style="width: 324px; height: 110px">
		        <tr>
              	 	<td width="99%"><span class="websitename">ประเภทข้อมูล</span>
                </tr> 
		     	<tr>
		   			<td><input type="radio" name="group1" value="Milk"> ข้อมูลโดยรวม<br>
						<input type="radio" name="group1" value="Butter" checked>เฉพาะหน่วยงานปราบปราม<br></br>
					</td>
					 </tr> 
		   	</table>
		   <table border="0" style="width: 324px; height: 110px">
		         <tr> <input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();"/>
              	 	 <script type='text/javascript'>
function report(){
 var monthto=document.getElementById("monthto").value;
  var monthfrom=document.getElementById("monthfrom").value;
   var year1=document.getElementById("year1").value;
    var yearfrom;
	 var monthfrom2;
      var dayfrom;
       var datefrom;	 
		var yearto;
		 var monthto2;
		  var dayto;
		   var dateto;
		    var nam;
				   dayfrom= '01' ;
					yearfrom=(year1-543)-monthfrom.substring(0,1);	
					monthfrom2=monthfrom.substring(3,1);
					datefrom=yearfrom+'-'+monthfrom2+'-'+dayfrom;
					nam= (year1-543)%4;
		   if(monthto == 001||monthto == 003||monthto == 005||monthto == 007||monthto == 008||monthto == 110||monthto == 112 ){
					dayto='31';
					yearto=(year1-543)-monthto.substring(0,1);	
				    monthto2=monthto.substring(3,1);
					dateto=yearto+'-'+monthto2+'-'+dayto; }
			else if(monthto == 004||monthto == 006||monthto == 009||monthto == 111){
      				dayto='30';
					yearto=(year1-543)-monthto.substring(0,1);	
				    monthto2=monthto.substring(3,1);
					dateto=yearto+'-'+monthto2+'-'+dayto;  }
			else if(monthto == 002 ){
      			 if( nam== 0 ){
      				dayto='29';
					yearto=(year1-543)-monthto.substring(0,1);	
				    monthto2=monthto.substring(3,1);
					dateto=yearto+'-'+monthto2+'-'+dayto;
					}	              	
			     else{
      				dayto='28';
					yearto=(year1-543)-monthto.substring(0,1);	
				    monthto2=monthto.substring(3,1);
					dateto=yearto+'-'+monthto2+'-'+dayto;
					}    
					}
		  else{
				 alert('โปรดใส่ข้อมูลให้ถูกต้อง');
				
				}
   alert ('process?action=Report&__report=ILLR8109&__formatt=pdf&getMonthfrom='+datefrom+
  '&getMonthto='+dateto+'&getYear1='+year1,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
window.open('process?action=Report&__report=ILLR8109&__formatt=pdf&getMonthfrom='+datefrom+
'&getMonthto='+dateto+'&getYear1='+year1,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');

}
				</script>			
					</tr>
		   </table>
		   			
		</td>
		</tr>
		</table>
		