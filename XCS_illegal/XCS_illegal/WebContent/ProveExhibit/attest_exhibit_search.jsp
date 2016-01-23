<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@include file="/Templates/taglibs.jsp"%>



<%
PageUtil pageUtil = new PageUtil(request);
%>
   
<%@page import="com.ko.webapp.util.PageUtil"%>
<script type="text/javascript" >
   
   function clear2()
   {
	 
   	window.location.href="process?action=Insideprove&cmd=list&default=Y" ;


   }
   
   
   </script>

<script type="text/javascript" src="js/datetimepicker_css.js" ></script>
		<!-- Body -->
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>

			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">การพิสูจน์ของกลาง</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                  <form method="post" name="dataform" action="<c:url value='process?action=Insideprove&cmd=list'/>">
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
						<td colspan="9"><%=pageUtil.getPagination()%></td><td align="right" colspan="2"><%=pageUtil.getPageStatus()%>	</td>
					</tr>
                   
                   <tr>
                    <td width="50" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                    <td width="80" class="TblHeaderColumn AlignCenter">เลขที่คดี</td>
                    <td width="80" class="TblHeaderColumn AlignCenter">วันที่คดี</td>
                    <td width="70"  class="TblHeaderColumn AlignCenter">เลขที่พิสูจน์</td>
                    <td width="80" class="TblHeaderColumn AlignCenter">วันที่รับเรื่องพิสูจน์</td>
                    <td width="150" class="TblHeaderColumn AlignCenter">พ.ร.บ.</td>
                    <td width="100" class="TblHeaderColumn AlignCenter">สินค้า</td>
                    <td width="50" class="TblHeaderColumn AlignCenter">สถานะ</td>
                    <td width="100" class="TblHeaderColumn AlignCenter"> ผู้ต้องหา</td>
                    <td width="120" class="TblHeaderColumn AlignCenter"> ผู้กล่าวหา</td>
                    <td width="120" class="TblHeaderColumn AlignCenter"> ผู้พิสูจน์</td>
                  </tr>
		          <c:forEach items="${dblist}"  var="db" varStatus="i">
		             <c:set var="Rows" value="${Rows + 1}" />
		             <tr
			             <c:if test="${(Rows % 2) == 1}">
							 class="TblRow AlignCenter"
			             </c:if>
			             <c:if test="${(Rows % 2) == 0}">
			                 class="TblRow bgRowGray"
			             </c:if>
		             >
		             	<c:if test="${db.send_income_case_id == '0'}">
		             		<td class="TblRow AlignCenter">${Rows}</td>
							<td class="TblRow AlignLeft"><a href="process?action=Insideprove&id=${db.id}&track_no=${db.track_no}&cmd=add" class="linkdatarow">${db.case_id}</a></td>
		                    <td class="TblRow AlignLeft">${db.case_date2}</td>
		                    <td class="TblRow AlignLeft">${db.exhibit_report_no}</td>
		                    <td class="TblRow AlignLeft">${db.taken_date2}</td>
		                    <td class="TblRow AlignLeft">${db.legislation_name}</td>
		                    <td class="TblRow AlignLeft">${db.product_group_name}</td>
		                    <td class="TblRow AlignLeft">${db.status_name}</td>
		                    <td class="TblRow AlignLeft">${db.lawbreaker_name}</td>
		                    <td class="TblRow AlignLeft">${db.accuser_name}</td>
		                    <td class="TblRow AlignLeft">${db.staff_name_prove}</td>
		             	</c:if>
		             	<c:if test="${db.send_income_case_id != '0'}">
		             		<td class="TblRow AlignCenter"><font color="red" >${Rows}</font></td>
							<td class="TblRow AlignLeft"><a href="process?action=Insideprove&id=${db.id}&track_no=${db.track_no}&cmd=add" class="linkdatarow">${db.case_id}</a></td>
		                    <td class="TblRow AlignLeft"><font color="red" >${db.case_date2}</font></td>
		                    <td class="TblRow AlignLeft"><font color="red" >${db.exhibit_report_no}</font></td>
		                    <td class="TblRow AlignLeft"><font color="red" >${db.taken_date2}</font></td>
		                    <td class="TblRow AlignLeft"><font color="red" >${db.legislation_name}</font></td>
		                    <td class="TblRow AlignLeft"><font color="red" >${db.product_group_name}</font></td>
		                    <td class="TblRow AlignLeft"><font color="red" >${db.status_name}</font></td>
		                    <td class="TblRow AlignLeft"><font color="red" >${db.lawbreaker_name}</font></td>
		                    <td class="TblRow AlignLeft"><font color="red" >${db.accuser_name}</font></td>
		                    <td class="TblRow AlignLeft"><font color="red" >${db.staff_name_prove}</font></td>
		             	</c:if>
		                    
					</tr>
				</c:forEach>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                  </tr>
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
document.dataform.jobname.value=' แสดงรายการที่ยังไม่พิสูจน์';
</script>
	

