<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
	PageUtil pageUtil = new PageUtil(request);
%>

<script type="text/JavaScript">

     function selectLegislation(LID) {
		
		mnu = document.getElementById(LID);
		//alert(mnu.value);
		if (mnu.value !="4"){
			document.dataform.cmbProductGroup.disabled=true;
			document.dataform.cmbProductGroup.value = "";
		}
		else
			document.dataform.cmbProductGroup.disabled=false;

	}
     function clear2()
     {
     	window.location.href="process?action=SuppressTargetList_Master";
     }
</script>
<form method="post" name="dataform" action="<c:url value="/process?action=SuppressTargetList_Master&cmd=list"/>" >
      <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
           <td width="100%" align="left" valign="top">
             <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="1%">&nbsp;</td>
                  <td width="99%"><span class="websitename">กำหนดเป้าปราบปราม</span></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                	<td >&nbsp;</td>
                	<td >
                		<form method="post" name="dataform" action="<c:url value="/process?action=SuppressTargetList_Master&cmd=create"/>" >
                		<table border="0" cellpadding="0" cellspacing="0" width="800">
							<tr>
                				<td width="20%" align="right">ปีงบประมาณ :&nbsp;</td>
                				<td width="30%">
                					<input name="budget_year" type="text" class="textNum" value="${param.budget_year }" size="15" />
                					&nbsp;&nbsp;
									ครั้งที่ : <input name="job_no" type="text" class="textNum" size="3" value="${param.job_no }"  />
                				</td>
                				<td width="20%" align="right">พ.ร.บ. :&nbsp;</td>
                				<td width="30%">
			                        <select name="cmbLegislation" id="cmbLegislation" style="width:200px;" onchange="selectLegislation('cmbLegislation');">
			                          <option value="" selected>ทั้งหมด</option>
			                          <c:forEach items="${listLegis}"  var="legis" >
			                          		<option value="${legis.id}" >${legis.legislation_name}</option>
			                          </c:forEach>
			                        </select>&nbsp;&nbsp;

                				</td>
                			</tr>
							<tr>
								<td align="right">หน่วยงาน :&nbsp;</td>
								<td height="25">
								   <input type="text" name="offcodeSuppress" size="4"  class="textbox"  value="${param.offcodeSuppress }" >
								   <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
										onClick="window.open('process?action=Ed_office_pop&formname=offnameSuppress&formcode=offcodeSuppress' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" >
								   <input type="text" name="offnameSuppress" size="16"  class="textbox"  value="${param.offnameSuppress }" >
								</td>
								<td align="right" >สินค้า :&nbsp;</td>
								<td height="25">
									<select name="cmbProductGroup" id="cmbProductGroup" style="width:200px;" disabled="disabled">
										 <option value="" selected>ทั้งหมด</option>
										 <c:forEach items="${listDuty}"  var="duty" >
			                          		<option value="${duty.group_id}" >${duty.group_name}</option>
			                          </c:forEach>
									</select>
								</td>
                			</tr>
							<tr>
								<td align="right">หน่วยงานในสังกัด :&nbsp;</td>
								<td height="25">
								   <input type="text" name="divisioncode" size="4"  class="textbox"  value="${param.divisioncode }" >
								   <img src="images/btn_browse.png" width="18" height="19" border="0" style="cursor:hand"
										onClick="window.open('process?action=Ed_office_pop&formname=divisionname&formcode=divisioncode' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');" >
								   <input type="text" name="divisionname" size="16"  class="textbox"  value="${param.divisionname }" >
								</td>

                			</tr>
                			<tr>
                			    <td align="right" >ข้อมูล ณ วันที่ :&nbsp;</td>
                			    <td >
                			    	<input name="theDate1" id="theDate1" type="text" class="textdate" readonly value="${param.theDate1 }"     />
		  							<a href="javascript:NewCssCal('theDate1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" /></a>
		  							&nbsp;&nbsp;ถึง :&nbsp;
		  							<input name="theDate2" id="theDate2" type="text" class="textdate" readonly value="${param.theDate2 }"     />
		  							<a href="javascript:NewCssCal('theDate2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" /></a>
                			    </td>
								<td align="right" >สถานะ :&nbsp;</td>
								<td height="25">
									<select name="cmbStatus" id="cmbStatus" style="width:100px;" >
										 <option value="" selected>ทั้งหมด</option>
										 <option value="0">อยู่ระหว่างดำเนินการ</option>
										 <option value="1">ใช้งาน</option>
									</select>
								</td>
                			</tr>
							<tr><td colspan="4" align="center">&nbsp;</td></tr>
							<tr>
								<td colspan="4" align="center"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit">&nbsp;&nbsp;&nbsp;&nbsp;<img name="222" width="67" src="images/icn_clearsearch.jpg"  style="cursor:hand" alt="ล้างเงือนไข" onclick="clear2();" border="0" ></td>
							</tr>
                		</table>
                		</form>
                	</td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                  <td>&nbsp;</td>
                  <td >
                    <table border="0" width="1000" cellpadding="=0" cellspacing="0">
					 <tr>
					   <td>
					   	<!--<input type="button" class="barButton" value="เพิ่มข้อมูล" onclick="javascript:location.href='<c:url value="/process?action=SuppressTargetList_Master&cmd=add"/>'"/>-->
					   	<a href="<c:url value="/process?action=SuppressTargetList_Master&cmd=add"/>">เพิ่มข้อมูล</a>
						</td>
					 </tr>
					 <tr>
					   <td>&nbsp;</td>
					 </tr>
                      <tr>
                        <td >
                          <table class="tableList" width="800"   border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
						     <tr>
							     <td colspan="2" align="left"><%=pageUtil.getPagination()%></td><td align="right" colspan="3"><%=pageUtil.getPageStatus()%>	</td>
						     </tr>
                             <tr class="TblHeaderColumn">
                              <td width="150" >เลขที่เอกสารคุม</td>
							  <td width="100" >ปีงบประมาณ</td>
                              <td width="280" >หน่วยงาน</td>
                              <td width="150" >พ.ร.บ.</td>
                              <td width="120" >สถานะ</td>
                              <td>&nbsp;</td>
                            </tr>
                       <c:forEach items="${suppresslist}"  var="listsuppress" varStatus="i">
                       		<c:if test="${(i.count % 2) == 1}">     
                            <tr class="TblRow">
                              <td align="center"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=SuppressTargetList_Master&cmd=edit&id="/>${listsuppress.id}'">${listsuppress.job_no }</span></td>
                              <td Align="Center">${listsuppress.budget_year }</td>
                              <td >${listsuppress.offname }</td>
                              <td >${listsuppress.legislation_name }</td>
                              <td >
                              	<c:if test="${listsuppress.status == 1}">ใช้งาน</c:if>
				                <c:if test="${listsuppress.status == 0}">อยู่ระหว่างดำเนินการ</c:if>
                              </td>
							  <td><a href="<c:url value="process?action=SuppressTargetList_Master&cmd=copy&id=${listsuppress.id}" />"><img src="images/icn_copy.png" width="25" height="25" border="0" alt="คัดลอก" style="cursor:hand;"></a></td>
                            </tr>
                            </c:if>
                      		<c:if test="${(i.count % 2) == 0}">
                            <tr class="TblRow bgRowGray">
                              <td align="center"><span class="spanLink" onclick="javascript:location.href='<c:url value="/process?action=SuppressTargetList_Master&cmd=edit&id="/>${listsuppress.id}'">${listsuppress.job_no }</span></td>
                              <td Align="Center">${listsuppress.budget_year }</td>
                              <td>${listsuppress.offname }</td>
                              <td >${listsuppress.legislation_name }</td>
                              <td >
                              	<c:if test="${listsuppress.status == 1}">ใช้งาน</c:if>
				                <c:if test="${listsuppress.status == 0}">อยู่ระหว่างดำเนินการ</c:if>
                              </td>
                              <td><a href="<c:url value="process?action=SuppressTargetList_Master&cmd=copy&id=${listsuppress.id}" />"><img src="images/icn_copy.png" width="25" height="25" border="0" alt="คัดลอก" style="cursor:hand;"></a></td>
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
           </td>
        </tr>
      </table>
</form>
<script type="text/javascript">
var legis ='${param.cmbLegislation}';
var status='${param.cmbStatus}';
var product='${param.cmbProductGroup}';
document.getElementById("cmbLegislation").value=legis;
document.getElementById("cmbStatus").value=status;
document.getElementById("cmbProductGroup").value=product;
selectLegislation("cmbLegislation");
</script>
