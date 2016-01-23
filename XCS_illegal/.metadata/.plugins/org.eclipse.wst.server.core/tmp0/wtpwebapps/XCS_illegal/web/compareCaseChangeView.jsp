








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=CompareCaseChange&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${compareCaseChange.id}</td>
	</tr>
	<tr>
			<td>cancel_by</td>
		<td>
					${compareCaseChange.cancel_by}
				</td>
		</tr>
	<tr>
			<td>cancel_date</td>
		<td>
					<fmt:formatDate value="${compareCaseChange.cancel_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>iscancel</td>
		<td>
					${compareCaseChange.iscancel}
				</td>
		</tr>
	<tr>
			<td>treasury_money_old</td>
		<td>
					${compareCaseChange.treasury_money_old}
				</td>
		</tr>
	<tr>
			<td>reward_money_old</td>
		<td>
					${compareCaseChange.reward_money_old}
				</td>
		</tr>
	<tr>
			<td>bribe_money_old</td>
		<td>
					${compareCaseChange.bribe_money_old}
				</td>
		</tr>
	<tr>
			<td>case_fine_old</td>
		<td>
					${compareCaseChange.case_fine_old}
				</td>
		</tr>
	<tr>
			<td>change_reason</td>
		<td>
					${compareCaseChange.change_reason}
				</td>
		</tr>
	<tr>
			<td>inv_type</td>
		<td>
					${compareCaseChange.inv_type}
				</td>
		</tr>
	<tr>
			<td>change_date</td>
		<td>
					<fmt:formatDate value="${compareCaseChange.change_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${compareCaseChange.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${compareCaseChange.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${compareCaseChange.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${compareCaseChange.create_by}
				</td>
		</tr>
	<tr>
			<td>change_money</td>
		<td>
					${compareCaseChange.change_money}
				</td>
		</tr>
	<tr>
			<td>change_type</td>
		<td>
					${compareCaseChange.change_type}
				</td>
		</tr>
	<tr>
			<td>compare_case_id</td>
		<td>
					${compareCaseChange.compare_case_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>