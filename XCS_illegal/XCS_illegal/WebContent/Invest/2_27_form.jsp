<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type="text/javascript" src="js/datetimepicker_css.js"></script>
<script type='text/javascript'>
init();
function init(){
	getProvince('province','district','tambol','${asf.province_code}','${asf.district_code}','${asf.subdistrict_code}');
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
function printReportGuarantee(){
	var get = document.getElementById("track_no").value;
	Reports.ReportUrl(function(data){
		if(data != ""){
			window.open(data + 'ReportName=ILL_P015&getTrackNo=' + get + '&vReportType=PDF&time=' + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}else{
			window.open('process?action=Report&__report=ILL_P015&getTrackNo=' + get + '&__formatt=pdf' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
		}
	});
	
	
}
</script>
<!-- Body -->
	<table width="100%" height="100%" border="0" cellspacing="0"
		cellpadding="0">
		<tr>
			<td width="100%" align="left" valign="top">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="1%">&nbsp;</td>
					<td width="99%"><span class="websitename">ใบรับรองความบริสุทธิ์</span></td>
				</tr>

				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
						<input name="btnSave" type="submit" class="barbutton" value="บันทึก"> 
						<input name="btnCancel" type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขข้อมูลใบรับรองความบริสุทธิ์');window.location.href='<c:url value="${action}" />'; " > <input
						name="btnBack" type="button" class="barbutton" value="กลับหน้าค้นหา"
						onclick="writeTranLog('กลับหน้าค้นหา 2');window.location.href='<c:url value="process?action=Guarantee"/>' ">
						<input name="btnBack" type="button" class="barbutton" value="พิมพ์" onClick="printReportGuarantee();" <c:if test="${asf.id == null }">style='display:none'</c:if> >
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>
					<table width="800" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="25" align="right">เขียนที่ :&nbsp;</td>
							<td colspan="3"><input type="text" name="offcode" size="4"
								class="textbox" value="${offcode}"> <img
								src="images/btn_browse.png" width="18" height="19" border="0"
								style="cursor:hand"
								onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');">

							<input type="text" name="offname" size="50" class="textbox"
								value="${offname}"> <font style="color:red">*</font></td>
						</tr>
						<tr>
							<td width="20%" align="right">เลขที่งาน :&nbsp;</td>
							<td width="30%"><input type="text" id="track_no" name="track_no"
								class="textView" value="${asf.track_no}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" /></td>
							<td width="20%" height="25" align="right">วันที่บันทึก
							:&nbsp;</td>
							<td width="30%"><input type="text" name="input_date"
								class="textView" size="20"
								value="<fmt:formatDate pattern="dd/MM/yyyy hh:mm" value="${asf.input_date }"  />" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"/>
							</td>
						</tr>
						<tr>
							<td height="25" align="right">วันที่ตรวจค้น :&nbsp;</td>
							<td><input id="detect_date" name="detect_date" type="text"
								class="textdate"
								value="<fmt:formatDate pattern="dd/MM/yyyy" value="${asf.detect_date }"  />" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"/>
							<a href="javascript:NewCssCal('detect_date','ddmmyyyy')"> <img
								src="images/btn_calendar.png" alt="" width="19" height="19"
								align="middle" style="border-style: none"></a>&nbsp;&nbsp;&nbsp;เวลา&nbsp;:&nbsp;
							<input type="text" name="detect_time" class="textbox"
								style="width:50px" size="5" maxlength="5"  onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);"
								value="<fmt:formatDate pattern="HH:mm" value="${asf.detect_date }"  />" />น.
							<font style="color:red">*</font></td>
							<td height="25" align="right">วันที่รับแจ้งความ :&nbsp;</td>
							<td><input id="notice_date" name="notice_date" type="text"
								class="textdate"
								value="<fmt:formatDate pattern="dd/MM/yyyy" value="${asf.notice_date }"  />" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"/>
							<a href="javascript:NewCssCal('notice_date','ddmmyyyy')"> <img
								src="images/btn_calendar.png" alt="" width="19" height="19"
								align="middle" style="border-style: none"></a>&nbsp;&nbsp;&nbsp;เวลา&nbsp;:&nbsp;
							<input type="text" name="notice_time" class="textbox"
								style="width:50px" size="5" maxlength="5"  onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);"
								value="<fmt:formatDate pattern="HH:mm" value="${asf.notice_date}"  />" />น.</td>
						</tr>
						<tr>
							<td align="right">ผู้ตรวจค้น :&nbsp;</td>
							<td><input type="Text" id="staff_name_detect" name="staff_name_detect" value="${staff_name_detect}" class="textview" size="30" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"/> 
								<input type="hidden" id="staff_idcardno_detect" name="staff_idcardno_detect" value="${staff_idcardno_detect}" /> 
								<input type="hidden" name="offcode_detect" value="${offcode_detect}"> 
								<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
								onClick="window.open('process?action=Divide_staff_pop&formname=staff_name_detect&id=staff_idcardno_detect&posname=posname_detect&poscode=poscode_detect&offcode=offcode_detect' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
								<font style="color:red">*</font></td>
							<td align="right">ตำแหน่ง :&nbsp;</td>
							<td>
								<input type="Text" id="posname_detect" name="posname_detect" class="textview" size="30" value="${posname_detect}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"/> 
								<input type="hidden" id="poscode_detect" name="poscode_detect" value="${poscode_detect}" />
							</td>
						</tr>
						<tr>
							<td height="25" align="right" valign="top">ผู้ร่วมตรวจค้น :&nbsp;</td>
							<td>
                              <span class="spanLink" onClick="aatopenmodal('aatTable')">เพิ่มใหม่</span> |
                              <span class="spanLink" onClick="aatget_check_value('aatTable')">ลบรายการที่เลือก</span>
                         </td>
                  </tr>
                  <tr>
                    <td height="25" align="right" valign="top">&nbsp;</td>
                
                       
                       
                       
         
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
"<input type=\"hidden\" name=\"aii_id\" value=\""+data1+"\">"
+"<input type=\"hidden\" name=\"aii_idcard_no\" value=\""+data5+"\">"
+"<input type=\"hidden\" name=\"aii_poscode\" value=\""+data6+"\">"
+"<input type=\"hidden\" name=\"aii_offcode\" value=\""+data7+"\">"


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
                        <td colspan="6">
                        <table id="aatTable" class="tableList" width="95%" border="0" cellspacing="0" cellpadding="0" >
                           <tr class="TblHeaderColumn AlignCenter">
                                <td width="50">ลำดับที่</td>
                                <td width="30" ><input type="checkbox" name="checkbox" value="checkbox" onClick="allCheck(this,document.dataform.aatcheckbox);"></td>
                                <td width="150">ชื่อ-สกุล</td>
                                <td width="150">ตำแหน่ง</td>
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
									 aatdata9[${i.count}] ="${aat.title_name}"+"${aat.first_name}"+"${aat.last_name}";




								</script>
							</c:forEach>
                   
						</tr>
						<tr>
							<td colspan="4" height="25" align="right">&nbsp;</td>
						</tr>
						<tr>
							<td height="25" align="left" valign="middle" bgcolor="#F5F5F5"
								colspan="4"><strong>&nbsp;&nbsp;&nbsp;สถานที่ทำการตรวจค้น</strong>
							</td>
						</tr>
						<tr>
							<td height="25" colspan="4" align="left" valign="top">
							<table width="696" border="0" cellpadding="0" cellspacing="0">
								<tr>
									<td width="160" height="25" align="right">ละติจูด&nbsp;:&nbsp;</td>
									<td width="536"><input name="coordinate_x" type="text"
										class="textNum" OnKeyPress="ChkMinusDbl(this);" maxlength="5"
										size="7" value="${asf.coordinate_x }">
									&nbsp;&nbsp;ลองติจูด&nbsp;:&nbsp; <input name="coordinate_y"
										type="text" class="textNum" OnKeyPress="ChkMinusDbl(this);"
										maxlength="5" size="7" value="${asf.coordinate_y}"></td>
								</tr>
								<tr>
									<td height="25" align="right">เลขที่ :&nbsp;</td>
									<td><input name="address_no" type="text" class="textbox"
										size="4" value="${asf.address_no }">
									&nbsp;&nbsp;หมู่ที่&nbsp;:&nbsp; <input name="moo" type="text"
										class="textNum" OnKeyPress="ChkMinusInt(this);" maxlength="3"
										size="3" value="${asf.moo }"></td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right" valign="top">อาคาร/สถานที่
									:&nbsp;</td>
									<td><input name="address_name" type="text" class="textbox"
										size="60" value="${asf.address_name }"></td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right">ตรอก/ซอย&nbsp;:&nbsp;</td>
									<td><input name="soi" type="text" class="textbox"
										value="${asf.soi }"> &nbsp;&nbsp;ถนน&nbsp;:&nbsp; <input
										name="road" type="text" class="textbox" size="25"
										value=${asf.road }></td>
								</tr>
								<tr>
									<td height="25" align="right">จังหวัด :&nbsp;</td>
									<td><select id='province' name="province_code" style="width:200px" onchange="getDistrict('district','tambol',this.value)"></select></td>
									<td align="right">&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td height="25" align="right">อำเภอ :&nbsp;</td>
									<td><select id='district'  name="district_code" style="width:200px" onchange="getTambol('tambol',this.value,'')"></select></td>
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
									<td height="30" align="right">รหัสไปรษณีย์&nbsp;:&nbsp;</td>
									<td><input name="zipcode" type="text" class="textNum"
										OnKeyPress="ChkMinusInt(this);" size="10" maxlength="5"
										value="${asf.zipcode}"> &nbsp;&nbsp;&nbsp; โทรศัพท์
									:&nbsp;<input name="tel" type="text" class="textbox"
										size="10" value="${asf.tel}"></td>
								</tr>
								<tr>
									<td height="25" align="right">เจ้าบ้าน / ผู้ดูแลแทนฯ
									:&nbsp;</td>
									<td colspan="3"><input type="text" name="owner_name"
										class="textbox" size="60" value="${asf.owner_name}" /></td>
								</tr>
								<tr>
									<td height="25" align="right">โดย :&nbsp;</td>
									<td colspan="3"><input type="text" name="owner_by"
										class="textbox" size="60" value="${asf.owner_by }" /></td>
								</tr>
							</table>
							</td>
						</tr>
						<tr>
							<td height="25" align="right" valign="top">&nbsp;</td>
							<td colspan="3">&nbsp;</td>
						</tr>
						<tr>
						
						<td colspan="5">
							 <%@include file="../Protect/indictment.jsp" %>
						</td>
						
						
							<td colspan="4" height="25" align="right">&nbsp;</td>
						</tr>

						<tr>
							<td height="25" align="right">ผู้บันทึก :&nbsp;</td>
							<td colspan="3"><strong> <input type="text"
								name="createby" class="textbox" value="${name_create_by}" /> </strong></td>
						</tr>
						<tr>
							<td height="25" align="right">สถานที่จัดเก็บเอกสาร :&nbsp;</td>
							<td colspan="3"><input type="text" name="store_place"
								class="textbox" value="${asf.store_place }" /></td>
						</tr>
						<tr>
							<td height="25" align="right">ผู้จัดเก็บเอกสาร :&nbsp;</td>
							<td colspan="3"><input type="text" name="store_by"
								class="textbox" value="${asf.store_by }" /></td>
						</tr>
						<tr>
							<td height="25" align="right" valign="top">ผลการตรวจค้น
							:&nbsp;</td>
							<td colspan="3"><textarea name="detect_result"
								id="detect_result" rows="5" class="textarea" style="width:520px"> ${asf.detect_result}</textarea></td>
						</tr>
					</table>
					</td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>

			</table>


			</td>
		</tr>
	</table>
<script>
aatrender('aatTable');
</script>