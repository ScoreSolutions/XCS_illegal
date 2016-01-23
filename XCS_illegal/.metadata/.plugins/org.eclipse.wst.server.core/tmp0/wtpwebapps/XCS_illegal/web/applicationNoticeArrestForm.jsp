








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationNoticeArrest.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>ISFINGERAPPROVE</strong></td>
		<td>
					<input type="text" name="isfingerapprove" value="${applicationNoticeArrest.isfingerapprove}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_TYPE</strong></td>
		<td>
					<input type="text" name="inform_type" value="${applicationNoticeArrest.inform_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEL_FLAG</strong></td>
		<td>
					<input type="text" name="del_flag" value="${applicationNoticeArrest.del_flag}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${applicationNoticeArrest.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationNoticeArrest.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationNoticeArrest.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationNoticeArrest.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationNoticeArrest.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISREWARD_PAY</strong></td>
		<td>
					<input type="text" name="isreward_pay" value="${applicationNoticeArrest.isreward_pay}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISMANAGE</strong></td>
		<td>
					<input type="text" name="ismanage" value="${applicationNoticeArrest.ismanage}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NOTICE_RESULT</strong></td>
		<td>
					<input type="text" name="notice_result" value="${applicationNoticeArrest.notice_result}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${applicationNoticeArrest.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NEXT_STEP</strong></td>
		<td>
					<input type="text" name="next_step" value="${applicationNoticeArrest.next_step}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_COMMANDER</strong></td>
		<td>
					<input type="text" name="offcode_commander" value="${applicationNoticeArrest.offcode_commander}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_COMMANDER</strong></td>
		<td>
					<input type="text" name="poscode_commander" value="${applicationNoticeArrest.poscode_commander}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_COMMANDER</strong></td>
		<td>
					<input type="text" name="staff_id_commander" value="${applicationNoticeArrest.staff_id_commander}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_ACCEPT</strong></td>
		<td>
					<input type="text" name="staff_id_accept" value="${applicationNoticeArrest.staff_id_accept}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_SURETY</strong></td>
		<td>
					<input type="text" name="offcode_surety" value="${applicationNoticeArrest.offcode_surety}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_SURETY</strong></td>
		<td>
					<input type="text" name="poscode_surety" value="${applicationNoticeArrest.poscode_surety}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_SURETY</strong></td>
		<td>
					<input type="text" name="staff_id_surety" value="${applicationNoticeArrest.staff_id_surety}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_RECEIVE</strong></td>
		<td>
					<input type="text" name="offcode_receive" value="${applicationNoticeArrest.offcode_receive}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_RECEIVE</strong></td>
		<td>
					<input type="text" name="poscode_receive" value="${applicationNoticeArrest.poscode_receive}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_ID_RECEIVE</strong></td>
		<td>
					<input type="text" name="staff_id_receive" value="${applicationNoticeArrest.staff_id_receive}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HIDING_PLACE</strong></td>
		<td>
					<input type="text" name="hiding_place" value="${applicationNoticeArrest.hiding_place}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>VEHICLE_PARTICULAR</strong></td>
		<td>
					<input type="text" name="vehicle_particular" value="${applicationNoticeArrest.vehicle_particular}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="lawbreaker_province_code" value="${applicationNoticeArrest.lawbreaker_province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="lawbreaker_district_code" value="${applicationNoticeArrest.lawbreaker_district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="lawbreaker_subdistrict_code" value="${applicationNoticeArrest.lawbreaker_subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_MOO</strong></td>
		<td>
					<input type="text" name="lawbreaker_moo" value="${applicationNoticeArrest.lawbreaker_moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_ROAD</strong></td>
		<td>
					<input type="text" name="lawbreaker_road" value="${applicationNoticeArrest.lawbreaker_road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_SOI</strong></td>
		<td>
					<input type="text" name="lawbreaker_soi" value="${applicationNoticeArrest.lawbreaker_soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_ADDRESS_NAME</strong></td>
		<td>
					<input type="text" name="lawbreaker_address_name" value="${applicationNoticeArrest.lawbreaker_address_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_ADDRESS</strong></td>
		<td>
					<input type="text" name="lawbreaker_address" value="${applicationNoticeArrest.lawbreaker_address}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SECRET_LEVEL</strong></td>
		<td>
					<input type="text" name="secret_level" value="${applicationNoticeArrest.secret_level}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ARREST_DESC</strong></td>
		<td>
					<input type="text" name="arrest_desc" value="${applicationNoticeArrest.arrest_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="inform_province_code" value="${applicationNoticeArrest.inform_province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="inform_district_code" value="${applicationNoticeArrest.inform_district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="inform_subdistrict_code" value="${applicationNoticeArrest.inform_subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_MOO</strong></td>
		<td>
					<input type="text" name="inform_moo" value="${applicationNoticeArrest.inform_moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_ROAD</strong></td>
		<td>
					<input type="text" name="inform_road" value="${applicationNoticeArrest.inform_road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_SOI</strong></td>
		<td>
					<input type="text" name="inform_soi" value="${applicationNoticeArrest.inform_soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_ADDRESS_NAME</strong></td>
		<td>
					<input type="text" name="inform_address_name" value="${applicationNoticeArrest.inform_address_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_ADDRESS</strong></td>
		<td>
					<input type="text" name="inform_address" value="${applicationNoticeArrest.inform_address}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_AGE</strong></td>
		<td>
					<input type="text" name="inform_age" value="${applicationNoticeArrest.inform_age}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INFORM_NAME</strong></td>
		<td>
					<input type="text" name="inform_name" value="${applicationNoticeArrest.inform_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_NO</strong></td>
		<td>
					<input type="text" name="lawbreaker_no" value="${applicationNoticeArrest.lawbreaker_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RECEIVE_DATE</strong></td>
		<td>
					<input id="receive_date" name="receive_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationNoticeArrest.receive_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('receive_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_CODE</strong></td>
		<td>
					<input type="text" name="duty_code" value="${applicationNoticeArrest.duty_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${applicationNoticeArrest.legislation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFNAME</strong></td>
		<td>
					<input type="text" name="offname" value="${applicationNoticeArrest.offname}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NOTICE_DATE</strong></td>
		<td>
					<input id="notice_date" name="notice_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationNoticeArrest.notice_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('notice_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NOTICE_NO</strong></td>
		<td>
					<input type="text" name="notice_no" value="${applicationNoticeArrest.notice_no}"/>
				</td>
	</tr>
	</table>