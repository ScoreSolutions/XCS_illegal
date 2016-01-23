<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="java.util.Date" %>
<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>


<script>
function ch_accuserType(){
	for (i=0;i<document.dataform.accuserType.length;i++) { 
	      if (document.dataform.accuserType[i].checked){ 
	    	  document.dataform.mu_accuserType.value = document.dataform.accuserType[i].value; 
	      }
	} 
}

function clearDeptname(){
	var fForm = document.dataform;
	if(fForm.department_code.value == "")
		fForm.department_name.value = "";
}

function toggle() {
   if( document.getElementById("no_culpri").checked==true ){
		document.getElementById("estimate_fine").disabled=false;
		document.getElementById("issentcourt").disabled=true;
		document.getElementById("issentcourt").checked=false;
   }else{
		document.getElementById("issentcourt").disabled=false;
		if(document.getElementById("issentcourt").checked==true){
			document.getElementById("estimate_fine").disabled=false;

		}else{
			document.getElementById("estimate_fine").disabled=true;
			document.getElementById("estimate_fine").value="";
		}
   }

   if (document.dataform.legislation_id.value!="")
		setGroupID('product_group_id',document.dataform.legislation_id.value,document.dataform.product_group_id.value);
}


  function enableProductType(){
	  if(document.getElementById("legislation_id").value =='4'){
		  document.getElementById("s").disabled=false;
	  }else{
		  document.getElementById("s").disabled=true;
	  }
  }

  function setGroupID(group_id, vLegislationID, vGroupID){
		LegislationProduct.getDutyGroup(vLegislationID,function(data){
			dwr.util.removeAllOptions(group_id);
			dwr.util.addOptions(group_id,data,"group_id","group_name");
			
			if(vGroupID!=null && vGroupID!="" ){
				dwr.util.setValue(group_id,vGroupID);
			}

			if(dwr.util.getValue("have_culprit")=="N" || dwr.util.getValue("issentcourt")==true)
				dwr.util.addOptions("product_group_id",[{group_id:"0000",group_name:"อื่นๆ"}],"group_id","group_name");
		});
	}

  getProvince('province','district','tambol','${db.scene_province}','${db.scene_district}','${db.scene_subdistrict}');
  function SetOffName(DistictCode)
  {
	  var vOffcode = document.getElementById("offcode");
	  var vOffName = document.getElementById("tmp_offname");
	  var UserOffcode = "${offcode}";
	  
	  //if ((UserOffcode.substr(0,2)=="10") && (DistictCode.substr(0,2)=="10")){
		//  if (DistictCode != ""){
		//	  EdOfficeTest.getOffnameFromDistictCode(DistictCode,'N',function(data){
		//		  dwr.util.setValue(vOffcode,data[0]);
		//		  dwr.util.setValue(vOffName,data[1]);
		//	  });
		//   }
	  //}
	  //else{
	//	  dwr.util.setValue(vOffcode,"${offcode}");
	 // 	  dwr.util.setValue(vOffName,"${offname}");
	  //}
  }
	
</script>
<table width="800" border="0" cellspacing="0" cellpadding="0" >
  <tr >
    <td colspan="4">&nbsp;</td>
  </tr>
  <tr class="bgRowGray">
    <td colspan="4"><strong>รายละเอียดบันทึกการจับกุม</strong> </td>
  </tr>
  <tr >
    <td colspan="4">&nbsp;</td>
  </tr>
  <tr>
    <td width="20%" height="25" align="right" >เลขที่งาน :&nbsp;</td>

    <td width="30%"><input name="track_no" type="text" class="textview" value="${track_gen}" size="25" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" />
      <input type="hidden" name="id"  value="${db.id}" />
    </td>
    <td width="20%" height="25" align="right">วันที่เขียนบันทึกจับกุม :&nbsp;</td>
    <td width="30%"><!--<input name="theDate2" type="text" class="textdate" onKeyPress="txtKeyPress();" value="01/10/2552"  />
			 -->
		<c:if test="${db.application_date2 != null}">
        <input type="Text" name="application_date" id="application_date" class="textdate" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" size="7" maxlength="10" style="width:75;"
         value="${db.application_date2}" />
        </c:if>
        <c:if test="${db.application_date2 == null}">
        <input type="Text" name="application_date" id="application_date" class="textdate" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" size="7" maxlength="10" style="width:75;"
         value="<fmt:formatDate value='<%=new Date()%>' pattern='dd/MM/yyyy' />" />
        </c:if>
         <!-- <fmt:formatDate value="${user.createDate}" pattern="dd/MM/yyyy HH:mm:ss"/> -->
        <a href="javascript:NewCssCal('application_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a>
       <font style="color:red">*</font>
    </td>
  </tr>
  <tr>
    <td  height="25" align="right">เขียนที่ :&nbsp;</td>
    <td ><input name="department_code" type="text"  class="textbox" id="department_code"  value="${department_code}" size="4" onkeypress="ChkMinusInt(this);" onblur="clearDeptname();" />
        <img id="imgDepartment" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
                    onClick="window.open('process?action=Ed_office_pop&formname=department_name&formcode=department_code' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" />
        <input name="department_name" type="text"  class="textbox" id="department_name"  value="${department_name}" size="14" />
        <font style="color:red">*</font> </td>
    <td height="25" align="right">วันที่เกิดเหตุ :&nbsp;</td>
    <td height="25">
		<c:if test="${db.occurrence_date2 != null}">
        		<input name="occurrence_date" type="Text" class="textdate" id="occurrence_date" style="width:75;" value="${db.occurrence_date2}" size="7" maxlength="10" onKeyPress="txtKeyPress(event);" />
        		<a href="javascript:NewCssCal('occurrence_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a> เวลา
			    <input name="occurrence_time" id="occurrence_time" type="text" class="textbox" size="5" maxlength="5" value="${db.occurrence_time}"  onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);"/>
			    <font style="color:red">*</font> 
        </c:if>
        <c:if test="${db.occurrence_date2 == null}">
        		<input name="occurrence_date" type="Text" class="textdate" id="occurrence_date" style="width:75;" value="<fmt:formatDate value='<%=new Date()%>' pattern='dd/MM/yyyy' />" size="7" maxlength="10" onKeyPress="txtKeyPress(event);" />
        		<a href="javascript:NewCssCal('occurrence_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="border-style: none" /></a> เวลา
		        <input name="occurrence_time" id="occurrence_time" type="text" class="textbox" size="5" maxlength="5" value="<fmt:formatDate value="<%=new Date()%>" pattern="HH:mm"/>" onkeypress="txtTime_OnKeyPress(this);" onblur="lengthVali(this,5);"/>
		        <font style="color:red">*</font> 
        </c:if>
      
    </td>
  </tr>
  <tr>
    <td  height="25" align="right">พื้นที่ :&nbsp;</td>
    <td >
    	<select name="offcode" id="offcode" style='width:200px;<c:if test="${accuserType!='2'||db.id!=null}">display:none;</c:if>'  onchange="setOfficeProvince('province','district','tambol',this.value)" >
	         <option value="" <c:if test="${db.offcode == ''}"> selected </c:if>>เลือก</option>
	        <c:forEach items="${edlist}" var="off">
	          <option value="${off.offcode}" <c:if test="${off.offcode == offcode}"> selected </c:if>>${off.short_name}</option>
	        </c:forEach>
        </select>
        <c:if test="${accuserType!='2'||db.id!=null}">
        	<input name="tmp_offname" type="text"  id="tmp_offname"  value="${offname}" class="textview" size="33" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
        </c:if>
        <font style="color:red">*</font> </td>
    <td  height="25" align="right">ผู้กระทำผิด :&nbsp;</td>
    <td ><input  name="lawbreakertype" type="radio" checked value="1"

      /> บุคคลทั่วไป &nbsp;&nbsp;
      <input name="lawbreakertype" type="radio" value="2"

      />ผู้ประกอบการ&nbsp;&nbsp; <font style="color:red">*</font> </td>
  </tr>
  <tr>
    <td  height="25" align="right">พ.ร.บ. :&nbsp;</td>
    <td >

    <select name="legislation_id" id="legislation_id" style="width:200px;" onchange="setGroupID('product_group_id',this.value,'');" >
     <option value="" selected>เลือก</option>
            				<c:forEach items="${ltlist}"  var="ltion">
            				<option value="${ltion.id}" >${ltion.legislation_code} ${ltion.legislation_name}</option>
            				</c:forEach>
    </select>
        <font style="color:red">*</font> </td>
    <td  height="25" align="right">มีตัวผู้กระทำผิด :&nbsp;</td>
    <td ><input name="have_culprit" id="have_culpri" type="radio" value="Y" checked onclick="toggle();"

      /> มีตัว &nbsp;&nbsp;
      <input name="have_culprit" id="no_culpri" type="radio" value="N" onclick="toggle();document.dataform.aalchkAll.checked=true;allCheck(document.dataform.aalchkAll,document.dataform.lawscheck_list);lawsget_check_value('lawsTable');"

      /> ไม่มีตัว&nbsp;&nbsp;
      <input name="issentcourt" id="issentcourt" type="checkbox" onclick="toggle();"
      <c:if test="${db.issentcourt == 'Y'}"> checked </c:if> value = 'Y' /> 
      	ส่งฟ้องศาล&nbsp;&nbsp; <font style="color:red">*</font>
     </td>
  </tr>
  <tr>
    <td height="25" align="right">สินค้า :&nbsp;</td>
    <td >
    <select name="product_group_id" id="product_group_id" style="width:200px;">
    	<option value="" selected >เลือก</option>
    </select>
        <font style="color:red">*</font> </td>
    <td align="right" valign="top">ประมาณการค่าปรับ :&nbsp;</td>
    <td valign="top" colspan="3"><input type="text" name="estimate_fine" id="estimate_fine" class="textNum" onkeypress="ChkMinusDbl(this);" size="10" value="${db.estimate_fine}"  />
      บาท</td>
  </tr>
  <tr height="25">
    <td align="right" valign="top">ผู้กล่าวหา :&nbsp;</td>
    <td colspan="3"><table border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td><input name="accuserType" type="radio" value="2"  <c:if test="${accuserType == '2'}"> checked </c:if>  > เจ้าหน้าที่กรมสรรพสามิต </td>
        <td><input name="accuserType" type="radio" value="3"  <c:if test="${accuserType == '3'}"> checked </c:if>  > เจ้าหน้าที่สรรพสามิตภาค </td>
        <td  align="right">ชื่อผู้กล่าวหา :&nbsp;</td>
        <td><input type="text" id="accuser" name="accuser" class="textview" size="31" value="${accuser_name}" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" />
              <input type="hidden" id="accuser_idcardno" name="accuser_idcardno"  value="${accuser_idcardno}" />
              <input type="hidden" id="mu_accuserType" name="mu_accuserType" value="" />
              <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:pointer" onClick="ch_accuserType();window.open('process?action=Divide_staff_popForArrest&formname=accuser&id=accuser_idcardno&posname=posname&poscode=accuser_poscode&offname=offname&offcode=accuser_offcode&actype='+document.dataform.mu_accuserType.value , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" /> <font style="color:red">*</font> </td>
      </tr>
      <tr>
        <td><input name="accuserType" type="radio" value="1"
              <c:if test="${accuserType == '1'}"> checked </c:if>
          >เจ้าหน้าที่สรรพสามิตพื้นที่ </td>
        <td><input name="accuserType" type="radio" value="4"
              <c:if test="${accuserType == '4'}"> checked </c:if>
          >เจ้าหน้าที่สรรพสามิตพื้นที่สาขา</td>
        <td align="right">ตำแหน่ง :&nbsp;</td>
        <td ><input type="text" id="posname" name="posname" class="textview" size="35" value="${accuser_posname}" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" />
              <input type="hidden" id="accuser_poscode" name="accuser_poscode" class="textview" size="35" value="${accuser_poscode}" />
        </td>
      </tr>
      <tr>
        <td colspan="2"><input name="accuserType" type="radio" value="5"
              <c:if test="${accuserType == '5'}"> checked </c:if>  >เจ้าหน้าที่อื่นๆ</td>
        <td align="right">สังกัด :&nbsp;</td>
        <td ><input type="text" id="offname" name="offname" class="textview" size="35" value="${accuser_offname}" onKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" />
              <input type="hidden" id="accuser_offcode" name="accuser_offcode" class="textview" size="35" value="${accuser_offcode}" />
        </td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="25">&nbsp;</td>
  </tr>
  <tr height="25">
    <td  height="25" align="right">ชื่อสถานที่เกิดเหตุ :&nbsp;</td>
    <td ><input name="scene_name" type="text" class="text" size="25" value="${db.scene_name}" />
        <font style="color:red">*</font> </td>
    <td height="25" align="right">จังหวัด :&nbsp;</td>
    <td>
       <select name="scene_province" id="province" style="width:200px" onchange="getDistrict('district','tambol',this.value,''); SetOffName('')">
       	  <option value="">โปรดเลือก</option>

       </select>
       <font style="color:red">*</font> </td>

  </tr>
  <tr height="25">
    <td  height="25" align="right">บ้านเลขที่ :&nbsp;</td>
    <td ><input name="scene_no" type="text" class="text" size="8" value="${db.scene_no}" />
      &nbsp;&nbsp;
      หมู่ :
      <input name="scene_moo" type="text" class="text" size="5" onkeypress="ChkMinusInt(this);"  value="${db.scene_moo}" />
    </td>
    <td height="25" align="right">อำเภอ:&nbsp;</td>
    <td>
     <select name="district" id="district"  style="width:200px" onchange="getTambol('tambol',this.value,''); SetOffName(this.value)">
     </select>
        <font style="color:red">*</font> </td>
  </tr>
  <tr height="25">
    <td  height="25" align="right">ซอย :&nbsp;</td>
    <td ><input name="scene_soi" type="text" class="text" id="scene_soi" value="${db.scene_soi}" size="25"  /></td>
    <td height="25" align="right">ตำบล :&nbsp;</td>
    <td>
       <select name="tambol" id="tambol"  style="width:200px">
       </select>
       <font style="color:red">*</font> </td>
  </tr>
  <tr height="25">
    <td  height="25" align="right">ถนน :&nbsp;</td>
    <td ><input name="scene_road" type="text" class="text" id="scene_road"  value="${db.scene_road}" size="25" /></td>
    <td align="right">สถานีตำรวจท้องที่เกิดเหตุ :&nbsp;</td>
    <td><input name="police_station" type="text" class="text" size="20" value="${db.police_station}" />
      (ส.ส.2/54)</td>
  </tr>
  <tr>
    <td height="25" align="right" >จำนวนผู้กระทำผิด :&nbsp;</td>
    <td height="25" ><input type="text" name="laws_qty" id="laws_qty" size="2" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview" value = "${aalsize}"/>  คน &nbsp;&nbsp;&nbsp;
        <input name="alleged_co" type="checkbox"  disabled="disabled" <c:if test="${aalsize >= 2}" > checked </c:if> value="Y" />
      ข้อกล่าวหาร่วมกัน </td>
    <td height="25" align="right">ละติจูด :&nbsp;</td>
    <td><input name="coordinate_x" type="text" class="text" size="5" value="${db.coordinate_x}" onkeypress="ChkMinusDbl(this);"  />
      &nbsp;&nbsp;&nbsp;
      ลองติจูด :&nbsp;&nbsp;
      <input name="coordinate_y" type="text" class="text" size="5"  value="${db.coordinate_y}" onkeypress="ChkMinusDbl(this);"/>
    </td>
  </tr>
  <tr>
    <td colspan="4" height="25" align="right">&nbsp;</td>
  </tr>
</table>
<script>

	document.dataform.legislation_id.value = "${db.legislation_id}" 
	
	for(var i = 0 ; i< document.dataform.lawbreakertype.length; i++){
	
	 		if(document.dataform.lawbreakertype[i].value == "${db.lawbreak_type}" ){
	    	document.dataform.lawbreakertype[i].checked=true;
			 }
	}
	for(var i = 0 ; i< document.dataform.have_culprit.length; i++){
	
	 		if(document.dataform.have_culprit[i].value == "${db.have_culprit}" ){
	    	document.dataform.have_culprit[i].checked=true;
			 }
	}
	toggle();

	setGroupID('product_group_id','${db.legislation_id}','${db.product_group_id}');

</script>  



