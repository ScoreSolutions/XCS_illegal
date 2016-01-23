








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${invoice2.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${invoice2.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${invoice2.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${invoice2.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${invoice2.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_CANCEL</strong></td>
		<td>
					<input type="text" name="offcode_cancel" value="${invoice2.offcode_cancel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CANCEL_DATE</strong></td>
		<td>
					<input id="cancel_date" name="cancel_date" type="text" class="textdate" value="<fmt:formatDate value="${invoice2.cancel_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('cancel_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_CANCEL</strong></td>
		<td>
					<input type="text" name="poscode_cancel" value="${invoice2.poscode_cancel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_CANCEL</strong></td>
		<td>
					<input type="text" name="staff_cancel" value="${invoice2.staff_cancel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STATUS</strong></td>
		<td>
					<input type="text" name="status" value="${invoice2.status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INTERIOR_REMARKS</strong></td>
		<td>
					<input type="text" name="interior_remarks" value="${invoice2.interior_remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TAX_REMARKS</strong></td>
		<td>
					<input type="text" name="tax_remarks" value="${invoice2.tax_remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INTERIOR_FINE</strong></td>
		<td>
					<input type="text" name="interior_fine" value="${invoice2.interior_fine}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TAX_FINE</strong></td>
		<td>
					<input type="text" name="tax_fine" value="${invoice2.tax_fine}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_RECEIVE</strong></td>
		<td>
					<input type="text" name="offcode_receive" value="${invoice2.offcode_receive}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_RECEIVE</strong></td>
		<td>
					<input type="text" name="poscode_receive" value="${invoice2.poscode_receive}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_RECEIVE</strong></td>
		<td>
					<input type="text" name="staff_receive" value="${invoice2.staff_receive}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEND_NO</strong></td>
		<td>
					<input type="text" name="send_no" value="${invoice2.send_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEND_BOOKNO</strong></td>
		<td>
					<input type="text" name="send_bookno" value="${invoice2.send_bookno}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_CASE_ID</strong></td>
		<td>
					<input type="text" name="compare_case_id" value="${invoice2.compare_case_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INV_DATE</strong></td>
		<td>
					<input id="inv_date" name="inv_date" type="text" class="textdate" value="<fmt:formatDate value="${invoice2.inv_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('inv_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INV_NO</strong></td>
		<td>
					<input type="text" name="inv_no" value="${invoice2.inv_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INV_BOOKNO</strong></td>
		<td>
					<input type="text" name="inv_bookno" value="${invoice2.inv_bookno}"/>
				</td>
	</tr>
	</table>