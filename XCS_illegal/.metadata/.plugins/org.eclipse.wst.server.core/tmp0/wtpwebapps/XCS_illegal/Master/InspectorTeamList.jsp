<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<%
	PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">
function clear2()
{
	window.location.href="process?action=InspectorTeamList_Master";
}
</script>
<%
	FormHandler formHandler = new FormHandler(request);
%>
<form name="dataform" action="<c:url value="/process?action=InspectorTeamList_Master&cmd=list"/>" method="post" >
      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">กำหนดคณะผู้จับกุม ผู้ตรวจ</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                	<td >&nbsp;</td>
                	<td >
						<table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
							  <tr>
								<td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
								<td width="98%"></td>
								<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
							  </tr>
							  <tr>
							  	<td>&nbsp;</td>
								<td  height="8" align="left" valign="top" colspan="2"><span class="sectionname">ค้นหา</span></td>
							  </tr>
							  <tr>
								<td >&nbsp;</td>
								<td valign="top">
									<table border="0" cellpadding="0" cellspacing="0" width="800">
										<tr>
											<td width="20%" align="right">เลขที่หนังสือแต่งตั้ง :&nbsp;</td>
											<td width="30%"><input align="left" name="appoint_no" type="text" class="textBox" value="${param.appoint_no }" size="15" /></td>
											<td width="20%" align="right">เลขที่งาน :&nbsp;</td>
											<td width="30%"><input align="left" name="job_no" type="text" class="textBox" value="${param.job_no }" size="15" /></td>
										</tr>
										<tr>
											<td align="right">ลงวันที่แต่งตั้ง :&nbsp;</td>
											<td height="25" >
												<input name="appoint_date_start" id="appoint_date_start" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${param.appoint_date_start }"     />
												<a href="javascript:NewCssCal('appoint_date_start','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" /></a>&nbsp;ถึง&nbsp;
												<input name="appoint_date_end" id="appoint_date_end" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${param.appoint_date_end }"     />
												<a href="javascript:NewCssCal('appoint_date_end','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" /></a>
											</td>
											<td align="right">รหัสสายตรวจ :&nbsp;</td>
											<td height="25" >
												<input name="inspector_code" type="text" class="textBox" value="${param.inspector_code }" size="15" />
											</td>
										</tr>
										<tr>
											<td align="right">สังกัด :&nbsp;</td>
											<td height="25">
											   <c:if test="${IsAdmin == '1'}" >
												   <input type="text" name="offcode_dept" id="offcode_dept" size="4"  class="textbox"  value="${offcode_dept}" onBlur="getOffname(this.value,'Y',namecode_dept);" > 
												   <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
														onClick="window.open('process?action=Ed_office_pop&formname=namecode_dept&formcode=offcode_dept' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" >
												   <input type="text" name="namecode_dept" id="namecode_dept" size="16"  class="textview" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${namecode_dept}" >
											   </c:if>
											   <c:if test="${IsAdmin != '1'}" >
												   <input type="text" name="offcode_dept" id="offcode_dept" size="6"  class="textview" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();"  value="${offcode_dept}" >
												   <input type="text" name="namecode_dept" id="namecode_dept" size="20"  class="textview" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${namecode_dept}" >
											   </c:if>
											</td>
											<td align="right" >ชื่อหัวหน้าสาย :&nbsp;</td>
											<td height="25">
												<input name="staff_idcardno_leader" type="text" class="textBox" value="${param.staff_idcardno_leader }" size="30" />
											</td>
										</tr>
										<tr>
											<td align="right">สถานะคำสั่ง :&nbsp;</td>
											<td height="25" colspan="3">
											   <select name="status" style="width:100" >
											   	 <option value="" selected>ทั้งหมด</option>
											   	 <option value="1" >ใช้งาน</option>
											   	 <option value="0" >ยกเลิก</option>
											   </select>
											</td>
										</tr>
										<tr><td colspan="4" align="center">&nbsp;</td></tr>
										<tr>
											<td colspan="4" align="center"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">&nbsp;&nbsp;&nbsp;&nbsp;<img name="222" width="67" src="images/icn_clearsearch.jpg"  style="cursor:hand" alt="ล้างเงือนไข" onclick="clear2();" border="0" ></td>
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
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                  <td>&nbsp;</td>
                  <td >
                    <table border="0" width="1000" cellpadding="=0" cellspacing="0">
					 <tr>
					   <td>
					   	<a href="<c:url value="/process?action=InspectorTeamList_Master&cmd=add"/>" target="_self">เพิ่มข้อมูล</a>
						</td>
					 </tr>
					 <tr>
					   <td>&nbsp;</td>
					 </tr>
                      <tr>
                        <td >
                          <table class="tableList" width="900"   border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
							     <tr>
								     <td colspan="3" align="left"><%=pageUtil.getPagination()%></td><td align="right" colspan="4"><%=pageUtil.getPageStatus()%>	</td>
							     </tr>
								 <tr class="TblHeaderColumn">
								   <td width="50" >ลำดับ</td>
								  <td width="150" >เลขที่หนังสือแต่งตั้ง</td>
								  <td width="100" >วันที่แต่งตั้ง</td>
								  <td width="100" >รหัสสายตรวจ</td>
								  <td width="300" >สังกัด</td>
								  <td width="80">สถานะคำสั่ง</td>
								  <td width="50">&nbsp;</td>
								</tr>
								<c:forEach items="${inspec}"  var="inspeclist" varStatus="i">
								<c:if test="${(i.count % 2) == 1}">
								<tr class="TblRow">
									<td align="center">${i.count}</td>
								    <td align="center"><a href="<c:url value="process?action=InspectorTeamList_Master&cmd=view&id=${inspeclist.id}" />">${inspeclist.appoint_no }</a></td>
								    <td Align="Center">${inspeclist.appioont_date2}</td>
								    <td Align="Center">${inspeclist.inspector_code}</td>
									<td >${inspeclist.offname_dept }</td>
									<td Align="Center">${inspeclist.status_name}</td>
									<td Align="Center"><a href="<c:url value="process?action=InspectorTeamList_Master&cmd=copy&id=${inspeclist.id}" />"><img src="images/icn_copy.png" width="25" height="25" border="0" alt="คัดลอก" style="cursor:hand;"></a></td>
								</tr>
								</c:if>
								<c:if test="${(i.count % 2) == 0}">
								<tr class="TblRow bgRowGray">
									  <td align="center">${i.count}</td>
									  <td align="center"><a href="<c:url value="process?action=InspectorTeamList_Master&cmd=view&id=${inspeclist.id}" />">${inspeclist.appoint_no }</a></td>
									  <td Align="Center">${inspeclist.appioont_date2}</td>
									  <td Align="Center">${inspeclist.inspector_code}</td>
									  <td>${inspeclist.offname_dept }</td>
									  <td Align="Center">${inspeclist.status_name}</td>
									  <td Align="Center"><a href="<c:url value="process?action=InspectorTeamList_Master&cmd=copy&id=${inspeclist.id}" />"><img src="images/icn_copy.png" width="25" height="25" border="0" alt="คัดลอก" style="cursor:hand;"></a></td>
								</tr>
								</c:if>
								</c:forEach>
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
</form>