<%@ page contentType="text/html; charset=Tis-620" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>

<title>����������зӼԴ : �к��ҹ����зӼԴ��������þ���Ե �����þ���Ե</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" language="JavaScript" src="../script/jquery.js" ></script>
<script type="text/javascript" language="JavaScript" src="../script/effect.js" ></script>
<script type="text/javascript" language="JavaScript" src="../script/service.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/JScript.js" ></script>
<%
	String path = com.ko.util.FormUtility.getScriptReferencePath(request);
%>

<script>
	// gjgbLXMVEJZMAmdCkUQxxQTPMbBGusqMrVZdsdBEucxTuMHYcUvaaBDvCrMGmsJP
	function appendRow(){
		var data = [];
		var tel_no,address_no,address_name,province_text,district_text,subdistrict_text,moo;
		
		//data["index"] = 1;
		data["tel_no"] = jQuery("[name=tel_no]").val();
		data["fax_no"]  = jQuery("[name=fax_no]").val();
		data["address_name"] = jQuery("[name=address_name]").val();
		data["moo"] = jQuery("[name=moo]").val();
		data["road"]  = jQuery("[name=road]").val();

		data["soi"] = jQuery("[name=soi]").val();
		data["zipcode"]  = jQuery("[name=zipcode]").val();
		
		data["province_code"] = jQuery("[name=province_code] option:selected").val();
		data["province_text"]  = jQuery("[name=province_code] option:selected").text();
		
		data["district_code"] = jQuery("[name=district_code] option:selected").val();
		data["district_text"] = jQuery("[name=district_code] option:selected").text();

		data["subdistrict_code"] = jQuery("[name=subdistrict_code] option:selected").val();
		data["subdistrict_text"]  = jQuery("[name=subdistrict_code] option:selected").text();

		data["coordinate_x"] = jQuery("[name=coordinate_x]").val();
		data["coordinate_y"] = jQuery("[name=coordinate_y]").val();
		data["description"] = jQuery("[name=description]").val();
		data["address"] = jQuery("[name=address]").val();

		data["full_address"] =  q(data["address_name"] ,"") + 
			" �Ţ���"+ q(data["address"] ,"-") + 
			" ����" + q(data["moo"] ,"-")  + 
			" �Ӻ�" + q(data["subdistrict_text"] ,"-")  + 
			" �����" + q(data["district_text"] ,"-") + 
			" �ѧ��Ѵ" + q(data["province_text"] ,"-") ;

		//window.opener.appendAddressRow(data);
		
		data["serialize"] = jQuery("form#address_form").serialize();
		//alert(data["serialize"]);
		
		window.returnValue = data;
		window.close();
	}

	jQuery(document).ready(function() {
		applyProvinceAction("<%=path%>", "province_code", "district_code", "subdistrict_code" );
	 });

	 
</script>

</HEAD>

<BODY>

<form id="address_form">

<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="5"><span class="websitename" >����������зӼԴ</span></td>
	</tr>
	<tr>
		<td colspan="5"><hr /></td>
	</tr>
	<tr>
		<td colspan="5">
			<input name="btnSave"  type="button" class="barbutton" value="�ѹ�֡" onClick='appendRow();'>
			<input name="btnCancel"  type="button" class="barbutton" value="¡��ԡ������" >
			<input name="btnBack"  type="button" class="barbutton" value="��Ѻ" >
		</td>
	</tr>
	<tr>
		<td colspan="5"><hr /></td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">��������´&nbsp;:&nbsp;</td>
	<td colspan="3">
		<input name="description" type="text" class="textbox" size="35">
		<font style="color:red">*</font>
	</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">�Ţ��� :&nbsp; </td>
	<td colspan="3"><input name="address" type="text" class="textbox" size="4">
	  &nbsp;&nbsp;������&nbsp;:&nbsp;
	  <input name="moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
	  &nbsp;&nbsp;�Ҥ��/ʶҹ���&nbsp;:&nbsp;
	  <input name="address_name" type="text" class="textbox" size="25"></td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">��͡/���&nbsp;:&nbsp;</td>
	<td colspan="3"><input name="soi" type="text" class="textbox">
	&nbsp;&nbsp;���&nbsp;:&nbsp;
	<input name="road" type="text" class="textbox" size="25"></td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">�ѧ��Ѵ :&nbsp;</td>
	<td>
		<select name="province_code" id="sProvince"  style="width:180px;">
			<option value="x" selected>��ا෾��ҹ��</option>
			<option value="x">��к��</option>
			<option value="x">�͹��</option>
		</select>
		<font style="color:red">*</font>
	</td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">����� :&nbsp;</td>
	<td>
		<select name="district_code" id="sDistrict" style="width:180px;" >
			<option value="x">ࢵ��й��</option>
			<option value="x" >ࢵ���¢�ҧ</option>
			<option value="x">ࢵ���Ե</option>
			<option value="x" selected>ࢵ�Ҫ���</option>
		</select>
		<font style="color:red">*</font>
	 </td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">�Ӻ� :&nbsp;</td>
	<td>
		<select name="subdistrict_code" id="sSubDistrict" style="width:180px;" >
			<option value="x" selected>�ǧ�ѡ���ѹ</option>
			<option value="x">�ǧ����ͧ��ͧ</option>
			<option value="x">�ǧ�ҧ�л�</option>
			<option value="x">�ǧ</option>
		</select>
	 </td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="30" align="right">������ɳ���&nbsp;:&nbsp;</td>
	<td><input name="zipcode" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" size="10" maxlength="5"></td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="30" align="right">���Ѿ��&nbsp;:&nbsp;</td>
	<td colspan="3">
		<input name="tel_no" type="text" class="textbox" size="10">
		����� :&nbsp;<input name="fax_no" type="text" class="textbox" size="10">
	</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">�еԨٴ&nbsp;:&nbsp;</td>
	<td colspan="3"><input name="coordinate_x" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7">
	  &nbsp;&nbsp;�ͧ�Ԩٴ&nbsp;:&nbsp;
	  <input name="coordinate_y" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7"></td>
	</tr>
</table>
</form>
</BODY>
</HTML>
