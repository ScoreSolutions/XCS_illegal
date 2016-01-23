








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=SuspectPicture&cmd=delete"/>">
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
					<td>MIME_TYPE</td>
					<td>PICTURE</td>
					<td>PICTURE_CATEGORY_ID</td>
					<td>SUSPECT_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${suspectPictures}"  var="suspectPicture">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${suspectPicture.id}</td>
			<td>
					<fmt:formatDate value="${suspectPicture.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspectPicture.update_by}
				</td>
				<td>
					<fmt:formatDate value="${suspectPicture.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspectPicture.create_by}
				</td>
				<td>
					${suspectPicture.description}
				</td>
				<td>
					${suspectPicture.mime_type}
				</td>
				<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=SUSPECT_PICTURE&id=${suspectPicture.id}" widht=100 height=100>
				</td>
				<td>
					${suspectPicture.picture_category_id}
				</td>
				<td>
					${suspectPicture.suspect_no}
				</td>
						<td><a href="<c:url value='/process2?action=SuspectPicture&cmd=view&id='/>${suspectPicture.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=SuspectPicture&cmd=edit&id='/>${suspectPicture.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=SuspectPicture&cmd=delete&id='/>${suspectPicture.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=SuspectPicture&cmd=add'/>">Add New Record</a>
</form>