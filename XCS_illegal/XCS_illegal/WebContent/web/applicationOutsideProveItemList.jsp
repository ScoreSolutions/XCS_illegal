








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationOutsideProveItem&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ISDOMESTIC</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>REMARKS</td>
					<td>DESCRIPTION</td>
					<td>UNIT_NETWEIGHT</td>
					<td>NETWEIGHT</td>
					<td>UNIT_SIZE</td>
					<td>SIZES_CODE</td>
					<td>UNIT_QTY</td>
					<td>QTY</td>
					<td>BRAND_NAME</td>
					<td>BRAND_CODE</td>
					<td>PRODUCT_NAME</td>
					<td>PRODUCT_CODE</td>
					<td>APPLICATION_OUTSIDE_PROVE_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationOutsideProveItems}"  var="applicationOutsideProveItem">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationOutsideProveItem.id}</td>
			<td>
					${applicationOutsideProveItem.isdomestic}
				</td>
				<td>
					<fmt:formatDate value="${applicationOutsideProveItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationOutsideProveItem.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationOutsideProveItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationOutsideProveItem.create_by}
				</td>
				<td>
					${applicationOutsideProveItem.remarks}
				</td>
				<td>
					${applicationOutsideProveItem.description}
				</td>
				<td>
					${applicationOutsideProveItem.unit_netweight}
				</td>
				<td>
					${applicationOutsideProveItem.netweight}
				</td>
				<td>
					${applicationOutsideProveItem.unit_size}
				</td>
				<td>
					${applicationOutsideProveItem.sizes_code}
				</td>
				<td>
					${applicationOutsideProveItem.unit_qty}
				</td>
				<td>
					${applicationOutsideProveItem.qty}
				</td>
				<td>
					${applicationOutsideProveItem.brand_name}
				</td>
				<td>
					${applicationOutsideProveItem.brand_code}
				</td>
				<td>
					${applicationOutsideProveItem.product_name}
				</td>
				<td>
					${applicationOutsideProveItem.product_code}
				</td>
				<td>
					${applicationOutsideProveItem.application_outside_prove_id}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationOutsideProveItem&cmd=view&id='/>${applicationOutsideProveItem.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationOutsideProveItem&cmd=edit&id='/>${applicationOutsideProveItem.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationOutsideProveItem&cmd=delete&id='/>${applicationOutsideProveItem.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationOutsideProveItem&cmd=add'/>">Add New Record</a>
</form>