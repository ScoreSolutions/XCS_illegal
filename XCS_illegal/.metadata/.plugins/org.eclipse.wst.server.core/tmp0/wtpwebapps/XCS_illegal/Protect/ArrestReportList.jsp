<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
<script type='text/javascript' src='dwr/interface/Exhibit.js'></script>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script language="javascript" type="text/javascript">
function winPopup(theURL,winName,features, myWidth, myHeight, isCenter) {

		if(window.screen)if(isCenter)if(isCenter=="true"){
			var myLeft = (screen.width-myWidth)/2;
			var myTop = (screen.height-myHeight)/2;
			features+=(features!='')?',':'';
			features+=',left='+myLeft+',top='+myTop;
		}
		window.open(theURL,winName,features+((features!='')?',':'')+'width='+myWidth+',height='+myHeight);

}
function clear2(){
	window.location.href="process?action=Outsideprove";
}

function btDelete(id)
{
	Exhibit.chkRefOutsideProve(id, function(data){
		if(data != "")
			alert(data);
		else{
			var answer = confirm ("ยืนยันการลบข้อมูล");
			if (answer){
				window.location.href="process?action=Outsideprove&id="+id+"&cmd=delete";
			}
		}
	});
}
</script>

		<!-- Header -->
		

    <form method="post" name="dataform"  action="<c:url value="process?action=ArrestReport&cmd=list"/>" >
 
		<!-- Body -->
		<table width="100%"  border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">รายงานการจับกุม</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><a href="process?action=ArrestReport&cmd=add" class="linkmenu3level">เพิ่มข้อมูล</a></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="1000" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
                  <tr>
                    <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
                    <td width="98%"></td>
                    <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
                  </tr>
                  <tr>
                    <td height="40">&nbsp;</td>
                    <td align="center" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="54%" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
                        <td width="46%">&nbsp;</td>
                      </tr>
                      <tr>
                        <td align="left" valign="top" colspan="2">
                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
								  <tr>
										<td width="20%" align="right">วันที่จับกุม :&nbsp;</td>
										<td width="30%">
											<input name="case_date_from" id="case_date_from" type="text" class="textdate" value="${param.case_date_from }" onKeyPress="txtKeyPress(event);" size="7" maxlength="10" />
											<a href="javascript:NewCssCal('case_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
											&nbsp;
											ถึง
											<input name="case_date_to" id="case_date_to" type="text" class="textdate" value="${param.case_date_to }" onKeyPress="txtKeyPress(event);" size="7" maxlength="10" />
											<a href="javascript:NewCssCal('case_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
										</td>
										<td width="15%" align="right">เรื่อง :&nbsp;</td>
										<TD>
											<input type="text" id="report_title" name="report_title" size="30"  class="text"   value="${param.report_title }" >
										</TD>
								  </tr>
								  <tr>
                                        <td align="right">ชื่อผู้ต้องหา :&nbsp;</td>
                                        <td >
                                             <input type="text" name="lawbreaker_name" id="lawbreaker_name" size="30"  class="text"   value="${param.lawbreaker_name}" >
                                        </td>
                                        <td  align="right">ชื่อผู้จับกุม :&nbsp;</td>
                                        <td >
                                       		<input type="text" name="accuser_name" id="accuser_name" size="30"  class="text"  value="${param.accuser_name}" >
                                        </td>
								  </tr>
							</table>
						  </td>
                      </tr>
                       <tr>
                              <td>&nbsp;</td>                       
                            <td height="25" align="left"><input type="image" src="images/btn_search_big.png" value="Submit" alt="Submit"></td>
                          </tr>
                    </table></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
                    <td></td>
                    <td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
                  </tr>
                </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                	</form>
                <table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                   <tr  align="left" valign="top">
						<td colspan="4"><%=pageUtil.getPagination()%></td>
						<td align="right" colspan="3"><%=pageUtil.getPageStatus()%>	</td>
					</tr>
                    <tr  class="TblRow bgRowGray">
                      <td width="30" class="TblHeaderColumn">ลำดับ</td>
                      <td width="80" class="TblHeaderColumn">เลขที่งาน</td>
                      <td width="80" class="TblHeaderColumn">วันที่จับกุม</td>
                      <td width="200" height="25" class="TblHeaderColumn">เรื่อง</td>
                      <td width="150" class="TblHeaderColumn">ชื่อผู้ต้องหา</td>
                      <td width="150" class="TblHeaderColumn">ชื่อผู้จับกุม</td>
                    </tr>
		             <c:forEach items="${dblist}"  var="db" varStatus="i">
			             <c:set var="Rows" value="${Rows + 1}" />
			             <c:if test="${(Rows % 2) == 1}">
							<tr class="TblRow AlignLeft">
			                    <td class="TblRow AlignCenter">${Rows}</td>
								<td ><a href="<c:url value="/process?action=ArrestReport&id=${db.id}&cmd=showupdate"/>" class="linkdatarow">${db.job_no}</a></td>
			                    <td >${db.case_date}</td>
			                    <td >${db.report_title}</td>
			                    <td >${db.lawbreaker_name}</td>
			                    <td >${db.accuser_name}</td>
							</tr>
						</c:if>
						<c:if test="${(Rows % 2) == 0}">
							<tr class="TblRow bgRowGray">
			                	<td class="TblRow AlignCenter bgRowGray">${Rows}</td>
								<td ><a href="<c:url value="/process?action=ArrestReport&id=${db.id}&cmd=showupdate"/>" class="linkdatarow">${db.job_no}</a></td>
			                    <td >${db.case_date}</td>
			                    <td >${db.report_title}</td>
			                    <td >${db.lawbreaker_name}</td>
			                    <td >${db.accuser_name}</td>	
							</tr>
						</c:if>
					</c:forEach>
                  </table></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
            </table></td>
		  </tr>
		</table>


		

