<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>


<table width="100%" height="100%" border="0" cellspacing="0"
       cellpadding="0">
    <tr>
        <td width="100%" align="left" valign="top">
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="1%">&nbsp;</td>
                    <td width="99%"><span class="websitename">ประวัติผู้ต้องสงสัยผู้ประกอบการ</span></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>
                        <form action="process?action=Suspect&cmd=changeForm&pageType=suspect_list" method="post"
                              name="from1">
                            <table width="379" border="0" cellspacing="0" cellpadding="0">
                                <tr><td width="113" align="right" valign="middle">ประเภทผู้ต้องสงสัย&nbsp;:&nbsp;</td>
                                    <td width="260" valign="middle"><select name="suspect_type_text">
                                        <option value="">คนไทย</option>
                                        <option value="_eng">คนต่างชาติ</option>
                                        <option value="_business" selected>ผู้ประกอบการ</option>
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

                        <!--form action="Suspect.jsp?action=suspectList01" method="post" name="from1"-->
                        <form action="process?action=Suspect&cmd=list" method="post" name="form1">
                            <input type="hidden" name="suspect_type" value="3"/>
                            <input type="hidden" name="suspect_type_text" value="_business"/>
                            <table width="800" border="1" cellpadding="0" cellspacing="0"
                                   bordercolor="#CCCCCC">
                                <tr>
                                    <td>
                                        <table width="800" border="0" cellpadding="0" cellspacing="0"
                                               bgcolor="#F5F5F5">

                                            <tr>
                                                <td>&nbsp;</td>
                                                <td align="left" valign="top"><span class="sectionname">ค้นหาข้อมูลต้องสงสัย
									:: ผู้ประกอบการ</span></td>
                                                <td>&nbsp;</td>
                                            </tr>

                                            <tr id="sp_row">
                                                <td>&nbsp;</td>
                                                <td align="center" valign="top">
                                                    <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                                           id="sp_eng">
                                                        <tr>
                                                            <td width="20%" height="25" align="right">เลขทะเบียนนิติบุคคล
                                                                :&nbsp;</td>
                                                            <td width="30%"><input type="text"
                                                                                   name="corporation_code"
                                                                                   class="textbox"/></td>
                                                            <td width="20%" align="right">เลขทะเบียนสรรพสามิต:&nbsp;</td>
                                                            <td width="30%"><input type="text"
                                                                                   name="excise_reg_no"
                                                                                   class="textbox"/></td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="right">เลขที่ใบอนุญาติ :&nbsp;</td>
                                                            <td><input type="text" name="license_no"
                                                                       class="textbox"/></td>
                                                            <td align="right">&nbsp;</td>
                                                            <td>&nbsp;
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="right">ชื่อผู้ประกอบการ :&nbsp;</td>
                                                            <td colspan="3" align="left" style="padding-left:47.5px"><input type="text" name="company_name" size="80"
                                                                       class="textbox"/></td>
                                                        </tr>
                                                        <tr>
                                                            <td height="10" colspan="4" align="right"></td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="left">สถานที่ต้องสงสัย</td>
                                                            <td>&nbsp;</td>
                                                            <td align="right">&nbsp;</td>
                                                            <td>&nbsp;</td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="right">จังหวัด :&nbsp;</td>
                                                            <td><select name="province_code" id="sProvince"
                                                                        style="width: 180px;" onchange="getDistrict('sDistrict','subDistrict',this.value,'','')">
                                                            </select></td>
                                                            <td align="right">สำนักงาน :&nbsp;</td>
                                                            <td><select name="offcode" id="sOffCode"
                                                                        style="width: 200px;">
                                                                <option value="0">ทั้งหมด</option>
                                                                <option value="x">สสพ.กรุงเทพฯ 3</option>
                                                                <option value="x">ส่วนคดี สำนักกฎหมาย</option>
                                                            </select></td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="right">อำเภอ :&nbsp;</td>
                                                            <td><select name="district_code" id="sDistrict"
                                                                        style="width: 180px;" onchange="getTambol('subDistrict',this.value,'')">
                                                            </select>
                                                            </td>
                                                            <td align="right">ประเภทคดี :&nbsp;</td>
                                                            <td><select name="case_type" id="s"
                                                                        style="width: 200px;">
                                                                <option value="0" selected>ทั้งหมด</option>
                                                                <option value="1">คดีรายใหญ่</option>
                                                                <option value="2">เอเย่นต์</option>
                                                                <option value="3">รายย่อย</option>
                                                            </select></td>
                                                        </tr>
                                                        <tr>
                                                            <td height="25" align="right">ตำบล :&nbsp;</td>
                                                            <td><select name="subdistrict_code" id="subDistrict"
                                                                        style="width: 180px;" >
                                                            </select></td>
                                                            <td align="right">&nbsp;</td>
                                                            <td>&nbsp;</td>
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
                                                           name="search">

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
                    <td height="30">
                        <a href="process?action=Suspect&cmd=createForm&suspectType=3"> เพิ่มข้อมูลใหม่</a>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>

                        <%--jsp:include page="/QueryPager/thai_suspect_pager.jsp"></jsp:include--%>

                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
            </table>
        </td>
    </tr>
</table>
<script type="text/javascript">
    getProvince('sProvince','sDistrict','subDistrict','','','');
</script>
<c:if test="${suspects != null}">
    <jsp:include page="suspect_list_search_result_business.jsp"/>
</c:if>






