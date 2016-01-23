package com.ko.domain.base;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

import com.ko.util.DB;
import com.ko.util.ReflectionUtil;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.vo.BaseVo;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public abstract class BaseDomain {

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
    	db = this.initDB();
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
			//db.closedb();
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
    
    public List<BaseVo> findBySql2(String sql,Object obj,BaseVo baseVo)throws Exception{
    	return findBySql2(sql,new Object[]{obj},baseVo);
    }
    public List<BaseVo> findBySql2(String sql,Object[] objs,BaseVo baseVo)throws Exception{
    	return findBySql2(sql,objs,baseVo,null);
    }
    public List<BaseVo> findBySql2(String sql,Object[] objs,BaseVo baseVo,PageUtil pageUtil)throws Exception{
    	DB db = this.initDB();
		List<BaseVo>resultList = new ArrayList<BaseVo>();
		try{
			if( pageUtil == null ){
				prep = db.getParameterizedStatement(sql, objs);
				rs = prep.executeQuery();
			}else{
				prep = db.getPagination(sql, objs, pageUtil.getPage(), pageUtil.getPageSize());
				rs = prep.executeQuery();
			}
			while(rs.next()){
				Object obj = ReflectionUtil.getClassInstance(baseVo.getClass().getName());
				DB.bindResultSetToObject(rs, obj);
				resultList.add((BaseVo)obj);
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return resultList;
    }
    public Integer countBySql(String sql)throws Exception{
    	return countBySql(sql,null);
    }
    public Integer countBySql(String sql,Object obj)throws Exception{
    	return countBySql(sql,new Object[]{obj});
    }
	public Integer countBySql(String sql,Object[] objs)throws Exception{
		db = this.initDB();
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

	public abstract FormValidator validate();

	/*
	//  **** create  ****
	public void create()throws Exception{
		Object result = null;
		DB db = this.initDB();
		try{
			$obj = this.toArray();
			$obj[this.pkCol] = db->getSequnceId(this.tableName);
			$result = db->add_db(this.tableName,$obj);
			if( $result >0 )
				this.populate($obj);
		}catch(Exception e){
			this.closeDB(db);
			throw e;// rethrow it
		}
		this.closeDB(db);
		return ( $result>0 )?$this:null;
	}
	public void createList($objList){
		$resultList = array();
		db = new DB();
		try{
			db.beginTx();
			for($i=0;$i<count($objList);$i++){
				$class_name =get_class($this);
				$obj = new $class_name(db);
				$obj->populate($objList[$i]);
				$obj->create();
				$resultList[$i] = $obj;
			}
			db.commitTx();
		}catch(Exception e){
			db.rollbackTx();
			db.closedb();
			throw e;// rethrow it
		}
		db.closedb();
		return $resultList;
	}
	// **** retrieve  ****
	public Integer countAll(PageUtil pageUtil) {
		if( pageUtil == null ){
			return this.countByWhere("");
		}else{
			return this.countByWhere("",pageUtil);
		}
	}
	public Integer countByWhere(String where){
		DB db = this.initDB();
		try{
			$rs = db.select_query(this.sqlCount,$where);
			$row = db.fecth_array($rs);
		}catch(Exception e){
			this.closeDB(db);
			throw e;// rethrow it
		}
		this.closeDB(db);
		return $row[0];
	}
	public void findByPk($id){
		$resultList=this.findByWhere( "this.pkCol=".tosql($id,"Number") );
		return ( count($resultList)==1 )?$resultList[0]:null;
	}
	public void findByPks($ids){
		$resultList = array();
		for($i=0 ; $i<count($ids); $i++)
			$resultList[$i]= this.findByPk($ids[$i]);
		return $resultList;
	}
	public void findAll(PageUtil pageUtil){
		if( pageUtil=="" ){
			return this.findByWhere("");
		}else{
			return this.findByWhere("",pageUtil);
		}
	}
	public void findByWhere(String where,PageUtil pageUtil){
		db = this.initDB();
		$resultList = array();
		try{
			$sql = this.sqlSelect;
			if($where!="" ){
				$sql .=" where ".$where;
			}
			if( pageUtil!="" ){
				$sql = this.appendPaging($sql,pageUtil,this.tableName);
			}
			$rs = db.select_query($sql);
			for($i=0; $row = db.fetch($rs); $i++){
				$class_name = get_class($this);
				$obj = new $class_name();
				$obj->populate($row);
	       		$resultList[$i] = $obj;
			}
		}catch(Exception e){
			this.closeDB(db);
			throw e;// rethrow it
		}
		this.closeDB(db);
       	return $resultList;
	}
	public void searchAll(String keyword,pageUtil=""){
		$where = str_replace("?","'%$keyword%'",this.sqlSearchWhere);
		return this.findByWhere($where,pageUtil);
	}
	public void countSearchAll($keyword){
		$where = str_replace("?","'%$keyword%'",this.sqlSearchWhere);
		return this.countByWhere($where);
	}


	// **** update  ****
	public void update(){
		db = this.initDB();
		$rows = 0;
		try{
			$obj = this.toArray();
			$id = $obj[this.pkCol];
			unset($obj[this.pkCol]);
			$where = " this.pkCol=".tosql($id,"Number")." ";
			if( array_key_exists("rec_version",$obj) ){
				//optimistic locking
				$where .=" and rec_version = ".$obj["rec_version"];// where version = oldVersion
				$obj["rec_version"] = $obj["rec_version"]+1;// set version = Oldversion +1
			}
			$rows = db.update_db(this.tableName,$obj,$where);
			if( $rows > 0 ){
				$obj[this.pkCol] = $id;
				this.populate($obj);
			}
		}catch(Exception e){
			this.closeDB(db);
			throw e;// rethrow it
		}
		this.closeDB(db);
		return ($rows>0)?$this:null;
	}
	public void updateList($objList){
		$resultList = array();
		db = new DB();
		try{
			db.beginTx();
			for($i=0;$i<count($objList);$i++){
				$class_name =get_class($this);
				$obj = new $class_name(db);
				$obj->populate($objList[$i]);
				$obj->update();
				$resultList[$i] = $obj;
			}
			db.commitTx();
		}catch(Exception e){
			db.rollbackTx();
			throw e;// rethrow it
		}
		db.closeDB();
		return $resultList;
	}
	//delete
	public void delete(){
		$obj = this.toArray();
		$id = $obj[this.pkCol];
		return this.deleteByWhere("this.pkCol=".tosql($id,"Number"));
	}
	public void deleteList($objList){
		$ids = array();
		$i=0;
		foreach($objList as $obj)
			$ids[$i++]=$obj[this.pkCol];
		return this.deleteByPks($ids);
	}
	public void deleteAll(){
		return this.deleteByWhere("");
	}
	public void deleteByPk($id){
		return this.deleteByWhere("this.pkCol=".tosql($id,"Number"));
	}
	public void deleteByPks($ids){
		if( count($ids)>0 ){
			$str = arrayToSet($ids);
			return this->deleteByWhere("this->pkCol in $str ");
		}else
			return 0;
	}
	public void deleteByWhere(String where){
		db = this.initDB();
		$result = null;
		try{
			$result = db.del(this.tableName,$where);
		}catch(Exception e){
			this.closeDB(db);
			throw e;// rethrow it
		}
		this.closeDB(db);
		return $result;
	}*/
}
