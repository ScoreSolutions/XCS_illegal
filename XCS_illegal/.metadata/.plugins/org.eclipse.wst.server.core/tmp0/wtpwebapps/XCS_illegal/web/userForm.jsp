








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${user.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>SALARY</strong></td>
		<td>
					<input type="text" name="salary" value="${user.salary}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PARENT_ID</strong></td>
		<td>
					<input type="text" name="parent_id" value="${user.parent_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PHOTO</strong></td>
		<td>
					<input type="file" name="photo" value=""/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEX</strong></td>
		<td>
					<input type="text" name="sex" value="${user.sex}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${user.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${user.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${user.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${user.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>USER_PASS</strong></td>
		<td>
					<input type="text" name="user_pass" value="${user.user_pass}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>USER_LOGIN</strong></td>
		<td>
					<input type="text" name="user_login" value="${user.user_login}"/>
				</td>
	</tr>
	</table>