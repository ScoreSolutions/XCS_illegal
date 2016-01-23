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
var incdata24 =new Array();
var incdata25 =new Array();
var opener = window.dialogArguments;

function saveto()
{
	var data = 	new Array();
	var count = 0;
	var dcount = 0;
	
	if(document.dataform3.thecheckbox != null){
		//alert("cccc");
		if (!document.dataform3.thecheckbox.length){
			//alert("1");
			//alert(incdata2);
			for (var j=0; j < incdata2.length; j++){
				//alert("JJJJ");
				if (document.dataform3.thecheckbox.value==incdata5[j]){	
					//alert(count  + "  ####");
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
					data[count][24]=incdata24[j];
					data[count][25]=incdata25[j];
				}
			}
		}else{
			//alert("2");
			for (var i=0; i < document.dataform3.thecheckbox.length; i++){ 
				if (document.dataform3.thecheckbox[i].checked==true){
					for (var j=0; j < incdata1.length; j++){
						//alert(j);
						//alert(document.dataform3.thecheckbox[i].value + " $$$$$$ " + incdata5[j]);
						if (document.dataform3.thecheckbox[i].value==incdata5[j]){
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
		     				data[count][24]=incdata24[j];
		     				data[count][25]=incdata25[j];
						}
					}
				}
			}
		}
	}
	window.returnValue = data;
	window.close();
}
</script>

<META NAME="Generator" CONTENT="EditPlus">

</HEAD>

<BODY>
<TABLE border="0" cellpadding="0" cellspacing="0" width="95%">	
	
	<tr>
		<td width="20px">&nbsp;</td>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td ><span class="websitename" >รายการพิสูจน์</span></td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td colspan="2">
			<input name="btnSave"  type="button" class="barbutton" value="เลือกรายการ" onclick="saveto()" >
			
		</td>
	</tr>
	<tr>
		<td colspan="2"><hr /></td>
	</tr>
	<tr>
		<td>&nbsp;</td>
		<td>
			<form  name="dataform" action="<c:url value="/process?action=Sendexhibit_pop&cmd=list&pap=${p}"/>" method="post" >
				<TABLE border="0" cellpadding="0" cellspacing="0">
					<TR >
						<TD colspan="4">&nbsp;</TD>
					</TR>
					<TR OnClick="enabledSource();">
						<TD align="right" width="30%" >ที่มา :&nbsp;</TD>
						<TD colspan="3" width="70%">
							<INPUT TYPE="radio" name="rdiSource" ID="rdiSourceIN" value="IN" <c:if test="${param.rdiSource == 'IN'|| param.rdiSource == null || param.rdiSource == ''}"> checked </c:if>>หน่วยงานภายใน
							<INPUT TYPE="radio" name="rdiSource" ID="rdiSourceOUT" value="OUT"  <c:if test="${param.rdiSource == 'OUT'}"> checked </c:if>>หน่วยงานภายนอก
						</TD>
					</TR>
					<tbody id="sourceIN">
						<TR>
							<TD align="right">รายงานพิสูจน์ที่ :&nbsp;</TD>
							<TD><input type="text" name="exhibit_report_no1" value="${param.exhibit_report_no1 }" class="textbox" size="15"></TD>
							<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
							<TD><input type="text" name="exhibit_report_no2" value="${param.exhibit_report_no2 }" class="textbox" size="15"></TD>
						</TR>
						<TR>
							<TD align="right">วันที่พิสูจน์ :&nbsp;</TD>
							<TD>
								<input name="taken_date1" type="text" value="${param.taken_date1 }" class="textdate" readonly size="7" maxlength="10" />
								<a href="javascript:NewCssCal('taken_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
								</TD>
							<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
							<TD>
								<input name="taken_date2" type="text" value="${param.taken_date2 }" class="textdate" readonly size="7" maxlength="10" />
								<a href="javascript:NewCssCal('taken_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
								</TD>
						</TR>
						<TR>
							<TD align="right">เลขที่คดี :&nbsp;</TD>
							<TD><input type="text" name="case_id1" value="${param.case_id1 }" class="textbox" size="15"></TD>
							<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
							<TD><input type="text" name="case_id2" value="${param.case_id2 }" class="textbox" size="15"></TD>
						</TR>
						<TR>
							<TD align="right">วันที่รับคดี :&nbsp;</TD>
							<TD>
								<input name="case_date1" id="case_date1" value="${param.case_date1 }" type="text" class="textdate" readonly size="7" maxlength="10" />
								<a href="javascript:NewCssCal('case_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
								</TD>
							<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
							<TD>
								<input name="case_date2" id="case_date2" type="text" value="${param.case_date2 }" class="textdate" readonly size="7" maxlength="10" />
								<a href="javascript:NewCssCal('case_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
							</TD>
						</TR>
					</tbody>
					<tbody id="sourceOUT" style="display:none;">
						<TR>
							<TD align="right">เลขที่รายการพิสูจน์ :&nbsp;</TD>
							<TD><input type="text" name="case_id11" class="textbox" value="${param.case_id11 }" size="15"></TD>
							<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
							<TD><input type="text" name="case_id12" class="textbox" value="${param.case_id12 }" size="15"></TD>
						</TR>
						<TR>
							<TD align="right">วันที่พิสูจน์ :&nbsp;</TD>
							<TD>
								<input name="case_date11" type="text" class="textdate"  value="${param.case_date11 }" readonly size="7" maxlength="10" />
								<a href="javascript:NewCssCal('case_date11','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
							</TD>
							<TD>&nbsp;&nbsp;-&nbsp;&nbsp;</TD>
							<TD>
								<input name="case_date12" type="text" class="textdate" value="${param.case_date12 }" readonly size="7" maxlength="10" />
								<a href="javascript:NewCssCal('case_date12','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
							</TD>
						</TR>
					</tbody>
					<TR>
						<TD align="right">พ.ร.บ. :&nbsp;</TD>
						<TD colspan="3">
							<select name="LawType" id="LawType" disabled="disabled">
		              			<option value="" selected>ทั้งหมด</option>
								<c:forEach items="${ltlist}"  var="ltion">
									<option value="${ltion.id}" >${ltion.legislation_code} ${ltion.legislation_name}</option>
								</c:forEach>
		          			</select>
		          			<script>document.getElementById("LawType").value="${p}"</script>
							<input name="legislation_id" type="hidden"  value="${p}" />
							<input name="offcode_prove" type="hidden" value="${offcode_prove}" ></input>
						</TD>
					</TR>
					<TR>
						<TD>&nbsp;</TD>
						<td><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"></td>
				</TR>
					<TR >
						<TD> 
				<script>
					function Check(chkcont,chk)
						{
							if(chkcont.checked==true){
								for (i = 0; i < chk.length; i++)
								chk[i].checked = true ;
							}else{
								for (i = 0; i < chk.length; i++)
								chk[i].checked = false ;
							}
						}
				</script>
				</TD>
						
					</TR>
			</TABLE>
		</form>
		
			<table class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
			  	<tr  align="left" valign="top">
					<td colspan="5"><%=pageUtil.getPagination()%></td>
					<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
				</tr>
			<form method="post" name="dataform3" >
				  <tr class="TblHeaderColumn aligncenter">
						<td width="5%" >ลำดับที่</td>
						<td width="5%" ><input type="checkbox" name="allCheckbox" value="" onClick="Check(this,document.dataform3.thecheckbox);" /></td>
						<td width="10%" >รายงานพิสูจน์ที่</td>
						<td width="10%" >วันที่พิสูจน์</td>
						<td width="10%" >เลขที่คดี</td>
						<td width="10%" >วันที่รับคดี</td>
						<td width="35%" >พ.ร.บ.</td>
				  </tr>
				  <c:forEach items="${aapList}"  var="exhibit"  varStatus="i" >
				  	<c:if test="${(i.count % 2) == 1}">
				  		<tr class="TblRow aligncenter">
							<td >${i.count}</td>
							<td ><INPUT TYPE="checkbox" NAME="thecheckbox" value="${exhibit.track_no}"></td>
							<td >${exhibit.exhibit_report_no}</td>
							<td >${exhibit.taken_date2}</td>
							<td >${exhibit.case_id}</td>
							<td >${exhibit.case_date2}</td>
							<td >${exhibit.legislation_name}</td>
							<td >${exhibit.soures}</td>
				  		</tr>
				  	</c:if>
					<c:if test="${(i.count % 2) == 0}">
				  		<tr class="TblRow aligncenter bgRowGray" >
							<td >${i.count}</td>
							<td ><INPUT TYPE="checkbox" NAME="thecheckbox" value="${exhibit.track_no}"></td>
							<td >${exhibit.exhibit_report_no}</td>
							<td >${exhibit.taken_date2}</td>
							<td >${exhibit.case_id}</td>
							<td >${exhibit.case_date2}</td>
							<td >${exhibit.legislation_name}</td>
							<td >${exhibit.soures}</td>
				  		</tr>
				  	</c:if>
				  </c:forEach>
				  
				   <c:forEach items="${allapplist}" var="inc" varStatus="i" >
   						<script>
							incdata1[${i.count}] = "" ;
							incdata2[${i.count}] = "${inc.soures}" ;
							incdata3[${i.count}] = "${inc.isdomestic}" ;
							incdata4[${i.count}] = "${inc.app_arrest_prove_exhibit_id}" ;
							incdata5[${i.count}] = "${inc.track_no}";
							incdata6[${i.count}] = "${inc.exhibit_report_no}";
							incdata7[${i.count}] = "";
							incdata8[${i.count}] = "${inc.taken_date2}";
							incdata9[${i.count}] = "${inc.product_code}";
							incdata10[${i.count}] = "${inc.brand_code}";
							incdata11[${i.count}] = "${inc.brand_name}";
							incdata12[${i.count}] = "${inc.unit_name}";
							incdata13[${i.count}] = "${inc.arrest_qty}";
							incdata14[${i.count}] = "${inc.prove_qty}";
							incdata15[${i.count}] = "${inc.qty}";
							incdata16[${i.count}] = "${inc.legislation_id}";
							incdata17[${i.count}] = "${inc.legislation_name}";
							incdata18[${i.count}] = "${inc.title_name}";
							incdata19[${i.count}] = "${inc.lawbreaker_name}";
							incdata20[${i.count}] = "${inc.product_name}";
							incdata21[${i.count}] = "${inc.netweight}";
							incdata22[${i.count}] = "${inc.unit_netweight}";
							incdata23[${i.count}] = "${inc.application_outside_prove_item}";
							incdata24[${i.count}] = "${inc.size_desc}";
							incdata25[${i.count}] = "${inc.size_unit_name}";
						</script>
					</c:forEach>
				</form>
			</table>
		</td>
	</tr>
</table>

</BODY>
</HTML>

<script>
	enabledSource();
</script>