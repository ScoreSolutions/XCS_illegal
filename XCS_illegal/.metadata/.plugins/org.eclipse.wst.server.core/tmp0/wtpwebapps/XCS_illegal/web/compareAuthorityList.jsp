








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=CompareAuthority&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>AUTHORITY_NAME</td>
					<td>AUTHORITY_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${compareAuthoritys}"  var="compareAuthority">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${compareAuthority.id}</td>
			<td>
					<fmt:formatDate value="${compareAuthority.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareAuthority.update_by}
				</td>
				<td>
					<fmt:formatDate value="${compareAuthority.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareAuthority.create_by}
				</td>
				<td>
					${compareAuthority.authority_name}
				</td>
				<td>
					${compareAuthority.authority_code}
				</td>
						<td><a href="<c:url value='/process2?action=CompareAuthority&cmd=view&id='/>${compareAuthority.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=CompareAuthority&cmd=edit&id='/>${compareAuthority.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=CompareAuthority&cmd=delete&id='/>${compareAuthority.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=CompareAuthority&cmd=add'/>">Add New Record</a>
</form>