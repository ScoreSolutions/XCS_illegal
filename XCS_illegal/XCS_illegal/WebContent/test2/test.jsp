<%@page import="java.util.Enumeration"%>
<%
	out.println(request.getRequestURI()+"<br/>");
	out.println(request.getRequestURL()+"<br/>");
	out.println(request.getContextPath()+"<br/>");
	out.println(request.getPathInfo()+"<br/>");
	out.println(request.getQueryString()+"<br/>");
	Enumeration e = request.getHeaderNames();
    while (e.hasMoreElements()) {
        String headerName = (String)e.nextElement();
        String headerValue = request.getHeader(headerName);
        out.println(headerName+"->"+headerValue+"<br/>");
    }
%>