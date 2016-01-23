<%@ page import="com.ko.webapp.util.RequestUtil" %>
<%@page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp" %>
<%@include file="/Templates/meta.jsp" %>


<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
    <base target="_self"/>
    <title>ผู้เกี่ยวข้องกับผู้กระทำผิด : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script type='text/javascript' src='dwr/interface/Tranlog.js'></script>
    <script type='text/javascript' src="dwr/interface/SelectRegion.js"></script>
    <script type='text/javascript' src='dwr/util.js'></script>
    <script type="text/javascript" src="js/gen_validatorv31.js"></script>
    <script type='text/javascript' src='dwr/engine.js'></script>
    <script type="text/javascript" language="JavaScript" src="js/rollimage.js"></script>
    <script type="text/javascript" language="JavaScript" src="js/menu.js"></script>
    <script type="text/javascript" language="JavaScript" src="script/jquery.js"></script>
    <script type="text/javascript" language="JavaScript" src="script/effect.js"></script>
    <script type="text/javascript" language="JavaScript" src="script/service.js"></script>
    <script type="text/javascript" language="JavaScript" src="js/JScript.js"></script>


    <script>
        var opener = window.dialogArguments;
        var row = ${rowId} -1;
        var maxRow = 0;
        <c:if test="${maxRow != null}">
            maxRow = ${maxRow};
        </c:if>
        function initValue(flag) {
            if(flag){
                writeTranLog('ยกเลิกการแก้ไขรายชื่อผู้เกี่ยวข้องกับผู้ต้องสงสัย');
            }
        <c:if test="${sr!=null}">
//            jQuery("[name=tel_no]").val(opener.document.dataform.suspect_address_tel_no[row].value);
//        'suspect_relative_relation':data["relation"],
//        'suspect_relative_idcardno':data["idcardno"],
//        'suspect_relative_relation_text':data["relation_text"],
//        'suspect_relative_title_code':data["title_code"],
//        'suspect_relative_title_text':data["title_text"],
//        'suspect_relative_first_name':data["first_name"],
//        'suspect_relative_last_name':data["last_name"],
//        'suspect_relative_tel_no':data["tel_no"],
//        'suspect_relative_email':data["email"],
//        'suspect_relative_current_address_no':data["current_address_no"],
//        'suspect_relative_current_moo':data["current_moo"],
//        'suspect_relative_current_soi':data["current_soi"],
//        'suspect_relative_current_road':data["current_road"],
//        'suspect_relative_current_address_name':data["current_address_name"],
//        'suspect_relative_current_province_code':data["current_province_code"],
//        'suspect_relative_current_district_code':data["current_district_code"],
//        'suspect_relative_current_subdistrict_code':data["current_subdistrict_code"],
//        'suspect_relative_current_province_text':data["current_province_text"],
//        'suspect_relative_current_district_text':data["current_district_text"],
//        'suspect_relative_current_subdistrict_text':data["current_subdistrict_text"],
//        'suspect_relative_hometown_address_no':data["hometown_address_no"],
//        'suspect_relative_hometown_moo':data["hometown_moo"],
//        'suspect_relative_hometown_soi':data["hometown_soi"],
//        'suspect_relative_hometown_road':data["hometown_road"],
//        'suspect_relative_hometown_province_code':data["hometown_province_code"],
//        'suspect_relative_hometown_district_code':data["hometown_district_code"],
//        'suspect_relative_hometown_subdistrict_code':data["hometown_subdistrict_code"],
//        'suspect_relative_hometown_province_text':data["hometown_province_text"],
//        'suspect_relative_hometown_district_text':data["hometown_district_text"],
//        'suspect_relative_hometown_subdistrict_text':data["hometown_subdistrict_text"],
//        'suspect_relative_count':'1',
//        'suspect_relative_id':data["id"]
            if(maxRow > 1){
            jQuery("[name=relatioin] option[value="+opener.document.dataform.suspect_relative_relation[row].value+"]").attr("selected", "selected");
            jQuery("[name=idcardno]").val(opener.document.dataform.suspect_relative_idcardno[row].value);
            jQuery("[name=title_code] otpion[value="+opener.document.dataform.suspect_relative_title_code[row].value+"]").attr("selected", "selected");
            jQuery("[name=first_name]").val(opener.document.dataform.suspect_relative_first_name[row].value);
            jQuery("[name=last_name]").val(opener.document.dataform.suspect_relative_last_name[row].value);
            jQuery("[name=tel_no]").val(opener.document.dataform.suspect_relative_tel_no[row].value);
            jQuery("[name=email]").val(opener.document.dataform.suspect_relative_email[row].value);
            jQuery("[name=current_address_no]").val(opener.document.dataform.suspect_relative_current_address_no[row].value);
            jQuery("[name=current_moo]").val(opener.document.dataform.suspect_relative_current_moo[row].value);
            jQuery("[name=current_soi]").val(opener.document.dataform.suspect_relative_current_soi[row].value);
            jQuery("[name=current_road]").val(opener.document.dataform.suspect_relative_current_road[row].value);
            jQuery("[name=hometown_address_no]").val(opener.document.dataform.suspect_relative_hometown_address_no[row].value);
            jQuery("[name=hometown_moo]").val(opener.document.dataform.suspect_relative_hometown_moo[row].value);
            jQuery("[name=hometown_soi]").val(opener.document.dataform.suspect_relative_hometown_soi[row].value);
            jQuery("[name=hometown_road]").val(opener.document.dataform.suspect_relative_hometown_road[row].value);
            getProvince('sProvince', 'sDistrict', 'sSubDistrict',opener.document.dataform.suspect_relative_current_province_code[row].value, opener.document.dataform.suspect_relative_current_district_code[row].value,opener.document.dataform.suspect_relative_current_subdistrict_code[row].value);
            getProvince('hsProvince', 'hsDistrict', 'hsSubDistrict',opener.document.dataform.suspect_relative_hometown_province_code[row].value,opener.document.dataform.suspect_relative_hometown_district_code[row].value, opener.document.dataform.suspect_relative_hometown_subdistrict_code[row].value);
            jQuery("[name=id]").val(opener.document.dataform.suspect_relative_id[row].value);
            }else{
            jQuery("[name=relatioin] option[value="+opener.document.dataform.suspect_relative_relation.value+"]").attr("selected", "selected");
            jQuery("[name=idcardno]").val(opener.document.dataform.suspect_relative_idcardno.value);
            jQuery("[name=title_code] otpion[value="+opener.document.dataform.suspect_relative_title_code.value+"]").attr("selected", "selected");
            jQuery("[name=first_name]").val(opener.document.dataform.suspect_relative_first_name.value);
            jQuery("[name=last_name]").val(opener.document.dataform.suspect_relative_last_name.value);
            jQuery("[name=tel_no]").val(opener.document.dataform.suspect_relative_tel_no.value);
            jQuery("[name=email]").val(opener.document.dataform.suspect_relative_email.value);
            jQuery("[name=current_address_no]").val(opener.document.dataform.suspect_relative_current_address_no.value);
            jQuery("[name=current_moo]").val(opener.document.dataform.suspect_relative_current_moo.value);
            jQuery("[name=current_soi]").val(opener.document.dataform.suspect_relative_current_soi.value);
            jQuery("[name=current_road]").val(opener.document.dataform.suspect_relative_current_road.value);
            jQuery("[name=hometown_address_no]").val(opener.document.dataform.suspect_relative_hometown_address_no.value);
            jQuery("[name=hometown_moo]").val(opener.document.dataform.suspect_relative_hometown_moo.value);
            jQuery("[name=hometown_soi]").val(opener.document.dataform.suspect_relative_hometown_soi.value);
            jQuery("[name=hometown_road]").val(opener.document.dataform.suspect_relative_hometown_road.value);
            getProvince('sProvince', 'sDistrict', 'sSubDistrict',opener.document.dataform.suspect_relative_current_province_code.value, opener.document.dataform.suspect_relative_current_district_code.value,opener.document.dataform.suspect_relative_current_subdistrict_code.value);
            getProvince('hsProvince', 'hsDistrict', 'hsSubDistrict',opener.document.dataform.suspect_relative_hometown_province_code.value,opener.document.dataform.suspect_relative_hometown_district_code.value, opener.document.dataform.suspect_relative_hometown_subdistrict_code.value);
            jQuery("[name=id]").val(opener.document.dataform.suspect_relative_id.value);
            }
        </c:if>
        <c:if test="${sr == null}">
            jQuery("input[type=text]").val('');
            jQuery("select option").attr("selected", '');
            getProvince('sProvince', 'sDistrict', 'sSubDistrict', '', '', '');
            getProvince('hsProvince', 'hsDistrict', 'hsSubDistrict', '', '', '');
        </c:if>
        }
        function writeTranLog(tran_desc) {
            var browser = "<%=RequestUtil.getBrowser(request)%>";
            var ip_address = "<%=RequestUtil.getIpAddress(request)%>";
            var user_id = "<%=RequestUtil.getUserSession(request).getUserId()%>";
            var session_id = "<%=request.getSession().getId()%>";
            Tranlog.writeTranLog(user_id, ip_address, tran_desc, browser, session_id);
        }
        function appendRow() {
            if (checkValidate()) {
                writeTranLog('บันทึกผู้เกี่ยวข้องกับผู้ต้องสงสัย')
            var data = [];
            <c:if test="${sr != null}">
                data["id"] = '${sr.id}';
            </c:if>
            <c:if test="${sr == null}">
                data["id"]='';
            </c:if>
            <c:if test="${ajaxInsert != null}">
                jQuery.ajax({
                    url:'process?action=SuspectRelatif&cmd=ajaxInsert&',
                    data:jQuery("#relative_form").serialize(),
                    async:false,
                    success: function(id){
                         data["id"] = id;
                    }
                });
            </c:if>
            data["relation"] = jQuery("[name=relation] option:selected").val();
            data["relation_text"] = jQuery("[name=relation] option:selected").text();
            data["idcardno"] = jQuery("[name=idcardno]").val();
            data["title_code"] = jQuery("[name=title_code] option:selected").val();
            data["title_text"] = jQuery("[name=title_code] option:selected").text();
            data["first_name"] = jQuery("[name=first_name]").val();
            data["last_name"] = jQuery("[name=last_name]").val();
            data["tel_no"] = jQuery("[name=tel_no]").val();
            data["email"] = jQuery("[name=email]").val();
            data["current_address_no"] = jQuery("[name=current_address_no]").val();
            data["current_moo"] = jQuery("[name=current_moo]").val();
            data["current_soi"] = jQuery("[name=current_soi]").val();
            data["current_road"] = jQuery("[name=current_road]").val();
            data["current_address_name"] = jQuery("[name=current_address_name]").val();

            data["current_province_code"] = jQuery("[name=current_province_code] option:selected").val();
            data["current_district_code"] = jQuery("[name=current_district_code] option:selected").val();
            data["current_subdistrict_code"] = jQuery("[name=current_subdistrict_code] option:selected").val();
            data["current_province_text"] = jQuery("[name=current_province_code] option:selected").text();
            data["current_district_text"] = jQuery("[name=current_district_code] option:selected").text();
            data["current_subdistrict_text"] = jQuery("[name=current_subdistrict_code] option:selected").text();

            data["hometown_address_no"] = jQuery("[name=hometown_address_no]").val();
            data["hometown_moo"] = jQuery("[name=hometown_moo]").val();
            data["hometown_soi"] = jQuery("[name=hometown_soi]").val();
            data["hometown_road"] = jQuery("[name=hometown_road]").val();
            data["hometown_province_code"] = jQuery("[name=hometown_province_code] option:selected").val();
            data["hometown_district_code"] = jQuery("[name=hometown_district_code] option:selected").val();
            data["hometown_subdistrict_code"] = jQuery("[name=hometown_subdistrict_code] option:selected").val();
            data["hometown_province_text"] = jQuery("[name=hometown_province_code] option:selected").text();
            data["hometown_district_text"] = jQuery("[name=hometown_district_code] option:selected").text();
            data["hometown_subdistrict_text"] = jQuery("[name=hometown_subdistrict_code] option:selected").text();

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
            //data["serialize"] = jQuery("form#relative_form").serialize();
            //data["id"] = jQuery("input[name=id]").val();
            //*/

            window.returnValue = data;
            window.close();
            }
        }
        function checkValidate(){
            var description = jQuery("[name=first_name]").val();
            if (description == '') {
                alert('กรุณากรอก ชื่อ-สกุล ให้เรียบร้อย');
                return false;
            }
            var province_code = jQuery("[name=last_name]").val();
            if (province_code == '' || province_code <= 0) {
                alert('กรุณากรอก ชื่อ-สกุล ให้เรียบร้อย');
                return false;
            }
            return true;
        }
        function close_form(){
            writeTranLog('ปิดหน้าจอเพิ่มรายชื่อผู้เกี่ยวข้องกับผู้ต้องสงสัย')
            window.close();
        }
        jQuery(document).ready(function(){
           initValue();
        });
    </script>

</HEAD>

<BODY>
<form id="relative_form">

    <table border="0" cellpadding="0" cellspacing="0" width="95%">
        <c:if test="${sr != null}">
            <input type="hidden" name="id" value="${sr.id}" />
            <input type="hidden" name="suspect_no" value="${sr.suspect_no}" />
        </c:if>
        <c:if test="${sr == null}">
            <input type="hidden" name="suspect_no" value="${suspect_no}" />
        </c:if>
        <tr>
            <td colspan="5"><span class="websitename">รายชื่อผู้เกี่ยวข้อง</span></td>
        </tr>
        <tr>
            <td colspan="5">
                <hr/>
            </td>
        </tr>
        <tr>
            <td colspan="5">
                <input name="btnSave" type="button" class="barbutton" value="บันทึก" onClick='appendRow();'>
                <input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="initValue();">
                <input name="btnBack" type="button" class="barbutton" value="กลับ" onclick="close_form();">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                <hr/>
            </td>
        </tr>
        <tr>
            <td width="2%">&nbsp;</td>
            <td width="15%" height="25" align="right">ความสัมพันธ์&nbsp;:&nbsp;</td>
            <td width="83%">
                <select style="width:130px;" name="relation">
                    <c:forEach var="rel" items="${rels}" varStatus="i">
                        <option value="${rel.id}" ${(sr!=null)?((sr.relation==rel.id)?'selected':''):''}>${rel.relation_name}</option>
                    </c:forEach>
                </select>
                <font style="color:red">*</font>
                &nbsp;&nbsp;เลขที่บัตร ปชช&nbsp;:&nbsp;
                <input name="idcardno" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="13"
                       value="${(sr!=null)?(sr.idcardno):''}">
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">ชื่อ :&nbsp; </td>
            <td colspan="3">
                <select style="width:80px;" name="title_code">
                    <c:forEach var="title" items="${titles}" varStatus="i">
                        <option value="${title.title_code}" ${(sr!=null)?((sr.title_code==title.title_code)?'selected':''):''}>${title.title_name}</option>
                    </c:forEach>
                </select>
                <input name="first_name" type="text" class="textbox" size="20">
                <input name="last_name" type="text" class="textbox" size="20">
                <font style="color:red">*</font>

            </td>
        </tr>
        <tr bgcolor="#E9E9E9">
            <td>&nbsp;</td>
            <td colspan="5">ที่อยู่ปัจจุบัน</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="30" align="right">โทรศัพท์&nbsp;:&nbsp;</td>
            <td colspan="3">
                <input name="tel_no" type="text" class="textbox" size="10">&nbsp;&nbsp;&nbsp;
                E-Mail&nbsp;:&nbsp;<input name="email" type="text" class="textbox" size="35">
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">เลขที่ :&nbsp; </td>
            <td colspan="3">
                <input name="current_address_no" type="text" class="textbox" size="4">
                &nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
                <input name="current_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3"
                       size="3">
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
            <td colspan="3"><input name="current_soi" type="text" class="textbox">
                &nbsp;&nbsp;ถนน&nbsp;:&nbsp;
                <input name="current_road" type="text" class="textbox" size="25"></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">จังหวัด :&nbsp;</td>
            <td>
                <select name="current_province_code" id="sProvince" style="width:180px;"
                        onchange="getDistrict('sDistrict','sSubDistrict',this.value,'','')">
                </select>
            </td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">อำเภอ :&nbsp;</td>
            <td>
                <select name="current_district_code" id="sDistrict" style="width:180px;"
                        onchange="getTambol('sSubDistrict',this.value,'')">
                </select>
            </td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">ตำบล :&nbsp;</td>
            <td>
                <select name="current_subdistrict_code" id="sSubDistrict" style="width:180px;">
                </select>
            </td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td colspan="5">&nbsp;</td>
        </tr>
        <tr bgcolor="#E9E9E9">
            <td>&nbsp;</td>
            <td colspan="5">ที่อยู่ภูมิลำเนา</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">เลขที่ :&nbsp; </td>
            <td colspan="3">
                <input name="hometown_address_no" type="text" class="textbox" size="4">
                &nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
                <input name="hometown_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3"
                       size="3">
            </td>
        </tr>

        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
            <td colspan="3"><input name="hometown_soi" type="text" class="textbox">
                &nbsp;&nbsp;ถนน&nbsp;:&nbsp;
                <input name="hometown_road" type="text" class="textbox" size="25"></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">จังหวัด :&nbsp;</td>
            <td>
                <select name="hometown_province_code" id="hsProvince" style="width:180px;"
                        onchange="getDistrict('hsDistrict','hsSubDistrict',this.value,'','')">
                </select>
            </td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">อำเภอ :&nbsp;</td>
            <td>
                <select name="hometown_district_code" id="hsDistrict" style="width:180px;"
                        onchange="getTambol('hsSubDistrict',this.value,'')">
                </select>
            </td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">ตำบล :&nbsp;</td>
            <td>
                <select name="hometown_subdistrict_code" id="hsSubDistrict" style="width:180px;">
                    <option value="x" selected>แขวงมักกะสัน</option>
                    <option value="x">แขวงทุ่งสองห้อง</option>
                    <option value="x">แขวงบางกะปิ</option>
                    <option value="x">แขวง</option>
                </select>
            </td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
    </table>
</form>
</BODY>
</HTML>
