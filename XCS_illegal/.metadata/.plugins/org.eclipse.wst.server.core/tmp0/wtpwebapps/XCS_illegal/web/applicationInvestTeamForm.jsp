








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationInvestTeam.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationInvestTeam.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationInvestTeam.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationInvestTeam.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationInvestTeam.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_STAFF</strong></td>
		<td>
					<input type="text" name="offcode_staff" value="${applicationInvestTeam.offcode_staff}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_STAFF</strong></td>
		<td>
					<input type="text" name="poscode_staff" value="${applicationInvestTeam.poscode_staff}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_IDCARD_NO</strong></td>
		<td>
					<input type="text" name="staff_idcard_no" value="${applicationInvestTeam.staff_idcard_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_INVEST_ID</strong></td>
		<td>
					<input type="text" name="application_invest_id" value="${applicationInvestTeam.application_invest_id}"/>
				</td>
	</tr>
	</table>