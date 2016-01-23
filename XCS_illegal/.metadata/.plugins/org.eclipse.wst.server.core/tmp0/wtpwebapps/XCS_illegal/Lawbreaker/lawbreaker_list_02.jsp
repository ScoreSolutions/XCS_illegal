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
                <td width="99%"><span class="websitename">ทะเบียนประวัติผู้กระทำผิดชาวต่างชาติ</span></td>
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
									<option value="LawbreakerList02" selected>คนต่างชาติ</option>
									<option value="LawbreakerList03">ผู้ประกอบการ</option>
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
                <td><table width="700" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
                  <tr>
                    <td><table width="700" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">

                        <tr>
                          <td>&nbsp;</td>
                          <td align="left" valign="top"><span class="sectionname">ค้นหาข้อมูลผู้กระทำผิด :: คนต่างชาติ</span></td>
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
                                <td width="20%" height="25" align="right">เลขที่หนังสือเดินทาง :&nbsp;</td>
                                <td width="30%"><input type="text" name="theDate1" class="textbox"/></td>
                                <td width="20%" align="right">มาจากประเทศ :&nbsp;</td>
                                <td width="30%">
                                	<input type="text" name="theDate143" class="textbox"/>
                                </td>
                              </tr>
                              <tr>
                                <td height="25" align="right">ชื่อ-ชื่อกลาง-นามสกุล :&nbsp;</td>
                                <td colspan="3"><input type="text" name="theDate13" class="textbox"/></td>
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
                  <span  class="spanLink" onClick="MM_goToURL('parent','LawBreaker.jsp?action=LawbreakerForm02');return document.MM_returnValue"> เพิ่มข้อมูลใหม่ </span>
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                   <tr>
                     <td colspan="7"><%@ include file="../Templates/splitPageBar.html" %></td>
                   </tr>
                   <tr>
                    <td width="32" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                    <td width="160" class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
                    <td width="122" class="TblHeaderColumn">เลขที่หนังสือเดินทาง</td>
                    <td width="55" class="TblHeaderColumn">ประเทศ</td>
                    <td width="98" class="TblHeaderColumn">วดป เกิด (อายุ)</td>
                    <td width="252" class="TblHeaderColumn">ที่อยู่</td>
                  </tr>
                  <tr>
                    <td height="30" class="TblRow AlignCenter">1</td>
                    <td class="TblRow AlignLeft">
                      <span  class="spanLink" onClick="MM_goToURL('parent','LawBreaker.jsp?action=LawbreakerForm02');return document.MM_returnValue">
                        นางซาร่า เมด แมคเฟอร์สัน
                      </span>
                    </td>
                    <td class="TblRow AlignLeft">B654321</td>
                    <td class="TblRow AlignLeft">ออสเตรเลีย</td>
                    <td class="TblRow AlignLeft">15/10/2515 (37)</td>
                    <td class="TblRow AlignLeft">22 ซอยรามคำแหง33 หัวหมาก บางกะปิ กทม</td>
                  </tr>
                  <tr>
                    <td height="30" class="TblRow AlignCenter bgRowGray">2</td>
                    <td class="TblRow AlignLeft bgRowGray">
                      <span  class="spanLink" onClick="MM_goToURL('parent','LawBreaker.jsp?action=LawbreakerForm02');return document.MM_returnValue">
                        นายฮิโตะิ ซาวามูระ
                      </span>
                    </td>
                    <td class="TblRow AlignLeft bgRowGray">A123456</td>
                    <td class="TblRow AlignLeft bgRowGray">ญี่ปุ่น</td>
                    <td class="TblRow AlignLeft bgRowGray">11/12/2510 (42)</td>
                    <td class="TblRow AlignLeft bgRowGray">997 ซอยพญาไท22 ถนนราชวิถี ต.ดุสิต อ.ดุสิต จ.กทม.</td>
                  </tr>
                  <tr>
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
	

