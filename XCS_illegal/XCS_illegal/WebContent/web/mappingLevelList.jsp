








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=MappingLevel&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>REMARKS</td>
					<td>P_LEVEL</td>
					<td>C_LEVEL</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${mappingLevels}"  var="mappingLevel">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${mappingLevel.id}</td>
			<td>
					${mappingLevel.remarks}
				</td>
				<td>
					${mappingLevel.p_level}
				</td>
				<td>
					${mappingLevel.c_level}
				</td>
						<td><a href="<c:url value='/process2?action=MappingLevel&cmd=view&id='/>${mappingLevel.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=MappingLevel&cmd=edit&id='/>${mappingLevel.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=MappingLevel&cmd=delete&id='/>${mappingLevel.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=MappingLevel&cmd=add'/>">Add New Record</a>
</form>