package com.ko.webapp.servlet;

import org.apache.log4j.Logger;

import com.ko.Constants;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class LoginServlet extends HttpServlet{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(Constants.LOG_NAME);

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	    /*
		BaseUserManager userManager=new BaseUserManagerImpl();
		String email=request.getParameter("email");
		String password=request.getParameter("password");

		User user= null;
		try {
			user = userManager.getUser(email, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//user=null;
		if( user!=null ){
			HttpSession session=request.getSession();
			UserSession userSession=new UserSession();
			userSession.setUsername("boonchai");
			userSession.setPassword(user.getUser_pass());
			userSession.setEmail(user.getUser_email());
			userSession.setRole("admin");
			//userSession.setRole();
			session.setAttribute(Constants.USER_SESSION, userSession);

			// Set or "delete" cookies, as requested
//			Cookie userNameCookie = new Cookie("userName", userName);
//			Cookie passwordCookie = new Cookie("password", password);
//			int maxAge = 2592000;
//			if (request.getParameter("remember") == null) {
//				maxAge = 0;
//			}
//			userNameCookie.setMaxAge(maxAge);
//			passwordCookie.setMaxAge(maxAge);
//			response.addCookie(userNameCookie);
//			response.addCookie(passwordCookie);


			// processs request
			logger.debug("context path="+request.getContextPath());
			logger.debug("pathinfo="+request.getPathInfo());
			logger.debug("requestUri="+request.getRequestURI());
			logger.debug("requestUrl="+request.getRequestURL());
			logger.debug("servletPath="+request.getServletPath());
		    String origURL = request.getParameter("origURL");
			if( origURL == null || origURL.length()== 0 )
				response.sendRedirect(request.getContextPath()+Constants.MAIN_URL);
			else{
				String targetURL = origURL;
				response.sendRedirect(origURL);
			}
		}else{// login failed
			//return new ModelAndView("Error", "message", "Invalid username or password.  Signon failed.");
			// forward loggin not passed
			String origURL = request.getParameter("origURL");
			String targetURL = Constants.LOGIN_URL + "?origURL=" + URLEncoder.encode(origURL,"utf-8");
			ActionUtils.forward(targetURL, request, response);
		}*/
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.println("not use this method");
	}

}
