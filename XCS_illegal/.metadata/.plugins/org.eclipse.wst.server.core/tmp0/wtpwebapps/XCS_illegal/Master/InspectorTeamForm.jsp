<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type="text/javascript">
function test(){
	alert("test");
	alert(document.dataform.chkList.length);
}

function backSearch(){
	  window.location.href='<c:url value="/process?action=InspectorTeamList_Master" />';
}
function addlistStaff(){
	if(document.dataform.inspector_code.value){
		
		var data = window.showModalDialog('process?action=Divide_staff_poplist', self, 'dialogWidth=700px,Height=400px');
		
		if (data) {
			var base = jQuery(".person_row").size();
			for (var i = 0; i < data.length; i++) {
				var index = base + i;
				var newRow = jQuery("<tr/>");
				newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").html(index));
				newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").append(jQuery("<input type='checkbox'/>").attr('n_ame','chkList')));
				newRow.append(jQuery("<td/>").addClass('TblRow AlignCenter').html(document.dataform.inspector_code.value));
				newRow.append(jQuery("<td/>").addClass('TblRow AlignCenter').html(data[i][5]));
				newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html(data[i][9]));
				newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html(data[i][3]));
				newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html(data[i][8]));
				newRow.append(jQuery("<td/>").addClass('TblRow AlignRight').append(jQuery("<select name='status' />").append("<option value=''> เลือก </option>").append("<option value='1'>หัวหน้าสายตรวจ</option>").append("<option value='2'>รองหัวหน้าสายตรวจ</option>").append("<option value='3'>ประจำสายตรวจ</option>").append("<option value='4'>ผู้ควบคุมสายตรวจ</option>")));
			//newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html('test'));
			//newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html('test'));
			//newRow.append(jQuery("<td/>").addClass('TblRow AlignCenter').html('test'));
			//newRow.append(jQuery("<td/>").addClass('TblRow AlignRight').append(jQuery('<input/>').addClass('textNum').attr({type:'text',name:'share2',value:'',size:'5'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));
				newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_code_team',value:data[i][4]}));
				newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'title_id_team',value:data[i][12]}));
				//newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'count',value:}));
				newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'first_name_team',value:data[i][10]}));
				newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'last_name_team',value:data[i][11]}));
				newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_idcardno_team',value:data[i][5]}));
				newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_poscode_team',value:data[i][6]}));
				newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_offcode_team',value:data[i][7]}));
			//newRow.append(jQuery("<input/>").attr({type:'hidden',name:'mu',value:document.dataform.inspector_code.value}));
			//alert();
				jQuery("#divide_tab").append(jQuery('<tr/>').addClass('person_row').attr('id', 'person_row_'+index).html(newRow.html().replace(/n_ame/g, 'name')));
			}
		}
	}else{
		alert("กรุณาป้อนรหัสสายตรวจ");
		document.dataform.inspector_code.focus();
	}
}

function deleterow() {
    jQuery(".person_row:has(:checked)").remove();
    jQuery(".person_row").each(function(index) {
        var i = index;
        var row = jQuery(this);
        row.attr('id', 'person_row_' + i);
        row.find('td').first().html(i);
        //row.find('td > [name=order_seq]').attr('value', i);
    });
}
function chkUncheckAll() {
    if (jQuery("input[name=chkAll]").attr('checked')) {
        jQuery("input[name = 'chkList']").attr('checked', true);   
    } else {
        jQuery("input[name = 'chkList']").attr('checked', false);   
    }
   
}

function openPopSub(){
	var subOffcode = document.dataform.offcode_dept.value;
	window.open('process?action=Ed_office_pop&formcode=offcode_div&formname=offcode_divname&sub_offcode=' + subOffcode + '&cmd=listSub', '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');
}
</script>
<form name="dataform" method="post" action="<c:url value="process?action=InspectorTeamList_Master&cmd=create"/>" >
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">

              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%">
					<span class="websitename">กำหนดคณะผู้จับกุม ผู้ตรวจ</span>
				 </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="15">&nbsp;</td>
              </tr>
			  <tr>
				<td >&nbsp;</td>
				<td>
					<input name="btnSave"  type="submit" class="barbutton" value="บันทึก" >
					<input name="btnCancelEdit"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="location.href='<c:url value="/process?action=InspectorTeamList_Master&cmd=add" />';">
					<input name="btnBack"  type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="backSearch();">
					
				</td>
			  </tr>
              <tr>
                <td>&nbsp;</td>
                <td height="25">&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
						<table border="0" cellpadding="0" cellspacing="0" width="1000">
							<tr>
                				<td width="20%" align="right">หนังสือแต่งตั้งเลขที่ :&nbsp;</td>
                				<td width="30%">
									<input name="appoint_no" type="text" class="textbox AlignRight" value="" size="10" />
									<font style="color:red">*</font>
								</td>
								<td width="20%" align="right" >เลขที่งาน :&nbsp;</td>
								<td width="30%" height="25">
									<input name="job_no" type="text" class="textView" value="" size="30" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" />
								</td>
							</tr>
							<tr>
                				<td align="right">ทั้งนี้ ตั้งแต่วันที่ :&nbsp;</td>
                				<td >
									<input name="appoint_date" id="appoint_date"  type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value=""     />
		  							<a href="javascript:NewCssCal('appoint_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" /></a>
									<font style="color:red">*</font>
								</td>
								<td align="right" >หัวหน้าฝ่าย :&nbsp;</td>
								<td  height="25">
									<input type="text" name="staff_name" class="textview" size="31" value="" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();">
									<input type="hidden" name="staff_idcardno_leader" value="" />
									<input type="hidden" name="poscode_leader" value="" />
									<input type="hidden" name="offcode_leader" value="" />
				
								   <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
										onClick="window.open('process?action=Divide_staff_pop&formname=staff_name&id=staff_idcardno_leader&poscode=poscode_leader&posname=staff_posname&offname=staff_offname&offcode=offcode_leader' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');"  />
										<font style="color:red">*</font>
								</td>
								
								
							</tr>
							<tr>
								<td align="right">สังกัด :&nbsp;</td>
								<td height="25" >
									<c:if test="${IsAdmin == '1'}">
									   <input type="text" name="offcode_dept" id="offcode_dept" size="4"  class="textbox" value="${offcode_dept}" onBlur="getOffname(this.value,'Y',offcode_deptname);" >
									   <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
														onClick="window.open('process?action=Ed_office_pop&formcode=offcode_dept&formname=offcode_deptname' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" >
									   <input type="text" name="offcode_deptname" id="offcode_deptname" size="25" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" class="textview"  value="${offname_dept}" >
								   </c:if>
								   <c:if test="${IsAdmin != '1'}">
								   	   <input type="text" name="offcode_dept" id="offcode_dept" size="6"  class="textview" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${offcode_dept}">
									   <input type="text" name="offcode_deptname" id="offcode_deptname" size="35"  class="textview" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${offname_dept}"  >
								   </c:if>
								   <font style="color:red">*</font>
								</td>
								<td align="right" >ตำแหน่ง :&nbsp;</td>
								<td  height="25">
									<input type="text" name="staff_posname" id="staff_posname" class="textview" size="31" value="" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" >
								</td>
                			</tr>
                			<tr>
                				<td align="right">สังกัดฝ่าย :&nbsp;</td>
								<td height="25" >
								   <input type="text" name="offcode_div" id="offcode_div" size="4"  class="textbox"  value="" onBlur="getOffname(this.value,'Y',offcode_divname);"  >
								   <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
											onClick="openPopSub();" >
								   <input type="text" name="offcode_divname" id="offcode_divname" size="25" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" class="textview"  value="" >
								   <font style="color:red">*</font>
								</td>
								<td align="right" >หน่วยงาน :&nbsp;</td>
								<td  height="25">
									<input type="text" name="staff_offname" id="staff_offname" class="textview" size="31" value="" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" >
								</td>
                			</tr>
							<tr>
								<td align="right">รหัสสายตรวจ :&nbsp;</td>
								<td height="25"  >
								   <input type="text" name="inspector_code" size="10"  class="textbox AlignRight"  value="" onkeypress="ChkMinusDbl(this);" >
								   <input type="hidden" name="inspector_name" value="" />
								   <font style="color:red">*</font>
								</td>
								<td align="right">&nbsp;</td>
								<td height="25"  >
									<input type="checkbox" name="status" >ยกเลิกคำสั่ง</input>
									&nbsp;&nbsp;&nbsp;&nbsp;
									วันที่ยกเลิก :&nbsp;
								   	<input name="cancel_date" id="cancel_date" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value=""     />
		  							<a href="javascript:NewCssCal('cancel_date','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" /></a>
								</td>

                			</tr>
							<tr><td colspan="4" align="center">&nbsp;</td></tr>
                		</table>
					</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
						<table border="0" cellpadding="0" cellspacing="0">
							<tr>
								 <td>
									  <span class="spanLink" onClick="addlistStaff();"> เพิ่มใหม่</span> | <span class="spanLink" onclick="deleterow()">ลบรายการที่เลือก</span>
								</td>
							</tr>
							<tr>
								 <td>
									   <table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" id="divide_tab" >
											<tr>
													 <td  height="15" class="TblHeaderColumn AlignCenter">ลำดับ</td>
													 <td class="TblHeaderColumn AlignCenter"><input name="chkAll" type="checkbox" onclick="chkUncheckAll();" /></td>
													 <td  class="TblHeaderColumn ">รหัสสายตรวจ</td>
													 <td  class="TblHeaderColumn ">รหัสพนักงาน</td>
													 <td  class="TblHeaderColumn ">ชื่อ-สกุล</td>
													 <td  class="TblHeaderColumn ">ตำแหน่ง</td>
													 <td  class="TblHeaderColumn ">ชื่อสังกัด</td>
													 <td  class="TblHeaderColumn ">สถานะนายตรวจ</td>
											  </tr>
											  <tr class="person_row" id="person_row_0">
											  <!-- 
											  		<input type="hidden" name="staff_code_team" value="" />
											  		<input type="hidden" name="title_id_team" value="" />
											  		<input type="hidden" name="inspector_team_id" value="" />
											  		<input type="hidden" name="first_name_team" value="" />
											  		<input type="hidden" name="last_name_team" value="" />
											  		<input type="hidden" name="staff_idcardno_team" value="" />
											  		<input type="hidden" name="staff_poscode_team" value="" />
											  		<input type="hidden" name="staff_offcode_team" value="" />
											     
													  <td class="TblRow AlignCenter"></td>
													  <td class="TblRow AlignCenter"><input name="chkList" type="checkbox"  /></td>
													  <td class="TblRow AlignCenter"></td>
													  <td class="TblRow AlignCenter"></td>
													  <td class="TblRow AlignLeft"></td>
													  <td class="TblRow AlignLeft"></td>
													  <td class="TblRow AlignLeft"></td>
													  <td class="TblRow AlignRight">
														<select style="width:120" >
														  <option value="0" selected>เลือก</option>
														  <option value="1">หัวหน้าสายตรวจ</option>
														  <option value="2">รองหัวหน้าสายตรวจ</option>
														  <option value="3">ประจำสายตรวจ</option>
														  <option value="4">ผู้ควบคุมสายตรวจ</option>
														</select>
													  </td> 
											      -->
											     </tr>
											</table>
									  </td>
								 </tr>
					   </table>
				</td>
              </tr>


            </table></td>
		  </tr>
		</table>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");

  frmvalidator.addValidation("appoint_no","req","กรุณาป้อน หนังสือแต่งตั้งเลขที่");
  //frmvalidator.addValidation("job_no","req","กรุณาป้อน เลขที่งาน");
  frmvalidator.addValidation("appoint_date","req","กรุณาป้อน วันที่");
  frmvalidator.addValidation("staff_name","req","กรุณาป้อน หัวหน้าฝ่าย ");
  frmvalidator.addValidation("offcode_dept","req","กรุณาป้อน สังกัด");
  frmvalidator.addValidation("offcode_div","req","กรุณาป้อน สังกัดฝ่าย ");
  frmvalidator.addValidation("inspector_code","req","กรุณาป้อน รหัสสายตรวจ ");
</script>
