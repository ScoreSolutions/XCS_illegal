








 

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

import com.ko.domain.ApplicationInvest;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationInvest extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_INVEST";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_INVEST.ID";

	// short name column
	public static final String POSNAME_COMMANDCol = "POSNAME_COMMAND";
	
	public static final String NEWS_VALUECol = "NEWS_VALUE";

	public static final String CONFIDENCE_GAUGECol = "CONFIDENCE_GAUGE";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String INVEST_DESCCol = "INVEST_DESC";

	public static final String SUBDISTRICT_CODECol = "SUBDISTRICT_CODE";

	public static final String MAP_DESCCol = "MAP_DESC";

	public static final String MAP_PICTURECol = "MAP_PICTURE";

	public static final String TELCol = "TEL";

	public static final String ZIPCODECol = "ZIPCODE";

	public static final String DISTRICT_CODECol = "DISTRICT_CODE";

	public static final String PROVINCE_CODECol = "PROVINCE_CODE";

	public static final String ROADCol = "ROAD";

	public static final String SOICol = "SOI";

	public static final String MOOCol = "MOO";

	public static final String ADDRESS_NOCol = "ADDRESS_NO";

	public static final String ADDRESS_NAMECol = "ADDRESS_NAME";

	public static final String COORDINATE_YCol = "COORDINATE_Y";

	public static final String COORDINATE_XCol = "COORDINATE_X";

	public static final String END_DATECol = "END_DATE";

	public static final String START_DATECol = "START_DATE";

	public static final String PRODUCT_GROUP_IDCol = "PRODUCT_GROUP_ID";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String OFFCODE_COMMANDCol = "OFFCODE_COMMAND";

	public static final String POSCODE_COMMANDCol = "POSCODE_COMMAND";

	public static final String STAFF_IDCARDNO_COMMANDCol = "STAFF_IDCARDNO_COMMAND";

	public static final String OFFCODE_INVESTCol = "OFFCODE_INVEST";

	public static final String POSCODE_INVESTCol = "POSCODE_INVEST";

	public static final String STAFF_IDCARDNO_INVESTCol = "STAFF_IDCARDNO_INVEST";

	public static final String INVEST_NOCol = "INVEST_NO";

	public static final String REPORT_DATECol = "REPORT_DATE";

	public static final String INVEST_QTYCol = "INVEST_QTY";

	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String POSNAME_COMMANDColumn = "APPLICATION_INVEST.POSNAME_COMMAND";
	
	public static final String NEWS_VALUEColumn = "APPLICATION_INVEST.NEWS_VALUE";

	public static final String CONFIDENCE_GAUGEColumn = "APPLICATION_INVEST.CONFIDENCE_GAUGE";

	public static final String UPDATE_ONColumn = "APPLICATION_INVEST.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_INVEST.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_INVEST.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_INVEST.CREATE_BY";

	public static final String INVEST_DESCColumn = "APPLICATION_INVEST.INVEST_DESC";

	public static final String SUBDISTRICT_CODEColumn = "APPLICATION_INVEST.SUBDISTRICT_CODE";

	public static final String MAP_DESCColumn = "APPLICATION_INVEST.MAP_DESC";

	public static final String MAP_PICTUREColumn = "APPLICATION_INVEST.MAP_PICTURE";

	public static final String TELColumn = "APPLICATION_INVEST.TEL";

	public static final String ZIPCODEColumn = "APPLICATION_INVEST.ZIPCODE";

	public static final String DISTRICT_CODEColumn = "APPLICATION_INVEST.DISTRICT_CODE";

	public static final String PROVINCE_CODEColumn = "APPLICATION_INVEST.PROVINCE_CODE";

	public static final String ROADColumn = "APPLICATION_INVEST.ROAD";

	public static final String SOIColumn = "APPLICATION_INVEST.SOI";

	public static final String MOOColumn = "APPLICATION_INVEST.MOO";

	public static final String ADDRESS_NOColumn = "APPLICATION_INVEST.ADDRESS_NO";

	public static final String ADDRESS_NAMEColumn = "APPLICATION_INVEST.ADDRESS_NAME";

	public static final String COORDINATE_YColumn = "APPLICATION_INVEST.COORDINATE_Y";

	public static final String COORDINATE_XColumn = "APPLICATION_INVEST.COORDINATE_X";

	public static final String END_DATEColumn = "APPLICATION_INVEST.END_DATE";

	public static final String START_DATEColumn = "APPLICATION_INVEST.START_DATE";

	public static final String PRODUCT_GROUP_IDColumn = "APPLICATION_INVEST.PRODUCT_GROUP_ID";

	public static final String LEGISLATION_IDColumn = "APPLICATION_INVEST.LEGISLATION_ID";

	public static final String OFFCODE_COMMANDColumn = "APPLICATION_INVEST.OFFCODE_COMMAND";

	public static final String POSCODE_COMMANDColumn = "APPLICATION_INVEST.POSCODE_COMMAND";

	public static final String STAFF_IDCARDNO_COMMANDColumn = "APPLICATION_INVEST.STAFF_IDCARDNO_COMMAND";

	public static final String OFFCODE_INVESTColumn = "APPLICATION_INVEST.OFFCODE_INVEST";

	public static final String POSCODE_INVESTColumn = "APPLICATION_INVEST.POSCODE_INVEST";

	public static final String STAFF_IDCARDNO_INVESTColumn = "APPLICATION_INVEST.STAFF_IDCARDNO_INVEST";

	public static final String INVEST_NOColumn = "APPLICATION_INVEST.INVEST_NO";

	public static final String REPORT_DATEColumn = "APPLICATION_INVEST.REPORT_DATE";

	public static final String INVEST_QTYColumn = "APPLICATION_INVEST.INVEST_QTY";

	public static final String TRACK_NOColumn = "APPLICATION_INVEST.TRACK_NO";

	public static final String IDColumn = "APPLICATION_INVEST.ID";


	public static final String[] ALL_COLUMNS =
    {
	 POSNAME_COMMANDCol, NEWS_VALUECol	, CONFIDENCE_GAUGECol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, INVEST_DESCCol	, SUBDISTRICT_CODECol	, MAP_DESCCol	, MAP_PICTURECol	, TELCol	, ZIPCODECol	, DISTRICT_CODECol	, PROVINCE_CODECol	, ROADCol	, SOICol	, MOOCol	, ADDRESS_NOCol	, ADDRESS_NAMECol	, COORDINATE_YCol	, COORDINATE_XCol	, END_DATECol	, START_DATECol	, PRODUCT_GROUP_IDCol	, LEGISLATION_IDCol	, OFFCODE_COMMANDCol	, POSCODE_COMMANDCol	, STAFF_IDCARDNO_COMMANDCol	, OFFCODE_INVESTCol	, POSCODE_INVESTCol	, STAFF_IDCARDNO_INVESTCol	, INVEST_NOCol	, REPORT_DATECol	, INVEST_QTYCol	, TRACK_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  POSNAME_COMMANDCol + ", " + NEWS_VALUECol	+","+ CONFIDENCE_GAUGECol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ INVEST_DESCCol	+","+ SUBDISTRICT_CODECol	+","+ MAP_DESCCol	+","+ MAP_PICTURECol	+","+ TELCol	+","+ ZIPCODECol	+","+ DISTRICT_CODECol	+","+ PROVINCE_CODECol	+","+ ROADCol	+","+ SOICol	+","+ MOOCol	+","+ ADDRESS_NOCol	+","+ ADDRESS_NAMECol	+","+ COORDINATE_YCol	+","+ COORDINATE_XCol	+","+ END_DATECol	+","+ START_DATECol	+","+ PRODUCT_GROUP_IDCol	+","+ LEGISLATION_IDCol	+","+ OFFCODE_COMMANDCol	+","+ POSCODE_COMMANDCol	+","+ STAFF_IDCARDNO_COMMANDCol	+","+ OFFCODE_INVESTCol	+","+ POSCODE_INVESTCol	+","+ STAFF_IDCARDNO_INVESTCol	+","+ INVEST_NOCol	+","+ REPORT_DATECol	+","+ INVEST_QTYCol	+","+ TRACK_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+NEWS_VALUECol+"=?,"+CONFIDENCE_GAUGECol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+INVEST_DESCCol+"=?,"+SUBDISTRICT_CODECol+"=?,"+MAP_DESCCol+"=?,"+MAP_PICTURECol+"=?,"+TELCol+"=?,"+ZIPCODECol+"=?,"+DISTRICT_CODECol+"=?,"+PROVINCE_CODECol+"=?,"+ROADCol+"=?,"+SOICol+"=?,"+MOOCol+"=?,"+ADDRESS_NOCol+"=?,"+ADDRESS_NAMECol+"=?,"+COORDINATE_YCol+"=?,"+COORDINATE_XCol+"=?,"+END_DATECol+"=?,"+START_DATECol+"=?,"+PRODUCT_GROUP_IDCol+"=?,"+LEGISLATION_IDCol+"=?,"+OFFCODE_COMMANDCol+"=?,"+POSCODE_COMMANDCol+"=?,"+STAFF_IDCARDNO_COMMANDCol+"=?,"+OFFCODE_INVESTCol+"=?,"+POSCODE_INVESTCol+"=?,"+STAFF_IDCARDNO_INVESTCol+"=?,"+INVEST_NOCol+"=?,"+REPORT_DATECol+"=?,"+INVEST_QTYCol+"=?,"+TRACK_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationInvest(DB db){
		super(db);
	}



public synchronized ApplicationInvest create() throws Exception{
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
					return (ApplicationInvest)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationInvest> createList(List<ApplicationInvest> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationInvest> resultList = new ArrayList<ApplicationInvest>();
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
	public ApplicationInvest findByPk(Long id)throws Exception{
		List<ApplicationInvest> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationInvest> findByPks(List<Long> ids)throws Exception{
		List<ApplicationInvest> resultList = new ArrayList<ApplicationInvest>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationInvest> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationInvest> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationInvest> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationInvest> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationInvest> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationInvest> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationInvest> resultList = new ArrayList<ApplicationInvest>();
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
	public List<ApplicationInvest> findByExample(ApplicationInvest instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationInvest> findByExample(ApplicationInvest instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationInvest update()throws Exception{
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
					return (ApplicationInvest)this;
			}else// not update
				return (ApplicationInvest)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationInvest> updateList(List<ApplicationInvest> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationInvest> resultList = new ArrayList<ApplicationInvest>();
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
	public Integer deleteList(List<ApplicationInvest> objList)throws Exception {
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
	public ApplicationInvest populate(ResultSet rs)throws Exception{
		ApplicationInvest result = new ApplicationInvest(this.db);
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
    private String posname_command;
    
    private String news_value;

    private String confidence_gauge;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String invest_desc;

    private String subdistrict_code;

    private String map_desc;

    private java.sql.Blob map_picture;

    private String tel;

    private String zipcode;

    private String district_code;

    private String province_code;

    private String road;

    private String soi;

    private Long moo;

    private String address_no;

    private String address_name;

    private Double coordinate_y;

    private Double coordinate_x;

    private java.util.Date end_date;

    private java.util.Date start_date;

    private String product_group_id;

    private Long legislation_id;

    private String offcode_command;

    private String poscode_command;

    private String staff_idcardno_command;

    private String offcode_invest;

    private String poscode_invest;

    private String staff_idcardno_invest;

    private String invest_no;

    private java.util.Date report_date;

    private Long invest_qty;

    private String track_no;

    private Long id;

	//**** getter setter ****//
    public String getPosname_command(){
    	return posname_command;
    }
    public void setPosname_command(String value){
    	posname_command = value;
    }
    
	public String getNews_value()
    {
        return news_value;
    }
    public void setNews_value(String news_value)
    {
        this.news_value = news_value;
    }

	public String getConfidence_gauge()
    {
        return confidence_gauge;
    }
    public void setConfidence_gauge(String confidence_gauge)
    {
        this.confidence_gauge = confidence_gauge;
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

	public String getInvest_desc()
    {
        return invest_desc;
    }
    public void setInvest_desc(String invest_desc)
    {
        this.invest_desc = invest_desc;
    }

	public String getSubdistrict_code()
    {
        return subdistrict_code;
    }
    public void setSubdistrict_code(String subdistrict_code)
    {
        this.subdistrict_code = subdistrict_code;
    }

	public String getMap_desc()
    {
        return map_desc;
    }
    public void setMap_desc(String map_desc)
    {
        this.map_desc = map_desc;
    }

	public java.sql.Blob getMap_picture()
    {
        return map_picture;
    }
    public void setMap_picture(java.sql.Blob map_picture)
    {
        this.map_picture = map_picture;
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

	public String getProduct_group_id()
    {
        return product_group_id;
    }
    public void setProduct_group_id(String product_group_id)
    {
        this.product_group_id = product_group_id;
    }

	public Long getLegislation_id()
    {
        return legislation_id;
    }
    public void setLegislation_id(Long legislation_id)
    {
        this.legislation_id = legislation_id;
    }

	public String getOffcode_command()
    {
        return offcode_command;
    }
    public void setOffcode_command(String offcode_command)
    {
        this.offcode_command = offcode_command;
    }

	public String getPoscode_command()
    {
        return poscode_command;
    }
    public void setPoscode_command(String poscode_command)
    {
        this.poscode_command = poscode_command;
    }

	public String getStaff_idcardno_command()
    {
        return staff_idcardno_command;
    }
    public void setStaff_idcardno_command(String staff_idcardno_command)
    {
        this.staff_idcardno_command = staff_idcardno_command;
    }

	public String getOffcode_invest()
    {
        return offcode_invest;
    }
    public void setOffcode_invest(String offcode_invest)
    {
        this.offcode_invest = offcode_invest;
    }

	public String getPoscode_invest()
    {
        return poscode_invest;
    }
    public void setPoscode_invest(String poscode_invest)
    {
        this.poscode_invest = poscode_invest;
    }

	public String getStaff_idcardno_invest()
    {
        return staff_idcardno_invest;
    }
    public void setStaff_idcardno_invest(String staff_idcardno_invest)
    {
        this.staff_idcardno_invest = staff_idcardno_invest;
    }

	public String getInvest_no()
    {
        return invest_no;
    }
    public void setInvest_no(String invest_no)
    {
        this.invest_no = invest_no;
    }

	public java.util.Date getReport_date()
    {
        return report_date;
    }
    public void setReport_date(java.util.Date report_date)
    {
        this.report_date = report_date;
    }

	public Long getInvest_qty()
    {
        return invest_qty;
    }
    public void setInvest_qty(Long invest_qty)
    {
        this.invest_qty = invest_qty;
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