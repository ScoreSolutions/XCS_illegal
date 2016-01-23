<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="org.springframework.web.bind.ServletRequestUtils"%>
<%@page import="com.ko.util.ArrayUtil"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Binding Example</title>
</head>
<body>
<% 
if( request.getParameter("process")!=null && request.getParameter("process").equals("ok")){ 
	out.println("<center><font color=red>Process Form Value Binding</font></center><hr/>");
	out.println("<h3>Single Value</h3><br/>");
	out.println("textfield:<font color=red>"+ServletRequestUtils.getStringParameter(request,"textfield")+"</font><br/>");
	out.println("password:<font color=red>"+ServletRequestUtils.getStringParameter(request,"password")+"</font><br/>");
	out.println("drop down box:<font color=red>"+ServletRequestUtils.getStringParameter(request,"cars")+"</font><br/>");
	out.println("textArea:<font color=red>"+ServletRequestUtils.getStringParameter(request,"textArea")+"</font><br/>");
	out.println("Upload File:<font color=red>"+ServletRequestUtils.getStringParameter(request,"upload")+"</font><br/>");
	// --------------------
	out.println("<h3>Array Value</h3><br/>");
	out.println("Checkbox :<font color=red>"+ArrayUtil.toString(ServletRequestUtils.getIntParameters(request,"vehicle"))+"</font><br/>");
	out.println("Radio :<font color=red>"+ArrayUtil.toString(ServletRequestUtils.getStringParameters(request,"Sex"))+"</font><br/>");
	out.println("<hr/><br/>");
} %>
<form action="bindExample.jsp" method="post">
   <center><font color="blue">Single Value</font></center>
	<fieldset>
		<legend>
		Text Field
		</legend>
		Height <input type="text" name="textfield" size="100" value="" maxlength="30">
		<input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			Password
		</legend>
		<input type="password" name="password" size=30 maxlength=30>
		<input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			drop down box
		</legend>
		<select name="cars" size="1">
			<option value="" selected="selected">Please Select</option>
			<option value="volvo">Volvo</option>
			<option value="saab" >Saab</option>
			<option value="fiat">Fiat</option>
			<option value="audi">Audi</option>
		</select>
		<br/><input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			Text area
		</legend>
		<textarea rows="10" cols="30" name="textArea"></textarea>
		<br/><input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			Hidden field
		</legend>
		<input id="jsftags:hidden" type="hidden" name="hiddenField" value="hiddenValue" />
		<input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			File Upload
		</legend>
		<input id="upload" type="file" name="upload" value="" />
		<input type="submit" value="submit"/>
	</fieldset>
	
	<br>
	<center><font color="blue">Multi Value</font></center>
	<fieldset>
		<legend>
			check box
		</legend>
		I have a bike:
		<input type="checkbox" name="vehicle" value="5">
		<br />
		I have a car: 
		<input type="checkbox" name="vehicle" value="3">
		<br />
		I have an airplane: 
		<input type="checkbox" name="vehicle" value="2">
		<br/><input type="submit" value="submit"/>
	</fieldset>
	
	<fieldset>
	<legend>
		Radio button
	</legend>
	Male: 
	<input type="radio"
	name="Sex" value="male">
	<br>
	Female: 
	<input type="radio"
	name="Sex" value="female">
	<br/><input type="submit" value="submit"/>
	</fieldset>
	
	<input type="hidden" name="process" value="ok"/>
	<input type="submit" value="submit"/>
</form>
</body>
</html>