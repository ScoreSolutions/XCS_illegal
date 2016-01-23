








 

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

import com.ko.domain.ApplicationRewardReqReport;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationRewardReqReport extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_REWARD_REQ_REPORT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_REWARD_REQ_REPORT.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String COMMANDCol = "COMMAND";

	public static final String COMMENT_COMMANDERCol = "COMMENT_COMMANDER";

	public static final String OFFCODE_COMMANDERCol = "OFFCODE_COMMANDER";

	public static final String POSCODE_COMMANDERCol = "POSCODE_COMMANDER";

	public static final String STAFF_ID_COMMANDERCol = "STAFF_ID_COMMANDER";

	public static final String COMMENT_INITIALCol = "COMMENT_INITIAL";

	public static final String OFFCODE_INITIALCol = "OFFCODE_INITIAL";

	public static final String POSCODE_INITIALCol = "POSCODE_INITIAL";

	public static final String STAFF_ID_INITIALCol = "STAFF_ID_INITIAL";

	public static final String COMMENT_CONTROLCol = "COMMENT_CONTROL";

	public static final String OFFCODE_CONTROLCol = "OFFCODE_CONTROL";

	public static final String POSCODE_CONTROLCol = "POSCODE_CONTROL";

	public static final String STAFF_ID_CONTROLCol = "STAFF_ID_CONTROL";

	public static final String ABNORMALITYCol = "ABNORMALITY";

	public static final String ISCHKCOUNTCol = "ISCHKCOUNT";

	public static final String ISINFORMCol = "ISINFORM";

	public static final String SUBJECTCol = "SUBJECT";

	public static final String APPLICATION_REWARD_REQUEST_IDCol = "APPLICATION_REWARD_REQUEST_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPDATE_ONColumn = "APPLICATION_REWARD_REQ_REPORT.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_REWARD_REQ_REPORT.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_REWARD_REQ_REPORT.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_REWARD_REQ_REPORT.CREATE_BY";

	public static final String COMMANDColumn = "APPLICATION_REWARD_REQ_REPORT.COMMAND";

	public static final String COMMENT_COMMANDERColumn = "APPLICATION_REWARD_REQ_REPORT.COMMENT_COMMANDER";

	public static final String OFFCODE_COMMANDERColumn = "APPLICATION_REWARD_REQ_REPORT.OFFCODE_COMMANDER";

	public static final String POSCODE_COMMANDERColumn = "APPLICATION_REWARD_REQ_REPORT.POSCODE_COMMANDER";

	public static final String STAFF_ID_COMMANDERColumn = "APPLICATION_REWARD_REQ_REPORT.STAFF_ID_COMMANDER";

	public static final String COMMENT_INITIALColumn = "APPLICATION_REWARD_REQ_REPORT.COMMENT_INITIAL";

	public static final String OFFCODE_INITIALColumn = "APPLICATION_REWARD_REQ_REPORT.OFFCODE_INITIAL";

	public static final String POSCODE_INITIALColumn = "APPLICATION_REWARD_REQ_REPORT.POSCODE_INITIAL";

	public static final String STAFF_ID_INITIALColumn = "APPLICATION_REWARD_REQ_REPORT.STAFF_ID_INITIAL";

	public static final String COMMENT_CONTROLColumn = "APPLICATION_REWARD_REQ_REPORT.COMMENT_CONTROL";

	public static final String OFFCODE_CONTROLColumn = "APPLICATION_REWARD_REQ_REPORT.OFFCODE_CONTROL";

	public static final String POSCODE_CONTROLColumn = "APPLICATION_REWARD_REQ_REPORT.POSCODE_CONTROL";

	public static final String STAFF_ID_CONTROLColumn = "APPLICATION_REWARD_REQ_REPORT.STAFF_ID_CONTROL";

	public static final String ABNORMALITYColumn = "APPLICATION_REWARD_REQ_REPORT.ABNORMALITY";

	public static final String ISCHKCOUNTColumn = "APPLICATION_REWARD_REQ_REPORT.ISCHKCOUNT";

	public static final String ISINFORMColumn = "APPLICATION_REWARD_REQ_REPORT.ISINFORM";

	public static final String SUBJECTColumn = "APPLICATION_REWARD_REQ_REPORT.SUBJECT";

	public static final String APPLICATION_REWARD_REQUEST_IDColumn = "APPLICATION_REWARD_REQ_REPORT.APPLICATION_REWARD_REQUEST_ID";

	public static final String IDColumn = "APPLICATION_REWARD_REQ_REPORT.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, COMMANDCol	, COMMENT_COMMANDERCol	, OFFCODE_COMMANDERCol	, POSCODE_COMMANDERCol	, STAFF_ID_COMMANDERCol	, COMMENT_INITIALCol	, OFFCODE_INITIALCol	, POSCODE_INITIALCol	, STAFF_ID_INITIALCol	, COMMENT_CONTROLCol	, OFFCODE_CONTROLCol	, POSCODE_CONTROLCol	, STAFF_ID_CONTROLCol	, ABNORMALITYCol	, ISCHKCOUNTCol	, ISINFORMCol	, SUBJECTCol	, APPLICATION_REWARD_REQUEST_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ COMMANDCol	+","+ COMMENT_COMMANDERCol	+","+ OFFCODE_COMMANDERCol	+","+ POSCODE_COMMANDERCol	+","+ STAFF_ID_COMMANDERCol	+","+ COMMENT_INITIALCol	+","+ OFFCODE_INITIALCol	+","+ POSCODE_INITIALCol	+","+ STAFF_ID_INITIALCol	+","+ COMMENT_CONTROLCol	+","+ OFFCODE_CONTROLCol	+","+ POSCODE_CONTROLCol	+","+ STAFF_ID_CONTROLCol	+","+ ABNORMALITYCol	+","+ ISCHKCOUNTCol	+","+ ISINFORMCol	+","+ SUBJECTCol	+","+ APPLICATION_REWARD_REQUEST_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+COMMANDCol+"=?,"+COMMENT_COMMANDERCol+"=?,"+OFFCODE_COMMANDERCol+"=?,"+POSCODE_COMMANDERCol+"=?,"+STAFF_ID_COMMANDERCol+"=?,"+COMMENT_INITIALCol+"=?,"+OFFCODE_INITIALCol+"=?,"+POSCODE_INITIALCol+"=?,"+STAFF_ID_INITIALCol+"=?,"+COMMENT_CONTROLCol+"=?,"+OFFCODE_CONTROLCol+"=?,"+POSCODE_CONTROLCol+"=?,"+STAFF_ID_CONTROLCol+"=?,"+ABNORMALITYCol+"=?,"+ISCHKCOUNTCol+"=?,"+ISINFORMCol+"=?,"+SUBJECTCol+"=?,"+APPLICATION_REWARD_REQUEST_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationRewardReqReport(DB db){
		super(db);
	}



public synchronized ApplicationRewardReqReport create() throws Exception{
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
					return (ApplicationRewardReqReport)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardReqReport> createList(List<ApplicationRewardReqReport> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationRewardReqReport> resultList = new ArrayList<ApplicationRewardReqReport>();
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
	public ApplicationRewardReqReport findByPk(Long id)throws Exception{
		List<ApplicationRewardReqReport> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationRewardReqReport> findByPks(List<Long> ids)throws Exception{
		List<ApplicationRewardReqReport> resultList = new ArrayList<ApplicationRewardReqReport>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationRewardReqReport> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationRewardReqReport> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationRewardReqReport> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationRewardReqReport> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationRewardReqReport> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationRewardReqReport> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardReqReport> resultList = new ArrayList<ApplicationRewardReqReport>();
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
	public List<ApplicationRewardReqReport> findByExample(ApplicationRewardReqReport instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationRewardReqReport> findByExample(ApplicationRewardReqReport instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationRewardReqReport update()throws Exception{
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
					return (ApplicationRewardReqReport)this;
			}else// not update
				return (ApplicationRewardReqReport)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardReqReport> updateList(List<ApplicationRewardReqReport> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardReqReport> resultList = new ArrayList<ApplicationRewardReqReport>();
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
	public Integer deleteList(List<ApplicationRewardReqReport> objList)throws Exception {
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
	public ApplicationRewardReqReport populate(ResultSet rs)throws Exception{
		ApplicationRewardReqReport result = new ApplicationRewardReqReport(this.db);
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

    private String update_by;

    private java.util.Date create_on;

    private String create_by;

    private String command;

    private String comment_commander;

    private String offcode_commander;

    private String poscode_commander;

    private String staff_id_commander;

    private String comment_initial;

    private String offcode_initial;

    private String poscode_initial;

    private String staff_id_initial;

    private String comment_control;

    private String offcode_control;

    private String poscode_control;

    private String staff_id_control;

    private String abnormality;

    private String ischkcount;

    private String isinform;

    private String subject;

    private Long application_reward_request_id;

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

	public String getCommand()
    {
        return command;
    }
    public void setCommand(String command)
    {
        this.command = command;
    }

	public String getComment_commander()
    {
        return comment_commander;
    }
    public void setComment_commander(String comment_commander)
    {
        this.comment_commander = comment_commander;
    }

	public String getOffcode_commander()
    {
        return offcode_commander;
    }
    public void setOffcode_commander(String offcode_commander)
    {
        this.offcode_commander = offcode_commander;
    }

	public String getPoscode_commander()
    {
        return poscode_commander;
    }
    public void setPoscode_commander(String poscode_commander)
    {
        this.poscode_commander = poscode_commander;
    }

	public String getStaff_id_commander()
    {
        return staff_id_commander;
    }
    public void setStaff_id_commander(String staff_id_commander)
    {
        this.staff_id_commander = staff_id_commander;
    }

	public String getComment_initial()
    {
        return comment_initial;
    }
    public void setComment_initial(String comment_initial)
    {
        this.comment_initial = comment_initial;
    }

	public String getOffcode_initial()
    {
        return offcode_initial;
    }
    public void setOffcode_initial(String offcode_initial)
    {
        this.offcode_initial = offcode_initial;
    }

	public String getPoscode_initial()
    {
        return poscode_initial;
    }
    public void setPoscode_initial(String poscode_initial)
    {
        this.poscode_initial = poscode_initial;
    }

	public String getStaff_id_initial()
    {
        return staff_id_initial;
    }
    public void setStaff_id_initial(String staff_id_initial)
    {
        this.staff_id_initial = staff_id_initial;
    }

	public String getComment_control()
    {
        return comment_control;
    }
    public void setComment_control(String comment_control)
    {
        this.comment_control = comment_control;
    }

	public String getOffcode_control()
    {
        return offcode_control;
    }
    public void setOffcode_control(String offcode_control)
    {
        this.offcode_control = offcode_control;
    }

	public String getPoscode_control()
    {
        return poscode_control;
    }
    public void setPoscode_control(String poscode_control)
    {
        this.poscode_control = poscode_control;
    }

	public String getStaff_id_control()
    {
        return staff_id_control;
    }
    public void setStaff_id_control(String staff_id_control)
    {
        this.staff_id_control = staff_id_control;
    }

	public String getAbnormality()
    {
        return abnormality;
    }
    public void setAbnormality(String abnormality)
    {
        this.abnormality = abnormality;
    }

	public String getIschkcount()
    {
        return ischkcount;
    }
    public void setIschkcount(String ischkcount)
    {
        this.ischkcount = ischkcount;
    }

	public String getIsinform()
    {
        return isinform;
    }
    public void setIsinform(String isinform)
    {
        this.isinform = isinform;
    }

	public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }

	public Long getApplication_reward_request_id()
    {
        return application_reward_request_id;
    }
    public void setApplication_reward_request_id(Long application_reward_request_id)
    {
        this.application_reward_request_id = application_reward_request_id;
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