<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>

<%@ include file="/Templates/taglibs.jsp"%>

<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<style type="text/css">
<!--
.style7 {
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
}
-->
</style>

		<!-- Body -->
		<table width="100%"  border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">อายัดทรัพย์สิน</span></td>
              </tr>
              <tr>
                <td >&nbsp;</td>
                <td >&nbsp;</td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>
					<input name="btnSave"  type="submit" class="barButton" value="บันทึก" >
					<input name="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขข้อมูลใบรับรองความบริสุทธิ์');window.location.href='<c:url value="${action}" />'; " >
					<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา" onclick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Lavy" />' ">
					<input name="brnPrint" type="button" class="barbutton"
						value="พิมพ์แบบฟอร์ม"
						onClick="printReportLavy();writeTranLog('พิมพ์แบบฟอร์มการอายัดทรัพย์สิน');">
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                    <!--   Start  My Form-->
                	<table border="0" width="800">
						<tr valign="top">
						  <td colspan="2"  align="right"><hr /></td>
						</tr>
						<tr valign="top">
							<td colspan="2">
								<table border="0" width="800">
									<tr valign="top">
										<td width="20%"   align="right" valign="middle">เลขที่คำสั่งอายัด :</td>
										<td width="30%"><input type="Text" id="order_no" name="order_no" value="${db.order_no}" class="textinput"/>
										
										<input type="hidden" id="se_id" name="se_id" value="${db.id}" /><font style="color:red">*</font></td>
										<td width="20%" align="right" valign="middle">วันที่อายัด :</td>
										<td width="30%" ><input name="seize_date" id="seize_date" value="<fmt:formatDate value="${db.seize_date}" pattern="dd/MM/yyyy"/>" type="text" class="textdate" readonly  size="7" maxlength="10" style="width:75;" />
										  <a href="javascript:NewCssCal('seize_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
										  <font style="color:red">*</font></td>
									</tr>
									<tr valign="top">
										<td  align="right" valign="middle">วันที่ถอนอายัด :&nbsp;</td>
										<td><input name="cancel_date" id="cancel_date"  type="text" size="7" value="<fmt:formatDate value="${db.cancel_date}" pattern="dd/MM/yyyy"/>" class="textdate" readonly  maxlength="10" style="width:75;" />
										 <a href="javascript:NewCssCal('cancel_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
										 </td>
										<td align="right" valign="middle">วันครบกำหนดแสดงความถูกต้อง :</td>
										<td><input name="limit_date" id="limit_date" type="text" size="7" value="<fmt:formatDate value="${db.limit_date}" pattern="dd/MM/yyyy"/>" class="textdate" readonly  maxlength="10" style="width:75;" />
										 <a href="javascript:NewCssCal('limit_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
										 </td>
									</tr>
									<tr valign="top">
										<td align="right" valign="middle">สถานที่อายัด :</td>
										<td><input type="Text" id="seize_location" name="seize_location" value="${db.seize_location}" class="textinput"/></td>
										<td  align="right" valign="middle">&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr valign="top">
									  <td   align="right" valign="middle">เลขที่บันทึกการจับกุม :</td>
									  <td><input type="Text" id="track_no" name="track_no" readonly value="${db.track_no}" size="25" class="textview"/>
										<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
										 onClick="incopenmodal('incTable');"><font style="color:red">*</font>
									  </td>
									  <td align="right" valign="middle">&nbsp;</td>
									  <td>&nbsp;</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr valign="top" id="row1">
							<td colspan="2">
								<table border="0" width="100%">
                                          <tr>
									<td>
									  <strong>รายการสิ่งของ</strong>
                                             </td>
                                          </tr>
								  <tr>
										<td>
										
										
										
										
										
										
										
										
		<script type="text/javascript">
										

var incmaxrow=1; // jsp  Count  config
var incstartrow=2;
var inceditrow = -1;
var inceditna = 0;
function caleft(ro){
//alert(ro);
var sub ;

if (!document.dataform.tc_id.length)
{
	 sub = parseInt(document.dataform.dei_arrest_qty.value)-parseInt(document.dataform.dei_prove_qty.value);
	 //alert(sub);
	document.dataform.dei_qty.value=sub;
}else{

	for(i = 0; i < document.dataform.dei_arrest_qty.length; i++){
		//alert('test');
		if(document.dataform.incref_id[i].value==ro){
			//alert('--- '+document.dataform.dei_arrest_qty[i].value);
			//alert('--- '+document.dataform.dei_prove_qty[i].value);
			 sub = parseInt(document.dataform.dei_arrest_qty[i].value)-parseInt(document.dataform.dei_prove_qty[i].value);
			 //alert('sub'+sub);
			document.dataform.dei_qty[i].value=sub;


			}
		}

	
}

}

function incinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23)
{

var row;
var x=document.getElementById(myTable).insertRow(incmaxrow);
incmaxrow++;
row = incmaxrow - 1;
var y1=x.insertCell(0);
var y2=x.insertCell(1);
var y3=x.insertCell(2);
var y4=x.insertCell(3);
var y5=x.insertCell(4);
var y6=x.insertCell(5);
var y7=x.insertCell(6);
var y8=x.insertCell(7);
var y9=x.insertCell(8);

var y10=x.insertCell(9);
var y11=x.insertCell(10);
var y12=x.insertCell(11);

var exp = new Date();
var s = exp.getTime();
var sub = parseInt(data13)-parseInt(data14);
y1.innerHTML="<input readonly class='textboxlist' size='1' name='tc_id' value='" + row + "' />";
y2.innerHTML="<input type=\"hidden\" name=\"incref_id\" value=\""+s+"\" />"+data3;
y3.innerHTML=data4;
y4.innerHTML=data5;


	
	

	;

	


}
function incdelRow(myTable)
{
if (incmaxrow>1)
{
var x=document.getElementById(myTable).deleteRow(myTable,incmaxrow-1);
incmaxrow--
}
}

function incalternate(id){
 if(document.getElementsByTagName){
   var table = document.getElementById(id);
   var rows = table.getElementsByTagName("tr");
   for(i = 0; i < rows.length; i++){
 //manipulate rows
     if(i % 2 == 0){
       rows[i].className = "even";
     }else{
       rows[i].className = "odd";
     }
   }
 }
}

function increrun_id()
{
	if(incmaxrow > 1){
if (incmaxrow == 2)
{
document.dataform.tc_id.value=1;
}else{
for (var i=0; i < document.dataform.tc_id.length; i++)
   {
		document.dataform.tc_id[i].value=i+1;
   }
}
}
	}

function incdelRown(myTable,Rown)
{
alert ("xc");
alert (incmaxrow);		
var x=document.getElementById(myTable).deleteRow(Rown);
incmaxrow--
}
function incopenmodal(myTable)
{
var  dup=0;
var incdata = window.showModalDialog('process?action=arrest_pop&pap=4', self , 'dialogWidth=700px,Height=400px');

if(incdata != null)
	{ incdelall(myTable);
		for (var i=0; i < incdata.length; i++)
		{
		    incinsRow(myTable,incmaxrow,incdata[i][1],incdata[i][2],incdata[i][3],incdata[i][4],incdata[i][5],incdata[i][6],incdata[i][7],incdata[i][8],incdata[i][9],incdata[i][10],incdata[i][11],incdata[i][12],incdata[i][13],incdata[i][14],incdata[i][15],incdata[i][16],incdata[i][17],incdata[i][18],incdata[i][19],incdata[i][20],incdata[i][21],incdata[i][22],incdata[i][23]);
	    }
	}
}


function incdelall(myTable)
{
	
var c_value = "";
var x="";
if(incmaxrow == 1){}else{
	if (incmaxrow==2)
	{
	//alert ("nobox");
		document.getElementById(myTable).deleteRow(1);
		incmaxrow--;
	}else{
		var numrow =  document.dataform.tc_id.length;
		for (var i=0; i < numrow; i++)
   		{
  
     // c_value = c_value + document.dataform.check_list[i].value + "\n";
			document.getElementById(myTable).deleteRow(1);
			
			incmaxrow=1;
      	}
   
   //alert(incmaxrow-1);
  	 increrun_id();
	}
}
}

function printReportLavy(){
	var get = document.getElementById("se_id").value;
	<c:if test="${db != null}" >
		Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + '&ReportName=ILL_P024&getID='+ get + '&vReportType=PDF&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}else{
				window.open('process?action=Report&__report=ILL_P024&getID=' + get + '&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}
		});
	</c:if>
	<c:if test="${db == null}" >
		Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + '&ReportName=ILL_P024_1&vReportType=PDF&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}else{
				window.open('process?action=Report&__report=ILL_P024_1&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}
		});
	</c:if>
}
function incrender(myTable)
{
 for (i=1;i<=incdata1.length-1;i++)
    {
	 incinsRow(myTable,incmaxrow,incdata1[i],incdata2[i],incdata3[i],incdata4[i],incdata5[i],incdata6[i],incdata7[i],incdata8[i],incdata9[i],incdata10[i],incdata11[i],incdata12[i],incdata13[i],incdata14[i],incdata15[i],incdata16[16],incdata17[i],incdata18[i],incdata19[i],incdata20[i],incdata21[i],incdata22[i],incdata23[i]);
    }
}
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


function incCheck(chkcont,chk)
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
					
										
										
										
										
										
										
										
										
											<table id="incTable" class="tableList" width="718" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
											  <tr>
												<td width="54" class="TblHeaderColumn aligncenter" align="center">&nbsp;</td>
												<td width="229" class="TblHeaderColumn">รายการ</td>
												<td width="185" class="TblHeaderColumn">จำนวน</td>
												<td width="250" class="TblHeaderColumn">หมายเหตุ</td>
											  </tr>
										
											  
											  <c:forEach items="${seilist}" var="aa" varStatus="i" >
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
							</td>
						</tr>
						<tr valign="top" >
							<td colspan="2">&nbsp;</td>
						</tr>
					</table>
                                    <!--   Start  My Form-->
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>
<script>
	incrender('incTable');

	<c:if test="${isSave == '1'}">
		alert("บันทึกข้อมูลเรียบร้อย");
	</c:if>
</script>





