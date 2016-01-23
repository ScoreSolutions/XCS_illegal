<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript">

var aatmaxrow=1; // jsp  Count  config
var aatstartrow=2;
var aateditrow = -1;
var aateditna = 0;

function aatinsRow(myTable,maxrox,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10,data11,data12,data13)
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
	y5.innerHTML= data8;
	y6.innerHTML= "<input type=\"Text\" id=\"leader_name" + row + "\" name=\"leader_name" + row + "\""+
				"value=\"${st_detect.title_name}${st_detect.first_name} ${st_detect.last_name}"+ data10 +" \""+
				"class=\"textview\" size=\"30\" />" +
				"<input type=\"hidden\" id=\"leader_idcardno" + row + "\" name=\"leader_idcardno" + row + "\""+
				"value=\"${asf.staff_idcardno_detect}"+ data11 +"\" /> "+
				"<input type=\"hidden\" name=\"offcode_leader" + row + "\" value=\"${asf.offcode_leader }"+ data12 +"\"> " +
				"<input type=\"hidden\" id=\"poscode_leader" + row + "\" name=\"poscode_leader" + row + "\" value=\"${asf.poscode_detect}"+ data13 +"\" />" +
				"<img src=\"images/btn_browse.png\" width=\"18\" height=\"19\" border=\"0\" style=\"cursor:hand\" " +
				"onClick=\"window.open('process?action=Divide_staff_pop&formname=leader_name" + row + "&id=leader_idcardno" + row + "&poscode=poscode_leader" + row + "&offcode=offcode_leader" + row + "' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');\" />"
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
	var cmdOffice = document.dataform.cmdOffcode.value;
	
	if(cmdOffice != ""){
		writeTranLog('เพิ่มชื่อเจ้าหน้าที่');
		var  dup=0;
		var data = window.showModalDialog('process?action=StaffListPopCondition&offcode=' + cmdOffice, self , 'dialogWidth=700px,Height=400px');
		if(data != null)
		{
			for (var i=0; i < data.length; i++)
			{
		    	aatinsRow(myTable,aatmaxrow,"",data[i][2],data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8],data[i][9],data[i][10],data[i][11],data[i][12],data[i][13]);
		    }
		}
	}else{
		alert('กรุณาเลือกหน่วยงาน');
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
        aatinsRow(myTable,i,aatdata1[i],aatdata2[i],aatdata3[i],aatdata4[i],aatdata5[i],aatdata6[i],aatdata7[i],aatdata8[i],aatdata9[i],aatdata10[i],aatdata11[i],aatdata12[i],aatdata13[i]);
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
var aatdata13 =new Array();


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

<form method="post" name="dataform" action="<c:url value="/process?action=RoleUser_Master&cmd=SaveData" />" >
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
       <tr>
          <td width="100%" align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
               <tr><td colspan="2">&nbsp;</td></tr>
               <tr>
                 <td width="1%">&nbsp;</td>
                 <td width="99%"><span class="websitename">กำหนดผู้ใช้งาน</span></td>
               </tr>
               <tr><td colspan="2">&nbsp;</td></tr>
               <tr>
					<td>&nbsp;</td>
					<td>
						<input name="btnSave"  type="submit" class="barbutton" value="บันทึก" 
							onclick="writeTranLog('บันทึกผู้ใช้งาน')" >
						<input name="btnBack" type="button" class="barbutton"
						value="กลับหน้าหลัก"	onclick="writeTranLog('กลับหน้าค้นหา');javascript:location.href='<c:url value="/process?action=Role_Master"/>'">
						
					</td>
				</tr>
               <tr><td colspan="2">&nbsp;</td></tr>
               <tr><td>&nbsp;</td><td><font color="green"><b>${completeMsg}</b></font>&nbsp;</td></tr>
               <tr>
	               <td >&nbsp;</td>
	               <td>
	               		<table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
							 <tr >
							 	<td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"/></td>
								<td width="98%"/></td>
								<td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"/></td>	
							 </tr>
							 <tr>
								<td>&nbsp;</td>
								<td valign="top">
									<table border="0" cellpadding="0" cellspacing="0" width="100%">
										<tr height="30px" >
											<td width="30%" align="right" >
											   	สำหรับ Role :&nbsp;
											</td>	
											<td width="70%" align="left">
												<input align="bottom" name="RoleName" readonly type="text" class="textview" value="${txtRoleName}" size="50">
												<input type="hidden" name="RoleID" value="${txtRoleID}"></input>
											</td>												
										</tr>
										<tr>
											<td align="right" >หน่วยงาน :&nbsp;</td>
											<td>
												<select id="cmdOffcode" name="cmdOffcode" style="width:250px">
													<option value="" selected>เลือก</option>
													<c:forEach items="${cmdOffcode}"  var="ltion">
						            					<option value=${ltion.offcode}  <c:if test="${UserOffcode == ltion.offcode}"> selected </c:if>>${ltion.short_name}</option>
						            				</c:forEach>
												</select>
											</td>
										</tr>
									</table>
								</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"/></td>
								<td></td>
								<td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"/></td>
						  	</tr>
						</table>
	               </td>
               </tr>
               <tr><td colspan="2">&nbsp;</td></tr>
               <tr >
               	   <td >&nbsp;</td>
	               <td align="left" valign="top">
	               		<span class="spanLink"  onclick="aatopenmodal('staffList')" />เพิ่มรายการ</span> | 
	               		<span class="spanLink"  onClick="aatget_check_value('staffList')" />ลบรายการที่เลือก</span>
	               </td>
               </tr>
               <tr height="450px">
               		<td colspan="2" valign="top">
               			<table id="staffList" class="tableList" width="800px" border="0" cellspacing="0" cellpadding="0" >
                           <tr class="TblHeaderColumn AlignCenter">
                                <td width="5%">ลำดับ</td>
                                <td width="5%" ><input type="checkbox" name="checkbox" value="checkbox" onClick="allCheck(this,document.dataform.aatcheckbox);"></td>
                                <td width="20%">ชื่อ-สกุล</td>
                                <td width="20%">ตำแหน่ง</td>
                                <td width="25%">สังกัด</td>
                                <td width="25%">ชื่อผู้บังคับบัญชา</td>
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
								 aatdata9[${i.count}]  ="${aat.title_name}"+"${aat.first_name} "+" ${aat.last_name}";
								 aatdata10[${i.count}] ="${aat.ltitle_name}"+"${aat.lfirst_name} "+" ${aat.llast_name}";
								 aatdata11[${i.count}] ="${aat.idcard_leader}";
								 aatdata12[${i.count}] ="${aat.loffcode}";
								 aatdata13[${i.count}] ="${aat.lposcode}";
								 
							</script>
						</c:forEach>
               		</td>
               </tr>
            </table>
          </td>
       </tr>
    </table>
	<script>
		aatrender('staffList');
	</script>
</form>