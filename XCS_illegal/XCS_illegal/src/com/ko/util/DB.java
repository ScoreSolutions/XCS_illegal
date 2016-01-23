package com.ko.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.sql.rowset.serial.SerialBlob;


import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import com.ko.Constants;

/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class DB {
	private static final Logger log = Logger.getLogger(Constants.LOG_NAME);
	protected static DB instance = null;

	private Connection link = null;
	private boolean isBeginTx = false;
	private boolean isCommitTx = false;
	private boolean isRollbackTx = false;
	private boolean isClosed = true;
	/*public DB()throws Exception{
		this(null,null,null,null,null);
	}
	public DB(String db_host,String db_name,String db_port,String db_user ,String db_pwd )throws Exception{
		try{
			PropertyUtil propertyUtil = PropertyUtil.getInstance();
			String DB_HOST = propertyUtil.getValue("db.host");
			String DB_NAME = propertyUtil.getValue("db.name");
			String DB_PORT = propertyUtil.getValue("db.port");
			String DB_USERNAME = propertyUtil.getValue("db.user");
			String DB_PASSWORD = propertyUtil.getValue("db.password");
			if( db_host == null && db_name== null && db_user== null & db_pwd == null )
				this.connectdb(DB_HOST,DB_NAME,DB_PORT,DB_USERNAME,DB_PASSWORD);
			else
				this.connectdb(db_host,db_name,db_port,db_user,db_pwd);
		}catch(Exception e){
			throw e;
		}
		//logger.log("OPEN CONNECTION :"+this.conn.toString());
	}*/
	public DB()throws Exception{
		try{
			PropertyUtil propertyUtil = PropertyUtil.getInstance();
			String DB_HOST = propertyUtil.getValue("db.host");
			String DB_NAME = propertyUtil.getValue("db.name");
			String DB_PORT = propertyUtil.getValue("db.port");
			String DB_USERNAME = propertyUtil.getValue("db.user");
			String DB_PASSWORD = propertyUtil.getValue("db.password");
			String NAME_TYPE = propertyUtil.getValue("db.name_type");
			if( this.isClosed ){
				this.connectdb(DB_HOST,DB_NAME,DB_PORT,DB_USERNAME,DB_PASSWORD,NAME_TYPE);
				this.isClosed = false;
			}
		}catch(Exception e){
			//throw e;
			e.printStackTrace();
			//System.out.println(e.);
		}
	}

	/*public static DB getInstance()throws Exception{
	    if (instance == null) {
	        synchronized (DB.class) {
	            //if (instance == null) {
	                instance = new DB();
	            //}
	        }
	    }
	    return instance;
    }*/

	public boolean chkConn() throws Exception{
		boolean ret = false;
		
		PropertyUtil propertyUtil = PropertyUtil.getInstance();
		String DB_HOST = propertyUtil.getValue("db.host");
		String DB_NAME = propertyUtil.getValue("db.name");
		String DB_PORT = propertyUtil.getValue("db.port");
		String DB_USERNAME = propertyUtil.getValue("db.user");
		String DB_PASSWORD = propertyUtil.getValue("db.password");
		String NAME_TYPE = propertyUtil.getValue("db.name_type");

		InitialContext ctx=null;
		DataSource ds=null;
		try {
			ctx = new InitialContext();
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			if(NAME_TYPE.equals("SERVICE_NAME")){
				//Connect With Oracle Service Name
				this.link = DriverManager.getConnection("jdbc:oracle:thin:@"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USERNAME,DB_PASSWORD);
			}else{
				//Connect With Oracle SID
				this.link = DriverManager.getConnection("jdbc:oracle:thin:@"+DB_HOST+":"+DB_PORT+":"+DB_NAME,DB_USERNAME,DB_PASSWORD);
			}
			//ds = (DataSource)ctx.lookup("EL_Jndi");
			//this.link = ds.getConnection();
			
			ret = true;
		}catch(Exception e){
			ret = false;
		}finally{
			if(ctx!=null){
				ctx.close();
			}
		}

		return ret;
	}
	
	public void connectdb(String db_host,String db_name,String db_port,String db_user,String db_pwd,String name_type) throws Exception{
		InitialContext ctx=null;
		DataSource ds=null;
		try {
			ctx = new InitialContext();

			//	standalone
			/*if("EAIDB".equals(db)){
				con = DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION =  (ADDRESS_LIST =(ADDRESS =(PROTOCOL = TCP)(HOST =172.16.49.16)(PORT = 1536)))(CONNECT_DATA = (SERVICE_NAME = EAITRN) ) )","OWCDEV",	"OWCDEV" );
			}else if("NASDB".equals(db)){
				//con = DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 172.16.59.21)(PORT = 1521)))(CONNECT_DATA =(SERVICE_NAME = dbnas) ) )","saisumpan",	"saisumpanpw" );
				con = DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST =172.16.49.16)(PORT = 1536)))(CONNECT_DATA = (SERVICE_NAME = EAITRN) ) )","saisumpan",	"saisumpan" );
			}else if("CVSSDB".equals(db)){
				con = DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION =  (ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 172.16.52.25)(PORT = 1521)))(CONNECT_DATA =(SERVICE_NAME = cvssdb)))","develop",	"develop" );
			}*/

			// websphere server
			/*if("EAIDB".equals(db)){
				ds =  (DataSource)ctx.lookup(prop.getValue("DATASOURCE_EAIDB"));
			}else if("NASDB".equals(db)){
				ds = (DataSource)ctx.lookup(prop.getValue("DATASOURCE_NAS"));
			}else if("CVSSDB".equals(db)){
				ds = (DataSource)ctx.lookup(prop.getValue("DATASOURCE_CVSS"));
			}
			con=ds.getConnection();*/

			// tomcat server
			/*if("EAIDB".equals(db)){
				ds =  (DataSource)ctx.lookup("java:/comp/env/"+prop.getValue("DATASOURCE_EAIDB"));
			}else if("NASDB".equals(db)){
				ds = (DataSource)ctx.lookup("java:/comp/env/"+prop.getValue("DATASOURCE_NAS"));
			}else if("CVSSDB".equals(db)){
				ds = (DataSource)ctx.lookup("java:/comp/env/"+prop.getValue("DATASOURCE_CVSS"));
			}*/

			 //weblogic on project
			//ds = (DataSource)ctx.lookup("EL_Jndi");
			//this.link = ds.getConnection();
			//System.out.println("connection is :"+this.link);

			// direct connection
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			if(name_type.equals("SERVICE_NAME")){
				//Connect With Oracle Service Name
				this.link = DriverManager.getConnection("jdbc:oracle:thin:@"+db_host+":"+db_port+"/"+db_name,db_user,db_pwd);
			}else{
				//Connect With Oracle SID
				this.link = DriverManager.getConnection("jdbc:oracle:thin:@"+db_host+":"+db_port+":"+db_name,db_user,db_pwd);
			}
			//ds = (DataSource)ctx.lookup("java:/comp/env/jdbc/MyDS");
			//this.link = ds.getConnection();
		}catch(Exception e){
			throw e;
		}finally{
			if(ctx!=null){
				ctx.close();
			}
		}
	}
	public void beginTx()throws Exception{
		if( !this.isBeginTx ){
			try {
				this.link.setAutoCommit(false);
				this.isBeginTx=true;
				log.debug("begin Tx:"+this.link);
			} catch (Exception e) {
				throw e;
			}
		}
	}
	public void commitTx()throws Exception{
		if( !this.isCommitTx && !this.isRollbackTx ){
			try {
				if( this.link != null)
					this.link.commit();
				this.isCommitTx=true;
				log.debug("commit Tx:"+this.link);
			} catch (Exception e) {
				//logger(DB_LOG,"COMMIT Tx");
				throw e;
			}
		}
	}
	public void rollbackTx()throws Exception{
		if( !this.isRollbackTx && !this.isCommitTx ){
			try {
				if( this.link != null)
					this.link.rollback();
				this.isRollbackTx=true;
				log.debug("rollback:"+this.link);
			} catch (Exception e) {
				throw e;
			}
		}
	}
	public void closedb() throws Exception{
		if( !this.isClosed ) {
			try {
				if( this.link != null )
					this.link.close();
				this.link = null;
				this.isClosed = true;
				
				//log.debug("close db:"+this.link);
			} catch (Exception e) {
				throw e;
			}
		}
	}
	public Connection getConnection(){
		return this.link;
	}
	public boolean getAutoCommit()throws Exception{
		return this.link.getAutoCommit();
	}
	/*
	// get nextid
	public int getSequnceId(String tableName){
		String seq_name = tableName+"_seq";
		rs = this.select_query("select sequence_id from ".TB_SEQUENCES,"sequence_name='seq_name'");
		if( row=this.fetch(rs) ){
			new_sequence_id = row["sequence_id"]+1;
			sequenceData = array("sequence_id"=>new_sequence_id);
			if( this.update_db(TB_SEQUENCES,sequenceData,"sequence_name='seq_name'") ) {
				return new_sequence_id;
			}
		}else{
			// find primary key
   			rs = this.select_query("SHOW COLUMNS FROM tableName");
   			while (row = this.fetch(rs)) {
        		if( row["Key"]=="PRI" ){
        			pk = row["Field"];
        			break;
        		}
   			}
   			// calculate start sequence
   			if( pk!="" ){
				rs = this.select_query("select max(pk) from tableName");
				row = this.fecth_array(rs);
				start_sequence= ( row[0] != NULL )?row[0]+1:1;
   			}else
   				throw new Exception(" Table:".tableName." Not Have Primary Key");
   			sequenceData = array("sequence_id"=>start_sequence,"sequence_name"=>seq_name);
			this.add_db(TB_SEQUENCES,sequenceData);
			return start_sequence;
		}
	}

	//db.add_db("table",array("field"=>"value"));
	public void add_db(String table, &data){
		global USER_PROFILE;
		arrayRemoveNull(data);
		// ignore value of  update_at,update_by
		unset(data[COL_UPDATED]);
		unset(data[COL_UPDATED_BY]);

		key = array_keys(data);
        value = array_values(data);
		sumdata = count(key);
		for (i=0;i<sumdata;i++)
        {
            if (empty(add)){
                add="(";
            }else{
                add=add+",";
            }
            if (empty(val)){
                val="(";
            }else{
                val=val+",";
            }
            add=add.key[i];
            if( strtolower(key[i]) == COL_CREATED ){
            	value[i] = currentDate();
            	data[key[i]] = value[i];
            }
            if( strtolower(key[i]) == COL_CREATED_BY ){
            	value[i] = USER_PROFILE["UserDetail"].id;
            	data[key[i]] = value[i];
            }
            val=val+"'"+value[i]+"'";
        }
        add=add+")";
        val=val+")";
        sql="INSERT INTO "+table+" "+add+" VALUES "+val;

        logger(DB_LOG,sql);
        if (mysql_query(sql,this.link)){
            return mysql_affected_rows();
        }else{
        	throw e;
        }
	}


	//db.update_db("tabel",array("field"=>"value"),"where");
    public void update_db(String table ,&data,String where){
    	global USER_PROFILE;
		arrayRemoveNull(data);
		// ignore value of  crated_at,created_by
		unset(data[COL_CREATED]);
		unset(data[COL_CREATED_BY]);

        key = array_keys(data);
        value = array_values(data);
        sumdata = count(key);
        set="";
        for (i=0;i<sumdata;i++)
        {
            if (!empty(set)){
                set=set+",";
            }
            // updated_at
            if( strtolower(key[i]) == COL_UPDATED ){
            	value[i] = currentDate();
            	data[key[i]] = value[i];
            }
            // updated_by
            if( strtolower(key[i]) == COL_UPDATED_BY ){
            	value[i] = USER_PROFILE["UserDetail"]+id;
            	data[key[i]] = value[i];
            }
            set=set+key[i]+"='"+value[i]+"'";
        }
        sql="UPDATE "+table+" SET "+set+" WHERE "+where;
		logger(DB_LOG,sql);
        if (mysql_query(sql,this.link)){
            return mysql_affected_rows();
        }else{
            throw new Exception(this.reportError(sql));
        }
    }

	//db.del("table","where");
    public void del(table="table",where=""){
        if( where=="" )
        	sql="DELETE FROM ".table;
        else
        	sql="DELETE FROM ".table." WHERE ".where;
        logger(DB_LOG,sql);
        if (mysql_query(sql,this.link)){
            return mysql_affected_rows();
        }else{
        	throw new Exception(this.reportError(sql));
        }
    }

	//db.num_rows("table","field","where");
    public void num_rows(table,where) {
        if (where=="") {
            where = "";
        } else {
            where = " WHERE ".where;
        }
        sql = "SELECT count(*) FROM ".table.where;
		res = mysql_query(sql,this.link);
		logger(DB_LOG,sql);
        if( arr= mysql_fetch_array(res) ){
            return arr[0];
        }else{
        	throw new Exception(this.reportError(sql));
        	//echo this.reportError(sql);
        }
    }

	//res = db.select_query('SELECT field FROM table WHERE where');
    public void select_query(sql,where="",order="",having="",limit=""){
    	if (where!="") {
            sql .= " WHERE ".where;
        }
		if (order!="") {
            sql .= " Order By ".order;
        }
		if (having!="") {
            sql .= " Having ".having;
        }
        if (limit!="") {
            sql .= " Limit ".limit;
        }
        logger(DB_LOG,sql);
        if (res = mysql_query(sql,this.link)){
            return res;
        }else{
        	throw new Exception(this.reportError(sql));
        	//echo this.reportError(sql);
        }
    }

	//res = db.select_query('SELECT field FROM table WHERE where');
	//rows = db.rows(res);
    public void rows(res="result"){
      if (res = mysql_num_rows(res)){
            return res;
        }else{
            return false;
        }
    }

	//res = db.select_query('SELECT field FROM table WHERE where');
	//while (arr = db.fetch(res)) {
	//		echo arr['a']." - ".arr['c']."<br>\n";
	//}
    public void fetch(result="result"){
      if (res = mysql_fetch_assoc(result) ){
            return res;
      }else{
            return false;
      }
    }
	public void fecth_array(result="result"){
	  if (arr = mysql_fetch_array(result)){
            return arr;
      }else{
            return false;
      }
	}*/

	/*
	public List fetch_array(ResultSet rs)throws Exception{
		ResultSetMetaData metaData = null;
		Object[] objects = null;
		if( rs!=null ){
			metaData = rs.getMetaData();
			objects = new Object[metaData.getColumnCount()];
			for( int i=0;i<metaData.getColumnCount();i++ )
				objects[i] = rs.getObject(i+1);
		}
		return objects;
	}*/

	// ResultSet to Map
	public Map<String, Object> fetch(ResultSet rs)throws Exception{
		ResultSetMetaData metaData = null;
		Map<String, Object> data = new HashMap<String, Object>();
		try{
			if( rs!=null ){
				metaData = rs.getMetaData();
				for( int i=0;i<metaData.getColumnCount();i++ ){
					// need to covert
					data.put(metaData.getColumnName(i+1).toLowerCase(), rs.getObject(i+1));
				}
			}
		}catch(Exception e){
			throw e;
		}
		return data;
	}
	public HashMap<String,Object> fetchToArrayList(ResultSet rs) throws Exception{
		ResultSetMetaData metaData = null;
		HashMap<String, Object> data = new HashMap<String,Object>();
		try{
			if(rs!=null){
				metaData = rs.getMetaData();
				for(int i=0;i<metaData.getColumnCount();i++){
					data.put(metaData.getColumnName(i+1).toLowerCase(),rs.getObject(i+1));
				}
			}
		}catch(Exception e){
			throw e;
		}
		return data;
	}


	public List<Map<String,Object>> toArray(ResultSet rs)throws Exception{
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String,Object> row = null;
		try{
			while( rs.next() ){
				row = this.fetch(rs);
				list.add(row);
			}
		}catch(Exception e){
			throw e;
		}
		return list;
	}
	
	public ArrayList<HashMap<String,Object>> toArrayList(ResultSet rs) throws Exception{
		ArrayList<HashMap<String,Object>> list = new ArrayList<HashMap<String,Object>>();
		HashMap<String,Object> row = null;
		try{
			while(rs.next()){
				row = this.fetchToArrayList(rs);
				list.add(row);
			}
		}catch(Exception e){
			throw e;
		}
		
		return list;
	}

	public PreparedStatement getParameterizedStatement(String sql, Object[] objs)throws SQLException{
    	PreparedStatement prep = this.link.prepareStatement(sql);
        if( objs != null ){
	        for (int i = 0; i < objs.length; i++){
	        	if ( objs[i] instanceof Date){
	        		prep.setObject(i+1, new java.sql.Time(((java.util.Date)objs[i]).getTime()));
	        		//prep.setDate(i+1, new java.sql.Date(((java.util.Date)objs[i]).getTime()));// not work
	        	}else if ( objs[i] instanceof File ){
	        		try {
						java.io.FileInputStream fis = new FileInputStream((File)objs[i]);
						prep.setBinaryStream(i+1, fis, fis.available());
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	}else if ( objs[i] instanceof SerialBlob ){
	        		//prep.setBlob(i+1, (blob)objs[i] );// not work
	        		//prep.setObject(i+1, (Blob)objs[i] );// not work
	        		Blob blob = (Blob)objs[i];
	        		if( blob.length() > 0 )
	        			prep.setBytes(i+1, blob.getBytes(1, (int)blob.length()));
	        		else
	        			prep.setBytes(i+1,null);
	        	}else
					prep.setObject(i+1, objs[i]);
	        }
        }
	    return prep;
	}
	public PreparedStatement getParameterizedStatement(String sql, Object obj)throws SQLException{
	    return getParameterizedStatement(sql, new Object[]{obj});
	}
	private String getWhere(String where){
    	if( where!=null && !where.equals("") && where.trim().length() > 0 ){
    		return " where "+where+" ";
    	}else
    		return "";
	}
	public String appendWhere(String sql , String where){
		System.out.println("whre :" + where);
		return sql + getWhere(where);
	}

	public String getIdentityString(String seqName){
    	// mysql
    	//return "select last_insert_id()";
    	return "select "+seqName+".currval from dual";
    }

	//  for oracle pagination
	public PreparedStatement getPagination(String sql,Object[] objs,int page ,int pageSize)throws SQLException{
		int lastOffset = page*pageSize;
		int firstOffset = lastOffset-(pageSize-1);
		//System.out.println(firstOffset+","+pageSize);
		String newSql = " select * "+
		" from ( select oraclePage.*, rownum oracleRnum "+
		" from ( "+sql+" ) oraclePage "+
		" where rownum <="+lastOffset+") "+
		" where oracleRnum >="+firstOffset;
		return getParameterizedStatement(newSql, objs);
	}
	public static void bindResultSetToObject(ResultSet rs,Object obj)throws Exception{
		// need to covert
		ResultSetMetaData metaData = null;
		try{
			if( rs!=null ){
				metaData = rs.getMetaData();
				for( int i=0;i<metaData.getColumnCount();i++ ){
					DB.bindFieldToObject(rs, metaData.getColumnName(i+1), obj, metaData.getColumnName(i+1) );
				}
			}
		}catch(Exception e){
			throw e;
		}
	}
	public static void bindFieldToObject(ResultSet rs,String field,Object obj,String property)throws Exception{
		Object value = rs.getObject(field);
		if( value != null ){
			///BeanUtil.setProperty(result,date,null); // cannot use null
			// cannot use propertyUtil because its not convert type automatical
			if ( value instanceof java.sql.Date ){
				//System.out.println(rs.getDate(field));  // not work
				//System.out.println(rs.getTime(field));  // not work
				/*
				String dateTime = rs.getTimestamp(field,Calendar.getInstance(Locale.ENGLISH)).toString();
				dateTime = dateTime.substring(0,dateTime.lastIndexOf("."));
				String year = String.valueOf(Integer.parseInt(dateTime.substring(0,4))+543);
				dateTime = year+dateTime.substring(4);
				Date newDate = DateUtil.getDateFromString(dateTime);*/
				
				
				//Date newDate = rs.getDate(field, Calendar.getInstance(Locale.ENGLISH));// not work
				//Date newDate = rs.getTimestamp(field, Calendar.getInstance(Locale.ENGLISH));
				Date newDate = rs.getTimestamp(field, Calendar.getInstance(Constants.DB_LOCALE));
				BeanUtils.setProperty(obj, property , newDate);
				//BeanUtils.setProperty(obj, property , new Date(((java.sql.Date)value).getTime())); // not work
				//BeanUtils.setProperty(obj, property , new Date(rs.getDate(field).getTime())); // not work

			/*}else if ( value instanceof Blob ){// blob
				Blob blob = (Blob)value;
				BeanUtils.setProperty(obj, property, blob);

				//InputStream is = blob.getBinaryStream();
				//BufferedInputStream buffIsStream = new BufferedInputStream(is);
                //byte buf[] = new byte[Constants.MAX_FILE_SIZE];
                //int count = buffIsStream.read(buf);
                //buffIsStream.close();*/
			}else if(value instanceof java.sql.Clob){
				java.sql.Clob newValue = rs.getClob(field);
				BeanUtils.setProperty(obj, property, newValue.getSubString(1, (int)newValue.length()));
			}else//String , Char , Integer , Long ,Double
				BeanUtils.setProperty(obj, property , value);
		}
	}

	/*
	public int getFirstResult(int page, int pageSize) {
		return (page - 1) * pageSize;
	}
    public String getLikePattern(String keyword,String option){
    	String kwLike = null;
		if( option!=null ){
			if( option.equals("1") ){// start with
				kwLike = keyword+"%";
			}else if( option.equals("2") ){// end with
				kwLike = "%"+keyword;
			}else{
				kwLike = "%"+keyword+"%";//defult case = compound with
			}
		}else{
			kwLike = "%"+keyword+"%";// compound with
		}
		return kwLike;
    }

    public String getOrderBy(String sortColumn,String mode){
    	String orderBy="";
    	if( sortColumn!=null && !sortColumn.equals("") ){
    		if( mode!=null ){
    			if( mode.equals("1") )
        			mode="asc";
        		else if( mode.equals("2"))
        			mode="desc";
        		else
        			mode="";
    			orderBy = " order by "+sortColumn+ " "+mode;
    		}else
    			orderBy = " order by "+sortColumn;
		}else{
			orderBy = "";
		}
    	return orderBy;
    }

	public String appendPaging(String sql,PageUtil pageUtil,String tableName){
		if( pageUtil == null )
			return sql;
		else if( pageUtil.getSortColumn() != "" ){
			String mode = " ";
			if( pageUtil.getMode() == "1" ){
				pageUtil.setMode(" asc ");
			}else if( pageUtil.getMode()=="2" ){
				pageUtil.setMode(" desc ");
			}else
				mode = " ";
			sql += " order by "+tableName+"."+pageUtil.getSortColumn()+" "+mode;
		}
		int first = this.getFirstResult(pageUtil.getPage(),pageUtil.getPageSize());
		int pageSize = pageUtil.getPageSize();
		return sql+" limit "+first+","+pageSize+" ";
	}

	//

    private int getIndentityMode(){
    	// before ->1
    	// after -> 2
    	return 1;
    }
    protected String getStringIdentity(){
    	if( getIndentityMode()==1 )
    		return getIdentityString(null);
    	else //if( getIndentityMode() ==2 )
    		return "NULL";
    }*/

}