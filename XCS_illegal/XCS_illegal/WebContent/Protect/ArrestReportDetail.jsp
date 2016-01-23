
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<%@ page import="java.util.Date" %>
<script>
	function Print(){
		writeTranLog('พิมพ์รายงานการจับกุมเลขที่งาน ${ar.job_no}');
		Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + "ReportName=ILL_P045&getID=${ar.id}&vReportType=PDF&time=" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}else{
				window.open('process?action=Report&__report=ILL_P045&__formatt=pdf&getID=${ar.id}&time=<%=new java.util.Date().getTime()%>' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}
		});
	}
</script>
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">รายงานการจับกุม</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><hr /></td>
              </tr>
			  <tr>
				<td >&nbsp;</td>
				<td>
					<input name="btnSave"  type="submit" class="barButton" value="บันทึก" >
					<input name="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขรายงานการจับกุม');window.location.href='<c:url value="${action}" />'; " >
					<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา"  onclick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=ArrestReport" />' ">
					
					<c:if test="${ar.id != null}">
						<input name="btnPrint"  type="button" class="barButton" value="พิมพ์"
								onClick="Print();" >
					</c:if>
				</td>
			  </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><hr /></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td >
                <table width="800" border="0" cellspacing="0" cellpadding="0" >
                  <tr>
                    <td width="100%" align="left" valign="top">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" >
	                      <tr>
	                        <td  height="25" align="right">เลขที่งาน :&nbsp;</td>
	                        <td >
								<input type="text" name="job_no" id="job_no" size="28"  class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${ar.job_no}" >
								<input type="hidden" name="ar_id" value="${ar.id}"/>
							</td>
	                      </tr>
	                      <tr>
	                        <td width="30%" height="25" align="right" >เรื่อง :&nbsp;</td>
	                        <td width="70%">
								<input type="text" name="report_title" id="report_title" style="width:550px"  class="text"  value="${ar.report_title}" >
								<font style="color:red">*</font>
							</td>
	                      </tr>
	                      <tr>
	                        <td  height="25" align="right">วันที่จับ :&nbsp;</td>
	                        <td >
	                             <c:if test="${ar.case_date != null}">
								  <input name="case_date" id="case_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyPress="txtKeyPress(event);" value="<fmt:formatDate value="${ar.case_date}" pattern="dd/MM/yyyy" />"  />
								  <a href="javascript:NewCssCal('case_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
								</c:if>
								<c:if test="${ar.case_date == null}">
									<input name="case_date" id="case_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyPress="txtKeyPress(event);" value="<fmt:formatDate value="<%=new Date() %>" pattern="dd/MM/yyyy" />"  />
								  	<a href="javascript:NewCssCal('case_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
								</c:if>
								<font style="color:red">*</font>
	                        </td>
	                      </tr>
	                      <tr>
	                        <td  height="25" align="right">ชนิดและปริมาณของที่จับได้ :&nbsp;</td>
	                        <td >
								<TEXTAREA NAME="exhibit_desc" ROWS="3" COLS="70">${ar.exhibit_desc}</TEXTAREA>
							</td>
	                      </tr>
						  <tr>
							<td  align="right">ลักษณะที่ตรวจพบ :&nbsp;</td>
							<td >
								<TEXTAREA NAME="nature_invest" ROWS="3" COLS="70">${ar.nature_invest}</TEXTAREA>
							</td>
						  </tr>
						  <tr>
	                        <td  height="25" align="right">ชื่อผู้ถูกจับกุม :&nbsp;</td>
	                        <td >
								<input type="text" name="lawbreaker_name" id="lawbreaker_name" size="28"  class="text"  value="${ar.lawbreaker_name}" >
							</td>
	                      </tr>
	                      <tr>
	                        <td  height="25" align="right">&nbsp;</td>
	                        <td >
								<INPUT TYPE="checkbox" NAME="isNotice" value="Y" <c:if test="${ar.isnotice == 'Y'}"> checked </c:if>>มีการแจ้งความ
								&nbsp;
								<INPUT TYPE="checkbox" NAME="isCompare" value="Y" <c:if test="${ar.iscompare == 'Y'}"> checked </c:if>>ตรวจจับได้ตรงกับที่แจ้ง
							</td>
	                      </tr>
	                      <tr>
	                        <td  height="25" align="right">ชื่อและตำแหน่งผู้จับกุม :&nbsp;</td>
	                        <td >
								<input type="text" name="accuser_name" id="accuser_name" style="width:550px"  class="text"  value="${ar.accuser_name}" >
								<font style="color:red">*</font>
							</td>
	                      </tr>
	                      <tr>
	                        <td  height="25" align="right">ผู้ช่วยเหลือ :&nbsp;</td>
	                        <td >
								<input type="text" name="helper_name" id="helper_name" style="width:550px"  class="text"  value="${ar.helper_name}" >
							</td>
	                      </tr>
	                      <tr>
	                        <td  height="25" align="right">ชื่อและตำแหน่งผู้ควบคุมการจับกุม :&nbsp;</td>
	                        <td >
								<input type="text" name="commander_name" id="commander_name" style="width:550px" class="text"  value="${ar.commander_name}" >
							</td>
	                      </tr>
	                      <tr>
							<td  align="right">รายละเอียดการจับกุมและความเห็น :&nbsp;</td>
							<td >
								<TEXTAREA NAME="arrest_desc" ROWS="3" COLS="70">${ar.arrest_desc}</TEXTAREA>
							</td>
						  </tr>
						  <tr>
							<td  align="right">ความคิดเห็นของผู้บังคับบัญชา :&nbsp;</td>
							<td >
								<TEXTAREA NAME="commander_comment" ROWS="3" COLS="70">${ar.commander_comment}</TEXTAREA>
							</td>
						  </tr>
						  <tr height="35px">
						  	<td colspan="2">
						  		<table border="0" cellpadding="0" cellspacing="0" width="100%">
						  			<tr>
						  				<td width="30%" align="right" valign="middle">ลงชื่อ :&nbsp;</td>
						  				<td width="30%">
						  					<input type="text" id="staff_name_sue" name="staff_name_sue" class="textview" size="28" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${ar.staff_name_sue} ">
						                    <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
						                         onClick="window.open('process?action=Divide_staff_popForArrest&formname=staff_name_sue&posname=staff_posname_sue' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"/>
						                    <font style="color:red">*</font>
						  				</td>
						  				<td width="20%" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
						  				<td width="20%">
						  					<input id="staff_posname_sue" name="staff_posname_sue" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="35" value="${ar.staff_posname_sue }"/>
						  				</td>
						  			</tr>
						  		</table>
						  	</td>
			             </tr>
			            <tr>
							<td  align="right">คำสั่ง :&nbsp;</td>
							<td >
								<TEXTAREA NAME="report_command" ROWS="3" COLS="70">${ar.report_command}</TEXTAREA>
							</td>
						</tr>
                      </table>
					</td>
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
            </table></td>
		  </tr>
		</table>
		<c:if test="${SaveMSG=='1'}">
			<script>
				alert("บันทึกเรียบร้อย");
			</script>
		</c:if>
		
		
	
	

