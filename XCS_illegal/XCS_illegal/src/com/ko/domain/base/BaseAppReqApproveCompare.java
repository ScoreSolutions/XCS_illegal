








 

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

import com.ko.domain.AppReqApproveCompare;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseAppReqApproveCompare extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APP_REQ_APPROVE_COMPARE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APP_REQ_APPROVE_COMPARE.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String COMPARE_REASONCol = "COMPARE_REASON";

	public static final String MISTAKE_DETAILCol = "MISTAKE_DETAIL";

	public static final String ISLAWBREAKERRENTCol = "ISLAWBREAKERRENT";

	public static final String CONTRACT_DATECol = "CONTRACT_DATE";

	public static final String CONTRACT_NOCol = "CONTRACT_NO";

	public static final String CONTRACTCol = "CONTRACT";

	public static final String RENT_NAMECol = "RENT_NAME";

	public static final String OWNERSHIPCol = "OWNERSHIP";

	public static final String HOLD_SHIPCol = "HOLD_SHIP";

	public static final String BODY_NOCol = "BODY_NO";

	public static final String ENGINE_NOCol = "ENGINE_NO";

	public static final String VEHICLE_NAMECol = "VEHICLE_NAME";

	public static final String COMPARE_CASE_IDCol = "COMPARE_CASE_ID";

	public static final String OFFCODECol = "OFFCODE";

	public static final String REQ_DATECol = "REQ_DATE";

	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPDATE_ONColumn = "APP_REQ_APPROVE_COMPARE.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APP_REQ_APPROVE_COMPARE.UPDATE_BY";

	public static final String CREATE_ONColumn = "APP_REQ_APPROVE_COMPARE.CREATE_ON";

	public static final String CREATE_BYColumn = "APP_REQ_APPROVE_COMPARE.CREATE_BY";

	public static final String COMPARE_REASONColumn = "APP_REQ_APPROVE_COMPARE.COMPARE_REASON";

	public static final String MISTAKE_DETAILColumn = "APP_REQ_APPROVE_COMPARE.MISTAKE_DETAIL";

	public static final String ISLAWBREAKERRENTColumn = "APP_REQ_APPROVE_COMPARE.ISLAWBREAKERRENT";

	public static final String CONTRACT_DATEColumn = "APP_REQ_APPROVE_COMPARE.CONTRACT_DATE";

	public static final String CONTRACT_NOColumn = "APP_REQ_APPROVE_COMPARE.CONTRACT_NO";

	public static final String CONTRACTColumn = "APP_REQ_APPROVE_COMPARE.CONTRACT";

	public static final String RENT_NAMEColumn = "APP_REQ_APPROVE_COMPARE.RENT_NAME";

	public static final String OWNERSHIPColumn = "APP_REQ_APPROVE_COMPARE.OWNERSHIP";

	public static final String HOLD_SHIPColumn = "APP_REQ_APPROVE_COMPARE.HOLD_SHIP";

	public static final String BODY_NOColumn = "APP_REQ_APPROVE_COMPARE.BODY_NO";

	public static final String ENGINE_NOColumn = "APP_REQ_APPROVE_COMPARE.ENGINE_NO";

	public static final String VEHICLE_NAMEColumn = "APP_REQ_APPROVE_COMPARE.VEHICLE_NAME";

	public static final String COMPARE_CASE_IDColumn = "APP_REQ_APPROVE_COMPARE.COMPARE_CASE_ID";

	public static final String OFFCODEColumn = "APP_REQ_APPROVE_COMPARE.OFFCODE";

	public static final String REQ_DATEColumn = "APP_REQ_APPROVE_COMPARE.REQ_DATE";

	public static final String TRACK_NOColumn = "APP_REQ_APPROVE_COMPARE.TRACK_NO";

	public static final String IDColumn = "APP_REQ_APPROVE_COMPARE.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, COMPARE_REASONCol	, MISTAKE_DETAILCol	, ISLAWBREAKERRENTCol	, CONTRACT_DATECol	, CONTRACT_NOCol	, CONTRACTCol	, RENT_NAMECol	, OWNERSHIPCol	, HOLD_SHIPCol	, BODY_NOCol	, ENGINE_NOCol	, VEHICLE_NAMECol	, COMPARE_CASE_IDCol	, OFFCODECol	, REQ_DATECol	, TRACK_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ COMPARE_REASONCol	+","+ MISTAKE_DETAILCol	+","+ ISLAWBREAKERRENTCol	+","+ CONTRACT_DATECol	+","+ CONTRACT_NOCol	+","+ CONTRACTCol	+","+ RENT_NAMECol	+","+ OWNERSHIPCol	+","+ HOLD_SHIPCol	+","+ BODY_NOCol	+","+ ENGINE_NOCol	+","+ VEHICLE_NAMECol	+","+ COMPARE_CASE_IDCol	+","+ OFFCODECol	+","+ REQ_DATECol	+","+ TRACK_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+COMPARE_REASONCol+"=?,"+MISTAKE_DETAILCol+"=?,"+ISLAWBREAKERRENTCol+"=?,"+CONTRACT_DATECol+"=?,"+CONTRACT_NOCol+"=?,"+CONTRACTCol+"=?,"+RENT_NAMECol+"=?,"+OWNERSHIPCol+"=?,"+HOLD_SHIPCol+"=?,"+BODY_NOCol+"=?,"+ENGINE_NOCol+"=?,"+VEHICLE_NAMECol+"=?,"+COMPARE_CASE_IDCol+"=?,"+OFFCODECol+"=?,"+REQ_DATECol+"=?,"+TRACK_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseAppReqApproveCompare(DB db){
		super(db);
	}



public synchronized AppReqApproveCompare create() throws Exception{
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
					return (AppReqApproveCompare)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<AppReqApproveCompare> createList(List<AppReqApproveCompare> objList)throws Exception{
    	DB db = this.initDB();
    	List<AppReqApproveCompare> resultList = new ArrayList<AppReqApproveCompare>();
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
	public AppReqApproveCompare findByPk(Long id)throws Exception{
		List<AppReqApproveCompare> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<AppReqApproveCompare> findByPks(List<Long> ids)throws Exception{
		List<AppReqApproveCompare> resultList = new ArrayList<AppReqApproveCompare>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<AppReqApproveCompare> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<AppReqApproveCompare> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<AppReqApproveCompare> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<AppReqApproveCompare> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<AppReqApproveCompare> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<AppReqApproveCompare> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<AppReqApproveCompare> resultList = new ArrayList<AppReqApproveCompare>();
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
	public List<AppReqApproveCompare> findByExample(AppReqApproveCompare instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<AppReqApproveCompare> findByExample(AppReqApproveCompare instance,PageUtil pageUtil) throws Exception{
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
	public AppReqApproveCompare update()throws Exception{
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
					return (AppReqApproveCompare)this;
			}else// not update
				return (AppReqApproveCompare)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<AppReqApproveCompare> updateList(List<AppReqApproveCompare> objList)throws Exception{
		DB db = this.initDB();
		List<AppReqApproveCompare> resultList = new ArrayList<AppReqApproveCompare>();
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
	public Integer deleteList(List<AppReqApproveCompare> objList)throws Exception {
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
	public AppReqApproveCompare populate(ResultSet rs)throws Exception{
		AppReqApproveCompare result = new AppReqApproveCompare(this.db);
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

    private String compare_reason;

    private String mistake_detail;

    private String islawbreakerrent;

    private java.util.Date contract_date;

    private String contract_no;

    private String contract;

    private String rent_name;

    private String ownership;

    private Long hold_ship;

    private String body_no;

    private String engine_no;

    private String vehicle_name;

    private Long compare_case_id;

    private String offcode;

    private java.util.Date req_date;

    private String track_no;

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

	public String getCompare_reason()
    {
        return compare_reason;
    }
    public void setCompare_reason(String compare_reason)
    {
        this.compare_reason = compare_reason;
    }

	public String getMistake_detail()
    {
        return mistake_detail;
    }
    public void setMistake_detail(String mistake_detail)
    {
        this.mistake_detail = mistake_detail;
    }

	public String getIslawbreakerrent()
    {
        return islawbreakerrent;
    }
    public void setIslawbreakerrent(String islawbreakerrent)
    {
        this.islawbreakerrent = islawbreakerrent;
    }

	public java.util.Date getContract_date()
    {
        return contract_date;
    }
    public void setContract_date(java.util.Date contract_date)
    {
        this.contract_date = contract_date;
    }

	public String getContract_no()
    {
        return contract_no;
    }
    public void setContract_no(String contract_no)
    {
        this.contract_no = contract_no;
    }

	public String getContract()
    {
        return contract;
    }
    public void setContract(String contract)
    {
        this.contract = contract;
    }

	public String getRent_name()
    {
        return rent_name;
    }
    public void setRent_name(String rent_name)
    {
        this.rent_name = rent_name;
    }

	public String getOwnership()
    {
        return ownership;
    }
    public void setOwnership(String ownership)
    {
        this.ownership = ownership;
    }

	public Long getHold_ship()
    {
        return hold_ship;
    }
    public void setHold_ship(Long hold_ship)
    {
        this.hold_ship = hold_ship;
    }

	public String getBody_no()
    {
        return body_no;
    }
    public void setBody_no(String body_no)
    {
        this.body_no = body_no;
    }

	public String getEngine_no()
    {
        return engine_no;
    }
    public void setEngine_no(String engine_no)
    {
        this.engine_no = engine_no;
    }

	public String getVehicle_name()
    {
        return vehicle_name;
    }
    public void setVehicle_name(String vehicle_name)
    {
        this.vehicle_name = vehicle_name;
    }

	public Long getCompare_case_id()
    {
        return compare_case_id;
    }
    public void setCompare_case_id(Long compare_case_id)
    {
        this.compare_case_id = compare_case_id;
    }

	public String getOffcode()
    {
        return offcode;
    }
    public void setOffcode(String offcode)
    {
        this.offcode = offcode;
    }

	public java.util.Date getReq_date()
    {
        return req_date;
    }
    public void setReq_date(java.util.Date req_date)
    {
        this.req_date = req_date;
    }

	public String getTrack_no()
    {
        return track_no;
    }
    public void setTrack_no(String track_no)
    {
        this.track_no = track_no;
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