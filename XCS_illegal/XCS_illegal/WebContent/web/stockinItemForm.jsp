








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${stockinItem.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>ISDOMESTIC</strong></td>
		<td>
					<input type="text" name="isdomestic" value="${stockinItem.isdomestic}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NETWEIGHT_UNIT</strong></td>
		<td>
					<input type="text" name="netweight_unit" value="${stockinItem.netweight_unit}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NETWEIGHT</strong></td>
		<td>
					<input type="text" name="netweight" value="${stockinItem.netweight}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SIZES_UNIT_CODE</strong></td>
		<td>
					<input type="text" name="sizes_unit_code" value="${stockinItem.sizes_unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SIZES_CODE</strong></td>
		<td>
					<input type="text" name="sizes_code" value="${stockinItem.sizes_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${stockinItem.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${stockinItem.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${stockinItem.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${stockinItem.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${stockinItem.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UNIT_CODE</strong></td>
		<td>
					<input type="text" name="unit_code" value="${stockinItem.unit_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY</strong></td>
		<td>
					<input type="text" name="qty" value="${stockinItem.qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_CODE</strong></td>
		<td>
					<input type="text" name="brand_code" value="${stockinItem.brand_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_CODE</strong></td>
		<td>
					<input type="text" name="product_code" value="${stockinItem.product_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STOCKIN_ID</strong></td>
		<td>
					<input type="text" name="stockin_id" value="${stockinItem.stockin_id}"/>
				</td>
	</tr>
	</table>