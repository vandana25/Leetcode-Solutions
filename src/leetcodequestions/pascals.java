package leetcodequestions;

import java.util.ArrayList;
import java.util.List;

public class pascals {
	 public static List<List<Integer>> generate(int numRows) {
		 List<Integer> currentList =  new ArrayList<>();
		 List<List<Integer>> finalList = new ArrayList<>();
		 
		 List<Integer> prevList = new ArrayList<>();
		 prevList.add(1);
		 finalList.add(prevList);
		 prevList = new ArrayList<>();
		 prevList.add(0, 1);
		 prevList.add(1, 1);
		 finalList.add(prevList);		 
		 for(int i=2;i<numRows;i++){
			 currentList= new ArrayList<>();
			 currentList.add(0, 1);
			
			 int k =finalList.get(i-1).size()-1;
			 while(k>=1){
				 int m = finalList.get(i-1).get(k-1);
				 int n = finalList.get(i-1).get(k);
				 currentList.add(finalList.get(i-1).get(k-1)+finalList.get(i-1).get(k));
				 k--;
			 }
			 currentList.add(1);
			 finalList.add(currentList);
		//	System.out.println(currentList);
			//System.out.println(finalList);
			
		 }
		 
		return finalList;
		 
		 
	 }
	public static void main(String[] args) {
System.out.println(generate(7));
	}

}
