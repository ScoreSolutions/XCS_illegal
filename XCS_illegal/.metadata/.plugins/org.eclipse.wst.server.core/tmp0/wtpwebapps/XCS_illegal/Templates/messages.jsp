<c:if test="${not empty _formMessage}">
	<table width="100%"><tr><td><font color="green"><b>${_formMessage}</b></font></td></tr></table>
	<c:remove var="_formMessage" scope="session"/>
</c:if>
<script type="text/javascript">
	var is ='${_formMessage}';
	if(is != ''){
		alert(is);
	}
</script>