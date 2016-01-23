<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
		
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<script>

function clear2()
{
	window.location.href="process?action=Payfine&cmd=list&default=Y" ;
}

</script>

		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">ชำระเงินค่าปรับและออกใบเสร็จ</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                	  <form method="post" name="dataform" action="<c:url value='process?action=Payfine&cmd=list'/>">
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
                <td><table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                   <tr  align="left" valign="top">
<td colspan="6"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
                  
                  <tr valign="middle">
                    <td width="50" height="16" class="TblHeaderColumn AlignCenter">ลำดับที่</td>
                    <td width="80" class="TblHeaderColumn ">เลขที่งาน</td>
                    <td width="80" class="TblHeaderColumn ">เลขที่คดีเปรียบเทียบ</td>
                    <td width="100" class="TblHeaderColumn ">วันที่เปรียบเทียบ</td>
                    <td width="100" class="TblHeaderColumn ">ชื่อผู้กระทำผิด</td>
                    <td width="124" class="TblHeaderColumn ">ข้อกล่าวหา</td>
                    <td width="100" class="TblHeaderColumn ">เลขที่ใบเสร็จ</td>
                    <td width="106" class="TblHeaderColumn ">จำนวนค่าปรับ</td>
                    <td width="124" class="TblHeaderColumn ">เจ้าหน้าที่ดำเนินคดี</td>
                  </tr>
                  
                   <c:forEach items="${dblist}"  var="db" varStatus="i">
             	<c:set var="Rows" value="${Rows + 1}" />
             	<tr	 <c:if test="${(Rows % 2) == 0}">class='bgRowGray'</c:if> >
             		<c:if test="${db.send_income_case_id=='0'}">
	                    <td align="center">${Rows+_rowIndex}</td>
	                    <td >${db.track_no}</td>
						<td >
							<c:if test="${vIsCenter=='N'}">
								<c:if test="${db.show_link == 'Y'}">
									<a href="process?action=Payfine&id=${db.id}&track_no=${db.track_no}&cmd=add" class="linkdatarow">${db.compare_case_no}</a>
								</c:if>
								<c:if test="${db.show_link == 'N'}">
									<span title="คดียังไม่ได้พิสูจน์ของกลาง ไม่สามารถชำระเงินค่าปรับได้" > ${db.compare_case_no}</span>
								</c:if>
							</c:if>
							<c:if test="${vIsCenter=='Y'}">
								<a href="process?action=Payfine&id=${db.id}&track_no=${db.track_no}&cmd=add" class="linkdatarow">${db.compare_case_no}</a>
							</c:if>
						</td>
	                    <td >${db.compare_case_date2}</td>
	                    <td >${db.lawbreaker_name}</td>
	                    <td >${db.guilt_base}</td>
	                    <td >${db.invno}</td>
	                    <td >${db.case_fine}</td>
	                    <td >${db.sue_name}</td>
                    </c:if> 
                    <c:if test="${db.send_income_case_id!='0'}">
	                    <td align="center">${Rows+_rowIndex}</td>
	                    <td ><font color="red">${db.track_no}</font></td>
						<td >
							<c:if test="${vIsCenter=='N'}">
								<c:if test="${db.show_link == 'Y'}">
									<a href="process?action=Payfine&id=${db.id}&track_no=${db.track_no}&cmd=add" class="linkdatarow">${db.compare_case_no}</a>
								</c:if>
								<c:if test="${db.show_link == 'N'}">
									<span title="คดียังไม่ได้พิสูจน์ของกลาง ไม่สามารถชำระเงินค่าปรับได้" >${db.compare_case_no}</span>
								</c:if>
							</c:if>
							<c:if test="${vIsCenter=='Y'}">
								<a href="process?action=Payfine&id=${db.id}&track_no=${db.track_no}&cmd=add" class="linkdatarow">${db.compare_case_no}</a>
							</c:if>
						</td>
	                    <td ><font color="red">${db.compare_case_date2}</font></td>
	                    <td ><font color="red">${db.lawbreaker_name}</font></td>
	                    <td ><font color="red">${db.guilt_base}</font></td>
	                    <td ><font color="red">${db.invno}</font></td>
	                    <td ><font color="red">${db.case_fine}</font></td>
	                    <td ><font color="red">${db.sue_name}</font></td>
                    </c:if> 
				</tr>
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
<script type="text/javascript" >
document.dataform.nojob.style.display='';
document.dataform.jobname.style.display='';
document.dataform.jobname.value=' แสดงรายการที่ยังไม่ชำระเงินค่าปรับ';
</script>