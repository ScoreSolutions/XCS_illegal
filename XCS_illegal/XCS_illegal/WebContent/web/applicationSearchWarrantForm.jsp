








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationSearchWarrant.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_NOTICE_ARREST_ID</strong></td>
		<td>
					<input type="text" name="application_notice_arrest_id" value="${applicationSearchWarrant.application_notice_arrest_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RESULT_QTY_DATE</strong></td>
		<td>
					<input type="text" name="result_qty_date" value="${applicationSearchWarrant.result_qty_date}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COURT_ORDER_FAMILIAR</strong></td>
		<td>
					<input type="text" name="court_order_familiar" value="${applicationSearchWarrant.court_order_familiar}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_ASSIGN</strong></td>
		<td>
					<input type="text" name="offcode_assign" value="${applicationSearchWarrant.offcode_assign}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_ASSIGN</strong></td>
		<td>
					<input type="text" name="poscode_assign" value="${applicationSearchWarrant.poscode_assign}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_ASSIGN</strong></td>
		<td>
					<input type="text" name="staff_id_assign" value="${applicationSearchWarrant.staff_id_assign}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_REQ_FOR</strong></td>
		<td>
					<input type="text" name="offcode_req_for" value="${applicationSearchWarrant.offcode_req_for}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_REQ_FOR</strong></td>
		<td>
					<input type="text" name="poscode_req_for" value="${applicationSearchWarrant.poscode_req_for}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_REQ_FOR</strong></td>
		<td>
					<input type="text" name="staff_id_req_for" value="${applicationSearchWarrant.staff_id_req_for}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TEL_REQUEST</strong></td>
		<td>
					<input type="text" name="tel_request" value="${applicationSearchWarrant.tel_request}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAREER_REQUEST</strong></td>
		<td>
					<input type="text" name="career_request" value="${applicationSearchWarrant.career_request}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${applicationSearchWarrant.track_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFICE_ADDRESS</strong></td>
		<td>
					<input type="text" name="office_address" value="${applicationSearchWarrant.office_address}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationSearchWarrant.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationSearchWarrant.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationSearchWarrant.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationSearchWarrant.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_RESULT</strong></td>
		<td>
					<input type="text" name="search_result" value="${applicationSearchWarrant.search_result}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEND_TO_DESC</strong></td>
		<td>
					<input type="text" name="send_to_desc" value="${applicationSearchWarrant.send_to_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEND_DESC</strong></td>
		<td>
					<input type="text" name="send_desc" value="${applicationSearchWarrant.send_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COURT_ID_ARREST</strong></td>
		<td>
					<input type="text" name="court_id_arrest" value="${applicationSearchWarrant.court_id_arrest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ARREST_DATE</strong></td>
		<td>
					<input id="arrest_date" name="arrest_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationSearchWarrant.arrest_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('arrest_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ARREST_NO</strong></td>
		<td>
					<input type="text" name="arrest_no" value="${applicationSearchWarrant.arrest_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CHECK2_2</strong></td>
		<td>
					<input type="text" name="search_check2_2" value="${applicationSearchWarrant.search_check2_2}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CHECK2_1</strong></td>
		<td>
					<input type="text" name="search_check2_1" value="${applicationSearchWarrant.search_check2_1}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CHECK2_DESC</strong></td>
		<td>
					<input type="text" name="search_check2_desc" value="${applicationSearchWarrant.search_check2_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CHECK2</strong></td>
		<td>
					<input type="text" name="search_check2" value="${applicationSearchWarrant.search_check2}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CHECK1_3</strong></td>
		<td>
					<input type="text" name="search_check1_3" value="${applicationSearchWarrant.search_check1_3}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CHECK1_2</strong></td>
		<td>
					<input type="text" name="search_check1_2" value="${applicationSearchWarrant.search_check1_2}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CHECK1_1</strong></td>
		<td>
					<input type="text" name="search_check1_1" value="${applicationSearchWarrant.search_check1_1}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CHECK1_DESC</strong></td>
		<td>
					<input type="text" name="search_check1_desc" value="${applicationSearchWarrant.search_check1_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CHECK1</strong></td>
		<td>
					<input type="text" name="search_check1" value="${applicationSearchWarrant.search_check1}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>JEDGE_NAME</strong></td>
		<td>
					<input type="text" name="jedge_name" value="${applicationSearchWarrant.jedge_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>WARRANT_DATE</strong></td>
		<td>
					<input id="warrant_date" name="warrant_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationSearchWarrant.warrant_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('warrant_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>WARRANT_NO</strong></td>
		<td>
					<input type="text" name="warrant_no" value="${applicationSearchWarrant.warrant_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS_NONAPPROVE</strong></td>
		<td>
					<input type="text" name="remarks_nonapprove" value="${applicationSearchWarrant.remarks_nonapprove}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISAPPROVE</strong></td>
		<td>
					<input type="text" name="isapprove" value="${applicationSearchWarrant.isapprove}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISCOPY</strong></td>
		<td>
					<input type="text" name="iscopy" value="${applicationSearchWarrant.iscopy}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISALLOW</strong></td>
		<td>
					<input type="text" name="isallow" value="${applicationSearchWarrant.isallow}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COURT_ORDER</strong></td>
		<td>
					<input type="text" name="court_order" value="${applicationSearchWarrant.court_order}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>WITNESS_QTY</strong></td>
		<td>
					<input type="text" name="witness_qty" value="${applicationSearchWarrant.witness_qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CONSIDER_DATE</strong></td>
		<td>
					<input id="consider_date" name="consider_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationSearchWarrant.consider_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('consider_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAUSE_FAMILIAR</strong></td>
		<td>
					<input type="text" name="cause_familiar" value="${applicationSearchWarrant.cause_familiar}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COURT_ID_FAMILIAR</strong></td>
		<td>
					<input type="text" name="court_id_familiar" value="${applicationSearchWarrant.court_id_familiar}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQUEST_FAMILIAR</strong></td>
		<td>
					<input type="text" name="request_familiar" value="${applicationSearchWarrant.request_familiar}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="province_code" value="${applicationSearchWarrant.province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="district_code" value="${applicationSearchWarrant.district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="subdistrict_code" value="${applicationSearchWarrant.subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOO</strong></td>
		<td>
					<input type="text" name="moo" value="${applicationSearchWarrant.moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SOI</strong></td>
		<td>
					<input type="text" name="soi" value="${applicationSearchWarrant.soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NAME</strong></td>
		<td>
					<input type="text" name="address_name" value="${applicationSearchWarrant.address_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NO</strong></td>
		<td>
					<input type="text" name="address_no" value="${applicationSearchWarrant.address_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROAD</strong></td>
		<td>
					<input type="text" name="road" value="${applicationSearchWarrant.road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OWNER_POSITION</strong></td>
		<td>
					<input type="text" name="owner_position" value="${applicationSearchWarrant.owner_position}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OWNER_CAREER</strong></td>
		<td>
					<input type="text" name="owner_career" value="${applicationSearchWarrant.owner_career}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OWNER_AGE</strong></td>
		<td>
					<input type="text" name="owner_age" value="${applicationSearchWarrant.owner_age}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OWNER_NAME</strong></td>
		<td>
					<input type="text" name="owner_name" value="${applicationSearchWarrant.owner_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQ_CHECK5</strong></td>
		<td>
					<input type="text" name="req_check5" value="${applicationSearchWarrant.req_check5}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQ_CHECK4</strong></td>
		<td>
					<input type="text" name="req_check4" value="${applicationSearchWarrant.req_check4}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQ_CHECK3</strong></td>
		<td>
					<input type="text" name="req_check3" value="${applicationSearchWarrant.req_check3}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQ_CHECK2</strong></td>
		<td>
					<input type="text" name="req_check2" value="${applicationSearchWarrant.req_check2}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQ_CHECK1</strong></td>
		<td>
					<input type="text" name="req_check1" value="${applicationSearchWarrant.req_check1}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_CAUSE</strong></td>
		<td>
					<input type="text" name="search_cause" value="${applicationSearchWarrant.search_cause}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CHK_CONTINUE</strong></td>
		<td>
					<input type="text" name="chk_continue" value="${applicationSearchWarrant.chk_continue}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_DATETO</strong></td>
		<td>
					<input id="search_dateto" name="search_dateto" type="text" class="textdate" value="<fmt:formatDate value="${applicationSearchWarrant.search_dateto}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('search_dateto','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEARCH_DATEFROM</strong></td>
		<td>
					<input id="search_datefrom" name="search_datefrom" type="text" class="textdate" value="<fmt:formatDate value="${applicationSearchWarrant.search_datefrom}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('search_datefrom','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COURT_ID</strong></td>
		<td>
					<input type="text" name="court_id" value="${applicationSearchWarrant.court_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>AGE_REQUEST</strong></td>
		<td>
					<input type="text" name="age_request" value="${applicationSearchWarrant.age_request}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_REQUEST</strong></td>
		<td>
					<input type="text" name="offcode_request" value="${applicationSearchWarrant.offcode_request}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_REQUEST</strong></td>
		<td>
					<input type="text" name="poscode_request" value="${applicationSearchWarrant.poscode_request}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_REQUEST</strong></td>
		<td>
					<input type="text" name="staff_id_request" value="${applicationSearchWarrant.staff_id_request}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQUEST_DATE</strong></td>
		<td>
					<input id="request_date" name="request_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationSearchWarrant.request_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('request_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REQUEST_NO</strong></td>
		<td>
					<input type="text" name="request_no" value="${applicationSearchWarrant.request_no}"/>
				</td>
	</tr>
	</table>