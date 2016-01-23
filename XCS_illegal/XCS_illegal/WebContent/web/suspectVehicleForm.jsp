








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suspectVehicle.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectVehicle.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${suspectVehicle.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${suspectVehicle.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${suspectVehicle.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DESCRIPTION</strong></td>
		<td>
					<input type="text" name="description" value="${suspectVehicle.description}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAR_COLOR</strong></td>
		<td>
					<input type="text" name="car_color" value="${suspectVehicle.car_color}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAR_MODEL</strong></td>
		<td>
					<input type="text" name="car_model" value="${suspectVehicle.car_model}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_BRAND_CODE</strong></td>
		<td>
					<input type="text" name="brand_brand_code" value="${suspectVehicle.brand_brand_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_DUTY_CODE</strong></td>
		<td>
					<input type="text" name="brand_duty_code" value="${suspectVehicle.brand_duty_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAR_NO</strong></td>
		<td>
					<input type="text" name="car_no" value="${suspectVehicle.car_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAR_CATE</strong></td>
		<td>
					<input type="text" name="car_cate" value="${suspectVehicle.car_cate}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCTTYPE_TYPE_CODE</strong></td>
		<td>
					<input type="text" name="producttype_type_code" value="${suspectVehicle.producttype_type_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCTTYPE_DUTY_CODE</strong></td>
		<td>
					<input type="text" name="producttype_duty_code" value="${suspectVehicle.producttype_duty_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="province_code" value="${suspectVehicle.province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUSPECT_INVESTIGATE_ID</strong></td>
		<td>
					<input type="text" name="suspect_investigate_id" value="${suspectVehicle.suspect_investigate_id}"/>
				</td>
	</tr>
	</table>