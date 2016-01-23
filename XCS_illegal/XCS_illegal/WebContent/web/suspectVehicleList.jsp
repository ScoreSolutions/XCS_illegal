








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=SuspectVehicle&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>DESCRIPTION</td>
					<td>CAR_COLOR</td>
					<td>CAR_MODEL</td>
					<td>BRAND_BRAND_CODE</td>
					<td>BRAND_DUTY_CODE</td>
					<td>CAR_NO</td>
					<td>CAR_CATE</td>
					<td>PRODUCTTYPE_TYPE_CODE</td>
					<td>PRODUCTTYPE_DUTY_CODE</td>
					<td>PROVINCE_CODE</td>
					<td>SUSPECT_INVESTIGATE_ID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${suspectVehicles}"  var="suspectVehicle">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${suspectVehicle.id}</td>
			<td>
					<fmt:formatDate value="${suspectVehicle.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspectVehicle.update_by}
				</td>
				<td>
					<fmt:formatDate value="${suspectVehicle.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspectVehicle.create_by}
				</td>
				<td>
					${suspectVehicle.description}
				</td>
				<td>
					${suspectVehicle.car_color}
				</td>
				<td>
					${suspectVehicle.car_model}
				</td>
				<td>
					${suspectVehicle.brand_brand_code}
				</td>
				<td>
					${suspectVehicle.brand_duty_code}
				</td>
				<td>
					${suspectVehicle.car_no}
				</td>
				<td>
					${suspectVehicle.car_cate}
				</td>
				<td>
					${suspectVehicle.producttype_type_code}
				</td>
				<td>
					${suspectVehicle.producttype_duty_code}
				</td>
				<td>
					${suspectVehicle.province_code}
				</td>
				<td>
					${suspectVehicle.suspect_investigate_id}
				</td>
						<td><a href="<c:url value='/process2?action=SuspectVehicle&cmd=view&id='/>${suspectVehicle.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=SuspectVehicle&cmd=edit&id='/>${suspectVehicle.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=SuspectVehicle&cmd=delete&id='/>${suspectVehicle.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=SuspectVehicle&cmd=add'/>">Add New Record</a>
</form>