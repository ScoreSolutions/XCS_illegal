








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspect.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>PASSPORT_COUNTRY</strong></td>
		<td>
					<input type="text" name="passport_country" value="${suspect.passport_country}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DEL_FLAG</strong></td>
		<td>
					<input type="text" name="del_flag" value="${suspect.del_flag}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${suspect.offcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MIME_TYPE</strong></td>
		<td>
					<input type="text" name="mime_type" value="${suspect.mime_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_DATE</strong></td>
		<td>
					<input id="update_date" name="update_date" type="text" class="textdate" value="<fmt:formatDate value="${suspect.update_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ID</strong></td>
		<td>
					<input type="text" name="update_id" value="${suspect.update_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LINK_PHOTO</strong></td>
		<td>
					<input type="file" name="link_photo" value=""/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSE_DATE_TO</strong></td>
		<td>
					<input id="license_date_to" name="license_date_to" type="text" class="textdate" value="<fmt:formatDate value="${suspect.license_date_to}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('license_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSE_DATE_FROM</strong></td>
		<td>
					<input id="license_date_from" name="license_date_from" type="text" class="textdate" value="<fmt:formatDate value="${suspect.license_date_from}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('license_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPANY_NAME</strong></td>
		<td>
					<input type="text" name="company_name" value="${suspect.company_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_CODE_COMPANY</strong></td>
		<td>
					<input type="text" name="title_code_company" value="${suspect.title_code_company}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PHOTO_DESC</strong></td>
		<td>
					<input type="text" name="photo_desc" value="${suspect.photo_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOBILE</strong></td>
		<td>
					<input type="text" name="mobile" value="${suspect.mobile}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COUNTRY_CODE</strong></td>
		<td>
					<input type="text" name="country_code" value="${suspect.country_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DATE_OUT</strong></td>
		<td>
					<input id="date_out" name="date_out" type="text" class="textdate" value="<fmt:formatDate value="${suspect.date_out}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('date_out','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DATE_IN</strong></td>
		<td>
					<input id="date_in" name="date_in" type="text" class="textdate" value="<fmt:formatDate value="${suspect.date_in}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('date_in','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>VISA_TYPE</strong></td>
		<td>
					<input type="text" name="visa_type" value="${suspect.visa_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_DATE</strong></td>
		<td>
					<input id="create_date" name="create_date" type="text" class="textdate" value="<fmt:formatDate value="${suspect.create_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ID</strong></td>
		<td>
					<input type="text" name="create_id" value="${suspect.create_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DESCRIPTION</strong></td>
		<td>
					<input type="text" name="description" value="${suspect.description}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LICENSE_NO</strong></td>
		<td>
					<input type="text" name="license_no" value="${suspect.license_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CORPORATION_CODE</strong></td>
		<td>
					<input type="text" name="corporation_code" value="${suspect.corporation_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EXCISE_REG_NO</strong></td>
		<td>
					<input type="text" name="excise_reg_no" value="${suspect.excise_reg_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TAX_ID_NO</strong></td>
		<td>
					<input type="text" name="tax_id_no" value="${suspect.tax_id_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EMAIL</strong></td>
		<td>
					<input type="text" name="email" value="${suspect.email}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TEL</strong></td>
		<td>
					<input type="text" name="tel" value="${suspect.tel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_Y</strong></td>
		<td>
					<input type="text" name="coordinate_y" value="${suspect.coordinate_y}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_X</strong></td>
		<td>
					<input type="text" name="coordinate_x" value="${suspect.coordinate_x}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POST_CODE</strong></td>
		<td>
					<input type="text" name="post_code" value="${suspect.post_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="province_code" value="${suspect.province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="district_code" value="${suspect.district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="subdistrict_code" value="${suspect.subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROAD</strong></td>
		<td>
					<input type="text" name="road" value="${suspect.road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SOI</strong></td>
		<td>
					<input type="text" name="soi" value="${suspect.soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOO</strong></td>
		<td>
					<input type="text" name="moo" value="${suspect.moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NO</strong></td>
		<td>
					<input type="text" name="address_no" value="${suspect.address_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NAME</strong></td>
		<td>
					<input type="text" name="address_name" value="${suspect.address_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAREER</strong></td>
		<td>
					<input type="text" name="career" value="${suspect.career}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NATION_ID</strong></td>
		<td>
					<input type="text" name="nation_id" value="${suspect.nation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RACE_ID</strong></td>
		<td>
					<input type="text" name="race_id" value="${suspect.race_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RELIGION_ID</strong></td>
		<td>
					<input type="text" name="religion_id" value="${suspect.religion_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BLOOD_TYPE</strong></td>
		<td>
					<input type="text" name="blood_type" value="${suspect.blood_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MARITAL_STATUS</strong></td>
		<td>
					<input type="text" name="marital_status" value="${suspect.marital_status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEX</strong></td>
		<td>
					<input type="text" name="sex" value="${suspect.sex}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BIRTH_DATE</strong></td>
		<td>
					<input id="birth_date" name="birth_date" type="text" class="textdate" value="<fmt:formatDate value="${suspect.birth_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('birth_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HEIGHT</strong></td>
		<td>
					<input type="text" name="height" value="${suspect.height}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OTHER_NAME</strong></td>
		<td>
					<input type="text" name="other_name" value="${suspect.other_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAST_NAME</strong></td>
		<td>
					<input type="text" name="last_name" value="${suspect.last_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MIDDLE_NAME</strong></td>
		<td>
					<input type="text" name="middle_name" value="${suspect.middle_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIRST_NAME</strong></td>
		<td>
					<input type="text" name="first_name" value="${suspect.first_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_CODE</strong></td>
		<td>
					<input type="text" name="title_code" value="${suspect.title_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUSPECT_PASSPORT</strong></td>
		<td>
					<input type="text" name="suspect_passport" value="${suspect.suspect_passport}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUSPECT_ID_CARD</strong></td>
		<td>
					<input type="text" name="suspect_id_card" value="${suspect.suspect_id_card}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUSPECT_TYPE</strong></td>
		<td>
					<input type="text" name="suspect_type" value="${suspect.suspect_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUSPECT_NO</strong></td>
		<td>
					<input type="text" name="suspect_no" value="${suspect.suspect_no}"/>
				</td>
	</tr>
	</table>