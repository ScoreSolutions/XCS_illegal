<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<form action="process?action=Suspect&cmd=list" method="post" name="form1">
    <input type="hidden" name="suspect_type" value="3"/>
    <input type="hidden" name="suspect_type_text" value="_business"/>
    <input type="hidden" name="doSearch" value="search" />
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
                                                           class="textbox" value="${corporation_code}"/></td>
                                    <td width="20%" align="right">เลขทะเบียนสรรพสามิต:&nbsp;</td>
                                    <td width="30%"><input type="text"
                                                           name="excise_reg_no"
                                                           class="textbox" value="${excise_reg_no}"/></td>
                                </tr>
                                <tr>
                                    <td height="25" align="right">เลขที่ใบอนุญาต :&nbsp;</td>
                                    <td><input type="text" name="license_no"
                                               class="textbox" value="${license_no}"/></td>
                                    <td align="right">&nbsp;</td>
                                    <td>&nbsp;
                                    </td>
                                </tr>
                                <tr>
                                    <td height="25" align="right">ชื่อผู้ประกอบการ :&nbsp;</td>
                                    <td colspan="3" align="left" style="padding-left:47.5px"><input type="text"
                                                                                                    name="company_name"
                                                                                                    size="80"
                                                                                                    class="textbox" value="${company_name}"/>
                                    </td>
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
                                                style="width: 180px;"
                                                onchange="getDistrict('sDistrict','subDistrict',this.value,'','')">
                                    </select></td>
                                    <td align="right">สำนักงาน :&nbsp;</td>
                                    <td><select name="offcode" id="sOffCode"
                                                style="width: 200px;">
                                        <option value="0">ทั้งหมด</option>
                                        <c:forEach var="ed_office" items="${ed_offices}">
                                            <option value="${ed_office.offcode}" ${(offcode!=null&&ed_office.offcode==offcode)?'selected':''}>${ed_office.short_name}</option>
                                        </c:forEach>
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
                                        <option value="0" ${(case_type!=null&&case_type==0)?'selected':''}>ทั้งหมด</option>
                                        <option value="1" ${(case_type!=null&&case_type==1)?'selected':''}>คดีรายใหญ่</option>
                                        <option value="2" ${(case_type!=null&&case_type==2)?'selected':''}>เอเย่นต์</option>
                                        <option value="3" ${(case_type!=null&&case_type==3)?'selected':''}>รายย่อย</option>
                                    </select></td>
                                </tr>
                                <tr>
                                    <td height="25" align="right">ตำบล :&nbsp;</td>
                                    <td><select name="subdistrict_code" id="subDistrict"
                                                style="width: 180px;">
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
                                   name="search" onclick="writeTranLog('ค้นหาประวัติผู้ต้องสงสัยผู้ประกอบการ');">
									<%@ include file="../Templates/clearIcon.jsp"%>
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