<%@ page contentType="text/html; charset=Tis-620" %>
<%@ page import="com.ko.util.IbatisAgent" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="com.ko.model.SuspectRelatives" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>

<title>รายชื่อผู้ที่เกี่ยวข้อง : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
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
		" เลขที่"+ q(data["current_address_no"] ,"-") + 
		" หมู่" + q(data["current_moo"] ,"-")  + 
		" ตำบล" + q(data["current_subdistrict_text"] ,"-")  + 
		" อำเภอ" + q(data["current_district_text"] ,"-") + 
		" จังหวัด" + q(data["current_province_text"] ,"-") ;
		
		data["hometown_address"] =  
			/*q(data["hometown_address_name"] ,"") +*/ 
		" เลขที่"+ q(data["hometown_address_no"] ,"-") + 
		" หมู่" + q(data["hometown_moo"] ,"-")  + 
		" ตำบล" + q(data["hometown_subdistrict_text"] ,"-")  + 
		" อำเภอ" + q(data["hometown_district_text"] ,"-") + 
		" จังหวัด" + q(data["hometown_province_text"] ,"-") ;

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
		<td colspan="5"><span class="websitename" >รายชื่อผู้เกี่ยวข้อง</span></td>
	</tr>
	<tr>
		<td colspan="5"><hr /></td>
	</tr>
	<tr>
		<td colspan="5">
			<input name="btnSave"  type="button" class="barbutton" value="บันทึก" onClick="appendRow()">
			<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" >
			<input name="btnBack"  type="button" class="barbutton" value="กลับ" >
		</td>
	</tr>
	<tr>
		<td colspan="5"><hr /></td>
	</tr>
	<tr>
       <td width="2%">&nbsp;</td>
       <td width="15%" height="25" align="right">ความสัมพันธ์&nbsp;:&nbsp;</td>
       <td width="83%" >
              <select   style="width:130px;" name="relation">
                   <option value="x" selected>กรุณาเลือกข้อมูล</option>
                   <option value="x">บิดา</option>
                   <option value="x">มารดา</option>
                   <option value="x">สามี</option>
                   <option value="x">ภรรยา</option>
                   <option value="x">บุตรชาย</option>
                   <option value="x">บุตรสาว</option>
              </select>
              <font style="color:red">*</font>
              &nbsp;&nbsp;เลขที่บัตร ปชช&nbsp;:&nbsp;
              <input name="id_card" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="13">
        </td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td height="25" align="right">ชื่อ :&nbsp; </td>
		<td colspan="3">
              <select   style="width:80px;" name="title_code">
                   <option value="x" selected>นาย</option>
                   <option value="x">นาง</option>
                   <option value="x">นางสาว</option>
                   <option value="x">ด.ช.</option>
                   <option value="x">ด.ญ.</option>
              </select>
              <input name="first_name" type="text" class="textbox" size="20">
              <input name="last_name" type="text" class="textbox" size="20">
              <font style="color:red">*</font>
              
		</td>
	</tr>
	<tr bgcolor="#E9E9E9">
		<td>&nbsp;</td>
		<td colspan="5">ที่อยู่ปัจจุบัน</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="30" align="right">โทรศัพท์&nbsp;:&nbsp;</td>
	<td colspan="3">
		<input name="tel" type="text" class="textbox" size="10">&nbsp;&nbsp;&nbsp;
		E-Mail&nbsp;:&nbsp;<input name="email" type="text" class="textbox" size="35">
	</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td height="25" align="right">เลขที่ :&nbsp; </td>
		<td colspan="3">
			<input name="current_address_no" type="text" class="textbox" size="4">
		  &nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
			<input name="current_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
		</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
	<td colspan="3"><input name="current_soi" type="text" class="textbox">
	&nbsp;&nbsp;ถนน&nbsp;:&nbsp;
	<input name="current_road" type="text" class="textbox" size="25"></td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">จังหวัด :&nbsp;</td>
	<td>
		<select name="current_province_code" id="sProvince"  style="width:180px;">
			<option value="x" selected>กรุงเทพมหานคร</option>
			<option value="x">กระบี่</option>
			<option value="x">ขอนแก่น</option>
		</select>
	</td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">อำเภอ :&nbsp;</td>
	<td>
		<select name="current_district_code" id="sDistrict" style="width:180px;" >
			<option value="x">เขตพระนคร</option>
			<option value="x" >เขตห้วยขวาง</option>
			<option value="x">เขตดุสิต</option>
			<option value="x" selected>เขตราชเทวี</option>
			</select>
	 </td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">ตำบล :&nbsp;</td>
	<td>
		<select name="current_subdistrict_code" id="sSubDistrict" style="width:180px;" >
			<option value="x" selected>แขวงมักกะสัน</option>
			<option value="x">แขวงทุ่งสองห้อง</option>
			<option value="x">แขวงบางกะปิ</option>
			<option value="x">แขวง</option>
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
		<td colspan="5">ที่อยู่ภูมิลำเนา</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td height="25" align="right">เลขที่ :&nbsp; </td>
		<td colspan="3">
			<input name="hometown_address_no" type="text" class="textbox" size="4">
		  &nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
			<input name="hometown_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
		</td>
	</tr>

	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
	<td colspan="3"><input name="hometown_soi" type="text" class="textbox">
	&nbsp;&nbsp;ถนน&nbsp;:&nbsp;
	<input name="hometown_road" type="text" class="textbox" size="25"></td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">จังหวัด :&nbsp;</td>
	<td>
		<select name="hometown_province_code" id="sProvince"  style="width:180px;">
			<option value="x" selected>กรุงเทพมหานคร</option>
			<option value="x">กระบี่</option>
			<option value="x">ขอนแก่น</option>
		</select>
	</td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">อำเภอ :&nbsp;</td>
	<td>
		<select name="hometown_district_code" id="sDistrict" style="width:180px;" >
			<option value="x">เขตพระนคร</option>
			<option value="x" >เขตห้วยขวาง</option>
			<option value="x">เขตดุสิต</option>
			<option value="x" selected>เขตราชเทวี</option>
	 </td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
	<tr>
	<td>&nbsp;</td>
	<td height="25" align="right">ตำบล :&nbsp;</td>
	<td>
		<select name="hometown_subdistrict_code" id="sSubDistrict" style="width:180px;" >
			<option value="x" selected>แขวงมักกะสัน</option>
			<option value="x">แขวงทุ่งสองห้อง</option>
			<option value="x">แขวงบางกะปิ</option>
			<option value="x">แขวง</option>
		</select>
	 </td>
	<td align="right">&nbsp;</td>
	<td>&nbsp;</td>
	</tr>
</table>
</form>
</BODY>
</HTML>
