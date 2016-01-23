








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationRewardReqTobacco&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqTobacco.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqTobacco.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationRewardReqTobacco.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqTobacco.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationRewardReqTobacco.create_by}
				</td>
		</tr>
	<tr>
			<td>arrest_opinion</td>
		<td>
					${applicationRewardReqTobacco.arrest_opinion}
				</td>
		</tr>
	<tr>
			<td>command</td>
		<td>
					${applicationRewardReqTobacco.command}
				</td>
		</tr>
	<tr>
			<td>law_director_opinion</td>
		<td>
					${applicationRewardReqTobacco.law_director_opinion}
				</td>
		</tr>
	<tr>
			<td>law_director_position</td>
		<td>
					${applicationRewardReqTobacco.law_director_position}
				</td>
		</tr>
	<tr>
			<td>lawyer_opinion</td>
		<td>
					${applicationRewardReqTobacco.lawyer_opinion}
				</td>
		</tr>
	<tr>
			<td>offcode_arrest</td>
		<td>
					${applicationRewardReqTobacco.offcode_arrest}
				</td>
		</tr>
	<tr>
			<td>poscode_arrest</td>
		<td>
					${applicationRewardReqTobacco.poscode_arrest}
				</td>
		</tr>
	<tr>
			<td>staff_id_arrest</td>
		<td>
					${applicationRewardReqTobacco.staff_id_arrest}
				</td>
		</tr>
	<tr>
			<td>application_reward_request_id</td>
		<td>
					${applicationRewardReqTobacco.application_reward_request_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>