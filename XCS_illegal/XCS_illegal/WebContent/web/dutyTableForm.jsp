








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${dutyTable.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>LAW_DUTY_CODE</strong></td>
		<td>
					<input type="text" name="law_duty_code" value="${dutyTable.law_duty_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_DATE</strong></td>
		<td>
					<input id="upd_date" name="upd_date" type="text" class="textdate" value="<fmt:formatDate value="${dutyTable.upd_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('upd_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPD_USERID</strong></td>
		<td>
					<input type="text" name="upd_userid" value="${dutyTable.upd_userid}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>END_DATE</strong></td>
		<td>
					<input id="end_date" name="end_date" type="text" class="textdate" value="<fmt:formatDate value="${dutyTable.end_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('end_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BEGIN_DATE</strong></td>
		<td>
					<input id="begin_date" name="begin_date" type="text" class="textdate" value="<fmt:formatDate value="${dutyTable.begin_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('begin_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_NAME</strong></td>
		<td>
					<input type="text" name="duty_name" value="${dutyTable.duty_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_CODE</strong></td>
		<td>
					<input type="text" name="duty_code" value="${dutyTable.duty_code}"/>
				</td>
	</tr>
	</table>