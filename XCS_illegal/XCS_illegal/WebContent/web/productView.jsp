








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Product&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${product.id}</td>
	</tr>
	<tr>
			<td>subtype_code</td>
		<td>
					${product.subtype_code}
				</td>
		</tr>
	<tr>
			<td>law_duty_code</td>
		<td>
					${product.law_duty_code}
				</td>
		</tr>
	<tr>
			<td>prc_param</td>
		<td>
					${product.prc_param}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${product.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${product.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${product.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${product.create_by}
				</td>
		</tr>
	<tr>
			<td>producttype_id</td>
		<td>
					${product.producttype_id}
				</td>
		</tr>
	<tr>
			<td>product_name</td>
		<td>
					${product.product_name}
				</td>
		</tr>
	<tr>
			<td>product_code</td>
		<td>
					${product.product_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>