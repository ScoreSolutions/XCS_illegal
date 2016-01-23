<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type="text/javascript">
    function searchSuspectByID(name,column,alert_text) {
        var key = jQuery("[name="+name+"]").val();
        jQuery.ajax({
            url:'process?action=Ajax&cmd=searchSuspectByKey&id=' + key +"&column="+column,
            async:false,
            success: function(data) {
                if (data > 0) {
                    location.href = '<c:url value="process?action=Suspect&cmd=edit&id="/>' + data;
                } else {
                    alert(alert_text);
                }
            }
        });
    }
    function validateSuspectByID(expect_id,name,column) {
        var val = jQuery("[name="+name+"]").val();
        var ret = false;
        jQuery.ajax({
            url:'process?action=Ajax&cmd=searchSuspectByKey&ido=' + val +"&column="+column,
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
        if(frm.company_name.value == ''){
            sfm_show_error_msg('กรุณาระบุชื่อผู้ประกอบการ', frm.company_name);
        }
        var expect_id = ${(suspect==null)?-1:(suspect.id)};
        if(validateSuspectByID(expect_id,'corporation_code','corporation_code')){

        }else{
            sfm_show_error_msg('เลขทะเบียนนิติบุคคลซ้ำ', frm.corporation_code);
            return false;
        }
        if(validateSuspectByID(expect_id,'excise_reg_no','excise_reg_no')){

        }else{
            sfm_show_error_msg('เลขทะเบียนสรรพสามิตซำ้', frm.excise_reg_no);
            return false;
        }
        return true;
    }
    function initValue(flag) {
        if (flag) {
            writeTranLog("ยกเลิกการแก้ไขข้อมูลผู้ประกอบการ");
        }
    <c:if test="${suspect != null}">
        // add hidden if appear
        jQuery("[name=title_code_company] > option[value=${suspect.title_code_company}]").attr("selected","selected");
        jQuery("[name=company_name]").val('${suspect.company_name}');
        jQuery("[name=title_code] option[value=${suspect.title_code}]").attr("selected", "selected");
        jQuery("[name=first_name]").first().val('${suspect.first_name}');
        jQuery("[name=last_name]").first().val('${suspect.last_name}');
        jQuery("[name=corporation_code]").first().val('${suspect.corporation_code}');
        jQuery("[name=excise_reg_no]").val('${suspect.excise_reg_no}');
        jQuery("[name=license_no]").val('${suspect.excise_reg_no}');
        jQuery("[name=license_date_from]").val('<fmt:formatDate value="${suspect.license_date_from}" pattern="dd/MM/yyyy"/>');
        jQuery("[name=license_date_to]").val('<fmt:formatDate value="${suspect.license_date_to}" pattern="dd/MM/yyyy"/>');
        jQuery("#photo_img").first().attr("src", "<c:url value='/process?action=GetImage'/>&table=SUSPECT&id=${suspect.id}");
        jQuery("[name=description]").first().val('${suspect.description}');
        jQuery("[name=photo_desc]").first().val('${suspect.photo_desc}');
        jQuery("[name=coordinate_x]").first().val('${suspect.coordinate_x}');
        jQuery("[name=coordinate_y]").first().val('${suspect.coordinate_y}');
        jQuery("[name=address_no]").first().val('${suspect.address_no}');
        jQuery("[name=moo]").first().val('${suspect.moo}');
        jQuery("[name=address_name]").first().val('${suspect.address_name}');
        jQuery("[name=soi]").first().val('${suspect.soi}');
        jQuery("[name=road]").first().val('${suspect.road}');
        jQuery("[name=post_code]").val('${suspect.post_code}');
        jQuery("[name=tel]").first().val('${suspect.tel}');
        getProvince('sProvince', 'sDistrict', 'sSubDistrict', '${suspect.province_code}', '${suspect.district_code}', '${suspect.subdistrict_code}');
    </c:if>
    <c:if test="${suspect==null}">
        jQuery("input[type=text]").val('');
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
    <td width="20%" align="right">คำนำหน้า :&nbsp;</td>
    <td colspan="3">
        <select name="title_code_company">
        	<option value=""></option>
            <c:forEach items="${comptitles}" var="title">
                <option value="${title.title_code}">${title.short_title}</option>
            </c:forEach>
        </select>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ชื่อผู้ประกอบการ :&nbsp;</td>
    <td colspan="3"><input type="text" name="company_name" class="textbox" style="width:90%"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ชื่อผู้แทน :&nbsp;</td>
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
    <td width="2%">&nbsp;</td>
    <td width="20%" align="right">เลขทะเบียนนิติบุคคล :&nbsp;</td>
    <td width="30%"><input type="text" name="corporation_code"
                           class="textNum" OnKeyPress="ChkMinusInt(this);">
        <img src="images/btn_browse.png" onclick="searchSuspectByID('corporation_code','corporation_code','ไม่พบเลขทะเบียนนิติบุคคล')"
             width="18" height="19" border="0" alt="ค้นหาจากเลขนิติบุคคล"
             style="cursor: hand" name="search_from_corporation_code" id="search_from_corporation_code"></td>
    <td width="20%" align="right">เลขทะเบียนสรรพสามิต :&nbsp;</td>
    <td width="28%"><input type="text" name="excise_reg_no"
                           class="textNum" OnKeyPress="ChkMinusInt(this);">
        <img src="images/btn_browse.png" id="search_from_excise_reg_no" onclick="searchSuspectByID('excise_reg_no','excise_reg_no','ไม่พบเลขทะเบียนสรรพสามิต')"
             width="18" height="19" border="0" alt="" style="cursor: hand">
    </td>
</tr>

<tr>
    <td width="2%">&nbsp;</td>
    <td width="20%" align="right">เลขที่ใบอนุญาต:&nbsp;</td>
    <td width="30%"><input type="text" name="license_no"
                           class="textNum" OnKeyPress="ChkMinusInt(this);">
        <img src="images/btn_browse.png" onclick="searchSuspectByID('license_no','license_no','ไม่พบเลขที่ใบอนุญาต')"
             width="18" height="19" border="0" alt="ค้นหาจากทะเบียนราษฎร์"
             style="cursor: hand" name="search_from_id_card" id="search_from_id_card"></td>
</tr>


<tr>
    <td>&nbsp;</td>
    <td align="right">วันที่ออกใบอนุญาต :&nbsp;</td>
    <td>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td><input name="license_date_from" type="text"
                           id="license_date_from" class="textreadonly" readonly>
                    <a href="javascript:NewCssCal('license_date_from','ddMMyyyy')"><img src="images/btn_calendar.png"
                                                                                        alt="" width="19"
                                                                                        height="19" align="middle"
                                                                                        style="border-style: none"
                                                                                        id="license_date_from_img"
                                                                                        width="19"
                                                                                        height="19"/></a>
                </td>
            </tr>
        </table>
    </td>
    <td align="right">วันที่หมดอายุ :&nbsp;</td>
    <td>
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td><input name="license_date_to" type="text"
                           id="license_date_to" class="textreadonly" readonly>
                    <a href="javascript:NewCssCal('license_date_to','ddMMyyyy')"><img src="images/btn_calendar.png"
                                                                                      alt="" width="19"
                                                                                      height="19" align="middle"
                                                                                      style="border-style: none"
                                                                                      id="license_date_to_img"
                                                                                      width="19"
                                                                                      height="19"/></a>
                </td>
            </tr>
        </table>
    </td>
</tr>