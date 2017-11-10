package leetcodequestions;

public class MaxProduct {
	 public static int maxProduct(int[] nums) {
	        int max=0;
	        int[] prod = new int[nums.length];
	        max=nums[0];
	        prod[0]=max;
	        for(int i=1;i<nums.length;i++){
	            prod[i]= Math.max(nums[i], nums[i]*prod[i-1]);
	            max= Math.max(max, prod[i]);
	        }
	        return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={-2,-6,-2,-4};
			maxProduct(nums);
	}

}
