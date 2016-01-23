package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ko.webapp.bean.UserSession;
import com.ko.webapp.util.RequestUtil;
import com.ko.webapp.action.LoginAction;
import com.ko.*;
import com.ko.webapp.util.RequestUtil;
import com.ko.webapp.bean.UserSession;
import com.ko.webapp.action.LoginAction;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/Templates/taglibs.jsp");
    _jspx_dependants.add("/Templates/header.jsp");
    _jspx_dependants.add("/Templates/../Templates/meta.jsp");
    _jspx_dependants.add("/Templates/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>\r\n");
      out.write("\r\n");
      out.write("<!-- HTTP 1.1 -->\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-store\"/>\r\n");
      out.write("<!-- HTTP 1.0 -->\r\n");
      out.write("<meta http-equiv=\"Pragma\" content=\"no-cache\"/>\r\n");
      out.write("<!-- Prevents caching at the Proxy Server -->\r\n");
      out.write("<meta http-equiv=\"Expires\" content=\"0\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf8\"/>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function writeTranLog(tran_desc){\r\n");
      out.write("\tvar browser = \"");
      out.print(RequestUtil.getBrowser(request));
      out.write("\";\r\n");
      out.write("\tvar ip_address = \"");
      out.print(RequestUtil.getIpAddress(request));
      out.write("\";\r\n");
      out.write("\tvar user_id = \"");
      out.print(RequestUtil.getUserSession(request).getUserId());
      out.write("\";\r\n");
      out.write("\tvar session_id = \"");
      out.print(request.getSession().getId());
      out.write("\";\r\n");
      out.write("\tTranlog.writeTranLog(user_id,ip_address,tran_desc,browser,session_id);\r\n");
      out.write("}\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("   .logout a {text-decoration: none;font-weight:bold;color:white;}\r\n");
      out.write("   .logout a:hover{color:black;text-decoration: underline;}\r\n");
      out.write("   \r\n");
      out.write("</style>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\"  href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"js/rollimage.js?time=");
      out.print(new java.util.Date().getTime());
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"js/menu.js?time=");
      out.print(new java.util.Date().getTime());
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"js/JScript.js?time=");
      out.print(new java.util.Date().getTime());
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/service.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/action.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/effect.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\" src=\"script/util.js\"></script>\r\n");
      out.write("<!-- for menu -->\r\n");
      out.write("<LINK  type=\"text/css\" rel=\"stylesheet\" href=\"Templates/Menu/ExciseMenu.css\"/>\r\n");
      out.write("\r\n");
      out.write("<!-- dwr -->\r\n");
      out.write("<script type='text/javascript' src='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Tranlog.js'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/engine.js?time=");
      out.print(new java.util.Date().getTime());
      out.write("'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/util.js?time=");
      out.print(new java.util.Date().getTime());
      out.write("'></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/gen_validatorv31.js?time=");
      out.print(new java.util.Date().getTime());
      out.write("\"></script>\r\n");
      out.write("<script type='text/javascript' src='js/datetimepicker_css.js?time=");
      out.print(new java.util.Date().getTime());
      out.write("'></script>\r\n");
      out.write("<script type='text/javascript' src='dwr/interface/Master.js?time=");
      out.print(new java.util.Date().getTime() );
      out.write("'></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function writeTranLog(tran_desc){\r\n");
      out.write("\tvar browser = \"");
      out.print(RequestUtil.getBrowser(request));
      out.write("\";\r\n");
      out.write("\tvar ip_address = \"");
      out.print(RequestUtil.getIpAddress(request));
      out.write("\";\r\n");
      out.write("\tvar user_id = \"");
      out.print(RequestUtil.getUserSession(request).getIdCard());
      out.write("\";\r\n");
      out.write("\tvar login_his_id = \"");
      out.print(RequestUtil.getUserSession(request).getLogin_his_id());
      out.write("\";\r\n");
      out.write("\tvar session_id = \"");
      out.print(request.getSession().getId());
      out.write("\";\r\n");
      out.write("\t//Tranlog.writeTranLog(user_id,ip_address,tran_desc,browser,session_id);\r\n");
      out.write("\tTranlog.writeTranLog(user_id,ip_address,tran_desc,browser,session_id, login_his_id);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function ShowNotifyPop(){\r\n");
      out.write("\tvar data = window.showModalDialog('Popup/NotifyPopup.jsp' , self , 'dialogWidth=700px,Height=600px');\r\n");
      out.write("\tif(data != null){\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td valign=\"top\" >\r\n");
      out.write("\t\t\t<table width=\"100%\" height=\"100\" border=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\t\t\tcellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"52%\" background=\"images/bk_green.jpg\">\r\n");
      out.write("\t\t\t\t\t<table width=\"95%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"26%\"><a href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"><img src=\"images/logo.png\" width=\"166\"\r\n");
      out.write("\t\t\t\t\t\t\t\theight=\"96\" alt=\"\" border=\"0\"/></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"74%\" align=\"left\" valign=\"middle\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"images/pic_webname.png\" width=\"355\" height=\"60\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"48%\" align=\"right\" valign=\"bottom\"\r\n");
      out.write("\t\t\t\t\t\tbackground=\"images/bk_green.jpg\">\r\n");
      out.write("\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t");

					UserSession us = (UserSession)session.getValue(Constants.USER_SESSION);
					if(us==null){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr><td rowspan=\"3\" colspan=\"2\">&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t");
 }else{
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"><b>Version :</b>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">&nbsp;1.5.0.0</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"40%\" align=\"right\"><b>ผู้ใช้งาน :</b>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"60%\" align=\"left\">&nbsp;");
      out.print(us.getFullName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"><b>ตำแหน่ง :</b>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">&nbsp;");
      out.print(us.getPosname());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"><b>หน่วยงาน :</b>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">&nbsp;");
      out.print(us.getOffname() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr height=\"25px\">\r\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"logout\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"process?action=Login&cmd=Logout\" >ออกจากระบบ</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
 }
      out.write("\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"#EDEDED\" colspan=\"2\"><!-- Menu-->\r\n");
      out.write("\t\t\t\t\t");

					if(us != null){
						out.println("<SCRIPT language=\"javascript\"  type=\"text/javascript\" src=\"Templates/Menu/unimenu.js\"></SCRIPT>");
						out.println("<SCRIPT language=\"javascript\"  type=\"text/javascript\" src=\"Templates/Menu/ExciseMenucfg.js\"></SCRIPT>");
						out.println(session.getValue("MyMenu").toString());
					}else //Menu
						out.println("&nbsp;");
					
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td height=\"2\" bgcolor=\"#999999\"></td>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\" bgcolor=\"#999999\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td height=\"3\" align=\"left\" colspan=\"2\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t<table width=\"203\" border=\"0\" height=\"3\" cellspacing=\"0\"\r\n");
      out.write("\t\t\t\t\t\tcellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"200\" bgcolor=\"#999999\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><img src=\"images/pic_angleMenu.gif\" /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td valign=\"top\" height=\"650px\" >\r\n");
      out.write("\t\t<!-- Body -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
if(us == null){
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, false);
      out.write('\r');
      out.write('\n');
}else{ 
	String showPage = request.getParameter("page");
	if( showPage == null ||  showPage=="" ){
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "home2.jsp", out, false);
      out.write('\r');
      out.write('\n');
	}else{ 
      out.write("\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, showPage , out, false);
      out.write('\r');
      out.write('\n');
	}
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("\t\t<!-- Footer -->\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t    <td align=\"center\" height=\"20\" bgcolor=\"#999999\">\r\n");
      out.write("\t\t    \t<span class=\"footerdetail\">Copyright &copy; 2010 The Excise Department. All rights reserved.</span></br >\r\n");
      out.write("\t\t    \t<span class=\"footerdetail\">Resolutions : 1024x768 on Internet Explorer Version 7.0 or Later</span>\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    _jspx_th_c_005furl_005f0.setValue("dwr/interface/SelectRegion.js");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    _jspx_th_c_005furl_005f1.setValue("/");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }
}
