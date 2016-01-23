<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${appReqApproveCompare.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${appReqApproveCompare.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${appReqApproveCompare.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${appReqApproveCompare.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${appReqApproveCompare.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_REASON</strong></td>
		<td>
					<input type="text" name="compare_reason" value="${appReqApproveCompare.compare_reason}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MISTAKE_DETAIL</strong></td>
		<td>
					<input type="text" name="mistake_detail" value="${appReqApproveCompare.mistake_detail}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISLAWBREAKERRENT</strong></td>
		<td>
					<input type="text" name="islawbreakerrent" value="${appReqApproveCompare.islawbreakerrent}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CONTRACT_DATE</strong></td>
		<td>
					<input id="contract_date" name="contract_date" type="text" class="textdate" value="<fmt:formatDate value="${appReqApproveCompare.contract_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('contract_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CONTRACT_NO</strong></td>
		<td>
					<input type="text" name="contract_no" value="${appReqApproveCompare.contract_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CONTRACT</strong></td>
		<td>
					<input type="text" name="contract" value="${appReqApproveCompare.contract}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RENT_NAME</strong></td>
		<td>
					<input type="text" name="rent_name" value="${appReqApproveCompare.rent_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OWNERSHIP</strong></td>
		<td>
					<input type="text" name="ownership" value="${appReqApproveCompare.ownership}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HOLD_SHIP</strong></td>
		<td>
					<input type="text" name="hold_ship" value="${appReqApproveCompare.hold_ship}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BODY_NO</strong></td>
		<td>
					<input type="text" name="body_no" value="${appReqApproveCompare.body_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ENGINE_NO</strong></td>
		<td>
					<input type="text" name="engine_no" value="${appReqApproveCompare.engine_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>VEHICLE_NAME</strong></td>
		<td>
					<input type="text" name="vehicle_name" value="${appReqApproveCompare.vehicle_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPARE_CASE_ID</strong></td>
		<td>
					<input type="text" name="compare_case_id" value="${appReqApproveCompare.compare_case_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${appReqApproveCompare.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQ_DATE</strong></td>
		<td>
					<input id="req_date" name="req_date" type="text" class="textdate" value="<fmt:formatDate value="${appReqApproveCompare.req_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('req_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${appReqApproveCompare.track_no}"/>
				</td>
	</tr>
	</table>