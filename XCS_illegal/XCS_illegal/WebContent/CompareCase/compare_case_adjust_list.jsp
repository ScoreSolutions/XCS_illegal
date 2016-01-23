<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp"%>

<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>

<script>

function clear2()
{
	window.location.href="process?action=Caseadjust&cmd=list&default=Y" ;
}

</script>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">เปรียบเทียบปรับ</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                  <form method="post" name="dataform" action="<c:url value='process?action=Caseadjust&cmd=list'/>">
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
                <td><table class="tableList" width="1000"  border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                  <tr  align="left" valign="top">
					<td colspan="5"><%=pageUtil.getPagination()%></td>
					<td colspan="6" align="right"><%=pageUtil.getPageStatus()%>	</td>
				  </tr>
                  <tr valign="middle">
                    <td width="30" height="16" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                    <td width="80" class="TblHeaderColumn AlignCenter">เลขที่งาน</td>
                    <td width="70" class="TblHeaderColumn AlignCenter">เลขที่คดี</td>
                    <td width="100" class="TblHeaderColumn AlignCenter">หน่วยงาน</td>
                    <td width="65" class="TblHeaderColumn AlignCenter ">วันที่เกิดเหตุ</td>
                    <td width="65" class="TblHeaderColumn AlignCenter ">วันที่รับเรื่องส่วนคดี</td>
                    <td class="TblHeaderColumn AlignCenter ">ข้อกล่าวหา</td>
                    <td width="100" class="TblHeaderColumn AlignCenter ">ชื่อผู้กล่าวหา</td>
                    <td width="100" class="TblHeaderColumn AlignCenter ">ชื่อผู้กระทำผิด</td>
                    <td width="100" class="TblHeaderColumn AlignCenter ">พ.ร.บ.</td>
                    <td width="100" class="TblHeaderColumn AlignCenter ">สถานที่เกิดเหตุ</td>
                  </tr>

    		<c:forEach items="${dblist}"  var="db" varStatus="i">
             <c:set var="Rows" value="${Rows + 1}" />
				<tr valign="top" <c:if test="${(Rows % 2) == 0}"> class='bgRowGray' </c:if>>
					<c:if test="${db.send_income_case_id == '0'}">
	                    <td class="TblRow AlignCenter">${Rows+_rowIndex}</td>
	                    <td class="TblRow AlignCenter">${db.track_no}</td>
						<td class="TblRow AlignCenter"><a href="process?action=Caseadjust&id=${db.id}&cmd=add&time=<%=new java.util.Date().getTime() %>" class="linkdatarow">${db.case_id}</a></td>
						<td class="TblRow AlignLeft">${db.short_name}</td>
	                    <td class="TblRow AlignLeft">${db.occurrence_date}</td>
	                    <td class="TblRow AlignLeft">${db.case_date2}</td>
	                    <td class="TblRow AlignLeft">${db.guilt_base}</td>
	                    <td class="TblRow AlignLeft">${db.accuser_name}</td>
	                    <td class="TblRow AlignLeft">${db.lawbreaker_name}</td>
	                    <td class="TblRow AlignLeft">${db.legislation_name}</td>
	                    <td class="TblRow AlignLeft">${db.scene_address}</td>
	                </c:if>
	                <c:if test="${db.send_income_case_id != '0'}">
	                    <td class="TblRow AlignCenter"><font color="red">${Rows+_rowIndex}</font> </td>
	                    <td class="TblRow AlignCenter"><font color="red">${db.track_no}</font></td>
						<td class="TblRow AlignCenter"><a href="process?action=Caseadjust&id=${db.id}&cmd=add&time=<%=new java.util.Date().getTime() %>" class="linkdatarow">${db.case_id}</a></td>
						<td class="TblRow AlignLeft"><font color="red">${db.short_name}</font></td>
	                    <td class="TblRow AlignLeft"><font color="red">${db.occurrence_date}</font></td>
	                    <td class="TblRow AlignLeft"><font color="red">${db.case_date2}</font> </td>
	                    <td class="TblRow AlignLeft"><font color="red">${db.guilt_base}</font> </td>
	                    <td class="TblRow AlignLeft"><font color="red">${db.accuser_name}</font> </td>
	                    <td class="TblRow AlignLeft"><font color="red">${db.lawbreaker_name}</font></td>
	                    <td class="TblRow AlignLeft"><font color="red">${db.legislation_name}</font></td>
	                    <td class="TblRow AlignLeft"><font color="red">${db.scene_address}</font></td>
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
document.dataform.jobname.value=' แสดงรายการที่ยังไม่เปรียบเทียบปรับ';
</script>

