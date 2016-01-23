<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
	PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">
	function confirmBox(str_text,var_id){
  		var r = confirm(str_text);
  		if(r){
  	  		window.location.href='<c:url value="/process?action=Role_Master&cmd=delete&id='+var_id+'"/>';
  		}
  		return r;
	}
</script>
<form name="dataform" action="<c:url value="/process?action=Role_Master&cmd=list"/>" method="post" >
      <table width="100%"  border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td>&nbsp;&nbsp;&nbsp;</td>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td >
                  	<span class="websitename">กำหนด Role การใช้งาน</span>
                  </td>
                </tr>
                <tr>
                	<td>
					   	<!--<input type="button" class="barButton" value="เพิ่มข้อมูล" onclick="javascript:location.href='<c:url value="/process?action=RoleMenu_Master&cmd=list"/>'"/>-->
					   	<a class="spanLink" href="<c:url value="/process?action=RoleMenu_Master&cmd=list"/>">เพิ่มข้อมูล</a>
					</td>
				</tr>
                <tr>
                	<td>
						<table width="500" border="0" cellpadding="" cellspacing="0" bgcolor="#c2c2c2">
							  <tr>
							  	<td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
								<td width="98%"></td>
								<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
							  </tr>
							  <tr>
							  	<td>&nbsp;</td>
								<td  height="5" align="left" valign="top" colspan="2" style="height: 10px"><span class="sectionname">ค้นหา</span></td>
							  </tr>
							  <tr>
								<td >&nbsp;</td>
								<td valign="top" >
									<table border="0" cellpadding="0" cellspacing="0" width="800">
										<tr >
											<td width="30%" align="right"  valign="middle" >
												ชื่อ Role :&nbsp;
											</td>
											<td width="20%" align="left"  valign="middle" >
												<input name="txtname" type="text" class="textbox" value="${param.txtname }" size="15">&nbsp;
											</td>
											<td width="50%" valign="middle">
												<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
											</td>
										</tr>								
									</table>
								</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
								<td></td>
								<td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
						  	</tr>
						</table>
                	</td>
                </tr>
             </table>
		
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="50%" ><%=pageUtil.getPagination()%></td>
					<td width="50%"><%=pageUtil.getPageStatus()%></td>
				</tr>
			</table>
			
			
			<table class="tableList" width="600" border="0" cellspacing="0"
				cellpadding="0" bordercolor="#CCCCCC">
				<tr class="TblHeaderColumn bgRowGray">
					<td width="30" class="TblHeaderColumn"><p align="center"><b>ลำดับ</b></td>
					<td class="TblHeaderColumn"><p align="center"><b>ชื่อ Role</b></p></td>
					<td width="80" class="TblHeaderColumn"><p align="center"><b>กำหนดสิทธิ์</b></td>
					<!-- <td width="60" class="TblHeaderColumn"><p align="center"><b>เพิ่มผู้ใช้</b></td>  --> 
					<td width="80" class="TblHeaderColumn"><p align="center"><b>ลบ</b></td>
				</tr>
				<tr>
					<c:forEach items="${rv}"  var="Rolecount" varStatus="i">
	                   <!-- odd row -->		
	                   <c:if test="${(i.count % 2) == 1}">  							  	
							<tr>
	           					<td align="center">${i.count}<input type="hidden" value="${Rolecount.id}" name="id"/></td>
	           					<td>${Rolecount.role_name }</td>
	           					<td align="center"><a class="spanLink" href="<c:url value="/process?action=RoleMenu_Master&cmd=edit&id=${Rolecount.id}" />">กำหนดสิทธิ์</a></td>
	           					<!-- 
	           					<td align="center" ><a class="spanLink" href="<c:url value="/process?action=RoleUser_Master&cmd=UpdateRoleAuth&id=${Rolecount.id}" />">เพิ่มผู้ใช้</a></td>
	           					 -->
	           					<td align="center"><span class="spanLink" onclick="confirmBox('ยืนยันการลบข้อมูล','${Rolecount.id}')">ลบ</span></td>
		                	</tr>
	                    </c:if>		
	                    <c:if test="${(i.count % 2) == 0}">  							  	
							<tr>
	           					<td align="center" class="bgRowGray">${i.count}<input type="hidden" value="${Rolecount.id}" name="id"/></td>
	           					<td class="bgRowGray">${Rolecount.role_name }</td>
	           					<td align="center" class="bgRowGray"><a class="spanLink" href="<c:url value="/process?action=RoleMenu_Master&cmd=edit&id=${Rolecount.id}" />">กำหนดสิทธิ์</a></td>
	           					<!-- 
	           					<td align="center" class="bgRowGray"><a class="spanLink" href="<c:url value="/process?action=RoleUser_Master&cmd=UpdateRoleAuth&id=${Rolecount.id}" />">เพิ่มผู้ใช้</a></td>
	           					 -->
	           					<td align="center" class="bgRowGray"><span class="spanLink" onclick="confirmBox('ยืนยันการลบข้อมูล','${Rolecount.id}')">ลบ</span></td>
	           				</tr>
	                    </c:if>	  								                                                                           		  			  
	                </c:forEach>
	  			</tr>
	  			<tr><td colspan="5">&nbsp;</td></tr>
			</table>
		</td>
      </tr>
   </table>
</form>
