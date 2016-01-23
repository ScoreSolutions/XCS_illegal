function createRequestObject() {
	var objTemp = false;
	if (window.XMLHttpRequest) {
		objTemp = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		objTemp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	return objTemp;
}

function callServlert(path,parameter,key,chk_return) {
	var request = createRequestObject(); 
	var url = path + "/InfoGenerator?request="+key+"&parameter="+parameter;
	var result = null;
	if (request) {
		request.open("GET", url, false); 
		request.send(null);
	    result = request.responseText;
	} else {
		alert("failed");
	}
	if(chk_return)return result;
}

function getInfo(url){
	var request = createRequestObject();
	var arr = new Array();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		arr = result.split(":::");
	} else {
		alert("failed");
	}
	arr.sort();
	return arr;
}

function getTitleList(path, type){
	var url = path + "/InfoGenerator?request=TITLE_LIST&type="+type;
	return getInfo(url);
}

function getRaceList(path){
	var url = path + "/InfoGenerator?request=RACE_LIST";
	return getInfo(url);
}

function getNationalityList(path){
	var url = path + "/InfoGenerator?request=NATIONALITY_LIST";
	return getInfo(url);
}

function getReligionList(path){
	var url = path + "/InfoGenerator?request=RELIGION_LIST";
	return getInfo(url);
}

function getRelationList(path){
	var url = path + "/InfoGenerator?request=RELATION_LIST";
	return getInfo(url);
}

function getProviceList(path) {
	var request = createRequestObject();
	var url = path + "/InfoGenerator?request=PROVINCE_LIST";
	var provinceList = new Array();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		provinceList = result.split(":::");
	} else {
		alert("failed");
	}
	return provinceList;
}

function getAumphurList(path, provinceCode) {
	var request = createRequestObject();
	var url = path + "/InfoGenerator?request=AUMPHUR_LIST&province="
			+ provinceCode;
	var provinceList = new Array();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		provinceList = result.split(":::");
	} else {
		alert("failed");
	}
	return provinceList;
}
function getTambolList(path, code) {
	var request = createRequestObject();
	var url = path + "/InfoGenerator?request=TAMBOL_LIST&aumphur=" + code;
	var provinceList = new Array();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		provinceList = result.split(":::");
	} else {
		alert("failed");
	}
	return provinceList;
}


function applyServicesProvinceAction(path, provinceList, districtList, subdistrictList) {
	var arr = getServicesProviceList(path);
	var provinceDropdown = document.getElementsByName(provinceList)[0];
	jQuery("select[name='" + provinceList + "']").empty();
	jQuery("select[name='" + districtList + "']").empty();
	jQuery("select[name='" + subdistrictList + "']").empty();

	arr.sort();
	addOption(provinceDropdown, "  ", "");
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(provinceDropdown, nameValue[0], nameValue[1]);
	}

	jQuery("select[name='" + provinceList + "']").change(function() {
		jQuery("select[name='" + districtList + "']").empty();

		var code = jQuery("option:selected", this).val();
		var arr = getServicesAumphurList(path, code);
        
		arr.sort();

		var dropdown = document.getElementsByName(districtList)[0];
		addOption(provinceDropdown, "  ", "");
		for ( var i in arr) {
			var nameValue = new String(arr[i]).split("::");
			addOption(dropdown, nameValue[0], nameValue[1]);
		}
	});

	jQuery("select[name='" + districtList + "']").change(function() {
		jQuery("select[name='" + subdistrictList + "']").empty();
		var code = jQuery("option:selected", this).val();
		var arr = getServicesTambolList(path, code);

		arr.sort();

		var dropdown = document.getElementsByName(subdistrictList)[0];
		addOption(provinceDropdown, "  ", "");
		for ( var i in arr) {
			var nameValue = new String(arr[i]).split("::");
			addOption(dropdown, nameValue[0], nameValue[1]);
		}
	});
}

function getServicesProviceList(path) {
	var request = createRequestObject();
	var url = path + "/TombolInfoGenerator?request=PROVINCE_LIST";
	var provinceList = new Array();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		provinceList = result.split(":::");
	} else {
		alert("failed");
	}
	return provinceList;
}

function getServicesAumphurList(path, provinceCode) {
	var request = createRequestObject();
	var url = path + "/TombolInfoGenerator?request=AUMPHUR_LIST&province="
			+ provinceCode;
	var provinceList = new Array();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		provinceList = result.split(":::");
	} else {
		alert("failed");
	}
	return provinceList;
}
function getServicesTambolList(path, code) {
	var request = createRequestObject();
	var url = path + "/TombolInfoGenerator?request=TAMBOL_LIST&aumphur=" + code;
	var provinceList = new Array();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		provinceList = result.split(":::");
	} else {
		alert("failed");
	}
	return provinceList;
}

function getOfficeList(path) {
	var request = createRequestObject();
	var url = path + "/InfoGenerator?request=OFFICE_LIST";
	var provinceList = new Array();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		provinceList = result.split(":::");
	} else {
		alert("failed");
	}
	return provinceList;
}


function getList(path,key) {
	var request = createRequestObject(); 
	var url = path + "/InfoGenerator?request="+key;
	var provinceList = new Array();
	if (request) {
		request.open("GET", url, false); 
		request.send(null);
		var result = request.responseText;
		provinceList = result.split(":::");
	} else {
		alert("failed");
	}
	return provinceList;
}

function applyOptionSearch(path,list,key,str) {
	var arr = getList(path,key);
	var dropdown = document.getElementsByName(list)[0];
	jQuery("select[name='" + list + "']").empty();
	addOption(dropdown, str , "");
	arr.sort();
	
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(dropdown, nameValue[0], nameValue[1]);
	}
}

function applyOption(path,list,key) {
	var arr = getList(path,key);
	var dropdown = document.getElementsByName(list)[0];
	jQuery("select[name='" + list + "']").empty();
	arr.sort();
	
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(dropdown, nameValue[0], nameValue[1]);
	}
}

//utility
function addOption(selectbox, text, value) {
	if (text != '' && (text.indexOf("function") == -1)) {
		var optn = document.createElement("OPTION");
		optn.text = text;
		optn.value = value;
		selectbox.options.add(optn);
	}
}

// not web service
function getCountryList(path, code) {
	var request = createRequestObject();
	var url = path + "/InfoGenerator?request=COUNTRY_LIST";
	url = url + "&continent=" + code;

	var list = new Array();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		list = result.split(":::");
	} else {
		alert("failed");
	}
	return list;
}



function applyProvinceAction(path, provinceList, districtList, subdistrictList) {
	var arr = getProviceList(path);
	var provinceDropdown = document.getElementsByName(provinceList)[0];
	jQuery("select[name='" + provinceList + "']").empty();
	jQuery("select[name='" + districtList + "']").empty();
	jQuery("select[name='" + subdistrictList + "']").empty();

	arr.sort();
	addOption(provinceDropdown, "  ", "");
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(provinceDropdown, nameValue[0], nameValue[1]);
	}

	jQuery("select[name='" + provinceList + "']").change(function() {
		jQuery("select[name='" + districtList + "']").empty();

		var code = jQuery("option:selected", this).val();
		var arr = getAumphurList(path, code);
        
		arr.sort();

		var dropdown = document.getElementsByName(districtList)[0];
		addOption(dropdown, "  ", "");
		for ( var i in arr) {
			var nameValue = new String(arr[i]).split("::");
			addOption(dropdown, nameValue[0], nameValue[1]);
		}
	});

	jQuery("select[name='" + districtList + "']").change(function() {
		jQuery("select[name='" + subdistrictList + "']").empty();
		var code = jQuery("option:selected", this).val();
		var arr = getTambolList(path, code);

		arr.sort();

		var dropdown = document.getElementsByName(subdistrictList)[0];
		addOption(dropdown, "  ", "");
		for ( var i in arr) {
			var nameValue = new String(arr[i]).split("::");
			addOption(dropdown, nameValue[0], nameValue[1]);
		}
	});
}

function applyOfficeOption(path, offcodeList) {
	var arr = getOfficeList(path);
	var dropdown = document.getElementsByName(offcodeList)[0];
	jQuery("select[name='" + offcodeList + "']").empty();
	addOption(dropdown, "  ", "");
	arr.sort();
	
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(dropdown, nameValue[0], nameValue[1]);
	}
}

function applyContinentAction(path, continentList, countryList) {
	var continentCon = document.getElementsByName(continentList);
	var countryCon = document.getElementsByName(countryList);
	jQuery("select[name='" + countryList + "']").empty();

	jQuery("select[name='" + continentList + "']").change(function() {
		jQuery("select[name='" + countryList + "']").empty();
		var code = jQuery("option:selected", this).val();
		var arr = getCountryList(path, code);
		arr.sort();

		var dropdown = document.getElementsByName(countryList)[0];
		addOption(dropdown, "  ", "");
		for ( var i in arr) {
			var nameValue = new String(arr[i]).split("::");
			addOption(dropdown, nameValue[0], nameValue[1]);
		}
	});
}

function applyRaceOption(path, listBox) {
	var arr = getRaceList(path);
	var dropdown = document.getElementsByName(listBox)[0];
	jQuery("select[name='" + listBox + "']").empty();
	
	addOption(dropdown, "  ", "");
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(dropdown, nameValue[0], nameValue[1]);
	}
}

function applyCountryOption(path, listBox) {
	var arr = getCountryList(path, "*");
	var dropdown = document.getElementsByName(listBox)[0];
	jQuery("select[name='" + listBox + "']").empty();
	
	addOption(dropdown, "  ", "");
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(dropdown, nameValue[0], nameValue[1]);
	}
}

function applyNationalityOption(path, listBox) {
	var arr = getNationalityList(path);
	var dropdown = document.getElementsByName(listBox)[0];
	jQuery("select[name='" + listBox + "']").empty();
	
	addOption(dropdown, "  ", "");
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(dropdown, nameValue[0], nameValue[1]);
	}
}

function applyRelationOption(path, listBox){
	var arr = getRelationList(path);
	var dropdown = document.getElementsByName(listBox)[0];
	jQuery("select[name='" + listBox + "']").empty();
	
	addOption(dropdown, "  ", "");
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(dropdown, nameValue[0], nameValue[1]);
	}
}

function applyReligionOption(path, listBox) {
	var arr = getReligionList(path);
	var dropdown = document.getElementsByName(listBox)[0];
	jQuery("select[name='" + listBox + "']").empty();
	
	addOption(dropdown, "  ", "");
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(dropdown, nameValue[0], nameValue[1]);
	}
}

function applyLegislationOption(path, listBox){
	applyOption(path,listBox, "LEGISLATION_LIST");
}

function applyTitleOption(path, listBox,type) {
	var arr = getTitleList(path, type);
	var dropdown = document.getElementsByName(listBox)[0];
	jQuery("select[name='" + listBox + "']").empty();
	
	addOption(dropdown, "  ", "");
	for ( var i in arr) {
		var nameValue = new String(arr[i]).split("::");
		addOption(dropdown, nameValue[0], nameValue[1]);
	}
}

function addControlValue(name,value){
	var control = document.getElementsByName(name)[0];
	var type = control.type;
	if(type == 'text' || type == 'textarea'){
		control.value  = value;
	}else if (type == 'select-one'){
		jQuery("select[name=" + name +"]").val(value);
	}
}

function getRevisionCommand(url){
	var request = createRequestObject();
	if (request) {
		request.open("GET", url, false);
		request.send(null);
		var result = request.responseText;
		return result;
	}else{
		return "";
	}
}

// -- will move to action.js 
function KO_doDelete(suspectNo, returnUrl){
	var ans=window.confirm('ยืนยันการลบข้อมูล?');
	if(ans){
		MM_goToURL('parent','DeleteSuspectAction?suspect_no=' + suspectNo + "&return_url="+returnUrl);
	}else{}
}
function KO_deleteThaiSuspect(suspectNo){
	var returnUrl = "Suspect.jsp?action=suspectList01";
	KO_doDelete(suspectNo, returnUrl);
}
function KO_deleteForeignSuspect(suspectNo){
	var returnUrl = "Suspect.jsp?action=suspectList02";
	KO_doDelete(suspectNo, returnUrl);	
}
function KO_deleteTraderSuspect(suspectNo){
	var returnUrl = "Suspect.jsp?action=suspectList03";
	KO_doDelete(suspectNo, returnUrl);	
}