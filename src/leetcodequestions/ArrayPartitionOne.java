package leetcodequestions;

import java.util.Arrays;

public class ArrayPartitionOne {

	 public static int arrayPairSum(int[] nums) {
	        int length = nums.length;
	        int sum=0;
	        Arrays.sort(nums);
	        for(int i=0;i<length;i=i+2){
	            sum= sum+Math.min(nums[i],nums[i+1]);
	        }
	            System.out.println(sum);
	        return sum;
	    }
	  public static void main(String[] args) {
	    int[] nums = {1,4,3,2};
	    arrayPairSum(nums);
	  }
	}