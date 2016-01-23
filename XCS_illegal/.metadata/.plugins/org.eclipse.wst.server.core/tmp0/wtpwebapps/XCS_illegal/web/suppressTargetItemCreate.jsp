








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<a href="<c:url value="/process2?action=SuppressTargetItem&cmd=list"/>">Back</a>
<form method="post" name="dataform" action="<c:url value="/process2?action=SuppressTargetItem&cmd=create"/>"                                >
	<%@include file="suppressTargetItemForm.jsp"%>
	<input type="submit" name="save" value="save"/>
	<input type="reset" name="reset" value="Clear Form"/>
</form>
<%@ include file="/web/suppressTargetItemValidation.jsp"%>