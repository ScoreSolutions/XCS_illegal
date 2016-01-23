

<script language="javascript" type="text/javascript">
	function winPopup(theURL,winName,features, myWidth, myHeight, isCenter) {

			if(window.screen)if(isCenter)if(isCenter=="true"){
				var myLeft = (screen.width-myWidth)/2;
				var myTop = (screen.height-myHeight)/2;
				features+=(features!='')?',':'';
				features+=',left='+myLeft+',top='+myTop;
			}
			window.open(theURL,winName,features+((features!='')?',':'')+'width='+myWidth+',height='+myHeight);

	}
	function chkManual()
	{

		rdiA = document.getElementById("rdiInvByA");
		rdiM = document.getElementById("rdiInvByM");
		lstA = document.getElementById("lstAuto");
		lstM = document.getElementById("lstManual");


		if (rdiA.checked==true){
			lstA.style.display='';
			lstM.style.display='none';

		}else{
			lstA.style.display='none';
			lstM.style.display='';
		}
	}

	function btnPrintClick(btn)
	{
		if(document.getElementById(btn).value == "บันทึกและพิมพ์")
		{
			window.open('Reports/InvCaseFine.xps' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=1000,height=700');
			document.getElementById(btn).value = "ยกเลิก";
		}else
			document.getElementById(btn).value = "บันทึกและพิมพ์";
	}

	function chkFine()
	{
		mFine = document.getElementById("txtCaseFine");
		mNewFine = document.getElementById("txtNewCaseFine");
		mIncFine = document.getElementById("fineIncrease");
		mDecFine = document.getElementById("fineDecrease");
		mDiffFine = document.getElementById("txtDiffCaseFine");

		if(mNewFine.value != ""){

			if(parseFloat(mFine.value) > parseFloat(mNewFine.value)){//ปรับลด
				mIncFine.style.display='none';
				mDecFine.style.display='';
				mDiffFine.value = parseFloat(mFine.value) - parseFloat(mNewFine.value);
				document.getElementById("tblIncrease").style.display='none';
				document.getElementById("tblDecrease").style.display='';
			}else if(parseFloat(mFine.value) < parseFloat(mNewFine.value)){ //ปรับเพิ่ม
				mIncFine.style.display='';
				mDecFine.style.display='none';
				mDiffFine.value = parseFloat(mNewFine.value) - parseFloat(mFine.value);
				document.getElementById("tblIncrease").style.display='';
				document.getElementById("tblDecrease").style.display='none';
			}else{
				alert("ค่าปรับของคดี กับค่าปรับใหม่ มีมูลค่าเท่ากัน");
			}

		}else if(mNewFine.value == ""){
			mIncFine.style.display='none';
			mDecFine.style.display='none';
			mDiffFine.value = "";
		}

	}
</script>
<style type="text/css">
<!--
.style7 {
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
}
-->
</style>

	  <%@ include file="/Templates/header.jsp" %>


		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">การเพิ่ม-ลดค่าปรับเปรียบเทียบ </span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
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
                <td>


                    <!--   Start  My Form-->
                	<table width="1000" border="0" cellpadding="0" cellspacing="0">
						<tr valign="top">
							<td colspan="2">
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
								  <tr >
									  <td height="22"  align="right">วันที่ :&nbsp;</td>
									  <td  colspan="5" >
											<input name="theDate5" type="text" class="textdate" value="02/02/2553" size="10" maxlength="10" />
									  </td>
								  </tr>
								  <tr>
									<td  height="25" align="right">พ.ร.บ. :&nbsp;</td>
									<td colspan="5">
										<select name="sLegislation" id="sLegislation" style="width:200px;" OnChange="selectLegislation('sLegislation');">
											<option value="90" selected>90 พ.ร.บ. สุรา พ.ศ.2493</option>
											<option value="91" >91 พ.ร.บ.ยาสูบ พ.ศ.2509</option>
											<option value="00" >00 พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>
										</select>
										<font style="color:red">*</font>
									</td>
								  </tr>
								  <tr >
                                      <td align="right" width="15%">เลขคดีเปรียบเทียบที่ : &nbsp;</td>
                                      <td width="20%">
                                         <input type="Text" name="SuspectDetail22" id="SuspectDetail22" value="001/2553" class="textview"/>
                                         <img src="images/btn_browse.png" width="18" height="19" border="0"  style="cursor:hand;"
                                         onClick="window.open('Popup/compare_case_pop.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=800,height=500,top=220,left=400,modal=yes');">
                                         <font style="color:red">*</font>
                                      </td>
									  <td width="15%" height="22"  align="right">วันที่เปรียบเทียบปรับเดิม :&nbsp;</td>
									  <td width="20%">
                                             <input name="theDate5" type="text" class="textdate" value="02/02/2553" size="10" />
									  </td>
									  <td width="15%" height="22"  align="right">จำนวนผู้ต้องหา :&nbsp;</td>
									  <td width="15%">
                                          <input type="Text" name="SuspectDetail22" id="SuspectDetail22" value="3" size="8"  class="textviewNum"/>&nbsp;ราย
									  </td>
									</tr>
									<tr >
									  <td height="22"  align="right">ค่าปรับเปรียบเทียบคดี : &nbsp;</td>
									  <td >
											<input type="Text" name="txtCaseFine" id="txtCaseFine" size="10" value="5000.00" class="textviewNum" />&nbsp;บาท/คน
									  </td>
									  <td height="22"  align="right">ค่าปรับเปรียบเทียบคดีใหม่ : &nbsp;</td>
									  <td >
										<input type="Text" name="txtNewCaseFine" id="txtNewCaseFine" size="10" class="textNum" Onblur="chkFine();" Onkeypress="ChkMinusDbl(this);" />
										บาท/คน<font style="color:red">*</font>
									  </td>
									  <td height="22"  align="right">
									  	<font size="3" color="blue"><b>
										  	<span id="fineIncrease" style="display:none" >ปรับเพิ่ม</span>
										  	<span id="fineDecrease" style="display:none" >ปรับลด</span>
										</b>
									  	</font>
									  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									  	ผลต่าง : &nbsp;
									  </td>
									  <td >
										<input type="Text" name="txtDiffCaseFine" id="txtDiffCaseFine" size="10" value="" class="textviewNum"/>&nbsp;บาท/คน
									  </td>
								    </tr>
									<tr >
									  <td height="22"  align="right">ค่าปรับเปรียบเทียบคดีรวม : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="15,000.00" class="textviewNum"/>&nbsp;บาท
									  </td>
									  <td height="22"  align="right">ค่าปรับเปรียบเทียบคดีรวม : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="0.00" class="textviewNum"/>&nbsp;บาท
									  </td>
									  <td height="22"  align="right">ค่าปรับเปรียบเทียบคดีรวม : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="0.00" class="textviewNum"/>&nbsp;บาท
									  </td>
								    </tr>
									<tr >
									  <td height="22"  align="right">เงินสินบน : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="1,500.00" class="textviewNum"/>&nbsp;บาท
									  </td>
									  <td height="22"  align="right">เงินสินบน : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="0.00" class="textviewNum"/>&nbsp;บาท
									  </td>
									  <td height="22"  align="right">เงินสินบน : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="0.00" class="textviewNum"/>&nbsp;บาท
									  </td>
								    </tr>
									<tr >
									  <td height="22"  align="right">เงินรางวัล : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="1,250.00" class="textviewNum"/>&nbsp;บาท
									  </td>
									  <td height="22"  align="right">เงินรางวัล : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="0.00" class="textviewNum"/>&nbsp;บาท
									  </td>
									  <td height="22"  align="right">เงินรางวัล : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="0.00" class="textviewNum"/>&nbsp;บาท
									  </td>
								    </tr>
									<tr >
									  <td height="22"  align="right">เงินส่งคลัง : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="2,250.00" class="textviewNum"/>&nbsp;บาท
									  </td>
									  <td height="22"  align="right">เงินส่งคลัง : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="0.00" class="textviewNum"/>&nbsp;บาท
									  </td>
									  <td height="22"  align="right">เงินส่งคลัง : &nbsp;</td>
									  <td >
											<input type="Text" name="SuspectDetail22" id="SuspectDetail22" size="10" value="0.00" class="textviewNum"/>&nbsp;บาท
									  </td>
								    </tr>

									<tr><td colspan="4">&nbsp;</td></tr>
							  </table>

							</td>
						</tr>
					</table>

                                    <!--   Start  My Form-->                </td>
              </tr>
              <tbody id="tblIncrease" style="display:none">
				  <tr>
					<td>&nbsp;</td>
					<td >
						<table border="0" cellpadding="0" cellspacing="0" >
							<tr>
								<td  >&nbsp;</td>
								<td align="right" >ออกใบเสร็จแบบ :&nbsp;</td>
								<td align="left">
									<input type="radio" id="rdiInvByA" name="rdiInvBy" checked onClick="chkManual();" />Auto &nbsp;&nbsp;&nbsp;
									<input type="radio" id="rdiInvByM" name="rdiInvBy" onClick="chkManual();" />Manual
								</td>
							</tr>
						  </table>
					  </td>
				  </tr>
	              <tr id="lstAuto" >
	                <td>&nbsp;</td>
	                <td>
						   <table class="tableList"  border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
							  <tr>
								<td width="50" class="TblHeaderColumn AlignCenter">ลำดับ</td>
								<td width="150" class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
								<td width="80" class="TblHeaderColumn">เลขที่ใบเสร็จ</td>
								<td width="100" class="TblHeaderColumn">เลขที่กระดาษ</td>
								<td width="80" class="TblHeaderColumn">คำสั่ง</td>
								<td width="100" class="TblHeaderColumn">เลขที่ใบเสร็จเดิม</td>

							  </tr>
							  <tr>
								<td class="TblRow AlignCenter">1</td>
								<td class="TblRow AlignLeft">นายแดง สีสด</td>
								<td class="TblRow" align="center"><input type="text" value="" class="textview" size="10"></td>
	                            <td class="TblRow" align="center" ><input id="pNo1" name="pNo1" type="text" value=""  size="10"  class="textbox"></td>
								<td class="TblRow" align ="Center">
									<INPUT TYPE="button"  value="บันทึกและพิมพ์" id="btnInv1" name="btnInv1" style="width:100"
									onClick="btnPrintClick('btnInv1');"/>
								</td>
								<td class="TblRow" align="right"><input type="box" value="001/2552" class="textview" size="10"></td>
							  </tr>
							  <tr class="bgRowGray">
								<td class="TblRow AlignCenter">2</td>
								<td class="TblRow AlignLeft">นายสุวิทย์ โตปาน</td>
								<td class="TblRow" align="center"><input type="text" value="" class="textview" size="10"></td>
	                                   <td class="TblRow" align="center"><input id="pNo2" name="pNo2" type="text" value=""  size="10"  class="textbox"></td>
								<td class="TblRow" align ="Center">
									<INPUT TYPE="button" value="บันทึกและพิมพ์"   id="btnInv2" name="btnInv2" style="width:100"
									onClick="btnPrintClick('btnInv2');"/>
								</td>
								<td class="TblRow" align="right"><input type="text" value="002/2552" class="textview" size="10"></td>
							  </tr>
							  <tr>
								<td class="TblRow AlignCenter">3</td>
								<td class="TblRow AlignLeft">นายดำ หมีแดง</td>
								<td class="TblRow" align="center"><input type="text" value="" class="textview" size="10"></td>
	                            <td class="TblRow" align="center"><input id="pNo3" name="pNo3" type="text" value=""  size="10" class="textbox"></td>
								<td class="TblRow" align ="Center">
									<INPUT TYPE="button"  value="บันทึกและพิมพ์"  id="btnInv3" name="btnInv3" style="width:100"
									onClick="btnPrintClick('btnInv3');"/>
								</td>
								<td class="TblRow" align="right"><input type="text" value="003/2552" class="textview" size="10"></td>
							  </tr>
							</table>
					</td>
	              </tr>
		          <tr id="lstManual" style="display:none" >
	                <td>&nbsp;</td>
	                <td >
	                   <table class="tableList" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
	                      <tr>
	                        <td width="50" class="TblHeaderColumn AlignCenter">ลำดับ</td>
	                        <td width="150" class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
	                        <td width="80" class="TblHeaderColumn">ค่าปรับ</td>
	                        <td width="120" class="TblHeaderColumn">ใบเสร็จเล่มที่</td>
	                        <td width="120" class="TblHeaderColumn">ใบเสร็จเลขที่</td>
	                      </tr>
	                      <tr>
	                        <td class="TblRow AlignCenter">1</td>
	                        <td class="TblRow AlignLeft">นายแดง สีสด</td>
	                        <td class="TblRow AlignLeft"><p align="right">5000</p></td>
	                        <td class="TblRow" align="center" ><input id="invBook1" name="invBook1" type="text" value=""  size="10"  class="textbox"  ></td>
	                        <td class="TblRow" align="center" ><input id="invNo1" name="invNo1" type="text" value=""  size="10"  class="textbox"></td>

	                      </tr>
	                      <tr class="bgRowGray">
	                        <td class="TblRow AlignCenter">2</td>
	                        <td class="TblRow AlignLeft">นายสุวิทย์ โตปาน</td>
	                        <td class="TblRow AlignLeft"><p align="right">5000</p></td>
	                        <td class="TblRow" align="center" ><input id="invBook2" name="invBook2" type="text" value=""  size="10"  class="textbox"></td>
	                        <td class="TblRow" align="center" ><input id="invNo2" name="invNo2" type="text" value=""  size="10"  class="textbox"></td>

	                     </tr>
	                      <tr>
	                        <td class="TblRow AlignCenter">3</td>
	                        <td class="TblRow AlignLeft">นายดำ หมีแดง</td>
	                        <td class="TblRow AlignLeft"><p align="right">5000</p></td>
	                        <td class="TblRow" align="center" ><input id="invBook3" name="invBook3" type="text" value=""  size="10"  class="textbox"></td>
	                        <td class="TblRow" align="center" ><input id="invNo3" name="invNo3" type="text" value=""  size="10"  class="textbox" ></td>

	                      </tr>
	                    </table>
	                </td>
	              </tr>
	          </tbody>
              <tr id="tblDecrease" style="display:none">
                <td>&nbsp;</td>
                <td>
				   <table class="tableList"  border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
					  <tr>
						<td width="50" class="TblHeaderColumn AlignCenter">ลำดับ</td>
						<td width="150" class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
						<td width="80" class="TblHeaderColumn">เลขที่ใบเสร็จ</td>
						<td width="100" class="TblHeaderColumn">เลขที่กระดาษ</td>
					  </tr>
					  <tr>
						<td class="TblRow AlignCenter">1</td>
						<td class="TblRow AlignLeft">นายแดง สีสด</td>
						<td class="TblRow" align="center"><input type="text"  class="textview" size="10" value="001/2552"></td>
                        <td class="TblRow" align="center" ><input id="pNo1" name="pNo1" type="text" value=""  size="10"  class="textView"></td>

					  </tr>
					  <tr class="bgRowGray">
						<td class="TblRow AlignCenter">2</td>
						<td class="TblRow AlignLeft">นายสุวิทย์ โตปาน</td>
						<td class="TblRow" align="center"><input type="text" class="textview" size="10" value="002/2552"></td>
                        <td class="TblRow" align="center"><input id="pNo2"  name="pNo2" type="text" value=""  size="10" class="textView"></td>

					  </tr>
					  <tr>
						<td class="TblRow AlignCenter">3</td>
						<td class="TblRow AlignLeft">นายดำ หมีแดง</td>
						<td class="TblRow" align="center"><input type="text"  class="textview" size="10" value="003/2552"></td>
                        <td class="TblRow" align="center"><input id="pNo3" name="pNo3" type="text" value=""  size="10" class="textView"></td>

					  </tr>
					  <tr>
						<td class="TblRow AlignLeft" colspan="9">&nbsp;</td>
					  </tr>
					</table>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                	เหตผลในการปรับเพิ่ม ปรับลด :&nbsp;<br />
                	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                	<textarea cols="50" rows="3" ></textarea>
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>



		<%@ include file = "/Templates/footer.jsp"%>


