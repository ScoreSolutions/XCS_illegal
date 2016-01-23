package com.ko.webapp.action;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ko.Constants;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
//import net.sf.jasperreports.engine.util.JRStyledTextParser;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class ReportAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ServletOutputStream servletOutputStream = response.getOutputStream();
		final String path2Jrxml = request.getSession().getServletContext().getRealPath(Constants.REPORT_PATH);
		String report = request.getParameter("__report");
		String formatt = request.getParameter("__formatt");
		
		/*response.setHeader("Cache-Control","no-cache"); //HTTP 1.1
    	response.setHeader("Pragma","no-cache"); //HTTP 1.0
    	response.setDateHeader ("Expires", 0); //prevents caching at the proxy server*/
    	
		try{
			byte[] bytes = null;
			ByteArrayOutputStream baos = null;// temp

			// get parameter
			Map<String, Object> reportParam = new HashMap<String, Object>();
			Enumeration paramNames = request.getParameterNames();
			String paramName = null;
			while(paramNames.hasMoreElements()){
				paramName = (String)paramNames.nextElement();
				String values[] = request.getParameterValues(paramName);
				if( values == null ){
					reportParam.put(paramName, null);
				}else if( values.length == 1 ){
					reportParam.put(paramName,values[0]);
				}else if( values.length >1 ){// array
					reportParam.put(paramName, values);
				}
			}
			String jasperReport = path2Jrxml+"/"+ report+".jasper";
			String jrxmlReport = path2Jrxml+"/"+ report+".jrxml";
			File jasperFile = new File(jasperReport);
			File jrxmlFile = new File(jrxmlReport);
			
			if( !jasperFile.exists() )
				throw new Exception(" Report Not Found ");
			
			//#1 compile report is work
			/*System.setProperty(
					"jasper.reports.compile.class.path",
					request.getSession().getServletContext().getRealPath("/WEB-INF/lib/jasperreports-3.7.2.jar")
						+ System.getProperty("path.separator")
						+ request.getSession().getServletContext().getRealPath("/WEB-INF/classes/"));
			System.setProperty(
					"jasper.reports.compile.temp",
					request.getSession().getServletContext().getRealPath("/WEB-INF/reports/"));
			
			if( jrxmlFile.exists() ){
				if (!jasperFile.exists() || (jasperFile.lastModified() <= jrxmlFile.lastModified()) ){
					//#1 compile
					JasperCompileManager.compileReportToFile(jrxmlReport);
				}
			}else
				throw new Exception(" Report Not Found ");*/
			
			//#2 fill
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,reportParam,db.getConnection());
			//JasperPrintManager.printReport(jasperPrint,true);
			//#3 export
			JRExporter exporter = null;

			if( formatt!=null && !formatt.trim().equals("") ){
				if( formatt.equalsIgnoreCase("pdf") ){
					//exporter = new ThaiJRPdfExporter();// for thai pdf
					exporter = new JRPdfExporter();
					//exporter.setParameter(JRPdfExporterParameter.FORCE_LINEBREAK_POLICY, true);
					exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint);
					baos = new ByteArrayOutputStream();// temp
				    exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,baos);
				    exporter.exportReport();// export
				    bytes = baos.toByteArray();
				    if (bytes != null && bytes.length > 0){
						response.setContentType("application/pdf");
						response.setHeader("Content-Disposition", "inline; filename=\""+report+".pdf\"");
						response.setContentLength(bytes.length);
						servletOutputStream.write(bytes, 0, bytes.length);
						servletOutputStream.flush();
						servletOutputStream.close();
				    }
				}else if( formatt.equalsIgnoreCase("excel") ){
					exporter = new JRXlsExporter();
					exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint);
					baos = new ByteArrayOutputStream();// temp
				    exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,baos);
				    exporter.exportReport();// export
				    bytes = baos.toByteArray();
				    if (bytes != null && bytes.length > 0){
				    	response.setContentType("application/vnd.ms-excel");
				    	//response.setContentType( "application/octet-stream" );// default
						response.setHeader("Content-Disposition", "inline; filename=\""+report+".xls\"");
						response.setContentLength(bytes.length);
						servletOutputStream.write(bytes, 0, bytes.length);
						servletOutputStream.flush();
						servletOutputStream.close();
				    }
				}else if( formatt.equalsIgnoreCase("doc") ){
					exporter = new JRDocxExporter();
					exporter.setParameter(JRExporterParameter.JASPER_PRINT,jasperPrint);
					baos = new ByteArrayOutputStream();// temp
				    exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,baos);
				    exporter.exportReport();// export
				    bytes = baos.toByteArray();
				    if (bytes != null && bytes.length > 0){
				    	response.setContentType("application/msword");
				    	response.setHeader("Content-Disposition", "inline; filename=\""+report+".docx\"");
				    	response.setContentLength(bytes.length);
				    	servletOutputStream.write(bytes, 0, bytes.length);
						servletOutputStream.flush();
						servletOutputStream.close();
				    }
				}else{
					response.setContentType("text/html");
					servletOutputStream.println("<html>");
					servletOutputStream.println("<body bgcolor=\"white\">");
					servletOutputStream.println("<span><b>Not Support Report Formatt</b></span>");
					servletOutputStream.println("</body>");
					servletOutputStream.println("</html>");
				}
				
				db.closedb();
				/*
				 	response.setContentType( "text/plain" );
				 	response.setContentType( "application/vnd.ms-excel" );
				 	response.setContentType( "application/ppt" );
				 	response.setContentType( "application/octet-stream" );// default

				    JExcelApiExporter, JRAbstractExporter, JRCsvExporter, JRDocxExporter,
				    JRGraphics2DExporter, JRHtmlExporter, JROdsExporter, JROdtExporter,
				    JROpenDocumentExporter, JRPdfExporter, JRPptxExporter, JRPrintServiceExporter,
				    JRRtfExporter, JRTextExporter, JRXhtmlExporter, JRXlsAbstractExporter,
				    JRXlsExporter, JRXlsxExporter, JRXml4SwfExporter, JRXmlExporter,
				    JRXmlssExporter
				*/
			}else{
				response.setContentType("text/html");
				servletOutputStream.println("<html>");
				servletOutputStream.println("<body bgcolor=\"white\">");
				servletOutputStream.println("<span><b>Please Enter __formatt</b></span>");
				servletOutputStream.println("</body>");
				servletOutputStream.println("</html>");
			}
		} catch (JRException e) {
			/*StringWriter stringWriter = new StringWriter();
			PrintWriter printWriter = new PrintWriter(stringWriter);
			e.printStackTrace(printWriter);
			response.setContentType("text/plain");
			response.getOutputStream().print(stringWriter.toString());*/
			e.printStackTrace();
			throw e;
		}catch (Exception e) {
			throw e;
		}
	}
	public void compile(HttpServletRequest request, HttpServletResponse response) throws Exception {
		final String path2Jrxml = request.getSession().getServletContext().getRealPath(Constants.REPORT_PATH);
		File reports = new File(path2Jrxml);
		String[] files = reports.list();
		for (int i = 0; i < files.length; i++) {
			String extension = files[i].substring(files[i].lastIndexOf(".")+1,files[i].length());
			if( extension.equalsIgnoreCase("jrxml") ){
				// compile
				try{
					log.debug(files[i]);
					JasperCompileManager.compileReportToFile(path2Jrxml+"/"+files[i]);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		response.getWriter().print("compile complete");
	}
	
	public void compileByReport(HttpServletRequest request, HttpServletResponse response, String repName) throws Exception {
		final String path2Jrxml = request.getSession().getServletContext().getRealPath(Constants.REPORT_PATH);
		//File reports = new File(path2Jrxml);
		//System.out.println(" dddddddd " + repName);
		//System.out.println(" dddddddd " + path2Jrxml);
		File reports = new File(path2Jrxml + "/" + repName);
		//System.out.println(" dddddddd " + reports.exists());
		//System.out.println(" ddddddddff " + reports.getName());
		//System.out.println(" dddddddd " + reports.getAbsoluteFile());
		//System.out.println(" dddddddd " + reports.isFile());
		
		request.setAttribute("path2Jrxml", path2Jrxml);
		
		if(reports.exists()){
			JasperCompileManager.compileReportToFile(path2Jrxml + "/" + reports.getName());
			System.out.println("Compile " + reports.getName());
		}else
			System.out.println("NoFile");
		
//		String[] files = reports.list();
//		for (int i = 0; i < files.length; i++) {
//			String extension = files[i].substring(files[i].lastIndexOf(".")+1,files[i].length());
//			if( extension.equalsIgnoreCase("jrxml") ){
//				// compile
//				try{
//					log.debug(files[i]);
//					JasperCompileManager.compileReportToFile(path2Jrxml+"/"+files[i]);
//				}catch(Exception e){
//					e.printStackTrace();
//				}
//			}
//		}
//		response.getWriter().print("compile complete");
	}
	
}
