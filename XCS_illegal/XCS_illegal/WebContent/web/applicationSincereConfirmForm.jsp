








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationSincereConfirm.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFNAME</strong></td>
		<td>
					<input type="text" name="offname" value="${applicationSincereConfirm.offname}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${applicationSincereConfirm.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationSincereConfirm.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationSincereConfirm.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationSincereConfirm.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationSincereConfirm.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DETECT_RESULT</strong></td>
		<td>
					<input type="text" name="detect_result" value="${applicationSincereConfirm.detect_result}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STORE_BY</strong></td>
		<td>
					<input type="text" name="store_by" value="${applicationSincereConfirm.store_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STORE_PLACE</strong></td>
		<td>
					<input type="text" name="store_place" value="${applicationSincereConfirm.store_place}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OWNER_BY</strong></td>
		<td>
					<input type="text" name="owner_by" value="${applicationSincereConfirm.owner_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OWNER_NAME</strong></td>
		<td>
					<input type="text" name="owner_name" value="${applicationSincereConfirm.owner_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TEL</strong></td>
		<td>
					<input type="text" name="tel" value="${applicationSincereConfirm.tel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ZIPCODE</strong></td>
		<td>
					<input type="text" name="zipcode" value="${applicationSincereConfirm.zipcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="subdistrict_code" value="${applicationSincereConfirm.subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="district_code" value="${applicationSincereConfirm.district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="province_code" value="${applicationSincereConfirm.province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROAD</strong></td>
		<td>
					<input type="text" name="road" value="${applicationSincereConfirm.road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SOI</strong></td>
		<td>
					<input type="text" name="soi" value="${applicationSincereConfirm.soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOO</strong></td>
		<td>
					<input type="text" name="moo" value="${applicationSincereConfirm.moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NO</strong></td>
		<td>
					<input type="text" name="address_no" value="${applicationSincereConfirm.address_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NAME</strong></td>
		<td>
					<input type="text" name="address_name" value="${applicationSincereConfirm.address_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_Y</strong></td>
		<td>
					<input type="text" name="coordinate_y" value="${applicationSincereConfirm.coordinate_y}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_X</strong></td>
		<td>
					<input type="text" name="coordinate_x" value="${applicationSincereConfirm.coordinate_x}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_DETECT</strong></td>
		<td>
					<input type="text" name="offcode_detect" value="${applicationSincereConfirm.offcode_detect}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_DETECT</strong></td>
		<td>
					<input type="text" name="poscode_detect" value="${applicationSincereConfirm.poscode_detect}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_IDCARDNO_DETECT</strong></td>
		<td>
					<input type="text" name="staff_idcardno_detect" value="${applicationSincereConfirm.staff_idcardno_detect}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NOTICE_DATE</strong></td>
		<td>
					<input id="notice_date" name="notice_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationSincereConfirm.notice_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('notice_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DETECT_DATE</strong></td>
		<td>
					<input id="detect_date" name="detect_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationSincereConfirm.detect_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('detect_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INPUT_DATE</strong></td>
		<td>
					<input id="input_date" name="input_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationSincereConfirm.input_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('input_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${applicationSincereConfirm.track_no}"/>
				</td>
	</tr>
	</table>