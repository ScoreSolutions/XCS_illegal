








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${product.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBTYPE_CODE</strong></td>
		<td>
					<input type="text" name="subtype_code" value="${product.subtype_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LAW_DUTY_CODE</strong></td>
		<td>
					<input type="text" name="law_duty_code" value="${product.law_duty_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRC_PARAM</strong></td>
		<td>
					<input type="text" name="prc_param" value="${product.prc_param}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${product.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${product.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${product.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${product.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCTTYPE_ID</strong></td>
		<td>
					<input type="text" name="producttype_id" value="${product.producttype_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_NAME</strong></td>
		<td>
					<input type="text" name="product_name" value="${product.product_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_CODE</strong></td>
		<td>
					<input type="text" name="product_code" value="${product.product_code}"/>
				</td>
	</tr>
	</table>