








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationArrestProve&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrestProve.id}</td>
	</tr>
	<tr>
			<td>tax_value</td>
		<td>
					${applicationArrestProve.tax_value}
				</td>
		</tr>
	<tr>
			<td>staff_prove_offcode</td>
		<td>
					${applicationArrestProve.staff_prove_offcode}
				</td>
		</tr>
	<tr>
			<td>staff_prove_poscode</td>
		<td>
					${applicationArrestProve.staff_prove_poscode}
				</td>
		</tr>
	<tr>
			<td>status</td>
		<td>
					${applicationArrestProve.status}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestProve.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationArrestProve.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationArrestProve.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationArrestProve.create_by}
				</td>
		</tr>
	<tr>
			<td>order_desc</td>
		<td>
					${applicationArrestProve.order_desc}
				</td>
		</tr>
	<tr>
			<td>report_desc</td>
		<td>
					${applicationArrestProve.report_desc}
				</td>
		</tr>
	<tr>
			<td>replace_position</td>
		<td>
					${applicationArrestProve.replace_position}
				</td>
		</tr>
	<tr>
			<td>taken_date</td>
		<td>
					<fmt:formatDate value="${applicationArrestProve.taken_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>staff_idcardno_prove</td>
		<td>
					${applicationArrestProve.staff_idcardno_prove}
				</td>
		</tr>
	<tr>
			<td>case_id</td>
		<td>
					${applicationArrestProve.case_id}
				</td>
		</tr>
	<tr>
			<td>exhibit_report_no</td>
		<td>
					${applicationArrestProve.exhibit_report_no}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${applicationArrestProve.track_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>