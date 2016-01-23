








 

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

import com.ko.domain.Product;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseProduct extends BaseDomain{
	// table
	public static final String TABLE_NAME = "PRODUCT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "PRODUCT.ID";

	// short name column
	public static final String SUBTYPE_CODECol = "SUBTYPE_CODE";

	public static final String LAW_DUTY_CODECol = "LAW_DUTY_CODE";

	public static final String PRC_PARAMCol = "PRC_PARAM";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String PRODUCTTYPE_IDCol = "PRODUCTTYPE_ID";

	public static final String PRODUCT_NAMECol = "PRODUCT_NAME";

	public static final String PRODUCT_CODECol = "PRODUCT_CODE";

	public static final String IDCol = "ID";


	// full column name
	public static final String SUBTYPE_CODEColumn = "PRODUCT.SUBTYPE_CODE";

	public static final String LAW_DUTY_CODEColumn = "PRODUCT.LAW_DUTY_CODE";

	public static final String PRC_PARAMColumn = "PRODUCT.PRC_PARAM";

	public static final String UPDATE_ONColumn = "PRODUCT.UPDATE_ON";

	public static final String UPDATE_BYColumn = "PRODUCT.UPDATE_BY";

	public static final String CREATE_ONColumn = "PRODUCT.CREATE_ON";

	public static final String CREATE_BYColumn = "PRODUCT.CREATE_BY";

	public static final String PRODUCTTYPE_IDColumn = "PRODUCT.PRODUCTTYPE_ID";

	public static final String PRODUCT_NAMEColumn = "PRODUCT.PRODUCT_NAME";

	public static final String PRODUCT_CODEColumn = "PRODUCT.PRODUCT_CODE";

	public static final String IDColumn = "PRODUCT.ID";


	public static final String[] ALL_COLUMNS =
    {
	 SUBTYPE_CODECol	, LAW_DUTY_CODECol	, PRC_PARAMCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, PRODUCTTYPE_IDCol	, PRODUCT_NAMECol	, PRODUCT_CODECol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  SUBTYPE_CODECol	+","+ LAW_DUTY_CODECol	+","+ PRC_PARAMCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ PRODUCTTYPE_IDCol	+","+ PRODUCT_NAMECol	+","+ PRODUCT_CODECol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+SUBTYPE_CODECol+"=?,"+LAW_DUTY_CODECol+"=?,"+PRC_PARAMCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+PRODUCTTYPE_IDCol+"=?,"+PRODUCT_NAMECol+"=?,"+PRODUCT_CODECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseProduct(DB db){
		super(db);
	}



public synchronized Product create() throws Exception{
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
					return (Product)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Product> createList(List<Product> objList)throws Exception{
    	DB db = this.initDB();
    	List<Product> resultList = new ArrayList<Product>();
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
	public Product findByPk(Long id)throws Exception{
		List<Product> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<Product> findByPks(List<Long> ids)throws Exception{
		List<Product> resultList = new ArrayList<Product>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<Product> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<Product> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<Product> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<Product> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<Product> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<Product> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<Product> resultList = new ArrayList<Product>();
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
	public List<Product> findByExample(Product instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<Product> findByExample(Product instance,PageUtil pageUtil) throws Exception{
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
	public Product update()throws Exception{
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
					return (Product)this;
			}else// not update
				return (Product)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Product> updateList(List<Product> objList)throws Exception{
		DB db = this.initDB();
		List<Product> resultList = new ArrayList<Product>();
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
	public Integer deleteList(List<Product> objList)throws Exception {
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
	public Product populate(ResultSet rs)throws Exception{
		Product result = new Product(this.db);
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
    private String subtype_code;

    private String law_duty_code;

    private String prc_param;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private Long producttype_id;

    private String product_name;

    private String product_code;

    private Long id;

	//**** getter setter ****//
	public String getSubtype_code()
    {
        return subtype_code;
    }
    public void setSubtype_code(String subtype_code)
    {
        this.subtype_code = subtype_code;
    }

	public String getLaw_duty_code()
    {
        return law_duty_code;
    }
    public void setLaw_duty_code(String law_duty_code)
    {
        this.law_duty_code = law_duty_code;
    }

	public String getPrc_param()
    {
        return prc_param;
    }
    public void setPrc_param(String prc_param)
    {
        this.prc_param = prc_param;
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

	public Long getProducttype_id()
    {
        return producttype_id;
    }
    public void setProducttype_id(Long producttype_id)
    {
        this.producttype_id = producttype_id;
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

	public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

}