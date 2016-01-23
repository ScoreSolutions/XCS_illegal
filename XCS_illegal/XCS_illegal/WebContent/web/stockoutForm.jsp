








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${stockout.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBJECT_TYPE</strong></td>
		<td>
					<input type="text" name="subject_type" value="${stockout.subject_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRANSFER_BY</strong></td>
		<td>
					<input type="text" name="transfer_by" value="${stockout.transfer_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>JOB_NO</strong></td>
		<td>
					<input type="text" name="job_no" value="${stockout.job_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_TO</strong></td>
		<td>
					<input type="text" name="offcode_to" value="${stockout.offcode_to}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${stockout.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${stockout.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${stockout.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${stockout.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STATUS</strong></td>
		<td>
					<input type="text" name="status" value="${stockout.status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${stockout.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${stockout.legislation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REPORT_TO_STAFF</strong></td>
		<td>
					<input type="text" name="report_to_staff" value="${stockout.report_to_staff}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBJECT</strong></td>
		<td>
					<input type="text" name="subject" value="${stockout.subject}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${stockout.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STOCKOUT_DATE</strong></td>
		<td>
					<input id="stockout_date" name="stockout_date" type="text" class="textdate" value="<fmt:formatDate value="${stockout.stockout_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('stockout_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STOCKOUT_CODE</strong></td>
		<td>
					<input type="text" name="stockout_code" value="${stockout.stockout_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STOCKOUT_TYPE</strong></td>
		<td>
					<input type="text" name="stockout_type" value="${stockout.stockout_type}"/>
				</td>
	</tr>
	</table>