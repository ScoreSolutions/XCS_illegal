








 

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

import com.ko.domain.ApplicationOutsideProveItem;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseApplicationOutsideProveItem extends BaseDomain{
	// table
	public static final String TABLE_NAME = "APPLICATION_OUTSIDE_PROVE_ITEM";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.ID";

	// short name column
	
	public static final String MODEL_CODECol = "MODEL_CODE";
	
	public static final String BRAND_SECONDCol = "BRAND_SECOND";
	
	public static final String GROUP_IDCol = "GROUP_ID";
	
	public static final String DUTY_CODECol = "DUTY_CODE";
	
	public static final String ISDOMESTICCol = "ISDOMESTIC";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String REMARKSCol = "REMARKS";

	public static final String DESCRIPTIONCol = "DESCRIPTION";

	public static final String UNIT_NETWEIGHTCol = "UNIT_NETWEIGHT";

	public static final String NETWEIGHTCol = "NETWEIGHT";

	public static final String UNIT_SIZECol = "UNIT_SIZE";

	public static final String SIZES_CODECol = "SIZES_CODE";

	public static final String UNIT_QTYCol = "UNIT_QTY";

	public static final String QTYCol = "QTY";

	public static final String BRAND_NAMECol = "BRAND_NAME";

	public static final String BRAND_CODECol = "BRAND_CODE";

	public static final String PRODUCT_NAMECol = "PRODUCT_NAME";

	public static final String PRODUCT_CODECol = "PRODUCT_CODE";

	public static final String APPLICATION_OUTSIDE_PROVE_IDCol = "APPLICATION_OUTSIDE_PROVE_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String MODEL_CODEColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.MODEL_CODE";
	
	public static final String BRAND_SECONDColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.BRAND_SECOND";
	
	public static final String GROUP_IDColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.GROUP_ID";
	
	public static final String DUTY_CODEColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.DUTY_CODE";
	
	public static final String ISDOMESTICColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.ISDOMESTIC";

	public static final String UPDATE_ONColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.UPDATE_ON";

	public static final String UPDATE_BYColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.UPDATE_BY";

	public static final String CREATE_ONColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.CREATE_ON";

	public static final String CREATE_BYColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.CREATE_BY";

	public static final String REMARKSColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.REMARKS";

	public static final String DESCRIPTIONColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.DESCRIPTION";

	public static final String UNIT_NETWEIGHTColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.UNIT_NETWEIGHT";

	public static final String NETWEIGHTColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.NETWEIGHT";

	public static final String UNIT_SIZEColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.UNIT_SIZE";

	public static final String SIZES_CODEColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.SIZES_CODE";

	public static final String UNIT_QTYColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.UNIT_QTY";

	public static final String QTYColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.QTY";

	public static final String BRAND_NAMEColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.BRAND_NAME";

	public static final String BRAND_CODEColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.BRAND_CODE";

	public static final String PRODUCT_NAMEColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.PRODUCT_NAME";

	public static final String PRODUCT_CODEColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.PRODUCT_CODE";

	public static final String APPLICATION_OUTSIDE_PROVE_IDColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.APPLICATION_OUTSIDE_PROVE_ID";

	public static final String IDColumn = "APPLICATION_OUTSIDE_PROVE_ITEM.ID";


	public static final String[] ALL_COLUMNS =
    {
	 MODEL_CODECol, BRAND_SECONDCol, GROUP_IDCol, DUTY_CODECol, ISDOMESTICCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, REMARKSCol	, DESCRIPTIONCol	, UNIT_NETWEIGHTCol	, NETWEIGHTCol	, UNIT_SIZECol	, SIZES_CODECol	, UNIT_QTYCol	, QTYCol	, BRAND_NAMECol	, BRAND_CODECol	, PRODUCT_NAMECol	, PRODUCT_CODECol	, APPLICATION_OUTSIDE_PROVE_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING = MODEL_CODECol + "," + BRAND_SECONDCol + "," + GROUP_IDCol + "," + DUTY_CODECol + "," +ISDOMESTICCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ REMARKSCol	+","+ DESCRIPTIONCol	+","+ UNIT_NETWEIGHTCol	+","+ NETWEIGHTCol	+","+ UNIT_SIZECol	+","+ SIZES_CODECol	+","+ UNIT_QTYCol	+","+ QTYCol	+","+ BRAND_NAMECol	+","+ BRAND_CODECol	+","+ PRODUCT_NAMECol	+","+ PRODUCT_CODECol	+","+ APPLICATION_OUTSIDE_PROVE_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+ISDOMESTICCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+REMARKSCol+"=?,"+DESCRIPTIONCol+"=?,"+UNIT_NETWEIGHTCol+"=?,"+NETWEIGHTCol+"=?,"+UNIT_SIZECol+"=?,"+SIZES_CODECol+"=?,"+UNIT_QTYCol+"=?,"+QTYCol+"=?,"+BRAND_NAMECol+"=?,"+BRAND_CODECol+"=?,"+PRODUCT_NAMECol+"=?,"+PRODUCT_CODECol+"=?,"+APPLICATION_OUTSIDE_PROVE_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseApplicationOutsideProveItem(DB db){
		super(db);
	}



public synchronized ApplicationOutsideProveItem create() throws Exception{
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
					return (ApplicationOutsideProveItem)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationOutsideProveItem> createList(List<ApplicationOutsideProveItem> objList)throws Exception{
    	DB db = this.initDB();
    	List<ApplicationOutsideProveItem> resultList = new ArrayList<ApplicationOutsideProveItem>();
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
	public ApplicationOutsideProveItem findByPk(Long id)throws Exception{
		List<ApplicationOutsideProveItem> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ApplicationOutsideProveItem> findByPks(List<Long> ids)throws Exception{
		List<ApplicationOutsideProveItem> resultList = new ArrayList<ApplicationOutsideProveItem>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ApplicationOutsideProveItem> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ApplicationOutsideProveItem> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ApplicationOutsideProveItem> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ApplicationOutsideProveItem> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ApplicationOutsideProveItem> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ApplicationOutsideProveItem> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ApplicationOutsideProveItem> resultList = new ArrayList<ApplicationOutsideProveItem>();
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
	public List<ApplicationOutsideProveItem> findByExample(ApplicationOutsideProveItem instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ApplicationOutsideProveItem> findByExample(ApplicationOutsideProveItem instance,PageUtil pageUtil) throws Exception{
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
	public ApplicationOutsideProveItem update()throws Exception{
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
					return (ApplicationOutsideProveItem)this;
			}else// not update
				return (ApplicationOutsideProveItem)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ApplicationOutsideProveItem> updateList(List<ApplicationOutsideProveItem> objList)throws Exception{
		DB db = this.initDB();
		List<ApplicationOutsideProveItem> resultList = new ArrayList<ApplicationOutsideProveItem>();
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
	public Integer deleteList(List<ApplicationOutsideProveItem> objList)throws Exception {
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
	public ApplicationOutsideProveItem populate(ResultSet rs)throws Exception{
		ApplicationOutsideProveItem result = new ApplicationOutsideProveItem(this.db);
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
    private String model_code;
    
    private String brand_second;
    
    private String group_id;
    
    private String duty_code;
    
    private String isdomestic;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String remarks;

    private String description;

    private String unit_netweight;

    private Double netweight;

    private String unit_size;

    private String sizes_code;

    private String unit_qty;

    private Double qty;

    private String brand_name;

    private String brand_code;

    private String product_name;

    private String product_code;

    private Long application_outside_prove_id;

    private Long id;

	//**** getter setter ****//
    public String getModel_code(){
    	return model_code;
    }
    public void setModel_code(String value){
    	this.model_code = value;
    }
    
    public String getBrand_second(){
    	return brand_second;
    }
    public void setBrand_second(String value){
    	this.brand_second = value;
    }
    
    public String getGroup_id(){
    	return group_id;
    }
    public void setGroup_id(String value){
    	this.group_id = value;
    }
    
    public String getDuty_code(){
    	return duty_code;
    }
    public void setDuty_code(String value){
    	this.duty_code = value;
    }
    
	public String getIsdomestic()
    {
        return isdomestic;
    }
    public void setIsdomestic(String isdomestic)
    {
        this.isdomestic = isdomestic;
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

	public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

	public String getUnit_netweight()
    {
        return unit_netweight;
    }
    public void setUnit_netweight(String unit_netweight)
    {
        this.unit_netweight = unit_netweight;
    }

	public Double getNetweight()
    {
        return netweight;
    }
    public void setNetweight(Double netweight)
    {
        this.netweight = netweight;
    }

	public String getUnit_size()
    {
        return unit_size;
    }
    public void setUnit_size(String unit_size)
    {
        this.unit_size = unit_size;
    }

	public String getSizes_code()
    {
        return sizes_code;
    }
    public void setSizes_code(String sizes_code)
    {
        this.sizes_code = sizes_code;
    }

	public String getUnit_qty()
    {
        return unit_qty;
    }
    public void setUnit_qty(String unit_qty)
    {
        this.unit_qty = unit_qty;
    }

	public Double getQty()
    {
        return qty;
    }
    public void setQty(Double qty)
    {
        this.qty = qty;
    }

	public String getBrand_name()
    {
        return brand_name;
    }
    public void setBrand_name(String brand_name)
    {
        this.brand_name = brand_name;
    }

	public String getBrand_code()
    {
        return brand_code;
    }
    public void setBrand_code(String brand_code)
    {
        this.brand_code = brand_code;
    }

	public String getProduct_name()
    {
        return product_name;
    }
    public void setProduct_name(String product_name)
    {
        this.product_name = product_name;
    }

	public String getProduct_code()
    {
        return product_code;
    }
    public void setProduct_code(String product_code)
    {
        this.product_code = product_code;
    }

	public Long getApplication_outside_prove_id()
    {
        return application_outside_prove_id;
    }
    public void setApplication_outside_prove_id(Long application_outside_prove_id)
    {
        this.application_outside_prove_id = application_outside_prove_id;
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