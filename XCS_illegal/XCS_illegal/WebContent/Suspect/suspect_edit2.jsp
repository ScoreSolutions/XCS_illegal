<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type="text/javascript">
    function validateSuspectByPassport(expect_id) {
        var passport = jQuery("[name=tax_id_no]").val();
        var ret = false;
        jQuery.ajax({
            url:'process?action=Ajax&cmd=searchSuspectByPassport&passport=' + passport,
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
        //var suspect_passport = frm.suspect_passport.value;
        //for (i = 0; i < suspect_passport.length; i++) {
        //    var ch = suspect_passport.charCodeAt(i);
        //    if (ch < 48 || ch > 57) {
        //        sfm_show_error_msg('Invalid Passport.', frm.suspect_id_card);
        //        return false;
        //    }
        //}
        var expect_id = ${(suspect==null)?-1:(suspect.id)};
        if(validateSuspectByPassport(expect_id)){

        }else{
            sfm_show_error_msg('เลขที่หนังสือเดินทางซ้ำ', frm.suspect_passport);
            return false;
        }
        return true;
    }
    function initValue(flag) {
        if(flag){
            writeTranLog("ยกเลิกการแก้ไขข้อมูลผู้ต้องสงสัยชาวต่างชาติ");
        }
    <c:if test="${suspect != null}">
        // add hidden if appear
        jQuery("[name=suspect_passport]").val('${suspect.suspect_passport}');
        jQuery("[name=passport_country] > option[value^=${suspect.passport_country}]").attr("selected","selected");
        jQuery("select[name=title_code] option[value=${suspect.title_code}]").attr("selected", "selected");
        jQuery("input[name=first_name]").first().val('${suspect.first_name}');
        jQuery("[name=middle_name]").val('${suspect.middle_name}');
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
        jQuery("[name=post_code]").val('${suspect.post_code}');
        jQuery("input[name=tel]").first().val('${suspect.tel}');
        getProvince('sProvince', 'sDistrict', 'sSubDistrict', '${suspect.province_code}', '${suspect.district_code}', '${suspect.subdistrict_code}');
        jQuery("[name=visa_type] > option[value=${suspect.visa_type}]").attr("selected","selected");
        jQuery("[name=date_in]").val('<fmt:formatDate value="${suspect.date_in}" pattern="dd/MM/yyyy"/>');
        jQuery("[name=date_out]").val('<fmt:formatDate value="${suspect.date_out}" pattern="dd/MM/yyyy"/>');
        jQuery("[name=continent] > option[value=${suspect.continent}]").attr("selected","selected");
        jQuery("[name=continent]").trigger("change");
        jQuery("[name=country_code] > option[value^=${suspect.country_code}]").attr("selected","selected");
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
    <td width="20%" align="right">เลขที่หนังสือเดินทาง :&nbsp;</td>
    <td width="30%">
    	<input type="text" name="suspect_passport" class="textbox"  >
    </td>
    <td width="20%" align="right">ออกโดยประเทศ :&nbsp;</td>
    <td width="28%"><select name="passport_country">
        <option></option>
        <c:forEach items="${ccs}" var="cc" varStatus="i">
            <option value="${cc.country_code}">${cc.country_name}</option>
        </c:forEach>
    </select>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ชื่อ :&nbsp;</td>
    <td colspan="3"><select name="title_code">
        <option></option>
        <c:forEach items="${titles}" var="title" varStatus="i">
            <option value="${title.title_code}">${title.short_title}</option>
        </c:forEach>
    </select>&nbsp; <input type="text" name="first_name" class="textbox"
                           size="13">
        ชื่อกลาง :&nbsp;
        <input type="text" name="middle_name" class="textbox" size="13">
        นามสกุล :&nbsp;
        <input type="text" name="last_name" class="textbox" size="15"></td>
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
