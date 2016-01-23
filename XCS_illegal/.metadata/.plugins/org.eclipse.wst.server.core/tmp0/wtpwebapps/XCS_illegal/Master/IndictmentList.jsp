<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<script type='text/javascript' src='dwr/interface/Master.js'></script>
<script language="JavaScript" type="text/javascript">
function ChechList(chk){
	if(document.dataform1.chkAll.checked == true){
		for (i = 0; i < chk.length; i++)
			chk[i].checked = true ;
	}else{
		for (i = 0; i < chk.length; i++)
			chk[i].checked = false ;
	}
}

	function confirmBox(str_text)
	{
		//
		var strIntID = "";
			if(document.dataform1.chkList.length>0){
				var chkCount = document.dataform1.chkList.length;
				for(i=0;i<chkCount;i++){
					if(document.dataform1.chkList[i].checked){
					//alert("$$$$ " + document.dataform1.chkList[i].value);
						if(strIntID == ""){
							strIntID = document.dataform1.chkList[i].value + "";
						}else{
							strIntID += ", " + document.dataform1.chkList[i].value;
						}
					}
				}
				//alert(strIntID);
				if(strIntID != ""){
					Master.chkRelIndictment(strIntID,function(data){
						if(data != ""){
							alert(data);
						}else{
				  			var r = confirm(str_text);
							if(r){
								document.dataform1.submit();
							}
						}
					});
				}
			}//else
				//return false;
	}
	
	
</script>


      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ข้อกล่าวหา</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                	<td >&nbsp;</td>
                	<td >
                	
                	<form name="dataform" action="<c:url value="/process?action=Indectment_Master&cmd=list"/>" method="post" >
                		<table border="0" cellpadding="0" cellspacing="0" width="700px">
                			<tr>
                				<td width="20%" align="right">แสดงตาม พ.ร.บ. :&nbsp;</td>
                				<td width="30%">
			                        <select name="law_id" id="law_id" style="width:200px" onChange="document.getElementById('legislation_id').value = this.value;">
			                          <c:forEach items="${legisList}"  var="legis" varStatus="i" >
							  				<option value="${legis.legislation_code }" <c:if test="${i.count == 1}">selected</c:if> >${legis.legislation_name }</option>
						  			  </c:forEach>
			                        </select>
                				</td>
                				<td width="50%">
                					<input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">
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
                  
        
                  <form method="post" name="dataform1" action="<c:url value="/process?action=Indectment_Master&cmd=delete" />" >
                    <!--  <input type="hidden" name="law_id" value="${param.law_id}"></input> -->
                    <input type="hidden" id="legislation_id" name="legislation_id" value="${legislation_id}" /> 
                    <table border="0" width="1000" cellpadding="=0" cellspacing="0">
					 
					 <tr>
					   <td>
							
							<input type="button" class="barButton" value="เพิ่มรายการ" onclick="javascript:location.href='<c:url value="/process?action=Indectment_Master&cmd=add"/>'"/> 
							<span class="spanLink"><input type="button" class="barButton" value="ลบรายการ" onClick="confirmBox('ต้องการลบข้อมูล');"/></span>
						</td>
					 </tr>
                      <tr>
                        <td >
                          <table class="tableList" width="1000"  border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">

                             <tr class="TblHeaderColumn">
							  <td width="50" >ลำดับ</td>
							  <td width="80" ><input name="chkAll" type="checkbox" id="chkAll" onclick="ChechList(document.dataform1.chkList)"/></td>
                              <td width="80" >เลขที่งาน</td>
                              <td width="100" >กระทำผิด มาตรา</td>
                              <td width="100" >บทกำหนดโทษ มาตรา</td>
                              <td width="300" >ฐานความผิด</td>
                              <td width="100" >บทกำหนดโทษ อัตราโทษ</td>
                              <td width="50" >มีโทษปรับ</td>
                              <td width="100" >อัตราค่าปรับ</td>
                              <td width="50" >มีโทษจำคุก</td>
                              <td width="80" >ของกลางเถื่อน</td>
                              <td width="80" >ของกลางต้องพิสูจน์</td>
                              <td width="100" >หมายเหตุ</td>
                            </tr>
                      <c:forEach items="${indictList}"  var="indict" varStatus="i">
	  				  <c:if test="${(i.count % 2) == 1}">
                            <tr class="TblRow">
                              <td Align="Center">${i.count}</td>
							  <td Align="Center"><input name="chkList" type="checkbox" value="${indict.indictment_id}" /></td>
							  <td align="center"><a href="<c:url value="process?action=Indectment_Master&cmd=edit&id=${indict.indictment_id}" />">${indict.guilt_mst_id}</a></td>
                              <td Align="Center">${indict.case_law_id}</td>
                              <td Align="Center">${indict.penalty_case_law_id}</td>
                              <td >${indict.guilt_base}</td>
                              <td >${indict.penalty_desc}</td>
                              <td Align="Center">
                              	<c:if test="${indict.isfine == 'Y'}">มี</c:if>
                              	<c:if test="${indict.isfine == 'N'}">ไม่มี</c:if>
                              	<c:if test="${indict.isfine == '0'}">ไม่ระบุ</c:if>
				              </td>
                              <td>${indict.fine_rate}</td>
                              <td Align="Center">
                              	<c:if test="${indict.isimprison == 'Y'}">มี</c:if>
                              	<c:if test="${indict.isimprison == 'N'}">ไม่มี</c:if>
                              	<c:if test="${indict.isimprison == '0'}">ไม่ระบุ</c:if>
				              </td>
                              <td Align="Center"><input type="checkbox" value="${indict.exhibit_wild}" <c:if test="${indict.exhibit_wild == 'Y'}">checked="checked"</c:if> disabled /></td>
                              <td Align="Center"><input type="checkbox" value="${indict.is_prove}" <c:if test="${indict.is_prove == 'Y'}">checked="checked"</c:if> disabled /></td>
                              <td>${indict.remarks}<a name="${indict.indictment_id }"/> </a></td>
                            </tr>
                      </c:if>
                      <c:if test="${(i.count % 2) == 0}">
                            <tr class="TblRow bgRowGray">
                              <td Align="Center">${i.count}</td>
							  <td Align="Center"><input name="chkList" type="checkbox" value="${indict.indictment_id }" /></td>
                              <td align="center"><a href="<c:url value="process?action=Indectment_Master&cmd=edit&id=${indict.indictment_id}" />">${indict.guilt_mst_id}</a></td>
                              <td align="center">${indict.case_law_id}</td>
                              <td align="center">${indict.penalty_case_law_id}</td>
                              <td >${indict.guilt_base}</td>
                              <td >${indict.penalty_desc}</td>
                              <td Align="Center"><c:if test="${indict.isfine == 'Y'}">มี</c:if>
				                              	<c:if test="${indict.isfine == 'N'}">ไม่มี</c:if>
				                              	<c:if test="${indict.isfine == '0'}">ไม่ระบุ</c:if>
				              </td>
                              <td>${indict.fine_rate}</td>
                              <td Align="Center"><c:if test="${indict.isimprison == 'Y'}">มี</c:if>
				                              	<c:if test="${indict.isimprison == 'N'}">ไม่มี</c:if>
				                              	<c:if test="${indict.isimprison == '0'}">ไม่ระบุ</c:if>
				              </td>
                              <td Align="Center"><input type="checkbox" value="${indict.exhibit_wild}" <c:if test="${indict.exhibit_wild == 'Y'}">checked="checked"</c:if> disabled /></td>
                              <td Align="Center"><input type="checkbox" value="${indict.is_prove}" <c:if test="${indict.is_prove == 'Y'}">checked="checked"</c:if> disabled /></td>
                              <td>${indict.remarks}	<a name="${indict.indictment_id }"/> </a></td>
                            </tr>
                       </c:if>
                       </c:forEach>
                         </table>
                        </td>
                      </tr>
                    </table>
                    
                    </form>
                    
                  </td>
                </tr>
             </table>
           </td>
        </tr>

      </table>

<script type="text/javascript">
var varLawID=${param.law_id};
//alert(varLawID);
document.getElementById("law_id").value =varLawID;
document.getElementById("legislation_id").value =varLawID;
</script>
