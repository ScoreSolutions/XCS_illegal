








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=BookImpeachment&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${bookImpeachment.id}</td>
	</tr>
	<tr>
			<td>case_fine</td>
		<td>
					${bookImpeachment.case_fine}
				</td>
		</tr>
	<tr>
			<td>case_last_date</td>
		<td>
					<fmt:formatDate value="${bookImpeachment.case_last_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>case_result</td>
		<td>
					${bookImpeachment.case_result}
				</td>
		</tr>
	<tr>
			<td>case_last</td>
		<td>
					${bookImpeachment.case_last}
				</td>
		</tr>
	<tr>
			<td>case_quality</td>
		<td>
					${bookImpeachment.case_quality}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${bookImpeachment.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${bookImpeachment.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${bookImpeachment.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${bookImpeachment.create_by}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${bookImpeachment.track_no}
				</td>
		</tr>
	<tr>
			<td>staff_id_sue</td>
		<td>
					${bookImpeachment.staff_id_sue}
				</td>
		</tr>
	<tr>
			<td>case_date</td>
		<td>
					<fmt:formatDate value="${bookImpeachment.case_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>case_id</td>
		<td>
					${bookImpeachment.case_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>