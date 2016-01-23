








 

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

import com.ko.domain.SuspectAddress;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseSuspectAddress extends BaseDomain{
	// table
	public static final String TABLE_NAME = "SUSPECT_ADDRESS";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "SUSPECT_ADDRESS.ID";

	// short name column
	public static final String COORDINATE_YCol = "COORDINATE_Y";

	public static final String COORDINATE_XCol = "COORDINATE_X";

	public static final String DESCRIPTIONCol = "DESCRIPTION";

	public static final String FAX_NOCol = "FAX_NO";

	public static final String TEL_NOCol = "TEL_NO";

	public static final String ZIPCODECol = "ZIPCODE";

	public static final String PROVINCE_CODECol = "PROVINCE_CODE";

	public static final String DISTRICT_CODECol = "DISTRICT_CODE";

	public static final String SUBDISTRICT_CODECol = "SUBDISTRICT_CODE";

	public static final String MOOCol = "MOO";

	public static final String ROADCol = "ROAD";

	public static final String SOICol = "SOI";

	public static final String ADDRESS_NAMECol = "ADDRESS_NAME";

	public static final String ADDRESSCol = "ADDRESS";

	public static final String SUSPECT_NOCol = "SUSPECT_NO";

	public static final String IDCol = "ID";


	// full column name
	public static final String COORDINATE_YColumn = "SUSPECT_ADDRESS.COORDINATE_Y";

	public static final String COORDINATE_XColumn = "SUSPECT_ADDRESS.COORDINATE_X";

	public static final String DESCRIPTIONColumn = "SUSPECT_ADDRESS.DESCRIPTION";

	public static final String FAX_NOColumn = "SUSPECT_ADDRESS.FAX_NO";

	public static final String TEL_NOColumn = "SUSPECT_ADDRESS.TEL_NO";

	public static final String ZIPCODEColumn = "SUSPECT_ADDRESS.ZIPCODE";

	public static final String PROVINCE_CODEColumn = "SUSPECT_ADDRESS.PROVINCE_CODE";

	public static final String DISTRICT_CODEColumn = "SUSPECT_ADDRESS.DISTRICT_CODE";

	public static final String SUBDISTRICT_CODEColumn = "SUSPECT_ADDRESS.SUBDISTRICT_CODE";

	public static final String MOOColumn = "SUSPECT_ADDRESS.MOO";

	public static final String ROADColumn = "SUSPECT_ADDRESS.ROAD";

	public static final String SOIColumn = "SUSPECT_ADDRESS.SOI";

	public static final String ADDRESS_NAMEColumn = "SUSPECT_ADDRESS.ADDRESS_NAME";

	public static final String ADDRESSColumn = "SUSPECT_ADDRESS.ADDRESS";

	public static final String SUSPECT_NOColumn = "SUSPECT_ADDRESS.SUSPECT_NO";

	public static final String IDColumn = "SUSPECT_ADDRESS.ID";


	public static final String[] ALL_COLUMNS =
    {
	 COORDINATE_YCol	, COORDINATE_XCol	, DESCRIPTIONCol	, FAX_NOCol	, TEL_NOCol	, ZIPCODECol	, PROVINCE_CODECol	, DISTRICT_CODECol	, SUBDISTRICT_CODECol	, MOOCol	, ROADCol	, SOICol	, ADDRESS_NAMECol	, ADDRESSCol	, SUSPECT_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  COORDINATE_YCol	+","+ COORDINATE_XCol	+","+ DESCRIPTIONCol	+","+ FAX_NOCol	+","+ TEL_NOCol	+","+ ZIPCODECol	+","+ PROVINCE_CODECol	+","+ DISTRICT_CODECol	+","+ SUBDISTRICT_CODECol	+","+ MOOCol	+","+ ROADCol	+","+ SOICol	+","+ ADDRESS_NAMECol	+","+ ADDRESSCol	+","+ SUSPECT_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+COORDINATE_YCol+"=?,"+COORDINATE_XCol+"=?,"+DESCRIPTIONCol+"=?,"+FAX_NOCol+"=?,"+TEL_NOCol+"=?,"+ZIPCODECol+"=?,"+PROVINCE_CODECol+"=?,"+DISTRICT_CODECol+"=?,"+SUBDISTRICT_CODECol+"=?,"+MOOCol+"=?,"+ROADCol+"=?,"+SOICol+"=?,"+ADDRESS_NAMECol+"=?,"+ADDRESSCol+"=?,"+SUSPECT_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseSuspectAddress(DB db){
		super(db);
	}



public synchronized SuspectAddress create() throws Exception{
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
					return (SuspectAddress)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SuspectAddress> createList(List<SuspectAddress> objList)throws Exception{
    	DB db = this.initDB();
    	List<SuspectAddress> resultList = new ArrayList<SuspectAddress>();
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
	public SuspectAddress findByPk(Long id)throws Exception{
		List<SuspectAddress> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<SuspectAddress> findByPks(List<Long> ids)throws Exception{
		List<SuspectAddress> resultList = new ArrayList<SuspectAddress>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<SuspectAddress> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<SuspectAddress> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<SuspectAddress> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<SuspectAddress> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<SuspectAddress> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<SuspectAddress> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<SuspectAddress> resultList = new ArrayList<SuspectAddress>();
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
	public List<SuspectAddress> findByExample(SuspectAddress instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<SuspectAddress> findByExample(SuspectAddress instance,PageUtil pageUtil) throws Exception{
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
	public SuspectAddress update()throws Exception{
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
					return (SuspectAddress)this;
			}else// not update
				return (SuspectAddress)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<SuspectAddress> updateList(List<SuspectAddress> objList)throws Exception{
		DB db = this.initDB();
		List<SuspectAddress> resultList = new ArrayList<SuspectAddress>();
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
	public Integer deleteList(List<SuspectAddress> objList)throws Exception {
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
	public SuspectAddress populate(ResultSet rs)throws Exception{
		SuspectAddress result = new SuspectAddress(this.db);
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
    private Double coordinate_y;

    private Double coordinate_x;

    private String description;

    private String fax_no;

    private String tel_no;

    private String zipcode;

    private String province_code;

    private String district_code;

    private String subdistrict_code;

    private Long moo;

    private String road;

    private String soi;

    private String address_name;

    private String address;

    private Long suspect_no;

    private Long id;

	//**** getter setter ****//
	public Double getCoordinate_y()
    {
        return coordinate_y;
    }
    public void setCoordinate_y(Double coordinate_y)
    {
        this.coordinate_y = coordinate_y;
    }

	public Double getCoordinate_x()
    {
        return coordinate_x;
    }
    public void setCoordinate_x(Double coordinate_x)
    {
        this.coordinate_x = coordinate_x;
    }

	public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

	public String getFax_no()
    {
        return fax_no;
    }
    public void setFax_no(String fax_no)
    {
        this.fax_no = fax_no;
    }

	public String getTel_no()
    {
        return tel_no;
    }
    public void setTel_no(String tel_no)
    {
        this.tel_no = tel_no;
    }

	public String getZipcode()
    {
        return zipcode;
    }
    public void setZipcode(String zipcode)
    {
        this.zipcode = zipcode;
    }

	public String getProvince_code()
    {
        return province_code;
    }
    public void setProvince_code(String province_code)
    {
        this.province_code = province_code;
    }

	public String getDistrict_code()
    {
        return district_code;
    }
    public void setDistrict_code(String district_code)
    {
        this.district_code = district_code;
    }

	public String getSubdistrict_code()
    {
        return subdistrict_code;
    }
    public void setSubdistrict_code(String subdistrict_code)
    {
        this.subdistrict_code = subdistrict_code;
    }

	public Long getMoo()
    {
        return moo;
    }
    public void setMoo(Long moo)
    {
        this.moo = moo;
    }

	public String getRoad()
    {
        return road;
    }
    public void setRoad(String road)
    {
        this.road = road;
    }

	public String getSoi()
    {
        return soi;
    }
    public void setSoi(String soi)
    {
        this.soi = soi;
    }

	public String getAddress_name()
    {
        return address_name;
    }
    public void setAddress_name(String address_name)
    {
        this.address_name = address_name;
    }

	public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

	public Long getSuspect_no()
    {
        return suspect_no;
    }
    public void setSuspect_no(Long suspect_no)
    {
        this.suspect_no = suspect_no;
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