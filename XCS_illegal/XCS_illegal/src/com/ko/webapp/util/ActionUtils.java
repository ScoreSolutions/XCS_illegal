package com.ko.webapp.util;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * This class contains utility methods used by the Action objects
 * in the Project Billboard application.
 *
 * @author Hans Bergsten, Gefion software <hans@gefionsoftware.com>
 * @version 1.0
 */
public class ActionUtils {
    
    /**
     * Returns a URL suitable for redirecting to a JSP page 
     * through the controller servlet, as a showPage action.
     *
     * @param page a relative URL to the target page, URL encoded if
     * it contains parameters.
     */
    public String getShowPageURL(HttpServletRequest request, String page) {
        return request.getContextPath() + request.getServletPath() + 
            "?action=showPage&page=" + page;
    }
    
    /**
     * Forwards to the specified URL.
     *
     * @param url a relative URL
     */
    public static void forward(String url, HttpServletRequest request,
        HttpServletResponse response) 
        throws IOException, ServletException {
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
    }
}