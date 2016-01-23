








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
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

import com.ko.domain.AppReqApproveCompareForm3;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseAppReqApproveCompareForm3 extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APP_REQ_APPROVE_COMPARE_FORM3";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APP_REQ_APPROVE_COMPARE_FORM3.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String OFFCODE_APPROVECol = "OFFCODE_APPROVE";

	public static final String POSCODE_APPROVECol = "POSCODE_APPROVE";

	public static final String STAFF_ID_APPROVECol = "STAFF_ID_APPROVE";

	public static final String APPROVE_DATECol = "APPROVE_DATE";

	public static final String NONEAPPROVE_DESCCol = "NONEAPPROVE_DESC";

	public static final String APPROVE_DESCCol = "APPROVE_DESC";

	public static final String ISAPPROVECol = "ISAPPROVE";

	public static final String OFFCODE_ACCEPTCol = "OFFCODE_ACCEPT";

	public static final String POSCODE_ACCEPTCol = "POSCODE_ACCEPT";

	public static final String STAFF_ID_ACCEPTCol = "STAFF_ID_ACCEPT";

	public static final String NONEACCEPT_DESCCol = "NONEACCEPT_DESC";

	public static final String ACCEPT_DESCCol = "ACCEPT_DESC";

	public static final String ISACCEPTCol = "ISACCEPT";

	public static final String OFFCODE_DIRECTORCol = "OFFCODE_DIRECTOR";

	public static final String POSCODE_DIRECTORCol = "POSCODE_DIRECTOR";

	public static final String STAFF_ID_DIRECTORCol = "STAFF_ID_DIRECTOR";

	public static final String DIRECTOR_INFORM_DATECol = "DIRECTOR_INFORM_DATE";

	public static final String DIRECTOR_INFORM_FORCol = "DIRECTOR_INFORM_FOR";

	public static final String DIRECTOR_INFORM_TOCol = "DIRECTOR_INFORM_TO";

	public static final String OFFCODE_LAWYER8Col = "OFFCODE_LAWYER8";

	public static final String POSCODE_LAWYER8Col = "POSCODE_LAWYER8";

	public static final String STAFF_ID_LAWYER8Col = "STAFF_ID_LAWYER8";

	public static final String LAWYER8_INFORM_DATECol = "LAWYER8_INFORM_DATE";

	public static final String LAWYER8_INFORM_FORCol = "LAWYER8_INFORM_FOR";

	public static final String LAWYER8_INFORM_TOCol = "LAWYER8_INFORM_TO";

	public static final String OFFCODE_INFORMCol = "OFFCODE_INFORM";

	public static final String POSCODE_INFORMCol = "POSCODE_INFORM";

	public static final String STAFF_ID_INFORMCol = "STAFF_ID_INFORM";

	public static final String INFORM_DATECol = "INFORM_DATE";

	public static final String INFORM_FORCol = "INFORM_FOR";

	public static final String INFORM_TOCol = "INFORM_TO";

	public static final String APP_REQ_APPROVE_COMPARE_IDCol = "APP_REQ_APPROVE_COMPARE_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPDATE_ONColumn = "APP_REQ_APPROVE_COMPARE_FORM3.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APP_REQ_APPROVE_COMPARE_FORM3.UPDATE_BY";

	public static final String CREATE_ONColumn = "APP_REQ_APPROVE_COMPARE_FORM3.CREATE_ON";

	public static final String CREATE_BYColumn = "APP_REQ_APPROVE_COMPARE_FORM3.CREATE_BY";

	public static final String OFFCODE_APPROVEColumn = "APP_REQ_APPROVE_COMPARE_FORM3.OFFCODE_APPROVE";

	public static final String POSCODE_APPROVEColumn = "APP_REQ_APPROVE_COMPARE_FORM3.POSCODE_APPROVE";

	public static final String STAFF_ID_APPROVEColumn = "APP_REQ_APPROVE_COMPARE_FORM3.STAFF_ID_APPROVE";

	public static final String APPROVE_DATEColumn = "APP_REQ_APPROVE_COMPARE_FORM3.APPROVE_DATE";

	public static final String NONEAPPROVE_DESCColumn = "APP_REQ_APPROVE_COMPARE_FORM3.NONEAPPROVE_DESC";

	public static final String APPROVE_DESCColumn = "APP_REQ_APPROVE_COMPARE_FORM3.APPROVE_DESC";

	public static final String ISAPPROVEColumn = "APP_REQ_APPROVE_COMPARE_FORM3.ISAPPROVE";

	public static final String OFFCODE_ACCEPTColumn = "APP_REQ_APPROVE_COMPARE_FORM3.OFFCODE_ACCEPT";

	public static final String POSCODE_ACCEPTColumn = "APP_REQ_APPROVE_COMPARE_FORM3.POSCODE_ACCEPT";

	public static final String STAFF_ID_ACCEPTColumn = "APP_REQ_APPROVE_COMPARE_FORM3.STAFF_ID_ACCEPT";

	public static final String NONEACCEPT_DESCColumn = "APP_REQ_APPROVE_COMPARE_FORM3.NONEACCEPT_DESC";

	public static final String ACCEPT_DESCColumn = "APP_REQ_APPROVE_COMPARE_FORM3.ACCEPT_DESC";

	public static final String ISACCEPTColumn = "APP_REQ_APPROVE_COMPARE_FORM3.ISACCEPT";

	public static final String OFFCODE_DIRECTORColumn = "APP_REQ_APPROVE_COMPARE_FORM3.OFFCODE_DIRECTOR";

	public static final String POSCODE_DIRECTORColumn = "APP_REQ_APPROVE_COMPARE_FORM3.POSCODE_DIRECTOR";

	public static final String STAFF_ID_DIRECTORColumn = "APP_REQ_APPROVE_COMPARE_FORM3.STAFF_ID_DIRECTOR";

	public static final String DIRECTOR_INFORM_DATEColumn = "APP_REQ_APPROVE_COMPARE_FORM3.DIRECTOR_INFORM_DATE";

	public static final String DIRECTOR_INFORM_FORColumn = "APP_REQ_APPROVE_COMPARE_FORM3.DIRECTOR_INFORM_FOR";

	public static final String DIRECTOR_INFORM_TOColumn = "APP_REQ_APPROVE_COMPARE_FORM3.DIRECTOR_INFORM_TO";

	public static final String OFFCODE_LAWYER8Column = "APP_REQ_APPROVE_COMPARE_FORM3.OFFCODE_LAWYER8";

	public static final String POSCODE_LAWYER8Column = "APP_REQ_APPROVE_COMPARE_FORM3.POSCODE_LAWYER8";

	public static final String STAFF_ID_LAWYER8Column = "APP_REQ_APPROVE_COMPARE_FORM3.STAFF_ID_LAWYER8";

	public static final String LAWYER8_INFORM_DATEColumn = "APP_REQ_APPROVE_COMPARE_FORM3.LAWYER8_INFORM_DATE";

	public static final String LAWYER8_INFORM_FORColumn = "APP_REQ_APPROVE_COMPARE_FORM3.LAWYER8_INFORM_FOR";

	public static final String LAWYER8_INFORM_TOColumn = "APP_REQ_APPROVE_COMPARE_FORM3.LAWYER8_INFORM_TO";

	public static final String OFFCODE_INFORMColumn = "APP_REQ_APPROVE_COMPARE_FORM3.OFFCODE_INFORM";

	public static final String POSCODE_INFORMColumn = "APP_REQ_APPROVE_COMPARE_FORM3.POSCODE_INFORM";

	public static final String STAFF_ID_INFORMColumn = "APP_REQ_APPROVE_COMPARE_FORM3.STAFF_ID_INFORM";

	public static final String INFORM_DATEColumn = "APP_REQ_APPROVE_COMPARE_FORM3.INFORM_DATE";

	public static final String INFORM_FORColumn = "APP_REQ_APPROVE_COMPARE_FORM3.INFORM_FOR";

	public static final String INFORM_TOColumn = "APP_REQ_APPROVE_COMPARE_FORM3.INFORM_TO";

	public static final String APP_REQ_APPROVE_COMPARE_IDColumn = "APP_REQ_APPROVE_COMPARE_FORM3.APP_REQ_APPROVE_COMPARE_ID";

	public static final String IDColumn = "APP_REQ_APPROVE_COMPARE_FORM3.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, OFFCODE_APPROVECol	, POSCODE_APPROVECol	, STAFF_ID_APPROVECol	, APPROVE_DATECol	, NONEAPPROVE_DESCCol	, APPROVE_DESCCol	, ISAPPROVECol	, OFFCODE_ACCEPTCol	, POSCODE_ACCEPTCol	, STAFF_ID_ACCEPTCol	, NONEACCEPT_DESCCol	, ACCEPT_DESCCol	, ISACCEPTCol	, OFFCODE_DIRECTORCol	, POSCODE_DIRECTORCol	, STAFF_ID_DIRECTORCol	, DIRECTOR_INFORM_DATECol	, DIRECTOR_INFORM_FORCol	, DIRECTOR_INFORM_TOCol	, OFFCODE_LAWYER8Col	, POSCODE_LAWYER8Col	, STAFF_ID_LAWYER8Col	, LAWYER8_INFORM_DATECol	, LAWYER8_INFORM_FORCol	, LAWYER8_INFORM_TOCol	, OFFCODE_INFORMCol	, POSCODE_INFORMCol	, STAFF_ID_INFORMCol	, INFORM_DATECol	, INFORM_FORCol	, INFORM_TOCol	, APP_REQ_APPROVE_COMPARE_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ OFFCODE_APPROVECol	+","+ POSCODE_APPROVECol	+","+ STAFF_ID_APPROVECol	+","+ APPROVE_DATECol	+","+ NONEAPPROVE_DESCCol	+","+ APPROVE_DESCCol	+","+ ISAPPROVECol	+","+ OFFCODE_ACCEPTCol	+","+ POSCODE_ACCEPTCol	+","+ STAFF_ID_ACCEPTCol	+","+ NONEACCEPT_DESCCol	+","+ ACCEPT_DESCCol	+","+ ISACCEPTCol	+","+ OFFCODE_DIRECTORCol	+","+ POSCODE_DIRECTORCol	+","+ STAFF_ID_DIRECTORCol	+","+ DIRECTOR_INFORM_DATECol	+","+ DIRECTOR_INFORM_FORCol	+","+ DIRECTOR_INFORM_TOCol	+","+ OFFCODE_LAWYER8Col	+","+ POSCODE_LAWYER8Col	+","+ STAFF_ID_LAWYER8Col	+","+ LAWYER8_INFORM_DATECol	+","+ LAWYER8_INFORM_FORCol	+","+ LAWYER8_INFORM_TOCol	+","+ OFFCODE_INFORMCol	+","+ POSCODE_INFORMCol	+","+ STAFF_ID_INFORMCol	+","+ INFORM_DATECol	+","+ INFORM_FORCol	+","+ INFORM_TOCol	+","+ APP_REQ_APPROVE_COMPARE_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+OFFCODE_APPROVECol+"=?,"+POSCODE_APPROVECol+"=?,"+STAFF_ID_APPROVECol+"=?,"+APPROVE_DATECol+"=?,"+NONEAPPROVE_DESCCol+"=?,"+APPROVE_DESCCol+"=?,"+ISAPPROVECol+"=?,"+OFFCODE_ACCEPTCol+"=?,"+POSCODE_ACCEPTCol+"=?,"+STAFF_ID_ACCEPTCol+"=?,"+NONEACCEPT_DESCCol+"=?,"+ACCEPT_DESCCol+"=?,"+ISACCEPTCol+"=?,"+OFFCODE_DIRECTORCol+"=?,"+POSCODE_DIRECTORCol+"=?,"+STAFF_ID_DIRECTORCol+"=?,"+DIRECTOR_INFORM_DATECol+"=?,"+DIRECTOR_INFORM_FORCol+"=?,"+DIRECTOR_INFORM_TOCol+"=?,"+OFFCODE_LAWYER8Col+"=?,"+POSCODE_LAWYER8Col+"=?,"+STAFF_ID_LAWYER8Col+"=?,"+LAWYER8_INFORM_DATECol+"=?,"+LAWYER8_INFORM_FORCol+"=?,"+LAWYER8_INFORM_TOCol+"=?,"+OFFCODE_INFORMCol+"=?,"+POSCODE_INFORMCol+"=?,"+STAFF_ID_INFORMCol+"=?,"+INFORM_DATECol+"=?,"+INFORM_FORCol+"=?,"+INFORM_TOCol+"=?,"+APP_REQ_APPROVE_COMPARE_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseAppReqApproveCompareForm3(DB db){
		super(db);
	}



public synchronized AppReqApproveCompareForm3 create() throws Exception{
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
					return (AppReqApproveCompareForm3)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<AppReqApproveCompareForm3> createList(List<AppReqApproveCompareForm3> objList)throws Exception{
    	DB db = this.initDB();
    	List<AppReqApproveCompareForm3> resultList = new ArrayList<AppReqApproveCompareForm3>();
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
	public AppReqApproveCompareForm3 findByPk(Long id)throws Exception{
		List<AppReqApproveCompareForm3> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<AppReqApproveCompareForm3> findByPks(List<Long> ids)throws Exception{
		List<AppReqApproveCompareForm3> resultList = new ArrayList<AppReqApproveCompareForm3>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<AppReqApproveCompareForm3> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<AppReqApproveCompareForm3> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<AppReqApproveCompareForm3> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<AppReqApproveCompareForm3> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<AppReqApproveCompareForm3> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<AppReqApproveCompareForm3> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<AppReqApproveCompareForm3> resultList = new ArrayList<AppReqApproveCompareForm3>();
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
	public List<AppReqApproveCompareForm3> findByExample(AppReqApproveCompareForm3 instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<AppReqApproveCompareForm3> findByExample(AppReqApproveCompareForm3 instance,PageUtil pageUtil) throws Exception{
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
	public AppReqApproveCompareForm3 update()throws Exception{
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
					return (AppReqApproveCompareForm3)this;
			}else// not update
				return (AppReqApproveCompareForm3)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<AppReqApproveCompareForm3> updateList(List<AppReqApproveCompareForm3> objList)throws Exception{
		DB db = this.initDB();
		List<AppReqApproveCompareForm3> resultList = new ArrayList<AppReqApproveCompareForm3>();
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
	public Integer deleteList(List<AppReqApproveCompareForm3> objList)throws Exception {
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
	public AppReqApproveCompareForm3 populate(ResultSet rs)throws Exception{
		AppReqApproveCompareForm3 result = new AppReqApproveCompareForm3(this.db);
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
	//****   validator deteail  *****//
	public FormValidator validate(){
		FormValidator validator = new FormValidator();
			
		return validator;
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
    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String offcode_approve;

    private String poscode_approve;

    private String staff_id_approve;

    private java.util.Date approve_date;

    private String noneapprove_desc;

    private String approve_desc;

    private String isapprove;

    private String offcode_accept;

    private String poscode_accept;

    private String staff_id_accept;

    private String noneaccept_desc;

    private String accept_desc;

    private String isaccept;

    private String offcode_director;

    private String poscode_director;

    private String staff_id_director;

    private java.util.Date director_inform_date;

    private String director_inform_for;

    private String director_inform_to;

    private String offcode_lawyer8;

    private String poscode_lawyer8;

    private String staff_id_lawyer8;

    private java.util.Date lawyer8_inform_date;

    private String lawyer8_inform_for;

    private String lawyer8_inform_to;

    private String offcode_inform;

    private String poscode_inform;

    private String staff_id_inform;

    private java.util.Date inform_date;

    private String inform_for;

    private String inform_to;

    private Long app_req_approve_compare_id;

    private Long id;

	//**** getter setter ****//
	public java.util.Date getUpdate_on()
    {
        return update_on;
    }
    public void setUpdate_on(java.util.Date update_on)
    {
        this.update_on = update_on;
    }

	public Long getUpdate_by()
    {
        return update_by;
    }
    public void setUpdate_by(Long update_by)
    {
        this.update_by = update_by;
    }

	public java.util.Date getCreate_on()
    {
        return create_on;
    }
    public void setCreate_on(java.util.Date create_on)
    {
        this.create_on = create_on;
    }

	public Long getCreate_by()
    {
        return create_by;
    }
    public void setCreate_by(Long create_by)
    {
        this.create_by = create_by;
    }

	public String getOffcode_approve()
    {
        return offcode_approve;
    }
    public void setOffcode_approve(String offcode_approve)
    {
        this.offcode_approve = offcode_approve;
    }

	public String getPoscode_approve()
    {
        return poscode_approve;
    }
    public void setPoscode_approve(String poscode_approve)
    {
        this.poscode_approve = poscode_approve;
    }

	public String getStaff_id_approve()
    {
        return staff_id_approve;
    }
    public void setStaff_id_approve(String staff_id_approve)
    {
        this.staff_id_approve = staff_id_approve;
    }

	public java.util.Date getApprove_date()
    {
        return approve_date;
    }
    public void setApprove_date(java.util.Date approve_date)
    {
        this.approve_date = approve_date;
    }

	public String getNoneapprove_desc()
    {
        return noneapprove_desc;
    }
    public void setNoneapprove_desc(String noneapprove_desc)
    {
        this.noneapprove_desc = noneapprove_desc;
    }

	public String getApprove_desc()
    {
        return approve_desc;
    }
    public void setApprove_desc(String approve_desc)
    {
        this.approve_desc = approve_desc;
    }

	public String getIsapprove()
    {
        return isapprove;
    }
    public void setIsapprove(String isapprove)
    {
        this.isapprove = isapprove;
    }

	public String getOffcode_accept()
    {
        return offcode_accept;
    }
    public void setOffcode_accept(String offcode_accept)
    {
        this.offcode_accept = offcode_accept;
    }

	public String getPoscode_accept()
    {
        return poscode_accept;
    }
    public void setPoscode_accept(String poscode_accept)
    {
        this.poscode_accept = poscode_accept;
    }

	public String getStaff_id_accept()
    {
        return staff_id_accept;
    }
    public void setStaff_id_accept(String staff_id_accept)
    {
        this.staff_id_accept = staff_id_accept;
    }

	public String getNoneaccept_desc()
    {
        return noneaccept_desc;
    }
    public void setNoneaccept_desc(String noneaccept_desc)
    {
        this.noneaccept_desc = noneaccept_desc;
    }

	public String getAccept_desc()
    {
        return accept_desc;
    }
    public void setAccept_desc(String accept_desc)
    {
        this.accept_desc = accept_desc;
    }

	public String getIsaccept()
    {
        return isaccept;
    }
    public void setIsaccept(String isaccept)
    {
        this.isaccept = isaccept;
    }

	public String getOffcode_director()
    {
        return offcode_director;
    }
    public void setOffcode_director(String offcode_director)
    {
        this.offcode_director = offcode_director;
    }

	public String getPoscode_director()
    {
        return poscode_director;
    }
    public void setPoscode_director(String poscode_director)
    {
        this.poscode_director = poscode_director;
    }

	public String getStaff_id_director()
    {
        return staff_id_director;
    }
    public void setStaff_id_director(String staff_id_director)
    {
        this.staff_id_director = staff_id_director;
    }

	public java.util.Date getDirector_inform_date()
    {
        return director_inform_date;
    }
    public void setDirector_inform_date(java.util.Date director_inform_date)
    {
        this.director_inform_date = director_inform_date;
    }

	public String getDirector_inform_for()
    {
        return director_inform_for;
    }
    public void setDirector_inform_for(String director_inform_for)
    {
        this.director_inform_for = director_inform_for;
    }

	public String getDirector_inform_to()
    {
        return director_inform_to;
    }
    public void setDirector_inform_to(String director_inform_to)
    {
        this.director_inform_to = director_inform_to;
    }

	public String getOffcode_lawyer8()
    {
        return offcode_lawyer8;
    }
    public void setOffcode_lawyer8(String offcode_lawyer8)
    {
        this.offcode_lawyer8 = offcode_lawyer8;
    }

	public String getPoscode_lawyer8()
    {
        return poscode_lawyer8;
    }
    public void setPoscode_lawyer8(String poscode_lawyer8)
    {
        this.poscode_lawyer8 = poscode_lawyer8;
    }

	public String getStaff_id_lawyer8()
    {
        return staff_id_lawyer8;
    }
    public void setStaff_id_lawyer8(String staff_id_lawyer8)
    {
        this.staff_id_lawyer8 = staff_id_lawyer8;
    }

	public java.util.Date getLawyer8_inform_date()
    {
        return lawyer8_inform_date;
    }
    public void setLawyer8_inform_date(java.util.Date lawyer8_inform_date)
    {
        this.lawyer8_inform_date = lawyer8_inform_date;
    }

	public String getLawyer8_inform_for()
    {
        return lawyer8_inform_for;
    }
    public void setLawyer8_inform_for(String lawyer8_inform_for)
    {
        this.lawyer8_inform_for = lawyer8_inform_for;
    }

	public String getLawyer8_inform_to()
    {
        return lawyer8_inform_to;
    }
    public void setLawyer8_inform_to(String lawyer8_inform_to)
    {
        this.lawyer8_inform_to = lawyer8_inform_to;
    }

	public String getOffcode_inform()
    {
        return offcode_inform;
    }
    public void setOffcode_inform(String offcode_inform)
    {
        this.offcode_inform = offcode_inform;
    }

	public String getPoscode_inform()
    {
        return poscode_inform;
    }
    public void setPoscode_inform(String poscode_inform)
    {
        this.poscode_inform = poscode_inform;
    }

	public String getStaff_id_inform()
    {
        return staff_id_inform;
    }
    public void setStaff_id_inform(String staff_id_inform)
    {
        this.staff_id_inform = staff_id_inform;
    }

	public java.util.Date getInform_date()
    {
        return inform_date;
    }
    public void setInform_date(java.util.Date inform_date)
    {
        this.inform_date = inform_date;
    }

	public String getInform_for()
    {
        return inform_for;
    }
    public void setInform_for(String inform_for)
    {
        this.inform_for = inform_for;
    }

	public String getInform_to()
    {
        return inform_to;
    }
    public void setInform_to(String inform_to)
    {
        this.inform_to = inform_to;
    }

	public Long getApp_req_approve_compare_id()
    {
        return app_req_approve_compare_id;
    }
    public void setApp_req_approve_compare_id(Long app_req_approve_compare_id)
    {
        this.app_req_approve_compare_id = app_req_approve_compare_id;
    }

	public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

}