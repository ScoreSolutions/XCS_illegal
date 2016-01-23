<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%" >
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
              	<td width="99%">
              		<span class="websitename">1.9 ผลการปราบปรามผู้กระทำผิดกฎหมายสรรพสามิตในส่วนกลางและส่วนภูมิภาค (ข้อมูลโดยรวม)</span>
            	</td>
            </tr> 
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr>
            	<td>&nbsp;</td>
             	<td >
             		<span class="sectionname">กรุณาระบุเงื่อนไข</span>
             	</td>
            </tr> 
            <tr>
            	<td>&nbsp;</td>
   	            <td align="left" >
   	            	<table width="600" border="0" cellspacing="0" cellpadding="0" >
   	            		<tr>
   	            			<td width="20%" align="right">เดือนที่ทำรายงาน :</td>
   	            			<td width="80%" align="left">
   	            				<select name="montfrom" id="monthfrom" class="select" style="width: 146px">
									<option value="">เลือก</option>
									<c:forEach var="mm" items="${mmlist}">
										<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>="">
										${mm.month_name_thai}</option>
									</c:forEach>
								</select>
							 	<font style="color: red">*</font> 
							 	ถึงเดือนที่ :&nbsp;
							 	<select name="monthto" id="monthto" class="select" style="width: 146px">
									<option value="">เลือก</option>
									<c:forEach var="mm" items="${mmlist}">
										<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>="">
										${mm.month_name_thai}</option>
									</c:forEach>
								</select> 
								<font style="color: red">*</font>
   	            			</td>
   	            		</tr>
   	            		<tr>
				 			<td align="right">ปีงบประมาณ :&nbsp;</td>	
				 			<td align="left" >
				 				<input  type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
				 				<font style="color: red">*</font>
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
	
		var monthto=document.getElementById("monthto").value;
		var monthfrom=document.getElementById("monthfrom").value;
		var year1=document.getElementById("year1").value;
		var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
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

		if(monthfrom != "" && monthto != "" && year1 != ""){
			if(monthto == 001||monthto == 003||monthto == 005||monthto == 007||monthto == 008||monthto == 110||monthto == 112 ){
				dayto='31';
				yearto=(year1-543)-monthto.substring(0,1);	
				monthto2=monthto.substring(3,1);
				dateto=yearto+'-'+monthto2+'-'+dayto; 
			}else if(monthto == 004||monthto == 006||monthto == 009||monthto == 111){
		   		dayto='30';
				yearto=(year1-543)-monthto.substring(0,1);	
				monthto2=monthto.substring(3,1);
				dateto=yearto+'-'+monthto2+'-'+dayto;  
			}else if(monthto == 002 ){
		      	if( nam== 0 ){
			    	dayto='29';
					yearto=(year1-543)-monthto.substring(0,1);	
					monthto2=monthto.substring(3,1);
					dateto=yearto+'-'+monthto2+'-'+dayto;
				}else{
		      		dayto='28';
					yearto=(year1-543)-monthto.substring(0,1);	
					monthto2=monthto.substring(3,1);
					dateto=yearto+'-'+monthto2+'-'+dayto;
				}
			}

			//year1=year1-543;

			var Param = '&getDatefrom='+datefrom+'&getDateto='+dateto+'&getYear='+year1+'&getUserID='+user_id + '&time=' + <%= new java.util.Date().getTime() %>;
		  	Reports.ReportUrl(function(data){
				if(data != ""){
					window.open(data + 'ReportName=ILLR8109&vReportType=PDF' + Param, '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
				}else{
					window.open('process?action=Report&__report=ILLR8109&__formatt=pdf' + Param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
				}
			});
      	
		}else{
			alert('โปรดใส่ข้อมูลให้ถูกต้อง');
		}
	}
</script>			
		</td>
	</tr>
</table>



		