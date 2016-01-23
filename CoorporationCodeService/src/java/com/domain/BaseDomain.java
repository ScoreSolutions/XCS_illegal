package com.domain;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

import com.util.DB;
//import com.util.ReflectionUtil;
//import com.ko.webapp.util.FormValidator;
import com.util.PageUtil;
//import com.ko.webapp.vo.BaseVo;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public  class BaseDomain {

	protected DB db = null;
	protected PreparedStatement prep = null;
	protected ResultSet rs = null;
	protected Set<String> dirtyCols = new HashSet<String>();
	public BaseDomain(DB db){
		this.db = db;
	}

	public int getFirstResult(int page,int pageSize) {
		return (page - 1) * pageSize;
	}
    protected DB initDB()throws Exception{
    	if( this.db == null ){
    		return new DB();// not controll transaction from outside
    	}else
    		return this.db;// use transaction from outside
    }
    protected void closeDB(DB db)throws Exception{
    	if( this.prep!=null ){
    		this.prep.close();
    		this.prep = null;
    		//System.out.println("close prep");
    	}
    	if( this.rs!=null ){
    		this.rs.close();
    		this.rs = null;
    		//System.out.println("close rs");
    	}
    	
    	try{
    		if( db == null ){
    			this.db.closedb();
    			this.db = null;
    			System.out.println("CloseDB");
    		}
    	}catch(Exception e){
    		throw e;
    	}
    }
    protected void beginTx(DB db)throws Exception{
    	/*try{
			if( this.db == null )
				db.beginTx();
    	}catch(Exception e){
    		throw e;
    	}*/
    }
    protected void commitTx(DB db)throws Exception{
    	/*try{
	    	if( this.db == null )
	    		db.commitTx();
    	}catch(Exception e){
    		throw e;
    	}*/
    }
    protected void rollbackTx(DB db)throws Exception{
    	/*try{
	    	if( this.db == null )
	    		db.rollbackTx();
    	}catch(Exception e){
    		throw e;
    	}*/
    }

    /*** findBySql ***/
    public Object findBySqlSingleResult(String sql)throws Exception{
    	return findBySqlSingleResult(sql,null);
    }
    public Object findBySqlSingleResult(String sql,Object obj)throws Exception{
    	return findBySqlSingleResult(sql,new Object[]{obj});
    }
    public Object findBySqlSingleResult(String sql,Object[] objs)throws Exception{
    	Map<String,Object> result = this.findBySqlOneResult(sql,objs);
    	if( result.keySet().iterator().hasNext() )
    		return result.get(result.keySet().iterator().next()); 
    	else
    		return null;
    }
    
    public Map<String,Object> findBySqlOneResult(String sql)throws Exception{
    	return findBySqlOneResult(sql,null);
    }
    public Map<String,Object> findBySqlOneResult(String sql,Object obj)throws Exception{
    	return findBySqlOneResult(sql,new Object[]{obj});
    }
    public Map<String,Object> findBySqlOneResult(String sql,Object[] objs)throws Exception{
    	List<Map<String,Object>> list = findBySql(sql,objs);
    	return ( list.size()>0 && list.get(0) != null)?(Map<String,Object>)list.get(0):new HashMap<String,Object>();
    }
    
    public List<Map<String, Object>> findBySql(String sql)throws Exception{
    	return this.findBySql(sql,null);
    }
    public List<Map<String, Object>> findBySql(String sql,Object obj)throws Exception{
    	return this.findBySql(sql,new Object[]{obj});
    }
    public List<Map<String, Object>> findBySql(String sql,Object[] objs)throws Exception{
		return this.findBySql(sql,objs,null);
	}
    public List<Map<String, Object>> findBySql(String sql,Object[] objs,PageUtil pageUtil)throws Exception{
    	DB db = this.initDB();
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		try{
			if( pageUtil == null ){
				prep = db.getParameterizedStatement(sql, objs);
				rs = prep.executeQuery();
			}else{
				prep = db.getPagination(sql, objs, pageUtil.getPage(), pageUtil.getPageSize());
				rs = prep.executeQuery();
			}
			result = db.toArray(rs);
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return result;
    }
    public ArrayList<HashMap<String,Object>> findToArrayList(String sql)throws Exception{
    	DB db = this.initDB();
    	ArrayList<HashMap<String,Object>> result = new ArrayList<HashMap<String,Object>>();
    	try{

			prep = db.getParameterizedStatement(sql, null);
			rs = prep.executeQuery();
			
			result = db.toArrayList(rs);
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
    	
    	return result;
    }
    
    public Integer countBySql(String sql)throws Exception{
    	return countBySql(sql,null);
    }
    public Integer countBySql(String sql,Object obj)throws Exception{
    	return countBySql(sql,new Object[]{obj});
    }
	public Integer countBySql(String sql,Object[] objs)throws Exception{
		DB db = this.initDB();
		Integer result = 0;
		try{
			prep = db.getParameterizedStatement(sql, objs);
			rs = prep.executeQuery();
			if( rs.next() )
				result = rs.getInt(1);
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return result;
	}
	public Integer executeUpdate(String sql)throws Exception{
		return executeUpdate(sql,null);
	}
	public Integer executeUpdate(String sql,Object obj)throws Exception{
		return executeUpdate(sql,new Object[]{obj});
	}
	public Integer executeUpdate(String sql,Object[] objs)throws Exception{
		DB db = this.initDB();
		try{
			prep = db.getParameterizedStatement(sql, objs);
			return prep.executeUpdate();
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
	}

	
}
