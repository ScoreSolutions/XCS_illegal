<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<html>
<HEAD>

<title>บัญชีสิ่งของ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
</HEAD>
 


<BODY><script language="JavaScript" type="text/javascript" src="js/gen_validatorv31.js"></script>
<script language="JavaScript" type="text/javascript" src="js/JScript.js"></script>
<script type='text/javascript' src='<c:url value="/dwr/interface/DutyTable.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/interface/DutyGroup.js"/>'></script>
<script type='text/javascript' src='dwr/interface/Demo.js'></script>
<script type='text/javascript' src='dwr/interface/Pke_Compare.js'></script>
<script type='text/javascript' src='dwr/interface/SelectRegion.js'></script>
<script type='text/javascript' src='dwr/interface/FileUploader.js'></script>
<script type='text/javascript' src='<c:url value="/dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/util.js"/>'></script>


<script type="text/javascript">
var opener = window.dialogArguments;
var dummy1="";
var dummy2="";
var dummy3="";
var dummy4="";

function cancleedit(){
	if(opener.dueditna == 1){
		update();}else{

document.formdata1.reset()

			}
	 
}
var row = opener.dueditrow ;
row = row - 1;

var data = [];
for(i=0;i<=17;i++){
	data[i]="";
	}
function productopenmodal(){	
	if(document.getElementById('dutyTable').value != ""){
		window.showModalDialog('process?action=Product_pop&cmd=list&p=Y&duty=' + document.getElementById("dutyTable").value+'&group_id='+document.getElementById('group_id').value+'&textCode=product_code&textName=product_name' , self , 'dialogWidth=700px,Height=400px');
	}else{
		alert("กรุณาเลือกชนิดสินค้า");
		document.getElementById('dutyTable').focus();
	}
}

function brandopenmodal()
{
	if(document.getElementById("product_code").value != ""){
		window.showModalDialog('process?action=Brand_pop&cmd=list&p=Y&duty='+document.getElementById('dutyTable').value+'&group_id='+document.getElementById('group_id').value+'&textCode=brand_code&textName=brand_name' , self , 'dialogWidth=700px,Height=400px');
	}else{
		alert("กรุณาเลือกชื่อสินค้า");
		document.getElementById("product_code").focus();
	}
}

function brandsecondopenmodal()
{
	if(document.getElementById("brand_code").value != ""){
		window.showModalDialog('process?action=Brand_pop&cmd=list&p=Y&duty='+document.getElementById('dutyTable').value+'&group_id='+document.getElementById('group_id').value+'&isSecond=Y'+'&brand_main_code='+document.getElementById('brand_code').value+'&textCode=brand_second_code&textName=brand_second_name' , self , 'dialogWidth=700px,Height=400px');
	}else{
		alert("กรุณาเลือกยี่ห้อหลัก");
		document.getElementById("brand_code").focus();
	}
}

function modelopenmodal()
{
	if(document.getElementById("dutyTable").value != ""){
		window.showModalDialog('process?action=Model_pop&cmd=list&group_id='+document.getElementById('group_id').value+'&textCode=model_code&textName=model_name' , self , 'dialogWidth=700px,Height=400px');
	}else{
		alert("กรุณาเลือกชนิดสินค้า");
		document.getElementById("dutyTable").focus();
	}
}

function test(){

if(document.formdata1.onsubmit()!=false)
  {
	  
     saveto();
  }

}
</script >

<script>

function forsize(){
	var str = document.formdata1.product_code.value;
	str = str.substring(0,4)
for (var i=0; i < document.formdata1.province.length; i++) {
			if (document.formdata1.province[i].value == str) {
			document.formdata1.province[i].selected = true;
		}}
	document.formdata1.province.focus=true;
}

	function update(){
		if(opener.dueditna == 1){
			
			if(opener.dumaxrow == 2){
				data[1]=opener.document.dataform.api_id.value;
				data[2]=document.formdata1.product_code.value =opener.document.dataform.api_product_code.value ;
				data[3]=document.formdata1.brand_code.value =opener.document.dataform.api_brand_code.value ;
				data[4]=document.formdata1.sizes_code.value =opener.document.dataform.api_sizes_code.value ;
				data[5]=document.formdata1.sizes_unit_code.value =opener.document.dataform.api_unit_size.value ;
				data[6]=document.formdata1.qty.value =opener.document.dataform.api_qty.value ;
				data[7]=document.formdata1.qty_unit_code.value =opener.document.dataform.api_unit_qty.value ;
				data[8]=document.formdata1.netweight.value =opener.document.dataform.api_netweight.value ;
				data[9]=document.formdata1.netweight_unit_code.value =opener.document.dataform.api_unit_netweight.value ;
				data[10]=document.formdata1.description.value =opener.document.dataform.api_description.value ;
				data[11]=document.formdata1.remarks.value =opener.document.dataform.api_remarks.value ;
				data[12]=document.formdata1.product_name.value =opener.document.dataform.api_product_name.value ;
				data[13]=document.formdata1.brand_name.value =opener.document.dataform.api_brand_name.value;
				data[14]=opener.document.dataform.api_size_desc.value;
				data[15]=opener.document.dataform.api_unit_wnet_name.value;
				data[16]=opener.document.dataform.api_unit_qty_name.value;
				data[17]=opener.document.dataform.api_unit_size_name.value;
				data[18]=opener.document.dataform.api_duty_code.value;
				data[19]=document.formdata1.brand_second_code.value=opener.document.dataform.api_brand_second_code.value;
				data[20]=document.formdata1.brand_second_name.value=opener.document.dataform.api_brand_second_name.value;
				data[21]=document.formdata1.model_code.value=opener.document.dataform.api_model_code.value;
				data[22]=document.formdata1.model_name.value=opener.document.dataform.api_model_name.value;
				data[23]=document.formdata1.group_id.value=opener.document.dataform.api_group_id.value;
				data[24]=opener.document.dataform.api_group_name.value;
			}else{
				data[1]=opener.document.dataform.api_id[row].value;
				data[2]=document.formdata1.product_code.value =opener.document.dataform.api_product_code[row].value ;
				data[3]=document.formdata1.brand_code.value =opener.document.dataform.api_brand_code[row].value ;
				data[4]=document.formdata1.sizes_code.value =opener.document.dataform.api_sizes_code[row].value ;
				data[5]=document.formdata1.sizes_unit_code.value =opener.document.dataform.api_unit_size[row].value ;
				data[6]=document.formdata1.qty.value =opener.document.dataform.api_qty[row].value ;
				data[7]=document.formdata1.qty_unit_code.value =opener.document.dataform.api_unit_qty[row].value ;
				data[8]=document.formdata1.netweight.value =opener.document.dataform.api_netweight[row].value ;
				data[9]=document.formdata1.netweight_unit_code.value =opener.document.dataform.api_unit_netweight[row].value ;
				data[10]=document.formdata1.description.value =opener.document.dataform.api_description[row].value ;
				data[11]=document.formdata1.remarks.value =opener.document.dataform.api_remarks[row].value ;
				data[12]=document.formdata1.product_name.value =opener.document.dataform.api_product_name[row].value ;
				data[13]=document.formdata1.brand_name.value =opener.document.dataform.api_brand_name[row].value;
				data[14]=opener.document.dataform.api_size_desc[row].value ;
				data[15]=opener.document.dataform.api_unit_wnet_name[row].value ;
				data[16]=opener.document.dataform.api_unit_qty_name[row].value ;
				data[17]=opener.document.dataform.api_unit_size_name[row].value ;
				data[18]=opener.document.dataform.api_duty_code[row].value;
				data[19]=document.formdata1.brand_second_code.value=opener.document.dataform.api_brand_second_code[row].value;
				data[20]=document.formdata1.brand_second_name.value=opener.document.dataform.api_brand_second_name[row].value;
				data[21]=document.formdata1.model_code.value=opener.document.dataform.api_model_code[row].value;
				data[22]=document.formdata1.model_name.value=opener.document.dataform.api_model_name[row].value;
				data[23]=document.formdata1.group_id.value=opener.document.dataform.api_group_id[row].value;
				data[24]=opener.document.dataform.api_group_name[row].value;
		}
	}
		var str = data[2];
		str = str.substring(0,4)

		getGroupID('group_id',data[23],'sizePackage',data[14]);		
		getDutyTable('dutyTable',data[23],data[18]);
		getDutyUnit(data[23],"QTY","qty_unit_code",data[7]);
  		getDutyUnit(data[23],"SIZES","sizes_unit_code",data[5]);
  		getDutyUnit(data[23],"NETWEIGHT","netweight_unit_code",data[9]);
	}
	</script >
	<script>
	
function saveto(){
		data[2]=document.formdata1.product_code.value ;
		data[3]=document.formdata1.brand_code.value ;
		data[4]=document.formdata1.sizes_code.value ;
		data[5]=document.formdata1.sizes_unit_code.value ;
		data[6]=document.formdata1.qty.value ;
		data[7]=document.formdata1.qty_unit_code.value ;
		data[8]=document.formdata1.netweight.value ;
		data[9]=document.formdata1.netweight_unit_code.value ;
		data[10]=document.formdata1.description.value ;
		data[11]=document.formdata1.remarks.value ;
		data[12]=document.formdata1.product_name.value ;
		data[13]=document.formdata1.brand_name.value ;
		data[18]=document.formdata1.duty_code.value;
		data[19]=document.formdata1.brand_second_code.value;
		data[20]=document.formdata1.brand_second_name.value;
		data[21]=document.formdata1.model_code.value;
		data[22]=document.formdata1.model_name.value;
		data[23]=document.formdata1.group_id.value;

				
		window.returnValue = data;
		window.close();
	}


</script >



<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>


<script type="text/javascript" src="js/sigslot_core.js"></script>
<script src="js/base.js" type="text/javascript"></script>
<script src="js/utility.js" type="text/javascript"></script>

<script type="text/javascript" src="js/MXWidgets.js"></script>
<script type="text/javascript" src="js/JSRecordset.js"></script>
<script type="text/javascript" src="js/DependentDropdown.js"></script>
<script>
	
	
  function getDutyTable(id,group_idVal,dutyTable_sel){
  	DutyTable.getDutyTable(group_idVal,function(data){
  		dwr.util.removeAllOptions(id);
  		dwr.util.addOptions(id,{"":"โปรดเลือก"});
  		dwr.util.addOptions(id,data,"duty_code","duty_name");
  		dwr.util.setValue(id,dutyTable_sel);
  	});
  }

function getSizePackage(group_idVal,id,sizePackage_sel){
  	DutyGroup.getSizePackage(group_idVal,function(data){
  		dwr.util.removeAllOptions(id);
  		dwr.util.addOptions(id,{"":"โปรดเลือก"});
  		dwr.util.addOptions(id,data,"size_code","size_desc");
  		dwr.util.setValue(id,sizePackage_sel);
  	});
  }
  
  	function getGroupID(id,groupID_sel,packageSize_id,sizePackage_sel){
		DutyGroup.getDutyGroup(function(data){
			dwr.util.addOptions(id,{"":"โปรดเลือก"});
			dwr.util.addOptions(id,data,"group_id","group_name");
			dwr.util.setValue(id,groupID_sel);
			getSizePackage(groupID_sel,packageSize_id,sizePackage_sel);
		});
	}

    function getDutyUnit(vDutyCode,vUsedFor, cmbUnit, vUnitCode){
    	DutyGroup.getDutyUnit(vDutyCode,vUsedFor,function(data){
    		dwr.util.removeAllOptions(cmbUnit);
    		dwr.util.addOptions(cmbUnit,{"":"โปรดเลือก"});
    		dwr.util.addOptions(cmbUnit,data,"unit_code","unit_name");
    		dwr.util.setValue(cmbUnit,vUnitCode);
    	});
      }
</script>
<form name="formdata1" id="formdata1">
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >บัญชีสิ่งของ</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barbutton" value="บันทึก"  onclick="test();">
			<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข"  onClick = "cancleedit()">
		
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td align="right">ประเภทสินค้า :&nbsp;</td>
		<td>
			<select id="group_id" name="group_id" style="width:300px"
			 onChange="data[14]='';
			 		data[24]=document.formdata1.group_id.options[selectedIndex].text;
			 		getDutyTable('dutyTable',this.value);
			 		getSizePackage(this.value,'sizePackage',null);
			 		getDutyUnit(this.value,'SIZES','sizes_unit_code','');
   					getDutyUnit(this.value,'QTY','qty_unit_code','');
   					getDutyUnit(this.value,'NETWEIGHT','netweight_unit_code','');
			 		" >
			</select>
			<font color="red">*</font>
		</td>
	</tr>
	<tr>
		<td  align="right">ชนิดสินค้า :&nbsp;</td>
 		<td>
          	<select name="duty_code" id="dutyTable"  style="width:300px;" >
			</select>
			 </td>
         </tr>
	<tr>
		<td  align="right">ชื่อสินค้า :&nbsp;</td>
          <td >
               <input name="product_code" id="product_code" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" type="text" class="text"  size="10" />
               <img src="images/btn_browse.png" alt="" width="18" height="18" border="0" style="cursor:hand" onClick="productopenmodal()" />
               <input name="product_name" id="product_name" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" type="text" class="textView"  size="30" />
               
          </td>
	</tr>
	<tr>
		<td  align="right">ยี่ห้อหลัก :&nbsp;</td>
          <td >
               <input name="brand_code" id="brand_code" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" type="text" class="text"  size="10" />
               <img src="images/btn_browse.png" alt="" width="18" height="18" border="0" style="cursor:hand" onClick="brandopenmodal();" />
               <input name="brand_name" id="brand_name" type="text" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" class="textView"  size="30" />
          </td>
	</tr>
	<tr>
		<td  align="right">ยี่ห้อรอง :&nbsp;</td>
          <td >
               <input name="brand_second_code" id="brand_second_code" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" type="text" class="text"  size="10" />
               <img src="images/btn_browse.png" alt="" width="18" height="18" border="0" style="cursor:hand" onClick="brandsecondopenmodal();" />
               <input name="brand_second_name" id="brand_second_name" type="text" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" class="textView"  size="30" />
          </td>
	</tr>
	<tr>
		<td  align="right">แบบรุ่น :&nbsp;</td>
          <td >
               <input name="model_code" id="model_code" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" type="text" class="text"  size="10" />
               <img src="images/btn_browse.png" alt="" width="18" height="18" border="0" style="cursor:hand" onClick="modelopenmodal();" />
               <input name="model_name" id="model_name" type="text" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" class="textView"  size="30" />
          </td>
	</tr>
     <tr>
        <td align="right">ขนาดบรรจุ :&nbsp;</td>
         <td >
     <select name="sizes_code" id="sizePackage"  onChange="data[14]=document.formdata1.sizes_code.options[selectedIndex].text">
           
          </select>
               หน่วย :
               <select name="sizes_unit_code" id="sizes_unit_code" class="select" onChange='data[17]=document.formdata1.sizes_unit_code.options[selectedIndex].text'>
                    <option  value="" selected>เลือก</option>
                    <c:forEach items="${unit_list}"  var="unit1">
						<option value="${unit1.unit_code}">${unit1.unit_name}</option>
				 	</c:forEach>
               </select>
          </td>
     </tr>
     <tr>
        <td align="right">จำนวน :&nbsp;</td>
       <td >
				<input name="qty" id="qty" type="text" class="textNum"   size="5" onkeypress="ChkMinusDbl(this);"/>
               หน่วย :
               <select name="qty_unit_code" id="qty_unit_code" class="select" onChange='data[16]=document.formdata1.qty_unit_code.options[selectedIndex].text'>
                    <option  value="" selected>เลือก</option>
                    <c:forEach items="${unit_list}"  var="unit1">
						<option value="${unit1.unit_code}">${unit1.unit_name}</option>
				 	</c:forEach>
               </select>
          </td>
     </tr>
     <tr>
        <td align="right">ปริมาณสุทธิ :&nbsp;</td>
       <td >
				<input name="netweight"id="netweight" type="text" class="textNum"   onkeypress="ChkMinusDbl(this);" size="5" />
               หน่วย :
               <select name="netweight_unit_code" id="netweight_unit_code" class="select" onChange='data[15]=document.formdata1.netweight_unit_code.options[selectedIndex].text'>
                    <option  value="" selected>เลือก</option>
                    <c:forEach items="${unit_list}"  var="unit1">
						<option value="${unit1.unit_code}">${unit1.unit_name}</option>
				 	</c:forEach>
               </select>
          </td>
     </tr>
	<tr>
		<td  align="right">รายละเอียด : </td>
		<td ><input name="description" type="text" class="text"  size="45" ></td>
	</tr>
	<tr>
		<td  align="right">หมายเหตุ(ส่วนพิสูจน์) : </td>
		<td ><input name="remarks" type="text" class="text"  size="45"  ></td>
	</tr>
</table>
</form>
<script>
update();

</script >
<script language="JavaScript" type="text/javascript">

//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("formdata1");

 	frmvalidator.addValidation("group_id","req","กรุณาเลือกประเภทสินค้า");
 


  </script>
</BODY>
</HTML>
