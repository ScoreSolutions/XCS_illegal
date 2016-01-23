<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>

<form action="process?action=Lawbreaker&cmd=list" method="post" name="form1">
    <input type="hidden" name="lawbreaker_type" value="2"/>
    <input type="hidden" name="lawbreaker_type_text" value="_eng"/>
    <table width="800" border="1" cellpadding="0" cellspacing="0"
           bordercolor="#CCCCCC">
        <tr>
            <td>
                <table width="800" border="0" cellpadding="0" cellspacing="0"
                       bgcolor="#F5F5F5">

                    <tr>
                        <td>&nbsp;</td>
                        <td align="left" valign="top"><span class="sectionname">ค้นหาข้อมูลต้องสงสัย
									:: คนต่างชาติ</span></td>
                        <td>&nbsp;</td>
                    </tr>

                    <tr id="sp_row">
                        <td>&nbsp;</td>
                        <td align="center" valign="top">
                            <table width="100%" border="0" cellpadding="0" cellspacing="0"
                                   id="sp_eng">
                                <tr>
                                    <td width="20%" height="25" align="right">เลขที่หนังสือเดินทาง
                                        :&nbsp;</td>
                                    <td width="30%"><input type="text"
                                                           name="lawbreaker_passport"
                                                           class="textbox" value="${param.lawbreaker_passport}"/></td>
                                    <td width="20%" align="right">มาจากประเทศ:&nbsp;</td>
                                    <td width="30%">
                                        <select name="country_name">
                                        	<option value="">เลือก</option>
                                            <c:forEach items="${ccs}" var="cc" varStatus="i">
                                                <option value="${i.count}">${cc.country_name}</option>
                                            </c:forEach>
                                        </select>
                                        <%--<input type="text"--%>
                                               <%--name="country_name"--%>
                                               <%--class="textbox"/>--%>
                                    </td>
                                </tr>
                                <tr>
                                    <td height="25" align="right">ชื่อ-ชื่อกลาง-นามสกุล :&nbsp;</td>
                                    <td><input type="text" name="partial_name"
                                               class="textbox" value="${param.partial_name }"/></td>
                                    <td align="right">&nbsp;</td>
                                    <td>&nbsp;
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
                                   name="search" onclick="writeTranLog('ค้นหาประวัติผู้กระทำผิดชาวต่างชาติ');">
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
<script>
var varCounty='${param.country_name}';
document.getElementById('country_name').value = varCounty;
</script>
