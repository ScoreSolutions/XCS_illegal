








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${deliveryExhibitItem.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>NETWEIGHT_UNIT</strong></td>
		<td>
					<input type="text" name="netweight_unit" value="${deliveryExhibitItem.netweight_unit}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NETWEIGHT</strong></td>
		<td>
					<input type="text" name="netweight" value="${deliveryExhibitItem.netweight}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SIZES_UNIT_CODE</strong></td>
		<td>
					<input type="text" name="sizes_unit_code" value="${deliveryExhibitItem.sizes_unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SIZES_CODE</strong></td>
		<td>
					<input type="text" name="sizes_code" value="${deliveryExhibitItem.sizes_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${deliveryExhibitItem.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVE_QTY</strong></td>
		<td>
					<input type="text" name="prove_qty" value="${deliveryExhibitItem.prove_qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_OUTSIDE_PROVE_ITEM</strong></td>
		<td>
					<input type="text" name="application_outside_prove_item" value="${deliveryExhibitItem.application_outside_prove_item}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${deliveryExhibitItem.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${deliveryExhibitItem.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${deliveryExhibitItem.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${deliveryExhibitItem.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UNIT_CODE</strong></td>
		<td>
					<input type="text" name="unit_code" value="${deliveryExhibitItem.unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY</strong></td>
		<td>
					<input type="text" name="qty" value="${deliveryExhibitItem.qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_CODE</strong></td>
		<td>
					<input type="text" name="brand_code" value="${deliveryExhibitItem.brand_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_CODE</strong></td>
		<td>
					<input type="text" name="product_code" value="${deliveryExhibitItem.product_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APP_ARREST_PROVE_EXHIBIT_ID</strong></td>
		<td>
					<input type="text" name="app_arrest_prove_exhibit_id" value="${deliveryExhibitItem.app_arrest_prove_exhibit_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DELIVERY_EXHIBIT_ID</strong></td>
		<td>
					<input type="text" name="delivery_exhibit_id" value="${deliveryExhibitItem.delivery_exhibit_id}"/>
				</td>
	</tr>
	</table>