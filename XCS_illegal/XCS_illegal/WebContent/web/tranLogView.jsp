








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=TranLog&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${tranLog.id}</td>
	</tr>
	<tr>
			<td>browser</td>
		<td>
					${tranLog.browser}
				</td>
		</tr>
	<tr>
			<td>sessionid</td>
		<td>
					${tranLog.sessionid}
				</td>
		</tr>
	<tr>
			<td>ip_address</td>
		<td>
					${tranLog.ip_address}
				</td>
		</tr>
	<tr>
			<td>tran_desc</td>
		<td>
					${tranLog.tran_desc}
				</td>
		</tr>
	<tr>
			<td>tran_date</td>
		<td>
					<fmt:formatDate value="${tranLog.tran_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>userid</td>
		<td>
					${tranLog.userid}
				</td>
		</tr>
	<tr>
		</tr>
</table>