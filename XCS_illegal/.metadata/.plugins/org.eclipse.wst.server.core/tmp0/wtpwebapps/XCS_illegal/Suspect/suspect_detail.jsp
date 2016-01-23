<%@ page import="java.util.Map" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<script type='text/javascript' src='dwr/interface/SuspectRelatif.js'></script>
<script type='text/javascript' src='dwr/interface/SuspectPicture.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<style type="text/css">
    .keylink{
        cursor : hand;
    }
</style>
<script type="text/javascript">
    var jsonPg = eval('${jsonPg}');
    <c:if test="${suspect != null}">
    var suspect_no = '${suspect.suspect_no}';
    </c:if>
    <c:if test="${suspect == null}">
    var suspect_no = '';
    </c:if>
    var mapPg = new Array();
    for (j = 0; j < jsonPg.length; j++) {
        mapPg[jsonPg[j].id] = jsonPg[j].category_name;
    }
    function toggleHidden(mID, btnID) {

        document.getElementById('suspectInfo').style.display = 'none';
        document.getElementById('relativeInfo').style.display = 'none';
        document.getElementById('pictureInfo').style.display = 'none';
        document.getElementsByName('btnRelationInfo')[0].style.background = '#D4D0C8';
        document.getElementsByName('btnSuspectInfo')[0].style.background = '#D4D0C8';
        document.getElementsByName('btnPictureInfo')[0].style.background = '#D4D0C8';
        mnu = document.getElementById(mID);
        btn = document.getElementsByName(btnID)[0];
        if (mnu.style.display == 'none') {
            mnu.style.display = '';
            btn.style.background = '#FFCC33';
        } else {
            mnu.style.display = 'none';
        }
    }
    function addNewPicture(tablename, rowIndex) {
        var data = [];
        if (!rowIndex)
            data = window.showModalDialog('process?action=SuspectInvestigate&run='+(new Date())+'&cmd=pictureAdd&suspect_no=' + suspect_no, self, 'dialogWidth=700px,Height=200px');
        else {
            var picId = jQuery("tr#" + tablename + rowIndex + " > td > input[type=hidden]").first().val();
            data = window.showModalDialog('process?action=SuspectInvestigate&run='+(new Date())+'&cmd=pictureAdd&suspect_no=' + suspect_no + '&id=' + picId, self, 'dialogWidth=700px,Height=200px');
        }
        if (!rowIndex)
            rowIndex = jQuery("tbody#" + tablename + " > tr").size() + 1;
        if (data) {
            var paramMap = {
                'pic_id':data["id"]
            };
            var inputRow = "";
            jQuery.each(paramMap, function(key, value) {
                inputRow = inputRow + '<input type="hidden" name="' + key + '" value="' + value + '" />';
            });
            var box = '<td class="TblRow AlignCenter"><input name="chk' + tablename + rowIndex + '" type="checkbox"/></td>';
            var pic_type = '<td class="TblRow AlignCenter">' + data["picture_category_text"] + '</td>';
            var pic = '<td align="left" valign="top" class="TblRow AlignCenter">' +
                    "<img border=\"0\" width=\"200\" height=\"200\" src=\"<c:url value='/process?action=GetImage'/>&table=SUSPECT_PICTURE&id=" + data["id"] + "&rdn=" + (new Date()) + "\">" + '</td>';
            var desc = '<td align="left" valign="top" class="TblRow AlignLeft">' + data["description"] + '</td>';
            var button = '<td class=\"TblRow AlignLeft\"><input type=\"button\" value=\"แก้ไขข้อมูล\"  onclick=\"addNewPicture(\'' + tablename + '\',' + rowIndex + ')\"/>' + inputRow + '</td>';
            var row = box + pic_type + pic + desc + button;
            if (data["newFlag"])
                jQuery("#" + tablename).first().append("<tr id=\"" + tablename + rowIndex + "\" class=\"" + (rowIndex % 2 == 0 ? 'even' : 'odd') + "\">" + row + "</tr>");
            else {
                jQuery("#" + tablename + rowIndex).replaceWith("<tr id=\"" + tablename + rowIndex + "\" class=\"" + (rowIndex % 2 == 0 ? 'even' : 'odd') + "\">" + row + "</tr>")
            }

        }
    }
    function editPicture(id) {
        var data = window.showModalDialog('process?action=SuspectInvestigate&run='+(new Date())+'&cmd=pictureAdd&id=' + id, self, 'dialogWidth=700px,Height=200px');
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
    function delete_unindex_row(tableName)
    {
        if (alertConfirmDelete()) {
            jQuery("#" + tableName + " tr").has("td > input:checked").remove();
        }
    }
    function delete_sp_row(tableName) {
        if (alertConfirmDelete()) {
            var ids = new Array();
            var i = 0;
            jQuery("#" + tableName + " tr").has("td > input:checked").each(function() {
                ids[i] = jQuery(this).find("td > input[name=pic_id]").val();
                i++;
                jQuery(this).remove();
            })
            SuspectPicture.deleteRows(ids, function(data) {
                // reindex and tr row id name
                jQuery("#" + tableName + " tr").each(function(index) {
                    index = index + 1;
                    jQuery(this).attr('id', tableName + index).removeClass().addClass((index % 2 == 0) ? 'even' : 'odd');
                    jQuery(this).find("td > input[type=button]").removeAttr("onclick").bind("click", function() {
                        addNewPicture(tableName, index);
                    });
                    //alert(jQuery(this).html());
                })
            });
        }
    }
    function delete_sr_row(tableName)
    {
        if (alertConfirmDelete()) {
            var ids = new Array();
            var i = 0;
            jQuery("#" + tableName + " tr").find("td > input:checked").each(function() {
                ids[i] = jQuery(this).val();
                i++;
            });
            SuspectRelatif.deleteRows(ids, function(data) {
                jQuery("#suspectrelativeBody").children().remove();
                insertSuspectRelatives();
            });
        }
    }
    jQuery(document).ready(function() {
        insertSuspectRelatives();
    });
    function printReportCompare(valuePrint){
        Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + 'ReportName=ILL_P004&getTrackNo=' + valuePrint + '&vReportType=PDF&time=' + Math.random(),'_blank', 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}else{
				window.open('process?action=Report&__report=ILL_P004&getTrackNo=' + valuePrint + '&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');					
			}
        });
    	
    }
</script>
<c:set var="odd" value="odd"/>
<c:set var="even" value="even"/>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <c:choose>
        <c:when test="${suspect.suspect_type == '1'}">
            <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยคนไทย</span></td>
        </c:when>
        <c:when test="${suspect.suspect_type == '2'}">
            <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยชาวต่างชาติ</span></td>
        </c:when>
        <c:when test="${suspect.suspect_type == '3'}">
            <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยผู้ประกอบการ</span></td>
        </c:when>
    </c:choose>
</tr>
<tr>
<td>&nbsp;</td>
<td>
<form action="process?action=Suspect&cmd=list" method="post" name="from1">
    <table width="379" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td width="113" align="right" valign="middle">ประเภทผู้ต้องสงสัย&nbsp;:&nbsp;</td>
            <td width="260" valign="middle"><select name="suspect_type">
                <option value="1" ${suspect.suspect_type=='1'?'selected':''}>คนไทย</option>
                <option value="2" ${suspect.suspect_type=='2'?'selected':''}>คนต่างชาติ</option>
                <option value="3" ${suspect.suspect_type=='3'?'selected':''}>ผู้ประกอบการ</option>
            </select> <input name="Button1" type="submit" class="barbutton"
                             value="ตกลง"></td>
        </tr>
    </table>
</form>
<c:if test="${suspect.suspect_type == '1'}">
    <%@include file="suspect_detail1.jsp" %>
</c:if>
<c:if test="${suspect.suspect_type == '2'}">
    <%@include file="suspect_detail2.jsp" %>
</c:if>
<c:if test="${suspect.suspect_type == '3'}">
    <%@include file="suspect_detail3.jsp" %>
</c:if>
<br>
<table border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td>&nbsp;</td>
        <td height="30" colspan="4" align="left"><input
                name="btnRelationInfo" type="button" class="button"
                value="ข้อมูลประกอบการสืบสวน"
                onClick='toggleHidden("relativeInfo", "btnRelationInfo");'
                style="background: #FFCC33">


            <input name="btnSuspectInfo" type="button" class="button" value="ข้อมูลดำเนินการสืบสวน"
                   onClick='toggleHidden("suspectInfo", "btnSuspectInfo");'>

            <input name="btnPictureInfo" type="button" class="button" value="ภาพถ่าย"
                   onClick='toggleHidden("pictureInfo", "btnPictureInfo");'>
        </td>
    </tr>
</table>

<div class="innerPosition" id="relativeInfo" style="width:100%;">
    <br>

    <div style="font-weight:bold;font-size:15px;color:#723373;"> ข้อมูลประกอบการสืบสวน</div>
    <br>
    <table border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td style="font-size:14px;font-weight:bold;color:#660066;">ข้อมูลบุคคลที่เกี่ยวข้อง</td>
        </tr>
        <tr style="display:none">
            <td><span class="spanLink" onClick="openRelativePopup(-1);">
	            เพิ่มใหม่</span> | <span class="spanLink" onClick="delete_sr_row('suspectrelativeBody');">ลบรายการที่เลือก</span>
            </td>
        </tr>
    </table>
    <table id="suspectrelativeTab" style="width:70%" cellspacing="0">
        <thead>
        <tr style="text-align:center;background-color:#ffccff;">
            <th style="width:3%"><input type="checkbox" id="chksuspectrelativeBody" name="chksuspectrelativeBody" style="display:none"
                                        onclick="chkUncheckAll('chksuspectrelativeBody')"/></th>
            <th style="width:20%">ชื่อ-สกุล</th>
            <th style="width:20%">ความสัมพันธ์</th>
            <th style="width:47%">ที่อยู่ปัจจุบัน</th>
            <th>โทรศัพท์</th>
        </tr>
        </thead>
        <tbody id="suspectrelativeBody">

        </tbody>
    </table>

    <br>
    <table border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td style="font-size:14px;font-weight:bold;color:#660066;">ยานพาหนะที่เกี่ยวข้อง</td>
        </tr>
        <tr>
            <td>&nbsp;
            </td>
        </tr>
    </table>
    <table id="carrelativeTab" style="width:70%" cellspacing="0">
        <thead>
        <tr style="text-align:center;background-color:#ffccff;">
            <th style="width:3%"><input type="checkbox" id="chkcarrelativeBody" name="chkcarrelativeBody" style="display:none"
                                        onclick="chkUncheckAll('chkcarrelativeBody')"/></th>
            <th style="width:20%">ทะเบียน</th>
            <th style="width:20%">ประเภท</th>
            <th style="width:15%">ยี่ห้อ/รุ่น/สี</th>
            <th style="width:32%">รายละเอียด</th>
            <th>เลขที่รายงานสืบสวน</th>
        </tr>
        </thead>
        <tbody id="carrelativeBody">
        <c:forEach var="sv" items="${svs}" varStatus="i">
            <tr class="${(i.count%2==0)?'even':'odd'}">
                <td>
                    <input type="checkbox" id="chkcarrelativeBody${i.count}" name="chkcarrelativeBody${i.count}" style="display:none" />
                </td>
                <td>${sv.car_cate} ${sv.car_no} ${sv.province_name}</td>
                <td>${sv.group_name}</td>
                <td>${sv.brand_name}/${sv.car_model}/${sv.car_color}</td>
                <td>${sv.description}</td>
                <td align="center">
                    <c:forEach var="si" items="${vlist}">
                        <c:if test="${si.suspect_investigate_id==sv.suspect_investigate_id}">
                            <a href="process?action=SuspectInvestigate&cmd=editInvestigate&id=${suspect.id}&suspect_no=${suspect.suspect_no}&siId=${sv.suspect_investigate_id}&investigate_no=${si.investigate_no}">${si.investigate_no}</a>
                        </c:if>
                    </c:forEach>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <br>
    <table border="0" cellspacing="0" cellpadding="0">
        <tr>
            <c:if test="${arrest_qty == '0'}">
                <td style="font-size:14px;font-weight:bold;color:#660066;">ข้อมูลการถูกจับกุม : ไม่เคย
                </td>
            </c:if>
            <c:if test="${arrest_qty != '0'}">
                <td style="font-size:14px;font-weight:bold;color:#660066;">ข้อมูลการถูกจับกุม
                    :เคยถูกจับกุมทั้งหมด ${arrest_qty} ครั้ง
                </td>
            </c:if>
        </tr>
        <tr>
            <td>&nbsp;
            </td>
        </tr>
    </table>
    <table id="arrestTab" style="width:70%" cellspacing="0">
        <thead>
        <tr style="text-align:center;background-color:#ffccff;">
            <th style="width:5%">ลำดับ</th>
            <th style="width:10%">พ.ร.บ.</th>
            <th style="width:25%">ฐานความผิด</th>
            <th style="width:25%">ของกลาง</th>
            <th>การปรับโทษ</th>
        </tr>
        </thead>
        <tbody id="arrestBody">
        <c:if test="${vsrList != null}">
            <c:forEach var="vsr" items="${vsrList}" varStatus="i">
            	<tr>
	                <td class="TblRow AlignCenter">${i.count}</td>
	                <td class="TblRow AlignLeft">${vsr.legislation_name}</td>
	                <td class="TblRow AlignLeft">${vsr.guilt_bast}</td>
	                <td class="TblRow AlignLeft">${vsr.exhibit}</td>
	                <td class="TblRow AlignLeft">เปรียบเทียบปรับเป็นเงิน ${vsr.compare_fine} บาท</td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
</div>

<div class="innerPosition" id="suspectInfo" style="width:100%;">
    <br>

    <div style="font-weight:bold;font-size:15px;color:#723373;"> ข้อมูลดำเนินการสืบสวน</div>
    <table border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="spanLink"
                                                     onClick="location.href='process?action=SuspectInvestigate&cmd=addInvestigate&id=${suspect.id}'">
	            เพิ่มใหม่</span> | <span class="spanLink" onClick="AM_doDeleteSuspectAddress('otherAddressBody');">ลบรายการที่เลือก</span>
            </td>
        </tr>

    </table>
    <table id="suspectInfoTab" style="width:70%" cellspacing="0">
        <thead>
        <tr style="background-color:#ffccff;">
            <th style="width:3%;text-align:right;"><input type="checkbox" id="suspectInfoChk" name="suspectInfoChk"/>
            </th>
            <th style="width:13%">วันที่เริ่ม</th>
            <th style="width:13%">วันที่สิ้นสุด</th>
            <th style="width:20%">คดี พ.ร.บ.</th>
            <th style="width:35%">พฤติกรรมผู้ต้องสงสัย</th>
            <th>&nbsp;</th>
        </tr>
        </thead>
        <tbody id="suspectInfoBody">

        <c:if test="${vlist != null}">
            <c:forEach items="${vlist}" var="list" varStatus="i">
                <tr class="${(i.count%2==0)?'even':'odd'}">
                    <td class="TblRow AlignRight">
                        <input name="chk${i.count}" type="checkbox"/>
                    </td>
                    <td class="TblRow AlignLeft">
                            ${list.start_date}
                    </td>
                    <td class="TblRow AlignLeft">
                            ${list.end_date}
                    </td>
                    <td class="TblRow AlignLeft">
                            ${list.legislation_name}
                    </td>
                    <td class="TblRow AlignLeft">
                            ${list.suspect_behavior}
                    </td>
                    <td>
                        <input type="hidden" name="supect_no" id="suspect_no" value="${suspect.suspect_no}">
                        <input type="hidden" name="suspect_investigate_id" id="suspect_investigate_id"
                               value="${list.suspect_investigate_id}">
                        <input type="hidden" name="investigate_no" id="investigate_no" value="${list.investigate_no}">
                        <a href="process?action=SuspectInvestigate&cmd=editInvestigate&id=${suspect.id}&siId=${list.suspect_investigate_id}">แก้ไขข้อมูล</a>
                        <span style="cursor:hand;text-decoration:underline" onclick="printReportCompare('${list.track_no}')">พิมพ์</span>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
</div>


<div class="innerPosition" id="pictureInfo" style="width:100%;">
    <br>

    <div style="font-weight:bold;font-size:15px;color:#723373;"> ภาพผู้ต้องสงสัย</div>
    <div>หมวดภาพถ่าย : <select name="picture_category_id" id="picture_category_id">
        <option value="0"> -ทั้งหมด-</option>
        <c:forEach items="${pgs}" var="pg" varStatus="i">
            <option value="${pg.id}">${pg.category_name}</option>
        </c:forEach>
    </select><input name="Button1" type="button" class="barbutton" onclick="ajaxFindPics('picture_category_id')"
                    value="ค้นหา"></div>
    <br>
    <table border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span class="spanLink"
                                                     onClick="addNewPicture('pictureInfoBody')">
                    เพิ่มใหม่</span> | <span class="spanLink" onClick="delete_sp_row('pictureInfoBody');">ลบรายการที่เลือก</span>
            </td>
        </tr>

    </table>
    <table id="pictureInfoTab" style="width:70%" cellspacing="0">
        <thead>
        <tr style="background-color:#ffccff;">
            <th style="width:3%;text-align:right;"><input type="checkbox" id="chkpictureInfoBody"
                                                          name="chkpictureInfoBody"
                                                          onclick="chkUncheckAll('chkpictureInfoBody');"/></th>
            <th style="width:20%">หมวดภาพถ่าย</th>
            <th style="width:27%">รูปภาพ</th>
            <th style="width:40%">รายละเอียด</th>
            <th>&nbsp;</th>
        </tr>
        </thead>
        <tbody id="pictureInfoBody">
        <c:if test="${spl != null}">
            <c:forEach items="${spl}" var="sp" varStatus="i">
                <tr class="${(i.count%2==0)?'even':'odd'}" id="pictureInfoBody${i.count}">
                    <td class="TblRow AlignRight">
                        <input name="chkpictureInfoBody${i.count}" type="checkbox"/>
                    </td>
                    <td class="TblRow AlignCenter">
                        <c:forEach items="${pgs}" var="pg">
                            <c:if test="${pg.id == sp.picture_category_id}">
                                ${pg.category_name}
                            </c:if>
                        </c:forEach>
                    </td>
                    <td class="TblRow AlignLeft">
                        <img border="0" width="200" height="200"
                             src="<c:url value='/process?action=GetImage'/>&table=SUSPECT_PICTURE&id=${sp.id}">
                    </td>
                    <td class="TblRow AlignLeft">
                            ${sp.description}
                    </td>
                    <td class="TblRow AlignLeft">
                        <input type="button" value="แก้ไขข้อมูล"
                               onclick="addNewPicture('pictureInfoBody',${i.count});"/><input type="hidden"
                                                                                              name="pic_id"
                                                                                              value="${sp.id}"/>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>

</div>
</td>
</tr>
</table>
<br>
<script type="text/javascript">
    jQuery("input[name=btnSuspectInfo]").first().trigger("click");
    function ajaxFindPics(picId) {
        var picIdVal = jQuery("#" + picId + " > option:selected").first().val();
        jQuery.ajax({
            async:false,
            url: 'process?action=Ajax&cmd=getPictureByCategoryAndSuspectNo&suspect_no=${suspect.suspect_no}&id=' + picIdVal,
            success: function(data) {
                jQuery("#pictureInfoBody > tr").remove();
                var picBody = jQuery("#pictureInfoBody");
                var suspectPics = eval('(' + data + ')');
                var tr = "";
                if (suspectPics.length > 0) {
                    for (i = 0; i < suspectPics.length; i++) {
                        var rowclass = 'even';
                        if ((i + 1) % 2 != 0)rowclass = 'odd';
                        tr = tr + '<tr class="' + rowclass + '">'
                                + '<td class="TblRow AlignRight">'
                                + '<input type="checkbox" name="chkpictureInfoBody' + (i + 1) + '"/>'
                                + '</td>'
                                + '<td class="TblRow AlignCenter">'
                                + mapPg[suspectPics[i].picture_category_id]
                                + '</td>'
                                + '<td class="TblRow AlignLeft">'
                                + '<img border="0" width="200" height="200" src="<c:url value='/process?action=GetImage'/>&table=SUSPECT_PICTURE&id=' + suspectPics[i].id + '">'
                                + '</td>'
                                + '<td class="TblRow AlignLeft">'
                                + suspectPics[i].description
                                + '</td>'
                                + '<td class="TblRow AlignLeft">'
                                + '    <input type="button" value="แก้ไขข้อมูล" />'
                                + '</td>'
                                + '</tr>';
                    }
                    picBody.append(tr);
                } else {
                    alert("ไม่พบภาพถ่ายผู้ต้องสงสัย");
                }
            }
        });
    }
    function insertSuspectRelatives() {
        SuspectRelatif.getSuspectRelatifBySuspectNo(suspect_no, function(data) {
            var srJson = eval('(' + data + ')');
            for (i = 0; i < srJson.length; i++) {
                var full_name = srJson[i]["title_text"] + srJson[i]["first_name"] + " " + srJson[i]["last_name"];
                var relation_text = srJson[i]["relation_text"];
                var current_address = srJson[i]["full_current_address"];
                var tel = srJson[i]["tel"];
                jQuery("#suspectrelativeBody").append(
                        "<tr class=\"" + ((i % 2 == 0) ? "odd" : "even") + "\" id=\"suspectrelativeRow_" + srJson[i]["id"] +
                                "\"><td><input type=\"checkbox\" name=\"chksuspectrelativeBody" + srJson[i]["id"] + 
                                "\" style='display:none'  value=\"" + srJson[i]["id"] + "\"  /></td><td class=\"TblRow AlignCenter keylink\">" + full_name +
                                "<input type=\"hidden\" value=\"" + srJson[i]["id"] + "\" name=\"id\" /></td><td class=\"TblRow AlignCenter \">" + relation_text +
                                "</td><td class=\"TblRow AlignLeft\">" + current_address + "</td>" +
                                "<td class=\"TblRow AlignCenter\">" + tel + "</td></tr>"
                        );
                jQuery("#suspectrelativeRow_" + srJson[i]["id"] + " > td.keylink").last().bind("click", function() {
                    var id = jQuery(this).find("input[type=hidden]").val();
                    openRelativePopup(id);
                });

            }
        });
    }
    function openRelativePopup(id) {
        var data = window.showModalDialog('process?action=SuspectRelatif&run='+(new Date())+'&cmd=openPopup&id=' + id + '&suspect_no=' + suspect_no, self, 'dialogWidth=700px,dialogHeight=400px');
        if (data) {
            if (id > 0) {
                var cl = jQuery("#suspectrelativeRow_" + id).first().attr("class");
                jQuery("#suspectrelativeRow_" + id).replaceWith("<tr id=\"suspectrelativeRow_" + id +
                        "\"><td><input type=\"checkbox\" name=\"chksuspectrelativeBody" + id +
                        "\" style='display:none' value=\"" + id + "\" /></td><td class=\"TblRow AlignCenter keylink\">" + data["relative_name"] +
                        "<input type=\"hidden\" value=\"" + id + "\" name=\"id\" /></td><td class=\"TblRow AlignCenter \">" + data["relation_text"] +
                        "</td><td class=\"TblRow AlignLeft\">" + data["current_address"] + "</td>" +
                        "<td class=\"TblRow AlignCenter\">" + data["tel"] + "</td></tr>");
                jQuery("#suspectrelativeRow_" + id).addClass(cl);
                jQuery("#suspectrelativeRow_" + id + " > td.keylink").last().bind("click", function() {
                    var id = jQuery(this).find("input[type=hidden]").val();
                    openRelativePopup(id);
                });
            } else {
                jQuery("#suspectrelativeBody").append("<tr id=\"suspectrelativeRow_" + data["id"] +
                        "\"><td><input type=\"checkbox\" name=\"chksuspectrelativeBody" + data["id"] +
                        "\" value=\"" + data["id"] + "\" /></td><td class=\"TblRow AlignCenter keylink\">" + data["relative_name"] +
                        "<input type=\"hidden\" value=\"" + data["id"] + "\" name=\"id\" /></td><td class=\"TblRow AlignCenter \">" + data["relation_text"] +
                        "</td><td class=\"TblRow AlignLeft\">" + data["current_address"] + "</td>" +
                        "<td class=\"TblRow AlignCenter\">" + data["tel"] + "</td></tr>");
                var cl1 = jQuery("#suspectrelativeBody > tr").size();
                cl1 = (cl1 % 2 == 0) ? 'even' : 'odd';
                jQuery("#suspectrelativeRow_" + data["id"]).addClass(cl1);
                jQuery("#suspectrelativeRow_" + data["id"] + " > td.keylink").last().bind("click", function() {
                    var id = jQuery(this).find("input[type=hidden]").val();
                    openRelativePopup(id);
                });
            }
            //jQuery("#suspectrelativeBody").children().remove();
            //insertSuspectRelatives()
        }
    }
</script>