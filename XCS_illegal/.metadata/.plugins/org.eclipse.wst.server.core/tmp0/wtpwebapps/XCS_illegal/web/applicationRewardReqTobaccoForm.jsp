








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqTobacco.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqTobacco.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationRewardReqTobacco.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqTobacco.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationRewardReqTobacco.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ARREST_OPINION</strong></td>
		<td>
					<input type="text" name="arrest_opinion" value="${applicationRewardReqTobacco.arrest_opinion}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMMAND</strong></td>
		<td>
					<input type="text" name="command" value="${applicationRewardReqTobacco.command}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAW_DIRECTOR_OPINION</strong></td>
		<td>
					<input type="text" name="law_director_opinion" value="${applicationRewardReqTobacco.law_director_opinion}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAW_DIRECTOR_POSITION</strong></td>
		<td>
					<input type="text" name="law_director_position" value="${applicationRewardReqTobacco.law_director_position}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWYER_OPINION</strong></td>
		<td>
					<input type="text" name="lawyer_opinion" value="${applicationRewardReqTobacco.lawyer_opinion}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_ARREST</strong></td>
		<td>
					<input type="text" name="offcode_arrest" value="${applicationRewardReqTobacco.offcode_arrest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_ARREST</strong></td>
		<td>
					<input type="text" name="poscode_arrest" value="${applicationRewardReqTobacco.poscode_arrest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_ARREST</strong></td>
		<td>
					<input type="text" name="staff_id_arrest" value="${applicationRewardReqTobacco.staff_id_arrest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_REWARD_REQUEST_ID</strong></td>
		<td>
					<input type="text" name="application_reward_request_id" value="${applicationRewardReqTobacco.application_reward_request_id}"/>
				</td>
	</tr>
	</table>