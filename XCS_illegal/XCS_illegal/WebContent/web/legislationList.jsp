








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Legislation&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>COMPARE_REQUEST_SECTION</td>
					<td>NOTICE_DEFAULT_COMPARE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>LEGISLATION_NAME</td>
					<td>LEGISLATION_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${legislations}"  var="legislation">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${legislation.id}</td>
			<td>
					${legislation.compare_request_section}
				</td>
				<td>
					${legislation.notice_default_compare}
				</td>
				<td>
					<fmt:formatDate value="${legislation.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${legislation.update_by}
				</td>
				<td>
					<fmt:formatDate value="${legislation.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${legislation.create_by}
				</td>
				<td>
					${legislation.legislation_name}
				</td>
				<td>
					${legislation.legislation_code}
				</td>
						<td><a href="<c:url value='/process2?action=Legislation&cmd=view&id='/>${legislation.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Legislation&cmd=edit&id='/>${legislation.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Legislation&cmd=delete&id='/>${legislation.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Legislation&cmd=add'/>">Add New Record</a>
</form>