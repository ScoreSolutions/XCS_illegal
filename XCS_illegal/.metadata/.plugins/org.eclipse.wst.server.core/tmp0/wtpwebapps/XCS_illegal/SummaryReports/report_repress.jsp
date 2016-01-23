<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@ page import="com.ko.webapp.action.*" %>
		<!-- Body -->
		<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="1%">&nbsp;</td>
                <td width="99%"><span class="websitename">รายงานส่วนปราบปราม</span></td>
              </tr>
              <tr>
                <td height="18">&nbsp;</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td>&nbsp;</td>
                <td><table width="750" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="24" align="left" valign="top">&nbsp;</td>
                    <td width="100%" align="left" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td width="14%" height="25"><strong>รายงานผลงานนายตรวจ</strong></td>
                      </tr>
                      <tr>
                        <td height="25">
                        	<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<%
		                          	StaticAndReportAction sar = new StaticAndReportAction();
									out.println(sar.getReportMenu(request,"30"));
	                          	%>
	                        </table>
                        </td>
                      </tr>
                    </table></td>
                    <td width="363" valign="top">&nbsp;</td>
                  </tr>
                  
                </table></td>
              </tr>
            </table></td>
		  </tr>
		</table>