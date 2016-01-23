








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrestProve.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>TAX_VALUE</strong></td>
		<td>
					<input type="text" name="tax_value" value="${applicationArrestProve.tax_value}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_PROVE_OFFCODE</strong></td>
		<td>
					<input type="text" name="staff_prove_offcode" value="${applicationArrestProve.staff_prove_offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_PROVE_POSCODE</strong></td>
		<td>
					<input type="text" name="staff_prove_poscode" value="${applicationArrestProve.staff_prove_poscode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STATUS</strong></td>
		<td>
					<input type="text" name="status" value="${applicationArrestProve.status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestProve.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationArrestProve.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestProve.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationArrestProve.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ORDER_DESC</strong></td>
		<td>
					<input type="text" name="order_desc" value="${applicationArrestProve.order_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REPORT_DESC</strong></td>
		<td>
					<input type="text" name="report_desc" value="${applicationArrestProve.report_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REPLACE_POSITION</strong></td>
		<td>
					<input type="text" name="replace_position" value="${applicationArrestProve.replace_position}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TAKEN_DATE</strong></td>
		<td>
					<input id="taken_date" name="taken_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestProve.taken_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('taken_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_IDCARDNO_PROVE</strong></td>
		<td>
					<input type="text" name="staff_idcardno_prove" value="${applicationArrestProve.staff_idcardno_prove}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CASE_ID</strong></td>
		<td>
					<input type="text" name="case_id" value="${applicationArrestProve.case_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EXHIBIT_REPORT_NO</strong></td>
		<td>
					<input type="text" name="exhibit_report_no" value="${applicationArrestProve.exhibit_report_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${applicationArrestProve.track_no}"/>
				</td>
	</tr>
	</table>