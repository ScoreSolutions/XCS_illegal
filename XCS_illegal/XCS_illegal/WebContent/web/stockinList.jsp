








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Stockin&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>POSCODE_RECEIVE</td>
					<td>STOCKOUT_ID</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>STATUS</td>
					<td>REMARKS</td>
					<td>RECEIVE_BY</td>
					<td>DESTROY_LIMIT_DATE</td>
					<td>LOCATION</td>
					<td>DELIVERY_EXHIBIT_ID</td>
					<td>STOCKIN_DATE</td>
					<td>STOCKIN_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${stockins}"  var="stockin">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${stockin.id}</td>
			<td>
					${stockin.poscode_receive}
				</td>
				<td>
					${stockin.stockout_id}
				</td>
				<td>
					<fmt:formatDate value="${stockin.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockin.update_by}
				</td>
				<td>
					<fmt:formatDate value="${stockin.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockin.create_by}
				</td>
				<td>
					${stockin.status}
				</td>
				<td>
					${stockin.remarks}
				</td>
				<td>
					${stockin.receive_by}
				</td>
				<td>
					<fmt:formatDate value="${stockin.destroy_limit_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockin.location}
				</td>
				<td>
					${stockin.delivery_exhibit_id}
				</td>
				<td>
					<fmt:formatDate value="${stockin.stockin_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockin.stockin_code}
				</td>
						<td><a href="<c:url value='/process2?action=Stockin&cmd=view&id='/>${stockin.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Stockin&cmd=edit&id='/>${stockin.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Stockin&cmd=delete&id='/>${stockin.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Stockin&cmd=add'/>">Add New Record</a>
</form>