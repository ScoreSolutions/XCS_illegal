








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${rewardDivide.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${rewardDivide.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${rewardDivide.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${rewardDivide.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${rewardDivide.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${rewardDivide.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${rewardDivide.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_CASE_ID</strong></td>
		<td>
					<input type="text" name="compare_case_id" value="${rewardDivide.compare_case_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RECEIVE_DATE</strong></td>
		<td>
					<input id="receive_date" name="receive_date" type="text" class="textdate" value="<fmt:formatDate value="${rewardDivide.receive_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('receive_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DIVIDE_DATE</strong></td>
		<td>
					<input id="divide_date" name="divide_date" type="text" class="textdate" value="<fmt:formatDate value="${rewardDivide.divide_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('divide_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DIVIDE_NO</strong></td>
		<td>
					<input type="text" name="divide_no" value="${rewardDivide.divide_no}"/>
				</td>
	</tr>
	</table>