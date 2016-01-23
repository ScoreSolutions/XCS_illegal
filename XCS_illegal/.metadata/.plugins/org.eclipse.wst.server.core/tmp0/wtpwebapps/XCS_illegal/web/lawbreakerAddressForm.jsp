








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${lawbreakerAddress.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>DESCRIPTION</strong></td>
		<td>
					<input type="text" name="description" value="${lawbreakerAddress.description}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FAX_NO</strong></td>
		<td>
					<input type="text" name="fax_no" value="${lawbreakerAddress.fax_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TEL_NO</strong></td>
		<td>
					<input type="text" name="tel_no" value="${lawbreakerAddress.tel_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ZIPCODE</strong></td>
		<td>
					<input type="text" name="zipcode" value="${lawbreakerAddress.zipcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="province_code" value="${lawbreakerAddress.province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DISTRIC_CODE</strong></td>
		<td>
					<input type="text" name="distric_code" value="${lawbreakerAddress.distric_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBDISTRIC_CODE</strong></td>
		<td>
					<input type="text" name="subdistric_code" value="${lawbreakerAddress.subdistric_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOO</strong></td>
		<td>
					<input type="text" name="moo" value="${lawbreakerAddress.moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROAD</strong></td>
		<td>
					<input type="text" name="road" value="${lawbreakerAddress.road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SOI</strong></td>
		<td>
					<input type="text" name="soi" value="${lawbreakerAddress.soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NAME</strong></td>
		<td>
					<input type="text" name="address_name" value="${lawbreakerAddress.address_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS</strong></td>
		<td>
					<input type="text" name="address" value="${lawbreakerAddress.address}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAWBREAKER_NO</strong></td>
		<td>
					<input type="text" name="lawbreaker_no" value="${lawbreakerAddress.lawbreaker_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NO</strong></td>
		<td>
					<input type="text" name="address_no" value="${lawbreakerAddress.address_no}"/>
				</td>
	</tr>
	</table>