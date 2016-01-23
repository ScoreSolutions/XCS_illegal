








 

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

import com.ko.domain.ApplicationRewardReqTobacco;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationRewardReqTobacco extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_REWARD_REQ_TOBACCO";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_REWARD_REQ_TOBACCO.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String ARREST_OPINIONCol = "ARREST_OPINION";

	public static final String COMMANDCol = "COMMAND";

	public static final String LAW_DIRECTOR_OPINIONCol = "LAW_DIRECTOR_OPINION";

	public static final String LAW_DIRECTOR_POSITIONCol = "LAW_DIRECTOR_POSITION";

	public static final String LAWYER_OPINIONCol = "LAWYER_OPINION";

	public static final String OFFCODE_ARRESTCol = "OFFCODE_ARREST";

	public static final String POSCODE_ARRESTCol = "POSCODE_ARREST";

	public static final String STAFF_ID_ARRESTCol = "STAFF_ID_ARREST";

	public static final String APPLICATION_REWARD_REQUEST_IDCol = "APPLICATION_REWARD_REQUEST_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPDATE_ONColumn = "APPLICATION_REWARD_REQ_TOBACCO.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_REWARD_REQ_TOBACCO.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_REWARD_REQ_TOBACCO.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_REWARD_REQ_TOBACCO.CREATE_BY";

	public static final String ARREST_OPINIONColumn = "APPLICATION_REWARD_REQ_TOBACCO.ARREST_OPINION";

	public static final String COMMANDColumn = "APPLICATION_REWARD_REQ_TOBACCO.COMMAND";

	public static final String LAW_DIRECTOR_OPINIONColumn = "APPLICATION_REWARD_REQ_TOBACCO.LAW_DIRECTOR_OPINION";

	public static final String LAW_DIRECTOR_POSITIONColumn = "APPLICATION_REWARD_REQ_TOBACCO.LAW_DIRECTOR_POSITION";

	public static final String LAWYER_OPINIONColumn = "APPLICATION_REWARD_REQ_TOBACCO.LAWYER_OPINION";

	public static final String OFFCODE_ARRESTColumn = "APPLICATION_REWARD_REQ_TOBACCO.OFFCODE_ARREST";

	public static final String POSCODE_ARRESTColumn = "APPLICATION_REWARD_REQ_TOBACCO.POSCODE_ARREST";

	public static final String STAFF_ID_ARRESTColumn = "APPLICATION_REWARD_REQ_TOBACCO.STAFF_ID_ARREST";

	public static final String APPLICATION_REWARD_REQUEST_IDColumn = "APPLICATION_REWARD_REQ_TOBACCO.APPLICATION_REWARD_REQUEST_ID";

	public static final String IDColumn = "APPLICATION_REWARD_REQ_TOBACCO.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, ARREST_OPINIONCol	, COMMANDCol	, LAW_DIRECTOR_OPINIONCol	, LAW_DIRECTOR_POSITIONCol	, LAWYER_OPINIONCol	, OFFCODE_ARRESTCol	, POSCODE_ARRESTCol	, STAFF_ID_ARRESTCol	, APPLICATION_REWARD_REQUEST_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ ARREST_OPINIONCol	+","+ COMMANDCol	+","+ LAW_DIRECTOR_OPINIONCol	+","+ LAW_DIRECTOR_POSITIONCol	+","+ LAWYER_OPINIONCol	+","+ OFFCODE_ARRESTCol	+","+ POSCODE_ARRESTCol	+","+ STAFF_ID_ARRESTCol	+","+ APPLICATION_REWARD_REQUEST_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+ARREST_OPINIONCol+"=?,"+COMMANDCol+"=?,"+LAW_DIRECTOR_OPINIONCol+"=?,"+LAW_DIRECTOR_POSITIONCol+"=?,"+LAWYER_OPINIONCol+"=?,"+OFFCODE_ARRESTCol+"=?,"+POSCODE_ARRESTCol+"=?,"+STAFF_ID_ARRESTCol+"=?,"+APPLICATION_REWARD_REQUEST_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationRewardReqTobacco(DB db){
		super(db);
	}



public synchronized ApplicationRewardReqTobacco create() throws Exception{
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
					return (ApplicationRewardReqTobacco)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardReqTobacco> createList(List<ApplicationRewardReqTobacco> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationRewardReqTobacco> resultList = new ArrayList<ApplicationRewardReqTobacco>();
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
	public ApplicationRewardReqTobacco findByPk(Long id)throws Exception{
		List<ApplicationRewardReqTobacco> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationRewardReqTobacco> findByPks(List<Long> ids)throws Exception{
		List<ApplicationRewardReqTobacco> resultList = new ArrayList<ApplicationRewardReqTobacco>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationRewardReqTobacco> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationRewardReqTobacco> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationRewardReqTobacco> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationRewardReqTobacco> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationRewardReqTobacco> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationRewardReqTobacco> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardReqTobacco> resultList = new ArrayList<ApplicationRewardReqTobacco>();
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
	public List<ApplicationRewardReqTobacco> findByExample(ApplicationRewardReqTobacco instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationRewardReqTobacco> findByExample(ApplicationRewardReqTobacco instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationRewardReqTobacco update()throws Exception{
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
					return (ApplicationRewardReqTobacco)this;
			}else// not update
				return (ApplicationRewardReqTobacco)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardReqTobacco> updateList(List<ApplicationRewardReqTobacco> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardReqTobacco> resultList = new ArrayList<ApplicationRewardReqTobacco>();
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
	public Integer deleteList(List<ApplicationRewardReqTobacco> objList)throws Exception {
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
	public ApplicationRewardReqTobacco populate(ResultSet rs)throws Exception{
		ApplicationRewardReqTobacco result = new ApplicationRewardReqTobacco(this.db);
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

    private String arrest_opinion;

    private String command;

    private String law_director_opinion;

    private String law_director_position;

    private String lawyer_opinion;

    private String offcode_arrest;

    private String poscode_arrest;

    private String staff_id_arrest;

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

	public String getArrest_opinion()
    {
        return arrest_opinion;
    }
    public void setArrest_opinion(String arrest_opinion)
    {
        this.arrest_opinion = arrest_opinion;
    }

	public String getCommand()
    {
        return command;
    }
    public void setCommand(String command)
    {
        this.command = command;
    }

	public String getLaw_director_opinion()
    {
        return law_director_opinion;
    }
    public void setLaw_director_opinion(String law_director_opinion)
    {
        this.law_director_opinion = law_director_opinion;
    }

	public String getLaw_director_position()
    {
        return law_director_position;
    }
    public void setLaw_director_position(String law_director_position)
    {
        this.law_director_position = law_director_position;
    }

	public String getLawyer_opinion()
    {
        return lawyer_opinion;
    }
    public void setLawyer_opinion(String lawyer_opinion)
    {
        this.lawyer_opinion = lawyer_opinion;
    }

	public String getOffcode_arrest()
    {
        return offcode_arrest;
    }
    public void setOffcode_arrest(String offcode_arrest)
    {
        this.offcode_arrest = offcode_arrest;
    }

	public String getPoscode_arrest()
    {
        return poscode_arrest;
    }
    public void setPoscode_arrest(String poscode_arrest)
    {
        this.poscode_arrest = poscode_arrest;
    }

	public String getStaff_id_arrest()
    {
        return staff_id_arrest;
    }
    public void setStaff_id_arrest(String staff_id_arrest)
    {
        this.staff_id_arrest = staff_id_arrest;
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