<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.FormHandler,com.ko.webapp.util.PageUtil"%>

<%
	//FormHandler formHandler = new FormHandler(request);
	PageUtil pageUtil = new PageUtil(request);
%>

<script type="text/javascript">
	function confirmBox(str_text)
	{
  		var r = confirm(str_text);
  		return r;
	}
</script>
<table border="0" style="width:70%">
	<tr><td><%=pageUtil.getPagination()%></td><td align="right"><%=pageUtil.getPageStatus()%></td></tr>
</table>
<form id="list" name="dataform" method="post" action="<c:url value="/process2?action=Suspect&cmd=delete"/>">
<table style="width:100%" cellspacing="0">
        <thead>
        <tr class="TblHeaderColumn AlignCenter">
            <th style="width:5%">ลำดับที่</th>
            <th style="width:15%">ชื่อ-สกุล</th>
            <th style="width:15%">เลขที่บัตร ปปช</th>
            <th style="width:15%">วดป เกิด (อายุ)</th>
            <th >ที่อยู่ปัจจุบัน</th>
            <th style="width:15%"></th>
        </tr>
        </thead>
	<tbody>
        <c:set var="orderBase" value="<%=(pageUtil.getPage()-1)*pageUtil.getPageSize()%>" scope="page" />
        <c:if test="${suspects[0] != null}">
		<c:forEach items="${suspects}"  var="suspect" varStatus="i">
            <c:choose>
          <c:when test="${i.count % 2 == 0}">
            <c:set var="rowStyle" scope="page" value="bgRowGray"/>
          </c:when>
          <c:otherwise>
            <c:set var="rowStyle" scope="page" value=""/>
          </c:otherwise>
        </c:choose>
			<tr class="${rowStyle}">
				<td  class="TblRow AlignCenter">${orderBase+i.count}</td>
				<td  class="TblRow AlignLeft">
                    <a href="<c:url value='/process?action=Suspect&cmd=edit&id='/>${suspect.id}">
                        ${(suspect.full_text_name=='')?'-':(suspect.full_text_name)}
                    </a>
                </td>
			    <td  class="TblRow AlignCenter">
					${suspect.suspect_id_card}
				</td>
                <td  class="TblRow AlignCenter">
                    ${suspect.birthdate_age}
                </td>
				<td  class="TblRow AlignLeft">
					${suspect.full_address}
				</td>
				<td>
                <input name="Button1" type="button" class="barbutton"  value="ข้อมูลเพิ่มเติม" onclick="doDetail(${suspect.id})">
                <img src="<c:url value='/images/icon_delete.gif'/>" alt="" onclick="doDelete(${suspect.suspect_no})" style="cursor:hand;"/>
                </td>
			</tr>
		</c:forEach>
        </c:if>
    <c:if test="${suspects[0] == null}">
        <tr>
            <td colspan="6" class="TblRow AlignCenter" height="25px">
                   ไม่พบรายการที่ต้องการหา
            </td>
        </tr>
    </c:if>
	</tbody>
</table>
</form>