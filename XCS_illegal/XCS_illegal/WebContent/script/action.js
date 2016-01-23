// delete suspect, by wk5oo8
function deleteSuspect(suspectNo){
	var ans=window.confirm('ยืนยันการลบข้อมูล?');
	if(ans){
		MM_goToURL('parent','DeleteSuspectAction?suspect_no=' + suspectNo);
	}else{}
}

function KO_saveSuspectConfirm(){
	var ans=window.confirm("บันทึกข้อมูลเรียบร้อย ต้องการแสดงข้อมูลดำเนินการสืบสวนหรือไม่");
	return ans;
}


function alertConfirm(msg){
	var ans=window.confirm(msg);
    return ans;
}

function alertConfirmDelete(){
	var ans=window.confirm('ยืนยันการลบข้อมูล?');
    return ans;
}

function alertConfirmEdit(){
	var ans=window.confirm('ยืนยันการแก้ไขข้อมูล?');
    return ans;
}

function unShowVisibleControl(id){
	document.getElementById(id).style.display = 'none';
}

function showVisibleControl(id){
	document.getElementById(id).style.display = 'block';
}


// search for revision data from suspect_id_card ,by wk5oo8
function generateThaiSuspectRevisionCommandFromIdCard(path, value, creator){
	var url = path + "/InfoGenerator?request=THAI_SUSPECT_FIDC&id_card=" + value + "&create_by="+ creator;
	//alert(value);
	return getRevisionCommand(url);
}

// search for revision data from suspect_tax_no ,by wk5oo8
function generateThaiSuspectRevisionCommandFromTaxIdNo(path, value, creator){
	var url = path + "/InfoGenerator?request=THAI_SUSPECT_FTIN&tax_id_no=" + value + "&create_by="+ creator;
	//alert(value);
	return getRevisionCommand(url);
}

