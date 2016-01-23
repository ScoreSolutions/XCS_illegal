








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationOutsideProveItem&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationOutsideProveItem.id}</td>
	</tr>
	<tr>
			<td>isdomestic</td>
		<td>
					${applicationOutsideProveItem.isdomestic}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationOutsideProveItem.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationOutsideProveItem.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationOutsideProveItem.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationOutsideProveItem.create_by}
				</td>
		</tr>
	<tr>
			<td>remarks</td>
		<td>
					${applicationOutsideProveItem.remarks}
				</td>
		</tr>
	<tr>
			<td>description</td>
		<td>
					${applicationOutsideProveItem.description}
				</td>
		</tr>
	<tr>
			<td>unit_netweight</td>
		<td>
					${applicationOutsideProveItem.unit_netweight}
				</td>
		</tr>
	<tr>
			<td>netweight</td>
		<td>
					${applicationOutsideProveItem.netweight}
				</td>
		</tr>
	<tr>
			<td>unit_size</td>
		<td>
					${applicationOutsideProveItem.unit_size}
				</td>
		</tr>
	<tr>
			<td>sizes_code</td>
		<td>
					${applicationOutsideProveItem.sizes_code}
				</td>
		</tr>
	<tr>
			<td>unit_qty</td>
		<td>
					${applicationOutsideProveItem.unit_qty}
				</td>
		</tr>
	<tr>
			<td>qty</td>
		<td>
					${applicationOutsideProveItem.qty}
				</td>
		</tr>
	<tr>
			<td>brand_name</td>
		<td>
					${applicationOutsideProveItem.brand_name}
				</td>
		</tr>
	<tr>
			<td>brand_code</td>
		<td>
					${applicationOutsideProveItem.brand_code}
				</td>
		</tr>
	<tr>
			<td>product_name</td>
		<td>
					${applicationOutsideProveItem.product_name}
				</td>
		</tr>
	<tr>
			<td>product_code</td>
		<td>
					${applicationOutsideProveItem.product_code}
				</td>
		</tr>
	<tr>
			<td>application_outside_prove_id</td>
		<td>
					${applicationOutsideProveItem.application_outside_prove_id}
				</td>
		</tr>
	<tr>
		</tr>
</table>