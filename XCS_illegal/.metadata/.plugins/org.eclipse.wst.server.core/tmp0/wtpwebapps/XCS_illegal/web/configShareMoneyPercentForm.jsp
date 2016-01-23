








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${configShareMoneyPercent.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>TYPE_CODE</strong></td>
		<td>
					<input type="text" name="type_code" value="${configShareMoneyPercent.type_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_CODE</strong></td>
		<td>
					<input type="text" name="duty_code" value="${configShareMoneyPercent.duty_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PENALTY_CASE_LAW_ID</strong></td>
		<td>
					<input type="text" name="penalty_case_law_id" value="${configShareMoneyPercent.penalty_case_law_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REWARD_LIMIT</strong></td>
		<td>
					<input type="text" name="reward_limit" value="${configShareMoneyPercent.reward_limit}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRIBE_LIMIT</strong></td>
		<td>
					<input type="text" name="bribe_limit" value="${configShareMoneyPercent.bribe_limit}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TREASURY</strong></td>
		<td>
					<input type="text" name="treasury" value="${configShareMoneyPercent.treasury}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REWARD</strong></td>
		<td>
					<input type="text" name="reward" value="${configShareMoneyPercent.reward}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRIBE</strong></td>
		<td>
					<input type="text" name="bribe" value="${configShareMoneyPercent.bribe}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISNOTICE</strong></td>
		<td>
					<input type="text" name="isnotice" value="${configShareMoneyPercent.isnotice}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${configShareMoneyPercent.legislation_id}"/>
				</td>
	</tr>
	</table>