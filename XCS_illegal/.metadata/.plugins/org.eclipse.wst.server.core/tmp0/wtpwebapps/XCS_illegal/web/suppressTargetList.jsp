








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=SuppressTarget&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>STATUS</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>PRODUCT_GROUP_ID</td>
					<td>LEGISLATION_ID</td>
					<td>OFFCODE</td>
					<td>QTY</td>
					<td>BUDGET_YEAR</td>
					<td>JOB_NO</td>
					<td>JOB_DATE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${suppressTargets}"  var="suppressTarget">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${suppressTarget.id}</td>
			<td>
					${suppressTarget.status}
				</td>
				<td>
					<fmt:formatDate value="${suppressTarget.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suppressTarget.update_by}
				</td>
				<td>
					<fmt:formatDate value="${suppressTarget.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suppressTarget.create_by}
				</td>
				<td>
					${suppressTarget.product_group_id}
				</td>
				<td>
					${suppressTarget.legislation_id}
				</td>
				<td>
					${suppressTarget.offcode}
				</td>
				<td>
					${suppressTarget.qty}
				</td>
				<td>
					${suppressTarget.budget_year}
				</td>
				<td>
					${suppressTarget.job_no}
				</td>
				<td>
					<fmt:formatDate value="${suppressTarget.job_date}" pattern="dd/MM/yyyy"/>
				</td>
						<td><a href="<c:url value='/process2?action=SuppressTarget&cmd=view&id='/>${suppressTarget.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=SuppressTarget&cmd=edit&id='/>${suppressTarget.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=SuppressTarget&cmd=delete&id='/>${suppressTarget.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=SuppressTarget&cmd=add'/>">Add New Record</a>
</form>