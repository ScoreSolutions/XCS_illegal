<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<HEAD>
<base target="_self" />
<title>เลขที่หมายค้น : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>

<script type="text/javascript">
function sendvalue(vWarrantNo,vWarrantID){
   

     if("${warrantno}"!=""){
      opener.document.getElementById("${warrantno}").value=vWarrantNo;
      }
      if("${id}"!=""){
      opener.document.getElementById("${id}").value=vWarrantID;
      }
   
	opener.focus();
	self.close();
}


function clearfield(){
	if("${warrantno}"!=""){
     opener.document.getElementById("${warrantno}").value="";
     }
     if("${id}"!=""){
     opener.document.getElementById("${id}").value="";
     }
	opener.focus();
	self.close();
}
</script>

</HEAD>

<BODY>
<form id='formPopupWaarant' action="<c:url value="/process?action=Searchwarrant_pop&cmd=list"/>" method="post" name="formPopupWaarant">
<input type="hidden" name="warrantno" value="${warrantno}"></input>
<input type="hidden" name="id" value="${id}" ></input>
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >เลขที่หมายค้น</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2">
				<input name="btnSelect"  type="button" class="barButton" value="ไม่เลือกรายการ" onclick = "clearfield();" >
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td  align="right">เลขที่หมายค้น : </td>
		<td >
			<input name="warrant_start" value="${param.warrant_start}" type="text" class="textbox" size="20" />&nbsp;&nbsp;&nbsp;&nbsp;
               ถึง :&nbsp;
               <input name="warrant_end" value="${param.warrant_end}" type="text" class="textbox" size="20" />
		</td>
	</tr>
	<tr>
		<td  align="right">วันที่ออกหมายค้น : </td>
		<td >
			<input name="date_start" id="date_start" value="${param.date_start}" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('date_start','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absmiddle" style="border-style: none"  /></a>&nbsp;&nbsp;&nbsp;&nbsp;
               ถึง :&nbsp;
			<input name="date_end" id="date_end" value="${param.date_end}" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('date_end','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absmiddle" style="border-style: none"  /></a>
		</td>
	</tr>
     <tr>
		<td width="30%"  align="right">ชื่อเจ้าของบ้าน : </td>
		<td width="70%">
            <input name="OWNER_name" value="${param.OWNER_name}" type="text" class="text"  size="50" />
		</td>
	</tr>
	<tr>
		<td  align="right">ชื่อผู้พิพากษา : </td>
		<td >
			<input name="JEDGE_name" value="${param.JEDGE_name}" type="text" class="text"  size="50">
		</td>
	</tr>
	<tr>
		<td align="right">&nbsp;</td>
		<td ><!--
			<img src="../images/btn_search_big.png" width="64" height="22">
			-->
			<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
		</td>
	</tr>
</table>
</form>
<br />
<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
       <tr  align="left" valign="top">
<td colspan="3"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
       <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			<td width="15%" class="TblHeaderColumn">เลขที่หมายค้น</td>
			<td width="20%" class="TblHeaderColumn">วันที่ออกหมายค้น</td>
               <td width="30%" class="TblHeaderColumn">เจ้าของบ้าน</td>
			<td width="30%" class="TblHeaderColumn">ผู้พิพากษา</td>
	  </tr>
	  <c:forEach items="${wrList}"  var="wr" varStatus="i">
	  		<c:if test="${(i.count % 2) == 1}">
	  			<tr>
					<td class="TblRow aligncenter">${i.count}</td>
					<td  class="TblRow aligncenter" height="25" align="left" valign="top" class="TblRow AlignLeft"><a href="#" onClick ="sendvalue('${wr.warrant_no}','${wr.application_search_warrant_id}')">${wr.warrant_no}</a></td>
					<td  class="TblRow aligncenter" align="left" valign="top" class="TblRow AlignLeft">${wr.warrant_date2}</td>
               		<td align="left" valign="top" class="TblRow AlignLeft">${wr.owner_name}</td>
					<td align="left" valign="top" class="TblRow AlignLeft">${wr.jedge_name}</td>
	  			</tr>
	  		</c:if>
			<c:if test="${(i.count % 2) == 0}">
	  			<tr>
					<td class="TblRow aligncenter bgRowGray">${i.count}</td>
					<td class="TblRow aligncenter bgRowGray" height="25" class="TblRow AlignLeft bgRowGray"><a  href="#" onClick ="sendvalue('${wr.warrant_no}','${wr.application_search_warrant_id}')">${wr.warrant_no}</a></td>
					<td class="TblRow aligncenter bgRowGray" align="left" valign="top" class="TblRow AlignLeft bgRowGray">${wr.warrant_date2}</td>
               		<td class="TblRow AlignLeft bgRowGray">${wr.owner_name}</td>
					<td align="left" valign="top" class="TblRow AlignLeft bgRowGray">${wr.jedge_name}</td>
	  			</tr>
	  		</c:if>
	</c:forEach>
</table>

</BODY>
</HTML>
