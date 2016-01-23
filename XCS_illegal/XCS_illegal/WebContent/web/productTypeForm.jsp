








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${productType.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>ACTIVE</strong></td>
		<td>
					<input type="text" name="active" value="${productType.active}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>GROUP_ID</strong></td>
		<td>
					<input type="text" name="group_id" value="${productType.group_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TYPE_NAME</strong></td>
		<td>
					<input type="text" name="type_name" value="${productType.type_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TYPE_CODE</strong></td>
		<td>
					<input type="text" name="type_code" value="${productType.type_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_CODE</strong></td>
		<td>
					<input type="text" name="duty_code" value="${productType.duty_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${productType.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${productType.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${productType.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${productType.create_by}"/>
				</td>
	</tr>
	</table>