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
                        <td width="27" class="TblHeaderColumn AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                        <td width="147" class="TblHeaderColumn">เลขทะเบียน</td>
                        <td width="86" class="TblHeaderColumn">ประเภท</td>
                        <td width="144" class="TblHeaderColumn">ยี่ห้อ / รุ่น / สี</td>
                        <td width="309" class="TblHeaderColumn">รายละเอียดเพิ่มเติม</td>
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
                        <td height="30" class="TblRow AlignCenter"><input type="checkbox" name="checkbox2" value="checkbox"></td>
                        <td class="TblRow AlignLeft">
							<span class="spanLink" 
						  onClick="winPopup('Popup/popup_vehicle.jsp','Province','','550','350','true'); return false;">
								กข 2342 กรุงเทพมหานคร
							</span>
						</td>
                        <td class="TblRow AlignLeft">รถเก๋ง</td>
                        <td class="TblRow AlignLeft">ฮอนด้า / ซีวิค / ขาว</td>
                        <td class="TblRow AlignLeft">แต่งซิ่ง โหลดเตี้ย ติดท่อไอเสียเสียงดัง ติดฟิลม์ดำรอบคัน</td>
                        </tr>
                      <tr>
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
		
		