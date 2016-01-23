








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=LawbreakerAddress&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>DESCRIPTION</td>
					<td>FAX_NO</td>
					<td>TEL_NO</td>
					<td>ZIPCODE</td>
					<td>PROVINCE_CODE</td>
					<td>DISTRIC_CODE</td>
					<td>SUBDISTRIC_CODE</td>
					<td>MOO</td>
					<td>ROAD</td>
					<td>SOI</td>
					<td>ADDRESS_NAME</td>
					<td>ADDRESS</td>
					<td>LAWBREAKER_NO</td>
					<td>ADDRESS_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${lawbreakerAddresss}"  var="lawbreakerAddress">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${lawbreakerAddress.id}</td>
			<td>
					${lawbreakerAddress.description}
				</td>
				<td>
					${lawbreakerAddress.fax_no}
				</td>
				<td>
					${lawbreakerAddress.tel_no}
				</td>
				<td>
					${lawbreakerAddress.zipcode}
				</td>
				<td>
					${lawbreakerAddress.province_code}
				</td>
				<td>
					${lawbreakerAddress.distric_code}
				</td>
				<td>
					${lawbreakerAddress.subdistric_code}
				</td>
				<td>
					${lawbreakerAddress.moo}
				</td>
				<td>
					${lawbreakerAddress.road}
				</td>
				<td>
					${lawbreakerAddress.soi}
				</td>
				<td>
					${lawbreakerAddress.address_name}
				</td>
				<td>
					${lawbreakerAddress.address}
				</td>
				<td>
					${lawbreakerAddress.lawbreaker_no}
				</td>
				<td>
					${lawbreakerAddress.address_no}
				</td>
						<td><a href="<c:url value='/process2?action=LawbreakerAddress&cmd=view&id='/>${lawbreakerAddress.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=LawbreakerAddress&cmd=edit&id='/>${lawbreakerAddress.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=LawbreakerAddress&cmd=delete&id='/>${lawbreakerAddress.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=LawbreakerAddress&cmd=add'/>">Add New Record</a>
</form>