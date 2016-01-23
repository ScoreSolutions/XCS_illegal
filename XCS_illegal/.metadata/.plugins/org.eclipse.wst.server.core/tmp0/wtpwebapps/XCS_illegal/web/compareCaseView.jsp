








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<a href="<c:url value="/process2?action=CompareCase&cmd=list"/>">Back</a>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${compareCase.id}</td>
	</tr>
	<tr>
			<td>inv_type</td>
		<td>
					${compareCase.inv_type}
				</td>
		</tr>
	<tr>
			<td>sue_offcode</td>
		<td>
					${compareCase.sue_offcode}
				</td>
		</tr>
	<tr>
			<td>sue_poscode</td>
		<td>
					${compareCase.sue_poscode}
				</td>
		</tr>
	<tr>
			<td>sue_staff_idcardno</td>
		<td>
					${compareCase.sue_staff_idcardno}
				</td>
		</tr>
	<tr>
			<td>case_fine</td>
		<td>
					${compareCase.case_fine}
				</td>
		</tr>
	<tr>
			<td>case_status</td>
		<td>
					${compareCase.case_status}
				</td>
		</tr>
	<tr>
			<td>manage_type</td>
		<td>
					${compareCase.manage_type}
				</td>
		</tr>
	<tr>
			<td>compare_authority_id</td>
		<td>
					${compareCase.compare_authority_id}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${compareCase.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${compareCase.update_by}
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${compareCase.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${compareCase.create_by}
				</td>
		</tr>
	<tr>
			<td>reward_money</td>
		<td>
					${compareCase.reward_money}
				</td>
		</tr>
	<tr>
			<td>birbe_money</td>
		<td>
					${compareCase.birbe_money}
				</td>
		</tr>
	<tr>
			<td>treasury_money</td>
		<td>
					${compareCase.treasury_money}
				</td>
		</tr>
	<tr>
			<td>reward_money_p</td>
		<td>
					${compareCase.reward_money_p}
				</td>
		</tr>
	<tr>
			<td>bribe_money_p</td>
		<td>
					${compareCase.bribe_money_p}
				</td>
		</tr>
	<tr>
			<td>treasury_money_p</td>
		<td>
					${compareCase.treasury_money_p}
				</td>
		</tr>
	<tr>
			<td>pay_date</td>
		<td>
					<fmt:formatDate value="${compareCase.pay_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>court_fine_date</td>
		<td>
					<fmt:formatDate value="${compareCase.court_fine_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>court_fine</td>
		<td>
					${compareCase.court_fine}
				</td>
		</tr>
	<tr>
			<td>case_id</td>
		<td>
					${compareCase.case_id}
				</td>
		</tr>
	<tr>
			<td>accuser_testimony</td>
		<td>
					${compareCase.accuser_testimony}
				</td>
		</tr>
	<tr>
			<td>indictment_id</td>
		<td>
					${compareCase.indictment_id}
				</td>
		</tr>
	<tr>
			<td>accuser_province</td>
		<td>
					${compareCase.accuser_province}
				</td>
		</tr>
	<tr>
			<td>accuser_district</td>
		<td>
					${compareCase.accuser_district}
				</td>
		</tr>
	<tr>
			<td>accuser_subdistrict</td>
		<td>
					${compareCase.accuser_subdistrict}
				</td>
		</tr>
	<tr>
			<td>compare_province</td>
		<td>
					${compareCase.compare_province}
				</td>
		</tr>
	<tr>
			<td>compare_district</td>
		<td>
					${compareCase.compare_district}
				</td>
		</tr>
	<tr>
			<td>compare_subdistrict</td>
		<td>
					${compareCase.compare_subdistrict}
				</td>
		</tr>
	<tr>
			<td>compare_office</td>
		<td>
					${compareCase.compare_office}
				</td>
		</tr>
	<tr>
			<td>track_no</td>
		<td>
					${compareCase.track_no}
				</td>
		</tr>
	<tr>
			<td>compare_case_date</td>
		<td>
					<fmt:formatDate value="${compareCase.compare_case_date}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>compare_case_no</td>
		<td>
					${compareCase.compare_case_no}
				</td>
		</tr>
	<tr>
		</tr>
</table>