<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>

<script type="text/javascript" >

function clear2(){
	window.location.href="process?action=Invoice2";
}
</script>


		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ใบเสร็จรับเงิน แบบที่ 2 </span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><a href="process?action=Invoice2&cmd=add" class="linkmenu3level">เพิ่มข้อมูล</a></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="1000" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
                  <tr>
                    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
                    <td width="98%"></td>
                    <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td align="center" valign="top">
                    <form method="post" name="dataform"  action="process?action=Invoice2&cmd=list" >
 
						<table align="left" width="100%" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							 <td colspan="4" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
						  </tr>
						  <tr>
								<td  width="20%" align="right">คดีเปรียบเทียบปรับที่  :&nbsp;</td>
								<td align="left" width="30%" >
									<input name="compare_case_no" value="${param.compare_case_no }" type="text" size="5"  class="textNum">
									&nbsp;/&nbsp;
									<input name="compare_case_year" value="${param.compare_case_year }" type="text" size="7"  class="textNum">
								</td>
								<td width="20%" align="right">วันที่เปรียบเทียบปรับ : &nbsp;</td>
								<td align="left" width="30%" >
									<input type="Text" name="compare_case_date1" value="${param.compare_case_date1 }" id="compare_case_date1" class="textdate"/>
									 <a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>&nbsp;&nbsp;
									ถึง :&nbsp;
									<input type="Text" name="compare_case_date2" value="${param.compare_case_date2 }" id="compare_case_date2"  class="textdate"/>
									 <a href="javascript:NewCssCal('compare_case_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
								</td>
						  </tr>
						  <tr  >
								<td  align="right">ใบเสร็จเล่มที่  :&nbsp;</td>
								<td  align="left" >
									<input name="inv_bookno" value="${param.inv_bookno }" type="text" size="15" class="textNum">
									&nbsp;&nbsp;เลขที่ :&nbsp;
									<input name="inv_no" value="${param.inv_no }" type="text" size="15" class="textNum">
								</td>
								<td  align="right">วันที่ออกใบเสร็จ : &nbsp;</td>
								<td align="left" >
									<input type="Text" name="inv_date1" value="${param.inv_date1 }" id="inv_date1" class="textdate"/>
									 <a href="javascript:NewCssCal('inv_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>&nbsp;&nbsp;
									ถึง :&nbsp;
									<input type="Text" name="inv_date2" value="${param.inv_date2 }" id="inv_date2"  class="textdate"/>
									 <a href="javascript:NewCssCal('inv_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
								</td>
						  </tr>
						  <tr>
						  	<td align="right">ชื่อผู้ต้องหา :&nbsp;</td>
							<td align="left" ><input name="lawbreaker_name" value="${param.lawbreaker_name }" type="text" size="40" class="textbox"></td>
		                    <td align="right">หน่วยงาน :&nbsp;</td>
		                    <td align="left" height="25">
		                    	<c:if test="${IsAdmin == '1'}" >
			                        <input type="text" name="offcode" value="${offcode}" size="4"  class="textbox"  >
	                       			<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
	                           			 onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" >
	                      			<input type="text" name="offname" value="${offname}" size="16"  class="textbox" >
                      			</c:if>
                      			<c:if test="${IsAdmin != '1'}" >
			                        <input type="text" name="offcode" value="${offcode}" size="6" readonly class="textview"  >
	                      			<input type="text" name="offname" value="${offname}" size="25" readonly class="textview" >
                      			</c:if>
                   			</td>
						  </tr>
						  <tr>
						  	<td align="right">สินค้า :&nbsp;</td>
							<td colspan="3" align="left" ><input name="group_name" value="${param.group_name }" type="text" size="40" class="textbox"></td>

						  </tr>
                           <tr>
                                  <td colspan="4" align="center" ><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"><%@ include file="../Templates/clearIcon.jsp"%></td>
                           </tr>
						</table>
						</form>
					</td>
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
                <td><table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0">
               <tr  align="left" valign="top">
<td colspan="5"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
                  <tr valign="middle">
                    <td width="46" height="16" class="TblHeaderColumn AlignCenter">ลำดับที่</td>
					<td width="150" class="TblHeaderColumn AlignCenter">หน่วยงาน</td>
					<td width="150" class="TblHeaderColumn AlignCenter">ใบเสร็จเล่มที่/เลขที่</td>
					<td width="150" class="TblHeaderColumn AlignCenter">วันที่ออกใบเสร็จ</td>
                    <td width="150" class="TblHeaderColumn AlignCenter">คดีเปรียบเทียบปรับที่</td>
					<td width="150" class="TblHeaderColumn AlignCenter">วันที่เปรียบเทียบปรับ</td>
                    <td width="200" class="TblHeaderColumn AlignCenter">ชื่อผู้ต้องหา</td>
                  </tr>
               
                   <c:forEach items="${dblist}"  var="db" varStatus="i">
             <c:set var="Rows" value="${Rows + 1}" />
             <c:if test="${(Rows % 2) == 1}">

				<tr class="TblRow AlignLeft">

                

                <td class="TblRow AlignCenter ">${Rows}</td>
					<td >${db.compare_offname}</td>
                   <td ><a href="process?action=Invoice2&id=${db.id}&cmd=preup" class="linkdatarow">${db.inv_bookno}/${db.inv_no}</a></td>
                    <td >${db.inv_date2}</td>
                    <td >${db.compare_case_no}</td>
                    <td >${db.compare_case_date2}</td>
                    <td >${db.lawbreaker_name}</td>
                    
						
				</tr>
			</c:if>
			<c:if test="${(Rows % 2) == 0}">

				<tr class="TblRow bgRowGray">

                <td class="TblRow AlignCenter bgRowGray">${Rows}</td>
					<td >${db.compare_offname}</td>
                   <td ><a href="process?action=Invoice2&id=${db.id}&cmd=preup" class="linkdatarow">${db.inv_bookno}/${db.inv_no}</a></td>
                    <td >${db.inv_date2}</td>
                    <td >${db.compare_case_no}</td>
                    <td >${db.compare_case_date2}</td>
                    <td >${db.lawbreaker_name}</td>
                   
						
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
