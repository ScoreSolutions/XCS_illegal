








 

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

import com.ko.domain.ApplicationArrest;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationArrest extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_ARREST";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_ARREST.ID";

	// short name column
	public static final String ACCUSER_AGECol = "ACCUSER_AGE";
	
	public static final String ACCUSER_NAMECol = "ACCUSER_NAME";
	
	public static final String ACCUSER_OFFNAMECol = "ACCUSER_OFFNAME";
	
	public static final String ACCUSER_POSNAMECol = "ACCUSER_POSNAME";
	
	public static final String ORDER_BY_STAFFCol = "ORDER_BY_STAFF";
	
	public static final String REPORT_TO_STAFFCol = "REPORT_TO_STAFF";
	
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String ARREST_REPORT_DATECol = "ARREST_REPORT_DATE";

	public static final String ISSENTCOURTCol = "ISSENTCOURT";

	public static final String ACCUSER_POSCODECol = "ACCUSER_POSCODE";

	public static final String ACCUSER_OFFCODECol = "ACCUSER_OFFCODE";

	public static final String ACCUSER_IDCARDNOCol = "ACCUSER_IDCARDNO";

	public static final String APPLICATION_SINCERE_CONFIRM_IDCol = "APPLICATION_SINCERE_CONFIRM_ID";

	public static final String APPLICATION_SEARCH_WARRANT_IDCol = "APPLICATION_SEARCH_WARRANT_ID";

	public static final String APPLICATION_NOTICE_ARREST_IDCol = "APPLICATION_NOTICE_ARREST_ID";

	public static final String POLICE_STATIONCol = "POLICE_STATION";

	public static final String ACCUSER_TYPECol = "ACCUSER_TYPE";

	public static final String PRODUCT_GROUP_IDCol = "PRODUCT_GROUP_ID";

	public static final String COORDINATE_YCol = "COORDINATE_Y";

	public static final String COORDINATE_XCol = "COORDINATE_X";

	public static final String ESTIMATE_FINE_DATECol = "ESTIMATE_FINE_DATE";

	public static final String ESTIMATE_FINECol = "ESTIMATE_FINE";

	public static final String DEL_FLAGCol = "DEL_FLAG";

	public static final String ADMINISTRATIONCol = "ADMINISTRATION";

	public static final String LAWBREAK_TYPECol = "LAWBREAK_TYPE";

	public static final String DEPARTMENT_NAMECol = "DEPARTMENT_NAME";

	public static final String FINISHED_TIMECol = "FINISHED_TIME";

	public static final String TESTIMONYCol = "TESTIMONY";

	public static final String BEHAVIOURCol = "BEHAVIOUR";

	public static final String DIRECTOR_POSITIONCol = "DIRECTOR_POSITION";

	public static final String LEADER_POSITIONCol = "LEADER_POSITION";

	public static final String ORDER_BYCol = "ORDER_BY";

	public static final String REPORT_TOCol = "REPORT_TO";

	public static final String DUTYCol = "DUTY";

	public static final String SURETY_NAMECol = "SURETY_NAME";

	public static final String BUSINESS_NAMECol = "BUSINESS_NAME";

	public static final String OWNER_NAMECol = "OWNER_NAME";

	public static final String GUILTYCol = "GUILTY";

	public static final String OCCURRENCE_DATECol = "OCCURRENCE_DATE";

	public static final String ALLEGED_COCol = "ALLEGED_CO";

	public static final String SCENE_PROVINCECol = "SCENE_PROVINCE";

	public static final String SCENE_DISTRICTCol = "SCENE_DISTRICT";

	public static final String SCENE_SUBDISTRICTCol = "SCENE_SUBDISTRICT";

	public static final String SCENE_ROADCol = "SCENE_ROAD";

	public static final String SCENE_SOICol = "SCENE_SOI";

	public static final String SCENE_MOOCol = "SCENE_MOO";

	public static final String SCENE_NOCol = "SCENE_NO";

	public static final String SCENE_NAMECol = "SCENE_NAME";

	public static final String HAVE_CULPRITCol = "HAVE_CULPRIT";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String OFFCODECol = "OFFCODE";

	public static final String DEPARTMENT_IDCol = "DEPARTMENT_ID";

	public static final String APPLICATION_DATECol = "APPLICATION_DATE";

	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String ACCUSER_AGEColumn = "APPLICATION_ARREST.ACCUSER_AGE";
	
	public static final String REPORT_TO_STAFFColumn = "APPLICATION_ARREST.REPORT_TO_STAFF";
	
	public static final String ORDER_BY_STAFFColumn = "APPLICATION_ARREST.ORDER_BY_STAFF";
	
	public static final String ACCUSER_POSNAMEColumn = "APPLICATION_ARREST.ACCUSER_POSNAME";
	
	public static final String ACCUSER_OFFNAMEColumn = "APPLICATION_ARREST.ACCUSER_OFFNAME";
	
	public static final String ACCUSER_NAMEColumn = "APPLICATION_ARREST.ACCUSER_NAME";
	
	public static final String UPDATE_ONColumn = "APPLICATION_ARREST.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_ARREST.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_ARREST.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_ARREST.CREATE_BY";

	public static final String ARREST_REPORT_DATEColumn = "APPLICATION_ARREST.ARREST_REPORT_DATE";

	public static final String ISSENTCOURTColumn = "APPLICATION_ARREST.ISSENTCOURT";

	public static final String ACCUSER_POSCODEColumn = "APPLICATION_ARREST.ACCUSER_POSCODE";

	public static final String ACCUSER_OFFCODEColumn = "APPLICATION_ARREST.ACCUSER_OFFCODE";

	public static final String ACCUSER_IDCARDNOColumn = "APPLICATION_ARREST.ACCUSER_IDCARDNO";

	public static final String APPLICATION_SINCERE_CONFIRM_IDColumn = "APPLICATION_ARREST.APPLICATION_SINCERE_CONFIRM_ID";

	public static final String APPLICATION_SEARCH_WARRANT_IDColumn = "APPLICATION_ARREST.APPLICATION_SEARCH_WARRANT_ID";

	public static final String APPLICATION_NOTICE_ARREST_IDColumn = "APPLICATION_ARREST.APPLICATION_NOTICE_ARREST_ID";

	public static final String POLICE_STATIONColumn = "APPLICATION_ARREST.POLICE_STATION";

	public static final String ACCUSER_TYPEColumn = "APPLICATION_ARREST.ACCUSER_TYPE";

	public static final String PRODUCT_GROUP_IDColumn = "APPLICATION_ARREST.PRODUCT_GROUP_ID";

	public static final String COORDINATE_YColumn = "APPLICATION_ARREST.COORDINATE_Y";

	public static final String COORDINATE_XColumn = "APPLICATION_ARREST.COORDINATE_X";

	public static final String ESTIMATE_FINE_DATEColumn = "APPLICATION_ARREST.ESTIMATE_FINE_DATE";

	public static final String ESTIMATE_FINEColumn = "APPLICATION_ARREST.ESTIMATE_FINE";

	public static final String DEL_FLAGColumn = "APPLICATION_ARREST.DEL_FLAG";

	public static final String ADMINISTRATIONColumn = "APPLICATION_ARREST.ADMINISTRATION";

	public static final String LAWBREAK_TYPEColumn = "APPLICATION_ARREST.LAWBREAK_TYPE";

	public static final String DEPARTMENT_NAMEColumn = "APPLICATION_ARREST.DEPARTMENT_NAME";

	public static final String FINISHED_TIMEColumn = "APPLICATION_ARREST.FINISHED_TIME";

	public static final String TESTIMONYColumn = "APPLICATION_ARREST.TESTIMONY";

	public static final String BEHAVIOURColumn = "APPLICATION_ARREST.BEHAVIOUR";

	public static final String DIRECTOR_POSITIONColumn = "APPLICATION_ARREST.DIRECTOR_POSITION";

	public static final String LEADER_POSITIONColumn = "APPLICATION_ARREST.LEADER_POSITION";

	public static final String ORDER_BYColumn = "APPLICATION_ARREST.ORDER_BY";

	public static final String REPORT_TOColumn = "APPLICATION_ARREST.REPORT_TO";

	public static final String DUTYColumn = "APPLICATION_ARREST.DUTY";

	public static final String SURETY_NAMEColumn = "APPLICATION_ARREST.SURETY_NAME";

	public static final String BUSINESS_NAMEColumn = "APPLICATION_ARREST.BUSINESS_NAME";

	public static final String OWNER_NAMEColumn = "APPLICATION_ARREST.OWNER_NAME";

	public static final String GUILTYColumn = "APPLICATION_ARREST.GUILTY";

	public static final String OCCURRENCE_DATEColumn = "APPLICATION_ARREST.OCCURRENCE_DATE";

	public static final String ALLEGED_COColumn = "APPLICATION_ARREST.ALLEGED_CO";

	public static final String SCENE_PROVINCEColumn = "APPLICATION_ARREST.SCENE_PROVINCE";

	public static final String SCENE_DISTRICTColumn = "APPLICATION_ARREST.SCENE_DISTRICT";

	public static final String SCENE_SUBDISTRICTColumn = "APPLICATION_ARREST.SCENE_SUBDISTRICT";

	public static final String SCENE_ROADColumn = "APPLICATION_ARREST.SCENE_ROAD";

	public static final String SCENE_SOIColumn = "APPLICATION_ARREST.SCENE_SOI";

	public static final String SCENE_MOOColumn = "APPLICATION_ARREST.SCENE_MOO";

	public static final String SCENE_NOColumn = "APPLICATION_ARREST.SCENE_NO";

	public static final String SCENE_NAMEColumn = "APPLICATION_ARREST.SCENE_NAME";

	public static final String HAVE_CULPRITColumn = "APPLICATION_ARREST.HAVE_CULPRIT";

	public static final String LEGISLATION_IDColumn = "APPLICATION_ARREST.LEGISLATION_ID";

	public static final String OFFCODEColumn = "APPLICATION_ARREST.OFFCODE";

	public static final String DEPARTMENT_IDColumn = "APPLICATION_ARREST.DEPARTMENT_ID";

	public static final String APPLICATION_DATEColumn = "APPLICATION_ARREST.APPLICATION_DATE";

	public static final String TRACK_NOColumn = "APPLICATION_ARREST.TRACK_NO";

	public static final String IDColumn = "APPLICATION_ARREST.ID";


	public static final String[] ALL_COLUMNS =
    {
	 	ACCUSER_AGECol ,ACCUSER_NAMECol, ACCUSER_OFFNAMECol, ACCUSER_POSNAMECol , ORDER_BY_STAFFCol, REPORT_TO_STAFFCol ,UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, ARREST_REPORT_DATECol	, ISSENTCOURTCol	, ACCUSER_POSCODECol	, ACCUSER_OFFCODECol	, ACCUSER_IDCARDNOCol	, APPLICATION_SINCERE_CONFIRM_IDCol	, APPLICATION_SEARCH_WARRANT_IDCol	, APPLICATION_NOTICE_ARREST_IDCol	, POLICE_STATIONCol	, ACCUSER_TYPECol	, PRODUCT_GROUP_IDCol	, COORDINATE_YCol	, COORDINATE_XCol	, ESTIMATE_FINE_DATECol	, ESTIMATE_FINECol	, DEL_FLAGCol	, ADMINISTRATIONCol	, LAWBREAK_TYPECol	, DEPARTMENT_NAMECol	, FINISHED_TIMECol	, TESTIMONYCol	, BEHAVIOURCol	, DIRECTOR_POSITIONCol	, LEADER_POSITIONCol	, ORDER_BYCol	, REPORT_TOCol	, DUTYCol	, SURETY_NAMECol	, BUSINESS_NAMECol	, OWNER_NAMECol	, GUILTYCol	, OCCURRENCE_DATECol	, ALLEGED_COCol	, SCENE_PROVINCECol	, SCENE_DISTRICTCol	, SCENE_SUBDISTRICTCol	, SCENE_ROADCol	, SCENE_SOICol	, SCENE_MOOCol	, SCENE_NOCol	, SCENE_NAMECol	, HAVE_CULPRITCol	, LEGISLATION_IDCol	, OFFCODECol	, DEPARTMENT_IDCol	, APPLICATION_DATECol	, TRACK_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  ACCUSER_AGECol + ", " + ACCUSER_NAMECol +","+ ACCUSER_OFFNAMECol +","+ ACCUSER_POSNAMECol +","+ ORDER_BY_STAFFCol +","+ REPORT_TO_STAFFCol  + ", " +UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ ARREST_REPORT_DATECol	+","+ ISSENTCOURTCol	+","+ ACCUSER_POSCODECol	+","+ ACCUSER_OFFCODECol	+","+ ACCUSER_IDCARDNOCol	+","+ APPLICATION_SINCERE_CONFIRM_IDCol	+","+ APPLICATION_SEARCH_WARRANT_IDCol	+","+ APPLICATION_NOTICE_ARREST_IDCol	+","+ POLICE_STATIONCol	+","+ ACCUSER_TYPECol	+","+ PRODUCT_GROUP_IDCol	+","+ COORDINATE_YCol	+","+ COORDINATE_XCol	+","+ ESTIMATE_FINE_DATECol	+","+ ESTIMATE_FINECol	+","+ DEL_FLAGCol	+","+ ADMINISTRATIONCol	+","+ LAWBREAK_TYPECol	+","+ DEPARTMENT_NAMECol	+","+ FINISHED_TIMECol	+","+ TESTIMONYCol	+","+ BEHAVIOURCol	+","+ DIRECTOR_POSITIONCol	+","+ LEADER_POSITIONCol	+","+ ORDER_BYCol	+","+ REPORT_TOCol	+","+ DUTYCol	+","+ SURETY_NAMECol	+","+ BUSINESS_NAMECol	+","+ OWNER_NAMECol	+","+ GUILTYCol	+","+ OCCURRENCE_DATECol	+","+ ALLEGED_COCol	+","+ SCENE_PROVINCECol	+","+ SCENE_DISTRICTCol	+","+ SCENE_SUBDISTRICTCol	+","+ SCENE_ROADCol	+","+ SCENE_SOICol	+","+ SCENE_MOOCol	+","+ SCENE_NOCol	+","+ SCENE_NAMECol	+","+ HAVE_CULPRITCol	+","+ LEGISLATION_IDCol	+","+ OFFCODECol	+","+ DEPARTMENT_IDCol	+","+ APPLICATION_DATECol	+","+ TRACK_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+ARREST_REPORT_DATECol+"=?,"+ISSENTCOURTCol+"=?,"+ACCUSER_POSCODECol+"=?,"+ACCUSER_OFFCODECol+"=?,"+ACCUSER_IDCARDNOCol+"=?,"+APPLICATION_SINCERE_CONFIRM_IDCol+"=?,"+APPLICATION_SEARCH_WARRANT_IDCol+"=?,"+APPLICATION_NOTICE_ARREST_IDCol+"=?,"+POLICE_STATIONCol+"=?,"+ACCUSER_TYPECol+"=?,"+PRODUCT_GROUP_IDCol+"=?,"+COORDINATE_YCol+"=?,"+COORDINATE_XCol+"=?,"+ESTIMATE_FINE_DATECol+"=?,"+ESTIMATE_FINECol+"=?,"+DEL_FLAGCol+"=?,"+ADMINISTRATIONCol+"=?,"+LAWBREAK_TYPECol+"=?,"+DEPARTMENT_NAMECol+"=?,"+FINISHED_TIMECol+"=?,"+TESTIMONYCol+"=?,"+BEHAVIOURCol+"=?,"+DIRECTOR_POSITIONCol+"=?,"+LEADER_POSITIONCol+"=?,"+ORDER_BYCol+"=?,"+REPORT_TOCol+"=?,"+DUTYCol+"=?,"+SURETY_NAMECol+"=?,"+BUSINESS_NAMECol+"=?,"+OWNER_NAMECol+"=?,"+GUILTYCol+"=?,"+OCCURRENCE_DATECol+"=?,"+ALLEGED_COCol+"=?,"+SCENE_PROVINCECol+"=?,"+SCENE_DISTRICTCol+"=?,"+SCENE_SUBDISTRICTCol+"=?,"+SCENE_ROADCol+"=?,"+SCENE_SOICol+"=?,"+SCENE_MOOCol+"=?,"+SCENE_NOCol+"=?,"+SCENE_NAMECol+"=?,"+HAVE_CULPRITCol+"=?,"+LEGISLATION_IDCol+"=?,"+OFFCODECol+"=?,"+DEPARTMENT_IDCol+"=?,"+APPLICATION_DATECol+"=?,"+TRACK_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationArrest(DB db){
		super(db);
	}



public synchronized ApplicationArrest create() throws Exception{
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
					return (ApplicationArrest)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationArrest> createList(List<ApplicationArrest> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationArrest> resultList = new ArrayList<ApplicationArrest>();
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
	public ApplicationArrest findByPk(Long id)throws Exception{
		List<ApplicationArrest> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationArrest> findByPks(List<Long> ids)throws Exception{
		List<ApplicationArrest> resultList = new ArrayList<ApplicationArrest>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationArrest> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationArrest> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationArrest> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationArrest> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationArrest> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationArrest> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationArrest> resultList = new ArrayList<ApplicationArrest>();
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
	public List<ApplicationArrest> findByExample(ApplicationArrest instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationArrest> findByExample(ApplicationArrest instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationArrest update()throws Exception{
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
					return (ApplicationArrest)this;
			}else// not update
				return (ApplicationArrest)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationArrest> updateList(List<ApplicationArrest> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationArrest> resultList = new ArrayList<ApplicationArrest>();
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
	public Integer deleteList(List<ApplicationArrest> objList)throws Exception {
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
	public ApplicationArrest populate(ResultSet rs)throws Exception{
		ApplicationArrest result = new ApplicationArrest(this.db);
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
    private Long accuser_age;
    
    private String accuser_name;
    
    private String accuser_offname;
    
    private String accuser_posname;
    
    private String order_by_staff;
    
    private String report_to_staff;
    
    private java.util.Date update_on;

    private String update_by;

    private java.util.Date create_on;

    private String create_by;

    private java.util.Date arrest_report_date;

    private String issentcourt;

    private String accuser_poscode;

    private String accuser_offcode;

    private String accuser_idcardno;

    private Long application_sincere_confirm_id;

    private Long application_search_warrant_id;

    private Long application_notice_arrest_id;

    private String police_station;

    private String accuser_type;

    private String product_group_id;

    private Double coordinate_y;

    private Double coordinate_x;

    private java.util.Date estimate_fine_date;

    private Double estimate_fine;

    private String del_flag;

    private String administration;

    private String lawbreak_type;

    private String department_name;

    private java.util.Date finished_time;

    private String testimony;

    private String behaviour;

    private String director_position;

    private String leader_position;

    private Long order_by;

    private Long report_to;

    private String duty;

    private String surety_name;

    private String business_name;

    private String owner_name;

    private String guilty;

    private java.util.Date occurrence_date;

    private String alleged_co;

    private String scene_province;

    private String scene_district;

    private String scene_subdistrict;

    private String scene_road;

    private String scene_soi;

    private String scene_moo;

    private String scene_no;

    private String scene_name;

    private String have_culprit;

    private Long legislation_id;

    private String offcode;

    private String department_id;

    private java.util.Date application_date;

    private String track_no;

    private Long id;

	//**** getter setter ****//
    public Long getAccuser_age(){
    	return accuser_age;
    }
    public void setAccuser_age(Long value){
    	accuser_age = value;
    }
    
    public String getAccuser_name(){
    	return accuser_name;
    }
    public void setAccuser_name(String accuser_name){
    	this.accuser_name = accuser_name;
    }
    
    public String getAccuser_offname(){
    	return accuser_offname;
    }
    public void setAccuser_offname(String accuser_offname){
    	this.accuser_offname = accuser_offname;
    }
    
    public String getAccuser_posname(){
    	return accuser_posname;
    }
    public void setAccuser_posname(String accuser_posname){
    	this.accuser_posname = accuser_posname;
    }
    
    public String getOrder_by_staff(){
    	return order_by_staff;
    }
    public void setOrder_by_staff(String order_by_staff){
    	this.order_by_staff = order_by_staff;
    }
    
    public String getReport_to_staff(){
    	return report_to_staff;
    }
    public void setReport_to_staff(String report_to_staff){
    	this.report_to_staff = report_to_staff;
    }
    
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

	public java.util.Date getArrest_report_date()
    {
        return arrest_report_date;
    }
    public void setArrest_report_date(java.util.Date arrest_report_date)
    {
        this.arrest_report_date = arrest_report_date;
    }

	public String getIssentcourt()
    {
        return issentcourt;
    }
    public void setIssentcourt(String issentcourt)
    {
        this.issentcourt = issentcourt;
    }

	public String getAccuser_poscode()
    {
        return accuser_poscode;
    }
    public void setAccuser_poscode(String accuser_poscode)
    {
        this.accuser_poscode = accuser_poscode;
    }

	public String getAccuser_offcode()
    {
        return accuser_offcode;
    }
    public void setAccuser_offcode(String accuser_offcode)
    {
        this.accuser_offcode = accuser_offcode;
    }

	public String getAccuser_idcardno()
    {
        return accuser_idcardno;
    }
    public void setAccuser_idcardno(String accuser_idcardno)
    {
        this.accuser_idcardno = accuser_idcardno;
    }

	public Long getApplication_sincere_confirm_id()
    {
        return application_sincere_confirm_id;
    }
    public void setApplication_sincere_confirm_id(Long application_sincere_confirm_id)
    {
        this.application_sincere_confirm_id = application_sincere_confirm_id;
    }

	public Long getApplication_search_warrant_id()
    {
        return application_search_warrant_id;
    }
    public void setApplication_search_warrant_id(Long application_search_warrant_id)
    {
        this.application_search_warrant_id = application_search_warrant_id;
    }

	public Long getApplication_notice_arrest_id()
    {
        return application_notice_arrest_id;
    }
    public void setApplication_notice_arrest_id(Long application_notice_arrest_id)
    {
        this.application_notice_arrest_id = application_notice_arrest_id;
    }

	public String getPolice_station()
    {
        return police_station;
    }
    public void setPolice_station(String police_station)
    {
        this.police_station = police_station;
    }

	public String getAccuser_type()
    {
        return accuser_type;
    }
    public void setAccuser_type(String accuser_type)
    {
        this.accuser_type = accuser_type;
    }

	public String getProduct_group_id()
    {
        return product_group_id;
    }
    public void setProduct_group_id(String product_group_id)
    {
        this.product_group_id = product_group_id;
    }

	public Double getCoordinate_y()
    {
        return coordinate_y;
    }
    public void setCoordinate_y(Double coordinate_y)
    {
        this.coordinate_y = coordinate_y;
    }

	public Double getCoordinate_x()
    {
        return coordinate_x;
    }
    public void setCoordinate_x(Double coordinate_x)
    {
        this.coordinate_x = coordinate_x;
    }

	public java.util.Date getEstimate_fine_date()
    {
        return estimate_fine_date;
    }
    public void setEstimate_fine_date(java.util.Date estimate_fine_date)
    {
        this.estimate_fine_date = estimate_fine_date;
    }

	public Double getEstimate_fine()
    {
        return estimate_fine;
    }
    public void setEstimate_fine(Double estimate_fine)
    {
        this.estimate_fine = estimate_fine;
    }

	public String getDel_flag()
    {
        return del_flag;
    }
    public void setDel_flag(String del_flag)
    {
        this.del_flag = del_flag;
    }

	public String getAdministration()
    {
        return administration;
    }
    public void setAdministration(String administration)
    {
        this.administration = administration;
    }

	public String getLawbreak_type()
    {
        return lawbreak_type;
    }
    public void setLawbreak_type(String lawbreak_type)
    {
        this.lawbreak_type = lawbreak_type;
    }

	public String getDepartment_name()
    {
        return department_name;
    }
    public void setDepartment_name(String department_name)
    {
        this.department_name = department_name;
    }

	public java.util.Date getFinished_time()
    {
        return finished_time;
    }
    public void setFinished_time(java.util.Date finished_time)
    {
        this.finished_time = finished_time;
    }

	public String getTestimony()
    {
        return testimony;
    }
    public void setTestimony(String testimony)
    {
        this.testimony = testimony;
    }

	public String getBehaviour()
    {
        return behaviour;
    }
    public void setBehaviour(String behaviour)
    {
        this.behaviour = behaviour;
    }

	public String getDirector_position()
    {
        return director_position;
    }
    public void setDirector_position(String director_position)
    {
        this.director_position = director_position;
    }

	public String getLeader_position()
    {
        return leader_position;
    }
    public void setLeader_position(String leader_position)
    {
        this.leader_position = leader_position;
    }

	public Long getOrder_by()
    {
        return order_by;
    }
    public void setOrder_by(Long order_by)
    {
        this.order_by = order_by;
    }

	public Long getReport_to()
    {
        return report_to;
    }
    public void setReport_to(Long report_to)
    {
        this.report_to = report_to;
    }

	public String getDuty()
    {
        return duty;
    }
    public void setDuty(String duty)
    {
        this.duty = duty;
    }

	public String getSurety_name()
    {
        return surety_name;
    }
    public void setSurety_name(String surety_name)
    {
        this.surety_name = surety_name;
    }

	public String getBusiness_name()
    {
        return business_name;
    }
    public void setBusiness_name(String business_name)
    {
        this.business_name = business_name;
    }

	public String getOwner_name()
    {
        return owner_name;
    }
    public void setOwner_name(String owner_name)
    {
        this.owner_name = owner_name;
    }

	public String getGuilty()
    {
        return guilty;
    }
    public void setGuilty(String guilty)
    {
        this.guilty = guilty;
    }

	public java.util.Date getOccurrence_date()
    {
        return occurrence_date;
    }
    public void setOccurrence_date(java.util.Date occurrence_date)
    {
        this.occurrence_date = occurrence_date;
    }

	public String getAlleged_co()
    {
        return alleged_co;
    }
    public void setAlleged_co(String alleged_co)
    {
        this.alleged_co = alleged_co;
    }

	public String getScene_province()
    {
        return scene_province;
    }
    public void setScene_province(String scene_province)
    {
        this.scene_province = scene_province;
    }

	public String getScene_district()
    {
        return scene_district;
    }
    public void setScene_district(String scene_district)
    {
        this.scene_district = scene_district;
    }

	public String getScene_subdistrict()
    {
        return scene_subdistrict;
    }
    public void setScene_subdistrict(String scene_subdistrict)
    {
        this.scene_subdistrict = scene_subdistrict;
    }

	public String getScene_road()
    {
        return scene_road;
    }
    public void setScene_road(String scene_road)
    {
        this.scene_road = scene_road;
    }

	public String getScene_soi()
    {
        return scene_soi;
    }
    public void setScene_soi(String scene_soi)
    {
        this.scene_soi = scene_soi;
    }

	public String getScene_moo()
    {
        return scene_moo;
    }
    public void setScene_moo(String scene_moo)
    {
        this.scene_moo = scene_moo;
    }

	public String getScene_no()
    {
        return scene_no;
    }
    public void setScene_no(String scene_no)
    {
        this.scene_no = scene_no;
    }

	public String getScene_name()
    {
        return scene_name;
    }
    public void setScene_name(String scene_name)
    {
        this.scene_name = scene_name;
    }

	public String getHave_culprit()
    {
        return have_culprit;
    }
    public void setHave_culprit(String have_culprit)
    {
        this.have_culprit = have_culprit;
    }

	public Long getLegislation_id()
    {
        return legislation_id;
    }
    public void setLegislation_id(Long legislation_id)
    {
        this.legislation_id = legislation_id;
    }

	public String getOffcode()
    {
        return offcode;
    }
    public void setOffcode(String offcode)
    {
        this.offcode = offcode;
    }

	public String getDepartment_id()
    {
        return department_id;
    }
    public void setDepartment_id(String department_id)
    {
        this.department_id = department_id;
    }

	public java.util.Date getApplication_date()
    {
        return application_date;
    }
    public void setApplication_date(java.util.Date application_date)
    {
        this.application_date = application_date;
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