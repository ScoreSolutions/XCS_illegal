








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=StockinItem&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${stockinItem.id}</td>
	</tr>
	<tr>
			<td>isdomestic</td>
		<td>
					${stockinItem.isdomestic}
				</td>
		</tr>
	<tr>
			<td>netweight_unit</td>
		<td>
					${stockinItem.netweight_unit}
				</td>
		</tr>
	<tr>
			<td>netweight</td>
		<td>
					${stockinItem.netweight}
				</td>
		</tr>
	<tr>
			<td>sizes_unit_code</td>
		<td>
					${stockinItem.sizes_unit_code}
				</td>
		</tr>
	<tr>
			<td>sizes_code</td>
		<td>
					${stockinItem.sizes_code}
				</td>
		</tr>
	<tr>
			<td>remarks</td>
		<td>
					${stockinItem.remarks}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${stockinItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${stockinItem.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${stockinItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${stockinItem.create_by}
				</td>
		</tr>
	<tr>
			<td>unit_code</td>
		<td>
					${stockinItem.unit_code}
				</td>
		</tr>
	<tr>
			<td>qty</td>
		<td>
					${stockinItem.qty}
				</td>
		</tr>
	<tr>
			<td>brand_code</td>
		<td>
					${stockinItem.brand_code}
				</td>
		</tr>
	<tr>
			<td>product_code</td>
		<td>
					${stockinItem.product_code}
				</td>
		</tr>
	<tr>
			<td>stockin_id</td>
		<td>
					${stockinItem.stockin_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>