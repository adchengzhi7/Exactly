

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WordCounter {
 private String getUrl;
 private String inputData;
 
 public WordCounter(String getUrl){
	 this.getUrl=getUrl;
 }
 
 private String getInput() throws IOException{
	 String rtnValue="";
	 String row = null;
	 URL urlLink = new  URL (this.getUrl);
	 URLConnection connect =  urlLink.openConnection();
	 
	 InputStream input = connect.getInputStream();
	 BufferedReader reader= new BufferedReader(new InputStreamReader(input));
	 
	 while((row = reader.readLine())!= null){
		 rtnValue = rtnValue + row +"\n";
	 }
	 return rtnValue;
 }
 
 public int countKeyword(String keyword) throws IOException{
	 if(inputData == null){
		 inputData = getInput();
	 }
	 
		 inputData = inputData.toUpperCase();
		 keyword = keyword.toUpperCase();
		 
	int rtnNum = 0;
	int fromIndex= 0;
	int founded = -1;
		 
	while ((founded = inputData.indexOf(keyword, fromIndex))!=-1){
		rtnNum++;
		fromIndex = founded + keyword.length();
	}
	
	 
	 return rtnNum;
 }
}
