<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript">
	function updateCourt(url){
		if(document.dataform.onsubmit()){
			document.dataform.action=url;
		    document.dataform.submit();
		}
	}
	function confirmBox(str_text,var_id,var_del){
  		var r = confirm(str_text);
  		if(r){
  	  		window.location.href='<c:url value="/process?action=LicenseTypeList_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'"/>';
  		}
  		return r;
	}
</script>

<%@page import="com.ko.webapp.util.FormHandler"%>
<%
	FormHandler formHandler = new FormHandler(request);
%>
<form method="post" name="dataform" action="<c:url value="/process?action=LicenseTypeList_Master&cmd=create"/>" >
      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ข้อมูลประเภทใบอนุญาต</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                  <td>&nbsp;</td>
                  <td >
                    <table border="0" width="800" cellpadding="=0" cellspacing="0">
                      <tr>
                        <td >
                          <table class="tableList" width="1000" border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                             <tr>
                              <td width="100" class="TblHeaderColumn AlignCenter">&nbsp;</td>
                              <td width="100" class="TblHeaderColumn">รหัสประเภท</td>
                              <td class="TblHeaderColumn">ชื่อประเภท</td>
                              <td width="100" class="TblHeaderColumn">การใช้งาน</td>
                            </tr>
                            <tr><td colspan="2">&nbsp;</td></tr>
                            <tr <c:if test="${licenseType.id != param.id}">style="display:none"</c:if> >
                              <td align="center"><span class="spanLink"><input type="submit" class="barButton" name="save" value="บันทึก"/></span></td>
                              <td align="center">
                                <input type="text" size="5" class="textbox" name="licensetype_code" />
                                <font color="red">*</font>
                              </td>
                              <td>
                                <input type="text" size="100" class="textbox" name="licensetype_name" />
                                <font color="red">*</font>
                              </td>
                              <td align="center"><input type="checkbox" name="active_status" value="1" checked="checked"></td>
                            </tr>
                      <c:forEach items="${listlicense}"  var="licenseType" varStatus="i">
                      <!-- odd row -->
		  			   
		  						<c:choose>
		  							<c:when test="${licenseType.id == param.id}">
		  							     <tr>
		  							     	<input type="hidden" value="${licenseType.id}" name="id"/>
                              				<td align="center"><span class="spanLink"><input type="button" class="barButton" name="save" value="แก้ไข" onclick="updateCourt('<c:url value="/process?action=LicenseTypeList_Master&cmd=update"/>')"/></span></td>
                              				<td align="center"><input type="text" size="5" class="textbox" name="licensetype_codeUpdate" value="${licenseType.licensetype_code }" /><font color="red">*</font><a name="${licenseType.id}"/></a></td>
                              				<td><input type="text" size="100" class="textbox" name="licensetype_nameUpdate" value="${licenseType.licensetype_name }" /><font color="red">*</font></td>
                              				<td align="center"><input type="checkbox" name="active_statusUpdate" value="${licenseType.active_status }" <c:if test="${licenseType.active_status == '1'}">checked="checked"</c:if>></td>
                            			</tr>
		  						    </c:when>
		                        <c:otherwise>
	  				  <c:if test="${(i.count % 2) == 1}">
                            <tr>
                              <td class="TblRow AlignCenter"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=LicenseTypeList_Master&id="/>${licenseType.id}#${licenseType.id}'">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${licenseType.id}','${i.count}')">ลบ</span></td>
                              <td class="TblRow AlignCenter">${licenseType.licensetype_code }</td>
                              <td class="TblRow AlignLeft">${licenseType.licensetype_name }</td>
                              <td class="TblRow AlignCenter">
                              								<c:if test="${licenseType.active_status == 1}">ใช้งาน</c:if>
				                              				<c:if test="${licenseType.active_status == 0}">ไม่ใช้งาน</c:if>
				                              				<a name="${licenseType.id}"/></a>
				                              				<a name="del${i.count}"/></a>
				              </td>
                            </tr>
                      </c:if>
                      <c:if test="${(i.count % 2) == 0}">
                            <tr>
                              <td class="TblRow AlignCenter bgRowGray"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=LicenseTypeList_Master&id="/>${licenseType.id}#${licenseType.id}'">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${licenseType.id}','${i.count}')">ลบ</span></td>
                              <td class="TblRow AlignCenter bgRowGray">${licenseType.licensetype_code }</td>
                              <td class="TblRow AlignLeft bgRowGray">${licenseType.licensetype_name }</td>
                              <td class="TblRow AlignCenter bgRowGray">
                              											<c:if test="${licenseType.active_status == 1}">ใช้งาน</c:if>
				                              							<c:if test="${licenseType.active_status == 0}">ไม่ใช้งาน</c:if>
				                              							<a name="${licenseType.id}"/></a>
				                              							<a name="del${i.count}"/></a>
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
		<tr><td>&nbsp;</td></tr>
      </table>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
var frmvalidator  = new Validator("dataform");
    if(document.dataform.id.value != null){
    	frmvalidator.addValidation("licensetype_codeUpdate","req","กรุณาป้อนข้อมูล รหัสประเภท");
    	frmvalidator.addValidation("licensetype_nameUpdate","req","กรุณาป้อนข้อมูล ชื่อประ้เภท");
    }else{
    	frmvalidator.addValidation("licensetype_code","req","กรุณาป้อนข้อมูล รหัสประเภท");
    	frmvalidator.addValidation("licensetype_name","req","กรุณาป้อนข้อมูล ชื่อประ้เภท");
    }


</script>

