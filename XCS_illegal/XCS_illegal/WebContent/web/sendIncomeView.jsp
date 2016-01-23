








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SendIncome&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${sendIncome.id}</td>
	</tr>
	<tr>
			<td>status</td>
		<td>
					${sendIncome.status}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${sendIncome.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${sendIncome.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${sendIncome.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${sendIncome.create_by}
				</td>
		</tr>
	<tr>
			<td>inv_no</td>
		<td>
					${sendIncome.inv_no}
				</td>
		</tr>
	<tr>
			<td>poscode_approve</td>
		<td>
					${sendIncome.poscode_approve}
				</td>
		</tr>
	<tr>
			<td>staff_id_approve</td>
		<td>
					${sendIncome.staff_id_approve}
				</td>
		</tr>
	<tr>
			<td>poscode_send</td>
		<td>
					${sendIncome.poscode_send}
				</td>
		</tr>
	<tr>
			<td>staff_id_send</td>
		<td>
					${sendIncome.staff_id_send}
				</td>
		</tr>
	<tr>
			<td>fine_date_to</td>
		<td>
					<fmt:formatDate value="${sendIncome.fine_date_to}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>fine_date_from</td>
		<td>
					<fmt:formatDate value="${sendIncome.fine_date_from}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>legislation_id</td>
		<td>
					${sendIncome.legislation_id}
				</td>
		</tr>
	<tr>
			<td>offcode_area</td>
		<td>
					${sendIncome.offcode_area}
				</td>
		</tr>
	<tr>
			<td>offname_write</td>
		<td>
					${sendIncome.offname_write}
				</td>
		</tr>
	<tr>
			<td>offcode_write</td>
		<td>
					${sendIncome.offcode_write}
				</td>
		</tr>
	<tr>
			<td>send_doc_no</td>
		<td>
					${sendIncome.send_doc_no}
				</td>
		</tr>
	<tr>
			<td>send_date</td>
		<td>
					<fmt:formatDate value="${sendIncome.send_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>send_no</td>
		<td>
					${sendIncome.send_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>