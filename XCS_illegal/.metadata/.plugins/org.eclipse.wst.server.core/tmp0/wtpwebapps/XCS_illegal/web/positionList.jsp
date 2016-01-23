








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Position&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>POSITION_TYPE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>ABBNAME</td>
					<td>POSNAME</td>
					<td>POSCODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${positions}"  var="position">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${position.id}</td>
			<td>
					${position.position_type}
				</td>
				<td>
					<fmt:formatDate value="${position.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${position.update_by}
				</td>
				<td>
					<fmt:formatDate value="${position.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${position.create_by}
				</td>
				<td>
					${position.abbname}
				</td>
				<td>
					${position.posname}
				</td>
				<td>
					${position.poscode}
				</td>
						<td><a href="<c:url value='/process2?action=Position&cmd=view&id='/>${position.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Position&cmd=edit&id='/>${position.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Position&cmd=delete&id='/>${position.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Position&cmd=add'/>">Add New Record</a>
</form>