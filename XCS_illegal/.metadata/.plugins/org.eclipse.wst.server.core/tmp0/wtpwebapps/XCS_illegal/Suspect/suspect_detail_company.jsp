
<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.ko.util.js.JsInfoGenerator"%>

<%
	String suspectNo_sdc = request.getParameter("suspect_no");
	JsInfoGenerator js = new JsInfoGenerator();
	String command = js.getTraderSuspectCommand(suspectNo_sdc);
%>

<script>
	jQuery(document).ready(function(){
		eval("<%=command%>");
	});
</script>

<table width="800" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
	<tr>
	  <td><table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">
		  <tr>
			<td height="10">&nbsp;</td>
			<td align="left" valign="top">&nbsp;</td>
			<td>&nbsp;</td>
		  </tr>
		  <tr>
			<td height="10">&nbsp;</td>
			<td align="left" valign="top"><span class="sectionname" id="company_name">บริษัท ภาคกลางค้าปลีก จำกัด</span></td>
			<td>&nbsp;</td>
		  </tr>
		  <tr>
			<td height="10">&nbsp;</td>
			<td align="left" valign="top">&nbsp;</td>
			<td>&nbsp;</td>
		  </tr>
		  <tr>
			<td height="10">&nbsp;</td>
			<td align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
			  <tr>
				<td width="20%" align="right" valign="top"><img src="RenderImage?suspect_no=<%=suspectNo_sdc%>&type=COMPANY" width="100" height="100"></td>
				<td width="80%" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
					  <td width="23%" height="25" align="right">เลขทะเบียนนิติบุคคล  :&nbsp;</td>
					  <td width="77%"><strong  id="corporation_code">123456789&nbsp;&nbsp;&nbsp;&nbsp;</strong>&nbsp;เลขทะเบียนสรรพสามิต :&nbsp;<strong id="excise_reg_no">987654321</strong></td>
					</tr>
					<tr>
					  <td height="25" align="right">เลขที่ใบอนุญาต&nbsp;:&nbsp;</td>
					  <td><strong id="license_no">2552-00042-5 [14/02/2552 - 31/12/2552]</strong></td>
					</tr>
					<tr>
					  <td width="23%" height="25" align="right">ชื่อ - นามสกุลผู้แทน :&nbsp;</td>
					  <td width="77%"><strong id="agent">สุชาติ เหมือนแก้ววาวใส</strong></td>
					</tr>
					
					<tr>
					  <td height="25" align="right">สถานที่ตั้ง&nbsp;:&nbsp; </td>
					  <td><strong id="address">29/1 ถนนสามชุก&nbsp;&nbsp;ตำบลบ้านลาด&nbsp;อำเภอพรหมคีรี&nbsp;จังหวัดอ่างทอง</strong></td>
					</tr>
					<tr>
					  <td height="25" align="right">โทรศัพท์&nbsp;:&nbsp;</td>
					  <td><strong id="tel">033456729</strong></td>
					</tr>
				</table></td>
			  </tr>
			</table></td>
			<td>&nbsp;</td>
		  </tr>
		  
		  <tr>
			<td align="left" valign="bottom" height="10"></td>
			<td></td>
			<td align="right" valign="bottom"></td>
		  </tr>
	  </table></td>
	</tr>
</table>
