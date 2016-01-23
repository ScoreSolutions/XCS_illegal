<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<html>
<head>
<title>บัญชีสิ่งของ : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</HEAD>

<BODY>
<script language="JavaScript" type="text/javascript" src="js/gen_validatorv31.js"></script>
<script language="JavaScript" type="text/javascript" src="js/JScript.js"></script>
<script language="JavaScript" type="text/javascript" src="script/jquery.js"></script>
<script language="JavaScript" type="text/javascript" src="script/jquery.maskedinput-1.2.2.js"></script>
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

var row = opener.dueditrow ;
row = row - 1;
var data = new Array();
var prb=opener.document.dataform.legislation_id.value;

for(i=0;i<=34;i++){
	data[i]="";
	}
function cancleedit(){
	if(opener.dueditna == 1){
		update();}else{

document.formdata1.reset()

			}
	 
}
function productopenmodal(){
	if(document.formdata1.duty_code.value != "")
		window.showModalDialog('process?action=Product_pop&cmd=list&p=Y&duty=' + document.getElementById("dutyTable").options.value + '&group_id=' + document.getElementById('group_id').value + '&textCode=product_code&textName=product_name' , self , 'dialogWidth=700px,Height=400px');
	else{
		alert("กรุณาเลือกชนิดสินค้า");
		document.formdata1.duty_code.focus();
	}

}

function brandopenmodal()
{
	if(document.formdata1.group_id.value != "")
		window.showModalDialog('process?action=Brand_pop&cmd=list&p=Y&duty='+document.getElementById('dutyTable').options.value+ '&group_id=' + document.getElementById('group_id').value +'&textCode=brand_code&textName=brand_name' , self , 'dialogWidth=700px,Height=400px');
	else{
		alert("กรุณาเลือกหมวดสินค้า");
		document.formdata1.group_id.focus();
	}
}

function test(){
	if(document.formdata1.isexhibitco.checked==true){
		data[1]="Y";
		saveto();
	}else if(document.formdata1.onsubmit()!=false){
	    saveto();
	}
}


	function update(){
		data[8]="Z"
		data[15]="1";
		data[24]="";
		data[23]="";
		data[22]="";
		data[21]="";

		if(opener.dueditna == 1){
			document.formdata1.isexhibitco.disabled=true;
			if(opener.dumaxrow != 2){
				//alert("aaaaaa");
				if(opener.document.dataform.aae_isexhibitco[row].value == "Y"){
					document.formdata1.isexhibitco.checked=true;
					data[1]= "Y";
				}else{
					data[1]= "N";
				}

				data[2]=document.formdata1.duty_code.value = opener.document.dataform.aae_duty_code[row].value;
				data[3]= opener.document.dataform.aae_duty_name[row].value;
				data[4]=document.formdata1.product_code.value = opener.document.dataform.aae_product_code[row].value;
				data[5]=document.formdata1.product_name.value = opener.document.dataform.aae_product_name[row].value;
				data[6]=document.formdata1.brand_code.value = opener.document.dataform.aae_brand_code[row].value;
				data[7]=document.formdata1.brand_name.value = opener.document.dataform.aae_brand_name[row].value;
				data[8] = opener.document.dataform.aae_isdomestic[row].value;
	
				for (var i=0; i < document.formdata1.isdomestic.length; i++) {
					if (document.formdata1.isdomestic[i].value == opener.document.dataform.aae_isdomestic[row].value) {
						document.formdata1.isdomestic[i].checked = true;}
				}
				//data[9]=document.formdata1.sizes_code.value = opener.document.dataform.aae_sizes_code[row].value;
				data[10]=document.formdata1.sizes_unit_code.value = opener.document.dataform.aae_sizes_unit_code[row].value;
				data[11]=document.formdata1.qty.value = opener.document.dataform.aae_qty[row].value;
				data[12]=document.formdata1.qty_unit_code.value = opener.document.dataform.aae_qty_unit_code[row].value;
				data[13]=document.formdata1.netweight.value = opener.document.dataform.aae_netweight[row].value;
				data[14]=document.formdata1.netweight_unit_code.value = opener.document.dataform.aae_netweight_unit_code[row].value;
				for (var i=0; i < document.formdata1.status.length; i++) {
					if (document.formdata1.status[i].value == opener.document.dataform.aae_status[row].value) {
						document.formdata1.status[i].checked = true;}
		
				}
				
				data[15]=document.formdata1.status.value = opener.document.dataform.aae_status[row].value;
				data[16]=document.formdata1.exhibit_list.value = opener.document.dataform.aae_exhibit_list[row].value;
				data[17]=document.formdata1.exhibit_desc.value = opener.document.dataform.aae_exhibit_desc[row].value;
				data[18]=document.formdata1.car_no.value = opener.document.dataform.aae_car_no[row].value;
				data[19]=document.formdata1.remarks.value = opener.document.dataform.aae_remarks[row].value;
				data[20]=document.formdata1.id.value = opener.document.dataform.aae_id[row].value;
				data[21]= document.formdata1.sizes_desc.value = opener.document.dataform.aae_sizes_code_text[row].value;
				data[22]= opener.document.dataform.aae_sizes_unit_code_text[row].value;
				data[23]= opener.document.dataform.aae_qty_unit_code_text[row].value;
				data[24]= opener.document.dataform.aae_netweight_unit_code_text[row].value;
				data[25]= opener.document.dataform.aae_case_id[row].value;
				data[26]=document.formdata1.co_id.value= opener.document.dataform.aae_co_id[row].value;
				data[27]=document.formdata1.group_id.value = opener.document.dataform.aae_group_id[row].value;
				data[28] = opener.document.dataform.aae_group_name[row].value;
				
				if (opener.document.dataform.aae_isexhibitco.value == "Y") {
					document.formdata1.sizes_code[i].selected = true;
					data[1]= "Y";
				}else{data[1]= "N";}


			}else{

				//alert("update");
	
				data[2]=document.formdata1.duty_code.value = opener.document.dataform.aae_duty_code.value;
				data[3]=dummy1 = opener.document.dataform.aae_duty_name.value;
				data[4]=document.formdata1.product_code.value = opener.document.dataform.aae_product_code.value;
				data[5]=document.formdata1.product_name.value = opener.document.dataform.aae_product_name.value;
				data[6]=document.formdata1.brand_code.value = opener.document.dataform.aae_brand_code.value;
				data[7]=document.formdata1.brand_name.value = opener.document.dataform.aae_brand_name.value;
		
				for (var i=0; i < document.formdata1.isdomestic.length; i++) {
					if (document.formdata1.isdomestic[i].value == opener.document.dataform.aae_isdomestic.value) {
						document.formdata1.isdomestic[i].checked = true;
					}
				}
				data[8] = opener.document.dataform.aae_isdomestic.value;
		
				//data[9]=document.formdata1.sizes_code.value = opener.document.dataform.aae_sizes_code.value;
				data[10]=document.formdata1.sizes_unit_code.value = opener.document.dataform.aae_sizes_unit_code.value;
				data[11]=document.formdata1.qty.value = opener.document.dataform.aae_qty.value;
				data[12]=document.formdata1.qty_unit_code.value = opener.document.dataform.aae_qty_unit_code.value;
				data[13]=document.formdata1.netweight.value = opener.document.dataform.aae_netweight.value;
				data[14]=document.formdata1.netweight_unit_code.value = opener.document.dataform.aae_netweight_unit_code.value;
		
				for (var i=0; i < document.formdata1.status.length; i++) {
					if (document.formdata1.status[i].value == opener.document.dataform.aae_status.value) {
						document.formdata1.status[i].checked = true;}
				}
				data[15] = opener.document.dataform.aae_status.value;
				data[16]=document.formdata1.exhibit_list.value = opener.document.dataform.aae_exhibit_list.value;
				data[17]=document.formdata1.exhibit_desc.value = opener.document.dataform.aae_exhibit_desc.value;
				data[18]=document.formdata1.car_no.value = opener.document.dataform.aae_car_no.value;
				data[19]=document.formdata1.remarks.value = opener.document.dataform.aae_remarks.value;
				data[20]=document.formdata1.id.value = opener.document.dataform.aae_id.value;
				data[21] = document.formdata1.sizes_desc.value = opener.document.dataform.aae_sizes_code_text.value;
				data[22] = opener.document.dataform.aae_sizes_unit_code_text.value;
				data[23] = opener.document.dataform.aae_qty_unit_code_text.value;
				data[24] = opener.document.dataform.aae_netweight_unit_code_text.value;
				data[25] = opener.document.dataform.aae_case_id.value;
				data[26]=document.formdata1.co_id.value= opener.document.dataform.aae_co_id.value;
				data[27]=document.formdata1.group_id.value = opener.document.dataform.aae_group_id.value;
				data[28] = opener.document.dataform.aae_group_name.value;
				
			}
		}else{
			data[27] = "${group_id}";
		}

		getGroupID('group_id',data[27],'sizePackage',data[9]);		
		getDutyTable('dutyTable',data[27],data[2]);
		getDutyUnit(data[27],"QTY","qty_unit_code",data[12]);
  		getDutyUnit(data[27],"SIZES","sizes_unit_code",data[10]);
  		getDutyUnit(data[27],"NETWEIGHT","netweight_unit_code",data[14]);

  		//validateDecimal3(document.formdata1.sizes_desc);
  		//validateDecimal3(document.formdata1.netweight);
	}

function saveto(){

 if(document.formdata1.isexhibitco.checked==false){
		data[1]="N";
		data[2]=document.formdata1.duty_code.value;
		//data[3]=document.formdata1.duty_name.value;
		data[4]=document.formdata1.product_code.value;
		data[5]=document.formdata1.product_name.value;
		data[6]=document.formdata1.brand_code.value;
		data[7]=document.formdata1.brand_name.value;
		//data[8]=document.formdata1.isdomestic.value;
		//data[9]=document.formdata1.sizes_code.value;
		data[10]=document.formdata1.sizes_unit_code.value;
		data[11]=document.formdata1.qty.value;
		data[12]=document.formdata1.qty_unit_code.value;
		data[13]=document.formdata1.netweight.value;
		data[14]=document.formdata1.netweight_unit_code .value;
		//data[15]=document.formdata1.status.value;
		data[16]=document.formdata1.exhibit_list.value;
		data[17]=document.formdata1.exhibit_desc.value;
		//alert(data[17]);
		data[18]=document.formdata1.car_no.value;
		data[19]=document.formdata1.remarks.value;
		//data[20]=opener.document.dataform.aae_id.value;
		data[21] = document.formdata1.sizes_desc.value;
		//data[22] = opener.document.dataform.aae_sizes_unit_code_text.value;
		//data[23]= opener.document.dataform.aae_qty_unit_code_text.value;
		//data[24] = opener.document.dataform.aae_netweight_unit_code_text.value;
		data[26]=document.formdata1.co_id.value;
		data[27]=document.formdata1.group_id.value;
	}
	window.returnValue = data;
	window.close();
}

function upchg(){

       if (data[4]!=null){
			data[1] ="Y";
	
			document.formdata1.duty_code1.value = data[2];
			document.formdata1.product_code1.value = data[4];
			document.formdata1.product_name1.value = data[5];
			document.formdata1.brand_code1.value = data[6];
			document.formdata1.brand_name1.value = data[7];
			
			for (var i=0; i < document.formdata1.isdomestic1.length; i++) {
				if (document.formdata1.isdomestic1[i].value == trim(data[8])) {
					document.formdata1.isdomestic1[i].checked = true;
				}
			}
			document.formdata1.sizes_code1.value = data[9];
			document.formdata1.sizes_unit_code1.value = data[10];
			document.formdata1.qty1.value = data[11];
			document.formdata1.qty_unit_code1.value = data[12];
			document.formdata1.netweightshow1.value = data[13]+" "+data[24];
			document.formdata1.netweight_unit_code1.value = data[14];
			for (var i=0; i < document.formdata1.status1.length; i++) {
				if (document.formdata1.status1[i].value == data[15]) 
					document.formdata1.status1[i].checked = true;
			}
			document.formdata1.status1.value = data[15];
			document.formdata1.exhibit_list1.value = data[16];
			document.formdata1.exhibit_desc1.value = data[17];
			document.formdata1.car_no1.value = data[18];
			document.formdata1.remarks1.value = data[19];
			document.formdata1.co_id.value= data[26];
			document.formdata1.sizes_desc.value=data[21];
		}



}

function ClearProduct(){
	//dwr.util.setValue(document.formdata1.group_id,"");
	dwr.util.setValue(document.formdata1.product_code,"");
	dwr.util.setValue(document.formdata1.product_name,"");
	dwr.util.setValue(document.formdata1.brand_code,"");
	dwr.util.setValue(document.formdata1.brand_name,"");
}
</script >



<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" language="JavaScript">
  function toggle() {
   if( document.getElementById("chkIsExhibitCo").checked ==false ){
    document.getElementById("isNoneExhibitCo").style.display = '';
    document.getElementById("isExhibitCoy").style.display = 'none';
   }else{
    document.getElementById("isNoneExhibitCo").style.display = 'none';
    document.getElementById("isExhibitCoy").style.display = '';
   }
  }


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

  function getDutyUnit(vGroupID,vUsedFor, cmbUnit, vUnitCode){
	DutyGroup.getDutyUnit(vGroupID,vUsedFor,function(data){
		dwr.util.removeAllOptions(cmbUnit);
		dwr.util.addOptions(cmbUnit,{"":"โปรดเลือก"});
		dwr.util.addOptions(cmbUnit,data,"unit_code","unit_name");
		dwr.util.setValue(cmbUnit,vUnitCode);
	});
  }

  function validateDecimal2(txtNum){
		if(txtNum.value != ""){
			var data = parseFloat(txtNum.value);
			$(txtNum).val(data.toFixed(2));
		}
	  }

  function validateDecimal3(txtNum){
	if(txtNum.value != ""){
		var data = parseFloat(txtNum.value);
		$(txtNum).val(data.toFixed(3));
	}
  }
  
<!--  $(document).ready(function () {-->
<!--      $('#sizes_desc').blur(function () {-->
<!--          var data = parseFloat(this.value);-->
<!--          $(this).val(data.toFixed(3));-->
<!--      });-->
<!--  });-->
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
			<input name="btnSave"  type="button" class="barbutton" value="บันทึก" onClick="test();">
			<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" onClick = "cancleedit()" >
			</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
     <tr>
       <td>&nbsp;
       		<input type="hidden" name="co_id"/>
       		<input type="hidden" name="legislation_id" value="${legislation_id}" />
       </td>
       <td><input type="checkbox" id="chkIsExhibitCo" name ="isexhibitco" onclick="toggle();" value="1" />ของกลางร่วม</td>
     </tr>
     <tbody id="isExhibitCoy" style="display: none">
       <tr>
         <td align="right">เลขที่คดี :&nbsp;</td>
         <td>

           <input type="text" name="track_no_co1"class="textView" size="15" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();"/>
           <img src="images/btn_browse.png" alt="" width="23" height="22" style="cursor:hand;"
           onClick="window.showModalDialog('process?action=Case_pop&legislation_id=${legislation_id}' , self  , 'dialogWidth=700px,dialogHeight=600px');upchg();">
           <font style="color:red">*</font>
         </td>
       </tr>
       <tr>
            <td  align="right">ประเภทของกลาง :&nbsp;</td>
            <td >
                 <input id="group_id1" name="group_id1" type="text" class="textView" value="" size="" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
                 <input id="group_name1" name="group_name1" type="text" class="textView" value="" size="" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
            </td>
       </tr>
       <tr>
            <td  align="right">ชนิดของกลาง :&nbsp;</td>
            <td >
                 <input id="duty_code1" name="duty_code1" type="text" class="textView" value="" size=""  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
                 <input id="duty_name1" name="duty_name1" type="text" class="textView" value="" size=""  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
            </td>
       </tr>
       <tr style="display:none">
            <td  align="right">ชื่อสินค้า :&nbsp;</td>
            <td >
                 <input id="product_code1" name="product_code1" type="text" class="textView" value="" size=""  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
                 <input id="product_name1" name="product_name1" type="text" class="textView" value="" size=""  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
            </td>
       </tr>
       <tr>
            <td  align="right">ยี่ห้อ :&nbsp;</td>
            <td >
                 <input id="brand_code1" name="brand_code1" type="text" class="textView" value="" size=""  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
                 <input id="brand_name1" name="brand_name1" type="text" class="textView" value="" size=""  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
            </td>
       </tr>
       <tr>
            <td  align="right">&nbsp;</td>
            <td >
              <input type="radio" name="isdomestic1" value="I" checked disabled />ในประเทศ&nbsp;&nbsp;&nbsp;
              <input type="radio" name="isdomestic1" value="O" disabled />ต่างประเทศ&nbsp;&nbsp;&nbsp;
              <input type="radio" name="isdomestic1" value="Z" disabled />ไม่ระบุ
            </td>
       </tr>
       <tr>
            <td align="right">ขนาดบรรจุ :&nbsp;</td>
            <td >
              <input id="sizesshow1" name="sizesshow1" type="text" class="textView"  size="15" value=""  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"/>
              <input id="sizes_code1" name="sizes_code1" type="hidden"  />
              <input id="sizes_unit_code1" name="sizes_unit_code1" type="hidden"  />
            </td>
       </tr>
       <tr>
            <td align="right">จำนวน :&nbsp;</td>
            <td >
              <input id="qtyshow1" name="qtyshow1" type="text" class="textView"  size="15" value=""  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"/>
              <input id="qty1" name="qty1" type="hidden"  />
              <input id="qty_unit_code1" name="qty_unit_code1" type="hidden"  />
            </td>
       </tr>
       <tr>
            <td align="right">ปริมาณสุทธิ :&nbsp;</td>
            <td >
              <input id="netweightshow1" name="netweightshow1" type="text" class="textView"  size="15" value=""  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"/>
              <input id="netweight1" name="netweight1" type="hidden"  />
              <input id="netweight_unit_code1" name="netweight_unit_code1" type="hidden"  />
            </td>
       </tr>
       <tr>
            <td align="right">สถานะของกลาง :&nbsp;</td>
            <td >ยึด<input id="status1" name="status1" type="hidden" ></td>
       </tr>
       <tr>
            <td  align="right">รายการของกลาง :&nbsp;</td>
            <td ><input id="exhibit_list1" name="exhibit_list1" type="text" class="textView"  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="45"  maxlength="20"></td>
       </tr>
       <tr>
            <td  align="right">รายละเอียด :&nbsp;</td>
            <td ><input id="exhibit_desc1" name="exhibit_desc1" type="text" class="textView"  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="45"  maxlength="20"></td>
       </tr>
       <tr>
            <td  align="right">ทะเบียนรถ :&nbsp;</td>
            <td ><input id="car_no1" name="car_no1" type="text" class="textView"  size="45"  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" maxlength="20"></td>
       </tr>
       <tr>
            <td  align="right">หมายเหตุ :&nbsp;</td>
            <td ><input id="remarks1" name="remarks1" type="text" class="textView"  size="45"  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" maxlength="20"></td>
       </tr>
     </tbody>
     <tbody id="isNoneExhibitCo">
     	<tr>
     		<td height="25" align="right">ประเภทของกลาง :&nbsp;</td>
     		<td>
     			<select id="group_id" name="group_id" style="width:300px"
     			 onChange="data[3]='';data[28]=document.formdata1.group_id.options[selectedIndex].text.replace(this.value+'-','');
     			 getDutyTable('dutyTable',this.value);ClearProduct();
     			 getDutyUnit(this.value,'SIZES','sizes_unit_code','');
     			 getDutyUnit(this.value,'QTY','qty_unit_code','');
     			 getDutyUnit(this.value,'NETWEIGHT','netweight_unit_code','');" >
     			</select>
     			<font style="color:red">*</font>
     		</td>
     	</tr>
       <tr>
		<td  height="25" align="right">ชนิดของกลาง :&nbsp;</td>
		<td >
			<select name="duty_code" id="dutyTable"  style="width:300px;" 
			  onChange="data[3]=document.formdata1.duty_code.options[selectedIndex].text.replace(this.value+'-','');ClearProduct();">
			</select>
		</td>
       </tr>
       <tr>
          <td  align="right">&nbsp;</td>
          <td >
            <input type="radio" name="isdomestic" value="I" onClick='data[8]="I"'/>ในประเทศ&nbsp;&nbsp;&nbsp;
            <input type="radio" name="isdomestic" value="O" onClick='data[8]="O"'/>ต่างประเทศ&nbsp;&nbsp;&nbsp;
            <input type="radio" name="isdomestic" value="Z" onClick='data[8]="Z"' checked />ไม่ระบุ
          </td>
       </tr>
       <tr style="display:none">
          <td  align="right">ชื่อสินค้า :&nbsp;</td>
          <td >
               <input name="product_code" id="product_code" type="text" size="10" />
               <img src="images/btn_browse.png" alt="" width="22" height="22" border="0" style="cursor:hand" onClick="productopenmodal()" />
               <input name="product_name" id="product_name" type="text" size="25" />
          </td>
       </tr>
       <tr>
          <td  align="right">ยี่ห้อ :&nbsp;</td>
          <td >
               <input id="brand_code" name="brand_code" type="text" size="10" />
               <img src="images/btn_browse.png" alt="" width="22" height="22" border="0" style="cursor:hand" onClick="brandopenmodal();" />
               <input id="brand_name" name="brand_name" type="text" size="25" />
          </td>
       </tr>

       <tr>
          <td align="right">ขนาดบรรจุ :&nbsp;</td>
          <td >
          		<input type="text" class="textNum"  name="sizes_desc" id="sizes_desc" size="11" onkeypress="ChkMinusDbl(this);"  />&nbsp;
<!--	          <select name="sizes_code" id="sizePackage"  onChange="data[21]=document.formdata1.sizes_code.options[selectedIndex].text">&nbsp;-->
<!--	          </select>-->
              	หน่วย :
               <select name="sizes_unit_code" id="sizes_unit_code" class="select" onChange='data[22]=document.formdata1.sizes_unit_code.options[selectedIndex].text'>
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
				<input name="qty" id="qty" type="text" class="textNum"   size="11" onkeypress="ChkMinusInt(this);"/>&nbsp;
               หน่วย :
               <select name="qty_unit_code" id="qty_unit_code" class="select" onChange='data[23]=document.formdata1.qty_unit_code.options[selectedIndex].text'>
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
				<input name="netweight" id="netweight" type="text" class="textNum"   onkeypress="ChkMinusDbl(this);" size="11" />&nbsp;
               หน่วย :
               <select name="netweight_unit_code" id="netweight_unit_code" class="select" onChange='data[24]=document.formdata1.netweight_unit_code.options[selectedIndex].text;'>
                    <option  value="" selected>เลือก</option>
                    <c:forEach items="${unit_list}"  var="unit1">
						<option value="${unit1.unit_code}">${unit1.unit_name}</option>
				 	</c:forEach>
               </select>
          </td>
       </tr>
       <tr>
          <td align="right">สถานะของกลาง :&nbsp;</td>
          <td >
                    <input name="status" type="radio" value="1" onClick='data[15]="1"'checked>ยึด&nbsp;&nbsp;
                    <input name="status" type="radio" value="2" onClick='data[15]="2"' >คืน&nbsp;&nbsp;
          </td>
       </tr>
       <tr>
          <td  align="right">รายการของกลาง :&nbsp;</td><!-- เดิมใช้คำว่า "รายการของกลาง" -->
          <td >
			<input name="exhibit_list" type="text"  size="45"  >
          </td>
       </tr>
       <tr>
          <td  align="right">ขนาดดีกรี :&nbsp;</td> <!--  เดิมใช้คำว่า "รายละเอียด" -->
          <td ><input name="exhibit_desc" type="text" OnKeyPress="ChkMinusDbl(this);" OnBlur="validateDecimal2(this);" size="10"   ></td>
       </tr>
       <tr>
          <td  align="right">ทะเบียนรถ :&nbsp;</td>
          <td ><input name="car_no" type="text"  size="45"  ></td>
       </tr>
       <tr>
          <td  align="right">หมายเหตุ :&nbsp;</td>
          <td ><input name="remarks" type="text" size="45"  ></td>
       </tr>
     </tbody>
</table>
</form>
<script>
update();

</script >
<script language="JavaScript" type="text/javascript">

//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("formdata1");

  //frmvalidator.addValidation("product_code","req","กรุณาเลือกสินค้า");
  frmvalidator.addValidation("group_id","req","กรุณาเลือกหมวดสินค้า");
  //frmvalidator.addValidation("sizes_code","req","กรุณาเลือกขนาด");

  </script>
</BODY>
</HTML>
