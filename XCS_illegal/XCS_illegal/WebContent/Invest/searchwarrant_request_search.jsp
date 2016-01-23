<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>

<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript" language="JavaScript"
	src="script/Popup.js"></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<script type='text/javascript' src='<c:url value="dwr/interface/SelectRegion.js"/>'></script>
<script type='text/javascript' src='<c:url value="dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="dwr/util.js"/>'></script>
<script type='text/javascript'>
init();
function init(){
	getProvince('province','district','tambol','${param.province_code}','${param.district_code}','${param.subdistrict_code}');
}
</script>
<script type="text/JavaScript">
<!--
function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}
//-->
</script>
<script LANGUAGE="JavaScript">

function clear2(){
	window.location.href="process?action=Warrant";
}

function btDelete(id)
{
var answer = confirm ("ยืนยันการลบข้อมูล");
	if (answer){
	window.location.href="process?action=Warrant&id="+id+"&cmd=delete";
	}
	else{
	}
}
</script>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="1%">&nbsp;</td>
		<td width="99%"><span class="websitename">จัดทำหมายค้น</span></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td >
			<span class="spanLink" onClick="window.location.href='process?action=Warrant&cmd=add';writeTranLog('เพิ่มข้อมูลหมายค้น')">เพิ่มข้อมูลใหม่ </span>
			<br />
			
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>
			<form action="process?action=Warrant&cmd=findWarrant" name="find" method="post">
				<table width="800" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
					<tr>
						<td>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">
								<tr>
									<td width="1%" align="left" valign="top"></td>
									<td width="98%"></td>
									<td width="1%" align="right" valign="top"></td>
								</tr>
								<tr>
									<td height="40">&nbsp;</td>
									<td align="center" valign="top">
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td height="25" align="left" valign="top" colspan="4">
													<span class="sectionname">ค้นหาข้อมูล</span>
												</td>
											</tr>
											<tr>
												<td width="20%"  align="right" valign="middle">เลขที่ใบคำร้อง :&nbsp;</td>
												<td width="30%" align="left" valign="middle">
													<input name="request_no" type="text" class="textbox textboxAlignRight" value="${param.request_no }" size="28" />
												</td>
												<td width="20%" align="right" valign="middle">ชื่อเจ้าของบ้าน :&nbsp;</td>
												<td width="30%" align="left" valign="middle">
													<input name="owner_name" type="text" class="textbox" value="${param.owner_name }" size="28">
												</td>
											</tr>
											<tr>
												<td align="right" valign="middle">ศาล :&nbsp;</td>
												<td  align="left" valign="middle">
													<select name="court_id" id="court" style="width: 200px;" >
														<option value="" selected>เลือก</option>
														<c:forEach items="${clist}" var="court">
															<option value=${court.id}  <c:if test="${court.id == param.court_id}">  selected </c:if>>${court.court_name}</option>
														</c:forEach>
													</select>
												</td>
												<td align="right">จังหวัด :&nbsp;</td>
												<td align="left">
													<select id='province' name="province_code" style="width:200px" onchange="getDistrict('district','tambol',this.value)">
												</select></td>
											</tr>
											<tr>
												<td align="right" valign="middle">ชื่อผู้ร้อง :&nbsp;</td>
												<td align="left" valign="middle">
													<input name="name_request" type="text" class="textbox textboxAlignRight" value="${param.name_request}" size="28" />
												</td>
												<td align="right">อำเภอ :&nbsp;</td>
												<td align="left">
													<select id='district'  name="district_code" style="width:200px" onchange="getTambol('tambol',this.value,'')"></select>
												</td>
											</tr>
											<tr>
												<td align="right" valign="middle">วันที่ขอคำร้อง:&nbsp;</td>
												<td align="left" valign="middle">
													<input id="request_date_start" name="request_date_start" type="text" class="textdate" readonly value="${param.request_date_start }" /> 
													<img onclick="javascript:NewCssCal('request_date_start','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
													 - 
													<input id="request_date_stop" name="request_date_stop" type="text" class="textdate" readonly value="${param.request_date_stop }" />
													<img onclick="javascript:NewCssCal('request_date_stop','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
												</td>
												<td height="25" align="right">ตำบล :&nbsp;</td>
												<td align="left">
													<select id='tambol' name="subdistrict_code" style="width:200px" ></select>
												</td>
											</tr>
											<tr>
												<td align="right">สถานะ :&nbsp;</td>
												<td colspan="3" align="left">
													<select name="status" style="width: 200px;">
														<option value="" selected>ทั้งหมด</option>
														<option value="1" <c:if test="${param.status == '1'}">  selected </c:if>>รออนุมัติหมายค้น</option>
														<option value="2" <c:if test="${param.status == '2'}">  selected </c:if>>ศาลอนุมัติหมายค้น</option>
														<option value="3" <c:if test="${param.status == '3'}">  selected </c:if>>ศาลไม่อนุมัติหมายค้น</option>
													</select>
												</td>
											</tr>
											<tr>
												<td colspan="4" align="center" valign="bottom">
													<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit" onclick="writeTranLog('บันทึกรายงานการสืบสวน')">
													<%@ include file="../Templates/clearIcon.jsp"%>
												</td>
											</tr>
										</table>
									</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td align="left" valign="bottom" height="10"></td>
									<td></td>
									<td align="right" valign="bottom"></td>
								</tr>
							</table>
						</td>
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
			<table class="tableList" width="980" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC" >
				<tr  align="left" valign="top">
					<td colspan="5"><%=pageUtil.getPagination()%></td>
					<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
				</tr>
				<tr>
					<td width="5%" class="TblHeaderColumn">ลำดับ</td>
					<td width="5%" class="TblHeaderColumn">เลขที่คำร้อง</td>
					<td width="15%" class="TblHeaderColumn">ศาล</td>
					<td width="10%" class="TblHeaderColumn">วันที่ขอ</td>
					<td width="10%" class="TblHeaderColumn">ชื่อผู้ร้อง</td>
					<td width="30%" class="TblHeaderColumn">ชื่อเจ้าของบ้าน -ที่อยู่</td>
					<td width="20%" class="TblHeaderColumn">เหตุให้ออกหมายค้น</td>
					<td whdth="5%" class="TblHeaderColumn">&nbsp;</td>
				</tr>
				<c:if test="${rowCount == '0'}" >
					<tr><td colspan="7" align="center">ไม่พบรายการที่ค้นหา</td></tr>
				</c:if>
				<c:forEach items="${aswmap}" var="asw" varStatus="i">
					<tr class='<c:if test="${(i.count % 2)!='1'}">bgRowGray</c:if>' >
						<td  align="center">${i.count+_rowIndex}</td>
						<td >
							<a href="process?action=Warrant&cmd=view&id=${asw.application_search_warrant_id}" onclick="writeTranLog('แสดงรายละเอียดหมายค้น')" >${asw.request_no}</a>
						</td>
						<td >${asw.court_name }</td>
						<td  align="center">${asw.request_date2 }</td>
						<td >${asw.staff_name_req }</td>
						<td >${asw.owner_address  } </td>
						<td >${asw.search_cause }</td>
						<td >
							<c:if test="${asw.status == '1'}">
		                      	<img src="images/icon_delete.gif" width="25" height="25" border="0" title="ลบรายการ" style="cursor:hand;" onclick = 'btDelete("${asw.application_search_warrant_id}");'>
		                    </c:if>
						</td>
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




