<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type='text/javascript' src='dwr/interface/FileUploader.js'></script>
<script type="text/javascript">
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
    function initValue() {
        <c:if test="${suspect != null}">
        // add hidden if appear
        jQuery("input[name=suspect_id_card]").first().val('${suspect.suspect_id_card}');
        jQuery("input[name=tax_id_no]").first().val('${suspect.tax_id_no}');
        jQuery("input[name=suspect_id_card]").first().val('${suspect.suspect_id_card}');
        jQuery("select[name=title_code] option[value=${suspect.title_code}]").attr("selected", "selected");
        jQuery("input[name=first_name]").first().val('${suspect.first_name}');
        jQuery("input[name=last_name]").first().val('${suspect.last_name}');
        jQuery("input[name=other_name]").first().val('${suspect.other_name}');
        jQuery("input[name=mobile]").first().val('${suspect.mobile}');
        jQuery("#birth_date_field").val('<fmt:formatDate value='${suspect.birth_date}' pattern='dd/MM/yyyy'/>');
        <c:if test="${suspect.birth_date != null}">
            calBirthday("age",${suspect.birth_date.year}+1900+543,${suspect.birth_date.month},${suspect.birth_date.date});
        </c:if>
        jQuery("#photo_img").first().attr("src","<c:url value='/process?action=GetImage'/>&table=SUSPECT&id=${suspect.id}");
        jQuery("input[name=email]").first().val('${suspect.email}');
        jQuery("input[name=sex][value=${suspect.sex}]").attr("checked","checked");
        jQuery("select[name=race_id] option[value=${suspect.race_id}]").first().attr("selected", "selected");
        jQuery("select[name=nation_id] option[value=${suspect.nation_id}]").first().attr("selected", "selected");
        jQuery("select[name=blood_type] option[value=${suspect.blood_type}]").first().attr("selected", "selected");
        jQuery("select[name=marital_status] option[value=${suspect.marital_status}]").first().attr("selected", "selected");
        jQuery("select[name=religion_id] option[value=${suspect.religion_id}]").first().attr("selected", "selected");
        jQuery("input[name=height]").first().val('${suspect.height}');
        jQuery("input[name=career]").first().val('${suspect.career}');
        jQuery("input[name=description]").first().val('${suspect.description}');
        // photo link
        jQuery("input[name=photo_desc]").first().val('${suspect.photo_desc}');
        jQuery("input[name=coordinate_x]").first().val('${suspect.coordinate_x}');
        jQuery("input[name=coordinate_y]").first().val('${suspect.coordinate_y}');
        jQuery("input[name=address_no]").first().val('${suspect.address_no}');
        jQuery("input[name=moo]").first().val('${suspect.moo}');
        jQuery("input[name=address_name]").first().val('${suspect.address_name}');
        jQuery("input[name=soi]").first().val('${suspect.soi}');
        jQuery("input[name=road]").first().val('${suspect.road}');
        jQuery("input[name=tel]").first().val('${suspect.tel}');
        getProvince('sProvince','sDistrict','sSubDistrict','${suspect.province_code}','${suspect.district_code}','${suspect.subdistrict_code}');
        </c:if>
        <c:if test="${suspect==null}">
            jQuery("input[type=text]").val('');
            jQuery("#age").text('');
            jQuery("select").each(function(){
                jQuery(this).children().first().attr('selected','selected');
            });
            jQuery("input[type=radio]").removeAttr('checked');
            jQuery("textarea").html('');
            //alert(jQuery("textarea").size());
            getProvince('sProvince','sDistrict','sSubDistrict','','','');
        </c:if>
        initSuspectAddress();
        initSuspectRelatives();
    }
    jQuery(document).ready(function(){
        initValue();
    });
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
    function openAddressPopupEdit(rowId) {
        //data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
        var listParam = "";
        jQuery("#otherAddressRow"+rowId+" input").each(function(index){
            var input = jQuery(this);
            listParam = listParam +"&"+ input.attr("name") + "=" + input.attr("value");
        });

        var data = window.showModalDialog('process?action=Suspect&cmd=openSuspectAddressPopup&rowId='+rowId+listParam, self, 'dialogWidth=700px,dialogHeight=400px');
        var addressIndex = jQuery("tbody#otherAddressBody > tr").size() + 1;
        if (data) {
            data["rowId"] = ""+rowId;
            data["index"] = addressIndex;
            AM_appendAddressRow("otherAddressBody", data);
            //suspectAddressAr[suspectAddressAr.length+1] = data;
        } else {
        }
    }
    function openRelativePopupEdit(rowId) {
        var listParam = "";
        jQuery("#otherRelationRow"+rowId+" input").each(function(index){
            var input = jQuery(this);
            listParam = listParam +"&"+ input.attr("name") + "=" + input.attr("value");
        });

        var data = window.showModalDialog('process?action=Suspect&cmd=openSuspectRelatifPopup&'+listParam, self, 'dialogWidth=700px,dialogHeight=400px');
        var addressIndex = jQuery("tbody#otherRelationRow > tr").size() + 1;
        if (data) {
            data["rowId"] = ""+rowId;
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
            inputText = inputText + "<input type=\"hidden\" value=\""+value+"\" name=\""+key+"\" />";
        });
        var index = '<td class="TblRow AlignCenter keylink">' + ((data["rowId"])?data["rowId"]:data['index']) + '</td>';
        var box = '<td class="TblRow AlignCenter"><input name="chk' +tableName+ data['index'] + '" type="checkbox"/></td>';
        var relation = '<td align="left" valign="top" class="TblRow AlignLeft" >' + data["relation_text"] + '</td>';
        var name = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["relative_name"] + '</td>';
        var tel = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["tel_no"] + '</td>';
        var email = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["email"] + '</td>';
        var currAddr = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["current_address"] + '</td>';
        var homeAddr = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["hometown_address"] + '</td>';
        var row = index + box + relation + name + tel + email + currAddr + homeAddr + inputText;
        if(data["rowId"]){
            jQuery("#otherRelationRow" +data["rowId"]).first().children().remove();
            jQuery("#otherRelationRow" +data["rowId"]).first().append(row);
        }else{
            jQuery("#" + tableName).first().append("<tr id=\"otherRelationRow" + data['index'] + "\"  class='" + (data["index"] % 2 == 0 ? 'even' : 'odd') + "'>" + row + "</tr>");
            var indexRow =  data["index"];
            jQuery("#"+tableName+" > tr#otherRelationRow"+data['index']+" > td.keylink").last().bind("click",function(event){
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
            inputText = inputText + "<input type=\"hidden\" value=\""+value+"\" name=\""+key+"\" />";
        });
        var index = '<td class="TblRow AlignCenter keylink">' + ((data["rowId"])?data["rowId"]:data['index']) + '</td>';
        var box = '<td class="TblRow AlignCenter"><input name="chk'+ tableName + data['index'] + '" type="checkbox"/></td>';
        var desc = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["description"] + '</td>';
        var address = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["full_address"] + '</td>';
        var coXY = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["coordinate_x"] + "/" + data["coordinate_y"] + '</td>';
        var tel = '<td align="left" valign="top" class="TblRow AlignCenter">' + data["tel_no"] + '</td>';
        var row = index + box + desc + address + coXY + tel + inputText;
        if(data["rowId"]){
            jQuery("#otherAddressRow" +data["rowId"]).first().children().remove();
            jQuery("#otherAddressRow" +data["rowId"]).first().append(row);
        }else{
            jQuery("#" + tableName).first().append("<tr id=\"otherAddressRow" + data['index'] + "\"  class='" + (data["index"] % 2 == 0 ? 'even' : 'odd') + "'>" + row + "</tr>");
            var indexRow =  data["index"];
            jQuery("#"+tableName+" > tr#otherAddressRow"+data['index']+" > td.keylink").last().bind("click",function(event){
              openAddressPopupEdit(indexRow);
            });
        }
    }
    function AM_doDeleteSuspectAddress(tableName) {
        jQuery("#" + tableName + " tr").has("td > input:checked").remove();
        // rerun index of row
        jQuery("#" + tableName + " tr").each(function(index) {
            jQuery(this).children().first().text(index + 1);
            jQuery(this).removeClass();
            jQuery(this).addClass(((index + 1) % 2 == 0) ? 'even' : 'odd');

        });
    }
    function chkUncheckAll(prefix) {
        if (jQuery("#" + prefix).first().attr('checked')) {
            jQuery("input[name^='" + prefix + "']").attr('checked', true);
        } else {
            jQuery("input[name^='" + prefix + "']").attr('checked', false);
        }
    }
</script>


<iframe name="upload_picture_frame" src="xxx" style="display:none;"></iframe>
<c:if test="${suspect != null}">
<form action="process?action=Suspect&cmd=update" method="post" id="thai_suspect_form" enctype="multipart/form-data"
      target="upload_picture_frame" name="thai_suspect_form">
    <input type="hidden" name="id" value="${suspect.id}">
    <input type="hidden" name="suspect_no" value="${suspect.suspect_no}">
    <input type="hidden" name="suspect_type" value="${suspect.suspect_type}">
    <input type="hidden" name="create_id" value="${suspect.create_id}">
    <input type="hidden" name="create_date" value="${suspect.create_date}">
    <input type="hidden" name="del_flag" value="${suspect.del_flag}">
    <input type="hidden" name="offcode" value="${suspect.offcode}">
</c:if>
<c:if test="${suspect == null}">
    <form action="process?action=Suspect&cmd=create" method="post" id="thai_suspect_form" enctype="multipart/form-data">
    <input type="hidden" name="suspect_no" id="suspect_no" value="5"/>
    <input type="hidden" name="suspect_type" id="suspect_type" value="1"/>
    <input type="hidden" name="suspectType" value="1" />
</c:if>
<tr>
<td valign="top"><!-- Body -->
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
               onClick="initValue();">
        <input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา"
               onClick="location.href='<c:url value="?page=/Suspect/suspect_list${suspect_form}.jsp"/>';return
        document.MM_returnValue">
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
        <c:forEach var="title" items="${titles}" varStatus="i">
            <option value="${title.title_code}" >${title.title_name}</option>
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
               size="27" ></td>
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
                                       id="birth_date_field" class="textdate" size="10" readonly ></td>
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
    <td><input type="text" name="email" class="textbox" size="30"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">เพศ :&nbsp;</td>
    <td><input name="sex" type="radio" value="0">ชาย
        <input name="sex" type="radio" value="1">หญิง
    </td>
    <td align="right">
        <div>เชื้อชาติ :&nbsp;</div>
    </td>
    <td style="float:left;">
        <select name="race_id" class="select">
            <option></option>
            <c:forEach items="${rs}" var="r" varStatus="i">
                <option value="${r.id}" >${r.race_name}</option>
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
                <option value="${nt.id}" >${nt.nation_name}</option>
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
                    <option value="O" >โอ</option>
                    <option value="A" >เอ</option>
                    <option value="B" >บี</option>
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
            <option value="${rel.id}" >${rel.religion_name}</option>
        </c:forEach>
    </select></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ส่วนสูง :&nbsp;</td>
    <td><input type="text" name="height" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="5" size="6">ซม.
    </td>
    <td align="right">อาชีพ :&nbsp;</td>
    <td><input type="text" name="career" class="textbox" /></td>
</tr>
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

<c:if test="${suspect != null}">
<tbody id="picA0x11">
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top"
            >รูปถ่าย&nbsp;:&nbsp;</td>
    <td colspan="3" valign="top"><img id="photo_img" border="0" width="100" height="100" /></td>
<tr></tr>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">เปลี่ยนรูปถ่าย&nbsp;:&nbsp;</td>
    <td colspan="3" valign="top">

        <input name="link_photo" type="file"
               class="textbox" size="35" onchange="uploadPreview(this,'photo_img')">
        <input name="Submit2"
               type="button" value="Upload"><br>
        <font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font></td>
</tr>
</tbody>
</c:if>
<c:if test="${suspect == null}">
<tr id="picB">
    <td>&nbsp;</td>
    <td align="right" valign="top">รูปถ่ายผู้ต้องสงสัย&nbsp;:&nbsp;</td>
    <td colspan="3" valign="top"><input name="link_photo" type="file"
                                        class="textbox" size="35"><br>
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
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ที่อยู่ตามภูมิลำเนา</strong></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ละติจูด&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="coordinate_x" type="text"
                           class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7">
        &nbsp;&nbsp;ลองจิจูด&nbsp;:&nbsp; <input name="coordinate_y"
                                                 type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);"
                                                 maxlength="5" size="7" ></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">เลขที่ :&nbsp;</td>
    <td colspan="3"><input name="address_no" type="text" class="textbox" size="4" >
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
        <input name="moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
        &nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp; <input name="address_name" type="text" class="textbox" size="25"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="soi" type="text" class="textbox"> &nbsp;&nbsp;ถนน&nbsp;:&nbsp; <input
            name="road" type="text" class="textbox" size="25" ></td>
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
                                       maxlength="5" >&nbsp;&nbsp;&nbsp;
        โทรศัพท์&nbsp;:&nbsp; <input name="tel" type="text"
                                     class="textbox" size="10" ></td>
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
            <th style="text-align:left;width:3%"><input type="checkbox" id="chkotherAddressBody" name="chkotherAddressBody" onclick="chkUncheckAll('chkotherAddressBody')"/></th>
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
            <th style="text-align:left;width:3%"><input type="checkbox" id="chkotherRelationBody" name="chkotherRelationBody" onclick="chkUncheckAll('chkotherRelationBody')"/></th>
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
</td>

</tr>
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
    frmvalidator.addValidation("first_name", "alpha");
    frmvalidator.addValidation("first_name", "req", "Please enter your First Name");
    frmvalidator.addValidation("first_name", "maxlen=20", "Max length for FirstName is 20");
    frmvalidator.setAddnlValidationFunction("DoCustomValidation");

</SCRIPT>

<script type="text/javascript">
    getProvince('sProvince', 'sDistrict', 'sSubDistrict', '${suspect.province_code}', '${suspect.district_code}','${suspect.subdistrict_code}');
</script>
<c:if test="${completed != null}">
    <script type="text/javascript">
        if (confirm('บันทึกข้อมูเลเรียบร้อย ต้องการแสดงข้อมูลดำเนินการสืบสวนหรือไม่') == true) {
            location.href = "<c:url value='process?action=Suspect&cmd=detail&id='/>${suspect.id}";
        } else {
            alert("<c:url value='process?action=Suspect&cmd=edit&id='/>${suspect.id}");
            location.href = "<c:url value='process?action=Suspect&cmd=edit&id='/>${suspect.id}";
        }
    </script>
</c:if>

