








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=BookImpeachment&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>CASE_FINE</td>
					<td>CASE_LAST_DATE</td>
					<td>CASE_RESULT</td>
					<td>CASE_LAST</td>
					<td>CASE_QUALITY</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>TRACK_NO</td>
					<td>STAFF_ID_SUE</td>
					<td>CASE_DATE</td>
					<td>CASE_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${bookImpeachments}"  var="bookImpeachment">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${bookImpeachment.id}</td>
			<td>
					${bookImpeachment.case_fine}
				</td>
				<td>
					<fmt:formatDate value="${bookImpeachment.case_last_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${bookImpeachment.case_result}
				</td>
				<td>
					${bookImpeachment.case_last}
				</td>
				<td>
					${bookImpeachment.case_quality}
				</td>
				<td>
					<fmt:formatDate value="${bookImpeachment.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${bookImpeachment.update_by}
				</td>
				<td>
					<fmt:formatDate value="${bookImpeachment.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${bookImpeachment.create_by}
				</td>
				<td>
					${bookImpeachment.track_no}
				</td>
				<td>
					${bookImpeachment.staff_id_sue}
				</td>
				<td>
					<fmt:formatDate value="${bookImpeachment.case_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${bookImpeachment.case_id}
				</td>
						<td><a href="<c:url value='/process2?action=BookImpeachment&cmd=view&id='/>${bookImpeachment.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=BookImpeachment&cmd=edit&id='/>${bookImpeachment.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=BookImpeachment&cmd=delete&id='/>${bookImpeachment.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=BookImpeachment&cmd=add'/>">Add New Record</a>
</form>