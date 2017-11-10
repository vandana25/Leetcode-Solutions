package leetcodequestions;

import java.util.Random;

public class Lol {
	
	public class Interval {
	      int start;
	      int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	  }
	  public static int findPoisonedDuration(int[] timeSeries, int duration) {
	        int count=0;
	        int seconds=1;
	        for(int j=0;j<timeSeries.length;j++){
	            if(seconds<=timeSeries[j]){
	                seconds=timeSeries[j]+duration;
	                count=count+duration;
	            }
	            else {
	                int num= timeSeries[j]+duration;
	                if(num>seconds){
	                	 int diff = seconds-num;
	                	 seconds=seconds+diff;
	                	 count+=diff;
	                }
	               
	                       
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,4,5,6};
		int[] array=nums;
		array[0]=4;
		
		int[] ran = new int[nums.length];
		Random random = new Random();
		
		for (int i = 0 ; i < nums.length ; i++) {
		    ran[i]=random.nextInt((nums.length-1 - 0) + 1) + 0;
		}
		for(int i=0;i<nums.length;i++){
			System.out.println(ran[i]);
		}
	//	findPoisonedDuration(nums, 6);

	}

}

  
 
