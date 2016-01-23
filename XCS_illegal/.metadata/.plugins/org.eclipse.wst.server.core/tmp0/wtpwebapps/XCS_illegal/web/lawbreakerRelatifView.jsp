








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=LawbreakerRelatif&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${lawbreakerRelatif.id}</td>
	</tr>
	<tr>
			<td>idcardno</td>
		<td>
					${lawbreakerRelatif.idcardno}
				</td>
		</tr>
	<tr>
			<td>email</td>
		<td>
					${lawbreakerRelatif.email}
				</td>
		</tr>
	<tr>
			<td>tel</td>
		<td>
					${lawbreakerRelatif.tel}
				</td>
		</tr>
	<tr>
			<td>hometown_post_code</td>
		<td>
					${lawbreakerRelatif.hometown_post_code}
				</td>
		</tr>
	<tr>
			<td>hometown_province_code</td>
		<td>
					${lawbreakerRelatif.hometown_province_code}
				</td>
		</tr>
	<tr>
			<td>hometown_district_code</td>
		<td>
					${lawbreakerRelatif.hometown_district_code}
				</td>
		</tr>
	<tr>
			<td>hometown_subdistrict_code</td>
		<td>
					${lawbreakerRelatif.hometown_subdistrict_code}
				</td>
		</tr>
	<tr>
			<td>hometown_road</td>
		<td>
					${lawbreakerRelatif.hometown_road}
				</td>
		</tr>
	<tr>
			<td>hometown_soi</td>
		<td>
					${lawbreakerRelatif.hometown_soi}
				</td>
		</tr>
	<tr>
			<td>hometown_moo</td>
		<td>
					${lawbreakerRelatif.hometown_moo}
				</td>
		</tr>
	<tr>
			<td>hometown_address_no</td>
		<td>
					${lawbreakerRelatif.hometown_address_no}
				</td>
		</tr>
	<tr>
			<td>current_post_code</td>
		<td>
					${lawbreakerRelatif.current_post_code}
				</td>
		</tr>
	<tr>
			<td>current_province_code</td>
		<td>
					${lawbreakerRelatif.current_province_code}
				</td>
		</tr>
	<tr>
			<td>current_district_code</td>
		<td>
					${lawbreakerRelatif.current_district_code}
				</td>
		</tr>
	<tr>
			<td>current_subdistrict_code</td>
		<td>
					${lawbreakerRelatif.current_subdistrict_code}
				</td>
		</tr>
	<tr>
			<td>current_road</td>
		<td>
					${lawbreakerRelatif.current_road}
				</td>
		</tr>
	<tr>
			<td>current_soi</td>
		<td>
					${lawbreakerRelatif.current_soi}
				</td>
		</tr>
	<tr>
			<td>current_moo</td>
		<td>
					${lawbreakerRelatif.current_moo}
				</td>
		</tr>
	<tr>
			<td>current_address_no</td>
		<td>
					${lawbreakerRelatif.current_address_no}
				</td>
		</tr>
	<tr>
			<td>relation</td>
		<td>
					${lawbreakerRelatif.relation}
				</td>
		</tr>
	<tr>
			<td>last_name</td>
		<td>
					${lawbreakerRelatif.last_name}
				</td>
		</tr>
	<tr>
			<td>first_name</td>
		<td>
					${lawbreakerRelatif.first_name}
				</td>
		</tr>
	<tr>
			<td>title_code</td>
		<td>
					${lawbreakerRelatif.title_code}
				</td>
		</tr>
	<tr>
			<td>lawbreaker_no</td>
		<td>
					${lawbreakerRelatif.lawbreaker_no}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${lawbreakerRelatif.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${lawbreakerRelatif.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${lawbreakerRelatif.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${lawbreakerRelatif.create_by}
				</td>
		</tr>
	<tr>
		</tr>
</table>