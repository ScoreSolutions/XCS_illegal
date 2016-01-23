package com.ko.webapp.ajax;

import java.util.List;

import com.ko.domain.Staff;

public class OtherStaffListAjax extends BaseAjax{
	public Boolean CheckIDcardNO(String idCard){
		try{
			Staff st = new Staff(db);
			//st = st.findByWhere(Staff.IDCARD_NOCol+"=?", idCard).get(0);
			if(st.findByWhere(Staff.IDCARD_NOCol+"=?", idCard).size() != 0){
				return true;
			}else{
				return false;
			}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		finally{
			closeDB();
		}
	}
	public static void main(String[] args) {
		System.out.println(new OtherStaffListAjax().CheckIDcardNO("3509900364597"));

			
	}
}
