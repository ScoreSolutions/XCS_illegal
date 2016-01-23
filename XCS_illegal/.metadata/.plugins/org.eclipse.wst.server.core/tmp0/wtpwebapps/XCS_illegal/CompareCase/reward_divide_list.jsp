<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">

function clear2(){
	window.location.href="process?action=Reward_divide";
}

function clearOffname(vOffcode){
	if(vOffcode == ""){
		document.getElementById("offname").value = "";
	}
}


function AlertRewardZero(RewardMoney){
	//alert(parseFloat(RewardMoney) + "  ABC 123");
	if (parseFloat(RewardMoney)<=0){
		alert("ดคีไม่มีเงินรางวัล ไม่สามารถแบ่งเงินรางวัลได้");
		return false;
	}else{
		return true;
	}
}

</script>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%" ><span class="websitename">แบ่งเงินสินบนรางวัล</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                <form action="process?action=Reward_divide&cmd=listAmm" name="dataform" method="post">
                    <input type="hidden" name="doSearch" value="doSearch" />
                <table width="900" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
                  <tr>
                    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
                    <td width="98%"></td>
                    <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td align="center" valign="top"><table width="98%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="50%" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
                        <td width="50%">&nbsp;</td>
                      </tr>
                      <tr>
                        <td align="left" valign="top"><table width="98%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td height="25"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                              <tr>
                                <td width="33%" height="25" align="right">เลขที่งาน :&nbsp;</td>
                                <td width="67%" height="25"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                                  <tr>
                                    <td width="85%"><input name="track_no" type="text" size="30" maxlength="30" value="${track_no}"></td>
                                    <td width="15%">&nbsp;</td>
                                  </tr>
                                </table></td>
                              </tr>
                              <tr>
                                <td height="25" align="right">พ.ร.บ :&nbsp;</td>
                                <td height="25">
									<select name="legislation_id" id="legislation_id" style="width:200px;">
								 <option value="" selected>ทั้งหมด</option>
            				<c:forEach items="${les}"  var="ltion">
            				<option value=${ltion.id}  ${(ltion.id==legislation_id)?'selected':''}>${ltion.legislation_code} ${ltion.legislation_name}</option>
            				</c:forEach>
							</select>
								</td>
                              </tr>
                              <tr>
                                <td height="25" align="right">คดีเปรียบเทียบที่ :&nbsp;</td>
                                <td height="25">
										<input name="compare_case_no" type="text" size="30" maxlength="30" value="${compare_case_no}">
								</td>
                              </tr>
                              <tr>
                                <td height="25" align="right">ชื่อผู้ต้องหา :&nbsp;</td>
                                <td height="25"><input name="lawbreaker_name" type="text" size="30" maxlength="30" value="${lawbreaker_name}"> </td>
                              </tr>
                            </table></td>
                          </tr>
                        </table></td>
                        <td valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
		                    <td width="35%" align="right">หน่วยงาน :&nbsp;</td>
		                    <td width="65%" height="25" align="left">
		                    	<c:if test="${IsAdmin == '1'}">
			                       	<input type="text" name="offcode" id="offcode" size="4"  class="textbox" onblur="getOffname(this.value,'Y',offname);" value="${offcode}" >
			                       	<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
	                            	onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" >
		                      	</c:if>
		                      	<c:if test="${IsAdmin != '1'}">
			                       	<input type="text" name="offcode" id="offcode" size="6"  class="textview" readonly  value="${offcode}" >
		                      	</c:if>
		                      	<input type="text" name="offname" id="offname" size="30"  class="textview" readonly value="${offname}" >
		                    </td>
                          </tr>
                          <tr>
                            <td height="25" align="right">สินค้า :&nbsp;</td>
                            <td height="25" align="left">
								<input name="group_name" type="text" size="30"  value="${group_name}">
							</td>
                          </tr>
                          <tr>
                            <td height="25" align="right">วันที่แบ่งเงิน :&nbsp;</td>
                            <td height="25" colspan="2" align="left">
									<input name="divide_date1" type="text" id="divide_date1"  readonly class="textdate" value="${divide_date1}">
									<a href="javascript:NewCssCal('divide_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a> &nbsp;&nbsp;
									ถึง :&nbsp;
									<input name="divide_date2" type="text" id="divide_date2"  readonly class="textdate" value="${divide_date2}" >
									<a href="javascript:NewCssCal('divide_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
							</td>
                          </tr>
                          <tr>
                            <td height="25" align="right">ชื่อผู้จับกุม :&nbsp;</td>
                            <td height="25" align="left"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                              <tr>
                                <td width="85%"><input name="accuser_name" type="text" size="30" value="${accuser_name}"></td>
                                <td width="15%">&nbsp;</td>
                              </tr>
                            </table></td>
                          </tr>
                          <tr>
                            <td height="25" align="right">สถานะ :&nbsp;</td>
                            <td height="25" align="left">
								<select name="status" id="status" style="width:220px;">
									<option value="" >ทั้งหมด</option>
									<option value="0" ${(status != null && status == '0')?'selected':''}>แบ่งเงินแล้ว</option>
									<option value="1" ${(status != null && status == '1')?'selected':''}>ยังไม่แบ่งเงิน</option>
								</select>
							</td>
                          </tr>
                        </table></td>
                      </tr>
                      <tr>
                        <td align="left" valign="top">&nbsp;</td>
                        <td valign="top">&nbsp;</td>
                      </tr>
                      <tr>
                        <td colspan="2" align="center" valign="top"><input alt="Submit Form" type="image" src="images/btn_search_big.png" width="64" height="22" name="search"><%@ include file="/Templates/clearIcon.jsp"%></td>
                        </tr>
                    </table></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
                    <td></td>
                    <td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
                  </tr>
                </table>
                </form>
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
               <tr  align="left" valign="top">
					<td colspan="8"><%=pageUtil.getPagination()%></td>
					<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
                  <tr>
                    <td width="30px" class="TblHeaderColumn">ลำดับ</td>
					<td width="133px" class="TblHeaderColumn AlignCenter">คดีเปรียบเทียบที่</td>
                    <td width="146px" class="TblHeaderColumn">วันที่เปรียบเทียบปรับ</td>
					<td width="124px" class="TblHeaderColumn">ความผิดตาม พรบ.</td>
                    <td width="74px" class="TblHeaderColumn">ค่าปรับ</td>
                    <td width="66px" class="TblHeaderColumn">สินบน</td>
                    <td width="75px" class="TblHeaderColumn">รางวัล</td>
                    <td width="82px" class="TblHeaderColumn">เงินส่งคลัง</td>
                    <td width="100px" class="TblHeaderColumn">เลขที่งาน</td>
                    <td width="100px" class="TblHeaderColumn">สถานะ</td>
                  </tr>
                  <c:if test="${rowCount == '0'}">
                  	<tr><td colspan="10" align="center">ไม่พบรายการที่ค้นหา</td></tr>
                  </c:if>
                  <c:forEach items="${dblist}" var="db" varStatus="i">
					<tr class='${(i.count%2==0)?"bgRowGray":""}'>
						<td class="TblRow AlignCenter">${i.count+_rowIndex}</td>
						<td class="TblRow AlignLeft"><a href="process?action=Reward_divide&cmd=preup&id=${db.cc_id}" onclick="return AlertRewardZero(${db.reward_money});" >${db.compare_case_no}</a></td>
						<td class="TblRow AlignLeft">${db.compare_case_date}</td>
						<td class="TblRow AlignLeft">${db.legislation_name}</td>
						<td class="TblRow AlignLeft">${db.fine_money}</td>
						<td class="TblRow AlignLeft">${db.birbe_money}</td>
						<td class="TblRow AlignLeft">${db.reward_money} </td>
						<td class="TblRow AlignLeft">${db.treasury_money}</td>
						<td class="TblRow AlignLeft">${db.divide_no}</td>
						<td class="TblRow AlignLeft">${db.status_name}</td>
					</tr>
					</c:forEach>
                  
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    </tr>
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>
