








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrestTeam.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_OFFCODE</strong></td>
		<td>
					<input type="text" name="staff_offcode" value="${applicationArrestTeam.staff_offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_POSCODE</strong></td>
		<td>
					<input type="text" name="staff_poscode" value="${applicationArrestTeam.staff_poscode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_IDCARDNO</strong></td>
		<td>
					<input type="text" name="staff_idcardno" value="${applicationArrestTeam.staff_idcardno}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS_ID</strong></td>
		<td>
					<input type="text" name="duty_status_id" value="${applicationArrestTeam.duty_status_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_POSITION</strong></td>
		<td>
					<input type="text" name="staff_position" value="${applicationArrestTeam.staff_position}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INSPECTOR_CODE</strong></td>
		<td>
					<input type="text" name="inspector_code" value="${applicationArrestTeam.inspector_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_NO</strong></td>
		<td>
					<input type="text" name="staff_no" value="${applicationArrestTeam.staff_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${applicationArrestTeam.track_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestTeam.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationArrestTeam.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestTeam.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationArrestTeam.create_by}"/>
				</td>
	</tr>
	</table>