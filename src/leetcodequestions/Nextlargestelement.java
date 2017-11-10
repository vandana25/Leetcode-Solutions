package leetcodequestions;

public class Nextlargestelement {
	 public static int[] nextGreaterElement(int[] findNums, int[] nums) {
	      int[] array = new int[findNums.length];
	        for(int i =0;i<findNums.length;i++){
	            int n=findNums[i];
	            for(int j=0;j<nums.length;j++){
	                if(n==nums[j]){
	                	if(j==nums.length-1){
	                		 array[i]=-1;
	                		 break;
	                	}
	                    for(int k=j+1;k<nums.length;k++){
	                        if(nums[k]>n){
	                            array[i]=nums[k];
	                            break;
	                        }
	                        else if(k==nums.length-1){
	                            array[i]=-1;
	                        }
	                    }
	                }
	            }
	        }
	        for(int i=0;i<array.length;i++){
	        	 System.out.println(array[i]);
	        }
	       
	       return array;
	    }
	 public static void main(String[] args) {
			int[] arr1= {4,1,2};
			int[] arr2 = {1,5,3,4,2,7};
			nextGreaterElement(arr1, arr2);
		}

}
