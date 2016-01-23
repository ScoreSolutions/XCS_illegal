<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<%
	PageUtil pageUtil = new PageUtil(request);
%>
<script language="javascript" type="text/javascript">

function clear2(){
	window.location.href="process?action=ExhibitReturn&menu=true";
}
</script>
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%" align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="1%">&nbsp;</td>
				<td width="99%"><span class="websitename">การคืนของกลาง</span></td>
			</tr>
			<tr>
				<td height="25">&nbsp;</td>
				<td><a href="process?action=ExhibitReturn&cmd=create" class="linkmenu3level">เพิ่มข้อมูล</a></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				<form action="process?action=ExhibitReturn&cmd=list" name="exhibit_form" method="post">
				<table width="700" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
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
								<td width="54%" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
								<td width="46%">&nbsp;</td>
							</tr>

							<tr>
								<td align="left" valign="top">
								<table width="99%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="7%" align="right">&nbsp;</td>
										<td width="46%" align="right">เลขที่ใบเสร็จ :&nbsp;</td>
										<td width="47%" height="25"><input name="stockout_code" type="text" size="20" maxlength="20" value="${param.stockout_code}"></td>
									</tr>
									<tr>
										<td align="right">&nbsp;</td>
										<td align="right">พ.ร.บ. :&nbsp;</td>
										<td height="25">
											<select name="legislation_id" style="width:250">
		            							<option value="" selected>ทั้งหมด</option>
		            							<c:forEach items="${ltlist}" var="legis">
		            							<option value=${legis.id} <c:if test="${param.legislation_id == legis.id}">selected</c:if>>${legis.legislation_name}</option>
		            							</c:forEach>
		                                    </select>
										</td>
									</tr>
									<tr>
										<td align="right">&nbsp;</td>
										<td align="right">&nbsp;</td>
										<td height="25">
											<input alt="Submit Form" type="image" src="images/btn_search_big.png" width="64" height="22" name="search"><%@ include file="../Templates/clearIcon.jsp"%>
										</td>
									</tr>
								</table>
								</td>
								<td align="right" valign="top">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="43%" height="25" align="right">วันที่ :&nbsp;</td>
										<td width="57%" align="left">
											<input type="Text" id="stockout_date" name="stockout_date" size="12" class="textdate" value="${param.stockout_date}" readonly/>  
											<a href="javascript:NewCssCal('stockout_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
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
				<table class="tableList" width="650" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
					<tr  align="left" valign="top">
						<td colspan="4"><%=pageUtil.getPagination()%></td>
						<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
					</tr>
					<tr>
						<td width="55" class="TblHeaderColumn AlignCenter">ลำดับ</td>
						<td width="100" class="TblHeaderColumn">เลขที่ใบเสร็จ กค.</td>
						<td width="100" class="TblHeaderColumn">วันที่</td>
						<td width="100" class="TblHeaderColumn">พ.ร.บ.</td>
						<td width="150" class="TblHeaderColumn">เรื่อง</td>
						<td width="100" class="TblHeaderColumn">เรียน</td>
					</tr>
					<c:forEach items="${soList}" var="so" varStatus="i">
					<c:set var="orderBase" value="<%=(pageUtil.getPage()-1)*pageUtil.getPageSize()%>" scope="page" />
					<tr>
						<td class="TblRow AlignCenter">${orderBase+i.count}</td>
						<td class="TblRow AlignLeft"><a href="process?action=ExhibitReturn&cmd=edit&id=${so.id}&display=true">${so.stockout_code}</a></td>
						<td class="TblRow AlignLeft"><fmt:formatDate value="${so.stockout_date}" pattern="dd/MM/yyyy"/></td>
						<td class="TblRow AlignLeft">${so.legislation_name}</td>
						<td class="TblRow AlignLeft">${so.subject}</td>
						<td class="TblRow AlignLeft">${so.learn_staff}</td>
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