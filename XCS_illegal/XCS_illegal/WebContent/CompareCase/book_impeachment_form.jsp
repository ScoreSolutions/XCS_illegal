<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<script type='text/javascript' src='dwr/interface/Pke_Compare.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<script type="text/javascript" language="JavaScript">
    function toggle() {
     if( document.getElementById("a").checked ==false ){
      document.getElementById("hidethis").style.display = '';
      document.getElementById("hidethis2").style.display = '';
     }else{
      document.getElementById("hidethis").style.display = 'none';
      document.getElementById("hidethis2").style.display = 'none';
     }
    }
	function toggleHidden(mID, btnID) {

		document.getElementById('app2_39').style.display='none';
		document.getElementById('lawbreaker_list').style.display='none';
		document.getElementById('indictment').style.display='none';
		document.getElementById('arrestTeam').style.display='none';
		document.getElementById('exhibitList').style.display='none';

		document.getElementById('btn2_39').style.background='#D4D0C8';
		document.getElementById('btnLawbreakerList').style.background='#D4D0C8';
		document.getElementById('btnIndictment').style.background='#D4D0C8';
		document.getElementById('btnArrestTeam').style.background='#D4D0C8';
		document.getElementById('btnExhibitList').style.background='#D4D0C8';

		mnu = document.getElementById(mID);
		btn = document.getElementById(btnID);
		if (mnu.style.display == 'none'){
			mnu.style.display ='';
			btn.style.background='#FFCC33';
		}else{
			mnu.style.display ='none';
		}
	}
	function showCaseLast()
	{
		showCaseResult();
	}

    function showCaseType()
    {
      if (document.getElementById("qualityPay").checked)
      {
    	  document.getElementById("toTheLastExcise").checked=true;
    	  document.getElementById("toTheLastExcise").disabled=false;
    	  document.getElementById("toTheLastCourt").disabled=true;
    	  document.getElementById("toTheLastPolice").disabled=true;

      }else{
	        document.getElementById("toTheLastExcise").disabled=true;
	        document.getElementById("toTheLastCourt").disabled=false;
	        document.getElementById("toTheLastPolice").disabled=false;

			var CaseLast = "${bi.case_last}";
	        if(CaseLast=="3")
	        	document.getElementById("toTheLastPolice").checked=true;
	        else
	        	document.getElementById("toTheLastCourt").checked=true;
      }
      showCaseResult();
    }

    function showCaseResult()
    {
		if(document.getElementById("qualityPay").checked && document.getElementById("toTheLastExcise").checked)
		{
			document.getElementById("caseResult").style.display='none';
		}else{
			document.getElementById("caseResult").style.display='';
		}
    }

	function ChkDupCaseID(){
		
		var vTrackNo = "${db.track_no}";
		var caseID = document.dataform.case_id_1.value + "/" + document.dataform.case_id_2.value;
		var vOffcode = document.dataform.staff_offcode_sue.value;
		
		Pke_Compare.ChkDupCaseID(vTrackNo, caseID, vOffcode, function(data){
			if(data != ""){
				document.getElementById("case_id_1").value = "";
				document.getElementById("case_id_2").value = "";
				alert(data);
				document.getElementById("case_id_1").select();
			}
		});
	}

	function toSubmit(){
		if(document.dataform.case_id_1.value == ""){
			alert("กรุณากรอกเลขที่คดี");
			document.dataform.case_id_1.select();
			return false;
		}
		if(document.dataform.case_id_2.value == ""){
			alert("กรุณากรอกเลขที่คดี");
			document.dataform.case_id_2.select();
			return false;
		}
		if(document.dataform.case_date.value == ""){
			alert("กรุณากรอกวันที่รับคดี");
			document.dataform.case_date.select();
			return false;
		}
		if(document.dataform.case_time.value == ""){
			alert("กรุณากรอกเวลาที่รับคดี");
			document.dataform.case_time.select();
			return false;
		}
		if(document.dataform.staff_name.value == ""){
			alert("กรุณากรอกเจ้าหน้าที่ดำเนินคดี");
			document.dataform.staff_name.select();
			return false;
		}

		var vTrackNo = "${db.track_no}";
		var caseID = document.dataform.case_id_1.value + "/" + document.dataform.case_id_2.value;
		var vOffcode = document.dataform.staff_offcode_sue.value;
		var vCaseNoneOffice;

		if(dwr.util.getValue("chkNoneOffice")==true){
			vCaseNoneOffice="Y";
			caseID = "น" + caseID;
		}else
			vCaseNoneOffice="N";

		Pke_Compare.ChkDupCaseID(vTrackNo, caseID, vOffcode,vCaseNoneOffice, function(data){
			if(data != ""){
				alert(data);
				document.getElementById("case_id_1").select();
				return false;
			}else{
				document.dataform.submit();
				return true;
			}
		});
	}

	function ChkNoneOffice(){
		//chkNoneOffice
		if (document.getElementById("chkNoneOffice").checked==true)
			document.getElementById("txtCaseNoneOffice").innerHTML="น";
		else
			document.getElementById("txtCaseNoneOffice").innerHTML="&nbsp;";
	}

</script>
<style type="text/css">
	.frmBorder{position:absolute;width:200px; height:150px; border:#CCCCCC solid 1px;background:#CCCCCC;}
	.innerPosition{position:relative; top:10px;left:10px;right:5px;height:500px;}
</style>

		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">บันทึกรับคำกล่าวโทษ</span></td>
              </tr>
              <tr>
                <td colspan="2"><hr/></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>
					<input name="btnSave" id="btnSave"  type="button" onClick="toSubmit();" class="barButton" value="บันทึก" >
					<input name="btnCancel" id="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขบันทึกรับคำกล่าวโทษ(1/55)');window.location.href='<c:url value="${action}" />'; ">
					<input name="btnBack" type="button" class="barButton" value="กลับหน้าค้นหา"onclick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Impeachment&cmd=list&default=Y" />' ">
					<c:if test="${bi.id != null}">
						<input name="btnPrint"  type="button" class="barButton" value="พิมพ์" onClick="printReports('ILL_P025&getTrackNo=${db.track_no}&time=<%=new Date().getTime() %>');" >
					</c:if>
				</td>
              </tr>
              <tr>
                <td colspan="2"><hr/></td>
              </tr>
              <tr >
                <td>&nbsp;</td>
                <td >&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td >
                              <!-- รายละเอียดบันทึกการจับกุม-->
                              <%@ include file="../Protect/arrest_detailshow.jsp" %>

                              <!-- ข้อกล่าวหา-->
                              <%@include file="../Protect/showindictment.jsp" %>

                              <table width="800" border="0" cellspacing="0" cellpadding="0" >

							  <tr class="bgRowGray">
								<td colspan="4"><strong>เปรียบเทียบคดี</strong> </td>
							  </tr>
							  <tr valign="top">
								<td height="10" colspan="4" align="right" valign="middle">&nbsp;</td>
							  </tr>
							  <tr valign="top">
                                    <td  height="25" align="right" valign="middle">เลขที่คดี (สมุดรับคำกล่าวโทษ)&nbsp;:&nbsp;</td>
                                    <td width="152">
                                    	<input type="hidden" name="track_no"  value="${aa.track_no}"/>
                                    	<b><span id="txtCaseNoneOffice"  >${caseNoneOffice }</span></b>
                                      	<input type="Text" id="case_id_1" name="case_id_1" value="${case_id_1}" class="textNum"  onkeypress="ChkMinusInt(this);" size="5"/> /&nbsp;
                                      	<input type="Text" id="case_id_2" name="case_id_2" value="${case_id_2}" class="textNum"  onkeypress="ChkMinusInt(this);" size="4"/>
                                      	<font style="color:red">*</font>
                                    </td>
									<td height="25" align="right" valign="middle">วันที่รับคดี :&nbsp;</td>
									<td>
										<c:if test="${bi.case_date != null}">
											<input name="case_date" id="case_date" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="<fmt:formatDate value="${bi.case_date }" pattern="dd/MM/yyyy"/>"  />
											<a href="javascript:NewCssCal('case_date','ddmmyyyy')"><img id="imgCaseDate" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>เวลา
											<input id="case_time" name="case_time" type="text" class="textbox" size="5" maxlength="5" value="<fmt:formatDate value="${bi.case_date }" pattern="HH:mm" />" onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);" />
											<font style="color:red">*</font>
										</c:if>
										<c:if test="${bi.case_date == null}">
											<input name="case_date" id="case_date" type="text" class="textdate"  value="<fmt:formatDate value="<%=new Date() %>" pattern="dd/MM/yyyy"/>" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" />
											<a href="javascript:NewCssCal('case_date','ddmmyyyy')"><img id="imgCaseDate" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>เวลา
											<input id="case_time" name="case_time" type="text" class="textbox" size="5" maxlength="5" value="<fmt:formatDate value="<%=new Date() %>" pattern="HH:mm" />" onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);" />
											<font style="color:red">*</font>
										</c:if>
									</td>
							  </tr>
							  <tr>
							  	<td>&nbsp;</td>
							  	<td colspan='3'>
							  		<input type="checkbox" id="chkNoneOffice" name="chkNoneOffice" 
							  		<c:if test="${bi.case_none_office == 'Y'}"> checked </c:if> 
							  		value='Y' onclick="ChkNoneOffice()" />คดีจับกุมนอกสถานที่ 
							  	</td>
							  </tr>
							  <tr>
								<td  align="right" valign="middle">เจ้าหน้าที่ดำเนินคดี :&nbsp;</td>
								<td width="243" colspan="3">
									<input type="Text" id="staff_name" name="staff_name" value="${sue_staff_name}" class="textview" size="29"  onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();"/>
									<input type="hidden" id="staff_id_sue" name="staff_id_sue"  class="textview" size="29" value="${sue_staff_id}"/>
									<input type="hidden" id="staff_offcode_sue" name="staff_offcode_sue"  class="textview" size="29" value="${staff_offcode_sue}"/>
									<img id="imgStaffName" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick="window.open('process?action=Divide_staff_pop&formname=staff_name&id=staff_id_sue&offcode=staff_offcode_sue' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
									<font style="color:red">*</font>
								</td>
							 </tr>


                                   <tr><td colspan="4">&nbsp;</td></tr>
                                   <tr >
                                        <td  align="right" valign="top" >ลักษณะคดี :&nbsp;</td>
                                        <td valign="top">
                                          <INPUT TYPE="radio" id="qualityPay" name="case_quality" value="1"  
                                          	<c:if test="${(bi.case_quality == '1'|| bi.case_quality == null || bi.case_quality == '') && db.have_culprit=='Y'}"> checked </c:if> 
                                          	onclick="showCaseType();" <c:if test="${db.have_culprit=='N' }" >disabled</c:if> /> เปรียบเทียบปรับได้ : ยินยอมชำระเงิน<br />
                                          <INPUT TYPE="radio" id="qualitySue" name="case_quality" value="2"   
                                          	<c:if test="${bi.case_quality == '2' || aa.issentcourt=='Y' || db.have_culprit=='N'}"> checked </c:if> 
                                          	onclick="showCaseType();"> ส่งฟ้องศาล
                                        </td>
                                        <td align="right" valign="top" >คดีสิ้นสุดชั้น : </td>
                                        <td valign="top">
                                          <INPUT TYPE="radio" id="toTheLastExcise" name="cast_last" onclick="showCaseLast();" value="1" <c:if test="${bi.case_last == '1'|| bi.case_last == null || bi.case_last == '' }"> checked </c:if>   > กรมสรรพสามิต<br />
                                          <INPUT TYPE="radio" id="toTheLastCourt" name="cast_last" onclick="showCaseLast();" value="2" <c:if test="${bi.case_last == '2'}"> checked </c:if>  > ศาล <br />
                                          <INPUT TYPE="radio" id="toTheLastPolice" name="cast_last" onclick="showCaseLast();" value="3"  <c:if test="${bi.case_last == '3'}"> checked </c:if> > พนักงานสอบสวน/พนักงานอัยการ
                                        </td>
                                   </tr>
                                   <tbody id="caseResult" style="display:none">
                                     <tr>
                                          <td align="right" >ผลคดี :&nbsp;</td>
                                          <td>
                                               <input type="text" id="case_result" name="case_result" class="textbox" size="25" value="${bi.case_result}">
                                          </td>
                                          <td align="right" >วันที่คดีสิ้นสุด : </td>
                                          <td>
                                               <input name="case_last_date" id="case_last_date" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${bi.case_last_date}"  />"  />
                                                 <a href="javascript:NewCssCal('case_last_date','ddmmyyyy')"><img id="imgCaseLastDate" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
                                          </td>
                                     </tr>
                                     <tr style="height:25px">
                                          <td align="right" >ค่าปรับ :&nbsp;</td>
                                          <td>
                                               <input type="text" id="case_fine" name="case_fine" class="textNum" onkeypress="ChkMinusDbl(this);" size="10" value="${bi.case_fine }">
                                               	บาท
                                          </td>
                                     </tr>
                                   </tbody>
						</table>
					</td>
              </tr>
			  <tr>
					<td>&nbsp;</td>
					<td colspan="2"> <hr /></td>
			  </tr>

			  <tr >
					<td>&nbsp;</td>
					<td>
                           <%@ include file="../Protect/showarrest_tab.jsp" %>
					</td>
					<td>&nbsp;</td>
				</tr>
                </table>
			</td>
          </tr>
            </table>
            <script>
            showCaseType();
            showCaseLast();
            </script>
            
            
			<c:if test="${db.chkcaselast == 'Y' || IsEdit == 'N'}">
				<script>
					document.getElementById("btnSave").style.display="none";
					document.getElementById("btnCancel").style.display="none";
					document.getElementById('case_id_1').disabled=true;
					document.getElementById('case_id_2').disabled=true;
					document.getElementById('imgCaseDate').style.display='none';
					document.getElementById('case_time').disabled=true;
					document.getElementById('imgStaffName').style.display='none';
					document.getElementById('qualityPay').disabled=true;
					document.getElementById('qualitySue').disabled=true;
					document.getElementById('toTheLastExcise').disabled=true;
					document.getElementById('toTheLastCourt').disabled=true;
					document.getElementById('toTheLastPolice').disabled=true;
					document.getElementById('case_result').disabled=true;
					document.getElementById('imgCaseLastDate').style.display='none';
					document.getElementById('case_fine').disabled=true;
				</script>
			</c:if>