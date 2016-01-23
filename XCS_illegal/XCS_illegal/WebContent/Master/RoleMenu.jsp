<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="com.ko.webapp.util.PageUtil"%>

<form name="dataform" action="<c:url value="/process?action=RoleMenu_Master&cmd=save"/>" method="post">
      <table width="100%" height="1%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr style="height: 29px">
                  <td width="1%"><span class="websitename"><b>กำหนด Role การใช้งาน</b></span></td>
                </tr>
                <td width="1%"> </td>
                <tr><td>					   	
					   	<input name="btnSave"  type="submit" class="barbutton" value="บันทึก" >
						<input name="btnBack"  type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="javascript:location.href='<c:url value="/process?action=Role_Master"/>'"></br></br>
						${txtMsg}
				</td></tr>
				<tr><td width="1%"> </td></tr>
                <tr>                	
                	<td width="1px">
						<table width="1000" border="0" cellpadding="" cellspacing="0" bgcolor="#c2c2c2">
							 <tr >
							    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"/></td>
								<td width="98%"/></td>
								<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"/></td>							
							  </tr>
							  <tr>
								<td >&nbsp; </td>
								<td valign="top">
									<table border="0" cellpadding="0" cellspacing="0" width="100%">
										<tr>
											<input name="RoleID" type="hidden"  value="${roleID}" >
											<td align="right">รหัส Role :&nbsp;</td>
											<td align="left">
												<input align="bottom" name="RoleCode" type="text" class="textbox" value="${roleCode }" size="15">
												<font color="red">*</font>
												(รหัสอ้างอิงจากระบบความปลอดภัยกลาง)
											</td>
										</tr>
										<tr >
											<td width="20%" align="right">ชื่อ Role :&nbsp;</td>
											<td width="80%" align="left" ><input align="bottom" name="RoleName" type="text" class="textbox" value="${roleName }" size="30"></td>											
										</tr>
										<tr>
											<td align="right">รายละเอียด :&nbsp;</td>
											<td align="left"><input align="bottom" name="RoleDesc" type="text" class="textbox" value="${roleDesc }" size="30"><c:if test ="${roleDesc} = null"> ${roleDesc} = -</c:if></td>
										</tr>
										<tr>
											<td align="right"></td>
											<td align="left"></td>
										</tr>
									</table>
								</td>
								<td >&nbsp; </td>
							</tr>
							<tr>
								<td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"/></td>
								<td ></td>
								<td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"/></td>
						  	</tr>
						</table>
                	</td>
                </tr>
                <tr><td colspan="3">&nbsp;</td></tr>
             </table>
             
		<table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">	
			<tr class="TblHeaderColumn bgRowGray">
				<td width="50" class="TblHeaderColumn"><p align="center"><b>ลำดับ</b></p></td>
				<td width="155" class="TblHeaderColumn"><p align="center"><b>ชื่อ โมดูล</b></p></td>
				<td width="155"class="TblHeaderColumn"><p align="center"><b>ชื่อเมนู</b></p></td>
				<td width="100" class="TblHeaderColumn"><p align="center"><b>กำหนดสิทธิ์</b></p></td>
			</tr>

			<c:forEach items="${rg}" var="iMenu" varStatus="i">
               <c:if test="${(i.count % 2) == 1}">  							  	
					<tr >
               </c:if>		
               <c:if test="${(i.count % 2) == 0}">  
               		<tr class="bgRowGray">
               </c:if>	
						<input type="hidden" value="${iMenu.menu_id}" name="menu_id"/>
              			<td width="10%" align="center" >${i.count}</td>
             			<td width="20%">${iMenu.mdl_name}</td>
              			<td width="60%">${iMenu.menu_name }</td>
              			<td width="10%" align="center"><input type="checkbox" name="rgStatus" <c:if test="${iMenu.status == '1' }"> checked </c:if> value="${iMenu.menu_id}" ></input></td>                           			    
                    </tr>	                                                                           		  			  
               </c:forEach>
   			</table>
   		 </td>
   	   </tr>
   	   <tr><td colspan="2">&nbsp;</td></tr>
   	   <tr><td colspan="2">&nbsp;</td></tr>
   	</table>
<form/>

<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
var frmvalidator  = new Validator("dataform");
frmvalidator.addValidation("RoleCode","req","กรุณาป้อนรหัส Role");
frmvalidator.addValidation("RoleName","req","กรุณาป้อนชื่อ Role");

</script>
<c:if test="${txtMsg != null && txtMsg != ''}">
	<script>
		alert("${txtMsg}");
	</script>
</c:if>
