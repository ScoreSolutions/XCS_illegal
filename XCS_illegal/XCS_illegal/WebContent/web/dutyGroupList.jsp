








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=DutyGroup&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPD_DATE</td>
					<td>UPD_USERID</td>
					<td>END_DATE</td>
					<td>BEGIN_DATE</td>
					<td>SUB_GROUP_ID</td>
					<td>GROUP_STATUS</td>
					<td>GROUP_NAME</td>
					<td>GROUP_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${dutyGroups}"  var="dutyGroup">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${dutyGroup.id}</td>
			<td>
					<fmt:formatDate value="${dutyGroup.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${dutyGroup.upd_userid}
				</td>
				<td>
					<fmt:formatDate value="${dutyGroup.end_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${dutyGroup.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${dutyGroup.sub_group_id}
				</td>
				<td>
					${dutyGroup.group_status}
				</td>
				<td>
					${dutyGroup.group_name}
				</td>
				<td>
					${dutyGroup.group_id}
				</td>
						<td><a href="<c:url value='/process2?action=DutyGroup&cmd=view&id='/>${dutyGroup.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=DutyGroup&cmd=edit&id='/>${dutyGroup.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=DutyGroup&cmd=delete&id='/>${dutyGroup.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=DutyGroup&cmd=add'/>">Add New Record</a>
</form>