

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		while (true) {
			String keyword = "ssd";
			TestQuery gq = new TestQuery(keyword);
			Date d = new Date();
	       System.out.println(d.toString());
			gq.query();
		
			
			Date done = new Date();
		       System.out.println(done.toString());
			
				
				
				
			
			

			
		}
		
	}

}
