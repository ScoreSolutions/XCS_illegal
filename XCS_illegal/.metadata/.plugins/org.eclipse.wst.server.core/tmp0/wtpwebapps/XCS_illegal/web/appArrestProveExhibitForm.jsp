








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${appArrestProveExhibit.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${appArrestProveExhibit.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${appArrestProveExhibit.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${appArrestProveExhibit.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${appArrestProveExhibit.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${appArrestProveExhibit.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APP_ARREST_PROVE_EXHIBIT_ID</strong></td>
		<td>
					<input type="text" name="app_arrest_prove_exhibit_id" value="${appArrestProveExhibit.app_arrest_prove_exhibit_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CAR_NO</strong></td>
		<td>
					<input type="text" name="car_no" value="${appArrestProveExhibit.car_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EXHIBIT_DESC</strong></td>
		<td>
					<input type="text" name="exhibit_desc" value="${appArrestProveExhibit.exhibit_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>EXHIBIT_LIST</strong></td>
		<td>
					<input type="text" name="exhibit_list" value="${appArrestProveExhibit.exhibit_list}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STATUS</strong></td>
		<td>
					<input type="text" name="status" value="${appArrestProveExhibit.status}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NETWEIGHT_UNIT_CODE</strong></td>
		<td>
					<input type="text" name="netweight_unit_code" value="${appArrestProveExhibit.netweight_unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NETWEIGHT</strong></td>
		<td>
					<input type="text" name="netweight" value="${appArrestProveExhibit.netweight}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_UNIT_CODE</strong></td>
		<td>
					<input type="text" name="qty_unit_code" value="${appArrestProveExhibit.qty_unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY</strong></td>
		<td>
					<input type="text" name="qty" value="${appArrestProveExhibit.qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SIZE_UNIT_CODE</strong></td>
		<td>
					<input type="text" name="size_unit_code" value="${appArrestProveExhibit.size_unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SIZES_CODE</strong></td>
		<td>
					<input type="text" name="sizes_code" value="${appArrestProveExhibit.sizes_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISDOMESTIC</strong></td>
		<td>
					<input type="text" name="isdomestic" value="${appArrestProveExhibit.isdomestic}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_CODE</strong></td>
		<td>
					<input type="text" name="brand_code" value="${appArrestProveExhibit.brand_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_CODE</strong></td>
		<td>
					<input type="text" name="product_code" value="${appArrestProveExhibit.product_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DUTY_CODE</strong></td>
		<td>
					<input type="text" name="duty_code" value="${appArrestProveExhibit.duty_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${appArrestProveExhibit.track_no}"/>
				</td>
	</tr>
	</table>