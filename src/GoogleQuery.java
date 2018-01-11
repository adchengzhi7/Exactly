//
//
//import java.io.IOException;
//import java.net.ConnectException;
//import java.net.SocketTimeoutException;
//import java.util.HashMap;
//import javax.net.ssl.SSLHandshakeException;
//import javax.net.ssl.SSLProtocolException;
//import org.jsoup.HttpStatusException;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//
//
//
//
//public class GoogleQuery {
//
//	public String searchKeyword;
//	public String url;
//	public String content;
//	
//	
//	public GoogleQuery(String searchKeyword) {
//		this.searchKeyword = searchKeyword;
//		this.url = "http://www.google.com/search?q="+searchKeyword+"&oe=utf8&num=10";
//	}
//	
//	public HashMap<String,WebTree> query() throws IOException{
//		HashMap<String,WebTree> retVal = new HashMap<String,WebTree>();
//		Document doc =Jsoup.connect(this.url).timeout(15000).ignoreContentType(true).get();
//		
//		Elements div_rcs = doc.select("div.rc");
//		
//		for (Element div_rc : div_rcs) {
//			try{
//			Element h3 =div_rc.select("h3.r").get(0);
//			String title= h3.text();
//			
//			Element cite = div_rc.select("a").first( );
//			String absHref = cite.attr("abs:href"); 
//			String citeUrl = absHref;
//			
//			//if(citeUrl.contains("http://")||citeUrl.contains("https://")) {
//				String[] tmp = citeUrl.split(" ");
//				String trueUrl = tmp[0];
//				WebPage rootPage =  new WebPage(trueUrl,title);
//				WebTree tree = 	new WebTree(rootPage);
//				query1(trueUrl);
//				retVal.put(trueUrl,tree);
//		//}
//			
//			}catch (SSLHandshakeException ssl){
//			System.out.println("");
//		}catch( HttpStatusException httpS) {
//			System.out.println("");
//		}catch(SSLProtocolException ptc) {
//			System.setProperty ("jsse.enableSNIExtension", "false");
//		}catch (ConnectException cC) {
//			System.out.println("");
//		}catch(SocketTimeoutException time) {
//			System.setProperty("http.proxyHost", "127.0.0.1");
//			System.setProperty("http.proxyPort", "8182");
//		}
//			
//			
//			Document doc1 =Jsoup.connect(url).timeout(15000).ignoreContentType(true).get();
//			HashMap<String,String> retVal1 = new HashMap<String,String>();
//			Elements links = doc1.select("a[href]");
//			for(Element link:links) {
//				String trueUrl1 = link.attr("abs:href");
//				String title = link.text();
//				if(title == "") {
//					System.out.println("null");
//				}else {
//				tree.root.children.get(1).addChild(new WebNode(new WebPage("http://www.cs.ucsb.edu/~vlab/stranger/","Stranger")));	
//				 retVal1.put(trueUrl1,title);
//			
//				}
//				 
//			}
//		
//		}
//		
//		return retVal;
//	
//		
//	}
//	
//	public HashMap<String,String> query1(String url) throws IOException{
//		
//		
//	
//		
//	
//		
////		for (Object key : retVal1.keySet()) {
////            System.out.println(key + " : " + retVal1.get(key));
////        }
//		
//		return retVal1;
//		
//	}
//
//	
//	   private static String trim(String s, int width) {
//	        if (s.length() > width)
//	            return s.substring(0, width-1) + ".";
//	        else
//	            return s;
//	    }
//}
//
