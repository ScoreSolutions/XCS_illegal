








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Stockremain&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>STOCKIN_QTY</td>
					<td>ISDOMESTIC</td>
					<td>STOCKOUT_ID</td>
					<td>SIZES_UNIT_CODE</td>
					<td>SIZES_CODE</td>
					<td>DELIVERY_EXHIBIT_ID</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>UNIT_CODE</td>
					<td>QTY</td>
					<td>BRAND_CODE</td>
					<td>PRODUCT_CODE</td>
					<td>LEGISLATION_ID</td>
					<td>OFFCODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${stockremains}"  var="stockremain">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${stockremain.id}</td>
			<td>
					${stockremain.stockin_qty}
				</td>
				<td>
					${stockremain.isdomestic}
				</td>
				<td>
					${stockremain.stockout_id}
				</td>
				<td>
					${stockremain.sizes_unit_code}
				</td>
				<td>
					${stockremain.sizes_code}
				</td>
				<td>
					${stockremain.delivery_exhibit_id}
				</td>
				<td>
					<fmt:formatDate value="${stockremain.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockremain.update_by}
				</td>
				<td>
					<fmt:formatDate value="${stockremain.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${stockremain.create_by}
				</td>
				<td>
					${stockremain.unit_code}
				</td>
				<td>
					${stockremain.qty}
				</td>
				<td>
					${stockremain.brand_code}
				</td>
				<td>
					${stockremain.product_code}
				</td>
				<td>
					${stockremain.legislation_id}
				</td>
				<td>
					${stockremain.offcode}
				</td>
						<td><a href="<c:url value='/process2?action=Stockremain&cmd=view&id='/>${stockremain.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Stockremain&cmd=edit&id='/>${stockremain.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Stockremain&cmd=delete&id='/>${stockremain.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Stockremain&cmd=add'/>">Add New Record</a>
</form>