<%@ page import="com.ko.webapp.util.PageUtil" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>

<%
    //FormHandler formHandler = new FormHandler(request);
    PageUtil pageUtil = new PageUtil(request);
%>


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
                        <a href="process?action=CompareCase&cmd=add">เพิ่มข้อมูล</a>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <form action="process?action=CompareCase&cmd=list" method="post" name="form1">
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
                                                                       size="13" readonly value="${start_date}">
                                                                <a href="javascript:NewCssCal('start_date_text','ddMMyyyy','dropdown',false)"><img
                                                                        src="images/btn_calendar.png"
                                                                        alt="" width="19" height="19" align="middle"
                                                                        style="border-style: none" id="start_date_img"
                                                                        width="19" height="19"/></a>
                                                                ถึง :&nbsp;
                                                                <input name="end_date" type="text" id="end_date_text"
                                                                       class="textreadonly" size="13" readonly
                                                                       value="${end_date}">
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
                                                                <option value=""></option>
                                                                <c:forEach items="${les}" var="les" varStatus="i">
                                                                    <option value="${les.id}" ${les.id==legislation_id?'selected':''}>${les.legislation_name}</option>
                                                                </c:forEach>
                                                            </select>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="right">หน่วยงาน :&nbsp;</td>
                                                            <td align="left">
                                                                <input value="${compare_office}" type="text" name="compare_office" id="compare_office" readonly size="8">
                                                                <img src="images/btn_browse.png"  width="18" height="19" border="0" alt="ค้นหาหน่วบงาน" style="cursor: hand" name="search_from_corporation_code" id="search_from_corporation_code"
                                                                        onclick="window.open('process?action=CompareCase&compare_office=compare_office&ed_offname=ed_offname&cmd=openEdPopup' , '_blank' , 'menubar=no,toorlbar=no,location=no,scrollbars=yes, width=650,height=500,top=220,left=400,modal=yes');">
                                                                <input value="${ed_offname}" name="ed_offname" type="text" readonly id="ed_offname">
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td align="right">ประเภทการปรับ :&nbsp;</td>
                                                            <td align="left">
                                                                <input type="radio" id="case_fine1" name="case_fine"/>ทั้งหมด
                                                                <input type="radio" id="case_fine2" name="case_fine"/>ปรับเพิ่ม
                                                                <input type="radio" id="case_fine3" name="case_fine"/>ปรับลด
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
                                                           onclick="writeTranLog('ค้นหาประวัติผู้ต้องสงสัยคนไทย');">

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
                            <table style="width:75%" cellspacing="0">
                                <thead>
                                <tr style="text-align:center;background-color:#ffccff;">
                                    <th style="width:5%">ลำดับที่</th>
                                    <th style="width:15%">เลขที่คดีเปรียบเทียบปรับ</th>
                                    <th style="width:15%">ประเภท</th>
                                    <th style="width:15%">ค่าปรับเปรียบเทียบคดีใหม่</th>
                                    <th style="width:15%">จำนวนผู้ต้องหา</th>
                                    <th style="width:16%">ค่าปรับเปรียบเทียบคดีเดิม</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:if test="${suspects}">
                                <c:set var="orderBase" value="<%=(pageUtil.getPage()-1)*pageUtil.getPageSize()%>"
                                       scope="page"/>
                                <c:if test="${suspects[0] != null}">
                                    <c:forEach items="${suspects}" var="suspect" varStatus="i">
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
                                            <td class="TblRow AlignLeft">
                                                <a href="<c:url value='/process?action=Suspect&cmd=edit&id='/>${suspect.id}">
                                                        ${suspect.full_text_name}
                                                </a>
                                            </td>
                                            <td class="TblRow AlignCenter">
                                                    ${suspect.suspect_id_card}
                                            </td>
                                            <td class="TblRow AlignCenter">
                                                    ${suspect.birthdate_age}
                                            </td>
                                            <td class="TblRow AlignLeft">
                                                    ${suspect.full_address}
                                            </td>
                                            <td>
                                                <input name="Button1" type="button" class="barbutton"
                                                       value="ข้อมูลเพิ่มเติม" onclick="doDetail(${suspect.id})">
                                                <img src="<c:url value='/images/icon_delete.gif'/>" alt=""
                                                     onclick="doDelete(${suspect.id})" style="cursor:hand;"/>
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








