








 

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
import org.jfree.util.Log;

import com.ko.domain.StockInitial;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseStockInitial extends BaseDomain{
	// table
	public static final String TABLE_NAME = "STOCK_INITIAL";
	public static String SEQUENCE_NAME = "SEQ_" + TABLE_NAME;
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	
	public static final String pkColumn = "STOCK_INITIAL.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String SOURCESCol = "SOURCES";

	public static final String DELIVERY_CODECol = "DELIVERY_CODE";

	public static final String DELIVERY_DATECol = "DELIVERY_DATE";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String OFFCODECol = "OFFCODE";

	public static final String ISDOMESTICCol = "ISDOMESTIC";

	public static final String GROUP_IDCol = "GROUP_ID";

	public static final String DUTY_CODECol = "DUTY_CODE";
	
	public static final String BRAND_CODECol = "BRAND_CODE";
	
	public static final String SIZES_DESCCol = "SIZES_DESC";
	
	public static final String SIZES_UNIT_CODECol = "SIZES_UNIT_CODE";
	
	public static final String QTYCol = "QTY";
	
	public static final String QTY_UNIT_CODECol = "QTY_UNIT_CODE";
	
	public static final String NETWEIGHTCol = "NETWEIGHT";
	
	public static final String NETWEIGHT_UNIT_CODECol = "NETWEIGHT_UNIT_CODE";
	
	public static final String REMARKSCol = "REMARKS";
	
	public static final String STATUSCol = "STATUS";

	public static final String IDCol = "ID";


	// full column name
	public static final String STATUSColumn = "STOCK_INITIAL.STATUS";
	
	public static final String REMARKSColumn = "STOCK_INITIAL.REMARKS";
	
	public static final String NETWEIGHT_UNIT_CODEColumn = "STOCK_INITIAL.NETWEIGHT_UNIT_CODE";
	
	public static final String NETWEIGHTColumn = "STOCK_INITIAL.NETWEIGHT";
	
	public static final String QTY_UNIT_CODEColumn = "STOCK_INITIAL.QTY_UNIT_CODE";
	
	public static final String QTYColumn = "STOCK_INITIAL.QTY";
	
	public static final String SIZES_UNIT_CODEColumn = "STOCK_INITIAL.SIZES_UNIT_CODE";
	
	public static final String SIZES_DESCColumn = "STOCK_INITIAL.SIZES_DESC";
	
	public static final String BRAND_CODEColumn = "STOCK_INITIAL.BRAND_CODE";
	
	public static final String DUTY_CODEColumn = "STOCK_INITIAL.DUTY_CODE";
	
	public static final String GROUP_IDColumn = "STOCK_INITIAL.GROUP_ID";
	
	public static final String ISDOMESTICColumn = "STOCK_INITIAL.ISDOMESTIC";
	
	public static final String OFFCODEColumn = "STOCK_INITIAL.OFFCODE";
	
	public static final String LEGISLATION_IDColumn = "STOCK_INITIAL.LEGISLATION_ID";
	
	public static final String DELIVERY_DATEColumn = "STOCK_INITIAL.DELIVERY_DATE";
	
	public static final String DELIVERY_CODEColumn = "STOCK_INITIAL.DELIVERY_CODE";
	
	public static final String SOURCESColumn = "STOCK_INITIAL.SOURCES";
	
	public static final String UPDATE_ONColumn = "STOCK_INITIAL.UPDATE_ON";

	public static final String UPDATE_BYColumn = "STOCK_INITIAL.UPDATE_BY";
	
	public static final String CREATE_ONColumn = "STOCK_INITIAL.CREATE_ON";
	
	public static final String CREATE_BYColumn = "STOCK_INITIAL.CREATE_BY";

	public static final String IDColumn = "STOCK_INITIAL.ID";


	public static final String[] ALL_COLUMNS =
    {
		STATUSCol , REMARKSCol, NETWEIGHT_UNIT_CODECol, NETWEIGHTCol, QTY_UNIT_CODECol, QTYCol, SIZES_UNIT_CODECol, SIZES_DESCCol,BRAND_CODECol,DUTY_CODECol, GROUP_IDCol, ISDOMESTICCol, OFFCODECol, LEGISLATION_IDCol, DELIVERY_DATECol, DELIVERY_CODECol,  SOURCESCol, UPDATE_ONCol,  UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	,  pkCol
    };

	public static final String ALL_COLUMN_STRING =  STATUSCol + "," + REMARKSCol + "," + NETWEIGHT_UNIT_CODECol + "," + NETWEIGHTCol + "," + QTY_UNIT_CODECol + "," + QTYCol + "," + SIZES_UNIT_CODECol + "," + SIZES_DESCCol + "," +BRAND_CODECol + "," +DUTY_CODECol + "," + GROUP_IDCol + "," + ISDOMESTICCol + "," +OFFCODECol + "," + LEGISLATION_IDCol + "," + DELIVERY_DATECol + "," + DELIVERY_CODECol + "," +  SOURCESCol + "," + UPDATE_ONCol + "," +  UPDATE_BYCol + "," + CREATE_ONCol + "," + CREATE_BYCol + "," +  pkCol;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+POSCODE_RECEIVECol+"=?,"+STOCKOUT_IDCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+STATUSCol+"=?,"+REMARKSCol+"=?,"+RECEIVE_BYCol+"=?,"+DESTROY_LIMIT_DATECol+"=?,"+LOCATIONCol+"=?,"+DELIVERY_EXHIBIT_IDCol+"=?,"+STOCKIN_DATECol+"=?,"+STOCKIN_CODECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseStockInitial(DB db){
		super(db);
	}



public synchronized StockInitial create() throws Exception{
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
					return (StockInitial)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<StockInitial> createList(List<StockInitial> objList)throws Exception{
    	DB db = this.initDB();
    	List<StockInitial> resultList = new ArrayList<StockInitial>();
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
	public StockInitial findByPk(Long id)throws Exception{
		List<StockInitial> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<StockInitial> findByPks(List<Long> ids)throws Exception{
		List<StockInitial> resultList = new ArrayList<StockInitial>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<StockInitial> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<StockInitial> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<StockInitial> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<StockInitial> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<StockInitial> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<StockInitial> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<StockInitial> resultList = new ArrayList<StockInitial>();
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
	public List<StockInitial> findByExample(StockInitial instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<StockInitial> findByExample(StockInitial instance,PageUtil pageUtil) throws Exception{
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
	public StockInitial update()throws Exception{
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
						//System.out.println("FldName : " + ALL_COLUMNS[i] + " Value:" + value);
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
					return (StockInitial)this;
			}else// not update
				return (StockInitial)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<StockInitial> updateList(List<StockInitial> objList)throws Exception{
		DB db = this.initDB();
		List<StockInitial> resultList = new ArrayList<StockInitial>();
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
	public Integer deleteList(List<StockInitial> objList)throws Exception {
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
	public StockInitial populate(ResultSet rs)throws Exception{
		StockInitial result = new StockInitial(this.db);
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
    private String status;

    private String remarks;
    
    private String netweight_unit_code;
    
    private double netweight;
    
    private String qty_unit_code;
    
    private double qty;
    
    private String sizes_unit_code;
    
    private String sizes_desc;
    
    private String brand_code;
    
    private String duty_code;
    
    private String group_id;
    
    private String isdomestic;
    
    private String offcode;
    
    private Long legislation_id;
    
    private java.util.Date delivery_date;
    
    private String delivery_code;
    
    private String sources;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;    

    private Long id;

	//**** getter setter ****//
    public String getStatus(){return this.status;}
    public void setStatus(String value){this.status=value;}
    
    public String getRemarks(){return this.remarks;}
    public void setRemarks(String value){this.remarks=value;}
    
    public String getNetweight_unit_code(){return this.netweight_unit_code;}
    public void setNetweight_unit_code(String value){this.netweight_unit_code=value;}
    
    public double getNetweight(){return this.netweight;}
    public void setNetweight(double value){this.netweight=value;}
    
    public String getQty_unit_code(){return this.qty_unit_code;}
    public void setQty_unit_code(String value){this.qty_unit_code=value;}
    
    public double getQty(){return this.qty;}
    public void setQty(double value){this.qty=value;}
    
    public String getSizes_unit_code(){return this.sizes_unit_code;}
    public void setSizes_unit_code(String value){this.sizes_unit_code=value;}
    
    public String getSizes_desc(){return this.sizes_desc;}
    public void setSizes_desc(String value){this.sizes_desc=value;}
    
    public String getBrand_code(){return this.brand_code;}
    public void setBrand_code(String value){this.brand_code=value;}
    
    public String getDuty_code(){return this.duty_code;}
    public void setDuty_code(String value){this.duty_code=value;}
    
    public String getGroup_id(){return this.group_id;}
    public void setGroup_id(String value){this.group_id=value;}
    
    public String getIsdomestic(){return this.isdomestic;}
    public void setIsdomestic(String value){this.isdomestic=value;}
    
    public String getOffcode(){return this.offcode;}
    public void setOffcode(String value){this.offcode=value;}
    
    public Long getLegislation_id(){return this.legislation_id;}
    public void setLegislation_id(Long value){this.legislation_id=value;}
    
    public java.util.Date getDelivery_date(){return this.delivery_date;}
    public void setDelivery_date(java.util.Date value){this.delivery_date=value;}
    
    public String getDelivery_code(){return this.delivery_code;}
    public void setDelivery_code(String value){this.delivery_code=value;}
    
    public String getSources(){return this.sources;}
    public void setSources(String value){this.sources=value;}
    
    public java.util.Date getUpdate_on(){return this.update_on;}
    public void setUpdate_on(java.util.Date value){this.update_on=value;}
    
    public Long getUpdate_by(){return this.update_by;}
    public void setUpdate_by(Long value){this.update_by=value;}
    
    public java.util.Date getCreate_on(){return this.create_on;}
    public void setCreate_on(java.util.Date value){this.create_on=value;}
    
    public Long getCreate_by(){return this.create_by;}
    public void setCreate_by(Long value){this.create_by=value;}
    
	public Long getId(){return this.id;}
	public void setId(Long value){this.id=value;}

}