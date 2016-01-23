package com.util;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class PropertyUtil {
	public static String fileName = "/database.properties";
	protected static PropertyUtil instance = null;
    protected Properties properties = null;


	public static PropertyUtil getInstance(){
	    if (instance == null) {
	        synchronized (PropertyUtil.class) {
	            if (instance==null) {
	                instance = new PropertyUtil();
	            }
	        }
	    }
	    return instance;
    }

	public String getValue(String key) throws Exception{
		String value = "";
        try {
        	if (properties == null) {
    			properties = new Properties();
    			InputStream inputStream = getClass().getResourceAsStream(fileName);
    			try {
    				properties.load(inputStream);
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    		}

            value = properties.getProperty(key); //get Properties value
            if (value == null) {
            	value = "";
            }
            //System.out.println(key+" : "+value);
        } catch(Exception e ){
        	e.printStackTrace();
        	throw e;
        }
        return value;

	}
	public static void printProperty(Properties props){
		Iterator keys = props.keySet().iterator();
		while( keys.hasNext() ){
			String key =(String)keys.next();
			System.out.println(key+"="+props.get(key));
		}
	}
	public static Locale getSystemLocale(){
		return new Locale(System.getProperty("user.language"), System.getProperty("user.country"));
	}
}
