








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationArrestTeam&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>STAFF_OFFCODE</td>
					<td>STAFF_POSCODE</td>
					<td>STAFF_IDCARDNO</td>
					<td>DUTY_STATUS_ID</td>
					<td>STAFF_POSITION</td>
					<td>INSPECTOR_CODE</td>
					<td>STAFF_NO</td>
					<td>TRACK_NO</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationArrestTeams}"  var="applicationArrestTeam">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationArrestTeam.id}</td>
			<td>
					${applicationArrestTeam.staff_offcode}
				</td>
				<td>
					${applicationArrestTeam.staff_poscode}
				</td>
				<td>
					${applicationArrestTeam.staff_idcardno}
				</td>
				<td>
					${applicationArrestTeam.duty_status_id}
				</td>
				<td>
					${applicationArrestTeam.staff_position}
				</td>
				<td>
					${applicationArrestTeam.inspector_code}
				</td>
				<td>
					${applicationArrestTeam.staff_no}
				</td>
				<td>
					${applicationArrestTeam.track_no}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestTeam.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestTeam.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestTeam.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestTeam.create_by}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationArrestTeam&cmd=view&id='/>${applicationArrestTeam.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestTeam&cmd=edit&id='/>${applicationArrestTeam.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestTeam&cmd=delete&id='/>${applicationArrestTeam.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationArrestTeam&cmd=add'/>">Add New Record</a>
</form>