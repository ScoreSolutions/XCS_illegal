<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/Master.js'></script>
<script type="text/javascript">
	function updateDutyTable(url){
		if (ValidUpdate()==true){
			document.dataform.action=url;
		    document.dataform.submit();
		}
	}
	function confirmBox(str_text,var_id,var_del){
		var r
		Master.chkRelCourt(var_id,function(data){
			if(data != ""){
				alert(data);
				r = false;
			}
			else {
				r = confirm(str_text);
		  		if(r){
		  	  	window.location.href='<c:url value="/process?action=DutyTable_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'"/>';
	  			}	
	  		}
		});		
  		return r;
	}
	function hideSaveButton(){
		document.getElementById("saveButton").style.display='none';;
	}

	function ValidInsert(){
		if (document.getElementById("duty_code").value==""){
			alert("กรุณาระบุรหัสชนิดสินค้า");
			document.getElementById("duty_code").focus();
			return false;
		}else if(document.getElementById("duty_name").value==""){
			alert("กรุณาระบุชื่อชนิดสินค้า");
			document.getElementById("duty_name").focus();
			return false;
		}else if(document.getElementById("cmbDutyGroup").value==""){
			alert("กรุณาเลือกประเภทสินค้า");
			return false;
		}else if(document.getElementById("request_date_start").value==""){
			alert("กรุณาเลือกวันที่เริ่มใช้งาน");
			return false;
		}
	}

	function ValidUpdate(){
		if (document.getElementById("Duty_codeUpdate").value==""){
			alert("กรุณาระบุรหัสชนิดสินค้า");
			document.getElementById("Duty_codeUpdate").focus();
			return false;
		}else if(document.getElementById("Duty_nameUpdate").value==""){
			alert("กรุณาระบุชื่อชนิดสินค้า");
			document.getElementById("Duty_nameUpdate").focus();
			return false;
		}else if(document.getElementById("cmbDutyGroupUpdate").value==""){
			alert("กรุณาเลือกประเภทสินค้า");
			return false;
		}else if(document.getElementById("request_date_startUpdate").value==""){
			alert("กรุณาเลือกวันที่เริ่มใช้งาน");
			return false;
		}
		return true;
	}
</script>
<%@page import="com.ko.webapp.util.FormHandler"%>
<script>
	function chkDupCode(cCode, cID, txtID, btn){
		document.getElementById(btn).disabled = true;
		Master.chkDupDutyTable(cCode, cID, function(data){
			if(data != ""){
				alert(data);
				txtID.select();
			}else{
				document.getElementById(btn).disabled = false;
			}
		});
	}

	function ValidRightClick(e) {
	    if (navigator.appName == 'Netscape' && e.which == 3) {
	    	//document.getElementById("Duty_nameUpdate").select();
	    	
	        alert("no right click please");
	        return false;
	    }
	    else {
	        if (navigator.appName == 'Microsoft Internet Explorer' && event.button == 2){
	        	alert("no right click please");
	        	return false;
	        }
	    }
	    return true;
	}
</script>
<form method="post" name="dataform" action="<c:url value="/process?action=DutyTable_Master&cmd=create"/>"  >
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		<td width="100%" align="left" valign="top">
		 	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		 		<tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ชนิดสินค้า</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                 	<td>&nbsp;</td>
                  	<td >	
                  		<table border="0" width="800" cellpadding="0" cellspacing="0">
                  			<tr>
                  			  <td>
                  				<table class="tableList" width="850" border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                  				  <tr>
                              		<td width="100" class="TblHeaderColumn AlignCenter">&nbsp;</td>
                              		<td width="100" class="TblHeaderColumn">รหัสชนิดสินค้า</td>
                              		<td width="250" class="TblHeaderColumn">ชื่อชนิดสินค้า</td>
                              		<td width="150" class="TblHeaderColumn">ประเภทชนิดสินค้า</td>
                              		<td width="150" class="TblHeaderColumn">วันที่เริ่มใช้</td>
                              		<td width="150" class="TblHeaderColumn">วันที่สิ้นสุด</td>
                            	  </tr>
                  				  <tr><td colspan="6">&nbsp;</td></tr>
                  				  <tr <c:if test="${duty.id != param.id}">style='display:none'</c:if> >
                              		  <td align="center"><span class="spanLink"><input type="submit" class="barButton" name="save" id ="save" value="บันทึก" onClick="return ValidInsert();" /></span></td>
                              		  <td align="center">
	                              	   		<input type="text" name="duty_code" id="duty_code" onmousedown ="return ValidRightClick(event);"  onBlur="chkDupCode(this.value,'0',this,'save');" size="3" value="NEW" 
	                              					class="textview" OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" />
                              		  </td>
                              		  <td><input type="text" name="duty_name" id="duty_name" size="30" class="textbox" /><font color="red">*</font></td>
                              		 <td>
							  			<select name="cmbDutyGroup" id="cmbDutyGroup" style="width:200px;">		
										<option value="">เลือก</option><c:forEach items="${dutygrplist}"  var="grp" varStatus="i">
															<option value="${grp.group_id}" >${grp.group_name}</option>
										</c:forEach>
			                    		</select>                              
                              		 </td>
                              		  <td>
                              		    <input id="request_date_start" name="request_date_start" type="text" class="textdate" OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();"  value="${param.request_date_start}" /> 
													<img onclick="javascript:NewCssCal('request_date_start','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
                              		  </td>
                              		  <td>
                              		  <input id="request_date_stop" name="request_date_stop" type="text" class="textdate" OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();"  value="${param.request_date_stop}" />
													<img onclick="javascript:NewCssCal('request_date_stop','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
                              		  </td>                          		                              
                            	 </tr>
                  			 <c:forEach items="${dutylist}"  var="duty" varStatus="i">		  						
		  						<c:choose>
		  							<c:when test="${duty.id == param.id}">
			                            <tr>
			                              <input type="hidden" value="${duty.id}" name="id"/>
			                              <td align="center"><span class="spanLink"><input type="button" name="save" id="save2" class="barButton" value="แก้ไข" onclick="updateDutyTable('<c:url value="/process?action=DutyTable_Master&cmd=update"/>');"/></span></td>
			                              <td align="center">
			                              		<input type="text" name="Duty_codeUpdate" id="Duty_codeUpdate" onmousedown ="return ValidRightClick(event);" 
			                              		onBlur="chkDupCode(this.value,'${duty.id}',this,'save2');" size="10" 
												class="textview" style="text-align:center;" OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();"
			                              		value="${duty.duty_code}" /><a name="${duty.id}"/></a>
			                              </td>
			                              <td>
			                                <input type="text" name="Duty_nameUpdate" id = "Duty_nameUpdate" size="30" class="textbox" value="${duty.duty_name}" />
			                                <font color="red">*</font>
			                              </td>
			                              <td>
			                               <select name="cmbDutyGroupUpdate" id="cmbDutyGroupUpdate" style="width:200px;">		
											<option value="">เลือก</option>	                          
			                       			<c:forEach items="${dutygrplist}"  var="grp" varStatus="i">
											<option value="${grp.group_id}" <c:if test="${grp.group_id == duty.group_id}">selected</c:if> >${grp.group_name}</option>
											</c:forEach>
			                    			</select> 		                              
			                              
			                              </td>   
			                              <td>
			                               <input id="request_date_startUpdate" name="request_date_startUpdate" type="text" class="textdate" OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" value="${duty.begin_date}" /> 
													<img onclick="javascript:NewCssCal('request_date_startUpdate','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />                      
			                              </td>
			                              <td>
			                               <input id="request_date_stopUpdate" name="request_date_stopUpdate" type="text" class="textdate" OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" value="${duty.end_date}" />
													<img onclick="javascript:NewCssCal('request_date_stopUpdate','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
			                              </td>			                
			                            </tr>
		                            </c:when>
		                            <c:otherwise>
		                            	<c:if test="${(i.count % 2) == 1}">
			                            	<tr>			                            		
				                              <td class="TblRow AlignCenter"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=DutyTable_Master&id="/>${duty.id}#${duty.id}'">แก้ไข</span> | <span class="spanLink"  onclick="confirmBox('ต้องการลบข้อมูล','${duty.id}','${i.count}')">ลบ</span></td>
				                              <td class="TblRow AlignCenter">${duty.duty_code}</td>
				                              <td class="TblRow AlignLeft">${duty.duty_name }</td>
				                              <td class="TblRow AlignLeft">${duty.group_name}</td>
				                              <td class="TblRow AlignCenter">${duty.begin_date}</td>
											  <td class="TblRow AlignCenter">${duty.end_date}</td>
				                            </tr>
	                            		</c:if>
	                            		<c:if test="${(i.count % 2) == 0}">
	                            			<tr>
				                              <td class="TblRow AlignCenter bgRowGray"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=DutyTable_Master&id="/>${duty.id}#${duty.id}';">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${duty.id}','${i.count}')">ลบ</span></td>
				                              <td class="TblRow AlignCenter bgRowGray">${duty.duty_code}</td>
				                              <td class="TblRow AlignLeft bgRowGray">${duty.duty_name}</td>
				                              <td class="TblRow AlignLeft bgRowGray">${duty.group_name}</td>
				                              <td class="TblRow AlignCenter bgRowGray">${duty.begin_date}</td>			                              	
				                              <td class="TblRow AlignCenter bgRowGray">${duty.end_date}</td>	
				                            </tr>
	                            		</c:if>
		                            </c:otherwise>
		  						</c:choose>
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