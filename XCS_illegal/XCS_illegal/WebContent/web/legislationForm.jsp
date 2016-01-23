








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${legislation.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_REQUEST_SECTION</strong></td>
		<td>
					<input type="text" name="compare_request_section" value="${legislation.compare_request_section}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NOTICE_DEFAULT_COMPARE</strong></td>
		<td>
					<input type="text" name="notice_default_compare" value="${legislation.notice_default_compare}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${legislation.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${legislation.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${legislation.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${legislation.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_NAME</strong></td>
		<td>
					<input type="text" name="legislation_name" value="${legislation.legislation_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_CODE</strong></td>
		<td>
					<input type="text" name="legislation_code" value="${legislation.legislation_code}"/>
				</td>
	</tr>
	</table>