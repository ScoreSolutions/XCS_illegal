








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=InspectorTeam&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${inspectorTeam.id}</td>
	</tr>
	<tr>
			<td>offcode_div</td>
		<td>
					${inspectorTeam.offcode_div}
				</td>
		</tr>
	<tr>
			<td>offcode_dept</td>
		<td>
					${inspectorTeam.offcode_dept}
				</td>
		</tr>
	<tr>
			<td>offcode_leader</td>
		<td>
					${inspectorTeam.offcode_leader}
				</td>
		</tr>
	<tr>
			<td>poscode_leader</td>
		<td>
					${inspectorTeam.poscode_leader}
				</td>
		</tr>
	<tr>
			<td>staff_idcardno_leader</td>
		<td>
					${inspectorTeam.staff_idcardno_leader}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${inspectorTeam.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${inspectorTeam.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${inspectorTeam.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${inspectorTeam.create_by}
				</td>
		</tr>
	<tr>
			<td>inspector_name</td>
		<td>
					${inspectorTeam.inspector_name}
				</td>
		</tr>
	<tr>
			<td>inspector_code</td>
		<td>
					${inspectorTeam.inspector_code}
				</td>
		</tr>
	<tr>
			<td>appoint_date</td>
		<td>
					<fmt:formatDate value="${inspectorTeam.appoint_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>appoint_no</td>
		<td>
					${inspectorTeam.appoint_no}
				</td>
		</tr>
	<tr>
			<td>job_no</td>
		<td>
					${inspectorTeam.job_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>