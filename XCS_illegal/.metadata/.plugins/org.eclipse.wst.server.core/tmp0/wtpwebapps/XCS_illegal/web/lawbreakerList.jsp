








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Lawbreaker&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>DESCRIPTION</td>
					<td>MOBILE</td>
					<td>LICENSE_NO</td>
					<td>LICENSE_DATE_TO</td>
					<td>LICENSE_DATE_FROM</td>
					<td>PHOTO_DESC</td>
					<td>LINK_PHOTO</td>
					<td>COMPANY_NAME</td>
					<td>TITLE_CODE_COMPANY</td>
					<td>DATE_OUT</td>
					<td>DATE_IN</td>
					<td>VISA_TYPE</td>
					<td>PASSPORT_COUNTRY</td>
					<td>COUNTRY_CODE</td>
					<td>DEL_FLAG</td>
					<td>COORDINATE_Y</td>
					<td>COORDINATE_X</td>
					<td>ADDRESS_NAME</td>
					<td>MODIFY_DATE</td>
					<td>MODIFY_ID</td>
					<td>CREATE_DATE</td>
					<td>CREATE_ID</td>
					<td>REMARKS</td>
					<td>CORPORATION_CODE</td>
					<td>EXCISE_REG_NO</td>
					<td>TAX_ID_NO</td>
					<td>EMAIL</td>
					<td>TEL</td>
					<td>POST_CODE</td>
					<td>PROVINCE_CODE</td>
					<td>DISTRICT_CODE</td>
					<td>SUBDISTRICT_CODE</td>
					<td>ROAD</td>
					<td>SOI</td>
					<td>MOO</td>
					<td>ADDRESS_NO</td>
					<td>CAREER</td>
					<td>NATION_ID</td>
					<td>RACE_ID</td>
					<td>RELIGION_ID</td>
					<td>BLOOD_TYPE</td>
					<td>MARITAL_STATUS</td>
					<td>SEX</td>
					<td>BIRTH_DATE</td>
					<td>HEIGHT</td>
					<td>OTHER_NAME</td>
					<td>LAST_NAME</td>
					<td>MIDDLE_NAME</td>
					<td>FIRST_NAME</td>
					<td>TITLE_CODE</td>
					<td>LAWBREAKER_PASSPORT</td>
					<td>LAWBREAKER_ID_CARD</td>
					<td>LAWBREAKER_TYPE</td>
					<td>LAWBREAKER_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${lawbreakers}"  var="lawbreaker">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${lawbreaker.id}</td>
			<td>
					${lawbreaker.description}
				</td>
				<td>
					${lawbreaker.mobile}
				</td>
				<td>
					${lawbreaker.license_no}
				</td>
				<td>
					<fmt:formatDate value="${lawbreaker.license_date_to}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${lawbreaker.license_date_from}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${lawbreaker.photo_desc}
				</td>
				<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=LAWBREAKER&id=${lawbreaker.id}" widht=100 height=100>
				</td>
				<td>
					${lawbreaker.company_name}
				</td>
				<td>
					${lawbreaker.title_code_company}
				</td>
				<td>
					<fmt:formatDate value="${lawbreaker.date_out}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${lawbreaker.date_in}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${lawbreaker.visa_type}
				</td>
				<td>
					${lawbreaker.passport_country}
				</td>
				<td>
					${lawbreaker.country_code}
				</td>
				<td>
					${lawbreaker.del_flag}
				</td>
				<td>
					${lawbreaker.coordinate_y}
				</td>
				<td>
					${lawbreaker.coordinate_x}
				</td>
				<td>
					${lawbreaker.address_name}
				</td>
				<td>
					<fmt:formatDate value="${lawbreaker.modify_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${lawbreaker.modify_id}
				</td>
				<td>
					<fmt:formatDate value="${lawbreaker.create_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${lawbreaker.create_id}
				</td>
				<td>
					${lawbreaker.remarks}
				</td>
				<td>
					${lawbreaker.corporation_code}
				</td>
				<td>
					${lawbreaker.excise_reg_no}
				</td>
				<td>
					${lawbreaker.tax_id_no}
				</td>
				<td>
					${lawbreaker.email}
				</td>
				<td>
					${lawbreaker.tel}
				</td>
				<td>
					${lawbreaker.post_code}
				</td>
				<td>
					${lawbreaker.province_code}
				</td>
				<td>
					${lawbreaker.district_code}
				</td>
				<td>
					${lawbreaker.subdistrict_code}
				</td>
				<td>
					${lawbreaker.road}
				</td>
				<td>
					${lawbreaker.soi}
				</td>
				<td>
					${lawbreaker.moo}
				</td>
				<td>
					${lawbreaker.address_no}
				</td>
				<td>
					${lawbreaker.career}
				</td>
				<td>
					${lawbreaker.nation_id}
				</td>
				<td>
					${lawbreaker.race_id}
				</td>
				<td>
					${lawbreaker.religion_id}
				</td>
				<td>
					${lawbreaker.blood_type}
				</td>
				<td>
					${lawbreaker.marital_status}
				</td>
				<td>
					${lawbreaker.sex}
				</td>
				<td>
					<fmt:formatDate value="${lawbreaker.birth_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${lawbreaker.height}
				</td>
				<td>
					${lawbreaker.other_name}
				</td>
				<td>
					${lawbreaker.last_name}
				</td>
				<td>
					${lawbreaker.middle_name}
				</td>
				<td>
					${lawbreaker.first_name}
				</td>
				<td>
					${lawbreaker.title_code}
				</td>
				<td>
					${lawbreaker.lawbreaker_passport}
				</td>
				<td>
					${lawbreaker.lawbreaker_id_card}
				</td>
				<td>
					${lawbreaker.lawbreaker_type}
				</td>
				<td>
					${lawbreaker.lawbreaker_no}
				</td>
						<td><a href="<c:url value='/process2?action=Lawbreaker&cmd=view&id='/>${lawbreaker.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Lawbreaker&cmd=edit&id='/>${lawbreaker.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Lawbreaker&cmd=delete&id='/>${lawbreaker.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Lawbreaker&cmd=add'/>">Add New Record</a>
</form>