<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script>
    function suspectcaropen(tablename) {
        var data = window.showModalDialog('process?action=CarSuspect', self, 'dialogWidth=700px,Height=200px');
        var rowIndex = jQuery("tbody#" + tablename + " > tr").size();
        if (data) {
            var paramMap = {
                'car_province_code':data["car_province_code"],
                'car_product_duty_type_code':data["car_product_duty_type_code"],
                'car_cate':data["car_cate"],
                'car_no':data["car_no"],
                'car_brand_brand_duty_code':data["car_brand_brand_duty_code"],
                'car_model':data["car_model"],
                'car_color':data["car_color"],
                'car_description':data["car_description"]
            };
            var inputRow = "";
            jQuery.each(paramMap, function(key, value) {
                inputRow = inputRow + '<input type="hidden" name="' + key + '" value="' + value + '" />';
            });
            rowIndex = rowIndex + 1;
            var box = '<td class="TblRow AlignCenter"><input name="chk' + tablename + rowIndex + '" type="checkbox"/>' +
                    inputRow + '</td>';
            var index =  '<td class="TblRow AlignLeft">' + data["car_cate"]+" "+data["car_no"]+" "+data["car_province_text"] + '</td>';
            var type = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["car_product_type_text"] + '</td>';
            var name = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["car_brand_text"]+"/"+data["car_model"]+"/"+data["car_color"] + '</td>';
            var desc = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["car_description"] + '</td>';
            var row = box+index + type + name+desc;
            jQuery("#" + tablename).first().append("<tr id=\"" + tablename + rowIndex + "\">" + row + "</tr>");
        }
    }
    function indictmentPopOpen(tablename) {
        var data = window.showModalDialog('process?action=Indictment_pop', self, 'dialogWidth=700px,Height=400px');
        var rowIndex = jQuery("tbody#" + tablename + " > tr").size();
        if (data) {
            for (var i = 0; i < data.length; i++) {
                if (jQuery("input[name='indictment_indictment_id'][value='" + data[i][5] + "']").size() > 0) {
                    //alert("dupplicated offcode ");
                } else {
                    var paramMap = {
                        'indictment_case_law_id':data[i][1],
                        'indictment_law_id':data[i][2],
                        'indictment_guilt_base':data[i][3],
                        'indictment_exhibit_wild':data[i][4],
                        'indictment_indictment_id':data[i][5]
                    };
                    var inputRow = "";
                    jQuery.each(paramMap, function(key, value) {
                        inputRow = inputRow + '<input type="hidden" name="' + key + '" value="' + value + '" />';
                    });
                    rowIndex = rowIndex + 1;
                    var index = '<td class="TblRow AlignCenter">' + rowIndex + '</td>';
                    var box = '<td class="TblRow AlignCenter"><input name="chk' + tablename + rowIndex + '" type="checkbox"/>' +
                            inputRow + '</td>';
                    var name = '<td align="left" valign="top" class="TblRow AlignLeft">' + data[i]["3"] + '</td>';
                    var row = index + box + name;
                    jQuery("#" + tablename).first().append("<tr id=\"" + tablename + rowIndex + "\">" + row + "</tr>");
                }
            }
        } else {
        }
    }
    function aatopenmodal(myTable)
    {
        var data = window.showModalDialog('process?action=Divide_staff_poplist', self, 'dialogWidth=700px,Height=400px');
        var rowIndex = jQuery("tbody#" + myTable + " > tr").size();
        if (data) {
            for (var i = 0; i < data.length; i++) {
                if (jQuery("input[name='investigate_team_idcardno'][value='" + data[i][5] + "']").size() > 0) {
                    //alert("dupplicated offcode ");
                } else {
                    var paramMap = {
                        'investigate_team_idcardno':data[i][5],
                        'investigate_team_posname':data[i][3],
                        'investigate_team_poscode':data[i][6],
                        'investigate_team_offcode':data[i][7],
                        'investigate_team_offname':data[i][8],
                        'investigate_team_full_name':data[i][9]
                    };
                    var inputRow = "";
                    jQuery.each(paramMap, function(key, value) {
                        inputRow = inputRow + '<input type="hidden" name="' + key + '" value="' + value + '" />';
                    });
                    rowIndex = rowIndex + 1;
                    var index = '<td class="TblRow AlignCenter">' + rowIndex + '</td>';
                    var box = '<td class="TblRow AlignCenter"><input name="chk' + myTable + rowIndex + '" type="checkbox"/>' +
                            inputRow + '</td>';
                    var name = '<td align="left" valign="top" class="TblRow AlignLeft">' + data[i]["9"] + '</td>';
                    var pos = '<td align="left" valign="top" class="TblRow AlignCenter">' + data[i]["3"] + '</td>';
                    var row = index + box + name + pos;
                    //window.opener.jQuery("#"+tableName).last().append("<tr>"+ row +"</tr>");
                    jQuery("#" + myTable).first().append("<tr id=\"" + myTable + rowIndex + "\">" + row + "</tr>");
                }
            }
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
</script>
<script>
    function aatget_check_value(tableName)
    {
        jQuery("#" + tableName + " tr").has("td > input:checked").remove();
        // rerun index of row
        jQuery("#" + tableName + " tr").each(function(index) {
            jQuery(this).children().first().text(index + 1);
        });
    }
</script>

<form action="process?action=SuspectInvestigate&cmd=create" method="post" name="dataform" id="dataform" enctype="multipart/form-data">

<input type="hidden" name="suspect_no" id="suspect_no" value="${suspect.suspect_no}"/>
<input type="hidden" name="suspect_type" id="suspect_type" value="${suspect.suspect_type}"/>
<input type="hidden" name="suspect_investigate_id" id="suspect_investigate_id" value="${si.id}"/>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <td width="99%">
    	<span style="font-weight:bold;font-size:15px;color:#723373;">ข้อมูลดำเนินการสืบสวน</span>
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
    <td width="2%">&nbsp;</td>
    <td width="20%" align="right">เลขที่ทำงาน :&nbsp;</td>
    <td width="28%"><input type="text" name="track_no" readonly size="30" class="textreadonly" value="${si.track_no}"></td>
    <td width="22%" align="right">วันที่ :&nbsp;</td>
    <td width="28%"><input type="text" name="doc_date" class="textreadonly" value="${si.doc_date}">
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">เลขที่งานสืบสวน :&nbsp;</td>
    <td><input type="text" name="investigate_no" value="${si.investigate_no}" class="textbox" size="30"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ผู้สืบสวน :&nbsp;</td>
    <td><input type="text" name="staff_investigate_name" class="textreadonly" size="30" id="staff_investigate_name"
               style="float:left" value="${si.staff_investigate}">
        <input type="hidden" id="staff_investigate">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&formname=staff_investigate_name&id=staff_investigate' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
    </td>
    <td align="right">ผู้สั่งการให้สืบสวน&nbsp;:&nbsp;</td>
    <td>
        <input name="staff_command_name" type="text" class="textreadonly" size="30" id="staff_command_name"
               style="float:left" value="${si.staff_command}" />
        <input type="hidden" id="staff_command">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&formname=staff_command_name&id=staff_command' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ผู้สั่งให้บันทึก :&nbsp;</td>
    <td><input type="text" name="staff_order_save_name" class="textreadonly" size="30" id="staff_order_save_name"
               style="float:left" value="${si.staff_order_save}">
        <input type="hidden" id="staff_order_save">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&formname=staff_order_save_name&id=staff_order_save' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
    </td>
    <td align="right">ผู้ให้ข้อมูล&nbsp;:&nbsp;</td>
    <td>
        <input name="staff_info_name" type="text" class="textreadonly" size="30" id="staff_info_name"
               style="float:left" value="${si.staff_info}"/>
        <input type="hidden" id="staff_info">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&formname=staff_info_name&id=staff_info' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">เรียน :&nbsp;</td>
    <td><input type="text" name="staff_report_to_name" class="textreadonly" size="30" id="staff_report_to_name"
               style="float:left" value="${si.staff_report_to}">
        <input type="hidden" id="staff_report_to">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&formname=staff_report_to_name&id=staff_report_to' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');"/>
    </td>
    <td align="right">เบอร์โทรผู้ให้ข้อมูล&nbsp;:&nbsp;</td>
    <td>
        <input name="staff_info_mobile" type="text" class="textbox" size="30" id="staff_info_mobile" value="${si.staff_info_mobile}"/>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">ผู้ร่วมสืบสวน :&nbsp;</td>
    <td colspan="3">

        <table id="coinvestigateTab" style="width:95%" cellspacing="0">
            <thead>
            <tr style="text-align:center;background-color:#ffccff;">
                <th style="width:15%">ลำดับที่</th>
                <th style="width:5%"><input type="checkbox" id="chkcoinvestigateBody" name="chkcoinvestigateBody"
                                            onclick="chkUncheckAll('chkcoinvestigateBody');"/></th>
                <th style="width:40%">ชื่อ-สกุล</th>
                <th style="width:40%">ตำแหน่ง</th>
            </tr>
            </thead>
            <tbody id="coinvestigateBody">

            </tbody>
        </table>
        <table border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td>
                    <span class="spanLink" onClick="aatopenmodal('coinvestigateBody');"> เพิ่มใหม่</span> |
                    <span class="spanLink" onclick="aatget_check_value('coinvestigateBody')">ลบรายการที่เลือก</span>
                </td>
            </tr>
        </table>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
<tr>
    <td bgcolor="#F5F5F5">&nbsp;</td>
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ข้อมูลสืบสวน</strong></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">วันที่เริ่มทำการสืบสวน :&nbsp;</td>
    <td><input name="start_date" type="text" id="start_date_text" class="textreadonly" size="20" readonly onchange="">
        <a href="javascript:NewCssCal('start_date_text','ddMMyyyy','dropdown',true)"><img src="images/btn_calendar.png"
                                                                                          alt="" width="19" height="19"
                                                                                          align="middle"
                                                                                          style="border-style: none"
                                                                                          id="start_date_img" width="19"
                                                                                          height="19"/></a>
    </td>
    <td align="right">
        วันที่สิ้นสุดทำการสืบสวน :&nbsp;
    </td>
    <td><input name="end_date" type="text" id="end_date_text" class="textreadonly" size="20" readonly onchange="">
        <a href="javascript:NewCssCal('end_date_text','ddMMyyyy','dropdown',true)"><img src="images/btn_calendar.png"
                                                                                        alt="" width="19" height="19"
                                                                                        align="middle"
                                                                                        style="border-style: none"
                                                                                        id="end_date_img" width="19"
                                                                                        height="19"/></a>
    </td>
</tr>
<td>&nbsp;</td>
<td align="right">คดี พ.ร.บ. :&nbsp;</td>
<td>
<select name="legislation_id">
<c:forEach items="${legislations}" var="lg" varStatus="i">
    <option value="${lg.id}">${lg.legislation_name}</option>
</c:forEach>
</select>
</td>
<td align="right">ประเภทคดี :&nbsp;</td>
<td><select name="case_type">
    <option value="1">รายใหญ่</option>
    <option value="2">รายย่อย</option>
    <option value="3">รายเอเย่นต์</option>
</select>
</td>
</tr>

<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">สงสัยว่ากระทำผิดข้อกล่าวหา :&nbsp;</td>
    <td colspan="3">
        <table id="indictmentTab" style="width:95%" cellspacing="0">
            <thead>
            <tr style="text-align:center;background-color:#ffccff;">
                <th style="width:15%">ลำดับที่</th>
                <th style="width:5%"><input type="checkbox" id="chkindictmentBody" name="chkindictmentBody"
                                            onclick="chkUncheckAll('chkindictmentBody');"/></th>
                <th style="width:80%">ข้อกล่าวหา</th>
            </tr>
            </thead>
            <tbody id="indictmentBody">

            </tbody>
        </table>
        <table border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td>
                    <span class="spanLink" onClick="indictmentPopOpen('indictmentBody');"> เพิ่มใหม่</span> |
                    <span class="spanLink" onclick="aatget_check_value('indictmentBody')">ลบรายการที่เลือก</span>
                </td>
            </tr>
        </table>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">พฤติกรรมผู้ต้องสงสัย :&nbsp;</td>
    <td colspan="3">
        <textarea name="suspect_behavior" cols="35" rows="3" class="textareabig2"></textarea>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">หมายเหตุ(ข้อมูลอื่นๆ) :&nbsp;</td>
    <td colspan="3">
        <textarea name="remarks" cols="35" rows="3" class="textareabig2"></textarea>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right" valign="top">การดำเนินการสืบสวน ณ ปัจจุบัน :&nbsp;</td>
    <td colspan="3">
        <textarea name="investigate_present" cols="35" rows="3" class="textareabig2"></textarea>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
<tr>
    <td bgcolor="#F5F5F5">&nbsp;</td>
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ที่อยู่ปัจจุบันผู้ต้องสงสัย</strong></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ละติจูด&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="current_coordinate_x" type="text"
                           class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7">
        &nbsp;&nbsp;ลองจิจูด&nbsp;:&nbsp; <input name="current_coordinate_y"
                                                 type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);"
                                                 maxlength="5" size="7"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">เลขที่ :&nbsp;</td>
    <td colspan="3"><input name="current_address_no" type="text"
                           class="textbox" size="4">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
        <input name="current_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
        &nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp; <input name="current_address_name"
                                                      type="text" class="textbox" size="25"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="current_soi" type="text"
                           class="textbox"> &nbsp;&nbsp;ถนน&nbsp;:&nbsp; <input
            name="current_road" type="text" class="textbox" size="25"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">จังหวัด :&nbsp;</td>
    <td><select name="current_province_code" id="sProvince"
                style="width: 180px;">
        <option value="x"> -กรุณาเลือก-</option>
        <c:forEach var="province" items="${provinces}">
            <option value="${province.province_code}">${province.province_name}</option>
        </c:forEach>
    </select></td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">อำเภอ :&nbsp;</td>
    <td><select name="current_district_code" id="sDistrict"
                style="width: 180px;">
    </select></td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">ตำบล :&nbsp;</td>
    <td><select name="current_subdistrict_code" id="sSubDistrict"
                style="width: 180px;">
    </select></td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>

<tr>
    <td>&nbsp;</td>
    <td align="right">รหัสไปรษณีย์ :&nbsp;</td>
    <td height="30" colspan="3"><input name="current_zipcode"
                                       type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" size="10"
                                       maxlength="5">&nbsp;&nbsp;&nbsp;
        โทรศัพท์&nbsp;:&nbsp; <input name="current_tel" type="text"
                                     class="textbox" size="10"></td>
</tr>
<tr>
    <td>&nbsp;</td>
</tr>
<tr>
    <td bgcolor="#F5F5F5">&nbsp;</td>
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>สถานที่ต้องสงสัย</strong></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ละติจูด&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="suspect_coordinate_x" type="text"
                           class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7">
        &nbsp;&nbsp;ลองจิจูด&nbsp;:&nbsp; <input name="suspect_coordinate_y"
                                                 type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);"
                                                 maxlength="5" size="7"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">เลขที่ :&nbsp;</td>
    <td colspan="3"><input name="suspect_address_no" type="text"
                           class="textbox" size="4">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
        <input name="suspect_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
        &nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp; <input name="suspect_address_name"
                                                      type="text" class="textbox" size="25"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="suspect_soi" type="text"
                           class="textbox"> &nbsp;&nbsp;ถนน&nbsp;:&nbsp; <input
            name="suspect_road" type="text" class="textbox" size="25"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">จังหวัด :&nbsp;</td>
    <td><select name="suspect_province_code" id="sSusProvince"
                style="width: 180px;">
        <option value="x"> -กรุณาเลือก-</option>
        <c:forEach var="province" items="${provinces}">
            <option value="${province.province_code}">${province.province_name}</option>
        </c:forEach>
    </select></td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">อำเภอ :&nbsp;</td>
    <td><select name="suspect_district_code" id="sSusDistrict"
                style="width: 180px;">
    </select></td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">ตำบล :&nbsp;</td>
    <td><select name="suspect_subdistrict_code" id="sSusSubDistrict"
                style="width: 180px;">
    </select></td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
</tr>

<tr>
    <td>&nbsp;</td>
    <td align="right">รหัสไปรษณีย์ :&nbsp;</td>
    <td height="30" colspan="3"><input name="suspect_zipcode"
                                       type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" size="10"
                                       maxlength="5">&nbsp;&nbsp;&nbsp;
        โทรศัพท์&nbsp;:&nbsp; <input name="suspect_tel" type="text"
                                     class="textbox" size="10"></td>
</tr>
<c:if test="${si != null}">
	<tr>
	    <td>&nbsp;</td>
	    <td align="right" valign="top">รูปภาพแผนที่ :&nbsp;</td>
	    <td colspan="3">
	    	<input name="link_photo" type="file" class="textbox" size="35">
	    	<input type="button" id="upload_map_pic" name="upload_map_pic" value="Upload"/>
	        <br>
	        <font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
	    </td>
	</tr>
	<tr>
	    <td>&nbsp;</td>
	    <td align="right" valign="top">รายละเอียดเกี่ยวกับแผนที่ :&nbsp;</td>
	    <td colspan="3">
	        <textarea name="suspect_map_desc" cols="35" rows="3" class="textareabig2"></textarea>
	    </td>
	</tr>
</c:if>
<tr>
    <td>&nbsp;</td>
</tr>
<tr>
    <td bgcolor="#F5F5F5">&nbsp;</td>
    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ยานพาหนะที่เกี่ยวข้อง</strong></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td colspan="4" style="margin-left:10px" width="100%">
        <table border="0" cellspacing="0" cellpadding="0">
            <tr>
                <td>
                    <span class="spanLink" onClick="suspectcaropen('suspectcarBody');"> เพิ่มใหม่</span> |
                    <span class="spanLink" onclick="aatget_check_value('suspectcarBody')">ลบรายการที่เลือก</span>
                </td>
            </tr>
        </table>
        <table id="suspectcarTab" style="width:95%" cellspacing="0">
            <thead>
            <tr style="text-align:center;background-color:#ffccff;">
                <th style="width:5%"><input type="checkbox" id="chksuspectcarBody" name="chksuspectcarBody"
                                            onclick="chkUncheckAll('chksuspectcarBody');"/></th>
                <th style="width:15%">เลขทะเบียน</th>
                <th style="width:20%">ประเภท</th>
                <th style="width:20%">ยี่ห้อ / รุ่น / สี</th>
                <th style="width:40%">รายละเอียดเพิ่มเติม</th>
            </tr>
            </thead>
            <tbody id="suspectcarBody">

            </tbody>
        </table>
    </td>
</tr>
</table>
<hr/>
</td>
</tr>

<tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
</tr>
</table>
<div style="width:100%;text-align:center;">
    <input type="button" value="บันทึก" />
    <input type="button" value="ยกเลิก" onclick="location.href='process?action=Suspect&cmd=detail&id=${suspect.id}'"/>
</div>
</form>