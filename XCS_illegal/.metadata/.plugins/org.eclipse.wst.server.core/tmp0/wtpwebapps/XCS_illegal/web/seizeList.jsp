








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Seize&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>DEL_IDCARDNO</td>
					<td>DEL_DATE</td>
					<td>DEL_FLAG</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>TRACK_NO</td>
					<td>SEIZE_LOCATION</td>
					<td>LIMIT_DATE</td>
					<td>CANCEL_DATE</td>
					<td>SEIZE_DATE</td>
					<td>ORDER_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${seizes}"  var="seize">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${seize.id}</td>
			<td>
					${seize.del_idcardno}
				</td>
				<td>
					<fmt:formatDate value="${seize.del_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${seize.del_flag}
				</td>
				<td>
					<fmt:formatDate value="${seize.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${seize.update_by}
				</td>
				<td>
					<fmt:formatDate value="${seize.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${seize.create_by}
				</td>
				<td>
					${seize.track_no}
				</td>
				<td>
					${seize.seize_location}
				</td>
				<td>
					<fmt:formatDate value="${seize.limit_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${seize.cancel_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${seize.seize_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${seize.order_no}
				</td>
						<td><a href="<c:url value='/process2?action=Seize&cmd=view&id='/>${seize.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Seize&cmd=edit&id='/>${seize.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Seize&cmd=delete&id='/>${seize.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Seize&cmd=add'/>">Add New Record</a>
</form>