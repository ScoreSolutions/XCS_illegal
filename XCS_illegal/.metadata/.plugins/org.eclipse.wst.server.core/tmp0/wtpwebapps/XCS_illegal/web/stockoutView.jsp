








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Stockout&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${stockout.id}</td>
	</tr>
	<tr>
			<td>subject_type</td>
		<td>
					${stockout.subject_type}
				</td>
		</tr>
	<tr>
			<td>transfer_by</td>
		<td>
					${stockout.transfer_by}
				</td>
		</tr>
	<tr>
			<td>job_no</td>
		<td>
					${stockout.job_no}
				</td>
		</tr>
	<tr>
			<td>offcode_to</td>
		<td>
					${stockout.offcode_to}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${stockout.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${stockout.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${stockout.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${stockout.create_by}
				</td>
		</tr>
	<tr>
			<td>status</td>
		<td>
					${stockout.status}
				</td>
		</tr>
	<tr>
			<td>remarks</td>
		<td>
					${stockout.remarks}
				</td>
		</tr>
	<tr>
			<td>legislation_id</td>
		<td>
					${stockout.legislation_id}
				</td>
		</tr>
	<tr>
			<td>report_to_staff</td>
		<td>
					${stockout.report_to_staff}
				</td>
		</tr>
	<tr>
			<td>subject</td>
		<td>
					${stockout.subject}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${stockout.offcode}
				</td>
		</tr>
	<tr>
			<td>stockout_date</td>
		<td>
					<fmt:formatDate value="${stockout.stockout_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>stockout_code</td>
		<td>
					${stockout.stockout_code}
				</td>
		</tr>
	<tr>
			<td>stockout_type</td>
		<td>
					${stockout.stockout_type}
				</td>
		</tr>
	<tr>
		</tr>
</table>