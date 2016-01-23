








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=CompareCaseChangeItem&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${compareCaseChangeItem.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${compareCaseChangeItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${compareCaseChangeItem.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${compareCaseChangeItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${compareCaseChangeItem.create_by}
				</td>
		</tr>
	<tr>
			<td>application_arrest_lawbreaker</td>
		<td>
					${compareCaseChangeItem.application_arrest_lawbreaker}
				</td>
		</tr>
	<tr>
			<td>paper_no</td>
		<td>
					${compareCaseChangeItem.paper_no}
				</td>
		</tr>
	<tr>
			<td>inv_no</td>
		<td>
					${compareCaseChangeItem.inv_no}
				</td>
		</tr>
	<tr>
			<td>book_no</td>
		<td>
					${compareCaseChangeItem.book_no}
				</td>
		</tr>
	<tr>
			<td>auto_inv_no</td>
		<td>
					${compareCaseChangeItem.auto_inv_no}
				</td>
		</tr>
	<tr>
			<td>compare_case_change_id</td>
		<td>
					${compareCaseChangeItem.compare_case_change_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>