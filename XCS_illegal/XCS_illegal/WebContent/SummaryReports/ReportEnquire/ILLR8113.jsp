<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>

<!-- Body -->
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 <tr>
		 	<td width="1%">&nbsp;</td>
            <td width="99%">
            	<span class="websitename">1.13 สถิติผลการปราบปรามผู้กระทำผิดผู้กระทำผิดกฎหมายสรรพสามิตเปรียบเทียบ (ทั่วประเทศ)</span>
            </td>
         </tr> 
         <tr><td colspan="2">&nbsp;</td></tr>
         <tr>
         	<td >&nbsp;</td>
            <td ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
         </tr> 
         <tr>
         	<td >&nbsp;</td>
         	<td >
         		<table width="700" border="0" cellspacing="0" cellpadding="0">
					 <tr>
					 	<td width="20%" align="right">เดือนที่ทำรายงาน :&nbsp;</td>
					 	<td width="80%" align="left">
					 		<select name="montfrom" id="monthfrom" class="select" style="width: 146px">
								<option value="">เลือก</option>
								<c:forEach var="mm" items="${mmlist}">
									<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>="">
									${mm.month_name_thai}</option>
								</c:forEach>
							</select>
				 	  	 	<font style="color: red">*</font> &nbsp;&nbsp;
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
						 <td align="right">ปีงบประมาณนี้ :&nbsp;</td>	
						 <td>
							 <input value="${year1}" type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8" />
							 <font style="color: red">*</font> 
						 </td>
					 </tr>
					 <tr>
						 <td align="right">ปีงบประมาณก่อน :&nbsp;</td>
						 <td>
							 <input value="${year2}" type="text" name="year2" onkeypress="ChkMinusInt('this');" maxlength="4" id="year2" size="8" />
							 <font style="color: red">*</font> 
						 </td>
					 </tr>
						 <tr><td align="right">ปีงบประมาณก่อนหน้านี้ :&nbsp;</td>
						 <td>
							 <input value="${year3}" type="text" name="year3" onkeypress="ChkMinusInt('this');" maxlength="4" id="year3" size="8" />
							 <font style="color: red">*</font> 
						 </td>		
			         </tr>
				</table>
         	</td> 
		  </tr>
		  <tr>
         	<td >&nbsp;</td>
            <td >&nbsp;</td>
         </tr>						
         <tr>
          	<td >&nbsp;</td>
           	<td ><span class="sectionname">ประเภทรายงาน</span></td>
          </tr>
          <tr>
          	<td>&nbsp;</td>
          	<td>
          		<table width="700" border="0" cellspacing="0" cellpadding="0">
           			<tr>
           				<td align="right" width="20%" height="30px">ภาค :&nbsp;</td>
           				<td align="left" width="80%">
           					<select id="sector_code" name="sector_code" style="width: 325px" onchange="getArea('area',this.value),getBranch('branch',this.value)">
           				</td>
           			</tr>
           			<tr>
						<td align="right" height="25px">พื้นที่:&nbsp;</td>
						<td>  
							<select id="area" name="area" style="width: 325px" onchange="getBranch('branch',this.value)"></select>
		                </td>
					</tr>
					<tr>
						<td align="right" height="25px"> พื้นที่/สาขา:&nbsp;</td>
						<td>
							<select id="branch" name="branch" style="width: 325px"/></select>
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
		</td>
	</tr>
</table>
<script type='text/javascript'>
function report(){

 	var monthto=document.getElementById("monthto").value;
  	var monthfrom=document.getElementById("monthfrom").value;
  	var yearfrom=monthfrom.substring(0,1);
	var datefrom=monthfrom.substring(3,1);
	var yearto=monthto.substring(0,1);	
	var dateto=monthto.substring(3,1);
	
   	var year1=document.getElementById("year1").value-543;
    var year2=document.getElementById("year2").value-543;
    var year3=document.getElementById("year3").value-543;

    var vMonthFrom1 = (year1-yearfrom) + "" + datefrom;
    var vMonthFrom2 = (year2-yearfrom) + "" + datefrom;
    var vMonthFrom3 = (year3-yearfrom) + "" + datefrom;
    var vMonthTo1 = (year1-yearto) + "" + dateto;
    var vMonthTo2 = (year2-yearto) + "" + dateto;
    var vMonthTo3 = (year3-yearto) + "" + dateto;
    //alert(vMonthFrom1 + " " + vMonthFrom2 + " " + vMonthFrom3);
    //alert(vMonthTo1 + " " + vMonthTo2 + " " + vMonthTo3);
    var branch=document.getElementById("branch").value;
    var area=document.getElementById("area").value;
    var sector=document.getElementById("sector_code").value;
    var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
    
	if(monthfrom != "" && monthto != "" && year1 != "" && year2 != "" && year3 != ""){
		var param = '&getMonthfrom1='+vMonthFrom1+'&getMonthfrom2='+vMonthFrom2+'&getMonthfrom3='+vMonthFrom3
		+'&getMonthto1='+vMonthTo1+'&getMonthto2='+vMonthTo2+'&getMonthto3='+vMonthTo3
		+'&getYear1='+year1+'&getYear2='+year2+'&getYear3='+year3
		+'&getOffcode1='+sector+'&getOffcode2='+area+'&getOffcode3='+branch+'&getUserID='+user_id + '&time=' + <%= new java.util.Date().getTime() %>;

		Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + 'ReportName=ILLR8113&vReportType=PDF' + param, '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}else{
				window.open('process?action=Report&__report=ILLR8113&__formatt=pdf' + param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=yes,scrollbars=no,width=900,height=700');
			}
		});

		
		
	}else{
		alert("กรุณาระบุเงื่อนไขให้ถูกต้อง");
	}
}

getSector('sector_code');
getArea('area','');
getBranch('branch','');
</script>