








 

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

import com.ko.domain.BrandSecond;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseBrandSecond extends BaseDomain{
	// table
	public static final String TABLE_NAME = "BRAND_SECOND";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "BRAND_SECOND.ID";

	// short name column
	public static final String UPD_DATECol = "UPD_DATE";

	public static final String UPD_USERIDCol = "UPD_USERID";

	public static final String END_DATECol = "END_DATE";

	public static final String BEGIN_DATECol = "BEGIN_DATE";

	public static final String BRAND_SECOND_NAME_ENGCol = "BRAND_SECOND_NAME_ENG";

	public static final String BRAND_SECOND_NAME_THAICol = "BRAND_SECOND_NAME_THAI";

	public static final String BRAND_SECOND_CODECol = "BRAND_SECOND_CODE";
	
	public static final String BRAND_MAIN_NAMECol = "BRAND_MAIN_NAME";
	
	public static final String BRAND_MAIN_CODECol = "BRAND_MAIN_CODE";
	
	public static final String GROUP_NAMECol = "GROUP_NAME";

	public static final String GROUP_IDCol = "GROUP_ID";
	
	public static final String UPDATE_ONCol = "UPDATE_ON";
	
	public static final String UPDATE_BYCol = "UPDATE_BY";
	
	public static final String CREATE_ONCol = "CREATE_ON";
	
	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPD_DATEColumn = "BRAND_SECOND.UPD_DATE";

	public static final String UPD_USERIDColumn = "BRAND_SECOND.UPD_USERID";

	public static final String END_DATEColumn = "BRAND_SECOND.END_DATE";

	public static final String BEGIN_DATEColumn = "BRAND_SECOND.BEGIN_DATE";
	
	public static final String BRAND_SECOND_NAME_ENGColumn = "BRAND_SECOND.BRAND_SECOND_NAME_ENG";
	
	public static final String BRAND_SECOND_NAME_THAIColumn = "BRAND_SECOND.BRAND_SECOND_NAME_THAI";
	
	public static final String BRAND_SECOND_CODEColumn = "BRAND_SECOND.BRAND_SECOND_CODE";

	public static final String BRAND_MAIN_NAMEColumn = "BRAND_SECOND.BRAND_MAIN_NAME";

	public static final String BRAND_MAIN_CODEColumn = "BRAND_SECOND.BRAND_MAIN_CODE";
	
	public static final String GROUP_NAMEColumn = "BRAND_SECOND.GROUP_NAME";

	public static final String GROUP_IDColumn = "BRAND_SECOND.GROUP_ID";
	
	public static final String UPDATE_ONColumn = "BRAND_SECOND.UPDATE_ON";
	
	public static final String UPDATE_BYColumn = "BRAND_SECOND.UPDATE_BY";
	
	public static final String CREATE_ONColumn = "BRAND_SECOND.CREATE_ON";
	
	public static final String CREATE_BYColumn = "BRAND_SECOND.CREATE_BY";

	public static final String IDColumn = "BRAND_SECOND.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPD_DATECol	, UPD_USERIDCol	, END_DATECol	, BEGIN_DATECol	, BRAND_SECOND_NAME_ENGCol	, BRAND_SECOND_NAME_THAICol	, BRAND_SECOND_CODECol, BRAND_MAIN_NAMECol, BRAND_MAIN_CODECol , GROUP_NAMECol, GROUP_IDCol, UPDATE_ONCol, UPDATE_BYCol, CREATE_ONCol, CREATE_BYCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPD_DATECol	+","+ UPD_USERIDCol	+","+ END_DATECol	+","+ BEGIN_DATECol	+","+ BRAND_SECOND_NAME_ENGCol	+","+ BRAND_SECOND_NAME_THAICol	+","+ BRAND_SECOND_CODECol	+","+ BRAND_MAIN_NAMECol	+","+ BRAND_MAIN_CODECol	+","+ GROUP_NAMECol	+","+ GROUP_IDCol	+","+UPDATE_ONCol	+","+ UPDATE_BYCol+ ","+ CREATE_ONCol+ ","+ CREATE_BYCol+  ","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPD_DATECol+"=?,"+UPD_USERIDCol+"=?,"+END_DATECol+"=?,"+BEGIN_DATECol+"=?,"+BRAND_SECOND_ENGCol+"=?,"+BRAND_SECOND_THAICol+"=?,"+BRAND_SECOND_CODECol+"=?,"+DUTY_CODECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseBrandSecond(DB db){
		super(db);
	}



public synchronized BrandSecond create() throws Exception{
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
					return (BrandSecond)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<BrandSecond> createList(List<BrandSecond> objList)throws Exception{
    	DB db = this.initDB();
    	List<BrandSecond> resultList = new ArrayList<BrandSecond>();
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
	public BrandSecond findByPk(Long id)throws Exception{
		List<BrandSecond> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<BrandSecond> findByPks(List<Long> ids)throws Exception{
		List<BrandSecond> resultList = new ArrayList<BrandSecond>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<BrandSecond> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<BrandSecond> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<BrandSecond> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<BrandSecond> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<BrandSecond> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<BrandSecond> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<BrandSecond> resultList = new ArrayList<BrandSecond>();
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
	public List<BrandSecond> findByExample(BrandSecond instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<BrandSecond> findByExample(BrandSecond instance,PageUtil pageUtil) throws Exception{
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
	public BrandSecond update()throws Exception{
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
					return (BrandSecond)this;
			}else// not update
				return (BrandSecond)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<BrandSecond> updateList(List<BrandSecond> objList)throws Exception{
		DB db = this.initDB();
		List<BrandSecond> resultList = new ArrayList<BrandSecond>();
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
	public Integer deleteList(List<BrandSecond> objList)throws Exception {
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
	public BrandSecond populate(ResultSet rs)throws Exception{
		BrandSecond result = new BrandSecond(this.db);
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
    private java.util.Date upd_date;

    private String upd_userid;

    private java.util.Date end_date;

    private java.util.Date begin_date;

    private String brand_second_name_eng;

    private String brand_second_name_thai;

    private String brand_second_code;
    
    private String brand_main_name;
    
    private String brand_main_code;
    
    private String group_name;
    
    private String group_id;

    private java.util.Date update_on;
    
    private String update_by;
    
    private java.util.Date create_on;
    
    private String create_by;

    private Long id;

	//**** getter setter ****//
	public java.util.Date getUpd_date()
    {
        return upd_date;
    }
    public void setUpd_date(java.util.Date upd_date)
    {
        this.upd_date = upd_date;
    }

	public String getUpd_userid()
    {
        return upd_userid;
    }
    public void setUpd_userid(String upd_userid)
    {
        this.upd_userid = upd_userid;
    }

	public java.util.Date getEnd_date()
    {
        return end_date;
    }
    public void setEnd_date(java.util.Date end_date)
    {
        this.end_date = end_date;
    }

	public java.util.Date getBegin_date()
    {
        return begin_date;
    }
    public void setBegin_date(java.util.Date begin_date)
    {
        this.begin_date = begin_date;
    }

	public String getBrand_second_name_eng()
    {
        return brand_second_name_eng;
    }
    public void setBrand_second_name_eng(String value)
    {
        this.brand_second_name_eng = value;
    }

	public String getBrand_second_name_thai()
    {
        return brand_second_name_thai;
    }
    public void setBrand_second_name_thai(String value)
    {
        this.brand_second_name_thai = value;
    }

	public String getBrand_second_code()
    {
        return brand_second_code;
    }
    public void setBrand_second_code(String value)
    {
        this.brand_second_code = value;
    }

    public String getBrand_main_name(){
    	return brand_main_name;
    }
    public void setBrand_main_name(String value){
    	this.brand_main_name = value;
    }
    
    public String getBrand_main_code(){
    	return brand_main_code;
    }
    public void setBrand_main_code(String value){
    	this.brand_main_code = value;
    }
    
    public String getGroup_name(){
    	return group_name;
    }
    public void setGroup_name(String value){
    	this.group_name = value;
    }
    
    public String getGroup_id(){
    	return group_id;
    }
    public void setGroup_id(String value){
    	this.group_id = value;
    }

	public java.util.Date getUpdate_on()
    {
        return update_on;
    }
    public void setUpdate_on(java.util.Date update_on)
    {
        this.update_on = update_on;
    }

	public String getUpdate_by()
    {
        return update_by;
    }
    public void setUpdate_by(String update_by)
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

	public String getCreate_by()
    {
        return create_by;
    }
    public void setCreate_by(String create_by)
    {
        this.create_by = create_by;
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