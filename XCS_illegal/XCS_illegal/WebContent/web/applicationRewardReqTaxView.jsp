








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationRewardReqTax&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationRewardReqTax.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqTax.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationRewardReqTax.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationRewardReqTax.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationRewardReqTax.create_by}
				</td>
		</tr>
	<tr>
			<td>offcode_approve</td>
		<td>
					${applicationRewardReqTax.offcode_approve}
				</td>
		</tr>
	<tr>
			<td>poscode_approve</td>
		<td>
					${applicationRewardReqTax.poscode_approve}
				</td>
		</tr>
	<tr>
			<td>staff_id_approve</td>
		<td>
					${applicationRewardReqTax.staff_id_approve}
				</td>
		</tr>
	<tr>
			<td>approve_lean</td>
		<td>
					${applicationRewardReqTax.approve_lean}
				</td>
		</tr>
	<tr>
			<td>offcode_ask</td>
		<td>
					${applicationRewardReqTax.offcode_ask}
				</td>
		</tr>
	<tr>
			<td>poscode_ask</td>
		<td>
					${applicationRewardReqTax.poscode_ask}
				</td>
		</tr>
	<tr>
			<td>staff_id_ask</td>
		<td>
					${applicationRewardReqTax.staff_id_ask}
				</td>
		</tr>
	<tr>
			<td>department_name_send</td>
		<td>
					${applicationRewardReqTax.department_name_send}
				</td>
		</tr>
	<tr>
			<td>ask_lean</td>
		<td>
					${applicationRewardReqTax.ask_lean}
				</td>
		</tr>
	<tr>
			<td>offcode_confirm</td>
		<td>
					${applicationRewardReqTax.offcode_confirm}
				</td>
		</tr>
	<tr>
			<td>poscode_confirm</td>
		<td>
					${applicationRewardReqTax.poscode_confirm}
				</td>
		</tr>
	<tr>
			<td>staff_id_confirm</td>
		<td>
					${applicationRewardReqTax.staff_id_confirm}
				</td>
		</tr>
	<tr>
			<td>application_reward_request_id</td>
		<td>
					${applicationRewardReqTax.application_reward_request_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>