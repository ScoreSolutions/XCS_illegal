<%@page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp" %>
<%@include file="/Templates/meta.jsp" %>


<html xmlns="http://www.w3.org/1999/xhtml">


<HEAD>
    <base target="_self"/>
    <title>ภาพถ่ายผู้ต้องสงสัย</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" language="JavaScript" src="js/rollimage.js"></script>
    <script type="text/javascript" language="JavaScript" src="js/menu.js"></script>
    <script type="text/javascript" language="JavaScript" src="js/JScript.js"></script>
    <script type='text/javascript' src='dwr/engine.js'></script>
    <script type='text/javascript' src='dwr/util.js'></script>
    <script type='text/javascript' src='dwr/interface/FileUploader.js'></script>
    <script type='text/javascript' src='dwr/interface/SuspectPicture.js'></script>
    <script type="text/javascript" language="JavaScript"
            src="script/jquery.js"></script>
    <script type="text/javascript" language="JavaScript"
            src="script/jquery.form.js"></script>
    <script type="text/javascript" language="JavaScript"
            src="script/service.js"></script>
    <script type="text/javascript" language="JavaScript"
            src="script/action.js"></script>
    <script type="text/javascript" language="JavaScript"
            src="script/effect.js"></script>
    <script type="text/javascript" language="JavaScript"
            src="script/util.js"></script>

    <script type="text/javascript">
        var opener = window.dialogArguments;
        <c:if test="${newFlag != null}">
            var newFlag = true;
        </c:if>
        <c:if test="${newFlag == null}">
            var newFlag = false;
        </c:if>
        function resetval()
        {
            if(newFlag){
                jQuery("#image").css('display','none');
                document.picform.picture.value = "";
                document.picform.description.value = "";
            }else{
                jQuery("#image").attr('src',"<c:url value='/process?action=GetImage'/>&table=suspect_picture&id=${sp.id}&rnd" + Date());
                jQuery("#image").css('display','');
                //document.picform.picture.value = "";
                document.picform.description.value = "${sp.description}";
                jQuery("select option").attr('selected','');
                jQuery("select option[value=${sp.picture_category_id}]").attr('selected','selected');
            }
        }
        function saveto()
        {
            var data = [];
            data["id"] = jQuery("[name=id]").val();
            data["description"] = jQuery("[name=description]").val();
            data["picture_category_id"] = jQuery("[name=picture_category_id] option:selected").val();
            data["picture_category_text"] = jQuery("[name=picture_category_id] option:selected").text();
            if(newFlag){
                data["newFlag"] = true;
            }else{
                data["newFlag"] = false;
            }
            // make data
            var map = {
                'description':jQuery("[name=description]").val(),
                'picture_category_id':jQuery("[name=picture_category_id] option:selected").val(),
                'id':jQuery("[name=id]").val(),
                'suspect_no':jQuery("[name=suspect_no]").val()
            };
            jQuery.ajax({
                type:'POST',
                url:'process?action=SuspectInvestigate&cmd=addSuspectPicture',
                data:map,
                //data:jQuery("#picform").serialize(),
                dataType:'image/jpeg',
                async:false,
                success: function(res) {
                    window.returnValue = data;
                    window.close();
                }
            });
        }
        function cancel(){
            if(newFlag){
                SuspectPicture.deleteRow(jQuery("[name=id]").val());
            }
            window.close();
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
                }
            });
        }
        jQuery(document).ready(function(){
            resetval();
        })
    </script>
</HEAD>

<BODY>
<form id="picform" name="picform" enctype="multipart/form-data">
    <input type="hidden" name="id" value="${sp.id}">
    <input type="hidden" name="suspect_no" value="${suspect_no}">
    <input type="hidden" id="hiddenPicture" value="" name="hiddenPicture" style="display:none" />
    <table border="0" cellpadding="0" cellspacing="0" width="95%">
        <tr>
            <td colspan="2"><span class="websitename" id="varPopupName">ภาพถ่ายผู้ต้องสงสัย</span></td>
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
                <input name="btnBack" onclick="cancel()" type="button" class="barbutton" value="กลับ">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <hr/>
            </td>
        </tr>
        <tr>
            <td width="30%" align="right">
                หมวดภาพถ่าย :&nbsp;
            </td>
            <td>
                <select name="picture_category_id" id="picture_category_id">
                    <c:forEach items="${pgs}" var="pg" varStatus="i">
                        <option value="${pg.id}">${pg.category_name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td align="right">
                ภาพถ่าย :&nbsp;
            </td>
            <td>
                <img src="" id="image" width="200" height="200" style="display:none"><br/>
                <input type="file" id="picture" name="picture" class="textbox" size="35"/>
                <button name="upload" onclick="uploadFile('picture','suspect_picture',${sp.id},'image')">upload
                </button>
                <br>
                <font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
            </td>
        </tr>
        <tr>
            <td align="right">
                รายละเอียดภาพถ่าย :&nbsp;
            </td>
            <td>
                <textarea name="description" cols="35"
                          rows="3" class="textareabig"></textarea>
            </td>
        </tr>
    </table>
</form>
</BODY>
</HTML>
