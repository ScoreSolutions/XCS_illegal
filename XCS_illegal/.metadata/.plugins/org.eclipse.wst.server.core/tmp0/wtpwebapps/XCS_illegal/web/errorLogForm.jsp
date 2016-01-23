








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${errorLog.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>BROWSER</strong></td>
		<td>
					<input type="text" name="browser" value="${errorLog.browser}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SESSIONID</strong></td>
		<td>
					<input type="text" name="sessionid" value="${errorLog.sessionid}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>IP_ADDRESS</strong></td>
		<td>
					<input type="text" name="ip_address" value="${errorLog.ip_address}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ERROR_DESC</strong></td>
		<td>
					<input type="text" name="error_desc" value="${errorLog.error_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ERROR_DATE</strong></td>
		<td>
					<input id="error_date" name="error_date" type="text" class="textdate" value="<fmt:formatDate value="${errorLog.error_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('error_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>USERID</strong></td>
		<td>
					<input type="text" name="userid" value="${errorLog.userid}"/>
				</td>
	</tr>
	</table>