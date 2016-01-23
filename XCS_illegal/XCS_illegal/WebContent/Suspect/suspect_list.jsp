<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>

<c:if test="${suspect_type == null}">
    <c:set var="suspect_type" value="1"/>
</c:if>
<script type="text/javascript">
    var suspectType = ${suspect_type};
</script>
<script type='text/javascript' src='dwr/interface/Suspect.js'></script>
<table width="100%" height="100%" border="0" cellspacing="0"
       cellpadding="0">
    <tr>
        <td width="100%" align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="1%">&nbsp;</td>
                    <c:choose>
                        <c:when test="${suspect_type == '1'}">
                            <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยคนไทย</span></td>
                        </c:when>
                        <c:when test="${suspect_type == '2'}">
                            <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยชาวต่างชาติ</span></td>
                        </c:when>
                        <c:when test="${suspect_type == '3'}">
                            <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยผู้ประกอบการ</span></td>
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
                        <form action="process?action=Suspect&cmd=list" method="post"
                              name="from1">
                            <table width="379" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td width="113" align="right" valign="middle">ประเภทผู้ต้องสงสัย&nbsp;:&nbsp;</td>
                                    <td width="260" valign="middle">
                                    <select name="suspect_type">
                                        <option value="1" ${(suspect_type=='1')?'selected':''}>คนไทย</option>
                                        <option value="2" ${(suspect_type=='2')?'selected':''}>คนต่างชาติ</option>
                                        <option value="3" ${(suspect_type=='3')?'selected':''}>ผู้ประกอบการ</option>
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
                            <c:when test="${suspect_type == '1'}">
                                 <jsp:include page="suspect_list_search_form1.jsp"/>
                            </c:when>
                            <c:when test="${suspect_type == '2'}">
                                 <jsp:include page="suspect_list_search_form2.jsp"/>
                            </c:when>
                            <c:when test="${suspect_type == '3'}">
                                 <jsp:include page="suspect_list_search_form3.jsp"/>
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
                    <td height="30">
                        <a href="process?action=Suspect&cmd=createForm&suspectType=${suspect_type}"> เพิ่มข้อมูลใหม่</a>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <c:if test="${suspects != null}">
                            <c:choose>
                                <c:when test="${suspect_type == '1'}">
                                       <jsp:include page="suspect_list_search_result.jsp"/>
                                </c:when>
                                <c:when test="${suspect_type == '2'}">
                                       <jsp:include page="suspect_list_search_result_eng.jsp"/>
                                </c:when>
                                <c:when test="${suspect_type == '3'}">
                                       <jsp:include page="suspect_list_search_result_business.jsp"/>
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
    getProvince('sProvince', 'sDistrict', 'subDistrict', '${province_code}', '${district_code}', '${subdistrict_code}');
    function doDelete(SuspectNo){
        Suspect.chkRefSuspect(SuspectNo,function (data){
        	if(data == ""){
		        if(alertConfirmDelete()){
		            if(suspectType == 1){
		                writeTranLog('ลบประวัติผู้ต้องสงสัยคนไทย');
		            }else if(suspectType == 2){
		                writeTranLog('ลบประวัติผู้ต้องสงสัยชาวต่างชาติ');
		            }else{
		                writeTranLog('ลบประวัติผู้ต้องสงสัยผู้ประกอบการ');
		            }
		            location.href = "process?action=Suspect&cmd=deleteSuspect&suspect_no="+SuspectNo;
		        }
        	}else
            	alert(data);
        });
    }

    
    function doDetail(id){
        writeTranLog('แสดงข้อมูลเพิ่มเติม');
        location.href = "<c:url value='/process?action=Suspect&cmd=detail&id='/>"+id;
    }
    function clear2()
    {
    	window.location.href="process?action=Suspect&cmd=list" ;
    }
</script>







