<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>

<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script LANGUAGE="JavaScript">
<!--
function confirmSubmit() {
var msg;
 msg= "คุณต้องการลบข้อมูล  ?" ;
var agree=confirm(msg);
if (agree)
return true ;
else
return false ;
}
function clear2(){
	window.location.href="process?action=NoticeArrest";
}
// -->
</script>
<form  action="process?action=NoticeArrest&cmd=find" method="post" >
	<table width="1000px"  border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="1%">&nbsp;</td>
			<td width="99%">&nbsp;</td>
		</tr>
		<tr>
			<td >&nbsp;</td>
			<td align="left"><span class="websitename">ใบแจ้งความนำจับ</span></td>
		</tr>
		<tr>
			<td >&nbsp;</td>
			<td>
				<a href="<c:url value="process?action=NoticeArrest&cmd=add"/> "
				class="linkmenu3level"
				onClick="writeTranLog('เพิ่มข้อมูลใบแจ้งความนำจับ')">เพิ่มข้อมูล</a>
			</td>
		</tr>
		<tr>
			<td >&nbsp;</td>
			<td >&nbsp;</td>
		</tr>
		<tr>
			<td >&nbsp;</td>
			<td >
				<table width="700" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
					<tr>
						<td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img
							src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
						<td width="98%"></td>
						<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img
							src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
					</tr>
					<tr>
						<td height="40">&nbsp;</td>
						<td align="center" valign="top">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="100%" height="25" align="left" valign="top"><span
									class="sectionname">ค้นหา</span></td>

							</tr>
							<tr>
								<td align="left" valign="top">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td>
										<table width="100%" border="0" cellspacing="0"
											cellpadding="0">
											<tr>
												<td width="20%" align="right">วันที่รับแจ้งความ
												:&nbsp;</td>
												<td width="30%"><input type="Text" id="notice_date"
													name="notice_date" value="${param.notice_date }" size="12" class="textdate"
													readonly /> <a href="javascript:NewCssCal('notice_date','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" border="0" ></a>&nbsp;</td>
												<td width="10%" align="right">พ.ร.บ. :&nbsp;</td>
												<td width="40%"><select name="legislation_id"
													id="legislation_id" class="select"
													OnChange="selectLegislation('cmbLegislation');"
													style="width:200px">
													<option value="">เลือก</option>
													<c:forEach items="${lglist}" var="lg">
														<option value="${lg.id}"
															<c:if test="${param.legislation_id == lg.id}"> selected </c:if>>
														${lg.legislation_name}</option>
													</c:forEach>
												</select></td>
											</tr>
											<tr>
												<td align="right">เลขที่บันทึกแจ้งความ :&nbsp;</td>
												<td><input name="notice_no" type="text" size="27"
													maxlength="20" class="textinput" value="${param.notice_no}" ></td>
												<td align="right">สินค้า :&nbsp;</td>
												<td><select name="duty_code" id="duty_code"
													class="select" style="width:200px">
												
													<option value="" >เลือก</option>
							<c:forEach var="dt" items="${dtlist}">
								<option value="${dt.group_id}"
									<c:if test="${dt.group_id == param.duty_code}"> selected </c:if>>
								${dt.group_name}</option>
							</c:forEach>
												</select></td>
											</tr>
											
											
											<tr>
												<td align="right">หน่วยงาน :&nbsp;</td>
												<td >
													<c:if test="${IsAdmin == '1'}">
														<input id="offname1" name="offname1" type="text" size="20"  class="textinput" value="${param.offname1 }"  >
														<img src="images/btn_browse.png" width="18" height="19"
														border="0" style="cursor: hand"
														onClick="window.open('process?action=Ed_office_pop&formname=offname1&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');">
														<input id="offcode" name="offcode" type="hidden" value="">
													</c:if>
													<c:if test="${IsAdmin == '0'}">
														<input id="offname1" name="offname1" type="text" size="31"  class="textview" value="${offname }" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
														<input id="offcode" name="offcode" type="hidden" value="">
													</c:if>
												</td>
												<td align="right">ชื่อ(นามแฝง) ผู้แจ้ง :&nbsp;</td>
												<td ><input name="infrom_name" type="text"
													size="20" maxlength="70" class="textinput" value="${param.infrom_name }" ></td>
										   </tr>
										   <tr>
												<td align="right">ชื่อผู้กระทำผิด :&nbsp;</td>
												<td ><input name="lawbraker_name" type="text"
													size="27" class="textinput" value="${param.lawbraker_name }" ></td>
										 
												<td align="right">ชื่อผู้รับแจ้ง :&nbsp;</td>
												<td ><input name="staff_name_recive" type="text"
													size="20" class="textinput" value="${param.staff_name_recive }" ></td>
										   </tr>
										   <tr>
												<td align="right">ข้อกล่าวหา :&nbsp;</td>
												<td colspan="3"><input name="guilt_base" type="text"
													size="65" maxlength="70" class="textinput" value="${param.guilt_base }" ></td>
												</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td align="center" colspan="4">
											<input type="image" src="images/btn_search_big.png" width="65" height="23" border="0" onclick="writeTranLog('ค้นหาข้อมูลใบแจ้งความนำจับ')" >
											<%@ include file="../Templates/clearIcon.jsp"%>
										</td>
									</tr>
									
								   </table>
								</td>
							</tr>
							
						</table>

						</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align="left" valign="bottom" bgcolor="#FFFFFF">
							<img src="images/pic_angleSearch_left_bottom.png" width="10" height="8">
						</td>
						<td></td>
						<td align="right" valign="bottom" bgcolor="#FFFFFF">
							<img src="images/pic_angleSearch_right_bottom.png" width="10" height="8">
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
			<td >&nbsp;</td>
		</tr>
	</table>
</form>

	<table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
		<tr  align="left" valign="top">
			<td colspan="6"><%=pageUtil.getPagination()%></td>
			<td colspan="6" align="right"><%=pageUtil.getPageStatus()%>	</td>
		</tr>
		<tr>
			<td width="30" class="TblHeaderColumn">ลำดับ</td>
			<td width="96" height="16" class="TblHeaderColumn">เลขที่</td>
			<td width="100" class="TblHeaderColumn ">หน่วยงาน</td>
			<td width="113" class="TblHeaderColumn ">วันที่รับแจ้งความ</td>
			<td width="100" class="TblHeaderColumn ">พ.ร.บ.</td>
			<td width="200" class="TblHeaderColumn ">ความผิดฐาน</td>
			<td width="60" class="TblHeaderColumn ">สินค้า</td>
			<td width="98" class="TblHeaderColumn ">ชื่อผู้แจ้ง</td>
			<td width="98" class="TblHeaderColumn ">ชื่อผู้รับแจ้ง</td>
			<td width="98" class="TblHeaderColumn ">ชื่อผู้กระทำผิด</td>
			<td width="98" class="TblHeaderColumn ">สถานที่</td>
			<td width="66" class="TblHeaderColumn AlignCenter">จังหวัด</td>
			<td width="66" class="TblHeaderColumn AlignCenter">&nbsp;</td>
		</tr>
		<c:if test="${rowCount=='0'}" >
			<tr><td colspan="13" align="center">ไม่พบรายการที่ค้นหา</td></tr>
		</c:if>
		<c:forEach items="${anamap}"  var="anaa" varStatus="i">
		<tr>
			<td class="TblRow AlignCenter">${i.count+_rowIndex }</td>
			<td class="TblRow AlignCenter">
				<a href="process?action=NoticeArrest&cmd=view&id=${anaa.id}" class="linkmenu3level">${anaa.notice_no }</a>
			</td>
			<td class="TblRow AlignLeft">${anaa.offname }</td>
			<td class="TblRow AlignLeft">${anaa.notice_date2 }</td>
			<td class="TblRow AlignLeft">${anaa.legislation_name }</td>
			<td class="TblRow AlignLeft">${anaa.guilt_base }</td>
			<td class="TblRow AlignLeft">${anaa.duty_name }</td>
			<td class="TblRow AlignLeft">${anaa.inform_name }</td>
			<td class="TblRow AlignLeft">${anaa.staff_name_receive }</td>
			<td class="TblRow AlignLeft">${anaa.lawbreaker_name }</td>
			<td class="TblRow AlignLeft">${anaa.lawbreaker_addr }</td>
			<td class="TblRow AlignLeft">${anaa.province_name }</td>
			<td class="TblRow AlignCenter">
				<a href="process?action=NoticeArrest&cmd=delete&id=${anaa.id }" title="ลยรายการ" onclick="return confirmSubmit();">
					<img src="images/icon_delete.gif" width="25" height="25" border="0"/>
				</a> 
			</td>
		</tr>	
		</c:forEach>					
		<tr>
			<td colspan="12">&nbsp;</td>
		</tr>
	</table>



