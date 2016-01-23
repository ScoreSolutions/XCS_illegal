








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationArrestExhibit&cmd=delete"/>">
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
					<td>DUTY_CODE</td>
					<td>APPLICATION_ARREST_EXHIBIT_ID</td>
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
					<td>ISEXHIBITCO</td>
					<td>TRACK_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationArrestExhibits}"  var="applicationArrestExhibit">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationArrestExhibit.id}</td>
			<td>
					<fmt:formatDate value="${applicationArrestExhibit.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestExhibit.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestExhibit.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestExhibit.create_by}
				</td>
				<td>
					${applicationArrestExhibit.remarks}
				</td>
				<td>
					${applicationArrestExhibit.duty_code}
				</td>
				<td>
					${applicationArrestExhibit.application_arrest_exhibit_id}
				</td>
				<td>
					${applicationArrestExhibit.car_no}
				</td>
				<td>
					${applicationArrestExhibit.exhibit_desc}
				</td>
				<td>
					${applicationArrestExhibit.exhibit_list}
				</td>
				<td>
					${applicationArrestExhibit.status}
				</td>
				<td>
					${applicationArrestExhibit.netweight_unit_code}
				</td>
				<td>
					${applicationArrestExhibit.netweight}
				</td>
				<td>
					${applicationArrestExhibit.qty_unit_code}
				</td>
				<td>
					${applicationArrestExhibit.qty}
				</td>
				<td>
					${applicationArrestExhibit.size_unit_code}
				</td>
				<td>
					${applicationArrestExhibit.sizes_code}
				</td>
				<td>
					${applicationArrestExhibit.isdomestic}
				</td>
				<td>
					${applicationArrestExhibit.brand_code}
				</td>
				<td>
					${applicationArrestExhibit.product_code}
				</td>
				<td>
					${applicationArrestExhibit.isexhibitco}
				</td>
				<td>
					${applicationArrestExhibit.track_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationArrestExhibit&cmd=view&id='/>${applicationArrestExhibit.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestExhibit&cmd=edit&id='/>${applicationArrestExhibit.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestExhibit&cmd=delete&id='/>${applicationArrestExhibit.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationArrestExhibit&cmd=add'/>">Add New Record</a>
</form>