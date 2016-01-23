<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>

<script type="text/javascript">
//getProvince('sProvince','sDistrict','subDistrict','${param.province_code}','${param.district_code}','${param.subdistrict_code}');

</script>
<form action="process?action=Lawbreaker&cmd=list" method="post" name="form1">
    <input type="hidden" name="lawbreaker_type" value="1"/>
    <input type="hidden" name="lawbreaker_type_text" value=""/>
    <table width="800" border="1" cellpadding="0" cellspacing="0"
           bordercolor="#CCCCCC">
        <tr>
            <td>
                <table width="800" border="0" cellpadding="0" cellspacing="0"
                       bgcolor="#F5F5F5">

                    <tr>
                        <td>&nbsp;</td>
                        <td align="left" valign="top"><span class="sectionname">ค้นหาข้อมูลผู้กระทำผิด
									:: คนไทย</span></td>
                        <td>&nbsp;</td>
                    </tr>

                    <tr id="sp_row">
                        <td>&nbsp;</td>
                        <td align="center" valign="top">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                   id="sp_thai">
                                <tr>
                                    <td width="20%" height="25" align="right">เลขที่บัตร ปปช
                                        :&nbsp;</td>
                                    <td width="30%">
                                       <input type="text" id="lawbreaker_id_card" name="lawbreaker_id_card" OnKeyPress="ChkMinusInt(this);" maxlength="13" class="textbox" value="${param.lawbreaker_id_card}" />
                                    </td>
                                    <td width="20%" align="right">&nbsp;</td>
                                    <td width="30%">&nbsp;</td>
                                </tr>
                                <tr>
                                    <td height="25" align="right">ชื่อ-สกุล :&nbsp;</td>
                                    <td><input type="text" name="partial_name"
                                               class="textbox" value="${param.partial_name}" /></td>
                                    <td align="right">ชื่ออื่นๆ :&nbsp;</td>
                                    <td><input type="text" name="other_name" class="textbox" value="${param.other_name}" />
                                    </td>
                                </tr>
                                <tr>
                                    <td height="10" colspan="4" align="right"></td>
                                </tr>
                                <tr>
                                    <td height="25" align="left">ที่อยู่ผู้กระทำผิด</td>
                                    <td>&nbsp;</td>
                                    <td align="right">&nbsp;</td>
                                    <td>&nbsp;</td>
                                </tr>
                                <tr>
                                    <td height="25" align="right">จังหวัด :&nbsp;</td>
                                    <td><select name="province_code" id="sProvince"
                                                style="width: 180px;"
                                                onchange="getDistrict('sDistrict','subDistrict',this.value,'');">
                                    </select>

                                    </td>

                                </tr>
                                <tr>
                                    <td height="25" align="right">อำเภอ :&nbsp;</td>
                                    <td><select name="district_code" id="sDistrict"
                                                style="width: 180px;"
                                                onchange="getTambol('subDistrict',this.value,'')">
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
                                   name="search" onclick="writeTranLog('ค้นหาประวัติผู้กระทำผิดคนไทย');">
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
