<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>


<script type="text/javascript" >

function clear2(){
	window.location.href="process?action=Sendexhibit";
}
</script>
		<!-- Body -->
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ใบนำส่งของกลางเพื่อจัดเก็บ</span></td>
              </tr>
              <tr>
				<td height="25">&nbsp;</td>
				<td><a href="process?action=Sendexhibit&cmd=add" class="linkmenu3level">เพิ่มข้อมูล</a></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                
                 <form method="post" name="dataform" action="<c:url value='process?action=Sendexhibit&cmd=list'/>">
                <table width="750" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
                  <tr>
                    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
                    <td width="98%"></td>
                    <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td align="center" valign="top"><table width="98%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="56%" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
                        <td width="44%">&nbsp;</td>
                      </tr>
                      <tr>
                        <td align="left" valign="top" ><table width="100%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="7%" align="right" >&nbsp;</td>
                            <td width="39%" align="right" >เลขที่หนังสือส่ง :&nbsp;</td>
                            <td width="54%" height="25"><input name="delivery_code" type="text" size="25" value="${param.delivery_code }" ></td>
                          </tr>
                          <tr>
                            <td  align="right" >&nbsp;</td>
                            <td  align="right" >พ.ร.บ. :&nbsp;</td>
                            <td height="25">
									<select name="legislation_id" id="legislation_id" style="width:190px;">
										<option value="" <c:if test="${ltion.id == '' ||ltion.id == null}"> selected </c:if>>ทั้งหมด</option>
            									<c:forEach items="${ltlist}"  var="ltion">
            										<option value='${ltion.id}' <c:if test="${ltion.id == param.legislation_id}"> selected </c:if> >${ltion.legislation_code} ${ltion.legislation_name}</option>
            									</c:forEach>
            							</select>
							</td>
                          </tr>
                          <tr>
                            <td  align="right" >&nbsp;</td>
                            <td  align="right" >สถานะ :&nbsp;</td>
                            <td height="25">
									<select name="status" id="status" style="width:190px;">
										<option value="" <c:if test="${'' == param.status || param.status == null }"> selected </c:if>>ทั้งหมด</option>
										<option value="1" <c:if test="${'1' == param.status}"> selected </c:if>>ยังไม่ส่ง</option>
										<option value="2" <c:if test="${'2' == param.status}"> selected </c:if>>ส่งแล้ว</option>
										<option value="3" <c:if test="${'3' == param.status}"> selected </c:if>>ตรวจรับแล้ว</option>
									</select>
							</td>
                          </tr>

                          <tr>
                            <td  align="right" >&nbsp;</td>
                            <td  align="right" >&nbsp;</td>
                            <td height="25"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"><%@ include file="../Templates/clearIcon.jsp"%></td>
                          </tr>
                        </table></td>
                        <td align="right" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="20%" height="25" align="right">วันที่นำส่ง :&nbsp;</td>
                            <td width="80%" align="left">
                              <input name="delivery_date1"  id="delivery_date1" type="text" class="textdate"  value="${param.delivery_date1 }" />
                           <a href="javascript:NewCssCal('delivery_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a> ถึง&nbsp;
                              <input name="delivery_date2" id="delivery_date2" type="text" class="textdate"  value="${param.delivery_date2 }"/>
                             <a href="javascript:NewCssCal('delivery_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt=""  width="19" height="19" border="0" ></a>
                            </td>
                          </tr>
                          <tr>
                            <td align="right">ชื่อผู้นำส่ง :&nbsp;</td>
                            <td align="left"><input name="staff_delivery" type="text" size="20" maxlength="20" value="${param.staff_delivery }" ></td>

                          </tr>
                        </table></td>
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
                <td><table class="tableList" width="800" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                  
                   <tr  align="left" valign="top">
						<td colspan="4"><%=pageUtil.getPagination()%></td>
						<td align="right" colspan="2"><%=pageUtil.getPageStatus()%>	</td>
				</tr>
                   <tr>
                     <td colspan="6">
                     </td>
                   </tr>
                  <tr class="TblRow bgRowGray">
                    <td width="55" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                    <td width="100" class="TblHeaderColumn">เลขที่หนังสือส่ง</td>
                    <td width="100" class="TblHeaderColumn">วันที่นำส่ง</td>
                    <td width="150" class="TblHeaderColumn">พ.ร.บ.</td>
				    <td width="150" class="TblHeaderColumn">ผู้นำส่ง</td>
                    <td width="100" class="TblHeaderColumn">สถานะ</td>
                    <td class="TblHeaderColumn">ไปยังหน่วยงาน</td>
                  </tr>
                  
                   <c:forEach items="${dblist}"  var="db" varStatus="i">
             <c:set var="Rows" value="${Rows + 1}" />
             <c:if test="${(Rows % 2) == 1}">
				<tr class="TblRow AlignLeft">
                    <td class="TblRow AlignCenter">${Rows}</td>
					<td ><a href="process?action=Sendexhibit&id=${db.delivery_id}&cmd=preup" class="linkdatarow">${db.delivery_code}</a></td>
                    <td >${db.delivery_date2}</td>
                    <td >${db.legislation_name}</td>
                    <td >${db.staff_delivery}</td>
                    <td class="TblRow AlignCenter">${db.status_name}</td>
                    <td>${db.offname_to}</td>
				</tr>
			</c:if>
			<c:if test="${(Rows % 2) == 0}">
				<tr class="TblRow bgRowGray">
                	<td class="TblRow AlignCenter bgRowGray">${Rows}</td>
					<td ><a href="process?action=Sendexhibit&id=${db.delivery_id}&cmd=preup" class="linkdatarow">${db.delivery_code}</a></td>
                    <td >${db.delivery_date2}</td>
                    <td >${db.legislation_name}</td>
                    <td >${db.staff_delivery}</td>
                    <td  class="TblRow AlignCenter bgRowGray">${db.status_name}</td>
                    <td>${db.offname_to}</td>
				</tr>
			</c:if>
			</c:forEach>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
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

