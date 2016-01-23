<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript" language="JavaScript" src="script/Popup.js"></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<script type='text/javascript' src='<c:url value="/dwr/interface/SelectRegion.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/util.js"/>'></script>
<script type='text/javascript' src='dwr/interface/FileUploader.js'></script>
<script type='text/javascript' src='dwr/interface/Invest.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type='text/javascript'>
	getProvince('province','district','tambol','${ai.province_code}','${ai.district_code}','${ai.subdistrict_code}');
</script>
<script>

function   CheckFileSize()   
 { 
       return false;   
 } 
 
 var right_type=new Array(".gif",".jpg",".jpeg",".png",".bmp");

 var oFileChecker = document.getElementById("image");

function changeSrc(filePicker)
{ 
	
   if(!checkImgType(filePicker.value))
   {
       alert("the file type is not correct");
       return;
   }
   oFileChecker.src = filePicker.value;
}

function checkImgType(fileURL)
{
   var right_typeLen=right_type.length;
   var imgUrl=fileURL.toLowerCase();
   var postfixLen=imgUrl.length;
   var len4=imgUrl.substring(postfixLen-4,postfixLen);
   var len5=imgUrl.substring(postfixLen-5,postfixLen);
   for (i=0;i<right_typeLen;i++)
   {
       if((len4==right_type[i])||(len5==right_type[i]))
       {
           return true;
       }
   }
}
function togglePict(bID,aID){
	mnuB = document.getElementById(bID);
	mnuA = document.getElementById(aID);

	if (mnuB.style.display == 'none'){
		mnuA.style.display = 'none';
		mnuB.style.display = '';
	}else{
		mnuA.style.display = '';
		mnuB.style.display = 'none';
	}
	

}
 function selectLegislation(LID) {

	mnu = document.getElementById(LID);
	//alert(mnu.value);
	if (mnu.value=="4"){
		document.getElementById('cmbProduct').disabled=false;
        document.getElementById('txtProductStar').style.display='';
	}else{
		document.getElementById('cmbProduct').value="";
		document.getElementById('cmbProduct').disabled=true;
        document.getElementById('txtProductStar').style.display='none';
	}
}
function allCheck(chkcont,chk){
	if(!chk.length){
		if(chkcont.checked==true){
			chk.checked = true ;
		}else{		
			chk.checked = false ;
		}
	}else{
		if(chkcont.checked==true){
			for (i = 0; i < chk.length; i++)
				chk[i].checked = true ;
		}else{
			for (i = 0; i < chk.length; i++)
			chk[i].checked = false ;
		}
	}
}

function printReport(){
	var getTrackNo = document.getElementById('track_no').value;
	Reports.ReportUrl(function(data){
		if(data != ""){
			window.open(data + 'ReportName=ILL_P010&getTrackNo=' + getTrackNo + '&vReportType=PDF&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			window.open('process?action=Report&__report=ILL_P010&getTrackNo=' + getTrackNo + '&__formatt=pdf&time=<%=new java.util.Date().getTime()%>' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}
	});
	
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
            });
        }
    });
}

function chkDupInvestNo(){
	var id = "${ai.id}";
	if(id == "") id=0;
	var invest_no1 = document.dataform.invest_no_1.value;
	var invest_no2 = document.dataform.invest_no_2.value;
	var offcode_invest = document.dataform.offcode_invest.value;

	//alert("ID=" + id + " $$$$ invest_no1=" + invest_no1 + "  $$$$$ invest_no2=" + invest_no2 + " $$$$ offcode_invest = " + offcode_invest);
	if(invest_no1 != "" && invest_no2 != "" && offcode_invest != ""){
		Invest.ChkDupApplicationInvest(id, invest_no1 + "/" + invest_no2, offcode_invest, function(data){
			if(data != ""){
				alert(data);
				document.dataform.invest_no_1.select();
			}
		});	
	}
}
</script>
<!-- Body --> <!-- form method="post" action="SaveInvestigationReportAction" -->
	<table width="100%" border="0" cellspacing="0"
		cellpadding="0">
		<tr>

			<td width="100%" align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">

				<tr>
					<td width="1%">&nbsp;</td>
					<td width="99%"><span class="websitename">รายงานการสืบสวน</span>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td height="15">&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input name="btnSave" type="submit" class="barbutton"
						value="บันทึก" onclick="writeTranLog('บันทึกรายงานการสืบสวน')">
					<input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข"
						onclick="writeTranLog('ยกเลิกการแก้ไขข้อมูลรายงานการสืบสวน');window.location.href='<c:url value="${action}" />'; ">
						
					<input name="btnBack" type="button" class="barbutton"
						value="กลับหน้าค้นหา"
						onclick="window.location.href='process?action=Invest';writeTranLog('กลับหน้าค้นหา') ">
					<input name="btnPrint" type="button" class="barbutton"
						value="พิมพ์"
						onClick="printReport();writeTranLog('พิมพ์รายงานการสืบสวน')" <c:if test="${ai.id == null }" >style='display:none'</c:if> >
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td height="25">&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
					<table width="750" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="25" align="right">เลขที่งาน :&nbsp;</td>
							<td><input type="text" id="track_no" name="track_no" class="textView" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
								size="25" value="${ai.track_no}"></td>
							<td align="right">วันที่รายงาน :&nbsp;</td>
							<td>
								<input id="report_date" name="report_date" type="text" class="textdate"
								value="<fmt:formatDate pattern="dd/MM/yyyy" value="${ai.report_date}"  />" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
								<a href="javascript:NewCssCal('report_date','ddmmyyyy')"> 
									<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none">
								</a>
							</td>
						</tr>
						<tr>
							<td height="25" align="right">คดีสืบสวนที่ :&nbsp;</td>
							<td>
								<input type="text" id="invest_no_1" name="invest_no_1" class="textNum" onBlur="chkDupInvestNo();" OnKeyPress="ChkMinusInt(this);" size="6" value="${invest_no_1}"> / 
								<input type="text" id="invest_no_2" name="invest_no_2" class="textNum" OnKeyPress="ChkMinusInt(this);" size="6" value="${invest_no_2}"> 
								<font style="color: red">*</font>
							</td>
							<td align="right">แบบ สส.1 ครั้งที่ :&nbsp;</td>
							<td>
								<input type="text" name="invest_qty" class="textNum" OnKeyPress="ChkMinusInt(this);" size="7" value="${ai.invest_qty}"> 
								<font style="color: red">*</font>
							</td>
						</tr>
						<tr>
							<td width="160" height="25" align="right">ผู้สืบสวน :&nbsp;</td>
							<td width="238">
								<input type="text" id="staff_name_invest" name="staff_name_invest" class="textView" size="30" value="${staff_name_invest}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" > 
								<input type="hidden" id="staff_idcardno_invest" name="staff_idcardno_invest" value="${ai.staff_idcardno_invest}">
								<input type="hidden" id="offcode_invest" name="offcode_invest" value="${ai.offcode_invest}"> 
								<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand"
								onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_invest&id=staff_idcardno_invest&poscode=poscode_invest&offcode=offcode_invest&posname=posname_invest' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />
								<font style="color: red">*</font>
							</td>
							<td width="137" align="right">ผู้สั่งการให้สืบสวน :&nbsp;</td>
							<td width="215">
								<input type="text" id="staff_command_name" name="staff_command_name" class="textView" size="25" value="${staff_command_name }" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
								<input type="hidden" id="staff_idcardno_command" name="staff_idcardno_command" value="${ai.staff_idcardno_command}" >
								<input type="hidden" id="offcode_command" name="offcode_command" value="${ai.offcode_command}">
								<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand"
								onClick="window.open('process?action=Divide_staff_pop&formname=staff_command_name&id=staff_idcardno_command&poscode=poscode_command&offcode=offcode_command&posname=posname_command' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />
								<font style="color: red">*</font>
							</td>
						</tr>
						<tr>
							<td height="25" align="right">ตำแหน่ง :&nbsp;</td>
							<td>
								<input type="text" id="posname_invest" name="posname_invest" class="textView" size="30" value="${posname_invest}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
								<input type="hidden" id="poscode_invest" name="poscode_invest" value="${ai.poscode_invest}"> 
							</td>
							<td align="right">ตำแหน่ง :&nbsp;</td>
							<td>
								<input type="text" id="posname_command" name="posname_command" class="textBox" size="28" value="${ai.posname_command}"  >
								<input type="hidden" id="poscode_command" name="poscode_command" value="${ai.poscode_command}">
							</td>
						</tr>
						<tr>
							<td height="25" align="left" valign="middle" bgcolor="#F5F5F5"><strong>&nbsp;&nbsp;&nbsp;ข้อมูลสืบสวน</strong></td>
							<td colspan="3" bgcolor="#F5F5F5">&nbsp;</td>
						</tr>
						<tr>
							<td height="25" align="right">คดี พ.ร.บ. :&nbsp;</td>
							<td><select name="legislation_id" id="legislation_id"
								style="width: 200"
								OnChange="selectLegislation('legislation_id');">
								<option value="">เลือก</option>
								<c:forEach items="${lglist}" var="lg">
									<option value="${lg.id}"
										<c:if test="${ai.legislation_id == lg.id}"> selected </c:if>>
									${lg.legislation_name}</option>
								</c:forEach>
							</select> <font style="color: red">*</font></td>
							<td align="right">สินค้า :&nbsp;</td>
							<td><select name="product_group_id" id="cmbProduct" style="width:180px" disabled="disabled">
								<option value="" selected>เลือก</option>
								<c:forEach var="dt" items="${dtlist}">
									
									<option value="${dt.group_id}"
										<c:if test="${dt.group_id == ai.product_group_id}"> selected </c:if>>
									${dt.group_name}</option>
								</c:forEach>
							</select> <span id="txtProductStar" style="display: none"><font
								style="color: red">*</font></span></td>
						</tr>
						<tr>
							<td height="25" align="right">วันที่เริ่มทำการสืบสวน :&nbsp;</td>
							<td>
								<input type="text" name="start_date" id="start_date"
								class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" 
								value="<fmt:formatDate pattern="dd/MM/yyyy" value="${ai.start_date}" />" />
								<a href="javascript:NewCssCal('start_date','ddmmyyyy')"> 
									<img src="images/btn_calendar.png" alt="" width="19" height="19"  align="middle" style="border-style: none">
								</a>
							&nbsp;&nbsp;&nbsp; เวลา &nbsp;:&nbsp;
								<input type="text" name="start_time" class="textbox" size="5" maxlength="5"  onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);"
								value="<fmt:formatDate pattern="HH:mm" value="${ai.start_date}"  />">
							<font style="color: red">*</font></td>
							<td align="right">วันที่สิ้นสุดทำการสืบสวน&nbsp;:&nbsp;</td>
							<td><input type="text" name="end_date" id="end_date"
								class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
								value="<fmt:formatDate pattern="dd/MM/yyyy" value="${ai.end_date}" />">
							<a href="javascript:NewCssCal('end_date','ddmmyyyy')"> <img
								src="images/btn_calendar.png" alt="" width="19" height="19"
								align="middle" style="border-style: none"></a>
							&nbsp;&nbsp;&nbsp; เวลา&nbsp;:&nbsp;<input type="text" name="end_time"
								class="textbox" size="5" maxlength="5"  onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);"
								value="<fmt:formatDate pattern="HH:mm" value="${ai.end_date}"/>"></td>
						</tr>
						<tr>
							<td height="25" align="right">มาตรความเชื่อมั่นของแหล่งข่าว
							:&nbsp;</td>
							<td colspan="3">
								<select name="confidence_gauge" id="confidence_gauge" style="width: 400" >
									<option value="" selected>เลือก</option>
									<option value="A" <c:if test="${ai.confidence_gauge=='A'}"> selected </c:if>>A ที่ผ่านมาเชื่อมั่นได้อย่างสมบูรณ์</option>
									<option value="B" <c:if test="${ai.confidence_gauge=='B'}"> selected </c:if>>B ที่ผ่านมาเชื่อถือได้เป็นส่วนใหญ่</option>
									<option value="C" <c:if test="${ai.confidence_gauge=='C'}"> selected </c:if>>C ที่ผ่านมาเชื่อถือไม่ได้เป็นส่วนใหญ่</option>
									<option value="X" <c:if test="${ai.confidence_gauge=='X'}"> selected </c:if>>X ไม่สามารถตัดสินได้</option>
								</select> 
								<font style="color: red">*</font>
							</td>
						</tr>
						<tr>
							<td align="right">ค่าของเนื้อข่าว :&nbsp;</td>
							<td colspan="3">
								<select name="news_value" id="news_value" style="width: 400">
									<option selected>เลือก</option>
									<option value="1" <c:if test="${ai.news_value == 1 }"> selected </c:if>>1 รู้ว่าเป็นความจริงโดยปราศจากข้อสงสัย</option>
									<option value="2" <c:if test="${ai.news_value == 2 }"> selected </c:if>>2 ข่าว เป็นที่รู้จากแหล่งแต่ยังไม่ได้รายงานให้เจ้าหน้าที่</option>
									<option value="3" <c:if test="${ai.news_value == 3 }"> selected </c:if>>3 ข่าวไม่เป็นที่รู้จักจากแหล่งแต่รู้มาจากผู้อื่นและได้มีการบันทึกไว้แล้ว</option>
									<option value="4" <c:if test="${ai.news_value == 4 }"> selected </c:if>>4 ไม่สามารถตัดสินได้</option>
								</select>
								<font style="color: red">*</font></td>
						</tr>
						<tr>
							<td height="25" align="right">&nbsp;</td>
							<td>&nbsp;</td>
							<td align="right">&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td height="25" align="left" valign="middle" bgcolor="#F5F5F5"><strong>&nbsp;&nbsp;&nbsp;สถานที่ทำการสืบสวน</strong></td>
							<td colspan="3" bgcolor="#F5F5F5">&nbsp;</td>
						</tr>
						<tr>
							<td height="25" colspan="4" align="left" valign="top">
							<table width="696" border="0" cellpadding="0" cellspacing="0">
								<tr>
									<td width="160" height="25" align="right">ละติจูด&nbsp;:&nbsp;</td>
									<td width="536"><input name="coordinate_x" type="text"
										class="textNum" OnKeyPress="ChkMinusDbl(this);" 
										size="7" value="${ai.coordinate_x}">
									&nbsp;&nbsp;ลองติจูด&nbsp;:&nbsp; <input name="coordinate_y"
										type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);"
										 size="7" value="${ai.coordinate_y}"></td>
								</tr>
								<tr>
									<td height="25" align="right">เลขที่ :&nbsp;</td>
									<td><input name="address_no" type="text" class="textbox"
										size="4" value="${ai.address_no}">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
									<input name="moo" type="text" class="textNum"
										OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3"
										value="${ai.moo}"></td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right" valign="top">อาคาร/สถานที่
									:&nbsp;</td>
									<td><input name="address_name" type="text" class="textbox"
										size="58" value="${ai.address_name }"></td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
									<td><input name="soi" type="text" class="textbox"
										value="${ai.soi }"> &nbsp;&nbsp;ถนน&nbsp;:&nbsp; <input
										name="road" type="text" class="textbox" size="25"
										value="${ai.road }"></td>
								</tr>
								<tr>
									<td height="25" align="right">จังหวัด :&nbsp;</td>
									<td><select id='province' name="province_code"
										style="width: 200px"
										onchange="getDistrict('district','tambol',this.value)"></select>
									</td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right">อำเภอ :&nbsp;</td>
									<td><select id='district' name="district_code"
										style="width: 200px"
										onchange="getTambol('tambol',this.value,'')"></select></td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right">ตำบล :&nbsp;</td>
									<td><select id='tambol' name="subdistrict_code"
										style="width: 200px"></select></td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="30" align="right">รหัสไปรษณีย์&nbsp;:&nbsp;</td>
									<td><input name="zipcode" type="text" class="textNum"
										OnKeyPress="ChkMinusInt(this);" size="10" maxlength="5"
										value="${ai.zipcode}"> &nbsp;&nbsp;&nbsp; โทรศัพท์
									:&nbsp;<input name="tel" type="text" class="textbox" size="10"
										value="${ai.tel }"></td>
								</tr>
								<tbody id="map_picture" <c:if test="${ai.id == null }" >style='display:none'</c:if> >
									<tr>
										<td align="right" valign="top" OnClick="togglePict('picB','picA');">รูปภาพแผนที่&nbsp;:&nbsp;</td>
										<td colspan="3" valign="top">
											<c:if test="${ai.id != null}">
												<img src="<c:url value='/process?action=GetImage'/>&table=APPLICATION_INVEST&id=${ai.id}" id="image" border="0" width="100" height="100">
											</c:if>&nbsp;
										</td>
									</tr>
									<tr>
										<td align="right" valign="top">เปลี่ยนรูปภาพ&nbsp;:&nbsp;</td>
										<td colspan="3" valign="top">
										<input name="fle_map_picture" type="file" class="textbox" size="35" id="fle_map_picture" > 
										<input name="upload_map" type="button" value="Upload" onclick="uploadFile('fle_map_picture','application_invest',${ai.id},'image')" />
										<br /><font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
										</td>
									</tr>
							
									<tr>
										<td height="60" align="right" valign="top">รายละเอียดเกี่ยวกับแผนที่&nbsp;:&nbsp;</td>
										<td colspan="3"><textarea name="map_desc" cols="35"
											rows="3" class="textareabig">${ai.map_desc }</textarea></td>
									</tr>
								</tbody>
							</table>
							</td>
						</tr>
						<tr>
							<td height="25" align="right">&nbsp;</td>
							<td>&nbsp;</td>
							<td align="right">&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td height="25" colspan="4" align="left" valign="middle" bgcolor="#F5F5F5"><strong>&nbsp;&nbsp;&nbsp;ผู้ร่วมรับผิดชอบ</strong></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td><span class="spanLink"
								onClick="aatopenmodal('aatTable')">เพิ่มใหม่</span> | <span
								class="spanLink" onClick="aatget_check_value('aatTable')">ลบรายการที่เลือก</span>

							</td>
						</tr>
						<tr>
							<td height="25" align="right" valign="top">&nbsp;</td>
							<script type="text/javascript">

var aatmaxrow=1; // jsp  Count  config
var aatstartrow=2;
var aateditrow = -1;
var aateditna = 0;

function aatinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12)
{
	

var row;
var x=document.getElementById(myTable).insertRow(aatmaxrow);
aatmaxrow++;
row = aatmaxrow - 1;
var y1=x.insertCell(0);
var y2=x.insertCell(1);
var y3=x.insertCell(2);
var y4=x.insertCell(3);
var y5=x.insertCell(4);
var y6=x.insertCell(5);
var y7=x.insertCell(6);


var exp = new Date();
var s = exp.getTime();


y1.innerHTML="<input readonly class='textboxlist' size='1' name='aattc_id' value='" + row + "' />";
y2.innerHTML="<input type=\"checkbox\" name=\"aatcheckbox\" value=\"\"><input type=\"hidden\" name=\"aatref_id\" value=\""+s+"\" />";
y3.innerHTML= data9;
y4.innerHTML= data3;
y5.innerHTML= data8+
"<input type=\"hidden\" name=\"aii_id\" value=\""+data1+"\">"
+"<input type=\"hidden\" name=\"aii_idcard_no\" value=\""+data5+"\">"
+"<input type=\"hidden\" name=\"aii_poscode\" value=\""+data6+"\">"
+"<input type=\"hidden\" name=\"aii_offcode\" value=\""+data7+"\">"


}
function aatdelRow(myTable)
{
	if (aatmaxrow>1)
	{
		var x=document.getElementById(myTable).deleteRow(myTable,aatmaxrow-1);
		aatmaxrow--
	}
}

function aatalternate(id){
	if(document.getElementsByTagName){
		var table = document.getElementById(id);
		var rows = table.getElementsByTagName("tr");
   		for(i = 0; i < rows.length; i++){
 //manipulate rows
     		if(i % 2 == 0){
       			rows[i].className = "even";
     		}else{
      			rows[i].className = "odd";
     		}
   		}
 	}
}

function aatrerun_id()
{
	if (aatmaxrow == 2)
	{
		document.dataform.aattc_id.value=1;
	}
	for (var i=0; i < document.dataform.aattc_id.length; i++)
	{
		document.dataform.aattc_id[i].value=i+1;
	}
}

function aatdelRown(myTable,Rown)
{
	var x=document.getElementById(myTable).deleteRow(Rown);
	aatmaxrow--
}

function aatopenmodal(myTable)
{
	writeTranLog('เพิ่มคณะผู้จับกุม');
	var  dup=0;
	var data = window.showModalDialog('process?action=Divide_staff_poplist', self , 'dialogWidth=700px,Height=400px');
	if(data != null){
		//aii_idcard_no
		for (var i=0; i < data.length; i++){
			dup=0;
			if (aatmaxrow>1){
				if (aatmaxrow == 2){
					if (document.dataform.aii_idcard_no.value==data[i][5])
						dup=1;
				}else{
					for (var j=0; j < document.dataform.aii_idcard_no.length; j++){
						if (document.dataform.aii_idcard_no[j].value==data[i][5])
							dup=1;
					}
				}
				if(document.dataform.staff_idcardno_invest.value==data[i][5]){ //กรณีเลือกรายการมาเป็นชื่อเดียวกับชื่อผู้สืบสวน
					dup = 1;
				}
			}
			if(dup==0){
	    		aatinsRow(myTable,aatmaxrow,"",data[i][2],data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8],data[i][9],data[i][10],data[i][11]);
			}
	    }
	
	}
}


function aatget_check_value(myTable)
{
var c_value = "";
var x=aatmaxrow;

if(aatmaxrow != 1)
{
		if ( aatmaxrow == 2  )
		{
			if(document.dataform.aatcheckbox.checked)
			{
				document.getElementById(myTable).deleteRow(1);
				aatmaxrow--;
				writeTranLog('ลบรายการคณะผู้จับกุม');
			}
		}else{
		for (var i=0; i < document.dataform.aatcheckbox.length; i++)
   		{

			 if (document.dataform.aatcheckbox[i].checked)
      			{
     
					document.getElementById(myTable).deleteRow(i+1);
					i--;
					aatmaxrow--;
     			 }
   			}
  			
		if(x!=aatmaxrow)
		{
			    writeTranLog('ลบรายการคณะผู้จับกุม');
			    aatrerun_id();
		}
  			
		}
	}
}


function aatrender(myTable)
{
 for (i=1;i<=aatdata1.length-1;i++)
    {
        aatinsRow(myTable,i,aatdata1[i],aatdata2[i],aatdata3[i],aatdata4[i],aatdata5[i],aatdata6[i],aatdata7[i],aatdata8[i],aatdata9[i],aatdata10[i],aatdata11[i],aatdata12[i]);
    }
}


var aatdata1 =new Array();
var aatdata2 =new Array();
var aatdata3 =new Array();
var aatdata4 =new Array();
var aatdata5 =new Array();
var aatdata6 =new Array();
var aatdata7 =new Array();
var aatdata8 =new Array();
var aatdata9 =new Array();
var aatdata10 =new Array();
var aatdata11 =new Array();
var aatdata12 =new Array();


function aatCheck(chkcont,chk)
{
	if(chkcont.checked==true){
		for (i = 0; i < chk.length; i++)
			chk[i].checked = true ;
	}else{
		for (i = 0; i < chk.length; i++)
			chk[i].checked = false ;
	}
}

</script>
							<td colspan="3">
							<table id="aatTable" class="tableList" width="95%" border="0"
								cellspacing="0" cellpadding="0">
								<tr class="TblHeaderColumn AlignCenter">
									<td width="50">ลำดับที่</td>
									<td width="30"><input type="checkbox" name="checkbox"
										value="checkbox"
										onClick="allCheck(this,document.dataform.aatcheckbox);"></td>
									<td width="150">ชื่อ-สกุล</td>
									<td width="150">ตำแหน่ง</td>
									<td width="200">สังกัด</td>
								</tr>
							</table>
							<c:forEach items="${aiilist}" var="aat" varStatus="i">
								<script>
									 aatdata1[${i.count}] = "${aat.id}";
									 aatdata5[${i.count}]  ="${aat.staff_idcard_no}";
									 aatdata6[${i.count}]  ="${aat.poscode_staff}";
									 aatdata7[${i.count}]  ="${aat.offcode_staff}";
									 aatdata8[${i.count}]  ="${aat.offname}";
									 aatdata3[${i.count}]  ="${aat.posname}";
									 aatdata9[${i.count}] ="${aat.title_name}"+"${aat.first_name}"+" "+"${aat.last_name}";
								</script>
							</c:forEach></td>
						</tr>
						<tr>
							<td height="25" align="right">&nbsp;</td>
							<td>&nbsp;</td>
							<td align="right">&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td colspan="4" height="25" align="left" valign="middle"
								bgcolor="#F5F5F5"><strong>&nbsp;&nbsp;&nbsp;รายละเอียดที่เกิดขึ้นในการสืบสวน
							มีดังนี้</strong></td>
						</tr>
						<tr>
							<td height="25" align="right" valign="top">&nbsp;</td>
							<td colspan="3" width="600" valign="top"><textarea 
								name="invest_desc" rows="6" cols="70" 
								id="invest_desc">${ai.invest_desc}</textarea>
							</td>
						</tr>
					</table>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>


			</table>
			</td>
		</tr>
	</table>
	<!--   /form> -->

<script>
aatrender('aatTable');
selectLegislation('legislation_id');
</script>