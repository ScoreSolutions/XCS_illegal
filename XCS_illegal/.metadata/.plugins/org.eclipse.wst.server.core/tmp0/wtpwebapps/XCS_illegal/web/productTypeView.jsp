








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ProductType&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${productType.id}</td>
	</tr>
	<tr>
			<td>active</td>
		<td>
					${productType.active}
				</td>
		</tr>
	<tr>
			<td>group_id</td>
		<td>
					${productType.group_id}
				</td>
		</tr>
	<tr>
			<td>type_name</td>
		<td>
					${productType.type_name}
				</td>
		</tr>
	<tr>
			<td>type_code</td>
		<td>
					${productType.type_code}
				</td>
		</tr>
	<tr>
			<td>duty_code</td>
		<td>
					${productType.duty_code}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${productType.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${productType.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${productType.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${productType.create_by}
				</td>
		</tr>
	<tr>
		</tr>
</table>