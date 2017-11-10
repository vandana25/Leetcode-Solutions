package leetcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class keyboard {
	    public String[] findWords(String[] words) {
	        Character[] arr1 = { 'q','w','e','r','t','y','u','i','o','p' };
	        Set<Character> set1 = new HashSet<>(Arrays.asList(arr1));
	        Character[] arr2 = { 'a','s','d','f','g','h','j','k','l' };
	        Set<Character> set2 = new HashSet<>(Arrays.asList(arr2));
	        Character[] arr3 = { 'z','x','c','v','b','n','m' };
	        Set<Character> set3 = new HashSet<>(Arrays.asList(arr3));
	        int i=0;
	        int k=0;
	       ArrayList list = new ArrayList<>();
	        String currentWord;
	        
	        while(i<words.length){
	            Boolean flag=false;
	            currentWord=words[i];
	            for(int j=0;j<currentWord.length();j++){
	             if(!set1.contains(currentWord.toLowerCase().charAt(j))){
	                flag=true;
	                break;
	             }
	            }
	            if(flag==true){
	            	flag=false;
	            for(int j=0;j<currentWord.length();j++){
	             if(!set2.contains(currentWord.toLowerCase().charAt(j))){
	                flag=true;
	                break;
	        
	             }
	            }    
	            }
	            if(flag==true){
	            	flag=false;
	            for(int j=0;j<currentWord.length();j++){
	             if(!set3.contains(currentWord.toLowerCase().charAt(j))){
	                   flag=true;
	                      break;
	             
	             
	            }}}
	            if(flag==false){
	            	list.add(currentWord);	      
	            }
	            
	            i++;
	        }
	        for(int l=0; l<list.size();l++)
	            System.out.println(list.get(l));
	      return (String[]) list.toArray(new String[list.size()] );
	    }
	   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
keyboard keyboard = new keyboard();
String[] s= {"Hello", "Alaska", "dad", "peace"};
keyboard.findWords(s);

	}

}
