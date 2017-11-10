package leetcodequestions;

import java.util.HashMap;

import com.sun.javafx.webkit.KeyCodeMap.Entry;

public class Singlenum {

	
	int nums[]={2,3,5,6,2,3,7,5,6,10};
	int single;
	HashMap<Integer, Boolean> hm = new HashMap<>();
	int display(){
		for (int i = 0; i < nums.length; i++) {
			if(hm.containsKey(nums[i])){
				hm.put(nums[i], false);
			}
			else {
				hm.put(nums[i],true);
			}
		}
		 for (java.util.Map.Entry<Integer, Boolean> entry : hm.entrySet()) {
	            if (entry.getValue().equals(true)) {
	            	 single= entry.getKey();
	            }
	}
		 return single;
		
	}
	public static void main(String[] args) {
		Singlenum s = new Singlenum();
		s.display();

	}

}
