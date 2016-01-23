<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%@page import="com.ko.webapp.util.FormHandler"%>
<script type='text/javascript' src='dwr/interface/Master.js'></script>
<%
	PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">
function clear2()
{
	window.location.href="process?action=OtherStaffList_Master";
}

function btDelete(id)
{
var answer = confirm ("ยืนยันการลบข้อมูล");
	if (answer){
		window.location.href="process?action=Arrest&id="+id+"&cmd=del";
	}
	else{
	}
}

function chkRefercence(StaffID, StaffNo){
	Master.chkRefStaffOther(StaffNo,function(data){
		if(data == ""){
			var ans = confirm("ยืนยันการลบข้อมูล");
			if(ans){
					document.dataform.action = "process?action=OtherStaffList_Master&id="+StaffID+"&cmd=delete";
					document.dataform.submit();
					//window.location.href="process?action=OtherStaffList_Master&id="+StaffID+"&cmd=delete";
			}
		}else{
			alert(data);
		}	
	});
}
</script>
<%
	FormHandler formHandler = new FormHandler(request);
%>
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">กำหนดชื่อเจ้าหน้าที่อื่นๆ</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                	<td >&nbsp;</td>
                	<td >
                	<form method="post" name="dataform" action="<c:url value="/process?action=OtherStaffList_Master&cmd=list"/>" >
                		<table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
							  <tr>
								<td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
								<td width="98%"></td>
								<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
							  </tr>
							  <tr>
							  	<td>&nbsp;</td>
								<td  height="25" align="left" valign="top" colspan="2"><span class="sectionname">ค้นหา</span></td>
								<td></td>
							  </tr>
							  <tr>
								<td >&nbsp;</td>
								<td align="center" valign="top">
										<table border="0" cellpadding="0" cellspacing="0" width="800">
											<tr>
												<td width="30%" align="right">รหัสเจ้าหน้าที่ :&nbsp;</td>
												<td width="70%" align="left"><input name="staffcode" type="text" class="textBox" value="${param.staffcode}" size="30" /></td>
											</tr>
											<tr>
												<td align="right">ชื่อ-สกุล :&nbsp;</td>
												<td height="25" align="left">
													<input name="staffname" type="text" class="textBox" value="${param.staffname}" size="30" />
												</td>
											</tr>
											<tr>
												<td align="right">ตำแหน่ง :&nbsp;</td>
												<td height="25" align="left">
													<input name="staffpos" type="text" class="textBox" value="${param.staffpos}" size="30" />
												</td>
											</tr>
											<tr>
												<td align="right">สังกัด :&nbsp;</td>
												<td height="25" align="left">
												   <input type="text" name="staffdept" size="30"  class="textbox"  value="${param.staffdept}" >
												</td>

											</tr>
											<tr><td colspan="2" align="center">&nbsp;</td></tr>
											<tr>
												<td colspan="2" align="center"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">&nbsp;&nbsp;&nbsp;&nbsp;<img name="222" width="67" src="images/icn_clearsearch.jpg"  style="cursor:hand" alt="ล้างเงือนไข" onclick="clear2();" border="0" ></td>
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
					</form>
                	</td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                  <td>&nbsp;</td>
                  <td >
                    <table border="0" width="100" cellpadding="=0" cellspacing="0">
					 <tr>
					   <td>
					   	<a href="<c:url value="process?action=OtherStaffList_Master&cmd=add"/>" target="_self">เพิ่มข้อมูล</a>
						</td>
					 </tr>
					 <tr>
					   <td>&nbsp;</td>
					 </tr>
                      <tr>
                        <td >
                          <table class="tableList" width="1000"   border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
							     <tr>
								     <td colspan="4" align="left"><%=pageUtil.getPagination()%></td><td align="right" colspan="3"><%=pageUtil.getPageStatus()%>	</td>
							     </tr>
								 <tr class="TblHeaderColumn">
								   <td width="50" >ลำดับ</td>
								  <td width="100" >รหัสเจ้าหน้าที่</td>
								  <td width="150" >ชื่อ-สกุล</td>
								  <td >ตำแหน่ง</td>
								  <td >สังกัด</td>
								  <td width="100" >สถานะ</td>
								  <td width="50">&nbsp;</td>
								  
								</tr>
						<c:forEach items="${StaffList}"  var="stafflist"  varStatus="i" >
				  			<c:if test="${(i.count % 2) == 1}">
								<tr class="TblRow">
									<td align="center">${i.count }</td>
								    <td align="center"><a href="<c:url value="process?action=OtherStaffList_Master&cmd=edit&id=${stafflist.id}" />">${stafflist.staff_no }</a></td>
								    <td >${stafflist.title_name }${stafflist.first_name } ${stafflist.last_name }</td>
								    <td >${stafflist.pos_name }</td>
									<td >${stafflist.dept_name }</td>
									<td >${stafflist.active_status}</td>
									<td >
									  	<img src="images/icon_delete.gif" width="25" height="25" border="0" alt="ลบ" style="cursor:hand;" onclick = 'chkRefercence("${stafflist.id}","${stafflist.staff_no}");'>
									</td>
								</tr>
							</c:if>
							<c:if test="${(i.count % 2) == 0}">
								<tr class="TblRow bgRowGray">
									  <td align="center">${i.count }</td>
									  <td align="center"><a href="<c:url value="process?action=OtherStaffList_Master&cmd=edit&id=${stafflist.id}" />">${stafflist.staff_no }</a></td>
									  <td >${stafflist.title_name }${stafflist.first_name } ${stafflist.last_name }</td>
									  <td >${stafflist.pos_name }</td>
									  <td >${stafflist.dept_name }</td>
									  <td >${stafflist.active_status}</td>
									  <td >
									  	<img src="images/icon_delete.gif" width="25" height="25" border="0" alt="ลบ" style="cursor:hand;" onclick = 'chkRefercence("${stafflist.id}","${stafflist.staff_no}");'>
									  </td>
								</tr>
							</c:if>
				  		</c:forEach>
				  		<tr>
				  		<td>&nbsp;</td>
				  		</tr>
                         </table>
                        </td>
                      </tr>
                    </table>
                  </td>
                </tr>
             </table>
           </td>
        </tr>
      </table>

