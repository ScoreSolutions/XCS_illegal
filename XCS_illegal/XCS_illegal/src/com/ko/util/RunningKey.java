package com.ko.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ko.domain.Running;

public class RunningKey {
	private String TbName;
	private String FieldType;
	private String FieldValue;
	private String VOffcode;
	private Running running;
	public RunningKey(DB db){
		this.running = new Running(db);
	}
	public void setTbName(String tbName) {
		this.TbName = tbName;
	}


	public void setFieldType(String fieldType) {
		this.FieldType = fieldType;
	}


	public void setFieldValue(String fieldValue) {
		this.FieldValue = FieldValue;
	}


	public void setVOffcode(String vOffcode) {
		this.VOffcode = vOffcode;
	}

	public String Key;

	public String getRunningKey(String tbName ,String fieldType,String fieldValue,String vOffcode ) throws Exception{
		String result  = "";
		//Running running = new Running();
		String where = " tbname = ? and nvl(fieldType,'#') = nvl(?,'#') and nvl(fieldvalue,'#')=nvl(?,'#') ";
		Object[] objs = new Object[]{tbName,fieldType,fieldValue};
		List<Running> runnings = running.findByWhere(where,objs);

		if( runnings.size() > 0 ){
			running = (Running)runnings.get(0);

			String vCode  = "";
			if(running.getCode() != null )
				vCode =  running.getCode();
            int codeLength = vCode.length();

            String isOffcode = "";
            if(running.getIsoffcode() != null )
            	isOffcode =  running.getIsoffcode();
            int OffcodeLength = vOffcode.length();

            String vMonth ="";
            if(running.getMonth() != null )
            	vMonth = getMonth();
            int monthLength = vMonth.length();

            String  vYear = "";
            if(running.getYear() != null )
            	vYear = getYear(running.getYear().length());
            int yearLength = vYear.length();


            int vLength = running.getLength().intValue();

            String vRunningField = running.getRunningfield();
            int allLength  = 1;

            setMonthYear(tbName, yearLength, monthLength, fieldType, fieldValue);

            String sqlR = "select max(" + vRunningField + ") track_no";
            sqlR += " from " + tbName;
            sqlR += " where 1=1 ";

            List<Object> objList = new ArrayList<Object>();
            if (vCode != ""){
    			sqlR += " and substr(" + vRunningField + "," + allLength + "," + codeLength + ") = ? ";
                allLength = allLength + codeLength;
                objList.add(vCode);
    		}

            if(fieldType != "" && fieldValue != ""){
           	 	sqlR += " and " + fieldType + " = ? ";
           	 	objList.add(fieldValue);
             }


           if(isOffcode.equals("Y")){
        	   sqlR += " and substr(" + vRunningField + "," + allLength + "," + OffcodeLength + ")= ? ";
               allLength = allLength + OffcodeLength;
               objList.add(vOffcode);
           }else{
               vOffcode = "";
           }

           if(vYear != "" ){
           		sqlR += " and substr(" + vRunningField + "," + allLength + "," + yearLength + ") = ? ";
           		allLength = allLength + yearLength;
           		objList.add(vYear);
           }

           if(vMonth != ""){
           		//running.put("allLength4",allLength);
           		sqlR += " and substr(" + vRunningField + "," + allLength + "," + monthLength + ") = ? ";
           		allLength = allLength + monthLength;
           		objList.add(vMonth);
           }

           sqlR += " and length(substr(" + vRunningField + "," + allLength + "))= ? " ;
           objList.add(vLength);

           List list = running.findBySql( sqlR, objList.toArray());
           Map result2 = (Map)list.get(0);
           String max_track_no ="";
           if( result2 != null ){
        	   max_track_no = (String)result2.get("track_no");
           }
/*

           running.put("allLength5",allLength);
           System.out.println("allLength1 = "+running.get("allLength1"));
           System.out.println("allLength2 = "+running.get("allLength2"));
           System.out.println("allLength3 = "+running.get("allLength3"));
           System.out.println("allLength4 = "+running.get("allLength4"));
           System.out.println("allLength5 = "+running.get("allLength5"));

           running.put("tbname",tbName);
           System.out.println("tbName = "+tbName);

           running.put("vRunningField",vRunningField);
           System.out.println("vRunningField = "+vRunningField);

           running.put("isoffcode",isOffcode);
           System.out.println("isoffcode = "+isOffcode);

           running.put("vCode",vCode);
           System.out.println("vCode = "+vCode);
           running.put("codeLength",codeLength);
           System.out.println("codeLength = "+codeLength);
           running.put("fieldType",fieldType);
           System.out.println("fieldType = "+fieldType);
           running.put("fieldValue",fieldValue);
           System.out.println("fieldValue = "+fieldValue);
           running.put("OffcodeLength",OffcodeLength);
           System.out.println("OffcodeLength = "+OffcodeLength);
           running.put("vOffcode",vOffcode);
           System.out.println("vOffcode = "+vOffcode);
           running.put("yearLength",yearLength);
           System.out.println("yearLength = "+yearLength);
           running.put("vYear",vYear);
           System.out.println("vYear = "+vYear);
           running.put("monthLength",monthLength);
           System.out.println("monthLength = "+monthLength);
           running.put("vMonth",vMonth);
           System.out.println("vMonth = "+vMonth);
           running.put("vLength",vLength);
           System.out.println(" vLength = "+vLength);
           HashMap<String,Object> max = (HashMap<String,Object>) util.selectObject(running, "00_Custom_RunningKey.getMaxKey");
           System.out.println("track_no = "+max.get("track_no"));*/

           int vRunNo ;
           String vRunning = "";
           // if(max.get("track_no")!=null){
           if(max_track_no != null){
           	 // vRunNo = Integer.parseInt(max.get("track_no").toString().substring(max.get("track_no").toString().length()-vLength)) + 1;
           	  vRunNo = Integer.parseInt(max_track_no.substring(max_track_no.length()-vLength)) + 1;
           	 // System.out.println(" vRunNo = "+ vRunNo);
           }else{
           	 vRunNo = 1;
           }

           vRunning =  "000000000000000000000000000000000000".substring(0,vLength - String.valueOf((vRunNo)).length())+vRunNo;
           result = vCode + vOffcode + vYear + vMonth + vRunning;

			return result;
		}else
			return "ไม่พบค่า Running ตามที่กำหนด";
	}
	private String getMonth() throws Exception{
		//Running running = new Running();
		String sql = "select to_char(sysdate,'MM') vMonth from dual";
		Map result = running.findBySqlOneResult(sql);
		return (String)result.get("vmonth");
	}
	private  String getYear(int vLength) throws Exception {
		String sql = "";
		if(vLength == 2){
			 sql = "select to_char(sysdate,'YY', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') vYear from dual";
		 }else if(vLength == 4){
			 sql = "select to_char(sysdate,'YYYY', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') vYear from dual";
		 }
		//Running running = new Running();
		Map result = running.findBySqlOneResult(sql);
		return (String)result.get("vyear");
	}
	private  void setMonthYear(String tbName,int yearLength,int monthLength, String fieldType , String fieldValue)throws Exception {
		 //Running running = new Running();
		 String sql = "update running ";
		 sql += " set month=to_char(sysdate,'"+strDup(monthLength, "M") +"') , ";
		 sql += " year=to_char(sysdate,'"+ strDup(yearLength, "Y") +"', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') ";
		 sql += " where tbname= ? and nvl(fieldtype,'#')=nvl(?,'#') and nvl(fieldvalue,'#')=nvl(?,'#')";
		 running.executeUpdate(sql,new Object[]{tbName,fieldType,fieldValue});
	}
	private static String strDup(int num,String str){
		String result ="";
		for( int i=0;i<num; i++ )
			result +=str;
		return result;
	}
	public static void main(String args[]) throws Exception{
		DB db = new DB();
		String key =new RunningKey(db).getRunningKey("APPLICATION_ARREST", "", "", "100100");
		System.out.println("Running Key = "+key);
		//System.out.println(RunningKey.getYear(4));
		//System.out.println(RunningKey.getMonth());
	}
}