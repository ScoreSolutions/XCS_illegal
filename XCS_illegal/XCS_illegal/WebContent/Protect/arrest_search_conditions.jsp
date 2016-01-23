<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>

<table width="1000" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2"  >
 <tr>
    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
    <td width="98%"></td>
    <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
  </tr>
  <tr>
    <td height="40">&nbsp;</td>
    <td align="center" valign="top" >

        <table width="100%" border="0" cellspacing="0" cellpadding="0" >
          <tr>
            <td width="33%" height="25" align="left" valign="top"><span class="sectionname" style="cursor:pointer" title="แสดง/ซ่อน" onClick="setSearchCon();" >ค้นหา</span></td>
            <td width="33%">&nbsp;</td>
            <td width="34%">&nbsp;</td>
          </tr>
          <tbody id="searchCon">
          
	          <tr >
	            <td colspan="2" valign="top">
	                <table width="100%" border="0" cellspacing="0" cellpadding="0" >
	                  <tr>
	                    <td width="20%" align="right" >ข้อกล่าวหา :&nbsp;</td>
	                    <td width="33%" height="25"><input name="guilt_base" type="text" size="30" value="${param.guilt_base }"></td>
	                    <td width="17%" align="right" >ความผิด พ.ร.บ. :&nbsp;</td>
	                    <td width="30%" height="25">
	
	                        <select  name="legislation" id="legislation" style="width:180px" onchange="setDDlGroupID('product',this.value,'');" >
	            				<option value="" selected>ทั้งหมด</option>
	            				<c:forEach items="${ltlist}"  var="ltion">
	            				<option value="${ltion.id}"  <c:if test="${param.legislation == ltion.id}"> selected </c:if>>${ltion.legislation_code} ${ltion.legislation_name}</option>
	            				</c:forEach>
	            			</select>
	                    </td>
	                  </tr>
	                  <tr>
	                    <td  align="right" >ชื่อผู้กระทำผิด :&nbsp;</td>
	                    <td height="25"><input name="lawbreaker_name" type="text" size="30" value="${param.lawbreaker_name }" ></td>
	                    <td align="right" >สินค้า :&nbsp;</td>
	                    <td height="25">
							<select  name="product" id="product" style="width:180px">
	            				<option value="" selected>ทั้งหมด</option>
	            				<c:forEach items="${dglist}"  var="dg">
	            				<option value='${dg.group_id}' <c:if test="${param.product == dg.group_id}"> selected </c:if>>${dg.group_name}</option>
	            				</c:forEach>
	            			</select>
	
	                    </td>
	                  </tr>
	                  <tr>
	                    <td align="right" >วันที่เกิดเหตุ :&nbsp; </td>
	                    <td height="25">
		                      <input type="Text" value="${param.occurrence_date }" name="occurrence_date" id="theDate1" class="textdate" OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" size="6" maxlength="10" style="width:75;"> <img src="images/btn_calendar.png" onClick="NewCssCal('theDate1','ddmmyyyy');"  alt="" width="19" height="19" align="middle" style="border-style: none;cursor:pointer;">ถึง
		                      <input type="Text" value="${param.occurrence_date2 }" name="occurrence_date2" id="theDate2" class="textdate" OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" size="6" maxlength="10" style="width:75;"><img src="images/btn_calendar.png" onClick="NewCssCal('theDate2','ddmmyyyy');" alt="" width="19" height="19" align="middle" style="border-style: none;cursor:pointer">
	                    </td>
	                    <td height="25" align="right">จังหวัด :&nbsp;</td>
	                    <td>
	                    	<select id='province' name='province' style="width:180px" onchange="getDistrict('district','tambol',this.value,'','')"></select>
	
	                    </td>
	                  </tr>
	                  <tr>
	                    <td align="right" >วันที่รับเรื่องส่วนคดี :&nbsp; </td>
	                    <td height="25">
		                    <input type="Text" value="${param.case_date }" name="case_date" id="theDate3" class="textdate" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" maxlength="10" style="width:70px;">
							<a href="javascript:NewCssCal('theDate3','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>ถึง
		                    <input type="Text" value="${param.case_date2 }" name="case_date2" id="theDate4" class="textdate" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" maxlength="10" style="width:70px;"> <a href="javascript:NewCssCal('theDate4','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle"  style="border-style: none"></a>
	                    </td>
	
	                    <td height="25" align="right">อำเภอ :&nbsp;</td>
	                    <td>
	                    	<select id='district' name='district' style="width:180px" onchange="getTambol('tambol',this.value,'')"></select>
	                  </tr>
	                  <tr>
	                    <td align="right" >วันที่เขียนบันทึกจับกุม :&nbsp; </td>
	                    <td height="25">
		                    <input type="Text" name="application_date" id="theDate5" value="${param.application_date }" class="textdate" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" size="5" maxlength="10" style="width:75;"> <a href="javascript:NewCssCal('theDate5','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>ถึง
		                    <input type="Text" name="application_date2" id="theDate6"  value="${param.application_date2 }" class="textdate" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" size="5" maxlength="10" style="width:75;"> <a href="javascript:NewCssCal('theDate6','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
	                    </td>
	                    <td height="25" align="right">ตำบล :&nbsp;</td>
	                    <td>
							<select id='tambol' name='tambol' style="width:180px"></select>
	
	                     </td>
	                  </tr>
	                  <tr>
	                    <td align="right">เลขที่งาน :&nbsp;</td>
	                    <td height="25"><input name="aa_track_no" type="text" size="30" value="${param.aa_track_no }"></td>
	                    <td align="right">คดีเปรียบเทียบที่ :&nbsp;</td>
	                    <td height="25"><input name="compare_case_no" type="text" size="27" value="${param.compare_case_no }"></td>
	                  </tr>
	                  <tr>
	                    <td align="right">เลขที่คดี :&nbsp;</td>
	                    <td height="25"><input name="case_id" type="text" size="30" value="${param.case_id }"></td>
	                    <td align="right">รายงานพิสูจน์ที่ :&nbsp;</td>
	                    <td height="25"><input name="exhibit_report_no" type="text" size="27" value="${param.exhibit_report_no }"></td>
	                  </tr>
	                  <tr>
	                    <td align="right">ชื่อผู้กล่าวหา :&nbsp;</td>
	                    <td height="25"><input name="partial_name" type="text" size="30" value="${param.partial_name }"></td>
	                    <td align="right">เลขที่บัตร ปชช. :&nbsp;</td>
	                    <td height="25"><input name="lawbreaker_id_card" type="text" size="27" value="${param.lawbreaker_id_card }" onkeypress="return checkIDcard(this);" ></td>
	                  </tr>
	                  <tr>
	                    <td align="right">ชื่อสินค้าของกลาง :&nbsp;</td>
	                    <td height="25"><input name="product_name" type="text" size="30" value="${param.product_name }"></td>
	                    <td align="right">จำนวนเงินค่าปรับ :&nbsp;</td>
	                    <td height="25" align="left">
	                      <input name="case_fine" value="${param.case_fine }" type="text" class="textNum" onblur="return checkcase_fine(this);" onkeypress="ChkMinusDbl(this);" size="8">&nbsp;&nbsp;&nbsp;<!-- ChkMinusDbl(this); -->
	                      ถึง :&nbsp;
	                      <input name="case_fine2" value="${param.case_fine2 }" type="text" class="textNum"  onblur="return checkcase_fine(this);" onkeypress="ChkMinusDbl(this);" size="8"> บาท
	                    </td>
	                  </tr>
	                  <tr>
	                    <td align="right">มาตรา :&nbsp;</td>
	                    <td height="25"><input name="case_law_id" type="text" size="30" value="${param.case_law_id }"></td>
	                    <td align="right">สรรพสามิต :&nbsp;</td>
	                    <td height="25" align="left">
	                    	<c:if test="${IsAdmin == '1'}">
		                       <input type="text" name="offcode" id="offcode" size="3"  class="textbox" value="${offcode }" 
		                       	onBlur="getOffname(this.value,'Y',offname);" >
		                       <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:pointer"
		                            onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" >
		                       <input type="text" name="offname" id="offname" size="15"  class="textview" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" value="${offname }">
		                    </c:if>
		                    <c:if test="${IsAdmin != '1'}">
		                       <input type="text" name="offcode" id="offcode" size="8" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" class="textview" value="${offcode }"  >
		                       <input type="text" name="offname" id="offname" size="20" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" class="textview"  value="${offname }">
		                    </c:if>
	                    </td>
	                  </tr>
	                   <tr>
	                    <td align="right"><input name="nojob" type="checkbox" value="0"  style=" display:none"   <c:if test="${abc == '1' ||  param.nojob == '0'}"> checked </c:if>>  </td>
	                    <td align="left" height="25"><input name="jobname" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();"  size="30" type="text" style="border:0px; background-color:#c2c2c2;display:none" /></td>
	                    <td align="right"></td>
	                    <td height="25"></td>
	                  </tr>
	                </table>
	            </td>
	            <td valign="top" >
	              <table width="100%" border="1" cellpadding="0" cellspacing="0">
	                <tr>
	                  <td valign="top" width="60%" rowspan="2" >
	                    <table width="100%" border="0" cellpadding="0" cellspacing="0" align="left">
	                      <tr><td >ผู้กล่าวหา :</td></tr>
	                      <tr><td align="left"><input name="accuserType" type="radio" value="2"   <c:if test="${param.accuserType == '2'}"> checked </c:if>>เจ้าหน้าที่กรมสรรพสามิต</td></tr>
	                      <tr><td align="left"><input name="accuserType" type="radio" value="3"  <c:if test="${param.accuserType == '3'}"> checked </c:if>>เจ้าหน้าที่สรรพสามิตภาค</td></tr>
	                      <tr><td align="left"><input name="accuserType" type="radio" value="1"  <c:if test="${param.accuserType == '1'}"> checked </c:if>>เจ้าหน้าที่สรรพสามิตพื้นที่</td></tr>
	                      <tr><td align="left"><input name="accuserType" type="radio" value="4"  <c:if test="${param.accuserType == '4'}"> checked </c:if>>เจ้าหน้าที่สรรพสามิตพื้นที่สาขา</td></tr>
	                      <tr><td align="left"><input name="accuserType" type="radio" value=""  <c:if test="${param.accuserType == ''||param.accuserType == null}"> checked </c:if>>ไม่ระบุ</td></tr>
	                    </table>
	                  </td>
	                  <td valign="top" width="40%" >
	                    <table width="100%" border="0" cellpadding="0" cellspacing="0">
	                      <tr><td align="left">ลักษณะคดี :</td></tr>
	                      <tr><td align="left"><input name="case_quality1" type="checkbox" value="2"  <c:if test="${param.case_quality1 == '2'}"> checked </c:if>>ฟ้องศาล</td></tr>
	                      <tr><td align="left"><input name="case_quality2" type="checkbox" value="1"  <c:if test="${param.case_quality2 == '1'}"> checked </c:if>>เปรียบเทียบปรับ</td></tr>
	                      <tr><td align="left"><input name="have_culprit" type="checkbox" value="N"  <c:if test="${param.have_culprit == 'N'}"> checked </c:if>>ไม่มีตัว</td></tr>
	                    </table>
	                  </td>
	                </tr>
					<tr>
						<td valign="top" >
							<table width="100%" border="0" cellpadding="0" cellspacing="0">
								<tr><td align="left">คดีสิ้นสุดชั้น :</td></tr>
								<tr><td align="left"><input name="caseLast1" type="checkbox" value="1"   <c:if test="${param.caseLast1 == '1'}"> checked </c:if>>กรมสรรพสามิต</td></tr>
								<tr><td align="left"><input name="caseLast2" type="checkbox" value="2"   <c:if test="${param.caseLast2 == '2'}"> checked </c:if>>ศาล</td></tr>
								<tr><td align="left"><input name="caseLast3" type="checkbox" value="3"   <c:if test="${param.caseLast3 == '3'}"> checked </c:if>>พนักงานสอบสวน/พนักงานอัยการ</td></tr>
							</table>
						</td>
					</tr>
	                <tr>
	                  <td valign="top">
	                    <table width="100%" border="0" cellpadding="0" cellspacing="0">
	                      <tr><td align="left">ของกลางมิชอบด้วยกฎหมาย :</td></tr>
	                      <tr><td align="left"><input name="exhibit_wild" type="radio" value="Y"  <c:if test="${param.exhibit_wild == '1'}"> checked </c:if>>ของกลางมิชอบด้วยกฎหมาย</td></tr>
	                      <tr><td align="left"><input name="exhibit_wild" type="radio" value="" <c:if test="${param.exhibit_wild == ''||param.exhibit_wild == null}"> checked </c:if>>ไม่ระบุ</td></tr>
	                    </table>
	                  </td>
	                  <td valign="top">
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
						  <tr><td align="left">เพิกถอน :</td></tr>
						  <tr><td align="left"><input name="iswithdraw" type="radio" value="1" <c:if test="${param.iswithdraw == '1'}"> checked </c:if>>เพิกถอน</td></tr>
						  <tr><td align="left"><input name="iswithdraw" type="radio" value="2" <c:if test="${param.iswithdraw == '2'}"> checked </c:if>>อยู่ระหว่างเพิกถอน</td></tr>
						  <tr><td align="left"><input name="iswithdraw" type="radio" value="" <c:if test="${param.iswithdraw == '' ||param.iswithdraw == null}"> checked </c:if>>ไม่ระบุ</td></tr>
						</table>
	                  </td>
	                </tr>
	                <tr>
	                  <td valign="top" colspan="2">
	                    <table width="100%" border="0" cellpadding="0" cellspacing="0">
	                      <tr><td colspan="2" align="left" >ค้นหาข้อมูลสืบสวน :</td></tr>
	                      <tr>
	                        <td width="40%" align="right">เลขที่แจ้งความ :&nbsp;</td>
	                        <td width="60%"><input name="notice_no" type="text" size="20" value="${param.notice_no }"></td>
	                      </tr>
	                      <tr>
	                        <td  align="right">เลขที่หมายค้น :&nbsp;</td>
	                        <td width="30%"><input name="warrant_no" type="text" size="20" value="${param.warrant_no }"></td>
	                      </tr>
	                      <tr>
	                        <td align="right">เลขที่ ส.ส.2/27 :&nbsp;</td>
	                        <td colspan="3"><input name="asi_track_no" type="text" size="20" value="${param.asi_track_no }"></td>
	                      </tr>
	                    </table>
	                    </td>
					</tr>
					</table>
	            </td>
	          </tr>
	          <tr>
	          <td width="33%"></td>
	           <td width="33%" align="center">
	           		<c:if test="${ShowPrintButton != 'Y'}">
		           		<input type="image" name="btSubmit" src="images/btn_search_big.png" value="Submit" alt="Submit" onclick="this.disabled" >
		           		<%@ include file="../Templates/clearIcon.jsp"%>
	           		</c:if>
	           		<c:if test="${ShowPrintButton == 'Y'}">
	           			&nbsp;&nbsp;&nbsp;
	           			<input name="btnReports" type="button" class="barbutton" value="รายงาน" onclick="return ShowReport();" />
	           			<script>
	           				function ShowReport(){
								if(dwr.util.getValue("case_date") == ""){
									alert("กรุณาเลือกวันที่รับเรื่องส่วนคดี");
									return false;
								}
								if(dwr.util.getValue("case_date2") == ""){
									alert("กรุณาเลือกวันที่รับเรื่องส่วนคดี");
									return false;
								}
								
		           				
		           				var caseDate = "";
		           				var wh = "";
								if(dwr.util.getValue("guilt_base")!="")
									wh += " and ind.guilt_base like '%" + dwr.util.getValue("guilt_base") + "%'";
								if (dwr.util.getValue("legislation") != "")
									wh += " and aa.legislation_id='" + dwr.util.getValue("legislation") + "'";
								if (dwr.util.getValue("lawbreaker_name") != "")
									wh += " and pke_arrest.getArrestLawbreaker(aa.track_no)='" + dwr.util.getValue("lawbreaker_name") + "'";
								if (dwr.util.getValue("product") != "")
									wh += " and aa.product_group_id='" + dwr.util.getValue("product") + "'";

								if (dwr.util.getValue("occurrence_date") != "" && dwr.util.getValue("occurrence_date2") != ""){
									wh += " and to_char(aa.occurrence_date,'yyyy-mm-dd') between '" + setFormatDate(dwr.util.getValue("occurrence_date")) + "' and '" + setFormatDate(dwr.util.getValue("occurrence_date2")) + "'";
								}else if(dwr.util.getValue("occurrence_date") != ""){
									wh += " and to_char(aa.occurrence_date,'yyyy-mm-dd') >= '" + setFormatDate(dwr.util.getValue("occurrence_date")) + "' ";
								}else if(dwr.util.getValue("occurrence_date2") != ""){
									wh += " and to_char(aa.occurrence_date,'yyyy-mm-dd') <= '" + setFormatDate(dwr.util.getValue("occurrence_date2")) + "' ";
								}
								
								if (dwr.util.getValue("case_date") != "" && dwr.util.getValue("case_date2") != ""){
									wh += " and to_char(bi.case_date,'yyyy-mm-dd') between '" + setFormatDate(dwr.util.getValue("case_date")) + "' and '" + setFormatDate(dwr.util.getValue("case_date2")) + "'";
									caseDate += "&getDatefrom=" + setFormatDate(dwr.util.getValue("case_date")) + "&getDateto=" + setFormatDate(dwr.util.getValue("case_date2"));
								}else if(dwr.util.getValue("case_date") != ""){
									wh += " and to_char(bi.case_date,'yyyy-mm-dd') >= '" + setFormatDate(dwr.util.getValue("case_date")) + "' ";
									caseDate += "&getDatefrom=" + setFormatDate(dwr.util.getValue("case_date"));
								}else if(dwr.util.getValue("case_date2") != ""){
									wh += " and to_char(bi.case_date,'yyyy-mm-dd') <= '" + setFormatDate(dwr.util.getValue("case_date2")) + "' ";
									caseDate += "&getDateto=" + setFormatDate(dwr.util.getValue("case_date2"));
								}

								if (dwr.util.getValue("application_date") != "" && dwr.util.getValue("application_date2") != ""){
									wh += " and to_char(aa.application_date,'yyyy-mm-dd') between '" + setFormatDate(dwr.util.getValue("application_date")) + "' and '" + setFormatDate(dwr.util.getValue("application_date2")) + "'";
								}else if(dwr.util.getValue("application_date") != ""){
									wh += " and to_char(aa.application_date,'yyyy-mm-dd') >= '" + setFormatDate(dwr.util.getValue("application_date")) + "'";
								}else if(dwr.util.getValue("application_date2") != ""){
									wh += " and to_char(aa.application_date,'yyyy-mm-dd') <= '" + setFormatDate(dwr.util.getValue("application_date2")) + "'";
								}

								if (dwr.util.getValue("aa_track_no") != "")
									wh += " and aa.track_no like '%" + dwr.util.getValue("aa_track_no") + "%'";
								if (dwr.util.getValue("case_id") != "")
									wh += " and bi.case_id like '%" + dwr.util.getValue("case_id") + "%'";
								if (dwr.util.getValue("partial_name") != "")
									wh += " and nvl(aa.accuser_name,ti.title_name || st.first_name || ' ' || st.last_name) like '%" + dwr.util.getValue("partial_name") + "%'";
								if (dwr.util.getValue("product_name") != "")
									wh += " and pke_arrest.getArrestExhibit(aa.track_no) like '%" + dwr.util.getValue("product_name") + "%'";
								if (dwr.util.getValue("case_law_id") != "")
									wh += " and ind.case_law_id like '%" + dwr.util.getValue("case_law_id") + "%'";
								if (dwr.util.getValue("province") != "")
									wh += " and aa.scene_province='" + dwr.util.getValue("province") + "'";
								if (dwr.util.getValue("district") != "")
									wh += " and aa.scene_district='" + dwr.util.getValue("district") + "'";
								if (dwr.util.getValue("tambol") != "")
									wh += " and aa.scene_subdistrict='" + dwr.util.getValue("tambol") + "'";
								if (dwr.util.getValue("compare_case_no") != "")
									wh += " and cc.compare_case_no like '%" + dwr.util.getValue("compare_case_no") + "%'";
								if (dwr.util.getValue("exhibit_report_no") != "")
									wh += " and aap.exhibit_report_no like '%" + dwr.util.getValue("exhibit_report_no") + "%'";
								if (dwr.util.getValue("lawbreaker_id_card") != "")
									wh += " and aal.lawbreaker_id_card like '%" + dwr.util.getValue("lawbreaker_id_card") + "%'";

								if (dwr.util.getValue("case_fine") != "" && dwr.util.getValue("case_fine2") != ""){
									wh += " and cc.case_total_fine between '" + dwr.util.getValue("case_fine") + "' and '" + dwr.util.getValue("case_fine2") + "'";
								}else if(dwr.util.getValue("case_fine") != ""){
									wh += " and cc.case_total_fine >= '" + dwr.util.getValue("case_fine") + "'";
								}else if(dwr.util.getValue("case_fine2") != ""){
									wh += " and cc.case_total_fine <= '" + dwr.util.getValue("case_fine2") + "'";
								}

					            if (dwr.util.getValue("offcode") != "")
						            wh += " and aa.offcode = '" + dwr.util.getValue("offcode") + "'";
								if (dwr.util.getValue("accuserType") != "")
									wh += " and aa.accuser_type = '" + dwr.util.getValue("accuserType") + "'";
								if (dwr.util.getValue("exhibit_wild") != "")
									wh += " and ind.exhibit_wild='" + dwr.util.getValue("exhibit_wild") + "'";
								if (dwr.util.getValue("case_quality1") != "" || dwr.util.getValue("case_quality2") != ""){
									var tmpCaseQuality = "";
									if (dwr.util.getValue("case_quality1") != "")
										tmpCaseQuality += ",'" + dwr.util.getValue("case_quality1") + "'";
									if (dwr.util.getValue("case_quality2") != "")
										tmpCaseQuality += ",'" + dwr.util.getValue("case_quality2") + "'";
									
									wh += " and bi.case_quality in (" + tmpCaseQuality.substring(1) + ")";
								}
								if (dwr.util.getValue("have_culprit") != "")
									wh += " and aa.have_culprit='" + dwr.util.getValue("have_culprit") + "'";
								if (dwr.util.getValue("caseLast1") != "" || dwr.util.getValue("caseLast2") != "" || dwr.util.getValue("caseLast3") != ""){
									var tmbCaseLast = "";
									if (dwr.util.getValue("caseLast1") != "")
										tmbCaseLast += ",'" + dwr.util.getValue("caseLast1") + "'";
									if (dwr.util.getValue("caseLast2") != "")
										tmbCaseLast += ",'" + dwr.util.getValue("caseLast2") + "'";
									if (dwr.util.getValue("caseLast3") != "")
										tmbCaseLast += ",'" + dwr.util.getValue("caseLast3") + "'";

									wh += " and bi.case_last in (" + tmbCaseLast.substring(1) + ")";
								}

								if (dwr.util.getValue("iswithdraw") != "")
									wh += " and ale.iswithdraw='" + dwr.util.getValue("iswithdraw") + "'";
								if (dwr.util.getValue("notice_no") != "")
									wh += " and ana.notice_no like '%" + dwr.util.getValue("notice_no") + "%'";
								if (dwr.util.getValue("warrant_no") != "")
									wh += " and asw.request_no like '%" + dwr.util.getValue("warrant_no") + "%'";
								if (dwr.util.getValue("asi_track_no") != "")
									wh += " and asi.track_no like '%" + dwr.util.getValue("asi_track_no") + "%'";

								//alert(wh + "###" );
								Reports.ReportUrl(function(data){
									if(data != ""){
										//alert(wh);
										var user_id = "<%=RequestUtil.getUserSession(request).getIdCard()%>";
										var url = data + "ReportName=ILLR8314&vReportType=PDF&getOffcode="+dwr.util.getValue("offcode")+"&UserID="+user_id+ caseDate + "&whText="+ encodeURIComponent(wh) +"&time=" + Math.random();
										//alert(url);
										window.open(url,'_blank' ,'menubar=no,toolbar=yes,resizable=yes,location=yes,scrollbars=yes,width=900,height=700');
									}
								});
								
								return false;
		           			}


		           			function setFormatDate(DateIn){
		           				var dd=DateIn.substring(0,2);
								var mm=DateIn.substring(3,5);
								var yy=DateIn.substring(6,10)-543;

								return yy + "-" + mm + "-" + dd;
				           	}
	           			</script>
	           		</c:if>
	           </td>
	          <td width="34%">&nbsp;</td>
	          </tr>
          </tbody>
		</table>


      </td>
      </tr>
   <tr>
    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
    <td width="98%"></td>
    <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
  </tr>
</table>

<script type="text/javascript">

function setDDlGroupID(group_id, vLegislationID, vGroupID){
	//alert(vLegislationID);
	LegislationProduct.getDutyGroup(vLegislationID,function(data){
		dwr.util.removeAllOptions(group_id);
		dwr.util.addOptions(group_id,[{group_id:"",group_name:"โปรดเลือก"}],"group_id","group_name");
		dwr.util.addOptions(group_id,data,"group_id","group_name");
		
		if(vGroupID!=null && vGroupID!="" ){
			dwr.util.setValue(group_id,vGroupID);
		}
	})
}
function clearOffname(){
	var fForm = document.dataform;
	if(fForm.offcode.value == "")
		fForm.offname.value = "";
}
function setSearchCon(){
	var searchCon = document.getElementById("searchCon");
	if(searchCon.style.display == 'none')
		searchCon.style.display = '';
	else
		searchCon.style.display = 'none';
}

	getProvince('province','district','tambol','${param.province}','${param.district}','${param.tambol}');
	setDDlGroupID('product','${param.legislation}','${param.product}');
</script>
