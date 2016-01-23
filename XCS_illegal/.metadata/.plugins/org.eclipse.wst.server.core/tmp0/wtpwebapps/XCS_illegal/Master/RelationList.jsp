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
		Master.chkRelRels(var_id,function(data){
			if(data != ""){
				alert(data);
				r = false;
			}
			else {
				r = confirm(str_text);
		  		if(r){
		  			window.location.href='<c:url value="/process?action=RelationList_Master&cmd=delete&id='+var_id+'&iddel='+var_del+'"/>';
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
		Master.chkDupRelsCode(cCode, cID, function(data){
	
			if(data != ""){
				alert(data);
				txtID.select();
			}else
				document.getElementById(btn).disabled = false;
		});
	}
</script>
<form method="post" name="dataform" action="<c:url value="/process?action=RelationList_Master&cmd=create"/>" >
      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ข้อมูลความสัมพันธ์</span></td>
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
                              <td width="100" class="TblHeaderColumn">รหัสความสัมพันธ์</td>
                              <td width="250" class="TblHeaderColumn">ความสัมพันธ์</td>
                              <td width="100" class="TblHeaderColumn">การใช้งาน</td>
                            </tr>
                            <tr><td colspan="4">&nbsp;</td></tr>
                            <tr <c:if test="${listRelation.id != param.id}" >style="display:none"</c:if> >
                              <td align="center"><span class="spanLink"><input type="submit" name="save" id="save" class="barButton" value="บันทึก"/></span></td>
                              <td align="center">
                                <input type="text" size="5" class="textview" name="relation_code" id = "relation_code" 
                                value="${NewCode}" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"
                                onBlur="chkDupCode(this.value,'0',this,'save');" />
                              </td>
                              <td>
                                <input type="text" size="30" class="textbox" name="relation_name" />
                                <font color="red">*</font>
                              </td>
                              <td align="center"><input type="checkbox" name="active" value="1" checked="checked"></td>
                            </tr>
                       <c:forEach items="${Listrelation}"  var="listRelation" varStatus="i">
                       <!-- odd row -->
		  						
		  						<c:choose>
		  							<c:when test="${listRelation.id == param.id}">
		  								<tr>
		  									<input type="hidden" value="${listRelation.id}" name="id"/>
                              				<td align="center"><input type="button" name="save" id="save2" class="barButton" value="แก้ไข" onclick="updateCourt('<c:url value="/process?action=RelationList_Master&cmd=update"/>')"/></span></td>
                              				<td align="center">
                                			<input type="text" size="5" class="textview" name="relation_codeUpdate" id ="relation_codeUpdate" 
                                			onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" 
                                			onBlur="chkDupCode(this.value,'${listRelation.id}',this,'save2');" value="${listRelation.relation_code }"/>
                                			<a name="${listRelation.id}"/> </a>
                              				</td>
                              				<td>
                                			<input type="text" size="30" class="textbox" name="relation_nameUpdate" value="${listRelation.relation_name }" />
                                			<font color="red">*</font>
                              				</td>
                              				<td align="center"><input type="checkbox" name="activeUpdate" value="${listRelation.active}" <c:if test="${listRelation.active == '1'}">checked="checked"</c:if>></td>
                            			</tr>
		  							</c:when>
		                        <c:otherwise>
                       <c:if test="${(i.count % 2) == 1}">
                            <tr>
                              <td class="TblRow AlignCenter"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=RelationList_Master&id="/>${listRelation.id}#${listRelation.id}'">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${listRelation.id}','${i.count}')">ลบ</span></td>
                              <td class="TblRow AlignCenter">${listRelation.relation_code }</td>
                              <td class="TblRow AlignLeft">${listRelation.relation_name }</td>
                              <td class="TblRow AlignCenter"><c:if test="${listRelation.active == 1}">ใช้งาน</c:if>
				                              			     <c:if test="${listRelation.active == 0}">ไม่ใช้งาน</c:if>
				                              				 <c:if test="${listRelation.active == null}">ไม่ใช้งาน</c:if>
				                              				 <a name="${listRelation.id}"/> </a>
				                              				 <a name="del${i.count}"/> </a>
				                              				 </td>
                            </tr>
                      </c:if>
                      <c:if test="${(i.count % 2) == 0}">
                            <tr>
                              <td class="TblRow AlignCenter bgRowGray"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=RelationList_Master&id="/>${listRelation.id}#${listRelation.id}'">แก้ไข</span> | <span class="spanLink" onclick="confirmBox('ต้องการบลข้อมูล','${listRelation.id}','${i.count}')">ลบ</span></td>
                              <td class="TblRow AlignCenter bgRowGray">${listRelation.relation_code }</td>
                              <td class="TblRow AlignLeft bgRowGray">${listRelation.relation_name }</td>
                              <td class="TblRow AlignCenter bgRowGray"><c:if test="${listRelation.active == 1}">ใช้งาน</c:if>
				                              						   <c:if test="${listRelation.active == 0}">ไม่ใช้งาน</c:if>
				                              						   <c:if test="${listRelation.active == null}">ไม่ใช้งาน</c:if>
				                              						   <a name="${listRelation.id}"/> </a>
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
    	frmvalidator.addValidation("relation_codeUpdate","req","กรุณาป้อนข้อมูล รหัสความสัมพันธ์");
    	frmvalidator.addValidation("relation_nameUpdate","req","กรุณาป้อนข้อมูล ชื่อความสัมพันธ์");
    }else{
    	frmvalidator.addValidation("relation_code","req","กรุณาป้อนข้อมูล รหัสความสัมพันธ์");
    	frmvalidator.addValidation("relation_name","req","กรุณาป้อนข้อมูล ชื่อความสัมพันธ์");
    }  


</script>
