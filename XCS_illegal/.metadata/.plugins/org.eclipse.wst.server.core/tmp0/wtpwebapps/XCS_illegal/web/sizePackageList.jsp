








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=SizePackage&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPD_USERID</td>
					<td>UPD_DATE</td>
					<td>END_DATE</td>
					<td>BEGIN_DATE</td>
					<td>UNIT_CODE</td>
					<td>SIZE_DESC</td>
					<td>SIZE_CODE</td>
					<td>DUTY_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${sizePackages}"  var="sizePackage">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${sizePackage.id}</td>
			<td>
					${sizePackage.upd_userid}
				</td>
				<td>
					<fmt:formatDate value="${sizePackage.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${sizePackage.end_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${sizePackage.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${sizePackage.unit_code}
				</td>
				<td>
					${sizePackage.size_desc}
				</td>
				<td>
					${sizePackage.size_code}
				</td>
				<td>
					${sizePackage.duty_code}
				</td>
						<td><a href="<c:url value='/process2?action=SizePackage&cmd=view&id='/>${sizePackage.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=SizePackage&cmd=edit&id='/>${sizePackage.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=SizePackage&cmd=delete&id='/>${sizePackage.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=SizePackage&cmd=add'/>">Add New Record</a>
</form>