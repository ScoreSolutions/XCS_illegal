
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<%@ page import="java.util.Date" %>
<script>
	function Print(){
		writeTranLog('พิมพ์บันทึกการตรวจพิสูจน์ของกลางจากหน่วยงานภายนอก');
		Reports.ReportUrl(function(data){
			if(data != ""){
				window.open(data + "ReportName=ILL_P039&getTrackNo=${aop.job_no}&vReportType=PDF&time=" + Math.random(), '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}else{
				window.open('process?action=Report&__report=ILL_P039&__formatt=pdf&getTrackNo=${aop.job_no}&time=<%=new java.util.Date().getTime()%>' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');
			}
		});
		
		
	}
</script>
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">บันทึกการตรวจรับของกลางจากหน่วยงานภายนอก</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><hr /></td>
              </tr>
			  <tr>
				<td >&nbsp;</td>
				<td>
					<input name="btnSave"  type="submit" class="barButton" value="บันทึก" >
					<input name="btnCancel"  type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="writeTranLog('ยกเลิกการแก้ไขบันทึกการจับกุม');window.location.href='<c:url value="${action}" />'; " >
					<input name="btnBack"  type="button" class="barButton" value="กลับหน้าค้นหา"  onclick="writeTranLog('กลับหน้าค้นหา');window.location.href='<c:url value="process?action=Outsideprove" />' ">
					<input name="btnPrint"  type="button" class="barButton" value="พิมพ์"
							onClick="Print();" >
				</td>
			  </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><hr /></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td ><table width="787" border="0" cellspacing="0" cellpadding="0" >
                  <tr>
                    <td width="375" align="left" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0" >
                      <tr>
                        <td  height="25" align="right">เลขที่งาน :&nbsp;</td>
                        <td >
							<input type="text" name="job_no" size="28"  class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${aop.job_no}" >
							<input type="hidden" name="aop_id" value="${aop.id}"/>
						</td>
                      </tr>
                      <tr>
                        <td width="42%" height="25" align="right" >เลขที่หนังสือจากหน่วยงานภายนอก :&nbsp;</td>
                        <td width="58%">
							<input type="text" name="ref_doc_no" size="28"  class="text"  value="${aop.ref_doc_no}" >
							<font style="color:red">*</font>
						</td>
                      </tr>
                      <tr>
                        <td  height="25" align="right">หน่วยงานที่ส่งพิสูจน์ :&nbsp;</td>
                        <td >
                             <input type="radio" name="dept_type" id="rdiDivType" <c:if test="${aop.dept_type == 'P'|| aop.dept_type == ''|| aop.dept_type == null}"> checked </c:if> 
                             value="P" onClick="document.dataform.doc_dept_name.value='สถานีตำรวจ';" />สถานีตำรวจ&nbsp;&nbsp;&nbsp;
                             <input type="radio" name="dept_type" id="rdiDivType" <c:if test="${aop.dept_type == 'O' }"> checked </c:if> value="O">หน่วยงานอื่นๆ
                             <font style="color:red">*</font>
                        </td>
                      </tr>
                      <tr>
                        <td  height="25" align="right">ชื่อหน่วยงาน :&nbsp;</td>
                        <td >
							<input type="text" name="doc_dept_name" id="doc_dept_name" size="28"  class="text"   value="${(aop.doc_dept_name != null) ? (aop.doc_dept_name) : 'สถานีตำรวจ'}" >
							<font style="color:red">*</font>
						</td>
                      </tr>
                      <tr>
                        <td  height="25" align="right">เลขที่หนังสือส่งผลการพิสูจน์ :&nbsp;</td>
                        <td >
							<input type="text" name="prove_no" size="28"  class="text"   value="${aop.prove_no}" ><font style="color:red">*</font>

						</td>
                      </tr>
					  <tr>
						<td  align="right">ชื่อผู้พิสูจน์ :&nbsp;</td>
						<td >
							<input type="text" name="staff_id_prove_name" id="staff_id_prove_name" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview" size="30" value="${aop.staff_id_prove_name}">
							<input type="hidden" name="staff_id_prove" id="staff_id_prove"  value="${oaop.staff_id_prove}">
							<input type="hidden"  name="offcode_prove" id="offcode_prove" value="${oaop.offcode_prove}"/>
							<input type="hidden"  name="poscode_prove" id="poscode_prove" value="${oaop.poscode_prove}"/>
							<img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick=
								"window.open('process?action=Divide_staff_pop&formname=staff_id_prove_name&id=staff_id_prove&posname=posname_prove&poscode=poscode_prove&offcode=offcode_prove' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" />&nbsp;<font style="color:red">*</font>

						</td>
					  </tr>
                      </table>
					</td>
                    <td width="408" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr valign="top">
                        <td width="40%" height="25" align="right" >วันที่รับเรื่อง :&nbsp;</td>
                        <td width="60%">
                        	<c:if test="${aop.job_date2 != null}">
							  <input name="job_date" id="job_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${aop.job_date2}"  />
							  <a href="javascript:NewCssCal('job_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>&nbsp;&nbsp;เวลา :&nbsp;
							  <input name="job_time" type="text" class="textbox" size="5" maxlength="5" value="<fmt:formatDate value="${oaop.job_date}" pattern="HH:mm"/>" onkeypress="txtTime_OnKeyPress(this);"/>
							</c:if>
							<c:if test="${aop.job_date2 == null}">
								<input name="job_date" id="job_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="<fmt:formatDate value="<%=new Date() %>" pattern="dd/MM/yyyy" />"  />
							  	<a href="javascript:NewCssCal('job_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>&nbsp;&nbsp;เวลา :&nbsp;
							  	<input name="job_time" type="text" class="textbox" size="5" maxlength="5" value="<fmt:formatDate value="<%=new Date() %>" pattern="HH:mm"/>" onkeypress="txtTime_OnKeyPress(this);"/>
							</c:if>
							<font style="color:red">*</font>
						</td>
                      </tr>
                      <tr>
                        <td height="25" align="right">หนังสือลงวันที่ :&nbsp;</td>
                        <td height="25"><input name="ref_doc_date" id="ref_doc_date" type="text" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${aop.ref_doc_date2}"  />
                          <a href="javascript:NewCssCal('ref_doc_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
						  <font style="color:red">*</font>
						</td>
                      </tr>
                      
                      <tr>
                        <td  height="25" align="right">พ.ร.บ. :&nbsp;</td>
                        <td >
							 <select name="legislation_id" id="legislation_id" style="width:200px;" >
     						<option value="" selected>เลือก</option>
            				<c:forEach items="${ltlist}"  var="ltion">
            				<option value=${ltion.id}  >${ltion.legislation_code} ${ltion.legislation_name}</option>
            				</c:forEach>
   							 </select>
							<font style="color:red">*</font>
						</td>
                      </tr>
                      <tr>
                        <td  height="25" align="right">พื้นที่ :&nbsp;</td>
                        <td >
                             <select name="offcode" id="offcode" style="width:200px;">
                              <option value="" >เลือก</option>
        						<c:forEach items="${edlist}" var="off">
          						<option value="${off.offcode}" <c:if test="${offcodenow==off.offcode}" >selected</c:if> >${off.short_name}</option>
        						</c:forEach>
                             </select>
                             <font style="color:red">*</font>
                        </td>
                      </tr>
                      <tr>
                        <td height="25" align="right">วันที่พิสูจน์ :&nbsp;</td>
                        <td height="25"><input name="prove_date" id="prove_date" type="text" class="textdate" OnKeyPress="window.event.keyCode = 0" value="${aop.prove_date2}"  />
                          <a href="javascript:NewCssCal('prove_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>&nbsp;<font style="color:red">*</font>
						</td>
                      </tr>
					  <tr>
							<td  height="25" align="right" valign="middle">ตำแหน่ง :&nbsp;</td>
							<td >
									<input name="posname_prove" id="posname_prove" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"  size="35" value="${aop.posname_prove}"  />
							</td>
					  </tr>
					  <tr>
							<td align="right">ตำแหน่ง(กรณีปฏิบัติราชการแทน) :&nbsp;</td>
							<td>
								<input name="replace_position" type="text" size="25"  class="textbox"  value="${aop.replace_position}"/>
							</td>
					  </tr>
                      </table></td>
                  </tr>

                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
					<table border="0" cellspacing="0" cellpadding="0"  >
						<tr >
							<td width="10">&nbsp;</td>
							<td class="bgRowGray"><strong>สิ่งที่ส่งตรวจพิสูจน์</strong></td>
						</tr>
						<tr height="1"><td colspan="2">&nbsp;</td></tr>
						<tr>
							<td >&nbsp;</td>
							<td>
                              <span class="spanLink" onClick="duopenmodal('duTable')">เพิ่มใหม่</span> |
                              <span class="spanLink" onClick="duget_check_value('duTable')">ลบรายการที่เลือก</span>

                         </td>
						</tr>
						<tr>
							<td >&nbsp;</td>
							<td>
							
							
<!-- =========================================================สิ่งของ======================================================================================  -->

<script>
var dumaxrow=1; // jsp  Count  config
var dustartrow=2;
var dueditrow = -1;
var dueditna = 0;

function duinsRow(myTable,dumaxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13,data14,data15,data16,data17,data18,data19,data20,data21,data22,data23,data24,data25,data26)
{
var row;
var x=document.getElementById(myTable).insertRow(dumaxrow);
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

var exp = new Date();
var s = exp.getTime();

y1.innerHTML="<input  OnKeyPress='window.event.keyCode = 0' class='textboxlist' size='1' name='dutc_id' value='" + row + "' />";
y2.innerHTML="<input type=\"checkbox\" name=\"ducheck_list\" value=\"\"><input type=\"hidden\" name=\"duref_id\" value=\""+s+"\" />";

var productDesc = "<a class='spanLink' onClick=\"duforedit('"+ s +"');dueditmodal('duTable');durerun_id();\">";

if(data12 != "")
	productDesc += data12;
else
	productDesc += data24;
	
if(data13 != "")
	productDesc += " ยี่ห้อ "+data13;

productDesc +="</a>";

y3.innerHTML=productDesc;
y4.innerHTML=data6+" "+data16;
y5.innerHTML=data14+" "+data17;
y6.innerHTML=data8+" "+data15;
y7.innerHTML=data10;
y8.innerHTML="<input type=\"hidden\" name=\"api_id\" value=\""+data1+"\">"+
"<input type=\"hidden\" name=\"api_product_code\" value=\""+data2+"\">"+
"<input type=\"hidden\" name=\"api_brand_code\" value=\""+data3+"\">"+
"<input type=\"hidden\" name=\"api_sizes_code\" value=\""+data4+"\">"+
"<input type=\"hidden\" name=\"api_unit_size\" value=\""+data5+"\">"+
"<input type=\"hidden\" name=\"api_qty\" value=\""+data6+"\">"+
"<input type=\"hidden\" name=\"api_unit_qty\" value=\""+data7+"\">"+
"<input type=\"hidden\" name=\"api_netweight\" value=\""+data8+"\">"+
"<input type=\"hidden\" name=\"api_unit_netweight\" value=\""+data9+"\">"+
"<input type=\"hidden\" name=\"api_description\" value=\""+data10+"\">"+
"<input type=\"hidden\" name=\"api_remarks\" value=\""+data11+"\">"+
"<input type=\"hidden\" name=\"api_product_name\" value=\""+data12+"\">"+
"<input type=\"hidden\" name=\"api_brand_name\" value=\""+data13+"\">"+
"<input type=\"hidden\" name=\"api_size_desc\" value=\""+data14+"\">"+
"<input type=\"hidden\" name=\"api_unit_wnet_name\" value=\""+data15+"\">"+
"<input type=\"hidden\" name=\"api_unit_qty_name\" value=\""+data16+"\">"+
"<input type=\"hidden\" name=\"api_unit_size_name\" value=\""+data17+"\">"+
"<input type=\"hidden\" name=\"api_duty_code\" value=\""+data18+"\">"+
"<input type=\"hidden\" name=\"api_brand_second_code\" value=\""+data19+"\">"+
"<input type=\"hidden\" name=\"api_brand_second_name\" value=\""+data20+"\">"+
"<input type=\"hidden\" name=\"api_model_code\" value=\""+data21+"\">"+
"<input type=\"hidden\" name=\"api_model_name\" value=\""+data22+"\">"+
"<input type=\"hidden\" name=\"api_group_id\" value=\""+data23+"\">"+
"<input type=\"hidden\" name=\"api_group_name\" value=\""+data24+"\">"+
data11;
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
			{//alert(i+1);
			dueditrow = i+1;}
   }
 }
 else
 {//alert("1");
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

</script>
<script>
function duopenmodal(myTable)
{
var data = window.showModalDialog('process?action=Ope' , self , 'Width=500px,Height=400px');
if(data != null){
	
	duinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26]);
	writeTranLog('เพิ่มรายการสินค้า');	
	}
}
function dueditmodal(myTable)
{
	dueditna= 1;
var data = window.showModalDialog('process?action=Ope', self , 'Width=500px,Height=400px');
if(data != null){


	dudelRown(myTable,dueditrow);

	duinsRow(myTable,dumaxrow,data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],data[24],data[25],data[26]);

	}
	
	dueditna = 0;
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
if (dumaxrow == 2 && document.dataform.ducheck_list.checked)
{
	document.getElementById(myTable).deleteRow(1);
	dumaxrow--;
	writeTranLog('ลบรายการสินค้า');
}else{
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
    writeTranLog('ลบรายการสินค้า');
    durerun_id();
    }

}
   //alert(dumaxrow-1);
 
}
   function durender(myTable)
{
 for (i=1;i<=dudata1.length-1;i++)
    {
        duinsRow(myTable,i,dudata1[i],dudata2[i],dudata3[i],dudata4[i],dudata5[i],dudata6[i],dudata7[i],dudata8[i],dudata9[i],dudata10[i],dudata11[i],dudata12[i],dudata13[i],dudata14[i],dudata15[i],dudata16[i],dudata17[i],dudata18[i],dudata19[i],dudata20[i],dudata21[i],dudata22[i],dudata23[i],dudata24[i] ,dudata25[i],dudata26[i]);
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
							
                                      <table id="duTable" class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" >
                                         <tr>
                                            <td width="30"  height="15" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                                            <td width="20" class="TblHeaderColumn AlignCenter"><input name="chkAll" type="checkbox" onClick="allCheck(this,document.dataform.ducheck_list);" /></td>
                                            <td width="310"  class="TblHeaderColumn ">ชื่อสินค้า</td>
                                            <td width="80"  class="TblHeaderColumn ">จำนวน</td>
                                            <td width="80"  class="TblHeaderColumn ">ขนาดบรรจุ</td>
                                            <td width="80"  class="TblHeaderColumn ">ปริมาณสุทธิ</td>
                                            <td width="200"  class="TblHeaderColumn ">รายละเอียด</td>
                                            <td width="200"  class="TblHeaderColumn ">หมายเหตุ</td>
                                        </tr>
                                        
                                        
                                          <c:forEach items="${aaelist}"  var="aae" varStatus="i">
         						  <script>
									 dudata1[${i.count}] = "${aae.id}";
									 dudata2[${i.count}] ="${aae.product_code}";
									 dudata3[${i.count}]  ="${aae.brand_code}";
									 dudata4[${i.count}] ="${aae.sizes_code}";
									 dudata5[${i.count}]  ="${aae.unit_size}";
									 dudata6[${i.count}]  ="${aae.qty}";
									 dudata7[${i.count}]  ="${aae.unit_qty}";
									 dudata8[${i.count}]  ="${aae.netweight}";
									 dudata9[${i.count}]  ="${aae.unit_netweight}";
									 dudata10[${i.count}] ="${aae.description}";
									 dudata11[${i.count}] ="${aae.remarks}";
									 dudata12[${i.count}] ="${aae.product_name}";
									 dudata13[${i.count}] ="${aae.brand_name}";
									 dudata14[${i.count}] ="${aae.size_desc}";
									 dudata15[${i.count}] ="${aae.unit_wnet_name}";
									 dudata16[${i.count}] ="${aae.unit_qty_name}";
									 dudata17[${i.count}] ="${aae.unit_size_name}";
									 dudata18[${i.count}] = "${aae.duty_code}";
									 dudata19[${i.count}] = "${aae.brand_second}";
									 dudata20[${i.count}] = "${aae.brand_second_name}";
									 dudata21[${i.count}] = "${aae.model_code}";
									 dudata22[${i.count}] = "${aae.model_name}";
									 dudata23[${i.count}] = "${aae.group_id}";
									 dudata24[${i.count}] = "${aae.group_name}";
								</script>
							</c:forEach>
                                        
                                      </table>
							</td>
						</tr>
						<tr><td colspan="2">&nbsp;</td></tr>
					</table>

					<table border="0" cellspacing="0" cellpadding="0"  width="800">
						<tr>
							<td width="25%" align="right" valign="top">วัตถุประสงค์ในการตรวจพิสูจน์ :&nbsp;</td>
							<td width="75%"  >
								<TEXTAREA NAME="prove_objective" ROWS="3" COLS="70">${aop.prove_objective}</TEXTAREA>
							</td>
							<td width="1%" valign="top"><font style="color:red">*</font></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td colspan="2">
								<INPUT TYPE="checkbox" NAME="isreturn" value="Y" <c:if test="${aop.isreturn == 'Y'}"> checked </c:if>>รับของกลางคืนพร้อมผลการตรวจพิสูจน์
							</td>
						</tr>
						<tr>
							<td align="right"  valign="top">ผลการตรวจพิสูจน์ :&nbsp;</td>
							<td >
								<TEXTAREA NAME="prove_result" ROWS="10" COLS="70">${oaop.prove_result}</TEXTAREA>
							</td>
							<td  valign="top"><font style="color:red">*</font></td>
						</tr>
					</table>
				</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>
		  <script type="text/javascript" >
		  durender('duTable');
		  document.dataform.offcode.value="${offcodenow}";
		  document.dataform.legislation_id.value = "${oaop.legislation_id}"  
		  
		  </script>
<c:if test="${SaveMsg=='1'}">
	<script>
		alert("บันทึกเรียบร้อย");
	</script>
</c:if>
		
		
	
	

