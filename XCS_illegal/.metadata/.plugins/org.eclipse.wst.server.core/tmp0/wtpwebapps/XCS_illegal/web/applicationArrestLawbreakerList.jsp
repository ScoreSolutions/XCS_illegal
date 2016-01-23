








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=ApplicationArrestLawbreaker&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>ISMISTAKE_DESC</td>
					<td>ISMISTAKE</td>
					<td>PAPER_NO</td>
					<td>COMPANY_NAME</td>
					<td>COMPANY_TITLE_CODE</td>
					<td>CORPORATION_CODE</td>
					<td>EXCISE_REG_NO</td>
					<td>OTHER_NAME</td>
					<td>BIRTH_DATE</td>
					<td>SEX</td>
					<td>TITLE_CODE</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>CANCEL_BY</td>
					<td>CANCEL_DATE</td>
					<td>ISCANCEL</td>
					<td>INV_NO</td>
					<td>BOOK_NO</td>
					<td>FINE</td>
					<td>INVCODE</td>
					<td>PAID_TIME_OFF</td>
					<td>MOTHER_NAME</td>
					<td>FATHER_NAME</td>
					<td>AGE</td>
					<td>CAREER</td>
					<td>RACE_ID</td>
					<td>NATIONALITY_ID</td>
					<td>PROVINCE</td>
					<td>DISTRICT</td>
					<td>SUBDISTRICT</td>
					<td>MOO</td>
					<td>ROAD</td>
					<td>SOI</td>
					<td>ADDRESS_NO</td>
					<td>LAST_NAME</td>
					<td>MIDDLE_NAME</td>
					<td>FIRST_NAME</td>
					<td>LAWBREAKER_PASSPORT</td>
					<td>LAWBREAKER_ID_CARD</td>
					<td>CULPRIT_TYPE</td>
					<td>LAWBREAKER_NO</td>
					<td>TRACK_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${applicationArrestLawbreakers}"  var="applicationArrestLawbreaker">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${applicationArrestLawbreaker.id}</td>
			<td>
					${applicationArrestLawbreaker.ismistake_desc}
				</td>
				<td>
					${applicationArrestLawbreaker.ismistake}
				</td>
				<td>
					${applicationArrestLawbreaker.paper_no}
				</td>
				<td>
					${applicationArrestLawbreaker.company_name}
				</td>
				<td>
					${applicationArrestLawbreaker.company_title_code}
				</td>
				<td>
					${applicationArrestLawbreaker.corporation_code}
				</td>
				<td>
					${applicationArrestLawbreaker.excise_reg_no}
				</td>
				<td>
					${applicationArrestLawbreaker.other_name}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestLawbreaker.birth_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestLawbreaker.sex}
				</td>
				<td>
					${applicationArrestLawbreaker.title_code}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestLawbreaker.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestLawbreaker.update_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestLawbreaker.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestLawbreaker.create_by}
				</td>
				<td>
					${applicationArrestLawbreaker.cancel_by}
				</td>
				<td>
					<fmt:formatDate value="${applicationArrestLawbreaker.cancel_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${applicationArrestLawbreaker.iscancel}
				</td>
				<td>
					${applicationArrestLawbreaker.inv_no}
				</td>
				<td>
					${applicationArrestLawbreaker.book_no}
				</td>
				<td>
					${applicationArrestLawbreaker.fine}
				</td>
				<td>
					${applicationArrestLawbreaker.invcode}
				</td>
				<td>
					${applicationArrestLawbreaker.paid_time_off}
				</td>
				<td>
					${applicationArrestLawbreaker.mother_name}
				</td>
				<td>
					${applicationArrestLawbreaker.father_name}
				</td>
				<td>
					${applicationArrestLawbreaker.age}
				</td>
				<td>
					${applicationArrestLawbreaker.career}
				</td>
				<td>
					${applicationArrestLawbreaker.race_id}
				</td>
				<td>
					${applicationArrestLawbreaker.nationality_id}
				</td>
				<td>
					${applicationArrestLawbreaker.province}
				</td>
				<td>
					${applicationArrestLawbreaker.district}
				</td>
				<td>
					${applicationArrestLawbreaker.subdistrict}
				</td>
				<td>
					${applicationArrestLawbreaker.moo}
				</td>
				<td>
					${applicationArrestLawbreaker.road}
				</td>
				<td>
					${applicationArrestLawbreaker.soi}
				</td>
				<td>
					${applicationArrestLawbreaker.address_no}
				</td>
				<td>
					${applicationArrestLawbreaker.last_name}
				</td>
				<td>
					${applicationArrestLawbreaker.middle_name}
				</td>
				<td>
					${applicationArrestLawbreaker.first_name}
				</td>
				<td>
					${applicationArrestLawbreaker.lawbreaker_passport}
				</td>
				<td>
					${applicationArrestLawbreaker.lawbreaker_id_card}
				</td>
				<td>
					${applicationArrestLawbreaker.culprit_type}
				</td>
				<td>
					${applicationArrestLawbreaker.lawbreaker_no}
				</td>
				<td>
					${applicationArrestLawbreaker.track_no}
				</td>
						<td><a href="<c:url value='/process2?action=ApplicationArrestLawbreaker&cmd=view&id='/>${applicationArrestLawbreaker.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestLawbreaker&cmd=edit&id='/>${applicationArrestLawbreaker.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=ApplicationArrestLawbreaker&cmd=delete&id='/>${applicationArrestLawbreaker.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=ApplicationArrestLawbreaker&cmd=add'/>">Add New Record</a>
</form>