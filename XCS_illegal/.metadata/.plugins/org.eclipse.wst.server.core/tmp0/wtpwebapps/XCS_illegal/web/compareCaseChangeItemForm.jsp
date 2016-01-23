








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${compareCaseChangeItem.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${compareCaseChangeItem.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${compareCaseChangeItem.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${compareCaseChangeItem.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${compareCaseChangeItem.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_ARREST_LAWBREAKER</strong></td>
		<td>
					<input type="text" name="application_arrest_lawbreaker" value="${compareCaseChangeItem.application_arrest_lawbreaker}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PAPER_NO</strong></td>
		<td>
					<input type="text" name="paper_no" value="${compareCaseChangeItem.paper_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INV_NO</strong></td>
		<td>
					<input type="text" name="inv_no" value="${compareCaseChangeItem.inv_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BOOK_NO</strong></td>
		<td>
					<input type="text" name="book_no" value="${compareCaseChangeItem.book_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>AUTO_INV_NO</strong></td>
		<td>
					<input type="text" name="auto_inv_no" value="${compareCaseChangeItem.auto_inv_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_CASE_CHANGE_ID</strong></td>
		<td>
					<input type="text" name="compare_case_change_id" value="${compareCaseChangeItem.compare_case_change_id}"/>
				</td>
	</tr>
	</table>