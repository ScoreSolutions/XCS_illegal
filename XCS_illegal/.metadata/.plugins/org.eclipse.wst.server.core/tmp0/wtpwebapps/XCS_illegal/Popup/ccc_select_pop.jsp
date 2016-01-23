<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ include file="/Templates/meta.jsp" %>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html xmlns="http://www.w3.org/1999/xhtml">

<HEAD>
<base target="_self" />
<title>เลือกคดีเปรียบเทียบปรับ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript">
var opener = window.dialogArguments;
function sendvalue(ccvalue){
    opener.changeForm(ccvalue);
	opener.focus();
	self.close();
}
</script>
</HEAD>

<BODY>

<form id='formPopup' action="<c:url value="/process?action=CompareCaseChange&cmd=openCompareCasePopup" />" method="post" name="searchstaff">
	<table border="0" cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td colspan="2"><span class="websitename" >เลือกคดีเปรียบเทียบปรับ</span></td>
		</tr>
		<tr>
			<td colspan="2"><hr /></td>
		</tr>
		<tr style="display:none">
			<td colspan="2">
				<input name="btnSave"  type="button" class="barbutton" value="ไม่เลือกรายการ" onClick="txtclear();">
			</td>
		</tr>
		<tr>
			<td align="right" width="30%">เลขที่คดีเปรียบเทียบปรับ : </td>
			<td width="70%">
				<input name="txtCompareCaseNo" id="txtCompareCaseNo" type="text" class="text"  size="25" value="${compare_case_no}">
				<input type="hidden" name="legislation_id" id="legislation_id" value="${legislation_id}"></input>
				<input type="hidden" name="reward_request" id="reward_request" value="${reward_request}"></input>
			</td>
		</tr>
		<tr>
			<td align="right">&nbsp;</td>
			<td >
				<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
			</td>
		</tr>
	</table>
</form>
<br />

<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
       <tr  align="left" valign="top">
			<td colspan="2"><%=pageUtil.getPagination()%></td>
			<td colspan="3" align="right"><%=pageUtil.getPageStatus()%>	</td>
	   </tr>
       <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			<td width="20%" class="TblHeaderColumn">เลขที่คดีเปรียบเทียบปรับ</td>
			<td width="20%" class="TblHeaderColumn">ค่าปรับคดี</td>
			<td width="20%" class="TblHeaderColumn">จำนวนผู้ต้องหา</td>
			<td width="20%" class="TblHeaderColumn">ที่ทำการเปรียบเทียบ</td>
	  </tr>
	  <c:forEach items="${ccList}"  var="cc" varStatus="i">
		<tr>
			<td class="TblRow aligncenter">${i.count}</td>
			<td height="25" align="left" valign="top" class="TblRow AlignCenter"><a href="#" onClick="sendvalue('${cc.id}')">${cc.compare_case_no}</a></td>
			<td align="left" valign="top" class="TblRow AlignCenter"><span class="TblRow AlignLeft">${cc.case_fine}</span></td>
			<td align="left" valign="top" class="TblRow AlignCenter"><span class="TblRow AlignLeft">${cc.lawbreaker_qty }</span></td>
			<td align="left" valign="top" class="TblRow"><span class="TblRow AlignLeft">${cc.compare_offname }</span></td>
		</tr>
  	  </c:forEach>
</table>

</BODY>
</HTML>
