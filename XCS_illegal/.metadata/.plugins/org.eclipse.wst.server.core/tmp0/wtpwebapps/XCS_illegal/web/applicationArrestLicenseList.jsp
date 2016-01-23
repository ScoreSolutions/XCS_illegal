








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationArrestLicense&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ISWITHDRAW</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>LICENSE_NO</td>
					<td>BOOK_NO</td>
					<td>LICENSE_TYPE</td>
					<td>ESTABLISHMENT_NAME</td>
					<td>ENTREPRENEUR</td>
					<td>OFFCODE</td>
					<td>TRACK_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationArrestLicenses}"  var="applicationArrestLicense">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationArrestLicense.id}</td>
			<td>
					${applicationArrestLicense.iswithdraw}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestLicense.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestLicense.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestLicense.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestLicense.create_by}
				</td>
				<td>
					${applicationArrestLicense.license_no}
				</td>
				<td>
					${applicationArrestLicense.book_no}
				</td>
				<td>
					${applicationArrestLicense.license_type}
				</td>
				<td>
					${applicationArrestLicense.establishment_name}
				</td>
				<td>
					${applicationArrestLicense.entrepreneur}
				</td>
				<td>
					${applicationArrestLicense.offcode}
				</td>
				<td>
					${applicationArrestLicense.track_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationArrestLicense&cmd=view&id='/>${applicationArrestLicense.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestLicense&cmd=edit&id='/>${applicationArrestLicense.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestLicense&cmd=delete&id='/>${applicationArrestLicense.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationArrestLicense&cmd=add'/>">Add New Record</a>
</form>