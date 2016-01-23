<%@page import="com.ko.webapp.util.RequestUtil"%>
<!-- HTTP 1.1 -->
<meta http-equiv="Cache-Control" content="no-store"/>
<!-- HTTP 1.0 -->
<meta http-equiv="Pragma" content="no-cache"/>
<!-- Prevents caching at the Proxy Server -->
<meta http-equiv="Expires" content="0"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf8"/>
<script type="text/javascript">
function writeTranLog(tran_desc){
	var browser = "<%=RequestUtil.getBrowser(request)%>";
	var ip_address = "<%=RequestUtil.getIpAddress(request)%>";
	var user_id = "<%=RequestUtil.getUserSession(request).getUserId()%>";
	var session_id = "<%=request.getSession().getId()%>";
	Tranlog.writeTranLog(user_id,ip_address,tran_desc,browser,session_id);
}
</script>