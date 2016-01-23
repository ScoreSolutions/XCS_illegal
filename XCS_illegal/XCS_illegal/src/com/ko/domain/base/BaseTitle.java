








 

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

import com.ko.domain.Title;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseTitle extends BaseDomain{
	// table
	public static final String TABLE_NAME = "TITLE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "TITLE.ID";

	// short name column
	public static final String UPD_DATECol = "UPD_DATE";

	public static final String UPD_USERIDCol = "UPD_USERID";

	public static final String END_DATECol = "END_DATE";

	public static final String BEGIN_DATECol = "BEGIN_DATE";

	public static final String TITLE_SEOCol = "TITLE_SEO";

	public static final String SHORT_SUFFIXCol = "SHORT_SUFFIX";

	public static final String SUFFIX_NAMECol = "SUFFIX_NAME";

	public static final String SHORT_TITLECol = "SHORT_TITLE";

	public static final String TITLE_NAMECol = "TITLE_NAME";

	public static final String TITLE_TYPECol = "TITLE_TYPE";

	public static final String TITLE_CODECol = "TITLE_CODE";
	
	public static final String IDCol = "ID";


	// full column name
	public static final String UPD_DATEColumn = "TITLE.UPD_DATE";

	public static final String UPD_USERIDColumn = "TITLE.UPD_USERID";

	public static final String END_DATEColumn = "TITLE.END_DATE";

	public static final String BEGIN_DATEColumn = "TITLE.BEGIN_DATE";

	public static final String TITLE_SEOColumn = "TITLE.TITLE_SEO";

	public static final String SHORT_SUFFIXColumn = "TITLE.SHORT_SUFFIX";

	public static final String SUFFIX_NAMEColumn = "TITLE.SUFFIX_NAME";

	public static final String SHORT_TITLEColumn = "TITLE.SHORT_TITLE";

	public static final String TITLE_NAMEColumn = "TITLE.TITLE_NAME";

	public static final String TITLE_TYPEColumn = "TITLE.TITLE_TYPE";

	public static final String TITLE_CODEColumn = "TITLE.TITLE_CODE";
	
	public static final String IDColumn = "TITLE.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPD_DATECol	, UPD_USERIDCol	, END_DATECol	, BEGIN_DATECol	, TITLE_SEOCol	, SHORT_SUFFIXCol	, SUFFIX_NAMECol	, SHORT_TITLECol	, TITLE_NAMECol	, TITLE_TYPECol, TITLE_CODECol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPD_DATECol	+","+ UPD_USERIDCol	+","+ END_DATECol	+","+ BEGIN_DATECol	+","+ TITLE_SEOCol	+","+ SHORT_SUFFIXCol	+","+ SUFFIX_NAMECol	+","+ SHORT_TITLECol	+","+ TITLE_NAMECol	+","+ TITLE_TYPECol + ", " + TITLE_CODECol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPD_DATECol+"=?,"+UPD_USERIDCol+"=?,"+END_DATECol+"=?,"+BEGIN_DATECol+"=?,"+TITLE_SEOCol+"=?,"+SHORT_SUFFIXCol+"=?,"+SUFFIX_NAMECol+"=?,"+SHORT_TITLECol+"=?,"+TITLE_NAMECol+"=?,"+TITLE_TYPECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseTitle(DB db){
		super(db);
	}



public synchronized Title create() throws Exception{
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
	 				this.title_code = new String(rs.getString(1));
					return (Title)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Title> createList(List<Title> objList)throws Exception{
    	DB db = this.initDB();
    	List<Title> resultList = new ArrayList<Title>();
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
	public Title findByPk(String id)throws Exception{
		List<Title> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<Title> findByPks(List<String> ids)throws Exception{
		List<Title> resultList = new ArrayList<Title>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<Title> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<Title> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<Title> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<Title> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<Title> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<Title> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<Title> resultList = new ArrayList<Title>();
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
	public List<Title> findByExample(Title instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<Title> findByExample(Title instance,PageUtil pageUtil) throws Exception{
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
	public Title update()throws Exception{
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
					objList.add(this.title_code);// pk
			}
			if( parameter.length()> 0 ){
				String sql_update = SQL_UPDATE+parameter.substring(0, parameter.lastIndexOf(","));
				//System.out.println(sql_update);
				//System.out.println("obj"+objList);
				prep = db.getParameterizedStatement(db.appendWhere(sql_update,pkCol+"=?"), objList.toArray());
				if( prep.executeUpdate() == 1 )
					return (Title)this;
			}else// not update
				return (Title)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Title> updateList(List<Title> objList)throws Exception{
		DB db = this.initDB();
		List<Title> resultList = new ArrayList<Title>();
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
		return this.deleteByPk(this.title_code);
	}
	public Integer deleteList(List<Title> objList)throws Exception {
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
	public Integer deleteByPk(String id) throws Exception {
		return this.deleteByWhere(pkCol+"=?",id);
	}
	public Integer deleteByPks(List<String> ids)throws Exception {
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
	public Title populate(ResultSet rs)throws Exception{
		Title result = new Title(this.db);
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

    private Long title_seo;

    private String short_suffix;

    private String suffix_name;

    private String short_title;

    private String title_name;

    private String title_type;

    private String title_code;
    
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

	public Long getTitle_seo()
    {
        return title_seo;
    }
    public void setTitle_seo(Long title_seo)
    {
        this.title_seo = title_seo;
    }

	public String getShort_suffix()
    {
        return short_suffix;
    }
    public void setShort_suffix(String short_suffix)
    {
        this.short_suffix = short_suffix;
    }

	public String getSuffix_name()
    {
        return suffix_name;
    }
    public void setSuffix_name(String suffix_name)
    {
        this.suffix_name = suffix_name;
    }

	public String getShort_title()
    {
        return short_title;
    }
    public void setShort_title(String short_title)
    {
        this.short_title = short_title;
    }

	public String getTitle_name()
    {
        return title_name;
    }
    public void setTitle_name(String title_name)
    {
        this.title_name = title_name;
    }

	public String getTitle_type()
    {
        return title_type;
    }
    public void setTitle_type(String title_type)
    {
        this.title_type = title_type;
    }

	public String getTitle_code()
    {
        return title_code;
    }
    public void setTitle_code(String title_code)
    {
        this.title_code = title_code;
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