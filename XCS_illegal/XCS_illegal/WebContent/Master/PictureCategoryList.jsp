<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/Master.js'></script>
<script type="text/javascript">
	function validateSave(url){

		if(document.dataform.onsubmit()){
			document.dataform.action=url;
		    document.dataform.submit();
		}
	}
	function confirmBox(str_text,var_id,var_del){
  		var r
		Master.chkRelPicCate(var_id,function(data){
			if(data != ""){
				alert(data);
				r = false;
			}
			else {
				r = confirm(str_text);
		  		if(r){
		  			window.location.href='<c:url value="/process?action=PictureCategoryList_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'"/>';
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
		Master.chkDupPicCateCode(cCode, cID, function(data){
			if(data != ""){
				alert(data);
				txtID.select();
			}else
				document.getElementById(btn).disabled = false;
		});
	}
</script>
<form method="post" name="dataform"  action="<c:url value="/process?action=PictureCategoryList_Master&cmd=create"/>" >
      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ข้อมูลหมวดภาพถ่าย</span></td>
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
                              <td width="100" class="TblHeaderColumn">รหัสหมวดภาพถ่าย</td>
                              <td width="250" class="TblHeaderColumn">ชื่อหมวดภาพถ่าย</td>
                              <td width="100" class="TblHeaderColumn">การใช้งาน</td>
                            </tr>
                            <tr><td colspan="4">&nbsp;</td></tr>
                            <tr <c:if test="${listpic.id != param.id}" >style="display:none"</c:if> >
                              <td align="center"><span class="spanLink"><input type="submit" name="save" id = "save"  class="barButton" value="บันทึก" /></span></td>
                              <td align="center">
                                <input type="text" size="5" class="textview" name="category_code" id ="category_code" 
                                value="${NewCode}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
                                onBlur="chkDupCode(this.value,'0',this,'save')" />
                                <font color="red">*</font>
                              </td>
                              <td>
                                <input type="text" size="30" class="textbox" name="category_name" />
                                <font color="red">*</font>
                              </td>
                              <td align="center"><input type="checkbox" name="active" value="1" checked="checked"></td>
                            </tr>
                     <c:forEach items="${ListPic}"  var="listpic" varStatus="i">
                     <!-- odd row -->
		  			   
		  						<c:choose>
		  							<c:when test="${listpic.id == param.id}">
		  							     <tr>
		  							     	<input type="hidden" value="${listpic.id}" name="id"/>
                              				<td align="center"><span class="spanLink"><input type="button" name="save" id ="save2" class="barButton" value="แก้ไข" onclick="validateSave('<c:url value="/process?action=PictureCategoryList_Master&cmd=update"/>');"/></span></td>
                              				<td align="center">
                                				<input type="text" size="5" class="textview" name="category_codeUpdate" id = "category_codeUpdate" 
                                				onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
                                				onBlur="chkDupCode(this.value,'${listpic.id}',this,'save2')" value="${listpic.category_code }"/>
                                				<a name="${listpic.id}"/></a>
                              				</td>
                              				<td>
                                				<input type="text" size="30" class="textbox" name="category_nameUpdate" id="category_nameUpdate" value="${listpic.category_name }"/>
                                				<input type="hidden" value="${listpic.category_name }" name="category_nameUpdateTemp"/>
                                				<font color="red">*</font>
                              				</td>
                              				<td align="center"><input type="checkbox" name="activeUpdate" value="${listpic.active}" <c:if test="${listpic.active == '1'}">checked="checked"</c:if>></td>
                            			</tr>
		  							</c:when>
		                        <c:otherwise>
                     <c:if test="${(i.count % 2) == 1}">
                            <tr>
                              <td class="TblRow AlignCenter"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=PictureCategoryList_Master&id="/>${listpic.id}#${listpic.id}'">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${listpic.id}','${i.count}')">ลบ</span></td>
                              <td class="TblRow AlignCenter">${listpic.category_code }</td>
                              <td class="TblRow AlignLeft">${listpic.category_name }</td>
                              <td class="TblRow AlignCenter"><c:if test="${listpic.active == 1}">ใช้งาน</c:if>
				                              							<c:if test="${listpic.active == 0}">ไม่ใช้งาน</c:if>
				                              							<c:if test="${listpic.active == null}">ไม่ใช้งาน</c:if>
				                              							<a name="${listpic.id}"/></a>
				                              							<a name="del${i.count}"/></a>
				                              							</td>
                            </tr>
                       </c:if>
                       <c:if test="${(i.count % 2) == 0}">
                            <tr>
                              <td class="TblRow AlignCenter bgRowGray"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=PictureCategoryList_Master&id="/>${listpic.id}#${listpic.id}'">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${listpic.id}','${i.count}')">ลบ</span></td>
                              <td class="TblRow AlignCenter bgRowGray">${listpic.category_code }</td>
                              <td class="TblRow AlignLeft bgRowGray">${listpic.category_name }</td>
                              <td class="TblRow AlignCenter bgRowGray"><c:if test="${listpic.active == 1}">ใช้งาน</c:if>
				                              							<c:if test="${listpic.active == 0}">ไม่ใช้งาน</c:if>
				                              							<c:if test="${listpic.active == null}">ไม่ใช้งาน</c:if>
				                              							<a name="${listpic.id}"/></a>
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

      </table>
</form>
<script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form

var frmvalidator  = new Validator("dataform");
    if(document.dataform.id.value != null){
    	frmvalidator.addValidation("category_codeUpdate","req","กรุณาป้อนข้อมูล รหัสหมวดภาพถ่าย");
   	frmvalidator.addValidation("category_nameUpdate","req","กรุณาป้อนข้อมูล ชื่อหมวดภาพถ่าย");
   }else{
    	frmvalidator.addValidation("category_code","req","กรุณาป้อนข้อมูล รหัสหมวดภาพถ่าย");
    	frmvalidator.addValidation("category_name","req","กรุณาป้อนข้อมูล ชื่อหมวดภาพถ่าย");
    }


</script>
