








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${lawbreaker.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>DESCRIPTION</strong></td>
		<td>
					<input type="text" name="description" value="${lawbreaker.description}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOBILE</strong></td>
		<td>
					<input type="text" name="mobile" value="${lawbreaker.mobile}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSE_NO</strong></td>
		<td>
					<input type="text" name="license_no" value="${lawbreaker.license_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSE_DATE_TO</strong></td>
		<td>
					<input id="license_date_to" name="license_date_to" type="text" class="textdate" value="<fmt:formatDate value="${lawbreaker.license_date_to}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('license_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSE_DATE_FROM</strong></td>
		<td>
					<input id="license_date_from" name="license_date_from" type="text" class="textdate" value="<fmt:formatDate value="${lawbreaker.license_date_from}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('license_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PHOTO_DESC</strong></td>
		<td>
					<input type="text" name="photo_desc" value="${lawbreaker.photo_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LINK_PHOTO</strong></td>
		<td>
					<input type="file" name="link_photo" value=""/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPANY_NAME</strong></td>
		<td>
					<input type="text" name="company_name" value="${lawbreaker.company_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_CODE_COMPANY</strong></td>
		<td>
					<input type="text" name="title_code_company" value="${lawbreaker.title_code_company}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DATE_OUT</strong></td>
		<td>
					<input id="date_out" name="date_out" type="text" class="textdate" value="<fmt:formatDate value="${lawbreaker.date_out}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('date_out','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DATE_IN</strong></td>
		<td>
					<input id="date_in" name="date_in" type="text" class="textdate" value="<fmt:formatDate value="${lawbreaker.date_in}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('date_in','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>VISA_TYPE</strong></td>
		<td>
					<input type="text" name="visa_type" value="${lawbreaker.visa_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PASSPORT_COUNTRY</strong></td>
		<td>
					<input type="text" name="passport_country" value="${lawbreaker.passport_country}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COUNTRY_CODE</strong></td>
		<td>
					<input type="text" name="country_code" value="${lawbreaker.country_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEL_FLAG</strong></td>
		<td>
					<input type="text" name="del_flag" value="${lawbreaker.del_flag}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_Y</strong></td>
		<td>
					<input type="text" name="coordinate_y" value="${lawbreaker.coordinate_y}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_X</strong></td>
		<td>
					<input type="text" name="coordinate_x" value="${lawbreaker.coordinate_x}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NAME</strong></td>
		<td>
					<input type="text" name="address_name" value="${lawbreaker.address_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MODIFY_DATE</strong></td>
		<td>
					<input id="modify_date" name="modify_date" type="text" class="textdate" value="<fmt:formatDate value="${lawbreaker.modify_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('modify_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MODIFY_ID</strong></td>
		<td>
					<input type="text" name="modify_id" value="${lawbreaker.modify_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_DATE</strong></td>
		<td>
					<input id="create_date" name="create_date" type="text" class="textdate" value="<fmt:formatDate value="${lawbreaker.create_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ID</strong></td>
		<td>
					<input type="text" name="create_id" value="${lawbreaker.create_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${lawbreaker.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CORPORATION_CODE</strong></td>
		<td>
					<input type="text" name="corporation_code" value="${lawbreaker.corporation_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EXCISE_REG_NO</strong></td>
		<td>
					<input type="text" name="excise_reg_no" value="${lawbreaker.excise_reg_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TAX_ID_NO</strong></td>
		<td>
					<input type="text" name="tax_id_no" value="${lawbreaker.tax_id_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EMAIL</strong></td>
		<td>
					<input type="text" name="email" value="${lawbreaker.email}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TEL</strong></td>
		<td>
					<input type="text" name="tel" value="${lawbreaker.tel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POST_CODE</strong></td>
		<td>
					<input type="text" name="post_code" value="${lawbreaker.post_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="province_code" value="${lawbreaker.province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="district_code" value="${lawbreaker.district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="subdistrict_code" value="${lawbreaker.subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROAD</strong></td>
		<td>
					<input type="text" name="road" value="${lawbreaker.road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SOI</strong></td>
		<td>
					<input type="text" name="soi" value="${lawbreaker.soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOO</strong></td>
		<td>
					<input type="text" name="moo" value="${lawbreaker.moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NO</strong></td>
		<td>
					<input type="text" name="address_no" value="${lawbreaker.address_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAREER</strong></td>
		<td>
					<input type="text" name="career" value="${lawbreaker.career}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NATION_ID</strong></td>
		<td>
					<input type="text" name="nation_id" value="${lawbreaker.nation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RACE_ID</strong></td>
		<td>
					<input type="text" name="race_id" value="${lawbreaker.race_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RELIGION_ID</strong></td>
		<td>
					<input type="text" name="religion_id" value="${lawbreaker.religion_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BLOOD_TYPE</strong></td>
		<td>
					<input type="text" name="blood_type" value="${lawbreaker.blood_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MARITAL_STATUS</strong></td>
		<td>
					<input type="text" name="marital_status" value="${lawbreaker.marital_status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEX</strong></td>
		<td>
					<input type="text" name="sex" value="${lawbreaker.sex}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BIRTH_DATE</strong></td>
		<td>
					<input id="birth_date" name="birth_date" type="text" class="textdate" value="<fmt:formatDate value="${lawbreaker.birth_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('birth_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HEIGHT</strong></td>
		<td>
					<input type="text" name="height" value="${lawbreaker.height}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OTHER_NAME</strong></td>
		<td>
					<input type="text" name="other_name" value="${lawbreaker.other_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAST_NAME</strong></td>
		<td>
					<input type="text" name="last_name" value="${lawbreaker.last_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MIDDLE_NAME</strong></td>
		<td>
					<input type="text" name="middle_name" value="${lawbreaker.middle_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIRST_NAME</strong></td>
		<td>
					<input type="text" name="first_name" value="${lawbreaker.first_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_CODE</strong></td>
		<td>
					<input type="text" name="title_code" value="${lawbreaker.title_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_PASSPORT</strong></td>
		<td>
					<input type="text" name="lawbreaker_passport" value="${lawbreaker.lawbreaker_passport}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_ID_CARD</strong></td>
		<td>
					<input type="text" name="lawbreaker_id_card" value="${lawbreaker.lawbreaker_id_card}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_TYPE</strong></td>
		<td>
					<input type="text" name="lawbreaker_type" value="${lawbreaker.lawbreaker_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_NO</strong></td>
		<td>
					<input type="text" name="lawbreaker_no" value="${lawbreaker.lawbreaker_no}"/>
				</td>
	</tr>
	</table>