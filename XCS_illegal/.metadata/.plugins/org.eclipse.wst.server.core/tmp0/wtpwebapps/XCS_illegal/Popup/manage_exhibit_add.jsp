<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
	PageUtil pageUtil = new PageUtil(request);
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<base target="_self" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js"></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js"></script>
<script type="text/javascript" language="JavaScript" src="js/JScript.js"></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>

<META NAME="Generator" CONTENT="EditPlus">

<script type="text/javascript">
	var opener = window.parent;
	var flag = true;

	function Check(chkcont,chk){
		
			if(chkcont.checked==true){
				if(chk.length != null){
					for (i = 0; i < chk.length; i++)
						chk[i].checked = true ;
				}else{
					chk.checked = true;
				}
			}else{
				if(chk.length != null){
					for (i = 0; i < chk.length; i++)
						chk[i].checked = false ;
				}else{
					chk.checked = false;
				}
			}
	}
	
	function check_all(){
		var chkBoxArr = document.dataform2['thecheckbox'];

		if( chkBoxArr.lenght != null){
			for(i=0; i<chkBoxArr.length; i++){
				chkBoxArr[i].checked = flag;
			}
			flag = !flag;
		}else{
			chkBoxArr.checked = flag;
			flag = !flag;
		}
	}
	function decheck_all(){		
		var allChkBox = document.dataform2['allCheckbox'];
		allChkBox.checked = false;
		var chkBoxArr = document.dataform2['thecheckbox'];
		
		if( chkBoxArr.lenght != null){
			for(i=0; i<chkBoxArr.length; i++){
				chkBoxArr[i].checked = false;
			}
		}else{
			chkBoxArr.checked = false;
		}
	}
	function setOpenerVariable(sizesshow,qtyshow,track_no_co){
		if(typeof(window.dialogArguments) != "undefined"){
			window.dialogArguments.document.formdata1.sizesshow1.value=sizesshow;
			window.dialogArguments.document.formdata1.qtyshow1.value=qtyshow;
			window.dialogArguments.document.formdata1.track_no_co1.value=track_no_co;
		}		
	}
	function sendvalue(){
		var data = 	new Array();
		var chkBoxArr = document.dataform2['thecheckbox'];
		if(chkBoxArr != null){
			with(document.dataform2){	
				if(chkBoxArr.length == null){		
					data[0] =new Array();					
					data[0][5]=trim(product_code.value);
					data[0][6]=trim(product_name.value);
					data[0][7]=trim(qty.value);
					data[0][8]=trim(brand_code.value);
					data[0][9]=trim(brand_name.value);					
					data[0][10]=trim(size_code.value);
					data[0][11]=trim(size_unit_code.value);
					data[0][12]=trim(packaging.value);
					data[0][13]=trim(netweight.value);
					data[0][14]=trim(netweight_unit.value);
					data[0][15]=trim(isdomestic.value);		
					var domestic = trim(isdomestic.value);
					if(domestic == "I"){
						data[0][16]='ในประเทศ';
					}else if(domestic == "O"){
						data[0][16]='นอกประเทศ';
					}else{
						data[0][16]='ไม่ระบุ';
					}
					
					data[0][18]=trim(size_unit_name.value);
					data[0][19]=size_desc.value;
					data[0][20]=trim(unit_code.value);
					data[0][21]=trim(duty_code.value);
					
					if(trim(sources.value)=="DELIVERY_EXHIBIT"){
						data[0][17]=trim(delivery_code.value);
						data[0][22]="";
					}else{
						data[0][17]="";
						data[0][22]=trim(delivery_code.value);
					}

					data[0][23]=trim(duty_name.value);
					data[0][24]=trim(netweight_unit_name.value);
					data[0][25]=trim(group_id.value);
					data[0][26]=trim(group_name.value);
					
					
					//alert(product_code.value+":"+product_name.value+":"+brand_name.value+":"+packaging.value+":"+netweight.value);
				}else{
					for (var i=0; i < chkBoxArr.length; i++){
						if (chkBoxArr[i].checked){
							//alert(product_code[i].value+":"+product_name[i].value+":"+brand_name[i].value+":"+packaging[i].value+":"+netweight[i].value);
							//ชื่อสินค้า ยี่ห้อ ขนาดบรรจุ ปริมาตรสุทธิ จำนวน จำนวนที่ขาย หน่วย 
							data[i]=new Array();					
							data[i][5]=trim(product_code[i].value);
							data[i][6]=trim(product_name[i].value);
							data[i][7]=trim(qty[i].value);
							data[i][8]=trim(brand_code[i].value);
							data[i][9]=trim(brand_name[i].value);					
							data[i][10]=trim(size_code[i].value);
							data[i][11]=trim(size_unit_code[i].value);
							data[i][12]=trim(packaging[i].value);
							data[i][13]=trim(netweight[i].value);
							data[i][14]=trim(netweight_unit[i].value);
							data[i][15]=trim(isdomestic[i].value);	
								
							var domestic = trim(isdomestic[i].value);
							if(domestic == "I"){
								data[i][16]='ในประเทศ';
							}else if(domestic == "O"){
								data[i][16]='นอกประเทศ';
							}else{
								data[i][16]='ไม่ระบุ';
							}
							
							data[i][18]=trim(size_unit_name[i].value);
							data[i][19]=trim(size_desc[i].value);
							data[i][20]=trim(unit_code[i].value);			
							data[i][21]=trim(duty_code[i].value);
							if(trim(sources[i].value)=="DELIVERY_EXHIBIT"){
								data[i][17]=trim(delivery_code[i].value);	
								data[i][22]="";
							}else{
								data[i][17]="";
								data[i][22]=trim(delivery_code[i].value);
							}

							data[i][23]=trim(duty_name[i].value);
							data[i][24]=trim(netweight_unit_name[i].value);
							data[i][25]=trim(group_id[i].value);
							data[i][26]=trim(group_name[i].value);
						}
					}
			
				}
			}	
		}
		window.returnValue = data;
		opener.focus();
		opener.close();
	}
</script>


</HEAD>

<BODY>
<TABLE border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td width="20px">&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td><span class="websitename">เลือกของกลาง</span></td>
	</tr>
	<tr>
		<td colspan="2">
		<hr />
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td colspan="2"><input name="btnSave" type="button" class="barbutton" value="เลือกรายการ" onclick="javascript:sendvalue();" /> 
		<!--  <input name="btnClear" type="button" class="barbutton" value="ไม่เลือก" onclick="javascript:decheck_all();" /> --></td>
	</tr>
	<tr>
		<td colspan="2">
		<hr />
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>
		<form id='dataform' action="process?action=ManageExhibitAddPop&cmd=list&stockout_id=${stockout_id }" method="post" name="dataform">
		<TABLE border="0" cellpadding="0" cellspacing="0">
			<TR>
				<TD colspan="4">&nbsp;
					<input type="hidden" name="stockout_id" value="${stockout_id }"></input>
				</TD>
			</TR>
			<TR>
				<TD align="right">เลขที่นำส่ง :&nbsp;</TD>
				<TD><input type="text" name="no1" class="textbox" size="15" value="${param.no1 }"> &nbsp;&nbsp;-&nbsp;&nbsp; <input type="text"
					name="no2" class="textbox" size="15" value="${param.no2 }"></TD>
			</TR>
			<TR>
				<TD align="right">วันที่นำส่ง :&nbsp;</TD>
				<td><input name="date_start" type="text" class="textdate" size="10" maxlength="10" value="${param.date_start }" /> <a
					href="javascript:NewCssCal('date_start','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absMiddle" border="0"/></a>
				&nbsp;&nbsp;&nbsp;&nbsp; ถึง :&nbsp; <input name="date_end" type="text" class="textdate" size="10" maxlength="10" value="${param.date_end }" /> <a
					href="javascript:NewCssCal('date_end','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absMiddle" border="0" /></a></td>
			</TR>
			<TR>
				<TD align="right">พ.ร.บ. :&nbsp;</TD>
				<TD colspan="3"><select name="legislation_id" id="legislation_id" disabled="disabled">
					<option value="" selected>ทั้งหมด</option>
					<c:forEach items="${ltlist}" var="ltion">
						<option value="${ltion.id}">${ltion.legislation_code} ${ltion.legislation_name}</option>
					</c:forEach>
				</select> <input type="hidden" id="l_id" name="l_id" value="${param.l_id }" /></TD>
			</TR>
			<TR>
				<TD>&nbsp;</TD>
				<TD colspan="3"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"></TD>
			</TR>
			<TR>
				<TD colspan="4">&nbsp;</TD>
			</TR>
		</TABLE>
		</form>
		<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
			<tr align="left" valign="top">
				<td colspan="5"><%=pageUtil.getPagination()%></td>
				<td colspan="2" align="right"><%=pageUtil.getPageStatus()%></td>
			</tr>
		</table>
		<form  action="process?action=ManageExhibitAddPop&cmd=list" method="post" name="dataform2">
		<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
			<tr class="TblHeaderColumn aligncenter">
				<td width="5%">ลำดับที่</td>
				<td width="5%"><input type="checkbox" name="allCheckbox" value="" onClick="Check(this,document.dataform2.thecheckbox);" /></td>
				<td width="20%">พ.ร.บ.</td>
				<td width="20%">เลขที่นำส่ง</td>
				<td width="10%">วันที่นำส่ง</td>
				<td width="30%">ชื่อสินค้า</td>
				<td width="10%">จำนวนคงเหลือ</td>
			</tr>
			<c:forEach items="${v_exhibit_list}" var="bean" varStatus="i">
				<c:if test="${(i.count % 2) == 1}">
					<tr>
						<td class="TblRow aligncenter">${i.count}</td>
						<td class="TblRow aligncenter"><input type="checkbox" name="thecheckbox"></td>
						<td class="TblRow">${bean.legislation_name} 
							<input type="hidden" id="duty_code" name="duty_code" value="${bean.duty_code}" />
							<input type="hidden" id="duty_name" name="duty_name" value="${bean.duty_name}" />
							<input type="hidden" id="product_code" name="product_code" value="${bean.product_code}" /> 
							<input type="hidden" id="product_name" name="product_name" value="${bean.product_name}" /> 
							<input type="hidden" id="brand_code" name="brand_code" value="${bean.brand_code}" /> 
							<input type="hidden" id="brand_name" name="brand_name" value="${bean.brand_name}" /> 
							<input type="hidden" id="sources" name="sources" value="${bean.sources}" /> 
							<input type="hidden" id="delivery_code" name="delivery_code" value="${bean.ref_id}" /> 
							<input type="hidden" id="delivery_date2" name="delivery_date2" value="${bean.delivery_date2}" /> 
							<input type="hidden" id="qty" name="qty" value="${bean.qty}" />
							<input type="hidden" id="unit_code" name="unit_code" value="${bean.unit_code}" />  
							<input type="hidden" id="size_code" name="size_code" value="${bean.sizes_code}" /> 
							<input type="hidden" id="size_unit_code" name="size_unit_code" value="${bean.sizes_unit_code}" /> 
							<input type="hidden" id="netweight" name="netweight" value="${bean.netweight}" /> 
							<input type="hidden" id="netweight_unit" name="netweight_unit" value="${bean.netweight_unit}" />
							<input type="hidden" id="netweight_unit_name" name="netweight_unit_name" value="${bean.netweight_unit_name}" /> 
							<input type="hidden" id="isdomestic" name="isdomestic" value="${bean.isdomestic}" /> 
							<input type="hidden" id="packaging" name="packaging" value="${bean.unit_name}" /> 
							<input type="hidden" id="size_unit_name" name="size_unit_name" value="${bean.sizes_unit_name}" /> 
							<input type="hidden" id="size_desc" name="size_desc" value="${bean.size_desc}" />
							<input type="hidden" id="group_id" name="group_id" value="${bean.group_id}" />
							<input type="hidden" id="group_name" name="group_name" value="${bean.group_name}" />
						</td>
						<td class="TblRow">${bean.delivery_code}</td>
						<td class="TblRow">${bean.delivery_date2}</td>
						<td class="TblRow">${bean.product_name} ${bean.brand_name}</td>
						<td class="TblRow">${bean.qty} ${bean.unit_name}</td>
					</tr>
				</c:if>
				<c:if test="${(i.count % 2) == 0}">
					<tr>
						<td class="TblRow aligncenter">${i.count}</td>
						<td class="TblRow aligncenter"><input type="checkbox" name="thecheckbox"></td>
						<td height="25" align="left" valign="top" class="TblRow">
							${bean.legislation_name} 
							<input type="hidden" id="duty_code" name="duty_code" value="${bean.duty_code}" />
							<input type="hidden" id="duty_name" name="duty_name" value="${bean.duty_name}" />
							<input type="hidden" id="product_code" name="product_code" value="${bean.product_code}" /> 
							<input type="hidden" id="product_name" name="product_name" value="${bean.product_name}" />
							<input type="hidden" id="brand_code" name="brand_code" value="${bean.brand_code}" /> 
							<input type="hidden" id="brand_name" name="brand_name" value="${bean.brand_name}" />
							<input type="hidden" id="sources" name="sources" value="${bean.sources}" /> 
							<input type="hidden" id="delivery_code" name="delivery_code" value="${bean.ref_id}" />
							<input type="hidden" id="delivery_date2" name="delivery_date2" value="${bean.delivery_date2}" /> 
							<input type="hidden" id="qty" name="qty" value="${bean.qty}" /> 
							<input type="hidden" id="unit_code" name="unit_code" value="${bean.unit_code}" /> 
							<input type="hidden" id="size_code" name="size_code" value="${bean.sizes_code}" /> 
							<input type="hidden" id="size_unit_code" name="size_unit_code" value="${bean.sizes_unit_code}" /> 
							<input type="hidden" id="netweight" name="netweight" value="${bean.netweight}" /> 
							<input type="hidden" id="netweight_unit" name="netweight_unit" value="${bean.netweight_unit}" />
							<input type="hidden" id="netweight_unit_name" name="netweight_unit_name" value="${bean.netweight_unit_name}" />
							<input type="hidden" id="isdomestic" name="isdomestic" value="${bean.isdomestic}" /> 
							<input type="hidden" id="packaging" name="packaging" value="${bean.unit_name}" /> 
							<input type="hidden" id="size_unit_name" name="size_unit_name" value="${bean.sizes_unit_name}" /> 
							<input type="hidden" id="size_desc" name="size_desc" value="${bean.size_desc}" />
							<input type="hidden" id="group_id" name="group_id" value="${bean.group_id}" />
							<input type="hidden" id="group_name" name="group_name" value="${bean.group_name}" />
						</td>
						<td class="TblRow">${bean.delivery_code}</td>
						<td class="TblRow">${bean.delivery_date2}</td>
						<td class="TblRow">${bean.product_name} ${bean.brand_name}</td>
						<td class="TblRow">${bean.qty} ${bean.unit_name}</td>
					</tr>
				</c:if>
			</c:forEach>

		</table>
		</form>
		</td>
	</tr>
</table>
</BODY>
<script type="text/javascript">
	if(typeof(window.dialogArguments) != "undefined"){
		document.dataform.legislation_id.value = window.dialogArguments.document.formdata1.legislation_id.value;
		document.dataform.l_id.value = window.dialogArguments.document.formdata1.legislation_id.value;
	}	
</script>
</HTML>