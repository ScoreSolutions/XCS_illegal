








 

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

import com.ko.domain.SendIncome;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseSendIncome extends BaseDomain{
	// table
	public static final String TABLE_NAME = "SEND_INCOME";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "SEND_INCOME.ID";

	// short name column
	public static final String POSNAME_LEANCol = "POSNAME_LEAN";
	
	public static final String STATUSCol = "STATUS";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String INV_NOCol = "INV_NO";

	public static final String POSCODE_APPROVECol = "POSCODE_APPROVE";

	public static final String STAFF_ID_APPROVECol = "STAFF_ID_APPROVE";

	public static final String POSCODE_SENDCol = "POSCODE_SEND";

	public static final String STAFF_ID_SENDCol = "STAFF_ID_SEND";

	public static final String FINE_DATE_TOCol = "FINE_DATE_TO";

	public static final String FINE_DATE_FROMCol = "FINE_DATE_FROM";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String OFFCODE_AREACol = "OFFCODE_AREA";

	public static final String OFFNAME_WRITECol = "OFFNAME_WRITE";

	public static final String OFFCODE_WRITECol = "OFFCODE_WRITE";

	public static final String SEND_DOC_NOCol = "SEND_DOC_NO";

	public static final String SEND_DATECol = "SEND_DATE";

	public static final String SEND_NOCol = "SEND_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String POSNAME_LEANColumn = "SEND_INCOME.POSNAME_LEAN";
	
	public static final String STATUSColumn = "SEND_INCOME.STATUS";

	public static final String UPDATE_ONColumn = "SEND_INCOME.UPDATE_ON";

	public static final String UPDATE_BYColumn = "SEND_INCOME.UPDATE_BY";

	public static final String CREATE_ONColumn = "SEND_INCOME.CREATE_ON";

	public static final String CREATE_BYColumn = "SEND_INCOME.CREATE_BY";

	public static final String INV_NOColumn = "SEND_INCOME.INV_NO";

	public static final String POSCODE_APPROVEColumn = "SEND_INCOME.POSCODE_APPROVE";

	public static final String STAFF_ID_APPROVEColumn = "SEND_INCOME.STAFF_ID_APPROVE";

	public static final String POSCODE_SENDColumn = "SEND_INCOME.POSCODE_SEND";

	public static final String STAFF_ID_SENDColumn = "SEND_INCOME.STAFF_ID_SEND";

	public static final String FINE_DATE_TOColumn = "SEND_INCOME.FINE_DATE_TO";

	public static final String FINE_DATE_FROMColumn = "SEND_INCOME.FINE_DATE_FROM";

	public static final String LEGISLATION_IDColumn = "SEND_INCOME.LEGISLATION_ID";

	public static final String OFFCODE_AREAColumn = "SEND_INCOME.OFFCODE_AREA";

	public static final String OFFNAME_WRITEColumn = "SEND_INCOME.OFFNAME_WRITE";

	public static final String OFFCODE_WRITEColumn = "SEND_INCOME.OFFCODE_WRITE";

	public static final String SEND_DOC_NOColumn = "SEND_INCOME.SEND_DOC_NO";

	public static final String SEND_DATEColumn = "SEND_INCOME.SEND_DATE";

	public static final String SEND_NOColumn = "SEND_INCOME.SEND_NO";

	public static final String IDColumn = "SEND_INCOME.ID";


	public static final String[] ALL_COLUMNS =
    {
	 POSNAME_LEANCol , STATUSCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, INV_NOCol	, POSCODE_APPROVECol	, STAFF_ID_APPROVECol	, POSCODE_SENDCol	, STAFF_ID_SENDCol	, FINE_DATE_TOCol	, FINE_DATE_FROMCol	, LEGISLATION_IDCol	, OFFCODE_AREACol	, OFFNAME_WRITECol	, OFFCODE_WRITECol	, SEND_DOC_NOCol	, SEND_DATECol	, SEND_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  POSNAME_LEANCol + ", " + STATUSCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ INV_NOCol	+","+ POSCODE_APPROVECol	+","+ STAFF_ID_APPROVECol	+","+ POSCODE_SENDCol	+","+ STAFF_ID_SENDCol	+","+ FINE_DATE_TOCol	+","+ FINE_DATE_FROMCol	+","+ LEGISLATION_IDCol	+","+ OFFCODE_AREACol	+","+ OFFNAME_WRITECol	+","+ OFFCODE_WRITECol	+","+ SEND_DOC_NOCol	+","+ SEND_DATECol	+","+ SEND_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+STATUSCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+INV_NOCol+"=?,"+POSCODE_APPROVECol+"=?,"+STAFF_ID_APPROVECol+"=?,"+POSCODE_SENDCol+"=?,"+STAFF_ID_SENDCol+"=?,"+FINE_DATE_TOCol+"=?,"+FINE_DATE_FROMCol+"=?,"+LEGISLATION_IDCol+"=?,"+OFFCODE_AREACol+"=?,"+OFFNAME_WRITECol+"=?,"+OFFCODE_WRITECol+"=?,"+SEND_DOC_NOCol+"=?,"+SEND_DATECol+"=?,"+SEND_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseSendIncome(DB db){
		super(db);
	}



public synchronized SendIncome create() throws Exception{
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
					return (SendIncome)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SendIncome> createList(List<SendIncome> objList)throws Exception{
    	DB db = this.initDB();
    	List<SendIncome> resultList = new ArrayList<SendIncome>();
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
	public SendIncome findByPk(Long id)throws Exception{
		List<SendIncome> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<SendIncome> findByPks(List<Long> ids)throws Exception{
		List<SendIncome> resultList = new ArrayList<SendIncome>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<SendIncome> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<SendIncome> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<SendIncome> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<SendIncome> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<SendIncome> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<SendIncome> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<SendIncome> resultList = new ArrayList<SendIncome>();
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
	public List<SendIncome> findByExample(SendIncome instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<SendIncome> findByExample(SendIncome instance,PageUtil pageUtil) throws Exception{
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
	public SendIncome update()throws Exception{
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
					return (SendIncome)this;
			}else// not update
				return (SendIncome)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SendIncome> updateList(List<SendIncome> objList)throws Exception{
		DB db = this.initDB();
		List<SendIncome> resultList = new ArrayList<SendIncome>();
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
	public Integer deleteList(List<SendIncome> objList)throws Exception {
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
	public SendIncome populate(ResultSet rs)throws Exception{
		SendIncome result = new SendIncome(this.db);
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
    private String posname_lean;
    
    private String status;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String inv_no;

    private String poscode_approve;

    private String staff_id_approve;

    private String poscode_send;

    private String staff_id_send;

    private java.util.Date fine_date_to;

    private java.util.Date fine_date_from;

    private Long legislation_id;

    private String offcode_area;

    private String offname_write;

    private String offcode_write;

    private String send_doc_no;

    private java.util.Date send_date;

    private String send_no;

    private Long id;

	//**** getter setter ****//
    public String getPosname_lean(){
    	return posname_lean;
    }
    public void setPosname_lean(String value){
    	posname_lean = value;
    }
    
	public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
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

	public String getInv_no()
    {
        return inv_no;
    }
    public void setInv_no(String inv_no)
    {
        this.inv_no = inv_no;
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

	public String getPoscode_send()
    {
        return poscode_send;
    }
    public void setPoscode_send(String poscode_send)
    {
        this.poscode_send = poscode_send;
    }

	public String getStaff_id_send()
    {
        return staff_id_send;
    }
    public void setStaff_id_send(String staff_id_send)
    {
        this.staff_id_send = staff_id_send;
    }

	public java.util.Date getFine_date_to()
    {
        return fine_date_to;
    }
    public void setFine_date_to(java.util.Date fine_date_to)
    {
        this.fine_date_to = fine_date_to;
    }

	public java.util.Date getFine_date_from()
    {
        return fine_date_from;
    }
    public void setFine_date_from(java.util.Date fine_date_from)
    {
        this.fine_date_from = fine_date_from;
    }

	public Long getLegislation_id()
    {
        return legislation_id;
    }
    public void setLegislation_id(Long legislation_id)
    {
        this.legislation_id = legislation_id;
    }

	public String getOffcode_area()
    {
        return offcode_area;
    }
    public void setOffcode_area(String offcode_area)
    {
        this.offcode_area = offcode_area;
    }

	public String getOffname_write()
    {
        return offname_write;
    }
    public void setOffname_write(String offname_write)
    {
        this.offname_write = offname_write;
    }

	public String getOffcode_write()
    {
        return offcode_write;
    }
    public void setOffcode_write(String offcode_write)
    {
        this.offcode_write = offcode_write;
    }

	public String getSend_doc_no()
    {
        return send_doc_no;
    }
    public void setSend_doc_no(String send_doc_no)
    {
        this.send_doc_no = send_doc_no;
    }

	public java.util.Date getSend_date()
    {
        return send_date;
    }
    public void setSend_date(java.util.Date send_date)
    {
        this.send_date = send_date;
    }

	public String getSend_no()
    {
        return send_no;
    }
    public void setSend_no(String send_no)
    {
        this.send_no = send_no;
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