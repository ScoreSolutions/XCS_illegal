








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqReport.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqReport.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationRewardReqReport.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqReport.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationRewardReqReport.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMMAND</strong></td>
		<td>
					<input type="text" name="command" value="${applicationRewardReqReport.command}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMMENT_COMMANDER</strong></td>
		<td>
					<input type="text" name="comment_commander" value="${applicationRewardReqReport.comment_commander}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_COMMANDER</strong></td>
		<td>
					<input type="text" name="offcode_commander" value="${applicationRewardReqReport.offcode_commander}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_COMMANDER</strong></td>
		<td>
					<input type="text" name="poscode_commander" value="${applicationRewardReqReport.poscode_commander}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_COMMANDER</strong></td>
		<td>
					<input type="text" name="staff_id_commander" value="${applicationRewardReqReport.staff_id_commander}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMMENT_INITIAL</strong></td>
		<td>
					<input type="text" name="comment_initial" value="${applicationRewardReqReport.comment_initial}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_INITIAL</strong></td>
		<td>
					<input type="text" name="offcode_initial" value="${applicationRewardReqReport.offcode_initial}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_INITIAL</strong></td>
		<td>
					<input type="text" name="poscode_initial" value="${applicationRewardReqReport.poscode_initial}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_INITIAL</strong></td>
		<td>
					<input type="text" name="staff_id_initial" value="${applicationRewardReqReport.staff_id_initial}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMMENT_CONTROL</strong></td>
		<td>
					<input type="text" name="comment_control" value="${applicationRewardReqReport.comment_control}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_CONTROL</strong></td>
		<td>
					<input type="text" name="offcode_control" value="${applicationRewardReqReport.offcode_control}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_CONTROL</strong></td>
		<td>
					<input type="text" name="poscode_control" value="${applicationRewardReqReport.poscode_control}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_CONTROL</strong></td>
		<td>
					<input type="text" name="staff_id_control" value="${applicationRewardReqReport.staff_id_control}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ABNORMALITY</strong></td>
		<td>
					<input type="text" name="abnormality" value="${applicationRewardReqReport.abnormality}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISCHKCOUNT</strong></td>
		<td>
					<input type="text" name="ischkcount" value="${applicationRewardReqReport.ischkcount}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISINFORM</strong></td>
		<td>
					<input type="text" name="isinform" value="${applicationRewardReqReport.isinform}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBJECT</strong></td>
		<td>
					<input type="text" name="subject" value="${applicationRewardReqReport.subject}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_REWARD_REQUEST_ID</strong></td>
		<td>
					<input type="text" name="application_reward_request_id" value="${applicationRewardReqReport.application_reward_request_id}"/>
				</td>
	</tr>
	</table>