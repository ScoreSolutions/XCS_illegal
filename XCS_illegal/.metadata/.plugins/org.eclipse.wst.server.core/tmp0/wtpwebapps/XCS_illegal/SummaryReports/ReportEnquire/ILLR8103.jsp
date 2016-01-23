<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	<tr>
		<td width="100%"align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	<tr>
		 		<td width="1%">&nbsp;</td>
             	<td width="99%"><span class="websitename">1.3 ผลคดีและค่าเปรียบเทียบปรับการกระทำผิดตาม พ.ร.บ. สุรา แสดงผลรายเดือน</span></td>
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
              	<td >&nbsp;</td>
             	<td  ><span class="sectionname">ประเภทรายงาน</span></td>
            </tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  ><jsp:include page='../UserControl/ctlEdOffice.jsp' /></td>
            </tr>
            <tr><td colspan="2">&nbsp;</td></tr>
            <tr>
              	<td >&nbsp;</td>
             	<td  >
             		<table width="700" border="0" cellpadding="0" cellspacing="0" >
						<tr>
							<td width="20%"  align="right">&nbsp;</td>	
							<td width="80%" align="left">
								<input name="btnBack" type="button" class="barbutton" value="รายงาน" onClick="report();" />
							</td>
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

  	var year1=document.getElementById("year1").value;
  	var vOffcode1 = document.getElementById("sector_code").value;
  	var vOffcode2 = document.getElementById("area").value;
  	var vOffcode3 = document.getElementById("branch").value;
  	var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
  	var vYear=(year1-543);	
	var rtType;
	if(vOffcode1 != "")
		rtType = "2";
  	if(vOffcode2 != "")
		rtType = "1";
  	if(vOffcode3 != "")
		rtType = "0";
  	
	if(year1 != ""){
		if(vOffcode1=="" && vOffcode2 == "" && vOffcode3 == ""){
			var param = 'process?action=Report&__report=ILLR8103_1&__formatt=pdf&vYear='+vYear+'&getUserID='+user_id;
			//alert (param);
			window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			var param = 'process?action=Report&__report=ILLR8103&__formatt=pdf&vYear='+vYear+'&vOffcode1='+vOffcode1+'&vOffcode2='+vOffcode2+'&vOffcode3='+vOffcode3+'&getUserID='+user_id+'&rtType='+rtType;
			//alert (param);
			window.open(param,'_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}
	}else{
		 alert('กรุณาระบุปีงบประมาณ');
		 document.getElementById("year1").focus();
	}
}
</script>

		