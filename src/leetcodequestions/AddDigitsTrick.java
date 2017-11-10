package leetcodequestions;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AddDigitsTrick {
	   public static int minStickers(String[] stickers, String target) {
		   int count=0;
		   int times=15;
		   Boolean flag=false;
		   List<Character>  myAlist = new ArrayList<Character>();
	        for(int i=0;i<target.length();i++){
	        	myAlist.add(target.charAt(i));
	        }
	        while(times>0){
	        	 for(int i=0;i<stickers.length;i++){
	  	           String s=stickers[i];
	  	           for(int j=0;j<s.length();j++){
	  	               if(myAlist.contains(s.charAt(j))){
	  	            	   myAlist.remove((Character)s.charAt(j));
	  	            	   flag=true;
	  	                   
	  	               }
	  	           }
	  	           if(flag==true){
	  	        	   count++;
	  	        	   flag=false;
	  	           }
	  	         if(myAlist.size()==0){
                	  
                	   System.out.println(count);
                       return count;
                   }
	  	       }
	        	 times--;
	        }
	      
	    
	       return -1;
	    }

	public static void main(String[] args) {
		
				
		String[] stickers = {"these","guess","about","garden","him"};
		String target = "atomher";
		minStickers(stickers, target);
		
		
		
		/*
		HashSet <String> newset = new HashSet <String>();
        
		   // populate hash set
		   newset.add("Learning"); 
		   newset.add("Easy");
		   newset.add("Simply"); 
		   Boolean flay = newset.contains("Easy");
		   System.out.println(flay);
		   for (String s : newset) {
			   newset.remove(s);
			//   System.out.println(newset);
			   
			}
			*/
	        }
	        
	

}
