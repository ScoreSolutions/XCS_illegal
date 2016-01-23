








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationRewardReqReport&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>COMMAND</td>
					<td>COMMENT_COMMANDER</td>
					<td>OFFCODE_COMMANDER</td>
					<td>POSCODE_COMMANDER</td>
					<td>STAFF_ID_COMMANDER</td>
					<td>COMMENT_INITIAL</td>
					<td>OFFCODE_INITIAL</td>
					<td>POSCODE_INITIAL</td>
					<td>STAFF_ID_INITIAL</td>
					<td>COMMENT_CONTROL</td>
					<td>OFFCODE_CONTROL</td>
					<td>POSCODE_CONTROL</td>
					<td>STAFF_ID_CONTROL</td>
					<td>ABNORMALITY</td>
					<td>ISCHKCOUNT</td>
					<td>ISINFORM</td>
					<td>SUBJECT</td>
					<td>APPLICATION_REWARD_REQUEST_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationRewardReqReports}"  var="applicationRewardReqReport">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationRewardReqReport.id}</td>
			<td>
					<fmt:formatDate value="${applicationRewardReqReport.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardReqReport.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationRewardReqReport.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardReqReport.create_by}
				</td>
				<td>
					${applicationRewardReqReport.command}
				</td>
				<td>
					${applicationRewardReqReport.comment_commander}
				</td>
				<td>
					${applicationRewardReqReport.offcode_commander}
				</td>
				<td>
					${applicationRewardReqReport.poscode_commander}
				</td>
				<td>
					${applicationRewardReqReport.staff_id_commander}
				</td>
				<td>
					${applicationRewardReqReport.comment_initial}
				</td>
				<td>
					${applicationRewardReqReport.offcode_initial}
				</td>
				<td>
					${applicationRewardReqReport.poscode_initial}
				</td>
				<td>
					${applicationRewardReqReport.staff_id_initial}
				</td>
				<td>
					${applicationRewardReqReport.comment_control}
				</td>
				<td>
					${applicationRewardReqReport.offcode_control}
				</td>
				<td>
					${applicationRewardReqReport.poscode_control}
				</td>
				<td>
					${applicationRewardReqReport.staff_id_control}
				</td>
				<td>
					${applicationRewardReqReport.abnormality}
				</td>
				<td>
					${applicationRewardReqReport.ischkcount}
				</td>
				<td>
					${applicationRewardReqReport.isinform}
				</td>
				<td>
					${applicationRewardReqReport.subject}
				</td>
				<td>
					${applicationRewardReqReport.application_reward_request_id}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationRewardReqReport&cmd=view&id='/>${applicationRewardReqReport.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardReqReport&cmd=edit&id='/>${applicationRewardReqReport.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardReqReport&cmd=delete&id='/>${applicationRewardReqReport.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationRewardReqReport&cmd=add'/>">Add New Record</a>
</form>