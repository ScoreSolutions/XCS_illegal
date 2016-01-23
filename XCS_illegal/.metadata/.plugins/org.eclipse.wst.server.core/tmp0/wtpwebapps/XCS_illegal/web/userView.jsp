








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=User&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${user.id}</td>
	</tr>
	<tr>
			<td>salary</td>
		<td>
					${user.salary}
				</td>
		</tr>
	<tr>
			<td>parent_id</td>
		<td>
					${user.parent_id}
				</td>
		</tr>
	<tr>
			<td>photo</td>
		<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=USERS&id=${user.id}" widht=100 height=100>
				</td>
		</tr>
	<tr>
			<td>sex</td>
		<td>
					${user.sex}
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${user.update_by}
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${user.create_by}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${user.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${user.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>user_pass</td>
		<td>
					${user.user_pass}
				</td>
		</tr>
	<tr>
			<td>user_login</td>
		<td>
					${user.user_login}
				</td>
		</tr>
	<tr>
		</tr>
</table>