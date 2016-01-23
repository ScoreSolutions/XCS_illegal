








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${stockin.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_RECEIVE</strong></td>
		<td>
					<input type="text" name="poscode_receive" value="${stockin.poscode_receive}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STOCKOUT_ID</strong></td>
		<td>
					<input type="text" name="stockout_id" value="${stockin.stockout_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${stockin.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${stockin.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${stockin.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${stockin.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STATUS</strong></td>
		<td>
					<input type="text" name="status" value="${stockin.status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${stockin.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RECEIVE_BY</strong></td>
		<td>
					<input type="text" name="receive_by" value="${stockin.receive_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DESTROY_LIMIT_DATE</strong></td>
		<td>
					<input id="destroy_limit_date" name="destroy_limit_date" type="text" class="textdate" value="<fmt:formatDate value="${stockin.destroy_limit_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('destroy_limit_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LOCATION</strong></td>
		<td>
					<input type="text" name="location" value="${stockin.location}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DELIVERY_EXHIBIT_ID</strong></td>
		<td>
					<input type="text" name="delivery_exhibit_id" value="${stockin.delivery_exhibit_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STOCKIN_DATE</strong></td>
		<td>
					<input id="stockin_date" name="stockin_date" type="text" class="textdate" value="<fmt:formatDate value="${stockin.stockin_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('stockin_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STOCKIN_CODE</strong></td>
		<td>
					<input type="text" name="stockin_code" value="${stockin.stockin_code}"/>
				</td>
	</tr>
	</table>