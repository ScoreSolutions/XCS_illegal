








 

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

import com.ko.domain.ApplicationRewardReqAlcohol;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationRewardReqAlcohol extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_REWARD_REQ_ALCOHOL";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_REWARD_REQ_ALCOHOL.ID";

	// short name column
	public static final String REPORT_TOCol = "REPORT_TO";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String POSCODE_RES_DIRECTORCol = "POSCODE_RES_DIRECTOR";

	public static final String STAFF_ID_RES_DIRECTORCol = "STAFF_ID_RES_DIRECTOR";

	public static final String RES_DIRECTOR_DENY_REASONCol = "RES_DIRECTOR_DENY_REASON";

	public static final String RES_DIRECTOR_ACCEPT_REASONCol = "RES_DIRECTOR_ACCEPT_REASON";

	public static final String RES_DIRECTOR_ACCEPTCol = "RES_DIRECTOR_ACCEPT";

	public static final String POSCODE_SECTION_DIRECTORCol = "POSCODE_SECTION_DIRECTOR";

	public static final String STAFF_ID_SECTION_DIRECTORCol = "STAFF_ID_SECTION_DIRECTOR";

	public static final String SECTION_DIRECTOR_DENY_REASONCol = "SECTION_DIRECTOR_DENY_REASON";

	public static final String SECTION_DIRECTOR_ACCEPT_REASONCol = "SECTION_DIRECTOR_ACCEPT_REASON";

	public static final String SECTION_DIRECTOR_ACCEPTCol = "SECTION_DIRECTOR_ACCEPT";

	public static final String SECTION_DIRECTOR_LEANCol = "SECTION_DIRECTOR_LEAN";

	public static final String POSCODE_LEADERCol = "POSCODE_LEADER";

	public static final String STAFF_ID_LEADERCol = "STAFF_ID_LEADER";

	public static final String LEADER_DENY_REASONCol = "LEADER_DENY_REASON";

	public static final String LEADER_ACCEPT_REASONCol = "LEADER_ACCEPT_REASON";

	public static final String LEADER_ACCEPTCol = "LEADER_ACCEPT";

	public static final String LEADER_LEANCol = "LEADER_LEAN";

	public static final String ACCEPT_DESCCol = "ACCEPT_DESC";

	public static final String ACCEPT_LEANCol = "ACCEPT_LEAN";

	public static final String OFFCODE_ARRESTCol = "OFFCODE_ARREST";

	public static final String POSCODE_ARRESTCol = "POSCODE_ARREST";

	public static final String STAFF_ID_ARRESTCol = "STAFF_ID_ARREST";

	public static final String ACCEPT_DATECol = "ACCEPT_DATE";

	public static final String APPLICATION_REWARD_REQUEST_IDCol = "APPLICATION_REWARD_REQUEST_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String REPORT_TOColumn = "APPLICATION_REWARD_REQ_ALCOHOL.REPORT_TO";

	public static final String UPDATE_ONColumn = "APPLICATION_REWARD_REQ_ALCOHOL.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_REWARD_REQ_ALCOHOL.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_REWARD_REQ_ALCOHOL.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_REWARD_REQ_ALCOHOL.CREATE_BY";

	public static final String POSCODE_RES_DIRECTORColumn = "APPLICATION_REWARD_REQ_ALCOHOL.POSCODE_RES_DIRECTOR";

	public static final String STAFF_ID_RES_DIRECTORColumn = "APPLICATION_REWARD_REQ_ALCOHOL.STAFF_ID_RES_DIRECTOR";

	public static final String RES_DIRECTOR_DENY_REASONColumn = "APPLICATION_REWARD_REQ_ALCOHOL.RES_DIRECTOR_DENY_REASON";

	public static final String RES_DIRECTOR_ACCEPT_REASONColumn = "APPLICATION_REWARD_REQ_ALCOHOL.RES_DIRECTOR_ACCEPT_REASON";

	public static final String RES_DIRECTOR_ACCEPTColumn = "APPLICATION_REWARD_REQ_ALCOHOL.RES_DIRECTOR_ACCEPT";

	public static final String POSCODE_SECTION_DIRECTORColumn = "APPLICATION_REWARD_REQ_ALCOHOL.POSCODE_SECTION_DIRECTOR";

	public static final String STAFF_ID_SECTION_DIRECTORColumn = "APPLICATION_REWARD_REQ_ALCOHOL.STAFF_ID_SECTION_DIRECTOR";

	public static final String SECTION_DIRECTOR_DENY_REASONColumn = "APPLICATION_REWARD_REQ_ALCOHOL.SECTION_DIRECTOR_DENY_REASON";

	public static final String SECTION_DIRECTOR_ACCEPT_REASONColumn = "APPLICATION_REWARD_REQ_ALCOHOL.SECTION_DIRECTOR_ACCEPT_REASON";

	public static final String SECTION_DIRECTOR_ACCEPTColumn = "APPLICATION_REWARD_REQ_ALCOHOL.SECTION_DIRECTOR_ACCEPT";

	public static final String SECTION_DIRECTOR_LEANColumn = "APPLICATION_REWARD_REQ_ALCOHOL.SECTION_DIRECTOR_LEAN";

	public static final String POSCODE_LEADERColumn = "APPLICATION_REWARD_REQ_ALCOHOL.POSCODE_LEADER";

	public static final String STAFF_ID_LEADERColumn = "APPLICATION_REWARD_REQ_ALCOHOL.STAFF_ID_LEADER";

	public static final String LEADER_DENY_REASONColumn = "APPLICATION_REWARD_REQ_ALCOHOL.LEADER_DENY_REASON";

	public static final String LEADER_ACCEPT_REASONColumn = "APPLICATION_REWARD_REQ_ALCOHOL.LEADER_ACCEPT_REASON";

	public static final String LEADER_ACCEPTColumn = "APPLICATION_REWARD_REQ_ALCOHOL.LEADER_ACCEPT";

	public static final String LEADER_LEANColumn = "APPLICATION_REWARD_REQ_ALCOHOL.LEADER_LEAN";

	public static final String ACCEPT_DESCColumn = "APPLICATION_REWARD_REQ_ALCOHOL.ACCEPT_DESC";

	public static final String ACCEPT_LEANColumn = "APPLICATION_REWARD_REQ_ALCOHOL.ACCEPT_LEAN";

	public static final String OFFCODE_ARRESTColumn = "APPLICATION_REWARD_REQ_ALCOHOL.OFFCODE_ARREST";

	public static final String POSCODE_ARRESTColumn = "APPLICATION_REWARD_REQ_ALCOHOL.POSCODE_ARREST";

	public static final String STAFF_ID_ARRESTColumn = "APPLICATION_REWARD_REQ_ALCOHOL.STAFF_ID_ARREST";

	public static final String ACCEPT_DATEColumn = "APPLICATION_REWARD_REQ_ALCOHOL.ACCEPT_DATE";

	public static final String APPLICATION_REWARD_REQUEST_IDColumn = "APPLICATION_REWARD_REQ_ALCOHOL.APPLICATION_REWARD_REQUEST_ID";

	public static final String IDColumn = "APPLICATION_REWARD_REQ_ALCOHOL.ID";


	public static final String[] ALL_COLUMNS =
    {
	 REPORT_TOCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, POSCODE_RES_DIRECTORCol	, STAFF_ID_RES_DIRECTORCol	, RES_DIRECTOR_DENY_REASONCol	, RES_DIRECTOR_ACCEPT_REASONCol	, RES_DIRECTOR_ACCEPTCol	, POSCODE_SECTION_DIRECTORCol	, STAFF_ID_SECTION_DIRECTORCol	, SECTION_DIRECTOR_DENY_REASONCol	, SECTION_DIRECTOR_ACCEPT_REASONCol	, SECTION_DIRECTOR_ACCEPTCol	, SECTION_DIRECTOR_LEANCol	, POSCODE_LEADERCol	, STAFF_ID_LEADERCol	, LEADER_DENY_REASONCol	, LEADER_ACCEPT_REASONCol	, LEADER_ACCEPTCol	, LEADER_LEANCol	, ACCEPT_DESCCol	, ACCEPT_LEANCol	, OFFCODE_ARRESTCol	, POSCODE_ARRESTCol	, STAFF_ID_ARRESTCol	, ACCEPT_DATECol	, APPLICATION_REWARD_REQUEST_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  REPORT_TOCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ POSCODE_RES_DIRECTORCol	+","+ STAFF_ID_RES_DIRECTORCol	+","+ RES_DIRECTOR_DENY_REASONCol	+","+ RES_DIRECTOR_ACCEPT_REASONCol	+","+ RES_DIRECTOR_ACCEPTCol	+","+ POSCODE_SECTION_DIRECTORCol	+","+ STAFF_ID_SECTION_DIRECTORCol	+","+ SECTION_DIRECTOR_DENY_REASONCol	+","+ SECTION_DIRECTOR_ACCEPT_REASONCol	+","+ SECTION_DIRECTOR_ACCEPTCol	+","+ SECTION_DIRECTOR_LEANCol	+","+ POSCODE_LEADERCol	+","+ STAFF_ID_LEADERCol	+","+ LEADER_DENY_REASONCol	+","+ LEADER_ACCEPT_REASONCol	+","+ LEADER_ACCEPTCol	+","+ LEADER_LEANCol	+","+ ACCEPT_DESCCol	+","+ ACCEPT_LEANCol	+","+ OFFCODE_ARRESTCol	+","+ POSCODE_ARRESTCol	+","+ STAFF_ID_ARRESTCol	+","+ ACCEPT_DATECol	+","+ APPLICATION_REWARD_REQUEST_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+REPORT_TOCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+POSCODE_RES_DIRECTORCol+"=?,"+STAFF_ID_RES_DIRECTORCol+"=?,"+RES_DIRECTOR_DENY_REASONCol+"=?,"+RES_DIRECTOR_ACCEPT_REASONCol+"=?,"+RES_DIRECTOR_ACCEPTCol+"=?,"+POSCODE_SECTION_DIRECTORCol+"=?,"+STAFF_ID_SECTION_DIRECTORCol+"=?,"+SECTION_DIRECTOR_DENY_REASONCol+"=?,"+SECTION_DIRECTOR_ACCEPT_REASONCol+"=?,"+SECTION_DIRECTOR_ACCEPTCol+"=?,"+SECTION_DIRECTOR_LEANCol+"=?,"+POSCODE_LEADERCol+"=?,"+STAFF_ID_LEADERCol+"=?,"+LEADER_DENY_REASONCol+"=?,"+LEADER_ACCEPT_REASONCol+"=?,"+LEADER_ACCEPTCol+"=?,"+LEADER_LEANCol+"=?,"+ACCEPT_DESCCol+"=?,"+ACCEPT_LEANCol+"=?,"+OFFCODE_ARRESTCol+"=?,"+POSCODE_ARRESTCol+"=?,"+STAFF_ID_ARRESTCol+"=?,"+ACCEPT_DATECol+"=?,"+APPLICATION_REWARD_REQUEST_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationRewardReqAlcohol(DB db){
		super(db);
	}



public synchronized ApplicationRewardReqAlcohol create() throws Exception{
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
					return (ApplicationRewardReqAlcohol)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardReqAlcohol> createList(List<ApplicationRewardReqAlcohol> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationRewardReqAlcohol> resultList = new ArrayList<ApplicationRewardReqAlcohol>();
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
	public ApplicationRewardReqAlcohol findByPk(Long id)throws Exception{
		List<ApplicationRewardReqAlcohol> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationRewardReqAlcohol> findByPks(List<Long> ids)throws Exception{
		List<ApplicationRewardReqAlcohol> resultList = new ArrayList<ApplicationRewardReqAlcohol>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationRewardReqAlcohol> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationRewardReqAlcohol> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationRewardReqAlcohol> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationRewardReqAlcohol> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationRewardReqAlcohol> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationRewardReqAlcohol> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardReqAlcohol> resultList = new ArrayList<ApplicationRewardReqAlcohol>();
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
	public List<ApplicationRewardReqAlcohol> findByExample(ApplicationRewardReqAlcohol instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationRewardReqAlcohol> findByExample(ApplicationRewardReqAlcohol instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationRewardReqAlcohol update()throws Exception{
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
					return (ApplicationRewardReqAlcohol)this;
			}else// not update
				return (ApplicationRewardReqAlcohol)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationRewardReqAlcohol> updateList(List<ApplicationRewardReqAlcohol> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationRewardReqAlcohol> resultList = new ArrayList<ApplicationRewardReqAlcohol>();
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
	public Integer deleteList(List<ApplicationRewardReqAlcohol> objList)throws Exception {
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
	public ApplicationRewardReqAlcohol populate(ResultSet rs)throws Exception{
		ApplicationRewardReqAlcohol result = new ApplicationRewardReqAlcohol(this.db);
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
    private String report_to;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String poscode_res_director;

    private String staff_id_res_director;

    private String res_director_deny_reason;

    private String res_director_accept_reason;

    private String res_director_accept;

    private String poscode_section_director;

    private String staff_id_section_director;

    private String section_director_deny_reason;

    private String section_director_accept_reason;

    private String section_director_accept;

    private String section_director_lean;

    private String poscode_leader;

    private String staff_id_leader;

    private String leader_deny_reason;

    private String leader_accept_reason;

    private String leader_accept;

    private String leader_lean;

    private String accept_desc;

    private String accept_lean;

    private String offcode_arrest;

    private String poscode_arrest;

    private String staff_id_arrest;

    private java.util.Date accept_date;

    private Long application_reward_request_id;

    private Long id;

	//**** getter setter ****//
	public String getReport_to()
    {
        return report_to;
    }
    public void setReport_to(String report_to)
    {
        this.report_to = report_to;
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

	public String getPoscode_res_director()
    {
        return poscode_res_director;
    }
    public void setPoscode_res_director(String poscode_res_director)
    {
        this.poscode_res_director = poscode_res_director;
    }

	public String getStaff_id_res_director()
    {
        return staff_id_res_director;
    }
    public void setStaff_id_res_director(String staff_id_res_director)
    {
        this.staff_id_res_director = staff_id_res_director;
    }

	public String getRes_director_deny_reason()
    {
        return res_director_deny_reason;
    }
    public void setRes_director_deny_reason(String res_director_deny_reason)
    {
        this.res_director_deny_reason = res_director_deny_reason;
    }

	public String getRes_director_accept_reason()
    {
        return res_director_accept_reason;
    }
    public void setRes_director_accept_reason(String res_director_accept_reason)
    {
        this.res_director_accept_reason = res_director_accept_reason;
    }

	public String getRes_director_accept()
    {
        return res_director_accept;
    }
    public void setRes_director_accept(String res_director_accept)
    {
        this.res_director_accept = res_director_accept;
    }

	public String getPoscode_section_director()
    {
        return poscode_section_director;
    }
    public void setPoscode_section_director(String poscode_section_director)
    {
        this.poscode_section_director = poscode_section_director;
    }

	public String getStaff_id_section_director()
    {
        return staff_id_section_director;
    }
    public void setStaff_id_section_director(String staff_id_section_director)
    {
        this.staff_id_section_director = staff_id_section_director;
    }

	public String getSection_director_deny_reason()
    {
        return section_director_deny_reason;
    }
    public void setSection_director_deny_reason(String section_director_deny_reason)
    {
        this.section_director_deny_reason = section_director_deny_reason;
    }

	public String getSection_director_accept_reason()
    {
        return section_director_accept_reason;
    }
    public void setSection_director_accept_reason(String section_director_accept_reason)
    {
        this.section_director_accept_reason = section_director_accept_reason;
    }

	public String getSection_director_accept()
    {
        return section_director_accept;
    }
    public void setSection_director_accept(String section_director_accept)
    {
        this.section_director_accept = section_director_accept;
    }

	public String getSection_director_lean()
    {
        return section_director_lean;
    }
    public void setSection_director_lean(String section_director_lean)
    {
        this.section_director_lean = section_director_lean;
    }

	public String getPoscode_leader()
    {
        return poscode_leader;
    }
    public void setPoscode_leader(String poscode_leader)
    {
        this.poscode_leader = poscode_leader;
    }

	public String getStaff_id_leader()
    {
        return staff_id_leader;
    }
    public void setStaff_id_leader(String staff_id_leader)
    {
        this.staff_id_leader = staff_id_leader;
    }

	public String getLeader_deny_reason()
    {
        return leader_deny_reason;
    }
    public void setLeader_deny_reason(String leader_deny_reason)
    {
        this.leader_deny_reason = leader_deny_reason;
    }

	public String getLeader_accept_reason()
    {
        return leader_accept_reason;
    }
    public void setLeader_accept_reason(String leader_accept_reason)
    {
        this.leader_accept_reason = leader_accept_reason;
    }

	public String getLeader_accept()
    {
        return leader_accept;
    }
    public void setLeader_accept(String leader_accept)
    {
        this.leader_accept = leader_accept;
    }

	public String getLeader_lean()
    {
        return leader_lean;
    }
    public void setLeader_lean(String leader_lean)
    {
        this.leader_lean = leader_lean;
    }

	public String getAccept_desc()
    {
        return accept_desc;
    }
    public void setAccept_desc(String accept_desc)
    {
        this.accept_desc = accept_desc;
    }

	public String getAccept_lean()
    {
        return accept_lean;
    }
    public void setAccept_lean(String accept_lean)
    {
        this.accept_lean = accept_lean;
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

	public java.util.Date getAccept_date()
    {
        return accept_date;
    }
    public void setAccept_date(java.util.Date accept_date)
    {
        this.accept_date = accept_date;
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