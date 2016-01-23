








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=DutyTable&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${dutyTable.id}</td>
	</tr>
	<tr>
			<td>law_duty_code</td>
		<td>
					${dutyTable.law_duty_code}
				</td>
		</tr>
	<tr>
			<td>upd_date</td>
		<td>
					<fmt:formatDate value="${dutyTable.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>upd_userid</td>
		<td>
					${dutyTable.upd_userid}
				</td>
		</tr>
	<tr>
			<td>end_date</td>
		<td>
					<fmt:formatDate value="${dutyTable.end_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>begin_date</td>
		<td>
					<fmt:formatDate value="${dutyTable.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>duty_name</td>
		<td>
					${dutyTable.duty_name}
				</td>
		</tr>
	<tr>
			<td>duty_code</td>
		<td>
					${dutyTable.duty_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>