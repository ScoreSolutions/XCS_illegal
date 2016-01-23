








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=StockoutItem&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${stockoutItem.id}</td>
	</tr>
	<tr>
			<td>isdomestic</td>
		<td>
					${stockoutItem.isdomestic}
				</td>
		</tr>
	<tr>
			<td>ref_stockout_id</td>
		<td>
					${stockoutItem.ref_stockout_id}
				</td>
		</tr>
	<tr>
			<td>netweight_unit</td>
		<td>
					${stockoutItem.netweight_unit}
				</td>
		</tr>
	<tr>
			<td>netweight</td>
		<td>
					${stockoutItem.netweight}
				</td>
		</tr>
	<tr>
			<td>sizes_code</td>
		<td>
					${stockoutItem.sizes_code}
				</td>
		</tr>
	<tr>
			<td>sizes_unit_code</td>
		<td>
					${stockoutItem.sizes_unit_code}
				</td>
		</tr>
	<tr>
			<td>delivery_exhibit_id</td>
		<td>
					${stockoutItem.delivery_exhibit_id}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${stockoutItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${stockoutItem.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${stockoutItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${stockoutItem.create_by}
				</td>
		</tr>
	<tr>
			<td>unit_code</td>
		<td>
					${stockoutItem.unit_code}
				</td>
		</tr>
	<tr>
			<td>qty</td>
		<td>
					${stockoutItem.qty}
				</td>
		</tr>
	<tr>
			<td>brand_code</td>
		<td>
					${stockoutItem.brand_code}
				</td>
		</tr>
	<tr>
			<td>product_code</td>
		<td>
					${stockoutItem.product_code}
				</td>
		</tr>
	<tr>
			<td>stockout_id</td>
		<td>
					${stockoutItem.stockout_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>