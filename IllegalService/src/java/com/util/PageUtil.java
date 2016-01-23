package com.util;

import java.util.Enumeration;

import org.apache.log4j.Logger;

import com.Constants;

import javax.servlet.http.HttpServletRequest;

/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class PageUtil {
	/**
	 * Logger for this class
	 */
	private static final Logger log = Logger.getLogger(Constants.LOG_NAME);

	private HttpServletRequest request;
	private int page;
	private int pageSize;
	private int totalRow;
	private String keyword;
	private String sortColumn;
	private String option;
	private String mode;
	private String cmd;
	private String pageUrl;
	
	private final String PAGE_SIZE = "_pageSize";
	private final String PAGE = "_page";
	private final String TOTAL_ROW = "_totalRow";
	
	public PageUtil(){// use for Test
		this.keyword= "";
		this.sortColumn = "";
		this.option = "";
		this.mode = "";
		//page
		this.page = Constants.DEFAULT_PAGE;
		this.pageSize=Constants.DEFAULT_PAGE_SIZE;
		this.totalRow = 0;
		this.pageUrl = "";
	}
//	public PageUtil(HttpServletRequest request) {// user for Web
//		this.request = request;
//		this.cmd = ParameterUtil.getStringParam("cmd",request);
//		// init value
//		this.keyword= ParameterUtil.getStringParam("_keyword", request);
//		this.sortColumn = ParameterUtil.getStringParam("_sort", request);
//		this.option = ParameterUtil.getStringParam("_option", request);
//		this.mode = ParameterUtil.getStringParam("_mode", request);
//
//		// total Row
//		if( request.getAttribute(TOTAL_ROW) != null )
//			this.totalRow = (Integer)request.getAttribute(TOTAL_ROW);
//
//		// pageSize
//		if( request.getAttribute(PAGE_SIZE) != null ){
//			this.pageSize = (Integer)request.getAttribute(PAGE_SIZE);
//		}else
//			this.pageSize=Constants.DEFAULT_PAGE_SIZE;
//
//		// page
//		if( request.getParameter(PAGE)!=null && !request.getParameter(PAGE).equals("") )
//			this.page = Integer.parseInt(request.getParameter(PAGE));
//		else
//			this.page = Constants.DEFAULT_PAGE;
//
//		if( request.getQueryString()!=null && request.getQueryString().indexOf("page=/web")>=0 )
//			this.pageUrl = "process2?action="+ParameterUtil.getStringParam("action", request)+"&cmd="+this.cmd;
//		else
//			this.pageUrl = "process?action="+ParameterUtil.getStringParam("action", request)+"&cmd="+this.cmd;
//
//		request.setAttribute("_rowIndex", getFirstRowIndex());
//	}
	public String getHiddenField(){
		Enumeration paramNames = request.getParameterNames();
		String pageParam ="";
		while(paramNames.hasMoreElements()){
			String param = (String)paramNames.nextElement();
			if( !param.equalsIgnoreCase("action")
				&& !param.equalsIgnoreCase("cmd")
				&& !param.equalsIgnoreCase(PAGE)
				&& !param.equalsIgnoreCase(PAGE_SIZE) 
				&& !param.equalsIgnoreCase("submit") ){
				String[] values = request.getParameterValues(param);
				for( int i=0;i<values.length ; i++ )
					pageParam+="<input type='hidden' name='"+param+"' value='"+values[i]+"'/>\n";
			}
		}
		return pageParam;
	}
	public String getPagination(){
		int totalPage = (int)Math.ceil((double)this.totalRow/this.pageSize);
		//	adjust page
		if( totalPage!=0 && this.page>totalPage)
			this.page = totalPage;
		else if( totalPage==0 || this.page<1 )
			this.page = 1;
		StringBuffer selectPage = new StringBuffer();
		selectPage.append("<form name='_pgform' action='' method='post'>");
		selectPage.append("<script language='JavaScript' type='text/javascript'>");
		selectPage.append("function _pg(url){document._pgform.action=url;document._pgform.submit();}");
		selectPage.append("</script>");
		String strPrvPage = "";
		int prev_page = this.page - 1;
		if( prev_page < 1 ){
			strPrvPage="[<]";
		}else{
			strPrvPage="<a href=\"javascript:_pg('"+this.pageUrl+"&"+PAGE+"="+prev_page+"')\">[<]</a>";
		}
		selectPage.append(strPrvPage);
		// create select page

		//selectPage.append("หน้าที่<select onchange=\"MM_jumpMenu('parent',this,0)\">");
		//selectPage.append("หน้าที่<select onchange=\"document.location = this.options[this.selectedIndex].value\">");
		//selectPage.append("หน้าที่<select onchange=\"window.location.href  = this.options[this.selectedIndex].value\">");
		selectPage.append("หน้าที่ <select onchange=\"_pg(this.options[this.selectedIndex].value)\">");
		for(int i=0; i<totalPage; i++ ){
			if( (i+1) == this.page )
				selectPage.append("<option value='"+(i+1)+"' selected='selected'>"+(i+1)+"</option>");
			else
				selectPage.append("<option value='"+this.pageUrl+"&"+PAGE+"="+(i+1)+"'>"+(i+1)+"</option>");
		}
		selectPage.append("</select>");

		selectPage.append("จาก "+totalPage+" หน้า ");

		// generate next_page
		String strNextPage = "";
		int next_page = this.page + 1;
		if( next_page > totalPage ){
			strNextPage="[>]";
		}else{
			strNextPage="<a href=\"javascript:_pg('"+this.pageUrl+"&"+PAGE+"="+next_page+"')\">[>]</a>";
		}
		selectPage.append(strNextPage);
		// print hidden field
		selectPage.append(getHiddenField());
		selectPage.append("</form>");
		return selectPage.toString();
	}
	/*public String getPagination(){
		//int totalRow = ((Integer)request.getAttribute("total_rows")).intValue();
		int totalPage = (this.totalRow/this.pageSize)+1;

		logger.debug("page="+page+",pageSize="+this.pageSize+",totalRow="+this.totalRow+",totalPage="+totalPage);

		// adjust offset
		if( this.page>totalPage)
			this.page = totalPage;
		else if( this.page<1 )
			this.page = 1;

		String pageParam = this.pageUrl+"&cmd="+this.cmd+"&_keyword="+this.keyword+"&_option="+this.option+"&_sort="+this.sortColumn+"&_mode="+this.mode+"&_pageSize="+this.pageSize;

		// generate previous_page
		String strPrvPage ="";
		int prev_page = this.page - 1;
		if( prev_page < 1 ){
			strPrvPage="";
		}else{
			strPrvPage="<a href='"+pageParam+"&_page="+prev_page+"'><-Pre</a>";
		}

		// generate pageList
		String strPageList ="";
		for(int i=0; i<totalPage; i++ ){
			if( i+1 == this.page )
				strPageList+="<b>["+(i+1)+"]</b>";
			else
				strPageList+="<a href='"+pageParam+"&_page="+(i+1)+"'>"+(i+1)+"</a> ";
		}

		// generate next_page
		String strNextPage = "";
		int next_page = this.page + 1;
		if( next_page > totalPage ){
			strNextPage="";
		}else{
			strNextPage="<a href='"+pageParam+"&_page="+next_page+"'>Next-></a>";
		}

		return strPrvPage+" "+strPageList+" "+strNextPage;
	}*/
	public String getLinkSort(String column){
		String imgUp="<img border=\"0\" src=\"images/up.gif\"/>";
		String imgDown="<img border=\"0\" src=\"images/down.gif\"/>";
		String img= null;
		String mode = null;
		if( this.mode!=null ){
			if( this.mode.equals("1") ){
				img=imgUp;
				mode="2";
			}else if( this.mode.equals("2") ){
				img=imgDown;
				mode="1";
			}else{
				mode="1";
				img=imgDown;
			}
		}else{
			mode="1";
		}

		String pageParam = this.pageUrl+"&cmd="+this.cmd+"&_keyword="+this.keyword+"&_option="+this.option+"&_sort="+column+"&_mode="+mode+"&_pageSize="+this.pageSize+"&_page="+this.page;
		return "<a href='"+pageParam+"'>"+column+"</a>"+img;
	}
	public String appendPageParam(String pageUrl){
		String pageParam = "&_keyword="+this.keyword+"&_option="+this.option+"&_sort="+this.sortColumn+"&_mode="+this.mode+"&_pageSize="+this.pageSize+"&_page="+this.page;
		if( pageUrl.indexOf('?')>-1 ){
			pageUrl+=pageParam;
		}else{
			pageUrl+="?"+pageParam;
		}
		return pageUrl;
	}
	private String getPageParam(){
		StringBuffer pageParam=new StringBuffer("");
		if( this.keyword!=null && !this.keyword.equals("") )
			pageParam.append("&_keyword="+this.keyword);
		if( this.option!=null && !this.option.equals("") )
			pageParam.append("&_option="+this.option);
		if( this.sortColumn!=null && !this.sortColumn.equals("") )
			pageParam.append("&s_ort="+this.sortColumn);
		if( this.mode!=null && !this.mode.equals("") )
			pageParam.append("&_mode="+this.mode);
		pageParam.append("&_pageSize="+this.pageSize+"&_page="+this.page);
		//String pageParam = "&keyword="+this.keyword+"&option="+this.option+"&sort="+this.sortColumn+"&mode="+this.mode+"&pageSize="+this.pageSize+"&page="+this.page;
		return pageParam.toString();
	}
	public String getPageStatus(){
		if( this.page*this.pageSize >= this.totalRow )
			return "รายการที่ "+(this.getFirstRowIndex()+1)+"-"+this.totalRow+" จาก "+this.totalRow+" รายการ";
		else
			return "รายการที่ "+(this.getFirstRowIndex()+1)+"-"+this.page*this.pageSize+" จาก "+this.totalRow+" รายการ";
	}
	public int getFirstRowIndex(){
		return ((this.page-1)*this.pageSize);
	}
	//   getter / setter
	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	/**
	 * @return  the pageSize
	 * @uml.property  name="pageSize"
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize  the pageSize to set
	 * @uml.property  name="pageSize"
	 */
	public void setPageSize(int pageSize) {
		if( pageSize< 0 )
			this.pageSize = Constants.DEFAULT_PAGE_SIZE;
		else if( pageSize>Constants.MAX_PAGE_SIZE)
			this.pageSize=Constants.MAX_PAGE_SIZE;
		else
			this.pageSize = pageSize;
		if( this.request != null ){
			this.request.setAttribute(PAGE_SIZE, new Integer(this.pageSize));
		}
		//this.pageSize = pageSize;
	}

	/**
	 * @return  the sortColumn
	 * @uml.property  name="sortColumn"
	 */
	public String getSortColumn() {
		return sortColumn;
	}

	/**
	 * @param sortColumn  the sortColumn to set
	 * @uml.property  name="sortColumn"
	 */
	public void setSortColumn(String sortColumn) {
		this.sortColumn = sortColumn;
	}

	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}

	public String getKeyword() {
		return keyword;
	}


	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getOption() {
		return option;
	}
	public int getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(int totalRow) {
		if( this.request != null )
			this.request.setAttribute(TOTAL_ROW, new Integer(totalRow));
		this.totalRow = totalRow;
	}
}