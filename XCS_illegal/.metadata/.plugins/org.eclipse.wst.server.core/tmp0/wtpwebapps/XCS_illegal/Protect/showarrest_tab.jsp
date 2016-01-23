<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript" src="js/datetimepicker_css.js" ></script>

<script type="text/javascript" language="JavaScript">
  	function toggleHidden(mID, btnID){

		document.getElementById('app2_39').style.display='none';
		document.getElementById('lawbreaker_list').style.display='none';
		document.getElementById('arrestTeam').style.display='none';
		document.getElementById('exhibitList').style.display='none';
		document.getElementById('licenseList').style.display='none';
		document.getElementById('2_6Tab').style.display='none';

		document.getElementById('btn2_39').style.background='#D4D0C8';
		document.getElementById('btnLawbreakerList').style.background='#D4D0C8';
		document.getElementById('btnArrestTeam').style.background='#D4D0C8';
		document.getElementById('btnExhibitList').style.background='#D4D0C8';
		document.getElementById('btnLicenseList').style.background='#D4D0C8';
		document.getElementById('btn2_6').style.background='#D4D0C8';

		mnu = document.getElementById(mID);
		btn = document.getElementById(btnID);
		if (mnu.style.display == 'none'){
			mnu.style.display ='';
			btn.style.background='#FFCC33';
		}else{
			mnu.style.display ='none';
		}
	}
</script>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
  <tr>
    <td width="1%">&nbsp;</td>
     <td style="cursor:hand;" width="98%" >
        <input name="btnLawbreakerList" id="btnLawbreakerList" type="button" class="button" value="รายชื่อผู้กระทำผิดกฎหมาย" onClick='toggleHidden("lawbreaker_list","btnLawbreakerList");' style="background:#FFCC33">&nbsp;&nbsp;
        <input name="btn2_39" id="btn2_39" type="button" class="button" value="บันทึกการจับ" onClick='toggleHidden("app2_39", "btn2_39");' >&nbsp;&nbsp;
        <input name="btnArrestTeam" id="btnArrestTeam" type="button" class="button" value="คณะผู้จับกุม" onClick='toggleHidden("arrestTeam","btnArrestTeam");'>&nbsp;&nbsp;
        <input name="btnExhibitList" id="btnExhibitList" type="button" class="button" value="บัญชีสิ่งของ" onClick='toggleHidden("exhibitList","btnExhibitList");'>&nbsp;&nbsp;
        <input name="btnLicenseList" id="btnLicenseList" type="button" class="button" value="ข้อมูลใบอนุญาต/ข้อมูลสืบสวน" onClick='toggleHidden("licenseList","btnLicenseList");'>&nbsp;&nbsp;
		<input name="btn2_6" id="btn2_6" type="button" class="button" value="รายงานบันทึกการจับ 2/6ก" onClick='toggleHidden("2_6Tab","btn2_6");'>
     </td>
     <td width="1%" >&nbsp;

     </td>
  </tr>
  <tr >
     <td>&nbsp;</td>
     <td>
      <!-- ==============================================ผู้กระทำผิด======================================================== -->
<script>
var lawsmaxrow=1; // jsp  Count  config
var lawsstartrow=2;
var lawseditrow = -1;
var lawseditna = 0;

function lawsinsRow(myTable,lawsmaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26,data27,data28,data29,data30,data31,data32,data33,data34,data35,data36)
{
	var row;
	var x=document.getElementById(myTable).insertRow(lawsmaxrow);
	lawsmaxrow++;
	row = lawsmaxrow - 1;
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
	var y13=x.insertCell(12);
	var y14=x.insertCell(13);
	
	var exp = new Date();
	var s = exp.getTime();
	
	y1.innerHTML="<input readonly class='textboxlist' size='1' name='lawstc_id' value='" + row + "' />";
	y2.innerHTML="<input type=\"hidden\" name=\"lawsref_id\" value=\""+s+"\" />";
	y3.innerHTML=data22+data5+" "+data6;
	if (data1="1"){
		y4.innerHTML="คนไทย";
	}else if(data1="2"){
		y4.innerHTML="ชาวต่างชาติ";
	}else{
		y4.innerHTML="ผู้ประกอบการ";
	}
	
	y5.innerHTML=data17;
	y6.innerHTML=data18;
	y7.innerHTML=data2;
	y8.innerHTML=data29;
	y9.innerHTML=data26;
	y10.innerHTML=data27;
	y11.innerHTML=data8+" หมู่ "+data9+" ซอย "+data10+" ถ. "+data11+" ต. "+data25+" อ. "+data24+" จ. "+data23;
	y12.innerHTML=data19;
	y13.innerHTML=data20;
	y14.innerHTML="<input type=\"hidden\" name=\"aal_culprit_type\" value=\""+data1+"\">"
	+"<input type=\"hidden\" name=\"aal_lawbreaker_id_card\" value=\""+data2+"\">"
	+"<input type=\"hidden\" name=\"aal_sex\" value=\""+data3+"\">"
	+"<input type=\"hidden\" name=\"aal_title_code\" value=\""+data4+"\">"
	+"<input type=\"hidden\" name=\"aal_first_name\" value=\""+data5+"\">"
	+"<input type=\"hidden\" name=\"aal_last_name\" value=\""+data6+"\">"
	+"<input type=\"hidden\" name=\"aal_other_name\" value=\""+data7+"\">"
	+"<input type=\"hidden\" name=\"aal_address_no\" value=\""+data8+"\">"
	+"<input type=\"hidden\" name=\"aal_moo\" value=\""+data9+"\">"
	+"<input type=\"hidden\" name=\"aal_soi\" value=\""+data10+"\">"
	+"<input type=\"hidden\" name=\"aal_road\" value=\""+data11+"\">"
	+"<input type=\"hidden\" name=\"aal_province\" value=\""+data12+"\">"
	+"<input type=\"hidden\" name=\"aal_district\" value=\""+data13+"\">"
	+"<input type=\"hidden\" name=\"aal_subdistrict\" value=\""+data14+"\">"
	+"<input type=\"hidden\" name=\"aal_race_id\" value=\""+data15+"\">"
	+"<input type=\"hidden\" name=\"aal_nationality_id\" value=\""+data16+"\">"
	+"<input type=\"hidden\" name=\"aal_career\" value=\""+data17+"\">"
	+"<input type=\"hidden\" name=\"aal_birth_date\" value= \""+data18+ "\" >"
	+"<input type=\"hidden\" name=\"aal_father_name\" value=\""+data19+"\">"
	+"<input type=\"hidden\" name=\"aal_mother_name\" value=\""+data20+"\">"
	+"<input type=\"hidden\" name=\"aal_id\" value=\""+data21+"\">"
	+"<input type=\"hidden\" name=\"aal_title_name\" value=\""+data22+"\">"
	+"<input type=\"hidden\" name=\"aal_province_name\" value=\""+data23+"\">"
	+"<input type=\"hidden\" name=\"aal_district_name\" value=\""+data24+"\">"
	+"<input type=\"hidden\" name=\"aal_subdistrict_name\" value=\""+data25+"\">"
	+"<input type=\"hidden\" name=\"aal_race_id_name\" value=\""+data26+"\">"
	+"<input type=\"hidden\" name=\"aal_nationality_id_name\" value=\""+data27+"\">"
	+"<input type=\"hidden\" name=\"aal_testimony\" value=\""+data28+"\">"
	+"<input type=\"hidden\" name=\"aal_lawbreaker_passport\" value=\""+data29+"\">"
	+"<input type=\"hidden\" name=\"aal_middle_name\" value=\""+data30+"\">"
	+"<input type=\"hidden\" name=\"aal_company_title_code\" value=\""+data31+"\">"
	+"<input type=\"hidden\" name=\"aal_company_name\" value=\""+data32+"\">"
	+"<input type=\"hidden\" name=\"aal_excise_reg_no\" value=\""+data33+"\">"
	+"<input type=\"hidden\" name=\"aal_corporation_code\" value=\""+data34+"\">"
	+"<input type=\"hidden\" name=\"aal_age\" value=\""+data35+"\">"
	+"<input type=\"hidden\" name=\"aal_lawbreaker_no\" value=\""+data36+"\">"
	+"${db.testimony}";
}
</script>
<script>
function lawsforedit(row)
{
if (document.dataform.lawsref_id.length)
{
  for (var i=0; i < document.dataform.lawsref_id.length; i++)
   {
		if (document.dataform.lawsref_id[i].value== row)
			{//alert(i+1);
			lawseditrow = i+1;}
   }
 }
 else
 {//alert("1");
 lawseditrow = 0;}
   }
</script>
<script>
function lawsdelRow(myTable)
{
if (lawsmaxrow>1)
{
var x=document.getElementById(myTable).deleteRow(myTable,lawsmaxrow-1);
lawsmaxrow--
}
}

function lawsalternate(id){
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

function lawsrerun_id()
{
	if (!document.dataform.lawstc_id.length)
	{
		document.dataform.lawstc_id.value=1;
	}
	
	for (var i=0; i < document.dataform.lawstc_id.length; i++)
    {
		document.dataform.lawstc_id[i].value=i+1;
    }
}

function lawsdelRown(myTable,Rown)
{
var x=document.getElementById(myTable).deleteRow(Rown);
lawsmaxrow--
}

</script>
<script>
function lawsopenmodal(myTable)
{
var data = window.showModalDialog('process?action=arrest_lawbreaker&cmd=add' , self , 'Width=500px,Height=500px');
if(data != null){
		lawsinsRow(myTable,lawsmaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[35],data[36]);
	}
}
function lawseditmodal(myTable,p1,p2)
{

	lawseditna= 1;
var data = window.showModalDialog('process?action=arrest_lawbreaker&cmd=add&p1='+p1+'&p2='+p2 , self , 'Width=500px,Height=500px');
if(data != null){


	lawsdelRown(myTable,lawseditrow)

	lawsinsRow(myTable,lawsmaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],data[29],data[30],data[31],data[32],data[33],data[34],data[35],data[36]);

	}
	lawseditna = 0;
}


function lawsCheck(chk)
{
if(document.dataform.lawsCheck_ctr.checked==true){
for (i = 0; i < lawschk.length; i++)
lawschk[i].checked = true ;
}else{

for (i = 0; i < lawschk.length; i++)
lawschk[i].checked = false ;
}
}

function lawsget_check_value(myTable)
{
var c_value = "";
var x="";
if (!document.dataform.lawscheck_list.length)
{
	document.getElementById(myTable).deleteRow(1);
}
for (var i=0; i < document.dataform.lawscheck_list.length; i++)
   {

   if (document.dataform.lawscheck_list[i].checked)
      {
     // c_value = c_value + document.dataform.check_list[i].value + "\n";
		document.getElementById(myTable).deleteRow(i+1);
		i--;
		lawsmaxrow--;
      }
   }
   //alert(lawsmaxrow-1);
   rerun_id();
}
   function lawsrender(myTable)
{
 for (i=1;i<=lawsdata1.length-1;i++)
    {
        lawsinsRow(myTable,i,lawsdata1[i],lawsdata2[i],lawsdata3[i],lawsdata4[i],lawsdata5[i],lawsdata6[i],lawsdata7[i],lawsdata8[i],lawsdata9[i],lawsdata10[i],lawsdata11[i],lawsdata12[i],lawsdata13[i],lawsdata14[i],lawsdata15[i],lawsdata16[i],lawsdata17[i],lawsdata18[i],lawsdata19[i],lawsdata20[i],lawsdata21[i],lawsdata22[i],lawsdata23[i],lawsdata24[i] ,lawsdata25[i],lawsdata26[i],lawsdata27[i],lawsdata28[i],lawsdata29[i],lawsdata30[i],lawsdata31[i],lawsdata32[i],lawsdata33[i],lawsdata34[i],lawsdata35[i],lawsdata36[i]);
    }
}

</script>
<script>


var lawsdata1 =new Array();
var lawsdata2 =new Array();
var lawsdata3 =new Array();
var lawsdata4 =new Array();
var lawsdata5 =new Array();
var lawsdata6 =new Array();
var lawsdata7 =new Array();
var lawsdata8 =new Array();
var lawsdata9 =new Array();
var lawsdata10 =new Array();
var lawsdata11 =new Array();
var lawsdata12 =new Array();
var lawsdata13 =new Array();
var lawsdata14 =new Array();
var lawsdata15 =new Array();
var lawsdata16 =new Array();
var lawsdata17 =new Array();
var lawsdata18 =new Array();
var lawsdata19 =new Array();
var lawsdata20 =new Array();
var lawsdata21 =new Array();
var lawsdata22 =new Array();
var lawsdata23 =new Array();
var lawsdata24 =new Array();
var lawsdata25 =new Array();
var lawsdata26 =new Array();
var lawsdata27 =new Array();
var lawsdata28 =new Array();
var lawsdata29 =new Array();
var lawsdata30 =new Array();//middle name
var lawsdata31 =new Array();//title company code
var lawsdata32 =new Array();//company name
var lawsdata33 =new Array();//aal.excise_reg_no
var lawsdata34 =new Array();//aal.corporation_code
var lawsdata35 = new Array();//text age
var lawsdata36 = new Array(); //lawbreaker_no


</script>
<!-- ==============================================ปิดผู้กระทำผิด======================================================== -->

 <!-- รายชื่อผู้กระทำความผิด-->

          <div class="innerPosition" id="lawbreaker_list" >
               <table  border="0" cellspacing="0" cellpadding="0" >

						<tr>
							 <td>
								</td>
						</tr>

                    <tr>
                         <td>
                                <table id="lawsTable" class="tableList" width="1500" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                                   <tr>
                                     <td class="TblHeaderColumn aligncenter">ลำดับที่</td>
                                     <td class="TblHeaderColumn aligncenter"></td>
                                     <td class="TblHeaderColumn">ชื่อผู้กระทำผิด</td>
                                     <td class="TblHeaderColumn">ประเภทผู้กระทำความผิด</td>
                                     <td class="TblHeaderColumn">อาชีพ</td>
                                     <td class="TblHeaderColumn">อายุ</td>
                                     <td class="TblHeaderColumn">เลขที่บัตรปชช</td>
                                     <td class="TblHeaderColumn">เลขที่หนังสือเดินทาง</td>
                                     <td class="TblHeaderColumn">เชื้อชาติ</td>
                                     <td class="TblHeaderColumn">สัญชาติ</td>
                                     <td class="TblHeaderColumn">ที่อยู่</td>
                                     <td class="TblHeaderColumn">ชื่อบิดา</td>
                                     <td class="TblHeaderColumn">ชื่อมารดา</td>
                                     <td class="TblHeaderColumn">คำให้การของผู้ต้องหา</td>
                                   </tr>
                                   <c:forEach items="${aallist}"  var="aal" varStatus="i">
         						  <script>
									 lawsdata1[${i.count}]  = "${aal.culprit_type}";
									 lawsdata2[${i.count}]  ="${aal.lawbreaker_id_card}";
									 lawsdata3[${i.count}]  ="${aal.sex}";
									 lawsdata4[${i.count}]  ="${aal.title_code}";
									 lawsdata5[${i.count}]  ="${aal.first_name}";
									 lawsdata6[${i.count}]  ="${aal.last_name}";
									 lawsdata7[${i.count}]  ="${aal.other_name}";
									 lawsdata8[${i.count}]  ="${aal.address_no}";
									 lawsdata9[${i.count}]  ="${aal.moo}";
									 lawsdata10[${i.count}] ="${aal.soi}";
									 lawsdata11[${i.count}] ="${aal.road}";
									 lawsdata12[${i.count}] ="${aal.province}";
									 lawsdata13[${i.count}] ="${aal.district}";
									 lawsdata14[${i.count}] ="${aal.subdistrict}";
									 lawsdata15[${i.count}] ="${aal.race_id}";
									 lawsdata16[${i.count}] ="${aal.nationality_id}";
									 lawsdata17[${i.count}] ="${aal.career}";
									 lawsdata18[${i.count}] ="${aal.birth_date}";
									 lawsdata19[${i.count}] ="${aal.father_name}";
									 lawsdata20[${i.count}] ="${aal.mother_name}";
									 lawsdata21[${i.count}] ="${aal.id}";
									 lawsdata22[${i.count}] ="${aal.title_name}";
									 lawsdata23[${i.count}] ="${aal.province_name}";
									 lawsdata24[${i.count}] ="${aal.district_name}";
									 lawsdata25[${i.count}] ="${aal.subdistrict_name}";
									 lawsdata26[${i.count}] ="${aal.race_id_name}";
									 lawsdata27[${i.count}] ="${aal.nationality_id_name}";
									 lawsdata28[${i.count}] ="${db.testimony}";
									 lawsdata29[${i.count}] ="${aal.lawbreaker_passport}";
									 lawsdata30[${i.count}] ="${aal.middle_name}";
									 lawsdata31[${i.count}] ="${aal.company_title_code}";
									 lawsdata32[${i.count}] ="${aal.company_name}";
									 lawsdata33[${i.count}] ="${aal.excise_reg_no}";
									 lawsdata34[${i.count}] ="${aal.corporation_code}";
									 lawsdata35[${i.count}] ="${aal.age}";
									 lawsdata36[${i.count}] ="${aal.lawbreaker_no}";  
								</script>
							</c:forEach>
                                </table>

                         </td>
                    </tr>
               </table>
          </div>
          <!-- END รายชื่อผู้กระทำความผิด-->

          <!-- mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmบันทึกจับกุมmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->





         <div class="innerPosition"  id="app2_39" style="width:750px;display:none">
                 <table border="0" cellspacing="0" cellpadding="0"  width="100%">

                    <tr>
                         <td colspan="2" align="center">
                              <table width="100%">
                                 <tr valign="top">
                                     <td width="155"  align="right">พฤติการณ์ในการจับ :</td>
                                     <td align="left"><textarea onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" name="behaviour" id="behaviour" cols="45" rows="3" class="textareabig"  >${db.behaviour}</textarea></td>
                                     <td align="left">(ส.ส.2/39)</td>
                                </tr>
                                <tr valign="top">
                                     <td  align="right">คำให้การของผู้ต้องหา :</td>
                                     <td align="left"><textarea onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" name="testimony" id="testimony" cols="45" rows="3" class="textareabig"  >${db.testimony}</textarea></td>
                                     <td align="left">&nbsp;</td>
                                </tr>
                                <tr valign="top">
                                     <td   align="right">การแจ้งสิทธิ :</td>
                                     <td align="left"><textarea onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" name="administration" id="administration" cols="45" rows="3" class="textareabig"  >${db.administration}</textarea></td>
                                     <td align="left">&nbsp;</td>
                                </tr>
                                <tr valign="top" style="display:none">
                                     <td   align="right">เวลาที่ตรวจค้นเสร็จ:</td>
                                     <td align="left" ><input name="finished_time" type="text" class="textView" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="5" maxlength="5" value="${db.finished_time}"   ></td>
                                     <td align="left">&nbsp;</td>
                                </tr>
                              </table>
                         </td>
                     </tr>
               </table>
          </div>
          <!--mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm END บันทึกจับกุมmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm -->

          <!--kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk คณะที่เข้าตรวจค้นkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk -->



          <script type="text/javascript">



var aatmaxrow=1; // jsp  Count  config
var aatstartrow=2;
var aateditrow = -1;
var aateditna = 0;

function aatinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12)
{
	var xdata = "<select style='width:100' name=\"aat_duty_status_id\" disabled >"
	<c:forEach items="${dslist}"  var="ds" varStatus="i">
	+"<option value=\"${ds.id}\" <c:if test="${ds.id == 3}"> selected </c:if>  >${ds.status_name}</option>"
	</c:forEach>
	+"</select >"

;

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


var exp = new Date();
var s = exp.getTime();


y1.innerHTML="<input readonly class='textboxlist' size='1' name='aattc_id' value='" + row + "' />";
y2.innerHTML="<input type=\"checkbox\" name=\"aatcheckbox\" value=\"\"><input type=\"hidden\" name=\"aatref_id\" value=\""+s+"\" />";
//y3.innerHTML= data3;
y3.innerHTML= data12+data10+" "+data11;
y4.innerHTML= data4;
y5.innerHTML= data9;
y6.innerHTML= xdata+"<input type=\"hidden\" name=\"aat_id\" value=\""+data1+"\">"
+"<input type=\"hidden\" name=\"aat_staff_no\" value=\""+data2+"\">"
+"<input type=\"hidden\" name=\"aat_inspector_code\" value=\""+data3+"\">"
+"<input type=\"hidden\" name=\"aat_staff_position\" value=\""+data4+"\">"
//+"<input type=\"hidden\" name=\"aat_duty_status_id\" value=\""+data5+"\">"
+"<input type=\"hidden\" name=\"aat_staff_idcardno\" value=\""+data6+"\">"
+"<input type=\"hidden\" name=\"aat_staff_poscode\" value=\""+data7+"\">"
+"<input type=\"hidden\" name=\"aat_staff_offcode\" value=\""+data8+"\">"
+"<input type=\"hidden\" name=\"aat_offname\" value=\""+data9+"\">"
+"<input type=\"hidden\" name=\"aat_first_name\" value=\""+data10+"\">"
+"<input type=\"hidden\" name=\"aat_last_name\" value=\""+data11+"\">"
+"<input type=\"hidden\" name=\"aat_title_name\" value=\""+data12+"\">"
;
if(row == 1){ 
document.dataform.aat_duty_status_id.value = data5;
}else if(row > 1 ){ 
	document.dataform.aat_duty_status_id[row-1].value = data5; }

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
if (!document.dataform.aattc_id.length)
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
</script>
<script>
function aatopenmodal(myTable)
{
var  dup=0;
var data = window.showModalDialog('process?action=Divide_staff_poplist', self , 'dialogWidth=700px,Height=400px');
if(data != null){
	{
		for (var i=0; i < data.length; i++)
		{
			dup=0;
			if (aatmaxrow>1)
			{
				for (var j=0; j < document.dataform.aat_staff_idcardno.length; j++)
				{
					//alert (document.dataform.aat_staff_idcardno[j].value+ "-" +data[i][5]);
					if (document.dataform.aat_staff_idcardno[j].value==data[i][5])
						{dup=1;}
				}
			}
			if (dup==0)
	    	{
	    	aatinsRow(myTable,aatmaxrow,"",data[i][1],data[i][2],data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8],data[i][9],data[i][10],data[i][11]);

	    	}
	    }
	}
	}
}
</script>
<script>

function aatget_check_value(myTable)
{
var c_value = "";
var x="";

for (var i=1; i < document.dataform.aatcheckbox.length; i++)
   {

   if (document.dataform.aatcheckbox[i].checked)
      {
     // c_value = c_value + document.dataform.check_list[i].value + "\n";
		document.getElementById(myTable).deleteRow(i);
		i--;
		aatmaxrow--;
      }
   }
   //alert(aatmaxrow-1);
   aatrerun_id();
}
function aatrender(myTable)
{
 for (i=1;i<=aatdata1.length-1;i++)
    {
        aatinsRow(myTable,i,aatdata1[i],aatdata2[i],aatdata3[i],aatdata4[i],aatdata5[i],aatdata6[i],aatdata7[i],aatdata8[i],aatdata9[i],aatdata10[i],aatdata11[i],aatdata12[i]);
    }
}

</script>
<script>
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


          <div class="innerPosition" id="arrestTeam" style="display:none">
               <table border="0" cellpadding="0" cellspacing="0">
                    <tr>
                         <td>


						</td>
                    </tr>
                    <tr>
                         <td>

                                   <table  id="aatTable" class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                                             <tr>
                                             <td  height="15" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                                             <td class="TblHeaderColumn aligncenter">
                                           </td>
                                             <td  class="TblHeaderColumn ">ชื่อ-สกุล</td>
                                             <td  class="TblHeaderColumn ">ตำแหน่ง</td>
                                             <td  class="TblHeaderColumn ">ชื่อสังกัด</td>
                                             <td  class="TblHeaderColumn ">ในฐานะ</td>
                                          </tr>

                                           <c:forEach items="${aatlist}"  var="aat" varStatus="i">
         						  <script>
									 aatdata1[${i.count}] = "${aat.id}";
									 aatdata2[${i.count}] ="${aat.staff_no}";
									 aatdata3[${i.count}]  ="${aat.inspector_code}";
									 aatdata4[${i.count}] ="${aat.staff_position}";
									 aatdata5[${i.count}]  ="${aat.duty_status_id}";
									 aatdata6[${i.count}]  ="${aat.staff_idcardno}";
									 aatdata7[${i.count}]  ="${aat.staff_poscode}";
									 aatdata8[${i.count}]  ="${aat.staff_offcode}";
									 aatdata9[${i.count}]  ="${aat.offname}";
									 aatdata10[${i.count}] ="${aat.first_name}";
									 aatdata11[${i.count}] ="${aat.last_name}";
									 aatdata12[${i.count}] ="${aat.title_name}";
								</script>
							</c:forEach>

                                        </table>

                              </td>
                         </tr>
               </table>
          </div>
          <!--kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk END คณะที่เข้าตรวจค้นkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk-->

<!-- =========================================================สิ่งของ======================================================================================  -->

<script>
var dumaxrow=1; // jsp  Count  config
var dustartrow=2;
var dueditrow = -1;
var dueditna = 0;

function duinsRow(myTable,dumaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,id,text1,text2,text3,text4,text5,data26,data27,data28, isEdit, rows)
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
		var y13=x.insertCell(12);
		
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
		var y13=x.cells(12);
	}

	
	var exp = new Date();
	var s = exp.getTime();
	
	y1.innerHTML="<input readonly class='textboxlist' size='1' name='dutc_id' value='" + row + "' />";
	y2.innerHTML="<input type=\"checkbox\" name=\"ducheck_list\" value=\"\"><input type=\"hidden\" name=\"duref_id\" value=\""+s+"\" />";
	y3.innerHTML=data3;
	
	var productDesc = data28;
	if(data3 != "")
		productDesc += "ชนิด " + data3;
	if(data7 != "" && data2 != "")
		productDesc += "<br />ยี่ห้อ" +data7
	
	if (data1=="N"){
		<c:if test="${IsEditIndictment == 'Y'}">
			y4.innerHTML="<a class='spanLink' onClick=\"duforedit('"+ s +"');dueditmodal('duTable','"+row+"');durerun_id();\">" +productDesc+  "</a>";
		</c:if>
		<c:if test="${IsEditIndictment != 'Y'}">
			y4.innerHTML= productDesc;
		</c:if>
	}else{
		y4.innerHTML= productDesc;
	}
	
	if (data8.substr(0,1)=="O"){
		y5.innerHTML="ต่างประเทศ";
	}else if(data8.substr(0,1)=="I"){
		y5.innerHTML="ในประเทศ";
	}else
		y5.innerHTML="ไม่ระบุ";
	
	if (data15.substr(0,1)=="1"){
		y6.innerHTML="ยึด";
	}else{
		y6.innerHTML="คืน";
	}

	if(text2 == "โปรดเลือก")
		text2 = "";
	if(text3 == "โปรดเลือก")
		text3 = "";
	if(text4 == "โปรดเลือก")
		text4 = "";
	
	y7.innerHTML=text1+" "+text2;
	y8.innerHTML=data11+" "+text3;
	y9.innerHTML=data13+" "+text4;
	if (data1=="N")
	{y10.innerHTML="<input type=\"checkbox\" name=\"isdomestichk\" disabled=\"true\" value=\"\">";}
	else
	{y10.innerHTML="<input type=\"checkbox\" name=\"isdomestichk\" disabled=\"true\" CHECKED value=\"\"><BR/>"+text5;}
	
	y11.innerHTML=data17;
	y12.innerHTML=data18;
	y13.innerHTML="<input type=\"hidden\" name=\"aae_isexhibitco\" value=\""+data1+"\">"
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
</script>
<script>
function duforedit(row)
{
if (document.dataform.duref_id.length)
{
  for (var i=0; i < document.dataform.duref_id.length; i++)
   {
		if (document.dataform.duref_id[i].value== row)
			{
			dueditrow = i+1;}
   }
 }
 else
 {
 dueditrow = 1;}
   }
</script>
<script>
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
if (dumaxrow == 2){
	document.dataform.dutc_id.value=1;
}else if(dumaxrow > 2){
	for (var i=0; i < document.dataform.dutc_id.length; i++)
	   {
			document.dataform.dutc_id[i].value=i+1;
	   }
	}
}


function dudelRown(myTable,Rown)
{
var x=document.getElementById(myTable).deleteRow(Rown);
dumaxrow--
}

</script>
<script>
function duopenmodal(myTable){

	if(document.dataform.legislation_id.value != ""){
		writeTranLog('เพิ่มบัญชีสิ่งของ');
		var group_id = document.dataform.product_group_id.value;
		var legislation_id = dwr.util.getValue();
		var data = window.showModalDialog('process?action=Duty_table_list&cmd=list&group_id='+group_id+'&legislation_id='+document.dataform.legislation_id.value , self , 'Width=500px,Height=400px');
		if(data != null){
			duinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],"",data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],"N", null);
		}
	}else{
		alert("กรุณาเลือกพระราชบัญญัติ");
		document.dataform.legislation_id.focus();
	}
}
function dueditmodal(myTable, row){
	if(document.dataform.legislation_id.value != ""){
		writeTranLog('แก้ไขรายการบัญชีสิ่งของ');
		dueditna= 1;
		var group_id = document.dataform.product_group_id.value;
		var data = window.showModalDialog('process?action=Duty_table_list&cmd=list&group_id='+group_id +'&legislation_id='+document.dataform.legislation_id.value , self , 'Width=500px,Height=400px');
		if(data != null){
			//dudelRown(myTable,dueditrow);  ไม่มีการลบแถว
			duinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26],data[27],data[28],"Y", row);
		}
		dueditna = 0;
	}else{
		alert("กรุณาเลือกพระราชบัญญัติ");
		document.dataform.legislation_id.focus();
	}
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
	
	if (document.dataform.ducheck_list != null){
		if (dumaxrow == 2 && document.dataform.ducheck_list.checked)
		{
			document.getElementById(myTable).deleteRow(1);
			dumaxrow--;
			writeTranLog('ลบรายการบัญชีสิ่งของ');
		}else{
			for (var i=0; i < document.dataform.ducheck_list.length; i++){
				if (document.dataform.ducheck_list[i].checked){
					document.getElementById(myTable).deleteRow(i+1);
					i--;
					dumaxrow--;
			      }
			   }
		
				if(x!=dumaxrow){
				    writeTranLog('ลบรายการบัญชีสิ่งของ');
				    durender();
			    }
		}
	}
	document.getElementById("aaeChkAll").checked = false;
}

function durender(myTable)
{
 for (i=1;i<=dudata1.length-1;i++)
    {
        duinsRow(myTable,i,dudata1[i],dudata2[i],dudata3[i],dudata4[i],dudata5[i],dudata6[i],dudata7[i],dudata8[i],dudata9[i],dudata10[i],dudata11[i],dudata12[i],dudata13[i],dudata14[i],dudata15[i],dudata16[i],dudata17[i],dudata18[i],dudata19[i],dudata20[i],dudata21[i],dudata22[i],dudata23[i],dudata24[i] ,dudata25[i],dudata26[i],dudata27[i],dudata28[i],"N",null);
    }
}

</script>
<script>


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

<!-- ====================================================================สิ่งของ===========================================================================  -->
<!-- บัญชีสิ่งของ-->

          <div class="innerPosition" id="exhibitList" style="display:none;">
               <table border="0" cellspacing="0" cellpadding="0" >
               		<c:if test="${IsEditIndictment == 'Y'}">
	               		<tr>
	                         <td>
	                              <span class="spanLink" onClick="duopenmodal('duTable')">เพิ่มใหม่</span> |
	                              <span class="spanLink" onClick="duget_check_value('duTable')">ลบรายการที่เลือก</span>
	                         </td>
	                    </tr>
               		</c:if>
                    <tr>
                         <td>
                             <table id="duTable" class="tableList" width="100%" border="0" cellspacing="0" cellpadding="0" >
                                  <tr>
                                       <td width="28"  height="15" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                                       <td width="20" class="TblHeaderColumn AlignCenter">
                                        <c:if test="${IsEditIndictment == 'Y'}">
                                        	<input id="aaeChkAll" name="chkAll" type="checkbox" onClick="allCheck(this,document.dataform.ducheck_list);"/>
                                        </c:if>
                                       </td>
                                       <td width="68"  class="TblHeaderColumn ">ชนิดสินค้า</td>
                                       <td width="130"  class="TblHeaderColumn ">ชื่อสินค้า</td>
                                       <td width="80"  class="TblHeaderColumn ">ใน / นอก</td>
                                       <td width="80"  class="TblHeaderColumn ">สถานะของกลาง</td>
                                       <td width="80"  class="TblHeaderColumn ">ขนาด</td>
                                       <td width="80"  class="TblHeaderColumn ">จำนวน</td>
                                       <td width="80"  class="TblHeaderColumn ">ปริมาณสุทธิ</td>
                                       <td width="97"  class="TblHeaderColumn ">ของกลางร่วม(เลขที่คดี)</td>
                                       <td width="97"  class="TblHeaderColumn ">ดีกรีสุรา</td>
                                       <td width="97"  class="TblHeaderColumn ">ทะเบียนรถ</td>
                                       <td width="97"  class="TblHeaderColumn ">หมายเหตุ(ส่วนพิสูจน์)</td>
                              	  </tr>

	                               <c:forEach items="${aaelist}"  var="aae" varStatus="i">
	         						  <script>
										 dudata1[${i.count}] = "${aae.isexhibitco}";
										 dudata2[${i.count}] ="${aae.duty_code}";
										 dudata3[${i.count}]  ="${aae.duty_name}";
										 dudata4[${i.count}] ="${aae.product_code}";
										 dudata5[${i.count}]  ="${aae.product_name}";
										 dudata6[${i.count}]  ="${aae.brand_code}";
										 dudata7[${i.count}]  ="${aae.brand_name}";
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
          </div>
<!-- END บัญชีสิ่งของ-->

      <!-- ใบอนุญาต/ข้อมูลสืบสวน-->
          <div class="innerPosition" id="licenseList" style="display:none;">
               <table border="0" cellspacing="0" cellpadding="0" >
                   <tr class="bgRowGray">
                      <td ><strong>รายละเอียดใบอนุญาต</strong> </td>
                   </tr>
                    <tr>
                         <td>

                         </td>
                    </tr>
                    <tr>
                     <td>
                        <table name="aliTable" id="aliTable" class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" >
                             <tr  class="TblHeaderColumn">
                                  <td width="5%" >ลำดับ</td>
                                  <td width="5%" ></td>
                                  <td width="15%" >สำนักงาน</td>
                                  <td width="20%" >ชื่อผู้ประกอบการ</td>
                                  <td width="20%" >ชื่อสถานประกอบการ</td>
                                  <td width="15%" >ประเภทใบอนุญาต</td>
                                  <td width="10%" >เล่มที่ใบอนุญาต</td>
                                  <td width="10%" >เลขที่ใบอนุญาต</td>
                             </tr>
<!-- =============================================================ใบอนุญาต==================================================================================  -->
<script type="text/javascript">



var maxrow=1; // jsp  Count  config
var startrow=2;
var editrow = -1;
var editna = 0;

function insRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,id)
{

var row;
var x=document.getElementById(myTable).insertRow(maxrow);
maxrow++;
row = maxrow - 1;
var y1=x.insertCell(0);
var y2=x.insertCell(1);
var y3=x.insertCell(2);
var y4=x.insertCell(3);
var y5=x.insertCell(4);
var y6=x.insertCell(5);
var y7=x.insertCell(6);
var y8=x.insertCell(7);

var exp = new Date();
var s = exp.getTime();

y1.innerHTML="<input readonly class='textboxlist'' size='1' name='tc_id' value='" + row + "' />"+"<input type=\"hidden\" name=\"ali_id\" value=\""+id+"\">";
y2.innerHTML="<input type=\"checkbox\" name=\"check_list\" value=\"\"><input type=\"hidden\" name=\"ref_id\" value=\""+s+"\" />";
y3.innerHTML=data2 ;
y4.innerHTML=data3+"<input type=\"hidden\" id=\"ali_entrepreneur\" name=\"ali_entrepreneur\" value=\""+data3+"\">";
y5.innerHTML=data4+"<input type=\"hidden\" name=\"ali_establishment_name\" value=\""+data4+"\">";
y6.innerHTML=data6+"<input type=\"hidden\" name=\"ali_licensetype_name\" value=\""+data6+"\">"+"<input type=\"hidden\" name=\"ali_license_type\" value=\""+data5+"\">";
y7.innerHTML=data7+"<input type=\"hidden\" name=\"ali_book_no\" value=\""+data7+"\">";
y8.innerHTML=data8+"<input type=\"hidden\" name=\"ali_license_no\" value=\""+data8+"\">"+"<input type=\"hidden\" name=\"ali_iswithdraw\" value=\""+data9+"\">";

}
function foredit(row)
{


if (document.dataform.ref_id.length)
{
  for (var i=0; i < document.dataform.ref_id.length; i++)
   {
		if (document.dataform.ref_id[i].value== row)
			{//alert(i+1);
			editrow = i+1;}
   }
 }
 else
 {//alert("1");

 editrow = 0;}
   }
function delRow(myTable)
{
if (maxrow>1)
{
var x=document.getElementById(myTable).deleteRow(myTable,maxrow-1);
maxrow--
}
}

function alternate(id){
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

function rerun_id()
{
if (!document.dataform.tc_id.length)
{
document.dataform.tc_id.value=1;
}
for (var i=0; i < document.dataform.tc_id.length; i++)
   {
		document.dataform.tc_id[i].value=i+1;
   }
}

function delRown(myTable,Rown)
{
var x=document.getElementById(myTable).deleteRow(Rown);
maxrow--
}
function openmodal(myTable)
{

var data = window.showModalDialog('process?action=Arrest_license' , self , 'Width=500px,Height=400px');
if(data != null){

	insRow(myTable,maxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]);

	}
}
function editmodal(myTable)
{

editna = 1;
var data = window.showModalDialog('process?action=Arrest_license', self , 'Width=500px,Height=400px');
if(data != null){
	delRown(myTable,editrow)

	insRow(myTable,maxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10]);

	}
	editna = 0;
}


function Check(chk)
{
if(document.dataform.Check_ctr.checked==true){
for (i = 0; i < chk.length; i++)
chk[i].checked = true ;
}else{

for (i = 0; i < chk.length; i++)
chk[i].checked = false ;
}
}

function get_check_value(myTable)
{
var c_value = "";
var x="";
if (!document.dataform.check_list.length)
{
	document.getElementById(myTable).deleteRow(1);
}
for (var i=0; i < document.dataform.check_list.length; i++)
   {

   if (document.dataform.check_list[i].checked)
      {
     // c_value = c_value + document.dataform.check_list[i].value + "\n";
		document.getElementById(myTable).deleteRow(i+1);
		i--;
		maxrow--;
      }
   }
   //alert(maxrow-1);
   rerun_id();
}
function render(myTable)
{
 for (i=1;i<=cdata1.length-1;i++)
    {
        insRow(myTable,i,cdata1[i],cdata2[i],cdata3[i],cdata4[i],cdata5[i],cdata6[i],cdata7[i],cdata8[i],cdata9[i],cdata10[i]);
    }
}
var cdata1 =new Array();
var cdata2 =new Array();
var cdata3 =new Array();
var cdata4 =new Array();
var cdata5 =new Array();
var cdata6 =new Array();
var cdata7 =new Array();
var cdata8 =new Array();
var cdata9 =new Array();
var cdata10 =new Array();


// End -->
</script>
<!-- =======================================================================ปิดใบอนุญาติ========================================================================  -->


             <c:forEach items="${alilist}"  var="ali" varStatus="i">
           <script>
			cdata1[${i.count}] = "${ali.offcode}" ;
			cdata2[${i.count}] = "${ali.offname}" ;
			cdata3[${i.count}] = "${ali.entrepreneur}" ;
			cdata4[${i.count}] = "${ali.establishment_name}" ;
			cdata5[${i.count}] = "${ali.license_type}";
			cdata6[${i.count}] = "${ali.licensetype_name}" ;
			cdata7[${i.count}] = "${ali.book_no}" ;
			cdata8[${i.count}] = "${ali.license_no}" ;
			cdata9[${i.count}] = "${ali.iswithdraw}" ;
			cdata10[${i.count}] = "${ali.id}" ;
	</script>
			</c:forEach>


                        </table>
                     </td>
                   </tr>
                   <tr >
                      <td >&nbsp; </td>
                   </tr>
                   <tr class="bgRowGray">
                      <td ><strong>รายละเอียดในการสืบสวน</strong> </td>
                   </tr>
                   <tr >
                      <td >&nbsp; </td>
                   </tr>
                   <tr>
                     <td>
                       <table border="0" cellspacing="0" cellpadding="0" width="500">
                         <tr>
                           <td width="30%" align="right">
                             เลขที่การแจ้งความ :&nbsp;
                           </td>
                           <td width="70%">
                              <input type="text" name="notice_no" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="25" value="${db.notice_no}" >
                              <input type="hidden" name="application_notice_arrest_id" value="${db.application_notice_arrest_id}" >
                           </td>
                         </tr>
                         <tr>
                           <td align="right">
                              ชื่อผู้แจ้งเบาะแส :&nbsp;
                           </td>
                           <td>
                              <input type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" name="imform_name" class="textview" size="40" value="${db.inform_name}" >
                           </td>
                         </tr>
                         <tr>
                           <td  align="right">
                             เลขที่หมายค้น :&nbsp;
                           </td>
                           <td >
                             <input type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview" size="25" name="warrant_no" value="${db.warrant_no}">
                             <input type="hidden" class="textview" size="25" id="application_search_warrant_id" name="application_search_warrant_id" value="${db.application_search_warrant_id}">
                           </td>
                         </tr>
                         <tr>
                           <td  align="right">
                             เลขที่ สส.2/27 :&nbsp;
                           </td>
                           <td >
                             <input type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"  name="confirm_no" class="textview" size="25" value="${db.confirm_no}">
                             <input type="hidden" id="application_sincere_confirm_id" name="application_sincere_confirm_id" class="textview" size="25" value="${db.application_sincere_confirm_id}">
                           </td>
                         </tr>
                       </table>
                     </td>
                   </tr>
               </table>
          </div>

          <!--END ใบอนุญาต-->













          <!-- รายงานบันทึกการจับกุม 2/6ก-->
         <div class="innerPosition"  id="2_6Tab" style="width:750px;display:none">
                 <table border="0" cellspacing="0" cellpadding="0"  width="100%">
                      <tr>
                           <td width="50%" valign="top">
                                <table border="0" cellspacing="0" cellpadding="0"  width="100%">
                                     <tr  >
                                          <td height="25" align="right">วันที่บันทึกรายงาน :&nbsp;</td>
                                          <td height="25">
                                                    <input name="arrest_report_date" id="arrest_report_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.arrest_report_date}" />
													  </td>
                                     </tr>
                                     <tr>
                                     	<td>&nbsp;</td>
                                     	<td align="left">ข้อมูลบันทึกการจับ (ส.ส.2/39 ก,ข)</td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">ผู้ครอบครองสถานที่ :&nbsp;</td>
                                          <td >
                                               <input name="owner_name" type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textView" size="31"   value="${db.owner_name}"  >
                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">ชื่อสถานประกอบการ :&nbsp;</td>
                                          <td >
                                               <input name="business_name" type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textView" size="31"  value="${db.business_name}"  >
                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">ชื่อผู้รับรอง :&nbsp;</td>
                                          <td >
                                               <input name="surety_name" type="text" class="textView" size="31"  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.surety_name}">
                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">ซึ่งเป็น :&nbsp;</td>
                                          <td >
                                               <input name="duty" type="text" class="textView" size="31" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.duty}" >
                                          </td>
                                     </tr>
                                     
                                </table>
                           </td>
                           <td  width="50%" valign="top">
                                <table border="0" cellspacing="0" cellpadding="0"  width="100%">
                                     <tr  >
                                          <td height="25" ><input name="guilty" type="checkbox" disabled  <c:if test="${db.guilty == 'Y' }" > checked </c:if> value = 'Y' /> &nbsp;มีความผิด</td>
                                          <td height="25">&nbsp;</td>
                                     </tr>
                                     <tr>
                                     	<td>&nbsp;</td>
                                     	<td align="left">รายงานผลการจับกุมผู้กระทำผิด (ส.ส.2/6 ก)</td>
                                     </tr>
                                     <tr >
                                          <td align="right">รายงานหัวหน้าฝ่ายปราบปราม :&nbsp;</td>
                                          <td >
                                            <input type="text" name="report_to_name" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview" size="31" value="${db.report_to_staff}"  />
                                            <input type="hidden" name="report_to" id="report_to" class="textview" size="31" value="${db.report_to}"  />
                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">รายงานหัวหน้าส่วนปราบปราม :&nbsp;</td>
                                          <td >
                                            <input type="text" name="order_by_name" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview" size="31" value="${db.order_by_staff}">
                                            <input type="hidden" name="order_by" id="order_by" class="textview" size="31" value="${db.order_by}">
                                          </td>
                                     </tr>
                                     <tr  >
                                          <td  align="right">รายงานผู้บังคับบัญชา :&nbsp;</td>
                                          <td >
                                               <input name="leader_position" type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textView" size="31" value="${db.leader_position}">
                                          </td>
                                     </tr>
                                     <tr >
                                          <td  align="right">รายงานผู้อำนวยการสำนักฯ/<br />สส.ภาค/สส.พื้นที่ :&nbsp;</td>
                                          <td >
                                               <input name="director_position" type="text" class="textView" size="31" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.director_position}">
                                          </td>
                                     </tr>
                                </table>
                         </td>
                    </tr>

               </table>
          </div>
          <!-- END รายงานบันทึกการจับกุม-->




     </td>
     <td>&nbsp;</td>
   </tr>
</table>
<script>

var Rows = 0 ;


render('aliTable');
durender('duTable');
lawsrender('lawsTable');
aatrender('aatTable');
</script>