








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=TranLog&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>BROWSER</td>
					<td>SESSIONID</td>
					<td>IP_ADDRESS</td>
					<td>TRAN_DESC</td>
					<td>TRAN_DATE</td>
					<td>USERID</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${tranLogs}"  var="tranLog">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${tranLog.id}</td>
			<td>
					${tranLog.browser}
				</td>
				<td>
					${tranLog.sessionid}
				</td>
				<td>
					${tranLog.ip_address}
				</td>
				<td>
					${tranLog.tran_desc}
				</td>
				<td>
					<fmt:formatDate value="${tranLog.tran_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${tranLog.userid}
				</td>
						<td><a href="<c:url value='/process2?action=TranLog&cmd=view&id='/>${tranLog.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=TranLog&cmd=edit&id='/>${tranLog.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=TranLog&cmd=delete&id='/>${tranLog.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=TranLog&cmd=add'/>">Add New Record</a>
</form>