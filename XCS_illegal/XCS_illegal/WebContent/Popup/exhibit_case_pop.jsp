<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<base target="_self" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/JScript.js" ></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>

<META NAME="Generator" CONTENT="EditPlus">

<script type="text/javascript">
	var opener = window.parent;
	function check_all(chkcont,chk){
		if(chkcont.checked==true){
			for (i = 0; i < chk.length; i++)
				chk[i].checked = true ;
		}else{
			for (i = 0; i < chk.length; i++)
			chk[i].checked = false ;
		}
	}
	function decheck_all(chkcont,chk){
		for (i = 0; i < chk.length; i++)
			chk[i].checked = false ;
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
		var count = 0;
		var dcount = 0;
		with(document.dataform){
			for (var i=1; i < thecheckbox.length; i++){
				if (thecheckbox[i].checked){
					//ชื่อสินค้า ยี่ห้อ ขนาดบรรจุ ปริมาตรสุทธิ จำนวน จำนวนที่ขาย หน่วย 
					count=dcount;
					dcount+=1;
					data[count]=new Array();
					data[count][5]=trim(product_code[i].value);
					data[count][6]=trim(product_name[i].value);
					data[count][7]=trim(qty[i].value);
					data[count][8]=trim(brand_code[i].value);
					data[count][9]=trim(brand_name[i].value);
					data[count][10]=trim(size_code[i].value);
					data[count][11]=trim(size_unit_code[i].value);
					data[count][12]=trim(packaging[i].value);
					data[count][13]=trim(netweight[i].value);
					data[count][14]=trim(netweight_unit[i].value);
					data[count][15]=trim(isdomestic[i].value);
					var domestic = trim(isdomestic[i].value);
					if(domestic == "I"){
						data[count][16]='ในประเทศ';
					}else if(domestic == "O"){
						data[count][16]='นอกประเทศ';
					}else{
						data[count][16]='';
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
<form id='dataform' action="process?action=ExhibitCase_pop&cmd=list" method="post" name="dataform">

<TABLE border="0" cellpadding="0" cellspacing="0" width="95%">
	<tr>
		<td width="20px">&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td ><span class="websitename" >เลือกของกลางจากคดี</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barbutton" value="เลือกรายการ" onclick="javascript:sendvalue();"/>
			<input name="btnBack"  type="button" class="barbutton" value="กลับ" onclick="self.close()"/>
            <input name="btnClear"  type="button" class="barbutton" value="ไม่เลือก" onclick="javascript:decheck_all(this,document.dataform.thecheckbox);" />
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>
			<TABLE border="0" cellpadding="0" cellspacing="0">
				<TR >
					<TD colspan="4">&nbsp;</TD>
				</TR>
				<TR>
					<TD align="right">เลขคดี :&nbsp;</TD>
					<TD><input type="text" name="textfield" class="textbox" size="15">
					&nbsp;&nbsp;-&nbsp;&nbsp;
					<input type="text" name="textfield" class="textbox" size="15"></TD>
				</TR>
				<TR>
					<TD align="right">วันที่รับคดี :&nbsp;</TD>
				<td >
			<input name="date_start" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('date_start','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absMiddle" /></a>
			&nbsp;&nbsp;&nbsp;&nbsp;
                                ถึง :&nbsp;
			<input name="date_end" type="text" class="textdate" value="" size="10" maxlength="10" />
			<a href="javascript:NewCssCal('date_end','ddmmyyyy')"><img src="images/btn_calendar.png" width="19" height="19" align="absMiddle" /></a>
		</td>
				</TR>
				<TR>
					<TD align="right">พ.ร.บ. :&nbsp;</TD>
					<TD colspan="3">
						<input name="txtLegislation" type="text" class="textview" readonly size="40" maxlength="10" value="พ.ร.บ.สุรา พ.ศ.2493" />
					</TD>
				</TR>
				<TR>
					<TD>&nbsp;</TD>
					<TD colspan="3"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"></TD>
				</TR>
				<TR >
					<TD colspan="4">&nbsp;</TD>
				</TR>
			</TABLE>
			<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                      <tr>

                      </tr>
                      <tr class="TblHeaderColumn aligncenter">
						<td width="5%" >ลำดับที่</td>
						<td width="5%">
							<input type="checkbox" name="allCheckbox" value="" onClick="javascript:check_all(this,document.dataform.thecheckbox);" /> 
							<input type="hidden" name="thecheckbox">
							<input type="hidden" id="qty" name="qty" value="" />
							<input type="hidden" id="product_code" name="product_code" value="" />
							<input type="hidden" id="product_name" name="product_name" value="" />
							<input type="hidden" id="brand_code" name="brand_code" value="" />
							<input type="hidden" id="brand_name" name="brand_name" value="" />
							<input type="hidden" id="size_code" name="size_code" value="" />
							<input type="hidden" id="size_unit_code" name="size_unit_code" value="" />
							<input type="hidden" id="size_desc" name="size_desc" value="" />
							<input type="hidden" id="netweight" name="netweight" value="" />
							<input type="hidden" id="netweight_unit" name="netweight_unit" value="" />
							<input type="hidden" id="isdomestic" name="isdomestic" value="" />
							<input type="hidden" id="packaging" name="packaging" value="" />
						</td>
						<td width="10%" >เลขที่คดี</td>
						<td width="10%" >วันที่รับคดี</td>
						<td width="20%" >พ.ร.บ.</td>
						<td width="30%" >ชื่อสินค้าของกลาง</td>
						<td width="10%" >ขนาด</td>
						<td width="10%" >จำนวน</td>
				  </tr>

				 <c:forEach items="${aae_list}"  var="aae" varStatus="i">
			  		<c:if test="${(i.count % 2) == 1}">
			  			<tr>
							<td class="TblRow aligncenter">${i.count}</td>
							<td class="TblRow aligncenter"><INPUT TYPE="checkbox" NAME="thecheckbox"></td>
							<td class="TblRow aligncenter">
								${aae.case_id}
								<input type="hidden" id="qty" name="qty" value="${aae.qty}" />
								<input type="hidden" id="product_code" name="product_code" value="${aae.product_code}" />
								<input type="hidden" id="product_name" name="product_name" value="${aae.product_name}" />
								<input type="hidden" id="brand_code" name="brand_code" value="${aae.brand_code}" />
								<input type="hidden" id="brand_name" name="brand_name" value="${aae.brand_name}" />
								<input type="hidden" id="size_code" name="size_code" value="${aae.sizes_code}" />
								<input type="hidden" id="size_unit_code" name="size_unit_code" value="${aae.size_unit_code}" />
								<input type="hidden" id="size_desc" name="size_desc" value="${aae.size_desc}" />
								<input type="hidden" id="netweight" name="netweight" value="${aae.netweight}" />
								<input type="hidden" id="netweight_unit" name="netweight_unit" value="${aae.netweight_unit_code}" />
								<input type="hidden" id="isdomestic" name="isdomestic" value="${aae.isdomestic}" />
								<input type="hidden" id="packaging" name="packaging" value="${aae.qty_unit_name}" />
							</td>
							<td class="TblRow aligncenter">${aae.case_date2}</td>
							<td class="TblRow aligncenter">${aae.legislation_name}</td>
							<td class="TblRow aligncenter">${aae.product_name_show}</td>
							<td class="TblRow aligncenter">${aae.sizes}</td>
							<td class="TblRow aligncenter">${aae.qty}</td>		
			  			</tr>
			  		</c:if>
					<c:if test="${(i.count % 2) == 0}">
			  			<tr>
							<td class="TblRow aligncenter">${i.count}</td>
							<td class="TblRow aligncenter"><INPUT TYPE="checkbox" NAME="thecheckbox"></td>
							<td height="25" align="left" valign="top" class="TblRow AlignLeft">
								${aae.case_id}
								<input type="hidden" id="qty" name="qty" value="${aae.qty}" />
								<input type="hidden" id="product_code" name="product_code" value="${aae.product_code}" />
								<input type="hidden" id="product_name" name="product_name" value="${aae.product_name}" />
								<input type="hidden" id="brand_code" name="brand_code" value="${aae.brand_code}" />
								<input type="hidden" id="brand_name" name="brand_name" value="${aae.brand_name}" />
								<input type="hidden" id="size_code" name="size_code" value="${aae.sizes_code}" />
								<input type="hidden" id="size_unit_code" name="size_unit_code" value="${aae.size_unit_code}" />
								<input type="hidden" id="size_desc" name="size_desc" value="${aae.size_desc}" />
								<input type="hidden" id="netweight" name="netweight" value="${aae.netweight}" />
								<input type="hidden" id="netweight_unit" name="netweight_unit" value="${aae.netweight_unit_code}" />
								<input type="hidden" id="isdomestic" name="isdomestic" value="${aae.isdomestic}" />
								<input type="hidden" id="packaging" name="packaging" value="${aae.qty_unit_name}" />
							</td>
			  			</tr>
			  		</c:if>
				</c:forEach>
			</table>
		</td>
	</tr>
</table>
</form>
</BODY>
</HTML>
