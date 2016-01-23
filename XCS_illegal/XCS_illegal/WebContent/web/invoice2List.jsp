








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Invoice2&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>OFFCODE_CANCEL</td>
					<td>CANCEL_DATE</td>
					<td>POSCODE_CANCEL</td>
					<td>STAFF_CANCEL</td>
					<td>STATUS</td>
					<td>INTERIOR_REMARKS</td>
					<td>TAX_REMARKS</td>
					<td>INTERIOR_FINE</td>
					<td>TAX_FINE</td>
					<td>OFFCODE_RECEIVE</td>
					<td>POSCODE_RECEIVE</td>
					<td>STAFF_RECEIVE</td>
					<td>SEND_NO</td>
					<td>SEND_BOOKNO</td>
					<td>COMPARE_CASE_ID</td>
					<td>INV_DATE</td>
					<td>INV_NO</td>
					<td>INV_BOOKNO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${invoice2s}"  var="invoice2">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${invoice2.id}</td>
			<td>
					<fmt:formatDate value="${invoice2.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${invoice2.update_by}
				</td>
				<td>
					<fmt:formatDate value="${invoice2.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${invoice2.create_by}
				</td>
				<td>
					${invoice2.offcode_cancel}
				</td>
				<td>
					<fmt:formatDate value="${invoice2.cancel_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${invoice2.poscode_cancel}
				</td>
				<td>
					${invoice2.staff_cancel}
				</td>
				<td>
					${invoice2.status}
				</td>
				<td>
					${invoice2.interior_remarks}
				</td>
				<td>
					${invoice2.tax_remarks}
				</td>
				<td>
					${invoice2.interior_fine}
				</td>
				<td>
					${invoice2.tax_fine}
				</td>
				<td>
					${invoice2.offcode_receive}
				</td>
				<td>
					${invoice2.poscode_receive}
				</td>
				<td>
					${invoice2.staff_receive}
				</td>
				<td>
					${invoice2.send_no}
				</td>
				<td>
					${invoice2.send_bookno}
				</td>
				<td>
					${invoice2.compare_case_id}
				</td>
				<td>
					<fmt:formatDate value="${invoice2.inv_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${invoice2.inv_no}
				</td>
				<td>
					${invoice2.inv_bookno}
				</td>
						<td><a href="<c:url value='/process2?action=Invoice2&cmd=view&id='/>${invoice2.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Invoice2&cmd=edit&id='/>${invoice2.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Invoice2&cmd=delete&id='/>${invoice2.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Invoice2&cmd=add'/>">Add New Record</a>
</form>