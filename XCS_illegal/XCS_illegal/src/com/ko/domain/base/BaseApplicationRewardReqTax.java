








 

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

import com.ko.domain.ApplicationRewardReqTax;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationRewardReqTax extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_REWARD_REQ_TAX";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_REWARD_REQ_TAX.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String OFFCODE_APPROVECol = "OFFCODE_APPROVE";

	public static final String POSCODE_APPROVECol = "POSCODE_APPROVE";

	public static final String STAFF_ID_APPROVECol = "STAFF_ID_APPROVE";

	public static final String APPROVE_LEANCol = "APPROVE_LEAN";

	public static final String OFFCODE_ASKCol = "OFFCODE_ASK";

	public static final String POSCODE_ASKCol = "POSCODE_ASK";

	public static final String STAFF_ID_ASKCol = "STAFF_ID_ASK";

	public static final String DEPARTMENT_NAME_SENDCol = "DEPARTMENT_NAME_SEND";

	public static final String ASK_LEANCol = "ASK_LEAN";

	public static final String OFFCODE_CONFIRMCol = "OFFCODE_CONFIRM";

	public static final String POSCODE_CONFIRMCol = "POSCODE_CONFIRM";

	public static final String STAFF_ID_CONFIRMCol = "STAFF_ID_CONFIRM";

	public static final String APPLICATION_REWARD_REQUEST_IDCol = "APPLICATION_REWARD_REQUEST_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPDATE_ONColumn = "APPLICATION_REWARD_REQ_TAX.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_REWARD_REQ_TAX.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_REWARD_REQ_TAX.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_REWARD_REQ_TAX.CREATE_BY";

	public static final String OFFCODE_APPROVEColumn = "APPLICATION_REWARD_REQ_TAX.OFFCODE_APPROVE";

	public static final String POSCODE_APPROVEColumn = "APPLICATION_REWARD_REQ_TAX.POSCODE_APPROVE";

	public static final String STAFF_ID_APPROVEColumn = "APPLICATION_REWARD_REQ_TAX.STAFF_ID_APPROVE";

	public static final String APPROVE_LEANColumn = "APPLICATION_REWARD_REQ_TAX.APPROVE_LEAN";

	public static final String OFFCODE_ASKColumn = "APPLICATION_REWARD_REQ_TAX.OFFCODE_ASK";

	public static final String POSCODE_ASKColumn = "APPLICATION_REWARD_REQ_TAX.POSCODE_ASK";

	public static final String STAFF_ID_ASKColumn = "APPLICATION_REWARD_REQ_TAX.STAFF_ID_ASK";

	public static final String DEPARTMENT_NAME_SENDColumn = "APPLICATION_REWARD_REQ_TAX.DEPARTMENT_NAME_SEND";

	public static final String ASK_LEANColumn = "APPLICATION_REWARD_REQ_TAX.ASK_LEAN";

	public static final String OFFCODE_CONFIRMColumn = "APPLICATION_REWARD_REQ_TAX.OFFCODE_CONFIRM";

	public static final String POSCODE_CONFIRMColumn = "APPLICATION_REWARD_REQ_TAX.POSCODE_CONFIRM";

	public static final String STAFF_ID_CONFIRMColumn = "APPLICATION_REWARD_REQ_TAX.STAFF_ID_CONFIRM";

	public static final String APPLICATION_REWARD_REQUEST_IDColumn = "APPLICATION_REWARD_REQ_TAX.APPLICATION_REWARD_REQUEST_ID";

	public static final String IDColumn = "APPLICATION_REWARD_REQ_TAX.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, OFFCODE_APPROVECol	, POSCODE_APPROVECol	, STAFF_ID_APPROVECol	, APPROVE_LEANCol	, OFFCODE_ASKCol	, POSCODE_ASKCol	, STAFF_ID_ASKCol	, DEPARTMENT_NAME_SENDCol	, ASK_LEANCol	, OFFCODE_CONFIRMCol	, POSCODE_CONFIRMCol	, STAFF_ID_CONFIRMCol	, APPLICATION_REWARD_REQUEST_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ OFFCODE_APPROVECol	+","+ POSCODE_APPROVECol	+","+ STAFF_ID_APPROVECol	+","+ APPROVE_LEANCol	+","+ OFFCODE_ASKCol	+","+ POSCODE_ASKCol	+","+ STAFF_ID_ASKCol	+","+ DEPARTMENT_NAME_SENDCol	+","+ ASK_LEANCol	+","+ OFFCODE_CONFIRMCol	+","+ POSCODE_CONFIRMCol	+","+ STAFF_ID_CONFIRMCol	+","+ APPLICATION_REWARD_REQUEST_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+OFFCODE_APPROVECol+"=?,"+POSCODE_APPROVECol+"=?,"+STAFF_ID_APPROVECol+"=?,"+APPROVE_LEANCol+"=?,"+OFFCODE_ASKCol+"=?,"+POSCODE_ASKCol+"=?,"+STAFF_ID_ASKCol+"=?,"+DEPARTMENT_NAME_SENDCol+"=?,"+ASK_LEANCol+"=?,"+OFFCODE_CONFIRMCol+"=?,"+POSCODE_CONFIRMCol+"=?,"+STAFF_ID_CONFIRMCol+"=?,"+APPLICATION_REWARD_REQUEST_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationRewardReqTax(DB db){
		super(db);
	}



public synchronized ApplicationRewardReqTax create() throws Exception{
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
					return (ApplicationRewardReqTax)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardReqTax> createList(List<ApplicationRewardReqTax> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationRewardReqTax> resultList = new ArrayList<ApplicationRewardReqTax>();
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
	public ApplicationRewardReqTax findByPk(Long id)throws Exception{
		List<ApplicationRewardReqTax> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationRewardReqTax> findByPks(List<Long> ids)throws Exception{
		List<ApplicationRewardReqTax> resultList = new ArrayList<ApplicationRewardReqTax>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationRewardReqTax> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationRewardReqTax> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationRewardReqTax> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationRewardReqTax> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationRewardReqTax> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationRewardReqTax> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardReqTax> resultList = new ArrayList<ApplicationRewardReqTax>();
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
	public List<ApplicationRewardReqTax> findByExample(ApplicationRewardReqTax instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationRewardReqTax> findByExample(ApplicationRewardReqTax instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationRewardReqTax update()throws Exception{
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
					return (ApplicationRewardReqTax)this;
			}else// not update
				return (ApplicationRewardReqTax)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardReqTax> updateList(List<ApplicationRewardReqTax> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardReqTax> resultList = new ArrayList<ApplicationRewardReqTax>();
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
	public Integer deleteList(List<ApplicationRewardReqTax> objList)throws Exception {
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
	public ApplicationRewardReqTax populate(ResultSet rs)throws Exception{
		ApplicationRewardReqTax result = new ApplicationRewardReqTax(this.db);
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

    private String offcode_approve;

    private String poscode_approve;

    private String staff_id_approve;

    private String approve_lean;

    private String offcode_ask;

    private String poscode_ask;

    private String staff_id_ask;

    private String department_name_send;

    private String ask_lean;

    private String offcode_confirm;

    private String poscode_confirm;

    private String staff_id_confirm;

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

	public String getOffcode_approve()
    {
        return offcode_approve;
    }
    public void setOffcode_approve(String offcode_approve)
    {
        this.offcode_approve = offcode_approve;
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

	public String getApprove_lean()
    {
        return approve_lean;
    }
    public void setApprove_lean(String approve_lean)
    {
        this.approve_lean = approve_lean;
    }

	public String getOffcode_ask()
    {
        return offcode_ask;
    }
    public void setOffcode_ask(String offcode_ask)
    {
        this.offcode_ask = offcode_ask;
    }

	public String getPoscode_ask()
    {
        return poscode_ask;
    }
    public void setPoscode_ask(String poscode_ask)
    {
        this.poscode_ask = poscode_ask;
    }

	public String getStaff_id_ask()
    {
        return staff_id_ask;
    }
    public void setStaff_id_ask(String staff_id_ask)
    {
        this.staff_id_ask = staff_id_ask;
    }

	public String getDepartment_name_send()
    {
        return department_name_send;
    }
    public void setDepartment_name_send(String department_name_send)
    {
        this.department_name_send = department_name_send;
    }

	public String getAsk_lean()
    {
        return ask_lean;
    }
    public void setAsk_lean(String ask_lean)
    {
        this.ask_lean = ask_lean;
    }

	public String getOffcode_confirm()
    {
        return offcode_confirm;
    }
    public void setOffcode_confirm(String offcode_confirm)
    {
        this.offcode_confirm = offcode_confirm;
    }

	public String getPoscode_confirm()
    {
        return poscode_confirm;
    }
    public void setPoscode_confirm(String poscode_confirm)
    {
        this.poscode_confirm = poscode_confirm;
    }

	public String getStaff_id_confirm()
    {
        return staff_id_confirm;
    }
    public void setStaff_id_confirm(String staff_id_confirm)
    {
        this.staff_id_confirm = staff_id_confirm;
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