








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ErrorLog&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${errorLog.id}</td>
	</tr>
	<tr>
			<td>browser</td>
		<td>
					${errorLog.browser}
				</td>
		</tr>
	<tr>
			<td>sessionid</td>
		<td>
					${errorLog.sessionid}
				</td>
		</tr>
	<tr>
			<td>ip_address</td>
		<td>
					${errorLog.ip_address}
				</td>
		</tr>
	<tr>
			<td>error_desc</td>
		<td>
					${errorLog.error_desc}
				</td>
		</tr>
	<tr>
			<td>error_date</td>
		<td>
					<fmt:formatDate value="${errorLog.error_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>userid</td>
		<td>
					${errorLog.userid}
				</td>
		</tr>
	<tr>
		</tr>
</table>