








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=SuspectRelatif&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>IDCARDNO</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>EMAIL</td>
					<td>TEL</td>
					<td>HOMETOWN_POST_CODE</td>
					<td>HOMETOWN_PROVINCE_CODE</td>
					<td>HOMETOWN_DISTRICT_CODE</td>
					<td>HOMETOWN_SUBDISTRICT_CODE</td>
					<td>HOMETOWN_ROAD</td>
					<td>HOMETOWN_SOI</td>
					<td>HOMETOWN_MOO</td>
					<td>HOMETOWN_ADDRESS_NO</td>
					<td>CURRENT_POST_CODE</td>
					<td>CURRENT_PROVINCE_CODE</td>
					<td>CURRENT_DISTRICT_CODE</td>
					<td>CURRENT_SUBDISTRICT_CODE</td>
					<td>CURRENT_ROAD</td>
					<td>CURRENT_SOI</td>
					<td>CURRENT_MOO</td>
					<td>CURRENT_ADDRESS_NO</td>
					<td>RELATION</td>
					<td>LAST_NAME</td>
					<td>FIRST_NAME</td>
					<td>TITLE_CODE</td>
					<td>SUSPECT_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${suspectRelatifs}"  var="suspectRelatif">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${suspectRelatif.id}</td>
			<td>
					${suspectRelatif.idcardno}
				</td>
				<td>
					<fmt:formatDate value="${suspectRelatif.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspectRelatif.update_by}
				</td>
				<td>
					<fmt:formatDate value="${suspectRelatif.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspectRelatif.create_by}
				</td>
				<td>
					${suspectRelatif.email}
				</td>
				<td>
					${suspectRelatif.tel}
				</td>
				<td>
					${suspectRelatif.hometown_post_code}
				</td>
				<td>
					${suspectRelatif.hometown_province_code}
				</td>
				<td>
					${suspectRelatif.hometown_district_code}
				</td>
				<td>
					${suspectRelatif.hometown_subdistrict_code}
				</td>
				<td>
					${suspectRelatif.hometown_road}
				</td>
				<td>
					${suspectRelatif.hometown_soi}
				</td>
				<td>
					${suspectRelatif.hometown_moo}
				</td>
				<td>
					${suspectRelatif.hometown_address_no}
				</td>
				<td>
					${suspectRelatif.current_post_code}
				</td>
				<td>
					${suspectRelatif.current_province_code}
				</td>
				<td>
					${suspectRelatif.current_district_code}
				</td>
				<td>
					${suspectRelatif.current_subdistrict_code}
				</td>
				<td>
					${suspectRelatif.current_road}
				</td>
				<td>
					${suspectRelatif.current_soi}
				</td>
				<td>
					${suspectRelatif.current_moo}
				</td>
				<td>
					${suspectRelatif.current_address_no}
				</td>
				<td>
					${suspectRelatif.relation}
				</td>
				<td>
					${suspectRelatif.last_name}
				</td>
				<td>
					${suspectRelatif.first_name}
				</td>
				<td>
					${suspectRelatif.title_code}
				</td>
				<td>
					${suspectRelatif.suspect_no}
				</td>
						<td><a href="<c:url value='/process2?action=SuspectRelatif&cmd=view&id='/>${suspectRelatif.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=SuspectRelatif&cmd=edit&id='/>${suspectRelatif.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=SuspectRelatif&cmd=delete&id='/>${suspectRelatif.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=SuspectRelatif&cmd=add'/>">Add New Record</a>
</form>