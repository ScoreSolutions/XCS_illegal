








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardRequest.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardRequest.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationRewardRequest.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardRequest.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationRewardRequest.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_CASE_ID</strong></td>
		<td>
					<input type="text" name="compare_case_id" value="${applicationRewardRequest.compare_case_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RECEIVE_DATE</strong></td>
		<td>
					<input id="receive_date" name="receive_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardRequest.receive_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('receive_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_POSITION</strong></td>
		<td>
					<input type="text" name="inform_position" value="${applicationRewardRequest.inform_position}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_NAME</strong></td>
		<td>
					<input type="text" name="inform_name" value="${applicationRewardRequest.inform_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_RECEIVE</strong></td>
		<td>
					<input type="text" name="poscode_receive" value="${applicationRewardRequest.poscode_receive}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_RECEIVE</strong></td>
		<td>
					<input type="text" name="staff_id_receive" value="${applicationRewardRequest.staff_id_receive}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_REQUEST</strong></td>
		<td>
					<input type="text" name="poscode_request" value="${applicationRewardRequest.poscode_request}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_REQUEST</strong></td>
		<td>
					<input type="text" name="staff_id_request" value="${applicationRewardRequest.staff_id_request}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${applicationRewardRequest.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQUEST_DATE</strong></td>
		<td>
					<input id="request_date" name="request_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationRewardRequest.request_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('request_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQUEST_NO</strong></td>
		<td>
					<input type="text" name="request_no" value="${applicationRewardRequest.request_no}"/>
				</td>
	</tr>
	</table>