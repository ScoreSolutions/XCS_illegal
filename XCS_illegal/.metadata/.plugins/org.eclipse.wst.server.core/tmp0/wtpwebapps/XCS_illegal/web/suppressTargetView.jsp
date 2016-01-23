








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SuppressTarget&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suppressTarget.id}</td>
	</tr>
	<tr>
			<td>status</td>
		<td>
					${suppressTarget.status}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${suppressTarget.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${suppressTarget.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${suppressTarget.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${suppressTarget.create_by}
				</td>
		</tr>
	<tr>
			<td>product_group_id</td>
		<td>
					${suppressTarget.product_group_id}
				</td>
		</tr>
	<tr>
			<td>legislation_id</td>
		<td>
					${suppressTarget.legislation_id}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${suppressTarget.offcode}
				</td>
		</tr>
	<tr>
			<td>qty</td>
		<td>
					${suppressTarget.qty}
				</td>
		</tr>
	<tr>
			<td>budget_year</td>
		<td>
					${suppressTarget.budget_year}
				</td>
		</tr>
	<tr>
			<td>job_no</td>
		<td>
					${suppressTarget.job_no}
				</td>
		</tr>
	<tr>
			<td>job_date</td>
		<td>
					<fmt:formatDate value="${suppressTarget.job_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
		</tr>
</table>