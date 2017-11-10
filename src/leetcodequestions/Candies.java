package leetcodequestions;

import java.util.HashSet;
import java.util.Set;

public class Candies {
	  public static int distributeCandies(int[] candies) {
	    //    Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(candies));
		  
	        HashSet<Integer> hs = new HashSet<>();
	        for(int i=0;i<candies.length;i++){
	        	hs.add(candies[i]);
	        }
	        if(hs.size()>=candies.length/2)
	        return candies.length/2;
	        else return hs.size()/2;
	    }

	public static void main(String[] args) {
		int[] arr = {1,1,1,1,2,2,2,3,3,3};
	
		System.out.println(	distributeCandies(arr));
	}

}
