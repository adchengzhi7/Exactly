import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
public class Exactly extends HttpServlet {
	
	

	public void init() {
	
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		  response.setContentType("text/html; charset=UTF-8");  
		  
		PrintWriter out= response.getWriter();
		out.println(
				"<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"     <link rel=\"icon\" href=\"https://scontent.ftpe8-3.fna.fbcdn.net/v/t34.0-12/26755506_1795376657153227_1089066849_n.png?oh=be9ab6c1480da341e4b72da095bc3e17&oe=5A580A24\" type=\"image/png\" sizes=\"16x16\"><meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
				"    <title>Exactly</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n" + 
				"<style>\r\n" + 
				"    .logo\r\n" + 
				"	\r\n" + 
				"	{\r\n" + 
				"		padding: 30px 0;\r\n" + 
				"	}\r\n" + 
				" @media only screen and (max-width: 500px) {\r\n" + 
				"    body { }}" +
				"	.search\r\n" + 
				"	{\r\n" + 
				"		padding: 20px 10px;\r\n" + 
				"	}\r\n" + 
				"	.search:focus\r\n" + 
				"	{\r\n" + 
				"		box-shadow:silver 0 5px 10px; \r\n" + 
				"		border-color: silver;\r\n" + 
				"	}\r\n" + 
				"	.form .btn-group\r\n" + 
				"	{\r\n" + 
				"		padding: 20px 0;\r\n" + 
				"	}\r\n" + 
				"	.btn-group>.btn\r\n" + 
				"	{\r\n" + 
				"		border-radius: 0;\r\n" + 
				"		margin: 0 10px;\r\n" + 
				"	}\r\n" + 
				".photosize{width:80%}"
				+ ".photosize2{width:75%;}"+
				"	.btn\r\n" + 
				"	{\r\n" + 
				"		background-color: #f2f2f2;\r\n" + 
				"		color: #757575;\r\n" + 
				"		font-weight: 850;\r\n" + 
				"	}\r\n" + 
				"</style>\r\n" + 
				"</head>\r\n" + 
				"<body>");
		out.println("  <div class=\"container\">\r\n" + 
				"                <div class=\"row\">\r\n" + 
				"                    <div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 \">\r\n" + 
				"                    <div class=\"row logo text-center\">\r\n" + 
				"                    <center><img class=\"photosize\" src=\"https://scontent-frx5-1.xx.fbcdn.net/v/t34.0-12/26696136_1794382917252601_83354144_n.png?_nc_ad=z-m&_nc_cid=0&oh=a48b3f1c8f3d07effdd51f123042e8b2&oe=5A57D360\" alt=\"logo\" ></center>\r\n" + 
				"                    <center><img class=\"photosize2 \" src=\"https://scontent-frx5-1.xx.fbcdn.net/v/t34.0-12/26754368_1157885154349092_2098012802_n.png?_nc_ad=z-m&_nc_cid=0&oh=529e6cbd1ea0623f869cf20311b6f3dc&oe=5A56B88A\" alt=\"logo\" ></center>	\r\n" + 
				"                        \r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"row form text-center\">");
		out.println("<form action =\"/SearchResult\" style=\"position:relative\" method=\"GET\">");
		out.println(" <input type=\"text\" style=\"width:100%\" class=\"form-control search\" placeholder=\"Search Something!\" name=\"Search\">");
		out.println(" <div class=\"btn-group\">\r\n" + 
				"              <button type=\"submit\" style=\"background: #ffffff;height: 36px;line-height: 22px;\" class=\"btn btn-default\">Exactly Search</button>" + 
				"              \r\n" + 
				"              \r\n" + 
				"            </div>\r\n" + 
				"                </div>\r\n" + 
				"                        </form>\r\n" + 
				"                        \r\n" + 
				"                    </div>\r\n" + 
				"                    \r\n" + 
				"                    \r\n" + 
				"                </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"    \r\n" + 
				"</body>\r\n" + 
				"</html>");
		
	}
	
}
