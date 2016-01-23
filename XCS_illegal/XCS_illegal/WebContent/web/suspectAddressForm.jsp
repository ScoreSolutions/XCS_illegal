








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectAddress.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_Y</strong></td>
		<td>
					<input type="text" name="coordinate_y" value="${suspectAddress.coordinate_y}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_X</strong></td>
		<td>
					<input type="text" name="coordinate_x" value="${suspectAddress.coordinate_x}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DESCRIPTION</strong></td>
		<td>
					<input type="text" name="description" value="${suspectAddress.description}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FAX_NO</strong></td>
		<td>
					<input type="text" name="fax_no" value="${suspectAddress.fax_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TEL_NO</strong></td>
		<td>
					<input type="text" name="tel_no" value="${suspectAddress.tel_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ZIPCODE</strong></td>
		<td>
					<input type="text" name="zipcode" value="${suspectAddress.zipcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="province_code" value="${suspectAddress.province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="district_code" value="${suspectAddress.district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="subdistrict_code" value="${suspectAddress.subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOO</strong></td>
		<td>
					<input type="text" name="moo" value="${suspectAddress.moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROAD</strong></td>
		<td>
					<input type="text" name="road" value="${suspectAddress.road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SOI</strong></td>
		<td>
					<input type="text" name="soi" value="${suspectAddress.soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NAME</strong></td>
		<td>
					<input type="text" name="address_name" value="${suspectAddress.address_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS</strong></td>
		<td>
					<input type="text" name="address" value="${suspectAddress.address}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUSPECT_NO</strong></td>
		<td>
					<input type="text" name="suspect_no" value="${suspectAddress.suspect_no}"/>
				</td>
	</tr>
	</table>