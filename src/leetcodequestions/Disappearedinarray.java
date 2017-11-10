package leetcodequestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Disappearedinarray {
	int arr[]={4,3,2,7,8,2,3,1};
	int a;
	int max;
	int count=0;
	void display(){
		HashMap<Integer, Integer> hm = new HashMap<>();
		List<Integer> l = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			a=arr[i];
			if(i==0){
				max=a;
			}
			else {
				if(a>max){
					max=a;
				}
			}
			
			if(!hm.containsKey(a)){
				hm.put(a,1 );
			}
			else {
				count = hm.get(a);
				count++;
				hm.put(a, count);
			}
		}
		for ( Integer key : hm.keySet() ) {
		    l.add(key);
		}
		for (int i = 1; i <= max; i++) {
			
			l2.add(i);
		}
		for (int i = 0; i < l.size(); i++) {
			a=(int) l.toArray()[i];
			int index = l2.indexOf(a);
			l2.remove(index);
			
		}
		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Disappearedinarray d = new Disappearedinarray();
d.display();
	}

}
