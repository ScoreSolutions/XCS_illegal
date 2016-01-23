








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectRelatif.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>IDCARDNO</strong></td>
		<td>
					<input type="text" name="idcardno" value="${suspectRelatif.idcardno}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectRelatif.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${suspectRelatif.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectRelatif.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${suspectRelatif.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EMAIL</strong></td>
		<td>
					<input type="text" name="email" value="${suspectRelatif.email}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TEL</strong></td>
		<td>
					<input type="text" name="tel" value="${suspectRelatif.tel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HOMETOWN_POST_CODE</strong></td>
		<td>
					<input type="text" name="hometown_post_code" value="${suspectRelatif.hometown_post_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HOMETOWN_PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="hometown_province_code" value="${suspectRelatif.hometown_province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HOMETOWN_DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="hometown_district_code" value="${suspectRelatif.hometown_district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HOMETOWN_SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="hometown_subdistrict_code" value="${suspectRelatif.hometown_subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HOMETOWN_ROAD</strong></td>
		<td>
					<input type="text" name="hometown_road" value="${suspectRelatif.hometown_road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HOMETOWN_SOI</strong></td>
		<td>
					<input type="text" name="hometown_soi" value="${suspectRelatif.hometown_soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HOMETOWN_MOO</strong></td>
		<td>
					<input type="text" name="hometown_moo" value="${suspectRelatif.hometown_moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>HOMETOWN_ADDRESS_NO</strong></td>
		<td>
					<input type="text" name="hometown_address_no" value="${suspectRelatif.hometown_address_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CURRENT_POST_CODE</strong></td>
		<td>
					<input type="text" name="current_post_code" value="${suspectRelatif.current_post_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CURRENT_PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="current_province_code" value="${suspectRelatif.current_province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CURRENT_DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="current_district_code" value="${suspectRelatif.current_district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CURRENT_SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="current_subdistrict_code" value="${suspectRelatif.current_subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CURRENT_ROAD</strong></td>
		<td>
					<input type="text" name="current_road" value="${suspectRelatif.current_road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CURRENT_SOI</strong></td>
		<td>
					<input type="text" name="current_soi" value="${suspectRelatif.current_soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CURRENT_MOO</strong></td>
		<td>
					<input type="text" name="current_moo" value="${suspectRelatif.current_moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CURRENT_ADDRESS_NO</strong></td>
		<td>
					<input type="text" name="current_address_no" value="${suspectRelatif.current_address_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>RELATION</strong></td>
		<td>
					<input type="text" name="relation" value="${suspectRelatif.relation}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAST_NAME</strong></td>
		<td>
					<input type="text" name="last_name" value="${suspectRelatif.last_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FIRST_NAME</strong></td>
		<td>
					<input type="text" name="first_name" value="${suspectRelatif.first_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TITLE_CODE</strong></td>
		<td>
					<input type="text" name="title_code" value="${suspectRelatif.title_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUSPECT_NO</strong></td>
		<td>
					<input type="text" name="suspect_no" value="${suspectRelatif.suspect_no}"/>
				</td>
	</tr>
	</table>