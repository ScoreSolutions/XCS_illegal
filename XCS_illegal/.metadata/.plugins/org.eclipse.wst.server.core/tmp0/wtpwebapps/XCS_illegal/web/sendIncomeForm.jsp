








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${sendIncome.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>STATUS</strong></td>
		<td>
					<input type="text" name="status" value="${sendIncome.status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${sendIncome.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${sendIncome.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${sendIncome.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${sendIncome.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INV_NO</strong></td>
		<td>
					<input type="text" name="inv_no" value="${sendIncome.inv_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_APPROVE</strong></td>
		<td>
					<input type="text" name="poscode_approve" value="${sendIncome.poscode_approve}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_APPROVE</strong></td>
		<td>
					<input type="text" name="staff_id_approve" value="${sendIncome.staff_id_approve}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_SEND</strong></td>
		<td>
					<input type="text" name="poscode_send" value="${sendIncome.poscode_send}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_SEND</strong></td>
		<td>
					<input type="text" name="staff_id_send" value="${sendIncome.staff_id_send}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_DATE_TO</strong></td>
		<td>
					<input id="fine_date_to" name="fine_date_to" type="text" class="textdate" value="<fmt:formatDate value="${sendIncome.fine_date_to}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('fine_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_DATE_FROM</strong></td>
		<td>
					<input id="fine_date_from" name="fine_date_from" type="text" class="textdate" value="<fmt:formatDate value="${sendIncome.fine_date_from}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('fine_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${sendIncome.legislation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_AREA</strong></td>
		<td>
					<input type="text" name="offcode_area" value="${sendIncome.offcode_area}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFNAME_WRITE</strong></td>
		<td>
					<input type="text" name="offname_write" value="${sendIncome.offname_write}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_WRITE</strong></td>
		<td>
					<input type="text" name="offcode_write" value="${sendIncome.offcode_write}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEND_DOC_NO</strong></td>
		<td>
					<input type="text" name="send_doc_no" value="${sendIncome.send_doc_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEND_DATE</strong></td>
		<td>
					<input id="send_date" name="send_date" type="text" class="textdate" value="<fmt:formatDate value="${sendIncome.send_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('send_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEND_NO</strong></td>
		<td>
					<input type="text" name="send_no" value="${sendIncome.send_no}"/>
				</td>
	</tr>
	</table>