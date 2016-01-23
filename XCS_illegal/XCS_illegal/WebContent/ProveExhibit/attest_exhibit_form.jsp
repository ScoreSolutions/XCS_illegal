<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<script type='text/javascript' src='dwr/interface/Pke_Compare.js'></script>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type="text/javascript" language="JavaScript">
function toggle() {
 if( document.getElementById("a").checked ==false ){
  document.getElementById("hidethis").style.display = '';
  document.getElementById("hidethis2").style.display = '';
 }else{
  document.getElementById("hidethis").style.display = 'none';
  document.getElementById("hidethis2").style.display = 'none';
 }
}


function ChkDupExhibitNo(){
	
	var vTrackNo = document.dataform.track_no.value;
	var ExhibitNo = document.dataform.exhibit_report_no1.value + "/" + document.dataform.exhibit_report_no2.value;
	//var vOffcode = document.dataform.staff_prove_offcode.value;
	var vOffcode = document.dataform.offcode.value;
	
	Pke_Compare.ChkDupExhibitReportNo(vTrackNo, ExhibitNo, vOffcode, function(data){
		if(data != ""){
			document.getElementById("exhibit_report_no1").value = "";
			document.getElementById("exhibit_report_no2").value = "";
			alert(data)
			document.getElementById("exhibit_report_no1").select();
		}
	});
}

function PrintILL_P038(){
	writeTranLog('พิมพ์ ส.ส.2/4');
	Reports.ReportUrl(function(data){
		if(data != ""){
			window.open(data + "ReportName=ILL_P038&getTrackNo=${db.track_no}&vReportType=PDF&time=" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			window.open('process?action=Report&__report=ILL_P038&__formatt=pdf&getTrackNo=${db.track_no}&time=<%=new java.util.Date().getTime()%>' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}
	});
}

function PrintILL2013(){
	writeTranLog('พิมพ์บันทึกการตรวจรับของกลาง');
	Reports.ReportUrl(function(data){
		if(data != ""){
			window.open(data + "ReportName=ILL2013&getTrackNo=${db.track_no}&vReportType=PDF&time=" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			window.open('process?action=Report&__report=ILL2013&__formatt=pdf&getTrackNo=${db.track_no}&time=<%=new java.util.Date().getTime()%>' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}
	});
}
</script>
    
    <form method="post" name="dataform" action='<c:url value="/process?action=Insideprove&cmd=create"/>' >
    
		<!-- Body -->
		<table width="100%"  border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">การพิสูจน์ของกลาง</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>
                	<input name="track_no_p" type="hidden" value="${db.track_no}"/>
                	<input name="chkcaselast" type="hidden" value="${db.chkcaselast}" />
                	
                	<c:if test="${db.send_income_case_id == '0' && IsEdit == 'Y'}">
						<input name="btnSave"  type="submit" class="barButton" value="บันทึก" >
						<input name="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขข้อมูลการพิสูจน์ของกลางหน่วยงานภายใน');window.location.href='<c:url value="${action}" />'; ">
					</c:if>
					
					<c:if test="${db.send_income_case_id != '0' && IsEdit == 'Y'}">
						<c:if test="${IsAddExhibit=='Y'}">
							<input name="btnSave"  type="submit" class="barButton" value="บันทึก" >
						</c:if>
					</c:if>
					<input	name="btnBack" type="button" class="barButton"		value="กลับหน้าค้นหา" onclick="writeTranLog('“กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Insideprove&cmd=list&default=Y" />' ">
					<input name="btnPrint"  type="button" class="barButton" value="พิมพ์ ส.ส.2/4"
						onClick="PrintILL_P038();" >
					<input name="btnPrintILL2013" type="button" class="barButton" value="พิมพ์บันทึกการตรวจรับของกลาง"
						onClick="PrintILL2013();" ></input>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
               
						<!-- รายละเอียดบันทึกการจับกุม-->
						<%@ include file="../Protect/arrest_detailshow.jsp" %>

                              <!-- ข้อกล่าวหา-->
                              <%@include file="../Protect/showindictment.jsp" %>

						<table width="1000" border="0" cellspacing="0" cellpadding="0" >
							  <tr class="bgRowGray">
								<td colspan="4"><strong>พิสูจน์ของกลาง</strong> <input type="hidden" name="update" value="${update}" /></td>
							  </tr>
							  <tr valign="top">
								<td height="10" colspan="4" align="right" valign="middle">&nbsp;</td>
							  </tr>
							  <tr>
                                        <td width="20%" height="25" align="right" valign="middle">รายงานการพิสูจน์เลขที่ :&nbsp;</td>
                                        <td width="30%">
                                             <input type="Text" id="exhibit_report_no1" name="exhibit_report_no1" value="${aap_id_1}" class="textNum" onkeypress="ChkMinusInt(this);" onBlur="ChkDupExhibitNo();" size="5"/> /&nbsp;
                                             <input type="Text" id="exhibit_report_no2" name="exhibit_report_no2" value="${aap_id_2}" class="textNum" onkeypress="ChkMinusInt(this);" onBlur="ChkDupExhibitNo();" size="4"/>
                                             <font style="color:red">*</font>
                                        </td>
                                        
								<td width="20%"  height="25" align="right">เลขที่คดี(สมุดรับคำกล่าวโทษ) :&nbsp;</td>
								<td width="30%" ><input type="text" name="case_id" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="10" value="${db.case_id}"></td>
							  </tr>
							  <tr>
								<td align="right" >วันที่รับเรื่องพิสูจน์ : </td>
								<td >
									<c:if test="${aap.taken_date != null}">
										<input name="taken_date" id="taken_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="<fmt:formatDate value="${aap.taken_date}" pattern="dd/MM/yyyy"/>"  />
										<a href="javascript:NewCssCal('taken_date','ddmmyyyy')">
										<img id="imgTaken_date" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>เวลา
										<input id="taken_time" name="taken_time" type="text" class="textbox" size="5" maxlength="5" value="<fmt:formatDate value="${aap.taken_date}" pattern="HH:mm"/>" onkeypress="txtTime_OnKeyPress(this);"/>
									</c:if>
									<c:if test="${aap.taken_date == null}">
										<input name="taken_date" id="taken_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="<fmt:formatDate value="<%=new Date() %>" pattern="dd/MM/yyyy"/>"  />
										<a href="javascript:NewCssCal('taken_date','ddmmyyyy')">
										<img id="imgTaken_date" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>เวลา
										<input id="taken_time" name="taken_time" type="text" class="textbox" size="5" maxlength="5" value="<fmt:formatDate value="<%=new Date() %>" pattern="HH:mm"/>" onkeypress="txtTime_OnKeyPress(this);"/>
									</c:if>
										<font style="color:red">*</font>
								</td>
								<td align="right">วันที่รับคดี :&nbsp;</td>
								<td><input name="" type="text" size="10"  class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.case_date2}"  /> เวลา
								  <input name="" type="text" size="7"  class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.case_time}" /></td>
							  </tr>
							  <tr>
								<td align="right" >ชื่อผู้พิสูจน์ : </td>
								<td >
									<input type="Text" id="staff_name_prove" name="staff_name_prove" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${staff_name_prove}" class="textview" size="29" />
                                    <input type="hidden" id="staff_idcardno_prove" name="staff_idcardno_prove"  value="${staff_idcardno_prove}" />
            						<img id="imgStaff_name_prove" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_prove&id=staff_idcardno_prove&posname=staff_prove_posname&poscode=staff_prove_poscode&offcode=staff_prove_offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" /> 
            						<font style="color:red">*</font> 
								</td>
								<td align="right">ตำแหน่ง(กรณีปฏิบัติราชการแทน) :&nbsp;</td>
								<td>
									<input id="replace_position" name="replace_position" type="text" size="25"  class="textbox" value="${aap.replace_position}" />
								</td>
							  </tr>
							  <tr>
								<td align="right" >ตำแหน่ง : </td>
								<td >
                                    <input type="text" id="staff_prove_posname" name="staff_prove_posname" size="33"  class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"  value="${staff_prove_posname}" >
									<input type="hidden" id="staff_prove_poscode" name="staff_prove_poscode" size="33"  class="textview" value="${staff_prove_poscode}" >
									<input type="hidden" id="staff_prove_offcode" name="staff_prove_offcode" size="33"  class="textview" value="${staff_prove_offcode}" >
								</td>
								<td align="right">มูลค่าภาษี :&nbsp;</td>
								<td>
									<input id="tax_value" name="tax_value" type="text" size="10"  class="textNum"  value="${aap.tax_value}" onkeypress="ChkMinusDbl(this);"
									/> บาท
								</td>
							  </tr>

							  <tr >
									<td   colspan="4">&nbsp;</td>
							  </tr>
							  <tr >
									<td  class="bgRowGray" colspan="4"><strong>1. รายการบัญชีสิ่งของ</strong></td>
							  </tr>
							  <tr >
									<td  colspan="4">
										<!-- =========================================================สิ่งของ======================================================================================  -->

<script>
var dumaxrow=1; // jsp  Count  config
var dustartrow=2;
var dueditrow = -1;
var dueditna = 0;

function duinsRow(myTable,dumaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,id,text1,text2,text3,text4,text5,data26,data27,data28,isEdit, rows)
{	
	var row;
	var x;

	if(isEdit=="N"){ //กรณีเพิ่มรายการ
		x=document.getElementById(myTable).insertRow(dumaxrow);
		dumaxrow++;
		row = dumaxrow - 1;

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
	}else{  //กรณีแก้ไข
		x=document.getElementById(myTable).rows[rows];
		row = rows;

		var y1=x.cells(0);
		var y2=x.cells(1);
		var y3=x.cells(2);
		var y4=x.cells(3);
		var y5=x.cells(4);
		var y6=x.cells(5);
		var y7=x.cells(6);
		var y8=x.cells(7);
		var y9=x.cells(8);
		var y10=x.cells(9);
		var y11=x.cells(10);
		var y12=x.cells(11);
	}
	
	var exp = new Date();
	var s = exp.getTime();
	
	y1.innerHTML="<input  readonly class='textboxlist' size='1' name='dutc_id' value='" + row + "' />";
	var productDesc = data28;
	if(data5!="")
		productDesc += " ชนิด" + data5;
	if(data7!="")
		productDesc += " ยี่ห้อ " + data7;
	
	<c:if test="${db.chkcaselast == 'Y' || IsEdit == 'N'}">
		//กรณีคดีที่ออกใบเสร็จและนำส่งเงินไปแล้ว ตรวจสอบสิทธิ์ว่าจะสามารถแก้ไขข้อมูลได้หรือไม่
		<c:if test="${IsAddExhibit != 'Y'}" >
			y2.innerHTML="<input type=\"checkbox\" id=\"ducheck_list\" name=\"ducheck_list\" value=\"\" disabled ><input type=\"hidden\" name=\"duref_id\" value=\""+s+"\" />";
			y3.innerHTML=data3;
			y4.innerHTML=productDesc;
		</c:if>
		<c:if test="${IsAddExhibit == 'Y'}" >
			y2.innerHTML="<input type=\"checkbox\" id=\"ducheck_list\" name=\"ducheck_list\" value=\"\"><input type=\"hidden\" name=\"duref_id\" value=\""+s+"\" />";
			y3.innerHTML=data3;
			if (data1=="N"){
				y4.innerHTML="<a class='spanLink' onClick=\"duforedit('"+ s +"');dueditmodal('duTable','"+row+"');durerun_id();\">" +productDesc+  "</a>";
			}else{
				y4.innerHTML= productDesc;
			}
		</c:if>
	</c:if>
	<c:if test="${db.chkcaselast != 'Y' && IsEdit == 'Y'}">
		y2.innerHTML="<input type=\"checkbox\" id=\"ducheck_list\" name=\"ducheck_list\" value=\"\"><input type=\"hidden\" name=\"duref_id\" value=\""+s+"\" />";
		y3.innerHTML=data3;
		if (data1=="N"){
			y4.innerHTML="<a class='spanLink' onClick=\"duforedit('"+ s +"');dueditmodal('duTable','"+row+"');durerun_id();\">" +productDesc+  "</a>";
		}else{
			y4.innerHTML= productDesc;
		}
	</c:if>
	if (data8.substr(0,1)=="O")
		{y5.innerHTML="นอกประเทศ";}
	else if(data8.substr(0,1)=="I")
		{y5.innerHTML="ในประเทศ";}
	else
		{y5.innerHTML="ไม่ระบุ";}
	
	if (data15.substr(0,1)=="1")
		{y6.innerHTML="ยึด";}
	else
		{y6.innerHTML="คืน";}

	if(text2 == "โปรดเลือก")
		text2 = "";
	if(text3 == "โปรดเลือก")
		text3 = "";
	if(text4 == "โปรดเลือก")
		text4 = "";
	
	y7.innerHTML=text1+" "+text2;
	y8.innerHTML=data11+" "+text3;
	y9.innerHTML=data13+" "+text4;
	if (data1=="" || data1=='N')
		{y10.innerHTML="<input type=\"checkbox\" name=\"isdomestichk\" disabled=\"true\"   value=\"\">";}
	else
		{y10.innerHTML="<input type=\"checkbox\" name=\"isdomestichk\" disabled=\"true\" CHECKED value=\"\"><BR/>"+text5;}
	
	y11.innerHTML=data17;
	y12.innerHTML="<input type=\"hidden\" name=\"aae_isexhibitco\" value=\""+data1+"\">"
	+"<input type=\"hidden\" name=\"aae_duty_code\" value=\""+data2+"\">"
	+"<input type=\"hidden\" name=\"aae_duty_name\" value=\""+data3+"\">"
	+"<input type=\"hidden\" name=\"aae_product_code\" value=\""+data4+"\">"
	+"<input type=\"hidden\" name=\"aae_product_name\" value=\""+data5+"\">"
	+"<input type=\"hidden\" name=\"aae_brand_code\" value=\""+data6+"\">"
	+"<input type=\"hidden\" name=\"aae_brand_name\" value=\""+data7+"\">"
	+"<input type=\"hidden\" name=\"aae_isdomestic\" value=\""+data8+"\">"
	+"<input type=\"hidden\" name=\"aae_sizes_code\" value=\""+data9+"\">"
	+"<input type=\"hidden\" name=\"aae_sizes_unit_code\" value=\""+data10+"\">"
	+"<input type=\"hidden\" name=\"aae_qty\" value=\""+data11+"\">"
	+"<input type=\"hidden\" name=\"aae_qty_unit_code\" value=\""+data12+"\">"
	+"<input type=\"hidden\" name=\"aae_netweight\" value=\""+data13+"\">"
	+"<input type=\"hidden\" name=\"aae_netweight_unit_code\" value=\""+data14+"\">"
	+"<input type=\"hidden\" name=\"aae_status\" value=\""+data15+"\">"
	+"<input type=\"hidden\" name=\"aae_exhibit_list\" value=\""+data16+"\">"
	+"<input type=\"hidden\" name=\"aae_exhibit_desc\" value=\""+data17+"\">"
	+"<input type=\"hidden\" name=\"aae_car_no\" value=\""+data18+"\">"
	+"<input type=\"hidden\" name=\"aae_remarks\" value=\""+data19+"\">"
	+"<input type=\"hidden\" name=\"aae_id\" value=\""+id+"\">"
	+"<input type=\"hidden\" name=\"aae_sizes_code_text\" value=\""+text1+"\">"
	+"<input type=\"hidden\" name=\"aae_sizes_unit_code_text\" value=\""+text2+"\">"
	+"<input type=\"hidden\" name=\"aae_qty_unit_code_text\" value=\""+text3+"\">"
	+"<input type=\"hidden\" name=\"aae_netweight_unit_code_text\" value=\""+text4+"\">"
	+"<input type=\"hidden\" name=\"aae_case_id\" value=\""+text5+"\">"
	+"<input type=\"hidden\" name=\"aae_co_id\" value=\""+data26+"\">"
	+"<input type=\"hidden\" name=\"aae_group_id\" value=\""+data27+"\">"
	+"<input type=\"hidden\" name=\"aae_group_name\" value=\""+data28+"\">"
	+data19;
}

function duforedit(row)
{
if (document.dataform.duref_id.length)
{
  for (var i=0; i < document.dataform.duref_id.length; i++)
   {
		if (document.dataform.duref_id[i].value== row)
			{//alert(i+1);
			dueditrow = i+1;}
   }
 }
 else
 {//alert("1");
 dueditrow = 1;}
   }

function dudelRow(myTable)
{
if (dumaxrow>1)
{
var x=document.getElementById(myTable).deleteRow(myTable,dumaxrow-1);
dumaxrow--
}
}

function dualternate(id){
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

function durerun_id()
{
if (!document.dataform.dutc_id.length)
{
document.dataform.dutc_id.value=1;
}
for (var i=0; i < document.dataform.dutc_id.length; i++)
   {
		document.dataform.dutc_id[i].value=i+1;
   }
}

function dudelRown(myTable,Rown)
{
var x=document.getElementById(myTable).deleteRow(Rown);
dumaxrow--
}

function duopenmodal(myTable)
{
var data = window.showModalDialog('process?action=Duty_table_list&cmd=list' , self , 'Width=500px,Height=400px');
	if(data != null){
		duinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],"",data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],"N",null);
	}
}

function dueditmodal(myTable, row)
{
	dueditna= 1;
	var data = window.showModalDialog('process?action=Duty_table_list&cmd=list', self , 'Width=500px,Height=400px');
	if(data != null){
		//dudelRown(myTable,dueditrow);
		duinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],"Y", row);
	}
	dueditna = 0;
	durerun_id();
	writeTranLog('เพิ่มบัญชีสิ่งของ');
}


function duCheck(chk)
{
if(document.dataform.duCheck_ctr.checked==true){
for (i = 0; i < duchk.length; i++)
duchk[i].checked = true ;
}else{

for (i = 0; i < duchk.length; i++)
duchk[i].checked = false ;
}
}

function duget_check_value(myTable)
{
var c_value = "";
var x=dumaxrow;
if (!document.dataform.ducheck_list.length)
{
	document.getElementById(myTable).deleteRow(1);
	dumaxrow--;
	 writeTranLog('ลบรายการบัญชีสิ่งของ');
}
for (var i=0; i < document.dataform.ducheck_list.length; i++)
   {
   if (document.dataform.ducheck_list[i].checked)
      {
     // c_value = c_value + document.dataform.check_list[i].value + "\n";
		document.getElementById(myTable).deleteRow(i+1);
		i--;
		dumaxrow--;
      }
   }
   
   
   if(x!=dumaxrow){
	    writeTranLog('ลบรายการบัญชีสิ่งของ');
	    durerun_id();
	    }
}
   function durender(myTable)
{
 for (i=1;i<=dudata1.length-1;i++)
    {
        duinsRow(myTable,i,dudata1[i],dudata2[i],dudata3[i],dudata4[i],dudata5[i],dudata6[i],dudata7[i],dudata8[i],dudata9[i],dudata10[i],dudata11[i],dudata12[i],dudata13[i],dudata14[i],dudata15[i],dudata16[i],dudata17[i],dudata18[i],dudata19[i],dudata20[i],dudata21[i],dudata22[i],dudata23[i],dudata24[i] ,dudata25[i],dudata26[i],dudata27[i],dudata28[i],"N",null);
    }
}




var dudata1 =new Array();
var dudata2 =new Array();
var dudata3 =new Array();
var dudata4 =new Array();
var dudata5 =new Array();
var dudata6 =new Array();
var dudata7 =new Array();
var dudata8 =new Array();
var dudata9 =new Array();
var dudata10 =new Array();
var dudata11 =new Array();
var dudata12 =new Array();
var dudata13 =new Array();
var dudata14 =new Array();
var dudata15 =new Array();
var dudata16 =new Array();
var dudata17 =new Array();
var dudata18 =new Array();
var dudata19 =new Array();
var dudata20 =new Array();
var dudata21 =new Array();
var dudata22 =new Array();
var dudata23 =new Array();
var dudata24 =new Array();
var dudata25 =new Array();
var dudata26 =new Array();
var dudata27 =new Array();
var dudata28 =new Array();







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
<!-- ====================================================================สิ่งของ===========================================================================  -->
<!-- บัญชีสิ่งของ-->


          
               <table border="0" cellspacing="0" cellpadding="0" >
                    <tr id="likAddExhibit">
                         <td>
                              <span class="spanLink" onClick="duopenmodal('duTable')">เพิ่มใหม่</span> |
                              <span class="spanLink" onClick="duget_check_value('duTable')">ลบรายการที่เลือก</span>
                         </td>
                    </tr>
                    <tr>
                         <td>
                                   <table id="duTable" class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" >
                                        <tr>
                                             <td width="28"  height="15" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                                             <td class="TblHeaderColumn aligncenter"><input name="chkAll" type="checkbox" onClick="allCheck(this,document.dataform.ducheck_list);"/></td>
                                             <td width="68"  class="TblHeaderColumn ">ชนิดสินค้า</td>
                                             <td width="130"  class="TblHeaderColumn ">ชื่อสินค้า</td>
                                             <td width="80"  class="TblHeaderColumn ">ใน / นอก</td>
                                             <td width="80"  class="TblHeaderColumn ">สถานะของกลาง</td>
                                             <td width="80"  class="TblHeaderColumn ">ขนาด</td>
                                             <td width="80"  class="TblHeaderColumn ">จำนวน</td>
                                             <td width="80"  class="TblHeaderColumn ">ปริมาณสุทธิ</td>
                                             <td width="97"  class="TblHeaderColumn ">ของกลางร่วม(เลขที่คดี)</td>
                                             <td width="97"  class="TblHeaderColumn ">รายละเอียด</td>
                                             <td width="97"  class="TblHeaderColumn ">หมายเหตุ</td>
                                     </tr>
                                 <c:forEach items="${aaelist}"  var="aae" varStatus="i">
         						  <script>
									 dudata1[${i.count}] = "${aae.isexhibitco}";
									 dudata2[${i.count}] ="${aae.duty_code}";
									 dudata3[${i.count}]  ="${aae.duty_name}";
									 dudata4[${i.count}] ="${aae.product_code}";
									 dudata5[${i.count}]  ="${aae.product_name}";
									 dudata6[${i.count}]  ="${aae.brand_code}";
									 var vBrandName = "${aae.brand_name}";
									 dudata7[${i.count}]  = vBrandName.replace('"','\"');
									 dudata8[${i.count}]  ="${aae.isdomestic}";
									 dudata9[${i.count}]  ="${aae.sizes_code}";
									 dudata10[${i.count}] ="${aae.size_unit_code}";
									 dudata11[${i.count}] ="${aae.qty}";
									 dudata12[${i.count}] ="${aae.qty_unit_code}";
									 dudata13[${i.count}] ="${aae.netweight}";
									 dudata14[${i.count}] ="${aae.netweight_unit_code}";
									 dudata15[${i.count}] ="${aae.status}";
									 dudata16[${i.count}] ="${aae.exhibit_list}";
									 dudata17[${i.count}] ="${aae.exhibit_desc}";
									 dudata18[${i.count}] ="${aae.car_no}";
									 dudata19[${i.count}] ="${aae.remarks}";
									 dudata20[${i.count}] ="${aae.id}";
									 dudata21[${i.count}] ="${aae.size_desc}";
									 dudata22[${i.count}] ="${aae.size_unit_name}";
									 dudata23[${i.count}] ="${aae.qty_unit_name}";
									 dudata24[${i.count}] ="${aae.netweight_unit_name}";
									 dudata25[${i.count}] ="${aae.case_id}";
									 dudata26[${i.count}] ="${aae.co_id}";
									 dudata27[${i.count}] ="${aae.group_id}";
									 dudata28[${i.count}] ="${aae.group_name}";
								 </script>
								</c:forEach>
                             </table>
                         </td>
                    </tr>
               </table>


          <!-- END บัญชีสิ่งของ-->
									</td>
							  </tr>
							  <tr >
									<td colspan="4">&nbsp;</td>
							  </tr>
							  <tr >
									<td colspan="4"><strong>2. รายงานตรวจพิสูจน์ของกลาง :</strong></td>
							  </tr>
							  <tr>
									<td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<textarea id="report_desc" name="report_desc" cols="70" rows="5" >${aap.report_desc}</textarea>
									</td>
							  </tr>
							  <tr >
									<td colspan="4"><strong>3. คำสั่ง :</strong></td>
							  </tr>
							  <tr>
									<td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<textarea id="order_desc" name="order_desc" cols="70" rows="5" >${aap.order_desc}</textarea>
									</td>
							  </tr>
						  </table>
					  </td>
                    <td width="363" valign="top">&nbsp;</td>
                  </tr>

                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table>
            </form>
	<script>
	durender('duTable');	
 	var frmvalidator  = new Validator("dataform");
  	frmvalidator.addValidation("exhibit_report_no1","req","กรุณากรอกเลขที่การพิสูจน์");
  	frmvalidator.addValidation("exhibit_report_no2","req","กรุณากรอกเลขที่การพิสูจน์");
  	frmvalidator.addValidation("taken_date","req","กรุณากรอกวันที่รับเรื่อง");
  	frmvalidator.addValidation("taken_time","req","กรุณากรอกเวลารับเรื่อง");
   	frmvalidator.addValidation("staff_name_prove","req","กรุณากรอกชื่อผู้พิสูจน์");

   	
   </script>
   
   <c:if test="${db.send_income_case_id != '0' || IsEdit == 'N'}">
   	<script>
   		document.getElementById('exhibit_report_no1').className="textview";
   		document.getElementById('exhibit_report_no1').setAttribute("onKeyPress", "txtKeyPress()");
   		document.getElementById('exhibit_report_no1').setAttribute("onKeyDown", "disableKeyDown()");
//onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
   		document.getElementById('exhibit_report_no2').className="textview";
   		document.getElementById('exhibit_report_no2').setAttribute("onKeyPress", "txtKeyPress()");
   		document.getElementById('exhibit_report_no2').setAttribute("onKeyDown", "disableKeyDown()");
   		
   		document.getElementById('imgTaken_date').className="textview";
   		document.getElementById('imgTaken_date').setAttribute("onKeyPress", "txtKeyPress()");
   		document.getElementById('imgTaken_date').setAttribute("onKeyDown", "disableKeyDown()");
   		
   		document.getElementById('taken_time').className="textview";
   		document.getElementById('taken_time').setAttribute("onKeyPress", "txtKeyPress()");
   		document.getElementById('taken_time').setAttribute("onKeyDown", "disableKeyDown()");
   		
   		document.getElementById('imgStaff_name_prove').style.display='none';
   		document.getElementById('replace_position').className="textview";
   		document.getElementById('replace_position').setAttribute("onKeyPress", "txtKeyPress()");
   		document.getElementById('replace_position').setAttribute("onKeyDown", "disableKeyDown()");

   		document.getElementById('tax_value').className="textview";
   		document.getElementById('tax_value').setAttribute("onKeyPress", "txtKeyPress()");
   		document.getElementById('tax_value').setAttribute("onKeyDown", "disableKeyDown()");
   		
   		<c:if test="${IsAddExhibit != 'Y'}" >
   			document.getElementById('likAddExhibit').style.display='none';
   		</c:if>
   		document.getElementById('report_desc').className="textview";
   		document.getElementById('report_desc').setAttribute("onKeyPress", "txtKeyPress()");
   		document.getElementById('report_desc').setAttribute("onKeyDown", "disableKeyDown()");
   		
   		document.getElementById('order_desc').className="textview";
   		document.getElementById('order_desc').setAttribute("onKeyPress", "txtKeyPress()");
   		document.getElementById('order_desc').setAttribute("onKeyDown", "disableKeyDown()");
   	</script>
   </c:if>
   
   <c:if test="${SaveMsg == '1'}">
   		<script>
   			alert("บันทึกเรียบร้อย");
   		</script>
   </c:if>
