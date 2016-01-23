








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">
	function confirmBox(str_text)
	{
  		var r = confirm(str_text);
  		return r;
	}
</script>
<table border="1">
	<tr><td><%=pageUtil.getPagination()%></td><td><%=pageUtil.getPageStatus()%></td></tr>
</table>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationRewardReqTax&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>OFFCODE_APPROVE</td>
					<td>POSCODE_APPROVE</td>
					<td>STAFF_ID_APPROVE</td>
					<td>APPROVE_LEAN</td>
					<td>OFFCODE_ASK</td>
					<td>POSCODE_ASK</td>
					<td>STAFF_ID_ASK</td>
					<td>DEPARTMENT_NAME_SEND</td>
					<td>ASK_LEAN</td>
					<td>OFFCODE_CONFIRM</td>
					<td>POSCODE_CONFIRM</td>
					<td>STAFF_ID_CONFIRM</td>
					<td>APPLICATION_REWARD_REQUEST_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationRewardReqTaxs}"  var="applicationRewardReqTax">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationRewardReqTax.id}</td>
			<td>
					<fmt:formatDate value="${applicationRewardReqTax.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardReqTax.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationRewardReqTax.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardReqTax.create_by}
				</td>
				<td>
					${applicationRewardReqTax.offcode_approve}
				</td>
				<td>
					${applicationRewardReqTax.poscode_approve}
				</td>
				<td>
					${applicationRewardReqTax.staff_id_approve}
				</td>
				<td>
					${applicationRewardReqTax.approve_lean}
				</td>
				<td>
					${applicationRewardReqTax.offcode_ask}
				</td>
				<td>
					${applicationRewardReqTax.poscode_ask}
				</td>
				<td>
					${applicationRewardReqTax.staff_id_ask}
				</td>
				<td>
					${applicationRewardReqTax.department_name_send}
				</td>
				<td>
					${applicationRewardReqTax.ask_lean}
				</td>
				<td>
					${applicationRewardReqTax.offcode_confirm}
				</td>
				<td>
					${applicationRewardReqTax.poscode_confirm}
				</td>
				<td>
					${applicationRewardReqTax.staff_id_confirm}
				</td>
				<td>
					${applicationRewardReqTax.application_reward_request_id}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationRewardReqTax&cmd=view&id='/>${applicationRewardReqTax.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardReqTax&cmd=edit&id='/>${applicationRewardReqTax.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardReqTax&cmd=delete&id='/>${applicationRewardReqTax.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationRewardReqTax&cmd=add'/>">Add New Record</a>
</form>