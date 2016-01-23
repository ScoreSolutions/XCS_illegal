package com.ko.webapp.ajax;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.ko.util.*;

public class ReportsAjax extends BaseAjax{
	public String ReportUrl(){
		String ret = "";
		try{
			String useReport = ConfigUtil.getConfig("UseCrystalReport");
			if (useReport.equals("Y")){
				ret=ConfigUtil.getConfig("CrystalReportURL");
			}else{
				ret="";
			}				
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return ret;
	}
}
