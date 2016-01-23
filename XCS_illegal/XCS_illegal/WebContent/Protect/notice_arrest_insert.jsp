<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type='text/javascript'>

function init(){
	getProvince('province','district','tambol','${ana.inform_province_code}','${ana.inform_district_code}','${ana.inform_subdistrict_code}');
	setTimeout("getProvince('province','district','tambol','${ana.inform_province_code}','${ana.inform_district_code}','${ana.inform_subdistrict_code}')",1000);
	getProvince('province2','district2','tambol2','${ana.lawbreaker_province_code}','${ana.lawbreaker_district_code}','${ana.lawbreaker_subdistrict_code}');
}
</script>
<script type="text/javascript">
	function inform_namefocus()
	{
		if (document.dataform.inform_type[0].checked == true)
			{
			document.dataform.inform_address.focus();
			}
	}
	function chkInformType()
	{
		if (document.dataform.inform_type[0].checked == true){
			
			//document.dataform.inform_name.disabled=true;
			document.dataform.inform_name.value="สายลับ(ขอปิดนาม)";
			document.dataform.inform_name.className="textView";		
			//alert(document.dataform.inform_name.value);
			
		}
		else{
			
			document.dataform.inform_name.disabled=false;
			document.dataform.inform_name.className="";
			document.dataform.inform_name.value="${ana.inform_name}";
			
		}
	}

    function printReports()
    {
        var doc = document.dataform;
        var lg = doc.legislation_id.value;
        var notice = doc.notice_no.value;
        var repName='';
        if(lg == '1')
            repName='ILL_P016';
        if(lg == '2')
            repName='ILL_P016_1';
        if(lg == '4')
            repName='ILL_P016_2';


        Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + 'ReportName=' + repName + '&getNoticeNo='+notice + '&vReportType=PDF&time=' + Math.random(), '_blank', 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700')
			}else{
				window.open('process?action=Report&__report=' + repName + '&__formatt=pdf&getNoticeNo='+notice , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}
        });
    }

	function removeElement(divNum) {
	  var d = document.getElementById('myDiv');
	  var olddiv = document.getElementById(divNum);
	  d.removeChild(olddiv);
	}
</script>
<script type="text/javascript">
	function chkdorpdown(ID){
		if (ID=='4'){
		
			document.getElementById("App").style.display='';
			document.getElementById("App2").style.display='none';
		}else{
		
			document.getElementById("App2").style.display='';
			document.getElementById("App").style.display='none';
		}
	}


	function setDDlGroupID(group_id, vLegislationID, vGroupID){
		//alert(vLegislationID);
		LegislationProduct.getDutyGroup(vLegislationID,function(data){
			dwr.util.removeAllOptions(group_id);
			dwr.util.addOptions(group_id,[{group_id:"",group_name:"เลือก"}],"group_id","group_name");
			dwr.util.addOptions(group_id,data,"group_id","group_name");
			
			if(vGroupID!=null && vGroupID!="" ){
				dwr.util.setValue(group_id,vGroupID);
			}
		})
	}
	</script>
<!-- Body -->
	<table width="100%" height="100%" border="0" cellspacing="0"
		cellpadding="0">
		<tr>
			<td width="100%" align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="1%">&nbsp;</td>
					<td width="99%"><span class="websitename">ใบแจ้งความนำจับ</span></td>
				</tr>
				<tr>
					<td height="25">&nbsp;</td>
					<td>
					<hr />
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<input name="btnSave" type="submit" class="barbutton" value="บันทึก" onclick="writeTranLog('บันทึกข้อมูลใบแจ้งความนำจับ')"> 
						<input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข"
						onclick="writeTranLog('ยกเลิกการแก้ไขข้อมูลใบแจ้งความนำจับ');window.location.href='<c:url value="${action}" />'; ">
						<input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา"
						onclick="window.location.href='<c:url value="process?action=NoticeArrest"/>';writeTranLog('กลับหน้าค้นหา')">
						<input name="brnPrint" type="button" class="barbutton" value="พิมพ์บันทึกแจ้งความ" onClick="printReports();writeTranLog('พิมพ์ใบแจ้งความนำจับ พ.ร.บ.')" <c:if test="${ana.notice_no == null}">style='display:none'</c:if> >
					<font size="2" color="red"><i></i></font></td>
				</tr>
				<tr>
					<td height="25">&nbsp;</td>
					<td>
					<hr />
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;</td>
					<td><!--   Start  My Form-->
					<table width="800" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td height="25" align="right" valign="middle">เลขที่บันทึกแจ้งความ
							:&nbsp;</td>
							<td><c:if test="${ana.notice_no == null}">
								<input type="Text" id="notice_no" name="notice_no"	value="NEW" class="textview" size="20" readonly/>
								</c:if>
								<c:if test="${ana.notice_no != null}">
								<input type="Text" id="notice_no" name="notice_no"	value="${ana.notice_no}" class="textview" size="20" readonly/>
								</c:if>
							</td>
							
						</tr>
						<tr>
							<td height="30" align="left" bgcolor="#F7F7F7" style="width: 100px"><strong>ผู้รับแจ้งความ</strong></td>
							<td bgcolor="#F7F7F7" style="width: 409px"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td>
											</tr>
						<tr>
							<td width="20%" height="25" align="right" valign="middle">เขียนที่หน่วยงาน
							:&nbsp;</td>
							<td width="30%"><input type="Text" id="offcode" readonly
								name="offcode" value="${ana.offcode}" class="textbox" size="5" />
							<img src="images/btn_browse.png" width="18" height="19"
								border="0" style="cursor: hand"
								onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');">
							<input type="Text" id="offname" name="offname" readonly
								value="${ana.offname}" class="textbox" size="25" /> <font
								style="color: red">*</font></td>
						</tr>
						
						<tr>
							<td height="25" align="right" valign="middle">วันที่รับแจ้งความ
							:&nbsp;</td>
							<td><input type="Text" id="notice_date" name="notice_date" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${ana.notice_date}" />" size="12" class="textdate" readonly/>
								  <a href="javascript:NewCssCal('notice_date','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" border="0" ></a>&nbsp;
									เวลา :<input type="Text" id="notice_time" name="notice_time"  value="<fmt:formatDate pattern="HH:mm" value="${ana.notice_date}"  />"  size="5" 
									class="textbox" onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);"/><font style="color: red">*</font>
							</td>
							
						</tr>
						<tr>
						<td align="right">ผู้รับแจ้งความนำจับ :&nbsp;</td>
							<td><input type="Text" id="staff_name_receive" name="staff_name_receive"  class="textview" size="40" value="${staff_name_receive}" readonly/>
								<input type="hidden" id="staff_id_receive" name="staff_id_receive" value="${ana.staff_id_receive}">
								<input type="hidden" id="poscode_receive" name="poscode_receive" value="${ana.poscode_receive}">
								<input type="hidden" id="offcode_receive" name="offcode_receive" value="${ana.offcode_receive}">
								<img
								src="images/btn_browse.png" width="18" height="19" border="0"
								style="cursor:hand"
								onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_receive&id=staff_id_receive&posname=posname_receive&poscode=poscode_receive&offname=offname_receive&offcode=offcode_receive' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
							<font style="color: red">*</font></td>
						</tr>
						<tr>
							<td height="25px" align="right">ตำแหน่ง :&nbsp;</td>
							<td>
								<input type="Text" id="posname_receive" name="posname_receive" value="${posname_receive}" class="textview" size="45" readonly/>
							</td>
						</tr>
						<tr>
							<td height="25px" align="right">สังกัด :&nbsp;</td>
							<td>
								<input type="Text" id="offname_receive" name="offname_receive" value="${offname_receive}" class="textview" size="45" readonly/>
							</td>
						</tr>
						<tr>
							<td height="25" colspan="4"></td>
						</tr>
						
						<tr>
							<td height="30" align="left" bgcolor="#F7F7F7"><strong>รายละเอียดผู้แจ้งความ</strong></td>
							<td bgcolor="#F7F7F7">&nbsp;</td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
							<td bgcolor="#F7F7F7">&nbsp; </td>
						</tr>
						<tr>
							<td height="25" align="right" valign="middle">ผู้แจ้งความ
							:&nbsp;</td>
							<td><input type="radio" id="inform_type1" name="inform_type" OnClick="chkInformType();" value="1" <c:if test="${ana.inform_type == '1' || ana.inform_type == null}" >checked</c:if> />สายลับ(ขอปิดนาม)&nbsp;&nbsp;
								<input type="radio" id="inform_type2" name="inform_type" OnClick="chkInformType();" value="2" <c:if test="${ana.inform_type == '2'}" >checked</c:if> />ระบุชื่อ<font style="color: red">*</font>
							</td>
							
						</tr>
						<tr>
							<td height="25" align="right" valign="middle">ชื่อ(นามแฝง)ผู้แจ้ง
							:&nbsp;</td>
							<td><input type="Text" id="inform_name" name="inform_name" value="${ana.inform_name}" onfocus="inform_namefocus()" class="textView" size="30"/>
							 <font style="color: red">*</font></td>
						</tr>
						<tr>
							<td height="25" align="right">อายุผู้แจ้ง :&nbsp;</td>
							<td>
								<input type="Text" id="inform_age" name="inform_age" value="${ana.inform_age}" class="textNum" onkeypress="ChkMinusInt(this);" size="5"/>&nbsp;ปี
							</td>
						</tr>
						<tr>
							<td height="25" align="right">ที่อยู่ของผู้แจ้ง :&nbsp;</td>
							<td><input name="inform_address" type="text" value="${ana.inform_address}"class="textbox" id="ifAddr" size="5">
							  &nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
								<input name="inform_moo" type="text" class="textbox" value="${ana.inform_moo}" id="ifMoo" size="5" OnKeyPress="ChkMinusInt(this);">					
							</td>
							
						</tr>
						<tr>
							<td height="25" align="right">อาคาร/สถานที่:&nbsp;</td>
							<td><input name="inform_address_name" type="text" value="${ana.inform_address_name}" class="textbox" id="inform_address_name" size="25"></td>
						</tr>
						<tr>
							<td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
							<td><input name="inform_soi" type="text" value="${ana.inform_soi}" class="textbox" id="inform_soi" size="25"></td>
						</tr>
						<tr>
							<td height="25" align="right">ถนน :&nbsp;</td>
							<td><input name="inform_road" type="text" value="${ana.inform_road}" class="textbox" id="inform_road" size="25">				</td>
							
						</tr>
						<tr>
							<td height="25" align="right">จังหวัด :&nbsp;</td>
							<td>
								<select id='province' style="width:200px" name="inform_province_code" onchange="getDistrict('district','tambol',this.value)"></select>							</td>
						</tr>
						<tr>
							<td height="25" align="right">อำเภอ :&nbsp;</td>
							<td>
								<select id='district' style="width:200px"  name="inform_district_code" onchange="getTambol('tambol',this.value,'')"></select>						  </td>
						</tr>
						<tr>
							<td height="25" align="right">ตำบล :&nbsp;</td>
							<td>
							<select id='tambol' name="inform_subdistrict_code"  style="width:200px"></select>						  </td>
						</tr>
						<tr>
							<td height="25" colspan="4"></td>
						</tr>
						<tr>
							<td height="25" align="right">เรียนผู้มีอำนาจสั่งจ่าย :&nbsp;</td>
							<td>
								<input name="inform_lean" type="text" value="${ana.inform_lean}" class="textbox" id="inform_lean" size="38">
								<font color="red" >*</font>				
							</td>
						</tr>
						<tr>
							<td height="25" colspan="4"></td>
						</tr>
						<tr>
							<td height="30" align="left" bgcolor="#F7F7F7"><strong>รายละเอียดผู้กระทำผิด</strong></td>
							<td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td>
						</tr>
						<tr>
							<td height="25" align="right" valign="middle">ชื่อผู้กระทำผิด :&nbsp;</td>
							<td>
								<input type="Text" id="lawbreaker_name" name="lawbreaker_name"  class="textbox" size="25" value="${ana.lawbreaker_name}" />
                                <input type="hidden" id="lawbreaker_no" name="lawbreaker_no"  value="${ana.lawbreaker_no}">								
                                <img src="images/btn_browse.png" width="18" height="19"
								border="0" style="cursor: hand"
								onClick="window.open('process?action=LawFind_pop&formname=lawbreaker_name&id=lawbreaker_no' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');">
								 <font style="color: red">*</font></td>
							
						</tr>
						<tr>
							<td height="25" align="right">สถานที่เกิดเหตุ :&nbsp;</td>
							<td><input name="lawbreaker_address" type="text" value="${ana.lawbreaker_address}" class="textbox" id="lawbreaker_address" size="5">
							  &nbsp;&nbsp;&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
								<input name="lawbreaker_moo" type="text" value="${ana.lawbreaker_moo}" class="textbox" id="lawbreaker_moo" size="5" OnKeyPress="ChkMinusInt(this);"/>					
							</td>
							
						</tr>
						<tr>
							<td height="25" align="right">อาคาร/สถานที่:&nbsp;</td>
							<td><input name="lawbreaker_address_name" type="text" value="${ana.lawbreaker_address_name}" class="textbox" id="lawbreaker_address_name" size="25"></td>
							
						</tr>
						<tr>
							<td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
							<td><input name="lawbreaker_soi" type="text" value="${ana.lawbreaker_soi}" class="textbox" id="lawbreaker_soi" size="25">	</td>
							
						</tr>
						<tr>
							<td height="25" align="right">ถนน :&nbsp;</td>
							<td><input name="lawbreaker_road" type="text" value="${ana.lawbreaker_road}" class="textbox" id="lawbreaker_road" size="25">					</td>
							
						</tr>
						<tr>
							<td height="25" align="right">จังหวัด :&nbsp;</td>
							<td><select id='province2' style="width:200px" name="lawbreaker_province_code" onchange="getDistrict('district2','tambol2',this.value)"></select></td>
							
						</tr>
						<tr>
							<td height="25" align="right">อำเภอ :&nbsp;</td>
							<td><select id='district2' style="width:200px"  name="lawbreaker_district_code" onchange="getTambol('tambol2',this.value,'')"></select></td>
							
						</tr>
						<tr>
							<td height="25" align="right">ตำบล :&nbsp;</td>
							<td><select id='tambol2' style="width:200px" name="lawbreaker_subdistrict_code" ></select></td>
							
							</tr>
							<tr>
							<td height="25" colspan="4"></td>
						</tr>
						<tr>
							<td height="30" align="left" bgcolor="#F7F7F7"><strong>รายละเอียดการกระทำผิด</strong></td>
							<td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td>
						</tr>
						<tr>
							<td width="17%" align="right">ความผิด พ.ร.บ. :&nbsp;</td>
							<td width="33%">
								<select name="legislation_id" id="legislation_id" class="select" style="width:200px" onchange="setDDlGroupID('duty_code',this.value,'');" >
									<option value="">เลือก</option>
									<c:forEach items="${lglist}" var="lg">
										<option value="${lg.id}" <c:if test="${ana.legislation_id == lg.id}"> selected </c:if>>${lg.legislation_name}</option>
									</c:forEach>
								</select> 
								<font style="color: red">*</font>
							</td>
						</tr>
						<tr>
							<td align="right">สินค้า :&nbsp;</td>
							<td>
								<select name="duty_code" id="duty_code" class="select" style="width:200px" >
									<option value="" >เลือก</option>
									<c:forEach var="dt" items="${dtlist}">
										<option value="${dt.group_id}" <c:if test="${dt.group_id == ana.duty_code}"> selected </c:if>>${dt.group_name}</option>
									</c:forEach>
								</select> 
								<span id="txtProductStar" style="display: none">
								<font style="color: red">*</font>
								</span>
							</td>
						</tr>
						<tr>
							<td colspan="4">
							 <%@include file="../Protect/indictment.jsp" %>
						   </td>
						</tr>		
						<tbody id="App2" style=" ">
							<tr><td align="right">มอบฉันทะให้ :&nbsp;</td>
								<td><input type="Text" id="staff_name_accept" name="staff_name_accept" value="${staff_name_accept}" class="textview" size="40" readonly/>
								<input type="hidden" id="staff_id_accept" name="staff_id_accept" value="${ana.staff_id_accept}">
							  
							 <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
								onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_accept&id=staff_id_accept' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />
								</td>
							</tr>
						</tbody>
						<tr>
							<td height="25" colspan="4"></td>
						</tr>
								<tr>
								
							<td height="30" align="left" bgcolor="#F7F7F7"><strong>รายละเอียดการนำจับ</strong></td>
							<td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td>
											</tr>
						<tr>
							<td height="25" align="right">รายละเอียดการนำจับ :&nbsp;</td>
							<td>
							<TEXTAREA NAME="arrest_desc" COLS="25" ROWS="2" id="arrest_desc">${ana.arrest_desc}</TEXTAREA>	</td>

						</tr>

						<tr>
							<td height="25" align="right">ชั้นความลับ :&nbsp;</td>
							<td><INPUT TYPE="radio" NAME="secret_level" value="1" checked >1. ปกติ&nbsp;&nbsp;&nbsp;&nbsp;
								<INPUT TYPE="radio" NAME="secret_level" value="2">2. พิเศษ	</td>
							
						</tr>
						<tr><td align="right" valign="top" rowspan="2">หมายเหตุ :&nbsp;</td>
							<td valign="top" rowspan="2"><TEXTAREA NAME="remarks" COLS="29" ROWS="3" id="remarks">${ana.remarks}</TEXTAREA></td></tr>
							<tr><td></td></tr>
							<tr><td align="right">ผู้ทำรายการ :&nbsp;</td>
							<td><input type="Text" id="create_byx" name="create_byx"  class="textview" size="40" value="${create_by_name}" readonly/>					</td></tr>
							<tr><td align="right">วันที่ทำรายการ :&nbsp;</td>
							<td> <input type="Text" id="create_on" name="create_on"  size="40" class="textview" value="<fmt:formatDate pattern="dd/MM/yyyy HH:mm" value="${ana.create_on}"  />" readonly/>		</td></tr>
						
				
							<tr>
							<td height="25" colspan="4"></td>
						</tr>
							<tr>
					
							<td height="30" align="left" bgcolor="#F7F7F7"><strong>ผลการดำเนินการแจ้งความ</strong></td>
							<td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td><td bgcolor="#F7F7F7"> </td>
											</tr>
											<tr><td colspan="2">ผลของการแจ้งความครั้งนี้ &nbsp;</td></tr>
											<tr><td><INPUT TYPE="radio" id="notice_result" NAME="notice_result" value="1" <c:if test="${(ana.notice_result != 2) and (ana.notice_result != 3)  }" >checked</c:if>>1. ยังไม่ดำเนินการ</td>
							<td><INPUT NAME="ismanage" TYPE="checkbox" id="ismanage" <c:if test="${ana.ismanage=='Y'}" >checked</c:if>  value="Y">
							นำไปดำเนินการต่อ</td></tr>
							<tr>
								<td><INPUT TYPE="radio" id="notice_result" NAME="notice_result" value="2" <c:if test="${ana.notice_result==2}" >checked</c:if>>2. จับกุมสำเร็จ</td>
								<td><INPUT NAME="isreward_pay" TYPE="checkbox" id="isreward_pay" <c:if test="${ana.isreward_pay=='Y'}"   >checked</c:if>  value="Y">
								จ่ายเงินรางวัลแล้ว
								</td>
							</tr>
							<tr>
								<td height="25"><INPUT TYPE="radio" id="notice_result" NAME="notice_result" value="3" <c:if test="${ana.notice_result==3}" >checked</c:if>>3. จับกุมไม่สำเร็จ</td>
								<td height="25" align="left" valign="middle">วันที่ขอรับเงินรางวัล&nbsp;:&nbsp;
									<input type="Text" id="receive_date" name="receive_date"  class="textdate" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${ana.receive_date }" />" readonly />
									<a href="javascript:NewCssCal('receive_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
								</td>
							</tr>
							<tr>
								<td align="right">ผู้รับรองนำจับสำเร็จ :&nbsp;</td>
								<td><input type="Text" id="staff_name_surety" name="staff_name_surety""  class="textview" size="40" value="${staff_name_surety}" />
									<input type="hidden" id="staff_id_surety" name="staff_id_surety" value="${ana.staff_id_surety}">
									<input type="hidden" id="poscode_surety" name="poscode_surety" value="${ana.poscode_surety}">
									<input type="hidden" id="offcode_surety" name="offcode_surety" value="${ana.offcode_surety}">
									<img
									src="images/btn_browse.png" width="18" height="19" border="0"
									style="cursor:hand"
									onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_surety&id=staff_id_surety&posname=posname_surety&poscode=poscode_surety&offname=offname_surety&offcode=offcode_surety' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
								</td>
							</tr>
							<tr height="25px;">
								<td align="right">ตำแหน่ง&nbsp;:&nbsp;</td>
								<td>
									<input type="text" id="posname_surety" name="posname_surety" value="${posname_surety}" class="textview" size="40"/>
								</td>
							</tr>
							<tr>
								<td align="right">สังกัด&nbsp;:&nbsp;</td>
								<td>
									<input type="text" id="offname_surety" name="offname_surety" value="${offname_surety}" class="textview" size="40"/ >
								</td>
							</tr>
							<tr><td>&nbsp;</td></tr>
							
							
					</table>
							

					<!--   Start  My Form--></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
<script>
init();
chkInformType();
setDDlGroupID('duty_code','${ana.legislation_id}','${ana.duty_code}');
</script>



