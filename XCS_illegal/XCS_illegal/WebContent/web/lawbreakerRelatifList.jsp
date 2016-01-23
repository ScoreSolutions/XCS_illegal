








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=LawbreakerRelatif&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>IDCARDNO</td>
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
					<td>LAWBREAKER_NO</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${lawbreakerRelatifs}"  var="lawbreakerRelatif">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${lawbreakerRelatif.id}</td>
			<td>
					${lawbreakerRelatif.idcardno}
				</td>
				<td>
					${lawbreakerRelatif.email}
				</td>
				<td>
					${lawbreakerRelatif.tel}
				</td>
				<td>
					${lawbreakerRelatif.hometown_post_code}
				</td>
				<td>
					${lawbreakerRelatif.hometown_province_code}
				</td>
				<td>
					${lawbreakerRelatif.hometown_district_code}
				</td>
				<td>
					${lawbreakerRelatif.hometown_subdistrict_code}
				</td>
				<td>
					${lawbreakerRelatif.hometown_road}
				</td>
				<td>
					${lawbreakerRelatif.hometown_soi}
				</td>
				<td>
					${lawbreakerRelatif.hometown_moo}
				</td>
				<td>
					${lawbreakerRelatif.hometown_address_no}
				</td>
				<td>
					${lawbreakerRelatif.current_post_code}
				</td>
				<td>
					${lawbreakerRelatif.current_province_code}
				</td>
				<td>
					${lawbreakerRelatif.current_district_code}
				</td>
				<td>
					${lawbreakerRelatif.current_subdistrict_code}
				</td>
				<td>
					${lawbreakerRelatif.current_road}
				</td>
				<td>
					${lawbreakerRelatif.current_soi}
				</td>
				<td>
					${lawbreakerRelatif.current_moo}
				</td>
				<td>
					${lawbreakerRelatif.current_address_no}
				</td>
				<td>
					${lawbreakerRelatif.relation}
				</td>
				<td>
					${lawbreakerRelatif.last_name}
				</td>
				<td>
					${lawbreakerRelatif.first_name}
				</td>
				<td>
					${lawbreakerRelatif.title_code}
				</td>
				<td>
					${lawbreakerRelatif.lawbreaker_no}
				</td>
				<td>
					<fmt:formatDate value="${lawbreakerRelatif.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${lawbreakerRelatif.update_by}
				</td>
				<td>
					<fmt:formatDate value="${lawbreakerRelatif.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${lawbreakerRelatif.create_by}
				</td>
						<td><a href="<c:url value='/process2?action=LawbreakerRelatif&cmd=view&id='/>${lawbreakerRelatif.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=LawbreakerRelatif&cmd=edit&id='/>${lawbreakerRelatif.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=LawbreakerRelatif&cmd=delete&id='/>${lawbreakerRelatif.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=LawbreakerRelatif&cmd=add'/>">Add New Record</a>
</form>