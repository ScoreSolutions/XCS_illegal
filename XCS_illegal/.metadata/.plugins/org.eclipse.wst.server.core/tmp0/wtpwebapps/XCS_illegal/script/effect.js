
function KO_appendAddressRow(tableName, data){
	var index = '<td class="TblRow aligncenter">' + data['index'] +'</td>';
	var box = '<td class="TblRow aligncenter"><input name="chk1" type="checkbox"/></td>';
	var desc = '<td align="left" valign="top" class="TblRow AlignLeft">'+ data["description"]+'</td>';
	var address = '<td align="left" valign="top" class="TblRow AlignLeft">'+data["full_address"]+'</td>';
	var coXY = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["coordinate_x"] +"/"+ data["coordinate_y"] +'</td>';
	var tel = '<td align="left" valign="top" class="TblRow AlignLeft">'+ data["tel_no"]+ '</td>';
	var row = index + box + desc + address + coXY + tel;
	//window.opener.jQuery("#"+tableName).last().append("<tr>"+ row +"</tr>");
	jQuery("#"+tableName).first().append("<tr>"+ row +"</tr>");
}

function KO_appendRelativeRow(tableName, data){
	var index = '<td class="TblRow aligncenter">'+data["index"]+'</td>';
	var box = '<td class="TblRow aligncenter"><input name="chk1" type="checkbox" /></td>';
	var relation = '<td align="left" valign="top" class="TblRow AlignLeft">'+data["relation_text"]+'</td>';
	var fullName = '<td align="left" valign="top" class="TblRow AlignLeft">'+data["relative_name"]+'</td>';
	var tel = '<td align="left" valign="top" class="TblRow AlignLeft">'+data["tel_no"]+ '</td>';
	var email = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["email"] + '</td>';
	var currentAddress = '<td align="left" valign="top" class="TblRow AlignLeft">'+ data["current_address"]+'</td>';
	var homeTown = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["hometown_address"]+'</td>';
	
	var row = index + box + relation + fullName + tel + email + currentAddress + homeTown;
	jQuery("#"+tableName).first().append("<tr>"+ row +"</tr>");
}

function KO_appendInvestRelativeRow(tableName, data){
	var index = '<td class="TblRow aligncenter">'+data["index"]+'</td>';
	var box = '<td class="TblRow aligncenter"><input name="chk1" type="checkbox" /></td>';
	var relation = '<td align="left" valign="top" class="TblRow AlignLeft">'+data["relation_text"]+'</td>';
	var fullName = '<td align="left" valign="top" class="TblRow AlignLeft">'+data["relative_name"]+'</td>';
	var tel = '<td align="left" valign="top" class="TblRow AlignLeft">'+data["tel"]+ '</td>';
	var email = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["email"] + '</td>';
	var currentAddress = '<td align="left" valign="top" class="TblRow AlignLeft">'+ data["current_address"]+'</td>';
	var homeTown = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["hometown_address"]+'</td>';
	
	var row = box + fullName + relation + currentAddress + tel;
	jQuery("#"+tableName).first().append("<tr>"+ row +"</tr>");
}

function q(value, defaultValue){
	if(value == ""){
		return defaultValue;
	}else {
		return value;
	}
}