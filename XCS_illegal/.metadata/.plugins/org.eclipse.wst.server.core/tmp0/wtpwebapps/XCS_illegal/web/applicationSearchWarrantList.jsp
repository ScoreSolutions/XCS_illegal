








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationSearchWarrant&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>APPLICATION_NOTICE_ARREST_ID</td>
					<td>RESULT_QTY_DATE</td>
					<td>COURT_ORDER_FAMILIAR</td>
					<td>OFFCODE_ASSIGN</td>
					<td>POSCODE_ASSIGN</td>
					<td>STAFF_ID_ASSIGN</td>
					<td>OFFCODE_REQ_FOR</td>
					<td>POSCODE_REQ_FOR</td>
					<td>STAFF_ID_REQ_FOR</td>
					<td>TEL_REQUEST</td>
					<td>CAREER_REQUEST</td>
					<td>TRACK_NO</td>
					<td>OFFICE_ADDRESS</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>SEARCH_RESULT</td>
					<td>SEND_TO_DESC</td>
					<td>SEND_DESC</td>
					<td>COURT_ID_ARREST</td>
					<td>ARREST_DATE</td>
					<td>ARREST_NO</td>
					<td>SEARCH_CHECK2_2</td>
					<td>SEARCH_CHECK2_1</td>
					<td>SEARCH_CHECK2_DESC</td>
					<td>SEARCH_CHECK2</td>
					<td>SEARCH_CHECK1_3</td>
					<td>SEARCH_CHECK1_2</td>
					<td>SEARCH_CHECK1_1</td>
					<td>SEARCH_CHECK1_DESC</td>
					<td>SEARCH_CHECK1</td>
					<td>JEDGE_NAME</td>
					<td>WARRANT_DATE</td>
					<td>WARRANT_NO</td>
					<td>REMARKS_NONAPPROVE</td>
					<td>ISAPPROVE</td>
					<td>ISCOPY</td>
					<td>ISALLOW</td>
					<td>COURT_ORDER</td>
					<td>WITNESS_QTY</td>
					<td>CONSIDER_DATE</td>
					<td>CAUSE_FAMILIAR</td>
					<td>COURT_ID_FAMILIAR</td>
					<td>REQUEST_FAMILIAR</td>
					<td>PROVINCE_CODE</td>
					<td>DISTRICT_CODE</td>
					<td>SUBDISTRICT_CODE</td>
					<td>MOO</td>
					<td>SOI</td>
					<td>ADDRESS_NAME</td>
					<td>ADDRESS_NO</td>
					<td>ROAD</td>
					<td>OWNER_POSITION</td>
					<td>OWNER_CAREER</td>
					<td>OWNER_AGE</td>
					<td>OWNER_NAME</td>
					<td>REQ_CHECK5</td>
					<td>REQ_CHECK4</td>
					<td>REQ_CHECK3</td>
					<td>REQ_CHECK2</td>
					<td>REQ_CHECK1</td>
					<td>SEARCH_CAUSE</td>
					<td>CHK_CONTINUE</td>
					<td>SEARCH_DATETO</td>
					<td>SEARCH_DATEFROM</td>
					<td>COURT_ID</td>
					<td>AGE_REQUEST</td>
					<td>OFFCODE_REQUEST</td>
					<td>POSCODE_REQUEST</td>
					<td>STAFF_ID_REQUEST</td>
					<td>REQUEST_DATE</td>
					<td>REQUEST_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationSearchWarrants}"  var="applicationSearchWarrant">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationSearchWarrant.id}</td>
			<td>
					${applicationSearchWarrant.application_notice_arrest_id}
				</td>
				<td>
					${applicationSearchWarrant.result_qty_date}
				</td>
				<td>
					${applicationSearchWarrant.court_order_familiar}
				</td>
				<td>
					${applicationSearchWarrant.offcode_assign}
				</td>
				<td>
					${applicationSearchWarrant.poscode_assign}
				</td>
				<td>
					${applicationSearchWarrant.staff_id_assign}
				</td>
				<td>
					${applicationSearchWarrant.offcode_req_for}
				</td>
				<td>
					${applicationSearchWarrant.poscode_req_for}
				</td>
				<td>
					${applicationSearchWarrant.staff_id_req_for}
				</td>
				<td>
					${applicationSearchWarrant.tel_request}
				</td>
				<td>
					${applicationSearchWarrant.career_request}
				</td>
				<td>
					${applicationSearchWarrant.track_no}
				</td>
				<td>
					${applicationSearchWarrant.office_address}
				</td>
				<td>
					<fmt:formatDate value="${applicationSearchWarrant.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSearchWarrant.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationSearchWarrant.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSearchWarrant.create_by}
				</td>
				<td>
					${applicationSearchWarrant.search_result}
				</td>
				<td>
					${applicationSearchWarrant.send_to_desc}
				</td>
				<td>
					${applicationSearchWarrant.send_desc}
				</td>
				<td>
					${applicationSearchWarrant.court_id_arrest}
				</td>
				<td>
					<fmt:formatDate value="${applicationSearchWarrant.arrest_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSearchWarrant.arrest_no}
				</td>
				<td>
					${applicationSearchWarrant.search_check2_2}
				</td>
				<td>
					${applicationSearchWarrant.search_check2_1}
				</td>
				<td>
					${applicationSearchWarrant.search_check2_desc}
				</td>
				<td>
					${applicationSearchWarrant.search_check2}
				</td>
				<td>
					${applicationSearchWarrant.search_check1_3}
				</td>
				<td>
					${applicationSearchWarrant.search_check1_2}
				</td>
				<td>
					${applicationSearchWarrant.search_check1_1}
				</td>
				<td>
					${applicationSearchWarrant.search_check1_desc}
				</td>
				<td>
					${applicationSearchWarrant.search_check1}
				</td>
				<td>
					${applicationSearchWarrant.jedge_name}
				</td>
				<td>
					<fmt:formatDate value="${applicationSearchWarrant.warrant_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSearchWarrant.warrant_no}
				</td>
				<td>
					${applicationSearchWarrant.remarks_nonapprove}
				</td>
				<td>
					${applicationSearchWarrant.isapprove}
				</td>
				<td>
					${applicationSearchWarrant.iscopy}
				</td>
				<td>
					${applicationSearchWarrant.isallow}
				</td>
				<td>
					${applicationSearchWarrant.court_order}
				</td>
				<td>
					${applicationSearchWarrant.witness_qty}
				</td>
				<td>
					<fmt:formatDate value="${applicationSearchWarrant.consider_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSearchWarrant.cause_familiar}
				</td>
				<td>
					${applicationSearchWarrant.court_id_familiar}
				</td>
				<td>
					${applicationSearchWarrant.request_familiar}
				</td>
				<td>
					${applicationSearchWarrant.province_code}
				</td>
				<td>
					${applicationSearchWarrant.district_code}
				</td>
				<td>
					${applicationSearchWarrant.subdistrict_code}
				</td>
				<td>
					${applicationSearchWarrant.moo}
				</td>
				<td>
					${applicationSearchWarrant.soi}
				</td>
				<td>
					${applicationSearchWarrant.address_name}
				</td>
				<td>
					${applicationSearchWarrant.address_no}
				</td>
				<td>
					${applicationSearchWarrant.road}
				</td>
				<td>
					${applicationSearchWarrant.owner_position}
				</td>
				<td>
					${applicationSearchWarrant.owner_career}
				</td>
				<td>
					${applicationSearchWarrant.owner_age}
				</td>
				<td>
					${applicationSearchWarrant.owner_name}
				</td>
				<td>
					${applicationSearchWarrant.req_check5}
				</td>
				<td>
					${applicationSearchWarrant.req_check4}
				</td>
				<td>
					${applicationSearchWarrant.req_check3}
				</td>
				<td>
					${applicationSearchWarrant.req_check2}
				</td>
				<td>
					${applicationSearchWarrant.req_check1}
				</td>
				<td>
					${applicationSearchWarrant.search_cause}
				</td>
				<td>
					${applicationSearchWarrant.chk_continue}
				</td>
				<td>
					<fmt:formatDate value="${applicationSearchWarrant.search_dateto}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${applicationSearchWarrant.search_datefrom}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSearchWarrant.court_id}
				</td>
				<td>
					${applicationSearchWarrant.age_request}
				</td>
				<td>
					${applicationSearchWarrant.offcode_request}
				</td>
				<td>
					${applicationSearchWarrant.poscode_request}
				</td>
				<td>
					${applicationSearchWarrant.staff_id_request}
				</td>
				<td>
					<fmt:formatDate value="${applicationSearchWarrant.request_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationSearchWarrant.request_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationSearchWarrant&cmd=view&id='/>${applicationSearchWarrant.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationSearchWarrant&cmd=edit&id='/>${applicationSearchWarrant.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationSearchWarrant&cmd=delete&id='/>${applicationSearchWarrant.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationSearchWarrant&cmd=add'/>">Add New Record</a>
</form>