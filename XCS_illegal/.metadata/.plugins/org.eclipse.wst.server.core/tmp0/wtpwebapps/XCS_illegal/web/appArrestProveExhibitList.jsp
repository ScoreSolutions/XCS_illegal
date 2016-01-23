








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=AppArrestProveExhibit&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>REMARKS</td>
					<td>APP_ARREST_PROVE_EXHIBIT_ID</td>
					<td>CAR_NO</td>
					<td>EXHIBIT_DESC</td>
					<td>EXHIBIT_LIST</td>
					<td>STATUS</td>
					<td>NETWEIGHT_UNIT_CODE</td>
					<td>NETWEIGHT</td>
					<td>QTY_UNIT_CODE</td>
					<td>QTY</td>
					<td>SIZE_UNIT_CODE</td>
					<td>SIZES_CODE</td>
					<td>ISDOMESTIC</td>
					<td>BRAND_CODE</td>
					<td>PRODUCT_CODE</td>
					<td>DUTY_CODE</td>
					<td>TRACK_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${appArrestProveExhibits}"  var="appArrestProveExhibit">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${appArrestProveExhibit.id}</td>
			<td>
					<fmt:formatDate value="${appArrestProveExhibit.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appArrestProveExhibit.update_by}
				</td>
				<td>
					<fmt:formatDate value="${appArrestProveExhibit.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${appArrestProveExhibit.create_by}
				</td>
				<td>
					${appArrestProveExhibit.remarks}
				</td>
				<td>
					${appArrestProveExhibit.app_arrest_prove_exhibit_id}
				</td>
				<td>
					${appArrestProveExhibit.car_no}
				</td>
				<td>
					${appArrestProveExhibit.exhibit_desc}
				</td>
				<td>
					${appArrestProveExhibit.exhibit_list}
				</td>
				<td>
					${appArrestProveExhibit.status}
				</td>
				<td>
					${appArrestProveExhibit.netweight_unit_code}
				</td>
				<td>
					${appArrestProveExhibit.netweight}
				</td>
				<td>
					${appArrestProveExhibit.qty_unit_code}
				</td>
				<td>
					${appArrestProveExhibit.qty}
				</td>
				<td>
					${appArrestProveExhibit.size_unit_code}
				</td>
				<td>
					${appArrestProveExhibit.sizes_code}
				</td>
				<td>
					${appArrestProveExhibit.isdomestic}
				</td>
				<td>
					${appArrestProveExhibit.brand_code}
				</td>
				<td>
					${appArrestProveExhibit.product_code}
				</td>
				<td>
					${appArrestProveExhibit.duty_code}
				</td>
				<td>
					${appArrestProveExhibit.track_no}
				</td>
						<td><a href="<c:url value='/process2?action=AppArrestProveExhibit&cmd=view&id='/>${appArrestProveExhibit.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=AppArrestProveExhibit&cmd=edit&id='/>${appArrestProveExhibit.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=AppArrestProveExhibit&cmd=delete&id='/>${appArrestProveExhibit.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=AppArrestProveExhibit&cmd=add'/>">Add New Record</a>
</form>