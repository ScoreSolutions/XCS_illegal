








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqTeam.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS_ID</strong></td>
		<td>
					<input type="text" name="duty_status_id" value="${applicationRewardReqTeam.duty_status_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqTeam.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationRewardReqTeam.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqTeam.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationRewardReqTeam.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_LEVEL</strong></td>
		<td>
					<input type="text" name="staff_level" value="${applicationRewardReqTeam.staff_level}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${applicationRewardReqTeam.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE</strong></td>
		<td>
					<input type="text" name="poscode" value="${applicationRewardReqTeam.poscode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_IDCARDNO</strong></td>
		<td>
					<input type="text" name="staff_idcardno" value="${applicationRewardReqTeam.staff_idcardno}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_REWARD_REQUEST_ID</strong></td>
		<td>
					<input type="text" name="application_reward_request_id" value="${applicationRewardReqTeam.application_reward_request_id}"/>
				</td>
	</tr>
	</table>