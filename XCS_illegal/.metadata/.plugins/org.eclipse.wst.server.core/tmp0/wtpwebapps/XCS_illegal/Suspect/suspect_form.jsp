<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<%@include file="/Templates/meta.jsp" %>


<script type="text/javascript">
    function ChkMinusInt(ctl)
    {
        zz = window.event.keyCode;

        if (zz < 48 || zz > 57) {
            window.event.keyCode = 0;
        }

    }
    function checkIDCard(textDom, maxLength) {

        if (textDom.value.length > 0 && textDom.value.length != maxLength) {
            if (maxLength == 13)
                alert("กรุณากรอกเลขบัตรประชาชนให้ครบ " + maxLength + " หลัก");
            else if (maxLength == 10)
                alert("กรุณากรอกเลขประจำตัวผู้เสียภาษี ห้ครบ " + maxLength + " หลัก");
            textDom.focus();
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
        //data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
        var data = window.showModalDialog('process?action=Suspect&cmd=openSuspectRelatifPopup', self, 'dialogWidth=700px,dialogHeight=400px');
        var relativeIndex = jQuery("tbody#otherRelationBody > tr").size() + 1;
        if (data) {
            data["index"] = relativeIndex;
            AM_appendRelativeRow("otherRelationBody", data);
        } else {
        }
    }
    function AM_appendRelativeRow(tableName, data) {
        // add hidden text
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
            'suspect_relative_id':null,
            'suspect_relative_suspect_no':null,
            'suspect_relative_count':1
        };
        var inputText = "";
        jQuery.each(paramMap, function(key, value) {
            inputText = inputText + "<input type=\"hidden\" value=\""+value+"\" name=\""+key+"\" />";
        });
        var index = '<td class="TblRow AlignCenter">' + data['index'] + inputText+'</td>';
        var box = '<td class="TblRow AlignCenter"><input name="chk' + data['index'] + '" type="checkbox"/></td>';
        var relation = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["relation_text"] + '</td>';
        var name = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["relative_name"] + '</td>';
        var tel = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["tel_no"] + '</td>';
        var email = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["email"] + '</td>';
        var currAddr = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["current_address"] + '</td>';
        var homeAddr = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["hometown_address"] + '</td>';
        var row = index + box + relation + name + tel + email + currAddr + homeAddr;
        //window.opener.jQuery("#"+tableName).last().append("<tr>"+ row +"</tr>");
        jQuery("#" + tableName).first().append("<tr id=\"otherRelationRow" + data['index'] + "\">" + row + "</tr>");
    }
    function AM_appendAddressRow(tableName, data) {
        // add hidden text
        var paramMap = {'suspect_address_tel_no':data["tel_no"],
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
            'suspect_address_id':null,
            'suspect_address_suspect_no':null,
            'suspect_address_count':1};
        var inputText = "";
        jQuery.each(paramMap, function(key, value) {
            inputText = inputText + "<input type=\"hidden\" value=\""+value+"\" name=\""+key+"\" />";
        });
        var index = '<td class="TblRow AlignCenter">' + data['index'] + inputText + '</td>';
        var box = '<td class="TblRow AlignCenter"><input name="chk' + data['index'] + '" type="checkbox"/></td>';
        var desc = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["description"] + '</td>';
        var address = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["full_address"] + '</td>';
        var coXY = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["coordinate_x"] + "/" + data["coordinate_y"] + '</td>';
        var tel = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["tel_no"] + '</td>';
        var row = index + box + desc + address + coXY + tel;
        //window.opener.jQuery("#"+tableName).last().append("<tr>"+ row +"</tr>");
        jQuery("#" + tableName).first().append("<tr id=\"otherAddressRow" + data['index'] + "\">" + row + "</tr>");
    }
    function AM_doDeleteSuspectAddress(tableName) {
        jQuery("#" + tableName + " tr").has("td > input:checked").remove();
        // rerun index of row
        jQuery("#" + tableName + " tr").each(function(index) {
            jQuery(this).children().first().text(index + 1);
        });
    }
</script>


<iframe name="upload_picture_frame" src="xxx" style="display:none;"></iframe>

<form action="process?action=Suspect&cmd=create" method="post" id="thai_suspect_form" enctype="multipart/form-data">

<input type="hidden" name="suspect_no" id="suspect_no" value="5"/>
<input type="hidden" name="suspect_type" id="suspect_type" value="1"/>
<!-- Body -->
<table width="100%" height="100%" border="0" cellspacing="0"
       cellpadding="0">
<tr>
<td width="100%" align="left" valign="top">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยคนไทย</span></td>
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
               onClick="location.href='process?action=Suspect&cmd=add'">
        <input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา"
               onclick="location.href='?page=/Suspect/suspect_list.jsp'"/>
    </td>

    <!--
                     <input name="btnBack" type="submit" class="barbutton" value="กลับหน้าค้นหา" onClick="uploadPicture();"></td>
                     -->
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
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ข้อมูลส่วนตัว</strong></td>
</tr>
<tr>
    <td width="2%">&nbsp;</td>
    <td width="20%" align="right">เลขที่บัตร ปปช :&nbsp;</td>
    <td width="30%"><input type="text" name="suspect_id_card"
                           class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="13" onblur="checkIDCard(this,13);">
        <img src="images/btn_browse.png"
             width="18" height="19" border="0" alt="ค้นหาจากทะเบียนราษฎร์"
             style="cursor: hand" name="search_from_id_card" id="search_from_id_card"></td>
    <td width="20%" align="right">เลขประจำตัวผู้เสียภาษี :&nbsp;</td>
    <td width="28%"><input type="text" name="tax_id_no"
                           class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="10" onblur="checkIDCard(this,10);">
        <img src="images/btn_browse.png" id="search_from_tax_id_no"
             width="18" height="19" border="0" alt="" style="cursor: hand">
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ชื่อ :&nbsp;</td>
    <td><select name="title_code">
        <option></option>
        <c:forEach items="${titles}" var="title" varStatus="i">
            <option value="${title.title_code}">${title.short_title}</option>
        </c:forEach>
    </select>&nbsp; <input type="text" name="first_name" class="textbox"
                           size="15"></td>
    <td align="right">นามสกุล :&nbsp;</td>
    <td><input type="text" name="last_name" class="textbox"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ชื่ออื่นๆ :&nbsp;</td>
    <td><input type="text" name="other_name" class="textbox"
               size="27"></td>
    <td align="right">โทรศัพท์&nbsp;:&nbsp;</td>
    <td><input name="mobile" type="text" class="textbox"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">วันเดือนปีเกิด :&nbsp;</td>
    <td>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="48%"><input name="birth_date" type="text"
                                       id="birth_date_field" class="textdate" size="10" readonly
                                       onchange="calAge(this);"></td>
                <td width="12%">
                    <a href="javascript:NewCssCal('birth_date_field','ddMMyyyy')"><img src="images/btn_calendar.png"
                                                                                       alt="" width="19"
                                                                                       height="19" align="middle"
                                                                                       style="border-style: none"
                                                                                       id="birth_date" width="19"
                                                                                       height="19"/></a>
                </td>
                <td width="40%">อายุ <strong id="age"></strong> ปี</td>
            </tr>
        </table>
    </td>
    <td align="right">Email :&nbsp;</td>
    <td><input type="text" name="email" class="textbox"
               size="30"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">เพศ :&nbsp;</td>
    <td><input name="sex" type="radio" value="0" checked>ชาย <input
            name="sex" type="radio" value="1">หญิง
    </td>
    <td align="right">
        <div>เชื้อชาติ :&nbsp;</div>
    </td>
    <td style="float:left;">
        <select name="race_id" class="select">
            <option></option>
            <c:forEach items="${rs}" var="r" varStatus="i">
                <option value="${r.id}">${r.race_name}</option>
            </c:forEach>
        </select>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>
    </td>
    <td align="right">
        <div style="margin-top:2">สัญชาติ :&nbsp;</div>
    </td>
    <td style="float:left;">
        <select name="nation_id" class="select" style="margin-top:2">
            <option></option>
            <c:forEach items="${nts}" var="nt" varStatus="i">
                <option value="${nt.id}">${nt.nation_name}</option>
            </c:forEach>
        </select>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">หมู่เลือด :&nbsp;</td>
    <td>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td width="23%"><select name="blood_type">
                    <option></option>
                    <option value="O">โอ</option>
                    <option value="A">เอ</option>
                    <option value="B">บี</option>
                    <option value="AB">เอบี</option>
                </select></td>
                <td width="31%" align="right">สถานภาพ :&nbsp;</td>
                <td width="46%"><select name="marital_status"
                                        class="select">
                    <option></option>
                    <option value="1">โสด</option>
                    <option value="2">สมรส</option>
                    <option value="3">หม้าย</option>
                    <option value="4">หย่าร้าง</option>
                </select></td>
            </tr>
        </table>
    </td>
    <td align="right">ศาสนา :&nbsp;</td>
    <td><select name="religion_id" class="select">
        <option></option>
        <c:forEach items="${rels}" var="rel" varStatus="i">
            <option value="${rel.id}">${rel.religion_name}</option>
        </c:forEach>
    </select></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ส่วนสูง :&nbsp;</td>
    <td><input type="text" name="height" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="5"
               size="6">ซม.
    </td>
    <td align="right">อาชีพ :&nbsp;</td>
    <td><input type="text" name="career" class="textbox"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">รายละเอียดเพิ่มเติม&nbsp;:&nbsp;</td>
    <td colspan="3" valign="top"><textarea name="description"
                                           cols="35" rows="3" class="textareabig2"></textarea></td>
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

<tr id="picB">
    <td>&nbsp;</td>
    <td align="right" valign="top">รูปถ่ายผู้ต้องสงสัย&nbsp;:&nbsp;</td>
    <td colspan="3" valign="top"><input name="link_photo" type="file"
                                        class="textbox" size="35"><br>
        <font color="#FF0000" size="1"><i style="display:none;">* Upload
            รูปภาพเมื่อบันทึก</i></font><br>
        <font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font></td>
</tr>
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
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ที่อยู่ตามภูมิลำเนา</strong></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ละติจูด&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="coordinate_x" type="text"
                           class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7">
        &nbsp;&nbsp;ลองจิจูด&nbsp;:&nbsp; <input name="coordinate_y"
                                                 type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);"
                                                 maxlength="5" size="7"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">เลขที่ :&nbsp;</td>
    <td colspan="3"><input name="address_no" type="text"
                           class="textbox" size="4">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
        <input name="moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
        &nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp; <input name="address_name"
                                                      type="text" class="textbox" size="25"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="soi" type="text"
                           class="textbox"> &nbsp;&nbsp;ถนน&nbsp;:&nbsp; <input
            name="road" type="text" class="textbox" size="25"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">จังหวัด :&nbsp;</td>
    <td><select name="province_code" id="sProvince"
                style="width: 180px;" onchange="getDistrict('sDistrict','sSubDistrict',this.value,'','');">
    </select></td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">อำเภอ :&nbsp;</td>
    <td><select name="district_code" id="sDistrict"
                style="width: 180px;" onchange="getTambol('sSubDistrict',this.value,'')">
    </select></td>
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
        <tr style="text-align:center;background-color:#ffccff;">
            <th style="width:7%">ลำดับที่</th>
            <th style="width:3%"><input type="checkbox" id="othAddrChk" name="othAddrChk"/></th>
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
            <th style="width:3%"><input type="checkbox" id="othRelChk" name="othRelChk"/></th>
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
    function DoCustomValidation()
    {
        var frm = document.forms["thai_suspect_form"];
        var id_card_no = frm.suspect_id_card.value;
        for (i = 0; i < id_card_no.length; i++) {
            var ch = id_card_no.charCodeAt(i);
            if (ch < 48 || ch > 57) {
                sfm_show_error_msg('Invalid ID Card Number.', frm.suspect_id_card);
                return false;
            }
        }
        var tax_id_no = frm.tax_id_no.value;
        for (i = 0; i < tax_id_no.length; i++) {
            var ch = tax_id_no.charCodeAt(i);
            if (ch < 48 || ch > 57) {
                sfm_show_error_msg('Invalid Tax ID Number.', frm.tax_id_no);
                return false;
            }
        }
        return true;
    }

    var frmvalidator = new Validator("thai_suspect_form");
    //frmvalidator.addValidation("first_name", "alpha");
    frmvalidator.addValidation("first_name", "req", "Please enter your First Name");
    frmvalidator.addValidation("first_name", "maxlen=20", "Max length for FirstName is 20");
    frmvalidator.setAddnlValidationFunction("DoCustomValidation");

    getProvince('sProvince','sDistrict','sSubDistrict')
</SCRIPT>


