<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>

	<SCRIPT LANGUAGE="JavaScript">		
	
	function checkCasetype(){
		
		var radioLength=document.getElementsByName("casetype").length;
		
		for (var i = 0; i < radioLength; i++) { 	
			if (document.getElementsByName("casetype")[i].checked) { 				
	    		document.getElementsByName("casetype").value = document.getElementsByName("casetype")[i].value;
	      	}
	  	}
		checkExhibitstatus();
	}
	
	function checkExhibitstatus(){
		
		var radioLength=document.getElementsByName("exhibitstatus").length;
		
		for (var i = 0; i < radioLength; i++) { 
			if (document.getElementsByName("exhibitstatus")[i].checked) { 
	      		document.getElementsByName("exhibitstatus").value = document.getElementsByName("exhibitstatus")[i].value; 	
	      	}
		}
		report();
	}

	function setGroupID(group_id, vLegislationID, vGroupID){
		LegislationProduct.getDutyGroup(vLegislationID,function(data){
			dwr.util.removeAllOptions(group_id);
			//dwr.util.addOptions(group_id,[{group_id:"",group_name:"เลือก"}],"group_id","group_name");
			dwr.util.addOptions(group_id,data,"group_id","group_name");
			
			if(vGroupID!=null && vGroupID!="" ){
				dwr.util.setValue(group_id,vGroupID);
			}

			//if(dwr.util.getValue("have_culprit")=="N" || dwr.util.getValue("issentcourt")==true)
			//	dwr.util.addOptions("product_group_id",[{group_id:"0000",group_name:"อื่นๆ"}],"group_id","group_name");
		});
	}
	</SCRIPT>
	



<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">	
	<tr>
		<td width="100%" align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="1%">&nbsp;</td>
            		<td width="99%" ><span class="websitename">3.6 หน้างบสรุปรายงานของกลาง</span></td>
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
								<td width="20%" align="right">วันที่ทำรายงาน :&nbsp;</td>
			            	 	<td width="80%" align="left" >
			            	 		<input name="compare_case_date" id="compare_case_date" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" value=""${cc.compare_case_date}" timeZone="th-TH" >
							 	  	<a href="javascript:NewCssCal('compare_case_date','ddmmyyyy')">
							 	  	<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
							 	  	<font style="color: red">*</font> &nbsp;&nbsp;
							 	  	ถึงวันที่ :&nbsp; 
							 	  	<input name="compare_case_date1" id="compare_case_date1" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" />
								  	<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')">
								  	<img src="images/btn_calendar.png" alt="" width="19" height="19"align="middle" style="border-style: none" /></a> 
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
								<td align="right" height="30" valign="bottom">พ.ร.บ. :&nbsp;</td>
								<td valign="bottom">
									<select name="legislation_id" id="legislation_id" style="width:200px;" onchange="setGroupID('product_group_id',this.value,'');" >
										<option value="" <c:if test="${ltion.id == '' ||ltion.id == null}"> selected </c:if>>เลือก</option>
				            			<c:forEach items="${ltlist}" var="ltion">
				            			<option value="${ltion.id}" <c:if test="${ltion.id == param.legislation_id}"> selected </c:if>="">${ltion.legislation_code} ${ltion.legislation_name}</option>
				            			</c:forEach>
				            		</select>
				            		<font style="color: red">*</font> 
				            	</td>	
				            </tr>
				            <tr>
							    <td height="25" align="right">สินค้า :&nbsp;</td>
							    <td >
								    <select name="product_group_id" id="product_group_id" style="width:200px;">
								    	<option value="" selected >เลือก</option>
								    </select>
							        <font style="color:red">*</font>
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
	           	 	<td >&nbsp;</td>
	           	 	<td >
	           	 		<table width="700" border="0" cellpadding="0" cellspacing="0">		
							<tr >
								<td width="30%" align="left"><input type="radio" name="casetype" id="casetype1" value="1" />&nbsp;ฟ้องศาล</td>
								<td width="30%" align="left"><input type="radio" name="casetype" id="casetype2" value="2" checked />&nbsp;เปรียบเทียบปรับ</td>
								<td width="40%" align="left"><input type="radio" name="casetype" id="casetype3" value="3" />&nbsp;ไม่มีตัว</td>
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
	           	 	<td >&nbsp;</td>
	           	 	<td >
	           	 		<table width="700" border="0" cellpadding="0" cellspacing="0">	
	           	 			<tr >
								<td width="30%" align="left"><input type="radio" id="exhibitstatus1" name="exhibitstatus" value="1" checked/>&nbsp;ยึด</td>
								<td width="70%" align="left"><input type="radio" id="exhibitstatus2" name="exhibitstatus" value="2"/>&nbsp;คืน</td>
							</tr>
	           	 		</table>
	           	 	</td>
	           	 </tr>
	           	 <tr>
		          	<td>&nbsp;</td>
		          	<td>
		          		<table width="700" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td height="30px" width="20%">&nbsp;</td>
								<td width="80%"><input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();"/></td>
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
					 var compare_case_date=document.getElementById("compare_case_date").value;
					 var compare_case_date1=document.getElementById("compare_case_date1").value;
					 var sector_code=document.getElementById("sector_code").value;
					 var area_code=document.getElementById("area_code").value;
					 var branch_code=document.getElementById("branch_code").value;
					 var casetype;
					 if (document.getElementById("casetype1").checked)
						 casetype = "1";
					 else if (document.getElementById("casetype2").checked)
						 casetype = "2";
					 else if (document.getElementById("casetype3").checked)
						 casetype = "3";
					 
					 var exhibitstatus;
					 if (document.getElementById("exhibitstatus1").checked)
						 exhibitstatus = "1";
					 else if (document.getElementById("exhibitstatus2").checked)
						 exhibitstatus = "2";
					 
					 var legislation_id=document.getElementById("legislation_id").value; 
					 var product_group_id = document.getElementById("product_group_id").value;
					 var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
								  
					 var yearfrom;
					 var monthfrom;
					 var dayfrom;
					 var datefrom;
					 
					 var yearto;
					 var monthto;
					 var dayto;
					 var dateto;
					 
					dayfrom=compare_case_date.substring(0,2);
					monthfrom=compare_case_date.substring(3,5);
					yearfrom=compare_case_date.substring(6,10)-543;
				
					dayto=compare_case_date1.substring(0,2);
					monthto=compare_case_date1.substring(3,5);
					yearto=compare_case_date1.substring(6,10)-543;
				
					datefrom=yearfrom+'-'+monthfrom+'-'+dayfrom;
					dateto=yearto+'-'+monthto+'-'+dayto;
				
					if(compare_case_date==""||compare_case_date1==""){
						alert('กรุณาป้อนวันที่ทำรายงาน');
					}
					else if(legislation_id==""){
						alert('กรุณาเลือก พ.ร.บ.');
					}
					else if(product_group_id==""){
						alert("กรุณาเลือกสินค้า");
					}else{
						if(sector_code==""){
							Reports.ReportUrl(function(data){
								if(data != ""){
									window.open(data + 'ReportName=ILLR8306_1&vReportType=PDF&getDatefrom='+datefrom+'&getDateto='+dateto+
											'&getCasetype='+casetype+'&getLegislationid='+legislation_id+'&getGroupID='+product_group_id+'&getExhibitstatus='+exhibitstatus+'&getUserID='+user_id + '&time=' + Math.random(),
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								}else{
									window.open ('process?action=Report&__report=ILLR8306_1&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto+
											'&getCasetype='+casetype+'&getLegislationid='+legislation_id+'&getExhibitstatus='+exhibitstatus+'&getUserID='+user_id + '&time=' + Math.random(), 
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								}
							});		
						}
						else{
							Reports.ReportUrl(function(data){
								if(data != ""){
									window.open(data + 'ReportName=ILLR8306&vReportType=PDF&getDatefrom='+datefrom+'&getDateto='+dateto+
											'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getCasetype='+casetype+'&getLegislationid='+legislation_id+'&getGroupID='+product_group_id+'&getExhibitstatus='+exhibitstatus+'&getUserID='+user_id + '&time=' + Math.random(),
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								}else{
									window.open ('process?action=Report&__report=ILLR8306&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto+
											'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getCasetype='+casetype+'&getLegislationid='+legislation_id+'&getGroupID='+product_group_id+'&getExhibitstatus='+exhibitstatus+'&getUserID='+user_id + '&time=' + Math.random(), 
											'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								}
							});
						}
					}
				}
				getSector('sector_code');
				getArea('area_code','');
				getBranch('branch_code','');
			</script>
	