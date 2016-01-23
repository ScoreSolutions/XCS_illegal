<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type="text/javascript">
function updateCourt(url){
	if(document.dataform.onsubmit()){
		document.dataform.action=url;
	    document.dataform.submit();
	}
}
</script>
<form method="post" name="dataform" action="<c:url value="/process?action=ProductLegislation&cmd=save"/>" >
<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="100%"align="left" valign="top">   
			<table width="100%" border="0" cellspacing="0" cellpadding="0">              
                <tr><td colspan="3">&nbsp;</td></tr>
                <tr>
                	<td width="1%">&nbsp;</td>
                    <td width="98%"><span class="websitename">เชื่อมโยงสินค้ากับ พ.ร.บ.</span></td>
                    <td width="1%">&nbsp;</td>
                </tr>
                <tr><td colspan="3">&nbsp;</td></tr>
                <tr><td colspan="3">&nbsp;</td></tr>
                <tr height="40">    
                	<td >&nbsp;</td>        
                    <td colspan="2">&nbsp;<input name="btnSave"  type="submit" class="barbutton" value="บันทึก" /> </td>
                </tr>
                <tr>
                	<td >&nbsp;</td>
                	<td colspan="2">
	                	<table class="tableList" border="1" cellpadding="0" cellspacing="0" width="800" bordercolor="#CCCCCC">
		                  <tr height="30px">      
		                      <td width="10%" class="TblHeaderColumn" align="center" valign="middle" >ลำดับ</td>
		                      <td width="60%" class="TblHeaderColumn" align="center" valign="middle" >ชื่อสินค้า</td>
		                      <td width="30%" class="TblHeaderColumn" align="center" valign="middle" >ใช้สำหรับ พ.ร.บ.</td>                           
		                  </tr> 
		                  <c:forEach items="${Product}"  var="Product" varStatus="i"> 
		                  
		                  <input type="hidden" value="${Product.id}" name="id"/>
		                  <input type="hidden" value="${Product.group_id}" name="group_id"/>
		                  <c:if test="${(i.count % 2) == 1}">        
		                   <tr height="25px">
		                       <td class="TblRow AlignCenter">${i.count }</td>
		                       <td class="TblRow AlignLeft">${Product.group_name }</td>
		                       <td class="TblRow AlignLeft">
		                       		<select name="legislation_id_temp" id="legislation_id_temp" style="width:200"  >
										<option value="0" selected>เลือก</option>
										 <c:forEach items="${Legis}"  var="listlegis" varStatus="ii"> 
									  		<option value="${listlegis.id }" <c:if test="${Product.legislation_id == listlegis.id}"> selected </c:if>>${listlegis.legislation_name }</option>
										</c:forEach>
									</select>
							   </td>
		                   </tr>  
		                   </c:if> 
		                   <c:if test="${(i.count % 2) == 0}">        
		                   <tr height="25px">                 	    
		                       <td class="TblRow AlignCenter bgRowGray">${i.count }</td>
		                       <td class="TblRow AlignLeft bgRowGray">${Product.group_name }</td>
		                       <td class="TblRow AlignLeft bgRowGray">
		                           <select name="legislation_id_temp" id="legislation_id_temp" style="width:200"  >
										<option value="0" selected>เลือก</option>
										<c:forEach items="${Legis}"  var="listlegis" varStatus="ii"> 
									  		<option value="${listlegis.id }"  <c:if test="${Product.legislation_id == listlegis.id}"> selected </c:if>>${listlegis.legislation_name }</option>
										</c:forEach>
									</select>
							   </td>
		                   </tr>  
		                   </c:if>             
		                 </c:forEach>               	
			           </table>
                	</td>
                </tr>
            </table>
            
          </td>    
		</tr>	
</table>	
</form>		   
,<c:if test="${Msg == 1}">
	<script>
		alert("บันทึกข้อมูลเรียบร้อย");
	</script>
</c:if>