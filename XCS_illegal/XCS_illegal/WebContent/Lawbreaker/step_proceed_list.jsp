<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>

<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.PageUtil"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>

<link href="css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript" src="js/rollimage.js" ></script>
<script type="text/javascript" language="JavaScript" src="js/menu.js" ></script>
<script type="text/javascript">
function clear2()
{
	window.location.href="process?action=Step";
}
</script>
</head>

		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">สถานะคดี</span></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td>
                 <form method="post" name="dataform" action="<c:url value='process?action=Step&cmd=list'/>">
                  <%@ include file="/Protect/arrest_search_conditions.jsp" %>
				</form> </td>
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
						<td colspan="5" align="right"><%=pageUtil.getPageStatus()%>	</td>
				   </tr >
                   <tr>
                    <td width="50" class="TblHeaderColumn">ลำดับที่</td>
                    <td width="60" class="TblHeaderColumn AlignCenter">เลขที่คดี</td>
                    <td width="90" class="TblHeaderColumn">ผู้กล่าวหา</td>
                    <td width="90" class="TblHeaderColumn">ผู้ต้องหา</td>
                    <td width="60" class="TblHeaderColumn">วันที่เกิดเหตุ</td>
                    <td class="TblHeaderColumn">สถานที่เกิดเหตุ</td>
                    <td width="60" class="TblHeaderColumn">วันที่รับเรื่อง</td>
                    <td width="60" class="TblHeaderColumn">วันที่เปรียบเทียบ</td>
                    <td width="100" class="TblHeaderColumn">พ.ร.บ.</td>
                    <td width="80" class="TblHeaderColumn">ของกลาง</td>
                    <td class="TblHeaderColumn">ข้อกล่าวหา</td>
                    <td width="80" class="TblHeaderColumn">สถานะ</td>
                  </tr>
           	<c:forEach items="${dblist}"  var="db" varStatus="i">
             <c:set var="Rows" value="${Rows + 1}" />
             <c:if test="${(Rows % 2) == 1}">
				<tr class="TblRow AlignLeft">
                    <td class="TblRow AlignCenter">${Rows}</td>
					<td class="TblRow AlignLeft">${db.case_id}</td>
					<td class="TblRow AlignLeft">${db.accuser_name}</td>
					<td class="TblRow AlignLeft">${db.lawbreaker_name}</td>
                    <td class="TblRow AlignLeft">${db.occurrence_date2}</td>
                    <td class="TblRow AlignLeft" >${db.scene_address}</td>
                    <td class="TblRow AlignLeft">${db.application_date2}</td>
                    <td class="TblRow AlignLeft">${db.compare_case_date2}</td>
                    <td class="TblRow AlignLeft">${db.legislation_name}</td>
                    <td class="TblRow AlignLeft">${db.product_group_name}</td>
                    <td class="TblRow AlignLeft">${db.guilt_base}</td>
                    <td class="TblRow AlignLeft">${db.compare_status_name}</td>
				</tr>
			</c:if>
			<c:if test="${(Rows % 2) == 0}">

				<tr class="TblRow bgRowGray">
                    <td class="TblRow AlignCenter bgRowGray">${Rows}</td>
					<td class="TblRow AlignLeft">${db.case_id}</td>
					<td class="TblRow AlignLeft">${db.accuser_name}</td>
					<td class="TblRow AlignLeft">${db.lawbreaker_name}</td>
                    <td class="TblRow AlignLeft">${db.occurrence_date2}</td>
                    <td class="TblRow AlignLeft" >${db.scene_address}</td>
                    <td class="TblRow AlignLeft">${db.application_date2}</td>
                    <td class="TblRow AlignLeft">${db.compare_case_date2}</td>
                    <td class="TblRow AlignLeft">${db.legislation_name}</td>
                    <td class="TblRow AlignLeft">${db.product_group_name}</td>
                    <td class="TblRow AlignLeft">${db.guilt_base}</td>
                    <td class="TblRow AlignLeft">${db.compare_status_name}</td>

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
<script type="text/javascript" >
document.dataform.nojob.style.display='none';
document.dataform.jobname.style.display='';
document.dataform.jobname.value=' แสดงเฉพาะคดีที่ยังไม่สิ้นสุด';
</script>
		
