package com.ko.webapp.util;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;


public class ExportUtil {
	public static void exportToExcel(List data,String report,HttpServletResponse response)throws Exception{
		response.setContentType("application/vnd.ms-excel");
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Disposition", "inline; filename=\""+report+".xls\"");
		response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
    	response.setHeader("Pragma","no-cache"); //HTTP 1.0
    	response.setDateHeader ("Expires", 0); //prevents caching at the proxy server
    	    	
    	PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border=1>");
        if( data.size()>0 ){
	        for( int i=0;i<data.size();i++ ){
	        	Map<String,Object> row = (Map<String,Object>)data.get(i);
	        	Iterator cols = row.keySet().iterator();
	        	// print header
	        	if( i==0 ){
	        		out.println("<tr>");
	        		while( cols.hasNext() ){
	        			out.println("<th>"+cols.next()+"</th>");
	        		}
	        		out.println("</tr>");
	        		cols = row.keySet().iterator();
	        	}
	        	// print detail
	        	out.println("<tr>");
	        	while( cols.hasNext() ){
	        		out.println("<td>"+row.get(cols.next())+"</td>");
	        	}
	        	out.println("</tr>");
	        }
        }else{
        	out.println("No Data Found");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
	}
	public static void exportToCsv(List data,String report,HttpServletResponse response)throws Exception{
		/*response.setHeader("Content-type","application/xls");
		response.setHeader("Content-disposition","inline; filename=nombre.csv");

		PrintWriter op = response.getWriter();

		String CSV = "Cola1" + "," + "Cola2" + "Cola3" + + "\r\n";
		       CSV += "Colb1" + "," + "Colb2" + "Colb3" + + "\r\n";
		       CSV += "Colc1" + "," + "Colc2" + "Colc3" + + "\r\n";

		op.write(CSV.getBytes());*/
	}
	public static void exportToText(List data,String report,HttpServletResponse response)throws Exception{
		/*
		res.setContentType ( "application/download" ) ;
		res.setHeader ( "Content-Disposition", "inline;filename=myFile.txt" ) ;
		res.setContentLength ( ( int ) file.length () ) ;
		    	 */
	}
}
