








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=DeliveryExhibitItem&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>NETWEIGHT_UNIT</td>
					<td>NETWEIGHT</td>
					<td>SIZES_UNIT_CODE</td>
					<td>SIZES_CODE</td>
					<td>REMARKS</td>
					<td>PROVE_QTY</td>
					<td>APPLICATION_OUTSIDE_PROVE_ITEM</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>UNIT_CODE</td>
					<td>QTY</td>
					<td>BRAND_CODE</td>
					<td>PRODUCT_CODE</td>
					<td>APP_ARREST_PROVE_EXHIBIT_ID</td>
					<td>DELIVERY_EXHIBIT_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${deliveryExhibitItems}"  var="deliveryExhibitItem">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${deliveryExhibitItem.id}</td>
			<td>
					${deliveryExhibitItem.netweight_unit}
				</td>
				<td>
					${deliveryExhibitItem.netweight}
				</td>
				<td>
					${deliveryExhibitItem.sizes_unit_code}
				</td>
				<td>
					${deliveryExhibitItem.sizes_code}
				</td>
				<td>
					${deliveryExhibitItem.remarks}
				</td>
				<td>
					${deliveryExhibitItem.prove_qty}
				</td>
				<td>
					${deliveryExhibitItem.application_outside_prove_item}
				</td>
				<td>
					<fmt:formatDate value="${deliveryExhibitItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${deliveryExhibitItem.update_by}
				</td>
				<td>
					<fmt:formatDate value="${deliveryExhibitItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${deliveryExhibitItem.create_by}
				</td>
				<td>
					${deliveryExhibitItem.unit_code}
				</td>
				<td>
					${deliveryExhibitItem.qty}
				</td>
				<td>
					${deliveryExhibitItem.brand_code}
				</td>
				<td>
					${deliveryExhibitItem.product_code}
				</td>
				<td>
					${deliveryExhibitItem.app_arrest_prove_exhibit_id}
				</td>
				<td>
					${deliveryExhibitItem.delivery_exhibit_id}
				</td>
						<td><a href="<c:url value='/process2?action=DeliveryExhibitItem&cmd=view&id='/>${deliveryExhibitItem.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=DeliveryExhibitItem&cmd=edit&id='/>${deliveryExhibitItem.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=DeliveryExhibitItem&cmd=delete&id='/>${deliveryExhibitItem.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=DeliveryExhibitItem&cmd=add'/>">Add New Record</a>
</form>