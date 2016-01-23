<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>
<h1>ประวัติผู้ต้องสงสัยคนต่างชาติ</h1>

<form action="process?action=Suspect&cmd=changeForm&pageType=suspect_list" method="post" name="from1">
    <table width="379" border="0" cellspacing="0" cellpadding="0">
        <tr>
            <td width="113" align="right" valign="middle">ประเภทผู้ต้องสงสัย&nbsp;:&nbsp;</td>
            <td width="260" valign="middle"><select name="suspect_type_text">
                <option value="">คนไทย</option>
                <option value="_eng" selected>คนต่างชาติ</option>
                <option value="_business">ผู้ประกอบการ</option>
            </select> <input name="Button1" type="submit" class="barbutton"
                             value="ตกลง"></td>
        </tr>
    </table>
</form>
<table width="800" border="1" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
    <tr>
        <td>
            <table width="800" border="0" cellpadding="0" cellspacing="0" bgcolor="#F5F5F5">
                <tr>
                    <td height="10">&nbsp;</td>
                    <td align="left" valign="top">&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td height="10">&nbsp;</td>
                    <td align="left" valign="top"><span
                            class="sectionname">${suspect.full_text_name}</span>
                    </td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td height="10">&nbsp;</td>
                    <td align="left" valign="top">&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td height="10">&nbsp;</td>
                    <td align="left" valign="top">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td width="20%" align="right" valign="top">
                                    <img src="<c:url value='/process?action=GetImage'/>&table=SUSPECT&id=${suspect.id}"
                                         widht=100 height=100>
                                </td>
                                <td width="80%" valign="top">
                                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td width="23%" height="25" align="right">เลขที่หนังสือเดินทาง&nbsp;:&nbsp;</td>
                                            <td width="77%">
                                                <strong>${suspect.suspect_passport}</strong>
                                                &nbsp;&nbsp;วันที่เข้าประเทศ&nbsp;:&nbsp;<strong><fmt:formatDate value="${suspect.date_in}" pattern="dd/MM/yyyy" /></strong>
                                                &nbsp;&nbsp;วันที่ออกประเทศ&nbsp;:&nbsp;<strong><fmt:formatDate value="${suspect.date_out}" pattern="dd/MM/yyyy" /></strong>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td height="25" align="right">ชื่ออื่นๆ&nbsp;:&nbsp;</td>
                                            <td>
                                                <strong>${suspect.other_name}</strong>&nbsp;&nbsp;เพศ&nbsp;:&nbsp;<strong>${suspect.sex}</strong>&nbsp;&nbsp;วันเดือนปีเกิด&nbsp;:&nbsp;
                                                <strong><fmt:formatDate value="${suspect.birth_date}"
                                                                        pattern="dd/MM/yyyy"/></strong>&nbsp;อายุ&nbsp;:&nbsp;
                                                <strong>${suspect.age} ปี</strong>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="23%" height="25" align="right">มือถือ&nbsp;:&nbsp;</td>
                                            <td width="77%"><strong>${suspect.mobile}</strong>&nbsp;&nbsp;email&nbsp;:&nbsp;<strong>${suspect.email}</strong>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td height="25" align="right">เชื้อชาติ&nbsp;:&nbsp;</td>
                                            <td>
                                                <strong>${suspect.race_text}</strong>&nbsp;&nbsp;สัญชาติ&nbsp;:&nbsp;<strong>${suspect.national_text}</strong>
                                                &nbsp;&nbsp;กรุ๊ปเลือด&nbsp;:&nbsp;<strong>${suspect.blood_type}</strong>&nbsp;&nbsp;สถานภาพ&nbsp;:&nbsp;
                                                <strong>${suspect.marital_status}</strong>&nbsp;&nbsp;ศาสนา&nbsp;:&nbsp;<strong>${suspect.re_text}</strong>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td height="25" align="right">ที่อยู่ตามภูมิลำเนา&nbsp;:&nbsp;</td>
                                            <td><strong>033456729</strong></td>
                                        </tr>
                                        <tr>
                                            <td height="25" align="right">รายละเอียดเพิ่มเติม&nbsp;:&nbsp;</td>
                                            <td><strong>${suspect.description}</strong></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
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
