








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<a href="<c:url value="/process2?action=Position&cmd=list"/>">Back</a>
<form method="post" name="dataform" action="<c:url value="/process2?action=Position&cmd=update"/>"          >
	<%@include file="positionForm.jsp"%>
	<input type="hidden" name="id" value="${position.id}"/>
	<input type="submit" name="save" value="Update"/>
	<input type="reset" name="reset" value="Clear Form"/>
</form>
<%@ include file="/web/positionValidation.jsp"%>