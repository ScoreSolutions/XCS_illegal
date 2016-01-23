<%@ page contentType="text/html; charset=UTF-8" %>

<script type="text/JavaScript">
<!--
<!--//-->

function MM_preloadtask() {
	//alert('555');
	document.getElementById('sp_thai').style.display = 'block';
	document.getElementById('sp_eng').style.display = 'none';
	document.getElementById('sp_com').style.display = 'none';
}

function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}

function showdetail(objselect) {
	vdetail = objselect.value;

	document.getElementById('sp_row').style.display ='block';
	if (vdetail == 'thai') { // DOM3 = IE5, NS6
		document.getElementById('sp_thai').style.display = 'block';
		document.getElementById('sp_eng').style.display = 'none';
		document.getElementById('sp_com').style.display = 'none';
	} else if (vdetail == 'other'){
		document.getElementById('sp_thai').style.display = 'none';
		document.getElementById('sp_eng').style.display = 'block';
		document.getElementById('sp_com').style.display = 'none';
	} else if (vdetail == 'company') {
		document.getElementById('sp_thai').style.display = 'none';
		document.getElementById('sp_eng').style.display = 'none';
		document.getElementById('sp_com').style.display = 'block';
	} else {
		document.getElementById('sp_thai').style.display = 'none';
		document.getElementById('sp_eng').style.display = 'none';
		document.getElementById('sp_com').style.display = 'none';
		document.getElementById('sp_row').style.display ='none';
	}

}

function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}

function MM_jumpMenu(targ,selObj,restore){ //v3.0
  eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
  if (restore) selObj.selectedIndex=0;
}

function MM_jumpMenuGo(selName,targ,restore){ //v3.0
  var selObj = MM_findObj(selName); if (selObj) MM_jumpMenu(targ,selObj,restore);
}
//-->
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
                <td width="99%"><span class="websitename">ทะเบียนประวัติผู้กระทำผิดผู้ประกอบการ</span></td>
              </tr>

              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
					<form action="LawBreaker.jsp" method="post" name="from1">
						<table width="379" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<td width="113" align="right" valign="middle">ประเภทผู้กระทำผิด&nbsp;:&nbsp;</td>
							<td width="260" valign="middle">
								  <select name="action">
									<option value="LawbreakerList" >คนไทย</option>
									<option value="LawbreakerList02">คนต่างชาติ</option>
									<option value="LawbreakerList03" selected>ผู้ประกอบการ</option>
								  </select>
								  <input name="Button1" type="submit" class="button"  value="ตกลง">
							</td>
						  </tr>
						</table>
					</form>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>

              <tr>
                <td>&nbsp;</td>
                <td><table width="800" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
                  <tr>
                    <td><table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">

                        <tr>
                          <td>&nbsp;</td>
                          <td align="left" valign="top"><span class="sectionname">ค้นหาข้อมูลผู้กระทำผิด :: ผู้ประกอบการ</span></td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                          <td align="left" valign="top">&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>

                        <tr id="sp_row">
                          <td>&nbsp;</td>
                          <td align="center" valign="top"><table width="800" border="0" cellpadding="0" cellspacing="0" id="sp_thai">
                              <tr>
                                <td width="20%" height="25" align="right">เลขทะเบียนนิติบุคคล :&nbsp;</td>
                                <td width="30%"><input type="text" name="theDate1" class="textbox"/></td>
                                <td width="20%" align="right">เลขทะเบียนสรรพสามิต :&nbsp;</td>
                                <td width="30%"><input type="text" name="theDate143" class="textbox"/></td>
                              </tr>
                              <tr>
                                <td height="25" align="right">เลขที่ใบอนุญาต :&nbsp;</td>
                                <td><input type="text" name="theDate13" class="textbox"/></td>
                                <td align="right">&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
                              <tr>
                                <td height="25" align="right">ชื่อผู้ประกอบการ :&nbsp;</td>
                                <td colspan="3"><input name="theDate144" type="text" class="textbox" size="70"/></td>
                                </tr>
                              <tr>
                                <td height="10" colspan="4" align="right"></td>
                              </tr>
                              <tr>
                                <td height="25" align="left">ที่อยู่ผู้กระทำผิด</td>
                                <td>&nbsp;</td>
                                <td align="right">&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
                              <tr>
                                <td height="25" align="right">จังหวัด :&nbsp;</td>
                                <td>
									<select name="sProvince" id="sProvince"  style="width:180px;">
										<option value="x" selected>ทั้งหมด</option>
										<option value="x" >กรุงเทพมหานคร</option>
										<option value="x">กระบี่</option>
										<option value="x">ขอนแก่น</option>
									</select>
								</td>
                                <td align="right">&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
                              <tr>
                                <td height="25" align="right">อำเภอ :&nbsp;</td>
                                <td>
									<select name="sDistrict" id="sDistrict" style="width:180px;" >
										<option value="x" selected>ทั้งหมด</option>
										<option value="x">เขตพระนคร</option>
										<option value="x" >เขตห้วยขวาง</option>
										<option value="x">เขตดุสิต</option>
										<option value="x">เขตราชเทวี</option>
									</select>
								</td>
                                <td align="right">&nbsp;</td>
                                <td>&nbsp;</td>
                              </tr>
							  <tr>
								<td height="25" align="right">ตำบล :&nbsp;</td>
								<td><select name="subdistrict_code" id="sDistrict"
									style="width: 180px;">
									<option value="x">แขวงลาดพร้าว</option>
									<option value="x">แขวงมักกะสัน</option>
									<option value="x">แขวงถนนนครไชยศรี</option>
									<option value="x" selected>แขวงห้วยขวาง</option></td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							  </tr>
                            </table></td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                          <td height="40" align="center" valign="bottom"><img src="images/btn_search_big.png" width="65" height="23"></td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <td align="left" valign="bottom" height="10"></td>
                          <td></td>
                          <td align="right" valign="bottom"></td>
                        </tr>
                    </table></td>
                  </tr>
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="30">
                  <span  class="spanLink" onClick="MM_goToURL('parent','LawBreaker.jsp?action=LawbreakerForm03');return document.MM_returnValue"> เพิ่มข้อมูลใหม่ </span>
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                   <tr>
                     <td colspan="7"><%@ include file="../Templates/splitPageBar.html" %></td>
                   </tr>
                  <tr>
                    <td width="22" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                    <td width="165" class="TblHeaderColumn">ชื่อผู้ประกอบการ</td>
                    <td width="104" class="TblHeaderColumn">ทะเบียนนิติบุคคล</td>
                    <td width="105" class="TblHeaderColumn">ทะเบียนสรรพสามิต</td>
                    <td width="256" class="TblHeaderColumn">ใบอนุญาต [วันที่ออกใบอนุญาต - วันที่หมดอายุ] </td>
                    <td width="162" class="TblHeaderColumn">สถานที่ตั้ง</td>
                  </tr>
                  <tr>
                    <td height="30" class="TblRow AlignCenter">1</td>
                    <td class="TblRow AlignLeft">
                      <span  class="spanLink" onClick="MM_goToURL('parent','LawBreaker.jsp?action=LawbreakerForm03');return document.MM_returnValue">
                        หจก. พาณิชย์เครื่องดื่ม
                      </span>
                    </td>
                    <td class="TblRow AlignLeft">3199900042000</td>
                    <td class="TblRow AlignLeft">2552-00044-5</td>
                    <td class="TblRow AlignLeft">2552-00042-5 [14/02/2552 - 31/12/2552] ,<br>2552-00252-5 [14/07/2552 - 31/12/2552]</td>
                    <td class="TblRow AlignLeft">22 ซอยรามคำแหง33 หัวหมาก บางกะปิ กทม</td>
                  </tr>
                  <tr>
                    <td height="30" class="TblRow AlignCenter bgRowGray">2</td>
                    <td class="TblRow AlignLeft bgRowGray">
                      <span  class="spanLink" onClick="MM_goToURL('parent','LawBreaker.jsp?action=LawbreakerForm03');return document.MM_returnValue">
                        บริษัท ภาคกลางค้าปลีก จำกัด
                      </span>
                    </td>
                    <td class="TblRow AlignLeft bgRowGray">3199900040008</td>
                    <td class="TblRow AlignLeft bgRowGray">2551-00898-0</td>
                    <td class="TblRow AlignLeft bgRowGray">&nbsp;</td>
                    <td class="TblRow AlignLeft bgRowGray">29/1 ถนนสามชุก ต.บ้านลาด อ.พรหมคีรี จ.อ่างทอง</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
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

		

