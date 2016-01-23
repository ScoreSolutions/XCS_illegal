








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=SuspectRole&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>ROLE_STATUS</td>
					<td>ROLE_DESC</td>
					<td>ROLE_LEVEL</td>
					<td>ROLE_NAME</td>
					<td>ROLE_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${suspectRoles}"  var="suspectRole">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${suspectRole.id}</td>
			<td>
					<fmt:formatDate value="${suspectRole.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspectRole.update_by}
				</td>
				<td>
					<fmt:formatDate value="${suspectRole.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspectRole.create_by}
				</td>
				<td>
					${suspectRole.role_status}
				</td>
				<td>
					${suspectRole.role_desc}
				</td>
				<td>
					${suspectRole.role_level}
				</td>
				<td>
					${suspectRole.role_name}
				</td>
				<td>
					${suspectRole.role_code}
				</td>
						<td><a href="<c:url value='/process2?action=SuspectRole&cmd=view&id='/>${suspectRole.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=SuspectRole&cmd=edit&id='/>${suspectRole.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=SuspectRole&cmd=delete&id='/>${suspectRole.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=SuspectRole&cmd=add'/>">Add New Record</a>
</form>