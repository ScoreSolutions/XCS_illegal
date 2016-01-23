








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=LicenseType&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>LIC_ORDER</td>
					<td>LIC_FROM</td>
					<td>ISSUE_BY</td>
					<td>PERIOD</td>
					<td>LIC_TYPE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>ACTIVE_STATUS</td>
					<td>LICENSETYPE_NAME</td>
					<td>LICENSETYPE_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${licenseTypes}"  var="licenseType">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${licenseType.id}</td>
			<td>
					${licenseType.lic_order}
				</td>
				<td>
					${licenseType.lic_from}
				</td>
				<td>
					${licenseType.issue_by}
				</td>
				<td>
					${licenseType.period}
				</td>
				<td>
					${licenseType.lic_type}
				</td>
				<td>
					<fmt:formatDate value="${licenseType.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${licenseType.update_by}
				</td>
				<td>
					<fmt:formatDate value="${licenseType.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${licenseType.create_by}
				</td>
				<td>
					${licenseType.active_status}
				</td>
				<td>
					${licenseType.licensetype_name}
				</td>
				<td>
					${licenseType.licensetype_code}
				</td>
						<td><a href="<c:url value='/process2?action=LicenseType&cmd=view&id='/>${licenseType.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=LicenseType&cmd=edit&id='/>${licenseType.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=LicenseType&cmd=delete&id='/>${licenseType.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=LicenseType&cmd=add'/>">Add New Record</a>
</form>