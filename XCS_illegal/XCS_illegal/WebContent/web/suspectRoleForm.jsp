








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectRole.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectRole.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${suspectRole.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectRole.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${suspectRole.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROLE_STATUS</strong></td>
		<td>
					<input type="text" name="role_status" value="${suspectRole.role_status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROLE_DESC</strong></td>
		<td>
					<input type="text" name="role_desc" value="${suspectRole.role_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROLE_LEVEL</strong></td>
		<td>
					<input type="text" name="role_level" value="${suspectRole.role_level}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROLE_NAME</strong></td>
		<td>
					<input type="text" name="role_name" value="${suspectRole.role_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROLE_CODE</strong></td>
		<td>
					<input type="text" name="role_code" value="${suspectRole.role_code}"/>
				</td>
	</tr>
	</table>