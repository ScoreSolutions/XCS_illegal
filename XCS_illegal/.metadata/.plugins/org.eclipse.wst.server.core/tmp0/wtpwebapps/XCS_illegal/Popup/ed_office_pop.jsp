<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>

<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>
<html xmlns="http://www.w3.org/1999/xhtml">

<HEAD>
<base target="_self" />
<title>รายชื่อหน่วยงาน : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript">
function sendvalue(offcode,offname){
      if("${ed_offname}" != ""){
      opener.document.getElementById("${ed_offname}").value=offname;}
      if("${compare_office}" != ""){
      opener.document.getElementById("${compare_office}").value=offcode;}
	opener.focus();
	self.close();
}
</script>
</HEAD>

<BODY>


<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
       <tr>
         <td colspan="6"></td>
       </tr>
       <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			<td width="30%" class="TblHeaderColumn">รหัสหน่วยงาน</td>
			<td width="30%" class="TblHeaderColumn">ชื่อเต็ม</td>
			<td width="30%" class="TblHeaderColumn">ชื่อย่อ</td>
	  </tr>
	  <c:forEach items="${eds}"  var="ed" varStatus="i">
			<tr>
			<td class="TblRow aligncenter">${i.count}</td>
			<td height="25" align="left" valign="top" class="TblRow AlignCenter"><a href="#" onClick="sendvalue('${ed.offcode}','${ed.short_name}')">${ed.offcode}</a></td>
			<td align="left" valign="top" class="TblRow AlignCenter"><span class="TblRow AlignLeft">${ed.offname}</span></td>
			<td align="left" valign="top" class="TblRow AlignCenter"><span class="TblRow AlignLeft">${ed.short_name}</span></td>
			</tr>
  	  </c:forEach>
</table>

</BODY>
</HTML>
