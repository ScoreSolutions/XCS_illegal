








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Stockremain&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${stockremain.id}</td>
	</tr>
	<tr>
			<td>stockin_qty</td>
		<td>
					${stockremain.stockin_qty}
				</td>
		</tr>
	<tr>
			<td>isdomestic</td>
		<td>
					${stockremain.isdomestic}
				</td>
		</tr>
	<tr>
			<td>stockout_id</td>
		<td>
					${stockremain.stockout_id}
				</td>
		</tr>
	<tr>
			<td>sizes_unit_code</td>
		<td>
					${stockremain.sizes_unit_code}
				</td>
		</tr>
	<tr>
			<td>sizes_code</td>
		<td>
					${stockremain.sizes_code}
				</td>
		</tr>
	<tr>
			<td>delivery_exhibit_id</td>
		<td>
					${stockremain.delivery_exhibit_id}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${stockremain.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${stockremain.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${stockremain.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${stockremain.create_by}
				</td>
		</tr>
	<tr>
			<td>unit_code</td>
		<td>
					${stockremain.unit_code}
				</td>
		</tr>
	<tr>
			<td>qty</td>
		<td>
					${stockremain.qty}
				</td>
		</tr>
	<tr>
			<td>brand_code</td>
		<td>
					${stockremain.brand_code}
				</td>
		</tr>
	<tr>
			<td>product_code</td>
		<td>
					${stockremain.product_code}
				</td>
		</tr>
	<tr>
			<td>legislation_id</td>
		<td>
					${stockremain.legislation_id}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${stockremain.offcode}
				</td>
		</tr>
	<tr>
		</tr>
</table>