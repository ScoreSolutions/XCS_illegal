








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqTax.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqTax.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationRewardReqTax.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqTax.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationRewardReqTax.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_APPROVE</strong></td>
		<td>
					<input type="text" name="offcode_approve" value="${applicationRewardReqTax.offcode_approve}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_APPROVE</strong></td>
		<td>
					<input type="text" name="poscode_approve" value="${applicationRewardReqTax.poscode_approve}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_APPROVE</strong></td>
		<td>
					<input type="text" name="staff_id_approve" value="${applicationRewardReqTax.staff_id_approve}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPROVE_LEAN</strong></td>
		<td>
					<input type="text" name="approve_lean" value="${applicationRewardReqTax.approve_lean}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_ASK</strong></td>
		<td>
					<input type="text" name="offcode_ask" value="${applicationRewardReqTax.offcode_ask}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_ASK</strong></td>
		<td>
					<input type="text" name="poscode_ask" value="${applicationRewardReqTax.poscode_ask}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_ASK</strong></td>
		<td>
					<input type="text" name="staff_id_ask" value="${applicationRewardReqTax.staff_id_ask}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEPARTMENT_NAME_SEND</strong></td>
		<td>
					<input type="text" name="department_name_send" value="${applicationRewardReqTax.department_name_send}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ASK_LEAN</strong></td>
		<td>
					<input type="text" name="ask_lean" value="${applicationRewardReqTax.ask_lean}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_CONFIRM</strong></td>
		<td>
					<input type="text" name="offcode_confirm" value="${applicationRewardReqTax.offcode_confirm}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_CONFIRM</strong></td>
		<td>
					<input type="text" name="poscode_confirm" value="${applicationRewardReqTax.poscode_confirm}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_CONFIRM</strong></td>
		<td>
					<input type="text" name="staff_id_confirm" value="${applicationRewardReqTax.staff_id_confirm}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_REWARD_REQUEST_ID</strong></td>
		<td>
					<input type="text" name="application_reward_request_id" value="${applicationRewardReqTax.application_reward_request_id}"/>
				</td>
	</tr>
	</table>