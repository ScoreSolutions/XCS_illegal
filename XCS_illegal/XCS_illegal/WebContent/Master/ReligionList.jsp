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
		Master.chkRelReligion(var_id,function(data){
			if(data != ""){
				alert(data);
				r = false;
			}
			else {
				r = confirm(str_text);
		  		if(r){
		  			window.location.href='<c:url value="/process?action=ReligionList_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'"/>';
	  			}	
	  		}
		});		
  		return r;  		
	}
</script>

<%@page import="com.ko.webapp.util.FormHandler"%>
<%
	FormHandler formHandler = new FormHandler(request);
%>
<script>
	function chkDupCode(cCode, cID, txtID, btn){
		document.getElementById(btn).disabled = true;
		Master.chkDupReligionCode(cCode, cID, function(data){
	
			if(data != ""){
				alert(data);
				txtID.select();
			}else
				document.getElementById(btn).disabled = false;
		});
	}
</script>
<form method="post" name="dataform" action="<c:url value="/process?action=ReligionList_Master&cmd=create"/>" >
      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ข้อมูลศาสนา</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                  <td>&nbsp;</td>
                  <td >
                    <table border="0" width="800" cellpadding="=0" cellspacing="0">
                      <tr>
                        <td >
                          <table class="tableList" width="550" border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                             <tr>
                              <td width="100" class="TblHeaderColumn AlignCenter">&nbsp;</td>
                              <td width="100" class="TblHeaderColumn">รหัสศาสนา</td>
                              <td width="250" class="TblHeaderColumn">ชื่อศาสนา</td>
                              <td width="100" class="TblHeaderColumn">การใช้งาน</td>
                            </tr>
                            <tr><td colspan="4">&nbsp;</td></tr>
                            <tr <c:if test="${listRa.id != param.id}" >style="display:none"</c:if> >
                              <td align="center"><span class="spanLink"><input type="submit" name="save" id = "save" class="barButton" value="บันทึก"/></span></td>
                              <td align="center">
                                <input type="text" size="5" class="textview" name="religion_code" id ="religion_code" 
                                value="${NewCode}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
                                onBlur="chkDupCode(this.value,'0',this,'save');"  />
                              </td>
                              <td>
                                <input type="text" size="30" class="textbox" name="religion_name" />
                                <font color="red">*</font>
                              </td>
                              <td align="center"><input type="checkbox" name="active" value="1" checked="checked"></td>
                            </tr>
                       <c:forEach items="${ListReligion}"  var="listRa" varStatus="i">
                       <!-- odd row -->
		  						
		  						<c:choose>
		  							<c:when test="${listRa.id == param.id}">
		  								<tr>
		  									<input type="hidden" value="${listRa.id}" name="id"/>
                              				<td align="center"><span class="spanLink"><input type="button" name="save" id = "save2" class="barButton" value="แก้ไข" onclick="updateCourt('<c:url value="/process?action=ReligionList_Master&cmd=update"/>')"/></span></td>
                              				<td align="center">
                                			<input type="text" size="5" class="textview" name="religion_codeUpdate" id = "religion_codeUpdate" 
                                			onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" 
                                			onBlur="chkDupCode(this.value,'${listRa.id}',this,'save2');" value="${listRa.religion_code}"/>
                                			<a name="${listRa.id}"/> </a>
                              				</td>
                              				<td>
                                			<input type="text" size="30" class="textbox" name="religion_nameUpdate" value="${listRa.religion_name}"/>
                                			<font color="red">*</font>
                              				</td>
                              				<td align="center"><input type="checkbox" name="activeUpdate" value="${listRa.active}" <c:if test="${listRa.active == '1'}">checked="checked"</c:if>></td>
                            			</tr>
		  							</c:when>
		                        <c:otherwise>
                       <c:if test="${(i.count % 2) == 1}">
                            <tr>
                              <td class="TblRow AlignCenter"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=ReligionList_Master&&id="/>${listRa.id}#${listRa.id}'">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ยืนยันการลบข้อมูล','${listRa.id}','${i.count}')">ลบ</span></td>
                              <td class="TblRow AlignCenter">${listRa.religion_code}</td>
                              <td class="TblRow AlignLeft">${listRa.religion_name}</td>
                              <td class="TblRow AlignCenter"><c:if test="${listRa.active == 1}">ใช้งาน</c:if>
				                              				<c:if test="${listRa.active == 0}">ไม่ใช้งาน</c:if>
				                              				<c:if test="${listRa.active == null}">ไม่ใช้งาน</c:if>
				                              				<a name="${listRa.id}"/> </a>
				                              				<a name="del${i.count}"/> </a>
				                              				</td>
                            </tr>
                      </c:if>
                      <c:if test="${(i.count % 2) == 0}">
                            <tr>
                              <td class="TblRow AlignCenter bgRowGray"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=ReligionList_Master&id="/>${listRa.id}#${listRa.id}'">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ยืนยันการบลข้อมูล','${listRa.id}','${i.count}')">ลบ</span></td>
                              <td class="TblRow AlignCenter bgRowGray">${listRa.religion_code}</td>
                              <td class="TblRow AlignLeft bgRowGray">${listRa.religion_name}</td>
                              <td class="TblRow AlignCenter bgRowGray"><c:if test="${listRa.active == 1}">ใช้งาน</c:if>
				                              						   <c:if test="${listRa.active == 0}">ไม่ใช้งาน</c:if>
				                              						   <c:if test="${listRa.active == null}">ไม่ใช้งาน</c:if>
				                              						   <a name="${listRa.id}"/> </a>
				                              							<a name="del${i.count}"/> </a>
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
    	frmvalidator.addValidation("religion_codeUpdate","req","กรุณาป้อนข้อมูล รหัสศาสนา");
    	frmvalidator.addValidation("religion_nameUpdate","req","กรุณาป้อนข้อมูล ชื่อศาสนา");
    }else{
    	frmvalidator.addValidation("religion_code","req","กรุณาป้อนข้อมูล รหัสศาสนา");
    	frmvalidator.addValidation("religion_name","req","กรุณาป้อนข้อมูล ชื่อศาสนา");
    }  


</script>