








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=CompareCaseChangeItem&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>APPLICATION_ARREST_LAWBREAKER</td>
					<td>PAPER_NO</td>
					<td>INV_NO</td>
					<td>BOOK_NO</td>
					<td>AUTO_INV_NO</td>
					<td>COMPARE_CASE_CHANGE_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${compareCaseChangeItems}"  var="compareCaseChangeItem">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${compareCaseChangeItem.id}</td>
			<td>
					<fmt:formatDate value="${compareCaseChangeItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareCaseChangeItem.update_by}
				</td>
				<td>
					<fmt:formatDate value="${compareCaseChangeItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareCaseChangeItem.create_by}
				</td>
				<td>
					${compareCaseChangeItem.application_arrest_lawbreaker}
				</td>
				<td>
					${compareCaseChangeItem.paper_no}
				</td>
				<td>
					${compareCaseChangeItem.inv_no}
				</td>
				<td>
					${compareCaseChangeItem.book_no}
				</td>
				<td>
					${compareCaseChangeItem.auto_inv_no}
				</td>
				<td>
					${compareCaseChangeItem.compare_case_change_id}
				</td>
						<td><a href="<c:url value='/process2?action=CompareCaseChangeItem&cmd=view&id='/>${compareCaseChangeItem.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=CompareCaseChangeItem&cmd=edit&id='/>${compareCaseChangeItem.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=CompareCaseChangeItem&cmd=delete&id='/>${compareCaseChangeItem.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=CompareCaseChangeItem&cmd=add'/>">Add New Record</a>
</form>