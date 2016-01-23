








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=DeliveryExhibit&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${deliveryExhibit.id}</td>
	</tr>
	<tr>
			<td>subject_type</td>
		<td>
					${deliveryExhibit.subject_type}
				</td>
		</tr>
	<tr>
			<td>job_no</td>
		<td>
					${deliveryExhibit.job_no}
				</td>
		</tr>
	<tr>
			<td>offcode_to</td>
		<td>
					${deliveryExhibit.offcode_to}
				</td>
		</tr>
	<tr>
			<td>offcode_from</td>
		<td>
					${deliveryExhibit.offcode_from}
				</td>
		</tr>
	<tr>
			<td>legislation_id</td>
		<td>
					${deliveryExhibit.legislation_id}
				</td>
		</tr>
	<tr>
			<td>delivery_by</td>
		<td>
					${deliveryExhibit.delivery_by}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${deliveryExhibit.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${deliveryExhibit.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${deliveryExhibit.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${deliveryExhibit.create_by}
				</td>
		</tr>
	<tr>
			<td>status</td>
		<td>
					${deliveryExhibit.status}
				</td>
		</tr>
	<tr>
			<td>offcode_inform</td>
		<td>
					${deliveryExhibit.offcode_inform}
				</td>
		</tr>
	<tr>
			<td>subject</td>
		<td>
					${deliveryExhibit.subject}
				</td>
		</tr>
	<tr>
			<td>delivery_date</td>
		<td>
					<fmt:formatDate value="${deliveryExhibit.delivery_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>delivery_code</td>
		<td>
					${deliveryExhibit.delivery_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>