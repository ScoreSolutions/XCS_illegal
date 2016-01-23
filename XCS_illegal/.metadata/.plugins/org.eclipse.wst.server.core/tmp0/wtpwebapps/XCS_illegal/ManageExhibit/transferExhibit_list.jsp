<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<%
	PageUtil pageUtil = new PageUtil(request);
%>
<script language="javascript" type="text/javascript">

function clear2(){
	window.location.href="process?action=ExhibitTransfer&menu=true";
}
</script>
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%" align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="1%">&nbsp;</td>
				<td width="99%"><span class="websitename">การโอนสินค้าของกลาง</span></td>
			</tr>
			<tr>
				<td height="25">&nbsp;</td>
				<td><a href="process?action=ExhibitTransfer&cmd=create" class="linkmenu3level">เพิ่มข้อมูล</a></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				<table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
					<tr>
						<td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
						<td width="98%"></td>
						<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
					</tr>
					<tr>
						<td height="40">&nbsp;</td>
						<td align="center" valign="top">
						<form action="process?action=ExhibitTransfer&cmd=list" name="exhibit_form" method="post">
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="51%" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
								<td width="49%">&nbsp;</td>
							</tr>
							<tr>
								<td align="left" valign="top" colspan="2">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="20%" height="25" align="right">เลขที่หนังสือส่ง :&nbsp;</td>
										<td width="30%"><input name="stockout_code" type="text" size="20" maxlength="20" value="${param.stockout_code}"></td>
										<td width="20%" align="right">วันที่โอน :&nbsp;</td>
										<td width="30%" height="27">
											<input type="Text" id="stockout_date_from" name="stockout_date_from" size="12" class="textdate" value="${param.stockout_date_from}" readonly="true"/> 
											<a href="javascript:NewCssCal('stockout_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
											<input type="Text" id="stockout_date_to" name="stockout_date_to" size="12" class="textdate" value="${param.stockout_date_to}" readonly="true"/> 
											<a href="javascript:NewCssCal('stockout_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
										</td>
									</tr>
									<tr>
										<td align="right">พ.ร.บ. :&nbsp;</td>
										<td height="25">
											<select name="legislation_id" style="width: 250">
												<option value="" selected>ทั้งหมด</option>
												<c:forEach items="${ltlist}" var="legis">
													<option value="${legis.id}" <c:if test="${param.legislation_id == legis.id}">selected</c:if> >${legis.legislation_name}</option>
												</c:forEach>
											</select>
										</td>
										<td height="25" align="right">ชื่อผู้นำส่ง :&nbsp;</td>
										<td><input name="transfer_staff" type="text" size="20" value="${param.transfer_staff}"></td>
									</tr>
									<tr>
										<td height="25" align="right">สถานะ :&nbsp;</td>
										<td >
											<select name="so_status" id="so_status" style="width: 190px;">
												<option value="" <c:if test="${param.so_status == ''}">selected</c:if>>ทั้งหมด</option>
												<option value="1" <c:if test="${param.so_status == '1'}">selected</c:if>>ทำรายการ</option>
												<option value="2" <c:if test="${param.so_status == '2'}">selected</c:if>>นำส่งแล้ว</option>
												<option value="3" <c:if test="${param.so_status == '3'}">selected</c:if>>ตรวจรับแล้ว</option>
											</select>
										</td>
										<td align="right">ไปยังหน่วยงาน :&nbsp;</td>
										<td ><input name="offname_to" type="text" size="20" value="${param.offname_to}"></td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="25" colspan="2" align="center"><input alt="Submit Form" type="image" src="images/btn_search_big.png" width="64" height="22" name="search"><%@ include file="../Templates/clearIcon.jsp"%></td>
							</tr>
						</table>
						</form>
						</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td height="8" align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
						<td></td>
						<td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				<table class="tableList" width="800" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
					<tr  align="left" valign="top">
						<td colspan="4"><%=pageUtil.getPagination()%></td>
						<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
					</tr>
					<tr>
						<td width="50" class="TblHeaderColumn">ลำดับที่</td>
						<td width="120" class="TblHeaderColumn">เลขที่หนังสือนำส่ง</td>
						<td width="80" class="TblHeaderColumn">วันที่โอน</td>
						<td width="90" class="TblHeaderColumn">พ.ร.บ.</td>
						<td width="100" class="TblHeaderColumn">ชื่อผู้นำส่ง</td>
						<td width="80" class="TblHeaderColumn">สถานะ</td>
					</tr>
					<c:forEach items="${soList}" var="so" varStatus="i">
					<c:set var="orderBase" value="<%=(pageUtil.getPage()-1)*pageUtil.getPageSize()%>" scope="page" />
					<tr>
						<td class="TblRow AlignCenter">${orderBase+i.count}</td>
						<td class="TblRow AlignLeft"><a href="process?action=ExhibitTransfer&cmd=edit&id=${so.id}&display=true">${so.stockout_code}</a></td>
						<td class="TblRow AlignLeft"><fmt:formatDate value="${so.stockout_date}" pattern="dd/MM/yyyy"/></td>
						<td class="TblRow AlignLeft">${so.legislation_name}</td>
						<td class="TblRow AlignLeft">${so.learn_staff}</td>
						<td class="TblRow AlignLeft">${so.status_name}</td>
					</tr>
					</c:forEach>
				</table>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
		</td>
	</tr>
</table>