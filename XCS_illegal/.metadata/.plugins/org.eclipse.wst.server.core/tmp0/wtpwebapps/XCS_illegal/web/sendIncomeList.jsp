








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=SendIncome&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>STATUS</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>INV_NO</td>
					<td>POSCODE_APPROVE</td>
					<td>STAFF_ID_APPROVE</td>
					<td>POSCODE_SEND</td>
					<td>STAFF_ID_SEND</td>
					<td>FINE_DATE_TO</td>
					<td>FINE_DATE_FROM</td>
					<td>LEGISLATION_ID</td>
					<td>OFFCODE_AREA</td>
					<td>OFFNAME_WRITE</td>
					<td>OFFCODE_WRITE</td>
					<td>SEND_DOC_NO</td>
					<td>SEND_DATE</td>
					<td>SEND_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${sendIncomes}"  var="sendIncome">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${sendIncome.id}</td>
			<td>
					${sendIncome.status}
				</td>
				<td>
					<fmt:formatDate value="${sendIncome.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${sendIncome.update_by}
				</td>
				<td>
					<fmt:formatDate value="${sendIncome.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${sendIncome.create_by}
				</td>
				<td>
					${sendIncome.inv_no}
				</td>
				<td>
					${sendIncome.poscode_approve}
				</td>
				<td>
					${sendIncome.staff_id_approve}
				</td>
				<td>
					${sendIncome.poscode_send}
				</td>
				<td>
					${sendIncome.staff_id_send}
				</td>
				<td>
					<fmt:formatDate value="${sendIncome.fine_date_to}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${sendIncome.fine_date_from}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${sendIncome.legislation_id}
				</td>
				<td>
					${sendIncome.offcode_area}
				</td>
				<td>
					${sendIncome.offname_write}
				</td>
				<td>
					${sendIncome.offcode_write}
				</td>
				<td>
					${sendIncome.send_doc_no}
				</td>
				<td>
					<fmt:formatDate value="${sendIncome.send_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${sendIncome.send_no}
				</td>
						<td><a href="<c:url value='/process2?action=SendIncome&cmd=view&id='/>${sendIncome.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=SendIncome&cmd=edit&id='/>${sendIncome.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=SendIncome&cmd=delete&id='/>${sendIncome.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=SendIncome&cmd=add'/>">Add New Record</a>
</form>