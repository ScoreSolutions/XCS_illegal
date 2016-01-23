








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Stockin&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${stockin.id}</td>
	</tr>
	<tr>
			<td>poscode_receive</td>
		<td>
					${stockin.poscode_receive}
				</td>
		</tr>
	<tr>
			<td>stockout_id</td>
		<td>
					${stockin.stockout_id}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${stockin.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${stockin.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${stockin.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${stockin.create_by}
				</td>
		</tr>
	<tr>
			<td>status</td>
		<td>
					${stockin.status}
				</td>
		</tr>
	<tr>
			<td>remarks</td>
		<td>
					${stockin.remarks}
				</td>
		</tr>
	<tr>
			<td>receive_by</td>
		<td>
					${stockin.receive_by}
				</td>
		</tr>
	<tr>
			<td>destroy_limit_date</td>
		<td>
					<fmt:formatDate value="${stockin.destroy_limit_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>location</td>
		<td>
					${stockin.location}
				</td>
		</tr>
	<tr>
			<td>delivery_exhibit_id</td>
		<td>
					${stockin.delivery_exhibit_id}
				</td>
		</tr>
	<tr>
			<td>stockin_date</td>
		<td>
					<fmt:formatDate value="${stockin.stockin_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>stockin_code</td>
		<td>
					${stockin.stockin_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>