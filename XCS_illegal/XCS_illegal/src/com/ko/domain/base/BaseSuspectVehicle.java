








 

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

import com.ko.domain.SuspectVehicle;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseSuspectVehicle extends BaseDomain{
	// table
	public static final String TABLE_NAME = "SUSPECT_VEHICLE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "SUSPECT_VEHICLE.ID";

	// short name column
	public static final String DUTY_CODECol = "DUTY_CODE";
	
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String DESCRIPTIONCol = "DESCRIPTION";

	public static final String CAR_COLORCol = "CAR_COLOR";

	public static final String CAR_MODELCol = "CAR_MODEL";

	public static final String BRAND_BRAND_CODECol = "BRAND_BRAND_CODE";

	public static final String BRAND_DUTY_CODECol = "BRAND_DUTY_CODE";

	public static final String CAR_NOCol = "CAR_NO";

	public static final String CAR_CATECol = "CAR_CATE";

	public static final String PROVINCE_CODECol = "PROVINCE_CODE";

	public static final String SUSPECT_INVESTIGATE_IDCol = "SUSPECT_INVESTIGATE_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String DUTY_CODEColumn = "SUSPECT_VEHICLE.DUTY_CODE";
	
	public static final String UPDATE_ONColumn = "SUSPECT_VEHICLE.UPDATE_ON";

	public static final String UPDATE_BYColumn = "SUSPECT_VEHICLE.UPDATE_BY";

	public static final String CREATE_ONColumn = "SUSPECT_VEHICLE.CREATE_ON";

	public static final String CREATE_BYColumn = "SUSPECT_VEHICLE.CREATE_BY";

	public static final String DESCRIPTIONColumn = "SUSPECT_VEHICLE.DESCRIPTION";

	public static final String CAR_COLORColumn = "SUSPECT_VEHICLE.CAR_COLOR";

	public static final String CAR_MODELColumn = "SUSPECT_VEHICLE.CAR_MODEL";

	public static final String BRAND_BRAND_CODEColumn = "SUSPECT_VEHICLE.BRAND_BRAND_CODE";

	public static final String BRAND_DUTY_CODEColumn = "SUSPECT_VEHICLE.BRAND_DUTY_CODE";

	public static final String CAR_NOColumn = "SUSPECT_VEHICLE.CAR_NO";

	public static final String CAR_CATEColumn = "SUSPECT_VEHICLE.CAR_CATE";

	public static final String PRODUCTTYPE_TYPE_CODEColumn = "SUSPECT_VEHICLE.PRODUCTTYPE_TYPE_CODE";

	public static final String PRODUCTTYPE_DUTY_CODEColumn = "SUSPECT_VEHICLE.PRODUCTTYPE_DUTY_CODE";

	public static final String PROVINCE_CODEColumn = "SUSPECT_VEHICLE.PROVINCE_CODE";

	public static final String SUSPECT_INVESTIGATE_IDColumn = "SUSPECT_VEHICLE.SUSPECT_INVESTIGATE_ID";

	public static final String IDColumn = "SUSPECT_VEHICLE.ID";


	public static final String[] ALL_COLUMNS =
    {
	 DUTY_CODECol, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, DESCRIPTIONCol	, CAR_COLORCol	, CAR_MODELCol	, BRAND_BRAND_CODECol	, BRAND_DUTY_CODECol	, CAR_NOCol	, CAR_CATECol	,  PROVINCE_CODECol	, SUSPECT_INVESTIGATE_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ DESCRIPTIONCol	+","+ CAR_COLORCol	+","+ CAR_MODELCol	+","+ BRAND_BRAND_CODECol	+","+ BRAND_DUTY_CODECol	+","+ CAR_NOCol	+","+ CAR_CATECol	+","+  PROVINCE_CODECol	+","+ SUSPECT_INVESTIGATE_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+DESCRIPTIONCol+"=?,"+CAR_COLORCol+"=?,"+CAR_MODELCol+"=?,"+BRAND_BRAND_CODECol+"=?,"+BRAND_DUTY_CODECol+"=?,"+CAR_NOCol+"=?,"+CAR_CATECol+"=?,"+PRODUCTTYPE_TYPE_CODECol+"=?,"+PRODUCTTYPE_DUTY_CODECol+"=?,"+PROVINCE_CODECol+"=?,"+SUSPECT_INVESTIGATE_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseSuspectVehicle(DB db){
		super(db);
	}



public synchronized SuspectVehicle create() throws Exception{
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
					return (SuspectVehicle)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SuspectVehicle> createList(List<SuspectVehicle> objList)throws Exception{
    	DB db = this.initDB();
    	List<SuspectVehicle> resultList = new ArrayList<SuspectVehicle>();
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
	public SuspectVehicle findByPk(Long id)throws Exception{
		List<SuspectVehicle> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<SuspectVehicle> findByPks(List<Long> ids)throws Exception{
		List<SuspectVehicle> resultList = new ArrayList<SuspectVehicle>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<SuspectVehicle> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<SuspectVehicle> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<SuspectVehicle> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<SuspectVehicle> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<SuspectVehicle> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<SuspectVehicle> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<SuspectVehicle> resultList = new ArrayList<SuspectVehicle>();
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
	public List<SuspectVehicle> findByExample(SuspectVehicle instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<SuspectVehicle> findByExample(SuspectVehicle instance,PageUtil pageUtil) throws Exception{
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
	public SuspectVehicle update()throws Exception{
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
					return (SuspectVehicle)this;
			}else// not update
				return (SuspectVehicle)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SuspectVehicle> updateList(List<SuspectVehicle> objList)throws Exception{
		DB db = this.initDB();
		List<SuspectVehicle> resultList = new ArrayList<SuspectVehicle>();
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
	public Integer deleteList(List<SuspectVehicle> objList)throws Exception {
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
	public SuspectVehicle populate(ResultSet rs)throws Exception{
		SuspectVehicle result = new SuspectVehicle(this.db);
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
    private String duty_code;
    
    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String description;

    private String car_color;

    private String car_model;

    private String brand_brand_code;

    private String brand_duty_code;

    private String car_no;

    private String car_cate;

    private String province_code;

    private Long suspect_investigate_id;

    private Long id;

	//**** getter setter ****//
    public String getDuty_code(){
    	return duty_code;
    }
    public void setDuty_code(String value){
    	duty_code = value;
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

	public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

	public String getCar_color()
    {
        return car_color;
    }
    public void setCar_color(String car_color)
    {
        this.car_color = car_color;
    }

	public String getCar_model()
    {
        return car_model;
    }
    public void setCar_model(String car_model)
    {
        this.car_model = car_model;
    }

	public String getBrand_brand_code()
    {
        return brand_brand_code;
    }
    public void setBrand_brand_code(String brand_brand_code)
    {
        this.brand_brand_code = brand_brand_code;
    }

	public String getBrand_duty_code()
    {
        return brand_duty_code;
    }
    public void setBrand_duty_code(String brand_duty_code)
    {
        this.brand_duty_code = brand_duty_code;
    }

	public String getCar_no()
    {
        return car_no;
    }
    public void setCar_no(String car_no)
    {
        this.car_no = car_no;
    }

	public String getCar_cate()
    {
        return car_cate;
    }
    public void setCar_cate(String car_cate)
    {
        this.car_cate = car_cate;
    }

	public String getProvince_code()
    {
        return province_code;
    }
    public void setProvince_code(String province_code)
    {
        this.province_code = province_code;
    }

	public Long getSuspect_investigate_id()
    {
        return suspect_investigate_id;
    }
    public void setSuspect_investigate_id(Long suspect_investigate_id)
    {
        this.suspect_investigate_id = suspect_investigate_id;
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