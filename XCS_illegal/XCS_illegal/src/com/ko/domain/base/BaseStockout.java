








 

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

import com.ko.domain.Stockout;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseStockout extends BaseDomain{
	// table
	public static final String TABLE_NAME = "STOCKOUT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "STOCKOUT.ID";

	// short name column
	public static final String GROUP_IDCol = "GROUP_ID";
	
	public static final String REPORT_TO_POSNAMECol = "REPORT_TO_POSNAME";
	
	public static final String SUBJECT_TYPECol = "SUBJECT_TYPE";

	public static final String TRANSFER_BYCol = "TRANSFER_BY";

	public static final String JOB_NOCol = "JOB_NO";

	public static final String OFFCODE_TOCol = "OFFCODE_TO";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String STATUSCol = "STATUS";

	public static final String REMARKSCol = "REMARKS";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String REPORT_TO_STAFFCol = "REPORT_TO_STAFF";

	public static final String SUBJECTCol = "SUBJECT";

	public static final String OFFCODECol = "OFFCODE";

	public static final String STOCKOUT_DATECol = "STOCKOUT_DATE";

	public static final String STOCKOUT_CODECol = "STOCKOUT_CODE";

	public static final String STOCKOUT_TYPECol = "STOCKOUT_TYPE";

	public static final String IDCol = "ID";


	// full column name
	public static final String GROUP_IDColumn = "STOCKOUT.GROUP_ID";
	
	public static final String REPORT_TO_POSNAMEColumn = "STOCKOUT.REPORT_TO_POSNAME";
	
	public static final String SUBJECT_TYPEColumn = "STOCKOUT.SUBJECT_TYPE";

	public static final String TRANSFER_BYColumn = "STOCKOUT.TRANSFER_BY";

	public static final String JOB_NOColumn = "STOCKOUT.JOB_NO";

	public static final String OFFCODE_TOColumn = "STOCKOUT.OFFCODE_TO";

	public static final String UPDATE_ONColumn = "STOCKOUT.UPDATE_ON";

	public static final String UPDATE_BYColumn = "STOCKOUT.UPDATE_BY";

	public static final String CREATE_ONColumn = "STOCKOUT.CREATE_ON";

	public static final String CREATE_BYColumn = "STOCKOUT.CREATE_BY";

	public static final String STATUSColumn = "STOCKOUT.STATUS";

	public static final String REMARKSColumn = "STOCKOUT.REMARKS";

	public static final String LEGISLATION_IDColumn = "STOCKOUT.LEGISLATION_ID";

	public static final String REPORT_TO_STAFFColumn = "STOCKOUT.REPORT_TO_STAFF";

	public static final String SUBJECTColumn = "STOCKOUT.SUBJECT";

	public static final String OFFCODEColumn = "STOCKOUT.OFFCODE";

	public static final String STOCKOUT_DATEColumn = "STOCKOUT.STOCKOUT_DATE";

	public static final String STOCKOUT_CODEColumn = "STOCKOUT.STOCKOUT_CODE";

	public static final String STOCKOUT_TYPEColumn = "STOCKOUT.STOCKOUT_TYPE";

	public static final String IDColumn = "STOCKOUT.ID";


	public static final String[] ALL_COLUMNS =
    {
	 GROUP_IDCol, REPORT_TO_POSNAMECol, SUBJECT_TYPECol	, TRANSFER_BYCol	, JOB_NOCol	, OFFCODE_TOCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, STATUSCol	, REMARKSCol	, LEGISLATION_IDCol	, REPORT_TO_STAFFCol	, SUBJECTCol	, OFFCODECol	, STOCKOUT_DATECol	, STOCKOUT_CODECol	, STOCKOUT_TYPECol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  GROUP_IDCol + ", " + REPORT_TO_POSNAMECol + ", " + SUBJECT_TYPECol	+","+ TRANSFER_BYCol	+","+ JOB_NOCol	+","+ OFFCODE_TOCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ STATUSCol	+","+ REMARKSCol	+","+ LEGISLATION_IDCol	+","+ REPORT_TO_STAFFCol	+","+ SUBJECTCol	+","+ OFFCODECol	+","+ STOCKOUT_DATECol	+","+ STOCKOUT_CODECol	+","+ STOCKOUT_TYPECol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+SUBJECT_TYPECol+"=?,"+TRANSFER_BYCol+"=?,"+JOB_NOCol+"=?,"+OFFCODE_TOCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+STATUSCol+"=?,"+REMARKSCol+"=?,"+LEGISLATION_IDCol+"=?,"+REPORT_TO_STAFFCol+"=?,"+SUBJECTCol+"=?,"+OFFCODECol+"=?,"+STOCKOUT_DATECol+"=?,"+STOCKOUT_CODECol+"=?,"+STOCKOUT_TYPECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseStockout(DB db){
		super(db);
	}



public synchronized Stockout create() throws Exception{
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
					return (Stockout)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Stockout> createList(List<Stockout> objList)throws Exception{
    	DB db = this.initDB();
    	List<Stockout> resultList = new ArrayList<Stockout>();
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
	public Stockout findByPk(Long id)throws Exception{
		List<Stockout> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<Stockout> findByPks(List<Long> ids)throws Exception{
		List<Stockout> resultList = new ArrayList<Stockout>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<Stockout> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<Stockout> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<Stockout> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<Stockout> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<Stockout> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<Stockout> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<Stockout> resultList = new ArrayList<Stockout>();
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
	public List<Stockout> findByExample(Stockout instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<Stockout> findByExample(Stockout instance,PageUtil pageUtil) throws Exception{
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
	public Stockout update()throws Exception{
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
					return (Stockout)this;
			}else// not update
				return (Stockout)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Stockout> updateList(List<Stockout> objList)throws Exception{
		DB db = this.initDB();
		List<Stockout> resultList = new ArrayList<Stockout>();
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
	public Integer deleteList(List<Stockout> objList)throws Exception {
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
	public Stockout populate(ResultSet rs)throws Exception{
		Stockout result = new Stockout(this.db);
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
    private String group_id;
    
    private String report_to_posname;
    
    private String subject_type;

    private String transfer_by;

    private String job_no;

    private String offcode_to;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String status;

    private String remarks;

    private Long legislation_id;

    private String report_to_staff;

    private String subject;

    private String offcode;

    private java.util.Date stockout_date;

    private String stockout_code;

    private String stockout_type;

    private Long id;

	//**** getter setter ****//
    public String getGroup_id(){
    	return group_id;
    }
    public void setGroup_id(String value){
    	group_id = value;
    }
    
    public String getReport_to_posname(){
    	return report_to_posname;
    }
    public void setReport_to_posname(String value){
    	report_to_posname = value;
    }
    
	public String getSubject_type()
    {
        return subject_type;
    }
    public void setSubject_type(String subject_type)
    {
        this.subject_type = subject_type;
    }

	public String getTransfer_by()
    {
        return transfer_by;
    }
    public void setTransfer_by(String transfer_by)
    {
        this.transfer_by = transfer_by;
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

	public String getRemarks()
    {
        return remarks;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

	public Long getLegislation_id()
    {
        return legislation_id;
    }
    public void setLegislation_id(Long legislation_id)
    {
        this.legislation_id = legislation_id;
    }

	public String getReport_to_staff()
    {
        return report_to_staff;
    }
    public void setReport_to_staff(String report_to_staff)
    {
        this.report_to_staff = report_to_staff;
    }

	public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }

	public String getOffcode()
    {
        return offcode;
    }
    public void setOffcode(String offcode)
    {
        this.offcode = offcode;
    }

	public java.util.Date getStockout_date()
    {
        return stockout_date;
    }
    public void setStockout_date(java.util.Date stockout_date)
    {
        this.stockout_date = stockout_date;
    }

	public String getStockout_code()
    {
        return stockout_code;
    }
    public void setStockout_code(String stockout_code)
    {
        this.stockout_code = stockout_code;
    }

	public String getStockout_type()
    {
        return stockout_type;
    }
    public void setStockout_type(String stockout_type)
    {
        this.stockout_type = stockout_type;
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