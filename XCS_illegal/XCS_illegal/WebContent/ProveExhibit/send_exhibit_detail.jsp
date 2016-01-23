

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type="text/javascript" > 
function confirm2(){

//alert('test');
	var answer = confirm ("ยืนยันนำส่งของกลาง");
	if (answer){
		if(document.dataform.onsubmit()){
			writeTranLog('ยืนยันนำส่งของกลาง');
			document.dataform.confirm.value = '2';
			document.dataform.submit();
	
		}
	}
}

function tosubmit(){
	if(document.dataform.onsubmit()!=false){
		var tbRowCount = document.getElementById('incTable').rows.length;
		if(tbRowCount <= 1){
			alert("กรุณาเพิ่มรายการบัญชีสิ่งของที่นำส่ง");
			return false;					
		}else{
			//document.dataform.submit();
			return true;
		}
	}else
		return false;
}

function Print(){
	writeTranLog('พิมพ์บันทึกการนำส่งของกลาง');
	Reports.ReportUrl(function(data){
		if(data != ""){
			window.open(data + "ReportName=ILL_P041&getId="+document.dataform.de_id.value+"&vReportType=PDF&time=" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			window.open('process?action=Report&__report=ILL_P041&__formatt=pdf&getId='+document.dataform.de_id.value , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}
	});
}
</script>

		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width=" 99%"><span class="websitename">ใบนำส่งของกลางเพื่อจัดเก็บ</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><hr /></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                	<c:if test="${de.status=='1' || de.status==null }">
						<input name="btnSave"  type="submit" class="barButton" value="บันทึก" onClick="return tosubmit();" >
						<input name="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขข้อมูลใบนำส่งของกลางเพื่อจัดเก็บ');window.location.href='<c:url value="${action}" />'; " >
						<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา" onClick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Sendexhibit" />' " >
						<c:if test="${de.delivery_id != null }">
							<input name="btnConfirm"  type="button" class="barButton" value="ยืนยัน" onClick="confirm2();">
							<input name="btnPrint"  type="button" class="barButton" value="พิมพ์"
							onClick="Print();">
						</c:if>
					</c:if>
					<c:if test="${de.status>='2'}">
						<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา" onClick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Sendexhibit" />' " >
						<input name="btnPrint"  type="button" class="barButton" value="พิมพ์"
							onClick="Print();">
					</c:if>
					<input type="hidden" name="confirm" value="${de.status}"/>
				</td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><hr /></td>
              </tr>
            
              <tr>
				 <td>&nbsp;</td>
				 <td>
						<table width="800" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<td width="24" align="left" valign="top">&nbsp;</td>
							<td width="100%" align="left" valign="top">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
							  <tr>
								<td height="27" align="right">เลขที่งาน :&nbsp;</td>
								<td colspan="3">
									<input type="Text" id="job_no" name="job_no" value="${de.job_no}" size="30" class="textview" readonly/>
									<input type="hidden" id="id" name="de_id" value="${de.delivery_id}"/>
								</td>

							  </tr>
							  <tr>
                                        <td width="20%" height="25" align="right" valign="middle">เลขที่หนังสือส่ง&nbsp;:&nbsp;</td>
                                        <td width="25%">
                                             	กค. <input type="Text" id="delivery_no1" name="delivery_no1" value="${de_no1}" class="textNum"  size="5"/> /&nbsp;
                                             <input type="Text" id="delivery_no2" name="delivery_no2" value="${de_no2}" class="textNum" onkeypress="ChkMinusInt(this);" size="4"/>
                                             <font style="color:red">*</font>
                                             <input type="hidden" name="temp_no12" value="${de_no1}/${de_no2}">
                                        </td>
								<td width="20%" align="right">วันที่นำส่ง :&nbsp;</td>
								<td width="33%">
									<c:if test="${de.delivery_date2 == null}">
									  <input name="delivery_date" id="delivery_date" type="text" class="textdate" readonly size="7" maxlength="10" value="<fmt:formatDate value='<%=new Date()%>' pattern='dd/MM/yyyy' />"/>
									</c:if>
									<c:if test="${de.delivery_date2 != null}">
										<input name="delivery_date" id="delivery_date" type="text" class="textdate" readonly size="7" maxlength="10" value="${de.delivery_date2}"/>
									</c:if>
								<a href="javascript:NewCssCal('delivery_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
     	  
 							<font style="color:red">*</font>
								</td>
							  </tr>
							  <tr>
								<td height="25" align="right">เรื่อง :&nbsp;</td>
								<td >
                                            <input type="text" name="subject" size="15" class="textbox" value="${de.subject}">
                                            <font style="color:red">*</font>
                                            <select name="subject_type" id="subject_type" style="width:80px;">
                                                <option value="1" selected>เสร็จคดี</option>
                                                <option value="2" >ระหว่างคดี(ฟ้องศาล)</option>
                                                <option value="3" >ระหว่างคดี(ไม่มีตัว)</option>
                                            </select>
                                            <font style="color:red">*</font>
								</td>
								<td  height="25" align="right">พ.ร.บ. :&nbsp;</td>
								<td >
									<select name="legislation_id" id="LawType" style="width:220px;">
										<option value="" selected>เลือก</option>
											<c:forEach items="${ltlist}"  var="ltion">
											<option value='${ltion.id}' >${ltion.legislation_code} ${ltion.legislation_name}</option>
										</c:forEach>
									</select>
									<font style="color:red">*</font>
								</td>
							  </tr>
							  <tr>
								<td align="right">เรียน :&nbsp;</td>
								<td>
                                          <input type="hidden" name="offcode_inform_name" id="offcode_inform_name" class="textview" readonly size="30" value="${de.offinname}">
                                          <input type="text" name="offcode_inform" id="offcode_inform" size="30" value="${de.offcode_inform}">
									<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand;display:none" onClick="window.open('process?action=Divide_staff_pop&offname=offcode_inform_name&offcode=offcode_inform' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />
     
										<font style="color:red">*</font>
								</td>

								<td align="right">สถานะ :&nbsp;</td>
								<td>
									<input type="text" name="status_name" class="textview" readonly value="${de.status_name}">
								</td>
							  </tr>


							  <tr>
								<td  height="25" align="right">จากหน่วยงาน :&nbsp;</td>
								<td >
									<input type="text" name="offcode_from_name" id="offcode_from_name" class="textview" readonly size="40" value="${offnamenow}">
								</td>
								<td  height="25" align="right">ไปยังหน่วยงาน :&nbsp;</td>
								<td >
									<input type="text" name="offcode_to" id="offcode_to" size="4"  class="textbox"  value="${de.offcode_to}" >
						            <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                    					onClick="window.open('process?action=Ed_office_pop&formname=offcode_to_name&formcode=offcode_to' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />
									<input type="text" name="offcode_to_name" id="offcode_to_name" size="26"  class="textView" value="${de.offtoname}" />
									<font style="color:red">*</font>
								</td>
							  </tr>
							  <tr>
								<td  height="25" align="right">ผู้นำส่ง :&nbsp;</td>
								<td colspan="3">
									<input type="text" name="delivery_by_name" id="delivery_by_name" class="textview" readonly size="35" value="${nameStaff}">
									<input type="hidden" name="delivery_by" id="delivery_by" size="35" value="${staffID}">
									<input type="hidden" name="offcode_from" id="offcode_from" size="35"  value="${offcodenow}">
									<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick="window.open('process?action=Divide_staff_pop&formname=delivery_by_name&id=delivery_by&offname=offcode_from_name&offcode=offcode_from' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" /> 
     
									<font style="color:red">*</font>
								</td>
								</tr>
							  </table></td>
							<td width="150" valign="top">&nbsp;</td>
						  </tr>
						  <tr>
								<td>&nbsp;</td>
								<td height="25"><strong>รายการบัญชีสิ่งของที่นำส่ง</strong></td>
								<td height="25">
									</table>
								<span class="spanLink" onClick="incopenmodal('incTable');">เพิ่มรายการ</span> |
								<span class="spanLink" onClick="incget_check_value('incTable');">ลบรายการ</span>
    						</td>
						  </tr>
						  <tr>
							<td>&nbsp;</td>
							
<script language="javascript">
								function checkSelect(){
									if(document.getElementById("LawType").value == ""){
										alert("กรุณาเลือก พ.ร.บ");
									}else
										window.open('/XCS_illegal/process?action=Sendexhibit_pop&pap='+document.getElementById("LawType").value , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=yes,width=600,height=500');
								}
</script>								
<script type="text/javascript">



var incmaxrow=1; // jsp  Count  config
var incstartrow=2;
var inceditrow = -1;
var inceditna = 0;
function caleft(ro){
//alert(ro);
var sub ;

if (!document.dataform.tc_id.length &&  document.dataform.dei_prove_qty.value != "")
{
	 sub = parseFloat(document.dataform.dei_arrest_qty.value)-parseFloat(document.dataform.dei_prove_qty.value);
	 //alert(sub);
	 if(sub<0){
		alert("กรูณากรอกค่าให้น้อยกว่าจำนวนจับกุม");
		sub=parseFloat(document.dataform.dei_arrest_qty.value);
		document.dataform.dei_prove_qty.value=0;
		document.dataform.dei_prove_qty.focus="true";
		 }
	document.dataform.dei_qty.value=sub;
}else{

	for(i = 0; i < document.dataform.dei_arrest_qty.length; i++){
		if ( document.dataform.dei_prove_qty[i].value != "")
		{
			 sub = parseFloat(document.dataform.dei_arrest_qty[i].value)-parseFloat(document.dataform.dei_prove_qty[i].value);
			 if(sub<0){
					alert("กรูณากรอกค่าให้น้อยกว่าจำนวนจับกุม");
					sub=parseFloat(document.dataform.dei_arrest_qty[i].value);
					document.dataform.dei_prove_qty[i].value=0;
					document.dataform.dei_prove_qty[i].focus="true";
					 }
			 document.dataform.dei_qty[i].value=sub;
		}else{
			document.dataform.dei_qty[i].value=document.dataform.dei_arrest_qty[i].value;
			}
			


			
		}

	
}

}

function incinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25)
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
//var y12=x.insertCell(11);

var exp = new Date();
var s = exp.getTime();
var sub = parseFloat(data13 != "" ? data13 : 0)-parseFloat(data14 != "" ? data14 : 0);
y1.innerHTML="<input readonly class='textboxlist' size='1' name='tc_id' value='" + row + "' />";
y2.innerHTML="<input type=\"checkbox\" name=\"inccheckbox\" value=\"\"><input type=\"hidden\" name=\"incref_id\" value=\""+s+"\" />";
y3.innerHTML=data6;

var productDesc = data20;
if(data11 != "")
	productDesc += " ยี่ห้อ " + data11;
if(data24 != "")
	productDesc += " ขนาดบรรจุ " + data24 + " " + data25;
y4.innerHTML= productDesc;
//y5.innerHTML=data11;
y5.innerHTML="<input type=\"text\" size=\"2\" name=\"dei_arrest_qty\" readonly class=\"textViewNum\" value=\""+data13+"\">"+" "+data12;
y6.innerHTML="<input type=\"text\" size=\"2\" name=\"dei_prove_qty\" value=\""+data14+"\" onkeypress=\"ChkMinusDbl(this);\" onChange=\" caleft('"+s+"'); \" > "+" "+data12;
y7.innerHTML="<input type=\"text\" size=\"2\" name=\"dei_qty\" class=\"textViewNum\" readonly value=\""+sub+"\">"+" "+data12;
y8.innerHTML=data17;
y9.innerHTML=data18;
y10.innerHTML=data19;
y11.innerHTML=
	"<input type=\"hidden\" name=\"dei_id\" value=\""+data1+"\">"
	+"<input type=\"hidden\" name=\"dei_soures\" value=\""+data2+"\">"
	+"<input type=\"hidden\" name=\"dei_isdomestic\" value=\""+data3+"\">"
	+"<input type=\"hidden\" name=\"dei_app_arrest_prove_exhibit_id\" value=\""+data4+"\">"
	+"<input type=\"hidden\" name=\"dei_track_no\" value=\""+data5+"\">"
	+"<input type=\"hidden\" name=\"dei_exhibit_report_no\" value=\""+data6+"\">"
	+"<input type=\"text\" size=\"2\" name=\"dei_remarks\" value=\""+data7+"\">"
	+"<input type=\"hidden\" name=\"dei_taken_date2\" value=\""+data8+"\">"
	+"<input type=\"hidden\" name=\"dei_product_code\" value=\""+data9+"\">"
	+"<input type=\"hidden\" name=\"dei_brand_code\" value=\""+data10+"\">"
	+"<input type=\"hidden\" name=\"dei_brand_name\" value=\""+data11+"\">"
	+"<input type=\"hidden\" name=\"dei_unit_name\" value=\""+data12+"\">"
	+"<input type=\"hidden\" name=\"dei_legislation_id\" value=\""+data16+"\">"
	+"<input type=\"hidden\" name=\"dei_legislation_name\" value=\""+data17+"\">"
	+"<input type=\"hidden\" name=\"dei_title_name\" value=\""+data18+"\">"
	+"<input type=\"hidden\" name=\"dei_lawbreaker_name\" value=\""+data19+"\">"
	+"<input type=\"hidden\" name=\"dei_product_name\" value=\""+data20+"\">"
	+"<input type=\"hidden\" name=\"dei_netweight\" value=\""+data21+"\">"
	+"<input type=\"hidden\" name=\"dei_unit_netweight\" value=\""+data22+"\">"
	+"<input type=\"hidden\" name=\"dei_application_outside_prove_item\" value=\""+data23+"\">";
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
if (!document.dataform.tc_id.length)
{
document.dataform.tc_id.value=1;
}else{
for (var i=0; i < document.dataform.tc_id.length; i++)
   {
		document.dataform.tc_id[i].value=i+1;
   }
}
}

function incdelRown(myTable,Rown)
{

	
var x=document.getElementById(myTable).deleteRow(Rown);
incmaxrow--
}
function incopenmodal(myTable)
{
	var LawType=document.dataform.legislation_id.value;
	if(LawType == "" || LawType == null){
		alert("กรุณาเลือก พ.ร.บ.");
		return;
	}
	
	var  dup=0;
	var incdata = window.showModalDialog('process?action=Sendexhibit_pop&pap='+document.getElementById("LawType").value +'&offcode_prove='+document.getElementById("offcode_from").value, self , 'dialogWidth=700px,Height=400px');

	if(incdata != null){
		{
			for (var i=0; i < incdata.length; i++)
			{
			    	incinsRow(myTable,incmaxrow,incdata[i][1],incdata[i][2],incdata[i][3],incdata[i][4],incdata[i][5],incdata[i][6],incdata[i][7],incdata[i][8],incdata[i][9],incdata[i][10],incdata[i][11],incdata[i][12],incdata[i][13],0,incdata[i][15],incdata[i][16],incdata[i][17],incdata[i][18],incdata[i][19],incdata[i][20],incdata[i][21],incdata[i][22],incdata[i][23],incdata[i][24],incdata[i][25]);
			    	writeTranLog('เพิ่มรายการเลขที่รายงานการพิสูจน์');
		    }
		}
	}
}


function incget_check_value(myTable)
{
var c_value = "";
var x="";
if (!document.dataform.inccheckbox.length&&document.dataform.inccheckbox.checked)
{
	//alert ("nobox");
	document.getElementById(myTable).deleteRow(1);
	incmaxrow--;
	writeTranLog('ลบรายการเลขที่รายงานการพิสูจน์');
}else{
for (var i=0; i < document.dataform.inccheckbox.length; i++)
   {
   if (document.dataform.inccheckbox[i].checked)
      {
     // c_value = c_value + document.dataform.check_list[i].value + "\n";
		document.getElementById(myTable).deleteRow(i+1);
		i--;
		incmaxrow--;
      }
   }
   //alert(incmaxrow-1);
   
   if(x!=incmaxrow){
	    writeTranLog('ลบรายการเลขที่รายงานการพิสูจน์');
	    increrun_id();
	}
}
}
function incrender(myTable)
{
 for (i=1;i<=incdata1.length-1;i++)
    {
	 incinsRow(myTable,incmaxrow,incdata1[i],incdata2[i],incdata3[i],incdata4[i],incdata5[i],incdata6[i],incdata7[i],incdata8[i],incdata9[i],incdata10[i],incdata11[i],incdata12[i],incdata13[i],incdata14[i],incdata15[i],incdata16[16],incdata17[i],incdata18[i],incdata19[i],incdata20[i],incdata21[i],incdata22[i],incdata23[i],incdata24[i],incdata25[i]);
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
var incdata24 =new Array();
var incdata25 =new Array();


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
<script>

function allCheck(chkcont,chk)
{

	

		if(!chk.length){

			if(chkcont.checked==true){
				
				chk.checked = true ;
					}else{
					
					chk.checked = false ;
					}

	}else{
		
		if(chkcont.checked==true){
			for (i = 0; i < chk.length; i++)
			chk[i].checked = true ;
			}else{
			for (i = 0; i < chk.length; i++)
			chk[i].checked = false ;
			}
	}
}
</script>			
							
							<td colspan="2" >
							
								<table id="incTable" class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
								  <tr  class="TblHeaderColumn AlignCenter">
									<td width="40" >ลำดับ</td>
									<td width="40" ><input type="checkbox" id="incchkAll" onclick=" allCheck(this,document.dataform.inccheckbox)"></td>
									<td width="86" >เลขที่รายงานการพิสูจน์</td>
									<td width="230" >ของกลาง</td>
									<td width="83" >จำนวนจับกุม</td>
									<td width="83" >ใช้ตรวจพิสูจน์</td>
									<td width="83" >เหลือนำส่ง</td>
									<td width="110" >พ.ร.บ.</td>
									<td width="102" > ผ้กล่าวหา</td>
									<td width="102" >ผู้ต้องหา</td>
									<td width="41" >หมายเหตุ</td>
								  </tr>
								  
								  
								  <c:forEach items="${aaelist}" var="inc" varStatus="i" >
		    						<script>
										incdata1[${i.count}] = "${inc.id}" ;
										incdata2[${i.count}] = "${inc.soures}" ;
										incdata3[${i.count}] = "${inc.isdomestic}" ;
										incdata4[${i.count}] = "${inc.app_arrest_prove_exhibit_id}" ;
										incdata5[${i.count}] = "${inc.track_no}";
										incdata6[${i.count}] = "${inc.exhibit_report_no}";
										incdata7[${i.count}] = "${inc.remarks}";
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
										incdata24[${i.count}] = "${inc.sizes_desc}";
										incdata25[${i.count}] = "${inc.sizes_unit_name}";
									</script>
								</c:forEach>
								  
								</table>
						</td>
						</tr>
					  <tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
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
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table>
	<script language="javascript">
function checkSelect(){
	if(document.getElementById("LawType").value == ""){
		alert("กรุณาเลือก พ.ร.บ");
	}else
		window.open('/XCS_illegal/process?action=Sendexhibit_pop&pap='+document.getElementById("LawType").value , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=yes,width=600,height=500');
}
</script>
	
	<script type="text/javascript">
		for (var i=0; i < document.dataform.legislation_id.length; i++) {
			if (document.dataform.legislation_id[i].value == "${de.legislation_id}") {
			document.dataform.legislation_id[i].selected = true;
		}}
		for (var i=0; i < document.dataform.subject_type.length; i++) {
			if (document.dataform.subject_type[i].value == "${de.subject_type}") {
			document.dataform.subject_type[i].selected = true;
		}}
		</script>
		<script>
incrender('incTable');
</script>

<c:if test="${SaveMSG == '1'}" >
	<script>
		alert("บันทึกข้อมูลเรียบร้อย");
	</script>
</c:if>
