








 

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

import com.ko.domain.AppArrestProveExhibit;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseAppArrestProveExhibit extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APP_ARREST_PROVE_EXHIBIT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APP_ARREST_PROVE_EXHIBIT.ID";

	// short name column
	public static final String DUTY_NAMECol = "DUTY_NAME";
	
	public static final String GROUP_NAMECol = "GROUP_NAME";
	
	public static final String GROUP_IDCol = "GROUP_ID";
	
	public static final String NETWEIGHT_UNIT_NAMECol = "NETWEIGHT_UNIT_NAME";
	
	public static final String QTY_UNIT_NAMECol = "QTY_UNIT_NAME";
	
	public static final String SIZES_UNIT_NAMECol = "SIZES_UNIT_NAME";
	
	public static final String SIZES_DESCCol = "SIZES_DESC";
	
	public static final String BRAND_NAMECol = "BRAND_NAME";
	
	public static final String PRODUCT_NAMECol = "PRODUCT_NAME";
	
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String REMARKSCol = "REMARKS";

	public static final String APP_ARREST_PROVE_EXHIBIT_IDCol = "APP_ARREST_PROVE_EXHIBIT_ID";

	public static final String CAR_NOCol = "CAR_NO";

	public static final String EXHIBIT_DESCCol = "EXHIBIT_DESC";

	public static final String EXHIBIT_LISTCol = "EXHIBIT_LIST";

	public static final String STATUSCol = "STATUS";

	public static final String NETWEIGHT_UNIT_CODECol = "NETWEIGHT_UNIT_CODE";

	public static final String NETWEIGHTCol = "NETWEIGHT";

	public static final String QTY_UNIT_CODECol = "QTY_UNIT_CODE";

	public static final String QTYCol = "QTY";

	public static final String SIZE_UNIT_CODECol = "SIZE_UNIT_CODE";

	public static final String SIZES_CODECol = "SIZES_CODE";

	public static final String ISDOMESTICCol = "ISDOMESTIC";

	public static final String BRAND_CODECol = "BRAND_CODE";

	public static final String PRODUCT_CODECol = "PRODUCT_CODE";

	public static final String DUTY_CODECol = "DUTY_CODE";

	public static final String TRACK_NOCol = "TRACK_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String GROUP_NAMEColumn = "APP_ARREST_PROVE_EXHIBIT.GROUP_NAME";
	
	public static final String DUTY_NAMEColumn = "APP_ARREST_PROVE_EXHIBIT.DUTY_NAME";
	
	public static final String GROUP_IDColumn = "APP_ARREST_PROVE_EXHIBIT.GROUP_ID";
	
	public static final String NETWEIGHT_UNIT_NAMEColumn = "APP_ARREST_PROVE_EXHIBIT.NETWEIGHT_UNIT_NAME";
	
	public static final String QTY_UNIT_NAMEColumn = "APP_ARREST_PROVE_EXHIBIT.QTY_UNIT_NAME";
	
	public static final String SIZES_UNIT_NAMEColumn = "APP_ARREST_PROVE_EXHIBIT.SIZES_UNIT_NAME";
	
	public static final String SIZES_DESCColumn = "APP_ARREST_PROVE_EXHIBIT.SIZES_DESC";
	
	public static final String BRAND_NAMEColumn = "APP_ARREST_PROVE_EXHIBIT.BRAND_NAME";
	
	public static final String PRODUCT_NAMEColumn = "APP_ARREST_PROVE_EXHIBIT.PRODUCT_NAME";
	
	public static final String UPDATE_ONColumn = "APP_ARREST_PROVE_EXHIBIT.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APP_ARREST_PROVE_EXHIBIT.UPDATE_BY";

	public static final String CREATE_ONColumn = "APP_ARREST_PROVE_EXHIBIT.CREATE_ON";

	public static final String CREATE_BYColumn = "APP_ARREST_PROVE_EXHIBIT.CREATE_BY";

	public static final String REMARKSColumn = "APP_ARREST_PROVE_EXHIBIT.REMARKS";

	public static final String APP_ARREST_PROVE_EXHIBIT_IDColumn = "APP_ARREST_PROVE_EXHIBIT.APP_ARREST_PROVE_EXHIBIT_ID";

	public static final String CAR_NOColumn = "APP_ARREST_PROVE_EXHIBIT.CAR_NO";

	public static final String EXHIBIT_DESCColumn = "APP_ARREST_PROVE_EXHIBIT.EXHIBIT_DESC";

	public static final String EXHIBIT_LISTColumn = "APP_ARREST_PROVE_EXHIBIT.EXHIBIT_LIST";

	public static final String STATUSColumn = "APP_ARREST_PROVE_EXHIBIT.STATUS";

	public static final String NETWEIGHT_UNIT_CODEColumn = "APP_ARREST_PROVE_EXHIBIT.NETWEIGHT_UNIT_CODE";

	public static final String NETWEIGHTColumn = "APP_ARREST_PROVE_EXHIBIT.NETWEIGHT";

	public static final String QTY_UNIT_CODEColumn = "APP_ARREST_PROVE_EXHIBIT.QTY_UNIT_CODE";

	public static final String QTYColumn = "APP_ARREST_PROVE_EXHIBIT.QTY";

	public static final String SIZE_UNIT_CODEColumn = "APP_ARREST_PROVE_EXHIBIT.SIZE_UNIT_CODE";

	public static final String SIZES_CODEColumn = "APP_ARREST_PROVE_EXHIBIT.SIZES_CODE";

	public static final String ISDOMESTICColumn = "APP_ARREST_PROVE_EXHIBIT.ISDOMESTIC";

	public static final String BRAND_CODEColumn = "APP_ARREST_PROVE_EXHIBIT.BRAND_CODE";

	public static final String PRODUCT_CODEColumn = "APP_ARREST_PROVE_EXHIBIT.PRODUCT_CODE";

	public static final String DUTY_CODEColumn = "APP_ARREST_PROVE_EXHIBIT.DUTY_CODE";

	public static final String TRACK_NOColumn = "APP_ARREST_PROVE_EXHIBIT.TRACK_NO";

	public static final String IDColumn = "APP_ARREST_PROVE_EXHIBIT.ID";


	public static final String[] ALL_COLUMNS =
    {
		GROUP_NAMECol, DUTY_NAMECol, GROUP_IDCol, NETWEIGHT_UNIT_NAMECol, QTY_UNIT_NAMECol, SIZES_UNIT_NAMECol, SIZES_DESCCol, BRAND_NAMECol, PRODUCT_NAMECol,  UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, REMARKSCol	, APP_ARREST_PROVE_EXHIBIT_IDCol	, CAR_NOCol	, EXHIBIT_DESCCol	, EXHIBIT_LISTCol	, STATUSCol	, NETWEIGHT_UNIT_CODECol	, NETWEIGHTCol	, QTY_UNIT_CODECol	, QTYCol	, SIZE_UNIT_CODECol	, SIZES_CODECol	, ISDOMESTICCol	, BRAND_CODECol	, PRODUCT_CODECol	, DUTY_CODECol	, TRACK_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING = GROUP_NAMECol + ", " + DUTY_NAMECol + ", " + GROUP_IDCol + ", " + NETWEIGHT_UNIT_NAMECol +","+ QTY_UNIT_NAMECol +","+ SIZES_UNIT_NAMECol +","+ SIZES_DESCCol +","+ BRAND_NAMECol +","+ PRODUCT_NAMECol +","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ REMARKSCol	+","+ APP_ARREST_PROVE_EXHIBIT_IDCol	+","+ CAR_NOCol	+","+ EXHIBIT_DESCCol	+","+ EXHIBIT_LISTCol	+","+ STATUSCol	+","+ NETWEIGHT_UNIT_CODECol	+","+ NETWEIGHTCol	+","+ QTY_UNIT_CODECol	+","+ QTYCol	+","+ SIZE_UNIT_CODECol	+","+ SIZES_CODECol	+","+ ISDOMESTICCol	+","+ BRAND_CODECol	+","+ PRODUCT_CODECol	+","+ DUTY_CODECol	+","+ TRACK_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+REMARKSCol+"=?,"+APP_ARREST_PROVE_EXHIBIT_IDCol+"=?,"+CAR_NOCol+"=?,"+EXHIBIT_DESCCol+"=?,"+EXHIBIT_LISTCol+"=?,"+STATUSCol+"=?,"+NETWEIGHT_UNIT_CODECol+"=?,"+NETWEIGHTCol+"=?,"+QTY_UNIT_CODECol+"=?,"+QTYCol+"=?,"+SIZE_UNIT_CODECol+"=?,"+SIZES_CODECol+"=?,"+ISDOMESTICCol+"=?,"+BRAND_CODECol+"=?,"+PRODUCT_CODECol+"=?,"+DUTY_CODECol+"=?,"+TRACK_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseAppArrestProveExhibit(DB db){
		super(db);
	}



public synchronized AppArrestProveExhibit create() throws Exception{
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
					return (AppArrestProveExhibit)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<AppArrestProveExhibit> createList(List<AppArrestProveExhibit> objList)throws Exception{
    	DB db = this.initDB();
    	List<AppArrestProveExhibit> resultList = new ArrayList<AppArrestProveExhibit>();
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
	public AppArrestProveExhibit findByPk(Long id)throws Exception{
		List<AppArrestProveExhibit> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<AppArrestProveExhibit> findByPks(List<Long> ids)throws Exception{
		List<AppArrestProveExhibit> resultList = new ArrayList<AppArrestProveExhibit>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<AppArrestProveExhibit> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<AppArrestProveExhibit> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<AppArrestProveExhibit> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<AppArrestProveExhibit> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<AppArrestProveExhibit> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<AppArrestProveExhibit> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<AppArrestProveExhibit> resultList = new ArrayList<AppArrestProveExhibit>();
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
	public List<AppArrestProveExhibit> findByExample(AppArrestProveExhibit instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<AppArrestProveExhibit> findByExample(AppArrestProveExhibit instance,PageUtil pageUtil) throws Exception{
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
	public AppArrestProveExhibit update()throws Exception{
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
					return (AppArrestProveExhibit)this;
			}else// not update
				return (AppArrestProveExhibit)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<AppArrestProveExhibit> updateList(List<AppArrestProveExhibit> objList)throws Exception{
		DB db = this.initDB();
		List<AppArrestProveExhibit> resultList = new ArrayList<AppArrestProveExhibit>();
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
	public Integer deleteList(List<AppArrestProveExhibit> objList)throws Exception {
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
	public AppArrestProveExhibit populate(ResultSet rs)throws Exception{
		AppArrestProveExhibit result = new AppArrestProveExhibit(this.db);
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
    private String group_name;
    
    private String duty_name;
    
    private String group_id;
    
    private String netweight_unit_name;
    
    private String qty_unit_name;
    
    private String sizes_unit_name;
    
    private String sizes_desc;
    
    private String brand_name;
    
    private String product_name;
    
    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String remarks;

    private Long app_arrest_prove_exhibit_id;

    private String car_no;

    private String exhibit_desc;

    private String exhibit_list;

    private Long status;

    private String netweight_unit_code;

    private Double netweight;

    private String qty_unit_code;

    private Double qty;

    private String size_unit_code;

    private String sizes_code;

    private String isdomestic;

    private String brand_code;

    private String product_code;

    private String duty_code;

    private String track_no;

    private Long id;

	//**** getter setter ****//
    public String getGroup_name(){
    	return group_name;
    }
    public void setGroup_name(String value){
    	group_name = value;
    }
    
    public String getDuty_name(){
    	return duty_name;
    }
    public void setDuty_name(String value){
    	duty_name = value;
    }
    
    public String getGroup_id(){
    	return group_id;
    }
    public void setGroup_id(String value){
    	group_id = value;
    }
    
    public String getNetweight_unit_name(){
    	return netweight_unit_name;
    }
    public void setNetweight_unit_name(String netweight_unit_name){
    	this.netweight_unit_name = netweight_unit_name;
    }
    public String getQty_unit_name(){
    	return qty_unit_name;
    }
    public void setQty_unit_name(String qty_unit_name){
    	this.qty_unit_name = qty_unit_name;
    }
    public String getSizes_unit_name(){
    	return sizes_unit_name;
    }
    public void setSizes_unit_name(String sizes_unit_name){
    	this.sizes_unit_name = sizes_unit_name;
    }
    public String getSizes_desc(){
    	return sizes_desc;
    }
    public void setSizes_desc(String sizes_desc){
    	this.sizes_desc = sizes_desc;
    }
    public String getBrand_name(){
    	return brand_name;
    }
    public void setBrand_name(String brand_name){
    	this.brand_name = brand_name;
    }
    public String getProduct_name(){
    	return product_name;
    }
    public void setProduct_name(String product_name){
    	this.product_name = product_name;
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

	public String getRemarks()
    {
        return remarks;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

	public Long getApp_arrest_prove_exhibit_id()
    {
        return app_arrest_prove_exhibit_id;
    }
    public void setApp_arrest_prove_exhibit_id(Long app_arrest_prove_exhibit_id)
    {
        this.app_arrest_prove_exhibit_id = app_arrest_prove_exhibit_id;
    }

	public String getCar_no()
    {
        return car_no;
    }
    public void setCar_no(String car_no)
    {
        this.car_no = car_no;
    }

	public String getExhibit_desc()
    {
        return exhibit_desc;
    }
    public void setExhibit_desc(String exhibit_desc)
    {
        this.exhibit_desc = exhibit_desc;
    }

	public String getExhibit_list()
    {
        return exhibit_list;
    }
    public void setExhibit_list(String exhibit_list)
    {
        this.exhibit_list = exhibit_list;
    }

	public Long getStatus()
    {
        return status;
    }
    public void setStatus(Long status)
    {
        this.status = status;
    }

	public String getNetweight_unit_code()
    {
        return netweight_unit_code;
    }
    public void setNetweight_unit_code(String netweight_unit_code)
    {
        this.netweight_unit_code = netweight_unit_code;
    }

	public Double getNetweight()
    {
        return netweight;
    }
    public void setNetweight(Double netweight)
    {
        this.netweight = netweight;
    }

	public String getQty_unit_code()
    {
        return qty_unit_code;
    }
    public void setQty_unit_code(String qty_unit_code)
    {
        this.qty_unit_code = qty_unit_code;
    }

	public Double getQty()
    {
        return qty;
    }
    public void setQty(Double qty)
    {
        this.qty = qty;
    }

	public String getSize_unit_code()
    {
        return size_unit_code;
    }
    public void setSize_unit_code(String size_unit_code)
    {
        this.size_unit_code = size_unit_code;
    }

	public String getSizes_code()
    {
        return sizes_code;
    }
    public void setSizes_code(String sizes_code)
    {
        this.sizes_code = sizes_code;
    }

	public String getIsdomestic()
    {
        return isdomestic;
    }
    public void setIsdomestic(String isdomestic)
    {
        this.isdomestic = isdomestic;
    }

	public String getBrand_code()
    {
        return brand_code;
    }
    public void setBrand_code(String brand_code)
    {
        this.brand_code = brand_code;
    }

	public String getProduct_code()
    {
        return product_code;
    }
    public void setProduct_code(String product_code)
    {
        this.product_code = product_code;
    }

	public String getDuty_code()
    {
        return duty_code;
    }
    public void setDuty_code(String duty_code)
    {
        this.duty_code = duty_code;
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