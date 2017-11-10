package leetcodequestions;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
        
        int[] newArr = new int[nums.length*2];
        int count=0;
       
            for(int i =0;i<nums.length;i++){
            newArr[i]=nums[i];
        
        }
        for(int i=0;i<nums.length;i++)
        newArr[i+nums.length]=nums[i];
        int start=nums.length-k;
        int end =nums.length+k+1;
        
        while(count<nums.length){
            for(int j=start;j<end;j++){
              nums[count]=newArr[j];
              count++;
          }  
          }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,2,5,6,7};
		rotate(nums, 5);
	}

}
