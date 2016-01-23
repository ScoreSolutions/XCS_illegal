<%@ page import="com.ko.webapp.util.RequestUtil" %>
<%@page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp" %>
<%@include file="/Templates/meta.jsp" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
    <base target="_self"/>
    <title>ที่อยู่ผู้กระทำผิด : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
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


    <script language="javascript">
        var opener = window.dialogArguments;
        var row = ${row} -1;
        var maxRow = 0;
        <c:if test="${maxRow != null}">
            maxRow = ${maxRow};
        </c:if>
        function writeTranLog(tran_desc) {
            var browser = "<%=RequestUtil.getBrowser(request)%>";
            var ip_address = "<%=RequestUtil.getIpAddress(request)%>";
            var user_id = "<%=RequestUtil.getUserSession(request).getUserId()%>";
            var session_id = "<%=request.getSession().getId()%>";
            Tranlog.writeTranLog(user_id, ip_address, tran_desc, browser, session_id);
        }
        function initValue(flag) {
            if (flag) {
                writeTranLog('ยกเลิกการแก้ไขที่อยู่ผู้ต้องสงสัย');
            }
        <c:if test="${sa != null}">
        <%--jQuery("[name=tel_no]").val('${sa.tel_no}');--%>
        <%--jQuery("[name=fax_no]").val('${sa.fax_no}');--%>
        <%--jQuery("[name=address_name]").val('${sa.address_name}');--%>
        <%--jQuery("[name=moo]").val('${sa.moo}');--%>
        <%--jQuery("[name=road]").val('${sa.road}');--%>
        <%--jQuery("[name=soi]").val('${sa.soi}');--%>
        <%--jQuery("[name=zipcode]").val('${sa.zipcode}');--%>
        <%--getProvince('sProvince', 'sDistrict', 'sSubDistrict', '${sa.province_code}', '${sa.district_code}', '${sa.subdistrict_code}');--%>
        <%--jQuery("[name=coordinate_x]").val('${sa.coordinate_x}');--%>
        <%--jQuery("[name=coordinate_y]").val('${sa.coordinate_y}');--%>
        <%--jQuery("[name=description]").val('${sa.description}');--%>
        <%--jQuery("[name=address]").val('${sa.address}');--%>
            if (row >= 0) {
                if(maxRow > 1){
                jQuery("[name=tel_no]").val(opener.document.dataform.suspect_address_tel_no[row].value);
                jQuery("[name=fax_no]").val(opener.document.dataform.suspect_address_fax_no[row].value);
                jQuery("[name=address_name]").val(opener.document.dataform.suspect_address_address_name[row].value);
                jQuery("[name=moo]").val(opener.document.dataform.suspect_address_moo[row].value);
                jQuery("[name=road]").val(opener.document.dataform.suspect_address_road[row].value);
                jQuery("[name=soi]").val(opener.document.dataform.suspect_address_soi[row].value);
                jQuery("[name=zipcode]").val(opener.document.dataform.suspect_address_zipcode[row].value);
                getProvince('sProvince', 'sDistrict', 'sSubDistrict',opener.document.dataform.suspect_address_province_code[row].value
                        ,opener.document.dataform.suspect_address_district_code[row].value,opener.document.dataform.suspect_address_subdistrict_code[row].value);
                jQuery("[name=coordinate_x]").val(opener.document.dataform.suspect_address_coordinate_x[row].value);
                jQuery("[name=coordinate_y]").val(opener.document.dataform.suspect_address_coordinate_y[row].value);
                jQuery("[name=description]").val(opener.document.dataform.suspect_address_description[row].value);
                jQuery("[name=address]").val(opener.document.dataform.suspect_address_address[row].value);
                }else{
                    jQuery("[name=tel_no]").val(opener.document.dataform.suspect_address_tel_no.value);
                    jQuery("[name=fax_no]").val(opener.document.dataform.suspect_address_fax_no.value);
                    jQuery("[name=address_name]").val(opener.document.dataform.suspect_address_address_name.value);
                    jQuery("[name=moo]").val(opener.document.dataform.suspect_address_moo.value);
                    jQuery("[name=road]").val(opener.document.dataform.suspect_address_road.value);
                    jQuery("[name=soi]").val(opener.document.dataform.suspect_address_soi.value);
                    jQuery("[name=zipcode]").val(opener.document.dataform.suspect_address_zipcode.value);
                    getProvince('sProvince', 'sDistrict', 'sSubDistrict',opener.document.dataform.suspect_address_province_code.value
                            ,opener.document.dataform.suspect_address_district_code.value,opener.document.dataform.suspect_address_subdistrict_code.value);
                    jQuery("[name=coordinate_x]").val(opener.document.dataform.suspect_address_coordinate_x.value);
                    jQuery("[name=coordinate_y]").val(opener.document.dataform.suspect_address_coordinate_y.value);
                    jQuery("[name=description]").val(opener.document.dataform.suspect_address_description.value);
                    jQuery("[name=address]").val(opener.document.dataform.suspect_address_address.value);
                }
            } else {
                jQuery("[name=tel_no]").val('${sa.tel_no}');
                jQuery("[name=fax_no]").val('${sa.fax_no}');
                jQuery("[name=address_name]").val('${sa.address_name}');
                jQuery("[name=moo]").val('${sa.moo}');
                jQuery("[name=road]").val('${sa.road}');
                jQuery("[name=soi]").val('${sa.soi}');
                jQuery("[name=zipcode]").val('${sa.zipcode}');
                getProvince('sProvince', 'sDistrict', 'sSubDistrict', '${sa.province_code}', '${sa.district_code}', '${sa.subdistrict_code}');
                jQuery("[name=coordinate_x]").val('${sa.coordinate_x}');
                jQuery("[name=coordinate_y]").val('${sa.coordinate_y}');
                jQuery("[name=description]").val('${sa.description}');
                jQuery("[name=address]").val('${sa.address}');
            }
        </c:if>
        <c:if test="${sa==null}">
            jQuery("input[type=text]").val('');
            getProvince('sProvince', 'sDistrict', 'sSubDistrict', '', '', '');
        </c:if>
        }
        function appendRow() {
            if (checkValidate()) {
                var data = [];
                //data["index"] = 1;
                data["tel_no"] = jQuery("[name=tel_no]").val();
                data["fax_no"] = jQuery("[name=fax_no]").val();
                data["address_name"] = jQuery("[name=address_name]").val();
                data["moo"] = jQuery("[name=moo]").val();
                data["road"] = jQuery("[name=road]").val();
            <c:if test="${sa != null}">
                data["id"] = '${sa.id}';
            </c:if>
            <c:if test="${sa == null}">
                data["id"] = '';
            </c:if>
                data["soi"] = jQuery("[name=soi]").val();
                data["zipcode"] = jQuery("[name=zipcode]").val();

                data["province_code"] = jQuery("[name=province_code] option:selected").val();
                data["province_text"] = jQuery("[name=province_code] option:selected").text();

                data["district_code"] = jQuery("[name=district_code] option:selected").val();
                data["district_text"] = jQuery("[name=district_code] option:selected").text();

                data["subdistrict_code"] = jQuery("[name=subdistrict_code] option:selected").val();
                data["subdistrict_text"] = jQuery("[name=subdistrict_code] option:selected").text();

                data["coordinate_x"] = jQuery("[name=coordinate_x]").val();
                data["coordinate_y"] = jQuery("[name=coordinate_y]").val();
                data["description"] = jQuery("[name=description]").val();
                data["address"] = jQuery("[name=address]").val();
            <c:if test="${rowId!=null}">
                data["rowId"] = '${rowId}';
            </c:if>
                data["full_address"] = q(data["address_name"], "") +
                        " เลขที่" + q(data["address"], "-") +
                        " หมู่" + q(data["moo"], "-") +
                        " ตำบล" + q(data["subdistrict_text"], "-") +
                        " อำเภอ" + q(data["district_text"], "-") +
                        " จังหวัด" + q(data["province_text"], "-");

                //window.opener.appendAddressRow(data);

                //data["serialize"] = jQuery("form#address_form").serialize();
                //alert(data["serialize"]);
                writeTranLog('บันทึกที่อยู่ผู้ต้องสงสัย');
                window.returnValue = data;
                window.close();
            }
        }

        //	jQuery(document).ready(function() {
        //
        //	});

        function checkValidate() {
            var description = jQuery("[name=description]").val();
            if (description == '') {
                alert('กรุณากรอกรายละเอียด');
                return false;
            }
            var province_code = jQuery("[name=province_code] > option:selected").val();
            if (province_code == '' || province_code <= 0) {
                alert('กรุณาเลือกจังหวัด');
                return false;
            }
            var district_code = jQuery("[name=district_code] > option:selected").val();
            if (district_code == '' || district_code <= 0) {
                alert('กรุณาเลือกอำเภอ');
                return false;
            }
            var sub_district_code = jQuery("[name=subdistrict_code] > option:selected").val();
            if (sub_district_code == '' || sub_district_code <= 0) {
                alert('กรุณาเลือกอำเภอ');
                return false;
            }
            return true;
        }
        function close_form() {
            writeTranLog('ปิดหน้าจอเพิ่มที่อยู่ผู้ต้องสงสัย');
            window.close();
        }
    </script>

</HEAD>

<BODY>

<form id="address_form">
    <input type="hidden" name="rowId"/>
    <table border="0" cellpadding="0" cellspacing="0" width="95%">
        <tr>
            <td colspan="5"><span class="websitename">ที่อยู่ผู้ต้องสงสัย</span></td>
        </tr>
        <tr>
            <td colspan="5">
                <hr/>
            </td>
        </tr>
        <tr>
            <td colspan="5">
                <input name="btnSave" type="button" class="barbutton" value="บันทึก" onClick='appendRow();'>
                <input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข"
                       onclick="initValue(true);">
                <input name="btnBack" type="button" class="barbutton" value="กลับ" onclick="close_form();">
            </td>
        </tr>
        <tr>
            <td colspan="5">
                <hr/>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">รายละเอียด&nbsp;:&nbsp;</td>
            <td colspan="3">
                <input name="description" type="text" class="textbox" size="35">
                <font style="color:red">*</font>
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">เลขที่ :&nbsp; </td>
            <td colspan="3"><input name="address" type="text" class="textbox" size="4">
                &nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
                <input name="moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
                &nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp;
                <input name="address_name" type="text" class="textbox" size="25"></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
            <td colspan="3"><input name="soi" type="text" class="textbox">
                &nbsp;&nbsp;ถนน&nbsp;:&nbsp;
                <input name="road" type="text" class="textbox" size="25"></td>
        </tr>


        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">จังหวัด :&nbsp;</td>
            <td><select name="province_code" id="sProvince"
                        style="width: 180px;" onchange="getDistrict('sDistrict','sSubDistrict',this.value,'','')">
            </select>
                <font style="color:red">*</font>
            </td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">อำเภอ :&nbsp;</td>
            <td><select name="district_code" id="sDistrict"
                        style="width: 180px;" onchange="getTambol('sSubDistrict',this.value,'')">
            </select><font style="color:red">*</font></td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">ตำบล :&nbsp;</td>
            <td><select name="subdistrict_code" id="sSubDistrict"
                        style="width: 180px;">
            </select><font style="color:red">*</font></td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>

        <tr>
            <td>&nbsp;</td>
            <td height="30" align="right">รหัสไปรษณีย์&nbsp;:&nbsp;</td>
            <td><input name="zipcode" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" size="10"
                       maxlength="5"></td>
            <td align="right">&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="30" align="right">โทรศัพท์&nbsp;:&nbsp;</td>
            <td colspan="3">
                <input name="tel_no" type="text" class="textbox" size="10">
                โทรสาร :&nbsp;<input name="fax_no" type="text" class="textbox" size="10">
            </td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td height="25" align="right">ละติจูด&nbsp;:&nbsp;</td>
            <td colspan="3"><input name="coordinate_x" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);"
                                   maxlength="5" size="7">
                &nbsp;&nbsp;ลองจิจูด&nbsp;:&nbsp;
                <input name="coordinate_y" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5"
                       size="7"></td>
        </tr>
    </table>
</form>
</BODY>
</HTML>

<script type="text/javascript">
    initValue(false);
</script>
