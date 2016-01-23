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
<% 
	List<SuspectRelatives> data = null;
	HashMap<String,String> map = EngineUtility.transformRequestParameter(request.getParameterMap());
	
	session.setAttribute(SessionConstant.PAGER_REPLACE_TOKEN,"");
	session.setAttribute(SessionConstant.PAGER_TARGET_TOKEN,"");
	
	if(data == null){
		String suspect = request.getParameter("suspect_no");
		if(suspect == null){
			suspect = "-1";
		}
		BigDecimal suspectNo = new BigDecimal(suspect);
		data = new SelectionUtility().getSuspectRelatives(suspectNo);
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
				<td class="TblHeaderColumn aligncenter">ลำดับที่</td>
				<td class="TblHeaderColumn aligncenter"><input
					name="chkAll" type="checkbox" /></td>
				<td width="100" class="TblHeaderColumn">ความสัมพันธ์</td>
				<td width="150" class="TblHeaderColumn">ชื่อ-สกุล</td>
				<td width="50" class="TblHeaderColumn">โทรศัพท์</td>
				<td width="100" class="TblHeaderColumn">E-Mail</td>
				<td width="250" class="TblHeaderColumn">ที่อยู่ปัจจุบัน</td>
				<td width="250" class="TblHeaderColumn">ที่อยู่ภูมิลำเนา</td>
			</tr>
		
		<%
			for (int i = offset.intValue(), l = Math.min(i + maxPageItems,data.size()); i < l; i++) {
				SuspectRelatives a = data.get(i);
				SuspectAddress ads = new SuspectAddress();
				String name = a.getFirstName();
				String lastName = a.getLastName();
				String titleText = FormConstant.getTitleText(a.getTitleCode());
				String email = FormConstant.get(a.getEmail(),"");
				String tel = FormConstant.get(a.getTel(),"");
				String homeTown = FormConstant.createSuspectRelativeCurrentAddress(a);
				String currentAddress = FormConstant.createSuspectRelativeNativeAddress(a);
				String fullName = FormConstant.createSuspectRelativeName(a);
				String relation = FormConstant.getSuspectRelationText(a.getRelation());
		%>
			<pg:item>
				<tr>
					<td class="TblRow aligncenter"><%=i+1%></td>
					<td class="TblRow aligncenter"><input name="chk1"
						type="checkbox" /></td>
					<td align="left" valign="top" class="TblRow AlignLeft"><%=relation%></td>
					<td align="left" valign="top" class="TblRow AlignLeft"><%=fullName%></td>
					<td align="left" valign="top" class="TblRow AlignLeft"><%=tel%></td>
					<td align="left" valign="top" class="TblRow AlignLeft"><%=email%></td>
					<td align="left" valign="top" class="TblRow AlignLeft"><%=currentAddress %></td>
					<td align="left" valign="top" class="TblRow AlignLeft"><%=homeTown%></td>
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
		
		