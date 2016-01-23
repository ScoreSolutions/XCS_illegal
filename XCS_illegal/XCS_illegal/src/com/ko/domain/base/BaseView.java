package com.ko.domain.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseView extends BaseDomain{
	public String viewName;
	public final String SQL_SELECT = " select * from ";
    public final String SQL_COUNT  = " select count(*) from ";
    public BaseView(){
		super(null);
	}
	public BaseView(DB db){
		super(db);
	}
	public Integer countAll() throws Exception{
		return countByWhere(null,null);
	}
	public Integer countByWhere(String where,Object obj)throws Exception{
		return countByWhere(where,new Object[]{obj});
	}
	public Integer countByWhere(String where,Object[] objs)throws Exception{
		DB db = this.initDB();
		Integer result = null;
		try {
			prep = db.getParameterizedStatement( db.appendWhere(this.SQL_COUNT+viewName, where),objs);
			rs = prep.executeQuery();
			if( rs.next() )
				result = rs.getInt(1);
		} catch (Exception e) {
			throw e;
		}finally{
			this.closeDB(db);
		}
		return result;
	}
	public List<Map<String, Object>> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<Map<String, Object>> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<Map<String, Object>> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<Map<String, Object>> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<Map<String, Object>> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<Map<String, Object>> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		db = this.initDB();
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		try{
			if( pageUtil == null ){
				prep = db.getParameterizedStatement(db.appendWhere(this.SQL_SELECT+viewName , where), objs);
				rs = prep.executeQuery();
				resultList = db.toArray(rs);
			}else{
				String sql = db.appendWhere(this.SQL_SELECT+viewName, where);// build sql
				prep = db.getPagination(sql, objs, pageUtil.getPage(), pageUtil.getPageSize());
				rs = prep.executeQuery();
				resultList = db.toArray(rs);
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return resultList;
	}

	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public FormValidator validate() {
		// TODO Auto-generated method stub
		return null;
	}


}
