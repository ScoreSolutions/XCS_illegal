<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@include file="/Templates/meta.jsp" %>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigDecimal"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<script type="text/javascript" src="js/JScript.js" ></script>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html >
<HEAD>
<base target="_self" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>


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
function saveto()
{
var data = 	new Array();
var count = 0;
var dcount = 0;

if (!document.dataform3.thecheckbox.length)
{
		var j = 1;
			
			count=dcount;
			dcount+=1;
			data[count]=new Array();
			data[count][1]=incdata1[j];
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
	 		data[count][13]=incdata13[j];
				data[count][14]=incdata14[j];
				data[count][15]=incdata15[j];
				data[count][16]=incdata16[j];
				data[count][17]=incdata17[j];
				data[count][18]=incdata18[j];
				data[count][19]=incdata19[j];
				data[count][20]=incdata20[j];
				data[count][21]=incdata21[j];
				data[count][22]=incdata22[j] ; 
				data[count][23]=incdata23[j]  ; 				
				
			
								               
	
}else{

	for (var i=0; i < document.dataform3.thecheckbox.length; i++)
	{
		if (document.dataform3.thecheckbox[i].checked==true)
		{ var j = i+1 ;
				
					//alert(j);
					count=dcount;
					dcount+=1;
					data[count]=new Array();
					data[count][1]=incdata1[j];
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
			 		data[count][13]=incdata13[j];
     				data[count][14]=incdata14[j];
     				data[count][15]=incdata15[j];
     				data[count][16]=incdata16[j];
     				data[count][17]=incdata17[j];
     				data[count][18]=incdata18[j];
     				data[count][19]=incdata19[j];
     				data[count][20]=incdata20[j];
     				data[count][21]=incdata21[j];
     				data[count][22]=incdata22[j]; 
     				data[count][23]=incdata23[j];
			
		}
	}

}
	//alert (data);
	window.returnValue = data;
	window.close();

}
</script>
<BODY>
<TABLE border="0" cellpadding="0" cellspacing="0" width="95%">
	<form id='formPopupSendexhibit' action="<c:url value="/process?action=Sendincome_pop&cmd=list&pap=${p}"/>" method="post" name="searc_sincere">
	
	<tr>
		<td width="20px">&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td ><span class="websitename" >เลือกคดีที่ยังไม่นำส่งเงิน</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barButton" value="เลือกรายการ"  onclick="saveto()" >
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
					<TD><input type="text" name="compare_case_no1" value="${param.compare_case_no1 }" class="textbox" size="15"></TD>
					<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
					<TD><input type="text" name="compare_case_no2" value="${param.compare_case_no2 }" class="textbox" size="15"></TD>
				</TR>
				<TR>
					<TD align="right">วันที่ปรับ :&nbsp;</TD>
					<TD>
						<input name="compare_case_date1" type="text" value="${param.compare_case_date1 }" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" size="7"  />
						<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" />
					</TD>
					<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
					<TD>
						<input name="compare_case_date2" type="text" value="${param.compare_case_date2 }" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" size="7"  />
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
					<input name="send_offcode" id="send_offcode" type="hidden" value="${send_offcode}" ></input>
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
		</td>
	</tr>
	</form>

	<tr>
		<td>&nbsp;</td>
		<td>
			<table class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">

				<script>
				function Check(chkcont,chk){
					if(chkcont.checked==true){
						for (i = 0; i < chk.length; i++)
							chk[i].checked = true ;
					}else{
						for (i = 0; i < chk.length; i++)
							chk[i].checked = false ;
					}
				}

				</script>
				<tr>
					<td colspan="6" ><%=pageUtil.getPagination()%></td>
					<td colspan="4" align="right"><%=pageUtil.getPageStatus()%></td>
				</tr>
				<form method="post" name="dataform3"  >
                      <tr class="TblHeaderColumn aligncenter">
						<td width="5%" >ลำดับที่</td>
						<td width="5%" ><input type="checkbox" name="allCheckbox" value="" onClick="Check(this,document.dataform3.thecheckbox);" /></td>
						<td width="10%" >เลขคดีเปรียบเทียบ</td>
						<td width="10%" >วันที่ปรับ</td>
						<td width="15%" >พ.ร.บ.</td>
						<td width="15%" >สินค้า</td>
						<td width="10%" >เงินค่าปรับ</td>
						<td width="10%" >สินบน</td>
						<td width="10%" >รางวัล</td>
						<td width="10%" >เงินส่งคลัง</td>
				  </tr>
				 
				  <c:forEach items="${aapList}"  var="exhibit"  varStatus="i" >
				  	<c:if test="${(i.count % 2) == 1}">
				  		<tr class="TblRow aligncenter">
							<td >${i.count}</td>
							<td ><INPUT TYPE="checkbox" NAME="thecheckbox" value=""></td>
							<td >${exhibit.compare_case_no}</td>
							<td >${exhibit.compare_case_date2}</td>
							<td >${exhibit.legislation_name}</td>
							<td >${exhibit.group_name}</td>
							<td >${exhibit.fine_money}</td>
							<td >${exhibit.birbe_money}</td>
							<td >${exhibit.reward_money}</td>
							<td >${exhibit.treasury_money}</td>
				  		</tr>
				  	</c:if>
					<c:if test="${(i.count % 2) == 0}">
				  		<tr class="TblRow aligncenter bgRowGray" >
							<td >${i.count}</td>
							<td ><INPUT TYPE="checkbox" NAME="thecheckbox" value=""></td>
							<td >${exhibit.compare_case_no}</td>
							<td >${exhibit.compare_case_date2}</td>
							<td >${exhibit.legislation_name}</td>
							<td >${exhibit.group_name}</td>
							<td >${exhibit.fine_money}</td>
							<td >${exhibit.birbe_money}</td>
							<td >${exhibit.reward_money}</td>
							<td >${exhibit.treasury_money}</td>
				  		</tr>
				  	</c:if>
				  </c:forEach>
				  <c:forEach items="${aapList}" var="sc" varStatus="i" >
		    						<script>
										incdata1[${i.count}] = "";
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
										incdata18[${i.count}] = "${sc.lawbreaker_qty}";
										incdata19[${i.count}] = "${sc.inv_no}";
										incdata20[${i.count}] = "${sc.ref_type}";
										
										
										
									</script>
								</c:forEach>
							</form>
			</table>
		</td>
	</tr>
	
</table>

</BODY>
</HTML>
