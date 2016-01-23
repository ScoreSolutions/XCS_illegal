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
	function Checktype(){
		
		var i;
		var casetype=document.getElementById("casetype").value;
		
		while(casetype[i]!=document.getElementById("casetype").checked)
		{
			i++;
		}
		alert(casetype);	
	}
	</SCRIPT>
	
<!-- Body -->

	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	
	<tr>
	<td width="100%" align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
            	<td width="99%" height="40"><span class="websitename">หน้างบสรุปรายงานของกลาง</span></td>
            </tr> 
            	     	
        	<tr>
            	<td width="99%" height="40"><span class="websitename">กรุณาระบุเงื่อนไข</span></td>
            </tr> 
              	
			<tr>
                <td height="35" align="left" valign="middle">วันที่ทำรายงาน :
					&nbsp; <input name="compare_case_date"
					id="compare_case_date" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" value=""${cc.compare_case_date}" timeZone="th-TH" >
				 	<a href="javascript:NewCssCal('compare_case_date','ddmmyyyy')">
				 	<img src="images/btn_calendar.png" alt="" width="19" height="19" 
				 	align="middle" style="border-style: none" /></a> <font 
				 	style="color: red">*</font> 
					ถึงวันที่ :&nbsp; 
					<input name="compare_case_date1" id="compare_case_date1" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" />
									
					<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')">
					<img src="images/btn_calendar.png" alt="" width="19" height="19"
					align="middle" style="border-style: none" /></a> <font
					style="color: red">*</font> 
				</td>
			</tr>								
		</table>
   			
		<table border="0" style="width: 578px">
			<tr>
				<td>ประเภทรายงาน</td>
			</tr>
		
			<tr>
				<td align="center">ภาค</td>
				<td>
                    <select id="sector_code" name="sector_code" style="width: 350px" onchange="getArea('area_code',this.value),getBranch('branch_code',this.value)">  
					</select>       
        		</td>	
			</tr>
		
			<tr>
				<td align="center">พื้นที่</td>
				<td>
                	<select id="area_code" name="area_code" style="width: 350px" onchange="getBranch('branch_code',this.value)">
					<option selected="">เลือก</option>
					</select>  	   	
        		</td>
			</tr>
		
			<tr>
				<td align="center"> พื้นที่สาขา</td>
				<td>
                	<select id="branch_code" name="branch_code" style="width: 350px">
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
				<td style="width: 155px" align="left"><input type="radio" name="casetype" id="casetype" value="1" />&nbsp;&nbsp;&nbsp;&nbsp;ฟ้องศาล</td>
				<td style="width: 189px" align="left"><input type="radio" name="casetype" id="casetype" value="2" checked />&nbsp;&nbsp;&nbsp;&nbsp;เปรียบเืทียปรับ</td>
				<td style="width: 169px" align="left"><input type="radio" name="casetype" id="casetype" value="3" />&nbsp;&nbsp;&nbsp;&nbsp;ไม่มีตัว</td>
			</tr>
		</table>
	
		<table>
			<tr>
				<td>ประเภทรายงาน</td>
			</tr>
			
			<tr style="width: 565px">
				<td style="width: 155px" align="left"><input type="radio" name="exhibitstatus" value="1" checked/>&nbsp;&nbsp;&nbsp;&nbsp;ยึด</td>
				<td style="width: 189px" align="left"><input type="radio" name="exhibitstatus" value="2"/>&nbsp;&nbsp;&nbsp;&nbsp;คืน</td>
			</tr>
		</table>
	
		<table>					
			<tr>
				<td align="center" height="40" valign="bottom">พ.ร.บ.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td height="40" valign="bottom">
					<select name="legislation_id" id="legislation_id" style="width:190px;">
						<option value="" <c:if test="${ltion.id == '' ||ltion.id == null}"> selected </c:if>="">เลือก</option>
            			<c:forEach items="${ltlist}" var="ltion">
            			<option value="${ltion.id}" <c:if test="${ltion.id == param.legislation_id}"> selected </c:if>="">${ltion.legislation_code} ${ltion.legislation_name}</option>
            			</c:forEach>
            		</select>
            	</td>	
            </tr>			
		</table>
		
		<table border="0" style="width: 900px; height: 110px">
			<tr>
				<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();"/>
              	 <script type='text/javascript'>
            	
					function report(){
					 var compare_case_date=document.getElementById("compare_case_date").value;
					 var compare_case_date1=document.getElementById("compare_case_date1").value;
					 var sector_code=document.getElementById("sector_code").value;
					 var area_code=document.getElementById("area_code").value;
					 var branch_code=document.getElementById("branch_code").value;
					 var casetype=document.getElementById("casetype").value;
			//		 var exhibitstatus=document.getElementById("exhibitstatus").value;
			//		 var legislation_id=document.getElementById("legislation_id").value; 
					 
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
					
			//		Checktype();
					
					if(sector_code==""){
   					alert ('process?action=Report&__report=ILLR8306&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto+
					'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code+'&getCasetype='+casetype, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
					}
		//		    window.open('process?action=Report&__report=ILLR8306&__formatt=pdf&getDatefrom='+datefrom+'&getDateto='+dateto+
		//			'&getOffcode1='+sector_code+'&getOffcode2='+area_code+'&getOffcode3='+branch_code, '_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
					}
				</script>
            </tr>
		</table>
	</td>
	</tr>
	
	</table>
	