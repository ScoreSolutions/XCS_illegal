








 

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

import com.ko.domain.ApplicationNoticeArrest;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationNoticeArrest extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_NOTICE_ARREST";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_NOTICE_ARREST.ID";

	// short name column
	public static final String INFORM_LEANCol = "INFORM_LEAN";
	
	public static final String LAW_BAD_MST_IDCol = "LAW_BAD_MST_ID";
	
	public static final String LAWBREAKER_NAMECol = "LAWBREAKER_NAME";
	
	public static final String LAW_ER_DEPTCol = "LAW_ER_DEPT";
	
	public static final String LAW_ER_POSCol = "LAW_ER_POS";
	
	public static final String APPROVE_DEPTCol = "APPROVE_DEPT";
	
	public static final String APPROVE_POSCol = "APPROVE_POS";
	
	public static final String OWNER_DEPTCol = "OWNER_DEPT";
	
	public static final String OWNER_POSCol = "OWNER_POS";
	
	public static final String ISFINGERAPPROVECol = "ISFINGERAPPROVE";

	public static final String INFORM_TYPECol = "INFORM_TYPE";

	public static final String DEL_FLAGCol = "DEL_FLAG";

	public static final String OFFCODECol = "OFFCODE";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String ISREWARD_PAYCol = "ISREWARD_PAY";

	public static final String ISMANAGECol = "ISMANAGE";

	public static final String NOTICE_RESULTCol = "NOTICE_RESULT";

	public static final String REMARKSCol = "REMARKS";

	public static final String NEXT_STEPCol = "NEXT_STEP";

	public static final String OFFCODE_COMMANDERCol = "OFFCODE_COMMANDER";

	public static final String POSCODE_COMMANDERCol = "POSCODE_COMMANDER";

	public static final String STAFF_ID_COMMANDERCol = "STAFF_ID_COMMANDER";

	public static final String STAFF_ID_ACCEPTCol = "STAFF_ID_ACCEPT";

	public static final String OFFCODE_SURETYCol = "OFFCODE_SURETY";

	public static final String POSCODE_SURETYCol = "POSCODE_SURETY";

	public static final String STAFF_ID_SURETYCol = "STAFF_ID_SURETY";

	public static final String OFFCODE_RECEIVECol = "OFFCODE_RECEIVE";

	public static final String POSCODE_RECEIVECol = "POSCODE_RECEIVE";

	public static final String STAFF_ID_RECEIVECol = "STAFF_ID_RECEIVE";

	public static final String HIDING_PLACECol = "HIDING_PLACE";

	public static final String VEHICLE_PARTICULARCol = "VEHICLE_PARTICULAR";

	public static final String LAWBREAKER_PROVINCE_CODECol = "LAWBREAKER_PROVINCE_CODE";

	public static final String LAWBREAKER_DISTRICT_CODECol = "LAWBREAKER_DISTRICT_CODE";

	public static final String LAWBREAKER_SUBDISTRICT_CODECol = "LAWBREAKER_SUBDISTRICT_CODE";

	public static final String LAWBREAKER_MOOCol = "LAWBREAKER_MOO";

	public static final String LAWBREAKER_ROADCol = "LAWBREAKER_ROAD";

	public static final String LAWBREAKER_SOICol = "LAWBREAKER_SOI";

	public static final String LAWBREAKER_ADDRESS_NAMECol = "LAWBREAKER_ADDRESS_NAME";

	public static final String LAWBREAKER_ADDRESSCol = "LAWBREAKER_ADDRESS";

	public static final String SECRET_LEVELCol = "SECRET_LEVEL";

	public static final String ARREST_DESCCol = "ARREST_DESC";

	public static final String INFORM_PROVINCE_CODECol = "INFORM_PROVINCE_CODE";

	public static final String INFORM_DISTRICT_CODECol = "INFORM_DISTRICT_CODE";

	public static final String INFORM_SUBDISTRICT_CODECol = "INFORM_SUBDISTRICT_CODE";

	public static final String INFORM_MOOCol = "INFORM_MOO";

	public static final String INFORM_ROADCol = "INFORM_ROAD";

	public static final String INFORM_SOICol = "INFORM_SOI";

	public static final String INFORM_ADDRESS_NAMECol = "INFORM_ADDRESS_NAME";

	public static final String INFORM_ADDRESSCol = "INFORM_ADDRESS";

	public static final String INFORM_AGECol = "INFORM_AGE";

	public static final String INFORM_NAMECol = "INFORM_NAME";

	public static final String LAWBREAKER_NOCol = "LAWBREAKER_NO";

	public static final String RECEIVE_DATECol = "RECEIVE_DATE";

	public static final String DUTY_CODECol = "DUTY_CODE";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String OFFNAMECol = "OFFNAME";

	public static final String NOTICE_DATECol = "NOTICE_DATE";

	public static final String NOTICE_NOCol = "NOTICE_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String INFORM_LEANColumn = "APPLICATION_NOTICE_ARREST.INFORM_LEAN";
	
	public static final String LAW_BAD_MST_IDColumn = "APPLICATION_NOTICE_ARREST.LAW_BAD_MST_ID";
	
	public static final String LAWBREAKER_NAMEColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_NAME";
	
	public static final String LAW_ER_DEPTColumn = "APPLICATION_NOTICE_ARREST.LAW_ER_DEPT";
	
	public static final String LAW_ER_POSColumn = "APPLICATION_NOTICE_ARREST.LAW_ER_POS";
	
	public static final String APPROVE_DEPTColumn = "APPLICATION_NOTICE_ARREST.APPROVE_DEPT";
	
	public static final String APPROVE_POSColumn = "APPLICATION_NOTICE_ARREST.APPROVE_POS";
	
	public static final String OWNER_DEPTColumn = "APPLICATION_NOTICE_ARREST.OWNER_DEPT";
	
	public static final String OWNER_POSColumn = "APPLICATION_NOTICE_ARREST.OWNER_POS";
	
	public static final String ISFINGERAPPROVEColumn = "APPLICATION_NOTICE_ARREST.ISFINGERAPPROVE";

	public static final String INFORM_TYPEColumn = "APPLICATION_NOTICE_ARREST.INFORM_TYPE";

	public static final String DEL_FLAGColumn = "APPLICATION_NOTICE_ARREST.DEL_FLAG";

	public static final String OFFCODEColumn = "APPLICATION_NOTICE_ARREST.OFFCODE";

	public static final String UPDATE_ONColumn = "APPLICATION_NOTICE_ARREST.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_NOTICE_ARREST.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_NOTICE_ARREST.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_NOTICE_ARREST.CREATE_BY";

	public static final String ISREWARD_PAYColumn = "APPLICATION_NOTICE_ARREST.ISREWARD_PAY";

	public static final String ISMANAGEColumn = "APPLICATION_NOTICE_ARREST.ISMANAGE";

	public static final String NOTICE_RESULTColumn = "APPLICATION_NOTICE_ARREST.NOTICE_RESULT";

	public static final String REMARKSColumn = "APPLICATION_NOTICE_ARREST.REMARKS";

	public static final String NEXT_STEPColumn = "APPLICATION_NOTICE_ARREST.NEXT_STEP";

	public static final String OFFCODE_COMMANDERColumn = "APPLICATION_NOTICE_ARREST.OFFCODE_COMMANDER";

	public static final String POSCODE_COMMANDERColumn = "APPLICATION_NOTICE_ARREST.POSCODE_COMMANDER";

	public static final String STAFF_ID_COMMANDERColumn = "APPLICATION_NOTICE_ARREST.STAFF_ID_COMMANDER";

	public static final String STAFF_ID_ACCEPTColumn = "APPLICATION_NOTICE_ARREST.STAFF_ID_ACCEPT";

	public static final String OFFCODE_SURETYColumn = "APPLICATION_NOTICE_ARREST.OFFCODE_SURETY";

	public static final String POSCODE_SURETYColumn = "APPLICATION_NOTICE_ARREST.POSCODE_SURETY";

	public static final String STAFF_ID_SURETYColumn = "APPLICATION_NOTICE_ARREST.STAFF_ID_SURETY";

	public static final String OFFCODE_RECEIVEColumn = "APPLICATION_NOTICE_ARREST.OFFCODE_RECEIVE";

	public static final String POSCODE_RECEIVEColumn = "APPLICATION_NOTICE_ARREST.POSCODE_RECEIVE";

	public static final String STAFF_ID_RECEIVEColumn = "APPLICATION_NOTICE_ARREST.STAFF_ID_RECEIVE";

	public static final String HIDING_PLACEColumn = "APPLICATION_NOTICE_ARREST.HIDING_PLACE";

	public static final String VEHICLE_PARTICULARColumn = "APPLICATION_NOTICE_ARREST.VEHICLE_PARTICULAR";

	public static final String LAWBREAKER_PROVINCE_CODEColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_PROVINCE_CODE";

	public static final String LAWBREAKER_DISTRICT_CODEColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_DISTRICT_CODE";

	public static final String LAWBREAKER_SUBDISTRICT_CODEColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_SUBDISTRICT_CODE";

	public static final String LAWBREAKER_MOOColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_MOO";

	public static final String LAWBREAKER_ROADColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_ROAD";

	public static final String LAWBREAKER_SOIColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_SOI";

	public static final String LAWBREAKER_ADDRESS_NAMEColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_ADDRESS_NAME";

	public static final String LAWBREAKER_ADDRESSColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_ADDRESS";

	public static final String SECRET_LEVELColumn = "APPLICATION_NOTICE_ARREST.SECRET_LEVEL";

	public static final String ARREST_DESCColumn = "APPLICATION_NOTICE_ARREST.ARREST_DESC";

	public static final String INFORM_PROVINCE_CODEColumn = "APPLICATION_NOTICE_ARREST.INFORM_PROVINCE_CODE";

	public static final String INFORM_DISTRICT_CODEColumn = "APPLICATION_NOTICE_ARREST.INFORM_DISTRICT_CODE";

	public static final String INFORM_SUBDISTRICT_CODEColumn = "APPLICATION_NOTICE_ARREST.INFORM_SUBDISTRICT_CODE";

	public static final String INFORM_MOOColumn = "APPLICATION_NOTICE_ARREST.INFORM_MOO";

	public static final String INFORM_ROADColumn = "APPLICATION_NOTICE_ARREST.INFORM_ROAD";

	public static final String INFORM_SOIColumn = "APPLICATION_NOTICE_ARREST.INFORM_SOI";

	public static final String INFORM_ADDRESS_NAMEColumn = "APPLICATION_NOTICE_ARREST.INFORM_ADDRESS_NAME";

	public static final String INFORM_ADDRESSColumn = "APPLICATION_NOTICE_ARREST.INFORM_ADDRESS";

	public static final String INFORM_AGEColumn = "APPLICATION_NOTICE_ARREST.INFORM_AGE";

	public static final String INFORM_NAMEColumn = "APPLICATION_NOTICE_ARREST.INFORM_NAME";

	public static final String LAWBREAKER_NOColumn = "APPLICATION_NOTICE_ARREST.LAWBREAKER_NO";

	public static final String RECEIVE_DATEColumn = "APPLICATION_NOTICE_ARREST.RECEIVE_DATE";

	public static final String DUTY_CODEColumn = "APPLICATION_NOTICE_ARREST.DUTY_CODE";

	public static final String LEGISLATION_IDColumn = "APPLICATION_NOTICE_ARREST.LEGISLATION_ID";

	public static final String OFFNAMEColumn = "APPLICATION_NOTICE_ARREST.OFFNAME";

	public static final String NOTICE_DATEColumn = "APPLICATION_NOTICE_ARREST.NOTICE_DATE";

	public static final String NOTICE_NOColumn = "APPLICATION_NOTICE_ARREST.NOTICE_NO";

	public static final String IDColumn = "APPLICATION_NOTICE_ARREST.ID";


	public static final String[] ALL_COLUMNS =
    {
		INFORM_LEANCol, LAW_BAD_MST_IDCol, LAWBREAKER_NAMECol,LAW_ER_DEPTCol,LAW_ER_POSCol,APPROVE_DEPTCol,APPROVE_POSCol,OWNER_DEPTCol,OWNER_POSCol, ISFINGERAPPROVECol	, INFORM_TYPECol	, DEL_FLAGCol	, OFFCODECol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, ISREWARD_PAYCol	, ISMANAGECol	, NOTICE_RESULTCol	, REMARKSCol	, NEXT_STEPCol	, OFFCODE_COMMANDERCol	, POSCODE_COMMANDERCol	, STAFF_ID_COMMANDERCol	, STAFF_ID_ACCEPTCol	, OFFCODE_SURETYCol	, POSCODE_SURETYCol	, STAFF_ID_SURETYCol	, OFFCODE_RECEIVECol	, POSCODE_RECEIVECol	, STAFF_ID_RECEIVECol	, HIDING_PLACECol	, VEHICLE_PARTICULARCol	, LAWBREAKER_PROVINCE_CODECol	, LAWBREAKER_DISTRICT_CODECol	, LAWBREAKER_SUBDISTRICT_CODECol	, LAWBREAKER_MOOCol	, LAWBREAKER_ROADCol	, LAWBREAKER_SOICol	, LAWBREAKER_ADDRESS_NAMECol	, LAWBREAKER_ADDRESSCol	, SECRET_LEVELCol	, ARREST_DESCCol	, INFORM_PROVINCE_CODECol	, INFORM_DISTRICT_CODECol	, INFORM_SUBDISTRICT_CODECol	, INFORM_MOOCol	, INFORM_ROADCol	, INFORM_SOICol	, INFORM_ADDRESS_NAMECol	, INFORM_ADDRESSCol	, INFORM_AGECol	, INFORM_NAMECol	, LAWBREAKER_NOCol	, RECEIVE_DATECol	, DUTY_CODECol	, LEGISLATION_IDCol	, OFFNAMECol	, NOTICE_DATECol	, NOTICE_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING = INFORM_LEANCol + ", " + LAW_BAD_MST_IDCol +","+ LAWBREAKER_NAMECol +","+ LAW_ER_DEPTCol +","+ LAW_ER_POSCol +","+ APPROVE_DEPTCol +","+ APPROVE_POSCol +","+ OWNER_DEPTCol +","+ OWNER_POSCol +","+ ISFINGERAPPROVECol	+","+ INFORM_TYPECol	+","+ DEL_FLAGCol	+","+ OFFCODECol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ ISREWARD_PAYCol	+","+ ISMANAGECol	+","+ NOTICE_RESULTCol	+","+ REMARKSCol	+","+ NEXT_STEPCol	+","+ OFFCODE_COMMANDERCol	+","+ POSCODE_COMMANDERCol	+","+ STAFF_ID_COMMANDERCol	+","+ STAFF_ID_ACCEPTCol	+","+ OFFCODE_SURETYCol	+","+ POSCODE_SURETYCol	+","+ STAFF_ID_SURETYCol	+","+ OFFCODE_RECEIVECol	+","+ POSCODE_RECEIVECol	+","+ STAFF_ID_RECEIVECol	+","+ HIDING_PLACECol	+","+ VEHICLE_PARTICULARCol	+","+ LAWBREAKER_PROVINCE_CODECol	+","+ LAWBREAKER_DISTRICT_CODECol	+","+ LAWBREAKER_SUBDISTRICT_CODECol	+","+ LAWBREAKER_MOOCol	+","+ LAWBREAKER_ROADCol	+","+ LAWBREAKER_SOICol	+","+ LAWBREAKER_ADDRESS_NAMECol	+","+ LAWBREAKER_ADDRESSCol	+","+ SECRET_LEVELCol	+","+ ARREST_DESCCol	+","+ INFORM_PROVINCE_CODECol	+","+ INFORM_DISTRICT_CODECol	+","+ INFORM_SUBDISTRICT_CODECol	+","+ INFORM_MOOCol	+","+ INFORM_ROADCol	+","+ INFORM_SOICol	+","+ INFORM_ADDRESS_NAMECol	+","+ INFORM_ADDRESSCol	+","+ INFORM_AGECol	+","+ INFORM_NAMECol	+","+ LAWBREAKER_NOCol	+","+ RECEIVE_DATECol	+","+ DUTY_CODECol	+","+ LEGISLATION_IDCol	+","+ OFFNAMECol	+","+ NOTICE_DATECol	+","+ NOTICE_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+ISFINGERAPPROVECol+"=?,"+INFORM_TYPECol+"=?,"+DEL_FLAGCol+"=?,"+OFFCODECol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+ISREWARD_PAYCol+"=?,"+ISMANAGECol+"=?,"+NOTICE_RESULTCol+"=?,"+REMARKSCol+"=?,"+NEXT_STEPCol+"=?,"+OFFCODE_COMMANDERCol+"=?,"+POSCODE_COMMANDERCol+"=?,"+STAFF_ID_COMMANDERCol+"=?,"+STAFF_ID_ACCEPTCol+"=?,"+OFFCODE_SURETYCol+"=?,"+POSCODE_SURETYCol+"=?,"+STAFF_ID_SURETYCol+"=?,"+OFFCODE_RECEIVECol+"=?,"+POSCODE_RECEIVECol+"=?,"+STAFF_ID_RECEIVECol+"=?,"+HIDING_PLACECol+"=?,"+VEHICLE_PARTICULARCol+"=?,"+LAWBREAKER_PROVINCE_CODECol+"=?,"+LAWBREAKER_DISTRICT_CODECol+"=?,"+LAWBREAKER_SUBDISTRICT_CODECol+"=?,"+LAWBREAKER_MOOCol+"=?,"+LAWBREAKER_ROADCol+"=?,"+LAWBREAKER_SOICol+"=?,"+LAWBREAKER_ADDRESS_NAMECol+"=?,"+LAWBREAKER_ADDRESSCol+"=?,"+SECRET_LEVELCol+"=?,"+ARREST_DESCCol+"=?,"+INFORM_PROVINCE_CODECol+"=?,"+INFORM_DISTRICT_CODECol+"=?,"+INFORM_SUBDISTRICT_CODECol+"=?,"+INFORM_MOOCol+"=?,"+INFORM_ROADCol+"=?,"+INFORM_SOICol+"=?,"+INFORM_ADDRESS_NAMECol+"=?,"+INFORM_ADDRESSCol+"=?,"+INFORM_AGECol+"=?,"+INFORM_NAMECol+"=?,"+LAWBREAKER_NOCol+"=?,"+RECEIVE_DATECol+"=?,"+DUTY_CODECol+"=?,"+LEGISLATION_IDCol+"=?,"+OFFNAMECol+"=?,"+NOTICE_DATECol+"=?,"+NOTICE_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationNoticeArrest(DB db){
		super(db);
	}



public synchronized ApplicationNoticeArrest create() throws Exception{
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
					return (ApplicationNoticeArrest)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationNoticeArrest> createList(List<ApplicationNoticeArrest> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationNoticeArrest> resultList = new ArrayList<ApplicationNoticeArrest>();
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
	public ApplicationNoticeArrest findByPk(Long id)throws Exception{
		List<ApplicationNoticeArrest> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationNoticeArrest> findByPks(List<Long> ids)throws Exception{
		List<ApplicationNoticeArrest> resultList = new ArrayList<ApplicationNoticeArrest>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationNoticeArrest> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationNoticeArrest> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationNoticeArrest> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationNoticeArrest> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationNoticeArrest> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationNoticeArrest> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationNoticeArrest> resultList = new ArrayList<ApplicationNoticeArrest>();
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
	public List<ApplicationNoticeArrest> findByExample(ApplicationNoticeArrest instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationNoticeArrest> findByExample(ApplicationNoticeArrest instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationNoticeArrest update()throws Exception{
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
					return (ApplicationNoticeArrest)this;
			}else// not update
				return (ApplicationNoticeArrest)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationNoticeArrest> updateList(List<ApplicationNoticeArrest> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationNoticeArrest> resultList = new ArrayList<ApplicationNoticeArrest>();
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
	public Integer deleteList(List<ApplicationNoticeArrest> objList)throws Exception {
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
	public ApplicationNoticeArrest populate(ResultSet rs)throws Exception{
		ApplicationNoticeArrest result = new ApplicationNoticeArrest(this.db);
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
    private String inform_lean;
    
    private String law_bad_mst_id;
    
    private String lawbreaker_name;
    
    private String law_er_dept;
    
    private String law_er_pos;
    
    private String approve_dept;
    
    private String approve_pos;
    
    private String owner_dept;
    
    private String owner_pos;
    
    private String isfingerapprove;

    private String inform_type;

    private String del_flag;

    private String offcode;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String isreward_pay;

    private String ismanage;

    private String notice_result;

    private String remarks;

    private String next_step;

    private String offcode_commander;

    private String poscode_commander;

    private String staff_id_commander;

    private String staff_id_accept;

    private String offcode_surety;

    private String poscode_surety;

    private String staff_id_surety;

    private String offcode_receive;

    private String poscode_receive;

    private String staff_id_receive;

    private String hiding_place;

    private String vehicle_particular;

    private String lawbreaker_province_code;

    private String lawbreaker_district_code;

    private String lawbreaker_subdistrict_code;

    private String lawbreaker_moo;

    private String lawbreaker_road;

    private String lawbreaker_soi;

    private String lawbreaker_address_name;

    private String lawbreaker_address;

    private String secret_level;

    private String arrest_desc;

    private String inform_province_code;

    private String inform_district_code;

    private String inform_subdistrict_code;

    private String inform_moo;

    private String inform_road;

    private String inform_soi;

    private String inform_address_name;

    private String inform_address;

    private Long inform_age;

    private String inform_name;

    private Long lawbreaker_no;

    private java.util.Date receive_date;

    private String duty_code;

    private Long legislation_id;

    private String offname;

    private java.util.Date notice_date;

    private String notice_no;

    private Long id;

	//**** getter setter ****//
    public String getInform_lean(){
    	return inform_lean;
    }
    public void setInform_lean(String value){
    	inform_lean = value;
    }
    
    public String getOwner_pos(){
    	return owner_pos;
    }
    public void setOwner_pos(String value){
    	this.owner_pos = value;
    }
    
    public String getOwner_dept(){
    	return owner_dept;
    }
    public void setOwner_dept(String value){
    	this.owner_dept = value;
    }
    
    public String getApprove_pos(){
    	return approve_pos;
    }
    public void setApprove_pos(String value){
    	this.approve_pos = value;
    }
    
    public String getApprove_dept(){
    	return approve_dept;
    }
    public void setApprove_dept(String value){
    	this.approve_dept = value;
    }
    
    public String getLaw_er_pos(){
    	return law_er_pos;
    }
    public void setLaw_er_pos(String value){
    	this.law_er_pos = value;
    }
    
    public String getLaw_er_dept(){
    	return law_er_dept;
    }
    public void setLaw_er_dept(String value){
    	this.law_er_dept = value;
    }
    
    public String getLawbreaker_name(){
    	return lawbreaker_name;
    }
    public void setLawbreaker_name(String value){
    	this.lawbreaker_name = value;
    }
    
    public String getLaw_bad_mst_id(){
    	return law_bad_mst_id;
    }
    public void setLaw_bad_mst_id(String value){
    	this.law_bad_mst_id = value;
    }
    
	public String getIsfingerapprove()
    {
        return isfingerapprove;
    }
    public void setIsfingerapprove(String isfingerapprove)
    {
        this.isfingerapprove = isfingerapprove;
    }

	public String getInform_type()
    {
        return inform_type;
    }
    public void setInform_type(String inform_type)
    {
        this.inform_type = inform_type;
    }

	public String getDel_flag()
    {
        return del_flag;
    }
    public void setDel_flag(String del_flag)
    {
        this.del_flag = del_flag;
    }

	public String getOffcode()
    {
        return offcode;
    }
    public void setOffcode(String offcode)
    {
        this.offcode = offcode;
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

	public String getIsreward_pay()
    {
        return isreward_pay;
    }
    public void setIsreward_pay(String isreward_pay)
    {
        this.isreward_pay = isreward_pay;
    }

	public String getIsmanage()
    {
        return ismanage;
    }
    public void setIsmanage(String ismanage)
    {
        this.ismanage = ismanage;
    }

	public String getNotice_result()
    {
        return notice_result;
    }
    public void setNotice_result(String notice_result)
    {
        this.notice_result = notice_result;
    }

	public String getRemarks()
    {
        return remarks;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

	public String getNext_step()
    {
        return next_step;
    }
    public void setNext_step(String next_step)
    {
        this.next_step = next_step;
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

	public String getStaff_id_accept()
    {
        return staff_id_accept;
    }
    public void setStaff_id_accept(String staff_id_accept)
    {
        this.staff_id_accept = staff_id_accept;
    }

	public String getOffcode_surety()
    {
        return offcode_surety;
    }
    public void setOffcode_surety(String offcode_surety)
    {
        this.offcode_surety = offcode_surety;
    }

	public String getPoscode_surety()
    {
        return poscode_surety;
    }
    public void setPoscode_surety(String poscode_surety)
    {
        this.poscode_surety = poscode_surety;
    }

	public String getStaff_id_surety()
    {
        return staff_id_surety;
    }
    public void setStaff_id_surety(String staff_id_surety)
    {
        this.staff_id_surety = staff_id_surety;
    }

	public String getOffcode_receive()
    {
        return offcode_receive;
    }
    public void setOffcode_receive(String offcode_receive)
    {
        this.offcode_receive = offcode_receive;
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

	public String getHiding_place()
    {
        return hiding_place;
    }
    public void setHiding_place(String hiding_place)
    {
        this.hiding_place = hiding_place;
    }

	public String getVehicle_particular()
    {
        return vehicle_particular;
    }
    public void setVehicle_particular(String vehicle_particular)
    {
        this.vehicle_particular = vehicle_particular;
    }

	public String getLawbreaker_province_code()
    {
        return lawbreaker_province_code;
    }
    public void setLawbreaker_province_code(String lawbreaker_province_code)
    {
        this.lawbreaker_province_code = lawbreaker_province_code;
    }

	public String getLawbreaker_district_code()
    {
        return lawbreaker_district_code;
    }
    public void setLawbreaker_district_code(String lawbreaker_district_code)
    {
        this.lawbreaker_district_code = lawbreaker_district_code;
    }

	public String getLawbreaker_subdistrict_code()
    {
        return lawbreaker_subdistrict_code;
    }
    public void setLawbreaker_subdistrict_code(String lawbreaker_subdistrict_code)
    {
        this.lawbreaker_subdistrict_code = lawbreaker_subdistrict_code;
    }

	public String getLawbreaker_moo()
    {
        return lawbreaker_moo;
    }
    public void setLawbreaker_moo(String lawbreaker_moo)
    {
        this.lawbreaker_moo = lawbreaker_moo;
    }

	public String getLawbreaker_road()
    {
        return lawbreaker_road;
    }
    public void setLawbreaker_road(String lawbreaker_road)
    {
        this.lawbreaker_road = lawbreaker_road;
    }

	public String getLawbreaker_soi()
    {
        return lawbreaker_soi;
    }
    public void setLawbreaker_soi(String lawbreaker_soi)
    {
        this.lawbreaker_soi = lawbreaker_soi;
    }

	public String getLawbreaker_address_name()
    {
        return lawbreaker_address_name;
    }
    public void setLawbreaker_address_name(String lawbreaker_address_name)
    {
        this.lawbreaker_address_name = lawbreaker_address_name;
    }

	public String getLawbreaker_address()
    {
        return lawbreaker_address;
    }
    public void setLawbreaker_address(String lawbreaker_address)
    {
        this.lawbreaker_address = lawbreaker_address;
    }

	public String getSecret_level()
    {
        return secret_level;
    }
    public void setSecret_level(String secret_level)
    {
        this.secret_level = secret_level;
    }

	public String getArrest_desc()
    {
        return arrest_desc;
    }
    public void setArrest_desc(String arrest_desc)
    {
        this.arrest_desc = arrest_desc;
    }

	public String getInform_province_code()
    {
        return inform_province_code;
    }
    public void setInform_province_code(String inform_province_code)
    {
        this.inform_province_code = inform_province_code;
    }

	public String getInform_district_code()
    {
        return inform_district_code;
    }
    public void setInform_district_code(String inform_district_code)
    {
        this.inform_district_code = inform_district_code;
    }

	public String getInform_subdistrict_code()
    {
        return inform_subdistrict_code;
    }
    public void setInform_subdistrict_code(String inform_subdistrict_code)
    {
        this.inform_subdistrict_code = inform_subdistrict_code;
    }

	public String getInform_moo()
    {
        return inform_moo;
    }
    public void setInform_moo(String inform_moo)
    {
        this.inform_moo = inform_moo;
    }

	public String getInform_road()
    {
        return inform_road;
    }
    public void setInform_road(String inform_road)
    {
        this.inform_road = inform_road;
    }

	public String getInform_soi()
    {
        return inform_soi;
    }
    public void setInform_soi(String inform_soi)
    {
        this.inform_soi = inform_soi;
    }

	public String getInform_address_name()
    {
        return inform_address_name;
    }
    public void setInform_address_name(String inform_address_name)
    {
        this.inform_address_name = inform_address_name;
    }

	public String getInform_address()
    {
        return inform_address;
    }
    public void setInform_address(String inform_address)
    {
        this.inform_address = inform_address;
    }

	public Long getInform_age()
    {
        return inform_age;
    }
    public void setInform_age(Long inform_age)
    {
        this.inform_age = inform_age;
    }

	public String getInform_name()
    {
        return inform_name;
    }
    public void setInform_name(String inform_name)
    {
        this.inform_name = inform_name;
    }

	public Long getLawbreaker_no()
    {
        return lawbreaker_no;
    }
    public void setLawbreaker_no(Long lawbreaker_no)
    {
        this.lawbreaker_no = lawbreaker_no;
    }

	public java.util.Date getReceive_date()
    {
        return receive_date;
    }
    public void setReceive_date(java.util.Date receive_date)
    {
        this.receive_date = receive_date;
    }

	public String getDuty_code()
    {
        return duty_code;
    }
    public void setDuty_code(String duty_code)
    {
        this.duty_code = duty_code;
    }

	public Long getLegislation_id()
    {
        return legislation_id;
    }
    public void setLegislation_id(Long legislation_id)
    {
        this.legislation_id = legislation_id;
    }

	public String getOffname()
    {
        return offname;
    }
    public void setOffname(String offname)
    {
        this.offname = offname;
    }

	public java.util.Date getNotice_date()
    {
        return notice_date;
    }
    public void setNotice_date(java.util.Date notice_date)
    {
        this.notice_date = notice_date;
    }

	public String getNotice_no()
    {
        return notice_no;
    }
    public void setNotice_no(String notice_no)
    {
        this.notice_no = notice_no;
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