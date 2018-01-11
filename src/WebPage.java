

import java.io.IOException;
import java.util.ArrayList;

public class WebPage {
	public String URL;
	public String name;
	public String content;
	public WordCounter counter;
	public double score;
	
	
 public WebPage(String URL,String name){
	 this.URL = URL;
	 this.name = name;
	 this.counter = new WordCounter(URL);
 }
 
 public WebPage(String URL,String name,String content){
	 this.URL = URL;
	 this.name = name;
	 this.counter = new WordCounter(URL);
	 this.content = content;
 } 
 
 public void setScore(ArrayList<Keyword> keywords)throws IOException{
	 score = 0 ;
	 for (Keyword k :keywords ){
		score = score + counter.countKeyword(k.name)*k.weight;  
	 }
 }
 }
