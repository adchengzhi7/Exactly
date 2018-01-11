
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;
public class SearchResult extends HttpServlet{
	
	public void init() {
		
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out= response.getWriter();
		String keyword = (request.getParameter("Search"));
		
		TestQuery gq = new TestQuery(keyword);
		Date d = new Date();
		gq.query();
		
		StringBuilder sb = new StringBuilder();
		 
		 for(int i=0; i<gq.list.getSize();i++){
			 Keyword k = gq.list.get(i);
			 if(i>0) sb.append(" ");
			
			 sb.append(k.toString());
		 }
		out.println(
				"<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" +  "<link rel=\"icon\" href=\"https://scontent.ftpe8-3.fna.fbcdn.net/v/t34.0-12/26755506_1795376657153227_1089066849_n.png?oh=be9ab6c1480da341e4b72da095bc3e17&oe=5A580A24\" type=\"image/png\" sizes=\"16x16\">" 
				+"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
				"    <title>"+keyword+"-Exactly</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n" + 
				"<style>\r\n" + 
				" @import \"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\";\r\n" + 
				" @media only screen and (max-width: 500px) {\r\n" + 
				"    body { ;}}" + 
				" .mb20 { margin-bottom: 20px; } \r\n" + 
				" \r\n" + 
				" hgroup { padding-left: 15px;  }\r\n" + 
				" hgroup h1 { font: 500 normal 1.625em \"Roboto\",Arial,Verdana,sans-serif; color: #2a3644; margin-top: 0; line-height: 1.15; }\r\n" + 
				" hgroup h2.lead { font: normal normal 1.125em \"Roboto\",Arial,Verdana,sans-serif; color: #2a3644; margin: 0; padding-bottom: 10px; }\r\n" + 
				" \r\n" + 
				" .search-result h3 { font: 500 normal 1.375em \"Roboto\",Arial,Verdana,sans-serif; margin-top: 0 !important; margin-bottom: 2px !important; }\r\n" + 
				" .search-result h3 > a, .search-result i { color: #248dc1 !important; }\r\n" + 
				" .search-result p { color:#2ecc71; font: normal normal 1.125em \"Roboto\",Arial,Verdana,sans-serif; } \r\n" + 
				"footer{\r\n" + 
				"   background-color: #ecf0f1;position: relative;bottom: 0;left: 0;right: 0;height: 35px;text-align: center;color: #000;}\r\n"+ 
				"footer p {\r\n" + 
				"    padding: 10.5px;\r\n" + 
				"    margin: 0px;\r\n" + 
				"    line-height: 100%;\r\n" + 
				"}"+
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>");
		out.println("     	<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 \" style=\"background-color: #ecf0f1;padding-left: 38px;padding-right:  30px;padding-top: 26px;padding-bottom: 2px;\"><center><img src=\"https://scontent-frx5-1.xx.fbcdn.net/v/t34.0-12/26754368_1157885154349092_2098012802_n.png?_nc_ad=z-m&amp;_nc_cid=0&amp;oh=529e6cbd1ea0623f869cf20311b6f3dc&amp;oe=5A56B88A\" alt=\"logo\" style=\"width: 50%;height: 100%;padding:2%;left:  0px;/* position: absolute; */\"><form action=\"/SearchResult\" style=\"position:relative\" method=\"GET\">\r\n" + 
				"				<div class=\"form-group\">\r\n" + 
				"\r\n" + 
				"      <input type=\"text\" style=\"width:75%\" class=\"form-control search\" placeholder=\"Search Something!\" name=\"Search\">\r\n" + 
				"      <div class=\"btn-group\">\r\n" + 
				" <button type=\"submit\" style=\"margin-top：2%；background: #ffffff;height: 36px;line-height: 22px;\" class=\"btn btn-default\">Exactly Search</button>"+ 
				"  \r\n" + 
				"</div>\r\n" + 
				"    </div>\r\n" + 
				"			</form></center></div>"
				+ "<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 \"><hgroup class=\"mb20\" style=\"margin-top:2%;text-align:center; \"><h4 style=\"margin:0;\">Search Results</h4><p class=\"\"><strong class=\"text-danger\">"+gq.list.getSize() +"</strong> results were found for the search for <strong class=\"text-danger\">"+keyword+"</strong></p></hgroup>"+
				" </div>"
				+ "<div class=\"container\"> "
				); 	
  
		
			out.println(sb.toString());
		Date done = new Date();
		long seconds = Math.abs((d.getTime()-done.getTime())/1000);
	      out.println("<p >Searching time is <b style=\"color:darkred;\">"+ seconds+"</b> seconds </p>");
		
		out.println("</div><footer>\r\n" + 
				"        <p>© 2017<a style=\"color:#0a93a6; text-decoration:none;\" href=\"file:///C:\\Users\\Alex\\Desktop\\dsppt\\dsPPT.ppsm\"> Exactly Team</a>, All rights reserved 2018-2019.</p>\r\n" + 
				"    </footer></body></html>");
		
	}
	
	
	public void showResult(){
		
		
	}
}
