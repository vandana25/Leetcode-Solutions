package leetcodequestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeOfArray {
	 public static int findShortestSubArray(int[] nums) {
	        int max=Integer.MIN_VALUE;
	        int start=0;
	        int end=0;
	      
	        int diff=Integer.MAX_VALUE;
	        int result;
	      
	        int[] count = new int[10];
	        List<Integer> list = new ArrayList<>();
	        
	        HashMap<Integer, Integer> hm = new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	          if(hm.containsKey(nums[i])){
	        	  int value = hm.get(nums[i]);
	        	 
	        	  value++;
	        	  hm.put(nums[i], value);
	        	  if(max<value){
	        		  max=value;
	        	  }
	          }
	          else{
	        	  hm.put(nums[i], 1);
	          }
	        }
	       for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
	    	   if(max==entry.getValue()){
	    		   list.add(entry.getKey());
	    	   }
	       }
	       for(Integer frequentNum : list){
	    	   boolean flag =false;
	    	   for(int k =0;k<nums.length;k++){
		           
	                if(frequentNum==nums[k]){
	                     if(!flag){
	                          start=k;
	                    flag=true;
	                     }
	                    else{
	                        end=k;
	                    }	               
	            }	               	           
	        }
	    	   if(diff>end-start+1)
	    		   diff = end-start+1;
	       }
      
	        return diff;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {1,2};
findShortestSubArray(array);
	}

}
