








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Sysconfig&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>DESCRIPTION</td>
					<td>DATATYPE</td>
					<td>CONFIG_VALUE</td>
					<td>CONFIG_NAME</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${sysconfigs}"  var="sysconfig">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${sysconfig.id}</td>
			<td>
					${sysconfig.description}
				</td>
				<td>
					${sysconfig.datatype}
				</td>
				<td>
					${sysconfig.config_value}
				</td>
				<td>
					${sysconfig.config_name}
				</td>
						<td><a href="<c:url value='/process2?action=Sysconfig&cmd=view&id='/>${sysconfig.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Sysconfig&cmd=edit&id='/>${sysconfig.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Sysconfig&cmd=delete&id='/>${sysconfig.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Sysconfig&cmd=add'/>">Add New Record</a>
</form>