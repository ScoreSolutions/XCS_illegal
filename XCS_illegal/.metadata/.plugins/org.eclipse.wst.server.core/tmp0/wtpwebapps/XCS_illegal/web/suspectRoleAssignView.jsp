








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SuspectRoleAssign&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectRoleAssign.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${suspectRoleAssign.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${suspectRoleAssign.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${suspectRoleAssign.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${suspectRoleAssign.create_by}
				</td>
		</tr>
	<tr>
			<td>description</td>
		<td>
					${suspectRoleAssign.description}
				</td>
		</tr>
	<tr>
			<td>suspect_role_id</td>
		<td>
					${suspectRoleAssign.suspect_role_id}
				</td>
		</tr>
	<tr>
			<td>staff_idcardno</td>
		<td>
					${suspectRoleAssign.staff_idcardno}
				</td>
		</tr>
	<tr>
		</tr>
</table>