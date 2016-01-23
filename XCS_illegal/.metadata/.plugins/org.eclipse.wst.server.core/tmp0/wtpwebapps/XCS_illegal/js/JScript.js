// JScript File



function select_deselectAll (chkVal, idVal)

      {
            var frm = document.forms[0];

            // Loop through all elements

            for (i=0; i<frm.length; i++)
            {
                  // Look for our Header Template's Checkbox
                  if (idVal.indexOf ('CheckAll') != -1)
                  {
                 // Check if main checkbox is checked, then select or deselect datagrid checkboxes
                        if(chkVal == true)
                        {
                              frm.elements[i].checked = true;
                        }
                        else
                        {
                              frm.elements[i].checked = false;
                         }

                  // Work here with the Item Template's multiple checkboxes
                  }
                  else if (idVal.indexOf ('DeleteThis') != -1)

                  {
                        // Check if any of the checkboxes are not checked, and then uncheck top select all checkbox

                        if(frm.elements[i].checked == false)
                        {
                              frm.elements[1].checked = false; //Uncheck main select all checkbox
                        }
                   }
			}
      }



      function confirmDelete (frm)

      {

            // loop through all elements

            for (i=0; i<frm.length; i++)

            {

                  // Look for our checkboxes only

                  if (frm.elements[i].name.indexOf('DeleteThis') !=-1)

                  {

                        // If any are checked then confirm alert, otherwise nothing happens

                        if(frm.elements[i].checked)

                        {

                              return confirm ('Are you sure you want to delete your selection(s)?')

                        }

                  }

            }

      }


function ChangePage(id)
{
    // save the page number clicked to the hidden field
    document.all.PageNumber.value = id;
    // call the __doPostBack function to post back
    // the form and execute the PageClick event
    __doPostBack('PageClick','');
}

function ChkMinusDbl(ctl, e) {
    var evt = e ? e : window.event;
    var zz = evt.keyCode || evt.charCode;
    
    if (zz < 48 || zz > 57) {
        if (zz == 46) {
            if (ctl.value.indexOf(".", 0) >= 0) {
                if(window.event)//IE
                    event.returnValue = false;
                else //Firefox
                    e.preventDefault();
            }
        }
        else {
            if (window.event)//IE
                event.returnValue = false;
            else  //Firefox
                e.preventDefault();
        }

    }
}

function ChkMinusInt(ctl, e) {
    var evt = e ? e : window.event;
    var zz = evt.keyCode || evt.charCode;

    if (zz < 48 || zz > 57) {
        if(window.event)
            event.returnValue = false;
        else
            e.preventDefault();
    }
}

function MM_jumpMenu(targ,selObj,restore){ //v3.0
 	 eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  	if (restore) selObj.selectedIndex=0;
}
function checkIDcard(idCard){
	var id = idCard.value;
	if(id.length > 12){
		return false;
	}
    var charId = (event.which) ? event.which : event.keyCode
    if (charId > 31 && (charId < 48 || charId > 57)) {
    	return false
    }
    return true
}
function checkcase_fine(fine){
	var id = new String("");
	id=fine.value;
	var i;
	for(i=0; i<id.length; i++){
		if (id.charCodeAt(i) > 31 && (id.charCodeAt(i) < 48 || id.charCodeAt(i) > 57)) {
			fine.value="";
			fine.focus();
	    	return false
	    }
	}
	//return true
	/*
	if(id.length > 8){
		return false;
	}
    var charId = (event.which) ? event.which : event.keyCode
    if (charId > 31 && (charId < 48 || charId > 57)) {
    	return false
    }
    */
    //return true
    
}
function txtTime_OnKeyPress(sender) {
    var myTime = sender.value;
    if(myTime.length>4) {
        //event.keyCode = 0;
    	event.returnValue = false;
        return false;
    }
    

    var charCode = (event.which) ? event.which : event.keyCode
    switch (myTime.length) {
        case 0:
            if (charCode < 48 || charCode > 50){
                //event.keyCode = 0;
            	event.returnValue = false;
            }
            break;
        case 1:
        	if(myTime == 2){
        		if(charCode>51)
        			//event.keyCode = 0;
        			event.returnValue = false;
        	}else{
        		if(charCode<48 || charCode>57)
        			//event.keyCode = 0;
        			event.returnValue = false;
        	}
            break;
        case 2:
        	{
               if (charCode < 48 || charCode > 53)
               {
                    //event.keyCode = 0;
                    event.returnValue = false;
               }
               sender.value = sender.value + ':';       	
        	}
            break;
        case 3:
            if (charCode<48||charCode > 53) 
            {
            	//event.keyCode = 0;
            	event.returnValue = false;
            }
            //alert(3);
            break;
        default:
            if (charCode < 48 || charCode > 57) 
            	{
            		//event.keyCode = 0;
            		event.returnValue = false;
            	}
        
    }
}

function ValidateTime(sender) {
    if (sender.value.length == 0) return false;
    var regEx = /^(\d{2}):(\d{2})$/;
    var arrMatch = sender.value.match(regEx);
    if (arrMatch == null) {
        alert("Invalid time.");
        sender.value = "";
        return false;
    }
    var hh = arrMatch[1];
    var mm = arrMatch[2];
    if (hh >= 24 || mm >= 60) {
        alert("Invalid time.");
        sender.value = "";
        return false;
    }
    return true;
}

function trim(str) {
	str = str.replace(/^\s+/, '');
	for (var i = str.length - 1; i >= 0; i--) {
		if (/\S/.test(str.charAt(i))) {
			str = str.substring(0, i + 1);
			break;
		}
	}
	return str;
}

function myPopup(url,width,height){
	window.showModalDialog(url,window,"dialogHeight:"+height+",dialogWidth:"+width+",resizeable:true");
}

function getProvince(id,district_id,tambol_id,province_code,setdis_code,settam_code){
	SelectRegion.getProvince(function(data){
		dwr.util.removeAllOptions(id);
		dwr.util.addOptions(id,[{province_code:"",province_name:"โปรดเลือก"}],"province_code","province_name");
		dwr.util.addOptions(id,data,"province_code","province_name");
		
		if( province_code!=null && province_code!="" ){
			dwr.util.setValue(id,province_code);
		}else{
			dwr.util.setValue(id,"");
		}
		getDistrict(district_id,tambol_id,dwr.util.getValue(id),setdis_code,settam_code);
	});
}
function getDistrict(id,tambol_id,province_code,setdis_code,settam_code){
	SelectRegion.getDistrict(province_code,function(data){

		dwr.util.removeAllOptions(id);
		dwr.util.addOptions(id,[{district_code:"",district_name:"โปรดเลือก"}],"district_code","district_name");
		dwr.util.addOptions(id,data,"district_code","district_name");
		if( setdis_code!=null && setdis_code!="" ){
			dwr.util.setValue(id,setdis_code);
		}else{
			dwr.util.setValue(id,"");
		}
		getTambol(tambol_id,dwr.util.getValue(id),settam_code);
	});
}
function getTambol(id,district_code,settam_code){
	SelectRegion.getTambol(district_code,function(data){
		dwr.util.removeAllOptions(id);
		dwr.util.addOptions(id,[{subdistrict_code:"",subdistrict_name:"โปรดเลือก"}],"subdistrict_code","subdistrict_name");
		
		dwr.util.addOptions(id,data,"subdistrict_code","subdistrict_name");
		if( settam_code!=null && settam_code!="" ){
			dwr.util.setValue(id,settam_code);
		}else{
			dwr.util.setValue(id,"");
		}
		});
}
function setOfficeProvince(province_id,district_id,tambol_id,office_code){
	SelectRegion.getProvince(function(data){
		dwr.util.removeAllOptions(province_id);
		dwr.util.addOptions(province_id,[{province_code:"",province_name:"โปรดเลือก"}],"province_code","province_name");
		dwr.util.addOptions(province_id,data,"province_code","province_name");
		
		if(office_code!=null && office_code!="" ){
			EdOfficeTest.getOfficeTambol(office_code,function(result){
				//alert(result.substring(0,2) + " ### " + result.substring(0,4) + " ### " + result);
				dwr.util.setValue(province_id,result.substr(0,2));
				getDistrict(district_id,tambol_id,dwr.util.getValue(province_id),result.substring(0,4),result);
			})
		}else{
			dwr.util.setValue(province_id,"");
		}
	})
}

function setGroupID(group_id, vLegislationID, vGroupID){
	//alert(vLegislationID);
	LegislationProduct.getDutyGroup(vLegislationID,function(data){
		dwr.util.removeAllOptions(group_id);
		//dwr.util.addOptions(group_id,[{group_id:"",group_name:"เลือก"}],"group_id","group_name");
		dwr.util.addOptions(group_id,data,"group_id","group_name");
		
		if(vGroupID!=null && vGroupID!="" ){
			dwr.util.setValue(group_id,vGroupID);
		}
	})
}

function lengthVali(id,size){
	var str = id.value ;
	//alert(str);
		if(str.length != size && str.length>0)
			id.focus();
	}
function uploadPreview(uploadImage,preview_id) {
	var image_id = uploadImage['id'];
	var image = dwr.util.getValue(image_id);
	FileUploader.checkUploadSize(image, function(data) {
		if( !data ){
			alert("ไฟล์ size มีขนาดเกิน กรุณาเลือกไฟล์ใหม่ ");
			dwr.util.setValue(image_id,"");
			dwr.util.setValue(preview_id,"");
		}else{
			FileUploader.uploadPreview(image,function(data) {
			    dwr.util.setValue(preview_id, data);
			});
		}
	});
}
function checkUploadSize(uploadImage){
	var image_id = uploadImage['id'];
	var image = dwr.util.getValue(image_id);
	FileUploader.checkUploadSize(image, function(data) {
		if( !data ){
			alert("ไฟล์ size มีขนาดเกิน กรุณาเลือกไฟล์ใหม่ ");
			dwr.util.setValue(image_id,"");
		}
	});
}
function printReports(repName)
{
	Reports.ReportUrl(function(data){
		if(data != ""){
			window.open(data + 'ReportName=' + repName + "&vReportType=PDF&time=" + Math.random(),'_blank', 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			if (repName != "")
				window.open('process?action=Report&__report=' + repName + '&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			else
				alert("Report Not Found");
		}
	});
}
function checkFileExtension(source){
	var fileTypes=["bmp","gif","png","jpg","jpeg"];
	var ext=source.substring(source.lastIndexOf(".")+1,source.length).toLowerCase();
	for (var i=0; i<fileTypes.length; i++) 
		  if (fileTypes[i]==ext) break;
}
function clearInputFile(uploadImage){
	var theform = uploadImage.form;
	var remElem = uploadImage;
	var newElem = document.createElement("input");
    newElem.setAttribute("type","file");
    newElem.setAttribute("id",uploadImage.id);
    newElem.setAttribute("name",uploadImage.name);
    newElem.onchange = uploadImage.onchange;
	theform.replaceChild(newElem, remElem);
}
function checkFileExtension(uploadImage){
	var source = uploadImage.value;
	var fileTypes=["bmp","gif","png","jpg","jpeg"];
	var ext=source.substring(source.lastIndexOf(".")+1,source.length).toLowerCase();
	for (var i=0; i<fileTypes.length; i++){
		  if (fileTypes[i]==ext){
			  return true;
		  }
	}
	alert("กรุณาเลือกไฟล์ที่มีนามสกุล .bmb,.gif,.png,.jpg,.jpeg เท่านั้น");
	clearInputFile(uploadImage);
	return false;
}
function uploadImgPreview(uploadImage,preview_id,table) {
	if ( checkFileExtension(uploadImage) ){
		document.getElementById(preview_id).src="images/wait.gif";
		var theForm = uploadImage.form;
		var originalUrl = theForm.action;
		theForm.action = "process?action=Ajax&cmd=uploadPreview&preview_id="+preview_id+"&table="+table;
		theForm.target="hiddenframe";
		theForm.submit();
		// change to original
		theForm.target="";
		theForm.action = originalUrl;
	}
}
function uploadImg(image_id,table,id,preview_id){
	if ( checkFileExtension(document.getElementById(image_id)) ){
		document.getElementById(preview_id).src="images/wait.gif";
		var theForm = document.getElementById(image_id).form;
		var originalUrl = theForm.action;
		theForm.action = "process?action=Ajax&cmd=upload&preview_id="+preview_id+"&table="+table+"&id="+id;
		theForm.target="hiddenframe";
		theForm.submit();
		// change to original
		theForm.target="";
		theForm.action = originalUrl;
	}
}
function testB(){

}
function getSector(id,offcode){
	EdOfficeTest.getSector(function(data){
		dwr.util.addOptions(id,[{offcode:"",offname:"เลือก"}],"offcode","offname");
		dwr.util.addOptions(id,data,"offcode","offname");
		
		if(offcode!=null && offcode!="" ){
			dwr.util.setValue("sector_code",offcode);
		}else{
			dwr.util.setValue(sector_code,"");
		}
	});
	}
function getArea(id_sel,value){
	var tmp = value.substr(0,2);
	EdOfficeTest.getArea(tmp, function(data){
		dwr.util.removeAllOptions(id_sel);
		dwr.util.addOptions(id_sel,[{offcode:"",offname:"เลือก"}],"offcode","offname");
		dwr.util.addOptions(id_sel,data,"offcode","offname");
		
		
		if( value!=null && value!="" ){
			dwr.util.setValue(id_sel,value);
			//getBranch(area_id,branch_id,dwr.util.getValue(id),setdis_code,settam_code);
		}else{
			dwr.util.setValue(id_sel,"");
		}
	}); 
	}
function getBranch(id_sel,value){
	var tmp = value.substr(0,4);
	EdOfficeTest.getBranch(tmp, function(data){
		dwr.util.removeAllOptions(id_sel);
		dwr.util.addOptions(id_sel,[{offcode:"",offname:"เลือก"}],"offcode","offname");
		dwr.util.addOptions(id_sel,data,"offcode","offname");
		
		if( value!=null && value!="" ){
			dwr.util.setValue(id_sel,value);
		}else{
			dwr.util.setValue(id_sel,"");
		}
	}); 
	}
function getOffname(vOffcode,isShortName, txtOffname){
	if(vOffcode.length==6){
		EdOfficeTest.getOffname(vOffcode,isShortName,function(data){
			dwr.util.setValue(txtOffname,data);
		});
	}else{
		txtOffname.value="";
	}
}

function CheckNum(){ 
    if (event.keyCode < 48 || event.keyCode > 57){ 
          event.returnValue = false; 
     } 
}

function clearBranch(){ 
    if (keyCode < 48 || keyCode > 57){ 
    	dwr.util.removeAllOptions(id_sel);; 
          } 
  } 

function AddComma(valIn)
{
	if (parseFloat(valIn) < 0.00) 
		j = 4;
	else
		j = 3;
		
	//var i = posStart;
	var  i = formatDbl(valIn).length - 3;
	//i = 0;              this line for block addcomma to not working...
	var temp = formatDbl(valIn);
	while (i > j) {
		i = i - 3;
		//ret = temp.toString();
		temp = temp.substr(0,i) + "," + temp.substr(i, temp.length);
		
	}
	return temp;
}

function ClearComma(valIn)
{
	temp = valIn;
	while (temp.indexOf(",", 0) != -1)
		temp = temp.replace(",", "");
	
	return temp;
}

function formatDbl(valIn)
{
	var temp = valIn;
	if ( isNaN( parseFloat(temp) ) ) {
		temp = 0;
	}
	var temp = "" + Math.round(parseFloat(temp) * 100 );
	if (temp == 0)
		return '0.00';
	else {
		if ( parseFloat(temp) < 0) {
			temp = temp.substring(1, temp.length);
			var i = temp.length;
			while (i < 3)
			{
				temp = "0" + temp;
				i = i+1;
			}
			i = i-2;
			temp = "-" + temp.substring(0,i) + "." + temp.substring(i, temp.length);
			
		}
		else {
			var i = temp.length;
			while (i < 3)
			{
				temp = "0" + temp;
				i = i+1;
			}
			i = i-2;
			temp = temp.substring(0,i) + "." + temp.substring(i,temp.length);  
		}
			return temp;
	}
}




function getThaiBaht(Number){
//ตัดสิ่งที่ไม่ต้องการทิ้งลงโถส้วม
	Number = AddComma(Number);
	for (var i = 0; i < Number.length; i++)
	{
		Number = Number.replace (",", ""); //ไม่ต้องการเครื่องหมายคอมมาร์
		Number = Number.replace (" ", ""); //ไม่ต้องการช่องว่าง
		Number = Number.replace ("บาท", ""); //ไม่ต้องการตัวหนังสือ บาท
		Number = Number.replace ("฿", ""); //ไม่ต้องการสัญลักษณ์สกุลเงินบาท
	}
	
//สร้างอะเรย์เก็บค่าที่ต้องการใช้เอาไว้
	var TxtNumArr = new Array ("ศูนย์", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า", "สิบ");
	var TxtDigitArr = new Array ("", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน");
	var BahtText = "";
	
	//ตรวจสอบดูซะหน่อยว่าใช่ตัวเลขที่ถูกต้องหรือเปล่า ด้วย isNaN == true ถ้าเป็นข้อความ == false ถ้าเป็นตัวเลข
	if (isNaN(Number)){
		return "ข้อมูลนำเข้าไม่ถูกต้อง";
	}else{
		//ตรวสอบอีกสักครั้งว่าตัวเลขมากเกินความต้องการหรือเปล่า
		if ((Number - 0) > 9999999.9999){
			return "ข้อมูลนำเข้าเกินขอบเขตที่ตั้งไว้";
		}else{
			//พรากทศนิยม กับจำนวนเต็มออกจากกัน (บาปหรือเปล่าหนอเรา พรากคู่เขา)
			Number = Number.split (".");
			//ขั้นตอนต่อไปนี้เป็นการประมวลผลดูกันเอาเองครับ แบบว่าขี้เกียจจะจิ้มดีดแล้ว อิอิอิ
			if (Number[1].length > 0){
				Number[1] = Number[1].substring(0, 2);
			}
			
			var NumberLen = Number[0].length - 0;
			for(var i = 0; i < NumberLen; i++){
				var tmp = Number[0].substring(i, i + 1) - 0;
				if (tmp != 0){
					if ((i == (NumberLen - 1)) && (tmp == 1)){
						BahtText += "เอ็ด";
					} else if ((i == (NumberLen - 2)) && (tmp == 2)){
						BahtText += "ยี่";
					} else if ((i == (NumberLen - 2)) && (tmp == 1)){
						BahtText += "";
					} else{
						BahtText += TxtNumArr[tmp];
					}
					
					BahtText += TxtDigitArr[NumberLen - i - 1];
				}
			}
			
			BahtText += "บาท";
			if ((Number[1] == "0") || (Number[1] == "00")){
				BahtText += "ถ้วน";
			}else{
				DecimalLen = Number[1].length - 0;
				for (var i = 0; i < DecimalLen; i++){
					var tmp = Number[1].substring(i, i + 1) - 0;
					if (tmp != 0){
						if ((i == (DecimalLen - 1)) && (tmp == 1)){
						BahtText += "เอ็ด";
						} else if ((i == (DecimalLen - 2)) && (tmp == 2)){
							BahtText += "ยี่";
						} else if ((i == (DecimalLen - 2)) && (tmp == 1)){
							BahtText += "";
						} else{
							BahtText += TxtNumArr[tmp];
						}
						
						BahtText += TxtDigitArr[DecimalLen - i - 1];
					}
				}
				BahtText += "สตางค์";
			}
			return BahtText;
		}
	}
}


function disableKeyDown(e) {
    var evt = e || window.event;
    if (evt) {
        var keyCode = evt.charCode || evt.keyCode;
        //alert(keyCode);
        if (keyCode == 8 || keyCode==46) {  //ตรวจสอบการกดปุ่ม BackSpace กับปุ่ม Delete ถ้าผู้ใช้กดปุ่มใดปุ่มนึง ก็ไม่ได้ทำงาน
            if (evt.preventDefault) {
                evt.preventDefault();
            } else {
                evt.returnValue = false;
            }
        }
    }
    
}

//function txtKeyPress(){
	//event.returnValue = false;
	//window.event.keyCode = 0;
//}
function txtKeyPress(e) { 
    e.preventDefault();
}

function getUnitName(unit_code, txtID){
	Master.getUnitName(unit_code,function(data){
		if(data != null){
			dwr.util.setValue(txtID, data);
		}
	});
}

