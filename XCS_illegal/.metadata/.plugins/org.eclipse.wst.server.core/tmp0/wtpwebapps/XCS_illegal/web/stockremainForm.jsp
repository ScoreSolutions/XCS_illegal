








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${stockremain.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>STOCKIN_QTY</strong></td>
		<td>
					<input type="text" name="stockin_qty" value="${stockremain.stockin_qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ISDOMESTIC</strong></td>
		<td>
					<input type="text" name="isdomestic" value="${stockremain.isdomestic}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STOCKOUT_ID</strong></td>
		<td>
					<input type="text" name="stockout_id" value="${stockremain.stockout_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SIZES_UNIT_CODE</strong></td>
		<td>
					<input type="text" name="sizes_unit_code" value="${stockremain.sizes_unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SIZES_CODE</strong></td>
		<td>
					<input type="text" name="sizes_code" value="${stockremain.sizes_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DELIVERY_EXHIBIT_ID</strong></td>
		<td>
					<input type="text" name="delivery_exhibit_id" value="${stockremain.delivery_exhibit_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${stockremain.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${stockremain.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${stockremain.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${stockremain.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UNIT_CODE</strong></td>
		<td>
					<input type="text" name="unit_code" value="${stockremain.unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY</strong></td>
		<td>
					<input type="text" name="qty" value="${stockremain.qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_CODE</strong></td>
		<td>
					<input type="text" name="brand_code" value="${stockremain.brand_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_CODE</strong></td>
		<td>
					<input type="text" name="product_code" value="${stockremain.product_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${stockremain.legislation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE</strong></td>
		<td>
					<input type="text" name="offcode" value="${stockremain.offcode}"/>
				</td>
	</tr>
	</table>