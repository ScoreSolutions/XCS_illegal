<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<%@page import="com.ko.util.EngineUtility"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="com.ko.util.SelectionUtility"%>
<%@page import="com.ko.util.SessionConstant"%>
<%@page import="com.ko.util.FormUtility"%>


<% 
	List<HashMap<String,Object>> data = null ;//= (List<HashMap<String,Object>>)session.getAttribute(SessionConstant.THAI_SUSPECT_DATA);
	HashMap<String,String> map = map = EngineUtility.transformRequestParameter(request.getParameterMap());
	
	if(data == null){
		data = new SelectionUtility().selectForeignSuspect(map);
		//session.setAttribute(SessionConstant.THAI_SUSPECT_DATA, data);
		System.out.println("data = " + data);
		System.out.println("map = " + map);
	}
	int maxPageItems = 20;
%>

<script>
function deleteSuspect(suspectNo){
	var ans=window.confirm('ยืนยันการลบข้อมูล?'); //alert (ans); if (ans==true)
	if(ans){
		MM_goToURL('parent','DeleteForeignSuspectAction?suspect_no=' + suspectNo);
	}else{}
}
</script>

<%@page import="com.ko.util.Extractor"%><pg:pager items="<%=data.size()%>" index="center" maxPageItems="<%=maxPageItems%>"
	maxIndexPages="3" isOffset="<%= true %>"
	export="offset,currentPageNumber=pageNumber" scope="request">
    
    <table class="tableList" width="880" border="0" cellspacing="0" cellpadding="0" bordercolor="#CCCCCC">
    
				<tr>
					<td colspan="7">
						<pg:index>
							<jsp:include page="/WEB-INF/jsp/pager.jsp" flush="true" />
						</pg:index>
					</td>
				</tr>
				
                 <tr>
                    <td width="32" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                    <td width="160" class="TblHeaderColumn">ชื่อผู้ต้องสงสัย</td>
                    <td width="122" class="TblHeaderColumn">เลขที่หนังสือเดินทาง</td>
                    <td width="55" class="TblHeaderColumn">ประเทศ</td>
                    <td width="98" class="TblHeaderColumn">วดป เกิด (อายุ)</td>
                    <td width="252" class="TblHeaderColumn">ที่อยู่</td>
                    <td width="161" class="TblHeaderColumn">&nbsp;</td>
                  </tr>
                  
                 <%
				for (int i = offset.intValue(), l = Math.min(i + maxPageItems,
						data.size()); i < l; i++) {
					
					HashMap<String,Object> m = data.get(i);
					Extractor ex = new Extractor(m);
					String name = ex.get("suspect_name", "");
					String age = ex.get("ege","");
					String address = ex.get("address", "");
					String passport = ex.get("suspect_passport","");
					String country = ex.get("country_name","");
					String suspectNo = ex.get("suspect_no","");
				%>
				
                  <tr>
                    <td height="30" class="TblRow AlignCenter"><%=i+1%></td>
                    <td class="TblRow AlignLeft">
						<span class="spanLink" onClick="MM_goToURL('parent','Suspect.jsp?action=EngForm&suspect_no=<%=suspectNo%>');
					return document.MM_returnValue">
							<%=name %>
						</span>
					</td>
                    <td class="TblRow AlignLeft"><%=passport%></td>
                    <td class="TblRow AlignLeft"><%=country%></td>
                    <td class="TblRow AlignLeft"><%=age%></td>
                    <td class="TblRow AlignLeft"><%=address%></td>
                    <td align="right" class="TblRow">&nbsp;
                      <input name="Submit322" type="submit" class="barbutton" onClick="MM_goToURL('parent','Suspect.jsp?action=EngSave&suspect_no=<%=suspectNo%>');return document.MM_returnValue" value="ข้อมูลเพิ่มเติม">
					  <img src="images/icon_delete.gif" border="0" onClick="KO_deleteForeignSuspect('<%=suspectNo%>');"/>
                  </tr>
                  
                  <%} %>
    </table>       
</pg:pager>