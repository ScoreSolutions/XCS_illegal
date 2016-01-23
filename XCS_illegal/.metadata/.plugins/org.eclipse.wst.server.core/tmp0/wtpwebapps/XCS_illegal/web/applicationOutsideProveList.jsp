








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">
	function confirmBox(str_text)
	{
  		var r = confirm(str_text);
  		return r;
	}
</script>
<table border="1">
	<tr><td><%=pageUtil.getPagination()%></td><td><%=pageUtil.getPageStatus()%></td></tr>
</table>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationOutsideProve&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>REPLACE_POSITION</td>
					<td>DEPT_TYPE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>PROVE_DATE</td>
					<td>PROVE_RESULT</td>
					<td>ISRETURN</td>
					<td>PROVE_OBJECTIVE</td>
					<td>OFFCODE_PROVE</td>
					<td>POSCODE_PROVE</td>
					<td>STAFF_ID_PROVE</td>
					<td>PROVE_NO</td>
					<td>OFFCODE</td>
					<td>LEGISLATION_ID</td>
					<td>DOC_DEPT_NAME</td>
					<td>REF_DOC_DATE</td>
					<td>REF_DOC_NO</td>
					<td>JOB_DATE</td>
					<td>JOB_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationOutsideProves}"  var="applicationOutsideProve">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationOutsideProve.id}</td>
			<td>
					${applicationOutsideProve.replace_position}
				</td>
				<td>
					${applicationOutsideProve.dept_type}
				</td>
				<td>
					<fmt:formatDate value="${applicationOutsideProve.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationOutsideProve.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationOutsideProve.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationOutsideProve.create_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationOutsideProve.prove_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationOutsideProve.prove_result}
				</td>
				<td>
					${applicationOutsideProve.isreturn}
				</td>
				<td>
					${applicationOutsideProve.prove_objective}
				</td>
				<td>
					${applicationOutsideProve.offcode_prove}
				</td>
				<td>
					${applicationOutsideProve.poscode_prove}
				</td>
				<td>
					${applicationOutsideProve.staff_id_prove}
				</td>
				<td>
					${applicationOutsideProve.prove_no}
				</td>
				<td>
					${applicationOutsideProve.offcode}
				</td>
				<td>
					${applicationOutsideProve.legislation_id}
				</td>
				<td>
					${applicationOutsideProve.doc_dept_name}
				</td>
				<td>
					<fmt:formatDate value="${applicationOutsideProve.ref_doc_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationOutsideProve.ref_doc_no}
				</td>
				<td>
					<fmt:formatDate value="${applicationOutsideProve.job_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationOutsideProve.job_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationOutsideProve&cmd=view&id='/>${applicationOutsideProve.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationOutsideProve&cmd=edit&id='/>${applicationOutsideProve.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationOutsideProve&cmd=delete&id='/>${applicationOutsideProve.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationOutsideProve&cmd=add'/>">Add New Record</a>
</form>