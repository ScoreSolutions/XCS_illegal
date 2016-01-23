








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${suppressTargetItem.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${suppressTargetItem.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${suppressTargetItem.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${suppressTargetItem.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${suppressTargetItem.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_09</strong></td>
		<td>
					<input type="text" name="fine_09" value="${suppressTargetItem.fine_09}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_09</strong></td>
		<td>
					<input type="text" name="qty_09" value="${suppressTargetItem.qty_09}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_08</strong></td>
		<td>
					<input type="text" name="fine_08" value="${suppressTargetItem.fine_08}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_08</strong></td>
		<td>
					<input type="text" name="qty_08" value="${suppressTargetItem.qty_08}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_07</strong></td>
		<td>
					<input type="text" name="fine_07" value="${suppressTargetItem.fine_07}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_07</strong></td>
		<td>
					<input type="text" name="qty_07" value="${suppressTargetItem.qty_07}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_06</strong></td>
		<td>
					<input type="text" name="fine_06" value="${suppressTargetItem.fine_06}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_06</strong></td>
		<td>
					<input type="text" name="qty_06" value="${suppressTargetItem.qty_06}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_05</strong></td>
		<td>
					<input type="text" name="fine_05" value="${suppressTargetItem.fine_05}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_05</strong></td>
		<td>
					<input type="text" name="qty_05" value="${suppressTargetItem.qty_05}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_04</strong></td>
		<td>
					<input type="text" name="fine_04" value="${suppressTargetItem.fine_04}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_04</strong></td>
		<td>
					<input type="text" name="qty_04" value="${suppressTargetItem.qty_04}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_03</strong></td>
		<td>
					<input type="text" name="fine_03" value="${suppressTargetItem.fine_03}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_03</strong></td>
		<td>
					<input type="text" name="qty_03" value="${suppressTargetItem.qty_03}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_02</strong></td>
		<td>
					<input type="text" name="fine_02" value="${suppressTargetItem.fine_02}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_02</strong></td>
		<td>
					<input type="text" name="qty_02" value="${suppressTargetItem.qty_02}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_01</strong></td>
		<td>
					<input type="text" name="fine_01" value="${suppressTargetItem.fine_01}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_01</strong></td>
		<td>
					<input type="text" name="qty_01" value="${suppressTargetItem.qty_01}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_12</strong></td>
		<td>
					<input type="text" name="fine_12" value="${suppressTargetItem.fine_12}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_12</strong></td>
		<td>
					<input type="text" name="qty_12" value="${suppressTargetItem.qty_12}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_11</strong></td>
		<td>
					<input type="text" name="fine_11" value="${suppressTargetItem.fine_11}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_11</strong></td>
		<td>
					<input type="text" name="qty_11" value="${suppressTargetItem.qty_11}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>FINE_10</strong></td>
		<td>
					<input type="text" name="fine_10" value="${suppressTargetItem.fine_10}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>QTY_10</strong></td>
		<td>
					<input type="text" name="qty_10" value="${suppressTargetItem.qty_10}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TARGET_TYPE</strong></td>
		<td>
					<input type="text" name="target_type" value="${suppressTargetItem.target_type}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUPPRESS_TARGET_ID</strong></td>
		<td>
					<input type="text" name="suppress_target_id" value="${suppressTargetItem.suppress_target_id}"/>
				</td>
	</tr>
	</table>