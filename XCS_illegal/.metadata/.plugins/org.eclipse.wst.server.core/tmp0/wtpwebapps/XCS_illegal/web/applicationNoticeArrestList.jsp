








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationNoticeArrest&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ISFINGERAPPROVE</td>
					<td>INFORM_TYPE</td>
					<td>DEL_FLAG</td>
					<td>OFFCODE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>ISREWARD_PAY</td>
					<td>ISMANAGE</td>
					<td>NOTICE_RESULT</td>
					<td>REMARKS</td>
					<td>NEXT_STEP</td>
					<td>OFFCODE_COMMANDER</td>
					<td>POSCODE_COMMANDER</td>
					<td>STAFF_ID_COMMANDER</td>
					<td>STAFF_ID_ACCEPT</td>
					<td>OFFCODE_SURETY</td>
					<td>POSCODE_SURETY</td>
					<td>STAFF_ID_SURETY</td>
					<td>OFFCODE_RECEIVE</td>
					<td>POSCODE_RECEIVE</td>
					<td>STAFF_ID_RECEIVE</td>
					<td>HIDING_PLACE</td>
					<td>VEHICLE_PARTICULAR</td>
					<td>LAWBREAKER_PROVINCE_CODE</td>
					<td>LAWBREAKER_DISTRICT_CODE</td>
					<td>LAWBREAKER_SUBDISTRICT_CODE</td>
					<td>LAWBREAKER_MOO</td>
					<td>LAWBREAKER_ROAD</td>
					<td>LAWBREAKER_SOI</td>
					<td>LAWBREAKER_ADDRESS_NAME</td>
					<td>LAWBREAKER_ADDRESS</td>
					<td>SECRET_LEVEL</td>
					<td>ARREST_DESC</td>
					<td>INFORM_PROVINCE_CODE</td>
					<td>INFORM_DISTRICT_CODE</td>
					<td>INFORM_SUBDISTRICT_CODE</td>
					<td>INFORM_MOO</td>
					<td>INFORM_ROAD</td>
					<td>INFORM_SOI</td>
					<td>INFORM_ADDRESS_NAME</td>
					<td>INFORM_ADDRESS</td>
					<td>INFORM_AGE</td>
					<td>INFORM_NAME</td>
					<td>LAWBREAKER_NO</td>
					<td>RECEIVE_DATE</td>
					<td>DUTY_CODE</td>
					<td>LEGISLATION_ID</td>
					<td>OFFNAME</td>
					<td>NOTICE_DATE</td>
					<td>NOTICE_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationNoticeArrests}"  var="applicationNoticeArrest">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationNoticeArrest.id}</td>
			<td>
					${applicationNoticeArrest.isfingerapprove}
				</td>
				<td>
					${applicationNoticeArrest.inform_type}
				</td>
				<td>
					${applicationNoticeArrest.del_flag}
				</td>
				<td>
					${applicationNoticeArrest.offcode}
				</td>
				<td>
					<fmt:formatDate value="${applicationNoticeArrest.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationNoticeArrest.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationNoticeArrest.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationNoticeArrest.create_by}
				</td>
				<td>
					${applicationNoticeArrest.isreward_pay}
				</td>
				<td>
					${applicationNoticeArrest.ismanage}
				</td>
				<td>
					${applicationNoticeArrest.notice_result}
				</td>
				<td>
					${applicationNoticeArrest.remarks}
				</td>
				<td>
					${applicationNoticeArrest.next_step}
				</td>
				<td>
					${applicationNoticeArrest.offcode_commander}
				</td>
				<td>
					${applicationNoticeArrest.poscode_commander}
				</td>
				<td>
					${applicationNoticeArrest.staff_id_commander}
				</td>
				<td>
					${applicationNoticeArrest.staff_id_accept}
				</td>
				<td>
					${applicationNoticeArrest.offcode_surety}
				</td>
				<td>
					${applicationNoticeArrest.poscode_surety}
				</td>
				<td>
					${applicationNoticeArrest.staff_id_surety}
				</td>
				<td>
					${applicationNoticeArrest.offcode_receive}
				</td>
				<td>
					${applicationNoticeArrest.poscode_receive}
				</td>
				<td>
					${applicationNoticeArrest.staff_id_receive}
				</td>
				<td>
					${applicationNoticeArrest.hiding_place}
				</td>
				<td>
					${applicationNoticeArrest.vehicle_particular}
				</td>
				<td>
					${applicationNoticeArrest.lawbreaker_province_code}
				</td>
				<td>
					${applicationNoticeArrest.lawbreaker_district_code}
				</td>
				<td>
					${applicationNoticeArrest.lawbreaker_subdistrict_code}
				</td>
				<td>
					${applicationNoticeArrest.lawbreaker_moo}
				</td>
				<td>
					${applicationNoticeArrest.lawbreaker_road}
				</td>
				<td>
					${applicationNoticeArrest.lawbreaker_soi}
				</td>
				<td>
					${applicationNoticeArrest.lawbreaker_address_name}
				</td>
				<td>
					${applicationNoticeArrest.lawbreaker_address}
				</td>
				<td>
					${applicationNoticeArrest.secret_level}
				</td>
				<td>
					${applicationNoticeArrest.arrest_desc}
				</td>
				<td>
					${applicationNoticeArrest.inform_province_code}
				</td>
				<td>
					${applicationNoticeArrest.inform_district_code}
				</td>
				<td>
					${applicationNoticeArrest.inform_subdistrict_code}
				</td>
				<td>
					${applicationNoticeArrest.inform_moo}
				</td>
				<td>
					${applicationNoticeArrest.inform_road}
				</td>
				<td>
					${applicationNoticeArrest.inform_soi}
				</td>
				<td>
					${applicationNoticeArrest.inform_address_name}
				</td>
				<td>
					${applicationNoticeArrest.inform_address}
				</td>
				<td>
					${applicationNoticeArrest.inform_age}
				</td>
				<td>
					${applicationNoticeArrest.inform_name}
				</td>
				<td>
					${applicationNoticeArrest.lawbreaker_no}
				</td>
				<td>
					<fmt:formatDate value="${applicationNoticeArrest.receive_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationNoticeArrest.duty_code}
				</td>
				<td>
					${applicationNoticeArrest.legislation_id}
				</td>
				<td>
					${applicationNoticeArrest.offname}
				</td>
				<td>
					<fmt:formatDate value="${applicationNoticeArrest.notice_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationNoticeArrest.notice_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationNoticeArrest&cmd=view&id='/>${applicationNoticeArrest.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationNoticeArrest&cmd=edit&id='/>${applicationNoticeArrest.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationNoticeArrest&cmd=delete&id='/>${applicationNoticeArrest.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationNoticeArrest&cmd=add'/>">Add New Record</a>
</form>