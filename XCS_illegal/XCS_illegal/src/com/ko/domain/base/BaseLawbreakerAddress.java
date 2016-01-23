








 

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

import com.ko.domain.LawbreakerAddress;
import com.ko.util.DB;
import com.ko.webapp.util.FormValidator;
import com.ko.webapp.util.PageUtil;

public class BaseLawbreakerAddress extends BaseDomain{
	// table
	public static final String TABLE_NAME = "LAWBREAKER_ADDRESS";
	public static String SEQUENCE_NAME = TABLE_NAME+"_SEQ";
	//public String viewName ="";

	// pk
	public static final String pkCol = "ID";
	public static final String pkColumn = "LAWBREAKER_ADDRESS.ID";

	// short name column
	public static final String DESCRIPTIONCol = "DESCRIPTION";

	public static final String FAX_NOCol = "FAX_NO";

	public static final String TEL_NOCol = "TEL_NO";

	public static final String ZIPCODECol = "ZIPCODE";

	public static final String PROVINCE_CODECol = "PROVINCE_CODE";

	public static final String DISTRIC_CODECol = "DISTRIC_CODE";

	public static final String SUBDISTRIC_CODECol = "SUBDISTRIC_CODE";

	public static final String MOOCol = "MOO";

	public static final String ROADCol = "ROAD";

	public static final String SOICol = "SOI";

	public static final String ADDRESS_NAMECol = "ADDRESS_NAME";

	public static final String ADDRESSCol = "ADDRESS";

	public static final String LAWBREAKER_NOCol = "LAWBREAKER_NO";

	public static final String IDCol = "ID";

    public static final String COORDINATE_YCol = "COORDINATE_Y";

	public static final String COORDINATE_XCol = "COORDINATE_X";
	// full column name
	public static final String DESCRIPTIONColumn = "LAWBREAKER_ADDRESS.DESCRIPTION";

	public static final String FAX_NOColumn = "LAWBREAKER_ADDRESS.FAX_NO";

	public static final String TEL_NOColumn = "LAWBREAKER_ADDRESS.TEL_NO";

	public static final String ZIPCODEColumn = "LAWBREAKER_ADDRESS.ZIPCODE";

	public static final String PROVINCE_CODEColumn = "LAWBREAKER_ADDRESS.PROVINCE_CODE";

	public static final String DISTRIC_CODEColumn = "LAWBREAKER_ADDRESS.DISTRIC_CODE";

	public static final String SUBDISTRIC_CODEColumn = "LAWBREAKER_ADDRESS.SUBDISTRIC_CODE";

	public static final String MOOColumn = "LAWBREAKER_ADDRESS.MOO";

	public static final String ROADColumn = "LAWBREAKER_ADDRESS.ROAD";

	public static final String SOIColumn = "LAWBREAKER_ADDRESS.SOI";

	public static final String ADDRESS_NAMEColumn = "LAWBREAKER_ADDRESS.ADDRESS_NAME";

	public static final String ADDRESSColumn = "LAWBREAKER_ADDRESS.ADDRESS";

	public static final String LAWBREAKER_NOColumn = "LAWBREAKER_ADDRESS.LAWBREAKER_NO";

	public static final String IDColumn = "LAWBREAKER_ADDRESS.ID";

    public static final String COORDINATE_YColumn = "LAWBREAKER_ADDRESS.COORDINATE_Y";

	public static final String COORDINATE_XColumn = "LAWBREAKER_ADDRESS.COORDINATE_X";

	public static final String[] ALL_COLUMNS =
    {
	 COORDINATE_XCol, COORDINATE_YCol,  DESCRIPTIONCol	, FAX_NOCol	, TEL_NOCol	, ZIPCODECol	, PROVINCE_CODECol	, DISTRIC_CODECol	, SUBDISTRIC_CODECol	, MOOCol	, ROADCol	, SOICol	, ADDRESS_NAMECol	, ADDRESSCol	, LAWBREAKER_NOCol	, pkCol
    };

	public static final String ALL_COLUMN_STRING =  COORDINATE_XCol+","+COORDINATE_YCol+","+ DESCRIPTIONCol	+","+ FAX_NOCol	+","+ TEL_NOCol	+","+ ZIPCODECol	+","+ PROVINCE_CODECol	+","+ DISTRIC_CODECol	+","+ SUBDISTRIC_CODECol	+","+ MOOCol	+","+ ROADCol	+","+ SOICol	+","+ ADDRESS_NAMECol	+","+ ADDRESSCol	+","+ LAWBREAKER_NOCol	+","+ pkCol	;

    public static final String SQL_SELECT = " select "+ALL_COLUMN_STRING+" from "+TABLE_NAME;
    public static final String SQL_COUNT  = " select count(*) from "+TABLE_NAME;
    //public static final String SQL_INSERT = " insert into "+TABLE_NAME+ " ("+ALL_COLUMN_STRING+") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,"+SEQUENCE_NAME+".nextVal) ";
    public static final String SQL_INSERT = " insert into "+TABLE_NAME+" ";
    public static final String SQL_DELETE = " delete from "+TABLE_NAME+" ";
    //public static final String SQL_UPDATE = " update "+TABLE_NAME+" set "+DESCRIPTIONCol+"=?,"+FAX_NOCol+"=?,"+TEL_NOCol+"=?,"+ZIPCODECol+"=?,"+PROVINCE_CODECol+"=?,"+DISTRIC_CODECol+"=?,"+SUBDISTRIC_CODECol+"=?,"+MOOCol+"=?,"+ROADCol+"=?,"+SOICol+"=?,"+ADDRESS_NAMECol+"=?,"+ADDRESSCol+"=?,"+LAWBREAKER_NOCol+"=?,"+ADDRESS_NOCol+"=?";
	public static final String SQL_UPDATE = " update "+TABLE_NAME+" set ";

	//**** constructor ****
	
	public BaseLawbreakerAddress(DB db){
		super(db);
	}



public synchronized LawbreakerAddress create() throws Exception{
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
			System.out.println("sql-->"+sql_insert);
			//System.out.println(objList);

			prep = db.getParameterizedStatement(sql_insert, objList.toArray());
			//logger.debug(SQL_INSERT);
			if( prep.executeUpdate() == 1 ){
				prep = db.getParameterizedStatement(db.getIdentityString(SEQUENCE_NAME), null);
				rs = prep.executeQuery();
				if( rs.next() ){
	 				this.id = new Long(rs.getString(1));
					return (LawbreakerAddress)this;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<LawbreakerAddress> createList(List<LawbreakerAddress> objList)throws Exception{
    	DB db = this.initDB();
    	List<LawbreakerAddress> resultList = new ArrayList<LawbreakerAddress>();
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
	public LawbreakerAddress findByPk(Long id)throws Exception{
		List<LawbreakerAddress> resultList = this.findByWhere(pkCol+"=?", id);
		return (resultList.size()>0)?resultList.get(0):null;
	}
	public List<LawbreakerAddress> findByPks(List<Long> ids)throws Exception{
		List<LawbreakerAddress> resultList = new ArrayList<LawbreakerAddress>();
		for( int i=0;i<ids.size();i++ )
			resultList.add(this.findByPk(ids.get(i)));
		return resultList;
	}
	public List<LawbreakerAddress> findAll()throws Exception{
		return findByWhere(null,null);
	}
	public List<LawbreakerAddress> findAll(PageUtil pageUtil)throws Exception{
		return findByWhere(null,null,pageUtil);
	}
	public List<LawbreakerAddress> findByWhere(String where,Object obj)throws Exception{
		return this.findByWhere(where,new Object[]{obj});
	}
	public List<LawbreakerAddress> findByWhere(String where,Object[] objs)throws Exception{
		return this.findByWhere(where, objs, null);
	}
	public List<LawbreakerAddress> findByWhere(String where,Object obj,PageUtil pageUtil)throws Exception{
		return findByWhere(where,new Object[]{obj},pageUtil);
	}
	public List<LawbreakerAddress> findByWhere(String where,Object[] objs,PageUtil pageUtil)throws Exception{
		DB db = this.initDB();
		List<LawbreakerAddress> resultList = new ArrayList<LawbreakerAddress>();
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
	public List<LawbreakerAddress> findByExample(LawbreakerAddress instance) throws Exception{
		return findByExample(instance,null);
	}
	public List<LawbreakerAddress> findByExample(LawbreakerAddress instance,PageUtil pageUtil) throws Exception{
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
	public LawbreakerAddress update()throws Exception{
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
					return (LawbreakerAddress)this;
			}else// not update
				return (LawbreakerAddress)this;
		}catch(Exception e){
			throw e;
		}finally{
			this.closeDB(db);
		}
		return null;
	}
	public List<LawbreakerAddress> updateList(List<LawbreakerAddress> objList)throws Exception{
		DB db = this.initDB();
		List<LawbreakerAddress> resultList = new ArrayList<LawbreakerAddress>();
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
	public Integer deleteList(List<LawbreakerAddress> objList)throws Exception {
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
	public LawbreakerAddress populate(ResultSet rs)throws Exception{
		LawbreakerAddress result = new LawbreakerAddress(this.db);
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
    private String description;

    private String fax_no;

    private String tel_no;

    private String zipcode;

    private String province_code;

    private String distric_code;

    private String subdistric_code;

    private Long moo;

    private String road;

    private String soi;

    private String address_name;

    private String address;

    private Long lawbreaker_no;

    private Long address_no;

    private Double coordinate_y;

    private Double coordinate_x;

    private Long id;

	//**** getter setter ****//


    public Double getCoordinate_y() {
        return coordinate_y;
    }

    public void setCoordinate_y(Double coordinate_y) {
        this.coordinate_y = coordinate_y;
    }

    public Double getCoordinate_x() {
        return coordinate_x;
    }

    public void setCoordinate_x(Double coordinate_x) {
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

	public String getDistric_code()
    {
        return distric_code;
    }
    public void setDistric_code(String distric_code)
    {
        this.distric_code = distric_code;
    }

	public String getSubdistric_code()
    {
        return subdistric_code;
    }
    public void setSubdistric_code(String subdistric_code)
    {
        this.subdistric_code = subdistric_code;
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

	public Long getLawbreaker_no()
    {
        return lawbreaker_no;
    }
    public void setLawbreaker_no(Long lawbreaker_no)
    {
        this.lawbreaker_no = lawbreaker_no;
    }

	public Long getAddress_no()
    {
        return address_no;
    }
    public void setAddress_no(Long address_no)
    {
        this.address_no = address_no;
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