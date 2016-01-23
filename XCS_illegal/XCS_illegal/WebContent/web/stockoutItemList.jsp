








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=StockoutItem&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ISDOMESTIC</td>
					<td>REF_STOCKOUT_ID</td>
					<td>NETWEIGHT_UNIT</td>
					<td>NETWEIGHT</td>
					<td>SIZES_CODE</td>
					<td>SIZES_UNIT_CODE</td>
					<td>DELIVERY_EXHIBIT_ID</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>UNIT_CODE</td>
					<td>QTY</td>
					<td>BRAND_CODE</td>
					<td>PRODUCT_CODE</td>
					<td>STOCKOUT_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${stockoutItems}"  var="stockoutItem">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${stockoutItem.id}</td>
			<td>
					${stockoutItem.isdomestic}
				</td>
				<td>
					${stockoutItem.ref_stockout_id}
				</td>
				<td>
					${stockoutItem.netweight_unit}
				</td>
				<td>
					${stockoutItem.netweight}
				</td>
				<td>
					${stockoutItem.sizes_code}
				</td>
				<td>
					${stockoutItem.sizes_unit_code}
				</td>
				<td>
					${stockoutItem.delivery_exhibit_id}
				</td>
				<td>
					<fmt:formatDate value="${stockoutItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockoutItem.update_by}
				</td>
				<td>
					<fmt:formatDate value="${stockoutItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockoutItem.create_by}
				</td>
				<td>
					${stockoutItem.unit_code}
				</td>
				<td>
					${stockoutItem.qty}
				</td>
				<td>
					${stockoutItem.brand_code}
				</td>
				<td>
					${stockoutItem.product_code}
				</td>
				<td>
					${stockoutItem.stockout_id}
				</td>
						<td><a href="<c:url value='/process2?action=StockoutItem&cmd=view&id='/>${stockoutItem.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=StockoutItem&cmd=edit&id='/>${stockoutItem.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=StockoutItem&cmd=delete&id='/>${stockoutItem.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=StockoutItem&cmd=add'/>">Add New Record</a>
</form>