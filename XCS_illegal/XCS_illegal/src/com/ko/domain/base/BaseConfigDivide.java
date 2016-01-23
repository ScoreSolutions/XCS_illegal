








 

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

import com.ko.domain.ConfigDivide;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseConfigDivide extends BaseDomain{
	// table
	public static final String TABLE_NAME = "CONFIG_DIVIDE";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "CONFIG_DIVIDE.ID";

	// short name column
	public static final String REMARKSCol = "REMARKS";

	public static final String SHARE_QTYCol = "SHARE_QTY";

	public static final String REF_VALUECol = "REF_VALUE";

	public static final String REF_TABLECol = "REF_TABLE";

	public static final String DUTY_STATUS05Col = "DUTY_STATUS05";

	public static final String DUTY_STATUS04Col = "DUTY_STATUS04";

	public static final String DUTY_STATUS03Col = "DUTY_STATUS03";

	public static final String DUTY_STATUS02Col = "DUTY_STATUS02";

	public static final String DUTY_STATUS01Col = "DUTY_STATUS01";

	public static final String PROPORTIONCol = "PROPORTION";

	public static final String BRIBE_REWARDCol = "BRIBE_REWARD";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String IDCol = "ID";


	// full column name
	public static final String REMARKSColumn = "CONFIG_DIVIDE.REMARKS";

	public static final String SHARE_QTYColumn = "CONFIG_DIVIDE.SHARE_QTY";

	public static final String REF_VALUEColumn = "CONFIG_DIVIDE.REF_VALUE";

	public static final String REF_TABLEColumn = "CONFIG_DIVIDE.REF_TABLE";

	public static final String DUTY_STATUS05Column = "CONFIG_DIVIDE.DUTY_STATUS05";

	public static final String DUTY_STATUS04Column = "CONFIG_DIVIDE.DUTY_STATUS04";

	public static final String DUTY_STATUS03Column = "CONFIG_DIVIDE.DUTY_STATUS03";

	public static final String DUTY_STATUS02Column = "CONFIG_DIVIDE.DUTY_STATUS02";

	public static final String DUTY_STATUS01Column = "CONFIG_DIVIDE.DUTY_STATUS01";

	public static final String PROPORTIONColumn = "CONFIG_DIVIDE.PROPORTION";

	public static final String BRIBE_REWARDColumn = "CONFIG_DIVIDE.BRIBE_REWARD";

	public static final String LEGISLATION_IDColumn = "CONFIG_DIVIDE.LEGISLATION_ID";

	public static final String IDColumn = "CONFIG_DIVIDE.ID";


	public static final String[] ALL_COLUMNS =
    {
	 REMARKSCol	, SHARE_QTYCol	, REF_VALUECol	, REF_TABLECol	, DUTY_STATUS05Col	, DUTY_STATUS04Col	, DUTY_STATUS03Col	, DUTY_STATUS02Col	, DUTY_STATUS01Col	, PROPORTIONCol	, BRIBE_REWARDCol	, LEGISLATION_IDCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  REMARKSCol	+","+ SHARE_QTYCol	+","+ REF_VALUECol	+","+ REF_TABLECol	+","+ DUTY_STATUS05Col	+","+ DUTY_STATUS04Col	+","+ DUTY_STATUS03Col	+","+ DUTY_STATUS02Col	+","+ DUTY_STATUS01Col	+","+ PROPORTIONCol	+","+ BRIBE_REWARDCol	+","+ LEGISLATION_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+REMARKSCol+"=?,"+SHARE_QTYCol+"=?,"+REF_VALUECol+"=?,"+REF_TABLECol+"=?,"+DUTY_STATUS05Col+"=?,"+DUTY_STATUS04Col+"=?,"+DUTY_STATUS03Col+"=?,"+DUTY_STATUS02Col+"=?,"+DUTY_STATUS01Col+"=?,"+PROPORTIONCol+"=?,"+BRIBE_REWARDCol+"=?,"+LEGISLATION_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseConfigDivide(DB db){
		super(db);
	}



public synchronized ConfigDivide create() throws Exception{
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
					return (ConfigDivide)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ConfigDivide> createList(List<ConfigDivide> objList)throws Exception{
    	DB db = this.initDB();
    	List<ConfigDivide> resultList = new ArrayList<ConfigDivide>();
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
	public ConfigDivide findByPk(Long id)throws Exception{
		List<ConfigDivide> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ConfigDivide> findByPks(List<Long> ids)throws Exception{
		List<ConfigDivide> resultList = new ArrayList<ConfigDivide>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ConfigDivide> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ConfigDivide> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ConfigDivide> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ConfigDivide> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ConfigDivide> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ConfigDivide> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ConfigDivide> resultList = new ArrayList<ConfigDivide>();
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
	public List<ConfigDivide> findByExample(ConfigDivide instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ConfigDivide> findByExample(ConfigDivide instance,PageUtil pageUtil) throws Exception{
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
	public ConfigDivide update()throws Exception{
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
					return (ConfigDivide)this;
			}else// not update
				return (ConfigDivide)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ConfigDivide> updateList(List<ConfigDivide> objList)throws Exception{
		DB db = this.initDB();
		List<ConfigDivide> resultList = new ArrayList<ConfigDivide>();
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
	public Integer deleteList(List<ConfigDivide> objList)throws Exception {
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
	public ConfigDivide populate(ResultSet rs)throws Exception{
		ConfigDivide result = new ConfigDivide(this.db);
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
    private String remarks;

    private Long share_qty;

    private String ref_value;

    private String ref_table;

    private String duty_status05;

    private String duty_status04;

    private String duty_status03;

    private String duty_status02;

    private String duty_status01;

    private String proportion;

    private String bribe_reward;

    private Long legislation_id;

    private Long id;

	//**** getter setter ****//
	public String getRemarks()
    {
        return remarks;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

	public Long getShare_qty()
    {
        return share_qty;
    }
    public void setShare_qty(Long share_qty)
    {
        this.share_qty = share_qty;
    }

	public String getRef_value()
    {
        return ref_value;
    }
    public void setRef_value(String ref_value)
    {
        this.ref_value = ref_value;
    }

	public String getRef_table()
    {
        return ref_table;
    }
    public void setRef_table(String ref_table)
    {
        this.ref_table = ref_table;
    }

	public String getDuty_status05()
    {
        return duty_status05;
    }
    public void setDuty_status05(String duty_status05)
    {
        this.duty_status05 = duty_status05;
    }

	public String getDuty_status04()
    {
        return duty_status04;
    }
    public void setDuty_status04(String duty_status04)
    {
        this.duty_status04 = duty_status04;
    }

	public String getDuty_status03()
    {
        return duty_status03;
    }
    public void setDuty_status03(String duty_status03)
    {
        this.duty_status03 = duty_status03;
    }

	public String getDuty_status02()
    {
        return duty_status02;
    }
    public void setDuty_status02(String duty_status02)
    {
        this.duty_status02 = duty_status02;
    }

	public String getDuty_status01()
    {
        return duty_status01;
    }
    public void setDuty_status01(String duty_status01)
    {
        this.duty_status01 = duty_status01;
    }

	public String getProportion()
    {
        return proportion;
    }
    public void setProportion(String proportion)
    {
        this.proportion = proportion;
    }

	public String getBribe_reward()
    {
        return bribe_reward;
    }
    public void setBribe_reward(String bribe_reward)
    {
        this.bribe_reward = bribe_reward;
    }

	public Long getLegislation_id()
    {
        return legislation_id;
    }
    public void setLegislation_id(Long legislation_id)
    {
        this.legislation_id = legislation_id;
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