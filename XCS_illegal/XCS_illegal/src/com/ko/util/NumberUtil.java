package com.ko.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberUtil {
	private static DecimalFormat format = new DecimalFormat();
	public static Integer getIntegerFromString(String str){
		try{
			return format.parse(str.trim()).intValue();
		}catch(Exception ex){
			return null;
		}
	}
	public static Long getLongFromString(String str){
		try{
			return format.parse(str.trim()).longValue();
		}catch(Exception ex){
			return null;
		}
	}
	public static Double getDoubleFromString(String str){
		try{
			return format.parse(str.trim()).doubleValue();
		}catch(Exception ex){
			return null;
		}
	}
	private static String convert(long num){
		//String nums = String.valueOf(num);
		java.text.NumberFormat df = NumberFormat.getNumberInstance();
		String nums = df.format(num).replaceAll(",", "");
		
		// สร้าง Array สำหรับเปลี่ยนเลขเป็นตัวอักษร เรียงจากน้อยไปมาก เพราะเราจะทำการไล่จากตัวท้ายไปหาตัวหน้า
		String number[] = { "", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า" };

		// และสำหรับหลักเลข 1 ชุด เรียงจากน้อยไปมาก เพราะเราจะทำการไล่จากตัวท้ายไปหาตัวหน้าเหมือนกัน
		String number2[] = { "", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน" };
		
		String str = ""; // สร้าง String เก็บชุดอักษรที่คำนวณได้
		int lennum = nums.length(); // นับจำนวนอักษรที่ผู้ใช้ใส่เข้ามา
		int tmp = 0; // ค่าเริ่มต้นของค่าหลักเลข
		int count = 0; // ค่าเริ่มต้นตัวนับที่จะไล่ไปตามตำแหน่งต่างๆ

		// วนค่าจากตำแหน่งท้ายของตัวเลขขึ้นมา เนื่องจากเรารู้ว่าตัวท้ายสุดจะเป็นหลักหน่วยเสมอ
		for(int i = lennum-1; i > -1 ; --i ){
			// เพิ่มค่าตัวนับในตำแหน่งที่วนลูป
			count++;
			// เมื่อตำแหน่งตัวเลขมากกว่าหลักล้าน ให้ย้อนกลับเป็นหลักสิบ (ทำไมไม่เป็นหลักหน่วย? เนื่องจากเลยจากหลักล้านไปแล้ว ตัวต่อไปจะเหมือนกับหลักสิบ เช่น 10,000,000 เราจะเห็นว่าเลข 1 คือหลักสิบ)
			if ( tmp == 7 ) tmp = 1;

			// ดึงตัวเลขของตำแหน่งที่วนมาถึง
			char ch = nums.charAt(i);
			// เปลี่ยนตัวเลขเป็นตัวหนังสือ ของตัวนั้นๆ
			//String digit = number[ parseInt( ch ) ];
			String digit = number[Integer.valueOf(String.valueOf(ch))];
			// เก็บค่าของหลักลงตัวแปร(เริ่มจาก 1)
			int pos = tmp + 1;
			// หากเป็นหลักสิบ และตัวเลขที่เจอเป็น 1 ไม่ให้แสดงตัวอักษร คำว่า หนึ่ง เนื่องจากเราจะไม่อ่านว่า หนึ่งสิบ
			if ( pos == 2 && ch=='1' ){
				digit = "";
				// หากเป็นหลักสิบ และตัวเลขที่เจอเป็น 2 ให้แสดงตัวอักษร คำว่า ยี่ เนื่องจากเราจะไม่อ่านว่า สองสิบ
			}else if ( pos == 2 && ch=='2' ){
				digit = "ยี่";
				// หากเป็นหลักหน่วย หรือหลักล้าน และตัวเลขที่พบคือ 1 และยังมีหลักที่มากกว่าหลักหน่วยปัจจุบัน ให้แสดงเป็น เอ็ด แทน หนึ่ง
			} else if ( ( pos == 1 || pos == 7 ) && ch == '1' && lennum > count ){
				digit = "เอ็ด";
			}

			// สร้างหลักจากตำแหน่งของหลักที่พบ
			String last = number2[ tmp ];
			// ถ้าตัวเลขที่พบเป็น 0 และไม่ใช่หลักล้าน ไม่ให้แสดงอักษรของหลัก
			if ( ch == '0' && pos != 7 ) last = "";
			// เอาค่าที่หาได้มาต่อกับ str โดยต่อจากข้างหน้าไปเรื่อยๆ
			str = digit + last + str;
			// เพิ่มค่าหลักเลขที่เริ่มจากหน่วย(0) ถึง ล้าน(6)
			tmp++;
			
		}
		if( num == 0 )
			str = "ศูนย์";
		return str;
	}
	public static String readNum(Double num){

		java.text.NumberFormat df = NumberFormat.getNumberInstance();
		String nums = df.format(num).replaceAll(",", "");
		String str = "";
		if( nums.indexOf(".") < 0 ){
			str = convert(new Long(nums))+"บาทถ้วน";
		}else{
			long num1 = new Long(nums.substring(0,nums.indexOf(".")));
			String strNum2 = nums.substring(nums.indexOf(".")+1,nums.length());
			if( strNum2.length() == 1 ){
				strNum2 = strNum2+"0";
			}else if( strNum2.length() >= 2 ){
				strNum2 = strNum2.substring(0,2);
			}
			
			long num2 = new Long(strNum2); 
			if( num2 > 0 ){
				str = convert(num1)+"บาท";
				str += convert(num2)+"สตางค์";
			}else{
				str = convert(num1)+"บาทถ้วน";
			}
		}
		return str;
	}
	
	public static String getNumberFormat(Double num, int decimal, String valueIsZero) throws Exception{
		String ret = "";
		DecimalFormat numFormat;
		if(num != null){
			if(num == 0){
				ret = valueIsZero;
			}else{
				if (decimal == 0){
					numFormat = new DecimalFormat("#,##0");
					ret = numFormat.format(num);
				}else{
					String strFormat = "#,##0." + repeat('0',decimal);
					numFormat = new DecimalFormat(strFormat);
					ret = numFormat.format(num);
				}
			}
		}else{
			ret = valueIsZero;
		}
		return ret;
	}
	
	public static String repeat(char c,int i){
	    String tst = "";
	    for(int j = 0; j < i; j++){
	        tst = tst+c;
	    }
	    return tst;
	}
	
	public static void main(String args[]) throws Exception{
		System.out.println(readNum(92837928.98));
		//DecimalFormat f1 = new DecimalFormat("#,##0.00");
		//System.out.println(f1.format(123456.345));
		//String test = getNumberFormat(0d,10,"");
		//System.out.println(getNumberFormat(124.32,0,""));
		//StringBuffer sb = new StringBuffer();
		//System.out.println(repeat('0',10));
	}
	
}
