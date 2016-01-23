<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="/Templates/taglibs.jsp"%>
<a href="<c:url value="/process?action=User&cmd=list"/>">กลับหน้าแสดงรายการ</a>
<form method="post" name="dataform" action="<c:url value="/process?action=User&cmd=update"/>">
	<%@include file="form.jsp"%>
	<input type="hidden" name="id" value="<c:out value="${user.id}"/>"/>
	<input type="submit" name="save" value="Update"/>
</form>