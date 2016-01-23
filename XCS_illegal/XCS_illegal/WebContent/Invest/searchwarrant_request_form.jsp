<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<script type="text/javascript" language="JavaScript"
	src="script/Popup.js"></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css">

<script type='text/javascript' src='<c:url value="dwr/interface/SelectRegion.js"/>'></script>
<script type='text/javascript' src='<c:url value="dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="dwr/util.js"/>'></script>
<script type='text/javascript' src='<c:url value="dwr/interface/SearchWarrant.js"/>'></script>
<script type='text/javascript' src='<c:url value="dwr/interface/Reports.js"/>'></script>
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
<script type="text/javascript">
	function chkRadioOnce()
	{
		if (document.getElementById("rdiOnce1").checked==true){
			document.getElementById("onceCourt").disabled=true;
			document.getElementById("wNonApp").style.display='none';
		}else{
			document.getElementById("onceCourt").disabled=false;
			document.getElementById("wNonApp").style.display='';
		}
	}
	function chkRadioConsider()
	{
		if (document.getElementById("rdiConsider1").checked==true){
			document.getElementById("wApprove").style.display='';
			document.getElementById("wNonApprove").style.display='none';
		}else{
			document.getElementById("wApprove").style.display='none';
			document.getElementById("wNonApprove").style.display='';
		}
	}
	
	function chkbox(search_check1_3){
		if (search_check1_3.checked){
			
			document.getElementById("App").style.display='';
			
		}else if(!search_check1_3.checked){
		
			document.getElementById("App").style.display='none';
			
		}
	}

	function removeElement(divNum) {
	  var d = document.getElementById('myDiv');
	  var olddiv = document.getElementById(divNum);
	  d.removeChild(olddiv);
	}

	function addRow(value,empid)
{ /* A quick example on how to <strong class="highlight">add</strong> and delete <strong class="highlight">table</strong> rows. Enjoy coding! */

  var _table = opener.document.getElementById('coemp').insertRow();
  var cell0 = _table.insertCell(0);
  var cell1 = _table.insertCell(1);
  var cell1 = _table.insertCell(2);
  cell0.innerHTML = value + '<input type=\"hidden\" name=\"coempid\" value=\"'+empid+'\">';
  cell1.innerHTML = 'เจ้าหน้าที่';
  cell1.innerHTML = '<a href=\"#\" onclick=\"removeRow(this)\">ลบรายการ</a>';
}
function removeRow(rows)
{ var _row = rows.parentElement.parentElement;
  document.getElementById('coemp').deleteRow(_row.rowIndex);
}

function chkDupRequestNo(){
	var vID = dwr.util.getValue("id");
	var requestNo = dwr.util.getValue("request_no");
	var vOffcode = dwr.util.getValue("offcode_request");
	SearchWarrant.chkDupReqNo(vID, requestNo, vOffcode, function(data){
		if(data == true){
			alert("เลขที่คำร้องขอหมายค้นซ้ำ");
			document.dataform.request_no.select();
		}
	});
}

function chkDupWarrantNo(){
	var vID = dwr.util.getValue("id");
	var warrantNo = dwr.util.getValue("warrant_no");
	var vCourtID = dwr.util.getValue("court_id");
	SearchWarrant.chkDupWarrantNo(vID, warrantNo, vCourtID, function(data){
		if(data == true){
			alert("เลขที่หมายค้นซ้ำ");
			document.dataform.warrant_no.select();
		}
	});
}

</script>
<!-- Body -->
	<table width="100%" border="0" cellspacing="0"
		cellpadding="0">
		<tr>

			<td width="100%" align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="1%">&nbsp;</td>
					<td width="99%"><span class="websitename">จัดทำหมายค้น</span></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input name="btnSave" type="submit" class="barbutton"
						value="บันทึก" onclick="writeTranLog('บันทึกข้อมูลหมายค้น')"> <input name="btnCancel" type="button"
						class="barbutton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขข้อมูลรายงานการสืบสวน');window.location.href='<c:url value="${action}" />';"> <input
						name="btnBack" type="button" class="barbutton"
						value="กลับหน้าค้นหา"
						onclick="window.location.href='process?action=Warrant';writeTranLog('กลับหน้าค้นหา') ">
					</td>
				</tr>
				<tr <c:if test="${asw.id == null }" >style='display:none'</c:if> >
					<td height="25">&nbsp;</td>
					<td>พิมพ์รายงาน :&nbsp; <select name="cmbPrintReports"
						id="cmbPrintReports" style="width: 250px;">
						<option value="" selected>เลือก</option>
						<option value="ILL_P011">พิมพ์คำร้องขอหมายค้น</option>
						<option value="ILL_P012">พิมพ์รายงานกระบวนการพิจารณา</option>
						<option value="ILL_P013">พิมพ์หมายค้น</option>
					</select> <input type="button" id="btnPrint" name="btnPrint" value="พิมพ์"
						onClick="if(document.dataform.cmbPrintReports.value!=''){printReports(document.dataform.cmbPrintReports.value+'&getTrackNo='+document.dataform.track_no.value)};"></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
					<table width="750" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="30" align="left" bgcolor="#F7F7F7"><strong>คำร้องขอหมายค้น</strong></td>
							<td bgcolor="#F7F7F7">&nbsp;</td>
						</tr>
						<tr>
							<td height="30">&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td width="728">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td height="25" align="right">เลขที่งาน :&nbsp;</td>
									<td><input name="track_no" type="text" class="textview"
										size="30" value="${asw.track_no}" onKeyPress="window.event.keyCode = 0" ></td>
									<td height="25" align="right"></td>
									<td></td>
								</tr>
								<tr>
									<td height="25" align="right">ขอหมายค้นจากศาล :&nbsp;</td>
									<td><select name="court_id" id="court_id" style="width: 180px;">
										<option value=0 selected>เลือก</option>
										<c:forEach items="${clist}" var="court">
											<option value="${court.id}" <c:if test="${court.id == asw.court_id }">  selected </c:if>>${court.court_name}</option>
										</c:forEach>
									</select> <font style="color: red">*</font></td>
									<td height="25" align="right">วันที่ร้องขอ :&nbsp;</td>
									<td colspan="3">
										<c:if test="${asw.request_date != null}">
											<input id="request_date" name="request_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
												value="<fmt:formatDate pattern="dd/MM/yyyy" value="${asw.request_date}" />"  />
										</c:if>
										<c:if test="${asw.request_date == null}">
											<input id="request_date" name="request_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
												value="<fmt:formatDate pattern="dd/MM/yyyy" value="<%=new Date() %>" />"  />
										</c:if>
										<a href="javascript:NewCssCal('request_date','ddmmyyyy')">
											<img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none">
										</a> 
										<font style="color: red">*</font>
								</tr>
								<tr>								
									<td width="20%" height="25" align="right">ชื่อผู้ร้อง :&nbsp;</td>
									<td width="30%">
										<input id="staff_name_request" name="staff_name_request" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="30" value="${staff_name_request}"> 
										<input type="hidden" id="staff_id_request" name="staff_id_request" value="${staff_id_request}" /> 
										<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand"
										onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_request&id=staff_id_request&posname=posname_request&poscode=poscode_request&offname=offname_request&offcode=offcode_request' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />
										<font style="color: red">*</font>
									</td>
									<td width="5%" align="right">ตำแหน่ง :&nbsp;</td>
									<td width="45%">
										<input id="posname_request" name="posname_request" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="30" value="${posname_request}"> 
										<input id="poscode_request" name="poscode_request" type="hidden" value="${poscode_request}">
									</td>
								</tr>
								<tr>
									<td height="25" align="right">สำนักงาน :&nbsp;</td>
									<td>
										<input id="offname_request" name="offname_request" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="30" value="${offname_request}"> 
										<input id="offcode_request" name="offcode_request" type="hidden" value="${offcode_request}" >
									</td>							
						
									<td align="right">อาชีพ :&nbsp;</td>
									<td>
										<input name="career_request" type="text" class="textbox" size="24" value="${career_request}"> 
										<font style="color: red">*</font>
									</td>
								</tr>
								<tr>
									<td height="25" align="right">ที่อยู่สำนักงาน/ที่อยู่อื่นๆ :&nbsp;</td>
									<td colspan="3"><input id="office_address" name="office_address" type="text"
										class="textbox" size="87" value="${asw.office_address}">
										<font style="color: red">*</font>
									</td>
								</tr>
								<tr>
									<td height="25" align="right">อายุ :&nbsp;</td>
									<td><input id="age_request" name="age_request" type="text" class="textNum"
										OnKeyPress="ChkMinusInt(this);" size="5" maxlength="3"
										value="${asw.age_request}">ปี <font style="color: red">*</font>
									</td>
									<td align="right">โทรศัพท์ :&nbsp;</td>
									<td><input name="tel_request" type="text" class="textbox"
										size="24" value="${asw.tel_request}"></td>
								</tr>
								<tr>
									<td height="25" align="right">ออกหมายค้นให้แก่ :&nbsp;</td>
									<td>
										<input id="staff_name_req_for" name="staff_name_req_for" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="30" value="${stList.staff_name_req_for}"> 
										<input id="staff_id_req_for" name="staff_id_req_for" type="hidden" value="${stList.staff_id_req_for}"> 
										<input type=hidden id="offcode_req_for" name="offcode_req_for" value="${stList.offcode_req_for}" >
										<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand"
										onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_req_for&id=staff_id_req_for&posname=posname_req_for&poscode=poscode_req_for&offcode=offcode_req_for' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />
									</td>
									<td width="20%" align="right">ตำแหน่ง :&nbsp;</td>
									<td width="30%">
										<input id="posname_req_for" name="posname_req_for" type="text" class="textview" onKeyPress="window.event.keyCode = 0" size="30" value="${stList.posname_req_for}">
										<input id="poscode_req_for" name="poscode_req_for" type="hidden" class="textview" size="30" value="${stList.poscode_req_for}">
									</td>
								</tr>
								<tr>
									<td align="right">ผู้ร้องมอบหมายให้ :&nbsp;</td>
									<td>
										<input id="staff_name_assign" name="staff_name_assign" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="30" value="${stList.staff_name_assign}">
										<input id="staff_id_assign" name="staff_id_assign" type="hidden" value="${stList.staff_id_assign}"> 
										<input type="hidden" id="offcode_assign" name="offcode_assign" value=${stList.offcode_assign }> 
										<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor: hand"
										onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_assign&id=staff_id_assign&posname=posname_assign&poscode=poscode_assign&offcode=offcode_assign' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />
									</td>
									<td width="20%" align="right">ตำแหน่ง :&nbsp;</td>
									<td width="30%">
										<input id="posname_assign" name="posname_assign" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="30" value="${stList.posname_assign}">
										<input id="poscode_assign" name="poscode_assign" type="hidden" class="textview" size="30" value="${stList.poscode_assign }">
									</td>
								</tr>
								<tr>
									<td height="25" align="right">วันที่เข้าตรวจค้น :&nbsp;</td>
									<td colspan="3">
									<input id="search_datefrom" name="search_datefrom" type="text"
										class="textdate" size="10" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${asw.search_datefrom}" />" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
									<a href="javascript:NewCssCal('search_datefrom','ddmmyyyy')">
									<img src="images/btn_calendar.png" alt="" width="19"
										height="19" align="middle" style="border-style: none"></a> <font
										style="color: red">*</font> &nbsp;&nbsp;ตั้งแต่เวลา <input
										name="search_timefrom" type="text" class="textNum"
										onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);"
										size="10" maxlength="5" value="<fmt:formatDate pattern="HH:mm" value="${asw.search_datefrom}"  />" /> <font
										style="color: red">*</font> นาฬิกา ถึง เวลา <input
										name="search_dateto" type="text" class="textNum"
										onkeypress="txtTime_OnKeyPress(this);" 
										size="10" maxlength="5" value="<fmt:formatDate pattern="HH:mm" value="${asw.search_dateto}" />" /> นาฬิกา</td>
								</tr>
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td colspan="3"><input type="checkbox" id="chk_continue" name="chk_continue"
										value="Y"
										<c:if test="${asw.chk_continue=='Y'}">checked </c:if>>
									ติดต่อกันไปจนกว่าจะเสร็จสิ้นการตรวจค้น</td>
								</tr>
								<tr>
							<td height="30">&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
								
								<tr>
									<td height="25" align="left" valign="middle" bgcolor="#F5F5F5"><strong>&nbsp;&nbsp;&nbsp;ชื่อผู้ร่วมตรวจค้น</strong></td>
									<td colspan="3" bgcolor="#F5F5F5">&nbsp;</td>
								</tr>
								
								  <tr>
                   <td>&nbsp;</td>
  						<td>
                              <span class="spanLink" onClick="aatopenmodal('aatTable')">เพิ่มใหม่</span> |
                              <span class="spanLink" onClick="aatget_check_value('aatTable')">ลบรายการที่เลือก</span>

                         </td>
                  </tr>
                  	<tr>
									<td height="25" align="right" valign="top">ผู้ร่วมตรวจค้น
									:&nbsp;</td>
									            
                       
                       
         
<script type="text/javascript">

var aatmaxrow=1; // jsp  Count  config
var aatstartrow=2;
var aateditrow = -1;
var aateditna = 0;

function aatinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12)
{
	

var row;
var x=document.getElementById(myTable).insertRow(aatmaxrow);
aatmaxrow++;
row = aatmaxrow - 1;
var y1=x.insertCell(0);
var y2=x.insertCell(1);
var y3=x.insertCell(2);
var y4=x.insertCell(3);
var y5=x.insertCell(4);
var y6=x.insertCell(5);
var y7=x.insertCell(6);


var exp = new Date();
var s = exp.getTime();


y1.innerHTML="<input readonly class='textboxlist' size='1' name='aattc_id' value='" + row + "' />";
y2.innerHTML="<input type=\"checkbox\" name=\"aatcheckbox\" value=\"\"><input type=\"hidden\" name=\"aatref_id\" value=\""+s+"\" />";

y3.innerHTML= data9;
y4.innerHTML= data3+
"<input type=\"hidden\" name=\"aswt_id\" value=\""+data1+"\">"
+"<input type=\"hidden\" name=\"aswt_idcard_no\" value=\""+data5+"\">"
+"<input type=\"hidden\" name=\"aswt_poscode\" value=\""+data6+"\">"
+"<input type=\"hidden\" name=\"aswt_offcode\" value=\""+data7+"\">"


}
function aatdelRow(myTable)
{
	if (aatmaxrow>1)
	{
		var x=document.getElementById(myTable).deleteRow(myTable,aatmaxrow-1);
		aatmaxrow--
	}
}

function aatalternate(id){
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

function aatrerun_id()
{
	if (aatmaxrow == 2)
	{
		document.dataform.aattc_id.value=1;
	}
	for (var i=0; i < document.dataform.aattc_id.length; i++)
	{
		document.dataform.aattc_id[i].value=i+1;
	}
}

function aatdelRown(myTable,Rown)
{
	var x=document.getElementById(myTable).deleteRow(Rown);
	aatmaxrow--
}

function aatopenmodal(myTable)
{
	writeTranLog('เพิ่มคณะผู้จับกุม');
	var  dup=0;
	var data = window.showModalDialog('process?action=Divide_staff_poplist', self , 'dialogWidth=700px,Height=400px');
if(data != null){
	{
		for (var i=0; i < data.length; i++)
		{
			//dup=0;
			//if (aatmaxrow>1)
			//{
				//for (var j=0; j < document.dataform.aat_staff_idcardno.length; j++)
				//{
					//alert (document.dataform.aat_staff_idcardno[j].value+ "-" +data[i][5]);
				//	if (document.dataform.aat_staff_idcardno[j].value==data[i][5])
						//{dup=1;}
				//}
			//}
			//if (dup==0)
	    	//{
	    	aatinsRow(myTable,aatmaxrow,"",data[i][2],data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8],data[i][9],data[i][10],data[i][11]);

	    	//}
	    }
	}
	}
}


function aatget_check_value(myTable)
{
var c_value = "";
var x=aatmaxrow;

if(aatmaxrow != 1)
{
		if ( aatmaxrow == 2  )
		{
			if(document.dataform.aatcheckbox.checked)
			{
				document.getElementById(myTable).deleteRow(1);
				aatmaxrow--;
				writeTranLog('ลบรายการคณะผู้จับกุม');
			}
		}else{
		for (var i=0; i < document.dataform.aatcheckbox.length; i++)
   		{

			 if (document.dataform.aatcheckbox[i].checked)
      			{
     
					document.getElementById(myTable).deleteRow(i+1);
					i--;
					aatmaxrow--;
     			 }
   			}
  			
		if(x!=aatmaxrow)
		{
			    writeTranLog('ลบรายการคณะผู้จับกุม');
			    aatrerun_id();
		}
  			
		}
	}
}


function aatrender(myTable)
{
 for (i=1;i<=aatdata1.length-1;i++)
    {
        aatinsRow(myTable,i,aatdata1[i],aatdata2[i],aatdata3[i],aatdata4[i],aatdata5[i],aatdata6[i],aatdata7[i],aatdata8[i],aatdata9[i],aatdata10[i],aatdata11[i],aatdata12[i]);
    }
}


var aatdata1 =new Array();
var aatdata2 =new Array();
var aatdata3 =new Array();
var aatdata4 =new Array();
var aatdata5 =new Array();
var aatdata6 =new Array();
var aatdata7 =new Array();
var aatdata8 =new Array();
var aatdata9 =new Array();
var aatdata10 =new Array();
var aatdata11 =new Array();
var aatdata12 =new Array();


function aatCheck(chkcont,chk)
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
                        <td colspan="3">
                        <table id="aatTable" class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" >
                           <tr class="TblHeaderColumn AlignCenter">
                                <td width="50"bgcolor="#F5F5F5">ลำดับที่</td>
                                <td width="30"bgcolor="#F5F5F5" ><input type="checkbox" name="checkbox" value="checkbox" onClick="allCheck(this,document.dataform.aatcheckbox);"></td>
                                <td width="180"bgcolor="#F5F5F5">ชื่อ-สกุล</td>
                                <td width="300"bgcolor="#F5F5F5">ตำแหน่ง</td>
                           </tr>
                           
                         </table>
                      
                      
                      
                      
                     
                          <c:forEach items="${aatlist}"  var="aat" varStatus="i">
         						  <script>
									 aatdata1[${i.count}] = "${aat.cc_id}";
									 aatdata5[${i.count}]  ="${aat.staff_idcard_no}";
									 aatdata6[${i.count}]  ="${aat.poscode_staff}";
									 aatdata7[${i.count}]  ="${aat.offcode_staff}";
									 aatdata8[${i.count}]  ="${aat.offname}";
									 aatdata3[${i.count}]  ="${aat.posname}";
									 aatdata9[${i.count}] ="${aat.title_name}"+"${aat.first_name}"+ " " +"${aat.last_name}";




								</script>
							</c:forEach>
                   
                   
								</tr>
								<tr>
							<td height="30">&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
<tr>
									<td height="30" align="left" bgcolor="#F7F7F7"><strong>สถานที่ตรวจค้น</strong></td>
									<td colspan="3" bgcolor="#F7F7F7">&nbsp;</td>
								</tr>
								
								<tr>
									<td height="25" align="right">ชื่อเจ้าของบ้าน/&nbsp;<br />
									ผู้ครอบครอง :&nbsp;</td>
									<td><input type="text" name="owner_name" class="textbox"
										size="20" value="${asw.owner_name}"></td>
									<td align="right">อายุ :&nbsp;</td>
									<td><input name="owner_age" type="text" class="textNum"
										OnKeyPress="ChkMinusInt(this);" size="5" maxlength="3"
										value="${asw.owner_age}" />ปี</td>
								</tr>
								<tr>
									<td height="25" align="right">อาชีพ :&nbsp;</td>
									<td><input name="owner_career" type="text" class="textbox"
										size="20" value="${asw.owner_career}" /></td>
									<td align="right">ตำแหน่ง :&nbsp;</td>
									<td><input type="text" name="owner_position"
										class="textbox" value=${asw.owner_position}></td>
								</tr>
								<tr>
									<td height="25" align="right">บ้านเลขที่ :&nbsp;</td>
									<td colspan="3"><input name="address_no" type="text"
										class="textbox" size="4" value=${asw.address_no} >
									&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp; <input name="moo" type="text"
										class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3"
										size="3" value="${asw.moo}">
									&nbsp;&nbsp;อาคาร/สถานที่&nbsp;:&nbsp; <input
										name="address_name" type="text" class="textbox" size="25"
										value="${asw.address_name}"></td>
								</tr>
								<tr>
									<td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
									<td colspan="3"><input name="soi" type="text"
										class="textbox" value="${asw.soi}">&nbsp;&nbsp;ถนน&nbsp;:&nbsp;
									<input name="road" type="text" class="textbox"
										size="25" value=${asw.road}></td>
								</tr>
								<tr>
									<td height="25" align="right">จังหวัด :&nbsp;</td>
									<td><select id='province' name="province_code" style="width:200px" onchange="getDistrict('district','tambol',this.value)"></select></td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right">อำเภอ :&nbsp;</td>
									<td><select id='district'  name="district_code"  style="width:200px" onchange="getTambol('tambol',this.value,'')"></select>	 </td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right">ตำบล :&nbsp;</td>
									<td><select id='tambol' name="subdistrict_code" style="width:200px" ></select></td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>

                  
								

								<tr>
									<td height="75" align="right" valign="top">เหตุหรือพฤติการให้ออกหมายค้น
									:&nbsp;</td>
									<td colspan="3" valign="top"><textarea name="search_cause"
										id="search_cause" cols="40 " rows="4"
										class="textareabig2">${asw.search_cause}</textarea>
									<font style="color: red">*</font></td>
								</tr>

								<tr>
									<td height="25" align="right">ทำการตรวจค้นเพื่อ :&nbsp;</td>
									<td colspan="3"><input type="checkbox" name="req_check1"
										id="checkbox"
										<c:if test="${asw.req_check1=='Y'}" >checked</c:if>  value="Y" >
									พบและยึดสิ่งของซึ่งจะเป็นพยานหลักฐานประกอบการสอบสวน
									ไต่สวนมูลฟ้องหรือพิจารณา</td>
								</tr>
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td colspan="3"><input type="checkbox" name="req_check2"
										id="checkbox2"
										<c:if test="${asw.req_check2=='Y'}" >checked</c:if> value="Y" >
									พบและยึดสิ่งของซึ่งจะเป็นซึ่งเป็นความผิดหรือได้มาโดยผิดกฏหมาย
									หรือได้ใช้หรือตั้งใจจะใช้ในการกระทำความผิด</td>
								</tr>
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td colspan="3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="req_check3"
										id="checkbox3"
										<c:if test="${asw.req_check3=='Y'}" >checked</c:if> value="Y" >
									พบและยึดสิ่งของตามคำพิพากษาหรือคำสั่งศาลตามสำเนาคำพิพากษาหรือคำสั่งที่แนบมาพร้อมนี้</td>
								</tr>
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td colspan="3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="req_check4"
										id="checkbox4"
										<c:if test="${asw.req_check4=='Y'}" >checked</c:if> value="Y" > 
									พบบุคคลที่ถูกหน่วงเหนี่ยวหรือกักขังโดยมิชอบด้วยกฏหมาย</td>
								</tr>
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td colspan="3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="req_check5"
										id="checkbox5"
										<c:if test="${asw.req_check5=='Y'}" >checked</c:if> value="Y" >
									พบบุคคลที่ถูกออกหมายจับตามสำเนาหมายจับที่แนบมาพร้อมนี้</td>
								</tr>
								<tr valign="top">
										<td height="25" align="right">หมายค้นเพื่อ :&nbsp;</td>
										<td colspan="3"><input name="search_check1" type="checkbox" value="Y" <c:if test="${asw.search_check1 =='Y' }"> checked </c:if> >เพื่อพบและยึดสิ่งของ
										ชื่อ/รูปพรรณ <input type="Text" id="notifierProvince"
											name="search_check1_desc" value="${asw.search_check1_desc }"
											class="textbox" /></td>
									</tr>
								<tr valign="top">
								<td height="25" align="right"> </td>
										<td colspan="4">
										<input name="search_check1_1" type="checkbox"
											value="Y"  <c:if test="${asw.search_check1_1 == 'Y' }"> checked </c:if> >ซึ่งจะเป็นพยานหลักฐานประกอบการสอบสวน
										ไต่สวนมูลฟ้องหรือพิจารณา</td>
									</tr>
									<tr valign="top">
									<td height="25" align="right"> </td>
										<td colspan="4">
										<input name="search_check1_2" type="checkbox"
											value="Y" <c:if test="${asw.search_check1_2 == 'Y' }"> checked </c:if> >ซึ่งมีไว้เป็นความผิดหรือได้มาโดยผิดกฏหมาย
										หรือได้ใช้หรือตั้งใจจะใช้ในการกระทำความผิด</td>
									</tr>
									<tr valign="top">
									<td height="25" align="right"> </td>
										<td colspan="4">
										<input name="search_check1_3" type="checkbox"
											 value="Y" <c:if test="${asw.search_check1_3 == 'Y' }"> checked  </c:if>onclick="chkbox(search_check1_3);">ตามคำพิพากษาหรือคำสั่งของศาล
										</td>
									</tr>
								<tbody id="App" style="display: none"> 
									<tr valign="top">
										<td height="25" align="right">&nbsp;</td>
										
										<td colspan="3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="search_check2" type="checkbox" value="Y" <c:if test="${asw.search_check2 == 'Y' }"> checked </c:if>   >เพื่อพบ
										<input type="Text" id="notifierProvince"
											name="search_check2_desc" value="${asw.search_check2_desc }" class="textbox"
										/></td>
										
									</tr>
									
									<tr valign="top">
									<td height="25" align="right"> </td>
									
										<td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<input name="search_check2_1" type="checkbox" value="Y"  <c:if test="${asw.search_check2_1 == 'Y' }"> checked </c:if> >บุคคลที่ถูกหน่วงเหนี่ยวหรือกักขังโดยมิชอบด้วยกฏหมาย
										</td>
									</tr>
									<tr valign="top">
										<td height="25" align="right"> </td><td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<input name="search_check2_2" type="checkbox" value="Y" <c:if test="${asw.search_check2_2 == 'Y' }"> checked </c:if>>บุคคลที่ถูกออกหมายจับ
										ตามหมายจับที่ <input type="Text" id="arrest_no"
											name="arrest_no"  class="textbox" value="${asw.arrest_no}" /> ลงวันที่ <input
											type="Text" id="arrest_date" name="arrest_date" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${asw.arrest_date }"  />"
											class="textdate" size="10" onKeyPress="window.event.keyCode = 0" /> <a
											href="javascript:NewCssCal('arrest_date','ddmmyyyy')">
										<img src="images/btn_calendar.png" alt="" width="19"
											height="19" align="middle" style="border-style: none"></a></td>
									</tr>
									<tr valign="top">
									<td height="25" align="right"> </td>	<td colspan="4">
										ซึ่งออกโดย (ชื่อศาล) <select name="court_id_arrest" id="court_id_arrest"
											style="width: 275px;">
											<option value="" selected>เลือก</option>
											<c:forEach items="${clist}" var="court">
												<option value="${court.id}">${court.court_name}</option>
											</c:forEach>
										</select></td>
									</tr>
									</tbody>
									<tr>
									<td height="25" align="right">ผู้ร้อง :&nbsp;</td>
									<td colspan="3">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td width="3%"><input id="rdiOnce1" name="request_familiar"
												type="radio" value="N" <c:if test="${asw.request_familiar != 'Y' }"> checked </c:if>
												onclick="chkRadioOnce();"></td>
											<td width="7%" align="left">ไม่เคย&nbsp;</td>
											<td width="4%" align="left"><input id="rdiOnce1"
												name="request_familiar" type="radio" value="Y"
												onclick="chkRadioOnce();"  <c:if test="${asw.request_familiar == 'Y' }"> checked </c:if> ></td>
											<td width="3%">เคย</td>
											<td width="15%" align="right">ร้องขอให้ศาล :&nbsp;</td>
											<td width="68%"><select name="court_id_familiar" id="onceCourt"
												style="width: 180px;" disabled>
												<option value="" selected>เลือก</option>
												<c:forEach items="${clist}" var="court">
													<option value="${court.id}" >${court.court_name}</option>
												</c:forEach>
											</select></td>
										</tr>
									</table>
									</td>
								</tr>
								<tbody id="wNonApp" style="display: none">
								<tr>
									<td height="25" align="right">&nbsp;</td>
									
									<td colspan="3">ออกหมายค้นบ้านหรือสถานที่ข้างต้น
									โดยอาศัยเหตุแห่งการร้องขอเดียวกันนี้ หรือเหตุอื่น (ระบุ)</td>
								</tr>
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td colspan="3"><textarea name="cause_familiar"
										id="cause_familiar" cols="45" rows="3" class="textareabig2">${asw.cause_familiar}</textarea></td>
								</tr>
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td colspan="3">และศาลมีคำสั่ง</td>
								</tr>
								
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td colspan="3"><textarea name="court_order_familiar"
										id="textarea2" cols="45" rows="3" class="textareabig2">${asw.court_order_familiar}</textarea></td>
								</tr>
								</tbody>
									<tr>
									<td height="30" colspan="2">&nbsp;</td>
									<td colspan="2">&nbsp;</td>
								</tr>
									
									<tr>
									<td height="30" bgcolor="#F7F7F7" colspan="2"><strong>รายงานเพิ่มเติม</strong>
									</td>
									<td colspan="2" bgcolor="#F7F7F7">&nbsp;</td>
								</tr>
								

								<tr>
									<td height="25" align="right">วันที่พิจารณา :&nbsp;</td>
									<td><input name="consider_date" id="consider_date" type="text"
										class="textdate" size="10" onKeyPress="window.event.keyCode = 0" 
										value="<fmt:formatDate pattern="dd/MM/yyyy" value="${asw.consider_date}"  />" /> <a
											href="javascript:NewCssCal('consider_date','ddmmyyyy')">
										<img src="images/btn_calendar.png" alt="" width="19"
											height="19" align="middle" style="border-style: none"></a>&nbsp; เวลา : <input
										name="consider_time" type="text" class="textNum" 
										size="5" maxlength="5" onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);"  value="<fmt:formatDate pattern="HH:mm" value="${asw.consider_date}" />" /> น.</td>
									<td height="25" align="right">เลขที่คำร้อง :&nbsp;</td>
									<td>
										<input name="request_no" type="text" class="textbox" size="14" value="${asw.request_no}"
										onBlur="chkDupRequestNo()" >  
									</td>
								</tr>
								<tr>
									<td height="25" align="right">สอบพยานจำนวน :&nbsp;</td>
									<td><input name="witness_qty" type="text" class="textNum"
										OnKeyPress="ChkMinusInt(this);" maxlength="3"
										style="width: 40px" value="${asw.witness_qty }"> ปาก</td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right" valign="top">คำสั่งศาล
									:&nbsp;</td>
									<td colspan="3"><textarea name="court_order"
										id="textarea2" rows="4" class="textareabig2">${asw.court_order }</textarea></td>
								</tr>
								<tr>
									<td height="25" colspan="4" align="left">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td width="35%" height="25" align="right">พิจารณาความอาญามาตรา
											69 :&nbsp;</td>
											<td width="65%" height="25"><input type="radio"
												name="isallow" id="radio" value="N"
												<c:if test="${asw.isallow=='N'}"> checked </c:if>
												onClick="javascript:toggleVisibility('boxID');">ไม่อนุญาต
											<input type="radio" name="isallow" id="radio" value="Y"
												onClick="javascript:toggleVisibility('boxID');"
												<c:if test="${asw.isallow=='Y' || asw.isallow == null}"> checked </c:if>>อนุญาต
											</td>
										</tr>
										<tr>
											<td align="right">ให้ส่งบันทึกการตรวจค้นต่อศาลภายใน
											:&nbsp;</td>
											<td><input name="result_qty_date" type="text"
												class="textNum" OnKeyPress="ChkMinusInt(this);"
												maxlength="3" style="width: 40px"
												value="${asw.result_qty_date}"> วัน</td>
										</tr>
									</table>
									</td>
								</tr>
								<tr>
									<td height="25" align="right" valign="top">ถ่ายสำเนา
									:&nbsp;</td>
									<td colspan="3"><textarea name="iscopy" id="textarea"
										rows="3" class="textareabig2">${asw.iscopy}</textarea></td>
								</tr>
								<tr>
									<td height="30" colspan="2">&nbsp;</td>
									<td colspan="2">&nbsp;</td>
								</tr>
								
								<tr>
									<td height="30" bgcolor="#F7F7F7"><strong>ข้อมูลหมายค้น</strong></td>
									<td colspan="3" bgcolor="#F7F7F7">&nbsp;</td>
								</tr>
								
								<tr>
									<td height="25" align="right">ศาลพิจารณา :&nbsp;</td>
									<td colspan="3"><input id="rdiConsider1" name="isapprove"
										type="radio" <c:if test="${asw.isapprove=='Y'}"> checked </c:if>
										onclick="chkRadioConsider();" value='Y'>
									อนุมัติหมายค้น&nbsp;&nbsp; <input id="rdiConsider1"
										name="isapprove" type="radio" onclick="chkRadioConsider();"
										<c:if test="${asw.isapprove=='N'}"> checked </c:if> value='N' >
									ไม่อนุมัติหมายค้น</td>
								</tr>
								<tbody id="wNonApprove" style="display: none">
									<tr>
										<td height="25" align="right">หมายเหตุ :&nbsp;</td>
										<td colspan="3"><TEXTAREA NAME="remarks_nonapprove"
											ROWS="3" class="textareabig2">${asw.remarks_nonapprove}</TEXTAREA></td>
									</tr>
									<tr>
									<td height="30" colspan="2">&nbsp;</td>
									<td colspan="2">&nbsp;</td>
								</tr>
									
								</tbody>
								<tbody id="wApprove">
									<tr>
										<td height="25" align="right">หมายค้นที่ :&nbsp;</td>
										<td>
											<input name="warrant_no" type="text" class="textbox" size="27" value="${asw.warrant_no}" 
											onBlur="chkDupWarrantNo()" >
										</td>
										<td height="25" align="right">วันที่ออกหมาย :&nbsp;</td>
										<td colspan="3"><input id="warrant_date" name="warrant_date" type="text"
											class="textdate" size="10" onKeyPress="window.event.keyCode = 0"
											value="<fmt:formatDate pattern="dd/MM/yyyy" value="${asw.warrant_date}"  />" /> <a
											href="javascript:NewCssCal('warrant_date','ddmmyyyy')">
										<img src="images/btn_calendar.png" alt="" width="19"
											height="19" align="middle" style="border-style: none"></a>
									</tr>
									<tr valign="top">
										<td height="25" align="right">ชื่อผู้พิพากษา :&nbsp;</td>
										<td height="35" align="left"><input type="text"
											name="jedge_name" class="textbox" value=${asw.jedge_name} >&nbsp;</td>
										<td valign="middle"></td>
										<td>&nbsp;</td>
									</tr>
										<tr>
										<td colspan="4">
										<table border="0" cellpadding="0" cellspacing="0" width="100%">
											<tr>
												<td width="40%" align="right" valign="top">เมื่อค้นได้ตามหมายนี้แล้วให้ส่ง
												:&nbsp;</td>
												<td width="60%"><TEXTAREA NAME="send_desc" ROWS="3"
													COLS="50">${asw.send_desc }</TEXTAREA></td>
											</tr>
											<tr>
												<td align="right" valign="top">พร้อมบันทึกการค้นและบัญชีสิ่งของ(ถ้ามี)
												ไปยัง :&nbsp;</td>
												<td><TEXTAREA NAME="send_to_desc" ROWS="3" COLS="50">${asw.send_to_desc }</TEXTAREA></td>
											</tr>
											<tr>
												<td align="right" valign="top">ผลการตรวจค้น :&nbsp;</td>
												<td><textarea name="search_result" id="textarea2"
													cols="50" rows="3">${asw.search_result }</textarea></td>
											</tr>
										</table>
										</td>
										</tbody>
									
									
									
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td>&nbsp;</td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>


								
								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td>&nbsp;</td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								                  
							

								<tr>
									<td height="25" align="right">&nbsp;</td>
									<td colspan="3">&nbsp;</td>
								</tr>
								
								
								
								
							</table>
							</td>
						</tr>

					</table>
					</td>
				</tr>

			</table>
			</td>
		</tr>
	</table>
<script>
chkRadioConsider();
chkRadioOnce();
chkbox(document.dataform.search_check1_3);

document.getElementById("court_id_arrest").value="${asw.court_id_arrest}";
document.getElementById("onceCourt").value="${asw.court_id_familiar}";
getProvince('province','district','tambol','${asw.province_code}','${asw.district_code}','${asw.subdistrict_code}');
aatrender('aatTable');
</script>