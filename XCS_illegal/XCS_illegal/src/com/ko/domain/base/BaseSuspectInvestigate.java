








 

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

import com.ko.domain.SuspectInvestigate;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseSuspectInvestigate extends BaseDomain{
	// table
	public static final String TABLE_NAME = "SUSPECT_INVESTIGATE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "SUSPECT_INVESTIGATE.ID";

	// short name column
	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String DELETE_FLAGCol = "DELETE_FLAG";

	public static final String INVESTIGATE_PRESENTCol = "INVESTIGATE_PRESENT";

	public static final String REMARKSCol = "REMARKS";

	public static final String INVESTIGATE_DETAILCol = "INVESTIGATE_DETAIL";

	public static final String SUSPECT_BEHAVIORCol = "SUSPECT_BEHAVIOR";

	public static final String SUSPECT_MAP_MIMETYPECol = "SUSPECT_MAP_MIMETYPE";

	public static final String SUSPECT_MAP_DESCCol = "SUSPECT_MAP_DESC";

	public static final String SUSPECT_MAPCol = "SUSPECT_MAP";

	public static final String SUSPECT_COORDINATE_YCol = "SUSPECT_COORDINATE_Y";

	public static final String SUSPECT_COORDINATE_XCol = "SUSPECT_COORDINATE_X";

	public static final String SUSPECT_TELCol = "SUSPECT_TEL";

	public static final String SUSPECT_ZIPCODECol = "SUSPECT_ZIPCODE";

	public static final String SUSPECT_PROVINCE_CODECol = "SUSPECT_PROVINCE_CODE";

	public static final String SUSPECT_DISTRICT_CODECol = "SUSPECT_DISTRICT_CODE";

	public static final String SUSPECT_SUBDISTRICT_CODECol = "SUSPECT_SUBDISTRICT_CODE";

	public static final String SUSPECT_MOOCol = "SUSPECT_MOO";

	public static final String SUSPECT_ROADCol = "SUSPECT_ROAD";

	public static final String SUSPECT_SOICol = "SUSPECT_SOI";

	public static final String SUSPECT_ADDRESS_NOCol = "SUSPECT_ADDRESS_NO";

	public static final String SUSPECT_ADDRESS_NAMECol = "SUSPECT_ADDRESS_NAME";

	public static final String CURRENT_COORDINATE_YCol = "CURRENT_COORDINATE_Y";

	public static final String CURRENT_COORDINATE_XCol = "CURRENT_COORDINATE_X";

	public static final String CURRENT_TELCol = "CURRENT_TEL";

	public static final String CURRENT_ZIPCODECol = "CURRENT_ZIPCODE";

	public static final String CURRENT_PROVINCE_CODECol = "CURRENT_PROVINCE_CODE";

	public static final String CURRENT_DISTRICT_CODECol = "CURRENT_DISTRICT_CODE";

	public static final String CURRENT_SUBDISTRICT_CODECol = "CURRENT_SUBDISTRICT_CODE";

	public static final String CURRENT_ROADCol = "CURRENT_ROAD";

	public static final String CURRENT_SOICol = "CURRENT_SOI";

	public static final String CURRENT_MOOCol = "CURRENT_MOO";

	public static final String CURRENT_ADDRESS_NOCol = "CURRENT_ADDRESS_NO";

	public static final String CURRENT_ADDRESS_NAMECol = "CURRENT_ADDRESS_NAME";

	public static final String CASE_TYPECol = "CASE_TYPE";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String POSCODE_INFOCol = "POSCODE_INFO";

	public static final String POSCODE_REPORT_TOCol = "POSCODE_REPORT_TO";

	public static final String POSCODE_ORDER_SAVECol = "POSCODE_ORDER_SAVE";

	public static final String POSCODE_COMMANDCol = "POSCODE_COMMAND";

	public static final String POSCODE_INVESTIGATECol = "POSCODE_INVESTIGATE";

	public static final String STAFF_INFO_MOBILECol = "STAFF_INFO_MOBILE";

	public static final String STAFF_INFOCol = "STAFF_INFO";

	public static final String STAFF_REPORT_TOCol = "STAFF_REPORT_TO";

	public static final String STAFF_ORDER_SAVECol = "STAFF_ORDER_SAVE";

	public static final String STAFF_COMMANDCol = "STAFF_COMMAND";

	public static final String END_DATECol = "END_DATE";

	public static final String START_DATECol = "START_DATE";

	public static final String STAFF_INVESTIGATECol = "STAFF_INVESTIGATE";

	public static final String OFFCODECol = "OFFCODE";

	public static final String DOC_DATECol = "DOC_DATE";

	public static final String INVESTIGATE_NOCol = "INVESTIGATE_NO";

	public static final String SUSPECT_NOCol = "SUSPECT_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String TRACK_NOColumn = "SUSPECT_INVESTIGATE.TRACK_NO";

	public static final String UPDATE_ONColumn = "SUSPECT_INVESTIGATE.UPDATE_ON";

	public static final String UPDATE_BYColumn = "SUSPECT_INVESTIGATE.UPDATE_BY";

	public static final String CREATE_ONColumn = "SUSPECT_INVESTIGATE.CREATE_ON";

	public static final String CREATE_BYColumn = "SUSPECT_INVESTIGATE.CREATE_BY";

	public static final String DELETE_FLAGColumn = "SUSPECT_INVESTIGATE.DELETE_FLAG";

	public static final String INVESTIGATE_PRESENTColumn = "SUSPECT_INVESTIGATE.INVESTIGATE_PRESENT";

	public static final String REMARKSColumn = "SUSPECT_INVESTIGATE.REMARKS";

	public static final String INVESTIGATE_DETAILColumn = "SUSPECT_INVESTIGATE.INVESTIGATE_DETAIL";

	public static final String SUSPECT_BEHAVIORColumn = "SUSPECT_INVESTIGATE.SUSPECT_BEHAVIOR";

	public static final String SUSPECT_MAP_MIMETYPEColumn = "SUSPECT_INVESTIGATE.SUSPECT_MAP_MIMETYPE";

	public static final String SUSPECT_MAP_DESCColumn = "SUSPECT_INVESTIGATE.SUSPECT_MAP_DESC";

	public static final String SUSPECT_MAPColumn = "SUSPECT_INVESTIGATE.SUSPECT_MAP";

	public static final String SUSPECT_COORDINATE_YColumn = "SUSPECT_INVESTIGATE.SUSPECT_COORDINATE_Y";

	public static final String SUSPECT_COORDINATE_XColumn = "SUSPECT_INVESTIGATE.SUSPECT_COORDINATE_X";

	public static final String SUSPECT_TELColumn = "SUSPECT_INVESTIGATE.SUSPECT_TEL";

	public static final String SUSPECT_ZIPCODEColumn = "SUSPECT_INVESTIGATE.SUSPECT_ZIPCODE";

	public static final String SUSPECT_PROVINCE_CODEColumn = "SUSPECT_INVESTIGATE.SUSPECT_PROVINCE_CODE";

	public static final String SUSPECT_DISTRICT_CODEColumn = "SUSPECT_INVESTIGATE.SUSPECT_DISTRICT_CODE";

	public static final String SUSPECT_SUBDISTRICT_CODEColumn = "SUSPECT_INVESTIGATE.SUSPECT_SUBDISTRICT_CODE";

	public static final String SUSPECT_MOOColumn = "SUSPECT_INVESTIGATE.SUSPECT_MOO";

	public static final String SUSPECT_ROADColumn = "SUSPECT_INVESTIGATE.SUSPECT_ROAD";

	public static final String SUSPECT_SOIColumn = "SUSPECT_INVESTIGATE.SUSPECT_SOI";

	public static final String SUSPECT_ADDRESS_NOColumn = "SUSPECT_INVESTIGATE.SUSPECT_ADDRESS_NO";

	public static final String SUSPECT_ADDRESS_NAMEColumn = "SUSPECT_INVESTIGATE.SUSPECT_ADDRESS_NAME";

	public static final String CURRENT_COORDINATE_YColumn = "SUSPECT_INVESTIGATE.CURRENT_COORDINATE_Y";

	public static final String CURRENT_COORDINATE_XColumn = "SUSPECT_INVESTIGATE.CURRENT_COORDINATE_X";

	public static final String CURRENT_TELColumn = "SUSPECT_INVESTIGATE.CURRENT_TEL";

	public static final String CURRENT_ZIPCODEColumn = "SUSPECT_INVESTIGATE.CURRENT_ZIPCODE";

	public static final String CURRENT_PROVINCE_CODEColumn = "SUSPECT_INVESTIGATE.CURRENT_PROVINCE_CODE";

	public static final String CURRENT_DISTRICT_CODEColumn = "SUSPECT_INVESTIGATE.CURRENT_DISTRICT_CODE";

	public static final String CURRENT_SUBDISTRICT_CODEColumn = "SUSPECT_INVESTIGATE.CURRENT_SUBDISTRICT_CODE";

	public static final String CURRENT_ROADColumn = "SUSPECT_INVESTIGATE.CURRENT_ROAD";

	public static final String CURRENT_SOIColumn = "SUSPECT_INVESTIGATE.CURRENT_SOI";

	public static final String CURRENT_MOOColumn = "SUSPECT_INVESTIGATE.CURRENT_MOO";

	public static final String CURRENT_ADDRESS_NOColumn = "SUSPECT_INVESTIGATE.CURRENT_ADDRESS_NO";

	public static final String CURRENT_ADDRESS_NAMEColumn = "SUSPECT_INVESTIGATE.CURRENT_ADDRESS_NAME";

	public static final String CASE_TYPEColumn = "SUSPECT_INVESTIGATE.CASE_TYPE";

	public static final String LEGISLATION_IDColumn = "SUSPECT_INVESTIGATE.LEGISLATION_ID";

	public static final String POSCODE_INFOColumn = "SUSPECT_INVESTIGATE.POSCODE_INFO";

	public static final String POSCODE_REPORT_TOColumn = "SUSPECT_INVESTIGATE.POSCODE_REPORT_TO";

	public static final String POSCODE_ORDER_SAVEColumn = "SUSPECT_INVESTIGATE.POSCODE_ORDER_SAVE";

	public static final String POSCODE_COMMANDColumn = "SUSPECT_INVESTIGATE.POSCODE_COMMAND";

	public static final String POSCODE_INVESTIGATEColumn = "SUSPECT_INVESTIGATE.POSCODE_INVESTIGATE";

	public static final String STAFF_INFO_MOBILEColumn = "SUSPECT_INVESTIGATE.STAFF_INFO_MOBILE";

	public static final String STAFF_INFOColumn = "SUSPECT_INVESTIGATE.STAFF_INFO";

	public static final String STAFF_REPORT_TOColumn = "SUSPECT_INVESTIGATE.STAFF_REPORT_TO";

	public static final String STAFF_ORDER_SAVEColumn = "SUSPECT_INVESTIGATE.STAFF_ORDER_SAVE";

	public static final String STAFF_COMMANDColumn = "SUSPECT_INVESTIGATE.STAFF_COMMAND";

	public static final String END_DATEColumn = "SUSPECT_INVESTIGATE.END_DATE";

	public static final String START_DATEColumn = "SUSPECT_INVESTIGATE.START_DATE";

	public static final String STAFF_INVESTIGATEColumn = "SUSPECT_INVESTIGATE.STAFF_INVESTIGATE";

	public static final String OFFCODEColumn = "SUSPECT_INVESTIGATE.OFFCODE";

	public static final String DOC_DATEColumn = "SUSPECT_INVESTIGATE.DOC_DATE";

	public static final String INVESTIGATE_NOColumn = "SUSPECT_INVESTIGATE.INVESTIGATE_NO";

	public static final String SUSPECT_NOColumn = "SUSPECT_INVESTIGATE.SUSPECT_NO";

	public static final String IDColumn = "SUSPECT_INVESTIGATE.ID";


	public static final String[] ALL_COLUMNS =
    {
	 TRACK_NOCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, DELETE_FLAGCol	, INVESTIGATE_PRESENTCol	, REMARKSCol	, INVESTIGATE_DETAILCol	, SUSPECT_BEHAVIORCol	, SUSPECT_MAP_MIMETYPECol	, SUSPECT_MAP_DESCCol	, SUSPECT_MAPCol	, SUSPECT_COORDINATE_YCol	, SUSPECT_COORDINATE_XCol	, SUSPECT_TELCol	, SUSPECT_ZIPCODECol	, SUSPECT_PROVINCE_CODECol	, SUSPECT_DISTRICT_CODECol	, SUSPECT_SUBDISTRICT_CODECol	, SUSPECT_MOOCol	, SUSPECT_ROADCol	, SUSPECT_SOICol	, SUSPECT_ADDRESS_NOCol	, SUSPECT_ADDRESS_NAMECol	, CURRENT_COORDINATE_YCol	, CURRENT_COORDINATE_XCol	, CURRENT_TELCol	, CURRENT_ZIPCODECol	, CURRENT_PROVINCE_CODECol	, CURRENT_DISTRICT_CODECol	, CURRENT_SUBDISTRICT_CODECol	, CURRENT_ROADCol	, CURRENT_SOICol	, CURRENT_MOOCol	, CURRENT_ADDRESS_NOCol	, CURRENT_ADDRESS_NAMECol	, CASE_TYPECol	, LEGISLATION_IDCol	, POSCODE_INFOCol	, POSCODE_REPORT_TOCol	, POSCODE_ORDER_SAVECol	, POSCODE_COMMANDCol	, POSCODE_INVESTIGATECol	, STAFF_INFO_MOBILECol	, STAFF_INFOCol	, STAFF_REPORT_TOCol	, STAFF_ORDER_SAVECol	, STAFF_COMMANDCol	, END_DATECol	, START_DATECol	, STAFF_INVESTIGATECol	, OFFCODECol	, DOC_DATECol	, INVESTIGATE_NOCol	, SUSPECT_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  TRACK_NOCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ DELETE_FLAGCol	+","+ INVESTIGATE_PRESENTCol	+","+ REMARKSCol	+","+ INVESTIGATE_DETAILCol	+","+ SUSPECT_BEHAVIORCol	+","+ SUSPECT_MAP_MIMETYPECol	+","+ SUSPECT_MAP_DESCCol	+","+ SUSPECT_MAPCol	+","+ SUSPECT_COORDINATE_YCol	+","+ SUSPECT_COORDINATE_XCol	+","+ SUSPECT_TELCol	+","+ SUSPECT_ZIPCODECol	+","+ SUSPECT_PROVINCE_CODECol	+","+ SUSPECT_DISTRICT_CODECol	+","+ SUSPECT_SUBDISTRICT_CODECol	+","+ SUSPECT_MOOCol	+","+ SUSPECT_ROADCol	+","+ SUSPECT_SOICol	+","+ SUSPECT_ADDRESS_NOCol	+","+ SUSPECT_ADDRESS_NAMECol	+","+ CURRENT_COORDINATE_YCol	+","+ CURRENT_COORDINATE_XCol	+","+ CURRENT_TELCol	+","+ CURRENT_ZIPCODECol	+","+ CURRENT_PROVINCE_CODECol	+","+ CURRENT_DISTRICT_CODECol	+","+ CURRENT_SUBDISTRICT_CODECol	+","+ CURRENT_ROADCol	+","+ CURRENT_SOICol	+","+ CURRENT_MOOCol	+","+ CURRENT_ADDRESS_NOCol	+","+ CURRENT_ADDRESS_NAMECol	+","+ CASE_TYPECol	+","+ LEGISLATION_IDCol	+","+ POSCODE_INFOCol	+","+ POSCODE_REPORT_TOCol	+","+ POSCODE_ORDER_SAVECol	+","+ POSCODE_COMMANDCol	+","+ POSCODE_INVESTIGATECol	+","+ STAFF_INFO_MOBILECol	+","+ STAFF_INFOCol	+","+ STAFF_REPORT_TOCol	+","+ STAFF_ORDER_SAVECol	+","+ STAFF_COMMANDCol	+","+ END_DATECol	+","+ START_DATECol	+","+ STAFF_INVESTIGATECol	+","+ OFFCODECol	+","+ DOC_DATECol	+","+ INVESTIGATE_NOCol	+","+ SUSPECT_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+TRACK_NOCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+DELETE_FLAGCol+"=?,"+INVESTIGATE_PRESENTCol+"=?,"+REMARKSCol+"=?,"+INVESTIGATE_DETAILCol+"=?,"+SUSPECT_BEHAVIORCol+"=?,"+SUSPECT_MAP_MIMETYPECol+"=?,"+SUSPECT_MAP_DESCCol+"=?,"+SUSPECT_MAPCol+"=?,"+SUSPECT_COORDINATE_YCol+"=?,"+SUSPECT_COORDINATE_XCol+"=?,"+SUSPECT_TELCol+"=?,"+SUSPECT_ZIPCODECol+"=?,"+SUSPECT_PROVINCE_CODECol+"=?,"+SUSPECT_DISTRICT_CODECol+"=?,"+SUSPECT_SUBDISTRICT_CODECol+"=?,"+SUSPECT_MOOCol+"=?,"+SUSPECT_ROADCol+"=?,"+SUSPECT_SOICol+"=?,"+SUSPECT_ADDRESS_NOCol+"=?,"+SUSPECT_ADDRESS_NAMECol+"=?,"+CURRENT_COORDINATE_YCol+"=?,"+CURRENT_COORDINATE_XCol+"=?,"+CURRENT_TELCol+"=?,"+CURRENT_ZIPCODECol+"=?,"+CURRENT_PROVINCE_CODECol+"=?,"+CURRENT_DISTRICT_CODECol+"=?,"+CURRENT_SUBDISTRICT_CODECol+"=?,"+CURRENT_ROADCol+"=?,"+CURRENT_SOICol+"=?,"+CURRENT_MOOCol+"=?,"+CURRENT_ADDRESS_NOCol+"=?,"+CURRENT_ADDRESS_NAMECol+"=?,"+CASE_TYPECol+"=?,"+LEGISLATION_IDCol+"=?,"+POSCODE_INFOCol+"=?,"+POSCODE_REPORT_TOCol+"=?,"+POSCODE_ORDER_SAVECol+"=?,"+POSCODE_COMMANDCol+"=?,"+POSCODE_INVESTIGATECol+"=?,"+STAFF_INFO_MOBILECol+"=?,"+STAFF_INFOCol+"=?,"+STAFF_REPORT_TOCol+"=?,"+STAFF_ORDER_SAVECol+"=?,"+STAFF_COMMANDCol+"=?,"+END_DATECol+"=?,"+START_DATECol+"=?,"+STAFF_INVESTIGATECol+"=?,"+OFFCODECol+"=?,"+DOC_DATECol+"=?,"+INVESTIGATE_NOCol+"=?,"+SUSPECT_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseSuspectInvestigate(DB db){
		super(db);
	}



public synchronized SuspectInvestigate create() throws Exception{
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
					return (SuspectInvestigate)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SuspectInvestigate> createList(List<SuspectInvestigate> objList)throws Exception{
    	DB db = this.initDB();
    	List<SuspectInvestigate> resultList = new ArrayList<SuspectInvestigate>();
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
	public SuspectInvestigate findByPk(Long id)throws Exception{
		List<SuspectInvestigate> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<SuspectInvestigate> findByPks(List<Long> ids)throws Exception{
		List<SuspectInvestigate> resultList = new ArrayList<SuspectInvestigate>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<SuspectInvestigate> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<SuspectInvestigate> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<SuspectInvestigate> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<SuspectInvestigate> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<SuspectInvestigate> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<SuspectInvestigate> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<SuspectInvestigate> resultList = new ArrayList<SuspectInvestigate>();
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
	public List<SuspectInvestigate> findByExample(SuspectInvestigate instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<SuspectInvestigate> findByExample(SuspectInvestigate instance,PageUtil pageUtil) throws Exception{
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
	public SuspectInvestigate update()throws Exception{
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
					return (SuspectInvestigate)this;
			}else// not update
				return (SuspectInvestigate)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SuspectInvestigate> updateList(List<SuspectInvestigate> objList)throws Exception{
		DB db = this.initDB();
		List<SuspectInvestigate> resultList = new ArrayList<SuspectInvestigate>();
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
	public Integer deleteList(List<SuspectInvestigate> objList)throws Exception {
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
	public SuspectInvestigate populate(ResultSet rs)throws Exception{
		SuspectInvestigate result = new SuspectInvestigate(this.db);
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
    private String track_no;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private Long delete_flag;

    private String investigate_present;

    private String remarks;

    private String investigate_detail;

    private String suspect_behavior;

    private String suspect_map_mimetype;

    private String suspect_map_desc;

    private java.sql.Blob suspect_map;

    private Double suspect_coordinate_y;

    private Double suspect_coordinate_x;

    private String suspect_tel;

    private String suspect_zipcode;

    private String suspect_province_code;

    private String suspect_district_code;

    private String suspect_subdistrict_code;

    private Long suspect_moo;

    private String suspect_road;

    private String suspect_soi;

    private String suspect_address_no;

    private String suspect_address_name;

    private Double current_coordinate_y;

    private Double current_coordinate_x;

    private String current_tel;

    private String current_zipcode;

    private String current_province_code;

    private String current_district_code;

    private String current_subdistrict_code;

    private String current_road;

    private String current_soi;

    private Long current_moo;

    private String current_address_no;

    private String current_address_name;

    private String case_type;

    private Long legislation_id;

    private String poscode_info;

    private String poscode_report_to;

    private String poscode_order_save;

    private String poscode_command;

    private String poscode_investigate;

    private String staff_info_mobile;

    private String staff_info;

    private String staff_report_to;

    private String staff_order_save;

    private String staff_command;

    private java.util.Date end_date;

    private java.util.Date start_date;

    private String staff_investigate;

    private String offcode;

    private java.util.Date doc_date;

    private String investigate_no;

    private Long suspect_no;

    private Long id;

	//**** getter setter ****//
	public String getTrack_no()
    {
        return track_no;
    }
    public void setTrack_no(String track_no)
    {
        this.track_no = track_no;
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

	public Long getDelete_flag()
    {
        return delete_flag;
    }
    public void setDelete_flag(Long delete_flag)
    {
        this.delete_flag = delete_flag;
    }

	public String getInvestigate_present()
    {
        return investigate_present;
    }
    public void setInvestigate_present(String investigate_present)
    {
        this.investigate_present = investigate_present;
    }

	public String getRemarks()
    {
        return remarks;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

	public String getInvestigate_detail()
    {
        return investigate_detail;
    }
    public void setInvestigate_detail(String investigate_detail)
    {
        this.investigate_detail = investigate_detail;
    }

	public String getSuspect_behavior()
    {
        return suspect_behavior;
    }
    public void setSuspect_behavior(String suspect_behavior)
    {
        this.suspect_behavior = suspect_behavior;
    }

	public String getSuspect_map_mimetype()
    {
        return suspect_map_mimetype;
    }
    public void setSuspect_map_mimetype(String suspect_map_mimetype)
    {
        this.suspect_map_mimetype = suspect_map_mimetype;
    }

	public String getSuspect_map_desc()
    {
        return suspect_map_desc;
    }
    public void setSuspect_map_desc(String suspect_map_desc)
    {
        this.suspect_map_desc = suspect_map_desc;
    }

	public java.sql.Blob getSuspect_map()
    {
        return suspect_map;
    }
    public void setSuspect_map(java.sql.Blob suspect_map)
    {
        this.suspect_map = suspect_map;
    }

	public Double getSuspect_coordinate_y()
    {
        return suspect_coordinate_y;
    }
    public void setSuspect_coordinate_y(Double suspect_coordinate_y)
    {
        this.suspect_coordinate_y = suspect_coordinate_y;
    }

	public Double getSuspect_coordinate_x()
    {
        return suspect_coordinate_x;
    }
    public void setSuspect_coordinate_x(Double suspect_coordinate_x)
    {
        this.suspect_coordinate_x = suspect_coordinate_x;
    }

	public String getSuspect_tel()
    {
        return suspect_tel;
    }
    public void setSuspect_tel(String suspect_tel)
    {
        this.suspect_tel = suspect_tel;
    }

	public String getSuspect_zipcode()
    {
        return suspect_zipcode;
    }
    public void setSuspect_zipcode(String suspect_zipcode)
    {
        this.suspect_zipcode = suspect_zipcode;
    }

	public String getSuspect_province_code()
    {
        return suspect_province_code;
    }
    public void setSuspect_province_code(String suspect_province_code)
    {
        this.suspect_province_code = suspect_province_code;
    }

	public String getSuspect_district_code()
    {
        return suspect_district_code;
    }
    public void setSuspect_district_code(String suspect_district_code)
    {
        this.suspect_district_code = suspect_district_code;
    }

	public String getSuspect_subdistrict_code()
    {
        return suspect_subdistrict_code;
    }
    public void setSuspect_subdistrict_code(String suspect_subdistrict_code)
    {
        this.suspect_subdistrict_code = suspect_subdistrict_code;
    }

	public Long getSuspect_moo()
    {
        return suspect_moo;
    }
    public void setSuspect_moo(Long suspect_moo)
    {
        this.suspect_moo = suspect_moo;
    }

	public String getSuspect_road()
    {
        return suspect_road;
    }
    public void setSuspect_road(String suspect_road)
    {
        this.suspect_road = suspect_road;
    }

	public String getSuspect_soi()
    {
        return suspect_soi;
    }
    public void setSuspect_soi(String suspect_soi)
    {
        this.suspect_soi = suspect_soi;
    }

	public String getSuspect_address_no()
    {
        return suspect_address_no;
    }
    public void setSuspect_address_no(String suspect_address_no)
    {
        this.suspect_address_no = suspect_address_no;
    }

	public String getSuspect_address_name()
    {
        return suspect_address_name;
    }
    public void setSuspect_address_name(String suspect_address_name)
    {
        this.suspect_address_name = suspect_address_name;
    }

	public Double getCurrent_coordinate_y()
    {
        return current_coordinate_y;
    }
    public void setCurrent_coordinate_y(Double current_coordinate_y)
    {
        this.current_coordinate_y = current_coordinate_y;
    }

	public Double getCurrent_coordinate_x()
    {
        return current_coordinate_x;
    }
    public void setCurrent_coordinate_x(Double current_coordinate_x)
    {
        this.current_coordinate_x = current_coordinate_x;
    }

	public String getCurrent_tel()
    {
        return current_tel;
    }
    public void setCurrent_tel(String current_tel)
    {
        this.current_tel = current_tel;
    }

	public String getCurrent_zipcode()
    {
        return current_zipcode;
    }
    public void setCurrent_zipcode(String current_zipcode)
    {
        this.current_zipcode = current_zipcode;
    }

	public String getCurrent_province_code()
    {
        return current_province_code;
    }
    public void setCurrent_province_code(String current_province_code)
    {
        this.current_province_code = current_province_code;
    }

	public String getCurrent_district_code()
    {
        return current_district_code;
    }
    public void setCurrent_district_code(String current_district_code)
    {
        this.current_district_code = current_district_code;
    }

	public String getCurrent_subdistrict_code()
    {
        return current_subdistrict_code;
    }
    public void setCurrent_subdistrict_code(String current_subdistrict_code)
    {
        this.current_subdistrict_code = current_subdistrict_code;
    }

	public String getCurrent_road()
    {
        return current_road;
    }
    public void setCurrent_road(String current_road)
    {
        this.current_road = current_road;
    }

	public String getCurrent_soi()
    {
        return current_soi;
    }
    public void setCurrent_soi(String current_soi)
    {
        this.current_soi = current_soi;
    }

	public Long getCurrent_moo()
    {
        return current_moo;
    }
    public void setCurrent_moo(Long current_moo)
    {
        this.current_moo = current_moo;
    }

	public String getCurrent_address_no()
    {
        return current_address_no;
    }
    public void setCurrent_address_no(String current_address_no)
    {
        this.current_address_no = current_address_no;
    }

	public String getCurrent_address_name()
    {
        return current_address_name;
    }
    public void setCurrent_address_name(String current_address_name)
    {
        this.current_address_name = current_address_name;
    }

	public String getCase_type()
    {
        return case_type;
    }
    public void setCase_type(String case_type)
    {
        this.case_type = case_type;
    }

	public Long getLegislation_id()
    {
        return legislation_id;
    }
    public void setLegislation_id(Long legislation_id)
    {
        this.legislation_id = legislation_id;
    }

	public String getPoscode_info()
    {
        return poscode_info;
    }
    public void setPoscode_info(String poscode_info)
    {
        this.poscode_info = poscode_info;
    }

	public String getPoscode_report_to()
    {
        return poscode_report_to;
    }
    public void setPoscode_report_to(String poscode_report_to)
    {
        this.poscode_report_to = poscode_report_to;
    }

	public String getPoscode_order_save()
    {
        return poscode_order_save;
    }
    public void setPoscode_order_save(String poscode_order_save)
    {
        this.poscode_order_save = poscode_order_save;
    }

	public String getPoscode_command()
    {
        return poscode_command;
    }
    public void setPoscode_command(String poscode_command)
    {
        this.poscode_command = poscode_command;
    }

	public String getPoscode_investigate()
    {
        return poscode_investigate;
    }
    public void setPoscode_investigate(String poscode_investigate)
    {
        this.poscode_investigate = poscode_investigate;
    }

	public String getStaff_info_mobile()
    {
        return staff_info_mobile;
    }
    public void setStaff_info_mobile(String staff_info_mobile)
    {
        this.staff_info_mobile = staff_info_mobile;
    }

	public String getStaff_info()
    {
        return staff_info;
    }
    public void setStaff_info(String staff_info)
    {
        this.staff_info = staff_info;
    }

	public String getStaff_report_to()
    {
        return staff_report_to;
    }
    public void setStaff_report_to(String staff_report_to)
    {
        this.staff_report_to = staff_report_to;
    }

	public String getStaff_order_save()
    {
        return staff_order_save;
    }
    public void setStaff_order_save(String staff_order_save)
    {
        this.staff_order_save = staff_order_save;
    }

	public String getStaff_command()
    {
        return staff_command;
    }
    public void setStaff_command(String staff_command)
    {
        this.staff_command = staff_command;
    }

	public java.util.Date getEnd_date()
    {
        return end_date;
    }
    public void setEnd_date(java.util.Date end_date)
    {
        this.end_date = end_date;
    }

	public java.util.Date getStart_date()
    {
        return start_date;
    }
    public void setStart_date(java.util.Date start_date)
    {
        this.start_date = start_date;
    }

	public String getStaff_investigate()
    {
        return staff_investigate;
    }
    public void setStaff_investigate(String staff_investigate)
    {
        this.staff_investigate = staff_investigate;
    }

	public String getOffcode()
    {
        return offcode;
    }
    public void setOffcode(String offcode)
    {
        this.offcode = offcode;
    }

	public java.util.Date getDoc_date()
    {
        return doc_date;
    }
    public void setDoc_date(java.util.Date doc_date)
    {
        this.doc_date = doc_date;
    }

	public String getInvestigate_no()
    {
        return investigate_no;
    }
    public void setInvestigate_no(String investigate_no)
    {
        this.investigate_no = investigate_no;
    }

	public Long getSuspect_no()
    {
        return suspect_no;
    }
    public void setSuspect_no(Long suspect_no)
    {
        this.suspect_no = suspect_no;
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