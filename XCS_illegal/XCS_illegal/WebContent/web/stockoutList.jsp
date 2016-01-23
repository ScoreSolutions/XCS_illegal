








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Stockout&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>SUBJECT_TYPE</td>
					<td>TRANSFER_BY</td>
					<td>JOB_NO</td>
					<td>OFFCODE_TO</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>STATUS</td>
					<td>REMARKS</td>
					<td>LEGISLATION_ID</td>
					<td>REPORT_TO_STAFF</td>
					<td>SUBJECT</td>
					<td>OFFCODE</td>
					<td>STOCKOUT_DATE</td>
					<td>STOCKOUT_CODE</td>
					<td>STOCKOUT_TYPE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${stockouts}"  var="stockout">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${stockout.id}</td>
			<td>
					${stockout.subject_type}
				</td>
				<td>
					${stockout.transfer_by}
				</td>
				<td>
					${stockout.job_no}
				</td>
				<td>
					${stockout.offcode_to}
				</td>
				<td>
					<fmt:formatDate value="${stockout.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockout.update_by}
				</td>
				<td>
					<fmt:formatDate value="${stockout.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockout.create_by}
				</td>
				<td>
					${stockout.status}
				</td>
				<td>
					${stockout.remarks}
				</td>
				<td>
					${stockout.legislation_id}
				</td>
				<td>
					${stockout.report_to_staff}
				</td>
				<td>
					${stockout.subject}
				</td>
				<td>
					${stockout.offcode}
				</td>
				<td>
					<fmt:formatDate value="${stockout.stockout_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockout.stockout_code}
				</td>
				<td>
					${stockout.stockout_type}
				</td>
						<td><a href="<c:url value='/process2?action=Stockout&cmd=view&id='/>${stockout.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Stockout&cmd=edit&id='/>${stockout.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Stockout&cmd=delete&id='/>${stockout.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Stockout&cmd=add'/>">Add New Record</a>
</form>