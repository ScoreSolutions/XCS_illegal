








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${appReqApproveCompareForm2.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${appReqApproveCompareForm2.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${appReqApproveCompareForm2.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${appReqApproveCompareForm2.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${appReqApproveCompareForm2.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_APPROVE</strong></td>
		<td>
					<input type="text" name="offcode_approve" value="${appReqApproveCompareForm2.offcode_approve}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_APPROVE</strong></td>
		<td>
					<input type="text" name="poscode_approve" value="${appReqApproveCompareForm2.poscode_approve}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_APPROVE</strong></td>
		<td>
					<input type="text" name="staff_id_approve" value="${appReqApproveCompareForm2.staff_id_approve}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPROVE_DATE</strong></td>
		<td>
					<input id="approve_date" name="approve_date" type="text" class="textdate" value="<fmt:formatDate value="${appReqApproveCompareForm2.approve_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('approve_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NONEAPPROVE_DESC</strong></td>
		<td>
					<input type="text" name="noneapprove_desc" value="${appReqApproveCompareForm2.noneapprove_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPROVE_DESC</strong></td>
		<td>
					<input type="text" name="approve_desc" value="${appReqApproveCompareForm2.approve_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISAPPROVE</strong></td>
		<td>
					<input type="text" name="isapprove" value="${appReqApproveCompareForm2.isapprove}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_ACCEPT</strong></td>
		<td>
					<input type="text" name="offcode_accept" value="${appReqApproveCompareForm2.offcode_accept}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_ACCEPT</strong></td>
		<td>
					<input type="text" name="poscode_accept" value="${appReqApproveCompareForm2.poscode_accept}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_ACCEPT</strong></td>
		<td>
					<input type="text" name="staff_id_accept" value="${appReqApproveCompareForm2.staff_id_accept}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NONEACCEPT_DESC</strong></td>
		<td>
					<input type="text" name="noneaccept_desc" value="${appReqApproveCompareForm2.noneaccept_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ACCEPT_DESC</strong></td>
		<td>
					<input type="text" name="accept_desc" value="${appReqApproveCompareForm2.accept_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISACCEPT</strong></td>
		<td>
					<input type="text" name="isaccept" value="${appReqApproveCompareForm2.isaccept}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_DIRECTOR</strong></td>
		<td>
					<input type="text" name="offcode_director" value="${appReqApproveCompareForm2.offcode_director}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_DIRECTOR</strong></td>
		<td>
					<input type="text" name="poscode_director" value="${appReqApproveCompareForm2.poscode_director}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_DIRECTOR</strong></td>
		<td>
					<input type="text" name="staff_id_director" value="${appReqApproveCompareForm2.staff_id_director}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DIRECTOR_INFORM_DATE</strong></td>
		<td>
					<input id="director_inform_date" name="director_inform_date" type="text" class="textdate" value="<fmt:formatDate value="${appReqApproveCompareForm2.director_inform_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('director_inform_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DIRECTOR_INFORM_FOR</strong></td>
		<td>
					<input type="text" name="director_inform_for" value="${appReqApproveCompareForm2.director_inform_for}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DIRECTOR_INFORM_TO</strong></td>
		<td>
					<input type="text" name="director_inform_to" value="${appReqApproveCompareForm2.director_inform_to}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_INFORM</strong></td>
		<td>
					<input type="text" name="offcode_inform" value="${appReqApproveCompareForm2.offcode_inform}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_INFORM</strong></td>
		<td>
					<input type="text" name="poscode_inform" value="${appReqApproveCompareForm2.poscode_inform}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_INFORM</strong></td>
		<td>
					<input type="text" name="staff_id_inform" value="${appReqApproveCompareForm2.staff_id_inform}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_DATE</strong></td>
		<td>
					<input id="inform_date" name="inform_date" type="text" class="textdate" value="<fmt:formatDate value="${appReqApproveCompareForm2.inform_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('inform_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_FOR</strong></td>
		<td>
					<input type="text" name="inform_for" value="${appReqApproveCompareForm2.inform_for}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_TO</strong></td>
		<td>
					<input type="text" name="inform_to" value="${appReqApproveCompareForm2.inform_to}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APP_REQ_APPROVE_COMPARE_ID</strong></td>
		<td>
					<input type="text" name="app_req_approve_compare_id" value="${appReqApproveCompareForm2.app_req_approve_compare_id}"/>
				</td>
	</tr>
	</table>