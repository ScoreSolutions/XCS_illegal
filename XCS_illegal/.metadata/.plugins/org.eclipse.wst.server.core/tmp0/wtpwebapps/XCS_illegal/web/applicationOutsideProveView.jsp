








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationOutsideProve&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationOutsideProve.id}</td>
	</tr>
	<tr>
			<td>replace_position</td>
		<td>
					${applicationOutsideProve.replace_position}
				</td>
		</tr>
	<tr>
			<td>dept_type</td>
		<td>
					${applicationOutsideProve.dept_type}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationOutsideProve.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationOutsideProve.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationOutsideProve.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationOutsideProve.create_by}
				</td>
		</tr>
	<tr>
			<td>prove_date</td>
		<td>
					<fmt:formatDate value="${applicationOutsideProve.prove_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>prove_result</td>
		<td>
					${applicationOutsideProve.prove_result}
				</td>
		</tr>
	<tr>
			<td>isreturn</td>
		<td>
					${applicationOutsideProve.isreturn}
				</td>
		</tr>
	<tr>
			<td>prove_objective</td>
		<td>
					${applicationOutsideProve.prove_objective}
				</td>
		</tr>
	<tr>
			<td>offcode_prove</td>
		<td>
					${applicationOutsideProve.offcode_prove}
				</td>
		</tr>
	<tr>
			<td>poscode_prove</td>
		<td>
					${applicationOutsideProve.poscode_prove}
				</td>
		</tr>
	<tr>
			<td>staff_id_prove</td>
		<td>
					${applicationOutsideProve.staff_id_prove}
				</td>
		</tr>
	<tr>
			<td>prove_no</td>
		<td>
					${applicationOutsideProve.prove_no}
				</td>
		</tr>
	<tr>
			<td>offcode</td>
		<td>
					${applicationOutsideProve.offcode}
				</td>
		</tr>
	<tr>
			<td>legislation_id</td>
		<td>
					${applicationOutsideProve.legislation_id}
				</td>
		</tr>
	<tr>
			<td>doc_dept_name</td>
		<td>
					${applicationOutsideProve.doc_dept_name}
				</td>
		</tr>
	<tr>
			<td>ref_doc_date</td>
		<td>
					<fmt:formatDate value="${applicationOutsideProve.ref_doc_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>ref_doc_no</td>
		<td>
					${applicationOutsideProve.ref_doc_no}
				</td>
		</tr>
	<tr>
			<td>job_date</td>
		<td>
					<fmt:formatDate value="${applicationOutsideProve.job_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>job_no</td>
		<td>
					${applicationOutsideProve.job_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>