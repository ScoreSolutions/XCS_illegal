
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

import com.ko.domain.MENU;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseMenu extends BaseDomain{
	// table
	public static final String TABLE_NAME = "MENU";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "MENU.ID";
	public static final String MODULE_IDCol = "MENU.MODULE_ID";
	public static final String MENU_NAMECol = "MENU_NAME";

	public static final String MENU_CODECol = "MENU_CODE";

	public static final String IDCol = "ID";


	// full column name
	public static final String MODULE_IDColomn = "MODULE.ID";
	public static final String MENU_NAMEColumn = "MENU.MENU_NAME";

	public static final String MENU_CODEColumn = "MENU_MENU_CODE";

	public static final String IDColumn = "MENU.ID";


	public static final String[] ALL_COLUMNS =
    {
	 MODULE_IDCol ,MENU_NAMECol	, MENU_CODECol	, pkCol
    };

	public static final String ALL_COLUMN_STRING = MODULE_IDCol+","+ MENU_NAMECol	+","+ MENU_CODECol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+ACTIVECol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?,"+RACE_NAMECol+"=?,"+RACE_CODECol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseMenu(DB db){
		super(db);
	}
	public List<MENU> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<MENU> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<MENU> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<MENU> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<MENU> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<MENU> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<MENU> resultList = new ArrayList<MENU>();
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
	public List<MENU> findByExample(MENU instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<MENU> findByExample(MENU instance,PageUtil pageUtil) throws Exception{
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
	public MENU update()throws Exception{
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
					return (MENU)this;
			}else// not update
				return (MENU)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<MENU> updateList(List<MENU> objList)throws Exception{
		DB db = this.initDB();
		List<MENU> resultList = new ArrayList<MENU>();
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
	public Integer deleteList(List<MENU> objList)throws Exception {
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
	public MENU populate(ResultSet rs)throws Exception{
		MENU result = new MENU(this.db);
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
    private String MODULE_ID;
    
    private String MENU_name;

    private String MENU_code;

    private Long id;

	//**** getter setter ****//
    public String getMODULE_ID()
    {
        return MODULE_ID;
    }
    public void setMODULE_ID(String MODULE_ID)
    {
        this.MODULE_ID = MODULE_ID;
    }
    public String getMENU_name()
    {
        return MENU_name;
    }
    public void setMENU_name(String MENU_name)
    {
        this.MENU_name = MENU_name;
    }

	public String getMENU_code()
    {
        return MENU_code;
    }
    public void setMENU_code(String MENU_code)
    {
        this.MENU_code = MENU_code;
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

