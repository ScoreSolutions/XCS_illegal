<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<table width="700" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="20%" align="right">วันที่ทำรายงาน :&nbsp;</td>
		<td width="80%" align="left" >
		    <input name="date_from" id="date_from" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" >
			<img onClick="javascript:NewCssCal('date_from','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none;cursor:hand" />
			<font style="color: red">*</font> &nbsp;&nbsp;
			ถึงวันที่ :&nbsp; 
			<input name="date_to" id="date_to" type="text" class="textdate" onkeypress="window.event.keyCode = 0;" />
			<img onClick="javascript:NewCssCal('date_to','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19"align="middle" style="border-style: none;cursor:had" />
			<font style="color: red">*</font> 
		</td>
	</tr> 
</table>

<script>
	function getDate(vDate){
		var ret;

		var vInputDate=document.getElementById(vDate).value;
		var vYear = vInputDate.substring(6,10)-543;
		var vMonth = vInputDate.substring(3,5);
		var vDay = vInputDate.substring(0,2);

		ret = vYear + "-" + vMonth + "-" + vDay; 
		return ret;
	}

	function getDateFrom{
		return getDate(document.getElementById("date_from"));
	}
	function getDateTo{
		return getDate(document.getElementById("date_to"));
	}
</script>