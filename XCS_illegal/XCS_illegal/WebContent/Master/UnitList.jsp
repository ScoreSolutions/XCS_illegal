<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/Master.js'></script>
<script type="text/javascript">
	function updateData(url){
		//if(document.dataform.onsubmit()){
		if(document.dataform.thnameUpdate.value == ""){
			alert("กรุณาป้อนชื่อไทย");
			document.dataform.thnameUpdate.focus();
		}else if(document.dataform.ennameUpdate.value == ""){
			alert("กรุณาป้อนชื่อภาษาอังกฤษ");
			document.dataform.ennameUpdate.focus();
		}else if(document.dataform.abbnameUpdate.value == ""){
			alert("กรุณาป้อนชื่อย่อ");
			document.dataform.abbnameUpdate.focus();
		}else{
			document.dataform.action=url;
		    document.dataform.submit();
		}
		//}
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
		  	  	window.location.href='<c:url value="/process?action=UnitList_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'"/>';
	  			}	
	  		}
		});		
  		return r;
	}
	function hideSaveButton(){
		document.getElementById("saveButton").style.display='none';;
	}
	
</script>
<%@page import="com.ko.webapp.util.FormHandler"%>

<%
	FormHandler formHandler = new FormHandler(request);
%>
<script>
	function chkDupUnit(cName, cID, txtID, btn,fldName){
		document.getElementById(btn).disabled = true;
		if(fldName == "TH"){
			Master.chkDupUnitTh(cName, cID, function(data){
				if(data != ""){
					alert(data);
					txtID.select();
				}else{
					document.getElementById(btn).disabled = false;
				}
			});	
		}else if(fldName == "EN"){
			Master.chkDupUnitEn(cName, cID, function(data){
				if(data != ""){
					alert(data);
					txtID.select();
				}else{
					document.getElementById(btn).disabled = false;
				}
			});	
		}else if(fldName == "ABB"){
			Master.chkDupUnitAbb(cName, cID, function(data){
				if(data != ""){
					alert(data);
					txtID.select();
				}else{
					document.getElementById(btn).disabled = false;
				}
			});	
		}
	}
</script>

<form method="post" name="dataform" action="<c:url value="/process?action=UnitList_Master&cmd=create"/>" >
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td width="100%" align="left" valign="top">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
                  		<td width="1%">&nbsp;</td>
                  		<td width="99%"><span class="websitename">หน่วยนับ</span></td>
                	</tr>
                	<tr><td colspan="2">&nbsp;</td></tr>
                	<tr>
              			<td>&nbsp;</td>  	
                		<td>
                			<table border="0" width="850" cellpadding="0" cellspacing="0">
                				<tr>
                					<td>
                						<table class="tableList" width="850" border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                							<tr>
                              					<td width="150" class="TblHeaderColumn AlignCenter">&nbsp;</td>
                              					<td width="100" class="TblHeaderColumn">รหัสหน่วยนับ</td>
                              					<td width="150" class="TblHeaderColumn">ชื่อหน่วยนับไทย</td>
                              					<td width="150" class="TblHeaderColumn">ชื่อหน่วยนับอังกฤษ</td>
                              					<td width="100" class="TblHeaderColumn">ชื่อหน่วยนับย่อ</td>
                            				</tr>
                							<tr><td colspan="4">&nbsp;</td></tr>
                							
                							<tr <c:if test="${unit.id != param.id}" >style="display:none"</c:if>  >
                              					<td align="center"><span class="spanLink"><input type="submit" class="barButton" name="save" id ="save" value="บันทึก"/></span></td>
                              					<td align="center">
	                              					<input type="text" name="unit_code" id="unit_code" 
	                              						size="3" value="NEW" class="textview" maxlength="3" 
														OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" />
                              					</td>
                              					<td>
                              						<input type="text" name="thname" id="thname" size="25" class="textbox"
                              						onBlur="chkDupUnit(this.value, '0', this, 'save','TH');" />
                              						<font color="red">*</font>
                              					</td>
                              					<td>
                              						<input type="text" name="enname" size="25" class="textbox"
                              						onBlur="chkDupUnit(this.value, '0', this, 'save','EN');"  />
                              						<font color="red">*</font>
                              					</td>
                              					<td>
                              						<input type="text" name="abbname" size="25" class="textbox"
                              						onBlur="chkDupUnit(this.value, '0', this, 'save','ABB');"  />
                              						<font color="red">*</font>
                              					</td>
                            				 </tr>
                						     <c:forEach items="${unitlist}"  var="unit" varStatus="i">
		  									 <!-- odd row -->
		  						
		  									 <c:choose>
		  									 <c:when test="${unit.id == param.id}">
			                            	 <tr>
			                              		<input type="hidden" value="${unit.id}" name="id"/>
			                              		<td align="center"><span class="spanLink"><input type="button" name="save" id="save2" class="barButton" value="แก้ไข" onclick="updateData('<c:url value="/process?action=UnitList_Master&cmd=update"/>');"/></span></td>
			                              		<td align="center">${unit.unit_code}			                              			
			                              		</td>
			                              		<td>
			                                		<input type="text" name="thnameUpdate" id="thnameUpdate" size="25" class="textbox" value="${unit.thname}"
			                                		onBlur="chkDupUnit(this.value, '${unit.id}', this, 'save','TH');" />
			                                		<font color="red">*</font>
			                              		</td>
			                              		<td>
			                                		<input type="text" name="ennameUpdate" id="ennameUpdate" size="25" class="textbox" value="${unit.enname}"
			                                		onBlur="chkDupUnit(this.value, '${unit.id}', this, 'save','EN');" />
			                                		<font color="red">*</font>
			                              		</td>                    
			                              		<td>
			                                		<input type="text" name="abbnameUpdate" id="abbnameUpdate" size="25" class="textbox" value="${unit.abbname}" 
			                                		onBlur="chkDupUnit(this.value, '${unit.id}', this, 'save','ABB');"  />
			                                		<font color="red">*</font>
			                              		</td>  
			                            	 </tr>
		                            		 </c:when>
		                            		 <c:otherwise>
		                            		 <c:if test="${(i.count % 2) == 1}">
			                            		<tr>
				                              		<td class="TblRow AlignCenter"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=UnitList_Master&id="/>${unit.id}#${unit.id}'">แก้ไข</span> | <span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=UnitList_Master&cmd=view&id="/>${unit.id}#${unit.id}'">สินค้า</span> | <span class="spanLink"  onclick="confirmBox('ต้องการลบข้อมูล','${unit.id}','${i.count}')">ลบ</span></td>
				                              		<td class="TblRow AlignCenter">${unit.unit_code}</td>
				                              		<td class="TblRow AlignLeft">${unit.thname}</td>
				                              		<td class="TblRow AlignLeft">${unit.enname}</td>
				                              		<td class="TblRow AlignLeft">${unit.abbname}</td>
				                            	</tr>
	                            			</c:if>
	                            			<c:if test="${(i.count % 2) == 0}">
	                            				<tr>
				                              		<td class="TblRow AlignCenter bgRowGray"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=UnitList_Master&id="/>${unit.id}#${unit.id}';">แก้ไข</span> | <span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=UnitList_Master&cmd=view&id="/>${unit.id}#${unit.id}'">สินค้า</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${unit.id}','${i.count}')">ลบ</span></td>
				                              		<td class="TblRow AlignCenter bgRowGray">${unit.unit_code}</td>
				                              		<td class="TblRow AlignLeft bgRowGray">${unit.thname}</td>
				                              		<td class="TblRow AlignLeft bgRowGray">${unit.enname}</td>
				                              		<td class="TblRow AlignLeft bgRowGray">${unit.abbname}</td>
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

<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform");
  //if(document.dataform.id != null){
//	  	frmvalidator.addValidation("unit_codeUpdate","req","กรุณาป้อนข้อมูล รหัสหน่วยนับ");
//		frmvalidator.addValidation("thnameUpdate","req","กรุณาป้อนข้อมูล ชื่อหน่วยนับไทย");
//		frmvalidator.addValidation("ennameUpdate","req","กรุณาป้อนข้อมูล ชื่อหน่วยนับอังกฤษ");
//		frmvalidator.addValidation("abbnameUpdate","req","กรุณาป้อนข้อมูล ชื่อหน่วยนับย่อ");
//  }else{
		frmvalidator.addValidation("unit_code","req","กรุณาป้อนข้อมูล รหัสหน่วยนับ");
		frmvalidator.addValidation("thname","req","กรุณาป้อนข้อมูล ชื่อหน่วยนับไทย");
		frmvalidator.addValidation("enname","req","กรุณาป้อนข้อมูล ชื่อหน่วยนับอังกฤษ");
		frmvalidator.addValidation("abbname","req","กรุณาป้อนข้อมูล ชื่อหน่วยนับย่อ");
 // }
</script>