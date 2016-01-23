








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Title&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>TITLE_CODE</td>
				<td>UPD_DATE</td>
					<td>UPD_USERID</td>
					<td>END_DATE</td>
					<td>BEGIN_DATE</td>
					<td>TITLE_SEO</td>
					<td>SHORT_SUFFIX</td>
					<td>SUFFIX_NAME</td>
					<td>SHORT_TITLE</td>
					<td>TITLE_NAME</td>
					<td>TITLE_TYPE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${titles}"  var="title">
			<tr>
				<td><input type="checkbox" name="title_code" value="${user.id}"/></td>
				<td>${title.title_code}</td>
			<td>
					<fmt:formatDate value="${title.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${title.upd_userid}
				</td>
				<td>
					<fmt:formatDate value="${title.end_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${title.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${title.title_seo}
				</td>
				<td>
					${title.short_suffix}
				</td>
				<td>
					${title.suffix_name}
				</td>
				<td>
					${title.short_title}
				</td>
				<td>
					${title.title_name}
				</td>
				<td>
					${title.title_type}
				</td>
						<td><a href="<c:url value='/process2?action=Title&cmd=view&title_code='/>${title.title_code}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Title&cmd=edit&title_code='/>${title.title_code}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Title&cmd=delete&title_code='/>${title.title_code}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Title&cmd=add'/>">Add New Record</a>
</form>