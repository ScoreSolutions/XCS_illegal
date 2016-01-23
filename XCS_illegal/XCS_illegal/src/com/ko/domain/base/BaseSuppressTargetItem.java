








 

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

import com.ko.domain.SuppressTargetItem;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseSuppressTargetItem extends BaseDomain{
	// table
	public static final String TABLE_NAME = "SUPPRESS_TARGET_ITEM";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "SUPPRESS_TARGET_ITEM.ID";

	// short name column
	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String FINE_09Col = "FINE_09";

	public static final String QTY_09Col = "QTY_09";

	public static final String FINE_08Col = "FINE_08";

	public static final String QTY_08Col = "QTY_08";

	public static final String FINE_07Col = "FINE_07";

	public static final String QTY_07Col = "QTY_07";

	public static final String FINE_06Col = "FINE_06";

	public static final String QTY_06Col = "QTY_06";

	public static final String FINE_05Col = "FINE_05";

	public static final String QTY_05Col = "QTY_05";

	public static final String FINE_04Col = "FINE_04";

	public static final String QTY_04Col = "QTY_04";

	public static final String FINE_03Col = "FINE_03";

	public static final String QTY_03Col = "QTY_03";

	public static final String FINE_02Col = "FINE_02";

	public static final String QTY_02Col = "QTY_02";

	public static final String FINE_01Col = "FINE_01";

	public static final String QTY_01Col = "QTY_01";

	public static final String FINE_12Col = "FINE_12";

	public static final String QTY_12Col = "QTY_12";

	public static final String FINE_11Col = "FINE_11";

	public static final String QTY_11Col = "QTY_11";

	public static final String FINE_10Col = "FINE_10";

	public static final String QTY_10Col = "QTY_10";

	public static final String TARGET_TYPECol = "TARGET_TYPE";

	public static final String SUPPRESS_TARGET_IDCol = "SUPPRESS_TARGET_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPDATE_ONColumn = "SUPPRESS_TARGET_ITEM.UPDATE_ON";

	public static final String UPDATE_BYColumn = "SUPPRESS_TARGET_ITEM.UPDATE_BY";

	public static final String CREATE_ONColumn = "SUPPRESS_TARGET_ITEM.CREATE_ON";

	public static final String CREATE_BYColumn = "SUPPRESS_TARGET_ITEM.CREATE_BY";

	public static final String FINE_09Column = "SUPPRESS_TARGET_ITEM.FINE_09";

	public static final String QTY_09Column = "SUPPRESS_TARGET_ITEM.QTY_09";

	public static final String FINE_08Column = "SUPPRESS_TARGET_ITEM.FINE_08";

	public static final String QTY_08Column = "SUPPRESS_TARGET_ITEM.QTY_08";

	public static final String FINE_07Column = "SUPPRESS_TARGET_ITEM.FINE_07";

	public static final String QTY_07Column = "SUPPRESS_TARGET_ITEM.QTY_07";

	public static final String FINE_06Column = "SUPPRESS_TARGET_ITEM.FINE_06";

	public static final String QTY_06Column = "SUPPRESS_TARGET_ITEM.QTY_06";

	public static final String FINE_05Column = "SUPPRESS_TARGET_ITEM.FINE_05";

	public static final String QTY_05Column = "SUPPRESS_TARGET_ITEM.QTY_05";

	public static final String FINE_04Column = "SUPPRESS_TARGET_ITEM.FINE_04";

	public static final String QTY_04Column = "SUPPRESS_TARGET_ITEM.QTY_04";

	public static final String FINE_03Column = "SUPPRESS_TARGET_ITEM.FINE_03";

	public static final String QTY_03Column = "SUPPRESS_TARGET_ITEM.QTY_03";

	public static final String FINE_02Column = "SUPPRESS_TARGET_ITEM.FINE_02";

	public static final String QTY_02Column = "SUPPRESS_TARGET_ITEM.QTY_02";

	public static final String FINE_01Column = "SUPPRESS_TARGET_ITEM.FINE_01";

	public static final String QTY_01Column = "SUPPRESS_TARGET_ITEM.QTY_01";

	public static final String FINE_12Column = "SUPPRESS_TARGET_ITEM.FINE_12";

	public static final String QTY_12Column = "SUPPRESS_TARGET_ITEM.QTY_12";

	public static final String FINE_11Column = "SUPPRESS_TARGET_ITEM.FINE_11";

	public static final String QTY_11Column = "SUPPRESS_TARGET_ITEM.QTY_11";

	public static final String FINE_10Column = "SUPPRESS_TARGET_ITEM.FINE_10";

	public static final String QTY_10Column = "SUPPRESS_TARGET_ITEM.QTY_10";

	public static final String TARGET_TYPEColumn = "SUPPRESS_TARGET_ITEM.TARGET_TYPE";

	public static final String SUPPRESS_TARGET_IDColumn = "SUPPRESS_TARGET_ITEM.SUPPRESS_TARGET_ID";

	public static final String IDColumn = "SUPPRESS_TARGET_ITEM.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, FINE_09Col	, QTY_09Col	, FINE_08Col	, QTY_08Col	, FINE_07Col	, QTY_07Col	, FINE_06Col	, QTY_06Col	, FINE_05Col	, QTY_05Col	, FINE_04Col	, QTY_04Col	, FINE_03Col	, QTY_03Col	, FINE_02Col	, QTY_02Col	, FINE_01Col	, QTY_01Col	, FINE_12Col	, QTY_12Col	, FINE_11Col	, QTY_11Col	, FINE_10Col	, QTY_10Col	, TARGET_TYPECol	, SUPPRESS_TARGET_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ FINE_09Col	+","+ QTY_09Col	+","+ FINE_08Col	+","+ QTY_08Col	+","+ FINE_07Col	+","+ QTY_07Col	+","+ FINE_06Col	+","+ QTY_06Col	+","+ FINE_05Col	+","+ QTY_05Col	+","+ FINE_04Col	+","+ QTY_04Col	+","+ FINE_03Col	+","+ QTY_03Col	+","+ FINE_02Col	+","+ QTY_02Col	+","+ FINE_01Col	+","+ QTY_01Col	+","+ FINE_12Col	+","+ QTY_12Col	+","+ FINE_11Col	+","+ QTY_11Col	+","+ FINE_10Col	+","+ QTY_10Col	+","+ TARGET_TYPECol	+","+ SUPPRESS_TARGET_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+FINE_09Col+"=?,"+QTY_09Col+"=?,"+FINE_08Col+"=?,"+QTY_08Col+"=?,"+FINE_07Col+"=?,"+QTY_07Col+"=?,"+FINE_06Col+"=?,"+QTY_06Col+"=?,"+FINE_05Col+"=?,"+QTY_05Col+"=?,"+FINE_04Col+"=?,"+QTY_04Col+"=?,"+FINE_03Col+"=?,"+QTY_03Col+"=?,"+FINE_02Col+"=?,"+QTY_02Col+"=?,"+FINE_01Col+"=?,"+QTY_01Col+"=?,"+FINE_12Col+"=?,"+QTY_12Col+"=?,"+FINE_11Col+"=?,"+QTY_11Col+"=?,"+FINE_10Col+"=?,"+QTY_10Col+"=?,"+TARGET_TYPECol+"=?,"+SUPPRESS_TARGET_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseSuppressTargetItem(DB db){
		super(db);
	}



public synchronized SuppressTargetItem create() throws Exception{
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
					return (SuppressTargetItem)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SuppressTargetItem> createList(List<SuppressTargetItem> objList)throws Exception{
    	DB db = this.initDB();
    	List<SuppressTargetItem> resultList = new ArrayList<SuppressTargetItem>();
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
	public SuppressTargetItem findByPk(Long id)throws Exception{
		List<SuppressTargetItem> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<SuppressTargetItem> findByPks(List<Long> ids)throws Exception{
		List<SuppressTargetItem> resultList = new ArrayList<SuppressTargetItem>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<SuppressTargetItem> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<SuppressTargetItem> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<SuppressTargetItem> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<SuppressTargetItem> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<SuppressTargetItem> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<SuppressTargetItem> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<SuppressTargetItem> resultList = new ArrayList<SuppressTargetItem>();
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
	public List<SuppressTargetItem> findByExample(SuppressTargetItem instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<SuppressTargetItem> findByExample(SuppressTargetItem instance,PageUtil pageUtil) throws Exception{
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
	public SuppressTargetItem update()throws Exception{
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
					return (SuppressTargetItem)this;
			}else// not update
				return (SuppressTargetItem)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SuppressTargetItem> updateList(List<SuppressTargetItem> objList)throws Exception{
		DB db = this.initDB();
		List<SuppressTargetItem> resultList = new ArrayList<SuppressTargetItem>();
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
	public Integer deleteList(List<SuppressTargetItem> objList)throws Exception {
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
	public SuppressTargetItem populate(ResultSet rs)throws Exception{
		SuppressTargetItem result = new SuppressTargetItem(this.db);
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
    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private Double fine_09;

    private Double qty_09;

    private Double fine_08;

    private Double qty_08;

    private Double fine_07;

    private Double qty_07;

    private Double fine_06;

    private Double qty_06;

    private Double fine_05;

    private Double qty_05;

    private Double fine_04;

    private Double qty_04;

    private Double fine_03;

    private Double qty_03;

    private Double fine_02;

    private Double qty_02;

    private Double fine_01;

    private Double qty_01;

    private Double fine_12;

    private Double qty_12;

    private Double fine_11;

    private Double qty_11;

    private Double fine_10;

    private Double qty_10;

    private String target_type;

    private Long suppress_target_id;

    private Long id;

	//**** getter setter ****//
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

	public Double getFine_09()
    {
        return fine_09;
    }
    public void setFine_09(Double fine_09)
    {
        this.fine_09 = fine_09;
    }

	public Double getQty_09()
    {
        return qty_09;
    }
    public void setQty_09(Double qty_09)
    {
        this.qty_09 = qty_09;
    }

	public Double getFine_08()
    {
        return fine_08;
    }
    public void setFine_08(Double fine_08)
    {
        this.fine_08 = fine_08;
    }

	public Double getQty_08()
    {
        return qty_08;
    }
    public void setQty_08(Double qty_08)
    {
        this.qty_08 = qty_08;
    }

	public Double getFine_07()
    {
        return fine_07;
    }
    public void setFine_07(Double fine_07)
    {
        this.fine_07 = fine_07;
    }

	public Double getQty_07()
    {
        return qty_07;
    }
    public void setQty_07(Double qty_07)
    {
        this.qty_07 = qty_07;
    }

	public Double getFine_06()
    {
        return fine_06;
    }
    public void setFine_06(Double fine_06)
    {
        this.fine_06 = fine_06;
    }

	public Double getQty_06()
    {
        return qty_06;
    }
    public void setQty_06(Double qty_06)
    {
        this.qty_06 = qty_06;
    }

	public Double getFine_05()
    {
        return fine_05;
    }
    public void setFine_05(Double fine_05)
    {
        this.fine_05 = fine_05;
    }

	public Double getQty_05()
    {
        return qty_05;
    }
    public void setQty_05(Double qty_05)
    {
        this.qty_05 = qty_05;
    }

	public Double getFine_04()
    {
        return fine_04;
    }
    public void setFine_04(Double fine_04)
    {
        this.fine_04 = fine_04;
    }

	public Double getQty_04()
    {
        return qty_04;
    }
    public void setQty_04(Double qty_04)
    {
        this.qty_04 = qty_04;
    }

	public Double getFine_03()
    {
        return fine_03;
    }
    public void setFine_03(Double fine_03)
    {
        this.fine_03 = fine_03;
    }

	public Double getQty_03()
    {
        return qty_03;
    }
    public void setQty_03(Double qty_03)
    {
        this.qty_03 = qty_03;
    }

	public Double getFine_02()
    {
        return fine_02;
    }
    public void setFine_02(Double fine_02)
    {
        this.fine_02 = fine_02;
    }

	public Double getQty_02()
    {
        return qty_02;
    }
    public void setQty_02(Double qty_02)
    {
        this.qty_02 = qty_02;
    }

	public Double getFine_01()
    {
        return fine_01;
    }
    public void setFine_01(Double fine_01)
    {
        this.fine_01 = fine_01;
    }

	public Double getQty_01()
    {
        return qty_01;
    }
    public void setQty_01(Double qty_01)
    {
        this.qty_01 = qty_01;
    }

	public Double getFine_12()
    {
        return fine_12;
    }
    public void setFine_12(Double fine_12)
    {
        this.fine_12 = fine_12;
    }

	public Double getQty_12()
    {
        return qty_12;
    }
    public void setQty_12(Double qty_12)
    {
        this.qty_12 = qty_12;
    }

	public Double getFine_11()
    {
        return fine_11;
    }
    public void setFine_11(Double fine_11)
    {
        this.fine_11 = fine_11;
    }

	public Double getQty_11()
    {
        return qty_11;
    }
    public void setQty_11(Double qty_11)
    {
        this.qty_11 = qty_11;
    }

	public Double getFine_10()
    {
        return fine_10;
    }
    public void setFine_10(Double fine_10)
    {
        this.fine_10 = fine_10;
    }

	public Double getQty_10()
    {
        return qty_10;
    }
    public void setQty_10(Double qty_10)
    {
        this.qty_10 = qty_10;
    }

	public String getTarget_type()
    {
        return target_type;
    }
    public void setTarget_type(String target_type)
    {
        this.target_type = target_type;
    }

	public Long getSuppress_target_id()
    {
        return suppress_target_id;
    }
    public void setSuppress_target_id(Long suppress_target_id)
    {
        this.suppress_target_id = suppress_target_id;
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