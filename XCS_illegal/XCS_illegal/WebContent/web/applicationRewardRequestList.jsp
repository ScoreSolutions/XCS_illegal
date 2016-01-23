








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationRewardRequest&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>COMPARE_CASE_ID</td>
					<td>RECEIVE_DATE</td>
					<td>INFORM_POSITION</td>
					<td>INFORM_NAME</td>
					<td>POSCODE_RECEIVE</td>
					<td>STAFF_ID_RECEIVE</td>
					<td>POSCODE_REQUEST</td>
					<td>STAFF_ID_REQUEST</td>
					<td>OFFCODE</td>
					<td>REQUEST_DATE</td>
					<td>REQUEST_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationRewardRequests}"  var="applicationRewardRequest">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationRewardRequest.id}</td>
			<td>
					<fmt:formatDate value="${applicationRewardRequest.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardRequest.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationRewardRequest.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardRequest.create_by}
				</td>
				<td>
					${applicationRewardRequest.compare_case_id}
				</td>
				<td>
					<fmt:formatDate value="${applicationRewardRequest.receive_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardRequest.inform_position}
				</td>
				<td>
					${applicationRewardRequest.inform_name}
				</td>
				<td>
					${applicationRewardRequest.poscode_receive}
				</td>
				<td>
					${applicationRewardRequest.staff_id_receive}
				</td>
				<td>
					${applicationRewardRequest.poscode_request}
				</td>
				<td>
					${applicationRewardRequest.staff_id_request}
				</td>
				<td>
					${applicationRewardRequest.offcode}
				</td>
				<td>
					<fmt:formatDate value="${applicationRewardRequest.request_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationRewardRequest.request_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationRewardRequest&cmd=view&id='/>${applicationRewardRequest.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardRequest&cmd=edit&id='/>${applicationRewardRequest.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationRewardRequest&cmd=delete&id='/>${applicationRewardRequest.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationRewardRequest&cmd=add'/>">Add New Record</a>
</form>