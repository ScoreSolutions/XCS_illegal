








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Running&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>RUNNINGFIELD</td>
					<td>LENGTH</td>
					<td>YEAR</td>
					<td>MONTH</td>
					<td>ISOFFCODE</td>
					<td>CODE</td>
					<td>FIELDVALUE</td>
					<td>FIELDTYPE</td>
					<td>TBNAME</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${runnings}"  var="running">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${running.id}</td>
			<td>
					${running.runningfield}
				</td>
				<td>
					${running.length}
				</td>
				<td>
					${running.year}
				</td>
				<td>
					${running.month}
				</td>
				<td>
					${running.isoffcode}
				</td>
				<td>
					${running.code}
				</td>
				<td>
					${running.fieldvalue}
				</td>
				<td>
					${running.fieldtype}
				</td>
				<td>
					${running.tbname}
				</td>
						<td><a href="<c:url value='/process2?action=Running&cmd=view&id='/>${running.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Running&cmd=edit&id='/>${running.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Running&cmd=delete&id='/>${running.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Running&cmd=add'/>">Add New Record</a>
</form>