<%@ page contentType="text/html; charset=Tis-620" %>
<%@ page import="com.ko.util.IbatisAgent" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="com.ko.model.SuspectRelatives" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>

<title>��ª��ͼ��������Ǣ�ͧ : �к��ҹ����зӼԴ��������þ���Ե �����þ���Ե</title>
<link href="../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" language="JavaScript" src="../script/jquery.js" ></script>
<script type="text/javascript" language="JavaScript" src="../script/service.js" ></script>
<script type="text/javascript" language="JavaScript" src="../script/effect.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/JScript.js" ></script>

</HEAD>

<%

	String path = com.ko.util.FormUtility.getScriptReferencePath(request);
	String id = request.getParameter("id");
	String revisionCommand = "";
	if(id != null){
		BigDecimal key = new BigDecimal(id);
		SuspectRelatives relative = new IbatisAgent().selectSuspectRelativesByPrimaryKey(key);
		java.util.HashMap<String,String> revisionMap = com.ko.util.FormUtility.createRevisionMapFromObject(relative);
		revisionCommand = com.ko.util.FormUtility.generateRealRevisionCommand(revisionMap);
	}

%>

<script>
	function appendRow(){
		var data = [];
		data["index"] = 1;
		data["relation"] = jQuery("[name=relation] option:selected").val();
		data["relation_text"] = jQuery("[name=relation] option:selected").text();
		data["title_code"] = jQuery("[name=titel_code] option:selected").val();
		data["title_text"] = jQuery("[name=title_code] option:selected").text();
		data["first_name"] = jQuery("[name=first_name]").val();
		data["last_name"] = jQuery("[name=last_name]").val();
		
		data["tel_no"] = jQuery("[name=tel_no]").val();
		data["email"] = jQuery("[name=email]").val();
		data["current_address_no"] = jQuery("[name=current_address_no]").val();
		data["current_moo"] = jQuery("[name=current_moo]").val();
		data["current_soi"] = jQuery("[name=current_soi]").val();
		data["current_road"] = jQuery("[name=current_road]").val();
		data["current_address_name"] = jQuery("[name=current_address_name]").val();
		
		data["current_province_code"] = jQuery("[name=current_province_code] option:selected").val();
		data["current_district_code"] = jQuery("[name=current_district_code] option:selected").val();
		data["current_subdistrict_code"] = jQuery("[name=current_subdistrict_code] option:selected").val();
		data["current_province_text"] = jQuery("[name=current_province_code] option:selected").text();
		data["current_district_text"] = jQuery("[name=current_district_code] option:selected").text();
		data["current_subdistrict_text"] = jQuery("[name=current_subdistrict_code] option:selected").text();

		data["hometown_address_no"] = jQuery("[name=hometown_address_no]").val();
		data["hometown_moo"] = jQuery("[name=hometown_moo]").val();
		data["hometown_soi"] = jQuery("[name=hometown_soi]").val();
		data["hometown_road"] = jQuery("[name=hometown_road]").val();
		data["hometown_province_code"] = jQuery("[name=hometown_province_code] option:selected").val();
		data["hometown_district_code"] = jQuery("[name=hometown_district_code] option:selected").val();
		data["hometown_subdistrict_code"] = jQuery("[name=hometown_subdistrict_code] option:selected").val();
		data["hometown_province_text"] = jQuery("[name=hometown_province_code] option:selected").text();
		data["hometown_district_text"] = jQuery("[name=hometown_district_code] option:selected").text();
		data["hometown_subdistrict_text"] = jQuery("[name=hometown_subdistrict_code] option:selected").text();

		data["relative_name"] =  q(data["title_text"] ,"") + q(data["first_name"] ,"") + " " + q(data["last_name"] ,"");
		data["current_address"] =  
			/*q(data["current_address_name"] ,"") +*/ 
		" �Ţ���"+ q(data["current_address_no"] ,"-") + 
		" ����" + q(data["current_moo"] ,"-")  + 
		" �Ӻ�" + q(data["current_subdistrict_text"] ,"-")  + 
		" �����" + q(data["current_district_text"] ,"-") + 
		" �ѧ��Ѵ" + q(data["current_province_text"] ,"-") ;
		
		data["hometown_address"] =  
			/*q(data["hometown_address_name"] ,"") +*/ 
		" �Ţ���"+ q(data["hometown_address_no"] ,"-") + 
		" ����" + q(data["hometown_moo"] ,"-")  + 
		" �Ӻ�" + q(data["hometown_subdistrict_text"] ,"-")  + 
		" �����" + q(data["hometown_district_text"] ,"-") + 
		" �ѧ��Ѵ" + q(data["hometown_province_text"] ,"-") ;

		//alert(data["relative_name"]);
		//alert(data["current_address"]);
		//alert(data["hometown_address"]);
		
		data["serialize"] = jQuery("#relative_form").serialize();
		data["id"] = jQuery("input[name=id]").val();
		

		window.returnValue = data;
		window.close();
	}

	jQuery(document).ready(function() {
		applyProvinceAction("<%=path%>", "current_province_code", "current_district_code", "current_subdistrict_code" );
		applyProvinceAction("<%=path%>", "hometown_province_code", "hometown_district_code", "hometown_subdistrict_code" );
		applyRelationOption("<%=path%>", "relation");
		applyTitleOption("<%=path%>", "title_code", 1);

		eval('<%=revisionCommand%>');
	 });
	 
</script>

<BODY>
<form id="relative_form">

<input type="text" name="id" style="display:none;"></input>

<table border="0" cellpadding="0" cellspacing="0" width="100%">
	<tr>
		<td colspan="5"><span class="websitename" >��ª��ͼ������Ǣ�ͧ</span></td>
	</tr>
	<tr>
		<td colspan="5"><hr /></td>
	</tr>
	<tr>
		<td colspan="5">
			<input name="btnSave"  type="button" class="barbutton" value="�ѹ�֡" onClick="appendRow()">
			<input name="btnCancel"  type="button" class="barbutton" value="¡��ԡ������" >
			<input name="btnBack"  type="button" class="barbutton" value="��Ѻ" >
		</td>
	</tr>
	<tr>
		<td colspan="5"><hr /></td>
	</tr>
	<tr>
       <td width="2%">&nbsp;</td>
       <td width="15%" height="25" align="right">��������ѹ��&nbsp;:&nbsp;</td>
       <td width="83%" >
              <select   style="width:130px;" name="relation">
                   <option value="x" selected>��س����͡������</option>
                   <option value="x">�Դ�</option>
                   <option value="x">��ô�</option>
                   <option value="x">����</option>
                   <option value="x">�����</option>
                   <option value="x">�صê��</option>
                   <option value="x">�ص����</option>
              </select>
              <font style="color:red">*</font>
              &nbsp;&nbsp;�Ţ���ѵ� ���&nbsp;:&nbsp;
              <input name="id_card" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="13">
        </td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td height="25" align="right">���� :&nbsp; </td>
		<td colspan="3">
              <select   style="width:80px;" name="title_code">
                   <option value="x" selected>���</option>
                   <option value="x">�ҧ</option>
                   <option value="x">�ҧ���</option>
                   <option value="x">�.�.</option>
                   <option value="x">�.�.</option>
              </select>
              <input name="first_name" type="text" class="textbox" size="20">
              <input name="last_name" type="text" class="textbox" size="20">
              <font style="color:red">*</font>
              
		</td>
	</tr>
	<tr bgcolor="#E9E9E9">
		<td>&nbsp;</td>
		<td colspan="5">�������Ѩ�غѹ</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="30" align="right">���Ѿ��&nbsp;:&nbsp;</td>
	<td colspan="3">
		<input name="tel" type="text" class="textbox" size="10">&nbsp;&nbsp;&nbsp;
		E-Mail&nbsp;:&nbsp;<input name="email" type="text" class="textbox" size="35">
	</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td height="25" align="right">�Ţ��� :&nbsp; </td>
		<td colspan="3">
			<input name="current_address_no" type="text" class="textbox" size="4">
		  &nbsp;&nbsp;������&nbsp;:&nbsp;
			<input name="current_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
		</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">��͡/���&nbsp;:&nbsp;</td>
	<td colspan="3"><input name="current_soi" type="text" class="textbox">
	&nbsp;&nbsp;���&nbsp;:&nbsp;
	<input name="current_road" type="text" class="textbox" size="25"></td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">�ѧ��Ѵ :&nbsp;</td>
	<td>
		<select name="current_province_code" id="sProvince"  style="width:180px;">
			<option value="x" selected>��ا෾��ҹ��</option>
			<option value="x">��к��</option>
			<option value="x">�͹��</option>
		</select>
	</td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">����� :&nbsp;</td>
	<td>
		<select name="current_district_code" id="sDistrict" style="width:180px;" >
			<option value="x">ࢵ��й��</option>
			<option value="x" >ࢵ���¢�ҧ</option>
			<option value="x">ࢵ���Ե</option>
			<option value="x" selected>ࢵ�Ҫ���</option>
			</select>
	 </td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">�Ӻ� :&nbsp;</td>
	<td>
		<select name="current_subdistrict_code" id="sSubDistrict" style="width:180px;" >
			<option value="x" selected>�ǧ�ѡ���ѹ</option>
			<option value="x">�ǧ����ͧ��ͧ</option>
			<option value="x">�ǧ�ҧ�л�</option>
			<option value="x">�ǧ</option>
		</select>
	 </td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr >
		<td>&nbsp;</td>
		<td colspan="5">&nbsp;</td>
	</tr>
	<tr bgcolor="#E9E9E9">
		<td>&nbsp;</td>
		<td colspan="5">���������������</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td height="25" align="right">�Ţ��� :&nbsp; </td>
		<td colspan="3">
			<input name="hometown_address_no" type="text" class="textbox" size="4">
		  &nbsp;&nbsp;������&nbsp;:&nbsp;
			<input name="hometown_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
		</td>
	</tr>

	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">��͡/���&nbsp;:&nbsp;</td>
	<td colspan="3"><input name="hometown_soi" type="text" class="textbox">
	&nbsp;&nbsp;���&nbsp;:&nbsp;
	<input name="hometown_road" type="text" class="textbox" size="25"></td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">�ѧ��Ѵ :&nbsp;</td>
	<td>
		<select name="hometown_province_code" id="sProvince"  style="width:180px;">
			<option value="x" selected>��ا෾��ҹ��</option>
			<option value="x">��к��</option>
			<option value="x">�͹��</option>
		</select>
	</td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">����� :&nbsp;</td>
	<td>
		<select name="hometown_district_code" id="sDistrict" style="width:180px;" >
			<option value="x">ࢵ��й��</option>
			<option value="x" >ࢵ���¢�ҧ</option>
			<option value="x">ࢵ���Ե</option>
			<option value="x" selected>ࢵ�Ҫ���</option>
	 </td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">�Ӻ� :&nbsp;</td>
	<td>
		<select name="hometown_subdistrict_code" id="sSubDistrict" style="width:180px;" >
			<option value="x" selected>�ǧ�ѡ���ѹ</option>
			<option value="x">�ǧ����ͧ��ͧ</option>
			<option value="x">�ǧ�ҧ�л�</option>
			<option value="x">�ǧ</option>
		</select>
	 </td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
</table>
</form>
</BODY>
</HTML>
