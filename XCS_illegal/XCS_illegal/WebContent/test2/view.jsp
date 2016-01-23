<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<a href="<c:url value="/process?action=User&cmd=list"/>">กลับหน้าแสดงรายการ</a>
<table><tr><td><%= formHandler.getFormMessage() %></td></tr></table>
<table border="1">
	<tr>
		<td bgcolor="blue">login_name:</td>
		<td><c:out value="${user.user_login}"/></td>
	</tr>
	<tr>
		<td bgcolor="blue"> password:</td>
		<td><c:out value="${user.user_pass}"/></td>
	</tr>
</table>