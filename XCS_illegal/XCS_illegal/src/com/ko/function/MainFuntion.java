package com.ko.function;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;



public class MainFuntion {
	 // ตัดคำหานามสกุล
	public String file_ext(String fileName){
        int index = fileName.lastIndexOf(".");
        String file_ext="";
        if ((index != -1) && (!fileName.endsWith("."))){
        file_ext = fileName.substring(index+1);
        file_ext = file_ext.toLowerCase();
        }
        return file_ext;
	}
	
	 // เอาวันที่และเวลาปัจจุบัน
	public static String DateTimeNow(String format,ReturnDateFormat returnDateFormat){		
		Locale currentLocale = new Locale("en","US");
		if(returnDateFormat == ReturnDateFormat.Th){
			currentLocale = new Locale("th","TH");
		}
		
	    if(returnDateFormat == ReturnDateFormat.Eng){
	    	 currentLocale = new Locale("en","US");
		}    
		  // น่าจะเป็นรูปแบบของวันเวลา
	     SimpleDateFormat formatter = new SimpleDateFormat(format,currentLocale ); // เป็นการ Format รูปแบบวันเวลาที่ต้องการแสดง
	     java.util.Date  today = new java.util.Date(); // จะเก็บทั้งค่าวันและเวลา จะได้ค่าวันเวลาปัจจุบัน
	     String result = formatter.format(today); // result	"2009-06-08 16:24:04" เอาตัวแปร today มา Format และส่งค่าการ Format 
      	 return result;
	}
	
	public static String getTimeNow(){		
		 Locale currentLocale = new Locale("en","US"); 
		  // น่าจะเป็นรูปแบบของวันเวลา
	     SimpleDateFormat formatter = new SimpleDateFormat("HH:mm"); // เป็นการ Format รูปแบบวันเวลาที่ต้องการแสดง
	     java.util.Date  today = new java.util.Date(); // จะเก็บทั้งค่าวันและเวลา จะได้ค่าวันเวลาปัจจุบัน
	     String result = formatter.format(today); // result	"2009-06-08 16:24:04" เอาตัวแปร today มา Format และส่งค่าการ Format 
      	 return result;
	}
	 
	 // เปลี่ยนวันที่ Format
	public static String parseDateTime(String string_Date,String format,ReturnDateFormat returnDateFormat,String return_string_format) throws ParseException{
		Locale currentLocale = new Locale("en","US");
		
		if(returnDateFormat == ReturnDateFormat.Th){
			 currentLocale = new Locale("en","US");
		}
		
	    if(returnDateFormat == ReturnDateFormat.Eng){
	    	currentLocale = new Locale("th","TH");
		}

		SimpleDateFormat formatter = new SimpleDateFormat(format,currentLocale);
		java.util.Date date = formatter.parse(string_Date);
	    String result = formatter.format(date);
	   // System.out.println(" result " +  result);
	    
	    
	    if(returnDateFormat == ReturnDateFormat.Th){
	    	currentLocale = new Locale("th","TH");
		}
		
	    if(returnDateFormat == ReturnDateFormat.Eng){
	    	 currentLocale = new Locale("en","US");
		}
	    
		formatter = new SimpleDateFormat(return_string_format,currentLocale );
	    result = formatter.format(date);
	   // System.out.println(" result " +  result);
	    return result;
	}
	
	
	// ตัดคำเพื่อให้ได้ความยาวของข้อความตามที่ำำกำหนด
	public String CutString(String str,int strLength){
		//String newTxtComment =ThaiUtilities.ASCII2Unicode(source.getTextExtractor().setIncludeAttributes(true).toString());
		if(str != null){
			if(str.length()>strLength)str =str.substring(0,strLength)+"...";
			}
		return str;
		}
	
	
	public static String getNullStringIsEmpty(String str){
     if(str == null){
			str="";
			}
		return str;
	}
	
	
	public static String getNullIntergerIsZero(String str){
	     if(str == null){
				str="0";
				}
			return str;
	}
	
	public static String escape(String pString) {
			int lStringLength = pString.length();
			StringBuilder lResult = new StringBuilder(lStringLength);
			for (int i = 0; i < lStringLength; i++) {
				char lCharacter = pString.charAt(i);
				switch (lCharacter) {
					case '\\': // back-slash
						lResult.append("\\\\");
						break;
					case '\b': // back-space
						lResult.append("\\b");
						break;
					case '\r': // carriage return
						lResult.append("\\r");
						break;
					case '\f': // form feed
						lResult.append("\\f");
						break;
					case '\t': // horizontal tab
						lResult.append("\\t");
						break;
					case '\n': // new line
						lResult.append("\\n");
						break;
					case '\'': // single quote
						lResult.append("\\'");
						break;
					case '"': // double quote
						lResult.append("\\\"");
						break;
					default:
						// escape ISO control codes with octal escapes to make them visible
						if (Character.isISOControl(lCharacter)) {
							//lResult.append('\\' + leftPad(Integer.toOctalString(lCharacter), '0', 3));
						} // if
						else { // copy other characters
							lResult.append(lCharacter);
						} // else
				} // switch
			} // for i
			return (lResult.toString());
	  }
	 
	
	public static String getStringUnEscape(String str){			
	     if(str != null){
	    	    String newStr = escape(str);
				newStr =  newStr.replaceAll("\\\\n","");
				str = newStr;
				}
			return str;
	}
	
	
}
