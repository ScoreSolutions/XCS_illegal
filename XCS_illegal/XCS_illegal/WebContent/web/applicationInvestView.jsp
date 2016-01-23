








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=ApplicationInvest&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationInvest.id}</td>
	</tr>
	<tr>
			<td>news_value</td>
		<td>
					${applicationInvest.news_value}
				</td>
		</tr>
	<tr>
			<td>confidence_gauge</td>
		<td>
					${applicationInvest.confidence_gauge}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${applicationInvest.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${applicationInvest.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${applicationInvest.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${applicationInvest.create_by}
				</td>
		</tr>
	<tr>
			<td>invest_desc</td>
		<td>
					${applicationInvest.invest_desc}
				</td>
		</tr>
	<tr>
			<td>subdistrict_code</td>
		<td>
					${applicationInvest.subdistrict_code}
				</td>
		</tr>
	<tr>
			<td>map_desc</td>
		<td>
					${applicationInvest.map_desc}
				</td>
		</tr>
	<tr>
			<td>map_picture</td>
		<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=APPLICATION_INVEST&id=${applicationInvest.id}" widht=100 height=100>
				</td>
		</tr>
	<tr>
			<td>tel</td>
		<td>
					${applicationInvest.tel}
				</td>
		</tr>
	<tr>
			<td>zipcode</td>
		<td>
					${applicationInvest.zipcode}
				</td>
		</tr>
	<tr>
			<td>district_code</td>
		<td>
					${applicationInvest.district_code}
				</td>
		</tr>
	<tr>
			<td>province_code</td>
		<td>
					${applicationInvest.province_code}
				</td>
		</tr>
	<tr>
			<td>road</td>
		<td>
					${applicationInvest.road}
				</td>
		</tr>
	<tr>
			<td>soi</td>
		<td>
					${applicationInvest.soi}
				</td>
		</tr>
	<tr>
			<td>moo</td>
		<td>
					${applicationInvest.moo}
				</td>
		</tr>
	<tr>
			<td>address_no</td>
		<td>
					${applicationInvest.address_no}
				</td>
		</tr>
	<tr>
			<td>address_name</td>
		<td>
					${applicationInvest.address_name}
				</td>
		</tr>
	<tr>
			<td>coordinate_y</td>
		<td>
					${applicationInvest.coordinate_y}
				</td>
		</tr>
	<tr>
			<td>coordinate_x</td>
		<td>
					${applicationInvest.coordinate_x}
				</td>
		</tr>
	<tr>
			<td>end_date</td>
		<td>
					<fmt:formatDate value="${applicationInvest.end_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>start_date</td>
		<td>
					<fmt:formatDate value="${applicationInvest.start_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>product_group_id</td>
		<td>
					${applicationInvest.product_group_id}
				</td>
		</tr>
	<tr>
			<td>legislation_id</td>
		<td>
					${applicationInvest.legislation_id}
				</td>
		</tr>
	<tr>
			<td>offcode_command</td>
		<td>
					${applicationInvest.offcode_command}
				</td>
		</tr>
	<tr>
			<td>poscode_command</td>
		<td>
					${applicationInvest.poscode_command}
				</td>
		</tr>
	<tr>
			<td>staff_idcardno_command</td>
		<td>
					${applicationInvest.staff_idcardno_command}
				</td>
		</tr>
	<tr>
			<td>offcode_invest</td>
		<td>
					${applicationInvest.offcode_invest}
				</td>
		</tr>
	<tr>
			<td>poscode_invest</td>
		<td>
					${applicationInvest.poscode_invest}
				</td>
		</tr>
	<tr>
			<td>staff_idcardno_invest</td>
		<td>
					${applicationInvest.staff_idcardno_invest}
				</td>
		</tr>
	<tr>
			<td>invest_no</td>
		<td>
					${applicationInvest.invest_no}
				</td>
		</tr>
	<tr>
			<td>report_date</td>
		<td>
					<fmt:formatDate value="${applicationInvest.report_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>invest_qty</td>
		<td>
					${applicationInvest.invest_qty}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${applicationInvest.track_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>