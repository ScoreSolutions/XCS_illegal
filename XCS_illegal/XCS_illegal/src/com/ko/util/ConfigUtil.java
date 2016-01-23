package com.ko.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.ko.domain.Sysconfig;

public class ConfigUtil {
	public static long getImageSize(DB db)throws Exception{
		Sysconfig sysconfig = new Sysconfig(db);
		sysconfig.setConfig_name("image_size");
		List<Sysconfig> lists = sysconfig.findByExample(sysconfig);
		long maxSize = Integer.parseInt(lists.get(0).getConfig_value())*1024;
		return maxSize;
	}
	

	public static String getConfig(String configName) throws Exception{
		String ret="";
		String sql = "select pke_master.getConfigValue('" + configName + "') configvalue from dual";
		PreparedStatement pre = null;
		DB db1 = new DB();
		pre = db1.getParameterizedStatement(sql, null);
		ResultSet rs = pre.executeQuery();
		if (rs.next())
			ret = rs.getObject("configvalue").toString();
		
		pre.close();
		db1.closedb();
		pre = null;
		db1 = null;
		
		return ret;
	}
	
	public static boolean setConfig(String configName, long configValue) throws Exception{
		boolean ret = false;
		String sql = "update sysconfig set config_value='" + configValue + "' where config_name = '" + configName + "'";
		PreparedStatement pre = null;
		DB db1 = new DB();
		pre = db1.getParameterizedStatement(sql, null);
		ret = (pre.executeUpdate() > 0 ? true : false);
		return ret;
	}
	
	public static void main(String[] args) throws Exception {
		/*DB db = new DB();
		System.out.println(ConfigUtil.getImageSize(db));*/
	}
}
