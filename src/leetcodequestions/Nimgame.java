package leetcodequestions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import com.sun.scenario.effect.Merge;

public class Nimgame {
	public int repeatedStringMatch(String A, String B) {
		Boolean flag=true;
		int count=0;
        if(!B.contains(A)){
        	System.out.println("-1");
        	 return -1;
        }
     
           
        else {
        	StringBuilder sb = new StringBuilder();
        	int j=0;
        	while(j<B.length()){
        		for(int i=0;i<A.length();i++){
        			if(A.charAt(i)==B.charAt(j)){
        				j++;
        				if(j==B.length())
        					break;
        			}
        			else {
        				for(int k=0;k<A.length();i++){
        					if(B.charAt(j)==A.charAt(k)){
        						break;
        					}
        					else if(k==A.length()-1)
        					return -1;
        				}
        				
        			}
        			
        		}
        		count++;
        	}
        	
        }
        System.out.println(count);
		return 0;
    }
	public static void main(String[] args) {
Nimgame n = new Nimgame();
int[] nums = {1,0,0,0,0,1};
String A="aaaa";
String B="aa";
n.repeatedStringMatch(A,B);


	}

}
