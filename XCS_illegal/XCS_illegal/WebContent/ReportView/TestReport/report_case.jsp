<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">รายงานส่วนคดี</span></td>
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
                        <td width="14%" height="25"><p><strong>รายงานคดี</strong></p></td>
                      </tr>
                      <tr>
                        <td height="25"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td ><div align="right">1.</div></td>
                            <td height="25" ><a href="<c:url value='process?action=ReportCase&cmd=ILLR8301' />" >รายงานผลคดี ส.ส.2/55</a></td>
                          </tr>
                          <tr>
                            <td width="7%"><div align="right">2.</div></td>
                            <td width="93%" height="25"><a href="<c:url value='process?action=ReportCase&cmd=ILLR8302' />" >รายงานผลคดี ส.ส.2/55 (กรณีปรับย้อนหลัง)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">3.</div></td>
                            <td height="25"><a href="<c:url value='process?action=ReportCase&cmd=ILLR8303' />" >ผลสถิติ (ผลการปราบปรามหรือผู้กระทำผิด) ส่วนคดีสำนักกฎหมาย</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">4.</div></td>
                            <td height="25"><a href="<c:url value='process?action=ReportCase&cmd=ILLR8304' />" >หน้างบรายงานสถิติผลคดี</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">5.</div></td>
                            <td height="25"><a href="<c:url value='process?action=ReportCase&cmd=ILLR8305' />" >รายละเอียดหน้างบรายงานผลคดีตาม พ.ร.บ.</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">6.</div></td>
                            <td height="25"><a href="<c:url value='process?action=ReportCase&cmd=ILLR8306' />" >หน้างบสรุปรายงานของกลาง</a></td>
                          </tr>
                          <tr>
                            <td ><div align="right">7.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0307');">รายงานสรุปผลคดีการปราบปรามผู้กระทำผิดกฏหมาย</a></td>
                          </tr>
                          <tr>
                            <td width="7%"><div align="right">8.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0308');">สถิติผลการปราบปรามผู้กระทำผิด ปีงบประมาณ</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">9.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0309');">เปรียบเทียบผลคดีการปราบปรามผู้กระทำผิดกฏหมาย (ระหว่างปีงบประมาณ)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">10.</div></td>
                            <td height="25"><a href="#" onclick="printReports('REP0310');">สรุปผลรายงานผลคดี (คดี) เลือกปีงบประมาณ</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">11.</div></td>
                            <td height="25"><a href="<c:url value='process?action=ReportCase&cmd=ILLR8311' />" >สรุปผลรายงานผลคดี (เงินส่งคลัง)</a></td>
                          </tr>
                          <tr>
                            <td><div align="right">12.</div></td>
                            <td height="25"><a href="<c:url value='process?action=ReportCase&cmd=ILLR8312' />" >สรุปใบเสร็จรับเงิน</a></td>
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
		