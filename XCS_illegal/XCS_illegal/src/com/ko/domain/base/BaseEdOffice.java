








 

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

import com.ko.domain.EdOffice;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseEdOffice extends BaseDomain{
	// table
	public static final String TABLE_NAME = "ED_OFFICE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "ED_OFFICE.ID";

	// short name column
	public static final String UPD_DATECol = "UPD_DATE";

	public static final String UPD_USERIDCol = "UPD_USERID";

	public static final String END_DATECol = "END_DATE";

	public static final String BEGIN_DATECol = "BEGIN_DATE";

	public static final String SUPOFFCODECol = "SUPOFFCODE";

	public static final String TAMBOL_CODECol = "TAMBOL_CODE";

	public static final String INDC_OFFCol = "INDC_OFF";

	public static final String SHORT_NAMECol = "SHORT_NAME";

	public static final String OFFNAMECol = "OFFNAME";

	public static final String OFFCODECol = "OFFCODE";

	public static final String IDCol = "ID";


	// full column name
	public static final String UPD_DATEColumn = "ED_OFFICE.UPD_DATE";

	public static final String UPD_USERIDColumn = "ED_OFFICE.UPD_USERID";

	public static final String END_DATEColumn = "ED_OFFICE.END_DATE";

	public static final String BEGIN_DATEColumn = "ED_OFFICE.BEGIN_DATE";

	public static final String SUPOFFCODEColumn = "ED_OFFICE.SUPOFFCODE";

	public static final String TAMBOL_CODEColumn = "ED_OFFICE.TAMBOL_CODE";

	public static final String INDC_OFFColumn = "ED_OFFICE.INDC_OFF";

	public static final String SHORT_NAMEColumn = "ED_OFFICE.SHORT_NAME";

	public static final String OFFNAMEColumn = "ED_OFFICE.OFFNAME";

	public static final String OFFCODEColumn = "ED_OFFICE.OFFCODE";

	public static final String IDColumn = "ED_OFFICE.ID";


	public static final String[] ALL_COLUMNS =
    {
	 UPD_DATECol	, UPD_USERIDCol	, END_DATECol	, BEGIN_DATECol	, SUPOFFCODECol	, TAMBOL_CODECol	, INDC_OFFCol	, SHORT_NAMECol	, OFFNAMECol	, OFFCODECol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  UPD_DATECol	+","+ UPD_USERIDCol	+","+ END_DATECol	+","+ BEGIN_DATECol	+","+ SUPOFFCODECol	+","+ TAMBOL_CODECol	+","+ INDC_OFFCol	+","+ SHORT_NAMECol	+","+ OFFNAMECol	+","+ OFFCODECol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+UPD_DATECol+"=?,"+UPD_USERIDCol+"=?,"+END_DATECol+"=?,"+BEGIN_DATECol+"=?,"+SUPOFFCODECol+"=?,"+TAMBOL_CODECol+"=?,"+INDC_OFFCol+"=?,"+SHORT_NAMECol+"=?,"+OFFNAMECol+"=?,"+OFFCODECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseEdOffice(DB db){
		super(db);
	}



public synchronized EdOffice create() throws Exception{
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
					return (EdOffice)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<EdOffice> createList(List<EdOffice> objList)throws Exception{
    	DB db = this.initDB();
    	List<EdOffice> resultList = new ArrayList<EdOffice>();
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
	public EdOffice findByPk(Long id)throws Exception{
		List<EdOffice> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<EdOffice> findByPks(List<Long> ids)throws Exception{
		List<EdOffice> resultList = new ArrayList<EdOffice>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<EdOffice> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<EdOffice> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<EdOffice> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<EdOffice> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<EdOffice> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<EdOffice> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<EdOffice> resultList = new ArrayList<EdOffice>();
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
	public List<EdOffice> findByExample(EdOffice instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<EdOffice> findByExample(EdOffice instance,PageUtil pageUtil) throws Exception{
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
	public EdOffice update()throws Exception{
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
				
				//System.out.println("obj"+objList);
				prep = db.getParameterizedStatement(db.appendWhere(sql_update,pkCol+"=?"), objList.toArray());
				if( prep.executeUpdate() == 1 ){
					return (EdOffice)this;
				}
			}else{// not update
				return (EdOffice)this;
			}
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<EdOffice> updateList(List<EdOffice> objList)throws Exception{
		DB db = this.initDB();
		List<EdOffice> resultList = new ArrayList<EdOffice>();
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
	public Integer deleteList(List<EdOffice> objList)throws Exception {
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
	public EdOffice populate(ResultSet rs)throws Exception{
		EdOffice result = new EdOffice(this.db);
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
    private java.util.Date upd_date;

    private String upd_userid;

    private java.util.Date end_date;

    private java.util.Date begin_date;

    private String supoffcode;

    private String tambol_code;

    private String indc_off;

    private String short_name;

    private String offname;

    private String offcode;

    private Long id;

	//**** getter setter ****//
	public java.util.Date getUpd_date()
    {
        return upd_date;
    }
    public void setUpd_date(java.util.Date upd_date)
    {
        this.upd_date = upd_date;
    }

	public String getUpd_userid()
    {
        return upd_userid;
    }
    public void setUpd_userid(String upd_userid)
    {
        this.upd_userid = upd_userid;
    }

	public java.util.Date getEnd_date()
    {
        return end_date;
    }
    public void setEnd_date(java.util.Date end_date)
    {
        this.end_date = end_date;
    }

	public java.util.Date getBegin_date()
    {
        return begin_date;
    }
    public void setBegin_date(java.util.Date begin_date)
    {
        this.begin_date = begin_date;
    }

	public String getSupoffcode()
    {
        return supoffcode;
    }
    public void setSupoffcode(String supoffcode)
    {
        this.supoffcode = supoffcode;
    }

	public String getTambol_code()
    {
        return tambol_code;
    }
    public void setTambol_code(String tambol_code)
    {
        this.tambol_code = tambol_code;
    }

	public String getIndc_off()
    {
        return indc_off;
    }
    public void setIndc_off(String indc_off)
    {
        this.indc_off = indc_off;
    }

	public String getShort_name()
    {
        return short_name;
    }
    public void setShort_name(String short_name)
    {
        this.short_name = short_name;
    }

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

	public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

}