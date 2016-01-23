<%@ page contentType="text/html; charset=UTF-8" %>
<%@page import="com.ko.util.js.JsInfoGenerator"%>

<%
	String suspectNo_sdt = request.getParameter("suspect_no");
	JsInfoGenerator js = new JsInfoGenerator();
	String command = js.getThaiSuspectCommand(suspectNo_sdt);
%>

<script>
	jQuery(document).ready(function(){
		eval("<%=command%>");
	});
</script>


<table width="700" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
<tr>
  <td><table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">
	  <tr>
		<td height="10">&nbsp;</td>
		<td align="left" valign="top">&nbsp;</td>
		<td>&nbsp;</td>
	  </tr>
	  <tr>
		<td>&nbsp;</td>
		<td align="left" valign="top"><span class="sectionname" id="full_name">นายสมบัติ เก่งกระจาน</span></td>
		<td>&nbsp;</td>
	  </tr>
	  <tr>
		<td>&nbsp;</td>
		<td align="left" valign="top">&nbsp;</td>
		<td>&nbsp;</td>
	  </tr>
	  <tr>
		<td>&nbsp;</td>
		<td align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td width="20%" align="right" valign="top"><img src="RenderImage?suspect_no=<%=suspectNo_sdt%>" width="100" height="100"></td>
			  <td width="80%" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td width="23%" height="25" align="right">เลขที่บัตร ปปช :&nbsp;</td>
					<td width="77%"><strong id="suspect_id_card">3199900044328</strong></td>
				  </tr>
				  <tr>
					<td width="23%" height="25" align="right">ชื่ออื่นๆ :&nbsp;</td>
					<td width="77%"><strong id="other_name">เฮียโก๋&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong >เพศ :&nbsp;<strong id="sex">ชาย&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong>วันเดือนปีเกิด :&nbsp;<strong id="birth_date">11/12/2505&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong>อายุ <strong id="age">47</strong> ปี<strong></strong></td>
				  </tr>
				  <tr>
					<td height="25" align="right">มือถือ&nbsp;:&nbsp;</td>
					<td><strong id="mobile">0897766654</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;email :&nbsp;<strong id="email">yaho@hotmail.com</strong></td>
				  </tr>
				  <tr>
					<td height="25" align="right">เชื้อชาติ :&nbsp;</td>
					<td><strong id="race_name">ไทย&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong>สัญชาติ :<strong id="nation_name">&nbsp;ไทย&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong>กรุ๊ปเลือด :&nbsp;&nbsp;<strong id="blood_type">เอบี</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;สถานภาพ :<strong id="marital_status">&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;</strong>&nbsp;ศาสนา :&nbsp;<strong id="religion_name">พุทธ</strong></td>
				  </tr>
				  <tr>
					<td height="25" align="right">ที่อยู่ตามภูมิลำเนา&nbsp;:&nbsp; </td>
					<td><strong id="address">9 ซอยชัยสาย78 ถนนชุมสาย&nbsp;&nbsp;ตำบล&nbsp;อาจหาญ&nbsp;&nbsp;
						อำเภอ ชุมพิทักษ&nbsp;&nbsp;จังหวัด&nbsp;นครราชสีมา</strong></td>
				  </tr>
				  <tr>
					<td height="25" align="right">รายละเอียดเพิ่มเติม&nbsp;:&nbsp;</td>
					<td><strong id="description">รูปร่างสูงโปร่ง ผิวสองสี มีอาการหวาดระแวงสิ่งรอบข้างมากกว่าปกต</strong> </td>
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