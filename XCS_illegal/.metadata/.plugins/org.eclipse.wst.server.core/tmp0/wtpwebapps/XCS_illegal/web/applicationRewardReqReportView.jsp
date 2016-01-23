








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationRewardReqReport&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqReport.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqReport.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationRewardReqReport.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqReport.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationRewardReqReport.create_by}
				</td>
		</tr>
	<tr>
			<td>command</td>
		<td>
					${applicationRewardReqReport.command}
				</td>
		</tr>
	<tr>
			<td>comment_commander</td>
		<td>
					${applicationRewardReqReport.comment_commander}
				</td>
		</tr>
	<tr>
			<td>offcode_commander</td>
		<td>
					${applicationRewardReqReport.offcode_commander}
				</td>
		</tr>
	<tr>
			<td>poscode_commander</td>
		<td>
					${applicationRewardReqReport.poscode_commander}
				</td>
		</tr>
	<tr>
			<td>staff_id_commander</td>
		<td>
					${applicationRewardReqReport.staff_id_commander}
				</td>
		</tr>
	<tr>
			<td>comment_initial</td>
		<td>
					${applicationRewardReqReport.comment_initial}
				</td>
		</tr>
	<tr>
			<td>offcode_initial</td>
		<td>
					${applicationRewardReqReport.offcode_initial}
				</td>
		</tr>
	<tr>
			<td>poscode_initial</td>
		<td>
					${applicationRewardReqReport.poscode_initial}
				</td>
		</tr>
	<tr>
			<td>staff_id_initial</td>
		<td>
					${applicationRewardReqReport.staff_id_initial}
				</td>
		</tr>
	<tr>
			<td>comment_control</td>
		<td>
					${applicationRewardReqReport.comment_control}
				</td>
		</tr>
	<tr>
			<td>offcode_control</td>
		<td>
					${applicationRewardReqReport.offcode_control}
				</td>
		</tr>
	<tr>
			<td>poscode_control</td>
		<td>
					${applicationRewardReqReport.poscode_control}
				</td>
		</tr>
	<tr>
			<td>staff_id_control</td>
		<td>
					${applicationRewardReqReport.staff_id_control}
				</td>
		</tr>
	<tr>
			<td>abnormality</td>
		<td>
					${applicationRewardReqReport.abnormality}
				</td>
		</tr>
	<tr>
			<td>ischkcount</td>
		<td>
					${applicationRewardReqReport.ischkcount}
				</td>
		</tr>
	<tr>
			<td>isinform</td>
		<td>
					${applicationRewardReqReport.isinform}
				</td>
		</tr>
	<tr>
			<td>subject</td>
		<td>
					${applicationRewardReqReport.subject}
				</td>
		</tr>
	<tr>
			<td>application_reward_request_id</td>
		<td>
					${applicationRewardReqReport.application_reward_request_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>