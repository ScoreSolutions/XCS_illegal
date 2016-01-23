








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Seize&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${seize.id}</td>
	</tr>
	<tr>
			<td>del_idcardno</td>
		<td>
					${seize.del_idcardno}
				</td>
		</tr>
	<tr>
			<td>del_date</td>
		<td>
					<fmt:formatDate value="${seize.del_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>del_flag</td>
		<td>
					${seize.del_flag}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${seize.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${seize.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${seize.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${seize.create_by}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${seize.track_no}
				</td>
		</tr>
	<tr>
			<td>seize_location</td>
		<td>
					${seize.seize_location}
				</td>
		</tr>
	<tr>
			<td>limit_date</td>
		<td>
					<fmt:formatDate value="${seize.limit_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>cancel_date</td>
		<td>
					<fmt:formatDate value="${seize.cancel_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>seize_date</td>
		<td>
					<fmt:formatDate value="${seize.seize_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>order_no</td>
		<td>
					${seize.order_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>