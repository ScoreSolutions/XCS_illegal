








 

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

import com.ko.domain.SizePackage;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseSizePackage extends BaseDomain{
	// table
	public static final String TABLE_NAME = "SIZE_PACKAGE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "SIZE_PACKAGE.ID";

	// short name column
	public static final String UPD_USERIDCol = "UPD_USERID";

	public static final String UPD_DATECol = "UPD_DATE";

	public static final String END_DATECol = "END_DATE";

	public static final String BEGIN_DATECol = "BEGIN_DATE";

	public static final String UNIT_CODECol = "UNIT_CODE";

	public static final String SIZE_DESCCol = "SIZE_DESC";

	public static final String SIZE_CODECol = "SIZE_CODE";

	public static final String DUTY_CODECol = "DUTY_CODE";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPD_USERIDColumn = "SIZE_PACKAGE.UPD_USERID";

	public static final String UPD_DATEColumn = "SIZE_PACKAGE.UPD_DATE";

	public static final String END_DATEColumn = "SIZE_PACKAGE.END_DATE";

	public static final String BEGIN_DATEColumn = "SIZE_PACKAGE.BEGIN_DATE";

	public static final String UNIT_CODEColumn = "SIZE_PACKAGE.UNIT_CODE";

	public static final String SIZE_DESCColumn = "SIZE_PACKAGE.SIZE_DESC";

	public static final String SIZE_CODEColumn = "SIZE_PACKAGE.SIZE_CODE";

	public static final String DUTY_CODEColumn = "SIZE_PACKAGE.DUTY_CODE";

	public static final String IDColumn = "SIZE_PACKAGE.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPD_USERIDCol	, UPD_DATECol	, END_DATECol	, BEGIN_DATECol	, UNIT_CODECol	, SIZE_DESCCol	, SIZE_CODECol	, DUTY_CODECol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPD_USERIDCol	+","+ UPD_DATECol	+","+ END_DATECol	+","+ BEGIN_DATECol	+","+ UNIT_CODECol	+","+ SIZE_DESCCol	+","+ SIZE_CODECol	+","+ DUTY_CODECol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPD_USERIDCol+"=?,"+UPD_DATECol+"=?,"+END_DATECol+"=?,"+BEGIN_DATECol+"=?,"+UNIT_CODECol+"=?,"+SIZE_DESCCol+"=?,"+SIZE_CODECol+"=?,"+DUTY_CODECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseSizePackage(DB db){
		super(db);
	}



public synchronized SizePackage create() throws Exception{
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
					return (SizePackage)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SizePackage> createList(List<SizePackage> objList)throws Exception{
    	DB db = this.initDB();
    	List<SizePackage> resultList = new ArrayList<SizePackage>();
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
	public SizePackage findByPk(Long id)throws Exception{
		List<SizePackage> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<SizePackage> findByPks(List<Long> ids)throws Exception{
		List<SizePackage> resultList = new ArrayList<SizePackage>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<SizePackage> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<SizePackage> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<SizePackage> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<SizePackage> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<SizePackage> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<SizePackage> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<SizePackage> resultList = new ArrayList<SizePackage>();
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
	public List<SizePackage> findByExample(SizePackage instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<SizePackage> findByExample(SizePackage instance,PageUtil pageUtil) throws Exception{
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
	public SizePackage update()throws Exception{
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
					return (SizePackage)this;
			}else// not update
				return (SizePackage)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SizePackage> updateList(List<SizePackage> objList)throws Exception{
		DB db = this.initDB();
		List<SizePackage> resultList = new ArrayList<SizePackage>();
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
	public Integer deleteList(List<SizePackage> objList)throws Exception {
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
	public SizePackage populate(ResultSet rs)throws Exception{
		SizePackage result = new SizePackage(this.db);
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
    private String upd_userid;

    private java.util.Date upd_date;

    private java.util.Date end_date;

    private java.util.Date begin_date;

    private String unit_code;

    private String size_desc;

    private String size_code;

    private String duty_code;

    private Long id;

	//**** getter setter ****//
	public String getUpd_userid()
    {
        return upd_userid;
    }
    public void setUpd_userid(String upd_userid)
    {
        this.upd_userid = upd_userid;
    }

	public java.util.Date getUpd_date()
    {
        return upd_date;
    }
    public void setUpd_date(java.util.Date upd_date)
    {
        this.upd_date = upd_date;
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

	public String getUnit_code()
    {
        return unit_code;
    }
    public void setUnit_code(String unit_code)
    {
        this.unit_code = unit_code;
    }

	public String getSize_desc()
    {
        return size_desc;
    }
    public void setSize_desc(String size_desc)
    {
        this.size_desc = size_desc;
    }

	public String getSize_code()
    {
        return size_code;
    }
    public void setSize_code(String size_code)
    {
        this.size_code = size_code;
    }

	public String getDuty_code()
    {
        return duty_code;
    }
    public void setDuty_code(String duty_code)
    {
        this.duty_code = duty_code;
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