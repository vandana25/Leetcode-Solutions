package leetcodequestions;

import java.util.HashMap;
import java.util.Map;

public class RansomeHashmap {
	String ransomNote="ab";
	String magazine="ba";
	int value=1;
	Boolean flag=true;
	void display(){
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < magazine.length(); i++) {
			if(!hm.containsKey(magazine.charAt(i))){
				hm.put(magazine.charAt(i), value);
			}
			else{
				 int newvalue=hm.get(magazine.charAt(i));
				 newvalue++;
				 hm.put(magazine.charAt(i), newvalue);
			}
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if(!hm.containsKey(ransomNote.charAt(i))){
				flag=false;
				break;
			}
			else {
				int oldcount = hm.get(ransomNote.charAt(i));
				oldcount--;
				hm.put(ransomNote.charAt(i), oldcount);
			}
		}
		if(flag){
			for (int i = 0; i < ransomNote.length(); i++) {
				if(!(hm.get(ransomNote.charAt(i))>=1)){
					flag=false;
					break;
				}
				else{
					flag=true;
				}
			}	
		}
		
		System.out.println(flag);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
RansomeHashmap r = new RansomeHashmap();
r.display();
	}

}
