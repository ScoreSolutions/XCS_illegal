<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%@include file="/Templates/meta.jsp" %>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>

<title>เลขที่การแจ้งความ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
</HEAD>

<BODY>

<script type="text/javascript">
function sendvalue(vNoticeNo,vNoticeID,vInformName){
	
	if("${noticeno}" != "")
      opener.document.getElementById("${noticeno}").value=vNoticeNo;
    if("${id}"!= "")
      opener.document.getElementById("${id}").value=vNoticeID;
    if("${informname}" != "")
      opener.document.getElementById("${informname}").value=vInformName;

	opener.focus();
	self.close();
}

function clearfield(){
	if("${noticeno}" != "")
	      opener.document.getElementById("${noticeno}").value="";
	    if("${id}"!= "")
	      opener.document.getElementById("${id}").value="";
	    if("${informname}" != "")
	      opener.document.getElementById("${informname}").value="";
	      
		opener.focus();
		self.close();
	}
</script>

<form id='formPopup' action="<c:url value="/process?action=Notice_arrest_pop&cmd=list"/>" method="post" name="searc_notice">
<input type="hidden" name="noticeno" value="${noticeno}"></input>
<input type="hidden" name="id" value="${id}"></input>
<input type="hidden" name="informname" value="${informname}"></input>
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >เลขที่การแจ้งความ</span></td>
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
		<td  align="right">เลขที่การแจ้ง : </td>
		<td >
			<input name="notice_start" value="${param.notice_start}" type="text" class="textbox" size="20" />&nbsp;&nbsp;&nbsp;&nbsp;
               ถึง :&nbsp;
               <input name="notice_end" value="${param.notice_end}" type="text" class="textbox" size="20" />
		</td>
	</tr>
	<tr>
		<td  align="right">วันที่รับแจ้ง : </td>
		<td >
			<input name="date_start" id="date_start" value="${param.date_start}" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('date_start','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absmiddle" style="border-style: none" /></a>&nbsp;&nbsp;&nbsp;&nbsp;
               ถึง :&nbsp;
			<input name="date_end" id="date_end" value="${param.date_end}" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('date_end','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absmiddle" style="border-style: none" /></a>
		</td>
	</tr>
     <tr>
		<td width="30%"  align="right">ชื่อ-สกุลผู้แจ้ง : </td>
		<td width="70%">
            <input name="INFORM_Name" value="${param.INFORM_Name}" type="text" class="text"  size="50" />
		</td>
	</tr>
	<tr>
		<td  align="right">ชื่อ-สกุลผู้กระทำผิด : </td>
		<td >
			<input name="GuiltBase" value="${param.GuiltBase}" type="text" class="text" size="50">
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
<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
        <tr  align="left" valign="top">
<td colspan="3"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
       <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			<td width="15%" class="TblHeaderColumn">เลขที่การแจ้ง</td>
			<td width="30%" class="TblHeaderColumn">ชื่อผู้แจ้ง</td>
			<td width="20%" class="TblHeaderColumn">วันที่แจ้ง</td>
			<td width="30%" class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
	  </tr>

	  <c:forEach items="${ntList}"  var="nt" varStatus="i">
	  		<c:if test="${(i.count % 2) == 1}">
	  			<tr>
					<td class="TblRow aligncenter">${i.count}</td>
					<td height="25" align="left" valign="top" class="TblRow AlignLeft"><a href="#" onClick ="sendvalue('${nt.notice_no}','${nt.application_notice_arrest_id}','${nt.inform_name}')">${nt.notice_no}</a></td>
					<td align="left" valign="top" class="TblRow AlignLeft">${nt.inform_name}</td>
					<td align="left" valign="top" class="TblRow AlignLeft">${nt.notice_date2}</td>
					<td align="left" valign="top" class="TblRow AlignLeft">${nt.lawbreaker_name}</td>
	  			</tr>
	  		</c:if>
			<c:if test="${(i.count % 2) == 0}">
	  			<tr>
					<td class="TblRow aligncenter bgRowGray">${i.count}</td>
					<td height="25" class="TblRow AlignLeft bgRowGray"><a href="#" onClick ="sendvalue('${nt.notice_no}','${nt.application_notice_arrest_id}','${nt.inform_name}')">${nt.notice_no}</a></td>
					<td class="TblRow AlignLeft bgRowGray">${nt.inform_name}</td>
					<td align="left" valign="top" class="TblRow AlignLeft bgRowGray">${nt.notice_date2 }</td>
					<td align="left" valign="top" class="TblRow AlignLeft bgRowGray">${nt.lawbreaker_name}</td>
	  			</tr>
	  		</c:if>
		</c:forEach>
</table>
</BODY>
</HTML>
