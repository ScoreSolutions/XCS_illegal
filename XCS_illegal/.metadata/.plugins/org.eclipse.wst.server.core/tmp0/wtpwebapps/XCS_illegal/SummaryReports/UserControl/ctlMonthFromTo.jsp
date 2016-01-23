<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<%@page import="com.ko.webapp.util.RequestUtil"%>
   	            	<table width="700" border="0" cellspacing="0" cellpadding="0" >
   	            		<tr>
   	            			<td width="20%" align="right">เดือนที่ทำรายงาน :</td>
   	            			<td width="80%" align="left">
   	            				<select name="montfrom" id="monthfrom" class="select" style="width: 146px">
									<option value="">เลือก</option>
									<c:forEach var="mm" items="${mmlist}">
										<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>="">
										${mm.month_name_thai}</option>
									</c:forEach>
								</select>
							 	<font style="color: red">*</font> 
							 	ถึงเดือนที่ :&nbsp;
							 	<select name="monthto" id="monthto" class="select" style="width: 146px">
									<option value="">เลือก</option>
									<c:forEach var="mm" items="${mmlist}">
										<option value="${mm.isyear}${mm.month_no}" <c:if test="${mm.month_no == param.month_no}"> selected </c:if>="">
										${mm.month_name_thai}</option>
									</c:forEach>
								</select> 
								<font style="color: red">*</font>
   	            			</td>
   	            		</tr>
   	            	</table>