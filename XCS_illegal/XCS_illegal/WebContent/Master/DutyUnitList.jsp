<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<script type="text/javascript" language="JavaScript"
	src="script/Popup.js"></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css">

<script type='text/javascript' src='<c:url value="dwr/interface/SelectRegion.js"/>'></script>
<script type='text/javascript' src='<c:url value="dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="dwr/util.js"/>'></script>
<script type="text/javascript">
function updatedata(url,unitcode,dutyunitid, txtID, btn){
	chkDupCode(url,unitcode,dutyunitid,txtID,btn);
}
</script>
<script>
	function chkDupCode(url,uCode,uID,utxtID,ubtn){
		if(document.DutyUnitList.cmbDutyGroup.value=="000"){
			alert("กรุณาเลือกประเภทสินค้า");
			return;
		} 
		if(document.DutyUnitList.request_date_start.value == " " | document.DutyUnitList.request_date_start.value == null)
		{
			alert("กรุณาเลือกวันที่เริ่มใช้");
			return;
		}
		chkDupUnitCode(url,uCode,uID,utxtID,ubtn);		
	}
</script>
<script>
	function chkDupUnitCode(url,cCode, cID, txtID, btn){
		document.getElementById(btn).disabled = true;
		Master.chkDupDutyUnit(cCode,document.DutyUnitList.cmbDutyGroup.value ,cID, function(data){
			if(data != ""){
				alert(data);
				txtID.select();
				document.getElementById(btn).disabled = false;
			}else{
				//document.getElementById(btn).disabled = false;
				if (url != "")
				{
					document.DutyUnitList.action=url;
				    document.DutyUnitList.submit();
				}	
			}
		});		
	}
</script>
<script>
function cleardata(url){
	if (url != "")
	{
		document.DutyUnitList.action=url;
	    document.DutyUnitList.submit();
	}
}
function btDelete(id,idd,code)
{
var answer = confirm ("ยืนยันการลบข้อมูล");
	if (answer){
	window.location.href="process?action=DutyUnitList_Master&id="+id+"&idd="+idd+"&ucode="+code+"&cmd=del";
	}
	else{
	}
}
</script>
<table width="100%" border="0" cellspacing="0" 	cellpadding="0">
<form action="process?action=DutyUnitList_Master&cmd=create" name="DutyUnitList" method="post">
	<tr>
		<td width="1%">&nbsp;</td>
		<td width="99%"><span class="websitename">หน่วยนับสินค้า</span></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>
			<table width="500" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
					<tr>
						<td>
							<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">
								<tr>
									<td width="1%" align="left" valign="top"></td>
									<td width="98%"></td>
									<td width="1%" align="right" valign="top"></td>
								</tr>
								<tr>
									<td height="40">&nbsp;</td>
									<td align="center" valign="top">
										<table width="100%" border="0" cellspacing="0" cellpadding="0">
											<tr>
												<td>&nbsp;</td>
											</tr>											
											<tr>		
												<input type="hidden" value="${unitlist.id}" name="id"/>
												<td>&nbsp;</td>
												<td width="20%"  align="right" valign="middle">รหัสหน่วยนับ :&nbsp;</td>
												<td width="30%" align="left" valign="middle">
													<input name="unit_code" type="text" class="textview" value="${unitlist.unit_code}" size="28" />
												</td>
												<td>&nbsp;</td>
												<td>&nbsp;</td>																				
											</tr>
											<tr>
												<td>&nbsp;</td>
												<td width="20%"  align="right" valign="middle">ชื่อหน่วยไทย :&nbsp;</td>
												<td width="30%" align="left" valign="middle">
													<input name="thname" type="text" class="textview" value="${unitlist.thname}" size="28" />
												</td>	
												<td>&nbsp;</td>
												<td>&nbsp;</td>																				
											</tr>
											<tr>
												<td>&nbsp;</td>
												<td width="20%"  align="right" valign="middle">ชื่อหน่วยอังกฤษ :&nbsp;</td>
												<td width="30%" align="left" valign="middle">
													<input name="enname" type="text" class="textview" value="${unitlist.enname}" size="28" />
												</td>
												<td>&nbsp;</td>
												<td>&nbsp;</td>																					
											</tr>
											<tr>
												<td>&nbsp;</td>
												<td width="20%"  align="right" valign="middle">รหัสหน่วยย่อ :&nbsp;</td>
												<td width="30%" align="left" valign="middle">
													<input name="abbname" type="text" class="textview" value="${unitlist.abbname}" size="28" />
												</td>
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
										</table>	
									</td>								
								</tr>							
							</table>
						</td>
					</tr>				
				</table>		
	 	</td>
 	</tr>
 	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>
			<table width="500" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
				<tr>
					<td>
						<table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">
							<tr>
								<td width="1%" align="left" valign="top"></td>
								<td width="98%"></td>
								<td width="1%" align="right" valign="top"></td>
							</tr>
							<tr>
								<td height="40">&nbsp;</td>
								<td align="center" valign="top">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td>&nbsp;</td>
										</tr>											
										<tr>
											<td>&nbsp;</td>
											<td width="20%"  align="right" valign="middle">ประเภทสินค้า :&nbsp;</td>
											<td width="50%" align="left" valign="middle">
												<select name="cmbDutyGroup" id="cmbDutyGroup" style="width:200px;">		
													<option value="000">เลือก</option>
														<c:forEach items="${dutygrplist}" var="grp" varStatus="i">
															<option value="${grp.group_id}" >${grp.group_name}</option>
														</c:forEach>
			                    				</select>  
			                    				<font color="red">*</font>
											</td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>																				
										</tr>
										<tr>
											<td>&nbsp;</td>
											<td width="20%"  align="right" valign="middle">เป็นหน่วยนับ :&nbsp;</td>
											<td align="left" valign="middle">
												<input type=radio name="rdoProduct" value="P" >สินค้า
												<input type=radio name="rdoProduct" value="S" >ขนาดสินค้า
												<input type=radio name="rdoProduct" value="A" checked>ทั้งหมด
											</td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>
										</tr>
										<tr>
											<td>&nbsp;</td>
											<td width="20%" align="right" valign="middle">วันที่เริ่มใช้ :&nbsp;</td>
											<td width="30%" align="left" valign="middle" >
												<input id="request_date_start" name="request_date_start" type="text" class="textdate" readonly value=" " />
												<img onclick="javascript:NewCssCal('request_date_start','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
											<font color="red">*</font>
											</td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>
										</tr>
										<tr>
											<td>&nbsp;</td>
											<td width="20%"  align="right" valign="middle">วันที่สิ้นสุด :&nbsp;</td>
											<td width="30%" align="left" valign="middle">
												<input id="request_date_stop" name="request_date_stop" type="text" class="textdate" readonly value=" " />
												<img onclick="javascript:NewCssCal('request_date_stop','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
											</td>
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
											<td width="20%"  align="right" valign="middle">&nbsp;</td>
											<td width="30%" align="left" valign="middle" >
												<input type="button" name="save" id="save" class="barButton" value="บันทึกข้อมูล" onclick="updatedata('<c:url value="/process?action=DutyUnitList_Master&cmd=create"/>',${unitlist.unit_code},'0',this,'save')"/>
												<input type="button" name="clear" id="clear" class="barButton" value="ล้างข้อมูล" onclick="cleardata('<c:url value="/process?action=DutyUnitList_Master&cmd=cleardate"/>')"/>
											</td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>
										</tr>							
									</table>								
								</td>						
							</tr>
						</table>
					</td>
				</tr>
			</table>				
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
</from>
</table>
<table width="100%" border="0" cellspacing="0" 	cellpadding="0">
   <tr>
   		<td>&nbsp;</td>
   		<td>
	 		<table class="tableList" width="850" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC" >
				<tr align="left" valign="top">
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td width="5%" class="TblHeaderColumn">ลำดับ</td>
					<td width="15%" class="TblHeaderColumn">ประเภทสินค้า</td>
					<td width="10%" class="TblHeaderColumn">วันที่เริ่มใช้</td>
					<td width="10%" class="TblHeaderColumn">วันที่สิ้นสุด</td>
					<td width="5%" >&nbsp;</td>
				</tr>
				<c:if test="${rowCount == '0'}" >
					<tr><td colspan="7" align="center">ไม่พบรายการ</td></tr>
				</c:if>
				<c:forEach items="${viewdutyunit}" var="asw" varStatus="i">
					<tr class='<c:if test="${(i.count % 2)!='1'}">bgRowGray</c:if>' >
						<td align="center">${i.count+_rowIndex}</td>
						<td >${asw.group_name }</td>
						<td align="center" >${asw.begin_date}</td>
						<td align="center">${asw.end_date}</td>
						<td><img src="images/icon_delete.gif" width="25" height="25" border="0" title="ลบรายการ" style="cursor:hand;" onclick = 'btDelete("${asw.id}","${unitlist.id}","${unitlist.unit_code}");'></td>
					</tr>
				</c:forEach>
			</table>
		</td>
	</tr>
</table>