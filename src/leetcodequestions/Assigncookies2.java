package leetcodequestions;

import java.util.Arrays;
import java.util.HashMap;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Assigncookies2 {
	int greed[]={1,2,4,3,5};
	int size[]={3,2,1};
	int assign=0;
	
	void display(){
		Arrays.sort(greed);
		Arrays.sort(size);
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for (int i = 0; i < greed.length; i++) {
				if(greed[i]<=size[assign]){
						assign++;
				}
			}
			
		System.out.println(assign);
		}
		
	
	
	
	public static void main(String[] args) {
		Assigncookies2 ac = new Assigncookies2();
		ac.display();

	}

}
