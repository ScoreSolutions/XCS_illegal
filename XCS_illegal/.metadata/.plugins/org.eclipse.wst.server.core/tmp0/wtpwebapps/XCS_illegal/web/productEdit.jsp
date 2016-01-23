








 

<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<a href="<c:url value="/process2?action=Product&cmd=list"/>">Back</a>
<form method="post" name="dataform" action="<c:url value="/process2?action=Product&cmd=update"/>"            >
	<%@include file="productForm.jsp"%>
	<input type="hidden" name="id" value="${product.id}"/>
	<input type="submit" name="save" value="Update"/>
	<input type="reset" name="reset" value="Clear Form"/>
</form>
<%@ include file="/web/productValidation.jsp"%>