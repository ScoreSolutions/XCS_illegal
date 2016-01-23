<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>


<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">

function btDelete(id)
	{
	var answer = confirm ("ยืนยันการลบข้อมูล");
		if (answer){
		window.location.href="process?action=Arrest&id="+id+"&cmd=del";
		}
		else{
		}
}

function btcop(max,id,offcode)
	{
	var answer = confirm ("ยืนยันการคัดลอกข้อมูล");

		if (answer){
		window.location.href="process?action=Arrest&id="+id+"&maxid="+max+"&offcode="+offcode+"&cmd=cop";
		}
		else{
		}
}
function clear2()
{
	window.location.href="process?action=Arrest" ;
}
</script>
<script type="text/javascript" src="js/sigslot_core.js"></script>
<script src="js/base.js" type="text/javascript"></script>
<script src="js/utility.js" type="text/javascript"></script>

<script type="text/javascript" src="js/MXWidgets.js"></script>
<script type="text/javascript" src="js/JSRecordset.js"></script>
<script type="text/javascript" src="js/DependentDropdown.js"></script>

<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">บันทึกการจับกุม</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td><a href="<c:url value='process?action=Arrest&cmd=add'/>" class="linkmenu3level">เพิ่มข้อมูล</a></td>
              </tr>

              <tr>
                <td>&nbsp;</td>
                <td>
                <form method="post" name="dataform" action="<c:url value='process?action=Arrest&cmd=list'/>">
                  <%@ include file="/Protect/arrest_search_conditions.jsp" %>
				</form>
                </td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                  <table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
					 <tr  align="left" valign="top">
						<td colspan="7"><%=pageUtil.getPagination()%></td>
						<td colspan="4" align="right"><%=pageUtil.getPageStatus()%>	</td>
					</tr >
					<tr class="TblHeaderColumn AlignCenter" >
	                    <td width="40">ลำดับ</td>
						<td width="60" >เลขที่งาน</td>
	                    <td width="120" >หน่วยงาน</td>
	                    <td width="90" >ผู้กล่าวหา</td>
	                    <td width="90" >ผู้ต้องหา</td>
	                    <td width="65" >วันที่รับเรื่อง</td>
	                    <td width="65" >วันที่เกิดเหตุ</td>
	                    <td width="100">พ.ร.บ.</td>
	                    <td width="100">สถานที่เกิดเหตุ</td>
	                    <td >ข้อกล่าวหา</td>
	                    <td width="57" >&nbsp;</td>
					</tr>
					
					<c:forEach items="${dblist}"  var="db" varStatus="i">
			             <c:set var="Rows" value="${Rows + 1}" />
			             <c:if test="${(Rows % 2) == 1}">
							<tr >
			                    <td class="TblRow AlignCenter">${Rows+_rowIndex}</td>
								<td class="TblRow AlignLeft"><a href="process?action=Arrest&id=${db.id}&cmd=showupdate&time=<%=new java.util.Date().getTime() %>" class="linkdatarow">${db.track_no}</a></td>
			                    <td class="TblRow AlignLeft">${db.offname}</td>
			                    <td class="TblRow AlignLeft">${db.accuser_name}</td>
			                    <td class="TblRow AlignLeft">${db.lawbreaker_name}</td>
			                    <td class="TblRow AlignLeft">${db.case_date2}</td>
			                    <td class="TblRow AlignLeft">${db.occurrence_date2}</td>
			                    <td class="TblRow AlignLeft">${db.legislation_name}</td>
			                    <td class="TblRow AlignLeft">${db.scene_address}</td>
			                    <td class="TblRow AlignLeft">${db.guilt_base}</td>
			                    <td class="TblRow AlignLeft">
			                      <img src="images/icn_copy.png" width="25" height="25" border="0" title="คัดลอกรายการ" style="cursor:hand;" onclick = 'btcop("${aamax.max}","${db.id}","${db.offcode}");'>
			                      <c:if test="${db.case_status_code=='00'}">
			                      	<img src="images/icon_delete.gif" width="25" height="25" border="0" title="ลบรายการ" style="cursor:hand;" onclick = 'btDelete("${db.id}");'>
			                      </c:if>
								</td>
							</tr>
						</c:if>
						<c:if test="${(Rows % 2) == 0}">
							<tr>
			                    <td class="TblRow AlignCenter bgRowGray">${Rows+_rowIndex}</td>
								<td class="TblRow AlignLeft bgRowGray"><a href="process?action=Arrest&id=${db.id}&cmd=showupdate&time=<%=new java.util.Date().getTime() %>" class="linkdatarow">${db.track_no}</a></td>
			                    <td class="TblRow AlignLeft bgRowGray">${db.offname}</td>
			                    <td class="TblRow AlignLeft bgRowGray">${db.accuser_name}</td>
			                    <td class="TblRow AlignLeft bgRowGray">${db.lawbreaker_name}</td>
			                    <td class="TblRow AlignLeft bgRowGray">${db.case_date2}</td>
			                    <td class="TblRow AlignLeft bgRowGray">${db.occurrence_date2}</td>
			                    <td class="TblRow AlignLeft bgRowGray">${db.legislation_name}</td>
			                    <td class="TblRow AlignLeft bgRowGray">${db.scene_address}</td>
			                    <td class="TblRow AlignLeft bgRowGray">${db.guilt_base}</td>
			                    <td class="TblRow AlignLeft bgRowGray">
			                      <img src="images/icn_copy.png" width="25" height="25" border="0" alt="คัดลอก" style="cursor:hand;" onclick = 'btcop("${aamax.max}","${db.id}","${db.offcode}");'>
			                      <c:if test="${db.case_status_code=='00'}">
			                      	  <img src="images/icon_delete.gif" width="25" height="25" border="0" alt="ลบ" style="cursor:hand;" onclick = 'btDelete("${db.id}");'>
			                      </c:if>
								</td>
							</tr>
						</c:if>
					</c:forEach>

                  <tr>
                    <td colspan="11">&nbsp;</td>
                  </tr>

                </table>

			</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>

            </table>

            </td>
		  </tr>
		</table>


