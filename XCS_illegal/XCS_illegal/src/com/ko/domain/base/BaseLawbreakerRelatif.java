








 

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

import com.ko.domain.LawbreakerRelatif;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseLawbreakerRelatif extends BaseDomain{
	// table
	public static final String TABLE_NAME = "LAWBREAKER_RELATIVES";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "LAWBREAKER_RELATIVES.ID";

	// short name column
	public static final String IDCARDNOCol = "IDCARDNO";

	public static final String EMAILCol = "EMAIL";

	public static final String TELCol = "TEL";

	public static final String HOMETOWN_POST_CODECol = "HOMETOWN_POST_CODE";

	public static final String HOMETOWN_PROVINCE_CODECol = "HOMETOWN_PROVINCE_CODE";

	public static final String HOMETOWN_DISTRICT_CODECol = "HOMETOWN_DISTRICT_CODE";

	public static final String HOMETOWN_SUBDISTRICT_CODECol = "HOMETOWN_SUBDISTRICT_CODE";

	public static final String HOMETOWN_ROADCol = "HOMETOWN_ROAD";

	public static final String HOMETOWN_SOICol = "HOMETOWN_SOI";

	public static final String HOMETOWN_MOOCol = "HOMETOWN_MOO";

	public static final String HOMETOWN_ADDRESS_NOCol = "HOMETOWN_ADDRESS_NO";

	public static final String CURRENT_POST_CODECol = "CURRENT_POST_CODE";

	public static final String CURRENT_PROVINCE_CODECol = "CURRENT_PROVINCE_CODE";

	public static final String CURRENT_DISTRICT_CODECol = "CURRENT_DISTRICT_CODE";

	public static final String CURRENT_SUBDISTRICT_CODECol = "CURRENT_SUBDISTRICT_CODE";

	public static final String CURRENT_ROADCol = "CURRENT_ROAD";

	public static final String CURRENT_SOICol = "CURRENT_SOI";

	public static final String CURRENT_MOOCol = "CURRENT_MOO";

	public static final String CURRENT_ADDRESS_NOCol = "CURRENT_ADDRESS_NO";

	public static final String RELATIONCol = "RELATION";

	public static final String LAST_NAMECol = "LAST_NAME";

	public static final String FIRST_NAMECol = "FIRST_NAME";

	public static final String TITLE_CODECol = "TITLE_CODE";

	public static final String LAWBREAKER_NOCol = "LAWBREAKER_NO";

	public static final String UPDATE_ONCol = "UPDATE_ON";

	public static final String UPDATE_BYCol = "UPDATE_BY";

	public static final String CREATE_ONCol = "CREATE_ON";

	public static final String CREATE_BYCol = "CREATE_BY";

	public static final String IDCol = "ID";


	// full column name
	public static final String IDCARDNOColumn = "LAWBREAKER_RELATIVES.IDCARDNO";

	public static final String EMAILColumn = "LAWBREAKER_RELATIVES.EMAIL";

	public static final String TELColumn = "LAWBREAKER_RELATIVES.TEL";

	public static final String HOMETOWN_POST_CODEColumn = "LAWBREAKER_RELATIVES.HOMETOWN_POST_CODE";

	public static final String HOMETOWN_PROVINCE_CODEColumn = "LAWBREAKER_RELATIVES.HOMETOWN_PROVINCE_CODE";

	public static final String HOMETOWN_DISTRICT_CODEColumn = "LAWBREAKER_RELATIVES.HOMETOWN_DISTRICT_CODE";

	public static final String HOMETOWN_SUBDISTRICT_CODEColumn = "LAWBREAKER_RELATIVES.HOMETOWN_SUBDISTRICT_CODE";

	public static final String HOMETOWN_ROADColumn = "LAWBREAKER_RELATIVES.HOMETOWN_ROAD";

	public static final String HOMETOWN_SOIColumn = "LAWBREAKER_RELATIVES.HOMETOWN_SOI";

	public static final String HOMETOWN_MOOColumn = "LAWBREAKER_RELATIVES.HOMETOWN_MOO";

	public static final String HOMETOWN_ADDRESS_NOColumn = "LAWBREAKER_RELATIVES.HOMETOWN_ADDRESS_NO";

	public static final String CURRENT_POST_CODEColumn = "LAWBREAKER_RELATIVES.CURRENT_POST_CODE";

	public static final String CURRENT_PROVINCE_CODEColumn = "LAWBREAKER_RELATIVES.CURRENT_PROVINCE_CODE";

	public static final String CURRENT_DISTRICT_CODEColumn = "LAWBREAKER_RELATIVES.CURRENT_DISTRICT_CODE";

	public static final String CURRENT_SUBDISTRICT_CODEColumn = "LAWBREAKER_RELATIVES.CURRENT_SUBDISTRICT_CODE";

	public static final String CURRENT_ROADColumn = "LAWBREAKER_RELATIVES.CURRENT_ROAD";

	public static final String CURRENT_SOIColumn = "LAWBREAKER_RELATIVES.CURRENT_SOI";

	public static final String CURRENT_MOOColumn = "LAWBREAKER_RELATIVES.CURRENT_MOO";

	public static final String CURRENT_ADDRESS_NOColumn = "LAWBREAKER_RELATIVES.CURRENT_ADDRESS_NO";

	public static final String RELATIONColumn = "LAWBREAKER_RELATIVES.RELATION";

	public static final String LAST_NAMEColumn = "LAWBREAKER_RELATIVES.LAST_NAME";

	public static final String FIRST_NAMEColumn = "LAWBREAKER_RELATIVES.FIRST_NAME";

	public static final String TITLE_CODEColumn = "LAWBREAKER_RELATIVES.TITLE_CODE";

	public static final String LAWBREAKER_NOColumn = "LAWBREAKER_RELATIVES.LAWBREAKER_NO";

	public static final String UPDATE_ONColumn = "LAWBREAKER_RELATIVES.UPDATE_ON";

	public static final String UPDATE_BYColumn = "LAWBREAKER_RELATIVES.UPDATE_BY";

	public static final String CREATE_ONColumn = "LAWBREAKER_RELATIVES.CREATE_ON";

	public static final String CREATE_BYColumn = "LAWBREAKER_RELATIVES.CREATE_BY";

	public static final String IDColumn = "LAWBREAKER_RELATIVES.ID";


	public static final String[] ALL_COLUMNS =
    {
	 IDCARDNOCol	, EMAILCol	, TELCol	, HOMETOWN_POST_CODECol	, HOMETOWN_PROVINCE_CODECol	, HOMETOWN_DISTRICT_CODECol	, HOMETOWN_SUBDISTRICT_CODECol	, HOMETOWN_ROADCol	, HOMETOWN_SOICol	, HOMETOWN_MOOCol	, HOMETOWN_ADDRESS_NOCol	, CURRENT_POST_CODECol	, CURRENT_PROVINCE_CODECol	, CURRENT_DISTRICT_CODECol	, CURRENT_SUBDISTRICT_CODECol	, CURRENT_ROADCol	, CURRENT_SOICol	, CURRENT_MOOCol	, CURRENT_ADDRESS_NOCol	, RELATIONCol	, LAST_NAMECol	, FIRST_NAMECol	, TITLE_CODECol	, LAWBREAKER_NOCol	, UPDATE_ONCol	, UPDATE_BYCol	, CREATE_ONCol	, CREATE_BYCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  IDCARDNOCol	+","+ EMAILCol	+","+ TELCol	+","+ HOMETOWN_POST_CODECol	+","+ HOMETOWN_PROVINCE_CODECol	+","+ HOMETOWN_DISTRICT_CODECol	+","+ HOMETOWN_SUBDISTRICT_CODECol	+","+ HOMETOWN_ROADCol	+","+ HOMETOWN_SOICol	+","+ HOMETOWN_MOOCol	+","+ HOMETOWN_ADDRESS_NOCol	+","+ CURRENT_POST_CODECol	+","+ CURRENT_PROVINCE_CODECol	+","+ CURRENT_DISTRICT_CODECol	+","+ CURRENT_SUBDISTRICT_CODECol	+","+ CURRENT_ROADCol	+","+ CURRENT_SOICol	+","+ CURRENT_MOOCol	+","+ CURRENT_ADDRESS_NOCol	+","+ RELATIONCol	+","+ LAST_NAMECol	+","+ FIRST_NAMECol	+","+ TITLE_CODECol	+","+ LAWBREAKER_NOCol	+","+ UPDATE_ONCol	+","+ UPDATE_BYCol	+","+ CREATE_ONCol	+","+ CREATE_BYCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+IDCARDNOCol+"=?,"+EMAILCol+"=?,"+TELCol+"=?,"+HOMETOWN_POST_CODECol+"=?,"+HOMETOWN_PROVINCE_CODECol+"=?,"+HOMETOWN_DISTRICT_CODECol+"=?,"+HOMETOWN_SUBDISTRICT_CODECol+"=?,"+HOMETOWN_ROADCol+"=?,"+HOMETOWN_SOICol+"=?,"+HOMETOWN_MOOCol+"=?,"+HOMETOWN_ADDRESS_NOCol+"=?,"+CURRENT_POST_CODECol+"=?,"+CURRENT_PROVINCE_CODECol+"=?,"+CURRENT_DISTRICT_CODECol+"=?,"+CURRENT_SUBDISTRICT_CODECol+"=?,"+CURRENT_ROADCol+"=?,"+CURRENT_SOICol+"=?,"+CURRENT_MOOCol+"=?,"+CURRENT_ADDRESS_NOCol+"=?,"+RELATIONCol+"=?,"+LAST_NAMECol+"=?,"+FIRST_NAMECol+"=?,"+TITLE_CODECol+"=?,"+LAWBREAKER_NOCol+"=?,"+UPDATE_ONCol+"=?,"+UPDATE_BYCol+"=?,"+CREATE_ONCol+"=?,"+CREATE_BYCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseLawbreakerRelatif(DB db){
		super(db);
	}



public synchronized LawbreakerRelatif create() throws Exception{
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
					return (LawbreakerRelatif)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<LawbreakerRelatif> createList(List<LawbreakerRelatif> objList)throws Exception{
    	DB db = this.initDB();
    	List<LawbreakerRelatif> resultList = new ArrayList<LawbreakerRelatif>();
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
	public LawbreakerRelatif findByPk(Long id)throws Exception{
		List<LawbreakerRelatif> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<LawbreakerRelatif> findByPks(List<Long> ids)throws Exception{
		List<LawbreakerRelatif> resultList = new ArrayList<LawbreakerRelatif>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<LawbreakerRelatif> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<LawbreakerRelatif> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<LawbreakerRelatif> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<LawbreakerRelatif> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<LawbreakerRelatif> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<LawbreakerRelatif> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<LawbreakerRelatif> resultList = new ArrayList<LawbreakerRelatif>();
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
	public List<LawbreakerRelatif> findByExample(LawbreakerRelatif instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<LawbreakerRelatif> findByExample(LawbreakerRelatif instance,PageUtil pageUtil) throws Exception{
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
	public LawbreakerRelatif update()throws Exception{
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
					return (LawbreakerRelatif)this;
			}else// not update
				return (LawbreakerRelatif)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<LawbreakerRelatif> updateList(List<LawbreakerRelatif> objList)throws Exception{
		DB db = this.initDB();
		List<LawbreakerRelatif> resultList = new ArrayList<LawbreakerRelatif>();
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
	public Integer deleteList(List<LawbreakerRelatif> objList)throws Exception {
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
	public LawbreakerRelatif populate(ResultSet rs)throws Exception{
		LawbreakerRelatif result = new LawbreakerRelatif(this.db);
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
    private String idcardno;

    private String email;

    private String tel;

    private String hometown_post_code;

    private String hometown_province_code;

    private String hometown_district_code;

    private String hometown_subdistrict_code;

    private String hometown_road;

    private String hometown_soi;

    private Long hometown_moo;

    private String hometown_address_no;

    private String current_post_code;

    private String current_province_code;

    private String current_district_code;

    private String current_subdistrict_code;

    private String current_road;

    private String current_soi;

    private Long current_moo;

    private String current_address_no;

    private Long relation;

    private String last_name;

    private String first_name;

    private String title_code;

    private Long lawbreaker_no;

    private java.util.Date update_on;

    private Long update_by;

    private java.util.Date create_on;

    private Long create_by;

    private Long id;

	//**** getter setter ****//
	public String getIdcardno()
    {
        return idcardno;
    }
    public void setIdcardno(String idcardno)
    {
        this.idcardno = idcardno;
    }

	public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

	public String getTel()
    {
        return tel;
    }
    public void setTel(String tel)
    {
        this.tel = tel;
    }

	public String getHometown_post_code()
    {
        return hometown_post_code;
    }
    public void setHometown_post_code(String hometown_post_code)
    {
        this.hometown_post_code = hometown_post_code;
    }

	public String getHometown_province_code()
    {
        return hometown_province_code;
    }
    public void setHometown_province_code(String hometown_province_code)
    {
        this.hometown_province_code = hometown_province_code;
    }

	public String getHometown_district_code()
    {
        return hometown_district_code;
    }
    public void setHometown_district_code(String hometown_district_code)
    {
        this.hometown_district_code = hometown_district_code;
    }

	public String getHometown_subdistrict_code()
    {
        return hometown_subdistrict_code;
    }
    public void setHometown_subdistrict_code(String hometown_subdistrict_code)
    {
        this.hometown_subdistrict_code = hometown_subdistrict_code;
    }

	public String getHometown_road()
    {
        return hometown_road;
    }
    public void setHometown_road(String hometown_road)
    {
        this.hometown_road = hometown_road;
    }

	public String getHometown_soi()
    {
        return hometown_soi;
    }
    public void setHometown_soi(String hometown_soi)
    {
        this.hometown_soi = hometown_soi;
    }

	public Long getHometown_moo()
    {
        return hometown_moo;
    }
    public void setHometown_moo(Long hometown_moo)
    {
        this.hometown_moo = hometown_moo;
    }

	public String getHometown_address_no()
    {
        return hometown_address_no;
    }
    public void setHometown_address_no(String hometown_address_no)
    {
        this.hometown_address_no = hometown_address_no;
    }

	public String getCurrent_post_code()
    {
        return current_post_code;
    }
    public void setCurrent_post_code(String current_post_code)
    {
        this.current_post_code = current_post_code;
    }

	public String getCurrent_province_code()
    {
        return current_province_code;
    }
    public void setCurrent_province_code(String current_province_code)
    {
        this.current_province_code = current_province_code;
    }

	public String getCurrent_district_code()
    {
        return current_district_code;
    }
    public void setCurrent_district_code(String current_district_code)
    {
        this.current_district_code = current_district_code;
    }

	public String getCurrent_subdistrict_code()
    {
        return current_subdistrict_code;
    }
    public void setCurrent_subdistrict_code(String current_subdistrict_code)
    {
        this.current_subdistrict_code = current_subdistrict_code;
    }

	public String getCurrent_road()
    {
        return current_road;
    }
    public void setCurrent_road(String current_road)
    {
        this.current_road = current_road;
    }

	public String getCurrent_soi()
    {
        return current_soi;
    }
    public void setCurrent_soi(String current_soi)
    {
        this.current_soi = current_soi;
    }

	public Long getCurrent_moo()
    {
        return current_moo;
    }
    public void setCurrent_moo(Long current_moo)
    {
        this.current_moo = current_moo;
    }

	public String getCurrent_address_no()
    {
        return current_address_no;
    }
    public void setCurrent_address_no(String current_address_no)
    {
        this.current_address_no = current_address_no;
    }

	public Long getRelation()
    {
        return relation;
    }
    public void setRelation(Long relation)
    {
        this.relation = relation;
    }

	public String getLast_name()
    {
        return last_name;
    }
    public void setLast_name(String last_name)
    {
        this.last_name = last_name;
    }

	public String getFirst_name()
    {
        return first_name;
    }
    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

	public String getTitle_code()
    {
        return title_code;
    }
    public void setTitle_code(String title_code)
    {
        this.title_code = title_code;
    }

	public Long getLawbreaker_no()
    {
        return lawbreaker_no;
    }
    public void setLawbreaker_no(Long lawbreaker_no)
    {
        this.lawbreaker_no = lawbreaker_no;
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

	public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

}