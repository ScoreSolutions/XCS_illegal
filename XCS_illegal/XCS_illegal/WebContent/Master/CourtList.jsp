<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/Master.js'></script>
<script type="text/javascript">
	function updateCourt(url){
		if(document.dataform.onsubmit()){
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
		  	  	window.location.href='<c:url value="/process?action=CourtList_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'"/>';
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
	function chkDupCode(cCode, cID, txtID, btn){
		document.getElementById(btn).disabled = true;
		Master.chkDupCourt(cCode, cID, function(data){
			if(data != ""){
				alert(data);
				txtID.select();
			}else{
				document.getElementById(btn).disabled = false;
			}
		});
		
	}
</script>
<form method="post" name="dataform" action="<c:url value="/process?action=CourtList_Master&cmd=create"/>" >
      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ข้อมูลศาล</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                  <td>&nbsp;</td>
                  <td >
                    <table border="0" width="800" cellpadding="0" cellspacing="0">
                      <tr>
                        <td >
                          <table class="tableList" width="750" border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                            <tr>
                              <td width="100" class="TblHeaderColumn AlignCenter">&nbsp;</td>
                              <td width="100" class="TblHeaderColumn">รหัสศาล</td>
                              <td width="250" class="TblHeaderColumn">ชื่อศาล</td>
                              <td width="150" class="TblHeaderColumn">จังหวัด</td>
                              <td width="100" class="TblHeaderColumn">การใช้งาน</td>
                            </tr>
                            <tr><td colspan="4">&nbsp;</td></tr>
                            <tr <c:if test="${court.id != param.id}" >style="display:none"</c:if>  >
                              <td align="center"><span class="spanLink"><input type="submit" class="barButton" name="save" id ="save" value="บันทึก"/></span></td>
                              <td align="center">
	                              <input type="text" name="court_code" id="court_code" 
	                              onBlur="chkDupCode(this.value,'0',this,'save');" size="3" value="${NewCode}" 
	                              class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"  />
                              </td>
                              <td><input type="text" name="court_name" size="30" class="textbox" /><font color="red">*</font></td>
                              <td>
							  <select name="cmbCourtProvince" id="cmbCourtProvince" style="width:200px;">		
									<option value="">เลือก</option>	                          
			                       	<c:forEach items="${provlist}"  var="prov" varStatus="i">
									<option value="${prov.province_code}" >${prov.province_name}</option>
									</c:forEach>
			                    </select>                              
                              </td>
                              <td align="center"><input type="checkbox" name="active_status" value="1" checked="checked"></td>
                            </tr>
                            <c:forEach items="${courtlist}"  var="court" varStatus="i">
		  						<!-- odd row -->
		  						
		  						<c:choose>
		  							<c:when test="${court.id == param.id}">
			                            <tr>
			                              <input type="hidden" value="${court.id}" name="id"/>
			                              <td align="center"><span class="spanLink"><input type="button" name="save" id="save2" class="barButton" value="แก้ไข" onclick="updateCourt('<c:url value="/process?action=CourtList_Master&cmd=update"/>')"/></span></td>
			                              <td align="center">
			                              		<input type="text" name="court_codeUpdate" id="court_codeUpdate" 
			                              		onBlur="chkDupCode(this.value,'${court.id}',this,'save2');" size="5" class="textview" 
			                              		onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" 
			                              		value="${court.court_code}" /><a name="${court.id}"/></a>
			                              </td>
			                              <td>
			                                <input type="text" name="court_nameUpdate" size="30" class="textbox" value="${court.court_name}" />
			                                <font color="red">*</font>
			                              </td>
			                              <td>
			                               <select name="cmbCourtProvinceUpdate" id="cmbCourtProvinceUpdate" style="width:200px;">		
											<option value="">เลือก</option>	                          
			                       			<c:forEach items="${provlist}"  var="prov" varStatus="i">
											<option value="${prov.province_code}" <c:if test="${prov.province_code == court.province_code}">selected</c:if> >${prov.province_name}</option>
											</c:forEach>
			                    			</select>   		                              
			                              
			                              </td>                         
			                              <td align="center"><input type="checkbox" name="active_statusUpdate" value="${court.active_status}" <c:if test="${court.active_status == '1'}">checked="checked"</c:if> ></td>
			                            </tr>
		                            </c:when>
		                            <c:otherwise>
		                            	<c:if test="${(i.count % 2) == 1}">
			                            	<tr>
			                            		
				                              <td class="TblRow AlignCenter"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=CourtList_Master&id="/>${court.id}#${court.id}'">แก้ไข</span> | <span class="spanLink"  onclick="confirmBox('ต้องการลบข้อมูล','${court.id}','${i.count}')">ลบ</span></td>
				                              <td class="TblRow AlignCenter">${court.court_code }</td>
				                              <td class="TblRow AlignLeft">${court.court_name }</td>
				                              <td>${court.province_name}</td>
				                              <td class="TblRow AlignCenter">
				                              	<c:if test="${court.active_status == 1}">ใช้งาน</c:if>
				                              	<c:if test="${court.active_status == 0}">ไม่ใช้งาน</c:if>
				                              	<a name="${court.id}"/> </a>
				                              	<a name="${i.count}${i.count}"/> </a>
											  </td>
				                            </tr>
	                            		</c:if>
	                            		<c:if test="${(i.count % 2) == 0}">
	                            			<tr>
				                              <td class="TblRow AlignCenter bgRowGray"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=CourtList_Master&id="/>${court.id}#${court.id}';">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${court.id}','${i.count}')">ลบ</span></td>
				                              <td class="TblRow AlignCenter bgRowGray">${court.court_code }</td>
				                              <td class="TblRow AlignLeft bgRowGray">${court.court_name }</td>
				                              <td class="TblRow AlignLeft bgRowGray">${court.province_name }</td>
				                              <td class="TblRow AlignCenter bgRowGray">
				                              	<c:if test="${court.active_status == 1}">ใช้งาน</c:if>
				                              	<c:if test="${court.active_status == 0}">ไม่ใช้งาน</c:if>
				                              	<a name="${court.id}"/> </a>
				                              	<a name="${i.count}${i.count}"/> </a>
				                              </td>
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
  if(document.dataform.id.value != null){
		frmvalidator.addValidation("court_codeUpdate","req","กรุณาป้อนข้อมูล รหัสศาล");
		frmvalidator.addValidation("court_nameUpdate","req","กรุณาป้อนข้อมูล ชื่อศาล");
  }else{
	  	frmvalidator.addValidation("court_code","req","กรุณาป้อนข้อมูล รหัสศาล");
		frmvalidator.addValidation("court_name","req","กรุณาป้อนข้อมูล ชื่อศาล");
  }

	</script>
