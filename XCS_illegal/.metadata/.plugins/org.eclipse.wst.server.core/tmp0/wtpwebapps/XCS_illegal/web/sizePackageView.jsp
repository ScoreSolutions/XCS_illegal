








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SizePackage&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${sizePackage.id}</td>
	</tr>
	<tr>
			<td>upd_userid</td>
		<td>
					${sizePackage.upd_userid}
				</td>
		</tr>
	<tr>
			<td>upd_date</td>
		<td>
					<fmt:formatDate value="${sizePackage.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>end_date</td>
		<td>
					<fmt:formatDate value="${sizePackage.end_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>begin_date</td>
		<td>
					<fmt:formatDate value="${sizePackage.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>unit_code</td>
		<td>
					${sizePackage.unit_code}
				</td>
		</tr>
	<tr>
			<td>size_desc</td>
		<td>
					${sizePackage.size_desc}
				</td>
		</tr>
	<tr>
			<td>size_code</td>
		<td>
					${sizePackage.size_code}
				</td>
		</tr>
	<tr>
			<td>duty_code</td>
		<td>
					${sizePackage.duty_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>