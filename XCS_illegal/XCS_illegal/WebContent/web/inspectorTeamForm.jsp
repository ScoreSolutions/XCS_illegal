








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${inspectorTeam.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_DIV</strong></td>
		<td>
					<input type="text" name="offcode_div" value="${inspectorTeam.offcode_div}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_DEPT</strong></td>
		<td>
					<input type="text" name="offcode_dept" value="${inspectorTeam.offcode_dept}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_LEADER</strong></td>
		<td>
					<input type="text" name="offcode_leader" value="${inspectorTeam.offcode_leader}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_LEADER</strong></td>
		<td>
					<input type="text" name="poscode_leader" value="${inspectorTeam.poscode_leader}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_IDCARDNO_LEADER</strong></td>
		<td>
					<input type="text" name="staff_idcardno_leader" value="${inspectorTeam.staff_idcardno_leader}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${inspectorTeam.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${inspectorTeam.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${inspectorTeam.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${inspectorTeam.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INSPECTOR_NAME</strong></td>
		<td>
					<input type="text" name="inspector_name" value="${inspectorTeam.inspector_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INSPECTOR_CODE</strong></td>
		<td>
					<input type="text" name="inspector_code" value="${inspectorTeam.inspector_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPOINT_DATE</strong></td>
		<td>
					<input id="appoint_date" name="appoint_date" type="text" class="textdate" value="<fmt:formatDate value="${inspectorTeam.appoint_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('appoint_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPOINT_NO</strong></td>
		<td>
					<input type="text" name="appoint_no" value="${inspectorTeam.appoint_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>JOB_NO</strong></td>
		<td>
					<input type="text" name="job_no" value="${inspectorTeam.job_no}"/>
				</td>
	</tr>
	</table>