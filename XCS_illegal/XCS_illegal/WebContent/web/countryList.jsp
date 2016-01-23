








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Country&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPD_DATE</td>
					<td>UPD_USERID</td>
					<td>END_DATE</td>
					<td>BEGIN_DATE</td>
					<td>COUNTRY_SEQ</td>
					<td>RACE_NAME</td>
					<td>INDC_AFTA</td>
					<td>CONTINENT</td>
					<td>SHORT_NAME</td>
					<td>COUNTRY_NAME</td>
					<td>COUNTRY_CODE</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${countrys}"  var="country">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${country.id}</td>
			<td>
					<fmt:formatDate value="${country.upd_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${country.upd_userid}
				</td>
				<td>
					<fmt:formatDate value="${country.end_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${country.begin_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${country.country_seq}
				</td>
				<td>
					${country.race_name}
				</td>
				<td>
					${country.indc_afta}
				</td>
				<td>
					${country.continent}
				</td>
				<td>
					${country.short_name}
				</td>
				<td>
					${country.country_name}
				</td>
				<td>
					${country.country_code}
				</td>
						<td><a href="<c:url value='/process2?action=Country&cmd=view&id='/>${country.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Country&cmd=edit&id='/>${country.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Country&cmd=delete&id='/>${country.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Country&cmd=add'/>">Add New Record</a>
</form>