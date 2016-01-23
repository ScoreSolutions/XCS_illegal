package org.apache.jsp.Popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cal_005fdivide_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<HEAD>\r\n");
      out.write("\r\n");
      out.write("    <title>คำนวณเงินรางวัล : ระบบงานผู้กระทำผิดกฎหมายสรรพสามิต กรมสรรพสามิต</title>\r\n");
      out.write("    <link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <script type=\"text/javascript\" language=\"JavaScript\" src=\"../js/rollimage.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" language=\"JavaScript\" src=\"../js/menu.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" language=\"JavaScript\" src=\"../script/jquery.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" language=\"JavaScript\" src=\"../js/JScript.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function onSubmit() {\r\n");
      out.write("            var arrest = jQuery(\"[name=arrest]\").val();\r\n");
      out.write("            var arrest_co = jQuery(\"[name=arrest_co]\").val();\r\n");
      out.write("            var command = jQuery(\"[name=command]\").val();\r\n");
      out.write("            var helper = jQuery(\"[name=helper]\").val();\r\n");
      out.write("            if (arrest == '')arrest = 0;\r\n");
      out.write("            if (arrest_co == '')arrest_co = 0;\r\n");
      out.write("            if (command == '')command = 0;\r\n");
      out.write("            if (helper == '')helper = 0;\r\n");
      out.write("            var compare = ");
      out.print(request.getParameter("person"));
      out.write(";\r\n");
      out.write("            var total = parseInt(arrest) + parseInt(arrest_co) + parseInt(command) + parseInt(helper);\r\n");
      out.write("            if (compare == total) {\r\n");
      out.write("                var data = [];\r\n");
      out.write("                data['arrest'] = arrest;\r\n");
      out.write("                data['arrest_co'] = arrest_co;\r\n");
      out.write("                data['command'] = command;\r\n");
      out.write("                data['helper'] = helper;\r\n");
      out.write("                window.returnValue = data;\r\n");
      out.write("                window.close();\r\n");
      out.write("            }else{\r\n");
      out.write("                alert('จำนวนคนไม่เท่ากัน');\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("\r\n");
      out.write("<BODY>\r\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"95%\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"2\"><span class=\"websitename\">คำนวณเงินรางวัล</span></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("            <hr/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("            <input name=\"btnCal\" type=\"button\" class=\"barbutton\" value=\"แจก\" onclick=\"onSubmit()\">\r\n");
      out.write("            <input name=\"btnBack\" type=\"button\" class=\"barbutton\" value=\"กลับ\" onclick=\"window.close()\">\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"2\">\r\n");
      out.write("            <hr/>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">ผู้จับกุม :&nbsp;</td>\r\n");
      out.write("        <td><input name=\"arrest\" type=\"text\" class=\"text\" size=\"10\" class=\"textNum\" value=\"1\" readonly OnKeyPress=\"ChkMinusDbl(this);\"> คน\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">ผู้ร่วมจับกุม :&nbsp;</td>\r\n");
      out.write("        <td><input name=\"arrest_co\" type=\"text\" class=\"text\" size=\"10\" class=\"textNum\" OnKeyPress=\"ChkMinusDbl(this);\">\r\n");
      out.write("            คน\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">ผู้สั่งการ :&nbsp;</td>\r\n");
      out.write("        <td><input name=\"command\" type=\"text\" class=\"text\" size=\"10\" class=\"textNum\" OnKeyPress=\"ChkMinusDbl(this);\"> คน\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td align=\"right\">ผู้ช่วยเหลือ :&nbsp;</td>\r\n");
      out.write("        <td><input name=\"helper\" type=\"text\" class=\"text\" size=\"10\" class=\"textNum\" OnKeyPress=\"ChkMinusDbl(this);\"> คน\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
