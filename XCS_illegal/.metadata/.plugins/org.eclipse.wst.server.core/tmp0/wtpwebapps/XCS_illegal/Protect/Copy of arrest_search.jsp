<%@ page contentType="text/html; charset=UTF-8" %>

		<!-- Header -->
		<%@ include file="../Templates/header.jsp" %>

  <tr>
    <td valign="top">
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">บันทึกการจับกุม</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><a href="Protect.jsp?action=ArrestForm" class="linkmenu3level">เพิ่มข้อมูล</a></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                  <%@ include file="../Protect/arrest_search_conditions.jsp" %>
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                   <tr>
                     <td colspan="9"><%@ include file="../Templates/splitPageBar.html" %></td>
                   </tr>
                  <tr class="TblHeaderColumn AlignCenter">
                    <td width="40">ลำดับ</td>
				<td width="60" >เลขที่งาน</td>
                    <td width="180" >หน่วยงาน</td>
                    <td width="110" >ผู้กล่าวหา</td>
                    <td width="110" >ผู้ต้องหา</td>
                    <td width="70" >วันที่เกิดเหตุ</td>
                    <td width="70" >วันที่รับรอง</td>
                    <td width="140">พ.ร.บ.</td>
                    <td width="57" >&nbsp;</td>
                  </tr>
                  <tr  class="TblRow AlignCenter">
                    <td>1</td>
					 <td><a href="Protect.jsp?action=ArrestForm" class="linkdatarow">TN52000000148026</a></td>
                    <td >สำนักงานสรรพสามิตพื้นที่ชลบุรี พท.2</td>
                    <td >นายสุวิทย์ โตปาน</td>
                    <td >นายดำ หมีแดง</td>
                    <td >15/10/2549</td>
                    <td >19/02/2552</td>
                    <td >พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</td>
                    <td >
                      <img src="images/icn_copy.png" width="25" height="25" border="0" alt="คัดลอก" style="cursor:hand;">
                      <img src="images/icon_delete.gif" width="25" height="25" border="0" alt="ลบ" style="cursor:hand;">
				</td>
                  </tr>
                  <tr>
                    <td class="TblRow AlignCenter bgRowGray">2</td>
					<td class="TblRow AlignLeft bgRowGray"><a href="Protect.jsp?action=ArrestForm" class="linkdatarow">TN52000000148026</a></td>
                    <td class="TblRow AlignLeft bgRowGray">สำนักงานสรรพสามิตพื้นที่ชลบุรี พท.2</td>
                    <td class="TblRow AlignLeft bgRowGray">ส.ต.ท.จิรพัฒน์ แก้วอุไร</td>
                    <td class="TblRow AlignLeft bgRowGray">นางสมนึก แซ่เฮ้ง</td>
                    <td class="TblRow AlignLeft bgRowGray">11/12/2550</td>
                    <td class="TblRow AlignLeft bgRowGray"><span class="TblRow AlignLeft">19/11/2552</span></td>
                    <td class="TblRow AlignLeft bgRowGray">พ.ร.บ.สุรา พ.ศ.2493</td>
                    <td class="TblRow AlignCenter bgRowGray">
                      <img src="images/icn_copy.png" width="25" height="25" border="0" alt="คัดลอก" style="cursor:hand;">
                      <img src="images/icon_delete.gif" width="25" height="25" border="0" alt="ลบ" style="cursor:hand;">
				</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
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
  <tr>
    <td>
		<!-- Footer -->
		<%@ include file = "../Templates/footer.jsp"%>
	</td>
  </tr>
</table>

</body>
</html>
