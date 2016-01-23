<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type="text/javascript">
    function searchSuspectByIDCard() {
        var idcard_no = jQuery("[name=suspect_id_card]").val();
        jQuery.ajax({
            url:'process?action=Ajax&cmd=searchSuspectByIDCard&idcard_no=' + idcard_no,
            async:false,
            success: function(data) {
                if (data > 0) {
                    location.href = '<c:url value="process?action=Suspect&cmd=edit&id="/>' + data;
                } else {
                    alert("ไม่พบเลขที่บัตรประชาชนนี้");
                }
            }
        });
    }
    function searchSuspectByTaxID() {
        var tax_id_no = jQuery("[name=tax_id_no]").val();
        jQuery.ajax({
            url:'process?action=Ajax&cmd=searchSuspectByTaxID&tax_id_no=' + tax_id_no,
            async:false,
            success: function(data) {
                if (data > 0) {
                    location.href = '<c:url value="process?action=Suspect&cmd=edit&id="/>' + data;
                } else {
                    alert("ไม่พบเลขทะเบียนผู้เสียภาษี");
                }
            }
        });
    }
    function validateSuspectByTaxID(expect_id) {
        var tax_id_no = jQuery("[name=tax_id_no]").val();
        var ret = false;
        jQuery.ajax({
            url:'process?action=Ajax&cmd=searchSuspectByTaxID&tax_id_no=' + tax_id_no,
            async:false,
            success: function(data) {
                if(data > 0 && expect_id > 0){
                   if(data == expect_id)
                    ret = true;
                   else
                    ret = false;
                }else{
                    ret = true;
                }
            }
        });
        return ret;
    }
    function validateSuspectByIDCard(expect_id){
        var idcard_no = jQuery("[name=suspect_id_card]").val();
        var ret = false;
        jQuery.ajax({
            url:'process?action=Ajax&cmd=searchSuspectByIDCard&idcard_no=' + idcard_no,
            async:false,
            success: function(data) {
                if(data > 0 && expect_id > 0){
                   if(data == expect_id)
                    ret = true;
                   else
                    ret = false;
                }else{
                    ret = true;
                }
            }
        });
        return ret;
    }
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
        var expect_id = ${(suspect==null || suspect.id == null)?-1:(suspect.id)};
        if(validateSuspectByIDCard(expect_id)){

        }else{
            sfm_show_error_msg('เลขที่บัตรประจำตัวประชาชนซ้ำ', frm.suspect_id_card);
            return false;
        }
        if(validateSuspectByTaxID(expect_id)){

        }else{
            sfm_show_error_msg('เลขประจำตัวผู้เสียภาษีซ้ำ', frm.tax_id_no);
            return false;
        }
        return true;
    }
    function initValue(flag) {
        if(flag){
            writeTranLog("ยกเลิกการแก้ไขข้อมูลผู้ต้องสงสัยคนไทย");
        }
    <%--<c:if test="${suspect != null && suspect.id != null}">--%>
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
        calBirthday("age", ${suspect.birth_date.year}+1900 + 543, ${suspect.birth_date.month}, ${suspect.birth_date.date});
    </c:if>
        jQuery("#photo_img").first().attr("src", "<c:url value='/process?action=GetImage'/>&table=SUSPECT&id=${suspect.id}");
        jQuery("input[name=email]").first().val('${suspect.email}');
        jQuery("input[name=sex][value=${suspect.sex}]").attr("checked", "checked");
        jQuery("select[name=race_id] option[value=${suspect.race_id}]").first().attr("selected", "selected");
        jQuery("select[name=nation_id] option[value=${suspect.nation_id}]").first().attr("selected", "selected");
        jQuery("select[name=blood_type] option[value=${suspect.blood_type}]").first().attr("selected", "selected");
        jQuery("select[name=marital_status] option[value=${suspect.marital_status}]").first().attr("selected", "selected");
        jQuery("select[name=religion_id] option[value=${suspect.religion_id}]").first().attr("selected", "selected");
        jQuery("input[name=height]").first().val('${suspect.height}');
        jQuery("input[name=career]").first().val('${suspect.career}');
        jQuery("[name=description]").first().val('${suspect.description}');
        // photo link
        jQuery("[name=photo_desc]").first().val('${suspect.photo_desc}');
        jQuery("input[name=coordinate_x]").first().val('${suspect.coordinate_x}');
        jQuery("input[name=coordinate_y]").first().val('${suspect.coordinate_y}');
        jQuery("input[name=address_no]").first().val('${suspect.address_no}');
        jQuery("input[name=moo]").first().val('${suspect.moo}');
        jQuery("input[name=address_name]").first().val('${suspect.address_name}');
        jQuery("input[name=soi]").first().val('${suspect.soi}');
        jQuery("input[name=road]").first().val('${suspect.road}');
        jQuery("input[name=tel]").first().val('${suspect.tel}');
        jQuery("[name=post_code]").val('${suspect.post_code}');
        getProvince('sProvince', 'sDistrict', 'sSubDistrict', '${suspect.province_code}', '${suspect.district_code}', '${suspect.subdistrict_code}');
    </c:if>
    <c:if test="${suspect==null}">
        jQuery("input[type=text]").val('');
        jQuery("#age").text('');
        jQuery("select").each(function() {
            jQuery(this).children().first().attr('selected', 'selected');
        });
        jQuery("input[type=radio]").removeAttr('checked');
        jQuery("textarea").html('');
        //alert(jQuery("textarea").size());
        getProvince('sProvince', 'sDistrict', 'sSubDistrict', '', '', '');
    </c:if>
        initSuspectAddress();
        initSuspectRelatives();
    }
</script>
<tr>
    <td width="2%">&nbsp;</td>
    <td width="20%" align="right">เลขที่บัตร ปปช :&nbsp;</td>
    <td width="30%"><input type="text" name="suspect_id_card"
                           class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="13" onblur="checkIDCard(this,13);">
        <img src="images/btn_browse.png"
             width="18" height="19" border="0" alt="ค้นหาจากทะเบียนราษฎร์"
             style="cursor: hand" name="search_from_id_card" id="search_from_id_card" onclick="searchSuspectByIDCard()"></td>
    <td width="20%" align="right">เลขประจำตัวผู้เสียภาษี :&nbsp;</td>
    <td width="28%"><input type="text" name="tax_id_no"
                           class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="10" onblur="checkIDCard(this,10);">
        <img src="images/btn_browse.png" id="search_from_tax_id_no"
             width="18" height="19" border="0" alt="" style="cursor: hand" onclick="searchSuspectByTaxID()">
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ชื่อ :&nbsp;</td>
    <td><select name="title_code">
        <option></option>
        <c:forEach var="title" items="${titles}" varStatus="i">
            <option value="${title.title_code}" >${title.short_title}</option>
        </c:forEach>
    </select>&nbsp; <input type="text" name="first_name" class="textbox"
                           size="13" /></td>
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
    <td><input type="text" name="email" class="textbox" size="30"></br>
    	Ex. <i>example@example.com</i>
    </td>
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
        <select name="race_id" class="select" id="race_id" >
            <option value="">เลือก</option>
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
            <option value="">เลือก</option>
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
        <option value="">เลือก</option>
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