








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationRewardReqTeam&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqTeam.id}</td>
	</tr>
	<tr>
			<td>duty_status_id</td>
		<td>
					${applicationRewardReqTeam.duty_status_id}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqTeam.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationRewardReqTeam.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqTeam.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationRewardReqTeam.create_by}
				</td>
		</tr>
	<tr>
			<td>staff_level</td>
		<td>
					${applicationRewardReqTeam.staff_level}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${applicationRewardReqTeam.offcode}
				</td>
		</tr>
	<tr>
			<td>poscode</td>
		<td>
					${applicationRewardReqTeam.poscode}
				</td>
		</tr>
	<tr>
			<td>staff_idcardno</td>
		<td>
					${applicationRewardReqTeam.staff_idcardno}
				</td>
		</tr>
	<tr>
			<td>application_reward_request_id</td>
		<td>
					${applicationRewardReqTeam.application_reward_request_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>