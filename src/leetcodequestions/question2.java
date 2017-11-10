package leetcodequestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class question2 {
	int ret=0;
	int nums[]={1,1,2,2,8,5,8,10,10,5,77,77,11};
	
	void  getNumber(){
		for (int i = 0; i < nums.length; i++) {
			int first=nums[i];
			ret=ret^first;
		}
		System.out.println(ret);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
question2 q = new question2();
q.getNumber();
	}

}
