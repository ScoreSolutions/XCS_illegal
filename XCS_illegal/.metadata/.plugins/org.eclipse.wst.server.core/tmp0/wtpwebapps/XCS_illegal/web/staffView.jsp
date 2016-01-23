








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=Staff&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${staff.id}</td>
	</tr>
	<tr>
			<td>dept_name</td>
		<td>
					${staff.dept_name}
				</td>
		</tr>
	<tr>
			<td>pos_name</td>
		<td>
					${staff.pos_name}
				</td>
		</tr>
	<tr>
			<td>poscode_admin</td>
		<td>
					${staff.poscode_admin}
				</td>
		</tr>
	<tr>
			<td>poscode</td>
		<td>
					${staff.poscode}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${staff.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${staff.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${staff.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${staff.create_by}
				</td>
		</tr>
	<tr>
			<td>per_id_ref</td>
		<td>
					${staff.per_id_ref}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${staff.offcode}
				</td>
		</tr>
	<tr>
			<td>staff_level</td>
		<td>
					${staff.staff_level}
				</td>
		</tr>
	<tr>
			<td>birthdate</td>
		<td>
					<fmt:formatDate value="${staff.birthdate}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>sex</td>
		<td>
					${staff.sex}
				</td>
		</tr>
	<tr>
			<td>last_name</td>
		<td>
					${staff.last_name}
				</td>
		</tr>
	<tr>
			<td>first_name</td>
		<td>
					${staff.first_name}
				</td>
		</tr>
	<tr>
			<td>title_code</td>
		<td>
					${staff.title_code}
				</td>
		</tr>
	<tr>
			<td>per_type</td>
		<td>
					${staff.per_type}
				</td>
		</tr>
	<tr>
			<td>idcard_no</td>
		<td>
					${staff.idcard_no}
				</td>
		</tr>
	<tr>
			<td>empid</td>
		<td>
					${staff.empid}
				</td>
		</tr>
	<tr>
		</tr>
</table>