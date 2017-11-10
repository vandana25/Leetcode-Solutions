package leetcodequestions;

import java.util.HashMap;
import java.util.Map;

public class DiffinStrings {
String s = "";
String t = "y";
int count=1;
char ret;

char display(){
	HashMap<Character, Integer> hm = new HashMap<>();
	System.out.println(s.length());
	if((t.length()>=(s.length()))){
		for (int i = 0; i < t.length(); i++) {
			if(!hm.containsKey(t.charAt(i))){
				hm.put(t.charAt(i), count);
				count=1;
			}	
			else{
				int oldcount= hm.get(t.charAt(i));
				oldcount++;
				hm.put(t.charAt(i), oldcount);
			}
		}
		for (int i = 0; i < s.length(); i++) {
				int oldcount= hm.get(s.charAt(i));
				if(oldcount>=1){
					oldcount--;
					hm.put(s.charAt(i), oldcount);
				}
		}}

		else {
		    throw new StringIndexOutOfBoundsException();
		}
	for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
	   
	    Integer value = entry.getValue();
	    if (value==1){
	    	ret = entry.getKey();
	    }
	}
	System.out.println(ret);
		return ret;
    
	    }
	public static void main(String[] args) {
		DiffinStrings d = new DiffinStrings();
		d.display();

	}

}
