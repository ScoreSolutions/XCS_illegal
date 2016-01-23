








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=SuspectRelatif&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectRelatif.id}</td>
	</tr>
	<tr>
			<td>idcardno</td>
		<td>
					${suspectRelatif.idcardno}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${suspectRelatif.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${suspectRelatif.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${suspectRelatif.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${suspectRelatif.create_by}
				</td>
		</tr>
	<tr>
			<td>email</td>
		<td>
					${suspectRelatif.email}
				</td>
		</tr>
	<tr>
			<td>tel</td>
		<td>
					${suspectRelatif.tel}
				</td>
		</tr>
	<tr>
			<td>hometown_post_code</td>
		<td>
					${suspectRelatif.hometown_post_code}
				</td>
		</tr>
	<tr>
			<td>hometown_province_code</td>
		<td>
					${suspectRelatif.hometown_province_code}
				</td>
		</tr>
	<tr>
			<td>hometown_district_code</td>
		<td>
					${suspectRelatif.hometown_district_code}
				</td>
		</tr>
	<tr>
			<td>hometown_subdistrict_code</td>
		<td>
					${suspectRelatif.hometown_subdistrict_code}
				</td>
		</tr>
	<tr>
			<td>hometown_road</td>
		<td>
					${suspectRelatif.hometown_road}
				</td>
		</tr>
	<tr>
			<td>hometown_soi</td>
		<td>
					${suspectRelatif.hometown_soi}
				</td>
		</tr>
	<tr>
			<td>hometown_moo</td>
		<td>
					${suspectRelatif.hometown_moo}
				</td>
		</tr>
	<tr>
			<td>hometown_address_no</td>
		<td>
					${suspectRelatif.hometown_address_no}
				</td>
		</tr>
	<tr>
			<td>current_post_code</td>
		<td>
					${suspectRelatif.current_post_code}
				</td>
		</tr>
	<tr>
			<td>current_province_code</td>
		<td>
					${suspectRelatif.current_province_code}
				</td>
		</tr>
	<tr>
			<td>current_district_code</td>
		<td>
					${suspectRelatif.current_district_code}
				</td>
		</tr>
	<tr>
			<td>current_subdistrict_code</td>
		<td>
					${suspectRelatif.current_subdistrict_code}
				</td>
		</tr>
	<tr>
			<td>current_road</td>
		<td>
					${suspectRelatif.current_road}
				</td>
		</tr>
	<tr>
			<td>current_soi</td>
		<td>
					${suspectRelatif.current_soi}
				</td>
		</tr>
	<tr>
			<td>current_moo</td>
		<td>
					${suspectRelatif.current_moo}
				</td>
		</tr>
	<tr>
			<td>current_address_no</td>
		<td>
					${suspectRelatif.current_address_no}
				</td>
		</tr>
	<tr>
			<td>relation</td>
		<td>
					${suspectRelatif.relation}
				</td>
		</tr>
	<tr>
			<td>last_name</td>
		<td>
					${suspectRelatif.last_name}
				</td>
		</tr>
	<tr>
			<td>first_name</td>
		<td>
					${suspectRelatif.first_name}
				</td>
		</tr>
	<tr>
			<td>title_code</td>
		<td>
					${suspectRelatif.title_code}
				</td>
		</tr>
	<tr>
			<td>suspect_no</td>
		<td>
					${suspectRelatif.suspect_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>