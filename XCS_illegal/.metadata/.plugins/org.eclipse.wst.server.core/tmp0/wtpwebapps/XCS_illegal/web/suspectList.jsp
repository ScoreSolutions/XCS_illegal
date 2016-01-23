








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Suspect&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>PASSPORT_COUNTRY</td>
					<td>DEL_FLAG</td>
					<td>OFFCODE</td>
					<td>MIME_TYPE</td>
					<td>UPDATE_DATE</td>
					<td>UPDATE_ID</td>
					<td>LINK_PHOTO</td>
					<td>LICENSE_DATE_TO</td>
					<td>LICENSE_DATE_FROM</td>
					<td>COMPANY_NAME</td>
					<td>TITLE_CODE_COMPANY</td>
					<td>PHOTO_DESC</td>
					<td>MOBILE</td>
					<td>COUNTRY_CODE</td>
					<td>DATE_OUT</td>
					<td>DATE_IN</td>
					<td>VISA_TYPE</td>
					<td>CREATE_DATE</td>
					<td>CREATE_ID</td>
					<td>DESCRIPTION</td>
					<td>LICENSE_NO</td>
					<td>CORPORATION_CODE</td>
					<td>EXCISE_REG_NO</td>
					<td>TAX_ID_NO</td>
					<td>EMAIL</td>
					<td>TEL</td>
					<td>COORDINATE_Y</td>
					<td>COORDINATE_X</td>
					<td>POST_CODE</td>
					<td>PROVINCE_CODE</td>
					<td>DISTRICT_CODE</td>
					<td>SUBDISTRICT_CODE</td>
					<td>ROAD</td>
					<td>SOI</td>
					<td>MOO</td>
					<td>ADDRESS_NO</td>
					<td>ADDRESS_NAME</td>
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
					<td>SUSPECT_PASSPORT</td>
					<td>SUSPECT_ID_CARD</td>
					<td>SUSPECT_TYPE</td>
					<td>SUSPECT_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${suspects}"  var="suspect">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${suspect.id}</td>
			<td>
					${suspect.passport_country}
				</td>
				<td>
					${suspect.del_flag}
				</td>
				<td>
					${suspect.offcode}
				</td>
				<td>
					${suspect.mime_type}
				</td>
				<td>
					<fmt:formatDate value="${suspect.update_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspect.update_id}
				</td>
				<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=SUSPECT&id=${suspect.id}" widht=100 height=100>
				</td>
				<td>
					<fmt:formatDate value="${suspect.license_date_to}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${suspect.license_date_from}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspect.company_name}
				</td>
				<td>
					${suspect.title_code_company}
				</td>
				<td>
					${suspect.photo_desc}
				</td>
				<td>
					${suspect.mobile}
				</td>
				<td>
					${suspect.country_code}
				</td>
				<td>
					<fmt:formatDate value="${suspect.date_out}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${suspect.date_in}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspect.visa_type}
				</td>
				<td>
					<fmt:formatDate value="${suspect.create_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspect.create_id}
				</td>
				<td>
					${suspect.description}
				</td>
				<td>
					${suspect.license_no}
				</td>
				<td>
					${suspect.corporation_code}
				</td>
				<td>
					${suspect.excise_reg_no}
				</td>
				<td>
					${suspect.tax_id_no}
				</td>
				<td>
					${suspect.email}
				</td>
				<td>
					${suspect.tel}
				</td>
				<td>
					${suspect.coordinate_y}
				</td>
				<td>
					${suspect.coordinate_x}
				</td>
				<td>
					${suspect.post_code}
				</td>
				<td>
					${suspect.province_code}
				</td>
				<td>
					${suspect.district_code}
				</td>
				<td>
					${suspect.subdistrict_code}
				</td>
				<td>
					${suspect.road}
				</td>
				<td>
					${suspect.soi}
				</td>
				<td>
					${suspect.moo}
				</td>
				<td>
					${suspect.address_no}
				</td>
				<td>
					${suspect.address_name}
				</td>
				<td>
					${suspect.career}
				</td>
				<td>
					${suspect.nation_id}
				</td>
				<td>
					${suspect.race_id}
				</td>
				<td>
					${suspect.religion_id}
				</td>
				<td>
					${suspect.blood_type}
				</td>
				<td>
					${suspect.marital_status}
				</td>
				<td>
					${suspect.sex}
				</td>
				<td>
					<fmt:formatDate value="${suspect.birth_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${suspect.height}
				</td>
				<td>
					${suspect.other_name}
				</td>
				<td>
					${suspect.last_name}
				</td>
				<td>
					${suspect.middle_name}
				</td>
				<td>
					${suspect.first_name}
				</td>
				<td>
					${suspect.title_code}
				</td>
				<td>
					${suspect.suspect_passport}
				</td>
				<td>
					${suspect.suspect_id_card}
				</td>
				<td>
					${suspect.suspect_type}
				</td>
				<td>
					${suspect.suspect_no}
				</td>
						<td><a href="<c:url value='/process2?action=Suspect&cmd=view&id='/>${suspect.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=Suspect&cmd=edit&id='/>${suspect.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=Suspect&cmd=delete&id='/>${suspect.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=Suspect&cmd=add'/>">Add New Record</a>
</form>