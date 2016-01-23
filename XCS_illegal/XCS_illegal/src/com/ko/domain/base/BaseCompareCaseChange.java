








 

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

import com.ko.domain.CompareCaseChange;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseCompareCaseChange extends BaseDomain{
	// table
	public static final String TABLE_NAME = "COMPARE_CASE_CHANGE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "COMPARE_CASE_CHANGE.ID";

	// short name column
	public static final String SEND_INCOME_STATUSCol = "SEND_INCOME_STATUS";
	
	public static final String CANCEL_BYCol = "CANCEL_BY";

	public static final String CANCEL_DATECol = "CANCEL_DATE";

	public static final String ISCANCELCol = "ISCANCEL";

	public static final String TREASURY_MONEY_OLDCol = "TREASURY_MONEY_OLD";

	public static final String REWARD_MONEY_OLDCol = "REWARD_MONEY_OLD";

	public static final String BRIBE_MONEY_OLDCol = "BRIBE_MONEY_OLD";

	public static final String CASE_FINE_OLDCol = "CASE_FINE_OLD";

	public static final String CHANGE_REASONCol = "CHANGE_REASON";

	public static final String INV_TYPECol = "INV_TYPE";

	public static final String CHANGE_DATECol = "CHANGE_DATE";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String CHANGE_MONEYCol = "CHANGE_MONEY";

	public static final String CHANGE_TYPECol = "CHANGE_TYPE";

	public static final String COMPARE_CASE_IDCol = "COMPARE_CASE_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String SEND_INCOME_STATUSColumn = "COMPARE_CASE_CHANGE.SEND_INCOME_STATUS";
	
	public static final String CANCEL_BYColumn = "COMPARE_CASE_CHANGE.CANCEL_BY";

	public static final String CANCEL_DATEColumn = "COMPARE_CASE_CHANGE.CANCEL_DATE";

	public static final String ISCANCELColumn = "COMPARE_CASE_CHANGE.ISCANCEL";

	public static final String TREASURY_MONEY_OLDColumn = "COMPARE_CASE_CHANGE.TREASURY_MONEY_OLD";

	public static final String REWARD_MONEY_OLDColumn = "COMPARE_CASE_CHANGE.REWARD_MONEY_OLD";

	public static final String BRIBE_MONEY_OLDColumn = "COMPARE_CASE_CHANGE.BRIBE_MONEY_OLD";

	public static final String CASE_FINE_OLDColumn = "COMPARE_CASE_CHANGE.CASE_FINE_OLD";

	public static final String CHANGE_REASONColumn = "COMPARE_CASE_CHANGE.CHANGE_REASON";

	public static final String INV_TYPEColumn = "COMPARE_CASE_CHANGE.INV_TYPE";

	public static final String CHANGE_DATEColumn = "COMPARE_CASE_CHANGE.CHANGE_DATE";

	public static final String UPDATE_ONColumn = "COMPARE_CASE_CHANGE.UPDATE_ON";

	public static final String UPDATE_BYColumn = "COMPARE_CASE_CHANGE.UPDATE_BY";

	public static final String CREATE_ONColumn = "COMPARE_CASE_CHANGE.CREATE_ON";

	public static final String CREATE_BYColumn = "COMPARE_CASE_CHANGE.CREATE_BY";

	public static final String CHANGE_MONEYColumn = "COMPARE_CASE_CHANGE.CHANGE_MONEY";

	public static final String CHANGE_TYPEColumn = "COMPARE_CASE_CHANGE.CHANGE_TYPE";

	public static final String COMPARE_CASE_IDColumn = "COMPARE_CASE_CHANGE.COMPARE_CASE_ID";

	public static final String IDColumn = "COMPARE_CASE_CHANGE.ID";


	public static final String[] ALL_COLUMNS =
    {
		SEND_INCOME_STATUSCol, CANCEL_BYCol	, CANCEL_DATECol	, ISCANCELCol	, TREASURY_MONEY_OLDCol	, REWARD_MONEY_OLDCol	, BRIBE_MONEY_OLDCol	, CASE_FINE_OLDCol	, CHANGE_REASONCol	, INV_TYPECol	, CHANGE_DATECol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, CHANGE_MONEYCol	, CHANGE_TYPECol	, COMPARE_CASE_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING = SEND_INCOME_STATUSCol + "," + CANCEL_BYCol	+","+ CANCEL_DATECol	+","+ ISCANCELCol	+","+ TREASURY_MONEY_OLDCol	+","+ REWARD_MONEY_OLDCol	+","+ BRIBE_MONEY_OLDCol	+","+ CASE_FINE_OLDCol	+","+ CHANGE_REASONCol	+","+ INV_TYPECol	+","+ CHANGE_DATECol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ CHANGE_MONEYCol	+","+ CHANGE_TYPECol	+","+ COMPARE_CASE_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+CANCEL_BYCol+"=?,"+CANCEL_DATECol+"=?,"+ISCANCELCol+"=?,"+TREASURY_MONEY_OLDCol+"=?,"+REWARD_MONEY_OLDCol+"=?,"+BRIBE_MONEY_OLDCol+"=?,"+CASE_FINE_OLDCol+"=?,"+CHANGE_REASONCol+"=?,"+INV_TYPECol+"=?,"+CHANGE_DATECol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+CHANGE_MONEYCol+"=?,"+CHANGE_TYPECol+"=?,"+COMPARE_CASE_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseCompareCaseChange(DB db){
		super(db);
	}



public synchronized CompareCaseChange create() throws Exception{
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
					return (CompareCaseChange)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<CompareCaseChange> createList(List<CompareCaseChange> objList)throws Exception{
    	DB db = this.initDB();
    	List<CompareCaseChange> resultList = new ArrayList<CompareCaseChange>();
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
	public CompareCaseChange findByPk(Long id)throws Exception{
		List<CompareCaseChange> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<CompareCaseChange> findByPks(List<Long> ids)throws Exception{
		List<CompareCaseChange> resultList = new ArrayList<CompareCaseChange>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<CompareCaseChange> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<CompareCaseChange> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<CompareCaseChange> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<CompareCaseChange> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<CompareCaseChange> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<CompareCaseChange> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<CompareCaseChange> resultList = new ArrayList<CompareCaseChange>();
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
	public List<CompareCaseChange> findByExample(CompareCaseChange instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<CompareCaseChange> findByExample(CompareCaseChange instance,PageUtil pageUtil) throws Exception{
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
	public CompareCaseChange update()throws Exception{
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
					return (CompareCaseChange)this;
			}else// not update
				return (CompareCaseChange)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<CompareCaseChange> updateList(List<CompareCaseChange> objList)throws Exception{
		DB db = this.initDB();
		List<CompareCaseChange> resultList = new ArrayList<CompareCaseChange>();
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
	public Integer deleteList(List<CompareCaseChange> objList)throws Exception {
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
	public CompareCaseChange populate(ResultSet rs)throws Exception{
		CompareCaseChange result = new CompareCaseChange(this.db);
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
    private String send_income_status;
    
    private String cancel_by;

    private java.util.Date cancel_date;

    private String iscancel;

    private Double treasury_money_old;

    private Double reward_money_old;

    private Double bribe_money_old;

    private Double case_fine_old;

    private String change_reason;

    private String inv_type;

    private java.util.Date change_date;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private Double change_money;

    private String change_type;

    private Long compare_case_id;

    private Long id;

	//**** getter setter ****//
    public String getSend_income_status(){return send_income_status;}
    public void setSend_income_status(String value){send_income_status=value;}
    
	public String getCancel_by()
    {
        return cancel_by;
    }
    public void setCancel_by(String cancel_by)
    {
        this.cancel_by = cancel_by;
    }

	public java.util.Date getCancel_date()
    {
        return cancel_date;
    }
    public void setCancel_date(java.util.Date cancel_date)
    {
        this.cancel_date = cancel_date;
    }

	public String getIscancel()
    {
        return iscancel;
    }
    public void setIscancel(String iscancel)
    {
        this.iscancel = iscancel;
    }

	public Double getTreasury_money_old()
    {
        return treasury_money_old;
    }
    public void setTreasury_money_old(Double treasury_money_old)
    {
        this.treasury_money_old = treasury_money_old;
    }

	public Double getReward_money_old()
    {
        return reward_money_old;
    }
    public void setReward_money_old(Double reward_money_old)
    {
        this.reward_money_old = reward_money_old;
    }

	public Double getBribe_money_old()
    {
        return bribe_money_old;
    }
    public void setBribe_money_old(Double bribe_money_old)
    {
        this.bribe_money_old = bribe_money_old;
    }

	public Double getCase_fine_old()
    {
        return case_fine_old;
    }
    public void setCase_fine_old(Double case_fine_old)
    {
        this.case_fine_old = case_fine_old;
    }

	public String getChange_reason()
    {
        return change_reason;
    }
    public void setChange_reason(String change_reason)
    {
        this.change_reason = change_reason;
    }

	public String getInv_type()
    {
        return inv_type;
    }
    public void setInv_type(String inv_type)
    {
        this.inv_type = inv_type;
    }

	public java.util.Date getChange_date()
    {
        return change_date;
    }
    public void setChange_date(java.util.Date change_date)
    {
        this.change_date = change_date;
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

	public Double getChange_money()
    {
        return change_money;
    }
    public void setChange_money(Double change_money)
    {
        this.change_money = change_money;
    }

	public String getChange_type()
    {
        return change_type;
    }
    public void setChange_type(String change_type)
    {
        this.change_type = change_type;
    }

	public Long getCompare_case_id()
    {
        return compare_case_id;
    }
    public void setCompare_case_id(Long compare_case_id)
    {
        this.compare_case_id = compare_case_id;
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