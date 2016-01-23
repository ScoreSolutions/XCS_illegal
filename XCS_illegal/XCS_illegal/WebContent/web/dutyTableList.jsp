








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=DutyTable&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>LAW_DUTY_CODE</td>
					<td>UPD_DATE</td>
					<td>UPD_USERID</td>
					<td>END_DATE</td>
					<td>BEGIN_DATE</td>
					<td>DUTY_NAME</td>
					<td>DUTY_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${dutyTables}"  var="dutyTable">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${dutyTable.id}</td>
			<td>
					${dutyTable.law_duty_code}
				</td>
				<td>
					<fmt:formatDate value="${dutyTable.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${dutyTable.upd_userid}
				</td>
				<td>
					<fmt:formatDate value="${dutyTable.end_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${dutyTable.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${dutyTable.duty_name}
				</td>
				<td>
					${dutyTable.duty_code}
				</td>
						<td><a href="<c:url value='/process2?action=DutyTable&cmd=view&id='/>${dutyTable.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=DutyTable&cmd=edit&id='/>${dutyTable.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=DutyTable&cmd=delete&id='/>${dutyTable.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=DutyTable&cmd=add'/>">Add New Record</a>
</form>