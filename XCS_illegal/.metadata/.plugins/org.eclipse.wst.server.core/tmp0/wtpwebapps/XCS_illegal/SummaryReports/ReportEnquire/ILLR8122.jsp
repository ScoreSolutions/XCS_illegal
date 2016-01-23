<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
             	<td width="99%"><span class="websitename">1.22 รายละเอียดสุราและยาสูบในประเทศและต่างประเทศ ประจำเดือน</span></td>
            </tr>
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
            </tr>
            <tr>
            	<td>&nbsp;</td>
            	<td>
            		<table width="700" border="0" cellpadding="0" cellspacing="0" >
			            <tr>
			               	<td width="20%" align="right">เดือนที่ทำรายงาน :&nbsp;</td>
							<td width="80%" align="left">
								<select name="montfrom" id="monthfrom" class="select" style="width: 146px">
									<option value="">เลือก</option>
									<c:forEach var="mm" items="${mmlist}">
										<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if> >
										${mm.month_name_thai}</option>
									</c:forEach>
								</select>
								<font style="color: red">*</font> 
							</td>
						</tr>
						<tr>
							<td  align="right">ปีงบประมาณ :&nbsp;</td>	
							<td align="left">
								<input type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
								<font style="color: red">*</font>
							</td>
						</tr>
						<tr> 
				       	 	<td >&nbsp;</td>
				       	 	<td>
				       	 		<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();" />
				           	 </td>
			            </tr>							
					</table>
            	</td>
            </tr>
         </table>
         

		        	 
<script type='text/javascript'>
function report(){

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

	if(monthfrom == ""){
		alert("กรุณาเลือกเดือนที่ทำรายงาน");
		document.getElementById("monthfrom").focus();
	}else if(year1 == ""){
		alert("กรุณาระบุปีงบประมาณ");
		document.getElementById("year1").focus();
	}else{
		if(monthfrom == 001||monthfrom == 003||monthfrom == 005||monthfrom == 007||monthfrom == 008||monthfrom == 110||monthfrom == 112 ){
			dayto='31';
			yearto=(year1-543)-monthfrom.substring(0,1);	
			monthto2=monthfrom.substring(3,1);
			dateto=yearto+'-'+monthto2+'-'+dayto; }
		else if(monthfrom == 004||monthfrom == 006||monthfrom == 009||monthfrom == 111){
	  		dayto='30';
			yearto=(year1-543)-monthfrom.substring(0,1);	
			monthto2=monthfrom.substring(3,1);
			dateto=yearto+'-'+monthto2+'-'+dayto;  
		}else if(monthfrom == 002 ){
	  		if( nam== 0 ){
	  			dayto='29';
				yearto=(year1-543)-monthfrom.substring(0,1);	
				monthto2=monthfrom.substring(3,1);
				dateto=yearto+'-'+monthto2+'-'+dayto;
			}else{
	  			dayto='28';
				yearto=(year1-543)-monthfrom.substring(0,1);	
				monthto2=monthfrom.substring(3,1);
				dateto=yearto+'-'+monthto2+'-'+dayto;
			} 
		}

		var param = 'process?action=Report&__report=ILLR8122&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto+'&getUserID='+user_id;
		//alert(param);
		window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
	}
}
</script>
		   			
		</td>
		</tr>
		</table>
		