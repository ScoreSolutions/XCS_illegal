








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=PictureCategory&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ACTIVE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>CATEGORY_NAME</td>
					<td>CATEGORY_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${pictureCategorys}"  var="pictureCategory">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${pictureCategory.id}</td>
			<td>
					${pictureCategory.active}
				</td>
				<td>
					<fmt:formatDate value="${pictureCategory.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${pictureCategory.update_by}
				</td>
				<td>
					<fmt:formatDate value="${pictureCategory.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${pictureCategory.create_by}
				</td>
				<td>
					${pictureCategory.category_name}
				</td>
				<td>
					${pictureCategory.category_code}
				</td>
						<td><a href="<c:url value='/process2?action=PictureCategory&cmd=view&id='/>${pictureCategory.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=PictureCategory&cmd=edit&id='/>${pictureCategory.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=PictureCategory&cmd=delete&id='/>${pictureCategory.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=PictureCategory&cmd=add'/>">Add New Record</a>
</form>