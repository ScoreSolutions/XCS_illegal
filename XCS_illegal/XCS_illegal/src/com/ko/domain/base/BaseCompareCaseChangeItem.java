








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain.base;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.ko.domain.CompareCaseChangeItem;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseCompareCaseChangeItem extends BaseDomain{
	// table
	public static final String TABLE_NAME = "COMPARE_CASE_CHANGE_ITEM";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "COMPARE_CASE_CHANGE_ITEM.ID";

	// short name column
    public static final String CANCEL_BYCol = "CANCEL_BY";

	public static final String CANCEL_DATECol = "CANCEL_DATE";

	public static final String ISCANCELCol = "ISCANCEL";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String APPLICATION_ARREST_LAWBREAKERCol = "APPLICATION_ARREST_LAWBREAKER";

	public static final String PAPER_NOCol = "PAPER_NO";

	public static final String INV_NOCol = "INV_NO";

	public static final String BOOK_NOCol = "BOOK_NO";

	public static final String AUTO_INV_NOCol = "AUTO_INV_NO";

	public static final String COMPARE_CASE_CHANGE_IDCol = "COMPARE_CASE_CHANGE_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String CANCEL_BYColumn = "COMPARE_CASE_CHANGE_ITEM.CANCEL_BY";

	public static final String CANCEL_DATEColumn = "COMPARE_CASE_CHANGE_ITEM.CANCEL_DATE";

	public static final String ISCANCELColumn = "COMPARE_CASE_CHANGE_ITEM.ISCANCEL";

    public static final String UPDATE_ONColumn = "COMPARE_CASE_CHANGE_ITEM.UPDATE_ON";

	public static final String UPDATE_BYColumn = "COMPARE_CASE_CHANGE_ITEM.UPDATE_BY";

	public static final String CREATE_ONColumn = "COMPARE_CASE_CHANGE_ITEM.CREATE_ON";

	public static final String CREATE_BYColumn = "COMPARE_CASE_CHANGE_ITEM.CREATE_BY";

	public static final String APPLICATION_ARREST_LAWBREAKERColumn = "COMPARE_CASE_CHANGE_ITEM.APPLICATION_ARREST_LAWBREAKER";

	public static final String PAPER_NOColumn = "COMPARE_CASE_CHANGE_ITEM.PAPER_NO";

	public static final String INV_NOColumn = "COMPARE_CASE_CHANGE_ITEM.INV_NO";

	public static final String BOOK_NOColumn = "COMPARE_CASE_CHANGE_ITEM.BOOK_NO";

	public static final String AUTO_INV_NOColumn = "COMPARE_CASE_CHANGE_ITEM.AUTO_INV_NO";

	public static final String COMPARE_CASE_CHANGE_IDColumn = "COMPARE_CASE_CHANGE_ITEM.COMPARE_CASE_CHANGE_ID";

	public static final String IDColumn = "COMPARE_CASE_CHANGE_ITEM.ID";


	public static final String[] ALL_COLUMNS =
    {
	 CANCEL_BYCol	, CANCEL_DATECol	, ISCANCELCol , UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, APPLICATION_ARREST_LAWBREAKERCol	, PAPER_NOCol	, INV_NOCol	, BOOK_NOCol	, AUTO_INV_NOCol	, COMPARE_CASE_CHANGE_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  CANCEL_BYCol	+","+ CANCEL_DATECol	+","+ ISCANCELCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ APPLICATION_ARREST_LAWBREAKERCol	+","+ PAPER_NOCol	+","+ INV_NOCol	+","+ BOOK_NOCol	+","+ AUTO_INV_NOCol	+","+ COMPARE_CASE_CHANGE_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+APPLICATION_ARREST_LAWBREAKERCol+"=?,"+PAPER_NOCol+"=?,"+INV_NOCol+"=?,"+BOOK_NOCol+"=?,"+AUTO_INV_NOCol+"=?,"+COMPARE_CASE_CHANGE_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseCompareCaseChangeItem(DB db){
		super(db);
	}



public synchronized CompareCaseChangeItem create() throws Exception{
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
					return (CompareCaseChangeItem)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<CompareCaseChangeItem> createList(List<CompareCaseChangeItem> objList)throws Exception{
    	DB db = this.initDB();
    	List<CompareCaseChangeItem> resultList = new ArrayList<CompareCaseChangeItem>();
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
	public CompareCaseChangeItem findByPk(Long id)throws Exception{
		List<CompareCaseChangeItem> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<CompareCaseChangeItem> findByPks(List<Long> ids)throws Exception{
		List<CompareCaseChangeItem> resultList = new ArrayList<CompareCaseChangeItem>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<CompareCaseChangeItem> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<CompareCaseChangeItem> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<CompareCaseChangeItem> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<CompareCaseChangeItem> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<CompareCaseChangeItem> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<CompareCaseChangeItem> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<CompareCaseChangeItem> resultList = new ArrayList<CompareCaseChangeItem>();
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
	public List<CompareCaseChangeItem> findByExample(CompareCaseChangeItem instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<CompareCaseChangeItem> findByExample(CompareCaseChangeItem instance,PageUtil pageUtil) throws Exception{
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
	public CompareCaseChangeItem update()throws Exception{
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
					return (CompareCaseChangeItem)this;
			}else// not update
				return (CompareCaseChangeItem)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<CompareCaseChangeItem> updateList(List<CompareCaseChangeItem> objList)throws Exception{
		DB db = this.initDB();
		List<CompareCaseChangeItem> resultList = new ArrayList<CompareCaseChangeItem>();
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
	public Integer deleteList(List<CompareCaseChangeItem> objList)throws Exception {
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
	public CompareCaseChangeItem populate(ResultSet rs)throws Exception{
		CompareCaseChangeItem result = new CompareCaseChangeItem(this.db);
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
    private String cancel_by;

    private java.util.Date cancel_date;

    private String iscancel;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private Long application_arrest_lawbreaker;

    private String paper_no;

    private String inv_no;

    private String book_no;

    private String auto_inv_no;

    private Long compare_case_change_id;

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

	public Long getApplication_arrest_lawbreaker()
    {
        return application_arrest_lawbreaker;
    }
    public void setApplication_arrest_lawbreaker(Long application_arrest_lawbreaker)
    {
        this.application_arrest_lawbreaker = application_arrest_lawbreaker;
    }

	public String getPaper_no()
    {
        return paper_no;
    }
    public void setPaper_no(String paper_no)
    {
        this.paper_no = paper_no;
    }

	public String getInv_no()
    {
        return inv_no;
    }
    public void setInv_no(String inv_no)
    {
        this.inv_no = inv_no;
    }

	public String getBook_no()
    {
        return book_no;
    }
    public void setBook_no(String book_no)
    {
        this.book_no = book_no;
    }

	public String getAuto_inv_no()
    {
        return auto_inv_no;
    }
    public void setAuto_inv_no(String auto_inv_no)
    {
        this.auto_inv_no = auto_inv_no;
    }

	public Long getCompare_case_change_id()
    {
        return compare_case_change_id;
    }
    public void setCompare_case_change_id(Long compare_case_change_id)
    {
        this.compare_case_change_id = compare_case_change_id;
    }

	public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

    public String getCancel_by() {
        return cancel_by;
    }

    public void setCancel_by(String cancel_by) {
        this.cancel_by = cancel_by;
    }

    public Date getCancel_date() {
        return cancel_date;
    }

    public void setCancel_date(Date cancel_date) {
        this.cancel_date = cancel_date;
    }

    public String getIscancel() {
        return iscancel;
    }

    public void setIscancel(String iscancel) {
        this.iscancel = iscancel;
    }
}