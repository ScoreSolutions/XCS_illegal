<%@ page contentType="text/html; charset=Tis-620" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@include file="/Templates/meta.jsp" %>
<HEAD>

<title>รายชื่อสายตรวจ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
</HEAD>

<BODY>
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >รายชื่อสายตรวจ</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barbutton" value="บันทึก" >
			<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" >
			<input name="btnBack"  type="button" class="barbutton" value="กลับ" >
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td width="30%" align="right">รหัสสายตรวจ : </td>
		<td width="70%">
			<input name="textfield12" type="text" class="text" readonly size="45">
		</td>
	</tr>
	<tr>
		<td align="right">ชื่อสายตรวจ : </td>
		<td >
			<input name="textfield12" type="text" class="text" readonly size="20">
			นามสกุล :&nbsp;&nbsp;&nbsp;<input name="textfield12" type="text" class="text" readonly size="25">
		</td>
	</tr>
	<tr>
		<td align="right">&nbsp;</td>
		<td >
			<img src="../images/btn_search_big.png" width="64" height="22">
		</td>
	</tr>
</table>
<br />
<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
	  <tr>
			<td width="10%" class="TblHeaderColumn aligncenter">ลำดับที่</td>
			<td width="10%" class="TblHeaderColumn aligncenter"><input name="chkAll" type="checkbox"  /></td>
			<td width="20%" class="TblHeaderColumn">รหัสพนักงาน</td>
			<td width="35%" class="TblHeaderColumn">ชื่อ-สกุล</td>
			<td width="25%" class="TblHeaderColumn">ตำแหน่ง</td>
	  </tr>
	  <tr>
			<td class="TblRow aligncenter">1</td>
			<td class="TblRow aligncenter"><input name="chk1" type="checkbox" checked  /></td>
			<td height="25" align="left" valign="top" class="TblRow AlignLeft">000001</td>
			<td align="left" valign="top" class="TblRow AlignLeft">	<span class="TblRow AlignLeft"> นายสุดใจ คนทัตย</span></td>
			<td align="left" valign="top" class="TblRow AlignLeft">	<span class="TblRow AlignLeft">เจ้าหน้าที่ตรวจ สรรพสามิต6</span></td>
	  </tr>
	  <tr>
			<td class="TblRow aligncenter bgRowGray">2</td>
			<td class="TblRow aligncenter bgRowGray"><input name="chk1" type="checkbox" checked  /></td>
			<td height="25" class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft">000002</span></td>
			<td class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft"> นายสุรพร ศุกรสุนทร  </span></td>
			<td align="left" valign="top" class="TblRow AlignLeft bgRowGray">	<span class="TblRow AlignLeft">นายตรวจสรรพสามิต 5 </span></td>
	  </tr>
</table>
</BODY>
</HTML>
