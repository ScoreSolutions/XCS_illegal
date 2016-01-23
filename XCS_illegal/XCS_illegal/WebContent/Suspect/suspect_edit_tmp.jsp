<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type='text/javascript' src='dwr/interface/FileUploader.js'></script>
<style type="text/css">
    .keylink {
        cursor: hand;
    }
</style>
<script type="text/javascript">
var suspect_form = '${suspect_form}';
<c:if test="${countryJson != null}">
var jsonCountry = eval('(${countryJson})');
</c:if>
function initSuspectAddress() {
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
    data["district_code"] = "${sa.district_code}";
    data["district_text"] = "${sa.districtText}";
    data["subdistrict_code"] = "${sa.subdistrict_code}";
    data["subdistrict_text"] = "${sa.subDistrictText}";
    data["coordinate_x"] = "${sa.coordinate_x}";
    data["coordinate_y"] = "${sa.coordinate_y}";
    data["description"] = "${sa.description}";
    data["address"] = "${sa.address}";
    data["full_address"] = "${sa.full_address}";
    data["suspect_no"] = "${sa.suspect_no}";
    data["id"] = "${sa.id}";
    var addressIndex = jQuery("tbody#otherAddressBody > tr").size() + 1;
    data["index"] = addressIndex;
    AM_appendAddressRow("otherAddressBody", data);
</c:forEach>
</c:if>
}
function initSuspectRelatives() {
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
    data["suspect_no"] = "${sr.suspect_no}";
    data["id"] = "${sr.id}";
    var addressIndex = jQuery("tbody#otherRelationBody > tr").size() + 1;
    data["index"] = addressIndex;
    AM_appendRelativeRow("otherRelationBody", data);
</c:forEach>
</c:if>
}
jQuery(document).ready(function() {
    initValue();
    var completed = '${completed}';
    if(completed == 'completed'){
        if (confirm('บันทึกข้อมูเลเรียบร้อย ต้องการแสดงข้อมูลดำเนินการสืบสวนหรือไม่') == true) {
            window.location.href = "process?action=Suspect&cmd=detail&id=${suspect.id}";
        }
    }
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
    writeTranLog("เพิ่มที่อยู่ผู้ต้องสงสัย");
    //data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
    var data = window.showModalDialog('process?action=Suspect&cmd=openSuspectAddressPopup', self, 'dialogWidth=700px,dialogHeight=400px');
    var addressIndex = jQuery("tbody#otherAddressBody > tr").size() + 1;
    if (data) {
        data["index"] = addressIndex;
        AM_appendAddressRow("otherAddressBody", data);
        //suspectAddressAr[suspectAddressAr.length+1] = data;
    } else {
    }
}


function openRelativePopup() {
    writeTranLog("แสดงหน้าจอเพิ่มข้อมูลผู้ต้องสงสัย");
    //data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
    var data = window.showModalDialog('process?action=Suspect&cmd=openSuspectRelatifPopup', self, 'dialogWidth=700px,dialogHeight=400px');
    var relativeIndex = jQuery("tbody#otherRelationBody > tr").size() + 1;
    if (data) {
        data["index"] = relativeIndex;
        AM_appendRelativeRow("otherRelationBody", data);
    } else {
    }
}
function openAddressPopupEdit(rowId) {
    writeTranLog("เพิ่มที่อยู่ผู้ต้องสงสัย");
    //data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
    var listParam = "";
    var maxRow = jQuery("tbody#otherAddressBody > tr").size();
    jQuery("#otherAddressRow" + rowId + " input").each(function(index) {
        var input = jQuery(this);
        listParam = listParam + "&" + input.attr("name") + "=" + input.attr("value");
    });
    //alert(listParam);
    var data = window.showModalDialog('process?action=Suspect&cmd=openSuspectAddressPopup&maxRow='+maxRow+'&rowId=' + rowId + listParam, self, 'dialogWidth=700px,dialogHeight=400px');
    var addressIndex = jQuery("tbody#otherAddressBody > tr").size() + 1;
    if (data) {
        data["rowId"] = "" + rowId;
        data["index"] = addressIndex;
        AM_appendAddressRow("otherAddressBody", data);
        //suspectAddressAr[suspectAddressAr.length+1] = data;
    } else {
    }
}
function openRelativePopupEdit(rowId) {
    writeTranLog("แสดงหน้าจอเพิ่มข้อมูลผู้ต้องสงสัย");
    var listParam = "";
    var maxRow = jQuery("tbody#otherRelationBody > tr").size();
    jQuery("#otherRelationRow" + rowId + " input").each(function(index) {
        var input = jQuery(this);
        listParam = listParam + "&" + input.attr("name") + "=" + input.attr("value");
    });
    //alert(listParam);
    var data = window.showModalDialog('process?action=Suspect&ssid='+(new Date())+'&cmd=openSuspectRelatifPopup&maxRow='+maxRow+'&rowId='+rowId + listParam, self, 'dialogWidth=700px,dialogHeight=400px');
    var addressIndex = jQuery("tbody#otherRelationBody > tr").size() + 1;
    if (data) {
        data["rowId"] = "" + rowId;
        data["index"] = addressIndex;
        AM_appendRelativeRow("otherRelationBody", data);
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
        'suspect_relative_relation':data["relation"],
        'suspect_relative_idcardno':data["idcardno"],
        'suspect_relative_relation_text':data["relation_text"],
        'suspect_relative_title_code':data["title_code"],
        'suspect_relative_title_text':data["title_text"],
        'suspect_relative_first_name':data["first_name"],
        'suspect_relative_last_name':data["last_name"],
        'suspect_relative_tel_no':data["tel_no"],
        'suspect_relative_email':data["email"],
        'suspect_relative_current_address_no':data["current_address_no"],
        'suspect_relative_current_moo':data["current_moo"],
        'suspect_relative_current_soi':data["current_soi"],
        'suspect_relative_current_road':data["current_road"],
        'suspect_relative_current_address_name':data["current_address_name"],
        'suspect_relative_current_province_code':data["current_province_code"],
        'suspect_relative_current_district_code':data["current_district_code"],
        'suspect_relative_current_subdistrict_code':data["current_subdistrict_code"],
        'suspect_relative_current_province_text':data["current_province_text"],
        'suspect_relative_current_district_text':data["current_district_text"],
        'suspect_relative_current_subdistrict_text':data["current_subdistrict_text"],
        'suspect_relative_hometown_address_no':data["hometown_address_no"],
        'suspect_relative_hometown_moo':data["hometown_moo"],
        'suspect_relative_hometown_soi':data["hometown_soi"],
        'suspect_relative_hometown_road':data["hometown_road"],
        'suspect_relative_hometown_province_code':data["hometown_province_code"],
        'suspect_relative_hometown_district_code':data["hometown_district_code"],
        'suspect_relative_hometown_subdistrict_code':data["hometown_subdistrict_code"],
        'suspect_relative_hometown_province_text':data["hometown_province_text"],
        'suspect_relative_hometown_district_text':data["hometown_district_text"],
        'suspect_relative_hometown_subdistrict_text':data["hometown_subdistrict_text"],
        'suspect_relative_count':'1',
        'suspect_relative_id':data["id"]
    };
    var inputText = "";
    jQuery.each(paramMap, function(key, value) {
        inputText = inputText + "<input type=\"hidden\" value=\"" + value + "\" name=\"" + key + "\" />";
    });
    var index = '<td class="TblRow AlignCenter">' + ((data["rowId"]) ? data["rowId"] : data['index']) + '</td>';
    var box = '<td class="TblRow AlignCenter"><input name="chk' + tableName + data['index'] + '" type="checkbox"/></td>';
    var relation = '<td align="left" valign="top" class="TblRow AlignLeft" >' + data["relation_text"] + '</td>';
    var name = '<td align="left" valign="top" class="TblRow AlignLeft keylink">' + data["relative_name"] + '</td>';
    var tel = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["tel_no"] + '</td>';
    var email = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["email"] + '</td>';
    var currAddr = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["current_address"] + '</td>';
    var homeAddr = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["hometown_address"] + '</td>';
    var row = index + box + relation + name + tel + email + currAddr + homeAddr + inputText;
    if (data["rowId"]) {
        jQuery("#otherRelationRow" + data["rowId"]).first().children().remove();
        jQuery("#otherRelationRow" + data["rowId"]).first().append(row);
        var indexRow = data['rowId'];
        jQuery("#" + tableName + " > tr#otherRelationRow" + data['rowId'] + " > td.keylink").last().bind("click", function(event) {
            openRelativePopupEdit(indexRow);
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
        'suspect_address_tel_no':data["tel_no"],
        'suspect_address_fax_no':data["fax_no"],
        'suspect_address_address_name':data["address_name"],
        'suspect_address_moo':data["moo"],
        'suspect_address_road':data["road"],
        'suspect_address_soi':data["soi"],
        'suspect_address_zipcode':data["zipcode"],
        'suspect_address_province_code':data["province_code"],
        'suspect_address_province_text':data["province_text"],
        'suspect_address_district_code':data["district_code"],
        'suspect_address_district_text':data["district_text"],
        'suspect_address_subdistrict_code':data["subdistrict_code"],
        'suspect_address_subdistrict_text':data["subdistrict_text"],
        'suspect_address_coordinate_x':data["coordinate_x"],
        'suspect_address_coordinate_y':data["coordinate_y"],
        'suspect_address_description':data["description"],
        'suspect_address_address':data["address"],
        'suspect_address_id':data["id"],
        'suspect_address_suspect_no':data["suspect_no"],
        'suspect_address_count':1};
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
function AM_doDeleteSuspectAddress(tableName) {
    if(alertConfirmDelete()){
    if (tableName == 'otherAddressBody') {
        writeTranLog('ลบที่อยู่ผู้ต้องสงสัย');
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

	<script>
		function ValidateEmail(){
			//alert(document.dataform.email.value.indexOf("@") + " $$$$$ ");
			var txtChk = document.dataform.email.value;
			if (txtChk != ""){
				if(txtChk.indexOf("@") > -1 && txtChk.indexOf(".") > -1){
					return true;
				}else{
					alert("รูปแบบ Email ไม่ถูกต้อง");
					document.dataform.email.select();
					return false;
				}
			}else
				return true;
		}
	</script>
<iframe name="upload_picture_frame" src="xxx" style="display:none;"></iframe>
<c:if test="${suspect != null && suspect.id != null}">
    <form action="process?action=Suspect&cmd=update" method="post" name="dataform" id="thai_suspect_form" enctype="multipart/form-data">
<%--target="upload_picture_frame" --%>
    <input type="hidden" name="id" value="${suspect.id}">
    <input type="hidden" name="suspect_no" value="${suspect.suspect_no}">
    <input type="hidden" name="suspect_type" value="${suspect.suspect_type}">
    <input type="hidden" name="create_id" value="${suspect.create_id}">
    <input type="hidden" name="create_date" value="${suspect.create_date}">
    <input type="hidden" name="del_flag" value="${suspect.del_flag}">
    <input type="hidden" name="offcode" value="${suspect.offcode}">

</c:if>
<c:if test="${suspect == null || suspect.id == null}">
    <form action="process?action=Suspect&cmd=create" method="post" name="dataform" id="thai_suspect_form" enctype="multipart/form-data">
    <input type="hidden" name="suspect_type" id="suspect_type" value="${(suspect_type==null)?'1':(suspect_type)}"/>
</c:if>
<!-- Body -->
<c:if test="${error != null}">
    <table><tr><td><font color="red">${error}</font></td></tr></table>
</c:if>
<table width="100%" border="1" cellspacing="0"
       cellpadding="0">
<tr>
<td width="100%" align="left" valign="top">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <td width="99%">
        <c:if test="${suspect_form == '1'}">
            <span class="websitename">ประวัติผู้ต้องสงสัยคนไทย</span>
        </c:if>
        <c:if test="${suspect_form == '2'}">
            <span class="websitename">ประวัติผู้ต้องสงสัยชาวต่างชาติ</span>
        </c:if>
        <c:if test="${suspect_form == '3'}">
            <span class="websitename">ประวัติผู้ต้องสงสัยผู้ประกอบการ</span>
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
        <c:if test="${suspect_form == '1' || suspect_form == '2'}">
        	<input name="btnSave" type="submit" class="barbutton" value="บันทึก" onClick="return ValidateEmail();" />	
        </c:if>
        <c:if test="${suspect_form == '3'}">
        	<input name="btnSave" type="submit" class="barbutton" value="บันทึก"/>	
        </c:if>
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
<table width="706" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td bgcolor="#F5F5F5">&nbsp;</td>
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>
        <c:if test="${suspect_form == '3'}">
            ข้อมูลผู้ประกอบการ
        </c:if>
        <c:if test="${suspect_form != '3'}">
            ข้อมูลส่วนตัว
        </c:if>
    </strong></td>
</tr>
<c:if test="${suspect_form == '1'}">
    <%@include file="suspect_edit1.jsp" %>
</c:if>
<c:if test="${suspect_form == '2'}">
    <%@include file="suspect_edit2.jsp" %>
</c:if>
<c:if test="${suspect_form == '3'}">
    <%@include file="suspect_edit3.jsp" %>
</c:if>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">รายละเอียดเพิ่มเติม&nbsp;:&nbsp;</td>
    <td colspan="3" valign="top"><textarea name="description"
                                           cols="35" rows="3" class="textareabig2"></textarea>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">&nbsp;</td>
    <td colspan="3" valign="top">&nbsp;</td>
</tr>

<tr>
    <td></td>
    <td align="right" valign="top">&nbsp;</td>
    <td colspan="3" valign="top">
    </td>
</tr>

<c:if test="${suspect != null && suspect.id != null}">
    <tbody id="picA0x11">
    <tr>
        <td>&nbsp;</td>
        <td align="right" valign="top"
                >รูปถ่าย&nbsp;:&nbsp;</td>
        <td colspan="3" valign="top"><img id="photo_img" border="0" width="100" height="100"/></td>
    <tr></tr>
    <tr>
        <td>&nbsp;</td>
        <td align="right" valign="top">เปลี่ยนรูปถ่าย&nbsp;:&nbsp;</td>
        <td colspan="3" valign="top">

            <input name="link_photo" type="file"
                   class="textbox" size="35">
            <input name="Submit2"
                   type="button" value="Upload" onclick="uploadFile('link_photo','suspect',${suspect.id},'photo_img')"/><br>
            <font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font></td>
    </tr>
    </tbody>
</c:if>
<c:if test="${suspect == null || suspect.id == null}">
    <tr id="picB">
        <td>&nbsp;</td>
        <td align="right" valign="top">รูปถ่ายผู้ต้องสงสัย&nbsp;:&nbsp;</td>
        <td colspan="3" valign="top"><input name="link_photo" type="file"
                                            class="textbox" size="35">
            <%--<input name="Submit2"--%>
                   <%--type="button" value="Check Size" onclick="checkUploadFile('link_photo','suspect','','photo_img')"/>--%>
            <br>
            <font color="#FF0000" size="1"><i style="display:none;">* Upload
                รูปภาพเมื่อบันทึก</i></font><br>
            <font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font></td>
    </tr>
</c:if>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">รายละเอียดรูปถ่าย&nbsp;:&nbsp;</td>
    <td colspan="3"><textarea name="photo_desc" cols="35"
                              rows="3" class="textareabig"></textarea></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td bgcolor="#F5F5F5">&nbsp;</td>
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>
    <c:if test="${suspect_form == '1'}">
        ที่อยู่ตามภูมิลำเนา
    </c:if>
    <c:if test="${suspect_form == '2'}">
        ที่อยู่ในประเทศไทย
    </c:if>
    <c:if test="${suspect_form == '3'}">
        สถานที่ตั้ง
    </c:if>
    </strong></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ละติจูด&nbsp;:&nbsp;</td>
    <td colspan="3">
    	<input name="coordinate_x" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" size="7" >
        &nbsp;&nbsp;ลองจิจูด&nbsp;:&nbsp; 
        <input name="coordinate_y" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" size="7" >
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">เลขที่ :&nbsp;</td>
    <td colspan="3"><input name="address_no" type="text" class="textbox" size="4">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
        <input name="moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);"  size="3">
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

<c:if test="${suspect_form == '2'}">
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
        <td>
	        <select name="continent" id="continent">
	            <option value="" selected></option>
	            <option value="A">เอเชีย</option>
	            <option value="B">ยุโรป</option>
	            <option value="C">อเมริกาเหนือ</option>
	            <option value="D">อเมริกากลาง</option>
	            <option value="E">อเมริกาใต้</option>
	            <option value="F">แอฟฟริกา</option>
	            <option value="G">ออสเตรเลีย</option>
	        </select>
        </td>
        <td height="25" align="right">ประเทศ :&nbsp;</td>
        <td>
        	<select name="country_code" id="country_code" style="width:250px">
        	</select>
        </td>
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
	            เพิ่มใหม่</span> | <span class="spanLink" onClick="AM_doDeleteSuspectAddress('otherAddressBody');">ลบรายการที่เลือก</span>
            </td>
        </tr>

    </table>
    <table id="otherAddressTab" style="width:95%" cellspacing="0">
        <thead>
        <tr class="">
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
                                                     onClick="AM_doDeleteSuspectAddress('otherRelationBody');">ลบรายการที่เลือก</span>
            </td>
        </tr>
    </table>
    <table id="otherRelationTab" style="width:95%" cellspacing="0">
        <thead>
        <tr style="text-align:center;background-color:#ffccff;">
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

    var frmvalidator = new Validator("thai_suspect_form");
    frmvalidator.setAddnlValidationFunction("DoCustomValidation");

</SCRIPT>

<script type="text/javascript">
    getProvince('sProvince', 'sDistrict', 'sSubDistrict', '${suspect.province_code}', '${suspect.district_code}', '${suspect.subdistrict_code}');
    <c:if test="${suspect_form == '2'}">
	    jQuery("#continent").bind("change", function(event) {
	        jQuery("#country_code > option").remove();
	        var country_code = jQuery("#country_code");
	        var option = jQuery("<option />").attr("value", '');
	        country_code.append(option);
	        for (i = 0; i < jsonCountry.length; i++) {
	            if (jsonCountry[i].continent == event.target.value || event.target.value == '') {
	                var option = jQuery("<option />").attr("value", jsonCountry[i].country_code);
	                option.html(jsonCountry[i].country_name);
	                country_code.append(option);
	            }
	        }
	       
	    });
	   
	    //jQuery("#continent").trigger("change");
    </c:if>
</script>
<script type="text/javascript">
    function back2search() {
        writeTranLog('กลับหน้าค้นหา');
        location.href = '<c:url value="process?action=Suspect&cmd=list&suspect_type="/>${suspect_form}';
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
</script>
