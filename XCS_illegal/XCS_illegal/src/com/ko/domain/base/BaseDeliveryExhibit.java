








 

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

import com.ko.domain.DeliveryExhibit;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseDeliveryExhibit extends BaseDomain{
	// table
	public static final String TABLE_NAME = "DELIVERY_EXHIBIT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "DELIVERY_EXHIBIT.ID";

	// short name column
	public static final String SUBJECT_TYPECol = "SUBJECT_TYPE";

	public static final String JOB_NOCol = "JOB_NO";

	public static final String OFFCODE_TOCol = "OFFCODE_TO";

	public static final String OFFCODE_FROMCol = "OFFCODE_FROM";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String DELIVERY_BYCol = "DELIVERY_BY";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String STATUSCol = "STATUS";

	public static final String OFFCODE_INFORMCol = "OFFCODE_INFORM";

	public static final String SUBJECTCol = "SUBJECT";

	public static final String DELIVERY_DATECol = "DELIVERY_DATE";

	public static final String DELIVERY_CODECol = "DELIVERY_CODE";

	public static final String IDCol = "ID";


	// full column name
	public static final String SUBJECT_TYPEColumn = "DELIVERY_EXHIBIT.SUBJECT_TYPE";

	public static final String JOB_NOColumn = "DELIVERY_EXHIBIT.JOB_NO";

	public static final String OFFCODE_TOColumn = "DELIVERY_EXHIBIT.OFFCODE_TO";

	public static final String OFFCODE_FROMColumn = "DELIVERY_EXHIBIT.OFFCODE_FROM";

	public static final String LEGISLATION_IDColumn = "DELIVERY_EXHIBIT.LEGISLATION_ID";

	public static final String DELIVERY_BYColumn = "DELIVERY_EXHIBIT.DELIVERY_BY";

	public static final String UPDATE_ONColumn = "DELIVERY_EXHIBIT.UPDATE_ON";

	public static final String UPDATE_BYColumn = "DELIVERY_EXHIBIT.UPDATE_BY";

	public static final String CREATE_ONColumn = "DELIVERY_EXHIBIT.CREATE_ON";

	public static final String CREATE_BYColumn = "DELIVERY_EXHIBIT.CREATE_BY";

	public static final String STATUSColumn = "DELIVERY_EXHIBIT.STATUS";

	public static final String OFFCODE_INFORMColumn = "DELIVERY_EXHIBIT.OFFCODE_INFORM";

	public static final String SUBJECTColumn = "DELIVERY_EXHIBIT.SUBJECT";

	public static final String DELIVERY_DATEColumn = "DELIVERY_EXHIBIT.DELIVERY_DATE";

	public static final String DELIVERY_CODEColumn = "DELIVERY_EXHIBIT.DELIVERY_CODE";

	public static final String IDColumn = "DELIVERY_EXHIBIT.ID";


	public static final String[] ALL_COLUMNS =
    {
	 SUBJECT_TYPECol	, JOB_NOCol	, OFFCODE_TOCol	, OFFCODE_FROMCol	, LEGISLATION_IDCol	, DELIVERY_BYCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, STATUSCol	, OFFCODE_INFORMCol	, SUBJECTCol	, DELIVERY_DATECol	, DELIVERY_CODECol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  SUBJECT_TYPECol	+","+ JOB_NOCol	+","+ OFFCODE_TOCol	+","+ OFFCODE_FROMCol	+","+ LEGISLATION_IDCol	+","+ DELIVERY_BYCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ STATUSCol	+","+ OFFCODE_INFORMCol	+","+ SUBJECTCol	+","+ DELIVERY_DATECol	+","+ DELIVERY_CODECol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+SUBJECT_TYPECol+"=?,"+JOB_NOCol+"=?,"+OFFCODE_TOCol+"=?,"+OFFCODE_FROMCol+"=?,"+LEGISLATION_IDCol+"=?,"+DELIVERY_BYCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+STATUSCol+"=?,"+OFFCODE_INFORMCol+"=?,"+SUBJECTCol+"=?,"+DELIVERY_DATECol+"=?,"+DELIVERY_CODECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseDeliveryExhibit(DB db){
		super(db);
	}



public synchronized DeliveryExhibit create() throws Exception{
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
					return (DeliveryExhibit)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<DeliveryExhibit> createList(List<DeliveryExhibit> objList)throws Exception{
    	DB db = this.initDB();
    	List<DeliveryExhibit> resultList = new ArrayList<DeliveryExhibit>();
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
	public DeliveryExhibit findByPk(Long id)throws Exception{
		List<DeliveryExhibit> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<DeliveryExhibit> findByPks(List<Long> ids)throws Exception{
		List<DeliveryExhibit> resultList = new ArrayList<DeliveryExhibit>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<DeliveryExhibit> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<DeliveryExhibit> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<DeliveryExhibit> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<DeliveryExhibit> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<DeliveryExhibit> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<DeliveryExhibit> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<DeliveryExhibit> resultList = new ArrayList<DeliveryExhibit>();
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
	public List<DeliveryExhibit> findByExample(DeliveryExhibit instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<DeliveryExhibit> findByExample(DeliveryExhibit instance,PageUtil pageUtil) throws Exception{
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
	public DeliveryExhibit update()throws Exception{
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
					return (DeliveryExhibit)this;
			}else// not update
				return (DeliveryExhibit)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<DeliveryExhibit> updateList(List<DeliveryExhibit> objList)throws Exception{
		DB db = this.initDB();
		List<DeliveryExhibit> resultList = new ArrayList<DeliveryExhibit>();
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
	public Integer deleteList(List<DeliveryExhibit> objList)throws Exception {
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
	public DeliveryExhibit populate(ResultSet rs)throws Exception{
		DeliveryExhibit result = new DeliveryExhibit(this.db);
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
    private String subject_type;

    private String job_no;

    private String offcode_to;

    private String offcode_from;

    private Long legislation_id;

    private String delivery_by;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String status;

    private String offcode_inform;

    private String subject;

    private java.util.Date delivery_date;

    private String delivery_code;

    private Long id;

	//**** getter setter ****//
	public String getSubject_type()
    {
        return subject_type;
    }
    public void setSubject_type(String subject_type)
    {
        this.subject_type = subject_type;
    }

	public String getJob_no()
    {
        return job_no;
    }
    public void setJob_no(String job_no)
    {
        this.job_no = job_no;
    }

	public String getOffcode_to()
    {
        return offcode_to;
    }
    public void setOffcode_to(String offcode_to)
    {
        this.offcode_to = offcode_to;
    }

	public String getOffcode_from()
    {
        return offcode_from;
    }
    public void setOffcode_from(String offcode_from)
    {
        this.offcode_from = offcode_from;
    }

	public Long getLegislation_id()
    {
        return legislation_id;
    }
    public void setLegislation_id(Long legislation_id)
    {
        this.legislation_id = legislation_id;
    }

	public String getDelivery_by()
    {
        return delivery_by;
    }
    public void setDelivery_by(String delivery_by)
    {
        this.delivery_by = delivery_by;
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

	public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

	public String getOffcode_inform()
    {
        return offcode_inform;
    }
    public void setOffcode_inform(String offcode_inform)
    {
        this.offcode_inform = offcode_inform;
    }

	public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }

	public java.util.Date getDelivery_date()
    {
        return delivery_date;
    }
    public void setDelivery_date(java.util.Date delivery_date)
    {
        this.delivery_date = delivery_date;
    }

	public String getDelivery_code()
    {
        return delivery_code;
    }
    public void setDelivery_code(String delivery_code)
    {
        this.delivery_code = delivery_code;
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