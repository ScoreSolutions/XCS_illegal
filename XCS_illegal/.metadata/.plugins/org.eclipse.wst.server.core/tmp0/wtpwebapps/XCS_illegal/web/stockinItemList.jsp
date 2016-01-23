








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=StockinItem&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ISDOMESTIC</td>
					<td>NETWEIGHT_UNIT</td>
					<td>NETWEIGHT</td>
					<td>SIZES_UNIT_CODE</td>
					<td>SIZES_CODE</td>
					<td>REMARKS</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>UNIT_CODE</td>
					<td>QTY</td>
					<td>BRAND_CODE</td>
					<td>PRODUCT_CODE</td>
					<td>STOCKIN_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${stockinItems}"  var="stockinItem">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${stockinItem.id}</td>
			<td>
					${stockinItem.isdomestic}
				</td>
				<td>
					${stockinItem.netweight_unit}
				</td>
				<td>
					${stockinItem.netweight}
				</td>
				<td>
					${stockinItem.sizes_unit_code}
				</td>
				<td>
					${stockinItem.sizes_code}
				</td>
				<td>
					${stockinItem.remarks}
				</td>
				<td>
					<fmt:formatDate value="${stockinItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockinItem.update_by}
				</td>
				<td>
					<fmt:formatDate value="${stockinItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockinItem.create_by}
				</td>
				<td>
					${stockinItem.unit_code}
				</td>
				<td>
					${stockinItem.qty}
				</td>
				<td>
					${stockinItem.brand_code}
				</td>
				<td>
					${stockinItem.product_code}
				</td>
				<td>
					${stockinItem.stockin_id}
				</td>
						<td><a href="<c:url value='/process2?action=StockinItem&cmd=view&id='/>${stockinItem.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=StockinItem&cmd=edit&id='/>${stockinItem.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=StockinItem&cmd=delete&id='/>${stockinItem.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=StockinItem&cmd=add'/>">Add New Record</a>
</form>