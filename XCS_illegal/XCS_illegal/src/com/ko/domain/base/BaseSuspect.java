








 

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

import com.ko.domain.Suspect;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseSuspect extends BaseDomain{
	// table
	public static final String TABLE_NAME = "SUSPECT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "SUSPECT.ID";

	// short name column
	public static final String PASSPORT_COUNTRYCol = "PASSPORT_COUNTRY";

	public static final String DEL_FLAGCol = "DEL_FLAG";

	public static final String OFFCODECol = "OFFCODE";

	public static final String MIME_TYPECol = "MIME_TYPE";

	public static final String UPDATE_DATECol = "UPDATE_DATE";

	public static final String UPDATE_IDCol = "UPDATE_ID";

	public static final String LINK_PHOTOCol = "LINK_PHOTO";

	public static final String LICENSE_DATE_TOCol = "LICENSE_DATE_TO";

	public static final String LICENSE_DATE_FROMCol = "LICENSE_DATE_FROM";

	public static final String COMPANY_NAMECol = "COMPANY_NAME";

	public static final String TITLE_CODE_COMPANYCol = "TITLE_CODE_COMPANY";

	public static final String PHOTO_DESCCol = "PHOTO_DESC";

	public static final String MOBILECol = "MOBILE";

	public static final String COUNTRY_CODECol = "COUNTRY_CODE";

	public static final String DATE_OUTCol = "DATE_OUT";

	public static final String DATE_INCol = "DATE_IN";

	public static final String VISA_TYPECol = "VISA_TYPE";

	public static final String CREATE_DATECol = "CREATE_DATE";

	public static final String CREATE_IDCol = "CREATE_ID";

	public static final String DESCRIPTIONCol = "DESCRIPTION";

	public static final String LICENSE_NOCol = "LICENSE_NO";

	public static final String CORPORATION_CODECol = "CORPORATION_CODE";

	public static final String EXCISE_REG_NOCol = "EXCISE_REG_NO";

	public static final String TAX_ID_NOCol = "TAX_ID_NO";

	public static final String EMAILCol = "EMAIL";

	public static final String TELCol = "TEL";

	public static final String COORDINATE_YCol = "COORDINATE_Y";

	public static final String COORDINATE_XCol = "COORDINATE_X";

	public static final String POST_CODECol = "POST_CODE";

	public static final String PROVINCE_CODECol = "PROVINCE_CODE";

	public static final String DISTRICT_CODECol = "DISTRICT_CODE";

	public static final String SUBDISTRICT_CODECol = "SUBDISTRICT_CODE";

	public static final String ROADCol = "ROAD";

	public static final String SOICol = "SOI";

	public static final String MOOCol = "MOO";

	public static final String ADDRESS_NOCol = "ADDRESS_NO";

	public static final String ADDRESS_NAMECol = "ADDRESS_NAME";

	public static final String CAREERCol = "CAREER";

	public static final String NATION_IDCol = "NATION_ID";

	public static final String RACE_IDCol = "RACE_ID";

	public static final String RELIGION_IDCol = "RELIGION_ID";

	public static final String BLOOD_TYPECol = "BLOOD_TYPE";

	public static final String MARITAL_STATUSCol = "MARITAL_STATUS";

	public static final String SEXCol = "SEX";

	public static final String BIRTH_DATECol = "BIRTH_DATE";

	public static final String HEIGHTCol = "HEIGHT";

	public static final String OTHER_NAMECol = "OTHER_NAME";

	public static final String LAST_NAMECol = "LAST_NAME";

	public static final String MIDDLE_NAMECol = "MIDDLE_NAME";

	public static final String FIRST_NAMECol = "FIRST_NAME";

	public static final String TITLE_CODECol = "TITLE_CODE";

	public static final String SUSPECT_PASSPORTCol = "SUSPECT_PASSPORT";

	public static final String SUSPECT_ID_CARDCol = "SUSPECT_ID_CARD";

	public static final String SUSPECT_TYPECol = "SUSPECT_TYPE";

	public static final String SUSPECT_NOCol = "SUSPECT_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String PASSPORT_COUNTRYColumn = "SUSPECT.PASSPORT_COUNTRY";

	public static final String DEL_FLAGColumn = "SUSPECT.DEL_FLAG";

	public static final String OFFCODEColumn = "SUSPECT.OFFCODE";

	public static final String MIME_TYPEColumn = "SUSPECT.MIME_TYPE";

	public static final String UPDATE_DATEColumn = "SUSPECT.UPDATE_DATE";

	public static final String UPDATE_IDColumn = "SUSPECT.UPDATE_ID";

	public static final String LINK_PHOTOColumn = "SUSPECT.LINK_PHOTO";

	public static final String LICENSE_DATE_TOColumn = "SUSPECT.LICENSE_DATE_TO";

	public static final String LICENSE_DATE_FROMColumn = "SUSPECT.LICENSE_DATE_FROM";

	public static final String COMPANY_NAMEColumn = "SUSPECT.COMPANY_NAME";

	public static final String TITLE_CODE_COMPANYColumn = "SUSPECT.TITLE_CODE_COMPANY";

	public static final String PHOTO_DESCColumn = "SUSPECT.PHOTO_DESC";

	public static final String MOBILEColumn = "SUSPECT.MOBILE";

	public static final String COUNTRY_CODEColumn = "SUSPECT.COUNTRY_CODE";

	public static final String DATE_OUTColumn = "SUSPECT.DATE_OUT";

	public static final String DATE_INColumn = "SUSPECT.DATE_IN";

	public static final String VISA_TYPEColumn = "SUSPECT.VISA_TYPE";

	public static final String CREATE_DATEColumn = "SUSPECT.CREATE_DATE";

	public static final String CREATE_IDColumn = "SUSPECT.CREATE_ID";

	public static final String DESCRIPTIONColumn = "SUSPECT.DESCRIPTION";

	public static final String LICENSE_NOColumn = "SUSPECT.LICENSE_NO";

	public static final String CORPORATION_CODEColumn = "SUSPECT.CORPORATION_CODE";

	public static final String EXCISE_REG_NOColumn = "SUSPECT.EXCISE_REG_NO";

	public static final String TAX_ID_NOColumn = "SUSPECT.TAX_ID_NO";

	public static final String EMAILColumn = "SUSPECT.EMAIL";

	public static final String TELColumn = "SUSPECT.TEL";

	public static final String COORDINATE_YColumn = "SUSPECT.COORDINATE_Y";

	public static final String COORDINATE_XColumn = "SUSPECT.COORDINATE_X";

	public static final String POST_CODEColumn = "SUSPECT.POST_CODE";

	public static final String PROVINCE_CODEColumn = "SUSPECT.PROVINCE_CODE";

	public static final String DISTRICT_CODEColumn = "SUSPECT.DISTRICT_CODE";

	public static final String SUBDISTRICT_CODEColumn = "SUSPECT.SUBDISTRICT_CODE";

	public static final String ROADColumn = "SUSPECT.ROAD";

	public static final String SOIColumn = "SUSPECT.SOI";

	public static final String MOOColumn = "SUSPECT.MOO";

	public static final String ADDRESS_NOColumn = "SUSPECT.ADDRESS_NO";

	public static final String ADDRESS_NAMEColumn = "SUSPECT.ADDRESS_NAME";

	public static final String CAREERColumn = "SUSPECT.CAREER";

	public static final String NATION_IDColumn = "SUSPECT.NATION_ID";

	public static final String RACE_IDColumn = "SUSPECT.RACE_ID";

	public static final String RELIGION_IDColumn = "SUSPECT.RELIGION_ID";

	public static final String BLOOD_TYPEColumn = "SUSPECT.BLOOD_TYPE";

	public static final String MARITAL_STATUSColumn = "SUSPECT.MARITAL_STATUS";

	public static final String SEXColumn = "SUSPECT.SEX";

	public static final String BIRTH_DATEColumn = "SUSPECT.BIRTH_DATE";

	public static final String HEIGHTColumn = "SUSPECT.HEIGHT";

	public static final String OTHER_NAMEColumn = "SUSPECT.OTHER_NAME";

	public static final String LAST_NAMEColumn = "SUSPECT.LAST_NAME";

	public static final String MIDDLE_NAMEColumn = "SUSPECT.MIDDLE_NAME";

	public static final String FIRST_NAMEColumn = "SUSPECT.FIRST_NAME";

	public static final String TITLE_CODEColumn = "SUSPECT.TITLE_CODE";

	public static final String SUSPECT_PASSPORTColumn = "SUSPECT.SUSPECT_PASSPORT";

	public static final String SUSPECT_ID_CARDColumn = "SUSPECT.SUSPECT_ID_CARD";

	public static final String SUSPECT_TYPEColumn = "SUSPECT.SUSPECT_TYPE";

	public static final String SUSPECT_NOColumn = "SUSPECT.SUSPECT_NO";

	public static final String IDColumn = "SUSPECT.ID";


	public static final String[] ALL_COLUMNS =
    {
	 PASSPORT_COUNTRYCol	, DEL_FLAGCol	, OFFCODECol	, MIME_TYPECol	, UPDATE_DATECol	, UPDATE_IDCol	, LINK_PHOTOCol	, LICENSE_DATE_TOCol	, LICENSE_DATE_FROMCol	, COMPANY_NAMECol	, TITLE_CODE_COMPANYCol	, PHOTO_DESCCol	, MOBILECol	, COUNTRY_CODECol	, DATE_OUTCol	, DATE_INCol	, VISA_TYPECol	, CREATE_DATECol	, CREATE_IDCol	, DESCRIPTIONCol	, LICENSE_NOCol	, CORPORATION_CODECol	, EXCISE_REG_NOCol	, TAX_ID_NOCol	, EMAILCol	, TELCol	, COORDINATE_YCol	, COORDINATE_XCol	, POST_CODECol	, PROVINCE_CODECol	, DISTRICT_CODECol	, SUBDISTRICT_CODECol	, ROADCol	, SOICol	, MOOCol	, ADDRESS_NOCol	, ADDRESS_NAMECol	, CAREERCol	, NATION_IDCol	, RACE_IDCol	, RELIGION_IDCol	, BLOOD_TYPECol	, MARITAL_STATUSCol	, SEXCol	, BIRTH_DATECol	, HEIGHTCol	, OTHER_NAMECol	, LAST_NAMECol	, MIDDLE_NAMECol	, FIRST_NAMECol	, TITLE_CODECol	, SUSPECT_PASSPORTCol	, SUSPECT_ID_CARDCol	, SUSPECT_TYPECol	, SUSPECT_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  PASSPORT_COUNTRYCol	+","+ DEL_FLAGCol	+","+ OFFCODECol	+","+ MIME_TYPECol	+","+ UPDATE_DATECol	+","+ UPDATE_IDCol	+","+ LINK_PHOTOCol	+","+ LICENSE_DATE_TOCol	+","+ LICENSE_DATE_FROMCol	+","+ COMPANY_NAMECol	+","+ TITLE_CODE_COMPANYCol	+","+ PHOTO_DESCCol	+","+ MOBILECol	+","+ COUNTRY_CODECol	+","+ DATE_OUTCol	+","+ DATE_INCol	+","+ VISA_TYPECol	+","+ CREATE_DATECol	+","+ CREATE_IDCol	+","+ DESCRIPTIONCol	+","+ LICENSE_NOCol	+","+ CORPORATION_CODECol	+","+ EXCISE_REG_NOCol	+","+ TAX_ID_NOCol	+","+ EMAILCol	+","+ TELCol	+","+ COORDINATE_YCol	+","+ COORDINATE_XCol	+","+ POST_CODECol	+","+ PROVINCE_CODECol	+","+ DISTRICT_CODECol	+","+ SUBDISTRICT_CODECol	+","+ ROADCol	+","+ SOICol	+","+ MOOCol	+","+ ADDRESS_NOCol	+","+ ADDRESS_NAMECol	+","+ CAREERCol	+","+ NATION_IDCol	+","+ RACE_IDCol	+","+ RELIGION_IDCol	+","+ BLOOD_TYPECol	+","+ MARITAL_STATUSCol	+","+ SEXCol	+","+ BIRTH_DATECol	+","+ HEIGHTCol	+","+ OTHER_NAMECol	+","+ LAST_NAMECol	+","+ MIDDLE_NAMECol	+","+ FIRST_NAMECol	+","+ TITLE_CODECol	+","+ SUSPECT_PASSPORTCol	+","+ SUSPECT_ID_CARDCol	+","+ SUSPECT_TYPECol	+","+ SUSPECT_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+PASSPORT_COUNTRYCol+"=?,"+DEL_FLAGCol+"=?,"+OFFCODECol+"=?,"+MIME_TYPECol+"=?,"+UPDATE_DATECol+"=?,"+UPDATE_IDCol+"=?,"+LINK_PHOTOCol+"=?,"+LICENSE_DATE_TOCol+"=?,"+LICENSE_DATE_FROMCol+"=?,"+COMPANY_NAMECol+"=?,"+TITLE_CODE_COMPANYCol+"=?,"+PHOTO_DESCCol+"=?,"+MOBILECol+"=?,"+COUNTRY_CODECol+"=?,"+DATE_OUTCol+"=?,"+DATE_INCol+"=?,"+VISA_TYPECol+"=?,"+CREATE_DATECol+"=?,"+CREATE_IDCol+"=?,"+DESCRIPTIONCol+"=?,"+LICENSE_NOCol+"=?,"+CORPORATION_CODECol+"=?,"+EXCISE_REG_NOCol+"=?,"+TAX_ID_NOCol+"=?,"+EMAILCol+"=?,"+TELCol+"=?,"+COORDINATE_YCol+"=?,"+COORDINATE_XCol+"=?,"+POST_CODECol+"=?,"+PROVINCE_CODECol+"=?,"+DISTRICT_CODECol+"=?,"+SUBDISTRICT_CODECol+"=?,"+ROADCol+"=?,"+SOICol+"=?,"+MOOCol+"=?,"+ADDRESS_NOCol+"=?,"+ADDRESS_NAMECol+"=?,"+CAREERCol+"=?,"+NATION_IDCol+"=?,"+RACE_IDCol+"=?,"+RELIGION_IDCol+"=?,"+BLOOD_TYPECol+"=?,"+MARITAL_STATUSCol+"=?,"+SEXCol+"=?,"+BIRTH_DATECol+"=?,"+HEIGHTCol+"=?,"+OTHER_NAMECol+"=?,"+LAST_NAMECol+"=?,"+MIDDLE_NAMECol+"=?,"+FIRST_NAMECol+"=?,"+TITLE_CODECol+"=?,"+SUSPECT_PASSPORTCol+"=?,"+SUSPECT_ID_CARDCol+"=?,"+SUSPECT_TYPECol+"=?,"+SUSPECT_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseSuspect(DB db){
		super(db);
	}



public synchronized Suspect create() throws Exception{
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
					return (Suspect)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Suspect> createList(List<Suspect> objList)throws Exception{
    	DB db = this.initDB();
    	List<Suspect> resultList = new ArrayList<Suspect>();
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
	public Suspect findByPk(Long id)throws Exception{
		List<Suspect> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<Suspect> findByPks(List<Long> ids)throws Exception{
		List<Suspect> resultList = new ArrayList<Suspect>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<Suspect> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<Suspect> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<Suspect> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<Suspect> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<Suspect> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<Suspect> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<Suspect> resultList = new ArrayList<Suspect>();
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
	public List<Suspect> findByExample(Suspect instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<Suspect> findByExample(Suspect instance,PageUtil pageUtil) throws Exception{
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
	public Suspect update()throws Exception{
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
					return (Suspect)this;
			}else// not update
				return (Suspect)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Suspect> updateList(List<Suspect> objList)throws Exception{
		DB db = this.initDB();
		List<Suspect> resultList = new ArrayList<Suspect>();
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
	public Integer deleteList(List<Suspect> objList)throws Exception {
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
	public Suspect populate(ResultSet rs)throws Exception{
		Suspect result = new Suspect(this.db);
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
    private String passport_country;

    private String del_flag;

    private String offcode;

    private String mime_type;

    private java.util.Date update_date;

    private Long update_id;

    private java.sql.Blob link_photo;

    private java.util.Date license_date_to;

    private java.util.Date license_date_from;

    private String company_name;

    private String title_code_company;

    private String photo_desc;

    private String mobile;

    private String country_code;

    private java.util.Date date_out;

    private java.util.Date date_in;

    private String visa_type;

    private java.util.Date create_date;

    private Long create_id;

    private String description;

    private String license_no;

    private String corporation_code;

    private String excise_reg_no;

    private String tax_id_no;

    private String email;

    private String tel;

    private Double coordinate_y;

    private Double coordinate_x;

    private String post_code;

    private String province_code;

    private String district_code;

    private String subdistrict_code;

    private String road;

    private String soi;

    private Long moo;

    private String address_no;

    private String address_name;

    private String career;

    private Long nation_id;

    private Long race_id;

    private Long religion_id;

    private String blood_type;

    private String marital_status;

    private String sex;

    private java.util.Date birth_date;

    private Long height;

    private String other_name;

    private String last_name;

    private String middle_name;

    private String first_name;

    private String title_code;

    private String suspect_passport;

    private String suspect_id_card;

    private String suspect_type;

    private Long suspect_no;

    private Long id;

	//**** getter setter ****//
	public String getPassport_country()
    {
        return passport_country;
    }
    public void setPassport_country(String passport_country)
    {
        this.passport_country = passport_country;
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

	public String getMime_type()
    {
        return mime_type;
    }
    public void setMime_type(String mime_type)
    {
        this.mime_type = mime_type;
    }

	public java.util.Date getUpdate_date()
    {
        return update_date;
    }
    public void setUpdate_date(java.util.Date update_date)
    {
        this.update_date = update_date;
    }

	public Long getUpdate_id()
    {
        return update_id;
    }
    public void setUpdate_id(Long update_id)
    {
        this.update_id = update_id;
    }

	public java.sql.Blob getLink_photo()
    {
        return link_photo;
    }
    public void setLink_photo(java.sql.Blob link_photo)
    {
        this.link_photo = link_photo;
    }

	public java.util.Date getLicense_date_to()
    {
        return license_date_to;
    }
    public void setLicense_date_to(java.util.Date license_date_to)
    {
        this.license_date_to = license_date_to;
    }

	public java.util.Date getLicense_date_from()
    {
        return license_date_from;
    }
    public void setLicense_date_from(java.util.Date license_date_from)
    {
        this.license_date_from = license_date_from;
    }

	public String getCompany_name()
    {
        return company_name;
    }
    public void setCompany_name(String company_name)
    {
        this.company_name = company_name;
    }

	public String getTitle_code_company()
    {
        return title_code_company;
    }
    public void setTitle_code_company(String title_code_company)
    {
        this.title_code_company = title_code_company;
    }

	public String getPhoto_desc()
    {
        return photo_desc;
    }
    public void setPhoto_desc(String photo_desc)
    {
        this.photo_desc = photo_desc;
    }

	public String getMobile()
    {
        return mobile;
    }
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

	public String getCountry_code()
    {
        return country_code;
    }
    public void setCountry_code(String country_code)
    {
        this.country_code = country_code;
    }

	public java.util.Date getDate_out()
    {
        return date_out;
    }
    public void setDate_out(java.util.Date date_out)
    {
        this.date_out = date_out;
    }

	public java.util.Date getDate_in()
    {
        return date_in;
    }
    public void setDate_in(java.util.Date date_in)
    {
        this.date_in = date_in;
    }

	public String getVisa_type()
    {
        return visa_type;
    }
    public void setVisa_type(String visa_type)
    {
        this.visa_type = visa_type;
    }

	public java.util.Date getCreate_date()
    {
        return create_date;
    }
    public void setCreate_date(java.util.Date create_date)
    {
        this.create_date = create_date;
    }

	public Long getCreate_id()
    {
        return create_id;
    }
    public void setCreate_id(Long create_id)
    {
        this.create_id = create_id;
    }

	public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

	public String getLicense_no()
    {
        return license_no;
    }
    public void setLicense_no(String license_no)
    {
        this.license_no = license_no;
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

	public String getTax_id_no()
    {
        return tax_id_no;
    }
    public void setTax_id_no(String tax_id_no)
    {
        this.tax_id_no = tax_id_no;
    }

	public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

	public String getTel()
    {
        return tel;
    }
    public void setTel(String tel)
    {
        this.tel = tel;
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

	public String getPost_code()
    {
        return post_code;
    }
    public void setPost_code(String post_code)
    {
        this.post_code = post_code;
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

	public Long getMoo()
    {
        return moo;
    }
    public void setMoo(Long moo)
    {
        this.moo = moo;
    }

	public String getAddress_no()
    {
        return address_no;
    }
    public void setAddress_no(String address_no)
    {
        this.address_no = address_no;
    }

	public String getAddress_name()
    {
        return address_name;
    }
    public void setAddress_name(String address_name)
    {
        this.address_name = address_name;
    }

	public String getCareer()
    {
        return career;
    }
    public void setCareer(String career)
    {
        this.career = career;
    }

	public Long getNation_id()
    {
        return nation_id;
    }
    public void setNation_id(Long nation_id)
    {
        this.nation_id = nation_id;
    }

	public Long getRace_id()
    {
        return race_id;
    }
    public void setRace_id(Long race_id)
    {
        this.race_id = race_id;
    }

	public Long getReligion_id()
    {
        return religion_id;
    }
    public void setReligion_id(Long religion_id)
    {
        this.religion_id = religion_id;
    }

	public String getBlood_type()
    {
        return blood_type;
    }
    public void setBlood_type(String blood_type)
    {
        this.blood_type = blood_type;
    }

	public String getMarital_status()
    {
        return marital_status;
    }
    public void setMarital_status(String marital_status)
    {
        this.marital_status = marital_status;
    }

	public String getSex()
    {
        return sex;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

	public java.util.Date getBirth_date()
    {
        return birth_date;
    }
    public void setBirth_date(java.util.Date birth_date)
    {
        this.birth_date = birth_date;
    }

	public Long getHeight()
    {
        return height;
    }
    public void setHeight(Long height)
    {
        this.height = height;
    }

	public String getOther_name()
    {
        return other_name;
    }
    public void setOther_name(String other_name)
    {
        this.other_name = other_name;
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

	public String getTitle_code()
    {
        return title_code;
    }
    public void setTitle_code(String title_code)
    {
        this.title_code = title_code;
    }

	public String getSuspect_passport()
    {
        return suspect_passport;
    }
    public void setSuspect_passport(String suspect_passport)
    {
        this.suspect_passport = suspect_passport;
    }

	public String getSuspect_id_card()
    {
        return suspect_id_card;
    }
    public void setSuspect_id_card(String suspect_id_card)
    {
        this.suspect_id_card = suspect_id_card;
    }

	public String getSuspect_type()
    {
        return suspect_type;
    }
    public void setSuspect_type(String suspect_type)
    {
        this.suspect_type = suspect_type;
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