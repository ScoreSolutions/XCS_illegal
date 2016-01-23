








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=RewardDivide&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${rewardDivide.id}</td>
	</tr>
	<tr>
			<td>remarks</td>
		<td>
					${rewardDivide.remarks}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${rewardDivide.offcode}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${rewardDivide.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${rewardDivide.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${rewardDivide.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${rewardDivide.create_by}
				</td>
		</tr>
	<tr>
			<td>compare_case_id</td>
		<td>
					${rewardDivide.compare_case_id}
				</td>
		</tr>
	<tr>
			<td>receive_date</td>
		<td>
					<fmt:formatDate value="${rewardDivide.receive_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>divide_date</td>
		<td>
					<fmt:formatDate value="${rewardDivide.divide_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>divide_no</td>
		<td>
					${rewardDivide.divide_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>