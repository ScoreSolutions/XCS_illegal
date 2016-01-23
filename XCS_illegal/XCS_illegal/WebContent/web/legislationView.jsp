








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Legislation&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${legislation.id}</td>
	</tr>
	<tr>
			<td>compare_request_section</td>
		<td>
					${legislation.compare_request_section}
				</td>
		</tr>
	<tr>
			<td>notice_default_compare</td>
		<td>
					${legislation.notice_default_compare}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${legislation.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${legislation.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${legislation.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${legislation.create_by}
				</td>
		</tr>
	<tr>
			<td>legislation_name</td>
		<td>
					${legislation.legislation_name}
				</td>
		</tr>
	<tr>
			<td>legislation_code</td>
		<td>
					${legislation.legislation_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>