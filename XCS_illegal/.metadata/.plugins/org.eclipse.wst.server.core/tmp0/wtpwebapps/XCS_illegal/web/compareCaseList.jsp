








 

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
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=CompareCase&cmd=delete"/>">
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
				<td>INV_TYPE</td>
					<td>SUE_OFFCODE</td>
					<td>SUE_POSCODE</td>
					<td>SUE_STAFF_IDCARDNO</td>
					<td>CASE_FINE</td>
					<td>CASE_STATUS</td>
					<td>MANAGE_TYPE</td>
					<td>COMPARE_AUTHORITY_ID</td>
					<td>UPDATE_ON</td>
					<td>UPDATE_BY</td>
					<td>CREATE_ON</td>
					<td>CREATE_BY</td>
					<td>REWARD_MONEY</td>
					<td>BIRBE_MONEY</td>
					<td>TREASURY_MONEY</td>
					<td>REWARD_MONEY_P</td>
					<td>BRIBE_MONEY_P</td>
					<td>TREASURY_MONEY_P</td>
					<td>PAY_DATE</td>
					<td>COURT_FINE_DATE</td>
					<td>COURT_FINE</td>
					<td>CASE_ID</td>
					<td>ACCUSER_TESTIMONY</td>
					<td>INDICTMENT_ID</td>
					<td>ACCUSER_PROVINCE</td>
					<td>ACCUSER_DISTRICT</td>
					<td>ACCUSER_SUBDISTRICT</td>
					<td>COMPARE_PROVINCE</td>
					<td>COMPARE_DISTRICT</td>
					<td>COMPARE_SUBDISTRICT</td>
					<td>COMPARE_OFFICE</td>
					<td>TRACK_NO</td>
					<td>COMPARE_CASE_DATE</td>
					<td>COMPARE_CASE_NO</td>
					<td>View</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${compareCases}"  var="compareCase">
			<tr>
				<td><input type="checkbox" name="id" value="${user.id}"/></td>
				<td>${compareCase.id}</td>
			<td>
					${compareCase.inv_type}
				</td>
				<td>
					${compareCase.sue_offcode}
				</td>
				<td>
					${compareCase.sue_poscode}
				</td>
				<td>
					${compareCase.sue_staff_idcardno}
				</td>
				<td>
					${compareCase.case_fine}
				</td>
				<td>
					${compareCase.case_status}
				</td>
				<td>
					${compareCase.manage_type}
				</td>
				<td>
					${compareCase.compare_authority_id}
				</td>
				<td>
					<fmt:formatDate value="${compareCase.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareCase.update_by}
				</td>
				<td>
					<fmt:formatDate value="${compareCase.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareCase.create_by}
				</td>
				<td>
					${compareCase.reward_money}
				</td>
				<td>
					${compareCase.birbe_money}
				</td>
				<td>
					${compareCase.treasury_money}
				</td>
				<td>
					${compareCase.reward_money_p}
				</td>
				<td>
					${compareCase.bribe_money_p}
				</td>
				<td>
					${compareCase.treasury_money_p}
				</td>
				<td>
					<fmt:formatDate value="${compareCase.pay_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${compareCase.court_fine_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareCase.court_fine}
				</td>
				<td>
					${compareCase.case_id}
				</td>
				<td>
					${compareCase.accuser_testimony}
				</td>
				<td>
					${compareCase.indictment_id}
				</td>
				<td>
					${compareCase.accuser_province}
				</td>
				<td>
					${compareCase.accuser_district}
				</td>
				<td>
					${compareCase.accuser_subdistrict}
				</td>
				<td>
					${compareCase.compare_province}
				</td>
				<td>
					${compareCase.compare_district}
				</td>
				<td>
					${compareCase.compare_subdistrict}
				</td>
				<td>
					${compareCase.compare_office}
				</td>
				<td>
					${compareCase.track_no}
				</td>
				<td>
					<fmt:formatDate value="${compareCase.compare_case_date}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${compareCase.compare_case_no}
				</td>
						<td><a href="<c:url value='/process2?action=CompareCase&cmd=view&id='/>${compareCase.id}" >View</a></td>
				<td><a href="<c:url value='/process2?action=CompareCase&cmd=edit&id='/>${compareCase.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=CompareCase&cmd=delete&id='/>${compareCase.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="<c:url value='/process2?action=CompareCase&cmd=add'/>">Add New Record</a>
</form>