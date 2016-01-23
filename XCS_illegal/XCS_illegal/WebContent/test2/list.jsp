<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
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
<table><tr><td><%= formHandler.getFormMessage() %></td></tr></table>
<form id="list" name="dataform" method="post" action="<c:url value="/process?action=User&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('ยืนยันการลบข้อมูล')"/></td>
			<td>Id</td>
			<td>login_name</td>
			<td>user_password</td>
			<td>create_on</td>
			<td>update_on</td>
			<td>create_by</td>
			<td>update_by</td>
			<td>sex</td>
			<td>photo</td>
			<td>ดูข้อมูล</td>
			<td>แก้ไข</td>
			<td>ลบ</td>
		</tr>
		<c:forEach items="${users}"  var="user">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${user.id}</td>
				<td><c:out value="${user.user_login}" /></td>
				<td><c:out value="${user.user_pass}"/></td>
				<td><input type="text" value="<fmt:formatDate value="${user.create_on}" pattern="dd/MM/yyyy HH:mm:ss"/>"/></td>
				<td>update_on</td>
				<td>create_by</td>
				<td>update_by</td>
				<td>sex</td>
				<td><img src="<c:url value='/process?action=GetImage'/>&id=${user.id}" widht=100 height=100></td>
				<td><a href="<c:url value='/process?action=User&cmd=view&id='/>${user.id}" >View</a></td>
				<td><a href="<c:url value='/process?action=User&cmd=edit&id='/>${user.id}">Edit</a></td>
				<td><a href="<c:url value='/process?action=User&cmd=delete&id='/>${user.id}" onclick="return confirmBox('ยืนยันการลบข้อมูล')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process?action=User&cmd=add'/>">Add a new book</a>
</form>
<jsp:useBean id="now" class="java.util.Date" />
<fmt:formatDate value="${now}" pattern="dd-MM-yyyy HH:mm:ss"/>