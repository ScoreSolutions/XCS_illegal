<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<script type='text/javascript' src='/XCS_illegal/dwr/interface/Exhibit.js'></script>
<script language="javascript">
	var max_row=<c:choose><c:when test="${soi_list_size != null}">${soi_list_size}</c:when><c:otherwise>1</c:otherwise></c:choose>;
	var sum_qty=<c:choose><c:when test="${qty != null}">${qty}</c:when><c:otherwise>0</c:otherwise></c:choose>;
	var unit_desc='';
	var action_form =  'ExhibitSell';
	var module_name = 'การขายของกลาง ';
	var so_id = '${so.id}';
	var jsonUnit = eval('${unit_json}');
	function chkSellDuplicate(){
		var chk_code = dwr.util.getValue("stockout_code1")+"/"+dwr.util.getValue("stockout_code2");
		
		Exhibit.chkDupStockout(chk_code, function(data) {
	    	if(data != ""){
	    		alert("เลขที่เอกสาร กค. ซ้ำ");
	    		document.formdata1.stockout_code2.value = "";
	    		document.formdata1.stockout_code2.focus();
	    	}		    	
	  	});
	}
</script>
<script type="text/javascript" src="script/logic/exhibit_module.js"></script>
<form action="process?action=ExhibitSell&cmd=update" name="formdata1" method="post">
<input type="hidden" name="id" value="${so.id}" />
<input type="hidden" name="sizesshow1" value="" />
<input type="hidden" name="qtyshow1" value="" />
<input type="hidden" name="track_no_co1" value="" />
<input type="hidden" name="status" value="${so.status}">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%" align="left" valign="top">		
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="1%">&nbsp;</td>
				<td width="99%"><span class="websitename">การขายของกลาง</span></td>
			</tr>
			<tr>
				<td height="25">&nbsp;</td>
				<td>
					<c:if test="${so.status=='2' }">
						<input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="javascript:clickBack();">
					</c:if>
					<c:if test="${so.status!='2' }">
						<input name="btnSave" type="submit" class="barbutton" value="บันทึก" onclick="return tosubmit();">
						<c:choose>
							<c:when test="${so.id != null}"><input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="javascript:clickReset();"></c:when>
							<c:otherwise><input name="btnCancel" type="reset" class="barbutton" value="ยกเลิกการแก้ไข"></c:otherwise>
						</c:choose>					
						<input name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="javascript:clickBack();">
					</c:if>
					<c:if test="${so.id != null && so.status!='2'}">
						<input name="btnConfirm" type="button" class="barbutton" value="ยืนยัน" onclick="javascript:clickConfirm();">
					</c:if>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>
				<table width="750" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="24" align="left" valign="top">&nbsp;</td>
						<td width="100%" align="left" valign="top">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td height="25" align="right">เลขที่เอกสาร กค. :&nbsp;</td>
								<td >
									<input type="text" name="stockout_code1" class="textbox" size="5" maxlength="9" onblur="javascript:chkSellDuplicate();" value="${so.stockoutCode1}" /> / 
									<input type="text" name="stockout_code2" class="textbox" size="5" maxlength="9" onblur="javascript:chkSellDuplicate();" value="${so.stockoutCode2}" /> 
									<font style="color: red">*</font>
								</td>
								<td align="right">วันที่ :&nbsp;</td>
								<td>
									<input type="Text" id="stockout_date" name="stockout_date" size="15" class="textdate" value="<fmt:formatDate value="${so.stockout_date}" pattern="dd/MM/yyyy"/>" readonly /> 
									<a href="javascript:NewCssCal('stockout_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"></a> 
									<font style="color: red">*</font>
								</td>
							</tr>
							<tr>
								<td width="19%" height="25" align="right">เรื่อง :&nbsp;</td>
								<td width="25%"><input type="text" name="subject" class="textbox" value="${so.subject}">
								<font style="color: red">*</font></td>
								<td align="right">เรียน :&nbsp;</td>
								<td>
									<input type="hidden" name="report_to_staff" id="report_to_staff" value="${so.report_to_staff}"> 								    
								    <input type="hidden" name="staff_name" id="staff_name" class="textview" size="25" value="${staff_name}" readonly="true">
								    <input type="text" name="report_to_posname" id="report_to_posname" class="textbox" size="25" value="${so.report_to_posname}" >
								    <font style="color: red">*</font>
								</td>
							</tr>
							<tr>
								<td align="right">พ.ร.บ. :&nbsp;</td>
								<td height="25" colspan="3">
									<select name="legislation_id" style="width:220px">
										<option value="" selected>กรุณาเลือก</option>
										<c:forEach items="${ltlist}" var="legis">
											<option value="${legis.id}" <c:if test="${so.legislation_id == legis.id}">selected</c:if>>${legis.legislation_name}</option>
										</c:forEach>
									</select><font style="color: red">*</font> 
								</td>
							</tr>
							<tr>
								<td align="right" valign="top">หมายเหตุ :&nbsp;</td>
								<td align="left" colspan="3"><textarea name="remarks" cols="" rows="3" class="textareabig">${so.remarks}</textarea></td>
							</tr>
							<tr>
								<td height="25" align="right">&nbsp;</td>
								<td>&nbsp;</td>
								<td align="right">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
						</table>
						</td>
						<td width="363" valign="top">&nbsp;</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td width="100%" align="left" valign="top">
		<table width="750" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td>&nbsp;</td>
				<td height="25"><strong>รายการของกลาง</strong></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td height="25">
				<!-- <span class="spanLink" onClick="window.open('Popup/manage_exhibit_add.jsp' , '_blank' , 'menubar=no,toolbar=yes,resizable=no,location=no,scrollbars=no,width=700,height=550');">เพิ่มรายการ</span>  -->
				<span class="spanLink" onClick="javascript:openExhibitPopup();">เพิ่มรายการ</span>
				| <span class="spanLink" onClick="javascript:removeCheckBox();">ลบรายการที่เลือก</span></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td colspan="2">
				<table>
				<tr>
					<td>
						<table id="exhibit_table" class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
							<tr>
								<td width="5%" class="TblHeaderColumn AlignCenter">ลำดับ</td>
								<td width="5%" class="TblHeaderColumn AlignCenter">
									<input type="checkbox" name="allCheckbox" value="" onClick="javascript:check_all(this,document.formdata1.check_list);" />
									<input type="hidden" name="thecheckbox">
								</td>
								<td  class="TblHeaderColumn AlignCenter">ชื่อสินค้า</td>
								<td width="15%" class="TblHeaderColumn AlignCenter">ยี่ห้อ</td>
								<td width="10%" class="TblHeaderColumn AlignCenter">ใน/นอก</td>
								<td width="10%" class="TblHeaderColumn AlignCenter">ขนาดบรรจุ</td>
								<td width="10%" class="TblHeaderColumn AlignCenter">จำนวนคงเหลือ</td>
								<td width="10%" class="TblHeaderColumn AlignCenter">จำนวนที่ขาย</td>
								<td width="20%" class="TblHeaderColumn AlignCenter">ปริมาณสุทธิ</td>
							</tr>
							<c:forEach items="${soi_list}" var="soi" varStatus="i">
							<tr>
								<td><div align='center'><input readonly class='textboxlist' size="1" name="row_num" value="${i.index+1}" /></div></td>
								<td><div align='center'><input type="checkbox" name="check_list" value=""></div></td>
								<td><div >${soi.product_name}<input type='hidden' name='product_code' value='${soi.product_code}'></div></td>
								<td><div >${soi.brand_name}<input type='hidden' name='brand_code' value='${soi.brand_code}'></div></td>
								<td><div align='center'>${soi.isdomestic_desc}
									<input type='hidden' name='isdomestic' value='${soi.isdomestic}'>
									</div>
								</td>
								<td>
									<div align='center'>${soi.sizes_desc} ${soi.sizes_unit_name}
									<input type='hidden' name='size_code' value='${soi.sizes_code}'>
									<input type='hidden' name='size_unit_code' value='${soi.sizes_unit_code}'></div>
								</td>
								<td>
									<div align='center'>
										<input type='hidden' name='delivery_code' value='${soi.delivery_exhibit_id}'>
										<input type="hidden" name="ref_stockout_id" value="${soi.ref_stockout_id }">
										<input type='hidden' name='unit_code' value='${soi.unit_code}'>
										<input type='hidden' name='duty_code' value='${soi.duty_code}' ></input>
										<input type='hidden' name='group_id' value='${soi.group_id}'>
										<input type='hidden' name='product_name' value='${soi.product_name}'>
										<input type='hidden' name='brand_name' value='${soi.brand_name}'>
										<input type='hidden' name='qty_unit_name' value='${soi.qty_unit_name}'>
										<input type='hidden' name='sizes_desc' value='${soi.sizes_desc}'>
										<input type='hidden' name='sizes_unit_name' value='${soi.sizes_unit_name}'>
										<input type='hidden' name='netweight_unit_name' id="netweight_unit_name${i.count}" value='${soi.netweight_unit_name}'>
										<input type='hidden' name='duty_name' value='${soi.duty_name}'>
										<input type='hidden' name='group_name' value='${soi.group_name}'>
										<input type='hidden' name='qty_amount' id='qty_amount${i.count}' value='${soi.remain_qty}'>
										${soi.remain_qty} ${soi.unit_name}
									</div>
								</td>
								<td><div >
									<input type='text' name='qty' id="qty${i.count}" size='3' value='${soi.qty}' class='textNum' 
									OnKeyPress='ChkMinusDbl(this);' OnBlur="return ChkStockRemain(qty_amount${i.count},this);" />${soi.unit_name}</div></td>
								<td>
									<div >
										<input type='text' name='netweight' size='3' value='${soi.netweight}' class='textNum' OnKeyPress='ChkMinusDbl(this);' />
										<select name="netweight_unit" class='select' style="width:130px" 
											onChange="getUnitName(this.value,'netweight_unit_name${i.count }');" >
											<option value="" selected>กรุณาเลือก</option>
											<c:forEach items="${unitlist}" var="unit">
												<c:if test="${unit.group_id==soi.group_id}">
													<option value="${unit.unit_code}" <c:if test="${soi.netweight_unit == unit.unit_code}">selected</c:if>>${unit.thname}</option>
												</c:if>
											</c:forEach>
										</select>
									</div>
								</td>
							</tr>
							</c:forEach>
							<tr>
								<td colspan="7" align="right"><b><u>รวมจำนวนที่ขาย :&nbsp;</u></b></td>
								<td><span id="total">${qty} ${unit_desc}</span></td>
								<td colspan="2">&nbsp;</td>
							</tr>
						</table>
					</td>
				</tr>				
			</table>				
		</td>
	</tr>
</table>
</form>
<script language="JavaScript" type="text/javascript">
	//You should create the validator only after the definition of the HTML form
  	var frmvalidator  = new Validator("formdata1");

  	frmvalidator.addValidation("stockout_code1","req","กรุณากรอกเลขที่เอกสาร กค.");
    frmvalidator.addValidation("stockout_code2","req","กรุณากรอกเลขที่เอกสาร กค.");
    frmvalidator.addValidation("stockout_date","req","กรุณากรอกวันที่");
    frmvalidator.addValidation("legislation_id","dontselect=0","กรุณาเลือกคดี พ.ร.บ.");
    frmvalidator.addValidation("subject","req","กรุณากรอกหัวเรื่อง");
    frmvalidator.addValidation("report_to_posname","req","กรุณากรอก เรียน");
</script>
