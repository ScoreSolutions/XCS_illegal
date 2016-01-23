<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>

<%@include file="/Templates/meta.jsp" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<base target="_self" />
<title>รายชื่อผู้กระทำผิด : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/javascript" src="js/gen_validatorv31.js"></script>
<script type='text/javascript' src='<c:url value="/dwr/interface/SelectRegion.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/util.js"/>'></script>
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<script type='text/javascript' src='dwr/util.js'></script>
<script type='text/javascript' src='dwr/interface/Lawbreaker.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='<c:url value="/js/JScript.js"/>'></script>
<script language="javascript">
var cdata = new Array();

var opener = window.dialogArguments;
var row = opener.lawseditrow;
row = row - 1;

for(i=0;i<=34;i++){
	cdata[i]="";
}


function toggleLawbreakerType()
  {
    var cmbValue=document.getElementById("cmbLawBreakerType").value;
    if(cmbValue =="1"){
      document.getElementById("1").style.display = '';
      document.getElementById("2").style.display='none';
      document.getElementById("3").style.display='none';
    }else if(cmbValue=="2"){
      document.getElementById("1").style.display = 'none';
      document.getElementById("2").style.display='';
      document.getElementById("3").style.display='none';
    }else if(cmbValue=="3"){
      document.getElementById("1").style.display = 'none';
      document.getElementById("2").style.display='none';
      document.getElementById("3").style.display='';
    }
}

var districtDB="";
var subdistrictDB="";
var provinceDB="";
var forcese="";
function appendOption(num,text,field)
{
	  var elOptNew = document.createElement('option');
	  elOptNew.text = text;
	  elOptNew.value = num;
	  var elSel = document.getElementById(field);

	  try {
	    elSel.add(elOptNew, null); // standards compliant; doesn't work in IE
	  }
	  catch(ex) {
	    elSel.add(elOptNew); // IE only
	  }
	  
      document.getElementById(field).selectedIndex =document.getElementById(field).length-1;
			//alert (document.getElementById(field).options[document.getElementById(field).length-1].text	);
}
	
var chValue;
function cancleedit(){
	//if(opener.lawseditna == 1){
	//	update();
	//}else{
	//	document.dataform.reset();
	//}
	window.close();
}

function fncAlert(){
	var type;
	var selValue = document.getElementById("cmbLawBreakerType").value;

	if (selValue == "1"){
		chValue = document.getElementById("txtIDCardNo").value;
		type="1";
	}
	if (selValue == "2"){
		chValue = document.getElementById("txtPassPortNo").value;
		type="2";
	}
	if (selValue == "3"){
		chValue = document.getElementById("excise_reg_no").value;
		type="3";
  	}

	if (chValue != "" && chValue.length < 13 && selValue == "1"){
   		alert('กรุณากรอกเลขบัตรประชาชนให้ครบ 13 หลัก');
   		document.getElementById("txtIDCardNo").select();
   		return false;
   	}

    if (chValue.length != 0){
		Lawbreaker.getByIdCard(type,chValue, function(data) {
			if(data != null){
				dwr.util.setValue("sex",data.sex);
				dwr.util.setValue("nick_name",data.title_code);
				dwr.util.setValue("nick_name2",data.title_code);
				dwr.util.setValue("nick_name3",data.title_code);
				dwr.util.setValue("txtIDCardNo",data.lawbreaker_id_card);
				dwr.util.setValue("first_name",data.first_name);
				dwr.util.setValue("last_name",data.last_name);
				dwr.util.setValue("first_name2",data.first_name);
				dwr.util.setValue("last_name2",data.last_name);
				dwr.util.setValue("first_name3",data.first_name);
				dwr.util.setValue("last_name3",data.last_name);
				dwr.util.setValue("other_name",data.other_name);
				dwr.util.setValue("home_number",data.address_no);
				dwr.util.setValue("moo",data.moo);
				dwr.util.setValue("soi",data.soi);
				dwr.util.setValue("road",data.road);
				dwr.util.setValue("cmbRace",data.race_id);
				dwr.util.setValue("cmbNationality",data.nation_id);
				dwr.util.setValue("career",data.career);
				dwr.util.setValue("birthdate",data.birth_date2);
				dwr.util.setValue("father_name",data.father_name);
				dwr.util.setValue("mother_name",data.father_name);
				dwr.util.setValue("excise_reg_no",data.excise_reg_no);
				dwr.util.setValue("company_name",data.company_name);
				dwr.util.setValue("company_title_code",data.title_code_company);
				dwr.util.setValue("middle_name",data.middle_name);
				dwr.util.setValue("txtPassPortNo",data.lawbreaker_passport);

				if(data.ls_type == "LAWBREAKER"){
					dwr.util.setValue("lawbreaker_no", data.lawbreaker_no);
				}
				
				cdata[3]  =  data.sex;
				cdata[22]  = data.title_name ;
				cdata[23]  = data.province_name ;
				cdata[24]  = data.district_name;
				cdata[25]  = data.subdistrict_name ;
				cdata[26]  = data.race_id_name ;
				cdata[27]  = data.nationality_id_name ;
				if(data.birth_date2 != null){
	   				var str=data.birth_date2.toString();
	   				str = str.substring(6,10);
					var nu = new Date();
					var y1 =  parseInt(nu.getFullYear()+543);
					var y2 = parseInt(str);
	   				dwr.util.setValue("agecal",y1-y2);
	   			}else{
	       			dwr.util.setValue("agecal","");
	       		}
	
				getProvince('province','district','tambol',data.province_code,data.district_name,data.subdistrict_name);
	
				if(data.sex == 'M'){
					document.dataform.sex[0].checked=true;
					document.dataform.sex2[0].checked=true;
				}else if(data.sex == 'F'){
					document.dataform.sex[1].checked=true;
					document.dataform.sex2[1].checked=true;
				}
			}else{
				alert("ไม่พบเลขบัตรประจำตัวประชาชนนี้ในระบบ");
			}
 		});
    }
}

function calage(){
		var doc = document.dataform;
		if(doc.birthdate.value!=""){
			var str=doc.birthdate.value;
			str = str.substring(6,10);
			var nu = new Date();
			var y1 =  parseInt(nu.getFullYear()+543);
			var y2 = parseInt(str);
	
			doc.agecal.value=y1-y2;
		}else{doc.agecal.value="";}
}

function checkIDcard(idCard){
	var id = idCard.value;
    var charId = (event.which) ? event.which : event.keyCode
    if (charId > 31 && (charId < 48 || charId > 57)) {
    	event.keyCode = 0;
    }
}

function checkName(name){
	var id = name.value;
    var charName = (event.which) ? event.which : event.keyCode
    if (charName > 47 && charName < 58) {
    	event.keyCode = 0;
    }
    
}
function checkIDinter(idinter){
	var id = idinter.value;
	
    var charIdin = (event.which) ? event.which : event.keyCode
    if ((charIdin > 47 && charIdin < 58) || (charIdin > 64 && charIdin < 91)) {
    	//alert(charIdin);
    	
    }else{
    	event.keyCode = 0;
    }
}

function saveto()
{
	if(document.getElementById("cmbLawBreakerType").value == "1"){
		if(document.dataform.sex[0].checked==true){
			cdata[3]=document.dataform.sex[0].value;
		}else{
			cdata[3]=document.dataform.sex[1].value;
		}
	}else if(document.getElementById("cmbLawBreakerType").value == "2"){
		if(document.dataform.sex2[0].checked==true){
			cdata[3]=document.dataform.sex2[0].value;
		}else{
			cdata[3]=document.dataform.sex2[1].value;
		}
	}else{
		cdata[3]="";
	}

	cdata[1] = document.dataform.cmbLawBreakerType.value ;
	cdata[2] = document.dataform.txtIDCardNo.value ;
	cdata[7] = document.dataform.other_name.value ;
	cdata[8] = document.dataform.home_number.value ;
	cdata[9] = document.dataform.moo.value ;
	cdata[10] = document.dataform.soi.value ;
	cdata[11] = document.dataform.road.value ;
	cdata[12] = document.dataform.province.value ;
	cdata[13] = document.dataform.district.value ;
	cdata[14] = document.dataform.tambol.value ;
	cdata[15] = document.dataform.cmbRace.value ;
	cdata[16] = document.dataform.cmbNationality.value ;
	cdata[17] = document.dataform.career.value ;
	cdata[18] = document.dataform.birthdate.value ;	
	cdata[19] = document.dataform.father_name.value ;
	cdata[20] = document.dataform.mother_name.value ;

	var inxProv = document.dataform.province.selectedIndex;
	var inxDist = document.dataform.district.selectedIndex;
	var inxSubd = document.dataform.tambol.selectedIndex;
	cdata[23] = document.dataform.province.options[inxProv].text;
	cdata[24] = document.dataform.district.options[inxDist].text;
	cdata[25] = document.dataform.tambol.options[inxSubd].text;

	if(document.getElementById("cmbLawBreakerType").value == "3"){
		var insexlext3 = document.dataform.company_title_code.selectedIndex;
		cdata[0]  = document.dataform.company_title_code.options[insexlext3].text;
	}

	var insexlect1 = document.dataform.cmbNationality.selectedIndex;
	var insexlect2 = document.dataform.cmbRace.selectedIndex;
	cdata[26]  = document.dataform.cmbRace.options[insexlect2].text ;
	cdata[27]  = document.dataform.cmbNationality.options[insexlect1].text ;
	//cdata[28]  = opener.document.dataform.aal_testimony.value ;
	cdata[29]  = document.dataform.txtPassPortNo.value;
	cdata[30]  = document.dataform.middle_name.value;
	cdata[32]  = document.dataform.company_name.value;
	cdata[33]  = document.dataform.excise_reg_no.value;
	cdata[34]  = document.dataform.corporation_code.value;
	cdata[35]  = document.dataform.agecal.value;
	cdata[36]  = document.dataform.lawbreaker_no.value;


	var brow = window.navigator.userAgent;
	if (brow.indexOf("Chrome")>0){//Google Chrome
		//alert("Chrome 123 ");
		//window.opener.lawsinsRow('lawsTable',1,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],"",data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[0],data[35],data[36]);
		//window.opener.CallFromPop('lawsTable');
	}else{
		window.returnValue = cdata;
		window.close();
	}
}

function update(){
	//alert("opener.lawseditna=" + opener.lawseditna + "   opener.lawsmaxrow="+opener.lawsmaxrow);
	if(opener.lawseditna == 1){
		if(opener.lawsmaxrow == 2){
			cdata[1] = document.dataform.cmbLawBreakerType.value = opener.document.dataform.aal_culprit_type.value ;
			cdata[2] = document.dataform.txtIDCardNo.value = opener.document.dataform.aal_lawbreaker_id_card.value ;
			cdata[3] = opener.document.dataform.aal_sex.value;
			cdata[4] = document.dataform.nick_name.value= document.dataform.nick_name2.value= document.dataform.nick_name3.value = opener.document.dataform.aal_title_code.value ;
			cdata[5] = document.dataform.first_name.value =  document.dataform.first_name2.value = document.dataform.first_name3.value = opener.document.dataform.aal_first_name.value ;
			cdata[6] = document.dataform.last_name.value = document.dataform.last_name2.value = document.dataform.last_name3.value =opener.document.dataform.aal_last_name.value ;
			cdata[7] = document.dataform.other_name.value = opener.document.dataform.aal_other_name.value ;
			cdata[8] = document.dataform.home_number.value = opener.document.dataform.aal_address_no.value ;
			cdata[9] = document.dataform.moo.value = opener.document.dataform.aal_moo.value ;
			cdata[10] = document.dataform.soi.value = opener.document.dataform.aal_soi.value ;
			cdata[11] = document.dataform.road.value = opener.document.dataform.aal_road.value ;
			cdata[16] = document.dataform.cmbNationality.value = opener.document.dataform.aal_nationality_id.value ;
			cdata[15] = document.dataform.cmbRace.value = opener.document.dataform.aal_race_id.value ;
			cdata[12] = document.dataform.province.value = opener.document.dataform.aal_province.value ;
			cdata[13] = document.dataform.district.value = opener.document.dataform.aal_district.value ;
			cdata[14] = document.dataform.tambol.value = opener.document.dataform.aal_subdistrict.value ;
			cdata[15] = document.dataform.cmbRace.value = opener.document.dataform.aal_race_id.value ; // edit by mu
			cdata[16] = document.dataform.cmbNationality.value = opener.document.dataform.aal_nationality_id.value ; //edit by mu
			cdata[17] = document.dataform.career.value = opener.document.dataform.aal_career.value ;
			cdata[18] = document.dataform.birthdate.value = opener.document.dataform.aal_birth_date.value ;
			cdata[19] = document.dataform.father_name.value = opener.document.dataform.aal_father_name.value ;
			cdata[20] = document.dataform.mother_name.value = opener.document.dataform.aal_mother_name.value ;
			cdata[21]  = opener.document.dataform.aal_id.value ;
			cdata[22]  = opener.document.dataform.aal_title_name.value ;
			cdata[23]  = opener.document.dataform.aal_province_name.value ;
			cdata[24]  = opener.document.dataform.aal_district_name.value ;
			cdata[25]  = opener.document.dataform.aal_subdistrict_name.value ;
			cdata[26]  = opener.document.dataform.aal_race_id_name.value ;
			cdata[27]  = opener.document.dataform.aal_nationality_id_name.value ;
			cdata[28]  = opener.document.dataform.aal_testimony.value ;
			cdata[29]  = document.dataform.txtPassPortNo.value = opener.document.dataform.aal_lawbreaker_passport.value ;
			cdata[30]  = document.dataform.middle_name.value=opener.document.dataform.aal_middle_name.value;
			cdata[31]  = document.dataform.company_title_code.value=opener.document.dataform.aal_company_title_code.value;
			cdata[32]  = document.dataform.company_name.value=opener.document.dataform.aal_company_name.value;
			cdata[33]  = document.dataform.excise_reg_no.value=opener.document.dataform.aal_excise_reg_no.value;
			cdata[34]  = document.dataform.corporation_code.value=opener.document.dataform.aal_corporation_code.value;
			cdata[35]  = document.dataform.agecal.value=opener.document.dataform.aal_age.value;
			cdata[36]  = document.dataform.lawbreaker_no.value=opener.document.dataform.aal_lawbreaker_no.value;
			
			if(opener.document.dataform.aal_sex.value == 'M'){
				document.dataform.sex[0].checked=true;
			}else if(opener.document.dataform.aal_sex.value == 'F'){
				document.dataform.sex[1].checked=true;
			}
			setTimeout("getProvince('province','district','tambol',cdata[12],cdata[13] ,cdata[14])",500);
		}else{

			cdata[1] = document.dataform.cmbLawBreakerType.value = opener.document.dataform.aal_culprit_type[row].value;
			cdata[2] = document.dataform.txtIDCardNo.value = opener.document.dataform.aal_lawbreaker_id_card[row].value;
			cdata[3] = opener.document.dataform.aal_sex[row].value;				
			cdata[4] = document.dataform.nick_name.value= document.dataform.nick_name2.value= document.dataform.nick_name3.value = opener.document.dataform.aal_title_code[row].value ;
			cdata[5] = document.dataform.first_name.value =  document.dataform.first_name2.value = document.dataform.first_name3.value = opener.document.dataform.aal_first_name[row].value ;
			cdata[6] = document.dataform.last_name.value = document.dataform.last_name2.value = document.dataform.last_name3.value =opener.document.dataform.aal_last_name[row].value ;
			cdata[7] = document.dataform.other_name.value = opener.document.dataform.aal_other_name[row].value;
			cdata[8] = document.dataform.home_number.value = opener.document.dataform.aal_address_no[row].value;
			cdata[9] = document.dataform.moo.value = opener.document.dataform.aal_moo[row].value;
			cdata[10] = document.dataform.soi.value = opener.document.dataform.aal_soi[row].value;
			cdata[11] = document.dataform.road.value = opener.document.dataform.aal_road[row].value;
			cdata[15] = document.dataform.cmbRace.value = opener.document.dataform.aal_race_id[row].value;
			cdata[16] = document.dataform.cmbNationality.value = opener.document.dataform.aal_nationality_id[row].value;
			cdata[12] = document.dataform.province.value = opener.document.dataform.aal_province[row].value;
			cdata[13] = opener.document.dataform.aal_district[row].value;
			cdata[14] = opener.document.dataform.aal_subdistrict[row].value;
			cdata[17] = document.dataform.career.value = opener.document.dataform.aal_career[row].value;
			cdata[18] = document.dataform.birthdate.value = opener.document.dataform.aal_birth_date[row].value;
			cdata[19] = document.dataform.father_name.value = opener.document.dataform.aal_father_name[row].value;
			cdata[20] = document.dataform.mother_name.value = opener.document.dataform.aal_mother_name[row].value;
			cdata[21]  = opener.document.dataform.aal_id[row].value;
			cdata[22]  = opener.document.dataform.aal_title_name[row].value;
			cdata[23]  = opener.document.dataform.aal_province_name[row].value;
			cdata[24]  = opener.document.dataform.aal_district_name[row].value;
			cdata[25]  = opener.document.dataform.aal_subdistrict_name[row].value;
			cdata[26]  = opener.document.dataform.aal_race_id_name[row].value;
			cdata[27]  = opener.document.dataform.aal_nationality_id_name[row].value;
			cdata[28]  = opener.document.dataform.aal_testimony[row].value;
			cdata[29]  = document.dataform.txtPassPortNo.value = opener.document.dataform.aal_lawbreaker_passport[row].value;
			cdata[30]  = document.dataform.middle_name.value=opener.document.dataform.aal_middle_name[row].value;
			cdata[31]  = document.dataform.company_title_code.value=opener.document.dataform.aal_company_title_code[row].value;
			cdata[32]  = document.dataform.company_name.value=opener.document.dataform.aal_company_name[row].value;
			cdata[33]  = document.dataform.excise_reg_no.value=opener.document.dataform.aal_excise_reg_no[row].value;
			cdata[34]  = document.dataform.corporation_code.value=opener.document.dataform.aal_corporation_code[row].value;
			cdata[35]  = document.dataform.agecal.value=opener.document.dataform.aal_age[row].value;
			cdata[36]  = document.dataform.lawbreaker_no.value=opener.document.dataform.aal_lawbreaker_no[row].value;
			if(opener.document.dataform.aal_sex[row].value == 'M'){
				document.dataform.sex[0].checked=true;
			}else if(opener.document.dataform.aal_sex[row].value == 'F'){
				document.dataform.sex[1].checked=true;
			}
			setTimeout("getProvince('province','district','tambol',cdata[12],cdata[13] ,cdata[14])",500);
		}
	}

	var str=cdata[18];
	if(str.length>0){
		str = str.substring(6,10);
		var nu = new Date();
		var y1 = parseInt(nu.getFullYear()+543);
		var y2 = parseInt(str);
		dwr.util.setValue("agecal",y1-y2);
	}
}


function vali(){


if(document.getElementById("cmbLawBreakerType").value == "1"){

	var fn = document.dataform.first_name.value ;
	var ln = document.dataform.last_name.value ;
	if(fn.length < 1){
		alert("กรุณากรอกชื่อ");
	}else if(ln.length < 1){
		alert("กรุณากรอกสกุล");
	}else if(document.dataform.onsubmit()!=false){

		cdata[31]="";
 		cdata[4] = document.dataform.nick_name.value ;
		cdata[5] = document.dataform.first_name.value ;
		cdata[6] = document.dataform.last_name.value ;

     			saveto();
  		}
	}else if(document.getElementById("cmbLawBreakerType").value == "2"){
		var id = 	document.dataform.txtPassPortNo.value;
		var fn2 = document.dataform.first_name2.value ;
		var ln2 = document.dataform.last_name2.value ;

		if(fn2.length < 1){
			alert("กรุณากรอกชื่อ");
		}else if(ln2.length < 1){
			alert("กรุณากรอกสกุล");
		}else if(document.dataform.onsubmit()!=false){
	 		cdata[31]="";
	 		cdata[4] = document.dataform.nick_name2.value ;
			cdata[5] = document.dataform.first_name2.value ;
			cdata[6] = document.dataform.last_name2.value ;
	  		saveto();
		}
	}else{
		var id = 	document.dataform.company_name.value;
		if(id.length < 1){
			alert("กรุณากรอกชื่อผู้ประกอบการ");
		}else if(document.dataform.onsubmit()!=false){
			cdata[4] = document.dataform.nick_name3.value
			cdata[5] = document.dataform.first_name3.value ;
			cdata[6] = document.dataform.last_name3.value ;
			cdata[3]="Z";
			cdata[31]  = document.dataform.company_title_code.value;
			saveto();
		}
	}
}




getProvince('province','district','tambol','','' ,'');
</script>

</HEAD>

<BODY>
<form name="dataform" id="dataform" method="post"  >

<script>
	function showLawbreakerFindPop(){
		var idCard = document.getElementById('txtIDCardNo').value;
		var txtfname = document.getElementById("first_name").value + " " + document.getElementById("last_name").value;
		window.showModalDialog('process?action=ArrestLawbreakerFind_pop&cmd=showPop&idCard='+idCard + '&txtfname=' + txtfname, self , 'dialogWidth=700px,Height=500px');
	}
</script>
<table border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td colspan="2"><span class="websitename" >รายชื่อผู้กระทำผิด</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barButton" value="เพิ่ม"  onClick = "vali();"/>
			<input name="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onClick = "cancleedit()" />
			<input type="hidden" id="lawbreaker_no" name="lawbreaker_no" ></input>
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
        <td width="30%" align="right">ประเภทผู้กระทำผิด : </td>
        <td width="70%">
          <select name="cmbLawBreakerType" id="cmbLawBreakerType" class="select" onChange="toggleLawbreakerType();">
                 <option selected value="1">คนไทย</option>
                 <option value="2">ชาวต่างชาติ</option>
                 <option value="3">ผู้กระกอบการ</option>
          </select>
          <font style="color:red">*</font>
        </td>
	</tr>
     <tbody id="1">
       <tr>
          <td align="right">เลขประจำตัวประชาชน : </td>
          <td >
            <input id="txtIDCardNo" name="txtIDCardNo" type="text" class="text"  size="13" maxlength="13" onkeypress="javascript:checkIDcard(this);" onblur="JavaScript:fncAlert()"/>
              &nbsp;&nbsp;&nbsp;
              เพศ :
              <input name="sex" id="tSexM" type="radio" value="M" checked/>ชาย&nbsp;&nbsp;
              <input name="sex" id="tSexF" type="radio" value="F" />หญิง&nbsp;&nbsp;
              <font style="color:red">*</font>
          </td>
       </tr>
       <tr>
          <td  align="right">ชื่อผู้กระทำผิด : </td>
          <td >
               <select name="nick_name" id="nick_name" style="width:70px;" onChange="cdata[22]=document.dataform.nick_name.options[selectedIndex].text" >
                    <option value="" selected>เลือก</option>
                    <c:forEach items="${title_popList}"  var="titleP">
						<option value="${titleP.title_code}">${titleP.title_name}</option>
					</c:forEach>
               </select>
               <input name="first_name" id="first_name" type="text" class="text"  size="15" onkeypress="javascript:checkName(this);" />-
               <input name="last_name" id="last_name" type="text" class="text"  size="15" onkeypress="javascript:checkName(this);" />
               <font style="color:red">*</font>
               <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;" title="ค้นหา" onClick="showLawbreakerFindPop()" />
          </td>
       </tr>
     </tbody>
     <tbody id="2" style="display:none" >
       <tr>
            <td  align="right">เลขที่หนังสือเดินทาง : </td>
            <td >
              <input id="txtPassPortNo" name="txtPassPortNo" type="text" class="text"  size="20"  maxlength="20" onblur="JavaScript:fncAlert()"/>
              &nbsp;&nbsp;&nbsp;
              เพศ :
              <input name="sex2" id="fSexM" type="radio" value="M" checked/>ชาย&nbsp;&nbsp;
              <input name="sex2" id="fSexY" type="radio" value="Y" />หญิง&nbsp;&nbsp;
              <font style="color:red">*</font>
            </td>
       </tr>
       <tr>
          <td  align="right">คำนำหน้าชื่อ : </td>
          <td >
               <select name="nick_name2" id="nick_name2" style="width:150px;" onChange="cdata[22]=document.dataform.nick_name2.options[selectedIndex].text">
                    <option value="" selected>เลือก</option>
                    <c:forEach items="${title_popList}"  var="titleP">
						<option value="${titleP.title_code}">${titleP.title_name}</option>
					</c:forEach>
               </select>
          </td>
       </tr>
       <tr>
       		<td  align="right">ชื่อผู้กระทำผิด : </td>
       		<td >
               <input name="first_name2" id="first_name2" type="text" class="text"  size="45"  />
               <font style="color:red">*</font>
          </td>
       </tr>
       <tr>
       		<td  align="right">ชื่อกลาง : </td>
       		<td >
               <input name="middle_name" id="middle_name" type="text" class="text"  size="45"  />
          </td>
       </tr>
       <tr>
       		<td  align="right">นามสกุล : </td>
       		<td >
               <input name="last_name2" id="last_name2" type="text" class="text"  size="45"  />
          </td>
       </tr>
     </tbody>
     <tbody id="3" style="display:none" >
       <tr>
            <td  align="right">เลขทะเบียนสรรพสามิต : </td>
            <td >
              <input id="excise_reg_no" name="excise_reg_no" type="text" class="text"  size="20"  maxlength="20" onkeypress="javascript:checkIDinter(this);" onblur="JavaScript:fncAlert()" />
            </td>
       </tr>
       <tr>
            <td  align="right">เลขทะเบียนนิติบุคคล : </td>
            <td >
              <input id="corporation_code" name="corporation_code" type="text" class="text"  size="20"  maxlength="20" onkeypress="javascript:checkIDinter(this);" />
            </td>
       </tr>
       <tr>
          <td  align="right">ชื่อผู้ประกอบการ : </td>
          <td >
               <select name="company_title_code" id="company_title_code" style="width:70px;" onChange="cdata[0]=document.dataform.company_title_code.options[selectedIndex].text">
                    <option value="" selected>เลือก</option>
                    <c:forEach items="${title_popList}"  var="titleP">
						<option value="${titleP.title_code}">${titleP.title_name}</option>
					</c:forEach>
               </select>
               <input name="company_name" id="company_name" type="text" class="text"  size="35" />
               <font style="color:red">*</font>
          </td>
       </tr>
       <tr>
          <td  align="right">ชื่อผู้แทน : </td>
          <td >
               <select name="nick_name3" id="nick_name3" style="width:70px;" onChange="cdata[22]=document.dataform.nick_name3.options[selectedIndex].text">
                    <option value="" selected>เลือก</option>
                    <c:forEach items="${title_popList}"  var="titleP">
						<option value="${titleP.title_name}">${titleP.title_name}</option>
					</c:forEach>
               </select>
               <input name="first_name3" id="first_name3" type="text" class="text"  size="15" onkeypress="javascript:checkName(this);" />-
               <input name="last_name3" id="last_name3" type="text" class="text"  size="15" onkeypress="javascript:checkName(this);" />

          </td>
       </tr>
     </tbody>
     <tr>
          <td  align="right">ชื่ออื่นๆ : </td>
          <td >
               <input name="other_name" id="other_name" type="text" class="text"  size="45" />
          </td>
     </tr>
	<tr>
		<td align="right">บ้านเลขที่ : </td>
		<td >
			<input name="home_number" id="home_number" type="text" class="text"  size="15">
               <font style="color:red">*</font>&nbsp;&nbsp;&nbsp;
			หมู่ที่ : <input name="moo" id="moo" type="text" class="text" onkeypress="ChkMinusInt(this);"  size="15">
		</td>
	</tr>
	<tr>
		<td  align="right">ซอย : </td>
		<td ><input name="soi" id="soi" type="text" class="text"  size="45"  ></td>
	</tr>
	<tr>
		<td  align="right">ถนน : </td>
		<td ><input name="road" id="road" type="text" class="text"  size="45"  ></td>
	</tr>
	<tr>
	<td height="25" align="right">จังหวัด :&nbsp;</td>
	<td>

          <select name="province" id="province" onChange="getDistrict('district','tambol',this.value,'','');cdata[23]=document.dataform.province.options[selectedIndex].text" style="width:150px">
            
                      </select>
		<font style="color:red">*</font>
	</td>
	</tr>
	<tr>
	<td height="25" align="right">อำเภอ :&nbsp;</td>
	<td>
          <select name="district" id="district"  onChange="getTambol('tambol',this.value,'');cdata[24]=document.dataform.district.options[selectedIndex].text" style="width:150px">
           
          </select>
		<font style="color:red">*</font>
	 </td>
	</tr>
	<tr>
	<td height="25" align="right">ตำบล :&nbsp;</td>
	<td>
          <select name="tambol" id="tambol" onChange="cdata[25]=document.dataform.tambol.options[selectedIndex].text" style="width:150px">
         
          </select>
	 </td>
	</tr>
	<tr>
		<td align="right">เชื้อชาติ : </td>
		<td >
			<select name="cmbRace" id="cmbRace" style="width:120px;" onChange="cdata[26]=document.dataform.cmbRace.options[selectedIndex].text" >
					<option value="" selected>เลือก</option>
					<c:forEach items="${rach_popList}"  var="rachP">
						<option value="${rachP.id}" <c:if test="${rachP.id == '1'}">selected</c:if>  >${rachP.race_name}</option>
					</c:forEach>
				
			</select> &nbsp;&nbsp;&nbsp;
			สัญชาติ :
			<select name="cmbNationality" id="cmbNationality" style="width:120px;"  onChange="cdata[27]=document.dataform.cmbNationality.options[selectedIndex].text">
				<option value="" selected>เลือก</option>
				<c:forEach items="${nation_popList}"  var="nationP">
					<option value="${nationP.id}" <c:if test="${nationP.id == '1'}">selected</c:if>>${nationP.nation_name}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td align="right">อาชีพ : </td>
		<td >
			<input name="career" id="career" type="text" class="text"  size="45" />
		</td>
	</tr>
	<tr>
		<td align="right">วันเกิด : </td>
		<td >
            <input name="birthdate" id="birthdate" type="text" class="textdate"  value="" onBlur="calage();"/>
           <a href="javascript:NewCssCal('birthdate','ddmmyyyy')"><img src="images/btn_calendar.png"  align="middle" style="border-style: none"  width="19" height="19" ></a>
							
							&nbsp;
            อายุ :&nbsp;
            <input type="text" name="agecal" id="agecal" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview"  size="5" /> ปี
		</td>
	</tr>
	<tr>
		<td align="right">ชื่อบิดา : </td>
		<td >
			<input name="father_name" id="father_name" type="text" class="text"  size="45" onkeypress="javascript:checkName(this);">
		</td>
	</tr>
	<tr>
		<td align="right">ชื่อมารดา : </td>
		<td >
			<input name="mother_name" id="mother_name" type="text" class="text"  size="45" onkeypress="javascript:checkName(this);">
		</td>
	</tr>
</table>
</form>
<script language="JavaScript" type="text/javascript">

//toggleLawbreakerType();

update();
if(opener.lawseditna == 1){
	toggleLawbreakerType();
}

 </script>
 <script language="JavaScript" type="text/javascript">

//You should create the validator only after the definition of the HTML form
  	var frmvalidator  = new Validator("dataform");
 	frmvalidator.addValidation("province","req","กรุณาเลือกจังหวัด");
  	frmvalidator.addValidation("district","req","กรุณาเลือกอำเภอ");
   	//frmvalidator.addValidation("home_number","req","กรุณากรอกบ้านเลขที่");

  </script>
</BODY>
</HTML>
