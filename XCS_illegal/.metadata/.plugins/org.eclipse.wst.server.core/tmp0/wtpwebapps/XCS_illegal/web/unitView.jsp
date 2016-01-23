








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Unit&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${unit.id}</td>
	</tr>
	<tr>
			<td>abbname</td>
		<td>
					${unit.abbname}
				</td>
		</tr>
	<tr>
			<td>enname</td>
		<td>
					${unit.enname}
				</td>
		</tr>
	<tr>
			<td>thname</td>
		<td>
					${unit.thname}
				</td>
		</tr>
	<tr>
			<td>unit_code</td>
		<td>
					${unit.unit_code}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${unit.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${unit.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${unit.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${unit.create_by}
				</td>
		</tr>
	<tr>
		</tr>
</table>