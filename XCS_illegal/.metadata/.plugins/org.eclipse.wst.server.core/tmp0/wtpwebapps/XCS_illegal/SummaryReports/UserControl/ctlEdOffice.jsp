<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>

<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<table width="700" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td align="right" width="20%" height="30px">ภาค :&nbsp;</td>
		<td align="left" width="80%">
			<select id="sector_code" name="sector_code" style="width: 325px" onchange="getArea('area',this.value),getBranch('branch',this.value)">
			</select>
		</td>
	</tr>
	<tr>
		<td align="right" height="25px">พื้นที่:&nbsp;</td>
		<td>  
			<select id="area" name="area" style="width: 325px" onchange="getBranch('branch',this.value)"></select>
	    </td>
	</tr>
	<tr>
		<td align="right" height="25px"> พื้นที่/สาขา:&nbsp;</td>
		<td>
			<select id="branch" name="branch" style="width: 325px"/></select>
	     		</td>
	</tr>
</table>
<script>
getSector('sector_code');
getArea('area','');
getBranch('branch','');
</script>