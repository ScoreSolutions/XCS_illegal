<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<form action="process?action=Lawbreaker&cmd=list" method="post" name="form1">
    <input type="hidden" name="lawbreaker_type" value="3"/>
    <input type="hidden" name="lawbreaker_type_text" value="_business"/>
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
                                    <td width="30%"><input type="text" OnKeyPress="ChkMinusInt(this);" maxlength="13" 
                                                           name="corporation_code"
                                                           class="textbox" value="${param.corporation_code}" /></td>
                                    <td width="20%" align="right">เลขทะเบียนสรรพสามิต:&nbsp;</td>
                                    <td width="30%"><input type="text" OnKeyPress="ChkMinusInt(this);" maxlength="10" 
                                                           name="excise_reg_no"
                                                           class="textbox" value="${param.excise_reg_no}"/></td>
                                </tr>
                                <tr>
                                    <td height="25" align="right">เลขที่ใบอนุญาติ :&nbsp;</td>
                                    <td><input type="text" name="license_no"
                                               class="textbox" value="${param.license_no}"/></td>
                                    <td align="right">&nbsp;</td>
                                    <td>&nbsp;
                                    </td>
                                </tr>
                                <tr>
                                    <td height="25" align="right">ชื่อผู้ประกอบการ :&nbsp;</td>
                                    <td colspan="3" align="left" style="padding-left:47.5px"><input type="text"
                                                                                                    name="company_name"
                                                                                                    size="80"
                                                                                                    class="textbox" value="${param.company_name }"/>
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
                                </tr>
                                <tr>
                                    <td height="25" align="right">อำเภอ :&nbsp;</td>
                                    <td><select name="district_code" id="sDistrict"
                                                style="width: 180px;" onchange="getTambol('subDistrict',this.value,'')">
                                    </select>
                                    </td>
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
                                   name="search" onclick="writeTranLog('ค้นหาประวัติผู้กระทำผิดผู้ประกอบการ');">
									&nbsp;&nbsp;&nbsp;&nbsp;<img name="222" width="67" src="images/icn_clearsearch.jpg"  style="cursor:hand" alt="ล้างเงือนไข" onclick="clear2();" border="0" >
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