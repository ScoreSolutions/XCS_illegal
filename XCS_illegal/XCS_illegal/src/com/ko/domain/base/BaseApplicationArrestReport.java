








 

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
import org.jfree.util.Log;

import com.ko.domain.ApplicationArrestReport;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationArrestReport extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_ARREST_REPORT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_ARREST_REPORT.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String HELPER_NAMECol = "HELPER_NAME";

	public static final String REPORT_COMMANDCol = "REPORT_COMMAND";

	public static final String STAFF_POSNAME_SUECol = "STAFF_POSNAME_SUE";

	public static final String STAFF_NAME_SUECol = "STAFF_NAME_SUE";

	public static final String COMMANDER_COMMENTCol = "COMMANDER_COMMENT";

	public static final String ARREST_DESCCol = "ARREST_DESC";

	public static final String COMMANDER_NAMECol = "COMMANDER_NAME";

	public static final String ACCUSER_NAMECol = "ACCUSER_NAME";

	public static final String ISCOMPARECol = "ISCOMPARE";

	public static final String ISNOTICECol = "ISNOTICE";

	public static final String LAWBREAKER_NAMECol = "LAWBREAKER_NAME";

	public static final String NATURE_INVESTCol = "NATURE_INVEST";

	public static final String EXHIBIT_DESCCol = "EXHIBIT_DESC";

	public static final String REPORT_TITLECol = "REPORT_TITLE";

	public static final String CASE_DATECol = "CASE_DATE";
	
	public static final String JOB_NOCol = "JOB_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPDATE_ONColumn = "APPLICATION_ARREST_REPORT.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_ARREST_REPORT.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_ARREST_REPORT.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_ARREST_REPORT.CREATE_BY";

	public static final String HELPER_NAMEColumn = "APPLICATION_ARREST_REPORT.HELPER_NAME";

	public static final String REPORT_COMMANDColumn = "APPLICATION_ARREST_REPORT.REPORT_COMMAND";

	public static final String STAFF_POSNAME_SUEColumn = "APPLICATION_ARREST_REPORT.STAFF_POSNAME_SUE";

	public static final String STAFF_NAME_SUEColumn = "APPLICATION_ARREST_REPORT.STAFF_NAME_SUE";

	public static final String COMMANDER_COMMENTColumn = "APPLICATION_ARREST_REPORT.COMMANDER_COMMENT";

	public static final String ARREST_DESCColumn = "APPLICATION_ARREST_REPORT.ARREST_DESC";

	public static final String COMMANDER_NAMEColumn = "APPLICATION_ARREST_REPORT.COMMANDER_NAME";

	public static final String ACCUSER_NAMEColumn = "APPLICATION_ARREST_REPORT.ACCUSER_NAME";

	public static final String ISCOMPAREColumn = "APPLICATION_ARREST_REPORT.ISCOMPARE";

	public static final String ISNOTICEColumn = "APPLICATION_ARREST_REPORT.ISNOTICE";

	public static final String LAWBREAKER_NAMEColumn = "APPLICATION_ARREST_REPORT.LAWBREAKER_NAME";

	public static final String NATURE_INVESTColumn = "APPLICATION_ARREST_REPORT.NATURE_INVEST";

	public static final String EXHIBIT_DESCColumn = "APPLICATION_ARREST_REPORT.EXHIBIT_DESC";

	public static final String REPORT_TITLEColumn = "APPLICATION_ARREST_REPORT.REPORT_TITLE";

	public static final String CASE_DATEColumn = "APPLICATION_ARREST_REPORT.CASE_DATE";
	
	public static final String JOB_NOColumn = "APPLICATION_ARREST_REPORT.JOB_NO";

	public static final String IDColumn = "APPLICATION_ARREST_REPORT.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, HELPER_NAMECol	, REPORT_COMMANDCol	, STAFF_POSNAME_SUECol	, STAFF_NAME_SUECol	, COMMANDER_COMMENTCol	, ARREST_DESCCol	, COMMANDER_NAMECol	, ACCUSER_NAMECol	, ISCOMPARECol	, ISNOTICECol	, LAWBREAKER_NAMECol	, NATURE_INVESTCol	, EXHIBIT_DESCCol	, REPORT_TITLECol, CASE_DATECol	, JOB_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ HELPER_NAMECol	+","+ REPORT_COMMANDCol	+","+ STAFF_POSNAME_SUECol	+","+ STAFF_NAME_SUECol	+","+ COMMANDER_COMMENTCol	+","+ ARREST_DESCCol	+","+ COMMANDER_NAMECol	+","+ ACCUSER_NAMECol	+","+ ISCOMPARECol	+","+ ISNOTICECol	+","+ LAWBREAKER_NAMECol	+","+ NATURE_INVESTCol	+","+ EXHIBIT_DESCCol	+","+ REPORT_TITLECol+","+ CASE_DATECol	+","+ JOB_NOCol	+","+ pkCol;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationArrestReport(DB db){
		super(db);
	}

public synchronized ApplicationArrestReport create() throws Exception{
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
					return (ApplicationArrestReport)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationArrestReport> createList(List<ApplicationArrestReport> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationArrestReport> resultList = new ArrayList<ApplicationArrestReport>();
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
	public ApplicationArrestReport findByPk(Long id)throws Exception{
		List<ApplicationArrestReport> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationArrestReport> findByPks(List<Long> ids)throws Exception{
		List<ApplicationArrestReport> resultList = new ArrayList<ApplicationArrestReport>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationArrestReport> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationArrestReport> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationArrestReport> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationArrestReport> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationArrestReport> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationArrestReport> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationArrestReport> resultList = new ArrayList<ApplicationArrestReport>();
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
	public List<ApplicationArrestReport> findByExample(ApplicationArrestReport instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationArrestReport> findByExample(ApplicationArrestReport instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationArrestReport update()throws Exception{
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
					return (ApplicationArrestReport)this;
			}else// not update
				return (ApplicationArrestReport)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationArrestReport> updateList(List<ApplicationArrestReport> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationArrestReport> resultList = new ArrayList<ApplicationArrestReport>();
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
	public Integer deleteList(List<ApplicationArrestReport> objList)throws Exception {
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
	public ApplicationArrestReport populate(ResultSet rs)throws Exception{
		ApplicationArrestReport result = new ApplicationArrestReport(this.db);
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

    private String helper_name;

    private String report_command;

    private String staff_posname_sue;

    private String staff_name_sue;

    private String commander_comment;

    private String arrest_desc;

    private String commander_name;

    private String accuser_name;

    private String iscompare;
    
    private String isnotice;
    
    private String lawbreaker_name;
    
    private String nature_invest;
    
    private String exhibit_desc;
    
    private String report_title;

    private java.util.Date case_date;

    private String job_no;

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

    public String getHelper_name(){
    	return helper_name;
    }
    public void setHelper_name(String helper_name){
    	this.helper_name=helper_name;
    }
    
    public String getReport_command(){
    	return report_command;
    }
    public void setReport_command(String report_command){
    	this.report_command=report_command;
    }

    public String getStaff_posname_sue(){
    	return staff_posname_sue;
    }
    public void setStaff_posname_sue(String staff_posname_sue){
    	this.staff_posname_sue = staff_posname_sue;
    }

    public String getStaff_name_sue(){
    	return staff_name_sue;
    }
    public void setStaff_name_sue(String staff_name_sue){
    	this.staff_name_sue=staff_name_sue;
    }

    public String getCommander_comment(){
    	return commander_comment;
    }
    public void setCommander_comment(String commander_comment){
    	this.commander_comment=commander_comment;
    }

    public String getArrest_desc(){
    	return arrest_desc;
    }
    public void setArrest_desc(String arrest_desc){
    	this.arrest_desc=arrest_desc;
    }

    public String getCommander_name(){
    	return commander_name;
    }
    public void setCommander_name(String commander_name){
    	this.commander_name = commander_name;
    }

    public String getAccuser_name(){
    	return accuser_name;
    }
    public void setAccuser_name(String accuser_name){
    	this.accuser_name = accuser_name;
    }

    public String getIscompare(){
    	return iscompare;
    }
    public void setIscompare(String iscompare){
    	this.iscompare=iscompare;
    }

    public String getIsnotice(){
    	return isnotice;
    }
    public void setIsnotice(String isnotice){
    	this.isnotice=isnotice;
    }
    
    public String getLawbreaker_name(){
    	return lawbreaker_name;
    }
    public void setLawbreaker_name(String lawbreaker_name){
    	this.lawbreaker_name=lawbreaker_name;
    }
    
    public String getNature_invest(){
    	return nature_invest;
    }
    public void setNature_invest(String nature_invest){
    	this.nature_invest=nature_invest;
    }
    
    public String getExhibit_desc(){
    	return exhibit_desc;
    }
    public void setExhibit_desc(String exhibit_desc){
    	this.exhibit_desc=exhibit_desc;
    }
    
    public String getReport_title(){
    	return report_title;
    }
    public void setReport_title(String report_title){
    	this.report_title=report_title;
    }
    
    public java.util.Date getCase_date(){
    	return case_date;
    }
    public void setCase_date(java.util.Date case_date){
    	this.case_date=case_date;
    }

    public String getJob_no()
    {
        return job_no;
    }
    public void setJob_no(String job_no)
    {
        this.job_no = job_no;
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