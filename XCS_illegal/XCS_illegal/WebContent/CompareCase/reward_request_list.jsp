<%@ page import="com.ko.webapp.util.PageUtil" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@include file="/Templates/taglibs.jsp"%>
 <%
PageUtil pageUtil = new PageUtil(request);
%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type="text/javascript">
function clear2()
{
	window.location.href="process?action=ApplicationRewardRequest&cmd=list" ;
}
</script>
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%" ><span class="websitename">คำร้องขอรับเงินสินบนและรางวัล</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>
                <a id="addRewardReq" href="process?action=ApplicationRewardRequest&cmd=add" class="linkmenu3level">เพิ่มข้อมูล</a>&nbsp;
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="750" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
                  <tr>
                    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
                    <td width="98%"></td>
                    <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td align="center" valign="top">
                    <form action="process?action=ApplicationRewardRequest&cmd=list" name="dataform" method="post">
                    <input type="hidden" name="doSearch" value="doSearch" />
					<table width="98%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="51%" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
                        <td width="49%">&nbsp;</td>
                      </tr>
                      <tr>
                        <td colspan="2" height="25" align="left" valign="top">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								  <tr height="25px">
										<td width="20%" align="right">พ.ร.บ. :&nbsp;</td>
										<td width="30%" >
												<select name="legislation_id">
												    <option value="" >ทั้งหมด</option>
											        <c:forEach items="${legislations}" var="lg" varStatus="i">
											            <option value="${lg.id}" ${(lg.id==legislation_id)?'selected':''}>${lg.legislation_name}</option>
											        </c:forEach>
											    </select>
										</td>
										<td width="15%" align="right">หน่วยงาน :</td>
										<td width="35%">
											<c:if test="${IsAdmin == '1'}">
						                       <input type="text" name="offcode" id="offcode" size="4"  class="textbox" value="${offcode }" 
						                       	onBlur="getOffname(this.value,'Y',offname);" >
						                       <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
						                            onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" >
						                       <input type="text" name="offname" id="offname" size="22"  class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${offname }">
						                    </c:if>
						                    <c:if test="${IsAdmin != '1'}">
						                       <input type="text" name="offcode" id="offcode" size="8" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview" value="${offcode }"  >
						                       <input type="text" name="offname" id="offname" size="25" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview"  value="${offname }">
						                    </c:if>
										</td>
								  </tr>
								  <tr>
										<td align="right">เลขที่เอกสาร :&nbsp;</td>
										<td >
											<input name="request_no" type="text" size="25" maxlength="30" value="${request_no}">
										</td>
										<td align="right">วันที่ร้องขอ :</td>
										<td >
											<input name="request_date_from" type="text" id="request_date_from" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${request_date_from}">
                                            <a href="javascript:NewCssCal('request_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>&nbsp;
											 ถึง &nbsp;
											<input name="request_date_to" type="text" id="request_date_to" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${request_date_to}">
											<a href="javascript:NewCssCal('request_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>&nbsp;
										</td>
								  </tr>
								  <tr>
										<td align="right">ชื่อผู้ร้องขอ :&nbsp;</td>
										<td >
											<input name="staff_name" type="text" size="25" maxlength="30" value="${staff_name}">
										</td>
										<td align="right">ชื่อผู้ต้องหา :&nbsp;</td>
										<td >
											<input name="lawbreaker_name" type="text" size="28" value="${lawbreaker_name}">
										</td>
								  </tr>
								  <tr>
										<td align="right">คดีเปรียบเทียบที่ :&nbsp;</td>
										<td >
											<input name="compare_case_no" type="text" size="25" maxlength="30" value="${compare_case_no}">
										</td>
										<td align="right">วันที่เปรียบเทียบ :</td>
										<td >
											<input name="compare_case_date_from" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${compare_case_date_from}" id="compare_case_date_from">
											<a href="javascript:NewCssCal('compare_case_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>&nbsp;
                                            ถึง &nbsp;
											<input name="compare_case_date_to" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${param.compare_case_date_to}" id="compare_case_date_to">
											<a href="javascript:NewCssCal('compare_case_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>&nbsp;
										</td>
								  </tr>
							</table>
						</td>
                      </tr>
                      <tr>
                        <td align="left" valign="top">&nbsp;</td>
                        <td valign="top">&nbsp;</td>
                      </tr>
                      <tr>
                        <td colspan="2" align="center" valign="top">
                            <input alt="Submit Form" type="image" src="images/btn_search_big.png" width="64" height="22" name="search"><%@ include file="../Templates/clearIcon.jsp"%>
                        </td>
                        </tr>
                    </table>
                    </form>
                    </td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
                    <td></td>
                    <td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
                  </tr>
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table class="tableList" width="950" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                  <tr  align="left" valign="top">
					<td colspan="8"><%=pageUtil.getPagination()%></td>
					<td colspan="4" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
                  <tr>
				<td width="30" class="TblHeaderColumn">ลำดับ</td>
                    <td width="118" class="TblHeaderColumn AlignCenter">เลขที่เอกสาร</td>
                    <td width="100" class="TblHeaderColumn">ผู้เข้าจับกุม</td>
                    <td width="118" class="TblHeaderColumn AlignCenter">คดีเปรียบเทียบที่</td>
                    <td width="80" class="TblHeaderColumn">พ.ร.บ.</td>
                    <td width="50" class="TblHeaderColumn">สินค้า</td>
                    <td width="80" class="TblHeaderColumn">วันที่ร้องขอ</td>
                    <td width="70" class="TblHeaderColumn">ชื่อผู้ต้องหา</td>
                    <td width="70" class="TblHeaderColumn">เงินสินบน</td>
                    <td width="62" class="TblHeaderColumn">เงินรางวัล</td>
                    <td width="66" class="TblHeaderColumn">เงินส่งคลัง</td>
                    <td width="92" class="TblHeaderColumn">ชื่อผู้ร้องขอ</td>
                  </tr>
                    <c:forEach items="${result}" var="db" varStatus="i">
                  <tr class='${(i.count%2==0)?"bgRowGray":""}'>
					<td class="TblRow AlignCenter">${i.count}</td>
                    <td class="TblRow AlignCenter"><a href="process?action=ApplicationRewardRequest&cmd=edit&id=${db.application_reward_request_id}">${db.request_no}</a></td>
                    <td class="TblRow AlignLeft">${db.arrest_name}</td>
                    <td class="TblRow AlignLeft">${db.compare_case_no}</td>
                    <td class="TblRow AlignLeft">${db.legislation_name}</td>
                    <td class="TblRow AlignLeft">${db.group_name}</td>
                    <td class="TblRow AlignLeft">${db.request_date2}</td>
                    <td class="TblRow AlignLeft">${db.lawbreaker_name}</td>
                    <td class="TblRow AlignLeft">${db.birbe_money}</td>
                    <td class="TblRow AlignLeft">${db.reward_money}</td>
                    <td class="TblRow AlignLeft">${db.treasury_money}</td>
                    <td class="TblRow AlignLeft">${db.request_name}</td>
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


