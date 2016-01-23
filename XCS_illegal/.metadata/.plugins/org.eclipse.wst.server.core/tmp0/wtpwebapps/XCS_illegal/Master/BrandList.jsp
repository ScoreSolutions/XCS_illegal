<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/Master.js'></script>

<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">
function updatedata(url){
	//alert(url);
	//if(document.dataform.onsubmit()){
	if(document.dataform.cmbDutyGroup.value=="000"){
		alert("กรุณาเลือกประเภทสินค้า");
		document.dataform.cmbDutyGroup.select();
		return;
	}
	else if(document.dataform1.brand_codeUpdate.value==""){
		alert("กรุณากรอกรหัสยี่ห้อ");
		document.dataform1.brand_codeUpdate.focus();
		return;
	}else if(document.dataform1.request_date_startUpdate.value==""){
		alert("กรุณาเลือกวันที่เริ่มใช้");
		document.dataform1.request_date_startUpdate.focus();
		return;
	}else{
		document.dataform1.action=url;
	    document.dataform1.submit();
	}
	//}
}


function CheckSelectGroupID(){
	var groupID = document.getElementById("cmbDutyGroup");
	if (groupID.value == "000"){
		alert("กรุณาเลือกประเภทสินค้า");
		return false;
	}else{
		return true;
	}
}

	function confirmBox(str_text,var_id,var_del,var_grp){
		var r
		Master.chkRelCourt(var_id,function(data){
			if(data != ""){
				alert(data);
				r = false;
			}
			else {
				r = confirm(str_text);
		  		if(r){
		  	  	window.location.href='<c:url value="/process?action=BrandList_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'&idgrp='+var_grp+'"/>';
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
<script>
	function chkDupBrand(cName,cGrpID, cID, txtID, btn, fldName){
		document.getElementById(btn).disabled = true;
		//alert(cName);
		if(fldName=="TH"){
			Master.chkDupBrandTH(cName,cGrpID, cID, function(data){
				if(data != ""){
					alert(data);
					txtID.select();
				}else{
					document.getElementById(btn).disabled = false;
				}
			});
		}else if(fldName=="EN"){
			Master.chkDupBrandEN(cName,cGrpID, cID, function(data){
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
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		 <td width="100%" align="left" valign="top"> 
		 	 <table width="100%" border="0" cellspacing="0" cellpadding="0">
		 	 	<tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ยี่ห้อ</span></td>
                </tr>
		 	 	<tr><td colspan="2">&nbsp;</td></tr>
		 	 	<tr>
					<td>&nbsp;</td>
					<td>
						<form method="post" name="dataform" action="<c:url value="/process?action=BrandList_Master&cmd=list"/>" >
                		<table border="0" cellpadding="0" cellspacing="0" width="800">
                			<tr>
                				<td width="20%" align="right">ประเภทสินค้า :&nbsp;&nbsp;</td>
                				<td width="100%" valign="bottom">
			                        <select name="cmbDutyGroup" id="cmbDutyGroup" style="width:200px;height:20px" >		
										<option value="000" selected >เลือก</option>
										<c:forEach items="${dutylist}" var="grp" varStatus="i">
										   <option value=${grp.group_id} <c:if test="${grp.group_id == cmbDutyGroup}">selected</c:if>>${grp.group_name}</option>
										</c:forEach>
			                    	</select>&nbsp;&nbsp;
			                        <input type="image" src="images/btn_search_big.png" value="submit" alt="Submit" >
                				</td>                				  
                			</tr>                			
                		</table>
                		</form> 
					</td>
				</tr>				
				<tr><td colspan="2">&nbsp;</td></tr>
				<tr>
				  <td>&nbsp;</td>
                  <td >
                  <table width="800" >
                  	<tr></tr>
                  	<tr></tr>
                  	<tr  align="left" valign="top">
						<td colspan="4"><%=pageUtil.getPagination()%></td>
						<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
					</tr>
                  </table>
                  <form method="post" name="dataform1" action="<c:url value="/process?action=BrandList_Master&cmd=create"/>" >  
              		<input type="hidden" name="cmbDutyGroupCreate" value="${param.cmbDutyGroup}" />                 		               	
                  		<table class="tableList"  border="1" width="800" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">                  		 
                  		 <tr>
                              		<td width="100" class="TblHeaderColumn AlignCenter">&nbsp;</td>
                              		<td width="100" class="TblHeaderColumn">รหัสยี่ห้อ</td>
                              		<td width="200" class="TblHeaderColumn">ชื่อยี่ห้อไทย</td>
                              		<td width="200" class="TblHeaderColumn">ชื่อยี่ห้ออังกฤษ</td>
                              		<td width="150" class="TblHeaderColumn">วันที่เริ่มใช้</td>
                              		<td width="150" class="TblHeaderColumn">วันที่สิ้นสุด</td>
                         </tr>
                  		<tr><td colspan="6">&nbsp;</td></tr>                  	
                  		<tr <c:if test="${brand.id != param.id}" >style="display:none"</c:if>  >                  		                           
                              		  <td align="center"><span class="spanLink"> <input type="submit" class="barButton" name="save" id ="save" value="บันทึก" onClick="return CheckSelectGroupID();"  /></span></td>
                              		  <td align="center">
	                              	   		<input type="text" name="brand_code" id="brand_code"  size="3" value="NEW" 
	                              	   			OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();"
	                              					class="textview" maxlength="3"  />
                              		  </td>
                              		  <td>
                              		  		<input type="text" name="brand_thai" id="brand_thai" size="25" class="textbox"
                              		  		onBlur="chkDupBrand(this.value,'${param.cmbDutyGroup}','0',this,'save','TH');" />
                              		  		<font color="red">*</font>
                              		  </td>
                              		  <td>
                              		  	<input type="text" name="brand_eng" id="brand_eng" size="25" class="textbox"
                              		  	onBlur="chkDupBrand(this.value,'${param.cmbDutyGroup}','0',this,'save','EN');" />
                              		  	<font color="red">*</font></td>
                              		  <td>
                              		    <input id="request_date_start" name="request_date_start" type="text" class="textdate" readonly value="${param.request_date_start}" /> 
													<img onclick="javascript:NewCssCal('request_date_start','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
													<font color="red">*</font>
                              		  </td>
                              		  <td>
                              		  <input id="request_date_stop" name="request_date_stop" type="text" class="textdate" readonly value="${param.request_date_stop}" />
													<img onclick="javascript:NewCssCal('request_date_stop','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
                              		  </td>                                                		                              
                           </tr>                         
                            <c:forEach items="${BrandListData}"  var="brand" varStatus="i">
		  						<!-- odd row -->
		  						
		  						<c:choose>
		  							<c:when test="${brand.id == param.id}">
			                            <tr>
			                              <input type="hidden" value="${brand.id}" name="id"/>
			                              <input type="hidden" value="${brand.group_id}" name="group_id"/>
			                              <td align="center">
			                              <span class="spanLink"><input type="button" name="save" id="save2" class="barButton" value="แก้ไข" 
			                              		onclick="updatedata('<c:url value="/process?action=BrandList_Master&cmd=update"/>');"/>
			                              	</span></td>
			                              <td align="center">
			                              		<input type="text" name="brand_codeUpdate" id="brand_codeUpdate" style="text-align:center;" 
			                              		size="3" class="textview"
			                              		OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" 			                              		
			                              		value="${brand.brand_main_code}" maxlength="3" /><a name="${brand.id}"/></a>
			                              </td>
			                              <td>
			                                <input type="text" name="brand_nameThaiUpdate" id = "brand_nameThaiUpdate" size="25" class="textbox" value="${brand.brand_main_thai}"
			                                onBlur="chkDupBrand(this.value,'${brand.group_id}','${brand.id}',this,'save2','TH');"
			                                 />
			                                <font color="red">*</font>
			                              </td>
			                             <td>
			                                <input type="text" name="brand_nameEngUpdate" id = "brand_nameEngUpdate" size="25" class="textbox" value="${brand.brand_main_eng}"
			                                onBlur="chkDupBrand(this.value,'${brand.group_id}','${brand.id}',this,'save2','EN');" />
			                                <font color="red">*</font>
			                              </td>
			                              <td>
			                               	<input id="request_date_startUpdate" name="request_date_startUpdate" type="text" class="textdate"  value="${brand.begin_date}"
			                               	OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" 	 /> 
													<img onclick="javascript:NewCssCal('request_date_startUpdate','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" /> 
													<font color="red">*</font>                     
			                              </td>
			                              <td>
			                               	<input id="request_date_stopUpdate" name="request_date_stopUpdate" type="text" class="textdate"  value="${brand.end_date}"
			                               	OnKeyPress="txtKeyPress(event);" onKeyDown="disableKeyDown();" 	 />
													<img onclick="javascript:NewCssCal('request_date_stopUpdate','ddmmyyyy')" src="images/btn_calendar.png" alt="" width="19" height="19" align="middle" style="cursor:hand" />
			                              </td>			                
			                            </tr>
		                            </c:when>
		                            <c:otherwise>
		                            	<c:if test="${(i.count % 2) == 1}">
			                            	<tr>			                            		
				                              <td class="TblRow AlignCenter"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=BrandList_Master&cmd=list&id=${brand.id}&group_id=${brand.group_id}&_page=${_page}"/>'">แก้ไข</span> | <span class="spanLink"  onclick="confirmBox('ต้องการลบข้อมูล','${brand.id}','${i.count}','${brand.group_id}')">ลบ</span></td>
				                              <td class="TblRow AlignCenter">${brand.brand_main_code}</td>
				                              <td class="TblRow AlignLeft">${brand.brand_main_thai}</td>
				                              <td class="TblRow AlignLeft">${brand.brand_main_eng}</td>
				                              <td class="TblRow AlignCenter">${brand.begin_date}</td>
											  <td class="TblRow AlignCenter">${brand.end_date}</td>
				                            </tr>
	                            		</c:if>
	                            		<c:if test="${(i.count % 2) == 0}">
	                            			<tr>
				                              <td class="TblRow AlignCenter bgRowGray"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=BrandList_Master&cmd=list&id=${brand.id}&group_id=${brand.group_id}&_page=${_page}"/>'">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${brand.id}','${i.count}','${brand.group_id}')">ลบ</span></td>
				                              <td class="TblRow AlignCenter bgRowGray">${brand.brand_main_code}</td>
				                              <td class="TblRow AlignLeft bgRowGray">${brand.brand_main_thai}</td>
				                              <td class="TblRow AlignLeft bgRowGray">${brand.brand_main_eng}</td>
				                              <td class="TblRow AlignCenter bgRowGray">${brand.begin_date}</td>			                              	
				                              <td class="TblRow AlignCenter bgRowGray">${brand.end_date}</td>	
				                            </tr>
	                            		</c:if>
		                            </c:otherwise>
		  						</c:choose>
							</c:forEach>             	 
                  		 </table>  
                   </form>           		 
                    </td>			
				</tr>	 		 	 
		 	 </table>		 
		 </td>		
	</tr>
</table>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("dataform1");
  if(document.dataform1.id.value != null){
		frmvalidator.addValidation("brand_codeUpdate","req","กรุณาป้อนข้อมูล รหัสยี่ห้อ");
		//frmvalidator.addValidation("brand_nameThaiUpdate","req","กรุณาป้อนข้อมูล ชื่อยี่ห้อไทย");
		//frmvalidator.addValidation("brand_nameEngUpdate","req","กรุณาป้อนข้อมูล ชื่อยี่ห้ออังกฤษ");
		frmvalidator.addValidation("request_date_startUpdate","req","กรุณาป้อนข้อมูล วันที่เริ่มใช้");
  }else{
	  	frmvalidator.addValidation("brand_code","req","กรุณาป้อนข้อมูล รหัสยี่ห้อ");
		//frmvalidator.addValidation("brand_thai","req","กรุณาป้อนข้อมูล ชื่อยี่ห้อไทย");
		//frmvalidator.addValidation("brand_eng","req","กรุณาป้อนข้อมูล ชื่อยี่ห้ออังกฤษ");
		frmvalidator.addValidation("request_date_start","req","กรุณาป้อนข้อมูล วันที่เริ่มใช้");
  }

  var frmdataform  = new Validator("dataform");
  frmdataform.addValidation("cmbDutyGroup","dontselect=000","กรุณาเลือกประเภทสินค้า");

</script>
