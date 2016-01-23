








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationSincereConfirm&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>OFFNAME</td>
					<td>OFFCODE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>DETECT_RESULT</td>
					<td>STORE_BY</td>
					<td>STORE_PLACE</td>
					<td>OWNER_BY</td>
					<td>OWNER_NAME</td>
					<td>TEL</td>
					<td>ZIPCODE</td>
					<td>SUBDISTRICT_CODE</td>
					<td>DISTRICT_CODE</td>
					<td>PROVINCE_CODE</td>
					<td>ROAD</td>
					<td>SOI</td>
					<td>MOO</td>
					<td>ADDRESS_NO</td>
					<td>ADDRESS_NAME</td>
					<td>COORDINATE_Y</td>
					<td>COORDINATE_X</td>
					<td>OFFCODE_DETECT</td>
					<td>POSCODE_DETECT</td>
					<td>STAFF_IDCARDNO_DETECT</td>
					<td>NOTICE_DATE</td>
					<td>DETECT_DATE</td>
					<td>INPUT_DATE</td>
					<td>TRACK_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationSincereConfirms}"  var="applicationSincereConfirm">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationSincereConfirm.id}</td>
			<td>
					${applicationSincereConfirm.offname}
				</td>
				<td>
					${applicationSincereConfirm.offcode}
				</td>
				<td>
					<fmt:formatDate value="${applicationSincereConfirm.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSincereConfirm.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationSincereConfirm.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSincereConfirm.create_by}
				</td>
				<td>
					${applicationSincereConfirm.detect_result}
				</td>
				<td>
					${applicationSincereConfirm.store_by}
				</td>
				<td>
					${applicationSincereConfirm.store_place}
				</td>
				<td>
					${applicationSincereConfirm.owner_by}
				</td>
				<td>
					${applicationSincereConfirm.owner_name}
				</td>
				<td>
					${applicationSincereConfirm.tel}
				</td>
				<td>
					${applicationSincereConfirm.zipcode}
				</td>
				<td>
					${applicationSincereConfirm.subdistrict_code}
				</td>
				<td>
					${applicationSincereConfirm.district_code}
				</td>
				<td>
					${applicationSincereConfirm.province_code}
				</td>
				<td>
					${applicationSincereConfirm.road}
				</td>
				<td>
					${applicationSincereConfirm.soi}
				</td>
				<td>
					${applicationSincereConfirm.moo}
				</td>
				<td>
					${applicationSincereConfirm.address_no}
				</td>
				<td>
					${applicationSincereConfirm.address_name}
				</td>
				<td>
					${applicationSincereConfirm.coordinate_y}
				</td>
				<td>
					${applicationSincereConfirm.coordinate_x}
				</td>
				<td>
					${applicationSincereConfirm.offcode_detect}
				</td>
				<td>
					${applicationSincereConfirm.poscode_detect}
				</td>
				<td>
					${applicationSincereConfirm.staff_idcardno_detect}
				</td>
				<td>
					<fmt:formatDate value="${applicationSincereConfirm.notice_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${applicationSincereConfirm.detect_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${applicationSincereConfirm.input_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSincereConfirm.track_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationSincereConfirm&cmd=view&id='/>${applicationSincereConfirm.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationSincereConfirm&cmd=edit&id='/>${applicationSincereConfirm.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationSincereConfirm&cmd=delete&id='/>${applicationSincereConfirm.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationSincereConfirm&cmd=add'/>">Add New Record</a>
</form>