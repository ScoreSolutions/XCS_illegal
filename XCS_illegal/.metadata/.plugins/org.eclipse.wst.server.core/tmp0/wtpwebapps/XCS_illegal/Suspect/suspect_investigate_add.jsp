<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>



<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td width="1%">&nbsp;</td>
    <c:choose>
        <c:when test="${suspect.suspect_type == '1'}">
            <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยคนไทย</span></td>
        </c:when>
        <c:when test="${suspect.suspect_type == '2'}">
            <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยชาวต่างชาติ</span></td>
        </c:when>
        <c:when test="${suspect.suspect_type == '3'}">
            <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยผู้ประกอบการ</span></td>
        </c:when>
    </c:choose>
</tr>
<tr>
<td>&nbsp;</td>
<td>
<form action="process?action=Suspect&cmd=list" method="post" name="from1">
    <table width="379" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td width="113" align="right" valign="middle">ประเภทผู้ต้องสงสัย&nbsp;:&nbsp;</td>
            <td width="260" valign="middle"><select name="suspect_type">
                <option value="1" ${suspect.suspect_type=='1'?'selected':''}>คนไทย</option>
                <option value="2" ${suspect.suspect_type=='2'?'selected':''}>คนต่างชาติ</option>
                <option value="3" ${suspect.suspect_type=='3'?'selected':''}>ผู้ประกอบการ</option>
            </select> <input name="Button1" type="submit" class="barbutton"
                             value="ตกลง"></td>
        </tr>
    </table>
</form>
<c:if test="${suspect.suspect_type == '1'}">
    <%@include file="suspect_detail1.jsp" %>
</c:if>
<c:if test="${suspect.suspect_type == '2'}">
    <%@include file="suspect_detail2.jsp" %>
</c:if>
<c:if test="${suspect.suspect_type == '3'}">
    <%@include file="suspect_detail3.jsp" %>
</c:if>

<br>
    
<div class="innerPosition" id="suspectInfo" style="width:100%;">
    <jsp:include page="add_investigate_form.jsp" /> 
</div>

</td>
</tr>
</table>
