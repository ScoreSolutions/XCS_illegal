








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationArrest&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>ARREST_REPORT_DATE</td>
					<td>ISSENTCOURT</td>
					<td>ACCUSER_POSCODE</td>
					<td>ACCUSER_OFFCODE</td>
					<td>ACCUSER_IDCARDNO</td>
					<td>APPLICATION_SINCERE_CONFIRM_ID</td>
					<td>APPLICATION_SEARCH_WARRANT_ID</td>
					<td>APPLICATION_NOTICE_ARREST_ID</td>
					<td>POLICE_STATION</td>
					<td>ACCUSER_TYPE</td>
					<td>PRODUCT_GROUP_ID</td>
					<td>COORDINATE_Y</td>
					<td>COORDINATE_X</td>
					<td>ESTIMATE_FINE_DATE</td>
					<td>ESTIMATE_FINE</td>
					<td>DEL_FLAG</td>
					<td>ADMINISTRATION</td>
					<td>LAWBREAK_TYPE</td>
					<td>DEPARTMENT_NAME</td>
					<td>FINISHED_TIME</td>
					<td>TESTIMONY</td>
					<td>BEHAVIOUR</td>
					<td>DIRECTOR_POSITION</td>
					<td>LEADER_POSITION</td>
					<td>ORDER_BY</td>
					<td>REPORT_TO</td>
					<td>DUTY</td>
					<td>SURETY_NAME</td>
					<td>BUSINESS_NAME</td>
					<td>OWNER_NAME</td>
					<td>GUILTY</td>
					<td>OCCURRENCE_DATE</td>
					<td>ALLEGED_CO</td>
					<td>SCENE_PROVINCE</td>
					<td>SCENE_DISTRICT</td>
					<td>SCENE_SUBDISTRICT</td>
					<td>SCENE_ROAD</td>
					<td>SCENE_SOI</td>
					<td>SCENE_MOO</td>
					<td>SCENE_NO</td>
					<td>SCENE_NAME</td>
					<td>HAVE_CULPRIT</td>
					<td>LEGISLATION_ID</td>
					<td>OFFCODE</td>
					<td>DEPARTMENT_ID</td>
					<td>APPLICATION_DATE</td>
					<td>TRACK_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationArrests}"  var="applicationArrest">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationArrest.id}</td>
			<td>
					<fmt:formatDate value="${applicationArrest.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrest.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrest.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrest.create_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrest.arrest_report_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrest.issentcourt}
				</td>
				<td>
					${applicationArrest.accuser_poscode}
				</td>
				<td>
					${applicationArrest.accuser_offcode}
				</td>
				<td>
					${applicationArrest.accuser_idcardno}
				</td>
				<td>
					${applicationArrest.application_sincere_confirm_id}
				</td>
				<td>
					${applicationArrest.application_search_warrant_id}
				</td>
				<td>
					${applicationArrest.application_notice_arrest_id}
				</td>
				<td>
					${applicationArrest.police_station}
				</td>
				<td>
					${applicationArrest.accuser_type}
				</td>
				<td>
					${applicationArrest.product_group_id}
				</td>
				<td>
					${applicationArrest.coordinate_y}
				</td>
				<td>
					${applicationArrest.coordinate_x}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrest.estimate_fine_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrest.estimate_fine}
				</td>
				<td>
					${applicationArrest.del_flag}
				</td>
				<td>
					${applicationArrest.administration}
				</td>
				<td>
					${applicationArrest.lawbreak_type}
				</td>
				<td>
					${applicationArrest.department_name}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrest.finished_time}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrest.testimony}
				</td>
				<td>
					${applicationArrest.behaviour}
				</td>
				<td>
					${applicationArrest.director_position}
				</td>
				<td>
					${applicationArrest.leader_position}
				</td>
				<td>
					${applicationArrest.order_by}
				</td>
				<td>
					${applicationArrest.report_to}
				</td>
				<td>
					${applicationArrest.duty}
				</td>
				<td>
					${applicationArrest.surety_name}
				</td>
				<td>
					${applicationArrest.business_name}
				</td>
				<td>
					${applicationArrest.owner_name}
				</td>
				<td>
					${applicationArrest.guilty}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrest.occurrence_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrest.alleged_co}
				</td>
				<td>
					${applicationArrest.scene_province}
				</td>
				<td>
					${applicationArrest.scene_district}
				</td>
				<td>
					${applicationArrest.scene_subdistrict}
				</td>
				<td>
					${applicationArrest.scene_road}
				</td>
				<td>
					${applicationArrest.scene_soi}
				</td>
				<td>
					${applicationArrest.scene_moo}
				</td>
				<td>
					${applicationArrest.scene_no}
				</td>
				<td>
					${applicationArrest.scene_name}
				</td>
				<td>
					${applicationArrest.have_culprit}
				</td>
				<td>
					${applicationArrest.legislation_id}
				</td>
				<td>
					${applicationArrest.offcode}
				</td>
				<td>
					${applicationArrest.department_id}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrest.application_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrest.track_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationArrest&cmd=view&id='/>${applicationArrest.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrest&cmd=edit&id='/>${applicationArrest.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrest&cmd=delete&id='/>${applicationArrest.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationArrest&cmd=add'/>">Add New Record</a>
</form>