<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>


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
		 			<td width="1%" >&nbsp;</td>
         			<td width="99%"><span class="websitename">1.6 ผลการปราบปรามผู้กระทำผิดกฏหมายสรรพสามิต</span></td>
         		</tr> 
         		<tr><td colspan="2">&nbsp;</td></tr>
        		<tr>
        			<td  >&nbsp;</td>
             		<td ><span class="sectionname">กรุณาระบุเงื่อนไข</span></td>
        		</tr>
        		<tr>
	            	<td>&nbsp;</td>
	   	            <td align="left" >
	   	            	<jsp:include page='../UserControl/ctlMonthFromTo.jsp' />
					</td> 
				</tr>
				<tr>
	            	<td>&nbsp;</td>
	            	<td>
	            		<table width="700" border="0" cellpadding="0" cellspacing="0" >
							<tr>
								<td width="20%"  align="right">ปีงบประมาณ :&nbsp;</td>	
								<td width="80%" align="left">
									<input value="${year1}" type="text" name="year1" onkeypress="ChkMinusInt('this');" maxlength="4" id="year1" size="8">
									<font style="color: red">*</font>
								</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>
									
								</td>
							</tr>					
						</table>
	            	</td>
	            </tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<table width="700" border="0" cellpadding="0" cellspacing="0" >
							<tr>
								<td width="20%">&nbsp;</td>
								<td width="80%" align="left">
									<input type="checkbox" name="option3" value="Cheese" onClick="Disab ()">สรุปจังหวัดในภาค
									<select disabled id="sector_code" name="sector_code" style="width: 325px" >
						   				<option value="">เลือก</option>
						   				<c:forEach var="ed" items="${sclist}">
						   					<option value="${ed.offcode }">${ed.offname }</option>
						   				</c:forEach> 
						   			</select> 
						   			<font style="color:red">*</font>
								</td>
							</tr>
							<tr>
					 			<td height="40px">&nbsp;</td>
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
  						var year1=document.getElementById("year1").value;
    					var sector_code=document.getElementById("sector_code").value;
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
		  				
						if(monthto==""||monthfrom==""){
							alert('กรุณาป้อนเดือนที่ทำรายงาน');
						}else if(year1==""){
							alert('กรุณาป้อนปีงบประมาณ');
							document.getElementById("year1").focus();
						}else{
							year1=year1-543;
							
							if(!option3.checked && sector_code==""){
								var param = 'process?action=Report&__report=ILLR8106&__formatt=pdf&vDateFrom='+datefrom+'&vDateTo='+dateto+'&vYear='+year1+'&getUserID='+user_id;
								//alert(param);
								window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
							}else{
								if(option3.checked && sector_code==""){
									alert("กรุณาเลือกภาค");
									document.getElementById("sector_code").focus();
								}else{
									var param = 'process?action=Report&__report=ILLR8106_1&__formatt=pdf&vDateFrom='+datefrom+'&vDateTo='+dateto+'&vYear='+year1+'&vOffcode='+sector_code+'&getUserID='+user_id;
									//alert(param);
									window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
								}
   							} 					
						}
					}
				</script>
