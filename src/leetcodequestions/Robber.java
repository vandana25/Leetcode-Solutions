package leetcodequestions;

public class Robber {
	  static int result=0;
	    public static int rob(int[] nums) {
	        int max=nums[0];
	       
	        for(int i=0;i<nums.length;i++){
	            if(max>=nums[i]){
	                  max=nums[i];
	            }
	        }
	        for(int j=0;j<nums.length;j++){
	            if(max==nums[j]){
	                nums[j]=-1;
	                nums[j-1]=-1;
	                nums[j+1]=-1;
	                result=result+max;
	            }
	        }
			return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,1,2,36,4,56,11};
		System.out.println(rob(array));
		
	}

}
