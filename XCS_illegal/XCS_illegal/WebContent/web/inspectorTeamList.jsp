








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=InspectorTeam&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>OFFCODE_DIV</td>
					<td>OFFCODE_DEPT</td>
					<td>OFFCODE_LEADER</td>
					<td>POSCODE_LEADER</td>
					<td>STAFF_IDCARDNO_LEADER</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>INSPECTOR_NAME</td>
					<td>INSPECTOR_CODE</td>
					<td>APPOINT_DATE</td>
					<td>APPOINT_NO</td>
					<td>JOB_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${inspectorTeams}"  var="inspectorTeam">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${inspectorTeam.id}</td>
			<td>
					${inspectorTeam.offcode_div}
				</td>
				<td>
					${inspectorTeam.offcode_dept}
				</td>
				<td>
					${inspectorTeam.offcode_leader}
				</td>
				<td>
					${inspectorTeam.poscode_leader}
				</td>
				<td>
					${inspectorTeam.staff_idcardno_leader}
				</td>
				<td>
					<fmt:formatDate value="${inspectorTeam.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${inspectorTeam.update_by}
				</td>
				<td>
					<fmt:formatDate value="${inspectorTeam.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${inspectorTeam.create_by}
				</td>
				<td>
					${inspectorTeam.inspector_name}
				</td>
				<td>
					${inspectorTeam.inspector_code}
				</td>
				<td>
					<fmt:formatDate value="${inspectorTeam.appoint_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${inspectorTeam.appoint_no}
				</td>
				<td>
					${inspectorTeam.job_no}
				</td>
						<td><a href="<c:url value='/process2?action=InspectorTeam&cmd=view&id='/>${inspectorTeam.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=InspectorTeam&cmd=edit&id='/>${inspectorTeam.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=InspectorTeam&cmd=delete&id='/>${inspectorTeam.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=InspectorTeam&cmd=add'/>">Add New Record</a>
</form>