








 

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

import com.ko.domain.ApplicationSincereConfirm;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationSincereConfirm extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_SINCERE_CONFIRM";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_SINCERE_CONFIRM.ID";

	// short name column
	public static final String OFFNAMECol = "OFFNAME";

	public static final String OFFCODECol = "OFFCODE";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String DETECT_RESULTCol = "DETECT_RESULT";

	public static final String STORE_BYCol = "STORE_BY";

	public static final String STORE_PLACECol = "STORE_PLACE";

	public static final String OWNER_BYCol = "OWNER_BY";

	public static final String OWNER_NAMECol = "OWNER_NAME";

	public static final String TELCol = "TEL";

	public static final String ZIPCODECol = "ZIPCODE";

	public static final String SUBDISTRICT_CODECol = "SUBDISTRICT_CODE";

	public static final String DISTRICT_CODECol = "DISTRICT_CODE";

	public static final String PROVINCE_CODECol = "PROVINCE_CODE";

	public static final String ROADCol = "ROAD";

	public static final String SOICol = "SOI";

	public static final String MOOCol = "MOO";

	public static final String ADDRESS_NOCol = "ADDRESS_NO";

	public static final String ADDRESS_NAMECol = "ADDRESS_NAME";

	public static final String COORDINATE_YCol = "COORDINATE_Y";

	public static final String COORDINATE_XCol = "COORDINATE_X";

	public static final String OFFCODE_DETECTCol = "OFFCODE_DETECT";

	public static final String POSCODE_DETECTCol = "POSCODE_DETECT";

	public static final String STAFF_IDCARDNO_DETECTCol = "STAFF_IDCARDNO_DETECT";

	public static final String NOTICE_DATECol = "NOTICE_DATE";

	public static final String DETECT_DATECol = "DETECT_DATE";

	public static final String INPUT_DATECol = "INPUT_DATE";

	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String OFFNAMEColumn = "APPLICATION_SINCERE_CONFIRM.OFFNAME";

	public static final String OFFCODEColumn = "APPLICATION_SINCERE_CONFIRM.OFFCODE";

	public static final String UPDATE_ONColumn = "APPLICATION_SINCERE_CONFIRM.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_SINCERE_CONFIRM.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_SINCERE_CONFIRM.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_SINCERE_CONFIRM.CREATE_BY";

	public static final String DETECT_RESULTColumn = "APPLICATION_SINCERE_CONFIRM.DETECT_RESULT";

	public static final String STORE_BYColumn = "APPLICATION_SINCERE_CONFIRM.STORE_BY";

	public static final String STORE_PLACEColumn = "APPLICATION_SINCERE_CONFIRM.STORE_PLACE";

	public static final String OWNER_BYColumn = "APPLICATION_SINCERE_CONFIRM.OWNER_BY";

	public static final String OWNER_NAMEColumn = "APPLICATION_SINCERE_CONFIRM.OWNER_NAME";

	public static final String TELColumn = "APPLICATION_SINCERE_CONFIRM.TEL";

	public static final String ZIPCODEColumn = "APPLICATION_SINCERE_CONFIRM.ZIPCODE";

	public static final String SUBDISTRICT_CODEColumn = "APPLICATION_SINCERE_CONFIRM.SUBDISTRICT_CODE";

	public static final String DISTRICT_CODEColumn = "APPLICATION_SINCERE_CONFIRM.DISTRICT_CODE";

	public static final String PROVINCE_CODEColumn = "APPLICATION_SINCERE_CONFIRM.PROVINCE_CODE";

	public static final String ROADColumn = "APPLICATION_SINCERE_CONFIRM.ROAD";

	public static final String SOIColumn = "APPLICATION_SINCERE_CONFIRM.SOI";

	public static final String MOOColumn = "APPLICATION_SINCERE_CONFIRM.MOO";

	public static final String ADDRESS_NOColumn = "APPLICATION_SINCERE_CONFIRM.ADDRESS_NO";

	public static final String ADDRESS_NAMEColumn = "APPLICATION_SINCERE_CONFIRM.ADDRESS_NAME";

	public static final String COORDINATE_YColumn = "APPLICATION_SINCERE_CONFIRM.COORDINATE_Y";

	public static final String COORDINATE_XColumn = "APPLICATION_SINCERE_CONFIRM.COORDINATE_X";

	public static final String OFFCODE_DETECTColumn = "APPLICATION_SINCERE_CONFIRM.OFFCODE_DETECT";

	public static final String POSCODE_DETECTColumn = "APPLICATION_SINCERE_CONFIRM.POSCODE_DETECT";

	public static final String STAFF_IDCARDNO_DETECTColumn = "APPLICATION_SINCERE_CONFIRM.STAFF_IDCARDNO_DETECT";

	public static final String NOTICE_DATEColumn = "APPLICATION_SINCERE_CONFIRM.NOTICE_DATE";

	public static final String DETECT_DATEColumn = "APPLICATION_SINCERE_CONFIRM.DETECT_DATE";

	public static final String INPUT_DATEColumn = "APPLICATION_SINCERE_CONFIRM.INPUT_DATE";

	public static final String TRACK_NOColumn = "APPLICATION_SINCERE_CONFIRM.TRACK_NO";

	public static final String IDColumn = "APPLICATION_SINCERE_CONFIRM.ID";


	public static final String[] ALL_COLUMNS =
    {
	 OFFNAMECol	, OFFCODECol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, DETECT_RESULTCol	, STORE_BYCol	, STORE_PLACECol	, OWNER_BYCol	, OWNER_NAMECol	, TELCol	, ZIPCODECol	, SUBDISTRICT_CODECol	, DISTRICT_CODECol	, PROVINCE_CODECol	, ROADCol	, SOICol	, MOOCol	, ADDRESS_NOCol	, ADDRESS_NAMECol	, COORDINATE_YCol	, COORDINATE_XCol	, OFFCODE_DETECTCol	, POSCODE_DETECTCol	, STAFF_IDCARDNO_DETECTCol	, NOTICE_DATECol	, DETECT_DATECol	, INPUT_DATECol	, TRACK_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  OFFNAMECol	+","+ OFFCODECol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ DETECT_RESULTCol	+","+ STORE_BYCol	+","+ STORE_PLACECol	+","+ OWNER_BYCol	+","+ OWNER_NAMECol	+","+ TELCol	+","+ ZIPCODECol	+","+ SUBDISTRICT_CODECol	+","+ DISTRICT_CODECol	+","+ PROVINCE_CODECol	+","+ ROADCol	+","+ SOICol	+","+ MOOCol	+","+ ADDRESS_NOCol	+","+ ADDRESS_NAMECol	+","+ COORDINATE_YCol	+","+ COORDINATE_XCol	+","+ OFFCODE_DETECTCol	+","+ POSCODE_DETECTCol	+","+ STAFF_IDCARDNO_DETECTCol	+","+ NOTICE_DATECol	+","+ DETECT_DATECol	+","+ INPUT_DATECol	+","+ TRACK_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+OFFNAMECol+"=?,"+OFFCODECol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+DETECT_RESULTCol+"=?,"+STORE_BYCol+"=?,"+STORE_PLACECol+"=?,"+OWNER_BYCol+"=?,"+OWNER_NAMECol+"=?,"+TELCol+"=?,"+ZIPCODECol+"=?,"+SUBDISTRICT_CODECol+"=?,"+DISTRICT_CODECol+"=?,"+PROVINCE_CODECol+"=?,"+ROADCol+"=?,"+SOICol+"=?,"+MOOCol+"=?,"+ADDRESS_NOCol+"=?,"+ADDRESS_NAMECol+"=?,"+COORDINATE_YCol+"=?,"+COORDINATE_XCol+"=?,"+OFFCODE_DETECTCol+"=?,"+POSCODE_DETECTCol+"=?,"+STAFF_IDCARDNO_DETECTCol+"=?,"+NOTICE_DATECol+"=?,"+DETECT_DATECol+"=?,"+INPUT_DATECol+"=?,"+TRACK_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationSincereConfirm(DB db){
		super(db);
	}



public synchronized ApplicationSincereConfirm create() throws Exception{
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
					return (ApplicationSincereConfirm)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationSincereConfirm> createList(List<ApplicationSincereConfirm> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationSincereConfirm> resultList = new ArrayList<ApplicationSincereConfirm>();
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
	public ApplicationSincereConfirm findByPk(Long id)throws Exception{
		List<ApplicationSincereConfirm> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationSincereConfirm> findByPks(List<Long> ids)throws Exception{
		List<ApplicationSincereConfirm> resultList = new ArrayList<ApplicationSincereConfirm>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationSincereConfirm> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationSincereConfirm> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationSincereConfirm> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationSincereConfirm> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationSincereConfirm> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationSincereConfirm> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationSincereConfirm> resultList = new ArrayList<ApplicationSincereConfirm>();
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
	public List<ApplicationSincereConfirm> findByExample(ApplicationSincereConfirm instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationSincereConfirm> findByExample(ApplicationSincereConfirm instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationSincereConfirm update()throws Exception{
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
					return (ApplicationSincereConfirm)this;
			}else// not update
				return (ApplicationSincereConfirm)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationSincereConfirm> updateList(List<ApplicationSincereConfirm> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationSincereConfirm> resultList = new ArrayList<ApplicationSincereConfirm>();
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
	public Integer deleteList(List<ApplicationSincereConfirm> objList)throws Exception {
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
	public ApplicationSincereConfirm populate(ResultSet rs)throws Exception{
		ApplicationSincereConfirm result = new ApplicationSincereConfirm(this.db);
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
    private String offname;

    private String offcode;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String detect_result;

    private String store_by;

    private String store_place;

    private String owner_by;

    private String owner_name;

    private String tel;

    private String zipcode;

    private String subdistrict_code;

    private String district_code;

    private String province_code;

    private String road;

    private String soi;

    private Long moo;

    private String address_no;

    private String address_name;

    private Double coordinate_y;

    private Double coordinate_x;

    private String offcode_detect;

    private String poscode_detect;

    private String staff_idcardno_detect;

    private java.util.Date notice_date;

    private java.util.Date detect_date;

    private java.util.Date input_date;

    private String track_no;

    private Long id;

	//**** getter setter ****//
	public String getOffname()
    {
        return offname;
    }
    public void setOffname(String offname)
    {
        this.offname = offname;
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

	public String getDetect_result()
    {
        return detect_result;
    }
    public void setDetect_result(String detect_result)
    {
        this.detect_result = detect_result;
    }

	public String getStore_by()
    {
        return store_by;
    }
    public void setStore_by(String store_by)
    {
        this.store_by = store_by;
    }

	public String getStore_place()
    {
        return store_place;
    }
    public void setStore_place(String store_place)
    {
        this.store_place = store_place;
    }

	public String getOwner_by()
    {
        return owner_by;
    }
    public void setOwner_by(String owner_by)
    {
        this.owner_by = owner_by;
    }

	public String getOwner_name()
    {
        return owner_name;
    }
    public void setOwner_name(String owner_name)
    {
        this.owner_name = owner_name;
    }

	public String getTel()
    {
        return tel;
    }
    public void setTel(String tel)
    {
        this.tel = tel;
    }

	public String getZipcode()
    {
        return zipcode;
    }
    public void setZipcode(String zipcode)
    {
        this.zipcode = zipcode;
    }

	public String getSubdistrict_code()
    {
        return subdistrict_code;
    }
    public void setSubdistrict_code(String subdistrict_code)
    {
        this.subdistrict_code = subdistrict_code;
    }

	public String getDistrict_code()
    {
        return district_code;
    }
    public void setDistrict_code(String district_code)
    {
        this.district_code = district_code;
    }

	public String getProvince_code()
    {
        return province_code;
    }
    public void setProvince_code(String province_code)
    {
        this.province_code = province_code;
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

	public String getOffcode_detect()
    {
        return offcode_detect;
    }
    public void setOffcode_detect(String offcode_detect)
    {
        this.offcode_detect = offcode_detect;
    }

	public String getPoscode_detect()
    {
        return poscode_detect;
    }
    public void setPoscode_detect(String poscode_detect)
    {
        this.poscode_detect = poscode_detect;
    }

	public String getStaff_idcardno_detect()
    {
        return staff_idcardno_detect;
    }
    public void setStaff_idcardno_detect(String staff_idcardno_detect)
    {
        this.staff_idcardno_detect = staff_idcardno_detect;
    }

	public java.util.Date getNotice_date()
    {
        return notice_date;
    }
    public void setNotice_date(java.util.Date notice_date)
    {
        this.notice_date = notice_date;
    }

	public java.util.Date getDetect_date()
    {
        return detect_date;
    }
    public void setDetect_date(java.util.Date detect_date)
    {
        this.detect_date = detect_date;
    }

	public java.util.Date getInput_date()
    {
        return input_date;
    }
    public void setInput_date(java.util.Date input_date)
    {
        this.input_date = input_date;
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