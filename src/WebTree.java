

import java.io.IOException;
import java.util.ArrayList;



public class WebTree {
 public WebNode root;
 KeywordList lst1 = new KeywordList();
 
 public WebTree(WebPage rootPage){
	 this.root= new WebNode(rootPage);
 }
 
 public void setPostOrderScore(ArrayList<Keyword> keywords) throws IOException{
	 setPostOrderScore(root,keywords);
	 
 }
 private void setPostOrderScore(WebNode startNode,ArrayList<Keyword> keywords) throws IOException{
	for(WebNode child:startNode.children){
		setPostOrderScore(child,keywords);
	}
	 startNode.setNodeScore(keywords);
 }

 public void eularPrintTree(){
	 eularPrintTree(root);
	 
 }
 private void eularPrintTree(WebNode startNode){
	if(startNode == null) {}
	int nodeDepth = startNode.getDepth();
	if(nodeDepth > 1)System.out.print("\n" + repeat("\t",nodeDepth-1));
	System.out.print("(");
	System.out.print(startNode.webpage.name + "," + startNode.nodeScore);
	
//	for(WebNode child:startNode.children){
//		eularPrintTree(child);
//	
//	
//	}
	System.out.print(")");
	if(startNode.isLastChild()){System.out.print("\n" + repeat("\t",nodeDepth-2));}

	
 }
// public void print() {
//	 print(root);
// }
// 
// private void print(WebNode startNode) {
//	
//	 lst1.add(new Keyword(startNode.webpage.name,startNode.nodeScore,startNode.webpage.URL));
//	 
//	 
//	 
// }
 
 public String getStartNodeName() {
	 String startNode1 = root.webpage.name;
	 return startNode1;
	 
 }
 
 public  Double getStartNodeScore() {
	 Double startNode1 =root.nodeScore;
	 return startNode1;
 }

public  String getStartNodeURL() {
	 String startNode1 = root.webpage.URL;
	 return startNode1;
 }

public  String getStratNodeContent() {
	 String startNode1 = root.webpage.content;
	 return startNode1;
}

 
 private String repeat(String str, int repeat){
	 String retVal ="";
	 for(int i =0; i <repeat;i++){
		 retVal += str;
	 }
	 return retVal;
 }

}

