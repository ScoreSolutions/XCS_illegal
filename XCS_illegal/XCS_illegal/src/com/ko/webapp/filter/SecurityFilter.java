/*
 * JCatalog Project
 */
package com.ko.webapp.filter;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
//
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//

import com.ko.webapp.util.ActionUtils;
import com.ko.Constants;
import com.ko.webapp.bean.UserSession;

/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class SecurityFilter implements Filter {
	//the login page uri

	//the logger object
	private Log logger = LogFactory.getLog(Constants.LOG_NAME);

	//a set of restricted resources
	//private Set restrictedResources;
	private Map restrictedResources =new HashMap();
	/**
	 * Initializes the Filter.
	 */
	public void init(FilterConfig filterConfig) throws ServletException {
		String configs = filterConfig.getInitParameter("config");
		StringTokenizer lines = new StringTokenizer(configs,";");
		String line=null;
		int tokenIndex=0;//  token= "="
		while (lines.hasMoreTokens()) {
	        line=lines.nextToken();
	        tokenIndex=line.indexOf("=");
			this.restrictedResources.put( line.substring(0,tokenIndex),line.substring(tokenIndex+1,line.length()));
	    }
	}

	/**
	 * Standard doFilter object.
	 */
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		this.logger.debug("doFilter");

		String contextPath = ((HttpServletRequest)req).getContextPath();
		String requestUri = ((HttpServletRequest)req).getRequestURI();

		this.logger.debug("contextPath = " + contextPath);
		this.logger.debug("requestUri = " + requestUri);

		logger.debug("pathinfo="+((HttpServletRequest)req).getPathInfo());
		logger.debug("requestUri="+((HttpServletRequest)req).getRequestURI());
		logger.debug("requestUrl="+((HttpServletRequest)req).getRequestURL());
		logger.debug("servletPath="+((HttpServletRequest)req).getServletPath());

		if ( this.checkSecurity(requestUri, contextPath,(HttpServletRequest)req) ) {
			this.logger.debug("authorization succeeded");
			chain.doFilter(req, res);
		}else{
			this.logger.debug("authorization failed");
			//System.out.println(((HttpServletRequest)req).getServletPath());
			//System.out.println(((HttpServletRequest)req).getRequestURI());
			String origURL = ((HttpServletRequest)req).getParameter("origURL");

			if( origURL == null || origURL.length() == 0){
				String queryString = ((HttpServletRequest)req).getQueryString();
				origURL = requestUri;
				if (queryString != null) {
					origURL += "?" + queryString;
				}
			}
			System.out.println(origURL);
		    String targetURL = Constants.LOGIN_URL +  "?origURL=" + URLEncoder.encode(origURL,"utf-8");
			System.out.println(targetURL);
		    ActionUtils.forward(targetURL, ((HttpServletRequest)req), ((HttpServletResponse)res));
			//((HttpServletRequest)req).getRequestDispatcher(Constants.LOGIN_URL).forward(req, res);
		}
	}

	private boolean checkSecurity(String requestUri, String contextPath,HttpServletRequest request){
		Iterator ite = this.restrictedResources.keySet().iterator();
		while (ite.hasNext()) {
			String restrictedResource = (String)ite.next();
			if ( requestUri.indexOf(contextPath + restrictedResource) >= 0 ) {
				// check login
				UserSession userSession = (UserSession)request.getSession().getAttribute(Constants.USER_SESSION);
				if( userSession!=null ){// login ok
					String roles=(String)this.restrictedResources.get(restrictedResource);
					if( roles!=null && userSession.getUserRole()!=null){
						return true;
					}else
						return false;
				}else
					return false; // not login
			}
		}
		return true;
	}

	public void destroy() {}
}
