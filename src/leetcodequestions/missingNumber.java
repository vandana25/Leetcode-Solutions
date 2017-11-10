package leetcodequestions;

public class missingNumber {
	
	public int missingNumber(int[] nums) {

	    int xor = 0, i = 0;
		for (i = 0; i < nums.length; i++) {
			xor = xor ^ i ^ nums[i];
		}
		System.out.println(xor^i);
		return xor ^ i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		missingNumber m = new missingNumber();
		int[] array = {0,1,3,4,5};
		m.missingNumber(array);

	}

}
