package leetcodequestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstUniqueEle {
LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
String s = "loveleetcode";
Character ret;
int output=-1;
void display(){
	for (int i = 0; i < s.length(); i++) {
		
		if(hm.containsKey(s.charAt(i))){
			int count = hm.get(s.charAt(i));
			count++;
			hm.put(s.charAt(i), count);
		}
		else{
			hm.put(s.charAt(i), 1);
		}
	}
	if(!hm.isEmpty()){
		for(Entry<Character, Integer> entry : hm.entrySet()){
			int value=entry.getValue();
			if(value==1){
				ret=entry.getKey();
				break;
			}
		}
	}

	for (int i = 0; i < s.length(); i++) {
		if(ret==s.charAt(i)){
			output=i;
		}
	}
	System.out.println(output);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstUniqueEle f= new FirstUniqueEle();
//f.display();
Set<String> h = new HashSet<String>();
h.add("a");
h.add("a");
for (Iterator iterator = h.iterator(); iterator.hasNext();) {
	String string = (String) iterator.next();
	System.out.println(string);
}
	}

}
