
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>

<style type="text/css">
<!--
.style7 {
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
}
-->
</style>
<script type="text/javascript">
function printReportInvoice(name){
	var book = document.getElementById("inv_bookno").value;
	window.open('process?action=Report&__report=' + name + '&getBookNo=${db.id}&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
}
</script>

	
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ใบเสร็จรับเงิน แบบที่ 2 </span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>
					<input name="btnSave"  type="submit" class="barButton" value="บันทึก" >
					<input name="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขข้อมูลใบเสร็จรับเงินแบบที่ 2');window.location.href='<c:url value="${action}" />'; ">
					<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา" onclick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Invoice2" />' " >
					<c:if test="${db.id != null}">
						<input name="btnPrintInv"  type="button" class="barButton" value="พิมพ์ใบเสร็จ" Onclick="writeTranLog('พิมพ์ใบเสร็จรับเงินแบบที่ 2');printReportInvoice('ILL_P032')">
						<input name="btnPrint1_54"  type="button" class="barButton" value="พิมพ์ใบนำส่งเงิน(1/54)" Onclick="writeTranLog('พิมพ์ใบนำส่งเงิน(1/54)');printReportInvoice('ILL_P033')" >
						<input name="btnCancelInv"  type="button" class="barButton" value="ยกเลิกใบเสร็จ" >
					</c:if>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>

                    <!--   Start  My Form-->
                	<table width="800" border="0" cellpadding="0" cellspacing="0">
						<tr valign="top">
							<td colspan="2">
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
								  <tr >
									  <td  width="20%" height="22"  align="right">ใบเสร็จเล่มที่ :&nbsp;</td>
									  <td  width="30%"  >
									  <input name="id" type="hidden" value="${db.id}"/>
											<input id="inv_bookno" name="inv_bookno" type="text" class="textNum" value="${db.inv_bookno}" size="5"  />
											&nbsp;&nbsp;เลขที่ :&nbsp;
											<input name="inv_no" type="text" class="textNum" value="${db.inv_no}" size="5"  />
											<font style="color:red">*</font>
									  </td>
									  <td  width="20%" height="22"  align="right">วันที่ออกใบเสร็จ :&nbsp;</td>
									  <td  width="30%">
									  		<c:if test="${db.inv_date2 != null}">
												<input name="inv_date" id="inv_date"  type="text" readonly class="textdate" value="${db.inv_date2}" size="10"  />
											</c:if>
											<c:if test="${db.inv_date2 == null}">
												<input name="inv_date" id="inv_date"  type="text" readonly class="textdate" value='<fmt:formatDate value="<%=new Date() %>" pattern="dd/MM/yyyy"/>' size="10"  />
											</c:if>
											<!-- <a href="javascript:NewCssCal('inv_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>  -->
									  </td>
								  </tr>
								  <tr >
                                      <td align="right" >เลขคดีเปรียบเทียบที่ : &nbsp;</td>
                                      <td>
                                      <input type="hidden" name="compare_case_id" value="${db.compare_case_id}" />
                                         <input type="Text" name="compare_case_no" id="compare_case_no" value="${db.compare_case_no}" class="textview"/>
                                         <img src="images/btn_browse.png" width="18" height="19" border="0"  style="cursor:hand;"
                                         onClick="window.showModalDialog('process?action=Compare_case_pop&pap=4' , self , 'dialogWidth=700px,Height=400px');">
                                         <font style="color:red">*</font>
                                      </td>
									  <td  height="22"  align="right">วันที่เปรียบเทียบปรับ :&nbsp;</td>
									  <td >
                                             <input name="compare_case_date" type="text" class="textdate" value="${db.compare_case_date2}" size="10" />
									  </td>
									</tr>
								   
									<tr >
									  <td height="22"  align="right">สินค้า : &nbsp;</td>
									  <td >
											<input type="Text" name="group_name" id="group_name" size="30" value="${db.group_name}" class="textview" />
									  </td>
									
									  <td align="right">สถานะใบเสร็จ :&nbsp;</td>
									  <td><input type="Text" name="status_name" id="status_name" size="30" value="${db.status_name}" class="textview" /></td>
								    </tr>
									<tr >
									  <td height="22"  align="right">ชื่อผู้ต้องหา : &nbsp;</td>
									  <td colspan="3">
											<input type="Text" name="lawbreaker_name" id="lawbreaker_name" size="110" value="${db.lawbreaker_name}" class="textview" />
									  </td>
								    </tr>
									<tr>
									  <td  height="22"  align="right">ใบนำส่งเงินเล่มที่ :&nbsp;</td>
									  <td colspan="3" >
											<input name="send_bookno" type="text" class="textNum" value="${db.send_bookno}" size="5"  />
											&nbsp;&nbsp;เลขที่ :&nbsp;
											<input name="send_no" type="text" class="textNum" value="${db.send_no}" size="5"  />
									  </td>
									</tr>
									<tr>
										<td height="25" align="right">ผู้รับเงิน  :&nbsp;</td>
										<td>
											<input name="staff_receive" id="staff_receive" type="hidden" value="${staff_receive}"/>
											<input name="poscode_receive" id="poscode_receive" type="hidden" value="${poscode_receive}"/>
											<input name="offcode_receive" id="offcode_receive" type="hidden" value="${offcode_receive}"/>
											<input type="text" name="staff_receive_name" id="staff_receive_name" class="textview" size="30" value="${staff_receive_name}">
											<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick="window.open('process?action=Divide_staff_pop&formname=staff_receive_name&id=staff_receive&posname=poscode_receive_name&poscode=poscode_receive&offcode=offcode_receive' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
											<font style="color:red">*</font>
										</td>
										<td align="right">ตำแหน่ง :&nbsp;</td>
										<td>
											<input type="text" name="poscode_receive_name" class="textview" size="30" value="${posname_receive}">
										</td>
									</tr>
									<tr><td colspan="4">&nbsp;</td></tr>
							  </table>
							</td>
						</tr>
					</table>

                                    <!--   Start  My Form-->                </td>
              </tr>
			  <tr >
				<td>&nbsp;</td>
				<td>
					   <table class="tableList"  border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
						  <tr>
							<td width="150" class="TblHeaderColumn">รายการ</td>
							<td width="80" class="TblHeaderColumn">จำนวนเงิน</td>
							<td width="100" class="TblHeaderColumn">หมายเหตุ</td>
						  </tr>
						  <tr>
							<td class="TblRow AlignLeft" colspan="3">ค่าภาษีสรรพสามิต(<span id="product_group_name" >${db.group_name}</span>) ตามมาตรา 163 แห่ง พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</td>
						  </tr>
						  <tr class="bgRowGray">
							<td class="TblRow AlignLeft">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1. ค่าภาษีสรรพสามิต</td>
							<td class="TblRow" align="center"><input type="text" value="${db.tax_fine}" name="tax_fine" class="textNum" onkeypress="ChkMinusDbl(this);"  size="10"></td>
							<td class="TblRow" align="center"><input id="interior_remarks" name="tax_remarks" type="text" value="${db.tax_remarks}"  size="10"  class="textbox"></td>
						  </tr>
						  <tr>
							<td class="TblRow AlignLeft">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2. ภาษีเก็บเพิ่มเพื่อมหาดไทย 10%</td>
							<td class="TblRow" align="center"><input type="text" value="${db.interior_fine}" name="interior_fine" class="textNum" onkeypress="ChkMinusDbl(this);"  size="10"></td>
							<td class="TblRow" align="center"><input id="interior_remarks" name="interior_remarks" type="text" value="${db.interior_remarks}"  size="10"  class="textbox"></td>
						  </tr>
						</table>
				</td>
			  </tr>

              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>
