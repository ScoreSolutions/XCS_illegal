








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationArrestLawbreaker.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>ISMISTAKE_DESC</strong></td>
		<td>
					<input type="text" name="ismistake_desc" value="${applicationArrestLawbreaker.ismistake_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISMISTAKE</strong></td>
		<td>
					<input type="text" name="ismistake" value="${applicationArrestLawbreaker.ismistake}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PAPER_NO</strong></td>
		<td>
					<input type="text" name="paper_no" value="${applicationArrestLawbreaker.paper_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPANY_NAME</strong></td>
		<td>
					<input type="text" name="company_name" value="${applicationArrestLawbreaker.company_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COMPANY_TITLE_CODE</strong></td>
		<td>
					<input type="text" name="company_title_code" value="${applicationArrestLawbreaker.company_title_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CORPORATION_CODE</strong></td>
		<td>
					<input type="text" name="corporation_code" value="${applicationArrestLawbreaker.corporation_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EXCISE_REG_NO</strong></td>
		<td>
					<input type="text" name="excise_reg_no" value="${applicationArrestLawbreaker.excise_reg_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OTHER_NAME</strong></td>
		<td>
					<input type="text" name="other_name" value="${applicationArrestLawbreaker.other_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BIRTH_DATE</strong></td>
		<td>
					<input id="birth_date" name="birth_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestLawbreaker.birth_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('birth_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SEX</strong></td>
		<td>
					<input type="text" name="sex" value="${applicationArrestLawbreaker.sex}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_CODE</strong></td>
		<td>
					<input type="text" name="title_code" value="${applicationArrestLawbreaker.title_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestLawbreaker.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationArrestLawbreaker.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestLawbreaker.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationArrestLawbreaker.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CANCEL_BY</strong></td>
		<td>
					<input type="text" name="cancel_by" value="${applicationArrestLawbreaker.cancel_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CANCEL_DATE</strong></td>
		<td>
					<input id="cancel_date" name="cancel_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationArrestLawbreaker.cancel_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('cancel_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISCANCEL</strong></td>
		<td>
					<input type="text" name="iscancel" value="${applicationArrestLawbreaker.iscancel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INV_NO</strong></td>
		<td>
					<input type="text" name="inv_no" value="${applicationArrestLawbreaker.inv_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BOOK_NO</strong></td>
		<td>
					<input type="text" name="book_no" value="${applicationArrestLawbreaker.book_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE</strong></td>
		<td>
					<input type="text" name="fine" value="${applicationArrestLawbreaker.fine}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INVCODE</strong></td>
		<td>
					<input type="text" name="invcode" value="${applicationArrestLawbreaker.invcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PAID_TIME_OFF</strong></td>
		<td>
					<input type="text" name="paid_time_off" value="${applicationArrestLawbreaker.paid_time_off}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOTHER_NAME</strong></td>
		<td>
					<input type="text" name="mother_name" value="${applicationArrestLawbreaker.mother_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FATHER_NAME</strong></td>
		<td>
					<input type="text" name="father_name" value="${applicationArrestLawbreaker.father_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>AGE</strong></td>
		<td>
					<input type="text" name="age" value="${applicationArrestLawbreaker.age}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAREER</strong></td>
		<td>
					<input type="text" name="career" value="${applicationArrestLawbreaker.career}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RACE_ID</strong></td>
		<td>
					<input type="text" name="race_id" value="${applicationArrestLawbreaker.race_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NATIONALITY_ID</strong></td>
		<td>
					<input type="text" name="nationality_id" value="${applicationArrestLawbreaker.nationality_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVINCE</strong></td>
		<td>
					<input type="text" name="province" value="${applicationArrestLawbreaker.province}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DISTRICT</strong></td>
		<td>
					<input type="text" name="district" value="${applicationArrestLawbreaker.district}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBDISTRICT</strong></td>
		<td>
					<input type="text" name="subdistrict" value="${applicationArrestLawbreaker.subdistrict}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOO</strong></td>
		<td>
					<input type="text" name="moo" value="${applicationArrestLawbreaker.moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROAD</strong></td>
		<td>
					<input type="text" name="road" value="${applicationArrestLawbreaker.road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SOI</strong></td>
		<td>
					<input type="text" name="soi" value="${applicationArrestLawbreaker.soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NO</strong></td>
		<td>
					<input type="text" name="address_no" value="${applicationArrestLawbreaker.address_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAST_NAME</strong></td>
		<td>
					<input type="text" name="last_name" value="${applicationArrestLawbreaker.last_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MIDDLE_NAME</strong></td>
		<td>
					<input type="text" name="middle_name" value="${applicationArrestLawbreaker.middle_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIRST_NAME</strong></td>
		<td>
					<input type="text" name="first_name" value="${applicationArrestLawbreaker.first_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_PASSPORT</strong></td>
		<td>
					<input type="text" name="lawbreaker_passport" value="${applicationArrestLawbreaker.lawbreaker_passport}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_ID_CARD</strong></td>
		<td>
					<input type="text" name="lawbreaker_id_card" value="${applicationArrestLawbreaker.lawbreaker_id_card}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CULPRIT_TYPE</strong></td>
		<td>
					<input type="text" name="culprit_type" value="${applicationArrestLawbreaker.culprit_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_NO</strong></td>
		<td>
					<input type="text" name="lawbreaker_no" value="${applicationArrestLawbreaker.lawbreaker_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${applicationArrestLawbreaker.track_no}"/>
				</td>
	</tr>
	</table>