








 

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

import com.ko.domain.StockoutItem;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseStockoutItem extends BaseDomain{
	// table
	public static final String TABLE_NAME = "STOCKOUT_ITEM";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "STOCKOUT_ITEM.ID";

	// short name column
public static final String GROUP_NAMECol = "GROUP_NAME";
	
	public static final String DUTY_NAMECol = "DUTY_NAME";
	
	public static final String NETWEIGHT_UNIT_NAMECol = "NETWEIGHT_UNIT_NAME";
	
	public static final String SIZES_UNIT_NAMECol = "SIZES_UNIT_NAME";
	
	public static final String SIZES_DESCCol = "SIZES_DESC";
	
	public static final String QTY_UNIT_NAMECol = "QTY_UNIT_NAME";
	
	public static final String BRAND_NAMECol = "BRAND_NAME";
	
	public static final String PRODUCT_NAMECol = "PRODUCT_NAME";
	
	public static final String GROUP_IDCol = "GROUP_ID";
	
	public static final String REMARKSCol = "REMARKS";
	
	public static final String DUTY_CODECol = "DUTY_CODE";
	
	public static final String ISDOMESTICCol = "ISDOMESTIC";

	public static final String REF_STOCKOUT_IDCol = "REF_STOCKOUT_ID";

	public static final String NETWEIGHT_UNITCol = "NETWEIGHT_UNIT";

	public static final String NETWEIGHTCol = "NETWEIGHT";

	public static final String SIZES_CODECol = "SIZES_CODE";

	public static final String SIZES_UNIT_CODECol = "SIZES_UNIT_CODE";

	public static final String DELIVERY_EXHIBIT_IDCol = "DELIVERY_EXHIBIT_ID";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String UNIT_CODECol = "UNIT_CODE";

	public static final String QTYCol = "QTY";

	public static final String BRAND_CODECol = "BRAND_CODE";

	public static final String PRODUCT_CODECol = "PRODUCT_CODE";

	public static final String STOCKOUT_IDCol = "STOCKOUT_ID";

	public static final String IDCol = "ID";


	// full column name
public static final String GROUP_NAMEColumn = "STOCKOUT_ITEM.GROUP_NAME";
	
	public static final String DUTY_NAMEColumn = "STOCKOUT_ITEM.DUTY_NAME";
	
	public static final String NETWEIGHT_UNIT_NAMEColumn = "STOCKOUT_ITEM.NETWEIGHT_UNIT_NAME";
	
	public static final String SIZES_UNIT_NAMEColumn = "STOCKOUT_ITEM.SIZES_UNIT_NAME";
	
	public static final String SIZES_DESCColumn = "STOCKOUT_ITEM.SIZES_DESC";
	
	public static final String QTY_UNIT_NAMEColumn = "STOCKOUT_ITEM.QTY_UNIT_NAME";
	
	public static final String BRAND_NAMEColumn = "STOCKOUT_ITEM.BRAND_NAME";
	
	public static final String PRODUCT_NAMEColumn = "STOCKOUT_ITEM.PRODUCT_NAME";
	
	public static final String GROUP_IDColumn = "STOCKOUT_ITEM.GROUP_ID";
	
	public static final String REMARKSColumn = "STOCKOUT_ITEM.REMARKS";
	
	public static final String DUTY_CODEColumn = "STOCKOUT_ITEM.DUTY_CODE";
	
	public static final String ISDOMESTICColumn = "STOCKOUT_ITEM.ISDOMESTIC";

	public static final String REF_STOCKOUT_IDColumn = "STOCKOUT_ITEM.REF_STOCKOUT_ID";

	public static final String NETWEIGHT_UNITColumn = "STOCKOUT_ITEM.NETWEIGHT_UNIT";

	public static final String NETWEIGHTColumn = "STOCKOUT_ITEM.NETWEIGHT";

	public static final String SIZES_CODEColumn = "STOCKOUT_ITEM.SIZES_CODE";

	public static final String SIZES_UNIT_CODEColumn = "STOCKOUT_ITEM.SIZES_UNIT_CODE";

	public static final String DELIVERY_EXHIBIT_IDColumn = "STOCKOUT_ITEM.DELIVERY_EXHIBIT_ID";

	public static final String UPDATE_ONColumn = "STOCKOUT_ITEM.UPDATE_ON";

	public static final String UPDATE_BYColumn = "STOCKOUT_ITEM.UPDATE_BY";

	public static final String CREATE_ONColumn = "STOCKOUT_ITEM.CREATE_ON";

	public static final String CREATE_BYColumn = "STOCKOUT_ITEM.CREATE_BY";

	public static final String UNIT_CODEColumn = "STOCKOUT_ITEM.UNIT_CODE";

	public static final String QTYColumn = "STOCKOUT_ITEM.QTY";

	public static final String BRAND_CODEColumn = "STOCKOUT_ITEM.BRAND_CODE";

	public static final String PRODUCT_CODEColumn = "STOCKOUT_ITEM.PRODUCT_CODE";

	public static final String STOCKOUT_IDColumn = "STOCKOUT_ITEM.STOCKOUT_ID";

	public static final String IDColumn = "STOCKOUT_ITEM.ID";


	public static final String[] ALL_COLUMNS =
    {
		GROUP_NAMECol, DUTY_NAMECol, NETWEIGHT_UNIT_NAMECol, SIZES_UNIT_NAMECol, SIZES_DESCCol, QTY_UNIT_NAMECol, BRAND_NAMECol, PRODUCT_NAMECol, GROUP_IDCol,  REMARKSCol, DUTY_CODECol,ISDOMESTICCol	, REF_STOCKOUT_IDCol	, NETWEIGHT_UNITCol	, NETWEIGHTCol	, SIZES_CODECol	, SIZES_UNIT_CODECol	, DELIVERY_EXHIBIT_IDCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, UNIT_CODECol	, QTYCol	, BRAND_CODECol	, PRODUCT_CODECol	, STOCKOUT_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  GROUP_NAMECol + "," + DUTY_NAMECol + "," + NETWEIGHT_UNIT_NAMECol + "," + SIZES_UNIT_NAMECol + "," + SIZES_DESCCol + "," + QTY_UNIT_NAMECol + "," + BRAND_NAMECol + "," + PRODUCT_NAMECol + ", " + GROUP_IDCol + "," + REMARKSCol + ", " + DUTY_CODECol + ", " + ISDOMESTICCol	+","+ REF_STOCKOUT_IDCol	+","+ NETWEIGHT_UNITCol	+","+ NETWEIGHTCol	+","+ SIZES_CODECol	+","+ SIZES_UNIT_CODECol	+","+ DELIVERY_EXHIBIT_IDCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ UNIT_CODECol	+","+ QTYCol	+","+ BRAND_CODECol	+","+ PRODUCT_CODECol	+","+ STOCKOUT_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+ISDOMESTICCol+"=?,"+REF_STOCKOUT_IDCol+"=?,"+NETWEIGHT_UNITCol+"=?,"+NETWEIGHTCol+"=?,"+SIZES_CODECol+"=?,"+SIZES_UNIT_CODECol+"=?,"+DELIVERY_EXHIBIT_IDCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+UNIT_CODECol+"=?,"+QTYCol+"=?,"+BRAND_CODECol+"=?,"+PRODUCT_CODECol+"=?,"+STOCKOUT_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseStockoutItem(DB db){
		super(db);
	}



public synchronized StockoutItem create() throws Exception{
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
					return (StockoutItem)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<StockoutItem> createList(List<StockoutItem> objList)throws Exception{
    	DB db = this.initDB();
    	List<StockoutItem> resultList = new ArrayList<StockoutItem>();
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
	public StockoutItem findByPk(Long id)throws Exception{
		List<StockoutItem> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<StockoutItem> findByPks(List<Long> ids)throws Exception{
		List<StockoutItem> resultList = new ArrayList<StockoutItem>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<StockoutItem> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<StockoutItem> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<StockoutItem> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<StockoutItem> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<StockoutItem> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<StockoutItem> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<StockoutItem> resultList = new ArrayList<StockoutItem>();
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
	public List<StockoutItem> findByExample(StockoutItem instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<StockoutItem> findByExample(StockoutItem instance,PageUtil pageUtil) throws Exception{
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
	public StockoutItem update()throws Exception{
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
					return (StockoutItem)this;
			}else// not update
				return (StockoutItem)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<StockoutItem> updateList(List<StockoutItem> objList)throws Exception{
		DB db = this.initDB();
		List<StockoutItem> resultList = new ArrayList<StockoutItem>();
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
	public Integer deleteList(List<StockoutItem> objList)throws Exception {
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
	public StockoutItem populate(ResultSet rs)throws Exception{
		StockoutItem result = new StockoutItem(this.db);
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
    
    private String netweight_unit_name;
    
    private String sizes_unit_name;
    
    private String sizes_desc;
    
    private String qty_unit_name;
    
    private String brand_name;
    
    private String product_name;
    
    private String group_id;
    
    private String remarks;
    
    private String duty_code;
    
    private String isdomestic;

    private Long ref_stockout_id;

    private String netweight_unit;

    private Double netweight;

    private String sizes_code;

    private String sizes_unit_code;

    private Long delivery_exhibit_id;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private String unit_code;

    private Double qty;

    private String brand_code;

    private String product_code;

    private Long stockout_id;

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
    
    public String getNetweight_unit_name(){
    	return netweight_unit_name;
    }
    public void setNetweight_unit_name(String value){
    	netweight_unit_name = value;
    }
    
    public String getSizes_unit_name(){
    	return sizes_unit_name;
    }
    public void setSizes_unit_name(String value){
    	sizes_unit_name = value;
    }
    
    public String getSizes_desc(){
    	return sizes_desc;
    }
    public void setSizes_desc(String value){
    	sizes_desc = value;
    }
    
    public String getQty_unit_name(){
    	return qty_unit_name;
    }
    public void setQty_unit_name(String value){
    	qty_unit_name = value;
    }
    
    public String getBrand_name(){
    	return brand_name;
    }
    public void setBrand_name(String value){
    	brand_name = value;
    }
    
    public String getProduct_name(){
    	return product_name;
    }
    public void setProduct_name(String value){
    	product_name = value;
    }
    
    public String getGroup_id(){
    	return group_id;
    }
    public void setGroup_id(String value){
    	group_id = value;
    }
    
    public String getRemarks(){
    	return remarks;
    }
    public void setRemarks(String value){
    	remarks = value;
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

	public Long getRef_stockout_id()
    {
        return ref_stockout_id;
    }
    public void setRef_stockout_id(Long ref_stockout_id)
    {
        this.ref_stockout_id = ref_stockout_id;
    }

	public String getNetweight_unit()
    {
        return netweight_unit;
    }
    public void setNetweight_unit(String netweight_unit)
    {
        this.netweight_unit = netweight_unit;
    }

	public Double getNetweight()
    {
        return netweight;
    }
    public void setNetweight(Double netweight)
    {
        this.netweight = netweight;
    }

	public String getSizes_code()
    {
        return sizes_code;
    }
    public void setSizes_code(String sizes_code)
    {
        this.sizes_code = sizes_code;
    }

	public String getSizes_unit_code()
    {
        return sizes_unit_code;
    }
    public void setSizes_unit_code(String sizes_unit_code)
    {
        this.sizes_unit_code = sizes_unit_code;
    }

	public Long getDelivery_exhibit_id()
    {
        return delivery_exhibit_id;
    }
    public void setDelivery_exhibit_id(Long delivery_exhibit_id)
    {
        this.delivery_exhibit_id = delivery_exhibit_id;
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

	public String getUnit_code()
    {
        return unit_code;
    }
    public void setUnit_code(String unit_code)
    {
        this.unit_code = unit_code;
    }

	public Double getQty()
    {
        return qty;
    }
    public void setQty(Double qty)
    {
        this.qty = qty;
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

	public Long getStockout_id()
    {
        return stockout_id;
    }
    public void setStockout_id(Long stockout_id)
    {
        this.stockout_id = stockout_id;
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