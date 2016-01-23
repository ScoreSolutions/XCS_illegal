








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=InspectorTeamStaff&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>STAFF_OFFCODE</td>
					<td>STAFF_POSCODE</td>
					<td>STAFF_IDCARDNO</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>STATUS</td>
					<td>LAST_NAME</td>
					<td>FIRST_NAME</td>
					<td>TITLE_ID</td>
					<td>STAFF_CODE</td>
					<td>INSPECTOR_TEAM_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${inspectorTeamStaffs}"  var="inspectorTeamStaff">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${inspectorTeamStaff.id}</td>
			<td>
					${inspectorTeamStaff.staff_offcode}
				</td>
				<td>
					${inspectorTeamStaff.staff_poscode}
				</td>
				<td>
					${inspectorTeamStaff.staff_idcardno}
				</td>
				<td>
					<fmt:formatDate value="${inspectorTeamStaff.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${inspectorTeamStaff.update_by}
				</td>
				<td>
					<fmt:formatDate value="${inspectorTeamStaff.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${inspectorTeamStaff.create_by}
				</td>
				<td>
					${inspectorTeamStaff.status}
				</td>
				<td>
					${inspectorTeamStaff.last_name}
				</td>
				<td>
					${inspectorTeamStaff.first_name}
				</td>
				<td>
					${inspectorTeamStaff.title_id}
				</td>
				<td>
					${inspectorTeamStaff.staff_code}
				</td>
				<td>
					${inspectorTeamStaff.inspector_team_id}
				</td>
						<td><a href="<c:url value='/process2?action=InspectorTeamStaff&cmd=view&id='/>${inspectorTeamStaff.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=InspectorTeamStaff&cmd=edit&id='/>${inspectorTeamStaff.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=InspectorTeamStaff&cmd=delete&id='/>${inspectorTeamStaff.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=InspectorTeamStaff&cmd=add'/>">Add New Record</a>
</form>