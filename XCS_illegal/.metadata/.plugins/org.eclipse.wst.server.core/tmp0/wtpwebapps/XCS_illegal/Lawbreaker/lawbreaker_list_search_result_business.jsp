










<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>
<%
	PageUtil pageUtil = new PageUtil(request);
%>
<script type="text/javascript">
	function confirmBox(str_text)
	{
  		var r = confirm(str_text);
  		return r;
	}
</script>
<table border="0" style="width:80%">
	<tr><td><%=pageUtil.getPagination()%></td><td align="right"><%=pageUtil.getPageStatus()%></td></tr>
</table>
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Lawbreaker&cmd=delete"/>">
<table style="width:100%" cellspacing="0">
        <thead>
        <tr style="text-align:center;background-color:#ffccff;">
            <th style="width:5%">ลำดับที่</th>
            <th style="width:15%">ชื่อผู้ประกอบการ</th>
            <th style="width:15%">ทะเบียนนิติบุคคล</th>
            <th style="width:10%">ทะเบียนสรรพสามิต</th>
            <th style="width:28%">ใบอนุญาติ (วันที่ออกใบอนุญาติ - วันที่หมดอายุ)</th>
            <th >สถานที่ตั้ง</th>
        </tr>
        </thead>

	<tbody>
        <c:set var="orderBase" value="<%=(pageUtil.getPage()-1)*pageUtil.getPageSize()%>" scope="page" />
        <c:if test="${lawbreakers[0] != null}">
		<c:forEach items="${lawbreakers}"  var="lawbreaker" varStatus="i">
            <c:choose>
          <c:when test="${i.count % 2 == 0}">
            <c:set var="rowStyle" scope="page" value="background-color:#ccccff;"/>
          </c:when>
          <c:otherwise>
            <c:set var="rowStyle" scope="page" value="even"/>
          </c:otherwise>
        </c:choose>
			<tr style="${rowStyle}">
				<td  class="TblRow AlignCenter">${orderBase+i.count}</td>
				<td  class="TblRow AlignLeft">
				<a href="<c:url value='/process?action=Lawbreaker&cmd=edit&id='/>${lawbreaker.id}">
                        ${lawbreaker.comp_title_text}&nbsp;${lawbreaker.company_name}
                    </a></td>
			    <td  class="TblRow AlignLeft">
					${lawbreaker.corporation_code}
				</td>
                <td  class="TblRow AlignLeft">
                    ${lawbreaker.excise_reg_no}
                </td>
                <td  class="TblRow AlignCenter">
                    ${lawbreaker.license_no}[<fmt:formatDate value="${lawbreaker.license_date_from}" pattern="dd/MM/yyyy" />
                        -<fmt:formatDate value="${lawbreaker.license_date_to}" pattern="dd/MM/yyyy" />]
                </td>
				<td  class="TblRow AlignLeft">
					${lawbreaker.full_address}
				</td>
			</tr>
		</c:forEach>
        </c:if>
    <c:if test="${lawbreakers[0] == null}">
        <tr>
            <td colspan="6" class="TblRow AlignCenter" height="25px">
                   ไม่พบรายการที่ต้องการหา
            </td>
        </tr>
    </c:if>
	</tbody>
</table>
</form>