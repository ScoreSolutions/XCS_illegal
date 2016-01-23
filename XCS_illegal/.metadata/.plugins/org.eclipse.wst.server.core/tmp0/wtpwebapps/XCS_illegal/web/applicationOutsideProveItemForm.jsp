








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationOutsideProveItem.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>ISDOMESTIC</strong></td>
		<td>
					<input type="text" name="isdomestic" value="${applicationOutsideProveItem.isdomestic}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationOutsideProveItem.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationOutsideProveItem.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationOutsideProveItem.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationOutsideProveItem.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REMARKS</strong></td>
		<td>
					<input type="text" name="remarks" value="${applicationOutsideProveItem.remarks}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DESCRIPTION</strong></td>
		<td>
					<input type="text" name="description" value="${applicationOutsideProveItem.description}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UNIT_NETWEIGHT</strong></td>
		<td>
					<input type="text" name="unit_netweight" value="${applicationOutsideProveItem.unit_netweight}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>NETWEIGHT</strong></td>
		<td>
					<input type="text" name="netweight" value="${applicationOutsideProveItem.netweight}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UNIT_SIZE</strong></td>
		<td>
					<input type="text" name="unit_size" value="${applicationOutsideProveItem.unit_size}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SIZES_CODE</strong></td>
		<td>
					<input type="text" name="sizes_code" value="${applicationOutsideProveItem.sizes_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UNIT_QTY</strong></td>
		<td>
					<input type="text" name="unit_qty" value="${applicationOutsideProveItem.unit_qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY</strong></td>
		<td>
					<input type="text" name="qty" value="${applicationOutsideProveItem.qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_NAME</strong></td>
		<td>
					<input type="text" name="brand_name" value="${applicationOutsideProveItem.brand_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>BRAND_CODE</strong></td>
		<td>
					<input type="text" name="brand_code" value="${applicationOutsideProveItem.brand_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_NAME</strong></td>
		<td>
					<input type="text" name="product_name" value="${applicationOutsideProveItem.product_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_CODE</strong></td>
		<td>
					<input type="text" name="product_code" value="${applicationOutsideProveItem.product_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>APPLICATION_OUTSIDE_PROVE_ID</strong></td>
		<td>
					<input type="text" name="application_outside_prove_id" value="${applicationOutsideProveItem.application_outside_prove_id}"/>
				</td>
	</tr>
	</table>