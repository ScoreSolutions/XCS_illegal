package com;

import java.util.Locale;

/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class Constants {
	// Locale
	public static final Locale FORCE_SYSTEM_LOCALE = new Locale("th","TH");
	public static final Locale DB_LOCALE = new Locale("en","EN");
	
	
	// paging config
	public static final String COLUMN_CREATED = "created";
	public static final String ASCENDING = "asc";
	public static final String DESCENDING = "desc";
	public static final int DEFAULT_PAGE = 1;
	public static final int DEFAULT_PAGE_SIZE = 10;
	public static final int MAX_PAGE_SIZE = 30;

	// request attribute
	///public static final String FORM_KEY = "_FORM_Handler";
	public static final String FORM_MESSAGE = "_formMessage";
	public static final String FORM_DATA = "_formData";
	public static final String FORM_ERRORS = "_formErrors";
	public static final String FORM_ERROR_COLOR = "red";
	
	// Security
	public static final String USER_SESSION = "MYUSER";
	public static final String LOGIN_URL = "/login.jsp";
	public static final String MAIN_URL = "/main.jsp";
	public static final String ADMIN_URL = "/admin/";

	// logging name
	public static final String LOG_NAME = "xcs_illegal";
	public static final String EVENT_BEGIN = "begin|";
	public static final String EVENT_CONT = "cont|";
	public static final String EVENT_END = "end|";

	// file upload
	public static final String IMAGE_PATH="E:/ITWork/Source/XCS_illegal/WebContent/images/";
	public static final Integer MAX_FILE_SIZE = 2*1024*1024;// 2 MB.

	// report
	public static final String REPORT_PATH="/WEB-INF/reports/";
	///////////////////////////////////////////////////////

	/** The name of the ResourceBundle used in this application */
	public static final String BUNDLE_KEY = "ApplicationResources";

	/** The encryption algorithm key to be used for passwords */
	public static final String ENC_ALGORITHM = "algorithm";

	/** A flag to indicate if passwords should be encrypted */
	public static final String ENCRYPT_PASSWORD = "encryptPassword";

	/** File separator from System properties */
	public static final String FILE_SEP = System.getProperty("file.separator");

	/** User home from System properties */
	public static final String USER_HOME = System.getProperty("user.home")
			+ FILE_SEP;

	/** The name of the configuration hashmap stored in application scope. */
	public static final String CONFIG = "appConfig";

	/**
	 * Session scope attribute that holds the locale set by the user. By setting
	 * this key to the same one that Struts uses, we get synchronization in
	 * Struts w/o having to do extra work or have two session-level variables.
	 */
	public static final String PREFERRED_LOCALE_KEY = "org.apache.struts.action.LOCALE";


	/**
	 * The request scope attribute for indicating a newly-registered user
	 */
	public static final String REGISTERED = "registered";

	/**
	 * The name of the Administrator role, as specified in web.xml
	 */
	public static final String ADMIN_ROLE = "admin";

	/**
	 * The name of the User role, as specified in web.xml
	 */
	public static final String USER_ROLE = "user";

	public static final String USER_PENDING_ROLE = "user_pending";

	/**
	 * The name of the user's role list, a request-scoped attribute when
	 * adding/editing a user.
	 */
	public static final String USER_ROLES = "userRoles";

	/**
	 * The name of the available roles list, a request-scoped attribute when
	 * adding/editing a user.
	 */
	public static final String AVAILABLE_ROLES = "availableRoles";

	/*
	// for json constant
	public static final String JSON_DATA = "json_data";
	public static final String JSON_ERRORS = "json_errors";
	public static final String TOTAL = "total";
	public static final String RECORDING_ID = "recordingId";



	// contentType
	public static final int KARAOKE = 1;
	public static final int MP3 = 2;

	// default

	public static final String DATE_TIME_FORMAT_NOW = "dd-MM-yyyy HH:mm:ss";
	public static final String DATE_FORMAT_NOW = "dd/MM/yyyy";

	public static final String imgPath = "D:/Source/EclipseProject/Framework/";

	// /////////////////////// Database list \\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static final String db1 = "db1";

	// /////////////////////// Table 's list \\\\\\\\\\\\\\\\\\\\\\\\\\\
	public static final String TB_SEQUENCE = "sequence";
	public static final String TB_CONTENT_CATEGORIES = "content_categories";*/



	/*public static final String WEB_TITLE = "## My CMS ##";
	public static final String WEB_URL = "http://localhost:8080/framework/";
	public static final String WEB_EMAIL = "admin@itdev2.com";

	// web configuration
	public static final String LEFTPANE_WIDTH = "120";
	public static final String LEFTPANE_COLOR = "#FFFFFF";
	public static final String CENTERPANE_WIDTH = "100%";
	public static final String CENTERPANE_COLOR = "#FFFFFF";
	public static final String RIGHTPANE_WIDTH = "120";
	public static final String RIGHTPANE_COLOR = "#FFFFFF";
	public static final String WEB_WIDTH = "100%";*/
	
	
}
