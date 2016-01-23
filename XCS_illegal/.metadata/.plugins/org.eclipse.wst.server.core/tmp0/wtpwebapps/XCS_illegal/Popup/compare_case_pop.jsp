<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>

<%@page import="com.ko.webapp.util.PageUtil"%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html >
<HEAD>
<base target="_self" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>


<link href="css/style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/javascript" src="js/gen_validatorv31.js"></script>
<script type='text/javascript' src='<c:url value="/dwr/interface/SelectRegion.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/util.js"/>'></script>
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<script type='text/javascript' src='dwr/util.js'></script>
<script type='text/javascript' src='dwr/interface/Lawbreaker.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='<c:url value="/js/JScript.js"/>'></script>


</HEAD>
<script type="text/javascript" language="JavaScript">

	function enabledSource()
	{
		if (document.getElementById("rdiSourceIN").checked==true){
			document.getElementById("sourceIN").style.display='';
			document.getElementById("sourceOUT").style.display='none';
		}else{
			document.getElementById("sourceIN").style.display='none';
			document.getElementById("sourceOUT").style.display='';
		}
	}
</script>
<script type="text/javascript">
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
var opener = window.dialogArguments;
function saveto(row)
{
	var data = 	new Array();
	var count = 0;
	var dcount = 0;
	var i = parseInt(row);
	var par = opener.document.dataform ;
	
	par.compare_case_id.value = incdata2[i]  ;
	par.compare_case_no.value = incdata3[i]  ;
	par.compare_case_date.value = incdata5[i] ;
	par.group_name.value = incdata7[i] ;
	par.status_name.value = incdata17[i] ;
	par.lawbreaker_name.value = incdata18[i] ;
	opener.document.getElementById('product_group_name').innerHTML = incdata7[i];
										
	window.close();
}
function unsave()
{
	var data = 	new Array();
	var count = 0;
	var dcount = 0;
	var par = opener.document.dataform ;

	par.compare_case_id.value = ""  ;
	par.compare_case_no.value = ""  ;	
	par.compare_case_date.value = "" ;
	par.group_name.value = "" ;
	par.status_name.value = "" ;
	par.lawbreaker_name.value = "" ;
	opener.document.getElementById('product_group_name').innerHTML = "";		
	
	window.close();
}
</script>
<BODY>
<TABLE border="0" cellpadding="0" cellspacing="0" width="95%">
	<form id='formPopupSendexhibit' action="<c:url value="/process?action=Compare_case_pop&cmd=list&pap=${p}"/>" method="post" name="dataform">
	
	<tr>
		<td width="20px">&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td ><span class="websitename" >เลือกคดีเปรียบเทียบปรับ</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barButton" value="ไม่เลือกรายการ" onclick="unsave();" >
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
					<TD align="right">เลขคดีเปรียบเทียบ :&nbsp;</TD>
					<TD><input type="text" name="compare_case_no1" class="textbox" size="15"></TD>
					<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
					<TD><input type="text" name="compare_case_no2" class="textbox" size="15"></TD>
				</TR>
				<TR>
					<TD align="right">วันที่ปรับ :&nbsp;</TD>
					<TD>
						<input name="compare_case_date1" type="text" class="textdate" readonly size="7" maxlength="10" />
						<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" />
					</TD>
					<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
					<TD>
						<input name="compare_case_date2" type="text" class="textdate" readonly size="7" maxlength="10" />
						<a href="javascript:NewCssCal('compare_case_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" />
					</TD>
				</TR>
				<TR>
					<TD align="right">พ.ร.บ. :&nbsp;</TD>
					<td>
					<select name="LawType" id="LawType" disabled="disabled">
                 <option selected value="">เลือก</option>
                 <option value="1">พ.ร.บ.สุรา พ.ศ.2493</option>
                 <option value="2">พ.ร.บ.ยาสูบ พ.ศ.2509</option>
                 <option value="3">พ.ร.บ.ไพ่</option>
                 <option value="4">พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>
          			</select>
          			<script>document.getElementById("LawType").value="${p}"</script>
						<!--<input name="legislation_name" type="text" id="legislation_name" class="textview" readonly size="40" maxlength="10" value="" />-->
					<input name="legislation_id" type="hidden" class="textview" readonly size="40" maxlength="10" value="${p}" />
					
					</TD>
				</TR>
				<TR>
					<TD>&nbsp;</TD>
					<TD colspan="3"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"></TD>
				</TR>
				<TR >
					<TD colspan="4">&nbsp;</TD>
					
				</TR>
				</from>

			</TABLE>
			<form method="post" name="dataform3" action="<c:url value="process?action=Indictment_pop&cmd=list"/>" >
			<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                      <tr  align="left" valign="top">
<td colspan="7"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>

                      <tr class="TblHeaderColumn aligncenter">
						<td width="5%" >ลำดับที่</td>
					
						<td width="10%" >เลขคดีเปรียบเทียบ</td>
						<td width="10%" >วันที่ปรับ</td>
						<td width="15%" >สินค้า</td>
						<td width="15%" >พ.ร.บ.</td>
						<td width="10%" >เงินค่าปรับ</td>
						<td width="10%" >สินบน</td>
						<td width="10%" >รางวัล</td>
						<td width="10%" >เงินส่งคลัง</td>
				  </tr>
				 
				  <c:forEach items="${aapList}"  var="exhibit"  varStatus="i" >
				  	<c:if test="${(i.count % 2) == 1}">
				  		<tr class="TblRow aligncenter">
							<td >${i.count}</td>
							
							<td ><span class="spanLink" onClick="saveto('${i.count}');">
								
								${exhibit.compare_case_no}</span></td>
							<td >${exhibit.compare_case_date2}</td>
							<td >${exhibit.group_name}</td>
							<td >${exhibit.legislation_name}</td>
							<td >${exhibit.fine_money}</td>
							<td >${exhibit.birbe_money}</td>
							<td >${exhibit.reward_money}</td>
							<td >${exhibit.treasury_money}</td>
				  		</tr>
				  	</c:if>
					<c:if test="${(i.count % 2) == 0}">
				  		<tr class="TblRow aligncenter bgRowGray" >
							<td >${i.count}</td>
							
							<td ><span class="spanLink" onClick="saveto('${i.count}');">
								
								${exhibit.compare_case_no}</span></td>
							<td >${exhibit.compare_case_date2}</td>
							<td >${exhibit.group_name}</td>
							<td >${exhibit.legislation_name}</td>
							<td >${exhibit.fine_money}</td>
							<td >${exhibit.birbe_money}</td>
							<td >${exhibit.reward_money}</td>
							<td >${exhibit.treasury_money}</td>
				  		</tr>
				  	</c:if>
				  </c:forEach>
				  <c:forEach items="${aapList}" var="sc" varStatus="i" >
		    						<script>
										incdata1[${i.count}] = "" ;
										incdata2[${i.count}] = "${sc.compare_case_id}" ;
										incdata3[${i.count}] = "${sc.compare_case_no}" ;
										incdata4[${i.count}] = "${sc.compare_case_date}" ;
										incdata5[${i.count}] = "${sc.compare_case_date2}";
										incdata6[${i.count}] = "${sc.product_group_id}";
										incdata7[${i.count}] = "${sc.group_name}";
										incdata8[${i.count}] = "${sc.legislation_id}";
										incdata9[${i.count}] = "${sc.legislation_name}";
										incdata10[${i.count}] = "${sc.offcode}";
										incdata11[${i.count}] = "${sc.offname}";
										incdata12[${i.count}] = "${sc.fine_money}";
										incdata13[${i.count}] = "${sc.treasury_money}";
										incdata14[${i.count}] = "${sc.birbe_money}";
										incdata15[${i.count}] = "${sc.reward_money}";
										incdata16[${i.count}] = "${sc.status_code}";
										incdata17[${i.count}] = "${sc.status_name}";
										incdata18[${i.count}] = "${sc.lawbreaker_name}";
										
										
									</script>
								</c:forEach>
			</table>
			</form>
		</td>
	</tr>
</table>

</BODY>
</HTML>
