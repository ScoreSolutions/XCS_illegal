








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<a href="<c:url value="/process2?action=SuppressTarget&cmd=list"/>">Back</a>
<form method="post" name="dataform" action="<c:url value="/process2?action=SuppressTarget&cmd=update"/>"              >
	<%@include file="suppressTargetForm.jsp"%>
	<input type="hidden" name="id" value="${suppressTarget.id}"/>
	<input type="submit" name="save" value="Update"/>
	<input type="reset" name="reset" value="Clear Form"/>
</form>
<%@ include file="/web/suppressTargetValidation.jsp"%>