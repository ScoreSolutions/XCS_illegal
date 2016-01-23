package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.text.DateFormat;
import java.util.Locale;
import com.ko.webapp.bean.UserSession;
import com.ko.service.*;
import com.pccth.rdbservice.EdOfficeInfo;

public final class home2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" height=\"450\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"100%\" align=\"center\" valign=\"middle\" background=\"images/bg_logo.jpg\">\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t<!--<select name=\"court_id_familiar\" id=\"onceCourt\" style=\"width:400px;\">\r\n");
      out.write("\t\t\t\t<option value=\"\" selected>เลือก</option>\r\n");
      out.write("\t\t\t\t-->");
  
				//MasterService ms = new MasterService();
				//Test RDB WebService
				//List<EdOfficeInfo>  mm = MasterService.getEdOfficeList("","");
				//for (int i=0;i<mm.size();i++)
				//{
				//	out.println("<option value='" + mm.get(i).getOffCode() + "' >" + mm.get(i).getOffName() + "</option>");
				//}
				
      out.write("\r\n");
      out.write("\t\t\t<!--</select> \r\n");
      out.write("\t\t--></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
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
}
