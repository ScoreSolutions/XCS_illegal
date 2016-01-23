








 

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

import com.ko.domain.ApplicationArrestLawbreaker;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationArrestLawbreaker extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_ARREST_LAWBREAKER";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_ARREST_LAWBREAKER.ID";

	// short name column
	public static final String ISMISTAKE_DESCCol = "ISMISTAKE_DESC";

	public static final String ISMISTAKECol = "ISMISTAKE";

	public static final String PAPER_NOCol = "PAPER_NO";

	public static final String COMPANY_NAMECol = "COMPANY_NAME";

	public static final String COMPANY_TITLE_CODECol = "COMPANY_TITLE_CODE";

	public static final String CORPORATION_CODECol = "CORPORATION_CODE";

	public static final String EXCISE_REG_NOCol = "EXCISE_REG_NO";

	public static final String OTHER_NAMECol = "OTHER_NAME";

	public static final String BIRTH_DATECol = "BIRTH_DATE";

	public static final String SEXCol = "SEX";

	public static final String TITLE_CODECol = "TITLE_CODE";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String CANCEL_BYCol = "CANCEL_BY";

	public static final String CANCEL_DATECol = "CANCEL_DATE";

	public static final String ISCANCELCol = "ISCANCEL";

	public static final String INV_NOCol = "INV_NO";

	public static final String BOOK_NOCol = "BOOK_NO";

	public static final String FINECol = "FINE";

	public static final String INVCODECol = "INVCODE";

	public static final String PAID_TIME_OFFCol = "PAID_TIME_OFF";

	public static final String MOTHER_NAMECol = "MOTHER_NAME";

	public static final String FATHER_NAMECol = "FATHER_NAME";

	public static final String AGECol = "AGE";

	public static final String CAREERCol = "CAREER";

	public static final String RACE_IDCol = "RACE_ID";

	public static final String NATIONALITY_IDCol = "NATIONALITY_ID";

	public static final String PROVINCECol = "PROVINCE";

	public static final String DISTRICTCol = "DISTRICT";

	public static final String SUBDISTRICTCol = "SUBDISTRICT";

	public static final String MOOCol = "MOO";

	public static final String ROADCol = "ROAD";

	public static final String SOICol = "SOI";

	public static final String ADDRESS_NOCol = "ADDRESS_NO";

	public static final String LAST_NAMECol = "LAST_NAME";

	public static final String MIDDLE_NAMECol = "MIDDLE_NAME";

	public static final String FIRST_NAMECol = "FIRST_NAME";

	public static final String LAWBREAKER_PASSPORTCol = "LAWBREAKER_PASSPORT";

	public static final String LAWBREAKER_ID_CARDCol = "LAWBREAKER_ID_CARD";

	public static final String CULPRIT_TYPECol = "CULPRIT_TYPE";

	public static final String LAWBREAKER_NOCol = "LAWBREAKER_NO";

	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String ISMISTAKE_DESCColumn = "APPLICATION_ARREST_LAWBREAKER.ISMISTAKE_DESC";

	public static final String ISMISTAKEColumn = "APPLICATION_ARREST_LAWBREAKER.ISMISTAKE";

	public static final String PAPER_NOColumn = "APPLICATION_ARREST_LAWBREAKER.PAPER_NO";

	public static final String COMPANY_NAMEColumn = "APPLICATION_ARREST_LAWBREAKER.COMPANY_NAME";

	public static final String COMPANY_TITLE_CODEColumn = "APPLICATION_ARREST_LAWBREAKER.COMPANY_TITLE_CODE";

	public static final String CORPORATION_CODEColumn = "APPLICATION_ARREST_LAWBREAKER.CORPORATION_CODE";

	public static final String EXCISE_REG_NOColumn = "APPLICATION_ARREST_LAWBREAKER.EXCISE_REG_NO";

	public static final String OTHER_NAMEColumn = "APPLICATION_ARREST_LAWBREAKER.OTHER_NAME";

	public static final String BIRTH_DATEColumn = "APPLICATION_ARREST_LAWBREAKER.BIRTH_DATE";

	public static final String SEXColumn = "APPLICATION_ARREST_LAWBREAKER.SEX";

	public static final String TITLE_CODEColumn = "APPLICATION_ARREST_LAWBREAKER.TITLE_CODE";

	public static final String UPDATE_ONColumn = "APPLICATION_ARREST_LAWBREAKER.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_ARREST_LAWBREAKER.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_ARREST_LAWBREAKER.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_ARREST_LAWBREAKER.CREATE_BY";

	public static final String CANCEL_BYColumn = "APPLICATION_ARREST_LAWBREAKER.CANCEL_BY";

	public static final String CANCEL_DATEColumn = "APPLICATION_ARREST_LAWBREAKER.CANCEL_DATE";

	public static final String ISCANCELColumn = "APPLICATION_ARREST_LAWBREAKER.ISCANCEL";

	public static final String INV_NOColumn = "APPLICATION_ARREST_LAWBREAKER.INV_NO";

	public static final String BOOK_NOColumn = "APPLICATION_ARREST_LAWBREAKER.BOOK_NO";

	public static final String FINEColumn = "APPLICATION_ARREST_LAWBREAKER.FINE";

	public static final String INVCODEColumn = "APPLICATION_ARREST_LAWBREAKER.INVCODE";

	public static final String PAID_TIME_OFFColumn = "APPLICATION_ARREST_LAWBREAKER.PAID_TIME_OFF";

	public static final String MOTHER_NAMEColumn = "APPLICATION_ARREST_LAWBREAKER.MOTHER_NAME";

	public static final String FATHER_NAMEColumn = "APPLICATION_ARREST_LAWBREAKER.FATHER_NAME";

	public static final String AGEColumn = "APPLICATION_ARREST_LAWBREAKER.AGE";

	public static final String CAREERColumn = "APPLICATION_ARREST_LAWBREAKER.CAREER";

	public static final String RACE_IDColumn = "APPLICATION_ARREST_LAWBREAKER.RACE_ID";

	public static final String NATIONALITY_IDColumn = "APPLICATION_ARREST_LAWBREAKER.NATIONALITY_ID";

	public static final String PROVINCEColumn = "APPLICATION_ARREST_LAWBREAKER.PROVINCE";

	public static final String DISTRICTColumn = "APPLICATION_ARREST_LAWBREAKER.DISTRICT";

	public static final String SUBDISTRICTColumn = "APPLICATION_ARREST_LAWBREAKER.SUBDISTRICT";

	public static final String MOOColumn = "APPLICATION_ARREST_LAWBREAKER.MOO";

	public static final String ROADColumn = "APPLICATION_ARREST_LAWBREAKER.ROAD";

	public static final String SOIColumn = "APPLICATION_ARREST_LAWBREAKER.SOI";

	public static final String ADDRESS_NOColumn = "APPLICATION_ARREST_LAWBREAKER.ADDRESS_NO";

	public static final String LAST_NAMEColumn = "APPLICATION_ARREST_LAWBREAKER.LAST_NAME";

	public static final String MIDDLE_NAMEColumn = "APPLICATION_ARREST_LAWBREAKER.MIDDLE_NAME";

	public static final String FIRST_NAMEColumn = "APPLICATION_ARREST_LAWBREAKER.FIRST_NAME";

	public static final String LAWBREAKER_PASSPORTColumn = "APPLICATION_ARREST_LAWBREAKER.LAWBREAKER_PASSPORT";

	public static final String LAWBREAKER_ID_CARDColumn = "APPLICATION_ARREST_LAWBREAKER.LAWBREAKER_ID_CARD";

	public static final String CULPRIT_TYPEColumn = "APPLICATION_ARREST_LAWBREAKER.CULPRIT_TYPE";

	public static final String LAWBREAKER_NOColumn = "APPLICATION_ARREST_LAWBREAKER.LAWBREAKER_NO";

	public static final String TRACK_NOColumn = "APPLICATION_ARREST_LAWBREAKER.TRACK_NO";

	public static final String IDColumn = "APPLICATION_ARREST_LAWBREAKER.ID";


	public static final String[] ALL_COLUMNS =
    {
	 ISMISTAKE_DESCCol	, ISMISTAKECol	, PAPER_NOCol	, COMPANY_NAMECol	, COMPANY_TITLE_CODECol	, CORPORATION_CODECol	, EXCISE_REG_NOCol	, OTHER_NAMECol	, BIRTH_DATECol	, SEXCol	, TITLE_CODECol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, CANCEL_BYCol	, CANCEL_DATECol	, ISCANCELCol	, INV_NOCol	, BOOK_NOCol	, FINECol	, INVCODECol	, PAID_TIME_OFFCol	, MOTHER_NAMECol	, FATHER_NAMECol	, AGECol	, CAREERCol	, RACE_IDCol	, NATIONALITY_IDCol	, PROVINCECol	, DISTRICTCol	, SUBDISTRICTCol	, MOOCol	, ROADCol	, SOICol	, ADDRESS_NOCol	, LAST_NAMECol	, MIDDLE_NAMECol	, FIRST_NAMECol	, LAWBREAKER_PASSPORTCol	, LAWBREAKER_ID_CARDCol	, CULPRIT_TYPECol	, LAWBREAKER_NOCol	, TRACK_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  ISMISTAKE_DESCCol	+","+ ISMISTAKECol	+","+ PAPER_NOCol	+","+ COMPANY_NAMECol	+","+ COMPANY_TITLE_CODECol	+","+ CORPORATION_CODECol	+","+ EXCISE_REG_NOCol	+","+ OTHER_NAMECol	+","+ BIRTH_DATECol	+","+ SEXCol	+","+ TITLE_CODECol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ CANCEL_BYCol	+","+ CANCEL_DATECol	+","+ ISCANCELCol	+","+ INV_NOCol	+","+ BOOK_NOCol	+","+ FINECol	+","+ INVCODECol	+","+ PAID_TIME_OFFCol	+","+ MOTHER_NAMECol	+","+ FATHER_NAMECol	+","+ AGECol	+","+ CAREERCol	+","+ RACE_IDCol	+","+ NATIONALITY_IDCol	+","+ PROVINCECol	+","+ DISTRICTCol	+","+ SUBDISTRICTCol	+","+ MOOCol	+","+ ROADCol	+","+ SOICol	+","+ ADDRESS_NOCol	+","+ LAST_NAMECol	+","+ MIDDLE_NAMECol	+","+ FIRST_NAMECol	+","+ LAWBREAKER_PASSPORTCol	+","+ LAWBREAKER_ID_CARDCol	+","+ CULPRIT_TYPECol	+","+ LAWBREAKER_NOCol	+","+ TRACK_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+ISMISTAKE_DESCCol+"=?,"+ISMISTAKECol+"=?,"+PAPER_NOCol+"=?,"+COMPANY_NAMECol+"=?,"+COMPANY_TITLE_CODECol+"=?,"+CORPORATION_CODECol+"=?,"+EXCISE_REG_NOCol+"=?,"+OTHER_NAMECol+"=?,"+BIRTH_DATECol+"=?,"+SEXCol+"=?,"+TITLE_CODECol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+CANCEL_BYCol+"=?,"+CANCEL_DATECol+"=?,"+ISCANCELCol+"=?,"+INV_NOCol+"=?,"+BOOK_NOCol+"=?,"+FINECol+"=?,"+INVCODECol+"=?,"+PAID_TIME_OFFCol+"=?,"+MOTHER_NAMECol+"=?,"+FATHER_NAMECol+"=?,"+AGECol+"=?,"+CAREERCol+"=?,"+RACE_IDCol+"=?,"+NATIONALITY_IDCol+"=?,"+PROVINCECol+"=?,"+DISTRICTCol+"=?,"+SUBDISTRICTCol+"=?,"+MOOCol+"=?,"+ROADCol+"=?,"+SOICol+"=?,"+ADDRESS_NOCol+"=?,"+LAST_NAMECol+"=?,"+MIDDLE_NAMECol+"=?,"+FIRST_NAMECol+"=?,"+LAWBREAKER_PASSPORTCol+"=?,"+LAWBREAKER_ID_CARDCol+"=?,"+CULPRIT_TYPECol+"=?,"+LAWBREAKER_NOCol+"=?,"+TRACK_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationArrestLawbreaker(DB db){
		super(db);
	}



public synchronized ApplicationArrestLawbreaker create() throws Exception{
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
					return (ApplicationArrestLawbreaker)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationArrestLawbreaker> createList(List<ApplicationArrestLawbreaker> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationArrestLawbreaker> resultList = new ArrayList<ApplicationArrestLawbreaker>();
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
	public ApplicationArrestLawbreaker findByPk(Long id)throws Exception{
		List<ApplicationArrestLawbreaker> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationArrestLawbreaker> findByPks(List<Long> ids)throws Exception{
		List<ApplicationArrestLawbreaker> resultList = new ArrayList<ApplicationArrestLawbreaker>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationArrestLawbreaker> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationArrestLawbreaker> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationArrestLawbreaker> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationArrestLawbreaker> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationArrestLawbreaker> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationArrestLawbreaker> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationArrestLawbreaker> resultList = new ArrayList<ApplicationArrestLawbreaker>();
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
	public List<ApplicationArrestLawbreaker> findByExample(ApplicationArrestLawbreaker instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationArrestLawbreaker> findByExample(ApplicationArrestLawbreaker instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationArrestLawbreaker update()throws Exception{
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
					return (ApplicationArrestLawbreaker)this;
			}else// not update
				return (ApplicationArrestLawbreaker)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationArrestLawbreaker> updateList(List<ApplicationArrestLawbreaker> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationArrestLawbreaker> resultList = new ArrayList<ApplicationArrestLawbreaker>();
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
	public Integer deleteList(List<ApplicationArrestLawbreaker> objList)throws Exception {
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
	public ApplicationArrestLawbreaker populate(ResultSet rs)throws Exception{
		ApplicationArrestLawbreaker result = new ApplicationArrestLawbreaker(this.db);
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
    private String ismistake_desc;

    private String ismistake;

    private String paper_no;

    private String company_name;

    private String company_title_code;

    private String corporation_code;

    private String excise_reg_no;

    private String other_name;

    private java.util.Date birth_date;

    private String sex;

    private String title_code;

    private java.util.Date update_on;

    private String update_by;

    private java.util.Date create_on;

    private String create_by;

    private String cancel_by;

    private java.util.Date cancel_date;

    private String iscancel;

    private String inv_no;

    private String book_no;

    private Double fine;

    private String invcode;

    private String paid_time_off;

    private String mother_name;

    private String father_name;

    private Long age;

    private String career;

    private Long race_id;

    private Long nationality_id;

    private String province;

    private String district;

    private String subdistrict;

    private Long moo;

    private String road;

    private String soi;

    private String address_no;

    private String last_name;

    private String middle_name;

    private String first_name;

    private String lawbreaker_passport;

    private String lawbreaker_id_card;

    private Long culprit_type;

    private Long lawbreaker_no;

    private String track_no;

    private Long id;

	//**** getter setter ****//
	public String getIsmistake_desc()
    {
        return ismistake_desc;
    }
    public void setIsmistake_desc(String ismistake_desc)
    {
        this.ismistake_desc = ismistake_desc;
    }

	public String getIsmistake()
    {
        return ismistake;
    }
    public void setIsmistake(String ismistake)
    {
        this.ismistake = ismistake;
    }

	public String getPaper_no()
    {
        return paper_no;
    }
    public void setPaper_no(String paper_no)
    {
        this.paper_no = paper_no;
    }

	public String getCompany_name()
    {
        return company_name;
    }
    public void setCompany_name(String company_name)
    {
        this.company_name = company_name;
    }

	public String getCompany_title_code()
    {
        return company_title_code;
    }
    public void setCompany_title_code(String company_title_code)
    {
        this.company_title_code = company_title_code;
    }

	public String getCorporation_code()
    {
        return corporation_code;
    }
    public void setCorporation_code(String corporation_code)
    {
        this.corporation_code = corporation_code;
    }

	public String getExcise_reg_no()
    {
        return excise_reg_no;
    }
    public void setExcise_reg_no(String excise_reg_no)
    {
        this.excise_reg_no = excise_reg_no;
    }

	public String getOther_name()
    {
        return other_name;
    }
    public void setOther_name(String other_name)
    {
        this.other_name = other_name;
    }

	public java.util.Date getBirth_date()
    {
        return birth_date;
    }
    public void setBirth_date(java.util.Date birth_date)
    {
        this.birth_date = birth_date;
    }

	public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

	public String getTitle_code()
    {
        return title_code;
    }
    public void setTitle_code(String title_code)
    {
        this.title_code = title_code;
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

	public String getCancel_by()
    {
        return cancel_by;
    }
    public void setCancel_by(String cancel_by)
    {
        this.cancel_by = cancel_by;
    }

	public java.util.Date getCancel_date()
    {
        return cancel_date;
    }
    public void setCancel_date(java.util.Date cancel_date)
    {
        this.cancel_date = cancel_date;
    }

	public String getIscancel()
    {
        return iscancel;
    }
    public void setIscancel(String iscancel)
    {
        this.iscancel = iscancel;
    }

	public String getInv_no()
    {
        return inv_no;
    }
    public void setInv_no(String inv_no)
    {
        this.inv_no = inv_no;
    }

	public String getBook_no()
    {
        return book_no;
    }
    public void setBook_no(String book_no)
    {
        this.book_no = book_no;
    }

	public Double getFine()
    {
        return fine;
    }
    public void setFine(Double fine)
    {
        this.fine = fine;
    }

	public String getInvcode()
    {
        return invcode;
    }
    public void setInvcode(String invcode)
    {
        this.invcode = invcode;
    }

	public String getPaid_time_off()
    {
        return paid_time_off;
    }
    public void setPaid_time_off(String paid_time_off)
    {
        this.paid_time_off = paid_time_off;
    }

	public String getMother_name()
    {
        return mother_name;
    }
    public void setMother_name(String mother_name)
    {
        this.mother_name = mother_name;
    }

	public String getFather_name()
    {
        return father_name;
    }
    public void setFather_name(String father_name)
    {
        this.father_name = father_name;
    }

	public Long getAge()
    {
        return age;
    }
    public void setAge(Long age)
    {
        this.age = age;
    }

	public String getCareer()
    {
        return career;
    }
    public void setCareer(String career)
    {
        this.career = career;
    }

	public Long getRace_id()
    {
        return race_id;
    }
    public void setRace_id(Long race_id)
    {
        this.race_id = race_id;
    }

	public Long getNationality_id()
    {
        return nationality_id;
    }
    public void setNationality_id(Long nationality_id)
    {
        this.nationality_id = nationality_id;
    }

	public String getProvince()
    {
        return province;
    }
    public void setProvince(String province)
    {
        this.province = province;
    }

	public String getDistrict()
    {
        return district;
    }
    public void setDistrict(String district)
    {
        this.district = district;
    }

	public String getSubdistrict()
    {
        return subdistrict;
    }
    public void setSubdistrict(String subdistrict)
    {
        this.subdistrict = subdistrict;
    }

	public Long getMoo()
    {
        return moo;
    }
    public void setMoo(Long moo)
    {
        this.moo = moo;
    }

	public String getRoad()
    {
        return road;
    }
    public void setRoad(String road)
    {
        this.road = road;
    }

	public String getSoi()
    {
        return soi;
    }
    public void setSoi(String soi)
    {
        this.soi = soi;
    }

	public String getAddress_no()
    {
        return address_no;
    }
    public void setAddress_no(String address_no)
    {
        this.address_no = address_no;
    }

	public String getLast_name()
    {
        return last_name;
    }
    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }

	public String getMiddle_name()
    {
        return middle_name;
    }
    public void setMiddle_name(String middle_name)
    {
        this.middle_name = middle_name;
    }

	public String getFirst_name()
    {
        return first_name;
    }
    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

	public String getLawbreaker_passport()
    {
        return lawbreaker_passport;
    }
    public void setLawbreaker_passport(String lawbreaker_passport)
    {
        this.lawbreaker_passport = lawbreaker_passport;
    }

	public String getLawbreaker_id_card()
    {
        return lawbreaker_id_card;
    }
    public void setLawbreaker_id_card(String lawbreaker_id_card)
    {
        this.lawbreaker_id_card = lawbreaker_id_card;
    }

	public Long getCulprit_type()
    {
        return culprit_type;
    }
    public void setCulprit_type(Long culprit_type)
    {
        this.culprit_type = culprit_type;
    }

	public Long getLawbreaker_no()
    {
        return lawbreaker_no;
    }
    public void setLawbreaker_no(Long lawbreaker_no)
    {
        this.lawbreaker_no = lawbreaker_no;
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