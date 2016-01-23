








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${bookImpeachment.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_FINE</strong></td>
		<td>
					<input type="text" name="case_fine" value="${bookImpeachment.case_fine}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_LAST_DATE</strong></td>
		<td>
					<input id="case_last_date" name="case_last_date" type="text" class="textdate" value="<fmt:formatDate value="${bookImpeachment.case_last_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('case_last_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_RESULT</strong></td>
		<td>
					<input type="text" name="case_result" value="${bookImpeachment.case_result}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_LAST</strong></td>
		<td>
					<input type="text" name="case_last" value="${bookImpeachment.case_last}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_QUALITY</strong></td>
		<td>
					<input type="text" name="case_quality" value="${bookImpeachment.case_quality}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${bookImpeachment.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${bookImpeachment.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${bookImpeachment.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${bookImpeachment.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${bookImpeachment.track_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_SUE</strong></td>
		<td>
					<input type="text" name="staff_id_sue" value="${bookImpeachment.staff_id_sue}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_DATE</strong></td>
		<td>
					<input id="case_date" name="case_date" type="text" class="textdate" value="<fmt:formatDate value="${bookImpeachment.case_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('case_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_ID</strong></td>
		<td>
					<input type="text" name="case_id" value="${bookImpeachment.case_id}"/>
				</td>
	</tr>
	</table>