








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=LicenseType&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${licenseType.id}</td>
	</tr>
	<tr>
			<td>lic_order</td>
		<td>
					${licenseType.lic_order}
				</td>
		</tr>
	<tr>
			<td>lic_from</td>
		<td>
					${licenseType.lic_from}
				</td>
		</tr>
	<tr>
			<td>issue_by</td>
		<td>
					${licenseType.issue_by}
				</td>
		</tr>
	<tr>
			<td>period</td>
		<td>
					${licenseType.period}
				</td>
		</tr>
	<tr>
			<td>lic_type</td>
		<td>
					${licenseType.lic_type}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${licenseType.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${licenseType.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${licenseType.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${licenseType.create_by}
				</td>
		</tr>
	<tr>
			<td>active_status</td>
		<td>
					${licenseType.active_status}
				</td>
		</tr>
	<tr>
			<td>licensetype_name</td>
		<td>
					${licenseType.licensetype_name}
				</td>
		</tr>
	<tr>
			<td>licensetype_code</td>
		<td>
					${licenseType.licensetype_code}
				</td>
		</tr>
	<tr>
		</tr>
</table>