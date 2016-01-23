<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type='text/javascript' src='dwr/interface/FileUploader.js'></script>
<style type="text/css">
    .keylink {
        cursor : hand;
    }
</style>
<script type="text/javascript">
var lawbreaker_form = '${lawbreaker_form}';
<c:if test="${countryJson != null}">
var jsonCountry = eval('(${countryJson})');
</c:if>
function uploadAmmImgPreview(uploadImage,preview_id,table) {
	if ( checkFileExtension(uploadImage) ){
		document.getElementById(preview_id).src="images/wait.gif";
		var theForm = uploadImage.form;
		var originalUrl = theForm.action;
        jQuery.ajax({
           url: "process?action=Ajax&cmd=uploadPreview&preview_id="+preview_id+"&table="+table,
           async:false,
           data:jQuery('#thai_lawbreaker_form').serialize(),
            success:function(data){
                alert(data);
            },
           error:function(data){
               alert('error');
               alert(data);
           }
        });

	}
}
function initLawbreakerAddress() {
    jQuery("#otherAddressBody tr").remove();
<c:if test="${sas != null}">
    var data = [];
<c:forEach var="sa" items="${sas}" varStatus="i">
    data["tel_no"] = "${sa.tel_no}";
    data["fax_no"] = "${sa.fax_no}";
    data["address_name"] = "${sa.address_name}";
    data["moo"] = "${sa.moo}";
    data["road"] = "${sa.road}";
    data["soi"] = "${sa.soi}";
    data["zipcode"] = "${sa.zipcode}";
    data["province_code"] = "${sa.province_code}";
    data["province_text"] = "${sa.provinceText}";
    data["district_code"] = "${sa.distric_code}";
    data["district_text"] = "${sa.districtText}";
    data["subdistrict_code"] = "${sa.subdistric_code}";
    data["subdistrict_text"] = "${sa.subDistrictText}";
    data["coordinate_x"] = "${sa.coordinate_x}";
    data["coordinate_y"] = "${sa.coordinate_y}";
    data["description"] = "${sa.description}";
    data["address"] = "${sa.address}";
    data["full_address"] = "${sa.full_address}";
    data["lawbreaker_no"] = "${sa.lawbreaker_no}";
    data["id"] = "${sa.id}";
    var addressIndex = jQuery("tbody#otherAddressBody > tr").size() + 1;
    data["index"] = addressIndex;
    AM_appendAddressRow("otherAddressBody", data);
</c:forEach>
</c:if>
}
function initLawbreakerRelatives() {
    // remove all row
    jQuery("#otherRelationBody tr").remove();
<c:if test="${srs != null}">
    var data = [];
<c:forEach var="sr" items="${srs}" varStatus="i">
    data["relation"] = "${sr.relation}";
    data["relation_text"] = "${sr.relation_text}";
    data["idcardno"] = "${sr.idcardno}";
    data["title_code"] = "${sr.title_code}";
    data["title_text"] = "${sr.title_text}";
    data["first_name"] = "${sr.first_name}";
    data["last_name"] = "${sr.last_name}";
    data["tel_no"] = "${sr.tel}";
    data["email"] = "${sr.email}";
    data["current_address_no"] = "${sr.current_address_no}";
    data["current_moo"] = "${sr.current_moo}";
    data["current_soi"] = "${sr.current_soi}";
    data["current_road"] = "${sr.current_road}";
    data["current_province_code"] = "${sr.current_province_code}";
    data["current_district_code"] = "${sr.current_district_code}";
    data["current_subdistrict_code"] = "${sr.current_subdistrict_code}";
    data["current_province_text"] = "${sr.current_province_text}";
    data["current_district_text"] = "${sr.current_district_text}";
    data["current_subdistrict_text"] = "${sr.current_subdistrict_text}";
    data["hometown_address_no"] = "${sr.hometown_address_no}";
    data["hometown_moo"] = "${sr.hometown_moo}";
    data["hometown_soi"] = "${sr.hometown_soi}";
    data["hometown_road"] = "${sr.hometown_road}";
    data["hometown_province_code"] = "${sr.hometown_province_code}";
    data["hometown_district_code"] = "${sr.hometown_district_code}";
    data["hometown_subdistrict_code"] = "${sr.hometown_subdistrict_code}";
    data["hometown_province_text"] = "${sr.hometown_province_text}";
    data["hometown_district_text"] = "${sr.hometown_district_text}";
    data["hometown_subdistrict_text"] = "${sr.hometown_subdistrict_text}";
    data["relative_name"] = q(data["title_text"], "") + q(data["first_name"], "") + " " + q(data["last_name"], "");
    data["current_address"] =
            " เลขที่" + q(data["current_address_no"], "-") +
                    " หมู่" + q(data["current_moo"], "-") +
                    " ตำบล" + q(data["current_subdistrict_text"], "-") +
                    " อำเภอ" + q(data["current_district_text"], "-") +
                    " จังหวัด" + q(data["current_province_text"], "-");

    data["hometown_address"] =
            " เลขที่" + q(data["hometown_address_no"], "-") +
                    " หมู่" + q(data["hometown_moo"], "-") +
                    " ตำบล" + q(data["hometown_subdistrict_text"], "-") +
                    " อำเภอ" + q(data["hometown_district_text"], "-") +
                    " จังหวัด" + q(data["hometown_province_text"], "-");
    data["lawbreaker_no"] = "${sr.lawbreaker_no}";
    data["id"] = "${sr.id}";
    var addressIndex = jQuery("tbody#otherRelationBody > tr").size() + 1;
    data["index"] = addressIndex;
    AM_appendRelativeRow("otherRelationBody", data);
</c:forEach>
</c:if>
}
jQuery(document).ready(function() {
    initValue();
    <c:if test="${completed != null}">
		alert('บันทึกข้อมูลเรียบร้อย');
    	//if (confirm('บันทึกข้อมูเลเรียบร้อย ')){
            
        //} else {
            
        //}
</c:if>
});
function checkIDCard(textDom, maxLength) {
    if (textDom.value.length > 0 && textDom.value.length != maxLength) {
        if (maxLength == 13)
            alert("กรุณากรอกเลขบัตรประชาชนให้ครบ " + maxLength + " หลัก");
        else if (maxLength == 10)
            alert("กรุณากรอกเลขประจำตัวผู้เสียภาษีให้ครบ " + maxLength + " หลัก");
        textDom.select();
    }
}
function toggleHidden(mID, btnID) {
    document.getElementById('address').style.display = 'none';
    document.getElementById('Relative').style.display = 'none';
    document.getElementsByName('btnAddressOther')[0].style.background = '#D4D0C8';
    document.getElementsByName('btnRelative')[0].style.background = '#D4D0C8';
    mnu = document.getElementById(mID);
    btn = document.getElementsByName(btnID)[0];
    if (mnu.style.display == 'none') {
        mnu.style.display = '';
        btn.style.background = '#FFCC33';
    } else {
        mnu.style.display = 'none';
    }
}
function openAddressPopup() {
    writeTranLog("เพิ่มที่อยู่ผู้กระทำผิด");
    //data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
    var data = window.showModalDialog('process?action=Lawbreaker&cmd=openLawbreakerAddressPopup', self, 'dialogWidth=700px,dialogHeight=400px');
    var addressIndex = jQuery("tbody#otherAddressBody > tr").size() + 1;
    if (data) {
        data["index"] = addressIndex;
        AM_appendAddressRow("otherAddressBody", data);
        //lawbreakerAddressAr[lawbreakerAddressAr.length+1] = data;
    } else {
    }
}


function openRelativePopup() {
    writeTranLog("แสดงหน้าจอเพิ่มข้อมูลผู้กระทำผิด");
    //data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
    var data = window.showModalDialog('process?action=Lawbreaker&cmd=openLawbreakerRelatifPopup', self, 'dialogWidth=700px,dialogHeight=400px');
    var relativeIndex = jQuery("tbody#otherRelationBody > tr").size() + 1;
    if (data) {
        data["index"] = relativeIndex;
        AM_appendRelativeRow("otherRelationBody", data);
    } else {
    }
}
function openAddressPopupEdit(rowId) {
    writeTranLog("เพิ่มที่อยู่ผู้กระทำผิด");
    //data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
    var listParam = "";
    var maxRow =jQuery("tbody#otherAddressBody > tr").size();
    jQuery("#otherAddressRow" + rowId + " input").each(function(index) {
        var input = jQuery(this);
        listParam = listParam + "&" + input.attr("name") + "=" + input.attr("value");
    });

    var data = window.showModalDialog('process?action=Lawbreaker&cmd=openLawbreakerAddressPopup&maxRow='+maxRow+'&rowId=' + rowId + listParam, self, 'dialogWidth=700px,dialogHeight=400px');
    var addressIndex = jQuery("tbody#otherAddressBody > tr").size() + 1;
    if (data) {
        data["rowId"] = "" + rowId;
        data["index"] = addressIndex;
        AM_appendAddressRow("otherAddressBody", data);
        //lawbreakerAddressAr[lawbreakerAddressAr.length+1] = data;
    } else {
    }
}
function openRelativePopupEdit(rowId) {
    writeTranLog("แสดงหน้าจอเพิ่มข้อมูลผู้กระทำผิด");
    var listParam = "";
    var maxRow = jQuery("tbody#otherRelationBody > tr").size();
    jQuery("#otherRelationRow" + rowId + " input").each(function(index) {
        var input = jQuery(this);
        listParam = listParam + "&" + input.attr("name") + "=" + input.attr("value");
    });

    var data = window.showModalDialog('process?action=Lawbreaker&cmd=openLawbreakerRelatifPopup&maxRow='+maxRow+'&rowId='+rowId + listParam, self, 'dialogWidth=700px,dialogHeight=400px');
    var addressIndex = jQuery("tbody#otherRelationBody > tr").size() + 1;
    if (data) {
        data["rowId"] = "" + rowId;
        data["index"] = addressIndex;
        AM_appendRelativeRow("otherRelationRow", data);
    } else {
    }
}
function chkUncheckAll(prefix) {
    if (jQuery("#" + prefix).first().attr('checked')) {
        jQuery("input[name^='" + prefix + "']").attr('checked', true);
    } else {
        jQuery("input[name^='" + prefix + "']").attr('checked', false);
    }
}
function AM_appendRelativeRow(tableName, data) {
    var paramMap = {
        'lawbreaker_relative_relation':data["relation"],
        'lawbreaker_relative_idcardno':data["idcardno"],
        'lawbreaker_relative_relation_text':data["relation_text"],
        'lawbreaker_relative_title_code':data["title_code"],
        'lawbreaker_relative_title_text':data["title_text"],
        'lawbreaker_relative_first_name':data["first_name"],
        'lawbreaker_relative_last_name':data["last_name"],
        'lawbreaker_relative_tel_no':data["tel_no"],
        'lawbreaker_relative_email':data["email"],
        'lawbreaker_relative_current_address_no':data["current_address_no"],
        'lawbreaker_relative_current_moo':data["current_moo"],
        'lawbreaker_relative_current_soi':data["current_soi"],
        'lawbreaker_relative_current_road':data["current_road"],
        'lawbreaker_relative_current_address_name':data["current_address_name"],
        'lawbreaker_relative_current_province_code':data["current_province_code"],
        'lawbreaker_relative_current_district_code':data["current_district_code"],
        'lawbreaker_relative_current_subdistrict_code':data["current_subdistrict_code"],
        'lawbreaker_relative_current_province_text':data["current_province_text"],
        'lawbreaker_relative_current_district_text':data["current_district_text"],
        'lawbreaker_relative_current_subdistrict_text':data["current_subdistrict_text"],
        'lawbreaker_relative_hometown_address_no':data["hometown_address_no"],
        'lawbreaker_relative_hometown_moo':data["hometown_moo"],
        'lawbreaker_relative_hometown_soi':data["hometown_soi"],
        'lawbreaker_relative_hometown_road':data["hometown_road"],
        'lawbreaker_relative_hometown_province_code':data["hometown_province_code"],
        'lawbreaker_relative_hometown_district_code':data["hometown_district_code"],
        'lawbreaker_relative_hometown_subdistrict_code':data["hometown_subdistrict_code"],
        'lawbreaker_relative_hometown_province_text':data["hometown_province_text"],
        'lawbreaker_relative_hometown_district_text':data["hometown_district_text"],
        'lawbreaker_relative_hometown_subdistrict_text':data["hometown_subdistrict_text"],
        'lawbreaker_relative_count':'1',
        'lawbreaker_relative_id':data["id"]
    };
    var inputText = "";
    jQuery.each(paramMap, function(key, value) {
        inputText = inputText + "<input type=\"hidden\" value=\"" + value + "\" name=\"" + key + "\" />";
    });
    var index = '<td class="TblRow AlignCenter ">' + ((data["rowId"]) ? data["rowId"] : data['index']) + '</td>';
    var box = '<td class="TblRow AlignCenter"><input name="chk' + tableName + data['index'] + '" type="checkbox"/></td>';
    var relation = '<td align="left" valign="top" class="TblRow AlignLeft" >' + data["relation_text"] + '</td>';
    var name = '<td align="left" valign="top" class="TblRow AlignLeft keylink"><span class="spanLink">' + data["relative_name"] + '</span></td>';
    var tel = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["tel_no"] + '</td>';
    var email = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["email"] + '</td>';
    var currAddr = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["current_address"] + '</td>';
    var homeAddr = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["hometown_address"] + '</td>';
    var row = index + box + relation + name + tel + email + currAddr + homeAddr + inputText;
    if (data["rowId"]) {
        jQuery("#otherRelationRow" + data["rowId"]).first().children().remove();
        jQuery("#otherRelationRow" + data["rowId"]).first().append(row);
        jQuery("#" + tableName + " > tr#otherRelationRow" + data['rowId'] + " > td.keylink").last().bind("click", function(event) {
            openRelativePopupEdit(data['rowId']);
        });
    } else {
        jQuery("#" + tableName).first().append("<tr id=\"otherRelationRow" + data['index'] + "\"  class='" + (data["index"] % 2 == 0 ? 'even' : 'odd') + "'>" + row + "</tr>");
        var indexRow = data["index"];
        jQuery("#" + tableName + " > tr#otherRelationRow" + data['index'] + " > td.keylink").last().bind("click", function(event) {
            openRelativePopupEdit(indexRow);
        });
    }
}
function AM_appendAddressRow(tableName, data) {
    var paramMap = {
        'lawbreaker_address_tel_no':data["tel_no"],
        'lawbreaker_address_fax_no':data["fax_no"],
        'lawbreaker_address_address_name':data["address_name"],
        'lawbreaker_address_moo':data["moo"],
        'lawbreaker_address_road':data["road"],
        'lawbreaker_address_soi':data["soi"],
        'lawbreaker_address_zipcode':data["zipcode"],
        'lawbreaker_address_province_code':data["province_code"],
        'lawbreaker_address_province_text':data["province_text"],
        'lawbreaker_address_district_code':data["district_code"],
        'lawbreaker_address_district_text':data["district_text"],
        'lawbreaker_address_subdistrict_code':data["subdistrict_code"],
        'lawbreaker_address_subdistrict_text':data["subdistrict_text"],
        'lawbreaker_address_coordinate_x':data["coordinate_x"],
        'lawbreaker_address_coordinate_y':data["coordinate_y"],
        'lawbreaker_address_description':data["description"],
        'lawbreaker_address_address':data["address"],
        'lawbreaker_address_id':data["id"],
        'lawbreaker_address_lawbreaker_no':data["lawbreaker_no"],
        'lawbreaker_address_count':1};
    var inputText = "";
    jQuery.each(paramMap, function(key, value) {
        inputText = inputText + "<input type=\"hidden\" value=\"" + value + "\" name=\"" + key + "\" />";
    });
    var index = '<td class="TblRow AlignCenter">' + ((data["rowId"]) ? data["rowId"] : data['index']) + '</td>';
    var box = '<td class="TblRow AlignCenter"><input name="chk' + tableName + data['index'] + '" type="checkbox"/></td>';
    var desc = '<td align="left" valign="top" class="TblRow AlignLeft keylink">' + data["description"] + '</td>';
    var address = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["full_address"] + '</td>';
    var coXY = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["coordinate_x"] + "/" + data["coordinate_y"] + '</td>';
    var tel = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["tel_no"] + '</td>';
    var row = index + box + desc + address + coXY + tel + inputText;
    if (data["rowId"]) {
        jQuery("#otherAddressRow" + data["rowId"]).first().children().remove();
        jQuery("#otherAddressRow" + data["rowId"]).first().append(row);
        jQuery("#" + tableName + " > tr#otherAddressRow" + data['rowId'] + " > td.keylink").last().bind("click", function(event) {
            openAddressPopupEdit(data['rowId']);
        });
    } else {
        jQuery("#" + tableName).first().append("<tr id=\"otherAddressRow" + data['index'] + "\"  class='" + (data["index"] % 2 == 0 ? 'even' : 'odd') + "'>" + row + "</tr>");
        var indexRow = data["index"];
        jQuery("#" + tableName + " > tr#otherAddressRow" + data['index'] + " > td.keylink").last().bind("click", function(event) {
            openAddressPopupEdit(indexRow);
        });
    }
}
function AM_doDeleteLawbreakerAddress(tableName) {
    if(alertConfirmDelete()){
    if (tableName == 'otherAddressBody') {
        writeTranLog('ลบที่อยู่ผู้กระทำผิด');
    } else {
        writeTranLog('ลบรายชื่อผู้เกี่ยวข้อง');
    }
    jQuery("#" + tableName + " tr").has("td > input:checked").remove();
    // rerun index of row
    jQuery("#" + tableName + " tr").each(function(index) {
        jQuery(this).children().first().text(index + 1);
        jQuery(this).removeClass();
        jQuery(this).addClass(((index + 1) % 2 == 0) ? 'even' : 'odd');

    });
    }
}
</script>
<iframe name="upload_picture_frame" src="xxx" style="display:none;"></iframe>
<c:if test="${lawbreaker != null}">
    <form action="process?action=Lawbreaker&cmd=update" method="post" id="thai_lawbreaker_form" enctype="multipart/form-data"
    target="upload_picture_frame" name="dataform">
    <input type="hidden" name="id" value="${lawbreaker.id}">
    <input type="hidden" name="lawbreaker_no" value="${lawbreaker.lawbreaker_no}">
    <input type="hidden" name="lawbreaker_type" value="${lawbreaker.lawbreaker_type}">
    <input type="hidden" name="create_id" value="${lawbreaker.create_id}">
    <input type="hidden" name="create_date" value="${lawbreaker.create_date}">
    <input type="hidden" name="del_flag" value="${lawbreaker.del_flag}">
</c:if>
<c:if test="${lawbreaker == null}">
    <form action="process?action=Lawbreaker&cmd=create" method="post" id="thai_lawbreaker_form" name="dataform" enctype="multipart/form-data">
    <input type="hidden" name="lawbreaker_type" id="lawbreaker_type" value="${(lawbreaker_type==null)?'1':(lawbreaker_type)}"/>
</c:if>
<!-- Body -->
<c:if test="${error != null}">
    <table><tr><td><font color="red">${error}</font></td></tr></table>
</c:if>
<table width="100%" height="100%" border="0" cellspacing="0"
       cellpadding="0">
<tr>
<td width="100%" align="left" valign="top">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <td width="99%">
        <c:if test="${lawbreaker_form == '1'}">
            <span class="websitename">ประวัติผู้กระทำผิดคนไทย</span>
        </c:if>
        <c:if test="${lawbreaker_form == '2'}">
            <span class="websitename">ประวัติผู้กระทำผิดชาวต่างชาติ</span>
        </c:if>
        <c:if test="${lawbreaker_form == '3'}">
            <span class="websitename">ประวัติผู้กระทำผิดผู้ประกอบการ</span>
        </c:if>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>


        <!--input name="btnSave" type="button" class="barbutton" value="บันทึก" onClick="submitForm();"-->
        <input name="btnSave" type="submit" class="barbutton" value="บันทึก"/>
        <input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข"
               onClick="initValue('cancle');">
        <input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา"
               onClick="back2search()"/>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>
<table width="806" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td bgcolor="#F5F5F5">&nbsp;</td>
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ข้อมูลส่วนตัว</strong></td>
</tr>
<c:if test="${lawbreaker_form == '1'}">
    <%@include file="lawbreaker_edit1.jsp" %>
</c:if>
<c:if test="${lawbreaker_form == '2'}">
    <%@include file="lawbreaker_edit2.jsp" %>
</c:if>
<c:if test="${lawbreaker_form == '3'}">
    <%@include file="lawbreaker_edit3.jsp" %>
</c:if>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">รายละเอียดเพิ่มเติม&nbsp;:&nbsp;</td>
    <td colspan="3" valign="top"><textarea name="description"
                                           cols="35" rows="3" class="textareabig2"></textarea>
    </td>
</tr>

<c:if test="${lawbreaker != null && lawbreaker.id != null}">

<tr>
    <td>&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tbody id="picA0x11">
    <tr>
        <td>&nbsp;</td>
        <td align="right" valign="top" >รูปถ่าย&nbsp;:&nbsp;</td>
        <td colspan="3" valign="top">
        	<img id="photo_img" border="0" width="100" height="100" onclick="openImg('LAWBREAKER','${lawbreaker.id}');" title="คลิกเพื่อแสดงรูปภาพขนาดใหญ่" style="cursor:hand" />
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td align="right" valign="top">เปลี่ยนรูปถ่าย&nbsp;:&nbsp;</td>
        <td colspan="3" valign="top">
            <input name="link_photo" type="file" class="textbox" size="35">
            <input name="Submit2" type="button" value="Upload" onclick="uploadFile('link_photo','lawbreaker',${lawbreaker.id},'photo_img')"/><br>
            <font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font></td>
    </tr>
	<tr>
	    <td>&nbsp;</td>
	    <td align="right" valign="top">รายละเอียดรูปถ่าย&nbsp;:&nbsp;</td>
	    <td colspan="3"><textarea name="photo_desc" cols="35"
	                              rows="3" class="textareabig"></textarea></td>
	</tr>
</tbody>
</c:if>

<tr>
    <td>&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td bgcolor="#F5F5F5">&nbsp;</td>
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ที่อยู่ตามภูมิลำเนา</strong></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ละติจูด&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="coordinate_x" type="text"
                           class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7">
        &nbsp;&nbsp;ลองติจูด&nbsp;:&nbsp; <input name="coordinate_y"
                                                 type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);"
                                                 maxlength="5" size="7"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">เลขที่ :&nbsp;</td>
    <td colspan="3"><input name="address_no" type="text" class="textbox" size="4">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
        <input name="moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
        &nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp; <input name="address_name" type="text" class="textbox" size="25">
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="soi" type="text" class="textbox"> &nbsp;&nbsp;ถนน&nbsp;:&nbsp; <input
            name="road" type="text" class="textbox" size="25"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">จังหวัด :&nbsp;</td>
    <td><select name="province_code" id="sProvince"
                style="width: 180px;" onchange="getDistrict('sDistrict','sSubDistrict',this.value,'','')">
    </select></td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">อำเภอ :&nbsp;</td>
    <td><select name="district_code" id="sDistrict"
                style="width: 180px;" onchange="getTambol('sSubDistrict',this.value,'')">
    </select>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">ตำบล :&nbsp;</td>
    <td><select name="subdistrict_code" id="sSubDistrict"
                style="width: 180px;">
    </select></td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>

<tr>
    <td>&nbsp;</td>
    <td align="right">รหัสไปรษณีย์ :&nbsp;</td>
    <td height="30" colspan="3"><input name="post_code"
                                       type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" size="10"
                                       maxlength="5">&nbsp;&nbsp;&nbsp;
        โทรศัพท์&nbsp;:&nbsp; <input name="tel" type="text"
                                     class="textbox" size="10"></td>
</tr>

<c:if test="${lawbreaker_form == '2'}">
    <tr>
        <td bgcolor="#F5F5F5">&nbsp;</td>
        <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ข้อมูล VISA</strong></td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td height="25" align="right">ประเภท VISA :&nbsp;</td>
        <td colspan="3"><select name="visa_type" id="visa_type"
                                style="width: 250px;">
            <option value="0">เลือก</option>
            <option value="1">ประเภทคนเดินทางผ่านราชอาณาจักร</option>
            <option value="2">ประเภทนักท่องเที่ยว</option>
            <option value="3">ประเภทคนอยู่ชั่วคราว</option>
            <option value="4">ประเภททูต</option>
            <option value="5">ประเภทราชการ</option>
            <option value="6">ประเภทอัธยาศัยไมตรี</option>
        </select></td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td align="right">วันที่เข้าประเทศ :&nbsp;</td>
        <td>
            <input name="date_in" type="text" id="date_in" class="textdate" readonly>
            <a href="javascript:NewCssCal('date_in','ddMMyyyy')"><img src="images/btn_calendar.png"
                                                                      alt="" width="19"
                                                                      height="19" align="middle"
                                                                      style="border-style: none"
                                                                      id="date_in_img" width="19"
                                                                      height="19"/></a>
        </td>
        <td colspan="2">วันที่กำหนดออกจากประเทศ :&nbsp;
            <input name="date_out" type="text"
                   id="date_out" class="textdate" readonly>
            <a href="javascript:NewCssCal('date_out','ddMMyyyy')"><img src="images/btn_calendar.png"
                                                                       alt="" width="19"
                                                                       height="19" align="middle"
                                                                       style="border-style: none"
                                                                       id="date_out_img" width="19"
                                                                       height="19"/></a>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td height="25" align="right">มาจากทวีป :&nbsp;</td>
        <td><select name="continent" id="continent">
            <option> เลือก </option>
            <option value="A">เอเชีย</option>
            <option value="B">ยุโรป</option>
            <option value="C">อเมริกาเหนือ</option>
            <option value="D">อเมริกากลาง</option>
            <option value="E">อเมริกาใต้</option>
            <option value="F">แอฟฟริกา</option>
            <option value="G">ออสเตรเลีย</option>
        </select></td>
        <td height="25" align="right">ประเทศ :&nbsp;</td>
        <td><select name="country_code" id="country_code">
        </select></td>
    </tr>
</c:if>
</table>

<hr/>


<table border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td>&nbsp;</td>
        <td height="30" colspan="4" align="left"><input
                name="btnAddressOther" type="button" class="button"
                value="ที่อยู่อื่นๆ"
                onClick='toggleHidden("address", "btnAddressOther");'
                style="background: #FFCC33">


            <input name="btnRelative" type="button" class="button" value="รายชื่อผู้เกี่ยวข้อง"
                   onClick='toggleHidden("Relative", "btnRelative");'></td>
    </tr>
</table>
<div class="innerPosition" id="address" style="width:100%;">
    <table border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="spanLink"
                                                     onClick="openAddressPopup();">
	            เพิ่มใหม่</span> | <span class="spanLink" onClick="AM_doDeleteLawbreakerAddress('otherAddressBody');">ลบรายการที่เลือก</span>
            </td>
        </tr>

    </table>
    <table id="otherAddressTab" style="width:95%" cellspacing="0">
        <thead>
        <tr class="TblHeaderColumn AlignCenter">
            <th style="width:7%">ลำดับที่</th>
            <th style="text-align:left;width:3%"><input type="checkbox" id="chkotherAddressBody"
                                                        name="chkotherAddressBody"
                                                        onclick="chkUncheckAll('chkotherAddressBody')"/></th>
            <th style="width:30%">รายละเอียด</th>
            <th style="width:30%">ที่อยู่</th>
            <th style="width:15%">พิกัด</th>
            <th>โทรศํพท์</th>
        </tr>
        </thead>
        <tbody id="otherAddressBody">
        </tbody>
    </table>

</div>
<div class="innerPosition" id="Relative"
     style="width: 100%; display: none">
    <table border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="spanLink"
                                                     onClick="openRelativePopup()">
							เพิ่มใหม่</span> | <span class="spanLink"
                                                     onClick="AM_doDeleteLawbreakerAddress('otherRelationBody');">ลบรายการที่เลือก</span>
            </td>
        </tr>
    </table>
    <table id="otherRelationTab" style="width:95%" cellspacing="0">
        <thead>
        <tr class="TblHeaderColumn AlignCenter">
            <th style="width:7%">ลำดับที่</th>
            <th style="text-align:left;width:3%"><input type="checkbox" id="chkotherRelationBody"
                                                        name="chkotherRelationBody"
                                                        onclick="chkUncheckAll('chkotherRelationBody')"/></th>
            <th style="width:10%">ความสัมพันธ์</th>
            <th style="width:15%">ชื่อ-สกุล</th>
            <th style="width:10%">โทรศัพท์</th>
            <th style="width:10%">E-Mail</th>
            <th style="width:25%">ที่อยู่ปัจจุบัน</th>
            <th>ที่อยู่ภูมิลำเนา</th>
        </tr>
        </thead>
        <tbody id="otherRelationBody">

        </tbody>
    </table>
</div>
</td>
</tr>

<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
</table>
</td>
</tr>
</table>

</form>
<SCRIPT language="JavaScript">

    var frmvalidator = new Validator("thai_lawbreaker_form");
    //frmvalidator.addValidation("first_name", "alpha");
//    frmvalidator.addValidation("first_name", "req", "Please enter your First Name");
//    frmvalidator.addValidation("first_name", "maxlen=20", "Max length for FirstName is 20");
    frmvalidator.setAddnlValidationFunction("DoCustomValidation");

</SCRIPT>

<script type="text/javascript">
    getProvince('sProvince', 'sDistrict', 'sSubDistrict', '${lawbreaker.province_code}', '${lawbreaker.district_code}', '${lawbreaker.subdistrict_code}');
    <c:if test="${lawbreaker_form == '2'}">
    jQuery("#continent").bind("change", function(event) {
        jQuery("#country_code > option").remove();
        var country_code = jQuery("#country_code");
        for (i = 0; i < jsonCountry.length; i++) {
            if (jsonCountry[i].continent == event.target.value) {
                var option = jQuery("<option />").attr("value", jsonCountry[i].country_code);
                option.html(jsonCountry[i].country_name);
                country_code.append(option);
            }
        }
    });
    jQuery("#country_code > option").remove();
    var country_code = jQuery("#country_code");
    for (i = 0; i < jsonCountry.length; i++) {
        if (jsonCountry[i].continent == 'A') {
            var option = jQuery("<option />").attr("value", jsonCountry[i].country_code);
            option.html(jsonCountry[i].country_name);
            country_code.append(option);
        }
    }
    </c:if>
</script>
<script type="text/javascript">
    function back2search() {
        writeTranLog('กลับหน้าค้นหา');
        location.href = '<c:url value="process?action=Lawbreaker&cmd=list&lawbreaker_type="/>${lawbreaker_form}';
    }
    function uploadFile(image_id, table, id, preview_id) {
        var image = dwr.util.getValue(image_id);
        FileUploader.checkUploadSize(image, function(data) {
            if (!data) {
                alert("ไฟล์ size มีขนาดเกิน กรุณาเลือกไฟล์ใหม่ ");
                dwr.util.setValue(image_id, "");
            } else {
                dwr.util.setValue(preview_id, "images/wait.gif");
                FileUploader.uploadFile(image, table, id, function(data) {
                    dwr.util.setValue(preview_id, "<c:url value='/process?action=GetImage'/>&table=" + table + "&id=" + id + "&rnd" + Date());
                    jQuery("#" + preview_id).css('display', '');
                });
            }
        });
    }
    function checkUploadFile(image_id){
        var image = dwr.util.getValue(image_id);
        FileUploader.checkUploadSize(image, function(data) {
            if (!data) {
                alert("ไฟล์ size มีขนาดเกิน กรุณาเลือกไฟล์ใหม่ ");
                dwr.util.setValue(image_id, "");
            }else{
                alert("ไฟล์ OK");
            }
        });
    }

    function openImg(table,id){
		//window.open('process?action=Divide_staff_pop&formname=sue_staff_name&id=sue_staff_idcardno&poscode=sue_poscode&offcode=sue_offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');
		window.open("process?action=GetImage&table=" + table + "&id=" + id + "&rnd" + Date(), '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=900,height=700,top=10,left=10,resizable=yes');
		//dwr.util.setValue(preview_id, "<c:url value='/process?action=GetImage'/>&table=" + table + "&id=" + id + "&rnd" + Date());
	}
</script>
