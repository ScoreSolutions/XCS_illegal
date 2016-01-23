function clickConfirm() {
	var confirm_button = confirm("ยืนยัน" + module_name);
	if (confirm_button && document.formdata1.onsubmit()) {
		document.formdata1.action = "process?action=" + action_form+ "&cmd=update&id="+so_id+"&confirm=true";
		document.formdata1.status.value = '2';
		document.formdata1.submit();
	}
}
function clickBack() {
	document.formdata1.action = "process?action=" + action_form+ "&is_back=true";
	document.formdata1.submit();
}
function clickReset() {
	document.formdata1.action = "process?action=" + action_form+ "&cmd=edit&id="+so_id+"&reset=true";
	document.formdata1.submit();
}

function rerun_id(){
	//alert(document.formdata1.row_num.value);
	sum_qty = 0;
	if(document.formdata1.row_num != null){
		if (!document.formdata1.row_num.length){
			document.formdata1.row_num.value=1;
			sum_qty += parseFloat(document.formdata1.qty.value);
			//alert(document.formdata1.row_num.value);
		}
		for (var i=0; i < document.formdata1.row_num.length; i++){
			document.formdata1.row_num[i].value=i+1;
			sum_qty += parseFloat(document.formdata1.qty[i].value);
			//alert(document.formdata1.row_num[i].value);
		}	
	}
	var total = document.getElementById("total");
	//alert("sum_qty="+sum_qty);
	total.innerHTML = sum_qty+" "+unit_desc;
}
function removeCheckBox(){
	var table_id = 'exhibit_table';
	var ans;
	if(document.formdata1.check_list.length != undefined);
	if(document.formdata1.check_list.length != undefined && 
			document.formdata1.check_list.length != null && 
			document.formdata1.check_list.length > 0){
		
		ans = confirm("ต้องการลบรายการ ใช่หรือไม่");
		if(ans){
			var i = document.formdata1.check_list.length;
			while(i > 0){
				if (document.formdata1.check_list[i-1] != null && document.formdata1.check_list[i-1].checked){
					sum_qty -= document.formdata1.qty[i-1].value;
					document.getElementById(table_id).deleteRow(i);
					if(max_row > 1){
						max_row--;
					}
				}
				i--;
			}
		}
	}else{
		if(document.formdata1.check_list.checked){
			ans = confirm("ต้องการลบรายการ ใช่หรือไม่");
			if(ans){
				sum_qty -= document.formdata1.qty.value;
				document.getElementById(table_id).deleteRow(1);
				max_row--;
			}
		}
	}
	rerun_id();
}


function openExhibitPopup(){	

	var legis_id = document.formdata1.legislation_id.value;
	var stockout_id = document.formdata1.id.value;
	if("" == legis_id || null == legis_id){
		alert("กรุณาเลือก พ.ร.บ.");
	}else{
		//var data = window.showModalDialog('Popup/manage_exhibit_add.jsp' , self , 'Width=650px,Height=500px');
		//var data = window.showModalDialog('process?action=ExhibitCase_pop' , self  , 'dialogWidth=700px,dialogHeight=600px');
		var data = window.showModalDialog('process?action=ManageExhibitAddPop&stockout_id='+stockout_id , self  , 'dialogWidth=700px,dialogHeight=600px');
		if(data != null){
			for(var i=0;i<data.length;i++){
				if(data[i] != undefined){
					exhibitInsert("exhibit_table",data[i]);
				}						
			}
		}
	}	
}

function check_all(chkcont,chk){
	if(chk != null){			
		if(chkcont.checked == true){
			if(chk.length == null){
				chk.checked = true;
			}else{
				for (i = 0; i < chk.length; i++)
					chk[i].checked = true ;
			}				
		}else{
			if(chk.length == null){
				chk.checked = false;
			}else{
				for (i = 0; i < chk.length; i++)
					chk[i].checked = false ;
			}
		}
	}		
}

function chkDuplicate(dataForm, data, i){
	var ret = false;
	
	var vDeliveryID = data[17];
	var vProductCode = data[5];
	var vBrandCode = data[8];
	var vDutyCode = data[21];
	var vSizeCode = data[10];
	var vSizeUnitCode = data[11];
	var vUnitCode = data[20];
	var vIsDomestic = data[15];
	
	if(i== -1){
		if(dataForm.delivery_code.value==vDeliveryID && dataForm.product_code.value==vProductCode
			&& dataForm.brand_code.value==vBrandCode && dataForm.size_code.value==vSizeCode
			&& dataForm.size_unit_code.value==vSizeUnitCode && dataForm.unit_code.value==vUnitCode
			&& dataForm.isdomestic.value==vIsDomestic && dataForm.duty_code.value==vDutyCode)
				ret = true;
	}else{
		if(dataForm.delivery_code[i].value==vDeliveryID && dataForm.product_code[i].value==vProductCode
			&& dataForm.brand_code[i].value==vBrandCode && dataForm.size_code[i].value==vSizeCode
			&& dataForm.size_unit_code[i].value==vSizeUnitCode && dataForm.unit_code[i].value==vUnitCode
			&& dataForm.isdomestic[i].value==vIsDomestic && dataForm.duty_code[i].value==vDutyCode)
				ret = true;
	}
	return ret;
}


function exhibitInsert(table_id,data){

	var t = document.getElementById("exhibit_table").rows;
	for(i=0;i<t.length-2;i++){   //ในแต่ละตารางจะมีหัวกับท้ายอยู่แล้ว ก็เลยต้องลบออก 2 แถว
		if(document.formdata1.delivery_code.length == undefined){
			if (chkDuplicate(document.formdata1,data,-1)) {
				return;
			}
		}else{
			if (chkDuplicate(document.formdata1,data,i)) {
				return;
			}
		}
	}
	
	
	var row;
	max_row = t.length - 1;
	var my_table=document.getElementById(table_id).insertRow(max_row);
	max_row++;
	row = max_row - 1;
	//row = max_row ;
	//alert("row="+row);
	var cell_1=my_table.insertCell(0);
	var cell_2=my_table.insertCell(1);
	var cell_3=my_table.insertCell(2);
	var cell_4=my_table.insertCell(3);
	var cell_5=my_table.insertCell(4);
	var cell_6=my_table.insertCell(5);
	var cell_7=my_table.insertCell(6);
	var cell_8=my_table.insertCell(7);
	var cell_9=my_table.insertCell(8);
	
	unit_desc = data[12];
	//ชื่อสินค้า ยี่ห้อ ใน/นอก ขนาดบรรจุ จำนวน จำนวนที่ขาย ปริมาณสุทธิ
	//alert("รวม");
	cell_1.innerHTML="<div align='center'><input readonly class='textboxlist' size='1' name='row_num' value='" + row + "' /></div>";//running
	//alert("cell_1");
	cell_2.innerHTML="<div align='center'><input type='checkbox' name='check_list' value=''></div>";//checkbox
	//alert("cell_2");
	cell_3.innerHTML="<div >"+data[6]+"<input type='hidden' name='product_code' value='"+data[5]+"'><input type='hidden' name='duty_code' value='" + data[21] + "'></div>";//ชื่อสินค้า
	//alert("cell_3");
	cell_4.innerHTML="<div >"+ data[9]+"<input type='hidden' name='brand_code' value='"+data[8]+"'></div>";//ยี่ห้อ
	//alert("cell_4");
	cell_5.innerHTML="<div align='center'>"+ data[16]+"<input type='hidden' name='isdomestic' value='"+data[15]+"'></div>";//ใน นอก
	//alert("cell_5");
	cell_6.innerHTML="<div align='center'>"+data[19]+" "+ data[18]+"<input type='hidden' name='size_code' value='"+data[10]+"'>"+"<input type='hidden' name='size_unit_code' value='"+data[11]+"'>" + "<input type='hidden' name='unit_code' value='"+data[20]+"'></div>";//ขนาดบรรจุ
	//alert("cell_6");
	cell_7.innerHTML="<div align='center'>"+data[7]+" "+data[12]+"<input type='hidden' name='qty_amount' id='qty_amount"+ row +"' value='"+data[7]+"'></div>";//จำนวนเหลือคงคลัง
	//alert("cell_7");
	cell_8.innerHTML= "<div align='left'><input type='text' name='qty' size='3' value='"+data[7]+"' class='textNum' OnKeyPress='ChkMinusDbl(this);' OnBlur='return ChkStockRemain(qty_amount" + row + ",this);' />"+data[12]+"</div>";//จำนวนที่ขาย
	//alert("cell_8");
	cell_9.innerHTML= "<div ><input type='text' name='netweight' size='3' value='"+data[13]+"' class='textNum' OnKeyPress='ChkMinusDbl(this);' />"
		+getUnitSelect(data[14],row, data[25])+"</div><input type='hidden' name='delivery_code' value='"+data[17]+"'><input type='hidden' name='ref_stockout_id' value='"+data[22]+"'>" //ปริมาณสุทธิ
		+"<input type='hidden' name='group_id' value='"+data[25]+"'>"
		+"<input type='hidden' name='product_name' value='"+data[6]+"'>"
		+"<input type='hidden' name='brand_name' value='"+data[9]+"'>"
		+"<input type='hidden' name='qty_unit_name' value='"+data[12]+"'>"
		+"<input type='hidden' name='sizes_desc' value='"+data[19]+"'>"
		+"<input type='hidden' name='sizes_unit_name' value='"+data[18]+"'>"
		+"<input type='hidden' name='netweight_unit_name' id='netweight_unit_name" + row +"' value='"+data[24]+"'>"
		+"<input type='hidden' name='duty_name' value='"+data[23]+"'>"
		+"<input type='hidden' name='group_name' value='"+data[26]+"'>";
	sum_qty += parseFloat(data[7]);
	
	rerun_id();
	
	
	
}

function getUnitSelect(id_select,row, group_id){
	
	var select_breaker = " <select name='netweight_unit' class='select' style='width:150px' ";
		select_breaker += " onChange='getUnitName(this.value,netweight_unit_name"+row+");' >";
		select_breaker += "<option value=''>กรุณาเลือก</option>";
	for(var i=0;i<jsonUnit.length;i++){
		if(jsonUnit[i].group_id==group_id){
			var select_flag = (parseInt(id_select)==parseInt(jsonUnit[i].unit_code))?" selected ":"";
			select_breaker += "<option value='"+jsonUnit[i].unit_code+"'"+select_flag+">"+jsonUnit[i].thname+"</option>";
		}
	}
	select_breaker += "</select>";
	return select_breaker; 
}

function tosubmit(){
	//ใช้สำหรับหน้าจอ ทำลาย ขาย คืน จัดเก็บ และโอน

	var rowCount = document.getElementById('exhibit_table').rows.length;
	if(document.formdata1.onsubmit()){
		if(rowCount <= 2){
			alert("กรุณาเพิ่มรายการของกลาง");
			return false;				
		}else
			//document.formdata1.submit();
			return true;
	}else
		return false;
}

function ChkStockRemain(RemainID, QtyID){
	if(parseFloat(RemainID.value) < parseFloat(QtyID.value)){
		alert("จำนวนคงเหลือไม่เพียงพอ");
		QtyID.select();
		return false;
	}else{
		rerun_id();
		return true;
	}
}