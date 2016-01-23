<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/FileUploader.js'></script>
<script type="text/javascript" >
	function uploadFile(image_id, table, id) {
	    if(image_id.value != ""){
	    	var image = dwr.util.getValue(image_id);
	    //FileUploader.checkUploadSize(image, function(data) {
	    //   if (!data) {
	    //        alert("ไฟล์ size มีขนาดเกิน กรุณาเลือกไฟล์ใหม่ ");
	    //        dwr.util.setValue(image_id, "");
	    //    } else {
	            //dwr.util.setValue(preview_id, "images/wait.gif");
	            FileUploader.uploadDocFile(image, table, id, function(data) {
	            //    dwr.util.setValue(preview_id, "<c:url value='/process?action=GetImage'/>&table=" + table + "&id=" + id + "&rnd" + Date());
	            //    jQuery("#" + preview_id).css('display', '');
	            });
	    //    }
	    //});
	    }else{
			alert("คุณยังไม่ได้เลือกไฟล์ที่ต้องการ Upload");
		}
	}

	function openFile(table,id, preview_id){
		//window.open('process?action=Divide_staff_pop&formname=sue_staff_name&id=sue_staff_idcardno&poscode=sue_poscode&offcode=sue_offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');
		window.open("process?action=GetImage&table=" + table + "&id=" + id + "&rnd" + Date(), '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');
		//dwr.util.setValue(preview_id, "<c:url value='/process?action=GetImage'/>&table=" + table + "&id=" + id + "&rnd" + Date());
	}
</script>

<form method="post" name="dataform" action="<c:url value="/process?action=User&cmd=UploadFile" />" >
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
       <tr>
          <td width="100%" align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
               <tr><td colspan="2">&nbsp;</td></tr>
               <tr>
                 <td width="1%">&nbsp;</td>
                 <td width="99%"><span class="websitename">ทดสอบ FileUpLoad</span></td>
               </tr>
               <tr><td colspan="2">&nbsp;</td></tr>
               <tr>
					<td>&nbsp;</td>
					<td>
						<input  name="txtFile" type="file" size="100" />
					</td>
				</tr>
               <tr>
					<td>&nbsp;</td>
					<td>
						<input name="btnUpload" type="button" class="barbutton" value="Upload"
						onclick="uploadFile(txtFile,'USERS',78);writeTranLog('Upload File');" />
						<input name="btnOpenFile" type="button" class="barbutton" value="Open" 
						onclick="openFile('USERS',78,photo_img);writeTranLog('Open File');" />
					</td>
				</tr>
               <tr>
               		<td>&nbsp;</td>
               		<td>
               			<img id="photo_img" border="0" />
               		</td>
               </tr>
            </table>
          </td>
       </tr>
    </table>
</form>