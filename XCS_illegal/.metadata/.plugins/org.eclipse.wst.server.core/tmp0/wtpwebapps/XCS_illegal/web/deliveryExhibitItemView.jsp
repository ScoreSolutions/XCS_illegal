








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=DeliveryExhibitItem&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${deliveryExhibitItem.id}</td>
	</tr>
	<tr>
			<td>netweight_unit</td>
		<td>
					${deliveryExhibitItem.netweight_unit}
				</td>
		</tr>
	<tr>
			<td>netweight</td>
		<td>
					${deliveryExhibitItem.netweight}
				</td>
		</tr>
	<tr>
			<td>sizes_unit_code</td>
		<td>
					${deliveryExhibitItem.sizes_unit_code}
				</td>
		</tr>
	<tr>
			<td>sizes_code</td>
		<td>
					${deliveryExhibitItem.sizes_code}
				</td>
		</tr>
	<tr>
			<td>remarks</td>
		<td>
					${deliveryExhibitItem.remarks}
				</td>
		</tr>
	<tr>
			<td>prove_qty</td>
		<td>
					${deliveryExhibitItem.prove_qty}
				</td>
		</tr>
	<tr>
			<td>application_outside_prove_item</td>
		<td>
					${deliveryExhibitItem.application_outside_prove_item}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${deliveryExhibitItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${deliveryExhibitItem.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${deliveryExhibitItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${deliveryExhibitItem.create_by}
				</td>
		</tr>
	<tr>
			<td>unit_code</td>
		<td>
					${deliveryExhibitItem.unit_code}
				</td>
		</tr>
	<tr>
			<td>qty</td>
		<td>
					${deliveryExhibitItem.qty}
				</td>
		</tr>
	<tr>
			<td>brand_code</td>
		<td>
					${deliveryExhibitItem.brand_code}
				</td>
		</tr>
	<tr>
			<td>product_code</td>
		<td>
					${deliveryExhibitItem.product_code}
				</td>
		</tr>
	<tr>
			<td>app_arrest_prove_exhibit_id</td>
		<td>
					${deliveryExhibitItem.app_arrest_prove_exhibit_id}
				</td>
		</tr>
	<tr>
			<td>delivery_exhibit_id</td>
		<td>
					${deliveryExhibitItem.delivery_exhibit_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>