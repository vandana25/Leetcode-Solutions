package leetcodequestions;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MinMoves {
int nums[]={1,3,2};

void dis(){
	Arrays.sort(nums);
	
	for (int i = nums.length-1; i < 0; i--) {
		for (int j = nums.length-2; j < 0; j--) {
			nums[j]=nums[j]+1;
			
			if(nums[i]==nums[j]){
				nums[i-1]=nums[i-1]+1;
				nums[i]=nums[i]+1;
				break;
			}
		}
		break;
	}
	for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MinMoves mm = new MinMoves();
mm.dis();
	}

}
