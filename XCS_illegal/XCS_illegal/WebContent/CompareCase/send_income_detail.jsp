

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<script type='text/javascript' src='dwr/interface/Reports.js'></script>
<script type="text/javascript" >
function confirm2(){
	if(SaveClick()==true){
		var answer = confirm ("คุณต้องการนำส่งรายได้");
		if (answer){
			if(document.dataform.onsubmit()){
				writeTranLog('นำส่งเงินไปยังระบบงานรายได้');
				document.dataform.confirm.value = '1';
				document.dataform.submit();
			}
		}
	}
}

function cancelSend(){
	var answer = confirm("ยืนยันการยกเลิกการนำส่งเงินรายได้");
	if(answer){
		if(document.dataform.onsubmit()){
			writeTranLog('ยกเลิกการนำส่งเงินรายได้');
			location.href='<c:url value="/process?action=Sendincome&cmd=cancelSendIncome&id=${db.id}" />';
		}
	}
}

function cancelEdit(){
	
	var answer = confirm("ยืนยันการยกเลิกการแก้ไข");
	if(answer){
		writeTranLog('ยกเลิกการแก้ไขการนำส่งเงินรายได้');
		window.location.href='<c:url value="${action}" />';
	}
}

function backToSearch(){
	var answer = confirm("ยืนยันการกลับไปยังหน้าค้นหา");
	if(answer){
		writeTranLog('กลับหน้าค้นหา');
		window.location.href='<c:url value="process?action=Sendincome" />';
	}
}

function SaveClick(){
	var ret = false;
	
	var sendDate = document.getElementById("send_date").value;
	var dd = sendDate.substring(0,2);
	var mm = sendDate.substring(3,5);
	var yy = sendDate.substring(6,10);

	var dateNow ="<fmt:formatDate pattern="yyyy-MM-dd" value="<%=new Date() %>" />";
	if(yy + "-" + mm + "-" + dd>dateNow){
		alert("ไม่สามารถนำส่งเงินล่วงหน้าได้");
		ret = false;
	}else{
		ret = true;
	}

	return ret;
}
</script>

		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">การนำส่งเงินรายได้</span></td>
              </tr>

              <tr>
                <td>&nbsp;</td>
                <td><input type="hidden" name="confirm" value="${db.status}"/></td>
              </tr>
              <tr >
                <td>&nbsp;</td>
                <td>
					<input name="btnSave" id="btnSave"  type="submit" onClick="return SaveClick();" class="barButton" value="บันทึก"  >
					<input name="btnCancel" id="btnCancel" type="button" class="barButton" value="ยกเลิกการแก้ไข" onclick="cancelEdit();">
					<input name="btnBack" id="btnBack" type="button" class="barButton" value="กลับหน้าค้นหา" onclick="backToSearch();">
					<input name="btnSendIncome" id="btnSendIncome" type="button" class="barButton" value="นำส่งเงิน" style="display:none" onClick="confirm2()">
                    <input name="btnPrint" id="btnPrint" type="button" class="barButton" value="พิมพ์รายงาน"
						Onclick="writeTranLog('พิมพ์รายงาน');printReports('ILL_P037&getsendno='+document.dataform.send_no.value + '&time=<%=new java.util.Date() %>');" />
					<input name="btnCancelSend" id="btnCancelSend" type="button" class="barButton" value="ยกเลิกการส่งเงิน" onclick="cancelSend()" style="display:none" >
				</td>
              </tr>
              <tr><td colspan="2">&nbsp;</td></tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="750" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="24" align="left" valign="top">&nbsp;</td>
                    <td width="100%" align="left" valign="top">
						<table width="750" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<td width="15%" height="25" align="right">เลขที่การส่งเงิน :&nbsp;</td>
							<td width="35%"><input type="text" name="send_no" class="textview" value="${db.send_no}" readonly></td>
							<td width="15%" height="25" align="right">วันที่นำส่งเงิน :&nbsp;</td>
							<td width="35%">
								<c:if test="${db.send_date2 != null}">
									<input name="send_date" id="send_date" type="text" class="textdate" value="${db.send_date2 }" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" />
								</c:if>
								<c:if test="${db.send_date2 == null}">
									<input name="send_date" id="send_date" type="text" class="textdate" value="<fmt:formatDate pattern="dd/MM/yyyy" value="<%=new Date() %>" />" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" />
								</c:if>                 
							 	<a href="javascript:NewCssCal('send_date','ddmmyyyy')"><img id="imgSendDate" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none"  /></a>
							</td>
						  </tr>
						  <tr>
							<td align="right">เลขหนังสือนำส่ง :&nbsp;</td>
							<td>
								<input type="hidden" name="id" value="${db.id}" />
								<input type="text" id="send_doc_no" name="send_doc_no" class="textbox"  size="25" value="${db.send_doc_no }">
								<font style="color:red">*</font>
							</td>
                            <td height="25" align="right">เขียนที่ :&nbsp;</td>
                            <td >
                                  <input type="text" id="offcode_write" name="offcode_write" id="offcode_write" size="4"  class="textbox"   value="${offcode_write}" >
                                  <img id="imgOffcodeWrite" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
             onClick="window.open('process?action=Ed_office_pop&formname=offname_write&formcode=offcode_write' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
                                  <input type="text" name="offname_write" id="offname_write" size="20"  class="textbox"  value="${offname_write}" >
                                  <font style="color:red">*</font>
                            </td>
						  </tr>
						  <tr>
						  	<td align="right" >&nbsp;เรียน :&nbsp;</td>
						  	<td align="left" colspan="3" >
						  		<input type="text" name="posname_lean" id="posname_lean" class="textbox" size="35" value="${db.posname_lean}" >
						  		<font style="color:red">*</font>
						  	</td>
						  </tr>
						  <tr>
							<td  align="right">&nbsp;พ.ร.บ. :&nbsp;</td>
							<td  align="left">
								<select name="legislation_id" id="legislation_id" style="width:240px;" onChange="ChkItemAll();incget_check_value('incTable');">
									<c:forEach items="${ltlist}" var="lg">
										<option value="${lg.id}" <c:if test="${db.legislation_id == lg.id}">selected</c:if> >${lg.legislation_code} ${lg.legislation_name}</option>
									</c:forEach>
								</select>
								<font style="color:red">*</font>
							</td>
                            <td height="25" align="right">พื้นที่ :&nbsp;</td>
                            <td >
                         		<select name="offcode_area" id="offcode_area" style="width:230px;">
                            		<option value="" <c:if test="${db.offcode_area == ''}"> selected </c:if>>เลือก</option>
      								<c:forEach items="${edlist}" var="off">
        								<option value="${off.offcode}" <c:if test="${off.offcode == offcode_area}"> selected </c:if>>${off.short_name}</option>
      								</c:forEach>
                           		</select>
                                <font style="color:red">*</font>
                            </td>
						  </tr>
						  <tr>
							<td height="25" align="right">ชื่อผู้นำส่งเงิน :&nbsp;</td>
							<td height="25">
								<input type="text" name="staff_id_send_name" id="staff_id_send_name" class="textview" size="35" value="${staff_id_send_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
                                <input type="hidden" name="staff_id_send" id="staff_id_send" value="${staff_id_send}"  />
                                <img id="imgStaffSend" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick=
									"window.open('process?action=Divide_staff_pop&formname=staff_id_send_name&id=staff_id_send&posname=posname_send&poscode=poscode_send&offcode=' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
								<font style="color:red">*</font>
							</td>
							<td height="25" align="right">ผู้มีอำนาจลงนาม  :&nbsp;</td>
							<td>
								<input type="text" name="staff_id_approve_name" id="staff_id_approve_name" class="textview" size="35" value="${db.staff_id_approve_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
								<input type="hidden" name="staff_id_approve" id="staff_id_approve" value="${db.staff_id_approve}"  />
								<img id="imgStaffApprove" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand" onClick=
								"window.open('process?action=Divide_staff_pop&formname=staff_id_approve_name&id=staff_id_approve&posname=posname_approve&poscode=poscode_approve&offcode=' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
								<font style="color:red">*</font>
							</td>
						  </tr>
						  <tr>
							<td align="right">ตำแหน่ง :&nbsp;</td>
							<td align="left">
								<input type="text" name="posname_send" id="posname_send" class="textview" size="40" value="${posname_send}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();">
							<input type="hidden" name="poscode_send" id="poscode_send" value="${poscode_send}"  />
							</td>
							<td align="right" height="25" >ตำแหน่ง :&nbsp;</td>
							<td align="left">
								<input type="text" name="posname_approve" id="posname_approve" class="textview" size="40"  value="${db.posname_approve}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" >
							<input type="hidden" name="poscode_approve" id="poscode_approve" value="${db.poscode_approve}"  />
							</td>
						  </tr>

						  <tr>
							<td height="25" align="right">&nbsp;</td>
							<td>&nbsp;</td>
							<td height="25" align="right">&nbsp;</td>
							<td >&nbsp;</td>
						  </tr>
					   </table>
				    </td>
                    <td width="363" valign="top">&nbsp;</td>
                  </tr>
				  <tr id="likAddList">
					<td>&nbsp;</td>
					<td>
						<span class="spanLink" onClick="incopenmodal('incTable');">เพิ่มรายการ</span> |
						<span class="spanLink" onClick="incget_check_value('incTable');">ลบรายการ</span>
					</td>
				  </tr>
                  <tr>

<script type="text/javascript">

function ChkItemAll(){
	var chkItem = document.dataform.inccheckbox;

	if (document.getElementById("inccheckbox"))
		document.getElementById("inccheckbox").checked = true;
	
	if(chkItem != null){
		for (i = 0; i < chkItem.length; i++)
			chkItem[i].checked = true;
	}
}


var incmaxrow=1; // jsp  Count  config
var incstartrow=2;
var inceditrow = -1;
var inceditna = 0;
function caleft(ro){
//alert(ro);
var sub ;

if (!document.dataform.tc_id.length)
{
	 sub = parseFloat(document.dataform.dei_arrest_qty.value)-parseFloat(document.dataform.dei_prove_qty.value);
	 //alert(sub);
	document.dataform.dei_qty.value=sub;
}else{

	for(i = 0; i < document.dataform.dei_arrest_qty.length; i++){
		//alert('test');
		if(document.dataform.incref_id[i].value==ro){
			//alert('--- '+document.dataform.dei_arrest_qty[i].value);
			//alert('--- '+document.dataform.dei_prove_qty[i].value);
			 sub = parseFloat(document.dataform.dei_arrest_qty[i].value)-parseFloat(document.dataform.dei_prove_qty[i].value);
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
var sub = parseFloat(data13)-parseFloat(data14);
y1.innerHTML="<input readonly class='textboxlist' size='1' name='tc_id' value='" + row + "' />";
y2.innerHTML="<input type=\"checkbox\" id=\"inccheckbox\" name=\"inccheckbox\" value=\"\"><input type=\"hidden\" name=\"incref_id\" value=\""+s+"\" />";
y3.innerHTML=data5;
y4.innerHTML=data3;
y5.innerHTML=data7;
y6.innerHTML="<input type=\"text\" size=\"7\" name=\"lawbreaker_qty\" class=\"textViewNum\" readonly value=\""+data18+"\">";
y7.innerHTML=data19;
y8.innerHTML="<input type=\"text\" size=\"10\" name=\"sc_fine_money\" class=\"textViewNum\" readonly value=\""+data12+"\">";
y9.innerHTML="<input type=\"text\" size=\"8\" name=\"sc_birbe_money\" class=\"textViewNum\" readonly value=\""+data14+"\">";
y10.innerHTML="<input type=\"text\" size=\"8\" name=\"sc_reward_money\" class=\"textViewNum\" readonly value=\""+data15+"\">";
y11.innerHTML="<input type=\"text\" size=\"8\" name=\"sc_treasury_money\" class=\"textViewNum\" readonly value=\""+data13+"\">"+

"<input type=\"hidden\" name=\"sc_id\" value=\""+data1+"\">"+
"<input type=\"hidden\" name=\"sc_compare_case_id\" value=\""+data2+"\">"+
"<input type=\"hidden\" name=\"ref_type\" value=\""+data20+"\">";

	calsum();


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
if (incmaxrow==2)
{
document.dataform.tc_id.value=1;
}else{
for (var i=0; i < incmaxrow-1; i++)
   {
		document.dataform.tc_id[i].value=i+1;
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
	writeTranLog('เพิ่มคดีที่เปรียบเทียบปรับ');
	var  dup=0;
	var incdata = window.showModalDialog('process?action=Sendincome_pop&pap='+document.getElementById("legislation_id").value + '&send_offcode=' + document.getElementById("offcode_area").value +'&cmd=list&time=<%=new java.util.Date().getTime()%>' , self , 'dialogWidth=700px,Height=400px');
	if(incdata != null){
		{
			for (var i=0; i < incdata.length; i++)
			{
				var dup = 0;
				if(incmaxrow == 2){   //ถ้า incmaxrow=2 แสดงว่ามีรายการคดีอยู่แล้ว 1 รายการ
					if(document.dataform.sc_compare_case_id.value == incdata[i][2])
						dup = 1;
				}else if(incmaxrow > 2){
					for(var j=0;j<document.dataform.sc_compare_case_id.length;j++){
						if(document.dataform.sc_compare_case_id[j].value == incdata[i][2]){
							dup = 1;
							break;
						}
					}
				}
				if(dup == 0){
			    	incinsRow(myTable,incmaxrow,incdata[i][1],incdata[i][2],incdata[i][3],incdata[i][4],incdata[i][5],incdata[i][6],incdata[i][7],incdata[i][8],incdata[i][9],incdata[i][10],incdata[i][11],incdata[i][12],incdata[i][13],incdata[i][14],incdata[i][15],incdata[i][16],incdata[i][17],incdata[i][18],incdata[i][19],incdata[i][20],incdata[i][21],incdata[i][22],incdata[i][23]);
				}
		    }
		}
	}
}


function incget_check_value(myTable)
{
var c_value = "";
var x=incmaxrow;
	if(document.getElementById("inccheckbox")){
		if (!document.dataform.inccheckbox.length&&document.dataform.inccheckbox.checked){
			document.getElementById(myTable).deleteRow(1);
			incmaxrow--;
			writeTranLog('ลบรายการคดีที่เปรียบเทียบปรับ');
		}else{
			
			for (var i=0; i < incmaxrow-1; i++){
			   if (document.dataform.inccheckbox[i].checked){
					document.getElementById(myTable).deleteRow(i+1);
					i--;
					incmaxrow--;
			   }
			}
		  
		   if(x!=incmaxrow){
			    writeTranLog('ลบรายการคดีที่เปรียบเทียบปรับ');
			    increrun_id();
			    }
		   
		}
		calsum();
	}
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
function calsum(){
	var doc = document.dataform;
	
	var sum1 = 0;
	var sum2 = 0;
	var sum3 = 0;
	var sum4 = 0;
	var sum5 = 0;
	if(incmaxrow>1){
		if(!doc.sc_fine_money[1]){
			sum1 = 	parseFloat(ClearComma(doc.sc_fine_money.value));
			sum2 = 	parseFloat(ClearComma(doc.sc_birbe_money.value));
			sum3 = 	parseFloat(ClearComma(doc.sc_reward_money.value));
			sum4 = 	parseFloat(ClearComma(doc.sc_treasury_money.value));
			sum5 = 	parseFloat(ClearComma(doc.lawbreaker_qty.value));
		}else{
			for (i = 0; i < doc.sc_fine_money.length; i++){
				sum1 = 	parseFloat(ClearComma(doc.sc_fine_money[i].value))+parseFloat(sum1);
				sum2 = 	parseFloat(ClearComma(doc.sc_birbe_money[i].value))+parseFloat(sum2);
				sum3 = 	parseFloat(ClearComma(doc.sc_reward_money[i].value))+parseFloat(sum3);
				sum4 = 	parseFloat(ClearComma(doc.sc_treasury_money[i].value))+parseFloat(sum4);
				sum5 = 	parseFloat(ClearComma(doc.lawbreaker_qty[i].value))+parseFloat(sum5);
			}
		}	
	}
	doc.allfine.value=AddComma(sum1);
	doc.birbe.value=AddComma(sum2);
	doc.reward.value=AddComma(sum3);
	doc.treasury.value=AddComma(sum4);
	doc.alllq.value=sum5;
}


</script>


			
                  
                    <td>&nbsp;</td>
                    <td colspan="2" align="left">
					<table  id="incTable" class="tableList" width="950" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                      <tr class="TblHeaderColumn">
                      <td width="50" align="center"  class="TblHeaderColumn">ลำดับ</td>
                        <td width="40" align="left" ><input type="checkbox" name="incallCheckbox" id="incallCheckbox" value="" onClick="incCheck(this,document.dataform.inccheckbox);" /></td>
						<td width="80" align="center" class="TblHeaderColumn">วันที่ปรับ</td>
                        <td width="80" class="TblHeaderColumn"> คดีเปรียบเทียบ</td>
                        <td class="TblHeaderColumn">สินค้า</td>
                        <td width="65" align="right" class="TblHeaderColumn">จำนวนผู้ต้องหา</td>
                        <td width="140" align="right" class="TblHeaderColumn">เลขที่ใบเสร็จ</td>
                        <td width="90" align="right" class="TblHeaderColumn">เงินค่าปรับ</td>
                        <td width="70" align="right" class="TblHeaderColumn">เงินสินบน</td>
                        <td width="70" align="right" class="TblHeaderColumn">เงินรางวัล</td>
                        <td width="70" align="right" class="TblHeaderColumn">เงินส่งคลัง</td>
                      </tr>
                      <tr class="TblRow bgRowGray">
                        <td >&nbsp;</td>
                        <td >&nbsp;</td>
						<td >&nbsp;</td>
                        <td >&nbsp;</td>
                        <td ><strong>ผลรวม</strong></td>
                        <td ><strong><input name="alllq" id="alllq" class="textViewNum" type="text" size="7"/></strong></td>
                        <td >&nbsp;</td>
                        <td ><strong><input name="allfine" id="allfine" type="text" class="textViewNum" readonly size="10"/></strong></td>
                        <td ><strong><input name="birbe" id="birbe" type="text" class="textViewNum" readonly size="8"/></strong></td>
                        <td ><strong><input name="reward" id="reward" type="text" class="textViewNum"  readonly size="8"/></strong></td>
                        <td ><strong><input name="treasury" id="treasury" type="text" class="textViewNum" readonly size="8"/></strong></td>
						
						
                      </tr>
                    </table></td>
                  </tr>
 				<c:forEach items="${listsc}" var="sc" varStatus="i" >
		    						<script>
										incdata1[${i.count}] = "${sc.id}" ;
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
                </table></td>
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
            </table></td>
		  </tr>
		</table>
<script>
incrender('incTable');

</script>
	<c:if test="${db.status=='0'}">
		<script>
			document.getElementById('btnSendIncome').style.display='';
		</script>
	</c:if>
	
	<c:if test="${db.status == '1' || db.status == '2'}">
		<script>
			document.getElementById('imgSendDate').style.display='none';
			document.getElementById('send_doc_no').disabled=true;
			document.getElementById('offcode_write').disabled=true;
			document.getElementById('imgOffcodeWrite').style.display='none';
			document.getElementById('posname_lean').disabled=true;
			document.getElementById('offname_write').disabled=true;
			document.getElementById('legislation_id').disabled=true;
			document.getElementById('offcode_area').disabled=true;
			document.getElementById('imgStaffSend').style.display='none';
			document.getElementById('imgStaffApprove').style.display='none';
			document.getElementById('likAddList').style.display='none';
			document.getElementById('btnSave').style.display='none';
			document.getElementById('btnCancel').style.display='none';
			document.getElementById('btnSendIncome').style.display='none';
			document.getElementById('btnCancelSend').style.display='';
		</script>
	</c:if>
	<c:if test="${db.status == '2' || isCancelSend == 'N'}" >
		<script>
			document.getElementById('btnCancelSend').style.display='none';
		</script>
	</c:if>