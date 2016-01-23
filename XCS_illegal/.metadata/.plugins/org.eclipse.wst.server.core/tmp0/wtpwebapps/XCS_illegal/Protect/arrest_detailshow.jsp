<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/LegislationProduct.js'></script>
<script type='text/javascript' src='dwr/engine.js'></script>
<script type='text/javascript' src='dwr/util.js'></script>

<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
<script>
  function toggle() {
   if( document.getElementById("isLawbreakerN").checked==true ){
		document.getElementById("txtEstimateFine").disabled=false;
		document.getElementById("chkIsCourt").disabled=true;
		document.getElementById("chkIsCourt").checked=false;
   }else{
		document.getElementById("chkIsCourt").disabled=false;
		if(document.getElementById("chkIsCourt").checked==true){
			document.getElementById("txtEstimateFine").disabled=false;
			document.getElementById("txtEstimateFineDate").disabled=false;
			document.getElementById("imgEstimateFineDate").style.display='';

		}else{
			document.getElementById("txtEstimateFine").disabled=true;
			document.getElementById("txtEstimateFineDate").disabled=true;
			document.getElementById("imgEstimateFineDate").style.display='none';

		}
   }
  }

function ch_accuserType(){
	for (i=0;i<document.dataform.accuserType.length;i++) { 
      if (document.dataform.accuserType[i].checked){ 
    	  document.dataform.mu_accuserType.value = document.dataform.accuserType[i].value; 
      }
	} 
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

    <td width="30%"><input id="track_no" name="track_no" type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview" value="${db.track_no}" size="25"  />
      <input type="hidden" name="id"  value="${db.id}" />
       <input type="hidden" name="update"  value="${update}" />
    </td>
    <td width="20%" height="25" align="right">วันที่เขียนบันทึกจับกุม :&nbsp;</td>
    <td width="30%">
        <input type="text" name="application_date" id="application_date" class="textdate" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" size="7" value="${db.application_date2}"  />
    </td>
  </tr>
  <tr>
    <td  height="25" align="right">เขียนที่ :&nbsp;</td>
    <td ><input name="department_code" type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"  class="textView" id="department_code"  value="${db.department_id}" size="4" />
        <input name="department_name" type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"  class="textView" id="department_name"  value="${db.department_name}" size="25" />
    </td>
    <td height="25" align="right">วันที่เกิดเหตุ :&nbsp;</td>
    <td height="25">
        <input name="occurrence_date" type="text"  class="textdate" id="occurrence_date" style="width:75;" value="${db.occurrence_date2}" size="7" maxlength="10" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
        <input name="occurrence_time" id="occurrence_time" type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" class="textview" size="5" maxlength="5" value="${db.occurrence_time}"  />
    </td>
  </tr>
  <tr>
    <td  height="25" align="right">พื้นที่ :&nbsp;</td>
    <td ><select name="offcode" id="s" style="width:200px;display:none;" >
	        <c:forEach items="${edlist}" var="off">
	          <option value="${off.offcode}" <c:if test="${off.offcode == db.offcode}"> selected </c:if>>${off.short_name}</option>
	        </c:forEach>
        </select>
        <input name="tmp_offname" type="text"  id="tmp_offname"  value="${db.offname}" class="textview" size="33" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
    <td  height="25" align="right">ผู้กระทำผิด :&nbsp;</td>
    <td ><input name="lawbreakertype" type="radio" checked value="P" disabled="disabled"
        <c:if test="${db.lawbreak_type == '1'}"> checked </c:if>
      /> บุคคลทั่วไป &nbsp;&nbsp;
      <input name="lawbreakertype" type="radio" value="C" disabled="disabled"
      <c:if test="${db.lawbreak_type == 2}"> checked </c:if>
      />ผู้ประกอบการ</td>
  </tr>
  <tr>
    <td  height="25" align="right">พ.ร.บ. :&nbsp;</td>
    <td >
	    <select name="legislation_id" id="legislation_id" style="width:200px;display:none;" >
	    	<option value="" selected>เลือก</option>
	      	<option value="1" <c:if test="${db.legislation_id == 1}">selected</c:if> >90 พ.ร.บ. สุรา พ.ศ.2493</option>
	      	<option value="2" <c:if test="${db.legislation_id == 2}">selected</c:if> >91 พ.ร.บ.ยาสูบ พ.ศ.2509</option>
	      	<option value="3" <c:if test="${db.legislation_id == 3}">selected</c:if> >92 พ.ร.บ.ไพ่</option>
	      	<option value="4" <c:if test="${db.legislation_id == 4}">selected</c:if> >00 พ.ร.บ.ภาษีสรรพสามิต พ.ศ.2527</option>
	    </select>
	    <input name="tmp_legislation_name" type="text"  id="tmp_legislation_name"  value="${db.legislation_name}" class="textview" size="33" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
    </td>
    <td  height="25" align="right">มีตัวผู้กระทำผิด :&nbsp;</td>
    <td ><input name="have_culprit" id="have_culpri" type="radio" value="Y" checked onclick="toggle();" disabled="disabled"
        <c:if test="${db.have_culprit == 'Y'}"> checked </c:if>
      /> มีตัว &nbsp;&nbsp;
      <input name="have_culprit" id="have_culpri" type="radio" value="N" onclick="toggle();" disabled="disabled"
      <c:if test="${db.have_culprit == 'N'}"> checked </c:if>
      /> ไม่มีตัว&nbsp;&nbsp;
      <input name="issentcourt" id="issentcour" type="checkbox" disabled="disabled" onclick="toggle();"
      <c:if test="${db.issentcourt == 'Y'}"> checked </c:if>
      value = 'Y'/> ส่งฟ้องศาล
	</td>
  </tr>
  <tr>
    <td height="25" align="right">สินค้า :&nbsp;</td>
    <td >
    	<select id="product_group_id" name="product_group_id" style="width:200px;display:none;" >
    	</select>
    	<input name="tmp_group_name" type="text"  id="tmp_group_name"  value="${db.product_group_name}" class="textview" size="33" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
    </td>
    <td align="right" valign="top">ประมาณการค่าปรับ :&nbsp;</td>
    <td valign="top" colspan="3"><input type="text" onKeyPress="txtKeyPress();" disabled="disabled" onKeyDown="disableKeyDown();" name="estimate_fine" id="estimate_fine" class="textNum"  size="10" value="${db.estimate_fine}"  />
      บาท</td>
  </tr>
  <tr height="25">
    <td align="right" valign="top">ผู้กล่าวหา :&nbsp;</td>
    <td colspan="3"><table border="0" cellpadding="0" cellspacing="0">
      <tr height="25">
        <td><input name="accuserType" type="radio" value="2"  <c:if test="${db.accuser_type == 2}"> checked </c:if> <c:if test="${IsEditArrest!='Y'}">disabled</c:if> > เจ้าหน้าที่กรมสรรพสามิต </td>
        <td><input name="accuserType" type="radio" value="3"  <c:if test="${db.accuser_type == 3}"> checked </c:if> <c:if test="${IsEditArrest!='Y'}">disabled</c:if> > เจ้าหน้าที่สรรพสามิตภาค </td>
        <td  align="right">ชื่อผู้กล่าวหา :&nbsp;</td>
        <td>
        		<input type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" id="accuser"  name="accuser" class="textview" size="35" value="${accuser_name}" />
        		<input type="hidden" id="accuser_idcardno" name="accuser_idcardno"  value="${accuser_idcardno}" />
              	<input type="hidden" id="mu_accuserType" name="mu_accuserType" value="" />
              	<img src="images/btn_browse.png" width="18" height="19" border="0" 
              	style="cursor:pointer;<c:if test="${IsEditArrest!='Y'}">display:none;</c:if>" 
              	onClick="ch_accuserType();window.open('process?action=Divide_staff_popForArrest&formname=accuser&id=accuser_idcardno&posname=posname&poscode=accuser_poscode&offname=offname&offcode=accuser_offcode&actype='+document.dataform.mu_accuserType.value , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" /> 
              	<font style="color:red">*</font>
        </td>
      </tr>
      <tr height="25">
        <td>
        	<input name="accuserType" type="radio" value="1" <c:if test="${db.accuser_type == 1}"> checked </c:if> <c:if test="${IsEditArrest!='Y'}">disabled</c:if> >เจ้าหน้าที่สรรพสามิตพื้นที่ 
        </td>
        <td>
        	<input name="accuserType" type="radio" value="4" <c:if test="${db.accuser_type == 4}"> checked </c:if> <c:if test="${IsEditArrest!='Y'}">disabled</c:if> >เจ้าหน้าที่สรรพสามิตพื้นที่สาขา
        </td>
        <td align="right">ตำแหน่ง :&nbsp;</td>
        <td >
        		<input type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" id="posname" name="posname" class="textview" size="35" value="${accuser_posname}" />
             	<input type="hidden" name="accuser_poscode"  value="${accuser_poscode}" />
        </td>
      </tr>
      <tr>
        <td colspan="2"><input name="accuserType" type="radio" value="5" 
              <c:if test="${db.accuser_type == 5}"> checked </c:if> <c:if test="${IsEditArrest!='Y'}">disabled</c:if> >เจ้าหน้าที่อื่นๆ</td>
        <td align="right">สังกัด :&nbsp;</td>
        <td >
        	<input type="text" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" id="offname" name="offname" class="textview" size="35" value="${accuser_offname}" />
        	<input type="hidden" id="accuser_offcode" name="accuser_offcode" class="textview" size="35" value="${accuser_offcode}" />
        </td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="25">&nbsp;</td>
  </tr>
  <tr height="25">
    <td   align="right">ชื่อสถานที่เกิดเหตุ :&nbsp;</td>
    <td >
    	<c:if test="${IsEditArrest!='Y'}">
    		<input name="scene_name" type="text" class="textview" size="25" value="${db.scene_name}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
    	</c:if>
    	<c:if test="${IsEditArrest=='Y'}">
	    	<input name="scene_name" type="text" class="text" size="25" value="${db.scene_name}"  />
	    	<font style="color:red">*</font>
    	</c:if>
    </td>
    <td  align="right">จังหวัด :&nbsp;</td>
    <td>
        <select name="scene_province" id="province" <c:if test="${IsEditArrest!='Y'}">disabled</c:if>
        style="width:200px" onchange="getDistrict('district','tambol',this.value,'')">
        	  <option value="">โปรดเลือก</option>
	       	  <c:forEach items="${pvlist}" var="pv">
	       	  	<option value="${pv.province_code}" <c:if test="${pv.province_code == db.scene_province}">selected</c:if> >${pv.province_name}</option>
	       	  </c:forEach>
        </select>
        <font style="color:red">*</font>
   </td>

  </tr>
  <tr height="25">
    <td  align="right">บ้านเลขที่ :&nbsp;</td>
    <td >
    	<c:if test="${IsEditArrest!='Y'}">
    		<input name="scene_no" type="text" class="textview" size="8" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.scene_no}" />
		      &nbsp;&nbsp; หมู่ :
		    <input name="scene_moo" type="text" class="textview" size="5" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" value="${db.scene_moo}" />
    	</c:if>
    	<c:if test="${IsEditArrest=='Y'}">
		    <input name="scene_no" type="text" class="text" size="8" value="${db.scene_no}" />
		      &nbsp;&nbsp; หมู่ :
		    <input name="scene_moo" type="text" class="text" size="5"  value="${db.scene_moo}" />
      	</c:if>
    </td>
    <td align="right">อำเภอ :&nbsp;</td>
    <td>
        <select name="district" id="district"  style="width:200px" <c:if test="${IsEditArrest!='Y'}">disabled</c:if>
        onchange="getTambol('tambol',this.value,'')">
     	</select>
     	<font style="color:red">*</font>
    </td>
  </tr>
  <tr height="25">
    <td  align="right">ซอย :&nbsp;</td>
    <td >
    	<c:if test="${IsEditArrest!='Y'}">
    		<input name="scene_soi" type="text" class="textview" id="scene_soi" value="${db.scene_soi}" size="25" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
    	</c:if>
    	<c:if test="${IsEditArrest=='Y'}">
    		<input name="scene_soi" type="text" class="text" id="scene_soi" value="${db.scene_soi}" size="25"  />
    	</c:if>
    </td>
    <td align="right">ตำบล :&nbsp;</td>
    <td>
       	<select name="tambol" id="tambol"  style="width:200px" <c:if test="${IsEditArrest!='Y'}">disabled</c:if> >  
       	</select>
		<font style="color:red">*</font>
    </td>
  </tr>
  <tr height="25">
    <td align="right">ถนน :&nbsp;</td>
    <td >
    	<c:if test="${IsEditArrest!='Y'}">
    		<input name="scene_road" type="text" class="textview" id="scene_road"  value="${db.scene_road}" size="25" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
    	</c:if>
    	<c:if test="${IsEditArrest=='Y'}">
    		<input name="scene_road" type="text" class="text" id="scene_road"  value="${db.scene_road}" size="25" />
    	</c:if>
    </td>
    <td align="right">สถานีตำรวจท้องที่เกิดเหตุ :&nbsp;</td>
    <td>
    	<c:if test="${IsEditArrest!='Y'}">
    		<input name="police_station" type="text" class="textview" size="22" value="${db.police_station}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
    	</c:if>
    	<c:if test="${IsEditArrest=='Y'}">
    		<input name="police_station" type="text" class="text" size="22" value="${db.police_station}" />
    	</c:if>
    	(ส.ส.2/54)
    </td>
  </tr>
  <tr height="25">
    <td align="right">จำนวนผู้กระทำผิด :&nbsp;</td>
    <td > ${aalsize} คน &nbsp;&nbsp;&nbsp;       
        <input name="alleged_co" type="checkbox"  <c:if test="${aalsize >= 2}" > checked </c:if> disabled="disabled"/>
      ข้อกล่าวหาร่วมกัน </td>
    <td  align="right">ละติจูด :&nbsp;</td>
    <td>
    	<c:if test="${IsEditArrest!='Y'}">
    		<input name="coordinate_x" type="text" class="textview" size="5" value="${db.coordinate_x}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
	      	&nbsp;&nbsp;&nbsp;
	     	 ลองจิจูด :&nbsp;&nbsp;
	      	<input name="coordinate_y" type="text" class="textview" size="5"  value="${db.coordinate_y}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" />
    	</c:if>
    	<c:if test="${IsEditArrest=='Y'}">
    		<input name="coordinate_x" type="text" class="text" size="5" value="${db.coordinate_x}" />
	      	&nbsp;&nbsp;&nbsp;
	     	 ลองจิจูด :&nbsp;&nbsp;
	      	<input name="coordinate_y" type="text" class="text" size="5"  value="${db.coordinate_y}" />
    	</c:if>
    </td>
  </tr>
  <tr>
    <td colspan="4" height="25" align="right">&nbsp;</td>
  </tr>
</table>
<script>
getProvince('province','district','tambol','${db.scene_province}','${db.scene_district}','${db.scene_subdistrict}');
setGroupID('product_group_id','${db.legislation_id}','${db.product_group_id}');
//getDistrict('district','tambol','${db.scene_province}','${db.scene_district}','${db.scene_subdistrict}');
</script>
