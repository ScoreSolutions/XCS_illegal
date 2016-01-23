








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${configDivide.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${configDivide.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SHARE_QTY</strong></td>
		<td>
					<input type="text" name="share_qty" value="${configDivide.share_qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REF_VALUE</strong></td>
		<td>
					<input type="text" name="ref_value" value="${configDivide.ref_value}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REF_TABLE</strong></td>
		<td>
					<input type="text" name="ref_table" value="${configDivide.ref_table}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS05</strong></td>
		<td>
					<input type="text" name="duty_status05" value="${configDivide.duty_status05}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS04</strong></td>
		<td>
					<input type="text" name="duty_status04" value="${configDivide.duty_status04}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS03</strong></td>
		<td>
					<input type="text" name="duty_status03" value="${configDivide.duty_status03}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS02</strong></td>
		<td>
					<input type="text" name="duty_status02" value="${configDivide.duty_status02}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_STATUS01</strong></td>
		<td>
					<input type="text" name="duty_status01" value="${configDivide.duty_status01}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROPORTION</strong></td>
		<td>
					<input type="text" name="proportion" value="${configDivide.proportion}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRIBE_REWARD</strong></td>
		<td>
					<input type="text" name="bribe_reward" value="${configDivide.bribe_reward}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${configDivide.legislation_id}"/>
				</td>
	</tr>
	</table>