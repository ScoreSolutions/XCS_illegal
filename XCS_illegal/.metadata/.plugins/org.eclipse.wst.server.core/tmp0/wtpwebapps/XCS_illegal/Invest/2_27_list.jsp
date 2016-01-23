<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>

<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script LANGUAGE="JavaScript">

function clear2(){
	window.location.href="process?action=Guarantee";
}

function btDelete(id)
{
var answer = confirm ("ยืนยันการลบข้อมูล");
	if (answer){
	window.location.href="process?action=Guarantee&id="+id+"&cmd=delete";
	}
	else{
	}
}

function PrintBlankReport(){

	Reports.ReportUrl(function(data){
		if(data != ""){
			window.open(data + 'ReportName=ILL_P015&getTrackNo=000000000000000&vReportType=PDF&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			window.open('process?action=Report&__report=ILL_P015&__formatt=pdf&getTrackNo=000000000000000' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}
	});

	writeTranLog('พิมพ์แบบฟอร์มเปล่าใบรับรองความบริสุทธิ์');	
}
</script>
<form method="post" name="dataform" action="<c:url value="/process?action=Guarantee&cmd=find"/>">
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ใบรับรองความบริสุทธิ์</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="30">
                  <span class="spanLink" onClick="window.location.href='<c:url value="process?action=Guarantee&cmd=add"/>';writeTranLog('เพิ่มข้อมูลบันทึกรับรองความบริสุทธิ์')" > เพิ่มข้อมูลใหม่</span>
                   &nbsp;
                   <span class="spanLink"
					onClick="PrintBlankReport();" >พิมพ์ใบรับรองความบริสุทธิ์</span>
			</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="700" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
                    <tr>
                      <td><table width="700" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">
                          <tr>
                            <td width="1%" align="left" valign="top"></td>
                            <td width="98%"></td>
                            <td width="1%" align="right" valign="top"></td>
                          </tr>
                          <tr>
                            <td height="40">&nbsp;</td>
                            <td align="center" valign="top"><table width="98%" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                  <td height="25" align="left" valign="top" colspan="4"><span class="sectionname">ค้นหาข้อมูล</span></td>
                                </tr>
                                <tr>
                                  <td height="30" align="right" valign="middle">วันที่ตรวจค้น :&nbsp;</td>
                                  <td align="left" valign="middle"><input id="detect_datefrom" name="detect_datefrom" type="text" class="textView" readonly size="7" maxlength="10" value="${param.detect_datefrom }" />
                                      <a href="javascript:NewCssCal('detect_datefrom','ddmmyyyy')"><img
							src="images/btn_calendar.png" alt="" width="19" height="19"
							align="middle" style="border-style: none"></a> -
                                    <input id="detect_dateto"  name="detect_dateto" type="text" class="textView"  size="7" maxlength="10"  readonly value="${param.detect_dateto }" />
                                      <a href="javascript:NewCssCal('detect_dateto','ddmmyyyy')"><img
							src="images/btn_calendar.png" alt="" width="19" height="19"
							align="middle" style="border-style: none"></a></td>
                                  <td height="30" align="right" valign="middle">วันที่รับแจ้งความ :&nbsp;</td>
                                  <td align="left" valign="middle"><input id="notice_datefrom" name="notice_datefrom" type="text" class="textView"  readonly  size="7" maxlength="10" value="${param.notice_datefrom }" />
                                      <a href="javascript:NewCssCal('notice_datefrom','ddmmyyyy')"><img
							src="images/btn_calendar.png" alt="" width="19" height="19"
							align="middle" style="border-style: none"></a> -
                                    <input name="notice_dateto" type="text" class="textView" size="7"  readonly  maxlength="10" value="${param.notice_dateto }" />
                                      <a href="javascript:NewCssCal('notice_dateto','ddmmyyyy')"><img
							src="images/btn_calendar.png" alt="" width="19" height="19"
							align="middle" style="border-style: none"></a></td>
                                </tr>
                                <tr>
                                  <td width="20%" height="30" align="right" valign="middle">เจ้าบ้าน / ผู้ดูแลแทนฯ :&nbsp;</td>
                                  <td width="30%" align="left" valign="middle"><input name="owner_name" type="text" class="textbox" value="${param.owner_name }" /></td>
                                  <td width="20%" height="30" align="right" valign="middle">ชื่อผู้ตรวจค้น :&nbsp;</td>
                                  <td width="30%" align="left" valign="middle"><input name="detect_name" type="text" class="textbox"  value="${param.detect_name }" /></td>
                                </tr>
                                <tr>
                                  <td  align="right" valign="middle">ข้อกล่าวหา :&nbsp;</td>
                                  <td colspan="3" align="left" valign="middle">
                                    <input name="indictment_name" type="text" class="textbox" size="75" value="${param.indictment_name}" >
                                  </td>
                                </tr>
                                <tr>                               
                                  <td height="30" colspan="4" align="center" valign="bottom"><input type="image" src="images/btn_search_big.png" width="65" height="23" onclick = "writeTranLog('ค้นหาข้อมูลใบรับรองความบริสุทธิ์')" ><%@ include file="../Templates/clearIcon.jsp"%></td>
                                </tr>
                            </table></td>
                            <td>&nbsp;</td>
                          </tr>
                          <tr>
                            <td align="left" valign="bottom" height="10"></td>
                            <td></td>
                            <td align="right" valign="bottom"></td>
                          </tr>
                      </table></td>
                    </tr>
                  </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>

              <tr>
                <td>&nbsp;</td>
                <td><table class="tableList" width="900" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                 
			<tr  align="left" valign="top">
<td colspan="5"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>

                   <tr>
                    <td width="30" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                    <td width="71" height="16" class="TblHeaderColumn AlignCenter">เลขที่งาน</td>
                    <td width="100" class="TblHeaderColumn ">วันที่รับแจ้งความ</td>
                    <td width="141" class="TblHeaderColumn ">เจ้าบ้าน / ผู้ดูแลแทนฯ</td>
					<td width="145" class="TblHeaderColumn ">สถานที่จัดเก็บเอกสาร</td>
                    <td width="145" class="TblHeaderColumn ">ข้อกล่าวหา</td>
                    <td width="157" class="TblHeaderColumn ">ผลการตรวจค้น</td>
                    <td class="TblHeaderColumn ">&nbsp;</td>
                  </tr>
                  <c:if test="${rowCount == '0'}" >
                  	<tr><td colspan="8" align="center">ไม่พบรายการที่ค้นหา</td></tr>
                  </c:if>
                  <c:forEach items="${asfmap}"  var="asf" varStatus="i">
						<tr>
						    <td class="TblRow AlignCenter">${i.count}</td>
							<td class="TblRow AlignCenter"><a href="process?action=Guarantee&cmd=view&id=${asf.id}" onclick=writeTranLog('แสดงรายละเอียดรายงานการสืบสวน') >${asf.track_no}</a></td>
							<td class="TblRow AlignCenter">${asf.notice_date2}</td>
							<td class="TblRow AlignLeft">${asf.owner_name}</td>
							<td class="TblRow AlignLeft">${asf.store_place }</td>
							<td class="TblRow AlignLeft">${asf.indictment_name }</td>
							<td class="TblRow AlignLeft">${asf.detect_result }</td>
							<td class="TblRow AlignLeft">
			                   <img src="images/icon_delete.gif" width="25" height="25" border="0" title="ลบรายการ" style="cursor:hand;" onclick = 'btDelete("${asf.id}");'>
							</td>		
						</tr>

					 </c:forEach>
                 
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>
</form>


