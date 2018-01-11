

import java.util.ArrayList;



public class KeywordList {
	private ArrayList<Keyword> lst ;

	
	public KeywordList(){
		this.lst = new ArrayList<Keyword>();
		}
	
	public void add (Keyword k){
		lst.add(k);
		System.out.println(lst.size());
		//System.out.println("Done");
	}
	public void sort(){
		if(lst.isEmpty()){
			System.out.println("InvalidOperation");
	
		}else{
		this.lst=quickSort(this.lst);
		
		
		}
	}
	private ArrayList<Keyword> quickSort(ArrayList<Keyword> list){
		 if(list.size()<2){return list;}
		ArrayList<Keyword>result = new ArrayList<Keyword>();
		
		ArrayList<Keyword> lessList = new ArrayList<Keyword>();
		ArrayList<Keyword> equalList = new ArrayList<Keyword>();
		ArrayList<Keyword> greaterList = new ArrayList<Keyword>();
		
		int pivotIndex = list.size()/2;
		Keyword pivotKeyword = list.get(pivotIndex);
		
		for(int i=0;i<list.size();i++){
			Keyword k = list.get(i);
		if(k.weight>pivotKeyword.weight){
			greaterList.add(k);
		}else if(k.weight<pivotKeyword.weight){
			lessList.add(k);
		}else{
			equalList.add(k);
		}
		}
		result.addAll(quickSort(greaterList));
		result.addAll(equalList);
		result.addAll(quickSort(lessList));
		
		
	
		
	
		return result;
	}


	public void output() {
	 
		 
	 
		
	}
	public int getSize() {
	int listSize = lst.size() ;
		 return listSize;
	}
	public Keyword get(int i) {
		Keyword geted  = lst.get(i) ;
			 return geted;
		}
		

}
