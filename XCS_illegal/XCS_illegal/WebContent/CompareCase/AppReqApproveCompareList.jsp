<%@ page import="com.ko.webapp.util.PageUtil" %>
<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%
PageUtil pageUtil = new PageUtil(request);
%>

<script>

function clear2()
{
	window.location.href="process?action=AppReqApproveCompare&cmd=list" ;
}

</script>

        
        <table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
             <td width="100%" align="left" valign="top">
               <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="1%">&nbsp;</td>
                    <td width="99%"><span class="websitename">รายงานการขออนุมัติการเปรียบเทียบคดี</span></td>
                  </tr>

                  <tr>
                    <td>&nbsp;</td>
                    <td>
                    	<form action="process?action=AppReqApproveCompare&cmd=list" method="post" name="form1">
                    	<input type="hidden" name="doSearch" value="doSearch" />
                      <table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#c2c2c2">
                        <tr>
                          <td width="1%" align="left" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_up.png" width="10" height="8"></td>
                          <td width="98%"></td>
                          <td width="1%" align="right" valign="top" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_up.png" width="10" height="8"></td>
                        </tr>
                        <tr>
                          <td height="40">&nbsp;</td>
                          <td align="center" valign="top">
                              <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td colspan="4" height="25" align="left" valign="top"><span class="sectionname">ค้นหา</span></td>
                                </tr>
                                <tr>
                                    <td width="20%" align="right">เลขที่การขออนุมัติ :&nbsp;</td>
                                    <td width="30%" align="left">
                                      <input name="req_track_no_from" type="text" size="10" class="textinput" value="${req_track_no_from}"> ถึง :&nbsp;
                                      <input name="req_track_no_to" type="text" size="10" class="textinput" value="${req_track_no_to}">
                                    </td>
                                   <td width="17%" align="right">วันที่ขออนุมัติ : &nbsp;</td>
                                   <td align="left">
										<input name="req_date_from" type="text" class="textdate" readonly size="7" maxlength="10" value="${req_date_from}"/>
										<a href="javascript:NewCssCal('req_date_from','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
										
										&nbsp;&nbsp;-&nbsp;&nbsp;
									
										<input name="req_date_to" type="text" class="textdate" readonly size="7" maxlength="10" value="${req_date_to}"/>
										<a href="javascript:NewCssCal('req_date_to','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
									</td>
		                        </tr>
                                <tr>
                                    <td width="20%" align="right">เลขที่คดีเปรียบเทียบ :&nbsp;</td>
                                    <td width="30%" align="left">
                                      <input name="compare_case_no1" type="text" size="10" class="textinput" value="${compare_case_from}"> ถึง :&nbsp;
                                      <input name="compare_case_no2" type="text" size="10" class="textinput" value="${compare_case_to}">
                                    </td>
                                   <td width="17%" align="right">วันที่เปรียบเทียบปรับ : &nbsp;</td>
                                   <td align="left">
										<input id="compare_case_date1" name="compare_case_date1" type="text" class="textdate" readonly size="7" maxlength="10" value="${compare_case_date1}"/>
										<a href="javascript:NewCssCal('compare_case_date1','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
										
										&nbsp;&nbsp;-&nbsp;&nbsp;
									
										<input id="compare_case_date2" name="compare_case_date2" type="text" class="textdate" readonly size="7" maxlength="10" value="${compare_case_date2}"/>
										<a href="javascript:NewCssCal('compare_case_date2','ddmmyyyy')"><img src="images/btn_calendar.png" alt="" width="19" height="19" border="0" ></a>
									</td>
		                        </tr>
                                <tr>
                                  <td  align="right">พ.ร.บ. :&nbsp;</td>
                                  <td align="left">
										<select name="legislation_id" id="legislation_id" style="width:200px;">
											<option value="" selected>ทั้งหมด</option>
                                            <c:forEach items="${les}" var="les" varStatus="i">
                                                <option value="${les.id}"  ${(legislation_id==les.id)?'selected':''}>${les.legislation_name}</option>
                                            </c:forEach>
										</select>
									</td>
                                  <td  height="25" align="right">สำนักงาน :&nbsp;</td>
                                  <td align="left">
                                     <select name="offcode" id="offcode" style="width:200px;">
                                                   <option value="" >เลือก</option>
        											 <c:forEach items="${eds}" var="off">
         											 <option value="${off.offcode}" ${(offcode==off.offcode)?'selected':''}>${off.short_name}</option>
       												 </c:forEach>
                                                 </select>
                                  </td>
                                </tr>
                                <tr>
                                    <td  align="right">ชื่อผู้ต้องหา :&nbsp;</td>
                                    <td align="left">
                                      <input name="lawbreaker_name" type="text" size="30" class="textinput" value="${lawbreaker_name}">
                                    </td>
                                    <td  align="right">เจ้าหน้าที่ดำเนินคดี :&nbsp;</td>
                                    <td align="left">
                                      <input name="sue_name" type="text" size="30" class="textinput" value="${sue_name}">
                                    </td>
                                </tr>
                                  <tr>
                                      <td colspan="4">
                                          &nbsp;
                                      </td>
                                  </tr>
                                <tr>
                                  <td colspan="4" align="center" >
                                      <input alt="Submit Form" type="image"
                                   src="images/btn_search_big.png" width="65" height="23"
                                   name="search"><%@ include file="../Templates/clearIcon.jsp"%>
                                  </td>
                                </tr>
                              </table>
                           </td>
                        </tr>
                        <tr>
                          <td align="left" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_left_bottom.png" width="10" height="8"></td>
                          <td></td>
                          <td align="right" valign="bottom" bgcolor="#FFFFFF"><img src="images/pic_angleSearch_right_bottom.png" width="10" height="8"></td>
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
                      <table class="tableList" width="1000" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
                        <tr  align="left" valign="top">
					<td colspan="6"><%=pageUtil.getPagination()%></td>
					<td colspan="2" align="right"><%=pageUtil.getPageStatus()%>	</td>
			</tr>
                        <tr valign="middle">
                          <td width="2%" height="16" class="TblHeaderColumn AlignCenter">ลำดับที่</td>
                          <td width="5%" class="TblHeaderColumn ">เลขที่การขออนุมัติ</td>
                          <td width="10%" class="TblHeaderColumn ">วันที่ขออนุมัติ</td>
                          <td width="10%" class="TblHeaderColumn ">เลขที่คดีเปรียบเทียบปรับ</td>
                          <td width="15%" class="TblHeaderColumn ">พ.ร.บ.</td>
                          <td width="15%" class="TblHeaderColumn ">สำนักงาน</td>
                          <td width="10%" class="TblHeaderColumn ">วันที่จับ</td>
                          <td width="" class="TblHeaderColumn AlignCenter">ชื่อผู้ต้องหา</td>
                        </tr>
                        <c:forEach varStatus="i" items="${aacs}" var="aac">
                        <tr valign="top" class="${(i.count % 2 == 0)?'even':'odd'}" >
                          <td class="TblRow AlignCenter">${i.count}</td>
                          <td class="TblRow AlignCenter"><a href="process?action=AppReqApproveCompare&cmd=create&ccID=${aac.compare_case_id}">${aac.track_no}</a></td>
                          <td class="TblRow AlignCenter">${aac.req_date2}</td>
                          <td class="TblRow AlignCenter">
                            <c:choose>
                                <c:when test="${aac.track_no == null}">
                                    <a href="process?action=AppReqApproveCompare&cmd=create&ccID=${aac.compare_case_id}">${aac.compare_case_no}</a>
                                </c:when>
                                <c:otherwise>
                                    ${aac.compare_case_no}
                                </c:otherwise>
                            </c:choose>
                          </td>
                          <td class="TblRow AlignLeft">${aac.legislation_name}</td>
                          <td class="TblRow AlignLeft">${aac.compare_offname}</td>
                          <td class="TblRow AlignCenter">${aac.application_date2}</td>
                          <td class="TblRow AlignLeft">${aac.lawbreaker_name}</td>
                        </tr>
                        </c:forEach>
                          <tr>
                              <td>&nbsp;</td>
                          </tr>
                      </table>
                    </td>
                  </tr>
               </table>
            </td>
          </tr>
        </table>

