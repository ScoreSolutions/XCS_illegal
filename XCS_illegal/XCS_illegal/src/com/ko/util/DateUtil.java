package com.ko.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.i18n.LocaleContextHolder;

import com.ko.Constants;

/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class DateUtil {
	private static Log log = LogFactory.getLog(DateUtil.class);

    private static Locale thLocale = new Locale("th", "TH");

    private static Locale enLocale = new Locale("en", "US");

    public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

    public static Locale getThLocale() {
        if (thLocale == null) {
            thLocale = new Locale("th", "TH");
        }
        return (thLocale);
    }

    public static Locale getEnLocale() {
        if (enLocale == null) {
            enLocale = new Locale("en", "US");
        }
        return (enLocale);
    }

    private DateUtil() {
    }

    public static Date getCurrentDate() {
        return (Calendar.getInstance().getTime());
    }

    public static Date parseDate(int year, int month, int date) {
        return (new GregorianCalendar(year, month - 1, date).getTime());
    }

    public static Date parseDate(int year, int month, int date, int hour,
            int minute, int second) {
        return (new GregorianCalendar(year, month - 1, date, hour, minute,
                second).getTime());
    }

    public static Date parseDate(String dateSource, int dateFormat) throws
            ParseException {
        Date date;
        try {
            date = DateFormat.getDateInstance(dateFormat).parse(dateSource);
        } catch (ParseException e) {
            date = parseDate(dateSource);
        }
        return (date);
    }

    private static Date parseDate(String dateSource) throws ParseException {
        Date date;
        try {
            date = DateFormat.getDateInstance(DateFormat.SHORT).parse(
                    dateSource);
        } catch (ParseException pe1) {
            try {
                date = DateFormat.getDateInstance(DateFormat.MEDIUM).parse(
                        dateSource);
            } catch (ParseException pe2) {
                try {
                    date = DateFormat.getDateInstance(DateFormat.LONG).parse(
                            dateSource);
                } catch (ParseException pe3) {
                    try {
                        date = DateFormat.getDateInstance(DateFormat.FULL)
                        .parse(dateSource);
                    } catch (ParseException pe4) {
                        throw pe4;
                    }
                }
            }
        }
        return (date);
    }

    public static String formatDate(Date date) {
        return (formatDate(date, DateFormat.SHORT));
    }

    public static String formatDateTime(Date date) {
        return (formatDateTime(date, DateFormat.SHORT, DateFormat.SHORT));
    }

    public static String formatDate(Date date, int dateFormat) {
        return (DateFormat.getDateInstance(dateFormat, getEnLocale())
        .format(date));
    }

    public static String formatDateTime(Date date, int dateFormat,
            int timeFormat) {
        return (DateFormat.getDateTimeInstance(dateFormat, timeFormat,
                getEnLocale()).format(date));
    }

    public static String formatThaiDate(Date date, int dateFormat) {
        return (DateFormat.getDateInstance(dateFormat, getThLocale())
        .format(date));
    }

    public static String formatThaiDateTime(Date date, int dateFormat,
            int timeFormat) {
        return (DateFormat.getDateTimeInstance(dateFormat, timeFormat,
                getThLocale()).format(date));
    }
    
	public static String formatDate() {
	    Calendar cal = Calendar.getInstance();
	    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW,Locale.ENGLISH);
	    return sdf.format(cal.getTime());
	}
    //~ Static fields/initializers =============================================


    private static String defaultDatePattern = "yyyy/MM/dd";
    private static String timePattern = "HH:mm";

    //~ Methods ================================================================

    /**
     * Return default datePattern (MM/dd/yyyy)
     * @return a string representing the date pattern on the UI
     */
    public static synchronized String getDatePattern() {
        Locale locale = LocaleContextHolder.getLocale();
        try {
            defaultDatePattern = ResourceBundle.getBundle(Constants.BUNDLE_KEY, locale).getString("date.format");
        } catch (MissingResourceException mse) {
            defaultDatePattern = "dd/MM/yyyy";
        }

        return defaultDatePattern;
    }

    public static String getDateTimePattern() {
        return DateUtil.getDatePattern() + " HH:mm:ss";
    }

    /**
     * This method attempts to convert an Oracle-formatted date
     * in the form dd-MMM-yyyy to mm/dd/yyyy.
     *
     * @param aDate date from database as a string
     * @return formatted string for the ui
     */
    public static final String getDate(Date aDate) {
        SimpleDateFormat df = null;
        String returnValue = "";

        if (aDate != null) {
            df = new SimpleDateFormat(getDatePattern());
            returnValue = df.format(aDate);
        }

        return (returnValue);
    }

    /**
     * This method generates a string representation of a date/time
     * in the format you specify on input
     *
     * @param aMask the date pattern the string is in
     * @param strDate a string representation of a date
     * @return a converted Date object
     * @see java.text.SimpleDateFormat
     * @throws ParseException
     */
    private static final Date convertStringToDate(String aMask, String strDate)
      throws ParseException {
        SimpleDateFormat df = null;
        Date date = null;
        df = new SimpleDateFormat(aMask);

        if (log.isDebugEnabled()) {
            log.debug("converting '" + strDate + "' to date with mask '"
                      + aMask + "'");
        }

        try {
        	if( strDate!=null && !strDate.equals("") )
        		date = df.parse(strDate);
        } catch (ParseException pe) {
            throw new ParseException(pe.getMessage(), pe.getErrorOffset());
        }
        return (date);
    }

    /**
     * This method returns the current date time in the format:
     * MM/dd/yyyy HH:MM a
     *
     * @param theTime the current time
     * @return the current date/time
     */
    public static String getTimeNow(Date theTime) {
        return getDateTime(timePattern, theTime);
    }

    /**
     * This method returns the current date in the format: MM/dd/yyyy
     *
     * @return the current date
     * @throws ParseException
     */
    public static Calendar getToday() throws ParseException {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat(getDatePattern());

        // This seems like quite a hack (date -> string -> date),
        // but it works ;-)
        String todayAsString = df.format(today);
        Calendar cal = new GregorianCalendar();
        cal.setTime(convertStringToDate(todayAsString));

        return cal;
    }

    /**
     * This method generates a string representation of a date's date/time
     * in the format you specify on input
     *
     * @param aMask the date pattern the string is in
     * @param aDate a date object
     * @return a formatted string representation of the date
     *
     * @see java.text.SimpleDateFormat
     */
    public static final String getDateTime(String aMask, Date aDate) {
        SimpleDateFormat df = null;
        String returnValue = "";

        if (aDate == null) {
            log.error("aDate is null!");
        } else {
            df = new SimpleDateFormat(aMask);
            returnValue = df.format(aDate);
        }

        return (returnValue);
    }

    /**
     * This method generates a string representation of a date based
     * on the System Property 'dateFormat'
     * in the format you specify on input
     *
     * @param aDate A date to convert
     * @return a string representation of the date
     */
    public static final String convertDateToString(Date aDate) {
        return getDateTime(getDateTimePattern(), aDate);
    }

    /**
     * This method converts a String to a date using the datePattern
     *
     * @param strDate the date to convert (in format MM/dd/yyyy)
     * @return a date object
     *
     * @throws ParseException
     */
    public static Date convertStringToDate(String strDate)
      throws ParseException {
        Date aDate = null;

        try {
            if (log.isDebugEnabled()) {
                log.debug("converting date with pattern: " + getDatePattern());
            }

            aDate = convertStringToDate(getDateTimePattern(), strDate);
        } catch (ParseException pe) {
            log.error("Could not convert '" + strDate
                      + "' to a date, throwing exception");
            pe.printStackTrace();
            throw new ParseException(pe.getMessage(),
                                     pe.getErrorOffset());

        }

        return aDate;
    }
    private static final String[] PATTERNS = new String[]{
    	"dd/MM/yyyy",
    	"dd-MM-yyyy HH:mm",
        "dd-MM-yyyy HH:mm:ss",
        "yyyy-MM-dd",
        "yyyy-MM-dd HH:mm:ss",
    	"EEE, dd MMM yyyy HH:mm:ss '-'S '('z')'",
        "EEE, dd MMM yyyy HH:mm:ss '+'S '('z')'",
        "EEE, dd MMM yyyy HH:mm:ss '-'S",
        "EEE, dd MMM yyyy HH:mm:ss '+'S",
        "EEE, dd MMM yyyy HH:mm:ss z",
        "EEE, dd MMM yyyy HH:mm:ss Z",
        "EEE, dd MMM yyyy HH:mm:ss",
        "EEE, d MMM yyyy HH:mm:ss '-'S '('z')'",
        "EEE, d MMM yyyy HH:mm:ss '+'S '('z')'",
        "EEE, d MMM yyyy HH:mm:ss '-'S",
        "EEE, d MMM yyyy HH:mm:ss '+'S",
        "EEE, d MMM yyyy HH:mm:ss z",
        "EEE, d MMM yyyy HH:mm:ss Z",
        "EEE, d MMM yyyy HH:mm:ss",

        "EEE, dd MMM yy HH:mm:ss '-'S '('z')'",
        "EEE, dd MMM yy HH:mm:ss '+'S '('z')'",
        "EEE, dd MMM yy HH:mm:ss '-'S",
        "EEE, dd MMM yy HH:mm:ss '+'S",
        "EEE, dd MMM yy HH:mm:ss z",
        "EEE, dd MMM yy HH:mm:ss Z",
        "EEE, dd MMM yy HH:mm:ss",
        "EEE, d MMM yy HH:mm:ss '-'S '('z')'",
        "EEE, d MMM yy HH:mm:ss '+'S '('z')'",
        "EEE, d MMM yy HH:mm:ss '-'S",
        "EEE, d MMM yy HH:mm:ss '+'S",
        "EEE, d MMM yy HH:mm:ss z",
        "EEE, d MMM yy HH:mm:ss Z",
        "EEE, d MMM yy HH:mm:ss",

        "dd MMM yyyy HH:mm:ss '-'S",
        "dd MMM yyyy HH:mm:ss '+'S",
        "dd MMM yyyy HH:mm:ss '-'S '('z')'",
        "dd MMM yyyy HH:mm:ss '+'S '('z')'",
        "dd MMM yyyy HH:mm:ss z",
        "dd MMM yyyy HH:mm:ss Z",
        "dd MMM yyyy HH:mm:ss",

        "dd MMM yyy HH:mm:ss '-'S",
        "dd MMM yyy HH:mm:ss '+'S",
        "dd MMM yyy HH:mm:ss '-'S '('z')'",
        "dd MMM yyy HH:mm:ss '+'S '('z')'",
        "dd MMM yyy HH:mm:ss z",
        "dd MMM yyy HH:mm:ss Z",
        "dd MMM yyy HH:mm:ss",

        "yyyy.MM.dd HH:mm:ss z",
        "yyyy.MM.dd HH:mm:ss Z",
        "yyyy.MM.d HH:mm:ss z",
        "yyyy.MM.d HH:mm:ss Z",
        "yyyy.MM.dd HH:mm:ss",
        "yyyy.MM.d HH:mm:ss",

        "yy.MM.dd HH:mm:ss z",
        "yy.MM.dd HH:mm:ss Z",
        "yy.MM.d HH:mm:ss z",
        "yy.MM.d HH:mm:ss Z",
        "yy.MM.dd HH:mm:ss",
        "yy.MM.d HH:mm:ss",

        "yyyy MM dd HH:mm:ss",
        "yyyy MM d HH:mm:ss",
        "yyyy MM dd HH:mm:ss z",
        "yyyy MM dd HH:mm:ss Z",
        "yyyy MM d HH:mm:ss z",
        "yyyy MM d HH:mm:ss Z",

        "yy MM dd HH:mm:ss",
        "yy MM d HH:mm:ss",
        "yy MM dd HH:mm:ss z",
        "yy MM dd HH:mm:ss Z",
        "yy MM d HH:mm:ss z",
        "yy MM d HH:mm:ss Z",

        "yyyy-MM-dd HH:mm:ss z",
        "yyyy-MM-dd HH:mm:ss Z",
        "yyyy-MM-d HH:mm:ss z",
        "yyyy-MM-d HH:mm:ss Z",
        "yyyy-MM-dd HH:mm:ss",
        "yyyy-MM-d HH:mm:ss",

        "yy-MM-dd HH:mm:ss z",
        "yy-MM-dd HH:mm:ss Z",
        "yy-MM-d HH:mm:ss z",
        "yy-MM-d HH:mm:ss Z",
        "yy-MM-dd HH:mm:ss",
        "yy-MM-d HH:mm:ss",

        "dd MMM yyyy",
        "d MMM yyyy",

        "dd.MMM.yyyy",
        "d.MMM.yyyy",

        "dd-MMM-yyyy",
        "d-MMM-yyyy",

        "dd MM yyyy",
        "d MM yyyy",

        "dd.MM.yyyy",
        "d.MM.yyyy",

        "dd-MM-yyyy",
        "d-MM-yyyy",

        "yyyy MM dd",
        "yyyy MM d",

        "yyyy.MM.dd",
        "yyyy.MM.d",

        "yyyy-MM-dd",
        "yyyy-MM-d",

        "dd MMM yy",
        "d MMM yy",

        "dd.MMM.yy",
        "d.MMM.yy",

        "dd-MMM-yy",
        "d-MMM-yy",

        "dd MM yy",
        "d MM yy",

        "dd.MM.yy",
        "d.MM.yy",

        "dd-MM-yy",
        "d-MM-yy",

        "yy MMM dd",
        "yy MMM d",

        "yy.MMM.dd",
        "yy.MMM.d",

        "yy-MMM-dd",
        "yy-MMM-d",

        "yy MMM dd",
        "yy MMM d",

        "yy.MMM.dd",
        "yy.MMM.d",

        "yy-MMM-dd",
        "yy-MMM-d",

        "EEE dd, MMM yyyy", // ex: Wed 19, Feb 2003

        "EEE dd, MMM yy" // ex: Wed 19, Feb 03
    };
   /* public static java.util.Date getDateFromString(String strDate)
    {
    	strDate = strDate.replaceAll("/", "-");
        java.util.Date dReceivedDate = Calendar.getInstance().getTime();
        if (strDate == null) {
        	//return dReceivedDate;
        	return null;
        } else {
            strDate = strDate.trim();
        }

        SimpleDateFormat pSimpleDateFormat = new SimpleDateFormat("");
        if (!"".equals(strDate))
        {
            for (int i=0; i<PATTERNS.length; i++)
            {
                try
                {
                    pSimpleDateFormat.applyPattern(PATTERNS[i]);
                    dReceivedDate = pSimpleDateFormat.parse(strDate);
                    if (dReceivedDate == null)
                    {
                        continue;
                    }
                    return dReceivedDate;
                }
                catch (ParseException pe)
                {
                    ; // ignore this format try the next one
                }
            }
        }
        return dReceivedDate;
    }*/
    public static String getStringFromDate(Date date,String pattern){
    	SimpleDateFormat df = null;
        String returnValue = "";

        if (date == null) {
            log.error("aDate is null!");
        } else {
            df = new SimpleDateFormat(pattern);
            returnValue = df.format(date);
        }
        return (returnValue);
    }
    public static Date getDateFromString(String date){
    	Date newDate = null;
        String[] patterns = {
        		"dd/MM/yyyy HH:mm:ss",
        		"dd/MM/yyyy HH:mm",
        		"dd/MM/yyyy",
        		"yyyy-MM-dd HH:mm:ss",
        		"yyyy-MM-dd HH:mm",
        		"yyyy-MM-dd",
        		"yyyyMMdd"
        };
    	if( !date.equals("") ){
    		for (int i = 0; i < patterns.length; i++) {
    			try{
        			SimpleDateFormat pSimpleDateFormat = new SimpleDateFormat(patterns[i],Constants.FORCE_SYSTEM_LOCALE);
        			newDate = pSimpleDateFormat.parse(date);
        			if (newDate == null)
                    {
                        continue;
                    }
                    return newDate;
    			} catch (ParseException e) {
    				//e.printStackTrace();
    			}
			}
    	}
    	return newDate;
    }
    
    public static String formatConditionDate(String strDate){
    	//แปลงรูปแบบวันที่จาก dd/mm/yyyy เป็น yyyymmdd เพื่อใช้สำหรับเป็นเงื่อนไขในการค้นหาข้อมูล
    	//และแปลงจากปี พ.ศ. เป็น ค.ศ.
    	String ret = "";
    	if (!strDate.equals("")){
    		String vDate[] = strDate.split("/");
    		ret = (Integer.parseInt(vDate[2])-543) + vDate[1] + vDate[0];
    	}
    	
    	return ret;
    }
    
    public static double getResponseTime(long startTime){
    	double ret=0;
    	long currentTime1 = System.currentTimeMillis();
    	ret = currentTime1 - startTime;
    	return ret/1000;
    }
    
    public static void main(String[] args) {
    	//System.out.println(DateUtil.getDateFromString("03/10/2553"));
    	//System.out.println(DateUtil.getDateFromString("03/10/2553 13:10"));
		//System.out.println(DateUtil.getDateFromString("03/10/2553 13:10:33"));
		//System.out.println(DateUtil.getDateFromString("2553-04-21 13:10:10"));
		//System.out.println(DateUtil.getDateFromString("2553-04-21 13:15"));
		//System.out.println(DateUtil.convertDateToString(DateUtil.getDateFromString("03/10/2553")));
		//Date d = DateUtil.getDateFromString("2553-04-21 13:10:10");
		//System.out.println(DateUtil.getStringFromDate(new Date(), "dd/MM/yyyy"));
		//System.out.println(DateUtil.getDateFromString("25531004"));
		//System.out.println(DateUtil.getDateFromString("3-10-2553 21:10:10"));
    	//System.out.println(getCurrentDate().toString());
    	//System.out.println(convertDateToString(new Date()));
		//System.out.println(DateUtil.convertDateToString(new Date()));
    	/*Calendar cal = Calendar.getInstance();
    	 * 
	    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW,DateUtil.getThLocale());
	    System.out.println(sdf.format(cal.getTime()));*/
    	//System.out.println(formatConditionDate("04/11/2553"));
    	System.out.println(getResponseTime(System.currentTimeMillis()));
	}
}
