<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<%@ page import="java.util.Date" %>
<script type="text/javascript">
function updateCourt(url){
	if(document.dataform.onsubmit()){
		document.dataform.action=url;
	    document.dataform.submit();
	}
}

function cancelCommand(){
	var conf = confirm('ยืนยันการยกเลิกคำสั่ง');
	if(conf == true){
		location.href='<c:url value="/process?action=InspectorTeamList_Master&cmd=cancelCommand&id=${inspec.id }" />';
	}
}

function addlistStaff(){
	if(document.dataform.inspector_code.value){
		var data = window.showModalDialog('process?action=Divide_staff_poplist', self, 'dialogWidth=700px,Height=400px');
		if (data) {
			var base = jQuery(".person_row").size();
			for (var i = 0; i < data.length; i++) {
				var index = base + i+1;
				var newRow = jQuery("<tr/>");
				newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").html(index));
				newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").append(jQuery("<input type='checkbox'/>").attr('name','chkList').attr('value','add')));
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
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'id_inspecStaff',value:'add'}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_code_team',value:data[i][3]}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'title_id_team',value:data[i][12]}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'inspector_team_id',value:document.dataform.inspector_code.value}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'first_name_team',value:data[i][10]}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'last_name_team',value:data[i][11]}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_idcardno_team',value:data[i][5]}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_poscode_team',value:data[i][6]}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_offcode_team',value:data[i][7]}));
			//newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'deleteid',value:'del'}));
			
				jQuery("#divide_tab").append(jQuery('<tr/>').addClass('person_row').attr('id', 'person_row_'+index).html(newRow.html().replace(/n_ame/g, 'name')));
			}
		}
	}else{
		alert("กรุณาป้อนรหัสสายตรวจ");
		document.dataform.inspector_code.focus();
	}
}

function deleterow(id) {  
	alert("mu");    
    jQuery(".person_row:has(:checked)").remove();
    jQuery(".person_row").each(function(index) {
        var i = index+1;
        var row = jQuery(this);
        row.attr('id', 'person_row_' + i);
        row.find('td').first().html(i);
        //row.find('td > [name=order_seq]').attr('value', i);;;;;;
    });
}

function chkUncheckAll() {

    if (jQuery("input[name=chkAll]").attr('checked')) {
        jQuery("input[name = 'chkList']").attr('checked', true);    
    } else {
        jQuery("input[name = 'chkList']").attr('checked', false);    
    }
   
}
function backSearch(){
	  window.location.href='<c:url value="/process?action=InspectorTeamList_Master" />';
}
function openPopSub(){
	var subOffcode = document.dataform.offcode_dept.value;
	window.open('process?action=Ed_office_pop&formcode=offcode_div&formname=offcode_divname&sub_offcode=' + subOffcode + '&cmd=listSub', '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');
}
</script>
<%@page import="com.ko.webapp.util.FormHandler"%>
<%
	FormHandler formHandler = new FormHandler(request);
%>
<form name="dataform" method="post" action="<c:url value="process?action=InspectorTeamList_Master&cmd=update&id=${inspec.id }" />" >
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
					<input id="btnSave" name="btnSave"  type="submit" class="barbutton" value="บันทึก" >
					<input id="btnCancelEdit" name="btnCancelEdit"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="location.href='<c:url value="/process?action=InspectorTeamList_Master&cmd=view&id=${inspec.id }" />';">
					<input name="btnBack"  type="button" class="barbutton" value="กลับหน้าค้นหา" onclick="backSearch();">
					<input id="btnCancel" name="btnCancel"  type="button" class="barbutton" value="ยกเลิกคำสั่ง" onclick="cancelCommand();" > 
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
									<input id="appointNo" name="appoint_no" type="text" class="textbox AlignRight" value="${inspec.appoint_no }" size="10"  />
									<font style="color:red">*</font>
								</td>
								<td width="20%" align="right" >เลขที่งาน :&nbsp;</td>
								<td width="30%" height="25">
									<input name="job_no" type="text" id="job_no" class="textView" value="${inspec.job_no }" size="30" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();"/>
								</td>
							</tr>
							<tr>
                				<td align="right">ทั้งนี้ ตั้งแต่วันที่ :&nbsp;</td>
                				<td >
									<input name="appoint_date" id="appoint_date" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${inspec.appioont_date2 }"     />
		  							<a href="javascript:NewCssCal('appoint_date','ddmmyyyy')"><img id="imgAppointDate" src="images/btn_calendar.png" alt="" width="19" height="19" border="0" /></a>
									<font style="color:red">*</font>&nbsp;&nbsp;
									<c:if test="${inspec.status == '0'}">
										วันที่สิ้นสุดคำสั่ง :&nbsp;
										<input name="cancel_date" id="cancel_date" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${inspec.cancel_date2 }"  />
										
									</c:if>
								</td>
								<td align="right" >หัวหน้าฝ่าย :&nbsp;</td>
								<td  height="25">
									<input type="text" name="staff_name" id="staff_name" class="textview" size="31" value="${inspec.leader_name }" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" >
									<input type="hidden" name="staff_idcardno_leader" id="staff_idcardno_leader" value="${inspec.staff_idcardno_leader}" />
									<input type="hidden" name="poscode_leader" id="poscode_leader" value="${inspec.poscode_leader}" />
									<input type="hidden" name="offcode_leader" id="offcode_leader" value="${inspec.offcode_leader}" />
				
								   <img id="imgStaffName" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
										onClick="window.open('process?action=Divide_staff_pop&formname=staff_name&id=staff_idcardno_leader&poscode=poscode_leader&posname=staff_posname&offname=staff_offname&offcode=offcode_leader' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,,modal=yes');"  />
										<font style="color:red">*</font>
								</td>
							</tr>
							<tr>
								<td align="right">สังกัด :&nbsp;</td>
								<td height="25" >
									<c:if test="${IsAdmin == '1'}">
										<input id="offcode_dept" type="text" name="offcode_dept" size="4"  class="textbox"  value="${inspec.offcode_dept }"  onBlur="getOffname(this.value,'Y',offcode_deptname);" >
								   		<img id="imgOffcodeDept" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
													onClick="window.open('process?action=Ed_office_pop&formcode=offcode_dept&formname=offcode_deptname' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,modal=yes');" >
								   		<input id="offcode_deptname" type="text" name="offcode_deptname" size="25" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" class="textview"  value="${inspec.offname_dept }" >
									</c:if>
								    <c:if test="${IsAdmin != '1'}">
								    	<input id="offcode_dept" type="text" name="offcode_dept" size="6" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" class="textview"  value="${inspec.offcode_dept }" >
								   		<input id="offcode_deptname" type="text" name="offcode_deptname" size="35" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" class="textview"  value="${inspec.offname_dept }" >
								    </c:if>
								   <font style="color:red">*</font>
								</td>
								<td align="right" >ตำแหน่ง :&nbsp;</td>
								<td  height="25">
									<input type="text" name="staff_posname" id="staff_posname" class="textview" size="31" value="${inspec.posname }" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();">
								</td>
                			</tr>
                			<tr>
                				<td align="right">สังกัดฝ่าย :&nbsp;</td>
								<td height="25" >
								   <input id="offcode_div" type="text" name="offcode_div" size="4"  class="textbox"  value="${inspec.offcode_div }" onBlur="getOffname(this.value,'Y',offcode_divname);" >
								   <img id="imgOffcodeDiv" src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
													onClick="openPopSub();" >
								   <input id="offcode_divname" type="text" name="offcode_divname" size="25"  class="textview" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${inspec.offname_div }" >
								   <font style="color:red">*</font>
								</td>
								<td align="right" >หน่วยงาน :&nbsp;</td>
								<td  height="25">
									<input type="text" name="staff_offname" id="staff_offname" class="textview" size="31" value="${inspec.offname}" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" >
								</td>
                			</tr>
							<tr>
								<td align="right">รหัสสายตรวจ :&nbsp;</td>
								<td height="25"  >
								   <input id="inspector_code" type="text" name="inspector_code" size="10"  class="textbox AlignRight"  onkeypress="ChkMinusDbl(this);" value="${inspec.inspector_code }" >
								   <font style="color:red">*</font>
								</td>
								<td align="right">&nbsp;</td>
								<td height="25"  >
									<input type="checkbox" name="status" <c:if test="${inspec.status=='0'}">checked</c:if> >ยกเลิกคำสั่ง</input>
									&nbsp;&nbsp;&nbsp;&nbsp;
									วันที่ยกเลิก :&nbsp;
								   	<input name="cancel_date" id="cancel_date" type="text" class="textdate" onKeyPress="window.event.keyCode = 0" onKeyDown="disableKeyDown();" value="${inspec.cancel_date2 }"     />
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
							<tr id="likListNew">
								 <td>
									  <span class="spanLink" onClick="addlistStaff();"> เพิ่มใหม่</span> | <span class="spanLink" onclick="updateCourt('<c:url value='process?action=InspectorTeamList_Master&cmd=update&id=${inspec.id }' />');">ลบรายการที่เลือก</span>
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
												 <input type="hidden" name="deleteid" value="" />
											</tr>
									<c:forEach items="${inspecstaff}"  var="ipstaff" varStatus="i">
											  <tr class="person_row" id="person_row_${i.count}">
											           <input type="hidden" name="id_inspecStaff" value="${ipstaff.id}" />
											           <input type="hidden" name="staff_code_team" value="${ipstaff.staff_code}" />
											           <input type="hidden" name="title_id_team" value="${ipstaff.title_id}" />
											           <input type="hidden" name="inspector_team_id" value="${ipstaff.inspector_team_id}" />
											           <input type="hidden" name="first_name_team" value="${ipstaff.first_name}" />
											           <input type="hidden" name="last_name_team" value="${ipstaff.last_name}" />
											           <input type="hidden" name="staff_idcardno_team" value="${ipstaff.staff_idcardno}" />
											           <input type="hidden" name="staff_poscode_team" value="${ipstaff.staff_poscode}" />
											           <input type="hidden" name="staff_offcode_team" value="${ipstaff.staff_offcode}" />
											           <input type="hidden" name="status" value="${ipstaff.status}" />
											           
											    
													  <td class="TblRow AlignCenter">${i.count}</td>
													  <td class="TblRow AlignCenter"><input name="chkList" type="checkbox" value="${ipstaff.id}" /></td>
													  <td class="TblRow AlignCenter">${inspec.inspector_code }</td>
													  <td class="TblRow AlignCenter">${ipstaff.staff_idcardno }</td>
													  <td class="TblRow AlignLeft">${ipstaff.title_name }${ipstaff.first_name } ${ipstaff.last_name }</td>
													  <td class="TblRow AlignLeft">${ipstaff.posname }</td>
													  <td class="TblRow AlignLeft">${ipstaff.offname }</td>
													  <td class="TblRow AlignRight">
														<select style="width:120" <c:if test="${inspec.status == '0'}">disabled</c:if> >
														  <option value="0"  <c:if test="${ipstaff.status == 0}"></c:if>>เลือก</option>
														  <option value="1" <c:if test="${ipstaff.status == 1}">selected</c:if> >หัวหน้าสายตรวจ</option>
														  <option value="2" <c:if test="${ipstaff.status == 2}">selected</c:if> >รองหัวหน้าสายตรวจ</option>
														  <option value="3" <c:if test="${ipstaff.status == 3}">selected</c:if> >ประจำสายตรวจ</option>
														  <option value="4" <c:if test="${ipstaff.status == 4}">selected</c:if> >ผู้ควบคุมสายตรวจ</option> 
														</select>
													  </td> 
											     </tr>
										</c:forEach>	  
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
</script>

<c:if test="${inspec.status == '0'}">
	<script language="JavaScript" type="text/javascript">
		document.getElementById('btnSave').style.display='none';
		document.getElementById('btnCancelEdit').style.display='none';
		document.getElementById('btnCancel').style.display='none';
		document.getElementById('appointNo').disabled=true;
		document.getElementById('imgAppointDate').style.display='none';
		document.getElementById('imgStaffName').style.display='none';
		document.getElementById('offcode_dept').disabled=true;
		document.getElementById('imgOffcodeDept').style.display='none';
		document.getElementById('offcode_deptname').disabled=true;
		document.getElementById('offcode_div').disabled=true;
		document.getElementById('imgOffcodeDiv').style.display='none';
		document.getElementById('offcode_divname').disabled=true;
		document.getElementById('inspector_code').disabled=true;
		document.getElementById('likListNew').style.display='none';
		document.getElementById('cmbStaffStatus').disabled=true;
	</script>
</c:if>
