








 

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

import com.ko.domain.ConfigShareMoneyPercent;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseConfigShareMoneyPercent extends BaseDomain{
	// table
	public static final String TABLE_NAME = "CONFIG_SHARE_MONEY_PERCENT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "CONFIG_SHARE_MONEY_PERCENT.ID";

	// short name column
	public static final String TYPE_CODECol = "TYPE_CODE";

	public static final String DUTY_CODECol = "DUTY_CODE";

	public static final String PENALTY_CASE_LAW_IDCol = "PENALTY_CASE_LAW_ID";

	public static final String REWARD_LIMITCol = "REWARD_LIMIT";

	public static final String BRIBE_LIMITCol = "BRIBE_LIMIT";

	public static final String TREASURYCol = "TREASURY";

	public static final String REWARDCol = "REWARD";

	public static final String BRIBECol = "BRIBE";

	public static final String ISNOTICECol = "ISNOTICE";

	public static final String LEGISLATION_IDCol = "LEGISLATION_ID";

	public static final String IDCol = "ID";
	public static final String INDICTMENT_IDCol="INDICTMENT_ID";
		
	//}


	// full column name
	public static final String TYPE_CODEColumn = "CONFIG_SHARE_MONEY_PERCENT.TYPE_CODE";

	public static final String DUTY_CODEColumn = "CONFIG_SHARE_MONEY_PERCENT.DUTY_CODE";

	public static final String PENALTY_CASE_LAW_IDColumn = "CONFIG_SHARE_MONEY_PERCENT.PENALTY_CASE_LAW_ID";

	public static final String REWARD_LIMITColumn = "CONFIG_SHARE_MONEY_PERCENT.REWARD_LIMIT";

	public static final String BRIBE_LIMITColumn = "CONFIG_SHARE_MONEY_PERCENT.BRIBE_LIMIT";

	public static final String TREASURYColumn = "CONFIG_SHARE_MONEY_PERCENT.TREASURY";

	public static final String REWARDColumn = "CONFIG_SHARE_MONEY_PERCENT.REWARD";

	public static final String BRIBEColumn = "CONFIG_SHARE_MONEY_PERCENT.BRIBE";

	public static final String ISNOTICEColumn = "CONFIG_SHARE_MONEY_PERCENT.ISNOTICE";

	public static final String LEGISLATION_IDColumn = "CONFIG_SHARE_MONEY_PERCENT.LEGISLATION_ID";

	public static final String IDColumn = "CONFIG_SHARE_MONEY_PERCENT.ID";
	
	public static final String INDICTMENT_IDColumn = "CONFIG_SHARE_MONEY_PERCENT.INDICTMENT_ID";


	public static final String[] ALL_COLUMNS =
    {
	 TYPE_CODECol	, DUTY_CODECol	, PENALTY_CASE_LAW_IDCol	, REWARD_LIMITCol	, BRIBE_LIMITCol	, TREASURYCol	, REWARDCol	, BRIBECol	, ISNOTICECol	, LEGISLATION_IDCol	, INDICTMENT_IDCol, pkCol
    };

	public static final String ALL_COLUMN_STRING =  TYPE_CODECol	+","+ DUTY_CODECol	+","+ PENALTY_CASE_LAW_IDCol	+","+ REWARD_LIMITCol	+","+ BRIBE_LIMITCol	+","+ TREASURYCol	+","+ REWARDCol	+","+ BRIBECol	+","+ ISNOTICECol	+","+ LEGISLATION_IDCol	+","+ INDICTMENT_IDCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+TYPE_CODECol+"=?,"+DUTY_CODECol+"=?,"+PENALTY_CASE_LAW_IDCol+"=?,"+REWARD_LIMITCol+"=?,"+BRIBE_LIMITCol+"=?,"+TREASURYCol+"=?,"+REWARDCol+"=?,"+BRIBECol+"=?,"+ISNOTICECol+"=?,"+LEGISLATION_IDCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseConfigShareMoneyPercent(DB db){
		super(db);
	}



public synchronized ConfigShareMoneyPercent create() throws Exception{
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
					return (ConfigShareMoneyPercent)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ConfigShareMoneyPercent> createList(List<ConfigShareMoneyPercent> objList)throws Exception{
    	DB db = this.initDB();
    	List<ConfigShareMoneyPercent> resultList = new ArrayList<ConfigShareMoneyPercent>();
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
	public ConfigShareMoneyPercent findByPk(Long id)throws Exception{
		List<ConfigShareMoneyPercent> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<ConfigShareMoneyPercent> findByPks(List<Long> ids)throws Exception{
		List<ConfigShareMoneyPercent> resultList = new ArrayList<ConfigShareMoneyPercent>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<ConfigShareMoneyPercent> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<ConfigShareMoneyPercent> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<ConfigShareMoneyPercent> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<ConfigShareMoneyPercent> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<ConfigShareMoneyPercent> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<ConfigShareMoneyPercent> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<ConfigShareMoneyPercent> resultList = new ArrayList<ConfigShareMoneyPercent>();
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
	public List<ConfigShareMoneyPercent> findByExample(ConfigShareMoneyPercent instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<ConfigShareMoneyPercent> findByExample(ConfigShareMoneyPercent instance,PageUtil pageUtil) throws Exception{
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
	public ConfigShareMoneyPercent update()throws Exception{
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
					return (ConfigShareMoneyPercent)this;
			}else// not update
				return (ConfigShareMoneyPercent)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<ConfigShareMoneyPercent> updateList(List<ConfigShareMoneyPercent> objList)throws Exception{
		DB db = this.initDB();
		List<ConfigShareMoneyPercent> resultList = new ArrayList<ConfigShareMoneyPercent>();
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
	public Integer deleteList(List<ConfigShareMoneyPercent> objList)throws Exception {
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
	public ConfigShareMoneyPercent populate(ResultSet rs)throws Exception{
		ConfigShareMoneyPercent result = new ConfigShareMoneyPercent(this.db);
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
    private String type_code;

    private String duty_code;

    private String penalty_case_law_id;

    private Double reward_limit;

    private Double bribe_limit;

    private Long treasury;

    private Long reward;

    private Long bribe;

    private String isnotice;

    private Long legislation_id;
    private Long indictment_id;

    private Long id;

	//**** getter setter ****//
	public String getType_code()
    {
        return type_code;
    }
    public void setType_code(String type_code)
    {
        this.type_code = type_code;
    }

	public String getDuty_code()
    {
        return duty_code;
    }
    public void setDuty_code(String duty_code)
    {
        this.duty_code = duty_code;
    }

	public String getPenalty_case_law_id()
    {
        return penalty_case_law_id;
    }
    public void setPenalty_case_law_id(String penalty_case_law_id)
    {
        this.penalty_case_law_id = penalty_case_law_id;
    }

	public Double getReward_limit()
    {
        return reward_limit;
    }
    public void setReward_limit(Double reward_limit)
    {
        this.reward_limit = reward_limit;
    }

	public Double getBribe_limit()
    {
        return bribe_limit;
    }
    public void setBribe_limit(Double bribe_limit)
    {
        this.bribe_limit = bribe_limit;
    }

	public Long getTreasury()
    {
        return treasury;
    }
    public void setTreasury(Long treasury)
    {
        this.treasury = treasury;
    }

	public Long getReward()
    {
        return reward;
    }
    public void setReward(Long reward)
    {
        this.reward = reward;
    }

	public Long getBribe()
    {
        return bribe;
    }
    public void setBribe(Long bribe)
    {
        this.bribe = bribe;
    }

	public String getIsnotice()
    {
        return isnotice;
    }
    public void setIsnotice(String isnotice)
    {
        this.isnotice = isnotice;
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



	public Long getIndictment_id() {
		return indictment_id;
	}



	public void setIndictment_id(Long indictmentId) {
		indictment_id = indictmentId;
	}
    

}