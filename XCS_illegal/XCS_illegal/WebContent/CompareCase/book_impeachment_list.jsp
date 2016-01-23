<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp"%>



<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>

<script>

function clear2()
{
	window.location.href="process?action=Impeachment&cmd=list&default=Y";
}

</script>

<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">บันทึกรับคำกล่าวโทษ</span></td>
              </tr>
              <tr>
                <td height="25">&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                <form method="post" name="dataform" action="<c:url value='process?action=Impeachment&cmd=list'/>">
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
<td colspan="5"><%=pageUtil.getPagination()%></td>
<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>

                   <tr valign="middle">
                    <td width="56" height="16" class="TblHeaderColumn AlignCenter">ลำดับ</td>
					<td width="100" class="TblHeaderColumn ">เลขที่งาน</td>
                    <td width="85" class="TblHeaderColumn ">วันที่เกิดเหตุ</td>
                    <td width="63" class="TblHeaderColumn ">ชื่อผู้กล่าวหา</td>
                    <td width="100" class="TblHeaderColumn ">ชื่อผู้ต้องหา</td>
                    <td width="100" class="TblHeaderColumn ">หน่วยงาน</td>
                    <td width="259" class="TblHeaderColumn AlignLeft">ความผิดฐาน</td>
                    <td width="137" class="TblHeaderColumn AlignLeft">พรบ.</td>
                  </tr>


                  <c:forEach items="${dblist}"  var="db" varStatus="i">
		             <c:set var="Rows" value="${Rows + 1}" />
		             <tr <c:if test="${(Rows % 2) == 0}">class="bgRowGray"</c:if> >
		             	<c:if test="${db.send_income_case_id == '0'}" >
		                    <td class="AlignCenter">${Rows}</td>
							<td class="AlignLeft"><a href="process?action=Impeachment&id=${db.id}&track_no=${db.track_no}&cmd=add&time=<%=new java.util.Date().getTime() %>" class="linkdatarow">${db.track_no}</a></td>
		                    <td class="AlignLeft">${db.occurrence_date2}</td>
		                    <td class="AlignLeft">${db.accuser_name}</td>
		                    <td class="AlignLeft">${db.lawbreaker_name}</td>
		                    <td class="AlignLeft">${db.offname}</td>
		                    <td class="AlignLeft">${db.guilt_base}</td>
		                    <td class="AlignLeft">${db.legislation_name}</td>
		                 </c:if>
		                 <c:if test="${db.send_income_case_id != '0'}" >
		                    <td class="AlignCenter"><font color="red">${Rows}</font></td>
							<td class="AlignLeft"><a href="process?action=Impeachment&id=${db.id}&track_no=${db.track_no}&cmd=add&time=<%=new java.util.Date().getTime() %>" class="linkdatarow">${db.track_no}</a></td>
		                    <td class="AlignLeft"><font color="red">${db.occurrence_date2}</font></td>
		                    <td class="AlignLeft"><font color="red">${db.accuser_name}</font></td>
		                    <td class="AlignLeft"><font color="red">${db.lawbreaker_name}</font></td>
		                    <td class="AlignLeft"><font color="red">${db.offname}</font></td>
		                    <td class="AlignLeft"><font color="red">${db.guilt_base}</font></td>
		                    <td class="AlignLeft"><font color="red">${db.legislation_name}</font></td>
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
document.dataform.jobname.value=' แสดงรายการที่ยังไม่รับเป็นคดี';
</script>
