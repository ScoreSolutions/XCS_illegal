<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='/XCS_illegal/dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type='text/javascript' src='/XCS_illegal/dwr/engine.js'></script>
<script type='text/javascript' src='/XCS_illegal/dwr/util.js'></script>

			<table width="100%" border="0" cellspacing="0" cellpadding="0">
			 	<tr>
			 		<td width="1%">&nbsp;</td>
	         	 	<td width="99%"><span class="websitename">3.9 เปรียบเทียบผลคดีการปราบปรามผู้กระทำผิดกฏหมาย (ระหว่างปีงบประมาณ)</span></td>
	         	</tr>   
	         	<tr><td colspan="2">&nbsp;</td></tr>												
        		<tr>
              		<td >&nbsp;</td>
            		<td ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
            	</tr> 
        		<tr>
        			<td>&nbsp;</td>
        			<td>
        				<table width="700" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td height="25" align="right">เดือนที่ทำรายงาน : </td>
								<td>
									<select name="montfrom" id="monthfrom" class="select" style="width: 180px">
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
								<td width="20%" align="right" height="25">ปีงบประมาณ:&nbsp;</td>
			            	 	<td width="80%" align="left" >
			            	 		<input  type="text" name="year1" id="year1" size="4" onkeypress="CheckNum (0)" maxlength="4">
			            	 		<font style="color: red">*</font> 
			            	 		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			            	 		และ :
			            	 		<input  type="text" name="year2" id="year2" size="4" onkeypress="CheckNum (0)" maxlength="4">
			            	 		<font style="color: red">*</font>
			            	 	</td>
			            	</tr> 
			            </table>
        			</td>
        		</tr>
        		<tr><td colspan="2">&nbsp;</td></tr>
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
		           					<select id="sector_code" name="sector_code" style="width: 325px" onchange="getArea('area_code',this.value),getBranch('branch_code',this.value)"></select>
		           				</td>
		           			</tr>
		           			<tr>
								<td align="right" height="25px">พื้นที่ :&nbsp;</td>
								<td>  
									<select id="area_code" name="area_code" style="width: 325px" onchange="getBranch('branch_code',this.value)"></select>
				                </td>
							</tr>
							<tr>
								<td align="right" height="25px"> พื้นที่/สาขา :&nbsp;</td>
								<td>
									<select id="branch_code" name="branch_code" style="width: 325px"/></select>
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

<script>
   function report(){
	 var monthfrom=document.getElementById("monthfrom").value;
	 var year1=document.getElementById("year1").value;
	 var year2=document.getElementById("year2").value;
	 var sector_code=document.getElementById("sector_code").value;
	 var area_code=document.getElementById("area_code").value;
	 var branch_code=document.getElementById("branch_code").value;
	 var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";

	 var vMonth1 = monthfrom.substring(3,1) + "" + ((year1-543)-monthfrom.substring(0,1));  //mmyyyy
	 var vMonth2 = monthfrom.substring(3,1) + "" + ((year2-543)-monthfrom.substring(0,1));  //mmyyyy
	 	if(monthfrom==""){
	 		alert('กรุณาเลือกเดือนที่ทำรายงาน');
			document.getElementById("monthfrom").focus();
   		}else if(year1==""){
			alert('กรุณาระบุปีงบประมาณ');
			document.getElementById("year1").focus();
		}else if(year2==""){
			alert('กรุณาระบุปีงบประมาณ');
			document.getElementById("year2").focus();
		}else{
			var param = 'process?action=Report&__report=ILLR8309&__formatt=pdf&getYear1='+year1+'&getYear2='+year2+
					'&getMonth1='+vMonth1+'&getMonth2='+vMonth2+
					'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getUserID='+user_id;
			//alert(param);
			
			Reports.ReportUrl(function(data){
				if(data != ""){
					window.open(data + 'ReportName=ILLR8309&vReportType=PDF&getYear1='+year1+'&getYear2='+year2+
							'&getMonth1='+vMonth1+'&getMonth2='+vMonth2+
							'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getUserID='+user_id + '&time=' + Math.random(),
							'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
				}else{
					window.open(param, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
				}
			});
		}
	}
	getSector('sector_code');
	getArea('area_code','');
	getBranch('branch_code','');
</script>
