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
<html >
<HEAD>
<base target="_self" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="../js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="../js/menu.js" ></script>


</HEAD>
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
function saveto(tn)
{
var data = 	new Array();
var count = 0;
var dcount = 0;

var par = opener.document.dataform ;


	//alert (data);
	
	par.track_no.value = tn;

	for (var j=0; j < incdata1.length; j++)
	{
		//alert(j);
		if (incdata2[j]==tn)
		{	
			//alert(j);
			count=dcount;
			dcount+=1;
			data[count]=new Array();
			data[count][1]=incdata1[j];
			data[count][2]=incdata2[j];
			data[count][3]=incdata3[j];
			data[count][4]=incdata4[j];
			data[count][5]=incdata5[j];
							
				
			
								               
		}
	}
										
	window.returnValue = data;
	window.close();
	

}
</script>
<BODY>
<form id='formPopupSendexhibit' action="<c:url value="/process?action=arrest_pop&cmd=list&pap=${p}"/>" method="post" name="dataform">
	
<TABLE border="0" cellpadding="0" cellspacing="0" width="100%">
	<tr>
		<td width="20px">&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td ><span class="websitename" >เลือกบันทึกการจับกุม</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barbutton" value="เลือกรายการ" />
			<input name="btnBack"  type="button" class="barbutton" value="กลับ" />
               <input name="btnClear"  type="button" class="barbutton" value="ไม่เลือก" />
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
					<TD align="right">เลขที่งาน :&nbsp;</TD>
					<TD><input type="text" name="track_no1" class="textbox" size="15"></TD>
					<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
					<TD><input type="text" name="track_no2" class="textbox" size="15"></TD>
				</TR>
				<TR>
					<TD align="right">วันที่เกิดเหตุ :&nbsp;</TD>
					<TD>
						<input name="occurrence_date1" id="occurrence_date1" type="text" class="textdate" readonly size="7" maxlength="10" />
						<a href="javascript:NewCssCal('occurrence_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" />
					</TD>
					<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
					<TD>
						<input name="occurrence_date2" id="occurrence_date2" type="text" class="textdate" readonly size="7" maxlength="10" />
						<a href="javascript:NewCssCal('occurrence_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" />
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
			</TABLE>
			
				</from>
			<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                     	<tr>
						<td colspan="6"><%=pageUtil.getPagination()%>,<%=pageUtil.getPageStatus()%></td>
					</tr>
                      <tr class="TblHeaderColumn aligncenter">
						<td width="5%" >ลำดับที่</td>
						<td width="15%" >เลขที่งาน</td>
						<td width="10%" >วันที่เกิดเหตุ</td>
						<td width="20%" >พ.ร.บ.</td>
						<td width="25%" >ชื่อผู้ต้องหา</td>
						<td width="25%" >ชื่อผู้กล่าวหา</td>
				  </tr>
				
				  
				  <c:forEach items="${aapList}"  var="aa"  varStatus="i" >
				  	<c:if test="${(i.count % 2) == 1}">
				  		<tr class="TblRow aligncenter">
							<td >${i.count}</td>
							
							<td ><span class="spanLink" onClick="saveto('${aa.track_no}');">
								
								${aa.track_no}</span></td>
							<td >${aa.occurrence_date2}</td>
							<td >${aa.legislation_name}</td>
							<td >${aa.lawbreaker_name}</td>
							<td >${aa.accuser_name}</td>
						
				  		</tr>
				  	</c:if>
					<c:if test="${(i.count % 2) == 0}">
				  		<tr class="TblRow aligncenter bgRowGray" >
							<td >${i.count}</td>
							
							<td ><span class="spanLink" onClick="saveto('${aa.track_no}');">
								
							${aa.track_no}</span></td>
							<td >${aa.occurrence_date2}</td>
							<td >${aa.legislation_name}</td>
							<td >${aa.lawbreaker_name}</td>
							<td >${aa.accuser_name}</td>
				  		</tr>
				  	</c:if>
				  </c:forEach>
				  <c:forEach items="${allapplist}" var="aa" varStatus="i" >
		    						<script>
										incdata1[${i.count}] = "" ;
										incdata2[${i.count}] = "${aa.track_no}" ;
										incdata3[${i.count}] = "${aa.product_name}" ;
										incdata4[${i.count}] = "${aa.qty}" ;
										incdata5[${i.count}] = "${aa.remarks}";
								
										
										
									</script>
								</c:forEach>
				  
			</table>
		</td>
	</tr>
</table>

</BODY>
</HTML>
