








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ProductType&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ACTIVE</td>
					<td>GROUP_ID</td>
					<td>TYPE_NAME</td>
					<td>TYPE_CODE</td>
					<td>DUTY_CODE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${productTypes}"  var="productType">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${productType.id}</td>
			<td>
					${productType.active}
				</td>
				<td>
					${productType.group_id}
				</td>
				<td>
					${productType.type_name}
				</td>
				<td>
					${productType.type_code}
				</td>
				<td>
					${productType.duty_code}
				</td>
				<td>
					<fmt:formatDate value="${productType.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${productType.update_by}
				</td>
				<td>
					<fmt:formatDate value="${productType.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${productType.create_by}
				</td>
						<td><a href="<c:url value='/process2?action=ProductType&cmd=view&id='/>${productType.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ProductType&cmd=edit&id='/>${productType.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ProductType&cmd=delete&id='/>${productType.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ProductType&cmd=add'/>">Add New Record</a>
</form>