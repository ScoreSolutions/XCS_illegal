package com.ko.util;

import java.util.List;

import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.MethodUtils;

import com.ko.domain.Country;
import com.ko.domain.District;
import com.ko.domain.DutyGroup;
import com.ko.domain.DutyTable;
import com.ko.domain.EdOffice;
import com.ko.domain.Province;
import com.ko.domain.Subdistrict;
import com.ko.domain.Sysconfig;
import com.ko.domain.Title;
import com.ko.domain.Unit;
import com.opensymphony.oscache.base.NeedsRefreshException;
import com.opensymphony.oscache.general.GeneralCacheAdministrator;

public class CacheObject {
	private static GeneralCacheAdministrator admin = new GeneralCacheAdministrator();
	private static List getAllObject(Class clz){
		List objList = null;
		String key = clz.getName();
		DB db = null;
		try {
			objList = (List) admin.getFromCache(key);
		} catch (NeedsRefreshException nre) {
			try {
		        // Get the value (probably from the database)
				db = new DB();
				Object obj = ConstructorUtils.invokeConstructor(clz, db);				
				objList = (List)MethodUtils.invokeMethod(obj,"findAll",null);
				
		        // Store in the cache
		        admin.putInCache(key, objList);
		    } catch (Exception ex) {
		        // We have the current content if we want fail-over.
		    	objList = (List) nre.getCacheContent();
		        // It is essential that cancelUpdate is called if the
		        // cached content is not rebuilt
		        admin.cancelUpdate(key);
		    }finally{
		    	try {
					db.closedb();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
		return objList;
	}
	public static List<Country> getAllCountry(){
		return (List<Country>)getAllObject(Country.class);
	}
	public static List<District> getAllDistrict(){
		return (List<District>)getAllObject(District.class);
	}
	public static List<DutyGroup> getAllDutyGroup(){
		return (List<DutyGroup>)getAllObject(DutyGroup.class);
	}
	public static List<DutyTable> getAllDutyTable(){
		return (List<DutyTable>)getAllObject(DutyTable.class);
	}
	public static List<EdOffice> getAllEdOffice(){
		return (List<EdOffice>)getAllObject(EdOffice.class);
	}
	public static List<Province> getAllProvince(){
		return (List<Province>)getAllObject(Province.class);
	}
	public static List<Subdistrict> getAllSubDistrict(){
		return (List<Subdistrict>)getAllObject(Subdistrict.class);
	}
	public static List<Title> getAllTitle(){
		return (List<Title>)getAllObject(Title.class);
	}
	public static List<Unit> getAllUnit(){
		return (List<Unit>)getAllObject(Unit.class);
	}
	public static List<Sysconfig> getAllSysConfig(){
		return (List<Sysconfig>)getAllObject(Sysconfig.class);
	}
	public static void removeCache(Class clz){
		admin.removeEntry(clz.getName());
	}
	public static void main(String[] args) {
		/*System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		CacheObject.removeCache(DutyTable.class);
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());
		System.out.println(CacheObject.getAllDutyTable().size());*/
		
	}
}