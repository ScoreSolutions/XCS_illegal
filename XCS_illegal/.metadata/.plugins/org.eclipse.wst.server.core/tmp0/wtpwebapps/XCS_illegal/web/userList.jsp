








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=User&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>SALARY</td>
					<td>PARENT_ID</td>
					<td>PHOTO</td>
					<td>SEX</td>
					<td>UPDATE_BY</td>
					<td>CREATE_BY</td>
					<td>UPDATE_ON</td>
					<td>CREATE_ON</td>
					<td>USER_PASS</td>
					<td>USER_LOGIN</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${users}"  var="user">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${user.id}</td>
			<td>
					${user.salary}
				</td>
				<td>
					${user.parent_id}
				</td>
				<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=USERS&id=${user.id}" widht=100 height=100>
				</td>
				<td>
					${user.sex}
				</td>
				<td>
					${user.update_by}
				</td>
				<td>
					${user.create_by}
				</td>
				<td>
					<fmt:formatDate value="${user.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${user.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${user.user_pass}
				</td>
				<td>
					${user.user_login}
				</td>
						<td><a href="<c:url value='/process2?action=User&cmd=view&id='/>${user.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=User&cmd=edit&id='/>${user.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=User&cmd=delete&id='/>${user.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=User&cmd=add'/>">Add New Record</a>
</form>