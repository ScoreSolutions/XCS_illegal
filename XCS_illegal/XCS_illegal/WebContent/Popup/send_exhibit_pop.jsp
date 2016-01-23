<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html xmlns="http://www.w3.org/1999/xhtml">

<HEAD>
<base target="_self" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" language="JavaScript">

var incdata1 =new Array();
var incdata2 =new Array();
var incdata3 =new Array();
var incdata4 =new Array();
var incdata5 =new Array();
var incdata6 =new Array();
var incdata7 =new Array();
var incdata8 =new Array();
var incdata9 =new Array();
var incdata10 =new Array();
var incdata11 =new Array();
var incdata12 =new Array();
var incdata13 =new Array();
var incdata14 =new Array();
var incdata15 =new Array();
var incdata16 =new Array();
var incdata17 =new Array();
var incdata18 =new Array();
var incdata19 =new Array();
var incdata20 =new Array();
var incdata21 =new Array();
var incdata22 =new Array();
var incdata23 =new Array();
var incdata24 =new Array();
var incdata25 =new Array();
var incdata26 =new Array();

var opener = window.dialogArguments;

function saveto(tn,dc,st,s,source_type)
{
	var data = 	new Array();
	var count = 0;
	var dcount = 0;
	var par = null;
	if(opener != undefined && opener != null){
		par = opener.document.dataform ;
		if(source_type == "SEND"){
			par.de_id.value = tn;
			par.so_id.value = "";
		}else{
			par.so_id.value = tn;
			par.de_id.value = "";
		}
		
		par.doc_no.value = dc  ;
		par.send_date.value = st  ;
		par.offname.value = s;
		
		//par.status.value = s  ;
	}
	for (var j=0; j < incdata1.length; j++)
	{
		//alert(j);
		if (incdata12[j]==tn)
		{	
			//alert(j);
			count=dcount;
			dcount+=1;
			data[count]=new Array();
			data[count][1]="";
			data[count][2]=incdata2[j];
			data[count][3]=incdata3[j];
			data[count][4]=incdata4[j];
			data[count][5]=incdata5[j];
			data[count][6]=incdata6[j];
			data[count][7]=incdata7[j];
			data[count][8]=incdata8[j];
			data[count][9]=incdata9[j];
			data[count][10]=incdata10[j];
			data[count][11]=incdata11[j];
			data[count][12]=incdata12[j];
			data[count][13]=0;
			data[count][14]=incdata14[j];
			data[count][15]=incdata15[j];		
			data[count][16]="";		
			data[count][17]=incdata17[j];
			data[count][18]=incdata18[j];
			data[count][19]=incdata19[j];
			data[count][20]=incdata20[j];
			data[count][21]=incdata21[j];
			data[count][22]=incdata22[j];
			data[count][23]=incdata23[j];
			data[count][24]=incdata24[j];
			data[count][25]=incdata25[j];
			data[count][26]=incdata26[j];         
		}
	}
						
	window.returnValue = data;
	window.close();
	

}
function clearfield(){
	if(opener != undefined && opener != null){
		par = opener.document.dataform ;
		par.de_id.value = "";
		par.doc_no.value = "";
		par.send_date.value = "";
		par.offname.value = "";
	}
	self.close();
}
</script>


<BODY>
<TABLE border="0" cellpadding="0" cellspacing="0" width="95%">
	
	<form id='formPopupSendexhibit' action="<c:url value="/process?action=Exhibit_arrest_pop&cmd=list"/>" method="post" name="searc_sincere">
	
	<tr>
		<td width="20px">&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td ><span class="websitename" >รายการนำส่งของกลาง</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td colspan="2">
			
	
			<input name="btnBack"  type="button" class="barbutton" value="ไม่เลือก" onclick="javascript:clearfield();">
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
					<TD align="right">เลขที่หนังสือส่ง :&nbsp;</TD>
					<TD>กค.<input type="text" name="delivery_code" class="textbox" size="13" ></TD>
					<TD align="right">เลขที่งาน :&nbsp;</TD>
					<TD><input type="text" name="job_no" class="textbox" size="13" value='${param.job_no }'></TD>
				</TR>
				<TR>
					<TD align="right" width="25%">วันที่นำส่ง :&nbsp;</TD>
					<TD width="30%">
						<input name="delivery_date1" type="text" class="textdate" readonly size="7" maxlength="10" value='${param.delivery_date1 }'/>
						<a href="javascript:NewCssCal('delivery_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" >
					</TD>
					<TD width="20%" align="right">&nbsp;&nbsp;ถึงวันที่ :&nbsp;</TD>
					<TD width="25%">
						<input name="delivery_date2" type="text" class="textdate" readonly size="7" maxlength="10" value='${param.delivery_date2 }'/>
						<a href="javascript:NewCssCal('delivery_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" >
					</TD>
				</TR>

				<TR>
					<TD align="right">พ.ร.บ. :&nbsp;</TD>
					<TD colspan="3">
						<select name="legislation_id" id="legislation_id" style="width:220px;">
							<option value="" selected>ทั้งหมด</option>
							<c:forEach items="${ltlist}"  var="ltion">
<option value="${ltion.id}"  <c:if test="${param.legislation_id == ltion.id}"> selected </c:if> >${ltion.legislation_code} ${ltion.legislation_name}</option>
	</c:forEach>
					
						</select>
					</TD>
				</TR>
                <tr>
                        <td align="right" >สินค้า :&nbsp;</td>
                        <td align="left" colspan="3" >
                          <input type="radio" name="isdomestic"  value="I"/>ในประเทศ
                          <input type="radio" name="isdomestic" value="O"  />ต่างประเทศ
                          <input type="radio" name="isdomestic"  value="Z" checked />ไม่ระบุ
                        </td>
                </tr>
				<TR>
					<td align="right">หน่วยงานที่นำส่ง :&nbsp;</td>
					<td colspan="3">
						<input type="text" name="offcode" id="offcode" size="4"  class="textbox"  value='${param.offcode }'>
			               <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                            onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" >
						<input type="text" name="offname" id="offname" size="25"  class="textView"  value='${param.offname }' />
					</td>
				</TR>
				<TR>
					<TD>&nbsp;</TD>
					<TD colspan="3"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"></TD>
				</TR>
				<TR >
					<TD colspan="4">&nbsp;</TD>
				</TR>
				</form>
			</TABLE>
			
			<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
				<tr  align="left" valign="top">
<td colspan="4"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
				  <tr class="TblHeaderColumn aligncenter">
						<td width="5%" >ลำดับที่</td>
						<td width="10%" >เลขที่หนังสือส่ง</td>
						<td width="10%" >วันที่นำส่ง</td>
						<td width="20%" >เรื่อง</td>
						<td width="20%" >หน่วยงานที่นำส่ง</td>
						<td width="15%" >พ.ร.บ.</td>
				  </tr>
				  
				  <c:forEach items="${aapList}"  var="aa"  varStatus="i" >
				  	<c:if test="${(i.count % 2) == 1}">
				  		<tr class="TblRow aligncenter">
							<td >${i.count}</td>
							<!-- <td ><span class="spanLink" onClick="saveto('${aa.id}','${aa.delivery_code}','${aa.delivery_date2}','${aa.subject_type}');">-->
							<td ><span class="spanLink" onClick="saveto('${aa.id}','${aa.delivery_code}','${aa.delivery_date2}','${aa.offname_from}','${aa.source_type}');">
								
							${aa.delivery_code}</span></td>
							<td >${aa.delivery_date2}</td>
							<td >${aa.subject}</td>
							<td >${aa.offname_from}</td>
							<td >${aa.legislation_name}</td>
						
				  		</tr>
				  	</c:if>
					<c:if test="${(i.count % 2) == 0}">
				  		<tr class="TblRow aligncenter bgRowGray" >
							<td >${i.count}</td>
							
							<td ><span class="spanLink" onClick="saveto('${aa.id}','${aa.delivery_code}','${aa.delivery_date2}','${aa.offname_from}','${aa.source_type}');">
								
							${aa.delivery_code}</span></td>
							<td >${aa.delivery_date2}</td>
							<td >${aa.subject}</td>
							<td >${aa.offname_from}</td>
							<td >${aa.legislation_name}</td>
				  		</tr>
				  	</c:if>
				  </c:forEach>
				  <c:forEach items="${allapplist}" var="aa" varStatus="i" >
		    						<script>
										incdata1[${i.count}] = "" ;
										incdata2[${i.count}] = "${aa.product_code}" ;
										incdata3[${i.count}] = "${aa.product_name}" ;
										incdata4[${i.count}] = "${aa.brand_code}" ;
										incdata5[${i.count}] = "${aa.sizes_code}";
										incdata6[${i.count}] = "${aa.unit_code}";
										incdata7[${i.count}] = "${aa.send_qty}";
										incdata8[${i.count}] = "${aa.send_unit}";
										incdata9[${i.count}] = "${aa.isdomestic}";
										incdata10[${i.count}] = "${aa.isdomestic_name}";
										incdata11[${i.count}] = "${aa.stockin_type}";
										incdata12[${i.count}] = "${aa.sel_id}";
										incdata14[${i.count}] = "${aa.netweight_unit}";
										incdata15[${i.count}] ="${aa.netweight}";
										incdata17[${i.count}]="${aa.sizes_unit_code}";
										incdata18[${i.count}]="${aa.duty_code}";
										incdata19[${i.count}]="${aa.group_id}";
										incdata20[${i.count}]="${aa.brand_name}";
										incdata21[${i.count}]="${aa.qty_unit_name}";
										incdata22[${i.count}]="${aa.sizes_desc}";
										incdata23[${i.count}]="${aa.sizes_unit_name}";
										incdata24[${i.count}]="${aa.netweight_unit_name}";
										incdata25[${i.count}]="${aa.duty_name}";
										incdata26[${i.count}]="${aa.group_name}";
										
									</script>
								</c:forEach>
				  
				  
			</table>
		</td>
	</tr>
</table>

</BODY>
</HTML>
