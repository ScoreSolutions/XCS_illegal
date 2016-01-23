<%@LANGUAGE="VBSCRIPT" CODEPAGE="1252"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/menu.js" ></script>
</head>
<body onLoad="MM_preloadImages('images/icon_top_mytask_02.png','images/icon_top_myprofile_02.png','images/icon_top_help_02.png')">
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td valign="top" height="100">
		<!-- Header -->
		<!--#include file = "templates/header.htm"-->
	</td>
  </tr>
  <tr>
    <td valign="top">
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td valign="top" align="left" width="200" height="100%">
				<!-- Left menu -->
				<!--#include file = "templates/leftmenu.htm"-->
			</td>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">การจับกุมและบัญชีสิ่งของกลาง</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><a href="arrest_search.asp" class="linkmenu3level">รายการการจับกุม</a><span class="logindetail">| เพิ่มรายการการจับกุม</span></td>
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
                <td><table width="750" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="24" align="left" valign="top">&nbsp;</td>
                    <td width="363" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="36%" height="25" align="right">เขียนที่ :&nbsp;</td>
                        <td width="64%"><input name="textfield" type="text" class="textbox" value="สำนักงานสรรพสามิตพื้นที่ชลบุรี พท.2">
                          <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"></td>
                      </tr>
                      <tr>
                        <td width="36%" height="25" align="right">พื้นที่ :&nbsp;</td>
                        <td width="64%"><input name="textfield" type="text" class="textbox" value="สสพ.ชลบุรี พท2">
                          <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"></td>
                      </tr>
                      <tr>
                        <td width="36%" height="25" align="right">พ.ร.บ. :&nbsp;</td>
                        <td width="64%"><input name="textfield2" type="text" class="textbox" value="พ.ร.บ.สุรา พ.ศ.2493 ">
                          <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"></td>
                      </tr>
                      <tr>
                        <td height="25" align="right">สินค้า :&nbsp;</td>
                        <td><input name="textfield3" type="text" class="textbox" value="สุรา">
                          <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"></td>
                      </tr>
                      <tr>
                        <td height="25" align="right">วันที่เกิดเหตุ :&nbsp;</td>
                        <td height="25"><input name="theDate1" type="text" value="15/10/2549" size="7" maxlength="10" />
                          <img src="images/btn_calendar.png" alt="" width="19" height="19" onClick="displayCalendar(document.forms[0].theDate1,'dd/mm/yyyy',this)">เวลา
                          <input name="textfield13" type="text" class="textbox" value="08:30" size="5" maxlength="5"></td>
                      </tr>
                      <tr>
                        <td height="25" align="right">ผู้กล่าวหา :&nbsp;</td>
                        <td><select name="select" class="select">
                          <option>เจ้าหน้าที่กรมสรรพสามิต</option>
                          <option>เจ้าหน้าที่สรรพสามิตพื้นที่สาขา</option>
                          <option>เจ้าหน้าที่สรรพสามิตภาค</option>
                          <option>เจ้าหน้าที่สรรพสามิตจังหวัด</option>
                          <option>เจ้าหน้าที่อื่นๆ</option>
                        </select></td>
                      </tr>
                      <tr>
                        <td height="25" align="right">ชื่อผู้กล่าวหา :&nbsp;</td>
                        <td><input name="textfield4" type="text" class="textbox" value="ส.ต.ท.จิรพัฒน์ แก้วอุไร ">
                          <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"></td>
                      </tr>
                      <tr>
                        <td width="36%" height="25" align="right">ตำแหน่ง :&nbsp;</td>
                        <td width="64%"><input name="textfield5" type="text" class="textbox" value="เจ้าหน้าที่ตรวจสรรพสามิต 6 "></td>
                      </tr>
                      <tr>
                        <td width="36%" height="25" align="right">สังกัด :&nbsp;</td>
                        <td width="64%"><input name="textfield6" type="text" class="textbox" value="สำนักงานสรรพสามิตพื้นที่ชลบุรี พท.2 "></td>
                      </tr>
                    </table></td>
                    <td width="363" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="36%" height="25" align="right">เลขที่งาน :&nbsp;</td>
                        <td width="64%">TN5200000254026</td>
                      </tr>
                      <tr>
                        <td height="25" align="right">วันที่รับเรื่องปราบปราม :&nbsp;</td>
                        <td><input name="theDate2" type="text" value="19/11/2552" size="7" maxlength="10" />
                          <img src="images/btn_calendar.png" alt="" width="19" height="19" onClick="displayCalendar(document.forms[0].theDate1,'dd/mm/yyyy',this)"></td>
                      </tr>
                      <tr>
                        <td height="25" align="right">ผู้ต้องหา :&nbsp;</td>
                        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="9%"><input name="radiobutton" type="radio" value="radiobutton" checked></td>
                            <td width="15%" align="left">มีตัว&nbsp;</td>
                            <td width="9%" align="left"><input name="radiobutton" type="radio" value="radiobutton"></td>
                            <td width="67%">ไม่มีตัว</td>
                          </tr>
                        </table></td>
                      </tr>
                      <tr>
                        <td height="25" align="right">ประเภทผู้ต้องหา :&nbsp;</td>
                        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="9%"><input name="radiobutton" type="radio" value="radiobutton" checked></td>
                            <td width="33%" align="left">บุคคลทั่วไป&nbsp;</td>
                            <td width="9%" align="left"><input name="radiobutton" type="radio" value="radiobutton"></td>
                            <td width="49%">ผู้ประกอบการ</td>
                          </tr>
                        </table></td>
                      </tr>
                      <tr valign="top">
                        <td height="25" align="right">สถานที่เกิดเหตุ :&nbsp;</td>
                        <td><textarea name="textfield7" rows="3" class="textarea">ร้านไม่มีเลขที่ หมู่ 2 </textarea></td>
                      </tr>
                      <tr>
                        <td width="36%" height="25" align="right">ตำบล :&nbsp;</td>
                        <td width="64%"><input name="textfield8" type="text" class="textbox" value="ทุ่งสุขลา" size="10"></td>
                      </tr>
                      <tr>
                        <td height="25" align="right">อำเภอ :&nbsp;</td>
                        <td><input name="textfield9" type="text" class="textbox" value="ศรีราชา" size="10">
                          <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"></td>
                      </tr>
                      <tr>
                        <td height="25" align="right">จังหวัด :&nbsp;</td>
                        <td><input name="textfield10" type="text" class="textbox" value="ชลบุรี" size="10">
                          <img src="images/btn_browse.png" alt="" width="18" height="19" align="absmiddle"></td>
                      </tr>
                    </table></td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td colspan="2" align="center">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td colspan="2" align="center"><input type="submit" name="Submit" value="  บันทึก  " class="button">&nbsp;
                      <input type="reset" name="Submit2" value="  ยกเลิก  " class="button"></td>
                    </tr>
                  <tr>
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
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
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
    <td>
		<!-- Footer -->
		<!--#include file = "templates/footer.htm"-->
	</td>
  </tr>
</table>

</body>
</html>
