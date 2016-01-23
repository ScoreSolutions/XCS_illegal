








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Unit&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ABBNAME</td>
					<td>ENNAME</td>
					<td>THNAME</td>
					<td>UNIT_CODE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${units}"  var="unit">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${unit.id}</td>
			<td>
					${unit.abbname}
				</td>
				<td>
					${unit.enname}
				</td>
				<td>
					${unit.thname}
				</td>
				<td>
					${unit.unit_code}
				</td>
				<td>
					<fmt:formatDate value="${unit.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${unit.update_by}
				</td>
				<td>
					<fmt:formatDate value="${unit.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${unit.create_by}
				</td>
						<td><a href="<c:url value='/process2?action=Unit&cmd=view&id='/>${unit.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Unit&cmd=edit&id='/>${unit.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Unit&cmd=delete&id='/>${unit.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Unit&cmd=add'/>">Add New Record</a>
</form>