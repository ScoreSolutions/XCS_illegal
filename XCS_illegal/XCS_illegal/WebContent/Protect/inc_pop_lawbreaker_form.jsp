<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<link href="css/style.css" rel="stylesheet" type="text/css">

<link href="css/jquery-ui.css"  rel="stylesheet" />
<script type="text/javascript" language="JavaScript" src="script/Popup.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/jquery.min.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/jquery-ui.min.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/jquery.tablesorter.pager.js" ></script>
<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>
<script type='text/javascript' src='dwr/interface/Lawbreaker.js'></script>

<script type="text/javascript">
function toggleLawbreakerType()
{
  var cmbValue=document.getElementById("cmbLawBreakerType").value;
  if(cmbValue =="1"){
    document.getElementById("LawbreakerThai").style.display = '';
    document.getElementById("LawbreakerRegion").style.display='none';
    document.getElementById("LawbreakerCompany").style.display='none';
  }else if(cmbValue=="2"){
    document.getElementById("LawbreakerThai").style.display = 'none';
    document.getElementById("LawbreakerRegion").style.display='';
    document.getElementById("LawbreakerCompany").style.display='none';
  }else if(cmbValue=="3"){
    document.getElementById("LawbreakerThai").style.display = 'none';
    document.getElementById("LawbreakerRegion").style.display='none';
    document.getElementById("LawbreakerCompany").style.display='';
  }
}

function popLawbreaker(myTable, rowID){
	if(document.dataform.have_culprit[0].checked == true ){
		writeTranLog('เพิ่มรายชื่อผู้กระทำผิด');

		$("#LawbreakerModal").dialog(
	    {
	    	modal: true,
	        draggable: false,
	        resizable: false,
	        width: 700,
	        height: 600
	     });
		ClearLawbreaker();
		getProvince('pop_province','pop_district','pop_tambol','','' ,'');
		getTitleList();
		getRaceList()
		getNationalityList();
		getAgeYear();
	}else{
		alert("ไม่สามารถเพิ่มผู้กระทำผิดได้เนื่องจากเป็นคดีไม่มีตัวผู้กระทำผิด");
	}
}

function ValidateLawbreaker(){

	if(document.getElementById("cmbLawBreakerType").value == "1"){
		var fn = dwr.util.getValue("pop_first_name");
		var ln = dwr.util.getValue("pop_last_name");
		if(fn.length < 1){
			alert("กรุณากรอกชื่อ");
			return false;
		}else if(ln.length < 1){
			alert("กรุณากรอกสกุล");
			return false;
		}else{

			//cdata[31]="";
	 		//cdata[4] = document.dataform.nick_name.value ;
			//cdata[5] = document.dataform.first_name.value ;
			//cdata[6] = document.dataform.last_name.value ;

	     			//saveto();
	  	}
	}else if(document.getElementById("cmbLawBreakerType").value == "2"){
		var id = dwr.util.getValue("pop_txtPassPortNo");
		var fn2 = dwr.util.getValue("pop_first_name2");

		if(fn2.length < 1){
			alert("กรุณากรอกชื่อ");
			return false;
		}else {
	 		//cdata[31]="";
	 		//cdata[4] = document.dataform.nick_name2.value ;
			//cdata[5] = document.dataform.first_name2.value ;
			//cdata[6] = document.dataform.last_name2.value ;
	  		//saveto();
		}
	}else{
		var id = dwr.util.getValue("pop_company_name");
		if(id.length < 1){
			alert("กรุณากรอกชื่อผู้ประกอบการ");
			return false;
		}else{
			//cdata[4] = document.dataform.nick_name3.value
			//cdata[5] = document.dataform.first_name3.value ;
			//cdata[6] = document.dataform.last_name3.value ;
			//cdata[3]="Z";
			//cdata[31]  = document.dataform.company_title_code.value;
			//saveto();
		}
	}

	if(dwr.util.getValue("pop_home_number").length < 1){
		alert("กรุณากรอกบ้านเลขที่");
		return  false;
	}else if(dwr.util.getValue("pop_province")==""){
		alert("กรุณาเลือกจังหวัด");
		return  false;
	}else if(dwr.util.getValue("pop_district")==""){
		alert("กรุณาเลือกอำเภอ");
		return  false;
	}

	return true;
}



function FindLawbreaker(){
	//alert("aaa");
	var type;
	var selValue = document.getElementById("cmbLawBreakerType").value;

	if (selValue == "1"){
		chValue = document.getElementById("pop_txtIDCardNo").value;
		type="1";
	}
	if (selValue == "2"){
		chValue = document.getElementById("pop_txtPassPortNo").value;
		type="2";
	}
	if (selValue == "3"){
		chValue = document.getElementById("pop_excise_reg_no").value;
		type="3";
  	}

	if (chValue != "" && chValue.length < 13 && selValue == "1"){
   		alert('กรุณากรอกเลขบัตรประชาชนให้ครบ 13 หลัก');
   		document.getElementById("pop_txtIDCardNo").select();
   		return false;
   	}

    if (chValue.length != 0){
		Lawbreaker.getByIdCard(type,chValue, function(data) {
			if(data != null){
				dwr.util.setValue("pop_sex",data.sex);
				dwr.util.setValue("pop_nick_name",data.title_code);
				dwr.util.setValue("pop_nick_name2",data.title_code);
				dwr.util.setValue("pop_nick_name3",data.title_code);
				dwr.util.setValue("pop_txtIDCardNo",data.lawbreaker_id_card);
				dwr.util.setValue("pop_first_name",data.first_name);
				dwr.util.setValue("pop_last_name",data.last_name);
				dwr.util.setValue("pop_first_name2",data.first_name);
				dwr.util.setValue("pop_last_name2",data.last_name);
				dwr.util.setValue("pop_first_name3",data.first_name);
				dwr.util.setValue("pop_last_name3",data.last_name);
				dwr.util.setValue("pop_other_name",data.other_name);
				dwr.util.setValue("pop_home_number",data.address_no);
				dwr.util.setValue("pop_moo",data.moo);
				dwr.util.setValue("pop_soi",data.soi);
				dwr.util.setValue("pop_road",data.road);
				dwr.util.setValue("pop_cmbRace",data.race_id);
				dwr.util.setValue("pop_cmbNationality",data.nation_id);
				dwr.util.setValue("pop_career",data.career);
				dwr.util.setValue("pop_birthdate",data.birth_date2);
				dwr.util.setValue("pop_father_name",data.father_name);
				dwr.util.setValue("pop_mother_name",data.father_name);
				dwr.util.setValue("pop_excise_reg_no",data.excise_reg_no);
				dwr.util.setValue("pop_company_name",data.company_name);
				dwr.util.setValue("pop_company_title_code",data.title_code_company);
				dwr.util.setValue("pop_middle_name",data.middle_name);
				dwr.util.setValue("pop_txtPassPortNo",data.lawbreaker_passport);

				if(data.ls_type == "LAWBREAKER"){
					dwr.util.setValue("pop_lawbreaker_no", data.lawbreaker_no);
				}
				
				if(data.birth_date2 != null){
	   				var str=data.birth_date2.toString();
	   				str = str.substring(6,10);
					var nu = new Date();
					var y1 =  parseInt(nu.getFullYear()+543);
					var y2 = parseInt(str);
	   				dwr.util.setValue("pop_agecal",y1-y2);
	   			}else{
	       			dwr.util.setValue("pop_agecal","");
	       		}
	
				getProvince('pop_province','pop_district','pop_tambol',data.province_code,data.district_name,data.subdistrict_name);
	
				if(data.sex == 'M'){
					document.getElementsByName("pop_sex")[0].checked=true;
					document.getElementsByName("pop_sex2")[0].checked=true;
				}else if(data.sex == 'F'){
					document.getElementsByName("pop_sex")[1].checked=true;
					document.getElementsByName("pop_sex2")[1].checked=true;
				}
			}else{
				alert("ไม่พบเลขบัตรประจำตัวประชาชนนี้ในระบบ");
			}
 		});
    }
}

function ClearLawbreaker(){
	dwr.util.setValue("pop_sex","M");
	dwr.util.setValue("pop_nick_name","");
	dwr.util.setValue("pop_nick_name2","");
	dwr.util.setValue("pop_nick_name3","");
	dwr.util.setValue("pop_txtIDCardNo","");
	dwr.util.setValue("pop_first_name","");
	dwr.util.setValue("pop_last_name","");
	dwr.util.setValue("pop_first_name2","");
	dwr.util.setValue("pop_last_name2","");
	dwr.util.setValue("pop_first_name3","");
	dwr.util.setValue("pop_last_name3","");
	dwr.util.setValue("pop_other_name","");
	dwr.util.setValue("pop_home_number","");
	dwr.util.setValue("pop_moo","");
	dwr.util.setValue("pop_soi","");
	dwr.util.setValue("pop_road","");
	dwr.util.setValue("pop_cmbRace","");
	dwr.util.setValue("pop_cmbNationality","");
	dwr.util.setValue("pop_career","");
	dwr.util.setValue("pop_birthdate","");
	dwr.util.setValue("pop_father_name","");
	dwr.util.setValue("pop_mother_name","");
	dwr.util.setValue("pop_excise_reg_no","");
	dwr.util.setValue("pop_company_name","");
	dwr.util.setValue("pop_company_title_code","");
	dwr.util.setValue("pop_middle_name","");
	dwr.util.setValue("pop_txtPassPortNo","");
	dwr.util.setValue("pop_lawbreaker_no", "");
	dwr.util.setValue("pop_agecal","");
	getProvince('pop_province','','','','','');
	document.getElementsByName("pop_sex")[0].checked=true;
	document.getElementsByName("pop_sex2")[0].checked=true;
}

function calage(){
	if(dwr.util.getValue("pop_age_year") != ""){
		var str=dwr.util.getValue("pop_age_year");
		//str = str.substring(6,10);
		var nu = new Date();
		var y1 = parseInt(nu.getFullYear()+543);
		var y2 = parseInt(str);

		dwr.util.setValue("pop_agecal",y1-y2);
	}else{
		dwr.util.setValue("pop_agecal","");
	}
}

function checkIDcard(idCard,e){
	var id = idCard.value;
	var charId = (event.which) ? event.which : event.keyCode
	if (charId > 31 && (charId < 48 || charId > 57)) {
		e.preventDefault();
	}
}

function SaveData(){
	if(ValidateLawbreaker()==true){
		var cdata = new Array();
		if(document.getElementById("cmbLawBreakerType").value == "1"){
			if(document.getElementsByName("pop_sex")[0].checked==true){
				cdata[3]=document.getElementsByName("pop_sex")[0].value;
			}else{
				cdata[3]=document.getElementsByName("pop_sex")[1].value;
			}
		}else if(document.getElementById("cmbLawBreakerType").value == "2"){
			if(document.getElementsByName("pop_sex2")[0].checked==true){
				cdata[3]=document.getElementsByName("pop_sex2")[0].value;
			}else{
				cdata[3]=document.getElementsByName("pop_sex2")[1].value;
			}
		}else{
			cdata[3]="";
		}

		cdata[1] = dwr.util.getValue("cmbLawBreakerType");
		cdata[2] = dwr.util.getValue("pop_txtIDCardNo");
		cdata[4] = dwr.util.getValue("pop_nick_name");
		cdata[5] = dwr.util.getValue("pop_first_name");
		cdata[6] = dwr.util.getValue("pop_last_name");
		cdata[7] = dwr.util.getValue("pop_other_name");
		cdata[8] = dwr.util.getValue("pop_home_number");
		cdata[9] = dwr.util.getValue("pop_moo");
		cdata[10] = dwr.util.getValue("pop_soi");
		cdata[11] = dwr.util.getValue("pop_road");
		cdata[12] = dwr.util.getValue("pop_province");
		cdata[13] = dwr.util.getValue("pop_district");
		cdata[14] = dwr.util.getValue("pop_tambol");
		cdata[15] = dwr.util.getValue("pop_cmbRace");
		cdata[16] = dwr.util.getValue("pop_cmbNationality");
		cdata[17] = dwr.util.getValue("pop_career");


		if(dwr.util.getValue("pop_age_year").toString() != "" && dwr.util.getValue("pop_age_month").toString() != "" && dwr.util.getValue("pop_age_day").toString() != ""){
			cdata[18] = dwr.util.getValue("pop_age_day").toString() + "/" + dwr.util.getValue("pop_age_month").toString() + "/" + dwr.util.getValue("pop_age_year").toString();
		}
		
		cdata[19] = dwr.util.getValue("pop_father_name");
		cdata[20] = dwr.util.getValue("pop_mother_name");
		
		var inxTitle = document.getElementById("pop_title").selectedIndex;
		var inxProv = document.getElementById("pop_province").selectedIndex;
		var inxDist = document.getElementById("pop_district").selectedIndex;
		var inxSubd = document.getElementById("pop_tambol").selectedIndex;
		cdata[22] = document.getElementById("pop_title").options[inxTitle].text;
		cdata[23] = document.getElementById("pop_province").options[inxProv].text;
		cdata[24] = document.getElementById("pop_district").options[inxDist].text;
		cdata[25] = document.getElementById("pop_tambol").options[inxSubd].text;
		
		if(document.getElementById("cmbLawBreakerType").value == "3"){
			var insexlext3 = document.getElementById("pop_company_title_code").selectedIndex;
			cdata[0]  = document.getElementById("pop_company_title_code").options[insexlext3].text;
		}

		var insexlect1 = document.getElementById("pop_cmbNationality").selectedIndex;
		var insexlect2 = document.getElementById("pop_cmbRace").selectedIndex;
		cdata[26]  = document.getElementById("pop_cmbRace").options[insexlect2].text ;
		cdata[27]  = document.getElementById("pop_cmbNationality").options[insexlect1].text ;
		cdata[29]  = dwr.util.getValue("pop_txtPassPortNo");
		cdata[30]  = dwr.util.getValue("pop_middle_name");
		cdata[32]  = dwr.util.getValue("pop_company_name");
		cdata[33]  = dwr.util.getValue("pop_excise_reg_no");
		cdata[34]  = dwr.util.getValue("pop_corporation_code");
		cdata[35]  = dwr.util.getValue("pop_agecal");
		cdata[36]  = dwr.util.getValue("pop_lawbreaker_no");
		
		lawsinsRow('lawsTable',lawsmaxrow,cdata[1],cdata[2],cdata[3],cdata[4],cdata[5],cdata[6],cdata[7],cdata[8],cdata[9],cdata[10],cdata[11],cdata[12],cdata[13],cdata[14],cdata[15],cdata[16],cdata[17],cdata[18],cdata[19],cdata[20],"",cdata[22],cdata[23],cdata[24],cdata[25],cdata[26],cdata[27],cdata[28],cdata[29],cdata[30],cdata[31],cdata[32],cdata[33],cdata[34],cdata[0],cdata[35],cdata[36]);
		$("#LawbreakerModal").dialog("close");
	}
}

function getTitleList(){
	Lawbreaker.getTitleList(function(data) {
		if(data != null){
			dwr.util.removeAllOptions("pop_title");
			dwr.util.addOptions("pop_title",[{title_code:"",title_name:"เลือก"}],"title_code","title_name");
			dwr.util.addOptions("pop_title",data,"title_code","title_name");

			dwr.util.removeAllOptions("pop_company_title_code");
			dwr.util.addOptions("pop_company_title_code",[{title_code:"",title_name:"เลือก"}],"title_code","title_name");
			dwr.util.addOptions("pop_company_title_code",data,"title_code","title_name");

			dwr.util.removeAllOptions("pop_nick_name3");
			dwr.util.addOptions("pop_nick_name3",[{title_code:"",title_name:"เลือก"}],"title_code","title_name");
			dwr.util.addOptions("pop_nick_name3",data,"title_code","title_name");
		}
	});
}

function getRaceList(){
	Lawbreaker.getRaceList(function(data) {
		if(data != null){
			dwr.util.removeAllOptions("pop_cmbRace");
			dwr.util.addOptions("pop_cmbRace",[{id:"",race_name:"เลือก"}],"id","race_name");
			dwr.util.addOptions("pop_cmbRace",data,"id","race_name");
		}
	});
}

function getNationalityList(){
	Lawbreaker.getNationalityList(function(data){
		if(data != null){
			dwr.util.removeAllOptions("pop_cmbNationality");
			dwr.util.addOptions("pop_cmbNationality",[{id:"",nation_name:"เลือก"}],"id","nation_name");
			dwr.util.addOptions("pop_cmbNationality",data,"id","nation_name");
		}
	});
}

function getAgeYear(){
	var y = new Date();
	var vYear = parseInt(y.getFullYear()+543);
	dwr.util.removeAllOptions("pop_age_year");
	dwr.util.addOptions("pop_age_year",[{id:"",year:"เลือก"}],"id","year");
	for(i=0;i<100;i++){
		dwr.util.addOptions("pop_age_year",[{id:(vYear-i),year:(vYear-i)}],"id","year");
	}
	
}
</script>
<div id="LawbreakerModal" title="รายชื่อผู้กระทำผิด" style="display:none;">
	<table border="0" cellpadding="0" cellspacing="0" width="95%">
		<tr>
			<td colspan="2">
				<input name="btnSaveData" id="btnSaveData"  type="button" class="barButton" value="เพิ่ม"  onclick="SaveData();" />
				<input type="hidden" id="pop_lawbreaker_no" name="pop_lawbreaker_no" ></input>
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
	     <tbody id="LawbreakerThai">
	       <tr>
	          <td align="right">เลขประจำตัวประชาชน : </td>
	          <td >
	            <input id="pop_txtIDCardNo" name="pop_txtIDCardNo" type="text" class="text"  size="13" maxlength="13" onKeyPress="checkIDcard(this,event);" onblur="JavaScript:FindLawbreaker()"/>
	              &nbsp;&nbsp;&nbsp;
	              เพศ :
	              <input name="pop_sex" id="pop_tSexM" type="radio" value="M" checked/>ชาย&nbsp;&nbsp;
	              <input name="pop_sex" id="pop_tSexF" type="radio" value="F" />หญิง&nbsp;&nbsp;
	              <font style="color:red">*</font>
	          </td>
	       </tr>
	       <tr>
	          <td  align="right">ชื่อผู้กระทำผิด : </td>
	          <td >
	               <select name="pop_title" id="pop_title" style="width:70px;" >
	                    
	               </select>
	               <input name="pop_first_name" id="pop_first_name" type="text" class="text"  size="15"  />-
	               <input name="pop_last_name" id="pop_last_name" type="text" class="text"  size="15"  />
	               <font style="color:red">*</font>
	               <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:pointer;" title="ค้นหา" onClick="showLawbreakerFindPop()" />
	          </td>
	       </tr>
	     </tbody>
	     <tbody id="LawbreakerRegion" style="display:none" >
	       <tr>
	            <td  align="right">เลขที่หนังสือเดินทาง : </td>
	            <td >
	              <input id="pop_txtPassPortNo" name="pop_txtPassPortNo" type="text" class="text"  size="20"  maxlength="20" onblur="JavaScript:FindLawbreaker()"/>
	              &nbsp;&nbsp;&nbsp;
	              เพศ :
	              <input name="pop_sex2" id="pop_fSexM" type="radio" value="M" checked/>ชาย&nbsp;&nbsp;
	              <input name="pop_sex2" id="pop_fSexY" type="radio" value="Y" />หญิง&nbsp;&nbsp;
	              <font style="color:red">*</font>
	            </td>
	       </tr>
	       <tr>
	          <td  align="right">คำนำหน้าชื่อ : </td>
	          <td >
	               <select name="pop_nick_name2" id="pop_nick_name2" style="width:150px;" >
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
	               <input name="pop_first_name2" id="pop_first_name2" type="text" class="text"  size="45"  />
	               <font style="color:red">*</font>
	          </td>
	       </tr>
	       <tr>
	       		<td  align="right">ชื่อกลาง : </td>
	       		<td >
	               <input name="pop_middle_name" id="pop_middle_name" type="text" class="text"  size="45"  />
	          </td>
	       </tr>
	       <tr>
	       		<td  align="right">นามสกุล : </td>
	       		<td >
	               <input name="pop_last_name2" id="pop_last_name2" type="text" class="text"  size="45"  />
	          </td>
	       </tr>
	     </tbody>
	     <tbody id="LawbreakerCompany" style="display:none" >
	       <tr>
	            <td  align="right">เลขทะเบียนสรรพสามิต : </td>
	            <td >
	              <input id="pop_excise_reg_no" name="pop_excise_reg_no" type="text" class="text"  size="20"  maxlength="20" />
	            </td>
	       </tr>
	       <tr>
	            <td  align="right">เลขทะเบียนนิติบุคคล : </td>
	            <td >
	              <input id="pop_corporation_code" name="pop_corporation_code" type="text" class="text"  size="20"  maxlength="20"  />
	            </td>
	       </tr>
	       <tr>
	          <td  align="right">ชื่อผู้ประกอบการ : </td>
	          <td >
	               <select name="pop_company_title_code" id="pop_company_title_code" style="width:70px;" >
	                    
	               </select>
	               <input name="pop_company_name" id="pop_company_name" type="text" class="text"  size="35" />
	               <font style="color:red">*</font>
	          </td>
	       </tr>
	       <tr>
	          <td  align="right">ชื่อผู้แทน : </td>
	          <td >
	               <select name="pop_nick_name3" id="pop_nick_name3" style="width:70px;" >
	                    
	               </select>
	               <input name="pop_first_name3" id="pop_first_name3" type="text" class="text"  size="15"  />-
	               <input name="pop_last_name3" id="pop_last_name3" type="text" class="text"  size="15"  />
	          </td>
	       </tr>
	     </tbody>
	     <tr>
	          <td  align="right">ชื่ออื่นๆ : </td>
	          <td >
	               <input name="pop_other_name" id="pop_other_name" type="text" class="text"  size="45" />
	          </td>
	     </tr>
		<tr>
			<td align="right">บ้านเลขที่ : </td>
			<td >
				<input name="pop_home_number" id="pop_home_number" type="text" class="text"  size="15">
	               <font style="color:red">*</font>&nbsp;&nbsp;&nbsp;
				หมู่ที่ : <input name="pop_moo" id="pop_moo" type="text" class="text" onkeypress="ChkMinusInt(this);"  size="15">
			</td>
		</tr>
		<tr>
			<td  align="right">ซอย : </td>
			<td ><input name="pop_soi" id="pop_soi" type="text" class="text"  size="45"  ></td>
		</tr>
		<tr>
			<td  align="right">ถนน : </td>
			<td ><input name="pop_road" id="pop_road" type="text" class="text"  size="45"  ></td>
		</tr>
		<tr>
		<td height="25" align="right">จังหวัด :&nbsp;</td>
		<td>
	
	          <select name="pop_province" id="pop_province" onChange="getDistrict('pop_district','tambol',this.value,'','');" style="width:150px">
	            
	                      </select>
			<font style="color:red">*</font>
		</td>
		</tr>
		<tr>
		<td height="25" align="right">อำเภอ :&nbsp;</td>
		<td>
	          <select name="pop_district" id="pop_district"  onChange="getTambol('pop_tambol',this.value,'');" style="width:150px">
	           
	          </select>
			<font style="color:red">*</font>
		 </td>
		</tr>
		<tr>
		<td height="25" align="right">ตำบล :&nbsp;</td>
		<td>
	          <select name="pop_tambol" id="pop_tambol"  style="width:150px">
	         
	          </select>
		 </td>
		</tr>
		<tr>
			<td align="right">เชื้อชาติ : </td>
			<td >
				<select name="pop_cmbRace" id="pop_cmbRace" style="width:120px;"  >
						<option value="" selected>เลือก</option>
						<c:forEach items="${rach_popList}"  var="rachP">
							<option value="${rachP.id}" <c:if test="${rachP.id == '1'}">selected</c:if>  >${rachP.race_name}</option>
						</c:forEach>
					
				</select> &nbsp;&nbsp;&nbsp;
				สัญชาติ :
				<select name="pop_cmbNationality" id="pop_cmbNationality" style="width:120px;" >
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
				<input name="pop_career" id="pop_career" type="text" class="text"  size="45" />
			</td>
		</tr>
		<tr>
			<td align="right">วันเกิด : </td>
			<td >
				ปี <select id="pop_age_year" name="pop_age_year" onChange="calage()">
					
				</select>
				เดือน <select id="pop_age_month" name="pop_age_month" >
					<option value="" selected>เลือก</option>
					<option value="01">มกราคม</option>
					<option value="02">กุมภาพันธ์</option>
					<option value="03">มีนาคม</option>
					<option value="04">เมษายน</option>
					<option value="05">พฤษภาคม</option>
					<option value="06">มิถุนายน</option>
					<option value="07">กรกฎาคม</option>
					<option value="08">สิงหาคม</option>
					<option value="09">กันยายน</option>
					<option value="10">ตุลาคม</option>
					<option value="11">พฤศจิกายน</option>
					<option value="12">ธันวาคม</option>
				</select>
				วัน <select id="pop_age_day" name="pop_age_day" >
					<option value="" selected>เลือก</option>
					<option value="01" >1</option>
					<option value="02" >2</option>
					<option value="03" >3</option>
					<option value="04" >4</option>
					<option value="05" >5</option>
					<option value="06" >6</option>
					<option value="07" >7</option>
					<option value="08" >8</option>
					<option value="09" >9</option>
					<option value="10" >10</option>
					<option value="11" >11</option>
					<option value="12" >12</option>
					<option value="13" >13</option>
					<option value="14" >14</option>
					<option value="15" >15</option>
					<option value="16" >16</option>
					<option value="17" >17</option>
					<option value="18" >18</option>
					<option value="19" >19</option>
					<option value="20" >20</option>
					<option value="21" >21</option>
					<option value="22" >22</option>
					<option value="23" >23</option>
					<option value="24" >24</option>
					<option value="25" >25</option>
					<option value="26" >26</option>
					<option value="27" >27</option>
					<option value="28" >28</option>
					<option value="29" >29</option>
					<option value="30" >30</option>
					<option value="31" >31</option>
				</select>
								&nbsp;
	            อายุ :&nbsp;
	            <input type="text" name="pop_agecal" id="pop_agecal" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview"  size="5" /> ปี
			</td>
		</tr>
		<tr>
			<td align="right">ชื่อบิดา : </td>
			<td >
				<input name="pop_father_name" id="pop_father_name" type="text" class="text"  size="45" >
			</td>
		</tr>
		<tr>
			<td align="right">ชื่อมารดา : </td>
			<td >
				<input name="pop_mother_name" id="pop_mother_name" type="text" class="text"  size="45" >
			</td>
		</tr>
	</table>
</div>