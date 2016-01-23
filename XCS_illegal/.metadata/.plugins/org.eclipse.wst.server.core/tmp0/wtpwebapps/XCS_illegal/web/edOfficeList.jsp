








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=EdOffice&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPD_DATE</td>
					<td>UPD_USERID</td>
					<td>END_DATE</td>
					<td>BEGIN_DATE</td>
					<td>SUPOFFCODE</td>
					<td>TAMBOL_CODE</td>
					<td>INDC_OFF</td>
					<td>SHORT_NAME</td>
					<td>OFFNAME</td>
					<td>OFFCODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${edOffices}"  var="edOffice">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${edOffice.id}</td>
			<td>
					<fmt:formatDate value="${edOffice.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${edOffice.upd_userid}
				</td>
				<td>
					<fmt:formatDate value="${edOffice.end_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${edOffice.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${edOffice.supoffcode}
				</td>
				<td>
					${edOffice.tambol_code}
				</td>
				<td>
					${edOffice.indc_off}
				</td>
				<td>
					${edOffice.short_name}
				</td>
				<td>
					${edOffice.offname}
				</td>
				<td>
					${edOffice.offcode}
				</td>
						<td><a href="<c:url value='/process2?action=EdOffice&cmd=view&id='/>${edOffice.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=EdOffice&cmd=edit&id='/>${edOffice.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=EdOffice&cmd=delete&id='/>${edOffice.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=EdOffice&cmd=add'/>">Add New Record</a>
</form>