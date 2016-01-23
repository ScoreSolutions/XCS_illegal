








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationRewardReqTobacco&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>ARREST_OPINION</td>
					<td>COMMAND</td>
					<td>LAW_DIRECTOR_OPINION</td>
					<td>LAW_DIRECTOR_POSITION</td>
					<td>LAWYER_OPINION</td>
					<td>OFFCODE_ARREST</td>
					<td>POSCODE_ARREST</td>
					<td>STAFF_ID_ARREST</td>
					<td>APPLICATION_REWARD_REQUEST_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationRewardReqTobaccos}"  var="applicationRewardReqTobacco">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationRewardReqTobacco.id}</td>
			<td>
					<fmt:formatDate value="${applicationRewardReqTobacco.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardReqTobacco.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationRewardReqTobacco.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardReqTobacco.create_by}
				</td>
				<td>
					${applicationRewardReqTobacco.arrest_opinion}
				</td>
				<td>
					${applicationRewardReqTobacco.command}
				</td>
				<td>
					${applicationRewardReqTobacco.law_director_opinion}
				</td>
				<td>
					${applicationRewardReqTobacco.law_director_position}
				</td>
				<td>
					${applicationRewardReqTobacco.lawyer_opinion}
				</td>
				<td>
					${applicationRewardReqTobacco.offcode_arrest}
				</td>
				<td>
					${applicationRewardReqTobacco.poscode_arrest}
				</td>
				<td>
					${applicationRewardReqTobacco.staff_id_arrest}
				</td>
				<td>
					${applicationRewardReqTobacco.application_reward_request_id}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationRewardReqTobacco&cmd=view&id='/>${applicationRewardReqTobacco.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardReqTobacco&cmd=edit&id='/>${applicationRewardReqTobacco.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardReqTobacco&cmd=delete&id='/>${applicationRewardReqTobacco.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationRewardReqTobacco&cmd=add'/>">Add New Record</a>
</form>