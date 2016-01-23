<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>

		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">การเพิ่ม-ลดค่าปรับเปรียบเทียบ </span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><a href="CompareCase.jsp?action=IncRedForm" class="linkmenu3level">เพิ่มข้อมูล</a></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
                  <tr>
                    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
                    <td width="98%"></td>
                    <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td align="center" valign="top">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							 <td colspan="4" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
						  </tr>
						  <tr>
								<td  align="right">เลขที่คดีเปรียบเทียบปรับ  :&nbsp;</td>
								<td colspan="3"><input name="textfield" type="text" size="20" maxlength="20" class="textinput"></td>
						  </tr>
						  <tr>
							<td width="30%" align="right">วันที่เปรียบเทียบปรับ : &nbsp;</td>
							<td width="70%" colspan="3">
								<input type="Text" name="SuspectDetail2" id="SuspectDetail2" class="textdate"/>
								<img src="images/btn_calendar.png" width="19" height="19" border="0">&nbsp;&nbsp;
								ถึง :&nbsp;
								<input type="Text" name="SuspectDetail2" id="SuspectDetail2"  class="textdate"/>
								<img src="images/btn_calendar.png" width="19" height="19" border="0">
						  </tr>
						  <tr>
								<td  align="right">พ.ร.บ. :&nbsp;</td>
								<td colspan="3">
									<select name="sLegislation" id="sLegislation" style="width:200px;" OnChange="selectLegislation('sLegislation');">
										<option value="90" selected>90 พ.ร.บ. สุรา พ.ศ.2493</option>
										<option value="91" >91 พ.ร.บ.ยาสูบ พ.ศ.2509</option>
										<option value="92" >92 พ.ร.บ.ไพ่</option>
										<option value="00" >00 พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>
									</select>
								</td>
						  </tr>
						  <tr>
		                    <td align="right">หน่วยงาน :&nbsp;</td>
		                    <td height="25">
		                       <input type="text" name="textfield15" size="4"  class="textbox"  value="009000" >
		                       <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
		                            onClick="window.open('Popup/division_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');" >
		                       <input type="text" name="textfield15" size="16"  class="textbox"  value="กรุงเทพ 1" >
		                    </td>
						  </tr>
						  <tr>
								<td  align="right">ประเภทการปรับ :&nbsp;</td>
								<td colspan="3">
									<input name="radiobutton" type="radio" value="radiobutton" checked >ทั้งหมด&nbsp;&nbsp;&nbsp;
									<input name="radiobutton" type="radio" value="radiobutton">ปรับเพิ่ม&nbsp;&nbsp;&nbsp;
									<input name="radiobutton" type="radio" value="radiobutton">ปรับลด
								</td>
						  </tr>
                                <tr>
                                  <td colspan="4" align="center" ><img src="images/btn_search_big.png" width="64" height="22"></td>
                                </tr>
						</table>
					</td>
                  </tr>
                  <tr>
                    <td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
                    <td></td>
                    <td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
                  </tr>
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table class="tableList" width="800" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                  <tr>
                    
                  </tr>
                  <tr valign="middle">
                    <td width="46" height="16" class="TblHeaderColumn AlignCenter">ลำดับที่</td>
                    <td width="150" class="TblHeaderColumn AlignCenter">เลขที่คดีเปรียบเทียบปรับ</td>
                    <td width="75" class="TblHeaderColumn AlignCenter">ประเภท</td>
                    <td width="170" class="TblHeaderColumn AlignCenter">ค่าปรับเปรียบเทียบคดีใหม่</td>
                    <td width="94" class="TblHeaderColumn AlignCenter">จำนวนผู้ต้องหา</td>
                    <td width="170" class="TblHeaderColumn AlignCenter">ค่าปรับเปรียบเทียบคดีเดิม</td>
                  </tr>
                  <tr valign="top">
                    <td class="TblRow AlignCenter">1</td>
                    <td class="TblRow AlignLeft"><a href="CompareCase.jsp?action=IncRedForm">0001/2553</a></td>
                    <td class="TblRow AlignLeft">เพิ่ม</td>
                    <td class="TblRow "><div align="right">3000.00</div></td>
                    <td class="TblRow AlignLeft"><div align="right">5</div></td>
                    <td class="TblRow AlignLeft"><div align="right">2000.00</div></td>

                  </tr>
                  <tr valign="top" class="bgRowGray">
                    <td class="TblRow AlignCenter">2</td>
                    <td class="TblRow AlignLeft"><a href="CompareCase.jsp?action=IncRedForm">0002/2553</a></td>
                    <td class="TblRow AlignLeft">ลด</td>
                    <td class="TblRow "><div align="right">500.00</div></td>
                    <td class="TblRow AlignLeft"><div align="right">1</div></td>
                    <td class="TblRow AlignLeft"><div align="right">1000.00</div></td>

                  </tr>
                  <tr valign="top">
                    <td class="TblRow AlignCenter">3</td>
                    <td class="TblRow AlignLeft"><a href="CompareCase.jsp?action=IncRedForm">0003/2553</a></td>
                    <td class="TblRow AlignLeft">เพิ่ม</td>
                    <td class="TblRow "><div align="right">6000.00</div></td>
                    <td class="TblRow AlignLeft"><div align="right">3</div></td>
                    <td class="TblRow AlignLeft"><div align="right">4000.00</div></td>

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

	 

