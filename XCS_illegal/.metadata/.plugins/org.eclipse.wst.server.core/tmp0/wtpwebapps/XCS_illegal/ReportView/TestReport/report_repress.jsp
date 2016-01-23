<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">รายงานส่วนปราบปราม</span></td>
              </tr>
              <tr>
                <td height="18">&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="750" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="24" align="left" valign="top">&nbsp;</td>
                    <td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="14%" height="25"><strong>รายงานผลงานนายตรวจ</strong></td>
                      </tr>
                      <tr>
                        <td height="25"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td ><div align="right">1.</div></td>
                            <td height="25" ><a href="<c:url value='process?action=ReportRepress&cmd=ILLR8201'/>" >รายงานผลการตรวจค้น</a></td>
                          </tr>
                          <tr>
                            <td width="7%"><div align="right">2.</div></td>
                            <td width="93%" height="25"><a href="#" onclick="printReports('REP0202');">รายงานการกระทำผิดกฎหมายสรรพสามิต</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">3.</div></td>
                            <td height="25"><a href="<c:url value='process?action=ReportRepress&cmd=ILLR8203'/>" >รายงานการกระทำผิดกฎหมายสรรพสามิต (บุคคลทั่วไปและผู้ประกอบการ)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">4.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0204');">รายงานสรุปการกระทำผิดรายตัว (แบบ statement)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">5.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0205');">ข้อมูลเจ้าหน้าที่สรรพสามิต (เลือกตามชื่อ-นามสกุล)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">6.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0206');">ข้อมูลเจ้าหน้าที่สรรพสามิตประเภทของกลาง (เลือกตามชื่อ-นามสกุล)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">7.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0207');">ข้อมูลการจับกุม (เลือกตามสายตรวจ)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">8.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0208');">รายงานผลงานนายตรวจ (เลือกตามสถานที่เกิดเหตุ)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">9.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0209');">ข้อมูลของกลาง</a></td>
                          </tr>
                            <td><div align="right">10.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0210');">รายงานผลงานนายตรวจ</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">11.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0211');">รายงานผลการปราบปราม (ข้อมูลโดยรวม)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">12</div></td>
                            <td height="25"> <a href="#" onclick="printReports('REP0212');">รายงานการจัดอัตรากำลังสายตรวจป้องกันและปราบปราม</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">13.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0213');">รายงานผลการตรวจปราบปรามผู้กระทำผิดกฎหมายสรรพสามิต</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">14.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0214');">รายงานผลการปฏิบัติงานตามโครงการทั่วไทยปลอดบุหรี่เถื่อน</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">15.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0215');">รายงานผลการปฏิบัติงานตามโครงการทั่วไทยปลอดสุราเถื่อน</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">16.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0216');">สรุปรายงานผลการปราบปราม ส่วนป้องกันและปราบปราม สำนักตรวจสอบ ป้องกันและปราบปรามประจำเดือน (แสดงข้อมูลแบบรวมทุกคดี ไม่แยกพ.ร.บ.)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">17.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0217');">สรุปรายงานผลการปราบปราม ส่วนป้องกันและปราบปราม สำนักตรวจสอบ ป้องกันและปราบปรามประจำเดือน (แสดงข้อมูลของแต่ละคดี แต่ละพ.ร.บ.)</a></td>
                          </tr>
                        </table></td>
                      </tr>
                    </table></td>
                    <td width="363" valign="top">&nbsp;</td>
                  </tr>
                  
                </table></td>
              </tr>
            </table></td>
		  </tr>
		</table>