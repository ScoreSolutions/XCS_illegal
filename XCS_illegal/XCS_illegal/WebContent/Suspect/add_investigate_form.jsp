<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type='text/javascript' src='dwr/interface/FileUploader.js'></script>

<script>
    function suspectcaropen(tablename) {
        var data = window.showModalDialog('process?action=CarSuspect', self, 'dialogWidth=700px,Height=200px');
        var rowIndex = jQuery("tbody#" + tablename + " > tr").size();
        if (data) {
            addCar(data, rowIndex + 1);
        }
    }
    function suspectcaropenEdit(tablename,id) {
        var row = id;
        var maxRow = jQuery("tbody#" + tablename + " > tr").size();
        var data = window.showModalDialog('process?action=CarSuspect&maxRow='+maxRow+'&row='+row, self, 'dialogWidth=700px,Height=200px');
        var rowIndex = jQuery("tbody#" + tablename + " > tr").size();
        if (data) {
            addCar(data, row);
        }
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
                    FileUploader.saveSuspectMap(image,id,function(data){
						
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
    function addCar(data, rowIndex) {
        var tablename = 'suspectcarBody';
        var paramMap = {
            'car_province_code':data["car_province_code"],
            'car_duty_code':data["duty_code"],
            'car_cate':data["car_cate"],
            'car_no':data["car_no"],
            'car_brand_brand_duty_code':data["car_brand_brand_duty_code"],
            'car_model':data["car_model"],
            'car_color':data["car_color"],
            'car_description':data["car_description"],
            'car_id':data["car_id"]
        };
        var inputRow = "";
        jQuery.each(paramMap, function(key, value) {
            inputRow = inputRow + '<input type="hidden" name="' + key + '" value="' + value + '" />';
        });

        var box = '<td class="TblRow AlignCenter"><input name="chk' + tablename + rowIndex + '" type="checkbox"/>' +
                inputRow + '</td>';
        var index = '<td class="TblRow AlignLeft keylink"><span style="cursor:hand" >' + data["car_cate"] + " " + data["car_no"] + " " + data["car_province_text"] + '</span></td>';
        var type = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["duty_name"] + '</td>';
        var name = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["car_brand_text"] + "/" + data["car_model"] + "/" + data["car_color"] + '</td>';
        var desc = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["car_description"] + '</td>';
        var row = box + index + type + name + desc;
        if(rowIndex > jQuery("tbody#" + tablename + " > tr").size()){
            jQuery("#" + tablename).first().append("<tr id=\"" + tablename + rowIndex + "\">" + row + "</tr>");
        }else{
            jQuery("#"+tablename + rowIndex).first().children().remove();
            jQuery("#"+tablename + rowIndex).first().append(row);
        }                                                                                
        jQuery("#"+tablename+rowIndex).find("td.keylink").css('text-decoration','underline').bind('click',function(){
           suspectcaropenEdit(tablename, rowIndex);
        });
    }
    function indictmentPopOpen(tablename) {
        var data = window.showModalDialog('process?action=Indictment_pop&cmd=list&legislation_id='+jQuery("[name=legislation_id] option:selected").val(), self, 'dialogWidth=700px,Height=400px');
        var rowIndex = jQuery("tbody#" + tablename + " > tr").size();
        if (data) {
            for (var i = 0; i < data.length; i++) {
                if (jQuery("input[name='indictment_indictment_id'][value='" + data[i][5] + "']").size() > 0) {
                    //alert("dupplicated offcode ");
                } else {
                    var paramMap = {
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
                        'investigate_team_poscode':data[i][6],
                        'investigate_team_offcode':data[i][7]
                    };
                    var inputRow = "";
                    jQuery.each(paramMap, function(key, value) {
                        inputRow = inputRow + '<input type="hidden" name="' + key + '" value="' + value + '" />';
                    });
                    rowIndex = rowIndex + 1;
                    var index = '<td class="TblRow AlignCenter">' + rowIndex + '</td>';
                    var box = '<td class="TblRow AlignCenter"><input name="chk' + myTable + rowIndex + '" type="checkbox"/>' + inputRow + '</td>';
                    var name = '<td align="left" valign="top" class="TblRow AlignLeft">' + data[i]["9"] + '</td>';
                    var pos = '<td align="left" valign="top" class="TblRow AlignLeft">' + data[i]["3"] + '</td>';
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

    function aatget_check_value(tableName)
    {
        jQuery("#" + tableName + " tr").has("td > input:checked").remove();
        // rerun index of row
        jQuery("#" + tableName + " tr").each(function(index) {
            jQuery(this).children().first().text(index + 1);
        });
    }


</script>

<form name="dataform" action="process?action=SuspectInvestigate&cmd=create" method="post"  >

<input type="hidden" name="suspect_no" id="suspect_no" value="${suspect.suspect_no}"/>
<input type="hidden" name="suspect_type" id="suspect_type" value="${suspect.suspect_type}"/>
<input type="hidden" name="suspect_id" id="suspect_id" value="${suspect.id}"/>
<c:if test="${si != null}">
    <input type="hidden" name="id" id="si.id" value="${si.id}"/>
</c:if>
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
    <td width="28%"><input type="text" name="track_no" readonly="true" size="30" class="textreadonly"></td>
    <td width="22%" align="right">วันที่ :&nbsp;</td>
    <td width="28%"><input type="text" name="doc_date" class="textreadonly" readonly value="">
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right"><font color="RED">*</font>เลขที่งานสืบสวน :&nbsp;</td>
    <td><input type="text" name="investigate_no" class="textbox" size="30"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ผู้สืบสวน :&nbsp;</td>
    <td><input type="text" name="staff_investigate_name" class="textreadonly" size="30" id="staff_investigate_name" readonly="true"
               style="float:left">
        <input type="hidden" id="staff_investigate" name="staff_investigate">
        <input type="hidden" id="poscode_investigate" name="poscode_investigate">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&poscode=poscode_investigate&formname=staff_investigate_name&id=staff_investigate' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        <font color="RED">*</font>
    </td>
    <td align="right">ผู้สั่งการให้สืบสวน&nbsp;:&nbsp;</td>
    <td>
        <input name="staff_command_name" type="text" class="textreadonly" size="30" id="staff_command_name" readonly="true"
               style="float:left"/>
        <input type="hidden" id="staff_command" name="staff_command">
        <input type="hidden" id="poscode_command" name="poscode_command">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&poscode=poscode_command&formname=staff_command_name&id=staff_command' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
        <font color="RED">*</font>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">ผู้สั่งให้บันทึก :&nbsp;</td>
    <td><input type="text" name="staff_order_save_name" class="textreadonly" size="30" id="staff_order_save_name" readonly="true"
               style="float:left">
        <input type="hidden" id="staff_order_save" name="staff_order_save">
        <input type="hidden" id="poscode_order_save" name="poscode_order_save">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&poscode=poscode_order_save&formname=staff_order_save_name&id=staff_order_save' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
    </td>
    <td align="right">ผู้ให้ข้อมูล&nbsp;:&nbsp;</td>
    <td>
        <input name="staff_info_name" type="text" class="textreadonly" size="30" id="staff_info_name" readonly="true"
               style="float:left"/>
        <input type="hidden" id="staff_info" name="staff_info">
        <input type="hidden" id="poscode_info" name="poscode_info">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&poscode=poscode_info&formname=staff_info_name&id=staff_info' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
    </td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td align="right">เรียน :&nbsp;</td>
    <td><input type="text" name="staff_report_to_name" class="textreadonly" size="30" id="staff_report_to_name" readonly="true"
               style="float:left">
        <input type="hidden" id="staff_report_to" name="staff_report_to">
        <input type="hidden" id="poscode_report_to" name="poscode_report_to">
        <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;margin-left:5px"
             onClick="window.open('process?action=Divide_staff_pop&poscode=poscode_report_to&formname=staff_report_to_name&id=staff_report_to' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
    </td>
    <td align="right">เบอร์โทรผู้ให้ข้อมูล&nbsp;:&nbsp;</td>
    <td>
        <input name="staff_info_mobile" type="text" class="textbox" size="30" id="staff_info_mobile"/>
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
            <c:if test="${listSit != null}">
                <c:forEach var="sit" varStatus="i" items="${listSit}">
                    <tr id="coinvestigateBody${i.count}">
                        <td class="TblRow AlignCenter">${i.count}</td>
                        <td class="TblRow AlignCenter"><input name="chkcoinvestigateBody${i.count}" type="checkbox"/>
                            <input name="investigate_team_idcardno" value="${sit.idcard_no}" type="hidden"/>
                            <input name="investigate_team_poscode" value="${sit.poscode}" type="hidden"/>
                            <input name="investigate_team_offcode" value="${sit.offcode}" type="hidden"/></td>
                        <td class="TblRow AlignLeft">${sit.full_name}</td>
                        <td class="TblRow AlignLeft">${sit.posname}</td>
                    </tr>
                </c:forEach>
            </c:if>
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
    <td><span>
        <input name="start_date" type="text" id="start_date_text" class="textreadonly" size="10" readonly >
        <a href="javascript:NewCssCal('start_date_text','ddMMyyyy','dropdown',false)">
	        <img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle"
	          style="border-style: none" id="start_date_img" width="19" height="19"/>
        </a>
        เวลา :&nbsp;<input type="text" name="start_time" id="start_time" size="5" onkeypress="txtTime_OnKeyPress(this);" />
        </span>
        <font color="RED">*</font>
    </td>
    <td align="right">
        วันที่สิ้นสุดทำการสืบสวน :&nbsp;
    </td>
    <td><input name="end_date" type="text" id="end_date_text" class="textreadonly" size="10" readonly >
        <a href="javascript:NewCssCal('end_date_text','ddMMyyyy','dropdown',false)">
	        <img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle"
	         style="border-style: none" id="end_date_img" width="19" height="19"/>
        </a>
        <span>เวลา :&nbsp;<input type="text" name="end_time" id="end_time" size="5" onkeypress="txtTime_OnKeyPress(this);" /></span>
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
            <c:if test="${listSii != null}">
                <c:forEach var="sii" items="${listSii}" varStatus="i">
                    <tr id="indictmentBody${i.count}">
                        <td class="TblRow AlignCenter">${i.count}</td>
                        <td class="TblRow AlignCenter"><input name="chkindictmentBody${i.count}" type="checkbox"/>
                            <input type="hidden" name="indictment_indictment_id" value="${sii.indictment_id}"/></td>
                        <td align="left" valign="top" class="TblRow AlignLeft">${sii.guilt_base}</td>
                    </tr>
                </c:forEach>
            </c:if>
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
                           class="textNum" OnKeyPress="ChkMinusDbl(this);" size="7" value="${suspect.coordinate_x}">
        &nbsp;&nbsp;ลองจิจูด&nbsp;:&nbsp; <input name="current_coordinate_y"        value="${suspect.coordinate_y}"
            type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" size="7"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">เลขที่ :&nbsp;</td>
    <td colspan="3"><input name="current_address_no" type="text"
                           class="textbox" size="4" value="${suspect.address_no}">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
        <input name="current_moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3" value="${suspect.moo}">
        &nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp; <input name="current_address_name" value="${suspect.address_name}"
                                                      type="text" class="textbox" size="25"></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
    <td colspan="3"><input name="current_soi" type="text"  value="${suspect.soi}"
                           class="textbox"> &nbsp;&nbsp;ถนน&nbsp;:&nbsp; <input value="${suspect.road}"
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
                           class="textNum" OnKeyPress="ChkMinusDbl(this);" size="7">
        &nbsp;&nbsp;ลองจิจูด&nbsp;:&nbsp; <input name="suspect_coordinate_y"
            type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" size="7"></td>
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
<c:if test="${si != null && si.id != null}">
    <tr>
    	<td>&nbsp;</td>
    	<td align="right" valign="top">รูปภาพแผนที่ :&nbsp;</td>
    	<td colspan="3">
    		<img id="map_picture" border="0" width="100" height="100" 
    		src="<c:url value='/process?action=GetImage'/>&table=SUSPECT_INVESTIGATE&id=${si.id}" />
    	</td>
    </tr>
    <tr>
	    <td>&nbsp;</td>
	    <td>&nbsp;</td>
	    <td colspan="3">
	    	<input name="suspect_map" type="file" class="textbox" size="35" />
	        <input type="button" id="upload_map_pic" name="upload_map_pic" value="Upload" 
	                    onclick="uploadFile('suspect_map','suspect_investigate',${(si == null)?0:(si.id)},'map_picture');"/>
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
    <input type="submit" value="บันทึก" class="barButton"  />
    <input type="button" value="ยกเลิก" class="barButton" onclick="location.href='process?action=Suspect&cmd=detail&id=${suspect.id}'"/>
</div>
</form>
<script type="text/javascript">
    var frmvalidator = new Validator("dataform");
    frmvalidator.addValidation("investigate_no","req","กรุณากรอกเลขที่งานสืบสวน");
    frmvalidator.addValidation("staff_investigate_name","req","กรุณาเลือกผู้สืบสวน");
    frmvalidator.addValidation("staff_command_name","req","กรุณาเลือกผู้สั่งการให้สอบสวน");
    frmvalidator.addValidation("start_date","req","กรุณาระบุวันที่เริ่มดำเนินการสืบสวน");
    frmvalidator.addValidation("start_time","req","กรุณาระบุเวลาที่เริ่มดำเนินการสืบสวน");

    function initValue() {
    <c:if test="${si != null}">
        jQuery("[name=track_no]").val('${si.track_no}');
        jQuery("[name=doc_date]").val('<fmt:formatDate value="${si.doc_date}" pattern="dd/MM/yyyy" />');
        jQuery("[name=investigate_no]").val('${si.investigate_no}');
        jQuery("[name=staff_investigate_name]").val('${si.staff_investigate_name}');
        jQuery("[name=staff_investigate]").val('${si.staff_investigate}');
        jQuery("[name=poscode_investigate]").val('${si.poscode_investigate}');
        jQuery("[name=staff_info_name]").val('${si.staff_info_name}');
        jQuery("[name=staff_info]").val('${si.staff_info}');
        jQuery("[name=poscode_info]").val('${si.poscode_info}');
        jQuery("[name=staff_command_name]").val('${si.staff_command_name}');
        jQuery("[name=staff_command]").val('${si.staff_command}');
        jQuery("[name=poscode_command]").val('${si.poscode_command}');
        jQuery("[name=staff_report_to_name]").val('${si.staff_report_to_name}');
        jQuery("[name=staff_report_to]").val('${si.staff_report_to}');
        jQuery("[name=poscode_report_to]").val('${si.poscode_report_to}');
        jQuery("[name=staff_order_save_name]").val('${si.staff_order_save_name}');
        jQuery("[name=staff_order_save]").val('${si.staff_order_save}');
        jQuery("[name=poscode_order_save]").val('${si.poscode_order_save}');
        jQuery("[name=staff_info_mobile]").val('${si.staff_info_mobile}');
        jQuery("[name=start_date]").val('<fmt:formatDate value="${si.start_date}" pattern="dd/MM/yyyy" />');
        jQuery("[name=start_time]").val('<fmt:formatDate value="${si.start_date}" pattern="HH:mm" />');
        jQuery("[name=end_date]").val('<fmt:formatDate value="${si.end_date}" pattern="dd/MM/yyyy" />');
        jQuery("[name=end_time]").val('<fmt:formatDate value="${si.end_date}" pattern="HH:mm" />');
        jQuery("[name=legislation_id] > otion[value=${si.legislation_id}]").attr("selected","selected");
        jQuery("[name=case_type] > option[value=${si.case_type}]").attr("selected","selected");
        jQuery("[name=suspect_behavior]").val('${si.suspect_behavior}');
        jQuery("[name=remarks]").val('${si.remarks}');
        jQuery("[name=investigate_present]").val('${si.investigate_present}');
        jQuery("[name=current_coordinate_x]").val('${si.current_coordinate_x}');
        jQuery("[name=current_coordinate_y]").val('${si.current_coordinate_y}');
        jQuery("[name=current_address_no]").val('${si.current_address_no}');
        jQuery("[name=current_address_name]").val('${si.current_address_name}');
        jQuery("[name=current_moo]").val('${si.current_moo}');
        jQuery("[name=current_soi]").val('${si.current_soi}');
        jQuery("[name=current_road]").val('${si.current_road}');
        getProvince('sProvince', 'sDistrict', 'sSubDistrict', '${si.current_province_code}', '${si.current_district_code}', '${si.current_subdistrict_code}');
        jQuery("[name=current_zipcode]").val('${si.current_zipcode}');
        jQuery("[name=current_tel]").val('${si.current_tel}');
        jQuery("[name=suspect_coordinate_x]").val('${si.suspect_coordinate_x}');
        jQuery("[name=suspect_coordinate_y]").val('${si.suspect_coordinate_y}');
        jQuery("[name=suspect_address_no]").val('${si.suspect_address_no}');
        jQuery("[name=suspect_address_name]").val('${si.suspect_address_name}');
        jQuery("[name=suspect_moo]").val('${si.suspect_moo}');
        jQuery("[name=suspect_soi]").val('${si.suspect_soi}');
        jQuery("[name=suspect_road]").val('${si.suspect_road}');
        getProvince('sSusProvince', 'sSusDistrict', 'sSusSubDistrict', '${si.suspect_province_code}', '${si.suspect_district_code}', '${si.suspect_subdistrict_code}');
        jQuery("[name=suspect_zipcode]").val('${si.suspect_zipcode}');
        jQuery("[name=suspect_tel]").val('${si.suspect_tel}');
        jQuery("[name=suspect_map_desc]").val('${si.suspect_map_desc}');
    </c:if>
    <c:if test="${listSv != null}">
    <c:forEach items="${listSv}" var="sv" varStatus="i">
        var data = [];
        data["car_province_code"] = '${sv.province_code}';
        data["duty_code"] = '${sv.duty_code}';
        data["car_cate"] = '${sv.car_cate}';
        data["car_no"] = '${sv.car_no}';
        data["car_brand_brand_duty_code"] = '${sv.brand_brand_code},${sv.brand_duty_code}';
        data["car_model"] = '${sv.car_model}';
        data["car_color"] = '${sv.car_color}';
        data["car_description"] = '${sv.description}';
        data["car_id"] = '${sv.id}';
        data["car_province_text"] = '${sv.provincetext}';
        data["car_brand_text"] = '${sv.brand_text}';
        data["duty_name"] = '${sv.car_category_text}';
        addCar(data, ${i.count});
    </c:forEach>
    </c:if>
    <c:if test="${si == null}">
    	//Default Value
        getProvince('sProvince', 'sDistrict', 'sSubDistrict', '', '', '');
        getProvince('sSusProvince', 'sSusDistrict', 'sSusSubDistrict', '', '', '');
        jQuery("[name=staff_investigate_name]").val('${staff_name_investigate}');
        jQuery("[name=staff_investigate]").val('${staff_investigate}');
        jQuery("[name=poscode_investigate]").val('${poscode_investigate}');
    </c:if>        
    }
    jQuery(document).ready(function() {
        jQuery("#sProvince").bind("change", function() {
            getDistrict('sDistrict', 'sSubDistrict', this.value, '', '');
        });
        getDistrict('sDistrict', 'sSubDistrict', '${suspect.province_code}', '', '');
        jQuery("#sDistrict").bind("change", function() {
            getTambol('sSubDistrict', this.value, '');
        });
        getTambol('sSubDistrict','${suspect.subdistrict_code}', '');
        jQuery("#sSusProvince").bind("change", function() {
            getDistrict('sSusDistrict', 'sSusSubDistrict', this.value, '', '');
        });
        jQuery("#sSusDistrict").bind("change", function() {
            getTambol('sSusSubDistrict', this.value, '');
        });
        initValue();
    });

    <c:if test="${altMsg != ''}">
		alert("${altMsg}");
		document.dataform.investigate_no.select();
    </c:if>

</script>