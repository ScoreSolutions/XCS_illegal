








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Staff&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>DEPT_NAME</td>
					<td>POS_NAME</td>
					<td>POSCODE_ADMIN</td>
					<td>POSCODE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>PER_ID_REF</td>
					<td>OFFCODE</td>
					<td>STAFF_LEVEL</td>
					<td>BIRTHDATE</td>
					<td>SEX</td>
					<td>LAST_NAME</td>
					<td>FIRST_NAME</td>
					<td>TITLE_CODE</td>
					<td>PER_TYPE</td>
					<td>IDCARD_NO</td>
					<td>EMPID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${staffs}"  var="staff">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${staff.id}</td>
			<td>
					${staff.dept_name}
				</td>
				<td>
					${staff.pos_name}
				</td>
				<td>
					${staff.poscode_admin}
				</td>
				<td>
					${staff.poscode}
				</td>
				<td>
					<fmt:formatDate value="${staff.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${staff.update_by}
				</td>
				<td>
					<fmt:formatDate value="${staff.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${staff.create_by}
				</td>
				<td>
					${staff.per_id_ref}
				</td>
				<td>
					${staff.offcode}
				</td>
				<td>
					${staff.staff_level}
				</td>
				<td>
					<fmt:formatDate value="${staff.birthdate}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${staff.sex}
				</td>
				<td>
					${staff.last_name}
				</td>
				<td>
					${staff.first_name}
				</td>
				<td>
					${staff.title_code}
				</td>
				<td>
					${staff.per_type}
				</td>
				<td>
					${staff.idcard_no}
				</td>
				<td>
					${staff.empid}
				</td>
						<td><a href="<c:url value='/process2?action=Staff&cmd=view&id='/>${staff.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Staff&cmd=edit&id='/>${staff.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Staff&cmd=delete&id='/>${staff.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Staff&cmd=add'/>">Add New Record</a>
</form>