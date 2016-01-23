<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<table width="100%" height="450" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%" align="center" valign="middle" background="images/bg_logo.jpg">
<!-- test -->
<script type='text/javascript' src='dwr/interface/Demo.js'></script>
<script type='text/javascript' src='dwr/interface/Pke_Compare.js'></script>
<script type='text/javascript' src='dwr/interface/SelectRegion.js'></script>
<script type='text/javascript' src='<c:url value="/dwr/interface/FileUploader.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/interface/DutyTable.js"/>'></script>

<script type="text/javascript">
function update() {
  	var name = dwr.util.getValue("demoName");
  	
 	Demo.sayHello(name, function(data) {
    	//dwr.util.setValue("demoReply", data);
    	$('demoReply').innerHTML=data;
  	});
}
function testxx(){
	Pke_Compare.getShareMoney("TN1002005300002", 1, 5, "N", 10000, function(data) {
    	alert(data[0]);
    	alert(data[1]);
    	alert(data[2]);
    	alert(data[3]);
    	alert(data[4]);
    	alert(data[5]);
  	});
}
function runReport(){
	var url = "<c:url value="/process?action=Report"/>";
	if( document.report.param.value != "" )
		document.report.action = url+"&"+document.report.param.value;
	document.report.submit();
}
function uploadFile(image_id,table,id,preview_id){
	var image = dwr.util.getValue(image_id);
	FileUploader.checkUploadSize(image, function(data) {
		if( !data ){
			alert("ไฟล์ size มีขนาดเกิน กรุณาเลือกไฟล์ใหม่ ");
			dwr.util.setValue(image_id,"");
		}else{
			dwr.util.setValue(preview_id,"images/wait.gif");
			FileUploader.uploadFile(image,table,id, function(data) {
				dwr.util.setValue(preview_id,"<c:url value='/process?action=GetImage'/>&table="+table+"&id="+id+"&rnd"+Date());
			});
		}
	});
}
function uploadPreview(uploadImage,preview_id) {
	var image_id = uploadImage['id'];
	var image = dwr.util.getValue(image_id);
	FileUploader.checkUploadSize(image, function(data) {
		if( !data ){
			alert("ไฟล์ size มีขนาดเกิน กรุณาเลือกไฟล์ใหม่ ");
			dwr.util.setValue(image_id,"");
			dwr.util.setValue(preview_id,"");
		}else{
			FileUploader.uploadPreview(image,function(data) {
			    dwr.util.setValue(preview_id, data);
			});
		}
	});
}
function checkUploadSize(uploadImage){
	var image_id = uploadImage['id'];
	var image = dwr.util.getValue(image_id);
	FileUploader.checkUploadSize(image, function(data) {
		if( !data ){
			alert("ไฟล์ size มีขนาดเกิน กรุณาเลือกไฟล์ใหม่ ");
			dwr.util.setValue(image_id,"");
		}
	});
}

function getDutyTable(id,dutyTable_sel,packageSize_id,sizePackage_sel){
	DutyTable.getDutyTable(function(data){
		dwr.util.addOptions(id,{"":"โปรดเลือก"});
		dwr.util.addOptions(id,data,"duty_code","duty_name");
		dwr.util.setValue(id,dutyTable_sel);
		getSizePackage(dutyTable_sel,packageSize_id,sizePackage_sel);
	});
}
function getSizePackage(dutyTable_sel,id,sizePackage_sel){
	DutyTable.getSizePackage(dutyTable_sel,function(data){
		dwr.util.removeAllOptions(id);
		dwr.util.addOptions(id,{"":"โปรดเลือก"});
		dwr.util.addOptions(id,data,"size_code","size_desc");
		dwr.util.setValue(id,sizePackage_sel);
	});
}
//getDutyTable('dutyTable',null,'sizePackage',null);
</script>
<p>
  Name:
  <input type="text" id="demoName"/>
  <input value="Send" type="button" onclick="update()"/>
  <br/>
  Reply: <span id="demoReply"></span>
</p>
	<input type="button" value="test sharemoney" onclick="testxx()"/><br/>
	<input type="button" value="test write TranLog" onclick="writeTranLog('ทดสอบ')"/><br/>
	<a href="web/index.jsp" target="_blank">หน้า Page List Insert Update Delete </a><br/>
	<a href="bindExample.jsp" target="_blank">Bind Example</a><br/>
	<a href="process?action=BindExample&cmd=add&id=75" target="_blank">Bind Example2</a><br/>
	<a href="process?action=BindExample&cmd=export">download Excel Test</a><br/>
	<hr>
	<input type="button" value="เลือกจังหวัด อำเภอ ตำบล" onclick="myPopup('test2/popup.jsp')"/> 
	<hr>
	uploadPreview<br>
	<img src="javascript:void(0);" id="image" width="200" height="200"><br/>
	<input type="file" id="uploadImage" onchange="uploadPreview(this,'image')"/>
	<hr>
	uploadImage To Table<br>
	<img id="image2" width="200" height="200" src="<c:url value='/process?action=GetImage'/>&table=suspect&id=16"><br/>
	<input type="file" id="uploadImage2"/>
	<button onclick="uploadFile('uploadImage2','suspect',16,'image2')">Upload file</button>
	<hr>
<table border="1">
<tr><td><h2>File Upload ของใหม่น่ะจ๊ะ</h2>
<form name="dataform" id="dataform" method="post" enctype="multipart/form-data" action="data.jsp">
  <iframe name="hiddenframe" style="display:none" >Loading...</iframe>
  To:
  <input name="txt1333" type="text"  size="60" maxlength="60" />
  <br />
  <br />
  Subject:
  	<input name="txt2" type="text"  size="60" maxlength="60" />
		<font color="red">upload Img Preview</font><br>
		<img src="javascript:void(0);" id="upImage" width="200" height="200"><br/>
		<input type="file" id="fileImg" name="map_picture" onchange="uploadImgPreview(this,'upImage','APPLICATION_INVEST');"/>
		<hr>
		<font color="red">upload Img To Database</font><br>
		<img id="upImage2" width="200" height="200" src="<c:url value='/process?action=GetImage'/>&table=suspect&id=16&rnd=<%=System.currentTimeMillis()%>"><br/>
		<input type="file" id="fileImg2" name="link_photo" />
		<input type="button" onclick="uploadImg('fileImg2','suspect',16,'upImage2');" value="ok">
</form>
</td></tr>
</table>

	<select id="dutyTable" style="width:170px" onchange="getSizePackage(this.value,'sizePackage',null)"></select><br/>
	<select id="sizePackage" style="width:170px"></select>
	<hr>
	<h2>Run Report</h2>
	<form name="report" action="" target="_blank" method="post">
		report Name:<input type="text" name="__report" value="report2"/><br/>
		export Type :<input type="radio" name="__formatt" value="pdf" checked="checked">PDF,
		<input type="radio" name="__formatt" value="excel">Excel,
		<input type="radio" name="__formatt" value="doc">MS Word <br/>
		report parameter:<input type="text" name="param" value="param1=XXX"/>ex: sex=3&name=boy<br/>
		<input type="button" value="Run Report" onclick="runReport()"/>
	</form>
<!-- test -->
		</td>
	</tr>
</table>