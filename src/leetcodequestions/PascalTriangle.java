package leetcodequestions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	 public static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> finallist = new ArrayList<List<Integer>>();
	        List<Integer> currentlist = new ArrayList<Integer>();
	        currentlist.add(1);
	        int sum;
	        finallist.add(currentlist);
	        for(int i=2;i<=numRows;i++){
	        	int count=1;
	            currentlist.clear();
	            currentlist.add(1);
	            count++;
	            if(i==count)
	            currentlist.add(1);
	            else{
	            	 List<Integer> prevList = new ArrayList<Integer>();
	            	prevList=finallist.get(i-1);
	            	sum=prevList.get(count-1)+prevList.get(count);
	            	
	            }
	        }
			return finallist;
	    }
	public static void main(String[] args) {
		System.out.println(generate(5));
		 
	}
	
}
