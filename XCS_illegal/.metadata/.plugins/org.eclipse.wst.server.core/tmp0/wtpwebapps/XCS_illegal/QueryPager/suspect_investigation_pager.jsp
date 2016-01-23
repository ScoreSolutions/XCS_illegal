<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<%@page import="com.ko.util.EngineUtility"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="com.ko.util.SelectionUtility"%>
<%@page import="com.ko.util.SessionConstant"%>
<%@page import="com.ko.util.IbatisAgent" %>
<%@page import="com.ko.util.FormUtility"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="com.ko.util.Q"%>

<% 
	String suspectNo = request.getParameter("suspect_no");

	List<SuspectInvestigate> data = null ;//= (List<HashMap<String,Object>>)session.getAttribute(SessionConstant.THAI_SUSPECT_DATA);
	HashMap<String,String> map = map = EngineUtility.transformRequestParameter(request.getParameterMap());

	
	if(data == null){
		java.math.BigDecimal no = new java.math.BigDecimal(suspectNo);
		
		try{
			data = new IbatisAgent().selectSuspectInvestigateListBySuspectNo(no);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		//session.setAttribute(SessionConstant.THAI_SUSPECT_DATA, data);
	}
	int maxPageItems = 4;
%>


<%@page import="com.ko.model.SuspectInvestigate"%>
<%@page import="java.util.Date"%>
<%@page import="com.ko.util.FormConstant"%><script>
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
                    <td width="35" class="TblHeaderColumn AlignCenter"><input type="checkbox" name="checkbox3" value="checkbox"></td>
                    <td width="80" class="TblHeaderColumn">วันที่เริ่ม</td>
                    <td width="80" class="TblHeaderColumn">วันที่สิ้นสุด</td>
                    <td width="170" class="TblHeaderColumn">คดี พ.ร.บ.</td>
                    <td width="255" class="TblHeaderColumn">พฤติกรรมผู้ต้องสงสัย</td>
                    <td width="183" class="TblHeaderColumn">&nbsp;</td>
                  </tr>
                  
                 <%
				for (int i = offset.intValue(), l = Math.min(i + maxPageItems,
						data.size()); i < l; i++) {
					
						SuspectInvestigate si = data.get(i);
						Date startDate = si.getStartDate();
						Date endDate = si.getEndDate();
						BigDecimal legislationId = si.getLegislationId();
						String legislationName = FormConstant.getLegislationName(legislationId);
						String behavior = si.getSuspectBehavior();
					
						String startDateDis = Q.clean(FormUtility.getThaiDate(startDate),"-");
						String endDateDis = Q.clean(FormUtility.getThaiDate(endDate),"-");
				%>
				
                  <tr>
                    <td class="TblRow AlignCenter"><input type="checkbox" name="checkbox" value="checkbox"></td>
                    <td class="TblRow AlignLeft"><%=startDateDis%></td>
                    <td class="TblRow AlignLeft"><%=endDateDis%></td>
                    <td class="TblRow AlignLeft"><%=legislationName%></td>
                    <td class="TblRow AlignLeft"><%=behavior%> </td>
                    <td align="right" valign="middle" class="TblRow">
                      <input name="Submit3" type="button" class="button" value="แก้ไขข้อมูล"
                         onClick="MM_goToURL('parent','Suspect.jsp?action=SuspectInvest&sp=<%out.println(request.getParameter("sp")); %>');
                         return document.MM_returnValue">&nbsp;
                      <input name="Submit3" type="button" class="button" onClick="window.open('Reports/InvestigationReports.xps' , '_blank' , 'menubar=no,toolbar=yes,resizable=yes,location=no,scrollbars=no,width=900,height=700');" value="พิมพ์">
                      </td>
                  </tr>
                  
                  <%} %>
    </table>       
</pg:pager>