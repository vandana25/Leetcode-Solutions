package leetcodequestions;

import java.util.HashMap;

public class Ana {
	String s= "anagram";
String t= "nagaram";

	int sascii=0;
	int tascii=0;
	char ret;
    int scount=1;
    int tcount=1;
    Boolean flag=false;
//	Boolean flag=false;
	void display(){
		System.out.println("m hee");
		 HashMap<Character,Integer> hm = new HashMap<>();
	        if(s.length()==t.length()){
	             for(int i=0;i<s.length();i++){
	           if(!hm.containsKey(s.charAt(i))){
	               hm.put(s.charAt(i),scount);
	           }
	           else{
	               int newcount= hm.get(s.charAt(i));
	               newcount++;
	               hm.put(s.charAt(i),newcount);
	           }
	           
	       }
	        for(int i=0;i<t.length();i++){
	           if(!hm.containsKey(t.charAt(i))){
	              flag=false;
	              break;
	           }
	           else{
	               int newcount= hm.get(t.charAt(i));
	               if(newcount==1){
	                   hm.remove(t.charAt(i));
	               }
	               else{
	               newcount--;
	               hm.put(t.charAt(i),newcount);
	           /*    if(newcount==1){
	            	   hm.remove(t.charAt(i));
	               } */
	             
	               }
	           }
	           
	       }
	       if(hm.isEmpty()){
	           flag=true;
	       }

	        }
	        System.out.println(flag);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ana a =new Ana();
a.display();

	}

}

