<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp" %>

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
                                            <td width="23%" height="25" align="right">เลขที่บัตร ปปช&nbsp;:&nbsp;</td>
                                            <td width="77%">
                                                <strong>${suspect.suspect_id_card}&nbsp;&nbsp;&nbsp;&nbsp;</strong></td>
                                        </tr>
                                        <tr>
                                            <td height="25" align="right">ชื่ออื่นๆ&nbsp;:&nbsp;</td>
                                            <td>
                                                <strong>${suspect.other_name}</strong>&nbsp;&nbsp;เพศ&nbsp;:&nbsp;<strong>${suspect.sexText}</strong>&nbsp;&nbsp;วันเดือนปีเกิด&nbsp;:&nbsp;
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
                                                &nbsp;&nbsp;กรุ๊ปเลือด&nbsp;:&nbsp;<strong>${suspect.bloodText}</strong>&nbsp;&nbsp;สถานภาพ&nbsp;:&nbsp;
                                                <strong>${suspect.maritalText}</strong>&nbsp;&nbsp;ศาสนา&nbsp;:&nbsp;<strong>${suspect.re_text}</strong>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td height="25" align="right">ที่อยู่ตามภูมิลำเนา&nbsp;:&nbsp;</td>
                                            <td><strong>${suspect.full_address}</strong></td>
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
                    <td colspan="5">

                    </td>
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

