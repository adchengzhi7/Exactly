

public class Keyword {
 
	public String name;
	public double weight;
	public String URL;
	public String content;
	
	
	public Keyword(String name,double weight){
		this.name = name;
		this.weight= weight;
	
	}
	public Keyword(String name,double weight,String url,String content){
		this.name = name;
		this.weight= weight;
		this.URL=url;
		this.content = content;
	
	}
	
	@Override
	public String toString(){
   String a =" <section class=\"col-xs-12 col-sm-6 col-md-12\">\r\n" + 
   		"		<article class=\"search-result row\">\r\n" + 
   		"			<div class=\"col-xs-12 col-sm-12 col-md-7 excerpet\">\r\n" + 
   		"				<h3><a href=\""+URL +"\" title=\""+name +"\">"+name +"</a></h3>\r\n" + 
   		"				<p style=\"margin:1px;\">"+URL +"</p>						\r\n" + 
   		"			<p style=\"color:black\">"+ content +"</p>\r\n" + 
   		"			</div>\r\n" + 
   	
   		"			<br>\r\n" + 
   		"		</article>\r\n" + 
   		"	</section>";
      return a ;		
	}
}
