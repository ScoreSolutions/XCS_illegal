








 

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

import com.ko.domain.ApplicationSearchWarrant;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationSearchWarrant extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_SEARCH_WARRANT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_SEARCH_WARRANT.ID";

	// short name column
	public static final String APPLICATION_NOTICE_ARREST_IDCol = "APPLICATION_NOTICE_ARREST_ID";

	public static final String RESULT_QTY_DATECol = "RESULT_QTY_DATE";

	public static final String COURT_ORDER_FAMILIARCol = "COURT_ORDER_FAMILIAR";

	public static final String OFFCODE_ASSIGNCol = "OFFCODE_ASSIGN";

	public static final String POSCODE_ASSIGNCol = "POSCODE_ASSIGN";

	public static final String STAFF_ID_ASSIGNCol = "STAFF_ID_ASSIGN";

	public static final String OFFCODE_REQ_FORCol = "OFFCODE_REQ_FOR";

	public static final String POSCODE_REQ_FORCol = "POSCODE_REQ_FOR";

	public static final String STAFF_ID_REQ_FORCol = "STAFF_ID_REQ_FOR";

	public static final String TEL_REQUESTCol = "TEL_REQUEST";

	public static final String CAREER_REQUESTCol = "CAREER_REQUEST";

	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String OFFICE_ADDRESSCol = "OFFICE_ADDRESS";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String SEARCH_RESULTCol = "SEARCH_RESULT";

	public static final String SEND_TO_DESCCol = "SEND_TO_DESC";

	public static final String SEND_DESCCol = "SEND_DESC";

	public static final String COURT_ID_ARRESTCol = "COURT_ID_ARREST";

	public static final String ARREST_DATECol = "ARREST_DATE";

	public static final String ARREST_NOCol = "ARREST_NO";

	public static final String SEARCH_CHECK2_2Col = "SEARCH_CHECK2_2";

	public static final String SEARCH_CHECK2_1Col = "SEARCH_CHECK2_1";

	public static final String SEARCH_CHECK2_DESCCol = "SEARCH_CHECK2_DESC";

	public static final String SEARCH_CHECK2Col = "SEARCH_CHECK2";

	public static final String SEARCH_CHECK1_3Col = "SEARCH_CHECK1_3";

	public static final String SEARCH_CHECK1_2Col = "SEARCH_CHECK1_2";

	public static final String SEARCH_CHECK1_1Col = "SEARCH_CHECK1_1";

	public static final String SEARCH_CHECK1_DESCCol = "SEARCH_CHECK1_DESC";

	public static final String SEARCH_CHECK1Col = "SEARCH_CHECK1";

	public static final String JEDGE_NAMECol = "JEDGE_NAME";

	public static final String WARRANT_DATECol = "WARRANT_DATE";

	public static final String WARRANT_NOCol = "WARRANT_NO";

	public static final String REMARKS_NONAPPROVECol = "REMARKS_NONAPPROVE";

	public static final String ISAPPROVECol = "ISAPPROVE";

	public static final String ISCOPYCol = "ISCOPY";

	public static final String ISALLOWCol = "ISALLOW";

	public static final String COURT_ORDERCol = "COURT_ORDER";

	public static final String WITNESS_QTYCol = "WITNESS_QTY";

	public static final String CONSIDER_DATECol = "CONSIDER_DATE";

	public static final String CAUSE_FAMILIARCol = "CAUSE_FAMILIAR";

	public static final String COURT_ID_FAMILIARCol = "COURT_ID_FAMILIAR";

	public static final String REQUEST_FAMILIARCol = "REQUEST_FAMILIAR";

	public static final String PROVINCE_CODECol = "PROVINCE_CODE";

	public static final String DISTRICT_CODECol = "DISTRICT_CODE";

	public static final String SUBDISTRICT_CODECol = "SUBDISTRICT_CODE";

	public static final String MOOCol = "MOO";

	public static final String SOICol = "SOI";

	public static final String ADDRESS_NAMECol = "ADDRESS_NAME";

	public static final String ADDRESS_NOCol = "ADDRESS_NO";

	public static final String ROADCol = "ROAD";

	public static final String OWNER_POSITIONCol = "OWNER_POSITION";

	public static final String OWNER_CAREERCol = "OWNER_CAREER";

	public static final String OWNER_AGECol = "OWNER_AGE";

	public static final String OWNER_NAMECol = "OWNER_NAME";

	public static final String REQ_CHECK5Col = "REQ_CHECK5";

	public static final String REQ_CHECK4Col = "REQ_CHECK4";

	public static final String REQ_CHECK3Col = "REQ_CHECK3";

	public static final String REQ_CHECK2Col = "REQ_CHECK2";

	public static final String REQ_CHECK1Col = "REQ_CHECK1";

	public static final String SEARCH_CAUSECol = "SEARCH_CAUSE";

	public static final String CHK_CONTINUECol = "CHK_CONTINUE";

	public static final String SEARCH_DATETOCol = "SEARCH_DATETO";

	public static final String SEARCH_DATEFROMCol = "SEARCH_DATEFROM";

	public static final String COURT_IDCol = "COURT_ID";

	public static final String AGE_REQUESTCol = "AGE_REQUEST";

	public static final String OFFCODE_REQUESTCol = "OFFCODE_REQUEST";

	public static final String POSCODE_REQUESTCol = "POSCODE_REQUEST";

	public static final String STAFF_ID_REQUESTCol = "STAFF_ID_REQUEST";

	public static final String REQUEST_DATECol = "REQUEST_DATE";

	public static final String REQUEST_NOCol = "REQUEST_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String APPLICATION_NOTICE_ARREST_IDColumn = "APPLICATION_SEARCH_WARRANT.APPLICATION_NOTICE_ARREST_ID";

	public static final String RESULT_QTY_DATEColumn = "APPLICATION_SEARCH_WARRANT.RESULT_QTY_DATE";

	public static final String COURT_ORDER_FAMILIARColumn = "APPLICATION_SEARCH_WARRANT.COURT_ORDER_FAMILIAR";

	public static final String OFFCODE_ASSIGNColumn = "APPLICATION_SEARCH_WARRANT.OFFCODE_ASSIGN";

	public static final String POSCODE_ASSIGNColumn = "APPLICATION_SEARCH_WARRANT.POSCODE_ASSIGN";

	public static final String STAFF_ID_ASSIGNColumn = "APPLICATION_SEARCH_WARRANT.STAFF_ID_ASSIGN";

	public static final String OFFCODE_REQ_FORColumn = "APPLICATION_SEARCH_WARRANT.OFFCODE_REQ_FOR";

	public static final String POSCODE_REQ_FORColumn = "APPLICATION_SEARCH_WARRANT.POSCODE_REQ_FOR";

	public static final String STAFF_ID_REQ_FORColumn = "APPLICATION_SEARCH_WARRANT.STAFF_ID_REQ_FOR";

	public static final String TEL_REQUESTColumn = "APPLICATION_SEARCH_WARRANT.TEL_REQUEST";

	public static final String CAREER_REQUESTColumn = "APPLICATION_SEARCH_WARRANT.CAREER_REQUEST";

	public static final String TRACK_NOColumn = "APPLICATION_SEARCH_WARRANT.TRACK_NO";

	public static final String OFFICE_ADDRESSColumn = "APPLICATION_SEARCH_WARRANT.OFFICE_ADDRESS";

	public static final String UPDATE_ONColumn = "APPLICATION_SEARCH_WARRANT.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_SEARCH_WARRANT.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_SEARCH_WARRANT.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_SEARCH_WARRANT.CREATE_BY";

	public static final String SEARCH_RESULTColumn = "APPLICATION_SEARCH_WARRANT.SEARCH_RESULT";

	public static final String SEND_TO_DESCColumn = "APPLICATION_SEARCH_WARRANT.SEND_TO_DESC";

	public static final String SEND_DESCColumn = "APPLICATION_SEARCH_WARRANT.SEND_DESC";

	public static final String COURT_ID_ARRESTColumn = "APPLICATION_SEARCH_WARRANT.COURT_ID_ARREST";

	public static final String ARREST_DATEColumn = "APPLICATION_SEARCH_WARRANT.ARREST_DATE";

	public static final String ARREST_NOColumn = "APPLICATION_SEARCH_WARRANT.ARREST_NO";

	public static final String SEARCH_CHECK2_2Column = "APPLICATION_SEARCH_WARRANT.SEARCH_CHECK2_2";

	public static final String SEARCH_CHECK2_1Column = "APPLICATION_SEARCH_WARRANT.SEARCH_CHECK2_1";

	public static final String SEARCH_CHECK2_DESCColumn = "APPLICATION_SEARCH_WARRANT.SEARCH_CHECK2_DESC";

	public static final String SEARCH_CHECK2Column = "APPLICATION_SEARCH_WARRANT.SEARCH_CHECK2";

	public static final String SEARCH_CHECK1_3Column = "APPLICATION_SEARCH_WARRANT.SEARCH_CHECK1_3";

	public static final String SEARCH_CHECK1_2Column = "APPLICATION_SEARCH_WARRANT.SEARCH_CHECK1_2";

	public static final String SEARCH_CHECK1_1Column = "APPLICATION_SEARCH_WARRANT.SEARCH_CHECK1_1";

	public static final String SEARCH_CHECK1_DESCColumn = "APPLICATION_SEARCH_WARRANT.SEARCH_CHECK1_DESC";

	public static final String SEARCH_CHECK1Column = "APPLICATION_SEARCH_WARRANT.SEARCH_CHECK1";

	public static final String JEDGE_NAMEColumn = "APPLICATION_SEARCH_WARRANT.JEDGE_NAME";

	public static final String WARRANT_DATEColumn = "APPLICATION_SEARCH_WARRANT.WARRANT_DATE";

	public static final String WARRANT_NOColumn = "APPLICATION_SEARCH_WARRANT.WARRANT_NO";

	public static final String REMARKS_NONAPPROVEColumn = "APPLICATION_SEARCH_WARRANT.REMARKS_NONAPPROVE";

	public static final String ISAPPROVEColumn = "APPLICATION_SEARCH_WARRANT.ISAPPROVE";

	public static final String ISCOPYColumn = "APPLICATION_SEARCH_WARRANT.ISCOPY";

	public static final String ISALLOWColumn = "APPLICATION_SEARCH_WARRANT.ISALLOW";

	public static final String COURT_ORDERColumn = "APPLICATION_SEARCH_WARRANT.COURT_ORDER";

	public static final String WITNESS_QTYColumn = "APPLICATION_SEARCH_WARRANT.WITNESS_QTY";

	public static final String CONSIDER_DATEColumn = "APPLICATION_SEARCH_WARRANT.CONSIDER_DATE";

	public static final String CAUSE_FAMILIARColumn = "APPLICATION_SEARCH_WARRANT.CAUSE_FAMILIAR";

	public static final String COURT_ID_FAMILIARColumn = "APPLICATION_SEARCH_WARRANT.COURT_ID_FAMILIAR";

	public static final String REQUEST_FAMILIARColumn = "APPLICATION_SEARCH_WARRANT.REQUEST_FAMILIAR";

	public static final String PROVINCE_CODEColumn = "APPLICATION_SEARCH_WARRANT.PROVINCE_CODE";

	public static final String DISTRICT_CODEColumn = "APPLICATION_SEARCH_WARRANT.DISTRICT_CODE";

	public static final String SUBDISTRICT_CODEColumn = "APPLICATION_SEARCH_WARRANT.SUBDISTRICT_CODE";

	public static final String MOOColumn = "APPLICATION_SEARCH_WARRANT.MOO";

	public static final String SOIColumn = "APPLICATION_SEARCH_WARRANT.SOI";

	public static final String ADDRESS_NAMEColumn = "APPLICATION_SEARCH_WARRANT.ADDRESS_NAME";

	public static final String ADDRESS_NOColumn = "APPLICATION_SEARCH_WARRANT.ADDRESS_NO";

	public static final String ROADColumn = "APPLICATION_SEARCH_WARRANT.ROAD";

	public static final String OWNER_POSITIONColumn = "APPLICATION_SEARCH_WARRANT.OWNER_POSITION";

	public static final String OWNER_CAREERColumn = "APPLICATION_SEARCH_WARRANT.OWNER_CAREER";

	public static final String OWNER_AGEColumn = "APPLICATION_SEARCH_WARRANT.OWNER_AGE";

	public static final String OWNER_NAMEColumn = "APPLICATION_SEARCH_WARRANT.OWNER_NAME";

	public static final String REQ_CHECK5Column = "APPLICATION_SEARCH_WARRANT.REQ_CHECK5";

	public static final String REQ_CHECK4Column = "APPLICATION_SEARCH_WARRANT.REQ_CHECK4";

	public static final String REQ_CHECK3Column = "APPLICATION_SEARCH_WARRANT.REQ_CHECK3";

	public static final String REQ_CHECK2Column = "APPLICATION_SEARCH_WARRANT.REQ_CHECK2";

	public static final String REQ_CHECK1Column = "APPLICATION_SEARCH_WARRANT.REQ_CHECK1";

	public static final String SEARCH_CAUSEColumn = "APPLICATION_SEARCH_WARRANT.SEARCH_CAUSE";

	public static final String CHK_CONTINUEColumn = "APPLICATION_SEARCH_WARRANT.CHK_CONTINUE";

	public static final String SEARCH_DATETOColumn = "APPLICATION_SEARCH_WARRANT.SEARCH_DATETO";

	public static final String SEARCH_DATEFROMColumn = "APPLICATION_SEARCH_WARRANT.SEARCH_DATEFROM";

	public static final String COURT_IDColumn = "APPLICATION_SEARCH_WARRANT.COURT_ID";

	public static final String AGE_REQUESTColumn = "APPLICATION_SEARCH_WARRANT.AGE_REQUEST";

	public static final String OFFCODE_REQUESTColumn = "APPLICATION_SEARCH_WARRANT.OFFCODE_REQUEST";

	public static final String POSCODE_REQUESTColumn = "APPLICATION_SEARCH_WARRANT.POSCODE_REQUEST";

	public static final String STAFF_ID_REQUESTColumn = "APPLICATION_SEARCH_WARRANT.STAFF_ID_REQUEST";

	public static final String REQUEST_DATEColumn = "APPLICATION_SEARCH_WARRANT.REQUEST_DATE";

	public static final String REQUEST_NOColumn = "APPLICATION_SEARCH_WARRANT.REQUEST_NO";

	public static final String IDColumn = "APPLICATION_SEARCH_WARRANT.ID";


	public static final String[] ALL_COLUMNS =
    {
	 APPLICATION_NOTICE_ARREST_IDCol	, RESULT_QTY_DATECol	, COURT_ORDER_FAMILIARCol	, OFFCODE_ASSIGNCol	, POSCODE_ASSIGNCol	, STAFF_ID_ASSIGNCol	, OFFCODE_REQ_FORCol	, POSCODE_REQ_FORCol	, STAFF_ID_REQ_FORCol	, TEL_REQUESTCol	, CAREER_REQUESTCol	, TRACK_NOCol	, OFFICE_ADDRESSCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, SEARCH_RESULTCol	, SEND_TO_DESCCol	, SEND_DESCCol	, COURT_ID_ARRESTCol	, ARREST_DATECol	, ARREST_NOCol	, SEARCH_CHECK2_2Col	, SEARCH_CHECK2_1Col	, SEARCH_CHECK2_DESCCol	, SEARCH_CHECK2Col	, SEARCH_CHECK1_3Col	, SEARCH_CHECK1_2Col	, SEARCH_CHECK1_1Col	, SEARCH_CHECK1_DESCCol	, SEARCH_CHECK1Col	, JEDGE_NAMECol	, WARRANT_DATECol	, WARRANT_NOCol	, REMARKS_NONAPPROVECol	, ISAPPROVECol	, ISCOPYCol	, ISALLOWCol	, COURT_ORDERCol	, WITNESS_QTYCol	, CONSIDER_DATECol	, CAUSE_FAMILIARCol	, COURT_ID_FAMILIARCol	, REQUEST_FAMILIARCol	, PROVINCE_CODECol	, DISTRICT_CODECol	, SUBDISTRICT_CODECol	, MOOCol	, SOICol	, ADDRESS_NAMECol	, ADDRESS_NOCol	, ROADCol	, OWNER_POSITIONCol	, OWNER_CAREERCol	, OWNER_AGECol	, OWNER_NAMECol	, REQ_CHECK5Col	, REQ_CHECK4Col	, REQ_CHECK3Col	, REQ_CHECK2Col	, REQ_CHECK1Col	, SEARCH_CAUSECol	, CHK_CONTINUECol	, SEARCH_DATETOCol	, SEARCH_DATEFROMCol	, COURT_IDCol	, AGE_REQUESTCol	, OFFCODE_REQUESTCol	, POSCODE_REQUESTCol	, STAFF_ID_REQUESTCol	, REQUEST_DATECol	, REQUEST_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  APPLICATION_NOTICE_ARREST_IDCol	+","+ RESULT_QTY_DATECol	+","+ COURT_ORDER_FAMILIARCol	+","+ OFFCODE_ASSIGNCol	+","+ POSCODE_ASSIGNCol	+","+ STAFF_ID_ASSIGNCol	+","+ OFFCODE_REQ_FORCol	+","+ POSCODE_REQ_FORCol	+","+ STAFF_ID_REQ_FORCol	+","+ TEL_REQUESTCol	+","+ CAREER_REQUESTCol	+","+ TRACK_NOCol	+","+ OFFICE_ADDRESSCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ SEARCH_RESULTCol	+","+ SEND_TO_DESCCol	+","+ SEND_DESCCol	+","+ COURT_ID_ARRESTCol	+","+ ARREST_DATECol	+","+ ARREST_NOCol	+","+ SEARCH_CHECK2_2Col	+","+ SEARCH_CHECK2_1Col	+","+ SEARCH_CHECK2_DESCCol	+","+ SEARCH_CHECK2Col	+","+ SEARCH_CHECK1_3Col	+","+ SEARCH_CHECK1_2Col	+","+ SEARCH_CHECK1_1Col	+","+ SEARCH_CHECK1_DESCCol	+","+ SEARCH_CHECK1Col	+","+ JEDGE_NAMECol	+","+ WARRANT_DATECol	+","+ WARRANT_NOCol	+","+ REMARKS_NONAPPROVECol	+","+ ISAPPROVECol	+","+ ISCOPYCol	+","+ ISALLOWCol	+","+ COURT_ORDERCol	+","+ WITNESS_QTYCol	+","+ CONSIDER_DATECol	+","+ CAUSE_FAMILIARCol	+","+ COURT_ID_FAMILIARCol	+","+ REQUEST_FAMILIARCol	+","+ PROVINCE_CODECol	+","+ DISTRICT_CODECol	+","+ SUBDISTRICT_CODECol	+","+ MOOCol	+","+ SOICol	+","+ ADDRESS_NAMECol	+","+ ADDRESS_NOCol	+","+ ROADCol	+","+ OWNER_POSITIONCol	+","+ OWNER_CAREERCol	+","+ OWNER_AGECol	+","+ OWNER_NAMECol	+","+ REQ_CHECK5Col	+","+ REQ_CHECK4Col	+","+ REQ_CHECK3Col	+","+ REQ_CHECK2Col	+","+ REQ_CHECK1Col	+","+ SEARCH_CAUSECol	+","+ CHK_CONTINUECol	+","+ SEARCH_DATETOCol	+","+ SEARCH_DATEFROMCol	+","+ COURT_IDCol	+","+ AGE_REQUESTCol	+","+ OFFCODE_REQUESTCol	+","+ POSCODE_REQUESTCol	+","+ STAFF_ID_REQUESTCol	+","+ REQUEST_DATECol	+","+ REQUEST_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+APPLICATION_NOTICE_ARREST_IDCol+"=?,"+RESULT_QTY_DATECol+"=?,"+COURT_ORDER_FAMILIARCol+"=?,"+OFFCODE_ASSIGNCol+"=?,"+POSCODE_ASSIGNCol+"=?,"+STAFF_ID_ASSIGNCol+"=?,"+OFFCODE_REQ_FORCol+"=?,"+POSCODE_REQ_FORCol+"=?,"+STAFF_ID_REQ_FORCol+"=?,"+TEL_REQUESTCol+"=?,"+CAREER_REQUESTCol+"=?,"+TRACK_NOCol+"=?,"+OFFICE_ADDRESSCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+SEARCH_RESULTCol+"=?,"+SEND_TO_DESCCol+"=?,"+SEND_DESCCol+"=?,"+COURT_ID_ARRESTCol+"=?,"+ARREST_DATECol+"=?,"+ARREST_NOCol+"=?,"+SEARCH_CHECK2_2Col+"=?,"+SEARCH_CHECK2_1Col+"=?,"+SEARCH_CHECK2_DESCCol+"=?,"+SEARCH_CHECK2Col+"=?,"+SEARCH_CHECK1_3Col+"=?,"+SEARCH_CHECK1_2Col+"=?,"+SEARCH_CHECK1_1Col+"=?,"+SEARCH_CHECK1_DESCCol+"=?,"+SEARCH_CHECK1Col+"=?,"+JEDGE_NAMECol+"=?,"+WARRANT_DATECol+"=?,"+WARRANT_NOCol+"=?,"+REMARKS_NONAPPROVECol+"=?,"+ISAPPROVECol+"=?,"+ISCOPYCol+"=?,"+ISALLOWCol+"=?,"+COURT_ORDERCol+"=?,"+WITNESS_QTYCol+"=?,"+CONSIDER_DATECol+"=?,"+CAUSE_FAMILIARCol+"=?,"+COURT_ID_FAMILIARCol+"=?,"+REQUEST_FAMILIARCol+"=?,"+PROVINCE_CODECol+"=?,"+DISTRICT_CODECol+"=?,"+SUBDISTRICT_CODECol+"=?,"+MOOCol+"=?,"+SOICol+"=?,"+ADDRESS_NAMECol+"=?,"+ADDRESS_NOCol+"=?,"+ROADCol+"=?,"+OWNER_POSITIONCol+"=?,"+OWNER_CAREERCol+"=?,"+OWNER_AGECol+"=?,"+OWNER_NAMECol+"=?,"+REQ_CHECK5Col+"=?,"+REQ_CHECK4Col+"=?,"+REQ_CHECK3Col+"=?,"+REQ_CHECK2Col+"=?,"+REQ_CHECK1Col+"=?,"+SEARCH_CAUSECol+"=?,"+CHK_CONTINUECol+"=?,"+SEARCH_DATETOCol+"=?,"+SEARCH_DATEFROMCol+"=?,"+COURT_IDCol+"=?,"+AGE_REQUESTCol+"=?,"+OFFCODE_REQUESTCol+"=?,"+POSCODE_REQUESTCol+"=?,"+STAFF_ID_REQUESTCol+"=?,"+REQUEST_DATECol+"=?,"+REQUEST_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationSearchWarrant(DB db){
		super(db);
	}



public synchronized ApplicationSearchWarrant create() throws Exception{
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
					return (ApplicationSearchWarrant)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationSearchWarrant> createList(List<ApplicationSearchWarrant> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationSearchWarrant> resultList = new ArrayList<ApplicationSearchWarrant>();
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
	public ApplicationSearchWarrant findByPk(Long id)throws Exception{
		List<ApplicationSearchWarrant> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationSearchWarrant> findByPks(List<Long> ids)throws Exception{
		List<ApplicationSearchWarrant> resultList = new ArrayList<ApplicationSearchWarrant>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationSearchWarrant> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationSearchWarrant> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationSearchWarrant> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationSearchWarrant> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationSearchWarrant> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationSearchWarrant> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationSearchWarrant> resultList = new ArrayList<ApplicationSearchWarrant>();
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
	public List<ApplicationSearchWarrant> findByExample(ApplicationSearchWarrant instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationSearchWarrant> findByExample(ApplicationSearchWarrant instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationSearchWarrant update()throws Exception{
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
					return (ApplicationSearchWarrant)this;
			}else// not update
				return (ApplicationSearchWarrant)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationSearchWarrant> updateList(List<ApplicationSearchWarrant> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationSearchWarrant> resultList = new ArrayList<ApplicationSearchWarrant>();
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
	public Integer deleteList(List<ApplicationSearchWarrant> objList)throws Exception {
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
	public ApplicationSearchWarrant populate(ResultSet rs)throws Exception{
		ApplicationSearchWarrant result = new ApplicationSearchWarrant(this.db);
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
    private Long application_notice_arrest_id;

    private Long result_qty_date;

    private String court_order_familiar;

    private String offcode_assign;

    private String poscode_assign;

    private String staff_id_assign;

    private String offcode_req_for;

    private String poscode_req_for;

    private String staff_id_req_for;

    private String tel_request;

    private String career_request;

    private String track_no;

    private String office_address;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String search_result;

    private String send_to_desc;

    private String send_desc;

    private Long court_id_arrest;

    private java.util.Date arrest_date;

    private String arrest_no;

    private String search_check2_2;

    private String search_check2_1;

    private String search_check2_desc;

    private String search_check2;

    private String search_check1_3;

    private String search_check1_2;

    private String search_check1_1;

    private String search_check1_desc;

    private String search_check1;

    private String jedge_name;

    private java.util.Date warrant_date;

    private String warrant_no;

    private String remarks_nonapprove;

    private String isapprove;

    private String iscopy;

    private String isallow;

    private String court_order;

    private Long witness_qty;

    private java.util.Date consider_date;

    private String cause_familiar;

    private Long court_id_familiar;

    private String request_familiar;

    private String province_code;

    private String district_code;

    private String subdistrict_code;

    private Long moo;

    private String soi;

    private String address_name;

    private String address_no;

    private String road;

    private String owner_position;

    private String owner_career;

    private Long owner_age;

    private String owner_name;

    private String req_check5;

    private String req_check4;

    private String req_check3;

    private String req_check2;

    private String req_check1;

    private String search_cause;

    private String chk_continue;

    private java.util.Date search_dateto;

    private java.util.Date search_datefrom;

    private Long court_id;

    private Long age_request;

    private String offcode_request;

    private String poscode_request;

    private String staff_id_request;

    private java.util.Date request_date;

    private String request_no;

    private Long id;

	//**** getter setter ****//
	public Long getApplication_notice_arrest_id()
    {
        return application_notice_arrest_id;
    }
    public void setApplication_notice_arrest_id(Long application_notice_arrest_id)
    {
        this.application_notice_arrest_id = application_notice_arrest_id;
    }

	public Long getResult_qty_date()
    {
        return result_qty_date;
    }
    public void setResult_qty_date(Long result_qty_date)
    {
        this.result_qty_date = result_qty_date;
    }

	public String getCourt_order_familiar()
    {
        return court_order_familiar;
    }
    public void setCourt_order_familiar(String court_order_familiar)
    {
        this.court_order_familiar = court_order_familiar;
    }

	public String getOffcode_assign()
    {
        return offcode_assign;
    }
    public void setOffcode_assign(String offcode_assign)
    {
        this.offcode_assign = offcode_assign;
    }

	public String getPoscode_assign()
    {
        return poscode_assign;
    }
    public void setPoscode_assign(String poscode_assign)
    {
        this.poscode_assign = poscode_assign;
    }

	public String getStaff_id_assign()
    {
        return staff_id_assign;
    }
    public void setStaff_id_assign(String staff_id_assign)
    {
        this.staff_id_assign = staff_id_assign;
    }

	public String getOffcode_req_for()
    {
        return offcode_req_for;
    }
    public void setOffcode_req_for(String offcode_req_for)
    {
        this.offcode_req_for = offcode_req_for;
    }

	public String getPoscode_req_for()
    {
        return poscode_req_for;
    }
    public void setPoscode_req_for(String poscode_req_for)
    {
        this.poscode_req_for = poscode_req_for;
    }

	public String getStaff_id_req_for()
    {
        return staff_id_req_for;
    }
    public void setStaff_id_req_for(String staff_id_req_for)
    {
        this.staff_id_req_for = staff_id_req_for;
    }

	public String getTel_request()
    {
        return tel_request;
    }
    public void setTel_request(String tel_request)
    {
        this.tel_request = tel_request;
    }

	public String getCareer_request()
    {
        return career_request;
    }
    public void setCareer_request(String career_request)
    {
        this.career_request = career_request;
    }

	public String getTrack_no()
    {
        return track_no;
    }
    public void setTrack_no(String track_no)
    {
        this.track_no = track_no;
    }

	public String getOffice_address()
    {
        return office_address;
    }
    public void setOffice_address(String office_address)
    {
        this.office_address = office_address;
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

	public String getSearch_result()
    {
        return search_result;
    }
    public void setSearch_result(String search_result)
    {
        this.search_result = search_result;
    }

	public String getSend_to_desc()
    {
        return send_to_desc;
    }
    public void setSend_to_desc(String send_to_desc)
    {
        this.send_to_desc = send_to_desc;
    }

	public String getSend_desc()
    {
        return send_desc;
    }
    public void setSend_desc(String send_desc)
    {
        this.send_desc = send_desc;
    }

	public Long getCourt_id_arrest()
    {
        return court_id_arrest;
    }
    public void setCourt_id_arrest(Long court_id_arrest)
    {
        this.court_id_arrest = court_id_arrest;
    }

	public java.util.Date getArrest_date()
    {
        return arrest_date;
    }
    public void setArrest_date(java.util.Date arrest_date)
    {
        this.arrest_date = arrest_date;
    }

	public String getArrest_no()
    {
        return arrest_no;
    }
    public void setArrest_no(String arrest_no)
    {
        this.arrest_no = arrest_no;
    }

	public String getSearch_check2_2()
    {
        return search_check2_2;
    }
    public void setSearch_check2_2(String search_check2_2)
    {
        this.search_check2_2 = search_check2_2;
    }

	public String getSearch_check2_1()
    {
        return search_check2_1;
    }
    public void setSearch_check2_1(String search_check2_1)
    {
        this.search_check2_1 = search_check2_1;
    }

	public String getSearch_check2_desc()
    {
        return search_check2_desc;
    }
    public void setSearch_check2_desc(String search_check2_desc)
    {
        this.search_check2_desc = search_check2_desc;
    }

	public String getSearch_check2()
    {
        return search_check2;
    }
    public void setSearch_check2(String search_check2)
    {
        this.search_check2 = search_check2;
    }

	public String getSearch_check1_3()
    {
        return search_check1_3;
    }
    public void setSearch_check1_3(String search_check1_3)
    {
        this.search_check1_3 = search_check1_3;
    }

	public String getSearch_check1_2()
    {
        return search_check1_2;
    }
    public void setSearch_check1_2(String search_check1_2)
    {
        this.search_check1_2 = search_check1_2;
    }

	public String getSearch_check1_1()
    {
        return search_check1_1;
    }
    public void setSearch_check1_1(String search_check1_1)
    {
        this.search_check1_1 = search_check1_1;
    }

	public String getSearch_check1_desc()
    {
        return search_check1_desc;
    }
    public void setSearch_check1_desc(String search_check1_desc)
    {
        this.search_check1_desc = search_check1_desc;
    }

	public String getSearch_check1()
    {
        return search_check1;
    }
    public void setSearch_check1(String search_check1)
    {
        this.search_check1 = search_check1;
    }

	public String getJedge_name()
    {
        return jedge_name;
    }
    public void setJedge_name(String jedge_name)
    {
        this.jedge_name = jedge_name;
    }

	public java.util.Date getWarrant_date()
    {
        return warrant_date;
    }
    public void setWarrant_date(java.util.Date warrant_date)
    {
        this.warrant_date = warrant_date;
    }

	public String getWarrant_no()
    {
        return warrant_no;
    }
    public void setWarrant_no(String warrant_no)
    {
        this.warrant_no = warrant_no;
    }

	public String getRemarks_nonapprove()
    {
        return remarks_nonapprove;
    }
    public void setRemarks_nonapprove(String remarks_nonapprove)
    {
        this.remarks_nonapprove = remarks_nonapprove;
    }

	public String getIsapprove()
    {
        return isapprove;
    }
    public void setIsapprove(String isapprove)
    {
        this.isapprove = isapprove;
    }

	public String getIscopy()
    {
        return iscopy;
    }
    public void setIscopy(String iscopy)
    {
        this.iscopy = iscopy;
    }

	public String getIsallow()
    {
        return isallow;
    }
    public void setIsallow(String isallow)
    {
        this.isallow = isallow;
    }

	public String getCourt_order()
    {
        return court_order;
    }
    public void setCourt_order(String court_order)
    {
        this.court_order = court_order;
    }

	public Long getWitness_qty()
    {
        return witness_qty;
    }
    public void setWitness_qty(Long witness_qty)
    {
        this.witness_qty = witness_qty;
    }

	public java.util.Date getConsider_date()
    {
        return consider_date;
    }
    public void setConsider_date(java.util.Date consider_date)
    {
        this.consider_date = consider_date;
    }

	public String getCause_familiar()
    {
        return cause_familiar;
    }
    public void setCause_familiar(String cause_familiar)
    {
        this.cause_familiar = cause_familiar;
    }

	public Long getCourt_id_familiar()
    {
        return court_id_familiar;
    }
    public void setCourt_id_familiar(Long court_id_familiar)
    {
        this.court_id_familiar = court_id_familiar;
    }

	public String getRequest_familiar()
    {
        return request_familiar;
    }
    public void setRequest_familiar(String request_familiar)
    {
        this.request_familiar = request_familiar;
    }

	public String getProvince_code()
    {
        return province_code;
    }
    public void setProvince_code(String province_code)
    {
        this.province_code = province_code;
    }

	public String getDistrict_code()
    {
        return district_code;
    }
    public void setDistrict_code(String district_code)
    {
        this.district_code = district_code;
    }

	public String getSubdistrict_code()
    {
        return subdistrict_code;
    }
    public void setSubdistrict_code(String subdistrict_code)
    {
        this.subdistrict_code = subdistrict_code;
    }

	public Long getMoo()
    {
        return moo;
    }
    public void setMoo(Long moo)
    {
        this.moo = moo;
    }

	public String getSoi()
    {
        return soi;
    }
    public void setSoi(String soi)
    {
        this.soi = soi;
    }

	public String getAddress_name()
    {
        return address_name;
    }
    public void setAddress_name(String address_name)
    {
        this.address_name = address_name;
    }

	public String getAddress_no()
    {
        return address_no;
    }
    public void setAddress_no(String address_no)
    {
        this.address_no = address_no;
    }

	public String getRoad()
    {
        return road;
    }
    public void setRoad(String road)
    {
        this.road = road;
    }

	public String getOwner_position()
    {
        return owner_position;
    }
    public void setOwner_position(String owner_position)
    {
        this.owner_position = owner_position;
    }

	public String getOwner_career()
    {
        return owner_career;
    }
    public void setOwner_career(String owner_career)
    {
        this.owner_career = owner_career;
    }

	public Long getOwner_age()
    {
        return owner_age;
    }
    public void setOwner_age(Long owner_age)
    {
        this.owner_age = owner_age;
    }

	public String getOwner_name()
    {
        return owner_name;
    }
    public void setOwner_name(String owner_name)
    {
        this.owner_name = owner_name;
    }

	public String getReq_check5()
    {
        return req_check5;
    }
    public void setReq_check5(String req_check5)
    {
        this.req_check5 = req_check5;
    }

	public String getReq_check4()
    {
        return req_check4;
    }
    public void setReq_check4(String req_check4)
    {
        this.req_check4 = req_check4;
    }

	public String getReq_check3()
    {
        return req_check3;
    }
    public void setReq_check3(String req_check3)
    {
        this.req_check3 = req_check3;
    }

	public String getReq_check2()
    {
        return req_check2;
    }
    public void setReq_check2(String req_check2)
    {
        this.req_check2 = req_check2;
    }

	public String getReq_check1()
    {
        return req_check1;
    }
    public void setReq_check1(String req_check1)
    {
        this.req_check1 = req_check1;
    }

	public String getSearch_cause()
    {
        return search_cause;
    }
    public void setSearch_cause(String search_cause)
    {
        this.search_cause = search_cause;
    }

	public String getChk_continue()
    {
        return chk_continue;
    }
    public void setChk_continue(String chk_continue)
    {
        this.chk_continue = chk_continue;
    }

	public java.util.Date getSearch_dateto()
    {
        return search_dateto;
    }
    public void setSearch_dateto(java.util.Date search_dateto)
    {
        this.search_dateto = search_dateto;
    }

	public java.util.Date getSearch_datefrom()
    {
        return search_datefrom;
    }
    public void setSearch_datefrom(java.util.Date search_datefrom)
    {
        this.search_datefrom = search_datefrom;
    }

	public Long getCourt_id()
    {
        return court_id;
    }
    public void setCourt_id(Long court_id)
    {
        this.court_id = court_id;
    }

	public Long getAge_request()
    {
        return age_request;
    }
    public void setAge_request(Long age_request)
    {
        this.age_request = age_request;
    }

	public String getOffcode_request()
    {
        return offcode_request;
    }
    public void setOffcode_request(String offcode_request)
    {
        this.offcode_request = offcode_request;
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