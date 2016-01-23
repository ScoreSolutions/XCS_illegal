<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<%@page import="com.ko.util.EngineUtility"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="com.ko.util.SelectionUtility"%>
<%@page import="com.ko.util.SessionConstant"%>
<%@page import="com.ko.util.FormUtility"%>

<% 
	List<HashMap<String,Object>> data = (List<HashMap<String,Object>>)session.getAttribute(SessionConstant.THAI_SUSPECT_DATA);
	HashMap<String,String> map = map = EngineUtility.transformRequestParameter(request.getParameterMap());
	if(data == null){
		data = new SelectionUtility().selectThaiSuspect(map);
		//session.setAttribute(SessionConstant.THAI_SUSPECT_DATA, data);
	}
	int maxPageItems = 20;
%>

<%@page import="com.ko.util.Extractor"%>

<pg:pager items="<%=data.size()%>" index="center" maxPageItems="<%=maxPageItems%>"
	maxIndexPages="3" isOffset="<%= true %>"
	export="offset,currentPageNumber=pageNumber" scope="request">
	
	<table class="tableList" width="800" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
	
	<tr>
		<td colspan="7">
			<pg:index>
				<jsp:include page="/WEB-INF/jsp/pager.jsp" flush="true" />
			</pg:index>
		</td>
	</tr>
	
		<tr>
			<td class="TblHeaderColumn" width="40">ลำดับ</td>
			<td class="TblHeaderColumn" width="145">ชื่อ - นามสกุล</td>
			<td class="TblHeaderColumn" width="99">เลขที่บัตร ปปช</td>
			<td class="TblHeaderColumn" width="100">วดป เกิด (อายุ)</td>
			<td class="TblHeaderColumn" width="270">ที่อยู่</td>
			<td class="TblHeaderColumn" width="159">&nbsp;</td>
		</tr>
		
		<%
			for (int i = offset.intValue(), l = Math.min(i + maxPageItems,data.size()); i < l; i++) {
				HashMap<String,Object> m = data.get(i);
				Extractor ex = new Extractor(m);
				String name = ex.get("suspect_name","");
				String age = ex.get("age","");
				String address = ex.get("address","");
				String idCard = ex.get("suspect_id_card","");
				String suspectNo = ex.get("suspect_no","");
		%>
			<pg:item>
			<tr>
				<td class="TblRow AlignCenter"><%=(i+1)%></td>
				<td class="TblRow AlignLeft"><span class="spanLink" onClick="MM_goToURL('parent','Suspect.jsp?action=ThaiForm&suspect_no=<%=suspectNo%>');
					return document.MM_returnValue"><%=name%></span></td>
				<td class="TblRow AlignLeft"><%=idCard%></td>
				<td class="TblRow AlignLeft"><%=age%></td>
				<td class="TblRow AlignLeft"><%=address%></td>
				<td class="TblRow" valign="middle" align="right"><input
					name="Submit322" class="barbutton"
					onclick="MM_goToURL('parent','Suspect.jsp?action=ThaiSave&suspect_no=<%=suspectNo%>');return document.MM_returnValue"
					value="ข้อมูลเพิ่มเติม" type="submit"> 
				<input type="image" src="images/icon_delete.gif" class="barbutton" border="0"
					onclick="KO_deleteThaiSuspect('<%=suspectNo%>');"
				></td>
			</tr>
			</pg:item>
		
		<% } %>
		<!-- 
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
		-->
	</table>
</pg:pager>