<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>

<script type="text/javascript" language="JavaScript">
  	function toggleHidden(mID, btnID){

		document.getElementById('app2_39').style.display='none';
		document.getElementById('lawbreaker_list').style.display='none';
		document.getElementById('arrestTeam').style.display='none';
		document.getElementById('exhibitList').style.display='none';
		document.getElementById('licenseList').style.display='none';
		document.getElementById('2_6Tab').style.display='none';

		document.getElementById('btn2_39').style.background='#D4D0C8';
		document.getElementById('btnLawbreakerList').style.background='#D4D0C8';
		document.getElementById('btnArrestTeam').style.background='#D4D0C8';
		document.getElementById('btnExhibitList').style.background='#D4D0C8';
		document.getElementById('btnlicenseList').style.background='#D4D0C8';
		document.getElementById('btn2_6').style.background='#D4D0C8';

		mnu = document.getElementById(mID);
		btn = document.getElementById(btnID);
		if (mnu.style.display == 'none'){
			mnu.style.display ='';
			btn.style.background='#FFCC33';
		}else{
			mnu.style.display ='none';
		}
	}
</script>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td width="1%">&nbsp;</td>
     <td style="cursor:hand;" width="98%" >
        <input name="btnLawbreakerList" id="btnLawbreakerList" type="button" class="button" value="รายชื่อผู้กระทำผิดกฎหมาย" onClick='toggleHidden("lawbreaker_list","btnLawbreakerList");' style="background:#FFCC33">&nbsp;&nbsp;
        <input name="btn2_39" id="btn2_39" type="button" class="button" value="บันทึกการจับ" onClick='toggleHidden("app2_39", "btn2_39");' >&nbsp;&nbsp;
        <input name="btnArrestTeam" id="btnArrestTeam" type="button" class="button" value="คณะผู้จับกุม" onClick='toggleHidden("arrestTeam","btnArrestTeam");'>&nbsp;&nbsp;
        <input name="btnExhibitList" id="btnExhibitList" type="button" class="button" value="บัญชีสิ่งของ" onClick='toggleHidden("exhibitList","btnExhibitList");'>&nbsp;&nbsp;
        <input name="btnlicenseList" id="btnlicenseList" type="button" class="button" value="ข้อมูลใบอนุญาต/ข้อมูลสืบสวน" onClick='toggleHidden("licenseList","btnlicenseList");'>&nbsp;&nbsp;
		<input name="btn2_6" id="btn2_6" type="button" class="button" value="รายงานบันทึกการจับ 2/6ก" onClick='toggleHidden("2_6Tab","btn2_6");'>
     </td>
     <td width="1%" >&nbsp;

     </td>
  </tr>
  <tr >
     <td>&nbsp;</td>
     <td>
          <!-- รายชื่อผู้กระทำความผิด-->
          <div class="innerPosition" id="lawbreaker_list" >
               <table  border="0" cellspacing="0" cellpadding="0" >

						<tr>
							 <td>
								  <span class="spanLink"
									   onClick="window.open('process?action=arrest_lawbreaker&cmd=add' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=700,height=500,top=120,left=400,modal=yes');"
									   > เพิ่มใหม่</span> | <span  class="spanLink">ลบรายการที่เลือก</span></td>
						</tr>

                    <tr>
                         <td>

                                <table name="lawblist" id="lawblist" class="tableList" width="3000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                                   <tr>
                                     <td class="TblHeaderColumn aligncenter">ลำดับที่</td>
                                     <td class="TblHeaderColumn aligncenter"><input name="chkAll" type="checkbox" /></td>
                                     <td class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
                                     <td class="TblHeaderColumn">ประเภทผู้กระทำความผิด</td>
                                     <td class="TblHeaderColumn">อาชีพ</td>
                                     <td class="TblHeaderColumn">อายุ</td>
                                     <td class="TblHeaderColumn">เลขที่บัตรปชช</td>
                                     <td class="TblHeaderColumn">เลขที่หนังสือเดินทาง</td>
                                     <td class="TblHeaderColumn">เชื้อชาติ</td>
                                      <td class="TblHeaderColumn">สัญชาติ</td>
                                     <td class="TblHeaderColumn">ที่อยู่</td>
                                     <td class="TblHeaderColumn">ชื่อบิดา</td>
                                     <td class="TblHeaderColumn">ชื่อมารดา</td>
                                     <td class="TblHeaderColumn">คำยินยอมของผู้ต้องหา</td>
                                     <td class="TblHeaderColumn">คำให้การของผู้ต้องหา</td>
                                     <td class="TblHeaderColumn">${aa.administration}</td>
                                   </tr>
                                   <tr>
                                     <td class="TblRow aligncenter">1</td>
                                     <td class="TblRow aligncenter"><input name="chk1" type="checkbox"  /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">

											<span class="spanLink"
									   onClick="window.open('Popup/arrest_lawbreaker_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=700,height=500,top=120,left=400,modal=yes');">
											</span>

											${ti.title_name}${aal.first_name} ${aal.last_name}
											<input type="hidden" name="first_name"  value="${aal.first_name}" />
											<input type="hidden" name="last_name"  value="${aal.last_name}" />

                                     </td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${aal.culprit_type}<input type="hidden" name="culprit_type"  value="${aal.culprit_type}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${aal.career}<input type="hidden" name="carreer"  value="${aal.career}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${aal.birth_date}<input type="hidden" name="birthdate"  value="${aal.birth_date}" /> </td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${aal.lawbreaker_id_card}<input type="hidden" name="lawbreaker_id_card"  value="${aal.lawbreaker_id_card}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${aal.lawbreaker_passport}<input type="hidden" name="lawbreaker_passport"  value="${aal.lawbreaker_passport}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${na.nation_name}<input type="hidden" name="nation_name"  value="${na.nation_name}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${ra.race_name}<input type="hidden" name="race_name"  value="${ra.race_name}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">บ้านเลขที่ 2/6 หมู่4 ตำบลปากเพรียว อำเภอเมือง จังหวัดสระบุรี</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${aal.father_name}<input type="hidden" name="father_name"  value="${aal.father_name}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${aal.mother_name}<input type="hidden" name="mother_name"  value="${aal.mother_name}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${aa.behaviour}<input type="hidden" name="behaviour"  value="${aa.behaviour}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">${aa.testimony}<input type="hidden" name="testimony"  value="${aa.testimony}" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft"><span class="TblHeaderColumn">${aa.administration}<input type="hidden" name="administration"  value="${aa.administration}" /></span></td>
                                   </tr>
                                   <tr class="bgRowGray">
                                     <td class="TblRow aligncenter">2</td>
                                     <td class="TblRow aligncenter"><input name="chk2" type="checkbox" /></td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">

											<span class="spanLink"
									   onClick="window.open('Popup/arrest_lawbreaker_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=700,height=500,top=120,left=400,modal=yes');">นายเกตติ้ง ณ ราชวัตร
											</span>

											นายเกตติ้ง ณ ราชวัตร

                                     </td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">บุคคลทั่วไป</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">รับจ้าง</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">27 ปี</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">3100500479543</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">-</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">ไทย</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">ไทย</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">11/3 ตำบลคลองลึก อำเภอนายม จังหวัดสกลนคร</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">นายสี ณ ราชวัตร</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">นางสา ณ ราชวัตร</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">ยินยอม</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">-</td>
                                     <td align="left" valign="top" class="TblRow AlignLeft">-</td>
                                   </tr>
                                </table>

                         </td>
                    </tr>
               </table>
          </div>
          <!-- END รายชื่อผู้กระทำความผิด-->

          <!-- บันทึกจับกุม-->
         <div class="innerPosition"  id="app2_39" style="width:750px;display:none">
                 <table border="0" cellspacing="0" cellpadding="0"  width="100%">

                    <tr>
                         <td colspan="2" align="center">
                              <table width="100%">
                                 <tr valign="top">
                                     <td width="155"  align="right">พฤติการณ์ในการจับ :</td>
                                     <td ><textarea name="behaviour" id="behaviour" cols="45" rows="3" class="textareabig"  >${aa.behaviour}</textarea></td>
                                </tr>
                                <tr valign="top">
                                     <td  align="right">คำให้การของผู้ต้องหา :</td>
                                     <td ><textarea name="textarea" id="testimony" cols="45" rows="3" class="textareabig"  >${aa.testimony}</textarea></td>
                                </tr>
                                <tr valign="top">
                                     <td   align="right">การดำเนินการ :</td>
                                     <td ><textarea name="administration" id="administration" cols="45" rows="3" class="textareabig"  >${aa.administration}</textarea></td>
                                </tr>
                                <tr valign="top">
                                     <td   align="right">เวลาที่ตรวจค้นเสร็จ:</td>
                                     <td ><input name="finished_time" type="text" class="textbox"  size="5" maxlength="5" value="09:30"  >${aa.finished_time}</td>
                                </tr>
                              </table>
                         </td>
                     </tr>
               </table>
          </div>
          <!-- END บันทึกจับกุม-->

          <!-- คณะที่เข้าตรวจค้น-->
          <div class="innerPosition" id="arrestTeam" style="display:none">
               <table border="0" cellpadding="0" cellspacing="0">
                    <tr>
                         <td>

                              <span class="spanLink"
                                   onClick="window.open('Popup/divide_staff_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=600,top=200,left=400,modal=yes');"
                                   > เพิ่มใหม่</span> | <a href="#" class="linkmenu3level">ลบรายการที่เลือก</a>

						</td>
                    </tr>
                    <tr>
                         <td>

                                   <table name="teamlist" id="teamlist" class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                                             <tr>
                                             <td  height="15" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                                             <td class="TblHeaderColumn aligncenter"><input name="chkAll" type="checkbox"  /></td>
                                             <td  class="TblHeaderColumn ">รหัสสายตรวจ</td>
                                             <td  class="TblHeaderColumn ">ชื่อ</td>
                                             <td  class="TblHeaderColumn ">ตำแหน่ง</td>
                                             <td  class="TblHeaderColumn ">ชื่อสังกัด</td>
                                             <td  class="TblHeaderColumn ">ในฐานะ</td>
                                          </tr>
                                          <tr>
                                                  <td class="TblRow AlignCenter">1</td>
                                                  <td class="TblRow aligncenter"><input name="chk1" type="checkbox"  /></td>
                                                  <td class="TblRow AlignLeft">${aat.inspector_code}<input type="hidden" name="inspector_code"  value="${aat.inspector_code}" /></td>
                                                  <td class="TblRow AlignLeft">{ti.title_name}  {aat.staff_name} {aat.staff_lastname} <input type="hidden" name="staff_idcardno   "  value="${aat.staff_idcardno}" /></td>
                                                  <td class="TblRow AlignLeft">${aat.staff_position}<input type="hidden" name="staff_position"  value="${aat.staff_position}" /></td>
                                                  <td class="TblRow AlignLeft">${ed.offname}</td>
                                                  <td class="TblRow AlignLeft">
                                                    <select style="width:100" name="duty_status_id" >
                                                      <option value="0">เลือก</option>
                                                      <option value="1" <c:if test="${aat.duty_status_id == 1}" > checked </c:if> >ผู้จับกุม</option>
                                                      <option value="2"<c:if test="${aat.duty_status_id == 2 }" >checked </c:if>>ผู้ร่วมจับกุม</option>
                                                      <option value="3"<c:if test="${aat.duty_status_id == 3 }" >checked </c:if>>ผู้สั่งการ</option>
                                                      <option value="4" <c:if test="${aat.duty_status_id == 4 }"> checked </c:if>>ผู้ช่วยเหลือ</option>
                                                    </select>
                                                  </td>
                                          </tr>
                                          <tr>
                                                  <td class="bgRowGray AlignCenter" >2</td>
                                                  <td class="TblRow aligncenter"><input name="chk1" type="checkbox"   /></td>
                                                  <td class="bgRowGray AlignLeft">4.4</td>
                                                  <td class="bgRowGray AlignLeft">นายสุรพร ศุกรสุนทร </td>
                                                  <td class="bgRowGray AlignLeft">นายตรวจสรรพสามิต 5 </td>
                                                  <td class="bgRowGray AlignLeft">สำนักงานสรรพสามิตพื้นที่ปทุมธานี 1 </td>
                                                  <td class="bgRowGray AlignLeft">
                                                    <select style="width:100" >
                                                      <option >เลือก</option>
                                                      <option >ผู้จับกุม</option>
                                                      <option selected>ผู้ร่วมจับกุม</option>
                                                      <option >ผู้สั่งการ</option>
                                                      <option >ผู้ช่วยเหลือ</option>
                                                    </select>
                                                  </td>
                                          </tr>
                                        </table>

                              </td>
                         </tr>
               </table>
          </div>
          <!-- END คณะที่เข้าตรวจค้น-->

          <!-- บัญชีสิ่งของ-->
          <div class="innerPosition" id="exhibitList" style="display:none;">
               <table border="0" cellspacing="0" cellpadding="0" >
                    <tr>
                         <td>
                              <span class="spanLink" onClick="window.open('Popup/arrest_exhibit_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=500,height=450,top=180,left=400,modal=yes');">เพิ่มใหม่</span> |
                              <span class="spanLink">ลบรายการที่เลือก</span>

                         </td>
                    </tr>
                    <tr>
                         <td>
                                   <table name="dutylist" id="dutylist" class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" >
                                        <tr>
                                             <td width="28"  height="15" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                                             <td width="20" class="TblHeaderColumn AlignCenter"><input name="chkAll" type="checkbox" /></td>
                                             <td width="68"  class="TblHeaderColumn ">ชนิดสินค้า</td>
                                             <td width="130"  class="TblHeaderColumn ">ชื่อสินค้า</td>
                                             <td width="80"  class="TblHeaderColumn ">ใน / นอก</td>
                                             <td width="80"  class="TblHeaderColumn ">สถานะของกลาง</td>
                                             <td width="80"  class="TblHeaderColumn ">ขนาด</td>
                                             <td width="80"  class="TblHeaderColumn ">จำนวน</td>
                                             <td width="80"  class="TblHeaderColumn ">ปริมาณสุทธิ</td>
                                             <td width="97"  class="TblHeaderColumn ">ของกลางร่วม(เลขที่คดี)</td>
                                             <td width="97"  class="TblHeaderColumn ">รายละเอียด</td>
                                             <td width="97"  class="TblHeaderColumn ">หมายเหตุ</td>
                                     </tr>
                                     <tr>
                                             <td class="TblRow AlignCenter">1</td>
                                             <td class="TblRow aligncenter"><input name="chk1" type="checkbox"  /></td>
                                             <td class="TblRow AlignLeft">${dt.duty_name}</td>
                                             <td class="TblRow AlignLeft">

													<span class="spanLink" onClick="window.open('Popup/arrest_exhibit_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=500,height=450,top=180,left=400,modal=yes');">
													 ${p.product_name} ${b.brand_name}
													</span>

													สุรา ยี่ห้อ Black Lable

                                             </td>
                                             <td class="TblRow AlignLeft">${aae.isdomestic}</td>
                                             <td class="TblRow AlignLeft">${aae.status}</td>
                                             <td class="TblRow AlignLeft">${sp.size_desc} {u.thname}</td>
                                             <td class="TblRow AlignLeft">${aae.qty} {u.thname}</td>
                                             <td class="TblRow AlignLeft">${aae.netweight} {u.thname}</td>
                                             <td class="TblRow AlignCenter">
                                               <input type="checkbox" disabled  name <c:if test="${aae.isexhibitco == Y }"> checked </c:if>  />
                                             </td>
                                             <td class="TblRow AlignLeft">${aae.exhibit_desc}</td>
                                             <td class="TblRow AlignLeft">&nbsp;</td>
                                     </tr>
                                     <tr>
                                             <td class="bgRowGray AlignCenter" >2</td>
                                             <td class="TblRow aligncenter"><input name="chk1" type="checkbox" /></td>
                                             <td class="bgRowGray AlignLeft">ยาสูบ</td>
                                             <td class="bgRowGray AlignLeft">

                                                  <span class="spanLink" onClick="window.open('Popup/arrest_exhibit_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=500,height=400,top=220,left=400,modal=yes');">
                                                    บุหรี่ ยี่ห้อกรองทิพย์
                                                  </span>

													บุหรี่ ยี่ห้อกรองทิพย์

                                             </td>
                                             <td class="bgRowGray AlignLeft">ในประเทศ</td>
                                             <td class="bgRowGray AlignLeft">ยึด</td>
                                             <td class="bgRowGray AlignLeft">2 มวน</td>
                                             <td class="bgRowGray AlignLeft">24 ซอง</td>
                                             <td class="bgRowGray AlignLeft">1,500 กรัม </td>
                                             <td class="bgRowGray AlignCenter">
                                               <input type="checkbox" disabled checked /><br />(100/2553)
                                             </td>
                                             <td class="bgRowGray AlignLeft">&nbsp;</td>
                                             <td class="bgRowGray AlignLeft">&nbsp;</td>
                                     </tr>
                                   </table>

                         </td>
                    </tr>
               </table>
          </div>
          <!-- END บัญชีสิ่งของ-->

          <!-- ใบอนุญาต/ข้อมูลสืบสวน-->
          <div class="innerPosition" id="licenseList" style="display:none;">
               <table border="0" cellspacing="0" cellpadding="0" >
                   <tr class="bgRowGray">
                      <td ><strong>รายละเอียดใบอนุญาต</strong> </td>
                   </tr>
                    <tr>
                         <td>

                              <span class="spanLink" onClick="window.open('Popup/arrest_license_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=500,height=250,top=220,left=400,modal=yes');">เพิ่มใหม่</span> |
                              <span class="spanLink">ลบรายการที่เลือก</span>

                         </td>
                    </tr>
                    <tr>
                     <td>
                        <table name="aallist" id="aallist" class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" >
                             <tr  class="TblHeaderColumn">
                                  <td width="5%" >ลำดับ</td>
                                  <td width="5%" ><input name="chkAll" type="checkbox"  /></td>
                                  <td width="15%" >สำนักงาน</td>
                                  <td width="20%" >ชื่อผู้ประกอบการ</td>
                                  <td width="20%" >ชื่อสถานประกอบการ</td>
                                  <td width="15%" >ประเภทใบอนุญาต</td>
                                  <td width="10%" >เล่มที่ใบอนุญาต</td>
                                  <td width="10%" >เลขที่ใบอนุญาต</td>
                             </tr>

                             <c:forEach items="${alilist}"  var="ali" varStatus="i">
             <c:set var="Rows" value="${Rows + 1}" />
             <c:if test="${(Rows % 2) == 1}">




					<tr  class="TblRow">
									<td class="TblRow AlignCenter" align="center">${Rows}</td>
                                    <td  align="center" ><input name="chk1" type="checkbox"  /></td>
                                  <td  >   <span class="spanLink" onClick="window.open('Popup/arrest_license_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=500,height=250,top=220,left=400,modal=yes');">${ali.offname}</span>
                                  <input name="aal_offname" type="hidden" value='${ali.offname}'></td>
                                  <td  >${ali.entrepreneur}<input name="aal_entrepreneur" type="hidden"  value ='${ali.entrepreneur}'></td>
                                  <td  >${ali.establishment_name}<input name="aal_establishment_name" type="hidden" value ='${ali.establishment_name}'></td>
                                  <td  >${ali.license_type}<input name="aal_license_type" type="hidden" value ='${ali.license_type}'></td>
                                  <td  >${ali.book_no}<input name="aal_book_no" type="hidden" value ='${ali.book_no}'></td>
                                  <td  >${ali.license_no}<input name="aal_license_no" type="hidden" value ='${ali.license_no}'></td>
                             </tr>


			</c:if>
			<c:if test="${(Rows % 2) == 0}">


					<tr  class="bgRowGray">
									<td class="TblRow AlignCenter" align="center">${Rows}</td>
                                    <td  align="center" ><input name="chk1" type="checkbox"  /></td>
                                  <td  >   <span class="spanLink" onClick="window.open('Popup/arrest_license_form.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=500,height=250,top=220,left=400,modal=yes');">${ali.offname}</span>
                                  <input name="aal_offname" type="hidden" value='${ali.offname}'></td>
                                  <td  >${ali.entrepreneur}<input name="aal_entrepreneur" type="hidden"  value ='${ali.entrepreneur}'></td>
                                  <td  >${ali.establishment_name}<input name="aal_establishment_name" type="hidden" value ='${ali.establishment_name}'></td>
                                  <td  >${ali.license_type}<input name="aal_license_type" type="hidden" value ='${ali.license_type}'></td>
                                  <td  >${ali.book_no}<input name="aal_book_no" type="hidden" value ='${ali.book_no}'></td>
                                  <td  >${ali.license_no}<input name="aal_license_no" type="hidden" value ='${ali.license_no}'></td>
                      </tr>
			</c:if>
			</c:forEach>


                        </table>
                     </td>
                   </tr>
                   <tr >
                      <td >&nbsp; </td>
                   </tr>
                   <tr class="bgRowGray">
                      <td ><strong>รายละเอียดในการสืบสวน</strong> </td>
                   </tr>
                   <tr >
                      <td >&nbsp; </td>
                   </tr>
                   <tr>
                     <td>
                       <table border="0" cellspacing="0" cellpadding="0" width="500">
                         <tr>
                           <td width="30%" align="right">
                             เลขที่การแจ้งความ :&nbsp;
                           </td>
                           <td width="70%">
                             <input type="text" id="notice_no" name="notice_no" class="textview" size="25" value="${db.notice_no}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
                             <input type="hidden" id="application_notice_arrest_id" name="application_notice_arrest_id" class="textview" size="25" value="${db.application_notice_arrest_id}" >
                           </td>
                         </tr>
                         <tr>
                           <td align="right">
                              ชื่อผู้แจ้งเบาะแส :&nbsp;
                           </td>
                           <td>
                              <input type="text"  name="imform_name" class="textview" size="40" value="${ana.imform_name}" >
                              
                           </td>
                         </tr>
                         <tr>
                           <td  align="right">
                             เลขที่หมายค้น :&nbsp;
                           </td>
                           <td >111444555666
                             <input type="text" class="textview" size="25" id="warrant_no" name="warrant_no" value="${asw.warrant_no}">
                             <input type="hidden" class="textview" size="25" id="application_search_warrant_id" name="application_search_warrant_id" value="${db.application_search_warrant_id}">
                             <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                                  onClick="window.open('Popup/searchwarrant_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=700,height=500,top=220,left=400,modal=yes');" >
                             <a href="Invest.jsp?action=SearchwarrantForm" target="_blank"><img src="images/btn_search_big.png" width="64" height="22" border="0"></a>
                           </td>
                         </tr>
                         <tr>
                           <td  align="right">
                             เลขที่ สส.2/27 :&nbsp;
                           </td>
                           <td >
                             <input type="text"  name="track_no" class="textview" size="25" value="${asi.track_no}">
                             <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                                  onClick="window.open('Popup/sincere_confirm_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=700,height=500,top=220,left=400,modal=yes');"   />
                             <a href="Invest.jsp?action=2_27Form" target="_blank"><img src="images/btn_search_big.png" width="64" height="22" border="0"></a>
                           </td>
                         </tr>
                       </table>

                     </td>
                   </tr>
               </table>
          </div>

          <!--END ใบอนุญาต-->













          <!-- รายงานบันทึกการจับกุม 2/6ก-->
         <div class="innerPosition"  id="2_6Tab" style="width:750px;display:none">
                 <table border="0" cellspacing="0" cellpadding="0"  width="100%">
                      <tr>
                           <td width="50%" valign="top">
                                <table border="0" cellspacing="0" cellpadding="0"  width="100%">
                                     <tr  >
                                          <td height="25" align="right">วันที่บันทึกรายงาน :&nbsp;</td>
                                          <td height="25">
                                                    <input name="arrest_report_date" type="text" class="textdate" readonly value="<fmt:formatDate pattern="dd-MM-yyyy" value="${aa.arrest_report_date}" timeZone="th-TH" >" />
													 <a href="javascript:NewCssCal('arrest_report_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
                                           </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">ผู้ครอบครองสถานที่ :&nbsp;</td>
                                          <td >
                                               <input name="owner_name" type="text" class="textbox" size="25" maxlength="5"  value="${aa.owner_name}"  >

                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">ชื่อกิจการ :&nbsp;</td>
                                          <td >
                                               <input name="business_name" type="text" class="textbox" size="25" maxlength="5" value=${aa.business_name}  >

                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">ชื่อผู้รับรอง :&nbsp;</td>
                                          <td >
                                               <input name="surety_name" type="text" class="textbox" size="25" maxlength="5"  value="${aa.surety_name}">

                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">เรียน(ตำแหน่งหัวหน้างาน) :&nbsp;</td>
                                          <td >
                                               <input name="leader_position" type="text" class="textbox" size="25" maxlength="5" value="${aa.leader_position}">

                                          </td>
                                     </tr>
                                </table>
                           </td>
                           <td  width="50%" valign="top">
                                <table border="0" cellspacing="0" cellpadding="0"  width="100%">
                                     <tr  >
                                          <td height="25" ><input name="guilty" type="checkbox" disabled  <c:if test="${aa.guilty == 'Y' }" > checked </c:if> value = 'Y' /> &nbsp;มีความผิด</td>
                                          <td height="25">&nbsp;

                                           </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">รายงานต่อ(ส.ส.2/6ก) :&nbsp;</td>
                                          <td >
                                            <input type="text" name="report_to_name" class="textview" size="31" value="${db.report_to}"  />
                                            <input type="hidden" name="report_to" class="textview" size="31" value="${db.report_to}"  />
                                            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick="window.open('process?action=Divide_staff_pop&formname=report_to_name&id=report_to&posname=&poscode=&offname=&offcode=' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />

                                            <!-- <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick="window.open('Popup/arrest_accuser_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');"  />  -->
                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">โดยคำสั่ง(ส.ส.2/6ก) :&nbsp;</td>
                                          <td >
                                            <input type="text" name="order_by_name" class="textview" size="31" value="${db.order_by}">
                                            <input type="hidden" name="order_by" class="textview" size="31" value="${db.order_by}">
                                            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick="window.open('process?action=Divide_staff_pop&formname=order_by_name&id=order_by&posname=&poscode=&offname=&offcode=' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
                                           <!-- <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                                              onClick="window.open('Popup/arrest_accuser_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');"  /> -->
                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">ซึ่งเป็น :&nbsp;</td>
                                          <td >
                                               <input name="duty" type="text" class="textbox" size="25" maxlength="5" value="${aa.duty}" >

                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">เรียน(เช่น ผู้อำนวยการ) :&nbsp;</td>
                                          <td >
                                               <input name="director_position" type="text" class="textbox" size="25" maxlength="5" value="${aa.director_position}">

                                          </td>
                                     </tr>
                                </table>
                         </td>
                    </tr>

               </table>
          </div>
          <!-- END รายงานบันทึกการจับกุม-->




     </td>
     <td>&nbsp;</td>
   </tr>
</table>