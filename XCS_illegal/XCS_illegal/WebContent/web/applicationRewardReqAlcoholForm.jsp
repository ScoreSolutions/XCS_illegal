








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqAlcohol.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>REPORT_TO</strong></td>
		<td>
					<input type="text" name="report_to" value="${applicationRewardReqAlcohol.report_to}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqAlcohol.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationRewardReqAlcohol.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqAlcohol.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationRewardReqAlcohol.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_RES_DIRECTOR</strong></td>
		<td>
					<input type="text" name="poscode_res_director" value="${applicationRewardReqAlcohol.poscode_res_director}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_RES_DIRECTOR</strong></td>
		<td>
					<input type="text" name="staff_id_res_director" value="${applicationRewardReqAlcohol.staff_id_res_director}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RES_DIRECTOR_DENY_REASON</strong></td>
		<td>
					<input type="text" name="res_director_deny_reason" value="${applicationRewardReqAlcohol.res_director_deny_reason}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RES_DIRECTOR_ACCEPT_REASON</strong></td>
		<td>
					<input type="text" name="res_director_accept_reason" value="${applicationRewardReqAlcohol.res_director_accept_reason}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RES_DIRECTOR_ACCEPT</strong></td>
		<td>
					<input type="text" name="res_director_accept" value="${applicationRewardReqAlcohol.res_director_accept}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_SECTION_DIRECTOR</strong></td>
		<td>
					<input type="text" name="poscode_section_director" value="${applicationRewardReqAlcohol.poscode_section_director}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_SECTION_DIRECTOR</strong></td>
		<td>
					<input type="text" name="staff_id_section_director" value="${applicationRewardReqAlcohol.staff_id_section_director}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SECTION_DIRECTOR_DENY_REASON</strong></td>
		<td>
					<input type="text" name="section_director_deny_reason" value="${applicationRewardReqAlcohol.section_director_deny_reason}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SECTION_DIRECTOR_ACCEPT_REASON</strong></td>
		<td>
					<input type="text" name="section_director_accept_reason" value="${applicationRewardReqAlcohol.section_director_accept_reason}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SECTION_DIRECTOR_ACCEPT</strong></td>
		<td>
					<input type="text" name="section_director_accept" value="${applicationRewardReqAlcohol.section_director_accept}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SECTION_DIRECTOR_LEAN</strong></td>
		<td>
					<input type="text" name="section_director_lean" value="${applicationRewardReqAlcohol.section_director_lean}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_LEADER</strong></td>
		<td>
					<input type="text" name="poscode_leader" value="${applicationRewardReqAlcohol.poscode_leader}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_LEADER</strong></td>
		<td>
					<input type="text" name="staff_id_leader" value="${applicationRewardReqAlcohol.staff_id_leader}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEADER_DENY_REASON</strong></td>
		<td>
					<input type="text" name="leader_deny_reason" value="${applicationRewardReqAlcohol.leader_deny_reason}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEADER_ACCEPT_REASON</strong></td>
		<td>
					<input type="text" name="leader_accept_reason" value="${applicationRewardReqAlcohol.leader_accept_reason}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEADER_ACCEPT</strong></td>
		<td>
					<input type="text" name="leader_accept" value="${applicationRewardReqAlcohol.leader_accept}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEADER_LEAN</strong></td>
		<td>
					<input type="text" name="leader_lean" value="${applicationRewardReqAlcohol.leader_lean}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCEPT_DESC</strong></td>
		<td>
					<input type="text" name="accept_desc" value="${applicationRewardReqAlcohol.accept_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCEPT_LEAN</strong></td>
		<td>
					<input type="text" name="accept_lean" value="${applicationRewardReqAlcohol.accept_lean}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_ARREST</strong></td>
		<td>
					<input type="text" name="offcode_arrest" value="${applicationRewardReqAlcohol.offcode_arrest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_ARREST</strong></td>
		<td>
					<input type="text" name="poscode_arrest" value="${applicationRewardReqAlcohol.poscode_arrest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_ARREST</strong></td>
		<td>
					<input type="text" name="staff_id_arrest" value="${applicationRewardReqAlcohol.staff_id_arrest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCEPT_DATE</strong></td>
		<td>
					<input id="accept_date" name="accept_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardReqAlcohol.accept_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('accept_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_REWARD_REQUEST_ID</strong></td>
		<td>
					<input type="text" name="application_reward_request_id" value="${applicationRewardReqAlcohol.application_reward_request_id}"/>
				</td>
	</tr>
	</table>