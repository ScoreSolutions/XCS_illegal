








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Invoice2&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${invoice2.id}</td>
	</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${invoice2.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${invoice2.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${invoice2.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${invoice2.create_by}
				</td>
		</tr>
	<tr>
			<td>offcode_cancel</td>
		<td>
					${invoice2.offcode_cancel}
				</td>
		</tr>
	<tr>
			<td>cancel_date</td>
		<td>
					<fmt:formatDate value="${invoice2.cancel_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>poscode_cancel</td>
		<td>
					${invoice2.poscode_cancel}
				</td>
		</tr>
	<tr>
			<td>staff_cancel</td>
		<td>
					${invoice2.staff_cancel}
				</td>
		</tr>
	<tr>
			<td>status</td>
		<td>
					${invoice2.status}
				</td>
		</tr>
	<tr>
			<td>interior_remarks</td>
		<td>
					${invoice2.interior_remarks}
				</td>
		</tr>
	<tr>
			<td>tax_remarks</td>
		<td>
					${invoice2.tax_remarks}
				</td>
		</tr>
	<tr>
			<td>interior_fine</td>
		<td>
					${invoice2.interior_fine}
				</td>
		</tr>
	<tr>
			<td>tax_fine</td>
		<td>
					${invoice2.tax_fine}
				</td>
		</tr>
	<tr>
			<td>offcode_receive</td>
		<td>
					${invoice2.offcode_receive}
				</td>
		</tr>
	<tr>
			<td>poscode_receive</td>
		<td>
					${invoice2.poscode_receive}
				</td>
		</tr>
	<tr>
			<td>staff_receive</td>
		<td>
					${invoice2.staff_receive}
				</td>
		</tr>
	<tr>
			<td>send_no</td>
		<td>
					${invoice2.send_no}
				</td>
		</tr>
	<tr>
			<td>send_bookno</td>
		<td>
					${invoice2.send_bookno}
				</td>
		</tr>
	<tr>
			<td>compare_case_id</td>
		<td>
					${invoice2.compare_case_id}
				</td>
		</tr>
	<tr>
			<td>inv_date</td>
		<td>
					<fmt:formatDate value="${invoice2.inv_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>inv_no</td>
		<td>
					${invoice2.inv_no}
				</td>
		</tr>
	<tr>
			<td>inv_bookno</td>
		<td>
					${invoice2.inv_bookno}
				</td>
		</tr>
	<tr>
		</tr>
</table>