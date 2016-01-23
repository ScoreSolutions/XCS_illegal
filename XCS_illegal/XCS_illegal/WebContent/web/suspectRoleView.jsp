








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SuspectRole&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectRole.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${suspectRole.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${suspectRole.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${suspectRole.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${suspectRole.create_by}
				</td>
		</tr>
	<tr>
			<td>role_status</td>
		<td>
					${suspectRole.role_status}
				</td>
		</tr>
	<tr>
			<td>role_desc</td>
		<td>
					${suspectRole.role_desc}
				</td>
		</tr>
	<tr>
			<td>role_level</td>
		<td>
					${suspectRole.role_level}
				</td>
		</tr>
	<tr>
			<td>role_name</td>
		<td>
					${suspectRole.role_name}
				</td>
		</tr>
	<tr>
			<td>role_code</td>
		<td>
					${suspectRole.role_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>