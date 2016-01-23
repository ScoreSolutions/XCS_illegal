








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${compareCaseChange.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>CANCEL_BY</strong></td>
		<td>
					<input type="text" name="cancel_by" value="${compareCaseChange.cancel_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CANCEL_DATE</strong></td>
		<td>
					<input id="cancel_date" name="cancel_date" type="text" class="textdate" value="<fmt:formatDate value="${compareCaseChange.cancel_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('cancel_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISCANCEL</strong></td>
		<td>
					<input type="text" name="iscancel" value="${compareCaseChange.iscancel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TREASURY_MONEY_OLD</strong></td>
		<td>
					<input type="text" name="treasury_money_old" value="${compareCaseChange.treasury_money_old}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REWARD_MONEY_OLD</strong></td>
		<td>
					<input type="text" name="reward_money_old" value="${compareCaseChange.reward_money_old}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRIBE_MONEY_OLD</strong></td>
		<td>
					<input type="text" name="bribe_money_old" value="${compareCaseChange.bribe_money_old}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_FINE_OLD</strong></td>
		<td>
					<input type="text" name="case_fine_old" value="${compareCaseChange.case_fine_old}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CHANGE_REASON</strong></td>
		<td>
					<input type="text" name="change_reason" value="${compareCaseChange.change_reason}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INV_TYPE</strong></td>
		<td>
					<input type="text" name="inv_type" value="${compareCaseChange.inv_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CHANGE_DATE</strong></td>
		<td>
					<input id="change_date" name="change_date" type="text" class="textdate" value="<fmt:formatDate value="${compareCaseChange.change_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('change_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${compareCaseChange.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${compareCaseChange.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${compareCaseChange.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${compareCaseChange.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CHANGE_MONEY</strong></td>
		<td>
					<input type="text" name="change_money" value="${compareCaseChange.change_money}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CHANGE_TYPE</strong></td>
		<td>
					<input type="text" name="change_type" value="${compareCaseChange.change_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_CASE_ID</strong></td>
		<td>
					<input type="text" name="compare_case_id" value="${compareCaseChange.compare_case_id}"/>
				</td>
	</tr>
	</table>