<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<%@page import="com.ko.util.EngineUtility"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="com.ko.util.SelectionUtility"%>
<%@page import="com.ko.util.SessionConstant"%>
<%@page import="com.ko.util.FormUtility"%>
<%@page import="com.ko.model.SuspectPicture"%>
<% 
	List<SuspectPicture> data = null;
	HashMap<String,String> map = EngineUtility.transformRequestParameter(request.getParameterMap());
	
	session.setAttribute(SessionConstant.PAGER_REPLACE_TOKEN,"");
	session.setAttribute(SessionConstant.PAGER_TARGET_TOKEN,"");
	
	if(data == null){
		String suspect = request.getParameter("suspect_no");
		if(suspect == null){
			suspect = "-1";
		}
		BigDecimal suspectNo = new BigDecimal(suspect);
		data = new com.ko.util.IbatisAgent().selectSuspectPictureBySuspectId(suspectNo);
		//session.setAttribute(SessionConstant.THAI_SUSPECT_DATA, data);
	}
	int maxPageItems = 10;
%>


<%@page import="com.ko.util.Extractor"%>


<%@page import="com.ko.model.SuspectAddress"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="com.ko.util.FormConstant"%>
<%@page import="com.ko.model.SuspectRelatives"%><pg:pager items="<%=data.size()%>" index="center" maxPageItems="<%=maxPageItems%>"
	maxIndexPages="3" isOffset="<%= true %>"
	export="offset,currentPageNumber=pageNumber" scope="request">
	
	<table class="tableList" width="700" border="0" cellspacing="0"
			cellpadding="0" bordercolor="#CCCCCC" id="suspect_relative_table">
	<tr>
		<td colspan="7">
			<pg:index>
				<jsp:include page="/WEB-INF/jsp/pager.jsp" flush="true" />
			</pg:index>
		</td>
	</tr>
	
                  <tr>
                    <td width="28" align="center" class="TblHeaderColumn aligncenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                    <td width="100" align="center" class="TblHeaderColumn aligncenter">หมวดภาพถ่าย</td>
                    <td width="114" align="center" class="TblHeaderColumn aligncenter">รูปภาพ</td>
                    <td width="478" class="TblHeaderColumn">รายละเอียด</td>
                    <td width="80" class="TblHeaderColumn">&nbsp;</td>
                  </tr>
		
		<%
			for (int i = offset.intValue(), l = Math.min(i + maxPageItems,data.size()); i < l; i++) {
				SuspectPicture a = data.get(i);
				BigDecimal id = a.getId();
				String description = a.getDescription();
				BigDecimal catId = a.getPictureCategoryId();
				String mimeType = a.getMimeType();
		%>
		
			<pg:item>
                  <tr>
                    <td align="center" class="TblRow aligncenter"><input type="checkbox" name="checkbox2" value="checkbox"></td>
                    <td align="center" class="TblRow aligncenter">ภาพบุคคล</td>
                    <td height="120" align="center" class="TblRow aligncenter"><span class="TblRow AlignCenter bgRowGray"><img src="RenderImage?id=<%=id%>&mime=<%=mimeType%>" width="100" height="100"></span></td>
                    <td align="left" valign="top" class="TblRow AlignLeft"><%=description%></td>
                    <td align="right" class="TblRow"><input name="Submit3" type="button" class="button" value="แก้ไขข้อมูล"></td>
                  </tr>
			</pg:item>
		
		<% } %>
		
		<pg:item>
		<tr>
			<td class="TblRow AlignCenter"></td>
			<td class="TblRow AlignLeft"><span class="spanLink"></span></td>
			<td class="TblRow AlignLeft"></td>
			<td class="TblRow AlignLeft"></td>
			<td class="TblRow AlignLeft"></td>
			<td class="TblRow" valign="middle" align="right"></td>
		</tr>
		</pg:item>
	</table>
</pg:pager>
		
		