<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<%
	PageUtil pageUtil = new PageUtil(request);
%>
<script language="javascript" type="text/javascript">

function clear2(){
	window.location.href="process?action=ExhibitReceive&menu=true";
}
</script>
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%" align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="1%">&nbsp;</td>
				<td width="99%"><span class="websitename">การตรวจรับของกลาง</span></td>
			</tr>
			<tr>
				<td height="25">&nbsp;</td>
				<td><a href="process?action=ExhibitReceive&cmd=create" class="linkmenu3level">เพิ่มข้อมูล</a></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				<form action="process?action=ExhibitReceive&cmd=list" name="exhibit_form" method="post">
				<table width="750" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
					<tr>
						<td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
						<td width="98%"></td>
						<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
					</tr>
					<tr>
						<td height="40">&nbsp;</td>
						<td align="center" valign="top">
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="51%" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
								<td width="49%">&nbsp;</td>
							</tr>
							<tr>
								<td align="left" valign="top">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="7%" align="right">&nbsp;</td>
										<td width="28%" align="right">พ.ร.บ. :&nbsp;</td>
										<td width="65%" height="25">
											<select name="legislation_id" style="width:250">
		            							<option value="" selected>ทั้งหมด</option>
		            							<c:forEach items="${ltlist}" var="legis">
		            							<option value="${legis.id}" <c:if test="${param.legislation_id == legis.id}">selected</c:if> >${legis.legislation_name}</option>
		            							</c:forEach>
		                                    </select>
										</td>
									</tr>
									<tr>
										<td align="right">&nbsp;</td>
										<td align="right">วันที่นำส่ง:&nbsp;</td>
										<td height="27">
											<input type="Text" id="delivery_date_from" name="delivery_date_from" size="12" class="textdate" value="${param.delivery_date_from}" readonly="true"/>  
											<a href="javascript:NewCssCal('delivery_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a> 
											<input type="Text" id="delivery_date_to" name="delivery_date_to" size="12" class="textdate" value="${param.delivery_date_to}" readonly="true"/>  
											<a href="javascript:NewCssCal('delivery_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
										</td>
									</tr>
									<tr>
										<td align="right">&nbsp;</td>
										<td align="right">สถานที่จัดเก็บ :&nbsp;</td>
										<td height="25"><input name="location" type="text" size="25" maxlength="20" value="${param.location}"></td>
									</tr>
								</table>
								</td>
								<td align="right" valign="top">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="30%" height="25" align="right">เลขที่หนังสือนำส่ง :&nbsp;</td>
										<td width="70%" align="left"><input name="delivery_code" type="text" size="20" maxlength="20" value="${param.delivery_code}"></td>
									</tr>
									<tr>
										<td height="25" align="right">เลขที่งานรับ :&nbsp;</td>
										<td align="left"><input name="stockin_code" type="text" size="20" maxlength="20" value="${param.stockin_code}"></td>
									</tr>

									<tr>
										<td height="25" align="right">สถานะ :&nbsp;</td>
										<td align="left">
											<select name="status" id="status" style="width: 190px;">
												<option value="" <c:if test="${param.status == ''}">selected</c:if>>ทั้งหมด</option>
												<option value="1" <c:if test="${param.status == '1'}">selected</c:if>>ทำรายการ</option>
												<option value="2" <c:if test="${param.status == '2'}">selected</c:if>>ตรวจรับแล้ว</option>
											</select>
										</td>
									</tr>
									<tr>
										<td align="right">จากหน่วยงาน :&nbsp;</td>
										<td align="left">
											<input type="text" name="offcode_from" size="4" class="textbox" value="${param.offcode_from}">
		                       				<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
		                            			onClick="window.open('process?action=Ed_office_pop&formname=offname_from&formcode=offcode_from' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" >
		                       				<input type="text" name="offname_from" size="16"  class="textbox" value="${param.offname_from}">
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="25" colspan="2" align="center"><input alt="Submit Form" type="image" src="images/btn_search_big.png" width="64" height="22" name="search"><%@ include file="../Templates/clearIcon.jsp"%></td>
							</tr>
						</table>
						</td>
						<td>&nbsp;</td>
					</tr>
					<!-- 
					<tr>
						<td height="8" align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8">
						</td>
						<td></td>
						<td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
					</tr>
					-->
					<tr>
						<td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
						<td></td>
						<td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
					</tr>
				</table>
				</form>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				<table class="tableList" width="900" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
				<tr  align="left" valign="top">
					<td colspan="6"><%=pageUtil.getPagination()%></td>
					<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
				</tr>
				<tr>
					<td width="50" class="TblHeaderColumn">ลำดับที่</td>
					<td width="80" class="TblHeaderColumn">เลขที่งานรับ</td>
					<td width="80" class="TblHeaderColumn">วันที่รับ</td>
					<td width="80" class="TblHeaderColumn">เลขที่นำส่ง</td>
					<td width="74" class="TblHeaderColumn">วันที่นำส่ง</td>
					<td width="90" class="TblHeaderColumn">พ.ร.บ.</td>
					<td width="98" class="TblHeaderColumn">หน่วยงานที่นำส่ง</td>
					<td width="98" class="TblHeaderColumn">สถานะ</td>
				</tr>
				<c:forEach items="${stockReceiveList}" var="sr" varStatus="i">
				<c:set var="orderBase" value="<%=(pageUtil.getPage()-1)*pageUtil.getPageSize()%>" scope="page" />
				<tr>
					<td class="TblRow AlignCenter">${orderBase+i.count}</td>
					<td class="TblRow AlignLeft"><a href="process?action=ExhibitReceive&cmd=preup&id=${sr.stockin_id}">${sr.stockin_code}</a></td>
					<td class="TblRow AlignLeft">${sr.stockin_date2}</td>
					<td class="TblRow AlignLeft">${sr.delivery_code}</td>
					<td class="TblRow AlignLeft">${sr.delivery_date2} </td>
					<td class="TblRow AlignLeft">${sr.legislation_name}</td>
					<td class="TblRow AlignLeft">${sr.offname_from }</td>
					<td class="TblRow AlignLeft">${sr.status_name}</td>
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