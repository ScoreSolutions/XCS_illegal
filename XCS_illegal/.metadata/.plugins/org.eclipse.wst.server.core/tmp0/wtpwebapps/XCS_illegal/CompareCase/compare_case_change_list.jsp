<%@ page import="com.ko.webapp.util.PageUtil" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>

<%
    //FormHandler formHandler = new FormHandler(request);
    PageUtil pageUtil = new PageUtil(request);
%>
<script type='text/javascript' src='dwr/interface/EdOfficeTest.js'></script>
<script type="text/javascript">
function clear2()
{
	window.location.href="process?action=CompareCaseChange&cmd=list" ;
}
</script>

<table width="100%" height="100%" border="0" cellspacing="0"
       cellpadding="0">
    <tr>
        <td width="100%" align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="1%">&nbsp;</td>
                    <td width="99%"><span class="websitename">การเพิ่ม-ลดค่าปรับเปรียบเทียบ</span></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <a href="process?action=CompareCaseChange&cmd=add">เพิ่มข้อมูล</a>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <form action="process?action=CompareCaseChange&cmd=list" method="post" name="form1">
                            <input type="hidden" name="doSearch" value="search"/>
                            <table width="800" border="1" cellpadding="0" cellspacing="0"
                                   bordercolor="#CCCCCC">
                                <tr>
                                    <td>
                                        <table width="800" border="0" cellpadding="0" cellspacing="0"
                                               bgcolor="#F5F5F5">

                                            <tr>
                                                <td>&nbsp;</td>
                                                <td align="left" valign="top"><span class="sectionname">ค้นหา</span>
                                                </td>
                                                <td>&nbsp;</td>
                                            </tr>

                                            <tr id="sp_row">
                                                <td>&nbsp;</td>
                                                <td align="center" valign="top">
                                                    <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                                           id="sp_thai">
                                                        <tr>
                                                            <td width="35%" height="25" align="right">
                                                                เลขที่คดีเปรียบเทียบปรับ :&nbsp;</td>
                                                            <td align="left"><input type="text" name="compare_case_no"
                                                                                    class="textbox" size="30" value="${compare_case_no}"/></td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="right">วันที่เปรียบเทียบปรับ
                                                                :&nbsp;</td>

                                                            <td align="left">
                                                                <input name="start_date" type="text"
                                                                       id="start_date_text" class="textreadonly"
                                                                       size="13" readonly value="${param.start_date}">
                                                                <a href="javascript:NewCssCal('start_date_text','ddMMyyyy','dropdown',false)"><img
                                                                        src="images/btn_calendar.png"
                                                                        alt="" width="19" height="19" align="middle"
                                                                        style="border-style: none" id="start_date_img"
                                                                        width="19" height="19"/></a>
                                                                ถึง :&nbsp;
                                                                <input name="end_date" type="text" id="end_date_text"
                                                                       class="textreadonly" size="13" readonly
                                                                       value="${param.end_date}">
                                                                <a href="javascript:NewCssCal('end_date_text','ddMMyyyy','dropdown',false)"><img
                                                                        src="images/btn_calendar.png"
                                                                        alt="" width="19" height="19" align="middle"
                                                                        style="border-style: none" id="end_date_img"
                                                                        width="19" height="19"/></a>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="right">พ.ร.บ. :&nbsp;</td>
                                                            <td align="left"><select name="legislation_id">
                                                                <option value="">เลือก</option>
                                                                <c:forEach items="${les}" var="les" varStatus="i">
                                                                    <option value="${les.id}" ${les.id==legislation_id?'selected':''}>${les.legislation_name}</option>
                                                                </c:forEach>
                                                            </select>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="right">หน่วยงาน :&nbsp;</td>
                                                            <td align="left">
                                                            	<c:if test="${IsAdmin != '1'}">
                                                            		<input value="${compare_office}" type="text" class="textview" onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();" name="compare_office" id="compare_office" size="6" onBlur="getOffname(this.value,'Y',ed_offname);" >
                                                            	</c:if>
                                                                <c:if test="${IsAdmin == '1'}">
                                                                	<input value="${compare_office}" type="text" class="textbox" name="compare_office" id="compare_office" size="6" onBlur="getOffname(this.value,'Y',ed_offname);" >
                                                                	<img id="imgEdOffice" src="images/btn_browse.png"  width="18" height="19" border="0" alt="ค้นหาหน่วยงาน" style="cursor:pointer"
                                                                	onclick="window.open('process?action=CompareCase&compare_office=compare_office&ed_offname=ed_offname&cmd=openEdPopup' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');">
                                                                </c:if>
                                                                <input value="${ed_offname}" type="text" class="textview" name="ed_offname"  onKeyPress="txtKeyPress();" onKeyDown="disableKeyDown();"  id="ed_offname" size="28" >
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">ประเภทการปรับ :&nbsp;</td>
                                                            <td align="left">
                                                                <input type="radio" id="case_fine1" name="case_fine" value="" checked />ทั้งหมด
                                                                <input type="radio" id="case_fine2" name="case_fine" value="I" />ปรับเพิ่ม
                                                                <input type="radio" id="case_fine3" name="case_fine" value="D" />ปรับลด
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                                <td>&nbsp;</td>
                                            </tr>
                                            <tr>
                                                <td>&nbsp;</td>
                                                <td height="40" align="center" valign="bottom">
                                                    <!--  <img src="/images/btn_search_big.png" width="65" height="23">  -->
                                                    <input alt="Submit Form" type="image"
                                                           src="images/btn_search_big.png" width="65" height="23"
                                                           name="search"
                                                           onclick="writeTranLog('ค้นหาข้อมูลการเพิ่ม-ลดค่าปรับเปรียบเทียบ');"><%@ include file="../Templates/clearIcon.jsp"%>

                                                </td>
                                                <td>&nbsp;</td>
                                            </tr>
                                            <tr>
                                                <td align="left" valign="bottom" height="10"></td>
                                                <td></td>
                                                <td align="right" valign="bottom"></td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                            </table>
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
                        <script type="text/javascript">
                            function confirmBox(str_text)
                            {
                                var r = confirm(str_text);
                                return r;
                            }
                        </script>
                        <table border="0" style="width:70%">
                            <tr>
                                <td><%=pageUtil.getPagination()%>
                                </td>
                                <td align="right"><%=pageUtil.getPageStatus()%>
                                </td>
                            </tr>
                        </table>
                        <form id="list" name="dataform" method="post">
                            <table style="width:100%" cellspacing="0">
                                <thead>
                                <tr style="text-align:center;background-color:#cccccc;">
                                    <th style="width:5%">ลำดับที่</th>
                                    <th style="width:15%">เลขที่งาน</th>
                                    <th style="width:15%">เลขที่คดีเปรียบเทียบปรับ</th>
                                    <th style="width:25%">ที่ทำการเปรียบเทียบ</th>
                                    <th style="width:10%">ประเภท</th>
                                    <th style="width:10%">ค่าปรับเปรียบเทียบคดีใหม่</th>
                                    <th style="width:10%">จำนวนผู้ต้องหา</th>
                                    <th style="width:10%">ค่าปรับเปรียบเทียบคดีเดิม</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:if test="${result != null}">
                                <c:set var="orderBase" value="<%=(pageUtil.getPage()-1)*pageUtil.getPageSize()%>"
                                       scope="page"/>
                                <c:if test="${result[0] != null}">
                                    <c:forEach items="${result}" var="r" varStatus="i">
                                        <c:choose>
                                            <c:when test="${i.count % 2 == 0}">
                                                <c:set var="rowStyle" scope="page" value="background-color:#ccccff;"/>
                                            </c:when>
                                            <c:otherwise>
                                                <c:set var="rowStyle" scope="page" value="even"/>
                                            </c:otherwise>
                                        </c:choose>
                                        <tr style="${rowStyle}">
                                            <td class="TblRow AlignCenter">${orderBase+i.count}</td>
                                            <td class="TblRow AlignCenter">${r.track_no}</td>
                                            <td class="TblRow AlignLeft">
                                                <a href="<c:url value='/process?action=CompareCaseChange&cmd=add&ccid='/>${r.compare_case_id}">
                                                        ${r.compare_case_no}
                                                </a>
                                            </td>
                                            <td class="TblRow AlignLeft">${r.compare_name}</td>
                                            <td class="TblRow AlignCenter">
                                                    ${r.change_type_name}
                                            </td>
                                            <td class="TblRow AlignCenter">
                                                    ${r.new_fine}
                                            </td>
                                            <td class="TblRow AlignCenter">
                                                    ${r.lawbreakerqty}
                                            </td>
                                            <td class="TblRow AlignCenter">
                                                    ${r.old_fine}
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${result[0] == null}">
                                    <tr>
                                        <td colspan="6" class="TblRow AlignCenter" height="25px">
                                            ไม่พบรายการที่ต้องการหา
                                        </td>
                                    </tr>
                                </c:if>
                                </c:if>
                                </tbody>
                            </table>
                        </form>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>







