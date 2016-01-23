<%@page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp" %>
<%@include file="/Templates/meta.jsp" %>


<html xmlns="http://www.w3.org/1999/xhtml">


<HEAD>
    <base target="_self"/>
    <title>ยานพาหนะที่เกี่ยวข้อง</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" language="JavaScript" src="js/rollimage.js"></script>
    <script type="text/javascript" language="JavaScript" src="js/menu.js"></script>
    <script type="text/javascript" language="JavaScript" src="script/jquery.js"></script>
    <script type="text/javascript" language="JavaScript" src="script/effect.js"></script>
    <script type="text/javascript" language="JavaScript" src="script/service.js"></script>
    <script type="text/javascript" language="JavaScript" src="js/JScript.js"></script>

    <script type="text/javascript">
        var opener = window.dialogArguments;
        var row = '${row}';
        var maxRow = '${maxRow}';
        function resetval() {
            if (row != '') {
                if (maxRow != '' && maxRow > 1) {
                    row = row - 1;
                    document.carform.car_cate.value = opener.document.dataform.car_cate[row].value;
                    document.carform.car_no.value = opener.document.dataform.car_no[row].value;
                    document.carform.car_model.value = opener.document.dataform.car_model[row].value;
                    document.carform.car_color.value = opener.document.dataform.car_color[row].value;
                    document.carform.car_description.value = opener.document.dataform.car_description[row].value;
                    document.carform.car_id.value = opener.document.dataform.car_id[row].value; 
                    jQuery("[name=province_code] option[value="+opener.document.dataform.car_province_code[row].value+"]").attr("selected","selected");
                    jQuery("[name=duty_code] option[value="+opener.document.dataform.car_duty_code[row].value+"]").attr("selected","selected");
                    jQuery("[name=brand_brand_duty_code] option[value="+opener.document.dataform.car_brand_brand_duty_code[row].value+"]").attr("selected","selected");
                } else {
                    document.carform.car_cate.value = opener.document.dataform.car_cate.value;
                    document.carform.car_no.value = opener.document.dataform.car_no.value;
                    document.carform.car_model.value = opener.document.dataform.car_model.value;
                    document.carform.car_color.value = opener.document.dataform.car_color.value;
                    document.carform.car_description.value = opener.document.dataform.car_description.value;
                    document.carform.car_id.value = opener.document.dataform.car_id.value;
                    jQuery("[name=province_code] option[value="+opener.document.dataform.car_province_code.value+"]").attr("selected","selected");
                    jQuery("[name=duty_code] option[value="+opener.document.dataform.car_duty_code.value+"]").attr("selected","selected");
                    jQuery("[name=brand_brand_duty_code] option[value="+opener.document.dataform.car_brand_brand_duty_code.value+"]").attr("selected","selected");
                }
            } else {
                document.carform.car_cate.value = "";
                document.carform.car_no.value = "";
                document.carform.car_model.value = "";
                document.carform.car_color.value = "";
                document.carform.car_description.value = "";
            }
        }
        function saveto() {
            var data = new Array();

            data["car_province_code"] = jQuery("[name=province_code] option:selected").val();
            data["car_province_text"] = jQuery("[name=province_code] option:selected").text();
            data["duty_code"] = jQuery("[name=duty_code] option:selected").val();
            data["duty_name"] = jQuery("[name=duty_code] option:selected").text();
            data["car_cate"] = jQuery("[name=car_cate]").val();
            data["car_no"] = jQuery("[name=car_no]").val();
            data["car_brand_brand_duty_code"] = jQuery("[name=brand_brand_duty_code] option:selected").val();
            data["car_brand_text"] = jQuery("[name=brand_brand_duty_code] option:selected").text();
            data["car_model"] = jQuery("[name=car_model]").val();
            data["car_color"] = jQuery("[name=car_color]").val();
            data["car_description"] = jQuery("[name=car_description]").val();
            data["car_id"] = jQuery("[name=car_id]").val();
            //alert (dcount);
            //alert (data.length);
            window.returnValue = data;
            window.close();

        }
        $(document).ready(function(){
            resetval();
        });
    </script>
</HEAD>

<BODY>
<form id="carform" name="carform">
    <table border="0" cellpadding="0" cellspacing="0" width="95%">
        <input type="hidden" name="car_id" value=""/>
        <tr>
            <td colspan="2"><span class="websitename" id="varPopupName">ยานพาหนะที่เกี่ยวข้อง</span></td>
        </tr>
        <tr>
            <td colspan="2">
                <hr/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input name="btnSave" onclick="saveto()" type="button" class="barbutton" value="บันทึก">
                <input name="btnSave" onclick="resetval()" type="button" class="barbutton" value="ยกเลิกการแก้ไข">
                <input name="btnBack" onclick="self.close()" type="button" class="barbutton" value="กลับ">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <hr/>
            </td>
        </tr>
        <tr>
            <td width="30%" align="right">
                จังหวัด :&nbsp;
            </td>
            <td>
                <select name="province_code">
                	<option value="" selected >เลือก</option>
                    <c:forEach var="province" items="${provinces}" varStatus="i">
                        <option value="${province.province_code}">${province.province_name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td align="right">
                ประเภทรถ :&nbsp;
            </td>
            <td>
                <select name="duty_code" id="duty_code" style="width:400px">
                	<option value="" selected >เลือก</option>
                    <c:forEach var="producttype" items="${producttypes}" varStatus="i">
                        <option value="${producttype.duty_code}">${producttype.duty_code} - ${producttype.duty_name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td align="right">
                หมวดอักษร :&nbsp;
            </td>
            <td>
                <input type="text" name="car_cate" class="textbox" maxlength="3">
                เลขทะเบียน&nbsp;:&nbsp;
                <input type="text" name="car_no" class="textbox" maxlength="4">
            </td>
        </tr>
        <tr>
            <td align="right">
                ยี่ห้อ :&nbsp;
            </td>
            <td>
                <select name="brand_brand_duty_code">
                	<option value="" selected >เลือก</option>
                    <c:forEach var="bm" items="${brandmains}" varStatus="i">
                        <option value="${bm.brand_main_code},${bm.group_id}">${(bm.brand_main_eng==null)?(bm.brand_main_thai):(bm.brand_main_eng)}</option>
                    </c:forEach>
                </select>
                รุ่น&nbsp;:&nbsp;<input type="text" class="textbox" name="car_model"/>
            </td>
        </tr>
        <tr>
            <td align="right">
                สี :&nbsp;
            </td>
            <td>
                <input type="text" class="textbox" name="car_color"/>
            </td>
        </tr>
        <tr>
            <td align="right" valign="top">
                รายละเอียด :&nbsp;
            </td>
            <td>
                <textarea name="car_description" cols="35" rows="3" class="textareabig2"></textarea>
            </td>
        </tr>
    </table>
</form>
</BODY>
</HTML>
