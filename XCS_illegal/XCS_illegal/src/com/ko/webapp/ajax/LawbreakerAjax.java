package com.ko.webapp.ajax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ko.domain.Lawbreaker;
import com.ko.domain.Suspect;
import com.ko.domain.Title;
import com.ko.domain.Race;
import com.ko.domain.Nationality;


public class LawbreakerAjax  extends BaseAjax{
//	 business method go here
	public Map<String,Object> getByIdCard(String type,String idCard){
		Map<String,Object> ret = null;
		try{
			Lawbreaker lawbreaker = new Lawbreaker(db);
			ret = lawbreaker.getByIdCard(type,idCard);
			if( ret != null ){
				System.out.println("from lawbreaker");
				return ret;
			}else{
				System.out.println("from suspect");
				Suspect suspect = new Suspect(db);
				return suspect.getByIdCard(type, idCard);
				//return new HashMap<String, Object>();
			}
		}catch (Exception e) {

			return new HashMap<String, Object>();
		}finally{
			closeDB();
		}
	}
	
	public Map<String,Object> getByLawbreakerID(String type,String lID){
		Map<String,Object> ret = null;
		
		try{
			if(type.equals("L")){  //ให้หาจากข้อมูลผู้กระทำผิด
				Lawbreaker lawbreaker = new Lawbreaker(db);
				ret = lawbreaker.getByLawbreakerID(lID);
			}else{  //ให้หาจากข้อมูลผู้ต้องสงสัย
				Suspect suspect = new Suspect(db);
				ret = suspect.getBySuspectID(lID);
			}
		}catch (Exception e) {
			ret = new HashMap<String, Object>();
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public List getRaceList(){
		List result = new ArrayList();
		try{
			Race r = new Race(db);
			String sql = "select id , race_name from race order by race_name";
			result = r.findBySql(sql);
		}
		catch(Exception e){}
		finally{
			closeDB();
		}
		
		return result;
	}
	
	public List getNationalityList(){
		List result = new ArrayList();
		try{
			Nationality n = new Nationality(db);
			String sql = "select id , nation_name from nationality where active='1' order by nation_name";
			result = n.findBySql(sql);
		}
		catch(Exception e){}
		finally{
			closeDB();
		}
		
		return result;
	}
	
	public List getTitleList(){
		List result = new ArrayList();
		try{
			Title t = new Title(db);
			String sql = "select title_code , title_name from title order by title_name";
			result = t.findBySql(sql);
		}
		catch(Exception e){}
		finally{
			closeDB();
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(new LawbreakerAjax().getByIdCard("1","1333399900028"));

			
	}

	

}
