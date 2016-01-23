








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=DeliveryExhibit&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>SUBJECT_TYPE</td>
					<td>JOB_NO</td>
					<td>OFFCODE_TO</td>
					<td>OFFCODE_FROM</td>
					<td>LEGISLATION_ID</td>
					<td>DELIVERY_BY</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>STATUS</td>
					<td>OFFCODE_INFORM</td>
					<td>SUBJECT</td>
					<td>DELIVERY_DATE</td>
					<td>DELIVERY_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${deliveryExhibits}"  var="deliveryExhibit">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${deliveryExhibit.id}</td>
			<td>
					${deliveryExhibit.subject_type}
				</td>
				<td>
					${deliveryExhibit.job_no}
				</td>
				<td>
					${deliveryExhibit.offcode_to}
				</td>
				<td>
					${deliveryExhibit.offcode_from}
				</td>
				<td>
					${deliveryExhibit.legislation_id}
				</td>
				<td>
					${deliveryExhibit.delivery_by}
				</td>
				<td>
					<fmt:formatDate value="${deliveryExhibit.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${deliveryExhibit.update_by}
				</td>
				<td>
					<fmt:formatDate value="${deliveryExhibit.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${deliveryExhibit.create_by}
				</td>
				<td>
					${deliveryExhibit.status}
				</td>
				<td>
					${deliveryExhibit.offcode_inform}
				</td>
				<td>
					${deliveryExhibit.subject}
				</td>
				<td>
					<fmt:formatDate value="${deliveryExhibit.delivery_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${deliveryExhibit.delivery_code}
				</td>
						<td><a href="<c:url value='/process2?action=DeliveryExhibit&cmd=view&id='/>${deliveryExhibit.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=DeliveryExhibit&cmd=edit&id='/>${deliveryExhibit.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=DeliveryExhibit&cmd=delete&id='/>${deliveryExhibit.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=DeliveryExhibit&cmd=add'/>">Add New Record</a>
</form>