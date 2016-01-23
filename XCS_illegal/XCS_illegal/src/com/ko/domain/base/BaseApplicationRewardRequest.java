








 

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

import com.ko.domain.ApplicationRewardRequest;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationRewardRequest extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_REWARD_REQUEST";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_REWARD_REQUEST.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String COMPARE_CASE_IDCol = "COMPARE_CASE_ID";

	public static final String RECEIVE_DATECol = "RECEIVE_DATE";

	public static final String INFORM_POSITIONCol = "INFORM_POSITION";

	public static final String INFORM_NAMECol = "INFORM_NAME";

	public static final String POSCODE_RECEIVECol = "POSCODE_RECEIVE";

	public static final String STAFF_ID_RECEIVECol = "STAFF_ID_RECEIVE";

	public static final String POSCODE_REQUESTCol = "POSCODE_REQUEST";

	public static final String STAFF_ID_REQUESTCol = "STAFF_ID_REQUEST";

	public static final String OFFCODECol = "OFFCODE";

	public static final String REQUEST_DATECol = "REQUEST_DATE";

	public static final String REQUEST_NOCol = "REQUEST_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPDATE_ONColumn = "APPLICATION_REWARD_REQUEST.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_REWARD_REQUEST.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_REWARD_REQUEST.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_REWARD_REQUEST.CREATE_BY";

	public static final String COMPARE_CASE_IDColumn = "APPLICATION_REWARD_REQUEST.COMPARE_CASE_ID";

	public static final String RECEIVE_DATEColumn = "APPLICATION_REWARD_REQUEST.RECEIVE_DATE";

	public static final String INFORM_POSITIONColumn = "APPLICATION_REWARD_REQUEST.INFORM_POSITION";

	public static final String INFORM_NAMEColumn = "APPLICATION_REWARD_REQUEST.INFORM_NAME";

	public static final String POSCODE_RECEIVEColumn = "APPLICATION_REWARD_REQUEST.POSCODE_RECEIVE";

	public static final String STAFF_ID_RECEIVEColumn = "APPLICATION_REWARD_REQUEST.STAFF_ID_RECEIVE";

	public static final String POSCODE_REQUESTColumn = "APPLICATION_REWARD_REQUEST.POSCODE_REQUEST";

	public static final String STAFF_ID_REQUESTColumn = "APPLICATION_REWARD_REQUEST.STAFF_ID_REQUEST";

	public static final String OFFCODEColumn = "APPLICATION_REWARD_REQUEST.OFFCODE";

	public static final String REQUEST_DATEColumn = "APPLICATION_REWARD_REQUEST.REQUEST_DATE";

	public static final String REQUEST_NOColumn = "APPLICATION_REWARD_REQUEST.REQUEST_NO";

	public static final String IDColumn = "APPLICATION_REWARD_REQUEST.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, COMPARE_CASE_IDCol	, RECEIVE_DATECol	, INFORM_POSITIONCol	, INFORM_NAMECol	, POSCODE_RECEIVECol	, STAFF_ID_RECEIVECol	, POSCODE_REQUESTCol	, STAFF_ID_REQUESTCol	, OFFCODECol	, REQUEST_DATECol	, REQUEST_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ COMPARE_CASE_IDCol	+","+ RECEIVE_DATECol	+","+ INFORM_POSITIONCol	+","+ INFORM_NAMECol	+","+ POSCODE_RECEIVECol	+","+ STAFF_ID_RECEIVECol	+","+ POSCODE_REQUESTCol	+","+ STAFF_ID_REQUESTCol	+","+ OFFCODECol	+","+ REQUEST_DATECol	+","+ REQUEST_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+COMPARE_CASE_IDCol+"=?,"+RECEIVE_DATECol+"=?,"+INFORM_POSITIONCol+"=?,"+INFORM_NAMECol+"=?,"+POSCODE_RECEIVECol+"=?,"+STAFF_ID_RECEIVECol+"=?,"+POSCODE_REQUESTCol+"=?,"+STAFF_ID_REQUESTCol+"=?,"+OFFCODECol+"=?,"+REQUEST_DATECol+"=?,"+REQUEST_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationRewardRequest(DB db){
		super(db);
	}



public synchronized ApplicationRewardRequest create() throws Exception{
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
					return (ApplicationRewardRequest)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardRequest> createList(List<ApplicationRewardRequest> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationRewardRequest> resultList = new ArrayList<ApplicationRewardRequest>();
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
	public ApplicationRewardRequest findByPk(Long id)throws Exception{
		List<ApplicationRewardRequest> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationRewardRequest> findByPks(List<Long> ids)throws Exception{
		List<ApplicationRewardRequest> resultList = new ArrayList<ApplicationRewardRequest>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationRewardRequest> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationRewardRequest> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationRewardRequest> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationRewardRequest> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationRewardRequest> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationRewardRequest> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardRequest> resultList = new ArrayList<ApplicationRewardRequest>();
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
	public List<ApplicationRewardRequest> findByExample(ApplicationRewardRequest instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationRewardRequest> findByExample(ApplicationRewardRequest instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationRewardRequest update()throws Exception{
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
					return (ApplicationRewardRequest)this;
			}else// not update
				return (ApplicationRewardRequest)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardRequest> updateList(List<ApplicationRewardRequest> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardRequest> resultList = new ArrayList<ApplicationRewardRequest>();
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
	public Integer deleteList(List<ApplicationRewardRequest> objList)throws Exception {
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
	public ApplicationRewardRequest populate(ResultSet rs)throws Exception{
		ApplicationRewardRequest result = new ApplicationRewardRequest(this.db);
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

    private Long compare_case_id;

    private java.util.Date receive_date;

    private String inform_position;

    private String inform_name;

    private String poscode_receive;

    private String staff_id_receive;

    private String poscode_request;

    private String staff_id_request;

    private String offcode;

    private java.util.Date request_date;

    private String request_no;

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

	public Long getCompare_case_id()
    {
        return compare_case_id;
    }
    public void setCompare_case_id(Long compare_case_id)
    {
        this.compare_case_id = compare_case_id;
    }

	public java.util.Date getReceive_date()
    {
        return receive_date;
    }
    public void setReceive_date(java.util.Date receive_date)
    {
        this.receive_date = receive_date;
    }

	public String getInform_position()
    {
        return inform_position;
    }
    public void setInform_position(String inform_position)
    {
        this.inform_position = inform_position;
    }

	public String getInform_name()
    {
        return inform_name;
    }
    public void setInform_name(String inform_name)
    {
        this.inform_name = inform_name;
    }

	public String getPoscode_receive()
    {
        return poscode_receive;
    }
    public void setPoscode_receive(String poscode_receive)
    {
        this.poscode_receive = poscode_receive;
    }

	public String getStaff_id_receive()
    {
        return staff_id_receive;
    }
    public void setStaff_id_receive(String staff_id_receive)
    {
        this.staff_id_receive = staff_id_receive;
    }

	public String getPoscode_request()
    {
        return poscode_request;
    }
    public void setPoscode_request(String poscode_request)
    {
        this.poscode_request = poscode_request;
    }

	public String getStaff_id_request()
    {
        return staff_id_request;
    }
    public void setStaff_id_request(String staff_id_request)
    {
        this.staff_id_request = staff_id_request;
    }

	public String getOffcode()
    {
        return offcode;
    }
    public void setOffcode(String offcode)
    {
        this.offcode = offcode;
    }

	public java.util.Date getRequest_date()
    {
        return request_date;
    }
    public void setRequest_date(java.util.Date request_date)
    {
        this.request_date = request_date;
    }

	public String getRequest_no()
    {
        return request_no;
    }
    public void setRequest_no(String request_no)
    {
        this.request_no = request_no;
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