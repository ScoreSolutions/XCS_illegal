








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Court&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ACTIVE_STATUS</td>
					<td>COURT_NAME</td>
					<td>COURT_CODE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${courts}"  var="court">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${court.id}</td>
			<td>
					${court.active_status}
				</td>
				<td>
					${court.court_name}
				</td>
				<td>
					${court.court_code}
				</td>
				<td>
					<fmt:formatDate value="${court.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${court.update_by}
				</td>
				<td>
					<fmt:formatDate value="${court.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${court.create_by}
				</td>
						<td><a href="<c:url value='/process2?action=Court&cmd=view&id='/>${court.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Court&cmd=edit&id='/>${court.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Court&cmd=delete&id='/>${court.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Court&cmd=add'/>">Add New Record</a>
</form>