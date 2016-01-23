<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<base target="_self" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>

<META NAME="Generator" CONTENT="EditPlus">

<script type="text/javascript">
var opener = window.dialogArguments;
function sendvalue(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26){

		opener.data[1]= p1;
		opener.data[2]=	p2;
		opener.data[3]= p3;
		opener.data[4]=	p4;
		opener.data[5]=	p5;
		opener.data[6]=	p6;
		opener.data[7]=	p7;
		opener.data[8] = p8;
		opener.data[9]=	p9;
		opener.data[10]= p10;
		opener.data[11]= p11;
		opener.data[12]= p12;
		opener.data[13]= p13;
		opener.data[14]= p14;
		opener.data[15]= p15;
		opener.data[16]= p16;
		opener.data[17]= p17;
		opener.data[18]= p18;
		opener.data[19]= p19;
		opener.data[20]= p20;
		opener.data[21]= p21;
		opener.data[22]= p22;
		opener.data[23]= p23;
		opener.data[24]= p24;
		opener.data[25]= p25;
		opener.data[26]= p26;



	opener.focus();
	self.close();
}
</script>


</HEAD>

<BODY>
<form id='dataform' action="process?action=Case_pop&cmd=list" method="post" name="dataform">

<TABLE border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td width="20px">&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td ><span class="websitename" >เลือกของกลางจากคดี</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td colspan="2">
			<input name="btnBack"  type="button" class="barbutton" value="กลับ" />
               <input name="btnClear"  type="button" class="barbutton" value="ไม่เลือก" />
               <input type="hidden" id="legislation_id" name="legislation_id" value="${legislation_id}" ></input>
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>
			<TABLE border="0" cellpadding="0" cellspacing="0">
				<TR >
					<TD colspan="4">&nbsp;</TD>
				</TR>
				<TR>
					<TD align="right">เลขคดี :&nbsp;</TD>
					<TD><input type="text" name="textfield" class="textbox" size="15">
					&nbsp;&nbsp;-&nbsp;&nbsp;
					<input type="text" name="textfield" class="textbox" size="15"></TD>
				</TR>
				<TR>
					<TD align="right">วันที่รับคดี :&nbsp;</TD>
				<td >
			<input name="date_start" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('date_start','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absMiddle" border="0" /></a>
			&nbsp;&nbsp;&nbsp;&nbsp;
               ถึง :&nbsp;
			<input name="date_end" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('date_end','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absMiddle" border="0" /></a>
		</td>
				</TR>
				<TR>
					<TD align="right">พ.ร.บ. :&nbsp;</TD>
					<TD colspan="3">
						<input name="txtLegislation" type="text" class="textview" size="40" value="${legislation_name}" />
					</TD>
				</TR>
				<TR>
					<TD>&nbsp;</TD>
					<TD colspan="3"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"></TD>
				</TR>
				<TR >
					<TD colspan="4">&nbsp;</TD>
				</TR>
			</TABLE>
			</form>
			<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                     <tr  align="left" valign="top">
<td colspan="4"><%=pageUtil.getPagination()%></td>
<td colspan="3" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>

                      <tr class="TblHeaderColumn aligncenter">
						<td width="5%" >ลำดับที่</td>
						<td width="10%" >เลขที่คดี</td>
						<td width="10%" >วันที่รับคดี</td>
						<td width="20%" >พ.ร.บ.</td>
						<td width="35%" >ชื่อสินค้าของกลาง</td>
						<td width="10%" >ขนาด</td>
						<td width="10%" >จำนวน</td>
				  </tr>

				 <c:forEach items="${aae_list}"  var="aae" varStatus="i">
	  		<c:if test="${(i.count % 2) == 1}">
	  			<tr>
					<td class="TblRow aligncenter">${i.count+_rowIndex}</td>
					<td class="TblRow AlignLeft"><a href="#"
					onClick = "window.dialogArguments.document.formdata1.sizesshow1.value='${aae.sizes}';
					window.dialogArguments.document.formdata1.qtyshow1.value='${aae.qtyshow}';
					window.dialogArguments.document.formdata1.track_no_co1.value='${aae.case_id}';
					sendvalue('${aae.isexhibitco}',
					'${aae.duty_code}',
					'${aae.duty_name}',
					'${aae.product_code}',
					'${aae.product_name}',
					'${aae.brand_code}',
					'${aae.brand_name}',
					'${aae.isdomestic}',
					'${aae.sizes_code}',
					'${aae.size_unit_code}',

					'${aae.qty}',
					'${aae.qty_unit_code}',
					'${aae.netweight}',
					'${aae.netweight_unit_code}',
					'${aae.status}',
					'${aae.exhibit_list}',
					'${aae.exhibit_desc}',
					'${aae.car_no}',
					'${aae.remarks}',
					'${aae.id}',

					'${aae.size_desc}',
					'${aae.size_unit_name}',
					'${aae.qty_unit_name}',
					'${aae.netweight_unit_name}',
					'${aae.case_id}',
					'${aae.id}');">
					${aae.case_id}</a></td>
					<td class="TblRow aligncenter">${aae.case_date2}</td>
					<td class="TblRow aligncenter">${aae.legislation_name}</td>
					<td class="TblRow aligncenter">${aae.product_name_show}</td>
					<td class="TblRow aligncenter">${aae.sizes}</td>
					<td class="TblRow aligncenter">${aae.qty}</td>

	  			</tr>
	  		</c:if>
			<c:if test="${(i.count % 2) == 0}">
	  			<tr class="TblRow AlignLeft bgRowGray">
					<td class="TblRow aligncenter">${i.count+_rowIndex}</td>
					<td height="25" align="left" valign="top" class="TblRow AlignLeft">
					<a href="#" onClick ="window.dialogArguments.document.formdata1.sizesshow1.value='${aae.sizes}';
					window.dialogArguments.document.formdata1.qtyshow1.value='${aae.qtyshow}';
					window.dialogArguments.document.formdata1.track_no_co1.value='${aae.case_id}';
					sendvalue('${aae.isexhibitco}'
						,'${aae.duty_code}'
						,'${aae.duty_name}'
						,'${aae.product_code}'
						,'${aae.product_name}'
						,'${aae.brand_code}'
						,'${aae.brand_name}'
						,'${aae.isdomestic}'
						,'${aae.sizes_code}'
						,'${aae.size_unit_code}'
						,'${aae.qty}'
						,'${aae.qty_unit_code}'
						,'${aae.netweight}'
						,'${aae.netweight_unit_code}'
						,'${aae.status}'
						,'${aae.exhibit_list}'
						,'${aae.exhibit_desc}'
						,'${aae.car_no}'
						,'${aae.remarks}'
						,'${aae.id}'
						,'${aae.size_desc}'
						,'${aae.size_unit_name}'
						,'${aae.qty_unit_name}'
						,'${aae.netweight_unit_name}'
						,'${aae.case_id}'
						,'${aae.id}')">${aae.case_id}</a></td>
					<td class="TblRow aligncenter">${aae.case_date2}</td>
					<td class="TblRow aligncenter">${aae.legislation_name}</td>
					<td class="TblRow aligncenter">${aae.product_name_show}</td>
					<td class="TblRow aligncenter">${aae.sizes}</td>
					<td class="TblRow aligncenter">${aae.qty}</td>
	  			</tr>
	  		</c:if>
		</c:forEach>
			</table>
		</td>
	</tr>
</table>

</BODY>
</HTML>
