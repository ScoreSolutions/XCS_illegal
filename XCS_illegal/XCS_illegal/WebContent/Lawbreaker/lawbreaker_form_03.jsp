<%@ page contentType="text/html; charset=UTF-8" %>

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
</script>
	<%@ include file="/Templates/header.jsp" %>
  <tr>
    <td valign="top">
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ประวัติผู้กระทำผิดผู้ประกอบการ</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
					<input name="btnSave"  type="button" class="barbutton" value="บันทึก" >
					<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" >
					<input name="btnBack"  type="button" class="barbutton" value="กลับหน้าค้นหา" >
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
                    <td height="30" colspan="4" align="left" bgcolor="#F5F5F5"><strong>ข้อมูลผู้ประกอบการ</strong></td>
                  </tr>
                  <tr>
                    <td width="2%">&nbsp;</td>
                    <td width="20%" align="right">คำนำหน้า&nbsp;:&nbsp;</td>
                    <td width="30%">
						<select name="select">
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
						<input name="theDate144" type="text" class="textbox" size="73"/>
						<font style="color:red">*</font>
					</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ชื่อผู้แทน :&nbsp;</td>
                    <td>
						<select name="select5">
                            <option> </option>
                            <option>นาย</option>
                            <option>นาง</option>
                            <option>นางสาว</option>
                          </select>&nbsp;
						<input type="text" name="textfield5" class="textbox" size="15">
					</td>
                    <td align="right">นามสกุล :&nbsp;</td>
                    <td><input type="text" name="textfield23" class="textbox"></td>
                  </tr>
                  <tr>
                    <td >&nbsp;</td>
                    <td  align="right">เลขทะเบียนนิติบุคคล :&nbsp;</td>
                    <td >
						<input type="text" name="textfield4" class="textbox">
						<img src="images/btn_browse.png" width="18" height="19" align="absmiddle" alt="แสดงรายละเอียด" style="cursor:hand"
						 onClick="window.open('SearchForm/company_desc_pop.asp' , '_blank' , 'menubar=no,toolbar=no,resizable=yes,location=no,scrollbars=no,width=700,height=650');">
					 </td>
				    <td  align="right" valign="middle">เลขทะเบียนสรรพสามิต :&nbsp;</td>
				    <td >
						<input name="textfield432" type="text" class="textbox" >
						<img src="images/btn_browse.png" width="18" height="19" align="absmiddle" alt="แสดงรายละเอียด" style="cursor:hand"
						 onClick="window.open('SearchForm/company_desc_pop.asp' , '_blank' , 'menubar=no,toolbar=no,resizable=yes,location=no,scrollbars=no,width=700,height=650');">
					</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">เลขที่ใบอนุญาต&nbsp;:&nbsp;</td>
                    <td >
						<input type="text" name="textfield42" class="textbox">
						<img src="images/btn_browse.png" width="18" height="19" align="absmiddle" alt="แสดงรายละเอียด" style="cursor:hand"
						 onClick="window.open('SearchForm/company_desc_pop.asp' , '_blank' , 'menubar=no,toolbar=no,resizable=yes,location=no,scrollbars=no,width=700,height=650');">
					</td>
                  </tr>
                  <tr>
                    <td >&nbsp;</td>
                    <td  align="right">วันที่ออกใบอนุญาติ :&nbsp;</td>
                    <td >
						  <input name="theDate2" type="text" class="textdate" readonly   />
                          <img src="images/btn_calendar.png" alt="" width="19" height="19" >
					 </td>
				    <td  align="right" valign="middle">วันที่หมดอายุ :&nbsp;</td>
				    <td >
						  <input name="theDate2" type="text" class="textdate" readonly   />
                          <img src="images/btn_calendar.png" alt="" width="19" height="19" >
					</td>
                  </tr>
				  <tr>
                    <td>&nbsp;</td>
                    <td  align="right" valign="top">รายละเอียดเพิ่มเติม&nbsp;:&nbsp;</td>
                    <td colspan="3"><textarea name="textfield23332" cols="35" rows="3" class="textareabig"></textarea></td>
                    </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                    <td align="right">&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr  id="picB">
                    <td>&nbsp;</td>
                    <td  align="right" valign="top" OnClick="togglePict('picB','picA');">รูปถ่าย&nbsp;:&nbsp;</td>
                    <td colspan="3" valign="top">
						<input name="file" type="file" class="textbox" size="35">
						<font color="#FF0000" size="1"><i>* Upload รูปภาพเมื่อบันทึก</i></font><br>
						<font color="#FF0000">*** มีขนาดไฟล์ไม่เกิน 300 Kb ***</font>
					</td>
                  </tr>
			<tbody  id="picA" style="display:none">
				  <tr >
                    <td>&nbsp;</td>
                    <td  align="right" valign="top" OnClick="togglePict('picB','picA');">รูปถ่าย&nbsp;:&nbsp;</td>
                    <td colspan="3" valign="top">
							<img src="img_suspect/553548995.jpg" border="0" width="100" height="100">
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
                    <td colspan="3"><textarea name="textarea" cols="35" rows="3" class="textareabig"></textarea></td>
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
                    <td colspan="3"><input name="textfield2323" type="text" class="textbox" size="4">
                      &nbsp;&nbsp;ลองติจูด&nbsp;:&nbsp;
                      <input name="textfield2324" type="text" class="textbox" size="4"></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td align="right">เลขที่ :&nbsp; </td>
                    <td colspan="3"><input name="textfield232" type="text" class="textbox" size="4">
                      &nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp;
                      <input name="textfield2322" type="text" class="textbox" size="3">
                      &nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp;
                      <input name="textfield233" type="text" class="textbox" size="25"></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td  align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
                    <td colspan="3"><input name="textfield23222" type="text" class="textbox">
&nbsp;&nbsp;ถนน&nbsp;:&nbsp;
<input name="textfield2332" type="text" class="textbox" size="25"></td>
                  </tr>
					<tr>
					<td>&nbsp;</td>
					<td  align="right">จังหวัด :&nbsp;</td>
					<td>
						<select name="sProvince" id="sProvince"  style="width:180px;">
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
						<select name="sDistrict" id="sDistrict" style="width:180px;" >
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
						<select name="sSubDistrict" id="sSubDistrict" style="width:180px;" >
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
				    <td height="30" align="right">โทรศัพท์&nbsp;:&nbsp;</td>
				    <td><input name="textfield2222" type="text" class="textbox" size="10"></td>
				    <td align="right">&nbsp;</td>
				    <td>&nbsp;</td>
				  </tr>
				</table>

				<hr />
			   <table border="0" cellpadding="0" cellspacing="0" >
					  <tr>
						<td >&nbsp;</td>
						<td height="30" colspan="4" align="left" >
							<input name="btnAddressOther" type="button" class="button" value="ที่อยู่อื่นๆ" onClick='toggleHidden("address", "btnAddressOther");' style="background:#FFCC33">
							<input name="btnRelative" type="button" class="button" value="รายชื่อผู้เกี่ยวข้อง" onClick='toggleHidden("Relative","btnRelative");'>
						</td>
					  </tr>
				</table>
				<div class="innerPosition"  id="address" style="width:750px;">
					<table  border="0" cellspacing="0" cellpadding="0" >
						<tr>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<a href="#" class="linkmenu3level"
									onClick="window.open('Popup/lawbreaker_address_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=400,top=220,left=400,modal=yes');"
									> เพิ่มใหม่</a> | <a href="#" class="linkmenu3level">ลบรายการที่เลือก</a></td>
						</tr>
						<tr>
							<td>
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
									  <td align="left" valign="top" class="TblRow AlignLeft">คลังสินค้า</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">คอนโดเพลส เลขที่ 2/6 หมู่4 ตำบลปากเพรียว อำเภอเมือง จังหวัดสระบุรี</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">-</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">02-0000000</td>
									</tr>
									<tr class="bgRowGray">
									  <td class="TblRow aligncenter">2</td>
									  <td class="TblRow aligncenter"><input name="chk2" type="checkbox"  /></td>
									  <td align="left" valign="top" class="TblRow AlignLeft">โรงงาน</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">11/3 ตำบลคลองลึก อำเภอนายม จังหวัดสกลนคร</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">-</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">02-0000000</td>
									</tr>
								  </table>
							</td>
						</tr>
					</table>
				  </div>
				  <div class="innerPosition" id="Relative" style="width:750px;display:none" >
					<table  border="0" cellspacing="0" cellpadding="0" >
						<tr>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<a href="#" class="linkmenu3level"
									onClick="window.open('Popup/lawbreaker_relative_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=600,height=600,top=220,left=400,modal=yes');"
									> เพิ่มใหม่</a> | <a href="#" class="linkmenu3level">ลบรายการที่เลือก</a></td>
						</tr>
						<tr>
							<td>
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
									  <td align="left" valign="top" class="TblRow AlignLeft">ผู้จัดการโรงงาน</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">นายสมคิด คล้ายเหมือน</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">02-0000000</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">hotmail@yahoo.com</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">11/3 ตำบลคลองลึก อำเภอนายม จังหวัดสกลนคร</td>
									  <td align="left" valign="top" class="TblRow AlignLeft">11/3 ตำบลคลองลึก อำเภอนายม จังหวัดสกลนคร</td>
									</tr>
								  </table>
							</td>
						</tr>
					</table>
				  </div>
                    </td>
                  </tr>
                </table></td>
              </tr>

              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>
	</td>
  </tr>
  <tr>

		<%@ include file = "/Templates/footer.jsp" %>

