<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript" language="JavaScript">
	function toggleHidden(mID, btnID, tbPage) { 		
		document.getElementById('showSum').style.display='none';
		document.getElementById('showByOffice').style.display='none';

		document.getElementById('btnShowSum').style.background='#D4D0C8';
		document.getElementById('btnShowByOffice').style.background='#D4D0C8';

		var mnu = document.getElementById(mID); 
		var btn = document.getElementById(btnID);
		if (mnu.style.display == 'none'){
			mnu.style.display ='';
			btn.style.background='#FFCC33';
		}else{
			mnu.style.display ='none';
		}
		document.getElementById('tabPage').value = tbPage;
	}	
</script>
<script language="javascript" type="text/javascript">

function clear2(){
	window.location.href="process?action=ExhibitRegister&menu=true";
}
</script>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%" align="left" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="1%">&nbsp;</td>
				<td width="99%"><span class="websitename">ทะเบียนสินค้าและของกลาง</span></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				<table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
					<tr>
						<td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
						<td width="98%"></td>
						<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
					</tr>
					<tr>
						<td height="40">&nbsp;</td>
						<td align="center" valign="top">
						<table width="98%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td width="56%" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
							</tr>
							<tr>
								<td align="left" valign="top">
								<form action="process?action=ExhibitRegister&cmd=list" name="exhibit_form" method="post">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="20%" height="25" align="right">เลขที่หนังสือนำส่ง :&nbsp;</td>
										<td width="30%"><input type="text" name="code_from" class="textbox" size="10" value="${param.code_from}" /> &nbsp;&nbsp;ถึง :&nbsp; <input type="text" name="code_to" class="textbox" size="10" value="${param.code_to}"/>
										</td>
										<td width="15%" align="right">วันที่นำส่ง :&nbsp;</td>
										<td width="35%">
											<input type="Text" id="deliver_date_from" name="deliver_date_from" readonly="true" size="12" class="textdate" value="${param.deliver_date_from}"/>  
											<a href="javascript:NewCssCal('deliver_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
											&nbsp;&nbsp;ถึง :&nbsp; 
											<input type="Text" id="deliver_date_to" name="deliver_date_to" readonly="true" size="12" class="textdate" value="${param.deliver_date_to}"/>  
											<a href="javascript:NewCssCal('deliver_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a>
										</td>
									</tr>
									<tr>
										<td height="25" align="right">พ.ร.บ. :&nbsp;</td>
										<td>
											<select name="legislation_id" id="legislation_id" style="width:250">
		            							<option value="" selected>ทั้งหมด</option>
		            							<c:forEach items="${ltlist}" var="legis">
		            							<option value=${legis.id} <c:if test="${param.legislation_id == legis.id}">selected</c:if>>${legis.legislation_name}</option>
		            							</c:forEach>
		                                    </select>
										</td>
										<td height="25" align="right">สินค้าจาก :&nbsp;</td>
										<td>
											<input type="radio" name="is_domestic" value="I" <c:if test="${param.is_domestic == 'I'}">selected</c:if> />ในประเทศ 
											<input type="radio" name="is_domestic" value="O" <c:if test="${param.is_domestic == 'O'}">selected</c:if> />ต่างประเทศ 
											<input type="radio" name="is_domestic" value="Z" <c:if test="${param.is_domestic == 'Z' || param == null}">selected</c:if> />ทั้งหมด 
										</td>
									</tr>
									<tr>
										<td height="25" align="right">ชนิดสินค้า :&nbsp;</td>
										<td>
											<select name="duty_code" id="duty_code" style="width:250px">
		            							<option value="" selected>ทั้งหมด</option>
		            							<c:forEach items="${dtList}" var="dr">
		            								<option value="${dr.duty_code}" <c:if test="${param.duty_code == dr.duty_code}">selected</c:if>>${dr.duty_name}</option>
		            							</c:forEach>
		                                    </select>
										</td>
										<td align="right">ยี่ห้อ :&nbsp;</td>
										<td><input name="brand_name" id="brand_name" type="text" class="textbox" value="${param.brand_name}" /></td>
									</tr>
									<tr>
										<td height="25" align="right">สถานะ :&nbsp;</td>
										<td colspan="3">
										<select name="status_code" id="status_code" class="select" style="width: 200">
											<option value="" <c:if test="${param.status_code == ''}">selected</c:if>>ทั้งหมด</option>
											<option value="1" <c:if test="${param.status_code == '1'}">selected</c:if>>คงเหลือในคลัง</option>
											<option value="0" <c:if test="${param.status_code == '0'}">selected</c:if>>ปิดบัญชี</option>
										</select>
										</td>
									</tr>
									<tr>
										<td height="25" align="right">&nbsp;</td>
										<td colspan="2" align="center">
											<input alt="Submit Form" type="image" src="images/btn_search_big.png" width="64" height="22" name="search"><%@ include file="../Templates/clearIcon.jsp"%>
										</td>
										
									</tr>
								</table>
								</form>
								</td>
							</tr>
						</table>
						</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
						<td></td>
						<td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td style="cursor: hand;" colspan="2">
					<input name="btnShowSum" id="btnShowSum" type="button" class="button" value="แสดงยอดรวม" onClick="javascript:toggleHidden('showSum','btnShowSum',1);writeTranLog('เปลี่ยนไปแท็บแสดงยอดรวม');" style="background: #FFCC33">&nbsp;&nbsp;
					<input name="btnShowByOffice" id="btnShowByOffice" type="button" class="button" value="แสดงยอดตามหน่วยงาน" onClick="javascript:toggleHidden('showByOffice', 'btnShowByOffice',2);writeTranLog('เปลี่ยนไปแท็บแสดงยอดตามหน่วยงาน');">&nbsp;&nbsp;
					<input type="hidden" id="tabPage" name="tabPage" value="${tabPage}" />
				</td>
			</tr>
			<tbody id="showSum">
				<tr>
					<td>&nbsp;</td>
					<td height="25">
						<span class="spanLink" onClick="javascript:writeTranLog('แสดงข้อมูลยอดรวมเป็นไฟล์ Excel');openExcel();">
							<strong>ส่งออกเป็น Excel</strong> 
						</span>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
					<table class="tableList" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC" width="1000">
						<tr  align="left" valign="top">
							<td colspan="10"><%=pageUtil.getPagination()%></td>
							<td colspan="3" align="right"><%=pageUtil.getPageStatus()%>	</td>
						</tr>
						<tr>
							<td width="31" class="TblHeaderColumn AlignCenter">ลำดับ</td>
							<td width="120" class="TblHeaderColumn">พ.ร.บ.</td>
							<td class="TblHeaderColumn">สินค้า</td>
							<td class="TblHeaderColumn">ยี่ห้อ</td>
							<td width="60" class="TblHeaderColumn">สินค้าจาก</td>
							<td width="50" class="TblHeaderColumn">ขนาด</td>
							<td width="50" class="TblHeaderColumn">จำนวน</td>
							<td width="50" class="TblHeaderColumn">ทำลาย</td>
							<td width="50" class="TblHeaderColumn">ขาย</td>
							<td width="50" class="TblHeaderColumn">คืน</td>
							<td width="50" class="TblHeaderColumn">จัดเก็บ(พิพิธภัณฑ์)</td>
							<td width="50" class="TblHeaderColumn">โอน</td>
							<td width="70" class="TblHeaderColumn">คงเหลือในคลัง</td>
						</tr>
						<c:forEach items="${stockRemainSumList}" var="sr" varStatus="i">
						
						<tr>
							<td class="TblRow AlignCenter">${i.count}</td>
							<td class="TblRow AlignLeft">${sr.legislation_name}</td>
							<td class="TblRow AlignLeft">${sr.duty_name}</td>
							<td class="TblRow AlignLeft">${sr.brand_name}</td>
							<td class="TblRow AlignLeft">${sr.isdomestic_name}</td>
							<td class="TblRow AlignRight">${sr.size_desc} ${sr.sizes_unit}</td>
							<td class="TblRow AlignLeft">${sr.stockin_qty} ${sr.qty_unit}</td>
							<td class="TblRow AlignLeft">${sr.destroy_qty} ${sr.qty_unit}</td>
							<td class="TblRow AlignLeft">${sr.sale_qty} ${sr.qty_unit}</td>
							<td class="TblRow AlignLeft">${sr.return_qty} ${sr.qty_unit}</td>
							<td class="TblRow AlignLeft">${sr.keep_qty} ${sr.qty_unit}</td>
							<td class="TblRow AlignLeft">${sr.transfer_qty} ${sr.qty_unit}</td>
							<td class="TblRow AlignCenter">${sr.qty}</td>
						</tr>
						</c:forEach>
					</table>
					</td>
				</tr>
			</tbody>
			<tbody id="showByOffice" style="display: none">
				<tr>
					<td>&nbsp;</td>
					<td height="25">
						<span class="spanLink" onClick="javascript:writeTranLog('แสดงข้อมูลยอดตามหน่วยงานเป็นไฟล์ Excel');openExcel();">
							<strong>ส่งออกเป็น Excel</strong> 
						</span>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
					<table class="tableList" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC" width="1000">						
						<tr  align="left" valign="top">
							<td colspan="11"><%=pageUtil.getPagination()%></td>
							<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
						</tr>
						<tr>
							<td width="31" class="TblHeaderColumn AlignCenter">ลำดับ</td>
							<td width="120" class="TblHeaderColumn">หน่วยงาน</td>
							<td width="120" class="TblHeaderColumn">พ.ร.บ.</td>
							<td class="TblHeaderColumn">สินค้า</td>
							<td class="TblHeaderColumn">ยี่ห้อ</td>
							<td width="80" class="TblHeaderColumn">สินค้าจาก</td>
							<td width="50" class="TblHeaderColumn">ขนาด</td>
							<td width="50" class="TblHeaderColumn">จำนวน</td>
							<td width="50" class="TblHeaderColumn">ทำลาย</td>
							<td width="50" class="TblHeaderColumn">ขาย</td>
							<td width="50" class="TblHeaderColumn">คืน</td>
							<td width="50" class="TblHeaderColumn">จัดเก็บ(พิพิธภัณฑ์)</td>
							<td width="50" class="TblHeaderColumn">โอน</td>
							<td width="70" class="TblHeaderColumn">คงเหลือในคลัง</td>
						</tr>
						<c:forEach items="${stockRemainUnitList}" var="sr" varStatus="i">
						
							<tr> 
								<td class="TblRow AlignCenter">${i.count}</td>
								<td class="TblRow AlignLeft">${sr.offname_from}</td>
								<td class="TblRow AlignLeft">${sr.legislation_name}</td>
								<td class="TblRow AlignLeft">${sr.duty_name}</td>
								<td class="TblRow AlignLeft">${sr.brand_name}</td>
								<td class="TblRow AlignRight">${sr.isdomestic_name}</td>
								<td class="TblRow AlignRight">${sr.size_desc} ${sr.sizes_unit}</td>
								<td class="TblRow AlignLeft">${sr.stockin_qty} ${sr.qty_unit}</td>
								<td class="TblRow AlignLeft">${sr.destroy_qty} ${sr.qty_unit}</td>
								<td class="TblRow AlignLeft">${sr.sale_qty} ${sr.qty_unit}</td>
								<td class="TblRow AlignLeft">${sr.return_qty} ${sr.qty_unit}</td>
								<td class="TblRow AlignLeft">${sr.keep_qty} ${sr.qty_unit}</td>
								<td class="TblRow AlignLeft">${sr.transfer_qty} ${sr.qty_unit}</td>
								<td class="TblRow AlignCenter">${sr.qty}</td>
							</tr>
						</c:forEach>
					</table>
					</td>
				</tr>
			</tbody>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
<script>
	function openExcel(){
		var tabPage = document.getElementById("tabPage").value;
		window.open('process?action=ExhibitRegister&tabPage='+tabPage+'&cmd=openExcel' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');
		//window.open('?page=/ManageExhibit/export_excel.jsp' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');
	}
</script>