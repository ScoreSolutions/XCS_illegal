<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>

<c:if test="${lawbreaker_type == null}">
    <c:set var="lawbreaker_type" value="1"/>
</c:if>
<script type="text/javascript">
    var lawbreakerType = ${lawbreaker_type};
</script>
<table width="100%" height="100%" border="0" cellspacing="0"
       cellpadding="0">
    <tr>
        <td width="100%" align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="1%">&nbsp;</td>
                    <c:choose>
                        <c:when test="${lawbreaker_type == '1'}">
                            <td width="99%" ><span class="websitename">ทะเบียนประวัติผู้กระทำผิดคนไทย</span></td>
                        </c:when>
                        <c:when test="${lawbreaker_type == '2'}">
                            <td width="99%" ><span class="websitename">ทะเบียนประวัติผู้กระทำผิดชาวต่างชาติ</span></td>
                        </c:when>
                        <c:when test="${lawbreaker_type == '3'}">
                            <td width="99%"  ><span class="websitename">ทะเบียนประวัติผู้กระทำผิดผู้ประกอบการ</span></td>
                        </c:when>
                    </c:choose>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <form action="process?action=Lawbreaker&cmd=changeForm&pageType=lawbreaker_list" method="post"
                              name="from1">
                            <table width="379" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td width="113" align="right" valign="middle">ประเภทผู้กระทำผิด&nbsp;:&nbsp;</td>
                                    <td width="260" valign="middle"><select name="lawbreaker_type_text">
                                        <option value="1" ${(lawbreaker_type=='1')?'selected':''}>คนไทย</option>
                                        <option value="2" ${(lawbreaker_type=='2')?'selected':''}>คนต่างชาติ</option>
                                        <option value="3" ${(lawbreaker_type=='3')?'selected':''}>ผู้ประกอบการ</option>
                                    </select> <input name="Button1" type="submit" class="barbutton"
                                                     value="ตกลง"></td>
                                </tr>
                            </table>
                        </form>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <c:choose>
                            <c:when test="${lawbreaker_type == '1'}">
                                 <jsp:include page="lawbreaker_list_search_form1.jsp"/>
                            </c:when>
                            <c:when test="${lawbreaker_type == '2'}">
                                 <jsp:include page="lawbreaker_list_search_form2.jsp"/>
                            </c:when>
                            <c:when test="${lawbreaker_type == '3'}">
                                 <jsp:include page="lawbreaker_list_search_form3.jsp"/>
                            </c:when>
                        </c:choose>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td height="30" style=display:none >
                        <a href="process?action=Lawbreaker&cmd=createForm&lawbreakerType=${lawbreaker_type}"> เพิ่มข้อมูลใหม่</a>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <c:if test="${lawbreakers != null}">
                            <c:choose>
                                <c:when test="${lawbreaker_type == '1'}">
                                       <jsp:include page="lawbreaker_list_search_result.jsp"/>
                                </c:when>
                                <c:when test="${lawbreaker_type == '2'}">
                                       <jsp:include page="lawbreaker_list_search_result_eng.jsp"/>
                                </c:when>
                                <c:when test="${lawbreaker_type == '3'}">
                                       <jsp:include page="lawbreaker_list_search_result_business.jsp"/>
                                </c:when>
                            </c:choose>
                        </c:if>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>
<script type="text/javascript">
   // getProvince('sProvince', 'sDistrict', 'subDistrict', '', '', '');
    getProvince('sProvince','sDistrict','subDistrict','${param.province_code}','${param.district_code}','${param.subdistrict_code}');
    function doDelete(id){
        if(alertConfirmDelete()){
            if(lawbreakerType == 1){
                writeTranLog('ลบประวัติผู้กระทำผิดคนไทย');
            }else if(lawbreakerType == 2){
                writeTranLog('ลบประวัติผู้กระทำผิดชาวต่างชาติ');
            }else{
                writeTranLog('ลบประวัติผู้กระทำผิดผู้ประกอบการ');
            }
            location.href = "process?action=Lawbreaker&cmd=deleteLawbreaker&id="+id;
        }
    }
    function doDetail(id){
        writeTranLog('แสดงข้อมูลเพิ่มเติม');
        location.href = "<c:url value='/process?action=Lawbreaker&cmd=detail&id='/>"+id;
    }
    function clear2()
    {
    	window.location.href="process?action=Lawbreaker&cmd=list";
    }
</script>







