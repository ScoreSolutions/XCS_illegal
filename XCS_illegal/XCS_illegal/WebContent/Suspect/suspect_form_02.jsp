<%@ page contentType="text/html; charset=UTF-8" %>

<%@ page import="com.ko.util.SelectionUtility" %>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="com.ko.model.Suspect" %>


<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<script type="text/javascript" src="script/effect.js" ></script>
<script type="text/javascript" language="JavaScript">

	function toggleHidden(mID, btnID) { 
		document.getElementById('address').style.display='none';
		document.getElementById('Relative').style.display='none';
		document.getElementById('btnAddressOther').style.background='#D4D0C8';
		document.getElementById('btnRelative').style.background='#D4D0C8';
		mnu = document.getElementById(mID); 
		btn = document.getElementById(btnID);
		if (mnu.style.display == 'none'){
			mnu.style.display ='';
			btn.style.background='#FFCC33';
		}else{
			mnu.style.display ='none';
		}
	}
	function togglePict(bID,aID){
		mnuB = document.getElementById(bID);
		mnuA = document.getElementById(aID);
		if (mnuB.style.display == 'none'){
			mnuA.style.display = 'none';
			mnuB.style.display = '';
		}else {
			mnuA.style.display = '';
			mnuB.style.display = 'none';
		}
	}
	function MM_goToURL() { //v3.0
	  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
	  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
	}
	
</script>

<%@ include file="../Templates/header.jsp" %>


<% // EsQTwP5MYQdHV6HaDaAUrgstwBkBxb3tUShy5BYCbT2mpasEru %>
<%

	request.setCharacterEncoding("UTF-8");

	String path = com.ko.util.FormUtility.getScriptReferencePath(request);
	String revisionCommand = "";
	Long rSuspectNo = System.currentTimeMillis();
	{
		String suspectNo = request.getParameter("suspect_no");
		if(suspectNo != null){
			rSuspectNo = Long.valueOf(suspectNo);
			BigDecimal no = new BigDecimal(suspectNo);
			Suspect s = new SelectionUtility().getSuspect(no);
			java.util.HashMap<String,String> revisionMap = com.ko.util.FormUtility.createRevisionMapFromObject(s);
			revisionCommand = com.ko.util.FormUtility.generateRealRevisionCommand(revisionMap);
		}
	}
	response.setContentType("text/html;charset=utf-8");
%>

<script>

	var suspectAddressAr = [];//new Array();
	var suspectRelativeAr = [];//new Array();

	var suspectNo = "<%=rSuspectNo%>";
	
	var indexer = new Object();
	indexer.address = 1;
	indexer.relative = 1;


	function KO_reorderIndex(tableName, targetId){
		jQuery.find(targetId).each(function(i){;
			//jQuery(this).attr("innerHTML", i+1);
			this.innerHtml = i+1;
		});
	}
	
	function KO_doDeleteSuspectAddress(caller){
		var confirm = window.confirm("ยืนยันการลบข้อมูล?");
		if (!confirm){
			return false;
		}
		
		var data = "0x11abc=0x11abc";
		jQuery("input[name=address_id]:checked").each(function(){
			data = data + "&address_id=" + this.value;
		});
		data = data + "&target=SUSPECT_ADDRESS";

		
		var url = "DeleteSuspectDetail.do";
		jQuery.post(url,data, function(result){});

		jQuery("[name=address_id]:checked").each(function(){
			jQuery("#address_" + this.value).remove();
		});

		KO_reorderIndex("#suspect_address_table", "#address_index");
	}

	function KO_doDeleteSuspectRelative(caller){
		var confirm = window.confirm("ยืนยันการลบข้อมูล?");
		if (!confirm){
			return false;
		}
		var data = jQuery("form#relative_pager").serialize();
		data = data + "&target=SUSPECT_RELATIVE";
		var url = "DeleteSuspectDetail.do";
		jQuery.post(url,data, function(result){});

		jQuery("[name=relative_id]:checked").each(function(){
			jQuery("#relative_" + this.value).remove();
		});
	}

	function openAddressPopup(){
		//data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');
		var data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'dialogWidth=700px,dialogHeight=400px');
		if(data){
			data["index"] = indexer.address;
			KO_appendAddressRow("suspect_address_table", data);
			suspectAddressAr[suspectAddressAr.length+1] = data;
			indexer.address = indexer.address + 1;
		}else{
		}
	}
	
	function openRelativePopup(){
		//data = window.showModalDialog('Popup/lawbreaker_relative_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=600,top=220,left=400,modal=yes');
		var data = window.showModalDialog('Popup/lawbreaker_address_form.jsp' , '_blank' , 'dialogWidth=700px,dialogHeight=400px');
		if(data != null){
			data["index"] = indexer.relative;
			KO_appendRelativeRow("suspect_relative_table", data);
			suspectRelativeAr[suspectRelativeAr.length+1] = data;
			indexer.relative = indexer.relative + 1;
		}
	}
	
	function submitForm(){
		//jQuery.post("test.jsp", { name: "John", time: "2pm" } );
		//var post = jQuery('#foreign_form').serialize();   
		var control = document.getElementsByName("suspect_passport")[0];
		var key = control.value;

		if (key == "") 
		{
			alert("กรุณากรอกเลขที่หนังสือเดินทาง");
			control.focus();
			return false;
		}
		//-- serailize form data
		var data = jQuery('form#foreign_suspect_form').serialize();
		data = data + "suspect_no=<%=rSuspectNo%>";
		
		jQuery.post("SaveForeignSuspectAction", data , function(output){
			var message = jQuery.parseJSON(output);
			var code = message.id;
			if (code == "DUP_PASSPORT"){
				alert("เลขที่หนังสือเดินทางซ้ำ");
				return false;
				
			}else if (code == "NOTHING"){
				// do nothing
			}}
		);

		try{
			for(var i in suspectAddressAr){
				if( i != "each" ){
					if( i != "forEach" ){
						var a = suspectAddressAr[i];
						var data = a["serialize"];
						var url = "SaveSuspectDetailAction.do?action_=SAVE_SUSPECT_ADDRESS&suspect_no=<%=rSuspectNo%>";
						
						jQuery.post(url, data, function(data) { 
						   //alert(data);
						});
					}
				}
			}
	
			for(var i in suspectRelativeAr){
				if( i != "each" ){
					if( i != "forEach" ){
						//alert(i);
						var a = suspectRelativeAr[i];
						var data = a["serialize"];
						var url = "SaveSuspectDetailAction.do?action_=SAVE_SUSPECT_RELATIVE&suspect_no=<%=rSuspectNo%>";
						
						jQuery.post(url, data, function(data) { 
						   //alert(data);
						});
					}
				}
			}

			// upload image	
			jQuery("#foreign_form").submit();

			// are you stay here?
			var ans = KO_saveSuspectConfirm();
			if(ans){ // go to your location
				window.location = "Suspect.jsp?action=CompanySave&suspect_no=<%=rSuspectNo%>";
			}else{ // i stay here, render new image now.
				var time = new Date().getTime();
				jQuery("img#suspect_photo").attr("src","RenderImage?suspect_no=" + suspectNo + "&abc0x11=" + time);
			}

		}catch(err){
			alert(err.message);
		}
		
	}
	function KO_fixDistrictListBox(revisionCommand){
		// make sure province,districk and subdistrick display correctly
		var correntProvinceCode = jQuery("select[name=province_code]").val();
		applyDistrictOption("<%=path%>", "district_code", correntProvinceCode);
		eval(revisionCommand);

		var correntDistrictCode = jQuery("select[name=district_code]").val();
		applySubdistrictOption("<%=path%>", "subdistrict_code", correntDistrictCode);
		eval(revisionCommand);
	}
	
	jQuery(document).ready(function() {
		applyProvinceAction("<%=path%>", "province_code", "district_code", "subdistrict_code" );
		applyContinentAction("<%=path%>", "continent_code", "country_code");
		applyNationalityOption("<%=path%>", "nation_id");
		applyRaceOption("<%=path%>", "race_id");
		applyCountryOption("<%=path%>", "passport_country");
		applyReligionOption("<%=path%>", "religion_id");
		applyTitleOption("<%=path%>", "title_code",1);

		// -- date time
		jQuery("#birth_date").css("border","none");
		jQuery("#birth_date").wrap('<a href="javascript:NewCssCal(\'birth_date_field\',\'ddmmyyyy\')"></a>');

		jQuery("#date_in").css("border","none");
		jQuery("#date_in").wrap('<a href="javascript:NewCssCal(\'date_in_field\',\'ddmmyyyy\')"></a>');

		jQuery("#date_out").css("border","none");
		jQuery("#date_out").wrap('<a href="javascript:NewCssCal(\'date_out_field\',\'ddmmyyyy\')"></a>');

		
		eval('<%=revisionCommand%>');
		KO_fixDistrictListBox('<%=revisionCommand%>');

		var birthDate = document.getElementsByName("birth_date")[0].value;
		if(birthDate){
			var t = birthDate.split("/");
			jQuery("#age").attr("innerHTML",(new Date().getYear()+1900+543)- t[t.length-1]);
			alert(new Date().getYear()+1900);
		}
	 });
	 
</script>	

<iframe name="upload_picture_frame" src="xxx" style="display:none;"></iframe>

<form method="POST" action="SaveSuspectPicture?suspect_no=<%=rSuspectNo%>" id="foreign_form"
	target="upload_picture_frame" enctype="multipart/form-data" >
	
	
	<input type="text" name="suspectNo" style="display:none;" value="<%=rSuspectNo%>">

		<!-- Body -->
		
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยชาวต่างชาติ</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                
                <!-- 
					<input name="btnSave"  type="button" class="barbutton" value="บันทึก" 
                                onClick="MM_goToURL('parent','Suspect.jsp?action=EngSave');
					return document.MM_returnValue">
					<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" >
					<input name="btnBack"  type="button" class="barbutton" value="กลับหน้าค้นหา" >
				 -->
				 
				 	<input name="btnSave"  type="button" class="barbutton" value="บันทึก" onClick="submitForm()"/>
					<input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข" onClick="MM_goToURL('parent','Suspect.jsp?action=EngForm'); return document.MM_returnValue"> 
					<input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onClick="MM_goToURL('parent','Suspect.jsp?action=suspectList02'); return document.MM_returnValue">
				 
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="706" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td bgcolor="#F5F5F5">&nbsp;</td>
                    <td  colspan="4" align="left" bgcolor="#F5F5F5"><strong>ข้อมูลส่วนตัว</strong></td>
                  </tr>
                  <tr>
                    <td width="2%">&nbsp;</td>
                    <td width="20%"  align="right">เลขที่หนังสือเดินทาง :&nbsp;</td>
                    <td width="30%"><input type="text" name="suspect_passport" class="textbox"></td>
                    <td width="15%" align="right">ออกโดยประเทศ :&nbsp;</td>
                    <td width="33%">
                        <select name="passport_country" id="sDistrict" style="width:170px;" >
                             <option value="x">ลาว</option>
                             <option value="x" >กัมพูชา</option>
                             <option value="x">เวียตนาม</option>
                             <option value="x" selected>อังกฤษ</option>
                        </select>
                    </td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ชื่อ :&nbsp;</td>
                    <td colspan="3">
						<select name="title_code">
                            <option> </option>
                            <option>Mr.</option>
                            <option>Mrs.</option>
                            <option>Miss</option>
                          </select>
						<input name="first_name" type="text" class="textbox" size="12">&nbsp;
						ชื่อกลาง :<input name="middle_name" type="text" class="textbox" size="12">&nbsp;
						นามสกุล :<input name="last_name" type="text" class="textbox" size="12">
					</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ชื่ออื่นๆ :&nbsp;</td>
                    <td><input type="text" name="other_name" class="textbox"></td>
                    <td  align="right">โทรศัพท์ :&nbsp; </td>
                    <td><input name="mobile" type="text" class="textbox" ></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">วันเดือนปีเกิด :&nbsp;</td>
                    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
						<td width="48%"><input name="birth_date" type="text"
										id="birth_date_field" class="textdate" size="10" ></td>
									<td width="12%"><img id="birth_date" src="images/btn_calendar.png"
										width="19" height="19"></td>
                        <td width="40%">อายุ <strong id="age"></strong> ปี</td>
                      </tr>
                    </table></td>
                    <td align="right">Email :&nbsp;</td>
                    <td><input type="text" name="email" class="textbox"></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">เพศ :&nbsp;</td>
                    <td>
						<input name="sex" type="radio" value="0" checked>ชาย&nbsp;
						<input name="sex" type="radio" value="1">หญิง&nbsp;&nbsp;&nbsp;&nbsp;
					</td>
                    <td align="right">เชื้อชาติ :&nbsp;</td>
                    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                          <td width="29%"><select name="race_id">
                            <option value="1"> </option>
                              <option value="0">ไทย</option>
                              <option >ลาว</option>
                              <option>พม่า</option>
                              <option>กัมพูชา</option>
                              <option>ไนจีเรีย</option>
                            </select>                          </td>
                          <td width="21%" align="right">สัญชาติ :&nbsp;</td>
                          <td width="50%"><select name="nation_id" class="select">
                            <option value="0"> </option>
                              <option>ไทย</option>
                              <option>ลาว</option>
                              <option>พม่า</option>
                              <option>กัมพูชา</option>
                              <option>ไนจีเรีย</option>
                          </select></td>
                        </tr>
                    </table></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">กรุ๊ปเลือด :&nbsp;</td>
                    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                          <td width="23%"><select name="blood_type">
                              <option> </option>
                              <option value="O">โอ</option>
                              <option value="A">เอ</option>
                              <option value="B">บี</option>
                              <option value="AB">เอบี</option>
                            </select>                          </td>
                          <td width="31%" align="right">สถานภาพ :&nbsp;</td>
                          <td width="46%"><select name="marital_status" class="select">
                            <option> </option>
                              <option value="1">โสด</option>
                              <option value="2">หม้าย</option>
                              <option value="3">หย่าร้าง</option>
                              <option value="4">สมรส</option>
                          </select></td>
                        </tr>
                    </table></td>
                    <td align="right">ศาสนา :&nbsp;</td>
                    <td><select name="religion_id" class="select">
                      <option> </option>
                        <option value="0">พุทธ</option>
                        <option value="1">คริสต์</option>
                        <option vlaue="2">อิสลาม</option>
                    </select></td>
                  </tr>

                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ส่วนสูง :&nbsp;</td>
                    <td><input type="text" name="height" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="5">ซม.</td>
                    <td align="right">อาชีพ :&nbsp; </td>
                    <td><input type="text" name="career" class="textbox"></td>
                  </tr>

                  <tr>
                    <td>&nbsp;</td>
                    <td align="right" valign="top">รายละเอียดเพิ่มเติม&nbsp;:&nbsp;</td>
                    <td colspan="3"><textarea name="description" cols="35" rows="3" class="textareabig"></textarea></td>
                    </tr>
 						<tr>
							<td></td>
							<td align="right" valign="top">&nbsp;</td>
							<td colspan="3" valign="top"><img
									src="RenderImage?suspect_no=<%=rSuspectNo%>" border="0" width="100"
									height="100" id="suspect_photo">
							</td>
						</tr>
                  <tr  id="picB">
                    <td>&nbsp;</td>
                    <td  align="right" valign="top" OnClick="togglePict('picB','picA');">รูปถ่ายผู้ต้องสงสัย&nbsp;:&nbsp;</td>
                    <td colspan="3" valign="top">
						<input name="file" type="file" class="textbox" size="35">
						<font color="#FF0000" size="1"><i style="display:none;">* Upload รูปภาพเมื่อบันทึก</i></font><br>
						<font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
						
					</td>
                  </tr>
			<tbody  id="picA0x11" style="display:none">
				  <tr >
                    <td>&nbsp;</td>
                    <td  align="right" valign="top" OnClick="togglePict('picB','picA');">รูปถ่าย&nbsp;:&nbsp;</td>
                    <td colspan="3" valign="top">
							<img src="RenderImage?suspect_no=<%=rSuspectNo%>" border="0" width="100" height="100" id="suspect_photo">
							
					  </td>
				  </tr>
				  <tr >
                    <td>&nbsp;</td>
                    <td  align="right" valign="top" >เปลี่ยนรูปถ่าย&nbsp;:&nbsp;</td>
                    <td colspan="3" valign="top">
						<input name="file" type="file" class="textbox" size="35">
						<input name="Submit2" type="button"  value="Upload"><br>
						<font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
					  </td>
				  </tr>
			</tbody>
                  <tr>
                    <td>&nbsp;</td>
                    <td align="right" valign="top" >รายละเอียดรูปถ่าย&nbsp;:&nbsp;</td>
                    <td colspan="3"><textarea name="photo_desc" cols="35" rows="3" class="textareabig"></textarea></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td height="30" align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td bgcolor="#F5F5F5">&nbsp;</td>
                    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ที่อยู่ในประเทศไทย</strong></td>
                    </tr>
				  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ละติจูด&nbsp;:&nbsp;</td>
                    <td colspan="3"><input name="coordinate_x" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7">
                      &nbsp;&nbsp;ลองติจูด&nbsp;:&nbsp;
                      <input name="coordinate_y" type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5" size="7"></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td height="25" align="right">เลขที่ :&nbsp; </td>
                    <td colspan="3"><input name="address_no" type="text" class="textbox" size="4">
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
<input name="road" type="text" class="road" size="25"></td>
                  </tr>
					<tr>
					<td>&nbsp;</td>
					<td height="25" align="right">จังหวัด :&nbsp;</td>
					<td>
						<select name="province_code" id="sProvince"  style="width:180px;">
							<option value="x" selected>กรุงเทพมหานคร</option>
							<option value="x">กระบี่</option>
							<option value="x">ขอนแก่น</option>
						</select>
					</td>
					<td align="right">&nbsp;</td>
					<td>&nbsp;</td>
					</tr>
					<tr>
					<td>&nbsp;</td>
					<td height="25" align="right">อำเภอ :&nbsp;</td>
					<td>
						<select name="district_code" id="sDistrict" style="width:180px;" >
							<option value="x">เขตพระนคร</option>
							<option value="x" >เขตห้วยขวาง</option>
							<option value="x">เขตดุสิต</option>
							<option value="x" selected>เขตราชเทวี</option>
					 </td>
					<td align="right">&nbsp;</td>
					<td>&nbsp;</td>
					</tr>
					<tr>
					<td>&nbsp;</td>
					<td height="25" align="right">ตำบล :&nbsp;</td>
					<td>
						<select name="subdistrict_code" id="sSubDistrict" style="width:180px;" >
							<option value="x" selected>แขวงมักกะสัน</option>
							<option value="x">แขวงทุ่งสองห้อง</option>
							<option value="x">แขวงบางกะปิ</option>
							<option value="x">แขวง</option>
						</select>
					 </td>
					<td align="right">&nbsp;</td>
					<td>&nbsp;</td>
					</tr>

				  <tr>
                        <td>&nbsp;</td>
				    <td align="right">รหัสไปรษณีย์ :&nbsp;</td>
				    <td height="30"  colspan="3">
                          <input name="post_code" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" size="10" maxlength="5">&nbsp;&nbsp;&nbsp;
                          โทรศัพท์&nbsp;:&nbsp;
                          <input name="tel" type="text" class="textbox" size="10">
                        </td>
				  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td height="30" align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td bgcolor="#F5F5F5">&nbsp;</td>
                    <td colspan="4" align="left" bgcolor="#F5F5F5"><strong>ข้อมูล Visa</strong></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ประเภท VISA :&nbsp;</td>
                    <td colspan="3">
						<select name="visa_type" id="sDistrict" style="width:390px;" >
							<option value="0" selected >เลือก</option>
							<option value="1" >ประเภทคนเดินทางผ่านราชอาณาจักร (Transit Visa)</option>
							<option value="2">ประเภทนักท่องเที่ยว (Tourist Visa)</option>
							<option value="3" >ประเภทคนอยู่ชั่วคราว (Non-Immigrant Visa)</option>
							<option value="4" >ประเภททูต (Diplomatic Visa)</option>
							<option value="5" >ประเภทราชการ (Official Visa)</option>
							<option value="6" >ประเภทอัธยาศัยไมตรี (Courtesy Visa)</option>
						</select>
					</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">วันที่เข้าประเทศ&nbsp;:&nbsp;</td>
                    <td colspan="3"><input name="date_in" type="text" id="date_in_field" class="textdate" size="10" >
<img id="date_in" src="images/btn_calendar.png" width="19" height="19" align="absmiddle">&nbsp;&nbsp;วันที่กำหนดออกจากประเทศ :
                      <input name="date_out" type="text" id="date_out_field" class="textdate" size="10" >
<img id="date_out" src="images/btn_calendar.png" width="19" height="19" align="absmiddle"></td>
                    </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">มาจากทวีป :&nbsp;</td>
                    <td colspan="3">
						<select name="continent_code" id="sDistrict" style="width:115px;" >
							<option value="A" selected>เอเชีย</option>
							<option value="B" >ยุโรป</option>
							<option value="C">อเมริกาเหนือ</option>
							<option value="D" >อเมริกากลาง</option>
							<option value="E" >อเมริกาใต้</option>
							<option value="F" >แอฟริกา</option>
							<option value="G" >ออสเตรเลีย</option>
						</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						ประเทศ :&nbsp;
						<select name="country_code" id="sDistrict" style="width:170px;" >
							<option value="x">ลาว</option>
							<option value="x" >กัมพูชา</option>
							<option value="x">เวียตนาม</option>
							<option value="x" selected>อังกฤษ</option>
						</select>
					</td>
                  </tr>

				</table>

				<hr />


			   <table border="0" cellpadding="0" cellspacing="0" >
					  <tr>
						<td >&nbsp;</td>
						<td height="30" colspan="4" align="left" >
							<input name="btnAddressOther" type="button" class="button" value="ข้อมูลที่อยู่" onClick='toggleHidden("address", "btnAddressOther");' style="background:#FFCC33">
							<input name="btnRelative" type="button" class="button" value="รายชื่อผู้เกี่ยวข้อง" onClick='toggleHidden("Relative","btnRelative");'>
						</td>
					  </tr>
				</table>
				<div class="innerPosition"  id="address" style="width:750px;">
					<table  border="0" cellspacing="0" cellpadding="0" >
						<tr>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span class="spanLink" 
									onClick="openAddressPopup();"
									> เพิ่มใหม่</span> | <span class="spanLink" onClick="KO_doDeleteSuspectAddress(this);">ลบรายการที่เลือก</span></td> 
						</tr>
						<tr>
							<td>
							
						<jsp:include page="/QueryPager/thai_suspect_address_pager.jsp"></jsp:include>
						
							<!-- 
								<table class="tableList" width="700" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
									<tr>
									  <td class="TblHeaderColumn aligncenter">ลำดับที่</td>
									  <td class="TblHeaderColumn aligncenter"><input name="chkAll" type="checkbox"  /></td>
									  <td class="TblHeaderColumn">รายละเอียด</td>
									  <td class="TblHeaderColumn">ที่อยู่</td>
									  <td class="TblHeaderColumn">พิกัด</td>
									  <td class="TblHeaderColumn">โทรศัพท์</td>
									</tr>
									<tr>
									  <td class="TblRow aligncenter">1</td>
									  <td class="TblRow aligncenter"><input name="chk1" type="checkbox"  /></td>
									  <td align="left" valign="top" class="TblRow AlignLeft">บ้านแฟนเก่า</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">คอนโดเพลส เลขที่ 2/6 หมู่4 ตำบลปากเพรียว อำเภอเมือง จังหวัดสระบุรี</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">-</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">02-0000000</td>
									</tr>
									<tr class="bgRowGray">
									  <td class="TblRow aligncenter">2</td>
									  <td class="TblRow aligncenter"><input name="chk2" type="checkbox"  /></td>
									  <td align="left" valign="top" class="TblRow AlignLeft">บ้านพ่อแม่</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">11/3 ตำบลคลองลึก อำเภอนายม จังหวัดสกลนคร</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">-</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">02-0000000</td>
									</tr>
								  </table>
								  
								   -->
							</td>
						</tr>
					</table>
				  </div>
				  <div class="innerPosition" id="Relative" style="width:750px;display:none" >
					<table  border="0" cellspacing="0" cellpadding="0" >
						<tr>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<span  class="spanLink" 
									onClick="openRelativePopup();"
									> เพิ่มใหม่</span> | <span class="spanLink" onClick="KO_doDeleteSuspectRelative(this);">ลบรายการที่เลือก</span>
							</td> 
						</tr>
						<tr>
							<td>
							
							<jsp:include page="/QueryPager/thai_suspect_relative_pager.jsp"></jsp:include>
							<!-- 
								<table class="tableList" width="1100" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
									<tr>
									  <td class="TblHeaderColumn aligncenter">ลำดับที่</td>
									  <td class="TblHeaderColumn aligncenter"><input name="chkAll" type="checkbox"  /></td>
									  <td width="100" class="TblHeaderColumn">ความสัมพันธ์</td>
									  <td width="150" class="TblHeaderColumn">ชื่อ-สกุล</td>
									  <td width="50" class="TblHeaderColumn">โทรศัพท์</td>
									  <td width="100" class="TblHeaderColumn">E-Mail</td>
									  <td width="250" class="TblHeaderColumn">ที่อยู่ปัจจุบัน</td>
									  <td width="250" class="TblHeaderColumn">ที่อยู่ภูมิลำเนา</td>
									</tr>
									<tr>
									  <td class="TblRow aligncenter">1</td>
									  <td class="TblRow aligncenter"><input name="chk1" type="checkbox"  /></td>
									  <td align="left" valign="top" class="TblRow AlignLeft">แฟนเก่า</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">นางสาวน้ำใส ใจชื่นบาน</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">02-0000000</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">yahoo@hotmail.com</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">คอนโดเพลส เลขที่ 2/6 หมู่4 ตำบลปากเพรียว อำเภอเมือง จังหวัดสระบุรี</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">คอนโดเพลส เลขที่ 2/6 หมู่4 ตำบลปากเพรียว อำเภอเมือง จังหวัดสระบุรี</td>

									</tr>
									<tr class="bgRowGray">
									  <td class="TblRow aligncenter">2</td>
									  <td class="TblRow aligncenter"><input name="chk2" type="checkbox"  /></td>
									  <td align="left" valign="top" class="TblRow AlignLeft">บิดา</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">นายสมคิด คล้ายเหมือน</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">02-0000000</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">hotmail@yahoo.com</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">11/3 ตำบลคลองลึก อำเภอนายม จังหวัดสกลนคร</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">11/3 ตำบลคลองลึก อำเภอนายม จังหวัดสกลนคร</td>
									</tr>
								  </table>
								  -->
							</td>
						</tr>
					</table>
				  </div>
				</td>
              </tr>
              
              
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>
  
  </form>

		<!-- Footer -->
		<%@ include file = "../Templates/footer.jsp"%>
