








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${deliveryExhibit.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBJECT_TYPE</strong></td>
		<td>
					<input type="text" name="subject_type" value="${deliveryExhibit.subject_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>JOB_NO</strong></td>
		<td>
					<input type="text" name="job_no" value="${deliveryExhibit.job_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_TO</strong></td>
		<td>
					<input type="text" name="offcode_to" value="${deliveryExhibit.offcode_to}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_FROM</strong></td>
		<td>
					<input type="text" name="offcode_from" value="${deliveryExhibit.offcode_from}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${deliveryExhibit.legislation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DELIVERY_BY</strong></td>
		<td>
					<input type="text" name="delivery_by" value="${deliveryExhibit.delivery_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${deliveryExhibit.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${deliveryExhibit.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${deliveryExhibit.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${deliveryExhibit.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STATUS</strong></td>
		<td>
					<input type="text" name="status" value="${deliveryExhibit.status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_INFORM</strong></td>
		<td>
					<input type="text" name="offcode_inform" value="${deliveryExhibit.offcode_inform}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBJECT</strong></td>
		<td>
					<input type="text" name="subject" value="${deliveryExhibit.subject}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DELIVERY_DATE</strong></td>
		<td>
					<input id="delivery_date" name="delivery_date" type="text" class="textdate" value="<fmt:formatDate value="${deliveryExhibit.delivery_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('delivery_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DELIVERY_CODE</strong></td>
		<td>
					<input type="text" name="delivery_code" value="${deliveryExhibit.delivery_code}"/>
				</td>
	</tr>
	</table>