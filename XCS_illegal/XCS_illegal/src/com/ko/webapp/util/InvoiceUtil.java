package com.ko.webapp.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ko.domain.Running;
import com.ko.util.DB;
import com.ko.util.RunningKey;
import com.ko.webapp.action.BaseAction;

/**
 * Created by IntelliJ IDEA.
 * User: ammmoho
 * Date: 30 พ.ค. 2553
 * Time: 17:17:45
 * To change this template use File | Settings | File Templates.
 */
public class InvoiceUtil {
    private String offcode;

    public InvoiceUtil(String offcode){
        this.offcode = offcode;
    }
    public InvoiceUtil(){

    }
    public String getOffcode() {
        return offcode;
    }

    public void setOffcode(String offcode) {
        this.offcode = offcode;
    }

    public String getInvoiceKey(){
        try {
            return new RunningKey(new DB()).getRunningKey("V_RUNNING_INVCODE","","",offcode);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    
    public List<Map<String,Object>> getRunInvPayFine(com.ko.util.DB db, List<Map<String,Object>> aallist) throws Exception{
    	Running running = new Running(db);
        String rSql = " select * from running where tbname='V_RUNNING_INVCODE' and isoffcode='Y'";
		List<Map<String,Object>> lRun = running.findBySql(rSql);
		int vRunInvNum;
		String vRunInvCode = new RunningKey(db).getRunningKey("V_RUNNING_INVCODE", "", "", offcode);
		
        for(int i =0;i<aallist.size();i++){
        	//if(aallist.get(i).get("paid_time_off").equals("N")){
    		if(aallist.get(i).get("invcode") == null){
    			Map<String, Object> data = new HashMap<String, Object>();
    			data.put("id", aallist.get(i).get("id").toString());
    			data.put("lawbreaker_name", (aallist.get(i).get("lawbreaker_name") != null ? aallist.get(i).get("lawbreaker_name").toString() : ""));
    			data.put("fine", (aallist.get(i).get("fine") != null ? aallist.get(i).get("fine").toString() : ""));
    			data.put("paper_no", (aallist.get(i).get("paper_no") != null ? aallist.get(i).get("paper_no").toString() : ""));
    			data.put("iscancel", (aallist.get(i).get("iscancel") != null ? aallist.get(i).get("iscancel").toString() : ""));
    			data.put("book_no", (aallist.get(i).get("book_no") != null ? aallist.get(i).get("book_no").toString() : ""));
    			data.put("inv_no", (aallist.get(i).get("inv_no") != null ? aallist.get(i).get("inv_no").toString() : ""));
    			
    			if(i < 1){//รายการแรก
    				data.put("invcode",vRunInvCode);
    			}else{//รายการที่สองเป็นต้นไป
    				//System.out.println(vRunInvCode.length() + " $$$$ " + Integer.parseInt(lRun.get(0).get("length").toString()));
    				int rLen = Integer.parseInt(lRun.get(0).get("length").toString());
    				vRunInvNum = Integer.parseInt(vRunInvCode.substring(vRunInvCode.length() - rLen)) + 1;
    				
    				//vRunInvCode.Substring(0, Len(vRunInvCode) - Convert.ToInt64(dt.Rows(0)("length"))) & vRunInvNum.ToString().PadLeft(Convert.ToInt64(dt.Rows(0)("length")), "0")
    				String lpadStr = "0000000000000000000000000000000000000" + vRunInvNum;
    				String lpadNo = lpadStr.substring(lpadStr.length() - rLen);
    				vRunInvCode = vRunInvCode.substring(0, vRunInvCode.length() - Integer.parseInt(lRun.get(0).get("length").toString())) + lpadNo;
    				data.put("invcode",vRunInvCode);
    			}
    			
				//System.out.println("vRunInvCode = " + vRunInvCode);
				aallist.set(i, data);
        	}
        }
        return aallist;
    }
    
    public List<Map<String,Object>> getRunInvCompareChange(com.ko.util.DB db, List<Map<String,Object>> ccilist) throws Exception{
    	Running running = new Running(db);
        String rSql = " select * from running where tbname='V_RUNNING_INVCODE' and isoffcode='Y'";
		List<Map<String,Object>> lRun = running.findBySql(rSql);
		int vRunInvNum;
		String vRunInvCode = new RunningKey(db).getRunningKey("V_RUNNING_INVCODE", "", "", offcode);
		
        for(int i =0;i<ccilist.size();i++){
        	//if(aallist.get(i).get("paid_time_off").equals("N")){
    		if(ccilist.get(i).get("invcode") == null){
    			Map<String, Object> data = new HashMap<String, Object>();
    			data.put("id", (ccilist.get(i).get("id") != null ? ccilist.get(i).get("id").toString() : ""));
    			data.put("lawbreaker_name", (ccilist.get(i).get("lawbreaker_name") != null ? ccilist.get(i).get("lawbreaker_name").toString() : ""));
    			data.put("application_arrest_lawbreaker",(ccilist.get(i).get("application_arrest_lawbreaker") != null ? ccilist.get(i).get("application_arrest_lawbreaker").toString() : ""));
    			data.put("fine", (ccilist.get(i).get("fine") != null ? ccilist.get(i).get("fine").toString() : ""));
    			data.put("paper_no", (ccilist.get(i).get("paper_no") != null ? ccilist.get(i).get("paper_no").toString() : ""));
    			data.put("book_no", (ccilist.get(i).get("book_no") != null ? ccilist.get(i).get("book_no").toString() : ""));
    			data.put("inv_no", (ccilist.get(i).get("inv_no") != null ? ccilist.get(i).get("inv_no").toString() : ""));
    			data.put("old_invcode", (ccilist.get(i).get("old_invcode") != null ? ccilist.get(i).get("old_invcode").toString() : ""));
    			data.put("old_book_no", (ccilist.get(i).get("old_book_no") != null ? ccilist.get(i).get("old_book_no").toString() : ""));
    			data.put("old_inv_no", (ccilist.get(i).get("old_inv_no") != null ? ccilist.get(i).get("old_inv_no").toString() : ""));
    			
    			if(i < 1){//รายการแรก
    				data.put("invcode",vRunInvCode);
    			}else{//รายการที่สองเป็นต้นไป
    				//System.out.println(vRunInvCode.length() + " $$$$ " + Integer.parseInt(lRun.get(0).get("length").toString()));
    				int rLen = Integer.parseInt(lRun.get(0).get("length").toString());
    				vRunInvNum = Integer.parseInt(vRunInvCode.substring(vRunInvCode.length() - rLen)) + 1;
    				
    				//vRunInvCode.Substring(0, Len(vRunInvCode) - Convert.ToInt64(dt.Rows(0)("length"))) & vRunInvNum.ToString().PadLeft(Convert.ToInt64(dt.Rows(0)("length")), "0")
    				String lpadStr = "0000000000000000000000000000000000000" + vRunInvNum;
    				String lpadNo = lpadStr.substring(lpadStr.length() - rLen);
    				vRunInvCode = vRunInvCode.substring(0, vRunInvCode.length() - Integer.parseInt(lRun.get(0).get("length").toString())) + lpadNo;
    				data.put("invcode",vRunInvCode);
    			}
    			
				//System.out.println("vRunInvCode = " + vRunInvCode);
				ccilist.set(i, data);
        	}
        }
        return ccilist;
    }
}
