<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<HEAD>
<base target="_self" />
<title>บัญชีสิ่งของ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script language="JavaScript" type="text/javascript" src="js/gen_validatorv31.js"></script>


<script language="JavaScript" type="text/javascript">
function cancleedit(){
	if(opener.editna == 1){
		update();}else{

document.formdata1.reset()

			}
	 
}
function submitform()
{
  if(document.formdata1.onsubmit())
  {
     saveto();
  }

}


</script>


<script type="text/javascript">
var dummy1="";
var dummy2="";
var dummy3="0";
var dummy4="";
var opener = window.dialogArguments;
var row = opener.editrow ;
row = row - 1;




var data = [];
function saveto(){

		data[1]=document.formdata1.offcode.value;
		data[2]=dummy1 ;
		data[3]=document.formdata1.entrepreneur.value ;
		data[4]=document.formdata1.establishment_name.value;
		data[5]=document.formdata1.license_type.value ;
		data[6]=dummy2 ;
		data[7]=document.formdata1.book_no.value ;
		data[8]=document.formdata1.license_no.value ;
		data[9]=dummy3 ;
		data[10]=document.formdata1.id.value;

		window.returnValue = data;
		window.close();
	}

	function update(){
	//alert(opener.maxrow);
	if(opener.editna == 1){
	if(opener.maxrow != 2){

		data[1]=document.formdata1.offcode.value = opener.document.dataform.ali_offcode[row].value;
		data[2]=dummy1 = opener.document.dataform.ali_offname[row].value;
		data[3]=document.formdata1.entrepreneur.value = opener.document.dataform.ali_entrepreneur[row].value;
		data[4]=document.formdata1.establishment_name.value = opener.document.dataform.ali_establishment_name[row].value;
		data[5]=document.formdata1.license_type.value = opener.document.dataform.ali_license_type[row].value;
		data[6]=dummy2 = opener.document.dataform.ali_licensetype_name[row].value;
		data[7]=document.formdata1.book_no.value = opener.document.dataform.ali_book_no[row].value;
		data[8]=document.formdata1.license_no.value = opener.document.dataform.ali_license_no[row].value;
		data[9]=dummy3 = opener.document.dataform.ali_iswithdraw[row].value;
		data[10]=document.formdata1.id.value = opener.document.dataform.ali_id[row].value;
		for(var i = 0 ; i< document.all("withdraw").length; i++){

 		if(document.formdata1.withdraw[i].value == opener.document.dataform.ali_iswithdraw[row].value ){
    	document.formdata1.withdraw[i].checked=true;
		 }
		 }
		 }else{


		data[1]=document.formdata1.offcode.value = opener.document.dataform.ali_offcode.value;
		data[2]=dummy1 = opener.document.dataform.ali_offname.value;
		data[3]=document.formdata1.entrepreneur.value = opener.document.dataform.ali_entrepreneur.value;
		data[4]=document.formdata1.establishment_name.value = opener.document.dataform.ali_establishment_name.value;
		data[5]=document.formdata1.license_type.value = opener.document.dataform.ali_license_type.value;
		data[6]=dummy2 = opener.document.dataform.ali_licensetype_name.value;
		data[7]=document.formdata1.book_no.value = opener.document.dataform.ali_book_no.value;
		data[8]=document.formdata1.license_no.value = opener.document.dataform.ali_license_no.value;
		data[9]=dummy3 = opener.document.dataform.ali_iswithdraw.value;
		data[10]=document.formdata1.id.value = opener.document.dataform.ali_id.value;
		for(var i = 0 ; i< document.all("withdraw").length; i++){

 		if(document.formdata1.withdraw[i].value == opener.document.dataform.ali_iswithdraw.value ){
    	document.formdata1.withdraw.checked=true;
		 }
		 }
		 }

	}
}
</script >
</HEAD>

<BODY>
<form name="formdata1" id="formdata1">

<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >ข้อมูลใบอนุญาต</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barbutton" value="บันทึก" onclick ="submitform();" >
			<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข"  onClick = "cancleedit()">
				</td>
	</tr>
	<tr>
		<td colspan="2"><input name="id" type="hidden" class="text" value=""><hr /></td>
	</tr>
	<tr>
		<td  align="right">สำนักงาน :&nbsp;</td>
		<td >
			<select name="offcode" class="select" style="width:295" onChange = "dummy1=document.formdata1.offcode.options[selectedIndex].text">
                   <option value="">โปรดเลือก</option>
                   <c:forEach items="${edlist}" var="off">
          		<option value="${off.offcode}" >${off.short_name}</option>
        		</c:forEach>
			</select>
			<font style="color:red">*</font>
		</td>
	</tr>
	<tr>
		<td  align="right">ชื่อผู้ประกอบการ :&nbsp;</td>
		<td >
			<input name="entrepreneur" type="text" class="text"  size="43" value=""><font style="color:red">*</font>
		</td>
	</tr>
	<tr>
		<td  align="right">ชื่อสถานประกอบการ : </td>
		<td >
			<input name="establishment_name" type="text" class="text"   maxlength="20"  value=""><font style="color:red">*</font>
		</td>
	</tr>
	<tr>
		<td  align="right">ประเภทใบอนุญาต :&nbsp;</td>
		<td >
			<select name="license_type" class="select" style="width:250px" onChange = "dummy2=document.formdata1.license_type.options[selectedIndex].text">
					<option value="" >โปรดเลือก</option>
					 <c:forEach items="${ltlist}" var="ltt">
          		<option value="${ltt.id}" > ${ltt.licensetype_code} - ${ltt.licensetype_name}</option>
        		</c:forEach>
			</select>
			<font style="color:red">*</font>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

		</td>
	</tr>
	<tr>
		<td align="right">เล่มที่ใบอนุญาต :&nbsp;</td>
		<td >
			<input name="book_no" type="text" class="text"  size="10" value="" >
			<font style="color:red">*</font>&nbsp;&nbsp;&nbsp;

			เลขที่ใบอนุญาต :
			<input name="license_no" type="text" class="text"  size="10" value="" >
			<font style="color:red">*</font>
		</td>
	</tr>
	<tr>
		<td align="right">เพิกถอน :&nbsp;</td>
		<td >
            <input type="radio" name="withdraw" id="withdraw" value="1" onClick='dummy3="1" ' />เพิกถอน
            <input type="radio" name="withdraw" id="withdraw" value="2" onClick='dummy3="2"' />อยู่ระหว่างเพิกถอน
            <input type="radio" name="withdraw" id="withdraw"  value="0" onClick='dummy3="0"' checked />ไม่ระบุ
		</td>
	</tr>
</table>
</form>
<script>
update();




</script>

<script language="JavaScript" type="text/javascript">

//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("formdata1");

  frmvalidator.addValidation("license_no","req","กรุณากรอกเลขที่ใบอนุญาต");
  frmvalidator.addValidation("book_no","req","กรุณากรอกเล่มที่ใบอนุญาติ");
  frmvalidator.addValidation("license_type","req","กรุณากรอกประเภทใบอนุญาติ");
   frmvalidator.addValidation("establishment_name","req","กรุณากรอกชื่อสถานประกอบการ");
  frmvalidator.addValidation("entrepreneur","req","กรุณากรอกชื่อผู้ประกอบการ");
  frmvalidator.addValidation("offcode","req","กรุณาเลือกสำนักงาน");
  </script>
</BODY>
</HTML>
