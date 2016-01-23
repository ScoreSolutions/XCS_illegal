<%@ page contentType="text/html; charset=UTF-8" %>

<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
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
		}else{
			mnuA.style.display = '';
			mnuB.style.display = 'none';
		}

	}
	function MM_goToURL() { //v3.0
	  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
	  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
	}
</script>

		<!-- Header -->
		<%@ include file="../Templates/header.jsp" %>

<%
	if(request.getCharacterEncoding() == null){
   		request.setCharacterEncoding("UTF-8");
	}else{
		com.ko.util.Debugger.show(this, request.getCharacterEncoding());
	}
	
	String path = com.ko.util.FormUtility.getScriptReferencePath(request);
	String revisionCommand = "";
	Long rSuspectNo = System.currentTimeMillis();
	{
		String suspectNo = request.getParameter("suspect_no");
		if(suspectNo != null){
			rSuspectNo = Long.valueOf(suspectNo);
			java.math.BigDecimal no = new java.math.BigDecimal(suspectNo);
			com.ko.model.Suspect s = new com.ko.util.SelectionUtility().getSuspect(no);
			java.util.HashMap<String,String> revisionMap = com.ko.util.FormUtility.createRevisionMapFromObject(s);
			revisionCommand = com.ko.util.FormUtility.generateRealRevisionCommand(revisionMap);
		}
	}
%>

<script>

	var suspectAddressAr = [];
	var suspectRelativeAr = [];
	var suspectNo = "<%=rSuspectNo%>";
	var indexer = new Object();
	
	indexer.address = 1;
	indexer.relative = 1;

	function KO_fixDistrictListBox(revisionCommand){
		// make sure province,districk and subdistrick display correctly
		var correntProvinceCode = jQuery("select[name=province_code]").val();
		applyDistrictOption("<%=path%>", "district_code", correntProvinceCode);
		eval(revisionCommand);

		var correntDistrictCode = jQuery("select[name=district_code]").val();
		applySubdistrictOption("<%=path%>", "subdistrict_code", correntDistrictCode);
		eval(revisionCommand);
	}

	function KO_doExciseRegNoSearch(caller){
		var control = document.getElementsByName("excise_reg_no")[0];
		var key = control.value;
		if(key){
			var url = "InfoGenerator";
			var dt = "request=TRADER_SUSPECT_FERN&create_by=5&excise_reg_no=" + key;
			jQuery.get(url, dt , function(data){
				if(data){
					eval(data);
					suspectNo = document.getElementsByName("suspect_no")[0].value;
					KO_fixDistrictListBox(data);
				}	
			});			
		}else{
			alert("?");
		}
	}

	function KO_doCorporationCodeSearch(caller){
		var control = document.getElementsByName("corporation_code")[0];
		var key = control.value;
		if(key){
			var url = "InfoGenerator";
			var dt = "request=TRADER_SUSPECT_FCC&create_by=5&corporation_code=" + key;
			jQuery.get(url, dt , function(data){
				if(data){
					eval(data);
					suspectNo = document.getElementsByName("suspect_no")[0].value;
					KO_fixDistrictListBox(data);
				}
			});			
		}else{
			alert("?");
		}
	}

	function KO_doLicenseNoSearch(caller){
		var control = document.getElementsByName("license_no")[0];
		var key = control.value;
		if(key){
			var url = "InfoGenerator";
			var dt = "request=TRADER_SUSPECT_FLN&create_by=5&license_no=" + key;
			jQuery.get(url, dt , function(data){
				if(data){
					eval(data);
					suspectNo = document.getElementsByName("suspect_no")[0].value;
					Ko_fixDistrictListBox(data);
				}
			});		
		}else{
			alert("?");
		}
	}
	
	function KO_reorderIndex(tableName, targetId){
		jQuery.find(targetId).each(function(i){
			jQuery(this).attr("innerHTML", i+1);
			this.innerHtml = i+1;
		});
	}
	
	function KO_doDeleteSuspectAddress(caller){
		var confirm = window.confirm("ยืนยันการลบข้อมูล?");
		if (!confirm){
			return false;
		}
		//var data = jQuery("form[name=address_pager]").serialize();
		//data = data + "&target=SUSPECT_ADDRESS";
		var data = "0x11abc=0x11abc";
		jQuery("input[name=address_id]:checked").each(function(){
			data = data + "&address_id=" + this.value;
		});
		data = data + "&target=SUSPECT_ADDRESS";
		
		var url = "DeleteSuspectDetail.do";
		jQuery.post(url,data, function(result){});
		jQuery("[name=address_id]:checked").each(function(){
			jQuery("#address_" + this.value).remove();
			//jQuery("#address_" + this.value).attr("id","_");
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

		KO_reorderIndex("#suspect_relative_table", "#relative_index");
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
		var data = window.showModalDialog('Popup/lawbreaker_relative_form.jsp' , '_blank' , 'dialogWidth=700px,dialogHeight=400px');
		if(data != null){
			data["index"] = indexer.relative;
			KO_appendRelativeRow("suspect_relative_table", data);
			suspectRelativeAr[suspectRelativeAr.length+1] = data;
			indexer.relative = indexer.relative + 1;
		}
	}


/*            _               _ _
    ___ _   _| |__  _ __ ___ (_) |_
   / __| | | | '_ \| '_ ` _ \| | __|
   \__ \ |_| | |_) | | | | | | | |_
   |___/\__,_|_.__/|_| |_| |_|_|\__|
*/
	function submitForm(){ 
		
		var companyName = document.getElementsByName("company_name")[0];
		if (!companyName.value) 
		{
			alert("กรุณากรอกชื่อผู้ประกอบการ");
			control.focus();
			return false;
		}
		var corporationCode = document.getElementsByName("corporation_code")[0];
		if(!corporationCode.value){
			alert("กรุณากรอกเลขทะเบียนนิติบุคคล");
			corporationCode.focus();
			return false;
		}
		var exciseRegNo = document.getElementsByName("excise_reg_no")[0];
		if(!exciseRegNo.value){
			alert("กรุณากรอกเลขทะเบียนสรรพสามิตร");
			exciseRegNo.focus();
			return false;
		}

		
		//-- serailize form data
		var data = jQuery('form#trader_suspect_form').serialize();
		data = data + "&suspect_no=" + suspectNo;		
		jQuery.post("SaveTraderSuspectAction", data , function(output){
			var message = jQuery.parseJSON(output);
			var code = message.id;
			if (code == "DUP_CORP_CODE"){
				alert("เลขทะเบียนนิติบุคคลซ้ำ");
				return false;
			}else if(code == "DUP_EXC_NO"){
				alert("เลขทะเบียนสรรพสามิตรซ้ำ");
				return false;
			}else if (code == "NOTHING"){
	
				}
			}
		);
		
		try{
			for(var i in suspectAddressAr){
				//alert(i);
				if( i != "each" ){
					if( i != "forEach" ){
						var a = suspectAddressAr[i];
						var data = a["serialize"];
						var url = "SaveSuspectDetailAction.do?action_=SAVE_SUSPECT_ADDRESS&suspect_no="+suspectNo;
						
						jQuery.post(url, data, function(data) { 
						   //alert(data);
						});
					}
				}
			}
	
			for(var i in suspectRelativeAr){
				if( i != "each" ){
					if( i != "forEach" ){
						var a = suspectRelativeAr[i];
						var data = a["serialize"];
						var url = "SaveSuspectDetailAction.do?action_=SAVE_SUSPECT_RELATIVE&suspect_no=" + suspectNo;
						
						jQuery.post(url, data, function(data) { 
						   //alert(data);
						});
					}
				}
			}
			
			//upload picture
			var url = "SaveSuspectPicture?suspect_no=" + suspectNo;
			jQuery("#trader_suspect_form").attr("action", url);
			jQuery("#trader_suspect_form").submit();

			var ans = KO_saveSuspectConfirm();
			if(ans){
				window.location = "Suspect.jsp?action=CompanySave&suspect_no=" + suspectNo;
			}else{
				var time = new Date().getTime();
				jQuery("img#suspect_photo").attr("src","RenderImage?suspect_no=" + suspectNo + "&abc0x11=" + time);
			}	
		}catch(err){
			alert(err.message);
		}
	}

	//jQuery.noConflict();  
	jQuery(document).ready(function() {
		applyProvinceAction("<%=path%>", "province_code", "district_code", "subdistrict_code" );
		applyTitleOption("<%=path%>","title_code", "1");
		applyTitleOption("<%=path%>","title_code_company", "2");

		// -- date time
		jQuery("#license_date_from").css("border","none");
		jQuery("#license_date_from").wrap('<a href="javascript:NewCssCal(\'license_date_from_field\',\'ddmmyyyy\')"></a>');

		jQuery("#license_date_to").css("border","none");
		jQuery("#license_date_to").wrap('<a href="javascript:NewCssCal(\'license_date_to_field\',\'ddmmyyyy\')"></a>');
		
		eval('<%=revisionCommand%>');

		KO_fixDistrictListBox('<%=revisionCommand%>');
	 });
	
</script>

  <tr>
    <td valign="top">
		<!-- Body -->
		
	<iframe name="upload_picture_frame" src="xxx" style="display:none;"></iframe>
	<form method="post" action="SaveSuspectPicture" id="trader_suspect_form"
		target="upload_picture_frame" enctype="multipart/form-data">
		
		
		
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยผู้ประกอบการ</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                	<!-- 
					<input name="btnSave"  type="submit" class="barbutton" value="บันทึก" 
                                onClick="MM_goToURL('parent','Suspect.jsp?action=CompanySave');
					return document.MM_returnValue">
					 -->
					
					 
					 <input name="btnSave"  onClick="submitForm();" type="button" class="barbutton" value="บันทึก"/>
					<input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข" onClick="MM_goToURL('parent','Suspect.jsp?action=CompanyForm'); return document.MM_returnValue"> 
					<input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onClick="MM_goToURL('parent','Suspect.jsp?action=suspectList03'); return document.MM_returnValue">
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
                    <td bgcolor="#F5F5F5">&nbsp;</td>
                    <td height="30" colspan="4" align="left" bgcolor="#F5F5F5"><strong>ข้อมูลผู้ประกอบการ</strong></td>
                  </tr>
                  <tr>
                    <td width="2%">&nbsp;</td>
                    <td width="20%" align="right">คำนำหน้า&nbsp;:&nbsp;</td>
                    <td width="30%">
						<select name="title_code_company">
							  <option>บริษัทจำกัด</option>
							  <option>บริษัทจำกัด (มหาชน)</option>
							  <option>วิสาหกิจชุมชน</option>
							  <option>ห้างหุ้นส่วนจำกัด</option>
							  <option>ห้างหุ้นส่วนนิติบุคคล</option>
							  <option>ห้างหุ้นส่วนสามัญ</option>
						</select>
						<font style="color:red">*</font>
					</td>
                    <td width="15%" align="right">&nbsp;</td>
                    <td width="33%">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ชื่อผู้ประกอบการ :&nbsp;</td>
                    <td colspan="3">
						<input name="company_name" type="text" class="textbox" size="73"/>
						<font style="color:red">*</font>
					</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ชื่อผู้แทน :&nbsp;</td>
                    <td>
						<select name="title_code">
                            <option> </option>
                            <option>นาย</option>
                            <option>นาง</option>
                            <option>นางสาว</option>
                          </select>&nbsp;
						<input type="text" name="first_name" class="textbox" size="15">
					</td>
                    <td align="right">นามสกุล :&nbsp;</td>
                    <td><input type="text" name="last_name" class="textbox"></td>
                  </tr>
                  <tr>
                    <td >&nbsp;</td>
                    <td  align="right">เลขทะเบียนนิติบุคคล :&nbsp;</td>
                    <td >
						<input type="text" name="corporation_code" class="textbox">
						<img src="images/btn_browse.png" width="18" height="19" align="absmiddle" alt="แสดงรายละเอียด" style="cursor:hand"
						 onClick="KO_doCorporationCodeSearch(this);">
					 </td>
				    <td  align="right" valign="middle">เลขทะเบียนสรรพสามิต :&nbsp;</td>
				    <td >
						<input name="excise_reg_no" type="text" class="textbox">
						<img src="images/btn_browse.png" width="18" height="19" align="absmiddle" alt="แสดงรายละเอียด" style="cursor:hand"
						 onClick="KO_doExciseRegNoSearch(this);">
					</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">เลขที่ใบอนุญาต&nbsp;:&nbsp;</td>
                    <td >
						<input type="text" name="license_no" class="textbox">
						<img src="images/btn_browse.png" width="18" height="19" align="absmiddle" alt="แสดงรายละเอียด" style="cursor:hand"
						 onClick="KO_doLicenseNoSearch();">
					</td>
                  </tr>
                  <tr>
                    <td >&nbsp;</td>
                    <td  align="right">วันที่ออกใบอนุญาติ :&nbsp;</td>
                    <td >
						  <input name="license_date_from" type="text" id="license_date_from_field" class="textdate" size="10" >
<img id="license_date_from" src="images/btn_calendar.png" width="19" height="19">
					 </td>
				    <td  align="right" valign="middle">วันที่หมดอายุ :&nbsp;</td>
				    <td >
						  <input name="license_date_to" type="text" id="license_date_to_field" class="textdate" size="10" >
<img id="license_date_to" src="images/btn_calendar.png" width="19" height="19">
					</td>
                  </tr>
				  <tr>
                    <td>&nbsp;</td>
                    <td  align="right" valign="top">รายละเอียดเพิ่มเติม&nbsp;:&nbsp;</td>
                    <td colspan="3"><textarea name="description" cols="35" rows="3" class="textareabig"></textarea></td>
                    </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">&nbsp;</td>
                    <td><img src="RenderImage?suspect_no=<%=rSuspectNo%>" border="0" width="100"
									height="100" id="suspect_photo">;</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr  id="picB">
                    <td>&nbsp;</td>
                    <td  align="right" valign="top" OnClick="togglePict('picB','picA');">รูปถ่าย&nbsp;:&nbsp;</td>
                    <td colspan="3" valign="top">
						<input name="file" type="file" class="textbox" size="35" id="uploadify">
						<font color="#FF0000" size="1"><i style="display:none;">* Upload รูปภาพเมื่อบันทึก</i></font><br>
						<font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
					</td>
                  </tr>
			<tbody  id="picA0x11" style="display:none">
				  <tr >
                    <td>&nbsp;</td>
                    <td  align="right" valign="top" OnClick="togglePict('picB','picA');">รูปถ่าย&nbsp;:&nbsp;</td>
                    <td colspan="3" valign="top">
							<img src="RenderImage?suspect_no=<%=rSuspectNo%>&type=COMPANY" border="0" width="100" height="100" id="suspect_photo">
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
                    <td  align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td bgcolor="#F5F5F5">&nbsp;</td>
                    <td  colspan="4" align="left" bgcolor="#F5F5F5"><strong>สถานที่ตั้ง</strong></td>
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
                    <td align="right">เลขที่ :&nbsp; </td>
                    <td colspan="3"><input name="address_no" type="text" class="textbox" size="4">
                      &nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
                      <input name="moo" type="text" class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3" size="3">
                      &nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp;
                      <input name="address_name" type="text" class="textbox" size="25"></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
                    <td colspan="3"><input name="soi" type="text" class="textbox">
&nbsp;&nbsp;ถนน&nbsp;:&nbsp;
<input name="road" type="text" class="road" size="25"></td>
                  </tr>
					<tr>
					<td>&nbsp;</td>
					<td  align="right">จังหวัด :&nbsp;</td>
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
					<td  align="right">อำเภอ :&nbsp;</td>
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
					<td  align="right">ตำบล :&nbsp;</td>
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
                          <input name="post_code" type="text" class="textNum" onKeyPress="ChkMinusInt(this);" size="10" maxlength="5">&nbsp;&nbsp;&nbsp;
                          โทรศัพท์&nbsp;:&nbsp;
                          <input name="tel" type="text" class="textbox" size="10">
                          <input name="suspect_no" type="text" value="<%=rSuspectNo%>" style="display:none">
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
									onClick="openAddressPopup()"
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
									  <td align="left" valign="top" class="TblRow AlignLeft">โรงงาน</td>
									  <td align="left" valign="top" class="TblRow AlignLeft"> 2/6 หมู่4 ตำบลปากเพรียว อำเภอเมือง จังหวัดสระบุรี</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">-</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">02-0000000</td>
									</tr>
									<tr class="bgRowGray">
									  <td class="TblRow aligncenter">2</td>
									  <td class="TblRow aligncenter"><input name="chk2" type="checkbox"  /></td>
									  <td align="left" valign="top" class="TblRow AlignLeft">โกดังสินค้า</td>
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
									onClick="openRelativePopup()"
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
									  <td align="left" valign="top" class="TblRow AlignLeft">เจ้าของกิจการ</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">นางสาวน้ำใส ใจชื่นบาน</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">02-0000000</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">yahoo@hotmail.com</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">คอนโดเพลส เลขที่ 2/6 หมู่4 ตำบลปากเพรียว อำเภอเมือง จังหวัดสระบุรี</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">คอนโดเพลส เลขที่ 2/6 หมู่4 ตำบลปากเพรียว อำเภอเมือง จังหวัดสระบุรี</td>

									</tr>
									<tr class="bgRowGray">
									  <td class="TblRow aligncenter">2</td>
									  <td class="TblRow aligncenter"><input name="chk2" type="checkbox"  /></td>
									  <td align="left" valign="top" class="TblRow AlignLeft">ผู้จัดการ</td>
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
		
	</td>
  </tr>
  <tr>
    <td>
		<!-- Footer -->
		<%@ include file = "../Templates/footer.jsp"%>
	</td>
  </tr>
</table>

</body>
</html>
