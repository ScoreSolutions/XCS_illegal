

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%@ page import="java.util.ArrayList" %>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/JavaScript">

function MM_goToURL() { //v3.0
  var i, args=MM_goToURL.arguments; document.MM_returnValue = false;
  for (i=0; i<(args.length-1); i+=2) eval(args[i]+".location='"+args[i+1]+"'");
}
function clear2(){
	window.location.href="process?action=Sendincome";
}
</script>

 <form method="post" name="dataform"  action="process?action=Sendincome&cmd=list" >
 
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">การนำส่งเงินรายได้</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><a href="process?action=Sendincome&cmd=add"><strong>เพิ่มข้อมูล</strong></a></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
						<table width="750" border="0" cellpadding="0" cellspacing="0"  bgcolor="#c2c2c2">
							    <tr>
									<td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
									<td width="98%"></td>
									<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
							    </tr>
								<tr>
									<td>&nbsp;</td>
								  <td><table width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr>
									  <td width="52%" height="35" align="left" valign="top"><span class="sectionname">&nbsp;&nbsp;&nbsp;ค้นหา</span></td>
									</tr>
									<tr>
									  <td height="30" align="left" valign="top"><table width="98%" border="0" cellspacing="0" cellpadding="0">
										<tr>
										  <td width="36%" align="right" >เลขที่ใบนำส่งเงิน :&nbsp;</td>
										  <td width="64%" height="25"><input name="send_no" value="${param.send_no }" type="text" class="textbox" size="15" ></td>
										</tr>
										<tr>
										  <td align="right"  >วันที่นำส่งเงิน :&nbsp; </td>
										  <td height="25"><input name="send_date1" id="send_date1" value="${param.send_date1 }" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" style="width:75;" size="7" maxlength="10" />
											  <a href="javascript:NewCssCal('send_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a> -
											<input name="send_date2" id="send_date2" value="${param.send_date2 }" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" style="width:75;" size="7" maxlength="10" />
											  <a href="javascript:NewCssCal('send_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a></td>
										</tr>
										<tr>
										  <td height="25" align="right">พ.ร.บ. :&nbsp;</td>
										  <td><select name="legislation_id" id="legislation_id" style="width:200px;">
													 <option value ="" selected >ทั้งหมด</option>
													
            										<c:forEach items="${ltlist}"  var="ltion">
            										<option value=${ltion.id}  <c:if test="${param.legislation_id == ltion.id}"> selected </c:if>>${ltion.legislation_code} ${ltion.legislation_name}</option>
            										</c:forEach>
											</select></td>
										</tr>
										<tr>
										  <td align="right" >&nbsp;</td>
										  <td height="25">&nbsp;</td>
										</tr>

									  </table></td>
									  <td width="48%" align="left" valign="middle"><table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td align="right">คดีเปรียบเทียบที่ :&nbsp;</td>
											<td><input name="compare_case_no" value="${param.compare_case_no}" type="text" class="textbox" size="15" ></td>
										</tr>
										<tr>
										  <td width="28%" height="25" align="right">หน่วยงานที่นำส่ง :&nbsp;</td>
										  <td width="72%">
												<select name="offcode_write" id="offcode_write" style="width:200px;"  <c:if test="${IsAdmin != '1' }">disabled</c:if>>
                              						<option value=""  >เลือก</option>
        											<c:forEach items="${edlist}" var="off">
          												<option value="${off.offcode}" <c:if test="${off.offcode==userOffcode}" > selected </c:if>>${off.short_name}</option>
        											</c:forEach>
                             					</select>
										  </td>
										</tr>
										<tr>
											<td height="25" align="right">จังหวัด :&nbsp;</td>
											<td>
												<select name="province" id="province" style="width:200px" >
            									<option value="">โปรดเลือกจังหวัด</option>
                          							<%@ include file="/js/listprovince.jsp"%>
                      							</select>
											</td>
										</tr>
										<tr>
										  <td height="25" align="right">สถานะ :&nbsp;</td>
										  <td>
											  <select name="status" class="select">
												  <option value ="" >ทั้งหมด</option>
												  <option value ="1">นำส่งเงินแล้ว</option>
												  <option value ="0">รอนำส่งเงิน</option>
												  <option value ="2">ยกเลิกนำส่ง</option>
											  </select>
										  </td>
										</tr>
									  </table></td>
									  <td>&nbsp;</td>
								</tr>
								<tr>
								<td>&nbsp;</td>
								<td>
								<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit" /> 
								<%@ include file="../Templates/clearIcon.jsp"%></td>
								
								
								</tr>

						  </table></td>
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
                </form>
                <td><table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                  <tr  align="left" valign="top">
<td colspan="5"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
                  
                  <tr>
                    <td width="50" class="TblHeaderColumn AlignCenter">ลำดับที่</td>
                    <td width="89" class="TblHeaderColumn">เลขที่ใบนำส่ง</td>
                    <td width="81" class="TblHeaderColumn">วันที่นำส่ง</td>
                    <td class="TblHeaderColumn">หน่วยงานที่นำส่ง</td>
                    <td width="130" class="TblHeaderColumn">พ.ร.บ</td>
                    <td width="80" class="TblHeaderColumn">จำนวนคดี</td>
                    <td width="86" class="TblHeaderColumn">สถานะ</td>
                    <td width="80" class="TblHeaderColumn">ค่าปรับรวม</td>
                    <td width="80" class="TblHeaderColumn">เงินสินบน</td>
                    <td width="80" class="TblHeaderColumn">เงินรางวัล</td>
                    <td width="80" class="TblHeaderColumn">เงินส่งคลัง</td>
                  </tr>
                  
                    
                   <c:forEach items="${dblist}"  var="db" varStatus="i">
		             <c:set var="Rows" value="${Rows + 1}" />
		             <c:if test="${(Rows % 2) == 1}">
		
						<tr class="TblRow AlignLeft" <c:if test="${db.income_status == 1}">style="color:red;"</c:if> >
		                    <td class="TblRow AlignCenter">${Rows}</td>
							<td ><a href="process?action=Sendincome&id=${db.id}&cmd=preup" class="linkdatarow">${db.send_no}</a></td>
		                    <td >${db.send_date2}</td>
		                    <td >${db.offname_write}</td>
		                    <td >${db.legislation_name}</td>
		                    <td align="center" >${db.case_qty}</td>
		                    <td >${db.status_name}</td>
		                    <td align="right">${db.sumfine}</td>
		                    <td align="right">${db.birbe_money}</td>
		                    <td align="right">${db.reward_money}</td>
		                    <td align="right">${db.treasury_money}</td>
						</tr>
					</c:if>
					<c:if test="${(Rows % 2) == 0}">
						<tr class="TblRow bgRowGray" <c:if test="${db.income_status == 1}">style="color:red;"</c:if> >
		                	<td class="TblRow AlignCenter bgRowGray">${Rows}</td>
							<td ><a href="process?action=Sendincome&id=${db.id}&cmd=preup" class="linkdatarow">${db.send_no}</a></td>
		                    <td >${db.send_date2}</td>
		                    <td >${db.offname_write}</td>
		                    <td >${db.legislation_name}</td>
		                    <td align="center" >${db.case_qty}</td>
		                    <td >${db.status_name}</td>
		                    <td align="right">${db.sumfine}</td>
		                    <td align="right">${db.birbe_money}</td>
		                    <td align="right">${db.reward_money}</td>
		                    <td align="right">${db.treasury_money}</td>
						</tr>
					</c:if>
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
		
		<c:if test="${IsSearch=='Y'}">
			<script type="text/JavaScript">
				document.dataform.offcode_write.value = "${userOffcode}" ;
				document.dataform.province.value = "${param.province}" ;
				document.dataform.legislation_id.value = "${param.legislation_id}" ;
				document.dataform.status.value = "${param.status}" ;
			</script>
		</c:if>


