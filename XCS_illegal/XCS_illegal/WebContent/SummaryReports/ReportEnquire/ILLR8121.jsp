<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
             	<td width="99%"><span class="websitename">1.21 เปรียบเทียบผลการดำเนินงานปีปัจจุบัน กับปีก่อน และเป้าหมาย (ทั่วประเทศ)</span></td>
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
							<td  align="right">ปีงบประมาณนี้ :&nbsp;</td>	
							<td align="left">
								<input type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
								<font style="color: red">*</font>
							</td>
						</tr>
						<tr>
							<td  align="right">ปีงบประมาณก่อน :&nbsp;</td>	
							<td align="left">
								<input type="text" name="year2" onkeypress="ChkMinusInt('this');" maxlength="4" id="year2" size="8">
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

	var monthfrom=document.getElementById("monthfrom").value.substring(3,1);
  	var year1=document.getElementById("year1").value;
  	var year2=document.getElementById("year2").value;
  	var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
  	

	if(monthfrom == ""){
		alert("กรุณาเลือกเดือนที่ทำรายงาน");
		document.getElementById("monthfrom").focus();
	}else if(year1 == ""){
		alert("กรุณาระบุปีงบประมาณนี้");
		document.getElementById("year1").focus();
	}else if(year2 == ""){
		alert("กรุณาระบุปีงบประมาณก่อน");
		document.getElementById("year2").focus();
	}else{
		year1 = year1 - 543 - document.getElementById("monthfrom").value.substring(0,1);
		year2 = year2 - 543 - document.getElementById("monthfrom").value.substring(0,1);
		
		var param = 'process?action=Report&__report=ILLR8121&__formatt=pdf&vMonth='+monthfrom+'&vYear1='+year1+'&vYear2='+year2+'&getUserID='+user_id;
		alert(param);
		window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
	}
}
</script>
		   			
		</td>
		</tr>
		</table>
		