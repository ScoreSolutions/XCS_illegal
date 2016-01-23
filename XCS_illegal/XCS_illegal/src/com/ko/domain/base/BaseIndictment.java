








 

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

import com.ko.domain.Indictment;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseIndictment extends BaseDomain{
	// table
	public static final String TABLE_NAME = "INDICTMENT";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "INDICTMENT_ID";
	public static final String pkColumn = "INDICTMENT.INDICTMENT_ID";

	// short name column
	public static final String IS_PROVECol = "IS_PROVE";
	
	public static final String GUILT_MST_IDCol = "GUILT_MST_ID";

	public static final String REMARKSCol = "REMARKS";

	public static final String EXHIBIT_WILDCol = "EXHIBIT_WILD";

	public static final String ISIMPRISONCol = "ISIMPRISON";

	public static final String FINE_RATECol = "FINE_RATE";

	public static final String ISFINECol = "ISFINE";

	public static final String PENALTY_DESCCol = "PENALTY_DESC";

	public static final String PENALTY_CASE_LAW_IDCol = "PENALTY_CASE_LAW_ID";

	public static final String GUILT_BASECol = "GUILT_BASE";

	public static final String CASE_LAW_IDCol = "CASE_LAW_ID";

	public static final String LAW_IDCol = "LAW_ID";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String INDICTMENT_IDCol = "INDICTMENT_ID";


	// full column name
	public static final String IS_PROVEColumn = "INDICTMENT.IS_PROVE";
	
	public static final String GUILT_MST_IDColumn = "INDICTMENT.GUILT_MST_ID";

	public static final String REMARKSColumn = "INDICTMENT.REMARKS";

	public static final String EXHIBIT_WILDColumn = "INDICTMENT.EXHIBIT_WILD";

	public static final String ISIMPRISONColumn = "INDICTMENT.ISIMPRISON";

	public static final String FINE_RATEColumn = "INDICTMENT.FINE_RATE";

	public static final String ISFINEColumn = "INDICTMENT.ISFINE";

	public static final String PENALTY_DESCColumn = "INDICTMENT.PENALTY_DESC";

	public static final String PENALTY_CASE_LAW_IDColumn = "INDICTMENT.PENALTY_CASE_LAW_ID";

	public static final String GUILT_BASEColumn = "INDICTMENT.GUILT_BASE";

	public static final String CASE_LAW_IDColumn = "INDICTMENT.CASE_LAW_ID";

	public static final String LAW_IDColumn = "INDICTMENT.LAW_ID";

	public static final String UPDATE_ONColumn = "INDICTMENT.UPDATE_ON";

	public static final String UPDATE_BYColumn = "INDICTMENT.UPDATE_BY";

	public static final String CREATE_ONColumn = "INDICTMENT.CREATE_ON";

	public static final String CREATE_BYColumn = "INDICTMENT.CREATE_BY";

	public static final String INDICTMENT_IDColumn = "INDICTMENT.INDICTMENT_ID";


	public static final String[] ALL_COLUMNS =
    {
	 IS_PROVECol, GUILT_MST_IDCol	, REMARKSCol	, EXHIBIT_WILDCol	, ISIMPRISONCol	, FINE_RATECol	, ISFINECol	, PENALTY_DESCCol	, PENALTY_CASE_LAW_IDCol	, GUILT_BASECol	, CASE_LAW_IDCol	, LAW_IDCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING = IS_PROVECol + "," +  GUILT_MST_IDCol	+","+ REMARKSCol	+","+ EXHIBIT_WILDCol	+","+ ISIMPRISONCol	+","+ FINE_RATECol	+","+ ISFINECol	+","+ PENALTY_DESCCol	+","+ PENALTY_CASE_LAW_IDCol	+","+ GUILT_BASECol	+","+ CASE_LAW_IDCol	+","+ LAW_IDCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+GUILT_MST_IDCol+"=?,"+REMARKSCol+"=?,"+EXHIBIT_WILDCol+"=?,"+ISIMPRISONCol+"=?,"+FINE_RATECol+"=?,"+ISFINECol+"=?,"+PENALTY_DESCCol+"=?,"+PENALTY_CASE_LAW_IDCol+"=?,"+GUILT_BASECol+"=?,"+CASE_LAW_IDCol+"=?,"+LAW_IDCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseIndictment(DB db){
		super(db);
	}



public synchronized Indictment create() throws Exception{
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
	 				this.indictment_id = new Long(rs.getString(1));
					return (Indictment)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Indictment> createList(List<Indictment> objList)throws Exception{
    	DB db = this.initDB();
    	List<Indictment> resultList = new ArrayList<Indictment>();
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
	public Indictment findByPk(Long id)throws Exception{
		List<Indictment> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<Indictment> findByPks(List<Long> ids)throws Exception{
		List<Indictment> resultList = new ArrayList<Indictment>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<Indictment> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<Indictment> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<Indictment> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<Indictment> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<Indictment> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<Indictment> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<Indictment> resultList = new ArrayList<Indictment>();
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
	public List<Indictment> findByExample(Indictment instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<Indictment> findByExample(Indictment instance,PageUtil pageUtil) throws Exception{
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
	public Indictment update()throws Exception{
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
					objList.add(this.indictment_id);// pk
			}
			if( parameter.length()> 0 ){
				String sql_update = SQL_UPDATE+parameter.substring(0, parameter.lastIndexOf(","));
				//System.out.println(sql_update);
				//System.out.println("obj"+objList);
				prep = db.getParameterizedStatement(db.appendWhere(sql_update,pkCol+"=?"), objList.toArray());
				if( prep.executeUpdate() == 1 )
					return (Indictment)this;
			}else// not update
				return (Indictment)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<Indictment> updateList(List<Indictment> objList)throws Exception{
		DB db = this.initDB();
		List<Indictment> resultList = new ArrayList<Indictment>();
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
		return this.deleteByPk(this.indictment_id);
	}
	public Integer deleteList(List<Indictment> objList)throws Exception {
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
	public Indictment populate(ResultSet rs)throws Exception{
		Indictment result = new Indictment(this.db);
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
    private String is_prove;
    
    private String guilt_mst_id;

    private String remarks;

    private String exhibit_wild;

    private String isimprison;

    private String fine_rate;

    private String isfine;

    private String penalty_desc;

    private String penalty_case_law_id;

    private String guilt_base;

    private String case_law_id;

    private String law_id;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private Long indictment_id;

	//**** getter setter ****//
    public String getIs_prove(){
    	return is_prove;
    }
    public void setIs_prove(String value){
    	is_prove = value;
    }
    
	public String getGuilt_mst_id()
    {
        return guilt_mst_id;
    }
    public void setGuilt_mst_id(String guilt_mst_id)
    {
        this.guilt_mst_id = guilt_mst_id;
    }

	public String getRemarks()
    {
        return remarks;
    }
    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

	public String getExhibit_wild()
    {
        return exhibit_wild;
    }
    public void setExhibit_wild(String exhibit_wild)
    {
        this.exhibit_wild = exhibit_wild;
    }

	public String getIsimprison()
    {
        return isimprison;
    }
    public void setIsimprison(String isimprison)
    {
        this.isimprison = isimprison;
    }

	public String getFine_rate()
    {
        return fine_rate;
    }
    public void setFine_rate(String fine_rate)
    {
        this.fine_rate = fine_rate;
    }

	public String getIsfine()
    {
        return isfine;
    }
    public void setIsfine(String isfine)
    {
        this.isfine = isfine;
    }

	public String getPenalty_desc()
    {
        return penalty_desc;
    }
    public void setPenalty_desc(String penalty_desc)
    {
        this.penalty_desc = penalty_desc;
    }

	public String getPenalty_case_law_id()
    {
        return penalty_case_law_id;
    }
    public void setPenalty_case_law_id(String penalty_case_law_id)
    {
        this.penalty_case_law_id = penalty_case_law_id;
    }

	public String getGuilt_base()
    {
        return guilt_base;
    }
    public void setGuilt_base(String guilt_base)
    {
        this.guilt_base = guilt_base;
    }

	public String getCase_law_id()
    {
        return case_law_id;
    }
    public void setCase_law_id(String case_law_id)
    {
        this.case_law_id = case_law_id;
    }

	public String getLaw_id()
    {
        return law_id;
    }
    public void setLaw_id(String law_id)
    {
        this.law_id = law_id;
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

	public Long getIndictment_id()
    {
        return indictment_id;
    }
    public void setIndictment_id(Long indictment_id)
    {
        this.indictment_id = indictment_id;
    }

}