<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<a href="<c:url value="/process?action=User&cmd=list"/>">กลับหน้าแสดงรายการ</a>
<form method="post" name="dataform" action="<c:url value="/process?action=User&cmd=create"/>">
	<%@include file="form.jsp"%>
	<input type="submit" name="save" value="save"/>
	<input type="reset" name="reset" value="Clear Form"/>
</form>
<%@ include file="/test2/validation.jsp"%>