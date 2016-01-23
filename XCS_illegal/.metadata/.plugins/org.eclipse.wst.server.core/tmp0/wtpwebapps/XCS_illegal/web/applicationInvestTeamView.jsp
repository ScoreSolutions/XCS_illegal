








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationInvestTeam&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationInvestTeam.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationInvestTeam.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationInvestTeam.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationInvestTeam.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationInvestTeam.create_by}
				</td>
		</tr>
	<tr>
			<td>offcode_staff</td>
		<td>
					${applicationInvestTeam.offcode_staff}
				</td>
		</tr>
	<tr>
			<td>poscode_staff</td>
		<td>
					${applicationInvestTeam.poscode_staff}
				</td>
		</tr>
	<tr>
			<td>staff_idcard_no</td>
		<td>
					${applicationInvestTeam.staff_idcard_no}
				</td>
		</tr>
	<tr>
			<td>application_invest_id</td>
		<td>
					${applicationInvestTeam.application_invest_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>