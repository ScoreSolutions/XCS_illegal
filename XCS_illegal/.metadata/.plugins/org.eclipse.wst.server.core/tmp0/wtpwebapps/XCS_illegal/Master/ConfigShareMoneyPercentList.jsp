<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/taglibs.jsp"%>
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
		var r = confirm(str_text);
		return r;
}
</script>
<%@page import="com.ko.webapp.util.FormHandler"%>
<%
	FormHandler formHandler = new FormHandler(request);
%>

      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top"> 
            
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">ข้อมูลเปอร์เซ็นการแบ่งเงิน</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
					<td>&nbsp;</td>
					<td>
						<form method="post" name="dataform" action="<c:url value="/process?action=ConfigShareMoneyPercent&cmd=list"/>" >
                		<table border="0" cellpadding="0" cellspacing="0" width="700">
                			<tr>
                				<td width="20%" align="right">แสดงตาม พ.ร.บ. :&nbsp;</td>
                				<td width="80%" valign="bottom">
			                        <select name="cmbLegislationSearch" id="cmbLegislationSearch" style="width:200px;">
			                          
			                          <c:forEach items="${listLegis}"  var="legis" varStatus="i">
										<option value="${i.count}" <c:if test="${i.count == 1}">selected</c:if> >${legis.legislation_name}</option>
									  </c:forEach>
			                        </select>&nbsp;&nbsp;
			                        <input type="image" src="images/btn_search_big.png" value="submit" alt="Submit">
                				</td>
                				
                			</tr>
                		</table>
                		</form> 
					</td>
				</tr>
				<tr><td colspan="2">&nbsp;</td></tr>
				<!-- 
				 <tr>
				   <td colspan="2">
						<a href="<c:url value="/process?action=ConfigShareMoneyPercent&cmd=add"/>" target="_self">เพิ่มข้อมูล</a> |
						<span  class="spanLink" onclick="updateCourt('<c:url value="process?action=ConfigShareMoneyPercent&cmd=delete"/>');">ลบรายการ</span>
					</td>
				 </tr>
				  -->
				 <tr><td colspan="2">&nbsp;</td></tr>
				<tr>
                  <td>&nbsp;</td>
                  <td >
                  <form method="post" name="dataform1" action="<c:url value="/process?action=ConfigShareMoneyPercent&cmd=delete"/>" >
                    <input type="hidden" name="cmbLegislationSearch" value="${param.cmbLegislationSearch}" />
                    <table border="0" width="800" cellpadding="=0" cellspacing="0">
                    <tr>
					   <td>
							
							<input type="button" class="barButton" value="เพิ่มรายการ" onclick="javascript:location.href='<c:url value="/process?action=ConfigShareMoneyPercent&cmd=add"/>'"/> 
							<span class="spanLink"><input type="submit" class="barButton" value="ลบรายการ" onclick="return confirmBox('ต้องการลบข้อมูล')"/></span>
						</td>
					 </tr>
					 <tr><td colspan="2">&nbsp;</td></tr>
                      <tr>
                        <td >
                          <table class="tableList" width="1000" border="1" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                             <tr>
							  <td width="50" class="TblHeaderColumn" rowspan="2">ลำดับ</td>
							  <td width="30" class="TblHeaderColumn" rowspan="2" >
							  		
							  		<input name="chkAll" type="checkbox" id="chkAll" onclick="ChechList(document.dataform1.chkList)" />
							  </td>
							  <td width="150" class="TblHeaderColumn" rowspan="2">พ.ร.บ.</td>
                              <td width="80" class="TblHeaderColumn" rowspan="2">มีผู้แจ้งความ</td>
                              <td width="80" class="TblHeaderColumn" rowspan="2">% เงินส่งคลัง</td>
                              <td width="80" class="TblHeaderColumn" rowspan="2">% เงินสินบน</td>
							  <td width="80" class="TblHeaderColumn" rowspan="2">% เงินรางวัล </td>
							  <td width="80" class="TblHeaderColumn" rowspan="2">เงินสินบน<br />สูงสุด(บาท)</td>
							  <td width="80" class="TblHeaderColumn" rowspan="2">เงินรางวัล<br/ >สูงสุด(บาท)</td>
							  <td  class="TblHeaderColumn" colspan="3">กรณียกเว้นการจ่ายเงินรางวัล</td>
							  <td width="80" class="TblHeaderColumn" rowspan="2">&nbsp;</td>
                            </tr>
                             <tr>
							  <td width="100" class="TblHeaderColumn">กระทำผิดมาตรา</td>
							  <td width="100" class="TblHeaderColumn">สินค้า</td>
							  <td width="100" class="TblHeaderColumn">ชนิดสินค้า</td>
                            </tr>
                        <c:forEach items="${MoneyPercent}"  var="moneypercent"  varStatus="i" >
				  		<c:if test="${(i.count % 2) == 1}">
                            <tr>
                              <td class="TblRow AlignCenter">${i.count}</td>
							  <td Align="Center"><input name="chkList" type="checkbox" id="chkList" value="${moneypercent.id}" /></td>
                              <td class="TblRow AlignLeft">${moneypercent.legislation_name}</td>
                              <td class="TblRow AlignCenter"><c:if test="${moneypercent.isnotice == 'Y'}">มี</c:if>
				                              				 <c:if test="${moneypercent.isnotice == 'N'}">ไม่มี</c:if></td>
							  <td class="TblRow" align="right">${moneypercent.treasury}</td>
							  <td class="TblRow" align="right">${moneypercent.bribe}</td>
							  <td class="TblRow" align="right">${moneypercent.reward} </td>
							  <td class="TblRow" align="right">${moneypercent.bribe_limit}</td>
							  <td class="TblRow" align="right">${moneypercent.reward_limit}</td>
							  <td class="TblRow AlignRight">${moneypercent.penalty_case_law_id}</td>
							  <td class="TblRow AlignRight">${moneypercent.duty_name}</td>
							  <td class="TblRow AlignRight">${moneypercent.type_name}</td>
							  <td class="TblRow AlignCenter"><a href="<c:url value="/process?action=ConfigShareMoneyPercent&cmd=edit&by_id=${moneypercent.id}" />" >รายละเอียด</a></td>
                            </tr>
                        </c:if>
						<c:if test="${(i.count % 2) == 0}">
                            <tr>
                              <td class="TblRow AlignCenter">${i.count}</td>
							  <td Align="Center"><input name="chkList" type="checkbox" id="chkList" value="${moneypercent.id}" /></td>
                              <td class="TblRow AlignLeft">${moneypercent.legislation_name}</td>
                              <td class="TblRow AlignCenter"><c:if test="${moneypercent.isnotice == 'Y'}">มี</c:if>
				                              				 <c:if test="${moneypercent.isnotice == 'N'}">ไม่มี</c:if></td>
							  <td class="TblRow" align="right">${moneypercent.treasury}</td>
							  <td class="TblRow" align="right">${moneypercent.bribe}</td>
							  <td class="TblRow" align="right">${moneypercent.reward}</td>
							  <td class="TblRow" align="right">${moneypercent.bribe_limit}</td>
							  <td class="TblRow" align="right">${moneypercent.reward_limit}</td>
							  <td class="TblRow AlignRight">${moneypercent.penalty_case_law_id}</td>
							  <td class="TblRow AlignRight">${moneypercent.duty_name}</td>
							  <td class="TblRow AlignRight">${moneypercent.type_name}</td>
							  <td class="TblRow AlignCenter"><a href="<c:url value="/process?action=ConfigShareMoneyPercent&cmd=edit&by_id=${moneypercent.id}" />" >รายละเอียด</a></td>
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
var varLawID=${cmbLegislationSearch};
document.getElementById('cmbLegislationSearch').value = varLawID;
</script>


