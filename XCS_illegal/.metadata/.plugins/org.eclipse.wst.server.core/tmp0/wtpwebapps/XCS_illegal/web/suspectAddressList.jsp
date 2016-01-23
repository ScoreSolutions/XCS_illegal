








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=SuspectAddress&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>COORDINATE_Y</td>
					<td>COORDINATE_X</td>
					<td>DESCRIPTION</td>
					<td>FAX_NO</td>
					<td>TEL_NO</td>
					<td>ZIPCODE</td>
					<td>PROVINCE_CODE</td>
					<td>DISTRICT_CODE</td>
					<td>SUBDISTRICT_CODE</td>
					<td>MOO</td>
					<td>ROAD</td>
					<td>SOI</td>
					<td>ADDRESS_NAME</td>
					<td>ADDRESS</td>
					<td>SUSPECT_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${suspectAddresss}"  var="suspectAddress">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${suspectAddress.id}</td>
			<td>
					${suspectAddress.coordinate_y}
				</td>
				<td>
					${suspectAddress.coordinate_x}
				</td>
				<td>
					${suspectAddress.description}
				</td>
				<td>
					${suspectAddress.fax_no}
				</td>
				<td>
					${suspectAddress.tel_no}
				</td>
				<td>
					${suspectAddress.zipcode}
				</td>
				<td>
					${suspectAddress.province_code}
				</td>
				<td>
					${suspectAddress.district_code}
				</td>
				<td>
					${suspectAddress.subdistrict_code}
				</td>
				<td>
					${suspectAddress.moo}
				</td>
				<td>
					${suspectAddress.road}
				</td>
				<td>
					${suspectAddress.soi}
				</td>
				<td>
					${suspectAddress.address_name}
				</td>
				<td>
					${suspectAddress.address}
				</td>
				<td>
					${suspectAddress.suspect_no}
				</td>
						<td><a href="<c:url value='/process2?action=SuspectAddress&cmd=view&id='/>${suspectAddress.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=SuspectAddress&cmd=edit&id='/>${suspectAddress.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=SuspectAddress&cmd=delete&id='/>${suspectAddress.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=SuspectAddress&cmd=add'/>">Add New Record</a>
</form>