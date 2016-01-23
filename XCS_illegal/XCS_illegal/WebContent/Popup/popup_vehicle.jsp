<%@ page contentType="text/html; charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>

<link href="../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
</head>
<body>
<table width="500" height="350" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td align="left" valign="top"><table width="550" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ยานพาหนะที่เกี่ยวข้อง</span></td>
            </tr>
			<tr>
				<td colspan="2">
					<input name="btnSave"  type="button" class="barbutton" value="บันทึก" >
					<input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" >
					<input name="btnBack"  type="button" class="barbutton" value="กลับ" >
				</td>
			</tr>
            <tr>
              <td>&nbsp;</td>
              <td><table width="100%" border="0" cellpadding="0" cellspacing="0" bordercolor="#6666FF">
                <tr>
                  <td height="30" align="right" >จังหวัด&nbsp;:&nbsp;</td>
                  <td><select name="select3" style="width:180px">
                    <option>กรุงเทพมหานคร</option>
                    <option>ชลบุรี</option>
                    <option>นนทบุรี</option>
                    <option>ปทุมธานี</option>
                    <option>สมุทรสาคร</option>
                    <option>อยุธยา</option>
                                    </select>
					</td>
                </tr>
                <tr>
                  <td height="30" align="right">ประเภทรถ&nbsp;:&nbsp;</td>
                  <td>
					<select name="select" style="width:180px">
                      <option>รถเก๋ง</option>
                      <option>รถกระบะ</option>
                      <option>รถบรรทุกสิบล้อ</option>
                      <option>รถจักรยานยนต์</option>
                    </select>
					</td>
                </tr>
                <tr>
                  <td width="20%" height="30" align="right">หมวดเลข/อักษร&nbsp;:&nbsp;</td>
                  <td width="80%">
					  <input name="textfield13" class="textbox" type="text" size="3" maxlength="2" />
					  <font style="color:red">*</font>
					  &nbsp;&nbsp;&nbsp;เลขทะเบียน :&nbsp;
					  <input name="textfield12" class="textbox" type="text" size="6" maxlength="6" />
					  <font style="color:red">*</font>
				  </td>
                </tr>
                <tr>
                  <td height="30" align="right">ยี่ห้อ :&nbsp;</td>
                  <td>
					<select name="select" style="width:180px">
                      <option>โตโยต้า</option>
                      <option>ฮอนด้า</option>
                      <option>อีซูสุ</option>
                      <option>คูโบต้า</option>
                    </select>&nbsp;&nbsp;&nbsp;
					รุ่น :&nbsp;<input name="textfield12" class="textbox" size="25" type="text" value="VIGO" />
				  </td>
                </tr>
                <tr>
                  <td height="30" align="right">สี&nbsp;:&nbsp;</td>
                  <td>
					<input name="textfield122" class="textbox" type="text" size="25" />
					</td>
                </tr>
                <tr>
                  <td align="right" valign="top">รายละเอียด :&nbsp;</td>
                  <td><textarea name="textarea" rows="4" class="textareabig"></textarea></td>
                </tr>
                <tr>
                  <td align="right" valign="top">&nbsp;</td>
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
</body>
</html>
