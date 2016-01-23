








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=DutyGroup&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${dutyGroup.id}</td>
	</tr>
	<tr>
			<td>upd_date</td>
		<td>
					<fmt:formatDate value="${dutyGroup.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>upd_userid</td>
		<td>
					${dutyGroup.upd_userid}
				</td>
		</tr>
	<tr>
			<td>end_date</td>
		<td>
					<fmt:formatDate value="${dutyGroup.end_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>begin_date</td>
		<td>
					<fmt:formatDate value="${dutyGroup.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>sub_group_id</td>
		<td>
					${dutyGroup.sub_group_id}
				</td>
		</tr>
	<tr>
			<td>group_status</td>
		<td>
					${dutyGroup.group_status}
				</td>
		</tr>
	<tr>
			<td>group_name</td>
		<td>
					${dutyGroup.group_name}
				</td>
		</tr>
	<tr>
			<td>group_id</td>
		<td>
					${dutyGroup.group_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>