








 

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

import com.ko.domain.BookImpeachment;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseBookImpeachment extends BaseDomain{
	// table
	public static final String TABLE_NAME = "BOOK_IMPEACHMENT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "BOOK_IMPEACHMENT.ID";

	// short name column
	public static final String CASE_NONE_OFFICECol = "CASE_NONE_OFFICE";
	
	public static final String CASE_FINECol = "CASE_FINE";

	public static final String CASE_LAST_DATECol = "CASE_LAST_DATE";

	public static final String CASE_RESULTCol = "CASE_RESULT";

	public static final String CASE_LASTCol = "CASE_LAST";

	public static final String CASE_QUALITYCol = "CASE_QUALITY";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String STAFF_ID_SUECol = "STAFF_ID_SUE";

	public static final String CASE_DATECol = "CASE_DATE";

	public static final String CASE_IDCol = "CASE_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String CASE_NONE_OFFICEColumn = "BOOK_IMPEACHMENT.CASE_NONE_OFFICE";
	
	public static final String CASE_FINEColumn = "BOOK_IMPEACHMENT.CASE_FINE";

	public static final String CASE_LAST_DATEColumn = "BOOK_IMPEACHMENT.CASE_LAST_DATE";

	public static final String CASE_RESULTColumn = "BOOK_IMPEACHMENT.CASE_RESULT";

	public static final String CASE_LASTColumn = "BOOK_IMPEACHMENT.CASE_LAST";

	public static final String CASE_QUALITYColumn = "BOOK_IMPEACHMENT.CASE_QUALITY";

	public static final String UPDATE_ONColumn = "BOOK_IMPEACHMENT.UPDATE_ON";

	public static final String UPDATE_BYColumn = "BOOK_IMPEACHMENT.UPDATE_BY";

	public static final String CREATE_ONColumn = "BOOK_IMPEACHMENT.CREATE_ON";

	public static final String CREATE_BYColumn = "BOOK_IMPEACHMENT.CREATE_BY";

	public static final String TRACK_NOColumn = "BOOK_IMPEACHMENT.TRACK_NO";

	public static final String STAFF_ID_SUEColumn = "BOOK_IMPEACHMENT.STAFF_ID_SUE";

	public static final String CASE_DATEColumn = "BOOK_IMPEACHMENT.CASE_DATE";

	public static final String CASE_IDColumn = "BOOK_IMPEACHMENT.CASE_ID";

	public static final String IDColumn = "BOOK_IMPEACHMENT.ID";


	public static final String[] ALL_COLUMNS =
    {
	 CASE_NONE_OFFICECol, CASE_FINECol	, CASE_LAST_DATECol	, CASE_RESULTCol	, CASE_LASTCol	, CASE_QUALITYCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, TRACK_NOCol	, STAFF_ID_SUECol	, CASE_DATECol	, CASE_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING = CASE_NONE_OFFICECol + "," + CASE_FINECol	+","+ CASE_LAST_DATECol	+","+ CASE_RESULTCol	+","+ CASE_LASTCol	+","+ CASE_QUALITYCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ TRACK_NOCol	+","+ STAFF_ID_SUECol	+","+ CASE_DATECol	+","+ CASE_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+CASE_FINECol+"=?,"+CASE_LAST_DATECol+"=?,"+CASE_RESULTCol+"=?,"+CASE_LASTCol+"=?,"+CASE_QUALITYCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+TRACK_NOCol+"=?,"+STAFF_ID_SUECol+"=?,"+CASE_DATECol+"=?,"+CASE_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseBookImpeachment(DB db){
		super(db);
	}



public synchronized BookImpeachment create() throws Exception{
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
					return (BookImpeachment)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<BookImpeachment> createList(List<BookImpeachment> objList)throws Exception{
    	DB db = this.initDB();
    	List<BookImpeachment> resultList = new ArrayList<BookImpeachment>();
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
	public BookImpeachment findByPk(Long id)throws Exception{
		List<BookImpeachment> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<BookImpeachment> findByPks(List<Long> ids)throws Exception{
		List<BookImpeachment> resultList = new ArrayList<BookImpeachment>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<BookImpeachment> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<BookImpeachment> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<BookImpeachment> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<BookImpeachment> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<BookImpeachment> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<BookImpeachment> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<BookImpeachment> resultList = new ArrayList<BookImpeachment>();
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
	public List<BookImpeachment> findByExample(BookImpeachment instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<BookImpeachment> findByExample(BookImpeachment instance,PageUtil pageUtil) throws Exception{
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
	public BookImpeachment update()throws Exception{
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
					return (BookImpeachment)this;
			}else// not update
				return (BookImpeachment)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<BookImpeachment> updateList(List<BookImpeachment> objList)throws Exception{
		DB db = this.initDB();
		List<BookImpeachment> resultList = new ArrayList<BookImpeachment>();
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
	public Integer deleteList(List<BookImpeachment> objList)throws Exception {
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
	public BookImpeachment populate(ResultSet rs)throws Exception{
		BookImpeachment result = new BookImpeachment(this.db);
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
    private String case_none_office;
    
    private Double case_fine;

    private java.util.Date case_last_date;

    private String case_result;

    private String case_last;

    private String case_quality;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String track_no;

    private Long staff_id_sue;

    private java.util.Date case_date;

    private String case_id;

    private Long id;

	//**** getter setter ****//
    public String getCase_none_office(){
    	return case_none_office;
    }
    public void setCase_none_office(String value){
    	case_none_office=value;
    }
    
	public Double getCase_fine()
    {
        return case_fine;
    }
    public void setCase_fine(Double case_fine)
    {
        this.case_fine = case_fine;
    }

	public java.util.Date getCase_last_date()
    {
        return case_last_date;
    }
    public void setCase_last_date(java.util.Date case_last_date)
    {
        this.case_last_date = case_last_date;
    }

	public String getCase_result()
    {
        return case_result;
    }
    public void setCase_result(String case_result)
    {
        this.case_result = case_result;
    }

	public String getCase_last()
    {
        return case_last;
    }
    public void setCase_last(String case_last)
    {
        this.case_last = case_last;
    }

	public String getCase_quality()
    {
        return case_quality;
    }
    public void setCase_quality(String case_quality)
    {
        this.case_quality = case_quality;
    }

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

	public String getTrack_no()
    {
        return track_no;
    }
    public void setTrack_no(String track_no)
    {
        this.track_no = track_no;
    }

	public Long getStaff_id_sue()
    {
        return staff_id_sue;
    }
    public void setStaff_id_sue(Long staff_id_sue)
    {
        this.staff_id_sue = staff_id_sue;
    }

	public java.util.Date getCase_date()
    {
        return case_date;
    }
    public void setCase_date(java.util.Date case_date)
    {
        this.case_date = case_date;
    }

	public String getCase_id()
    {
        return case_id;
    }
    public void setCase_id(String case_id)
    {
        this.case_id = case_id;
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