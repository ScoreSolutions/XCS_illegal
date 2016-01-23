<%@ page language="java" errorPage="/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ include file="/Templates/header_popup.jsp"%>
<c:out value="${param.id}"/>
<input type="button" value="test write TranLog" onclick="writeTranLog('ทดสอบ')"/><br/>
<%@ include file="/Templates/footer_popup.jsp"%>