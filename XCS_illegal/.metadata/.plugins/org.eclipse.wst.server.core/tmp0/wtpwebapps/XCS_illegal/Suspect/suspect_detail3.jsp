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
                            class="sectionname">${suspect.comp_title_text} ${suspect.company_name}</span>
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
                                            <td width="23%" height="25" align="right">เลขทะเบียนนิติบุคคล&nbsp;:&nbsp;</td>
                                            <td width="77%">
                                                <strong>${suspect.corporation_code}</strong>&nbsp;&nbsp;เลขทะเบียนสรรพสามิต&nbsp;:&nbsp;
                                                <strong>${suspect.excise_reg_no}</strong>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td height="25" align="right">เลขที่ใบอนุญาติ&nbsp;:&nbsp;</td>
                                            <td>
                                                <strong>${suspect.license_no} [ <fmt:formatDate value="${suspect.license_date_from}" pattern="dd/MM/yyyy" />
                        -<fmt:formatDate value="${suspect.license_date_to}" pattern="dd/MM/yyyy" /> ]</strong>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td width="23%" height="25" align="right">ชื่อ - นามสกุลผู้แทน&nbsp;:&nbsp;</td>
                                            <td width="77%"><strong>${suspect.full_text_name}</strong>
                                            </td>
                                        </tr>

                                        <tr>
                                            <td height="25" align="right">สถานที่ตั้ง&nbsp;:&nbsp;</td>
                                            <td><strong>033456729</strong></td>
                                        </tr>
                                        <tr>
                                            <td height="25" align="right">โทรศัพท์&nbsp;:&nbsp;</td>
                                            <td><strong>${suspect.tel}</strong></td>
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
