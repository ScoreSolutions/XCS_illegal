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
		data = new SelectionUtility().selectTraderSuspect(map);
		//session.setAttribute(SessionConstant.THAI_SUSPECT_DATA, data);
		//System.out.println("data = " + data);
		//System.out.println("map = " + map);
	}
	int maxPageItems = 4;
%>


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
                    <td width="22" class="TblHeaderColumn AlignCenter">ลำดับ</td>
                    <td width="165" class="TblHeaderColumn">ชื่อผู้ประกอบการ</td>
                    <td width="104" class="TblHeaderColumn">ทะเบียนนิติบุคคล</td>
                    <td width="105" class="TblHeaderColumn">ทะเบียนสรรพสามิต</td>
                    <td width="256" class="TblHeaderColumn">ใบอนุญาต [วันที่ออกใบอนุญาต - วันที่หมดอายุ] </td>
                    <td width="162" class="TblHeaderColumn">สถานที่ตั้ง</td>
                    <td width="200" class="TblHeaderColumn">&nbsp;</td>
                  </tr>
                  
                  
                 <%
				for (int i = offset.intValue(), l = Math.min(i + maxPageItems,
						data.size()); i < l; i++) {
					
					HashMap<String,Object> m = data.get(i);
					Extractor ex = new Extractor(m);
					
					String corpCode = ex.get("corporation_code","");
					String exciseRegNo = ex.get("excise_reg_no", "");
					String licenseAge = ex.get("license_age","");
					String address = ex.get("address", "");
					String suspectNo = ex.get("suspect_no", "");
					String companyName = ex.get("company_name","");
					
					
				%>
				
                 <tr>
                    <td height="30" class="TblRow AlignCenter"><%=i+1%></td>
                    <td class="TblRow AlignLeft">
						<span class="spanLink" onClick="MM_goToURL('parent','Suspect.jsp?action=CompanyForm&suspect_no=<%=suspectNo%>');
					return document.MM_returnValue"><%=companyName%></span>
					</td>
                    <td class="TblRow AlignLeft"><%=corpCode%></td>
                    <td class="TblRow AlignLeft"><%=exciseRegNo%></td>
                    <td class="TblRow AlignLeft"><%=licenseAge%></td>
                    <td class="TblRow AlignLeft"><%=address%></td>
                    <td align="right" class="TblRow">&nbsp;
                      <input name="Submit322" type="submit" class="barbutton" onClick="MM_goToURL('parent','Suspect.jsp?action=CompanySave&suspect_no=<%=suspectNo%>');return document.MM_returnValue" value="ข้อมูลเพิ่มเติม">
					  <img src="images/icon_delete.gif" border="0" onClick="KO_deleteTraderSuspect('<%=suspectNo%>');"/>
                    </td>
                  </tr>
                  <tr>
                  
                  <%} %>
    </table>       
</pg:pager>