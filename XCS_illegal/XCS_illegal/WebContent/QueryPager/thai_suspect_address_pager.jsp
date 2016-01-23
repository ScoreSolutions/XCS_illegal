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
<%@page import="com.ko.util.Q"%>

<% 
	List<SuspectAddress> data = null;
	HashMap<String,String> map = EngineUtility.transformRequestParameter(request.getParameterMap());
	
	session.setAttribute(SessionConstant.PAGER_REPLACE_TOKEN,"");
	session.setAttribute(SessionConstant.PAGER_TARGET_TOKEN,"");
	
	if(data == null){
		String suspect = request.getParameter("suspect_no");
		if(suspect == null){
			suspect = "-1";
		}
		BigDecimal suspectNo = new BigDecimal(suspect);
		data = new SelectionUtility().getSuspectAddress(suspectNo);
		//session.setAttribute(SessionConstant.THAI_SUSPECT_DATA, data);
	}
	int maxPageItems = 100;
%>

<%@page import="com.ko.util.Extractor"%>


<%@page import="com.ko.model.SuspectAddress"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="com.ko.util.FormConstant"%><pg:pager items="<%=data.size()%>" index="center" maxPageItems="<%=maxPageItems%>"
	maxIndexPages="3" isOffset="<%= true %>"
	export="offset,currentPageNumber=pageNumber" scope="request">
	
	<table class="tableList" width="700" border="0" cellspacing="0"
			cellpadding="0" bordercolor="#CCCCCC" id="suspect_address_table">
	
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
				<td class="TblHeaderColumn">รายละเอียด</td>
				<td class="TblHeaderColumn">ที่อยู่</td>
				<td class="TblHeaderColumn">พิกัด</td>
				<td class="TblHeaderColumn">โทรศัพท์</td>
			</tr>
		
		<%
			for (int i = offset.intValue(), l = Math.min(i + maxPageItems,data.size()); i < l; i++) {
				SuspectAddress a = data.get(i);
				String address = a.getAddress();
				String provinceCode = a.getDistrictCode();
				String districtCode = a.getProvinceCode();
				String subdistrictCode = a.getSubdistrictCode();
				BigDecimal suspectNo = a.getSuspectNo();
				String tel = Q.clean(a.getTelNo(),"-");
				String description = a.getDescription();
				String fullAddress = FormConstant.createSuspectFormatAddress(a);
				
		%>
			<pg:item>
			<tr>
				<td class="TblRow aligncenter"><%=i+1%></td>
				<td class="TblRow aligncenter"><input name="chk1"
					type="checkbox" /></td>
				<td align="left" valign="top" class="TblRow AlignLeft"><%=description%></td>
				<td align="left" valign="top" class="TblRow AlignLeft"><%=fullAddress%></td>
				<td align="left" valign="top" class="TblRow AlignLeft">-</td>
				<td align="left" valign="top" class="TblRow AlignLeft"><%=tel%></td>
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
		
		