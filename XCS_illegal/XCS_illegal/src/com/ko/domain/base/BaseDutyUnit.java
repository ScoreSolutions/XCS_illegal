package com.ko.domain.base;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.ko.domain.DutyUnit;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseDutyUnit extends BaseDomain{
	// table
	public static final String TABLE_NAME = "DUTY_UNIT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "DUTY_UNIT.ID";

	// short name column
	public static final String DATA_SOURCECol = "DATA_SOURCE";
	
	public static final String GROUP_IDCol = "GROUP_ID";
	
	public static final String UPD_DATECol = "UPD_DATE";
	
	public static final String UPD_USERIDCol = "UPD_USERID";
	
	public static final String END_DATECol = "END_DATE";
	
	public static final String BEGIN_DATECol = "BEGIN_DATE";
	
	public static final String USED_FORCol = "USED_FOR";
	
	public static final String UNIT_CODECol = "UNIT_CODE";
	
	public static final String IDCol = "ID";
	
	// full column name
	public static final String DATA_SOURCEColumn = "DUTY_UNIT.DATA_SOURCE";
	
	public static final String GROUP_IDColumn = "DUTY_UNIT.GROUP_ID";
	
	public static final String UPD_DATEColumn = "DUTY_UNIT.UPD_DATE";
	
	public static final String UPD_USERIDColumn = "DUTY_UNIT.UPD_USERID";
	
	public static final String END_DATEColumn = "DUTY_UNIT.END_DATE";
	
	public static final String BEGIN_DATEColumn = "DUTY_UNIT.BEGIN_DATE";
	
	public static final String USED_FORColumn = "DUTY_UNIT.USED_FOR";
	
	public static final String UNIT_CODEColumn = "DUTY_UNIT.UNIT_CODE";
	
	public static final String IDColumn = "DUTY_UNIT.ID";
	
	public static final String[] ALL_COLUMNS =
    {
		DATA_SOURCECol, GROUP_IDCol, UPD_DATECol	, UPD_USERIDCol	, END_DATECol	, BEGIN_DATECol	, USED_FORCol , UNIT_CODECol	,  pkCol
    };

	public static final String ALL_COLUMN_STRING =  DATA_SOURCECol + "," + GROUP_IDCol + "," + UPD_DATECol	+ "," + UPD_USERIDCol	+ "," + END_DATECol	+ "," + USED_FORCol + "," + BEGIN_DATECol	+ "," + UNIT_CODECol	+ "," +   pkCol;
	
	public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseDutyUnit(DB db){
		super(db);
	}
	

	public synchronized DutyUnit create() throws Exception{
			DB db = this.initDB();
			try{
				String columns = "(";
				String parameter = "(";
				List<Object> objList = new ArrayList<Object>();
				for(int i=0;i<ALL_COLUMNS.length;i++){
					if( ALL_COLUMNS[i]!= pkCol ){
						Object value = PropertyUtils.getProperty(this, ALL_COLUMNS[i].toLowerCase());
						if( value!=null ){
							columns+=ALL_COLUMNS[i]+",";
							parameter+="?,";
							objList.add(value);
						}
					}
				}
				String sql_insert=SQL_INSERT+columns+pkCol+") values "+parameter+SEQUENCE_NAME+".nextVal)";
				//System.out.println("sql-->"+sql_insert);
				//System.out.println(objList);

				prep = db.getParameterizedStatement(sql_insert, objList.toArray());
				//logger.debug(SQL_INSERT);
				if( prep.executeUpdate() == 1 ){
					prep = db.getParameterizedStatement(db.getIdentityString(SEQUENCE_NAME), null);
					rs = prep.executeQuery();
					if( rs.next() ){
		 				this.id = new Long(rs.getString(1));
						return (DutyUnit)this;
					}
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}finally{
				this.closeDB(db);
			}
			return null;
		}
		public List<DutyUnit> createList(List<DutyUnit> objList)throws Exception{
	    	DB db = this.initDB();
	    	List<DutyUnit> resultList = new ArrayList<DutyUnit>();
	    	try{
	    		this.beginTx(db);
	    		for( int i=0;i<objList.size();i++ )
	    			resultList.add(objList.get(i).create());
	    		this.commitTx(db);
	    	}catch (Exception e) {
	    		this.rollbackTx(db);
	    		throw e;
	    	}finally{
	    		this.closeDB(db);
	    	}
	    	return resultList;
	    }

		//  *** retrive ****
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
				prep = db.getParameterizedStatement( db.appendWhere(SQL_COUNT, where),objs);
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
		public DutyUnit findByPk(Long id)throws Exception{
			List<DutyUnit> resultList = this.findByWhere(pkCol+"=?", id);
			return (resultList.size()>0)?resultList.get(0):null;
		}
		public List<DutyUnit> findByPks(List<Long> ids)throws Exception{
			List<DutyUnit> resultList = new ArrayList<DutyUnit>();
			for( int i=0;i<ids.size();i++ )
				resultList.add(this.findByPk(ids.get(i)));
			return resultList;
		}
		public List<DutyUnit> findAll()throws Exception{
			return findByWhere(null,null);
		}
		public List<DutyUnit> findAll(PageUtil pageUtil)throws Exception{
			return findByWhere(null,null,pageUtil);
		}
		public List<DutyUnit> findByWhere(String where,Object obj)throws Exception{
			return this.findByWhere(where,new Object[]{obj});
		}
		public List<DutyUnit> findByWhere(String where,Object[] objs)throws Exception{
			return this.findByWhere(where, objs, null);
		}
		public List<DutyUnit> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
			return findByWhere(where,new Object[]{obj},pageUtil);
		}
		public List<DutyUnit> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
			DB db = this.initDB();
			List<DutyUnit> resultList = new ArrayList<DutyUnit>();
			try{
				if( pageUtil == null ){
					prep = db.getParameterizedStatement(db.appendWhere(SQL_SELECT , where), objs);
					rs = prep.executeQuery();
					while(rs.next())
						resultList.add(this.populate(rs));
				}else{
					String sql = db.appendWhere(SQL_SELECT, where);// build sql
					prep = db.getPagination(sql, objs, pageUtil.getPage(), pageUtil.getPageSize());
					rs = prep.executeQuery();
					while(rs.next())
						resultList.add(this.populate(rs));
				}
			}catch(Exception e){
				throw e;
			}finally{
				this.closeDB(db);
			}
			return resultList;
		}
		public List<DutyUnit> findByExample(DutyUnit instance) throws Exception{
			return findByExample(instance,null);
		}
		public List<DutyUnit> findByExample(DutyUnit instance,PageUtil pageUtil) throws Exception{
			Object value =null;
			List<Object> objList = new ArrayList<Object>();
			String where = " 1=1 ";
			String andString = " and ";
			for( int i=0;i<ALL_COLUMNS.length;i++ ){
				value = PropertyUtils.getProperty(instance, ALL_COLUMNS[i].toLowerCase());
				if( value!=null ){
					where+=andString+ALL_COLUMNS[i]+"=?";
					objList.add(value);
				}
			}
			if( objList.size()>0){
				//where = where.substring(0,where.lastIndexOf(andString));
				return this.findByWhere(where, objList.toArray(),pageUtil);
			}else
				return null;
		}
		//	**** update  ****
		public DutyUnit update()throws Exception{
			DB db = this.initDB();
			try{
				String parameter = "";
				List<Object> objList = new ArrayList<Object>();
				for(int i=0;i<ALL_COLUMNS.length;i++){
					if( ALL_COLUMNS[i]!= pkCol ){// cannot set pkCol
						Object value = PropertyUtils.getProperty(this, ALL_COLUMNS[i].toLowerCase());
						//if( value != null ){
							parameter+=ALL_COLUMNS[i]+"=?,";
							objList.add(value);
						//}
					}else
						objList.add(this.id);// pk
				}
				if( parameter.length()> 0 ){
					String sql_update = SQL_UPDATE+parameter.substring(0, parameter.lastIndexOf(","));
					//System.out.println(sql_update);
					//System.out.println("obj"+objList);
					prep = db.getParameterizedStatement(db.appendWhere(sql_update,pkCol+"=?"), objList.toArray());
					if( prep.executeUpdate() == 1 )
						return (DutyUnit)this;
				}else// not update
					return (DutyUnit)this;
			}catch(Exception e){
				throw e;
			}finally{
				this.closeDB(db);
			}
			return null;
		}
		public List<DutyUnit> updateList(List<DutyUnit> objList)throws Exception{
			DB db = this.initDB();
			List<DutyUnit> resultList = new ArrayList<DutyUnit>();
			try{
				this.beginTx(db);
				for( int i=0;i<objList.size(); i++ )
					resultList.add(objList.get(i).update());
				this.commitTx(db);
			}catch(Exception e){
				this.rollbackTx(db);
				throw e;
			}finally{
				this.closeDB(db);
			}
			return resultList;
		}

		//	**** delete  ****
		public Integer delete() throws Exception {
			return this.deleteByPk(this.id);
		}
		public Integer deleteList(List<DutyUnit> objList)throws Exception {
			DB db = this.initDB();
			try{
				this.beginTx(db);
				int delete =0;
				for(int i=0;i<objList.size();i++ )
					delete+=objList.get(i).delete();
				this.commitTx(db);
				return delete;
			}catch(Exception e) {
				this.rollbackTx(db);
				throw e;
			}finally{
				this.closeDB(db);
			}
		}
		public Integer deleteAll()throws Exception {
			return deleteByWhere(null,null);
		}
		public Integer deleteByPk(Long id) throws Exception {
			return this.deleteByWhere(pkCol+"=?",id);
		}
		public Integer deleteByPks(List<Long> ids)throws Exception {
			DB db = this.initDB();
			try{
				this.beginTx(db);// begin tx
				int delete =0;
				for(int i=0;i<ids.size();i++ )
					delete+=this.deleteByPk(ids.get(i));
				this.commitTx(db);// commit
				return delete;
			}catch(Exception e) {
				this.rollbackTx(db);
				throw e;
			}finally{
				this.closeDB(db);
			}
		}
		public Integer deleteByWhere(String where, Object obj) throws Exception {
			return this.deleteByWhere(where,new Object[]{obj});
		}
		public Integer deleteByWhere(String where , Object[] objs)throws Exception{
			DB db = this.initDB();
			try {
				prep = db.getParameterizedStatement(db.appendWhere(SQL_DELETE, where), objs);
				return prep.executeUpdate();
			} catch (Exception e) {
				throw e;
			}finally{
				this.closeDB(db);
			}
		}
		public DutyUnit populate(ResultSet rs)throws Exception{
			DutyUnit result = new DutyUnit(this.db);
	    	try {
	    		for ( int i=0;i<ALL_COLUMNS.length ; i++ ){
	    			String field = ALL_COLUMNS[i].toLowerCase();
	    			DB.bindFieldToObject(rs, ALL_COLUMNS[i], result, field);
	    			/*Object value = rs.getObject(ALL_COLUMNS[i]);
	    			if( value != null ){

	        			 // BeanUtil.setProperty(result,date,null); // cannot use null

		    			if ( value instanceof java.sql.Timestamp )
		    				BeanUtils.setProperty(result, field , new Date(((java.sql.Timestamp)value).getTime()));
		    			else if ( value instanceof java.sql.Blob ){// blob
		    				//java.io.InputStream is = rs.getBinaryStream("");
		    				//java.io.BufferedInputStream imgStream = new java.io.BufferedInputStream(is);
		    				// Fix it
		    				// BeanUtils.setProperty(result, field ,
		    			}else
		    				BeanUtils.setProperty(result, field , value);
	    			}*/
	    		}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return result;
	    }


	@Override
	public FormValidator validate() {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }

    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    
  //****  attribute deteail  *****//
    private String data_source;
    
    private String group_id;
    
    private java.util.Date upd_date;

    private String upd_userid;
    
    private java.util.Date end_date;
    
    private java.util.Date begin_date;
    
    private String used_for;
    
    private String unit_code;
    
    private Long id;
    
    public String getData_source(){
    	return data_source;
    }
    public void setData_source(String value){
    	data_source = value;
    }
    
    public String getGroup_id(){
    	return group_id;
    }
    public void setGroup_id(String value){
    	group_id=value;
    }
    
    public java.util.Date getUpd_date(){
    	return upd_date;
    }
    public void setUpd_date(java.util.Date value){
    	this.upd_date = value;
    }
    
    public String getUpd_userid(){
    	return upd_userid;
    }
    public void setUpd_userid(String value){
    	this.upd_userid = value;
    }
    
    public java.util.Date getEnd_date(){
    	return end_date;
    }
    public void setEnd_date(java.util.Date value){
    	this.end_date = value;
    }
   
    public java.util.Date getBegin_date(){
    	return begin_date;
    }
    public void setBegin_date(java.util.Date value){
    	this.begin_date = value;
    }
    
    public String getUsed_for(){
    	return used_for;
    }
    public void setUsed_for(String value){
    	this.used_for = value;
    }
    public String getUnit_code(){
    	return unit_code;
    }
    public void setUnit_code(String value){
    	this.unit_code = value;
    }
}