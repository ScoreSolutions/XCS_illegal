<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler"%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<%@ include file="/Templates/taglibs.jsp"%>

<script language="JavaScript" type="text/javascript">
function ChechList(chk){
	if(document.chkAll.checked == true){
		for (i = 0; i < chk.length; i++)
			chk[i].checked = true ;
	}else{
		for (i = 0; i < chk.length; i++)
			chk[i].checked = false ;
	}
}
function updateCourt(url){
	if(document.dataform.offcode.value != ""){
		if(document.dataform.onsubmit()){
			document.dataform.action=url;
		    document.dataform.submit();
		}
	}else{
		alert("กรุณาเลือกหน่วยงาน");
		document.dataform.offcode.select();
	}
}
function deleteData(url){
	if(document.dataform.offcode.value != ""){
		var ans = confirm("ยืนยันการลบข้อมูล");
		if(ans){
			if(document.dataform.onsubmit()){
				document.dataform.action=url;
			    document.dataform.submit();
			}
		}
	}else{
		alert("กรุณาเลือกหน่วยงาน");
		document.dataform.offcode.select();
	}
}

function addlistStaff(){
	var data = window.showModalDialog('process?action=Divide_staff_poplist', self, 'dialogWidth=700px,Height=400px');
	if (data) {
		var base = jQuery(".person_row").size();
		alert("base="+base);
		for (var i = 0; i < data.length; i++) {
			var index = base + i + 1;
			alert("index="+index);
			var newRow = jQuery("<tr/>");
			
			
			
				
			newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").html(index));
			newRow.append(jQuery("<td/>").addClass("TblRow AlignCenter").append(jQuery("<input />").attr("name", "chkList").attr("type", "checkbox")));
			newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html(data[i][9]));
			newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html(data[i][3]));
			newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html(data[i][13]));
			//newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html('test'));
			//newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html('test'));
			//newRow.append(jQuery("<td/>").addClass('TblRow AlignLeft').html('test'));
			//newRow.append(jQuery("<td/>").addClass('TblRow AlignCenter').html('test'));
			newRow.append(jQuery("<td/>").addClass('TblRow AlignRight').append(jQuery('<input/>').addClass('textNum').attr({type:'text',n_ame:'share2',value:'',size:'5'}).bind('keypress', {ctl:jQuery(this)}, ChkMinusDbl)));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_idcardno',value:data[i][5]}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_poscode',value:data[i][6]}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_offcode',value:data[i][7]}));
			newRow.append(jQuery("<input/>").attr({type:'hidden',n_ame:'staff_level',value:data[i][13]}));
			
			jQuery("#divide_tab").append(jQuery('<tr/>').addClass('person_row').attr('id', 'person_row_'+index).html(newRow.html().replace(/n_ame/g, 'name')));
		}
	}
}

function deleterow() {
    jQuery(".person_row:has(:checked)").remove();
    jQuery(".person_row").each(function(index) {
        var i = index + 1;
        var row = jQuery(this);
        row.attr('id', 'person_row_' + i);
        row.find('td').first().html(i);
        //row.find('td > [name=order_seq]').attr('value', i);
    });
}

function chkUncheckAll(prefix) {
    if (jQuery("#" + prefix).first().attr('checked')) {
        jQuery("input[name^='" + prefix + "']").attr('checked', true);
    } else {
        jQuery("input[name^='" + prefix + "']").attr('checked', false);
    }
    
}

function validateShare2(ctl){
	if(ctl.value < 0 || ctl.value > 100){
		alert("จำนวนสัดส่วนจะต้องอยู่ระหว่าง 0 ถึง 100");
		ctl.select();
	}
}

function chkSubmit(){
	if(document.dataform.offcode.value != ""){
		var rowCount = document.getElementById("divide_tab").rows.length;
		if(rowCount<=1){
			alert("กรุณาเพิ่มรายการเจ้าหน้าที่");
			document.dataform.offcode.select();
			return false;
		}else
			return true;
	}else{
		alert("กรุณาเลือกหน่วยงาน");
		document.dataform.offcode.focus();
		return false
	}
}
</script>
<%
	FormHandler formHandler = new FormHandler(request);
%>
<form method="post" name="dataform" action="<c:url value="process?action=ConfigDivideStaffList_Master&cmd=create"/>" >
      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top"> 
            
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ข้อมูลสัดส่วนการแบ่งเงินคดี พ.ร.บ.ภาษี 2527</span></td>
                </tr>
                <tr height="40">
                  <td colspan="2"><input name="btnSave"  type="submit" class="barbutton" value="บันทึก" onClick="return chkSubmit();" />
					              <input name="btnCancel"  type="button" class="barbutton" value="ยกเลิกการแก้ไข" onclick="updateCourt('<c:url value="/process?action=ConfigDivideStaffList_Master&cmd=list&offcode=${param.offcode }"/>');" >
			      </td>
			    </tr>
                <tr>
					<td>&nbsp;</td>
					<td>
						
                		<table border="0" cellpadding="0" cellspacing="0" width="700">
                			<tr height="40">
                				<td width="20%" align="right">แสดงตาม หน่วยงาน :&nbsp;</td>
                				<td width="50%">
			                        <input type="text" name="offcode" id="offcode" size="4"  class="textbox"  value="${param.offcode }" onBlur="getOffname(this.value,'Y',offname);" >
								   <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
										onClick="window.open('process?action=Ed_office_pop&formname=offname&formcode=offcode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=no, width=650,height=500,top=220,left=400,modal=yes');" >
								   <input type="text" name="offname" id="offname" size="48"  class="textview"  value="${param.offname }" >
			                        
                				</td>
                				<td width="20%"><input name="btnCancel"  type="button" class="barbutton" value="แสดงรายการ" onClick="updateCourt('<c:url value="/process?action=ConfigDivideStaffList_Master&cmd=list"/>');"/></td>
                				<td width="20%">&nbsp;</td>
                			</tr>
                		</table>
                		
					</td>
				</tr>
				<tr><td colspan="2">&nbsp;</td></tr>
				 <tr>
				   <td colspan="2">
						<!-- <span class="spanLink" onClick="addlistStaff();">เพิ่มข้อมูล</span> | -->
						<span  class="spanLink" onclick="deleteData('<c:url value="/process?action=ConfigDivideStaffList_Master&cmd=delete"/>');">ล้างจำนวนสัดส่วนรายการที่เลือก</span>
					</td>
				 </tr>
				 <tr><td colspan="2">&nbsp;</td></tr>
				<tr>
                  <td>&nbsp;</td>
                  <td >
                  
                    <table border="0" width="600" cellpadding="=0" cellspacing="0">
                      <tr>
                        <td>
                        
                          <table width="100%" border="1" id="divide_tab" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC" >
                          
                             <tr height="25">
							  <td width="50" class="TblHeaderColumn" >ลำดับ</td>
							  <td width="30" class="TblHeaderColumn"  >
							  		<input name="chkList" type="checkbox" id="chkList" onclick="chkUncheckAll('chkList');" value="0" />
							  </td>
							  <td width="130" class="TblHeaderColumn" >ชื่อ-สกุล</td>
                              <td width="200" class="TblHeaderColumn" >ตำแหน่ง</td>
                              <td width="80" class="TblHeaderColumn" >ระดับ</td>
                              <td width="80" class="TblHeaderColumn" >จำนวนส่วน</td>  
                            </tr>
                            <c:forEach items="${ListconfigDS}"  var="configDS"  varStatus="i" >
                            <tr class="person_row" id="person_row_${i.count}">
                              <input name="staff_idcardno" type="hidden" value="${configDS.idcard_no}"/>
                              <input name="staff_poscode" type="hidden" value="${configDS.poscode}"/>
                              <input name="staff_offcode" type="hidden" value="${configDS.offcode}"/>
                              <input name="configID" type="hidden" value="${configDS.id}"/>
                              <td class="TblRow AlignCenter">${i.count}</td>
							  <td class="TblRow AlignCenter"><input name="chkList" type="checkbox" value="${configDS.id}" /></td>
                              <td class="TblRow AlignLeft">${configDS.title_name }${configDS.first_name } ${configDS.last_name }</td>
                              <td class="TblRow AlignLeft">
                              	<input name="staff_posname" type="text" size="25" value="${configDS.posname}"/>
                              </td>
							  <td class="TblRow AlignLeft"">
							  	<input name="staff_level" type="text" size="15" value="${configDS.staff_level}"/>
							  </td>
							  <td class="TblRow AlignRight"><input name="share2" id="share2" type="text" class="textNum" value="${configDS.share2 }" size="5" OnKeyPress="ChkMinusDbl(this);" onBlur="validateShare2(this);" /></td>
                            </tr>
                            </c:forEach>
                            
                        
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
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
</script>
