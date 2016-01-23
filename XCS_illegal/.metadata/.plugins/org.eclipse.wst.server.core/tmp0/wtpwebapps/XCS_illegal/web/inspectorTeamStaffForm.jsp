








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${inspectorTeamStaff.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_OFFCODE</strong></td>
		<td>
					<input type="text" name="staff_offcode" value="${inspectorTeamStaff.staff_offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_POSCODE</strong></td>
		<td>
					<input type="text" name="staff_poscode" value="${inspectorTeamStaff.staff_poscode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_IDCARDNO</strong></td>
		<td>
					<input type="text" name="staff_idcardno" value="${inspectorTeamStaff.staff_idcardno}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${inspectorTeamStaff.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${inspectorTeamStaff.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${inspectorTeamStaff.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${inspectorTeamStaff.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STATUS</strong></td>
		<td>
					<input type="text" name="status" value="${inspectorTeamStaff.status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAST_NAME</strong></td>
		<td>
					<input type="text" name="last_name" value="${inspectorTeamStaff.last_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIRST_NAME</strong></td>
		<td>
					<input type="text" name="first_name" value="${inspectorTeamStaff.first_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_ID</strong></td>
		<td>
					<input type="text" name="title_id" value="${inspectorTeamStaff.title_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_CODE</strong></td>
		<td>
					<input type="text" name="staff_code" value="${inspectorTeamStaff.staff_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INSPECTOR_TEAM_ID</strong></td>
		<td>
					<input type="text" name="inspector_team_id" value="${inspectorTeamStaff.inspector_team_id}"/>
				</td>
	</tr>
	</table>