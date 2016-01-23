<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>

<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>

<script type="text/javascript">
function btDelete(id)
	{
	var answer = confirm ("ยืนยันการลบข้อมูล");
		if (answer){
		window.location.href="process?action=Lavy&id="+id+"&cmd=del";
		}
		else{
		}
}
function clear2(){
	window.location.href="process?action=Lavy";
}
</script>
		<!-- Body -->
		<table width="100%"  border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">การอายัดทรัพย์สิน</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>
					<a href="process?action=Lavy&cmd=add" class="linkmenu3level">เพิ่มข้อมูล</a> 
					
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                
                    <form method="post" name="dataform"  action="process?action=Lavy&cmd=list" >
 
                <td><table width="750" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
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
                        </tr>

                      <tr>
                        <td align="left" valign="top" ><table width="100%" border="0" cellspacing="0" cellpadding="0">
                          <tr>
                            <td width="5%" align="right" >&nbsp;</td>
                            <td width="35%" align="right" >เลขที่คำสั่งอายัด :&nbsp;</td>
                            <td width="55%" height="25"><input name="order_no" type="text" size="25" maxlength="20" value="${param.order_no }"></td>
                            <td width="5%">&nbsp;</td>
                           
                            </tr>
                          <tr>
                            <td  align="right" >&nbsp;</td>
                            <td  align="right" >เลขที่บันทึกการจับกุม :&nbsp;</td>
                            <td height="25">
                              <input name="track_no" type="text" size="25" maxlength="25" value="${param.track_no }">
                            </td>
                            <td>&nbsp;</td>
                          
                          </tr>
                          <tr>
                            <td  align="right" >&nbsp;</td>
                            <td  align="right" >สถานที่อายัด :&nbsp;</td>
                            <td height="25"><input name="seize_location" type="text" size="25" maxlength="30" value="${param.seize_location }"></td>
                            <td>&nbsp;</td>
                         
                            </tr>
                          <tr>
                            <td align="right"  >&nbsp;</td>
                            <td align="right"  >วันที่อายัด  :&nbsp; </td>
                            <td height="25">
								<input name="seize_date1" id="seize_date1" type="text"  value="${param.seize_date1 }" class="textdate" readonly size="7" maxlength="10" />
						<a href="javascript:NewCssCal('seize_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
					 -
								  <input name="seize_date2" id="seize_date2" type="text" value="${param.seize_date2 }" class="textdate" readonly size="7" maxlength="10" />
						<a href="javascript:NewCssCal('seize_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
						</td>
                            <td>&nbsp;</td>
                            
                            </tr>
                          <tr>
                            <td align="right"  >&nbsp;</td>
                            <td align="right"  >วันที่ถอนอายัด :&nbsp; </td>
                            <td height="25">
								<input name="cancel_date1" id="cancel_date1" type="text" value="${param.cancel_date1 }" class="textdate" readonly size="7" maxlength="10" />
						<a href="javascript:NewCssCal('cancel_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
					 -
								<input name="cancel_date2" id="cancel_date2" type="text" value="${param.cancel_date2 }" class="textdate" readonly size="7" maxlength="10" />
						<a href="javascript:NewCssCal('cancel_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
						</td>
                            <td>&nbsp;</td>
                          
                            </tr>
                            <tr>	
                            <td>&nbsp;</td>
                          				
                            </tr>
							<tr>
							<td align="right" >&nbsp;</td>
                            <td height="25">&nbsp;</td>
                            <td align="left" ><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"><%@ include file="../Templates/clearIcon.jsp"%> </td>
                          
                            <td height="25">&nbsp;</td>
                            
                          </tr>
                            </table></td>
                            
                           
                            </tr>
                          
                        </table></td>
                        </tr>
                         <tr>
                    <td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
                    <td></td>
                    <td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
                  </tr>
                  </form>
                    </table></td>
                    <td>&nbsp;</td>
                  </tr>
                 
                </table></td>
              </tr>
              <tr>

                <td><table class="tableList" width="750" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                    <tr  align="left" valign="top">
<td colspan="6"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
                  <tr>
                    <td width="44" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                    <td width="109" class="TblHeaderColumn">เลขที่คำสั่งอายัด</td>
                    <td width="114" class="TblHeaderColumn">เลขที่บันทึกการจับกุม</td>
                    <td width="80" class="TblHeaderColumn">วันที่อายัด</td>
                    <td width="80" class="TblHeaderColumn">วันที่ถอนอายัด</td>
                    <td width="120" class="TblHeaderColumn">วันครบกำหนดแสดง ความถูกต้อง</td>
                    <td width="123" class="TblHeaderColumn">สถานที่อายัด</td>
                    <td width="80" class="TblHeaderColumn">&nbsp;</td>
                  </tr>
                  <c:if test="${rowCount == 0}">
	                  <tr>
	                  	<td colspan="8" align="center">ไม่พบรายการที่ต้องการค้นหา</td>
	                  </tr>
                  </c:if>
              
                  <c:forEach items="${dblist}"  var="db" varStatus="i">
		             <c:set var="Rows" value="${Rows + 1}" />
		             <c:if test="${(Rows % 2) == 1}">
						<tr class="TblRow AlignLeft">
		                <td class="TblRow AlignCenter ">${Rows+_rowIndex}</td>
							
		                   <td ><a href="process?action=Lavy&id=${db.id}&cmd=preup" class="linkdatarow">${db.order_no}</a></td>
		                    <td >${db.track_no}</td>
		                    <td >${db.seize_date2}</td>
		                    <td >${db.cancel_date2}</td>
		                    <td >${db.limit_date2}</td>
		                    <td >${db.seize_location}</td>
		                    <td class="TblRow AlignCenter">
		                    
		                  <img src="images/icon_delete.gif" width="25" height="25" border="0" alt="ลบ" style="cursor:hand;" onclick = 'btDelete("${db.id}");'>
		                    
		                    </td>
		                    
								
						</tr>
					</c:if>
					<c:if test="${(Rows % 2) == 0}">
		
						<tr class="TblRow bgRowGray">
		
		                <td class="TblRow AlignCenter bgRowGray">${Rows+_rowIndex}</td>
							  <td ><a href="process?action=Lavy&id=${db.id}&cmd=preup" class="linkdatarow">${db.order_no}</a></td>
		                    <td >${db.track_no}</td>
		                    <td >${db.seize_date2}</td>
		                    <td >${db.cancel_date2}</td>
		                    <td >${db.limit_date2}</td>
		                    <td >${db.seize_location}</td>
		                    
		                   
				       <td class="TblRow AlignCenter bgRowGray">
				       
				       <img src="images/icon_delete.gif" width="25" height="25" border="0" alt="ลบ" style="cursor:hand;" onclick = 'btDelete("${db.id}");'>
				       </td>
								
						</tr>
					</c:if>
					</c:forEach>
                   
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table>