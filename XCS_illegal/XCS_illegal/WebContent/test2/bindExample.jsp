<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="org.springframework.web.bind.ServletRequestUtils"%>
<%@page import="org.springframework.web.util.WebUtils"%>
<%@page import="java.util.Arrays"%>
<%@page import="com.ko.util.ArrayUtil"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Binding Example</title>
</head>
<body>
<% 

if( request.getParameter("process")!=null && request.getParameter("process").equals("ok")){ 
	out.println("<hr>Single Value<br/>");
	out.println("<font color=red>Process Form Value Binding</font><hr/>");
	out.println("textfield:"+ServletRequestUtils.getStringParameter(request,"textfield")+"<br/>");
	out.println("password:"+ServletRequestUtils.getStringParameter(request,"password")+"<br/>");
	out.println("<hr>Array Value<br/>");
	out.println("Checkbox :"+ArrayUtil.toString(ServletRequestUtils.getIntParameters(request,"vehicle"))+"<br/>");
	out.println("Radio :"+ArrayUtil.toString(ServletRequestUtils.getStringParameters(request,"Sex"))+"<br/>");
	out.println("<hr/><br/>");
} %>
<form action="bindExample.jsp" method="post">
	<fieldset>
		<legend>
		Text Field
		</legend>
		Height <input type="text" name="textfield" size="100" value="" maxlength="30">
	</fieldset>
	<input type="submit" value="submit"/>
	<fieldset>
		<legend>
			Password
		</legend>
		<input type="password" name="password" size=30 maxlength=30>
	</fieldset>
	<input type="submit" value="submit"/>
	
	
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
	</fieldset>
	<input type="submit" value="submit"/>

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
	</fieldset>
<input type="submit" value="submit"/>
	

	<fieldset>
		<legend>
			drop down box
		</legend>
		<select name="cars" size="1">
			<option value="volvo">Volvo</option>
			<option value="saab" selected="selected">Saab</option>
			<option value="fiat">Fiat</option>
			<option value="audi">Audi</option>
		</select>
	</fieldset>

	<fieldset>
		<legend>
			Text area
		</legend>
		<textarea rows="10" cols="30">The cat was playing in the garden.</textarea>
	</fieldset>

	<fieldset>
		<legend>
			button
		</legend>
		<input type="button" value="Hello world!">
	</fieldset>

	<fieldset>
		<legend>
			label
		</legend>
		<input type="radio" name="sex" id="male" />
		<label for="male">Male</label>
		<br />
		<input type="radio" name="sex" id="female" />
		<label for="female">Female</label>
	</fieldset>
	<input type="submit" value="submit"/>
	
	
	
	<fieldset>
		<legend>
			Option Group
		</legend>
		<select>
			<optgroup label="Swedish Cars">
			<option value ="volvo">Volvo</option>
			<option value ="saab">Saab</option>
			</optgroup>
			<optgroup label="German Cars">
			<option value ="mercedes">Mercedes</option>
			<option value ="audi">Audi</option>
			</optgroup>
		</select>
	</fieldset>
	<input type="submit" value="submit"/>
	
	<fieldset>
		<legend>
			Hidden field
		</legend>
		<input id="jsftags:hidden" type="hidden" name="test" value="userPreference" />
	</fieldset>
	<input type="submit" value="submit"/>

	<fieldset>
		<legend>
			File Upload
		</legend>
		<input id="upload" type="file" name="upload"/>
	</fieldset>
	<input type="submit" value="submit"/>
	
	<fieldset>
		<legend>หัวข้อกระทู้</legend>
		asdfasdfasdfasdf
		asdfasdfasdfasdf
		asdfasdf
	</fieldset>
	<hr/>
	<fieldset>
		<legend>
			<h2>1</h2>
		</legend>
		ความหกดฟหกดฟหกดฟหกดหกดฟห กยกd ก็ดีน่ะ
	</fieldset>
<input type="submit" value="submit"/>

	<fieldset>
		<legend>
			<h2>2</h2>
		</legend>
		ความหกดฟหกดฟหกดฟหกดหกดฟห กยกd ก็ดีน่ะ
	</fieldset>
<input type="submit" value="submit"/>

	<fieldset>
		<legend align=right>
			<h2>3</h2>
		</legend>
		ความหกดฟหกดฟหกดฟหกดหกดฟห กยกd ก็ดีน่ะ
	</fieldset>
	<hr/>
	<FIELDSET>
name: <INPUT NAME="realname"><BR>
email: <INPUT NAME="email">
</FIELDSET><P>
<input type="submit" value="submit"/>

<FIELDSET>
favorite color: <INPUT NAME="favecolor"><BR>
<INPUT TYPE=CHECKBOX NAME="onions"> like green onions<BR>
<INPUT TYPE=CHECKBOX NAME="cookies"> like cookies<BR>
<INPUT TYPE=CHECKBOX NAME="kimchee"> like kim chee<BR>
</FIELDSET><P>
<input type="submit" value="submit"/>

<FIELDSET>
other comments:<BR>
<TEXTAREA NAME="comments" ROWS=5 COLS=25></TEXTAREA>
</FIELDSET>

<input type="hidden" name="process" value="ok"/>
<input type="submit" value="submit"/>
</form>
</body>
</html>