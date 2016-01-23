<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%
InitialContext ctx=null;
DataSource ds=null;
ctx = new InitialContext();
//ds = (DataSource)ctx.lookup(request.getParameter("ds"));
ds = (DataSource)ctx.lookup("illegal");
out.println("connection is :"+ds.getConnection());
Connection con= ds.getConnection();
Statement stm = con.createStatement();
ResultSet rs = stm.executeQuery("select * from users");
while( rs.next() )
	out.println(rs.getString("id")+"<br/>");
con.close();
%>