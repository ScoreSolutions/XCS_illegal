<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>

<table width="800" border="0" cellspacing="0" cellpadding="0" >
	  <tr >
		<td colspan="4">&nbsp; </td>
	  </tr>
	  <tr class="bgRowGray">
         <td colspan="4"><strong>รายละเอียดบันทึกการจับกุม</strong> <font color="red"><i>(File Include)</i></font></td>
	  </tr>
	  <tr >
		<td colspan="4">&nbsp; </td>
	  </tr>
	  <tr>
		<td width="20%" height="25" align="right" >เลขที่งาน :&nbsp;</td>
		<td width="30%"><input type="text" name="textfield15" size="25" class="textview" readonly value="TN52000000148026" ></td>
		<td width="20%" height="25" align="right">วันที่เขียนบันทึกจับกุม :&nbsp;</td>
		<td width="30%">
			<input name="theDate2" type="text" class="textdate" readonly value="01/10/2552"  />
			<img src="images/btn_calendar.png" alt="" width="19" height="19"  />
		</td>
	  </tr>
	  <tr>
		<td  height="25" align="right">เขียนที่ :&nbsp;</td>
		<td >
			<input type="text" name="textfield15" size="4"  class="textbox"  value="0090020"  >
               <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                    onClick="window.open('Popup/division_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');"  />
			<input type="text" name="textfield15" size="14"  class="textbox"  value="ฝ่ายพิสูจน์ของกลาง"  />
			<font style="color:red">*</font>
		</td>
		<td height="25" align="right">วันที่เกิดเหตุ :&nbsp;</td>
		<td height="25"><input name="theDate2" type="text" class="textdate" readonly value="01/10/2552"     />
		  <img src="images/btn_calendar.png" alt="" width="19" height="19"  />เวลา
		  <input name="textfield12" type="text" class="textbox" size="5" maxlength="5" value="08:30"  />
		  <font style="color:red">*</font>
		</td>
	  </tr>
	  <tr>
		<td  height="25" align="right">พื้นที่ :&nbsp;</td>
		<td >
			<select name="s" id="s" style="width:200px;"  />
				<option value="x" selected>สสพ.กรุงเทพฯ 3</option>
                    <option value="x" >ส่วนคดี สำนักกฎหมาย</option>
			</select>
			<font style="color:red">*</font>
		</td>
		<td  height="25" align="right">ผู้กระทำผิด :&nbsp;</td>
		<td >
			<input name="lawbreakertype" type="radio" value="P"  />บุคคลทั่วไป &nbsp;&nbsp;
			<input name="lawbreakertype" type="radio" value="C"  />ผู้ประกอบการ&nbsp;&nbsp;
			<font style="color:red">*</font>
		</td>
	  </tr>
	  <tr>
		<td  height="25" align="right">พ.ร.บ. :&nbsp;</td>
		<td >
			<select name="sLegislation" id="sLegislation" style="width:200px;" >
				<option value="90" selected>90 พ.ร.บ. สุรา พ.ศ.2493</option>
				<option value="91" >91 พ.ร.บ.ยาสูบ พ.ศ.2509</option>
				<option value="92" >92 พ.ร.บ.ไพ่</option>
				<option value="00" >00 พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>
			</select>
			<font style="color:red">*</font>
		</td>
		<td  height="25" align="right">มีตัวผู้กระทำผิด :&nbsp;</td>
		<td >
            <input name="isLawbreaker" id="isLawbreakerY" type="radio" value="Y" onclick="toggle();"  />มีตัว &nbsp;&nbsp;
            <input name="isLawbreaker" id="isLawbreakerN" type="radio" value="N" onclick="toggle();"  />ไม่มีตัว&nbsp;&nbsp;
			<input name="chkIsCourt" id="chkIsCourt" type="checkbox" disabled onclick="toggle();"  />ส่งฟ้องศาล&nbsp;&nbsp;
            <font style="color:red">*</font>
		</td>
	  </tr>
	  <tr>
			<td height="25" align="right">สินค้า :&nbsp;</td>
			<td >
				<select name="s" id="s" style="width:200px;" >
					<option value="x" selected>90 สุรา</option>
				</select>
				<font style="color:red">*</font>
			</td>
		  <td align="right" valign="top">ประมาณการค่าปรับ :&nbsp;</td>
		  <td valign="top" colspan="3"><input type="text" name="txtEstimateFine" id="txtEstimateFine" class="textNum" onkeypress="CtlMinusDbl(this);" size="10" value="5,000.00" disabled   /> บาท</td>

	  </tr>



       <tr height="25">
         <td align="right" valign="top">ผู้กล่าวหา :&nbsp;</td>
         <td colspan="3">
           <table border="0" cellpadding="0" cellspacing="0">
             <tr>
               <td>
			   		<input name="accuserType" type="radio" value="2" checked  >เจ้าหน้าที่กรมสรรพสามิต
			   </td>
               <td>
					<input name="accuserType" type="radio" value="3"  >เจ้าหน้าที่สรรพสามิตภาค

			   </td>
               <td  align="right">ชื่อผู้กล่าวหา :&nbsp;</td>
               <td>
                   <input type="text" name="textfield12" class="textview" size="31" value="นายปัณณวิชญ์ สันติประสิทธิ์กุล">
                   <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                        onClick="window.open('Popup/arrest_accuser_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');"  />
                        <font style="color:red">*</font>
               </td>
             </tr>
             <tr>
                <td>
					<input name="accuserType" type="radio" value="1"  >เจ้าหน้าที่สรรพสามิตพื้นที่
				</td>
                <td><input name="accuserType" type="radio" value="4"  >เจ้าหน้าที่สรรพสามิตพื้นที่สาขา</td>
                <td align="right">ตำแหน่ง :&nbsp;</td>
                <td ><input type="text" name="textfield12" class="textview" size="35" value="ผู้ดูแลระบบ"></td>
             </tr>
             <tr>
                <td colspan="2"><input name="accuserType" type="radio" value="5"  >เจ้าหน้าที่อื่นๆ</td>
                <td align="right">สังกัด :&nbsp;</td>
                <td ><input type="text" name="textfield12" class="textview" size="35" value="กรมสรรพสามิต"></td>
             </tr>
           </table>
         </td>

       </tr>
       <tr><td height="25">&nbsp;</td></tr>
	  <tr height="25">
		<td  height="25" align="right">ชื่อสถานที่เกิดเหตุ :&nbsp;</td>
		<td >
			<input name="textfield12" type="text" class="text" size="25" maxlength="5" value="หมู่บ้านวิลล่า" />
			<font style="color:red">*</font>
		</td>
		<td height="25" align="right">จังหวัด :&nbsp;</td>
		<td>
			<select name="sProvince" id="sProvince"  style="width:200px;" >
				<option value="x" selected>กรุงเทพมหานคร</option>
				<option value="x">กระบี่</option>
				<option value="x">ขอนแก่น</option>
			</select>
			<font style="color:red">*</font>
		</td>
	  </tr>
	  <tr height="25">
		<td  height="25" align="right">บ้านเลขที่ :&nbsp;</td>
		<td >
			<input name="textfield12" type="text" class="text" size="8" maxlength="5" value="111" > &nbsp;&nbsp;
			หมู่ : <input name="textfield12" type="text" class="text" size="5" maxlength="5" value="1" >
		</td>
          <td height="25" align="right">อำเภอ :&nbsp;</td>
		<td>
			<select name="sDistrict" id="sDistrict" style="width:200px;" >
				<option value="x">เขตพระนคร</option>
				<option value="x" >เขตห้วยขวาง</option>
				<option value="x">เขตดุสิต</option>
				<option value="x" selected>เขตราชเทวี</option>
			</select>
			<font style="color:red">*</font>
		 </td>
	  </tr>
	  <tr height="25">
		<td  height="25" align="right">ซอย :&nbsp;</td>
		<td ><input name="textfield12" type="text" class="text" size="25" maxlength="5" value="ซอย 2" ></td>
		<td height="25" align="right">ตำบล :&nbsp;</td>
		<td>
			<select name="sSubDistrict" id="sSubDistrict" style="width:200px;" >

				<option value="x" selected>แขวงมักกะสัน</option>
				<option value="x">แขวงทุ่งสองห้อง</option>
				<option value="x">แขวงบางกะปิ</option>
				<option value="x">แขวง</option>
			</select>
			<font style="color:red">*</font>
		 </td>
	  </tr>
       <tr height="25">
		<td  height="25" align="right">ถนน :&nbsp;</td>
		<td ><input name="textfield12" type="text" class="text" size="25"  value="ทางหลวงชนบท" ></td>
          <td align="right">สถานีตำรวจท้องที่เกิดเหตุ :&nbsp;</td>
          <td><input name="textfield12" type="text" class="text" size="25" value="สน.ดุสิต" >(ส.ส.2/54)</td>
       </tr>
       <tr>
          <td height="25" align="right">จำนวนผู้กระทำผิด :&nbsp;</td>
          <td height="25" >
            2 คน &nbsp;&nbsp;&nbsp;
            <input name="alleged_co" type="checkbox" disabled checked >ข้อกล่าวหาร่วมกัน
          </td>
          <td height="25" align="right">ละติจูด :&nbsp;</td>
          <td>
             <input name="textfield12" type="text" class="text" size="5" >&nbsp;&nbsp;&nbsp;
             ลองติจูด :&nbsp;&nbsp;<input name="textfield12" type="text" class="text" size="5" >
          </td>
	  </tr>
       <tr>
          <td colspan="4" height="25" align="right">&nbsp;</td>
       </tr>
</table>