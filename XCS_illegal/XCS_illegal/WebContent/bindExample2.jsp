<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" errorPage="/error.jsp"%>
<%@ include file="/Templates/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="com.ko.util.ArrayUtil"%>
<%@page import="com.ko.webapp.util.FormHandler"%>
<%@page import="org.springframework.web.bind.ServletRequestUtils"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Arrays"%>
<html>
<%
FormHandler form = new FormHandler(request);
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type='text/javascript' src='js/datetimepicker_css.js'></script>
<title>Binding Example2</title>
<script type='text/javascript'>
function testVar(){
	dataform=document.forms["dataform"]; // reference to the form
	alert(dataform["u:textfield"].value); // get value
}
</script>
</head>
<body>
<table><tr><td><font color="red"><%=form.getFormMessage()%></font></td></tr></table>

<% 

/*if( request.getParameter("process")!=null && request.getParameter("process").equals("ok")){ 
	out.println("<center><font color=red>Process Form Value Binding</font></center><hr/>");
	out.println("<h3>Single Value</h3><br/>");
	out.println("textfield:<font color=red>"+ServletRequestUtils.getStringParameter(request,"u:textfield")+"</font><br/>");
	out.println("password:<font color=red>"+ServletRequestUtils.getStringParameter(request,"password")+"</font><br/>");
	out.println("drop down box:<font color=red>"+ServletRequestUtils.getStringParameter(request,"cars")+"</font><br/>");
	out.println("textArea:<font color=red>"+ServletRequestUtils.getStringParameter(request,"textArea")+"</font><br/>");
	out.println("Hidden :<font color=red>"+ServletRequestUtils.getStringParameter(request,"hiddenField")+"</font><br/>");
	out.println("Upload File:<font color=red>"+ServletRequestUtils.getStringParameter(request,"upload")+"</font><br/>");
	out.println("Calendar:<font color=red>"+ServletRequestUtils.getStringParameter(request,"calendar")+"</font><br/>");
	// --------------------
	out.println("<h3>Array Value</h3><br/>");
	out.println("Checkbox :<font color=red>"+ArrayUtil.toString(ServletRequestUtils.getIntParameters(request,"vehicle"))+"</font><br/>");
	out.println("Radio :<font color=red>"+ArrayUtil.toString(ServletRequestUtils.getStringParameters(request,"Sex"))+"</font><br/>");
	out.println("<hr/><br/>");
}*/ 
%>
<form name="dataform" action="<c:url value="/process?action=BindExample&cmd=create"/>" method="post" enctype="multipart/form-data">
  <table border="1" >
	<tr>
		<td>ID</td>
		<td>${user.id}</td>
		${f:hidden("manager:id",user.id,"")}
	</tr>
	<tr>
			<td>salary</td>
		<td>
					${user.salary}
				</td>
				${f:hidden("manager:salary",user.salary,"")}
		</tr>
	<tr>
			<td>parent_id</td>
		<td>
					${user.parent_id}
				</td>
		</tr>
	<tr>
			<td>photo</td>
		<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=USERS&id=${user.id}" widht=100 height=100>
				</td>
		</tr>
	<tr>
			<td>sex</td>
		<td>
					${user.sex}
				</td>
		</tr>
	<tr>
			<td>update_by</td>
		<td>
					${user.update_by}
				</td>
		</tr>
	<tr>
			<td>create_by</td>
		<td>
					${user.create_by}
				</td>
		</tr>
	<tr>
			<td>update_on</td>
		<td>
					<fmt:formatDate value="${user.update_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>create_on</td>
		<td>
					<fmt:formatDate value="${user.create_on}" pattern="dd/MM/yyyy"/>
				</td>
		</tr>
	<tr>
			<td>user_pass</td>
		<td>
					${user.user_pass}
				</td>
		</tr>
	<tr>
			<td>user_login</td>
		<td>
					${user.user_login}
				</td>
		</tr>
	<tr>
		</tr>
</table>
<table>
Employee List
<table border="1">
	<tbody>
		<tr>
			<td><input type="submit" value="Delete" onclick="return confirmBox('Confirm Delete')"/></td>
<td>ID</td>
					<td>SALARY</td>
					<td>PHOTO</td>
					<td>SEX</td>
					<td>UPDATE_BY</td>
					<td>CREATE_BY</td>
					<td>UPDATE_ON</td>
					<td>CREATE_ON</td>
					<td>USER_PASS</td>
					<td>USER_LOGIN</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${emps}"  var="emp">
			${f:hidden("emps:id",emp.id,"")}
			<tr>
				<td><input type="checkbox" name="id" value="${emp.id}"/></td>
				<td>${emp.id}</td>
			<td>
					${emp.salary}
				</td>
				<td>
					<img src="<c:url value='/process?action=GetImage'/>&table=USERS&id=${emp.id}" widht=100 height=100>
				</td>
				<td>
					${emp.sex}
				</td>
				<td>
					${emp.update_by}
				</td>
				<td>
					${emp.create_by}
				</td>
				<td>
					<fmt:formatDate value="${emp.update_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					<fmt:formatDate value="${emp.create_on}" pattern="dd/MM/yyyy"/>
				</td>
				<td>
					${emp.user_pass}
				</td>
				<td>
					${emp.user_login}
				</td>
				<td><a href="<c:url value='/process2?action=User&cmd=edit&id='/>${emp.id}">Edit</a></td>
				<td><a href="<c:url value='/process2?action=User&cmd=delete&id='/>${emp.id}" onclick="return confirmBox('Confirm Delete')" >Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<hr/>
</table>   
   <center><font color="blue">Single Value</font></center>
	<fieldset>
		<legend>
		Text Field
		</legend>
		Height ${f:text("textfield",form.textfield,"size=100 maxlength=30")}
		<input type="submit" value="submit" onclick="testVar()"/>
	</fieldset>
	<fieldset>
		<legend>
			Password
		</legend>
		${f:text("password",form.password,"size=30 maxlength=30")}
		<input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			drop down box
		</legend>
		${f:select("dropdown",province,form.dropdown,"size=1")}
		<br/><input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			Text area
		</legend>
		${f:textarea("textArea",form.textArea,"rows=10 cols=30")}
		<br/><input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			Hidden field
		</legend>
		${f:hidden("hiddenField",form.hiddenField,"")}
		<input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			File Upload
		</legend>
		${f:file("upload","")}
		<input type="submit" value="submit"/>
	</fieldset>
	<fieldset>
		<legend>
			Date
		</legend>
		${f:calendar("calendar",form.calendar,"")}
		<input type="submit" value="submit"/>
	</fieldset>
	
	<fieldset>
	<legend>
		Radio button
	</legend>
	Male: ${f:radio("radio","5.0",form.radio,"")}
	<br>
	Female: ${f:radio("radio","6.0",form.radio,"")}
	<br/><input type="submit" value="submit"/>
	</fieldset>
	<br>
	<center><font color="blue">Multi Value</font></center>
	
	<fieldset>
		<legend>
			check box
		</legend>
		I have a bike:${f:checkbox("checkbox","5",form.checkbox,"")}
		<br />
		I have a car: ${f:checkbox("checkbox","3",form.checkbox,"")} 
		<br />
		I have an airplane: ${f:checkbox("checkbox","2",form.checkbox,"")}
		<br/><input type="submit" value="submit"/>
	</fieldset> 
	<input type="hidden" name="process" value="ok"/>
</form>
</body>
</html>