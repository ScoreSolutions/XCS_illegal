








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<a href="<c:url value="/process2?action=AppReqApproveCompareForm2&cmd=list"/>">Back</a>
<form method="post" name="dataform" action="<c:url value="/process2?action=AppReqApproveCompareForm2&cmd=create"/>"                                >
	<%@include file="appReqApproveCompareForm2Form.jsp"%>
	<input type="submit" name="save" value="save"/>
	<input type="reset" name="reset" value="Clear Form"/>
</form>
<%@ include file="/web/appReqApproveCompareForm2Validation.jsp"%>