








 

<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>
<table><tr><td><font color="red"><%=formHandler.getFormMessage()%></font></td></tr></table>
<table border="1">
	<tr>
		<td>ID</td>
		<td>${applicationInvest.id}</td>
	</tr>
	<tr>
		<td width="172"><strong>NEWS_VALUE</strong></td>
		<td>
					<input type="text" name="news_value" value="${applicationInvest.news_value}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CONFIDENCE_GAUGE</strong></td>
		<td>
					<input type="text" name="confidence_gauge" value="${applicationInvest.confidence_gauge}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_ON</strong></td>
		<td>
					<input id="update_on" name="update_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationInvest.update_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('update_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>UPDATE_BY</strong></td>
		<td>
					<input type="text" name="update_by" value="${applicationInvest.update_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_ON</strong></td>
		<td>
					<input id="create_on" name="create_on" type="text" class="textdate" value="<fmt:formatDate value="${applicationInvest.create_on}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('create_on','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>CREATE_BY</strong></td>
		<td>
					<input type="text" name="create_by" value="${applicationInvest.create_by}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INVEST_DESC</strong></td>
		<td>
					<input type="text" name="invest_desc" value="${applicationInvest.invest_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SUBDISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="subdistrict_code" value="${applicationInvest.subdistrict_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MAP_DESC</strong></td>
		<td>
					<input type="text" name="map_desc" value="${applicationInvest.map_desc}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MAP_PICTURE</strong></td>
		<td>
					<input type="file" name="map_picture" value=""/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TEL</strong></td>
		<td>
					<input type="text" name="tel" value="${applicationInvest.tel}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ZIPCODE</strong></td>
		<td>
					<input type="text" name="zipcode" value="${applicationInvest.zipcode}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>DISTRICT_CODE</strong></td>
		<td>
					<input type="text" name="district_code" value="${applicationInvest.district_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PROVINCE_CODE</strong></td>
		<td>
					<input type="text" name="province_code" value="${applicationInvest.province_code}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ROAD</strong></td>
		<td>
					<input type="text" name="road" value="${applicationInvest.road}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>SOI</strong></td>
		<td>
					<input type="text" name="soi" value="${applicationInvest.soi}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>MOO</strong></td>
		<td>
					<input type="text" name="moo" value="${applicationInvest.moo}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NO</strong></td>
		<td>
					<input type="text" name="address_no" value="${applicationInvest.address_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>ADDRESS_NAME</strong></td>
		<td>
					<input type="text" name="address_name" value="${applicationInvest.address_name}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_Y</strong></td>
		<td>
					<input type="text" name="coordinate_y" value="${applicationInvest.coordinate_y}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>COORDINATE_X</strong></td>
		<td>
					<input type="text" name="coordinate_x" value="${applicationInvest.coordinate_x}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>END_DATE</strong></td>
		<td>
					<input id="end_date" name="end_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationInvest.end_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('end_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>START_DATE</strong></td>
		<td>
					<input id="start_date" name="start_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationInvest.start_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('start_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>PRODUCT_GROUP_ID</strong></td>
		<td>
					<input type="text" name="product_group_id" value="${applicationInvest.product_group_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>LEGISLATION_ID</strong></td>
		<td>
					<input type="text" name="legislation_id" value="${applicationInvest.legislation_id}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_COMMAND</strong></td>
		<td>
					<input type="text" name="offcode_command" value="${applicationInvest.offcode_command}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_COMMAND</strong></td>
		<td>
					<input type="text" name="poscode_command" value="${applicationInvest.poscode_command}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_IDCARDNO_COMMAND</strong></td>
		<td>
					<input type="text" name="staff_idcardno_command" value="${applicationInvest.staff_idcardno_command}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>OFFCODE_INVEST</strong></td>
		<td>
					<input type="text" name="offcode_invest" value="${applicationInvest.offcode_invest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>POSCODE_INVEST</strong></td>
		<td>
					<input type="text" name="poscode_invest" value="${applicationInvest.poscode_invest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>STAFF_IDCARDNO_INVEST</strong></td>
		<td>
					<input type="text" name="staff_idcardno_invest" value="${applicationInvest.staff_idcardno_invest}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INVEST_NO</strong></td>
		<td>
					<input type="text" name="invest_no" value="${applicationInvest.invest_no}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>REPORT_DATE</strong></td>
		<td>
					<input id="report_date" name="report_date" type="text" class="textdate" value="<fmt:formatDate value="${applicationInvest.report_date}" pattern="dd/MM/yyyy"/>" size="10" maxlength="10" />
            <a href="javascript:NewCssCal('report_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>INVEST_QTY</strong></td>
		<td>
					<input type="text" name="invest_qty" value="${applicationInvest.invest_qty}"/>
				</td>
	</tr>
	<tr>
		<td width="172"><strong>TRACK_NO</strong></td>
		<td>
					<input type="text" name="track_no" value="${applicationInvest.track_no}"/>
				</td>
	</tr>
	</table>