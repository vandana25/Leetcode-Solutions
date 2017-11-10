package leetcodequestions;

public class Ugly {
	
	  public static boolean isUgly(int num) {
	   
	             if(num%2!=0 || num%3!=0 || num%5!=5){
	                 return false;
	             }  
	             else{
	            	 if(num%2==0)
	            		 num=num/2;
	            	 else if(num%3==0)
	            		 num=num/3;
	            	 else if(num%5==0)
	            		 num=num/5;
	            	 return true || isUgly(num);
	             }
	        
	        
			
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isUgly(6));
	}

}
/* else if(num%3==0){
num=num/3;
}
    
else if(num%5==0){
     num=num/5;
} */